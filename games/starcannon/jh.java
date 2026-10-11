/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class jh {
    static boolean field_d;
    static String field_f;
    static hh field_h;
    static hl field_a;
    static int[][] field_c;
    private uh field_i;
    static eh field_b;
    private uh field_g;
    static String field_e;

    public static void b(int param0) {
        field_e = null;
        field_b = null;
        field_f = null;
        if (param0 >= 9) {
          field_a = null;
          field_c = (int[][]) null;
          field_h = null;
          return;
        }
        jh.a(107, false);
        field_a = null;
        field_c = (int[][]) null;
        field_h = null;
    }

    final static void a(int param0, boolean param1) {
        pf.field_c = le.field_b[param0];
        lb.field_L = fa.field_A[param0];
        if (!param1) {
          return;
        }
        b.field_e = qa.field_d[param0];
    }

    final void a(int param0, uh param1) {
        try {
          if (param0 != 22197) {
            this.b((byte) 89);
          }
          if (null != param1.field_f) {
            param1.a(-6242);
          }
          param1.field_m = this.field_i;
          param1.field_f = this.field_i.field_f;
          param1.field_f.field_m = param1;
          param1.field_m.field_f = param1;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "jh.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(byte param0, boolean param1) {
        try {
          long dupTemp$1 = 0L;
          IOException var2 = null;
          ia var4 = null;
          ia var5 = null;
          int stackIn_11_0 = 0;
          Throwable decompiledCaughtException = null;
          if (null == ah.field_e) {
            ah.field_e = og.field_a.a(sj.field_I, -115, kl.field_a);
          }
          if (0 == ah.field_e.field_b) {
            return false;
          }
          if (param0 != -68) {
            field_e = (String) null;
          }
          dupTemp$1 = dd.b(71);
          ca.field_Y = dupTemp$1;
          ik.field_p = dupTemp$1;
          if (ah.field_e.field_b != 1) {
            r.field_c = rb.field_h;
          } else {
            try {
              m.field_b = new sb((java.net.Socket) (ah.field_e.field_f), og.field_a);
              d.field_b.field_g = 0;
              var4 = se.field_p;
              var5 = var4;
              stackIn_11_0 = (!param1) ? -1 : -2;
              wc.field_i = stackIn_11_0;
              hh.field_a = stackIn_11_0;
              bh.field_d = stackIn_11_0;
              var5.field_g = 0;
              r.field_c = ua.field_b;
              oe.a(r.field_d, 32, d.field_b, bf.field_s, jg.field_A);
              nf.a(-1, (byte) 95);
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = (IOException) (Object) decompiledCaughtException;
              r.field_c = rb.field_h;
              ah.field_e = null;
              return true;
            }
          }
          ah.field_e = null;
          return true;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int b(byte param0) {
        int var2 = 0;
        uh var3 = this.field_i.field_m;
        while (this.field_i != var3) {
          var3 = var3.field_m;
          var2++;
        }
        if (param0 >= 109) {
          return var2;
        }
        return -57;
    }

    final uh a(byte param0) {
        uh var2 = null;
        uh var2Lifetime1;
        if (param0 < 119) {
          field_c = (int[][]) null;
          var2 = this.field_i.field_m;
          if (this.field_i != var2) {
            this.field_g = var2.field_m;
            return var2;
          }
          this.field_g = null;
          return null;
        }
        var2Lifetime1 = this.field_i.field_m;
        if (this.field_i != var2Lifetime1) {
          this.field_g = var2Lifetime1.field_m;
          return var2Lifetime1;
        }
        this.field_g = null;
        return null;
    }

    final uh a(int param0) {
        uh var2 = null;
        uh var2Lifetime1;
        if (param0 >= -10) {
          this.b((byte) -41);
          var2 = this.field_g;
          if (this.field_i != var2) {
            this.field_g = var2.field_m;
            return var2;
          }
          this.field_g = null;
          return null;
        }
        var2Lifetime1 = this.field_g;
        if (this.field_i != var2Lifetime1) {
          this.field_g = var2Lifetime1.field_m;
          return var2Lifetime1;
        }
        this.field_g = null;
        return null;
    }

    final uh c(int param0) {
        uh var2 = this.field_i.field_m;
        if (param0 != 8) {
          this.c(-118);
          if (var2 != this.field_i) {
            var2.a(-6242);
            return var2;
          }
          return null;
        }
        if (var2 != this.field_i) {
          var2.a(-6242);
          return var2;
        }
        return null;
    }

    public jh() {
        this.field_i = new uh();
        this.field_i.field_f = this.field_i;
        this.field_i.field_m = this.field_i;
    }

    static {
        field_f = "(Including <%0>)";
        field_c = new int[8][];
        field_h = null;
        field_e = "You are not currently logged in to the<nbsp>game.";
    }
}
