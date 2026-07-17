/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vn extends no {
    static jp field_w;
    static mh field_A;
    static String field_H;
    int field_I;
    static java.math.BigInteger field_F;
    static jp[] field_G;
    private int field_z;
    static jp[] field_K;
    hp field_E;
    int field_v;
    static String field_x;
    int field_C;
    int field_J;
    static jp field_D;
    int field_B;
    hp field_y;

    private vn(int param0, int param1) {
        super(0, 0, 0, 0, 1536, 0);
        ((vn) this).field_E = new hp(50);
        ((vn) this).field_y = new hp(50);
        ((vn) this).field_z = param0;
        ((vn) this).a(((vn) this).field_z, param1, 116);
    }

    final static th a(int param0, byte param1) {
        th[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        th[] var5 = null;
        var4 = BrickABrac.field_J ? 1 : 0;
        int discarded$2 = 0;
        var5 = lq.b();
        var2 = var5;
        var3 = 0;
        L0: while (true) {
          if (var5.length > var3) {
            if (param0 == var5[var3].field_e) {
              return var5[var3];
            } else {
              var3++;
              continue L0;
            }
          } else {
            return null;
          }
        }
    }

    final void a(vo param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ((vn) this).field_j = -1536 + (param0.field_j - -(param0.field_u >> 1));
              ((vn) this).field_m = param0.field_m - 3072;
              ((vn) this).field_j = ((vn) this).field_j + param0.field_u * ((vn) this).field_z / 3072;
              if (param1 == 0) {
                break L1;
              } else {
                ((vn) this).field_E = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("vn.P(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 41);
        }
    }

    vn(int param0, int param1, int param2, int param3) {
        super(param0, param1, param2, param3, 1536, 0);
        ((vn) this).field_E = new hp(50);
        ((vn) this).field_y = new hp(50);
    }

    final static int[] d(int param0) {
        if (param0 != 8) {
            int[] discarded$0 = vn.d(-23);
            return new int[8];
        }
        return new int[8];
    }

    public static void c() {
        field_F = null;
        field_w = null;
        field_G = null;
        field_x = null;
        field_A = null;
        field_H = null;
        field_D = null;
        field_K = null;
    }

    vn() {
        this(0, 0, 0, 0);
    }

    final void a(int param0, int param1, int param2) {
        ((vn) this).field_k = (sa.a(param0, -4097) >> 8) * param1 >> 8;
        if (param2 < 95) {
          return;
        } else {
          ((vn) this).field_o = (BrickABrac.c(2048, param0) >> 8) * -param1 >> 8;
          return;
        }
    }

    vn(vo param0, int param1, int param2) {
        this(param1, param2);
        try {
            ((vn) this).a(param0, 0);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "vn.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    final void a(int param0, wq param1) {
        super.a(107, param1);
        ((vn) this).field_C = param1.e(255);
        if (param0 < 89) {
            return;
        }
        try {
            ((vn) this).field_v = param1.i(65280);
            ((vn) this).field_J = param1.a(126);
            ((vn) this).field_z = param1.a(126);
            ((vn) this).field_I = param1.c((byte) -82);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "vn.L(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final int a(int param0, StringBuilder param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param0 > 79) {
                break L1;
              } else {
                ((vn) this).c(-49, 14);
                break L1;
              }
            }
            L2: {
              var3_int = -19088744 ^ super.a(93, param1);
              if (param1 != null) {
                StringBuilder discarded$3 = param1.append("base checksum for ball: " + Integer.toString(var3_int, 16) + "\n");
                StringBuilder discarded$4 = param1.append(((vn) this).field_j + " " + ((vn) this).field_m + " " + ((vn) this).field_k + " " + ((vn) this).field_o + " " + " " + ((vn) this).field_i + " " + ((vn) this).field_l + "\n");
                StringBuilder discarded$5 = param1.append("Ball Info: " + ((vn) this).field_v + " " + ((vn) this).field_J + " " + ((vn) this).field_C + " " + ((vn) this).field_z + "\n");
                break L2;
              } else {
                break L2;
              }
            }
            var3_int = var3_int ^ ((vn) this).field_v * 83 - -119 << 12;
            var3_int = var3_int ^ 57 + ((vn) this).field_J * 13 << 18;
            var3_int = var3_int ^ 6483 + ((vn) this).field_C * 53 << 3;
            var3_int = var3_int ^ ((vn) this).field_z * 5 - -289 << 5;
            stackOut_5_0 = var3_int;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("vn.A(").append(param0).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
        return stackIn_6_0;
    }

    final void b(int param0, int param1) {
        ((vn) this).field_J = ((vn) this).field_J + param1;
        ((vn) this).field_v = 0;
        if (param0 > -27) {
            ((vn) this).a(119, 71, 24);
        }
    }

    final void c(int param0, int param1) {
        int var3 = kj.a(((vn) this).field_k * ((vn) this).field_k + ((vn) this).field_o * ((vn) this).field_o, 2) >> 8;
        int var4 = param1 + var3;
        if (var4 < param0) {
            var4 = 512;
        }
        if (!(var4 <= 3840)) {
            var4 = 3840;
        }
        ((vn) this).field_k = ((vn) this).field_k * var4 / var3;
        ((vn) this).field_o = var4 * ((vn) this).field_o / var3;
    }

    final void a(byte param0, int param1) {
        if (param0 != 40) {
          field_K = null;
          ((vn) this).field_v = ((vn) this).field_v + param1;
          ((vn) this).field_J = 0;
          return;
        } else {
          ((vn) this).field_v = ((vn) this).field_v + param1;
          ((vn) this).field_J = 0;
          return;
        }
    }

    final void a(int param0, int param1) {
        ((vn) this).a(param1, kj.a(((vn) this).field_o * ((vn) this).field_o + ((vn) this).field_k * ((vn) this).field_k, 2) >> 8, 107);
        if (param0 != 6546) {
            ((vn) this).field_v = -29;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = "Unpacking levels";
        field_H = "To server list";
        field_F = new java.math.BigInteger("65537");
    }
}
