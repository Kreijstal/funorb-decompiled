/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bo {
    static String field_b;
    static dd[] field_a;

    final static int b(int param0, int param1) {
        if (param0 == -65536) {
          if (param1 >= 0) {
            if (65536 < param1) {
              return -un.field_a[134217728 / param1] + 2048;
            } else {
              return un.field_a[param1 >> 5];
            }
          } else {
            if (param1 < -65536) {
              return un.field_a[134217728 / -param1] + -2048;
            } else {
              return -un.field_a[-param1 >> 5];
            }
          }
        } else {
          bo.a((byte) -16);
          if (param1 >= 0) {
            if (65536 < param1) {
              return -un.field_a[134217728 / param1] + 2048;
            } else {
              return un.field_a[param1 >> 5];
            }
          } else {
            if (param1 < -65536) {
              return un.field_a[134217728 / -param1] + -2048;
            } else {
              return -un.field_a[-param1 >> 5];
            }
          }
        }
    }

    public static void b(byte param0) {
        field_a = null;
        field_b = null;
    }

    final static tq a(int param0, int param1) {
        tq var2 = new tq();
        hb.field_j.b((byte) 127, (ma) (Object) var2);
        kp.a(1, param0);
        return var2;
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4, int param5, int param6, byte param7, int param8, int[] param9, byte param10) {
        int var11_int = 0;
        RuntimeException var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        try {
          L0: {
            param3 = param3 & -4;
            var11_int = -66 % ((71 - param2) / 36);
            param5 = param5 & -4;
            param8 = param8 & -4;
            param6 = param6 & -4;
            param0 = param0 & -4;
            param4 = param4 & -4;
            kk.a(param8, param6, param0, param4, param5, param3, 1727215554);
            var12 = -na.field_f + la.field_f;
            var13 = wm.field_Nb + -or.field_a;
            var14 = var13 * var13 + var12 * var12 >> 2;
            if (var14 != 0) {
              var15 = (int)(Math.sqrt((double)((float)var14 / 4.0f)) * 4.0);
              var16 = ic.field_a;
              if (var16 >= na.field_c) {
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                L1: {
                  var17 = -or.field_a + var16;
                  var18 = -wm.field_Nb + var16;
                  var19 = var17 * var13;
                  var20 = var17 * var12;
                  var21 = hd.field_I;
                  if (wh.field_f <= var21) {
                    break L1;
                  } else {
                    L2: {
                      L3: {
                        L4: {
                          var22 = -na.field_f + var21;
                          var23 = var21 - la.field_f;
                          var24 = var22 * var12 + var19 >> 2;
                          if (0 != param7) {
                            break L4;
                          } else {
                            if (0 > var22 * ng.field_w - -(fr.field_u * var17)) {
                              var21 += 4;
                              break L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                        L5: {
                          if (param10 != 0) {
                            break L5;
                          } else {
                            if (0 > var23 * ne.field_q + var18 * di.field_h) {
                              break L5;
                            } else {
                              var21 += 4;
                              break L2;
                            }
                          }
                        }
                        L6: {
                          L7: {
                            L8: {
                              L9: {
                                L10: {
                                  if (2 == param7) {
                                    break L10;
                                  } else {
                                    if (var24 >= 0) {
                                      break L10;
                                    } else {
                                      L11: {
                                        var25 = (int)Math.sqrt((double)(var22 * var22 + var17 * var17));
                                        if (param6 >= var25) {
                                          qh.b(var21 >> 2, var16 >> 2, param9[param1 - var25 * param1 / param6]);
                                          break L11;
                                        } else {
                                          var21 += 4;
                                          break L11;
                                        }
                                      }
                                      var21 += 4;
                                      break L9;
                                    }
                                  }
                                }
                                L12: {
                                  if (param10 == 2) {
                                    break L12;
                                  } else {
                                    if (var14 >= var24) {
                                      break L12;
                                    } else {
                                      var25 = (int)Math.sqrt((double)(var18 * var18 + var23 * var23));
                                      if (param3 < var25) {
                                        break L9;
                                      } else {
                                        qh.b(var21 >> 2, var16 >> 2, param9[param1 + -(param1 * var25 / param3)]);
                                        break L8;
                                      }
                                    }
                                  }
                                }
                                L13: {
                                  var25 = var13 * var22 - var20 >> 2;
                                  if (var25 < 0) {
                                    var25 = -var25;
                                    break L13;
                                  } else {
                                    break L13;
                                  }
                                }
                                var26 = ((var14 + -var24) * param6 + var24 * param3) / var14;
                                if (var25 >= var15 * var26 >> 2) {
                                  break L7;
                                } else {
                                  qh.b(var21 >> 2, var16 >> 2, param9[param1 - (var25 << 2) * param1 / var26 / var15]);
                                  break L6;
                                }
                              }
                              var21 += 4;
                              break L8;
                            }
                            var21 += 4;
                            break L7;
                          }
                          var21 += 4;
                          break L6;
                        }
                        var21 += 4;
                        break L3;
                      }
                      var21 += 4;
                      break L2;
                    }
                    var21 += 4;
                    var21 += 4;
                    break L1;
                  }
                }
                var16 += 4;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var11 = decompiledCaughtException;
            stackOut_36_0 = (RuntimeException) var11;
            stackOut_36_1 = new StringBuilder().append("bo.F(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44).append(param6).append(44).append(param7).append(44).append(param8).append(44);
            stackIn_38_0 = stackOut_36_0;
            stackIn_38_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param9 == null) {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L14;
            } else {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "{...}";
              stackIn_39_0 = stackOut_37_0;
              stackIn_39_1 = stackOut_37_1;
              stackIn_39_2 = stackOut_37_2;
              break L14;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_39_0, stackIn_39_2 + 44 + param10 + 41);
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(byte param0) {
        Object var1 = null;
        Throwable var2 = null;
        Object var3 = null;
        Throwable decompiledCaughtException = null;
        var1 = (Object) (Object) wp.field_g;
        synchronized (var1) {
          L0: {
            cd.field_b = ho.field_v;
            qk.field_g = qk.field_g + 1;
            wn.field_i = we.field_l;
            gg.field_f = wn.field_k;
            re.field_c = m.field_d;
            m.field_d = false;
            ne.field_s = kj.field_c;
            lq.field_W = pq.field_f;
            ua.field_o = ne.field_o;
            kj.field_c = 0;
            break L0;
          }
        }
        if (param0 < 86) {
          var3 = null;
          bo.a(94, 67, (byte) 67, -120, -99, 36, -121, (byte) 15, 19, (int[]) null, (byte) 9);
          return;
        } else {
          return;
        }
    }

    final static boolean a(int param0, byte param1) {
        if (param1 != 43) {
            field_a = null;
            if (param0 < 0) {
                return (param0 - -1) % 4 == 0 ? true : false;
            }
            if (!(param0 >= 1582)) {
                return 0 == param0 % 4 ? true : false;
            }
            if (param0 % 4 != 0) {
                return false;
            }
            if (param0 % 100 != 0) {
                return true;
            }
            if (param0 % 400 == 0) {
                return true;
            }
            return false;
        }
        if (param0 < 0) {
            return (param0 - -1) % 4 == 0 ? true : false;
        }
        if (!(param0 >= 1582)) {
            return 0 == param0 % 4 ? true : false;
        }
        if (param0 % 4 != 0) {
            return false;
        }
        if (param0 % 100 != 0) {
            return true;
        }
        return param0 % 400 == 0 ? true : false;
    }

    final static void a(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var1_int = lq.field_T[0];
            var2 = 1;
            L1: while (true) {
              if (lq.field_T.length <= var2) {
                break L0;
              } else {
                var3 = lq.field_T[var2];
                qn.a(tl.field_I, var2 << 4, tl.field_I, var1_int, var3);
                var1_int = var1_int + var3;
                var2++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var1, "bo.B(" + -94 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Break";
    }
}
