/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ii extends DualLinkNode {
    static Sprite field_p;
    static int field_o;
    static int[] field_q;
    static Sprite[] field_r;
    static java.awt.Frame field_s;

    final static int b(boolean param0) {
        if (param0) {
          ii.a((byte) 79);
          return oi.field_b;
        }
        return oi.field_b;
    }

    final static void a(byte param0) {
        li var1 = null;
        int var2 = 0;
        boolean stackIn_20_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        li var1Lifetime1;
        var2 = TrackController.field_F ? 1 : 0;
        try {
          sb.field_b.b();
          if (param0 > -57) {
            field_o = 87;
          }
          SpriteState.field_x.b();
          NodeHashTable.field_e = NodeHashTable.field_e - 1;
          if (0 == NodeHashTable.field_e) {
            NodeHashTable.field_e = 200;
            var1 = (li) (kd.field_a.first(2));
            while (var1 != null) {
              if (!var1.field_k.b(10000536)) {
                var1.unlink(-40);
              }
              var1 = (li) (kd.field_a.next(10));
            }
            if (jk.field_c != null) {
              var1Lifetime1 = (li) (jk.field_c.first(2));
              while (var1Lifetime1 != null) {
                if (!var1Lifetime1.field_k.b(10000536)) {
                  var1Lifetime1.unlink(-29);
                }
                var1Lifetime1 = (li) (jk.field_c.next(10));
              }
            }
          }
          if (null != fj.field_P) {
            stackIn_20_0 = fj.field_P.c((byte) -64);
            if (stackIn_20_0) {
              return;
            }
            GameShell.field_n = null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw LevelGrid.toClientException((Throwable) ((Object) var1_ref), "ii.H(" + param0 + ')');
        }
    }

    public static void f(int param0) {
        field_s = null;
        field_p = null;
        if (param0 == -5146) {
          field_q = null;
          field_r = null;
          return;
        }
        field_s = (java.awt.Frame) null;
        field_q = null;
        field_r = null;
    }

    ii() {
    }

    static {
    }
}
