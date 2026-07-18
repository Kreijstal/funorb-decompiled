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
        int var1_int = 0;
        ie var2 = null;
        int var4 = EscapeVector.field_A;
        ((ge) this).field_g = true;
        try {
            while (!((ge) this).field_c) {
                for (var1_int = 0; var1_int < 2; var1_int++) {
                    var2 = ((ge) this).field_f[var1_int];
                    if (var2 != null) {
                        var2.d();
                    }
                }
                en.a((byte) -95, 10L);
                af.a((byte) -61, ((ge) this).field_e, (Object) null);
            }
        } catch (Exception exception) {
            pf.a(false, (String) null, (Throwable) (Object) exception);
        } finally {
            ((ge) this).field_g = false;
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
        var15 = EscapeVector.field_A;
        var9 = 3;
        var10 = new ed[]{new ed(var9, var9), new ed(3, var9), new ed(var9, var9), new ed(var9, 3), new ed(64, 64), new ed(var9, 3), new ed(var9, var9), new ed(3, var9), new ed(var9, var9)};
        var11_ref_ed__ = var10;
        var12 = 0;
        L0: while (true) {
          if (var11_ref_ed__.length <= var12) {
            var11 = 0;
            L1: while (true) {
              if (var11 >= 1) {
                var11 = 0;
                L2: while (true) {
                  if (1 <= var11) {
                    var11 = 0;
                    L3: while (true) {
                      if (var11 >= 3) {
                        var11 = 0;
                        L4: while (true) {
                          if (var11 >= 1) {
                            return var10;
                          } else {
                            var12 = 0;
                            L5: while (true) {
                              if (var12 >= 1) {
                                var11++;
                                continue L4;
                              } else {
                                var10[1].field_B[(var9 + -var12 + -1) * 3 + var11] = 65793;
                                var10[3].field_B[var11 * var9 + (var9 - (1 - -var12))] = 65793;
                                var10[7].field_B[var12 * 3 - -var11] = 65793;
                                var10[5].field_B[var12 + var9 * var11] = 65793;
                                var12++;
                                continue L5;
                              }
                            }
                          }
                        }
                      } else {
                        var12 = 0;
                        L6: while (true) {
                          if (1 <= var12) {
                            var11++;
                            continue L3;
                          } else {
                            var10[7].field_B[var11 + 3 * (-1 + (var9 + -var12))] = 0;
                            var10[5].field_B[var11 * var9 + (var9 - (1 - -var12))] = 0;
                            var10[1].field_B[3 * var12 - -var11] = 0;
                            var10[3].field_B[var12 + var11 * var9] = 0;
                            var12++;
                            continue L6;
                          }
                        }
                      }
                    }
                  } else {
                    var12 = 0;
                    L7: while (true) {
                      if (var9 <= var12) {
                        var11++;
                        continue L2;
                      } else {
                        var10[0].field_B[var9 * var11 + var12] = 0;
                        var10[0].field_B[var9 * var12 - -var11] = 0;
                        if (var9 + -var11 > var12) {
                          var10[2].field_B[var12 - -(var9 * var11)] = 0;
                          var10[6].field_B[var12 * var9 + var11] = 0;
                          var12++;
                          continue L7;
                        } else {
                          var12++;
                          continue L7;
                        }
                      }
                    }
                  }
                }
              } else {
                var12 = 0;
                L8: while (true) {
                  if (var9 > var12) {
                    var10[6].field_B[var12 + var9 * (-var11 + var9 - 1)] = 0;
                    var10[8].field_B[var12 + (-1 + var9 - var11) * var9] = 0;
                    var10[2].field_B[-1 + (var9 - (var11 - var12 * var9))] = 0;
                    var10[8].field_B[var12 * var9 - var11 - (-var9 - -1)] = 0;
                    var12++;
                    continue L8;
                  } else {
                    var11++;
                    continue L1;
                  }
                }
              }
            }
          } else {
            var13 = var11_ref_ed__[var12];
            var14 = 0;
            L9: while (true) {
              if (var13.field_B.length <= var14) {
                var12++;
                continue L0;
              } else {
                var13.field_B[var14] = 0;
                var14++;
                continue L9;
              }
            }
          }
        }
    }

    final static void a(byte param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            String stackOut_7_2 = null;
            try {
              try {
                L0: {
                  if (param0 >= 14) {
                    var2 = new java.net.URL(param1.getCodeBase(), "subscribe.ws");
                    param1.getAppletContext().showDocument(sh.a((byte) 119, param1, var2), "_top");
                    break L0;
                  } else {
                    return;
                  }
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L1: {
                  var2_ref = (Exception) (Object) decompiledCaughtException;
                  var2_ref.printStackTrace();
                  break L1;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L2: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) var2_ref2;
                stackOut_6_1 = new StringBuilder().append("ge.A(").append(param0).append(',');
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param1 == null) {
                  stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                  stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
                  stackOut_8_2 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  break L2;
                } else {
                  stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
                  stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
                  stackOut_7_2 = "{...}";
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  break L2;
                }
              }
              throw t.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a() {
        RuntimeException var1 = null;
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
        RuntimeException decompiledCaughtException = null;
        var6 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              var9 = om.field_g;
              var2 = var9.e(0);
              if (var2 == 0) {
                var8 = (ei) (Object) nf.field_w.a(false);
                if (var8 == null) {
                  nm.a(16);
                  return;
                } else {
                  L2: {
                    var4 = var9.e(0);
                    if (var4 == 0) {
                      var5_array = null;
                      break L2;
                    } else {
                      var13 = new byte[var4];
                      var12 = var13;
                      var11 = var12;
                      var10 = var11;
                      var7 = var10;
                      var5_array = var7;
                      var9.a(var13, (byte) -96, 0, var4);
                      break L2;
                    }
                  }
                  var9.field_m = var9.field_m + 4;
                  if (var9.h(0)) {
                    var8.field_g = true;
                    var8.field_h = var5_array;
                    var8.c((byte) -126);
                    break L1;
                  } else {
                    nm.a(16);
                    return;
                  }
                }
              } else {
                if (var2 == 1) {
                  var3 = var9.g(-5053);
                  var4_ref_bd = (bd) (Object) rd.field_b.a(false);
                  L3: while (true) {
                    L4: {
                      if (var4_ref_bd == null) {
                        break L4;
                      } else {
                        if (var4_ref_bd.field_i == var3) {
                          break L4;
                        } else {
                          var4_ref_bd = (bd) (Object) rd.field_b.b((byte) 70);
                          continue L3;
                        }
                      }
                    }
                    if (var4_ref_bd == null) {
                      nm.a(16);
                      return;
                    } else {
                      var4_ref_bd.c((byte) -68);
                      break L1;
                    }
                  }
                } else {
                  pf.a(false, "A1: " + hf.b((byte) -65), (Throwable) null);
                  nm.a(16);
                  break L1;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var1, "ge.B(" + 124 + ')');
        }
    }

    final static void a(int param0, int[] param1, int param2, int param3, byte param4, int param5, int param6, int param7, int[] param8, int param9) {
        int var10_int = 0;
        RuntimeException var10 = null;
        int var11 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var11 = EscapeVector.field_A;
        try {
          L0: {
            if (param4 <= -55) {
              var10_int = param7;
              L1: while (true) {
                if (var10_int >= 0) {
                  break L0;
                } else {
                  param5 = param0;
                  L2: while (true) {
                    if (param5 >= 0) {
                      param9 = param9 + param3;
                      var10_int++;
                      continue L1;
                    } else {
                      L3: {
                        int incrementValue$14 = param6;
                        param6++;
                        if (param1[incrementValue$14] != 0) {
                          param2 = param8[param9];
                          int incrementValue$15 = param9;
                          param9++;
                          param8[incrementValue$15] = -(ae.a(param2, 16579836) >> 2) + param2;
                          break L3;
                        } else {
                          param9++;
                          break L3;
                        }
                      }
                      param5++;
                      continue L2;
                    }
                  }
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var10 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var10;
            stackOut_13_1 = new StringBuilder().append("ge.D(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          L5: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param8 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          throw t.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + param9 + ')');
        }
    }

    public static void b() {
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
}
