/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class rm extends n {
    static String field_E;
    private boolean field_C;
    private boolean field_F;
    boolean field_B;
    static uf field_A;
    boolean field_D;

    final void e(int param0) {
        if (!this.field_C) {
          if (param0 < 15) {
            rm.h(-3);
            return;
          }
          return;
        }
        this.field_C = false;
        if (null != this.field_t) {
          if (!(this.field_t instanceof mh)) {
            if (param0 < 15) {
              rm.h(-3);
              return;
            }
            return;
          }
          ((mh) (this.field_t)).a((n) (this), 30154, this.field_C);
        }
        if (param0 >= 15) {
          return;
        }
        rm.h(-3);
    }

    rm(String param0, dh param1, tb param2) {
        super(param0, param1, param2);
        this.field_C = false;
        this.field_F = true;
        this.field_D = true;
    }

    boolean a(n param0, int param1, byte param2, char param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != -78) {
            this.field_F = true;
          }
          if (this.c((byte) -20) && (param1 == 84 ||
            param1 == 83)) {
            this.a(1, -1, true, -1);
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("rm.T(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, n param1, int param2, int param3, byte param4, int param5) {
        try {
          if (param4 != -9) {
            this.e(45);
          }
          if (null != this.field_t &&
            this.field_t instanceof un) {
            ((un) (this.field_t)).a(param5, param0, param2, this, (byte) -71, param3);
          }
          this.field_v = 0;
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "rm.SA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void i(int param0) {
        field_E = null;
        if (param0 != -5531) {
          return;
        }
        field_A = null;
    }

    void a(int param0, n param1, int param2, byte param3) {
        try {
          super.a(param0, param1, param2, param3);
          if (0 != this.field_v) {
            if (this.field_v == rd.field_f) {
              return;
            }
            if (this.b(param0, (byte) -105, nc.field_g, param2, rf.field_X) &&
              rd.field_f == 0) {
              this.a(this.field_v, -param2 + rf.field_X, true, nc.field_g - param0);
            }
            this.a(nc.field_g, param1, param2, param0, (byte) -9, rf.field_X);
          }
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "rm.JA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    boolean a(int param0, int param1, int param2, n param3, byte param4, int param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_D &&
            this.b(param0, (byte) -105, param5, param2, param1)) {
            this.a(param3, param4 ^ 25781);
            this.field_v = param6;
            if (null != this.field_t) {
              if (!(this.field_t instanceof un)) {
                return true;
              }
              ((un) (this.field_t)).a((byte) -68, this, param0, param5, param2, param6, param1);
            }
            return true;
          }
          if (param4 == -108) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_15_0 = var8;
          stackIn_15_1 = new StringBuilder().append("rm.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final static void h(int param0) {
        String var2 = null;
        String var2Lifetime1;
        if (param0 == 84) {
          var2 = (String) null;
          ag.a((String) null, false, "");
          return;
        }
        rm.h(-35);
        var2Lifetime1 = (String) null;
        ag.a((String) null, false, "");
    }

    void a(int param0, int param1, boolean param2, int param3) {
        if (null != this.field_t) {
          if (!(this.field_t instanceof pi)) {
            if (!param2) {
              field_E = (String) null;
              return;
            }
            return;
          }
          ((pi) (this.field_t)).a(param0, this, -4, param3, param1);
        }
        if (param2) {
          return;
        }
        field_E = (String) null;
    }

    rm(String param0, tb param1) {
        this(param0, pc.field_b.field_p, param1);
    }

    final StringBuilder a(int param0, byte param1, Hashtable param2, StringBuilder param3) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = -66 % ((param1 - 0) / 49);
          if (this.a(20720, param2, param3, param0)) {
            this.a(param2, param0, true, param3);
            if (this.field_B) {
              discarded$2 = param3.append(" active");
            }
            if (!this.field_D) {
              discarded$3 = param3.append(" disabled");
            }
          }
          stackIn_7_0 = (StringBuilder) (param3);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("rm.PA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final boolean c(byte param0) {
        if (param0 != -20) {
          return true;
        }
        return this.field_C;
    }

    boolean a(n param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.field_D) {
            return false;
          }
          if (!this.field_F) {
            return false;
          }
          param0.e(50);
          this.field_C = true;
          if (param1 != -25823) {
            rm.i(17);
          }
          if (null != this.field_t &&
            this.field_t instanceof mh) {
            ((mh) (this.field_t)).a((n) (this), 30154, this.field_C);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("rm.NB(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    protected rm() {
        this.field_C = false;
        this.field_F = true;
        this.field_D = true;
        this.field_l = pc.field_b.field_d;
    }

    static {
        field_E = "Waiting for levels";
    }
}
