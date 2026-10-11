/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class eg extends na implements nf {
    na[] field_I;
    static je field_J;
    static String field_M;
    static String field_L;
    private static long[] field_O;
    static byte[] field_K;
    static String field_N;

    final StringBuilder a(Hashtable param0, StringBuilder param1, int param2, int param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != -372494750) {
            field_J = (je) null;
          }
          if (this.a(param0, param2, 105, param1)) {
            this.a(param3 ^ 372494831, param1, param0, param2);
            this.b(param2, param1, param0, 0);
          }
          stackIn_6_0 = (StringBuilder) (param1);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("eg.WA(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean a(na param0, int param1) {
        int var4 = 0;
        na[] var3 = null;
        RuntimeException var3_ref = null;
        na var5 = null;
        int var6 = 0;
        na[] var7 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = TetraLink.field_J;
        try {
          if (param1 != -384169950) {
            field_M = (String) null;
          }
          var7 = this.field_I;
          var3 = var7;
          for (var4 = 0; var4 < var7.length; var4++) {
            var5 = var7[var4];
            if (var5 != null &&
              var5.a(param0, -384169950)) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_15_0 = var3_ref;
          stackIn_15_1 = new StringBuilder().append("eg.EB(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    eg(int param0, int param1, int param2, int param3, kg param4) {
        super(param0, param1, param2, param3, param4, (dn) null);
    }

    public static void g(int param0) {
        field_K = null;
        field_N = null;
        if (param0 != -1) {
          return;
        }
        field_O = null;
        field_J = null;
        field_L = null;
        field_M = null;
    }

    final int d(int param0) {
        int var4 = 0;
        int var2;
        na[] var3;
        na var5;
        int var7;
        int var6;
        var7 = TetraLink.field_J;
        var2 = 0;
        var3 = this.field_I;
        for (var4 = 0; var4 < var3.length; var4++) {
          var5 = var3[var4];
          if (var5 != null) {
            var6 = var5.d(-120);
            if (var2 < var6) {
              var2 = var6;
            }
          }
        }
        if (param0 <= -114) {
          return var2;
        }
        return 30;
    }

    private final void b(int param0, StringBuilder param1, Hashtable param2, int param3) {
        int var6 = 0;
        StringBuilder discarded$4 = null;
        int var8 = 0;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$5 = null;
        na var7 = null;
        int var9 = 0;
        na[] var10 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var9 = TetraLink.field_J;
        try {
          if (null == this.field_I) {
            return;
          }
          var10 = this.field_I;
          for (var6 = param3; var6 < var10.length; var6++) {
            var7 = var10[var6];
            discarded$4 = param1.append('\n');
            for (var8 = 0; param0 >= var8; var8++) {
              discarded$6 = param1.append(' ');
            }
            if (var7 == null) {
              discarded$5 = param1.append("null");
            } else {
              var7.a(param2, param1, 1 + param0, -372494750);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("eg.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param3).append(')').toString());
        }
    }

    private final na a(int param0) {
        int var3 = 0;
        na[] var2;
        na var4;
        int var5;
        na[] var6;
        var5 = TetraLink.field_J;
        if (this.field_I == null) {
          return null;
        }
        var6 = this.field_I;
        var2 = var6;
        if (param0 != 18305) {
          return (na) null;
        }
        for (var3 = 0; var6.length > var3; var3++) {
          var4 = var6[var3];
          if (var4 != null &&
            var4.c(3)) {
            return var4;
          }
        }
        return null;
    }

    final boolean c(int param0) {
        if (param0 != 3) {
          return false;
        }
        return this.a(param0 + 18302) != null ? true : false;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, -128, param3, param4);
        this.d((byte) -127);
        int var6 = -83 % ((param2 + 61) / 51);
    }

    abstract void d(byte param0);

    final String e(int param0) {
        int var3 = 0;
        na[] var2;
        na var4;
        int var6;
        String var5;
        var6 = TetraLink.field_J;
        if (this.field_I == null) {
          return null;
        }
        var2 = this.field_I;
        for (var3 = param0; var3 < var2.length; var3++) {
          var4 = var2[var3];
          if (var4 != null) {
            var5 = var4.e(0);
            if (var5 != null) {
              return var5;
            }
          }
        }
        return null;
    }

    final boolean a(na param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var9 = 0;
        na[] var8 = null;
        RuntimeException var8_ref = null;
        na var10 = null;
        int var11 = 0;
        na[] var12 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        var11 = TetraLink.field_J;
        try {
          if (param4 != -32738) {
            field_L = (String) null;
          }
          if (this.field_I == null) {
            return false;
          }
          var12 = this.field_I;
          var8 = var12;
          for (var9 = 0; var9 < var12.length; var9++) {
            var10 = var12[var9];
            if (var10 != null &&
              var10.a(param0, param1 + this.field_t, param2, param3 + this.field_w, -32738, param5, param6)) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_18_0 = var8_ref;
          stackIn_18_1 = new StringBuilder().append("eg.PA(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    private final boolean a(int param0, na param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        na var5 = null;
        na var6 = null;
        int var7 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_intLifetime1;
        var7 = TetraLink.field_J;
        try {
          if (this.field_I == null) {
            return false;
          }
          var4_int = 0;
          while (var4_int < this.field_I.length) {
            var5 = this.field_I[var4_int];
            if (var5 != null &&
              var5.c(3)) {
              for (var4_int = var4_int + param2; this.field_I.length > var4_int; var4_int = var4_int + param2) {
                var6 = this.field_I[var4_int];
                if (var6 != null &&
                  var6.a(param1, -384169950)) {
                  return true;
                }
              }
            }
            var4_int++;
          }
          var4_intLifetime1 = 59 / ((param0 + 32) / 38);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_22_0 = var4;
          stackIn_22_1 = new StringBuilder().append("eg.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param2).append(')').toString());
        }
    }

    private final boolean a(int param0, na param1) {
        RuntimeException var3 = null;
        na var4 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 1) {
            var4 = (na) null;
            this.a((na) null, -49);
          }
          stackIn_3_0 = this.a(true, 1, param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("eg.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final boolean a(int param0, na param1, int param2, int param3, int param4, int param5, int param6) {
        int var9 = 0;
        na[] var8 = null;
        RuntimeException var8_ref = null;
        na var10 = null;
        int var11 = 0;
        na[] var12 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        var11 = TetraLink.field_J;
        try {
          if (param0 != -19137) {
            this.e(-73);
          }
          if (null == this.field_I) {
            return false;
          }
          var12 = this.field_I;
          var8 = var12;
          for (var9 = 0; var9 < var12.length; var9++) {
            var10 = var12[var9];
            if (var10 != null &&
              var10.c(3) &&
              var10.a(-19137, param1, param2, param3, param4, param5, param6)) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_19_0 = var8_ref;
          stackIn_19_1 = new StringBuilder().append("eg.NA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    private final boolean a(boolean param0, int param1, na param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        na var5 = null;
        na var6 = null;
        int var7 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = TetraLink.field_J;
        try {
          if (!param0) {
            field_N = (String) null;
          }
          if (null == this.field_I) {
            return false;
          }
          var4_int = -1 + this.field_I.length;
          while (0 <= var4_int) {
            var5 = this.field_I[var4_int];
            if (var5 != null &&
              var5.c(3)) {
              for (var4_int = var4_int - param1; var4_int >= 0; var4_int = var4_int - param1) {
                var6 = this.field_I[var4_int];
                if (var6 != null &&
                  var6.a(param2, -384169950)) {
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
          stackIn_24_1 = new StringBuilder().append("eg.I(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        na var6;
        int var7;
        var7 = TetraLink.field_J;
        if (param3 == 0 &&
          this.field_H != null) {
          this.field_H.a((na) (this), param1, param2, true, true);
        }
        if (param0 != 0) {
          field_N = (String) null;
        }
        if (this.field_I != null) {
          for (var5 = -1 + this.field_I.length; var5 >= 0; var5--) {
            var6 = this.field_I[var5];
            if (var6 != null) {
              var6.a(0, this.field_t + param1, param2 + this.field_w, param3);
            }
          }
        }
    }

    final void f(int param0) {
        int var3 = 0;
        na[] var2;
        na var4;
        int var5;
        na[] var6;
        var5 = TetraLink.field_J;
        if (param0 >= -63) {
          this.a(80, 112, -68, 77, -76);
        }
        var6 = this.field_I;
        var2 = var6;
        for (var3 = 0; var3 < var6.length; var3++) {
          var4 = var6[var3];
          if (var4 != null) {
            var4.f(-128);
          }
        }
    }

    private final boolean a(na param0, byte param1) {
        RuntimeException var3 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 45) {
            stackIn_4_0 = this.a(-115, param0, 1);
            return stackIn_4_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("eg.E(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    void a(na param0, int param1, int param2, boolean param3) {
        int var6 = 0;
        na[] var5 = null;
        na var7 = null;
        int var8 = 0;
        na[] var9 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = TetraLink.field_J;
        try {
          super.a(param0, param1, param2, param3);
          if (null == this.field_I) {
            return;
          }
          var9 = this.field_I;
          var5 = var9;
          for (var6 = 0; var9.length > var6; var6++) {
            var7 = var9[var6];
            if (var7 != null) {
              var7.a(param0, this.field_t + param1, this.field_w + param2, param3);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_11_0 = var5_ref;
          stackIn_11_1 = new StringBuilder().append("eg.MA(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean a(int param0, char param1, int param2, na param3) {
        int var6 = 0;
        na[] var5 = null;
        int var5_int = 0;
        RuntimeException var5_ref = null;
        na var7 = null;
        int var8 = 0;
        na[] var9 = null;
        boolean stackIn_21_0 = false;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = TetraLink.field_J;
        try {
          if (this.field_I == null) {
            return false;
          }
          var9 = this.field_I;
          var5 = var9;
          if (param2 != 1) {
            return false;
          }
          for (var6 = 0; var9.length > var6; var6++) {
            var7 = var9[var6];
            if (var7 != null &&
              var7.c(param2 + 2) &&
              var7.a(param0, param1, 1, param3)) {
              return true;
            }
          }
          var5_int = param0;
          if (var5_int != 80) {
            return false;
          }
          if (sn.field_a[81]) {
            stackIn_21_0 = this.a(1, param3);
          } else {
            stackIn_21_0 = this.a(param3, (byte) 45);
          }
          return stackIn_21_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_26_0 = var5_ref;
          stackIn_26_1 = new StringBuilder().append("eg.DB(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    final void a(int param0, boolean param1, na param2, int param3, int param4, int param5) {
        int var8 = 0;
        na[] var7 = null;
        na var9 = null;
        int var10 = 0;
        na[] var11 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        var10 = TetraLink.field_J;
        try {
          if (null == this.field_I) {
            return;
          }
          var11 = this.field_I;
          var7 = var11;
          if (param1) {
            return;
          }
          for (var8 = 0; var8 < var11.length; var8++) {
            var9 = var11[var8];
            if (var9 != null) {
              var9.a(param0, false, param2, param3 + this.field_w, param4, this.field_t + param5);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_14_0 = var7_ref;
          stackIn_14_1 = new StringBuilder().append("eg.AB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    static {
        int var2 = 0;
        int var3 = 0;
        long var0;
        field_J = new je();
        field_M = "<%0> has resigned.";
        field_L = "This private message is prefixed with \"<col=9090FF>To <%1>:</col>\" on your screen.<br>On <%1>'s screen, it will be prefixed with \"<col=FF6060>From <%0>:</col>\", which is<br>a different length and may leave less room for the message itself.<br><br>This shading covers the area which is not available on <%1>'s screen.<br>Provided your message fits to the left of the shaded area,<br><%1> should be able to see it in full.<br><br>(Note: this may be inaccurate if <%1> is playing in a different<br>language from you.)";
        field_O = new long[256];
        for (var2 = 0; 256 > var2; var2++) {
          var0 = (long)var2;
          for (var3 = 0; var3 < 8; var3++) {
            if ((var0 & 1L) == 1L) {
              var0 = -3932672073523589310L ^ var0 >>> 1;
            } else {
              var0 = var0 >>> 1;
            }
          }
          field_O[var2] = var0;
        }
    }
}
