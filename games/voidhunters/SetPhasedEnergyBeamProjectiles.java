/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SetPhasedEnergyBeamProjectiles extends ConsoleCommand {
    static String[] field_o;

    final static TextureOperation a(boolean param0, int param1) {
        int var2;
        int var3;
        asb var4;
        var3 = VoidHunters.field_G;
        if (param0) {
          var4 = (asb) null;
          SetPhasedEnergyBeamProjectiles.a(true, (java.awt.Canvas) null, -80, (d) null, (asb) null, 58);
        }
        var2 = param1;
        if (0 == var2) {
          return (TextureOperation) ((Object) new drb());
        }
        if (1 == var2) {
          return (TextureOperation) ((Object) new jwa());
        }
        if (var2 == 2) {
          return (TextureOperation) ((Object) new cdb());
        }
        if (var2 == 3) {
          return (TextureOperation) ((Object) new peb());
        }
        if (var2 == 4) {
          return (TextureOperation) ((Object) new jlb());
        }
        if (var2 == 5) {
          return (TextureOperation) ((Object) new grb());
        }
        if (6 == var2) {
          return (TextureOperation) ((Object) new sma());
        }
        if (7 == var2) {
          return (TextureOperation) ((Object) new cj());
        }
        if (var2 == 8) {
          return (TextureOperation) ((Object) new owa());
        }
        if (9 == var2) {
          return (TextureOperation) ((Object) new di());
        }
        if (var2 == 10) {
          return (TextureOperation) ((Object) new ckb());
        }
        if (var2 == 11) {
          return (TextureOperation) ((Object) new lfa());
        }
        if (12 == var2) {
          return (TextureOperation) ((Object) new gg());
        }
        if (var2 == 13) {
          return (TextureOperation) ((Object) new lq());
        }
        if (var2 == 14) {
          return (TextureOperation) ((Object) new gw());
        }
        if (15 == var2) {
          return (TextureOperation) ((Object) new vm());
        }
        if (var2 == 16) {
          return (TextureOperation) ((Object) new vn());
        }
        if (var2 == 17) {
          return (TextureOperation) ((Object) new kbb());
        }
        if (18 == var2) {
          return (TextureOperation) ((Object) new me());
        }
        if (var2 == 19) {
          return (TextureOperation) ((Object) new sna());
        }
        if (var2 == 20) {
          return (TextureOperation) ((Object) new lnb());
        }
        if (var2 == 21) {
          return (TextureOperation) ((Object) new qba());
        }
        if (var2 == 22) {
          return (TextureOperation) ((Object) new ksb());
        }
        if (var2 == 23) {
          return (TextureOperation) ((Object) new hpb());
        }
        if (var2 == 24) {
          return (TextureOperation) ((Object) new qqa());
        }
        if (var2 == 25) {
          return (TextureOperation) ((Object) new olb());
        }
        if (var2 == 26) {
          return (TextureOperation) ((Object) new wua());
        }
        if (var2 == 27) {
          return (TextureOperation) ((Object) new moa());
        }
        if (var2 == 28) {
          return (TextureOperation) ((Object) new cm());
        }
        if (var2 == 29) {
          return (TextureOperation) ((Object) new md());
        }
        if (var2 == 30) {
          return (TextureOperation) ((Object) new koa());
        }
        if (var2 == 31) {
          return (TextureOperation) ((Object) new il());
        }
        if (var2 == 32) {
          return (TextureOperation) ((Object) new smb());
        }
        if (var2 == 33) {
          return (TextureOperation) ((Object) new gia());
        }
        if (34 == var2) {
          return (TextureOperation) ((Object) new rw());
        }
        if (35 == var2) {
          return (TextureOperation) ((Object) new hk());
        }
        if (36 == var2) {
          return (TextureOperation) ((Object) new wv());
        }
        if (var2 == 37) {
          return (TextureOperation) ((Object) new oqb());
        }
        if (var2 == 38) {
          return (TextureOperation) ((Object) new sva());
        }
        if (39 == var2) {
          return (TextureOperation) ((Object) new pja());
        }
        return null;
    }

    final static GraphicsToolkit a(boolean param0, java.awt.Canvas param1, int param2, d param3, asb param4, int param5) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        java.awt.Dimension var8 = null;
        GraphicsToolkit stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6_int = 0;
          var7 = 0;
          if (param0) {
            SetPhasedEnergyBeamProjectiles.a(false, 23);
          }
          if (param1 != null) {
            var8 = param1.getSize();
            var7 = var8.height;
            var6_int = var8.width;
          }
          stackIn_6_0 = GraphicsToolkit.a(var7, param4, param2, var6_int, param3, param1, 111, param5);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_9_0 = var6;
          stackIn_9_1 = new StringBuilder().append("hr.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param4 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param5).append(')').toString());
        }
    }

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          SetMachineGunEnergyUsed.a(84, 62, arguments[0].intValue(31));
          if (obfuscationGuard > -119) {
            field_o = (String[]) null;
          }
          stackIn_3_0 = new ConsoleValue("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("hr.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    SetPhasedEnergyBeamProjectiles(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(ShipComponent param0, int param1) {
        try {
          param0.a(1, 0, new ShipComponent(13));
          param0.a(1, 8, new ShipComponent(13));
          param0.a(1, 9, new ShipComponent(13));
          int var2_int = 21 % ((param1 - 57) / 55);
          param0.a(1, 1, new ShipComponent(42));
          param0.a(1, 7, new ShipComponent(42));
          param0.a(1, 4, new ShipComponent(22));
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "hr.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void clearSharedReferences(int param0) {
        field_o = null;
        if (param0 >= -18) {
          SetPhasedEnergyBeamProjectiles.clearSharedReferences(21);
        }
    }

    final static void a(int param0, int param1, int param2) {
        int var3_int = 0;
        int var4 = VoidHunters.field_G;
        int var3_intLifetime1;
        try {
          if (param2 >= -65) {
            field_o = (String[]) null;
          }
          if (param1 != hob.field_d) {
            grb.field_l = new int[param1];
            for (var3_int = 0; var3_int < param1; var3_int++) {
              grb.field_l[var3_int] = (var3_int << 12) / param1;
            }
            SetMassDriverEnergyUsed.field_q = param1 - 1;
            tpa.field_b = 32 * param1;
            hob.field_d = param1;
          }
          if (param0 != GetTorpedoReload.field_o) {
            if (hob.field_d == param0) {
              SetSalvoUsesAllEnergy.field_p = grb.field_l;
            } else {
              SetSalvoUsesAllEnergy.field_p = new int[param0];
              for (var3_intLifetime1 = 0; param0 > var3_intLifetime1; var3_intLifetime1++) {
                SetSalvoUsesAllEnergy.field_p[var3_intLifetime1] = (var3_intLifetime1 << 12) / param0;
              }
            }
            wf.field_d = param0 - 1;
            GetTorpedoReload.field_o = param0;
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "hr.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
    }
}
