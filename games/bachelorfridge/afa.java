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
            var2 = ((afa) this).field_n;
            if (var2 == 2) {
              var2 = 0;
              L1: while (true) {
                if (-258 <= var2) {
                  break L0;
                } else {
                  var4 = var2 << 979092644;
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
                    ((afa) this).field_l[var2] = (short)var20;
                    var2++;
                    continue L1;
                  }
                }
              }
            } else {
              if (var2 != -2) {
                var2 = 0;
                L6: while (true) {
                  if (257 <= var2) {
                    break L0;
                  } else {
                    var4 = var2 << 1545503492;
                    var3 = 1;
                    L7: while (true) {
                      L8: {
                        if (((afa) this).field_o.length + -1 <= var3) {
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
                    var4 = var2 << -980156828;
                    var3 = 1;
                    L12: while (true) {
                      L13: {
                        if (((afa) this).field_o.length - 1 <= var3) {
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
                      ((afa) this).field_l[var2] = (short)var10;
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
            return ((afa) this).field_p;
        }
        if (((afa) this).field_o.length <= param0) {
            return ((afa) this).field_m;
        }
        return ((afa) this).field_o[param0];
    }

    public static void d(int param0) {
        field_k = null;
        if (param0 <= 56) {
            field_k = null;
        }
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
                var4 = var5[var6] >> 1492097796;
                if (-1 < (var4 ^ -1)) {
                    var4 = 0;
                }
                if (!((var4 ^ -1) >= -257)) {
                    var4 = 256;
                }
                var8[var6] = ((afa) this).field_l[var4];
            }
        }
        return var8;
    }

    final static fe a(lu param0, int param1) {
        if (param1 > -113) {
            return null;
        }
        return new fe(param0.c((byte) -85), param0.c((byte) -85), param0.c((byte) -85), param0.c((byte) -85), param0.a(3), param0.a(3), param0.b(16711935));
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
        if (param0) {
            int[] discarded$0 = ((afa) this).a(126, 19);
        }
        int[] var5 = ((afa) this).field_o[((afa) this).field_o.length - 1];
        ((afa) this).field_m = new int[]{var4[0] - (var5[0] + -var4[0]), var4[1] - var5[1] + var4[1]};
        ((afa) this).field_p = new int[]{-var13[0] + (var14[0] + var14[0]), var14[1] - (var13[1] - var14[1])};
    }

    final void a(byte param0, lu param1, int param2) {
        int var4 = 0;
        int var5 = BachelorFridge.field_y;
        if (-1 == (param2 ^ -1)) {
            ((afa) this).field_n = param1.b(16711935);
            ((afa) this).field_o = new int[param1.b(param0 + 16712006)][2];
            for (var4 = 0; var4 < ((afa) this).field_o.length; var4++) {
                ((afa) this).field_o[var4][0] = param1.e((byte) 90);
                ((afa) this).field_o[var4][1] = param1.e((byte) 105);
            }
        }
        if (param0 != -71) {
            Object var6 = null;
            ((afa) this).a((byte) -45, (lu) null, -22);
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
        if ((((afa) this).field_n ^ -1) == -3) {
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
