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
        this.a(param2, (byte) 108, param0 * 24 + this.field_k, this.field_t);
        if (param1 != 32211) {
            this.a(88, (byte) -108, 54, -70);
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        int var5 = 82 / ((param1 - 28) / 58);
        this.field_q = this.field_n;
        this.field_t = param3;
        this.field_p = this.field_i;
        this.field_k = param2;
        this.field_o = this.field_h;
        this.field_j = param0;
    }

    final void a(int param0, boolean param1) {
        if (!(-1 != (param0 ^ -1))) {
            this.field_i = this.field_t;
            this.field_n = this.field_k;
            this.field_h = 0;
            return;
        }
        this.field_h = this.field_o * param0 / this.field_j;
        this.field_i = (this.field_p + -this.field_t) * param0 / this.field_j + this.field_t;
        this.field_n = this.field_k + param0 * (-this.field_k + this.field_q) / this.field_j;
        if (!param1) {
            field_s = (String) null;
        }
    }

    public static void a(byte param0) {
        kd var2 = null;
        if (param0 >= -14) {
          var2 = (kd) null;
          vf.a((kd) null, -20, (kd) null);
          field_m = null;
          field_s = null;
          return;
        } else {
          field_m = null;
          field_s = null;
          return;
        }
    }

    final static void a(boolean param0, sh param1) {
        db var2 = new db(param1.a((byte) 127, "", "final_frame.jpg"), (java.awt.Component) ((Object) ug.field_y));
        int var3 = var2.field_p;
        int var4 = var2.field_u;
        ja.b((byte) -126);
        nc.field_n = new db(var3, var4 * 3 / 4);
        if (param0) {
            return;
        }
        try {
            nc.field_n.b();
            var2.b(0, 0);
            jg.field_m = new db(var3, -nc.field_n.field_u + var4);
            jg.field_m.b();
            var2.b(0, -nc.field_n.field_u);
            jg.field_m.field_w = nc.field_n.field_u;
            pd.a(-22949);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "vf.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
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
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var18 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (0 == this.field_h) {
                  break L2;
                } else {
                  var19 = ne.field_b[this.field_h % 32];
                  var4_ref = var19;
                  var5 = (ia.field_H.field_p + -var19.field_p) / 2;
                  var6 = this.field_l.length();
                  var7 = (double)this.field_h * 3.141592653589793 / 64.0;
                  var9 = (double)(var5 + (this.field_i + param2));
                  var11 = (double)(var5 + this.field_n);
                  var13 = 24.0 * Math.cos(var7);
                  var15 = 24.0 * Math.sin(var7);
                  var17 = 0;
                  L3: while (true) {
                    if (var6 <= var17) {
                      if (var18 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    } else {
                      eb.a(29, param1, 0, var4_ref, this.field_l.charAt(var17), (int)Math.round(var11), (int)Math.round(var9));
                      var11 = var11 + var15;
                      var9 = var9 + var13;
                      var17++;
                      if (var18 != 0) {
                        break L1;
                      } else {
                        continue L3;
                      }
                    }
                  }
                }
              }
              eh.a(0, lg.field_c, param2 - -this.field_i, 0, this.field_l, this.field_n);
              break L1;
            }
            if (param0 == 17517) {
              break L0;
            } else {
              this.field_n = 31;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var4);
            stackOut_12_1 = new StringBuilder().append("vf.E(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param2 + ')');
        }
    }

    final static void a(kd param0, int param1, kd param2) {
        RuntimeException var3 = null;
        kd var4 = null;
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
              var4 = (kd) null;
              vf.a((kd) null, 14, (kd) null);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var3);
            stackOut_6_1 = new StringBuilder().append("vf.C(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param1).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
    }

    vf(String param0, int param1, int param2, boolean param3) {
        try {
            this.field_n = param2;
            this.field_h = param3 ? 32 : 0;
            this.field_l = param0;
            this.field_i = param1;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "vf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_r = -1;
        field_s = "This password is part of your Player Name, and would be easy to guess";
        field_m = new aj(13, 0, 1, 0);
    }
}
