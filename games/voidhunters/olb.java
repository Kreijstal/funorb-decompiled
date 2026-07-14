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
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = VoidHunters.field_G;
        var5 = param0;
        if (0 != var5) {
          if (var5 == -2) {
            ((olb) this).field_j = param2.e(1869);
            if (param1 < -60) {
              return;
            } else {
              ((olb) this).field_i = null;
              return;
            }
          } else {
            if (-3 != var5) {
              if (var5 == -4) {
                ((olb) this).field_m = param2.e(1869);
                if (param1 >= -60) {
                  ((olb) this).field_i = null;
                  return;
                } else {
                  return;
                }
              } else {
                L0: {
                  if (-5 != var5) {
                    break L0;
                  } else {
                    var4 = param2.c((byte) -57);
                    ((olb) this).field_i[1] = dla.a(var4 >> 1538608676, 4080);
                    ((olb) this).field_i[2] = dla.a(255, var4) >> 1551975820;
                    ((olb) this).field_i[0] = dla.a(var4, 16711680) << 2154340;
                    break L0;
                  }
                }
                if (param1 >= -60) {
                  ((olb) this).field_i = null;
                  return;
                } else {
                  return;
                }
              }
            } else {
              ((olb) this).field_l = param2.e(1869);
              if (param1 >= -60) {
                ((olb) this).field_i = null;
                return;
              } else {
                return;
              }
            }
          }
        } else {
          ((olb) this).field_k = param2.e(1869);
          if (param1 < -60) {
            return;
          } else {
            ((olb) this).field_i = null;
            return;
          }
        }
    }

    public olb() {
        super(1, false);
        ((olb) this).field_k = 409;
        ((olb) this).field_m = 4096;
        ((olb) this).field_l = 4096;
        ((olb) this).field_i = new int[3];
        ((olb) this).field_j = 4096;
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
        int[][] var35 = null;
        int[] var37 = null;
        int[] var40 = null;
        int[] var41 = null;
        int[][] var42 = null;
        int[][] var43 = null;
        int[] var44 = null;
        int[] var45 = null;
        int[] var46 = null;
        int[] var47 = null;
        int[] var48 = null;
        int[] var49 = null;
        var16 = VoidHunters.field_G;
        if (param0 == 255) {
          var43 = ((olb) this).field_d.a(param1, (byte) -115);
          var35 = var43;
          var27 = var35;
          var19 = var27;
          var17 = var19;
          var3 = var17;
          if (((olb) this).field_d.field_g) {
            var42 = ((olb) this).a((byte) 42, 0, param1);
            var44 = var42[0];
            var46 = var42[1];
            var47 = var42[2];
            var45 = var43[0];
            var37 = var45;
            var29 = var37;
            var21 = var29;
            var8 = var21;
            var48 = var43[1];
            var40 = var48;
            var32 = var40;
            var24 = var32;
            var9 = var24;
            var49 = var43[2];
            var41 = var49;
            var33 = var41;
            var25 = var33;
            var10 = var25;
            var11 = 0;
            L0: while (true) {
              if (hob.field_d > var11) {
                L1: {
                  var13 = var44[var11];
                  var12 = -((olb) this).field_i[0] + var13;
                  if (0 > var12) {
                    var12 = -var12;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                if (((olb) this).field_k >= var12) {
                  L2: {
                    var14 = var46[var11];
                    var12 = -((olb) this).field_i[1] + var14;
                    if (0 <= var12) {
                      break L2;
                    } else {
                      var12 = -var12;
                      break L2;
                    }
                  }
                  if (var12 <= ((olb) this).field_k) {
                    L3: {
                      var15 = var47[var11];
                      var12 = var15 + -((olb) this).field_i[2];
                      if ((var12 ^ -1) <= -1) {
                        break L3;
                      } else {
                        var12 = -var12;
                        break L3;
                      }
                    }
                    if (var12 <= ((olb) this).field_k) {
                      var8[var11] = ((olb) this).field_m * var13 >> 991426348;
                      var9[var11] = ((olb) this).field_l * var14 >> -807764916;
                      var10[var11] = var15 * ((olb) this).field_j >> 2072267884;
                      var11++;
                      continue L0;
                    } else {
                      var45[var11] = var13;
                      var48[var11] = var14;
                      var49[var11] = var15;
                      var11++;
                      var11++;
                      continue L0;
                    }
                  } else {
                    var45[var11] = var13;
                    var48[var11] = var14;
                    var10[var11] = var47[var11];
                    var11++;
                    var11++;
                    continue L0;
                  }
                } else {
                  var45[var11] = var13;
                  var9[var11] = var46[var11];
                  var10[var11] = var47[var11];
                  var11++;
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
          return null;
        }
    }

    final static void d(int param0) {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        var3 = VoidHunters.field_G;
        if (oab.field_o != wgb.field_f) {
          L0: {
            if (wqa.a(false, oab.field_o)) {
              lo.field_a[oab.field_o].b((byte) 49);
              break L0;
            } else {
              break L0;
            }
          }
          lrb.field_f = bg.field_o;
          oab.field_o = wgb.field_f;
          if (param0 != 991426348) {
            L1: {
              olb.d(25);
              pob.field_b = 0;
              if (aeb.field_a) {
                nkb.a(false, "Destroying game");
                vqa.field_g = null;
                aeb.field_a = false;
                ndb.field_a = null;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (fhb.field_p) {
                qa.field_o = new ij();
                var15 = bv.field_a;
                var11 = var15;
                var9 = var11;
                var7 = var9;
                var4 = var7;
                var1 = var4;
                var2 = 0;
                L3: while (true) {
                  if (-9 >= (var2 ^ -1)) {
                    var16 = ska.field_m;
                    var12 = var16;
                    var10 = var12;
                    var8 = var10;
                    var5 = var8;
                    var1 = var5;
                    var6 = 0;
                    var2 = var6;
                    L4: while (true) {
                      if (8 <= var6) {
                        fhb.field_p = false;
                        break L2;
                      } else {
                        var16[var6] = 0;
                        var6++;
                        continue L4;
                      }
                    }
                  } else {
                    var15[var2] = 0;
                    var2++;
                    continue L3;
                  }
                }
              } else {
                break L2;
              }
            }
            L5: {
              if (enb.field_b) {
                vjb.a((byte) 95);
                qo.a(15);
                ija.a(114);
                enb.field_b = false;
                break L5;
              } else {
                break L5;
              }
            }
            return;
          } else {
            L6: {
              pob.field_b = 0;
              if (aeb.field_a) {
                nkb.a(false, "Destroying game");
                vqa.field_g = null;
                aeb.field_a = false;
                ndb.field_a = null;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (fhb.field_p) {
                qa.field_o = new ij();
                var17 = bv.field_a;
                var13 = var17;
                var9 = var13;
                var7 = var9;
                var4 = var7;
                var1 = var4;
                var2 = 0;
                L8: while (true) {
                  if (-9 >= (var2 ^ -1)) {
                    var18 = ska.field_m;
                    var14 = var18;
                    var10 = var14;
                    var8 = var10;
                    var5 = var8;
                    var1 = var5;
                    var6 = 0;
                    var2 = var6;
                    L9: while (true) {
                      if (8 <= var6) {
                        fhb.field_p = false;
                        break L7;
                      } else {
                        var18[var6] = 0;
                        var6++;
                        continue L9;
                      }
                    }
                  } else {
                    var17[var2] = 0;
                    var2++;
                    continue L8;
                  }
                }
              } else {
                break L7;
              }
            }
            L10: {
              if (enb.field_b) {
                vjb.a((byte) 95);
                qo.a(15);
                ija.a(114);
                enb.field_b = false;
                break L10;
              } else {
                break L10;
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    static {
    }
}
