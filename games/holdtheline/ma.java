/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ma extends hl {
    int[] field_j;
    static uf field_l;
    boolean field_i;
    static int field_k;
    int field_m;

    public static void a(byte param0) {
        if (param0 > -48) {
          field_l = (uf) null;
        }
        field_l = null;
    }

    final static void a(boolean param0, da param1, int param2) {
        int var3_int = 0;
        int var4 = 0;
        da var5 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0) {
            var5 = (da) null;
            ma.a(true, (da) null, -15);
          }
          var3_int = jn.a(16, (byte) -96, param1);
          var4 = d.field_c[param2];
          if (var4 != -1 && (var4 < var3_int ||
            var3_int == -1)) {
            ad.field_a = true;
            return;
          }
          d.field_c[param2] = var3_int;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("ma.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(')').toString());
        }
    }

    final static boolean a(int[] param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = HoldTheLine.field_D;
        try {
          if (param1 != -1) {
            return true;
          }
          var2_int = 0;
          while (true) {
            if (var2_int >= param0.length) {
              return false;
            }
            if (!lk.field_g[param0[var2_int]]) {
              var2_int++;
              continue;
            }
            break;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("ma.C(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    final static boolean a(int param0) {
        if (param0 != 0) {
          return true;
        }
        return ao.a(en.a(97), false);
    }

    final static void a(int param0, boolean param1) {
        int var3;
        var3 = HoldTheLine.field_D;
        if (param0 != -21383) {
          ma.a((byte) 26);
        }
        if (pf.a((byte) 20, kn.b((byte) -49).field_p) != 0) {
          return;
        }
        eb.field_o = null;
        ii.field_c = 0;
        qd.a(20830, 3 + cf.field_w);
        ek.field_x = 3;
        pe.field_g = new int[4];
        if (7 != mi.field_d) {
          if (1 != mi.field_d &&
            !wb.field_c) {
            em.field_o = false;
          }
          bn.a(1, param0 ^ 21498);
          nm.field_b = kn.b((byte) -49);
          if (pd.a(nm.field_b, true)) {
            bl.field_r = new sg(nm.field_b, mi.field_d, wb.field_c, em.field_o, t.field_l, ah.field_b);
          } else {
            sk.field_i = ah.field_b;
            ca.field_r = mi.field_d;
            bl.field_r = null;
            on.field_r = t.field_l;
            qn.field_k = em.field_o;
            fl.field_j = wb.field_c;
          }
          kk.field_j = true;
          wm.a(param1, false, -1);
        } else {
          wb.field_c = false;
          kk.field_l = 4;
          t.field_j = new int[4];
          em.field_o = false;
          ah.field_b = -1;
          dk.field_g = 3;
          eg.field_a = vg.field_P;
          kk.field_m = new int[pc.field_l[cf.field_w]];
          ni.field_b = 859978912;
          hn.field_y = 0;
          nj.field_d = 1913842707 + ((1 & cf.field_w) << 1) + ((2 & cf.field_w) >> 1);
          tn.field_c = -1134004831;
          cm.field_a = -1329759026;
          t.field_l = go.field_g[kn.b((byte) -49).field_p][0];
          ij.a(param1, -79);
          ((ti) (l.field_a[10])).field_t = 480.0f;
        }
    }

    ma() {
        this.field_i = false;
    }

    static {
        field_k = 1;
    }
}
