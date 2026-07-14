/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wc {
    private ij field_c;
    static String field_d;
    static dja field_a;
    private ksa field_b;

    final ksa a(byte param0) {
        ksa var2 = null;
        var2 = ((wc) this).field_b;
        if (param0 == 108) {
          if (var2 == ((wc) this).field_c.field_a) {
            ((wc) this).field_b = null;
            return null;
          } else {
            ((wc) this).field_b = var2.field_a;
            return var2;
          }
        } else {
          return null;
        }
    }

    final ksa b(byte param0) {
        ksa var2 = null;
        if (param0 > 61) {
          var2 = ((wc) this).field_c.field_a.field_a;
          if (((wc) this).field_c.field_a == var2) {
            ((wc) this).field_b = null;
            return null;
          } else {
            ((wc) this).field_b = var2.field_a;
            return var2;
          }
        } else {
          return null;
        }
    }

    final ksa c(int param0) {
        ksa var2 = ((wc) this).field_c.field_a.field_c;
        if (param0 != 570) {
            ((wc) this).field_c = null;
            if (!(var2 != ((wc) this).field_c.field_a)) {
                ((wc) this).field_b = null;
                return null;
            }
            ((wc) this).field_b = var2.field_c;
            return var2;
        }
        if (!(var2 != ((wc) this).field_c.field_a)) {
            ((wc) this).field_b = null;
            return null;
        }
        ((wc) this).field_b = var2.field_c;
        return var2;
    }

    final ksa a(int param0) {
        ksa var2 = null;
        Object var3 = null;
        if (param0 == 19072) {
          var2 = ((wc) this).field_b;
          if (((wc) this).field_c.field_a == var2) {
            ((wc) this).field_b = null;
            return null;
          } else {
            ((wc) this).field_b = var2.field_c;
            return var2;
          }
        } else {
          var3 = null;
          ksa discarded$2 = ((wc) this).a((ksa) null, 109);
          var2 = ((wc) this).field_b;
          if (((wc) this).field_c.field_a == var2) {
            ((wc) this).field_b = null;
            return null;
          } else {
            ((wc) this).field_b = var2.field_c;
            return var2;
          }
        }
    }

    final ksa a(byte param0, ksa param1) {
        ksa var3 = null;
        if (param0 < 87) {
            ksa discarded$8 = ((wc) this).a(73);
            if (param1 == null) {
                var3 = ((wc) this).field_c.field_a.field_a;
            } else {
                var3 = param1;
            }
            if (!(var3 != ((wc) this).field_c.field_a)) {
                ((wc) this).field_b = null;
                return null;
            }
            ((wc) this).field_b = var3.field_a;
            return var3;
        }
        if (param1 == null) {
            var3 = ((wc) this).field_c.field_a.field_a;
        } else {
            var3 = param1;
        }
        if (!(var3 != ((wc) this).field_c.field_a)) {
            ((wc) this).field_b = null;
            return null;
        }
        ((wc) this).field_b = var3.field_a;
        return var3;
    }

    public static void b(int param0) {
        if (param0 != -20221) {
            wc.b(-115);
            field_d = null;
            field_a = null;
            return;
        }
        field_d = null;
        field_a = null;
    }

    final ksa a(ksa param0, int param1) {
        ksa var3 = null;
        L0: {
          if (param0 == null) {
            var3 = ((wc) this).field_c.field_a.field_c;
            break L0;
          } else {
            var3 = param0;
            break L0;
          }
        }
        if (var3 != ((wc) this).field_c.field_a) {
          ((wc) this).field_b = var3.field_c;
          if (param1 != -28791) {
            field_d = null;
            return var3;
          } else {
            return var3;
          }
        } else {
          ((wc) this).field_b = null;
          return null;
        }
    }

    wc(ij param0) {
        ((wc) this).field_c = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "To play a multiplayer game, please log in or create a free account.";
    }
}
