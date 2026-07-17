/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ch {
    static String field_c;
    private int[] field_f;
    private int field_e;
    private boolean field_b;
    static pk field_d;
    private int field_a;

    final void c(int param0, int param1) {
        if (param1 >= 0) {
          if (param1 <= ((ch) this).field_e) {
            L0: {
              if (param1 != ((ch) this).field_e) {
                eg.a(((ch) this).field_f, param1 - -1, ((ch) this).field_f, param1, ((ch) this).field_e + -param1);
                break L0;
              } else {
                break L0;
              }
            }
            ((ch) this).field_e = ((ch) this).field_e - 1;
            if (param0 < 122) {
              int discarded$2 = this.b(-10, -60);
              return;
            } else {
              return;
            }
          } else {
            throw new ArrayIndexOutOfBoundsException(param1);
          }
        } else {
          throw new ArrayIndexOutOfBoundsException(param1);
        }
    }

    final int a(boolean param0) {
        if (!param0) {
            return 81;
        }
        return ((ch) this).field_e + 1;
    }

    final int d(int param0, int param1) {
        if (((ch) this).field_e >= param1) {
          if (param0 != -32240) {
            ((ch) this).c(126, 35);
            return ((ch) this).field_f[param1];
          } else {
            return ((ch) this).field_f[param1];
          }
        } else {
          throw new ArrayIndexOutOfBoundsException(param1);
        }
    }

    private final void a(int param0, int param1) {
        int[] var4 = new int[this.b(2667, param1)];
        int[] var3 = var4;
        eg.a(((ch) this).field_f, 0, var4, 0, ((ch) this).field_f.length);
        ((ch) this).field_f = var4;
    }

    private final int b(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = CrazyCrystals.field_B;
        if (param0 != 2667) {
          ((ch) this).field_f = null;
          var3 = ((ch) this).field_f.length;
          L0: while (true) {
            if (var3 > param1) {
              return var3;
            } else {
              if (((ch) this).field_b) {
                if (var3 == 0) {
                  var3 = 1;
                  continue L0;
                } else {
                  var3 = var3 * ((ch) this).field_a;
                  continue L0;
                }
              } else {
                var3 = var3 + ((ch) this).field_a;
                continue L0;
              }
            }
          }
        } else {
          var3 = ((ch) this).field_f.length;
          L1: while (true) {
            if (var3 > param1) {
              return var3;
            } else {
              if (((ch) this).field_b) {
                if (var3 == 0) {
                  var3 = 1;
                  continue L1;
                } else {
                  var3 = var3 * ((ch) this).field_a;
                  continue L1;
                }
              } else {
                var3 = var3 + ((ch) this).field_a;
                continue L1;
              }
            }
          }
        }
    }

    private final void a(byte param0, int param1, int param2) {
        if (!(((ch) this).field_e >= param2)) {
            ((ch) this).field_e = param2;
        }
        if (!(param2 < ((ch) this).field_f.length)) {
            this.a(25613, param2);
        }
        ((ch) this).field_f[param2] = param1;
    }

    final void a(int param0, byte param1) {
        this.a((byte) -2, param0, ((ch) this).field_e + 1);
        if (param1 <= 121) {
            ((ch) this).field_a = 111;
        }
    }

    public static void a() {
        field_c = null;
        field_d = null;
    }

    private ch() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "This is a spider.<br><br>Spiders weave spider webs.<br><br>If the spider is standing on the web, the web will spread.<br><br>If you stand on the web, the spider will hear you.<br><br>Spiders are fast and very dangerous. Your only hope is to unite it with a rock!";
    }
}
