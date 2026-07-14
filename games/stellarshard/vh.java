/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vh {
    private rk field_j;
    private ph field_f;
    private ka field_d;
    private java.math.BigInteger field_b;
    private wc[] field_a;
    static int field_i;
    static int[] field_h;
    static int field_e;
    private java.math.BigInteger field_c;
    private fb field_g;

    final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var3 = stellarshard.field_B;
        if (null != ((vh) this).field_a) {
          var2 = 0;
          L0: while (true) {
            if (var2 >= ((vh) this).field_a.length) {
              L1: {
                if (param0 == -123) {
                  break L1;
                } else {
                  ((vh) this).field_f = null;
                  break L1;
                }
              }
              var4 = 0;
              var2 = var4;
              L2: while (true) {
                if (var4 >= ((vh) this).field_a.length) {
                  return;
                } else {
                  if (((vh) this).field_a[var4] != null) {
                    ((vh) this).field_a[var4].b(false);
                    var4++;
                    continue L2;
                  } else {
                    var4++;
                    continue L2;
                  }
                }
              }
            } else {
              if (null != ((vh) this).field_a[var2]) {
                ((vh) this).field_a[var2].c(13596);
                var2++;
                continue L0;
              } else {
                var2++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    final static boolean a(boolean param0, java.applet.Applet param1) {
        try {
            Throwable var2 = null;
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            Object var8 = null;
            String var9 = null;
            int stackIn_7_0 = 0;
            int stackIn_16_0 = 0;
            int stackOut_6_0 = 0;
            int stackOut_14_0 = 0;
            int stackOut_15_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var7 = stellarshard.field_B;
                        if (!sl.field_c) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        return true;
                    }
                    case 2: {
                        try {
                            var9 = "tuhstatbut";
                            var3 = (String) sh.a("getcookies", param1, (byte) 78);
                            var4 = qj.a(';', var3, 10287);
                            var5 = 0;
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            if (var5 >= var4.length) {
                                statePc = 9;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            var6 = var4[var5].indexOf('=');
                            if (-1 < (var6 ^ -1)) {
                                statePc = 8;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            if (!var4[var5].substring(0, var6).trim().equals((Object) (Object) var9)) {
                                statePc = 8;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            stackOut_6_0 = 1;
                            stackIn_7_0 = stackOut_6_0;
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        return stackIn_7_0 != 0;
                    }
                    case 8: {
                        try {
                            var5++;
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            if (param0) {
                                statePc = 13;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            var8 = null;
                            short[] discarded$2 = vh.a((byte) 94, (short[]) null, -37, (ha) null);
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        var2 = caughtException;
                        statePc = 13;
                        continue stateLoop;
                    }
                    case 13: {
                        if (null == param1.getParameter("tuhstatbut")) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        stackOut_14_0 = 1;
                        stackIn_16_0 = stackOut_14_0;
                        statePc = 16;
                        continue stateLoop;
                    }
                    case 15: {
                        stackOut_15_0 = 0;
                        stackIn_16_0 = stackOut_15_0;
                        statePc = 16;
                        continue stateLoop;
                    }
                    case 16: {
                        return stackIn_16_0 != 0;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final wc a(int param0, gi param1, gi param2, boolean param3, int param4) {
        if (((vh) this).field_d == null) {
            throw new RuntimeException();
        }
        if (0 <= param4) {
            // if_icmple L34
        } else {
            throw new RuntimeException();
        }
        if (((vh) this).field_a[param4] != null) {
            return ((vh) this).field_a[param4];
        }
        ((vh) this).field_d.field_k = 6 + 72 * param4;
        int var6 = ((vh) this).field_d.b(false);
        int var7 = ((vh) this).field_d.b(false);
        byte[] var11 = new byte[param0];
        ((vh) this).field_d.a(0, (byte) -101, 64, var11);
        wc var9 = new wc(param4, param1, param2, ((vh) this).field_g, ((vh) this).field_j, var6, var11, var7, param3);
        ((vh) this).field_a[param4] = var9;
        return var9;
    }

    final static short[] a(byte param0, short[] param1, int param2, ha param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = stellarshard.field_B;
          if (param0 >= 21) {
            break L0;
          } else {
            field_e = -63;
            break L0;
          }
        }
        var4 = param3.e(param2, 8);
        if (-1 != (var4 ^ -1)) {
          L1: {
            L2: {
              if (param1 == null) {
                break L2;
              } else {
                if (param1.length != var4) {
                  break L2;
                } else {
                  break L1;
                }
              }
            }
            param1 = new short[var4];
            break L1;
          }
          L3: {
            var5 = param3.e(4, 8);
            var6 = (short)param3.e(16, 8);
            if (0 < var5) {
              var7 = 0;
              L4: while (true) {
                if (var4 <= var7) {
                  break L3;
                } else {
                  param1[var7] = (short)(var6 + param3.e(var5, 8));
                  var7++;
                  continue L4;
                }
              }
            } else {
              var7 = 0;
              L5: while (true) {
                if (var7 >= var4) {
                  break L3;
                } else {
                  param1[var7] = (short)var6;
                  var7++;
                  continue L5;
                }
              }
            }
          }
          return param1;
        } else {
          return null;
        }
    }

    vh(fb param0, rk param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    public static void b(byte param0) {
        if (param0 != 48) {
            field_i = 87;
        }
        field_h = null;
    }

    final boolean a(int param0) {
        int var3 = 0;
        byte[] var4 = null;
        byte[] var5 = null;
        java.math.BigInteger var6_ref = null;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        ka var11 = null;
        byte[] var12 = null;
        java.math.BigInteger var13 = null;
        byte[] var14 = null;
        byte[] var15 = null;
        byte[] var17 = null;
        byte[] var18 = null;
        var9 = stellarshard.field_B;
        if (null == ((vh) this).field_d) {
          L0: {
            if (((vh) this).field_f != null) {
              break L0;
            } else {
              if (((vh) this).field_g.d(2)) {
                return false;
              } else {
                ((vh) this).field_f = ((vh) this).field_g.a((byte) 0, 255, true, 255, true);
                break L0;
              }
            }
          }
          if (((vh) this).field_f.field_w) {
            return false;
          } else {
            L1: {
              L2: {
                var11 = new ka(((vh) this).field_f.g(-27203));
                var11.field_k = 5;
                var3 = var11.f(4);
                var11.field_k = var11.field_k + 72 * var3;
                var17 = new byte[-var11.field_k + var11.field_r.length];
                var15 = var17;
                var14 = var15;
                var12 = var14;
                var4 = var12;
                var11.a(0, (byte) -124, var17.length, var17);
                if (null == ((vh) this).field_c) {
                  break L2;
                } else {
                  if (null == ((vh) this).field_b) {
                    break L2;
                  } else {
                    var6_ref = new java.math.BigInteger(var17);
                    var13 = var6_ref.modPow(((vh) this).field_c, ((vh) this).field_b);
                    var5 = var13.toByteArray();
                    break L1;
                  }
                }
              }
              var5 = var4;
              break L1;
            }
            if (var5.length == 65) {
              var6 = -19 % ((param0 - 54) / 60);
              var18 = bc.a(0, 5, -5 + (-var17.length + var11.field_k), var11.field_r);
              var8 = 0;
              L3: while (true) {
                if (-65 >= (var8 ^ -1)) {
                  ((vh) this).field_d = var11;
                  ((vh) this).field_a = new wc[var3];
                  return true;
                } else {
                  if (var18[var8] == var5[1 + var8]) {
                    var8++;
                    continue L3;
                  } else {
                    throw new RuntimeException();
                  }
                }
              }
            } else {
              throw new RuntimeException();
            }
          }
        } else {
          return true;
        }
    }

    private vh(fb param0, rk param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        ((vh) this).field_g = param0;
        ((vh) this).field_j = param1;
        ((vh) this).field_b = param3;
        ((vh) this).field_c = param2;
        if (!((vh) this).field_g.d(2)) {
            ((vh) this).field_f = ((vh) this).field_g.a((byte) 0, 255, true, 255, true);
        }
    }

    static {
    }
}
