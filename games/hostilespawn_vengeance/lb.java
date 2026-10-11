/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lb {
    static int field_b;
    static bd[][] field_a;
    static String field_c;

    final static void b(int param0) {
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        en var5 = null;
        int var6 = 0;
        int var8 = 0;
        int[] var10 = null;
        int[] var11 = null;
        hm var12 = null;
        ri var13 = null;
        en var14 = null;
        ri var15 = null;
        var8 = HostileSpawn.field_I ? 1 : 0;
        try {
          var14 = sc.field_g;
          if (param0 != -20785) {
            lb.a(107);
          }
          var2 = var14.l(32270);
          if (0 == var2) {
            var11 = nf.a(false);
            var3 = var11;
            var10 = var11;
            var4 = var10;
            var5 = var14;
            var6 = ((vi) ((Object) var5)).l(32270);
            for (var7 = 0; var7 < var6; var7++) {
              var10[var7] = ((vi) ((Object) var5)).d(8195);
            }
            var13 = (ri) (ei.field_h.g(-63));
            if (var13 == null) {
              le.c((byte) 53);
              return;
            }
            var13.field_j = var3;
            var13.field_l = true;
            var13.b(111);
            return;
          }
          if (var2 != 1) {
            if (var2 == 2) {
              var15 = (ri) (ei.field_h.g(param0 ^ 20755));
              if (var15 == null) {
                le.c((byte) 66);
                return;
              }
              var15.field_j = nf.a(false);
              var15.field_l = true;
              var15.b(param0 ^ 20777);
            } else {
              ic.a((byte) -118, "A1: " + gf.a((byte) -125), (Throwable) null);
              le.c((byte) 78);
            }
          } else {
            var12 = (hm) (ih.field_x.g(-117));
            if (var12 == null) {
              le.c((byte) 81);
              return;
            }
            var12.b(-76);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var1), "lb.C(" + param0 + ')');
        }
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 != -16182) {
          return;
        }
        field_a = (bd[][]) null;
    }

    final static int a(int param0, byte param1, s param2, boolean param3, s param4, String param5, int param6) {
        int var12 = 0;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        vi stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        String stackIn_15_2 = null;
        vi stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        String stackIn_18_2 = null;
        int stackIn_36_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_67_0 = 0;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_71_2 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_74_2 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_77_2 = null;
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
        int var10Lifetime1;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        var13 = HostileSpawn.field_I ? 1 : 0;
        try {
          var14 = param2.a(16751324);
          var11_ref_String = var14;
          if (param1 <= 123) {
            stackIn_3_0 = 6;
            return stackIn_3_0;
          }
          var8 = param4.a(16751324);
          var11_ref_StringLifetime1 = var8;
          var11_ref_StringLifetime2 = var8;
          if (null == ag.field_t &&
            !me.a(false, 96)) {
            stackIn_9_0 = -1;
            return stackIn_9_0;
          }
          if (sa.field_c == rc.field_a) {
            ii.field_h = null;
            s.field_b.field_i = 0;
            if (param5 != null) {
              var9 = 0;
              ob.field_s.field_i = 0;
              if (param3) {
                var9 = var9 | 1;
              }
              ob.field_s.b(jk.field_b.nextInt(), 25251);
              ob.field_s.b(jk.field_b.nextInt(), 25251);
              ob.field_s.a(110, var14);
              ob.field_s.a(110, var8);
              var15 = (CharSequence) ((Object) param5);
              ob.field_s.a(83, jk.a((byte) 104, var15));
              ob.field_s.a((byte) -121, param0);
              ob.field_s.d(81, param6);
              ob.field_s.d(88, var9);
              s.field_b.d(94, 18);
              s.field_b.field_i = s.field_b.field_i + 2;
              var10 = s.field_b.field_i;
              var11_ref_StringLifetime3 = de.a(-120, bn.c(-1));
              if (var11_ref_StringLifetime3 == null) {
                var11_ref_StringLifetime3 = "";
              }
              s.field_b.a(var11_ref_StringLifetime3, 0);
              ml.a(s.field_b, nb.field_L, 0, lm.field_z, ob.field_s);
              s.field_b.a(true, s.field_b.field_i - var10);
            } else {
              ob.field_s.field_i = 0;
              ob.field_s.b(jk.field_b.nextInt(), 25251);
              ob.field_s.b(jk.field_b.nextInt(), 25251);
              stackIn_14_0 = ob.field_s;
              stackIn_14_1 = 124;
              if (param2.a((byte) -80)) {
                stackIn_15_2 = var14;
              } else {
                stackIn_15_2 = "";
              }
              ((vi) (Object) stackIn_14_0).a(stackIn_14_1, stackIn_15_2);
              stackIn_17_0 = ob.field_s;
              stackIn_17_1 = 36;
              if (param4.a((byte) -80)) {
                stackIn_18_2 = var8;
              } else {
                stackIn_18_2 = "";
              }
              ((vi) (Object) stackIn_17_0).a(stackIn_17_1, stackIn_18_2);
              s.field_b.d(86, 16);
              s.field_b.field_i = s.field_b.field_i + 1;
              var9 = s.field_b.field_i;
              ml.a(s.field_b, nb.field_L, 0, lm.field_z, ob.field_s);
              s.field_b.a(-var9 + s.field_b.field_i, -19720);
            }
            mb.d(-1, -22370);
            rc.field_a = re.field_r;
          }
          if (re.field_r == rc.field_a &&
            re.c((byte) 33, 1)) {
            var9Lifetime1 = sc.field_g.l(32270);
            sc.field_g.field_i = 0;
            if (var9Lifetime1 >= 100 &&
              105 >= var9Lifetime1) {
              ea.field_a = new String[var9Lifetime1 - 100];
              rc.field_a = gj.field_b;
            } else {
              if (var9Lifetime1 == 248) {
                cj.a(bn.c(-1), 0);
                km.field_x = sg.field_g;
                le.c((byte) 119);
                jn.field_C = false;
                stackIn_36_0 = var9Lifetime1;
                return stackIn_36_0;
              }
              if (99 == var9Lifetime1) {
                re.c((byte) 33, ob.c((byte) -79));
                ii.field_h = new Boolean(gn.a(0, sc.field_g));
                sc.field_g.field_i = 0;
              } else {
                rc.field_a = sj.field_c;
                wa.field_k = var9Lifetime1;
                jd.field_q = -1;
              }
            }
          }
          if (rc.field_a == gj.field_b) {
            var9Lifetime2 = 2;
            if (re.c((byte) 33, var9Lifetime2)) {
              var10Lifetime1 = sc.field_g.e(8);
              sc.field_g.field_i = 0;
              if (re.c((byte) 33, var10Lifetime1)) {
                var11 = ea.field_a.length;
                for (var12 = 0; var12 < var11; var12++) {
                  ea.field_a[var12] = sc.field_g.n(-31298);
                }
                le.c((byte) 98);
                jn.field_C = false;
                stackIn_46_0 = var11 + 100;
                return stackIn_46_0;
              }
            }
          }
          if (rc.field_a == sj.field_c &&
            eb.a(13372)) {
            if (255 == wa.field_k) {
              var9_ref_String = sc.field_g.a((byte) 28);
              if (var9_ref_String != null) {
                gb.a((byte) 98, bn.c(-1), var9_ref_String);
              }
            } else {
              km.field_x = sc.field_g.o(32);
            }
            le.c((byte) 84);
            jn.field_C = false;
            stackIn_57_0 = wa.field_k;
            return stackIn_57_0;
          }
          if (null == ag.field_t) {
            if (jn.field_C) {
              if (m.a(true) <= 30000L) {
                km.field_x = fl.field_d;
              } else {
                km.field_x = od.field_H;
              }
              jn.field_C = false;
              stackIn_65_0 = 249;
              return stackIn_65_0;
            }
            var9Lifetime3 = cb.field_c;
            cb.field_c = fh.field_b;
            jn.field_C = true;
            fh.field_b = var9Lifetime3;
          }
          stackIn_67_0 = -1;
          return stackIn_67_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_70_0 = var7;
          stackIn_70_1 = new StringBuilder().append("lb.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_71_2 = "null";
          } else {
            stackIn_71_2 = "{...}";
          }
          stackIn_73_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_71_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          stackIn_76_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(',');
          if (param5 == null) {
            stackIn_77_2 = "null";
          } else {
            stackIn_77_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_70_0), ((StringBuilder) (Object) stackIn_76_1).append(stackIn_77_2).append(',').append(param6).append(')').toString());
        }
    }

    static {
        field_c = "CLICK TO BEGIN";
    }
}
