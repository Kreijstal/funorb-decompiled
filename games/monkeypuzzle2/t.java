/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class t extends we {
    boolean field_w;
    private boolean field_A;
    private boolean field_x;
    boolean field_u;
    static pj field_v;
    static String field_y;
    static ta field_z;

    final void e(int param0) {
        if (param0 != 13104) {
          we var3 = (we) null;
          this.a(-78, 95, 39, 80, (we) null, -32, 69);
          if (!this.field_A) {
            return;
          }
          this.field_A = false;
          if (this.field_o == null) {
            return;
          }
          if (!(this.field_o instanceof bj)) {
            return;
          }
          ((bj) (this.field_o)).a(false, (we) (this), this.field_A);
          return;
        }
        if (!this.field_A) {
          return;
        }
        this.field_A = false;
        if (this.field_o == null) {
          return;
        }
        if (!(this.field_o instanceof bj)) {
          return;
        }
        ((bj) (this.field_o)).a(false, (we) (this), this.field_A);
    }

    boolean a(int param0, int param1, int param2, int param3, we param4, int param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_w &&
            this.a(param1, param0, param6, param5, (byte) 45)) {
            this.a(param4, false);
            this.field_t = param2;
            if (this.field_o != null) {
              if (!(this.field_o instanceof jb)) {
                return true;
              }
              ((jb) (this.field_o)).a(param6, param1, -29446, param2, param5, this, param0);
            }
            return true;
          }
          if (param3 != -1625) {
            this.field_A = false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_15_0 = var8;
          stackIn_15_1 = new StringBuilder().append("t.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    t(String param0, ml param1, of param2) {
        super(param0, param1, param2);
        this.field_w = true;
        this.field_A = false;
        this.field_x = true;
    }

    final boolean b(byte param0) {
        if (param0 < 38) {
          return false;
        }
        return this.field_A;
    }

    t(String param0, of param1) {
        this(param0, hi.field_b.field_i, param1);
    }

    void a(we param0, int param1, int param2, byte param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          super.a(param0, param1, param2, (byte) -48);
          if (this.field_t != 0 &&
            this.field_t != ni.field_a) {
            if (this.a(ei.field_a, param1, param2, p.field_a, (byte) 45) &&
              0 == ni.field_a) {
              this.b(-93, ei.field_a - param2, -param1 + p.field_a, this.field_t);
            }
            this.a(param1, ei.field_a, param0, p.field_a, 0, param2);
          }
          if (param3 < -13) {
            return;
          }
          this.field_u = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("t.E(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final StringBuilder a(boolean param0, StringBuilder param1, Hashtable param2, int param3) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        RuntimeException var5 = null;
        StringBuilder stackIn_8_0 = null;
        StringBuilder stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(param2, (byte) -125, param3, param1)) {
            this.a(param2, param3, param1, -108);
            if (this.field_u) {
              discarded$2 = param1.append(" active");
            }
            if (!this.field_w) {
              discarded$3 = param1.append(" disabled");
            }
          }
          if (!param0) {
            stackIn_10_0 = (StringBuilder) (param1);
            return stackIn_10_0;
          }
          stackIn_8_0 = (StringBuilder) null;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("t.T(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param3).append(')').toString());
        }
    }

    void b(int param0, int param1, int param2, int param3) {
        if (param0 > -23) {
          we var6 = (we) null;
          this.a((we) null, 14, 64, (byte) 66);
          if (null == this.field_o) {
            return;
          }
          if (this.field_o instanceof ql) {
            ((ql) (this.field_o)).a(param2, param3, param1, 7, this);
            return;
          }
          return;
        }
        if (null == this.field_o) {
          return;
        }
        if (this.field_o instanceof ql) {
          ((ql) (this.field_o)).a(param2, param3, param1, 7, this);
          return;
        }
    }

    final void a(int param0, int param1, we param2, int param3, int param4, int param5) {
        try {
          if (this.field_o != null &&
            this.field_o instanceof jb) {
            ((jb) (this.field_o)).a((byte) -14, param0, param1, param5, param3, this);
          }
          this.field_t = param4;
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "t.I(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static void i(int param0) {
        hb var3 = null;
        me var1 = (me) (af.field_a.a((byte) -117));
        int var2 = -29 % ((-53 - param0) / 58);
        if (var1 != null) {
          var3 = MonkeyPuzzle2.field_D;
          var3.e(-86);
          var3.e(126);
          var3.e(-46);
          var3.e(127);
          var1.c(-19822);
          return;
        }
        gk.a(-1);
    }

    public static void j(int param0) {
        field_v = null;
        field_z = null;
        field_y = null;
        if (param0 > -26) {
          t.i(28);
        }
    }

    boolean a(we param0, char param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.b((byte) 96) && (param2 == 84 ||
            param2 == 83)) {
            this.b(-64, -1, -1, 1);
            return true;
          }
          var5_int = 58 % ((param3 - 37) / 50);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("t.V(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    boolean a(we param0, boolean param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_w &&
            this.field_x) {
            if (param1) {
              this.e(-62);
            }
            param0.e(13104);
            this.field_A = true;
            if (this.field_o != null) {
              if (!(this.field_o instanceof bj)) {
                return true;
              }
              ((bj) (this.field_o)).a(false, (we) (this), this.field_A);
            }
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("t.AA(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    protected t() {
        this.field_w = true;
        this.field_A = false;
        this.field_x = true;
        this.field_h = hi.field_b.field_g;
    }

    static {
        field_v = new pj();
        field_y = "Waiting for sound effects";
    }
}
