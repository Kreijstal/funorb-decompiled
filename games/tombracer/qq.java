/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qq extends vg {
    boolean field_g;
    int field_j;
    private int field_i;
    private static int[] field_h;
    private int[] field_k;
    int field_f;

    final int[] b() {
        return this.field_k;
    }

    final void a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        L0: {
          if (param0 != 0) {
            break L0;
          } else {
            if (param1 != 0) {
              break L0;
            } else {
              return;
            }
          }
        }
        L1: {
          L2: {
            if (field_h == null) {
              break L2;
            } else {
              if (field_h.length == this.field_k.length) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          field_h = new int[this.field_k.length];
          break L1;
        }
        var3 = this.field_k.length;
        var4 = param0;
        var5 = this.field_i - 1;
        var6 = this.field_i * param1;
        var7 = var3 - 1;
        var8_int = 0;
        L3: while (true) {
          if (var8_int >= var3) {
            var8 = this.field_k;
            this.field_k = field_h;
            field_h = var8;
            return;
          } else {
            var9 = var8_int + var6 & var7;
            var10 = 0;
            L4: while (true) {
              if (var10 >= this.field_i) {
                var8_int = var8_int + this.field_i;
                continue L3;
              } else {
                var11 = var8_int + var10;
                var12 = var9 + (var10 + var4 & var5);
                field_h[var11] = this.field_k[var12];
                var10++;
                continue L4;
              }
            }
          }
        }
    }

    public static void a() {
        field_h = null;
    }

    qq(int param0, int param1, int[] param2, boolean param3) {
        int[] var5 = null;
        int[] var6 = null;
        int[] var7 = null;
        int[] var8 = null;
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
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31_int = 0;
        int[] var31 = null;
        int[] var32 = null;
        int[] var33 = null;
        int[] var34 = null;
        int[] var35 = null;
        int[] var36 = null;
        int[] var37 = null;
        int[] var38 = null;
        int[] var39 = null;
        L0: {
          this.field_f = param0;
          this.field_i = param1;
          this.field_k = param2;
          if (!param3) {
            break L0;
          } else {
            L1: {
              L2: {
                var36 = new int[this.field_i];
                var32 = var36;
                var5 = var32;
                var37 = new int[this.field_i];
                var33 = var37;
                var6 = var33;
                var38 = new int[this.field_i];
                var34 = var38;
                var7 = var34;
                var39 = new int[this.field_i];
                var35 = var39;
                var8 = var35;
                if (field_h == null) {
                  break L2;
                } else {
                  if (field_h.length == this.field_k.length) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              field_h = new int[this.field_k.length];
              break L1;
            }
            var13 = this.field_i;
            var14 = this.field_i;
            var15 = var13 - 1;
            var16 = var14 - 1;
            var17 = var13 * var14;
            var12 = 1 * var13;
            var11 = 1 * var13;
            var18 = 2;
            L3: while (true) {
              if (var18 < 0) {
                var24 = var17;
                var31_int = var16;
                L4: while (true) {
                  if (var31_int < 0) {
                    var31 = this.field_k;
                    this.field_k = field_h;
                    field_h = var31;
                    break L0;
                  } else {
                    var25 = 1;
                    var26 = 1;
                    var30 = 0;
                    var29 = 0;
                    var28 = 0;
                    var27 = 0;
                    var9 = 2;
                    L5: while (true) {
                      if (var9 < 0) {
                        var9 = var15;
                        L6: while (true) {
                          if (var9 < 0) {
                            var9 = var15;
                            L7: while (true) {
                              if (var9 < 0) {
                                L8: {
                                  if (var12 != 0) {
                                    break L8;
                                  } else {
                                    var12 = var17;
                                    break L8;
                                  }
                                }
                                if (var11 == 0) {
                                  var11 = var17;
                                  var31_int--;
                                  continue L4;
                                } else {
                                  var31_int--;
                                  continue L4;
                                }
                              } else {
                                var12--;
                                var23 = this.field_k[var12];
                                var11--;
                                var22 = this.field_k[var11];
                                var5[var9] = var5[var9] + ((var23 >> 24 & 255) - (var22 >> 24 & 255));
                                var6[var9] = var6[var9] + ((var23 >> 16 & 255) - (var22 >> 16 & 255));
                                var7[var9] = var7[var9] + ((var23 >> 8 & 255) - (var22 >> 8 & 255));
                                var8[var9] = var8[var9] + ((var23 & 255) - (var22 & 255));
                                var9--;
                                continue L7;
                              }
                            }
                          } else {
                            L9: {
                              var26--;
                              var25--;
                              var18 = var27 / 9;
                              var19 = var28 / 9;
                              var20 = var30 / 9;
                              var21 = var29 / 9;
                              var24--;
                              field_h[var24] = var18 << 24 | var19 << 16 | var20 << 8 | var21;
                              var27 = var27 + (var36[var26] - var36[var25]);
                              var28 = var28 + (var37[var26] - var37[var25]);
                              var29 = var29 + (var39[var26] - var39[var25]);
                              var30 = var30 + (var38[var26] - var38[var25]);
                              if (var26 != 0) {
                                break L9;
                              } else {
                                var26 = var13;
                                break L9;
                              }
                            }
                            if (var25 == 0) {
                              var25 = var13;
                              var9--;
                              continue L6;
                            } else {
                              var9--;
                              continue L6;
                            }
                          }
                        }
                      } else {
                        var26--;
                        var27 = var27 + var36[var26];
                        var28 = var28 + var37[var26];
                        var30 = var30 + var38[var26];
                        var29 = var29 + var39[var26];
                        if (var26 == 0) {
                          var26 = var13;
                          var9--;
                          continue L5;
                        } else {
                          var9--;
                          continue L5;
                        }
                      }
                    }
                  }
                }
              } else {
                var9 = var15;
                L10: while (true) {
                  if (var9 < 0) {
                    if (var12 == 0) {
                      var12 = var17;
                      var18--;
                      continue L3;
                    } else {
                      var18--;
                      continue L3;
                    }
                  } else {
                    var12--;
                    var10 = this.field_k[var12];
                    var5[var9] = var5[var9] + (var10 >> 24 & 255);
                    var6[var9] = var6[var9] + (var10 >> 16 & 255);
                    var7[var9] = var7[var9] + (var10 >> 8 & 255);
                    var8[var9] = var8[var9] + (var10 & 255);
                    var9--;
                    continue L10;
                  }
                }
              }
            }
          }
        }
    }
}
