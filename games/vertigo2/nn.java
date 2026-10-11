/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nn extends li {
    int field_u;
    int[] field_n;
    static tj field_w;
    int field_r;
    int field_o;
    int field_v;
    static String[] field_t;
    int field_x;
    static r field_y;
    static String field_p;
    int field_q;
    static int[] field_s;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7Lifetime1;
        var14 = Vertigo2.field_L ? 1 : 0;
        try {
          var6_int = param3 + (2 + (485 + (param1 + 8))) + 8;
          ad.field_f.a(89, var6_int - 6, -6 + td.field_c.field_db, 3, 3);
          var7 = -5 + ad.field_f.field_db;
          bp.field_C.a(94, 485 + param1 + (2 + param3), param2, var7 - param2, 5);
          dj.field_d.a(115, -param1 + bp.field_C.field_Fb - ui.field_b.field_Fb, param2, 0, param1);
          var7 = var7 - (2 + param2);
          ui.field_b.a(82, ui.field_b.field_Fb, param2, 0, param1 + dj.field_d.field_Fb);
          mg.field_R.a(5, 2, param3, var7 - 5, 5, param1 + 485 + (2 + param3), param0 ^ 3125);
          if (null != lq.field_a) {
            lq.field_a.a(false, mg.field_R.field_wb, mg.field_R.field_N, mg.field_R.field_db, mg.field_R.field_Fb);
          }
          var8 = -param1 + (td.field_c.field_Fb - var6_int);
          var9 = var8 / 2;
          var10 = param4 + var9 + param1;
          var11 = 0;
          var12 = 0;
          if (param0 != 1) {
            field_s = (int[]) null;
          }
          while (var12 < 6) {
            if (var12 >= 5 ||
              hl.field_q[var12] != null) {
              var13 = var11 * (td.field_c.field_db - 6 + 2) / (1 + sd.field_L) + 3;
              var11++;
              var7Lifetime1 = -var13 + (var11 * (td.field_c.field_db - 6 + 2) / (1 + sd.field_L) + 3) - 2;
              if (var12 >= 5) {
                ea.field_c.a(param0 + 95, var8, var7Lifetime1, var13, var6_int);
              } else {
                hl.field_q[var12].a(112, var8, var7Lifetime1, var13, var6_int);
                gh.field_d[var12].a(126, -param1 + var9, var7Lifetime1, 0, param1);
                w.field_C[var12].a(78, param4, -param5 + var7Lifetime1 - param5, param5, var9);
                mg.field_M[var12].a(param0 ^ 91, -param1 + (var8 - var10), -param5 - param5 + var7Lifetime1, param5, var10);
              }
            }
            var12++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var6), "nn.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void a(int param0) {
        field_s = null;
        field_t = null;
        if (param0 != 5) {
          return;
        }
        field_y = null;
        field_p = null;
        field_w = null;
    }

    final void a(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6, int param7) {
        try {
          this.field_u = param3;
          this.field_q = param0;
          this.field_r = param7;
          if (param5 != -550) {
            field_y = (r) null;
          }
          this.field_x = param2;
          this.field_v = param1;
          this.field_o = param6;
          this.field_n = param4;
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "nn.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final static lk a(int param0, java.awt.Component param1, boolean param2, int param3) {
        try {
          Class var4 = null;
          Throwable var4_ref = null;
          RuntimeException var4_ref2 = null;
          lk var5 = null;
          ma var5_ref = null;
          lk stackIn_3_0 = null;
          ma stackIn_5_0 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              if (!param2) {
                nn.a(-77);
              }
              var4 = Class.forName("em");
              var5 = (lk) (var4.newInstance());
              var5.a(param1, -3, param3, param0);
              stackIn_3_0 = var5;
              return stackIn_3_0;
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4_ref = decompiledCaughtException;
              var5_ref = new ma();
              ((lk) ((Object) var5_ref)).a(param1, -3, param3, param0);
              stackIn_5_0 = var5_ref;
              return (lk) ((Object) stackIn_5_0);
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var4_ref2;
            stackIn_8_1 = new StringBuilder().append("nn.C(").append(param0).append(',');
            if (param1 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw wn.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',').append(param3).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    nn() {
    }

    static {
        field_t = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
        field_w = new tj();
        field_p = "Next";
        field_s = new int[]{60, 60, 60, 90, 90, 90, 90, 90, 90, 105, 105, 60, 90, 90, 90, 105, 105, 90, 105, 105, 90, 90, 90, 120, 90, 105, 105, 90, 90, 90, 105, 105, 90, 90, 90, 90, 105, 105, 105, 90};
    }
}
