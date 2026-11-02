/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tb {
    private DualLinkNode field_e;
    static q field_a;
    static cn field_c;
    static int field_i;
    static int field_g;
    private DualLinkNode[] field_d;
    private int field_f;
    static String field_h;
    private long field_b;

    final DualLinkNode a(byte param0, long param1) {
        DualLinkNode var6 = null;
        int var7 = DungeonAssault.field_K;
        this.field_b = param1;
        int var5 = 21 % ((78 - param0) / 40);
        DualLinkNode var4 = this.field_d[(int)(param1 & (long)(this.field_f - 1))];
        this.field_e = var4.field_n;
        while (var4 != this.field_e) {
          if (this.field_e.field_o == param1) {
            var6 = this.field_e;
            this.field_e = this.field_e.field_n;
            return var6;
          }
          this.field_e = this.field_e.field_n;
        }
        this.field_e = null;
        return null;
    }

    final static void a(byte param0) {
        int var1 = -104 / ((-17 - param0) / 53);
        vj.field_c = null;
        no.field_a = 0;
        ti.field_f = false;
        fl.field_l = -1;
        wa.field_c = -1;
    }

    final void a(DualLinkNode param0, long param1, int param2) {
        if (param0.field_l != null) {
          param0.b((byte) -2);
        }
        DualLinkNode var5 = this.field_d[(int)(param1 & (long)(this.field_f - 1))];
        if (param2 >= -60) {
          return;
        }
        try {
          param0.field_l = var5.field_l;
          param0.field_n = var5;
          param0.field_l.field_n = param0;
          param0.field_o = param1;
          param0.field_n.field_l = param0;
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "tb.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final DualLinkNode c(byte param0) {
        DualLinkNode var3 = null;
        int var4 = DungeonAssault.field_K;
        if (null == this.field_e) {
          return null;
        }
        DualLinkNode var2 = this.field_d[(int)(this.field_b & (long)(this.field_f - 1))];
        while (var2 != this.field_e) {
          if (~this.field_e.field_o == ~this.field_b) {
            var3 = this.field_e;
            this.field_e = this.field_e.field_n;
            return var3;
          }
          this.field_e = this.field_e.field_n;
        }
        if (param0 < 0) {
          return (DualLinkNode) null;
        }
        this.field_e = null;
        return null;
    }

    public static void b(byte param0) {
        field_c = null;
        field_h = null;
        int var1 = 47 % ((param0 - 65) / 57);
        field_a = null;
    }

    final static void a(boolean param0, int param1) {
        if (null != ik.field_e) {
          ik.field_e.a(param0);
        }
        if (param1 != 1) {
          tb.a((byte) 113);
          return;
        }
    }

    tb(int param0) {
        int var2 = 0;
        DualLinkNode dupTemp$0 = null;
        DualLinkNode var3 = null;
        this.field_f = param0;
        this.field_d = new DualLinkNode[param0];
        for (var2 = 0; var2 < param0; var2++) {
          dupTemp$0 = new DualLinkNode();
          var3 = dupTemp$0;
          this.field_d[var2] = dupTemp$0;
          var3.field_l = var3;
          var3.field_n = var3;
        }
    }

    static {
        field_h = "A veteran of the constant border wars between the human nations and the orc clans, the orc blademaster's specialty is sudden and silent violence, though he is likely to come off second best in a prolonged fight.";
    }
}
