/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cc {
    private int field_b;
    private int field_a;
    private int field_c;
    static int field_e;
    private int field_d;

    private final void a(int param0) {
        int var2 = 0;
        var2 = qo.a(-8905, (long)((cc) this).field_a, (long)((cc) this).field_a) + qo.a(-8905, (long)((cc) this).field_b, (long)((cc) this).field_b) - (-qo.a(-8905, (long)((cc) this).field_c, (long)((cc) this).field_c) - qo.a(-8905, (long)((cc) this).field_d, (long)((cc) this).field_d));
        if (param0 > 34) {
          if (var2 >= 65535) {
            if (65537 < var2) {
              var2 = pc.a(var2, -524289);
              ((cc) this).field_a = bw.a((long)var2, 249299984, (long)((cc) this).field_a);
              ((cc) this).field_b = bw.a((long)var2, 249299984, (long)((cc) this).field_b);
              ((cc) this).field_c = bw.a((long)var2, 249299984, (long)((cc) this).field_c);
              ((cc) this).field_d = bw.a((long)var2, 249299984, (long)((cc) this).field_d);
              return;
            } else {
              return;
            }
          } else {
            var2 = pc.a(var2, -524289);
            ((cc) this).field_a = bw.a((long)var2, 249299984, (long)((cc) this).field_a);
            ((cc) this).field_b = bw.a((long)var2, 249299984, (long)((cc) this).field_b);
            ((cc) this).field_c = bw.a((long)var2, 249299984, (long)((cc) this).field_c);
            ((cc) this).field_d = bw.a((long)var2, 249299984, (long)((cc) this).field_d);
            return;
          }
        } else {
          return;
        }
    }

    final void a(cc param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var3 = qo.a(-8905, (long)param0.field_a, (long)((cc) this).field_a) - (qo.a(-8905, (long)param0.field_b, (long)((cc) this).field_b) - (-qo.a(-8905, (long)param0.field_c, (long)((cc) this).field_c) + -qo.a(-8905, (long)param0.field_d, (long)((cc) this).field_d)));
        var4 = qo.a(-8905, (long)param0.field_a, (long)((cc) this).field_b) + (qo.a(-8905, (long)param0.field_b, (long)((cc) this).field_a) + (qo.a(-8905, (long)param0.field_c, (long)((cc) this).field_d) + -qo.a(-8905, (long)param0.field_d, (long)((cc) this).field_c)));
        var5 = qo.a(-8905, (long)param0.field_a, (long)((cc) this).field_c) - (qo.a(-8905, (long)param0.field_b, (long)((cc) this).field_d) + -qo.a(-8905, (long)param0.field_c, (long)((cc) this).field_a)) + qo.a(-8905, (long)param0.field_d, (long)((cc) this).field_b);
        if (param1 > -28) {
          this.a(122);
          ((cc) this).field_d = qo.a(-8905, (long)param0.field_a, (long)((cc) this).field_d) - -qo.a(-8905, (long)param0.field_b, (long)((cc) this).field_c) - (qo.a(-8905, (long)param0.field_c, (long)((cc) this).field_b) + -qo.a(-8905, (long)param0.field_d, (long)((cc) this).field_a));
          ((cc) this).field_a = var3;
          ((cc) this).field_c = var5;
          ((cc) this).field_b = var4;
          this.a(62);
          return;
        } else {
          ((cc) this).field_d = qo.a(-8905, (long)param0.field_a, (long)((cc) this).field_d) - -qo.a(-8905, (long)param0.field_b, (long)((cc) this).field_c) - (qo.a(-8905, (long)param0.field_c, (long)((cc) this).field_b) + -qo.a(-8905, (long)param0.field_d, (long)((cc) this).field_a));
          ((cc) this).field_a = var3;
          ((cc) this).field_c = var5;
          ((cc) this).field_b = var4;
          this.a(62);
          return;
        }
    }

    final void a(int param0, boolean param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        param4 = param4 >> 1;
        if (!param1) {
          var8 = null;
          ((cc) this).a((cc) null, 27);
          var6 = rn.b(param4, 3);
          var7 = sb.a(param4, -127);
          ((cc) this).field_a = var7;
          ((cc) this).field_b = qo.a(-8905, (long)param3, (long)var6);
          ((cc) this).field_c = qo.a(-8905, (long)param0, (long)var6);
          ((cc) this).field_d = qo.a(-8905, (long)param2, (long)var6);
          return;
        } else {
          var6 = rn.b(param4, 3);
          var7 = sb.a(param4, -127);
          ((cc) this).field_a = var7;
          ((cc) this).field_b = qo.a(-8905, (long)param3, (long)var6);
          ((cc) this).field_c = qo.a(-8905, (long)param0, (long)var6);
          ((cc) this).field_d = qo.a(-8905, (long)param2, (long)var6);
          return;
        }
    }

    final void a(int param0, int[] param1) {
        int var3 = qo.a(-8905, (long)((cc) this).field_a, (long)((cc) this).field_a);
        int var4 = qo.a(-8905, (long)((cc) this).field_a, (long)((cc) this).field_b);
        int var5 = qo.a(-8905, (long)((cc) this).field_a, (long)((cc) this).field_c);
        int var6 = qo.a(-8905, (long)((cc) this).field_a, (long)((cc) this).field_d);
        int var7 = qo.a(-8905, (long)((cc) this).field_b, (long)((cc) this).field_b);
        int var8 = qo.a(-8905, (long)((cc) this).field_b, (long)((cc) this).field_c);
        int var9 = qo.a(-8905, (long)((cc) this).field_b, (long)((cc) this).field_d);
        int var10 = qo.a(-8905, (long)((cc) this).field_c, (long)((cc) this).field_c);
        int var11 = qo.a(param0 ^ -8897, (long)((cc) this).field_c, (long)((cc) this).field_d);
        int var12 = qo.a(param0 ^ -8897, (long)((cc) this).field_d, (long)((cc) this).field_d);
        param1[4] = var6 + (var8 - (-var6 + -var8));
        param1[7] = -var12 + (var10 + var3 + -var7);
        param1[9] = var5 + (var9 + var5 + var9);
        param1[5] = -var5 + -var5 + (var9 + var9);
        param1[10] = -var4 + (-var4 + (var11 + var11));
        param1[3] = -var10 + var7 - (-var3 + var12);
        param1[11] = -var7 + -var10 + (var3 + var12);
        param1[6] = var8 + -var6 + var8 + -var6;
        param1[param0] = var4 + var11 + (var11 - -var4);
    }

    public cc() {
        ((cc) this).field_a = 65536;
    }

    static {
    }
}
