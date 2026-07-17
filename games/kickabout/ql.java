/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ql {
    static int[] field_a;
    static String field_d;
    static String[] field_c;
    static String field_b;

    final static int a(int param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        if (!(0 == (param0 & 7))) {
            var2 = 8 - (7 & param0);
        }
        int var4 = var2 + param0;
        return var4;
    }

    final static void a(int param0) {
        np.field_Jb.a((gn) (Object) new ha(), 3);
    }

    final static av a(String param0, int param1, int param2) {
        dq var3 = null;
        RuntimeException var3_ref = null;
        Object var4 = null;
        dq stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        dq stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              var3 = new dq();
              if (param2 == -13067) {
                break L1;
              } else {
                var4 = null;
                ql.a(true, (String) null, (String) null, 68);
                break L1;
              }
            }
            ((av) (Object) var3).field_a = param1;
            ((av) (Object) var3).field_c = param0;
            stackOut_2_0 = (dq) var3;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3_ref;
            stackOut_4_1 = new StringBuilder().append("ql.E(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 44 + param2 + 41);
        }
        return (av) (Object) stackIn_3_0;
    }

    public static void b(int param0) {
        field_a = null;
        field_d = null;
        field_b = null;
        field_c = null;
    }

    final static void a(byte param0, boolean param1, String param2) {
        RuntimeException runtimeException = null;
        Object var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              eq.field_a = we.field_c;
              if (!param1) {
                stackOut_2_0 = 0;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = 1;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              sq.field_G = stackIn_3_0 != 0;
              if (param0 > 11) {
                break L2;
              } else {
                var4 = null;
                ql.a(true, (String) null, (String) null, -26);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) runtimeException;
            stackOut_6_1 = new StringBuilder().append("ql.B(").append(param0).append(44).append(param1).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
    }

    final static void a(boolean param0, String param1, String param2, int param3) {
        if (param3 != 3960) {
            return;
        }
        try {
            ep.field_b = param2;
            ma.field_y = param1;
            ku.a(dh.field_g, 4, param0);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "ql.C(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 41);
        }
    }

    final static void a(byte param0, boolean param1, int[] param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 96) {
                break L1;
              } else {
                field_d = null;
                break L1;
              }
            }
            L2: {
              var3_int = al.a(false, (byte) 71);
              if (4 != vt.field_c.field_u) {
                break L2;
              } else {
                L3: {
                  sk.a(1, var3_int);
                  od.a(param2, var3_int, vt.field_c.field_R, 14839);
                  if (vu.field_Cb == -2) {
                    break L3;
                  } else {
                    if (!vt.field_c.field_R[vu.field_Cb].d(3511)) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                ig.a(param1, 16777215, var3_int);
                break L2;
              }
            }
            if (!u.field_c) {
              break L0;
            } else {
              kt.b((byte) -85);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("ql.D(").append(param0).append(44).append(param1).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
    }

    final static void a(Object[] param0, sr param1, byte param2) {
        try {
            oh.a(param1, -1 + param0.length, param0, 29921, 0);
            int var3_int = 0;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "ql.G(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + 124 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new int[2];
        field_b = "Email address is unavailable";
        field_d = "Reload game";
        field_c = new String[]{"Last 30 mins", "Under 1 hr", "Under 2 hrs", "Under 3 hrs", "Under 4 hrs", "Under 6 hrs", "Under 12 hrs", "Under 24 hrs", "Under 2 days", "Under 3 days", "Over 3 days"};
    }
}
