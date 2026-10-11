/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class hc {
    static int field_b;
    static nc field_a;
    static byte[][] field_e;
    static String field_f;
    static int field_d;
    static hb field_c;

    final static void a(String param0, boolean param1, String param2, boolean param3) {
        try {
          if (param1) {
            field_d = 99;
          }
          me.field_h = param2;
          ec.field_j = param0;
          nf.a(param3, ab.field_p, -119);
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "hc.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_a = null;
        if (param0 != 25850) {
          field_c = (hb) null;
        }
        field_e = (byte[][]) null;
        field_f = null;
    }

    final static void a(boolean param0, boolean param1, int param2) {
        int stackIn_64_0 = 0;
        int stackIn_67_0 = 0;
        String[] stackIn_74_0 = null;
        int stackIn_74_1 = 0;
        String stackIn_75_2 = null;
        String[] stackIn_80_0 = null;
        int stackIn_80_1 = 0;
        String stackIn_81_2 = null;
        String stackIn_87_0 = null;
        boolean stackIn_88_1 = false;
        int stackIn_110_0 = 0;
        int stackIn_111_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        String[] var4_ref_String__ = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String[] var10 = null;
        String var11 = null;
        String var12 = null;
        String[] var4_ref_String__Lifetime1;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var6Lifetime1;
        int var8Lifetime1;
        int var3_intLifetime1;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime2;
        int var8Lifetime3;
        int var5Lifetime2Lifetime1;
        int var7Lifetime1Lifetime1;
        var9 = SolKnight.field_L ? 1 : 0;
        try {
          te.field_M = param2;
          jg.field_d = true;
          if (te.field_M == 0) {
            var3_int = bk.a((byte) 3, ff.field_e, ke.field_H, si.field_A, w.field_c);
            var4 = var3_int + 3;
            oa.field_l = new int[var4];
            vc.field_d = new String[var4];
            for (var5 = 0; var4 > var5; var5++) {
              oa.field_l[var5] = -1;
            }
            fl.field_b = new int[2];
            for (var5 = 0; var5 < var3_int; var5++) {
              vc.field_d[var5] = w.field_c[var5];
            }
            vc.field_d[-3 + var4] = "";
            vc.field_d[-2 + var4] = be.field_J;
            oa.field_l[-2 + var4] = 0;
            fl.field_b[0] = 4;
            vc.field_d[var4 - 1] = le.field_a;
            oa.field_l[-1 + var4] = 1;
            fl.field_b[1] = 5;
          } else if (te.field_M == 1) {
            var3_int = bk.a((byte) 3, ff.field_e, ke.field_H, si.field_A, w.field_c);
            var4 = 2 + var3_int;
            oa.field_l = new int[var4];
            vc.field_d = new String[var4];
            for (var5 = 0; var4 > var5; var5++) {
              oa.field_l[var5] = -1;
            }
            fl.field_b = new int[1];
            for (var5 = 0; var5 < var3_int; var5++) {
              vc.field_d[var5] = w.field_c[var5];
            }
            vc.field_d[-2 + var4] = "";
            vc.field_d[var4 - 1] = le.field_a;
            oa.field_l[-1 + var4] = 0;
            fl.field_b[0] = 5;
          } else if (te.field_M != 2) {
            if (3 == te.field_M) {
              if (!wh.field_c.field_h) {
                var3_int = bk.a((byte) 3, ic.field_x, ke.field_H, si.field_A, w.field_c);
              } else {
                var3_int = bk.a((byte) 3, tg.field_K, ke.field_H, si.field_A, w.field_c);
              }
              var4 = 2 + var3_int;
              vc.field_d = new String[var4];
              oa.field_l = new int[var4];
              for (var5 = 0; var5 < var4; var5++) {
                oa.field_l[var5] = -1;
              }
              fl.field_b = new int[1];
              for (var5 = 0; var3_int > var5; var5++) {
                vc.field_d[var5] = w.field_c[var5];
              }
              vc.field_d[var4 - 2] = "";
              vc.field_d[var4 - 1] = le.field_a;
              oa.field_l[-1 + var4] = 0;
              fl.field_b[0] = 5;
            } else if (4 == te.field_M) {
              var3_int = bk.a((byte) 3, ak.field_c, ke.field_H, si.field_A, w.field_c);
              var4 = 2 + var3_int;
              oa.field_l = new int[var4];
              vc.field_d = new String[var4];
              for (var5 = 0; var4 > var5; var5++) {
                oa.field_l[var5] = -1;
              }
              fl.field_b = new int[1];
              for (var5 = 0; var3_int > var5; var5++) {
                vc.field_d[var5] = w.field_c[var5];
              }
              vc.field_d[var4 - 2] = "";
              vc.field_d[-1 + var4] = le.field_a;
              oa.field_l[var4 - 1] = 0;
              fl.field_b[0] = 5;
            } else {
              if (5 != te.field_M) {
                throw new IllegalArgumentException();
              }
              var3_int = bk.a((byte) 3, vh.field_b, ke.field_H, si.field_A, w.field_c);
              var4 = 3 + var3_int;
              oa.field_l = new int[var4];
              vc.field_d = new String[var4];
              for (var5 = 0; var4 > var5; var5++) {
                oa.field_l[var5] = -1;
              }
              fl.field_b = new int[2];
              for (var5 = 0; var5 < var3_int; var5++) {
                vc.field_d[var5] = w.field_c[var5];
              }
              vc.field_d[var4 - 3] = "";
              vc.field_d[var4 - 2] = fg.field_c;
              oa.field_l[var4 - 2] = 0;
              fl.field_b[0] = 3;
              vc.field_d[-1 + var4] = le.field_a;
              oa.field_l[var4 - 1] = 1;
              fl.field_b[1] = 5;
            }
          } else {
            var3_int = bk.a((byte) 3, bb.a(ef.field_f, new String[]{"<br><%0><br>"}, -63), ke.field_H, si.field_A, w.field_c);
            var4 = -1;
            for (var5 = 0; var3_int > var5; var5++) {
              if (!"<%0>".equals(w.field_c[var5])) {
                continue;
              }
              var4 = var5;
              break;
            }
            if (var4 == -1) {
              throw new IllegalStateException();
            }
            ak.field_b = new String[var4];
            fk.a(w.field_c, 0, ak.field_b, 0, var4);
            qc.field_h = new String[-1 + (var3_int - var4)];
            fk.a(w.field_c, var4 + 1, qc.field_h, 0, -var4 + (var3_int - 1));
            var3_int = bk.a((byte) 3, bb.a(ff.field_f, new String[]{"<br><%0><br>"}, -63), ke.field_H, si.field_A, w.field_c);
            var4 = -1;
            for (var5 = 0; var5 < var3_int; var5++) {
              if (!"<%0>".equals(w.field_c[var5])) {
                continue;
              }
              var4 = var5;
              break;
            }
            if (var4 == -1) {
              throw new IllegalStateException();
            }
            i.field_I = new String[var4];
            fk.a(w.field_c, 0, i.field_I, 0, var4);
            qa.field_o = new String[-1 - var4 + var3_int];
            fk.a(w.field_c, var4 + 1, qa.field_o, 0, var3_int - var4 - 1);
            if (i.field_I.length <= ak.field_b.length) {
              stackIn_64_0 = ak.field_b.length;
            } else {
              stackIn_64_0 = i.field_I.length;
            }
            var5 = stackIn_64_0;
            if (qa.field_o.length > qc.field_h.length) {
              stackIn_67_0 = qa.field_o.length;
            } else {
              stackIn_67_0 = qc.field_h.length;
            }
            var6 = stackIn_67_0;
            var7 = 7 + (var5 + var6);
            oa.field_l = new int[var7];
            vc.field_d = new String[var7];
            for (var8 = 0; var8 < var7; var8++) {
              oa.field_l[var8] = -1;
            }
            oa.field_l[1] = 0;
            vc.field_d[0] = si.field_D;
            fl.field_b = new int[2];
            vc.field_d[1] = cj.field_b;
            fl.field_b[0] = 5;
            fl.field_b[1] = 2;
            vc.field_d[4] = lg.field_r;
            vc.field_d[2] = ha.field_n;
            oa.field_l[3] = 1;
            vc.field_d[5] = "";
            vc.field_d[3] = qk.field_j;
            for (var8Lifetime2 = 0; var5 > var8Lifetime2; var8Lifetime2++) {
              stackIn_74_0 = vc.field_d;
              stackIn_74_1 = 6 + var8Lifetime2;
              if (i.field_I.length + var8Lifetime2 - var5 >= 0) {
                stackIn_75_2 = i.field_I[var8Lifetime2 + i.field_I.length - var5];
              } else {
                stackIn_75_2 = "";
              }
              stackIn_74_0[stackIn_74_1] = stackIn_75_2;
            }
            vc.field_d[6 + var5] = null;
            oa.field_l[6 + var5] = -2;
            for (var8Lifetime3 = 0; var8Lifetime3 < var6; var8Lifetime3++) {
              stackIn_80_0 = vc.field_d;
              stackIn_80_1 = 7 - (-var5 - var8Lifetime3);
              if (qa.field_o.length > var8Lifetime3) {
                stackIn_81_2 = qa.field_o[var8Lifetime3];
              } else {
                stackIn_81_2 = "";
              }
              stackIn_80_0[stackIn_80_1] = stackIn_81_2;
            }
            fg.field_f = je.a(1);
          }
          bc.field_K.field_g = fl.field_b.length;
          var3_intLifetime1 = 0;
          for (var4Lifetime1 = 0; var4Lifetime1 < vc.field_d.length; var4Lifetime1++) {
            stackIn_87_0 = vc.field_d[var4Lifetime1];
            stackIn_88_1 = !(oa.field_l[var4Lifetime1] < 0);
            var5Lifetime1 = fa.a(stackIn_87_0, stackIn_88_1, (byte) 99);
            if (var5Lifetime1 > var3_intLifetime1) {
              var3_intLifetime1 = var5Lifetime1;
            }
          }
          if (te.field_M == 2) {
            var10 = ak.field_b;
            var4_ref_String__ = var10;
            for (var5Lifetime2 = 0; var10.length > var5Lifetime2; var5Lifetime2++) {
              var11 = var10[var5Lifetime2];
              var7Lifetime1 = fa.a(var11, false, (byte) 99);
              if (var3_intLifetime1 < var7Lifetime1) {
                var3_intLifetime1 = var7Lifetime1;
              }
            }
            var4_ref_String__Lifetime1 = qc.field_h;
            for (var5Lifetime2Lifetime1 = 0; var4_ref_String__Lifetime1.length > var5Lifetime2Lifetime1; var5Lifetime2Lifetime1++) {
              var12 = var4_ref_String__Lifetime1[var5Lifetime2Lifetime1];
              var7Lifetime1Lifetime1 = fa.a(var12, false, (byte) 99);
              if (var7Lifetime1Lifetime1 > var3_intLifetime1) {
                var3_intLifetime1 = var7Lifetime1Lifetime1;
              }
            }
          }
          pk.field_ab = sb.field_d - (var3_intLifetime1 >> 1);
          dh.field_h = sb.field_d + var3_intLifetime1 - (var3_intLifetime1 >> 1);
          v.field_d = (g.field_l + vg.field_N << 1) * bc.field_K.field_g;
          for (var4Lifetime2 = 0; vc.field_d.length > var4Lifetime2; var4Lifetime2++) {
            stackIn_110_0 = v.field_d;
            if (oa.field_l[var4Lifetime2] < 0) {
              stackIn_111_1 = uc.field_i;
            } else {
              stackIn_111_1 = we.field_c;
            }
            v.field_d = stackIn_110_0 + stackIn_111_1;
          }
          th.field_J = -(v.field_d >> 1) + vk.field_m;
          og.field_j = new int[vc.field_d.length][];
          var4Lifetime3 = 0;
          if (!param1) {
            field_c = (hb) null;
          }
          var5Lifetime3 = th.field_J;
          while (var4Lifetime3 < vc.field_d.length) {
            var6Lifetime1 = oa.field_l[var4Lifetime3];
            if (var6Lifetime1 < 0) {
              var5Lifetime3 = var5Lifetime3 + uc.field_i;
            } else {
              var7Lifetime2 = fa.a(vc.field_d[var4Lifetime3], true, (byte) 99);
              var5Lifetime3 = var5Lifetime3 + vg.field_N;
              var8Lifetime1 = -(var7Lifetime2 >> 1) + sb.field_d;
              og.field_j[var4Lifetime3] = new int[4];
              og.field_j[var4Lifetime3][0] = var8Lifetime1 - bl.field_i;
              og.field_j[var4Lifetime3][1] = var5Lifetime3;
              og.field_j[var4Lifetime3][2] = (bl.field_i << 1) + var7Lifetime2;
              og.field_j[var4Lifetime3][3] = (g.field_l << 1) + we.field_c;
              var5Lifetime3 = var5Lifetime3 + (we.field_c + vg.field_N + (g.field_l << 1));
            }
            var4Lifetime3++;
          }
          if (te.field_M == 2) {
            bc.field_K.a(param0, -1, -1, 125);
          } else {
            bc.field_K.a(param0, 0, uc.a(gb.field_j, 1691746689, ad.field_m), 122);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fc.a((Throwable) ((Object) var3), "hc.D(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static String a(long param0, int param1) {
        pd.field_f.setTime(new Date(param0));
        int var3 = pd.field_f.get(7);
        int var4 = pd.field_f.get(5);
        if (param1 != -31289) {
          hc.a(85L, -27);
        }
        int var5 = pd.field_f.get(2);
        int var6 = pd.field_f.get(1);
        int var7 = pd.field_f.get(11);
        int var8 = pd.field_f.get(12);
        int var9 = pd.field_f.get(13);
        return na.field_j[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + li.field_h[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    static {
        field_a = new nc();
        field_e = new byte[250][];
        field_f = "Achieved";
    }
}
