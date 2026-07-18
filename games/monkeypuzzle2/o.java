/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class o {
    static int field_b;
    private int field_g;
    private int[][] field_e;
    static te field_d;
    private int field_f;
    static int field_a;
    static int field_c;

    public static void a() {
        int var1 = 0;
        field_d = null;
    }

    final int a(int param0, int param1) {
        if (!(((o) this).field_e == null)) {
            param0 = (int)((long)((o) this).field_g * (long)param0 / (long)((o) this).field_f);
        }
        if (param1 >= -70) {
            Object var4 = null;
            byte[] discarded$0 = ((o) this).a(true, (byte[]) null);
        }
        return param0;
    }

    final static le[] a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        byte[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = MonkeyPuzzle2.field_F ? 1 : 0;
        le[] var1 = new le[eg.field_c];
        for (var2 = 0; var2 < eg.field_c; var2++) {
            var3 = ra.field_ab[var2] * da.field_c[var2];
            var4 = cb.field_b[var2];
            var5 = new int[var3];
            for (var6 = 0; var3 > var6; var6++) {
                var5[var6] = fk.field_d[ch.a((int) var4[var6], 255)];
            }
            var1[var2] = new le(nj.field_d, qk.field_a, qc.field_P[var2], mb.field_b[var2], da.field_c[var2], ra.field_ab[var2], var5);
        }
        gb.a(-85);
        return var1;
    }

    final int a(int param0, byte param1) {
        if (!(null == ((o) this).field_e)) {
            param0 = 6 - -(int)((long)((o) this).field_g * (long)param0 / (long)((o) this).field_f);
        }
        if (param1 <= 20) {
            field_b = -31;
        }
        return param0;
    }

    final byte[] a(boolean param0, byte[] param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        int var11 = 0;
        Object var12 = null;
        int var13 = 0;
        int[] var15 = null;
        int[] var17 = null;
        int[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        byte[] stackIn_19_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_18_0 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var11 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                var12 = null;
                byte[] discarded$1 = ((o) this).a(false, (byte[]) null);
                break L1;
              }
            }
            L2: {
              if (null == ((o) this).field_e) {
                break L2;
              } else {
                var3_int = 14 + (int)((long)((o) this).field_g * (long)param1.length / (long)((o) this).field_f);
                var21 = new int[var3_int];
                var19 = var21;
                var17 = var19;
                var15 = var17;
                var4 = var15;
                var5 = 0;
                var6 = 0;
                var7 = 0;
                L3: while (true) {
                  if (var7 >= param1.length) {
                    param1 = new byte[var3_int];
                    var13 = 0;
                    var7 = var13;
                    L4: while (true) {
                      if (var3_int <= var13) {
                        break L2;
                      } else {
                        L5: {
                          var8 = 32768 + var21[var13] >> 16;
                          if (var8 < -128) {
                            param1[var13] = (byte) -128;
                            break L5;
                          } else {
                            if (127 < var8) {
                              param1[var13] = (byte) 127;
                              break L5;
                            } else {
                              param1[var13] = (byte)var8;
                              break L5;
                            }
                          }
                        }
                        var13++;
                        continue L4;
                      }
                    }
                  } else {
                    var8 = param1[var7];
                    var20 = ((o) this).field_e[var6];
                    var10 = 0;
                    L6: while (true) {
                      if (var10 >= 14) {
                        var6 = var6 + ((o) this).field_g;
                        var10 = var6 / ((o) this).field_f;
                        var6 = var6 - ((o) this).field_f * var10;
                        var5 = var5 + var10;
                        var7++;
                        continue L3;
                      } else {
                        var4[var10 + var5] = var4[var10 + var5] + var8 * var20[var10];
                        var10++;
                        continue L6;
                      }
                    }
                  }
                }
              }
            }
            stackOut_18_0 = (byte[]) param1;
            stackIn_19_0 = stackOut_18_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var3;
            stackOut_20_1 = new StringBuilder().append("o.C(").append(param0).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L7;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L7;
            }
          }
          throw la.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ')');
        }
        return stackIn_19_0;
    }

    final static void a(java.awt.Component param0) {
        try {
            param0.addMouseListener((java.awt.event.MouseListener) (Object) we.field_n);
            param0.addMouseMotionListener((java.awt.event.MouseMotionListener) (Object) we.field_n);
            param0.addFocusListener((java.awt.event.FocusListener) (Object) we.field_n);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "o.B(" + (param0 != null ? "{...}" : "null") + ',' + true + ')');
        }
    }

    final static de a(int param0, int param1, int param2, int param3, int param4) {
        int var7 = MonkeyPuzzle2.field_F ? 1 : 0;
        de var5 = (de) (Object) qa.field_d.a((byte) -117);
        int var6 = -26 / ((11 - param4) / 54);
        while (var5 != null) {
            if (var5.field_k == 41) {
                return var5;
            }
            var5 = (de) (Object) qa.field_d.d((byte) 63);
        }
        var5 = new de();
        var5.field_e = 1;
        var5.field_h = 10;
        var5.field_k = 41;
        qa.field_d.a(-8212, (ug) (Object) var5);
        w.a(-95, 3, var5);
        return var5;
    }

    final static byte[] a(byte param0, String param1) {
        RuntimeException var2 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            stackOut_2_0 = gf.field_b.a(param1, "", 62);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("o.F(").append(76).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw la.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    o(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = 0;
        double var10 = 0.0;
        double var12 = 0.0;
        double var14 = 0.0;
        if (param1 != param0) {
          var3 = ed.a(param0, param1, 0);
          param1 = param1 / var3;
          param0 = param0 / var3;
          ((o) this).field_g = param1;
          ((o) this).field_f = param0;
          ((o) this).field_e = new int[param0][14];
          var4 = 0;
          L0: while (true) {
            if (var4 >= param0) {
              return;
            } else {
              L1: {
                var5 = ((o) this).field_e[var4];
                var6 = (double)var4 / (double)param0 + 6.0;
                var8 = (int)Math.floor(1.0 + (var6 - 7.0));
                if (var8 >= 0) {
                  break L1;
                } else {
                  var8 = 0;
                  break L1;
                }
              }
              L2: {
                var9 = (int)Math.ceil(var6 + 7.0);
                if (var9 <= 14) {
                  break L2;
                } else {
                  var9 = 14;
                  break L2;
                }
              }
              var10 = (double)param1 / (double)param0;
              L3: while (true) {
                if (~var9 >= ~var8) {
                  var4++;
                  continue L0;
                } else {
                  L4: {
                    L5: {
                      var12 = ((double)var8 - var6) * 3.141592653589793;
                      var14 = var10;
                      if (-0.0001 > var12) {
                        break L5;
                      } else {
                        if (var12 <= 0.0001) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var14 = var14 * (Math.sin(var12) / var12);
                    break L4;
                  }
                  var14 = var14 * (0.46 * Math.cos(0.2243994752564138 * (-var6 + (double)var8)) + 0.54);
                  var5[var8] = (int)Math.floor(0.5 + var14 * 65536.0);
                  var8++;
                  continue L3;
                }
              }
            }
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0;
        field_d = new te(10, 2, 2, 0);
    }
}
