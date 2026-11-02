/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class chb {
    static int field_a;

    final static void a(int param0, int param1, boolean param2) {
        vu var3 = null;
        hqb var4 = null;
        String var5_ref_String = null;
        int var5 = 0;
        int var6 = 0;
        vu var3Lifetime1;
        hqb var4Lifetime1;
        String var5_ref_StringLifetime1;
        hqb var4Lifetime2;
        hqb var4Lifetime1Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        if (param0 == 0) {
          var3 = qp.a(param2, param0 ^ 2, param1);
          if (var3 != null) {
            GetLagStandardDeviationOut.field_o.a(false, 115);
            var4 = GetLagStandardDeviationOut.field_o;
            var5_ref_String = SetDefaultFiringLeeway.field_o;
            var4.field_i.a(var5_ref_String, (byte) -53, 5);
            var4Lifetime2 = GetLagStandardDeviationOut.field_o;
            var5 = Particle.field_H;
            var6 = qs.field_a;
            var4Lifetime2.field_i.b(var5, -29060, var6, 0, 0);
          }
          dq.a((byte) 44, param1, param2);
          return;
        }
        field_a = 126;
        var3Lifetime1 = qp.a(param2, param0 ^ 2, param1);
        if (var3Lifetime1 != null) {
          GetLagStandardDeviationOut.field_o.a(false, 115);
          var4Lifetime1 = GetLagStandardDeviationOut.field_o;
          var5_ref_StringLifetime1 = SetDefaultFiringLeeway.field_o;
          var4Lifetime1.field_i.a(var5_ref_StringLifetime1, (byte) -53, 5);
          var4Lifetime1Lifetime1 = GetLagStandardDeviationOut.field_o;
          var5Lifetime1 = Particle.field_H;
          var6Lifetime1 = qs.field_a;
          var4Lifetime1Lifetime1.field_i.b(var5Lifetime1, -29060, var6Lifetime1, 0, 0);
        }
        dq.a((byte) 44, param1, param2);
    }

    final static void a(int param0) {
        if (null == SetKeepTeamColours.field_p) {
          SetKeepTeamColours.field_p = new qsa[32];
          GetDebrisCarryOver.field_p = param0;
          return;
        }
        GetDebrisCarryOver.field_p = param0;
    }

    static {
        field_a = 26;
    }
}
