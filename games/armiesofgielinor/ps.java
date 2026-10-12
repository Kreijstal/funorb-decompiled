/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ps extends lk {
    static ResourceArchive field_u;
    static int field_E;
    static RgbSprite[] field_w;
    static String field_x;
    private IndexedSprite[] field_B;
    static int[] field_D;
    static pf field_y;
    static String field_A;
    static boolean field_v;
    static String field_z;
    static int[] field_C;

    final static va b(byte param0) {
        int var1 = 0;
        int var2_int = 0;
        va var3 = null;
        int var4 = 0;
        va stackIn_4_0 = null;
        Throwable decompiledCaughtException = null;
        IllegalArgumentException var2 = null;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        var1 = 55 / ((param0 - 21) / 34);
        try {
          var2_int = 0;
          while (true) {
            var3 = mp.field_Sb.a(var2_int, true);
            if (!var3.field_H) {
              var2_int++;
              continue;
            }
            break;
          }
          stackIn_4_0 = var3;
          return stackIn_4_0;
        } catch (java.lang.IllegalArgumentException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (IllegalArgumentException) (Object) decompiledCaughtException;
          return null;
        }
    }

    public static void c(boolean param0) {
        field_y = null;
        field_w = null;
        field_A = null;
        if (!param0) {
          field_x = null;
          field_z = null;
          field_u = null;
          field_C = null;
          field_D = null;
          return;
        }
        ps.a(-117, false);
        field_x = null;
        field_z = null;
        field_u = null;
        field_C = null;
        field_D = null;
    }

    public final void a(kb param0, int param1, int param2, boolean param3, int param4) {
        int stackIn_8_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        IndexedSprite var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        try {
          SoftwareRaster.b(param0.field_B + param1, param4 + param0.field_p, param0.field_l, param0.field_w, 10197915);
          if (param2 > -79) {
            field_A = (String) null;
          }
          if (param3) {
            stackIn_8_0 = (((fw) (param0)).field_K) ? 1 : 0;
          } else {
            stackIn_8_0 = 0;
          }
          var6_int = stackIn_8_0;
          if (param3) {
            stackIn_14_0 = (param0.a(false)) ? 1 : 0;
          } else {
            stackIn_14_0 = 0;
          }
          var7 = stackIn_14_0;
          var8 = 0;
          if (var7 != 0) {
            var8 = var8 | 2;
          }
          stackIn_19_0 = (var6_int == 0) ? 16777215 : 2394342;
          var9 = stackIn_19_0;
          if (var6_int != 0) {
            var8 = var8 | 1;
          }
          var10 = this.field_B[var8];
          var11 = param1 + param0.field_B + (-var10.pixelWidth + param0.field_l) / 2;
          var12 = (-var10.pixelHeight + param0.field_w) / 2 + param4 + param0.field_p;
          var13 = param0.field_B + (param1 + param0.field_l / 2);
          var10.draw(var11, var12);
          this.field_q.c(this.d(0, param0), var13, param4, var9, -1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_26_0 = var6;
          stackIn_26_1 = new StringBuilder().append("ps.C(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(int param0, boolean param1) {
        int var2 = 0;
        int var3 = 0;
        sh.field_l = param0;
        if (TurnTimerDial.field_d != mj.field_c) {
          var2 = mj.field_c * mj.field_c;
          var3 = var2 - TurnTimerDial.field_d * TurnTimerDial.field_d;
          param0 = param0 + var3 * (EquipmentBattleTutorial.field_y - param0) / var2;
        }
        CombatEvent.field_I.a(120, -20500, 640, param0, va.field_u);
        PlayerProfile.a(-1, mi.field_l, 0, io.field_n, 5, EquipmentBattleTutorial.field_y - 24, 640);
        if (param1) {
          return;
        }
        field_z = (String) null;
    }

    final static void a(int param0, ResourceArchive param1, ResourceArchive param2) {
        try {
          if (param0 < 30) {
            ps.c(false);
          }
          iw.field_p = param2;
          bh.field_H = param1;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "ps.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    ps(IndexedSprite[] param0) {
        try {
          this.field_B = param0;
          this.field_q = ArmiesOfGielinor.field_J;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "ps.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_w = new RgbSprite[3];
        field_D = new int[]{100, 100, 200, 100, 100, 100, 200, 200, 200, 200, 300, 200, 200, 200, 300, 500, 100, 100, 100, 200, 300, 300, 100, 100, 100, 100, 100, 100, 100, 100, 200, 200, 200, 200, 200, 200, 200, 200, 200, 300, 500, 300, 300, 500, 200, 300, 500, 300, 300, 500, 200, 300, 500, 200, 300, 500};
        field_E = 250;
        field_x = "This ground produces no Mana";
        field_y = new pf("usename");
        field_A = "You are on <%0>";
        field_z = "Click or press F10 to open Quick Chat";
        field_C = new int[]{2, 2, 2, 2, 2};
    }
}
