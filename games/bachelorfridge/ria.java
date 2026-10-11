/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ria extends gca {
    private eaa field_j;
    private kv field_l;
    static vr field_i;
    static sna field_k;

    final boolean a(boolean param0, boolean param1) {
        cia var3 = null;
        int var4 = 0;
        int var5 = BachelorFridge.field_y;
        cia var3Lifetime1;
        int var4Lifetime1;
        if (param0) {
          this.a(true, false);
          var3 = (cia) (this.field_j.b((byte) 90));
          while (var3 != null) {
            var3.b(!param0 ? true : false);
            var3 = (cia) (this.field_j.c(0));
          }
          var4 = vr.field_b & 127;
          if (var4 > 32) {
            return !this.field_j.e(12917) ? true : false;
          }
          if (0 != (var4 & 15)) {
            return !this.field_j.e(12917) ? true : false;
          }
          this.e((byte) -104);
          return !this.field_j.e(12917) ? true : false;
        }
        var3Lifetime1 = (cia) (this.field_j.b((byte) 90));
        while (var3Lifetime1 != null) {
          var3Lifetime1.b(!param0 ? true : false);
          var3Lifetime1 = (cia) (this.field_j.c(0));
        }
        var4Lifetime1 = vr.field_b & 127;
        if (var4Lifetime1 <= 32 &&
          0 == (var4Lifetime1 & 15)) {
          this.e((byte) -104);
          return !this.field_j.e(12917) ? true : false;
        }
        return !this.field_j.e(12917) ? true : false;
    }

    public ria() {
        super(29);
        this.field_j = new eaa();
        this.field_l = ff.field_u.a();
    }

    public static void a(int param0) {
        field_i = null;
        if (param0 != 127) {
          return;
        }
        field_k = null;
    }

    private final void e(byte param0) {
        int var3 = 0;
        cia var4 = null;
        int var2 = kla.a(256, vd.field_z, -2147483648);
        if (param0 < -80) {
          var3 = kla.a(1024, vd.field_z, -2147483648);
          var4 = new cia(var2, 0, var3);
          var4.a(119, 128, -2);
          var4.a(0, -15, 0, 0);
          var4.a(-120, 0);
          this.field_j.a(var4, true);
          return;
        }
    }

    final void a(int param0, byte param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = BachelorFridge.field_y;
        param0 -= 80;
        param2 += 12;
        cia var4 = (cia) (this.field_j.b((byte) 90));
        while (var4 != null) {
          var5 = 256 - (var4.field_o << 1);
          var6 = this.field_l.field_n * var5 >> 8;
          var7 = var5 * this.field_l.field_o >> 8;
          this.field_l.c((var4.field_i >> 4) + param2 - (var6 >> 1), (var4.field_h >> 9) + param0 - (-(var4.field_q >> 5) + (var7 >> 1)), var6, var7, var4.field_o);
          var4 = (cia) (this.field_j.c(0));
        }
        if (param1 > 7) {
          return;
        }
        this.e((byte) -11);
    }

    static {
    }
}
