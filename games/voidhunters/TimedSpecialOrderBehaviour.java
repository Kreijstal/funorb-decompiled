/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TimedSpecialOrderBehaviour implements DiffableState {
    int cooldown;
    static String field_b;
    static int field_a;

    public final void reportDifferences(tv other, int obfuscationGuard) {
        TimedSpecialOrderBehaviour var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = (TimedSpecialOrderBehaviour) (other);
          var4 = 0;
          if (obfuscationGuard >= -19) {
            field_b = (String) null;
          }
          if (this.cooldown != var3.cooldown) {
            System.out.println("int cooldown has changed. before=" + var3.cooldown + ", now=" + this.cooldown);
            var4 = 1;
          }
          if (var4 == 0) {
            return;
          }
          System.out.println("This instance of TimedSpecialOrderBehaviour has changed");
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("gqb.F(");
          if (other == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public final boolean a(byte param0, tv param1) {
        TimedSpecialOrderBehaviour var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = -108 / ((param0 - 22) / 59);
          var3 = (TimedSpecialOrderBehaviour) (param1);
          stackIn_3_0 = (var3.cooldown != this.cooldown);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_6_0 = var3_ref;
          stackIn_6_1 = new StringBuilder().append("gqb.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final void b(byte param0, tv param1) {
        TimedSpecialOrderBehaviour var5 = null;
        TimedSpecialOrderBehaviour var6 = null;
        if (param0 < 54) {
          return;
        }
        try {
          var5 = (TimedSpecialOrderBehaviour) (param1);
          var6 = var5;
          var6.cooldown = this.cooldown;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "gqb.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void b(faa param0, int param1) {
        try {
          if (param1 >= -109) {
            TimedSpecialOrderBehaviour.a(55);
          }
          param0.a(-632, this.cooldown, 32);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "gqb.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static Ship a(boolean param0) {
        Ship var9 = new Ship();
        ShipComponent var2 = new ShipComponent(0);
        ShipComponent var4 = new ShipComponent(14);
        var2.a(1, 0, var4);
        ShipComponent var5 = new ShipComponent(12);
        var5.thrusterbehaviour = new ThrusterBehaviour();
        var5.a((byte) -82, 8);
        var5.thrusterbehaviour.a(true, 1024);
        var2.a(1, 1, var5);
        ShipComponent var6 = new ShipComponent(12);
        var6.thrusterbehaviour = new ThrusterBehaviour();
        var6.a((byte) -64, 4);
        var6.thrusterbehaviour.a(true, 1024);
        var2.a(1, 2, var6);
        ShipComponent var7 = new ShipComponent(12);
        var7.thrusterbehaviour = new ThrusterBehaviour();
        var7.a((byte) -113, 2);
        var7.thrusterbehaviour.a(true, 1024);
        var2.a(1, 3, var7);
        ShipComponent var8 = new ShipComponent(12);
        if (!param0) {
          var8.thrusterbehaviour = new ThrusterBehaviour();
          var8.a((byte) -92, 1);
          var8.thrusterbehaviour.a(true, 1024);
          var2.a(1, 4, var8);
          var9.chassis = var2;
          var9.e((byte) 119);
          return var9;
        }
        field_a = 66;
        var8.thrusterbehaviour = new ThrusterBehaviour();
        var8.a((byte) -92, 1);
        var8.thrusterbehaviour.a(true, 1024);
        var2.a(1, 4, var8);
        var9.chassis = var2;
        var9.e((byte) 119);
        return var9;
    }

    public final void a(faa param0, boolean param1) {
        try {
          if (param1) {
            this.cooldown = 57;
          }
          this.cooldown = param0.i(0, 32);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "gqb.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 <= 121) {
          TimedSpecialOrderBehaviour.a(-50);
        }
    }

    static {
        field_b = "Create a free Account";
        field_a = 0;
    }
}
