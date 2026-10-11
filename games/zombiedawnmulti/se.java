/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class se extends cf implements dh {
    th field_B;
    static re field_F;
    static int field_E;
    static String field_D;
    static int field_C;

    final boolean a(cf param0, int param1) {
        ch var3 = null;
        RuntimeException var3_ref = null;
        cf var4 = null;
        int var5 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var3 = new ch(this.field_B);
          if (param1 != 0) {
            this.c((byte) -102);
          }
          var4 = (cf) (var3.c(-3));
          while (true) {
            if (var4 == null) {
              return false;
            }
            if (!var4.a(param0, param1 ^ 0)) {
              var4 = (cf) (var3.a((byte) -89));
              continue;
            }
            break;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("se.S(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean c(int param0) {
        if (param0 < 123) {
          return false;
        }
        return this.g(121) != null ? true : false;
    }

    boolean a(int param0, char param1, cf param2, int param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        cf var8 = null;
        cf var9 = null;
        ch var10 = null;
        boolean stackIn_15_0 = false;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var10 = new ch(this.field_B);
          var9 = (cf) (var10.c(-3));
          while (var9 != null) {
            if (var9.b(4)) {
              if (var9.c(127) &&
                var9.a(param0, param1, param2, -6208)) {
                return true;
              }
              var9 = (cf) (var10.a((byte) -126));
              continue;
            }
            break;
          }
          if (param3 != -6208) {
            var8 = (cf) null;
            this.b((byte) 124, (cf) null);
          }
          var6 = param0;
          if (var6 != 80) {
            return false;
          }
          if (!lc.field_m[81]) {
            stackIn_15_0 = this.a(param3 + 6319, param2);
          } else {
            stackIn_15_0 = this.a((byte) -1, param2);
          }
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_20_0 = var5;
          stackIn_20_1 = new StringBuilder().append("se.CA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, cf param1, int param2, int param3, boolean param4, int param5) {
        RuntimeException runtimeException = null;
        ch var7 = null;
        cf var8 = null;
        int var9 = 0;
        cf var10 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (!param4) {
            var10 = (cf) null;
            this.a(64, (cf) null, 84, 126);
          }
          var7 = new ch(this.field_B);
          var8 = (cf) (var7.c(-3));
          while (var8 != null) {
            if (var8.b(4)) {
              var8.a(param0, param1, param2 + this.field_i, param3, true, param5 + this.field_y);
              var8 = (cf) (var7.a((byte) -80));
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_10_0 = runtimeException;
          stackIn_10_1 = new StringBuilder().append("se.NA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final boolean a(int param0, cf param1) {
        RuntimeException var3 = null;
        cf var4 = null;
        ch var5 = null;
        cf var6 = null;
        int var7 = 0;
        ch var8 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (this.field_B.f(28113)) {
            return false;
          }
          if (param0 <= 20) {
            return true;
          }
          var8 = new ch(this.field_B);
          var4 = (cf) (var8.c(-3));
          while (var4 != null) {
            if (var4.c(126)) {
              var5 = new ch(this.field_B);
              var5.a(2680, var4);
              var6 = (cf) (var5.a((byte) -36));
              while (var6 != null) {
                if (var6.a(param1, 0)) {
                  return true;
                }
                var6 = (cf) (var5.a((byte) -58));
              }
            }
            var4 = (cf) (var8.a((byte) -126));
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_23_0 = var3;
          stackIn_23_1 = new StringBuilder().append("se.AB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    String d(byte param0) {
        ch var2;
        int var3;
        cf var4;
        String var5;
        int var6;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        var2 = new ch(this.field_B);
        var3 = -21 / ((53 - param0) / 57);
        var4 = (cf) (var2.c(-3));
        while (var4 != null) {
          var5 = var4.d((byte) 112);
          if (var5 != null) {
            return var5;
          }
          var4 = (cf) (var2.a((byte) -46));
        }
        return null;
    }

    void a(int param0, int param1, int param2, int param3) {
        int var7 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param2 == 0 &&
          this.field_h != null) {
          this.field_h.a(true, param1, -15112, param3, (cf) (this));
        }
        if (param0 != -2) {
          field_D = (String) null;
        }
        ch var5 = new ch(this.field_B);
        cf var6 = (cf) (var5.a(32397));
        while (var6 != null) {
          var6.a(-2, param1 + this.field_i, param2, this.field_y + param3);
          var6 = (cf) (var5.e(param0 ^ 3));
        }
    }

    private final void f(int param0) {
        int var5 = ZombieDawnMulti.field_E ? 1 : 0;
        ch var2 = new ch(this.field_B);
        int var4 = -105 % ((param0 - 36) / 61);
        cf var3 = (cf) (var2.c(-3));
        while (var3 != null) {
          var3.e(-1);
          var3 = (cf) (var2.a((byte) -34));
        }
    }

    final boolean a(byte param0, cf param1) {
        RuntimeException var3 = null;
        cf var4 = null;
        ch var5 = null;
        cf var6 = null;
        int var7 = 0;
        cf var8 = null;
        ch var9 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (this.field_B.f(28113)) {
            return false;
          }
          var9 = new ch(this.field_B);
          if (param0 != -1) {
            var8 = (cf) null;
            this.a((cf) null, 48);
          }
          var4 = (cf) (var9.a(32397));
          while (var4 != null) {
            if (var4.c(125)) {
              var5 = new ch(this.field_B);
              var5.b(-4, var4);
              var6 = (cf) (var5.e(-3));
              while (var6 != null) {
                if (!var6.a(param1, 0)) {
                  var6 = (cf) (var5.e(param0 ^ 2));
                  continue;
                }
                return true;
              }
            }
            var4 = (cf) (var9.e(-3));
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_21_0 = var3;
          stackIn_21_1 = new StringBuilder().append("se.IB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final StringBuilder a(int param0, Hashtable param1, int param2, StringBuilder param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(param1, -81, param3, param2)) {
            this.a(param2, param3, (byte) 26, param1);
            this.a(param1, param2, -92, param3);
          }
          if (param0 != 7) {
            field_E = 118;
          }
          stackIn_6_0 = (StringBuilder) (param3);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("se.GA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    private final void a(Hashtable param0, int param1, int param2, StringBuilder param3) {
        StringBuilder discarded$2 = null;
        int var7 = 0;
        StringBuilder discarded$3 = null;
        ch var5 = null;
        cf var6 = null;
        int var8 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var5 = new ch(this.field_B);
          var6 = (cf) (var5.c(-3));
          while (var6 != null) {
            discarded$2 = param3.append('\n');
            for (var7 = 0; param1 >= var7; var7++) {
              discarded$3 = param3.append(' ');
            }
            var6.a(7, param0, 1 + param1, param3);
            var6 = (cf) (var5.a((byte) -94));
          }
          if (param2 >= -79) {
            field_D = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_12_0 = var5_ref;
          stackIn_12_1 = new StringBuilder().append("se.KB(");
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
          throw fa.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    void a(int param0, cf param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        ch var5 = null;
        cf var6 = null;
        int var7 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          super.a(param0, param1, param2, param3);
          var5 = new ch(this.field_B);
          var6 = (cf) (var5.c(-3));
          while (var6 != null) {
            if (var6.b(4)) {
              var6.a(-5407, param1, param2 + this.field_y, param3 + this.field_i);
              var6 = (cf) (var5.a((byte) -59));
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_8_0 = runtimeException;
          stackIn_8_1 = new StringBuilder().append("se.T(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean a(byte param0, int param1, int param2, int param3, int param4, int param5, cf param6) {
        ch var8 = null;
        RuntimeException var8_ref = null;
        int var9 = 0;
        cf var10 = null;
        int var11 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var11 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var9 = -59 / ((48 - param0) / 37);
          var8 = new ch(this.field_B);
          var10 = (cf) (var8.c(-3));
          while (var10 != null) {
            if (var10.b(4)) {
              if (var10.c(126) &&
                var10.a((byte) 105, param1, param2, param3, param4, param5, param6)) {
                return true;
              }
              var10 = (cf) (var8.a((byte) -50));
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_13_0 = var8_ref;
          stackIn_13_1 = new StringBuilder().append("se.DB(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    public static void b(boolean param0) {
        if (param0) {
          return;
        }
        field_F = null;
        field_D = null;
    }

    final void b(byte param0, cf param1) {
        try {
          if (param0 <= 38) {
            field_D = (String) null;
          }
          this.field_B.a(param1, false);
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "se.EB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int f(byte param0) {
        int var2;
        ch var3;
        cf var4;
        int var5;
        int var6;
        StringBuilder var7;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        var2 = 0;
        var3 = new ch(this.field_B);
        var4 = (cf) (var3.c(param0 - 47));
        while (var4 != null) {
          var5 = var4.f((byte) 44);
          if (var5 > var2) {
            var2 = var5;
          }
          var4 = (cf) (var3.a((byte) -74));
        }
        if (param0 != 44) {
          var7 = (StringBuilder) null;
          this.a((Hashtable) null, 57, 123, (StringBuilder) null);
        }
        return var2;
    }

    final void c(byte param0) {
        int var4 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0 != 32) {
          this.field_B = (th) null;
        }
        ch var2 = new ch(this.field_B);
        cf var3 = (cf) (var2.c(-3));
        while (var3 != null) {
          var3.c((byte) 32);
          var3 = (cf) (var2.a((byte) -50));
        }
    }

    se(int param0, int param1, int param2, int param3, nl param4) {
        super(param0, param1, param2, param3, param4, (bj) null);
        this.field_B = new th();
    }

    cf g(int param0) {
        ch var2;
        cf var3;
        int var4;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0 < 88) {
          field_F = (re) null;
        }
        var2 = new ch(this.field_B);
        var3 = (cf) (var2.c(-3));
        while (var3 != null) {
          if (var3.c(125)) {
            return var3;
          }
          var3 = (cf) (var2.a((byte) -40));
        }
        return null;
    }

    final boolean a(int param0, int param1, int param2, cf param3, int param4, int param5, int param6) {
        ch var8 = null;
        RuntimeException var8_ref = null;
        cf var9 = null;
        int var10 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var8 = new ch(this.field_B);
          if (param4 != -24) {
            field_C = 84;
          }
          var9 = (cf) (var8.c(-3));
          while (var9 != null) {
            if (var9.b(4)) {
              if (!var9.a(param0, param1, param2, param3, -24, param5 + this.field_y, param6 + this.field_i)) {
                var9 = (cf) (var8.a((byte) -81));
                continue;
              }
              return true;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_14_0 = var8_ref;
          stackIn_14_1 = new StringBuilder().append("se.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    void b(int param0, int param1, int param2, int param3, int param4) {
        super.b(param0, param1, param2, param3, param4);
        this.f(param2 - 29048);
    }

    static {
        field_F = new re();
        field_D = "Return to the Laboratory";
        field_E = 0;
    }
}
