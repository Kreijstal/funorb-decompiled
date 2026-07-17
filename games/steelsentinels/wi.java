/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class wi extends kd {
    int field_z;
    static int field_y;
    int field_B;
    static gk[] field_C;
    static String field_G;
    int field_D;
    int field_F;
    int field_H;
    int field_A;

    public static void g(int param0) {
        field_C = null;
        if (param0 != 573) {
            return;
        }
        try {
            field_G = null;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "wi.D(" + param0 + 41);
        }
    }

    final static void a(int param0, pe param1, int param2, boolean param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
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
        boolean stackIn_12_0 = false;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_26_2 = 0;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        int stackIn_45_0 = 0;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_62_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_11_0 = false;
        int stackOut_22_0 = 0;
        int stackOut_22_1 = 0;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        int stackOut_25_2 = 0;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        int stackOut_23_2 = 0;
        int stackOut_28_0 = 0;
        int stackOut_28_1 = 0;
        int stackOut_35_0 = 0;
        int stackOut_35_1 = 0;
        int stackOut_44_0 = 0;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        String stackOut_61_2 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        String stackOut_59_2 = null;
        var19 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              var5_int = ve.a(-122, (param0 + -param2) * 3);
              var6 = param2 * 3;
              kk.b((byte) 34);
              var7 = var5_int + -10;
              if (param1.field_K <= 0) {
                break L1;
              } else {
                if (null == param1.field_P) {
                  break L1;
                } else {
                  fb.b(0);
                  break L1;
                }
              }
            }
            if (param4 == 2147483647) {
              wl.field_D = 0;
              var8 = 0;
              L2: while (true) {
                L3: {
                  L4: {
                    if (~var8 <= ~param1.field_w) {
                      break L4;
                    } else {
                      var9 = param1.field_G[var8];
                      var10 = param1.field_j[var8];
                      var11 = param1.field_x[var8];
                      stackOut_11_0 = param3;
                      stackIn_45_0 = stackOut_11_0 ? 1 : 0;
                      stackIn_12_0 = stackOut_11_0;
                      if (var19 != 0) {
                        break L3;
                      } else {
                        L5: {
                          L6: {
                            if (!stackIn_12_0) {
                              break L6;
                            } else {
                              var12 = eh.field_d[var9];
                              var13 = n.field_p[var9];
                              var14 = eh.field_d[var10] - var12;
                              var15 = eh.field_d[var11] - var12;
                              var16 = -var13 + n.field_p[var10];
                              var17 = n.field_p[var11] + -var13;
                              if (var14 * var17 - var16 * var15 >= 0) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          var12 = km.field_h[var9];
                          if (-2147483648 == var12) {
                            break L5;
                          } else {
                            var13 = km.field_h[var10];
                            if (var13 == -2147483648) {
                              break L5;
                            } else {
                              L7: {
                                var14 = km.field_h[var11];
                                if (var14 != -2147483648) {
                                  break L7;
                                } else {
                                  if (var19 == 0) {
                                    break L5;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                              L8: {
                                var15 = -var6 + (var13 + var12) - -var14;
                                stackOut_22_0 = -1;
                                stackOut_22_1 = ck.field_c.length;
                                stackIn_25_0 = stackOut_22_0;
                                stackIn_25_1 = stackOut_22_1;
                                stackIn_23_0 = stackOut_22_0;
                                stackIn_23_1 = stackOut_22_1;
                                if (var7 >= 0) {
                                  stackOut_25_0 = stackIn_25_0;
                                  stackOut_25_1 = stackIn_25_1;
                                  stackOut_25_2 = var15 >> var7;
                                  stackIn_26_0 = stackOut_25_0;
                                  stackIn_26_1 = stackOut_25_1;
                                  stackIn_26_2 = stackOut_25_2;
                                  break L8;
                                } else {
                                  stackOut_23_0 = stackIn_23_0;
                                  stackOut_23_1 = stackIn_23_1;
                                  stackOut_23_2 = var15 << -var7;
                                  stackIn_26_0 = stackOut_23_0;
                                  stackIn_26_1 = stackOut_23_1;
                                  stackIn_26_2 = stackOut_23_2;
                                  break L8;
                                }
                              }
                              var16 = stackIn_26_0 + (stackIn_26_1 - stackIn_26_2);
                              var17 = ck.field_c[var16];
                              L9: while (true) {
                                L10: {
                                  L11: {
                                    if (0 == var17 >> 4) {
                                      break L11;
                                    } else {
                                      var16--;
                                      stackOut_28_0 = -1;
                                      stackOut_28_1 = ~var16;
                                      stackIn_36_0 = stackOut_28_0;
                                      stackIn_36_1 = stackOut_28_1;
                                      stackIn_29_0 = stackOut_28_0;
                                      stackIn_29_1 = stackOut_28_1;
                                      if (var19 != 0) {
                                        break L10;
                                      } else {
                                        L12: {
                                          if (stackIn_29_0 < stackIn_29_1) {
                                            System.err.println("Out of range!");
                                            if (var19 == 0) {
                                              break L5;
                                            } else {
                                              break L12;
                                            }
                                          } else {
                                            break L12;
                                          }
                                        }
                                        var17 = ck.field_c[var16];
                                        if (var19 == 0) {
                                          continue L9;
                                        } else {
                                          break L11;
                                        }
                                      }
                                    }
                                  }
                                  stackOut_35_0 = var16 << 4;
                                  stackOut_35_1 = var17;
                                  stackIn_36_0 = stackOut_35_0;
                                  stackIn_36_1 = stackOut_35_1;
                                  break L10;
                                }
                                L13: {
                                  var18 = stackIn_36_0 + stackIn_36_1;
                                  um.field_bb[var18] = var8;
                                  ck.field_c[var16] = var17 - -1;
                                  if (param1.field_K <= 0) {
                                    break L13;
                                  } else {
                                    if (null == param1.field_P) {
                                      break L13;
                                    } else {
                                      qe.field_a[param1.field_P[var8]] = qe.field_a[param1.field_P[var8]] + 1;
                                      break L13;
                                    }
                                  }
                                }
                                wl.field_D = wl.field_D + 1;
                                break L5;
                              }
                            }
                          }
                        }
                        var8++;
                        if (var19 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  stackOut_44_0 = ~param1.field_K;
                  stackIn_45_0 = stackOut_44_0;
                  break L3;
                }
                L14: {
                  L15: {
                    if (stackIn_45_0 >= -1) {
                      break L15;
                    } else {
                      if (null != param1.field_P) {
                        var8 = 0;
                        var9 = 0;
                        L16: while (true) {
                          if (qe.field_a.length <= var9) {
                            break L15;
                          } else {
                            var10 = qe.field_a[var9];
                            qe.field_a[var9] = var8;
                            var8 = var8 + var10;
                            var9++;
                            if (var19 != 0) {
                              break L14;
                            } else {
                              if (var19 == 0) {
                                continue L16;
                              } else {
                                break L15;
                              }
                            }
                          }
                        }
                      } else {
                        break L15;
                      }
                    }
                  }
                  break L14;
                }
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var5 = decompiledCaughtException;
            stackOut_58_0 = (RuntimeException) var5;
            stackOut_58_1 = new StringBuilder().append("wi.B(").append(param0).append(44);
            stackIn_61_0 = stackOut_58_0;
            stackIn_61_1 = stackOut_58_1;
            stackIn_59_0 = stackOut_58_0;
            stackIn_59_1 = stackOut_58_1;
            if (param1 == null) {
              stackOut_61_0 = (RuntimeException) (Object) stackIn_61_0;
              stackOut_61_1 = (StringBuilder) (Object) stackIn_61_1;
              stackOut_61_2 = "null";
              stackIn_62_0 = stackOut_61_0;
              stackIn_62_1 = stackOut_61_1;
              stackIn_62_2 = stackOut_61_2;
              break L17;
            } else {
              stackOut_59_0 = (RuntimeException) (Object) stackIn_59_0;
              stackOut_59_1 = (StringBuilder) (Object) stackIn_59_1;
              stackOut_59_2 = "{...}";
              stackIn_62_0 = stackOut_59_0;
              stackIn_62_1 = stackOut_59_1;
              stackIn_62_2 = stackOut_59_2;
              break L17;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_62_0, stackIn_62_2 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final static ah a(String param0, byte param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        ah var3 = null;
        String var4 = null;
        int var5 = 0;
        Object stackIn_9_0 = null;
        Object stackIn_12_0 = null;
        Object stackIn_15_0 = null;
        ah stackIn_20_0 = null;
        Object stackIn_23_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        ah stackOut_19_0 = null;
        Object stackOut_22_0 = null;
        Object stackOut_14_0 = null;
        Object stackOut_11_0 = null;
        Object stackOut_8_0 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var5 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (null == pi.field_a) {
                break L1;
              } else {
                if (param0 == null) {
                  break L1;
                } else {
                  if (param0.length() != 0) {
                    var2 = ui.a(1, (CharSequence) (Object) param0);
                    if (var2 != null) {
                      if (param1 >= 112) {
                        var3 = (ah) (Object) pi.field_a.a((long)var2.hashCode(), (byte) 93);
                        L2: while (true) {
                          L3: {
                            if (null == var3) {
                              break L3;
                            } else {
                              var4 = ui.a(1, (CharSequence) (Object) var3.field_dc);
                              if (!var4.equals((Object) (Object) var2)) {
                                var3 = (ah) (Object) pi.field_a.c((byte) 121);
                                if (var5 == 0) {
                                  continue L2;
                                } else {
                                  break L3;
                                }
                              } else {
                                stackOut_19_0 = (ah) var3;
                                stackIn_20_0 = stackOut_19_0;
                                return stackIn_20_0;
                              }
                            }
                          }
                          stackOut_22_0 = null;
                          stackIn_23_0 = stackOut_22_0;
                          break L0;
                        }
                      } else {
                        stackOut_14_0 = null;
                        stackIn_15_0 = stackOut_14_0;
                        return (ah) (Object) stackIn_15_0;
                      }
                    } else {
                      stackOut_11_0 = null;
                      stackIn_12_0 = stackOut_11_0;
                      return (ah) (Object) stackIn_12_0;
                    }
                  } else {
                    break L1;
                  }
                }
              }
            }
            stackOut_8_0 = null;
            stackIn_9_0 = stackOut_8_0;
            return (ah) (Object) stackIn_9_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2_ref = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var2_ref;
            stackOut_24_1 = new StringBuilder().append("wi.C(");
            stackIn_27_0 = stackOut_24_0;
            stackIn_27_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param0 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L4;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_28_0 = stackOut_25_0;
              stackIn_28_1 = stackOut_25_1;
              stackIn_28_2 = stackOut_25_2;
              break L4;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + 44 + param1 + 41);
        }
        return (ah) (Object) stackIn_23_0;
    }

    final static void c(byte param0) {
        try {
            sl.field_m = mm.a(95);
            sb.field_Z = 0;
            if (param0 > -104) {
                field_y = -62;
            }
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "wi.A(" + param0 + 41);
        }
    }

    wi() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = "There are no valid types of game that match your preferences.";
    }
}
