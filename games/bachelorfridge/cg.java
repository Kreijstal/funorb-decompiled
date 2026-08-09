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
        this.field_q = new on(param0);
        this.field_p = param0.b(16711935) == 1 ? true : false;
        this.field_s = param0.b(16711935) == 1 ? true : false;
        param0.b(16711935);
        param0.b(16711935);
        int var2 = param0.b(16711935) & 3;
        param0.b(true);
        param0.b(true);
        param0.b(16711935);
        param0.b(16711935);
        param0.b(16711935);
        if (var2 == 1) {
            return;
        }
        if (var2 == 2) {
            return;
        }
        if (var2 == 3) {
        }
    }

    final int[] a(q param0, vr param1, float param2, boolean param3) {
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_47_0 = null;
        Object stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        int[] var5;
        int[] var6;
        int[] var7;
        int[] var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23;
        int var24;
        int var25;
        int var26;
        int var27;
        int var28;
        int var29;
        int[] var30;
        int[] var31;
        int[] var32;
        int[] var33;
        int[] var34;
        int[] var35;
        int[] var39;
        int[] var40;
        int[] var41;
        int[] var42;
        int[] var43;
        int[] var44;
        if (this.field_n != null) {
          if (this.field_r != param2) {
            if (this.field_q.a(param0, param1, -90)) {
              L0: {
                stackIn_47_0 = this;

                if (!param3) {
                  stackIn_48_0 = this;
                  stackIn_48_1 = 128;
                  break L0;
                } else {
                  stackIn_48_0 = this;
                  stackIn_48_1 = 64;
                  break L0;
                }
              }
              ((cg) (this)).field_o = stackIn_48_1;
              this.field_n = this.field_q.a((double)param2, this.field_s, param0, this.field_o, this.field_o, param1, true, -1);
              this.field_r = param2;
              if (this.field_p) {
                var42 = new int[this.field_o];
                var33 = var42;
                var5 = var33;
                var43 = new int[this.field_o];
                var34 = var43;
                var6 = var34;
                var44 = new int[this.field_o];
                var35 = var44;
                var7 = var35;
                var8 = new int[this.field_o * this.field_o];
                var13 = this.field_o;
                var14 = this.field_o;
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
                        this.field_n = var8;
                        return this.field_n;
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
                                    var22 = this.field_n[var12];
                                    var11--;
                                    var21 = this.field_n[var11];
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
                        var10 = this.field_n[var12];
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
                return this.field_n;
              }
            } else {
              return null;
            }
          } else {
            return this.field_n;
          }
        } else {
          if (this.field_q.a(param0, param1, -90)) {
            L9: {
              stackIn_5_0 = this;

              if (!param3) {
                stackIn_6_0 = this;
                stackIn_6_1 = 128;
                break L9;
              } else {
                stackIn_6_0 = this;
                stackIn_6_1 = 64;
                break L9;
              }
            }
            ((cg) (this)).field_o = stackIn_6_1;
            this.field_n = this.field_q.a((double)param2, this.field_s, param0, this.field_o, this.field_o, param1, true, -1);
            this.field_r = param2;
            if (this.field_p) {
              var39 = new int[this.field_o];
              var30 = var39;
              var5 = var30;
              var40 = new int[this.field_o];
              var31 = var40;
              var6 = var31;
              var41 = new int[this.field_o];
              var32 = var41;
              var7 = var32;
              var8 = new int[this.field_o * this.field_o];
              var13 = this.field_o;
              var14 = this.field_o;
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
                      this.field_n = var8;
                      return this.field_n;
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
                                  var22 = this.field_n[var12];
                                  var11--;
                                  var21 = this.field_n[var11];
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
                      var10 = this.field_n[var12];
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
              return this.field_n;
            }
          } else {
            return null;
          }
        }
    }
}
