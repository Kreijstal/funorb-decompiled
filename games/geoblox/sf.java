/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sf {
    final static void a(int[] param0, int param1, int param2) {
        param2 = param1 + param2 - 7;
        while (param1 < param2) {
            param0[param1++] = 0;
            param0[param1++] = 0;
            param0[param1++] = 0;
            param0[param1++] = 0;
            param0[param1++] = 0;
            param0[param1++] = 0;
            param0[param1++] = 0;
            param0[param1++] = 0;
        }
        param2 += 7;
        while (param1 < param2) {
            param0[param1++] = 0;
        }
    }

    final static void a(byte[] param0, int param1, byte[] param2, int param3, int param4) {
        if (param0 != param2) {
            param4 = param4 + param1;
            param4 -= 7;
            while (param1 < param4) {
                param2[param3++] = param0[param1++];
                param2[param3++] = param0[param1++];
                param2[param3++] = param0[param1++];
                param2[param3++] = param0[param1++];
                param2[param3++] = param0[param1++];
                param2[param3++] = param0[param1++];
                param2[param3++] = param0[param1++];
                param2[param3++] = param0[param1++];
            }
            param4 += 7;
            while (param1 < param4) {
                param2[param3++] = param0[param1++];
            }
            return;
        }
        if (param1 == param3) {
            return;
        }
        if (param3 <= param1) {
            param4 = param4 + param1;
            param4 -= 7;
            while (param1 < param4) {
                param2[param3++] = param0[param1++];
                param2[param3++] = param0[param1++];
                param2[param3++] = param0[param1++];
                param2[param3++] = param0[param1++];
                param2[param3++] = param0[param1++];
                param2[param3++] = param0[param1++];
                param2[param3++] = param0[param1++];
                param2[param3++] = param0[param1++];
            }
            param4 += 7;
            while (param1 < param4) {
                param2[param3++] = param0[param1++];
            }
            return;
        }
        if (param3 >= param1 + param4) {
            param4 = param4 + param1;
            param4 -= 7;
            while (param1 < param4) {
                param2[param3++] = param0[param1++];
                param2[param3++] = param0[param1++];
                param2[param3++] = param0[param1++];
                param2[param3++] = param0[param1++];
                param2[param3++] = param0[param1++];
                param2[param3++] = param0[param1++];
                param2[param3++] = param0[param1++];
                param2[param3++] = param0[param1++];
            }
            param4 += 7;
            while (param1 < param4) {
                param2[param3++] = param0[param1++];
            }
            return;
        }
        param4--;
        param1 = param1 + param4;
        param3 = param3 + param4;
        param4 = param1 - param4;
        param4 += 7;
        while (param1 >= param4) {
            param2[param3--] = param0[param1--];
            param2[param3--] = param0[param1--];
            param2[param3--] = param0[param1--];
            param2[param3--] = param0[param1--];
            param2[param3--] = param0[param1--];
            param2[param3--] = param0[param1--];
            param2[param3--] = param0[param1--];
            param2[param3--] = param0[param1--];
        }
        param4 -= 7;
        while (param1 >= param4) {
            param2[param3--] = param0[param1--];
        }
    }

    final static void a(int[] param0, int param1, int[] param2, int param3, int param4) {
        if (param0 != param2) {
            param4 = param4 + param1;
            param4 -= 7;
            while (param1 < param4) {
                param2[param3++] = param0[param1++];
                param2[param3++] = param0[param1++];
                param2[param3++] = param0[param1++];
                param2[param3++] = param0[param1++];
                param2[param3++] = param0[param1++];
                param2[param3++] = param0[param1++];
                param2[param3++] = param0[param1++];
                param2[param3++] = param0[param1++];
            }
            param4 += 7;
            while (param1 < param4) {
                param2[param3++] = param0[param1++];
            }
            return;
        }
        if (param1 == param3) {
            return;
        }
        if (param3 <= param1) {
            param4 = param4 + param1;
            param4 -= 7;
            while (param1 < param4) {
                param2[param3++] = param0[param1++];
                param2[param3++] = param0[param1++];
                param2[param3++] = param0[param1++];
                param2[param3++] = param0[param1++];
                param2[param3++] = param0[param1++];
                param2[param3++] = param0[param1++];
                param2[param3++] = param0[param1++];
                param2[param3++] = param0[param1++];
            }
            param4 += 7;
            while (param1 < param4) {
                param2[param3++] = param0[param1++];
            }
            return;
        }
        if (param3 >= param1 + param4) {
            param4 = param4 + param1;
            param4 -= 7;
            while (param1 < param4) {
                param2[param3++] = param0[param1++];
                param2[param3++] = param0[param1++];
                param2[param3++] = param0[param1++];
                param2[param3++] = param0[param1++];
                param2[param3++] = param0[param1++];
                param2[param3++] = param0[param1++];
                param2[param3++] = param0[param1++];
                param2[param3++] = param0[param1++];
            }
            param4 += 7;
            while (param1 < param4) {
                param2[param3++] = param0[param1++];
            }
            return;
        }
        param4--;
        param1 = param1 + param4;
        param3 = param3 + param4;
        param4 = param1 - param4;
        param4 += 7;
        while (param1 >= param4) {
            param2[param3--] = param0[param1--];
            param2[param3--] = param0[param1--];
            param2[param3--] = param0[param1--];
            param2[param3--] = param0[param1--];
            param2[param3--] = param0[param1--];
            param2[param3--] = param0[param1--];
            param2[param3--] = param0[param1--];
            param2[param3--] = param0[param1--];
        }
        param4 -= 7;
        while (param1 >= param4) {
            param2[param3--] = param0[param1--];
        }
    }

    final static void a(Object[] param0, int param1, Object[] param2, int param3, int param4) {
        if (param0 != param2) {
            param4 = param4 + param1;
            param4 -= 7;
            while (param1 < param4) {
                param2[param3++] = param0[param1++];
                param2[param3++] = param0[param1++];
                param2[param3++] = param0[param1++];
                param2[param3++] = param0[param1++];
                param2[param3++] = param0[param1++];
                param2[param3++] = param0[param1++];
                param2[param3++] = param0[param1++];
                param2[param3++] = param0[param1++];
            }
            param4 += 7;
            while (param1 < param4) {
                param2[param3++] = param0[param1++];
            }
            return;
        }
        if (param1 == param3) {
            return;
        }
        if (param3 <= param1) {
            param4 = param4 + param1;
            param4 -= 7;
            while (param1 < param4) {
                param2[param3++] = param0[param1++];
                param2[param3++] = param0[param1++];
                param2[param3++] = param0[param1++];
                param2[param3++] = param0[param1++];
                param2[param3++] = param0[param1++];
                param2[param3++] = param0[param1++];
                param2[param3++] = param0[param1++];
                param2[param3++] = param0[param1++];
            }
            param4 += 7;
            while (param1 < param4) {
                param2[param3++] = param0[param1++];
            }
            return;
        }
        if (param3 >= param1 + param4) {
            param4 = param4 + param1;
            param4 -= 7;
            while (param1 < param4) {
                param2[param3++] = param0[param1++];
                param2[param3++] = param0[param1++];
                param2[param3++] = param0[param1++];
                param2[param3++] = param0[param1++];
                param2[param3++] = param0[param1++];
                param2[param3++] = param0[param1++];
                param2[param3++] = param0[param1++];
                param2[param3++] = param0[param1++];
            }
            param4 += 7;
            while (param1 < param4) {
                param2[param3++] = param0[param1++];
            }
            return;
        }
        param4--;
        param1 = param1 + param4;
        param3 = param3 + param4;
        param4 = param1 - param4;
        param4 += 7;
        while (param1 >= param4) {
            param2[param3--] = param0[param1--];
            param2[param3--] = param0[param1--];
            param2[param3--] = param0[param1--];
            param2[param3--] = param0[param1--];
            param2[param3--] = param0[param1--];
            param2[param3--] = param0[param1--];
            param2[param3--] = param0[param1--];
            param2[param3--] = param0[param1--];
        }
        param4 -= 7;
        while (param1 >= param4) {
            param2[param3--] = param0[param1--];
        }
    }
}
