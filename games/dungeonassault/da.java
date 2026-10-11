/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class da extends lm implements aa {
    lm field_D;
    static int field_C;
    static int field_B;
    static String field_E;

    void a(int param0, int param1, int param2, int param3) {
        if (param2 == param0 &&
          null != this.field_o) {
          this.field_o.a((byte) 34, (lm) (this), param1, param3, true);
        }
        if (this.field_D != null) {
          this.field_D.a(param0, this.field_q + param1, 0, this.field_v + param3);
        }
    }

    void a(int param0, boolean param1, int param2, lm param3, int param4, int param5) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          if (null != this.field_D) {
            this.field_D.a(this.field_v + param0, true, param2, param3, param4 + this.field_q, param5);
          }
          if (!param1) {
            field_B = 25;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_8_0 = var7;
          stackIn_8_1 = new StringBuilder().append("da.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final void a(boolean param0, StringBuilder param1, int param2, Hashtable param3) {
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
        var6 = DungeonAssault.field_K;
        try {
          discarded$4 = param1.append('\n');
          for (var5_int = 0; var5_int <= param2; var5_int++) {
            discarded$6 = param1.append(' ');
          }
          if (this.field_D != null) {
            this.field_D.a(1 + param2, param3, param1, (byte) -110);
          } else {
            discarded$5 = param1.append("null");
          }
          if (!param0) {
            this.field_D = (lm) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("da.IB(").append(param0).append(',');
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
          throw vk.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    String c(byte param0) {
        String var3 = null;
        if (param0 <= 3) {
          lm var4 = (lm) null;
          this.a((lm) null, 'ￅ', 105, (byte) -45);
        }
        String var2 = super.c((byte) 38);
        if (null != this.field_D) {
          var3 = this.field_D.c((byte) 41);
          if (var3 != null) {
            return var3;
          }
        }
        return var2;
    }

    boolean a(lm param0, int param1, int param2, int param3, int param4, byte param5, int param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8_int = -114 / ((-80 - param5) / 35);
          stackIn_4_0 = (null != this.field_D) && (this.field_D.a(param0, param1, param2, this.field_q + param3, param4, (byte) -117, this.field_v + param6));
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_7_0 = var8;
          stackIn_7_1 = new StringBuilder().append("da.U(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    private final boolean a(lm param0, byte param1) {
        RuntimeException var3 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 <= 35) {
            return false;
          }
          stackIn_8_0 = (this.field_D != null) && (!this.field_D.a((byte) 101)) && (this.field_D.a(34, param0));
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("da.JB(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    final int d(int param0) {
        int var2 = 11 % ((param0 - 67) / 58);
        return null == this.field_D ? 0 : this.field_D.d(-38);
    }

    private final boolean b(int param0, lm param1) {
        RuntimeException var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 2) {
            this.g(79);
          }
          stackIn_7_0 = (null != this.field_D) && (!this.field_D.a((byte) 41)) && (this.field_D.a(34, param1));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("da.HB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    lm g(int param0) {
        lm var2 = this.field_D;
        if (var2 != null &&
          var2.a((byte) 65)) {
          return var2;
        }
        if (param0 == 1) {
          return null;
        }
        lm var3 = (lm) null;
        this.a((lm) null, 22, -91, -111, -54, (byte) 90, 48);
        return null;
    }

    final boolean a(int param0, lm param1) {
        RuntimeException var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 34) {
            return true;
          }
          stackIn_7_0 = (null != this.field_D) && (this.field_D.a(34, param1));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("da.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    void a(int param0, int param1, lm param2, boolean param3) {
        try {
          super.a(param0, param1, param2, param3);
          if (this.field_D != null) {
            this.field_D.a(param0 + this.field_q, param1 + this.field_v, param2, true);
          }
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "da.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final void e(int param0) {
        if (param0 < 1) {
          field_B = -12;
        }
        if (null != this.field_D) {
          this.field_D.e(33);
        }
    }

    da(int param0, int param1, int param2, int param3, ca param4, pg param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    final boolean a(byte param0) {
        if (param0 < 6) {
          field_E = (String) null;
        }
        return this.g(1) != null ? true : false;
    }

    final static void a(String param0, int[] param1, int param2, int param3, int param4, se param5) {
        tf var6 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6_ref = null;
        try {
          var6 = new tf(param5, param0, param1);
          var6.b(-param5.field_H + param4, 32, param2 - (var6.field_i >> 1));
          if (param3 != 1917623617) {
            field_C = -116;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_5_0 = var6_ref;
          stackIn_5_1 = new StringBuilder().append("da.LB(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, lm param5, byte param6) {
        RuntimeException var8 = null;
        Random var9 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param6 != -84) {
            var9 = (Random) null;
            da.a((wm) null, (byte) 48, (Random) null);
          }
          stackIn_7_0 = (null != this.field_D) && (this.field_D.a((byte) 82)) && (this.field_D.a(param0, param1, param2, param3, param4, param5, (byte) -84));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_10_0 = var8;
          stackIn_10_1 = new StringBuilder().append("da.GB(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param6).append(')').toString());
        }
    }

    StringBuilder a(int param0, Hashtable param1, StringBuilder param2, byte param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 > -76) {
            field_E = (String) null;
          }
          if (this.a(param1, param0, -66, param2)) {
            this.a(param0, param2, param1, 1);
            this.a(true, param2, param0, param1);
          }
          stackIn_6_0 = (StringBuilder) (param2);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("da.CB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean a(lm param0, char param1, int param2, byte param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        lm var6 = null;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_D != null &&
            this.field_D.a((byte) 91) &&
            this.field_D.a(param0, param1, param2, (byte) 75)) {
            return true;
          }
          var5_int = param2;
          if (var5_int == 80) {
            if (!qk.field_e[81]) {
              stackIn_10_0 = this.a(param0, (byte) 36);
            } else {
              stackIn_10_0 = this.b(2, param0);
            }
            return stackIn_10_0;
          }
          if (param3 > 55) {
            return false;
          }
          var6 = (lm) null;
          this.a((lm) null, -62, -81, -47, 98, (byte) -16, -14);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_17_0 = var5;
          stackIn_17_1 = new StringBuilder().append("da.W(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static ai[] a(wm param0, byte param1, Random param2) {
        int var4 = 0;
        int var7 = 0;
        ai[] stackIn_32_0 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int[] var5 = null;
        int[] var6 = null;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        var9 = DungeonAssault.field_K;
        try {
          me.field_g = new ai[49];
          a.field_o = param0;
          for (var3_int = 0; var3_int < 49; var3_int++) {
            me.field_g[var3_int] = new ai(0);
          }
          me.field_g[24] = new ai(2);
          me.field_g[0] = new ai(3);
          me.field_g[6] = new ai(3);
          me.field_g[42] = new ai(3);
          me.field_g[48] = new ai(3);
          mp.a(param2, il.field_d, -127, 0, 2);
          mp.a(param2, il.field_d, -127, 6, 2);
          mp.a(param2, il.field_d, -127, 42, 2);
          mp.a(param2, il.field_d, -128, 48, 2);
          mp.a(param2, oa.field_e, -128, 0, 1);
          var3_int = -91 % ((-10 - param1) / 37);
          mp.a(param2, oa.field_e, -127, 6, 1);
          mp.a(param2, oa.field_e, -128, 42, 1);
          mp.a(param2, oa.field_e, -128, 48, 1);
          for (var4 = 0; var4 < 49; var4++) {
            L2: {
              if (uj.a(param2, 37, 5) == 0 &&
                me.field_g[var4].field_a == 0) {
                var5 = nf.a(a.field_o, var4, (byte) 121);
                var12 = var5;
                var11 = var12;
                var10 = var11;
                var6 = var10;
                for (var7 = 0; var7 < var12.length; var7++) {
                  var8 = var12[var7];
                  switch (var8) {
                    case 0:
                      break L2;
                    case 6:
                      break L2;
                    case 42:
                      break L2;
                    case 48:
                      break L2;
                    default:
                      break;
                  }
                }
                if (uj.a(param2, 37, 2) != 0) {
                  var6 = oa.field_e;
                } else {
                  var6 = il.field_d;
                }
                me.field_g[var4] = new ai(var6[uj.a(param2, 37, var6.length)]);
              }
            }
          }
          stackIn_32_0 = me.field_g;
          return stackIn_32_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_35_0 = var3;
          stackIn_35_1 = new StringBuilder().append("da.KB(");
          if (param0 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          stackIn_38_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_E = null;
        if (param0 != 6) {
          da.a(38);
        }
    }

    final void b(int param0, int param1, int param2, int param3, int param4) {
        super.b(param0 + param0, param1, param2, param3, param4);
        this.e((byte) -95);
    }

    final static cn[] a(String param0, String param1, int param2, nh param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        cn[] stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param3.a(param0, 1000);
          var5 = param3.a(param2, param1, var4_int);
          stackIn_1_0 = li.a(var4_int, var5, param3, 4);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_4_0 = var4;
          stackIn_4_1 = new StringBuilder().append("da.EB(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    void e(byte param0) {
        if (param0 > -4) {
          field_B = -122;
        }
        if (null != this.field_D) {
          this.field_D.f(12591);
        }
    }

    static {
        field_E = "The amount of Treasure lost by resets is decreased by 5%";
    }
}
