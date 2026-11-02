/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class BodyCondition extends MissionCondition implements DiffableState, hd {
    private int bodyId;
    static String field_d;

    final static void b(int param0) {
        Particle.field_H = GetUseDetailLines.field_o;
        uia.field_b = GetTorpedoReload.field_q;
        qs.field_a = GetTorpedoReload.field_q;
        kc.field_b = GetUseDetailLines.field_o;
        if (param0 != -1) {
          BodyCondition.b(17);
        }
    }

    final int a(byte param0, int param1) {
        if (param0 >= -102) {
          return -25;
        }
        return this.bodyId;
    }

    final String a(int param0) {
        if (param0 == -1) {
          return "Body " + this.bodyId + " destroyed";
        }
        World var3 = (World) null;
        this.a(92, (MissionState) null, (World) null);
        return "Body " + this.bodyId + " destroyed";
    }

    public final void b(faa param0, int param1) {
        try {
          super.b(param0, -119);
          param0.a(-632, this.bodyId, 32);
          if (param1 > -109) {
            this.bodyId = -40;
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "cc.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(World param0, int param1, int param2, int param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        tv var10 = null;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var9 = VoidHunters.field_G;
        try {
          stackIn_4_0 = (param3 > this.bodyId) ? 1 : -1;
          var5_int = stackIn_4_0;
          if (param1 != -2) {
            var10 = (tv) null;
            this.a((byte) -97, (tv) null);
          }
          var6 = 50;
          var7 = var6 * var5_int + param3;
          var8 = param3;
          while (true) {
            if (var8 == var7) {
              return;
            }
            if (null == param0.d((byte) -27, var8)) {
              var8 = var8 + var5_int;
              continue;
            }
            break;
          }
          this.bodyId = var8;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("cc.E(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void c(int param0) {
        if (param0 != 6970) {
          return;
        }
        field_d = null;
    }

    public final boolean a(byte param0, tv param1) {
        int var3_int = 0;
        BodyCondition var4 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          var3_int = 14 / ((22 - param0) / 59);
          var4 = (BodyCondition) (param1);
          stackIn_5_0 = (super.a((byte) 92, param1)) || (var4.bodyId != this.bodyId);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("cc.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final boolean a(int param0, MissionState param1, World param2) {
        RuntimeException var4 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 0) {
            stackIn_6_0 = (null == param2.d((byte) -27, this.bodyId));
            return stackIn_6_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("cc.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public final int[] a(int param0, int[] param1) {
        RuntimeException var3 = null;
        faa var4 = null;
        int[] stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 99) {
            var4 = (faa) null;
            this.a((faa) null, false);
          }
          if (this.bodyId >= 0) {
            param1 = SetAutozoomSpeedDivide.a(this.bodyId, true, param1, (byte) -14);
          }
          stackIn_6_0 = (int[]) (param1);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("cc.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public final void a(faa param0, boolean param1) {
        try {
          super.a(param0, param1);
          if (param1) {
            World var4 = (World) null;
            this.a((World) null, 111);
          }
          this.bodyId = param0.i(0, 32);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "cc.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void b(byte param0, tv param1) {
        RuntimeException var3 = null;
        BodyCondition var5 = null;
        BodyCondition var6 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = (BodyCondition) (param1);
          var6 = var5;
          super.b((byte) 116, param1);
          var6.bodyId = this.bodyId;
          if (param0 > 54) {
            return;
          }
          field_d = (String) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_5_0 = var3;
          stackIn_5_1 = new StringBuilder().append("cc.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final void reportDifferences(tv other, int obfuscationGuard) {
        BodyCondition var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = (BodyCondition) (other);
          super.reportDifferences(other, -81);
          var4 = 0;
          if (obfuscationGuard >= -19) {
            this.bodyId = 28;
          }
          if (var3.bodyId != this.bodyId) {
            System.out.println("int body_id has changed. before=" + var3.bodyId + ", now=" + this.bodyId);
            var4 = 1;
          }
          if (var4 == 0) {
            return;
          }
          System.out.println("This instance of MissionConditionBodyDestroyed has changed");
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("cc.F(");
          if (other == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    BodyCondition() {
    }

    BodyCondition(int param0) {
        this.bodyId = param0;
    }

    final ucb[] a(World param0, int param1) {
        ShipBody var3 = null;
        RuntimeException var3_ref = null;
        ShipBody var4 = null;
        ucb[] stackIn_2_0 = null;
        ucb[] stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = param0.d((byte) -27, this.bodyId);
          var3 = var4;
          if (param1 != -20605) {
            stackIn_2_0 = (ucb[]) null;
            return stackIn_2_0;
          }
          if (var3 == null) {
            return null;
          }
          stackIn_6_0 = new ucb[]{new ucb(var4.d(false), var4.g((byte) -77))};
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_9_0 = var3_ref;
          stackIn_9_1 = new StringBuilder().append("cc.I(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_d = "You cannot chat to <%0> because <%0> is offline in your friend list.";
    }
}
