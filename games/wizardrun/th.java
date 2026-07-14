/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class th {
    static byte[][][] field_a;
    static boolean field_h;
    static bh field_d;
    static int field_i;
    private rk field_c;
    static String field_e;
    static nj field_g;
    static String field_b;
    private rk field_f;

    final static void b(byte param0) {
        Object var1 = null;
        Throwable var2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var1 = (Object) (Object) tc.field_m;
                    // monitorenter tc.field_m
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        sh.field_c = ve.field_d;
                        oc.field_a = oc.field_a + 1;
                        pg.field_n = wizardrun.field_T;
                        fi.field_B = gj.field_a;
                        ih.field_a = jf.field_i;
                        if (param0 == -21) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        th.a((byte) 88);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        jf.field_i = false;
                        w.field_c = fi.field_w;
                        tf.field_e = mh.field_pb;
                        dh.field_b = dc.field_t;
                        fi.field_w = 0;
                        // monitorexit var1
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var2 = caughtException;
                        // monitorexit var1
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 6: {
                    throw (RuntimeException) (Object) var2;
                }
                case 7: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final rk d(int param0) {
        rk var2 = null;
        var2 = ((th) this).field_f;
        if (((th) this).field_c != var2) {
          if (param0 <= 3) {
            ((th) this).field_f = null;
            ((th) this).field_f = var2.field_i;
            return var2;
          } else {
            ((th) this).field_f = var2.field_i;
            return var2;
          }
        } else {
          ((th) this).field_f = null;
          return null;
        }
    }

    final rk a(int param0) {
        rk var2 = null;
        var2 = ((th) this).field_c.field_i;
        if (param0 == 0) {
          if (((th) this).field_c == var2) {
            ((th) this).field_f = null;
            return null;
          } else {
            ((th) this).field_f = var2.field_i;
            return var2;
          }
        } else {
          rk discarded$7 = ((th) this).b(68);
          if (((th) this).field_c == var2) {
            ((th) this).field_f = null;
            return null;
          } else {
            ((th) this).field_f = var2.field_i;
            return var2;
          }
        }
    }

    final int c(int param0) {
        int var2 = 0;
        rk var3 = null;
        int var4 = 0;
        var4 = wizardrun.field_H;
        var2 = 0;
        var3 = ((th) this).field_c.field_i;
        L0: while (true) {
          if (((th) this).field_c == var3) {
            if (param0 != 4) {
              return -16;
            } else {
              return var2;
            }
          } else {
            var3 = var3.field_i;
            var2++;
            continue L0;
          }
        }
    }

    final static StringBuilder a(StringBuilder param0, char param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = wizardrun.field_H;
        var4 = param0.length();
        param0.setLength(param2);
        var5 = var4;
        if (param3 == 1) {
          L0: while (true) {
            if (param2 <= var5) {
              return param0;
            } else {
              param0.setCharAt(var5, param1);
              var5++;
              continue L0;
            }
          }
        } else {
          return null;
        }
    }

    public static void a(byte param0) {
        if (param0 <= 60) {
            return;
        }
        field_a = null;
        field_e = null;
        field_g = null;
        field_b = null;
        field_d = null;
    }

    final void a(rk param0, int param1) {
        if (param1 == 14) {
          if (param0.field_l != null) {
            param0.b(false);
            param0.field_i = ((th) this).field_c;
            param0.field_l = ((th) this).field_c.field_l;
            param0.field_l.field_i = param0;
            param0.field_i.field_l = param0;
            return;
          } else {
            param0.field_i = ((th) this).field_c;
            param0.field_l = ((th) this).field_c.field_l;
            param0.field_l.field_i = param0;
            param0.field_i.field_l = param0;
            return;
          }
        } else {
          rk discarded$1 = ((th) this).a(-10);
          if (param0.field_l == null) {
            param0.field_i = ((th) this).field_c;
            param0.field_l = ((th) this).field_c.field_l;
            param0.field_l.field_i = param0;
            param0.field_i.field_l = param0;
            return;
          } else {
            param0.b(false);
            param0.field_i = ((th) this).field_c;
            param0.field_l = ((th) this).field_c.field_l;
            param0.field_l.field_i = param0;
            param0.field_i.field_l = param0;
            return;
          }
        }
    }

    final rk b(int param0) {
        rk var2 = null;
        var2 = ((th) this).field_c.field_i;
        if (param0 >= 33) {
          if (((th) this).field_c == var2) {
            return null;
          } else {
            var2.b(false);
            return var2;
          }
        } else {
          field_g = null;
          if (((th) this).field_c == var2) {
            return null;
          } else {
            var2.b(false);
            return var2;
          }
        }
    }

    public th() {
        ((th) this).field_c = new rk();
        ((th) this).field_c.field_l = ((th) this).field_c;
        ((th) this).field_c.field_i = ((th) this).field_c;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new bh(14, 0, 4, 1);
        field_b = "Just play";
    }
}
