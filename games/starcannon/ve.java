/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ve {
    private int field_c;
    private int field_a;
    static lf field_f;
    static String field_g;
    private int[] field_e;
    static boolean field_d;
    private boolean field_b;

    public static void a() {
        field_f = null;
        field_g = null;
    }

    final int a(boolean param0) {
        if (!param0) {
            int discarded$0 = ((ve) this).a(99, -59);
            return ((ve) this).field_c - -1;
        }
        return ((ve) this).field_c - -1;
    }

    final int a(int param0, int param1) {
        if (param1 <= ((ve) this).field_c) {
          if (param0 != 0) {
            ((ve) this).b(-84, 4);
            return ((ve) this).field_e[param1];
          } else {
            return ((ve) this).field_e[param1];
          }
        } else {
          throw new ArrayIndexOutOfBoundsException(param1);
        }
    }

    private final void a(int param0, int param1, boolean param2) {
        if (param0 > ((ve) this).field_c) {
          L0: {
            ((ve) this).field_c = param0;
            if (((ve) this).field_e.length <= param0) {
              int discarded$4 = 0;
              this.d(param0);
              break L0;
            } else {
              break L0;
            }
          }
          ((ve) this).field_e[param0] = param1;
          return;
        } else {
          L1: {
            if (((ve) this).field_e.length <= param0) {
              int discarded$5 = 0;
              this.d(param0);
              break L1;
            } else {
              break L1;
            }
          }
          ((ve) this).field_e[param0] = param1;
          return;
        }
    }

    private final void d(int param0) {
        int[] var4 = new int[this.a(param0, (byte) -77)];
        int[] var3 = var4;
        ug.a(((ve) this).field_e, 0, var4, 0, ((ve) this).field_e.length);
        ((ve) this).field_e = var4;
    }

    private final int a(int param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = StarCannon.field_A;
        var3 = ((ve) this).field_e.length;
        L0: while (true) {
          if (param0 < var3) {
            return var3;
          } else {
            if (((ve) this).field_b) {
              if (var3 == 0) {
                var3 = 1;
                continue L0;
              } else {
                var3 = var3 * ((ve) this).field_a;
                continue L0;
              }
            } else {
              var3 = var3 + ((ve) this).field_a;
              continue L0;
            }
          }
        }
    }

    final void c(int param0, int param1) {
        int var3 = 0;
        if (param1 >= 0) {
          if (param1 > ((ve) this).field_c) {
            throw new ArrayIndexOutOfBoundsException(param1);
          } else {
            L0: {
              if (param1 != ((ve) this).field_c) {
                ug.a(((ve) this).field_e, param1 - -1, ((ve) this).field_e, param1, ((ve) this).field_c - param1);
                break L0;
              } else {
                break L0;
              }
            }
            ((ve) this).field_c = ((ve) this).field_c - 1;
            var3 = 50 % ((param0 - 50) / 54);
            return;
          }
        } else {
          throw new ArrayIndexOutOfBoundsException(param1);
        }
    }

    final void b(int param0, int param1) {
        this.a(param1 + ((ve) this).field_c, param0, true);
    }

    private ve() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "LANCE POWER:";
    }
}
