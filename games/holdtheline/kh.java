/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class kh extends gd {
    private String field_k;
    private boolean field_j;
    static String field_i;
    static hj field_l;
    private qf field_m;

    final static void b(boolean param0) {
        if (bk.field_w == 10) {
          ka.a(-1);
          bk.field_w = 11;
        } else {
          if (!ai.a(-91)) {
            ka.a(-1);
            bk.field_w = 11;
          }
        }
        if (param0) {
          field_l = (hj) null;
        }
        de.field_K = true;
    }

    kh(nk param0, nk param1) {
        super(param0);
        this.field_k = "";
        this.field_j = false;
        try {
          this.field_m = new qf(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "kh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static gn a(int param0, boolean param1, boolean param2, boolean param3, int param4, int param5) {
        try {
          Object var6 = null;
          Object var7 = null;
          rb var8 = null;
          gn stackIn_4_0 = null;
          gn stackIn_16_0 = null;
          Throwable decompiledCaughtException = null;
          try {
            var6 = null;
            if (null != kl.field_v.field_u) {
              td.field_g = new ud(kl.field_v.field_u, 5200, 0);
              kl.field_v.field_u = null;
              var6 = new sk(255, td.field_g, new ud(kl.field_v.field_h, 12000, 0), 2097152);
            }
            var7 = null;
            if (param4 != 10600) {
              stackIn_4_0 = (gn) null;
              return stackIn_4_0;
            }
            if (null != td.field_g) {
              if (vb.field_a == null) {
                vb.field_a = new ud[kl.field_v.field_g.length];
              }
              if (vb.field_a[param0] == null) {
                vb.field_a[param0] = new ud(kl.field_v.field_g[param0], 12000, 0);
                kl.field_v.field_g[param0] = null;
              }
              var7 = new sk(param0, td.field_g, vb.field_a[param0], 2097152);
            }
            var8 = ra.field_Z.a(param0, param3, 113, (sk) (var6), (sk) (var7));
            if (param1) {
              var8.b((byte) -45);
            }
            stackIn_16_0 = new gn(var8, param2, param5);
            return stackIn_16_0;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (IOException) (Object) decompiledCaughtException;
            throw new RuntimeException(((IOException) (var6)).toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void g(int param0) {
        field_l = null;
        if (param0 != 0) {
          kh.b(true);
          field_i = null;
          return;
        }
        field_i = null;
    }

    final String a(String param0, boolean param1) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        String stackIn_8_0 = null;
        String stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_m.a(param0, (byte) 84) == g.field_k) {
            stackIn_3_0 = this.field_m.a(param0, param1);
            return stackIn_3_0;
          }
          if (!param1) {
            field_i = (String) null;
          }
          if (this.a(param0, (byte) 54) != g.field_k) {
            stackIn_10_0 = pk.field_J;
            return stackIn_10_0;
          }
          stackIn_8_0 = gl.field_c;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("kh.L(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(boolean param0) {
        try {
          Throwable decompiledCaughtException = null;
          java.lang.reflect.Method var1 = null;
          Exception var1_ref = null;
          Runtime var2 = null;
          Throwable var2_ref = null;
          Long var3 = null;
          Object[] var4 = null;
          try {
            if (param0) {
              return;
            }
            var1 = Runtime.class.getMethod("maxMemory", new Class[]{});
            if (var1 != null) {
              try {
                var2 = Runtime.getRuntime();
                var4 = (Object[]) null;
                var3 = (Long) (var1.invoke((Object) (var2), (Object[]) null));
                d.field_g = 1 + (int)(var3.longValue() / 1048576L);
                return;
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2_ref = decompiledCaughtException;
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var1_ref = (Exception) (Object) decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final fd a(String param0, byte param1) {
        lc var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        fd stackIn_2_0 = null;
        fd stackIn_9_0 = null;
        fd stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_m.a(param0, (byte) 65) == g.field_k) {
            stackIn_2_0 = g.field_k;
            return stackIn_2_0;
          }
          if (param1 <= 52) {
            var4 = (String) null;
            this.a((String) null, (byte) -84);
          }
          if (!param0.equals(this.field_k)) {
            var3 = we.a((byte) -85, param0);
            if (!var3.a(250)) {
              stackIn_9_0 = um.field_a;
              return stackIn_9_0;
            }
            this.field_k = param0;
            this.field_j = var3.a((byte) -34);
          }
          if (!this.field_j) {
            stackIn_14_0 = g.field_k;
          } else {
            stackIn_14_0 = tg.field_d;
          }
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("kh.N(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
    }
}
