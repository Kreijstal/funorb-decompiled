/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vd {
    static ie[] field_d;
    private static String field_e;
    static String field_a;
    static int field_b;
    static int field_c;

    final static byte[] a(String param0) {
        RuntimeException var2 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_2_0 = null;
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
            stackOut_2_0 = me.field_e.a(4, "", param0);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("vd.A(");
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
          throw fc.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + 4 + ')');
        }
        return stackIn_3_0;
    }

    final static hf a(int param0, boolean param1) {
        jd var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        jd var8 = null;
        ba var9 = null;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int[] stackIn_22_0 = null;
        Throwable decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int[] stackOut_21_0 = null;
        Object stackOut_20_0 = null;
        L0: {
          var7 = SolKnight.field_L ? 1 : 0;
          var8 = te.field_N;
          var2 = var8;
          var3 = var8.j(255);
          if ((var3 & 128) == 0) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          ml.field_e = stackIn_3_0 != 0;
          qk.field_m = 127 & var3;
          th.field_I = var8.j(255);
          q.field_b = var8.a(10526);
          if (qk.field_m != 2) {
            ah.field_c = 0;
            hc.field_b = 0;
            break L1;
          } else {
            hc.field_b = var8.i(-127);
            ah.field_c = var8.b(false);
            break L1;
          }
        }
        L2: {
          if (var8.j(255) != 1) {
            stackOut_8_0 = 0;
            stackIn_9_0 = stackOut_8_0;
            break L2;
          } else {
            stackOut_7_0 = 1;
            stackIn_9_0 = stackOut_7_0;
            break L2;
          }
        }
        L3: {
          var4 = stackIn_9_0;
          field_e = var8.h(40);
          if (var4 != 0) {
            field_a = var8.h(112);
            break L3;
          } else {
            field_a = field_e;
            break L3;
          }
        }
        L4: {
          if (1 == qk.field_m) {
            int discarded$7 = var8.i(-117);
            String discarded$8 = var8.h(27);
            break L4;
          } else {
            if (4 != qk.field_m) {
              break L4;
            } else {
              int discarded$9 = var8.i(-117);
              String discarded$10 = var8.h(27);
              break L4;
            }
          }
        }
        L5: {
          if (!param1) {
            int discarded$11 = 0;
            int discarded$12 = 80;
            ek.field_a = a.a((gb) (Object) var8);
            qe.field_G = null;
            break L5;
          } else {
            var5 = var8.i(12);
            try {
              L6: {
                L7: {
                  var9 = bf.field_f.a((byte) -109, var5);
                  ek.field_a = var9.a((byte) 100);
                  if (!field_a.equals((Object) (Object) ne.field_g)) {
                    stackOut_21_0 = var9.field_n;
                    stackIn_22_0 = stackOut_21_0;
                    break L7;
                  } else {
                    stackOut_20_0 = null;
                    stackIn_22_0 = (int[]) (Object) stackOut_20_0;
                    break L7;
                  }
                }
                qe.field_G = stackIn_22_0;
                break L6;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L8: {
                var6 = (Exception) (Object) decompiledCaughtException;
                int discarded$13 = 1;
                hi.a((Throwable) (Object) var6, "CC1");
                qe.field_G = null;
                ek.field_a = null;
                break L8;
              }
            }
            break L5;
          }
        }
        var5 = 1;
        return new hf(param1);
    }

    final static String a(byte[] param0, int param1, int param2) {
        char[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        char[] var10 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_6_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var9 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            var10 = new char[param2];
            var4 = var10;
            var5 = 0;
            var6 = 0;
            L1: while (true) {
              if (var6 >= param2) {
                stackOut_6_0 = new String(var10, 0, var5);
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                L2: {
                  var7 = param0[var6 + param1] & 255;
                  if (var7 == 0) {
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var6++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var4_ref;
            stackOut_8_1 = new StringBuilder().append("vd.D(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
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
          throw fc.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param1 + ',' + param2 + ',' + 160 + ')');
        }
        return stackIn_7_0;
    }

    public static void a() {
        field_e = null;
        field_d = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new ie[10];
    }
}
