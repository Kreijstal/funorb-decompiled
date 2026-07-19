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
        if (param1 <= this.field_b) {
          if (param2 > -21) {
            L0: {
              this.a(-36, -84, -23);
              if (this.field_e.length <= param1) {
                this.b((byte) 107, param1);
                break L0;
              } else {
                break L0;
              }
            }
            this.field_e[param1] = param0;
            return;
          } else {
            L1: {
              if (this.field_e.length <= param1) {
                this.b((byte) 107, param1);
                break L1;
              } else {
                break L1;
              }
            }
            this.field_e[param1] = param0;
            return;
          }
        } else {
          this.field_b = param1;
          if (param2 <= -21) {
            L2: {
              if (this.field_e.length <= param1) {
                this.b((byte) 107, param1);
                break L2;
              } else {
                break L2;
              }
            }
            this.field_e[param1] = param0;
            return;
          } else {
            L3: {
              this.a(-36, -84, -23);
              if (this.field_e.length <= param1) {
                this.b((byte) 107, param1);
                break L3;
              } else {
                break L3;
              }
            }
            this.field_e[param1] = param0;
            return;
          }
        }
    }

    final int a(byte param0) {
        if (param0 != 56) {
            field_c = (bi) null;
            return this.field_b - -1;
        }
        return this.field_b - -1;
    }

    final void a(int param0, int param1) {
        if (param0 != 13378) {
            return;
        }
        this.a(param1, this.field_b - -1, -23);
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
        if (param1 != 0) {
          field_j = (int[]) null;
          var3 = this.field_e.length;
          L0: while (true) {
            if (param0 < var3) {
              return var3;
            } else {
              if (!this.field_h) {
                var3 = var3 + this.field_g;
                continue L0;
              } else {
                if (-1 != (var3 ^ -1)) {
                  var3 = var3 * this.field_g;
                  continue L0;
                } else {
                  var3 = 1;
                  continue L0;
                }
              }
            }
          }
        } else {
          var3 = this.field_e.length;
          L1: while (true) {
            if (param0 < var3) {
              return var3;
            } else {
              if (!this.field_h) {
                var3 = var3 + this.field_g;
                continue L1;
              } else {
                if (-1 != (var3 ^ -1)) {
                  var3 = var3 * this.field_g;
                  continue L1;
                } else {
                  var3 = 1;
                  continue L1;
                }
              }
            }
          }
        }
    }

    final void a(int param0, boolean param1) {
        if (0 <= param0) {
          if (param0 <= this.field_b) {
            L0: {
              if (this.field_b != param0) {
                ps.a(this.field_e, 1 + param0, this.field_e, param0, this.field_b - param0);
                break L0;
              } else {
                break L0;
              }
            }
            this.field_b = this.field_b - 1;
            if (param1) {
              this.field_e = (int[]) null;
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
        if (this.field_b < param1) {
          throw new ArrayIndexOutOfBoundsException(param1);
        } else {
          var3 = 3 % ((param0 - -52) / 63);
          return this.field_e[param1];
        }
    }

    private final void b(byte param0, int param1) {
        int[] var3 = null;
        int[] var4 = null;
        var4 = new int[this.b(param1, 0)];
        var3 = var4;
        ps.a(this.field_e, 0, var4, 0, this.field_e.length);
        this.field_e = var4;
        if (param0 != 107) {
          this.field_e = (int[]) null;
          return;
        } else {
          return;
        }
    }

    private hn() throws Throwable {
        throw new Error();
    }

    static {
        field_f = new String[]{"Red Coalition", "Green Empire", "Blue Confederacy", "Magenta Union", "Yellow Imperium", "Cyan League"};
        field_j = new int[]{2, 3, 4, 5, 6};
        field_a = "Offer rematch";
    }
}
