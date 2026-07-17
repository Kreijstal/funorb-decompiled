/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tq {
    private int[] field_c;
    private int field_f;
    private boolean field_e;
    static cn field_g;
    static int[] field_a;
    static String field_b;
    private int field_d;

    final int b(int param0) {
        if (param0 != -1) {
            return -58;
        }
        return ((tq) this).field_d - -1;
    }

    final int b(int param0, int param1) {
        if (((tq) this).field_d < param1) {
          throw new ArrayIndexOutOfBoundsException(param1);
        } else {
          if (param0 != -1) {
            field_a = null;
            return ((tq) this).field_c[param1];
          } else {
            return ((tq) this).field_c[param1];
          }
        }
    }

    final void a(int param0, byte param1) {
        int var3 = 91 / ((param1 - 26) / 53);
        this.a(((tq) this).field_d + 1, param0, -1);
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        field_g = null;
    }

    private final void c(int param0, int param1) {
        int[] var3 = null;
        int[] var4 = null;
        if (param1 != -12364) {
          ((tq) this).field_f = 94;
          var4 = new int[this.a((byte) 24, param0)];
          var3 = var4;
          lua.a(((tq) this).field_c, 0, var4, 0, ((tq) this).field_c.length);
          ((tq) this).field_c = var4;
          return;
        } else {
          var4 = new int[this.a((byte) 24, param0)];
          var3 = var4;
          lua.a(((tq) this).field_c, 0, var4, 0, ((tq) this).field_c.length);
          ((tq) this).field_c = var4;
          return;
        }
    }

    private final int a(byte param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        if (param0 != 24) {
          return -80;
        } else {
          var3 = ((tq) this).field_c.length;
          L0: while (true) {
            if (param1 < var3) {
              return var3;
            } else {
              if (((tq) this).field_e) {
                if (var3 != 0) {
                  var3 = var3 * ((tq) this).field_f;
                  continue L0;
                } else {
                  var3 = 1;
                  continue L0;
                }
              } else {
                var3 = var3 + ((tq) this).field_f;
                continue L0;
              }
            }
          }
        }
    }

    final void a(int param0, int param1) {
        if (param1 > 25) {
          if (param0 >= 0) {
            if (((tq) this).field_d >= param0) {
              if (param0 != ((tq) this).field_d) {
                lua.a(((tq) this).field_c, param0 - -1, ((tq) this).field_c, param0, ((tq) this).field_d + -param0);
                ((tq) this).field_d = ((tq) this).field_d - 1;
                return;
              } else {
                ((tq) this).field_d = ((tq) this).field_d - 1;
                return;
              }
            } else {
              throw new ArrayIndexOutOfBoundsException(param0);
            }
          } else {
            throw new ArrayIndexOutOfBoundsException(param0);
          }
        } else {
          return;
        }
    }

    private tq() throws Throwable {
        throw new Error();
    }

    private final void a(int param0, int param1, int param2) {
        if (~((tq) this).field_d > ~param0) {
            ((tq) this).field_d = param0;
            return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Offensive account name";
        field_a = new int[1];
    }
}
