/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class up implements Iterator {
    private int field_a;
    static cj field_g;
    private br field_b;
    static ja field_f;
    static int field_d;
    private wh field_h;
    static String field_c;
    private br field_e;

    public final void remove() {
        if (null == this.field_b) {
          throw new IllegalStateException();
        }
        this.field_b.a(true);
        this.field_b = null;
    }

    final static void b(int param0) {
        int var3 = 0;
        boolean stackIn_11_0 = false;
        pd stackIn_16_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        pd var9 = null;
        int var10 = 0;
        int var4Lifetime1;
        var10 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var1_int = mc.field_e - ch.field_i;
          ch.field_i = aq.field_x - (var1_int >> 1);
          mc.field_e = ch.field_i + var1_int;
          eb.field_M = pm.field_Q - (pl.field_F >> 1);
          var2 = eb.field_M;
          for (var3 = 0; var3 < eo.field_e.length; var3++) {
            var4 = dn.field_a[var3];
            if (var4 < 0) {
              var5 = kk.field_x;
            } else {
              if (var4 == mo.field_Jb.field_d) {
                var5 = ua.field_N;
              } else {
                var5 = sb.field_c;
              }
            }
            var6 = eo.field_e[var3];
            stackIn_11_0 = !(var4 < 0);
            var7 = vh.a(stackIn_11_0, -76, var6);
            var8 = -(var7 >> 1) + aq.field_x;
            if (var4 >= 0) {
              var2 = var2 + pb.field_b;
              if (var4 == mo.field_Jb.field_d) {
                stackIn_16_0 = vk.field_I;
              } else {
                stackIn_16_0 = li.field_E;
              }
              var9 = stackIn_16_0;
              if (var9 != null) {
                var9.a(var2, -wb.field_db + var8, (wb.field_db << 1) + var7, (ne.field_tb << 1) + po.field_n, 12018);
              }
              var2 = var2 + ne.field_tb;
            }
            if (var4 < 0) {
              e.field_c.c(var6, var8, mg.field_H + var2, var5, -1);
              var2 = var2 + dq.field_l;
            } else {
              wn.field_u.c(var6, var8, var2 + tk.field_n, var5, -1);
              var2 = var2 + (po.field_n + (pb.field_b + ne.field_tb));
            }
          }
          var4Lifetime1 = -17 / ((param0 + 59) / 46);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var1), "up.C(" + param0 + ')');
        }
    }

    public final Object next() {
        br[] fieldTemp$0 = null;
        int fieldTemp$1 = 0;
        br var1;
        int var2;
        var2 = ZombieDawnMulti.field_E ? 1 : 0;
        if (this.field_h.field_a[-1 + this.field_a] != this.field_e) {
          var1 = this.field_e;
          this.field_e = var1.field_d;
          this.field_b = var1;
          return var1;
        }
        do {
          if (this.field_a >= this.field_h.field_d) {
            return null;
          }
          fieldTemp$0 = this.field_h.field_a;
          fieldTemp$1 = this.field_a;
          this.field_a = this.field_a + 1;
          var1 = fieldTemp$0[fieldTemp$1].field_d;
        } while (this.field_h.field_a[this.field_a - 1] == var1);
        this.field_e = var1.field_d;
        this.field_b = var1;
        return var1;
    }

    final static void a(boolean param0) {
        dm.field_ac.a(18, 0, -(tb.field_u ? 40 + (2 + (qa.field_o + 2)) : 0) + pd.field_b.field_zb, 0, -3344);
        mo.field_Hb.a(18, 0, 42 + qa.field_o, -2 + (pd.field_b.field_zb + (-qa.field_o - 40)), -3344);
        if (param0) {
          field_g = (cj) null;
        }
        hf.field_e.a(qa.field_o, 2, pd.field_b.field_zb, 0, pd.field_b.field_z - 20, -31465, 20);
    }

    public final boolean hasNext() {
        br[] fieldTemp$0 = null;
        int fieldTemp$1 = 0;
        int var2;
        var2 = ZombieDawnMulti.field_E ? 1 : 0;
        if (this.field_h.field_a[-1 + this.field_a] != this.field_e) {
          return true;
        }
        while (this.field_a < this.field_h.field_d) {
          fieldTemp$0 = this.field_h.field_a;
          fieldTemp$1 = this.field_a;
          this.field_a = this.field_a + 1;
          if (fieldTemp$0[fieldTemp$1].field_d != this.field_h.field_a[-1 + this.field_a]) {
            this.field_e = this.field_h.field_a[this.field_a - 1].field_d;
            return true;
          }
          this.field_e = this.field_h.field_a[-1 + this.field_a];
        }
        return false;
    }

    final static String a(int param0) {
        int var1 = 57 % ((param0 - 77) / 49);
        if (cb.field_l) {
          return null;
        }
        if (l.field_a < um.field_h) {
          return null;
        }
        if (!(br.field_a + um.field_h <= l.field_a)) {
          return kg.field_k;
        }
        return null;
    }

    private final void c(int param0) {
        this.field_e = this.field_h.field_a[0].field_d;
        this.field_a = param0;
        this.field_b = null;
    }

    public static void a(byte param0) {
        field_g = null;
        field_f = null;
        field_c = null;
        if (param0 >= -8) {
          field_d = -60;
        }
    }

    up(wh param0) {
        this.field_b = null;
        try {
          this.field_h = param0;
          this.c(1);
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "up.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = "Go!";
    }
}
