/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class eh extends ga implements jf {
    static boolean field_z;
    static boolean field_x;
    static int field_y;
    static int field_A;
    ga[] field_B;

    void a(ga param0, byte param1, int param2, int param3) {
        int var6 = 0;
        ga[] var5 = null;
        int var7 = 0;
        ga var8 = null;
        int var9 = 0;
        ga[] var10 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var9 = ZombieDawn.field_J;
        try {
          super.a(param0, (byte) -1, param2, param3);
          if (this.field_B == null) {
            return;
          }
          var10 = this.field_B;
          var5 = var10;
          var7 = 43 % ((param1 - 46) / 42);
          for (var6 = 0; var10.length > var6; var6++) {
            var8 = var10[var6];
            if (var8 != null) {
              var8.a(param0, (byte) -22, param2 + this.field_j, this.field_k + param3);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_12_0 = var5_ref;
          stackIn_12_1 = new StringBuilder().append("eh.D(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    boolean a(ga param0, int param1, int param2, int param3, int param4, boolean param5, int param6) {
        int var9 = 0;
        ga[] var8 = null;
        RuntimeException var8_ref = null;
        ga var10 = null;
        int var11 = 0;
        ga[] var12 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        var11 = ZombieDawn.field_J;
        try {
          if (null == this.field_B) {
            return false;
          }
          if (!param5) {
            return false;
          }
          var12 = this.field_B;
          var8 = var12;
          for (var9 = 0; var9 < var12.length; var9++) {
            var10 = var12[var9];
            if (var10 != null &&
              var10.e(-17741) &&
              var10.a(param0, param1, param2, param3, param4, true, param6)) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_21_0 = var8_ref;
          stackIn_21_1 = new StringBuilder().append("eh.OA(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    boolean a(int param0, int param1, int param2, int param3, int param4, int param5, ga param6) {
        int var9 = 0;
        ga[] var8 = null;
        RuntimeException var8_ref = null;
        ga var10 = null;
        int var11 = 0;
        ga[] var12 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        var11 = ZombieDawn.field_J;
        try {
          if (this.field_B == null) {
            return false;
          }
          var12 = this.field_B;
          var8 = var12;
          for (var9 = 0; var9 < var12.length; var9++) {
            var10 = var12[var9];
            if (var10 != null &&
              var10.a(param0, 1, param2 + this.field_j, param3, param4 + this.field_k, param5, param6)) {
              return true;
            }
          }
          if (param1 == 1) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_19_0 = var8_ref;
          stackIn_19_1 = new StringBuilder().append("eh.AA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final StringBuilder a(Hashtable param0, StringBuilder param1, boolean param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_5_1 = 0;
        StringBuilder stackIn_5_2 = null;
        Object stackIn_6_0;
        boolean stackIn_6_3;
        StringBuilder stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param2) {
            this.e((byte) -8);
          }
          if (this.a(param0, param1, 11098, param3)) {
            this.a(param0, param3, 87, param1);
            stackIn_5_1 = param3;
            stackIn_5_2 = (StringBuilder) (param1);
            if (param2) {
              stackIn_6_0 = this;
              stackIn_6_3 = false;
            } else {
              stackIn_6_0 = this;
              stackIn_6_3 = true;
            }
            this.a(stackIn_5_1, stackIn_5_2, stackIn_6_3, param0);
          }
          stackIn_8_0 = (StringBuilder) (param1);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_11_0 = var5;
          stackIn_11_1 = new StringBuilder().append("eh.NA(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean a(ga param0, boolean param1) {
        RuntimeException var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            this.e((byte) 88);
          }
          stackIn_3_0 = this.a((byte) -102, 1, param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("eh.CA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    abstract void e(byte param0);

    private final ga d(byte param0) {
        ga[] var2;
        int var3;
        ga var4;
        int var5;
        var5 = ZombieDawn.field_J;
        if (null == this.field_B) {
          return null;
        }
        var2 = this.field_B;
        var3 = 0;
        if (param0 <= 87) {
          this.field_B = (ga[]) null;
        }
        while (var3 < var2.length) {
          var4 = var2[var3];
          if (var4 != null &&
            var4.e(-17741)) {
            return var4;
          }
          var3++;
        }
        return null;
    }

    final boolean a(int param0, ga param1) {
        RuntimeException var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 12139) {
            field_A = -64;
          }
          stackIn_3_0 = this.a(true, param1, 1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("eh.JA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final String d(int param0) {
        int var4 = 0;
        int var2;
        ga[] var3;
        ga var5;
        int var7;
        String var6;
        var7 = ZombieDawn.field_J;
        var2 = -37 % ((param0 - 10) / 58);
        if (this.field_B == null) {
          return null;
        }
        var3 = this.field_B;
        for (var4 = 0; var4 < var3.length; var4++) {
          var5 = var3[var4];
          if (var5 != null) {
            var6 = var5.d(-58);
            if (var6 != null) {
              return var6;
            }
          }
        }
        return null;
    }

    final static boolean a(oh param0, oh param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = ZombieDawn.field_J;
        try {
          var3_int = param0.field_kb - param1.field_kb;
          if (oo.field_T != param0.field_ib) {
            if (null == param0.field_ib) {
              var3_int += 200;
            }
          } else {
            var3_int -= 200;
          }
          if (param2 != 20) {
            return false;
          }
          if (oo.field_T != param1.field_ib) {
            if (null == param1.field_ib) {
              var3_int -= 200;
            }
          } else {
            var3_int += 200;
          }
          return !(0 >= var3_int);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_20_0 = var3;
          stackIn_20_1 = new StringBuilder().append("eh.FA(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param2).append(')').toString());
        }
    }

    final static boolean a(boolean param0, dj param1) {
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            stackIn_4_0 = param1.c(9001);
            return stackIn_4_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("eh.KA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 19 / ((param0 + 23) / 48);
        super.a(102, param1, param2, param3, param4);
        this.e((byte) 99);
    }

    final static void a(String param0, float param1, int param2) {
        try {
          ka.field_a = param0;
          if (param2 != -1) {
            field_x = true;
          }
          mm.field_k = param1;
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "eh.DA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        ga var6;
        int var7;
        var7 = ZombieDawn.field_J;
        if (param1 == param3 &&
          this.field_h != null) {
          this.field_h.a(16777215, true, param0, (ga) (this), param2);
        }
        if (null != this.field_B) {
          for (var5 = -1 + this.field_B.length; 0 <= var5; var5--) {
            var6 = this.field_B[var5];
            if (var6 != null) {
              var6.a(this.field_j + param0, param1, param2 + this.field_k, 0);
            }
          }
        }
    }

    private final void a(int param0, StringBuilder param1, boolean param2, Hashtable param3) {
        int var6 = 0;
        StringBuilder discarded$6 = null;
        int var8 = 0;
        StringBuilder discarded$8 = null;
        StringBuilder discarded$7 = null;
        ga var7 = null;
        int var9 = 0;
        ga[] var10 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var9 = ZombieDawn.field_J;
        try {
          if (param2) {
            return;
          }
          if (this.field_B == null) {
            return;
          }
          var10 = this.field_B;
          for (var6 = 0; var10.length > var6; var6++) {
            var7 = var10[var6];
            discarded$6 = param1.append('\n');
            for (var8 = 0; var8 <= param0; var8++) {
              discarded$8 = param1.append(' ');
            }
            if (var7 != null) {
              var7.a(param3, param1, true, 1 + param0);
            } else {
              discarded$7 = param1.append("null");
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_18_0 = var5;
          stackIn_18_1 = new StringBuilder().append("eh.BA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final void c(byte param0) {
        int var3 = 0;
        ga[] var2;
        ga var4;
        int var5;
        ga[] var7;
        ga var6;
        var5 = ZombieDawn.field_J;
        var7 = this.field_B;
        var2 = var7;
        for (var3 = 0; var7.length > var3; var3++) {
          var4 = var7[var3];
          if (var4 != null) {
            var4.c((byte) 57);
          }
        }
        if (param0 != 57) {
          var6 = (ga) null;
          this.a((byte) 99, -77, (ga) null);
        }
    }

    boolean a(byte param0, ga param1) {
        int var4 = 0;
        ga[] var3 = null;
        RuntimeException var3_ref = null;
        ga var5 = null;
        int var6 = 0;
        ga[] var7 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = ZombieDawn.field_J;
        try {
          var7 = this.field_B;
          var3 = var7;
          for (var4 = 0; var7.length > var4; var4++) {
            var5 = var7[var4];
            if (var5 != null &&
              var5.a((byte) 88, param1)) {
              return true;
            }
          }
          if (param0 > 67) {
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_15_0 = var3_ref;
          stackIn_15_1 = new StringBuilder().append("eh.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final boolean a(byte param0, int param1, ga param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        ga var5 = null;
        ga var6 = null;
        int var7 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = ZombieDawn.field_J;
        try {
          if (param0 != -102) {
            return true;
          }
          if (null == this.field_B) {
            return false;
          }
          var4_int = -1 + this.field_B.length;
          while (0 <= var4_int) {
            var5 = this.field_B[var4_int];
            if (var5 != null &&
              var5.e(-17741)) {
              for (var4_int = var4_int - param1; var4_int >= 0; var4_int = var4_int - param1) {
                var6 = this.field_B[var4_int];
                if (var6 != null &&
                  var6.a((byte) 109, param2)) {
                  return true;
                }
              }
            }
            var4_int--;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_24_0 = var4;
          stackIn_24_1 = new StringBuilder().append("eh.EA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    eh(int param0, int param1, int param2, int param3, io param4) {
        super(param0, param1, param2, param3, param4, (sk) null);
    }

    final void a(int param0, int param1, int param2, int param3, int param4, ga param5) {
        int var8 = 0;
        ga[] var7 = null;
        ga var9 = null;
        int var10 = 0;
        ga[] var11 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        var10 = ZombieDawn.field_J;
        try {
          if (param1 <= 1) {
            field_z = false;
          }
          if (this.field_B == null) {
            return;
          }
          var11 = this.field_B;
          var7 = var11;
          for (var8 = 0; var8 < var11.length; var8++) {
            var9 = var11[var8];
            if (var9 != null) {
              var9.a(this.field_k + param0, 107, param2, param3, this.field_j + param4, param5);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_15_0 = var7_ref;
          stackIn_15_1 = new StringBuilder().append("eh.MA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final int c(int param0) {
        int var4 = 0;
        int var2;
        ga[] var3;
        ga var5;
        int var7;
        int var6;
        var7 = ZombieDawn.field_J;
        var2 = 0;
        var3 = this.field_B;
        for (var4 = param0; var4 < var3.length; var4++) {
          var5 = var3[var4];
          if (var5 != null) {
            var6 = var5.c(0);
            if (var2 < var6) {
              var2 = var6;
            }
          }
        }
        return var2;
    }

    final boolean a(boolean param0, ga param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        ga var5 = null;
        ga var6 = null;
        int var7 = 0;
        oh var8 = null;
        Object stackIn_7_0 = null;
        ga stackIn_7_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = ZombieDawn.field_J;
        try {
          if (null == this.field_B) {
            return false;
          }
          var4_int = 0;
          while (var4_int < this.field_B.length) {
            var5 = this.field_B[var4_int];
            stackIn_7_0 = null;
            stackIn_7_1 = var5;
            if (stackIn_7_0 != stackIn_7_1 &&
              var5.e(-17741)) {
              for (var4_int = var4_int + param2; this.field_B.length > var4_int; var4_int = var4_int + param2) {
                var6 = this.field_B[var4_int];
                if (null != var6 &&
                  var6.a((byte) 106, param1)) {
                  return true;
                }
              }
            }
            var4_int++;
          }
          if (!param0) {
            var8 = (oh) null;
            eh.a((oh) null, (oh) null, (byte) -8);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_25_0 = var4;
          stackIn_25_1 = new StringBuilder().append("eh.IA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param2).append(')').toString());
        }
    }

    final boolean e(int param0) {
        if (param0 != -17741) {
          field_A = 103;
        }
        return null != this.d((byte) 100) ? true : false;
    }

    boolean a(int param0, int param1, ga param2, char param3) {
        int var7 = 0;
        ga[] var5 = null;
        int var5_int = 0;
        RuntimeException var5_ref = null;
        int var6 = 0;
        ga var8 = null;
        int var9 = 0;
        ga[] var10 = null;
        boolean stackIn_17_0 = false;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = ZombieDawn.field_J;
        try {
          if (null == this.field_B) {
            return false;
          }
          var10 = this.field_B;
          var5 = var10;
          var6 = -81 % ((-83 - param0) / 32);
          for (var7 = 0; var10.length > var7; var7++) {
            var8 = var10[var7];
            if (var8 != null &&
              var8.e(-17741) &&
              var8.a(-123, param1, param2, param3)) {
              return true;
            }
          }
          var5_int = param1;
          if (var5_int != 80) {
            return false;
          }
          if (bo.field_p[81]) {
            stackIn_17_0 = this.a(param2, false);
          } else {
            stackIn_17_0 = this.a(12139, param2);
          }
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_22_0 = var5_ref;
          stackIn_22_1 = new StringBuilder().append("eh.I(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_z = false;
        field_x = false;
        field_A = 0;
    }
}
