/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bg extends le {
    byte[] field_m;
    static vo field_i;
    int field_j;
    static String field_n;
    long field_h;
    static int field_k;
    static vk field_l;
    static vn[] field_o;

    public static void c(byte param0) {
        if (param0 != -44) {
          bg.a(-106, 54, false, -127);
        }
        field_o = null;
        field_i = null;
        field_n = null;
        field_l = null;
    }

    bg(long param0, int param1, byte[] param2) {
        try {
          this.field_h = param0;
          this.field_m = param2;
          this.field_j = param1;
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "bg.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(int param0, int param1, boolean param2, int param3) {
        int var4 = -43 % ((-39 - param0) / 61);
        return qo.b((byte) -123);
    }

    final static boolean a(int param0) {
        if (param0 != 2) {
          field_k = -82;
        }
        return ~rc.field_x != ~rc.field_p ? true : false;
    }

    final static int a(int param0, int param1, ji param2, String param3, ji param4, int param5, boolean param6) {
        int var12 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        de stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        String stackIn_21_2 = null;
        de stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        String stackIn_24_2 = null;
        int stackIn_34_0 = 0;
        int stackIn_49_0 = 0;
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
        String var11_ref_StringLifetime4;
        int var10Lifetime1;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        var13 = ZombieDawn.field_J;
        try {
          var14 = param2.a(-1);
          var11_ref_String = var14;
          var11_ref_StringLifetime1 = var14;
          var8 = param4.a(param0 ^ -106);
          var11_ref_StringLifetime2 = var8;
          var11_ref_StringLifetime3 = var8;
          if (param0 != 105) {
            stackIn_3_0 = 44;
            return stackIn_3_0;
          }
          if (sn.field_c == null &&
            !i.a(false, true)) {
            stackIn_8_0 = -1;
            return stackIn_8_0;
          }
          if (ui.field_g == ic.field_T) {
            dp.field_e.field_j = 0;
            ba.field_g = null;
            if (param3 == null) {
              dh.field_e.field_j = 0;
              dh.field_e.h(-127, p.field_b.nextInt());
              dh.field_e.h(-119, p.field_b.nextInt());
              stackIn_20_0 = dh.field_e;
              stackIn_20_1 = -88;
              if (!param2.b(32)) {
                stackIn_21_2 = "";
              } else {
                stackIn_21_2 = var14;
              }
              ((de) (Object) stackIn_20_0).a((byte) stackIn_20_1, stackIn_21_2);
              stackIn_23_0 = dh.field_e;
              stackIn_23_1 = -88;
              if (!param4.b(param0 ^ 73)) {
                stackIn_24_2 = "";
              } else {
                stackIn_24_2 = var8;
              }
              ((de) (Object) stackIn_23_0).a((byte) stackIn_23_1, stackIn_24_2);
              dp.field_e.i(16, 64);
              dp.field_e.field_j = dp.field_e.field_j + 1;
              var9 = dp.field_e.field_j;
              ab.a(dh.field_e, pm.field_c, (byte) 108, dp.field_e, pj.field_p);
              dp.field_e.d(param0 - 211, -var9 + dp.field_e.field_j);
            } else {
              var9 = 0;
              dh.field_e.field_j = 0;
              if (param6) {
                var9 = var9 | 1;
              }
              dh.field_e.h(23, p.field_b.nextInt());
              dh.field_e.h(-117, p.field_b.nextInt());
              dh.field_e.a((byte) -88, var14);
              dh.field_e.a((byte) -88, var8);
              var15 = (CharSequence) ((Object) param3);
              dh.field_e.a((byte) -88, qb.a(-122, var15));
              dh.field_e.a(param5, (byte) 105);
              dh.field_e.i(param1, 53);
              dh.field_e.i(var9, 66);
              dp.field_e.i(18, 125);
              dp.field_e.field_j = dp.field_e.field_j + 2;
              var10 = dp.field_e.field_j;
              var11_ref_StringLifetime4 = ff.a(hc.a(0), (byte) -128);
              if (var11_ref_StringLifetime4 == null) {
                var11_ref_StringLifetime4 = "";
              }
              dp.field_e.a(param0 + 23, var11_ref_StringLifetime4);
              ab.a(dh.field_e, pm.field_c, (byte) -109, dp.field_e, pj.field_p);
              dp.field_e.g(57, -var10 + dp.field_e.field_j);
            }
            vl.a((byte) -46, -1);
            ic.field_T = oe.field_a;
          }
          if (oe.field_a == ic.field_T &&
            ck.a((byte) -125, 1)) {
            var9Lifetime1 = fj.field_g.d((byte) -119);
            fj.field_g.field_j = 0;
            if (var9Lifetime1 >= 100 &&
              var9Lifetime1 <= 105) {
              ic.field_T = og.field_B;
              ho.field_a = new String[-100 + var9Lifetime1];
            } else {
              if (var9Lifetime1 == 248) {
                jc.a((byte) 34, hc.a(0));
                sc.field_d = wk.field_z;
                p.a(param0 - 104);
                nm.field_d = false;
                stackIn_34_0 = var9Lifetime1;
                return stackIn_34_0;
              }
              if (99 != var9Lifetime1) {
                ic.field_T = qo.field_w;
                jd.field_b = -1;
                l.field_d = var9Lifetime1;
              } else {
                ck.a((byte) -103, lo.a(false));
                ba.field_g = new Boolean(uh.a((byte) -36, fj.field_g));
                fj.field_g.field_j = 0;
              }
            }
          }
          if (og.field_B == ic.field_T) {
            var9Lifetime2 = 2;
            if (ck.a((byte) -128, var9Lifetime2)) {
              var10Lifetime1 = fj.field_g.f(param0 ^ 107);
              fj.field_g.field_j = 0;
              if (ck.a((byte) -100, var10Lifetime1)) {
                var11 = ho.field_a.length;
                for (var12 = 0; var12 < var11; var12++) {
                  ho.field_a[var12] = fj.field_g.d(19988);
                }
                p.a(1);
                nm.field_d = false;
                stackIn_49_0 = 100 + var11;
                return stackIn_49_0;
              }
            }
          }
          if (qo.field_w == ic.field_T &&
            nn.a(-2887)) {
            if (l.field_d != 255) {
              sc.field_d = fj.field_g.a(true);
            } else {
              var9_ref_String = fj.field_g.h(-1);
              if (var9_ref_String != null) {
                qg.a(165, hc.a(0), var9_ref_String);
              }
            }
            p.a(1);
            nm.field_d = false;
            stackIn_57_0 = l.field_d;
            return stackIn_57_0;
          }
          if (null == sn.field_c) {
            if (nm.field_d) {
              if (30000L >= gd.a(-127)) {
                sc.field_d = rl.field_a;
              } else {
                sc.field_d = dl.field_b;
              }
              nm.field_d = false;
              stackIn_65_0 = 249;
              return stackIn_65_0;
            }
            var9Lifetime3 = ci.field_c;
            ci.field_c = cn.field_j;
            nm.field_d = true;
            cn.field_j = var9Lifetime3;
          }
          stackIn_67_0 = -1;
          return stackIn_67_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_70_0 = var7;
          stackIn_70_1 = new StringBuilder().append("bg.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_71_2 = "null";
          } else {
            stackIn_71_2 = "{...}";
          }
          stackIn_73_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_71_2).append(',');
          if (param3 == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          stackIn_76_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(',');
          if (param4 == null) {
            stackIn_77_2 = "null";
          } else {
            stackIn_77_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_70_0), ((StringBuilder) (Object) stackIn_76_1).append(stackIn_77_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    static {
        field_n = "Quit";
        field_i = new vo();
        field_k = 2;
        field_l = new vk();
    }
}
