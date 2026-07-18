/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eg extends oh {
    static String field_s;
    int field_l;
    fs field_w;
    ln field_p;
    pf field_v;
    fs field_i;
    static qr field_u;
    int field_n;
    static String[] field_x;
    int[] field_j;
    static in field_q;
    int[] field_k;
    static int field_o;
    sd field_m;
    fs[] field_h;
    static int field_t;
    static String field_r;

    final static fb a(int param0, int param1) {
        return ea.field_b == null ? null : (fb) (Object) ea.field_b.a(65280, (long)param0);
    }

    public static void a(int param0) {
        field_q = null;
        field_u = null;
        if (param0 <= 5) {
            field_s = null;
        }
        field_r = null;
        field_x = null;
        field_s = null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        ((eg) this).field_n = ((eg) this).field_n + param0;
        ((eg) this).field_v.a((byte) -113, (oh) (Object) new ne(((eg) this).field_w, param1, param0, param2));
        int var5 = -83 / ((48 - param3) / 45);
    }

    final void a(int param0, int param1, int param2) {
        if (param1 != 14775) {
            field_r = null;
        }
        ((eg) this).field_n = ((eg) this).field_n + param2;
        ((eg) this).field_v.a((byte) -113, (oh) (Object) new ne(((eg) this).field_w, param0, param2, 0));
    }

    final static void a(int param0, wj param1, boolean param2) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        sl var7 = null;
        sl var8 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var7 = js.field_f;
            var8 = var7;
            var8.h(3, 255);
            var8.field_j = var8.field_j + 1;
            var4 = var8.field_j;
            var8.c(1, (byte) -86);
            var8.d(param1.field_h, 255);
            var8.d(param1.field_m, 255);
            var8.d(param1.field_j, 255);
            var8.e(11135, param1.field_q);
            var8.e(11135, param1.field_o);
            var8.e(11135, param1.field_p);
            var8.e(11135, param1.field_l);
            var8.c(param1.field_i.length, (byte) -104);
            var5 = 0;
            L1: while (true) {
              if (var5 >= param1.field_i.length) {
                int discarded$1 = var8.a(var4, -24);
                var8.b(-var4 + var8.field_j, (byte) 127);
                break L0;
              } else {
                var7.e(11135, param1.field_i[var5]);
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("eg.F(").append(3).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw r.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + true + ')');
        }
    }

    final static boolean a(byte param0) {
        if (param0 < 73) {
            eg.b(44, -8, 127);
        }
        return null != ck.field_a ? true : false;
    }

    final static tq c(int param0, int param1) {
        tq var2 = new tq(1, false);
        return var2;
    }

    final void a(byte param0, int[] param1) {
        try {
            if (param0 <= 35) {
                ((eg) this).field_j = null;
            }
            ((eg) this).field_k = param1;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "eg.J(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, mg param2, int param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ((eg) this).field_v.a((byte) -113, (oh) (Object) new ne(param2, param3, param0));
              ((eg) this).field_n = ((eg) this).field_n + param3;
              if (param1 == 0) {
                break L1;
              } else {
                ((eg) this).field_w = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("eg.G(").append(param0).append(',').append(param1).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param2 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw r.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param3 + ')');
        }
    }

    eg(ln param0, fs[] param1, int[] param2) {
        try {
            ((eg) this).field_h = param1;
            ((eg) this).field_p = param0;
            ((eg) this).field_j = (int[]) param2.clone();
            ((eg) this).field_w = ((eg) this).field_p.field_y;
            ((eg) this).field_v = new pf();
            ((eg) this).field_n = 0;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "eg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void b(int param0, int param1, int param2) {
        cn.field_w = param0;
        if (param2 != 0) {
            field_u = null;
        }
        dm.field_i = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = "Try changing the following settings:  ";
        field_x = new String[]{"<%0> Souls", "<%0> Ships", "<%0> Suns", "the <%0> Moon", "<%0> Peace", "the <%0> War", "<%0> Stars", "the <%0> People", "the <%0> Lights", "the <%0> Gate", "<%0> Empires", "<%0> Worlds", "<%0> Shadow", "<%0> Thunder", "the <%0> Storm", "<%0> Night", "<%0> Triumphs", "<%0> Steel", "<%0> Dreams"};
        field_r = "Players: <%0>/<%1>";
    }
}
