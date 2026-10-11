/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class tm implements mh {
    static String field_b;
    static int field_d;
    static jr field_a;
    static int[] field_c;

    public final void a(pk param0, int param1, int param2, boolean param3, int param4) {
        try {
          if (param2 != 5592405) {
            field_a = (jr) null;
          }
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "tm.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(boolean param0, byte param1, wi param2, int param3, int param4, int param5, int param6, int param7, int param8, String param9, boolean param10, int param11, int param12, long param13) {
        try {
          RuntimeException stackIn_16_0 = null;
          StringBuilder stackIn_16_1 = null;
          String stackIn_17_2 = null;
          StringBuilder stackIn_19_1 = null;
          String stackIn_20_2 = null;
          Throwable decompiledCaughtException = null;
          IOException var15 = null;
          RuntimeException var15_ref = null;
          try {
            ig.field_a = new pl(param3);
            as.field_v = new pl(param8);
            ql.field_v = param5;
            vp.field_a = param7;
            jm.field_b = param13;
            mc.field_C = param9;
            jt.field_t = param2;
            qn.field_a = param10;
            if (param1 != 84) {
              return;
            }
            s.field_o = param12;
            rh.field_p = param6;
            gn.field_d = param0;
            nb.field_b = param4;
            jt.field_r = param11;
            if (null == jt.field_t.field_n) {
              return;
            }
            try {
              pe.field_E = new gj(jt.field_t.field_n, 64, 0);
              return;
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var15 = (IOException) (Object) decompiledCaughtException;
              throw new RuntimeException(var15.toString());
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var15_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_16_0 = var15_ref;
            stackIn_16_1 = new StringBuilder().append("tm.D(").append(param0).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_17_2 = "null";
            } else {
              stackIn_17_2 = "{...}";
            }
            stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',');
            if (param9 == null) {
              stackIn_20_2 = "null";
            } else {
              stackIn_20_2 = "{...}";
            }
            throw qo.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(int param0, int param1) {
        int var3 = Sumoblitz.field_L ? 1 : 0;
        dt.field_p = null;
        tj.field_n = null;
        cd.field_d = 0;
        int var2 = ie.field_x;
        ie.field_x = rl.field_q;
        rl.field_q = var2;
        if (param0 == 51) {
          jk.field_b.field_j = 2;
          jk.field_b.field_d = jk.field_b.field_d + 1;
          if (jk.field_b.field_d < 2) {
            if (jk.field_b.field_d >= 2) {
              if (50 == param0) {
                return 5;
              }
              if (jk.field_b.field_d >= 4) {
                return 1;
              }
              if (param1 < -80) {
                return -1;
              }
              return 65;
            }
            if (jk.field_b.field_d >= 4) {
              return 1;
            }
            if (param1 >= -80) {
              return 65;
            }
            return -1;
          }
          if (param0 != 51) {
            if (jk.field_b.field_d >= 2) {
              if (50 != param0) {
                if (jk.field_b.field_d >= 4) {
                  return 1;
                }
                if (param1 >= -80) {
                  return 65;
                }
                return -1;
              }
              return 5;
            }
            if (jk.field_b.field_d >= 4) {
              return 1;
            }
            if (param1 >= -80) {
              return 65;
            }
            return -1;
          }
          return 2;
        }
        if (param0 != 50) {
          jk.field_b.field_j = 1;
          jk.field_b.field_d = jk.field_b.field_d + 1;
          if (jk.field_b.field_d >= 2 &&
            param0 == 51) {
            return 2;
          }
          if (jk.field_b.field_d >= 2) {
            if (50 != param0) {
              if (jk.field_b.field_d >= 4) {
                return 1;
              }
              if (param1 >= -80) {
                return 65;
              }
              return -1;
            }
            return 5;
          }
          if (jk.field_b.field_d >= 4) {
            return 1;
          }
          if (param1 >= -80) {
            return 65;
          }
          return -1;
        }
        jk.field_b.field_j = 5;
        jk.field_b.field_d = jk.field_b.field_d + 1;
        if (jk.field_b.field_d >= 2 &&
          param0 == 51) {
          return 2;
        }
        if (jk.field_b.field_d >= 2) {
          if (50 != param0) {
            if (jk.field_b.field_d >= 4) {
              return 1;
            }
            if (param1 >= -80) {
              return 65;
            }
            return -1;
          }
          return 5;
        }
        if (jk.field_b.field_d >= 4) {
          return 1;
        }
        if (param1 >= -80) {
          return 65;
        }
        return -1;
    }

    public static void a(boolean param0) {
        field_a = null;
        field_b = null;
        if (param0) {
          return;
        }
        field_c = null;
    }

    static {
        field_b = "Just play";
        field_d = -1;
    }
}
