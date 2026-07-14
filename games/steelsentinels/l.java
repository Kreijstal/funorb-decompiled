/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class l implements Iterator {
    static String field_a;
    static String field_f;
    static tg field_i;
    private ck field_h;
    static ql field_e;
    static int field_g;
    private q field_d;
    private int field_b;
    private ck field_c;

    final static void a(em param0, byte param1) {
        int var2 = -112 % ((-14 - param1) / 32);
        ll.field_e.a((we) (Object) param0);
    }

    final static void a(gk[] param0, cm param1, String[] param2, int[] param3, int param4, String[] param5, String[][] param6, int param7, cm param8, byte param9, String[][] param10, wk[][] param11, cm param12, byte[] param13, wk[][] param14, boolean param15, int[] param16, int param17, String[] param18, byte[] param19) {
        oh.a(param3, false, param8, param0, param12);
        lb.a((byte) 109, param8);
        if (param9 != 94) {
            Object var21 = null;
            l.a((gk[]) null, (cm) null, (String[]) null, (int[]) null, 58, (String[]) null, (String[][]) null, -8, (cm) null, (byte) -10, (String[][]) null, (wk[][]) null, (cm) null, (byte[]) null, (wk[][]) null, true, (int[]) null, 95, (String[]) null, (byte[]) null);
        }
        oh.a(param7, param16, param5, param10, param2, param9 ^ 94, param6, param4, param11, param14, param17, param18, param13, param19, param8);
        vl.a(param8, param1, param15, -119);
        rm.b((byte) -115);
        bf.m(854);
        sb.a(false);
    }

    public final boolean hasNext() {
        int var2 = 0;
        var2 = SteelSentinels.field_G;
        if (((l) this).field_d.field_j[((l) this).field_b - 1] == ((l) this).field_c) {
          L0: while (true) {
            if (((l) this).field_d.field_e > ((l) this).field_b) {
              ((l) this).field_b = ((l) this).field_b + 1;
              if (((l) this).field_d.field_j[((l) this).field_b].field_k != ((l) this).field_d.field_j[-1 + ((l) this).field_b]) {
                ((l) this).field_c = ((l) this).field_d.field_j[((l) this).field_b - 1].field_k;
                return true;
              } else {
                ((l) this).field_c = ((l) this).field_d.field_j[-1 + ((l) this).field_b];
                continue L0;
              }
            } else {
              return false;
            }
          }
        } else {
          return true;
        }
    }

    public final void remove() {
        if (((l) this).field_h == null) {
            throw new IllegalStateException();
        }
        ((l) this).field_h.b(4);
        ((l) this).field_h = null;
    }

    public final Object next() {
        int var2 = 0;
        ck var3 = null;
        ck var4 = null;
        var2 = SteelSentinels.field_G;
        if (((l) this).field_d.field_j[((l) this).field_b + -1] == ((l) this).field_c) {
          L0: while (true) {
            if (((l) this).field_d.field_e > ((l) this).field_b) {
              ((l) this).field_b = ((l) this).field_b + 1;
              var3 = ((l) this).field_d.field_j[((l) this).field_b].field_k;
              if (var3 == ((l) this).field_d.field_j[((l) this).field_b - 1]) {
                continue L0;
              } else {
                ((l) this).field_h = var3;
                ((l) this).field_c = var3.field_k;
                return (Object) (Object) var3;
              }
            } else {
              return null;
            }
          }
        } else {
          var4 = ((l) this).field_c;
          ((l) this).field_c = var4.field_k;
          ((l) this).field_h = var4;
          return (Object) (Object) var4;
        }
    }

    private final void a(int param0) {
        ((l) this).field_b = 1;
        if (param0 != 29329) {
          field_i = null;
          ((l) this).field_h = null;
          ((l) this).field_c = ((l) this).field_d.field_j[0].field_k;
          return;
        } else {
          ((l) this).field_h = null;
          ((l) this).field_c = ((l) this).field_d.field_j[0].field_k;
          return;
        }
    }

    public static void a(byte param0) {
        Object var2 = null;
        if (param0 != 22) {
          var2 = null;
          l.a((gk[]) null, (cm) null, (String[]) null, (int[]) null, 96, (String[]) null, (String[][]) null, -31, (cm) null, (byte) 116, (String[][]) null, (wk[][]) null, (cm) null, (byte[]) null, (wk[][]) null, true, (int[]) null, -127, (String[]) null, (byte[]) null);
          field_i = null;
          field_f = null;
          field_e = null;
          field_a = null;
          return;
        } else {
          field_i = null;
          field_f = null;
          field_e = null;
          field_a = null;
          return;
        }
    }

    l(q param0) {
        ((l) this).field_h = null;
        ((l) this).field_d = param0;
        this.a(29329);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "<%0> got careless";
        field_f = "Jump:";
        field_g = -1;
    }
}
