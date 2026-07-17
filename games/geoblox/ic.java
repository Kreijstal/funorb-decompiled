/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ic {
    static String field_b;
    static String field_a;

    final static int a(int param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_6_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        var4 = Geoblox.field_C;
        try {
          L0: {
            L1: {
              if (param1 <= param0) {
                break L1;
              } else {
                var3_int = param0;
                param0 = param1;
                param1 = var3_int;
                break L1;
              }
            }
            L2: while (true) {
              if (param1 == 0) {
                stackOut_5_0 = param0;
                stackIn_6_0 = stackOut_5_0;
                break L0;
              } else {
                var3_int = param0 % param1;
                param0 = param1;
                param1 = var3_int;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var3, "ic.B(" + param0 + 44 + param1 + 44 + -126 + 41);
        }
        return stackIn_6_0;
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
    }

    final static void a(int param0, long param1, int param2, int param3, boolean param4, boolean param5, int param6, int param7, int param8, String param9, int param10, d param11, int param12, int param13) {
        try {
            IOException var15 = null;
            RuntimeException var15_ref = null;
            int stackIn_3_0 = 0;
            int stackIn_6_0 = 0;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            String stackIn_15_2 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            String stackIn_18_2 = null;
            Throwable decompiledCaughtException = null;
            int stackOut_2_0 = 0;
            int stackOut_1_0 = 0;
            int stackOut_5_0 = 0;
            int stackOut_4_0 = 0;
            RuntimeException stackOut_12_0 = null;
            StringBuilder stackOut_12_1 = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            String stackOut_14_2 = null;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            String stackOut_13_2 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            String stackOut_17_2 = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            String stackOut_16_2 = null;
            try {
              L0: {
                eh.field_d = new pk(5000);
                fj.field_q = new pk(5000);
                ja.field_D = param11;
                ok.field_f = param3;
                lb.field_c = param1;
                sd.field_x = param13;
                ac.field_s = param7;
                f.field_ib = param0;
                if (!param4) {
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
                rb.field_c = stackIn_3_0 != 0;
                mk.field_l = param10;
                ol.field_I = param9;
                if (!param5) {
                  stackOut_5_0 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L1;
                }
              }
              ll.field_e = stackIn_6_0 != 0;
              qe.field_b = param6;
              if (ja.field_D.field_n != null) {
                {
                  L2: {
                    af.field_b = new sk(ja.field_D.field_n, 64, 0);
                    break L2;
                  }
                }
                return;
              } else {
                return;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var15_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_12_0 = (RuntimeException) var15_ref;
                stackOut_12_1 = new StringBuilder().append("ic.A(").append(param0).append(44).append(param1).append(44).append(5000).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44).append(param6).append(44).append(param7).append(44).append(5000).append(44);
                stackIn_14_0 = stackOut_12_0;
                stackIn_14_1 = stackOut_12_1;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                if (param9 == null) {
                  stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
                  stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
                  stackOut_14_2 = "null";
                  stackIn_15_0 = stackOut_14_0;
                  stackIn_15_1 = stackOut_14_1;
                  stackIn_15_2 = stackOut_14_2;
                  break L3;
                } else {
                  stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
                  stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
                  stackOut_13_2 = "{...}";
                  stackIn_15_0 = stackOut_13_0;
                  stackIn_15_1 = stackOut_13_1;
                  stackIn_15_2 = stackOut_13_2;
                  break L3;
                }
              }
              L4: {
                stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
                stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(44).append(param10).append(44);
                stackIn_17_0 = stackOut_15_0;
                stackIn_17_1 = stackOut_15_1;
                stackIn_16_0 = stackOut_15_0;
                stackIn_16_1 = stackOut_15_1;
                if (param11 == null) {
                  stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
                  stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
                  stackOut_17_2 = "null";
                  stackIn_18_0 = stackOut_17_0;
                  stackIn_18_1 = stackOut_17_1;
                  stackIn_18_2 = stackOut_17_2;
                  break L4;
                } else {
                  stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                  stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
                  stackOut_16_2 = "{...}";
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_18_1 = stackOut_16_1;
                  stackIn_18_2 = stackOut_16_2;
                  break L4;
                }
              }
              throw t.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + 64 + 44 + param13 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a() {
        try {
            Exception var1 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            L0: {
              if (null == af.field_b) {
                break L0;
              } else {
                try {
                  L1: {
                    af.field_b.a(22, 0L);
                    af.field_b.a(24, eh.field_d.field_f, eh.field_d.field_j, false);
                    decompiledRegionSelector0 = 0;
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L2: {
                    var1 = (Exception) (Object) decompiledCaughtException;
                    decompiledRegionSelector0 = 1;
                    break L2;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  eh.field_d.field_f = eh.field_d.field_f + 24;
                  return;
                } else {
                  break L0;
                }
              }
            }
            eh.field_d.field_f = eh.field_d.field_f + 24;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Create your own free Jagex account";
        field_a = "Bonus: <%0>";
    }
}
