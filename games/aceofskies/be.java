/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class be extends da {
    private int[] field_g;
    private byte[][] field_k;
    private int[] field_f;
    private int[] field_i;
    private int[] field_e;
    private kj field_h;
    private int[] field_j;

    final void a(char param0, int param1, int param2, int param3, boolean param4, aa param5, int param6, int param7) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        if (param5 != null) {
          L0: {
            param1 = param1 + this.field_e[param0];
            param2 = param2 + this.field_f[param0];
            var9 = this.field_j[param0];
            var10 = this.field_g[param0];
            var11 = this.field_h.field_f;
            var12 = param1 + param2 * var11;
            var13 = var11 - var9;
            var14 = 0;
            var15 = 0;
            if (param2 >= this.field_h.field_w) {
              break L0;
            } else {
              var16 = this.field_h.field_w - param2;
              var10 = var10 - var16;
              param2 = this.field_h.field_w;
              var15 = var15 + var16 * var9;
              var12 = var12 + var16 * var11;
              break L0;
            }
          }
          L1: {
            if (param2 + var10 <= this.field_h.field_D) {
              break L1;
            } else {
              var10 = var10 - (param2 + var10 - this.field_h.field_D);
              break L1;
            }
          }
          L2: {
            if (param1 >= this.field_h.field_z) {
              break L2;
            } else {
              var16 = this.field_h.field_z - param1;
              var9 = var9 - var16;
              param1 = this.field_h.field_z;
              var15 = var15 + var16;
              var12 = var12 + var16;
              var14 = var14 + var16;
              var13 = var13 + var16;
              break L2;
            }
          }
          L3: {
            if (param1 + var9 <= this.field_h.field_k) {
              break L3;
            } else {
              var16 = param1 + var9 - this.field_h.field_k;
              var9 = var9 - var16;
              var14 = var14 + var16;
              var13 = var13 + var16;
              break L3;
            }
          }
          L4: {
            if (var9 <= 0) {
              break L4;
            } else {
              if (var10 > 0) {
                L5: {
                  if (!param4) {
                    this.a(this.field_k[param0], this.field_h.field_E, this.field_i, param3, var15, var12, var9, var10, var13, var14, param1, param2, this.field_j[param0], param5, param6, param7);
                    break L5;
                  } else {
                    this.a(this.field_k[param0], this.field_h.field_E, param3, var15, var12, var9, var10, var13, var14, param1, param2, this.field_j[param0], param5, param6, param7);
                    break L5;
                  }
                }
                return;
              } else {
                break L4;
              }
            }
          }
          return;
        } else {
          this.fa(param0, param1, param2, param3, param4);
          return;
        }
    }

    private final void a(byte[] param0, int[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int incrementValue$15 = 0;
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        int incrementValue$18 = 0;
        int incrementValue$19 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var10 = -(param5 >> 2);
        param5 = -(param5 & 3);
        var11 = 0;
        var12 = -param6;
        L0: while (true) {
          if (var12 >= 0) {
            return;
          } else {
            var13 = var10;
            L1: while (true) {
              if (var13 >= 0) {
                var13 = param5;
                L2: while (true) {
                  if (var13 >= 0) {
                    param4 = param4 + param7;
                    param3 = param3 + param8;
                    var12++;
                    continue L0;
                  } else {
                    incrementValue$10 = param3;
                    param3++;
                    var11 = param0[incrementValue$10];
                    if (param0[incrementValue$10] == 0) {
                      param4++;
                      var13++;
                      continue L2;
                    } else {
                      incrementValue$11 = param4;
                      param4++;
                      param1[incrementValue$11] = param2[var11 & 255];
                      var13++;
                      continue L2;
                    }
                  }
                }
              } else {
                L3: {
                  incrementValue$12 = param3;
                  param3++;
                  var11 = param0[incrementValue$12];
                  if (param0[incrementValue$12] == 0) {
                    param4++;
                    break L3;
                  } else {
                    incrementValue$13 = param4;
                    param4++;
                    param1[incrementValue$13] = param2[var11 & 255];
                    break L3;
                  }
                }
                L4: {
                  incrementValue$14 = param3;
                  param3++;
                  var11 = param0[incrementValue$14];
                  if (param0[incrementValue$14] == 0) {
                    param4++;
                    break L4;
                  } else {
                    incrementValue$15 = param4;
                    param4++;
                    param1[incrementValue$15] = param2[var11 & 255];
                    break L4;
                  }
                }
                L5: {
                  incrementValue$16 = param3;
                  param3++;
                  var11 = param0[incrementValue$16];
                  if (param0[incrementValue$16] == 0) {
                    param4++;
                    break L5;
                  } else {
                    incrementValue$17 = param4;
                    param4++;
                    param1[incrementValue$17] = param2[var11 & 255];
                    break L5;
                  }
                }
                incrementValue$18 = param3;
                param3++;
                var11 = param0[incrementValue$18];
                if (param0[incrementValue$18] == 0) {
                  param4++;
                  var13++;
                  continue L1;
                } else {
                  incrementValue$19 = param4;
                  param4++;
                  param1[incrementValue$19] = param2[var11 & 255];
                  var13++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    private final void a(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int incrementValue$218 = 0;
        int incrementValue$219 = 0;
        int incrementValue$220 = 0;
        int incrementValue$221 = 0;
        int incrementValue$222 = 0;
        int incrementValue$223 = 0;
        int incrementValue$224 = 0;
        int incrementValue$225 = 0;
        int incrementValue$226 = 0;
        int incrementValue$227 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var10 = -(param5 >> 2);
        param5 = -(param5 & 3);
        var11 = -param6;
        L0: while (true) {
          if (var11 >= 0) {
            return;
          } else {
            var12 = var10;
            L1: while (true) {
              if (var12 >= 0) {
                var12 = param5;
                L2: while (true) {
                  if (var12 >= 0) {
                    param4 = param4 + param7;
                    param3 = param3 + param8;
                    var11++;
                    continue L0;
                  } else {
                    incrementValue$218 = param3;
                    param3++;
                    if (param0[incrementValue$218] == 0) {
                      param4++;
                      var12++;
                      continue L2;
                    } else {
                      incrementValue$219 = param4;
                      param4++;
                      param1[incrementValue$219] = param2;
                      var12++;
                      continue L2;
                    }
                  }
                }
              } else {
                L3: {
                  incrementValue$220 = param3;
                  param3++;
                  if (param0[incrementValue$220] == 0) {
                    param4++;
                    break L3;
                  } else {
                    incrementValue$221 = param4;
                    param4++;
                    param1[incrementValue$221] = param2;
                    break L3;
                  }
                }
                L4: {
                  incrementValue$222 = param3;
                  param3++;
                  if (param0[incrementValue$222] == 0) {
                    param4++;
                    break L4;
                  } else {
                    incrementValue$223 = param4;
                    param4++;
                    param1[incrementValue$223] = param2;
                    break L4;
                  }
                }
                L5: {
                  incrementValue$224 = param3;
                  param3++;
                  if (param0[incrementValue$224] == 0) {
                    param4++;
                    break L5;
                  } else {
                    incrementValue$225 = param4;
                    param4++;
                    param1[incrementValue$225] = param2;
                    break L5;
                  }
                }
                incrementValue$226 = param3;
                param3++;
                if (param0[incrementValue$226] == 0) {
                  param4++;
                  var12++;
                  continue L1;
                } else {
                  incrementValue$227 = param4;
                  param4++;
                  param1[incrementValue$227] = param2;
                  var12++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    be(kj param0, vs param1, vd[] param2, int[] param3, int[] param4) {
        super(param0, param1);
        int var6 = 0;
        this.field_h = param0;
        this.field_h = param0;
        this.field_j = param3;
        this.field_g = param4;
        this.field_k = new byte[param2.length][];
        this.field_f = new int[param2.length];
        this.field_e = new int[param2.length];
        for (var6 = 0; var6 < param2.length; var6++) {
            this.field_k[var6] = param2[var6].field_d;
            this.field_f[var6] = param2[var6].field_i;
            this.field_e[var6] = param2[var6].field_a;
        }
        this.field_i = param2[0].field_f;
    }

    private final void a(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, aa param12, int param13, int param14) {
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        Object var16 = null;
        nj var16_ref = null;
        int[] var17 = null;
        int[] var18 = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int[] var28 = null;
        int[] var29 = null;
        int stackIn_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          var16 = null;
          var16_ref = (nj) ((Object) param12);
          var29 = var16_ref.field_h;
          var28 = var29;
          var17 = var28;
          var18 = var16_ref.field_g;
          var19 = param9 - this.field_h.field_z;
          var20 = param10;
          if (param14 <= var20) {
            break L0;
          } else {
            var20 = param14;
            param4 = param4 + (param14 - param10) * this.field_h.field_f;
            param3 = param3 + (param14 - param10) * param11;
            break L0;
          }
        }
        L1: {
          if (param14 + var29.length >= param10 + param6) {
            stackOut_4_0 = param10 + param6;
            stackIn_5_0 = stackOut_4_0;
            break L1;
          } else {
            stackOut_3_0 = param14 + var29.length;
            stackIn_5_0 = stackOut_3_0;
            break L1;
          }
        }
        var21 = stackIn_5_0;
        var22 = var20;
        L2: while (true) {
          if (var22 >= var21) {
            return;
          } else {
            L3: {
              var23 = var17[var22 - param14] + param13;
              var24 = var18[var22 - param14];
              var25 = param5;
              if (var19 <= var23) {
                var26 = var23 - var19;
                if (var26 < param5) {
                  param3 = param3 + var26;
                  var25 = var25 - var26;
                  param4 = param4 + var26;
                  break L3;
                } else {
                  param3 = param3 + (param5 + param8);
                  param4 = param4 + (param5 + param7);
                  var22++;
                  continue L2;
                }
              } else {
                var26 = var19 - var23;
                if (var26 < var24) {
                  var24 = var24 - var26;
                  break L3;
                } else {
                  param3 = param3 + (param5 + param8);
                  param4 = param4 + (param5 + param7);
                  var22++;
                  continue L2;
                }
              }
            }
            L4: {
              var26 = 0;
              if (var25 >= var24) {
                var26 = var25 - var24;
                break L4;
              } else {
                var24 = var25;
                break L4;
              }
            }
            var27 = -var24;
            L5: while (true) {
              if (var27 >= 0) {
                param3 = param3 + (var26 + param3);
                param4 = param4 + (var26 + param7);
                var22++;
                continue L2;
              } else {
                incrementValue$2 = param3;
                param3++;
                if (param0[incrementValue$2] == 0) {
                  param4++;
                  var27++;
                  continue L5;
                } else {
                  incrementValue$3 = param4;
                  param4++;
                  param1[incrementValue$3] = param2;
                  var27++;
                  continue L5;
                }
              }
            }
          }
        }
    }

    private final void a(byte[] param0, int[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, aa param13, int param14, int param15) {
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        Object var17 = null;
        nj var17_ref = null;
        int[] var18 = null;
        int[] var19 = null;
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
        int stackIn_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          var17 = null;
          var17_ref = (nj) ((Object) param13);
          var31 = var17_ref.field_h;
          var30 = var31;
          var18 = var30;
          var19 = var17_ref.field_g;
          var20 = param10 - this.field_h.field_z;
          var21 = param11;
          if (param15 <= var21) {
            break L0;
          } else {
            var21 = param15;
            param5 = param5 + (param15 - param11) * this.field_h.field_f;
            param4 = param4 + (param15 - param11) * param12;
            break L0;
          }
        }
        L1: {
          if (param15 + var31.length >= param11 + param7) {
            stackOut_4_0 = param11 + param7;
            stackIn_5_0 = stackOut_4_0;
            break L1;
          } else {
            stackOut_3_0 = param15 + var31.length;
            stackIn_5_0 = stackOut_3_0;
            break L1;
          }
        }
        var22 = stackIn_5_0;
        var23 = 0;
        var24 = var21;
        L2: while (true) {
          if (var24 >= var22) {
            return;
          } else {
            L3: {
              var25 = var18[var24 - param15] + param14;
              var26 = var19[var24 - param15];
              var27 = param6;
              if (var20 <= var25) {
                var28 = var25 - var20;
                if (var28 < param6) {
                  param4 = param4 + var28;
                  var27 = var27 - var28;
                  param5 = param5 + var28;
                  break L3;
                } else {
                  param4 = param4 + (param6 + param9);
                  param5 = param5 + (param6 + param8);
                  var24++;
                  continue L2;
                }
              } else {
                var28 = var20 - var25;
                if (var28 < var26) {
                  var26 = var26 - var28;
                  break L3;
                } else {
                  param4 = param4 + (param6 + param9);
                  param5 = param5 + (param6 + param8);
                  var24++;
                  continue L2;
                }
              }
            }
            L4: {
              var28 = 0;
              if (var27 >= var26) {
                var28 = var27 - var26;
                break L4;
              } else {
                var26 = var27;
                break L4;
              }
            }
            var29 = -var26;
            L5: while (true) {
              if (var29 >= 0) {
                param4 = param4 + (var28 + param9);
                param5 = param5 + (var28 + param8);
                var24++;
                continue L2;
              } else {
                incrementValue$2 = param4;
                param4++;
                var23 = param0[incrementValue$2];
                if (param0[incrementValue$2] == 0) {
                  param5++;
                  var29++;
                  continue L5;
                } else {
                  incrementValue$3 = param5;
                  param5++;
                  param1[incrementValue$3] = param2[var23 & 255];
                  var29++;
                  continue L5;
                }
              }
            }
          }
        }
    }

    final void fa(char param0, int param1, int param2, int param3, boolean param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        L0: {
          param1 = param1 + this.field_e[param0];
          param2 = param2 + this.field_f[param0];
          var6 = this.field_j[param0];
          var7 = this.field_g[param0];
          var8 = this.field_h.field_f;
          var9 = param1 + param2 * var8;
          var10 = var8 - var6;
          var11 = 0;
          var12 = 0;
          if (param2 >= this.field_h.field_w) {
            break L0;
          } else {
            var13 = this.field_h.field_w - param2;
            var7 = var7 - var13;
            param2 = this.field_h.field_w;
            var12 = var12 + var13 * var6;
            var9 = var9 + var13 * var8;
            break L0;
          }
        }
        L1: {
          if (param2 + var7 <= this.field_h.field_D) {
            break L1;
          } else {
            var7 = var7 - (param2 + var7 - this.field_h.field_D);
            break L1;
          }
        }
        L2: {
          if (param1 >= this.field_h.field_z) {
            break L2;
          } else {
            var13 = this.field_h.field_z - param1;
            var6 = var6 - var13;
            param1 = this.field_h.field_z;
            var12 = var12 + var13;
            var9 = var9 + var13;
            var11 = var11 + var13;
            var10 = var10 + var13;
            break L2;
          }
        }
        L3: {
          if (param1 + var6 <= this.field_h.field_k) {
            break L3;
          } else {
            var13 = param1 + var6 - this.field_h.field_k;
            var6 = var6 - var13;
            var11 = var11 + var13;
            var10 = var10 + var13;
            break L3;
          }
        }
        L4: {
          if (var6 <= 0) {
            break L4;
          } else {
            if (var7 > 0) {
              L5: {
                if (!param4) {
                  this.a(this.field_k[param0], this.field_h.field_E, this.field_i, var12, var9, var6, var7, var10, var11);
                  break L5;
                } else {
                  this.a(this.field_k[param0], this.field_h.field_E, param3, var12, var9, var6, var7, var10, var11);
                  break L5;
                }
              }
              return;
            } else {
              break L4;
            }
          }
        }
    }
}
