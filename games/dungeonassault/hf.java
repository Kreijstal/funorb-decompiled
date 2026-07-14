/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class hf extends sj {
    static nh field_pb;
    private int field_jb;
    private lm field_xb;
    private int field_lb;
    static String field_ub;
    static md field_ob;
    static int field_sb;
    private int field_qb;
    private int field_tb;
    private sd field_rb;
    private fb field_kb;
    static ad field_wb;
    static ed field_nb;
    static eh field_ib;
    static cn field_Ab;
    private int field_vb;
    static int[] field_yb;
    static String field_zb;
    static pp field_mb;

    private final void b(lm param0, byte param1) {
        int var3 = 0;
        L0: {
          if (((hf) this).field_rb == null) {
            break L0;
          } else {
            ((hf) this).field_rb.a(false);
            break L0;
          }
        }
        var3 = -47 / ((param1 - 32) / 42);
        if (param0 != null) {
          param0.b(0, param0.field_x, ((hf) this).field_tb + 6, 6, param0.field_s);
          ((hf) this).field_rb = new sd(param0);
          ((hf) this).b((byte) -57, (lm) (Object) ((hf) this).field_rb);
          ((hf) this).field_xb = null;
          return;
        } else {
          ((hf) this).field_rb = new sd();
          ((hf) this).b((byte) -57, (lm) (Object) ((hf) this).field_rb);
          ((hf) this).field_xb = null;
          return;
        }
    }

    hf(ji param0, lm param1, int param2, int param3, int param4) {
        super(param0, 12 - -param1.field_x, param1.field_s + (param2 + 12));
        ((hf) this).field_qb = param3;
        ((hf) this).field_jb = param3;
        ((hf) this).field_tb = param2;
        ((hf) this).field_vb = param4;
        this.b(param1, (byte) 98);
    }

    final static void i(byte param0) {
        Object var1 = null;
        Throwable var2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (null != in.field_C) {
                        statePc = 4;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    if (param0 <= -5) {
                        statePc = 3;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    field_ib = null;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    return;
                }
                case 4: {
                    var1 = (Object) (Object) in.field_C;
                    // monitorenter in.field_C
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        in.field_C = null;
                        // monitorexit var1
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 6: {
                    if (param0 <= -5) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    field_ib = null;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    return;
                }
                case 9: {
                    try {
                        var2 = caughtException;
                        // monitorexit var1
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 10: {
                    throw (RuntimeException) (Object) var2;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final boolean i(int param0) {
        ((hf) this).h((byte) 99);
        if (param0 != 462) {
            return true;
        }
        return super.i(param0 ^ 0);
    }

    boolean a(lm param0, char param1, int param2, byte param3) {
        if (param3 >= 55) {
          if (!super.a(param0, param1, param2, (byte) 124)) {
            if (((hf) this).field_rb != null) {
              if (98 != param2) {
                if ((param2 ^ -1) != -100) {
                  return false;
                } else {
                  boolean discarded$6 = ((hf) this).field_rb.a(34, param0);
                  return false;
                }
              } else {
                L0: {
                  boolean discarded$7 = ((hf) this).field_rb.a(34, param0);
                  if ((param2 ^ -1) == -100) {
                    boolean discarded$8 = ((hf) this).field_rb.a(34, param0);
                    break L0;
                  } else {
                    break L0;
                  }
                }
                return false;
              }
            } else {
              return false;
            }
          } else {
            return true;
          }
        } else {
          ((hf) this).field_rb = null;
          if (!super.a(param0, param1, param2, (byte) 124)) {
            if (((hf) this).field_rb != null) {
              if (98 != param2) {
                if ((param2 ^ -1) != -100) {
                  return false;
                } else {
                  boolean discarded$9 = ((hf) this).field_rb.a(34, param0);
                  return false;
                }
              } else {
                L1: {
                  boolean discarded$10 = ((hf) this).field_rb.a(34, param0);
                  if ((param2 ^ -1) == -100) {
                    boolean discarded$11 = ((hf) this).field_rb.a(34, param0);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                return false;
              }
            } else {
              return false;
            }
          } else {
            return true;
          }
        }
    }

    final void h(byte param0) {
        int var2 = -105 % ((22 - param0) / 35);
        if (!(((hf) this).field_kb == null)) {
            if (!(((hf) this).field_kb == lp.field_o)) {
                ((hf) this).b(-30, ((hf) this).field_xb.field_s + (12 - -((hf) this).field_tb), ((hf) this).field_xb.field_x + 12);
                this.b(((hf) this).field_xb, (byte) -74);
            }
            ((hf) this).field_rb.field_H = 256;
            ((hf) this).field_kb = null;
        }
        super.h((byte) -89);
    }

    final void k(int param0) {
        if (!(hi.field_b != ((hf) this).field_kb)) {
            return;
        }
        ((hf) this).field_lb = 0;
        ((hf) this).field_kb = lp.field_o;
        this.b(((hf) this).field_xb, (byte) 100);
        ((hf) this).field_rb.field_H = param0;
        ((hf) this).field_xb = null;
    }

    void b(int param0, lm param1) {
        ((hf) this).field_xb = param1;
        if (ec.field_i == ((hf) this).field_kb) {
          ((hf) this).b(12 - -((hf) this).field_xb.field_x, ((hf) this).field_vb, ((hf) this).field_xb.field_s + ((hf) this).field_tb + 12, 22284);
          ((hf) this).field_lb = 0;
          if (param0 != 1) {
            ((hf) this).field_xb = null;
            return;
          } else {
            return;
          }
        } else {
          if (hi.field_b != ((hf) this).field_kb) {
            ((hf) this).field_kb = hi.field_b;
            ((hf) this).field_lb = 0;
            if (param0 == 1) {
              return;
            } else {
              ((hf) this).field_xb = null;
              return;
            }
          } else {
            if (param0 == 1) {
              return;
            } else {
              ((hf) this).field_xb = null;
              return;
            }
          }
        }
    }

    public static void m(int param0) {
        field_pb = null;
        field_Ab = null;
        field_zb = null;
        field_wb = null;
        field_mb = null;
        field_yb = null;
        field_nb = null;
        field_ub = null;
        field_ob = null;
        field_ib = null;
        if (param0 != 0) {
            field_Ab = null;
        }
    }

    boolean f(byte param0) {
        int var3 = 0;
        var3 = DungeonAssault.field_K;
        if (((hf) this).field_kb != null) {
          if (((hf) this).field_kb == hi.field_b) {
            ((hf) this).field_lb = ((hf) this).field_lb + 1;
            if (((hf) this).field_lb + 1 != ((hf) this).field_jb) {
              ((hf) this).field_rb.field_H = 256 + -((((hf) this).field_lb << 1377236968) / ((hf) this).field_jb);
              if (param0 != -90) {
                return false;
              } else {
                return super.f((byte) -90);
              }
            } else {
              ((hf) this).field_kb = ec.field_i;
              ((hf) this).b(12 - -((hf) this).field_xb.field_x, ((hf) this).field_vb, ((hf) this).field_tb + 12 - -((hf) this).field_xb.field_s, param0 ^ -22358);
              ((hf) this).field_lb = 0;
              ((hf) this).field_rb.field_H = 0;
              if (param0 != -90) {
                return false;
              } else {
                return super.f((byte) -90);
              }
            }
          } else {
            if (lp.field_o == ((hf) this).field_kb) {
              ((hf) this).field_lb = ((hf) this).field_lb + 1;
              if (((hf) this).field_lb + 1 == ((hf) this).field_qb) {
                ((hf) this).field_kb = null;
                ((hf) this).field_rb.field_H = 256;
                if (param0 != -90) {
                  return false;
                } else {
                  return super.f((byte) -90);
                }
              } else {
                ((hf) this).field_rb.field_H = (((hf) this).field_lb << 203271624) / ((hf) this).field_qb;
                if (param0 != -90) {
                  return false;
                } else {
                  return super.f((byte) -90);
                }
              }
            } else {
              if (param0 != -90) {
                return false;
              } else {
                return super.f((byte) -90);
              }
            }
          }
        } else {
          if (param0 != -90) {
            return false;
          } else {
            return super.f((byte) -90);
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_ub = "Username: ";
        field_ob = new md();
        field_zb = "Names should contain a maximum of 12 characters";
        field_yb = new int[16384];
        field_wb = new ad(13, 0, 1, 0);
    }
}
