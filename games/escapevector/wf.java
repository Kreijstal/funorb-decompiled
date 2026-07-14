/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wf {
    static String field_b;
    static String[] field_c;
    static ed field_e;
    private cn field_a;
    private hg field_d;

    public static void a(boolean param0) {
        field_e = null;
        field_c = null;
        if (param0) {
            return;
        }
        field_b = null;
    }

    final hg a(byte param0, hg param1) {
        hg var3 = null;
        Object var4 = null;
        L0: {
          if (param1 != null) {
            var3 = param1;
            break L0;
          } else {
            var3 = ((wf) this).field_a.field_d.field_d;
            break L0;
          }
        }
        if (((wf) this).field_a.field_d == var3) {
          ((wf) this).field_d = null;
          return null;
        } else {
          ((wf) this).field_d = var3.field_d;
          if (param0 < 33) {
            var4 = null;
            hg discarded$2 = ((wf) this).a((byte) 25, (hg) null);
            return var3;
          } else {
            return var3;
          }
        }
    }

    final hg c(int param0) {
        hg var2 = null;
        var2 = ((wf) this).field_a.field_d.field_b;
        if (((wf) this).field_a.field_d == var2) {
          ((wf) this).field_d = null;
          return null;
        } else {
          if (param0 != 15) {
            return null;
          } else {
            ((wf) this).field_d = var2.field_b;
            return var2;
          }
        }
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        if (!(param0 != 0)) {
            return 0;
        }
        if (param1 != 24787) {
            return 37;
        }
        if (!(0 >= param0)) {
            var2 = 1;
            if (-65536 > (param0 ^ -1)) {
                var2 += 16;
                param0 = param0 >> 16;
            }
            if (255 < param0) {
                param0 = param0 >> 8;
                var2 += 8;
            }
            if (!(15 >= param0)) {
                var2 += 4;
                param0 = param0 >> 4;
            }
            if (3 < param0) {
                var2 += 2;
                param0 = param0 >> 2;
            }
            if (param0 > 1) {
                param0 = param0 >> 1;
                var2++;
            }
            return var2;
        }
        var2 = 2;
        if (65535 < param0) {
            var2 += 16;
            param0 = param0 >> 16;
        }
        if (!(-256 <= param0)) {
            param0 = param0 >> 8;
            var2 += 8;
        }
        if (!(15 <= param0)) {
            param0 = param0 >> 4;
            var2 += 4;
        }
        if (!(3 >= (param0 ^ -1))) {
            param0 = param0 >> 2;
            var2 += 2;
        }
        if (!(param0 >= -2)) {
            var2++;
            param0 = param0 >> 1;
        }
        return var2;
    }

    final hg a(int param0, hg param1) {
        hg var3 = null;
        L0: {
          if (param1 == null) {
            var3 = ((wf) this).field_a.field_d.field_b;
            break L0;
          } else {
            var3 = param1;
            break L0;
          }
        }
        if (param0 == -12818) {
          if (var3 == ((wf) this).field_a.field_d) {
            ((wf) this).field_d = null;
            return null;
          } else {
            ((wf) this).field_d = var3.field_b;
            return var3;
          }
        } else {
          field_e = null;
          if (var3 == ((wf) this).field_a.field_d) {
            ((wf) this).field_d = null;
            return null;
          } else {
            ((wf) this).field_d = var3.field_b;
            return var3;
          }
        }
    }

    final hg a(byte param0) {
        if (param0 <= 35) {
            return null;
        }
        hg var2 = ((wf) this).field_d;
        if (!(((wf) this).field_a.field_d != var2)) {
            ((wf) this).field_d = null;
            return null;
        }
        ((wf) this).field_d = var2.field_d;
        return var2;
    }

    final hg a(int param0) {
        hg var2 = null;
        var2 = ((wf) this).field_d;
        if (var2 != ((wf) this).field_a.field_d) {
          if (param0 <= 23) {
            return null;
          } else {
            ((wf) this).field_d = var2.field_b;
            return var2;
          }
        } else {
          ((wf) this).field_d = null;
          return null;
        }
    }

    final hg b(int param0) {
        hg var2 = null;
        if (param0 != -31616) {
            Object var3 = null;
            hg discarded$0 = ((wf) this).a(-5, (hg) null);
            var2 = ((wf) this).field_a.field_d.field_d;
            if (!(((wf) this).field_a.field_d != var2)) {
                ((wf) this).field_d = null;
                return null;
            }
            ((wf) this).field_d = var2.field_d;
            return var2;
        }
        var2 = ((wf) this).field_a.field_d.field_d;
        if (!(((wf) this).field_a.field_d != var2)) {
            ((wf) this).field_d = null;
            return null;
        }
        ((wf) this).field_d = var2.field_d;
        return var2;
    }

    wf(cn param0) {
        ((wf) this).field_a = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Loading extra data";
        field_c = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
    }
}
