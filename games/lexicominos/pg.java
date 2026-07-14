/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pg {
    static java.applet.Applet field_b;
    private ug[] field_j;
    private dc field_g;
    private java.math.BigInteger field_a;
    private kl field_c;
    static int field_f;
    private wb field_i;
    private java.math.BigInteger field_h;
    static int field_d;
    private wf field_e;

    final static String a(java.applet.Applet param0, byte param1) {
        try {
            Throwable var2 = null;
            String var3 = null;
            String var4 = null;
            String[] var5 = null;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            String var9 = null;
            String stackIn_8_0 = null;
            String stackOut_7_0 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var8 = Lexicominos.field_L ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var9 = param0.getParameter("cookieprefix");
                            var3 = var9 + "settings";
                            if (param1 == -28) {
                                statePc = 3;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            pg.c(2);
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            var4 = (String) oa.a(true, param0, "getcookies");
                            var5 = dc.a(var4, ';', (byte) -125);
                            var6 = 0;
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            if (var5.length <= var6) {
                                statePc = 12;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            var7 = var5[var6].indexOf('=');
                            if (var7 < 0) {
                                statePc = 9;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            if (!var5[var6].substring(0, var7).trim().equals((Object) (Object) var3)) {
                                statePc = 9;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            stackOut_7_0 = var5[var6].substring(1 + var7).trim();
                            stackIn_8_0 = stackOut_7_0;
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        return stackIn_8_0;
                    }
                    case 9: {
                        try {
                            var6++;
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        var2 = caughtException;
                        statePc = 12;
                        continue stateLoop;
                    }
                    case 12: {
                        if (null != mb.field_a) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        return param0.getParameter("settings");
                    }
                    case 14: {
                        return mb.field_a;
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

    final static void a(int param0) {
        int var2 = 0;
        pb var3_ref_pb = null;
        int var3 = 0;
        tg var4 = null;
        int var4_int = 0;
        Object var5 = null;
        int var6 = 0;
        th var9 = null;
        pb var13 = null;
        th var14 = null;
        Object var30 = null;
        th var31 = null;
        byte[] var33 = null;
        byte[] var34 = null;
        var30 = null;
        var6 = Lexicominos.field_L ? 1 : 0;
        if (param0 == 1) {
          var31 = ig.field_a;
          var2 = var31.d(true);
          if (0 != var2) {
            if (1 == var2) {
              var3 = var31.d((byte) 19);
              var4 = (tg) (Object) bg.field_c.a(true);
              L0: while (true) {
                L1: {
                  if (var4 == null) {
                    break L1;
                  } else {
                    if (var4.field_k == var3) {
                      break L1;
                    } else {
                      var4 = (tg) (Object) bg.field_c.f(2);
                      continue L0;
                    }
                  }
                }
                if (var4 == null) {
                  ck.b((byte) -73);
                  return;
                } else {
                  var4.b((byte) -128);
                  return;
                }
              }
            } else {
              uj.a("A1: " + qj.h(-100), (Throwable) null, 1);
              ck.b((byte) -46);
              return;
            }
          } else {
            var13 = (pb) (Object) tl.field_h.a(true);
            if (var13 == null) {
              ck.b((byte) -116);
              return;
            } else {
              L2: {
                var4_int = var31.d(true);
                if (-1 == (var4_int ^ -1)) {
                  var5 = null;
                  break L2;
                } else {
                  var34 = new byte[var4_int];
                  var31.a(param0 + 89, var4_int, 0, var34);
                  break L2;
                }
              }
              var31.field_h = var31.field_h + 4;
              if (!var31.c(4)) {
                ck.b((byte) -112);
                return;
              } else {
                var13.b((byte) -127);
                return;
              }
            }
          }
        } else {
          field_d = 66;
          var14 = ig.field_a;
          var9 = var14;
          var2 = var14.d(true);
          if (0 != var2) {
            if (1 == var2) {
              var3 = var14.d((byte) 19);
              var4 = (tg) (Object) bg.field_c.a(true);
              L3: while (true) {
                if (var4 != null) {
                  if (var4.field_k != var3) {
                    var4 = (tg) (Object) bg.field_c.f(2);
                    continue L3;
                  } else {
                    if (var4 == null) {
                      ck.b((byte) -73);
                      return;
                    } else {
                      var4.b((byte) -128);
                      return;
                    }
                  }
                } else {
                  if (var4 == null) {
                    ck.b((byte) -73);
                    return;
                  } else {
                    var4.b((byte) -128);
                    return;
                  }
                }
              }
            } else {
              uj.a("A1: " + qj.h(-100), (Throwable) null, 1);
              ck.b((byte) -46);
              return;
            }
          } else {
            var3_ref_pb = (pb) (Object) tl.field_h.a(true);
            if (var3_ref_pb == null) {
              ck.b((byte) -116);
              return;
            } else {
              L4: {
                var4_int = var14.d(true);
                if (-1 == (var4_int ^ -1)) {
                  var5 = null;
                  break L4;
                } else {
                  var33 = new byte[var4_int];
                  var14.a(param0 + 89, var4_int, 0, var33);
                  break L4;
                }
              }
              var14.field_h = var14.field_h + 4;
              if (!var14.c(4)) {
                ck.b((byte) -112);
                return;
              } else {
                var3_ref_pb.b((byte) -127);
                return;
              }
            }
          }
        }
    }

    public static void c(int param0) {
        if (param0 != -8413) {
            field_d = 56;
            field_b = null;
            return;
        }
        field_b = null;
    }

    final static void a(byte param0) {
        al.field_C = new ng();
        if (param0 < 75) {
            pg.c(-8);
        }
    }

    pg(wb param0, kl param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    final boolean b(int param0) {
        int var3 = 0;
        byte[] var4 = null;
        byte[] var5 = null;
        int var7 = 0;
        java.math.BigInteger var7_ref = null;
        int var8 = 0;
        int var9 = 0;
        wf var11 = null;
        byte[] var12 = null;
        java.math.BigInteger var13 = null;
        byte[] var14 = null;
        byte[] var15 = null;
        byte[] var16 = null;
        byte[] var18 = null;
        byte[] var20 = null;
        byte[] var22 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        byte[] var25 = null;
        byte[] var26 = null;
        byte[] var27 = null;
        byte[] var28 = null;
        var9 = Lexicominos.field_L ? 1 : 0;
        if (null == ((pg) this).field_e) {
          L0: {
            if (null != ((pg) this).field_g) {
              break L0;
            } else {
              if (!((pg) this).field_i.e(20)) {
                ((pg) this).field_g = ((pg) this).field_i.a(5, 255, 255, (byte) 0, true);
                break L0;
              } else {
                return false;
              }
            }
          }
          if (!((pg) this).field_g.field_v) {
            var11 = new wf(((pg) this).field_g.d((byte) 76));
            var11.field_h = 5;
            var3 = var11.d(true);
            var11.field_h = var11.field_h + var3 * 72;
            var22 = new byte[var11.field_j.length - var11.field_h];
            var15 = var22;
            var14 = var15;
            var12 = var14;
            var4 = var12;
            var11.a(107, var22.length, 0, var22);
            if (null != ((pg) this).field_h) {
              if (null != ((pg) this).field_a) {
                var13 = new java.math.BigInteger(var22);
                var7_ref = var13.modPow(((pg) this).field_h, ((pg) this).field_a);
                var27 = var7_ref.toByteArray();
                var20 = var27;
                var5 = var20;
                if (-66 == (var27.length ^ -1)) {
                  var28 = si.a(5, var11.field_j, -86, -5 + var11.field_h - var22.length);
                  var7 = 0;
                  L1: while (true) {
                    if (-65 < (var7 ^ -1)) {
                      if (var5[1 + var7] == var28[var7]) {
                        var7++;
                        continue L1;
                      } else {
                        throw new RuntimeException();
                      }
                    } else {
                      var8 = 102 % ((16 - param0) / 37);
                      ((pg) this).field_j = new ug[var3];
                      ((pg) this).field_e = var11;
                      return true;
                    }
                  }
                } else {
                  throw new RuntimeException();
                }
              } else {
                var25 = var4;
                var18 = var25;
                var5 = var18;
                if (-66 == (var25.length ^ -1)) {
                  var26 = si.a(5, var11.field_j, -86, -5 + var11.field_h - var22.length);
                  var7 = 0;
                  L2: while (true) {
                    if (-65 < (var7 ^ -1)) {
                      if (var5[1 + var7] == var26[var7]) {
                        var7++;
                        continue L2;
                      } else {
                        throw new RuntimeException();
                      }
                    } else {
                      var8 = 102 % ((16 - param0) / 37);
                      ((pg) this).field_j = new ug[var3];
                      ((pg) this).field_e = var11;
                      return true;
                    }
                  }
                } else {
                  throw new RuntimeException();
                }
              }
            } else {
              var23 = var4;
              var16 = var23;
              var5 = var16;
              if (-66 == (var23.length ^ -1)) {
                var24 = si.a(5, var11.field_j, -86, -5 + var11.field_h - var22.length);
                var7 = 0;
                L3: while (true) {
                  if (-65 < (var7 ^ -1)) {
                    if (var5[1 + var7] == var24[var7]) {
                      var7++;
                      continue L3;
                    } else {
                      throw new RuntimeException();
                    }
                  } else {
                    var8 = 102 % ((16 - param0) / 37);
                    ((pg) this).field_j = new ug[var3];
                    ((pg) this).field_e = var11;
                    return true;
                  }
                }
              } else {
                throw new RuntimeException();
              }
            }
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    private pg(wb param0, kl param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        ((pg) this).field_i = param0;
        ((pg) this).field_h = param2;
        ((pg) this).field_c = param1;
        ((pg) this).field_a = param3;
        if (!((pg) this).field_i.e(20)) {
            ((pg) this).field_g = ((pg) this).field_i.a(5, 255, 255, (byte) 0, true);
        }
    }

    final void d(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var3 = Lexicominos.field_L ? 1 : 0;
        if (null != ((pg) this).field_j) {
          var2 = 0;
          L0: while (true) {
            if (((pg) this).field_j.length <= var2) {
              if (param0 != 72) {
                ((pg) this).d(-43);
                var4 = 0;
                var2 = var4;
                L1: while (true) {
                  if (((pg) this).field_j.length <= var4) {
                    return;
                  } else {
                    if (null != ((pg) this).field_j[var4]) {
                      ((pg) this).field_j[var4].b(false);
                      var4++;
                      continue L1;
                    } else {
                      var4++;
                      continue L1;
                    }
                  }
                }
              } else {
                var4 = 0;
                var2 = var4;
                L2: while (true) {
                  if (((pg) this).field_j.length <= var4) {
                    return;
                  } else {
                    if (null != ((pg) this).field_j[var4]) {
                      ((pg) this).field_j[var4].b(false);
                      var4++;
                      continue L2;
                    } else {
                      var4++;
                      continue L2;
                    }
                  }
                }
              }
            } else {
              if (((pg) this).field_j[var2] == null) {
                var2++;
                var2++;
                continue L0;
              } else {
                ((pg) this).field_j[var2].b(param0 ^ -56);
                var2++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    final ug a(int param0, int param1, dl param2, dl param3, boolean param4) {
        int var6 = 0;
        int var7 = 0;
        ug var17 = null;
        ug var19 = null;
        byte[] var22 = null;
        byte[] var23 = null;
        if (((pg) this).field_e == null) {
          throw new RuntimeException();
        } else {
          if (param0 >= 0) {
            if (param0 < ((pg) this).field_j.length) {
              if (((pg) this).field_j[param0] == null) {
                ((pg) this).field_e.field_h = 6 + param0 * 72;
                var6 = ((pg) this).field_e.d((byte) 19);
                var7 = ((pg) this).field_e.d((byte) 19);
                if (param1 != 3510) {
                  pg.a(55);
                  var22 = new byte[64];
                  ((pg) this).field_e.a(106, 64, 0, var22);
                  var17 = new ug(param0, param2, param3, ((pg) this).field_i, ((pg) this).field_c, var6, var22, var7, param4);
                  ((pg) this).field_j[param0] = var17;
                  return var17;
                } else {
                  var23 = new byte[64];
                  ((pg) this).field_e.a(106, 64, 0, var23);
                  var19 = new ug(param0, param2, param3, ((pg) this).field_i, ((pg) this).field_c, var6, var23, var7, param4);
                  ((pg) this).field_j[param0] = var19;
                  return var19;
                }
              } else {
                return ((pg) this).field_j[param0];
              }
            } else {
              throw new RuntimeException();
            }
          } else {
            throw new RuntimeException();
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = 0;
        field_d = -1;
    }
}
