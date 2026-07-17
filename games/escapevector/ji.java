/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ji {
    static cn field_c;
    static String field_a;
    static ca field_b;

    final static mf a(boolean param0, int param1, boolean param2, int param3, boolean param4, byte param5) {
        try {
            Object var6 = null;
            Object var7 = null;
            hk var8 = null;
            mf stackIn_15_0 = null;
            Throwable decompiledCaughtException = null;
            mf stackOut_14_0 = null;
            try {
              L0: {
                L1: {
                  var6 = null;
                  if (null != ga.field_d.field_b) {
                    uc.field_h = new rg(ga.field_d.field_b, 5200, 0);
                    ga.field_d.field_b = null;
                    var6 = (Object) (Object) new jg(255, uc.field_h, new rg(ga.field_d.field_x, 12000, 0), 2097152);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  var7 = null;
                  if (uc.field_h != null) {
                    L3: {
                      if (bg.field_e != null) {
                        break L3;
                      } else {
                        bg.field_e = new rg[ga.field_d.field_u.length];
                        break L3;
                      }
                    }
                    L4: {
                      if (bg.field_e[param1] == null) {
                        bg.field_e[param1] = new rg(ga.field_d.field_u[param1], 12000, 0);
                        ga.field_d.field_u[param1] = null;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    var7 = (Object) (Object) new jg(param1, uc.field_h, bg.field_e[param1], 2097152);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L5: {
                  var8 = af.field_e.a(param2, 255, (jg) var6, param1, (jg) var7);
                  if (param0) {
                    var8.b((byte) -49);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                stackOut_14_0 = new mf((ob) (Object) var8, param4, param3);
                stackIn_15_0 = stackOut_14_0;
                break L0;
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (Object) (Object) decompiledCaughtException;
              throw new RuntimeException(((IOException) var6).toString());
            }
            return stackIn_15_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_b = null;
        field_a = null;
    }

    final static void a(boolean param0) {
        if (!(bk.field_r == null)) {
            bk.field_r.a((byte) 33);
        }
    }

    final static void a(boolean param0, int param1) {
        if (null == bk.field_r) {
          if (!param0) {
            field_a = null;
            return;
          } else {
            return;
          }
        } else {
          bk.field_r.b(-1, param1);
          if (param0) {
            return;
          } else {
            field_a = null;
            return;
          }
        }
    }

    final static int a(int param0, ih param1, String[] param2, int param3, int param4, int param5, int param6) {
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var11 = EscapeVector.field_A;
        try {
          L0: {
            var7_int = param3 + param5;
            var8 = 0;
            L1: while (true) {
              if (param4 <= var8) {
                stackOut_4_0 = var7_int;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                var9 = param2[var8];
                var10 = ic.a(var9, 16777215, param1);
                var7_int = var7_int + (var10 - -param0);
                var8++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var7;
            stackOut_6_1 = new StringBuilder().append("ji.F(").append(param0).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw t.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + 0 + 41);
        }
        return stackIn_5_0;
    }

    final static int a(int param0, int param1, byte[] param2) {
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
            if (param0 == 255) {
              stackOut_3_0 = ae.a(param2, (byte) -95, param1, 0);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 72;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("ji.B(").append(param0).append(44).append(param1).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
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
          throw t.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
        return stackIn_4_0;
    }

    static {
    }
}
