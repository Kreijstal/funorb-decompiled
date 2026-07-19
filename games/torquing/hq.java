/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hq {
    static String field_c;
    private int field_i;
    private int[] field_f;
    private boolean field_g;
    private int field_b;
    static String[] field_d;
    static vh field_a;
    static t[] field_h;
    static String field_e;

    private final int a(byte param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = Torquing.field_u;
        if (param0 != -6) {
          return -92;
        } else {
          var3 = this.field_f.length;
          L0: while (true) {
            if (var3 > param1) {
              return var3;
            } else {
              if (!this.field_g) {
                var3 = var3 + this.field_b;
                continue L0;
              } else {
                if (-1 != (var3 ^ -1)) {
                  var3 = var3 * this.field_b;
                  continue L0;
                } else {
                  var3 = 1;
                  continue L0;
                }
              }
            }
          }
        }
    }

    final void c(int param0, int param1) {
        if (param1 == 17424) {
          if ((param0 ^ -1) <= -1) {
            if (param0 <= this.field_i) {
              if (param0 != this.field_i) {
                dk.a(this.field_f, param0 + 1, this.field_f, param0, this.field_i - param0);
                this.field_i = this.field_i - 1;
                return;
              } else {
                this.field_i = this.field_i - 1;
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

    public static void a(int param0) {
        field_c = null;
        if (param0 != -1) {
          hq.a(-97);
          field_a = null;
          field_e = null;
          field_d = null;
          field_h = null;
          return;
        } else {
          field_a = null;
          field_e = null;
          field_d = null;
          field_h = null;
          return;
        }
    }

    private final void a(int param0, boolean param1, int param2) {
        L0: {
          if (this.field_i < param2) {
            this.field_i = param2;
            break L0;
          } else {
            break L0;
          }
        }
        if (!param1) {
          L1: {
            this.field_g = true;
            if (this.field_f.length <= param2) {
              this.a(0, param2);
              break L1;
            } else {
              break L1;
            }
          }
          this.field_f[param2] = param0;
          return;
        } else {
          L2: {
            if (this.field_f.length <= param2) {
              this.a(0, param2);
              break L2;
            } else {
              break L2;
            }
          }
          this.field_f[param2] = param0;
          return;
        }
    }

    final void d(int param0, int param1) {
        int discarded$0 = 0;
        this.a(param0, true, 1 + this.field_i);
        if (param1 != -8673) {
            discarded$0 = this.a(true);
        }
    }

    private final void a(int param0, int param1) {
        int[] var4 = new int[this.a((byte) -6, param1)];
        int[] var3 = var4;
        dk.a(this.field_f, param0, var4, 0, this.field_f.length);
        this.field_f = var4;
    }

    private hq() throws Throwable {
        throw new Error();
    }

    final int b(int param0, int param1) {
        if (param1 <= this.field_i) {
          if (param0 < 29) {
            return 94;
          } else {
            return this.field_f[param1];
          }
        } else {
          throw new ArrayIndexOutOfBoundsException(param1);
        }
    }

    final int a(boolean param0) {
        if (!param0) {
            return 105;
        }
        return this.field_i + 1;
    }

    static {
        field_c = "Login: ";
        field_d = new String[3];
        field_e = "Error connecting to server. Please try using a different server.";
    }
}
