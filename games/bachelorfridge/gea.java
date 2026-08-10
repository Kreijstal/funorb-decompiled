/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gea extends bw {
    int field_h;
    static String field_f;
    static String field_g;
    int field_o;
    int field_j;
    static String field_l;
    int field_m;
    int field_k;
    int field_i;
    static String field_n;

    final static void a(int param0) {
        int var1_int = 0;
        double var2 = 0.0;
        int var4 = BachelorFridge.field_y;
        try {
            if (param0 != 4231) {
                field_f = (String) null;
            }
            if (null == baa.field_z || am.field_R == null) {
                baa.field_z = new int[256];
                am.field_R = new int[256];
                for (var1_int = 0; 256 > var1_int; var1_int++) {
                    var2 = 6.283185307179586 * ((double)var1_int / 255.0);
                    baa.field_z[var1_int] = (int)(Math.sin(var2) * 4096.0);
                    am.field_R[var1_int] = (int)(4096.0 * Math.cos(var2));
                }
            }
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "gea.B(" + param0 + ')');
        }
    }

    public static void b(int param0) {
        field_l = null;
        if (param0 != 4096) {
          field_g = (String) null;
          field_n = null;
          field_f = null;
          field_g = null;
          return;
        } else {
          field_n = null;
          field_f = null;
          field_g = null;
          return;
        }
    }

    private gea() throws Throwable {
        throw new Error();
    }

    static {
        field_f = "Quick Chat lobby";
        field_g = "No players";
        field_l = "Blocks impede your progress, the creature will have to go around instead.";
        field_n = "This move is on cooldown.";
    }
}
