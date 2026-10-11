/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class id {
    boolean field_e;
    boolean field_g;
    String[] field_f;
    static bb field_d;
    String field_c;
    int field_a;
    static int field_b;

    public static void c(int param0) {
        int var1 = 64 / ((-80 - param0) / 37);
        field_d = null;
    }

    final static void a(byte param0, hf param1, int param2) {
        pc var5 = aa.field_f;
        var5.g(param2, 15514);
        var5.field_m = var5.field_m + 1;
        int var4 = var5.field_m;
        var5.e(160, 1);
        var5.e(160, param1.field_u);
        if (param0 > -96) {
          return;
        }
        try {
          var5.e(160, param1.field_v);
          var5.d(param1.field_s, -116);
          var5.d(param1.field_r, -102);
          var5.d(param1.field_l, -112);
          var5.d(param1.field_p, -120);
          var5.b(var4, (byte) 84);
          var5.f(var5.field_m - var4, -1);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "id.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void a(int param0) {
        if (param0 < 40) {
          field_d = (bb) null;
        }
        fm.field_b = new pl();
        ph.field_l.c(fm.field_b, -121);
    }

    final static void b(int param0) {
        int var2 = 0;
        int var1_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var1_intLifetime1;
        int var1_intLifetime2;
        var3 = Pixelate.field_H ? 1 : 0;
        try {
          im.field_Hb = new tf[param0];
          for (var1_int = 0; var1_int < 2; var1_int++) {
            im.field_Hb[var1_int] = new tf(64, 64);
          }
          eg.a((byte) 99);
          qa.field_f.a(19692);
          ii.field_p = new hh[10];
          for (var1_intLifetime1 = 0; var1_intLifetime1 < ii.field_p.length; var1_intLifetime1++) {
            ii.field_p[var1_intLifetime1] = new hh(64, 64, 2);
            for (var2 = 0; ii.field_p[var1_intLifetime1].field_n.length > var2; var2++) {
              if (ok.a(ea.field_b, param0 ^ -124, 9) > var1_intLifetime1) {
                ii.field_p[var1_intLifetime1].field_n[var2] = (byte) 1;
              }
            }
          }
          for (var1_intLifetime2 = 0; gg.field_z.length > var1_intLifetime2; var1_intLifetime2++) {
            gg.field_z[var1_intLifetime2] = var1_intLifetime2 * 526344;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1), "id.D(" + param0 + ')');
        }
    }

    final static void a(boolean param0, byte param1) {
        qk.field_e = 0;
        ae.field_b = 0;
        if (param1 <= 104) {
          return;
        }
        oe.field_Sb = 0;
        jn.field_q = ui.field_k;
        a.field_I = new pf(2);
        a.field_I.a(param0, el.a(bg.field_k, (byte) -106, uf.field_d), 17068, -1);
    }

    id(boolean param0) {
        this.field_g = param0 ? true : false;
    }

    static {
    }
}
