/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vp {
    static String field_g;
    static dl field_d;
    private long field_f;
    private int field_h;
    static int[] field_a;
    private DualLinkNode field_c;
    static dl[][] field_i;
    private DualLinkNode[] field_e;
    static int field_b;

    final DualLinkNode b(int param0) {
        DualLinkNode var3 = null;
        int var4 = CrazyCrystals.field_B;
        if (this.field_c == null) {
          return null;
        }
        DualLinkNode var2 = this.field_e[(int)(this.field_f & (long)(this.field_h - 1))];
        while (var2 != this.field_c) {
          if (this.field_f == this.field_c.field_k) {
            var3 = this.field_c;
            this.field_c = this.field_c.field_j;
            return var3;
          }
          this.field_c = this.field_c.field_j;
        }
        this.field_c = null;
        if (param0 == 50) {
          return null;
        }
        this.b(-23);
        return null;
    }

    final void a(DualLinkNode param0, long param1, byte param2) {
        DualLinkNode var5 = null;
        try {
          if (param2 <= 33) {
            this.a((DualLinkNode) null, 115L, (byte) -90);
          }
          if (null != param0.field_g) {
            param0.a(1);
          }
          var5 = this.field_e[(int)(param1 & (long)(this.field_h - 1))];
          param0.field_j = var5;
          param0.field_g = var5.field_g;
          param0.field_g.field_j = param0;
          param0.field_k = param1;
          param0.field_j.field_g = param0;
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "vp.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final DualLinkNode a(long param0, boolean param1) {
        DualLinkNode var5 = null;
        int var6 = CrazyCrystals.field_B;
        this.field_f = param0;
        DualLinkNode var4 = this.field_e[(int)(param0 & (long)(-1 + this.field_h))];
        this.field_c = var4.field_j;
        if (!param1) {
          this.field_f = -86L;
        }
        while (var4 != this.field_c) {
          if (param0 == this.field_c.field_k) {
            var5 = this.field_c;
            this.field_c = this.field_c.field_j;
            return var5;
          }
          this.field_c = this.field_c.field_j;
        }
        this.field_c = null;
        return null;
    }

    public static void a(byte param0) {
        field_g = null;
        field_i = (dl[][]) null;
        field_a = null;
        field_d = null;
        if (param0 != -14) {
          field_a = (int[]) null;
        }
    }

    final static void a(int param0) {
        int var1_int = 0;
        int var2 = CrazyCrystals.field_B;
        int var1_intLifetime1;
        jm.field_h.a(15834);
        for (var1_int = 0; var1_int < 32; var1_int++) {
          mc.field_p[var1_int] = 0L;
        }
        for (var1_intLifetime1 = 0; var1_intLifetime1 < 32; var1_intLifetime1++) {
          v.field_a[var1_intLifetime1] = 0L;
        }
        if (param0 <= 101) {
          return;
        }
        try {
          hf.field_a = 0;
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "vp.C(" + param0 + ')');
        }
    }

    vp(int param0) {
        int var2 = 0;
        DualLinkNode dupTemp$0 = null;
        DualLinkNode var3 = null;
        this.field_h = param0;
        this.field_e = new DualLinkNode[param0];
        for (var2 = 0; param0 > var2; var2++) {
          dupTemp$0 = new DualLinkNode();
          var3 = dupTemp$0;
          this.field_e[var2] = dupTemp$0;
          var3.field_j = var3;
          var3.field_g = var3;
        }
    }

    static {
        field_a = new int[5];
        field_g = "You will have to push this rock while it is falling ...";
        field_b = 50;
    }
}
