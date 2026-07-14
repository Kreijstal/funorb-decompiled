/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class la {
    private gp field_b;
    static int[] field_d;
    static ej field_i;
    static cr field_f;
    static cc field_a;
    static r field_e;
    static String field_c;
    private ak field_h;
    private jl field_g;
    private int field_j;

    final gp a(long param0, boolean param1) {
        gp var4 = null;
        var4 = (gp) (Object) ((la) this).field_g.a(param0, (byte) 64);
        if (!param1) {
          if (var4 != null) {
            ((la) this).field_h.a(false, var4);
            return var4;
          } else {
            return var4;
          }
        } else {
          field_i = null;
          if (var4 == null) {
            return var4;
          } else {
            ((la) this).field_h.a(false, var4);
            return var4;
          }
        }
    }

    final static void a(String param0, String param1, int param2) {
        km.a(param1, false, true, param0);
        if (param2 != 26806) {
            la.a(true);
        }
    }

    final static void a(int param0, boolean param1, byte param2, int param3) {
        oi.a(param0, param3, param2 ^ -10, param1);
        if (param2 != -120) {
            la.a(-64, false, (byte) -93, -119);
        }
    }

    public static void a(boolean param0) {
        field_e = null;
        field_d = null;
        if (param0) {
          field_a = null;
          field_i = null;
          field_c = null;
          field_f = null;
          field_a = null;
          return;
        } else {
          field_i = null;
          field_c = null;
          field_f = null;
          field_a = null;
          return;
        }
    }

    final void a(int param0, gp param1, long param2) {
        gp var5 = null;
        if ((((la) this).field_j ^ -1) != param0) {
          ((la) this).field_j = ((la) this).field_j - 1;
          ((la) this).field_g.a((li) (Object) param1, param2, false);
          ((la) this).field_h.a(false, param1);
          return;
        } else {
          L0: {
            var5 = ((la) this).field_h.a(-124);
            var5.c(param0 ^ -3);
            var5.a(-99);
            if (var5 != ((la) this).field_b) {
              break L0;
            } else {
              var5 = ((la) this).field_h.a(-98);
              var5.c(param0 + 3);
              var5.a(-109);
              break L0;
            }
          }
          ((la) this).field_g.a((li) (Object) param1, param2, false);
          ((la) this).field_h.a(false, param1);
          return;
        }
    }

    final static void a(byte param0) {
        in.field_c = null;
        if (param0 <= 14) {
          la.a((byte) 27);
          vi.field_w = null;
          se.field_y = null;
          pc.field_a = null;
          ca.field_a = null;
          mh.field_c = null;
          return;
        } else {
          vi.field_w = null;
          se.field_y = null;
          pc.field_a = null;
          ca.field_a = null;
          mh.field_c = null;
          return;
        }
    }

    la(int param0) {
        ((la) this).field_b = new gp();
        ((la) this).field_h = new ak();
        ((la) this).field_j = param0;
        int var2 = 1;
        while (var2 + var2 < param0) {
            var2 = var2 + var2;
        }
        ((la) this).field_g = new jl(var2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new ej("usename");
        field_c = "Email: ";
    }
}
