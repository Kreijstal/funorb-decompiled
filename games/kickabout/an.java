/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class an {
    static boolean field_d;
    private eq field_e;
    private sj field_b;
    static int field_c;
    static String field_f;
    private sj field_a;

    final bg a(int param0, int param1) {
        bg var3 = null;
        bg var3_ref = null;
        byte[] var4 = null;
        int var5 = 0;
        var3 = (bg) ((an) this).field_e.a((long)param1, (byte) 43);
        if (var3 == null) {
          L0: {
            if (param1 < 32768) {
              var4 = ((an) this).field_a.b(1, -32669, param1);
              break L0;
            } else {
              var4 = ((an) this).field_b.b(1, -32669, param1 & 32767);
              break L0;
            }
          }
          L1: {
            var3_ref = new bg();
            if (var4 != null) {
              var3_ref.a((byte) 126, new iw(var4));
              break L1;
            } else {
              break L1;
            }
          }
          var5 = 37 % ((param0 - 83) / 36);
          if (32768 <= param1) {
            var3_ref.a(false);
            ((an) this).field_e.a((long)param1, (Object) (Object) var3_ref, (byte) -116);
            return var3_ref;
          } else {
            ((an) this).field_e.a((long)param1, (Object) (Object) var3_ref, (byte) -116);
            return var3_ref;
          }
        } else {
          return var3;
        }
    }

    public static void a(int param0) {
        field_f = null;
        if (param0 != 30297) {
            field_c = 42;
        }
    }

    an(int param0, sj param1, sj param2, fg param3) {
        ((an) this).field_e = new eq(64);
        ((an) this).field_a = param1;
        ((an) this).field_b = param2;
        if (((an) this).field_a != null) {
            int discarded$0 = ((an) this).field_a.a(true, 1);
        }
        if (null != ((an) this).field_b) {
            int discarded$1 = ((an) this).field_b.a(true, 1);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Your ignore list is full. Max of 100 hit.";
    }
}
