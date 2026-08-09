/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vp extends km {
    static mm field_u;
    static String field_s;
    static char[] field_r;
    private int field_t;

    final void a(boolean param0, boolean param1, int param2) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        if (param2 < -52) {
          if (param1) {
            fieldTemp$2 = this.field_t - 1;
            this.field_t = this.field_t - 1;
            if (fieldTemp$2 != 0) {
              if (-1 == (cb.field_q ^ -1)) {
                if (0 != ki.field_e) {
                  ng.a(true, 120, 0);
                  return;
                } else {
                  return;
                }
              } else {
                ng.a(true, 120, 0);
                return;
              }
            } else {
              ng.a(true, 120, 0);
              return;
            }
          } else {
            return;
          }
        } else {
          vp.a(true, (byte) -10, 12, -97, -36, false);
          if (param1) {
            fieldTemp$3 = this.field_t - 1;
            this.field_t = this.field_t - 1;
            if (fieldTemp$3 != 0) {
              if (-1 == (cb.field_q ^ -1)) {
                if (0 != ki.field_e) {
                  ng.a(true, 120, 0);
                  return;
                } else {
                  return;
                }
              } else {
                ng.a(true, 120, 0);
                return;
              }
            } else {
              ng.a(true, 120, 0);
              return;
            }
          } else {
            return;
          }
        }
    }

    final void d(byte param0) {
        if (param0 != 79) {
            field_s = (String) null;
            lf.field_t = null;
            return;
        }
        lf.field_t = null;
    }

    vp() {
        super(21, 0, 0, 0, 0, (int[]) null);
        this.field_t = 250;
    }

    final static l a(int param0, oe param1) {
        RuntimeException var2 = null;
        l stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 >= 75) {
                break L1;
              } else {
                field_u = (mm) null;
                break L1;
              }
            }
            stackIn_3_0 = sk.a((byte) 117, kl.b(param1, 100, 96));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("vp.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    public static void f(int param0) {
        oe var2;
        field_u = null;
        if (param0 != 0) {
          var2 = (oe) null;
          vp.a(-53, (oe) null);
          field_s = null;
          field_r = null;
          return;
        } else {
          field_s = null;
          field_r = null;
          return;
        }
    }

    final void b(byte param0) {
        if (param0 >= -14) {
            return;
        }
        lf.field_t.b(0, 0);
        pg.d(0);
        vi.a((byte) -115);
    }

    final static jp[] a(boolean param0, byte param1, int param2, int param3, int param4, boolean param5) {
        int[] var6;
        int var7;
        int var8;
        jp var9;
        Object var10;
        Object var11;
        int[] var12;
        jp var13;
        jp var14;
        int[] var15;
        int[] var16;
        L0: {
          var16 = lb.field_l;
          var15 = var16;
          var12 = var15;
          var6 = var12;
          var7 = lb.field_c;
          var8 = lb.field_d;
          var9 = new jp(16, param3);
          var9.g();
          lb.g(0, 0, 16, param3, param2, param4);
          var10 = null;
          if (!param0) {
            break L0;
          } else {
            var13 = var9.e();
            var10 = var13;
            var13.g();
            lb.c(0, 0, 5, 0);
            lb.c(0, 1, 3, 0);
            lb.c(0, 2, 2, 0);
            lb.c(0, 3, 1, 0);
            lb.c(0, 4, 1, 0);
            break L0;
          }
        }
        L1: {
          var11 = null;
          if (!param5) {
            break L1;
          } else {
            var14 = var9.e();
            var11 = var14;
            var14.g();
            lb.c(11, 0, 5, 0);
            lb.c(13, 1, 3, 0);
            lb.c(14, 2, 2, 0);
            lb.c(15, 3, 1, 0);
            lb.c(15, 4, 1, 0);
            break L1;
          }
        }
        if (param1 < 32) {
          return (jp[]) null;
        } else {
          lb.a(var16, var7, var8);
          return new jp[]{null, null, null, (jp) (var10), var9, (jp) (var11), null, null, null};
        }
    }

    final boolean a(char param0, int param1, int param2) {
        if (param1 < 98) {
          this.field_t = -100;
          if ((param2 ^ -1) > -1) {
            return true;
          } else {
            ng.a(false, 99, 0);
            return true;
          }
        } else {
          L0: {
            if ((param2 ^ -1) <= -1) {
              ng.a(false, 99, 0);
              break L0;
            } else {
              break L0;
            }
          }
          return true;
        }
    }

    static {
        field_s = "Speed down: decreases the speed of any ball in play.";
        field_r = new char[128];
    }
}
