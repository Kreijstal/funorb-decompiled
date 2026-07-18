/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ur extends bd {
    private jd field_y;
    static wk[] field_w;
    static String field_x;
    private int field_t;
    static String field_u;
    static byte[] field_B;
    static tv field_v;
    private boolean field_A;
    static String field_C;
    static int field_z;
    private int field_s;

    final static co[] e() {
        co[] var1 = new co[5];
        co var3 = new co();
        var3.field_v = "foliage_green";
        var3.field_a = "terrain_plains";
        var3.field_q = "structures_green";
        var3.field_d = 0;
        var3.field_l = "principality";
        var3.field_i = new int[]{4495633, 8943462, 5592422, 30464, 7829503, 5596740, 5592541, 6710886, 6710886, 6710886, 8943462, 6710886, 11184810, 11184810, 6710886, 11184810};
        var3.field_x = "plains_openground.jpg";
        var3.field_o = new String[]{"runewars_atmospheric_countryside_river", "runewars_atmospheric_countryside_bird", "runewars_atmospheric_countryside_breeze"};
        var3.field_e = var3.field_v + "_shadows";
        var3.field_c = var3.field_q + "_shadows";
        int discarded$0 = -5841;
        aw.a(var3, var1);
        co var4 = new co();
        var4.field_d = 1;
        var4.field_a = "terrain_desert";
        var4.field_q = "structures_desert";
        var4.field_v = "foliage_desert";
        var4.field_x = "desert_openground.jpg";
        var4.field_c = var4.field_q + "_shadows";
        var4.field_e = var4.field_v + "_shadows";
        var4.field_o = new String[]{"runewars_atmospheric_desert_wind", "runewars_atmospheric_desert_vulture", "runewars_atmospheric_desert_vulture_2"};
        var4.field_l = "Tzhaar";
        var4.field_i = new int[]{13408580, 8943462, 7820612, 5609779, 7829503, 5596740, 5592541, 6710886, 6710886, 6710886, 8943462, 6710886, 11184810, 11184810, 6710886, 11184810};
        int discarded$1 = -5841;
        aw.a(var4, var1);
        co var5 = new co();
        var5.field_d = 2;
        var5.field_a = "terrain_ice";
        var5.field_v = "foliage_ice";
        var5.field_q = "structures_ice";
        var5.field_x = "winter_openground.jpg";
        var5.field_e = var5.field_v + "_shadows";
        var5.field_o = new String[]{"runewars_atmospheric_ice_wind", "runewars_atmospheric_ice_wind_2", "runewars_atmospheric_ice_wind_3"};
        var5.field_i = new int[]{14540287, 7833753, 5592422, 4495735, 7829503, 4482645, 5592541, 6710886, 6710886, 6710886, 7833753, 6710886, 11184810, 11184810, 6710886, 11184810};
        var5.field_l = "poles apart";
        var5.field_c = var5.field_q + "_shadows";
        int discarded$2 = -5841;
        aw.a(var5, var1);
        co var6 = new co();
        var6.field_a = "terrain_swamp";
        var6.field_v = "foliage_swamp";
        var6.field_x = "swamp_openground.jpg";
        var6.field_q = "structures_swamp";
        var6.field_d = 3;
        var6.field_i = new int[]{4741426, 4340530, 6381908, 5602610, 2703412, 3702888, 1844000, 6710886, 6710886, 6710886, 8943462, 6710886, 11184810, 11184810, 6710886, 11184810};
        var6.field_l = "dead quiet";
        var6.field_c = var6.field_q + "_shadows";
        var6.field_e = var6.field_v + "_shadows";
        var6.field_o = new String[]{"runewars_atmospheric_swamp_wind1", "runewars_atmospheric_swamp_wind2", "runewars_atmospheric_swamp_creature2", "runewars_atmospheric_swamp_creature3"};
        int discarded$3 = -5841;
        aw.a(var6, var1);
        co var7 = new co();
        var7.field_v = "foliage_burnt";
        var7.field_q = "structures_burnt";
        var7.field_a = "terrain_burnt";
        var7.field_x = "burnt_openground.jpg";
        var7.field_d = 4;
        var7.field_c = var7.field_q + "_shadows";
        var7.field_l = "dead quiet";
        var7.field_i = new int[]{4541241, 6965824, 2693658, 3026214, 4864561, 3422244, 15432192, 6710886, 6710886, 6710886, 8943462, 6710886, 11184810, 11184810, 6710886, 11184810};
        var7.field_o = new String[]{"runewars_atmospheric_burnt_wind1", "runewars_atmospheric_burnt_wind2", "runewars_atmospheric_burnt_lava_rumble_1", "runewars_atmospheric_burnt_lava_rumble_2"};
        var7.field_e = var7.field_v + "_shadows";
        int discarded$4 = -5841;
        aw.a(var7, var1);
        return var1;
    }

    final void a(int param0, ha param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              param1.field_l.a((byte) -119, (tc) (Object) new ec(((ur) this).field_y.field_J, ((ur) this).field_y.field_w, ((ur) this).field_s, ((ur) this).field_t, ((ur) this).field_A));
              if (param0 == 64) {
                break L1;
              } else {
                field_z = 2;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("ur.C(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    public static void a(boolean param0) {
        field_C = null;
        field_x = null;
        field_u = null;
        field_B = null;
        field_v = null;
        field_w = null;
    }

    ur(int param0, int param1, int param2, int param3, int param4, jd param5, boolean param6) {
        try {
            ((ur) this).field_A = param6 ? true : false;
            ((ur) this).field_t = param3;
            ((ur) this).field_y = param5;
            ((ur) this).field_m = param4;
            ((ur) this).field_s = param2;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "ur.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = "Tips";
        field_u = "Connecting to<br>friend server...";
        field_v = new tv();
        field_z = 0;
    }
}
