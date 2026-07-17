/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mha extends rj {
    static long field_D;
    private nua field_z;
    private int field_A;
    private static String[] field_B;
    static int field_C;
    static String field_F;
    static int field_E;

    final String d(byte param0) {
        int var2 = -38 / ((-58 - param0) / 60);
        if (!((mha) this).field_f) {
            return null;
        }
        return ((mha) this).field_z.a(127);
    }

    public static void b() {
        field_B = null;
        field_F = null;
    }

    final void a(int param0, int param1, ae param2, int param3) {
        try {
            ((mha) this).field_A = ((mha) this).field_A + 1;
            super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "mha.A(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 41);
        }
    }

    mha(nua param0) {
        try {
            ((mha) this).field_z = param0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "mha.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        it var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        iu var12 = null;
        iu var13 = null;
        iu var15 = null;
        iu var16 = null;
        var11 = TombRacer.field_G ? 1 : 0;
        super.a(param0, param1, 0, param3);
        if (param3 == param2) {
          var5 = (((mha) this).field_m >> 1) + ((mha) this).field_i + param0;
          var6 = (((mha) this).field_p >> 1) + param1 - -((mha) this).field_n;
          var8 = ((mha) this).field_z.b(-4666);
          if (gla.field_p != var8) {
            if (tea.field_b != var8) {
              if (fp.field_c != var8) {
                if (uh.field_k == var8) {
                  var12 = pq.field_b[1];
                  var12.a(var5 + -(var12.field_m >> 1), -(var12.field_q >> 1) + var6, 256);
                  return;
                } else {
                  return;
                }
              } else {
                var13 = pq.field_b[2];
                var13.a(var5 + -(var13.field_m >> 1), var6 + -(var13.field_q >> 1), 256);
                return;
              }
            } else {
              var16 = pq.field_b[0];
              var9 = var16.field_n << 1;
              var10 = var16.field_k << 1;
              if (null != aj.field_l) {
                if (aj.field_l.field_m >= var9) {
                  if (var10 <= aj.field_l.field_q) {
                    nm.a(aj.field_l, (byte) 95);
                    bea.a();
                    var16.a(112, 144, var16.field_n << 4, var16.field_k << 4, -((mha) this).field_A << 10, 4096);
                    pfa.a(1);
                    aj.field_l.a(-var16.field_n + var5, var6 - var16.field_k, 256);
                    return;
                  } else {
                    aj.field_l = new iu(var9, var10);
                    nm.a(aj.field_l, (byte) 108);
                    var16.a(112, 144, var16.field_n << 4, var16.field_k << 4, -((mha) this).field_A << 10, 4096);
                    pfa.a(1);
                    aj.field_l.a(-var16.field_n + var5, var6 - var16.field_k, 256);
                    return;
                  }
                } else {
                  aj.field_l = new iu(var9, var10);
                  nm.a(aj.field_l, (byte) 108);
                  var16.a(112, 144, var16.field_n << 4, var16.field_k << 4, -((mha) this).field_A << 10, 4096);
                  pfa.a(1);
                  aj.field_l.a(-var16.field_n + var5, var6 - var16.field_k, 256);
                  return;
                }
              } else {
                aj.field_l = new iu(var9, var10);
                nm.a(aj.field_l, (byte) 108);
                var16.a(112, 144, var16.field_n << 4, var16.field_k << 4, -((mha) this).field_A << 10, 4096);
                pfa.a(1);
                aj.field_l.a(-var16.field_n + var5, var6 - var16.field_k, 256);
                return;
              }
            }
          } else {
            var15 = pq.field_b[0];
            var9 = var15.field_n << 1;
            var10 = var15.field_k << 1;
            if (null != aj.field_l) {
              if (aj.field_l.field_m >= var9) {
                if (var10 <= aj.field_l.field_q) {
                  nm.a(aj.field_l, (byte) 95);
                  bea.a();
                  var15.a(112, 144, var15.field_n << 4, var15.field_k << 4, -((mha) this).field_A << 10, 4096);
                  pfa.a(1);
                  aj.field_l.a(-var15.field_n + var5, var6 - var15.field_k, 256);
                  return;
                } else {
                  aj.field_l = new iu(var9, var10);
                  nm.a(aj.field_l, (byte) 108);
                  var15.a(112, 144, var15.field_n << 4, var15.field_k << 4, -((mha) this).field_A << 10, 4096);
                  pfa.a(1);
                  aj.field_l.a(-var15.field_n + var5, var6 - var15.field_k, 256);
                  return;
                }
              } else {
                aj.field_l = new iu(var9, var10);
                nm.a(aj.field_l, (byte) 108);
                var15.a(112, 144, var15.field_n << 4, var15.field_k << 4, -((mha) this).field_A << 10, 4096);
                pfa.a(1);
                aj.field_l.a(-var15.field_n + var5, var6 - var15.field_k, 256);
                return;
              }
            } else {
              aj.field_l = new iu(var9, var10);
              nm.a(aj.field_l, (byte) 108);
              var15.a(112, 144, var15.field_n << 4, var15.field_k << 4, -((mha) this).field_A << 10, 4096);
              pfa.a(1);
              aj.field_l.a(-var15.field_n + var5, var6 - var15.field_k, 256);
              return;
            }
          }
        } else {
          return;
        }
    }

    final boolean a(ae param0, boolean param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (!param1) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("mha.S(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 41);
        }
        return stackIn_4_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = new String[5];
        field_B[3] = "Floating Rotator";
        field_B[0] = "Wheeled";
        field_B[4] = "Mirror Fixed";
        field_B[1] = "Mirror Base";
        field_B[2] = "Rotator";
        field_E = 480;
        field_F = "Cancel";
    }
}
