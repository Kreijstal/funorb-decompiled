/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rw extends le {
    private short[] field_m;
    boolean field_s;
    int field_j;
    int field_o;
    int field_k;
    static float field_n;
    private short[] field_t;
    private int field_i;
    static int field_q;
    int field_r;
    private byte[] field_p;
    static asb field_l;

    private final void d(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = VoidHunters.field_G;
          var2 = 51 / ((62 - param0) / 50);
          if (-1 <= (((rw) this).field_k ^ -1)) {
            if (((rw) this).field_m == null) {
              break L0;
            } else {
              if (((rw) this).field_m.length == ((rw) this).field_r) {
                ((rw) this).field_t = new short[((rw) this).field_r];
                var3 = 0;
                L1: while (true) {
                  if (((rw) this).field_r <= var3) {
                    break L0;
                  } else {
                    ((rw) this).field_t[var3] = (short)(int)Math.pow(2.0, (double)var3);
                    var3++;
                    continue L1;
                  }
                }
              } else {
                break L0;
              }
            }
          } else {
            ((rw) this).field_t = new short[((rw) this).field_r];
            ((rw) this).field_m = new short[((rw) this).field_r];
            var3 = 0;
            L2: while (true) {
              if (((rw) this).field_r <= var3) {
                break L0;
              } else {
                ((rw) this).field_m[var3] = (short)(int)(4096.0 * Math.pow((double)((float)((rw) this).field_k / 4096.0f), (double)var3));
                ((rw) this).field_t[var3] = (short)(int)Math.pow(2.0, (double)var3);
                var3++;
                continue L2;
              }
            }
          }
        }
    }

    final void a(int param0, int param1, int[] param2) {
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
          var19 = VoidHunters.field_G;
          var5 = ((rw) this).field_o * sj.field_p[param1];
          if (param0 == ((rw) this).field_r) {
            L1: {
              var8 = ((rw) this).field_t[0] << -1225982132;
              var9 = ((rw) this).field_m[0];
              var12 = var8 * ((rw) this).field_j >> -290048820;
              var13 = var8 * ((rw) this).field_o >> 1444091916;
              var11 = var5 * var8 >> -1091121876;
              var15 = var11 >> -976841684;
              var16 = var15 + 1;
              if (var13 > var16) {
                break L1;
              } else {
                var16 = 0;
                break L1;
              }
            }
            var11 = var11 & 4095;
            var14 = ocb.field_h[var11];
            var17 = ((rw) this).field_p[255 & var15] & 255;
            var18 = 255 & ((rw) this).field_p[255 & var16];
            if (((rw) this).field_s) {
              var10 = 0;
              L2: while (true) {
                if (hob.field_d <= var10) {
                  break L0;
                } else {
                  var4 = grb.field_l[var10] * ((rw) this).field_j;
                  var6 = this.a(var18, var17, var12, var4 * var8 >> 1222941260, var14, var11, (byte) -34);
                  var6 = var9 * var6 >> -1819014036;
                  param2[var10] = 2048 + (var6 >> 1367382209);
                  var10++;
                  continue L2;
                }
              }
            } else {
              var10 = 0;
              L3: while (true) {
                if (hob.field_d <= var10) {
                  break L0;
                } else {
                  var4 = ((rw) this).field_j * grb.field_l[var10];
                  var6 = this.a(var18, var17, var12, var4 * var8 >> -1227637460, var14, var11, (byte) -34);
                  param2[var10] = var9 * var6 >> 1308730092;
                  var10++;
                  continue L3;
                }
              }
            }
          } else {
            L4: {
              L5: {
                var9 = ((rw) this).field_m[0];
                if (-9 > var9) {
                  break L5;
                } else {
                  if (7 > var9) {
                    break L5;
                  } else {
                    break L4;
                  }
                }
              }
              L6: {
                var8 = ((rw) this).field_t[0] << -803173076;
                var13 = ((rw) this).field_o * var8 >> 1365375852;
                var11 = var8 * var5 >> -1168357108;
                var12 = ((rw) this).field_j * var8 >> -189824884;
                var15 = var11 >> -1146871572;
                var16 = 1 + var15;
                if (var16 < var13) {
                  break L6;
                } else {
                  var16 = 0;
                  break L6;
                }
              }
              var11 = var11 & 4095;
              var14 = ocb.field_h[var11];
              var17 = 255 & ((rw) this).field_p[255 & var15];
              var18 = ((rw) this).field_p[255 & var16] & 255;
              var10 = 0;
              L7: while (true) {
                if (var10 >= hob.field_d) {
                  break L4;
                } else {
                  var4 = grb.field_l[var10] * ((rw) this).field_j;
                  var6 = this.a(var18, var17, var12, var4 * var8 >> -656924628, var14, var11, (byte) -34);
                  param2[var10] = var9 * var6 >> 1789614188;
                  var10++;
                  continue L7;
                }
              }
            }
            var7 = 1;
            L8: while (true) {
              if (var7 >= ((rw) this).field_r) {
                break L0;
              } else {
                L9: {
                  var9 = ((rw) this).field_m[var7];
                  if (8 < var9) {
                    break L9;
                  } else {
                    if (var9 < -8) {
                      break L9;
                    } else {
                      var7++;
                      continue L8;
                    }
                  }
                }
                L10: {
                  var8 = ((rw) this).field_t[var7] << 8990348;
                  var12 = ((rw) this).field_j * var8 >> -57424692;
                  var11 = var5 * var8 >> 2034293708;
                  var13 = var8 * ((rw) this).field_o >> -749300916;
                  var15 = var11 >> -489986196;
                  var16 = 1 + var15;
                  var11 = var11 & 4095;
                  if (var13 <= var16) {
                    var16 = 0;
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L11: {
                  var14 = ocb.field_h[var11];
                  var17 = ((rw) this).field_p[var15 & 255] & 255;
                  var18 = ((rw) this).field_p[255 & var16] & 255;
                  if (!((rw) this).field_s) {
                    break L11;
                  } else {
                    if (((rw) this).field_r + -1 != var7) {
                      break L11;
                    } else {
                      var10 = 0;
                      L12: while (true) {
                        if (hob.field_d > var10) {
                          var4 = ((rw) this).field_j * grb.field_l[var10];
                          var6 = this.a(var18, var17, var12, var8 * var4 >> 1327814412, var14, var11, (byte) -34);
                          var6 = (var9 * var6 >> 1439147340) + param2[var10];
                          param2[var10] = 2048 - -(var6 >> -1244224415);
                          var10++;
                          continue L12;
                        } else {
                          var7++;
                          continue L8;
                        }
                      }
                    }
                  }
                }
                var10 = 0;
                L13: while (true) {
                  if (var10 < hob.field_d) {
                    var4 = grb.field_l[var10] * ((rw) this).field_j;
                    var6 = this.a(var18, var17, var12, var8 * var4 >> -46897076, var14, var11, (byte) -34);
                    param2[var10] = param2[var10] + (var6 * var9 >> 1344259884);
                    var10++;
                    continue L13;
                  } else {
                    var7++;
                    continue L8;
                  }
                }
              }
            }
          }
        }
    }

    final void c(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = VoidHunters.field_G;
        ((rw) this).field_p = ihb.a((byte) 95, ((rw) this).field_i);
        this.d(-80);
        var2 = ((rw) this).field_r - 1;
        if (param0 < -35) {
          L0: while (true) {
            L1: {
              if (var2 < 1) {
                break L1;
              } else {
                var3 = ((rw) this).field_m[var2];
                if (var3 < -9) {
                  break L1;
                } else {
                  if (7 > var3) {
                    break L1;
                  } else {
                    ((rw) this).field_r = ((rw) this).field_r - 1;
                    var2--;
                    continue L0;
                  }
                }
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    public rw() {
        super(0, true);
        ((rw) this).field_o = 4;
        ((rw) this).field_j = 4;
        ((rw) this).field_s = true;
        ((rw) this).field_i = 0;
        ((rw) this).field_r = 4;
        ((rw) this).field_k = 1638;
        ((rw) this).field_p = new byte[512];
    }

    final void a(int param0, int param1, ds param2) {
        int var4 = 0;
        int var5 = 0;
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        Object stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        Object stackOut_11_0 = null;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        L0: {
          var5 = VoidHunters.field_G;
          var4 = param0;
          if (0 != var4) {
            if (1 == var4) {
              ((rw) this).field_r = param2.e((byte) -96);
              break L0;
            } else {
              if (2 != var4) {
                if (-4 != (var4 ^ -1)) {
                  if (4 == var4) {
                    ((rw) this).field_i = param2.e((byte) -92);
                    break L0;
                  } else {
                    if (var4 == -6) {
                      ((rw) this).field_j = param2.e((byte) -111);
                      break L0;
                    } else {
                      if (var4 != 6) {
                        break L0;
                      } else {
                        ((rw) this).field_o = param2.e((byte) -95);
                        break L0;
                      }
                    }
                  }
                } else {
                  ((rw) this).field_o = param2.e((byte) -106);
                  ((rw) this).field_j = param2.e((byte) -106);
                  break L0;
                }
              } else {
                ((rw) this).field_k = param2.a(true);
                if (((rw) this).field_k < 0) {
                  ((rw) this).field_m = new short[((rw) this).field_r];
                  var4 = 0;
                  L1: while (true) {
                    if (((rw) this).field_r <= var4) {
                      break L0;
                    } else {
                      ((rw) this).field_m[var4] = (short)param2.a(true);
                      var4++;
                      continue L1;
                    }
                  }
                } else {
                  break L0;
                }
              }
            }
          } else {
            L2: {
              stackOut_11_0 = this;
              stackIn_13_0 = stackOut_11_0;
              stackIn_12_0 = stackOut_11_0;
              if (-2 != param2.e((byte) -127)) {
                stackOut_13_0 = this;
                stackOut_13_1 = 0;
                stackIn_14_0 = stackOut_13_0;
                stackIn_14_1 = stackOut_13_1;
                break L2;
              } else {
                stackOut_12_0 = this;
                stackOut_12_1 = 1;
                stackIn_14_0 = stackOut_12_0;
                stackIn_14_1 = stackOut_12_1;
                break L2;
              }
            }
            ((rw) this).field_s = stackIn_14_1 != 0;
            break L0;
          }
        }
        L3: {
          if (param1 <= -60) {
            break L3;
          } else {
            ((rw) this).field_k = -4;
            break L3;
          }
        }
    }

    private final int a(int param0, int param1, int param2, int param3, int param4, int param5, byte param6) {
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
        Object var19 = null;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_39_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_33_0 = 0;
        L0: {
          var18 = VoidHunters.field_G;
          var13 = param3 >> -608679732;
          var12 = 1 + var13;
          var13 = var13 & 255;
          if (var12 < param2) {
            break L0;
          } else {
            var12 = 0;
            break L0;
          }
        }
        L1: {
          param3 = param3 & 4095;
          if (param6 == -34) {
            break L1;
          } else {
            var19 = null;
            ((rw) this).a(77, -92, (ds) null);
            break L1;
          }
        }
        L2: {
          var12 = var12 & 255;
          var11 = param3 + -4096;
          var10 = -4096 + param5;
          var14 = ((rw) this).field_p[var13 - -param1] & 3;
          var15 = ocb.field_h[param3];
          if (-2 > var14) {
            L3: {
              if (var14 != 2) {
                stackOut_11_0 = -param5 + -param3;
                stackIn_12_0 = stackOut_11_0;
                break L3;
              } else {
                stackOut_10_0 = -param5 + param3;
                stackIn_12_0 = stackOut_10_0;
                break L3;
              }
            }
            var8 = stackIn_12_0;
            break L2;
          } else {
            L4: {
              if (-1 == var14) {
                stackOut_7_0 = param3 + param5;
                stackIn_8_0 = stackOut_7_0;
                break L4;
              } else {
                stackOut_6_0 = -param3 + param5;
                stackIn_8_0 = stackOut_6_0;
                break L4;
              }
            }
            var8 = stackIn_8_0;
            break L2;
          }
        }
        L5: {
          var14 = 3 & ((rw) this).field_p[var12 + param1];
          if ((var14 ^ -1) >= -2) {
            L6: {
              if (0 == var14) {
                stackOut_20_0 = var11 - -param5;
                stackIn_21_0 = stackOut_20_0;
                break L6;
              } else {
                stackOut_19_0 = -var11 + param5;
                stackIn_21_0 = stackOut_19_0;
                break L6;
              }
            }
            var9 = stackIn_21_0;
            break L5;
          } else {
            L7: {
              if ((var14 ^ -1) != -3) {
                stackOut_16_0 = -param5 + -var11;
                stackIn_17_0 = stackOut_16_0;
                break L7;
              } else {
                stackOut_15_0 = -param5 + var11;
                stackIn_17_0 = stackOut_15_0;
                break L7;
              }
            }
            var9 = stackIn_17_0;
            break L5;
          }
        }
        L8: {
          var14 = ((rw) this).field_p[param0 + var13] & 3;
          var16 = var8 + ((-var8 + var9) * var15 >> 1754252012);
          if (var14 <= 1) {
            L9: {
              if (var14 == 0) {
                stackOut_29_0 = param3 + var10;
                stackIn_30_0 = stackOut_29_0;
                break L9;
              } else {
                stackOut_28_0 = var10 - param3;
                stackIn_30_0 = stackOut_28_0;
                break L9;
              }
            }
            var8 = stackIn_30_0;
            break L8;
          } else {
            L10: {
              if ((var14 ^ -1) != -3) {
                stackOut_25_0 = -var10 + -param3;
                stackIn_26_0 = stackOut_25_0;
                break L10;
              } else {
                stackOut_24_0 = param3 - var10;
                stackIn_26_0 = stackOut_24_0;
                break L10;
              }
            }
            var8 = stackIn_26_0;
            break L8;
          }
        }
        L11: {
          var14 = 3 & ((rw) this).field_p[param0 + var12];
          if (-2 > (var14 ^ -1)) {
            L12: {
              if (2 != var14) {
                stackOut_38_0 = -var10 + -var11;
                stackIn_39_0 = stackOut_38_0;
                break L12;
              } else {
                stackOut_37_0 = var11 - var10;
                stackIn_39_0 = stackOut_37_0;
                break L12;
              }
            }
            var9 = stackIn_39_0;
            break L11;
          } else {
            L13: {
              if (0 == var14) {
                stackOut_34_0 = var11 + var10;
                stackIn_35_0 = stackOut_34_0;
                break L13;
              } else {
                stackOut_33_0 = var10 + -var11;
                stackIn_35_0 = stackOut_33_0;
                break L13;
              }
            }
            var9 = stackIn_35_0;
            break L11;
          }
        }
        var17 = var8 - -(var15 * (var9 - var8) >> -1516366644);
        return (param4 * (-var16 + var17) >> 1920794604) + var16;
    }

    public static void e(byte param0) {
        field_l = null;
        int var1 = 4 / ((-39 - param0) / 39);
    }

    final int[] a(int param0, boolean param1) {
        int[] var5 = ((rw) this).field_f.a((byte) 127, param0);
        int[] var3 = var5;
        if (((rw) this).field_f.field_e) {
            ((rw) this).a(1, param0, var5);
        }
        if (!param1) {
            Object var4 = null;
            ((rw) this).a(-38, 6, (ds) null);
        }
        return var5;
    }

    final static void a(boolean param0, byte param1) {
        if (param1 != 71) {
            return;
        }
        pi.a((byte) -121, true, param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = 1.0f;
        field_q = 0;
    }
}
