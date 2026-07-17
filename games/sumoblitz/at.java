/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class at extends da {
    private int[] field_c;
    private qa field_e;
    private int[] field_h;
    private int[] field_f;
    private int[] field_g;
    private byte[][] field_d;

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
            param1 = param1 + ((at) this).field_f[param0];
            param2 = param2 + ((at) this).field_g[param0];
            var9 = ((at) this).field_h[param0];
            var10 = ((at) this).field_c[param0];
            var11 = ((at) this).field_e.field_k;
            var12 = param1 + param2 * var11;
            var13 = var11 - var9;
            var14 = 0;
            var15 = 0;
            if (param2 >= ((at) this).field_e.field_H) {
              break L0;
            } else {
              var16 = ((at) this).field_e.field_H - param2;
              var10 = var10 - var16;
              param2 = ((at) this).field_e.field_H;
              var15 = var15 + var16 * var9;
              var12 = var12 + var16 * var11;
              break L0;
            }
          }
          L1: {
            if (param2 + var10 <= ((at) this).field_e.field_C) {
              break L1;
            } else {
              var10 = var10 - (param2 + var10 - ((at) this).field_e.field_C);
              break L1;
            }
          }
          L2: {
            if (param1 >= ((at) this).field_e.field_v) {
              break L2;
            } else {
              var16 = ((at) this).field_e.field_v - param1;
              var9 = var9 - var16;
              param1 = ((at) this).field_e.field_v;
              var15 = var15 + var16;
              var12 = var12 + var16;
              var14 = var14 + var16;
              var13 = var13 + var16;
              break L2;
            }
          }
          L3: {
            if (param1 + var9 <= ((at) this).field_e.field_D) {
              break L3;
            } else {
              var16 = param1 + var9 - ((at) this).field_e.field_D;
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
                  if ((param3 & -16777216) != -16777216) {
                    this.b(((at) this).field_d[param0], ((at) this).field_e.field_o, param3, var15, var12, var9, var10, var13, var14, param1, param2, ((at) this).field_h[param0], param5, param6, param7);
                    break L5;
                  } else {
                    this.a(((at) this).field_d[param0], ((at) this).field_e.field_o, param3, var15, var12, var9, var10, var13, var14, param1, param2, ((at) this).field_h[param0], param5, param6, param7);
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
          ((at) this).fa(param0, param1, param2, param3, param4);
          return;
        }
    }

    private final void a(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
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
                int incrementValue$66 = param3;
                param3++;
                if (param0[incrementValue$66] == 0) {
                  param4++;
                  var13++;
                  continue L1;
                } else {
                  var14 = ((param2 & 16711935) * var10 & -16711936) + ((param2 & 65280) * var10 & 16711680) >> 8;
                  var15 = param1[param4];
                  int incrementValue$67 = param4;
                  param4++;
                  param1[incrementValue$67] = (((var15 & 16711935) * var11 & -16711936) + ((var15 & 65280) * var11 & 16711680) >> 8) + var14;
                  var13++;
                  continue L1;
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
          param1 = param1 + ((at) this).field_f[param0];
          param2 = param2 + ((at) this).field_g[param0];
          var6 = ((at) this).field_h[param0];
          var7 = ((at) this).field_c[param0];
          var8 = ((at) this).field_e.field_k;
          var9 = param1 + param2 * var8;
          var10 = var8 - var6;
          var11 = 0;
          var12 = 0;
          if (param2 >= ((at) this).field_e.field_H) {
            break L0;
          } else {
            var13 = ((at) this).field_e.field_H - param2;
            var7 = var7 - var13;
            param2 = ((at) this).field_e.field_H;
            var12 = var12 + var13 * var6;
            var9 = var9 + var13 * var8;
            break L0;
          }
        }
        L1: {
          if (param2 + var7 <= ((at) this).field_e.field_C) {
            break L1;
          } else {
            var7 = var7 - (param2 + var7 - ((at) this).field_e.field_C);
            break L1;
          }
        }
        L2: {
          if (param1 >= ((at) this).field_e.field_v) {
            break L2;
          } else {
            var13 = ((at) this).field_e.field_v - param1;
            var6 = var6 - var13;
            param1 = ((at) this).field_e.field_v;
            var12 = var12 + var13;
            var9 = var9 + var13;
            var11 = var11 + var13;
            var10 = var10 + var13;
            break L2;
          }
        }
        L3: {
          if (param1 + var6 <= ((at) this).field_e.field_D) {
            break L3;
          } else {
            var13 = param1 + var6 - ((at) this).field_e.field_D;
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
                if ((param3 & -16777216) != -16777216) {
                  if ((param3 & -16777216) == 0) {
                    break L5;
                  } else {
                    this.a(((at) this).field_d[param0], ((at) this).field_e.field_o, param3, var12, var9, var6, var7, var10, var11);
                    break L5;
                  }
                } else {
                  this.b(((at) this).field_d[param0], ((at) this).field_e.field_o, param3, var12, var9, var6, var7, var10, var11);
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

    at(qa param0, ta param1, ri[] param2, int[] param3, int[] param4) {
        super((ha) (Object) param0, param1);
        int var6 = 0;
        ((at) this).field_e = param0;
        ((at) this).field_h = param3;
        ((at) this).field_c = param4;
        ((at) this).field_d = new byte[param2.length][];
        ((at) this).field_g = new int[param2.length];
        ((at) this).field_f = new int[param2.length];
        for (var6 = 0; var6 < param2.length; var6++) {
            ((at) this).field_d[var6] = param2[var6].field_e;
            ((at) this).field_g[var6] = param2[var6].field_d;
            ((at) this).field_f[var6] = param2[var6].field_c;
        }
    }

    private final void b(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
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
                    int incrementValue$218 = param3;
                    param3++;
                    if (param0[incrementValue$218] == 0) {
                      param4++;
                      var12++;
                      continue L2;
                    } else {
                      int incrementValue$219 = param4;
                      param4++;
                      param1[incrementValue$219] = param2;
                      var12++;
                      continue L2;
                    }
                  }
                }
              } else {
                L3: {
                  int incrementValue$220 = param3;
                  param3++;
                  if (param0[incrementValue$220] == 0) {
                    param4++;
                    break L3;
                  } else {
                    int incrementValue$221 = param4;
                    param4++;
                    param1[incrementValue$221] = param2;
                    break L3;
                  }
                }
                L4: {
                  int incrementValue$222 = param3;
                  param3++;
                  if (param0[incrementValue$222] == 0) {
                    param4++;
                    break L4;
                  } else {
                    int incrementValue$223 = param4;
                    param4++;
                    param1[incrementValue$223] = param2;
                    break L4;
                  }
                }
                L5: {
                  int incrementValue$224 = param3;
                  param3++;
                  if (param0[incrementValue$224] == 0) {
                    param4++;
                    break L5;
                  } else {
                    int incrementValue$225 = param4;
                    param4++;
                    param1[incrementValue$225] = param2;
                    break L5;
                  }
                }
                int incrementValue$226 = param3;
                param3++;
                if (param0[incrementValue$226] == 0) {
                  param4++;
                  var12++;
                  continue L1;
                } else {
                  int incrementValue$227 = param4;
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

    private final void a(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, aa param12, int param13, int param14) {
        Object var16 = null;
        dm var16_ref = null;
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
        int[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        int[] var30 = null;
        int stackIn_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          var16 = null;
          var16_ref = (dm) (Object) param12;
          var30 = var16_ref.field_f;
          var29 = var30;
          var28 = var29;
          var27 = var28;
          var17 = var27;
          var18 = var16_ref.field_g;
          var19 = param10;
          if (param14 <= var19) {
            break L0;
          } else {
            var19 = param14;
            param4 = param4 + (param14 - param10) * ((at) this).field_e.field_k;
            param3 = param3 + (param14 - param10) * param11;
            break L0;
          }
        }
        L1: {
          if (param14 + var30.length >= param10 + param6) {
            stackOut_4_0 = param10 + param6;
            stackIn_5_0 = stackOut_4_0;
            break L1;
          } else {
            stackOut_3_0 = param14 + var30.length;
            stackIn_5_0 = stackOut_3_0;
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
                int incrementValue$2 = param3;
                param3++;
                if (param0[incrementValue$2] == 0) {
                  param4++;
                  var26++;
                  continue L5;
                } else {
                  int incrementValue$3 = param4;
                  param4++;
                  param1[incrementValue$3] = param2;
                  var26++;
                  continue L5;
                }
              }
            }
          }
        }
    }

    private final void b(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, aa param12, int param13, int param14) {
        Object var16 = null;
        dm var16_ref = null;
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
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int[] var32 = null;
        int[] var33 = null;
        int[] var34 = null;
        int[] var35 = null;
        int stackIn_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          var16 = null;
          var16_ref = (dm) (Object) param12;
          var35 = var16_ref.field_f;
          var34 = var35;
          var33 = var34;
          var32 = var33;
          var17 = var32;
          var18 = var16_ref.field_g;
          var19 = param9 - ((at) this).field_e.field_v;
          var20 = param10;
          if (param14 <= var20) {
            break L0;
          } else {
            var20 = param14;
            param4 = param4 + (param14 - param10) * ((at) this).field_e.field_k;
            param3 = param3 + (param14 - param10) * param11;
            break L0;
          }
        }
        L1: {
          if (param14 + var35.length >= param10 + param6) {
            stackOut_4_0 = param10 + param6;
            stackIn_5_0 = stackOut_4_0;
            break L1;
          } else {
            stackOut_3_0 = param14 + var35.length;
            stackIn_5_0 = stackOut_3_0;
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
                int incrementValue$2 = param3;
                param3++;
                if (param0[incrementValue$2] == 0) {
                  param4++;
                  var29++;
                  continue L5;
                } else {
                  var30 = ((param2 & 16711935) * var22 & -16711936) + ((param2 & 65280) * var22 & 16711680) >> 8;
                  var31 = param1[param4];
                  int incrementValue$3 = param4;
                  param4++;
                  param1[incrementValue$3] = (((var31 & 16711935) * var23 & -16711936) + ((var31 & 65280) * var23 & 16711680) >> 8) + var30;
                  var29++;
                  continue L5;
                }
              }
            }
          }
        }
    }
}
