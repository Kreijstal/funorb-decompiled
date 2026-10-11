/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class m implements Iterable {
    static int[] field_a;
    IntrusiveNode[] field_c;
    int field_d;
    static boolean[][] field_f;
    private IntrusiveNode field_e;
    static String field_b;
    static String field_h;
    static int field_i;
    static String field_g;

    final void a(IntrusiveNode param0, boolean param1, long param2) {
        IntrusiveNode var5 = null;
        try {
          if (param1) {
            field_i = -49;
          }
          if (param0.previous != null) {
            param0.unlink(-118);
          }
          var5 = this.field_c[(int)((long)(this.field_d - 1) & param2)];
          param0.next = var5;
          param0.previous = var5.previous;
          param0.previous.next = param0;
          param0.next.previous = param0;
          param0.key = param2;
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
        return (Iterator) ((Object) new tl(this));
    }

    final IntrusiveNode a(int param0, long param1) {
        IntrusiveNode var4;
        IntrusiveNode var5;
        int var6;
        IntrusiveNode var4Lifetime1;
        IntrusiveNode var5Lifetime1;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (param0 == 13497) {
          var4 = this.field_c[(int)((long)(this.field_d - 1) & param1)];
          this.field_e = var4.next;
          while (true) {
            if (var4 == this.field_e) {
              this.field_e = null;
              return null;
            }
            if (param1 != this.field_e.key) {
              this.field_e = this.field_e.next;
              continue;
            }
            break;
          }
          var5 = this.field_e;
          this.field_e = this.field_e.next;
          return var5;
        }
        field_f = (boolean[][]) null;
        var4Lifetime1 = this.field_c[(int)((long)(this.field_d - 1) & param1)];
        this.field_e = var4Lifetime1.next;
        while (true) {
          if (var4Lifetime1 == this.field_e) {
            this.field_e = null;
            return null;
          }
          if (param1 != this.field_e.key) {
            this.field_e = this.field_e.next;
            continue;
          }
          break;
        }
        var5Lifetime1 = this.field_e;
        this.field_e = this.field_e.next;
        return var5Lifetime1;
    }

    m(int param0) {
        int var2 = 0;
        IntrusiveNode dupTemp$0 = null;
        IntrusiveNode var3 = null;
        this.field_c = new IntrusiveNode[param0];
        this.field_d = param0;
        for (var2 = 0; var2 < param0; var2++) {
          dupTemp$0 = new IntrusiveNode();
          var3 = dupTemp$0;
          this.field_c[var2] = dupTemp$0;
          var3.next = var3;
          var3.previous = var3;
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
