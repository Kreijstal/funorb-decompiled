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
            var5 = this.field_c[(int)((long)(this.field_d - 1) & param2)];
            param0.field_b = var5;
            param0.field_j = var5.field_j;
            param0.field_j.field_b = param0;
            param0.field_b.field_j = param0;
            param0.field_i = param2;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "m.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(boolean param0) {
        field_a = null;
        field_f = (boolean[][]) null;
        field_g = null;
        field_h = null;
        field_b = null;
        if (param0) {
            m.a(false);
        }
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new tl((m) (this)));
    }

    final tc a(int param0, long param1) {
        tc var4 = null;
        tc var5 = null;
        int var6 = 0;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param0 == 13497) {
          var4 = this.field_c[(int)((long)(this.field_d - 1) & param1)];
          this.field_e = var4.field_b;
          L0: while (true) {
            if (var4 != this.field_e) {
              if (var6 == 0) {
                if (param1 != this.field_e.field_i) {
                  this.field_e = this.field_e.field_b;
                  continue L0;
                } else {
                  var5 = this.field_e;
                  this.field_e = this.field_e.field_b;
                  return var5;
                }
              } else {
                return null;
              }
            } else {
              this.field_e = null;
              return null;
            }
          }
        } else {
          field_f = (boolean[][]) null;
          var4 = this.field_c[(int)((long)(this.field_d - 1) & param1)];
          this.field_e = var4.field_b;
          L1: while (true) {
            if (var4 != this.field_e) {
              if (var6 == 0) {
                if (param1 != this.field_e.field_i) {
                  this.field_e = this.field_e.field_b;
                  continue L1;
                } else {
                  var5 = this.field_e;
                  this.field_e = this.field_e.field_b;
                  return var5;
                }
              } else {
                return null;
              }
            } else {
              this.field_e = null;
              return null;
            }
          }
        }
    }

    m(int param0) {
        tc dupTemp$0 = null;
        tc var3 = null;
        int var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        this.field_c = new tc[param0];
        this.field_d = param0;
        int var2 = 0;
        while (var2 < param0) {
            dupTemp$0 = new tc();
            var3 = dupTemp$0;
            this.field_c[var2] = dupTemp$0;
            var3.field_b = var3;
            var3.field_j = var3;
            var2++;
            if (var4 != 0) {
                return;
            }
        }
    }

    static {
        field_a = new int[]{65, 105};
        field_b = "<%0> has entered another game.";
        field_h = "This structure belongs to <%0>";
        field_f = new boolean[][]{new boolean[]{false, false, false, false, false, false, false}, new boolean[]{false, false, false, false}, new boolean[]{false, false, false, false}, new boolean[]{false, false, false, false}, new boolean[]{false, false}, new boolean[]{false, false, false, false, true}};
        field_g = "Hexes to baffle and corrupt single units.";
    }
}
