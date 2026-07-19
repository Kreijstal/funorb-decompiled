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
        int discarded$2 = 0;
        if ((param1 ^ -1) <= -1) {
          if (param1 <= this.field_e) {
            L0: {
              if (param1 != this.field_e) {
                eg.a(this.field_f, param1 - -1, this.field_f, param1, this.field_e + -param1);
                break L0;
              } else {
                break L0;
              }
            }
            this.field_e = this.field_e - 1;
            if (param0 < 122) {
              discarded$2 = this.b(-10, -60);
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
        return this.field_e + 1;
    }

    final int d(int param0, int param1) {
        if (this.field_e >= param1) {
          if (param0 != -32240) {
            this.c(126, 35);
            return this.field_f[param1];
          } else {
            return this.field_f[param1];
          }
        } else {
          throw new ArrayIndexOutOfBoundsException(param1);
        }
    }

    private final void a(int param0, int param1) {
        int[] var3 = null;
        int[] var4 = null;
        var4 = new int[this.b(2667, param1)];
        var3 = var4;
        eg.a(this.field_f, 0, var4, 0, this.field_f.length);
        if (param0 != 25613) {
          this.field_f = (int[]) null;
          this.field_f = var4;
          return;
        } else {
          this.field_f = var4;
          return;
        }
    }

    private final int b(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = CrazyCrystals.field_B;
        if (param0 != 2667) {
          this.field_f = (int[]) null;
          var3 = this.field_f.length;
          L0: while (true) {
            if (var3 > param1) {
              return var3;
            } else {
              if (this.field_b) {
                if (-1 == (var3 ^ -1)) {
                  var3 = 1;
                  continue L0;
                } else {
                  var3 = var3 * this.field_a;
                  continue L0;
                }
              } else {
                var3 = var3 + this.field_a;
                continue L0;
              }
            }
          }
        } else {
          var3 = this.field_f.length;
          L1: while (true) {
            if (var3 > param1) {
              return var3;
            } else {
              if (this.field_b) {
                if (-1 == (var3 ^ -1)) {
                  var3 = 1;
                  continue L1;
                } else {
                  var3 = var3 * this.field_a;
                  continue L1;
                }
              } else {
                var3 = var3 + this.field_a;
                continue L1;
              }
            }
          }
        }
    }

    private final void a(byte param0, int param1, int param2) {
        int discarded$2 = 0;
        L0: {
          if (this.field_e < param2) {
            this.field_e = param2;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (param2 >= this.field_f.length) {
            this.a(25613, param2);
            break L1;
          } else {
            break L1;
          }
        }
        this.field_f[param2] = param1;
        if (param0 != -2) {
          discarded$2 = this.d(-98, -14);
          return;
        } else {
          return;
        }
    }

    final void a(int param0, byte param1) {
        this.a((byte) -2, param0, this.field_e + 1);
        if (param1 <= 121) {
            this.field_a = 111;
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_d = null;
        if (param0 != 855) {
            field_c = (String) null;
        }
    }

    private ch() throws Throwable {
        throw new Error();
    }

    static {
        field_c = "This is a spider.<br><br>Spiders weave spider webs.<br><br>If the spider is standing on the web, the web will spread.<br><br>If you stand on the web, the spider will hear you.<br><br>Spiders are fast and very dangerous. Your only hope is to unite it with a rock!";
    }
}
