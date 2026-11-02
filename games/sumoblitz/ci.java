/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ci {
    private DualLinkNode[] field_a;
    static int[] field_e;
    static ri[] field_g;
    private DualLinkNode field_c;
    private int field_f;
    private long field_d;
    static int[] field_b;

    public static void b(int param0) {
        field_b = null;
        field_g = null;
        if (param0 != 8192) {
          ci.b(-5);
          field_e = null;
          return;
        }
        field_e = null;
    }

    final DualLinkNode a(int param0) {
        DualLinkNode var2;
        DualLinkNode var3;
        int var4;
        DualLinkNode var2Lifetime1;
        DualLinkNode var3Lifetime1;
        var4 = Sumoblitz.field_L ? 1 : 0;
        if (this.field_c == null) {
          return null;
        }
        if (param0 <= -102) {
          var2 = this.field_a[(int)((long)(-1 + this.field_f) & this.field_d)];
          while (true) {
            if (this.field_c == var2) {
              this.field_c = null;
              return null;
            }
            if (this.field_d != this.field_c.field_l) {
              this.field_c = this.field_c.field_m;
              continue;
            }
            break;
          }
          var3 = this.field_c;
          this.field_c = this.field_c.field_m;
          return var3;
        }
        this.field_c = (DualLinkNode) null;
        var2Lifetime1 = this.field_a[(int)((long)(-1 + this.field_f) & this.field_d)];
        while (true) {
          if (this.field_c == var2Lifetime1) {
            this.field_c = null;
            return null;
          }
          if (this.field_d != this.field_c.field_l) {
            this.field_c = this.field_c.field_m;
            continue;
          }
          break;
        }
        var3Lifetime1 = this.field_c;
        this.field_c = this.field_c.field_m;
        return var3Lifetime1;
    }

    final void a(long param0, int param1, DualLinkNode param2) {
        if (null != param2.field_o) {
          param2.c(-5106);
        }
        DualLinkNode var5 = this.field_a[(int)((long)(this.field_f - 1) & param0)];
        param2.field_o = var5.field_o;
        if (param1 != -8156) {
          return;
        }
        try {
          param2.field_m = var5;
          param2.field_o.field_m = param2;
          param2.field_m.field_o = param2;
          param2.field_l = param0;
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "ci.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final DualLinkNode a(long param0, int param1) {
        DualLinkNode var4;
        int var5;
        DualLinkNode var6;
        int var7;
        var7 = Sumoblitz.field_L ? 1 : 0;
        this.field_d = param0;
        var5 = 121 % ((17 - param1) / 56);
        var4 = this.field_a[(int)((long)(-1 + this.field_f) & param0)];
        this.field_c = var4.field_m;
        while (true) {
          if (var4 == this.field_c) {
            this.field_c = null;
            return null;
          }
          if (this.field_c.field_l != param0) {
            this.field_c = this.field_c.field_m;
            continue;
          }
          break;
        }
        var6 = this.field_c;
        this.field_c = this.field_c.field_m;
        return var6;
    }

    ci(int param0) {
        int var2 = 0;
        DualLinkNode dupTemp$0 = null;
        DualLinkNode var3 = null;
        this.field_a = new DualLinkNode[param0];
        this.field_f = param0;
        for (var2 = 0; param0 > var2; var2++) {
          dupTemp$0 = new DualLinkNode();
          var3 = dupTemp$0;
          this.field_a[var2] = dupTemp$0;
          var3.field_o = var3;
          var3.field_m = var3;
        }
    }

    static {
        field_e = new int[16];
        field_b = new int[8192];
    }
}
