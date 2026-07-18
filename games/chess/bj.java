/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class bj extends k {
    private int field_fb;
    static rl field_cb;
    private int field_hb;
    static ci field_jb;
    private int field_qb;
    private mf field_ib;
    private ag field_lb;
    static String[] field_pb;
    private int field_nb;
    static km[] field_db;
    static ci field_ob;
    static rk[] field_bb;
    private int field_mb;
    static int field_gb;
    private lf field_kb;
    static ci field_eb;

    final void i(byte param0) {
        if (param0 >= -84) {
            field_jb = null;
            if (((bj) this).field_lb == null) {
                super.i((byte) -123);
                return;
            }
            if (((bj) this).field_lb != cf.field_Tb) {
                ((bj) this).a(((bj) this).field_ib.field_y + 12, (byte) 71, ((bj) this).field_ib.field_C + (12 + ((bj) this).field_qb));
                this.b(((bj) this).field_ib, (byte) -94);
            } else {
                ((bj) this).field_lb = null;
                ((bj) this).field_kb.field_R = 256;
                super.i((byte) -123);
                return;
            }
            ((bj) this).field_lb = null;
            ((bj) this).field_kb.field_R = 256;
            super.i((byte) -123);
            return;
        }
        if (((bj) this).field_lb == null) {
            super.i((byte) -123);
            return;
        }
        if (((bj) this).field_lb != cf.field_Tb) {
            ((bj) this).a(((bj) this).field_ib.field_y + 12, (byte) 71, ((bj) this).field_ib.field_C + (12 + ((bj) this).field_qb));
            this.b(((bj) this).field_ib, (byte) -94);
        } else {
            ((bj) this).field_lb = null;
            ((bj) this).field_kb.field_R = 256;
            super.i((byte) -123);
            return;
        }
        ((bj) this).field_lb = null;
        ((bj) this).field_kb.field_R = 256;
        super.i((byte) -123);
    }

    boolean g(byte param0) {
        int var3 = 0;
        var3 = Chess.field_G;
        if (((bj) this).field_lb != null) {
          if (sg.field_f != ((bj) this).field_lb) {
            if (cf.field_Tb == ((bj) this).field_lb) {
              int fieldTemp$2 = ((bj) this).field_fb + 1;
              ((bj) this).field_fb = ((bj) this).field_fb + 1;
              if (((bj) this).field_mb == fieldTemp$2) {
                ((bj) this).field_kb.field_R = 256;
                ((bj) this).field_lb = null;
                return super.g((byte) -52);
              } else {
                ((bj) this).field_kb.field_R = (((bj) this).field_fb << 8) / ((bj) this).field_mb;
                return super.g((byte) -52);
              }
            } else {
              return super.g((byte) -52);
            }
          } else {
            int fieldTemp$3 = ((bj) this).field_fb + 1;
            ((bj) this).field_fb = ((bj) this).field_fb + 1;
            if (fieldTemp$3 == ((bj) this).field_hb) {
              ((bj) this).field_lb = ga.field_b;
              ((bj) this).b(((bj) this).field_nb, ((bj) this).field_qb + 12 - -((bj) this).field_ib.field_C, -18807, ((bj) this).field_ib.field_y + 12);
              ((bj) this).field_kb.field_R = 0;
              ((bj) this).field_fb = 0;
              return super.g((byte) -52);
            } else {
              ((bj) this).field_kb.field_R = 256 - (((bj) this).field_fb << 8) / ((bj) this).field_hb;
              return super.g((byte) -52);
            }
          }
        } else {
          return super.g((byte) -52);
        }
    }

    bj(fm param0, mf param1, int param2, int param3, int param4) {
        super(param0, param1.field_y + 12, param1.field_C + (param2 + 12));
        try {
            ((bj) this).field_qb = param2;
            ((bj) this).field_mb = param3;
            ((bj) this).field_hb = param3;
            ((bj) this).field_nb = param4;
            this.b(param1, (byte) -119);
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "bj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final boolean a(int param0) {
        ((bj) this).i((byte) -106);
        if (param0 < 46) {
            return true;
        }
        return super.a(119);
    }

    private final void b(mf param0, byte param1) {
        try {
            if (null != ((bj) this).field_kb) {
                ((bj) this).field_kb.c(-2193);
            }
            if (param0 != null) {
                param0.a(((bj) this).field_qb + 6, 34, param0.field_C, param0.field_y, 6);
                ((bj) this).field_kb = new lf(param0);
            } else {
                ((bj) this).field_kb = new lf();
            }
            ((bj) this).b((mf) (Object) ((bj) this).field_kb, 95);
            if (param1 > -18) {
                ((bj) this).i((byte) -62);
            }
            ((bj) this).field_ib = null;
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "bj.W(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void j(int param0) {
        if (param0 != 194) {
            return;
        }
        if (!(((bj) this).field_lb != sg.field_f)) {
            return;
        }
        ((bj) this).field_fb = 0;
        ((bj) this).field_lb = cf.field_Tb;
        this.b(((bj) this).field_ib, (byte) -27);
        ((bj) this).field_kb.field_R = 0;
        ((bj) this).field_ib = null;
    }

    boolean a(char param0, int param1, int param2, mf param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (!super.a(param0, param1, -1, param3)) {
              if (((bj) this).field_kb != null) {
                L1: {
                  if (param1 != 98) {
                    break L1;
                  } else {
                    boolean discarded$4 = ((bj) this).field_kb.a(0, param3);
                    break L1;
                  }
                }
                L2: {
                  if (param1 != 99) {
                    break L2;
                  } else {
                    boolean discarded$5 = ((bj) this).field_kb.a(0, param3);
                    break L2;
                  }
                }
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                return false;
              }
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var5;
            stackOut_11_1 = new StringBuilder().append("bj.KA(").append(param0).append(',').append(param1).append(',').append(-1).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
        return stackIn_10_0 != 0;
    }

    final static int c(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        var4 = Chess.field_G;
        try {
          L0: {
            var3_int = 1;
            L1: while (true) {
              if (param0 <= 1) {
                if (1 == param0) {
                  stackOut_10_0 = var3_int * param2;
                  stackIn_11_0 = stackOut_10_0;
                  break L0;
                } else {
                  return var3_int;
                }
              } else {
                L2: {
                  if ((1 & param0) == 0) {
                    break L2;
                  } else {
                    var3_int = var3_int * param2;
                    break L2;
                  }
                }
                param0 = param0 >> 1;
                param2 = param2 * param2;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fk.a((Throwable) (Object) var3, "bj.R(" + param0 + ',' + -12076 + ',' + param2 + ')');
        }
        return stackIn_11_0;
    }

    public static void k() {
        field_eb = null;
        field_cb = null;
        field_db = null;
        field_pb = null;
        field_ob = null;
        field_bb = null;
        field_jb = null;
    }

    final static void a(na param0) {
        try {
            ef.field_n.a((o) (Object) new tn(param0, (o) (Object) param0), (byte) -57);
            h.field_s.a((nm) (Object) param0);
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "bj.S(" + (param0 != null ? "{...}" : "null") + ',' + true + ')');
        }
    }

    void c(mf param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            ((bj) this).field_ib = param0;
            if (param1 > 45) {
              if (((bj) this).field_lb == ga.field_b) {
                ((bj) this).b(((bj) this).field_nb, ((bj) this).field_ib.field_C + ((bj) this).field_qb + 12, -18807, ((bj) this).field_ib.field_y + 12);
                ((bj) this).field_fb = 0;
                return;
              } else {
                if (((bj) this).field_lb == sg.field_f) {
                  break L0;
                } else {
                  ((bj) this).field_lb = sg.field_f;
                  ((bj) this).field_fb = 0;
                  return;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("bj.T(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L1;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L1;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param1 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_cb = new rl();
    }
}
