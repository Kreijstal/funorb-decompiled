/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vc extends qm {
    private ml field_P;
    private int field_Q;
    static bb field_O;
    static String field_N;

    final void a(int param0, int param1, int param2, ng param3) {
        try {
            ((vc) this).field_Q = ((vc) this).field_Q + 1;
            if (param0 != 40) {
                field_N = null;
            }
            super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "vc.L(" + param0 + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 41);
        }
    }

    final String b(byte param0) {
        if (((vc) this).field_D) {
            return ((vc) this).field_P.b((byte) -7);
        }
        if (param0 > 16) {
            return null;
        }
        field_N = null;
        return null;
    }

    final boolean a(ng param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            if (param1 == 27) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              ((vc) this).field_P = null;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("vc.HA(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 41);
        }
        return stackIn_3_0 != 0;
    }

    final static void a(int param0, int param1, int param2, sb param3, int param4, sb param5, int param6, int param7, int param8, jl param9, int param10, int param11, int param12, sb param13, int param14, jl param15, byte param16, int param17, int param18, int param19) {
        int var21_int = 0;
        RuntimeException var21 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            dj.a((byte) -109, param15, param9, 480);
            jj.a(param17, false, param0, param7, param18);
            op.b(240, 320, true);
            int discarded$2 = 8;
            int discarded$3 = 2;
            lg.a(param5, 8, -118, param3);
            pb.a(0, param13, 16, 0);
            ll.a((byte) -113, param19, param11, param14);
            var21_int = -33;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var21 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var21;
            stackOut_2_1 = new StringBuilder().append("vc.B(").append(param0).append(44).append(8).append(44).append(8).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param3 == null) {
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
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(44).append(2).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param5 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44).append(480).append(44).append(param7).append(44).append(240).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param9 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          L4: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(44).append(0).append(44).append(param11).append(44).append(0).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param13 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          L5: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(44).append(param14).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param15 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + 119 + 44 + param17 + 44 + param18 + 44 + param19 + 44 + 320 + 41);
        }
    }

    final void a(int param0, int param1, int param2, byte param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        dj var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        tf var14 = null;
        tf var15 = null;
        tf var16 = null;
        tf var17 = null;
        var12 = Pixelate.field_H ? 1 : 0;
        super.a(param0, param1, param2, (byte) 125);
        if (param1 == 0) {
          var6 = -40 / ((param3 - 70) / 49);
          var5 = (((vc) this).field_E >> 1) + param2 + ((vc) this).field_z;
          var7 = (((vc) this).field_C >> 1) + (((vc) this).field_p + param0);
          var9 = ((vc) this).field_P.a((byte) 110);
          if (uo.field_b == var9) {
            var17 = ha.field_g[0];
            var10 = var17.field_A << 1;
            var11 = var17.field_B << 1;
            if (null != u.field_k) {
              if (var10 <= u.field_k.field_F) {
                if (u.field_k.field_E >= var11) {
                  h.a(-71, u.field_k);
                  t.d();
                  var17.a(112, 144, var17.field_A << 4, var17.field_B << 4, -((vc) this).field_Q << 10, 4096);
                  int discarded$8 = 92;
                  ia.a();
                  u.field_k.b(var5 + -var17.field_A, var7 - var17.field_B, 256);
                  return;
                } else {
                  u.field_k = new tf(var10, var11);
                  h.a(-83, u.field_k);
                  var17.a(112, 144, var17.field_A << 4, var17.field_B << 4, -((vc) this).field_Q << 10, 4096);
                  int discarded$9 = 92;
                  ia.a();
                  u.field_k.b(var5 + -var17.field_A, var7 - var17.field_B, 256);
                  return;
                }
              } else {
                u.field_k = new tf(var10, var11);
                h.a(-83, u.field_k);
                var17.a(112, 144, var17.field_A << 4, var17.field_B << 4, -((vc) this).field_Q << 10, 4096);
                int discarded$10 = 92;
                ia.a();
                u.field_k.b(var5 + -var17.field_A, var7 - var17.field_B, 256);
                return;
              }
            } else {
              u.field_k = new tf(var10, var11);
              h.a(-83, u.field_k);
              var17.a(112, 144, var17.field_A << 4, var17.field_B << 4, -((vc) this).field_Q << 10, 4096);
              int discarded$11 = 92;
              ia.a();
              u.field_k.b(var5 + -var17.field_A, var7 - var17.field_B, 256);
              return;
            }
          } else {
            if (var9 != tg.field_j) {
              if (var9 != sk.field_a) {
                if (qk.field_g != var9) {
                  return;
                } else {
                  var15 = ha.field_g[1];
                  var15.b(-(var15.field_F >> 1) + var5, var7 - (var15.field_E >> 1), 256);
                  return;
                }
              } else {
                var14 = ha.field_g[2];
                var14.b(var5 + -(var14.field_F >> 1), -(var14.field_E >> 1) + var7, 256);
                return;
              }
            } else {
              var16 = ha.field_g[0];
              var10 = var16.field_A << 1;
              var11 = var16.field_B << 1;
              if (null != u.field_k) {
                if (var10 <= u.field_k.field_F) {
                  if (u.field_k.field_E >= var11) {
                    h.a(-71, u.field_k);
                    t.d();
                    var16.a(112, 144, var16.field_A << 4, var16.field_B << 4, -((vc) this).field_Q << 10, 4096);
                    int discarded$12 = 92;
                    ia.a();
                    u.field_k.b(var5 + -var16.field_A, var7 - var16.field_B, 256);
                    return;
                  } else {
                    u.field_k = new tf(var10, var11);
                    h.a(-83, u.field_k);
                    var16.a(112, 144, var16.field_A << 4, var16.field_B << 4, -((vc) this).field_Q << 10, 4096);
                    int discarded$13 = 92;
                    ia.a();
                    u.field_k.b(var5 + -var16.field_A, var7 - var16.field_B, 256);
                    return;
                  }
                } else {
                  u.field_k = new tf(var10, var11);
                  h.a(-83, u.field_k);
                  var16.a(112, 144, var16.field_A << 4, var16.field_B << 4, -((vc) this).field_Q << 10, 4096);
                  int discarded$14 = 92;
                  ia.a();
                  u.field_k.b(var5 + -var16.field_A, var7 - var16.field_B, 256);
                  return;
                }
              } else {
                u.field_k = new tf(var10, var11);
                h.a(-83, u.field_k);
                var16.a(112, 144, var16.field_A << 4, var16.field_B << 4, -((vc) this).field_Q << 10, 4096);
                int discarded$15 = 92;
                ia.a();
                u.field_k.b(var5 + -var16.field_A, var7 - var16.field_B, 256);
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    public static void a() {
        field_N = null;
        field_O = null;
    }

    vc(ml param0) {
        try {
            ((vc) this).field_P = param0;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "vc.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_O = new bb();
        field_N = "Connection timed out. Please try using a different server.";
    }
}
