/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gt {
    static je[] field_b;
    static wk[] field_c;
    static String field_g;
    static int field_i;
    static String field_a;
    static int[] field_d;
    static wk field_e;
    static String field_h;
    static String[] field_f;

    final static boolean a(String param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        CharSequence var3 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2_int = -112 % ((param1 - 19) / 63);
            var3 = (CharSequence) ((Object) param0);
            stackIn_1_0 = ft.field_p.equals(k.a(var3, false));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var2);

            stackIn_4_1 = new StringBuilder().append("gt.B(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    final static rn b(String param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String var4 = null;
        rn var5 = null;
        rn stackIn_4_0 = null;
        rn stackIn_8_0 = null;
        rn stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == null) {
                break L1;
              } else {
                if (0 != param0.length()) {
                  var2_int = param0.indexOf('@');
                  if (var2_int == -1) {
                    stackIn_8_0 = hv.field_N;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    L2: {
                      var3 = param0.substring(0, var2_int);
                      var4 = param0.substring(var2_int + 1);
                      if (param1 == -24) {
                        break L2;
                      } else {
                        field_f = (String[]) null;
                        break L2;
                      }
                    }
                    var5 = ng.a(var3, 15026);
                    if (var5 != null) {
                      stackIn_14_0 = (rn) (var5);
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      return ew.a(var4, (byte) 104);
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            stackIn_4_0 = tn.field_ab;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var2);

            stackIn_17_1 = new StringBuilder().append("gt.C(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L3;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return stackIn_14_0;
          }
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        field_g = null;
        field_b = null;
        field_f = null;
        field_e = null;
        field_d = null;
        if (param0 != 494) {
          return;
        } else {
          field_h = null;
          return;
        }
    }

    final static int[] a(int param0, vh param1) {
        int[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        vh var5 = null;
        int[] var6 = null;
        int[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var6 = new int[6];
            var2 = var6;
            var3 = 0;
            L1: while (true) {
              if (var6.length <= var3) {
                L2: {
                  if (param0 == -2) {
                    break L2;
                  } else {
                    var5 = (vh) null;
                    gt.a(115, (vh) null);
                    break L2;
                  }
                }
                stackIn_7_0 = (int[]) (var2);
                break L0;
              } else {
                var6[var3] = param1.k(param0 + 2);
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var2_ref);

            stackIn_10_1 = new StringBuilder().append("gt.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        return stackIn_7_0;
    }

    static {
        field_g = "This coat of arms became unlocked at <%0>. All parts of it are available to add to your own coat of arms.";
        field_a = "This game option is only available to members.";
        field_d = new int[128];
        field_h = "Checking";
    }
}
