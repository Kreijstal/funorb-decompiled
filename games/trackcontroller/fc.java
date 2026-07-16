/*
 * Decompiled by CFR-JS 0.4.0.
 */
class fc {
    static String field_a;
    static String field_g;
    fc field_e;
    static String field_f;
    static String[] field_c;
    static int field_d;
    fc field_h;
    long field_b;

    final static boolean c(int param0) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        if (param0 >= 2) {
          L0: {
            L1: {
              if (-11 < (rl.field_N ^ -1)) {
                break L1;
              } else {
                if (ge.field_D) {
                  break L1;
                } else {
                  if (gh.a(3100)) {
                    break L1;
                  } else {
                    stackOut_5_0 = 1;
                    stackIn_7_0 = stackOut_5_0;
                    break L0;
                  }
                }
              }
            }
            stackOut_6_0 = 0;
            stackIn_7_0 = stackOut_6_0;
            break L0;
          }
          return stackIn_7_0 != 0;
        } else {
          return false;
        }
    }

    final boolean b(int param0) {
        if (param0 != 10000536) {
            fc.a(20, 32, 14, (byte) -49, 34);
        }
        if (null == ((fc) this).field_e) {
            return false;
        }
        return true;
    }

    final static String a(boolean param0, boolean param1, boolean param2, int param3) {
        int var4 = 0;
        if (!(!param1)) {
            var4 += 4;
        }
        if (param3 != 12105912) {
            return null;
        }
        if (!(!param0)) {
            var4 += 2;
        }
        if (param2) {
            var4++;
        }
        return field_c[var4];
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = TrackController.field_F ? 1 : 0;
        if (param3 > -14) {
            field_a = null;
        }
        ll.a(param4, param1, param0 + 1, 10000536);
        ll.a(param4, param2 + param1, param0 + 1, 12105912);
        int var5 = 1;
        int var6 = param2;
        if (!(var5 + param1 >= ll.field_b)) {
            var5 = ll.field_b - param1;
        }
        if (!(param1 + var6 <= ll.field_g)) {
            var6 = -param1 + ll.field_g;
        }
        for (var7 = var5; var7 < var6; var7++) {
            var8 = 152 - -(var7 * 48 / param2);
            var9 = var8 << 1811903240 | var8 << -231469744 | var8;
            ll.field_i[param4 + (param1 - -var7) * ll.field_d] = var9;
            ll.field_i[param0 + (ll.field_d * (var7 + param1) - -param4)] = var9;
        }
    }

    final static void a(boolean param0) {
        if (param0) {
            field_a = null;
        }
        if (!(null == sb.field_b)) {
            sb.field_b.f();
        }
        if (g.field_x != null) {
            g.field_x.f();
        }
    }

    final static boolean b(boolean param0, String param1) {
        String var2 = null;
        Exception var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_2_0 = 0;
        var4 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            if (uf.field_b.startsWith("win")) {
              L1: {
                if (!param0) {
                  break L1;
                } else {
                  field_a = null;
                  break L1;
                }
              }
              L2: {
                if (param1.startsWith("http://")) {
                  break L2;
                } else {
                  if (param1.startsWith("https://")) {
                    break L2;
                  } else {
                    stackOut_8_0 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    return stackIn_9_0 != 0;
                  }
                }
              }
              var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
              var3 = 0;
              L3: while (true) {
                if (var3 >= param1.length()) {
                  Process discarded$2 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param1 + "\"");
                  stackOut_16_0 = 1;
                  stackIn_17_0 = stackOut_16_0;
                  break L0;
                } else {
                  if (-1 != var2.indexOf((int) param1.charAt(var3))) {
                    var3++;
                    continue L3;
                  } else {
                    stackOut_13_0 = 0;
                    stackIn_14_0 = stackOut_13_0;
                    return stackIn_14_0 != 0;
                  }
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = (Exception) (Object) decompiledCaughtException;
          return false;
        }
        return stackIn_17_0 != 0;
    }

    public static void b(byte param0) {
        field_g = null;
        field_f = null;
        field_a = null;
        if (param0 != 118) {
            field_d = 105;
        }
        field_c = null;
    }

    final void a(int param0) {
        if (param0 >= -22) {
            ((fc) this).field_b = 48L;
        }
        if (null == ((fc) this).field_e) {
            return;
        }
        ((fc) this).field_e.field_h = ((fc) this).field_h;
        ((fc) this).field_h.field_e = ((fc) this).field_e;
        ((fc) this).field_h = null;
        ((fc) this).field_e = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Log in / Register";
        field_f = "Waiting for sound effects";
        field_c = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
        field_d = 0;
    }
}
