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
            mf stackIn_17_0 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                L1: {
                  var6 = null;
                  if (null != ga.field_d.field_b) {
                    uc.field_h = new rg(ga.field_d.field_b, 5200, 0);
                    ga.field_d.field_b = null;
                    var6 = new jg(255, uc.field_h, new rg(ga.field_d.field_x, 12000, 0), 2097152);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (param5 == 114) {
                    break L2;
                  } else {
                    field_a = (String) null;
                    break L2;
                  }
                }
                L3: {
                  var7 = null;
                  if (uc.field_h != null) {
                    L4: {
                      if (bg.field_e != null) {
                        break L4;
                      } else {
                        bg.field_e = new rg[ga.field_d.field_u.length];
                        break L4;
                      }
                    }
                    L5: {
                      if (bg.field_e[param1] == null) {
                        bg.field_e[param1] = new rg(ga.field_d.field_u[param1], 12000, 0);
                        ga.field_d.field_u[param1] = null;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    var7 = new jg(param1, uc.field_h, bg.field_e[param1], 2097152);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L6: {
                  var8 = af.field_e.a(param2, 255, (jg) (var6), param1, (jg) (var7));
                  if (param0) {
                    var8.b((byte) -49);
                    break L6;
                  } else {
                    break L6;
                  }
                }
                stackIn_17_0 = new mf(var8, param4, param3);
                break L0;
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (IOException) (Object) decompiledCaughtException;
              throw new RuntimeException(((IOException) (var6)).toString());
            }
            return stackIn_17_0;
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
        if (param0 != 2097152) {
            field_a = (String) null;
        }
    }

    final static void a(boolean param0) {
        if (!param0) {
          L0: {
            field_a = (String) null;
            if (bk.field_r != null) {
              bk.field_r.a((byte) 33);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (bk.field_r != null) {
              bk.field_r.a((byte) 33);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final static void a(boolean param0, int param1) {
        if (null == bk.field_r) {
          if (!param0) {
            field_a = (String) null;
            return;
          } else {
            return;
          }
        } else {
          bk.field_r.b(-1, param1);
          if (param0) {
            return;
          } else {
            field_a = (String) null;
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
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var11 = EscapeVector.field_A;
        try {
          L0: {
            var7_int = param3 + param5;
            var8 = param6;
            L1: while (true) {
              if (param4 <= var8) {
                stackIn_5_0 = var7_int;
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
            stackIn_8_0 = (RuntimeException) (var7);

            stackIn_8_1 = new StringBuilder().append("ji.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_9_0), stackIn_12_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_5_0;
    }

    final static int a(int param0, int param1, byte[] param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 255) {
              stackIn_4_0 = ae.a(param2, (byte) -95, param1, 0);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 72;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("ji.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    static {
    }
}
