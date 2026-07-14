/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gk extends ii implements mg, vg {
    static String field_O;
    private ck field_M;
    gi field_P;
    private ck field_N;
    static String field_K;
    private uh field_R;
    static boolean[] field_Q;
    static gn field_L;

    private final boolean a(qn param0, int param1) {
        dp var3 = param0.a(-84);
        if (!(var3 != null)) {
            return true;
        }
        od var4 = var3.a((byte) -95);
        int var5 = -22 / ((param1 - 35) / 41);
        return c.field_d == var4 ? true : false;
    }

    public final void a(int param0) {
        ((kh) (Object) ((gk) this).field_R.a(-98)).e(true);
        if (param0 < 121) {
            ((gk) this).field_M = null;
        }
    }

    final static int a(int param0, int param1) {
        param1--;
        param1 = param1 | param1 >>> 45765057;
        param1 = param1 | param1 >>> 1445209794;
        if (param0 != -912121912) {
          gk.b(false);
          param1 = param1 | param1 >>> 836974692;
          param1 = param1 | param1 >>> -912121912;
          param1 = param1 | param1 >>> -1522897680;
          return param1 + 1;
        } else {
          param1 = param1 | param1 >>> 836974692;
          param1 = param1 | param1 >>> -912121912;
          param1 = param1 | param1 >>> -1522897680;
          return param1 + 1;
        }
    }

    final void a(int param0, int param1, lm param2, boolean param3) {
        super.a(param0, param1, param2, param3);
        ((gk) this).field_M.field_B = this.i(124);
    }

    final boolean a(lm param0, char param1, int param2, byte param3) {
        if (param3 >= 55) {
          if (!super.a(param0, param1, param2, (byte) 98)) {
            if (98 == param2) {
              return ((gk) this).a(param0, (byte) 71);
            } else {
              if ((param2 ^ -1) == -100) {
                return ((gk) this).a((byte) -5, param0);
              } else {
                return false;
              }
            }
          } else {
            return true;
          }
        } else {
          gk.a(62, (byte) 25);
          if (!super.a(param0, param1, param2, (byte) 98)) {
            if (98 == param2) {
              return ((gk) this).a(param0, (byte) 71);
            } else {
              if ((param2 ^ -1) == -100) {
                return ((gk) this).a((byte) -5, param0);
              } else {
                return false;
              }
            }
          } else {
            return true;
          }
        }
    }

    final static me a(int param0, String param1) {
        L0: {
          if (!im.field_b.b(36)) {
            break L0;
          } else {
            if (!param1.equals((Object) (Object) im.field_b.c(-2085))) {
              im.field_b = oh.a(param1, -8);
              break L0;
            } else {
              if (param0 < -88) {
                return im.field_b;
              } else {
                field_L = null;
                return im.field_b;
              }
            }
          }
        }
        if (param0 >= -88) {
          field_L = null;
          return im.field_b;
        } else {
          return im.field_b;
        }
    }

    private final int a(String param0, int param1, lm param2, String param3, int param4, int param5) {
        if (param4 != 21287) {
          gk.a(-63, (byte) 34);
          return this.a(param0, 35, 50, param3, param2, param1, param5);
        } else {
          return this.a(param0, 35, 50, param3, param2, param1, param5);
        }
    }

    final static ai a(ec param0, byte param1) {
        int var2 = param0.c(true);
        ai var3 = new ai(var2);
        var3.field_j = param0.c(true);
        var3.field_p = param0.c(true);
        var3.field_l = param0.c(true);
        var3.field_g = param0.c(true);
        var3.field_s = param0.c(true);
        var3.field_r = param0.c(true);
        int var4 = 58 / ((66 - param1) / 38);
        var3.field_o = param0.c(true);
        var3.field_q = param0.c(true);
        return var3;
    }

    public final void a(byte param0, String param1) {
        uh var3 = null;
        String var4 = null;
        if (param0 >= -26) {
          ((gk) this).field_R = null;
          var3 = ((gk) this).field_R;
          var4 = param1;
          ((rm) (Object) var3).a(var4, false, (byte) 74);
          return;
        } else {
          var3 = ((gk) this).field_R;
          var4 = param1;
          ((rm) (Object) var3).a(var4, false, (byte) 74);
          return;
        }
    }

    public static void b(boolean param0) {
        field_L = null;
        if (param0) {
          field_K = null;
          field_Q = null;
          field_K = null;
          field_O = null;
          return;
        } else {
          field_Q = null;
          field_K = null;
          field_O = null;
          return;
        }
    }

    private final int a(String param0, int param1, int param2, String param3, lm param4, int param5, int param6) {
        tn var9 = null;
        dg var10 = null;
        if (param2 != 50) {
          return -27;
        } else {
          var10 = new dg(20, param6, param5 + 120, 25, param4, false, 120, 3, lp.field_C, 16777215, param3);
          ((gk) this).b((byte) -61, (lm) (Object) var10);
          var9 = new tn(((qn) (Object) param4).a(-120), param0, 126, param6 + var10.field_s, 25 + param5, param1);
          var9.field_n = (pg) this;
          ((gk) this).b((byte) -43, (lm) (Object) var9);
          return var9.field_s + var10.field_s;
        }
    }

    public gk() {
        super(0, 0, 496, 0, (ca) null);
        ((gk) this).field_R = new uh("", (pg) null, 12);
        hh var1 = new hh(ta.field_e, 0, 0, 0, 0, 16777215, -1, 3, 0, lp.field_C.field_H, -1, 2147483647, true);
        lm var2 = new lm(vo.field_q, (ca) (Object) var1, (pg) null);
        ((gk) this).field_M = new ck(m.field_g, (pg) null);
        ((gk) this).field_N = new ck(dc.field_v, (pg) null);
        ((gk) this).field_R.field_i = un.field_d;
        ((gk) this).field_R.a((dp) (Object) new kh((rm) (Object) ((gk) this).field_R), 10508);
        ((gk) this).field_M.field_B = false;
        ((gk) this).field_M.field_o = (ca) (Object) new na();
        ((gk) this).field_N.field_o = (ca) (Object) new oa();
        ((gk) this).field_R.field_o = (ca) (Object) new mc(10000536);
        int var3 = 20;
        int var4 = 4;
        int var5 = 200;
        var2.b(0, 270, var3, 20, 50);
        ((gk) this).b((byte) -49, var2);
        var3 += 50;
        var3 = var3 + (5 + this.a(an.field_z, 170, (lm) (Object) ((gk) this).field_R, wf.field_B, 21287, var3));
        ((gk) this).field_M.b(0, var5, var3, 496 - var5 >> 1000933057, 40);
        ((gk) this).field_N.b(0, 60, var3 + 15, 3 + var4, 40);
        ((gk) this).field_N.field_n = (pg) this;
        ((gk) this).field_M.field_n = (pg) this;
        ((gk) this).b((byte) -90, (lm) (Object) ((gk) this).field_M);
        ((gk) this).b((byte) -115, (lm) (Object) ((gk) this).field_N);
        ((gk) this).field_P = new gi((mg) this);
        ((gk) this).field_P.b(0, ((gk) this).field_x - ((gk) this).field_R.field_q + (-((gk) this).field_R.field_x + -60), 20, 60 + ((gk) this).field_R.field_x + ((gk) this).field_R.field_q, 150);
        ((gk) this).b((byte) -77, (lm) (Object) ((gk) this).field_P);
        ((gk) this).b(0, 496, 0, 0, 55 + (var3 - -var4));
    }

    private final void f(byte param0) {
        if (param0 != -43) {
            return;
        }
        if (!(this.i(126))) {
            return;
        }
        pk.a(-96, ((gk) this).field_R.field_w);
    }

    final static void a(int param0, h param1, int param2, int param3, int param4) {
        sd.a(param0, gd.field_E, 76, param3, param1.field_m, param4);
        if (param2 < 94) {
          field_L = null;
          sd.a(40 + param0, jj.field_b, 66, param3, param1.field_r, param4);
          sd.a(param0, wl.field_d, 87, param3, param1.field_b, param4 + 18);
          sd.a(param0 + 40, pk.field_o, 89, param3, param1.field_o, param4 + 18);
          return;
        } else {
          sd.a(40 + param0, jj.field_b, 66, param3, param1.field_r, param4);
          sd.a(param0, wl.field_d, 87, param3, param1.field_b, param4 + 18);
          sd.a(param0 + 40, pk.field_o, 89, param3, param1.field_o, param4 + 18);
          return;
        }
    }

    final static void a(int param0, byte param1) {
        try {
            Throwable throwable = null;
            Object var3 = null;
            Throwable decompiledCaughtException = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        try {
                            Object discarded$5 = ee.a("resizing", m.c(true), param1 + 15643, new Object[1]);
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_0) {
                            caughtException = stateCaught_0;
                            statePc = 2;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        throwable = caughtException;
                        statePc = 3;
                        continue stateLoop;
                    }
                    case 3: {
                        if (param1 != 4) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        return;
                    }
                    case 5: {
                        var3 = null;
                        me discarded$6 = gk.a(-128, (String) null);
                        return;
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

    public final void a(ck param0, byte param1, int param2, int param3, int param4) {
        Object var7 = null;
        if (param1 == 98) {
          if (param0 != ((gk) this).field_N) {
            if (param0 != ((gk) this).field_M) {
              return;
            } else {
              this.f((byte) -43);
              return;
            }
          } else {
            rc.b(param1 ^ 4);
            return;
          }
        } else {
          var7 = null;
          ((gk) this).a(-18, 59, (lm) null, false);
          if (param0 != ((gk) this).field_N) {
            if (param0 != ((gk) this).field_M) {
              return;
            } else {
              this.f((byte) -43);
              return;
            }
          } else {
            rc.b(param1 ^ 4);
            return;
          }
        }
    }

    final static boolean a(String param0, String param1, int param2) {
        String var3 = null;
        String var4 = null;
        String var5 = null;
        int stackIn_27_0 = 0;
        int stackOut_25_0 = 0;
        if (param2 == 16777215) {
          var5 = sh.a((byte) -122, param0);
          if (-1 == param1.indexOf(param0)) {
            if ((param1.indexOf(var5) ^ -1) == 0) {
              if (!param1.startsWith(param0)) {
                if (!param1.startsWith(var5)) {
                  if (!param1.endsWith(param0)) {
                    if (param1.endsWith(var5)) {
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    stackOut_25_0 = 1;
                    stackIn_27_0 = stackOut_25_0;
                    return stackIn_27_0 != 0;
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
          field_O = null;
          var4 = sh.a((byte) -122, param0);
          var3 = var4;
          if (-1 == param1.indexOf(param0)) {
            if ((param1.indexOf(var4) ^ -1) == 0) {
              if (!param1.startsWith(param0)) {
                if (!param1.startsWith(var4)) {
                  if (!param1.endsWith(param0)) {
                    if (!param1.endsWith(var4)) {
                      return false;
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
            return true;
          }
        }
    }

    private final boolean i(int param0) {
        if (!this.a((qn) (Object) ((gk) this).field_R, -70)) {
            return false;
        }
        if (param0 <= 123) {
            return false;
        }
        return true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_O = "Back";
        field_K = "PROFILE";
    }
}
