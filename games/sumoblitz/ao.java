/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class ao extends pk implements ug {
    pk[] field_x;
    static ji field_y;
    static String field_z;

    boolean a(pk param0, byte param1) {
        int var4 = 0;
        pk[] var3 = null;
        RuntimeException var3_ref = null;
        pk var5 = null;
        int var6 = 0;
        pk[] var7 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Sumoblitz.field_L ? 1 : 0;
        try {
          var7 = this.field_x;
          var3 = var7;
          if (param1 != 61) {
            this.field_x = (pk[]) null;
          }
          for (var4 = 0; var4 < var7.length; var4++) {
            var5 = var7[var4];
            if (var5 != null &&
              var5.a(param0, (byte) 61)) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_14_0 = var3_ref;
          stackIn_14_1 = new StringBuilder().append("ao.Q(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean a(pk param0, byte param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        pk var6 = null;
        pk var7 = null;
        int var8 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (null == this.field_x) {
            return false;
          }
          var4_int = 0;
          var5 = -106 / ((28 - param1) / 42);
          while (var4_int < this.field_x.length) {
            var6 = this.field_x[var4_int];
            if (var6 != null &&
              var6.d(-1)) {
              for (var4_int = var4_int + param2; var4_int < this.field_x.length; var4_int = var4_int + param2) {
                var7 = this.field_x[var4_int];
                if (var7 != null &&
                  var7.a(param0, (byte) 61)) {
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
          stackIn_22_0 = var4;
          stackIn_22_1 = new StringBuilder().append("ao.G(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    boolean a(pk param0, char param1, byte param2, int param3) {
        int var6 = 0;
        pk[] var5 = null;
        int var5_int = 0;
        RuntimeException var5_ref = null;
        pk var7 = null;
        int var8 = 0;
        pk[] var9 = null;
        boolean stackIn_19_0 = false;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (this.field_x == null) {
            return false;
          }
          if (param2 < 9) {
            ao.a(-24);
          }
          var9 = this.field_x;
          var5 = var9;
          for (var6 = 0; var6 < var9.length; var6++) {
            var7 = var9[var6];
            if (var7 != null &&
              var7.d(-1) &&
              var7.a(param0, param1, (byte) 72, param3)) {
              return true;
            }
          }
          var5_int = param3;
          if (var5_int != 80) {
            return false;
          }
          if (!hw.field_b[81]) {
            stackIn_19_0 = this.a((byte) -17, param0);
          } else {
            stackIn_19_0 = this.b(param0, (byte) 113);
          }
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_24_0 = var5_ref;
          stackIn_24_1 = new StringBuilder().append("ao.KA(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    ao(int param0, int param1, int param2, int param3, mh param4) {
        super(param0, param1, param2, param3, param4, (qm) null);
    }

    final boolean a(byte param0, pk param1) {
        RuntimeException var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -17) {
            this.d(-97);
          }
          stackIn_3_0 = this.a(param1, (byte) -49, 1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ao.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final StringBuilder a(int param0, Hashtable param1, StringBuilder param2, int param3) {
        RuntimeException var5 = null;
        pk var6 = null;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != 0) {
            var6 = (pk) null;
            this.b((pk) null, (byte) -86);
          }
          if (this.a(param0, param1, -124, param2)) {
            this.a(param0, (byte) -128, param2, param1);
            this.a(param1, param0, 10, param2);
          }
          stackIn_6_0 = (StringBuilder) (param2);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("ao.S(").append(param0).append(',');
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
          throw qo.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    void a(int param0, int param1, pk param2, int param3) {
        int var7 = 0;
        pk[] var5 = null;
        int var6 = 0;
        pk var8 = null;
        int var9 = 0;
        pk[] var10 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var9 = Sumoblitz.field_L ? 1 : 0;
        try {
          super.a(param0, -118, param2, param3);
          if (null == this.field_x) {
            return;
          }
          var10 = this.field_x;
          var5 = var10;
          var6 = 102 % ((-25 - param1) / 45);
          for (var7 = 0; var10.length > var7; var7++) {
            var8 = var10[var7];
            if (var8 != null) {
              var8.a(this.field_r + param0, 95, param2, this.field_v + param3);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_11_0 = var5_ref;
          stackIn_11_1 = new StringBuilder().append("ao.U(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param3).append(')').toString());
        }
    }

    final void c(byte param0) {
        int var4 = 0;
        int var2;
        pk[] var3;
        pk var5;
        int var6;
        var6 = Sumoblitz.field_L ? 1 : 0;
        var2 = 2 % ((param0 - 64) / 51);
        var3 = this.field_x;
        for (var4 = 0; var4 < var3.length; var4++) {
          var5 = var3[var4];
          if (var5 != null) {
            var5.c((byte) -68);
          }
        }
    }

    abstract void e(boolean param0);

    final String c(int param0) {
        int var3 = 0;
        pk[] var2;
        pk var4;
        int var6;
        String var5;
        var6 = Sumoblitz.field_L ? 1 : 0;
        if (param0 != -6696) {
          return (String) null;
        }
        if (this.field_x == null) {
          return null;
        }
        var2 = this.field_x;
        for (var3 = 0; var3 < var2.length; var3++) {
          var4 = var2[var3];
          if (var4 != null) {
            var5 = var4.c(-6696);
            if (var5 != null) {
              return var5;
            }
          }
        }
        return null;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int var5 = 0;
        pk var6;
        int var7;
        pk var8;
        var7 = Sumoblitz.field_L ? 1 : 0;
        if (param3 == 0 &&
          this.field_w != null) {
          this.field_w.a((pk) (this), param1, 5592405, true, param0);
        }
        if (this.field_x != null) {
          for (var5 = -1 + this.field_x.length; var5 >= 0; var5--) {
            var6 = this.field_x[var5];
            if (var6 != null) {
              var6.a(this.field_r + param0, this.field_v + param1, (byte) -62, param3);
            }
          }
        }
        if (param2 > -35) {
          var8 = (pk) null;
          this.a((pk) null, -125, -13, -18, -36, 44, -11);
        }
    }

    final void a(pk param0, boolean param1, int param2, int param3, int param4, int param5) {
        int var8 = 0;
        pk[] var7 = null;
        pk var9 = null;
        int var10 = 0;
        pk[] var11 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        var10 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (this.field_x == null) {
            return;
          }
          var11 = this.field_x;
          var7 = var11;
          for (var8 = 0; var8 < var11.length; var8++) {
            var9 = var11[var8];
            if (var9 != null) {
              var9.a(param0, false, param2 + this.field_r, param3, param4, param5 + this.field_v);
            }
          }
          if (param1) {
            this.d(49);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_14_0 = var7_ref;
          stackIn_14_1 = new StringBuilder().append("ao.T(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    boolean a(int param0, int param1, int param2, int param3, int param4, pk param5, int param6) {
        int var9 = 0;
        pk[] var8 = null;
        RuntimeException var8_ref = null;
        pk var10 = null;
        int var11 = 0;
        pk var12 = null;
        pk[] var13 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        var11 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (param2 != -1) {
            var12 = (pk) null;
            this.a((pk) null, 'ﾅ', (byte) -58, -49);
          }
          if (this.field_x == null) {
            return false;
          }
          var13 = this.field_x;
          var8 = var13;
          for (var9 = 0; var13.length > var9; var9++) {
            var10 = var13[var9];
            if (var10 != null &&
              var10.d(-1) &&
              var10.a(param0, param1, -1, param3, param4, param5, param6)) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_19_0 = var8_ref;
          stackIn_19_1 = new StringBuilder().append("ao.RA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param6).append(')').toString());
        }
    }

    private final void a(Hashtable param0, int param1, int param2, StringBuilder param3) {
        int var6 = 0;
        StringBuilder discarded$6 = null;
        int var8 = 0;
        StringBuilder discarded$8 = null;
        StringBuilder discarded$7 = null;
        pk var7 = null;
        int var9 = 0;
        pk var10 = null;
        pk[] var11 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var9 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (this.field_x == null) {
            return;
          }
          if (param2 != 10) {
            var10 = (pk) null;
            this.a((pk) null, (byte) -20);
          }
          var11 = this.field_x;
          for (var6 = 0; var11.length > var6; var6++) {
            var7 = var11[var6];
            discarded$6 = param3.append('\n');
            for (var8 = 0; param1 >= var8; var8++) {
              discarded$8 = param3.append(' ');
            }
            if (var7 != null) {
              var7.a(1 + param1, param0, param3, 0);
            } else {
              discarded$7 = param3.append("null");
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_17_0 = var5;
          stackIn_17_1 = new StringBuilder().append("ao.E(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final static boolean a(String param0, int param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != null &&
            param0.length() >= bn.field_T) {
            if (param0.length() > or.field_k) {
              return true;
            }
            if (param1 == 30996) {
              return false;
            }
            return true;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_13_0 = var2;
          stackIn_13_1 = new StringBuilder().append("ao.D(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean b(pk param0, byte param1) {
        RuntimeException var3 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 113) {
            stackIn_4_0 = this.a((byte) -128, param0, 1);
            return stackIn_4_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("ao.H(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    private final pk d(boolean param0) {
        int var3 = 0;
        pk[] var2;
        pk var4;
        int var5;
        pk[] var6;
        var5 = Sumoblitz.field_L ? 1 : 0;
        if (this.field_x == null) {
          return null;
        }
        if (!param0) {
          return (pk) null;
        }
        var6 = this.field_x;
        var2 = var6;
        for (var3 = 0; var3 < var6.length; var3++) {
          var4 = var6[var3];
          if (var4 != null &&
            var4.d(-1)) {
            return var4;
          }
        }
        return null;
    }

    final boolean a(byte param0, pk param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        pk var5 = null;
        pk var6 = null;
        int var7 = 0;
        Object stackIn_8_0 = null;
        pk stackIn_8_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (this.field_x == null) {
            return false;
          }
          var4_int = -1 + this.field_x.length;
          while (var4_int >= 0) {
            var5 = this.field_x[var4_int];
            stackIn_8_0 = null;
            stackIn_8_1 = var5;
            if (stackIn_8_0 != stackIn_8_1 &&
              var5.d(-1)) {
              for (var4_int = var4_int - param2; var4_int >= 0; var4_int = var4_int - param2) {
                var6 = this.field_x[var4_int];
                if (null != var6 &&
                  var6.a(param1, (byte) 61)) {
                  return true;
                }
              }
            }
            var4_int--;
          }
          if (param0 <= -127) {
            return false;
          }
          this.e(-70);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_25_0 = var4;
          stackIn_25_1 = new StringBuilder().append("ao.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param2).append(')').toString());
        }
    }

    final boolean d(int param0) {
        if (param0 != -1) {
          field_z = (String) null;
        }
        return this.d(true) != null ? true : false;
    }

    void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(-51, param1, param2, param3, param4);
        int var6 = 53 / ((28 - param0) / 63);
        this.e(false);
    }

    public static void a(int param0) {
        field_z = null;
        field_y = null;
        if (param0 != 0) {
          String var2 = (String) null;
          ao.a((String) null, -34);
        }
    }

    boolean a(pk param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var9 = 0;
        pk[] var8 = null;
        RuntimeException var8_ref = null;
        pk var10 = null;
        int var11 = 0;
        pk[] var12 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        var11 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (null == this.field_x) {
            return false;
          }
          var12 = this.field_x;
          var8 = var12;
          if (param1 > -42) {
            field_y = (ji) null;
          }
          for (var9 = 0; var12.length > var9; var9++) {
            var10 = var12[var9];
            if (var10 != null &&
              var10.a(param0, -84, param2, param3, this.field_r + param4, param5, param6 + this.field_v)) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_19_0 = var8_ref;
          stackIn_19_1 = new StringBuilder().append("ao.R(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final int e(int param0) {
        int var2;
        pk[] var3;
        int var4;
        pk var5;
        int var7;
        int var6;
        int var4Lifetime1;
        var7 = Sumoblitz.field_L ? 1 : 0;
        var2 = 0;
        var3 = this.field_x;
        for (var4 = 0; var4 < var3.length; var4++) {
          var5 = var3[var4];
          if (var5 != null) {
            var6 = var5.e(-117);
            if (var2 < var6) {
              var2 = var6;
            }
          }
        }
        var4Lifetime1 = -37 / ((param0 + 10) / 46);
        return var2;
    }

    static {
        field_y = new ji();
        field_z = "Unable to connect to the data server. Please check any firewall you are using.";
    }
}
