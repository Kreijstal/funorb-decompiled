/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class dk {
    static String[] field_c;
    int field_e;
    int[] field_l;
    static String field_f;
    static String field_i;
    static int[][] field_a;
    static String field_g;
    static int[] field_d;
    static String field_b;
    int field_m;
    static String field_h;
    java.awt.Image field_j;
    static kc field_k;

    final static void a(int param0) {
        ho.field_i = null;
        ph.field_c = null;
        be.field_d = null;
        jg.field_p = null;
        ln.field_I = (byte[][]) null;
        hl.field_l = null;
        if (param0 != -18229) {
          field_f = (String) null;
        }
    }

    final void a(boolean param0) {
        if (!param0) {
          field_k = (kc) null;
        }
        de.a(this.field_l, this.field_e, this.field_m);
    }

    abstract void a(int param0, java.awt.Graphics param1, int param2, int param3);

    final static void a(boolean param0, int param1) {
        if (param1 != 14067) {
          dk.b(true);
        }
        if (!bj.g(false)) {
          return;
        }
        if (param0) {
          de.e(0, 0, de.field_e, de.field_j, 0, 192);
        }
        pm.field_e.a(0, true, 0);
    }

    final static void a(String param0, byte param1, boolean param2, int param3, boolean param4) {
        String stackIn_4_0 = null;
        boolean stackIn_28_0 = false;
        int stackIn_42_0 = 0;
        int stackIn_43_1 = 0;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_49_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var7Lifetime1;
        int var9Lifetime1;
        int var8Lifetime1;
        int var8Lifetime2;
        var10 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          sb.field_a = true;
          i.field_d = param3;
          var11 = param0;
          if (!param2) {
            stackIn_4_0 = la.field_e;
          } else {
            stackIn_4_0 = ArcanistsMulti.field_H;
          }
          var6 = stackIn_4_0;
          if (0 == i.field_d) {
            var7 = hf.a(of.field_e, var11, 480, ob.field_T, 21230);
            var8 = var7 + 3;
            pm.field_f = new String[var8];
            ln.field_M = new int[var8];
            for (var9 = 0; var8 > var9; var9++) {
              ln.field_M[var9] = -1;
            }
            cf.field_c = new int[2];
            for (var9 = 0; var9 < var7; var9++) {
              pm.field_f[var9] = of.field_e[var9];
            }
            pm.field_f[-3 + var8] = "";
            pm.field_f[var8 - 2] = var6;
            ln.field_M[var8 - 2] = 0;
            cf.field_c[0] = 1;
            pm.field_f[var8 - 1] = dd.field_e;
            ln.field_M[var8 - 1] = 1;
            cf.field_c[1] = 2;
          } else {
            if (1 != i.field_d) {
              throw new IllegalArgumentException();
            }
            var7 = hf.a(of.field_e, var11, 480, ob.field_T, 21230);
            var8 = var7 + 2;
            ln.field_M = new int[var8];
            pm.field_f = new String[var8];
            for (var9 = 0; var8 > var9; var9++) {
              ln.field_M[var9] = -1;
            }
            cf.field_c = new int[1];
            for (var9 = 0; var7 > var9; var9++) {
              pm.field_f[var9] = of.field_e[var9];
            }
            pm.field_f[-2 + var8] = "";
            pm.field_f[var8 - 1] = dd.field_e;
            ln.field_M[-1 + var8] = 0;
            cf.field_c[0] = 2;
          }
          wl.field_S.field_f = cf.field_c.length;
          var7Lifetime1 = 0;
          for (var8Lifetime1 = 0; pm.field_f.length > var8Lifetime1; var8Lifetime1++) {
            stackIn_28_0 = !(ln.field_M[var8Lifetime1] < 0);
            var9Lifetime1 = lc.a(stackIn_28_0, pm.field_f[var8Lifetime1], (byte) -94);
            if (-1 != ln.field_M[var8Lifetime1]) {
              var9Lifetime1 = var9Lifetime1 + 2 * f.field_h;
            }
            if (var9Lifetime1 > var7Lifetime1) {
              var7Lifetime1 = var9Lifetime1;
            }
          }
          bk.field_I = -(var7Lifetime1 >> 1) + af.field_Eb;
          ih.field_b = (uk.field_d + ic.field_a << 1) * wl.field_S.field_f;
          bj.field_tb = -(var7Lifetime1 >> 1) + af.field_Eb + var7Lifetime1;
          if (param1 >= -37) {
            return;
          }
          for (var8Lifetime2 = 0; var8Lifetime2 < pm.field_f.length; var8Lifetime2++) {
            stackIn_42_0 = ih.field_b;
            if (ln.field_M[var8Lifetime2] < 0) {
              stackIn_43_1 = u.field_l;
            } else {
              stackIn_43_1 = tm.field_b;
            }
            ih.field_b = stackIn_42_0 + stackIn_43_1;
          }
          qe.field_o = ub.field_g - (ih.field_b >> 1);
          wl.field_S.a(param4, 0, false, ao.a(31128, an.field_g, me.field_I));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_48_0 = var5;
          stackIn_48_1 = new StringBuilder().append("dk.G(");
          if (param0 == null) {
            stackIn_49_2 = "null";
          } else {
            stackIn_49_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_48_0), ((StringBuilder) (Object) stackIn_48_1).append(stackIn_49_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void b(boolean param0) {
        field_b = null;
        field_i = null;
        field_k = null;
        field_f = null;
        field_h = null;
        field_d = null;
        field_a = (int[][]) null;
        if (param0) {
          return;
        }
        field_c = null;
        field_g = null;
    }

    abstract void a(int param0, java.awt.Component param1, int param2, int param3);

    static {
        field_i = "You are invited to <%0>'s game.";
        field_d = new int[128];
        field_g = " wands";
        field_f = "Increases the potency of Thorn Bombs, Vine Bombs and Elves";
        field_h = "Average rating";
        field_b = "ESC - cancel private message";
    }
}
