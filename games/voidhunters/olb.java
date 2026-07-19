/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class olb extends le {
    private int field_l;
    private int[] field_i;
    private int field_k;
    private int field_m;
    private int field_j;

    final void a(int param0, int param1, ds param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var6 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var5 = param0;
              if (0 != var5) {
                if ((var5 ^ -1) == -2) {
                  this.field_j = param2.e(1869);
                  break L1;
                } else {
                  if (-3 != (var5 ^ -1)) {
                    if ((var5 ^ -1) == -4) {
                      this.field_m = param2.e(1869);
                      break L1;
                    } else {
                      if (-5 != (var5 ^ -1)) {
                        break L1;
                      } else {
                        var4_int = param2.c((byte) -57);
                        this.field_i[1] = dla.a(var4_int >> 1538608676, 4080);
                        this.field_i[2] = dla.a(255, var4_int) >> 1551975820;
                        this.field_i[0] = dla.a(var4_int, 16711680) << 2154340;
                        break L1;
                      }
                    }
                  } else {
                    this.field_l = param2.e(1869);
                    break L1;
                  }
                }
              } else {
                this.field_k = param2.e(1869);
                break L1;
              }
            }
            if (param1 < -60) {
              break L0;
            } else {
              this.field_i = (int[]) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var4);
            stackOut_17_1 = new StringBuilder().append("olb.F(").append(param0).append(',').append(param1).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param2 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L2;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
    }

    public olb() {
        super(1, false);
        this.field_k = 409;
        this.field_m = 4096;
        this.field_l = 4096;
        this.field_i = new int[3];
        this.field_j = 4096;
    }

    final int[][] a(int param0, int param1) {
        int[][] var3 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[][] var17 = null;
        int[][] var19 = null;
        int[] var21 = null;
        int[] var24 = null;
        int[] var25 = null;
        int[][] var27 = null;
        int[] var29 = null;
        int[] var32 = null;
        int[] var33 = null;
        int[][] var38 = null;
        int[] var39 = null;
        int[] var40 = null;
        int[] var41 = null;
        var16 = VoidHunters.field_G;
        if (param0 == 255) {
          var27 = this.field_d.a(param1, (byte) -115);
          var19 = var27;
          var17 = var19;
          var3 = var17;
          if (this.field_d.field_g) {
            var38 = this.a((byte) 42, 0, param1);
            var39 = var38[0];
            var40 = var38[1];
            var41 = var38[2];
            var29 = var27[0];
            var21 = var29;
            var8 = var21;
            var32 = var27[1];
            var24 = var32;
            var9 = var24;
            var33 = var27[2];
            var25 = var33;
            var10 = var25;
            var11 = 0;
            L0: while (true) {
              if (hob.field_d > var11) {
                L1: {
                  var13 = var39[var11];
                  var12 = -this.field_i[0] + var13;
                  if (0 > var12) {
                    var12 = -var12;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                if (this.field_k >= var12) {
                  L2: {
                    var14 = var40[var11];
                    var12 = -this.field_i[1] + var14;
                    if (0 <= var12) {
                      break L2;
                    } else {
                      var12 = -var12;
                      break L2;
                    }
                  }
                  if (var12 <= this.field_k) {
                    L3: {
                      var15 = var41[var11];
                      var12 = var15 + -this.field_i[2];
                      if ((var12 ^ -1) <= -1) {
                        break L3;
                      } else {
                        var12 = -var12;
                        break L3;
                      }
                    }
                    if (var12 <= this.field_k) {
                      var8[var11] = this.field_m * var13 >> 991426348;
                      var9[var11] = this.field_l * var14 >> -807764916;
                      var10[var11] = var15 * this.field_j >> 2072267884;
                      var11++;
                      continue L0;
                    } else {
                      var29[var11] = var13;
                      var32[var11] = var14;
                      var33[var11] = var15;
                      var11++;
                      continue L0;
                    }
                  } else {
                    var29[var11] = var13;
                    var32[var11] = var14;
                    var10[var11] = var41[var11];
                    var11++;
                    continue L0;
                  }
                } else {
                  var29[var11] = var13;
                  var9[var11] = var40[var11];
                  var10[var11] = var41[var11];
                  var11++;
                  continue L0;
                }
              } else {
                return var3;
              }
            }
          } else {
            return var3;
          }
        } else {
          return (int[][]) null;
        }
    }

    final static void d(int param0) {
        int[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = VoidHunters.field_G;
        try {
          L0: {
            if (oab.field_o != wgb.field_f) {
              L1: {
                if (wqa.a(false, oab.field_o)) {
                  lo.field_a[oab.field_o].b((byte) 49);
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                lrb.field_f = bg.field_o;
                oab.field_o = wgb.field_f;
                if (param0 == 991426348) {
                  break L2;
                } else {
                  olb.d(25);
                  break L2;
                }
              }
              L3: {
                pob.field_b = 0;
                if (aeb.field_a) {
                  nkb.a(false, "Destroying game");
                  vqa.field_g = null;
                  aeb.field_a = false;
                  ndb.field_a = null;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (fhb.field_p) {
                  qa.field_o = new ij();
                  var9 = bv.field_a;
                  var7 = var9;
                  var4 = var7;
                  var1 = var4;
                  var2 = 0;
                  L5: while (true) {
                    if (-9 >= (var2 ^ -1)) {
                      var10 = ska.field_m;
                      var8 = var10;
                      var5 = var8;
                      var1 = var5;
                      var6 = 0;
                      var2 = var6;
                      L6: while (true) {
                        if (8 <= var6) {
                          fhb.field_p = false;
                          break L4;
                        } else {
                          var10[var6] = 0;
                          var6++;
                          continue L6;
                        }
                      }
                    } else {
                      var9[var2] = 0;
                      var2++;
                      continue L5;
                    }
                  }
                } else {
                  break L4;
                }
              }
              if (enb.field_b) {
                vjb.a((byte) 95);
                qo.a(15);
                ija.a(114);
                enb.field_b = false;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var1_ref), "olb.C(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
    }
}
