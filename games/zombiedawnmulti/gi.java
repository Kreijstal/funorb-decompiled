/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gi extends br {
    private int field_f;
    static int field_l;
    byte[] field_o;
    static volatile int field_m;
    int field_j;
    static String field_g;
    static String field_n;
    static String field_h;
    int field_k;
    static dk field_i;
    static String field_p;

    public static void a(int param0) {
        ma discarded$0 = null;
        field_i = null;
        field_p = null;
        field_n = null;
        field_h = null;
        field_g = null;
        if (param0 != -1569388056) {
            String var2 = (String) null;
            discarded$0 = gi.a(49, (String) null);
        }
    }

    final static fc a(byte[] param0, int param1) {
        int discarded$13 = 0;
        int incrementValue$14 = 0;
        int incrementValue$15 = 0;
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        int incrementValue$18 = 0;
        int incrementValue$19 = 0;
        int incrementValue$20 = 0;
        int incrementValue$21 = 0;
        int incrementValue$22 = 0;
        int incrementValue$23 = 0;
        int incrementValue$24 = 0;
        int incrementValue$25 = 0;
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        int[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int[] var14 = null;
        int var14_int = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        int[][] var26 = null;
        int stackIn_12_0 = 0;
        int stackIn_20_0 = 0;
        fc stackIn_24_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_19_0 = 0;
        int stackOut_11_0 = 0;
        fc stackOut_23_0 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var16 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 < -86) {
                break L1;
              } else {
                discarded$13 = gi.a(92, 124, -54, (byte) -50);
                break L1;
              }
            }
            var2_int = 1;
            incrementValue$14 = var2_int;
            var2_int++;
            var3 = ql.a(true, incrementValue$14, param0);
            incrementValue$15 = var2_int;
            var2_int++;
            var4 = ql.a(true, incrementValue$15, param0);
            incrementValue$16 = var2_int;
            var2_int++;
            var5 = ql.a(true, incrementValue$16, param0);
            var23 = new int[4];
            var19 = var23;
            var6 = var19;
            var24 = new int[4];
            var20 = var24;
            var7 = var20;
            var8 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (-5 >= (var8 ^ -1)) {
                    break L4;
                  } else {
                    incrementValue$17 = var2_int;
                    var2_int++;
                    var6[var8] = ql.a(true, incrementValue$17, param0);
                    incrementValue$18 = var2_int;
                    var2_int++;
                    var7[var8] = ql.a(true, incrementValue$18, param0);
                    var8++;
                    if (var16 != 0) {
                      break L3;
                    } else {
                      if (var16 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                incrementValue$19 = var2_int;
                var2_int++;
                var8 = ql.a(true, incrementValue$19, param0);
                break L3;
              }
              incrementValue$20 = var2_int;
              var2_int++;
              var9 = ql.a(true, incrementValue$20, param0);
              incrementValue$21 = var2_int;
              var2_int++;
              var10 = ql.a(true, incrementValue$21, param0);
              incrementValue$22 = var2_int;
              var2_int++;
              var11 = ql.a(true, incrementValue$22, param0);
              var26 = new int[var11][var10];
              var13 = 0;
              L5: while (true) {
                L6: {
                  if (var11 <= var13) {
                    incrementValue$23 = var2_int;
                    var2_int++;
                    var13 = ql.a(true, incrementValue$23, param0);
                    stackOut_19_0 = var13 * 4;
                    stackIn_20_0 = stackOut_19_0;
                    break L6;
                  } else {
                    stackOut_11_0 = 0;
                    stackIn_20_0 = stackOut_11_0;
                    stackIn_12_0 = stackOut_11_0;
                    if (var16 != 0) {
                      break L6;
                    } else {
                      var14_int = stackIn_12_0;
                      L7: while (true) {
                        L8: {
                          if (var10 <= var14_int) {
                            var13++;
                            break L8;
                          } else {
                            incrementValue$24 = var2_int;
                            var2_int++;
                            var26[var13][var14_int] = ql.a(true, incrementValue$24, param0);
                            var14_int++;
                            if (var16 != 0) {
                              break L8;
                            } else {
                              continue L7;
                            }
                          }
                        }
                        continue L5;
                      }
                    }
                  }
                }
                var22 = new int[stackIn_20_0];
                var18 = var22;
                var14 = var18;
                var15 = 0;
                L9: while (true) {
                  L10: {
                    if (var15 >= var13 * 4) {
                      break L10;
                    } else {
                      incrementValue$25 = var2_int;
                      var2_int++;
                      var14[var15] = ql.a(true, incrementValue$25, param0);
                      var15++;
                      if (var16 == 0) {
                        continue L9;
                      } else {
                        break L10;
                      }
                    }
                  }
                  stackOut_23_0 = new fc(var26, var22, var3, var4, var5, var23, var24, var8, var9);
                  stackIn_24_0 = stackOut_23_0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var2 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) (var2);
            stackOut_25_1 = new StringBuilder().append("gi.D(");
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param0 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L11;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L11;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param1 + ')');
        }
        return stackIn_24_0;
    }

    final static void a(byte param0, int param1) {
        li.field_C = 3 & param1 >> 1326190436;
        qe.field_g = 3 & param1 >> 2121804290;
        if ((li.field_C ^ -1) >= -3) {
          if (param0 <= -51) {
            if ((qe.field_g ^ -1) < -3) {
              L0: {
                qe.field_g = 2;
                ba.field_q = 3 & param1;
                if (-3 > (ba.field_q ^ -1)) {
                  ba.field_q = 2;
                  break L0;
                } else {
                  break L0;
                }
              }
              return;
            } else {
              L1: {
                ba.field_q = 3 & param1;
                if (-3 > (ba.field_q ^ -1)) {
                  ba.field_q = 2;
                  break L1;
                } else {
                  break L1;
                }
              }
              return;
            }
          } else {
            field_m = 108;
            if ((qe.field_g ^ -1) < -3) {
              L2: {
                qe.field_g = 2;
                ba.field_q = 3 & param1;
                if (-3 > (ba.field_q ^ -1)) {
                  ba.field_q = 2;
                  break L2;
                } else {
                  break L2;
                }
              }
              return;
            } else {
              L3: {
                ba.field_q = 3 & param1;
                if (-3 > (ba.field_q ^ -1)) {
                  ba.field_q = 2;
                  break L3;
                } else {
                  break L3;
                }
              }
              return;
            }
          }
        } else {
          li.field_C = 2;
          if (param0 > -51) {
            field_m = 108;
            if ((qe.field_g ^ -1) >= -3) {
              L4: {
                ba.field_q = 3 & param1;
                if (-3 > (ba.field_q ^ -1)) {
                  ba.field_q = 2;
                  break L4;
                } else {
                  break L4;
                }
              }
              return;
            } else {
              L5: {
                qe.field_g = 2;
                ba.field_q = 3 & param1;
                if (-3 > (ba.field_q ^ -1)) {
                  ba.field_q = 2;
                  break L5;
                } else {
                  break L5;
                }
              }
              return;
            }
          } else {
            if ((qe.field_g ^ -1) < -3) {
              L6: {
                qe.field_g = 2;
                ba.field_q = 3 & param1;
                if (-3 > (ba.field_q ^ -1)) {
                  ba.field_q = 2;
                  break L6;
                } else {
                  break L6;
                }
              }
              return;
            } else {
              L7: {
                ba.field_q = 3 & param1;
                if (-3 > (ba.field_q ^ -1)) {
                  ba.field_q = 2;
                  break L7;
                } else {
                  break L7;
                }
              }
              return;
            }
          }
        }
    }

    final static int a(int param0, int param1, int param2, byte param3) {
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
        var13 = ZombieDawnMulti.field_E ? 1 : 0;
        if (-1 == (param0 ^ -1)) {
          var6 = param1;
          var5 = param1;
          var4 = param1;
          if (var13 == 0) {
            if (param3 >= -17) {
              field_n = (String) null;
              return 255 & var6 | ((255 & var4) << -1050576848 | (var5 & 255) << 372560296);
            } else {
              return 255 & var6 | ((255 & var4) << -1050576848 | (var5 & 255) << 372560296);
            }
          } else {
            L0: {
              var7 = param2;
              var8 = var7 / 43;
              var9 = 6 * (-(var8 * 43) + var7);
              var10 = (-param0 + 255) * param1 >> -1672199064;
              var11 = (-(var9 * param0 >> -1569388056) + 255) * param1 >> 476623304;
              if (var10 >= 256) {
                var10 = 255;
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              if (var11 < 256) {
                break L1;
              } else {
                var11 = 255;
                break L1;
              }
            }
            L2: {
              var12 = param1 * (255 + -((-var9 + 255) * param0 >> 662336872)) >> -1464657720;
              if (256 <= var12) {
                var12 = 255;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              L4: {
                if (0 == var8) {
                  break L4;
                } else {
                  L5: {
                    if (1 != var8) {
                      break L5;
                    } else {
                      var5 = param1;
                      var4 = var11;
                      var6 = var10;
                      if (var13 == 0) {
                        break L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                  L6: {
                    if (2 != var8) {
                      break L6;
                    } else {
                      var5 = param1;
                      var4 = var10;
                      var6 = var12;
                      if (var13 == 0) {
                        break L3;
                      } else {
                        break L6;
                      }
                    }
                  }
                  L7: {
                    if (-4 == (var8 ^ -1)) {
                      break L7;
                    } else {
                      L8: {
                        if (4 != var8) {
                          break L8;
                        } else {
                          var4 = var12;
                          var6 = param1;
                          var5 = var10;
                          if (var13 == 0) {
                            break L3;
                          } else {
                            break L8;
                          }
                        }
                      }
                      var4 = param1;
                      var5 = var10;
                      var6 = var11;
                      if (var13 == 0) {
                        break L3;
                      } else {
                        break L7;
                      }
                    }
                  }
                  var6 = param1;
                  var5 = var11;
                  var4 = var10;
                  if (var13 == 0) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              var4 = param1;
              var6 = var10;
              var5 = var12;
              break L3;
            }
            if (param3 >= -17) {
              field_n = (String) null;
              return 255 & var6 | ((255 & var4) << -1050576848 | (var5 & 255) << 372560296);
            } else {
              return 255 & var6 | ((255 & var4) << -1050576848 | (var5 & 255) << 372560296);
            }
          }
        } else {
          L9: {
            var7 = param2;
            var8 = var7 / 43;
            var9 = 6 * (-(var8 * 43) + var7);
            var10 = (-param0 + 255) * param1 >> -1672199064;
            var11 = (-(var9 * param0 >> -1569388056) + 255) * param1 >> 476623304;
            if (var10 >= 256) {
              var10 = 255;
              break L9;
            } else {
              break L9;
            }
          }
          L10: {
            if (var11 < 256) {
              break L10;
            } else {
              var11 = 255;
              break L10;
            }
          }
          L11: {
            var12 = param1 * (255 + -((-var9 + 255) * param0 >> 662336872)) >> -1464657720;
            if (256 <= var12) {
              var12 = 255;
              break L11;
            } else {
              break L11;
            }
          }
          L12: {
            L13: {
              if (0 == var8) {
                break L13;
              } else {
                L14: {
                  if (1 != var8) {
                    break L14;
                  } else {
                    var5 = param1;
                    var4 = var11;
                    var6 = var10;
                    if (var13 == 0) {
                      break L12;
                    } else {
                      break L14;
                    }
                  }
                }
                L15: {
                  if (2 != var8) {
                    break L15;
                  } else {
                    var5 = param1;
                    var4 = var10;
                    var6 = var12;
                    if (var13 == 0) {
                      break L12;
                    } else {
                      break L15;
                    }
                  }
                }
                L16: {
                  if (-4 == (var8 ^ -1)) {
                    break L16;
                  } else {
                    L17: {
                      if (4 != var8) {
                        break L17;
                      } else {
                        var4 = var12;
                        var6 = param1;
                        var5 = var10;
                        if (var13 == 0) {
                          break L12;
                        } else {
                          break L17;
                        }
                      }
                    }
                    var4 = param1;
                    var5 = var10;
                    var6 = var11;
                    if (var13 == 0) {
                      break L12;
                    } else {
                      break L16;
                    }
                  }
                }
                var6 = param1;
                var5 = var11;
                var4 = var10;
                if (var13 == 0) {
                  break L12;
                } else {
                  break L13;
                }
              }
            }
            var4 = param1;
            var6 = var10;
            var5 = var12;
            break L12;
          }
          if (param3 >= -17) {
            field_n = (String) null;
            return 255 & var6 | ((255 & var4) << -1050576848 | (var5 & 255) << 372560296);
          } else {
            return 255 & var6 | ((255 & var4) << -1050576848 | (var5 & 255) << 372560296);
          }
        }
    }

    final static ma a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String var4 = null;
        ma var5 = null;
        ma stackIn_6_0 = null;
        ma stackIn_10_0 = null;
        ma stackIn_13_0 = null;
        ma stackIn_15_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ma stackOut_9_0 = null;
        ma stackOut_14_0 = null;
        ma stackOut_12_0 = null;
        ma stackOut_5_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 4) {
                break L1;
              } else {
                field_i = (dk) null;
                break L1;
              }
            }
            L2: {
              if (param1 == null) {
                break L2;
              } else {
                if (0 != param1.length()) {
                  var2_int = param1.indexOf('@');
                  if (-1 == var2_int) {
                    stackOut_9_0 = jo.field_e;
                    stackIn_10_0 = stackOut_9_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var3 = param1.substring(0, var2_int);
                    var4 = param1.substring(1 + var2_int);
                    var5 = sb.a(32351, var3);
                    if (var5 == null) {
                      stackOut_14_0 = nf.a((byte) 125, var4);
                      stackIn_15_0 = stackOut_14_0;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      stackOut_12_0 = (ma) (var5);
                      stackIn_13_0 = stackOut_12_0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                } else {
                  break L2;
                }
              }
            }
            stackOut_5_0 = of.field_d;
            stackIn_6_0 = stackOut_5_0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var2);
            stackOut_16_1 = new StringBuilder().append("gi.E(").append(param0).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L3;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L3;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0;
            } else {
              return stackIn_15_0;
            }
          }
        }
    }

    gi(byte[] param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              this.field_o = param0;
              this.field_f = this.field_o[7];
              this.field_j = this.field_o[11];
              if (4 != this.field_f) {
                break L1;
              } else {
                this.field_f = 0;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (runtimeException);
            stackOut_4_1 = new StringBuilder().append("gi.<init>(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    static {
        field_m = 0;
        field_g = "This password contains repeated characters, and would be easy to guess";
        field_h = "Email is valid";
        field_n = "Players";
        field_p = "Warning: if you quit, you will lose any game you are in the middle of!";
    }
}
