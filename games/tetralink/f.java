/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class f extends gb {
    static hl field_x;
    static String field_w;
    static String[] field_A;
    static String field_t;
    static int field_z;
    private int field_y;
    pc[] field_u;
    private byte[][] field_v;

    public static void c(byte param0) {
        field_A = null;
        field_w = null;
        if (param0 != 87) {
          field_w = (String) null;
        }
        field_x = null;
        field_t = null;
    }

    final boolean b(byte param0) {
        int var2;
        int var3_int;
        je var3;
        int var4;
        int var6;
        bh var8;
        int var9;
        Object var10;
        oe var11;
        int var12;
        int var13;
        bh var16;
        int[] var27;
        byte[] var28;
        int[] var29;
        byte[] var30;
        int var3_intLifetime1;
        int var6Lifetime1;
        var12 = TetraLink.field_J;
        if (null != this.field_u) {
          return true;
        }
        if (null == this.field_v) {
          if (!lj.field_c.d(this.field_y, 0)) {
            return false;
          }
          var27 = lj.field_c.c(this.field_y, param0 ^ -106);
          this.field_v = new byte[var27.length][];
          for (var3_int = 0; var3_int < var27.length; var3_int++) {
            this.field_v[var3_int] = lj.field_c.a(-107, var27[var3_int], this.field_y);
          }
        }
        var2 = 1;
        var13 = 0;
        var3_intLifetime1 = var13;
        while (this.field_v.length > var13) {
          var28 = this.field_v[var13];
          var16 = new bh(var28);
          var16.field_t = 1;
          var6 = var16.e(param0 ^ -23);
          var2 = var2 != 0 & nn.field_T.f(var6, 88) ? 1 : 0;
          var13++;
        }
        if (var2 == 0) {
          return false;
        }
        var3 = new je();
        var4 = lj.field_c.b(-23126, this.field_y);
        this.field_u = new pc[var4];
        if (param0 != -106) {
          field_z = -125;
        }
        var29 = lj.field_c.c(this.field_y, param0 ^ -106);
        for (var6Lifetime1 = 0; var6Lifetime1 < var29.length; var6Lifetime1++) {
          var30 = this.field_v[var6Lifetime1];
          var8 = new bh(var30);
          var8.field_t = 1;
          var9 = var8.e(127);
          var10 = null;
          var11 = (oe) (var3.c(false));
          while (var11 != null) {
            if (~var9 != ~var11.field_o) {
              var11 = (oe) (var3.a((byte) -70));
              continue;
            }
            var10 = var11;
            break;
          }
          if (var10 == null) {
            var10 = new oe(var9, nn.field_T.a(0, var9));
            var3.a((mc) (var10), false);
          }
          this.field_u[var29[var6Lifetime1]] = new pc(var30, (oe) (var10));
        }
        this.field_v = (byte[][]) null;
        return true;
    }

    f(int param0) {
        this.field_y = param0;
    }

    static {
        field_A = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
        field_t = "Type your email address again to make sure it's correct";
        field_w = "Unable to add name - system busy";
    }
}
