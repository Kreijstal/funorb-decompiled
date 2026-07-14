/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qd {
    private int field_e;
    private int field_c;
    private int[] field_d;
    private int field_g;
    private int field_f;
    private int field_a;
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
        un var14 = null;
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
              var4 = ai.field_L[((qd) this).field_a].field_a;
              var5 = ((qd) this).field_e - ((qd) this).field_b;
              var6 = var5 / ((qd) this).field_f;
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
                          var10 = ai.field_L[((qd) this).field_a].a();
                          var11 = var4 - 1;
                          L4: while (true) {
                            if (var11 < 0) {
                              break L3;
                            } else {
                              L5: {
                                if (var9 + var11 >= var6) {
                                  break L5;
                                } else {
                                  var7[var9 + var11] = var10 % ((qd) this).field_c;
                                  break L5;
                                }
                              }
                              var10 = var10 / ((qd) this).field_c;
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
                            var12 = ((qd) this).field_d[var11 * 8 + var8];
                            if (var12 < 0) {
                              break L7;
                            } else {
                              var13 = ((qd) this).field_b + var9 * ((qd) this).field_f;
                              var14 = ai.field_L[var12];
                              if (((qd) this).field_g != 0) {
                                var15 = 0;
                                L8: while (true) {
                                  if (var15 >= ((qd) this).field_f) {
                                    break L7;
                                  } else {
                                    var30 = var14.c();
                                    var17 = 0;
                                    L9: while (true) {
                                      if (var17 >= var14.field_a) {
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
                                var15 = ((qd) this).field_f / var14.field_a;
                                var16 = 0;
                                L10: while (true) {
                                  if (var16 >= var15) {
                                    break L7;
                                  } else {
                                    var29 = var14.c();
                                    var18 = 0;
                                    L11: while (true) {
                                      if (var18 >= var14.field_a) {
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

    qd() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        ((qd) this).field_g = ai.d(16);
        ((qd) this).field_b = ai.d(24);
        ((qd) this).field_e = ai.d(24);
        ((qd) this).field_f = ai.d(24) + 1;
        ((qd) this).field_c = ai.d(6) + 1;
        ((qd) this).field_a = ai.d(8);
        int[] var1 = new int[((qd) this).field_c];
        for (var2 = 0; var2 < ((qd) this).field_c; var2++) {
            var3 = 0;
            var4 = ai.d(3);
            var5 = ai.a() != 0 ? 1 : 0;
            if (var5 != 0) {
                var3 = ai.d(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        ((qd) this).field_d = new int[((qd) this).field_c * 8];
        int var6 = 0;
        var2 = var6;
        while (var6 < ((qd) this).field_c * 8) {
            ((qd) this).field_d[var6] = (var1[var6 >> 3] & 1 << (var6 & 7)) != 0 ? ai.d(8) : -1;
            var6++;
        }
    }
}
