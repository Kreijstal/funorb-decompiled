/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lva extends ci {
    private short[] field_r;
    int field_w;
    int field_n;
    boolean field_s;
    private byte[] field_p;
    int field_z;
    static nh[] field_m;
    static String field_o;
    static String field_v;
    static String field_y;
    static jea field_t;
    int field_x;
    int field_u;
    private short[] field_q;

    private final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = TombRacer.field_G ? 1 : 0;
          if (param0 < ((lva) this).field_x) {
            ((lva) this).field_q = new short[((lva) this).field_n];
            ((lva) this).field_r = new short[((lva) this).field_n];
            var2 = 0;
            L1: while (true) {
              if (((lva) this).field_n <= var2) {
                break L0;
              } else {
                ((lva) this).field_q[var2] = (short)(int)(Math.pow((double)((float)((lva) this).field_x / 4096.0f), (double)var2) * 4096.0);
                ((lva) this).field_r[var2] = (short)(int)Math.pow(2.0, (double)var2);
                var2++;
                continue L1;
              }
            }
          } else {
            if (null == ((lva) this).field_q) {
              break L0;
            } else {
              if (((lva) this).field_q.length != ((lva) this).field_n) {
                break L0;
              } else {
                ((lva) this).field_r = new short[((lva) this).field_n];
                var2 = 0;
                L2: while (true) {
                  if (((lva) this).field_n <= var2) {
                    break L0;
                  } else {
                    ((lva) this).field_r[var2] = (short)(int)Math.pow(2.0, (double)var2);
                    var2++;
                    continue L2;
                  }
                }
              }
            }
          }
        }
    }

    final void a(byte param0, uia param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        Object stackIn_13_0 = null;
        Object stackIn_14_0 = null;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        Object stackOut_12_0 = null;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        L0: {
          var5 = TombRacer.field_G ? 1 : 0;
          var4 = param2;
          if (-1 != (var4 ^ -1)) {
            if (1 != var4) {
              if (var4 != -3) {
                if (-4 == var4) {
                  ((lva) this).field_w = param1.h(255);
                  ((lva) this).field_u = param1.h(255);
                  break L0;
                } else {
                  if (var4 != -5) {
                    if (5 == var4) {
                      ((lva) this).field_u = param1.h(255);
                      break L0;
                    } else {
                      if (-7 != var4) {
                        break L0;
                      } else {
                        ((lva) this).field_w = param1.h(255);
                        break L0;
                      }
                    }
                  } else {
                    ((lva) this).field_z = param1.h(255);
                    break L0;
                  }
                }
              } else {
                ((lva) this).field_x = param1.b(false);
                if (-1 >= (((lva) this).field_x ^ -1)) {
                  break L0;
                } else {
                  ((lva) this).field_q = new short[((lva) this).field_n];
                  var4 = 0;
                  L1: while (true) {
                    if (var4 >= ((lva) this).field_n) {
                      break L0;
                    } else {
                      ((lva) this).field_q[var4] = (short)param1.b(false);
                      var4++;
                      continue L1;
                    }
                  }
                }
              }
            } else {
              ((lva) this).field_n = param1.h(255);
              break L0;
            }
          } else {
            L2: {
              stackOut_12_0 = this;
              stackIn_14_0 = stackOut_12_0;
              stackIn_13_0 = stackOut_12_0;
              if (param1.h(255) != 1) {
                stackOut_14_0 = this;
                stackOut_14_1 = 0;
                stackIn_15_0 = stackOut_14_0;
                stackIn_15_1 = stackOut_14_1;
                break L2;
              } else {
                stackOut_13_0 = this;
                stackOut_13_1 = 1;
                stackIn_15_0 = stackOut_13_0;
                stackIn_15_1 = stackOut_13_1;
                break L2;
              }
            }
            ((lva) this).field_s = stackIn_15_1 != 0;
            break L0;
          }
        }
        L3: {
          if (param0 == 107) {
            break L3;
          } else {
            ((lva) this).field_u = -71;
            break L3;
          }
        }
    }

    final void a(int[] param0, int param1, int param2) {
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
        Object var20 = null;
        L0: {
          var19 = TombRacer.field_G ? 1 : 0;
          var5 = sj.field_b[param2] * ((lva) this).field_w;
          if (-2 != (((lva) this).field_n ^ -1)) {
            L1: {
              L2: {
                var9 = ((lva) this).field_q[0];
                if ((var9 ^ -1) < -9) {
                  break L2;
                } else {
                  if (var9 >= -8) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                var8 = ((lva) this).field_r[0] << -973322228;
                var12 = ((lva) this).field_u * var8 >> 769815052;
                var11 = var5 * var8 >> -488072148;
                var13 = ((lva) this).field_w * var8 >> -541816724;
                var15 = var11 >> 697473132;
                var16 = 1 + var15;
                var11 = var11 & 4095;
                if (var13 <= var16) {
                  var16 = 0;
                  break L3;
                } else {
                  break L3;
                }
              }
              var18 = 255 & ((lva) this).field_p[255 & var16];
              var17 = ((lva) this).field_p[var15 & 255] & 255;
              var14 = pba.field_b[var11];
              var10 = 0;
              L4: while (true) {
                if (ns.field_g <= var10) {
                  break L1;
                } else {
                  var4 = ((lva) this).field_u * ht.field_Fb[var10];
                  var6 = this.a(var17, false, var14, var11, var8 * var4 >> 1782175724, var12, var18);
                  param0[var10] = var6 * var9 >> 1965694156;
                  var10++;
                  continue L4;
                }
              }
            }
            var7 = 1;
            L5: while (true) {
              if (((lva) this).field_n <= var7) {
                break L0;
              } else {
                L6: {
                  var9 = ((lva) this).field_q[var7];
                  if ((var9 ^ -1) < -9) {
                    break L6;
                  } else {
                    if (var9 < -8) {
                      break L6;
                    } else {
                      var7++;
                      continue L5;
                    }
                  }
                }
                L7: {
                  var8 = ((lva) this).field_r[var7] << -1484201140;
                  var12 = var8 * ((lva) this).field_u >> -1962821908;
                  var11 = var8 * var5 >> 791864492;
                  var13 = ((lva) this).field_w * var8 >> 959129612;
                  var15 = var11 >> -1090151316;
                  var16 = var15 - -1;
                  var11 = var11 & 4095;
                  if (var16 >= var13) {
                    var16 = 0;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  var18 = ((lva) this).field_p[255 & var16] & 255;
                  var17 = ((lva) this).field_p[255 & var15] & 255;
                  var14 = pba.field_b[var11];
                  if (!((lva) this).field_s) {
                    break L8;
                  } else {
                    if (((lva) this).field_n + -1 == var7) {
                      var10 = 0;
                      L9: while (true) {
                        if (ns.field_g > var10) {
                          var4 = ((lva) this).field_u * ht.field_Fb[var10];
                          var6 = this.a(var17, false, var14, var11, var8 * var4 >> -1115609108, var12, var18);
                          var6 = (var6 * var9 >> 1811384652) + param0[var10];
                          param0[var10] = (var6 >> 1789871265) + 2048;
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
                  if (var10 < ns.field_g) {
                    var4 = ((lva) this).field_u * ht.field_Fb[var10];
                    var6 = this.a(var17, false, var14, var11, var4 * var8 >> -973656244, var12, var18);
                    param0[var10] = param0[var10] + (var9 * var6 >> 2027859756);
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
              var8 = ((lva) this).field_r[0] << -2065260724;
              var9 = ((lva) this).field_q[0];
              var12 = var8 * ((lva) this).field_u >> 1942397100;
              var11 = var8 * var5 >> 89401164;
              var13 = ((lva) this).field_w * var8 >> -1388217204;
              var15 = var11 >> -1894182836;
              var16 = 1 + var15;
              if (var16 >= var13) {
                var16 = 0;
                break L11;
              } else {
                break L11;
              }
            }
            var11 = var11 & 4095;
            var17 = ((lva) this).field_p[255 & var15] & 255;
            var14 = pba.field_b[var11];
            var18 = ((lva) this).field_p[var16 & 255] & 255;
            if (!((lva) this).field_s) {
              var10 = 0;
              L12: while (true) {
                if (var10 >= ns.field_g) {
                  break L0;
                } else {
                  var4 = ht.field_Fb[var10] * ((lva) this).field_u;
                  var6 = this.a(var17, false, var14, var11, var4 * var8 >> 450044812, var12, var18);
                  param0[var10] = var9 * var6 >> -809375316;
                  var10++;
                  continue L12;
                }
              }
            } else {
              var10 = 0;
              L13: while (true) {
                if (ns.field_g <= var10) {
                  break L0;
                } else {
                  var4 = ht.field_Fb[var10] * ((lva) this).field_u;
                  var6 = this.a(var17, false, var14, var11, var4 * var8 >> -1888172212, var12, var18);
                  var6 = var6 * var9 >> 1930719308;
                  param0[var10] = 2048 - -(var6 >> -1023230719);
                  var10++;
                  continue L13;
                }
              }
            }
          }
        }
        L14: {
          if (param1 == -1) {
            break L14;
          } else {
            var20 = null;
            ((lva) this).a((byte) 111, (uia) null, 5);
            break L14;
          }
        }
    }

    public static void d(byte param0) {
        if (param0 >= -34) {
            lva.d((byte) 124);
        }
        field_o = null;
        field_m = null;
        field_y = null;
        field_t = null;
        field_v = null;
    }

    final static boolean a(int param0, byte param1, int param2) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param1 == -21) {
            break L0;
          } else {
            field_v = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (hh.a(param0, (byte) 5, param2)) {
              break L2;
            } else {
              if (!upa.a(param2, 0, param0)) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackOut_5_0 = 1;
          stackIn_7_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    final void b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = TombRacer.field_G ? 1 : 0;
        ((lva) this).field_p = pca.a(((lva) this).field_z, (byte) 109);
        if (param0 != 116) {
            ((lva) this).b((byte) 55);
        }
        this.c(0);
        for (var2 = ((lva) this).field_n - 1; var2 >= 1; var2--) {
            var3 = ((lva) this).field_q[var2];
            // if_icmpgt L88
            if (7 > var3) {
                break;
            }
            ((lva) this).field_n = ((lva) this).field_n - 1;
        }
    }

    final int[] c(int param0, int param1) {
        int[] var4 = ((lva) this).field_i.a((byte) -119, param1);
        int[] var3 = var4;
        if (param0 != 1) {
            ((lva) this).field_q = null;
        }
        if (!(!((lva) this).field_i.field_d)) {
            ((lva) this).a(var4, param0 + -2, param1);
        }
        return var4;
    }

    final static void a(g[] param0, int param1, int param2, int param3) {
        if (!(param1 < param2)) {
            return;
        }
        int var4 = param1;
        int var5 = po.a(param2, var4, param1, (byte) -65, param0);
        lva.a(param0, param1, -1 + var5, param3);
        lva.a(param0, 1 + var5, param2, param3 + 0);
    }

    private final int a(int param0, boolean param1, int param2, int param3, int param4, int param5, int param6) {
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
        var18 = TombRacer.field_G ? 1 : 0;
        if (!param1) {
          L0: {
            var13 = param4 >> -902739956;
            var12 = 1 + var13;
            var13 = var13 & 255;
            param4 = param4 & 4095;
            if (param5 > var12) {
              break L0;
            } else {
              var12 = 0;
              break L0;
            }
          }
          L1: {
            var10 = -4096 + param3;
            var12 = var12 & 255;
            var11 = -4096 + param4;
            var15 = pba.field_b[param4];
            var14 = 3 & ((lva) this).field_p[param0 + var13];
            if (var14 > 1) {
              L2: {
                if ((var14 ^ -1) == -3) {
                  stackOut_11_0 = param4 + -param3;
                  stackIn_12_0 = stackOut_11_0;
                  break L2;
                } else {
                  stackOut_10_0 = -param4 + -param3;
                  stackIn_12_0 = stackOut_10_0;
                  break L2;
                }
              }
              var8 = stackIn_12_0;
              break L1;
            } else {
              L3: {
                if (0 == var14) {
                  stackOut_7_0 = param3 + param4;
                  stackIn_8_0 = stackOut_7_0;
                  break L3;
                } else {
                  stackOut_6_0 = -param4 + param3;
                  stackIn_8_0 = stackOut_6_0;
                  break L3;
                }
              }
              var8 = stackIn_8_0;
              break L1;
            }
          }
          L4: {
            var14 = 3 & ((lva) this).field_p[var12 + param0];
            if (var14 > 1) {
              L5: {
                if (2 == var14) {
                  stackOut_20_0 = var11 + -param3;
                  stackIn_21_0 = stackOut_20_0;
                  break L5;
                } else {
                  stackOut_19_0 = -param3 + -var11;
                  stackIn_21_0 = stackOut_19_0;
                  break L5;
                }
              }
              var9 = stackIn_21_0;
              break L4;
            } else {
              L6: {
                if (-1 != (var14 ^ -1)) {
                  stackOut_16_0 = -var11 + param3;
                  stackIn_17_0 = stackOut_16_0;
                  break L6;
                } else {
                  stackOut_15_0 = param3 + var11;
                  stackIn_17_0 = stackOut_15_0;
                  break L6;
                }
              }
              var9 = stackIn_17_0;
              break L4;
            }
          }
          L7: {
            var16 = var8 - -((var9 - var8) * var15 >> 1632800428);
            var14 = ((lva) this).field_p[var13 + param6] & 3;
            if (1 >= var14) {
              L8: {
                if (-1 == (var14 ^ -1)) {
                  stackOut_29_0 = param4 + var10;
                  stackIn_30_0 = stackOut_29_0;
                  break L8;
                } else {
                  stackOut_28_0 = -param4 + var10;
                  stackIn_30_0 = stackOut_28_0;
                  break L8;
                }
              }
              var8 = stackIn_30_0;
              break L7;
            } else {
              L9: {
                if (2 != var14) {
                  stackOut_25_0 = -var10 + -param4;
                  stackIn_26_0 = stackOut_25_0;
                  break L9;
                } else {
                  stackOut_24_0 = -var10 + param4;
                  stackIn_26_0 = stackOut_24_0;
                  break L9;
                }
              }
              var8 = stackIn_26_0;
              break L7;
            }
          }
          L10: {
            var14 = ((lva) this).field_p[param6 + var12] & 3;
            if ((var14 ^ -1) >= -2) {
              L11: {
                if (0 != var14) {
                  stackOut_38_0 = -var11 + var10;
                  stackIn_39_0 = stackOut_38_0;
                  break L11;
                } else {
                  stackOut_37_0 = var11 + var10;
                  stackIn_39_0 = stackOut_37_0;
                  break L11;
                }
              }
              var9 = stackIn_39_0;
              break L10;
            } else {
              L12: {
                if (2 == var14) {
                  stackOut_34_0 = -var10 + var11;
                  stackIn_35_0 = stackOut_34_0;
                  break L12;
                } else {
                  stackOut_33_0 = -var11 - var10;
                  stackIn_35_0 = stackOut_33_0;
                  break L12;
                }
              }
              var9 = stackIn_35_0;
              break L10;
            }
          }
          var17 = ((-var8 + var9) * var15 >> 2051106956) + var8;
          return var16 - -(param2 * (-var16 + var17) >> -387161428);
        } else {
          return -28;
        }
    }

    public lva() {
        super(0, true);
        ((lva) this).field_s = true;
        ((lva) this).field_z = 0;
        ((lva) this).field_x = 1638;
        ((lva) this).field_n = 4;
        ((lva) this).field_p = new byte[512];
        ((lva) this).field_u = 4;
        ((lva) this).field_w = 4;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Click or press F10 to open Quick Chat";
        field_y = "Arrow";
        field_v = "You cannot join this game - it is in progress";
    }
}
