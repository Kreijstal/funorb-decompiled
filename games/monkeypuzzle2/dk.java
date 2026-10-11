/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dk {
    int field_p;
    ml field_l;
    int field_n;
    ta field_m;
    int field_r;
    int field_k;
    static int field_j;
    ml field_a;
    private boolean field_q;
    int field_f;
    ml field_o;
    ml field_i;
    static ib field_d;
    int field_b;
    private int field_c;
    ml field_g;
    int field_s;
    static ib field_h;
    static mj field_e;

    private final void a(int param0, String param1, int param2, int param3) {
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var11Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        int var13Lifetime2;
        var15 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          var5_int = this.field_p + this.field_n;
          var6 = this.field_f + this.field_k;
          var7 = this.field_b;
          if (var7 == -1) {
            var7 = this.field_m.field_C + this.field_m.field_D;
          }
          var8 = ge.field_h >> 2;
          var9 = this.field_m.a(param1);
          var10 = this.field_m.field_D + this.field_m.field_C;
          var11 = 1;
          if (var9 > var8 ||
            -1 != param1.indexOf("<br>")) {
            if (nd.field_g == null) {
              nd.field_g = new String[16];
            }
            if (var9 > var8) {
              var13 = var9 / var8;
              var12 = 2 * ((-1 + var9 % var8 + var13) / var13) + var8;
            } else {
              var12 = var8;
            }
            var11Lifetime1 = this.field_m.a(param1, new int[]{var12}, nd.field_g);
            var9 = 0;
            var10 = var10 + (var11Lifetime1 - 1) * var7;
            for (var13Lifetime2 = 0; var13Lifetime2 < var11Lifetime1; var13Lifetime2++) {
              var14 = this.field_m.a(nd.field_g[var13Lifetime2]);
              if (var9 < var14) {
                var9 = var14;
              }
            }
          }
          var12 = -40 / ((-24 - param0) / 34);
          var13Lifetime1 = param3;
          if (ge.field_h < var5_int + (var9 + var13Lifetime1)) {
            var13Lifetime1 = -var5_int + ge.field_h - var9;
          }
          var14Lifetime1 = 32 - this.field_m.field_j + param2;
          if (ge.field_g < var14Lifetime1 - (-var10 - var6)) {
            var14Lifetime1 = -var6 + (param2 - var10);
          }
          ge.f(var13Lifetime1, var14Lifetime1, var5_int + var9, var10 + var6, this.field_r);
          ge.d(1 + var13Lifetime1, var14Lifetime1 + 1, var5_int + (var9 - 2), var10 + (var6 - 2), this.field_s);
          this.field_m.a(param1, var13Lifetime1 + this.field_p, var14Lifetime1 + this.field_k, var9, var10, this.field_c, -1, 0, 0, var7);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_28_0 = var5;
          stackIn_28_1 = new StringBuilder().append("dk.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(String param0, int param1, int param2, be param3, ta param4) {
        int var7 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          if (param2 != -25006) {
            return;
          }
          var5_int = 0;
          var6 = -1;
          for (var7 = 1; var7 < param0.length(); var7++) {
            var8 = param0.charAt(var7);
            if (var8 == 60) {
              var6 = (var5_int >> 8) + (param3.field_c[0] + param4.a(param0.substring(0, var7)));
            }
            if (var6 != -1) {
              param3.field_c[var7] = var6;
            } else {
              if (var8 == 32) {
                var5_int = var5_int + param1;
              }
              param3.field_c[var7] = (var5_int >> 8) + param3.field_c[0] + (param4.a(param0.substring(0, var7 + 1)) - param4.a((char) var8));
            }
            if (var8 == 62) {
              var6 = -1;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_21_0 = var5;
          stackIn_21_1 = new StringBuilder().append("dk.C(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',');
          if (param4 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param4 < 82) {
          dk.a(41);
        }
        ge.c(param0, param6, param5, param3, param1, param2);
    }

    public static void a(int param0) {
        field_d = null;
        field_h = null;
        field_e = null;
        if (param0 < 100) {
          field_d = (ib) null;
        }
    }

    final static boolean a(int param0, byte param1) {
        int var2 = -89 % ((param1 - 64) / 61);
        return (-param0 & param0) == param0 ? true : false;
    }

    final void a(ta param0, boolean param1) {
        a var17 = null;
        ak var4 = null;
        le[] var5 = null;
        ae var16 = null;
        ae var18 = null;
        int var7_int = 0;
        ak var6 = null;
        ak var7 = null;
        db discarded$0 = null;
        mc discarded$1 = null;
        ak var8 = null;
        le[] var9 = null;
        le[] var10 = null;
        le dupTemp$2 = null;
        ak var11 = null;
        ak var12 = null;
        le var13 = null;
        ak var14 = null;
        ak var19 = null;
        int var15 = MonkeyPuzzle2.field_F ? 1 : 0;
        ak var14Lifetime1;
        ak var14Lifetime2;
        try {
          var17 = new a(param0, 2, 2, 2236962, 1, 1, 1, param0.field_C + param0.field_D + 2);
          var17.field_f = 16777215;
          this.field_a = (ml) ((Object) var17);
          var4 = new ak();
          var17.a(false, var4);
          this.field_m = param0;
          this.field_s = 5592405;
          this.field_p = 3;
          this.field_n = 3;
          this.field_f = 3;
          this.field_b = -1;
          this.field_r = 15658734;
          var4.field_e = 11711154;
          this.field_k = 3;
          var4.field_k = 15658734;
          this.field_c = 15658734;
          var4.a((byte) -102, 0).a(15658734, (byte) -3).a(-20433, vl.a(10066329, 7829367, 8947848, true));
          var4.a((byte) -102, 1).a(-20433, vl.a(10066329, 13421772, 11184810, true));
          var4.a((byte) -102, 3).a(-20433, vl.a(7829367, 10066329, 8947848, !param1 ? true : false)).b(122, 1).a(1, 215650672);
          var5 = new le[9];
          var16 = new ae(32, 32);
          var18 = var16;
          for (var7_int = 0; var18.field_s.length > var7_int; var7_int++) {
            var16.field_s[var7_int] = 1077952576;
          }
          var5[4] = (le) ((Object) var18);
          var4.a((byte) -102, 4).a((byte) -48, true).a(-20433, var5);
          var4.a((byte) -102, 5).a(-20433, jc.a(65793, 0, 64, 0, 0)).a((byte) -48, true).a(-1, (byte) -3);
          this.field_i = (ml) ((Object) var4);
          var6 = new ak(var4, true);
          var6.field_l = 0;
          var7 = new ak(var4, true);
          var7.field_l = 0;
          var7.a(ck.a(8947848, -14377), 250);
          var7.a((byte) -102, 1).a(-20433, ck.a(11184810, -14377)).a(2236962, (byte) -3);
          this.field_l = (ml) ((Object) new pb(param0, 2, 2, 16777215, -1, 5, 5, 15, 15, 4473924));
          discarded$0 = new db(param0, 2, 2, 16777215, -1, 16777215, 16729156, 4473924);
          discarded$1 = new mc(param0, 16777215, -1, 125269879, 4473924, 3, 268435455);
          var8 = new ak();
          var17.a(param1, var8);
          var8.a((byte) -102, 0).a(-20433, vl.a(7829367, 10066329, 15658734, true)).a(1118481, (byte) -3).a(true, -1);
          var8.a((byte) -102, 4).a((byte) -48, true).a(-20433, var5);
          this.field_o = (ml) ((Object) var8);
          var9 = new le[9];
          var9[4] = new le(2, 1);
          var10 = new le[9];
          var10[4] = new le(1, 2);
          dupTemp$2 = var9[4];
          dupTemp$2.field_s = new int[]{6710886, 7829367};
          var10[4].field_s = new int[]{6710886, 7829367};
          var11 = new ak();
          var12 = new ak();
          var11.a(var9, 4986, 0);
          var12.a(var10, 4986, 0);
          var13 = new le(7, 4);
          var13.field_s = new int[]{8947848, 8947848, 8947848, 13421772, 8947848, 8947848, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772};
          var14 = new ak(var4, true);
          var14.a((byte) 1, var13.d());
          var13.b();
          var14Lifetime1 = new ak(var4, true);
          var14Lifetime1.a((byte) 1, var13.d());
          var13.b();
          var14Lifetime2 = new ak(var4, true);
          var14Lifetime2.a((byte) 1, var13.d());
          var13.b();
          var19 = new ak(var4, true);
          var19.a((byte) 1, var13);
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "dk.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void a(int param0, String param1, byte param2, int param3) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
          if (param2 != -87) {
            return;
          }
          var5_int = this.field_m.a(param1);
          var6 = this.field_m.field_j + this.field_m.field_D;
          var7 = param3;
          if (ge.field_h < var7 + var5_int + 6) {
            var7 = -var5_int + ge.field_h - 6;
          }
          var8 = param0 - this.field_m.field_j + 32;
          if (var8 + var6 + 6 > ge.field_g) {
            var8 = -var6 + (ge.field_g - 6);
          }
          ge.f(var7, var8, 6 + var5_int, var6 + 6, this.field_c);
          ge.d(var7 + 1, 1 + var8, var5_int + 4, var6 + 4, this.field_s);
          this.field_m.b(param1, var7 + 3, var8 + 3 + this.field_m.field_j, this.field_c, -1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_11_0 = var5;
          stackIn_11_1 = new StringBuilder().append("dk.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, String param3) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param1 < 6) {
            return;
          }
          if (!this.field_q) {
            this.a(param0, param3, (byte) -87, param2);
          } else {
            this.a(96, param3, param0, param2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("dk.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        ge.e(param2, param3, param5, param4, param1);
        if (param0 != 13421772) {
          this.a(126, 26, -59, -95, -111, -126);
        }
    }

    public dk() {
        this.field_q = true;
    }

    static {
        field_j = 0;
        field_d = new ib();
    }
}
