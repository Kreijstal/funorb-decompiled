/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class br {
    static oo field_a;
    static String[] field_b;
    static mp field_g;
    static je field_e;
    static boolean[] field_f;
    static kl field_d;
    static int[] field_c;

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        if (param0 <= 11) {
            br.a(65, (byte) 100);
        }
        field_c = null;
        field_d = null;
        field_g = null;
        field_e = null;
        field_f = null;
    }

    final static boolean a(String param0, boolean param1) {
        String var2 = null;
        Exception var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            try {
              L1: {
                if (!hd.field_n.startsWith("win")) {
                  stackIn_4_0 = 0;
                  decompiledRegionSelector0 = 0;
                  break L1;
                } else {
                  L2: {
                    if (param0.startsWith("http://")) {
                      break L2;
                    } else {
                      if (param0.startsWith("https://")) {
                        break L2;
                      } else {
                        stackIn_8_0 = 0;
                        decompiledRegionSelector0 = 1;
                        break L1;
                      }
                    }
                  }
                  L3: {
                    var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                    if (param1) {
                      break L3;
                    } else {
                      br.a(-60, (byte) -36);
                      break L3;
                    }
                  }
                  var3 = 0;
                  L4: while (true) {
                    if (var3 >= param0.length()) {
                      Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param0 + "\"");
                      stackIn_19_0 = 1;
                      decompiledRegionSelector0 = 3;
                      break L1;
                    } else {
                      if (0 == (var2.indexOf((int) param0.charAt(var3)) ^ -1)) {
                        stackIn_16_0 = 0;
                        decompiledRegionSelector0 = 2;
                        break L1;
                      } else {
                        var3++;
                        continue L4;
                      }
                    }
                  }
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              stackIn_21_0 = 0;
              return stackIn_21_0 != 0;
            }
            if (decompiledRegionSelector0 == 0) {
              decompiledRegionSelector1 = 0;
              break L0;
            } else {
              if (decompiledRegionSelector0 == 1) {
                decompiledRegionSelector1 = 1;
                break L0;
              } else {
                if (decompiledRegionSelector0 == 2) {
                  decompiledRegionSelector1 = 2;
                  break L0;
                } else {
                  decompiledRegionSelector1 = 3;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L5: {
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var2_ref2);

            stackIn_24_1 = new StringBuilder().append("br.C(");

            if (param0 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L5;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L5;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector1 == 1) {
            return stackIn_8_0 != 0;
          } else {
            if (decompiledRegionSelector1 == 2) {
              return stackIn_16_0 != 0;
            } else {
              return stackIn_19_0 != 0;
            }
          }
        }
    }

    final static void a(byte param0) {
        vo.a(-10232);
        g.b(-6145);
        if (param0 != -97) {
            field_e = (je) null;
        }
    }

    final static cf a(int param0, byte param1) {
        if (param1 > -4) {
            field_f = (boolean[]) null;
        }
        return cd.field_a[param0];
    }

    final static void a(ka param0, int param1, int param2, ka param3) {
        try {
            pf.field_d = param1;
            sc.field_b = param0;
            ir.field_h = param3;
            pt.c(qn.field_l / 2, qn.field_g / 2, 75);
            uc.a(param0.field_L + param0.field_z, param0.field_z, param3.field_z, false, param3.field_L + param3.field_z);
            if (param2 != 333) {
                field_f = (boolean[]) null;
            }
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "br.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_f = new boolean[112];
        field_c = new int[]{276, 215, 253, 292, 329, 288, 333, 353, 244, 182, 122, 160, 126, 147, 189, 68};
    }
}
