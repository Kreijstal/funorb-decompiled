/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class n {
    static String field_c;
    private int[] field_f;
    static ri field_b;
    static String field_h;
    static int field_a;
    static kc field_g;
    static oc field_d;
    static String field_e;

    public static void a(int param0) {
        field_b = null;
        field_h = null;
        field_c = null;
        if (param0 == 8577) {
          field_g = null;
          field_e = null;
          field_d = null;
          return;
        }
        java.awt.Canvas var2 = (java.awt.Canvas) null;
        n.a((java.awt.Canvas) null, (byte) -117);
        field_g = null;
        field_e = null;
        field_d = null;
    }

    final static void a(java.awt.Canvas param0, byte param1) {
        hg.a(1, (java.awt.Component) ((Object) param0));
        if (param1 < 115) {
          return;
        }
        try {
          no.a((java.awt.Component) ((Object) param0), 0);
          if (null != nh.field_w) {
            nh.field_w.a(-15238, (java.awt.Component) ((Object) param0));
          }
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "n.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(int param0, int param1, int param2) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var6Lifetime1;
        int var6Lifetime2;
        int var7Lifetime1;
        int var7Lifetime2;
        int var7Lifetime3;
        int var7Lifetime4;
        int var7Lifetime5;
        int var7Lifetime6;
        int var6Lifetime3;
        int var7Lifetime7;
        int var7Lifetime3Lifetime1;
        var8 = ArcanistsMulti.field_G ? 1 : 0;
        if (0 > gi.field_a) {
          return;
        }
        var3 = -135 + param0;
        var4 = param1 - 35;
        var5 = 256;
        if (gi.field_a < 75) {
          var5 = (gi.field_a << 8) / 75;
        }
        if (gi.field_a > 200) {
          var5 = (-gi.field_a + 250 << 8) / 50;
        }
        fk.a(rc.field_h, -23095);
        id.a();
        de.b();
        cg.f(252566882);
        if (var5 < 256) {
          de.e(0, 0, de.field_e, de.field_j, 0, -var5 + 256);
        }
        oo.c(-15405);
        if (gi.field_a < 150) {
          rc.field_h.b(var3, var4);
          var6 = -125 + gi.field_a;
          if (param2 != 1) {
            return;
          }
          if (0 < var6 &&
            var6 < 50) {
            if (var6 < 20) {
              var7 = 256 * var6 / 20;
              gi.field_k.b(var3, var4, var7);
            } else {
              if (30 > var6) {
                gi.field_k.b(var3, var4, 256);
              } else {
                var7 = (50 - var6) * 256 / 20;
                gi.field_k.b(var3, var4, var7);
              }
            }
          }
          var6Lifetime3 = gi.field_a - 140;
          if (var6Lifetime3 > 0) {
            var7Lifetime7 = 256;
            if (20 > var6Lifetime3) {
              var7Lifetime7 = 256 * var6Lifetime3 / 20;
            }
            gm.field_l.c(var3 + 15, var4 + 10, var5 * var7Lifetime7 >> 8);
          }
          return;
        }
        mi.field_E.c(15 + var3, var4 + 10, var5);
        var6Lifetime1 = -125 + gi.field_a;
        if (param2 != 1) {
          return;
        }
        if (0 >= var6Lifetime1) {
          var6Lifetime1 = gi.field_a - 140;
          if (var6Lifetime1 > 0) {
            var7Lifetime1 = 256;
            if (20 > var6Lifetime1) {
              var7Lifetime1 = 256 * var6Lifetime1 / 20;
            }
            gm.field_l.c(var3 + 15, var4 + 10, var5 * var7Lifetime1 >> 8);
          }
          return;
        }
        if (var6Lifetime1 >= 50) {
          var6Lifetime1 = gi.field_a - 140;
          if (var6Lifetime1 > 0) {
            var7Lifetime2 = 256;
            if (20 > var6Lifetime1) {
              var7Lifetime2 = 256 * var6Lifetime1 / 20;
            }
            gm.field_l.c(var3 + 15, var4 + 10, var5 * var7Lifetime2 >> 8);
          }
          return;
        }
        if (var6Lifetime1 < 20) {
          var7Lifetime3 = 256 * var6Lifetime1 / 20;
          gi.field_k.b(var3, var4, var7Lifetime3);
          var6Lifetime1 = gi.field_a - 140;
          if (var6Lifetime1 > 0) {
            var7Lifetime3Lifetime1 = 256;
            if (20 > var6Lifetime1) {
              var7Lifetime3Lifetime1 = 256 * var6Lifetime1 / 20;
            }
            gm.field_l.c(var3 + 15, var4 + 10, var5 * var7Lifetime3Lifetime1 >> 8);
          }
          return;
        }
        if (30 > var6Lifetime1) {
          gi.field_k.b(var3, var4, 256);
          var6Lifetime1 = gi.field_a - 140;
          if (var6Lifetime1 > 0) {
            var7Lifetime4 = 256;
            if (20 > var6Lifetime1) {
              var7Lifetime4 = 256 * var6Lifetime1 / 20;
            }
            gm.field_l.c(var3 + 15, var4 + 10, var5 * var7Lifetime4 >> 8);
          }
          return;
        }
        var7Lifetime5 = (50 - var6Lifetime1) * 256 / 20;
        gi.field_k.b(var3, var4, var7Lifetime5);
        var6Lifetime2 = gi.field_a - 140;
        if (var6Lifetime2 > 0) {
          var7Lifetime6 = 256;
          if (20 > var6Lifetime2) {
            var7Lifetime6 = 256 * var6Lifetime2 / 20;
          }
          gm.field_l.c(var3 + 15, var4 + 10, var5 * var7Lifetime6 >> 8);
        }
        return;
    }

    final int a(int param0, int param1) {
        int var3;
        int var4;
        int var5;
        if (param1 != -140) {
          return -4;
        }
        var3 = (this.field_f.length >> 1) - 1;
        var4 = param0 & var3;
        while (true) {
          var5 = this.field_f[1 + var4 + var4];
          if (var5 == -1) {
            return -1;
          }
          if (param0 == this.field_f[var4 + var4]) {
            return var5;
          }
          var4 = var4 + 1 & var3;
        }
    }

    n(int[] param0) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3Lifetime1;
        try {
          var2_int = 1;
          while ((param0.length >> 1) + param0.length >= var2_int) {
            var2_int = var2_int << 1;
          }
          this.field_f = new int[var2_int + var2_int];
          for (var3 = 0; var2_int + var2_int > var3; var3++) {
            this.field_f[var3] = -1;
          }
          for (var3Lifetime1 = 0; param0.length > var3Lifetime1; var3Lifetime1++) {
            var4 = param0[var3Lifetime1] & var2_int - 1;
            while (this.field_f[1 + (var4 + var4)] != -1) {
              var4 = 1 + var4 & var2_int - 1;
            }
            this.field_f[var4 + var4] = param0[var3Lifetime1];
            this.field_f[1 + var4 + var4] = var3Lifetime1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("n.<init>(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    static {
        field_c = "RuneScape clan";
        field_h = "Unrated game";
        field_b = new ri();
        field_d = new oc();
        field_e = "Game interface:";
    }
}
