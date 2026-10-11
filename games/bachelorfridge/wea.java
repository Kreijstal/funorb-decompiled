/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wea extends at {
    private int field_k;
    private gj field_j;
    private vg field_l;

    final static int b(boolean param0) {
        if (param0) {
          return 48;
        }
        if (2 > lk.field_r) {
          return 0;
        }
        if (kt.field_k == 0) {
          if (!bv.field_B.a(0)) {
            return 20;
          }
          if (!bv.field_B.a("commonui", 20637)) {
            return 40;
          }
          if (!fi.field_n.a(0)) {
            return 50;
          }
          if (!fi.field_n.a("commonui", 20637)) {
            return 60;
          }
          if (!em.field_T.a(0)) {
            return 70;
          }
          if (em.field_T.b((byte) 114)) {
            return 100;
          }
          return 80;
        }
        if (null != lh.field_s) {
          if (!lh.field_s.a(0)) {
            return 14;
          }
          if (!lh.field_s.b("", false)) {
            return 29;
          }
          if (!lh.field_s.a("", 20637)) {
            return 29;
          }
        }
        if (!bv.field_B.a(0)) {
          return 43;
        }
        if (!bv.field_B.a("commonui", 20637)) {
          return 57;
        }
        if (!fi.field_n.a(0)) {
          return 71;
        }
        if (!fi.field_n.a("commonui", 20637)) {
          return 80;
        }
        if (!em.field_T.a(0)) {
          return 82;
        }
        if (!em.field_T.b((byte) 120)) {
          return 86;
        }
        return 100;
    }

    final boolean c(byte param0) {
        int fieldTemp$1 = 0;
        int fieldTemp$0 = 0;
        bf var2_ref_bf;
        int var2;
        int var4;
        ad var5;
        ad var6;
        int var2Lifetime1;
        var4 = BachelorFridge.field_y;
        if (this.field_k != 25) {
          var2 = -45 % ((param0 - 71) / 47);
          fieldTemp$1 = this.field_k - 1;
          this.field_k = this.field_k - 1;
          if (fieldTemp$1 == 0) {
            return true;
          }
          return false;
        }
        var2_ref_bf = (bf) (this.field_l.field_m.b((byte) 90));
        while (var2_ref_bf != null) {
          if (!(var2_ref_bf instanceof qja)) {
            if (!(var2_ref_bf instanceof dla)) {
              var2_ref_bf = (bf) (this.field_l.field_m.c(0));
              continue;
            }
            var6 = ((dla) (var2_ref_bf)).field_n.a(-27449, this.field_j);
            if (!var6.field_s.i(81) &&
              var6.field_f.field_s != 6) {
              var6.b(-1, 5);
            }
          } else {
            var5 = ((qja) (var2_ref_bf)).field_i.a(-27449, this.field_j);
            if (!var5.field_s.i(98) &&
              var5.field_f.field_s != 3) {
              var5.b(-1, 7);
            }
          }
          var2_ref_bf = (bf) (this.field_l.field_m.c(0));
        }
        var2Lifetime1 = -45 % ((param0 - 71) / 47);
        fieldTemp$0 = this.field_k - 1;
        this.field_k = this.field_k - 1;
        if (fieldTemp$0 == 0) {
          return true;
        }
        return false;
    }

    wea(gj param0, vg param1) {
        try {
          this.field_j = param0;
          this.field_l = param1;
          this.field_k = 25;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "wea.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
