/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class om extends qm implements he {
    static boolean field_u;
    qm field_w;
    static String field_v;
    static String field_x;

    void a(qm param0, int param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = -79 / ((param1 + 50) / 59);
          super.a(param0, 24, param2, param3);
          if (this.field_w == null) {
            return;
          }
          this.field_w.a(param0, 92, param2 + this.field_j, this.field_r + param3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_5_0 = var5;
          stackIn_5_1 = new StringBuilder().append("om.N(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void b(byte param0) {
        if (null != this.field_w) {
          this.field_w.b((byte) -95);
        }
        if (param0 < -84) {
          return;
        }
        qm var3 = (qm) null;
        this.a((qm) null, -36, 90, 38);
    }

    om(int param0, int param1, int param2, int param3, wo param4, bi param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    void a(int param0, int param1, int param2, int param3, qm param4, int param5) {
        RuntimeException var7 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param5 != 0) {
            return;
          }
          if (null == this.field_w) {
            return;
          }
          this.field_w.a(param0, param1 + this.field_j, this.field_r + param2, param3, param4, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_8_0 = var7;
          stackIn_8_1 = new StringBuilder().append("om.PA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param5).append(')').toString());
        }
    }

    private final boolean a(qm param0, boolean param1) {
        RuntimeException var3 = null;
        qm var4 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            var4 = (qm) null;
            this.a(97, 105, (qm) null, 108, -78, 40, 121);
          }
          stackIn_7_0 = (null != this.field_w) && (!this.field_w.e(-109)) && (this.field_w.a(true, param0));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("om.T(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, qm param2, char param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != this.field_w &&
            this.field_w.e(param1 - 19401) &&
            this.field_w.a(param0, param1 ^ 0, param2, param3)) {
            return true;
          }
          var5_int = param0;
          if (var5_int == 80) {
            if (cp.field_k[81]) {
              stackIn_11_0 = this.a(param2, false);
            } else {
              stackIn_11_0 = this.a(4, param2);
            }
            return stackIn_11_0;
          }
          if (param1 == 19279) {
            return false;
          }
          field_v = (String) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_18_0 = var5;
          stackIn_18_1 = new StringBuilder().append("om.AA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param3).append(')').toString());
        }
    }

    qm d(byte param0) {
        qm var2 = null;
        qm var2Lifetime1;
        if (param0 < 39) {
          this.field_w = (qm) null;
          var2 = this.field_w;
          if (var2 == null) {
            return null;
          }
          if (var2.e(-111)) {
            return var2;
          }
          return null;
        }
        var2Lifetime1 = this.field_w;
        if (var2Lifetime1 == null) {
          return null;
        }
        if (var2Lifetime1.e(-111)) {
          return var2Lifetime1;
        }
        return null;
    }

    final boolean a(boolean param0, qm param1) {
        RuntimeException var3 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            this.a((byte) 61);
          }
          stackIn_6_0 = (null != this.field_w) && (this.field_w.a(true, param1));
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("om.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    boolean a(int param0, int param1, qm param2, boolean param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3) {
            field_v = (String) null;
          }
          stackIn_6_0 = (null != this.field_w) && (this.field_w.a(param0 + this.field_r, param1, param2, false, param4 + this.field_j, param5, param6));
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_9_0 = var8;
          stackIn_9_1 = new StringBuilder().append("om.KA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    void a(int param0, byte param1, int param2, int param3) {
        if (0 == param3 &&
          this.field_i != null) {
          this.field_i.a(param0, false, param2, (qm) (this), true);
        }
        if (this.field_w != null) {
          this.field_w.a(this.field_j + param0, (byte) -127, this.field_r + param2, param3);
        }
        if (param1 < -12) {
          return;
        }
        this.field_w = (qm) null;
    }

    final void a(int param0, int param1, int param2, int param3, byte param4) {
        super.a(param0, param1, param2, param3, param4);
        this.a(param4 - 8294);
    }

    final boolean e(int param0) {
        if (param0 <= -107) {
          return this.d((byte) 47) != null ? true : false;
        }
        field_v = (String) null;
        return this.d((byte) 47) != null ? true : false;
    }

    StringBuilder a(int param0, int param1, Hashtable param2, StringBuilder param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_2_0 = null;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -85) {
            stackIn_2_0 = (StringBuilder) null;
            return stackIn_2_0;
          }
          if (this.a(0, param0, param3, param2)) {
            this.a(param0, (byte) 125, param3, param2);
            this.a(param3, param2, param0, -91);
          }
          stackIn_6_0 = (StringBuilder) (param3);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("om.MA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, qm param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 1) {
            return true;
          }
          stackIn_8_0 = (this.field_w != null) && (this.field_w.e(-115)) && (this.field_w.a(1, param1, param2, param3, param4, param5, param6));
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_11_0 = var8;
          stackIn_11_1 = new StringBuilder().append("om.FB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final void a(StringBuilder param0, Hashtable param1, int param2, int param3) {
        StringBuilder discarded$3 = null;
        int var5_int = 0;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$4 = null;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = CrazyCrystals.field_B;
        try {
          if (param3 > -26) {
            this.field_w = (qm) null;
          }
          discarded$3 = param0.append('\n');
          for (var5_int = 0; param2 >= var5_int; var5_int++) {
            discarded$5 = param0.append(' ');
          }
          if (null == this.field_w) {
            discarded$4 = param0.append("null");
            return;
          }
          this.field_w.a(1 + param2, -109, param1, param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("om.V(");
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
          throw dn.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    void a(int param0) {
        if (param0 != -8346) {
          field_v = (String) null;
          if (this.field_w != null) {
            this.field_w.f(param0 + 8316);
            return;
          }
          return;
        }
        if (this.field_w == null) {
          return;
        }
        this.field_w.f(param0 + 8316);
    }

    public static void e(byte param0) {
        field_x = null;
        field_v = null;
        if (param0 != 122) {
          om.e((byte) 110);
        }
    }

    final int c(byte param0) {
        if (param0 > 30) {
          return null == this.field_w ? 0 : this.field_w.c((byte) 97);
        }
        this.field_w = (qm) null;
        return null == this.field_w ? 0 : this.field_w.c((byte) 97);
    }

    String a(byte param0) {
        String var3 = null;
        String var2 = super.a((byte) -46);
        String var3Lifetime1;
        if (param0 > -23) {
          Hashtable var4 = (Hashtable) null;
          this.a((StringBuilder) null, (Hashtable) null, 43, -106);
          if (null != this.field_w) {
            var3 = this.field_w.a((byte) -72);
            if (var3 != null) {
              return var3;
            }
            return var2;
          }
          return var2;
        }
        if (null == this.field_w) {
          return var2;
        }
        var3Lifetime1 = this.field_w.a((byte) -72);
        if (var3Lifetime1 == null) {
          return var2;
        }
        return var3Lifetime1;
    }

    private final boolean a(int param0, qm param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 7 / ((param0 + 63) / 46);
          stackIn_5_0 = (null != this.field_w) && (!this.field_w.e(-127)) && (this.field_w.a(true, param1));
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("om.W(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    static {
        field_v = "Names should contain a maximum of 12 characters";
    }
}
