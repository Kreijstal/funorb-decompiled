/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class i extends pn implements hh {
    static jp field_W;
    static String field_U;
    static vn field_T;
    static float field_V;
    static boolean[] field_X;
    private an field_Z;
    static boolean field_Y;

    private final void b(boolean param0) {
        if (!this.field_H) {
          return;
        }
        if (!param0) {
          field_T = (vn) null;
          this.field_H = false;
          return;
        }
        this.field_H = false;
    }

    final static void a(bo param0, byte param1, int param2) {
        try {
          mp.field_g.a(0, param0);
          ag.a(param2, true, param0);
          if (param1 != 7) {
            field_V = -1.3851797580718994f;
          }
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "i.J(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final an a(byte param0, sk param1, String param2) {
        an var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        an stackIn_2_0 = null;
        an stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new an(param2, param1);
          var4.field_h = (io) ((Object) new vm());
          if (param0 != 53) {
            stackIn_2_0 = (an) null;
            return stackIn_2_0;
          }
          var5 = -6 + this.field_n;
          this.field_n = this.field_n + 38;
          var4.a(param0 ^ -109, var5, 15, this.field_i - 14 - 16, 30);
          this.a(var4, 10);
          this.a(true);
          stackIn_4_0 = var4;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_7_0 = var4_ref;
          stackIn_7_1 = new StringBuilder().append("i.FA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public final void a(int param0, int param1, an param2, int param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_Z == param2) {
            this.b(true);
          }
          if (param1 == -6) {
            return;
          }
          field_X = (boolean[]) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_8_0 = var6;
          stackIn_8_1 = new StringBuilder().append("i.K(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    i(dn param0, sm param1) {
        super(param0, 200, 150);
        Object var3 = null;
        ga var4 = null;
        Object stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = null;
          if (param1 != kb.field_f) {
            if (gf.field_b != param1) {
              if (rc.field_h == param1) {
                var3 = hc.field_c;
                this.field_n = this.field_n + 30;
              }
            } else {
              var3 = d.field_a;
              this.field_n = this.field_n + 10;
              if (lm.f((byte) 126)) {
                this.field_n = this.field_n + 20;
                var3 = il.field_a;
              }
            }
          } else {
            var3 = lo.field_n;
          }
          var4 = new ga((String) (var3), (sk) null);
          var4.field_k = 0;
          var4.field_i = this.field_i;
          var4.field_n = 80;
          var4.field_j = 50;
          var4.field_h = (io) ((Object) new vf(ii.field_a, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true));
          this.a(var4, 10);
          this.field_Z = this.a((byte) 53, (sk) (this), re.field_c);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("i.<init>(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw sh.a((Throwable) (stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static boolean a(boolean param0, boolean param1) {
        try {
          long dupTemp$1 = 0L;
          IOException var2 = null;
          am var4 = null;
          am var5 = null;
          int stackIn_12_0 = 0;
          Throwable decompiledCaughtException = null;
          if (ao.field_F == null) {
            ao.field_F = jm.field_B.a(2, tm.field_o, ci.field_c);
          }
          if (ao.field_F.field_f == 0) {
            return false;
          }
          dupTemp$1 = pd.a(-22826);
          hm.field_N = dupTemp$1;
          pi.field_i = dupTemp$1;
          if (!param1) {
            field_X = (boolean[]) null;
          }
          if (1 != ao.field_F.field_f) {
            ic.field_T = jc.field_l;
          } else {
            try {
              sn.field_c = new gm((java.net.Socket) (ao.field_F.field_d), jm.field_B);
              var4 = fj.field_g;
              var5 = var4;
              dp.field_e.field_j = 0;
              stackIn_12_0 = (!param0) ? -1 : -2;
              em.field_U = stackIn_12_0;
              wb.field_t = stackIn_12_0;
              e.field_P = stackIn_12_0;
              ic.field_T = ui.field_g;
              var5.field_j = 0;
              uj.a(le.field_g, ba.field_b, (byte) -114, dp.field_e, kg.field_k);
              vl.a((byte) -46, -1);
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = (IOException) (Object) decompiledCaughtException;
              ic.field_T = jc.field_l;
              ao.field_F = null;
              return true;
            }
          }
          ao.field_F = null;
          return true;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void m(int param0) {
        if (param0 == 10) {
          field_X = null;
          field_W = null;
          field_U = null;
          field_T = null;
          return;
        }
        i.m(34);
        field_X = null;
        field_W = null;
        field_U = null;
        field_T = null;
    }

    final static void a(int param0, boolean param1, byte param2, wj param3) {
        Object var4 = null;
        Throwable var5 = null;
        Object stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          if (null != nc.field_p) {
            pj.a(param3, (byte) 113, param0, 1048576, param1);
          }
          if (param2 > -110) {
            i.m(11);
          }
          if (uh.field_o == null) {
            return;
          }
          var4 = sh.field_d;
          synchronized (var4) {
            uh.field_o.a(param0, true, -1);
            if (te.field_kb == param3) {
              return;
            }
            uh.field_o.c(28013);
            sh.field_d.d();
            te.field_kb = param3;
            if (te.field_kb != null) {
              uh.field_o.a((byte) -22, te.field_kb, param1);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_19_0 = var4;
          stackIn_19_1 = new StringBuilder().append("i.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw sh.a((Throwable) (stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    static {
        field_T = null;
        field_X = new boolean[64];
        field_W = new jp(1);
        field_Y = true;
    }
}
