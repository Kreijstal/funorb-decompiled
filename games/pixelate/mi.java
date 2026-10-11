/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class mi extends de {
    static boolean field_o;

    final void c(byte param0) {
        if (param0 >= -13) {
          mi.e(-14);
        }
    }

    final void a(int param0) {
        this.b((byte) -71);
        int var2 = go.field_k != 0 ? 1 : 0;
        int var3 = null != wh.field_p ? 1 : 0;
        String var7 = bc.field_p;
        if (param0 != 11) {
          mi.b(false);
        }
        String var8 = var7 + " " + ub.a(sd.a(bf.a(param0 - 99, false, var3 != 0, var2 != 0), param0 ^ 50, new String[]{mj.field_i}), param0 - 11, "<br><br>", '#');
        tc var5 = qj.field_e;
        int var6 = 1 + var5.field_z + var5.field_w;
        var5.a(var8, 50, 150, 540, 10 * var6, 16777215, 0, 1, 0, var6);
    }

    final static void e(int param0) {
        int var1;
        int var2;
        ph var3;
        var2 = Pixelate.field_H ? 1 : 0;
        if (0 == ki.field_f) {
          if (ii.field_q != -1) {
            ii.field_q = -1;
          }
          var3 = (ph) (pl.field_Y.d(-28918));
          if (var3 != null) {
            ii.field_q = var3.field_k;
            ki.field_f = 300;
            nn.field_a = qj.field_e.c(tn.field_n[ii.field_q]) + 56;
            gk.field_bb = 50 + nn.field_a;
          }
        } else {
          ki.field_f = ki.field_f - 1;
          if (ki.field_f < 16) {
            var1 = 16 - ki.field_f;
            gk.field_bb = var1 * (var1 * (50 + nn.field_a)) >> 8;
          } else {
            if (284 < ki.field_f) {
              var1 = ki.field_f - 284;
              gk.field_bb = var1 * (nn.field_a + 50) * var1 >> 8;
            }
          }
        }
        if (param0 >= -121) {
          mi.a(71, 124, 48, -115);
        }
    }

    final static hh[] a(int param0, int param1, int param2, int param3) {
        int var8 = 0;
        hh[] var4;
        int var5;
        boolean[] var6;
        hh[] var7;
        int var9;
        int var10;
        hh[] var11;
        var10 = Pixelate.field_H ? 1 : 0;
        var11 = al.field_c[param2][param0];
        var4 = var11;
        if (var4 == null) {
          return null;
        }
        var5 = var11.length;
        var6 = new boolean[var5];
        var7 = new hh[param1];
        for (var8 = 0; var7.length > var8; var8++) {
          var9 = ok.a(tg.field_f, param3 ^ -118, var5);
          while (var6[var9]) {
            var9++;
            if (var5 > var9) {
              continue;
            }
            var9 = 0;
          }
          var6[var9] = true;
          var7[var8] = var11[var9];
        }
        if (param3 != 20) {
          mi.b(true);
        }
        return var7;
    }

    final static int d(int param0, int param1) {
        if (param0 != -4096) {
          mi.a(126, 19, (byte) -117);
        }
        param1 = param1 & 8191;
        if (param1 >= 4096) {
          return param1 >= 6144 ? -k.field_i[-param1 + 8192] : -k.field_i[param1 - 4096];
        }
        return param1 < 2048 ? k.field_i[param1] : k.field_i[-param1 + 4096];
    }

    mi(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    final static int a(boolean param0, byte param1, String param2, int param3, boolean param4, String param5) {
        try {
          int stackIn_4_0 = 0;
          int stackIn_30_0 = 0;
          boolean stackIn_40_0 = false;
          boolean stackIn_44_0 = false;
          boolean stackIn_47_0 = false;
          boolean stackIn_50_0 = false;
          int stackIn_79_0 = 0;
          int stackIn_90_0 = 0;
          int stackIn_92_0 = 0;
          int stackIn_100_0 = 0;
          int stackIn_103_0 = 0;
          RuntimeException stackIn_106_0 = null;
          StringBuilder stackIn_106_1 = null;
          String stackIn_107_2 = null;
          StringBuilder stackIn_109_1 = null;
          String stackIn_110_2 = null;
          Throwable decompiledCaughtException = null;
          int var6_int = 0;
          String var6 = null;
          RuntimeException var6_ref = null;
          int var7 = 0;
          int var8 = 0;
          Throwable var8_ref_Throwable = null;
          int var9 = 0;
          String var10 = null;
          CharSequence var11 = null;
          int var6_intLifetime1;
          int var6_intLifetime2;
          int var8Lifetime1;
          var9 = Pixelate.field_H ? 1 : 0;
          try {
            if (null == sh.field_e &&
              !wb.a(0, param4)) {
              stackIn_4_0 = -1;
              return stackIn_4_0;
            }
            if (ij.field_o == uk.field_s) {
              if (param4) {
                var10 = (String) null;
                li.field_g = ck.a(param2, (String) null, false, vn.field_b, 83);
              } else {
                li.field_g = k.a(param2, false, -61, param5);
              }
              aa.field_f.field_m = 0;
              aa.field_f.e(160, 14);
              aa.field_f.e(160, li.field_g.b(-27096).field_a);
              vg.b(-1, 10000);
              uk.field_s = cn.field_a;
            }
            if (uk.field_s == cn.field_a &&
              rd.a(1, false)) {
              var6_int = vi.field_o.f(255);
              vi.field_o.field_m = 0;
              if (var6_int != 0) {
                mn.field_e = var6_int;
                uk.field_s = sl.field_b;
                jj.field_b = -1;
              } else {
                uk.field_s = ke.field_b;
              }
            }
            if (uk.field_s == ke.field_b &&
              rd.a(8, false)) {
              gj.field_P = vi.field_o.a(false);
              vi.field_o.field_m = 0;
              io.a(param4, -67, li.field_g, param3, param0);
              uk.field_s = kk.field_b;
            }
            boolean decompiledFrameRemainder0 = true;
            if (kk.field_b == uk.field_s &&
              rd.a(1, false)) {
              var6_intLifetime1 = vi.field_o.f(255);
              sc.field_a = null;
              vi.field_o.field_m = 0;
              mn.field_e = var6_intLifetime1;
              if (0 != var6_intLifetime1 &&
                1 != var6_intLifetime1) {
                if (var6_intLifetime1 != 8) {
                  uk.field_s = sl.field_b;
                  jj.field_b = -1;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  na.a(true);
                  qj.field_b = false;
                  stackIn_30_0 = var6_intLifetime1;
                  return stackIn_30_0;
                }
              }
              if (decompiledFrameRemainder0) {
                jj.field_b = -1;
                uk.field_s = e.field_d;
              }
            }
            if (e.field_d == uk.field_s &&
              in.e(-18481)) {
              vn.field_b = vi.field_o.a(false);
              hq.field_t = param2;
              wo.field_h = vi.field_o.f(255);
              rj.field_I = vi.field_o.f(255);
              uo.field_j = vi.field_o.a((byte) -116);
              var6 = vi.field_o.e((byte) 79);
              var7 = vi.field_o.f(255);
              if ((var7 & 1) != 0) {
                tm.d((byte) -51);
              }
              stackIn_40_0 = ((16 & var7) != 0);
              mg.field_l = stackIn_40_0;
              if (!param4) {
                stackIn_44_0 = (0 != (var7 & 2));
                lh.field_g = stackIn_44_0;
                stackIn_47_0 = ((8 & var7) != 0);
                ln.field_q = stackIn_47_0;
                stackIn_50_0 = ((4 & var7) != 0);
                wg.field_a = stackIn_50_0;
                if (ln.field_q) {
                  lh.field_g = true;
                }
              }
              if (vm.field_d) {
                vi.field_o.f(255);
                vi.field_o.f(255);
                vi.field_o.k(0);
                mo.field_k = vi.field_o.a((byte) -115);
                dc.field_b = new byte[mo.field_k];
                for (var8 = 0; mo.field_k > var8; var8++) {
                  dc.field_b[var8] = vi.field_o.a(0);
                }
              }
              kn.field_J = vi.field_o.h(5);
              var11 = (CharSequence) ((Object) kn.field_J);
              eq.field_Hb = dh.a(var11, (byte) 54);
              ra.field_g = vi.field_o.f(255);
              uk.field_s = Pixelate.field_G;
              if (li.field_g.b(-27096) == l.field_r) {
                ig.field_e.a(ao.a(13867), -80419032);
              } else {
                if (li.field_g.b(-27096) == te.field_Nb) {
                  vm.field_a.a(ao.a(13867), -80419032);
                }
              }
              qj.field_b = false;
              if (var6 != null) {
                rd.a(var6, 126, ao.a(13867));
              }
              if (uo.field_j <= 0 &&
                !wg.field_a) {
                try {
                  cq.a("unzap", (byte) -56, ao.a(13867));
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var8_ref_Throwable = decompiledCaughtException;
                }
              } else {
                try {
                  cq.a(ao.a(13867), (byte) -37, new Object[]{we.b(vn.field_b, -7067)}, "zap");
                } catch (java.lang.Throwable decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var8_ref_Throwable = decompiledCaughtException;
                }
              }
              if (uo.field_j > 0) {
                uj.field_Lb = true;
              }
              aa.field_f.a(0, ud.field_L);
              for (var8Lifetime1 = 0; var8Lifetime1 < 4; var8Lifetime1++) {
                ud.field_L[var8Lifetime1] = ud.field_L[var8Lifetime1] + 50;
              }
              vi.field_o.a(0, ud.field_L);
              stackIn_79_0 = mn.field_e;
              return stackIn_79_0;
            }
            if (sl.field_b == uk.field_s &&
              in.e(-18481)) {
              na.a(true);
              if (mn.field_e == 7 &&
                !qj.field_b) {
                qj.field_b = true;
                stackIn_92_0 = -1;
                return stackIn_92_0;
              }
              if (mn.field_e == 7) {
                mn.field_e = 3;
              }
              gi.field_b = vi.field_o.h(5);
              qj.field_b = false;
              stackIn_90_0 = mn.field_e;
              return stackIn_90_0;
            }
            var6_intLifetime2 = 51 % ((-18 - param1) / 46);
            if (null == sh.field_e) {
              if (qj.field_b) {
                if (no.d(8) <= 30000L) {
                  gi.field_b = ho.field_b;
                } else {
                  gi.field_b = vc.field_N;
                }
                qj.field_b = false;
                stackIn_100_0 = 3;
                return stackIn_100_0;
              }
              var7 = gd.field_g;
              gd.field_g = cd.field_b;
              cd.field_b = var7;
              qj.field_b = true;
            }
            stackIn_103_0 = -1;
            return stackIn_103_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_106_0 = var6_ref;
            stackIn_106_1 = new StringBuilder().append("mi.B(").append(param0).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_107_2 = "null";
            } else {
              stackIn_107_2 = "{...}";
            }
            stackIn_109_1 = ((StringBuilder) (Object) stackIn_106_1).append(stackIn_107_2).append(',').append(param3).append(',').append(param4).append(',');
            if (param5 == null) {
              stackIn_110_2 = "null";
            } else {
              stackIn_110_2 = "{...}";
            }
            throw aa.a((Throwable) ((Object) stackIn_106_0), ((StringBuilder) (Object) stackIn_109_1).append(stackIn_110_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(boolean param0, float param1, int param2, String param3) {
        try {
          if (cn.field_b == null) {
            cn.field_b = new ko(wa.field_c, wp.field_a);
            wa.field_c.b(-6183, cn.field_b);
          }
          if (param2 != -1) {
            field_o = false;
          }
          cn.field_b.a(param3, param1, 7595, param0);
          t.d();
          rj.a(94, true);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "mi.I(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(int param0, int param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = Pixelate.field_H ? 1 : 0;
        try {
          var3_int = 0;
          var4 = de.field_h;
          if (param2 > -72) {
            field_o = true;
          }
          while (var3_int < vm.field_e.length) {
            var5 = fo.field_a[var3_int];
            if (var5 >= 0) {
              var6 = sb.a(3, vm.field_e[var3_int], true);
              var4 = var4 + ko.field_fb;
              var7 = -(var6 >> 1) + qe.field_u;
              if (mn.a(param0, var4, 9, gk.field_fb + (bd.field_c << 1), var7 - hc.field_J, param1, (hc.field_J << 1) + var6)) {
                stackIn_8_0 = var5;
                return stackIn_8_0;
              }
              var4 = var4 + (gk.field_fb + ko.field_fb + (bd.field_c << 1));
            } else {
              var4 = var4 + hq.field_r;
            }
            var3_int++;
          }
          stackIn_12_0 = -1;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var3), "mi.M(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void b(boolean param0) {
        ho.field_g.a(0, 18, 0, 256, -(!f.field_n ? 0 : 40 + hk.field_b + 4) + oc.field_O.field_K);
        if (param0) {
          field_o = false;
        }
        l.field_s.a(0, 18, -40 + (-hk.field_b + (oc.field_O.field_K - 2)), 256, 42 + hk.field_b);
        jm.field_b.a(0, 2, (byte) 102, oc.field_O.field_K, 20, oc.field_O.field_nb - 20, hk.field_b);
    }

    static {
    }
}
