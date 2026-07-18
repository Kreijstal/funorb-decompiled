/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ju extends ua implements cr {
    static hr[] field_p;
    private io field_o;

    public final void b(int param0) {
        if (param0 != 12001) {
            boolean discarded$0 = ((ju) this).a(-31);
            super.b(param0);
            return;
        }
        super.b(param0);
    }

    public final boolean a(int param0) {
        if (param0 != -28833) {
          field_p = null;
          return super.a(((ju) this).field_f.field_Qc, (byte) 92);
        } else {
          return super.a(((ju) this).field_f.field_Qc, (byte) 92);
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
            return;
        }
        field_p = null;
    }

    final static void g(int param0) {
        wt.field_h[1] = iv.field_i;
        wt.field_h[0] = ki.field_f;
        wt.field_h[2] = hc.field_f;
        pl.field_u = wt.field_h[1] + wt.field_h[0] - 2 + (wt.field_h[2] + -1);
    }

    final static boolean b(int param0, int param1) {
        try {
            int var2_int = 0;
            IOException var2 = null;
            int stackIn_13_0 = 0;
            int stackIn_15_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_12_0 = 0;
            int stackOut_14_0 = 0;
            if (ig.field_a.field_p < param1) {
              if (null == qk.field_O) {
                return false;
              } else {
                try {
                  L0: {
                    var2_int = qk.field_O.c(-37);
                    if (0 < var2_int) {
                      L1: {
                        if (-ig.field_a.field_p + param1 < var2_int) {
                          var2_int = -ig.field_a.field_p + param1;
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                      qk.field_O.a(-100, ig.field_a.field_p, var2_int, ig.field_a.field_n);
                      jt.field_x = wq.a(-47);
                      ig.field_a.field_p = ig.field_a.field_p + var2_int;
                      if (ig.field_a.field_p < param1) {
                        stackOut_12_0 = 0;
                        stackIn_13_0 = stackOut_12_0;
                        return stackIn_13_0 != 0;
                      } else {
                        ig.field_a.field_p = 0;
                        stackOut_14_0 = 1;
                        stackIn_15_0 = stackOut_14_0;
                        return stackIn_15_0 != 0;
                      }
                    } else {
                      if (var2_int < 0) {
                        kk.a((byte) -118);
                        return false;
                      } else {
                        if (uc.b(26560) <= 30000L) {
                          break L0;
                        } else {
                          kk.a((byte) -118);
                          return false;
                        }
                      }
                    }
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2 = (IOException) (Object) decompiledCaughtException;
                  kk.a((byte) -127);
                  return false;
                }
                return false;
              }
            } else {
              return true;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void a(byte param0, int param1) {
        if (param0 >= -67) {
          boolean discarded$2 = ((ju) this).a(61);
          super.a((byte) -87, ((ju) this).field_o.field_j * param1);
          return;
        } else {
          super.a((byte) -87, ((ju) this).field_o.field_j * param1);
          return;
        }
    }

    ju(on param0, io param1, boolean param2) {
        super(param0, 34963, param2);
        try {
            ((ju) this).field_o = param1;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "ju.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public final jaclib.memory.Buffer a(boolean param0, int param1) {
        if (param1 != 10081) {
          field_p = null;
          return super.a(param0, param1 ^ 10083, ((ju) this).field_f.field_Qc);
        } else {
          return super.a(param0, param1 ^ 10083, ((ju) this).field_f.field_Qc);
        }
    }

    static {
    }
}
