/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fn extends mk {
    static String field_f;
    static w field_g;
    private java.nio.ByteBuffer field_h;

    final byte[] a(int param0) {
        if (param0 != 256) {
            return null;
        }
        byte[] var3 = new byte[((fn) this).field_h.capacity()];
        byte[] var2 = var3;
        java.nio.Buffer discarded$0 = ((fn) this).field_h.position(0);
        java.nio.ByteBuffer discarded$1 = ((fn) this).field_h.get(var3);
        return var3;
    }

    final static void a(ji param0, ji param1, ji param2) {
        RuntimeException var4 = null;
        pi[] var5 = null;
        pi[][] var6 = null;
        int[][] var7 = null;
        int var8 = 0;
        int var9 = 0;
        pi[] var10 = null;
        ck var11 = null;
        int var11_int = 0;
        ck var12 = null;
        int var13 = 0;
        pi[] var14 = null;
        ck var15 = null;
        int[][] var16 = null;
        ck var17 = null;
        ck var18 = null;
        int[][] var19 = null;
        int[][] var20 = null;
        int[][] var21 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var13 = client.field_A ? 1 : 0;
        try {
          L0: {
            c.field_m = bj.a(112, param0, "commonui", "frame_top");
            g.field_O = bj.a(112, param0, "commonui", "frame_bottom");
            jm.field_q = id.a(param0, "jagex_logo_grey", "commonui", 8192);
            rm.field_a = bj.a(112, param0, "commonui", "button");
            tl.field_u = ac.a(0, "commonui", "validation", param0);
            bj.field_f = (mm) (Object) vi.a(param2, param0, "commonui", (byte) 110, "arezzo12");
            hh.field_e = (mm) (Object) vi.a(param2, param0, "commonui", (byte) 93, "arezzo14");
            ec.field_p = (mm) (Object) vi.a(param2, param0, "commonui", (byte) -121, "arezzo14bold");
            var17 = new ck(param1.a(0, "", "button.gif"), (java.awt.Component) (Object) jh.field_b);
            pi discarded$1 = hn.a("dropdown", param0, "commonui", (byte) 73);
            var5 = t.a("screen_options", param0, false, "commonui");
            df.field_Y = new pi[4];
            jj.field_e = new pi[4];
            aa.field_c = new pi[4];
            var6 = new pi[][]{df.field_Y, jj.field_e, aa.field_c};
            var21 = new int[4][];
            var20 = var21;
            var19 = var20;
            var16 = var19;
            var7 = var16;
            var7[0] = var5[0].field_l;
            var8 = 1;
            L1: while (true) {
              if (var8 >= var21.length) {
                var8 = var5[0].field_k[0];
                var21[2][var8] = 16777215;
                var21[1][var8] = 2394342;
                var21[3][var8] = 4767999;
                var9 = 0;
                L2: while (true) {
                  if (var9 >= 3) {
                    var9 = var17.field_H;
                    uh.a(-9074);
                    var17.a();
                    hk.c(0, 0, hk.field_j, hk.field_i);
                    var15 = new ck(var9, var9);
                    var18 = var15;
                    var18.a();
                    var17.e(0, 0);
                    var11 = new ck(var9, var9);
                    var11.a();
                    var17.e(var9 - var17.field_I, 0);
                    var12 = new ck(var17.field_I - 2 * var9, var9);
                    var12.a();
                    var17.e(-var9, 0);
                    mk.a((byte) -5);
                    rm.field_a = new ck[]{var15, var12, var11};
                    break L0;
                  } else {
                    var14 = var6[var9];
                    var10 = var14;
                    var11_int = 0;
                    L3: while (true) {
                      if (var14.length <= var11_int) {
                        var9++;
                        continue L2;
                      } else {
                        var14[var11_int] = hc.a(0, var21[var11_int], var5[var9]);
                        var11_int++;
                        continue L3;
                      }
                    }
                  }
                }
              } else {
                var7[var8] = (int[]) var21[0].clone();
                var8++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4;
            stackOut_12_1 = new StringBuilder().append("fn.F(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          L5: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          L6: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param2 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + 0 + ')');
        }
    }

    fn() {
    }

    public static void b() {
        field_g = null;
        field_f = null;
    }

    final void a(byte[] param0, boolean param1) {
        ((fn) this).field_h = java.nio.ByteBuffer.allocateDirect(param0.length);
        java.nio.Buffer discarded$6 = ((fn) this).field_h.position(0);
        if (!param1) {
            return;
        }
        try {
            java.nio.ByteBuffer discarded$7 = ((fn) this).field_h.put(param0);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "fn.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Invite more players, or alternatively try changing the '<%0>' setting.";
    }
}
