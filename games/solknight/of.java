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
        if (param0 != 1) {
          field_g = 47;
          field_f = null;
          field_b = null;
          field_d = null;
          return;
        } else {
          field_f = null;
          field_b = null;
          field_d = null;
          return;
        }
    }

    final void c(int param0, int param1) {
        int var3 = -67 % ((-45 - param0) / 43);
        this.a(1 + this.field_h, (byte) 61, param1);
    }

    private final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        boolean stackIn_5_0 = false;
        boolean stackIn_6_0 = false;
        boolean stackOut_4_0 = false;
        var4 = SolKnight.field_L ? 1 : 0;
        var3 = this.field_a.length;
        if (param1 < -98) {
          L0: while (true) {
            if (var3 <= param0) {
              stackOut_4_0 = this.field_i;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (var4 == 0) {
                if (!stackIn_6_0) {
                  var3 = var3 + this.field_c;
                  continue L0;
                } else {
                  if (var3 != 0) {
                    var3 = var3 * this.field_c;
                    continue L0;
                  } else {
                    var3 = 1;
                    continue L0;
                  }
                }
              } else {
                return stackIn_5_0 ? 1 : 0;
              }
            } else {
              return var3;
            }
          }
        } else {
          return -103;
        }
    }

    final void a(boolean param0, int param1) {
        int discarded$2 = 0;
        if ((param1 ^ -1) <= -1) {
          if (param1 <= this.field_h) {
            L0: {
              if (this.field_h != param1) {
                fk.a(this.field_a, 1 + param1, this.field_a, param1, -param1 + this.field_h);
                break L0;
              } else {
                break L0;
              }
            }
            this.field_h = this.field_h - 1;
            if (param0) {
              return;
            } else {
              discarded$2 = this.b(-55);
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
          if (param0 > this.field_h) {
            this.field_h = param0;
            break L0;
          } else {
            break L0;
          }
        }
        if (this.field_a.length > param0) {
          if (param1 != 61) {
            field_f = (o) null;
            this.field_a[param0] = param2;
            return;
          } else {
            this.field_a[param0] = param2;
            return;
          }
        } else {
          this.b(param0, 0);
          if (param1 == 61) {
            this.field_a[param0] = param2;
            return;
          } else {
            field_f = (o) null;
            this.field_a[param0] = param2;
            return;
          }
        }
    }

    private final void b(int param0, int param1) {
        int[] var4 = new int[this.a(param0, -113)];
        int[] var3 = var4;
        fk.a(this.field_a, param1, var4, 0, this.field_a.length);
        this.field_a = var4;
    }

    final int a(byte param0, int param1) {
        if (this.field_h >= param1) {
          if (param0 != 43) {
            this.field_h = 68;
            return this.field_a[param1];
          } else {
            return this.field_a[param1];
          }
        } else {
          throw new ArrayIndexOutOfBoundsException(param1);
        }
    }

    final int b(int param0) {
        int discarded$0 = 0;
        if (param0 <= 74) {
            discarded$0 = this.a((byte) -24, -1);
            return this.field_h - -1;
        }
        return this.field_h - -1;
    }

    static {
        field_g = 0;
    }
}
