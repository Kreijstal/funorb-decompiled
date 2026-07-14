/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class jk extends wf {
    private fe field_hb;
    static int[] field_ib;
    private int field_kb;
    static boolean[] field_gb;
    private gh field_cb;
    private int field_eb;
    static int[] field_db;
    private int field_fb;
    static bg field_jb;
    static String field_lb;
    private int field_mb;
    private int field_Z;
    static int field_ab;
    private oj field_bb;

    final static void a(java.applet.Applet param0, int param1, String param2) {
        try {
            java.net.URL var3 = null;
            if (param1 <= 47) {
                return;
            }
            try {
                var3 = new java.net.URL(param0.getCodeBase(), param2);
                var3 = nn.a(105, param0, var3);
                cn.a(param0, var3.toString(), 11050, true);
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    void a(byte param0, fe param1) {
        ((jk) this).field_hb = param1;
        if (param0 <= -30) {
          if (o.field_a != ((jk) this).field_cb) {
            if (ah.field_a != ((jk) this).field_cb) {
              ((jk) this).field_kb = 0;
              ((jk) this).field_cb = ah.field_a;
              return;
            } else {
              return;
            }
          } else {
            ((jk) this).a(((jk) this).field_mb, true, ((jk) this).field_hb.field_v + 12, ((jk) this).field_hb.field_q + ((jk) this).field_fb + 12);
            ((jk) this).field_kb = 0;
            return;
          }
        } else {
          return;
        }
    }

    final void o(int param0) {
        if (null == ((jk) this).field_cb) {
            super.o(param0);
            return;
        }
        if (lm.field_O != ((jk) this).field_cb) {
            ((jk) this).a(((jk) this).field_hb.field_q + 12 + ((jk) this).field_fb, ((jk) this).field_hb.field_v + 12, (byte) 55);
            this.b(28199, ((jk) this).field_hb);
        } else {
            ((jk) this).field_bb.field_L = 256;
            ((jk) this).field_cb = null;
            super.o(param0);
            return;
        }
        ((jk) this).field_bb.field_L = 256;
        ((jk) this).field_cb = null;
        super.o(param0);
    }

    private final void b(int param0, fe param1) {
        if (!(null == ((jk) this).field_bb)) {
            ((jk) this).field_bb.b(34);
        }
        if (param1 != null) {
            param1.a(param1.field_q, param0 ^ -28163, 6, param1.field_v, ((jk) this).field_fb + 6);
            ((jk) this).field_bb = new oj(param1);
            ((jk) this).a(-1, (fe) (Object) ((jk) this).field_bb);
            if (param0 != 28199) {
                ((jk) this).field_mb = -79;
            } else {
                ((jk) this).field_hb = null;
                return;
            }
            ((jk) this).field_hb = null;
            return;
        }
        ((jk) this).field_bb = new oj();
        ((jk) this).a(-1, (fe) (Object) ((jk) this).field_bb);
        if (param0 != 28199) {
            ((jk) this).field_mb = -79;
        } else {
            ((jk) this).field_hb = null;
            return;
        }
        ((jk) this).field_hb = null;
    }

    public static void h(byte param0) {
        field_jb = null;
        field_ib = null;
        field_gb = null;
        field_db = null;
        field_lb = null;
        int var1 = -24 / ((10 - param0) / 39);
    }

    final static void a(int param0, vf param1, Object param2) {
        Exception var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = MinerDisturbance.field_ab;
                    if (null != param1.field_p) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return;
                }
                case 2: {
                    var3_int = 0;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (-51 >= (var3_int ^ -1)) {
                        statePc = 6;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (null == param1.field_p.peekEvent()) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    gf.a(1L, -10309);
                    var3_int++;
                    statePc = 3;
                    continue stateLoop;
                }
                case 6: {
                    try {
                        if (param0 == -23765) {
                            statePc = 8;
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
                    return;
                }
                case 8: {
                    try {
                        if (param2 == null) {
                            statePc = 12;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        param1.field_p.postEvent((java.awt.AWTEvent) (Object) new java.awt.event.ActionEvent(param2, 1001, "dummy"));
                        return;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 11: {
                    var3 = (Exception) (Object) caughtException;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void b(boolean param0) {
        if (((jk) this).field_cb != ah.field_a) {
          ((jk) this).field_kb = 0;
          ((jk) this).field_cb = lm.field_O;
          this.b(28199, ((jk) this).field_hb);
          ((jk) this).field_bb.field_L = 0;
          if (!param0) {
            return;
          } else {
            ((jk) this).field_hb = null;
            return;
          }
        } else {
          return;
        }
    }

    final boolean a(boolean param0) {
        if (param0) {
            return true;
        }
        ((jk) this).o(24619);
        return super.a(param0);
    }

    boolean a(char param0, fe param1, byte param2, int param3) {
        if (super.a(param0, param1, param2, param3)) {
          return true;
        } else {
          if (((jk) this).field_bb != null) {
            L0: {
              if (98 == param3) {
                boolean discarded$4 = ((jk) this).field_bb.a(param1, param2 + 199);
                break L0;
              } else {
                break L0;
              }
            }
            if (99 != param3) {
              return false;
            } else {
              boolean discarded$5 = ((jk) this).field_bb.a(param1, param2 + 199);
              return false;
            }
          } else {
            return false;
          }
        }
    }

    boolean n(int param0) {
        int var3 = 0;
        var3 = MinerDisturbance.field_ab;
        if (param0 == -4) {
          if (null != ((jk) this).field_cb) {
            if (ah.field_a == ((jk) this).field_cb) {
              ((jk) this).field_kb = ((jk) this).field_kb + 1;
              if (((jk) this).field_kb + 1 != ((jk) this).field_eb) {
                ((jk) this).field_bb.field_L = -((((jk) this).field_kb << -2021282680) / ((jk) this).field_eb) + 256;
                return super.n(param0 + 0);
              } else {
                ((jk) this).field_cb = o.field_a;
                ((jk) this).a(((jk) this).field_mb, true, 12 + ((jk) this).field_hb.field_v, 12 - (-((jk) this).field_fb + -((jk) this).field_hb.field_q));
                ((jk) this).field_bb.field_L = 0;
                ((jk) this).field_kb = 0;
                return super.n(param0 + 0);
              }
            } else {
              if (((jk) this).field_cb == lm.field_O) {
                ((jk) this).field_kb = ((jk) this).field_kb + 1;
                if (((jk) this).field_kb + 1 == ((jk) this).field_Z) {
                  ((jk) this).field_bb.field_L = 256;
                  ((jk) this).field_cb = null;
                  return super.n(param0 + 0);
                } else {
                  ((jk) this).field_bb.field_L = (((jk) this).field_kb << 1022636104) / ((jk) this).field_Z;
                  return super.n(param0 + 0);
                }
              } else {
                return super.n(param0 + 0);
              }
            }
          } else {
            return super.n(param0 + 0);
          }
        } else {
          ((jk) this).field_Z = -38;
          if (null != ((jk) this).field_cb) {
            if (ah.field_a == ((jk) this).field_cb) {
              ((jk) this).field_kb = ((jk) this).field_kb + 1;
              if (((jk) this).field_kb + 1 != ((jk) this).field_eb) {
                ((jk) this).field_bb.field_L = -((((jk) this).field_kb << -2021282680) / ((jk) this).field_eb) + 256;
                return super.n(param0 + 0);
              } else {
                ((jk) this).field_cb = o.field_a;
                ((jk) this).a(((jk) this).field_mb, true, 12 + ((jk) this).field_hb.field_v, 12 - (-((jk) this).field_fb + -((jk) this).field_hb.field_q));
                ((jk) this).field_bb.field_L = 0;
                ((jk) this).field_kb = 0;
                return super.n(param0 + 0);
              }
            } else {
              if (((jk) this).field_cb == lm.field_O) {
                ((jk) this).field_kb = ((jk) this).field_kb + 1;
                if (((jk) this).field_kb + 1 == ((jk) this).field_Z) {
                  ((jk) this).field_bb.field_L = 256;
                  ((jk) this).field_cb = null;
                  return super.n(param0 + 0);
                } else {
                  ((jk) this).field_bb.field_L = (((jk) this).field_kb << 1022636104) / ((jk) this).field_Z;
                  return super.n(param0 + 0);
                }
              } else {
                return super.n(param0 + 0);
              }
            }
          } else {
            return super.n(param0 + 0);
          }
        }
    }

    jk(hm param0, fe param1, int param2, int param3, int param4) {
        super(param0, 12 + param1.field_v, param1.field_q + param2 + 12);
        ((jk) this).field_fb = param2;
        ((jk) this).field_mb = param4;
        ((jk) this).field_Z = param3;
        ((jk) this).field_eb = param3;
        this.b(28199, param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_lb = "Loading Super Volcano...";
        field_ib = new int[128];
        field_ab = 0;
        field_jb = new bg(7, 0, 1, 1);
    }
}
