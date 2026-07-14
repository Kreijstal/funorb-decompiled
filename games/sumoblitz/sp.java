/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class sp extends pk implements ug {
    static qr field_z;
    static int[] field_x;
    jn field_y;

    private final void a(StringBuilder param0, byte param1, Hashtable param2, int param3) {
        int var7 = 0;
        int var8 = Sumoblitz.field_L ? 1 : 0;
        cb var10 = new cb(((sp) this).field_y);
        pk var6 = (pk) (Object) var10.b((byte) -80);
        if (param1 >= -30) {
            Object var9 = null;
            boolean discarded$0 = ((sp) this).a((pk) null, (byte) -17);
        }
        while (var6 != null) {
            StringBuilder discarded$1 = param0.append(10);
            for (var7 = 0; var7 <= param3; var7++) {
                StringBuilder discarded$2 = param0.append(32);
            }
            StringBuilder discarded$3 = var6.a(param3 - -1, param2, param0, 0);
            var6 = (pk) (Object) var10.b(0);
        }
    }

    sp(int param0, int param1, int param2, int param3, mh param4) {
        super(param0, param1, param2, param3, param4, (qm) null);
        ((sp) this).field_y = new jn();
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, pk param5, int param6) {
        int var10 = Sumoblitz.field_L ? 1 : 0;
        cb var8 = new cb(((sp) this).field_y);
        if (param2 != -1) {
            return true;
        }
        pk var9 = (pk) (Object) var8.b((byte) -80);
        while (var9 != null) {
            // ifeq L97
            if (var9.d(-1)) {
                if (var9.a(param0, param1, -1, param3, param4, param5, param6)) {
                    return true;
                }
            }
            var9 = (pk) (Object) var8.b(param2 ^ -1);
        }
        return false;
    }

    final boolean a(byte param0, pk param1) {
        cb var5 = null;
        pk var6 = null;
        int var7 = Sumoblitz.field_L ? 1 : 0;
        if (((sp) this).field_y.a((byte) -86)) {
            return false;
        }
        cb var3 = new cb(((sp) this).field_y);
        pk var4_ref_pk = (pk) (Object) var3.a((byte) -58);
        while (var4_ref_pk != null) {
            if (!(!var4_ref_pk.d(-1))) {
                var5 = new cb(((sp) this).field_y);
                ms discarded$0 = var5.a((byte) -70, (ms) (Object) var4_ref_pk);
                var6 = (pk) (Object) var5.c((byte) 87);
                while (var6 != null) {
                    if (!(!var6.a(param1, (byte) 61))) {
                        return true;
                    }
                    var6 = (pk) (Object) var5.c((byte) 87);
                }
            }
            var4_ref_pk = (pk) (Object) var3.c((byte) 87);
        }
        int var4 = 39 % ((param0 - 84) / 34);
        return false;
    }

    final boolean a(pk param0, boolean param1) {
        cb var5 = null;
        pk var6 = null;
        int var7 = Sumoblitz.field_L ? 1 : 0;
        if (((sp) this).field_y.a((byte) -87)) {
            return false;
        }
        cb var3 = new cb(((sp) this).field_y);
        pk var4 = (pk) (Object) var3.b((byte) -80);
        while (var4 != null) {
            if (!(!var4.d(-1))) {
                var5 = new cb(((sp) this).field_y);
                ms discarded$0 = var5.a(14, (ms) (Object) var4);
                var6 = (pk) (Object) var5.b(0);
                while (var6 != null) {
                    if (!(!var6.a(param0, (byte) 61))) {
                        return true;
                    }
                    var6 = (pk) (Object) var5.b(0);
                }
            }
            var4 = (pk) (Object) var3.b(0);
        }
        if (param1) {
            return false;
        }
        return false;
    }

    final StringBuilder a(int param0, Hashtable param1, StringBuilder param2, int param3) {
        if (!(!((sp) this).a(param0, param1, -22, param2))) {
            ((sp) this).a(param0, (byte) -128, param2, param1);
            this.a(param2, (byte) -57, param1, param0);
        }
        if (param3 != 0) {
            ((sp) this).field_y = null;
        }
        return param2;
    }

    String c(int param0) {
        cb var2 = null;
        pk var3 = null;
        String var4 = null;
        int var5 = 0;
        Object var6 = null;
        L0: {
          var5 = Sumoblitz.field_L ? 1 : 0;
          if (param0 == -6696) {
            break L0;
          } else {
            var6 = null;
            boolean discarded$2 = ((sp) this).a((pk) null, (byte) 2);
            break L0;
          }
        }
        var2 = new cb(((sp) this).field_y);
        var3 = (pk) (Object) var2.b((byte) -80);
        L1: while (true) {
          if (var3 != null) {
            var4 = var3.c(-6696);
            if (var4 == null) {
              var3 = (pk) (Object) var2.b(0);
              continue L1;
            } else {
              return var4;
            }
          } else {
            return null;
          }
        }
    }

    void a(int param0, int param1, byte param2, int param3) {
        int var7 = Sumoblitz.field_L ? 1 : 0;
        if (-1 == (param3 ^ -1)) {
            if (!(null == ((sp) this).field_w)) {
                ((sp) this).field_w.a((pk) this, param1, 5592405, true, param0);
            }
        }
        cb var5 = new cb(((sp) this).field_y);
        if (param2 >= -35) {
            field_x = null;
        }
        pk var6 = (pk) (Object) var5.a((byte) -83);
        while (var6 != null) {
            var6.a(((sp) this).field_r + param0, ((sp) this).field_v + param1, (byte) -62, param3);
            var6 = (pk) (Object) var5.c((byte) 87);
        }
    }

    final int e(int param0) {
        int var6 = 0;
        int var7 = Sumoblitz.field_L ? 1 : 0;
        int var2 = 0;
        cb var3 = new cb(((sp) this).field_y);
        int var4 = 51 % ((param0 - -10) / 46);
        pk var5 = (pk) (Object) var3.b((byte) -80);
        while (var5 != null) {
            var6 = var5.e(-99);
            if (!(var6 <= var2)) {
                var2 = var6;
            }
            var5 = (pk) (Object) var3.b(0);
        }
        return var2;
    }

    boolean a(pk param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var10 = Sumoblitz.field_L ? 1 : 0;
        cb var8 = new cb(((sp) this).field_y);
        pk var9 = (pk) (Object) var8.b((byte) -80);
        while (var9 != null) {
            // ifeq L91
            if (var9.a(param0, -79, param2, param3, param4 + ((sp) this).field_r, param5, param6 - -((sp) this).field_v)) {
                return true;
            }
            var9 = (pk) (Object) var8.b(0);
        }
        if (param1 >= -42) {
            field_z = null;
            return false;
        }
        return false;
    }

    public static void d(boolean param0) {
        if (!param0) {
            field_x = null;
        }
        field_z = null;
        field_x = null;
    }

    private final void a(int param0) {
        int var4 = Sumoblitz.field_L ? 1 : 0;
        if (param0 != -29587) {
            field_x = null;
        }
        cb var2 = new cb(((sp) this).field_y);
        pk var3 = (pk) (Object) var2.b((byte) -80);
        while (var3 != null) {
            var3.c(false);
            var3 = (pk) (Object) var2.b(param0 + 29587);
        }
    }

    pk f(int param0) {
        int var4 = Sumoblitz.field_L ? 1 : 0;
        cb var2 = new cb(((sp) this).field_y);
        pk var3_ref_pk = (pk) (Object) var2.b((byte) -80);
        while (var3_ref_pk != null) {
            if (!(!var3_ref_pk.d(-1))) {
                return var3_ref_pk;
            }
            var3_ref_pk = (pk) (Object) var2.b(0);
        }
        int var3 = -6 / ((param0 - -25) / 58);
        return null;
    }

    final void a(pk param0, int param1) {
        ((sp) this).field_y.a((ms) (Object) param0, (byte) 39);
        if (param1 <= 59) {
            field_x = null;
        }
    }

    void c(byte param0) {
        int var4 = Sumoblitz.field_L ? 1 : 0;
        cb var2 = new cb(((sp) this).field_y);
        pk var5 = (pk) (Object) var2.b((byte) -80);
        while (var5 != null) {
            var5.c((byte) 127);
            var5 = (pk) (Object) var2.b(0);
        }
        int var3 = -115 % ((param0 - 64) / 51);
    }

    boolean a(pk param0, byte param1) {
        int var5 = Sumoblitz.field_L ? 1 : 0;
        cb var3 = new cb(((sp) this).field_y);
        pk var4 = (pk) (Object) var3.b((byte) -80);
        if (param1 != 61) {
            Object var6 = null;
            ((sp) this).a(27, -11, (pk) null, -73);
        }
        while (var4 != null) {
            if (!(!var4.a(param0, (byte) 61))) {
                return true;
            }
            var4 = (pk) (Object) var3.b(0);
        }
        return false;
    }

    void a(int param0, int param1, pk param2, int param3) {
        int var8 = Sumoblitz.field_L ? 1 : 0;
        int var5 = -16 % ((-25 - param1) / 45);
        super.a(param0, 105, param2, param3);
        cb var6 = new cb(((sp) this).field_y);
        pk var7 = (pk) (Object) var6.b((byte) -80);
        while (var7 != null) {
            // ifeq L102
            var7.a(((sp) this).field_r + param0, -88, param2, param3 - -((sp) this).field_v);
            var7 = (pk) (Object) var6.b(0);
        }
    }

    boolean d(int param0) {
        if (param0 != -1) {
            field_z = null;
        }
        return null != ((sp) this).f(55) ? true : false;
    }

    void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = -30 / ((28 - param0) / 63);
        super.a(94, param1, param2, param3, param4);
        this.a(-29587);
    }

    final void a(pk param0, boolean param1, int param2, int param3, int param4, int param5) {
        int var9 = Sumoblitz.field_L ? 1 : 0;
        if (param1) {
            return;
        }
        cb var7 = new cb(((sp) this).field_y);
        pk var8 = (pk) (Object) var7.b((byte) -80);
        while (var8 != null) {
            // ifeq L87
            var8.a(param0, false, param2 + ((sp) this).field_r, param3, param4, ((sp) this).field_v + param5);
            var8 = (pk) (Object) var7.b(0);
        }
    }

    boolean a(pk param0, char param1, byte param2, int param3) {
        int var7 = Sumoblitz.field_L ? 1 : 0;
        cb var8 = new cb(((sp) this).field_y);
        pk var9 = (pk) (Object) var8.b((byte) -80);
        if (param2 <= 9) {
            field_x = null;
        }
        while (var9 != null) {
            // ifeq L102
            if (var9.d(-1)) {
                if (!(!var9.a(param0, param1, (byte) 67, param3))) {
                    return true;
                }
            }
            var9 = (pk) (Object) var8.b(0);
        }
        int var6 = param3;
        if (-81 == (var6 ^ -1)) {
            return hw.field_b[81] ? ((sp) this).a((byte) -5, param0) : ((sp) this).a(param0, false);
        }
        return false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = new int[]{0, 4, 6, 8, 12, 16, 18, 20, 24};
        field_z = new qr();
    }
}
