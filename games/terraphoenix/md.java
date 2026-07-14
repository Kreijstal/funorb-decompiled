/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class md {
    private int field_f;
    private int field_e;
    private int field_a;
    private int field_g;
    private int field_d;
    private int field_b;
    private int[] field_c;

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
        hg var14 = null;
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
              var4 = tl.field_H[((md) this).field_f].field_b;
              var5 = ((md) this).field_a - ((md) this).field_g;
              var6 = var5 / ((md) this).field_b;
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
                          var10 = tl.field_H[((md) this).field_f].a();
                          var11 = var4 - 1;
                          L4: while (true) {
                            if (var11 < 0) {
                              break L3;
                            } else {
                              L5: {
                                if (var9 + var11 >= var6) {
                                  break L5;
                                } else {
                                  var7[var9 + var11] = var10 % ((md) this).field_d;
                                  break L5;
                                }
                              }
                              var10 = var10 / ((md) this).field_d;
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
                            var12 = ((md) this).field_c[var11 * 8 + var8];
                            if (var12 < 0) {
                              break L7;
                            } else {
                              var13 = ((md) this).field_g + var9 * ((md) this).field_b;
                              var14 = tl.field_H[var12];
                              if (((md) this).field_e != 0) {
                                var15 = 0;
                                L8: while (true) {
                                  if (var15 >= ((md) this).field_b) {
                                    break L7;
                                  } else {
                                    var30 = var14.c();
                                    var17 = 0;
                                    L9: while (true) {
                                      if (var17 >= var14.field_b) {
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
                                var15 = ((md) this).field_b / var14.field_b;
                                var16 = 0;
                                L10: while (true) {
                                  if (var16 >= var15) {
                                    break L7;
                                  } else {
                                    var29 = var14.c();
                                    var18 = 0;
                                    L11: while (true) {
                                      if (var18 >= var14.field_b) {
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

    md() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        ((md) this).field_e = tl.d(16);
        ((md) this).field_g = tl.d(24);
        ((md) this).field_a = tl.d(24);
        ((md) this).field_b = tl.d(24) + 1;
        ((md) this).field_d = tl.d(6) + 1;
        ((md) this).field_f = tl.d(8);
        int[] var1 = new int[((md) this).field_d];
        for (var2 = 0; var2 < ((md) this).field_d; var2++) {
            var3 = 0;
            var4 = tl.d(3);
            var5 = tl.c() != 0 ? 1 : 0;
            if (var5 != 0) {
                var3 = tl.d(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        ((md) this).field_c = new int[((md) this).field_d * 8];
        int var6 = 0;
        var2 = var6;
        while (var6 < ((md) this).field_d * 8) {
            ((md) this).field_c[var6] = (var1[var6 >> 3] & 1 << (var6 & 7)) != 0 ? tl.d(8) : -1;
            var6++;
        }
    }
}
