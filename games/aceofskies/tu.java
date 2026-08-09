/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tu extends da {
    private int[] field_e;
    private int[] field_j;
    private int[] field_g;
    private kj field_f;
    private int[] field_i;
    private byte[][] field_h;

    private final void b(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int incrementValue$44 = 0;
        int incrementValue$45 = 0;
        int incrementValue$46 = 0;
        int incrementValue$47 = 0;
        int incrementValue$48 = 0;
        int incrementValue$49 = 0;
        int incrementValue$50 = 0;
        int incrementValue$51 = 0;
        int incrementValue$52 = 0;
        int incrementValue$53 = 0;
        int var10;
        int var11;
        int var12;
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
                    incrementValue$44 = param3;
                    param3++;
                    if (param0[incrementValue$44] == 0) {
                      param4++;
                      var12++;
                      continue L2;
                    } else {
                      incrementValue$45 = param4;
                      param4++;
                      param1[incrementValue$45] = param2;
                      var12++;
                      continue L2;
                    }
                  }
                }
              } else {
                L3: {
                  incrementValue$46 = param3;
                  param3++;
                  if (param0[incrementValue$46] == 0) {
                    param4++;
                    break L3;
                  } else {
                    incrementValue$47 = param4;
                    param4++;
                    param1[incrementValue$47] = param2;
                    break L3;
                  }
                }
                L4: {
                  incrementValue$48 = param3;
                  param3++;
                  if (param0[incrementValue$48] == 0) {
                    param4++;
                    break L4;
                  } else {
                    incrementValue$49 = param4;
                    param4++;
                    param1[incrementValue$49] = param2;
                    break L4;
                  }
                }
                L5: {
                  incrementValue$50 = param3;
                  param3++;
                  if (param0[incrementValue$50] == 0) {
                    param4++;
                    break L5;
                  } else {
                    incrementValue$51 = param4;
                    param4++;
                    param1[incrementValue$51] = param2;
                    break L5;
                  }
                }
                incrementValue$52 = param3;
                param3++;
                if (param0[incrementValue$52] == 0) {
                  param4++;
                  var12++;
                  continue L1;
                } else {
                  incrementValue$53 = param4;
                  param4++;
                  param1[incrementValue$53] = param2;
                  var12++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    final void fa(char param0, int param1, int param2, int param3, boolean param4) {
        int var13 = 0;
        param1 = param1 + this.field_g[param0];
        param2 = param2 + this.field_j[param0];
        int var6 = this.field_i[param0];
        int var7 = this.field_e[param0];
        int var8 = this.field_f.field_f;
        int var9 = param1 + param2 * var8;
        int var10 = var8 - var6;
        int var11 = 0;
        int var12 = 0;
        if (param2 < this.field_f.field_w) {
            var13 = this.field_f.field_w - param2;
            var7 = var7 - var13;
            param2 = this.field_f.field_w;
            var12 = var12 + var13 * var6;
            var9 = var9 + var13 * var8;
        }
        if (param2 + var7 > this.field_f.field_D) {
            var7 = var7 - (param2 + var7 - this.field_f.field_D);
        }
        if (param1 < this.field_f.field_z) {
            var13 = this.field_f.field_z - param1;
            var6 = var6 - var13;
            param1 = this.field_f.field_z;
            var12 = var12 + var13;
            var9 = var9 + var13;
            var11 = var11 + var13;
            var10 = var10 + var13;
        }
        if (param1 + var6 > this.field_f.field_k) {
            var13 = param1 + var6 - this.field_f.field_k;
            var6 = var6 - var13;
            var11 = var11 + var13;
            var10 = var10 + var13;
        }
        if (var6 <= 0 || var7 <= 0) {
            return;
        }
        if ((param3 & -16777216) == -16777216) {
            this.b(this.field_h[param0], this.field_f.field_E, param3, var12, var9, var6, var7, var10, var11);
        } else {
            if ((param3 & -16777216) != 0) {
                this.a(this.field_h[param0], this.field_f.field_E, param3, var12, var9, var6, var7, var10, var11);
            }
        }
    }

    final void a(char param0, int param1, int param2, int param3, boolean param4, aa param5, int param6, int param7) {
        int var16 = 0;
        if (param5 == null) {
            this.fa(param0, param1, param2, param3, param4);
            return;
        }
        param1 = param1 + this.field_g[param0];
        param2 = param2 + this.field_j[param0];
        int var9 = this.field_i[param0];
        int var10 = this.field_e[param0];
        int var11 = this.field_f.field_f;
        int var12 = param1 + param2 * var11;
        int var13 = var11 - var9;
        int var14 = 0;
        int var15 = 0;
        if (param2 < this.field_f.field_w) {
            var16 = this.field_f.field_w - param2;
            var10 = var10 - var16;
            param2 = this.field_f.field_w;
            var15 = var15 + var16 * var9;
            var12 = var12 + var16 * var11;
        }
        if (param2 + var10 > this.field_f.field_D) {
            var10 = var10 - (param2 + var10 - this.field_f.field_D);
        }
        if (param1 < this.field_f.field_z) {
            var16 = this.field_f.field_z - param1;
            var9 = var9 - var16;
            param1 = this.field_f.field_z;
            var15 = var15 + var16;
            var12 = var12 + var16;
            var14 = var14 + var16;
            var13 = var13 + var16;
        }
        if (param1 + var9 > this.field_f.field_k) {
            var16 = param1 + var9 - this.field_f.field_k;
            var9 = var9 - var16;
            var14 = var14 + var16;
            var13 = var13 + var16;
        }
        if (var9 <= 0 || var10 <= 0) {
            return;
        }
        if ((param3 & -16777216) == -16777216) {
            this.a(this.field_h[param0], this.field_f.field_E, param3, var15, var12, var9, var10, var13, var14, param1, param2, this.field_i[param0], param5, param6, param7);
        } else {
            this.b(this.field_h[param0], this.field_f.field_E, param3, var15, var12, var9, var10, var13, var14, param1, param2, this.field_i[param0], param5, param6, param7);
        }
    }

    private final void b(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, aa param12, int param13, int param14) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int stackIn_5_0 = 0;
        Object var16;
        nj var16_ref;
        int[] var17;
        int[] var18;
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
        int var30;
        int var31;
        int[] var32;
        int[] var33;
        L0: {
          var16 = null;
          var16_ref = (nj) ((Object) param12);
          var33 = var16_ref.field_h;
          var32 = var33;
          var17 = var32;
          var18 = var16_ref.field_g;
          var19 = param9 - this.field_f.field_z;
          var20 = param10;
          if (param14 <= var20) {
            break L0;
          } else {
            var20 = param14;
            param4 = param4 + (param14 - param10) * this.field_f.field_f;
            param3 = param3 + (param14 - param10) * param11;
            break L0;
          }
        }
        L1: {
          if (param14 + var33.length >= param10 + param6) {
            stackIn_5_0 = param10 + param6;
            break L1;
          } else {
            stackIn_5_0 = param14 + var33.length;
            break L1;
          }
        }
        var21 = stackIn_5_0;
        var22 = param2 >>> 24;
        var23 = 255 - var22;
        var24 = var20;
        L2: while (true) {
          if (var24 >= var21) {
            return;
          } else {
            L3: {
              var25 = var17[var24 - param14] + param13;
              var26 = var18[var24 - param14];
              var27 = param5;
              if (var19 <= var25) {
                var28 = var25 - var19;
                if (var28 < param5) {
                  param3 = param3 + var28;
                  var27 = var27 - var28;
                  param4 = param4 + var28;
                  break L3;
                } else {
                  param3 = param3 + (param5 + param8);
                  param4 = param4 + (param5 + param7);
                  var24++;
                  continue L2;
                }
              } else {
                var28 = var19 - var25;
                if (var28 < var26) {
                  var26 = var26 - var28;
                  break L3;
                } else {
                  param3 = param3 + (param5 + param8);
                  param4 = param4 + (param5 + param7);
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
                param3 = param3 + (var28 + param8);
                param4 = param4 + (var28 + param7);
                var24++;
                continue L2;
              } else {
                incrementValue$0 = param3;
                param3++;
                if (param0[incrementValue$0] == 0) {
                  param4++;
                  var29++;
                  continue L5;
                } else {
                  var30 = ((param2 & 16711935) * var22 & -16711936) + ((param2 & 65280) * var22 & 16711680) >> 8;
                  var31 = param1[param4];
                  incrementValue$1 = param4;
                  param4++;
                  param1[incrementValue$1] = (((var31 & 16711935) * var23 & -16711936) + ((var31 & 65280) * var23 & 16711680) >> 8) + var30;
                  var29++;
                  continue L5;
                }
              }
            }
          }
        }
    }

    private final void a(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, aa param12, int param13, int param14) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int stackIn_5_0 = 0;
        Object var16;
        nj var16_ref;
        int[] var17;
        int[] var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23;
        int var24;
        int var25;
        int var26;
        int[] var27;
        int[] var28;
        L0: {
          var16 = null;
          var16_ref = (nj) ((Object) param12);
          var28 = var16_ref.field_h;
          var27 = var28;
          var17 = var27;
          var18 = var16_ref.field_g;
          var19 = param10;
          if (param14 <= var19) {
            break L0;
          } else {
            var19 = param14;
            param4 = param4 + (param14 - param10) * this.field_f.field_f;
            param3 = param3 + (param14 - param10) * param11;
            break L0;
          }
        }
        L1: {
          if (param14 + var28.length >= param10 + param6) {
            stackIn_5_0 = param10 + param6;
            break L1;
          } else {
            stackIn_5_0 = param14 + var28.length;
            break L1;
          }
        }
        var20 = stackIn_5_0;
        var21 = var19;
        L2: while (true) {
          if (var21 >= var20) {
            return;
          } else {
            L3: {
              var22 = param13 + var17[var21 - param14];
              var23 = var18[var21 - param14];
              var24 = param5;
              if (param9 <= var22) {
                var25 = var22 - param9;
                if (var25 < param5) {
                  param3 = param3 + var25;
                  var24 = var24 - var25;
                  param4 = param4 + var25;
                  break L3;
                } else {
                  param3 = param3 + (param5 + param8);
                  param4 = param4 + (param5 + param7);
                  var21++;
                  continue L2;
                }
              } else {
                var25 = param9 - var22;
                if (var25 < var23) {
                  var23 = var23 - var25;
                  break L3;
                } else {
                  param3 = param3 + (param5 + param8);
                  param4 = param4 + (param5 + param7);
                  var21++;
                  continue L2;
                }
              }
            }
            L4: {
              var25 = 0;
              if (var24 >= var23) {
                var25 = var24 - var23;
                break L4;
              } else {
                var23 = var24;
                break L4;
              }
            }
            var26 = 0;
            L5: while (true) {
              if (var26 >= var23) {
                param3 = param3 + (var25 + param8);
                param4 = param4 + (var25 + param7);
                var21++;
                continue L2;
              } else {
                incrementValue$0 = param3;
                param3++;
                if (param0[incrementValue$0] == 0) {
                  param4++;
                  var26++;
                  continue L5;
                } else {
                  incrementValue$1 = param4;
                  param4++;
                  param1[incrementValue$1] = param2;
                  var26++;
                  continue L5;
                }
              }
            }
          }
        }
    }

    private final void a(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        var10 = param2 >>> 24;
        var11 = 255 - var10;
        var12 = -param6;
        L0: while (true) {
          if (var12 >= 0) {
            return;
          } else {
            var13 = -param5;
            L1: while (true) {
              if (var13 >= 0) {
                param4 = param4 + param7;
                param3 = param3 + param8;
                var12++;
                continue L0;
              } else {
                incrementValue$11 = param3;
                param3++;
                if (param0[incrementValue$11] == 0) {
                  param4++;
                  var13++;
                  continue L1;
                } else {
                  var14 = ((param2 & 16711935) * var10 & -16711936) + ((param2 & 65280) * var10 & 16711680) >> 8;
                  var15 = param1[param4];
                  incrementValue$12 = param4;
                  param4++;
                  param1[incrementValue$12] = (((var15 & 16711935) * var11 & -16711936) + ((var15 & 65280) * var11 & 16711680) >> 8) + var14;
                  var13++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    tu(kj param0, vs param1, vd[] param2, int[] param3, int[] param4) {
        super(param0, param1);
        int var6 = 0;
        this.field_f = param0;
        this.field_i = param3;
        this.field_e = param4;
        this.field_h = new byte[param2.length][];
        this.field_j = new int[param2.length];
        this.field_g = new int[param2.length];
        for (var6 = 0; var6 < param2.length; var6++) {
            this.field_h[var6] = param2[var6].field_d;
            this.field_j[var6] = param2[var6].field_i;
            this.field_g[var6] = param2[var6].field_a;
        }
    }
}
