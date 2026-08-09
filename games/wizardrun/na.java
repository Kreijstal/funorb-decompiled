/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class na {
    static String field_l;
    static int field_e;
    th field_b;
    th field_a;
    th field_j;
    th field_m;
    va field_i;
    long field_d;
    int field_f;
    volatile int field_n;
    va field_g;
    byte field_h;
    volatile int field_k;
    fi field_c;

    final boolean a(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 != 3473) {
          L0: {
            this.c(23);
            if ((this.d(param0 ^ -14914) ^ -1) > -21) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if ((this.d(param0 ^ -14914) ^ -1) > -21) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    abstract void a(boolean param0, Object param1, int param2);

    final boolean c(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 != -21) {
          L0: {
            this.field_j = (th) null;
            if ((this.c((byte) -120) ^ -1) > -21) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if ((this.c((byte) -120) ^ -1) > -21) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    abstract void a(byte param0);

    abstract boolean b(byte param0);

    final int d(int param0) {
        if (param0 != -14289) {
          this.field_k = -124;
          return this.field_b.c(4) + this.field_a.c(param0 + 14293);
        } else {
          return this.field_b.c(4) + this.field_a.c(param0 + 14293);
        }
    }

    final int c(byte param0) {
        if (param0 >= -16) {
          this.a(120);
          return this.field_j.c(4) - -this.field_m.c(4);
        } else {
          return this.field_j.c(4) - -this.field_m.c(4);
        }
    }

    abstract void a(boolean param0);

    public static void b(int param0) {
        if (param0 != 0) {
            return;
        }
        field_l = null;
    }

    final fi a(int param0, int param1, byte param2, byte param3, boolean param4) {
        long var6;
        fi var8;
        fi stackIn_2_0 = null;
        fi stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        L0: {
          var6 = ((long)param0 << 1571593632) - -(long)param1;
          var8 = new fi();
          stackIn_2_0 = (fi) (var8);

          if (!param4) {
            stackIn_3_0 = (fi) ((Object) stackIn_2_0);
            stackIn_3_1 = 0;
            break L0;
          } else {
            stackIn_3_0 = (fi) ((Object) stackIn_2_0);
            stackIn_3_1 = 1;
            break L0;
          }
        }
        L1: {
          stackIn_3_0.field_r = stackIn_3_1 != 0;
          var8.field_o = var6;
          var8.field_D = param3;
          if (!param4) {
            if (20 <= this.c((byte) -76)) {
              throw new RuntimeException();
            } else {
              this.field_j.a(var8, 14);
              break L1;
            }
          } else {
            if (this.d(-14289) < 20) {
              this.field_b.a(var8, 14);
              break L1;
            } else {
              throw new RuntimeException();
            }
          }
        }
        if (param2 >= -64) {
          return (fi) null;
        } else {
          return var8;
        }
    }

    na() {
        this.field_b = new th();
        this.field_a = new th();
        this.field_j = new th();
        this.field_m = new th();
        this.field_i = new va(6);
        this.field_h = (byte) 0;
        this.field_k = 0;
        this.field_n = 0;
        this.field_g = new va(10);
    }

    static {
    }
}
