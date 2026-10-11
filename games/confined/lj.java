/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lj {
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

    final static void a(int[] param0, int param1, int param2, int param3) {
        param2 = param1 + param2 - 7;
        while (param1 < param2) {
          param0[param1++] = param3;
          param0[param1++] = param3;
          param0[param1++] = param3;
          param0[param1++] = param3;
          param0[param1++] = param3;
          param0[param1++] = param3;
          param0[param1++] = param3;
          param0[param1++] = param3;
        }
        param2 += 7;
        while (param1 < param2) {
          param0[param1++] = param3;
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

    final static void a(byte[] param0, int param1, int param2, byte param3) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        param2 = param1 + param2 - 7;
        while (param1 < param2) {
          incrementValue$0 = param1;
          param1++;
          param0[incrementValue$0] = (byte)param3;
          incrementValue$1 = param1;
          param1++;
          param0[incrementValue$1] = (byte)param3;
          incrementValue$2 = param1;
          param1++;
          param0[incrementValue$2] = (byte)param3;
          incrementValue$3 = param1;
          param1++;
          param0[incrementValue$3] = (byte)param3;
          incrementValue$4 = param1;
          param1++;
          param0[incrementValue$4] = (byte)param3;
          incrementValue$5 = param1;
          param1++;
          param0[incrementValue$5] = (byte)param3;
          incrementValue$6 = param1;
          param1++;
          param0[incrementValue$6] = (byte)param3;
          incrementValue$7 = param1;
          param1++;
          param0[incrementValue$7] = (byte)param3;
        }
        param2 += 7;
        while (param1 < param2) {
          incrementValue$8 = param1;
          param1++;
          param0[incrementValue$8] = (byte)param3;
        }
    }
}
