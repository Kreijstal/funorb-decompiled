/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class kg extends vg {
    boolean field_z;
    private boolean field_A;
    private boolean field_B;
    static String field_C;
    boolean field_y;

    final StringBuilder a(byte param0, Hashtable param1, int param2, StringBuilder param3) {
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
          var5_int = 111 % ((64 - param0) / 61);
          if (this.a(false, param2, param3, param1)) {
            this.a(param1, param2, false, param3);
            if (this.field_z) {
              discarded$2 = param3.append(" active");
            }
            if (!this.field_y) {
              discarded$3 = param3.append(" disabled");
            }
          }
          stackIn_7_0 = (StringBuilder) (param3);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("kg.NA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    boolean a(byte param0, vg param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -88 / ((61 - param0) / 59);
          if (!this.field_y) {
            return false;
          }
          if (!this.field_B) {
            return false;
          }
          param1.e((byte) -122);
          this.field_A = true;
          if (this.field_u != null &&
            this.field_u instanceof dj) {
            ((dj) (this.field_u)).a(10202, this.field_A, (vg) (this));
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("kg.CA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final boolean f(int param0) {
        if (param0 != 1) {
          this.field_y = false;
          return this.field_A;
        }
        return this.field_A;
    }

    boolean a(int param0, int param1, byte param2, int param3, int param4, int param5, vg param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_y &&
            this.a(param1, 39, param3, param5, param4)) {
            this.a((byte) 124, param6);
            this.field_o = param0;
            if (null != this.field_u &&
              this.field_u instanceof dr) {
              ((dr) (this.field_u)).a(this, param4, param3, param5, -237, param0, param1);
            }
            return true;
          }
          if (param2 >= 95) {
            return false;
          }
          this.field_A = false;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_14_0 = var8;
          stackIn_14_1 = new StringBuilder().append("kg.TA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    kg(String param0, iq param1, ko param2) {
        super(param0, param1, param2);
        this.field_B = true;
        this.field_A = false;
        this.field_y = true;
    }

    kg(String param0, ko param1) {
        this(param0, qq.field_I.field_q, param1);
    }

    final void e(byte param0) {
        int var2 = 0;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        if (!this.field_A) {
          var2 = -38 % ((param0 + 84) / 33);
          return;
        }
        this.field_A = false;
        if (null == this.field_u) {
          var2Lifetime1 = -38 % ((param0 + 84) / 33);
          return;
        }
        if (this.field_u instanceof dj) {
          ((dj) (this.field_u)).a(10202, this.field_A, (vg) (this));
          var2Lifetime2 = -38 % ((param0 + 84) / 33);
          return;
        }
        var2Lifetime3 = -38 % ((param0 + 84) / 33);
    }

    final static void f(byte param0) {
        if (null != cb.field_h) {
          cb.field_h.a(0);
        }
        if (param0 > -122) {
          field_C = (String) null;
          return;
        }
    }

    final static void a(int param0, long param1, String param2) {
        CharSequence var5 = null;
        if (param0 >= -41) {
          return;
        }
        try {
          gi.field_a = param2;
          em.field_h = 2;
          var5 = (CharSequence) ((Object) param2);
          nd.field_k = ji.a(var5, true);
          hd.field_k = param1;
          sr.field_h = true;
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "kg.GA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    void a(int param0, int param1, vg param2, byte param3) {
        try {
          super.a(param0, param1, param2, param3);
          if (this.field_o != 0) {
            if (rf.field_n == this.field_o) {
              return;
            }
            if (this.a(pd.field_k, 72, bb.field_b, param1, param0) &&
              rf.field_n == 0) {
              this.a(this.field_o, pd.field_k - param0, -param1 + bb.field_b, (byte) -109);
            }
            this.a(pd.field_k, param1, param0, bb.field_b, -600269855, param2);
          }
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "kg.PA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    boolean a(int param0, char param1, int param2, vg param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 13) {
            return true;
          }
          if (!this.f(1)) {
            return false;
          }
          if (param0 != 84 &&
            param0 != 83) {
            return false;
          }
          this.a(1, -1, -1, (byte) -109);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("kg.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    protected kg() {
        this.field_B = true;
        this.field_A = false;
        this.field_y = true;
        this.field_p = qq.field_I.field_o;
    }

    void a(int param0, int param1, int param2, byte param3) {
        if (this.field_u == null) {
          return;
        }
        if (!(this.field_u instanceof bp)) {
          return;
        }
        ((bp) (this.field_u)).a(this, 6, param0, param2, param1);
        if (param3 == -109) {
          return;
        }
    }

    public static void d(boolean param0) {
        field_C = null;
        if (!param0) {
          kg.f((byte) -56);
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, vg param5) {
        if (param4 != -600269855) {
          return;
        }
        try {
          if (this.field_u != null &&
            this.field_u instanceof dr) {
            ((dr) (this.field_u)).a(param2, param0, param3, param1, this, (byte) -128);
          }
          this.field_o = 0;
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "kg.HA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_C = "Remove <%0> from friend list";
    }
}
