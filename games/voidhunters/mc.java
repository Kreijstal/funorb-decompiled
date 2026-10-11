/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class mc extends shb implements nea {
    shb field_t;
    static int field_u;

    final int c(int param0) {
        if (param0 != 0) {
          field_u = 110;
        }
        return null == this.field_t ? 0 : this.field_t.c(0);
    }

    boolean a(int param0, int param1, int param2, int param3, shb param4, int param5, byte param6) {
        RuntimeException var8 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param6 >= -17) {
            field_u = -57;
          }
          stackIn_6_0 = (this.field_t != null) && (this.field_t.a(param0, this.field_g + param1, param2, param3, param4, param5 + this.field_r, (byte) -109));
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_9_0 = var8;
          stackIn_9_1 = new StringBuilder().append("mc.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    String d(byte param0) {
        String var3 = null;
        String var2 = super.d(param0);
        if (null != this.field_t) {
          var3 = this.field_t.d((byte) 125);
          if (var3 != null) {
            return var3;
          }
        }
        return var2;
    }

    final boolean a(int param0, shb param1) {
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
          stackIn_7_0 = (this.field_t != null) && (this.field_t.a(param0 ^ 0, param1));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("mc.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final boolean e(byte param0) {
        if (param0 != -120) {
          return true;
        }
        return this.d(param0 ^ -6075) != null ? true : false;
    }

    void a(int param0, int param1, int param2, shb param3) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          super.a(param0, param1, param2, param3);
          if (null != this.field_t) {
            this.field_t.a(this.field_r + param0, this.field_g + param1, param2 + 0, param3);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("mc.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static void a(int param0, boolean param1) {
        if (!(lia.field_b <= 0) &&
          bv.field_d) {
          dma.e(0, 0, dma.field_g, hca.field_o.field_u);
          dd.field_o.b(param1, 45);
        }
        if (param0 >= -117) {
          ml var3 = (ml) null;
          mc.a((ml) null, -56);
        }
        if ((nf.field_a > 0 || tba.field_p > 0) &&
          wo.field_o) {
          dma.e(0, 0, dma.field_g, hca.field_o.field_u);
          jfb.field_o.b(param1, -91);
        }
    }

    final static void a(ml param0, int param1) {
        ml var3 = null;
        ml var4 = null;
        try {
          param0.a(1, 2, new ml(13));
          param0.a(param1 ^ 26, 8, new ml(13));
          param0.a(1, 11, new ml(13));
          param0.a(1, 4, new ml(25));
          param0.a(1, 6, new ml(25));
          param0.a(1, 5, new ml(25));
          var3 = new ml(29);
          var3.a(1, 0, new ml(27));
          var3.a(1, 1, new ml(13));
          param0.a(1, 0, var3);
          var4 = new ml(29);
          var4.a(1, 0, new ml(param1));
          var4.a(1, 2, new ml(13));
          param0.a(1, 10, var4);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "mc.TA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    void a(int param0) {
        int var2 = -14 % ((param0 + 80) / 42);
        if (null != this.field_t) {
          this.field_t.a(false);
        }
    }

    StringBuilder a(boolean param0, Hashtable param1, int param2, StringBuilder param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(param1, param2, (byte) 115, param3)) {
            this.a(71, param2, param1, param3);
            this.a(param2, 13, param3, param1);
          }
          if (param0) {
            this.field_t = (shb) null;
          }
          stackIn_5_0 = (StringBuilder) (param3);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("mc.JA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    void a(byte param0, int param1, int param2, int param3, shb param4, int param5) {
        try {
          if (null != this.field_t) {
            this.field_t.a((byte) 122, param1 + this.field_g, param2, this.field_r + param3, param4, param5);
          }
          int var7_int = -98 % ((52 - param0) / 52);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "mc.G(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    void b(int param0, int param1, int param2, int param3) {
        if (param2 <= 47) {
          this.d(-117);
        }
        if (0 == param1 &&
          null != this.field_q) {
          this.field_q.a(103, (shb) (this), param0, param3, true);
        }
        if (null != this.field_t) {
          this.field_t.b(this.field_g + param0, param1, 127, param3 + this.field_r);
        }
    }

    private final boolean b(int param0, shb param1) {
        RuntimeException var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -83) {
            this.e((byte) 65);
          }
          stackIn_7_0 = (null != this.field_t) && (!this.field_t.e((byte) -120)) && (this.field_t.a(0, param1));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("mc.SA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, StringBuilder param2, Hashtable param3) {
        StringBuilder discarded$4 = null;
        int var5_int = 0;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$5 = null;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = VoidHunters.field_G;
        try {
          discarded$4 = param2.append('\n');
          for (var5_int = 0; var5_int <= param0; var5_int++) {
            discarded$6 = param2.append(' ');
          }
          if (null != this.field_t) {
            this.field_t.a(false, param3, param0 + 1, param2);
          } else {
            discarded$5 = param2.append("null");
          }
          if (param1 != 13) {
            this.field_t = (shb) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("mc.UA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    private final boolean a(byte param0, shb param1) {
        RuntimeException var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -47) {
            field_u = 81;
          }
          stackIn_7_0 = (null != this.field_t) && (!this.field_t.e((byte) -120)) && (this.field_t.a(0, param1));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("mc.VA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, shb param2, char param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        shb var6 = null;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -15834) {
            var6 = (shb) null;
            this.a(-72, 29, -110, -50, (shb) null, 73, (byte) 9);
          }
          if (this.field_t != null &&
            this.field_t.e((byte) -120) &&
            this.field_t.a(-15834, param1, param2, param3)) {
            return true;
          }
          var5_int = param1;
          if (var5_int != 80) {
            return false;
          }
          if (!si.field_o[81]) {
            stackIn_12_0 = this.a((byte) -47, param2);
          } else {
            stackIn_12_0 = this.b(-125, param2);
          }
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_17_0 = var5;
          stackIn_17_1 = new StringBuilder().append("mc.N(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3 + 0, param4);
        this.a(-124);
        if (param3 != 1) {
          field_u = 87;
        }
    }

    final void f(byte param0) {
        if (param0 != -34) {
          field_u = -111;
        }
        if (null != this.field_t) {
          this.field_t.f((byte) -34);
        }
    }

    mc(int param0, int param1, int param2, int param3, wwa param4, sba param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    shb d(int param0) {
        if (param0 != 6093) {
          this.field_t = (shb) null;
        }
        shb var2 = this.field_t;
        if (var2 == null) {
          return null;
        }
        if (!var2.e((byte) -120)) {
          return null;
        }
        return var2;
    }

    final boolean a(int param0, int param1, int param2, shb param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -6006) {
            return true;
          }
          stackIn_8_0 = (null != this.field_t) && (this.field_t.e((byte) -120)) && (this.field_t.a(param0, -6006, param2, param3, param4, param5, param6));
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_11_0 = var8;
          stackIn_11_1 = new StringBuilder().append("mc.WA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    static {
        field_u = 5;
    }
}
