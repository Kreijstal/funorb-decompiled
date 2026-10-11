/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uc {
    static gh field_j;
    static int[] field_c;
    static int[][] field_e;
    static int[] field_k;
    static int[] field_f;
    static cn field_i;
    static int field_l;
    static int field_a;
    static int[] field_d;
    static boolean field_g;
    static String[][] field_h;
    static int[] field_b;

    public static void a(boolean param0) {
        field_h = (String[][]) null;
        field_j = null;
        field_d = null;
        field_i = null;
        field_k = null;
        field_b = null;
        field_c = null;
        if (param0) {
          return;
        }
        field_e = (int[][]) null;
        field_f = null;
    }

    final static void a(boolean param0, int param1) {
        int var3 = 0;
        tc var4 = null;
        kf var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = SteelSentinels.field_G;
        try {
          if (!param0) {
            uc.a(-115, 79);
          }
          var4 = (tc) (ic.field_B.e(13058));
          while (var4 != null) {
            vh.a(param1, var4, (byte) 107);
            var4 = (tc) (ic.field_B.a((byte) -53));
          }
          var5 = (kf) (je.field_w.e(13058));
          while (var5 != null) {
            ma.a(param1, var5, -2864);
            var5 = (kf) (je.field_w.a((byte) -40));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "uc.B(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(wk[] param0, int param1, int param2, byte param3, int param4) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = SteelSentinels.field_G;
        try {
          if (param0 != null &&
            param1 > 0) {
            var5_int = param0[0].field_z;
            var6 = param0[2].field_z;
            var7 = param0[1].field_z;
            param0[0].a(param4, param2);
            param0[2].a(param1 + (param4 - var6), param2);
            pb.b(aj.field_v);
            pb.h(param4 + var5_int, param2, param4 + param1 - var6, param0[1].field_B + param2);
            var8 = var5_int + param4;
            var9 = param4 + param1 - var6;
            param4 = var8;
            if (param3 != -39) {
              return;
            }
            while (param4 < var9) {
              param0[1].a(param4, param2);
              param4 = param4 + var7;
            }
            pb.a(aj.field_v);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_13_0 = runtimeException;
          stackIn_13_1 = new StringBuilder().append("uc.D(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static boolean a(int param0, int param1) {
        int var3 = 0;
        int[] var2 = null;
        RuntimeException var2_ref = null;
        int var4 = 0;
        int var5 = 0;
        wk[] var6 = null;
        int[] var7 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = SteelSentinels.field_G;
        try {
          if (!nk.f((byte) -125) &&
            oc.a(param0, -105, true)) {
            return false;
          }
          if (t.a(fe.field_D, param0, -20370)) {
            return true;
          }
          var7 = dn.field_bc;
          var2 = var7;
          if (param1 != -3958) {
            var6 = (wk[]) null;
            uc.a((wk[]) null, 91, -31, (byte) -121, -77);
          }
          for (var3 = 0; var3 < var7.length; var3++) {
            var4 = var7[var3];
            if (var4 == param0) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2_ref), "uc.A(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        field_e = new int[23][];
        field_c = new int[23];
        field_k = new int[23];
        field_d = new int[23];
        field_f = new int[23];
        km.a((byte) -44, 460, new int[]{0, 1, 28, 5, 35, 4, 22, 19, 34}, 180, 30, 160, 0);
        km.a((byte) -44, 460, new int[]{2, 20, 21, 37, 45, 5, 9}, 180, 30, 200, 1);
        km.a((byte) -44, 460, new int[]{2, 20, 21, 37, 45, 5, 11, 13}, 180, 30, 200, 2);
        km.a((byte) -44, 460, new int[]{2, 20, 21, 37, 45, 5, 12, 13}, 180, 30, 200, 3);
        km.a((byte) -44, 460, new int[]{2, 20, 21, 37, 45, 5, 13}, 180, 30, 200, 4);
        km.a((byte) -44, 460, new int[]{22, 4, 23, 8}, 180, 30, 406, 5);
        km.a((byte) -44, 460, new int[]{22, -1, 23, 8}, 180, 30, 406, 6);
        km.a((byte) -44, 0, new int[]{-1, -1, -1, 8}, 0, 0, 0, 7);
        km.a((byte) -44, 460, new int[]{4, -1, 23, 8}, 180, 30, 406, 8);
        km.a((byte) -44, 460, new int[]{4, -1, 23, 8}, 180, 30, 406, 9);
        km.a((byte) -44, 460, new int[]{23, 24}, 180, 30, 400, 10);
        km.a((byte) -44, 460, new int[]{7}, 290, 30, 400, 11);
        km.a((byte) -44, 460, new int[]{}, 180, 30, 200, 12);
        km.a((byte) -44, 0, new int[]{23, 28, -1, 7}, 0, 0, 0, 13);
        km.a((byte) -44, 0, new int[]{23, 33, 46, 7}, 0, 0, 0, 14);
        km.a((byte) -44, 460, new int[]{29, 30, 31, 32, 33, 7}, 180, 30, 400, 15);
        km.a((byte) -44, 460, new int[]{7}, 180, 30, 400, 16);
        km.a((byte) -44, 460, new int[]{20, 21, 6, 37, 41, 42, 43, 44, 47, -1, -1, -1, 8}, 180, 30, 140, 17);
        km.a((byte) -44, 0, new int[]{}, 0, 0, 0, 18);
        km.a((byte) -44, 0, new int[]{38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, -1, -1, 23, 7}, 0, 30, 0, 19);
        km.a((byte) -44, 0, new int[]{25, 26, 39, -1, -1, 23, 7}, 0, 30, 0, 20);
        km.a((byte) -44, 460, new int[]{7}, 180, 30, 200, 21);
        km.a((byte) -44, 460, new int[]{41, 42, 43, 44, 47, 8}, 180, 30, 200, 22);
        field_h = new String[][]{new String[]{"Your sentinel must be a default Slave, Aquila or Golem to play in basic mode", "You need a default Slave, Aquila or Golem to play in basic mode", "<%0> needs a default Slave, Aquila or Golem to play in basic mode"}, new String[]{"Your sentinel has too high a tech value to compete in standard mode", "Your sentinel has too high a tech value to compete in standard mode", "<%0>'s sentinel has too high a tech value to compete in standard mode"}};
    }
}
