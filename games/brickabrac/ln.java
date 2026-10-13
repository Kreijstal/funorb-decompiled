/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ln extends IntrusiveNode {
    static boolean field_l;
    static RgbSprite[] field_j;
    int field_m;
    byte[] field_i;
    static boolean field_k;

    final static int a(LevelPack param0, int param1, boolean param2, int param3) {
        int var5 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var6 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = BrickABrac.field_J ? 1 : 0;
        try {
          var4_int = 0;
          if (!param2) {
            field_k = false;
          }
          for (var5 = param1; param3 > var5; var5++) {
            var4_int = var4_int | param0.metadata[var5].attributeWord;
          }
          stackIn_7_0 = var4_int;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("ln.E(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_j = null;
        int var1 = -16 % ((62 - param0) / 48);
    }

    final static void a(mf param0, wp param1, mf param2, mf param3, mf param4, int param5, mf param6) {
        int var7_int = 0;
        int var8 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        int var7_intLifetime1;
        var8 = BrickABrac.field_J ? 1 : 0;
        try {
          BrickABrac.field_I = param4;
          AchievementIcon.field_m = param3;
          if (param5 != -10) {
            field_j = (RgbSprite[]) null;
          }
          mh.field_lb = param2;
          l.field_m = param1;
          og.field_gc = param0;
          ji.field_a = param6;
          for (var7_int = 0; var7_int < 2; var7_int++) {
            ip.field_s.addLast(new pb(960, 480), (byte) 3);
          }
          for (var7_intLifetime1 = 0; var7_intLifetime1 < 2; var7_intLifetime1++) {
            cr.field_N.addLast(new pb(1280, 480), (byte) 3);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_12_0 = var7;
          stackIn_12_1 = new StringBuilder().append("ln.B(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param3 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param4 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    final static boolean a(int param0, int param1, mf param2, int param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        byte[] var5 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -87) {
            field_j = (RgbSprite[]) null;
          }
          var5 = param2.a(param1, param3, 4);
          var4 = var5;
          if (var5 == null) {
            return false;
          }
          eh.a(var5, false);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_10_0 = var4_ref;
          stackIn_10_1 = new StringBuilder().append("ln.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(')').toString());
        }
    }

    final static boolean a(int param0, int param1, int param2) {
        int var3 = null != nl.field_f ? 1 : 0;
        if (dc.currentKeyCode == 9 &&
          kb.a(kb.field_Zb, -3, ig.field_K, hb.field_z, r.field_x)) {
          if (r.field_x != 2 &&
            var3 != 0) {
            return false;
          }
          return th.a(hb.field_z, kb.field_Zb, r.field_x, false, ig.field_K);
        }
        if (10 == dc.currentKeyCode) {
          if (var3 != 0) {
            return false;
          }
          LevelPackLoader.a(4252);
          return true;
        }
        if (dc.currentKeyCode == param1) {
          if (!bo.field_l) {
            return false;
          }
          if (wd.field_z == 2 &&
            !LevelSelectScreen.a(MultiplayerExitScreen.field_E, ba.field_z, param1 ^ -106)) {
            return false;
          }
          if (wd.field_z != 2 &&
            var3 != 0) {
            return false;
          }
          if (cd.a(param1 - 138)) {
            String var4 = (String) null;
            c.a(ep.field_k, ba.field_z, (byte) -117, wd.field_z, param2, (String) null);
          }
          return true;
        }
        return false;
    }

    final static void a(int param0) {
        rj.field_c.b((byte) 126, new he());
        int var1 = 48 % ((param0 - 32) / 62);
    }

    private ln() throws Throwable {
        throw new Error();
    }

    static {
        field_l = false;
    }
}
