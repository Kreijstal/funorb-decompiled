/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ArchiveLoadSequence {
    private ArchiveLoadStep[] field_f;
    private int field_k;
    String field_j;
    static UiTheme field_g;
    static int field_l;
    private int field_h;
    float field_d;
    private int field_c;
    static int[] field_b;
    static String field_e;
    static IndexedSprite field_m;
    static float field_i;
    static String field_a;

    final boolean pollLoading(int param0) {
        int var3;
        ArchiveLoadStep var4;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        while (this.field_k < this.field_c) {
          var4 = this.field_f[this.field_k];
          if (!var4.field_d.ensureIndex((byte) -123)) {
            this.updateProgress(0, (byte) 30, var4);
            return false;
          }
          if (var4.field_g >= 0 &&
            !var4.field_d.ensureGroupLoaded(-128, var4.field_g)) {
            this.updateProgress(var4.field_d.getGroupProgress(var4.field_g, (byte) 104), (byte) 30, var4);
            return false;
          }
          if (var4.field_a != null &&
            !var4.field_d.isGroupAvailableByName(false, var4.field_a)) {
            this.updateProgress(var4.field_d.getGroupProgressByName(0, var4.field_a), (byte) 30, var4);
            return false;
          }
          if (var4.field_g < 0 &&
            var4.field_a == null &&
            var4.field_f != null &&
            !var4.field_d.areAllGroupsAvailable(0)) {
            this.updateProgress(var4.field_d.getOverallProgress(0), (byte) 30, var4);
            return false;
          }
          this.field_k = this.field_k + 1;
        }
        if (param0 <= -90) {
          return true;
        }
        this.field_j = (String) null;
        return true;
    }

    public static void releaseStatics(byte param0) {
        field_m = null;
        field_b = null;
        field_a = null;
        if (param0 != -50) {
          field_b = (int[]) null;
        }
        field_e = null;
        field_g = null;
    }

    final static void loadLogoModels(int param0, ResourceArchive param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        TriangleMesh var6 = null;
        int[] var7 = null;
        int var8 = 0;
        CipherPacketBuffer var9 = null;
        int var10 = 0;
        CipherPacketBuffer var11 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var4Lifetime1;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var9 = new CipherPacketBuffer(param1.getNamedFile("logo.fo3d", "", false));
          var11 = var9;
          var3 = var11.readUnsignedByte(31365);
          var11.startBitAccess(-1136);
          TabbedOverlayPanel.field_f = LoginMethod.readMeshMaterials(30816, var11);
          MiasmaParticle.field_G = new int[var3][];
          MenuFrameHelpers.field_c = new TriangleMesh[var3];
          for (var4 = 0; var4 < var3; var4++) {
            MenuFrameHelpers.field_c[var4] = StatusAndMeshHelpers.decodeMesh(var9, (byte) -111);
          }
          var11.endBitAccess(-3093);
          var10 = 0;
          var4Lifetime1 = var10;
          var5 = 60 / ((62 - param0) / 39);
          while (var10 < var3) {
            var6 = MenuFrameHelpers.field_c[var10];
            var6.scaleVertices(6, 1, 6, 6, 2122);
            var6.updateBounds((byte) -102);
            var7 = new int[]{var6.field_C + var6.field_D >> 1, var6.field_G + var6.field_l >> 1, var6.field_j + var6.field_r >> 1};
            MiasmaParticle.field_G[var10] = var7;
            var6.translateVertices(-var7[2], 3, -var7[0], -var7[1]);
            var10++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("lh.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static void resetFrameTimer(boolean param0) {
        AlternateUsernameCredentials.field_r = ClockAndScreenHelpers.monotonicMillis((byte) 41);
        SleepAndNameHelpers.field_c = 0;
        if (!param0) {
          ArchiveLoadSequence.getLinkTag((byte) -46, -87);
        }
    }

    final static String getLinkTag(byte param0, int param1) {
        if (param0 != -12) {
          return (String) null;
        }
        return AccountServerResult.field_f[param1];
    }

    private final void updateProgress(int param0, byte param1, ArchiveLoadStep param2) {
        float var4_float = 0.0f;
        try {
          var4_float = (float)(this.field_k + 1) + (float)param0 / 100.0f;
          if (param0 != 0) {
            this.field_j = param2.field_f + " - " + param0 + "%";
          } else {
            this.field_j = param2.field_h;
          }
          if (param1 != 30) {
            field_m = (IndexedSprite) null;
          }
          this.field_d = (float)this.field_h * var4_float / (float)(1 + this.field_c);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "lh.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private ArchiveLoadSequence() throws Throwable {
        throw new Error();
    }

    static {
        int var2 = 0;
        field_e = "The account name you use to access RuneScape and other Jagex.com games";
        field_b = new int[50];
        double var0 = 6.283185307179586 / (double)field_b.length;
        for (var2 = 0; field_b.length > var2; var2++) {
          field_b[var2] = (int)(48.0 * Math.sin(var0 * (double)var2));
        }
        field_a = "Recharge your powerups even faster than with Nimble Fingers! Equip both for the maximum recharge rate.";
    }
}
