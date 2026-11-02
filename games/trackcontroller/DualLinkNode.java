/*
 * Decompiled by CFR-JS 0.4.0.
 */
class DualLinkNode extends IntrusiveNode {
    static aa field_n;
    DualLinkNode field_j;
    DualLinkNode field_k;
    long field_m;
    static int field_i;
    static Sprite[] field_l;

    final static void a(int param0, int param1) {
        IntrusiveNode var2 = null;
        int var3 = 0;
        ei var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = TrackController.field_F ? 1 : 0;
        try {
          var4 = (ei) (fj.field_H.first(2));
          while (var4 != null) {
            kc.a(param1, (byte) 75, var4);
            var4 = (ei) (fj.field_H.next(10));
          }
          if (param0 != 4) {
            field_n = (aa) null;
          }
          var2 = ne.field_b.first(2);
          while (var2 != null) {
            cj.a(param1, false);
            var2 = ne.field_b.next(10);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw LevelGrid.a((Throwable) ((Object) var2_ref), "gb.OA(" + param0 + ',' + param1 + ')');
        }
    }

    public static void d(int param0) {
        field_l = null;
        field_n = null;
        if (param0 > -111) {
          DualLinkNode.d(-127);
        }
    }

    protected DualLinkNode() {
    }

    final static byte[] a(String param0, int param1) {
        RuntimeException var2 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -523) {
            field_i = -75;
          }
          stackIn_3_0 = si.field_b.a("", param1 + 522, param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("gb.NA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw LevelGrid.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final void e(int param0) {
        if (this.field_j == null) {
          return;
        }
        if (param0 == 0) {
          this.field_j.field_k = this.field_k;
          this.field_k.field_j = this.field_j;
          this.field_k = null;
          this.field_j = null;
          return;
        }
        this.e(11);
        this.field_j.field_k = this.field_k;
        this.field_k.field_j = this.field_j;
        this.field_k = null;
        this.field_j = null;
    }

    static {
        field_n = new aa(9, 0, 4, 1);
        field_i = 0;
    }
}
