/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class of {
    private int[] field_a;
    private int field_c;
    private boolean field_i;
    private int field_h;
    static o[] field_b;
    static int field_g;
    static o field_d;
    static long field_e;
    static o field_f;

    public static void a(int param0) {
        field_f = null;
        field_b = null;
        field_d = null;
    }

    final void c(int param0, int param1) {
        int var3 = -67 % ((-45 - param0) / 43);
        this.a(1 + ((of) this).field_h, (byte) 61, param1);
    }

    private final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = SolKnight.field_L ? 1 : 0;
        var3 = ((of) this).field_a.length;
        L0: while (true) {
          if (var3 > param0) {
            return var3;
          } else {
            if (!((of) this).field_i) {
              var3 = var3 + ((of) this).field_c;
              continue L0;
            } else {
              if (var3 != 0) {
                var3 = var3 * ((of) this).field_c;
                continue L0;
              } else {
                var3 = 1;
                continue L0;
              }
            }
          }
        }
    }

    final void a(boolean param0, int param1) {
        if (param1 >= 0) {
          if (param1 <= ((of) this).field_h) {
            L0: {
              if (((of) this).field_h != param1) {
                fk.a(((of) this).field_a, 1 + param1, ((of) this).field_a, param1, -param1 + ((of) this).field_h);
                break L0;
              } else {
                break L0;
              }
            }
            ((of) this).field_h = ((of) this).field_h - 1;
            if (param0) {
              return;
            } else {
              int discarded$2 = ((of) this).b(-55);
              return;
            }
          } else {
            throw new ArrayIndexOutOfBoundsException(param1);
          }
        } else {
          throw new ArrayIndexOutOfBoundsException(param1);
        }
    }

    private of() throws Throwable {
        throw new Error();
    }

    private final void a(int param0, byte param1, int param2) {
        L0: {
          if (param0 > ((of) this).field_h) {
            ((of) this).field_h = param0;
            break L0;
          } else {
            break L0;
          }
        }
        if (((of) this).field_a.length <= param0) {
          this.b(param0, 0);
          ((of) this).field_a[param0] = param2;
          return;
        } else {
          ((of) this).field_a[param0] = param2;
          return;
        }
    }

    private final void b(int param0, int param1) {
        int[] var4 = new int[this.a(param0, -113)];
        int[] var3 = var4;
        fk.a(((of) this).field_a, 0, var4, 0, ((of) this).field_a.length);
        ((of) this).field_a = var4;
    }

    final int a(byte param0, int param1) {
        if (((of) this).field_h >= param1) {
          if (param0 != 43) {
            ((of) this).field_h = 68;
            return ((of) this).field_a[param1];
          } else {
            return ((of) this).field_a[param1];
          }
        } else {
          throw new ArrayIndexOutOfBoundsException(param1);
        }
    }

    final int b(int param0) {
        if (param0 <= 74) {
            int discarded$0 = ((of) this).a((byte) -24, -1);
            return ((of) this).field_h - -1;
        }
        return ((of) this).field_h - -1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = 0;
    }
}
