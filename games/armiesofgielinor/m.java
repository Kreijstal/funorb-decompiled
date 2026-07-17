/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class m implements Iterable {
    static int[] field_a;
    tc[] field_c;
    int field_d;
    static boolean[][] field_f;
    private tc field_e;
    static String field_b;
    static String field_h;
    static int field_i;
    static String field_g;

    final void a(tc param0, boolean param1, long param2) {
        tc var5 = null;
        try {
            if (param1) {
                field_i = -49;
            }
            if (!(param0.field_j == null)) {
                param0.d(-118);
            }
            var5 = ((m) this).field_c[(int)((long)(((m) this).field_d - 1) & param2)];
            param0.field_b = var5;
            param0.field_j = var5.field_j;
            param0.field_j.field_b = param0;
            param0.field_b.field_j = param0;
            param0.field_i = param2;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "m.A(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    public static void a() {
        field_a = null;
        field_f = null;
        field_g = null;
        field_h = null;
        field_b = null;
    }

    public final Iterator iterator() {
        return (Iterator) (Object) new tl((m) this);
    }

    final tc a(int param0, long param1) {
        tc var4 = null;
        tc var5 = null;
        int var6 = 0;
        tc var7 = null;
        tc var8 = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param0 == 13497) {
          var7 = ((m) this).field_c[(int)((long)(((m) this).field_d - 1) & param1)];
          var4 = var7;
          ((m) this).field_e = var7.field_b;
          L0: while (true) {
            if (var4 == ((m) this).field_e) {
              ((m) this).field_e = null;
              return null;
            } else {
              if (param1 != ((m) this).field_e.field_i) {
                ((m) this).field_e = ((m) this).field_e.field_b;
                continue L0;
              } else {
                var5 = ((m) this).field_e;
                ((m) this).field_e = ((m) this).field_e.field_b;
                return var5;
              }
            }
          }
        } else {
          field_f = null;
          var8 = ((m) this).field_c[(int)((long)(((m) this).field_d - 1) & param1)];
          var4 = var8;
          ((m) this).field_e = var8.field_b;
          L1: while (true) {
            if (var4 == ((m) this).field_e) {
              ((m) this).field_e = null;
              return null;
            } else {
              if (param1 != ((m) this).field_e.field_i) {
                ((m) this).field_e = ((m) this).field_e.field_b;
                continue L1;
              } else {
                var5 = ((m) this).field_e;
                ((m) this).field_e = ((m) this).field_e.field_b;
                return var5;
              }
            }
          }
        }
    }

    m(int param0) {
        int var2 = 0;
        tc var3 = null;
        ((m) this).field_c = new tc[param0];
        ((m) this).field_d = param0;
        for (var2 = 0; var2 < param0; var2++) {
            tc dupTemp$0 = new tc();
            var3 = dupTemp$0;
            ((m) this).field_c[var2] = dupTemp$0;
            var3.field_b = var3;
            var3.field_j = var3;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new int[]{65, 105};
        field_b = "<%0> has entered another game.";
        field_h = "This structure belongs to <%0>";
        field_f = new boolean[][]{new boolean[7], new boolean[4], new boolean[4], new boolean[4], new boolean[2], new boolean[5]};
        field_g = "Hexes to baffle and corrupt single units.";
    }
}
