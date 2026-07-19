/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ri {
    static String field_c;
    static boolean field_f;
    static boolean[] field_b;
    static dl field_g;
    static String field_d;
    static int field_a;
    static String field_e;

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(int param0, int param1, int param2) {
        co.field_c = param2;
        wh.field_c = param2;
        o.field_r = param0;
        tn.field_Eb = param0;
        jm.field_j = true;
        ce.field_m = null;
        int[] var4 = (int[]) null;
        de.a((int[]) null, 0, 0);
        ce.field_m = se.a(param0, (java.awt.Component) ((Object) on.field_c), param2, (byte) -123);
        ce.field_m.a(true);
        ho.a((byte) 51, param2 / param1, param0 / 2);
        nl.b(param0, param1 ^ 19131, param2);
        lc.a(param2, param0, false);
        td.a(true, param2 / 2, param0 / 2);
    }

    final static int[] a(int param0, byte param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var3 = of.a(115, param2);
        var4 = j.a(param2, -107);
        var5 = of.a(-95, param0);
        if (param1 != 66) {
          ri.a((byte) -82);
          var6 = j.a(param0, -101);
          var7 = (int)((long)var5 * (long)var3 >> 1805538576);
          var8 = (int)((long)var3 * (long)var6 >> 390711056);
          var9 = (int)((long)var5 * (long)var4 >> -1809537904);
          var10 = (int)((long)var6 * (long)var4 >> -1485661872);
          return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
        } else {
          var6 = j.a(param0, -101);
          var7 = (int)((long)var5 * (long)var3 >> 1805538576);
          var8 = (int)((long)var3 * (long)var6 >> 390711056);
          var9 = (int)((long)var5 * (long)var4 >> -1809537904);
          var10 = (int)((long)var6 * (long)var4 >> -1485661872);
          return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
        }
    }

    final static boolean a(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        oj.field_h = true;
        tn.field_Hb = qj.b(-26572) - -15000L;
        if (param0 > -87) {
          L0: {
            ri.a(50, -118, -15);
            if ((fj.field_j ^ -1) != -12) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if ((fj.field_j ^ -1) != -12) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    public static void a(byte param0) {
        if (param0 < 49) {
            return;
        }
        field_d = null;
        field_e = null;
        field_g = null;
        field_c = null;
        field_b = null;
    }

    static {
        field_f = true;
        field_c = "Rated game";
        field_d = "Stone spells focus on the creation and destruction of terrain.";
        field_b = new boolean[112];
        field_e = "Honour";
    }
}
