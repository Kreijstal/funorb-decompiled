/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ju extends ua implements cr {
    static hr[] field_p;
    private io field_o;

    public final void b(int param0) {
        if (param0 == 12001) {
          super.b(param0 + 0);
          return;
        }
        this.a(-31);
        super.b(param0 + 0);
    }

    public final boolean a(int param0) {
        if (param0 == -28833) {
          return super.a(this.field_f.field_Qc, (byte) 92);
        }
        field_p = (hr[]) null;
        return super.a(this.field_f.field_Qc, (byte) 92);
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
        pl.field_u = wt.field_h[1] + wt.field_h[0] - 2 + (wt.field_h[2] - 1);
        if (param0 < 100) {
          ju.b(46, -94);
        }
    }

    final static boolean b(int param0, int param1) {
        try {
          int var2_int = 0;
          IOException var2 = null;
          Throwable decompiledCaughtException = null;
          if (ig.field_a.field_p >= param1) {
            return true;
          }
          if (null == qk.field_O) {
            return false;
          }
          try {
            var2_int = qk.field_O.c(param0 ^ 36);
            if (0 >= var2_int) {
              if (~var2_int > param0) {
                kk.a((byte) -118);
                return false;
              }
              if (uc.b(26560) <= 30000L) {
                return false;
              }
              kk.a((byte) -118);
              return false;
            }
            if (-ig.field_a.field_p + param1 < var2_int) {
              var2_int = -ig.field_a.field_p + param1;
            }
            qk.field_O.a(param0 ^ 99, ig.field_a.field_p, var2_int, ig.field_a.field_n);
            jt.field_x = wq.a(-47);
            ig.field_a.field_p = ig.field_a.field_p + var2_int;
            if (ig.field_a.field_p < param1) {
              return false;
            }
            ig.field_a.field_p = 0;
            return true;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2 = (IOException) (Object) decompiledCaughtException;
            kk.a((byte) -127);
            return false;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void a(byte param0, int param1) {
        if (param0 < -67) {
          super.a((byte) -87, this.field_o.field_j * param1);
          return;
        }
        this.a(61);
        super.a((byte) -87, this.field_o.field_j * param1);
    }

    ju(on param0, io param1, boolean param2) {
        super(param0, 34963, param2);
        try {
          this.field_o = param1;
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "ju.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public final jaclib.memory.Buffer a(boolean param0, int param1) {
        if (param1 == 10081) {
          return super.a(param0, param1 ^ 10083, this.field_f.field_Qc);
        }
        field_p = (hr[]) null;
        return super.a(param0, param1 ^ 10083, this.field_f.field_Qc);
    }

    static {
    }
}
