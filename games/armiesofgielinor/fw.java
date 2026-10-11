/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class fw extends kb {
    boolean field_I;
    static int field_C;
    static int[] field_J;
    private boolean field_D;
    static String field_H;
    int field_G;
    static kl field_F;
    private boolean field_E;
    boolean field_K;

    final static void a(int param0, String[] param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != ga.field_g) {
            ga.field_g.field_T.a(100, param1);
          }
          if (null != tj.field_C) {
            tj.field_C.field_M.a(100, param1);
          }
          if (param0 == -1) {
            return;
          }
          fw.i(-98);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("fw.GA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    boolean a(int param0, kb param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.field_I) {
            return false;
          }
          if (!this.field_D) {
            return false;
          }
          if (param0 != 11) {
            field_C = 102;
          }
          param1.f(1);
          this.field_E = true;
          if (this.field_x != null &&
            this.field_x instanceof ie) {
            ((ie) (this.field_x)).a((kb) (this), this.field_E, (byte) -41);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("fw.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    void a(int param0, int param1, int param2, kb param3) {
        try {
          super.a(param0 + 0, param1, param2, param3);
          this.field_G = 0;
          if (param0 != 32722) {
            field_C = -124;
          }
          if (this.field_q != 0) {
            if (this.field_q == ro.field_ub) {
              return;
            }
            if (this.b(param0 - 32721, param1, ko.field_b, AiPlanningStrategy.field_d, param2) &&
              ro.field_ub == 0) {
              this.a(this.field_q, AiPlanningStrategy.field_d - param1, ko.field_b - param2, true);
            }
            this.a(param2, param3, AiPlanningStrategy.field_d, (byte) -118, ko.field_b, param1);
          }
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "fw.P(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    fw(String param0, qo param1) {
        this(param0, t.field_c.field_j, param1);
    }

    boolean a(kb param0, int param1, char param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(false) && (84 == param1 ||
            param1 == 83)) {
            this.a(1, -1, -1, true);
            return true;
          }
          if (param3 == -12215) {
            return false;
          }
          field_F = (kl) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("fw.F(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void i(int param0) {
        field_H = null;
        field_J = null;
        if (param0 != 0) {
          return;
        }
        field_F = null;
    }

    final StringBuilder a(int param0, StringBuilder param1, int param2, Hashtable param3) {
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
          if (this.a(param3, param0, (byte) 106, param1)) {
            this.a(param0, param3, true, param1);
            if (this.field_K) {
              discarded$2 = param1.append(" active");
            }
            if (!this.field_I) {
              discarded$3 = param1.append(" disabled");
            }
          }
          if (param2 != 26477) {
            this.a(true);
          }
          stackIn_9_0 = (StringBuilder) (param1);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("fw.OA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final boolean a(boolean param0) {
        if (param0) {
          return false;
        }
        return this.field_E;
    }

    void a(int param0, int param1, int param2, boolean param3) {
        this.field_G = param0;
        if (!param3) {
          return;
        }
        if (null == this.field_x) {
          return;
        }
        if (this.field_x instanceof he) {
          ((he) (this.field_x)).a(param1, 11, param0, param2, this);
          return;
        }
    }

    fw(String param0, kh param1, qo param2) {
        super(param0, param1, param2);
        this.field_I = true;
        this.field_D = true;
        this.field_E = false;
        this.field_G = 0;
    }

    final void a(int param0, kb param1, int param2, byte param3, int param4, int param5) {
        try {
          if (this.field_x != null &&
            this.field_x instanceof qe) {
            ((qe) (this.field_x)).a(-110, param4, this, param5, param0, param2);
          }
          int var7_int = -87 % ((param3 + 58) / 53);
          this.field_q = 0;
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "fw.JA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    boolean a(int param0, int param1, int param2, int param3, kb param4, int param5, int param6) {
        RuntimeException var8 = null;
        kb var9 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_I &&
            this.b(1, param1, param5, param0, param2)) {
            this.a(11, param4);
            this.field_q = param6;
            if (null != this.field_x &&
              this.field_x instanceof qe) {
              ((qe) (this.field_x)).a(this, param2, param1, param0, param5, param6, (byte) 110);
            }
            return true;
          }
          if (param3 > 103) {
            return false;
          }
          var9 = (kb) null;
          this.a(67, -21, 92, 52, (kb) null, -105, -128);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_13_0 = var8;
          stackIn_13_1 = new StringBuilder().append("fw.NA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    fw(int param0, int param1, int param2, int param3, kh param4, qo param5) {
        super(param0, param1, param2, param3, param4, param5);
        this.field_I = true;
        this.field_D = true;
        this.field_E = false;
        this.field_G = 0;
    }

    final void f(int param0) {
        Hashtable var3 = null;
        Hashtable var3Lifetime1;
        Hashtable var3Lifetime2;
        Hashtable var3Lifetime3;
        if (!this.field_E) {
          if (param0 == 1) {
            return;
          }
          var3 = (Hashtable) null;
          this.a(78, (StringBuilder) null, 126, (Hashtable) null);
          return;
        }
        this.field_E = false;
        if (null == this.field_x) {
          if (param0 == 1) {
            return;
          }
          var3Lifetime1 = (Hashtable) null;
          this.a(78, (StringBuilder) null, 126, (Hashtable) null);
          return;
        }
        if (this.field_x instanceof ie) {
          ((ie) (this.field_x)).a((kb) (this), this.field_E, (byte) -41);
          if (param0 == 1) {
            return;
          }
          var3Lifetime2 = (Hashtable) null;
          this.a(78, (StringBuilder) null, 126, (Hashtable) null);
          return;
        }
        if (param0 == 1) {
          return;
        }
        var3Lifetime3 = (Hashtable) null;
        this.a(78, (StringBuilder) null, 126, (Hashtable) null);
    }

    public fw() {
        this.field_I = true;
        this.field_D = true;
        this.field_E = false;
        this.field_G = 0;
        this.field_k = t.field_c.field_q;
    }

    static {
        field_H = "Average rating";
    }
}
