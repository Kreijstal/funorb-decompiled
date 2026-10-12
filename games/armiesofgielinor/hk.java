/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hk extends je {
    static String field_Ib;
    static int[] field_Jb;
    private je field_Kb;

    final boolean a(byte param0, boolean param1) {
        if (param0 != 102) {
          hk.k(-40);
          this.a(true, true);
          if (DeployEvent.field_A == 0) {
            return this.field_Kb.field_yb != 0 ? true : false;
          }
          if (this.field_yb != 0) {
            return this.field_Kb.field_yb != 0 ? true : false;
          }
          return true;
        }
        this.a(true, true);
        if (DeployEvent.field_A != 0) {
          if (this.field_yb == 0) {
            return true;
          }
          return this.field_Kb.field_yb != 0 ? true : false;
        }
        if (this.field_Kb.field_yb == 0) {
          return false;
        }
        return true;
    }

    final static void k(int param0) {
        te var1 = null;
        int var2 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        te var1Lifetime1;
        try {
          l.field_a.d();
          TextCursor.field_e.d();
          DelayedPacket.field_p = DelayedPacket.field_p - 1;
          if (param0 != 128) {
            hk.k(94);
          }
          if (DelayedPacket.field_p == 0) {
            DelayedPacket.field_p = 200;
            var1 = (te) (bl.field_h.first((byte) 118));
            while (var1 != null) {
              if (!var1.field_k.c(param0 ^ 65408)) {
                var1.unlink(param0 ^ 247);
              }
              var1 = (te) (bl.field_h.next((byte) 123));
            }
            if (null != ts.field_e) {
              var1Lifetime1 = (te) (ts.field_e.first((byte) 120));
              while (var1Lifetime1 != null) {
                if (!var1Lifetime1.field_k.c(65280)) {
                  var1Lifetime1.unlink(-126);
                }
                var1Lifetime1 = (te) (ts.field_e.next((byte) 123));
              }
            }
          }
          if (au.field_Kb != null &&
            !au.field_Kb.g(param0 + 11771)) {
            MapLayout.field_u = null;
            return;
          }
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "hk.A(" + param0 + ')');
        }
    }

    public static void l(int param0) {
        if (param0 >= -103) {
          return;
        }
        field_Jb = null;
        field_Ib = null;
    }

    hk(je param0, je param1, je param2, je param3, je param4, je param5) {
        int var12 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        je var8 = null;
        je var9 = null;
        int var10 = 0;
        int var11 = 0;
        je var13 = null;
        je var14 = null;
        int var15 = 0;
        je var17 = null;
        int var10Lifetime1;
        try {
          var17 = new je(0L, param1, GameEvent.field_x.toUpperCase());
          var17.field_Eb = 1;
          this.field_Kb = new je(0L, param2);
          var8 = new je(0L, param3);
          var9 = new je(0L, param3, co.field_j);
          var9.field_Eb = 1;
          var10 = 50;
          var11 = 0;
          for (var12 = 0; AiUnitPlanner.field_z.length > var12; var12++) {
            var13 = new je(0L, param3, bt.field_c[var12]);
            var14 = new je(0L, param3, AiUnitPlanner.field_z[var12]);
            var15 = param3.field_Z.a(AiUnitPlanner.field_z[var12]);
            if (var11 < var15) {
              var11 = var15;
            }
            var13.a(15, -20500, 65, var10, 20);
            var14.a(15, -20500, 640, var10, 90);
            var8.a(var13, 124);
            var8.a(var14, 122);
            var10 += 30;
          }
          var10 += 15;
          var17.a(24, -20500, var11 + 110, 0, 0);
          this.a(var10 + var17.field_ob, -20500, var17.field_gb, 100, 100);
          this.field_Kb.a(15, -20500, 15, 5, -20 + var17.field_gb);
          var8.a(-var17.field_ob + this.field_ob, -20500, this.field_gb, var17.field_ob, 0);
          var9.a(15, -20500, this.field_gb, 20, 0);
          var8.field_G = tq.a(11579568, false, var8.field_ob, 2105376, 3, 8421504);
          var17.a(this.field_Kb, 64);
          var8.a(var9, 111);
          this.a(var17, 98);
          this.a(var8, 42);
          this.field_S = -(this.field_gb >> 1) + 320;
          var10Lifetime1 = 240 - (this.field_ob >> 1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_10_0 = var7;
          stackIn_10_1 = new StringBuilder().append("hk.<init>(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param4 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param5 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    static {
        field_Ib = "Email address is unavailable";
        field_Jb = new int[]{128, 128, 128, 128, 64, 128, 128, 128, 128, 128, 128, 128, 128, 128, 128, 128, 128, 128, 128, 128, 128, 128, 128, 128, 64, 128, 128, 128, 128, 128, 128, 128, 128, 128, 128, 96, 128, 96, 128, 96, 96, 128, 96, 128, 128, 256, 128, 128, 128, 128, 128, 128, 128, 128, 96, 96, 96, 128, 96, 96, 128, 96, 64, 64, 160, 128, 96, 128, 128, 128, 128, 128, 128, 96, 64, 64, 64, 128, 0, 0, 0, 64, 128, 128, 128, 128, 128, 128, 96, 128};
    }
}
