/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class fe extends bj {
    private sk field_mb;
    private int field_cb;
    static int field_ob;
    private int field_fb;
    static mh field_gb;
    static mf field_jb;
    static String field_ib;
    private oc field_eb;
    static og field_kb;
    private int field_db;
    private int field_bb;
    static int field_pb;
    static String field_hb;
    private mi field_nb;
    private int field_lb;

    void b(byte param0, oc param1) {
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
            L1: {
              ((fe) this).field_eb = param1;
              if (dm.field_e != ((fe) this).field_nb) {
                if (((fe) this).field_nb == bh.field_qb) {
                  break L1;
                } else {
                  ((fe) this).field_nb = bh.field_qb;
                  ((fe) this).field_fb = 0;
                  break L1;
                }
              } else {
                ((fe) this).a((byte) -116, ((fe) this).field_lb, ((fe) this).field_db + (12 - -((fe) this).field_eb.field_s), ((fe) this).field_eb.field_t + 12);
                ((fe) this).field_fb = 0;
                break L1;
              }
            }
            if (param0 > 105) {
              break L0;
            } else {
              field_hb = null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("fe.C(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
    }

    final void j(int param0) {
        if (((fe) this).field_nb == null) {
            super.j(param0);
            return;
        }
        if (((fe) this).field_nb != gq.field_Xb) {
            ((fe) this).a(true, ((fe) this).field_db + 12 + ((fe) this).field_eb.field_s, 12 + ((fe) this).field_eb.field_t);
            this.a((byte) 56, ((fe) this).field_eb);
        } else {
            ((fe) this).field_nb = null;
            ((fe) this).field_mb.field_K = 256;
            super.j(param0);
            return;
        }
        ((fe) this).field_nb = null;
        ((fe) this).field_mb.field_K = 256;
        super.j(param0);
    }

    boolean h(int param0) {
        int var3 = 0;
        var3 = BrickABrac.field_J ? 1 : 0;
        if (((fe) this).field_nb != null) {
          if (((fe) this).field_nb == bh.field_qb) {
            int fieldTemp$2 = ((fe) this).field_fb + 1;
            ((fe) this).field_fb = ((fe) this).field_fb + 1;
            if (fieldTemp$2 == ((fe) this).field_cb) {
              ((fe) this).field_nb = dm.field_e;
              ((fe) this).a((byte) -116, ((fe) this).field_lb, ((fe) this).field_eb.field_s + (((fe) this).field_db + 12), 12 + ((fe) this).field_eb.field_t);
              ((fe) this).field_mb.field_K = 0;
              ((fe) this).field_fb = 0;
              return super.h(0);
            } else {
              ((fe) this).field_mb.field_K = 256 + -((((fe) this).field_fb << 8) / ((fe) this).field_cb);
              return super.h(0);
            }
          } else {
            if (((fe) this).field_nb == gq.field_Xb) {
              int fieldTemp$3 = ((fe) this).field_fb + 1;
              ((fe) this).field_fb = ((fe) this).field_fb + 1;
              if (((fe) this).field_bb != fieldTemp$3) {
                ((fe) this).field_mb.field_K = (((fe) this).field_fb << 8) / ((fe) this).field_bb;
                return super.h(0);
              } else {
                ((fe) this).field_nb = null;
                ((fe) this).field_mb.field_K = 256;
                return super.h(0);
              }
            } else {
              return super.h(0);
            }
          }
        } else {
          return super.h(0);
        }
    }

    private final void a(byte param0, oc param1) {
        if (null != ((fe) this).field_mb) {
            ((fe) this).field_mb.b((byte) 111);
        }
        if (param1 == null) {
            ((fe) this).field_mb = new sk();
        } else {
            param1.a(param1.field_s, 6, ((fe) this).field_db + 6, (byte) -119, param1.field_t);
            ((fe) this).field_mb = new sk(param1);
        }
        ((fe) this).a((oc) (Object) ((fe) this).field_mb, true);
        try {
            ((fe) this).field_eb = null;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "fe.F(" + 56 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void k(int param0) {
        if (!(((fe) this).field_nb != bh.field_qb)) {
            return;
        }
        ((fe) this).field_fb = 0;
        ((fe) this).field_nb = gq.field_Xb;
        this.a((byte) 56, ((fe) this).field_eb);
        ((fe) this).field_eb = null;
        ((fe) this).field_mb.field_K = 0;
        if (param0 != -13717) {
            ((fe) this).field_nb = null;
        }
    }

    boolean a(int param0, byte param1, oc param2, char param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            if (!super.a(param0, (byte) 110, param2, param3)) {
              if (null != ((fe) this).field_mb) {
                L1: {
                  if (98 == param0) {
                    boolean discarded$4 = ((fe) this).field_mb.a(true, param2);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (param0 != 99) {
                    break L2;
                  } else {
                    boolean discarded$5 = ((fe) this).field_mb.a(true, param2);
                    break L2;
                  }
                }
                stackOut_10_0 = 0;
                stackIn_11_0 = stackOut_10_0;
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
            stackOut_12_0 = (RuntimeException) var5;
            stackOut_12_1 = new StringBuilder().append("fe.T(").append(param0).append(',').append(110).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param3 + ')');
        }
        return stackIn_11_0 != 0;
    }

    public static void l() {
        field_ib = null;
        field_hb = null;
        field_jb = null;
        field_kb = null;
        field_gb = null;
    }

    fe(cp param0, oc param1, int param2, int param3, int param4) {
        super(param0, 12 + param1.field_t, 12 - -param2 - -param1.field_s);
        try {
            ((fe) this).field_lb = param4;
            ((fe) this).field_db = param2;
            ((fe) this).field_bb = param3;
            ((fe) this).field_cb = param3;
            this.a((byte) 56, param1);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "fe.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final boolean a(int param0) {
        if (param0 >= -22) {
          ((fe) this).field_cb = -1;
          ((fe) this).j(20);
          return super.a(-119);
        } else {
          ((fe) this).j(20);
          return super.a(-119);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_ib = "This game option is not available in rated games.";
        field_hb = "Private";
    }
}
