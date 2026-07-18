/*
 * Decompiled by CFR-JS 0.4.0.
 */
class vb extends bf {
    static String field_i;

    final static void f(int param0) {
        RuntimeException var1 = null;
        double var1_double = 0.0;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              int fieldTemp$1 = si.field_r;
              si.field_r = si.field_r + 1;
              if ((3 & fieldTemp$1) != 0) {
                break L1;
              } else {
                L2: {
                  bc.field_a = bc.field_a + 1;
                  if (5 != bc.field_a) {
                    break L2;
                  } else {
                    bc.field_a = 0;
                    break L2;
                  }
                }
                ob.field_r = ob.field_r + 1;
                if (ob.field_r == 5) {
                  ob.field_r = 0;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L3: {
              dd.field_e = dd.field_e + 6;
              hl.field_a = hl.field_a + 1;
              ne.field_b = ne.field_b + 6;
              if (60 >= hl.field_a) {
                break L3;
              } else {
                hl.field_a = 60;
                break L3;
              }
            }
            L4: {
              L5: {
                if (ah.field_d < 1300) {
                  break L5;
                } else {
                  if (ah.field_d <= 1800) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              if (dk.field_j != 0) {
                break L4;
              } else {
                if (Math.random() <= 0.99) {
                  break L4;
                } else {
                  L6: {
                    if (480 >= ne.field_b) {
                      stackOut_16_0 = 0;
                      stackIn_17_0 = stackOut_16_0;
                      break L6;
                    } else {
                      stackOut_15_0 = 1;
                      stackIn_17_0 = stackOut_15_0;
                      break L6;
                    }
                  }
                  L7: {
                    var1_int = stackIn_17_0;
                    if (dd.field_e <= 480) {
                      stackOut_19_0 = 0;
                      stackIn_20_0 = stackOut_19_0;
                      break L7;
                    } else {
                      stackOut_18_0 = 1;
                      stackIn_20_0 = stackOut_18_0;
                      break L7;
                    }
                  }
                  L8: {
                    var2 = stackIn_20_0;
                    if (var1_int == 0) {
                      break L8;
                    } else {
                      if (var2 == 0) {
                        break L8;
                      } else {
                        if (Math.random() >= 0.5) {
                          var1_int = 0;
                          break L8;
                        } else {
                          var2 = 0;
                          break L8;
                        }
                      }
                    }
                  }
                  L9: {
                    if (var2 == 0) {
                      break L9;
                    } else {
                      dd.field_e = -df.field_q[0].field_n;
                      break L9;
                    }
                  }
                  if (var1_int != 0) {
                    ne.field_b = -df.field_q[0].field_n;
                    break L4;
                  } else {
                    break L4;
                  }
                }
              }
            }
            L10: {
              ah.field_d = ah.field_d + 2;
              if (ah.field_d > 2000) {
                ah.field_d = 0;
                break L10;
              } else {
                break L10;
              }
            }
            L11: {
              field_i = null;
              var1_double = Math.random();
              if (var1_double > 0.95) {
                if (var1_double > 0.975) {
                  cj.a((byte) 127, ke.field_h[16]);
                  break L11;
                } else {
                  cj.a((byte) -23, ke.field_h[17]);
                  break L11;
                }
              } else {
                break L11;
              }
            }
            L12: {
              if (0 != (ah.field_d & 3)) {
                break L12;
              } else {
                L13: {
                  L14: {
                    if (ah.field_d <= 1300) {
                      break L14;
                    } else {
                      if (ah.field_d < 1800) {
                        L15: {
                          if (ah.field_d >= 1305) {
                            break L15;
                          } else {
                            cj.a((byte) 124, ke.field_h[15]);
                            break L15;
                          }
                        }
                        if (dk.field_j >= 200) {
                          break L13;
                        } else {
                          ve.field_x[dk.field_j][0] = pf.a((byte) 104, 640);
                          ve.field_x[dk.field_j][1] = pf.a((byte) -100, 480);
                          dk.field_j = dk.field_j + 1;
                          break L13;
                        }
                      } else {
                        break L14;
                      }
                    }
                  }
                  if (dk.field_j <= 0) {
                    break L13;
                  } else {
                    dk.field_j = dk.field_j - 1;
                    break L13;
                  }
                }
                var3 = 0;
                L16: while (true) {
                  if (~var3 <= ~dk.field_j) {
                    break L12;
                  } else {
                    ve.field_x[var3][0] = ve.field_x[var3][0] + (pf.a((byte) -122, 3) + -1);
                    ve.field_x[var3][1] = ve.field_x[var3][1] + 2;
                    var3++;
                    continue L16;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw la.a((Throwable) (Object) var1, "vb.F(" + -26 + ')');
        }
    }

    final static void g(int param0) {
        oa.field_G = -1;
        pf.field_b = null;
        ka.field_a = 0;
        nj.field_a = -1;
        ac.field_b = false;
    }

    final static void a(int param0, bk param1, boolean param2) {
        hb var3 = null;
        try {
            var3 = gf.field_c;
            var3.b(true, 5);
            var3.b(2, -49152);
            var3.b(0, -49152);
            var3.b(param1.field_e, -49152);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "vb.H(" + 5 + ',' + (param1 != null ? "{...}" : "null") + ',' + true + ')');
        }
    }

    vb() {
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        if (!(0 == (7 & param1))) {
            var2 = -(param1 & 7) + 8;
        }
        int var3 = param1 + var2;
        return var3;
    }

    public static void e(int param0) {
        int var1 = -1;
        field_i = null;
    }

    final static void a(byte param0) {
        String var1 = null;
        if (!fk.field_a) {
            throw new IllegalStateException();
        }
        if (null != me.field_f) {
            me.field_f.g((byte) -75);
            var1 = hf.b(0);
            j.field_e = new qi(var1, (String) null, true, false, false);
            wg.field_j.b((byte) -54, (we) (Object) jh.field_C);
            jh.field_C.c((byte) 119, (we) (Object) j.field_e);
            jh.field_C.p(-21);
            return;
        }
        var1 = hf.b(0);
        j.field_e = new qi(var1, (String) null, true, false, false);
        wg.field_j.b((byte) -54, (we) (Object) jh.field_C);
        jh.field_C.c((byte) 119, (we) (Object) j.field_e);
        jh.field_C.p(-21);
    }

    final static boolean a(byte param0, char param1) {
        if (!Character.isISOControl(param1)) {
          if (!th.a(false, param1)) {
            if (param1 != 45) {
              if (160 != param1) {
                if (32 == param1) {
                  return true;
                } else {
                  if (param1 != 95) {
                    if (param0 >= 109) {
                      return false;
                    } else {
                      return true;
                    }
                  } else {
                    return true;
                  }
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Waiting for graphics";
    }
}
