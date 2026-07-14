/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class owa extends le {
    private short[] field_i;
    static String field_j;
    private int[] field_l;
    private int[] field_k;
    private int[][] field_n;
    private int field_m;

    final void a(int param0, int param1, ds param2) {
        int var4 = 0;
        int var5 = VoidHunters.field_G;
        if (param1 >= -60) {
            return;
        }
        if (!(param0 != 0)) {
            ((owa) this).field_m = param2.e((byte) -118);
            ((owa) this).field_n = new int[param2.e((byte) -126)][2];
            for (var4 = 0; var4 < ((owa) this).field_n.length; var4++) {
                ((owa) this).field_n[var4][0] = param2.e(1869);
                ((owa) this).field_n[var4][1] = param2.e(1869);
            }
        }
    }

    private final void d(int param0) {
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
          var21 = VoidHunters.field_G;
          var2 = ((owa) this).field_m;
          if (-3 == (var2 ^ -1)) {
            var2 = 0;
            L1: while (true) {
              if (-258 <= var2) {
                break L0;
              } else {
                var4 = var2 << -1097520924;
                var3 = 1;
                L2: while (true) {
                  L3: {
                    if (var3 >= -1 + ((owa) this).field_n.length) {
                      break L3;
                    } else {
                      if (((owa) this).field_n[var3][0] <= var4) {
                        var3++;
                        continue L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    var22 = ((owa) this).field_n[var3 + -1];
                    var34 = ((owa) this).field_n[var3];
                    var7 = this.b(58, var3 + -2)[1];
                    var8 = var22[1];
                    var9 = var34[1];
                    var10 = this.b(-128, 1 + var3)[1];
                    var11 = (-var22[0] + var4 << -532228052) / (-var22[0] + var34[0]);
                    var12 = var11 * var11 >> -581659892;
                    var13 = var8 + -var9 + var10 + -var7;
                    var14 = -var13 + (var7 + -var8);
                    var15 = -var7 + var9;
                    var16 = var8;
                    var17 = var12 * (var11 * var13 >> -5711764) >> -1630854932;
                    var18 = var14 * var12 >> -855898356;
                    var19 = var15 * var11 >> 1912148716;
                    var20 = var17 - -var18 - (-var19 + -var16);
                    if (var20 < 32767) {
                      break L4;
                    } else {
                      var20 = -32767;
                      break L4;
                    }
                  }
                  L5: {
                    if (-32769 > var20) {
                      break L5;
                    } else {
                      var20 = 32767;
                      break L5;
                    }
                  }
                  ((owa) this).field_i[var2] = (short)var20;
                  var2++;
                  continue L1;
                }
              }
            }
          } else {
            if (var2 == -2) {
              var2 = 0;
              L6: while (true) {
                if (257 <= var2) {
                  break L0;
                } else {
                  var4 = var2 << 1532966788;
                  var3 = 1;
                  L7: while (true) {
                    L8: {
                      if (((owa) this).field_n.length + -1 <= var3) {
                        break L8;
                      } else {
                        if (var4 < ((owa) this).field_n[var3][0]) {
                          break L8;
                        } else {
                          var3++;
                          continue L7;
                        }
                      }
                    }
                    L9: {
                      var24 = ((owa) this).field_n[-1 + var3];
                      var35 = ((owa) this).field_n[var3];
                      var7 = (var4 - var24[0] << -1572169844) / (var35[0] + -var24[0]);
                      var8 = 4096 - jmb.field_q[(var7 & 8165) >> 1425306245] >> 1894299905;
                      var9 = 4096 + -var8;
                      var10 = var9 * var24[1] - -(var35[1] * var8) >> -635227476;
                      if (var10 <= -32768) {
                        var10 = -32767;
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    L10: {
                      if (var10 >= 32768) {
                        var10 = 32767;
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    ((owa) this).field_i[var2] = (short)var10;
                    var2++;
                    continue L6;
                  }
                }
              }
            } else {
              var2 = 0;
              L11: while (true) {
                if ((var2 ^ -1) <= -258) {
                  break L0;
                } else {
                  var4 = var2 << 1962773188;
                  var3 = 1;
                  L12: while (true) {
                    L13: {
                      if (var3 >= -1 + ((owa) this).field_n.length) {
                        break L13;
                      } else {
                        if (var4 >= ((owa) this).field_n[var3][0]) {
                          var3++;
                          continue L12;
                        } else {
                          break L13;
                        }
                      }
                    }
                    L14: {
                      var26 = ((owa) this).field_n[-1 + var3];
                      var36 = ((owa) this).field_n[var3];
                      var7 = (-var26[0] + var4 << -1415920980) / (-var26[0] + var36[0]);
                      var8 = -var7 + 4096;
                      var9 = var8 * var26[1] - -(var36[1] * var7) >> -2109984212;
                      if ((var9 ^ -1) >= 32767) {
                        var9 = -32767;
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                    L15: {
                      if (32768 <= var9) {
                        var9 = 32767;
                        break L15;
                      } else {
                        break L15;
                      }
                    }
                    ((owa) this).field_i[var2] = (short)var9;
                    var2++;
                    continue L11;
                  }
                }
              }
            }
          }
        }
        L16: {
          if (param0 >= 42) {
            break L16;
          } else {
            ((owa) this).field_k = null;
            break L16;
          }
        }
    }

    private final void e(int param0) {
        int[] var13 = ((owa) this).field_n[0];
        int[] var11 = var13;
        int[] var9 = var11;
        int[] var7 = var9;
        int[] var6 = var7;
        int[] var2 = var6;
        int[] var14 = ((owa) this).field_n[1];
        int[] var4 = ((owa) this).field_n[-2 + ((owa) this).field_n.length];
        int[] var5 = ((owa) this).field_n[-1 + ((owa) this).field_n.length];
        ((owa) this).field_l = new int[]{var4[0] + -var5[0] + var4[param0], var4[1] - (-var4[1] + var5[1])};
        ((owa) this).field_k = new int[]{var13[0] + (var13[0] - var14[0]), var13[1] - var14[1] + var13[1]};
    }

    final int[] a(int param0, boolean param1) {
        int[] var5 = null;
        int var6 = 0;
        int var4 = 0;
        int var7 = VoidHunters.field_G;
        int[] var8 = ((owa) this).field_f.a((byte) 6, param0);
        int[] var3 = var8;
        if (!(!((owa) this).field_f.field_e)) {
            var5 = ((owa) this).a(0, param0, 255);
            for (var6 = 0; hob.field_d > var6; var6++) {
                var4 = var5[var6] >> 482296324;
                if (!(0 <= var4)) {
                    var4 = 0;
                }
                if (-257 > (var4 ^ -1)) {
                    var4 = 256;
                }
                var8[var6] = ((owa) this).field_i[var4];
            }
        }
        if (!param1) {
            this.d(-119);
        }
        return var8;
    }

    private final int[] b(int param0, int param1) {
        if (!(-1 >= (param1 ^ -1))) {
            return ((owa) this).field_k;
        }
        int var3 = 67 % ((param0 - -78) / 43);
        if (!(param1 < ((owa) this).field_n.length)) {
            return ((owa) this).field_l;
        }
        return ((owa) this).field_n[param1];
    }

    final void c(byte param0) {
        if (!(((owa) this).field_n != null)) {
            ((owa) this).field_n = new int[][]{new int[2], new int[2]};
        }
        if (((owa) this).field_n.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        }
        if (param0 >= -35) {
            return;
        }
        if (!(((owa) this).field_m != 2)) {
            this.e(0);
        }
        taa.e((byte) -21);
        this.d(90);
    }

    public owa() {
        super(1, true);
        ((owa) this).field_i = new short[257];
        ((owa) this).field_m = 0;
    }

    public static void e(byte param0) {
        if (param0 < 83) {
            owa.e((byte) 58);
        }
        field_j = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "Unfortunately we are unable to create an account for you at this time.";
    }
}
