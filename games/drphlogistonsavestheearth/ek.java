/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ek extends gi {
    int field_j;
    int field_k;
    static int field_h;
    static String field_q;
    static he[] field_l;
    static he[] field_t;
    int field_o;
    static he field_m;
    int field_r;
    static int field_n;
    int field_u;
    int field_s;
    static String field_p;
    int[] field_i;

    final static void a(int param0, boolean param1, int param2) {
        if (param0 > -40) {
          return;
        }
        ue.field_b = 0;
        r.field_d = param2;
        if (r.field_d >= 0) {
          th.field_a[r.field_d].a(param1, (byte) 89);
        }
        if (0 == r.field_d) {
          sc.a(-1, true, ad.field_q);
        } else {
          if (r.field_d == -2) {
            sc.a(-1, true, ad.field_q);
          }
        }
        if (r.field_d != 11) {
          return;
        }
        qk.field_c = false;
    }

    final static boolean a(boolean param0, boolean param1) {
        try {
          long dupTemp$0 = 0L;
          int stackIn_10_0 = 0;
          Throwable decompiledCaughtException = null;
          IOException var2 = null;
          lh var4 = null;
          lh var5 = null;
          if (null == de.field_q) {
            de.field_q = pi.field_I.a(ml.field_n, ei.field_o, 105);
          }
          if (de.field_q.field_b == 0) {
            return false;
          }
          dupTemp$0 = la.a(false);
          ck.field_e = dupTemp$0;
          el.field_rb = dupTemp$0;
          if (de.field_q.field_b != 1) {
            tl.field_O = sg.field_b;
          } else {
            try {
              uj.field_j = new qe((java.net.Socket) (de.field_q.field_g), pi.field_I);
              var4 = dh.field_N;
              var5 = var4;
              nj.field_p.field_j = 0;
              stackIn_10_0 = (!param1) ? -1 : -2;
              l.field_q = stackIn_10_0;
              gg.field_l = stackIn_10_0;
              field_h = stackIn_10_0;
              var5.field_j = 0;
              tl.field_O = hh.field_b;
              q.a(ci.field_W, lb.field_v, 26800, dc.field_e, nj.field_p);
              qj.a(-1, 14656);
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = (IOException) (Object) decompiledCaughtException;
              tl.field_O = sg.field_b;
              if (!param0) {
                return false;
              }
              de.field_q = null;
              return true;
            }
          }
          if (!param0) {
            return false;
          }
          de.field_q = null;
          return true;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, int[] param1, int param2, int param3, byte param4, int param5, int param6, int param7) {
        try {
          this.field_k = param7;
          this.field_j = param6;
          this.field_s = param0;
          this.field_i = param1;
          this.field_o = param2;
          this.field_r = param3;
          this.field_u = param5;
          if (param4 < 24) {
            ek.a(41, false, 105);
          }
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "ek.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final static void d(int param0) {
        if (null != el.field_sb) {
          el.field_sb.h();
          if (param0 == -2) {
            if (k.field_J != null) {
              k.field_J.h();
            }
            return;
          }
          return;
        }
        if (param0 == -2) {
          if (k.field_J != null) {
            k.field_J.h();
          }
          return;
        }
    }

    public static void e(int param0) {
        field_l = null;
        field_t = null;
        field_q = null;
        field_m = null;
        int var1 = -81 % ((param0 + 57) / 45);
        field_p = null;
    }

    ek() {
    }

    static {
        field_n = -1;
        field_h = -1;
        field_p = "to over <%0> great games";
        field_q = "World <%0>, Stage <%1>";
    }
}
