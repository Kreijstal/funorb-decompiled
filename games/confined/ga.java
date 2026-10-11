/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class ga extends fj implements hi {
    static ej field_J;
    mn field_N;
    static nf field_K;
    static int[] field_I;
    static long field_M;

    final boolean a(int param0, int param1, byte param2, fj param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        fj var9 = null;
        int var10 = 0;
        vb var11 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = Confined.field_J ? 1 : 0;
        try {
          var11 = new vb(this.field_N);
          var9 = (fj) (var11.a((byte) 120));
          while (var9 != null) {
            if (var9.c((byte) 115)) {
              if (var9.e((byte) -125) &&
                var9.a(param0, param1, (byte) 36, param3, param4, param5, param6)) {
                return true;
              }
              var9 = (fj) (var11.b(param2 ^ 95));
              continue;
            }
            break;
          }
          if (param2 != 36) {
            this.a(19, 111, 44, -13, 51);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_15_0 = var8;
          stackIn_15_1 = new StringBuilder().append("ga.W(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, byte param2, int param3, fj param4, int param5, int param6) {
        vb var8 = null;
        RuntimeException var8_ref = null;
        fj var9 = null;
        int var10 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = Confined.field_J ? 1 : 0;
        try {
          var8 = new vb(this.field_N);
          if (param2 != 91) {
            return false;
          }
          var9 = (fj) (var8.a((byte) 120));
          while (var9 != null) {
            if (var9.c((byte) 110)) {
              if (var9.a(this.field_q + param0, param1, (byte) 91, param3 + this.field_m, param4, param5, param6)) {
                return true;
              }
              var9 = (fj) (var8.b(param2 - 39));
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_16_0 = var8_ref;
          stackIn_16_1 = new StringBuilder().append("ga.AA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    ga(int param0, int param1, int param2, int param3, fe param4) {
        super(param0, param1, param2, param3, param4, (uk) null);
        this.field_N = new mn();
    }

    final boolean c(fj param0, int param1) {
        RuntimeException var3 = null;
        fj var4 = null;
        vb var5 = null;
        fj var6 = null;
        int var7 = 0;
        vb var8 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Confined.field_J ? 1 : 0;
        try {
          if (param1 != 32) {
            field_J = (ej) null;
          }
          if (this.field_N.f(-1)) {
            return false;
          }
          var8 = new vb(this.field_N);
          var4 = (fj) (var8.c(7));
          while (var4 != null) {
            if (var4.e((byte) -123)) {
              var5 = new vb(this.field_N);
              var5.a(var4, 0);
              var6 = (fj) (var5.a(0));
              while (var6 != null) {
                if (var6.a(param0, 418)) {
                  return true;
                }
                var6 = (fj) (var5.a(0));
              }
            }
            var4 = (fj) (var8.a(0));
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_22_0 = var3;
          stackIn_22_1 = new StringBuilder().append("ga.M(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(')').toString());
        }
    }

    void a(int param0, int param1, byte param2, int param3) {
        int var7 = Confined.field_J ? 1 : 0;
        if (param2 < 36) {
          ga.h(0);
        }
        if (0 == param1 &&
          null != this.field_n) {
          this.field_n.a((byte) -125, param3, true, (fj) (this), param0);
        }
        vb var5 = new vb(this.field_N);
        fj var6 = (fj) (var5.c(7));
        while (var6 != null) {
          var6.a(this.field_m + param0, param1, (byte) 84, param3 + this.field_q);
          var6 = (fj) (var5.a(0));
        }
    }

    final void b(int param0) {
        int var4 = Confined.field_J ? 1 : 0;
        vb var2 = new vb(this.field_N);
        fj var3 = (fj) (var2.a((byte) 120));
        while (var3 != null) {
          var3.b(param0 + 0);
          var3 = (fj) (var2.b(-67));
        }
        if (param0 != 84) {
          this.field_N = (mn) null;
        }
    }

    final boolean a(fj param0, int param1) {
        vb var3 = null;
        RuntimeException var3_ref = null;
        fj var4 = null;
        int var5 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Confined.field_J ? 1 : 0;
        try {
          var3 = new vb(this.field_N);
          if (param1 != 418) {
            this.field_N = (mn) null;
          }
          var4 = (fj) (var3.a((byte) 120));
          while (var4 != null) {
            if (var4.a(param0, 418)) {
              return true;
            }
            var4 = (fj) (var3.b(-126));
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_14_0 = var3_ref;
          stackIn_14_1 = new StringBuilder().append("ga.I(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean e(byte param0) {
        int var2 = -49 % ((-74 - param0) / 49);
        return null != this.f(-1) ? true : false;
    }

    public static void h(int param0) {
        if (param0 != 52) {
          field_K = (nf) null;
        }
        field_J = null;
        field_I = null;
        field_K = null;
    }

    final StringBuilder a(StringBuilder param0, int param1, Hashtable param2, boolean param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3) {
            field_J = (ej) null;
          }
          if (this.a((byte) -13, param1, param2, param0)) {
            this.a(param0, param2, (byte) -63, param1);
            this.a(param0, true, param2, param1);
          }
          stackIn_5_0 = (StringBuilder) (param0);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("ga.O(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param3).append(')').toString());
        }
    }

    fj f(int param0) {
        vb var2;
        fj var3;
        int var4;
        var4 = Confined.field_J ? 1 : 0;
        if (param0 != -1) {
          return (fj) null;
        }
        var2 = new vb(this.field_N);
        var3 = (fj) (var2.a((byte) 120));
        while (var3 != null) {
          if (var3.e((byte) 87)) {
            return var3;
          }
          var3 = (fj) (var2.b(-51));
        }
        return null;
    }

    final void a(int param0, int param1, int param2, fj param3, int param4, int param5) {
        vb var7 = null;
        fj var8 = null;
        int var9 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        var9 = Confined.field_J ? 1 : 0;
        try {
          var7 = new vb(this.field_N);
          var8 = (fj) (var7.a((byte) 120));
          while (var8 != null) {
            if (var8.c((byte) 127)) {
              var8.a(-81, param1 + this.field_m, param2, param3, param4, param5 + this.field_q);
              var8 = (fj) (var7.b(-108));
              continue;
            }
            break;
          }
          if (param0 > -18) {
            this.b(-69);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_10_0 = var7_ref;
          stackIn_10_1 = new StringBuilder().append("ga.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final void b(fj param0, int param1) {
        try {
          this.field_N.a((rk) (param0), (byte) -66);
          if (param1 != 10) {
            field_I = (int[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "ga.J(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    void a(fj param0, int param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        vb var5 = null;
        fj var6 = null;
        int var7 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Confined.field_J ? 1 : 0;
        try {
          super.a(param0, param1, param2, param3);
          var5 = new vb(this.field_N);
          var6 = (fj) (var5.a((byte) 120));
          while (var6 != null) {
            if (var6.c((byte) 126)) {
              var6.a(param0, param1 + 0, this.field_q + param2, this.field_m + param3);
              var6 = (fj) (var5.b(-88));
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_8_0 = runtimeException;
          stackIn_8_1 = new StringBuilder().append("ga.V(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static boolean g(int param0) {
        boolean stackIn_9_0 = false;
        if (param0 != 15214) {
          field_K = (nf) null;
        }
        boolean decompiledFrameRemainder0 = true;
        if (we.field_c >= 20 &&
          dc.f(-14) && (!(oi.field_q > 0) ||
          ja.c((byte) -77))) {
          stackIn_9_0 = false;
          decompiledFrameRemainder0 = false;
        }
        else {
          stackIn_9_0 = true;
        }
        return stackIn_9_0;
    }

    final boolean a(int param0, fj param1) {
        RuntimeException var3 = null;
        fj var4 = null;
        vb var5 = null;
        fj var6 = null;
        int var7 = 0;
        vb var8 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Confined.field_J ? 1 : 0;
        try {
          if (this.field_N.f(-1)) {
            return false;
          }
          var8 = new vb(this.field_N);
          if (param0 != 17731) {
            return false;
          }
          var4 = (fj) (var8.a((byte) 120));
          while (var4 != null) {
            if (var4.e((byte) -24)) {
              var5 = new vb(this.field_N);
              var5.b(var4, param0 ^ 17733);
              var6 = (fj) (var5.b(-121));
              while (var6 != null) {
                if (var6.a(param1, param0 - 17313)) {
                  return true;
                }
                var6 = (fj) (var5.b(-46));
              }
            }
            var4 = (fj) (var8.b(-123));
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_23_0 = var3;
          stackIn_23_1 = new StringBuilder().append("ga.BA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    final String f(byte param0) {
        vb var2;
        fj var3;
        String var4;
        int var5;
        var5 = Confined.field_J ? 1 : 0;
        var2 = new vb(this.field_N);
        var3 = (fj) (var2.a((byte) 120));
        if (param0 > -82) {
          this.field_N = (mn) null;
        }
        while (var3 != null) {
          var4 = var3.f((byte) -83);
          if (var4 != null) {
            return var4;
          }
          var3 = (fj) (var2.b(66));
        }
        return null;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(-110, param1, param2, param3, param4);
        this.i(12007);
        if (param0 > -109) {
          field_M = 115L;
        }
    }

    boolean a(fj param0, byte param1, int param2, char param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        vb var6 = null;
        int var7 = 0;
        int var8 = 0;
        fj var9 = null;
        boolean stackIn_15_0 = false;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = Confined.field_J ? 1 : 0;
        try {
          var5_int = 1 % ((47 - param1) / 43);
          var6 = new vb(this.field_N);
          var9 = (fj) (var6.a((byte) 120));
          while (var9 != null) {
            if (var9.c((byte) 106)) {
              if (var9.e((byte) -125) &&
                var9.a(param0, (byte) -49, param2, param3)) {
                return true;
              }
              var9 = (fj) (var6.b(-75));
              continue;
            }
            break;
          }
          var7 = param2;
          if (var7 != 80) {
            return false;
          }
          if (!mc.field_e[81]) {
            stackIn_15_0 = this.a(17731, param0);
          } else {
            stackIn_15_0 = this.c(param0, 32);
          }
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_18_0 = var5;
          stackIn_18_1 = new StringBuilder().append("ga.Q(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final int c(int param0) {
        int var5 = 0;
        int var6 = Confined.field_J ? 1 : 0;
        int var2 = 0;
        if (param0 <= 65) {
          return 67;
        }
        vb var3 = new vb(this.field_N);
        fj var4 = (fj) (var3.a((byte) 120));
        while (var4 != null) {
          var5 = var4.c(72);
          if (var2 < var5) {
            var2 = var5;
          }
          var4 = (fj) (var3.b(-33));
        }
        return var2;
    }

    final static int a(byte param0, char param1, CharSequence param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Confined.field_J ? 1 : 0;
        try {
          var3_int = 0;
          var4 = param2.length();
          var5 = 0;
          if (param0 != -89) {
            field_M = -116L;
          }
          while (var5 < var4) {
            if (param1 == param2.charAt(var5)) {
              var3_int++;
            }
            var5++;
          }
          stackIn_8_0 = var3_int;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("ga.S(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    private final void i(int param0) {
        int var4 = Confined.field_J ? 1 : 0;
        vb var2 = new vb(this.field_N);
        fj var3 = (fj) (var2.a((byte) 120));
        while (var3 != null) {
          var3.d(60);
          var3 = (fj) (var2.b(param0 ^ 11913));
        }
        if (param0 != 12007) {
          field_K = (nf) null;
        }
    }

    private final void a(StringBuilder param0, boolean param1, Hashtable param2, int param3) {
        StringBuilder discarded$3 = null;
        int var7 = 0;
        StringBuilder discarded$4 = null;
        vb var5 = null;
        fj var6 = null;
        int var8 = 0;
        fj stackIn_10_0;
        StringBuilder stackIn_10_1;
        int stackIn_10_2;
        Hashtable stackIn_10_3;
        boolean stackIn_11_4;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = Confined.field_J ? 1 : 0;
        try {
          var5 = new vb(this.field_N);
          if (!param1) {
            field_M = -106L;
          }
          var6 = (fj) (var5.a((byte) 120));
          while (var6 != null) {
            discarded$3 = param0.append('\n');
            for (var7 = 0; param3 >= var7; var7++) {
              discarded$4 = param0.append(' ');
            }
            stackIn_10_0 = var6;
            stackIn_10_1 = (StringBuilder) (param0);
            stackIn_10_2 = param3 + 1;
            stackIn_10_3 = (Hashtable) (param2);
            stackIn_11_4 = !(param1);
            ((fj) (Object) stackIn_10_0).a(stackIn_10_1, stackIn_10_2, stackIn_10_3, stackIn_11_4);
            var6 = (fj) (var5.b(-38));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_15_0 = var5_ref;
          stackIn_15_1 = new StringBuilder().append("ga.L(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_J = new ej();
        field_I = new int[]{10, 16, 20, 25, 32, 40, 52};
    }
}
