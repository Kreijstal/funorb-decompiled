/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gk {
    static boolean field_a;
    static long field_h;
    private uh field_e;
    static String field_g;
    static String field_c;
    private pf field_b;
    private pf field_d;
    private uh field_f;

    final ud a(byte param0, int param1, int param2) {
        int var4 = -50 % ((param0 + 10) / 50);
        return this.a(param1, param2, (int[]) null, 1);
    }

    final static void a(boolean param0) {
        if (param0) {
          field_h = 59L;
        }
    }

    final static int a(int param0, boolean param1, am param2, String param3, int param4, am param5, boolean param6) {
        int var12 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        ka stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        String stackIn_15_2 = null;
        ka stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        String stackIn_18_2 = null;
        int stackIn_33_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_66_0 = 0;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_70_2 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_73_2 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_76_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        String var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        int var10 = 0;
        String var11_ref_String = null;
        int var11 = 0;
        int var13 = 0;
        String var14 = null;
        CharSequence var15 = null;
        String var11_ref_StringLifetime1;
        String var11_ref_StringLifetime2;
        String var11_ref_StringLifetime3;
        String var11_ref_StringLifetime4;
        int var10Lifetime1;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        var13 = stellarshard.field_B;
        try {
          if (param6) {
            stackIn_3_0 = 110;
            return stackIn_3_0;
          }
          var14 = param2.a((byte) 125);
          var11_ref_String = var14;
          var11_ref_StringLifetime1 = var14;
          var8 = param5.a((byte) -22);
          var11_ref_StringLifetime2 = var8;
          var11_ref_StringLifetime3 = var8;
          if (null == ob.field_b &&
            !nh.a(-1, false)) {
            stackIn_8_0 = -1;
            return stackIn_8_0;
          }
          if (sl.field_d == oa.field_C) {
            pg.field_fb.field_k = 0;
            nb.field_M = null;
            if (param3 != null) {
              var9 = 0;
              if (param1) {
                var9 = var9 | 1;
              }
              uc.field_c.field_k = 0;
              uc.field_c.b(0, pl.field_P.nextInt());
              uc.field_c.b(0, pl.field_P.nextInt());
              uc.field_c.a(-104, var14);
              uc.field_c.a(-106, var8);
              var15 = (CharSequence) ((Object) param3);
              uc.field_c.a(-117, gg.a(var15, param6));
              uc.field_c.c(param0, -127);
              uc.field_c.a(false, param4);
              uc.field_c.a(false, var9);
              pg.field_fb.a(false, 18);
              pg.field_fb.field_k = pg.field_fb.field_k + 2;
              var10 = pg.field_fb.field_k;
              var11_ref_StringLifetime4 = dd.a(0, hf.a((byte) -118));
              if (var11_ref_StringLifetime4 == null) {
                var11_ref_StringLifetime4 = "";
              }
              pg.field_fb.b(var11_ref_StringLifetime4, -9799);
              ha.a(fj.field_l, pg.field_fb, uc.field_c, -105, u.field_o);
              pg.field_fb.d(-1, -var10 + pg.field_fb.field_k);
            } else {
              uc.field_c.field_k = 0;
              uc.field_c.b(0, pl.field_P.nextInt());
              uc.field_c.b(0, pl.field_P.nextInt());
              stackIn_14_0 = uc.field_c;
              stackIn_14_1 = 96;
              if (!param2.a(5)) {
                stackIn_15_2 = "";
              } else {
                stackIn_15_2 = var14;
              }
              ((ka) (Object) stackIn_14_0).a(stackIn_14_1, stackIn_15_2);
              stackIn_17_0 = uc.field_c;
              stackIn_17_1 = 126;
              if (!param5.a(5)) {
                stackIn_18_2 = "";
              } else {
                stackIn_18_2 = var8;
              }
              ((ka) (Object) stackIn_17_0).a(stackIn_17_1, stackIn_18_2);
              pg.field_fb.a(false, 16);
              pg.field_fb.field_k = pg.field_fb.field_k + 1;
              var9 = pg.field_fb.field_k;
              ha.a(fj.field_l, pg.field_fb, uc.field_c, -121, u.field_o);
              pg.field_fb.a(pg.field_fb.field_k - var9, (byte) -94);
            }
            ue.a((byte) -108, -1);
            sl.field_d = i.field_d;
          }
          if (sl.field_d == i.field_d &&
            qe.b(64, 1)) {
            var9Lifetime1 = ae.field_N.f(4);
            ae.field_N.field_k = 0;
            if (var9Lifetime1 >= 100 &&
              105 >= var9Lifetime1) {
              fc.field_b = new String[-100 + var9Lifetime1];
              sl.field_d = stellarshard.field_E;
            } else {
              if (var9Lifetime1 == 248) {
                aa.a(hf.a((byte) -64), false);
                ga.field_a = pg.field_eb;
                oj.c(-2290);
                ta.field_u = false;
                stackIn_33_0 = var9Lifetime1;
                return stackIn_33_0;
              }
              if (var9Lifetime1 == 99) {
                qe.b(64, ug.b(1));
                nb.field_M = new Boolean(h.a(ae.field_N, 31184));
                ae.field_N.field_k = 0;
              } else {
                sl.field_d = bg.field_c;
                ja.field_t = var9Lifetime1;
                ue.field_b = -1;
              }
            }
          }
          if (sl.field_d == stellarshard.field_E) {
            var9Lifetime2 = 2;
            if (qe.b(64, var9Lifetime2)) {
              var10Lifetime1 = ae.field_N.c((byte) 74);
              ae.field_N.field_k = 0;
              if (qe.b(64, var10Lifetime1)) {
                var11 = fc.field_b.length;
                for (var12 = 0; var12 < var11; var12++) {
                  fc.field_b[var12] = ae.field_N.f((byte) 94);
                }
                oj.c(-2290);
                ta.field_u = false;
                stackIn_45_0 = var11 + 100;
                return stackIn_45_0;
              }
            }
          }
          if (sl.field_d == bg.field_c &&
            cd.e((byte) 123)) {
            if (ja.field_t == 255) {
              var9_ref_String = ae.field_N.a(0);
              if (var9_ref_String != null) {
                dj.a(false, hf.a((byte) -101), var9_ref_String);
              }
            } else {
              ga.field_a = ae.field_N.e((byte) 96);
            }
            oj.c(-2290);
            ta.field_u = false;
            stackIn_55_0 = ja.field_t;
            return stackIn_55_0;
          }
          if (null == ob.field_b) {
            if (ta.field_u) {
              if (tk.b(127) > 30000L) {
                ga.field_a = hj.field_a;
              } else {
                ga.field_a = wb.field_h;
              }
              ta.field_u = false;
              stackIn_63_0 = 249;
              return stackIn_63_0;
            }
            var9Lifetime3 = ue.field_d;
            ue.field_d = wd.field_a;
            ta.field_u = true;
            wd.field_a = var9Lifetime3;
          }
          stackIn_66_0 = -1;
          return stackIn_66_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_69_0 = var7;
          stackIn_69_1 = new StringBuilder().append("gk.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_70_2 = "null";
          } else {
            stackIn_70_2 = "{...}";
          }
          stackIn_72_1 = ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(',');
          if (param3 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          stackIn_75_1 = ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_76_2 = "null";
          } else {
            stackIn_76_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_69_0), ((StringBuilder) (Object) stackIn_75_1).append(stackIn_76_2).append(',').append(param6).append(')').toString());
        }
    }

    private final ud a(int param0, int[] param1, int param2, int param3) {
        ud discarded$1 = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        ud var8 = null;
        kj var9 = null;
        int[] var10 = null;
        ud var11 = null;
        ud stackIn_2_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_11_0 = null;
        ud stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        ud var8Lifetime1;
        try {
          var5_int = ((param0 & -2147479553) << 4 | param0 >>> 12) ^ param3;
          var5_int = var5_int | param0 << 16;
          var6 = (long)var5_int;
          var8 = (ud) (this.field_f.a(var6, 74));
          if (var8 != null) {
            stackIn_2_0 = var8;
            return stackIn_2_0;
          }
          if (param1 != null &&
            param1[0] <= 0) {
            stackIn_6_0 = null;
            return (ud) (stackIn_6_0);
          }
          var9 = kj.a(this.field_b, param0, param3);
          if (param2 != -26190) {
            var10 = (int[]) null;
            discarded$1 = this.a(-19, (int[]) null, -4, 9);
          }
          if (var9 == null) {
            stackIn_11_0 = null;
            return (ud) (stackIn_11_0);
          }
          var11 = var9.a();
          var8Lifetime1 = var11;
          this.field_f.a(var8Lifetime1, var6, 1);
          if (param1 != null) {
            param1[0] = param1[0] - var11.field_n.length;
          }
          stackIn_15_0 = var8Lifetime1;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_18_0 = var5;
          stackIn_18_1 = new StringBuilder().append("gk.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_g = null;
        if (param0 != 1) {
          field_h = 62L;
        }
        field_c = null;
    }

    private final ud a(int param0, int param1, int[] param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        ud var8 = null;
        ad var9 = null;
        ud stackIn_2_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_11_0 = null;
        ud stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        ud var8Lifetime1;
        try {
          var5_int = param0 ^ (param1 >>> 12 | 65523 & param1 << 4);
          var5_int = var5_int | param1 << 16;
          var6 = (long)var5_int ^ 4294967296L;
          var8 = (ud) (this.field_f.a(var6, -105));
          if (var8 != null) {
            stackIn_2_0 = var8;
            return stackIn_2_0;
          }
          if (param2 != null &&
            0 >= param2[0]) {
            stackIn_6_0 = null;
            return (ud) (stackIn_6_0);
          }
          var9 = (ad) (this.field_e.a(var6, param3 ^ -125));
          if (var9 == null) {
            var9 = ad.a(this.field_d, param1, param0);
            if (var9 == null) {
              stackIn_11_0 = null;
              return (ud) (stackIn_11_0);
            }
            this.field_e.a(var9, var6, param3 + 0);
          }
          var8Lifetime1 = var9.a(param2);
          if (var8Lifetime1 == null) {
            return null;
          }
          var9.c(20);
          this.field_f.a(var8Lifetime1, var6, param3);
          stackIn_17_0 = var8Lifetime1;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_20_0 = var5;
          stackIn_20_1 = new StringBuilder().append("gk.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param3).append(')').toString());
        }
    }

    final ud a(int param0, int param1, boolean param2) {
        ud discarded$0 = null;
        if (param2) {
          int[] var5 = (int[]) null;
          discarded$0 = this.a(-93, (int[]) null, 110, 16);
        }
        return this.a(param0, (int[]) null, -26190, param1);
    }

    gk(pf param0, pf param1) {
        this.field_e = new uh(256);
        this.field_f = new uh(256);
        try {
          this.field_b = param0;
          this.field_d = param1;
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "gk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_g = "Create a free Account";
        field_h = 0L;
    }
}
