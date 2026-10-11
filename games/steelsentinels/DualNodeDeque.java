/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DualNodeDeque {
    private DualNode field_d;
    static String field_b;
    static int[] field_c;
    static hm field_a;
    private DualNode field_e;
    static rm field_f;

    final DualNode a(boolean param0) {
        DualNode var2 = this.field_e;
        if (this.field_d == var2) {
          this.field_e = null;
          return null;
        }
        this.field_e = var2.dualNext;
        if (!param0) {
          return var2;
        }
        DualNodeDeque.b((byte) 121);
        return var2;
    }

    final DualNode b(int param0) {
        DualNode var2 = this.field_d.dualNext;
        if (param0 != 22) {
          this.b(118);
          if (var2 == this.field_d) {
            this.field_e = null;
            return null;
          }
          this.field_e = var2.dualNext;
          return var2;
        }
        if (var2 == this.field_d) {
          this.field_e = null;
          return null;
        }
        this.field_e = var2.dualNext;
        return var2;
    }

    final void a(int param0) {
        DualNode var2 = null;
        int var3 = SteelSentinels.obfuscationControl;
        while (true) {
          var2 = this.field_d.dualNext;
          if (var2 == this.field_d) {
            break;
          }
          var2.unlinkDual(480);
        }
        if (param0 == 8150) {
          this.field_e = null;
          return;
        }
        this.a((byte) -114);
        this.field_e = null;
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4) {
        int var7 = 0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = SteelSentinels.obfuscationControl;
        try {
          SoftwareRaster.g(param3, param0, 1 + param1, 10000536);
          SoftwareRaster.g(param3, param2 + param0, 1 + param1, 12105912);
          var5_int = 1;
          if (SoftwareRaster.field_l > param0 + var5_int) {
            var5_int = SoftwareRaster.field_l - param0;
          }
          var6 = param2;
          if (SoftwareRaster.field_d < var6 + param0) {
            var6 = SoftwareRaster.field_d - param0;
          }
          for (var7 = var5_int; var6 > var7; var7++) {
            var8 = 152 + 48 * var7 / param2;
            var9 = var8 << 16 | var8 << 8 | var8;
            SoftwareRaster.field_g[SoftwareRaster.field_c * (param0 + var7) + param3] = var9;
            SoftwareRaster.field_g[param1 + (param3 + SoftwareRaster.field_c * (param0 + var7))] = var9;
          }
          if (param4 > 93) {
            return;
          }
          field_b = (String) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var5), "ra.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void b(byte param0) {
        field_a = null;
        int var1 = -107 % ((-33 - param0) / 46);
        field_b = null;
        field_f = null;
        field_c = null;
    }

    final DualNode c(int param0) {
        DualNode var2 = this.field_d.dualNext;
        int var3 = -86 % ((param0 + 32) / 35);
        if (var2 != this.field_d) {
          var2.unlinkDual(480);
          return var2;
        }
        return null;
    }

    final static void a(int param0, int param1, BitmapFont param2, int param3, int param4, byte param5, String param6, int param7) {
        RgbSprite[] var8 = null;
        RuntimeException var8_ref = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8 = pl.field_T;
          jm.a(param1, param7, var8, 1, param3, param4);
          if (param6 != null) {
            param2.a(param6, param4 / 2 + param3, param2.field_U / 2 + param7 / 2 + param1, param0, -1);
          }
          if (param5 == 68) {
            return;
          }
          field_b = (String) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_8_0 = var8_ref;
          stackIn_8_1 = new StringBuilder().append("ra.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param7).append(')').toString());
        }
    }

    final void a(byte param0, DualNode param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != param1.dualPrevious) {
            param1.unlinkDual(480);
          }
          param1.dualNext = this.field_d;
          param1.dualPrevious = this.field_d.dualPrevious;
          param1.dualPrevious.dualNext = param1;
          param1.dualNext.dualPrevious = param1;
          if (param0 > 34) {
            return;
          }
          this.field_e = (DualNode) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("ra.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final int a(byte param0) {
        int var4 = SteelSentinels.obfuscationControl;
        int var2 = 0;
        DualNode var3 = this.field_d.dualNext;
        if (param0 >= -81) {
          this.a(false);
          while (this.field_d != var3) {
            var3 = var3.dualNext;
            var2++;
          }
          return var2;
        }
        while (this.field_d != var3) {
          var3 = var3.dualNext;
          var2++;
        }
        return var2;
    }

    public DualNodeDeque() {
        this.field_d = new DualNode();
        this.field_d.dualPrevious = this.field_d;
        this.field_d.dualNext = this.field_d;
    }

    static {
        field_b = "You have completed the training missions. Log in or create a free account to play multiplayer games or to begin the single player campaign.";
        field_c = new int[]{0, 1, 28, 5, 35, 4, 3, 22, 19};
        field_a = new hm();
        field_f = new rm(1);
    }
}
