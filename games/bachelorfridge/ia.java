/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ia extends pv {
    static String[] field_j;
    static Random field_k;

    public static void c(int param0) {
        if (param0 != 300) {
            ia.c(-106);
            field_j = null;
            field_k = null;
            return;
        }
        field_j = null;
        field_k = null;
    }

    final boolean b(boolean param0) {
        int fieldTemp$2 = this.field_g + 1;
        this.field_g = this.field_g + 1;
        if (fieldTemp$2 > this.d(300)) {
          this.b(-1);
          return true;
        } else {
          if (1 != this.field_g) {
            if (!param0) {
              return true;
            } else {
              return false;
            }
          } else {
            this.field_f.field_v.a((byte) 77, this.field_f.field_g.field_o.field_b, 0);
            fia.c(3, this.field_f.field_g.field_o.field_e);
            if (!param0) {
              return true;
            } else {
              return false;
            }
          }
        }
    }

    final static void a(boolean param0, int param1) {
        pja.a(-11204, param0);
        if (!(null == jja.field_m)) {
            gp.b(-25942, jja.field_m);
        }
        if (param1 > -72) {
            ia.a(false, -79);
            return;
        }
    }

    private final int d(int param0) {
        if (param0 != 300) {
            field_k = (Random) null;
            return 300;
        }
        return 300;
    }

    private final void b(int param0) {
        this.field_f.field_y = param0;
    }

    ia(jfa param0) {
        try {
            this.field_f = param0;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "ia.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_j = new String[]{"Meaty", "Dairy", "Sugary", "Bready", "Spooky", "Bouncy", "Fizzy", "Fishy", "Spicy", "Savoury"};
        field_k = new Random();
    }
}
