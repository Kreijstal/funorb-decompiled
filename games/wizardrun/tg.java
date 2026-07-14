/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class tg implements Serializable {
    int[] field_j;
    boolean[] field_d;
    int[] field_f;
    static pj field_h;
    static oi field_c;
    int[] field_a;
    static long field_g;
    static long field_e;
    static int field_i;
    static String field_b;

    final static ae a(int param0, String param1) {
        int var2 = 0;
        String var3 = null;
        String var4 = null;
        ae var5 = null;
        if (param1 != null) {
          if (param1.length() != 0) {
            var2 = param1.indexOf('@');
            if (-1 != var2) {
              var3 = param1.substring(0, var2);
              var4 = param1.substring(1 + var2);
              var5 = fc.a(var3, param0);
              if (var5 != null) {
                return var5;
              } else {
                return dh.a(-27602, var4);
              }
            } else {
              return ok.field_f;
            }
          } else {
            return ga.field_c;
          }
        } else {
          return ga.field_c;
        }
    }

    final static void a(long param0, boolean param1) {
        if (-1L <= (param0 ^ -1L)) {
          return;
        } else {
          if (-1L == (param0 % 10L ^ -1L)) {
            pg.a(-1L + param0, 2);
            pg.a(1L, 2);
            if (!param1) {
              return;
            } else {
              tg.a(true);
              return;
            }
          } else {
            pg.a(param0, 2);
            if (!param1) {
              return;
            } else {
              tg.a(true);
              return;
            }
          }
        }
    }

    public static void a(boolean param0) {
        field_c = null;
        field_b = null;
        field_h = null;
        if (!param0) {
            field_b = null;
        }
    }

    tg() {
        ((tg) this).field_j = new int[300];
        ((tg) this).field_d = new boolean[300];
        ((tg) this).field_f = new int[300];
        ((tg) this).field_a = new int[300];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new oi();
        field_i = 0;
    }
}
