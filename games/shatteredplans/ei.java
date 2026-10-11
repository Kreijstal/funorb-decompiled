/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ei {
    static int[] field_g;
    static String field_b;
    static int[] field_d;
    static int field_e;
    static String[][] field_f;
    static java.applet.Applet field_c;
    static bi field_a;

    final static void a(int param0, fb param1) {
        fb var2 = null;
        int var3 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          param1.b((byte) -86);
          var2 = (fb) (kj.field_a.d(param0));
          while (var2 != null) {
            if (var2.a(param1, -1)) {
              var2 = (fb) (kj.field_a.a((byte) -71));
              continue;
            }
            break;
          }
          if (var2 != null) {
            stackIn_8_0 = -123;
            wp.$cfr$intArgs$a$2661ebe01e52(stackIn_8_0, param1, var2);
          } else {
            kj.field_a.a((byte) -113, param1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_12_0 = var2_ref;
          stackIn_12_1 = new StringBuilder().append("ei.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static void a(byte param0, nf param1) {
        int dupTemp$3 = 0;
        int dupTemp$0 = 0;
        int var3 = 0;
        int incrementValue$2 = 0;
        int fieldTemp$1 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        int var2_intLifetime1;
        int var2_intLifetime2;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var2_int = 0;
          if (param0 < 35) {
            return;
          }
          while (var2_int < 3) {
            im.field_b[var2_int] = 0;
            var2_int++;
          }
          for (var2_intLifetime1 = 0; var2_intLifetime1 < da.field_g; var2_intLifetime1++) {
            if (wm.field_d[var2_intLifetime1].field_n == param1.field_n) {
              dupTemp$3 = wm.field_d[var2_intLifetime1].a((byte) 115);
              im.field_b[dupTemp$3] = im.field_b[dupTemp$3] + 1;
            }
          }
          dupTemp$0 = param1.a((byte) 113);
          im.field_b[dupTemp$0] = im.field_b[dupTemp$0] + 1;
          var2_intLifetime2 = 0;
          for (var3 = 0; var3 < da.field_g; var3++) {
            boolean decompiledFrameRemainder0 = true;
            if (wm.field_d[var3].field_n == param1.field_n) {
              var4 = wm.field_d[var3].a((byte) 115);
              if (kp.field_i < im.field_b[var4]) {
                im.field_b[var4] = im.field_b[var4] - 1;
                decompiledFrameRemainder0 = false;
              }
            }
            if (decompiledFrameRemainder0) {
              incrementValue$2 = var2_intLifetime2;
              var2_intLifetime2++;
              wm.field_d[incrementValue$2] = wm.field_d[var3];
            }
          }
          da.field_g = var2_intLifetime2;
          fieldTemp$1 = da.field_g;
          da.field_g = da.field_g + 1;
          wm.field_d[fieldTemp$1] = param1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_22_0 = var2;
          stackIn_22_1 = new StringBuilder().append("ei.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, byte[] param2, boolean param3, boolean param4, int param5) {
        sl var10 = null;
        int var7 = 0;
        int var8 = 0;
        try {
          var10 = js.field_f;
          var10.h(param0, 255);
          var10.field_j = var10.field_j + 1;
          var7 = var10.field_j;
          var10.c(4, (byte) -106);
          if (param4) {
            fb var9 = (fb) null;
            ei.a(-47, (fb) null);
          }
          var10.c(param1, (byte) -122);
          var8 = param5;
          if (param3) {
            var8 += 128;
          }
          var10.c(var8, (byte) -56);
          var10.a(0, param2.length, param2, 22186);
          var10.b(-var7 + var10.field_j, (byte) 127);
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "ei.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static void a(boolean param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var11 = 0;
        int[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var12 = 0;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        int var8Lifetime1;
        int var9Lifetime1;
        var12 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param2 > 20 &&
            param1 > 20) {
            var15 = new int[4];
            var14 = var15;
            var13 = var14;
            var7 = var13;
            gf.a(var15);
            gf.a(param5, param4, param2, param1, 10, 0, 200);
            am.a(-10 + param2, param6, param3 ^ 12362, -10 + param1, param5, param4);
            gf.f(param5 + 10, param4, param2 - 20, 2052949);
            gf.f(10 + param5, param4 + param1, param2 - 20, 0);
            gf.i(param5, param4, param5 + 10, 10 + param4);
            gf.b(param5 + 10, 10 + param4, 10, 2052949);
            gf.b(var15);
            gf.i(-10 + param2 + param5, param4, param5 + param2, param4 + 10);
            gf.b(-11 + (param5 + param2), 10 + param4, 10, 2052949);
            gf.b(var15);
            if (param3 != -12394) {
              return;
            }
            gf.i(param5, param4 + (param1 - 10), 10 + param5, param4 + param1);
            gf.b(param5 + 10, -10 + param1 + param4 - 1, 10, 0);
            gf.b(var15);
            gf.i(param5 + param2 - 10, -10 + param1 + param4, param5 + param2, param1 + param4);
            gf.b(param2 + param5 - 10 - 1, param1 + param4 - 11, 10, 0);
            gf.b(var15);
            for (var8 = 0; var8 < param1 - 20; var8++) {
              var9 = ui.a(2052949, 0, -110, var8 * 256 / (param1 - 20));
              gf.a(param5, 10 + param4 + var8, var9);
              gf.a(param2 + (param5 - 1), var8 + (10 + param4), var9);
            }
            if (param0) {
              jl.field_W.c(param5 + 4, param4 + 3, 256);
              var8Lifetime1 = param5 + 4 + jl.field_W.field_z;
              var9Lifetime1 = param5 + param2 - 3 - mr.field_g.field_z;
              mr.field_g.c(var9Lifetime1, 3 + param4, 64);
              for (var11 = var8Lifetime1; var11 < var9Lifetime1; var11++) {
                var10 = 192 * (var9Lifetime1 - var11) / (-var8Lifetime1 + var9Lifetime1) + 64;
                me.field_h.c(var11, 3 + param4, var10);
              }
              return;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var7_ref), "ei.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    public static void a(byte param0) {
        field_f = (String[][]) null;
        field_b = null;
        if (param0 >= -67) {
          field_e = -49;
        }
        field_g = null;
        field_a = null;
        field_d = null;
        field_c = null;
    }

    final static int a(int param0) {
        if (ma.field_p < 2) {
          return 0;
        }
        if (0 == ai.field_e) {
          if (!rq.field_g.b((byte) 122)) {
            return 20;
          }
          if (!rq.field_g.a("commonui", 60)) {
            return 40;
          }
          if (!tq.field_f.b((byte) -109)) {
            return 50;
          }
          if (!tq.field_f.a("commonui", -112)) {
            return 60;
          }
          if (!l.field_g.b((byte) -85)) {
            return 70;
          }
          if (!l.field_g.a(param0 - 83)) {
            return 80;
          }
        } else {
          if (es.field_j != null) {
            if (!es.field_j.b((byte) -122)) {
              return 14;
            }
            if (!es.field_j.b("", (byte) -122)) {
              return 29;
            }
            if (!es.field_j.a("", -70)) {
              return 29;
            }
          }
          if (!rq.field_g.b((byte) 125)) {
            return 43;
          }
          if (!rq.field_g.a("commonui", 127)) {
            return 57;
          }
          if (!tq.field_f.b((byte) -90)) {
            return 71;
          }
          if (!tq.field_f.a("commonui", -105)) {
            return 80;
          }
          if (!l.field_g.b((byte) -95)) {
            return 82;
          }
          if (!l.field_g.a(-1)) {
            return 86;
          }
        }
        if (param0 == 82) {
          return 100;
        }
        return 4;
    }

    static {
        field_b = "You have been removed from <%0>'s game.";
        field_g = new int[]{100, 100, 200, 200, 300, 100, 300, 200, 200, 200, 300, 300, 100, 300, 500, 500, 500, 500, 300, 500, 300, 500, 100, 100, 500};
    }
}
