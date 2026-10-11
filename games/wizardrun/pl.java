/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class pl extends ub {
    private boolean field_y;
    static ga field_E;
    static int field_A;
    boolean field_B;
    private boolean field_C;
    boolean field_z;
    static boolean field_D;

    final StringBuilder a(Hashtable param0, byte param1, int param2, StringBuilder param3) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        RuntimeException var5 = null;
        StringBuilder stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(param3, param0, param2, true)) {
            this.a(115, param2, param0, param3);
            if (this.field_z) {
              discarded$2 = param3.append(" active");
            }
            if (!this.field_B) {
              discarded$3 = param3.append(" disabled");
            }
          }
          if (param1 != 102) {
            this.field_C = true;
          }
          stackIn_9_0 = (StringBuilder) (param3);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("pl.U(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3, ub param4, int param5) {
        try {
          if (this.field_s != null &&
            this.field_s instanceof ja) {
            ((ja) (this.field_s)).a(param0, this, param1, param2, true, param3);
          }
          this.field_q = param5;
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "pl.Q(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    pl(String param0, ce param1) {
        this(param0, kc.field_H.field_c, param1);
    }

    final static wd a(int param0, String param1) {
        RuntimeException var2 = null;
        wd stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_10_0 = null;
        wd stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -1) {
            stackIn_2_0 = (wd) null;
            return stackIn_2_0;
          }
          if (wc.field_j == field_E) {
            stackIn_5_0 = null;
            return (wd) (stackIn_5_0);
          }
          if (wc.field_j == mi.field_z &&
            param1.equals(qc.field_I)) {
            wc.field_j = ej.field_b;
            stackIn_12_0 = kd.field_a;
            return stackIn_12_0;
          }
          kd.field_a = null;
          qc.field_I = param1;
          wc.field_j = field_E;
          stackIn_10_0 = null;
          return (wd) (stackIn_10_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_15_0 = var2;
          stackIn_15_1 = new StringBuilder().append("pl.CB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    void b(int param0, int param1, int param2, int param3) {
        if (param0 >= -45) {
          this.d((byte) -65);
          if (this.field_s != null) {
            if (this.field_s instanceof qd) {
              ((qd) (this.field_s)).a(-18905, this, param3, param2, param1);
            }
            return;
          }
          return;
        }
        if (this.field_s == null) {
          return;
        }
        if (this.field_s instanceof qd) {
          ((qd) (this.field_s)).a(-18905, this, param3, param2, param1);
          return;
        }
    }

    boolean a(ub param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.field_B) {
            return false;
          }
          if (!this.field_y) {
            return false;
          }
          param0.b(false);
          this.field_C = true;
          if (this.field_s != null &&
            this.field_s instanceof ma) {
            ((ma) (this.field_s)).a((ub) (this), param1 ^ -19983, this.field_C);
          }
          if (param1 != 8) {
            pl.a(92);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("pl.J(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    boolean a(int param0, byte param1, int param2, int param3, int param4, int param5, ub param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8_int = 16 / ((param1 - 12) / 36);
          if (this.field_B &&
            this.b(param5, param2, 0, param0, param3)) {
            this.a(param6, 8);
            this.field_q = param4;
            if (this.field_s != null) {
              if (!(this.field_s instanceof ja)) {
                return true;
              }
              ((ja) (this.field_s)).a(this, param4, param5, (byte) -17, param0, param2, param3);
            }
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_12_0 = var8;
          stackIn_12_1 = new StringBuilder().append("pl.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    void a(int param0, int param1, int param2, ub param3) {
        try {
          super.a(param0, param1, param2, param3);
          if (this.field_q != 0) {
            if (sh.field_c == this.field_q) {
              return;
            }
            if (this.b(fi.field_B, pg.field_n, 0, param2, param1) &&
              0 == sh.field_c) {
              this.b(-88, pg.field_n - param2, -param1 + fi.field_B, this.field_q);
            }
            this.a(param2, fi.field_B, param1, pg.field_n, param3, 0);
          }
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "pl.H(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean d(byte param0) {
        if (param0 != 53) {
          pl.a(49);
          return this.field_C;
        }
        return this.field_C;
    }

    boolean a(char param0, int param1, byte param2, ub param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 > -96) {
            return true;
          }
          if (!this.d((byte) 53)) {
            return false;
          }
          if (84 != param1 &&
            param1 != 83) {
            return false;
          }
          this.b(-117, -1, -1, 1);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("pl.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static String a(int param0) {
        if (param0 != 0) {
          return (String) null;
        }
        if (fi.field_y == field_E) {
          return sf.field_a;
        }
        return lb.field_e;
    }

    final void b(boolean param0) {
        if (param0) {
          return;
        }
        if (!this.field_C) {
          return;
        }
        this.field_C = false;
        if (this.field_s == null) {
          return;
        }
        if (this.field_s instanceof ma) {
          ((ma) (this.field_s)).a((ub) (this), -19975, this.field_C);
          return;
        }
    }

    public static void d(boolean param0) {
        field_E = null;
        if (!param0) {
          pl.a(68);
        }
    }

    protected pl() {
        this.field_y = true;
        this.field_B = true;
        this.field_C = false;
        this.field_w = kc.field_H.field_n;
    }

    pl(String param0, bf param1, ce param2) {
        super(param0, param1, param2);
        this.field_y = true;
        this.field_B = true;
        this.field_C = false;
    }

    static {
        field_A = 0;
        field_D = false;
        field_E = new ga();
    }
}
