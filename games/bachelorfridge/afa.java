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
        L0: {
          var21 = BachelorFridge.field_y;
          var2 = ((afa) this).field_n;
          if (var2 == 2) {
            var2 = 0;
            L1: while (true) {
              if (var2 >= 257) {
                break L0;
              } else {
                var4 = var2 << 4;
                var3 = 1;
                L2: while (true) {
                  L3: {
                    if (((afa) this).field_o.length + -1 <= var3) {
                      break L3;
                    } else {
                      if (var4 < ((afa) this).field_o[var3][0]) {
                        break L3;
                      } else {
                        var3++;
                        continue L2;
                      }
                    }
                  }
                  L4: {
                    var22 = ((afa) this).field_o[var3 - 1];
                    var34 = ((afa) this).field_o[var3];
                    var7 = this.a(-2 + var3, (byte) 122)[1];
                    var8 = var22[1];
                    var9 = var34[1];
                    var10 = this.a(var3 - -1, (byte) 122)[1];
                    var11 = (var4 + -var22[0] << 12) / (var34[0] - var22[0]);
                    var12 = var11 * var11 >> 12;
                    var13 = var8 + -var9 + var10 - var7;
                    var14 = -var8 + var7 - var13;
                    var15 = var9 - var7;
                    var16 = var8;
                    var17 = (var11 * var13 >> 12) * var12 >> 12;
                    var18 = var14 * var12 >> 12;
                    var19 = var15 * var11 >> 12;
                    var20 = var16 + (var18 + (var17 + var19));
                    if (var20 > -32768) {
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
                  ((afa) this).field_l[var2] = (short)var20;
                  var2++;
                  continue L1;
                }
              }
            }
          } else {
            if (var2 != 1) {
              var2 = 0;
              L6: while (true) {
                if (257 <= var2) {
                  break L0;
                } else {
                  var4 = var2 << 4;
                  var3 = 1;
                  L7: while (true) {
                    L8: {
                      if (~(((afa) this).field_o.length + -1) >= ~var3) {
                        break L8;
                      } else {
                        if (((afa) this).field_o[var3][0] > var4) {
                          break L8;
                        } else {
                          var3++;
                          continue L7;
                        }
                      }
                    }
                    L9: {
                      var26 = ((afa) this).field_o[-1 + var3];
                      var36 = ((afa) this).field_o[var3];
                      var7 = (-var26[0] + var4 << 12) / (var36[0] + -var26[0]);
                      var8 = 4096 - var7;
                      var9 = var26[1] * var8 - -(var7 * var36[1]) >> 12;
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
                    ((afa) this).field_l[var2] = (short)var9;
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
                  var4 = var2 << 4;
                  var3 = 1;
                  L12: while (true) {
                    L13: {
                      if (~(((afa) this).field_o.length - 1) >= ~var3) {
                        break L13;
                      } else {
                        if (var4 < ((afa) this).field_o[var3][0]) {
                          break L13;
                        } else {
                          var3++;
                          continue L12;
                        }
                      }
                    }
                    L14: {
                      var24 = ((afa) this).field_o[-1 + var3];
                      var35 = ((afa) this).field_o[var3];
                      var7 = (var4 - var24[0] << 12) / (-var24[0] + var35[0]);
                      var8 = 4096 + -am.field_R[var7 >> 5 & 255] >> 1;
                      var9 = 4096 - var8;
                      var10 = var35[1] * var8 + var24[1] * var9 >> 12;
                      if (var10 > -32768) {
                        break L14;
                      } else {
                        var10 = -32767;
                        break L14;
                      }
                    }
                    L15: {
                      if (var10 < 32768) {
                        break L15;
                      } else {
                        var10 = 32767;
                        break L15;
                      }
                    }
                    ((afa) this).field_l[var2] = (short)var10;
                    var2++;
                    continue L11;
                  }
                }
              }
            }
          }
        }
    }

    private final int[] a(int param0, byte param1) {
        if (param0 < 0) {
            return ((afa) this).field_p;
        }
        if (((afa) this).field_o.length <= param0) {
            return ((afa) this).field_m;
        }
        return ((afa) this).field_o[param0];
    }

    public static void d(int param0) {
        field_k = null;
    }

    public afa() {
        super(1, true);
        ((afa) this).field_l = new short[257];
        ((afa) this).field_n = 0;
    }

    final int[] a(int param0, int param1) {
        int[] var5 = null;
        int var6 = 0;
        int var4 = 0;
        int var7 = BachelorFridge.field_y;
        if (param1 != 0) {
            ((afa) this).d((byte) -65);
        }
        int[] var8 = ((afa) this).field_j.a(param0, param1 + -1);
        int[] var3 = var8;
        if (((afa) this).field_j.field_m) {
            var5 = ((afa) this).a(0, param0, (byte) 117);
            for (var6 = 0; var6 < hh.field_d; var6++) {
                var4 = var5[var6] >> 4;
                if (var4 < 0) {
                    var4 = 0;
                }
                if (!(var4 <= 256)) {
                    var4 = 256;
                }
                var8[var6] = ((afa) this).field_l[var4];
            }
        }
        return var8;
    }

    final static fe a(lu param0, int param1) {
        RuntimeException var2 = null;
        fe stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        fe stackOut_2_0 = null;
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
            stackOut_2_0 = new fe(param0.c((byte) -85), param0.c((byte) -85), param0.c((byte) -85), param0.c((byte) -85), param0.a(3), param0.a(3), param0.b(16711935));
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("afa.D(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
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
          throw pe.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + -128 + ')');
        }
        return stackIn_3_0;
    }

    private final void b(boolean param0) {
        int[] var14 = ((afa) this).field_o[0];
        int[] var12 = var14;
        int[] var10 = var12;
        int[] var8 = var10;
        int[] var6 = var8;
        int[] var2 = var6;
        int[] var13 = ((afa) this).field_o[1];
        int[] var4 = ((afa) this).field_o[-2 + ((afa) this).field_o.length];
        int[] var5 = ((afa) this).field_o[((afa) this).field_o.length - 1];
        ((afa) this).field_m = new int[]{var4[0] - (var5[0] + -var4[0]), var4[1] - var5[1] + var4[1]};
        ((afa) this).field_p = new int[]{-var13[0] + (var14[0] + var14[0]), var14[1] - (var13[1] - var14[1])};
    }

    final void a(byte param0, lu param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        Object var6 = null;
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
              if (param2 != 0) {
                break L1;
              } else {
                ((afa) this).field_n = param1.b(16711935);
                ((afa) this).field_o = new int[param1.b(param0 + 16712006)][2];
                var4_int = 0;
                L2: while (true) {
                  if (var4_int >= ((afa) this).field_o.length) {
                    break L1;
                  } else {
                    ((afa) this).field_o[var4_int][0] = param1.e((byte) 90);
                    ((afa) this).field_o[var4_int][1] = param1.e((byte) 105);
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
                var6 = null;
                ((afa) this).a((byte) -45, (lu) null, -22);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var4;
            stackOut_8_1 = new StringBuilder().append("afa.E(").append(param0).append(',');
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
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param2 + ')');
        }
    }

    final void d(byte param0) {
        if (!(null != ((afa) this).field_o)) {
            ((afa) this).field_o = new int[][]{new int[2], new int[2]};
        }
        if (param0 != -68) {
            ((afa) this).field_o = null;
        }
        if (((afa) this).field_o.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        }
        if (((afa) this).field_n == 2) {
            this.b(false);
        }
        gea.a(param0 ^ -4293);
        this.e(0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "You need to play 1 more rated game to unlock this option.";
    }
}
