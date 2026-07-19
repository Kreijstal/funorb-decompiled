/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ta extends gp {
    he field_v;
    private float field_t;
    private int[] field_x;
    private int field_u;
    private boolean field_y;
    private boolean field_w;

    final int[] a(ka param0, r param1, float param2, boolean param3) {
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
        int[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        int[] var33 = null;
        int[] var34 = null;
        int[] var35 = null;
        int[] var39 = null;
        int[] var40 = null;
        int[] var41 = null;
        int[] var42 = null;
        int[] var43 = null;
        int[] var44 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_46_0 = null;
        Object stackIn_47_0 = null;
        Object stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        Object stackOut_45_0 = null;
        Object stackOut_47_0 = null;
        int stackOut_47_1 = 0;
        Object stackOut_46_0 = null;
        int stackOut_46_1 = 0;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        if (this.field_x != null) {
          if (this.field_t != param2) {
            if (this.field_v.a(param1, param0, 0)) {
              L0: {
                stackOut_45_0 = this;
                stackIn_47_0 = stackOut_45_0;
                stackIn_46_0 = stackOut_45_0;
                if (!param3) {
                  stackOut_47_0 = this;
                  stackOut_47_1 = 128;
                  stackIn_48_0 = stackOut_47_0;
                  stackIn_48_1 = stackOut_47_1;
                  break L0;
                } else {
                  stackOut_46_0 = this;
                  stackOut_46_1 = 64;
                  stackIn_48_0 = stackOut_46_0;
                  stackIn_48_1 = stackOut_46_1;
                  break L0;
                }
              }
              ((ta) (this)).field_u = stackIn_48_1;
              this.field_x = this.field_v.a(param1, (double)param2, true, this.field_y, this.field_u, 27127, this.field_u, param0);
              this.field_t = param2;
              if (this.field_w) {
                var42 = new int[this.field_u];
                var33 = var42;
                var5 = var33;
                var43 = new int[this.field_u];
                var34 = var43;
                var6 = var34;
                var44 = new int[this.field_u];
                var35 = var44;
                var7 = var35;
                var8 = new int[this.field_u * this.field_u];
                var13 = this.field_u;
                var14 = this.field_u;
                var15 = var13 - 1;
                var16 = var14 - 1;
                var17 = var13 * var14;
                var12 = 1 * var13;
                var11 = 1 * var13;
                var18 = 2;
                L1: while (true) {
                  if (var18 < 0) {
                    var23 = var17;
                    var29 = var16;
                    L2: while (true) {
                      if (var29 < 0) {
                        this.field_x = var8;
                        return this.field_x;
                      } else {
                        var24 = 1;
                        var25 = 1;
                        var28 = 0;
                        var27 = 0;
                        var26 = 0;
                        var9 = 2;
                        L3: while (true) {
                          if (var9 < 0) {
                            var9 = var15;
                            L4: while (true) {
                              if (var9 < 0) {
                                var9 = var15;
                                L5: while (true) {
                                  if (var9 < 0) {
                                    L6: {
                                      if (var12 != 0) {
                                        break L6;
                                      } else {
                                        var12 = var17;
                                        break L6;
                                      }
                                    }
                                    if (var11 == 0) {
                                      var11 = var17;
                                      var29--;
                                      continue L2;
                                    } else {
                                      var29--;
                                      continue L2;
                                    }
                                  } else {
                                    var12--;
                                    var22 = this.field_x[var12];
                                    var11--;
                                    var21 = this.field_x[var11];
                                    var5[var9] = var5[var9] + ((var22 >> 16 & 255) - (var21 >> 16 & 255));
                                    var6[var9] = var6[var9] + ((var22 >> 8 & 255) - (var21 >> 8 & 255));
                                    var7[var9] = var7[var9] + ((var22 & 255) - (var21 & 255));
                                    var9--;
                                    continue L5;
                                  }
                                }
                              } else {
                                L7: {
                                  var25--;
                                  var24--;
                                  var18 = var26 / 9;
                                  var19 = var28 / 9;
                                  var20 = var27 / 9;
                                  var23--;
                                  var8[var23] = var18 << 16 | var19 << 8 | var20;
                                  var26 = var26 + (var42[var25] - var42[var24]);
                                  var27 = var27 + (var44[var25] - var44[var24]);
                                  var28 = var28 + (var43[var25] - var43[var24]);
                                  if (var25 != 0) {
                                    break L7;
                                  } else {
                                    var25 = var13;
                                    break L7;
                                  }
                                }
                                if (var24 == 0) {
                                  var24 = var13;
                                  var9--;
                                  continue L4;
                                } else {
                                  var9--;
                                  continue L4;
                                }
                              }
                            }
                          } else {
                            var25--;
                            var26 = var26 + var42[var25];
                            var28 = var28 + var43[var25];
                            var27 = var27 + var44[var25];
                            if (var25 == 0) {
                              var25 = var13;
                              var9--;
                              continue L3;
                            } else {
                              var9--;
                              continue L3;
                            }
                          }
                        }
                      }
                    }
                  } else {
                    var9 = var15;
                    L8: while (true) {
                      if (var9 < 0) {
                        if (var12 == 0) {
                          var12 = var17;
                          var18--;
                          continue L1;
                        } else {
                          var18--;
                          continue L1;
                        }
                      } else {
                        var12--;
                        var10 = this.field_x[var12];
                        var5[var9] = var5[var9] + (var10 >> 16 & 255);
                        var6[var9] = var6[var9] + (var10 >> 8 & 255);
                        var7[var9] = var7[var9] + (var10 & 255);
                        var9--;
                        continue L8;
                      }
                    }
                  }
                }
              } else {
                return this.field_x;
              }
            } else {
              return null;
            }
          } else {
            return this.field_x;
          }
        } else {
          if (this.field_v.a(param1, param0, 0)) {
            L9: {
              stackOut_3_0 = this;
              stackIn_5_0 = stackOut_3_0;
              stackIn_4_0 = stackOut_3_0;
              if (!param3) {
                stackOut_5_0 = this;
                stackOut_5_1 = 128;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                break L9;
              } else {
                stackOut_4_0 = this;
                stackOut_4_1 = 64;
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                break L9;
              }
            }
            ((ta) (this)).field_u = stackIn_6_1;
            this.field_x = this.field_v.a(param1, (double)param2, true, this.field_y, this.field_u, 27127, this.field_u, param0);
            this.field_t = param2;
            if (this.field_w) {
              var39 = new int[this.field_u];
              var30 = var39;
              var5 = var30;
              var40 = new int[this.field_u];
              var31 = var40;
              var6 = var31;
              var41 = new int[this.field_u];
              var32 = var41;
              var7 = var32;
              var8 = new int[this.field_u * this.field_u];
              var13 = this.field_u;
              var14 = this.field_u;
              var15 = var13 - 1;
              var16 = var14 - 1;
              var17 = var13 * var14;
              var12 = 1 * var13;
              var11 = 1 * var13;
              var18 = 2;
              L10: while (true) {
                if (var18 < 0) {
                  var23 = var17;
                  var29 = var16;
                  L11: while (true) {
                    if (var29 < 0) {
                      this.field_x = var8;
                      return this.field_x;
                    } else {
                      var24 = 1;
                      var25 = 1;
                      var28 = 0;
                      var27 = 0;
                      var26 = 0;
                      var9 = 2;
                      L12: while (true) {
                        if (var9 < 0) {
                          var9 = var15;
                          L13: while (true) {
                            if (var9 < 0) {
                              var9 = var15;
                              L14: while (true) {
                                if (var9 < 0) {
                                  L15: {
                                    if (var12 != 0) {
                                      break L15;
                                    } else {
                                      var12 = var17;
                                      break L15;
                                    }
                                  }
                                  if (var11 == 0) {
                                    var11 = var17;
                                    var29--;
                                    continue L11;
                                  } else {
                                    var29--;
                                    continue L11;
                                  }
                                } else {
                                  var12--;
                                  var22 = this.field_x[var12];
                                  var11--;
                                  var21 = this.field_x[var11];
                                  var5[var9] = var5[var9] + ((var22 >> 16 & 255) - (var21 >> 16 & 255));
                                  var6[var9] = var6[var9] + ((var22 >> 8 & 255) - (var21 >> 8 & 255));
                                  var7[var9] = var7[var9] + ((var22 & 255) - (var21 & 255));
                                  var9--;
                                  continue L14;
                                }
                              }
                            } else {
                              L16: {
                                var25--;
                                var24--;
                                var18 = var26 / 9;
                                var19 = var28 / 9;
                                var20 = var27 / 9;
                                var23--;
                                var8[var23] = var18 << 16 | var19 << 8 | var20;
                                var26 = var26 + (var39[var25] - var39[var24]);
                                var27 = var27 + (var41[var25] - var41[var24]);
                                var28 = var28 + (var40[var25] - var40[var24]);
                                if (var25 != 0) {
                                  break L16;
                                } else {
                                  var25 = var13;
                                  break L16;
                                }
                              }
                              if (var24 == 0) {
                                var24 = var13;
                                var9--;
                                continue L13;
                              } else {
                                var9--;
                                continue L13;
                              }
                            }
                          }
                        } else {
                          var25--;
                          var26 = var26 + var39[var25];
                          var28 = var28 + var40[var25];
                          var27 = var27 + var41[var25];
                          if (var25 == 0) {
                            var25 = var13;
                            var9--;
                            continue L12;
                          } else {
                            var9--;
                            continue L12;
                          }
                        }
                      }
                    }
                  }
                } else {
                  var9 = var15;
                  L17: while (true) {
                    if (var9 < 0) {
                      if (var12 == 0) {
                        var12 = var17;
                        var18--;
                        continue L10;
                      } else {
                        var18--;
                        continue L10;
                      }
                    } else {
                      var12--;
                      var10 = this.field_x[var12];
                      var5[var9] = var5[var9] + (var10 >> 16 & 255);
                      var6[var9] = var6[var9] + (var10 >> 8 & 255);
                      var7[var9] = var7[var9] + (var10 & 255);
                      var9--;
                      continue L17;
                    }
                  }
                }
              }
            } else {
              return this.field_x;
            }
          } else {
            return null;
          }
        }
    }

    ta(ed param0) {
        this.field_v = new he(param0);
        this.field_w = param0.h(-11) == 1 ? true : false;
        this.field_y = param0.h(-11) == 1 ? true : false;
        int discarded$0 = param0.h(-11);
        int discarded$1 = param0.h(-11);
        int var2 = param0.h(-11) & 3;
        byte discarded$22 = param0.g(98);
        byte discarded$39 = param0.g(126);
        int discarded$52 = param0.h(-11);
        int discarded$61 = param0.h(-11);
        int discarded$66 = param0.h(-11);
        if (var2 == 1) {
            return;
        }
        if (var2 == 2) {
            return;
        }
        if (var2 == 3) {
        }
    }
}
