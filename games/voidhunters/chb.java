/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class chb {
    static int field_a;

    final static void a(int param0, int param1, boolean param2) {
        SocialListEntry var3 = null;
        PlayerContextMenu var4 = null;
        String var5_ref_String = null;
        int var5 = 0;
        int var6 = 0;
        SocialListEntry var3Lifetime1;
        PlayerContextMenu var4Lifetime1;
        String var5_ref_StringLifetime1;
        PlayerContextMenu var4Lifetime2;
        PlayerContextMenu var4Lifetime1Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        if (param0 == 0) {
          var3 = ArchiveIndex.a(param2, param0 ^ 2, param1);
          if (var3 != null) {
            GetLagStandardDeviationOut.field_o.addLobbyOwnerOptions(false, 115);
            var4 = GetLagStandardDeviationOut.field_o;
            var5_ref_String = SetDefaultFiringLeeway.field_o;
            var4.menu.addItem(var5_ref_String, (byte) -53, 5);
            var4Lifetime2 = GetLagStandardDeviationOut.field_o;
            var5 = Particle.field_H;
            var6 = AppletCookieWriter.field_a;
            var4Lifetime2.menu.layoutPopup(var5, -29060, var6, 0, 0);
          }
          IsaacCipher.a((byte) 44, param1, param2);
          return;
        }
        field_a = 126;
        var3Lifetime1 = ArchiveIndex.a(param2, param0 ^ 2, param1);
        if (var3Lifetime1 != null) {
          GetLagStandardDeviationOut.field_o.addLobbyOwnerOptions(false, 115);
          var4Lifetime1 = GetLagStandardDeviationOut.field_o;
          var5_ref_StringLifetime1 = SetDefaultFiringLeeway.field_o;
          var4Lifetime1.menu.addItem(var5_ref_StringLifetime1, (byte) -53, 5);
          var4Lifetime1Lifetime1 = GetLagStandardDeviationOut.field_o;
          var5Lifetime1 = Particle.field_H;
          var6Lifetime1 = AppletCookieWriter.field_a;
          var4Lifetime1Lifetime1.menu.layoutPopup(var5Lifetime1, -29060, var6Lifetime1, 0, 0);
        }
        IsaacCipher.a((byte) 44, param1, param2);
    }

    final static void a(int param0) {
        if (null == SetKeepTeamColours.field_p) {
          SetKeepTeamColours.field_p = new ObjectiveMarker[32];
          GetDebrisCarryOver.field_p = param0;
          return;
        }
        GetDebrisCarryOver.field_p = param0;
    }

    static {
        field_a = 26;
    }
}
