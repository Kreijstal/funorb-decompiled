/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class n implements Runnable {
    static bl field_h;
    static String field_f;
    static java.awt.Canvas field_g;
    private hl field_b;
    static int field_c;
    static long field_i;
    private Thread field_d;
    private boolean field_a;
    int field_e;

    public final void run() {
        try {
            Object var2 = null;
            Exception var2_ref = null;
            Throwable var4 = null;
            int var5 = 0;
            bi var6 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
            L0: while (true) {
              if (((n) this).field_a) {
                return;
              } else {
                var2 = (Object) (Object) ((n) this).field_b;
                synchronized (var2) {
                  L1: {
                    var6 = (bi) (Object) ((n) this).field_b.d(5518);
                    if (var6 == null) {
                      {
                        L2: {
                          ((Object) (Object) ((n) this).field_b).wait();
                          break L2;
                        }
                      }
                      decompiledRegionSelector0 = 0;
                      break L1;
                    } else {
                      ((n) this).field_e = ((n) this).field_e - 1;
                      decompiledRegionSelector0 = 1;
                      break L1;
                    }
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  continue L0;
                } else {
                  try {
                    L4: {
                      L5: {
                        if (var6.field_G == 2) {
                          boolean discarded$1 = var6.field_H.a((byte) 107, var6.field_F.length, var6.field_F, (int)var6.field_t);
                          break L5;
                        } else {
                          if (var6.field_G == 3) {
                            var6.field_F = var6.field_H.a((int)var6.field_t, 3);
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                      }
                      break L4;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L6: {
                      var2_ref = (Exception) (Object) decompiledCaughtException;
                      gb.a((Throwable) (Object) var2_ref, (String) null, 10);
                      break L6;
                    }
                  }
                  var6.field_u = false;
                  continue L0;
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static nh[] a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9 = 0;
        nh[] var10 = null;
        nh[] var11_ref_nh__ = null;
        int var11 = 0;
        int var12 = 0;
        nh var13_ref_nh = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        var15 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var9 = 3;
        var10 = new nh[]{new nh(var9, var9), new nh(3, var9), new nh(var9, var9), new nh(var9, 3), new nh(64, 64), new nh(var9, 3), new nh(var9, var9), new nh(3, var9), new nh(var9, var9)};
        var11_ref_nh__ = var10;
        var12 = 0;
        L0: while (true) {
          if (var11_ref_nh__.length <= var12) {
            var11 = 0;
            L1: while (true) {
              if (var11 >= 1) {
                var11 = 0;
                L2: while (true) {
                  if (var11 >= 1) {
                    var11 = 0;
                    var12 = 0;
                    L3: while (true) {
                      if (var12 >= 3) {
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
                                var10[1].field_B[var11 + (-1 + var9 - var12) * 3] = 65793;
                                var10[3].field_B[var11 * var9 + -1 + (var9 + -var12)] = 65793;
                                var10[7].field_B[3 * var12 + var11] = 65793;
                                var10[5].field_B[var11 * var9 - -var12] = 65793;
                                var12++;
                                continue L5;
                              }
                            }
                          }
                        }
                      } else {
                        var13 = 0;
                        L6: while (true) {
                          if (1 <= var13) {
                            var12++;
                            continue L3;
                          } else {
                            var10[7].field_B[3 * (-1 + (-var13 + var9)) + var12] = 0;
                            var10[5].field_B[var12 * var9 - 1 - (-var9 - -var13)] = 0;
                            var10[1].field_B[3 * var13 - -var12] = 0;
                            var10[3].field_B[var13 + var12 * var9] = 0;
                            var13++;
                            continue L6;
                          }
                        }
                      }
                    }
                  } else {
                    var12 = 0;
                    L7: while (true) {
                      if (var12 >= var9) {
                        var11++;
                        continue L2;
                      } else {
                        L8: {
                          var10[0].field_B[var12 + var9 * var11] = 0;
                          var10[0].field_B[var12 * var9 - -var11] = 0;
                          if (-var11 + var9 <= var12) {
                            break L8;
                          } else {
                            var10[2].field_B[var12 + var9 * var11] = 0;
                            var10[6].field_B[var11 + var9 * var12] = 0;
                            break L8;
                          }
                        }
                        var12++;
                        continue L7;
                      }
                    }
                  }
                }
              } else {
                var12 = 0;
                L9: while (true) {
                  if (var12 >= var9) {
                    var11++;
                    continue L1;
                  } else {
                    var10[6].field_B[(-var11 + (var9 - 1)) * var9 + var12] = 0;
                    var10[8].field_B[(var9 - (var11 - -1)) * var9 + var12] = 0;
                    var10[2].field_B[-var11 + (var9 - 1 + var9 * var12)] = 0;
                    var10[8].field_B[var9 * var12 - 1 - (-var9 + var11)] = 0;
                    var12++;
                    continue L9;
                  }
                }
              }
            }
          } else {
            var13_ref_nh = var11_ref_nh__[var12];
            var14 = 0;
            L10: while (true) {
              if (~var13_ref_nh.field_B.length >= ~var14) {
                var12++;
                continue L0;
              } else {
                var13_ref_nh.field_B[var14] = 0;
                var14++;
                continue L10;
              }
            }
          }
        }
    }

    private final void a(bi param0, byte param1) {
        Object var3 = null;
        RuntimeException var3_ref = null;
        Throwable var4 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            var3 = (Object) (Object) ((n) this).field_b;
            synchronized (var3) {
              L1: {
                L2: {
                  if (param1 < -112) {
                    break L2;
                  } else {
                    bi discarded$3 = ((n) this).a(62, 59, (ik) null);
                    break L2;
                  }
                }
                ((n) this).field_b.a((uh) (Object) param0, 0);
                ((n) this).field_e = ((n) this).field_e + 1;
                ((Object) (Object) ((n) this).field_b).notifyAll();
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3_ref;
            stackOut_8_1 = new StringBuilder().append("n.G(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param1 + 41);
        }
    }

    final static boolean a() {
        return null != uj.field_j && tl.field_O == ik.field_d;
    }

    final bi a(ik param0, int param1, int param2) {
        bi var4 = null;
        RuntimeException var4_ref = null;
        bi stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        bi stackOut_2_0 = null;
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
              var4 = new bi();
              var4.field_H = param0;
              if (param2 == 7) {
                break L1;
              } else {
                field_g = null;
                break L1;
              }
            }
            var4.field_y = false;
            var4.field_t = (long)param1;
            var4.field_G = 3;
            this.a(var4, (byte) -117);
            stackOut_2_0 = (bi) var4;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4_ref;
            stackOut_4_1 = new StringBuilder().append("n.F(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_3_0;
    }

    public static void b() {
        field_g = null;
        field_h = null;
        field_f = null;
    }

    final bi a(int param0, int param1, ik param2) {
        bi var4 = null;
        RuntimeException var4_ref = null;
        Object var5 = null;
        bi var6 = null;
        Throwable var7 = null;
        int var8 = 0;
        bi stackIn_9_0 = null;
        bi stackIn_18_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        Throwable decompiledCaughtException = null;
        bi stackOut_8_0 = null;
        bi stackOut_17_0 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var8 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            var4 = new bi();
            var4.field_G = 1;
            var5 = (Object) (Object) ((n) this).field_b;
            synchronized (var5) {
              L1: {
                var6 = (bi) (Object) ((n) this).field_b.a(true);
                L2: while (true) {
                  if (var6 == null) {
                    break L1;
                  } else {
                    L3: {
                      if (~var6.field_t != ~(long)param1) {
                        break L3;
                      } else {
                        if (var6.field_H != param2) {
                          break L3;
                        } else {
                          if (var6.field_G == 2) {
                            var4.field_u = false;
                            var4.field_F = var6.field_F;
                            stackOut_8_0 = (bi) var4;
                            stackIn_9_0 = stackOut_8_0;
                            return stackIn_9_0;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    var6 = (bi) (Object) ((n) this).field_b.c(97);
                    continue L2;
                  }
                }
              }
            }
            L4: {
              var4.field_F = param2.a(param1, 3);
              var4.field_u = false;
              var4.field_y = true;
              if (param0 == 6) {
                break L4;
              } else {
                ((n) this).field_a = false;
                break L4;
              }
            }
            stackOut_17_0 = (bi) var4;
            stackIn_18_0 = stackOut_17_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var4_ref;
            stackOut_19_1 = new StringBuilder().append("n.A(").append(param0).append(44).append(param1).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param2 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L5;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L5;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 41);
        }
        return stackIn_18_0;
    }

    final static q a(int param0, bl param1) {
        java.awt.Frame var6 = null;
        RuntimeException var6_ref = null;
        q var7 = null;
        java.awt.Frame var8 = null;
        q stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        q stackOut_3_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            int discarded$8 = 480;
            int discarded$9 = 640;
            int discarded$10 = 0;
            var8 = nj.a(0, 0, param1);
            var6 = var8;
            if (var8 != null) {
              var7 = new q();
              var7.field_a = var8;
              java.awt.Component discarded$11 = var7.field_a.add((java.awt.Component) (Object) var7);
              var7.setBounds(0, 0, 640, 480);
              var7.addFocusListener((java.awt.event.FocusListener) (Object) var7);
              var7.requestFocus();
              stackOut_3_0 = (q) var7;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var6_ref;
            stackOut_5_1 = new StringBuilder().append("n.C(").append(0).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + 640 + 44 + 9764 + 44 + 480 + 44 + 0 + 41);
        }
        return stackIn_4_0;
    }

    final bi a(int param0, ik param1, byte[] param2, int param3) {
        bi var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        bi stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        bi stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var5 = new bi();
            var5.field_t = (long)param0;
            var6 = -73 % ((-42 - param3) / 51);
            var5.field_H = param1;
            var5.field_y = false;
            var5.field_F = param2;
            var5.field_G = 2;
            this.a(var5, (byte) -124);
            stackOut_0_0 = (bi) var5;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var5_ref;
            stackOut_2_1 = new StringBuilder().append("n.D(").append(param0).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param3 + 41);
        }
        return stackIn_1_0;
    }

    final void a(byte param0) {
        InterruptedException interruptedException = null;
        Object var2 = null;
        int var3 = 0;
        Throwable var4 = null;
        Throwable decompiledCaughtException = null;
        ((n) this).field_a = true;
        var2 = (Object) (Object) ((n) this).field_b;
        synchronized (var2) {
          L0: {
            var3 = -87 / ((param0 - -9) / 47);
            ((Object) (Object) ((n) this).field_b).notifyAll();
            break L0;
          }
        }
        try {
          L1: {
            ((n) this).field_d.join();
            break L1;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            interruptedException = (InterruptedException) (Object) decompiledCaughtException;
            break L2;
          }
        }
        ((n) this).field_d = null;
    }

    n(bl param0) {
        il var2 = null;
        ((n) this).field_b = new hl();
        ((n) this).field_a = false;
        ((n) this).field_e = 0;
        try {
            var2 = param0.a((Runnable) this, 5, (byte) 127);
            while (var2.field_b == 0) {
                kk.a(10L, true);
            }
            if (var2.field_b == 2) {
                throw new RuntimeException();
            }
            ((n) this).field_d = (Thread) var2.field_g;
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) (Object) runtimeException, "n.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Medium";
    }
}
