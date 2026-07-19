/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mo extends tt {
    boolean field_m;
    int field_r;
    private short[] field_u;
    static hv field_w;
    private byte[] field_x;
    private int field_v;
    int field_s;
    static String[] field_o;
    int field_p;
    int field_q;
    static int[] field_t;
    private short[] field_y;
    static float[] field_n;

    final void a(int param0, int param1, int[] param2) {
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
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        var19 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var5 = this.field_q * uv.field_o[param1];
            if (param0 == -28696) {
              L1: {
                L2: {
                  L3: {
                    if (1 == this.field_s) {
                      break L3;
                    } else {
                      L4: {
                        L5: {
                          var9 = this.field_u[0];
                          if (8 < var9) {
                            break L5;
                          } else {
                            if (-8 > var9) {
                              break L5;
                            } else {
                              break L4;
                            }
                          }
                        }
                        L6: {
                          var8 = this.field_y[0] << -1866152852;
                          var12 = var8 * this.field_r >> -1945068020;
                          var13 = this.field_q * var8 >> 1744224332;
                          var11 = var5 * var8 >> 1888261644;
                          var15 = var11 >> 1206933964;
                          var16 = var15 - -1;
                          if (var13 > var16) {
                            break L6;
                          } else {
                            var16 = 0;
                            break L6;
                          }
                        }
                        var11 = var11 & 4095;
                        var18 = 255 & this.field_x[255 & var16];
                        var17 = 255 & this.field_x[255 & var15];
                        var14 = mu.field_y[var11];
                        var10 = 0;
                        L7: while (true) {
                          if (ws.field_b <= var10) {
                            break L4;
                          } else {
                            var4_int = gs.field_b[var10] * this.field_r;
                            var6 = this.a(var18, var14, param0 + 28699, var12, var11, var8 * var4_int >> 132977964, var17);
                            param2[var10] = var9 * var6 >> -1441008468;
                            var10++;
                            if (var19 != 0) {
                              break L2;
                            } else {
                              if (var19 == 0) {
                                continue L7;
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                      }
                      var7 = 1;
                      L8: while (true) {
                        if (var7 >= this.field_s) {
                          break L2;
                        } else {
                          var9 = this.field_u[var7];
                          if (var19 != 0) {
                            break L1;
                          } else {
                            L9: {
                              L10: {
                                L11: {
                                  if (-9 > (var9 ^ -1)) {
                                    break L11;
                                  } else {
                                    if (7 < (var9 ^ -1)) {
                                      break L11;
                                    } else {
                                      break L10;
                                    }
                                  }
                                }
                                L12: {
                                  var8 = this.field_y[var7] << 762384140;
                                  var12 = this.field_r * var8 >> -517827860;
                                  var13 = var8 * this.field_q >> -1999007476;
                                  var11 = var5 * var8 >> -1916821332;
                                  var15 = var11 >> -623826260;
                                  var16 = 1 + var15;
                                  if ((var16 ^ -1) <= (var13 ^ -1)) {
                                    var16 = 0;
                                    break L12;
                                  } else {
                                    break L12;
                                  }
                                }
                                L13: {
                                  L14: {
                                    var11 = var11 & 4095;
                                    var17 = 255 & this.field_x[var15 & 255];
                                    var14 = mu.field_y[var11];
                                    var18 = 255 & this.field_x[255 & var16];
                                    if (!this.field_m) {
                                      break L14;
                                    } else {
                                      if (this.field_s - 1 == var7) {
                                        break L13;
                                      } else {
                                        break L14;
                                      }
                                    }
                                  }
                                  var10 = 0;
                                  L15: while (true) {
                                    if (var10 >= ws.field_b) {
                                      break L10;
                                    } else {
                                      var4_int = this.field_r * gs.field_b[var10];
                                      var6 = this.a(var18, var14, 3, var12, var11, var8 * var4_int >> 1823988716, var17);
                                      param2[var10] = param2[var10] + (var9 * var6 >> -1133736628);
                                      var10++;
                                      if (var19 != 0) {
                                        break L9;
                                      } else {
                                        if (var19 == 0) {
                                          continue L15;
                                        } else {
                                          break L13;
                                        }
                                      }
                                    }
                                  }
                                }
                                var10 = 0;
                                L16: while (true) {
                                  if ((ws.field_b ^ -1) >= (var10 ^ -1)) {
                                    break L10;
                                  } else {
                                    var4_int = gs.field_b[var10] * this.field_r;
                                    var6 = this.a(var18, var14, 3, var12, var11, var4_int * var8 >> 2097570764, var17);
                                    var6 = param2[var10] - -(var9 * var6 >> 1879223340);
                                    param2[var10] = 2048 + (var6 >> -1628903231);
                                    var10++;
                                    if (var19 != 0) {
                                      break L9;
                                    } else {
                                      if (var19 == 0) {
                                        continue L16;
                                      } else {
                                        break L10;
                                      }
                                    }
                                  }
                                }
                              }
                              var7++;
                              break L9;
                            }
                            if (var19 == 0) {
                              continue L8;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                    }
                  }
                  L17: {
                    var9 = this.field_u[0];
                    var8 = this.field_y[0] << -535821108;
                    var13 = var8 * this.field_q >> -1931918548;
                    var11 = var5 * var8 >> 1855295884;
                    var12 = var8 * this.field_r >> 1909617708;
                    var15 = var11 >> -1954321780;
                    var16 = 1 + var15;
                    if (var16 < var13) {
                      break L17;
                    } else {
                      var16 = 0;
                      break L17;
                    }
                  }
                  L18: {
                    var11 = var11 & 4095;
                    var17 = this.field_x[255 & var15] & 255;
                    var18 = this.field_x[var16 & 255] & 255;
                    var14 = mu.field_y[var11];
                    if (this.field_m) {
                      break L18;
                    } else {
                      var10 = 0;
                      L19: while (true) {
                        if (ws.field_b <= var10) {
                          break L2;
                        } else {
                          var4_int = gs.field_b[var10] * this.field_r;
                          var6 = this.a(var18, var14, 3, var12, var11, var4_int * var8 >> 753545836, var17);
                          param2[var10] = var6 * var9 >> 1909070316;
                          var10++;
                          if (var19 != 0) {
                            break L1;
                          } else {
                            if (var19 == 0) {
                              continue L19;
                            } else {
                              break L18;
                            }
                          }
                        }
                      }
                    }
                  }
                  var10 = 0;
                  L20: while (true) {
                    if (var10 >= ws.field_b) {
                      break L2;
                    } else {
                      var4_int = this.field_r * gs.field_b[var10];
                      var6 = this.a(var18, var14, 3, var12, var11, var8 * var4_int >> -1023763156, var17);
                      var6 = var6 * var9 >> 568209964;
                      param2[var10] = (var6 >> 1198045857) + 2048;
                      var10++;
                      if (var19 != 0) {
                        break L1;
                      } else {
                        if (var19 == 0) {
                          continue L20;
                        } else {
                          break L1;
                        }
                      }
                    }
                  }
                }
                break L1;
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
          L21: {
            var4 = decompiledCaughtException;
            stackOut_52_0 = (RuntimeException) (var4);
            stackOut_52_1 = new StringBuilder().append("mo.A(").append(param0).append(',').append(param1).append(',');
            stackIn_54_0 = stackOut_52_0;
            stackIn_54_1 = stackOut_52_1;
            stackIn_53_0 = stackOut_52_0;
            stackIn_53_1 = stackOut_52_1;
            if (param2 == null) {
              stackOut_54_0 = (RuntimeException) ((Object) stackIn_54_0);
              stackOut_54_1 = (StringBuilder) ((Object) stackIn_54_1);
              stackOut_54_2 = "null";
              stackIn_55_0 = stackOut_54_0;
              stackIn_55_1 = stackOut_54_1;
              stackIn_55_2 = stackOut_54_2;
              break L21;
            } else {
              stackOut_53_0 = (RuntimeException) ((Object) stackIn_53_0);
              stackOut_53_1 = (StringBuilder) ((Object) stackIn_53_1);
              stackOut_53_2 = "{...}";
              stackIn_55_0 = stackOut_53_0;
              stackIn_55_1 = stackOut_53_1;
              stackIn_55_2 = stackOut_53_2;
              break L21;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_55_0), stackIn_55_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, int param1) {
        lr.a(nt.field_m[param1], (byte) 56);
        int var2 = 29 % ((param0 - -73) / 48);
    }

    final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        var4 = Sumoblitz.field_L ? 1 : 0;
        this.field_x = td.a(this.field_v, -50);
        this.d(param0 + 126);
        var2 = this.field_s + -1;
        L0: while (true) {
          L1: {
            L2: {
              if (-2 < (var2 ^ -1)) {
                break L2;
              } else {
                var3 = this.field_u[var2];
                stackOut_2_0 = var3 ^ -1;
                stackOut_2_1 = -9;
                stackIn_10_0 = stackOut_2_0;
                stackIn_10_1 = stackOut_2_1;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                if (var4 != 0) {
                  break L1;
                } else {
                  if (stackIn_3_0 < stackIn_3_1) {
                    break L2;
                  } else {
                    L3: {
                      if (var3 >= -8) {
                        break L3;
                      } else {
                        if (var4 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    this.field_s = this.field_s - 1;
                    var2--;
                    if (var4 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
            stackOut_9_0 = param0;
            stackOut_9_1 = -8;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            break L1;
          }
          L4: {
            if (stackIn_10_0 == stackIn_10_1) {
              break L4;
            } else {
              this.a(14, 34, (int[]) null);
              break L4;
            }
          }
          return;
        }
    }

    mo() {
        super(0, true);
        this.field_x = new byte[512];
        this.field_r = 4;
        this.field_p = 1638;
        this.field_v = 0;
        this.field_m = true;
        this.field_q = 4;
        this.field_s = 4;
    }

    final static boolean a(int param0, int param1, int param2) {
        if (param2 != 30643) {
            return false;
        }
        return bj.a(param1, (byte) -113, param0) & (((8192 & param1 ^ -1) != -1 ? true : false) | lg.a(param1, param2 ^ -30697, param0) | mb.a(true, param0, param1));
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
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_35_0 = 0;
        L0: {
          var18 = Sumoblitz.field_L ? 1 : 0;
          var13 = param5 >> 641172492;
          var12 = var13 + 1;
          param5 = param5 & 4095;
          var13 = var13 & 255;
          if (param3 > var12) {
            break L0;
          } else {
            var12 = 0;
            break L0;
          }
        }
        L1: {
          L2: {
            var12 = var12 & 255;
            var10 = -4096 + param4;
            var11 = -4096 + param5;
            var15 = mu.field_y[param5];
            var14 = 3 & this.field_x[param6 + var13];
            if ((var14 ^ -1) < -2) {
              break L2;
            } else {
              L3: {
                if (-1 == (var14 ^ -1)) {
                  stackOut_5_0 = param4 + param5;
                  stackIn_6_0 = stackOut_5_0;
                  break L3;
                } else {
                  stackOut_4_0 = -param5 + param4;
                  stackIn_6_0 = stackOut_4_0;
                  break L3;
                }
              }
              var8 = stackIn_6_0;
              if (var18 == 0) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          L4: {
            if ((var14 ^ -1) == -3) {
              stackOut_9_0 = param5 - param4;
              stackIn_10_0 = stackOut_9_0;
              break L4;
            } else {
              stackOut_8_0 = -param5 + -param4;
              stackIn_10_0 = stackOut_8_0;
              break L4;
            }
          }
          var8 = stackIn_10_0;
          break L1;
        }
        L5: {
          L6: {
            var14 = this.field_x[param6 + var12] & 3;
            if (var14 <= 1) {
              break L6;
            } else {
              L7: {
                if (2 != var14) {
                  stackOut_14_0 = -var11 - param4;
                  stackIn_15_0 = stackOut_14_0;
                  break L7;
                } else {
                  stackOut_13_0 = -param4 + var11;
                  stackIn_15_0 = stackOut_13_0;
                  break L7;
                }
              }
              var9 = stackIn_15_0;
              if (var18 == 0) {
                break L5;
              } else {
                break L6;
              }
            }
          }
          L8: {
            if (var14 == 0) {
              stackOut_18_0 = param4 + var11;
              stackIn_19_0 = stackOut_18_0;
              break L8;
            } else {
              stackOut_17_0 = param4 - var11;
              stackIn_19_0 = stackOut_17_0;
              break L8;
            }
          }
          var9 = stackIn_19_0;
          break L5;
        }
        L9: {
          L10: {
            var16 = var8 + ((-var8 + var9) * var15 >> -851995892);
            var14 = param2 & this.field_x[var13 + param0];
            if (var14 > 1) {
              break L10;
            } else {
              L11: {
                if ((var14 ^ -1) != -1) {
                  stackOut_23_0 = var10 - param5;
                  stackIn_24_0 = stackOut_23_0;
                  break L11;
                } else {
                  stackOut_22_0 = var10 + param5;
                  stackIn_24_0 = stackOut_22_0;
                  break L11;
                }
              }
              var8 = stackIn_24_0;
              if (var18 == 0) {
                break L9;
              } else {
                break L10;
              }
            }
          }
          L12: {
            if (var14 != 2) {
              stackOut_27_0 = -param5 - var10;
              stackIn_28_0 = stackOut_27_0;
              break L12;
            } else {
              stackOut_26_0 = -var10 + param5;
              stackIn_28_0 = stackOut_26_0;
              break L12;
            }
          }
          var8 = stackIn_28_0;
          break L9;
        }
        L13: {
          L14: {
            var14 = this.field_x[param0 + var12] & 3;
            if (-2 <= (var14 ^ -1)) {
              break L14;
            } else {
              L15: {
                if ((var14 ^ -1) == -3) {
                  stackOut_32_0 = var11 - var10;
                  stackIn_33_0 = stackOut_32_0;
                  break L15;
                } else {
                  stackOut_31_0 = -var11 + -var10;
                  stackIn_33_0 = stackOut_31_0;
                  break L15;
                }
              }
              var9 = stackIn_33_0;
              if (var18 == 0) {
                break L13;
              } else {
                break L14;
              }
            }
          }
          L16: {
            if (0 != var14) {
              stackOut_36_0 = -var11 + var10;
              stackIn_37_0 = stackOut_36_0;
              break L16;
            } else {
              stackOut_35_0 = var10 + var11;
              stackIn_37_0 = stackOut_35_0;
              break L16;
            }
          }
          var9 = stackIn_37_0;
          break L13;
        }
        var17 = var8 - -((var9 + -var8) * var15 >> -689057044);
        return (param1 * (-var16 + var17) >> 2099378828) + var16;
    }

    public static void e(int param0) {
        field_w = null;
        field_t = null;
        field_n = null;
        if (param0 != 2) {
            field_o = (String[]) null;
        }
        field_o = null;
    }

    private final void d(int param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          L1: {
            var3 = Sumoblitz.field_L ? 1 : 0;
            if (this.field_p <= 0) {
              if (this.field_u == null) {
                break L1;
              } else {
                if (this.field_u.length != this.field_s) {
                  break L1;
                } else {
                  this.field_y = new short[this.field_s];
                  var2 = 0;
                  L2: while (true) {
                    if (this.field_s <= var2) {
                      break L1;
                    } else {
                      this.field_y[var2] = (short)(int)Math.pow(2.0, (double)var2);
                      var2++;
                      if (var3 != 0) {
                        break L0;
                      } else {
                        if (var3 == 0) {
                          continue L2;
                        } else {
                          break L1;
                        }
                      }
                    }
                  }
                }
              }
            } else {
              this.field_y = new short[this.field_s];
              this.field_u = new short[this.field_s];
              var2 = 0;
              L3: while (true) {
                L4: {
                  if (var2 >= this.field_s) {
                    break L4;
                  } else {
                    this.field_u[var2] = (short)(int)(Math.pow((double)((float)this.field_p / 4096.0f), (double)var2) * 4096.0);
                    this.field_y[var2] = (short)(int)Math.pow(2.0, (double)var2);
                    var2++;
                    if (var3 != 0) {
                      break L1;
                    } else {
                      if (var3 == 0) {
                        continue L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                if (var3 == 0) {
                  break L1;
                } else {
                  if (this.field_u == null) {
                    break L1;
                  } else {
                    if (this.field_u.length != this.field_s) {
                      break L1;
                    } else {
                      this.field_y = new short[this.field_s];
                      var2 = 0;
                      L5: while (true) {
                        if (this.field_s <= var2) {
                          break L1;
                        } else {
                          this.field_y[var2] = (short)(int)Math.pow(2.0, (double)var2);
                          var2++;
                          if (var3 != 0) {
                            break L0;
                          } else {
                            if (var3 == 0) {
                              continue L5;
                            } else {
                              break L1;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          if (param0 > 81) {
            break L0;
          } else {
            mo.a(57, -58);
            break L0;
          }
        }
    }

    static {
        field_o = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
        field_w = new hv();
        field_t = new int[4];
        field_n = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }
}
