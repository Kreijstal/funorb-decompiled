/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class rk extends wl {
    static java.util.zip.CRC32 field_j;
    rk field_l;
    static nk field_k;
    long field_o;
    rk field_i;
    static o field_m;
    static int field_n;

    final void b(boolean param0) {
        if (null == this.field_l) {
          return;
        }
        if (!param0) {
          this.field_l.field_i = this.field_i;
          this.field_i.field_l = this.field_l;
          this.field_i = null;
          this.field_l = null;
          return;
        }
        this.field_o = -4L;
        this.field_l.field_i = this.field_i;
        this.field_i.field_l = this.field_l;
        this.field_i = null;
        this.field_l = null;
    }

    final static void c(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        ie var4_ref_ie = null;
        Object var5 = null;
        int var6 = 0;
        tc var8 = null;
        mg var9 = null;
        byte[] var13 = null;
        var6 = wizardrun.field_H;
        try {
          if (param0 != -2) {
            field_m = (o) null;
          }
          var9 = nk.field_N;
          var2 = var9.f(param0 + 257);
          if (var2 == 0) {
            var8 = (tc) (df.field_c.b((byte) 107));
            if (var8 == null) {
              ql.a(-78);
              return;
            }
            var4 = var9.f(255);
            if (var4 != 0) {
              var13 = new byte[var4];
              var9.a(true, var4, var13, 0);
            } else {
              var5 = null;
            }
            var9.field_m = var9.field_m + 4;
            if (!var9.e(-6142)) {
              ql.a(-97);
              return;
            }
            var8.a(false);
            return;
          }
          if (var2 != 1) {
            rg.a((Throwable) null, "A1: " + ni.c(6), -562);
            ql.a(param0 ^ 117);
            return;
          }
          var3 = var9.i(param0 + 257);
          var4_ref_ie = (ie) (pa.field_e.b((byte) 61));
          while (var4_ref_ie != null) {
            if (var3 != var4_ref_ie.field_k) {
              var4_ref_ie = (ie) (pa.field_e.d(8192));
              continue;
            }
            break;
          }
          if (var4_ref_ie == null) {
            ql.a(-85);
            return;
          }
          var4_ref_ie.a(false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) var1), "rk.F(" + param0 + ')');
        }
    }

    protected rk() {
    }

    public static void a(int param0) {
        if (param0 != -1) {
          return;
        }
        field_m = null;
        field_j = null;
        field_k = null;
    }

    static {
        field_j = new java.util.zip.CRC32();
    }
}
