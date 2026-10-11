/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class htb extends shb {
    static llb field_w;
    boolean field_x;
    private boolean field_t;
    static gj field_A;
    int field_z;
    private boolean field_y;
    static String field_v;
    boolean field_u;

    boolean a(int param0, shb param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.field_x) {
            return false;
          }
          if (!this.field_y) {
            return false;
          }
          param1.f((byte) -34);
          this.field_t = true;
          if (param0 != 0) {
            return false;
          }
          if (this.field_l != null &&
            this.field_l instanceof dta) {
            ((dta) (this.field_l)).a(this.field_t, (shb) (this), true);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("htb.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    htb(String param0, sba param1) {
        this(param0, msa.field_s.field_a, param1);
    }

    final void a(byte param0, int param1, int param2, int param3, shb param4, int param5) {
        try {
          if (this.field_l != null &&
            this.field_l instanceof sgb) {
            ((sgb) (this.field_l)).a((byte) -127, this, param1, param3, param5, param2);
          }
          this.field_n = 0;
          int var7_int = -114 / ((52 - param0) / 52);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "htb.G(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    boolean a(int param0, int param1, shb param2, char param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -15834) {
            this.field_t = false;
          }
          if (!this.e((byte) -120)) {
            return false;
          }
          if (84 != param1 &&
            83 != param1) {
            return false;
          }
          this.c(1, -1, 23015, -1);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("htb.N(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    boolean a(int param0, int param1, int param2, int param3, shb param4, int param5, byte param6) {
        RuntimeException var8 = null;
        shb var9 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_x &&
            this.a(param2, param1, param0, param5, (byte) 22)) {
            this.a(0, param4);
            this.field_n = param3;
            if (null != this.field_l) {
              if (!(this.field_l instanceof sgb)) {
                return true;
              }
              ((sgb) (this.field_l)).a(18095, this, param5, param3, param2, param1, param0);
            }
            return true;
          }
          if (param6 > -17) {
            var9 = (shb) null;
            this.a(-66, (shb) null);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_15_0 = var8;
          stackIn_15_1 = new StringBuilder().append("htb.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final boolean e(byte param0) {
        if (param0 != -120) {
          return true;
        }
        return this.field_t;
    }

    public static void d(int param0) {
        field_w = null;
        field_A = null;
        field_v = null;
        int var1 = 31 / ((48 - param0) / 43);
    }

    htb(String param0, wwa param1, sba param2) {
        super(param0, param1, param2);
        this.field_x = true;
        this.field_y = true;
        this.field_t = false;
        this.field_z = 0;
    }

    htb(int param0, int param1, int param2, int param3, wwa param4, sba param5) {
        super(param0, param1, param2, param3, param4, param5);
        this.field_x = true;
        this.field_y = true;
        this.field_t = false;
        this.field_z = 0;
    }

    final StringBuilder a(boolean param0, Hashtable param1, int param2, StringBuilder param3) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        RuntimeException var5 = null;
        StringBuilder stackIn_9_0 = null;
        StringBuilder stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(param1, param2, (byte) 116, param3)) {
            this.a(111, param2, param1, param3);
            if (this.field_u) {
              discarded$2 = param3.append(" active");
            }
            if (!this.field_x) {
              discarded$3 = param3.append(" disabled");
            }
          }
          if (!param0) {
            stackIn_11_0 = (StringBuilder) (param3);
            return stackIn_11_0;
          }
          stackIn_9_0 = (StringBuilder) null;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("htb.JA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final void f(byte param0) {
        if (!this.field_t) {
          if (param0 == -34) {
            return;
          }
          this.field_t = true;
          return;
        }
        this.field_t = false;
        if (this.field_l == null) {
          if (param0 == -34) {
            return;
          }
          this.field_t = true;
          return;
        }
        if (this.field_l instanceof dta) {
          ((dta) (this.field_l)).a(this.field_t, (shb) (this), true);
          if (param0 == -34) {
            return;
          }
          this.field_t = true;
          return;
        }
        if (param0 == -34) {
          return;
        }
        this.field_t = true;
    }

    void c(int param0, int param1, int param2, int param3) {
        if (param2 != 23015) {
          field_v = (String) null;
          this.field_z = param0;
          if (null == this.field_l) {
            return;
          }
          if (this.field_l instanceof oo) {
            ((oo) (this.field_l)).a(11, param0, param1, this, param3);
            return;
          }
          return;
        }
        this.field_z = param0;
        if (null == this.field_l) {
          return;
        }
        if (this.field_l instanceof oo) {
          ((oo) (this.field_l)).a(11, param0, param1, this, param3);
          return;
        }
    }

    void a(int param0, int param1, int param2, shb param3) {
        try {
          super.a(param0, param1, param2, param3);
          this.field_z = 0;
          if (this.field_n != 0 &&
            hu.field_b != this.field_n) {
            if (this.a(uia.field_b, param1, kc.field_b, param0, (byte) 22) &&
              hu.field_b == 0) {
              this.c(this.field_n, -param1 + kc.field_b, 23015, uia.field_b - param0);
            }
            this.a((byte) -106, param1, uia.field_b, param0, param3, kc.field_b);
          }
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "htb.B(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public htb() {
        this.field_x = true;
        this.field_y = true;
        this.field_t = false;
        this.field_z = 0;
        this.field_q = msa.field_s.field_q;
    }

    static {
        field_v = "s";
        field_A = new gj();
    }
}
