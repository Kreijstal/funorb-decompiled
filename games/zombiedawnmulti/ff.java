/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ff extends qa {
    static int field_s;
    static String field_u;
    static ca field_r;
    static String field_q;
    ff field_v;
    ff field_w;
    static String field_t;

    final static void f(int param0) {
        int var1;
        int var2;
        var1 = bl.c(-42);
        if (param0 != -4604) {
          field_t = (String) null;
          var2 = ii.b((byte) -126);
          qf.field_c.a(-ic.field_g + eb.field_M, ch.field_i - e.field_a, (e.field_a << -1406805983) + var1, var2 - -(ic.field_g << -1130232991), 12018);
          up.b(-125);
          return;
        } else {
          var2 = ii.b((byte) -126);
          qf.field_c.a(-ic.field_g + eb.field_M, ch.field_i - e.field_a, (e.field_a << -1406805983) + var1, var2 - -(ic.field_g << -1130232991), 12018);
          up.b(-125);
          return;
        }
    }

    final void c(byte param0) {
        if (null != this.field_w) {
          if (param0 != -70) {
            ff.f(-48);
            this.field_w.field_v = this.field_v;
            this.field_v.field_w = this.field_w;
            this.field_w = null;
            this.field_v = null;
            return;
          } else {
            this.field_w.field_v = this.field_v;
            this.field_v.field_w = this.field_w;
            this.field_w = null;
            this.field_v = null;
            return;
          }
        } else {
          return;
        }
    }

    final static void a(int param0, int param1) {
        int var2;
        uk.field_S = param0;
        if (wd.field_L != null) {
          L0: {
            wd.field_L.a(param0, (byte) 116);
            var2 = 8 % ((-28 - param1) / 48);
            if (ra.field_m != null) {
              ra.field_m.a(param0, 18813);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            var2 = 8 % ((-28 - param1) / 48);
            if (ra.field_m != null) {
              ra.field_m.a(param0, 18813);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    protected ff() {
    }

    final static void a(byte param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        vg var4 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 == 126) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        ff.a(-116, -3);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var4 = (vg) ((Object) ag.field_i.c(param0 + -74));
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var4 == null) {
                            statePc = 11;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        vi.a(param1, var4, (byte) -123);
                        var4 = (vg) ((Object) ag.field_i.b(6));
                        if (var3 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        return;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var3 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        return;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 10: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    throw fa.a((Throwable) ((Object) var2), "ff.IA(" + param0 + ',' + param1 + ')');
                }
                case 11: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void e(int param0) {
        field_q = null;
        field_u = null;
        field_t = null;
        if (param0 != -1130232991) {
            field_r = (ca) null;
            field_r = null;
            return;
        }
        field_r = null;
    }

    static {
        field_u = "Auto-respond to <%0>";
        field_q = "Extra knowledge is extra power. Get yourself yet another powerup slot with this trait.";
        field_t = "Create unrated game";
    }
}
