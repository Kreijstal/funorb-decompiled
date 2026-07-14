/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class k extends cb {
    static boolean field_i;

    final String a(byte param0, String param1) {
        if (!(((k) this).a(param1, 5) != fg.field_d)) {
            return hn.field_d;
        }
        int var3 = 9 % ((49 - param0) / 56);
        return c.field_b;
    }

    k(ui param0) {
        super(param0);
    }

    final static void f(int param0) {
        Object var1 = null;
        Object var1_ref = null;
        Throwable var2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var1_ref = (Object) (Object) lb.field_y;
                    // monitorenter lb.field_y
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        ld.field_B = qd.field_J;
                        t.field_c = t.field_c + 1;
                        nk.field_w = sa.field_o;
                        gb.field_e = nm.field_a;
                        field_i = kk.field_d;
                        kk.field_d = false;
                        jk.field_ab = ic.field_n;
                        wi.field_w = al.field_n;
                        m.field_e = vl.field_G;
                        if (param0 == 10525) {
                            statePc = 4;
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
                        // monitorexit var1_ref
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return;
                }
                case 4: {
                    try {
                        ic.field_n = 0;
                        // monitorexit var1_ref
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
                        // monitorexit var1_ref
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

    final static String g(int param0) {
        if ((af.field_u ^ -1) <= -3) {
          if (null != sb.field_r) {
            if (!sb.field_r.a((byte) 107)) {
              return ge.field_d;
            } else {
              return ic.field_g;
            }
          } else {
            if (hj.field_i.a((byte) 111)) {
              if (!hj.field_i.a(false, "commonui")) {
                return ub.field_c + " - " + hj.field_i.a("commonui", param0 + 22834) + "%";
              } else {
                if (!pb.field_r.a((byte) 99)) {
                  return dc.field_a;
                } else {
                  if (pb.field_r.a(false, "commonui")) {
                    if (oh.field_C.a((byte) 85)) {
                      if (oh.field_C.b(-1)) {
                        if (param0 != -22962) {
                          String discarded$1 = k.g(-76);
                          return nj.field_d;
                        } else {
                          return nj.field_d;
                        }
                      } else {
                        return ec.field_f + " - " + oh.field_C.c(-14858) + "%";
                      }
                    } else {
                      return l.field_e;
                    }
                  } else {
                    return mb.field_a + " - " + pb.field_r.a("commonui", -121) + "%";
                  }
                }
              }
            } else {
              return ul.field_d;
            }
          }
        } else {
          return aa.field_f;
        }
    }

    final ag a(String param0, int param1) {
        int var3 = dg.a(param0, -115) == null ? 1 : 0;
        if (param1 != 5) {
            Object var4 = null;
            ag discarded$6 = ((k) this).a((String) null, -75);
            if (!(var3 != 0)) {
                return fg.field_d;
            }
            return sc.field_a;
        }
        if (!(var3 != 0)) {
            return fg.field_d;
        }
        return sc.field_a;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = false;
    }
}
