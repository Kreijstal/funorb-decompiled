/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gb {
    static kh field_c;
    private ta field_a;
    private ta field_b;

    final void a(byte param0, ta param1) {
        if (null == param1.field_j) {
          param1.field_j = ((gb) this).field_a.field_j;
          if (param0 <= 116) {
            return;
          } else {
            param1.field_p = ((gb) this).field_a;
            param1.field_j.field_p = param1;
            param1.field_p.field_j = param1;
            return;
          }
        } else {
          param1.h(0);
          param1.field_j = ((gb) this).field_a.field_j;
          if (param0 <= 116) {
            return;
          } else {
            param1.field_p = ((gb) this).field_a;
            param1.field_j.field_p = param1;
            param1.field_p.field_j = param1;
            return;
          }
        }
    }

    final ta c(int param0) {
        ta var2 = null;
        if (param0 == 24542) {
          var2 = ((gb) this).field_b;
          if (((gb) this).field_a == var2) {
            ((gb) this).field_b = null;
            return null;
          } else {
            ((gb) this).field_b = var2.field_p;
            return var2;
          }
        } else {
          ((gb) this).field_a = null;
          var2 = ((gb) this).field_b;
          if (((gb) this).field_a == var2) {
            ((gb) this).field_b = null;
            return null;
          } else {
            ((gb) this).field_b = var2.field_p;
            return var2;
          }
        }
    }

    final int b(int param0) {
        int var2 = 0;
        ta var3 = null;
        int var4 = 0;
        Object var5 = null;
        var4 = Torquing.field_u;
        if (param0 != -24088) {
          var5 = null;
          ((gb) this).a((byte) -124, (ta) null);
          var2 = 0;
          var3 = ((gb) this).field_a.field_p;
          L0: while (true) {
            if (((gb) this).field_a == var3) {
              return var2;
            } else {
              var3 = var3.field_p;
              var2++;
              continue L0;
            }
          }
        } else {
          var2 = 0;
          var3 = ((gb) this).field_a.field_p;
          L1: while (true) {
            if (((gb) this).field_a == var3) {
              return var2;
            } else {
              var3 = var3.field_p;
              var2++;
              continue L1;
            }
          }
        }
    }

    final ta a(int param0) {
        int var2 = 0;
        ta var3 = null;
        var2 = 25 / ((69 - param0) / 55);
        var3 = ((gb) this).field_a.field_p;
        if (var3 == ((gb) this).field_a) {
          return null;
        } else {
          var3.h(0);
          return var3;
        }
    }

    final ta a(byte param0) {
        ta var2 = null;
        var2 = ((gb) this).field_a.field_p;
        if (var2 == ((gb) this).field_a) {
          ((gb) this).field_b = null;
          return null;
        } else {
          if (param0 >= -35) {
            return null;
          } else {
            ((gb) this).field_b = var2.field_p;
            return var2;
          }
        }
    }

    public static void d(int param0) {
        field_c = null;
        int var1 = -51 / ((-42 - param0) / 39);
    }

    public gb() {
        ((gb) this).field_a = new ta();
        ((gb) this).field_a.field_p = ((gb) this).field_a;
        ((gb) this).field_a.field_j = ((gb) this).field_a;
    }

    static {
    }
}
