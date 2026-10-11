/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class mg extends w implements dh {
    static boolean field_B;
    w field_A;
    static int[] field_x;
    static String field_z;
    static int field_y;

    final boolean a(char param0, int param1, w param2, byte param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = -22 % ((-13 - param3) / 55);
          if (this.field_A != null &&
            this.field_A.a(18337) &&
            this.field_A.a(param0, param1, param2, (byte) 63)) {
            return true;
          }
          var6 = param1;
          if (var6 != 80) {
            return false;
          }
          if (wa.field_j[81]) {
            stackIn_10_0 = this.a(param2, 20638);
          } else {
            stackIn_10_0 = this.b(param2, 32);
          }
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("mg.P(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean a(byte param0, w param1) {
        RuntimeException var3 = null;
        w var4 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 44) {
            var4 = (w) null;
            this.a((byte) -64, (w) null, -127, -30);
          }
          stackIn_6_0 = (null != this.field_A) && (this.field_A.a((byte) 44, param1));
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("mg.LA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final void b(StringBuilder param0, int param1, int param2, Hashtable param3) {
        StringBuilder discarded$28 = null;
        int var5_int = 0;
        StringBuilder discarded$30 = null;
        StringBuilder discarded$29 = null;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = Lexicominos.field_L ? 1 : 0;
        try {
          discarded$28 = param0.append('\n');
          if (param1 != -28327) {
            this.field_A = (w) null;
          }
          for (var5_int = 0; var5_int <= param2; var5_int++) {
            discarded$30 = param0.append(' ');
          }
          if (this.field_A != null) {
            this.field_A.a(1 + param2, param3, param0, -15992);
          } else {
            discarded$29 = param0.append("null");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("mg.IB(");
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
          throw ld.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static int a(int param0, gb param1, gb param2) {
        RuntimeException var3 = null;
        String var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 0) {
            field_z = (String) null;
          }
          var4 = (String) null;
          stackIn_3_0 = hc.a(0, 0, param1, -30762, param2, (String) null, false);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("mg.KB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    mg(int param0, int param1, int param2, int param3, rd param4, vd param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    void a(w param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          if (this.field_A != null) {
            this.field_A.a(param0, param1, this.field_o + param2, 0, this.field_t + param4, param5);
          }
          if (param3 != 0) {
            field_B = false;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_7_0 = var7;
          stackIn_7_1 = new StringBuilder().append("mg.BB(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    public static void d(boolean param0) {
        if (param0) {
          return;
        }
        field_z = null;
        field_x = null;
    }

    boolean a(int param0, int param1, w param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -4808) {
            this.c((byte) -123);
          }
          stackIn_6_0 = (null != this.field_A) && (this.field_A.a(-4808, param1, param2, param3, this.field_o + param4, this.field_t + param5, param6));
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_9_0 = var8;
          stackIn_9_1 = new StringBuilder().append("mg.VA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final static void e(int param0) {
        if (param0 != 0) {
          mg.e(-36);
        }
    }

    void a(byte param0, w param1, int param2, int param3) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          super.a(param0, param1, param2, param3);
          if (null != this.field_A) {
            this.field_A.a((byte) -119, param1, this.field_o + param2, param3 + this.field_t);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("mg.FA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final boolean b(w param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 32) {
            return false;
          }
          stackIn_8_0 = (this.field_A != null) && (!this.field_A.a(18337)) && (this.field_A.a((byte) 44, param0));
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("mg.JB(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    final int c(int param0) {
        if (param0 != 15508) {
          w var3 = (w) null;
          this.a((w) null, 16, 10, 65, -65, -26);
        }
        return null == this.field_A ? 0 : this.field_A.c(15508);
    }

    void a(byte param0, int param1, int param2, int param3) {
        if (0 == param3 &&
          null != this.field_i) {
          this.field_i.a(param1, param2, true, (w) (this), -3284);
        }
        if (null != this.field_A) {
          this.field_A.a((byte) -115, param1 + this.field_o, this.field_t + param2, param3);
        }
        if (param0 != -115) {
          field_B = false;
        }
    }

    final void a(int param0, int param1, boolean param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.g(-81);
    }

    StringBuilder a(int param0, Hashtable param1, StringBuilder param2, int param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != -15992) {
            this.a(106);
          }
          if (this.a(7373, param2, param1, param0)) {
            this.a(param2, param3 ^ -15992, param0, param1);
            this.b(param2, param3 - 12335, param0, param1);
          }
          stackIn_5_0 = (StringBuilder) (param2);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("mg.TA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param3).append(')').toString());
        }
    }

    final void c(byte param0) {
        if (null != this.field_A) {
          this.field_A.c((byte) -121);
        }
        if (param0 >= -35) {
          field_y = -80;
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, w param4, int param5, int param6) {
        RuntimeException var8 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param5 != -29771) {
            return true;
          }
          stackIn_8_0 = (this.field_A != null) && (this.field_A.a(18337)) && (this.field_A.a(param0, param1, param2, param3, param4, param5 ^ 0, param6));
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_11_0 = var8;
          stackIn_11_1 = new StringBuilder().append("mg.FB(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    private final boolean a(w param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 20638) {
            return false;
          }
          stackIn_8_0 = (this.field_A != null) && (!this.field_A.a(18337)) && (this.field_A.a((byte) 44, param0));
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("mg.MB(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean a(int param0) {
        if (param0 != 18337) {
          return false;
        }
        return null != this.f(0) ? true : false;
    }

    w f(int param0) {
        w var2 = this.field_A;
        if (param0 != 0) {
          field_z = (String) null;
        }
        if (var2 == null) {
          return null;
        }
        if (var2.a(18337)) {
          return var2;
        }
        return null;
    }

    String b(int param0) {
        String var3 = null;
        String var2 = super.b(126);
        if (null != this.field_A) {
          var3 = this.field_A.b(124);
          if (var3 != null) {
            return var3;
          }
        }
        if (param0 <= 121) {
          w var4 = (w) null;
          this.a((byte) 45, (w) null);
        }
        return var2;
    }

    void g(int param0) {
        if (this.field_A != null) {
          this.field_A.d(95);
        }
        if (param0 != -81) {
          this.field_A = (w) null;
        }
    }

    static {
        field_B = false;
        field_z = "If you do nothing the game will revert to normal view in <%0> seconds.";
    }
}
