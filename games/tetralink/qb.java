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
        int var7 = 0;
        L0: {
          var7 = TetraLink.field_J;
          if (param0 <= 0) {
            break L0;
          } else {
            ((qb) this).a(-118, -114, -30, -7);
            break L0;
          }
        }
        L1: {
          if (param1 != ((qb) this).field_M) {
            if (param1 == ((qb) this).field_L) {
              wk.b(108);
              break L1;
            } else {
              if (param1 == ((qb) this).field_O) {
                vg.i(5959);
                break L1;
              } else {
                break L1;
              }
            }
          } else {
            fi.t(11);
            break L1;
          }
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
        int stackIn_4_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_3_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var1 = (Object) (Object) kd.field_g;
                    // monitorenter kd.field_g
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        ho.field_X = kf.field_c;
                        ea.field_a = ea.field_a + 1;
                        aa.field_Nb = nl.field_d;
                        a.field_a = va.field_y;
                        qd.field_T = tl.field_M;
                        if (!param0) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackOut_2_0 = 1;
                        stackIn_4_0 = stackOut_2_0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackOut_3_0 = 0;
                        stackIn_4_0 = stackOut_3_0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        tl.field_M = stackIn_4_0 != 0;
                        tm.field_t = tg.field_f;
                        ci.field_B = qc.field_Z;
                        li.field_o = qm.field_c;
                        tg.field_f = 0;
                        // monitorexit var1
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var2 = caughtException;
                        // monitorexit var1
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 7: {
                    throw (RuntimeException) (Object) var2;
                }
                case 8: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
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
        int var4 = var3 - var2 >> -675887263;
        ((qb) this).field_M.a(30, -var2 + (((qb) this).field_u - 48), -125, ((qb) this).field_F - var3 >> -1214699679, var4);
        ((qb) this).field_O.a(30, -48 + (((qb) this).field_u - var2), -119, var2 + (-var3 + ((qb) this).field_F >> 313550241) + var4, var4);
        ((qb) this).field_L.a(30, -(2 * var2) + (-78 + ((qb) this).field_u), -9, -var3 + ((qb) this).field_F >> -1599594207, var3);
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
        int var5_int = 0;
        li var5 = null;
        byte[] var6 = null;
        int var7 = 0;
        byte[] var8 = null;
        L0: {
          var7 = TetraLink.field_J;
          if (param3 <= 0) {
            var4 = param0;
            break L0;
          } else {
            var8 = new byte[param2];
            var4 = var8;
            var5_int = 0;
            L1: while (true) {
              if (var5_int >= param2) {
                break L0;
              } else {
                var8[var5_int] = param0[var5_int + param3];
                var5_int++;
                continue L1;
              }
            }
          }
        }
        if (param1 == -89) {
          var5 = new li();
          var5.a(false);
          var5.a(var4, (long)(8 * param2), true);
          var6 = new byte[64];
          var5.a(var6, 0, param1 ^ 97);
          return var6;
        } else {
          return null;
        }
    }

    final static int a(boolean param0, CharSequence param1, byte param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = TetraLink.field_J;
          if (2 > param3) {
            break L0;
          } else {
            if (36 >= param3) {
              L1: {
                var4 = 0;
                var5 = 0;
                var6 = 0;
                var7 = param1.length();
                if (param2 < -51) {
                  break L1;
                } else {
                  qb.a(-91);
                  break L1;
                }
              }
              var8 = 0;
              L2: while (true) {
                if (var8 >= var7) {
                  if (var5 != 0) {
                    return var6;
                  } else {
                    throw new NumberFormatException();
                  }
                } else {
                  L3: {
                    var9 = param1.charAt(var8);
                    if (var8 != 0) {
                      break L3;
                    } else {
                      if (var9 == 45) {
                        var4 = 1;
                        var8++;
                        continue L2;
                      } else {
                        if (43 != var9) {
                          break L3;
                        } else {
                          if (!param0) {
                            break L3;
                          } else {
                            var8++;
                            continue L2;
                          }
                        }
                      }
                    }
                  }
                  L4: {
                    L5: {
                      if (var9 < 48) {
                        break L5;
                      } else {
                        if (var9 <= 57) {
                          var9 -= 48;
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      if (var9 < 65) {
                        break L6;
                      } else {
                        if (var9 <= 90) {
                          var9 -= 55;
                          break L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                    L7: {
                      if (var9 < 97) {
                        break L7;
                      } else {
                        if (var9 > 122) {
                          break L7;
                        } else {
                          var9 -= 87;
                          break L4;
                        }
                      }
                    }
                    throw new NumberFormatException();
                  }
                  if (var9 < param3) {
                    L8: {
                      if (var4 == 0) {
                        break L8;
                      } else {
                        var9 = -var9;
                        break L8;
                      }
                    }
                    var10 = var9 + param3 * var6;
                    if (var10 / param3 != var6) {
                      throw new NumberFormatException();
                    } else {
                      var5 = 1;
                      var6 = var10;
                      var8++;
                      continue L2;
                    }
                  } else {
                    throw new NumberFormatException();
                  }
                }
              }
            } else {
              break L0;
            }
          }
        }
        throw new IllegalArgumentException("" + param3);
    }

    final boolean a(int param0, char param1, int param2, na param3) {
        if (param2 != 1) {
            boolean discarded$0 = qb.a(-72, (byte) -52);
        }
        if (super.a(param0, param1, param2 ^ 0, param3)) {
            return true;
        }
        if (!(-99 != (param0 ^ -1))) {
            return ((qb) this).d(param3, -102);
        }
        if ((param0 ^ -1) == -100) {
            return ((qb) this).b(param3, param2 + 114);
        }
        return false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_K = "Return to Main Menu";
    }
}
