/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kn {
    private int field_e;
    static String field_c;
    static int field_b;
    static String field_f;
    static ed field_h;
    private int[] field_a;
    private boolean field_d;
    private int field_g;

    private final void a(int param0, int param1, boolean param2) {
        if (param0 > ((kn) this).field_g) {
          L0: {
            ((kn) this).field_g = param0;
            if (((kn) this).field_a.length <= param0) {
              this.b(0, param0);
              break L0;
            } else {
              break L0;
            }
          }
          ((kn) this).field_a[param0] = param1;
          return;
        } else {
          L1: {
            if (((kn) this).field_a.length <= param0) {
              this.b(0, param0);
              break L1;
            } else {
              break L1;
            }
          }
          ((kn) this).field_a[param0] = param1;
          return;
        }
    }

    public static void c() {
        field_f = null;
        field_c = null;
        field_h = null;
    }

    final void c(int param0, int param1) {
        if (param1 >= param0) {
          if (param1 > ((kn) this).field_g) {
            throw new ArrayIndexOutOfBoundsException(param1);
          } else {
            L0: {
              if (((kn) this).field_g != param1) {
                qg.a(((kn) this).field_a, param1 - -1, ((kn) this).field_a, param1, ((kn) this).field_g - param1);
                break L0;
              } else {
                break L0;
              }
            }
            ((kn) this).field_g = ((kn) this).field_g - 1;
            return;
          }
        } else {
          throw new ArrayIndexOutOfBoundsException(param1);
        }
    }

    final void a(int param0, byte param1) {
        this.a(((kn) this).field_g + 1, param0, false);
        if (param1 != -51) {
            int discarded$0 = ((kn) this).a(false);
        }
    }

    private final void b(int param0, int param1) {
        int[] var4 = new int[this.d(0, param1)];
        int[] var3 = var4;
        qg.a(((kn) this).field_a, 0, var4, 0, ((kn) this).field_a.length);
        ((kn) this).field_a = var4;
    }

    final static void a() {
        int discarded$0 = 0;
        mb.field_g = hi.c();
        bo.field_F = new tb();
        ve.a(-43, true, true);
    }

    final int a(int param0, int param1) {
        if (((kn) this).field_g < param1) {
          throw new ArrayIndexOutOfBoundsException(param1);
        } else {
          if (param0 >= -5) {
            sn discarded$2 = kn.b(false);
            return ((kn) this).field_a[param1];
          } else {
            return ((kn) this).field_a[param1];
          }
        }
    }

    private final int d(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = EscapeVector.field_A;
        var3 = ((kn) this).field_a.length;
        L0: while (true) {
          if (param1 < var3) {
            return var3;
          } else {
            if (!((kn) this).field_d) {
              var3 = var3 + ((kn) this).field_e;
              continue L0;
            } else {
              if (var3 != 0) {
                var3 = var3 * ((kn) this).field_e;
                continue L0;
              } else {
                var3 = 1;
                continue L0;
              }
            }
          }
        }
    }

    private kn() throws Throwable {
        throw new Error();
    }

    final static sn b(boolean param0) {
        if (!param0) {
            return null;
        }
        int discarded$0 = 31069;
        int discarded$1 = -89;
        return new sn(ce.c(), jc.c());
    }

    final int a(boolean param0) {
        if (!param0) {
            int discarded$0 = ((kn) this).a(106, 72);
            return ((kn) this).field_g + 1;
        }
        return ((kn) this).field_g + 1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Names cannot start or end with space or underscore";
        field_f = "Score";
    }
}
