/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class fh {
    static String field_b;
    int field_f;
    java.awt.Image field_a;
    int[] field_d;
    static boolean field_c;
    int field_e;

    final void a(int param0) {
        if (param0 == -40) {
          ul.a(this.field_d, this.field_e, this.field_f);
          return;
        }
        this.field_e = -67;
        ul.a(this.field_d, this.field_e, this.field_f);
    }

    final static gj a(int param0, int param1, int param2, int param3, byte param4) {
        gj var5;
        int var6;
        int var7;
        gj var8;
        gj var5Lifetime1;
        var7 = OrbDefence.field_D ? 1 : 0;
        var5 = (gj) (cb.field_b.b((byte) -106));
        while (var5 != null) {
          if (var5.field_o == param2) {
            return var5;
          }
          var5 = (gj) (cb.field_b.d(853));
        }
        var8 = new gj();
        var5Lifetime1 = var8;
        var8.field_o = param2;
        var6 = 102 / ((41 - param4) / 45);
        var5Lifetime1.field_m = param3;
        var5Lifetime1.field_n = param0;
        cb.field_b.a(-92, var5Lifetime1);
        se.a(var5Lifetime1, param1, -38);
        return var5Lifetime1;
    }

    final static void a(int param0, int param1) {
        try {
          Throwable decompiledCaughtException = null;
          Throwable var2 = null;
          try {
            if (param0 != 17489) {
              return;
            }
            gm.a(true, "resizing", new Object[]{new Integer(param1)}, uj.b((byte) -120));
          } catch (java.lang.Throwable decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2 = decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    abstract void a(int param0, int param1, java.awt.Graphics param2, boolean param3);

    public static void a(byte param0) {
        field_b = null;
        if (param0 > -26) {
          field_c = true;
        }
    }

    final static void a(ki param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        wd var5 = null;
        int[] var6 = null;
        int var7 = 0;
        se var8 = null;
        int var9 = 0;
        se var10 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var4Lifetime1;
        var7 = OrbDefence.field_D ? 1 : 0;
        try {
          var8 = new se(param0.a("", 1, "logo.fo3d"));
          var10 = var8;
          var3 = var10.b((byte) 90);
          var10.n(9471);
          cg.field_c = mc.a(12, var10);
          if (param1 != -237) {
            fh.a((byte) -39);
          }
          tc.field_a = new wd[var3];
          ne.field_a = new int[var3][];
          for (var4 = 0; var3 > var4; var4++) {
            tc.field_a[var4] = f.a(var8, 16);
          }
          var10.m(param1 ^ -236);
          var9 = 0;
          var4Lifetime1 = var9;
          while (var3 > var9) {
            var5 = tc.field_a[var9];
            var5.a(3940, 6, 6, 6, 1);
            var5.a(2);
            var6 = new int[]{var5.field_d + var5.field_P >> 1, var5.field_J + var5.field_F >> 1, var5.field_v + var5.field_z >> 1};
            ne.field_a[var9] = var6;
            var5.a((byte) 7, -var6[1], -var6[2], -var6[0]);
            var9++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_12_0 = var2;
          stackIn_12_1 = new StringBuilder().append("fh.I(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    abstract void a(int param0, int param1, int param2, java.awt.Component param3);

    final static void a(byte param0, int param1, boolean param2, int param3) {
        int var4 = 0;
        bl.field_n.c(param3, param1);
        if (param0 != 8) {
          ki var5 = (ki) null;
          fh.a((ki) null, 88);
        }
        if (param2) {
          var4 = 2 * (le.field_c % bl.field_n.field_o);
          if (bl.field_n.field_o <= var4) {
            var4 = -var4 + bl.field_n.field_o + bl.field_n.field_o;
          }
          if (10 > var4) {
            var4 = 10;
            hb.a(0, var4, 0, 80, param0 ^ -9, param3, 30, param1, bl.field_n);
            return;
          }
          if (-40 + bl.field_n.field_o < var4) {
            var4 = -40 + bl.field_n.field_o;
            hb.a(0, var4, 0, 80, param0 ^ -9, param3, 30, param1, bl.field_n);
            return;
          }
          hb.a(0, var4, 0, 80, param0 ^ -9, param3, 30, param1, bl.field_n);
          return;
        }
    }

    final static hj[] a(ki param0, int param1, byte param2, int param3) {
        RuntimeException var4 = null;
        ki var5 = null;
        Object stackIn_4_0 = null;
        hj[] stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 > -74) {
            var5 = (ki) null;
            fh.a((ki) null, -76, (byte) -18, -119);
          }
          if (pk.a(-128, param3, param0, param1)) {
            stackIn_6_0 = lm.a(-127);
            return stackIn_6_0;
          }
          stackIn_4_0 = null;
          return (hj[]) (stackIn_4_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("fh.G(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_b = "You are not currently logged in to the<nbsp>game.";
        field_c = true;
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static void $cfr$intArgs$a$a1440e9a5aa4(int param0, int param1, boolean param2, int param3) {
        int var4 = 0;
        bl.field_n.c(param3, param1);
        if (param0 != 8) {
          ki var5 = (ki) null;
          fh.a((ki) null, 88);
        }
        if (param2) {
          var4 = 2 * (le.field_c % bl.field_n.field_o);
          if (bl.field_n.field_o <= var4) {
            var4 = -var4 + bl.field_n.field_o + bl.field_n.field_o;
          }
          if (10 > var4) {
            var4 = 10;
            hb.a(0, var4, 0, 80, param0 ^ -9, param3, 30, param1, bl.field_n);
            return;
          }
          if (-40 + bl.field_n.field_o < var4) {
            var4 = -40 + bl.field_n.field_o;
            hb.a(0, var4, 0, 80, param0 ^ -9, param3, 30, param1, bl.field_n);
            return;
          }
          hb.a(0, var4, 0, 80, param0 ^ -9, param3, 30, param1, bl.field_n);
          return;
        }
    }
}
