/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hh {
    private ta field_e;
    private pi field_b;
    static String field_c;
    static String[] field_a;
    static String field_d;

    final pi a(boolean param0, pi param1) {
        pi var3 = null;
        if (!param0) {
          L0: {
            if (param1 == null) {
              var3 = ((hh) this).field_e.field_c.field_c;
              break L0;
            } else {
              var3 = param1;
              break L0;
            }
          }
          if (var3 == ((hh) this).field_e.field_c) {
            ((hh) this).field_b = null;
            return null;
          } else {
            ((hh) this).field_b = var3.field_c;
            return var3;
          }
        } else {
          L1: {
            pi discarded$10 = ((hh) this).a(true);
            if (param1 == null) {
              var3 = ((hh) this).field_e.field_c.field_c;
              break L1;
            } else {
              var3 = param1;
              break L1;
            }
          }
          if (var3 == ((hh) this).field_e.field_c) {
            ((hh) this).field_b = null;
            return null;
          } else {
            ((hh) this).field_b = var3.field_c;
            return var3;
          }
        }
    }

    final pi c(int param0) {
        pi var2 = ((hh) this).field_b;
        if (param0 > -116) {
            field_a = null;
            if (!(var2 != ((hh) this).field_e.field_c)) {
                ((hh) this).field_b = null;
                return null;
            }
            ((hh) this).field_b = var2.field_c;
            return var2;
        }
        if (!(var2 != ((hh) this).field_e.field_c)) {
            ((hh) this).field_b = null;
            return null;
        }
        ((hh) this).field_b = var2.field_c;
        return var2;
    }

    final pi d(int param0) {
        pi var2 = null;
        var2 = ((hh) this).field_e.field_c.field_f;
        if (((hh) this).field_e.field_c == var2) {
          ((hh) this).field_b = null;
          return null;
        } else {
          ((hh) this).field_b = var2.field_f;
          if (param0 != -19864) {
            field_d = null;
            return var2;
          } else {
            return var2;
          }
        }
    }

    hh(ta param0) {
        ((hh) this).field_e = param0;
    }

    public static void b(int param0) {
        int var1 = -110 / ((param0 - 8) / 50);
        field_a = null;
        field_d = null;
        field_c = null;
    }

    final pi a(int param0) {
        pi var2 = null;
        Object var3 = null;
        if (param0 == 12537) {
          var2 = ((hh) this).field_b;
          if (((hh) this).field_e.field_c == var2) {
            ((hh) this).field_b = null;
            return null;
          } else {
            ((hh) this).field_b = var2.field_f;
            return var2;
          }
        } else {
          var3 = null;
          pi discarded$2 = ((hh) this).a(true, (pi) null);
          var2 = ((hh) this).field_b;
          if (((hh) this).field_e.field_c == var2) {
            ((hh) this).field_b = null;
            return null;
          } else {
            ((hh) this).field_b = var2.field_f;
            return var2;
          }
        }
    }

    final pi a(pi param0, byte param1) {
        pi var4 = null;
        int var3 = -127 / ((param1 - -18) / 40);
        if (param0 != null) {
            var4 = param0;
        } else {
            var4 = ((hh) this).field_e.field_c.field_f;
        }
        if (!(var4 != ((hh) this).field_e.field_c)) {
            ((hh) this).field_b = null;
            return null;
        }
        ((hh) this).field_b = var4.field_f;
        return var4;
    }

    final pi a(boolean param0) {
        pi var2 = ((hh) this).field_e.field_c.field_c;
        if (!param0) {
            Object var3 = null;
            pi discarded$4 = ((hh) this).a(true, (pi) null);
            if (!(var2 != ((hh) this).field_e.field_c)) {
                ((hh) this).field_b = null;
                return null;
            }
            ((hh) this).field_b = var2.field_c;
            return var2;
        }
        if (!(var2 != ((hh) this).field_e.field_c)) {
            ((hh) this).field_b = null;
            return null;
        }
        ((hh) this).field_b = var2.field_c;
        return var2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        field_d = "Sought the Quiet Life";
        field_c = "The 2x multiplier gives you double points! Skilled miners use this to get the best rankings. If you buy 2x AND 3x, they combine to a massive 6x multiplier!";
    }
}
