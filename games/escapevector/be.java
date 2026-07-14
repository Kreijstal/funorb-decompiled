/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class be {
    static String field_a;
    static pn field_b;

    public static void a(byte param0) {
        field_a = null;
        if (param0 > -103) {
            field_a = null;
            field_b = null;
            return;
        }
        field_b = null;
    }

    final static void a(int param0, int param1) {
        hg var2 = null;
        int var3 = 0;
        bd var4 = null;
        var3 = EscapeVector.field_A;
        if (param1 == 17205) {
          var4 = (bd) (Object) rd.field_b.a(false);
          L0: while (true) {
            if (var4 == null) {
              var2 = nf.field_w.a(false);
              L1: while (true) {
                if (var2 != null) {
                  q.c(param0, (byte) -63);
                  var2 = nf.field_w.b((byte) 70);
                  continue L1;
                } else {
                  return;
                }
              }
            } else {
              r.a(-118, var4, param0);
              var4 = (bd) (Object) rd.field_b.b((byte) 70);
              continue L0;
            }
          }
        } else {
          be.a((byte) 71);
          var4 = (bd) (Object) rd.field_b.a(false);
          L2: while (true) {
            if (var4 == null) {
              var2 = nf.field_w.a(false);
              L3: while (true) {
                if (var2 != null) {
                  q.c(param0, (byte) -63);
                  var2 = nf.field_w.b((byte) 70);
                  continue L3;
                } else {
                  return;
                }
              }
            } else {
              r.a(-118, var4, param0);
              var4 = (bd) (Object) rd.field_b.b((byte) 70);
              continue L2;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Play Tutorial";
        cn discarded$0 = new cn();
    }
}
