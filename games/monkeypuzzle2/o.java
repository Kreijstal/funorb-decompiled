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

    public static void a(byte param0) {
        int var1 = -60 % ((0 - param0) / 62);
        field_d = null;
    }

    final int a(int param0, int param1) {
        if (!(this.field_e == null)) {
            param0 = (int)((long)this.field_g * (long)param0 / (long)this.field_f);
        }
        if (param1 >= -70) {
            byte[] var4 = (byte[]) null;
            this.a(true, (byte[]) null);
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
        if (!param0) {
            return (le[]) null;
        }
        return var1;
    }

    final int a(int param0, byte param1) {
        if (!(null == this.field_e)) {
            param0 = 6 - -(int)((long)this.field_g * (long)param0 / (long)this.field_f);
        }
        if (param1 <= 20) {
            field_b = -31;
        }
        return param0;
    }

    final byte[] a(boolean param0, byte[] param1) {
        byte[] stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        int var11 = 0;
        byte[] var12 = null;
        int var13 = 0;
        int[] var15 = null;
        int[] var17 = null;
        int[] var19 = null;
        var11 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                var12 = (byte[]) null;
                this.a(false, (byte[]) null);
                break L1;
              }
            }
            L2: {
              if (null == this.field_e) {
                break L2;
              } else {
                var3_int = 14 + (int)((long)this.field_g * (long)param1.length / (long)this.field_f);
                var17 = new int[var3_int];
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
                          var8 = 32768 + var17[var13] >> 1514084656;
                          if (127 < (var8 ^ -1)) {
                            param1[var13] = (byte)-128;
                            break L5;
                          } else {
                            if (127 < var8) {
                              param1[var13] = (byte)127;
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
                    var19 = this.field_e[var6];
                    var10 = 0;
                    L6: while (true) {
                      if (-15 >= (var10 ^ -1)) {
                        var6 = var6 + this.field_g;
                        var10 = var6 / this.field_f;
                        var6 = var6 - this.field_f * var10;
                        var5 = var5 + var10;
                        var7++;
                        continue L3;
                      } else {
                        var4[var10 + var5] = var4[var10 + var5] + var8 * var19[var10];
                        var10++;
                        continue L6;
                      }
                    }
                  }
                }
              }
            }
            stackIn_19_0 = (byte[]) (param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var3);

            stackIn_22_1 = new StringBuilder().append("o.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L7;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L7;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
        }
        return stackIn_19_0;
    }

    final static void a(java.awt.Component param0, boolean param1) {
        if (!param1) {
            return;
        }
        try {
            param0.addMouseListener(we.field_n);
            param0.addMouseMotionListener(we.field_n);
            param0.addFocusListener(we.field_n);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "o.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static de a(int param0, int param1, int param2, int param3, int param4) {
        int var7 = MonkeyPuzzle2.field_F ? 1 : 0;
        de var5 = (de) ((Object) qa.field_d.a((byte) -117));
        int var6 = -26 / ((11 - param4) / 54);
        while (var5 != null) {
            if ((param0 ^ -1) == (var5.field_k ^ -1)) {
                return var5;
            }
            var5 = (de) ((Object) qa.field_d.d((byte) 63));
        }
        var5 = new de();
        var5.field_e = param3;
        var5.field_h = param1;
        var5.field_k = param0;
        qa.field_d.a(-8212, var5);
        w.a(-95, param2, var5);
        return var5;
    }

    final static byte[] a(byte param0, String param1) {
        RuntimeException var2 = null;
        byte[] stackIn_2_0 = null;
        byte[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 76) {
              stackIn_4_0 = gf.field_b.a(param1, "", 62);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (byte[]) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("o.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    o(int param0, int param1) {
        int var3;
        int var4;
        int[] var5;
        double var6;
        int var8;
        int var9;
        double var10;
        double var12;
        double var14;
        if (param1 != param0) {
          var3 = ed.a(param0, param1, 0);
          param1 = param1 / var3;
          param0 = param0 / var3;
          this.field_g = param1;
          this.field_f = param0;
          this.field_e = new int[param0][14];
          var4 = 0;
          L0: while (true) {
            if (var4 >= param0) {
              return;
            } else {
              L1: {
                var5 = this.field_e[var4];
                var6 = (double)var4 / (double)param0 + 6.0;
                var8 = (int)Math.floor(1.0 + (var6 - 7.0));
                if ((var8 ^ -1) <= -1) {
                  break L1;
                } else {
                  var8 = 0;
                  break L1;
                }
              }
              L2: {
                var9 = (int)Math.ceil(var6 + 7.0);
                if (-15 <= (var9 ^ -1)) {
                  break L2;
                } else {
                  var9 = 14;
                  break L2;
                }
              }
              var10 = (double)param1 / (double)param0;
              L3: while (true) {
                if (var9 <= var8) {
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
        field_b = 0;
        field_d = new te(10, 2, 2, 0);
    }
}
