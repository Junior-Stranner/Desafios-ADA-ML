package br.com.judev.utlis;

public final class SegurancaUtils {
    private SegurancaUtils() {}

    public static boolean validarSenhaForte(String senha) {
        if (senha == null || senha.length() <= 8) {
            return false;
        }

        for (char c : senha.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }
}
