/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class doa {
    private va field_a;

    final static jua a(String param0, int param1, byte param2) {
        jua var3 = null;
        var3 = new jua(false);
        var3.field_b = param0;
        var3.field_f = param1;
        if (param2 != 114) {
          int discarded$2 = doa.a(-6, 122, 25);
          return var3;
        } else {
          return var3;
        }
    }

    final static int a(int param0, int param1, int param2) {
        if (param0 != 2) {
            return -126;
        }
        return gqa.a(param2, (byte) 24, param1 >> 434451208) << 1759462184;
    }

    final static g b(int param0, int param1, int param2) {
        g[] var3 = null;
        int var4 = 0;
        g var5 = null;
        int var6 = 0;
        g[] var7 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        var7 = cm.field_a[param2].field_c;
        var3 = var7;
        var4 = param1;
        L0: while (true) {
          if (var7.length > var4) {
            var5 = var7[var4];
            if (var5.field_f != param0) {
              var4++;
              continue L0;
            } else {
              return var5;
            }
          } else {
            return null;
          }
        }
    }

    doa() {
        qf discarded$0 = new qf(786336);
        int discarded$1 = bia.a((byte) 93, 1600);
    }

    final void a(int param0, cka param1) {
        Object var4 = null;
        ((doa) this).field_a = param1.a(196584, (byte[]) null, 24, true, (byte) 88);
        tj discarded$9 = new tj(((doa) this).field_a, 5126, 2, 0);
        tj discarded$10 = new tj(((doa) this).field_a, 5126, 3, 8);
        if (param0 != 22091) {
          var4 = null;
          ((doa) this).a(19, (cka) null);
          tj discarded$11 = new tj(((doa) this).field_a, 5121, 4, 20);
          return;
        } else {
          tj discarded$12 = new tj(((doa) this).field_a, 5121, 4, 20);
          return;
        }
    }

    static {
    }
}
