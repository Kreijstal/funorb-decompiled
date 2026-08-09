/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class wl {
    dl field_n;
    static le[] field_f;
    dl field_j;
    static pj field_d;
    dl field_i;
    dl field_c;
    long field_e;
    int field_h;
    gk field_l;
    volatile int field_a;
    gk field_g;
    byte field_m;
    volatile int field_b;
    ob field_k;

    final boolean a(int param0) {
        if (param0 != 20) {
            return false;
        }
        return 20 <= this.d((byte) -25) ? true : false;
    }

    final int c(int param0) {
        if (param0 != 24547) {
          this.d(-103);
          return this.field_n.a(-110) - -this.field_j.a(-108);
        } else {
          return this.field_n.a(-110) - -this.field_j.a(-108);
        }
    }

    abstract void a(int param0, boolean param1, Object param2);

    abstract void b(byte param0);

    abstract void b(int param0);

    final int d(byte param0) {
        if (param0 != -25) {
          this.a(63, 40, 75, true, (byte) 12);
          return this.field_i.a(param0 + -82) + this.field_c.a(-112);
        } else {
          return this.field_i.a(param0 + -82) + this.field_c.a(-112);
        }
    }

    final ob a(int param0, int param1, int param2, boolean param3, byte param4) {
        ob stackIn_3_0 = null;
        ob stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        ob stackIn_15_0 = null;
        ob stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        long var6;
        ob var8;
        var6 = (long)param1 + ((long)param0 << -644403680);
        if (param2 >= 74) {
          L0: {
            var8 = new ob();
            var8.field_q = param4;
            stackIn_15_0 = (ob) (var8);

            if (!param3) {
              stackIn_16_0 = (ob) ((Object) stackIn_15_0);
              stackIn_16_1 = 0;
              break L0;
            } else {
              stackIn_16_0 = (ob) ((Object) stackIn_15_0);
              stackIn_16_1 = 1;
              break L0;
            }
          }
          L1: {
            stackIn_16_0.field_m = stackIn_16_1 != 0;
            var8.field_f = var6;
            if (param3) {
              break L1;
            } else {
              if ((this.d((byte) -25) ^ -1) > -21) {
                this.field_i.a(var8, (byte) -105);
                if (MonkeyPuzzle2.field_F) {
                  break L1;
                } else {
                  return var8;
                }
              } else {
                throw new RuntimeException();
              }
            }
          }
          if (20 <= this.c(24547)) {
            throw new RuntimeException();
          } else {
            this.field_n.a(var8, (byte) -73);
            return var8;
          }
        } else {
          L2: {
            field_d = (pj) null;
            var8 = new ob();
            var8.field_q = param4;
            stackIn_3_0 = (ob) (var8);

            if (!param3) {
              stackIn_4_0 = (ob) ((Object) stackIn_3_0);
              stackIn_4_1 = 0;
              break L2;
            } else {
              stackIn_4_0 = (ob) ((Object) stackIn_3_0);
              stackIn_4_1 = 1;
              break L2;
            }
          }
          L3: {
            stackIn_4_0.field_m = stackIn_4_1 != 0;
            var8.field_f = var6;
            if (param3) {
              break L3;
            } else {
              if ((this.d((byte) -25) ^ -1) > -21) {
                this.field_i.a(var8, (byte) -105);
                if (MonkeyPuzzle2.field_F) {
                  break L3;
                } else {
                  return var8;
                }
              } else {
                throw new RuntimeException();
              }
            }
          }
          if (20 <= this.c(24547)) {
            throw new RuntimeException();
          } else {
            this.field_n.a(var8, (byte) -73);
            return var8;
          }
        }
    }

    abstract boolean a(byte param0);

    public static void c(byte param0) {
        field_f = null;
        field_d = null;
        if (param0 < 99) {
            field_d = (pj) null;
        }
    }

    final static tb a(ad param0, int param1, ad param2, int param3, int param4) {
        RuntimeException var5 = null;
        tb stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (wg.a(param4, param3, param2, -3)) {
              L1: {
                if (param1 == -26348) {
                  break L1;
                } else {
                  field_f = (le[]) null;
                  break L1;
                }
              }
              stackIn_6_0 = rl.a(param1 + -6118, param0.b(255, param3, param4));
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("wl.L(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_6_0;
    }

    final boolean d(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 != 20) {
          L0: {
            this.field_n = (dl) null;
            if (20 > this.c(param0 + 24527)) {
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
            if (20 > this.c(param0 + 24527)) {
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

    final static void e(byte param0) {
        if (ba.field_f == null) {
          return;
        } else {
          L0: {
            vh.a(ba.field_f, (byte) 9);
            ba.field_f.a((byte) -107, rc.field_k);
            ba.field_f = null;
            if (ci.field_a != null) {
              ci.field_a.e(0);
              break L0;
            } else {
              break L0;
            }
          }
          if (param0 <= 98) {
            return;
          } else {
            ie.field_e.requestFocus();
            return;
          }
        }
    }

    wl() {
        this.field_n = new dl();
        this.field_j = new dl();
        this.field_i = new dl();
        this.field_c = new dl();
        this.field_l = new gk(6);
        this.field_b = 0;
        this.field_a = 0;
        this.field_m = (byte) 0;
        this.field_g = new gk(10);
    }

    static {
    }
}
