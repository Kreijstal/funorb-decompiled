/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class afa extends k {
    static String field_k;
    private int[] field_m;
    private int[][] field_o;
    private short[] field_l;
    private int[] field_p;
    private int field_n;

    private final void e(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int[] var22 = null;
        int[] var24 = null;
        int[] var26 = null;
        int[] var34 = null;
        int[] var35 = null;
        int[] var36 = null;
        var21 = BachelorFridge.field_y;
        if (param0 == 0) {
          L0: {
            var2 = this.field_n;
            if (var2 == 2) {
              var2 = 0;
              L1: while (true) {
                if (-258 >= (var2 ^ -1)) {
                  break L0;
                } else {
                  var4 = var2 << 979092644;
                  var3 = 1;
                  L2: while (true) {
                    L3: {
                      if (this.field_o.length + -1 <= var3) {
                        break L3;
                      } else {
                        if (var4 < this.field_o[var3][0]) {
                          break L3;
                        } else {
                          var3++;
                          continue L2;
                        }
                      }
                    }
                    L4: {
                      var22 = this.field_o[var3 - 1];
                      var34 = this.field_o[var3];
                      var7 = this.a(-2 + var3, (byte) 122)[1];
                      var8 = var22[1];
                      var9 = var34[1];
                      var10 = this.a(var3 - -1, (byte) 122)[1];
                      var11 = (var4 + -var22[0] << 848229804) / (var34[0] - var22[0]);
                      var12 = var11 * var11 >> -1628837076;
                      var13 = var8 + -var9 + var10 - var7;
                      var14 = -var8 + var7 - var13;
                      var15 = var9 - var7;
                      var16 = var8;
                      var17 = (var11 * var13 >> -1391764116) * var12 >> -122630004;
                      var18 = var14 * var12 >> 1624304812;
                      var19 = var15 * var11 >> -2109288468;
                      var20 = var16 + (var18 + (var17 + var19));
                      if (32767 > (var20 ^ -1)) {
                        break L4;
                      } else {
                        var20 = -32767;
                        break L4;
                      }
                    }
                    L5: {
                      if (var20 < 32768) {
                        break L5;
                      } else {
                        var20 = 32767;
                        break L5;
                      }
                    }
                    this.field_l[var2] = (short)var20;
                    var2++;
                    continue L1;
                  }
                }
              }
            } else {
              if ((var2 ^ -1) != -2) {
                var2 = 0;
                L6: while (true) {
                  if (257 <= var2) {
                    break L0;
                  } else {
                    var4 = var2 << 1545503492;
                    var3 = 1;
                    L7: while (true) {
                      L8: {
                        if (this.field_o.length + -1 <= var3) {
                          break L8;
                        } else {
                          if (this.field_o[var3][0] > var4) {
                            break L8;
                          } else {
                            var3++;
                            continue L7;
                          }
                        }
                      }
                      L9: {
                        var26 = this.field_o[-1 + var3];
                        var36 = this.field_o[var3];
                        var7 = (-var26[0] + var4 << 466323980) / (var36[0] + -var26[0]);
                        var8 = 4096 - var7;
                        var9 = var26[1] * var8 - -(var7 * var36[1]) >> 524490316;
                        if (-32768 < var9) {
                          break L9;
                        } else {
                          var9 = -32767;
                          break L9;
                        }
                      }
                      L10: {
                        if (32768 <= var9) {
                          var9 = 32767;
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                      this.field_l[var2] = (short)var9;
                      var2++;
                      continue L6;
                    }
                  }
                }
              } else {
                var2 = 0;
                L11: while (true) {
                  if (257 <= var2) {
                    break L0;
                  } else {
                    var4 = var2 << -980156828;
                    var3 = 1;
                    L12: while (true) {
                      L13: {
                        if (this.field_o.length - 1 <= var3) {
                          break L13;
                        } else {
                          if (var4 < this.field_o[var3][0]) {
                            break L13;
                          } else {
                            var3++;
                            continue L12;
                          }
                        }
                      }
                      L14: {
                        var24 = this.field_o[-1 + var3];
                        var35 = this.field_o[var3];
                        var7 = (var4 - var24[0] << -1551650676) / (-var24[0] + var35[0]);
                        var8 = 4096 + -am.field_R[var7 >> 887929829 & 255] >> -2071138815;
                        var9 = 4096 - var8;
                        var10 = var35[1] * var8 + var24[1] * var9 >> -755219636;
                        if (32767 > (var10 ^ -1)) {
                          break L14;
                        } else {
                          var10 = -32767;
                          break L14;
                        }
                      }
                      L15: {
                        if ((var10 ^ -1) > -32769) {
                          break L15;
                        } else {
                          var10 = 32767;
                          break L15;
                        }
                      }
                      this.field_l[var2] = (short)var10;
                      var2++;
                      continue L11;
                    }
                  }
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    private final int[] a(int param0, byte param1) {
        if (param1 != 122) {
            this.b(true);
        }
        if ((param0 ^ -1) > -1) {
            return this.field_p;
        }
        if (this.field_o.length <= param0) {
            return this.field_m;
        }
        return this.field_o[param0];
    }

    public static void d(int param0) {
        field_k = null;
        if (param0 <= 56) {
            field_k = (String) null;
        }
    }

    public afa() {
        super(1, true);
        this.field_l = new short[257];
        this.field_n = 0;
    }

    final int[] a(int param0, int param1) {
        int[] var5 = null;
        int var6 = 0;
        int var4 = 0;
        int var7 = BachelorFridge.field_y;
        if (param1 != 0) {
            this.d((byte) -65);
        }
        int[] var8 = this.field_j.a(param0, param1 + -1);
        int[] var3 = var8;
        if (this.field_j.field_m) {
            var5 = this.a(0, param0, (byte) 117);
            for (var6 = 0; var6 < hh.field_d; var6++) {
                var4 = var5[var6] >> 1492097796;
                if (-1 < (var4 ^ -1)) {
                    var4 = 0;
                }
                if (!((var4 ^ -1) >= -257)) {
                    var4 = 256;
                }
                var8[var6] = this.field_l[var4];
            }
        }
        return var8;
    }

    final static fe a(lu param0, int param1) {
        RuntimeException var2 = null;
        fe stackIn_2_0 = null;
        fe stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        fe stackOut_3_0 = null;
        fe stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param1 <= -113) {
              stackOut_3_0 = new fe(param0.c((byte) -85), param0.c((byte) -85), param0.c((byte) -85), param0.c((byte) -85), param0.a(3), param0.a(3), param0.b(16711935));
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (fe) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var2);
            stackOut_5_1 = new StringBuilder().append("afa.D(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    private final void b(boolean param0) {
        int[] discarded$0 = null;
        int[] var10 = this.field_o[0];
        int[] var8 = var10;
        int[] var6 = var8;
        int[] var2 = var6;
        int[] var12 = this.field_o[1];
        int[] var4 = this.field_o[-2 + this.field_o.length];
        if (param0) {
            discarded$0 = this.a(126, 19);
        }
        int[] var5 = this.field_o[this.field_o.length - 1];
        this.field_m = new int[]{var4[0] - (var5[0] + -var4[0]), var4[1] - var5[1] + var4[1]};
        this.field_p = new int[]{-var12[0] + (var10[0] + var10[0]), var10[1] - (var12[1] - var10[1])};
    }

    final void a(byte param0, lu param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        lu var6 = null;
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
        var5 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (-1 != (param2 ^ -1)) {
                break L1;
              } else {
                this.field_n = param1.b(16711935);
                this.field_o = new int[param1.b(param0 + 16712006)][2];
                var4_int = 0;
                L2: while (true) {
                  if (var4_int >= this.field_o.length) {
                    break L1;
                  } else {
                    this.field_o[var4_int][0] = param1.e((byte) 90);
                    this.field_o[var4_int][1] = param1.e((byte) 105);
                    var4_int++;
                    continue L2;
                  }
                }
              }
            }
            L3: {
              if (param0 == -71) {
                break L3;
              } else {
                var6 = (lu) null;
                this.a((byte) -45, (lu) null, -22);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var4);
            stackOut_8_1 = new StringBuilder().append("afa.E(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param2 + ')');
        }
    }

    final void d(byte param0) {
        if (!(null != this.field_o)) {
            this.field_o = new int[][]{new int[]{0, 0}, new int[]{4096, 4096}};
        }
        if (param0 != -68) {
            this.field_o = (int[][]) null;
        }
        if (this.field_o.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        }
        if ((this.field_n ^ -1) == -3) {
            this.b(false);
        }
        gea.a(param0 ^ -4293);
        this.e(0);
    }

    static {
        field_k = "You need to play 1 more rated game to unlock this option.";
    }
}
