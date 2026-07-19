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
        this.field_P = 0;
        this.field_L = 0;
    }

    final void b(int param0, int param1, int param2, int param3) {
        if (0 >= param2) {
            this.b(param3, -2038584927, param0);
            return;
        }
        this.field_L = param2;
        this.field_K = this.field_x;
        this.field_N = param0;
        this.field_Q = this.field_t;
        this.field_R = param3;
        this.field_P = param1;
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
                stackOut_2_0 = (lf) (Class.forName("sc").newInstance());
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
        int var1 = -31 % ((-28 - param0) / 50);
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
        mi.e(param0 + 6, 35 + param2, -12 + this.field_t, this.field_x + -40, 2105376, 0);
        var5 = 211;
        var6 = -45 % ((param1 - -55) / 39);
        var4 = 35;
        var7 = 194;
        var8 = 0;
        var9 = param2;
        L0: while (true) {
          if (var8 >= var4) {
            var5 = 194;
            var4 = 22;
            var7 = 169;
            var8 = 0;
            var9 = param2 + 35;
            L1: while (true) {
              if (var4 <= var8) {
                fa.field_b.d(param0 - (-this.field_t - -90), param2 - -10);
                je.a(fi.field_a, 5 + param0, param2 + 35, this.field_t + -10, (byte) 93);
                je.a(qk.field_l, param0, -22 + (this.field_x + param2), this.field_t, (byte) 114);
                var7 = 127;
                var4 = -79 + this.field_x;
                var5 = 169;
                var8 = 0;
                var9 = param2 + 57;
                L2: while (true) {
                  if (var4 <= var8) {
                    return;
                  } else {
                    var10 = var5 + var8 * (-var5 + var7) / var4;
                    var10 = var10 | (var10 << 1228593160 | var10 << -823846544);
                    mi.b(param0, var9, 6, var10);
                    mi.b(-6 + (this.field_t + param0), var9, 6, var10);
                    var8++;
                    var9++;
                    continue L2;
                  }
                }
              } else {
                var10 = var5 + (-var5 + var7) * var8 / var4;
                var10 = var10 | (var10 << -1917465080 | var10 << -1506965200);
                mi.b(param0, var9, 6, var10);
                mi.b(-6 + (this.field_t + param0), var9, 6, var10);
                var9++;
                var8++;
                continue L1;
              }
            }
          } else {
            if (mi.field_l <= var9) {
              if (var9 < mi.field_e) {
                L3: {
                  var10 = (-var5 + var7) * var8 / var4 + var5;
                  var11 = 0;
                  var12 = this.field_t;
                  if ((var8 ^ -1) >= -21) {
                    L4: while (true) {
                      if (20 < var11) {
                        break L3;
                      } else {
                        var13 = (20 - var8) * (-var8 + 20) - -((20 - var11) * (20 - var11));
                        if ((var13 ^ -1) >= -463) {
                          if (-421 < (var13 ^ -1)) {
                            break L3;
                          } else {
                            var14 = (462 + -var13) * var10 / 42;
                            var14 = var14 | (var14 << -295194680 | var14 << 53559472);
                            mi.field_f[var11 + (param0 + var9 * mi.field_a)] = var14;
                            var11++;
                            continue L4;
                          }
                        } else {
                          var11++;
                          continue L4;
                        }
                      }
                    }
                  } else {
                    break L3;
                  }
                }
                L5: {
                  if (-21 <= (var8 ^ -1)) {
                    var13 = var12;
                    var12 -= 21;
                    var14 = 0;
                    L6: while (true) {
                      L7: {
                        if (-21 > (var14 ^ -1)) {
                          break L7;
                        } else {
                          var15 = var14 * var14 + (-var8 + 20) * (20 + -var8);
                          if (var15 > 462) {
                            break L7;
                          } else {
                            if (var15 >= 420) {
                              var16 = var10 * (-var15 + 462) / 42;
                              var16 = var16 | (var16 << 1073162736 | var16 << 905512680);
                              mi.field_f[var12 + var9 * mi.field_a - -param0] = var16;
                              var12++;
                              var14++;
                              continue L6;
                            } else {
                              var13 = 1 + var12;
                              var12++;
                              var14++;
                              continue L6;
                            }
                          }
                        }
                      }
                      var12 = var13;
                      break L5;
                    }
                  } else {
                    break L5;
                  }
                }
                var10 = var10 | (var10 << 1760559280 | var10 << -1621305656);
                mi.b(var11 - -param0, var9, -var11 + var12, var10);
                var9++;
                var8++;
                continue L0;
              } else {
                var9++;
                var8++;
                continue L0;
              }
            } else {
              var9++;
              var8++;
              continue L0;
            }
          }
        }
    }

    boolean h(int param0) {
        int var2 = 0;
        int var3 = 0;
        int fieldTemp$0 = 0;
        int var4 = 0;
        int var5 = 0;
        if (param0 != 1784) {
            this.field_K = 81;
        }
        if (this.field_L <= 0) {
        } else {
            var2 = this.field_R;
            var3 = this.field_N;
            fieldTemp$0 = this.field_P + 1;
            this.field_P = this.field_P + 1;
            if (fieldTemp$0 >= this.field_L) {
                this.field_L = 0;
                this.l(7107);
            } else {
                var4 = this.field_P * (-this.field_P + 2 * this.field_L);
                var5 = this.field_L * this.field_L;
                var3 = var4 * (-this.field_K + this.field_N) / var5 + this.field_K;
                var2 = this.field_Q + var4 * (-this.field_Q + this.field_R) / var5;
            }
            this.b(var2, -2038584927, var3);
        }
        return super.h(param0 + 0);
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
        lf discarded$0 = null;
        if (!param0) {
            discarded$0 = ld.j(31);
        }
        if (-1 <= (this.field_L ^ -1)) {
            return;
        }
        this.b(this.field_R, -2038584927, this.field_N);
        this.field_L = 0;
        this.l(7107);
    }

    boolean e(byte param0) {
        boolean discarded$0 = false;
        if (param0 != 124) {
            discarded$0 = this.e((byte) 24);
        }
        this.e(true);
        return super.e((byte) 124);
    }

    void l(int param0) {
        if (param0 != 7107) {
            this.field_L = -126;
        }
    }

    static {
        field_O = "Password: ";
    }
}
