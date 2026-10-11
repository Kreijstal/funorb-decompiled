/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cj {
    float field_g;
    private int field_d;
    private int field_e;
    private int field_k;
    String field_i;
    static String field_b;
    static SceneWidget[] field_a;
    private sl[] field_c;
    static int field_h;
    static String field_f;
    static int field_j;

    final static IndexedSprite[] a(int param0, String param1, cm param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        IndexedSprite[] stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param2.a(param1, 41);
          var5 = param2.a(var4_int, -32759, param3);
          var6 = -61 % ((-77 - param0) / 38);
          stackIn_1_0 = rd.a(true, param2, var4_int, var5);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_4_0 = var4;
          stackIn_4_1 = new StringBuilder().append("cj.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final boolean b(int param0) {
        int var2;
        sl var3;
        int var4;
        var4 = SteelSentinels.obfuscationControl;
        var2 = 69 / ((71 - param0) / 55);
        while (this.field_k > this.field_d) {
          var3 = this.field_c[this.field_d];
          if (!var3.field_d.a(true)) {
            this.a(var3, -9803, 0);
            return false;
          }
          if (var3.field_a >= 0 &&
            !var3.field_d.a(var3.field_a, true)) {
            this.a(var3, -9803, var3.field_d.b(10407, var3.field_a));
            return false;
          }
          if (null != var3.field_g &&
            !var3.field_d.a(var3.field_g, (byte) 90)) {
            this.a(var3, -9803, var3.field_d.a((byte) 76, var3.field_g));
            return false;
          }
          if (var3.field_a < 0 &&
            null == var3.field_g &&
            var3.field_e != null &&
            !var3.field_d.a(25)) {
            this.a(var3, -9803, var3.field_d.a((byte) -33));
            return false;
          }
          this.field_d = this.field_d + 1;
        }
        return true;
    }

    final static int[] a(int param0, int[] param1, ArticulatedPart param2) {
        int var7_int = 0;
        int incrementValue$1 = 0;
        int var8 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        int var9 = 0;
        int[] var10 = null;
        int[] var11 = null;
        int[] stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_6_2 = 0;
        int[] stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = SteelSentinels.obfuscationControl;
        try {
          var3_int = 0;
          var5 = -2 / ((-49 - param0) / 36);
          var11 = new int[1000];
          var10 = var11;
          var4 = var10;
          var3_int = param2.a(0, var11, var3_int);
          var6 = param2.i(-106);
          for (var7_int = 0; var7_int < 8; var7_int++) {
            incrementValue$1 = var3_int;
            var3_int++;
            stackIn_5_0 = var4;
            stackIn_5_1 = incrementValue$1;
            if (var6 <= var7_int) {
              stackIn_6_2 = -1;
            } else {
              stackIn_6_2 = param1[var7_int];
            }
            stackIn_5_0[stackIn_5_1] = stackIn_6_2;
          }
          var7 = new int[var3_int];
          for (var8 = 0; var3_int > var8; var8++) {
            var7[var8] = var11[var8];
          }
          stackIn_11_0 = var7;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("cj.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 != -1) {
          cj.a(-69);
        }
        field_b = null;
        field_f = null;
        field_a = null;
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4, boolean param5, int param6) {
        int var11 = 0;
        int incrementValue$0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var7_intLifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        var14 = SteelSentinels.obfuscationControl;
        try {
          if (param0 <= param4) {
            return;
          }
          if (param3 <= 1 + param4) {
            return;
          }
          if (param4 + 5 < param3 &&
            param6 != param1) {
            var7_int = (1 & (param1 & param6)) + (param6 >> 1) + (param1 >> 1);
            var8 = param4;
            var9 = param1;
            var10 = param6;
            for (var11 = param4; var11 < param3; var11++) {
              var12 = un.field_j[var11];
              if (param5) {
                stackIn_24_0 = ok.field_d[var12];
              } else {
                stackIn_24_0 = eb.field_u[var12];
              }
              var13 = stackIn_24_0;
              if (var7_int < var13) {
                un.field_j[var11] = un.field_j[var8];
                incrementValue$0 = var8;
                var8++;
                un.field_j[incrementValue$0] = var12;
                if (var9 > var13) {
                  var9 = var13;
                }
              } else {
                if (var13 > var10) {
                  var10 = var13;
                }
              }
            }
            cj.a(param0, param1, param2, var8, param4, param5, var9);
            cj.a(param0, var10, (byte) 125, param3, var8, param5, param6);
            return;
          }
          for (var7_intLifetime1 = -1 + param3; param4 < var7_intLifetime1; var7_intLifetime1--) {
            for (var8Lifetime1 = param4; var7_intLifetime1 > var8Lifetime1; var8Lifetime1++) {
              var9Lifetime1 = un.field_j[var8Lifetime1];
              var10Lifetime1 = un.field_j[var8Lifetime1 + 1];
              if (q.a((byte) -127, var9Lifetime1, var10Lifetime1, param5)) {
                un.field_j[var8Lifetime1] = var10Lifetime1;
                un.field_j[1 + var8Lifetime1] = var9Lifetime1;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var7), "cj.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    private final void a(sl param0, int param1, int param2) {
        float var4_float = 0.0f;
        try {
          var4_float = (float)(1 + this.field_d) + (float)param2 / 100.0f;
          if (param2 == 0) {
            this.field_i = param0.field_h;
          } else {
            this.field_i = param0.field_e + " - " + param2 + "%";
          }
          if (param1 != -9803) {
            this.b(-46);
          }
          this.field_g = var4_float * (float)this.field_e / (float)(1 + this.field_k);
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "cj.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static boolean a(int param0, byte param1, int param2, int param3) {
        if (param1 < 57) {
          field_h = 89;
        }
        if (null != an.field_i &&
          an.field_i.b((byte) 126)) {
          rh.a(false);
          return true;
        }
        if (FunOrbClient.field_x != null &&
          FunOrbClient.field_x.k(-91)) {
          FunOrbClient.field_x = null;
          rh.a(false);
          return true;
        }
        if (ta.a(-91)) {
          return true;
        }
        if (vh.a(param3, param2, -80, param0)) {
          return true;
        }
        return false;
    }

    final static int a(byte param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = SteelSentinels.obfuscationControl;
        try {
          var3_int = 1;
          if (param0 > -15) {
            stackIn_3_0 = 20;
            return stackIn_3_0;
          }
          while (1 < param1) {
            if ((param1 & 1) != 0) {
              var3_int = var3_int * param2;
            }
            param2 = param2 * param2;
            param1 = param1 >> 1;
          }
          if (param1 != 1) {
            return var3_int;
          }
          stackIn_11_0 = var3_int * param2;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var3), "cj.F(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private cj() throws Throwable {
        throw new Error();
    }

    static {
        field_b = "Show chat (<%0> unread messages)";
        field_a = new SceneWidget[Math.max(110, 35)];
        field_f = "Show game chat from my friends";
        field_j = 9;
    }
}
