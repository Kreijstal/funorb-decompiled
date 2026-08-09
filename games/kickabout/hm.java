/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hm extends tm {
    static java.awt.Color field_A;
    static byte[] field_G;
    static String field_E;
    static int field_I;
    static int[][] field_D;
    static String field_C;
    static String field_H;

    final static void a(boolean param0, int param1) {
        bl.a(param0, false, (byte) -57);
        if (param1 >= -89) {
            field_E = (String) null;
        }
    }

    final static int a(byte param0, int param1) {
        if (param0 <= 104) {
            field_A = (java.awt.Color) null;
            return param1 * 3;
        }
        return param1 * 3;
    }

    hm(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(int param0, java.awt.Canvas param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            lr.a((java.awt.Component) ((Object) param1), -63);
            ao.a(false, (java.awt.Component) ((Object) param1));
            if (param0 <= -102) {
              if (null != ag.field_f) {
                ag.field_f.a((byte) -68, (java.awt.Component) ((Object) param1));
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var2);

            stackIn_8_1 = new StringBuilder().append("hm.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L1;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L1;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final li a(byte param0, li[] param1) {
        RuntimeException var3 = null;
        li stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 84) {
                break L1;
              } else {
                field_A = (java.awt.Color) null;
                break L1;
              }
            }
            stackIn_3_0 = new li(he.a((byte) -13, (int[]) (param1[0].field_d)));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("hm.C(").append(param0).append(',');

            if (param1 == null) {
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
          throw nb.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static boolean a(byte param0, String param1) {
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
            var2_int = -120 / ((-16 - param0) / 48);
            var3 = (CharSequence) ((Object) param1);
            stackIn_1_0 = kd.field_w.equals(mo.a(0, var3));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var2);

            stackIn_4_1 = new StringBuilder().append("hm.D(").append(param0).append(',');

            if (param1 == null) {
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
          throw nb.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    final static void a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        sm var5 = null;
        ni var6 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var4 = Kickabout.field_G;
        try {
          L0: {
            var5 = (sm) ((Object) ia.field_d.g(24009));
            L1: while (true) {
              if (var5 == null) {
                var3 = -93 % ((param0 - 72) / 43);
                var6 = (ni) ((Object) lw.field_g.g(24009));
                L2: while (true) {
                  if (var6 == null) {
                    break L0;
                  } else {
                    gv.a(param1, 112, var6);
                    var6 = (ni) ((Object) lw.field_g.c(33));
                    continue L2;
                  }
                }
              } else {
                mp.a(50, param1, var5);
                var5 = (sm) ((Object) ia.field_d.c(33));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var2), "hm.A(" + param0 + ',' + param1 + ')');
        }
    }

    final static mc h(int param0) {
        if (param0 != 3) {
            String var2 = (String) null;
            hm.a((byte) 22, (String) null);
            return (mc) ((Object) new vi());
        }
        return (mc) ((Object) new vi());
    }

    public static void g(int param0) {
        field_G = null;
        field_H = null;
        field_E = null;
        field_C = null;
        field_D = (int[][]) null;
        if (param0 != 10040319) {
          field_D = (int[][]) null;
          field_A = null;
          return;
        } else {
          field_A = null;
          return;
        }
    }

    static {
        field_E = "buyout at max";
        field_A = new java.awt.Color(10040319);
        field_C = "Congratulations to <%0>, beating <%1> <%2> to <%3> winning the tournament!";
        field_H = "Loading extra data";
    }
}
