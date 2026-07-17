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
        try {
            if (((hf) this).field_rb != null) {
                ((hf) this).field_rb.a(false);
            }
            int var3_int = -47 / ((param1 - 32) / 42);
            if (param0 != null) {
                param0.b(0, param0.field_x, ((hf) this).field_tb + 6, 6, param0.field_s);
                ((hf) this).field_rb = new sd(param0);
            } else {
                ((hf) this).field_rb = new sd();
            }
            ((hf) this).b((byte) -57, (lm) (Object) ((hf) this).field_rb);
            ((hf) this).field_xb = null;
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "hf.C(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    hf(ji param0, lm param1, int param2, int param3, int param4) {
        super(param0, 12 - -param1.field_x, param1.field_s + (param2 + 12));
        try {
            ((hf) this).field_qb = param3;
            ((hf) this).field_jb = param3;
            ((hf) this).field_tb = param2;
            ((hf) this).field_vb = param4;
            this.b(param1, (byte) 98);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "hf.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final static void i() {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        if (null != in.field_C) {
          var1 = (Object) (Object) in.field_C;
          synchronized (var1) {
            L0: {
              in.field_C = null;
              break L0;
            }
          }
          return;
        } else {
          return;
        }
    }

    final boolean i(int param0) {
        ((hf) this).h((byte) 99);
        if (param0 != 462) {
            return true;
        }
        return super.i(param0);
    }

    boolean a(lm param0, char param1, int param2, byte param3) {
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
            if (!super.a(param0, param1, param2, (byte) 124)) {
              L1: {
                if (((hf) this).field_rb == null) {
                  break L1;
                } else {
                  L2: {
                    if (98 != param2) {
                      break L2;
                    } else {
                      boolean discarded$4 = ((hf) this).field_rb.a(34, param0);
                      break L2;
                    }
                  }
                  if (param2 == 99) {
                    boolean discarded$5 = ((hf) this).field_rb.a(34, param0);
                    break L1;
                  } else {
                    return false;
                  }
                }
              }
              stackOut_9_0 = 0;
              stackIn_10_0 = stackOut_9_0;
              break L0;
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
            stackOut_11_1 = new StringBuilder().append("hf.W(");
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
          throw vk.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param1 + 44 + param2 + 44 + 92 + 41);
        }
        return stackIn_10_0 != 0;
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
              ((hf) this).field_xb = param1;
              if (ec.field_i == ((hf) this).field_kb) {
                ((hf) this).b(12 - -((hf) this).field_xb.field_x, ((hf) this).field_vb, ((hf) this).field_xb.field_s + ((hf) this).field_tb + 12, 22284);
                ((hf) this).field_lb = 0;
                break L1;
              } else {
                if (hi.field_b != ((hf) this).field_kb) {
                  ((hf) this).field_kb = hi.field_b;
                  ((hf) this).field_lb = 0;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            if (param0 == 1) {
              break L0;
            } else {
              ((hf) this).field_xb = null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("hf.L(").append(param0).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
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
          throw vk.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
    }

    public static void m() {
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
    }

    boolean f(byte param0) {
        int var3 = 0;
        var3 = DungeonAssault.field_K;
        if (((hf) this).field_kb != null) {
          if (((hf) this).field_kb == hi.field_b) {
            int fieldTemp$2 = ((hf) this).field_lb + 1;
            ((hf) this).field_lb = ((hf) this).field_lb + 1;
            if (fieldTemp$2 == ((hf) this).field_jb) {
              ((hf) this).field_kb = ec.field_i;
              ((hf) this).b(12 - -((hf) this).field_xb.field_x, ((hf) this).field_vb, ((hf) this).field_tb + 12 - -((hf) this).field_xb.field_s, 22284);
              ((hf) this).field_lb = 0;
              ((hf) this).field_rb.field_H = 0;
              return super.f((byte) -90);
            } else {
              ((hf) this).field_rb.field_H = 256 + -((((hf) this).field_lb << 8) / ((hf) this).field_jb);
              return super.f((byte) -90);
            }
          } else {
            if (lp.field_o == ((hf) this).field_kb) {
              int fieldTemp$3 = ((hf) this).field_lb + 1;
              ((hf) this).field_lb = ((hf) this).field_lb + 1;
              if (fieldTemp$3 != ((hf) this).field_qb) {
                ((hf) this).field_rb.field_H = (((hf) this).field_lb << 8) / ((hf) this).field_qb;
                return super.f((byte) -90);
              } else {
                ((hf) this).field_kb = null;
                ((hf) this).field_rb.field_H = 256;
                return super.f((byte) -90);
              }
            } else {
              return super.f((byte) -90);
            }
          }
        } else {
          return super.f((byte) -90);
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
