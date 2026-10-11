/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class qg extends lk implements u {
    lk field_y;
    static kc field_z;

    final int f(int param0) {
        if (param0 != -1) {
          return -97;
        }
        return null != this.field_y ? this.field_y.f(-1) : 0;
    }

    void h(int param0) {
        if (param0 != -18584) {
          lk var3 = (lk) null;
          this.a('>', (byte) 35, -64, (lk) null);
        }
        if (null != this.field_y) {
          this.field_y.g(param0 ^ -8661);
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, int param5, lk param6) {
        RuntimeException var8 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param5 != -1) {
            this.field_y = (lk) null;
          }
          stackIn_7_0 = (this.field_y != null) && (this.field_y.d(74)) && (this.field_y.a(param0, param1, param2, param3, param4, -1, param6));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_10_0 = var8;
          stackIn_10_1 = new StringBuilder().append("qg.EA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    void a(boolean param0, lk param1, int param2, int param3, int param4, int param5) {
        if (param0) {
          return;
        }
        try {
          if (null != this.field_y) {
            this.field_y.a(false, param1, param2, this.field_o + param3, param4 + this.field_i, param5);
          }
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "qg.O(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    StringBuilder a(Hashtable param0, boolean param1, int param2, StringBuilder param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(param3, param2, param1, param0)) {
            this.a(param0, (byte) -16, param3, param2);
            this.a(param3, param0, true, param2);
          }
          stackIn_4_0 = (StringBuilder) (param3);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("qg.V(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    qg(int param0, int param1, int param2, int param3, ci param4, pl param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    lk a(boolean param0) {
        if (param0) {
          return (lk) null;
        }
        lk var2 = this.field_y;
        if (var2 == null) {
          return null;
        }
        if (!var2.d(76)) {
          return null;
        }
        return var2;
    }

    final void a(StringBuilder param0, Hashtable param1, boolean param2, int param3) {
        StringBuilder discarded$3 = null;
        int var5_int = 0;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$4 = null;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = Main.field_T;
        try {
          discarded$3 = param0.append('\n');
          for (var5_int = 0; var5_int <= param3; var5_int++) {
            discarded$5 = param0.append(' ');
          }
          if (!param2) {
            return;
          }
          if (null == this.field_y) {
            discarded$4 = param0.append("null");
          } else {
            this.field_y.a(param1, false, param3 + 1, param0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("qg.UA(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean a(int param0, lk param1) {
        RuntimeException var3 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 71) {
            this.field_y = (lk) null;
          }
          stackIn_6_0 = (null != this.field_y) && (this.field_y.a(109, param1));
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("qg.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        CharSequence var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 18478) {
            return;
          }
          var2 = param0.getParameter("username");
          if (var2 != null) {
            var3 = (CharSequence) ((Object) var2);
            if (0L != fe.a(var3, param1 ^ 18519)) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_8_0 = var2_ref;
          stackIn_8_1 = new StringBuilder().append("qg.TA(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final void c(byte param0) {
        if (param0 <= 27) {
          return;
        }
        if (null != this.field_y) {
          this.field_y.c((byte) 76);
        }
    }

    boolean a(int param0, int param1, int param2, int param3, lk param4, int param5, int param6) {
        RuntimeException var8 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 >= -14) {
            this.field_y = (lk) null;
          }
          stackIn_6_0 = (this.field_y != null) && (this.field_y.a(param0 + this.field_o, this.field_i + param1, param2, -58, param4, param5, param6));
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_9_0 = var8;
          stackIn_9_1 = new StringBuilder().append("qg.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    private final boolean a(lk param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 <= 41) {
            qg.a(-48);
          }
          stackIn_7_0 = (this.field_y != null) && (!this.field_y.d(97)) && (this.field_y.a(78, param0));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("qg.RA(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    private final boolean a(lk param0, byte param1) {
        RuntimeException var3 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -23) {
            return true;
          }
          stackIn_8_0 = (null != this.field_y) && (!this.field_y.d(76)) && (this.field_y.a(120, param0));
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("qg.QA(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    String b(byte param0) {
        String var3 = null;
        String var2 = super.b(param0);
        if (this.field_y != null) {
          var3 = this.field_y.b((byte) -79);
          if (var3 != null) {
            return var3;
          }
        }
        return var2;
    }

    final void a(int param0, int param1, int param2, int param3, boolean param4) {
        super.a(param0, param1, param2, param3, param4);
        this.h(-18584);
    }

    final boolean d(int param0) {
        if (param0 <= 44) {
          this.field_y = (lk) null;
        }
        return this.a(false) != null ? true : false;
    }

    void a(int param0, int param1, lk param2, int param3) {
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          super.a(param0, param1, param2, param3 ^ 0);
          if (this.field_y != null) {
            this.field_y.a(this.field_i + param0, param1 + this.field_o, param2, param3 + 0);
          }
          if (param3 != 3) {
            field_z = (kc) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("qg.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean a(char param0, byte param1, int param2, lk param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_y != null &&
            this.field_y.d(115) &&
            this.field_y.a(param0, (byte) -111, param2, param3)) {
            return true;
          }
          var5_int = param2;
          if (var5_int == 80) {
            if (ge.field_c[81]) {
              stackIn_10_0 = this.a(param3, 47);
            } else {
              stackIn_10_0 = this.a(param3, (byte) -23);
            }
            return stackIn_10_0;
          }
          if (param1 <= -99) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_18_0 = var5;
          stackIn_18_1 = new StringBuilder().append("qg.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_z = null;
        if (param0 != 80) {
          field_z = (kc) null;
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        if (param2 != -1) {
          this.field_y = (lk) null;
        }
        if (param3 == 0 &&
          this.field_v != null) {
          this.field_v.a(param0, (lk) (this), 11447, param1, true);
        }
        if (this.field_y != null) {
          this.field_y.a(this.field_o + param0, this.field_i + param1, -1, param3);
        }
    }

    static {
    }
}
