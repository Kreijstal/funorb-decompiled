/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ql extends ud {
    static byte[][] field_p;
    private short[] field_k;
    int field_s;
    private short[] field_l;
    private int field_m;
    int field_j;
    int field_h;
    static int[] field_o;
    static uc field_r;
    int field_q;
    boolean field_n;
    private byte[] field_i;

    public static void a(byte param0) {
        field_r = null;
        field_p = (byte[][]) null;
        if (param0 >= -11) {
            field_o = (int[]) null;
        }
        field_o = null;
    }

    final void a(boolean param0, int[] param1, int param2) {
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
        Object stackIn_26_0 = null;
        Object stackIn_27_0 = null;
        Object stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        Object stackIn_33_0 = null;
        Object stackIn_34_0 = null;
        Object stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        Object stackOut_25_0 = null;
        Object stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        Object stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        Object stackOut_32_0 = null;
        Object stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        Object stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        var19 = AceOfSkies.field_G ? 1 : 0;
        if (param0) {
          L0: {
            var5 = mo.field_c[param2] * ((ql) this).field_h;
            if (-2 == ((ql) this).field_s) {
              L1: {
                var9 = ((ql) this).field_k[0];
                var8 = ((ql) this).field_l[0] << 1989972972;
                var11 = var5 * var8 >> 938898956;
                var13 = var8 * ((ql) this).field_h >> 495279468;
                var12 = var8 * ((ql) this).field_q >> 2117427628;
                var15 = var11 >> -1456252372;
                var16 = var15 + 1;
                var11 = var11 & 4095;
                if (var13 > var16) {
                  break L1;
                } else {
                  var16 = 0;
                  break L1;
                }
              }
              var18 = 255 & ((ql) this).field_i[var16 & 255];
              var14 = ua.field_h[var11];
              var17 = ((ql) this).field_i[var15 & 255] & 255;
              if (!((ql) this).field_n) {
                var10 = 0;
                L2: while (true) {
                  if (ms.field_d <= var10) {
                    break L0;
                  } else {
                    var4 = ((ql) this).field_q * ct.field_v[var10];
                    var6 = this.a(false, var4 * var8 >> 1252220428, var17, var18, var11, var14, var12);
                    param1[var10] = var6 * var9 >> -956554868;
                    var10++;
                    continue L2;
                  }
                }
              } else {
                var10 = 0;
                L3: while (true) {
                  if (var10 >= ms.field_d) {
                    break L0;
                  } else {
                    var4 = ((ql) this).field_q * ct.field_v[var10];
                    var6 = this.a(false, var4 * var8 >> -1549663828, var17, var18, var11, var14, var12);
                    var6 = var6 * var9 >> -1530447252;
                    param1[var10] = 2048 + (var6 >> -350934335);
                    var10++;
                    continue L3;
                  }
                }
              }
            } else {
              L4: {
                L5: {
                  var9 = ((ql) this).field_k[0];
                  if (var9 > 8) {
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
                  var8 = ((ql) this).field_l[0] << -602973044;
                  var13 = ((ql) this).field_h * var8 >> 647077900;
                  var11 = var5 * var8 >> -997316404;
                  var12 = var8 * ((ql) this).field_q >> 1294694444;
                  var15 = var11 >> -1392880820;
                  var16 = 1 + var15;
                  var11 = var11 & 4095;
                  if (var16 < var13) {
                    break L6;
                  } else {
                    var16 = 0;
                    break L6;
                  }
                }
                var17 = ((ql) this).field_i[var15 & 255] & 255;
                var18 = 255 & ((ql) this).field_i[255 & var16];
                var14 = ua.field_h[var11];
                var10 = 0;
                L7: while (true) {
                  if (var10 >= ms.field_d) {
                    break L4;
                  } else {
                    var4 = ((ql) this).field_q * ct.field_v[var10];
                    var6 = this.a(false, var4 * var8 >> 1724090284, var17, var18, var11, var14, var12);
                    param1[var10] = var6 * var9 >> -1739619188;
                    var10++;
                    continue L7;
                  }
                }
              }
              var7 = 1;
              L8: while (true) {
                if (((ql) this).field_s <= var7) {
                  break L0;
                } else {
                  L9: {
                    var9 = ((ql) this).field_k[var7];
                    if (8 < var9) {
                      break L9;
                    } else {
                      if (7 < (var9 ^ -1)) {
                        break L9;
                      } else {
                        var7++;
                        continue L8;
                      }
                    }
                  }
                  L10: {
                    var8 = ((ql) this).field_l[var7] << -1472753460;
                    var11 = var5 * var8 >> -1843211060;
                    var12 = ((ql) this).field_q * var8 >> 1371548172;
                    var13 = var8 * ((ql) this).field_h >> 745380748;
                    var15 = var11 >> -1052743124;
                    var16 = var15 - -1;
                    if (var13 <= var16) {
                      var16 = 0;
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  L11: {
                    var11 = var11 & 4095;
                    var17 = ((ql) this).field_i[255 & var15] & 255;
                    var18 = ((ql) this).field_i[var16 & 255] & 255;
                    var14 = ua.field_h[var11];
                    if (!((ql) this).field_n) {
                      break L11;
                    } else {
                      if (var7 != -1 + ((ql) this).field_s) {
                        break L11;
                      } else {
                        var10 = 0;
                        L12: while (true) {
                          if (var10 < ms.field_d) {
                            L13: {
                              var4 = ct.field_v[var10] * ((ql) this).field_q;
                              stackOut_25_0 = this;
                              stackIn_27_0 = stackOut_25_0;
                              stackIn_26_0 = stackOut_25_0;
                              if (param0) {
                                stackOut_27_0 = this;
                                stackOut_27_1 = 0;
                                stackIn_28_0 = stackOut_27_0;
                                stackIn_28_1 = stackOut_27_1;
                                break L13;
                              } else {
                                stackOut_26_0 = this;
                                stackOut_26_1 = 1;
                                stackIn_28_0 = stackOut_26_0;
                                stackIn_28_1 = stackOut_26_1;
                                break L13;
                              }
                            }
                            var6 = this.a(stackIn_28_1 != 0, var8 * var4 >> 1695595052, var17, var18, var11, var14, var12);
                            var6 = param1[var10] - -(var6 * var9 >> -204557012);
                            param1[var10] = 2048 - -(var6 >> -402420607);
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
                  L14: while (true) {
                    if (ms.field_d > var10) {
                      L15: {
                        var4 = ((ql) this).field_q * ct.field_v[var10];
                        stackOut_32_0 = this;
                        stackIn_34_0 = stackOut_32_0;
                        stackIn_33_0 = stackOut_32_0;
                        if (param0) {
                          stackOut_34_0 = this;
                          stackOut_34_1 = 0;
                          stackIn_35_0 = stackOut_34_0;
                          stackIn_35_1 = stackOut_34_1;
                          break L15;
                        } else {
                          stackOut_33_0 = this;
                          stackOut_33_1 = 1;
                          stackIn_35_0 = stackOut_33_0;
                          stackIn_35_1 = stackOut_33_1;
                          break L15;
                        }
                      }
                      var6 = this.a(stackIn_35_1 != 0, var4 * var8 >> 729791116, var17, var18, var11, var14, var12);
                      param1[var10] = param1[var10] + (var9 * var6 >> 520514732);
                      var10++;
                      continue L14;
                    } else {
                      var7++;
                      continue L8;
                    }
                  }
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final void d(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = AceOfSkies.field_G ? 1 : 0;
        ((ql) this).field_i = ro.b(-3992, ((ql) this).field_m);
        this.a(98);
        if (param0 != 1) {
            ((ql) this).field_i = (byte[]) null;
        }
        for (var2 = ((ql) this).field_s + -1; -2 >= (var2 ^ -1); var2--) {
            var3 = ((ql) this).field_k[var2];
            // if_icmpgt L94
            if (var3 < -8) {
                break;
            }
            ((ql) this).field_s = ((ql) this).field_s - 1;
        }
    }

    final static void a(byte param0, boolean param1) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = AceOfSkies.field_G ? 1 : 0;
          if (param0 <= -72) {
            break L0;
          } else {
            field_p = (byte[][]) (byte[][]) null;
            break L0;
          }
        }
        L1: {
          if (0 >= qr.field_a) {
            if (!cn.b(true)) {
              var2 = 1;
              break L1;
            } else {
              var2 = 0;
              break L1;
            }
          } else {
            L2: {
              if (aj.field_s != null) {
                jf.field_a = aj.field_s.b((byte) -111);
                te.a(2, 64);
                break L2;
              } else {
                jf.field_a = uj.a(pt.field_b, 0, 640, 0, 0, 480);
                break L2;
              }
            }
            if (jf.field_a != null) {
              cd.a((java.awt.Canvas) (Object) jf.field_a, 74);
              var2 = 2;
              break L1;
            } else {
              var2 = 3;
              break L1;
            }
          }
        }
        L3: {
          if (null != aj.field_s) {
            break L3;
          } else {
            if (ta.field_h) {
              nk.a((byte) -119, var2, param1);
              break L3;
            } else {
              break L3;
            }
          }
        }
    }

    private final int a(boolean param0, int param1, int param2, int param3, int param4, int param5, int param6) {
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
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_40_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_34_0 = 0;
        L0: {
          var18 = AceOfSkies.field_G ? 1 : 0;
          if (!param0) {
            break L0;
          } else {
            ql.a(40, -122, 38, 74);
            break L0;
          }
        }
        L1: {
          var13 = param1 >> -1871141620;
          var12 = var13 - -1;
          if (var12 >= param6) {
            var12 = 0;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          param1 = param1 & 4095;
          var13 = var13 & 255;
          var11 = param1 - 4096;
          var12 = var12 & 255;
          var10 = -4096 + param4;
          var15 = ua.field_h[param1];
          var14 = ((ql) this).field_i[var13 - -param2] & 3;
          if (-2 <= (var14 ^ -1)) {
            L3: {
              if (var14 != 0) {
                stackOut_12_0 = param4 + -param1;
                stackIn_13_0 = stackOut_12_0;
                break L3;
              } else {
                stackOut_11_0 = param4 + param1;
                stackIn_13_0 = stackOut_11_0;
                break L3;
              }
            }
            var8 = stackIn_13_0;
            break L2;
          } else {
            L4: {
              if (var14 == 2) {
                stackOut_8_0 = param1 - param4;
                stackIn_9_0 = stackOut_8_0;
                break L4;
              } else {
                stackOut_7_0 = -param1 - param4;
                stackIn_9_0 = stackOut_7_0;
                break L4;
              }
            }
            var8 = stackIn_9_0;
            break L2;
          }
        }
        L5: {
          var14 = 3 & ((ql) this).field_i[var12 + param2];
          if (-2 > var14) {
            L6: {
              if (-3 != (var14 ^ -1)) {
                stackOut_21_0 = -param4 + -var11;
                stackIn_22_0 = stackOut_21_0;
                break L6;
              } else {
                stackOut_20_0 = -param4 + var11;
                stackIn_22_0 = stackOut_20_0;
                break L6;
              }
            }
            var9 = stackIn_22_0;
            break L5;
          } else {
            L7: {
              if (-1 == var14) {
                stackOut_17_0 = var11 - -param4;
                stackIn_18_0 = stackOut_17_0;
                break L7;
              } else {
                stackOut_16_0 = param4 - var11;
                stackIn_18_0 = stackOut_16_0;
                break L7;
              }
            }
            var9 = stackIn_18_0;
            break L5;
          }
        }
        L8: {
          var16 = var8 + (var15 * (-var8 + var9) >> 467958540);
          var14 = ((ql) this).field_i[param3 + var13] & 3;
          if (1 >= var14) {
            L9: {
              if (-1 != var14) {
                stackOut_30_0 = var10 + -param1;
                stackIn_31_0 = stackOut_30_0;
                break L9;
              } else {
                stackOut_29_0 = var10 + param1;
                stackIn_31_0 = stackOut_29_0;
                break L9;
              }
            }
            var8 = stackIn_31_0;
            break L8;
          } else {
            L10: {
              if (-3 != var14) {
                stackOut_26_0 = -var10 + -param1;
                stackIn_27_0 = stackOut_26_0;
                break L10;
              } else {
                stackOut_25_0 = param1 + -var10;
                stackIn_27_0 = stackOut_25_0;
                break L10;
              }
            }
            var8 = stackIn_27_0;
            break L8;
          }
        }
        L11: {
          var14 = ((ql) this).field_i[param3 + var12] & 3;
          if (var14 > 1) {
            L12: {
              if (2 != var14) {
                stackOut_39_0 = -var11 - var10;
                stackIn_40_0 = stackOut_39_0;
                break L12;
              } else {
                stackOut_38_0 = -var10 + var11;
                stackIn_40_0 = stackOut_38_0;
                break L12;
              }
            }
            var9 = stackIn_40_0;
            break L11;
          } else {
            L13: {
              if (var14 == 0) {
                stackOut_35_0 = var10 + var11;
                stackIn_36_0 = stackOut_35_0;
                break L13;
              } else {
                stackOut_34_0 = -var11 + var10;
                stackIn_36_0 = stackOut_34_0;
                break L13;
              }
            }
            var9 = stackIn_36_0;
            break L11;
          }
        }
        var17 = ((-var8 + var9) * var15 >> 1968260332) + var8;
        return var16 + (param5 * (var17 + -var16) >> 2028499116);
    }

    final static void a(int param0, int param1, int param2, int param3) {
        so.field_b = param2;
        if (param1 != 2048) {
            return;
        }
        nl.field_t = param0;
        hn.field_a = param3;
    }

    ql() {
        super(0, true);
        ((ql) this).field_m = 0;
        ((ql) this).field_s = 4;
        ((ql) this).field_q = 4;
        ((ql) this).field_j = 1638;
        ((ql) this).field_h = 4;
        ((ql) this).field_i = new byte[512];
        ((ql) this).field_n = true;
    }

    private final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = AceOfSkies.field_G ? 1 : 0;
          if (param0 >= 23) {
            break L0;
          } else {
            ql.a((byte) 58);
            break L0;
          }
        }
        L1: {
          if (-1 > (((ql) this).field_j ^ -1)) {
            ((ql) this).field_l = new short[((ql) this).field_s];
            ((ql) this).field_k = new short[((ql) this).field_s];
            var2 = 0;
            L2: while (true) {
              if (var2 >= ((ql) this).field_s) {
                break L1;
              } else {
                ((ql) this).field_k[var2] = (short)(int)(4096.0 * Math.pow((double)((float)((ql) this).field_j / 4096.0f), (double)var2));
                ((ql) this).field_l[var2] = (short)(int)Math.pow(2.0, (double)var2);
                var2++;
                continue L2;
              }
            }
          } else {
            if (((ql) this).field_k == null) {
              break L1;
            } else {
              if (((ql) this).field_s != ((ql) this).field_k.length) {
                break L1;
              } else {
                ((ql) this).field_l = new short[((ql) this).field_s];
                var2 = 0;
                L3: while (true) {
                  if (((ql) this).field_s <= var2) {
                    break L1;
                  } else {
                    ((ql) this).field_l[var2] = (short)(int)Math.pow(2.0, (double)var2);
                    var2++;
                    continue L3;
                  }
                }
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new int[8192];
        field_r = null;
    }
}
