/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gl extends fi {
    static pg field_B;
    static String field_C;
    static String field_z;
    static int field_D;
    static int field_y;
    int field_A;

    public gl() {
        super(0, 0, 0, 0, (ui) null, (ma) null);
        ((gl) this).field_A = 256;
    }

    gl(qg param0) {
        super(param0.field_p, param0.field_n, param0.field_l, param0.field_h, (ui) null, (ma) null);
        try {
            param0.a(-128, 0, 0, ((gl) this).field_l, ((gl) this).field_h);
            ((gl) this).field_v = param0;
            ((gl) this).field_A = 256;
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) (Object) runtimeException, "gl.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void i(int param0) {
        field_C = null;
        field_z = null;
        field_B = null;
        if (param0 != 2483) {
            gl.j(-39);
        }
    }

    final static void a(byte param0, java.math.BigInteger param1, java.math.BigInteger param2, byte[] param3, oa param4, int param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        var10 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var7_int = ta.a(0, param5);
              if (null == i.field_a) {
                i.field_a = new java.security.SecureRandom();
                break L1;
              } else {
                break L1;
              }
            }
            var15 = new int[4];
            var14 = var15;
            var13 = var14;
            var12 = var13;
            var8 = var12;
            var9 = 0;
            L2: while (true) {
              if (var9 >= 4) {
                L3: {
                  L4: {
                    if (pg.field_b == null) {
                      break L4;
                    } else {
                      if (var7_int <= pg.field_b.field_g.length) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  pg.field_b = new oa(var7_int);
                  break L3;
                }
                L5: {
                  L6: {
                    pg.field_b.field_h = 0;
                    pg.field_b.a((byte) -10, param3, param5, 0);
                    pg.field_b.h(-30190, var7_int);
                    pg.field_b.a(var15, 111);
                    if (kd.field_c == null) {
                      break L6;
                    } else {
                      if (kd.field_c.field_g.length < 100) {
                        break L6;
                      } else {
                        break L5;
                      }
                    }
                  }
                  kd.field_c = new oa(100);
                  break L5;
                }
                kd.field_c.field_h = 0;
                kd.field_c.f(6389, 10);
                var11 = 0;
                var9 = var11;
                L7: while (true) {
                  if (4 <= var11) {
                    kd.field_c.c(param5, -159688920);
                    kd.field_c.a(param2, -119, param1);
                    param4.a((byte) -29, kd.field_c.field_g, kd.field_c.field_h, 0);
                    param4.a((byte) -108, pg.field_b.field_g, pg.field_b.field_h, 0);
                    break L0;
                  } else {
                    kd.field_c.a(-119, var15[var11]);
                    var11++;
                    continue L7;
                  }
                }
              } else {
                var8[var9] = i.field_a.nextInt();
                var9++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var7 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var7;
            stackOut_20_1 = new StringBuilder().append("gl.A(").append(-126).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L8;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L8;
            }
          }
          L9: {
            stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param2 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L9;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L9;
            }
          }
          L10: {
            stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
            stackOut_26_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',');
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param3 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L10;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L10;
            }
          }
          L11: {
            stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
            stackOut_29_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',');
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param4 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L11;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L11;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + ',' + param5 + ',' + 0 + ')');
        }
    }

    final void a(int param0, int param1, int param2, byte param3) {
        if (0 != param2) {
            return;
        }
        if (!(((gl) this).field_v != null)) {
            return;
        }
        if (!(((gl) this).field_A != 0)) {
            return;
        }
        if (256 == ((gl) this).field_A) {
            ((gl) this).field_v.a(param0 - -((gl) this).field_p, ((gl) this).field_n + param1, param2, (byte) -12);
            return;
        }
        int var6 = -59 / ((77 - param3) / 34);
        ti var7 = new ti(((gl) this).field_v.field_l, ((gl) this).field_v.field_h);
        int discarded$0 = 256;
        oj.a(var7);
        ((gl) this).field_v.a(0, 0, param2, (byte) -117);
        fi.c(true);
        var7.e(((gl) this).field_p + param0, ((gl) this).field_n + param1, ((gl) this).field_A);
    }

    final static void j(int param0) {
        if (param0 != 31107) {
            field_B = null;
        }
        if (!(null == re.field_h)) {
            re.field_h.d();
        }
        if (u.field_a != null) {
            u.field_a.d();
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "Just play";
        field_C = "This entry doesn't match";
        field_D = 0;
    }
}
