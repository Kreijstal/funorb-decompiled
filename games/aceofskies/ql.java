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
        RuntimeException var4 = null;
        int var4_int = 0;
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
        Object stackIn_25_0 = null;
        Object stackIn_26_0 = null;
        Object stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        Object stackIn_31_0 = null;
        Object stackIn_32_0 = null;
        Object stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_48_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_24_0 = null;
        Object stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        Object stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        Object stackOut_30_0 = null;
        Object stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        Object stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        var19 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            if (param0) {
              L1: {
                var5 = mo.field_c[param2] * this.field_h;
                if (-2 == (this.field_s ^ -1)) {
                  L2: {
                    var9 = this.field_k[0];
                    var8 = this.field_l[0] << 1989972972;
                    var11 = var5 * var8 >> 938898956;
                    var13 = var8 * this.field_h >> 495279468;
                    var12 = var8 * this.field_q >> 2117427628;
                    var15 = var11 >> -1456252372;
                    var16 = var15 + 1;
                    var11 = var11 & 4095;
                    if (var13 > var16) {
                      break L2;
                    } else {
                      var16 = 0;
                      break L2;
                    }
                  }
                  var18 = 255 & this.field_i[var16 & 255];
                  var14 = ua.field_h[var11];
                  var17 = this.field_i[var15 & 255] & 255;
                  if (!this.field_n) {
                    var10 = 0;
                    L3: while (true) {
                      if (ms.field_d <= var10) {
                        break L1;
                      } else {
                        var4_int = this.field_q * ct.field_v[var10];
                        var6 = this.a(false, var4_int * var8 >> 1252220428, var17, var18, var11, var14, var12);
                        param1[var10] = var6 * var9 >> -956554868;
                        var10++;
                        continue L3;
                      }
                    }
                  } else {
                    var10 = 0;
                    L4: while (true) {
                      if (var10 >= ms.field_d) {
                        break L1;
                      } else {
                        var4_int = this.field_q * ct.field_v[var10];
                        var6 = this.a(false, var4_int * var8 >> -1549663828, var17, var18, var11, var14, var12);
                        var6 = var6 * var9 >> -1530447252;
                        param1[var10] = 2048 + (var6 >> -350934335);
                        var10++;
                        continue L4;
                      }
                    }
                  }
                } else {
                  L5: {
                    L6: {
                      var9 = this.field_k[0];
                      if (var9 > 8) {
                        break L6;
                      } else {
                        if (7 < (var9 ^ -1)) {
                          break L6;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L7: {
                      var8 = this.field_l[0] << -602973044;
                      var13 = this.field_h * var8 >> 647077900;
                      var11 = var5 * var8 >> -997316404;
                      var12 = var8 * this.field_q >> 1294694444;
                      var15 = var11 >> -1392880820;
                      var16 = 1 + var15;
                      var11 = var11 & 4095;
                      if (var16 < var13) {
                        break L7;
                      } else {
                        var16 = 0;
                        break L7;
                      }
                    }
                    var17 = this.field_i[var15 & 255] & 255;
                    var18 = 255 & this.field_i[255 & var16];
                    var14 = ua.field_h[var11];
                    var10 = 0;
                    L8: while (true) {
                      if (var10 >= ms.field_d) {
                        break L5;
                      } else {
                        var4_int = this.field_q * ct.field_v[var10];
                        var6 = this.a(false, var4_int * var8 >> 1724090284, var17, var18, var11, var14, var12);
                        param1[var10] = var6 * var9 >> -1739619188;
                        var10++;
                        continue L8;
                      }
                    }
                  }
                  var7 = 1;
                  L9: while (true) {
                    if (this.field_s <= var7) {
                      break L1;
                    } else {
                      L10: {
                        L11: {
                          var9 = this.field_k[var7];
                          if (8 < var9) {
                            break L11;
                          } else {
                            if (7 >= (var9 ^ -1)) {
                              break L10;
                            } else {
                              break L11;
                            }
                          }
                        }
                        L12: {
                          var8 = this.field_l[var7] << -1472753460;
                          var11 = var5 * var8 >> -1843211060;
                          var12 = this.field_q * var8 >> 1371548172;
                          var13 = var8 * this.field_h >> 745380748;
                          var15 = var11 >> -1052743124;
                          var16 = var15 - -1;
                          if (var13 <= var16) {
                            var16 = 0;
                            break L12;
                          } else {
                            break L12;
                          }
                        }
                        L13: {
                          var11 = var11 & 4095;
                          var17 = this.field_i[255 & var15] & 255;
                          var18 = this.field_i[var16 & 255] & 255;
                          var14 = ua.field_h[var11];
                          if (!this.field_n) {
                            break L13;
                          } else {
                            if (var7 != -1 + this.field_s) {
                              break L13;
                            } else {
                              var10 = 0;
                              L14: while (true) {
                                if (var10 >= ms.field_d) {
                                  break L10;
                                } else {
                                  L15: {
                                    var4_int = ct.field_v[var10] * this.field_q;
                                    stackOut_24_0 = this;
                                    stackIn_26_0 = stackOut_24_0;
                                    stackIn_25_0 = stackOut_24_0;
                                    if (param0) {
                                      stackOut_26_0 = this;
                                      stackOut_26_1 = 0;
                                      stackIn_27_0 = stackOut_26_0;
                                      stackIn_27_1 = stackOut_26_1;
                                      break L15;
                                    } else {
                                      stackOut_25_0 = this;
                                      stackOut_25_1 = 1;
                                      stackIn_27_0 = stackOut_25_0;
                                      stackIn_27_1 = stackOut_25_1;
                                      break L15;
                                    }
                                  }
                                  var6 = this.a(stackIn_27_1 != 0, var8 * var4_int >> 1695595052, var17, var18, var11, var14, var12);
                                  var6 = param1[var10] - -(var6 * var9 >> -204557012);
                                  param1[var10] = 2048 - -(var6 >> -402420607);
                                  var10++;
                                  continue L14;
                                }
                              }
                            }
                          }
                        }
                        var10 = 0;
                        L16: while (true) {
                          if (ms.field_d <= var10) {
                            break L10;
                          } else {
                            L17: {
                              var4_int = this.field_q * ct.field_v[var10];
                              stackOut_30_0 = this;
                              stackIn_32_0 = stackOut_30_0;
                              stackIn_31_0 = stackOut_30_0;
                              if (param0) {
                                stackOut_32_0 = this;
                                stackOut_32_1 = 0;
                                stackIn_33_0 = stackOut_32_0;
                                stackIn_33_1 = stackOut_32_1;
                                break L17;
                              } else {
                                stackOut_31_0 = this;
                                stackOut_31_1 = 1;
                                stackIn_33_0 = stackOut_31_0;
                                stackIn_33_1 = stackOut_31_1;
                                break L17;
                              }
                            }
                            var6 = this.a(stackIn_33_1 != 0, var4_int * var8 >> 729791116, var17, var18, var11, var14, var12);
                            param1[var10] = param1[var10] + (var9 * var6 >> 520514732);
                            var10++;
                            continue L16;
                          }
                        }
                      }
                      var7++;
                      continue L9;
                    }
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var4 = decompiledCaughtException;
            stackOut_45_0 = (RuntimeException) (var4);
            stackOut_45_1 = new StringBuilder().append("ql.E(").append(param0).append(',');
            stackIn_47_0 = stackOut_45_0;
            stackIn_47_1 = stackOut_45_1;
            stackIn_46_0 = stackOut_45_0;
            stackIn_46_1 = stackOut_45_1;
            if (param1 == null) {
              stackOut_47_0 = (RuntimeException) ((Object) stackIn_47_0);
              stackOut_47_1 = (StringBuilder) ((Object) stackIn_47_1);
              stackOut_47_2 = "null";
              stackIn_48_0 = stackOut_47_0;
              stackIn_48_1 = stackOut_47_1;
              stackIn_48_2 = stackOut_47_2;
              break L18;
            } else {
              stackOut_46_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackOut_46_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackOut_46_2 = "{...}";
              stackIn_48_0 = stackOut_46_0;
              stackIn_48_1 = stackOut_46_1;
              stackIn_48_2 = stackOut_46_2;
              break L18;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_48_0), stackIn_48_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void d(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = AceOfSkies.field_G ? 1 : 0;
          this.field_i = ro.b(-3992, this.field_m);
          this.a(98);
          if (param0 == 1) {
            break L0;
          } else {
            this.field_i = (byte[]) null;
            break L0;
          }
        }
        var2 = this.field_s + -1;
        L1: while (true) {
          L2: {
            if (-2 < (var2 ^ -1)) {
              break L2;
            } else {
              var3 = this.field_k[var2];
              if (var3 > 8) {
                break L2;
              } else {
                if (var3 >= -8) {
                  this.field_s = this.field_s - 1;
                  var2--;
                  continue L1;
                } else {
                  break L2;
                }
              }
            }
          }
          return;
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
            field_p = (byte[][]) null;
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
              cd.a(jf.field_a, 74);
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
          var14 = this.field_i[var13 - -param2] & 3;
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
          var14 = 3 & this.field_i[var12 + param2];
          if (-2 > (var14 ^ -1)) {
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
              if (-1 == (var14 ^ -1)) {
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
          var14 = this.field_i[param3 + var13] & 3;
          if (1 >= var14) {
            L9: {
              if (-1 != (var14 ^ -1)) {
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
              if (-3 != (var14 ^ -1)) {
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
          var14 = this.field_i[param3 + var12] & 3;
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
        this.field_m = 0;
        this.field_s = 4;
        this.field_q = 4;
        this.field_j = 1638;
        this.field_h = 4;
        this.field_i = new byte[512];
        this.field_n = true;
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
          if (-1 > (this.field_j ^ -1)) {
            this.field_l = new short[this.field_s];
            this.field_k = new short[this.field_s];
            var2 = 0;
            L2: while (true) {
              if (var2 >= this.field_s) {
                break L1;
              } else {
                this.field_k[var2] = (short)(int)(4096.0 * Math.pow((double)((float)this.field_j / 4096.0f), (double)var2));
                this.field_l[var2] = (short)(int)Math.pow(2.0, (double)var2);
                var2++;
                continue L2;
              }
            }
          } else {
            if (this.field_k == null) {
              break L1;
            } else {
              if (this.field_s != this.field_k.length) {
                break L1;
              } else {
                this.field_l = new short[this.field_s];
                var2 = 0;
                L3: while (true) {
                  if (this.field_s <= var2) {
                    break L1;
                  } else {
                    this.field_l[var2] = (short)(int)Math.pow(2.0, (double)var2);
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
        field_o = new int[8192];
        field_r = null;
    }
}
