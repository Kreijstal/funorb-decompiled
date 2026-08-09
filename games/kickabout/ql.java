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
        int var3 = -123 % ((param1 - 43) / 55);
        if (!(0 == (param0 & 7))) {
            var2 = 8 - (7 & param0);
        }
        int var4 = var2 + param0;
        return var4;
    }

    final static void a(int param0) {
        String var2;
        if (param0 != 31663) {
          var2 = (String) null;
          ql.a((byte) 32, false, (String) null);
          np.field_Jb.a(new ha(), 3);
          return;
        } else {
          np.field_Jb.a(new ha(), 3);
          return;
        }
    }

    final static av a(String param0, int param1, int param2) {
        dq var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        dq stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3 = new dq();
              if (param2 == -13067) {
                break L1;
              } else {
                var4 = (String) null;
                ql.a(true, (String) null, (String) null, 68);
                break L1;
              }
            }
            ((av) ((Object) var3)).field_a = param1;
            ((av) ((Object) var3)).field_c = param0;
            stackIn_3_0 = (dq) (var3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3_ref);

            stackIn_6_1 = new StringBuilder().append("ql.E(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ')');
        }
        return (av) ((Object) stackIn_3_0);
    }

    public static void b(int param0) {
        String var2;
        field_a = null;
        field_d = null;
        field_b = null;
        if (param0 != 7) {
          var2 = (String) null;
          ql.a((String) null, 72, 40);
          field_c = null;
          return;
        } else {
          field_c = null;
          return;
        }
    }

    final static void a(byte param0, boolean param1, String param2) {
        try {
            eq.field_a = we.field_c;
            sq.field_G = param1 ? true : false;
            if (param0 <= 11) {
                String var4 = (String) null;
                ql.a(true, (String) null, (String) null, -26);
            }
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "ql.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
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
            throw nb.a((Throwable) ((Object) runtimeException), "ql.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static void a(byte param0, boolean param1, int[] param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 96) {
                break L1;
              } else {
                field_d = (String) null;
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
            stackIn_12_0 = (RuntimeException) (var3);

            stackIn_12_1 = new StringBuilder().append("ql.D(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
    }

    final static void a(Object[] param0, sr param1, byte param2) {
        try {
            oh.a(param1, -1 + param0.length, param0, 29921, 0);
            int var3_int = -63 % ((77 - param2) / 37);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "ql.G(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_a = new int[2];
        field_b = "Email address is unavailable";
        field_d = "Reload game";
        field_c = new String[]{"Last 30 mins", "Under 1 hr", "Under 2 hrs", "Under 3 hrs", "Under 4 hrs", "Under 6 hrs", "Under 12 hrs", "Under 24 hrs", "Under 2 days", "Under 3 days", "Over 3 days"};
    }
}
