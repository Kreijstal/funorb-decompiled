/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vi {
    static IndexedSprite field_f;
    static int[] field_d;
    static long field_a;
    private DualLinkNode field_e;
    private IntrusiveNodeHashTable field_g;
    private DualLinkDeque field_c;
    private int field_b;

    final void a(DualLinkNode param0, long param1, int param2) {
        DualLinkNode var5 = null;
        try {
          if (param2 <= 64) {
            vi.b(13);
          }
          if (0 != this.field_b) {
            this.field_b = this.field_b - 1;
          } else {
            var5 = this.field_c.a(true);
            var5.unlink(false);
            var5.unlinkSecondary(0);
            if (var5 == this.field_e) {
              var5 = this.field_c.a(true);
              var5.unlink(false);
              var5.unlinkSecondary(0);
            }
          }
          this.field_g.a(param1, (byte) -97, param0);
          this.field_c.a(param0, (byte) -107);
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "vi.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void b(int param0) {
        int var1_int = 0;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = BachelorFridge.field_y;
        try {
          oi.field_v = new IntrusiveNodeHashTable(param0);
          for (var1_int = 0; var1_int < ia.field_j.length; var1_int++) {
            oi.field_v.a((long)ia.field_j[var1_int].toLowerCase().hashCode(), (byte) 102, new ji(var1_int));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pe.wrapException((Throwable) ((Object) var1), "vi.A(" + param0 + ')');
        }
    }

    public static void a(int param0) {
        field_f = null;
        int var1 = 64 % ((param0 + 31) / 62);
        field_d = null;
    }

    final DualLinkNode a(int param0, long param1) {
        if (param0 < 98) {
          return (DualLinkNode) null;
        }
        DualLinkNode var4 = (DualLinkNode) (this.field_g.a(true, param1));
        if (var4 != null) {
          this.field_c.a(var4, (byte) 115);
        }
        return var4;
    }

    vi(int param0) {
        int var2 = 0;
        this.field_e = new DualLinkNode();
        this.field_c = new DualLinkDeque();
        this.field_b = param0;
        for (var2 = 1; param0 > var2 + var2; var2 = var2 + var2) {
        }
        this.field_g = new IntrusiveNodeHashTable(var2);
    }

    static {
        field_d = new int[]{300, 500, 100, 300, 100, 100, 100, 100, 200, 100, 100, 100, 300, 500, 200, 100, 100, 100, 500, 100, 200, 200, 100, 100, 100, 500, 300, 300, 200, 200, 1000, 500, 300, 500, 300, 500, 500, 300, 1000, 500, 500, 500, 300, 500, 300, 300, 200, 500, 300, 100};
    }
}
