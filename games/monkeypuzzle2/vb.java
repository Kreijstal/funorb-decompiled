/*
 * Decompiled by CFR-JS 0.4.0.
 */
class vb extends bf {
    static String field_i;

    final static void f(int param0) {
        int fieldTemp$1 = 0;
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
              fieldTemp$1 = si.field_r;
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
                if ((ob.field_r ^ -1) == -6) {
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
                if ((ah.field_d ^ -1) > -1301) {
                  break L5;
                } else {
                  if (-1801 <= (ah.field_d ^ -1)) {
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
                    if ((dd.field_e ^ -1) >= -481) {
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
                        L9: {
                          if (Math.random() >= 0.5) {
                            break L9;
                          } else {
                            var2 = 0;
                            if (var4 == 0) {
                              break L8;
                            } else {
                              break L9;
                            }
                          }
                        }
                        var1_int = 0;
                        break L8;
                      }
                    }
                  }
                  L10: {
                    if (var2 == 0) {
                      break L10;
                    } else {
                      dd.field_e = -df.field_q[0].field_n;
                      break L10;
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
            L11: {
              ah.field_d = ah.field_d + 2;
              if ((ah.field_d ^ -1) < -2001) {
                ah.field_d = 0;
                break L11;
              } else {
                break L11;
              }
            }
            L12: {
              if (param0 >= 15) {
                break L12;
              } else {
                field_i = (String) null;
                break L12;
              }
            }
            L13: {
              var1_double = Math.random();
              if (var1_double > 0.95) {
                L14: {
                  if (var1_double > 0.975) {
                    break L14;
                  } else {
                    cj.a((byte) -23, ke.field_h[17]);
                    if (var4 == 0) {
                      break L13;
                    } else {
                      break L14;
                    }
                  }
                }
                cj.a((byte) 127, ke.field_h[16]);
                break L13;
              } else {
                break L13;
              }
            }
            L15: {
              if (0 != (ah.field_d & 3)) {
                break L15;
              } else {
                L16: {
                  L17: {
                    L18: {
                      if ((ah.field_d ^ -1) >= -1301) {
                        break L18;
                      } else {
                        if ((ah.field_d ^ -1) > -1801) {
                          break L17;
                        } else {
                          break L18;
                        }
                      }
                    }
                    if (-1 <= (dk.field_j ^ -1)) {
                      break L16;
                    } else {
                      dk.field_j = dk.field_j - 1;
                      if (var4 == 0) {
                        break L16;
                      } else {
                        break L17;
                      }
                    }
                  }
                  L19: {
                    if (-1306 >= (ah.field_d ^ -1)) {
                      break L19;
                    } else {
                      cj.a((byte) 124, ke.field_h[15]);
                      break L19;
                    }
                  }
                  if (-201 >= (dk.field_j ^ -1)) {
                    break L16;
                  } else {
                    ve.field_x[dk.field_j][0] = pf.a((byte) 104, 640);
                    ve.field_x[dk.field_j][1] = pf.a((byte) -100, 480);
                    dk.field_j = dk.field_j + 1;
                    break L16;
                  }
                }
                var3 = 0;
                L20: while (true) {
                  if (var3 >= dk.field_j) {
                    break L15;
                  } else {
                    ve.field_x[var3][0] = ve.field_x[var3][0] + (pf.a((byte) -122, 3) + -1);
                    ve.field_x[var3][1] = ve.field_x[var3][1] + 2;
                    var3++;
                    if (var4 == 0) {
                      continue L20;
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
          var1 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var1), "vb.F(" + param0 + ')');
        }
    }

    final static void g(int param0) {
        oa.field_G = -1;
        if (param0 < 65) {
          vb.f(-26);
          pf.field_b = null;
          ka.field_a = 0;
          nj.field_a = -1;
          ac.field_b = false;
          return;
        } else {
          pf.field_b = null;
          ka.field_a = 0;
          nj.field_a = -1;
          ac.field_b = false;
          return;
        }
    }

    final static void a(int param0, bk param1, boolean param2) {
        hb var3 = null;
        try {
            var3 = gf.field_c;
            var3.b(param2, param0);
            var3.b(2, -49152);
            var3.b(0, -49152);
            var3.b(param1.field_e, -49152);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "vb.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    vb() {
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var2 = 0;
        if (param0 <= 62) {
          return 28;
        } else {
          L0: {
            if (0 != (7 & param1)) {
              var2 = -(param1 & 7) + 8;
              break L0;
            } else {
              break L0;
            }
          }
          var3 = param1 + var2;
          return var3;
        }
    }

    public static void e(int param0) {
        int var1 = -105 % ((param0 - 14) / 34);
        field_i = null;
    }

    final static void a(byte param0) {
        String var1 = null;
        if (fk.field_a) {
          if (null == me.field_f) {
            var1 = hf.b(0);
            j.field_e = new qi(var1, (String) null, true, false, false);
            if (param0 != 28) {
              field_i = (String) null;
              wg.field_j.b((byte) -54, jh.field_C);
              jh.field_C.c((byte) 119, j.field_e);
              jh.field_C.p(-21);
              return;
            } else {
              wg.field_j.b((byte) -54, jh.field_C);
              jh.field_C.c((byte) 119, j.field_e);
              jh.field_C.p(-21);
              return;
            }
          } else {
            me.field_f.g((byte) -75);
            var1 = hf.b(0);
            j.field_e = new qi(var1, (String) null, true, false, false);
            if (param0 == 28) {
              wg.field_j.b((byte) -54, jh.field_C);
              jh.field_C.c((byte) 119, j.field_e);
              jh.field_C.p(-21);
              return;
            } else {
              field_i = (String) null;
              wg.field_j.b((byte) -54, jh.field_C);
              jh.field_C.c((byte) 119, j.field_e);
              jh.field_C.p(-21);
              return;
            }
          }
        } else {
          throw new IllegalStateException();
        }
    }

    final static boolean a(byte param0, char param1) {
        if (!Character.isISOControl(param1)) {
          if (!th.a(false, param1)) {
            if (param1 != 45) {
              if (160 != param1) {
                if (32 != param1) {
                  if (param1 != 95) {
                    if (param0 < 109) {
                      return true;
                    } else {
                      return false;
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
        field_i = "Waiting for graphics";
    }
}
