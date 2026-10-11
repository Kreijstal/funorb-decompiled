/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class jd extends jh {
    static t field_D;
    static o field_F;
    static boolean field_E;

    final static void a(byte param0, int param1) {
        try {
          IOException iOException = null;
          Throwable decompiledCaughtException = null;
          if (null != vk.field_E && (param1 < 0 ||
            w.field_cb == ef.field_a)) {
            if (wa.field_d.field_n == 0 &&
              km.b(-1) > 10000L + ak.field_k) {
              wa.field_d.f(-44, param1);
            }
            if (param0 > -48) {
              field_D = (t) null;
            }
            if (wa.field_d.field_n > 0) {
              try {
                vk.field_E.a(0, wa.field_d.field_j, (byte) 47, wa.field_d.field_n);
                ak.field_k = km.b(-1);
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                iOException = (IOException) (Object) decompiledCaughtException;
                ih.b(true);
              }
              wa.field_d.field_n = 0;
            }
            return;
          }
          wa.field_d.field_n = 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean g(byte param0) {
        pm var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        pm var5 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Torquing.field_u;
        try {
          var5 = (pm) (ul.field_e.b(0));
          var1 = var5;
          if (var1 == null) {
            return false;
          }
          var2 = 0;
          var3 = 60 / ((param0 + 84) / 40);
          while (var1.field_l > var2) {
            if (null != var5.field_u[var2] &&
              var5.field_u[var2].field_a == 0) {
              return false;
            }
            if (null != var5.field_n[var2] &&
              0 == var5.field_n[var2].field_a) {
              return false;
            }
            var2++;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var1_ref), "jd.M(" + param0 + ')');
        }
    }

    final static int a(int param0) {
        if (param0 != 0) {
          return -110;
        }
        if (wa.field_f) {
          return -1;
        }
        if (dg.field_h > q.field_d) {
          return -1;
        }
        if (q.field_d >= dg.field_h + cf.field_e) {
          return -1;
        }
        return il.field_l;
    }

    public static void h(int param0) {
        field_D = null;
        if (param0 > -26) {
          field_E = false;
          field_F = null;
          return;
        }
        field_F = null;
    }

    private jd(int param0, int param1, int param2, int param3, el param4, ca param5, gm param6) {
        super(param0, param1, param2, param3, param4, param5);
        try {
          this.field_C = param6;
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "jd.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(boolean param0, int param1) {
        q var2 = null;
        int var3 = 0;
        ni var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = Torquing.field_u;
        try {
          var4 = (ni) (vb.field_f.b(0));
          if (!param0) {
            jd.g((byte) -33);
          }
          while (var4 != null) {
            l.a(var4, param1, 1);
            var4 = (ni) (vb.field_f.f(-24059));
          }
          var2 = qf.field_a.b(0);
          while (var2 != null) {
            lc.b(0, param1);
            var2 = qf.field_a.f(-24059);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var2_ref), "jd.L(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1, int param2, byte param3, gm param4, int param5) {
        RuntimeException var7 = null;
        aj var8 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          super.a(param0, param1, param2, (byte) 124, param4, param5);
          var8 = lp.field_d;
          if (var8 != null &&
            this.a(param5, param2, param1, param0, 121)) {
            if (!(this.field_t instanceof dm)) {
              if (var8.field_t instanceof dm) {
                ((dm) (var8.field_t)).a(3139, var8, this);
                lp.field_d = null;
              }
            } else {
              ((dm) (this.field_t)).a(3139, var8, this);
              lp.field_d = null;
            }
          }
          if (param3 > 109) {
            return;
          }
          field_F = (o) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_13_0 = var7;
          stackIn_13_1 = new StringBuilder().append("jd.N(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param5).append(')').toString());
        }
    }

    static {
        field_E = false;
    }
}
