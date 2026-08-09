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
        if (param0) {
            this.a(true, false);
            var3 = (cia) ((Object) this.field_j.b((byte) 90));
            while (var3 != null) {
                var3.b(!param0 ? true : false);
                var3 = (cia) ((Object) this.field_j.c(0));
            }
            var4 = vr.field_b & 127;
            if ((var4 ^ -1) < -33) {
                return !this.field_j.e(12917) ? true : false;
            }
            if (0 != (var4 & 15)) {
                return !this.field_j.e(12917) ? true : false;
            }
            this.e((byte) -104);
            return !this.field_j.e(12917) ? true : false;
        }
        var3 = (cia) ((Object) this.field_j.b((byte) 90));
        while (var3 != null) {
            var3.b(!param0 ? true : false);
            var3 = (cia) ((Object) this.field_j.c(0));
        }
        var4 = vr.field_b & 127;
        if ((var4 ^ -1) >= -33 && 0 == (var4 & 15)) {
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
        int var2;
        int var3;
        cia var4;
        var2 = kla.a(256, vd.field_z, -2147483648);
        if (param0 >= -80) {
          return;
        } else {
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
        cia var4;
        int var5;
        int var6;
        int var7;
        int var8;
        var8 = BachelorFridge.field_y;
        param0 -= 80;
        param2 += 12;
        var4 = (cia) ((Object) this.field_j.b((byte) 90));
        L0: while (true) {
          if (var4 == null) {
            if (param1 <= 7) {
              this.e((byte) -11);
              return;
            } else {
              return;
            }
          } else {
            var5 = 256 - (var4.field_o << -874929823);
            var6 = this.field_l.field_n * var5 >> -98916472;
            var7 = var5 * this.field_l.field_o >> 426797736;
            this.field_l.c((var4.field_i >> 1919389572) + param2 + -(var6 >> 1776320513), (var4.field_h >> -2105555191) + param0 - (-(var4.field_q >> 499640261) - -(var7 >> -1618465951)), var6, var7, var4.field_o);
            var4 = (cia) ((Object) this.field_j.c(0));
            continue L0;
          }
        }
    }

    static {
    }
}
