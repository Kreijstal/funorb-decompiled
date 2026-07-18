/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class sj extends ug {
    private int field_hb;
    static String field_kb;
    private rf field_ib;
    private int field_ob;
    private int field_mb;
    private me field_lb;
    static String field_pb;
    private int field_qb;
    static int[] field_rb;
    private fj field_nb;
    private int field_jb;

    boolean a(fj param0, byte param1, int param2, char param3) {
        int var5_int = 0;
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
            var5_int = 28;
            if (!super.a(param0, (byte) 115, param2, param3)) {
              if (((sj) this).field_lb != null) {
                L1: {
                  if (param2 != 98) {
                    break L1;
                  } else {
                    boolean discarded$4 = ((sj) this).field_lb.a(param0, 418);
                    break L1;
                  }
                }
                L2: {
                  if (param2 != 99) {
                    break L2;
                  } else {
                    boolean discarded$5 = ((sj) this).field_lb.a(param0, 418);
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
            stackOut_11_1 = new StringBuilder().append("sj.Q(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
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
          throw sd.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + -2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_10_0 != 0;
    }

    private final void a(boolean param0, fj param1) {
        try {
            if (!(null == ((sj) this).field_lb)) {
                ((sj) this).field_lb.a(true);
            }
            if (param1 != null) {
                param1.a(-110, param1.field_F, 6 + ((sj) this).field_ob, param1.field_z, 6);
                ((sj) this).field_lb = new me(param1);
            } else {
                ((sj) this).field_lb = new me();
            }
            ((sj) this).b((fj) (Object) ((sj) this).field_lb, 10);
            ((sj) this).field_nb = null;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "sj.HB(" + true + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void m(int param0) {
        L0: {
          if (((sj) this).field_ib != null) {
            L1: {
              if (cl.field_S != ((sj) this).field_ib) {
                ((sj) this).a(-41, ((sj) this).field_nb.field_z + ((sj) this).field_ob + 12, ((sj) this).field_nb.field_F + 12);
                this.a(true, ((sj) this).field_nb);
                break L1;
              } else {
                break L1;
              }
            }
            ((sj) this).field_lb.field_K = 256;
            ((sj) this).field_ib = null;
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 <= 53) {
          boolean discarded$2 = ((sj) this).j(-110);
          super.m(61);
          return;
        } else {
          super.m(61);
          return;
        }
    }

    sj(sh param0, fj param1, int param2, int param3, int param4) {
        super(param0, 12 + param1.field_F, param1.field_z + 12 - -param2);
        try {
            ((sj) this).field_hb = param4;
            ((sj) this).field_ob = param2;
            ((sj) this).field_qb = param3;
            ((sj) this).field_jb = param3;
            this.a(true, param1);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "sj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    boolean l(int param0) {
        int var3 = 0;
        var3 = Confined.field_J ? 1 : 0;
        if (null != ((sj) this).field_ib) {
          if (((sj) this).field_ib != c.field_s) {
            if (((sj) this).field_ib == cl.field_S) {
              int fieldTemp$2 = ((sj) this).field_mb + 1;
              ((sj) this).field_mb = ((sj) this).field_mb + 1;
              if (((sj) this).field_qb == fieldTemp$2) {
                ((sj) this).field_lb.field_K = 256;
                ((sj) this).field_ib = null;
                return super.l(-6);
              } else {
                ((sj) this).field_lb.field_K = (((sj) this).field_mb << 8) / ((sj) this).field_qb;
                return super.l(-6);
              }
            } else {
              return super.l(-6);
            }
          } else {
            int fieldTemp$3 = ((sj) this).field_mb + 1;
            ((sj) this).field_mb = ((sj) this).field_mb + 1;
            if (((sj) this).field_jb != fieldTemp$3) {
              ((sj) this).field_lb.field_K = -((((sj) this).field_mb << 8) / ((sj) this).field_jb) + 256;
              return super.l(-6);
            } else {
              ((sj) this).field_ib = sc.field_a;
              ((sj) this).a(((sj) this).field_nb.field_z + (((sj) this).field_ob + 12), ((sj) this).field_hb, 6, ((sj) this).field_nb.field_F + 12);
              ((sj) this).field_lb.field_K = 0;
              ((sj) this).field_mb = 0;
              return super.l(-6);
            }
          }
        } else {
          return super.l(-6);
        }
    }

    public static void h(byte param0) {
        field_kb = null;
        field_pb = null;
        if (param0 <= 6) {
            sj.h((byte) -55);
            field_rb = null;
            return;
        }
        field_rb = null;
    }

    final void g(byte param0) {
        if (((sj) this).field_ib == c.field_s) {
          return;
        } else {
          ((sj) this).field_ib = cl.field_S;
          ((sj) this).field_mb = 0;
          this.a(true, ((sj) this).field_nb);
          if (param0 > -6) {
            ((sj) this).g((byte) -58);
            ((sj) this).field_nb = null;
            ((sj) this).field_lb.field_K = 0;
            return;
          } else {
            ((sj) this).field_nb = null;
            ((sj) this).field_lb.field_K = 0;
            return;
          }
        }
    }

    final boolean j(int param0) {
        if (param0 > -35) {
          field_rb = null;
          ((sj) this).m(107);
          return super.j(-97);
        } else {
          ((sj) this).m(107);
          return super.j(-97);
        }
    }

    void a(fj param0, byte param1) {
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
              ((sj) this).field_nb = param0;
              if (((sj) this).field_ib != sc.field_a) {
                if (((sj) this).field_ib == c.field_s) {
                  break L1;
                } else {
                  ((sj) this).field_ib = c.field_s;
                  ((sj) this).field_mb = 0;
                  break L1;
                }
              } else {
                ((sj) this).a(12 - (-((sj) this).field_ob - ((sj) this).field_nb.field_z), ((sj) this).field_hb, 6, 12 + ((sj) this).field_nb.field_F);
                ((sj) this).field_mb = 0;
                break L1;
              }
            }
            if (param1 == -72) {
              break L0;
            } else {
              ((sj) this).m(47);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("sj.HA(");
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
          throw sd.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param1 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_kb = "Logging in...";
        field_pb = "HARD";
    }
}
