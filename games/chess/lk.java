/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lk {
    static int[] field_c;
    static int field_e;
    static String field_b;
    static java.awt.Frame field_a;
    static String field_f;
    static String field_d;

    final static void a(java.math.BigInteger param0, p param1, p param2, int param3, java.math.BigInteger param4) {
        if (param3 <= 53) {
            return;
        }
        try {
            ni.a(0, param1.field_l, param0, param2, -21105, param4, param1.field_o);
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) ((Object) runtimeException), "lk.C(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_f = null;
        field_c = null;
        field_b = null;
        field_a = null;
        field_d = null;
        if (param0 != 0) {
            java.math.BigInteger var2 = (java.math.BigInteger) null;
            lk.a((java.math.BigInteger) null, (p) null, (p) null, 110, (java.math.BigInteger) null);
        }
    }

    final static void a(String[] args, int param1, int param2, String param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Chess.field_G;
        try {
          g.field_a = kn.field_D;
          if (param1 != param2) {
            L0: {
              if (100 > param2) {
                break L0;
              } else {
                if (-106 <= (param2 ^ -1)) {
                  lg.field_a = a.a(args, param1 ^ -183);
                  return;
                } else {
                  break L0;
                }
              }
            }
            lg.field_a = sc.a(param3, param2, (byte) 90);
            return;
          } else {
            L1: {
              stackIn_4_0 = 18621;

              if (-14 >= (cn.field_f ^ -1)) {
                stackIn_5_0 = stackIn_4_0;
                stackIn_5_1 = 0;
                break L1;
              } else {
                stackIn_5_0 = stackIn_4_0;
                stackIn_5_1 = 1;
                break L1;
              }
            }
            lg.field_a = cf.b(stackIn_5_0, stackIn_5_1 != 0);
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var4);

            stackIn_14_1 = new StringBuilder().append("lk.A(");

            if (args == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L2;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L3;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_15_0), stackIn_18_2 + ')');
        }
    }

    final static boolean a(byte param0) {
        int stackIn_9_0 = 0;
        if (param0 >= 77) {
          if (null == pi.field_d) {
            if (!ve.k(-105)) {
              if (null == pj.field_h) {
                if (jj.b(7)) {
                  return true;
                } else {
                  return false;
                }
              } else {
                stackIn_9_0 = 1;
                return stackIn_9_0 != 0;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    static {
        field_c = new int[8192];
        field_e = 0;
        field_b = "The account name you use to access RuneScape and other Jagex.com games";
        field_f = "Show lobby chat from my friends";
        field_d = "Try again";
    }
}
