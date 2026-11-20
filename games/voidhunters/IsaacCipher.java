/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IsaacCipher {
    private int[] memory;
    private int remaining;
    private int accumulator;
    private int counter;
    private int lastResult;
    private int[] results;

    final static void a(byte param0, int param1, boolean param2) {
        ScrollPaneWidget stackIn_5_0;
        int stackIn_5_1;
        int stackIn_5_2;
        int stackIn_5_3;
        boolean stackIn_6_4 = false;
        Widget stackIn_22_0 = null;
        String stackIn_23_1 = null;
        int stackIn_26_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        IntrusiveDeque var4 = null;
        Object var5 = null;
        vu var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var13_ref_String = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        PlayerContextMenu var16 = null;
        PlayerContextMenu var17 = null;
        var15 = VoidHunters.field_G;
        try {
          if (param0 < 17) {
            return;
          }
          stackIn_5_0 = vra.field_b.scrollPane;
          stackIn_5_1 = 38;
          stackIn_5_2 = 2;
          stackIn_5_3 = param1 * (2 + DialogMessagePanel.field_w) * 3;
          stackIn_6_4 = (LegacyOpenGlMaterialEffect.field_a == vra.field_b.scrollPane);
          var3_int = ((ScrollPaneWidget) (Object) stackIn_5_0).layoutAndUpdateScrolling((byte) stackIn_5_1, stackIn_5_2, stackIn_5_3, stackIn_6_4, param2, 2 + DialogMessagePanel.field_w) ? 1 : 0;
          var4 = vra.field_b.content.children;
          if (iwa.field_b != 2 &&
            1 != iwa.field_b) {
            vra.field_b.scrollPane.viewport.text = SetFighterRepairTime.field_o;
            vra.field_b.enabled = false;
            igb.a(vra.field_b.content, (byte) -25);
            return;
          }
          vra.field_b.scrollPane.viewport.text = null;
          vra.field_b.enabled = true;
          var5 = null;
          var6 = (vu) (var4.first(0));
          while (var6 != null) {
            var7 = 0;
            if (var6.children == null) {
              var6.field_wb = new Widget(0L, SetReverbDamp.field_q);
              var6.addChild(-561, var6.field_wb);
              var6.field_Bb = new Widget(0L, SetReverbDamp.field_q);
              var6.addChild(-561, var6.field_Bb);
              var7 = 1;
              var6.inheritInteractionStateInDescendants(127);
            }
            var6.width = vra.field_b.content.width;
            var6.field_wb.setBounds(0, -55, var6.width, 0, DialogMessagePanel.field_w);
            var8 = 0;
            if (null != var6.field_vb &&
              !var6.field_vb.equals("")) {
              var6.field_Bb.field_tb = SetMissileLauncherRandomness.field_o;
              var6.field_Bb.field_qb = 16737894;
              var8 = 1;
              var6.field_Bb.setBounds(0, -87, SetMissileLauncherRandomness.field_o.paddedWidth + 3, 0, DialogMessagePanel.field_w);
            }
            var9 = 0;
            var10 = var6.width;
            if (var8 != 0) {
              var9 = 3 + SetMissileLauncherRandomness.field_o.paddedWidth;
              var10 = var10 - var9;
            }
            stackIn_22_0 = var6.field_wb;
            if (var10 <= 0) {
              stackIn_23_1 = var6.field_Fb;
            } else {
              stackIn_23_1 = BitmapFont.ellipsize(var6.field_wb.font, var6.field_Fb, var10);
            }
            stackIn_22_0.text = stackIn_23_1;
            stackIn_26_0 = (var6.field_wb.text.equals(var6.field_Fb)) ? 0 : 1;
            var11 = stackIn_26_0;
            var6.field_wb.setBounds(var9, 117, var10, 0, DialogMessagePanel.field_w);
            if (var3_int == 0) {
              var6.field_E = -var6.height + DialogMessagePanel.field_w;
            }
            if (var7 != 0) {
              vra.field_b.content.positionBelow((Widget) (var5), 2, var6, -113);
            }
            if (var6.field_Bb != null &&
              var6.field_Bb.field_O) {
              NebulaFieldFactory.field_a = var6.field_vb;
            } else {
              if (var6.field_wb.field_O &&
                var11 != 0) {
                NebulaFieldFactory.field_a = var6.field_Fb;
              }
            }
            var5 = var6;
            if (var6.field_o != 0) {
              pea.$cfr$intArgs$a$91f64d33677c(0L, var6, -1, (int[]) null, var6.field_Cb, vra.field_b.scrollPane, var6.field_Fb, 72, -1);
              var16 = GetLagStandardDeviationOut.field_o;
              var13_ref_String = PlayerJoinFactory.field_a;
              var16.menu.addItem(var13_ref_String, (byte) -53, 7);
              var17 = GetLagStandardDeviationOut.field_o;
              var13 = Particle.field_H;
              var14 = qs.field_a;
              var17.menu.layoutPopup(var13, -29060, var14, 0, 0);
            }
            var6 = (vu) (var4.next((byte) 66));
          }
          if (0 != vra.field_b.firstButton.field_o) {
            GpuFractalNoiseVolume.field_p = new qka(vra.field_b.firstButton.screenX, vra.field_b.firstButton.screenY, vra.field_b.firstButton.width, vra.field_b.firstButton.height, LegacyOpenGlWaveWaterEffect.field_d, GetDebrisMax.field_o, DeveloperConsole.field_q, DeveloperConsole.field_q);
            MissionGenerationDataFactory.field_b = 2;
          }
          if (0 == vra.field_b.secondButton.field_o) {
            return;
          }
          GpuFractalNoiseVolume.field_p = new qka(vra.field_b.secondButton.screenX, vra.field_b.secondButton.screenY, vra.field_b.secondButton.width, vra.field_b.secondButton.height, GetUseNiceTrails.field_q, GetDebrisMax.field_o, DeveloperConsole.field_q, DeveloperConsole.field_q);
          MissionGenerationDataFactory.field_b = 3;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) var3), "dq.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void initialize(boolean param0) {
        int var2 = 0;
        int var11 = VoidHunters.field_G;
        int var2Lifetime1;
        int var2Lifetime2;
        if (!param0) {
          this.memory = (int[]) null;
        }
        int var8 = -1640531527;
        int var7 = -1640531527;
        int var3 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var10 = -1640531527;
        int var4 = -1640531527;
        int var9 = -1640531527;
        for (var2 = 0; 4 > var2; var2++) {
          var3 = var3 ^ var4 << 11;
          var4 = var4 + var5;
          var6 = var6 + var3;
          var4 = var4 ^ var5 >>> 2;
          var7 = var7 + var4;
          var5 = var5 + var6;
          var5 = var5 ^ var6 << 8;
          var6 = var6 + var7;
          var8 = var8 + var5;
          var6 = var6 ^ var7 >>> 16;
          var7 = var7 + var8;
          var9 = var9 + var6;
          var7 = var7 ^ var8 << 10;
          var8 = var8 + var9;
          var10 = var10 + var7;
          var8 = var8 ^ var9 >>> 4;
          var9 = var9 + var10;
          var3 = var3 + var8;
          var9 = var9 ^ var10 << 8;
          var4 = var4 + var9;
          var10 = var10 + var3;
          var10 = var10 ^ var3 >>> 9;
          var3 = var3 + var4;
          var5 = var5 + var10;
        }
        for (var2Lifetime1 = 0; var2Lifetime1 < 256; var2Lifetime1 += 8) {
          var4 = var4 + this.results[1 + var2Lifetime1];
          var5 = var5 + this.results[2 + var2Lifetime1];
          var9 = var9 + this.results[var2Lifetime1 + 6];
          var8 = var8 + this.results[5 + var2Lifetime1];
          var10 = var10 + this.results[7 + var2Lifetime1];
          var6 = var6 + this.results[var2Lifetime1 + 3];
          var7 = var7 + this.results[4 + var2Lifetime1];
          var3 = var3 + this.results[var2Lifetime1];
          var3 = var3 ^ var4 << 11;
          var6 = var6 + var3;
          var4 = var4 + var5;
          var4 = var4 ^ var5 >>> 2;
          var5 = var5 + var6;
          var7 = var7 + var4;
          var5 = var5 ^ var6 << 8;
          var6 = var6 + var7;
          var8 = var8 + var5;
          var6 = var6 ^ var7 >>> 16;
          var7 = var7 + var8;
          var9 = var9 + var6;
          var7 = var7 ^ var8 << 10;
          var8 = var8 + var9;
          var10 = var10 + var7;
          var8 = var8 ^ var9 >>> 4;
          var3 = var3 + var8;
          var9 = var9 + var10;
          var9 = var9 ^ var10 << 8;
          var4 = var4 + var9;
          var10 = var10 + var3;
          var10 = var10 ^ var3 >>> 9;
          var5 = var5 + var10;
          var3 = var3 + var4;
          this.memory[var2Lifetime1] = var3;
          this.memory[1 + var2Lifetime1] = var4;
          this.memory[2 + var2Lifetime1] = var5;
          this.memory[3 + var2Lifetime1] = var6;
          this.memory[4 + var2Lifetime1] = var7;
          this.memory[var2Lifetime1 + 5] = var8;
          this.memory[6 + var2Lifetime1] = var9;
          this.memory[var2Lifetime1 + 7] = var10;
        }
        for (var2Lifetime2 = 0; var2Lifetime2 < 256; var2Lifetime2 += 8) {
          var9 = var9 + this.memory[var2Lifetime2 + 6];
          var10 = var10 + this.memory[var2Lifetime2 + 7];
          var3 = var3 + this.memory[var2Lifetime2];
          var6 = var6 + this.memory[3 + var2Lifetime2];
          var8 = var8 + this.memory[var2Lifetime2 + 5];
          var5 = var5 + this.memory[2 + var2Lifetime2];
          var7 = var7 + this.memory[4 + var2Lifetime2];
          var4 = var4 + this.memory[var2Lifetime2 + 1];
          var3 = var3 ^ var4 << 11;
          var4 = var4 + var5;
          var6 = var6 + var3;
          var4 = var4 ^ var5 >>> 2;
          var5 = var5 + var6;
          var7 = var7 + var4;
          var5 = var5 ^ var6 << 8;
          var8 = var8 + var5;
          var6 = var6 + var7;
          var6 = var6 ^ var7 >>> 16;
          var7 = var7 + var8;
          var9 = var9 + var6;
          var7 = var7 ^ var8 << 10;
          var8 = var8 + var9;
          var10 = var10 + var7;
          var8 = var8 ^ var9 >>> 4;
          var3 = var3 + var8;
          var9 = var9 + var10;
          var9 = var9 ^ var10 << 8;
          var10 = var10 + var3;
          var4 = var4 + var9;
          var10 = var10 ^ var3 >>> 9;
          var5 = var5 + var10;
          var3 = var3 + var4;
          this.memory[var2Lifetime2] = var3;
          this.memory[var2Lifetime2 + 1] = var4;
          this.memory[2 + var2Lifetime2] = var5;
          this.memory[3 + var2Lifetime2] = var6;
          this.memory[var2Lifetime2 + 4] = var7;
          this.memory[var2Lifetime2 + 5] = var8;
          this.memory[6 + var2Lifetime2] = var9;
          this.memory[var2Lifetime2 + 7] = var10;
        }
        this.generate((byte) 57);
        this.remaining = 256;
    }

    private final void generate(byte param0) {
        int var2 = 0;
        int dupTemp$1 = 0;
        int dupTemp$2 = 0;
        int var3;
        int var4;
        int var5;
        var5 = VoidHunters.field_G;
        if (param0 != 57) {
          this.accumulator = 8;
        }
        int fieldTemp$0 = this.counter + 1;
        this.counter = this.counter + 1;
        this.lastResult = this.lastResult + fieldTemp$0;
        for (var2 = 0; var2 < 256; var2++) {
          var3 = this.memory[var2];
          if (0 == (2 & var2)) {
            if (0 != (var2 & 1)) {
              this.accumulator = this.accumulator ^ this.accumulator >>> 6;
            } else {
              this.accumulator = this.accumulator ^ this.accumulator << 13;
            }
          } else {
            if ((var2 & 1) == 0) {
              this.accumulator = this.accumulator ^ this.accumulator << 2;
            } else {
              this.accumulator = this.accumulator ^ this.accumulator >>> 16;
            }
          }
          this.accumulator = this.accumulator + this.memory[255 & 128 + var2];
          dupTemp$1 = this.lastResult + this.memory[dla.andBits(var3 >> 2, 255)] + this.accumulator;
          var4 = dupTemp$1;
          this.memory[var2] = dupTemp$1;
          dupTemp$2 = this.memory[dla.andBits(var4 >> 8, 1020) >> 2] + var3;
          this.lastResult = dupTemp$2;
          this.results[var2] = dupTemp$2;
        }
    }

    final int nextInt(byte param0) {
        if (this.remaining == 0) {
          this.generate((byte) 57);
          this.remaining = 256;
        }
        if (param0 != -41) {
          this.lastResult = -75;
        }
        int fieldTemp$0 = this.remaining - 1;
        this.remaining = this.remaining - 1;
        return this.results[fieldTemp$0];
    }

    IsaacCipher(int[] param0) {
        int var2_int = 0;
        try {
          this.results = new int[256];
          this.memory = new int[256];
          for (var2_int = 0; param0.length > var2_int; var2_int++) {
            this.results[var2_int] = param0[var2_int];
          }
          this.initialize(true);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "dq.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
