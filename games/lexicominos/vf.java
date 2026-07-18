/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vf extends kd {
    private int field_j;
    private int field_t;
    int field_n;
    private int field_p;
    private int field_k;
    static aj field_m;
    private int field_q;
    int field_i;
    private String field_l;
    static int field_r;
    private int field_h;
    static String field_s;
    private int field_o;

    final void a(int param0, int param1, int param2) {
        ((vf) this).a(param2, (byte) 108, param0 * 24 + ((vf) this).field_k, ((vf) this).field_t);
        if (param1 != 32211) {
            ((vf) this).a(88, (byte) -108, 54, -70);
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        int var5 = 82 / ((param1 - 28) / 58);
        ((vf) this).field_q = ((vf) this).field_n;
        ((vf) this).field_t = param3;
        ((vf) this).field_p = ((vf) this).field_i;
        ((vf) this).field_k = param2;
        ((vf) this).field_o = ((vf) this).field_h;
        ((vf) this).field_j = param0;
    }

    final void a(int param0, boolean param1) {
        if (!(param0 != 0)) {
            ((vf) this).field_i = ((vf) this).field_t;
            ((vf) this).field_n = ((vf) this).field_k;
            ((vf) this).field_h = 0;
            return;
        }
        ((vf) this).field_h = ((vf) this).field_o * param0 / ((vf) this).field_j;
        ((vf) this).field_i = (((vf) this).field_p + -((vf) this).field_t) * param0 / ((vf) this).field_j + ((vf) this).field_t;
        ((vf) this).field_n = ((vf) this).field_k + param0 * (-((vf) this).field_k + ((vf) this).field_q) / ((vf) this).field_j;
        if (!param1) {
            field_s = null;
        }
    }

    public static void a(byte param0) {
        field_m = null;
        field_s = null;
    }

    final static void a(boolean param0, sh param1) {
        db var2 = new db(param1.a((byte) 127, "", "final_frame.jpg"), (java.awt.Component) (Object) ug.field_y);
        int var3 = var2.field_p;
        int var4 = var2.field_u;
        ja.b((byte) -126);
        nc.field_n = new db(var3, var4 * 3 / 4);
        try {
            nc.field_n.b();
            var2.b(0, 0);
            jg.field_m = new db(var3, -nc.field_n.field_u + var4);
            jg.field_m.b();
            var2.b(0, -nc.field_n.field_u);
            jg.field_m.field_w = nc.field_n.field_u;
            pd.a(-22949);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "vf.G(" + false + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, oj param1, int param2) {
        RuntimeException var4 = null;
        db var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        double var9 = 0.0;
        double var11 = 0.0;
        double var13 = 0.0;
        double var15 = 0.0;
        int var17 = 0;
        int var18 = 0;
        db var19 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var18 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (0 == ((vf) this).field_h) {
                eh.a(0, lg.field_c, param2 - -((vf) this).field_i, 0, ((vf) this).field_l, ((vf) this).field_n);
                break L1;
              } else {
                var19 = ne.field_b[((vf) this).field_h % 32];
                var4_ref = var19;
                var5 = (ia.field_H.field_p + -var19.field_p) / 2;
                var6 = ((vf) this).field_l.length();
                var7 = (double)((vf) this).field_h * 3.141592653589793 / 64.0;
                var9 = (double)(var5 + (((vf) this).field_i + param2));
                var11 = (double)(var5 + ((vf) this).field_n);
                var13 = 24.0 * Math.cos(var7);
                var15 = 24.0 * Math.sin(var7);
                var17 = 0;
                L2: while (true) {
                  if (var6 <= var17) {
                    break L1;
                  } else {
                    eb.a(29, param1, 0, var4_ref, ((vf) this).field_l.charAt(var17), (int)Math.round(var11), (int)Math.round(var9));
                    var11 = var11 + var15;
                    var9 = var9 + var13;
                    var17++;
                    continue L2;
                  }
                }
              }
            }
            if (param0 == 17517) {
              break L0;
            } else {
              ((vf) this).field_n = 31;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var4;
            stackOut_9_1 = new StringBuilder().append("vf.E(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param2 + ')');
        }
    }

    final static void a(kd param0, int param1, kd param2) {
        RuntimeException var3 = null;
        Object var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              if (null != param2.field_c) {
                param2.b((byte) -120);
                break L1;
              } else {
                break L1;
              }
            }
            param2.field_f = param0;
            param2.field_c = param0.field_c;
            param2.field_c.field_f = param2;
            param2.field_f.field_c = param2;
            if (param1 == 0) {
              break L0;
            } else {
              var4 = null;
              vf.a((kd) null, 14, (kd) null);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("vf.C(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param1).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
        }
    }

    vf(String param0, int param1, int param2, boolean param3) {
        try {
            ((vf) this).field_n = param2;
            ((vf) this).field_h = param3 ? 32 : 0;
            ((vf) this).field_l = param0;
            ((vf) this).field_i = param1;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "vf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = -1;
        field_s = "This password is part of your Player Name, and would be easy to guess";
        field_m = new aj(13, 0, 1, 0);
    }
}
