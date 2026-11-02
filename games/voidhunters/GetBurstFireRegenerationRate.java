/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GetBurstFireRegenerationRate extends ConsoleCommand {
    GetBurstFireRegenerationRate(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static ri[] e(byte param0) {
        if (param0 < -40) {
          return new ri[]{TeamShipComponentCondition.field_e, GetMomentOfInertiaPerpointCalcDownshift.field_r, SetAngularVelocitySustain.field_o, efb.field_c, SetSniperCannonAimarc.field_r, MapClearanceArea.field_b, SetSniperCannonAimarc.field_o, GetMassDriverProjectiles.field_p, tpa.field_a, ppb.field_c, ae.field_g, qw.field_g, GetBloomThresholdPercentage.field_o, qc.field_g};
        }
        return (ri[]) null;
    }

    final static void b(boolean param0) {
        if (param0) {
          return;
        }
        if (null != SetSelfDestructTimer.field_o) {
          SetSelfDestructTimer.field_o.e();
          if (aaa.field_b != null) {
            aaa.field_b.e();
            return;
          }
          return;
        }
        if (aaa.field_b == null) {
          return;
        }
        aaa.field_b.e();
    }

    final static phb[] a(boolean param0, int param1) {
        phb[] var3 = new phb[9];
        phb[] var2 = var3;
        if (param0) {
          var3[4] = SetMaxShipSize.a(param1, (byte) -113, 64);
          return var2;
        }
        return (phb[]) null;
    }

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_2_0 = null;
        ConsoleValue stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard <= -119) {
            stackIn_4_0 = new ConsoleValue(GetLaserFireForce.a(44, 111));
            return stackIn_4_0;
          }
          stackIn_2_0 = (ConsoleValue) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("prb.A(");
          if (arguments == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    static {
        kf discarded$0 = new kf();
    }
}
