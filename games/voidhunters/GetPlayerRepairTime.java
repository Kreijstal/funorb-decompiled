/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GetPlayerRepairTime extends ConsoleCommand {
    static IntrusiveDeque rasterStatePool;
    static byte[] field_o;

    public static void clearSharedReferences(int param0) {
        if (param0 != 8) {
          rasterStatePool = (IntrusiveDeque) null;
          rasterStatePool = null;
          field_o = null;
          return;
        }
        rasterStatePool = null;
        field_o = null;
    }

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue[] var4 = null;
        ConsoleValue stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard > -119) {
            var4 = (ConsoleValue[]) null;
            this.execute((ConsoleValue[]) null, -2);
          }
          stackIn_3_0 = new ConsoleValue(GetLaserFireForce.a(226, 110));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ce.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static void initializeWeaponDefinitions(boolean param0) {
        SetShipDirectionArrow.weaponDefinitions = new WeaponDefinition[12];
        SetShipDirectionArrow.weaponDefinitions[0] = (WeaponDefinition) ((Object) new MassDriverWeaponDefinition());
        SetShipDirectionArrow.weaponDefinitions[1] = (WeaponDefinition) ((Object) new LaserWeaponDefinition());
        SetShipDirectionArrow.weaponDefinitions[2] = (WeaponDefinition) ((Object) new FighterBayWeaponDefinition());
        SetShipDirectionArrow.weaponDefinitions[3] = (WeaponDefinition) ((Object) new TorpedoWeaponDefinition());
        SetShipDirectionArrow.weaponDefinitions[4] = (WeaponDefinition) ((Object) new BombletSprayWeaponDefinition());
        SetShipDirectionArrow.weaponDefinitions[5] = (WeaponDefinition) ((Object) new SpinningBladeWeaponDefinition());
        SetShipDirectionArrow.weaponDefinitions[6] = (WeaponDefinition) ((Object) new PhasedEnergyBeamWeaponDefinition());
        SetShipDirectionArrow.weaponDefinitions[11] = (WeaponDefinition) ((Object) new MachineGunWeaponDefinition());
        SetShipDirectionArrow.weaponDefinitions[7] = (WeaponDefinition) ((Object) new SniperCannonWeaponDefinition());
        SetShipDirectionArrow.weaponDefinitions[8] = (WeaponDefinition) ((Object) new MissileLauncherWeaponDefinition());
        SetShipDirectionArrow.weaponDefinitions[9] = (WeaponDefinition) ((Object) new PointDefenceLaserWeaponDefinition());
        SetShipDirectionArrow.weaponDefinitions[10] = (WeaponDefinition) ((Object) new CountermeasureLauncherWeaponDefinition());
        if (param0) {
          GetPlayerRepairTime.initializeWeaponDefinitions(false);
        }
    }

    final static void decodeLogoAudio(ResourceArchive param0, boolean param1) {
        VorbisSample var2 = null;
        try {
          VorbisSample.decodeSetup(param0.fetchNamedFile("", true, "headers.packvorbis"));
          if (param1) {
            ResourceArchive var3 = (ResourceArchive) null;
            GetPlayerRepairTime.decodeLogoAudio((ResourceArchive) null, false);
          }
          var2 = VorbisSample.loadByName(param0, "jagex logo2.packvorbis", "");
          var2.decodeFully();
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "ce.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    GetPlayerRepairTime(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        rasterStatePool = new IntrusiveDeque();
    }
}
