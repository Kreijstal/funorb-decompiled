/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cj implements WidgetPainter {
    private int field_a;
    private int field_d;
    static String field_e;
    private int field_f;
    private int field_h;
    private BitmapFont field_b;
    private int field_c;
    private int field_g;

    public static void releaseStatics(int param0) {
        if (param0 <= 22) {
          return;
        }
        field_e = null;
    }

    final static boolean readNextGamePacket(int[] param0, int param1) {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        rha var4_ref_rha = null;
        int var4 = 0;
        rha var5 = null;
        int var7 = 0;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          if (LegacyOpenGlTexture1D.field_n != ProceduralTexture.field_p) {
            return false;
          }
          if (param1 != 0) {
            field_e = (String) null;
          }
          var2_long = bva.currentTimeMillis((byte) -107);
          if (WallCrusherComponent.field_H != 0 &&
            GameKeyHandler.field_b < 0) {
            var4_ref_rha = (rha) (vn.field_a.first(-80));
            if (var4_ref_rha != null &&
              var2_long > var4_ref_rha.field_f) {
              var4_ref_rha.unlink(115);
              uca.field_d = var4_ref_rha.field_g.length;
              WeaveOperator.field_q.position = 0;
              for (var5_int = 0; var5_int < uca.field_d; var5_int++) {
                WeaveOperator.field_q.payload[var5_int] = var4_ref_rha.field_g[var5_int];
              }
              vua.field_B = hla.field_xb;
              hla.field_xb = PlayerProfile.field_c;
              PlayerProfile.field_c = MembersUpsellMenu.field_z;
              MembersUpsellMenu.field_z = var4_ref_rha.field_i;
              return true;
            }
          }
          while (true) {
            if (GameKeyHandler.field_b < 0) {
              WeaveOperator.field_q.position = 0;
              if (!LegacyRidgedWaterNoise.ensureGamePacketBytes(1, -1)) {
                return false;
              }
              GameKeyHandler.field_b = WeaveOperator.field_q.readCipheredOpcode(-83);
              WeaveOperator.field_q.position = 0;
              uca.field_d = param0[GameKeyHandler.field_b];
            }
            if (!cla.g(param1 + 0)) {
              return false;
            }
            if (0 == WallCrusherComponent.field_H) {
              vua.field_B = hla.field_xb;
              hla.field_xb = PlayerProfile.field_c;
              PlayerProfile.field_c = MembersUpsellMenu.field_z;
              MembersUpsellMenu.field_z = GameKeyHandler.field_b;
              GameKeyHandler.field_b = -1;
              return true;
            }
            var4 = WallCrusherComponent.field_H;
            if (0.0 != IntNode.field_h) {
              var4 = (int)((double)var4 + PlatformBehaviour.field_p.nextGaussian() * IntNode.field_h);
              if (var4 < 0) {
                var4 = 0;
              }
            }
            var5 = new rha(var2_long + (long)var4, GameKeyHandler.field_b, new byte[uca.field_d]);
            for (var6 = 0; var6 < uca.field_d; var6++) {
              var5.field_g[var6] = WeaveOperator.field_q.payload[var6];
            }
            vn.field_a.addLast((byte) -98, var5);
            GameKeyHandler.field_b = -1;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_38_0 = var2;
          stackIn_38_1 = new StringBuilder().append("cj.A(");
          if (param0 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void paintWidget(UiWidget param0, int param1, int param2, int param3, boolean param4) {
        int var10 = 0;
        UiWidget stackIn_4_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        kd var12 = null;
        var11 = TombRacer.field_G ? 1 : 0;
        try {
          if (param0 instanceof kd) {
            stackIn_4_0 = (UiWidget) (param0);
          } else {
            stackIn_4_0 = null;
          }
          var12 = (kd) (stackIn_4_0);
          if (var12 != null) {
          }
          SoftwareRasterizer.fillRectangle(param1 + param0.field_i, param3 + param0.field_n, param0.field_m, param0.field_p, this.field_f);
          var7 = -(var12.field_E * 2) + param0.field_m;
          var8 = param1 + param0.field_i + var12.field_E;
          var9 = param0.field_n + param3 + var12.field_C;
          SoftwareRasterizer.drawLine(var8, var9, var8 + var7, var9, this.field_a);
          if (param2 != 16777215) {
            return;
          }
          for (var10 = var12.c(-3) - 1; 0 <= var10; var10--) {
            SoftwareRasterizer.fillCircle(var12.a(var10, (byte) -14) * var7 / var12.b(24857) + var8, var9, this.field_d, this.field_c);
          }
          if (this.field_b != null) {
            this.field_b.drawCenteredText(var12.field_o, var7 / 2 + var8, var12.field_C + var9 + this.field_b.field_m, this.field_g, this.field_h);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_15_0 = var6;
          stackIn_15_1 = new StringBuilder().append("cj.B(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    cj(BitmapFont param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        try {
          this.field_f = param4;
          this.field_d = param5;
          this.field_c = param6;
          this.field_b = param0;
          this.field_g = param1;
          this.field_h = param2;
          this.field_a = param3;
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "cj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    static {
        field_e = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
    }
}
