/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class oda extends shb implements nea {
    static String field_t;
    shb[] field_u;

    final int c(int param0) {
        int var4 = 0;
        int var2;
        shb[] var3;
        shb var5;
        int var7;
        int var6;
        var7 = VoidHunters.field_G;
        var2 = 0;
        var3 = this.field_u;
        for (var4 = param0; var4 < var3.length; var4++) {
          var5 = var3[var4];
          if (var5 != null) {
            var6 = var5.c(0);
            if (var6 > var2) {
              var2 = var6;
            }
          }
        }
        return var2;
    }

    final String d(byte param0) {
        int var3 = 0;
        shb[] var2;
        shb var4;
        int var6;
        String var5;
        var6 = VoidHunters.field_G;
        if (this.field_u == null) {
          return null;
        }
        var2 = this.field_u;
        for (var3 = 0; var2.length > var3; var3++) {
          var4 = var2[var3];
          if (var4 != null) {
            var5 = var4.d((byte) 125);
            if (var5 != null) {
              return var5;
            }
          }
        }
        if (param0 != 125) {
          return (String) null;
        }
        return null;
    }

    void a(int param0, int param1, int param2, shb param3) {
        shb[] var9 = null;
        int var6 = 0;
        shb var7 = null;
        int var8 = VoidHunters.field_G;
        super.a(param0, param1, param2 ^ 0, param3);
        if (null == this.field_u) {
          return;
        }
        try {
          var9 = this.field_u;
          shb[] var5 = var9;
          for (var6 = 0; var6 < var9.length; var6++) {
            var7 = var9[var6];
            if (var7 != null) {
              var7.a(param0 + this.field_r, this.field_g + param1, -981, param3);
            }
          }
          if (param2 != -981) {
            field_t = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "oda.B(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    abstract void d(int param0);

    final StringBuilder a(boolean param0, Hashtable param1, int param2, StringBuilder param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            field_t = (String) null;
          }
          if (this.a(param1, param2, (byte) -113, param3)) {
            this.a(72, param2, param1, param3);
            this.a(false, param3, param1, param2);
          }
          stackIn_5_0 = (StringBuilder) (param3);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("oda.JA(").append(param0).append(',');
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

    boolean a(int param0, int param1, int param2, shb param3, int param4, int param5, int param6) {
        shb[] var8 = null;
        RuntimeException var8_ref = null;
        int var9 = 0;
        shb var10 = null;
        int var11 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        var11 = VoidHunters.field_G;
        try {
          if (this.field_u == null) {
            return false;
          }
          var8 = this.field_u;
          var9 = 0;
          if (param1 != -6006) {
            field_t = (String) null;
          }
          while (var9 < var8.length) {
            var10 = var8[var9];
            if (var10 != null &&
              var10.e((byte) -120) &&
              var10.a(param0, -6006, param2, param3, param4, param5, param6)) {
              return true;
            }
            var9++;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_18_0 = var8_ref;
          stackIn_18_1 = new StringBuilder().append("oda.WA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final boolean a(int param0, shb param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        shb var5 = null;
        shb var6 = null;
        int var7 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = VoidHunters.field_G;
        try {
          if (null == this.field_u) {
            return false;
          }
          var4_int = param2;
          while (var4_int < this.field_u.length) {
            var5 = this.field_u[var4_int];
            if (var5 != null &&
              var5.e((byte) -120)) {
              for (var4_int = var4_int + param0; var4_int < this.field_u.length; var4_int = var4_int + param0) {
                var6 = this.field_u[var4_int];
                if (var6 != null &&
                  var6.a(param2 + 0, param1)) {
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
          stackIn_20_0 = var4;
          stackIn_20_1 = new StringBuilder().append("oda.IA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param2).append(')').toString());
        }
    }

    boolean a(int param0, int param1, shb param2, char param3) {
        int var6 = 0;
        shb[] var5 = null;
        int var5_int = 0;
        RuntimeException var5_ref = null;
        shb var7 = null;
        int var8 = 0;
        shb[] var9 = null;
        boolean stackIn_19_0 = false;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = VoidHunters.field_G;
        try {
          if (null == this.field_u) {
            return false;
          }
          var9 = this.field_u;
          var5 = var9;
          if (param0 != -15834) {
            this.field_u = (shb[]) null;
          }
          for (var6 = 0; var9.length > var6; var6++) {
            var7 = var9[var6];
            if (var7 != null &&
              var7.e((byte) -120) &&
              var7.a(-15834, param1, param2, param3)) {
              return true;
            }
          }
          var5_int = param1;
          if (var5_int != 80) {
            return false;
          }
          if (si.field_o[81]) {
            stackIn_19_0 = this.a(param2, (byte) -63);
          } else {
            stackIn_19_0 = this.b(param2, (byte) 39);
          }
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_22_0 = var5_ref;
          stackIn_22_1 = new StringBuilder().append("oda.N(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean a(shb param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        shb var5 = null;
        shb var6 = null;
        int var7 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        shb var6Lifetime1;
        shb var6Lifetime2;
        var7 = VoidHunters.field_G;
        try {
          if (this.field_u == null) {
            return false;
          }
          if (param1 <= 34) {
            return true;
          }
          var4_int = this.field_u.length - 1;
          while (var4_int >= 0) {
            var5 = this.field_u[var4_int];
            var6 = var5;
            var6Lifetime1 = var5;
            if (var5 != null &&
              var5.e((byte) -120)) {
              for (var4_int = var4_int - param2; var4_int >= 0; var4_int = var4_int - param2) {
                var6Lifetime2 = this.field_u[var4_int];
                if (var6Lifetime2 != null &&
                  var6Lifetime2.a(0, param0)) {
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
          stackIn_26_0 = var4;
          stackIn_26_1 = new StringBuilder().append("oda.DA(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final shb g(byte param0) {
        int var3 = 0;
        shb[] var2;
        shb var4;
        int var5;
        shb[] var6;
        var5 = VoidHunters.field_G;
        if (null == this.field_u) {
          return null;
        }
        var6 = this.field_u;
        var2 = var6;
        for (var3 = 0; var3 < var6.length; var3++) {
          var4 = var6[var3];
          if (var4 != null &&
            var4.e((byte) -120)) {
            return var4;
          }
        }
        if (param0 < -102) {
          return null;
        }
        this.field_u = (shb[]) null;
        return null;
    }

    final boolean b(shb param0, byte param1) {
        RuntimeException var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 39) {
            field_t = (String) null;
          }
          stackIn_3_0 = this.a(1, param0, 0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("oda.EA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.d(16777215);
    }

    oda(int param0, int param1, int param2, int param3, wwa param4) {
        super(param0, param1, param2, param3, param4, (sba) null);
    }

    public static void a(int param0) {
        field_t = null;
        if (param0 != 0) {
          oda.a(68);
        }
    }

    final boolean e(byte param0) {
        if (param0 != -120) {
          return false;
        }
        return this.g((byte) -127) != null ? true : false;
    }

    final void a(byte param0, int param1, int param2, int param3, shb param4, int param5) {
        int var9 = 0;
        shb[] var7 = null;
        int var8 = 0;
        shb var10 = null;
        int var11 = 0;
        shb[] var12 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        var11 = VoidHunters.field_G;
        try {
          if (this.field_u == null) {
            return;
          }
          var12 = this.field_u;
          var7 = var12;
          var8 = 62 / ((52 - param0) / 52);
          for (var9 = 0; var12.length > var9; var9++) {
            var10 = var12[var9];
            if (var10 != null) {
              var10.a((byte) 118, this.field_g + param1, param2, this.field_r + param3, param4, param5);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_12_0 = var7_ref;
          stackIn_12_1 = new StringBuilder().append("oda.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param5).append(')').toString());
        }
    }

    boolean a(int param0, shb param1) {
        int var4 = 0;
        shb[] var3 = null;
        RuntimeException var3_ref = null;
        shb var5 = null;
        int var6 = 0;
        shb[] var7 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = VoidHunters.field_G;
        try {
          var7 = this.field_u;
          var3 = var7;
          for (var4 = param0; var4 < var7.length; var4++) {
            var5 = var7[var4];
            if (var5 != null &&
              var5.a(0, param1)) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("oda.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    void b(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        shb var6;
        int var7;
        var7 = VoidHunters.field_G;
        if (param1 == 0 &&
          this.field_q != null) {
          this.field_q.a(-127, (shb) (this), param0, param3, true);
        }
        if (param2 < 47) {
          return;
        }
        if (this.field_u != null) {
          for (var5 = -1 + this.field_u.length; var5 >= 0; var5--) {
            var6 = this.field_u[var5];
            if (var6 != null) {
              var6.b(param0 + this.field_g, param1, 90, param3 + this.field_r);
            }
          }
        }
    }

    private final void a(boolean param0, StringBuilder param1, Hashtable param2, int param3) {
        int var6 = 0;
        StringBuilder discarded$3 = null;
        int var8 = 0;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$4 = null;
        shb var7 = null;
        int var9 = 0;
        shb[] var10 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var9 = VoidHunters.field_G;
        try {
          if (null == this.field_u) {
            return;
          }
          var10 = this.field_u;
          for (var6 = 0; var10.length > var6; var6++) {
            var7 = var10[var6];
            discarded$3 = param1.append('\n');
            for (var8 = 0; param3 >= var8; var8++) {
              discarded$5 = param1.append(' ');
            }
            if (var7 == null) {
              discarded$4 = param1.append("null");
            } else {
              var7.a(false, param2, param3 + 1, param1);
            }
          }
          if (param0) {
            this.a(9, 45, 27, 51, 117);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_18_0 = var5;
          stackIn_18_1 = new StringBuilder().append("oda.NA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param3).append(')').toString());
        }
    }

    final void f(byte param0) {
        int var3 = 0;
        shb[] var2;
        shb var4;
        int var5;
        shb[] var6;
        var5 = VoidHunters.field_G;
        if (param0 != -34) {
          field_t = (String) null;
        }
        var6 = this.field_u;
        var2 = var6;
        for (var3 = 0; var3 < var6.length; var3++) {
          var4 = var6[var3];
          if (var4 != null) {
            var4.f((byte) -34);
          }
        }
    }

    boolean a(int param0, int param1, int param2, int param3, shb param4, int param5, byte param6) {
        int var9 = 0;
        shb[] var8 = null;
        RuntimeException var8_ref = null;
        shb var10 = null;
        int var11 = 0;
        shb var12 = null;
        shb[] var13 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        var11 = VoidHunters.field_G;
        try {
          if (null == this.field_u) {
            return false;
          }
          var13 = this.field_u;
          var8 = var13;
          for (var9 = 0; var13.length > var9; var9++) {
            var10 = var13[var9];
            if (var10 != null &&
              var10.a(param0, param1 + this.field_g, param2, param3, param4, param5 + this.field_r, (byte) -116)) {
              return true;
            }
          }
          if (param6 < -17) {
            return false;
          }
          var12 = (shb) null;
          this.b((shb) null, (byte) -24);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_17_0 = var8_ref;
          stackIn_17_1 = new StringBuilder().append("oda.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final boolean a(shb param0, byte param1) {
        RuntimeException var3 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < -55) {
            stackIn_4_0 = this.a(param0, 100, 1);
            return stackIn_4_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("oda.MA(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_t = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
    }
}
