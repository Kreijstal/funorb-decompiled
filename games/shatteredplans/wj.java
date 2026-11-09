/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wj extends IntrusiveNode {
    int field_p;
    static String field_n;
    int field_q;
    int field_l;
    static String field_k;
    int field_h;
    int[] field_i;
    int field_o;
    int field_m;
    int field_j;

    final static boolean a(IntrusiveDeque param0, byte param1) {
        boolean stackIn_26_0 = false;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param1 >= -68) {
            return false;
          }
          PlacementOrder.field_w = FleetVisual.a(param0, bb.field_b, (byte) 115, TertiaryListSequence.field_k);
          if (1 == je.field_d) {
            jb.field_b = 0;
            am.field_Gb = PointsVictoryChecker.field_p;
            DialogRoot.field_C = SliderWidget.field_P;
            wl.field_f = FleetVisual.a(param0, DialogRoot.field_C, (byte) -41, am.field_Gb);
            stackIn_26_0 = (null != wl.field_f);
            return stackIn_26_0;
          }
          if (AllianceExpiredEvent.field_n == 1) {
            jb.field_b = jb.field_b + 1;
            if (rs.field_Db != null) {
              rs.field_Db.b(TertiaryListSequence.field_k, bb.field_b, -498);
              return true;
            }
            var2_int = (-TertiaryListSequence.field_k + am.field_Gb) * (am.field_Gb - TertiaryListSequence.field_k) + (-bb.field_b + DialogRoot.field_C) * (DialogRoot.field_C - bb.field_b);
            if (5 < jb.field_b &&
              25 < var2_int &&
              wl.field_f != null) {
              VerticalMenuSlider.field_w = wl.field_f.field_k - am.field_Gb;
              rs.field_Db = wl.field_f;
              DisplayNameForm.field_D = wl.field_f.field_t - DialogRoot.field_C;
            }
            return false;
          }
          if ((rs.field_Db == null ||
            !(jb.field_b >= 5)) &&
            TextInputPainter.a(wl.field_f, param0, (byte) 64)) {
            DualLinkDequeSequence.field_h = wl.field_f;
            if (null != DualLinkDequeSequence.field_h) {
              DualLinkDequeSequence.field_h.a(bb.field_b - DualLinkDequeSequence.field_h.field_t, 0, -DualLinkDequeSequence.field_h.field_k + TertiaryListSequence.field_k);
            }
          } else {
            DualLinkDequeSequence.field_h = null;
          }
          rs.field_Db = null;
          wl.field_f = null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_31_0 = var2;
          stackIn_31_1 = new StringBuilder().append("wj.D(");
          if (param0 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0) {
        Sprite stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        int stackIn_13_3 = 0;
        int stackIn_16_4;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        float var3 = 0.0f;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        nd[] var7 = null;
        Particle var7_ref = null;
        int var8 = 0;
        int var9 = 0;
        nd var9_ref_nd = null;
        int var10 = 0;
        nd[] var11 = null;
        int var1_intLifetime1;
        int var1_intLifetime2;
        int var2Lifetime1;
        int var2Lifetime2;
        int var8Lifetime1;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var3 = (float)FleetTrailPoint.field_m / 1000.0f + 0.15000000596046448f;
          var1_int = -(int)(200.0 * Math.sin((double)var3));
          var2 = (int)(Math.cos((double)var3) * 200.0) - 200;
          va.field_e.draw(var1_int, var2);
          var4 = -(FleetTrailPoint.field_m * 120 / 1000) + 176;
          var5 = 540 - var4;
          RandomAccessCacheFile.a(-111);
          if (var5 < 256) {
            var4 = 284;
            var5 = 256;
          }
          if (null == WeightedCacheEntry.field_u) {
            WeightedCacheEntry.field_u = MessageKind.field_b.copy();
            WeightedCacheEntry.field_u.bindAsRenderTarget();
          } else {
            WeightedCacheEntry.field_u.bindAsRenderTarget();
            MessageKind.field_b.drawOpaque(0, 0);
          }
          var1_intLifetime1 = -5;
          var2Lifetime1 = -80 + 100 * FleetTrailPoint.field_m / 1000;
          so.a(0, 0, var2Lifetime1 - var4 + DefendTask.field_s.field_x, DefensiveAi.field_r);
          OpacityWidget.popLegacyRasterState(0);
          var6 = 256;
          if (512 > FleetTrailPoint.field_m) {
            var6 = FleetTrailPoint.field_m >> 1;
            SoftwareRasterizer.fillCircle(320, var4 + 528, 400, 16777215);
          }
          if (param0 != 128) {
            return;
          }
          DefendTask.field_s.draw(var1_intLifetime1, var2Lifetime1);
          tg.a(var2Lifetime1, oe.field_c, (byte) 15, var1_intLifetime1);
          stackIn_13_0 = WeightedCacheEntry.field_u;
          stackIn_13_1 = 0;
          stackIn_13_2 = var4;
          stackIn_13_3 = var6;
          if (0 <= QuickChatCategoryDefinition.field_r) {
            if (QuickChatCategoryDefinition.field_r <= 256) {
              stackIn_16_4 = QuickChatCategoryDefinition.field_r;
            } else {
              stackIn_16_4 = 256;
            }
          } else {
            stackIn_16_4 = 0;
          }
          ((Sprite) (Object) stackIn_13_0).drawAdditive(stackIn_13_1, stackIn_13_2, stackIn_13_3 * stackIn_16_4 >> 8);
          WeightedCacheEntry.field_u.drawAdditive(0, var4, var6);
          var11 = MenuButton.field_C;
          var7 = var11;
          for (var8 = 0; var11.length > var8; var8++) {
            var9_ref_nd = var11[var8];
            if (0 != var9_ref_nd.field_a) {
              SoftwareRasterizer.addRadialGlowQ4(var9_ref_nd.field_e + var1_intLifetime1 << 4, var9_ref_nd.field_j + var2Lifetime1 << 4, var9_ref_nd.field_f, var9_ref_nd.field_a, MenuButton.field_u);
            }
          }
          var7_ref = (Particle) (DialWidget.field_K.startForward(0));
          while (var7_ref != null) {
            var2Lifetime2 = (int)var7_ref.field_n;
            var1_intLifetime2 = (int)var7_ref.field_l;
            for (var8Lifetime1 = 1; var8Lifetime1 < 50; var8Lifetime1++) {
              var9 = -var8Lifetime1 + var7_ref.field_q;
              SoftwareRasterizer.addRadialGlowQ4(var1_intLifetime2 << 4, var2Lifetime2 << 4, -var8Lifetime1 + 50, -(var8Lifetime1 * 2) + 100, MenuButton.field_u);
              if (var9 < 0) {
                var9 += 50;
              }
              var1_intLifetime2 = (int)var7_ref.field_o[var9];
              var2Lifetime2 = (int)var7_ref.field_i[var9];
            }
            SoftwareRasterizer.addRadialGlowQ4((int)var7_ref.field_l << 4, (int)var7_ref.field_n << 4, 128, 100, MenuButton.field_u);
            var7_ref = (Particle) (DialWidget.field_K.nextForward((byte) -71));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw UrlLoader.wrapThrowable((Throwable) ((Object) var1), "wj.C(" + param0 + ')');
        }
    }

    public static void clearStatics(byte param0) {
        if (param0 != 59) {
          field_k = (String) null;
        }
        field_n = null;
        field_k = null;
    }

    private wj() throws Throwable {
        throw new Error();
    }

    final static void a(int param0, int param1, lq param2) {
        CipherPacketBuffer var5 = null;
        int var4 = 0;
        try {
          var5 = js.field_f;
          var5.h(param1, param0 - 65);
          var5.position = var5.position + 1;
          var4 = var5.position;
          var5.writeByte(1, (byte) -59);
          var5.writeByte(param2.field_j, (byte) -104);
          var5.writeByte(param2.field_l, (byte) -75);
          if (param0 != 320) {
            field_n = (String) null;
          }
          var5.writeInt(11135, param2.field_i);
          var5.writeInt(11135, param2.field_n);
          var5.writeInt(param0 ^ 10815, param2.field_m);
          var5.writeInt(param0 + 10815, param2.field_h);
          var5.writeChecksum(var4, param0 - 446);
          var5.patchLengthByte(-var4 + var5.position, (byte) 127);
        } catch (RuntimeException runtimeException) {
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "wj.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_n = "Asking to join <%0>'s game...";
        field_k = "Service unavailable";
    }
}
