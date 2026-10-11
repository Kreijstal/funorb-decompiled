/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class gea extends iw {
    private int field_J;
    private shb field_K;
    private int field_M;
    private int field_P;
    private int field_O;
    private qpb field_L;
    private int field_Q;
    private oe field_N;

    void b(shb param0, int param1) {
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        try {
          this.field_K = param0;
          if (iab.field_a == this.field_N) {
            this.c(116, this.field_K.field_h + 12, this.field_K.field_f + this.field_O + 12, this.field_M);
            this.field_Q = 0;
          } else {
            if (this.field_N != gs.field_e) {
              this.field_N = gs.field_e;
              this.field_Q = 0;
            }
          }
          var3_int = 99 / ((6 - param1) / 46);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("gea.K(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    boolean a(int param0, int param1, shb param2, char param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, param2, param3)) {
            return true;
          }
          if (null == this.field_L) {
            return false;
          }
          if (param1 == 98) {
            this.field_L.a(0, param2);
          }
          if (param1 == 99) {
            this.field_L.a(0, param2);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("gea.N(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean j(byte param0) {
        if (param0 == 55) {
          this.e(-10331);
          return super.j((byte) 55);
        }
        this.a(87);
        this.e(-10331);
        return super.j((byte) 55);
    }

    final void e(int param0) {
        if (this.field_N == null) {
          super.e(param0);
          return;
        }
        if (this.field_N != kk.field_o) {
          this.c(this.field_K.field_h + 12, -1860440319, this.field_K.field_f + (this.field_O + 12));
          this.a(this.field_K, (byte) 71);
        } else {
          this.field_L.field_v = 256;
          this.field_N = null;
          super.e(param0);
          return;
        }
        this.field_L.field_v = 256;
        this.field_N = null;
        super.e(param0);
    }

    boolean a(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int var3 = VoidHunters.field_G;
        if (param0 == 248) {
          if (this.field_N == null) {
            return super.a(248);
          }
          if (this.field_N == gs.field_e) {
            fieldTemp$0 = this.field_Q + 1;
            this.field_Q = this.field_Q + 1;
            if (this.field_P == fieldTemp$0) {
              this.field_N = iab.field_a;
              this.c(96, this.field_K.field_h + 12, this.field_K.field_f + (this.field_O + 12), this.field_M);
              this.field_L.field_v = 0;
              this.field_Q = 0;
              return super.a(248);
            }
            this.field_L.field_v = -((this.field_Q << 8) / this.field_P) + 256;
            return super.a(248);
          }
          if (this.field_N != kk.field_o) {
            return super.a(248);
          }
          fieldTemp$1 = this.field_Q + 1;
          this.field_Q = this.field_Q + 1;
          if (fieldTemp$1 == this.field_J) {
            this.field_N = null;
            this.field_L.field_v = 256;
            return super.a(248);
          }
          this.field_L.field_v = (this.field_Q << 8) / this.field_J;
          return super.a(248);
        }
        shb var4 = (shb) null;
        this.b((shb) null, 57);
        if (this.field_N == null) {
          return super.a(248);
        }
        if (this.field_N == gs.field_e) {
          fieldTemp$2 = this.field_Q + 1;
          this.field_Q = this.field_Q + 1;
          if (this.field_P == fieldTemp$2) {
            this.field_N = iab.field_a;
            this.c(96, this.field_K.field_h + 12, this.field_K.field_f + (this.field_O + 12), this.field_M);
            this.field_L.field_v = 0;
            this.field_Q = 0;
            return super.a(248);
          }
          this.field_L.field_v = -((this.field_Q << 8) / this.field_P) + 256;
          return super.a(248);
        }
        if (this.field_N != kk.field_o) {
          return super.a(248);
        }
        int fieldTemp$3 = this.field_Q + 1;
        this.field_Q = this.field_Q + 1;
        if (fieldTemp$3 == this.field_J) {
          this.field_N = null;
          this.field_L.field_v = 256;
          return super.a(248);
        }
        this.field_L.field_v = (this.field_Q << 8) / this.field_J;
        return super.a(248);
    }

    final void d(int param0) {
        if (gs.field_e == this.field_N) {
          return;
        }
        this.field_Q = 0;
        this.field_N = kk.field_o;
        this.a(this.field_K, (byte) 71);
        this.field_K = null;
        if (param0 == 15435) {
          this.field_L.field_v = 0;
          return;
        }
        this.field_M = 66;
        this.field_L.field_v = 0;
    }

    private final void a(shb param0, byte param1) {
        try {
          if (null != this.field_L) {
            this.field_L.b(param1 - 3917);
          }
          if (param0 == null) {
            this.field_L = new qpb();
          } else {
            param0.a(6, param0.field_h, param0.field_f, 1, this.field_O + 6);
            this.field_L = new qpb(param0);
          }
          this.b(-18756, this.field_L);
          if (param1 != 71) {
            this.e(85);
          }
          this.field_K = null;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "gea.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    gea(ida param0, shb param1, int param2, int param3, int param4) {
        super(param0, 12 + param1.field_h, param1.field_f + (12 + param2));
        try {
          this.field_M = param4;
          this.field_J = param3;
          this.field_P = param3;
          this.field_O = param2;
          this.a(param1, (byte) 71);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "gea.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
    }
}
