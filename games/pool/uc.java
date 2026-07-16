/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uc {
    static vh field_b;
    static vh field_a;

    public static void b(byte param0) {
        if (param0 != 112) {
            uc.a((byte) 104);
        }
        field_b = null;
        field_a = null;
    }

    final static boolean a(char param0, byte param1) {
        if (Character.isISOControl(param0)) {
          return false;
        } else {
          if (!td.a(param0, (byte) 5)) {
            L0: {
              if (param1 == -51) {
                break L0;
              } else {
                boolean discarded$2 = uc.a(80);
                break L0;
              }
            }
            L1: {
              if (param0 == 45) {
                break L1;
              } else {
                if (param0 == 160) {
                  break L1;
                } else {
                  if (param0 == 32) {
                    break L1;
                  } else {
                    if (95 != param0) {
                      return false;
                    } else {
                      return true;
                    }
                  }
                }
              }
            }
            return true;
          } else {
            return true;
          }
        }
    }

    final static boolean a(int param0) {
        if (param0 > -95) {
            return false;
        }
        return true;
    }

    final static void a(byte param0) {
        tn var1 = (tn) (Object) cb.field_e.b(-1);
        int var2 = 34 % ((-56 - param0) / 50);
        if (var1 == null) {
            var1 = new tn();
        }
        var1.a(qh.field_l, qh.field_f, qh.field_b, qh.field_g, -95, qh.field_j, qh.field_d, qh.field_c);
        nf.field_S.b((byte) 83, (ma) (Object) var1);
    }

    final static double[][] a(boolean param0, double[][][] param1) {
        int var3_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var2 = 0;
        if (!param0) {
            uc.a((byte) 42);
        }
        for (var3_int = 0; param1.length > var3_int; var3_int++) {
            var2 = var2 + param1[var3_int].length;
        }
        double[][] var3 = new double[var2][6];
        int var4 = 0;
        for (var5 = 0; param1.length > var5; var5++) {
            for (var6 = 0; var6 < param1[var5].length; var6++) {
                int incrementValue$0 = var4;
                var4++;
                var3[incrementValue$0] = param1[var5][var6];
            }
        }
        return var3;
    }

    static {
    }
}
