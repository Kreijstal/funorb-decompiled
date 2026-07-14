/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cg extends eo {
    private int[] field_n;
    on field_q;
    private float field_r;
    private boolean field_p;
    private boolean field_s;
    private int field_o;

    cg(lu param0) {
        ((cg) this).field_q = new on(param0);
        ((cg) this).field_p = param0.b(16711935) == 1 ? true : false;
        ((cg) this).field_s = param0.b(16711935) == 1 ? true : false;
        int discarded$0 = param0.b(16711935);
        int discarded$1 = param0.b(16711935);
        int var2 = param0.b(16711935) & 3;
        byte discarded$22 = param0.b(true);
        byte discarded$39 = param0.b(true);
        int discarded$52 = param0.b(16711935);
        int discarded$61 = param0.b(16711935);
        int discarded$66 = param0.b(16711935);
        if (var2 == 1) {
        }
        if (var2 == 2) {
        }
        if (var2 == 3) {
        }
    }

    final int[] a(q param0, vr param1, float param2, boolean param3) {
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
        int[] var48 = null;
        int[] var49 = null;
        int[] var50 = null;
        int[] var51 = null;
        int[] var52 = null;
        int[] var53 = null;
        int[] var57 = null;
        int[] var58 = null;
        int[] var59 = null;
        int[] var60 = null;
        int[] var61 = null;
        int[] var62 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_45_0 = null;
        Object stackIn_46_0 = null;
        Object stackIn_47_0 = null;
        int stackIn_47_1 = 0;
        Object stackOut_44_0 = null;
        Object stackOut_46_0 = null;
        int stackOut_46_1 = 0;
        Object stackOut_45_0 = null;
        int stackOut_45_1 = 0;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        if (((cg) this).field_n != null) {
          if (((cg) this).field_r != param2) {
            if (((cg) this).field_q.a(param0, param1, -90)) {
              L0: {
                stackOut_44_0 = this;
                stackIn_46_0 = stackOut_44_0;
                stackIn_45_0 = stackOut_44_0;
                if (!param3) {
                  stackOut_46_0 = this;
                  stackOut_46_1 = 128;
                  stackIn_47_0 = stackOut_46_0;
                  stackIn_47_1 = stackOut_46_1;
                  break L0;
                } else {
                  stackOut_45_0 = this;
                  stackOut_45_1 = 64;
                  stackIn_47_0 = stackOut_45_0;
                  stackIn_47_1 = stackOut_45_1;
                  break L0;
                }
              }
              ((cg) this).field_o = stackIn_47_1;
              ((cg) this).field_n = ((cg) this).field_q.a((double)param2, ((cg) this).field_s, param0, ((cg) this).field_o, ((cg) this).field_o, param1, true, -1);
              ((cg) this).field_r = param2;
              if (((cg) this).field_p) {
                L1: {
                  var60 = new int[((cg) this).field_o];
                  var51 = var60;
                  var42 = var51;
                  var33 = var42;
                  var5 = var33;
                  var61 = new int[((cg) this).field_o];
                  var52 = var61;
                  var43 = var52;
                  var34 = var43;
                  var6 = var34;
                  var62 = new int[((cg) this).field_o];
                  var53 = var62;
                  var44 = var53;
                  var35 = var44;
                  var7 = var35;
                  var8 = new int[((cg) this).field_o * ((cg) this).field_o];
                  var13 = ((cg) this).field_o;
                  var14 = ((cg) this).field_o;
                  var15 = var13 - 1;
                  var16 = var14 - 1;
                  var17 = var13 * var14;
                  var12 = 1 * var13;
                  var11 = 1 * var13;
                  var18 = 2;
                  if (var18 < 0) {
                    break L1;
                  } else {
                    var9 = var15;
                    L2: while (true) {
                      if (var9 < 0) {
                        L3: {
                          if (var12 != 0) {
                            var18--;
                            break L3;
                          } else {
                            var12 = var17;
                            break L3;
                          }
                        }
                        var18--;
                        var18--;
                        break L1;
                      } else {
                        var12--;
                        var10 = ((cg) this).field_n[var12];
                        var5[var9] = var5[var9] + (var10 >> 16 & 255);
                        var6[var9] = var6[var9] + (var10 >> 8 & 255);
                        var7[var9] = var7[var9] + (var10 & 255);
                        var9--;
                        continue L2;
                      }
                    }
                  }
                }
                var23 = var17;
                var29 = var16;
                L4: while (true) {
                  if (var29 < 0) {
                    ((cg) this).field_n = var8;
                    return ((cg) this).field_n;
                  } else {
                    var24 = 1;
                    var25 = 1;
                    var28 = 0;
                    var27 = 0;
                    var26 = 0;
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
                                  var29--;
                                  continue L4;
                                } else {
                                  var29--;
                                  continue L4;
                                }
                              } else {
                                var12--;
                                var22 = ((cg) this).field_n[var12];
                                var11--;
                                var21 = ((cg) this).field_n[var11];
                                var5[var9] = var5[var9] + ((var22 >> 16 & 255) - (var21 >> 16 & 255));
                                var6[var9] = var6[var9] + ((var22 >> 8 & 255) - (var21 >> 8 & 255));
                                var7[var9] = var7[var9] + ((var22 & 255) - (var21 & 255));
                                var9--;
                                continue L7;
                              }
                            }
                          } else {
                            L9: {
                              var25--;
                              var24--;
                              var18 = var26 / 9;
                              var19 = var28 / 9;
                              var20 = var27 / 9;
                              var23--;
                              var8[var23] = var18 << 16 | var19 << 8 | var20;
                              var26 = var26 + (var60[var25] - var60[var24]);
                              var27 = var27 + (var62[var25] - var62[var24]);
                              var28 = var28 + (var61[var25] - var61[var24]);
                              if (var25 != 0) {
                                break L9;
                              } else {
                                var25 = var13;
                                break L9;
                              }
                            }
                            if (var24 == 0) {
                              var24 = var13;
                              var9--;
                              continue L6;
                            } else {
                              var9--;
                              continue L6;
                            }
                          }
                        }
                      } else {
                        var25--;
                        var26 = var26 + var60[var25];
                        var28 = var28 + var61[var25];
                        var27 = var27 + var62[var25];
                        if (var25 == 0) {
                          var25 = var13;
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
                return ((cg) this).field_n;
              }
            } else {
              return null;
            }
          } else {
            return ((cg) this).field_n;
          }
        } else {
          if (((cg) this).field_q.a(param0, param1, -90)) {
            L10: {
              stackOut_3_0 = this;
              stackIn_5_0 = stackOut_3_0;
              stackIn_4_0 = stackOut_3_0;
              if (!param3) {
                stackOut_5_0 = this;
                stackOut_5_1 = 128;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                break L10;
              } else {
                stackOut_4_0 = this;
                stackOut_4_1 = 64;
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                break L10;
              }
            }
            ((cg) this).field_o = stackIn_6_1;
            ((cg) this).field_n = ((cg) this).field_q.a((double)param2, ((cg) this).field_s, param0, ((cg) this).field_o, ((cg) this).field_o, param1, true, -1);
            ((cg) this).field_r = param2;
            if (((cg) this).field_p) {
              L11: {
                var57 = new int[((cg) this).field_o];
                var48 = var57;
                var39 = var48;
                var30 = var39;
                var5 = var30;
                var58 = new int[((cg) this).field_o];
                var49 = var58;
                var40 = var49;
                var31 = var40;
                var6 = var31;
                var59 = new int[((cg) this).field_o];
                var50 = var59;
                var41 = var50;
                var32 = var41;
                var7 = var32;
                var8 = new int[((cg) this).field_o * ((cg) this).field_o];
                var13 = ((cg) this).field_o;
                var14 = ((cg) this).field_o;
                var15 = var13 - 1;
                var16 = var14 - 1;
                var17 = var13 * var14;
                var12 = 1 * var13;
                var11 = 1 * var13;
                var18 = 2;
                if (var18 < 0) {
                  break L11;
                } else {
                  var9 = var15;
                  L12: while (true) {
                    if (var9 < 0) {
                      L13: {
                        if (var12 != 0) {
                          var18--;
                          break L13;
                        } else {
                          var12 = var17;
                          break L13;
                        }
                      }
                      var18--;
                      var18--;
                      var18--;
                      break L11;
                    } else {
                      var12--;
                      var10 = ((cg) this).field_n[var12];
                      var5[var9] = var5[var9] + (var10 >> 16 & 255);
                      var6[var9] = var6[var9] + (var10 >> 8 & 255);
                      var7[var9] = var7[var9] + (var10 & 255);
                      var9--;
                      continue L12;
                    }
                  }
                }
              }
              var23 = var17;
              var29 = var16;
              L14: while (true) {
                if (var29 < 0) {
                  ((cg) this).field_n = var8;
                  return ((cg) this).field_n;
                } else {
                  L15: {
                    var24 = 1;
                    var25 = 1;
                    var28 = 0;
                    var27 = 0;
                    var26 = 0;
                    var9 = 2;
                    if (var9 < 0) {
                      break L15;
                    } else {
                      L16: {
                        var25--;
                        var26 = var26 + var57[var25];
                        var28 = var28 + var58[var25];
                        var27 = var27 + var59[var25];
                        if (var25 != 0) {
                          var9--;
                          break L16;
                        } else {
                          var25 = var13;
                          break L16;
                        }
                      }
                      var9--;
                      var9--;
                      var9--;
                      break L15;
                    }
                  }
                  var9 = var15;
                  L17: while (true) {
                    if (var9 < 0) {
                      var9 = var15;
                      L18: while (true) {
                        if (var9 < 0) {
                          L19: {
                            if (var12 != 0) {
                              break L19;
                            } else {
                              var12 = var17;
                              break L19;
                            }
                          }
                          if (var11 == 0) {
                            var11 = var17;
                            var29--;
                            continue L14;
                          } else {
                            var29--;
                            continue L14;
                          }
                        } else {
                          var12--;
                          var22 = ((cg) this).field_n[var12];
                          var11--;
                          var21 = ((cg) this).field_n[var11];
                          var5[var9] = var5[var9] + ((var22 >> 16 & 255) - (var21 >> 16 & 255));
                          var6[var9] = var6[var9] + ((var22 >> 8 & 255) - (var21 >> 8 & 255));
                          var7[var9] = var7[var9] + ((var22 & 255) - (var21 & 255));
                          var9--;
                          continue L18;
                        }
                      }
                    } else {
                      L20: {
                        var25--;
                        var24--;
                        var18 = var26 / 9;
                        var19 = var28 / 9;
                        var20 = var27 / 9;
                        var23--;
                        var8[var23] = var18 << 16 | var19 << 8 | var20;
                        var26 = var26 + (var57[var25] - var57[var24]);
                        var27 = var27 + (var59[var25] - var59[var24]);
                        var28 = var28 + (var58[var25] - var58[var24]);
                        if (var25 != 0) {
                          break L20;
                        } else {
                          var25 = var13;
                          break L20;
                        }
                      }
                      if (var24 == 0) {
                        var24 = var13;
                        var9--;
                        continue L17;
                      } else {
                        var9--;
                        continue L17;
                      }
                    }
                  }
                }
              }
            } else {
              return ((cg) this).field_n;
            }
          } else {
            return null;
          }
        }
    }
}
