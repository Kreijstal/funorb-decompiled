/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wc {
    private ci field_f;
    private ci field_e;
    private lf field_c;
    static int[][] field_a;
    static boolean field_b;
    static int field_d;

    final static void a(int param0, int param1) {
        gk.field_f = (param1 & 57) >> 4;
        vc.field_O = param1 >> 2 & 3;
        if (!(gk.field_f <= 2)) {
          gk.field_f = 2;
        }
        if (!(param0 >= vc.field_O)) {
          vc.field_O = 2;
        }
        ba.field_n = 3 & param1;
        if (ba.field_n > 2) {
          ba.field_n = 2;
        }
    }

    final static int a(int param0, int param1, String param2, boolean param3, boolean param4, String param5) {
        try {
          int stackIn_4_0 = 0;
          int stackIn_31_0 = 0;
          boolean stackIn_43_0 = false;
          boolean stackIn_46_0 = false;
          int stackIn_73_0 = 0;
          int stackIn_79_0 = 0;
          int stackIn_84_0 = 0;
          int stackIn_92_0 = 0;
          int stackIn_94_0 = 0;
          RuntimeException stackIn_97_0 = null;
          StringBuilder stackIn_97_1 = null;
          String stackIn_98_2 = null;
          StringBuilder stackIn_100_1 = null;
          String stackIn_101_2 = null;
          Throwable decompiledCaughtException = null;
          int var6_int = 0;
          RuntimeException var6 = null;
          int var7 = 0;
          String var7_ref_String = null;
          int var8 = 0;
          int var9 = 0;
          Throwable var9_ref_Throwable = null;
          int var10 = 0;
          String var11 = null;
          CharSequence var12 = null;
          int var6_intLifetime1;
          int var7Lifetime1;
          int var9Lifetime1;
          var10 = Transmogrify.field_A ? 1 : 0;
          try {
            if (null == nk.field_b &&
              !gk.a(param4, -23)) {
              stackIn_4_0 = -1;
              return stackIn_4_0;
            }
            if (jk.field_y == lj.field_z) {
              if (param4) {
                var11 = (String) null;
                ll.field_V = dk.a((String) null, ac.field_j, false, param2, 126);
              } else {
                ll.field_V = bf.a(param5, (byte) 41, false, param2);
              }
              ff.field_D.field_h = 0;
              ff.field_D.f(6389, 14);
              ff.field_D.f(6389, ll.field_V.a(-184).field_a);
              rb.a(-1, -377);
              lj.field_z = g.field_y;
            }
            if (g.field_y == lj.field_z &&
              ue.a(1, 0)) {
              var6_int = nf.field_l.d((byte) 125);
              if (var6_int == 0) {
                lj.field_z = lb.field_e;
              } else {
                ca.field_e = var6_int;
                tg.field_a = -1;
                lj.field_z = aa.field_e;
              }
              nf.field_l.field_h = 0;
            }
            if (lj.field_z == lb.field_e &&
              ue.a(8, 0)) {
              fd.field_g = nf.field_l.e((byte) -115);
              nf.field_l.field_h = 0;
              tb.a(ll.field_V, param0, param3, param4, 122);
              lj.field_z = ck.field_I;
            }
            boolean decompiledFrameRemainder0 = true;
            var6_intLifetime1 = -17 / ((-59 - param1) / 55);
            if (lj.field_z == ck.field_I &&
              ue.a(1, 0)) {
              var7 = nf.field_l.d((byte) 110);
              ca.field_e = var7;
              e.field_I = null;
              nf.field_l.field_h = 0;
              if (var7 != 0 &&
                var7 != 1) {
                if (var7 != 8) {
                  lj.field_z = aa.field_e;
                  tg.field_a = -1;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  pc.a(1);
                  ej.field_k = false;
                  stackIn_31_0 = var7;
                  return stackIn_31_0;
                }
              }
              if (decompiledFrameRemainder0) {
                lj.field_z = pj.field_w;
                tg.field_a = -1;
              }
            }
            if (lj.field_z == pj.field_w &&
              ce.a(0)) {
              ac.field_j = nf.field_l.e((byte) 117);
              va.field_j = nf.field_l.d((byte) 58);
              nf.field_l.d((byte) 93);
              wj.field_o = nf.field_l.a((byte) -118);
              var7_ref_String = nf.field_l.j(-1640531527);
              var8 = nf.field_l.d((byte) 82);
              if ((1 & var8) != 0) {
                rb.a((byte) -114);
              }
              if (!param4) {
                stackIn_43_0 = ((var8 & 4) != 0);
                el.field_g = stackIn_43_0;
                stackIn_46_0 = ((8 & var8) != 0);
                ub.field_d = stackIn_46_0;
                if (!ub.field_d) {
                }
              }
              if (kc.field_D) {
                nf.field_l.d((byte) 63);
                nf.field_l.d((byte) 33);
                nf.field_l.c((byte) -119);
                ai.field_c = nf.field_l.a((byte) -119);
                td.field_c = new byte[ai.field_c];
                for (var9 = 0; var9 < ai.field_c; var9++) {
                  td.field_c[var9] = nf.field_l.b(true);
                }
              }
              w.field_a = nf.field_l.g(12248);
              var12 = (CharSequence) ((Object) w.field_a);
              kf.field_e = hj.a((byte) -128, var12);
              db.field_d = nf.field_l.d((byte) 123);
              lj.field_z = ll.field_Q;
              if (ll.field_V.a(-184) != wh.field_I) {
                if (ll.field_V.a(-184) == vc.field_G) {
                  of.field_f.a(ha.b(101), 0);
                }
              } else {
                aa.field_d.a(ha.b(95), 0);
              }
              ej.field_k = false;
              if (var7_ref_String != null) {
                v.a(0, var7_ref_String, ha.b(121));
              }
              if (0 >= wj.field_o &&
                !el.field_g) {
                try {
                  kj.a(ha.b(87), false, "unzap");
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var9_ref_Throwable = decompiledCaughtException;
                }
              } else {
                try {
                  kj.a(22102, "zap", new Object[]{tl.a(11468, ac.field_j)}, ha.b(106));
                } catch (java.lang.Throwable decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var9_ref_Throwable = decompiledCaughtException;
                }
              }
              if (wj.field_o > 0) {
                wd.field_g = true;
              }
              ff.field_D.a((byte) -68, mf.field_c);
              for (var9Lifetime1 = 0; var9Lifetime1 < 4; var9Lifetime1++) {
                mf.field_c[var9Lifetime1] = mf.field_c[var9Lifetime1] + 50;
              }
              nf.field_l.a((byte) -74, mf.field_c);
              stackIn_73_0 = ca.field_e;
              return stackIn_73_0;
            }
            if (aa.field_e == lj.field_z &&
              ce.a(0)) {
              pc.a(1);
              if (ca.field_e == 7 &&
                !ej.field_k) {
                ej.field_k = true;
                stackIn_79_0 = -1;
                return stackIn_79_0;
              }
              if (7 == ca.field_e) {
                ca.field_e = 3;
              }
              Transmogrify.field_B = nf.field_l.g(12248);
              ej.field_k = false;
              stackIn_84_0 = ca.field_e;
              return stackIn_84_0;
            }
            if (null == nk.field_b) {
              if (ej.field_k) {
                if (mc.b(true) <= 30000L) {
                  Transmogrify.field_B = bd.field_s;
                } else {
                  Transmogrify.field_B = ng.field_h;
                }
                ej.field_k = false;
                stackIn_92_0 = 3;
                return stackIn_92_0;
              }
              var7Lifetime1 = lf.field_c;
              lf.field_c = kf.field_p;
              kf.field_p = var7Lifetime1;
              ej.field_k = true;
            }
            stackIn_94_0 = -1;
            return stackIn_94_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var6 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_97_0 = var6;
            stackIn_97_1 = new StringBuilder().append("wc.A(").append(param0).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_98_2 = "null";
            } else {
              stackIn_98_2 = "{...}";
            }
            stackIn_100_1 = ((StringBuilder) (Object) stackIn_97_1).append(stackIn_98_2).append(',').append(param3).append(',').append(param4).append(',');
            if (param5 == null) {
              stackIn_101_2 = "null";
            } else {
              stackIn_101_2 = "{...}";
            }
            throw ch.a((Throwable) ((Object) stackIn_97_0), ((StringBuilder) (Object) stackIn_100_1).append(stackIn_101_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private wc() throws Throwable {
        throw new Error();
    }

    final static cj a(int param0, java.awt.Component param1, int param2, int param3) {
        try {
          Class var4 = null;
          Throwable var4_ref = null;
          RuntimeException var4_ref2 = null;
          cj var5 = null;
          fg var5_ref = null;
          cj stackIn_2_0 = null;
          cj stackIn_4_0 = null;
          fg stackIn_6_0 = null;
          RuntimeException stackIn_9_0 = null;
          StringBuilder stackIn_9_1 = null;
          String stackIn_10_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              var4 = Class.forName("dd");
              if (param0 != 4) {
                stackIn_2_0 = (cj) null;
                return stackIn_2_0;
              }
              var5 = (cj) (var4.newInstance());
              var5.a(param3, param2, param1, (byte) -126);
              stackIn_4_0 = var5;
              return stackIn_4_0;
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4_ref = decompiledCaughtException;
              var5_ref = new fg();
              ((cj) ((Object) var5_ref)).a(param3, param2, param1, (byte) -6);
              stackIn_6_0 = var5_ref;
              return (cj) ((Object) stackIn_6_0);
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_9_0 = var4_ref2;
            stackIn_9_1 = new StringBuilder().append("wc.D(").append(param0).append(',');
            if (param1 == null) {
              stackIn_10_2 = "null";
            } else {
              stackIn_10_2 = "{...}";
            }
            throw ch.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final rk b(int param0, int param1) {
        byte[] var4 = null;
        rk var3 = (rk) (this.field_c.a(17699, (long)param1));
        if (var3 != null) {
          return var3;
        }
        if (param1 >= 32768) {
          var4 = this.field_e.a((byte) -93, 32767 & param1, 1);
        } else {
          var4 = this.field_f.a((byte) -93, param1, 1);
        }
        var3 = new rk();
        if (var4 != null) {
          var3.a(new oa(var4), param0 ^ -2);
        }
        if (32768 <= param1) {
          var3.c((byte) 52);
        }
        if (param0 != 1) {
          field_d = 125;
        }
        this.field_c.a(var3, -22137, (long)param1);
        return var3;
    }

    public static void a(int param0) {
        field_a = (int[][]) null;
        if (param0 != 7) {
          java.awt.Component var2 = (java.awt.Component) null;
          wc.a(60, (java.awt.Component) null, -102, -105);
        }
    }

    final static void a(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        ng var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        String[][] var7 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        hj var14 = null;
        int var15 = 0;
        hj var16 = null;
        int[][] var20 = null;
        int var7_intLifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        var13 = Transmogrify.field_A ? 1 : 0;
        try {
          var14 = nf.field_l;
          var16 = var14;
          var2 = var16.d((byte) 108);
          var3 = (ng) (kf.field_o.a((byte) -95));
          while (var3 != null) {
            if (var2 != var3.field_m) {
              var3 = (ng) (kf.field_o.a(true));
              continue;
            }
            break;
          }
          if (var3 == null) {
            pc.a(1);
            return;
          }
          var5 = -102 % ((77 - param0) / 39);
          var4 = var16.d((byte) 78);
          if (0 != var4) {
            var6 = var3.field_k;
            kf.field_k[0] = w.field_a;
            for (var7_int = 1; var4 > var7_int; var7_int++) {
              kf.field_k[var7_int] = var14.g(12248);
            }
            he.a(var6, var4, 24070);
            for (var7_intLifetime1 = 0; var7_intLifetime1 < var4; var7_intLifetime1++) {
              th.a(101, var16);
              if (0 != var7_intLifetime1) {
                vh.a(di.field_e, ug.field_b, cl.field_x, ia.field_j, var7_intLifetime1, false);
              } else {
                vh.a(di.field_e, ug.field_b, cl.field_x, ia.field_j, var7_intLifetime1, false);
              }
            }
            jj.a((byte) -93, var6);
            var7 = new String[2][var6];
            var20 = new int[2][var6 * 4];
            var9 = cg.field_l;
            var10 = 0;
            var11 = 0;
            while (var9 > var10) {
              var12 = lk.field_d[var10];
              var7[0][var11] = kf.field_k[var12];
              var20[0][var11 * 4] = dk.field_k[var12];
              var20[0][1 + var11 * 4] = bh.field_a[var12];
              var20[0][2 + 4 * var11] = pd.field_a[var12];
              var20[0][var11 * 4 + 3] = bg.field_j[var12];
              if (qg.a(kf.field_k[var12], (byte) -128) &&
                pd.field_a[var12] + bh.field_a[var12] + bg.field_j[var12] == 0) {
                var7[0][var11] = null;
                var11--;
              }
              var11++;
              var10++;
            }
            var10Lifetime1 = 0;
            var15 = 0;
            var11Lifetime1 = var15;
            while (var10Lifetime1 < var9) {
              var12Lifetime1 = lk.field_d[var10Lifetime1 + var6];
              var7[1][var15] = kf.field_k[var12Lifetime1];
              var20[1][var15 * 4] = dk.field_k[var12Lifetime1];
              var20[1][var15 * 4 + 1] = bh.field_a[var12Lifetime1];
              var20[1][2 + var15 * 4] = pd.field_a[var12Lifetime1];
              var20[1][3 + var15 * 4] = bg.field_j[var12Lifetime1];
              if (qg.a(kf.field_k[var12Lifetime1], (byte) -111) &&
                bg.field_j[var12Lifetime1] + (bh.field_a[var12Lifetime1] + pd.field_a[var12Lifetime1]) == 0) {
                var7[1][var15] = null;
                var15--;
              }
              var10Lifetime1++;
              var15++;
            }
            var3.c(5);
            return;
          }
          var3.c(5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var1), "wc.C(" + param0 + ')');
        }
    }

    static {
        field_d = 0;
        field_b = true;
    }
}
