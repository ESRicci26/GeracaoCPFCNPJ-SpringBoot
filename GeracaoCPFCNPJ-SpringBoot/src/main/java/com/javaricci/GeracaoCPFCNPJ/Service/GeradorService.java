package com.javaricci.GeracaoCPFCNPJ.Service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class GeradorService {

    private final Random random = new Random();

    public String gerarCPF() {
        List<Integer> cpf = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            cpf.add(random.nextInt(10));
        }
        cpf.add(gerarDigito(cpf, new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2}));
        cpf.add(gerarDigito(cpf, new int[]{11, 10, 9, 8, 7, 6, 5, 4, 3, 2}));
        return formatarCPF(cpf);
    }

    public String gerarCNPJ() {
        List<Integer> cnpj = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            cnpj.add(random.nextInt(10));
        }
        cnpj.add(gerarDigito(cnpj, new int[]{5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2}));
        cnpj.add(gerarDigito(cnpj, new int[]{6, 5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2}));
        return formatarCNPJ(cnpj);
    }

    private int gerarDigito(List<Integer> numeros, int[] pesos) {
        int soma = 0;
        for (int i = 0; i < numeros.size(); i++) {
            soma += numeros.get(i) * pesos[i];
        }
        int resto = soma % 11;
        return resto < 2 ? 0 : 11 - resto;
    }

    private String formatarCPF(List<Integer> cpf) {
        return String.format("%d%d%d.%d%d%d.%d%d%d-%d%d",
                cpf.get(0), cpf.get(1), cpf.get(2),
                cpf.get(3), cpf.get(4), cpf.get(5),
                cpf.get(6), cpf.get(7), cpf.get(8),
                cpf.get(9), cpf.get(10));
    }

    private String formatarCNPJ(List<Integer> cnpj) {
        return String.format("%d%d.%d%d%d.%d%d%d/%d%d%d%d-%d%d",
                cnpj.get(0), cnpj.get(1),
                cnpj.get(2), cnpj.get(3), cnpj.get(4),
                cnpj.get(5), cnpj.get(6), cnpj.get(7),
                cnpj.get(8), cnpj.get(9), cnpj.get(10), cnpj.get(11),
                cnpj.get(12), cnpj.get(13));
    }
}
