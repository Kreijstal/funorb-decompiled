/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class dl extends lh implements lm {
    static byte[] field_O;
    static String[][] field_N;
    static int field_M;
    static ka field_J;
    NodeDeque field_K;
    static String[] field_I;
    static String[][] field_H;
    static byte[][] field_L;
    static int field_G;

    lh h(int param0) {
        NodeIterator var2;
        lh var3;
        int var4;
        var4 = SteelSentinels.obfuscationControl;
        var2 = new NodeIterator(this.field_K);
        if (param0 != -1) {
          dl.f(-120);
        }
        var3 = (lh) (var2.b(2));
        while (var3 != null) {
          if (var3.d(~param0)) {
            return var3;
          }
          var3 = (lh) (var2.d(param0 + 3));
        }
        return null;
    }

    boolean a(int param0, int param1, char param2, lh param3) {
        RuntimeException var5 = null;
        lh var6_ref_lh = null;
        int var6 = 0;
        int var7 = 0;
        NodeIterator var8 = null;
        boolean stackIn_15_0 = false;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = SteelSentinels.obfuscationControl;
        try {
          var8 = new NodeIterator(this.field_K);
          var6_ref_lh = (lh) (var8.b(2));
          if (param0 != 30373) {
            dl.a(76, 69, -95, -115);
          }
          while (var6_ref_lh != null) {
            if (var6_ref_lh.b((byte) -12)) {
              if (var6_ref_lh.d(0) &&
                var6_ref_lh.a(param0 ^ 0, param1, param2, param3)) {
                return true;
              }
              var6_ref_lh = (lh) (var8.d(2));
              continue;
            }
            break;
          }
          var6 = param1;
          if (var6 != 80) {
            return false;
          }
          if (fc.field_e[81]) {
            stackIn_15_0 = this.b(param3, 79);
          } else {
            stackIn_15_0 = this.b(-11963, param3);
          }
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_20_0 = var5;
          stackIn_20_1 = new StringBuilder().append("dl.R(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final void a(lh param0, int param1) {
        try {
          if (param1 > -82) {
            lh var4 = (lh) null;
            this.a(-93, (lh) null);
          }
          this.field_K.addLast(3, param0);
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "dl.IC(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static int a(int param0, int param1, int param2, int param3) {
        if (param2 + param3 <= SoftwareRaster.field_c) {
          return param2;
        }
        if (param1 != 127) {
          dl.f(-101);
        }
        if (-param3 + param0 + param2 >= 0) {
          return -param3 + (param0 + param2);
        }
        return SoftwareRaster.field_c - param3;
    }

    void a(int param0, byte param1, int param2, int param3) {
        int var7 = SteelSentinels.obfuscationControl;
        if (param3 == 0 &&
          this.field_p != null) {
          this.field_p.a(param2, (lh) (this), (byte) -30, true, param0);
        }
        NodeIterator var5 = new NodeIterator(this.field_K);
        lh var6 = (lh) (var5.c(2));
        while (var6 != null) {
          var6.a(this.field_z + param0, (byte) -109, this.field_o + param2, param3);
          var6 = (lh) (var5.a(true));
        }
        if (param1 > -99) {
          StringBuilder var8 = (StringBuilder) null;
          this.a((byte) -85, (Hashtable) null, (StringBuilder) null, 76);
        }
    }

    dl(int param0, int param1, int param2, int param3, qk param4) {
        super(param0, param1, param2, param3, param4, (tn) null);
        this.field_K = new NodeDeque();
    }

    void a(int param0, int param1, lh param2, int param3) {
        RuntimeException runtimeException = null;
        NodeIterator var5 = null;
        lh var6 = null;
        int var7 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = SteelSentinels.obfuscationControl;
        try {
          super.a(param0, 108, param2, param3);
          var5 = new NodeIterator(this.field_K);
          if (param1 <= 56) {
            return;
          }
          var6 = (lh) (var5.b(2));
          while (var6 != null) {
            if (var6.b((byte) -12)) {
              var6.a(this.field_o + param0, 112, param2, param3 + this.field_z);
              var6 = (lh) (var5.d(2));
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_10_0 = runtimeException;
          stackIn_10_1 = new StringBuilder().append("dl.H(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean a(int param0, lh param1) {
        NodeIterator var3 = null;
        RuntimeException var3_ref = null;
        lh var4 = null;
        int var5 = 0;
        StringBuilder var6 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = SteelSentinels.obfuscationControl;
        try {
          if (param0 != 1) {
            var6 = (StringBuilder) null;
            this.a((Hashtable) null, (StringBuilder) null, (byte) -47, 62);
          }
          var3 = new NodeIterator(this.field_K);
          var4 = (lh) (var3.b(2));
          while (var4 != null) {
            if (var4.a(1, param1)) {
              return true;
            }
            var4 = (lh) (var3.d(param0 + 1));
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_14_0 = var3_ref;
          stackIn_14_1 = new StringBuilder().append("dl.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final boolean b(int param0, lh param1) {
        RuntimeException var3 = null;
        lh var4 = null;
        NodeIterator var5 = null;
        lh var6 = null;
        int var7 = 0;
        NodeIterator var8 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = SteelSentinels.obfuscationControl;
        try {
          if (this.field_K.f(param0 + 11970)) {
            return false;
          }
          var8 = new NodeIterator(this.field_K);
          var4 = (lh) (var8.b(2));
          while (var4 != null) {
            if (var4.d(0)) {
              var5 = new NodeIterator(this.field_K);
              var5.a(false, var4);
              var6 = (lh) (var5.d(2));
              while (var6 != null) {
                if (var6.a(param0 ^ -11964, param1)) {
                  return true;
                }
                var6 = (lh) (var5.d(2));
              }
            }
            var4 = (lh) (var8.d(param0 + 11965));
          }
          if (param0 == -11963) {
            return false;
          }
          field_L = (byte[][]) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_21_0 = var3;
          stackIn_21_1 = new StringBuilder().append("dl.JC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    public static void g(int param0) {
        field_J = null;
        field_O = null;
        field_L = (byte[][]) null;
        field_N = (String[][]) null;
        field_H = (String[][]) null;
        field_I = null;
        if (param0 != -19969) {
          field_G = 67;
        }
    }

    final StringBuilder a(Hashtable param0, StringBuilder param1, byte param2, int param3) {
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
          if (param2 >= -104) {
            stackIn_2_0 = (StringBuilder) null;
            return stackIn_2_0;
          }
          if (this.a(param1, (byte) -91, param3, param0)) {
            this.a(param3, param0, false, param1);
            this.a((byte) 77, param0, param1, param3);
          }
          stackIn_6_0 = (StringBuilder) (param1);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("dl.D(");
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
          throw ci.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    void a(int param0, byte param1, int param2, int param3, int param4) {
        super.a(param0, (byte) -116, param2, param3, param4);
        if (param1 > -71) {
          field_N = (String[][]) null;
        }
        this.f((byte) 45);
    }

    final boolean b(lh param0, int param1) {
        RuntimeException var3 = null;
        lh var4 = null;
        NodeIterator var5 = null;
        lh var6 = null;
        int var7 = 0;
        NodeIterator var8 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = SteelSentinels.obfuscationControl;
        try {
          if (param1 <= 55) {
            field_O = (byte[]) null;
          }
          if (this.field_K.f(7)) {
            return false;
          }
          var8 = new NodeIterator(this.field_K);
          var4 = (lh) (var8.c(2));
          while (var4 != null) {
            if (var4.d(0)) {
              var5 = new NodeIterator(this.field_K);
              var5.a(24192, var4);
              var6 = (lh) (var5.a(true));
              while (var6 != null) {
                if (var6.a(1, param0)) {
                  return true;
                }
                var6 = (lh) (var5.a(true));
              }
            }
            var4 = (lh) (var8.a(true));
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_22_0 = var3;
          stackIn_22_1 = new StringBuilder().append("dl.GC(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(')').toString());
        }
    }

    final static al g(byte param0) {
        if (param0 != 3) {
          dl.a(106, -66, -3, true, 74, -85, -31, 4);
        }
        return (al) ((Object) new gl());
    }

    final void a(byte param0, int param1, int param2, int param3, lh param4, int param5) {
        RuntimeException runtimeException = null;
        NodeIterator var7 = null;
        lh var8 = null;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = SteelSentinels.obfuscationControl;
        try {
          var7 = new NodeIterator(this.field_K);
          var8 = (lh) (var7.b(2));
          var9 = -102 / ((param0 - 36) / 32);
          while (var8 != null) {
            if (var8.b((byte) -12)) {
              var8.a((byte) -128, param1, this.field_z + param2, param3 + this.field_o, param4, param5);
              var8 = (lh) (var7.d(2));
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_8_0 = runtimeException;
          stackIn_8_1 = new StringBuilder().append("dl.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param5).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, boolean param3, int param4, int param5, int param6, int param7) {
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var8_intLifetime1;
        int var8_intLifetime2;
        int var8_intLifetime3;
        int var8_intLifetime4;
        int var8_intLifetime1Lifetime1;
        int var8_intLifetime2Lifetime1;
        var11 = SteelSentinels.obfuscationControl;
        try {
          SoftwareRaster.d(param1, param5, param2, param0, param4);
          SoftwareRaster.d(param2, param0, param7, param6, param4);
          SoftwareRaster.d(param7, param6, param1, param5, param4);
          if (param0 < param5) {
            var8_int = param1;
            param1 = param2;
            param2 = var8_int;
            var8_intLifetime4 = param5;
            param5 = param0;
            param0 = var8_intLifetime4;
          }
          if (param6 < param5) {
            var8_intLifetime1 = param1;
            param1 = param7;
            param7 = var8_intLifetime1;
            var8_intLifetime1Lifetime1 = param5;
            param5 = param6;
            param6 = var8_intLifetime1Lifetime1;
          }
          if (param0 > param6) {
            var8_intLifetime2 = param2;
            param2 = param7;
            param7 = var8_intLifetime2;
            var8_intLifetime2Lifetime1 = param0;
            param0 = param6;
            param6 = var8_intLifetime2Lifetime1;
          }
          if (param2 < param7) {
            for (var10 = param5; param0 > var10; var10++) {
              var9 = param1 + (var10 - param5) * (-param1 + param7) / (param6 - param5);
              var8_intLifetime3 = (param2 - param1) * (-param5 + var10) / (-param5 + param0) + param1;
              SoftwareRaster.g(var8_intLifetime3, var10, -var8_intLifetime3 + (var9 + 1), param4);
            }
            for (var10 = param0; var10 < param6; var10++) {
              var9 = (-param5 + var10) * (-param1 + param7) / (-param5 + param6) + param1;
              var8_intLifetime3 = param2 + (param7 - param2) * (-param0 + var10) / (param6 - param0);
              SoftwareRaster.g(var8_intLifetime3, var10, 1 + (-var8_intLifetime3 + var9), param4);
            }
          } else {
            for (var10 = param5; param0 > var10; var10++) {
              var9 = (param2 - param1) * (-param5 + var10) / (param0 - param5) + param1;
              var8_intLifetime3 = (param7 - param1) * (var10 - param5) / (-param5 + param6) + param1;
              SoftwareRaster.g(var8_intLifetime3, var10, 1 - var8_intLifetime3 + var9, param4);
            }
            for (var10 = param0; param6 > var10; var10++) {
              var9 = param2 + (-param2 + param7) * (var10 - param0) / (param6 - param0);
              var8_intLifetime3 = param1 + (var10 - param5) * (-param1 + param7) / (-param5 + param6);
              SoftwareRaster.g(var8_intLifetime3, var10, 1 - var8_intLifetime3 + var9, param4);
            }
          }
          if (!param3) {
            dl.g(64);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var8), "dl.EC(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final boolean a(int param0, lh param1, int param2, int param3, int param4, boolean param5, int param6) {
        NodeIterator var8 = null;
        RuntimeException var8_ref = null;
        lh var9 = null;
        int var10 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = SteelSentinels.obfuscationControl;
        try {
          var8 = new NodeIterator(this.field_K);
          if (!param5) {
            field_M = 17;
          }
          var9 = (lh) (var8.b(2));
          while (var9 != null) {
            if (var9.b((byte) -12)) {
              if (!var9.a(param0, param1, this.field_o + param2, param3, this.field_z + param4, true, param6)) {
                var9 = (lh) (var8.d(2));
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
          stackIn_14_1 = new StringBuilder().append("dl.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final boolean a(byte param0, int param1, int param2, int param3, lh param4, int param5, int param6) {
        NodeIterator var8 = null;
        RuntimeException var8_ref = null;
        lh var9 = null;
        int var10 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = SteelSentinels.obfuscationControl;
        try {
          if (param0 > -34) {
            this.a(-58, (byte) 107, -39, -11);
          }
          var8 = new NodeIterator(this.field_K);
          var9 = (lh) (var8.b(2));
          while (var9 != null) {
            if (var9.b((byte) -12)) {
              if (var9.d(0) &&
                var9.a((byte) -83, param1, param2, param3, param4, param5, param6)) {
                return true;
              }
              var9 = (lh) (var8.d(2));
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_16_0 = var8_ref;
          stackIn_16_1 = new StringBuilder().append("dl.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final static boolean f(int param0) {
        Object var1 = null;
        Object var1_ref = null;
        Throwable var2 = null;
        boolean stackIn_7_0 = false;
        Throwable decompiledCaughtException = null;
        var1_ref = wc.field_i;
        synchronized (var1_ref) {
          if (ad.field_b == mn.field_y) {
            return false;
          }
          if (param0 != 22759) {
            field_G = -52;
          }
          ei.field_q = kk.field_b[ad.field_b];
          de.field_c = pi.field_b[ad.field_b];
          ad.field_b = 127 & 1 + ad.field_b;
          stackIn_7_0 = true;
        }
        return stackIn_7_0;
    }

    final boolean d(int param0) {
        if (param0 != 0) {
          field_J = (ka) null;
        }
        return this.h(-1) != null ? true : false;
    }

    final void d(byte param0) {
        int var4 = SteelSentinels.obfuscationControl;
        if (param0 != -45) {
          field_N = (String[][]) null;
        }
        NodeIterator var2 = new NodeIterator(this.field_K);
        lh var3 = (lh) (var2.b(param0 + 47));
        while (var3 != null) {
          var3.d((byte) -45);
          var3 = (lh) (var2.d(2));
        }
    }

    final static boolean a(long param0, int[] param1, int param2, int param3, String param4) {
        mg var6 = null;
        RuntimeException var6_ref = null;
        CharSequence var7 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!vk.a(param0, param1, param4, param3, -21)) {
            return false;
          }
          if (param3 == 1) {
            param3 = 0;
          }
          ib.field_b = param3;
          en.field_e = param4;
          var7 = (CharSequence) ((Object) param4);
          bk.field_U = ui.a(1, var7);
          ti.field_p = param0;
          if (param2 >= -113) {
            return false;
          }
          var6 = um.a(Sprite.field_f, fb.field_l, pg.field_u, param1, -90);
          pa.a(12105, var6);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_12_0 = var6_ref;
          stackIn_12_1 = new StringBuilder().append("dl.HC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    private final void a(byte param0, Hashtable param1, StringBuilder param2, int param3) {
        StringBuilder discarded$3 = null;
        int var8 = 0;
        StringBuilder discarded$4 = null;
        NodeIterator var5 = null;
        lh var6 = null;
        int var7 = 0;
        int var9 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var9 = SteelSentinels.obfuscationControl;
        try {
          var5 = new NodeIterator(this.field_K);
          var7 = -34 % ((-2 - param0) / 43);
          var6 = (lh) (var5.b(2));
          while (var6 != null) {
            discarded$3 = param2.append('\n');
            for (var8 = 0; param3 >= var8; var8++) {
              discarded$4 = param2.append(' ');
            }
            var6.a(param1, param2, (byte) -114, 1 + param3);
            var6 = (lh) (var5.d(2));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_10_0 = var5_ref;
          stackIn_10_1 = new StringBuilder().append("dl.DC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
        }
    }

    final int b(boolean param0) {
        int var5 = 0;
        int var6 = SteelSentinels.obfuscationControl;
        int var2 = 0;
        if (!param0) {
          field_L = (byte[][]) null;
        }
        NodeIterator var3 = new NodeIterator(this.field_K);
        lh var4 = (lh) (var3.b(2));
        while (var4 != null) {
          var5 = var4.b(true);
          if (var5 > var2) {
            var2 = var5;
          }
          var4 = (lh) (var3.d(2));
        }
        return var2;
    }

    String e(int param0) {
        NodeIterator var2;
        lh var3;
        String var4;
        int var5;
        var5 = SteelSentinels.obfuscationControl;
        var2 = new NodeIterator(this.field_K);
        if (param0 != 0) {
          return (String) null;
        }
        var3 = (lh) (var2.b(2));
        while (var3 != null) {
          var4 = var3.e(param0 ^ 0);
          if (var4 != null) {
            return var4;
          }
          var3 = (lh) (var2.d(2));
        }
        return null;
    }

    private final void f(byte param0) {
        int var4 = SteelSentinels.obfuscationControl;
        if (param0 != 45) {
          return;
        }
        NodeIterator var2 = new NodeIterator(this.field_K);
        lh var3 = (lh) (var2.b(2));
        while (var3 != null) {
          var3.e((byte) 102);
          var3 = (lh) (var2.d(2));
        }
    }

    static {
        field_N = new String[][]{new String[]{"Introduction", "Walking", "Walking", "Walking", "Walking", "Camera control", "Jumping", "Jumping", "Shooting", "Shooting", "Shooting", "Complete"}, new String[]{"Introduction", "Weapon selection", "Rockets", "Power-up", "Rockets", "Camera control", "Camera control", "Sniping", "Camera control", "Moving targets", "Rocket Defence", "AMARDS", "AMARDS", "Combat", "Complete"}, null, new String[]{"Introduction", "Thrust", "Flight", "Energy loss", "Flight", "Lasers", "Complete"}, null, new String[]{"Targeting", "Missiles", "Combat", "Combat", "Complete"}, null, new String[]{"Introduction", "Heavy rocket", "Missed", "Hit", "Cannon", "Moving targets", "Complete"}, null, new String[]{"Introduction", "Flak", "Rocket defence", "Rocket defence", "Airburst", "Complete"}, null};
        field_H = new String[][]{new String[]{"Welcome to basic control and navigation training. First you will learn to move your sentinel along the ground. For this you will be using an unarmed Slave-class sentinel.", "Press <img=20> to continue.", "Tap the 'A' key to tell your sentinel to start moving left.", "Press 'A' once to start moving left.", "Since you are remotely piloting your sentinel, there is a short delay between when you issue an order and when the sentinel receives and acts upon it. <br>Tap the 'D' key to instruct your sentinel to start moving right.", "Press 'D' once to start moving right.", "In the absence of other orders, your sentinel will carry on walking. Press 'S' to tell it to halt.", "Press 'S' to stop moving.", "At the bottom of your screen is the minimap. This shows the locations of sentinels on the battlefield. The blue circle is your sentinel, and the flashing red circle is a training drone. Walk your sentinel to the training drone and stop as close to it as possible.", "Use 'A', 'S', 'D' to position your sentinel at the training drone.", "You can move the camera by holding down the right mouse button and moving the mouse. The buttons on the right offer some options for changing the controls.<br>Try them out and choose the one you prefer.", "Press <img=20> to continue.", "The Slave also has the ability to jump. To instruct your sentinel to jump, press 'W'.", "Use 'W' to jump.", "While you hold 'W', the projected path of your jump is displayed on your screen. This allows you to aim your jump precisely by moving the mouse.<br>There are now three drones in elevated positions on the battlefield. Reach them all by jumping.", "Hold 'W' and move the mouse to plan the trajectory of your jump.<br>Reach all the drones by jumping.", "Your Slave will now be equipped with its standard complement of close-assault guns. These are short-range, direct-fire weapons.<br>Move the mouse to aim your weapons. The white 'trajectory line' emitted from your sentinel indicates the projected path of your weapon-fire.", "Press <img=20> to continue.", "Every weapon has a limited firing arc, which you can see as a thick blue arc displayed next to your sentinel. Your weapon will only fire in directions inside this arc.<br>Use the left mouse button to fire your weapons. Holding the button down will fire at the weapon's optimal firing rate. Use the close-assault guns to destroy the training drone.", "Fire with the left mouse button.<br>Destroy the training drone with your guns.", "Some mobile drones have been placed on the training field. Destroy them all. Keep in mind that your guns have a limited range and a restricted firing arc.<br>Remember, you can move your sentinel to a better position using the move keys ('A', 'S', 'D') or by jumping ('W').", "Hold down the left mouse button to keep firing.<br>Destroy all the training drones.", "Well done, you have completed the first training mission.", ""}, new String[]{"Welcome to your second training mission. In this program you will learn about combat using rockets. Initially, a barrier will confine your sentinel to a ledge on the edge of the battlefield so you can practise shooting from a distance.", "Press <img=20> to continue.", "The Slave-class sentinel is equipped with a batch of piercer rockets, though not normally as many as this. These are cheap, light rockets that are nonetheless deadly in salvoes.<br>Pressing 'Q' or 'E' changes your currently selected weapon.", "Press 'E' to select your piercer rockets.", "Rockets detonate when they strike ground or another solid object. Anything caught in the explosion receives damage.<br>Use the white trajectory line to visualise the rocket's trajectory.", "Fire rockets at the drone.", "Any rocket-equipped sentinel has a limited number to fire before it runs out. Over time, new rockets will be loaded and then the sentinel can fire again.<br>For expediency, in this tutorial you will have access to a speed-loader. This module reduces reload times for rockets and missiles.", "Pick up the speed-loader power-up by walking over it.", "More drones have been placed on the battlefield, at increasing distances from your sentinel. Use your rockets to destroy them. Beware that rocket explosions can damage your sentinel too.<br>If you run out of rockets, your cursor will turn red, indicating that you cannot fire until your rockets have been reloaded.", "Destroy the drones with rockets.", "There is one more drone, on the left hand side of the battlefield. Scroll left (by holding the right mouse button and dragging the mouse) to find it.", "Hold the right mouse button and drag to move the camera left.", "When your sentinel is off-screen, the inset display appears at the screen edge closest to your sentinel, to remind you where your sentinel is. Click and drag the right mouse button to move the camera around, and the highlighted box on your minimap shows what part of the battlefield you are currently viewing.", "Right click and drag the mouse to move the camera around.", "Now, position the camera so that you can see the training drone on the left of the map, and destroy it with your rockets.", "Destroy the drone with rockets.", "Well done. To bring your sentinel back into view wherever it is, press 'V'.", "Press 'V' to move the camera back to your sentinel.", "The next drones are moving targets. Try to anticipate their positions so that your rockets intercept them.", "Destroy the moving drones with rockets.", "Next you will learn about rocket defence using AMARDS. For this you will be back in the standard model Slave.", "Press <img=20> to continue.", "The Slave-class sentinel comes with Automatic Missile And Rocket Defence Systems (AMARDS). This fires the Slave's guns at incoming rockets and missiles to detonate them before they get too close. Approach the nearby rocket drone to activate AMARDS.", "Approach the rocket drone.", "AMARDS only works when your sentinel is facing the direction of an attack. <br>It can destroy a hostile sentinel by detonating its rockets at launch.<br>Approach the rocket drone so your AMARDS can destroy it.", "Destroy the rocket drone.", "Destroy the drones to complete the mission. They will become aggressive when you fire on them.", "Destroy all hostile forces.", "Well done, you have completed Slave rocket training.", ""}, new String[]{}, new String[]{"For the following missions, you will be using an Aquila-class sentinel. The Aquila is a fast, lightweight sentinel, capable of aerial thrust.", "Press <img=20> to continue.", "To thrust, use 'W' and perform a jump. Then, while in the air, use 'W' and jump again.", "Use 'W' and the mouse in the air to thrust.", "Now, by thrusting multiple times, try and stay in the air for as long as possible.", "Use 'W' and the mouse in the air to thrust.", "Your sentinel has run out of energy. When this happens, it cannot move until it recovers. <br>Thrusting expends energy, but energy recharges quickly if your sentinel is still. <br>Be aware of your energy gauge and try to avoid 'energy loss' state.", "Press <img=20> to continue.", "Some floating drones have been dropped into the battlefield. Use your Aquila's thrust to fly to them. Try not to exhaust your energy.", "Fly to the floating beacons.", "Your Aquila's pulse laser has now been activated. Lasers fire in a straight line, and inflict energy damage. However, every shot drains some of your energy reserves, so firing in rapid succession can lead to energy loss.<br>Fire the lasers at the drones.", "Destroy the drones with lasers.", "Well done, you have completed Aquila energy training.", ""}, new String[]{}, new String[]{"Your sentinel is now a full default Aquila. In addition to the lasers, it has missiles and a targeting system.<br>To target an enemy, hold the 'ALT' key and click the left mouse button on the enemy.", "Hold 'ALT' and click on an enemy to target it.", "The red markers around the enemy indicate your target lock. When the markers disappear, the target lock has expired. Getting a target lock uses 1 unit of energy.<br>Select your missiles ('E') and fire them upwards, avoiding any nearby obstacles. They will home in on your current target.", "Destroy the drones with missiles.", "While you have a target lock, any direct-fire weapons (such as lasers) will automatically aim towards your target.<br>If you ever need to drop a target lock, click on the targeting icon at the bottom-right of your interface, or click the right mouse button while holding 'ALT'.<br>Destroy the next batch of drones with your lasers. Target locks make it easier to hit moving enemies.", "Destroy the drones with lasers.", "Well done, you have completed the Aquila targeting mission.", ""}, new String[]{}, new String[]{"The most powerful weapon in a Golem's arsenal is the heavy rocket. This is a long-range rocket with an explosion that can severely damage your sentinel if it detonates too close.<br>The Golem's scanner extends trajectory lines, allowing long-range weapons to be fired across the whole battlefield with accuracy.", "Select your heavy rocket using 'Q' and 'E'.", "There is a training drone on the left side of the battlefield. Move the camera to find it, and fire your heavy rocket at it.", "Select your heavy rocket and fire it at the training drone.", "Your shot was unsuccessful. Heavy rockets normally take a long time to reload, but for now this will be accelerated so that you can try again.<br>Try and use the white trajectory line to see where the rocket is going to land, before you fire it.", "Fire at the training drone.", "Well done. The next phase of training uses the Golem's cannons. Select them as your current weapon.", "Select cannons.", "The cannon is an explosive ballistic weapon. Cannon fire follows a parabolic arc and causes explosive damage on impact. If you hold down the mouse button, the cannon will fire at its optimum rate.<br>Destroy the nearby drones with your cannons.", "Destroy the drones with cannons.", "The barrier confining your sentinel has now been lifted. Destroy the remaining drones with either of your available weapons.", "Destroy the drones.", "Well done, you have completed the training mission.", ""}, new String[]{}, new String[]{"Flak is a useful defensive weapon against rockets and enemy sentinels. Flak forms a cloud in the air where it is fired, which damages anything passing through it.", "Select flak as your current weapon.", "A drone is being placed in the battlefield. Fire flak in front of it and observe the results. Be careful not to move your sentinel into the flak cloud, or it will receive damage.", "Destroy the drone with flak.", "Flak can also destroy incoming rockets. A rocket Slave will be dropped into the battlefield. Use flak to defend yourself against its rockets.<br>Rockets that detonate close enough to the Slave will cause it damage.", "Press <img=20> to begin.", "", "Destroy the Slave.", "The Golem is armed with airburst rockets. These create a cloud of flak when they detonate, which can damage and bring down aerial enemies.", "Select airburst rockets as your current weapon.", "Fire airburst into the path of the aerial drones to bring them down. You can also destroy them with guns or your other weapons, if you can hit them.<br>Destroy them all to complete the mission.", "Destroy the drones.", "Well done. You have completed Golem training.", ""}};
        field_I = new String[]{"never", "once", "twice", "<%0> times"};
    }
}
