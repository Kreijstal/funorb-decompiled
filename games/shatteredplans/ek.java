/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class ek extends vg implements ni {
    static String field_H;
    static String field_y;
    static bi field_z;
    vg[] field_B;
    static String field_G;
    static int field_A;
    static qr field_E;
    static bc field_D;
    static boolean[] field_F;

    private final boolean a(int param0, int param1, vg param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        vg var6 = null;
        vg var7 = null;
        int var8 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        vg var7Lifetime1;
        vg var7Lifetime2;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var4_int = 24 / ((param1 + 58) / 41);
          if (null == this.field_B) {
            return false;
          }
          var5 = this.field_B.length - 1;
          while (var5 >= 0) {
            var6 = this.field_B[var5];
            var7 = var6;
            var7Lifetime1 = var6;
            if (null != var6 &&
              var6.f(1)) {
              for (var5 = var5 - param0; var5 >= 0; var5 = var5 - param0) {
                var7Lifetime2 = this.field_B[var5];
                if (null != var7Lifetime2 &&
                  var7Lifetime2.a((byte) 123, param2)) {
                  return true;
                }
              }
            }
            var5--;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_22_0 = var4;
          stackIn_22_1 = new StringBuilder().append("ek.H(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, int param2, vg param3, int param4, int param5, int param6) {
        int var9 = 0;
        vg[] var8 = null;
        RuntimeException var8_ref = null;
        vg var10 = null;
        int var11 = 0;
        vg[] var12 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (this.field_B == null) {
            return false;
          }
          var12 = this.field_B;
          var8 = var12;
          for (var9 = param0; var12.length > var9; var9++) {
            var10 = var12[var9];
            if (var10 != null &&
              var10.f(1) &&
              var10.a(param0 ^ 0, param1, param2, param3, param4, param5, param6)) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_17_0 = var8_ref;
          stackIn_17_1 = new StringBuilder().append("ek.MA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    ek(int param0, int param1, int param2, int param3, iq param4) {
        super(param0, param1, param2, param3, param4, (ko) null);
    }

    final boolean a(int param0, char param1, int param2, vg param3) {
        int var6 = 0;
        vg[] var5 = null;
        int var5_int = 0;
        RuntimeException var5_ref = null;
        vg var7 = null;
        int var8 = 0;
        vg[] var9 = null;
        boolean stackIn_19_0 = false;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (null == this.field_B) {
            return false;
          }
          if (param2 != 13) {
            ek.a(12, 50, -9, 113, (byte) 82);
          }
          var9 = this.field_B;
          var5 = var9;
          for (var6 = 0; var6 < var9.length; var6++) {
            var7 = var9[var6];
            if (var7 != null &&
              var7.f(1) &&
              var7.a(param0, param1, 13, param3)) {
              return true;
            }
          }
          var5_int = param0;
          if (80 != var5_int) {
            return false;
          }
          if (di.field_p[81]) {
            stackIn_19_0 = this.a(111, param3);
          } else {
            stackIn_19_0 = this.a(param3, -1);
          }
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_24_0 = var5_ref;
          stackIn_24_1 = new StringBuilder().append("ek.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    private final boolean a(vg param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -1) {
            ek.a(-30, 122, -111, (byte) 51, -17, -36, -28);
          }
          stackIn_3_0 = this.a(param0, (byte) -110, 1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ek.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(int param0, StringBuilder param1, Hashtable param2, int param3) {
        int var6 = 0;
        StringBuilder discarded$4 = null;
        int var8 = 0;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$5 = null;
        vg var7 = null;
        int var9 = 0;
        vg[] var10 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (this.field_B == null) {
            return;
          }
          var10 = this.field_B;
          for (var6 = param3; var6 < var10.length; var6++) {
            var7 = var10[var6];
            discarded$4 = param1.append('\n');
            for (var8 = 0; param0 >= var8; var8++) {
              discarded$6 = param1.append(' ');
            }
            if (var7 == null) {
              discarded$5 = param1.append("null");
            } else {
              var7.a((byte) -28, param2, 1 + param0, param1);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_15_0 = var5;
          stackIn_15_1 = new StringBuilder().append("ek.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, int param1, byte param2, int param3, int param4) {
        vg discarded$0 = null;
        if (param2 <= 99) {
          discarded$0 = this.a((byte) 48);
        }
        super.a(param0, param1, (byte) 101, param3, param4);
        this.h(116);
    }

    final static bi[] a(int param0, int param1, int param2, int param3, byte param4) {
        if (param4 != -92) {
          field_E = (qr) null;
        }
        return pg.a(param2, 1, 1, (byte) -41, param3, param0, 3, 1, param1);
    }

    final static boolean a(int param0, int param1, int param2, byte param3, int param4, int param5, int param6) {
        boolean stackIn_8_0 = false;
        if (param3 >= -66) {
          ek.a(-78);
        }
        stackIn_8_0 = (param2 <= param1) && (param2 + param5 > param1) && (param6 >= param4) && (param6 < param0 + param4);
        return stackIn_8_0;
    }

    final void e(byte param0) {
        int var4 = 0;
        vg[] var2;
        int var3;
        vg var5;
        int var6;
        vg[] var7;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        var7 = this.field_B;
        var2 = var7;
        var3 = 119 % ((param0 + 84) / 33);
        for (var4 = 0; var7.length > var4; var4++) {
          var5 = var7[var4];
          if (var5 != null) {
            var5.e((byte) 6);
          }
        }
    }

    public static void a(int param0) {
        field_D = null;
        field_z = null;
        field_F = null;
        field_y = null;
        field_G = null;
        field_E = null;
        if (param0 != -1) {
          field_F = (boolean[]) null;
        }
        field_H = null;
    }

    void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        vg var6;
        int var7;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param0 == 0 &&
          null != this.field_p) {
          this.field_p.a((vg) (this), param3, true, param2, (byte) 12);
        }
        if (param1 != -11857) {
          this.a(-17, 93, (byte) 121, 115, -79);
        }
        if (this.field_B != null) {
          for (var5 = -1 + this.field_B.length; var5 >= 0; var5--) {
            var6 = this.field_B[var5];
            if (var6 != null) {
              var6.a(param0, param1 ^ 0, this.field_q + param2, this.field_m + param3);
            }
          }
        }
    }

    final boolean a(int param0, int param1, byte param2, int param3, int param4, int param5, vg param6) {
        int var9 = 0;
        vg[] var8 = null;
        RuntimeException var8_ref = null;
        vg var10 = null;
        int var11 = 0;
        vg[] var12 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (null == this.field_B) {
            return false;
          }
          var12 = this.field_B;
          var8 = var12;
          for (var9 = 0; var9 < var12.length; var9++) {
            var10 = var12[var9];
            if (var10 != null &&
              var10.a(param0, param1, (byte) 111, param3, this.field_m + param4, this.field_q + param5, param6)) {
              return true;
            }
          }
          if (param2 >= 95) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_18_0 = var8_ref;
          stackIn_18_1 = new StringBuilder().append("ek.TA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    private final vg a(byte param0) {
        int var3 = 0;
        vg[] var2;
        vg var4;
        int var5;
        vg[] var6;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        if (null == this.field_B) {
          return null;
        }
        var6 = this.field_B;
        var2 = var6;
        for (var3 = 0; var3 < var6.length; var3++) {
          var4 = var6[var3];
          if (var4 != null &&
            var4.f(1)) {
            return var4;
          }
        }
        if (param0 == -96) {
          return null;
        }
        field_z = (bi) null;
        return null;
    }

    final boolean f(int param0) {
        if (param0 != 1) {
          return false;
        }
        return null != this.a((byte) -96) ? true : false;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, vg param5) {
        vg[] var11 = null;
        int var8 = 0;
        vg var9 = null;
        int var10 = ShatteredPlansClient.field_F ? 1 : 0;
        if (this.field_B == null) {
          return;
        }
        try {
          var11 = this.field_B;
          vg[] var7 = var11;
          for (var8 = 0; var8 < var11.length; var8++) {
            var9 = var11[var8];
            if (var9 != null) {
              var9.a(param0, this.field_q + param1, param2 + this.field_m, param3, -600269855, param5);
            }
          }
          if (param4 != -600269855) {
            field_E = (qr) null;
          }
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "ek.HA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    abstract void h(int param0);

    final boolean a(byte param0, vg param1) {
        int var5 = 0;
        vg[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        vg var6 = null;
        int var7 = 0;
        vg[] var8 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var4 = 101 / ((61 - param0) / 59);
          var8 = this.field_B;
          var3 = var8;
          for (var5 = 0; var5 < var8.length; var5++) {
            var6 = var8[var5];
            if (var6 != null &&
              var6.a((byte) -10, param1)) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("ek.CA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    private final boolean a(vg param0, byte param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        vg var5 = null;
        vg var6 = null;
        int var7 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        vg var6Lifetime1;
        vg var6Lifetime2;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (this.field_B == null) {
            return false;
          }
          if (param1 > -70) {
            return false;
          }
          var4_int = 0;
          while (this.field_B.length > var4_int) {
            var5 = this.field_B[var4_int];
            var6 = var5;
            var6Lifetime1 = var5;
            if (var5 != null &&
              var5.f(1)) {
              for (var4_int = var4_int + param2; var4_int < this.field_B.length; var4_int = var4_int + param2) {
                var6Lifetime2 = this.field_B[var4_int];
                if (var6Lifetime2 != null &&
                  var6Lifetime2.a((byte) 126, param0)) {
                  return true;
                }
              }
            }
            var4_int++;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_26_0 = var4;
          stackIn_26_1 = new StringBuilder().append("ek.D(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    void a(int param0, int param1, vg param2, byte param3) {
        int var6 = 0;
        vg[] var5 = null;
        vg var7 = null;
        int var8 = 0;
        vg[] var9 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          super.a(param0, param1, param2, param3);
          if (null == this.field_B) {
            return;
          }
          var9 = this.field_B;
          var5 = var9;
          for (var6 = 0; var6 < var9.length; var6++) {
            var7 = var9[var6];
            if (var7 != null) {
              var7.a(this.field_m + param0, param1 + this.field_q, param2, (byte) 91);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_12_0 = var5_ref;
          stackIn_12_1 = new StringBuilder().append("ek.PA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    final int e(int param0) {
        int var4 = 0;
        int var2;
        vg[] var3;
        vg var5;
        int var7;
        int var6;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        var2 = 0;
        if (param0 != -600269855) {
          return -89;
        }
        var3 = this.field_B;
        for (var4 = 0; var4 < var3.length; var4++) {
          var5 = var3[var4];
          if (var5 != null) {
            var6 = var5.e(param0 + 0);
            if (var6 > var2) {
              var2 = var6;
            }
          }
        }
        return var2;
    }

    private final boolean a(int param0, vg param1) {
        RuntimeException var3 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= 98) {
            stackIn_4_0 = this.a(1, 22, param1);
            return stackIn_4_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("ek.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final StringBuilder a(byte param0, Hashtable param1, int param2, StringBuilder param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        StringBuilder stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(false, param2, param3, param1)) {
            this.a(param1, param2, false, param3);
            this.a(param2, param3, param1, 0);
          }
          var5_int = -103 % ((64 - param0) / 61);
          stackIn_3_0 = (StringBuilder) (param3);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("ek.NA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final String c(boolean param0) {
        int var3 = 0;
        vg[] var2;
        vg var4;
        int var6;
        String var5;
        vg var7;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        if (null == this.field_B) {
          return null;
        }
        var2 = this.field_B;
        for (var3 = 0; var3 < var2.length; var3++) {
          var4 = var2[var3];
          if (var4 != null) {
            var5 = var4.c(true);
            if (var5 != null) {
              return var5;
            }
          }
        }
        if (param0) {
          return null;
        }
        var7 = (vg) null;
        this.a(115, -37, -38, (vg) null, 68, 55, -109);
        return null;
    }

    static {
        field_y = "<%0> has resigned.";
        field_H = "Year of Great Beginnings";
        field_G = "Unrated game";
    }
}
