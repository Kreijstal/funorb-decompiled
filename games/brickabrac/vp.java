/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vp extends km {
    static mm field_u;
    static String field_s;
    static char[] field_r;
    private int field_t;

    final void a(boolean param0, boolean param1, int param2) {
        if (param2 < -52) {
          if (param1) {
            int fieldTemp$14 = ((vp) this).field_t - 1;
            ((vp) this).field_t = ((vp) this).field_t - 1;
            if (fieldTemp$14 != 0) {
              if (cb.field_q == 0) {
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
          jp[] discarded$15 = vp.a(true, (byte) -10, 12, -97, -36, false);
          if (param1) {
            int fieldTemp$16 = ((vp) this).field_t - 1;
            ((vp) this).field_t = ((vp) this).field_t - 1;
            if (fieldTemp$16 != 0) {
              if (cb.field_q == 0) {
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
            field_s = null;
            lf.field_t = null;
            return;
        }
        lf.field_t = null;
    }

    vp() {
        super(21, 0, 0, 0, 0, (int[]) null);
        ((vp) this).field_t = 250;
    }

    final static l a(int param0, oe param1) {
        RuntimeException var2 = null;
        l stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        l stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            stackOut_0_0 = sk.a((byte) 117, kl.b(param1, 100, 96));
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("vp.B(").append(108).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    public static void f(int param0) {
        field_u = null;
        field_s = null;
        field_r = null;
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
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        jp var9 = null;
        Object var10 = null;
        Object var11 = null;
        int[] var12 = null;
        jp var13 = null;
        jp var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        L0: {
          var18 = lb.field_l;
          var17 = var18;
          var16 = var17;
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
            var10 = (Object) (Object) var13;
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
            var11 = (Object) (Object) var14;
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
          return null;
        } else {
          lb.a(var18, var7, var8);
          return new jp[]{null, null, null, (jp) var10, var9, (jp) var11, null, null, null};
        }
    }

    final boolean a(char param0, int param1, int param2) {
        if (param1 < 98) {
          ((vp) this).field_t = -100;
          if (param2 < 0) {
            return true;
          } else {
            ng.a(false, 99, 0);
            return true;
          }
        } else {
          L0: {
            if (param2 >= 0) {
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
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = "Speed down: decreases the speed of any ball in play.";
        field_r = new char[128];
    }
}
