/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hf extends ca {
    int field_j;
    static hj[] field_g;
    static int field_i;
    ca field_f;
    static tl field_l;
    bb field_h;
    static int field_k;

    final static void a(boolean param0, java.awt.Component param1) {
        try {
            param1.setFocusTraversalKeysEnabled(param0);
            param1.addKeyListener(ad.field_b);
            param1.addFocusListener(ad.field_b);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "hf.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(kc param0, int param1, int param2, int param3, int param4, boolean param5, int param6, hj[] param7, kc param8, int param9, int param10, int param11, int param12, hj[] param13, int param14) {
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var15 = null;
        ki var16 = null;
        hj[] var17 = null;
        try {
          L0: {
            L1: {
              var17 = (hj[]) null;
              ok.a(param2, param9, param4, param13, param11, param6, param3, -1, 0, lf.field_e, he.field_C, param7, param14, mf.field_c, 480, (hj[]) null, param12, 0, param1, param0, param8);
              hb.a(param5, (byte) -128);
              if (param10 >= 5) {
                break L1;
              } else {
                var16 = (ki) null;
                hf.a((v) null, (ki) null, 124, 16);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var15 = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var15);

            stackIn_5_1 = new StringBuilder().append("hf.A(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_8_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');

            if (param7 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

            if (param8 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',');

            if (param13 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_6_0), stackIn_15_2 + ',' + param14 + ')');
        }
    }

    final static void a(v param0, ki param1, int param2, int param3) {
        try {
            ol.field_h = ok.a((byte) 84) * param2 / param3;
            fb.a(-2, param1);
            fh.a(param1, -237);
            f.a(param1, -17763);
            OrbDefence.d(false);
            ta.j(0);
            ji.field_b = -ol.field_h + 0;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "hf.C(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void c(boolean param0) {
        field_g = null;
        if (!param0) {
            return;
        }
        field_l = null;
    }

    hf(bb param0, ca param1) {
        try {
            this.field_h = param0;
            this.field_j = param0.j();
            this.field_f = param1;
            this.field_h.g(ck.field_f * this.field_j + 128 >> -732362456);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "hf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_i = 0;
        field_l = new tl();
    }
}
