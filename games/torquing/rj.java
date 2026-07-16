/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rj extends am {
    static String field_y;
    private int field_D;
    private byte[] field_s;
    private int field_A;
    private boolean field_B;
    private int field_u;
    private int field_C;
    private short[] field_t;
    static cf field_v;
    private int field_z;
    private short[] field_x;
    static int field_w;

    final static void a(int param0, String param1, t param2) {
        hf.field_a = param1;
        if (param0 >= -43) {
            Object var4 = null;
            rj.a(87, (String) null, (t) null);
        }
        jd.field_D = param2;
    }

    private final int a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var8 = 0;
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
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_37_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        L0: {
          var18 = Torquing.field_u;
          var13 = param1 >> 1069143884;
          var12 = var13 + 1;
          var13 = var13 & 255;
          if (param0 > var12) {
            break L0;
          } else {
            var12 = 0;
            break L0;
          }
        }
        L1: {
          param1 = param1 & 4095;
          var10 = param2 - param5;
          var12 = var12 & 255;
          var11 = -4096 + param1;
          var15 = cf.field_a[param1];
          var14 = ((rj) this).field_s[param4 + var13] & 3;
          if (-2 <= (var14 ^ -1)) {
            L2: {
              if (0 == var14) {
                stackOut_9_0 = param1 + param2;
                stackIn_10_0 = stackOut_9_0;
                break L2;
              } else {
                stackOut_8_0 = param2 - param1;
                stackIn_10_0 = stackOut_8_0;
                break L2;
              }
            }
            var8 = stackIn_10_0;
            break L1;
          } else {
            L3: {
              if (2 == var14) {
                stackOut_5_0 = param1 - param2;
                stackIn_6_0 = stackOut_5_0;
                break L3;
              } else {
                stackOut_4_0 = -param2 + -param1;
                stackIn_6_0 = stackOut_4_0;
                break L3;
              }
            }
            var8 = stackIn_6_0;
            break L1;
          }
        }
        L4: {
          var14 = 3 & ((rj) this).field_s[var12 + param4];
          if ((var14 ^ -1) >= -2) {
            L5: {
              if (var14 == 0) {
                stackOut_18_0 = var11 + param2;
                stackIn_19_0 = stackOut_18_0;
                break L5;
              } else {
                stackOut_17_0 = -var11 + param2;
                stackIn_19_0 = stackOut_17_0;
                break L5;
              }
            }
            var9 = stackIn_19_0;
            break L4;
          } else {
            L6: {
              if (var14 != 2) {
                stackOut_14_0 = -var11 + -param2;
                stackIn_15_0 = stackOut_14_0;
                break L6;
              } else {
                stackOut_13_0 = var11 - param2;
                stackIn_15_0 = stackOut_13_0;
                break L6;
              }
            }
            var9 = stackIn_15_0;
            break L4;
          }
        }
        L7: {
          var14 = ((rj) this).field_s[var13 + param6] & 3;
          var16 = var8 - -((-var8 + var9) * var15 >> -1648429556);
          if (-2 <= (var14 ^ -1)) {
            L8: {
              if (0 != var14) {
                stackOut_27_0 = -param1 + var10;
                stackIn_28_0 = stackOut_27_0;
                break L8;
              } else {
                stackOut_26_0 = var10 + param1;
                stackIn_28_0 = stackOut_26_0;
                break L8;
              }
            }
            var8 = stackIn_28_0;
            break L7;
          } else {
            L9: {
              if (var14 == 2) {
                stackOut_23_0 = -var10 + param1;
                stackIn_24_0 = stackOut_23_0;
                break L9;
              } else {
                stackOut_22_0 = -param1 - var10;
                stackIn_24_0 = stackOut_22_0;
                break L9;
              }
            }
            var8 = stackIn_24_0;
            break L7;
          }
        }
        L10: {
          var14 = 3 & ((rj) this).field_s[var12 + param6];
          if (-2 <= (var14 ^ -1)) {
            L11: {
              if (var14 != 0) {
                stackOut_36_0 = -var11 + var10;
                stackIn_37_0 = stackOut_36_0;
                break L11;
              } else {
                stackOut_35_0 = var11 - -var10;
                stackIn_37_0 = stackOut_35_0;
                break L11;
              }
            }
            var9 = stackIn_37_0;
            break L10;
          } else {
            L12: {
              if (var14 != 2) {
                stackOut_32_0 = -var10 + -var11;
                stackIn_33_0 = stackOut_32_0;
                break L12;
              } else {
                stackOut_31_0 = -var10 + var11;
                stackIn_33_0 = stackOut_31_0;
                break L12;
              }
            }
            var9 = stackIn_33_0;
            break L10;
          }
        }
        var17 = var8 - -((-var8 + var9) * var15 >> 366825740);
        return var16 - -(param3 * (-var16 + var17) >> 82724012);
    }

    final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = Torquing.field_u;
          ((rj) this).field_s = i.b(10758, ((rj) this).field_A);
          if (param0 > 123) {
            break L0;
          } else {
            ((rj) this).field_s = null;
            break L0;
          }
        }
        this.a(false);
        var2 = -1 + ((rj) this).field_C;
        L1: while (true) {
          L2: {
            if (var2 < 1) {
              break L2;
            } else {
              var3 = ((rj) this).field_x[var2];
              if (-9 > (var3 ^ -1)) {
                break L2;
              } else {
                if ((var3 ^ -1) > 7) {
                  break L2;
                } else {
                  ((rj) this).field_C = ((rj) this).field_C - 1;
                  var2--;
                  continue L1;
                }
              }
            }
          }
          return;
        }
    }

    private final void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = Torquing.field_u;
          if (!param0) {
            break L0;
          } else {
            int[] discarded$2 = ((rj) this).a((byte) -6, 28);
            break L0;
          }
        }
        L1: {
          if (0 >= ((rj) this).field_z) {
            if (((rj) this).field_x == null) {
              break L1;
            } else {
              if (((rj) this).field_x.length != ((rj) this).field_C) {
                break L1;
              } else {
                ((rj) this).field_t = new short[((rj) this).field_C];
                var2 = 0;
                L2: while (true) {
                  if (((rj) this).field_C <= var2) {
                    break L1;
                  } else {
                    ((rj) this).field_t[var2] = (short)(int)Math.pow(2.0, (double)var2);
                    var2++;
                    continue L2;
                  }
                }
              }
            }
          } else {
            ((rj) this).field_t = new short[((rj) this).field_C];
            ((rj) this).field_x = new short[((rj) this).field_C];
            var2 = 0;
            L3: while (true) {
              if (((rj) this).field_C <= var2) {
                break L1;
              } else {
                ((rj) this).field_x[var2] = (short)(int)(Math.pow((double)((float)((rj) this).field_z / 4096.0f), (double)var2) * 4096.0);
                ((rj) this).field_t[var2] = (short)(int)Math.pow(2.0, (double)var2);
                var2++;
                continue L3;
              }
            }
          }
        }
    }

    final int[] a(byte param0, int param1) {
        int[] var4 = ((rj) this).field_l.a(param1, 25657);
        int[] var3 = var4;
        if (param0 < 86) {
            return null;
        }
        if (!(!((rj) this).field_l.field_b)) {
            this.a(true, var4, param1);
        }
        return var4;
    }

    final void a(fj param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        Object stackIn_15_0 = null;
        Object stackIn_16_0 = null;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        Object stackOut_14_0 = null;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        L0: {
          var5 = Torquing.field_u;
          if (param1 == 35) {
            break L0;
          } else {
            ((rj) this).field_A = 54;
            break L0;
          }
        }
        L1: {
          var4 = param2;
          if (0 == var4) {
            L2: {
              stackOut_14_0 = this;
              stackIn_16_0 = stackOut_14_0;
              stackIn_15_0 = stackOut_14_0;
              if (-2 != (param0.i((byte) -101) ^ -1)) {
                stackOut_16_0 = this;
                stackOut_16_1 = 0;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                break L2;
              } else {
                stackOut_15_0 = this;
                stackOut_15_1 = 1;
                stackIn_17_0 = stackOut_15_0;
                stackIn_17_1 = stackOut_15_1;
                break L2;
              }
            }
            ((rj) this).field_B = stackIn_17_1 != 0;
            break L1;
          } else {
            if (-2 != (var4 ^ -1)) {
              if (var4 != 2) {
                if (3 != var4) {
                  if (var4 == 4) {
                    ((rj) this).field_A = param0.i((byte) -101);
                    break L1;
                  } else {
                    if ((var4 ^ -1) != -6) {
                      if (-7 != (var4 ^ -1)) {
                        break L1;
                      } else {
                        ((rj) this).field_u = param0.i((byte) -101);
                        break L1;
                      }
                    } else {
                      ((rj) this).field_D = param0.i((byte) -101);
                      break L1;
                    }
                  }
                } else {
                  int dupTemp$1 = param0.i((byte) -101);
                  ((rj) this).field_u = dupTemp$1;
                  ((rj) this).field_D = dupTemp$1;
                  break L1;
                }
              } else {
                ((rj) this).field_z = param0.g(65536);
                if (0 > ((rj) this).field_z) {
                  ((rj) this).field_x = new short[((rj) this).field_C];
                  var4 = 0;
                  L3: while (true) {
                    if ((var4 ^ -1) <= (((rj) this).field_C ^ -1)) {
                      break L1;
                    } else {
                      ((rj) this).field_x[var4] = (short)param0.g(65536);
                      var4++;
                      continue L3;
                    }
                  }
                } else {
                  break L1;
                }
              }
            } else {
              ((rj) this).field_C = param0.i((byte) -101);
              break L1;
            }
          }
        }
    }

    public static void g(byte param0) {
        field_v = null;
        if (param0 > -101) {
            rj.g((byte) 114);
        }
        field_y = null;
    }

    public rj() {
        super(0, true);
        ((rj) this).field_s = new byte[512];
        ((rj) this).field_u = 4;
        ((rj) this).field_D = 4;
        ((rj) this).field_C = 4;
        ((rj) this).field_B = true;
        ((rj) this).field_z = 1638;
        ((rj) this).field_A = 0;
    }

    private final void a(boolean param0, int[] param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
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
        L0: {
          var19 = Torquing.field_u;
          var5 = dp.field_a[param2] * ((rj) this).field_u;
          if (((rj) this).field_C != 1) {
            L1: {
              L2: {
                var9 = ((rj) this).field_x[0];
                if (8 < var9) {
                  break L2;
                } else {
                  if ((var9 ^ -1) > 7) {
                    break L2;
                  } else {
                    break L1;
                  }
                }
              }
              L3: {
                var8 = ((rj) this).field_t[0] << 1551860972;
                var13 = var8 * ((rj) this).field_u >> 1593468972;
                var11 = var5 * var8 >> -61702484;
                var12 = var8 * ((rj) this).field_D >> 1318340172;
                var15 = var11 >> 871351404;
                var16 = var15 + 1;
                var11 = var11 & 4095;
                if (var16 >= var13) {
                  var16 = 0;
                  break L3;
                } else {
                  break L3;
                }
              }
              var17 = ((rj) this).field_s[var15 & 255] & 255;
              var14 = cf.field_a[var11];
              var18 = 255 & ((rj) this).field_s[var16 & 255];
              var10 = 0;
              L4: while (true) {
                if (ci.field_c <= var10) {
                  break L1;
                } else {
                  var4 = q.field_b[var10] * ((rj) this).field_D;
                  var6 = this.a(var12, var4 * var8 >> 941357612, var11, var14, var17, 4096, var18);
                  param1[var10] = var6 * var9 >> -752552724;
                  var10++;
                  continue L4;
                }
              }
            }
            var7 = 1;
            L5: while (true) {
              if (var7 >= ((rj) this).field_C) {
                break L0;
              } else {
                L6: {
                  var9 = ((rj) this).field_x[var7];
                  if (var9 > 8) {
                    break L6;
                  } else {
                    if ((var9 ^ -1) > 7) {
                      break L6;
                    } else {
                      var7++;
                      continue L5;
                    }
                  }
                }
                L7: {
                  var8 = ((rj) this).field_t[var7] << -1719506260;
                  var13 = ((rj) this).field_u * var8 >> 1118324332;
                  var11 = var5 * var8 >> 509101196;
                  var12 = var8 * ((rj) this).field_D >> -911271124;
                  var15 = var11 >> -116070292;
                  var16 = var15 - -1;
                  if (var13 > var16) {
                    break L7;
                  } else {
                    var16 = 0;
                    break L7;
                  }
                }
                L8: {
                  var11 = var11 & 4095;
                  var14 = cf.field_a[var11];
                  var18 = 255 & ((rj) this).field_s[var16 & 255];
                  var17 = ((rj) this).field_s[255 & var15] & 255;
                  if (!((rj) this).field_B) {
                    break L8;
                  } else {
                    if (var7 == ((rj) this).field_C - 1) {
                      var10 = 0;
                      L9: while (true) {
                        if (ci.field_c > var10) {
                          var4 = ((rj) this).field_D * q.field_b[var10];
                          var6 = this.a(var12, var8 * var4 >> 974318124, var11, var14, var17, 4096, var18);
                          var6 = param1[var10] + (var6 * var9 >> -342902516);
                          param1[var10] = 2048 + (var6 >> 889352417);
                          var10++;
                          continue L9;
                        } else {
                          var7++;
                          continue L5;
                        }
                      }
                    } else {
                      break L8;
                    }
                  }
                }
                var10 = 0;
                L10: while (true) {
                  if (var10 < ci.field_c) {
                    var4 = ((rj) this).field_D * q.field_b[var10];
                    var6 = this.a(var12, var4 * var8 >> 755956076, var11, var14, var17, 4096, var18);
                    param1[var10] = param1[var10] + (var6 * var9 >> -1021260244);
                    var10++;
                    continue L10;
                  } else {
                    var7++;
                    continue L5;
                  }
                }
              }
            }
          } else {
            L11: {
              var9 = ((rj) this).field_x[0];
              var8 = ((rj) this).field_t[0] << 1167408300;
              var12 = var8 * ((rj) this).field_D >> -1252166804;
              var11 = var8 * var5 >> -2022822292;
              var13 = var8 * ((rj) this).field_u >> 719883052;
              var15 = var11 >> -1696196404;
              var16 = 1 + var15;
              var11 = var11 & 4095;
              if (var13 > var16) {
                break L11;
              } else {
                var16 = 0;
                break L11;
              }
            }
            var14 = cf.field_a[var11];
            var17 = ((rj) this).field_s[var15 & 255] & 255;
            var18 = ((rj) this).field_s[var16 & 255] & 255;
            if (((rj) this).field_B) {
              var10 = 0;
              L12: while (true) {
                if (ci.field_c <= var10) {
                  break L0;
                } else {
                  var4 = ((rj) this).field_D * q.field_b[var10];
                  var6 = this.a(var12, var4 * var8 >> 765020204, var11, var14, var17, 4096, var18);
                  var6 = var9 * var6 >> -149182324;
                  param1[var10] = (var6 >> -1055456991) + 2048;
                  var10++;
                  continue L12;
                }
              }
            } else {
              var10 = 0;
              L13: while (true) {
                if (var10 >= ci.field_c) {
                  break L0;
                } else {
                  var4 = ((rj) this).field_D * q.field_b[var10];
                  var6 = this.a(var12, var4 * var8 >> 1245642956, var11, var14, var17, 4096, var18);
                  param1[var10] = var6 * var9 >> -1184587604;
                  var10++;
                  continue L13;
                }
              }
            }
          }
        }
        L14: {
          if (param0) {
            break L14;
          } else {
            ((rj) this).a((byte) -49);
            break L14;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = new cf(16);
    }
}
