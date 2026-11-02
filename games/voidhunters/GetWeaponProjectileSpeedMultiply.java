/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GetWeaponProjectileSpeedMultiply extends ConsoleCommand {
    static phb field_o;

    final static void a(kka param0, boolean param1, int param2, byte param3) {
        Object var4 = null;
        int var4_int = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        Throwable decompiledCaughtException = null;
        Object var4_ref = null;
        RuntimeException var4_ref2 = null;
        try {
          if (null != GetBurstFireMaxEnergy.field_p) {
            GetTorpedoProjectileDamage.a(1048576, param1, param2, true, param0);
          }
          if (null != SetMassDriverRandomness.field_o) {
            var4_ref = SetSelfDestructTimer.field_o;
            synchronized (var4_ref) {
              SetMassDriverRandomness.field_o.b(param2, (byte) 18, -1);
              if (param0 == dha.field_u) {
                return;
              }
              SetMassDriverRandomness.field_o.a(true);
              SetSelfDestructTimer.field_o.f();
              dha.field_u = param0;
              if (null != dha.field_u) {
                SetMassDriverRandomness.field_o.a(param1, dha.field_u, -1);
              }
            }
          }
          var4_int = 92 % ((param3 - 44) / 49);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_19_0 = var4_ref2;
          stackIn_19_1 = new StringBuilder().append("mi.C(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void f(byte param0) {
        if (param0 > -90) {
          GetWeaponProjectileSpeedMultiply.e((byte) 79);
          field_o = null;
          return;
        }
        field_o = null;
    }

    final static void e(byte param0) {
        int var1;
        if (param0 == -81) {
          if (GetMutatorVotes.field_p > 32) {
            var1 = GetMutatorVotes.field_p % 32;
            if (0 == var1) {
              var1 = 32;
            }
            re.a(-var1 + GetMutatorVotes.field_p, (byte) -125);
          } else {
            re.a(0, (byte) -126);
          }
        } else {
          GetWeaponProjectileSpeedMultiply.f((byte) 52);
          if (GetMutatorVotes.field_p > 32) {
            var1 = GetMutatorVotes.field_p % 32;
            if (0 == var1) {
              var1 = 32;
            }
            re.a(-var1 + GetMutatorVotes.field_p, (byte) -125);
          } else {
            re.a(0, (byte) -126);
          }
        }
    }

    GetWeaponProjectileSpeedMultiply(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard > -119) {
            field_o = (phb) null;
          }
          stackIn_3_0 = new ConsoleValue(GetLaserFireForce.a(195, 121));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("mi.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    static {
    }
}
