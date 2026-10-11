/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mn {
    static String field_f;
    static int field_c;
    static int field_e;
    static hl field_d;
    static String field_b;
    static int field_a;

    public static void a(int param0) {
        field_f = null;
        field_d = null;
        int var1 = -42 / ((param0 - 68) / 41);
        field_b = null;
    }

    final static void a(boolean param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        if (param1 != -1) {
          java.awt.Component var5 = (java.awt.Component) null;
          mn.a((java.awt.Component) null, true);
        }
        if (mm.field_y != null) {
          var3 = mm.field_y.a(param0, false);
          if (var3 != -2) {
            if (var3 != -1) {
              var4 = mm.field_y.d((byte) 121) ? 1 : 0;
              mk.a(-117, mm.field_y.e((byte) 26), var3, var4 != 0, mm.field_y.field_Ob, param2);
            }
            mm.field_y = null;
            gg.c((byte) 43);
          }
        }
    }

    final static nl[] a(ie param0, int param1) {
        int var5 = 0;
        nl[] stackIn_3_0 = null;
        nl[] stackIn_10_0 = null;
        nl[] stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int[] var3 = null;
        nl[] var4 = null;
        nl var6 = null;
        int var7 = 0;
        vl var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        var7 = TetraLink.field_J;
        try {
          if (!param0.a((byte) -84)) {
            stackIn_3_0 = new nl[]{};
            return stackIn_3_0;
          }
          var8 = param0.a(false);
          while (var8.field_d == 0) {
            tb.a(false, 10L);
          }
          if (var8.field_d == 2) {
            stackIn_10_0 = new nl[]{};
            return stackIn_10_0;
          }
          var10 = (int[]) (var8.field_f);
          var9 = var10;
          var3 = var9;
          var4 = new nl[var10.length >> 2];
          if (param1 != 37956674) {
            mn.a(-102);
          }
          for (var5 = 0; var5 < var4.length; var5++) {
            var6 = new nl();
            var4[var5] = var6;
            var6.field_k = var3[var5 << 2];
            var6.field_e = var3[(var5 << 2) + 1];
            var6.field_h = var3[(var5 << 2) + 2];
            var6.field_i = var3[(var5 << 2) + 3];
          }
          stackIn_17_0 = var4;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_20_0 = var2;
          stackIn_20_1 = new StringBuilder().append("mn.C(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(java.awt.Component param0, boolean param1) {
        if (!param1) {
          return;
        }
        try {
          param0.removeKeyListener(vi.field_a);
          param0.removeFocusListener(vi.field_a);
          mh.field_b = -1;
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "mn.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var12 = 0;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7Lifetime1;
        var14 = TetraLink.field_J;
        try {
          var6_int = 485 + param2 + 8 - (-2 - param1 - 8);
          ea.field_f.a((byte) -104, -6 + var6_int, 3, oj.field_a.field_R - 6, 3);
          var7 = -5 + ea.field_f.field_R;
          pj.field_d.a((byte) -109, param1 + param2 + 487, var7 - param3, param3, 5);
          in.field_g.a((byte) -112, -param2 + (pj.field_d.field_Hb - ba.field_L.field_Hb), 0, param3, param2);
          ba.field_L.a((byte) -96, ba.field_L.field_Hb, 0, param3, param2 + in.field_g.field_Hb);
          var7 = var7 - (2 + param3);
          id.field_M.a(485 + (param2 - (-2 - param1)), param1, var7 - 5, true, 5, 5, 2);
          if (null != bk.field_e) {
            bk.field_e.a(id.field_M.field_R, id.field_M.field_yb, -124, id.field_M.field_M, id.field_M.field_Hb);
          }
          var8 = -var6_int + oj.field_a.field_Hb - param2;
          var9 = var8 / 2;
          var10 = param4 + var9 + param2;
          var11 = 0;
          if (param0 != -7) {
            return;
          }
          for (var12 = 0; var12 < 6; var12++) {
            if (5 <= var12 ||
              null != nj.field_f[var12]) {
              var13 = 3 + (2 + oj.field_a.field_R - 6) * var11 / (v.field_r + 1);
              var11++;
              var7Lifetime1 = (-6 + (oj.field_a.field_R + 2)) * var11 / (v.field_r + 1) + 3 + (-2 - var13);
              if (var12 >= 5) {
                nc.field_e.a((byte) -88, var8, var13, var7Lifetime1, var6_int);
              } else {
                nj.field_f[var12].a((byte) -111, var8, var13, var7Lifetime1, var6_int);
                el.field_oc[var12].a((byte) -103, -param2 + var9, 0, var7Lifetime1, param2);
                fh.field_f[var12].a((byte) -93, param4, param5, -param5 + var7Lifetime1 - param5, var9);
                og.field_o[var12].a((byte) -108, -var10 - param2 + var8, param5, var7Lifetime1 - param5 - param5, var10);
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var6), "mn.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    static {
        field_f = "Message lobby";
        field_e = 5;
        field_b = "The game options are not all set.";
    }
}
