/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class k {
    private java.util.zip.Inflater field_a;
    static String field_d;
    static er field_c;
    static String field_b;

    final static void a(boolean param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        bs var3 = null;
        RuntimeException decompiledCaughtException = null;
        var2 = Vertigo2.field_L ? 1 : 0;
        try {
          sj.field_d = null;
          gd.field_j = null;
          qn.field_q = param0;
          if (mk.field_J != null) {
            mk.field_J.c(0);
            mk.field_J = null;
          }
          kd.field_l = null;
          if (null != nr.field_p) {
            nr.field_p.c(0);
            nr.field_p = null;
          }
          lh.field_b = null;
          if (null != kq.field_Rb) {
            kq.field_Rb.c(0);
            kq.field_Rb = null;
          }
          ck.field_I = null;
          if (null == kd.field_l) {
            return;
          }
          var3 = (bs) (kd.field_l.b(29));
          while (var3 != null) {
            var3.a(-123);
            var3 = (bs) (kd.field_l.a((byte) -60));
          }
          kd.field_l = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var1), "k.B(" + param0 + ')');
        }
    }

    public k() {
        this(-1, 1000000, 1000000);
    }

    public static void b(int param0) {
        field_d = null;
        if (param0 >= -4) {
          field_d = (String) null;
          field_c = null;
          field_b = null;
          return;
        }
        field_c = null;
        field_b = null;
    }

    final static ve[] a(int param0) {
        if (param0 != -15922) {
          return (ve[]) null;
        }
        return new ve[]{g.field_f, dk.field_o, gi.field_t, ti.field_b, f.field_H, kk.field_e, br.field_Y, bd.field_e, bj.field_g, tg.field_c, bp.field_y, kq.field_Lb, rp.field_f, nb.field_B};
    }

    final void a(ed param0, byte param1, byte[] param2) {
        try {
          RuntimeException stackIn_15_0 = null;
          StringBuilder stackIn_15_1 = null;
          String stackIn_16_2 = null;
          StringBuilder stackIn_18_1 = null;
          String stackIn_19_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var4 = null;
          RuntimeException var4_ref = null;
          try {
            if (param0.field_p[param0.field_u] == 31 &&
              param0.field_p[param0.field_u + 1] == -117) {
              if (this.field_a == null) {
                this.field_a = new java.util.zip.Inflater(true);
              }
              try {
                if (param1 != 88) {
                  return;
                }
                this.field_a.setInput(param0.field_p, 10 + param0.field_u, -8 + (-10 - param0.field_u + param0.field_p.length));
                this.field_a.inflate(param2);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4 = (Exception) (Object) decompiledCaughtException;
                this.field_a.reset();
                throw new RuntimeException("");
              }
              this.field_a.reset();
              return;
            }
            throw new RuntimeException("");
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_15_0 = var4_ref;
            stackIn_15_1 = new StringBuilder().append("k.A(");
            if (param0 == null) {
              stackIn_16_2 = "null";
            } else {
              stackIn_16_2 = "{...}";
            }
            stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_19_2 = "null";
            } else {
              stackIn_19_2 = "{...}";
            }
            throw wn.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private k(int param0, int param1, int param2) {
    }

    static {
        field_d = "<%0> has withdrawn the request to join.";
        field_b = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
    }
}
