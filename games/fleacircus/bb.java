/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class bb extends qa {
    boolean field_G;
    static int field_C;
    boolean field_D;
    static String field_H;
    static String field_I;
    static String field_J;
    static int field_E;
    private boolean field_B;
    private boolean field_F;
    static Boolean field_A;

    final StringBuilder a(StringBuilder param0, Hashtable param1, int param2, int param3) {
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
          if (param3 > -47) {
            this.field_D = true;
          }
          if (this.a(param1, 95, param0, param2)) {
            this.a(param2, 96, param0, param1);
            if (this.field_G) {
              discarded$2 = param0.append(" active");
            }
            if (!this.field_D) {
              discarded$3 = param0.append(" disabled");
            }
          }
          stackIn_10_0 = (StringBuilder) (param0);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("bb.S(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    bb(String param0, ch param1, kd param2) {
        super(param0, param1, param2);
        this.field_D = true;
        this.field_B = true;
        this.field_F = false;
    }

    boolean a(int param0, boolean param1, int param2, qa param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1) {
            return false;
          }
          if (!this.field_D) {
            return false;
          }
          if (!this.b(param0, param6, 0, param4, param2)) {
            return false;
          }
          this.a(param3, -117);
          this.field_v = param5;
          if (null != this.field_s &&
            this.field_s instanceof dg) {
            ((dg) (this.field_s)).a(param2, this, param5, param4, 769, param0, param6);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_15_0 = var8;
          stackIn_15_1 = new StringBuilder().append("bb.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        if (this.field_s == null) {
          if (param1 == 84) {
            return;
          }
          this.field_B = true;
          return;
        }
        if (!(this.field_s instanceof da)) {
          if (param1 == 84) {
            return;
          }
          this.field_B = true;
          return;
        }
        ((da) (this.field_s)).a(param0, param2, param3, 248, this);
        if (param1 == 84) {
          return;
        }
        this.field_B = true;
    }

    void a(int param0, int param1, qa param2, byte param3) {
        if (param3 > -85) {
          return;
        }
        try {
          super.a(param0, param1, param2, (byte) -94);
          if (this.field_v != 0) {
            if (this.field_v == kc.field_f) {
              return;
            }
            if (this.b(param0, param1, 0, ag.field_f, kc.field_b) &&
              kc.field_f == 0) {
              this.a(kc.field_b - param0, 84, -param1 + ag.field_f, this.field_v);
            }
            this.a((byte) 5, param2, param1, ag.field_f, kc.field_b, param0);
          }
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "bb.I(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    boolean a(int param0, int param1, qa param2, char param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -2) {
            return false;
          }
          if (this.e(~param0) && (84 == param1 ||
            param1 == 83)) {
            this.a(-1, 84, -1, 1);
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("bb.N(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
        }
    }

    bb(String param0, kd param1) {
        this(param0, nf.field_M.field_p, param1);
    }

    boolean a(qa param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_D &&
            this.field_B) {
            param0.f(-1);
            this.field_F = true;
            if (this.field_s != null &&
              this.field_s instanceof p) {
              ((p) (this.field_s)).a((qa) (this), this.field_F, (byte) -31);
            }
            if (param1 < -26) {
              return true;
            }
            this.field_D = true;
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("bb.A(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(byte param0, qa param1, int param2, int param3, int param4, int param5) {
        try {
          if (param0 != 5) {
            qa var8 = (qa) null;
            this.a((qa) null, 66);
          }
          if (this.field_s != null &&
            this.field_s instanceof dg) {
            ((dg) (this.field_s)).a(param2, param5, true, this, param4, param3);
          }
          this.field_v = 0;
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "bb.R(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void a(int param0) {
        field_H = null;
        field_I = null;
        if (param0 == -1) {
          field_A = null;
          field_J = null;
          return;
        }
        field_J = (String) null;
        field_A = null;
        field_J = null;
    }

    final void f(int param0) {
        if (!this.field_F) {
          if (param0 == -1) {
            return;
          }
          field_A = (Boolean) null;
          return;
        }
        this.field_F = false;
        if (this.field_s == null) {
          if (param0 == -1) {
            return;
          }
          field_A = (Boolean) null;
          return;
        }
        if (!(this.field_s instanceof p)) {
          if (param0 == -1) {
            return;
          }
          field_A = (Boolean) null;
          return;
        }
        ((p) (this.field_s)).a((qa) (this), this.field_F, (byte) -31);
        if (param0 == -1) {
          return;
        }
        field_A = (Boolean) null;
    }

    final boolean e(int param0) {
        if (param0 == 1) {
          return this.field_F;
        }
        qa var3 = (qa) null;
        this.a(-92, -95, (qa) null, '\005');
        return this.field_F;
    }

    protected bb() {
        this.field_D = true;
        this.field_B = true;
        this.field_F = false;
        this.field_p = nf.field_M.field_h;
    }

    static {
        field_H = "Show help";
        field_J = "Player names can be up to 12 letters, numbers and underscores";
        field_I = "Next";
    }
}
