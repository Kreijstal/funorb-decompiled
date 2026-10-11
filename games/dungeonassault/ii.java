/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class ii extends lm implements aa {
    static String field_E;
    md field_B;
    static String[] field_I;
    static int field_G;
    static String field_C;
    static String field_D;
    static String field_J;
    static int field_F;
    static cn field_H;

    final boolean a(int param0, int param1, int param2, int param3, int param4, lm param5, byte param6) {
        dj var8 = null;
        RuntimeException var8_ref = null;
        lm var9 = null;
        int var10 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = DungeonAssault.field_K;
        try {
          if (param6 != -84) {
            return false;
          }
          var8 = new dj(this.field_B);
          var9 = (lm) (var8.a(-479592473));
          while (var9 != null) {
            if (var9.c(-55)) {
              if (var9.a((byte) 57) &&
                var9.a(param0, param1, param2, param3, param4, param5, (byte) -84)) {
                return true;
              }
              var9 = (lm) (var8.c(param6 + 17840));
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_16_0 = var8_ref;
          stackIn_16_1 = new StringBuilder().append("ii.GB(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param6).append(')').toString());
        }
    }

    public static void e(byte param0) {
        field_I = null;
        field_D = null;
        field_H = null;
        field_E = null;
        if (param0 != -21) {
          return;
        }
        field_J = null;
        field_C = null;
    }

    ii(int param0, int param1, int param2, int param3, ca param4) {
        super(param0, param1, param2, param3, param4, (pg) null);
        this.field_B = new md();
    }

    final StringBuilder a(int param0, Hashtable param1, StringBuilder param2, byte param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_4_0 = null;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(param1, param0, -38, param2)) {
            this.a(param0, param2, param1, 1);
            this.a(param2, param1, true, param0);
          }
          if (param3 < -76) {
            stackIn_6_0 = (StringBuilder) (param2);
            return stackIn_6_0;
          }
          stackIn_4_0 = (StringBuilder) null;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("ii.CB(").append(param0).append(',');
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

    private final void a(StringBuilder param0, Hashtable param1, boolean param2, int param3) {
        StringBuilder discarded$2 = null;
        int var7 = 0;
        StringBuilder discarded$3 = null;
        dj var5 = null;
        lm var6 = null;
        int var8 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = DungeonAssault.field_K;
        try {
          var5 = new dj(this.field_B);
          var6 = (lm) (var5.a(-479592473));
          while (var6 != null) {
            discarded$2 = param0.append('\n');
            for (var7 = 0; param3 >= var7; var7++) {
              discarded$3 = param0.append(' ');
            }
            var6.a(param3 + 1, param1, param0, (byte) -108);
            var6 = (lm) (var5.c(17756));
          }
          if (!param2) {
            field_C = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_12_0 = var5_ref;
          stackIn_12_1 = new StringBuilder().append("ii.VA(");
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
          throw vk.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void h(int param0) {
        int var4 = DungeonAssault.field_K;
        dj var2 = new dj(this.field_B);
        if (param0 != 0) {
          ii.a(22, (byte) 122, -68, -5, 99, -3, false);
        }
        lm var3 = (lm) (var2.a(-479592473));
        while (var3 != null) {
          var3.f(12591);
          var3 = (lm) (var2.c(param0 + 17756));
        }
    }

    final static void a(int param0, byte param1, int param2, int param3, int param4, int param5, boolean param6) {
        int incrementValue$0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var7_intLifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        var14 = DungeonAssault.field_K;
        try {
          if (param4 <= param3) {
            return;
          }
          if (1 + param3 >= param5) {
            return;
          }
          if (param3 + 5 < param5 &&
            param2 != param0) {
            var7_int = (param2 >> 1) + (param0 >> 1) + (param2 & param0 & 1);
            var8 = param3;
            var9 = param0;
            var10 = param2;
            for (var11 = param3; param5 > var11; var11++) {
              var12 = ol.field_k[var11];
              if (!param6) {
                stackIn_24_0 = ci.field_n[var12];
              } else {
                stackIn_24_0 = i.field_t[var12];
              }
              var13 = stackIn_24_0;
              if (var7_int < var13) {
                ol.field_k[var11] = ol.field_k[var8];
                incrementValue$0 = var8;
                var8++;
                ol.field_k[incrementValue$0] = var12;
                if (var9 > var13) {
                  var9 = var13;
                }
              } else {
                if (var10 < var13) {
                  var10 = var13;
                }
              }
            }
            var11Lifetime1 = 75 % ((param1 - 0) / 61);
            ii.a(param0, (byte) 94, var9, param3, param4, var8, param6);
            ii.a(var10, (byte) -127, param2, var8, param4, param5, param6);
            return;
          }
          for (var7_intLifetime1 = param5 - 1; param3 < var7_intLifetime1; var7_intLifetime1--) {
            for (var8Lifetime1 = param3; var7_intLifetime1 > var8Lifetime1; var8Lifetime1++) {
              var9Lifetime1 = ol.field_k[var8Lifetime1];
              var10Lifetime1 = ol.field_k[1 + var8Lifetime1];
              if (r.a(2, param6, var9Lifetime1, var10Lifetime1)) {
                ol.field_k[var8Lifetime1] = var10Lifetime1;
                ol.field_k[var8Lifetime1 + 1] = var9Lifetime1;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var7), "ii.HB(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    void a(int param0, int param1, lm param2, boolean param3) {
        RuntimeException runtimeException = null;
        dj var5 = null;
        lm var6 = null;
        int var7 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = DungeonAssault.field_K;
        try {
          super.a(param0, param1, param2, param3);
          var5 = new dj(this.field_B);
          var6 = (lm) (var5.a(-479592473));
          while (var6 != null) {
            if (var6.c(-18)) {
              var6.a(this.field_q + param0, param1 + this.field_v, param2, param3);
              var6 = (lm) (var5.c(17756));
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_8_0 = runtimeException;
          stackIn_8_1 = new StringBuilder().append("ii.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(')').toString());
        }
    }

    final String c(byte param0) {
        dj var2;
        lm var3;
        String var4;
        int var5;
        lm var6;
        var5 = DungeonAssault.field_K;
        var2 = new dj(this.field_B);
        if (param0 < 3) {
          var6 = (lm) null;
          this.a(70, false, -108, (lm) null, 67, 9);
        }
        var3 = (lm) (var2.a(-479592473));
        while (var3 != null) {
          var4 = var3.c((byte) 80);
          if (var4 != null) {
            return var4;
          }
          var3 = (lm) (var2.c(17756));
        }
        return null;
    }

    final void e(int param0) {
        int var4 = DungeonAssault.field_K;
        dj var2 = new dj(this.field_B);
        lm var3 = (lm) (var2.a(-479592473));
        while (var3 != null) {
          var3.e(119);
          var3 = (lm) (var2.c(17756));
        }
        if (param0 < 1) {
          field_G = -31;
        }
    }

    final void b(byte param0, lm param1) {
        try {
          if (param0 > -41) {
            lm var4 = (lm) null;
            this.a((lm) null, -107, -45, -50, -10, (byte) -60, -91);
          }
          this.field_B.a(param1, false);
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "ii.FB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        int var7 = DungeonAssault.field_K;
        if (param0 == param2 &&
          null != this.field_o) {
          this.field_o.a((byte) 34, (lm) (this), param1, param3, true);
        }
        dj var5 = new dj(this.field_B);
        lm var6 = (lm) (var5.b(-1225818257));
        while (var6 != null) {
          var6.a(param0, this.field_q + param1, 0, this.field_v + param3);
          var6 = (lm) (var5.d(1834857157));
        }
    }

    final boolean a(byte param0) {
        if (param0 < 6) {
          lm var3 = (lm) null;
          this.a((lm) null, -89, 42, 5, 87, (byte) 18, -28);
        }
        return this.g(-20311) != null ? true : false;
    }

    final boolean a(byte param0, lm param1) {
        RuntimeException var3 = null;
        lm var4 = null;
        dj var5 = null;
        lm var6 = null;
        int var7 = 0;
        dj var8 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = DungeonAssault.field_K;
        try {
          if (this.field_B.a((byte) -71)) {
            return false;
          }
          var8 = new dj(this.field_B);
          var4 = (lm) (var8.a(-479592473));
          while (var4 != null) {
            if (var4.a((byte) 11)) {
              var5 = new dj(this.field_B);
              var5.a(true, var4);
              var6 = (lm) (var5.c(17756));
              while (var6 != null) {
                if (var6.a(34, param1)) {
                  return true;
                }
                var6 = (lm) (var5.c(17756));
              }
            }
            var4 = (lm) (var8.c(17756));
          }
          if (param0 == -5) {
            return false;
          }
          field_C = (String) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_22_0 = var3;
          stackIn_22_1 = new StringBuilder().append("ii.UA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    boolean a(lm param0, char param1, int param2, byte param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        lm var8 = null;
        dj var9 = null;
        boolean stackIn_15_0 = false;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = DungeonAssault.field_K;
        try {
          var9 = new dj(this.field_B);
          var8 = (lm) (var9.a(-479592473));
          while (var8 != null) {
            if (var8.c(-124)) {
              if (var8.a((byte) 59) &&
                var8.a(param0, param1, param2, (byte) 112)) {
                return true;
              }
              var8 = (lm) (var9.c(17756));
              continue;
            }
            break;
          }
          if (param3 < 55) {
            field_H = (cn) null;
          }
          var6 = param2;
          if (var6 != 80) {
            return false;
          }
          if (qk.field_e[81]) {
            stackIn_15_0 = this.a(param0, (byte) 71);
          } else {
            stackIn_15_0 = this.a((byte) -5, param0);
          }
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_20_0 = var5;
          stackIn_20_1 = new StringBuilder().append("ii.W(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final int d(int param0) {
        int var6 = 0;
        int var7 = DungeonAssault.field_K;
        int var4 = 32 / ((67 - param0) / 58);
        int var2 = 0;
        dj var3 = new dj(this.field_B);
        lm var5 = (lm) (var3.a(-479592473));
        while (var5 != null) {
          var6 = var5.d(127);
          if (var2 < var6) {
            var2 = var6;
          }
          var5 = (lm) (var3.c(17756));
        }
        return var2;
    }

    final void b(int param0, int param1, int param2, int param3, int param4) {
        super.b(param0 ^ param0, param1, param2, param3, param4);
        this.h(0);
    }

    lm g(int param0) {
        dj var2;
        lm var3;
        int var4;
        var4 = DungeonAssault.field_K;
        if (param0 != -20311) {
          field_C = (String) null;
        }
        var2 = new dj(this.field_B);
        var3 = (lm) (var2.a(param0 ^ 479612750));
        while (var3 != null) {
          if (var3.a((byte) 52)) {
            return var3;
          }
          var3 = (lm) (var2.c(17756));
        }
        return null;
    }

    final boolean a(int param0, lm param1) {
        dj var3 = null;
        RuntimeException var3_ref = null;
        lm var4 = null;
        int var5 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = DungeonAssault.field_K;
        try {
          var3 = new dj(this.field_B);
          if (param0 != 34) {
            return true;
          }
          var4 = (lm) (var3.a(-479592473));
          while (var4 != null) {
            if (var4.a(34, param1)) {
              return true;
            }
            var4 = (lm) (var3.c(17756));
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_15_0 = var3_ref;
          stackIn_15_1 = new StringBuilder().append("ii.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final boolean a(lm param0, byte param1) {
        RuntimeException var3 = null;
        lm var4 = null;
        dj var5 = null;
        lm var6 = null;
        int var7 = 0;
        dj var8 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = DungeonAssault.field_K;
        try {
          if (this.field_B.a((byte) -70)) {
            return false;
          }
          var8 = new dj(this.field_B);
          var4 = (lm) (var8.b(-1225818257));
          while (var4 != null) {
            if (var4.a((byte) 13)) {
              var5 = new dj(this.field_B);
              var5.a(var4, false);
              var6 = (lm) (var5.d(1834857157));
              while (var6 != null) {
                if (var6.a(34, param0)) {
                  return true;
                }
                var6 = (lm) (var5.d(1834857157));
              }
            }
            var4 = (lm) (var8.d(1834857157));
          }
          if (param1 == 71) {
            return false;
          }
          this.g(51);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_22_0 = var3;
          stackIn_22_1 = new StringBuilder().append("ii.WA(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean a(lm param0, int param1, int param2, int param3, int param4, byte param5, int param6) {
        dj var8 = null;
        RuntimeException var8_ref = null;
        int var9 = 0;
        lm var10 = null;
        int var11 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var11 = DungeonAssault.field_K;
        try {
          var8 = new dj(this.field_B);
          var9 = -121 / ((param5 + 80) / 35);
          var10 = (lm) (var8.a(-479592473));
          while (var10 != null) {
            if (var10.c(-76)) {
              if (var10.a(param0, param1, param2, this.field_q + param3, param4, (byte) 53, this.field_v + param6)) {
                return true;
              }
              var10 = (lm) (var8.c(17756));
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_13_0 = var8_ref;
          stackIn_13_1 = new StringBuilder().append("ii.U(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final void a(int param0, boolean param1, int param2, lm param3, int param4, int param5) {
        dj var7 = null;
        lm var8 = null;
        int var9 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        var9 = DungeonAssault.field_K;
        try {
          var7 = new dj(this.field_B);
          var8 = (lm) (var7.a(-479592473));
          while (var8 != null) {
            if (var8.c(-101)) {
              var8.a(this.field_v + param0, true, param2, param3, param4 + this.field_q, param5);
              var8 = (lm) (var7.c(17756));
              continue;
            }
            break;
          }
          if (!param1) {
            ii.a(-2, (byte) -30, 118, -44, -40, -125, false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_10_0 = var7_ref;
          stackIn_10_1 = new StringBuilder().append("ii.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    static {
        field_E = "Skip";
        field_J = "<%col_detect>Detect +3 to all monsters.</col>";
        field_C = "Defeated";
        field_F = 3;
        field_I = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
        field_G = -1;
    }
}
