/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class aa extends im {
    private int field_P;
    private int field_O;
    private int field_W;
    static ce field_U;
    private int field_R;
    private int field_N;
    private qd field_S;
    static byte[] field_X;
    private gm field_V;
    static volatile long field_Q;
    private fq field_T;

    private final void b(byte param0, gm param1) {
        try {
          if (null != this.field_T) {
            this.field_T.f(0);
          }
          int var3_int = 54 % ((-33 - param0) / 56);
          if (param1 != null) {
            param1.a((byte) 125, 6, this.field_N + 6, param1.field_o, param1.field_p);
            this.field_T = new fq(param1);
          } else {
            this.field_T = new fq();
          }
          this.a(this.field_T, -6938);
          this.field_V = null;
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "aa.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    void c(gm param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_V = param0;
          if (param1 != 33) {
            return;
          }
          if (this.field_S == gn.field_b) {
            this.b(this.field_N + 12 + this.field_V.field_o, (byte) -15, this.field_O, this.field_V.field_p + 12);
            this.field_P = 0;
            return;
          }
          if (this.field_S == gf.field_j) {
            return;
          }
          this.field_S = gf.field_j;
          this.field_P = 0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("aa.A(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    aa(ln param0, gm param1, int param2, int param3, int param4) {
        super(param0, param1.field_p + 12, param1.field_o + 12 + param2);
        try {
          this.field_R = param3;
          this.field_W = param3;
          this.field_O = param4;
          this.field_N = param2;
          this.b((byte) -124, param1);
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "aa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void m(int param0) {
        field_X = null;
        if (param0 != 0) {
          return;
        }
        field_U = null;
    }

    boolean h(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int var3 = Torquing.field_u;
        if (this.field_S != null) {
          if (this.field_S == gf.field_j) {
            fieldTemp$0 = this.field_P + 1;
            this.field_P = this.field_P + 1;
            if (this.field_W != fieldTemp$0) {
              this.field_T.field_D = 256 - (this.field_P << 8) / this.field_W;
              if (param0 != -7) {
                this.g((byte) 13);
                return super.h(param0 + 0);
              }
              return super.h(param0 + 0);
            }
            this.field_S = gn.field_b;
            this.b(this.field_V.field_o + (12 + this.field_N), (byte) -15, this.field_O, 12 + this.field_V.field_p);
            this.field_T.field_D = 0;
            this.field_P = 0;
            if (param0 != -7) {
              this.g((byte) 13);
              return super.h(param0 + 0);
            }
            return super.h(param0 + 0);
          }
          if (ql.field_s != this.field_S) {
            if (param0 == -7) {
              return super.h(param0 + 0);
            }
            this.g((byte) 13);
            return super.h(param0 + 0);
          }
          fieldTemp$1 = this.field_P + 1;
          this.field_P = this.field_P + 1;
          if (this.field_R != fieldTemp$1) {
            this.field_T.field_D = (this.field_P << 8) / this.field_R;
            if (param0 == -7) {
              return super.h(param0 + 0);
            }
            this.g((byte) 13);
            return super.h(param0 + 0);
          }
          this.field_T.field_D = 256;
          this.field_S = null;
          if (param0 == -7) {
            return super.h(param0 + 0);
          }
          this.g((byte) 13);
          return super.h(param0 + 0);
        }
        if (param0 == -7) {
          return super.h(param0 + 0);
        }
        this.g((byte) 13);
        return super.h(param0 + 0);
    }

    boolean a(int param0, gm param1, char param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = 55 % ((-33 - param3) / 57);
          if (super.a(param0, param1, param2, 36)) {
            return true;
          }
          if (this.field_T == null) {
            return false;
          }
          if (param0 == 98) {
            this.field_T.a(param1, false);
          }
          if (param0 == 99) {
            this.field_T.a(param1, false);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("aa.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void j(int param0) {
        if (null == this.field_S) {
          super.j(param0);
          return;
        }
        if (ql.field_s != this.field_S) {
          this.a(this.field_V.field_p + 12, (byte) -25, this.field_N + 12 + this.field_V.field_o);
          this.b((byte) -101, this.field_V);
        } else {
          this.field_S = null;
          this.field_T.field_D = 256;
          super.j(param0);
          return;
        }
        this.field_S = null;
        this.field_T.field_D = 256;
        super.j(param0);
    }

    final void g(byte param0) {
        if (gf.field_j == this.field_S) {
          return;
        }
        this.field_S = ql.field_s;
        this.field_P = 0;
        if (param0 > 122) {
          this.b((byte) 83, this.field_V);
          this.field_V = null;
          this.field_T.field_D = 0;
          return;
        }
        aa.m(2);
        this.b((byte) 83, this.field_V);
        this.field_V = null;
        this.field_T.field_D = 0;
    }

    final boolean a(byte param0) {
        this.j(0);
        if (param0 < 114) {
          return false;
        }
        return super.a((byte) 122);
    }

    static {
        field_U = new ce();
        field_Q = 0L;
        field_X = new byte[520];
    }
}
