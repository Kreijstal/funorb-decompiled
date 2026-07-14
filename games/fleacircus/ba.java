/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ba {
    private int field_c;
    private int field_e;
    private int field_f;
    private int field_d;
    private int field_g;
    private int[] field_a;
    private int field_b;

    final void a(float[] param0, int param1, boolean param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        sl var14 = null;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int[] var19 = null;
        int[] var22 = null;
        int[] var25 = null;
        int[] var28 = null;
        float[] var29 = null;
        float[] var30 = null;
        var4 = 0;
        L0: while (true) {
          if (var4 >= param1) {
            if (!param2) {
              var4 = hk.field_G[((ba) this).field_c].field_e;
              var5 = ((ba) this).field_b - ((ba) this).field_f;
              var6 = var5 / ((ba) this).field_g;
              var28 = new int[var6];
              var25 = var28;
              var22 = var25;
              var19 = var22;
              var7 = var19;
              var8 = 0;
              L1: while (true) {
                if (var8 >= 8) {
                  return;
                } else {
                  var9 = 0;
                  L2: while (true) {
                    if (var9 >= var6) {
                      var8++;
                      continue L1;
                    } else {
                      L3: {
                        if (var8 != 0) {
                          break L3;
                        } else {
                          var10 = hk.field_G[((ba) this).field_c].a();
                          var11 = var4 - 1;
                          L4: while (true) {
                            if (var11 < 0) {
                              break L3;
                            } else {
                              L5: {
                                if (var9 + var11 >= var6) {
                                  break L5;
                                } else {
                                  var7[var9 + var11] = var10 % ((ba) this).field_d;
                                  break L5;
                                }
                              }
                              var10 = var10 / ((ba) this).field_d;
                              var11--;
                              continue L4;
                            }
                          }
                        }
                      }
                      var28 = var25;
                      var10 = 0;
                      L6: while (true) {
                        if (var10 >= var4) {
                          continue L2;
                        } else {
                          L7: {
                            var11 = var28[var9];
                            var12 = ((ba) this).field_a[var11 * 8 + var8];
                            if (var12 < 0) {
                              break L7;
                            } else {
                              var13 = ((ba) this).field_f + var9 * ((ba) this).field_g;
                              var14 = hk.field_G[var12];
                              if (((ba) this).field_e != 0) {
                                var15 = 0;
                                L8: while (true) {
                                  if (var15 >= ((ba) this).field_g) {
                                    break L7;
                                  } else {
                                    var30 = var14.c();
                                    var17 = 0;
                                    L9: while (true) {
                                      if (var17 >= var14.field_e) {
                                        continue L8;
                                      } else {
                                        param0[var13 + var15] = param0[var13 + var15] + var30[var17];
                                        var15++;
                                        var17++;
                                        continue L9;
                                      }
                                    }
                                  }
                                }
                              } else {
                                var15 = ((ba) this).field_g / var14.field_e;
                                var16 = 0;
                                L10: while (true) {
                                  if (var16 >= var15) {
                                    break L7;
                                  } else {
                                    var29 = var14.c();
                                    var18 = 0;
                                    L11: while (true) {
                                      if (var18 >= var14.field_e) {
                                        var16++;
                                        continue L10;
                                      } else {
                                        param0[var13 + var16 + var18 * var15] = param0[var13 + var16 + var18 * var15] + var29[var18];
                                        var18++;
                                        continue L11;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          var9++;
                          if (var9 < var6) {
                            var10++;
                            continue L6;
                          } else {
                            continue L2;
                          }
                        }
                      }
                    }
                  }
                }
              }
            } else {
              return;
            }
          } else {
            param0[var4] = 0.0f;
            var4++;
            continue L0;
          }
        }
    }

    ba() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        ((ba) this).field_e = hk.e(16);
        ((ba) this).field_f = hk.e(24);
        ((ba) this).field_b = hk.e(24);
        ((ba) this).field_g = hk.e(24) + 1;
        ((ba) this).field_d = hk.e(6) + 1;
        ((ba) this).field_c = hk.e(8);
        int[] var1 = new int[((ba) this).field_d];
        for (var2 = 0; var2 < ((ba) this).field_d; var2++) {
            var3 = 0;
            var4 = hk.e(3);
            var5 = hk.c() != 0 ? 1 : 0;
            if (var5 != 0) {
                var3 = hk.e(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        ((ba) this).field_a = new int[((ba) this).field_d * 8];
        int var6 = 0;
        var2 = var6;
        while (var6 < ((ba) this).field_d * 8) {
            ((ba) this).field_a[var6] = (var1[var6 >> 3] & 1 << (var6 & 7)) != 0 ? hk.e(8) : -1;
            var6++;
        }
    }
}
