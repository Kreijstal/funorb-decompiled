/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mi {
    private int field_c;
    private int field_e;
    private int field_b;
    private int field_f;
    private int[] field_a;
    private int field_g;
    private int field_d;

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
        wb var14 = null;
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
              var4 = sf.field_F[((mi) this).field_d].field_e;
              var5 = ((mi) this).field_c - ((mi) this).field_e;
              var6 = var5 / ((mi) this).field_b;
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
                          var10 = sf.field_F[((mi) this).field_d].c();
                          var11 = var4 - 1;
                          L4: while (true) {
                            if (var11 < 0) {
                              break L3;
                            } else {
                              L5: {
                                if (var9 + var11 >= var6) {
                                  break L5;
                                } else {
                                  var7[var9 + var11] = var10 % ((mi) this).field_f;
                                  break L5;
                                }
                              }
                              var10 = var10 / ((mi) this).field_f;
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
                            var12 = ((mi) this).field_a[var11 * 8 + var8];
                            if (var12 < 0) {
                              break L7;
                            } else {
                              var13 = ((mi) this).field_e + var9 * ((mi) this).field_b;
                              var14 = sf.field_F[var12];
                              if (((mi) this).field_g != 0) {
                                var15 = 0;
                                L8: while (true) {
                                  if (var15 >= ((mi) this).field_b) {
                                    break L7;
                                  } else {
                                    var30 = var14.a();
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
                                var15 = ((mi) this).field_b / var14.field_e;
                                var16 = 0;
                                L10: while (true) {
                                  if (var16 >= var15) {
                                    break L7;
                                  } else {
                                    var29 = var14.a();
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

    mi() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        ((mi) this).field_g = sf.f(16);
        ((mi) this).field_e = sf.f(24);
        ((mi) this).field_c = sf.f(24);
        ((mi) this).field_b = sf.f(24) + 1;
        ((mi) this).field_f = sf.f(6) + 1;
        ((mi) this).field_d = sf.f(8);
        int[] var1 = new int[((mi) this).field_f];
        for (var2 = 0; var2 < ((mi) this).field_f; var2++) {
            var3 = 0;
            var4 = sf.f(3);
            var5 = sf.b() != 0 ? 1 : 0;
            if (var5 != 0) {
                var3 = sf.f(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        ((mi) this).field_a = new int[((mi) this).field_f * 8];
        int var6 = 0;
        var2 = var6;
        while (var6 < ((mi) this).field_f * 8) {
            ((mi) this).field_a[var6] = (var1[var6 >> 3] & 1 << (var6 & 7)) != 0 ? sf.f(8) : -1;
            var6++;
        }
    }
}
