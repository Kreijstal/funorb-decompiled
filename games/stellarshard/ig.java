/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class ig extends rj {
    private boolean field_A;
    static String field_C;
    boolean field_E;
    boolean field_z;
    static int field_D;
    private boolean field_B;
    static int field_y;

    final StringBuilder a(int param0, boolean param1, StringBuilder param2, Hashtable param3) {
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
          if (param1) {
            ig.a(78);
          }
          if (this.a((byte) -125, param3, param2, param0)) {
            this.a((byte) 117, param0, param2, param3);
            if (this.field_z) {
              discarded$2 = param2.append(" active");
            }
            if (!this.field_E) {
              discarded$3 = param2.append(" disabled");
            }
          }
          stackIn_10_0 = (StringBuilder) (param2);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("ig.T(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    boolean a(int param0, int param1, char param2, rj param3) {
        RuntimeException var5 = null;
        rj var6 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 29657) {
            var6 = (rj) null;
            this.a(68, (rj) null);
          }
          if (!this.e(0)) {
            return false;
          }
          if (84 != param1 &&
            83 != param1) {
            return false;
          }
          this.a(-1, -1, 1, 108);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("ig.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, rj param2, int param3, int param4, int param5) {
        try {
          int var7_int = -87 % ((param1 + 50) / 57);
          if (this.field_v != null &&
            this.field_v instanceof r) {
            ((r) (this.field_v)).a(-6774, param5, this, param4, param0, param3);
          }
          this.field_o = 0;
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "ig.U(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void c(boolean param0) {
        rj var3 = null;
        rj var3Lifetime1;
        rj var3Lifetime2;
        if (!this.field_B) {
          if (param0) {
            return;
          }
          var3 = (rj) null;
          this.a(-21, 2, (rj) null, 96, 23, 47);
          return;
        }
        this.field_B = false;
        if (this.field_v == null) {
          if (param0) {
            return;
          }
          var3Lifetime1 = (rj) null;
          this.a(-21, 2, (rj) null, 96, 23, 47);
          return;
        }
        if (this.field_v instanceof ik) {
          ((ik) (this.field_v)).a(!param0 ? true : false, (rj) (this), this.field_B);
        }
        if (param0) {
          return;
        }
        var3Lifetime2 = (rj) null;
        this.a(-21, 2, (rj) null, 96, 23, 47);
    }

    boolean a(rj param0, int param1, int param2, int param3, int param4, byte param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param5 <= 24) {
            return false;
          }
          if (this.field_E &&
            this.a((byte) 126, param6, param3, param1, param4)) {
            this.a(-2147483648, param0);
            this.field_o = param2;
            if (null != this.field_v &&
              this.field_v instanceof r) {
              ((r) (this.field_v)).a(this, param3, (byte) -98, param4, param2, param1, param6);
            }
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_14_0 = var8;
          stackIn_14_1 = new StringBuilder().append("ig.P(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    ig(String param0, lf param1) {
        this(param0, n.field_i.field_b, param1);
    }

    public static void a(int param0) {
        if (param0 != -8278) {
          ig.a(-27);
          field_C = null;
          return;
        }
        field_C = null;
    }

    final boolean e(int param0) {
        if (param0 != 0) {
          return true;
        }
        return this.field_B;
    }

    ig(String param0, uk param1, lf param2) {
        super(param0, param1, param2);
        this.field_A = true;
        this.field_B = false;
        this.field_E = true;
    }

    void a(int param0, int param1, int param2, int param3) {
        if (null != this.field_v) {
          if (!(this.field_v instanceof oi)) {
            if (param3 < 39) {
              this.a(-95, -122, 120, 45);
              return;
            }
            return;
          }
          ((oi) (this.field_v)).a(param2, param0, this, false, param1);
        }
        if (param3 >= 39) {
          return;
        }
        this.a(-95, -122, 120, 45);
    }

    void a(int param0, boolean param1, int param2, rj param3) {
        try {
          super.a(param0, param1, param2, param3);
          if (param1) {
            this.field_E = false;
          }
          if (this.field_o != 0 &&
            fb.field_n != this.field_o) {
            if (this.a((byte) 126, param0, eb.field_a, ni.field_e, param2) &&
              fb.field_n == 0) {
              this.a(eb.field_a - param0, ni.field_e - param2, this.field_o, 119);
            }
            this.a(eb.field_a, -128, param3, param2, param0, ni.field_e);
          }
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "ig.N(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    boolean a(int param0, rj param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_E &&
            this.field_A) {
            param1.c(true);
            if (param0 != -2147483648) {
              this.field_A = true;
            }
            this.field_B = true;
            if (this.field_v != null &&
              this.field_v instanceof ik) {
              ((ik) (this.field_v)).a(false, (rj) (this), this.field_B);
            }
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("ig.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    protected ig() {
        this.field_A = true;
        this.field_B = false;
        this.field_E = true;
        this.field_u = n.field_i.field_u;
    }

    static {
        field_C = "Instructions";
        field_y = -1;
    }
}
