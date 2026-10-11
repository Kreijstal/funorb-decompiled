/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class vh {
    private java.util.zip.Inflater field_a;
    static co field_c;
    static String field_b;

    final static void a(int param0) {
        int var3 = 0;
        String stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        boolean stackIn_13_2 = false;
        sb stackIn_18_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        sb var9 = null;
        int var10 = 0;
        var10 = Pixelate.field_H ? 1 : 0;
        try {
          var1_int = ia.field_e - qn.field_o;
          qn.field_o = -(var1_int >> 1) + bq.field_d;
          ia.field_e = var1_int + qn.field_o;
          if (param0 < 16) {
            field_b = (String) null;
          }
          ce.field_c = -(nf.field_c >> 1) + qh.field_b;
          var2 = ce.field_c;
          for (var3 = 0; var3 < pl.field_J.length; var3++) {
            var4 = uf.field_e[var3];
            if (var4 < 0) {
              var5 = hd.field_n;
            } else {
              if (var4 == vp.field_Gb.field_j) {
                var5 = mj.field_k;
              } else {
                var5 = mh.field_a;
              }
            }
            var6 = pl.field_J[var3];
            stackIn_12_0 = var6;
            stackIn_12_1 = 8192;
            stackIn_13_2 = !(var4 < 0);
            var7 = jp.a(stackIn_12_0, stackIn_12_1, stackIn_13_2);
            var8 = bq.field_d - (var7 >> 1);
            if (var4 >= 0) {
              if (vp.field_Gb.field_j != var4) {
                stackIn_18_0 = uo.field_m;
              } else {
                stackIn_18_0 = wg.field_d;
              }
              var9 = stackIn_18_0;
              var2 = var2 + ki.field_e;
              if (var9 != null) {
                var9.a(var2, dk.field_d + (lf.field_b << 1), -1, (uf.field_a << 1) + var7, var8 - uf.field_a);
              }
              var2 = var2 + lf.field_b;
            }
            if (var4 >= 0) {
              ie.field_G.a(var6, var8, var2 + w.field_q, var5, -1);
              var2 = var2 + (dk.field_d + lf.field_b + ki.field_e);
            } else {
              lm.field_o.a(var6, var8, ab.field_b + var2, var5, -1);
              var2 = var2 + da.field_m;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1), "vh.B(" + param0 + ')');
        }
    }

    final void a(int param0, byte[] param1, we param2) {
        try {
          try {
            if (31 != param2.field_k[param2.field_m] ||
              param2.field_k[param2.field_m + 1] != -117) {
              throw new RuntimeException("");
            }
            if (null == this.field_a) {
              this.field_a = new java.util.zip.Inflater(true);
            }
            try {
              this.field_a.setInput(param2.field_k, param2.field_m + 10, param0 - param2.field_m - (10 - param2.field_k.length));
              this.field_a.inflate(param1);
            } catch (Exception exception) {
              this.field_a.reset();
              throw new RuntimeException("");
            }
            this.field_a.reset();
          } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "vh.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void b(int param0) {
        if (param0 != -8) {
          vh.a(-33);
        }
        field_b = null;
        field_c = null;
    }

    private vh(int param0, int param1, int param2) {
    }

    public vh() {
        this(-1, 1000000, 1000000);
    }

    static {
        field_c = null;
        field_b = "Acid Sunset";
    }
}
