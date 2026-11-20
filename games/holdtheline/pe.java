/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pe {
    static String field_d;
    static int field_e;
    static NamedSoundEffect field_b;
    static int[] field_g;
    static String field_c;
    static int field_f;
    static int[] field_a;

    final static void a(int param0, int param1, int param2, int param3) {
        int var9 = 0;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var13 = HoldTheLine.field_D;
        try {
          var4_int = param0 / 2;
          var5 = param0 * 15 / 16;
          var6 = param0 / 32;
          var7 = param0 * 15 / 16;
          var8 = param0 * 115 / 128;
          for (var9 = 0; var8 > var9; var9++) {
            var10 = var4_int + (-var4_int + var6) * var9 / var8;
            var11 = var5 + var9 * (var7 - var5) / var8;
            var12 = -96 * var9 / var8 + 160;
            SoftwareRasterizer.drawHorizontalLineAlpha(var10 + (-(param0 / 2) + param2), -(param0 / 2) + param3 + var9, var11 - var10, 16777088, var12);
          }
          if (param1 != 4209) {
            field_d = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw EntitySound.wrapException((Throwable) ((Object) var4), "pe.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void clearSharedReferences(int param0) {
        if (param0 != 0) {
          return;
        }
        field_a = null;
        field_b = null;
        field_g = null;
        field_d = null;
        field_c = null;
    }

    final static void a(int param0, boolean param1, byte param2) {
        int stackIn_36_0 = 0;
        int stackIn_39_0 = 0;
        String[] stackIn_46_0 = null;
        int stackIn_46_1 = 0;
        String stackIn_47_2 = null;
        String[] stackIn_51_0 = null;
        int stackIn_51_1 = 0;
        int stackIn_51_2 = 0;
        int stackIn_51_3 = 0;
        String stackIn_54_2 = null;
        String stackIn_88_0 = null;
        int stackIn_88_1 = 0;
        boolean stackIn_89_2 = false;
        int stackIn_113_0 = 0;
        int stackIn_114_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        String[] var4_ref_String__ = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String[] var11 = null;
        String var12 = null;
        String var13 = null;
        String[] var4_ref_String__Lifetime1;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var5Lifetime4;
        int var6Lifetime1;
        int var8Lifetime1;
        int var3_intLifetime1;
        int var4Lifetime1;
        int var4Lifetime2;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime2;
        int var8Lifetime3;
        int var5Lifetime2Lifetime1;
        int var7Lifetime1Lifetime1;
        var10 = HoldTheLine.field_D;
        try {
          oi.field_f = true;
          WhirlpoolHasher.field_h = param0;
          if (WhirlpoolHasher.field_h == 0) {
            var3_int = RotatedSpriteCache.a(CheckboxWidget.field_G, fm.field_c, GzipDecompressor.field_c, (byte) 115, IndexedSpriteState.field_j);
            var4 = var3_int + 3;
            cd.field_f = new int[var4];
            ClientException.field_b = new String[var4];
            for (var5 = 0; var4 > var5; var5++) {
              cd.field_f[var5] = -1;
            }
            ClientException.field_e = new int[2];
            for (var5 = 0; var5 < var3_int; var5++) {
              ClientException.field_b[var5] = GzipDecompressor.field_c[var5];
            }
            ClientException.field_b[var4 - 3] = "";
            ClientException.field_b[var4 - 2] = RotatedSpriteCache.field_e;
            cd.field_f[-2 + var4] = 0;
            ClientException.field_e[0] = 4;
            ClientException.field_b[-1 + var4] = h.field_f;
            cd.field_f[var4 - 1] = 1;
            ClientException.field_e[1] = 5;
          } else if (WhirlpoolHasher.field_h == 1) {
            var3_int = RotatedSpriteCache.a(CheckboxWidget.field_G, fm.field_c, GzipDecompressor.field_c, (byte) -95, IndexedSpriteState.field_j);
            var4 = 2 + var3_int;
            cd.field_f = new int[var4];
            ClientException.field_b = new String[var4];
            for (var5 = 0; var4 > var5; var5++) {
              cd.field_f[var5] = -1;
            }
            ClientException.field_e = new int[1];
            for (var5 = 0; var3_int > var5; var5++) {
              ClientException.field_b[var5] = GzipDecompressor.field_c[var5];
            }
            ClientException.field_b[var4 - 2] = "";
            ClientException.field_b[-1 + var4] = h.field_f;
            cd.field_f[var4 - 1] = 0;
            ClientException.field_e[0] = 5;
          } else if (WhirlpoolHasher.field_h != 2) {
            if (WhirlpoolHasher.field_h == 3) {
              if (wi.field_b.field_f) {
                var3_int = RotatedSpriteCache.a(CheckboxWidget.field_G, CheckboxWidget.field_J, GzipDecompressor.field_c, (byte) -60, IndexedSpriteState.field_j);
              } else {
                var3_int = RotatedSpriteCache.a(CheckboxWidget.field_G, CheckboxRenderer.field_w, GzipDecompressor.field_c, (byte) -70, IndexedSpriteState.field_j);
              }
              var4 = var3_int + 2;
              cd.field_f = new int[var4];
              ClientException.field_b = new String[var4];
              for (var5 = 0; var5 < var4; var5++) {
                cd.field_f[var5] = -1;
              }
              ClientException.field_e = new int[1];
              for (var5 = 0; var5 < var3_int; var5++) {
                ClientException.field_b[var5] = GzipDecompressor.field_c[var5];
              }
              ClientException.field_b[-2 + var4] = "";
              ClientException.field_b[-1 + var4] = h.field_f;
              cd.field_f[-1 + var4] = 0;
              ClientException.field_e[0] = 5;
            } else if (WhirlpoolHasher.field_h == 4) {
              var3_int = RotatedSpriteCache.a(CheckboxWidget.field_G, TextWidgetStyle.field_m, GzipDecompressor.field_c, (byte) 106, IndexedSpriteState.field_j);
              var4 = 2 + var3_int;
              cd.field_f = new int[var4];
              ClientException.field_b = new String[var4];
              for (var5 = 0; var4 > var5; var5++) {
                cd.field_f[var5] = -1;
              }
              ClientException.field_e = new int[1];
              for (var5 = 0; var3_int > var5; var5++) {
                ClientException.field_b[var5] = GzipDecompressor.field_c[var5];
              }
              ClientException.field_b[var4 - 2] = "";
              ClientException.field_b[var4 - 1] = h.field_f;
              cd.field_f[-1 + var4] = 0;
              ClientException.field_e[0] = 5;
            } else {
              if (5 != WhirlpoolHasher.field_h) {
                throw new IllegalArgumentException();
              }
              var3_int = RotatedSpriteCache.a(CheckboxWidget.field_G, hc.field_c, GzipDecompressor.field_c, (byte) 119, IndexedSpriteState.field_j);
              var4 = var3_int + 3;
              ClientException.field_b = new String[var4];
              cd.field_f = new int[var4];
              for (var5 = 0; var4 > var5; var5++) {
                cd.field_f[var5] = -1;
              }
              ClientException.field_e = new int[2];
              for (var5 = 0; var3_int > var5; var5++) {
                ClientException.field_b[var5] = GzipDecompressor.field_c[var5];
              }
              ClientException.field_b[var4 - 3] = "";
              ClientException.field_b[-2 + var4] = CourseDefinition.field_i;
              cd.field_f[var4 - 2] = 0;
              ClientException.field_e[0] = 3;
              ClientException.field_b[-1 + var4] = h.field_f;
              cd.field_f[-1 + var4] = 1;
              ClientException.field_e[1] = 5;
            }
          } else {
            var3_int = RotatedSpriteCache.a(CheckboxWidget.field_G, LoginCredentials.substituteIndexedTokens(qg.field_a, new String[]{"<br><%0><br>"}, true), GzipDecompressor.field_c, (byte) -59, IndexedSpriteState.field_j);
            var4 = -1;
            for (var5 = 0; var5 < var3_int; var5++) {
              if (!"<%0>".equals(GzipDecompressor.field_c[var5])) {
                continue;
              }
              var4 = var5;
              break;
            }
            if (var4 == -1) {
              throw new IllegalStateException();
            }
            qg.field_b = new String[var4];
            ArrayOperations.copyObjects(GzipDecompressor.field_c, 0, qg.field_b, 0, var4);
            DelayedServerPacket.field_j = new String[-1 + (var3_int - var4)];
            ArrayOperations.copyObjects(GzipDecompressor.field_c, var4 + 1, DelayedServerPacket.field_j, 0, -var4 + var3_int - 1);
            var3_int = RotatedSpriteCache.a(CheckboxWidget.field_G, LoginCredentials.substituteIndexedTokens(b.field_b, new String[]{"<br><%0><br>"}, true), GzipDecompressor.field_c, (byte) 118, IndexedSpriteState.field_j);
            var4 = -1;
            for (var5 = 0; var5 < var3_int; var5++) {
              if (!"<%0>".equals(GzipDecompressor.field_c[var5])) {
                continue;
              }
              var4 = var5;
              break;
            }
            if (var4 == -1) {
              throw new IllegalStateException();
            }
            dg.field_b = new String[var4];
            ArrayOperations.copyObjects(GzipDecompressor.field_c, 0, dg.field_b, 0, var4);
            pb.field_a = new String[-1 + (-var4 + var3_int)];
            ArrayOperations.copyObjects(GzipDecompressor.field_c, 1 + var4, pb.field_a, 0, var3_int - var4 - 1);
            if (dg.field_b.length > qg.field_b.length) {
              stackIn_36_0 = dg.field_b.length;
            } else {
              stackIn_36_0 = qg.field_b.length;
            }
            var5 = stackIn_36_0;
            if (pb.field_a.length > DelayedServerPacket.field_j.length) {
              stackIn_39_0 = pb.field_a.length;
            } else {
              stackIn_39_0 = DelayedServerPacket.field_j.length;
            }
            var6 = stackIn_39_0;
            var7 = var5 + (7 + var6);
            ClientException.field_b = new String[var7];
            cd.field_f = new int[var7];
            for (var8 = 0; var8 < var7; var8++) {
              cd.field_f[var8] = -1;
            }
            ClientException.field_e = new int[2];
            ClientException.field_b[1] = PathWaypoint.field_k;
            cd.field_f[1] = 0;
            ClientException.field_b[0] = rc.field_b;
            cd.field_f[3] = 1;
            ClientException.field_b[2] = RotatedSpriteCache.field_k;
            ClientException.field_e[0] = 5;
            ClientException.field_b[5] = "";
            ClientException.field_b[3] = d.field_d;
            ClientException.field_e[1] = 2;
            ClientException.field_b[4] = wl.field_d;
            for (var8Lifetime2 = 0; var5 > var8Lifetime2; var8Lifetime2++) {
              stackIn_46_0 = ClientException.field_b;
              stackIn_46_1 = var8Lifetime2 + 6;
              if (-var5 + (var8Lifetime2 + dg.field_b.length) < 0) {
                stackIn_47_2 = "";
              } else {
                stackIn_47_2 = dg.field_b[-var5 + var8Lifetime2 + dg.field_b.length];
              }
              stackIn_46_0[stackIn_46_1] = stackIn_47_2;
            }
            ClientException.field_b[6 + var5] = null;
            cd.field_f[var5 + 6] = -2;
            for (var8Lifetime3 = 0; var8Lifetime3 < var6; var8Lifetime3++) {
              stackIn_51_0 = ClientException.field_b;
              stackIn_51_1 = var5 + 7 + var8Lifetime3;
              stackIn_51_2 = ~var8Lifetime3;
              stackIn_51_3 = ~pb.field_a.length;
              if (stackIn_51_2 > stackIn_51_3) {
                stackIn_54_2 = pb.field_a[var8Lifetime3];
              } else {
                stackIn_54_2 = "";
              }
              stackIn_51_0[stackIn_51_1] = stackIn_54_2;
            }
            TutorialAction.field_g = bb.b(-1);
          }
          TextFieldRenderer.field_q.field_b = ClientException.field_e.length;
          var3_intLifetime1 = 0;
          for (var4Lifetime1 = 0; var4Lifetime1 < ClientException.field_b.length; var4Lifetime1++) {
            stackIn_88_0 = ClientException.field_b[var4Lifetime1];
            stackIn_88_1 = -113;
            stackIn_89_2 = !(cd.field_f[var4Lifetime1] < 0);
            var5Lifetime1 = h.measureMenuTextWidthWithIntGuard(stackIn_88_0, stackIn_88_1, stackIn_89_2);
            if (var5Lifetime1 > var3_intLifetime1) {
              var3_intLifetime1 = var5Lifetime1;
            }
          }
          if (2 == WhirlpoolHasher.field_h) {
            var11 = qg.field_b;
            var4_ref_String__ = var11;
            for (var5Lifetime2 = 0; var5Lifetime2 < var11.length; var5Lifetime2++) {
              var12 = var11[var5Lifetime2];
              var7Lifetime1 = h.measureMenuTextWidthWithIntGuard(var12, -113, false);
              if (var7Lifetime1 > var3_intLifetime1) {
                var3_intLifetime1 = var7Lifetime1;
              }
            }
            var4_ref_String__Lifetime1 = DelayedServerPacket.field_j;
            for (var5Lifetime2Lifetime1 = 0; var4_ref_String__Lifetime1.length > var5Lifetime2Lifetime1; var5Lifetime2Lifetime1++) {
              var13 = var4_ref_String__Lifetime1[var5Lifetime2Lifetime1];
              var7Lifetime1Lifetime1 = h.measureMenuTextWidthWithIntGuard(var13, -113, false);
              if (var3_intLifetime1 < var7Lifetime1Lifetime1) {
                var3_intLifetime1 = var7Lifetime1Lifetime1;
              }
            }
          }
          var4Lifetime2 = 95 / ((-38 - param2) / 48);
          NanoTickClock.field_d = NanoTickClock.field_i - (var3_intLifetime1 >> 1);
          vf.field_t = var3_intLifetime1 + (NanoTickClock.field_i - (var3_intLifetime1 >> 1));
          TrackBoundary.field_v = (vf.field_w + ContentTransitionDialog.field_bb << 1) * TextFieldRenderer.field_q.field_b;
          for (var5Lifetime3 = 0; var5Lifetime3 < ClientException.field_b.length; var5Lifetime3++) {
            stackIn_113_0 = TrackBoundary.field_v;
            if (0 <= cd.field_f[var5Lifetime3]) {
              stackIn_114_1 = TickClock.field_b;
            } else {
              stackIn_114_1 = CurvedRoadSegment.field_M;
            }
            TrackBoundary.field_v = stackIn_113_0 + stackIn_114_1;
          }
          ie.field_j = Vector2f.field_i - (TrackBoundary.field_v >> 1);
          fi.field_lb = new int[ClientException.field_b.length][];
          var5Lifetime4 = 0;
          var6Lifetime1 = ie.field_j;
          while (var5Lifetime4 < ClientException.field_b.length) {
            var7Lifetime2 = cd.field_f[var5Lifetime4];
            if (0 <= var7Lifetime2) {
              var8Lifetime1 = h.measureMenuTextWidthWithIntGuard(ClientException.field_b[var5Lifetime4], -113, true);
              var6Lifetime1 = var6Lifetime1 + ContentTransitionDialog.field_bb;
              var9 = -(var8Lifetime1 >> 1) + NanoTickClock.field_i;
              fi.field_lb[var5Lifetime4] = new int[4];
              fi.field_lb[var5Lifetime4][0] = var9 - DropTargetWidget.field_G;
              fi.field_lb[var5Lifetime4][1] = var6Lifetime1;
              fi.field_lb[var5Lifetime4][2] = (DropTargetWidget.field_G << 1) + var8Lifetime1;
              fi.field_lb[var5Lifetime4][3] = (vf.field_w << 1) + TickClock.field_b;
              var6Lifetime1 = var6Lifetime1 + (ContentTransitionDialog.field_bb + ((vf.field_w << 1) + TickClock.field_b));
            } else {
              var6Lifetime1 = var6Lifetime1 + CurvedRoadSegment.field_M;
            }
            var5Lifetime4++;
          }
          if (WhirlpoolHasher.field_h == 2) {
            TextFieldRenderer.field_q.a(-1, 0, param1, -1);
          } else {
            TextFieldRenderer.field_q.a(cm.a((byte) 110, FullscreenErrorDialog.field_X, NodeHashTableIterator.field_g), 0, param1, 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw EntitySound.wrapException((Throwable) ((Object) var3), "pe.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_d = "<col=1><%0></col><br><br>Power: <%1><br>Speed: <%2><br>Grip: <%3>";
        field_e = 480;
        field_f = 2;
        field_a = new int[8192];
    }
}
