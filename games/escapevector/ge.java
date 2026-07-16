/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ge implements Runnable {
    static String[][] field_b;
    volatile boolean field_g;
    static String field_a;
    static fc field_h;
    lk field_e;
    volatile boolean field_c;
    volatile ie[] field_f;
    static String[] field_d;

    public final void run() {
        Exception exception = null;
        int var1_int = 0;
        ie var2 = null;
        Throwable var3 = null;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        var4 = EscapeVector.field_A;
        ((ge) this).field_g = true;
        try {
          L0: {
            L1: while (true) {
              L2: {
                L3: {
                  if (((ge) this).field_c) {
                    break L3;
                  } else {
                    if (var4 != 0) {
                      break L2;
                    } else {
                      var1_int = 0;
                      L4: while (true) {
                        if (var1_int >= 2) {
                          en.a((byte) -95, 10L);
                          af.a((byte) -61, ((ge) this).field_e, (Object) null);
                          if (var4 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        } else {
                          L5: {
                            var2 = ((ge) this).field_f[var1_int];
                            if (var2 == null) {
                              break L5;
                            } else {
                              var2.d();
                              break L5;
                            }
                          }
                          var1_int++;
                          continue L4;
                        }
                      }
                    }
                  }
                }
                ((ge) this).field_g = false;
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            exception = (Exception) (Object) decompiledCaughtException;
            pf.a(false, (String) null, (Throwable) (Object) exception);
            ((ge) this).field_g = false;
            break L6;
          }
        } catch (java.lang.Throwable decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3 = decompiledCaughtException;
          ((ge) this).field_g = false;
          throw ge.<RuntimeException>$cfr$sneakyThrow(var3);
        }
    }

    final static ed[] a(int param0, int param1, int param2, int param3, int param4, byte param5, int param6, int param7, int param8) {
        int var9 = 0;
        ed[] var10 = null;
        ed[] var11_ref_ed__ = null;
        int var11 = 0;
        int var12 = 0;
        ed var13 = null;
        int var14 = 0;
        int var15 = 0;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_39_0 = 0;
        int stackOut_2_0 = 0;
        byte stackOut_8_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_32_0 = 0;
        var15 = EscapeVector.field_A;
        var9 = param0 + param2 + param3;
        var10 = new ed[]{new ed(var9, var9), new ed(param8, var9), new ed(var9, var9), new ed(var9, param8), new ed(64, 64), new ed(var9, param8), new ed(var9, var9), new ed(param8, var9), new ed(var9, var9)};
        var11_ref_ed__ = var10;
        var12 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if (var11_ref_ed__.length <= var12) {
                break L2;
              } else {
                var13 = var11_ref_ed__[var12];
                stackOut_2_0 = 0;
                stackIn_9_0 = stackOut_2_0;
                stackIn_3_0 = stackOut_2_0;
                if (var15 != 0) {
                  break L1;
                } else {
                  var14 = stackIn_3_0;
                  L3: while (true) {
                    L4: {
                      if (var13.field_B.length <= var14) {
                        break L4;
                      } else {
                        var13.field_B[var14] = param7;
                        var14++;
                        if (var15 == 0) {
                          continue L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    var12++;
                    if (var15 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
            stackOut_8_0 = param5;
            stackIn_9_0 = stackOut_8_0;
            break L1;
          }
          if (stackIn_9_0 == 33) {
            var11 = 0;
            L5: while (true) {
              L6: {
                if (var11 >= param0) {
                  stackOut_19_0 = 0;
                  stackIn_20_0 = stackOut_19_0;
                  break L6;
                } else {
                  stackOut_13_0 = 0;
                  stackIn_20_0 = stackOut_13_0;
                  stackIn_14_0 = stackOut_13_0;
                  if (var15 != 0) {
                    break L6;
                  } else {
                    var12 = stackIn_14_0;
                    L7: while (true) {
                      if (var9 <= var12) {
                        var11++;
                        continue L5;
                      } else {
                        var10[6].field_B[var12 + var9 * (-var11 + var9 - 1)] = param6;
                        var10[8].field_B[var12 + (-1 + var9 - var11) * var9] = param6;
                        var10[2].field_B[-1 + (var9 - (var11 - var12 * var9))] = param6;
                        var10[8].field_B[var12 * var9 - var11 - (-var9 - -1)] = param6;
                        var12++;
                        continue L7;
                      }
                    }
                  }
                }
              }
              var11 = stackIn_20_0;
              L8: while (true) {
                L9: {
                  if (param0 <= var11) {
                    stackOut_29_0 = 0;
                    stackIn_30_0 = stackOut_29_0;
                    break L9;
                  } else {
                    stackOut_22_0 = 0;
                    stackIn_30_0 = stackOut_22_0;
                    stackIn_23_0 = stackOut_22_0;
                    if (var15 != 0) {
                      break L9;
                    } else {
                      var12 = stackIn_23_0;
                      L10: while (true) {
                        if (var9 <= var12) {
                          var11++;
                          continue L8;
                        } else {
                          L11: {
                            var10[0].field_B[var9 * var11 + var12] = param4;
                            var10[0].field_B[var9 * var12 - -var11] = param4;
                            if (var9 + -var11 <= var12) {
                              break L11;
                            } else {
                              var10[2].field_B[var12 - -(var9 * var11)] = param4;
                              var10[6].field_B[var12 * var9 + var11] = param4;
                              break L11;
                            }
                          }
                          var12++;
                          continue L10;
                        }
                      }
                    }
                  }
                }
                var11 = stackIn_30_0;
                L12: while (true) {
                  L13: {
                    if (param8 <= var11) {
                      stackOut_38_0 = 0;
                      stackIn_39_0 = stackOut_38_0;
                      break L13;
                    } else {
                      stackOut_32_0 = 0;
                      stackIn_39_0 = stackOut_32_0;
                      stackIn_33_0 = stackOut_32_0;
                      if (var15 != 0) {
                        break L13;
                      } else {
                        var12 = stackIn_33_0;
                        L14: while (true) {
                          if (param0 <= var12) {
                            var11++;
                            continue L12;
                          } else {
                            var10[7].field_B[var11 + param8 * (-1 + (var9 + -var12))] = param6;
                            var10[5].field_B[var11 * var9 + (var9 - (1 - -var12))] = param6;
                            var10[1].field_B[param8 * var12 - -var11] = param4;
                            var10[3].field_B[var12 + var11 * var9] = param4;
                            var12++;
                            continue L14;
                          }
                        }
                      }
                    }
                  }
                  var11 = stackIn_39_0;
                  L15: while (true) {
                    L16: {
                      if (param8 >> 1770480481 <= var11) {
                        break L16;
                      } else {
                        var12 = 0;
                        L17: while (true) {
                          L18: {
                            if (var12 >= param3) {
                              var11++;
                              break L18;
                            } else {
                              var10[1].field_B[(var9 + -var12 + -1) * param8 + var11] = param1;
                              var10[3].field_B[var11 * var9 + (var9 - (1 - -var12))] = param1;
                              var10[7].field_B[var12 * param8 - -var11] = param1;
                              var10[5].field_B[var12 + var9 * var11] = param1;
                              var12++;
                              if (var15 != 0) {
                                break L18;
                              } else {
                                continue L17;
                              }
                            }
                          }
                          if (var15 == 0) {
                            continue L15;
                          } else {
                            break L16;
                          }
                        }
                      }
                    }
                    return var10;
                  }
                }
              }
            }
          } else {
            return null;
          }
        }
    }

    final static void a(byte param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            if (param0 < 14) {
                return;
            }
            try {
                var2 = new java.net.URL(param1.getCodeBase(), "subscribe.ws");
                param1.getAppletContext().showDocument(sh.a((byte) 119, param1, var2), "_top");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        bd var4_ref_bd = null;
        int var4 = 0;
        Object var5 = null;
        byte[] var5_array = null;
        int var6 = 0;
        byte[] var7 = null;
        ei var8 = null;
        c var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_14_0 = 0;
        L0: {
          var6 = EscapeVector.field_A;
          if (param0 == 124) {
            break L0;
          } else {
            field_a = null;
            break L0;
          }
        }
        L1: {
          var9 = om.field_g;
          var2 = var9.e(param0 ^ 124);
          if (var2 == 0) {
            break L1;
          } else {
            L2: {
              if (-2 == (var2 ^ -1)) {
                break L2;
              } else {
                pf.a(false, "A1: " + hf.b((byte) -65), (Throwable) null);
                nm.a(16);
                if (var6 != 0) {
                  break L2;
                } else {
                  return;
                }
              }
            }
            var3 = var9.g(-5053);
            var4_ref_bd = (bd) (Object) rd.field_b.a(false);
            L3: while (true) {
              L4: {
                L5: {
                  if (var4_ref_bd == null) {
                    break L5;
                  } else {
                    stackOut_9_0 = var4_ref_bd.field_i;
                    stackIn_15_0 = stackOut_9_0;
                    stackIn_10_0 = stackOut_9_0;
                    if (var6 != 0) {
                      break L4;
                    } else {
                      if (stackIn_10_0 == var3) {
                        break L5;
                      } else {
                        var4_ref_bd = (bd) (Object) rd.field_b.b((byte) 70);
                        if (var6 == 0) {
                          continue L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                }
                if (var4_ref_bd == null) {
                  stackOut_14_0 = 16;
                  stackIn_15_0 = stackOut_14_0;
                  break L4;
                } else {
                  var4_ref_bd.c((byte) -68);
                  break L1;
                }
              }
              nm.a(stackIn_15_0);
              return;
            }
          }
        }
        var8 = (ei) (Object) nf.field_w.a(false);
        if (var8 == null) {
          nm.a(16);
          return;
        } else {
          L6: {
            var4 = var9.e(0);
            if (var4 == 0) {
              break L6;
            } else {
              var13 = new byte[var4];
              var12 = var13;
              var11 = var12;
              var10 = var11;
              var7 = var10;
              var5_array = var7;
              var9.a(var13, (byte) -96, 0, var4);
              break L6;
            }
          }
          var5_array = null;
          var9.field_m = var9.field_m + 4;
          if (!var9.h(param0 ^ 124)) {
            nm.a(16);
            return;
          } else {
            var8.field_g = true;
            var8.field_h = var5_array;
            var8.c((byte) -126);
            return;
          }
        }
    }

    final static void a(int param0, int[] param1, int param2, int param3, byte param4, int param5, int param6, int param7, int[] param8, int param9) {
        int var10 = 0;
        int var11 = 0;
        var11 = EscapeVector.field_A;
        if (param4 > -55) {
          return;
        } else {
          var10 = param7;
          L0: while (true) {
            L1: {
              if (-1 >= (var10 ^ -1)) {
                break L1;
              } else {
                if (var11 != 0) {
                  break L1;
                } else {
                  param5 = param0;
                  L2: while (true) {
                    if (param5 >= 0) {
                      param9 = param9 + param3;
                      var10++;
                      continue L0;
                    } else {
                      L3: {
                        L4: {
                          int incrementValue$2 = param6;
                          param6++;
                          if (-1 != (param1[incrementValue$2] ^ -1)) {
                            break L4;
                          } else {
                            param9++;
                            if (var11 == 0) {
                              break L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                        param2 = param8[param9];
                        int incrementValue$3 = param9;
                        param9++;
                        param8[incrementValue$3] = -(ae.a(param2, 16579836) >> -1125526814) + param2;
                        break L3;
                      }
                      param5++;
                      continue L2;
                    }
                  }
                }
              }
            }
            return;
          }
        }
    }

    public static void b(byte param0) {
        if (param0 >= -11) {
            ge.a((byte) -77, (java.applet.Applet) null);
        }
        field_b = null;
        field_d = null;
        field_h = null;
        field_a = null;
    }

    ge() {
        ((ge) this).field_f = new ie[2];
        ((ge) this).field_c = false;
        ((ge) this).field_g = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Auto-shield reactivated";
        field_h = new fc();
        field_d = new String[]{"All scores", "My scores", "Best each"};
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
