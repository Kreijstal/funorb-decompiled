/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ColorRowCache {
    private int field_a;
    private int field_b;
    private int field_d;
    private IntrusiveDeque field_f;
    private ColorRowCacheEntry[] field_e;
    private int[][][] field_c;
    private int field_h;
    boolean field_g;

    final int[][][] getFullImage(int param0) {
        int var2 = 0;
        int var3 = VoidHunters.field_G;
        if (this.field_a != this.field_h) {
          throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (var2 = 0; var2 < this.field_h; var2++) {
          this.field_e[var2] = GetMachineGunEnergyUsed.field_o;
        }
        if (param0 < 75) {
          this.field_g = true;
        }
        return this.field_c;
    }

    final int[][] getRow(int param0, byte param1) {
        boolean stackIn_14_1 = false;
        boolean stackIn_18_1 = false;
        ColorRowCacheEntry var3;
        ColorRowCacheEntry var4;
        int var5;
        var5 = VoidHunters.field_G;
        if (param1 > -82) {
          this.field_d = 122;
        }
        if (this.field_h == this.field_a) {
          stackIn_18_1 = (this.field_e[param0] == null);
          this.field_g = stackIn_18_1;
          this.field_e[param0] = GetMachineGunEnergyUsed.field_o;
          return this.field_c[param0];
        }
        if (this.field_h == 1) {
          stackIn_14_1 = (this.field_b != param0);
          this.field_g = stackIn_14_1;
          this.field_b = param0;
          return this.field_c[0];
        }
        var3 = this.field_e[param0];
        if (var3 != null) {
          this.field_g = false;
        } else {
          this.field_g = true;
          if (this.field_d < this.field_h) {
            var3 = new ColorRowCacheEntry(param0, this.field_d);
            this.field_d = this.field_d + 1;
          } else {
            var4 = (ColorRowCacheEntry) (this.field_f.last((byte) 120));
            var3 = new ColorRowCacheEntry(param0, var4.field_e);
            this.field_e[var4.field_g] = null;
            var4.unlink(-3846);
          }
          this.field_e[param0] = var3;
        }
        this.field_f.addFirst(var3, (byte) -55);
        return this.field_c[var3.field_e];
    }

    final void clear(int param0) {
        int var3 = VoidHunters.field_G;
        int var2 = 0;
        if (param0 != 1) {
          this.getRow(43, (byte) 61);
        }
        while (this.field_h > var2) {
          this.field_c[var2][0] = null;
          this.field_c[var2][1] = null;
          this.field_c[var2][2] = null;
          this.field_c[var2] = (int[][]) null;
          var2++;
        }
        this.field_c = (int[][][]) null;
        this.field_e = null;
        this.field_f.clear(102);
        this.field_f = null;
    }

    final static int c(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_26_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = VoidHunters.field_G;
        try {
          GetLagStandardDeviationIn.field_r.processPointerInput((byte) -5, ThresholdTextureOperation.modalPointerX, MapClearanceArea.modalPointerY, true);
          GetLagStandardDeviationIn.field_r.updatePanels(19976);
          while (UiAngleDial.pollKeyEvent(127)) {
            GetLagStandardDeviationIn.field_r.dispatchKey(-9445, SetBombletSprayProjectileDamage.field_o, SetClientSideDragging.field_r);
          }
          if (PlayerJoinFactory.pendingAccountUiResult != -1) {
            var1_int = PlayerJoinFactory.pendingAccountUiResult;
            GetSelfDestructPrepareToggleCooldown.setAccountUiResult(-59, -1);
            stackIn_7_0 = var1_int;
            return stackIn_7_0;
          }
          if (RemoveEventActionFactory.field_b) {
            stackIn_11_0 = 3;
            return stackIn_11_0;
          }
          if (ActiveIconBorderRenderer.pendingAccountRequest == SetShipTeamAction.field_b) {
            stackIn_14_0 = 1;
            return stackIn_14_0;
          }
          if (param0 != 1) {
            stackIn_17_0 = -23;
            return stackIn_17_0;
          }
          if (!GetBombletSprayPushMultiplier.emailAvailabilityCheck.isComplete(4)) {
            stackIn_21_0 = 1;
            return stackIn_21_0;
          }
          if (ActiveIconBorderRenderer.pendingAccountRequest != SetCountermeasureLauncherAimspeed.field_r) {
            stackIn_26_0 = -1;
            return stackIn_26_0;
          }
          stackIn_24_0 = 2;
          return stackIn_24_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) var1), "rt.A(" + param0 + ')');
        }
    }

    ColorRowCache(int param0, int param1, int param2) {
        this.field_b = -1;
        this.field_d = 0;
        this.field_f = new IntrusiveDeque();
        this.field_g = false;
        this.field_h = param0;
        this.field_a = param1;
        this.field_c = new int[this.field_h][3][param2];
        this.field_e = new ColorRowCacheEntry[this.field_a];
    }

    static {
    }
}
