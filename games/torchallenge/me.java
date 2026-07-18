/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class me implements j {
    static String[] field_a;
    static String field_d;
    static ka field_e;
    private int field_h;
    static boolean field_b;
    static int field_g;
    private eg field_c;
    private int field_f;

    public static void a(int param0) {
        field_e = null;
        field_a = null;
        field_d = null;
    }

    final static void a(boolean param0) {
        try {
            Exception var1 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            L0: {
              if (param0) {
                break L0;
              } else {
                me.a(false);
                break L0;
              }
            }
            L1: {
              if (cf.field_d == null) {
                break L1;
              } else {
                try {
                  L2: {
                    cf.field_d.a(0L, 0);
                    cf.field_d.a(-4573, id.field_b.field_q, id.field_b.field_m, 24);
                    decompiledRegionSelector0 = 0;
                    break L2;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var1 = (Exception) (Object) decompiledCaughtException;
                    decompiledRegionSelector0 = 1;
                    break L3;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  id.field_b.field_q = id.field_b.field_q + 24;
                  return;
                } else {
                  break L1;
                }
              }
            }
            id.field_b.field_q = id.field_b.field_q + 24;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public me() {
        ((me) this).field_c = oe.field_g;
        ((me) this).field_h = 1;
        ((me) this).field_f = 1;
    }

    me(eg param0, int param1, int param2) {
        try {
            ((me) this).field_h = param1;
            ((me) this).field_f = param2;
            ((me) this).field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) (Object) runtimeException, "me.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public final void a(ee param0, int param1, int param2, byte param3, boolean param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var11 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (param0.field_w) {
                  break L2;
                } else {
                  if (!param0.c(115)) {
                    stackOut_5_0 = 2188450;
                    stackIn_6_0 = stackOut_5_0;
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              stackOut_4_0 = 3249872;
              stackIn_6_0 = stackOut_4_0;
              break L1;
            }
            L3: {
              var6_int = stackIn_6_0;
              if (param3 == 97) {
                break L3;
              } else {
                ((me) this).field_h = 7;
                break L3;
              }
            }
            L4: {
              int discarded$1 = ((me) this).field_c.a("<u=" + Integer.toString(var6_int, 16) + ">" + param0.field_v + "</u>", param2 - -param0.field_m, param0.field_i + param1, param0.field_p, param0.field_l, var6_int, -1, ((me) this).field_h, ((me) this).field_f, ((me) this).field_c.field_x + ((me) this).field_c.field_K);
              if (!param0.c(94)) {
                break L4;
              } else {
                L5: {
                  var7 = ((me) this).field_c.a(param0.field_v);
                  var8 = ((me) this).field_c.field_x - -((me) this).field_c.field_K;
                  var9 = param2 + param0.field_m;
                  if (((me) this).field_h == 2) {
                    var9 = var9 + (param0.field_p - var7);
                    break L5;
                  } else {
                    if (((me) this).field_h == 1) {
                      var9 = var9 + (-var7 + param0.field_p >> 1);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                }
                L6: {
                  var10 = param1 + param0.field_i;
                  if (((me) this).field_f == 2) {
                    var10 = var10 + (-var8 + param0.field_l);
                    break L6;
                  } else {
                    if (((me) this).field_f == 1) {
                      var10 = var10 + (param0.field_l + -var8 >> 1);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                }
                jc.a((byte) -120, var9 - 2, var8, 4 + var7, var10 - -2);
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var6;
            stackOut_21_1 = new StringBuilder().append("me.A(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L7;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L7;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = 0;
        field_a = new String[]{"Henhui", "Ziren", "Damen"};
    }
}
