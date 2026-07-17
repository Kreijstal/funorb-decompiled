/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ib {
    aga[] field_b;
    static be[] field_d;
    int field_a;
    boolean field_c;

    final int a(byte param0) {
        int var2 = 0;
        aga[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        aga var6 = null;
        int var7 = 0;
        var7 = BachelorFridge.field_y;
        var2 = 0;
        var3 = ((ib) this).field_b;
        var5 = 10 % ((54 - param0) / 44);
        var4 = 0;
        L0: while (true) {
          if (var4 >= var3.length) {
            return var2;
          } else {
            var6 = var3[var4];
            if (var6 != null) {
              var2++;
              var4++;
              continue L0;
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    final static int a(boolean param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        int stackIn_27_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_26_0 = 0;
        var7 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var1_int = 0;
              var2 = 0;
              if (param0) {
                break L1;
              } else {
                field_d = null;
                break L1;
              }
            }
            L2: while (true) {
              if (!kaa.b(127)) {
                L3: {
                  dp.field_o.a(rla.a(nfa.field_a, jc.field_r, -126), -122, rla.a(mk.field_p, gd.field_m, -125));
                  if (dp.field_o.e(0)) {
                    var1_int = 1;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  L5: {
                    var3 = 0;
                    if (var1_int == 0) {
                      break L5;
                    } else {
                      if (dp.field_o.field_g < 0) {
                        break L5;
                      } else {
                        L6: {
                          var3 = mu.field_l[dp.field_o.field_g];
                          if (var3 == 2) {
                            break L6;
                          } else {
                            if (var3 == 5) {
                              break L6;
                            } else {
                              break L4;
                            }
                          }
                        }
                        int discarded$2 = 0;
                        qja.a();
                        break L4;
                      }
                    }
                  }
                  if (var2 == 0) {
                    break L4;
                  } else {
                    if (ub.field_j != 2) {
                      int discarded$3 = 0;
                      qja.a();
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                }
                L7: {
                  if (0 != var3) {
                    break L7;
                  } else {
                    if (ub.field_j == 2) {
                      var4 = f.b((byte) 73) - ph.field_P;
                      var6 = (int)((10999L + -var4) / 1000L);
                      if (var6 > 0) {
                        break L7;
                      } else {
                        tfa.a(5, 1, true);
                        var3 = 2;
                        break L7;
                      }
                    } else {
                      break L7;
                    }
                  }
                }
                stackOut_26_0 = var3;
                stackIn_27_0 = stackOut_26_0;
                break L0;
              } else {
                L8: {
                  dp.field_o.b(true);
                  if (!dp.field_o.e(0)) {
                    break L8;
                  } else {
                    var1_int = 1;
                    break L8;
                  }
                }
                if (gf.field_k != 13) {
                  continue L2;
                } else {
                  var2 = 1;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var1, "ib.C(" + param0 + 41);
        }
        return stackIn_27_0;
    }

    public static void a() {
        field_d = null;
    }

    final int b(byte param0) {
        int var2 = 0;
        aga[] var3 = null;
        int var4 = 0;
        aga var5 = null;
        int var6 = 0;
        L0: {
          var6 = BachelorFridge.field_y;
          if (param0 >= 58) {
            break L0;
          } else {
            ((ib) this).field_a = 80;
            break L0;
          }
        }
        var2 = 0;
        var3 = ((ib) this).field_b;
        var4 = 0;
        L1: while (true) {
          if (var3.length <= var4) {
            return var2;
          } else {
            var5 = var3[var4];
            if (var5 != null) {
              if (!var5.i(-85)) {
                var2++;
                var4++;
                continue L1;
              } else {
                var4++;
                continue L1;
              }
            } else {
              var4++;
              continue L1;
            }
          }
        }
    }

    final boolean a(byte param0, int param1) {
        aga[] var3 = null;
        int var4 = 0;
        aga var5 = null;
        int var6 = 0;
        L0: {
          var6 = BachelorFridge.field_y;
          var3 = ((ib) this).field_b;
          if (param0 <= -19) {
            break L0;
          } else {
            int discarded$2 = ib.a(false);
            break L0;
          }
        }
        var4 = 0;
        L1: while (true) {
          if (var3.length <= var4) {
            return false;
          } else {
            var5 = var3[var4];
            if (var5 != null) {
              if (!var5.i(-73)) {
                if (var5.field_y == param1) {
                  return true;
                } else {
                  var4++;
                  continue L1;
                }
              } else {
                var4++;
                continue L1;
              }
            } else {
              var4++;
              continue L1;
            }
          }
        }
    }

    final void a(int param0, aga param1) {
        if (param0 != -20836) {
            return;
        }
        try {
            param1.field_u = ((ib) this).field_a;
            ((ib) this).field_b[((ib) this).field_a] = param1;
            ((ib) this).field_a = ((ib) this).field_a + 1;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "ib.B(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    ib(int param0) {
        ((ib) this).field_b = new aga[7];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new be[38];
    }
}
