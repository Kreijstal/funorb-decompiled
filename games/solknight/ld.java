/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ld extends kf {
    static int[] field_M;
    static String field_O;
    private int field_R;
    private int field_P;
    private int field_N;
    private int field_Q;
    private int field_L;
    private int field_K;

    ld(i param0, int param1, int param2) {
        super(param0, param1, param2);
        ((ld) this).field_P = 0;
        ((ld) this).field_L = 0;
    }

    final void b(int param0, int param1, int param2, int param3) {
        if (0 >= param2) {
            ((ld) this).b(param3, -2038584927, param0);
            return;
        }
        ((ld) this).field_L = param2;
        ((ld) this).field_K = ((ld) this).field_x;
        ((ld) this).field_N = param0;
        ((ld) this).field_Q = ((ld) this).field_t;
        ((ld) this).field_R = param3;
        ((ld) this).field_P = param1;
    }

    final static lf j(int param0) {
        try {
            Throwable var1 = null;
            lf stackIn_3_0 = null;
            Throwable decompiledCaughtException = null;
            lf stackOut_2_0 = null;
            L0: {
              if (param0 == 0) {
                break L0;
              } else {
                ld.c(-118, -71, 91);
                break L0;
              }
            }
            try {
              L1: {
                stackOut_2_0 = (lf) Class.forName("sc").newInstance();
                stackIn_3_0 = stackOut_2_0;
                break L1;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = decompiledCaughtException;
              return null;
            }
            return stackIn_3_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void k(int param0) {
        field_O = null;
        field_M = null;
        int var1 = -1;
    }

    void a(int param0, byte param1, int param2) {
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
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        var17 = SolKnight.field_L ? 1 : 0;
        mi.e(param0 + 6, 35 + param2, -12 + ((ld) this).field_t, ((ld) this).field_x + -40, 2105376, 0);
        var5 = 211;
        var6 = -45 % ((param1 - -55) / 39);
        var4 = 35;
        var7 = 194;
        var8 = 0;
        var9 = param2;
        L0: while (true) {
          if (~var8 <= ~var4) {
            var5 = 194;
            var4 = 22;
            var7 = 169;
            var8 = 0;
            var9 = param2 + 35;
            L1: while (true) {
              if (~var4 >= ~var8) {
                fa.field_b.d(param0 - (-((ld) this).field_t - -90), param2 - -10);
                je.a(fi.field_a, 5 + param0, param2 + 35, ((ld) this).field_t + -10, (byte) 93);
                je.a(qk.field_l, param0, -22 + (((ld) this).field_x + param2), ((ld) this).field_t, (byte) 114);
                var7 = 127;
                var4 = -79 + ((ld) this).field_x;
                var5 = 169;
                var8 = 0;
                var9 = param2 + 57;
                L2: while (true) {
                  if (var4 <= var8) {
                    return;
                  } else {
                    var10 = var5 + var8 * (-var5 + var7) / var4;
                    var10 = var10 | (var10 << 8 | var10 << 16);
                    mi.b(param0, var9, 6, var10);
                    mi.b(-6 + (((ld) this).field_t + param0), var9, 6, var10);
                    var8++;
                    var9++;
                    continue L2;
                  }
                }
              } else {
                var10 = var5 + (-var5 + var7) * var8 / var4;
                var10 = var10 | (var10 << 8 | var10 << 16);
                mi.b(param0, var9, 6, var10);
                mi.b(-6 + (((ld) this).field_t + param0), var9, 6, var10);
                var9++;
                var8++;
                continue L1;
              }
            }
          } else {
            L3: {
              if (~mi.field_l < ~var9) {
                break L3;
              } else {
                if (var9 < mi.field_e) {
                  L4: {
                    var10 = (-var5 + var7) * var8 / var4 + var5;
                    var11 = 0;
                    var12 = ((ld) this).field_t;
                    if (var8 <= 20) {
                      L5: while (true) {
                        if (20 < var11) {
                          break L4;
                        } else {
                          L6: {
                            var13 = (20 - var8) * (-var8 + 20) - -((20 - var11) * (20 - var11));
                            if (var13 > 462) {
                              break L6;
                            } else {
                              if (var13 < 420) {
                                break L4;
                              } else {
                                var14 = (462 + -var13) * var10 / 42;
                                var14 = var14 | (var14 << 8 | var14 << 16);
                                mi.field_f[var11 + (param0 + var9 * mi.field_a)] = var14;
                                break L6;
                              }
                            }
                          }
                          var11++;
                          continue L5;
                        }
                      }
                    } else {
                      break L4;
                    }
                  }
                  L7: {
                    if (var8 <= 20) {
                      var13 = var12;
                      var12 -= 21;
                      var14 = 0;
                      L8: while (true) {
                        L9: {
                          if (var14 > 20) {
                            break L9;
                          } else {
                            var15 = var14 * var14 + (-var8 + 20) * (20 + -var8);
                            if (var15 > 462) {
                              break L9;
                            } else {
                              L10: {
                                if (var15 >= 420) {
                                  var16 = var10 * (-var15 + 462) / 42;
                                  var16 = var16 | (var16 << 16 | var16 << 8);
                                  mi.field_f[var12 + var9 * mi.field_a - -param0] = var16;
                                  break L10;
                                } else {
                                  var13 = 1 + var12;
                                  break L10;
                                }
                              }
                              var12++;
                              var14++;
                              continue L8;
                            }
                          }
                        }
                        var12 = var13;
                        break L7;
                      }
                    } else {
                      break L7;
                    }
                  }
                  var10 = var10 | (var10 << 16 | var10 << 8);
                  mi.b(var11 - -param0, var9, -var11 + var12, var10);
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            var9++;
            var8++;
            continue L0;
          }
        }
    }

    boolean h(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        if (param0 != 1784) {
            ((ld) this).field_K = 81;
        }
        if (((ld) this).field_L <= 0) {
        } else {
            var2 = ((ld) this).field_R;
            var3 = ((ld) this).field_N;
            int fieldTemp$0 = ((ld) this).field_P + 1;
            ((ld) this).field_P = ((ld) this).field_P + 1;
            if (fieldTemp$0 >= ((ld) this).field_L) {
                ((ld) this).field_L = 0;
                ((ld) this).l(7107);
            } else {
                var4 = ((ld) this).field_P * (-((ld) this).field_P + 2 * ((ld) this).field_L);
                var5 = ((ld) this).field_L * ((ld) this).field_L;
                var3 = var4 * (-((ld) this).field_K + ((ld) this).field_N) / var5 + ((ld) this).field_K;
                var2 = ((ld) this).field_Q + var4 * (-((ld) this).field_Q + ((ld) this).field_R) / var5;
            }
            ((ld) this).b(var2, -2038584927, var3);
        }
        return super.h(param0);
    }

    final static void c(int param0, int param1, int param2) {
        L0: {
          L1: {
            if (null == vg.field_I) {
              break L1;
            } else {
              if (param1 > vg.field_I.length) {
                break L1;
              } else {
                break L0;
              }
            }
          }
          vg.field_I = new int[2 * param1];
          break L0;
        }
        L2: {
          L3: {
            if (qg.field_c == null) {
              break L3;
            } else {
              if (param1 <= qg.field_c.length) {
                break L2;
              } else {
                break L3;
              }
            }
          }
          qg.field_c = new int[2 * param1];
          break L2;
        }
        L4: {
          L5: {
            if (null == eh.field_a) {
              break L5;
            } else {
              if (param1 > eh.field_a.length) {
                break L5;
              } else {
                break L4;
              }
            }
          }
          eh.field_a = new int[param1 * 2];
          break L4;
        }
        L6: {
          L7: {
            if (field_M == null) {
              break L7;
            } else {
              if (param1 > field_M.length) {
                break L7;
              } else {
                break L6;
              }
            }
          }
          field_M = new int[param1 * 2];
          break L6;
        }
        L8: {
          L9: {
            if (null == ma.field_n) {
              break L9;
            } else {
              if (ma.field_n.length >= param1) {
                break L8;
              } else {
                break L9;
              }
            }
          }
          ma.field_n = new int[param1 * 2];
          break L8;
        }
        L10: {
          L11: {
            if (null == l.field_a) {
              break L11;
            } else {
              if (l.field_a.length < param1) {
                break L11;
              } else {
                break L10;
              }
            }
          }
          l.field_a = new int[param1 * 2];
          break L10;
        }
        L12: {
          L13: {
            if (null == pd.field_e) {
              break L13;
            } else {
              if (param0 + param1 <= pd.field_e.length) {
                break L12;
              } else {
                break L13;
              }
            }
          }
          pd.field_e = new int[(param0 + param1) * 2];
          break L12;
        }
        L14: {
          L15: {
            if (null == vc.field_a) {
              break L15;
            } else {
              if (param1 > vc.field_a.length) {
                break L15;
              } else {
                break L14;
              }
            }
          }
          vc.field_a = new boolean[2 * param1];
          break L14;
        }
        bb.field_G = 2147483647;
        if (param2 == 42) {
          dc.field_o = -2147483648;
          be.field_I = -2147483648;
          kg.field_c = 0;
          bi.field_e = 2147483647;
          return;
        } else {
          return;
        }
    }

    void e(boolean param0) {
        if (!param0) {
            lf discarded$0 = ld.j(31);
        }
        if (((ld) this).field_L <= 0) {
            return;
        }
        ((ld) this).b(((ld) this).field_R, -2038584927, ((ld) this).field_N);
        ((ld) this).field_L = 0;
        ((ld) this).l(7107);
    }

    boolean e(byte param0) {
        if (param0 != 124) {
            boolean discarded$0 = ((ld) this).e((byte) 24);
        }
        ((ld) this).e(true);
        return super.e((byte) 124);
    }

    void l(int param0) {
        if (param0 != 7107) {
            ((ld) this).field_L = -126;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_O = "Password: ";
    }
}
