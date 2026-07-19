/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vb extends vo {
    private int field_k;
    private int field_m;
    static int[] field_h;
    static java.lang.reflect.Constructor field_g;
    static vr field_j;
    static java.lang.reflect.Method field_n;
    private int field_i;
    private int field_l;

    vb(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        super(param4, param5, param6);
        this.field_k = param1;
        this.field_l = param3;
        this.field_m = param0;
        this.field_i = param2;
    }

    final void b(int param0, int param1, int param2) {
        int var4 = 106 % ((14 - param1) / 62);
        int var5 = this.field_m * param0 >> -1004629652;
        int var6 = param0 * this.field_i >> 1652359596;
        int var7 = param2 * this.field_k >> 2062121068;
        int var8 = param2 * this.field_l >> 2102880428;
        gb.a(0, var6, this.field_a, var7, var5, var8);
    }

    public static void a(int param0) {
        field_h = null;
        field_n = null;
        field_g = null;
        if (param0 >= -125) {
            field_g = (java.lang.reflect.Constructor) null;
            field_j = null;
            return;
        }
        field_j = null;
    }

    final void a(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (param0 > -70) {
          return;
        } else {
          var4 = param2 * this.field_m >> -299736980;
          var5 = this.field_i * param2 >> 1724174508;
          var6 = param1 * this.field_k >> -1452163828;
          var7 = param1 * this.field_l >> -1427848116;
          jka.a(var5, var4, this.field_e, this.field_a, var7, (byte) 88, var6, this.field_f);
          return;
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var4 = param0 * this.field_m >> 1804630796;
        var5 = this.field_i * param0 >> 328140012;
        var6 = this.field_k * param2 >> -352612180;
        if (param1 != -25222) {
          return;
        } else {
          var7 = this.field_l * param2 >> -57420724;
          wt.a(var5, 1, this.field_e, var6, var7, var4, this.field_f);
          return;
        }
    }

    static {
        $cfr$clinit: {
            ClassNotFoundException var0 = null;
            NoSuchMethodException var0_ref = null;
            Class var0_ref2 = null;
            Class[] var1 = null;
            Class var2 = null;
            Throwable decompiledCaughtException = null;
            field_h = new int[24];
            try {
              L0: {
                var2 = Class.forName("java.lang.ref.SoftReference");
                var0_ref2 = var2;
                field_g = var2.getConstructor(new Class[]{Object.class});
                var1 = (Class[]) null;
                field_n = var0_ref2.getMethod("get", (Class[]) null);
                break L0;
              }
            } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var0 = (ClassNotFoundException) (Object) decompiledCaughtException;
              field_g = null;
              break $cfr$clinit;
            } catch (java.lang.NoSuchMethodException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var0_ref = (NoSuchMethodException) (Object) decompiledCaughtException;
              field_g = null;
              break $cfr$clinit;
            }
        }
    }
}
