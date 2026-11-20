/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MissionFactory implements GameStateFactory {
    static String[][] field_a;

    public final SerializableGameState create(byte param0) {
        int var2 = -44 / ((-64 - param0) / 50);
        return (SerializableGameState) ((Object) new Mission());
    }

    public static void clearSharedReferences(boolean param0) {
        if (param0) {
          MissionFactory.b((byte) -50);
          field_a = (String[][]) null;
          return;
        }
        field_a = (String[][]) null;
    }

    final static void b(byte param0) {
        GetPhasedEnergyBeamPulsetime.field_p = null;
        if (param0 <= 109) {
          MissionFactory.b((byte) -94);
          SetPhasedEnergyBeamAimspeed.field_p = null;
          return;
        }
        SetPhasedEnergyBeamAimspeed.field_p = null;
    }

    public final SerializableGameState[] createArray(int param0, int param1) {
        if (param0 != 11995) {
          MissionFactory.clearSharedReferences(false);
          return (SerializableGameState[]) ((Object) new Mission[param1]);
        }
        return (SerializableGameState[]) ((Object) new Mission[param1]);
    }

    final static void c(byte param0) {
        ft var1 = null;
        byte[] var3 = null;
        ola var1_ref = null;
        byte[] var4 = null;
        ft var1Lifetime1;
        byte[] var3Lifetime1;
        ola var1_refLifetime1;
        byte[] var4Lifetime1;
        if (param0 >= 89) {
          if (null == PlayerVote.field_b) {
            var1 = new ft();
            var3 = var1.a(128, 16, false, 128);
            PlayerVote.field_b = EscapePodFactory.a(false, var3, -12445);
          }
          if (null == GetPointDefenceLaserRandomness.field_q) {
            var1_ref = new ola();
            var4 = var1_ref.a(128, 16, -15281, 128);
            GetPointDefenceLaserRandomness.field_q = EscapePodFactory.a(false, var4, -12445);
          }
          return;
        }
        MissionFactory.clearSharedReferences(false);
        if (null == PlayerVote.field_b) {
          var1Lifetime1 = new ft();
          var3Lifetime1 = var1Lifetime1.a(128, 16, false, 128);
          PlayerVote.field_b = EscapePodFactory.a(false, var3Lifetime1, -12445);
        }
        if (null == GetPointDefenceLaserRandomness.field_q) {
          var1_refLifetime1 = new ola();
          var4Lifetime1 = var1_refLifetime1.a(128, 16, -15281, 128);
          GetPointDefenceLaserRandomness.field_q = EscapePodFactory.a(false, var4Lifetime1, -12445);
        }
    }

    static {
    }
}
