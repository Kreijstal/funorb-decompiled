/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sn {
    static mf field_c;
    private boolean field_e;
    static long field_d;
    static boolean[] field_b;
    private String field_a;

    final static void c(int param0) {
        int var1;
        int var2;
        int var3;
        var1 = l.a(-8462, od.field_q);
        var2 = vh.f(127);
        if (param0 != -1) {
          field_b = (boolean[]) null;
        }
        if (var1 != od.field_q ||
          hn.field_l.field_h != var2) {
          var3 = di.field_d.field_j ? 1 : 0;
          ll.a(0, var1, var3 != 0, var2);
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_c = null;
        if (param0 > -66) {
          field_c = (mf) null;
        }
    }

    final static void a(int param0, int param1, boolean param2) {
        int stackIn_52_0 = 0;
        int stackIn_55_0 = 0;
        String[] stackIn_62_0 = null;
        int stackIn_62_1 = 0;
        String stackIn_63_2 = null;
        String[] stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        int stackIn_67_2 = 0;
        int stackIn_67_3 = 0;
        String stackIn_70_2 = null;
        int stackIn_90_0 = 0;
        String stackIn_90_1 = null;
        boolean stackIn_91_2 = false;
        int stackIn_112_0 = 0;
        int stackIn_113_1 = 0;
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
        var9 = EscapeVector.field_A;
        try {
          tb.field_D = true;
          f.field_j = param0;
          if (f.field_j == 0) {
            var3_int = un.a(pf.field_e, -118, nb.field_a, sb.field_h, ac.field_a);
            var4 = var3_int + 3;
            jj.field_a = new int[var4];
            s.field_I = new String[var4];
            for (var5 = 0; var5 < var4; var5++) {
              jj.field_a[var5] = -1;
            }
            wh.field_j = new int[2];
            for (var5 = 0; var3_int > var5; var5++) {
              s.field_I[var5] = pf.field_e[var5];
            }
            s.field_I[var4 - 3] = "";
            s.field_I[var4 - 2] = lh.field_a;
            jj.field_a[-2 + var4] = 0;
            wh.field_j[0] = 4;
            s.field_I[var4 - 1] = ah.field_k;
            jj.field_a[-1 + var4] = 1;
            wh.field_j[1] = 5;
          } else if (f.field_j == 1) {
            var3_int = un.a(pf.field_e, -126, nb.field_a, sb.field_h, ac.field_a);
            var4 = 2 + var3_int;
            s.field_I = new String[var4];
            jj.field_a = new int[var4];
            for (var5 = 0; var4 > var5; var5++) {
              jj.field_a[var5] = -1;
            }
            wh.field_j = new int[1];
            for (var5 = 0; var5 < var3_int; var5++) {
              s.field_I[var5] = pf.field_e[var5];
            }
            s.field_I[-2 + var4] = "";
            s.field_I[-1 + var4] = ah.field_k;
            jj.field_a[var4 - 1] = 0;
            wh.field_j[0] = 5;
          } else if (f.field_j != 2) {
            if (f.field_j == 3) {
              if (!g.field_r.field_f) {
                var3_int = un.a(pf.field_e, param1 ^ 114, nb.field_a, sb.field_h, tj.field_k);
              } else {
                var3_int = un.a(pf.field_e, -122, nb.field_a, sb.field_h, aj.field_e);
              }
              var4 = 2 + var3_int;
              s.field_I = new String[var4];
              jj.field_a = new int[var4];
              for (var5 = 0; var4 > var5; var5++) {
                jj.field_a[var5] = -1;
              }
              wh.field_j = new int[1];
              for (var5 = 0; var3_int > var5; var5++) {
                s.field_I[var5] = pf.field_e[var5];
              }
              s.field_I[-2 + var4] = "";
              s.field_I[-1 + var4] = ah.field_k;
              jj.field_a[var4 - 1] = 0;
              wh.field_j[0] = 5;
            } else if (f.field_j == 4) {
              var3_int = un.a(pf.field_e, -110, nb.field_a, sb.field_h, ol.field_K);
              var4 = var3_int + 2;
              s.field_I = new String[var4];
              jj.field_a = new int[var4];
              for (var5 = 0; var4 > var5; var5++) {
                jj.field_a[var5] = -1;
              }
              wh.field_j = new int[1];
              for (var5 = 0; var3_int > var5; var5++) {
                s.field_I[var5] = pf.field_e[var5];
              }
              s.field_I[var4 - 2] = "";
              s.field_I[-1 + var4] = ah.field_k;
              jj.field_a[var4 - 1] = 0;
              wh.field_j[0] = 5;
            } else {
              if (5 != f.field_j) {
                throw new IllegalArgumentException();
              }
              var3_int = un.a(pf.field_e, 122, nb.field_a, sb.field_h, eg.field_a);
              var4 = 3 + var3_int;
              s.field_I = new String[var4];
              jj.field_a = new int[var4];
              for (var5 = 0; var4 > var5; var5++) {
                jj.field_a[var5] = -1;
              }
              wh.field_j = new int[2];
              for (var5 = 0; var5 < var3_int; var5++) {
                s.field_I[var5] = pf.field_e[var5];
              }
              s.field_I[var4 - 3] = "";
              s.field_I[-2 + var4] = ve.field_f;
              jj.field_a[var4 - 2] = 0;
              wh.field_j[0] = 3;
              s.field_I[-1 + var4] = ah.field_k;
              jj.field_a[-1 + var4] = 1;
              wh.field_j[1] = 5;
            }
          } else {
            var3_int = un.a(pf.field_e, -101, nb.field_a, sb.field_h, r.a(fn.field_d, -63, new String[]{"<br><%0><br>"}));
            var4 = -1;
            for (var5 = 0; var5 < var3_int; var5++) {
              if (!"<%0>".equals(pf.field_e[var5])) {
                continue;
              }
              var4 = var5;
              break;
            }
            if (-1 == var4) {
              throw new IllegalStateException();
            }
            tg.field_nb = new String[var4];
            qg.a(pf.field_e, 0, tg.field_nb, 0, var4);
            nn.field_i = new String[-1 - var4 + var3_int];
            qg.a(pf.field_e, 1 + var4, nn.field_i, 0, -var4 + (var3_int - 1));
            var4 = -1;
            var3_int = un.a(pf.field_e, param1 ^ 71, nb.field_a, sb.field_h, r.a(al.field_c, param1 ^ -63, new String[]{"<br><%0><br>"}));
            for (var5 = 0; var3_int > var5; var5++) {
              if (!"<%0>".equals(pf.field_e[var5])) {
                continue;
              }
              var4 = var5;
              break;
            }
            if (var4 == -1) {
              throw new IllegalStateException();
            }
            qm.field_f = new String[var4];
            qg.a(pf.field_e, 0, qm.field_f, 0, var4);
            tb.field_G = new String[var3_int - var4 - 1];
            qg.a(pf.field_e, 1 + var4, tb.field_G, 0, -1 + var3_int - var4);
            if (qm.field_f.length > tg.field_nb.length) {
              stackIn_52_0 = qm.field_f.length;
            } else {
              stackIn_52_0 = tg.field_nb.length;
            }
            var5 = stackIn_52_0;
            if (nn.field_i.length >= tb.field_G.length) {
              stackIn_55_0 = nn.field_i.length;
            } else {
              stackIn_55_0 = tb.field_G.length;
            }
            var6 = stackIn_55_0;
            var7 = var5 + 7 + var6;
            jj.field_a = new int[var7];
            s.field_I = new String[var7];
            for (var8 = 0; var8 < var7; var8++) {
              jj.field_a[var8] = -1;
            }
            wh.field_j = new int[2];
            jj.field_a[1] = 0;
            s.field_I[1] = jh.field_j;
            s.field_I[0] = td.field_a;
            s.field_I[2] = bb.field_I;
            wh.field_j[0] = 5;
            jj.field_a[3] = 1;
            s.field_I[5] = "";
            s.field_I[4] = p.field_e;
            s.field_I[3] = bb.field_J;
            wh.field_j[1] = 2;
            for (var8Lifetime2 = 0; var8Lifetime2 < var5; var8Lifetime2++) {
              stackIn_62_0 = s.field_I;
              stackIn_62_1 = 6 + var8Lifetime2;
              if (qm.field_f.length + var8Lifetime2 - var5 < 0) {
                stackIn_63_2 = "";
              } else {
                stackIn_63_2 = qm.field_f[-var5 + (qm.field_f.length + var8Lifetime2)];
              }
              stackIn_62_0[stackIn_62_1] = stackIn_63_2;
            }
            s.field_I[6 + var5] = null;
            jj.field_a[var5 + 6] = -2;
            for (var8Lifetime3 = 0; var6 > var8Lifetime3; var8Lifetime3++) {
              stackIn_67_0 = s.field_I;
              stackIn_67_1 = var8Lifetime3 + var5 + 7;
              stackIn_67_2 = ~var8Lifetime3;
              stackIn_67_3 = ~tb.field_G.length;
              if (stackIn_67_2 > stackIn_67_3) {
                stackIn_70_2 = tb.field_G[var8Lifetime3];
              } else {
                stackIn_70_2 = "";
              }
              stackIn_67_0[stackIn_67_1] = stackIn_70_2;
            }
            bd.field_k = td.b(128);
          }
          cb.field_c.field_k = wh.field_j.length;
          var3_intLifetime1 = 0;
          for (var4Lifetime1 = 0; var4Lifetime1 < s.field_I.length; var4Lifetime1++) {
            stackIn_90_0 = 25;
            stackIn_90_1 = s.field_I[var4Lifetime1];
            stackIn_91_2 = !(0 > jj.field_a[var4Lifetime1]);
            var5Lifetime1 = ee.a(stackIn_90_0, stackIn_90_1, stackIn_91_2);
            if (var3_intLifetime1 < var5Lifetime1) {
              var3_intLifetime1 = var5Lifetime1;
            }
          }
          if (2 == f.field_j) {
            var10 = tg.field_nb;
            var4_ref_String__ = var10;
            for (var5Lifetime2 = 0; var5Lifetime2 < var10.length; var5Lifetime2++) {
              var11 = var10[var5Lifetime2];
              var7Lifetime1 = ee.a(param1 ^ -92, var11, false);
              if (var3_intLifetime1 < var7Lifetime1) {
                var3_intLifetime1 = var7Lifetime1;
              }
            }
            var4_ref_String__Lifetime1 = nn.field_i;
            for (var5Lifetime2Lifetime1 = 0; var5Lifetime2Lifetime1 < var4_ref_String__Lifetime1.length; var5Lifetime2Lifetime1++) {
              var12 = var4_ref_String__Lifetime1[var5Lifetime2Lifetime1];
              var7Lifetime1Lifetime1 = ee.a(-104, var12, false);
              if (var7Lifetime1Lifetime1 > var3_intLifetime1) {
                var3_intLifetime1 = var7Lifetime1Lifetime1;
              }
            }
          }
          vi.field_a = -(var3_intLifetime1 >> 1) + rn.field_e + var3_intLifetime1;
          ia.field_x = rn.field_e - (var3_intLifetime1 >> 1);
          mh.field_f = cb.field_c.field_k * (hn.field_s + en.field_k << 1);
          for (var4Lifetime2 = param1; s.field_I.length > var4Lifetime2; var4Lifetime2++) {
            stackIn_112_0 = mh.field_f;
            if (jj.field_a[var4Lifetime2] < 0) {
              stackIn_113_1 = je.field_b;
            } else {
              stackIn_113_1 = ok.field_a;
            }
            mh.field_f = stackIn_112_0 + stackIn_113_1;
          }
          hi.field_o = ng.field_nb - (mh.field_f >> 1);
          cj.field_d = new int[s.field_I.length][];
          var4Lifetime3 = 0;
          var5Lifetime3 = hi.field_o;
          while (s.field_I.length > var4Lifetime3) {
            var6Lifetime1 = jj.field_a[var4Lifetime3];
            if (var6Lifetime1 >= 0) {
              var7Lifetime2 = ee.a(param1 ^ 61, s.field_I[var4Lifetime3], true);
              var5Lifetime3 = var5Lifetime3 + hn.field_s;
              var8Lifetime1 = rn.field_e - (var7Lifetime2 >> 1);
              cj.field_d[var4Lifetime3] = new int[4];
              cj.field_d[var4Lifetime3][0] = var8Lifetime1 - fe.field_k;
              cj.field_d[var4Lifetime3][1] = var5Lifetime3;
              cj.field_d[var4Lifetime3][2] = (fe.field_k << 1) + var7Lifetime2;
              cj.field_d[var4Lifetime3][3] = (en.field_k << 1) + ok.field_a;
              var5Lifetime3 = var5Lifetime3 + (hn.field_s + (en.field_k << 1) + ok.field_a);
            } else {
              var5Lifetime3 = var5Lifetime3 + je.field_b;
            }
            var4Lifetime3++;
          }
          if (2 != f.field_j) {
            cb.field_c.a(param1 ^ 90, param2, hk.a((byte) 122, dh.field_d, bj.field_y), 0);
          } else {
            cb.field_c.a(param1 + 91, param2, -1, -1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var3), "sn.E(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final boolean b(int param0) {
        if (param0 <= 75) {
          return true;
        }
        return this.field_e;
    }

    sn(String param0) {
        this(param0, false);
    }

    sn(String param0, boolean param1) {
        RuntimeException runtimeException = null;
        boolean stackIn_4_1 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_a = param0;
          stackIn_4_1 = (param1);
          this.field_e = stackIn_4_1;
          if (this.field_a == null) {
            this.field_a = "";
          }
          if (this.field_a.length() == 0) {
            this.field_e = false;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_11_0 = runtimeException;
          stackIn_11_1 = new StringBuilder().append("sn.<init>(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    final String a(int param0) {
        if (param0 > -67) {
          sn.a(119, -87, true);
        }
        return this.field_a;
    }

    static {
        field_d = 20000000L;
        field_b = new boolean[64];
    }
}
