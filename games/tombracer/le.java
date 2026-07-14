/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class le extends da {
    private int[] field_d;
    private sfa field_g;
    private int[] field_i;
    private int[] field_h;
    private int[] field_e;
    private byte[][] field_f;

    private final void b(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, aa param12, int param13, int param14) {
        Object var16 = null;
        hpa var16_ref = null;
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
          var16_ref = (hpa) (Object) param12;
          var30 = var16_ref.field_e;
          var29 = var30;
          var28 = var29;
          var27 = var28;
          var17 = var27;
          var18 = var16_ref.field_d;
          var19 = param10;
          if (param14 <= var19) {
            break L0;
          } else {
            var19 = param14;
            param4 = param4 + (param14 - param10) * ((le) this).field_g.field_K;
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
                param3++;
                if (param0[param3] == 0) {
                  param4++;
                  var26++;
                  continue L5;
                } else {
                  param4++;
                  param1[param4] = param2;
                  var26++;
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
          param1 = param1 + ((le) this).field_e[param0];
          param2 = param2 + ((le) this).field_h[param0];
          var6 = ((le) this).field_i[param0];
          var7 = ((le) this).field_d[param0];
          var8 = ((le) this).field_g.field_K;
          var9 = param1 + param2 * var8;
          var10 = var8 - var6;
          var11 = 0;
          var12 = 0;
          if (param2 >= ((le) this).field_g.field_d) {
            break L0;
          } else {
            var13 = ((le) this).field_g.field_d - param2;
            var7 = var7 - var13;
            param2 = ((le) this).field_g.field_d;
            var12 = var12 + var13 * var6;
            var9 = var9 + var13 * var8;
            break L0;
          }
        }
        L1: {
          if (param2 + var7 <= ((le) this).field_g.field_P) {
            break L1;
          } else {
            var7 = var7 - (param2 + var7 - ((le) this).field_g.field_P);
            break L1;
          }
        }
        L2: {
          if (param1 >= ((le) this).field_g.field_J) {
            break L2;
          } else {
            var13 = ((le) this).field_g.field_J - param1;
            var6 = var6 - var13;
            param1 = ((le) this).field_g.field_J;
            var12 = var12 + var13;
            var9 = var9 + var13;
            var11 = var11 + var13;
            var10 = var10 + var13;
            break L2;
          }
        }
        L3: {
          if (param1 + var6 <= ((le) this).field_g.field_W) {
            break L3;
          } else {
            var13 = param1 + var6 - ((le) this).field_g.field_W;
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
                    this.a(((le) this).field_f[param0], ((le) this).field_g.field_r, param3, var12, var9, var6, var7, var10, var11);
                    break L5;
                  }
                } else {
                  this.b(((le) this).field_f[param0], ((le) this).field_g.field_r, param3, var12, var9, var6, var7, var10, var11);
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
                    param3++;
                    if (param0[param3] == 0) {
                      param4++;
                      var12++;
                      continue L2;
                    } else {
                      param4++;
                      param1[param4] = param2;
                      var12++;
                      continue L2;
                    }
                  }
                }
              } else {
                L3: {
                  param3++;
                  if (param0[param3] == 0) {
                    param4++;
                    break L3;
                  } else {
                    param4++;
                    param1[param4] = param2;
                    break L3;
                  }
                }
                L4: {
                  param3++;
                  if (param0[param3] == 0) {
                    param4++;
                    break L4;
                  } else {
                    param4++;
                    param1[param4] = param2;
                    break L4;
                  }
                }
                L5: {
                  param3++;
                  if (param0[param3] == 0) {
                    param4++;
                    break L5;
                  } else {
                    param4++;
                    param1[param4] = param2;
                    break L5;
                  }
                }
                param3++;
                if (param0[param3] == 0) {
                  param4++;
                  var12++;
                  continue L1;
                } else {
                  param4++;
                  param1[param4] = param2;
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
        hpa var16_ref = null;
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
          var16_ref = (hpa) (Object) param12;
          var35 = var16_ref.field_e;
          var34 = var35;
          var33 = var34;
          var32 = var33;
          var17 = var32;
          var18 = var16_ref.field_d;
          var19 = param9 - ((le) this).field_g.field_J;
          var20 = param10;
          if (param14 <= var20) {
            break L0;
          } else {
            var20 = param14;
            param4 = param4 + (param14 - param10) * ((le) this).field_g.field_K;
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
                param3++;
                if (param0[param3] == 0) {
                  param4++;
                  var29++;
                  continue L5;
                } else {
                  var30 = ((param2 & 16711935) * var22 & -16711936) + ((param2 & 65280) * var22 & 16711680) >> 8;
                  var31 = param1[param4];
                  param4++;
                  param1[param4] = (((var31 & 16711935) * var23 & -16711936) + ((var31 & 65280) * var23 & 16711680) >> 8) + var30;
                  var29++;
                  continue L5;
                }
              }
            }
          }
        }
    }

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
            param1 = param1 + ((le) this).field_e[param0];
            param2 = param2 + ((le) this).field_h[param0];
            var9 = ((le) this).field_i[param0];
            var10 = ((le) this).field_d[param0];
            var11 = ((le) this).field_g.field_K;
            var12 = param1 + param2 * var11;
            var13 = var11 - var9;
            var14 = 0;
            var15 = 0;
            if (param2 >= ((le) this).field_g.field_d) {
              break L0;
            } else {
              var16 = ((le) this).field_g.field_d - param2;
              var10 = var10 - var16;
              param2 = ((le) this).field_g.field_d;
              var15 = var15 + var16 * var9;
              var12 = var12 + var16 * var11;
              break L0;
            }
          }
          L1: {
            if (param2 + var10 <= ((le) this).field_g.field_P) {
              break L1;
            } else {
              var10 = var10 - (param2 + var10 - ((le) this).field_g.field_P);
              break L1;
            }
          }
          L2: {
            if (param1 >= ((le) this).field_g.field_J) {
              break L2;
            } else {
              var16 = ((le) this).field_g.field_J - param1;
              var9 = var9 - var16;
              param1 = ((le) this).field_g.field_J;
              var15 = var15 + var16;
              var12 = var12 + var16;
              var14 = var14 + var16;
              var13 = var13 + var16;
              break L2;
            }
          }
          L3: {
            if (param1 + var9 <= ((le) this).field_g.field_W) {
              break L3;
            } else {
              var16 = param1 + var9 - ((le) this).field_g.field_W;
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
                    this.a(((le) this).field_f[param0], ((le) this).field_g.field_r, param3, var15, var12, var9, var10, var13, var14, param1, param2, ((le) this).field_i[param0], param5, param6, param7);
                    break L5;
                  } else {
                    this.b(((le) this).field_f[param0], ((le) this).field_g.field_r, param3, var15, var12, var9, var10, var13, var14, param1, param2, ((le) this).field_i[param0], param5, param6, param7);
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
          ((le) this).fa(param0, param1, param2, param3, param4);
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
                param3++;
                if (param0[param3] == 0) {
                  param4++;
                  var13++;
                  continue L1;
                } else {
                  var14 = ((param2 & 16711935) * var10 & -16711936) + ((param2 & 65280) * var10 & 16711680) >> 8;
                  var15 = param1[param4];
                  param4++;
                  param1[param4] = (((var15 & 16711935) * var11 & -16711936) + ((var15 & 65280) * var11 & 16711680) >> 8) + var14;
                  var13++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    le(sfa param0, qla param1, jpa[] param2, int[] param3, int[] param4) {
        super((ha) (Object) param0, param1);
        int var6 = 0;
        ((le) this).field_g = param0;
        ((le) this).field_i = param3;
        ((le) this).field_d = param4;
        ((le) this).field_f = new byte[param2.length][];
        ((le) this).field_h = new int[param2.length];
        ((le) this).field_e = new int[param2.length];
        for (var6 = 0; var6 < param2.length; var6++) {
            ((le) this).field_f[var6] = param2[var6].field_f;
            ((le) this).field_h[var6] = param2[var6].field_c;
            ((le) this).field_e[var6] = param2[var6].field_d;
        }
    }
}
