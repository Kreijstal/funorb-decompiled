/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ic {
    static String field_b;
    static String field_a;

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_8_0 = 0;
        RuntimeException decompiledCaughtException = null;
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
              if (-1 == (param1 ^ -1)) {
                L3: {
                  if (param2 <= -120) {
                    break L3;
                  } else {
                    ic.a(6);
                    break L3;
                  }
                }
                stackIn_8_0 = param0;
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
          throw t.a((Throwable) ((Object) var3), "ic.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_8_0;
    }

    public static void a(int param0) {
        if (param0 != 16424) {
            return;
        }
        field_b = null;
        field_a = null;
    }

    final static void a(int param0, long param1, int param2, int param3, boolean param4, boolean param5, int param6, int param7, int param8, String param9, int param10, d param11, int param12, int param13) {
        try {
            int stackIn_3_0 = 0;
            int stackIn_6_0 = 0;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            String stackIn_17_2 = null;
            StringBuilder stackIn_19_1 = null;
            StringBuilder stackIn_20_1 = null;
            String stackIn_20_2 = null;
            Throwable decompiledCaughtException = null;
            IOException var15 = null;
            RuntimeException var15_ref = null;
            try {
              L0: {
                L1: {
                  eh.field_d = new pk(param8);
                  fj.field_q = new pk(param2);
                  ja.field_D = param11;
                  ok.field_f = param3;
                  lb.field_c = param1;
                  sd.field_x = param13;
                  ac.field_s = param7;
                  f.field_ib = param0;
                  if (!param4) {
                    stackIn_3_0 = 0;
                    break L1;
                  } else {
                    stackIn_3_0 = 1;
                    break L1;
                  }
                }
                L2: {
                  rb.field_c = stackIn_3_0 != 0;
                  mk.field_l = param10;
                  ol.field_I = param9;
                  if (!param5) {
                    stackIn_6_0 = 0;
                    break L2;
                  } else {
                    stackIn_6_0 = 1;
                    break L2;
                  }
                }
                L3: {
                  ll.field_e = stackIn_6_0 != 0;
                  qe.field_b = param6;
                  if (ja.field_D.field_n != null) {
                    try {
                      L4: {
                        af.field_b = new sk(ja.field_D.field_n, 64, 0);
                        break L4;
                      }
                    } catch (java.io.IOException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      var15 = (IOException) (Object) decompiledCaughtException;
                      throw new RuntimeException(var15.toString());
                    }
                    break L3;
                  } else {
                    break L3;
                  }
                }
                if (param12 == 64) {
                  break L0;
                } else {
                  field_b = (String) null;
                  return;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var15_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_16_0 = (RuntimeException) (var15_ref);

                stackIn_16_1 = new StringBuilder().append("ic.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',');

                if (param9 == null) {
                  stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
                  stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
                  stackIn_17_2 = "null";
                  break L5;
                } else {
                  stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
                  stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
                  stackIn_17_2 = "{...}";
                  break L5;
                }
              }
              L6: {


                stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param10).append(',');

                if (param11 == null) {
                  stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
                  stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
                  stackIn_20_2 = "null";
                  break L6;
                } else {
                  stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
                  stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
                  stackIn_20_2 = "{...}";
                  break L6;
                }
              }
              throw t.a((Throwable) ((Object) stackIn_17_0), stackIn_20_2 + ',' + param12 + ',' + param13 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(byte param0) {
        try {
            Exception var1 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            L0: {
              if (param0 == 65) {
                break L0;
              } else {
                field_a = (String) null;
                break L0;
              }
            }
            L1: {
              if (null == af.field_b) {
                break L1;
              } else {
                try {
                  L2: {
                    af.field_b.a(22, 0L);
                    af.field_b.a(24, eh.field_d.field_f, eh.field_d.field_j, false);
                    decompiledRegionSelector0 = 0;
                    break L2;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var1 = (Exception) (Object) decompiledCaughtException;
                    decompiledRegionSelector0 = 1;
                    break L3;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  eh.field_d.field_f = eh.field_d.field_f + 24;
                  return;
                } else {
                  break L1;
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
        field_b = "Create your own free Jagex account";
        field_a = "Bonus: <%0>";
    }
}
