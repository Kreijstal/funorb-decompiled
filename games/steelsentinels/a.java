/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class a {
    static int field_c;
    static mi field_a;
    static String field_f;
    static String field_e;
    static int[] field_h;
    static String[] field_d;
    static String[] field_g;
    static String field_b;

    final static boolean a(int param0) {
        if (param0 != 105) {
            return false;
        }
        return true;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        wk[] var5;
        if (param3 < 6) {
          a.a(false);
          var5 = eb.field_s;
          jm.a(param0, param2, var5, 1, param1, param4);
          return;
        } else {
          var5 = eb.field_s;
          jm.a(param0, param2, var5, 1, param1, param4);
          return;
        }
    }

    public static void c(int param0) {
        field_g = null;
        field_b = null;
        field_h = null;
        field_a = null;
        field_d = null;
        if (param0 < 63) {
          a.c(-126);
          field_e = null;
          field_f = null;
          return;
        } else {
          field_e = null;
          field_f = null;
          return;
        }
    }

    final static void a(byte param0, long param1) {
        if (0L < param1) {
          if ((param1 % 10L ^ -1L) != -1L) {
            tc.a(param1, (byte) 121);
            if (param0 > 116) {
              return;
            } else {
              field_b = (String) null;
              return;
            }
          } else {
            tc.a(-1L + param1, (byte) 118);
            tc.a(1L, (byte) 119);
            if (param0 > 116) {
              return;
            } else {
              field_b = (String) null;
              return;
            }
          }
        } else {
          return;
        }
    }

    abstract void b(java.awt.Component param0, boolean param1);

    final static void a(String param0, byte param1, int param2, String[] param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        String[] var5 = null;
        int var6 = 0;
        String[] var7 = null;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = SteelSentinels.field_G;
        try {
          L0: {
            var4_int = -56 % ((param1 - 65) / 35);
            jn.field_b = sn.field_p;
            if (255 == param2) {
              L1: {
                if (wi.field_y >= 13) {
                  stackIn_10_0 = 0;
                  break L1;
                } else {
                  stackIn_10_0 = 1;
                  break L1;
                }
              }
              vl.field_x = fn.a(stackIn_10_0 != 0, (byte) 69);
              var7 = (String[]) null;
              ki.a((byte) -54, (String[]) null);
              break L0;
            } else {
              if (100 > param2) {
                vl.field_x = fi.a(79, param0, param2);
                return;
              } else {
                if (105 < param2) {
                  vl.field_x = fi.a(79, param0, param2);
                  return;
                } else {
                  var5 = param3;
                  ki.a((byte) -101, var5);
                  vl.field_x = fc.a((byte) -76, param3);
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var4);

            stackIn_14_1 = new StringBuilder().append("a.H(");

            if (param0 == null) {
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
          throw ci.a((Throwable) ((Object) stackIn_15_0), stackIn_18_2 + ')');
        }
    }

    abstract int b(int param0);

    abstract void a(java.awt.Component param0, boolean param1);

    final static boolean a(boolean param0) {
        int stackIn_7_0 = 0;
        if (!param0) {
          L0: {
            if (qf.field_e != null) {
              stackIn_7_0 = 1;
              break L0;
            } else {
              if (!vb.field_e) {
                stackIn_7_0 = 0;
                break L0;
              } else {
                return true;
              }
            }
          }
          return stackIn_7_0 != 0;
        } else {
          return false;
        }
    }

    static {
        field_f = "Your game";
        field_e = "If you are not, please change your password to something more obscure!";
        field_h = new int[]{-1, 28, -1, 7};
        field_d = new String[]{"<col=00a2ff>Engineered <img=23></col>", "<col=00d000>Cost to engineer: <img=21><%0></col>", "<col=d32626>Cost to engineer: <img=22><%0></col>", "<col=d32626>Too advanced to engineer</col>"};
        field_b = "War Mode";
    }
}
