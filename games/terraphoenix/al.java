/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class al extends ei {
    static java.awt.Frame field_W;
    private int field_X;
    private jl field_Z;
    private int field_ab;
    private gl field_Y;
    private int field_eb;
    private int field_db;
    private rj field_fb;
    private int field_cb;
    static int[] field_bb;

    final boolean i(int param0) {
        ((al) this).j(-2065096856);
        int var2 = -40 / ((param0 - -2) / 63);
        return super.i(61);
    }

    final static ci[] a() {
        int discarded$0 = 65793;
        int discarded$1 = 0;
        int discarded$2 = 1;
        int discarded$3 = 1;
        int discarded$4 = 0;
        int discarded$5 = 3;
        int discarded$6 = 1;
        int discarded$7 = 1;
        int discarded$8 = 0;
        return oh.a();
    }

    private final void b(gl param0) {
        try {
            if (((al) this).field_Z != null) {
                ((al) this).field_Z.b((byte) 12);
            }
            if (param0 == null) {
                ((al) this).field_Z = new jl();
            } else {
                param0.a(6 - -((al) this).field_cb, (byte) 53, param0.field_p, 6, param0.field_n);
                ((al) this).field_Z = new jl(param0);
            }
            ((al) this).b((byte) 95, (gl) (Object) ((al) this).field_Z);
            ((al) this).field_Y = null;
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "al.RA(" + (param0 != null ? "{...}" : "null") + ',' + -68 + ')');
        }
    }

    void a(gl param0, int param1) {
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
              ((al) this).field_Y = param0;
              if (param1 < -21) {
                break L1;
              } else {
                field_bb = null;
                break L1;
              }
            }
            if (qb.field_h == ((al) this).field_fb) {
              ((al) this).a(((al) this).field_eb, ((al) this).field_Y.field_p + 12, 12 + ((al) this).field_cb + ((al) this).field_Y.field_n, (byte) -80);
              ((al) this).field_ab = 0;
              return;
            } else {
              if (((al) this).field_fb == hl.field_b) {
                break L0;
              } else {
                ((al) this).field_ab = 0;
                ((al) this).field_fb = hl.field_b;
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("al.O(");
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
          throw qk.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param1 + ')');
        }
    }

    final void g(byte param0) {
        if (hl.field_b == ((al) this).field_fb) {
          return;
        } else {
          ((al) this).field_fb = dc.field_n;
          if (param0 != 109) {
            ((al) this).field_ab = 3;
            ((al) this).field_ab = 0;
            int discarded$4 = -68;
            this.b(((al) this).field_Y);
            ((al) this).field_Y = null;
            ((al) this).field_Z.field_J = 0;
            return;
          } else {
            ((al) this).field_ab = 0;
            int discarded$5 = -68;
            this.b(((al) this).field_Y);
            ((al) this).field_Y = null;
            ((al) this).field_Z.field_J = 0;
            return;
          }
        }
    }

    al(d param0, gl param1, int param2, int param3, int param4) {
        super(param0, 12 + param1.field_p, param1.field_n + (param2 + 12));
        try {
            ((al) this).field_cb = param2;
            ((al) this).field_db = param3;
            ((al) this).field_X = param3;
            ((al) this).field_eb = param4;
            int discarded$0 = -68;
            this.b(param1);
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "al.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void j(int param0) {
        if (!(null == ((al) this).field_fb)) {
            if (!(((al) this).field_fb == dc.field_n)) {
                ((al) this).b(98, ((al) this).field_cb + 12 - -((al) this).field_Y.field_n, 12 - -((al) this).field_Y.field_p);
                int discarded$0 = -68;
                this.b(((al) this).field_Y);
            }
            ((al) this).field_fb = null;
            ((al) this).field_Z.field_J = 256;
        }
        super.j(param0);
    }

    public static void k() {
        field_bb = null;
        field_W = null;
    }

    boolean f(byte param0) {
        int var3 = 0;
        var3 = Terraphoenix.field_V;
        if (null != ((al) this).field_fb) {
          if (hl.field_b != ((al) this).field_fb) {
            if (dc.field_n == ((al) this).field_fb) {
              int fieldTemp$2 = ((al) this).field_ab + 1;
              ((al) this).field_ab = ((al) this).field_ab + 1;
              if (fieldTemp$2 != ((al) this).field_db) {
                ((al) this).field_Z.field_J = (((al) this).field_ab << 8) / ((al) this).field_db;
                return super.f((byte) -121);
              } else {
                ((al) this).field_fb = null;
                ((al) this).field_Z.field_J = 256;
                return super.f((byte) -121);
              }
            } else {
              return super.f((byte) -121);
            }
          } else {
            int fieldTemp$3 = ((al) this).field_ab + 1;
            ((al) this).field_ab = ((al) this).field_ab + 1;
            if (fieldTemp$3 != ((al) this).field_X) {
              ((al) this).field_Z.field_J = -((((al) this).field_ab << 8) / ((al) this).field_X) + 256;
              return super.f((byte) -121);
            } else {
              ((al) this).field_fb = qb.field_h;
              ((al) this).a(((al) this).field_eb, 12 - -((al) this).field_Y.field_p, 12 - (-((al) this).field_cb - ((al) this).field_Y.field_n), (byte) -80);
              ((al) this).field_Z.field_J = 0;
              ((al) this).field_ab = 0;
              return super.f((byte) -121);
            }
          }
        } else {
          return super.f((byte) -121);
        }
    }

    boolean a(char param0, gl param1, int param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
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
          if (!super.a(param0, param1, 30, param3)) {
            L0: {
              if (null == ((al) this).field_Z) {
                break L0;
              } else {
                L1: {
                  if (98 != param3) {
                    break L1;
                  } else {
                    boolean discarded$4 = ((al) this).field_Z.a((byte) 80, param1);
                    break L1;
                  }
                }
                if (99 == param3) {
                  boolean discarded$5 = ((al) this).field_Z.a((byte) 73, param1);
                  break L0;
                } else {
                  return false;
                }
              }
            }
            return false;
          } else {
            stackOut_1_0 = 1;
            stackIn_2_0 = stackOut_1_0;
            return stackIn_2_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var5;
            stackOut_11_1 = new StringBuilder().append("al.K(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + 30 + ',' + param3 + ')');
        }
    }

    static {
    }
}
