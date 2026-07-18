/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qb extends gn implements dm {
    static el field_N;
    static String field_K;
    private ae field_M;
    private ae field_O;
    private ae field_L;

    final static boolean a(int param0, byte param1) {
        if (param1 != 114) {
            qb.a(false);
        }
        return 0 <= param0 ? true : false;
    }

    public final void a(byte param0, ae param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var7 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              if (param0 <= 0) {
                break L1;
              } else {
                ((qb) this).a(-118, -114, -30, -7);
                break L1;
              }
            }
            L2: {
              if (param1 != ((qb) this).field_M) {
                if (param1 == ((qb) this).field_L) {
                  wk.b(108);
                  break L2;
                } else {
                  if (param1 == ((qb) this).field_O) {
                    vg.i(5959);
                    break L2;
                  } else {
                    break L2;
                  }
                }
              } else {
                fi.t(11);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var6;
            stackOut_11_1 = new StringBuilder().append("qb.M(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = ((qb) this).field_t - -param1;
        int var6 = ((qb) this).field_w - -param2;
        int discarded$0 = od.field_S.a(we.field_m, 20 + var5, 20 + var6, -40 + ((qb) this).field_F, -50 + ((qb) this).field_u, 16777215, -1, 1, 0, od.field_S.field_N);
        super.a(param0, param1, param2, param3);
    }

    public static void a(int param0) {
        if (param0 <= 54) {
            qb.a(-48);
        }
        field_N = null;
        field_K = null;
    }

    final static void a(boolean param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        var1 = (Object) (Object) kd.field_g;
        synchronized (var1) {
          L0: {
            ho.field_X = kf.field_c;
            ea.field_a = ea.field_a + 1;
            aa.field_Nb = nl.field_d;
            a.field_a = va.field_y;
            qd.field_T = tl.field_M;
            tl.field_M = false;
            tm.field_t = tg.field_f;
            ci.field_B = qc.field_Z;
            li.field_o = qm.field_c;
            tg.field_f = 0;
            break L0;
          }
        }
    }

    public qb() {
        super(0, 0, 476, 225, (kg) null);
        ((qb) this).field_L = new ae(jm.field_f, (dn) null);
        ((qb) this).field_M = new ae(bg.field_n, (dn) null);
        ((qb) this).field_O = new ae(pi.field_d, (dn) null);
        uj var1 = new uj();
        ((qb) this).field_L.field_H = (kg) (Object) var1;
        ((qb) this).field_M.field_H = (kg) (Object) var1;
        ((qb) this).field_O.field_H = (kg) (Object) var1;
        int var2 = 4;
        int var3 = 326;
        int var4 = var3 - var2 >> 1;
        ((qb) this).field_M.a(30, -var2 + (((qb) this).field_u - 48), -125, ((qb) this).field_F - var3 >> 1, var4);
        ((qb) this).field_O.a(30, -48 + (((qb) this).field_u - var2), -119, var2 + (-var3 + ((qb) this).field_F >> 1) + var4, var4);
        ((qb) this).field_L.a(30, -(2 * var2) + (-78 + ((qb) this).field_u), -9, -var3 + ((qb) this).field_F >> 1, var3);
        ((qb) this).field_M.field_s = (dn) this;
        ((qb) this).field_L.field_s = (dn) this;
        ((qb) this).field_L.field_C = vc.field_e;
        ((qb) this).field_O.field_s = (dn) this;
        ((qb) this).field_O.field_C = rk.field_a;
        ((qb) this).c((na) (Object) ((qb) this).field_M, 10);
        ((qb) this).c((na) (Object) ((qb) this).field_L, 10);
        ((qb) this).c((na) (Object) ((qb) this).field_O, 10);
    }

    final static byte[] a(byte[] param0, byte param1, int param2, int param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        int var5_int = 0;
        li var5 = null;
        byte[] var6 = null;
        int var7 = 0;
        byte[] var8 = null;
        byte[] stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_7_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var7 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              if (param3 <= 0) {
                var4 = param0;
                break L1;
              } else {
                var8 = new byte[param2];
                var4 = var8;
                var5_int = 0;
                L2: while (true) {
                  if (var5_int >= param2) {
                    break L1;
                  } else {
                    var8[var5_int] = param0[var5_int + param3];
                    var5_int++;
                    continue L2;
                  }
                }
              }
            }
            var5 = new li();
            var5.a(false);
            var5.a(var4, (long)(8 * param2), true);
            var6 = new byte[64];
            var5.a(var6, 0, -58);
            stackOut_7_0 = (byte[]) var6;
            stackIn_8_0 = stackOut_7_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var4_ref;
            stackOut_9_1 = new StringBuilder().append("qb.D(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + -89 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_8_0;
    }

    final static int a(boolean param0, CharSequence param1, byte param2, int param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_39_0 = 0;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_38_0 = 0;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        var11 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              if (2 > param3) {
                break L1;
              } else {
                if (36 >= param3) {
                  L2: {
                    var4_int = 0;
                    var5 = 0;
                    var6 = 0;
                    var7 = param1.length();
                    if (param2 < -51) {
                      break L2;
                    } else {
                      qb.a(-91);
                      break L2;
                    }
                  }
                  var8 = 0;
                  L3: while (true) {
                    if (var8 >= var7) {
                      if (var5 != 0) {
                        stackOut_38_0 = var6;
                        stackIn_39_0 = stackOut_38_0;
                        break L0;
                      } else {
                        throw new NumberFormatException();
                      }
                    } else {
                      L4: {
                        L5: {
                          var9 = param1.charAt(var8);
                          if (var8 != 0) {
                            break L5;
                          } else {
                            if (var9 == 45) {
                              var4_int = 1;
                              break L4;
                            } else {
                              if (43 != var9) {
                                break L5;
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                        L6: {
                          L7: {
                            if (var9 < 48) {
                              break L7;
                            } else {
                              if (var9 <= 57) {
                                var9 -= 48;
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                          L8: {
                            if (var9 < 65) {
                              break L8;
                            } else {
                              if (var9 <= 90) {
                                var9 -= 55;
                                break L6;
                              } else {
                                break L8;
                              }
                            }
                          }
                          L9: {
                            if (var9 < 97) {
                              break L9;
                            } else {
                              if (var9 > 122) {
                                break L9;
                              } else {
                                var9 -= 87;
                                break L6;
                              }
                            }
                          }
                          throw new NumberFormatException();
                        }
                        if (var9 < param3) {
                          L10: {
                            if (var4_int == 0) {
                              break L10;
                            } else {
                              var9 = -var9;
                              break L10;
                            }
                          }
                          var10 = var9 + param3 * var6;
                          if (var10 / param3 != var6) {
                            throw new NumberFormatException();
                          } else {
                            var5 = 1;
                            var6 = var10;
                            break L4;
                          }
                        } else {
                          throw new NumberFormatException();
                        }
                      }
                      var8++;
                      continue L3;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            throw new IllegalArgumentException("" + param3);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var4 = decompiledCaughtException;
            stackOut_40_0 = (RuntimeException) var4;
            stackOut_40_1 = new StringBuilder().append("qb.E(").append(true).append(',');
            stackIn_42_0 = stackOut_40_0;
            stackIn_42_1 = stackOut_40_1;
            stackIn_41_0 = stackOut_40_0;
            stackIn_41_1 = stackOut_40_1;
            if (param1 == null) {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "null";
              stackIn_43_0 = stackOut_42_0;
              stackIn_43_1 = stackOut_42_1;
              stackIn_43_2 = stackOut_42_2;
              break L11;
            } else {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "{...}";
              stackIn_43_0 = stackOut_41_0;
              stackIn_43_1 = stackOut_41_1;
              stackIn_43_2 = stackOut_41_2;
              break L11;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_43_0, stackIn_43_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_39_0;
    }

    final boolean a(int param0, char param1, int param2, na param3) {
        RuntimeException var5 = null;
        int stackIn_4_0 = 0;
        boolean stackIn_8_0 = false;
        boolean stackIn_11_0 = false;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_7_0 = false;
        int stackOut_12_0 = 0;
        boolean stackOut_10_0 = false;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            L1: {
              if (param2 == 1) {
                break L1;
              } else {
                boolean discarded$2 = qb.a(-72, (byte) -52);
                break L1;
              }
            }
            if (!super.a(param0, param1, param2, param3)) {
              if (param0 == 98) {
                stackOut_7_0 = ((qb) this).d(param3, -102);
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0;
              } else {
                if (param0 != 99) {
                  stackOut_12_0 = 0;
                  stackIn_13_0 = stackOut_12_0;
                  break L0;
                } else {
                  stackOut_10_0 = ((qb) this).b(param3, param2 + 114);
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0;
                }
              }
            } else {
              stackOut_3_0 = 1;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var5;
            stackOut_14_1 = new StringBuilder().append("qb.DB(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param3 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L2;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L2;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
        return stackIn_13_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_K = "Return to Main Menu";
    }
}
