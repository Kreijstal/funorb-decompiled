/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class fj extends vg {
    static String field_kb;
    private md field_cb;
    static int field_jb;
    static String field_bb;
    private int field_ib;
    private int field_gb;
    private ka field_Z;
    private int field_ab;
    static ce field_eb;
    private int field_fb;
    private int field_db;
    private hm field_hb;

    void a(hm param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              ((fj) this).field_hb = param0;
              if (mc.field_c != ((fj) this).field_Z) {
                if (((fj) this).field_Z != t.field_a) {
                  ((fj) this).field_ab = 0;
                  ((fj) this).field_Z = t.field_a;
                  break L1;
                } else {
                  break L1;
                }
              } else {
                ((fj) this).a(false, ((fj) this).field_ib, 12 + ((fj) this).field_hb.field_g, ((fj) this).field_hb.field_x + ((fj) this).field_fb + 12);
                ((fj) this).field_ab = 0;
                break L1;
              }
            }
            if (param1 == 30) {
              break L0;
            } else {
              boolean discarded$2 = ((fj) this).a((byte) -72);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("fj.D(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw t.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param1 + ')');
        }
    }

    fj(tb param0, hm param1, int param2, int param3, int param4) {
        super(param0, param1.field_g + 12, param1.field_x + (param2 + 12));
        try {
            ((fj) this).field_ib = param4;
            ((fj) this).field_db = param3;
            ((fj) this).field_gb = param3;
            ((fj) this).field_fb = param2;
            this.b((byte) -123, param1);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "fj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final boolean a(byte param0) {
        int var2 = 50 / ((param0 - 7) / 55);
        ((fj) this).b(false);
        return super.a((byte) 112);
    }

    public static void n(int param0) {
        field_kb = null;
        if (param0 != -11555) {
            fj.n(-20);
            field_bb = null;
            field_eb = null;
            return;
        }
        field_bb = null;
        field_eb = null;
    }

    final void b(boolean param0) {
        if (null != ((fj) this).field_Z) {
          if (((fj) this).field_Z == ff.field_b) {
            ((fj) this).field_Z = null;
            ((fj) this).field_cb.field_F = 256;
            super.b(param0);
            return;
          } else {
            ((fj) this).b(255, ((fj) this).field_hb.field_x + 12 - -((fj) this).field_fb, 12 + ((fj) this).field_hb.field_g);
            this.b((byte) -121, ((fj) this).field_hb);
            ((fj) this).field_Z = null;
            ((fj) this).field_cb.field_F = 256;
            super.b(param0);
            return;
          }
        } else {
          super.b(param0);
          return;
        }
    }

    boolean j(int param0) {
        int var3 = 0;
        var3 = EscapeVector.field_A;
        if (null != ((fj) this).field_Z) {
          if (((fj) this).field_Z == t.field_a) {
            int fieldTemp$2 = ((fj) this).field_ab + 1;
            ((fj) this).field_ab = ((fj) this).field_ab + 1;
            if (((fj) this).field_gb != fieldTemp$2) {
              ((fj) this).field_cb.field_F = -((((fj) this).field_ab << 8) / ((fj) this).field_gb) + 256;
              return super.j(-13907);
            } else {
              ((fj) this).field_Z = mc.field_c;
              ((fj) this).a(false, ((fj) this).field_ib, 12 - -((fj) this).field_hb.field_g, 12 - (-((fj) this).field_fb - ((fj) this).field_hb.field_x));
              ((fj) this).field_ab = 0;
              ((fj) this).field_cb.field_F = 0;
              return super.j(-13907);
            }
          } else {
            if (ff.field_b == ((fj) this).field_Z) {
              int fieldTemp$3 = ((fj) this).field_ab + 1;
              ((fj) this).field_ab = ((fj) this).field_ab + 1;
              if (fieldTemp$3 == ((fj) this).field_db) {
                ((fj) this).field_Z = null;
                ((fj) this).field_cb.field_F = 256;
                return super.j(-13907);
              } else {
                ((fj) this).field_cb.field_F = (((fj) this).field_ab << 8) / ((fj) this).field_db;
                return super.j(-13907);
              }
            } else {
              return super.j(-13907);
            }
          }
        } else {
          return super.j(-13907);
        }
    }

    private final void b(byte param0, hm param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              if (((fj) this).field_cb != null) {
                ((fj) this).field_cb.c((byte) -62);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param1 != null) {
                param1.a(param1.field_g, 6 - -((fj) this).field_fb, 6, true, param1.field_x);
                ((fj) this).field_cb = new md(param1);
                break L2;
              } else {
                ((fj) this).field_cb = new md();
                break L2;
              }
            }
            ((fj) this).b((hm) (Object) ((fj) this).field_cb, false);
            ((fj) this).field_hb = null;
            if (param0 <= -72) {
              break L0;
            } else {
              ((fj) this).field_gb = 65;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("fj.A(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw t.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
        }
    }

    boolean a(hm param0, char param1, int param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            if (!super.a(param0, param1, param2, 43)) {
              ((fj) this).field_Z = null;
              if (((fj) this).field_cb != null) {
                L1: {
                  if (98 == param2) {
                    boolean discarded$4 = ((fj) this).field_cb.a(-4659, param0);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (99 == param2) {
                    boolean discarded$5 = ((fj) this).field_cb.a(-4659, param0);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                stackOut_11_0 = 0;
                stackIn_12_0 = stackOut_11_0;
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
            stackOut_13_0 = (RuntimeException) var5;
            stackOut_13_1 = new StringBuilder().append("fj.G(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw t.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param1 + ',' + param2 + ',' + 117 + ')');
        }
        return stackIn_12_0 != 0;
    }

    final void m(int param0) {
        if (!(t.field_a != ((fj) this).field_Z)) {
            return;
        }
        ((fj) this).field_Z = ff.field_b;
        ((fj) this).field_ab = 0;
        this.b((byte) -115, ((fj) this).field_hb);
        int var2 = 41 / ((45 - param0) / 53);
        ((fj) this).field_hb = null;
        ((fj) this).field_cb.field_F = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_kb = "Next";
        field_bb = "Checking";
        field_jb = 10;
    }
}
