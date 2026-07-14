/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ie {
    private int field_b;
    private int[] field_d;
    private int field_a;
    private int field_g;
    private int field_e;
    private int field_c;
    private int field_f;

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
        k var14 = null;
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
              var4 = bl.field_K[((ie) this).field_a].field_b;
              var5 = ((ie) this).field_c - ((ie) this).field_e;
              var6 = var5 / ((ie) this).field_g;
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
                          var10 = bl.field_K[((ie) this).field_a].b();
                          var11 = var4 - 1;
                          L4: while (true) {
                            if (var11 < 0) {
                              break L3;
                            } else {
                              L5: {
                                if (var9 + var11 >= var6) {
                                  break L5;
                                } else {
                                  var7[var9 + var11] = var10 % ((ie) this).field_b;
                                  break L5;
                                }
                              }
                              var10 = var10 / ((ie) this).field_b;
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
                            var12 = ((ie) this).field_d[var11 * 8 + var8];
                            if (var12 < 0) {
                              break L7;
                            } else {
                              var13 = ((ie) this).field_e + var9 * ((ie) this).field_g;
                              var14 = bl.field_K[var12];
                              if (((ie) this).field_f != 0) {
                                var15 = 0;
                                L8: while (true) {
                                  if (var15 >= ((ie) this).field_g) {
                                    break L7;
                                  } else {
                                    var30 = var14.a();
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
                                var15 = ((ie) this).field_g / var14.field_b;
                                var16 = 0;
                                L10: while (true) {
                                  if (var16 >= var15) {
                                    break L7;
                                  } else {
                                    var29 = var14.a();
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

    ie() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        ((ie) this).field_f = bl.a(16);
        ((ie) this).field_e = bl.a(24);
        ((ie) this).field_c = bl.a(24);
        ((ie) this).field_g = bl.a(24) + 1;
        ((ie) this).field_b = bl.a(6) + 1;
        ((ie) this).field_a = bl.a(8);
        int[] var1 = new int[((ie) this).field_b];
        for (var2 = 0; var2 < ((ie) this).field_b; var2++) {
            var3 = 0;
            var4 = bl.a(3);
            var5 = bl.b() != 0 ? 1 : 0;
            if (var5 != 0) {
                var3 = bl.a(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        ((ie) this).field_d = new int[((ie) this).field_b * 8];
        int var6 = 0;
        var2 = var6;
        while (var6 < ((ie) this).field_b * 8) {
            ((ie) this).field_d[var6] = (var1[var6 >> 3] & 1 << (var6 & 7)) != 0 ? bl.a(8) : -1;
            var6++;
        }
    }
}
