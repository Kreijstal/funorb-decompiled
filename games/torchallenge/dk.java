/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dk {
    j field_l;
    int field_k;
    eg field_t;
    j field_i;
    static pa field_s;
    private int field_b;
    static String field_d;
    int field_e;
    j field_f;
    static int field_a;
    j field_q;
    int field_n;
    int field_h;
    int field_r;
    static String field_g;
    private boolean field_j;
    static ka[][] field_c;
    int field_p;
    int field_o;
    j field_m;

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param0 == 4) {
          qg.a(param5, param4, param1, param3, param2, param6);
          return;
        }
        this.a(121, -123, (byte) 22, 3, -114, 122);
        qg.a(param5, param4, param1, param3, param2, param6);
    }

    private final void a(String param0, int param1, int param2, int param3) {
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
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
        int var13Lifetime2;
        var15 = TorChallenge.field_F ? 1 : 0;
        try {
          var5_int = this.field_r + this.field_k;
          var6 = this.field_h + this.field_o;
          var7 = this.field_n;
          if (var7 == -1) {
            var7 = this.field_t.field_K + this.field_t.field_x;
          }
          var8 = qg.field_g >> 2;
          var9 = this.field_t.a(param0);
          var10 = this.field_t.field_K + this.field_t.field_x;
          var11 = param3;
          if (var8 < var9 ||
            param0.indexOf("<br>") != -1) {
            if (var9 <= var8) {
              var12 = var8;
            } else {
              var13 = var9 / var8;
              var12 = var8 + (var9 % var8 + (var13 - 1)) / var13 * 2;
            }
            if (bh.field_m == null) {
              bh.field_m = new String[16];
            }
            var11Lifetime1 = this.field_t.a(param0, new int[]{var12}, bh.field_m);
            var10 = var10 + (var11Lifetime1 - 1) * var7;
            var9 = 0;
            for (var13Lifetime2 = 0; var11Lifetime1 > var13Lifetime2; var13Lifetime2++) {
              var14 = this.field_t.a(bh.field_m[var13Lifetime2]);
              if (var14 > var9) {
                var9 = var14;
              }
            }
          }
          var12 = param1;
          if (var5_int + var12 + var9 > qg.field_g) {
            var12 = -var5_int + (-var9 + qg.field_g);
          }
          var13Lifetime1 = 32 + (param2 - this.field_t.field_t);
          if (var6 + (var13Lifetime1 + var10) > qg.field_f) {
            var13Lifetime1 = -var6 + (-var10 + param2);
          }
          qg.b(var12, var13Lifetime1, var9 + var5_int, var6 + var10, this.field_e);
          qg.f(var12 + 1, var13Lifetime1 + 1, -2 + var9 + var5_int, var6 + var10 - 2, this.field_p);
          this.field_t.a(param0, this.field_k + var12, this.field_h + var13Lifetime1, var9, var10, this.field_b, -1, 0, 0, var7);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_29_0 = var5;
          stackIn_29_1 = new StringBuilder().append("dk.A(");
          if (param0 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_g = null;
        field_s = null;
        field_c = (ka[][]) null;
        field_d = null;
        if (param0 != 23592) {
          java.awt.Component var2 = (java.awt.Component) null;
          dk.a(16, (java.awt.Component) null, -10, -28);
        }
    }

    final void a(int param0, int param1, byte param2, int param3, int param4, int param5) {
        if (param2 < -85) {
          qg.d(param3, param1, param0, param5, param4);
          return;
        }
        String var8 = (String) null;
        this.a((String) null, 29, 47, -117);
        qg.d(param3, param1, param0, param5, param4);
    }

    final void a(int param0, String param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = -1 % ((16 - param3) / 48);
          if (this.field_j) {
            this.a(param1, param2, param0, 1);
            return;
          }
          this.b(param2, param1, param0, -103);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("dk.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(eg param0, int param1) {
        bc var18 = null;
        ga var4 = null;
        ka[] var5 = null;
        el var17 = null;
        el var19 = null;
        int var7_int = 0;
        ga var6 = null;
        ga var7 = null;
        g discarded$0 = null;
        ph discarded$1 = null;
        ga var8 = null;
        ka[] var9 = null;
        ka[] var10 = null;
        ka dupTemp$2 = null;
        ga var11 = null;
        ga var12 = null;
        ka var13 = null;
        ga var14 = null;
        ga var20 = null;
        int var15 = TorChallenge.field_F ? 1 : 0;
        ga var14Lifetime1;
        ga var14Lifetime2;
        try {
          if (param1 != -22373) {
            eg var16 = (eg) null;
            this.a((eg) null, 22);
          }
          var18 = new bc(param0, 2, 2, 2236962, 1, 1, 1, 2 + param0.field_K + param0.field_x);
          this.field_q = (j) ((Object) var18);
          var18.field_k = 16777215;
          var4 = new ga();
          var18.a(param1 + 22255, var4);
          this.field_n = -1;
          this.field_r = 3;
          this.field_k = 3;
          var4.field_q = 11711154;
          this.field_p = 5592405;
          this.field_b = 15658734;
          var4.field_c = 15658734;
          this.field_h = 3;
          this.field_e = 15658734;
          this.field_t = param0;
          this.field_o = 3;
          var4.a(0, -27140).b(-764, 15658734).a((byte) -104, v.a(7829367, param1 + 22489, 8947848, 10066329));
          var4.a(1, -27140).a((byte) -27, v.a(13421772, 67, 11184810, 10066329));
          var4.a(3, param1 ^ 15719).a((byte) -62, v.a(10066329, param1 + 22463, 8947848, 7829367)).a(1, (byte) 118).a(1, param1 + 22373);
          var5 = new ka[9];
          var17 = new el(32, 32);
          var19 = var17;
          for (var7_int = 0; var19.field_y.length > var7_int; var7_int++) {
            var17.field_y[var7_int] = 1077952576;
          }
          var5[4] = (ka) ((Object) var19);
          var4.a(4, -27140).a(true, -1).a((byte) -120, var5);
          var4.a(5, param1 ^ 15719).a((byte) -124, bf.a(65793, (byte) 50, 0, 0, 0)).a(true, param1 + 22372).b(-764, -1);
          this.field_f = (j) ((Object) var4);
          var6 = new ga(var4, true);
          var6.field_e = 0;
          var7 = new ga(var4, true);
          var7.field_e = 0;
          var7.a((byte) 107, rj.a(39, 8947848));
          var7.a(1, -27140).a((byte) -76, rj.a(54, 11184810)).b(-764, 2236962);
          this.field_l = (j) ((Object) new mc(param0, 2, 2, 16777215, -1, 5, 5, 15, 15, 4473924));
          discarded$0 = new g(param0, 2, 2, 16777215, -1, 16777215, 16729156, 4473924);
          discarded$1 = new ph(param0, 16777215, -1, 125269879, 4473924, 3, 268435455);
          var8 = new ga();
          var18.a(param1 + 22245, var8);
          var8.a(0, -27140).a((byte) -57, v.a(10066329, 82, 15658734, 7829367)).b(-764, 1118481).b(-1, (byte) -113);
          var8.a(4, -27140).a(true, -1).a((byte) -74, var5);
          this.field_m = (j) ((Object) var8);
          var9 = new ka[9];
          var10 = new ka[9];
          var9[4] = new ka(2, 1);
          var10[4] = new ka(1, 2);
          dupTemp$2 = var9[4];
          dupTemp$2.field_y = new int[]{6710886, 7829367};
          var10[4].field_y = new int[]{6710886, 7829367};
          var11 = new ga();
          var12 = new ga();
          var11.a(var9, 0, 109);
          var12.a(var10, 0, 102);
          var13 = new ka(7, 4);
          var13.field_y = new int[]{8947848, 8947848, 8947848, 13421772, 8947848, 8947848, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772};
          var14 = new ga(var4, true);
          var14.a((byte) -42, var13.c());
          var13.f();
          var14Lifetime1 = new ga(var4, true);
          var14Lifetime1.a((byte) -127, var13.c());
          var13.f();
          var14Lifetime2 = new ga(var4, true);
          var14Lifetime2.a((byte) -121, var13.c());
          var13.f();
          var20 = new ga(var4, true);
          var20.a((byte) -123, var13);
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "dk.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static oe a(int param0, java.awt.Component param1, int param2, int param3) {
        try {
          Class var4 = null;
          Throwable var4_ref = null;
          RuntimeException var4_ref2 = null;
          oe var5 = null;
          dd var5_ref = null;
          int var6 = 0;
          oe stackIn_1_0 = null;
          dd stackIn_3_0 = null;
          RuntimeException stackIn_6_0 = null;
          StringBuilder stackIn_6_1 = null;
          String stackIn_7_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              var6 = -74 % ((param2 + 69) / 51);
              var4 = Class.forName("ke");
              var5 = (oe) (var4.newInstance());
              var5.a(param3, param1, param0, -23435);
              stackIn_1_0 = var5;
              return stackIn_1_0;
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4_ref = decompiledCaughtException;
              var5_ref = new dd();
              ((oe) ((Object) var5_ref)).a(param3, param1, param0, -23435);
              stackIn_3_0 = var5_ref;
              return (oe) ((Object) stackIn_3_0);
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_6_0 = var4_ref2;
            stackIn_6_1 = new StringBuilder().append("dk.C(").append(param0).append(',');
            if (param1 == null) {
              stackIn_7_2 = "null";
            } else {
              stackIn_7_2 = "{...}";
            }
            throw oj.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void b(int param0, String param1, int param2, int param3) {
        int var5_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        try {
          int var6 = -40 / ((-33 - param3) / 42);
          var5_int = this.field_t.a(param1);
          var7 = this.field_t.field_t + this.field_t.field_K;
          var8 = param0;
          if (6 + var8 + var5_int > qg.field_g) {
            var8 = -6 - var5_int + qg.field_g;
          }
          var9 = -this.field_t.field_t + (param2 + 32);
          if (!(6 + (var9 + var7) <= qg.field_f)) {
            var9 = -6 + (qg.field_f - var7);
          }
          qg.b(var8, var9, var5_int + 6, var7 + 6, this.field_b);
          qg.f(1 + var8, 1 + var9, var5_int + 4, 4 + var7, this.field_p);
          this.field_t.c(param1, var8 + 3, 3 + (var9 + this.field_t.field_t), this.field_b, -1);
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "dk.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    public dk() {
        this.field_j = true;
    }

    static {
        field_d = null;
        field_a = 0;
        field_g = "Creating a Jagex account is simple and free. Your account will remember your progress, highscores and achievements in every game. You can also use it to play some of our multiplayer games - and Jagex's other games!<br><br><col=2164A2>Please note - if you have a RuneScape account, you can click 'Go Back' and use your existing account to log in!</col>";
    }
}
