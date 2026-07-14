/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.net.URL;
import java.lang.String;

final class ke {
    static String field_g;
    private int[] field_h;
    static String field_d;
    static String field_c;
    static r field_b;
    private byte[] field_f;
    static String field_i;
    static int[] field_e;
    private int[] field_a;

    final int a(int param0, byte[] param1, int param2, int param3, int param4, byte[] param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Vertigo2.field_L ? 1 : 0;
        if (param0 == 25330) {
          if (-1 == (param2 ^ -1)) {
            return 0;
          } else {
            param2 = param2 + param4;
            var7 = 0;
            var8 = param3;
            L0: while (true) {
              L1: {
                var9 = param5[var8];
                if (0 <= var9) {
                  var7++;
                  break L1;
                } else {
                  var7 = ((ke) this).field_a[var7];
                  break L1;
                }
              }
              L2: {
                L3: {
                  var10 = ((ke) this).field_a[var7];
                  if (0 > ((ke) this).field_a[var7]) {
                    param4++;
                    param1[param4] = (byte)(var10 ^ -1);
                    if (param4 < param2) {
                      var7 = 0;
                      break L3;
                    } else {
                      break L2;
                    }
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if ((64 & var9) != 0) {
                    var7 = ((ke) this).field_a[var7];
                    break L4;
                  } else {
                    var7++;
                    break L4;
                  }
                }
                L5: {
                  var10 = ((ke) this).field_a[var7];
                  if (((ke) this).field_a[var7] < 0) {
                    param4++;
                    param1[param4] = (byte)(var10 ^ -1);
                    if (param2 <= param4) {
                      break L2;
                    } else {
                      var7 = 0;
                      break L5;
                    }
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if ((var9 & 32) == 0) {
                    var7++;
                    break L6;
                  } else {
                    var7 = ((ke) this).field_a[var7];
                    break L6;
                  }
                }
                L7: {
                  var10 = ((ke) this).field_a[var7];
                  if (((ke) this).field_a[var7] >= 0) {
                    break L7;
                  } else {
                    param4++;
                    param1[param4] = (byte)var10;
                    if (param4 < param2) {
                      var7 = 0;
                      break L7;
                    } else {
                      break L2;
                    }
                  }
                }
                L8: {
                  if (-1 != (16 & var9)) {
                    var7 = ((ke) this).field_a[var7];
                    break L8;
                  } else {
                    var7++;
                    break L8;
                  }
                }
                L9: {
                  var10 = ((ke) this).field_a[var7];
                  if (((ke) this).field_a[var7] >= 0) {
                    break L9;
                  } else {
                    param4++;
                    param1[param4] = (byte)(var10 ^ -1);
                    if (param2 <= param4) {
                      break L2;
                    } else {
                      var7 = 0;
                      break L9;
                    }
                  }
                }
                L10: {
                  if ((8 & var9) != 0) {
                    var7 = ((ke) this).field_a[var7];
                    break L10;
                  } else {
                    var7++;
                    break L10;
                  }
                }
                L11: {
                  var10 = ((ke) this).field_a[var7];
                  if (((ke) this).field_a[var7] < 0) {
                    param4++;
                    param1[param4] = (byte)(var10 ^ -1);
                    if (param4 < param2) {
                      var7 = 0;
                      break L11;
                    } else {
                      return -param3 + (1 + var8);
                    }
                  } else {
                    break L11;
                  }
                }
                L12: {
                  if (-1 == (var9 & 4)) {
                    var7++;
                    break L12;
                  } else {
                    var7 = ((ke) this).field_a[var7];
                    break L12;
                  }
                }
                L13: {
                  var10 = ((ke) this).field_a[var7];
                  if (-1 > ((ke) this).field_a[var7]) {
                    param4++;
                    param1[param4] = (byte)(var10 ^ -1);
                    if (param2 <= param4) {
                      break L2;
                    } else {
                      var7 = 0;
                      break L13;
                    }
                  } else {
                    break L13;
                  }
                }
                L14: {
                  if ((2 & var9) == 0) {
                    var7++;
                    break L14;
                  } else {
                    var7 = ((ke) this).field_a[var7];
                    break L14;
                  }
                }
                L15: {
                  var10 = ((ke) this).field_a[var7];
                  if (((ke) this).field_a[var7] < 0) {
                    param4++;
                    param1[param4] = (byte)(var10 ^ -1);
                    if (param4 >= param2) {
                      break L2;
                    } else {
                      var7 = 0;
                      break L15;
                    }
                  } else {
                    break L15;
                  }
                }
                L16: {
                  if (0 != (var9 & 1)) {
                    var7 = ((ke) this).field_a[var7];
                    break L16;
                  } else {
                    var7++;
                    break L16;
                  }
                }
                var10 = ((ke) this).field_a[var7];
                if (((ke) this).field_a[var7] < 0) {
                  param4++;
                  param1[param4] = (byte)(var10 ^ -1);
                  if (param2 <= param4) {
                    break L2;
                  } else {
                    var7 = 0;
                    var8++;
                    continue L0;
                  }
                } else {
                  var8++;
                  continue L0;
                }
              }
              return -param3 + (1 + var8);
            }
          }
        } else {
          return 86;
        }
    }

    final int a(int param0, int param1, byte[] param2, int param3, int param4, byte[] param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        Object var16 = null;
        L0: {
          var15 = Vertigo2.field_L ? 1 : 0;
          var7 = 0;
          if (param1 <= -3) {
            break L0;
          } else {
            var16 = null;
            int discarded$1 = ((ke) this).a(48, (byte[]) null, -36, 30, 56, (byte[]) null);
            break L0;
          }
        }
        param4 = param4 + param0;
        var8 = param3 << -342831133;
        L1: while (true) {
          if (param4 <= param0) {
            return -param3 + (var8 + 7 >> 1798449059);
          } else {
            var9 = param5[param0] & 255;
            var10 = ((ke) this).field_h[var9];
            var11 = ((ke) this).field_f[var9];
            if (var11 != 0) {
              var12 = var8 >> 1235660291;
              var13 = 7 & var8;
              var7 = var7 & -var13 >> -1376235073;
              var14 = var12 - -(-1 + (var11 + var13) >> 1789323139);
              var8 = var8 + var11;
              var13 += 24;
              var7 = om.a(var7, var10 >>> var13);
              param2[var12] = (byte)om.a(var7, var10 >>> var13);
              if (var14 > var12) {
                var12++;
                var13 -= 8;
                var7 = var10 >>> var13;
                param2[var12] = (byte)(var10 >>> var13);
                if (var12 < var14) {
                  var12++;
                  var13 -= 8;
                  var7 = var10 >>> var13;
                  param2[var12] = (byte)(var10 >>> var13);
                  if (var12 < var14) {
                    var13 -= 8;
                    var12++;
                    var7 = var10 >>> var13;
                    param2[var12] = (byte)(var10 >>> var13);
                    if (var14 > var12) {
                      var13 -= 8;
                      var12++;
                      var7 = var10 << -var13;
                      param2[var12] = (byte)(var10 << -var13);
                      param0++;
                      continue L1;
                    } else {
                      param0++;
                      continue L1;
                    }
                  } else {
                    param0++;
                    continue L1;
                  }
                } else {
                  param0++;
                  continue L1;
                }
              } else {
                param0++;
                continue L1;
              }
            } else {
              throw new RuntimeException("" + var9);
            }
          }
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_e = null;
        field_c = null;
        field_g = null;
        field_d = null;
        if (param0 != -125) {
            return;
        }
        field_i = null;
    }

    final static byte a(char param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        Object var4 = null;
        L0: {
          var3 = Vertigo2.field_L ? 1 : 0;
          if (param1 < -113) {
            break L0;
          } else {
            var4 = null;
            ke.a((Throwable) null, (String) null, -71);
            break L0;
          }
        }
        L1: {
          L2: {
            L3: {
              if (param0 <= 0) {
                break L3;
              } else {
                if (param0 < 128) {
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              if (param0 < 160) {
                break L4;
              } else {
                if (255 >= param0) {
                  break L2;
                } else {
                  break L4;
                }
              }
            }
            if (param0 == 8364) {
              var2 = -128;
              break L1;
            } else {
              if (8218 != param0) {
                if (param0 != 402) {
                  if (param0 != 8222) {
                    if (param0 != 8230) {
                      if (param0 != 8224) {
                        if (8225 == param0) {
                          var2 = -121;
                          break L1;
                        } else {
                          if (param0 != 710) {
                            if (param0 == 8240) {
                              var2 = -119;
                              break L1;
                            } else {
                              if (param0 == 352) {
                                var2 = -118;
                                break L1;
                              } else {
                                if (param0 != 8249) {
                                  if (338 == param0) {
                                    var2 = -116;
                                    break L1;
                                  } else {
                                    if (381 == param0) {
                                      var2 = -114;
                                      break L1;
                                    } else {
                                      if (8216 != param0) {
                                        if (param0 == 8217) {
                                          var2 = -110;
                                          break L1;
                                        } else {
                                          if (param0 != 8220) {
                                            if (param0 != 8221) {
                                              if (param0 == 8226) {
                                                var2 = -107;
                                                break L1;
                                              } else {
                                                if (param0 != 8211) {
                                                  if (8212 == param0) {
                                                    var2 = -105;
                                                    break L1;
                                                  } else {
                                                    if (param0 != 732) {
                                                      if (param0 != 8482) {
                                                        if (param0 == 353) {
                                                          var2 = -102;
                                                          break L1;
                                                        } else {
                                                          if (param0 != 8250) {
                                                            if (param0 != 339) {
                                                              if (param0 == 382) {
                                                                var2 = -98;
                                                                break L1;
                                                              } else {
                                                                if (param0 != 376) {
                                                                  var2 = 63;
                                                                  break L1;
                                                                } else {
                                                                  var2 = -97;
                                                                  break L1;
                                                                }
                                                              }
                                                            } else {
                                                              var2 = -100;
                                                              break L1;
                                                            }
                                                          } else {
                                                            var2 = -101;
                                                            break L1;
                                                          }
                                                        }
                                                      } else {
                                                        var2 = -103;
                                                        break L1;
                                                      }
                                                    } else {
                                                      var2 = -104;
                                                      break L1;
                                                    }
                                                  }
                                                } else {
                                                  var2 = -106;
                                                  break L1;
                                                }
                                              }
                                            } else {
                                              var2 = -108;
                                              break L1;
                                            }
                                          } else {
                                            var2 = -109;
                                            break L1;
                                          }
                                        }
                                      } else {
                                        var2 = -111;
                                        break L1;
                                      }
                                    }
                                  }
                                } else {
                                  var2 = -117;
                                  break L1;
                                }
                              }
                            }
                          } else {
                            var2 = -120;
                            break L1;
                          }
                        }
                      } else {
                        var2 = -122;
                        break L1;
                      }
                    } else {
                      var2 = -123;
                      break L1;
                    }
                  } else {
                    var2 = -124;
                    break L1;
                  }
                } else {
                  var2 = -125;
                  break L1;
                }
              } else {
                var2 = -126;
                break L1;
              }
            }
          }
          var2 = (byte)param0;
          break L1;
        }
        return (byte) var2;
    }

    ke(byte[] param0) {
        int var2 = 0;
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var13 = null;
        int var14 = 0;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        var2 = param0.length;
        ((ke) this).field_h = new int[var2];
        ((ke) this).field_f = param0;
        var19 = new int[33];
        var18 = var19;
        var17 = var18;
        var16 = var17;
        var3 = var16;
        ((ke) this).field_a = new int[8];
        var4 = 0;
        var5 = 0;
        L0: while (true) {
          if (var2 <= var5) {
          } else {
            var6 = param0[var5];
            if (var6 != 0) {
              L1: {
                var7 = 1 << -var6 + 32;
                var8 = var19[var6];
                ((ke) this).field_h[var5] = var8;
                if ((var8 & var7) != -1) {
                  var9 = var3[-1 + var6];
                  break L1;
                } else {
                  var10 = var6 + -1;
                  L2: while (true) {
                    L3: {
                      if (-2 > var10) {
                        break L3;
                      } else {
                        var11 = var19[var10];
                        if (var11 != var8) {
                          break L3;
                        } else {
                          var12 = 1 << 32 + -var10;
                          if ((var11 & var12) == 0) {
                            var3[var10] = om.a(var11, var12);
                            var10--;
                            continue L2;
                          } else {
                            var3[var10] = var3[var10 + -1];
                            break L3;
                          }
                        }
                      }
                    }
                    var9 = var8 | var7;
                    break L1;
                  }
                }
              }
              var19[var6] = var9;
              var10 = var6 - -1;
              L4: while (true) {
                if ((var10 ^ -1) < -33) {
                  var10 = 0;
                  var11 = 0;
                  L5: while (true) {
                    if (var11 >= var6) {
                      L6: {
                        if (var4 > var10) {
                          break L6;
                        } else {
                          var4 = var10 - -1;
                          break L6;
                        }
                      }
                      ((ke) this).field_a[var10] = var5 ^ -1;
                      var5++;
                      continue L0;
                    } else {
                      L7: {
                        var12 = -2147483648 >>> var11;
                        if (0 != (var12 & var8)) {
                          L8: {
                            if (((ke) this).field_a[var10] != 0) {
                              break L8;
                            } else {
                              ((ke) this).field_a[var10] = var4;
                              break L8;
                            }
                          }
                          var10 = ((ke) this).field_a[var10];
                          break L7;
                        } else {
                          var10++;
                          break L7;
                        }
                      }
                      var12 = var12 >>> 1;
                      if (((ke) this).field_a.length <= var10) {
                        var13 = new int[((ke) this).field_a.length * 2];
                        var14 = 0;
                        L9: while (true) {
                          if (((ke) this).field_a.length <= var14) {
                            ((ke) this).field_a = var13;
                            var11++;
                            continue L5;
                          } else {
                            var13[var14] = ((ke) this).field_a[var14];
                            var14++;
                            continue L9;
                          }
                        }
                      } else {
                        var11++;
                        continue L5;
                      }
                    }
                  }
                } else {
                  if (var19[var10] == var8) {
                    var19[var10] = var9;
                    var10++;
                    continue L4;
                  } else {
                    var10++;
                    continue L4;
                  }
                }
              }
            } else {
              var5++;
              continue L0;
            }
          }
        }
    }

    final static void a(Throwable param0, String param1, int param2) {
        try {
            Exception var3 = null;
            String var3_ref = null;
            wk var4 = null;
            DataInputStream var5 = null;
            int var6 = 0;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            String var10 = null;
            jj stackIn_13_0 = null;
            int stackIn_13_1 = 0;
            java.net.URL stackIn_13_2 = null;
            java.net.URL stackIn_13_3 = null;
            java.net.URL stackIn_13_4 = null;
            StringBuilder stackIn_13_5 = null;
            jj stackIn_14_0 = null;
            int stackIn_14_1 = 0;
            java.net.URL stackIn_14_2 = null;
            java.net.URL stackIn_14_3 = null;
            java.net.URL stackIn_14_4 = null;
            StringBuilder stackIn_14_5 = null;
            jj stackIn_15_0 = null;
            int stackIn_15_1 = 0;
            java.net.URL stackIn_15_2 = null;
            java.net.URL stackIn_15_3 = null;
            java.net.URL stackIn_15_4 = null;
            StringBuilder stackIn_15_5 = null;
            String stackIn_15_6 = null;
            jj stackOut_12_0 = null;
            int stackOut_12_1 = 0;
            java.net.URL stackOut_12_2 = null;
            java.net.URL stackOut_12_3 = null;
            java.net.URL stackOut_12_4 = null;
            StringBuilder stackOut_12_5 = null;
            jj stackOut_13_0 = null;
            int stackOut_13_1 = 0;
            java.net.URL stackOut_13_2 = null;
            java.net.URL stackOut_13_3 = null;
            java.net.URL stackOut_13_4 = null;
            StringBuilder stackOut_13_5 = null;
            String stackOut_13_6 = null;
            jj stackOut_14_0 = null;
            int stackOut_14_1 = 0;
            java.net.URL stackOut_14_2 = null;
            java.net.URL stackOut_14_3 = null;
            java.net.URL stackOut_14_4 = null;
            StringBuilder stackOut_14_5 = null;
            String stackOut_14_6 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var6 = Vertigo2.field_L ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var3_ref = "";
                            if (param0 == null) {
                                statePc = 3;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            var3_ref = gb.a(param0, false);
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            if (param1 != null) {
                                statePc = 5;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            if (param0 == null) {
                                statePc = 7;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            var3_ref = var3_ref + " | ";
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            var3_ref = var3_ref + param1;
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            ir.a(-8957, var3_ref);
                            var7 = mr.a(":", (byte) -48, "%3a", var3_ref);
                            var8 = mr.a("@", (byte) -48, "%40", var7);
                            if (param2 == 0) {
                                statePc = 10;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        return;
                    }
                    case 10: {
                        try {
                            var9 = mr.a("&", (byte) -48, "%26", var8);
                            var10 = mr.a("#", (byte) -48, "%23", var9);
                            if (null != nh.field_h) {
                                statePc = 12;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        return;
                    }
                    case 12: {
                        try {
                            stackOut_12_0 = mr.field_b;
                            stackOut_12_1 = param2 + 111;
                            stackOut_12_2 = null;
                            stackOut_12_3 = null;
                            stackOut_12_4 = nh.field_h.getCodeBase();
                            stackOut_12_5 = new StringBuilder().append("clienterror.ws?c=").append(oq.field_I).append("&u=");
                            stackIn_14_0 = stackOut_12_0;
                            stackIn_14_1 = stackOut_12_1;
                            stackIn_14_2 = stackOut_12_2;
                            stackIn_14_3 = stackOut_12_3;
                            stackIn_14_4 = stackOut_12_4;
                            stackIn_14_5 = stackOut_12_5;
                            stackIn_13_0 = stackOut_12_0;
                            stackIn_13_1 = stackOut_12_1;
                            stackIn_13_2 = stackOut_12_2;
                            stackIn_13_3 = stackOut_12_3;
                            stackIn_13_4 = stackOut_12_4;
                            stackIn_13_5 = stackOut_12_5;
                            if (c.field_f != null) {
                                statePc = 14;
                            } else {
                                statePc = 13;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            stackOut_13_0 = (jj) (Object) stackIn_13_0;
                            stackOut_13_1 = stackIn_13_1;
                            stackOut_13_2 = null;
                            stackOut_13_3 = null;
                            stackOut_13_4 = (java.net.URL) (Object) stackIn_13_4;
                            stackOut_13_5 = (StringBuilder) (Object) stackIn_13_5;
                            stackOut_13_6 = "" + f.field_F;
                            stackIn_15_0 = stackOut_13_0;
                            stackIn_15_1 = stackOut_13_1;
                            stackIn_15_2 = stackOut_13_2;
                            stackIn_15_3 = stackOut_13_3;
                            stackIn_15_4 = stackOut_13_4;
                            stackIn_15_5 = stackOut_13_5;
                            stackIn_15_6 = stackOut_13_6;
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            stackOut_14_0 = (jj) (Object) stackIn_14_0;
                            stackOut_14_1 = stackIn_14_1;
                            stackOut_14_2 = null;
                            stackOut_14_3 = null;
                            stackOut_14_4 = (java.net.URL) (Object) stackIn_14_4;
                            stackOut_14_5 = (StringBuilder) (Object) stackIn_14_5;
                            stackOut_14_6 = c.field_f;
                            stackIn_15_0 = stackOut_14_0;
                            stackIn_15_1 = stackOut_14_1;
                            stackIn_15_2 = stackOut_14_2;
                            stackIn_15_3 = stackOut_14_3;
                            stackIn_15_4 = stackOut_14_4;
                            stackIn_15_5 = stackOut_14_5;
                            stackIn_15_6 = stackOut_14_6;
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            new java.net.URL(stackIn_15_4, stackIn_15_6 + "&v1=" + jj.field_m + "&v2=" + jj.field_d + "&e=" + var10);
                            var4 = ((jj) (Object) stackIn_15_0).a(stackIn_15_1, stackIn_15_2);
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            if (var4.field_b != 0) {
                                statePc = 18;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            um.a(true, 1L);
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            if ((var4.field_b ^ -1) == -2) {
                                statePc = 20;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            var5 = (DataInputStream) var4.field_d;
                            int discarded$1 = var5.read();
                            var5.close();
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        var3 = (Exception) (Object) caughtException;
                        statePc = 23;
                        continue stateLoop;
                    }
                    case 23: {
                        return;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Current Medal";
        field_d = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        field_g = "To play a multiplayer game, please log in or create a free account.";
    }
}
