/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class dg extends rg {
    private hi field_M;
    private int field_K;
    static int[] field_Q;
    private int field_S;
    static String field_L;
    private int field_O;
    private int field_N;
    private of field_R;
    private int field_J;
    private ea field_P;

    final void f(byte param0) {
        if (vu.field_g == this.field_R) {
          return;
        }
        this.field_R = GraphicsRenderer.field_b;
        this.field_K = 0;
        if (param0 < -28) {
          this.c(this.field_P, -15291);
          this.field_P = null;
          this.field_M.field_u = 0;
          return;
        }
        this.h(-95);
        this.c(this.field_P, -15291);
        this.field_P = null;
        this.field_M.field_u = 0;
    }

    final boolean i(int param0) {
        this.e((byte) 82);
        int var2 = -118 / ((20 - param0) / 62);
        return super.i(126);
    }

    final void e(byte param0) {
        if (param0 <= 26) {
          this.h(127);
          if (null == this.field_R) {
            super.e((byte) 101);
            return;
          }
          if (GraphicsRenderer.field_b != this.field_R) {
            this.a(12 + this.field_P.field_q, (byte) 29, this.field_P.field_n + this.field_N + 12);
            this.c(this.field_P, -15291);
          } else {
            this.field_R = null;
            this.field_M.field_u = 256;
            super.e((byte) 101);
            return;
          }
          this.field_R = null;
          this.field_M.field_u = 256;
          super.e((byte) 101);
          return;
        }
        if (null == this.field_R) {
          super.e((byte) 101);
          return;
        }
        if (GraphicsRenderer.field_b != this.field_R) {
          this.a(12 + this.field_P.field_q, (byte) 29, this.field_P.field_n + this.field_N + 12);
          this.c(this.field_P, -15291);
        } else {
          this.field_R = null;
          this.field_M.field_u = 256;
          super.e((byte) 101);
          return;
        }
        this.field_R = null;
        this.field_M.field_u = 256;
        super.e((byte) 101);
    }

    void d(ea param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -30244) {
            this.field_N = -48;
          }
          this.field_P = param0;
          if (this.field_R == we.field_a) {
            this.a(param1 + 30131, this.field_P.field_n + 12 + this.field_N, this.field_P.field_q + 12, this.field_S);
            this.field_K = 0;
            return;
          }
          if (this.field_R == vu.field_g) {
            return;
          }
          this.field_K = 0;
          this.field_R = vu.field_g;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("dg.CA(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    boolean h(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int var3 = AceOfSkies.obfuscationControl ? 1 : 0;
        if (this.field_R != null) {
          if (this.field_R == vu.field_g) {
            fieldTemp$0 = this.field_K + 1;
            this.field_K = this.field_K + 1;
            if (fieldTemp$0 != this.field_O) {
              this.field_M.field_u = 256 - (this.field_K << 8) / this.field_O;
              if (param0 != 11) {
                this.f((byte) 126);
                return super.h(11);
              }
              return super.h(11);
            }
            this.field_R = we.field_a;
            this.a(-34, this.field_N + (12 + this.field_P.field_n), this.field_P.field_q + 12, this.field_S);
            this.field_K = 0;
            this.field_M.field_u = 0;
            if (param0 != 11) {
              this.f((byte) 126);
              return super.h(11);
            }
            return super.h(11);
          }
          if (GraphicsRenderer.field_b != this.field_R) {
            if (param0 == 11) {
              return super.h(11);
            }
            this.f((byte) 126);
            return super.h(11);
          }
          fieldTemp$1 = this.field_K + 1;
          this.field_K = this.field_K + 1;
          if (fieldTemp$1 == this.field_J) {
            this.field_R = null;
            this.field_M.field_u = 256;
            if (param0 == 11) {
              return super.h(11);
            }
            this.f((byte) 126);
            return super.h(11);
          }
          this.field_M.field_u = (this.field_K << 8) / this.field_J;
          if (param0 == 11) {
            return super.h(11);
          }
          this.f((byte) 126);
          return super.h(11);
        }
        if (param0 == 11) {
          return super.h(11);
        }
        this.f((byte) 126);
        return super.h(11);
    }

    boolean a(int param0, int param1, char param2, ea param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = 71 % ((-53 - param0) / 33);
          if (super.a(82, param1, param2, param3)) {
            return true;
          }
          if (this.field_M == null) {
            return false;
          }
          if (param1 == 98) {
            this.field_M.a(param3, (byte) -42);
          }
          if (param1 == 99) {
            this.field_M.a(param3, (byte) -42);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("dg.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    private final void c(ea param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_M != null) {
            this.field_M.unlink(-127);
          }
          if (param0 == null) {
            this.field_M = new hi();
          } else {
            param0.a(param0.field_n, 6, this.field_N + 6, param0.field_q, (byte) 124);
            this.field_M = new hi(param0);
          }
          this.a(this.field_M, 1);
          this.field_P = null;
          if (param1 == -15291) {
            return;
          }
          this.field_O = -42;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("dg.KB(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void k(int param0) {
        field_L = null;
        if (param0 != 12) {
          dg.j(-73);
          field_Q = null;
          return;
        }
        field_Q = null;
    }

    dg(lt param0, ea param1, int param2, int param3, int param4) {
        super(param0, param1.field_q + 12, param2 + 12 + param1.field_n);
        try {
          this.field_S = param4;
          this.field_J = param3;
          this.field_O = param3;
          this.field_N = param2;
          this.c(param1, -15291);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "dg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static boolean j(int param0) {
        if (param0 != 27711) {
          return false;
        }
        if (10 > SoundCache.field_d) {
          return false;
        }
        if (!ks.field_b) {
          return !tg.a(-90) ? true : false;
        }
        return false;
    }

    static {
        field_Q = new int[2];
        field_L = "Please enter your age in years";
    }
}
