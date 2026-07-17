/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class js {
    static ld field_c;
    static int field_d;
    static int field_g;
    static gh field_i;
    static String field_h;
    static ke field_a;
    static sl field_f;
    static int field_j;
    static sq[] field_b;
    static int field_e;

    final static void a(int param0, int param1) {
        gm var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              tf.field_p = param0;
              if (param1 == 197126152) {
                break L1;
              } else {
                qr discarded$2 = js.b((byte) -92);
                break L1;
              }
            }
            var2 = (gm) (Object) eo.field_ab.d(0);
            L2: while (true) {
              if (var2 == null) {
                L3: {
                  if (nc.field_v == null) {
                    break L3;
                  } else {
                    var2 = (gm) (Object) nc.field_v.d(0);
                    L4: while (true) {
                      if (var2 == null) {
                        break L3;
                      } else {
                        L5: {
                          if (var2.field_n.c(param1 + -197124104)) {
                            var2.field_p.e(128 + tf.field_p * var2.field_h >> 8);
                            break L5;
                          } else {
                            var2.b((byte) -69);
                            break L5;
                          }
                        }
                        var2 = (gm) (Object) nc.field_v.a((byte) -71);
                        continue L4;
                      }
                    }
                  }
                }
                break L0;
              } else {
                L6: {
                  if (!var2.field_n.c(param1 + -197124104)) {
                    var2.b((byte) -75);
                    break L6;
                  } else {
                    var2.field_p.e(var2.field_h * tf.field_p - -128 >> 8);
                    break L6;
                  }
                }
                var2 = (gm) (Object) eo.field_ab.a((byte) -71);
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw r.a((Throwable) (Object) var2_ref, "js.C(" + param0 + 44 + param1 + 41);
        }
    }

    final static int a(int param0, int param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_5_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            L1: while (true) {
              if (param1 <= 0) {
                stackOut_4_0 = var3_int;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                var3_int = var3_int << 1 | 1 & param0;
                param1--;
                param0 = param0 >>> 1;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var3, "js.B(" + param0 + 44 + param1 + 44 + 41 + 41);
        }
        return stackIn_5_0;
    }

    final static boolean a(int param0, java.applet.Applet param1) {
        try {
            int var2_int = 0;
            RuntimeException var2 = null;
            String var3 = null;
            Throwable var3_ref = null;
            String var4 = null;
            String[] var5 = null;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int stackIn_3_0 = 0;
            int stackIn_9_0 = 0;
            int stackIn_16_0 = 0;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            RuntimeException stackIn_20_0 = null;
            StringBuilder stackIn_20_1 = null;
            String stackIn_20_2 = null;
            int stackOut_2_0 = 0;
            int stackOut_8_0 = 0;
            int stackOut_14_0 = 0;
            int stackOut_15_0 = 0;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            RuntimeException stackOut_18_0 = null;
            StringBuilder stackOut_18_1 = null;
            String stackOut_18_2 = null;
            RuntimeException stackOut_19_0 = null;
            StringBuilder stackOut_19_1 = null;
            String stackOut_19_2 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var8 = ShatteredPlansClient.field_F ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var2_int = 84;
                            if (!sq.field_o) {
                                statePc = 4;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            stackOut_2_0 = 1;
                            stackIn_3_0 = stackOut_2_0;
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        return stackIn_3_0 != 0;
                    }
                    case 4: {
                        try {
                            var3 = "tuhstatbut";
                            var4 = (String) ll.a("getcookies", param1, (byte) 127);
                            var5 = so.a(var4, ';', 116);
                            var6 = 0;
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            if (var5.length <= var6) {
                                statePc = 13;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            var7 = var5[var6].indexOf('=');
                            if (var7 < 0) {
                                statePc = 10;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            if (!var5[var6].substring(0, var7).trim().equals((Object) (Object) var3)) {
                                statePc = 10;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            stackOut_8_0 = 1;
                            stackIn_9_0 = stackOut_8_0;
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        return stackIn_9_0 != 0;
                    }
                    case 10: {
                        try {
                            var6++;
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            var3_ref = caughtException;
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            if (param1.getParameter("tuhstatbut") == null) {
                                statePc = 15;
                            } else {
                                statePc = 14;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            stackOut_14_0 = 1;
                            stackIn_16_0 = stackOut_14_0;
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            stackOut_15_0 = 0;
                            stackIn_16_0 = stackOut_15_0;
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        return stackIn_16_0 != 0;
                    }
                    case 17: {
                        var2 = (RuntimeException) (Object) caughtException;
                        stackOut_17_0 = (RuntimeException) var2;
                        stackOut_17_1 = new StringBuilder().append("js.G(").append(-83).append(44);
                        stackIn_19_0 = stackOut_17_0;
                        stackIn_19_1 = stackOut_17_1;
                        stackIn_18_0 = stackOut_17_0;
                        stackIn_18_1 = stackOut_17_1;
                        if (param1 == null) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    }
                    case 18: {
                        stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
                        stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
                        stackOut_18_2 = "{...}";
                        stackIn_20_0 = stackOut_18_0;
                        stackIn_20_1 = stackOut_18_1;
                        stackIn_20_2 = stackOut_18_2;
                        statePc = 20;
                        continue stateLoop;
                    }
                    case 19: {
                        stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
                        stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
                        stackOut_19_2 = "null";
                        stackIn_20_0 = stackOut_19_0;
                        stackIn_20_1 = stackOut_19_1;
                        stackIn_20_2 = stackOut_19_2;
                        statePc = 20;
                        continue stateLoop;
                    }
                    case 20: {
                        throw r.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 41);
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

    final static qr b(byte param0) {
        if (param0 != 121) {
            return null;
        }
        return d.field_a.field_Eb;
    }

    final static int a(int param0) {
        param0--;
        param0 = param0 | param0 >>> 1;
        param0 = param0 | param0 >>> 2;
        param0 = param0 | param0 >>> 4;
        param0 = param0 | param0 >>> 8;
        param0 = param0 | param0 >>> 16;
        return param0 + 1;
    }

    public static void c() {
        field_a = null;
        field_h = null;
        field_c = null;
        field_f = null;
        field_b = null;
        field_i = null;
    }

    final static void a(int param0, int param1, fb param2, int param3, int param4, boolean param5, int param6, int param7) {
        RuntimeException var8 = null;
        int var8_int = 0;
        sg[] var8_array = null;
        int var9 = 0;
        int[] var10 = null;
        int var10_int = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        sg var13_ref_sg = null;
        int var14 = 0;
        int var15 = 0;
        sg[] var16 = null;
        sg[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        sg[][] stackIn_5_0 = null;
        sg[][] stackIn_6_0 = null;
        sg[][] stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_49_0 = 0;
        RuntimeException stackIn_100_0 = null;
        StringBuilder stackIn_100_1 = null;
        RuntimeException stackIn_101_0 = null;
        StringBuilder stackIn_101_1 = null;
        RuntimeException stackIn_102_0 = null;
        StringBuilder stackIn_102_1 = null;
        String stackIn_102_2 = null;
        RuntimeException decompiledCaughtException = null;
        sg[][] stackOut_4_0 = null;
        sg[][] stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        sg[][] stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_34_0 = 0;
        RuntimeException stackOut_99_0 = null;
        StringBuilder stackOut_99_1 = null;
        RuntimeException stackOut_101_0 = null;
        StringBuilder stackOut_101_1 = null;
        String stackOut_101_2 = null;
        RuntimeException stackOut_100_0 = null;
        StringBuilder stackOut_100_1 = null;
        String stackOut_100_2 = null;
        var15 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == 1) {
                break L1;
              } else {
                js.a(106, 32);
                break L1;
              }
            }
            L2: {
              if (param3 <= param0) {
                var8_int = 1;
                var9 = 0;
                L3: while (true) {
                  if (pe.field_D.length <= var9) {
                    if (var8_int == 0) {
                      break L2;
                    } else {
                      wg.field_d = true;
                      break L2;
                    }
                  } else {
                    var21 = pe.field_D[var9];
                    var20 = var21;
                    var19 = var20;
                    var18 = var19;
                    var10 = var18;
                    var11 = 0;
                    var12 = 0;
                    L4: while (true) {
                      if (var12 >= var21.length) {
                        L5: {
                          L6: {
                            if (var11 != 0) {
                              break L6;
                            } else {
                              if (em.field_k == param0) {
                                break L6;
                              } else {
                                break L5;
                              }
                            }
                          }
                          var12 = 0;
                          L7: while (true) {
                            if (var21.length <= var12) {
                              var8_int = 0;
                              break L5;
                            } else {
                              L8: {
                                var13 = var21[var12];
                                if (var13 == -1) {
                                  qd.field_h = true;
                                  break L8;
                                } else {
                                  if (var13 < param0) {
                                    ek.field_F[var13] = true;
                                    break L8;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                              var12 += 2;
                              continue L7;
                            }
                          }
                        }
                        var9++;
                        continue L3;
                      } else {
                        var13 = var21[var12];
                        var14 = var10[1 + var12];
                        if (var13 != -1) {
                          L9: {
                            if (var13 != param0) {
                              break L9;
                            } else {
                              if (param6 == var14) {
                                var11 = 1;
                                var12 += 2;
                                continue L4;
                              } else {
                                break L9;
                              }
                            }
                          }
                          L10: {
                            if (param0 <= var13) {
                              break L10;
                            } else {
                              break L10;
                            }
                          }
                          var9++;
                          continue L3;
                        } else {
                          L11: {
                            if (nl.field_a[param7] != var14) {
                              break L11;
                            } else {
                              break L11;
                            }
                          }
                          var9++;
                          continue L3;
                        }
                      }
                    }
                  }
                }
              } else {
                L12: {
                  stackOut_4_0 = fk.field_p;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_5_0 = stackOut_4_0;
                  if (-1 == param0) {
                    stackOut_6_0 = (sg[][]) (Object) stackIn_6_0;
                    stackOut_6_1 = 1;
                    stackIn_7_0 = stackOut_6_0;
                    stackIn_7_1 = stackOut_6_1;
                    break L12;
                  } else {
                    stackOut_5_0 = (sg[][]) (Object) stackIn_5_0;
                    stackOut_5_1 = 4 - -param0;
                    stackIn_7_0 = stackOut_5_0;
                    stackIn_7_1 = stackOut_5_1;
                    break L12;
                  }
                }
                L13: {
                  var16 = stackIn_7_0[stackIn_7_1];
                  var17 = var16;
                  var8_array = var17;
                  var9 = 1;
                  if (!param5) {
                    break L13;
                  } else {
                    if (-1 != param0) {
                      var10_int = 0;
                      L14: while (true) {
                        L15: {
                          if (var16.length + -1 <= var10_int) {
                            break L15;
                          } else {
                            if ((qj.field_f[(var10_int + param4) / 8] & 1 << (7 & param4 - -var10_int)) == 0) {
                              var10_int++;
                              continue L14;
                            } else {
                              var9 = 0;
                              break L15;
                            }
                          }
                        }
                        param4 = param4 + (ks.field_e[param0] & 255);
                        break L13;
                      }
                    } else {
                      var10_int = 0;
                      L16: while (true) {
                        if (nl.field_a.length <= var10_int) {
                          break L13;
                        } else {
                          if ((id.field_c[var10_int / 8] & 1 << (var10_int & 7)) != 0) {
                            var9 = 0;
                            break L13;
                          } else {
                            var10_int++;
                            continue L16;
                          }
                        }
                      }
                    }
                  }
                }
                var10_int = 0;
                var11 = 0;
                L17: while (true) {
                  L18: {
                    if (-1 != param0) {
                      stackOut_24_0 = var17.length + -1;
                      stackIn_25_0 = stackOut_24_0;
                      break L18;
                    } else {
                      stackOut_23_0 = nl.field_a.length;
                      stackIn_25_0 = stackOut_23_0;
                      break L18;
                    }
                  }
                  if (~stackIn_25_0 >= ~var11) {
                    if (var10_int == 0) {
                      var11 = 0;
                      L19: while (true) {
                        if (var11 >= var17.length - 1) {
                          break L2;
                        } else {
                          L20: {
                            if (param0 == -1) {
                              param7 = var11;
                              break L20;
                            } else {
                              lr.field_c[param0] = (byte)var11;
                              break L20;
                            }
                          }
                          js.a(param0 - -1, param1, param2, param3, param4, param5, param6, param7);
                          if (!wg.field_d) {
                            var11++;
                            continue L19;
                          } else {
                            return;
                          }
                        }
                      }
                    } else {
                      break L2;
                    }
                  } else {
                    L21: {
                      if (param0 != -1) {
                        lr.field_c[param0] = (byte)var11;
                        break L21;
                      } else {
                        param7 = var11;
                        break L21;
                      }
                    }
                    L22: {
                      L23: {
                        if (param0 != 0) {
                          break L23;
                        } else {
                          if (-2 == nl.field_a.length) {
                            var12 = 1;
                            break L22;
                          } else {
                            break L23;
                          }
                        }
                      }
                      var13_ref_sg = var8_array[1 + var11];
                      if (!param5) {
                        L24: {
                          if (param0 == -1) {
                            if (nl.field_a[var11] != np.field_a.field_Eb) {
                              stackOut_48_0 = 0;
                              stackIn_49_0 = stackOut_48_0;
                              break L24;
                            } else {
                              stackOut_47_0 = 1;
                              stackIn_49_0 = stackOut_47_0;
                              break L24;
                            }
                          } else {
                            if ((255 & np.field_a.field_dc[param0]) != var11) {
                              stackOut_45_0 = 0;
                              stackIn_49_0 = stackOut_45_0;
                              break L24;
                            } else {
                              stackOut_44_0 = 1;
                              stackIn_49_0 = stackOut_44_0;
                              break L24;
                            }
                          }
                        }
                        var12 = stackIn_49_0;
                        break L22;
                      } else {
                        L25: {
                          if (!var13_ref_sg.field_bb) {
                            if (var9 != 0) {
                              if (var13_ref_sg.field_s) {
                                stackOut_39_0 = 1;
                                stackIn_41_0 = stackOut_39_0;
                                break L25;
                              } else {
                                stackOut_38_0 = 0;
                                stackIn_41_0 = stackOut_38_0;
                                break L25;
                              }
                            } else {
                              stackOut_36_0 = 0;
                              stackIn_41_0 = stackOut_36_0;
                              break L25;
                            }
                          } else {
                            stackOut_34_0 = 1;
                            stackIn_41_0 = stackOut_34_0;
                            break L25;
                          }
                        }
                        var12 = stackIn_41_0;
                        break L22;
                      }
                    }
                    L26: {
                      if (var12 != 0) {
                        js.a(1 + param0, 1, param2, param3, param4, param5, param6, param7);
                        var10_int = 1;
                        break L26;
                      } else {
                        break L26;
                      }
                    }
                    if (!wg.field_d) {
                      var11++;
                      continue L17;
                    } else {
                      return;
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L27: {
            var8 = decompiledCaughtException;
            stackOut_99_0 = (RuntimeException) var8;
            stackOut_99_1 = new StringBuilder().append("js.E(").append(param0).append(44).append(param1).append(44);
            stackIn_101_0 = stackOut_99_0;
            stackIn_101_1 = stackOut_99_1;
            stackIn_100_0 = stackOut_99_0;
            stackIn_100_1 = stackOut_99_1;
            if (param2 == null) {
              stackOut_101_0 = (RuntimeException) (Object) stackIn_101_0;
              stackOut_101_1 = (StringBuilder) (Object) stackIn_101_1;
              stackOut_101_2 = "null";
              stackIn_102_0 = stackOut_101_0;
              stackIn_102_1 = stackOut_101_1;
              stackIn_102_2 = stackOut_101_2;
              break L27;
            } else {
              stackOut_100_0 = (RuntimeException) (Object) stackIn_100_0;
              stackOut_100_1 = (StringBuilder) (Object) stackIn_100_1;
              stackOut_100_2 = "{...}";
              stackIn_102_0 = stackOut_100_0;
              stackIn_102_1 = stackOut_100_1;
              stackIn_102_2 = stackOut_100_2;
              break L27;
            }
          }
          throw r.a((Throwable) (Object) stackIn_102_0, stackIn_102_2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 41);
        }
    }

    final static void a(byte param0) {
        String[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        String var3 = null;
        int var4 = 0;
        String[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              be.field_h = oi.field_a;
              kp.field_j = jb.field_d;
              ph.field_g = false;
              er.field_g = false;
              pc.field_q = tp.field_b;
              ol.field_g = hm.field_q;
              jc.field_r = fe.field_B;
              me.field_j = false;
              td.field_L = false;
              se.field_k = false;
              if (param0 == -10) {
                break L1;
              } else {
                js.a((byte) 43);
                break L1;
              }
            }
            L2: {
              tl.field_u = false;
              ej.field_m = 0;
              if (null == ol.field_g.field_m) {
                break L2;
              } else {
                var5 = ol.field_g.field_m;
                var1 = var5;
                var2 = 0;
                L3: while (true) {
                  if (var2 >= var5.length) {
                    break L2;
                  } else {
                    var3 = var5[var2];
                    kq.b(var3, param0 ^ -15);
                    var2++;
                    continue L3;
                  }
                }
              }
            }
            L4: {
              if (!ol.field_g.field_h) {
                break L4;
              } else {
                ge.field_i = 0;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw r.a((Throwable) (Object) var1_ref, "js.A(" + param0 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = null;
        field_d = 0;
        field_h = "Please select an option in the '<%0>' row.";
    }
}
