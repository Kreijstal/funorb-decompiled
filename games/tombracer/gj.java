/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class gj {
    private int field_c;
    static gj field_p;
    static gj field_e;
    int field_l;
    private una field_g;
    int field_i;
    static gj field_b;
    static gj field_m;
    static gj field_n;
    static gj field_k;
    static gj field_j;
    static int field_f;
    static nt field_o;
    static boolean field_r;
    static String field_q;
    static float field_h;
    static Hashtable field_d;
    static String field_a;

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(cn param0, boolean param1) {
        jea stackIn_4_0 = null;
        boolean stackIn_5_1 = false;
        jea stackIn_7_0 = null;
        boolean stackIn_8_1 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        jea var3 = null;
        cn var4 = null;
        jea var6 = null;
        jea var7 = null;
        try {
          bfa.field_e = nia.a(param0, "basic", "display_name_changed", 121);
          dn.field_b = new hla(0L, aaa.field_d, kea.field_a, ai.field_d);
          jja.field_j = new hla(0L, aaa.field_d, dj.field_a, uma.field_a);
          dqa.field_e = new jea(0L, (jea) null);
          is.field_yb = new jea(0L, kua.field_i);
          is.field_yb.field_z = 1;
          qh.field_F = new jea(0L, ooa.field_f, ija.field_i);
          mda.field_v = new jea(0L, hma.field_b, ap.field_c);
          ita.field_c = new jea(0L, dja.field_p);
          dqa.field_e.b(-122, is.field_yb);
          dqa.field_e.b(-126, qh.field_F);
          if (!param1) {
            var4 = (cn) null;
            gj.a((cn) null, true);
          }
          dqa.field_e.b(-123, mda.field_v);
          dqa.field_e.b(-123, dn.field_b);
          dqa.field_e.b(-125, ita.field_c);
          stackIn_4_0 = dn.field_b.field_vb.field_vb;
          stackIn_5_1 = !(param1);
          ((jea) (Object) stackIn_4_0).a(stackIn_5_1, kua.field_i);
          dn.field_b.field_vb.field_vb.field_bb = 1;
          var6 = dn.field_b.field_vb.field_vb;
          var7 = var6;
          var7.field_z = 1;
          stackIn_7_0 = jja.field_j.field_vb.field_vb;
          stackIn_8_1 = !(param1);
          ((jea) (Object) stackIn_7_0).a(stackIn_8_1, kua.field_i);
          jja.field_j.field_vb.field_vb.field_bb = 1;
          var3 = jja.field_j.field_vb.field_vb;
          var3.field_z = 1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_12_0 = var2;
          stackIn_12_1 = new StringBuilder().append("gj.C(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    final static gj a(byte param0, int param1) {
        int var2;
        int var3;
        var3 = TombRacer.field_G ? 1 : 0;
        var2 = param1;
        if (var2 == 0) {
          return field_p;
        }
        if (var2 == 1) {
          return field_e;
        }
        if (var2 == 2) {
          return field_b;
        }
        if (var2 == 3) {
          return field_m;
        }
        if (var2 == 4) {
          return field_n;
        }
        if (var2 == 5) {
          return field_k;
        }
        if (var2 == 6) {
          return field_j;
        }
        if (param0 == 41) {
          return null;
        }
        field_d = (Hashtable) null;
        return null;
    }

    public static void a(int param0) {
        field_m = null;
        field_o = null;
        field_e = null;
        field_j = null;
        int var1 = -99 / ((-68 - param0) / 50);
        field_d = null;
        field_q = null;
        field_a = null;
        field_n = null;
        field_k = null;
        field_p = null;
        field_b = null;
    }

    private gj(int param0, int param1, una param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_i = param0;
          this.field_c = param1;
          this.field_g = param2;
          this.field_l = this.field_g.field_e * this.field_c;
          if (this.field_i < 16) {
            return;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_5_0 = var4;
          stackIn_5_1 = new StringBuilder().append("gj.<init>(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    static {
        field_p = new gj(0, 3, una.field_h);
        field_e = new gj(1, 3, una.field_h);
        field_b = new gj(2, 4, una.field_g);
        field_m = new gj(3, 1, una.field_h);
        field_n = new gj(4, 2, una.field_h);
        field_k = new gj(5, 3, una.field_h);
        field_j = new gj(6, 4, una.field_h);
        field_f = bia.a((byte) 93, 16);
        field_o = new nt();
        field_d = new Hashtable();
        field_a = "ESC - cancel private message";
    }
}
