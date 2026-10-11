/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class lg extends gm {
    static java.applet.Applet field_B;
    private boolean field_y;
    boolean field_x;
    boolean field_A;
    private boolean field_z;

    boolean a(int param0, gm param1, char param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.g(2) && (param0 == 84 ||
            param0 == 83)) {
            this.a(1, -1, -1, -1);
            return true;
          }
          var5_int = 124 / ((-33 - param3) / 57);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("lg.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean g(int param0) {
        if (param0 != 2) {
          this.g(63);
          return this.field_z;
        }
        return this.field_z;
    }

    final void c(byte param0) {
        if (!this.field_z) {
          if (param0 >= 89) {
            return;
          }
          this.c((byte) 22);
          return;
        }
        this.field_z = false;
        if (null == this.field_t) {
          if (param0 >= 89) {
            return;
          }
          this.c((byte) 22);
          return;
        }
        if (this.field_t instanceof ek) {
          ((ek) (this.field_t)).a(14381, this.field_z, (gm) (this));
          if (param0 >= 89) {
            return;
          }
          this.c((byte) 22);
          return;
        }
        if (param0 >= 89) {
          return;
        }
        this.c((byte) 22);
    }

    lg(String param0, ca param1) {
        this(param0, ah.field_c.field_k, param1);
    }

    lg(String param0, el param1, ca param2) {
        super(param0, param1, param2);
        this.field_y = true;
        this.field_z = false;
        this.field_x = true;
    }

    void a(int param0, int param1, int param2, int param3) {
        if (param2 != -1) {
          Hashtable var6 = (Hashtable) null;
          this.a((StringBuilder) null, (byte) -119, (Hashtable) null, -87);
          if (null != this.field_t) {
            if (this.field_t instanceof ng) {
              ((ng) (this.field_t)).a((byte) -116, this, param0, param1, param3);
            }
            return;
          }
          return;
        }
        if (null == this.field_t) {
          return;
        }
        if (this.field_t instanceof ng) {
          ((ng) (this.field_t)).a((byte) -116, this, param0, param1, param3);
          return;
        }
    }

    boolean a(gm param0, boolean param1) {
        RuntimeException var3 = null;
        gm var4 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_x &&
            this.field_y) {
            param0.c((byte) 91);
            this.field_z = true;
            if (null != this.field_t &&
              this.field_t instanceof ek) {
              ((ek) (this.field_t)).a(14381, this.field_z, (gm) (this));
            }
            if (param1) {
              var4 = (gm) null;
              this.a(93, 79, 114, (byte) -114, (gm) null, -45);
            }
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("lg.JA(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, byte param3, gm param4, int param5) {
        try {
          if (this.field_t != null &&
            this.field_t instanceof ck) {
            ((ck) (this.field_t)).a(param1, this, param2, param5, param0, -710);
          }
          if (param3 < 109) {
            gm var8 = (gm) null;
            this.a((gm) null, true);
          }
          this.field_l = 0;
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "lg.N(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    final static void h(int param0) {
        if (op.field_i == 10) {
          gq.a(114);
          op.field_i = 11;
        } else {
          if (!s.h((byte) 124)) {
            gq.a(114);
            op.field_i = 11;
          }
        }
        mh.field_g = true;
        if (param0 < -98) {
          return;
        }
        field_B = (java.applet.Applet) null;
    }

    void a(int param0, gm param1, int param2, int param3) {
        try {
          super.a(120, param1, param2, param3);
          int var5_int = 5 % ((param0 + 28) / 43);
          if (this.field_l != 0 &&
            this.field_l != ul.field_d) {
            if (this.a(k.field_e, n.field_t, param3, param2, 119) &&
              ul.field_d == 0) {
              this.a(this.field_l, -param2 + k.field_e, -1, n.field_t - param3);
            }
            this.a(param2, param3, n.field_t, (byte) 120, param1, k.field_e);
          }
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "lg.P(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void i(int param0) {
        field_B = null;
        if (param0 < 2) {
          field_B = (java.applet.Applet) null;
        }
    }

    boolean a(int param0, int param1, int param2, int param3, int param4, gm param5, byte param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_x &&
            this.a(param3, param4, param1, param2, 81)) {
            this.a(param5, false);
            this.field_l = param0;
            if (null != this.field_t &&
              this.field_t instanceof ck) {
              ((ck) (this.field_t)).a(param0, param4, param3, param2, this, -78, param1);
            }
            return true;
          }
          if (param6 > 5) {
            return false;
          }
          this.field_A = false;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_14_0 = var8;
          stackIn_14_1 = new StringBuilder().append("lg.KA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param6).append(')').toString());
        }
    }

    final static bp a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String var4 = null;
        int var5 = 0;
        bp var6 = null;
        bp stackIn_4_0 = null;
        bp stackIn_7_0 = null;
        bp stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != null &&
            param0.length() != 0) {
            var2_int = param0.indexOf('@');
            if (-1 == var2_int) {
              stackIn_7_0 = oj.field_l;
              return stackIn_7_0;
            }
            var3 = param0.substring(0, var2_int);
            var4 = param0.substring(1 + var2_int);
            var5 = 15 / ((param1 - 64) / 33);
            var6 = ka.a(var3, (byte) -10);
            if (var6 == null) {
              return fi.a((byte) -97, var4);
            }
            stackIn_11_0 = var6;
            return stackIn_11_0;
          }
          stackIn_4_0 = rh.field_c;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("lg.J(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    final StringBuilder a(StringBuilder param0, byte param1, Hashtable param2, int param3) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        RuntimeException var5 = null;
        StringBuilder stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 117) {
            this.field_y = false;
          }
          if (this.a(-31866, param0, param2, param3)) {
            this.a(param0, param3, true, param2);
            if (this.field_A) {
              discarded$2 = param0.append(" active");
            }
            if (!this.field_x) {
              discarded$3 = param0.append(" disabled");
            }
          }
          stackIn_10_0 = (StringBuilder) (param0);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("lg.O(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param3).append(')').toString());
        }
    }

    protected lg() {
        this.field_y = true;
        this.field_z = false;
        this.field_x = true;
        this.field_q = ah.field_c.field_a;
    }

    static {
    }
}
