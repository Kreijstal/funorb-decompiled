/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pg {
    static uh field_d;
    static String field_c;
    static int field_b;
    static String[] field_a;

    final static void a(int param0, boolean param1) {
        ni.field_l = param1 ? new rf(lb.field_H, w.field_e) : new rf(c.field_d, fm.field_C);
        dn.field_Cb = new hd(0L, (hd) null);
        if (param0 == -35) {
          dn.field_Cb.a((byte) -110, (hd) (ni.field_l.field_b));
          dn.field_Cb.a((byte) -126, ac.field_b);
          tn.field_f = new hd(0L, tv.field_e);
          vj.field_g = new hd(0L, (hd) null);
          tn.field_f.a((byte) -125, is.field_b);
          tn.field_f.a((byte) -105, vj.field_g);
          vj.field_g.a((byte) -124, mc.field_d);
          vj.field_g.a((byte) -119, kt.field_i);
          bq.a(93, param1);
          return;
        }
        field_c = (String) null;
        dn.field_Cb.a((byte) -110, (hd) (ni.field_l.field_b));
        dn.field_Cb.a((byte) -126, ac.field_b);
        tn.field_f = new hd(0L, tv.field_e);
        vj.field_g = new hd(0L, (hd) null);
        tn.field_f.a((byte) -125, is.field_b);
        tn.field_f.a((byte) -105, vj.field_g);
        vj.field_g.a((byte) -124, mc.field_d);
        vj.field_g.a((byte) -119, kt.field_i);
        bq.a(93, param1);
    }

    final static int a(int param0) {
        int stackIn_11_0 = 0;
        int stackIn_28_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        var7 = Kickabout.field_G;
        try {
          var1_int = 0;
          var2 = 0;
          while (nk.$cfr$intArgs$b$c4997cb15529(-59)) {
            ll.field_k.d(param0 + 101);
            if (ll.field_k.c(param0 + 2)) {
              var1_int = 1;
            }
            if (cc.field_e != 13) {
              continue;
            }
            var2 = 1;
          }
          ll.field_k.a(-21174, sj.a(el.field_A, n.field_m, (byte) -96), sj.a(sm.field_q, vc.field_y, (byte) -101));
          if (ll.field_k.c(-1)) {
            var1_int = 1;
          }
          if (param0 != -3) {
            stackIn_11_0 = -10;
            return stackIn_11_0;
          }
          var3 = 0;
          if (var1_int != 0 &&
            ll.field_k.field_e >= 0) {
            var3 = sh.field_f[ll.field_k.field_e];
            if (var3 == 2) {
              oc.a((byte) -43);
            } else if (var3 == 5) {
              oc.a((byte) -43);
            }
          } else {
            if (var2 != 0 &&
              ck.field_a != 2) {
              oc.a((byte) -16);
            }
          }
          if (var3 == 0 &&
            ck.field_a == 2) {
            var4 = -va.field_o + nj.a(param0 ^ -51);
            var6 = (int)((-var4 + 10999L) / 1000L);
            if (var6 <= 0) {
              ba.a(true, 6, 5);
              var3 = 2;
            }
          }
          stackIn_28_0 = var3;
          return stackIn_28_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var1), "pg.E(" + param0 + ')');
        }
    }

    final static String[] a(boolean param0, int param1) {
        if (param1 == 1) {
          return nn.field_I;
        }
        if (param1 == 9) {
          return rd.field_e;
        }
        if (10 == param1) {
          return rd.field_e;
        }
        if (param1 == 8) {
          return ow.field_d;
        }
        if (param1 == 11) {
          return fs.field_a;
        }
        if (param1 == 18) {
          return fs.field_a;
        }
        if (param1 == 19) {
          return fs.field_a;
        }
        if (param1 == 32) {
          return fs.field_a;
        }
        if (37 == param1) {
          return fs.field_a;
        }
        if (param1 == 24) {
          return fs.field_a;
        }
        if (param1 == 25) {
          return pd.field_M;
        }
        if (param0) {
          pg.a(false, -50);
        }
        if (23 == param1) {
          return vq.field_i;
        }
        if (param1 == 29) {
          return fs.field_a;
        }
        if (param1 == 34) {
          return fs.field_a;
        }
        if (param1 == 30) {
          return fs.field_a;
        }
        if (param1 == 21) {
          return si.field_q;
        }
        if (param1 == 20) {
          return fs.field_a;
        }
        return fp.field_u;
    }

    public static void b(int param0) {
        if (param0 <= 125) {
          return;
        }
        field_a = null;
        field_d = null;
        field_c = null;
    }

    final static gm a(int param0, int param1, up param2, int param3, int param4) {
        long var5_long = 0L;
        RuntimeException var5 = null;
        gm stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        up stackIn_8_0;
        int stackIn_8_1;
        int stackIn_8_2;
        up stackIn_8_3;
        int stackIn_8_4;
        boolean stackIn_9_5 = false;
        boolean stackIn_13_3;
        gm stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 >= -62) {
            stackIn_2_0 = (gm) null;
            return stackIn_2_0;
          }
          var5_long = nj.a(51);
          if (80L > -tr.field_d + var5_long) {
            stackIn_5_0 = null;
            return (gm) (stackIn_5_0);
          }
          tr.field_d = var5_long;
          stackIn_8_0 = (up) (param2);
          stackIn_8_1 = param1;
          stackIn_8_2 = param4;
          stackIn_8_3 = (up) (param2);
          stackIn_8_4 = -107;
          stackIn_9_5 = !(param2.f(13467));
          stackIn_13_3 = (((up) (Object) stackIn_8_3).c((byte) stackIn_8_4, stackIn_9_5)) && (wn.a((byte) 34));
          stackIn_14_0 = mg.a(stackIn_8_0, stackIn_8_1, stackIn_8_2, stackIn_13_3, param0, (byte) 106);
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_17_0 = var5;
          stackIn_17_1 = new StringBuilder().append("pg.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_c = "Close";
    }
}
