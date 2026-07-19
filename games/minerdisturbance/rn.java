/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rn {
    private int field_g;
    private int field_f;
    private int field_b;
    private int field_a;
    private int[] field_d;
    private int field_e;
    private int field_c;

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
        vg var14 = null;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int[] var19 = null;
        int[] var22 = null;
        float[] var27 = null;
        float[] var28 = null;
        var4 = 0;
        L0: while (true) {
          if (var4 >= param1) {
            if (!param2) {
              var4 = b.field_O[this.field_e].field_f;
              var5 = this.field_g - this.field_c;
              var6 = var5 / this.field_f;
              var22 = new int[var6];
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
                          var10 = b.field_O[this.field_e].b();
                          var11 = var4 - 1;
                          L4: while (true) {
                            if (var11 < 0) {
                              break L3;
                            } else {
                              L5: {
                                if (var9 + var11 >= var6) {
                                  break L5;
                                } else {
                                  var7[var9 + var11] = var10 % this.field_b;
                                  break L5;
                                }
                              }
                              var10 = var10 / this.field_b;
                              var11--;
                              continue L4;
                            }
                          }
                        }
                      }
                      var22 = var19;
                      var10 = 0;
                      L6: while (true) {
                        if (var10 >= var4) {
                          continue L2;
                        } else {
                          L7: {
                            var11 = var22[var9];
                            var12 = this.field_d[var11 * 8 + var8];
                            if (var12 < 0) {
                              break L7;
                            } else {
                              var13 = this.field_c + var9 * this.field_f;
                              var14 = b.field_O[var12];
                              if (this.field_a != 0) {
                                var15 = 0;
                                L8: while (true) {
                                  if (var15 >= this.field_f) {
                                    break L7;
                                  } else {
                                    var28 = var14.a();
                                    var17 = 0;
                                    L9: while (true) {
                                      if (var17 >= var14.field_f) {
                                        continue L8;
                                      } else {
                                        param0[var13 + var15] = param0[var13 + var15] + var28[var17];
                                        var15++;
                                        var17++;
                                        continue L9;
                                      }
                                    }
                                  }
                                }
                              } else {
                                var15 = this.field_f / var14.field_f;
                                var16 = 0;
                                L10: while (true) {
                                  if (var16 >= var15) {
                                    break L7;
                                  } else {
                                    var27 = var14.a();
                                    var18 = 0;
                                    L11: while (true) {
                                      if (var18 >= var14.field_f) {
                                        var16++;
                                        continue L10;
                                      } else {
                                        param0[var13 + var16 + var18 * var15] = param0[var13 + var16 + var18 * var15] + var27[var18];
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

    rn() {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var2 = 0;
        this.field_a = b.f(16);
        this.field_c = b.f(24);
        this.field_g = b.f(24);
        this.field_f = b.f(24) + 1;
        this.field_b = b.f(6) + 1;
        this.field_e = b.f(8);
        int[] var1 = new int[this.field_b];
        for (var2 = 0; var2 < this.field_b; var2++) {
            var3 = 0;
            var4 = b.f(3);
            var5 = b.c() != 0 ? 1 : 0;
            if (var5 != 0) {
                var3 = b.f(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field_d = new int[this.field_b * 8];
        int var6 = 0;
        var2 = var6;
        while (var6 < this.field_b * 8) {
            this.field_d[var6] = (var1[var6 >> 3] & 1 << (var6 & 7)) != 0 ? b.f(8) : -1;
            var6++;
        }
    }
}
