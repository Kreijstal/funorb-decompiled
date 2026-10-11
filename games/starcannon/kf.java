/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class kf extends uj implements ch {
    static int field_v;
    uj field_t;
    static String field_u;

    public static void a(int param0) {
        if (param0 != 0) {
          field_v = 98;
        }
        field_u = null;
    }

    String d(int param0) {
        String var3 = null;
        String var2 = super.d(param0);
        if (null != this.field_t) {
          var3 = this.field_t.d(12606);
          if (var3 != null) {
            return var3;
          }
        }
        return var2;
    }

    kf(int param0, int param1, int param2, int param3, de param4, qg param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    final int c(boolean param0) {
        if (param0) {
          return -44;
        }
        return null == this.field_t ? 0 : this.field_t.c(param0);
    }

    final void a(int param0, int param1, byte param2, int param3, int param4) {
        if (param2 <= 115) {
          StringBuilder var7 = (StringBuilder) null;
          this.a((Hashtable) null, (StringBuilder) null, (byte) -25, 62);
        }
        super.a(param0, param1, (byte) 121, param3, param4);
        this.f(-77);
    }

    final boolean a(uj param0, char param1, byte param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != this.field_t &&
            this.field_t.d(true) &&
            this.field_t.a(param0, param1, (byte) -90, param3)) {
            return true;
          }
          var5_int = param3;
          if (var5_int == 80) {
            if (!wc.field_c[81]) {
              stackIn_11_0 = this.c(0, param0);
            } else {
              stackIn_11_0 = this.b(-91, param0);
            }
            return stackIn_11_0;
          }
          if (param2 == -90) {
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_19_0 = var5;
          stackIn_19_1 = new StringBuilder().append("kf.EA(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    boolean a(uj param0, int param1, int param2, int param3, byte param4, int param5, int param6) {
        RuntimeException var8 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 != -11) {
            return true;
          }
          stackIn_7_0 = (this.field_t != null) && (this.field_t.a(param0, param1, param2 + this.field_s, this.field_j + param3, (byte) -11, param5, param6));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_10_0 = var8;
          stackIn_10_1 = new StringBuilder().append("kf.G(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final boolean d(boolean param0) {
        if (!param0) {
          this.field_t = (uj) null;
        }
        return null != this.e(0) ? true : false;
    }

    private final boolean c(int param0, uj param1) {
        RuntimeException var3 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 0) {
            return false;
          }
          stackIn_8_0 = (null != this.field_t) && (!this.field_t.d(true)) && (this.field_t.a(0, param1));
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("kf.BB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final void a(Hashtable param0, int param1, int param2, StringBuilder param3) {
        StringBuilder discarded$29 = null;
        int var5_int = 0;
        StringBuilder discarded$31 = null;
        StringBuilder discarded$30 = null;
        uj var6 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          discarded$29 = param3.append('\n');
          if (param2 != -349) {
            var6 = (uj) null;
            this.a(-87, -65, -10, 79, (uj) null, 82, 123);
          }
          for (var5_int = 0; var5_int <= param1; var5_int++) {
            discarded$31 = param3.append(' ');
          }
          if (null != this.field_t) {
            this.field_t.a(param0, param3, (byte) 39, 1 + param1);
          } else {
            discarded$30 = param3.append("null");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_11_0 = var5;
          stackIn_11_1 = new StringBuilder().append("kf.WA(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    uj e(int param0) {
        if (param0 != 0) {
          field_u = (String) null;
        }
        uj var2 = this.field_t;
        if (var2 == null) {
          return null;
        }
        if (var2.d(true)) {
          return var2;
        }
        return null;
    }

    void f(int param0) {
        int var2 = -121 / ((param0 - 47) / 52);
        if (this.field_t != null) {
          this.field_t.d((byte) -30);
        }
    }

    final boolean a(int param0, uj param1) {
        RuntimeException var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 0) {
            return false;
          }
          stackIn_7_0 = (null != this.field_t) && (this.field_t.a(0, param1));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("kf.PA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, uj param4, int param5, int param6) {
        RuntimeException var8 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param6 != -81) {
            field_u = (String) null;
          }
          stackIn_7_0 = (null != this.field_t) && (this.field_t.d(true)) && (this.field_t.a(param0, param1, param2, param3, param4, param5, -81));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_10_0 = var8;
          stackIn_10_1 = new StringBuilder().append("kf.AB(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    void a(int param0, int param1, int param2, uj param3, byte param4, int param5) {
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          if (param4 != -22) {
            field_u = (String) null;
          }
          if (null != this.field_t) {
            this.field_t.a(param0, param1 + this.field_j, param2 + this.field_s, param3, (byte) -22, param5);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_7_0 = var7;
          stackIn_7_1 = new StringBuilder().append("kf.OA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    void a(int param0, int param1, byte param2, int param3) {
        if (0 == param0 &&
          this.field_o != null) {
          this.field_o.a(param1, true, 122, param3, (uj) (this));
        }
        if (param2 != 49) {
          this.field_t = (uj) null;
        }
        if (this.field_t != null) {
          this.field_t.a(param0, param1 + this.field_s, (byte) 49, this.field_j + param3);
        }
    }

    final void b(byte param0) {
        if (this.field_t != null) {
          this.field_t.b((byte) -101);
        }
        if (param0 >= -72) {
          this.d(104);
        }
    }

    private final boolean b(int param0, uj param1) {
        RuntimeException var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > -88) {
            field_u = (String) null;
          }
          stackIn_7_0 = (null != this.field_t) && (!this.field_t.d(true)) && (this.field_t.a(0, param1));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("kf.GB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    void a(int param0, int param1, uj param2, int param3) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param0 < 27) {
            return;
          }
          super.a(87, param1, param2, param3);
          if (this.field_t != null) {
            this.field_t.a(89, this.field_s + param1, param2, param3 + this.field_j);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("kf.U(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(')').toString());
        }
    }

    StringBuilder a(Hashtable param0, StringBuilder param1, byte param2, int param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(param0, 0, param1, param3)) {
            this.a(param0, param1, param3, 19103);
            this.a(param0, param3, param2 - 388, param1);
          }
          if (param2 != 39) {
            this.d(-10);
          }
          stackIn_5_0 = (StringBuilder) (param1);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("kf.SA(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_u = "To server list";
    }
}
