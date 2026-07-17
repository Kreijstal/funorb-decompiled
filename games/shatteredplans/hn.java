/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hn {
    private int field_b;
    static int field_i;
    static String[] field_f;
    static String field_a;
    private boolean field_h;
    private int field_g;
    static bi field_c;
    private int[] field_e;
    static int[] field_j;
    static String field_d;

    private final void a(int param0, int param1, int param2) {
        if (param1 > ((hn) this).field_b) {
          L0: {
            ((hn) this).field_b = param1;
            if (((hn) this).field_e.length <= param1) {
              this.b((byte) 107, param1);
              break L0;
            } else {
              break L0;
            }
          }
          ((hn) this).field_e[param1] = param0;
          return;
        } else {
          L1: {
            if (((hn) this).field_e.length <= param1) {
              this.b((byte) 107, param1);
              break L1;
            } else {
              break L1;
            }
          }
          ((hn) this).field_e[param1] = param0;
          return;
        }
    }

    final int a(byte param0) {
        if (param0 != 56) {
            field_c = null;
            return ((hn) this).field_b - -1;
        }
        return ((hn) this).field_b - -1;
    }

    final void a(int param0, int param1) {
        if (param0 != 13378) {
            return;
        }
        this.a(param1, ((hn) this).field_b - -1, -23);
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 19568) {
          hn.a(38);
          field_j = null;
          field_c = null;
          field_f = null;
          field_d = null;
          return;
        } else {
          field_j = null;
          field_c = null;
          field_f = null;
          field_d = null;
          return;
        }
    }

    private final int b(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        var3 = ((hn) this).field_e.length;
        L0: while (true) {
          if (param0 < var3) {
            return var3;
          } else {
            if (!((hn) this).field_h) {
              var3 = var3 + ((hn) this).field_g;
              continue L0;
            } else {
              if (var3 != 0) {
                var3 = var3 * ((hn) this).field_g;
                continue L0;
              } else {
                var3 = 1;
                continue L0;
              }
            }
          }
        }
    }

    final void a(int param0, boolean param1) {
        if (0 <= param0) {
          if (param0 <= ((hn) this).field_b) {
            L0: {
              if (((hn) this).field_b != param0) {
                ps.a(((hn) this).field_e, 1 + param0, ((hn) this).field_e, param0, ((hn) this).field_b - param0);
                break L0;
              } else {
                break L0;
              }
            }
            ((hn) this).field_b = ((hn) this).field_b - 1;
            if (param1) {
              ((hn) this).field_e = null;
              return;
            } else {
              return;
            }
          } else {
            throw new ArrayIndexOutOfBoundsException(param0);
          }
        } else {
          throw new ArrayIndexOutOfBoundsException(param0);
        }
    }

    final int a(byte param0, int param1) {
        int var3 = 0;
        if (((hn) this).field_b < param1) {
          throw new ArrayIndexOutOfBoundsException(param1);
        } else {
          var3 = 3 % ((param0 - -52) / 63);
          return ((hn) this).field_e[param1];
        }
    }

    private final void b(byte param0, int param1) {
        int[] var3 = null;
        int[] var4 = null;
        var4 = new int[this.b(param1, 0)];
        var3 = var4;
        ps.a(((hn) this).field_e, 0, var4, 0, ((hn) this).field_e.length);
        ((hn) this).field_e = var4;
        if (param0 != 107) {
          ((hn) this).field_e = null;
          return;
        } else {
          return;
        }
    }

    private hn() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new String[]{"Red Coalition", "Green Empire", "Blue Confederacy", "Magenta Union", "Yellow Imperium", "Cyan League"};
        field_j = new int[]{2, 3, 4, 5, 6};
        field_a = "Offer rematch";
    }
}
