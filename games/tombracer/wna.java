/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wna extends ci {
    static hua field_n;
    private int[][] field_o;
    private int[] field_m;

    private final void d(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int[] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int[] var15 = null;
        int[] var18 = null;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        L0: {
          L1: {
            var14 = TombRacer.field_G ? 1 : 0;
            var3 = -88 % ((param0 - 19) / 43);
            var6 = this.field_o.length;
            if (-1 <= (var6 ^ -1)) {
              break L1;
            } else {
              var7 = 0;
              L2: while (true) {
                if (-258 >= (var7 ^ -1)) {
                  break L1;
                } else {
                  var8 = 0;
                  var9 = var7 << -1238019644;
                  if (var14 != 0) {
                    break L0;
                  } else {
                    var10 = 0;
                    L3: while (true) {
                      L4: {
                        L5: {
                          if (var6 <= var10) {
                            break L5;
                          } else {
                            stackOut_6_0 = this.field_o[var10][0] ^ -1;
                            stackOut_6_1 = var9 ^ -1;
                            stackIn_11_0 = stackOut_6_0;
                            stackIn_11_1 = stackOut_6_1;
                            stackIn_7_0 = stackOut_6_0;
                            stackIn_7_1 = stackOut_6_1;
                            if (var14 != 0) {
                              break L4;
                            } else {
                              if (stackIn_7_0 < stackIn_7_1) {
                                break L5;
                              } else {
                                var8++;
                                var10++;
                                if (var14 == 0) {
                                  continue L3;
                                } else {
                                  break L5;
                                }
                              }
                            }
                          }
                        }
                        stackOut_10_0 = var6 ^ -1;
                        stackOut_10_1 = var8 ^ -1;
                        stackIn_11_0 = stackOut_10_0;
                        stackIn_11_1 = stackOut_10_1;
                        break L4;
                      }
                      L6: {
                        if (stackIn_11_0 < stackIn_11_1) {
                          L7: {
                            var18 = this.field_o[var8];
                            if ((var8 ^ -1) < -1) {
                              break L7;
                            } else {
                              var5 = var18[3];
                              var2 = var18[1];
                              var4 = var18[2];
                              if (var14 == 0) {
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                          var11 = this.field_o[var8 - 1];
                          var12 = (var9 - var11[0] << 667706348) / (-var11[0] + var18[0]);
                          var13 = -var12 + 4096;
                          var4 = var13 * var11[2] + var12 * var18[2] >> 1288862060;
                          var5 = var13 * var11[3] + var18[3] * var12 >> -1868638004;
                          var2 = var12 * var18[1] - -(var11[1] * var13) >> 241757036;
                          break L6;
                        } else {
                          var15 = this.field_o[var6 + -1];
                          var5 = var15[3];
                          var4 = var15[2];
                          var2 = var15[1];
                          break L6;
                        }
                      }
                      L8: {
                        L9: {
                          var5 = var5 >> 4;
                          var4 = var4 >> 4;
                          var2 = var2 >> 4;
                          if (0 > var4) {
                            break L9;
                          } else {
                            if (255 < var4) {
                              var4 = 255;
                              if (var14 == 0) {
                                break L8;
                              } else {
                                break L9;
                              }
                            } else {
                              break L8;
                            }
                          }
                        }
                        var4 = 0;
                        break L8;
                      }
                      L10: {
                        L11: {
                          if (0 <= var5) {
                            break L11;
                          } else {
                            var5 = 0;
                            if (var14 == 0) {
                              break L10;
                            } else {
                              break L11;
                            }
                          }
                        }
                        if ((var5 ^ -1) >= -256) {
                          break L10;
                        } else {
                          var5 = 255;
                          break L10;
                        }
                      }
                      L12: {
                        L13: {
                          if (0 > var2) {
                            break L13;
                          } else {
                            if ((var2 ^ -1) < -256) {
                              var2 = 255;
                              if (var14 == 0) {
                                break L12;
                              } else {
                                break L13;
                              }
                            } else {
                              break L12;
                            }
                          }
                        }
                        var2 = 0;
                        break L12;
                      }
                      this.field_m[var7] = fh.a(var5, fh.a(var2 << 1455681552, var4 << 1408930024));
                      var7++;
                      if (var14 == 0) {
                        continue L2;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
              }
            }
          }
          break L0;
        }
    }

    final void a(byte param0, uia param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  if (-1 == (param2 ^ -1)) {
                    L4: {
                      var4_int = param1.h(param0 + 148);
                      if (-1 == (var4_int ^ -1)) {
                        break L4;
                      } else {
                        this.d(var4_int, -6333);
                        if (var6 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    this.field_o = new int[param1.h(255)][4];
                    var5 = 0;
                    L5: while (true) {
                      if ((this.field_o.length ^ -1) >= (var5 ^ -1)) {
                        break L3;
                      } else {
                        this.field_o[var5][0] = param1.d(127);
                        this.field_o[var5][1] = param1.h(kha.b((int) param0, 148)) << -1198849244;
                        this.field_o[var5][2] = param1.h(255) << -1429945212;
                        this.field_o[var5][3] = param1.h(255) << 1662564836;
                        var5++;
                        if (var6 != 0) {
                          break L2;
                        } else {
                          if (var6 == 0) {
                            continue L5;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  } else {
                    break L3;
                  }
                }
                if (param0 == 107) {
                  break L2;
                } else {
                  wna.d((byte) 91);
                  break L1;
                }
              }
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var4);
            stackOut_14_1 = new StringBuilder().append("wna.A(").append(param0).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L6;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L6;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param2 + ')');
        }
    }

    public static void d(byte param0) {
        boolean discarded$0 = false;
        if (param0 != -109) {
            discarded$0 = wna.c(103);
        }
        field_n = null;
    }

    public wna() {
        super(1, false);
        this.field_m = new int[257];
    }

    private final void d(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = TombRacer.field_G ? 1 : 0;
          if (0 == param0) {
            break L0;
          } else {
            L1: {
              L2: {
                L3: {
                  L4: {
                    L5: {
                      L6: {
                        L7: {
                          var3 = param0;
                          if ((var3 ^ -1) != -2) {
                            break L7;
                          } else {
                            if (var4 == 0) {
                              this.field_o = new int[2][4];
                              this.field_o[0][3] = 0;
                              this.field_o[0][2] = 0;
                              this.field_o[0][0] = 0;
                              this.field_o[0][1] = 0;
                              this.field_o[1][1] = 4096;
                              this.field_o[1][3] = 4096;
                              this.field_o[1][0] = 4096;
                              this.field_o[1][2] = 4096;
                              if (var4 == 0) {
                                break L0;
                              } else {
                                break L6;
                              }
                            } else {
                              break L7;
                            }
                          }
                        }
                        if (-3 == (var3 ^ -1)) {
                          break L6;
                        } else {
                          if ((var3 ^ -1) == -4) {
                            break L5;
                          } else {
                            L8: {
                              if (4 != var3) {
                                break L8;
                              } else {
                                if (var4 == 0) {
                                  break L4;
                                } else {
                                  break L8;
                                }
                              }
                            }
                            if (var3 == 5) {
                              break L3;
                            } else {
                              if (var3 == 6) {
                                break L2;
                              } else {
                                break L1;
                              }
                            }
                          }
                        }
                      }
                      this.field_o = new int[8][4];
                      this.field_o[0][0] = 0;
                      this.field_o[0][2] = 2602;
                      this.field_o[0][1] = 2650;
                      this.field_o[0][3] = 2361;
                      this.field_o[1][1] = 2313;
                      this.field_o[1][3] = 1558;
                      this.field_o[1][2] = 1799;
                      this.field_o[1][0] = 2867;
                      this.field_o[2][0] = 3072;
                      this.field_o[2][2] = 1734;
                      this.field_o[2][3] = 1413;
                      this.field_o[2][1] = 2618;
                      this.field_o[3][2] = 1220;
                      this.field_o[3][0] = 3276;
                      this.field_o[3][3] = 947;
                      this.field_o[3][1] = 2296;
                      this.field_o[4][2] = 963;
                      this.field_o[4][0] = 3481;
                      this.field_o[4][1] = 2072;
                      this.field_o[4][3] = 722;
                      this.field_o[5][2] = 2152;
                      this.field_o[5][0] = 3686;
                      this.field_o[5][3] = 1766;
                      this.field_o[5][1] = 2730;
                      this.field_o[6][2] = 1060;
                      this.field_o[6][3] = 915;
                      this.field_o[6][1] = 2232;
                      this.field_o[6][0] = 3891;
                      this.field_o[7][2] = 1413;
                      this.field_o[7][0] = 4096;
                      this.field_o[7][3] = 1140;
                      this.field_o[7][1] = 1686;
                      if (var4 == 0) {
                        break L0;
                      } else {
                        break L5;
                      }
                    }
                    this.field_o = new int[7][4];
                    this.field_o[0][0] = 0;
                    this.field_o[0][1] = 0;
                    this.field_o[0][2] = 0;
                    this.field_o[0][3] = 4096;
                    this.field_o[1][2] = 4096;
                    this.field_o[1][0] = 663;
                    this.field_o[1][1] = 0;
                    this.field_o[1][3] = 4096;
                    this.field_o[2][1] = 0;
                    this.field_o[2][2] = 4096;
                    this.field_o[2][0] = 1363;
                    this.field_o[2][3] = 0;
                    this.field_o[3][1] = 4096;
                    this.field_o[3][0] = 2048;
                    this.field_o[3][2] = 4096;
                    this.field_o[3][3] = 0;
                    this.field_o[4][0] = 2727;
                    this.field_o[4][2] = 0;
                    this.field_o[4][1] = 4096;
                    this.field_o[4][3] = 0;
                    this.field_o[5][1] = 4096;
                    this.field_o[5][0] = 3411;
                    this.field_o[5][2] = 0;
                    this.field_o[5][3] = 4096;
                    this.field_o[6][3] = 4096;
                    this.field_o[6][1] = 0;
                    this.field_o[6][2] = 0;
                    this.field_o[6][0] = 4096;
                    if (var4 == 0) {
                      break L0;
                    } else {
                      break L4;
                    }
                  }
                  this.field_o = new int[6][4];
                  this.field_o[0][1] = 0;
                  this.field_o[0][0] = 0;
                  this.field_o[0][3] = 0;
                  this.field_o[0][2] = 0;
                  this.field_o[1][0] = 1843;
                  this.field_o[1][2] = 0;
                  this.field_o[1][1] = 0;
                  this.field_o[1][3] = 1493;
                  this.field_o[2][3] = 2939;
                  this.field_o[2][1] = 0;
                  this.field_o[2][2] = 0;
                  this.field_o[2][0] = 2457;
                  this.field_o[3][2] = 1124;
                  this.field_o[3][3] = 3565;
                  this.field_o[3][0] = 2781;
                  this.field_o[3][1] = 0;
                  this.field_o[4][2] = 3084;
                  this.field_o[4][0] = 3481;
                  this.field_o[4][3] = 4031;
                  this.field_o[4][1] = 546;
                  this.field_o[5][0] = 4096;
                  this.field_o[5][1] = 4096;
                  this.field_o[5][3] = 4096;
                  this.field_o[5][2] = 4096;
                  if (var4 == 0) {
                    break L0;
                  } else {
                    break L3;
                  }
                }
                this.field_o = new int[16][4];
                this.field_o[0][0] = 0;
                this.field_o[0][3] = 321;
                this.field_o[0][2] = 192;
                this.field_o[0][1] = 80;
                this.field_o[1][3] = 562;
                this.field_o[1][2] = 449;
                this.field_o[1][0] = 155;
                this.field_o[1][1] = 321;
                this.field_o[2][2] = 690;
                this.field_o[2][3] = 803;
                this.field_o[2][0] = 389;
                this.field_o[2][1] = 578;
                this.field_o[3][3] = 1140;
                this.field_o[3][0] = 671;
                this.field_o[3][2] = 995;
                this.field_o[3][1] = 947;
                this.field_o[4][3] = 1509;
                this.field_o[4][1] = 1285;
                this.field_o[4][0] = 897;
                this.field_o[4][2] = 1397;
                this.field_o[5][0] = 1175;
                this.field_o[5][1] = 1525;
                this.field_o[5][2] = 1429;
                this.field_o[5][3] = 1413;
                this.field_o[6][3] = 1333;
                this.field_o[6][2] = 1461;
                this.field_o[6][1] = 1734;
                this.field_o[6][0] = 1368;
                this.field_o[7][2] = 1525;
                this.field_o[7][1] = 1413;
                this.field_o[7][0] = 1507;
                this.field_o[7][3] = 1702;
                this.field_o[8][1] = 1108;
                this.field_o[8][2] = 1590;
                this.field_o[8][3] = 2056;
                this.field_o[8][0] = 1736;
                this.field_o[9][3] = 2666;
                this.field_o[9][2] = 2056;
                this.field_o[9][1] = 1766;
                this.field_o[9][0] = 2088;
                this.field_o[10][1] = 2409;
                this.field_o[10][3] = 3276;
                this.field_o[10][0] = 2355;
                this.field_o[10][2] = 2586;
                this.field_o[11][2] = 3148;
                this.field_o[11][3] = 3228;
                this.field_o[11][1] = 3116;
                this.field_o[11][0] = 2691;
                this.field_o[12][3] = 3196;
                this.field_o[12][0] = 3031;
                this.field_o[12][1] = 3806;
                this.field_o[12][2] = 3710;
                this.field_o[13][3] = 3019;
                this.field_o[13][2] = 3421;
                this.field_o[13][0] = 3522;
                this.field_o[13][1] = 3437;
                this.field_o[14][1] = 3116;
                this.field_o[14][2] = 3148;
                this.field_o[14][0] = 3727;
                this.field_o[14][3] = 3228;
                this.field_o[15][1] = 2377;
                this.field_o[15][3] = 2746;
                this.field_o[15][0] = 4096;
                this.field_o[15][2] = 2505;
                if (var4 == 0) {
                  break L0;
                } else {
                  break L2;
                }
              }
              this.field_o = new int[4][4];
              this.field_o[0][2] = 4096;
              this.field_o[0][0] = 2048;
              this.field_o[0][1] = 0;
              this.field_o[0][3] = 0;
              this.field_o[1][1] = 4096;
              this.field_o[1][2] = 4096;
              this.field_o[1][0] = 2867;
              this.field_o[1][3] = 0;
              this.field_o[2][2] = 4096;
              this.field_o[2][0] = 3276;
              this.field_o[2][1] = 4096;
              this.field_o[2][3] = 0;
              this.field_o[3][3] = 0;
              this.field_o[3][2] = 0;
              this.field_o[3][1] = 4096;
              this.field_o[3][0] = 4096;
              if (var4 == 0) {
                break L0;
              } else {
                break L1;
              }
            }
            throw new RuntimeException("Invalid gradient preset");
          }
        }
        L9: {
          if (param1 == -6333) {
            break L9;
          } else {
            field_n = (hua) null;
            break L9;
          }
        }
    }

    final static boolean c(int param0) {
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          if (param0 <= -111) {
            break L0;
          } else {
            wna.d((byte) -62);
            break L0;
          }
        }
        L1: {
          L2: {
            if ((cga.field_f ^ -1) > -21) {
              break L2;
            } else {
              if (!wua.c((byte) 49)) {
                break L2;
              } else {
                L3: {
                  if (-1 <= (lsa.field_a ^ -1)) {
                    break L3;
                  } else {
                    if (dg.b(-1)) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                stackOut_8_0 = 0;
                stackIn_9_0 = stackOut_8_0;
                break L1;
              }
            }
          }
          stackOut_7_0 = 1;
          stackIn_9_0 = stackOut_7_0;
          break L1;
        }
        return stackIn_9_0 != 0;
    }

    final int[][] b(int param0, int param1) {
        int[][] var3 = null;
        int var4 = 0;
        int[] var6 = null;
        int[] var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int[][] var11 = null;
        int[][] var12 = null;
        int[][] var14 = null;
        int[] var17 = null;
        L0: {
          var10 = TombRacer.field_G ? 1 : 0;
          var14 = this.field_h.a(param0, (byte) 108);
          var12 = var14;
          var11 = var12;
          var3 = var11;
          if (param1 == -1) {
            break L0;
          } else {
            this.field_o = (int[][]) null;
            break L0;
          }
        }
        L1: {
          if (!this.field_h.field_f) {
            break L1;
          } else {
            var17 = this.c(0, -15, param0);
            var6 = var14[0];
            var7 = var14[1];
            var8 = var14[2];
            var9 = 0;
            L2: while (true) {
              if ((ns.field_g ^ -1) >= (var9 ^ -1)) {
                break L1;
              } else {
                L3: {
                  var4 = var17[var9] >> 1160039684;
                  if ((var4 ^ -1) <= -1) {
                    break L3;
                  } else {
                    var4 = 0;
                    break L3;
                  }
                }
                L4: {
                  if (var4 > 256) {
                    var4 = 256;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                var4 = this.field_m[var4];
                var6[var9] = sea.c(var4, 16711680) >> -995958036;
                var7[var9] = sea.c(var4 >> 2066098180, 4080);
                var8[var9] = sea.c(var4, 255) << 1063116964;
                var9++;
                if (var10 == 0) {
                  continue L2;
                } else {
                  break L1;
                }
              }
            }
          }
        }
        return var11;
    }

    final void b(byte param0) {
        if (!(this.field_o != null)) {
            this.d(1, -6333);
        }
        if (param0 != 116) {
            this.d(-31);
        }
        this.d(112);
    }

    static {
        field_n = new hua();
    }
}
