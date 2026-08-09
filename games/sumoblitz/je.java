/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class je extends da {
    private byte[][] field_e;
    private int[] field_i;
    private int[] field_f;
    private int[] field_c;
    private qa field_g;
    private int[] field_h;
    private int[] field_d;

    private final void a(byte[] param0, int[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int incrementValue$0 = 0;
        byte dupTemp$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        byte dupTemp$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        byte dupTemp$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        byte dupTemp$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        byte dupTemp$13 = 0;
        int incrementValue$14 = 0;
        int var10;
        int var11;
        int var12;
        int var13;
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
                    incrementValue$0 = param3;
                    param3++;
                    dupTemp$1 = param0[incrementValue$0];
                    var11 = dupTemp$1;
                    if (dupTemp$1 == 0) {
                      param4++;
                      var13++;
                      continue L2;
                    } else {
                      incrementValue$2 = param4;
                      param4++;
                      param1[incrementValue$2] = param2[var11 & 255];
                      var13++;
                      continue L2;
                    }
                  }
                }
              } else {
                L3: {
                  incrementValue$3 = param3;
                  param3++;
                  dupTemp$4 = param0[incrementValue$3];
                  var11 = dupTemp$4;
                  if (dupTemp$4 == 0) {
                    param4++;
                    break L3;
                  } else {
                    incrementValue$5 = param4;
                    param4++;
                    param1[incrementValue$5] = param2[var11 & 255];
                    break L3;
                  }
                }
                L4: {
                  incrementValue$6 = param3;
                  param3++;
                  dupTemp$7 = param0[incrementValue$6];
                  var11 = dupTemp$7;
                  if (dupTemp$7 == 0) {
                    param4++;
                    break L4;
                  } else {
                    incrementValue$8 = param4;
                    param4++;
                    param1[incrementValue$8] = param2[var11 & 255];
                    break L4;
                  }
                }
                L5: {
                  incrementValue$9 = param3;
                  param3++;
                  dupTemp$10 = param0[incrementValue$9];
                  var11 = dupTemp$10;
                  if (dupTemp$10 == 0) {
                    param4++;
                    break L5;
                  } else {
                    incrementValue$11 = param4;
                    param4++;
                    param1[incrementValue$11] = param2[var11 & 255];
                    break L5;
                  }
                }
                incrementValue$12 = param3;
                param3++;
                dupTemp$13 = param0[incrementValue$12];
                var11 = dupTemp$13;
                if (dupTemp$13 == 0) {
                  param4++;
                  var13++;
                  continue L1;
                } else {
                  incrementValue$14 = param4;
                  param4++;
                  param1[incrementValue$14] = param2[var11 & 255];
                  var13++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    final void fa(char param0, int param1, int param2, int param3, boolean param4) {
        int var13 = 0;
        param1 = param1 + this.field_d[param0];
        param2 = param2 + this.field_f[param0];
        int var6 = this.field_c[param0];
        int var7 = this.field_h[param0];
        int var8 = this.field_g.field_k;
        int var9 = param1 + param2 * var8;
        int var10 = var8 - var6;
        int var11 = 0;
        int var12 = 0;
        if (param2 < this.field_g.field_H) {
            var13 = this.field_g.field_H - param2;
            var7 = var7 - var13;
            param2 = this.field_g.field_H;
            var12 = var12 + var13 * var6;
            var9 = var9 + var13 * var8;
        }
        if (param2 + var7 > this.field_g.field_C) {
            var7 = var7 - (param2 + var7 - this.field_g.field_C);
        }
        if (param1 < this.field_g.field_v) {
            var13 = this.field_g.field_v - param1;
            var6 = var6 - var13;
            param1 = this.field_g.field_v;
            var12 = var12 + var13;
            var9 = var9 + var13;
            var11 = var11 + var13;
            var10 = var10 + var13;
        }
        if (param1 + var6 > this.field_g.field_D) {
            var13 = param1 + var6 - this.field_g.field_D;
            var6 = var6 - var13;
            var11 = var11 + var13;
            var10 = var10 + var13;
        }
        if (var6 <= 0 || var7 <= 0) {
            return;
        }
        if (param4) {
            this.a(this.field_e[param0], this.field_g.field_o, param3, var12, var9, var6, var7, var10, var11);
        } else {
            this.a(this.field_e[param0], this.field_g.field_o, this.field_i, var12, var9, var6, var7, var10, var11);
        }
    }

    final void a(char param0, int param1, int param2, int param3, boolean param4, aa param5, int param6, int param7) {
        int var16 = 0;
        if (param5 == null) {
            this.fa(param0, param1, param2, param3, param4);
            return;
        }
        param1 = param1 + this.field_d[param0];
        param2 = param2 + this.field_f[param0];
        int var9 = this.field_c[param0];
        int var10 = this.field_h[param0];
        int var11 = this.field_g.field_k;
        int var12 = param1 + param2 * var11;
        int var13 = var11 - var9;
        int var14 = 0;
        int var15 = 0;
        if (param2 < this.field_g.field_H) {
            var16 = this.field_g.field_H - param2;
            var10 = var10 - var16;
            param2 = this.field_g.field_H;
            var15 = var15 + var16 * var9;
            var12 = var12 + var16 * var11;
        }
        if (param2 + var10 > this.field_g.field_C) {
            var10 = var10 - (param2 + var10 - this.field_g.field_C);
        }
        if (param1 < this.field_g.field_v) {
            var16 = this.field_g.field_v - param1;
            var9 = var9 - var16;
            param1 = this.field_g.field_v;
            var15 = var15 + var16;
            var12 = var12 + var16;
            var14 = var14 + var16;
            var13 = var13 + var16;
        }
        if (param1 + var9 > this.field_g.field_D) {
            var16 = param1 + var9 - this.field_g.field_D;
            var9 = var9 - var16;
            var14 = var14 + var16;
            var13 = var13 + var16;
        }
        if (var9 <= 0 || var10 <= 0) {
            return;
        }
        if (param4) {
            this.a(this.field_e[param0], this.field_g.field_o, param3, var15, var12, var9, var10, var13, var14, param1, param2, this.field_c[param0], param5, param6, param7);
        } else {
            this.a(this.field_e[param0], this.field_g.field_o, this.field_i, param3, var15, var12, var9, var10, var13, var14, param1, param2, this.field_c[param0], param5, param6, param7);
        }
    }

    private final void a(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, aa param12, int param13, int param14) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int stackIn_5_0 = 0;
        Object var16;
        dm var16_ref;
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
        int[] var28;
        int[] var29;
        L0: {
          var16 = null;
          var16_ref = (dm) ((Object) param12);
          var29 = var16_ref.field_f;
          var28 = var29;
          var17 = var28;
          var18 = var16_ref.field_g;
          var19 = param9 - this.field_g.field_v;
          var20 = param10;
          if (param14 <= var20) {
            break L0;
          } else {
            var20 = param14;
            param4 = param4 + (param14 - param10) * this.field_g.field_k;
            param3 = param3 + (param14 - param10) * param11;
            break L0;
          }
        }
        L1: {
          if (param14 + var29.length >= param10 + param6) {
            stackIn_5_0 = param10 + param6;
            break L1;
          } else {
            stackIn_5_0 = param14 + var29.length;
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
                incrementValue$0 = param3;
                param3++;
                if (param0[incrementValue$0] == 0) {
                  param4++;
                  var27++;
                  continue L5;
                } else {
                  incrementValue$1 = param4;
                  param4++;
                  param1[incrementValue$1] = param2;
                  var27++;
                  continue L5;
                }
              }
            }
          }
        }
    }

    private final void a(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
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

    private final void a(byte[] param0, int[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, aa param13, int param14, int param15) {
        int incrementValue$0 = 0;
        byte dupTemp$1 = 0;
        int incrementValue$2 = 0;
        int stackIn_5_0 = 0;
        Object var17;
        dm var17_ref;
        int[] var18;
        int[] var19;
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
        L0: {
          var17 = null;
          var17_ref = (dm) ((Object) param13);
          var31 = var17_ref.field_f;
          var30 = var31;
          var18 = var30;
          var19 = var17_ref.field_g;
          var20 = param10 - this.field_g.field_v;
          var21 = param11;
          if (param15 <= var21) {
            break L0;
          } else {
            var21 = param15;
            param5 = param5 + (param15 - param11) * this.field_g.field_k;
            param4 = param4 + (param15 - param11) * param12;
            break L0;
          }
        }
        L1: {
          if (param15 + var31.length >= param11 + param7) {
            stackIn_5_0 = param11 + param7;
            break L1;
          } else {
            stackIn_5_0 = param15 + var31.length;
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
                incrementValue$0 = param4;
                param4++;
                dupTemp$1 = param0[incrementValue$0];
                var23 = dupTemp$1;
                if (dupTemp$1 == 0) {
                  param5++;
                  var29++;
                  continue L5;
                } else {
                  incrementValue$2 = param5;
                  param5++;
                  param1[incrementValue$2] = param2[var23 & 255];
                  var29++;
                  continue L5;
                }
              }
            }
          }
        }
    }

    je(qa param0, ta param1, ri[] param2, int[] param3, int[] param4) {
        super(param0, param1);
        int var6 = 0;
        this.field_g = param0;
        this.field_g = param0;
        this.field_c = param3;
        this.field_h = param4;
        this.field_e = new byte[param2.length][];
        this.field_f = new int[param2.length];
        this.field_d = new int[param2.length];
        for (var6 = 0; var6 < param2.length; var6++) {
            this.field_e[var6] = param2[var6].field_e;
            this.field_f[var6] = param2[var6].field_d;
            this.field_d[var6] = param2[var6].field_c;
        }
        this.field_i = param2[0].field_g;
    }
}
