/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fn extends mk {
    static String field_f;
    static w field_g;
    private java.nio.ByteBuffer field_h;

    final byte[] a(int param0) {
        java.nio.Buffer discarded$4 = null;
        java.nio.ByteBuffer discarded$5 = null;
        byte[] var2 = null;
        byte[] var3 = null;
        if (param0 != 256) {
          return (byte[]) null;
        } else {
          var3 = new byte[this.field_h.capacity()];
          var2 = var3;
          discarded$4 = this.field_h.position(0);
          discarded$5 = this.field_h.get(var3);
          return var3;
        }
    }

    final static void a(ji param0, ji param1, ji param2, int param3) {
        pi discarded$1 = null;
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
        int stackIn_10_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_17_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var13 = client.field_A ? 1 : 0;
        try {
          L0: {
            c.field_m = bj.a(112, param0, "commonui", "frame_top");
            g.field_O = bj.a(112, param0, "commonui", "frame_bottom");
            jm.field_q = id.a(param0, "jagex_logo_grey", "commonui", 8192);
            rm.field_a = bj.a(112, param0, "commonui", "button");
            tl.field_u = ac.a(0, "commonui", "validation", param0);
            bj.field_f = (mm) ((Object) vi.a(param2, param0, "commonui", (byte) 110, "arezzo12"));
            hh.field_e = (mm) ((Object) vi.a(param2, param0, "commonui", (byte) 93, "arezzo14"));
            ec.field_p = (mm) ((Object) vi.a(param2, param0, "commonui", (byte) -121, "arezzo14bold"));
            var17 = new ck(param1.a(0, "", "button.gif"), (java.awt.Component) ((Object) jh.field_b));
            discarded$1 = hn.a("dropdown", param0, "commonui", (byte) 73);
            var5 = t.a("screen_options", param0, false, "commonui");
            df.field_Y = new pi[4];
            jj.field_e = new pi[4];
            aa.field_c = new pi[4];
            var6 = new pi[][]{df.field_Y, jj.field_e, aa.field_c};
            var19 = new int[4][];
            var16 = var19;
            var7 = var16;
            var7[0] = var5[0].field_l;
            var8 = 1;
            L1: while (true) {
              L2: {
                L3: {
                  if (var8 >= var19.length) {
                    break L3;
                  } else {
                    var7[var8] = (int[]) ((Object) var19[0].clone());
                    var8++;
                    if (var13 != 0) {
                      break L2;
                    } else {
                      if (var13 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var8 = var5[0].field_k[0];
                var19[2][var8] = 16777215;
                var19[1][var8] = 2394342;
                var19[3][var8] = 4767999;
                break L2;
              }
              var9 = 0;
              L4: while (true) {
                L5: {
                  L6: {
                    if ((var9 ^ -1) <= -4) {
                      break L6;
                    } else {
                      var14 = var6[var9];
                      var10 = var14;
                      stackOut_9_0 = 0;
                      stackIn_18_0 = stackOut_9_0;
                      stackIn_10_0 = stackOut_9_0;
                      if (var13 != 0) {
                        break L5;
                      } else {
                        var11_int = stackIn_10_0;
                        L7: while (true) {
                          L8: {
                            L9: {
                              if (var14.length <= var11_int) {
                                break L9;
                              } else {
                                var14[var11_int] = hc.a(0, var19[var11_int], var5[var9]);
                                var11_int++;
                                if (var13 != 0) {
                                  break L8;
                                } else {
                                  if (var13 == 0) {
                                    continue L7;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                            }
                            var9++;
                            break L8;
                          }
                          if (var13 == 0) {
                            continue L4;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                  }
                  var9 = var17.field_H;
                  uh.a(-9074);
                  var17.a();
                  stackOut_17_0 = 0;
                  stackIn_18_0 = stackOut_17_0;
                  break L5;
                }
                hk.c(stackIn_18_0, 0, hk.field_j, hk.field_i);
                var15 = new ck(var9, var9);
                var18 = var15;
                var18.a();
                var17.e(0, param3);
                var11 = new ck(var9, var9);
                var11.a();
                var17.e(var9 - var17.field_I, 0);
                var12 = new ck(var17.field_I - 2 * var9, var9);
                var12.a();
                var17.e(-var9, 0);
                mk.a((byte) -5);
                rm.field_a = new ck[]{var15, var12, var11};
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var4 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) (var4);
            stackOut_20_1 = new StringBuilder().append("fn.F(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L10;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L10;
            }
          }
          L11: {
            stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L11;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L11;
            }
          }
          L12: {
            stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
            stackOut_26_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',');
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param2 == null) {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L12;
            } else {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L12;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ',' + param3 + ')');
        }
    }

    fn() {
    }

    public static void b(int param0) {
        ji var2 = null;
        if (param0 != 0) {
          var2 = (ji) null;
          fn.a((ji) null, (ji) null, (ji) null, 51);
          field_g = null;
          field_f = null;
          return;
        } else {
          field_g = null;
          field_f = null;
          return;
        }
    }

    final void a(byte[] param0, boolean param1) {
        java.nio.ByteBuffer discarded$7 = null;
        this.field_h = java.nio.ByteBuffer.allocateDirect(param0.length);
        java.nio.Buffer discarded$6 = this.field_h.position(0);
        if (!param1) {
            return;
        }
        try {
            discarded$7 = this.field_h.put(param0);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "fn.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_f = "Invite more players, or alternatively try changing the '<%0>' setting.";
    }
}
