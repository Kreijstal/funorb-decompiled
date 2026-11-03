/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class di extends IntrusiveNode {
    int field_l;
    int field_n;
    static String field_j;
    static String field_q;
    static Sprite[] field_i;
    int field_h;
    static String field_k;
    int field_o;
    static boolean[] field_p;
    static int field_m;

    final static boolean a(int[] param0, int param1) {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        sk var4_ref_sk = null;
        int var4 = 0;
        sk var5 = null;
        int var7 = 0;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (Wormhole.field_j != ih.field_f) {
            return false;
          }
          var2_long = pr.currentTimeMillis(14274);
          if (0 != ArchiveRequest.field_o &&
            ArchiveNetworkClient.field_b < 0) {
            var4_ref_sk = (sk) (oe.field_h.startForward(0));
            if (var4_ref_sk != null &&
              var4_ref_sk.field_l < var2_long) {
              var4_ref_sk.unlink((byte) -61);
              rr.field_t = var4_ref_sk.field_h.length;
              sa.field_a.position = 0;
              for (var5_int = 0; rr.field_t > var5_int; var5_int++) {
                sa.field_a.payload[var5_int] = var4_ref_sk.field_h[var5_int];
              }
              IterableNodeHashTable.field_e = SliderPainter.field_g;
              SliderPainter.field_g = kp.field_n;
              kp.field_n = BufferedCacheFile.field_e;
              BufferedCacheFile.field_e = var4_ref_sk.field_j;
              return true;
            }
          }
          if (param1 != 1) {
            field_i = (Sprite[]) null;
          }
          while (true) {
            if (ArchiveNetworkClient.field_b < 0) {
              sa.field_a.position = 0;
              if (!StarAnnotation.a(param1 ^ -73, 1)) {
                return false;
              }
              ArchiveNetworkClient.field_b = sa.field_a.h((byte) 126);
              sa.field_a.position = 0;
              rr.field_t = param0[ArchiveNetworkClient.field_b];
            }
            if (!uc.d((byte) -50)) {
              return false;
            }
            if (ArchiveRequest.field_o == 0) {
              IterableNodeHashTable.field_e = SliderPainter.field_g;
              SliderPainter.field_g = kp.field_n;
              kp.field_n = BufferedCacheFile.field_e;
              BufferedCacheFile.field_e = ArchiveNetworkClient.field_b;
              ArchiveNetworkClient.field_b = -1;
              return true;
            }
            var4 = ArchiveRequest.field_o;
            if (0.0 != aq.field_h) {
              var4 = (int)((double)var4 + na.field_u.nextGaussian() * aq.field_h);
              if (var4 < 0) {
                var4 = 0;
              }
            }
            var5 = new sk(var2_long + (long)var4, ArchiveNetworkClient.field_b, new byte[rr.field_t]);
            for (var6 = 0; var6 < rr.field_t; var6++) {
              var5.field_h[var6] = sa.field_a.payload[var6];
            }
            oe.field_h.addLast((byte) -113, var5);
            ArchiveNetworkClient.field_b = -1;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_40_0 = var2;
          stackIn_40_1 = new StringBuilder().append("di.B(");
          if (param0 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_40_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(',').append(param1).append(')').toString());
        }
    }

    final static ve a(String param0, int param1) {
        String var2 = null;
        ve var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        ve stackIn_18_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (CipherPacketBuffer.field_m == null) {
            return null;
          }
          var6 = (CharSequence) ((Object) param0);
          var2 = ji.a(var6, true);
          if (param1 <= 115) {
            di.clearStatics(false);
          }
          if (var2 == null) {
            var2 = param0;
          }
          var3 = (ve) (CipherPacketBuffer.field_m.get(65280, (long)var2.hashCode()));
          while (var3 != null) {
            var7 = (CharSequence) ((Object) var3.field_Ab);
            var4 = ji.a(var7, true);
            if (var4 == null) {
              var4 = var3.field_Ab;
            }
            if (var4.equals(var2)) {
              stackIn_18_0 = var3;
              return stackIn_18_0;
            }
            var3 = (ve) (CipherPacketBuffer.field_m.getNextWithKey((byte) -116));
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_23_0 = var2_ref;
          stackIn_23_1 = new StringBuilder().append("di.D(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(Star param0, boolean param1, PacketBuffer param2) {
        PacketBuffer stackIn_2_0 = null;
        int stackIn_3_1 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          stackIn_2_0 = (PacketBuffer) (param2);
          if (param0 != null) {
            stackIn_3_1 = param0.field_p;
          } else {
            stackIn_3_1 = -1;
          }
          ((PacketBuffer) (Object) stackIn_2_0).writeByte(stackIn_3_1, (byte) -57);
          if (param1) {
            di.clearStatics(true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("di.C(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    public static void clearStatics(boolean param0) {
        field_j = null;
        field_k = null;
        field_q = null;
        field_i = null;
        if (!param0) {
          return;
        }
        field_p = null;
    }

    final static void a(boolean param0, boolean param1) {
        AnimatedPanel stackIn_7_0 = null;
        boolean stackIn_8_1 = false;
        AnimatedPanel stackIn_11_0 = null;
        boolean stackIn_12_1 = false;
        AnimatedPanel stackIn_24_0 = null;
        boolean stackIn_25_1 = false;
        AnimatedPanel stackIn_28_0 = null;
        boolean stackIn_29_1 = false;
        BufferedSocket.a(-6187, SoftwareRasterizer.field_b + 640 >> 1, SoftwareRasterizer.field_k, 0, -640 + SoftwareRasterizer.field_b >> 1);
        if (PlacementOrder.field_t > 0) {
          if (gn.field_y != null) {
            gn.field_y.drawOpaque(MapViewState.field_j.field_hb, 0);
          }
          stackIn_7_0 = MapViewState.field_j;
          stackIn_8_1 = (param1) && (!IntrusiveDequeCursor.field_b);
          ((AnimatedPanel) (Object) stackIn_7_0).drawFullRaster(stackIn_8_1, 102);
          stackIn_11_0 = AchievementProgress.field_i;
          stackIn_12_1 = (param1) && (!IntrusiveDequeCursor.field_b);
          ((AnimatedPanel) (Object) stackIn_11_0).drawFullRaster(stackIn_12_1, 119);
        }
        if (param0) {
          field_p = (boolean[]) null;
        }
        if (!(Archive.field_b <= 0) ||
          !(ee.field_k <= 0)) {
          if (null != gn.field_y) {
            gn.field_y.drawOpaque(am.field_xb.field_hb, 0);
          }
          stackIn_24_0 = am.field_xb;
          stackIn_25_1 = (param1) && (!IntrusiveNodeHashTable.field_e);
          ((AnimatedPanel) (Object) stackIn_24_0).drawFullRaster(stackIn_25_1, 123);
          stackIn_28_0 = IntrusiveDeque.field_g;
          stackIn_29_1 = (param1) && (!IntrusiveNodeHashTable.field_e);
          ((AnimatedPanel) (Object) stackIn_28_0).drawFullRaster(stackIn_29_1, 115);
        }
        Star.f((byte) 123);
    }

    di() {
    }

    final static void a(int param0, boolean param1, int param2) {
        ScrollPane stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        boolean stackIn_6_3 = false;
        AnimatedPanel stackIn_20_0 = null;
        String stackIn_21_1 = null;
        int stackIn_24_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        IntrusiveDeque var4 = null;
        Object var5 = null;
        ve var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var13_ref_String = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        fc var16 = null;
        fc var17 = null;
        var15 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param0 != -7904) {
            return;
          }
          stackIn_5_0 = wg.field_a.field_Db;
          stackIn_5_1 = param2 * ((cr.field_c + 2) * 3);
          stackIn_5_2 = 2 + cr.field_c;
          stackIn_6_3 = (wg.field_a.field_Db == DerelictVictoryChecker.field_l);
          var3_int = ((ScrollPane) (Object) stackIn_5_0).a(stackIn_5_1, stackIn_5_2, stackIn_6_3, -76, param1, 2) ? 1 : 0;
          var4 = wg.field_a.field_Eb.field_M;
          if (2 != po.field_b &&
            1 != po.field_b) {
            wg.field_a.field_s = false;
            wg.field_a.field_Db.field_zb.field_z = tb.field_c;
            MatchingTextValidator.a(false, wg.field_a.field_Eb);
            return;
          }
          wg.field_a.field_Db.field_zb.field_z = null;
          wg.field_a.field_s = true;
          var5 = null;
          var6 = (ve) (var4.startForward(param0 ^ -7904));
          while (var6 != null) {
            var7 = 0;
            if (null == var6.field_M) {
              var6.field_Cb = new AnimatedPanel(0L, ArrayWidgetGroup.field_E);
              var6.addChild(param0 ^ -7900, var6.field_Cb);
              var6.field_Db = new AnimatedPanel(0L, ArrayWidgetGroup.field_E);
              var6.addChild(4, var6.field_Db);
              var7 = 1;
              var6.markDirty((byte) -123);
            }
            var6.field_K = wg.field_a.field_Eb.field_K;
            var6.field_Cb.setTarget(var6.field_K, cr.field_c, (byte) 78, 0, 0);
            var8 = 0;
            if (var6.field_Bb != null &&
              !var6.field_Bb.equals("")) {
              var6.field_Db.field_jb = 16737894;
              var6.field_Db.field_pb = BufferedSocket.field_i;
              var8 = 1;
              var6.field_Db.setTarget(3 + BufferedSocket.field_i.field_o, cr.field_c, (byte) 126, 0, 0);
            }
            var9 = 0;
            var10 = var6.field_K;
            if (var8 != 0) {
              var9 = BufferedSocket.field_i.field_o + 3;
              var10 = var10 - var9;
            }
            stackIn_20_0 = var6.field_Cb;
            if (0 < var10) {
              stackIn_21_1 = nq.a(var6.field_Cb.field_nb, var6.field_Ab, var10);
            } else {
              stackIn_21_1 = var6.field_Ab;
            }
            stackIn_20_0.field_z = stackIn_21_1;
            stackIn_24_0 = (var6.field_Cb.field_z.equals(var6.field_Ab)) ? 0 : 1;
            var11 = stackIn_24_0;
            var6.field_Cb.setTarget(var10, cr.field_c, (byte) 39, 0, var9);
            if (var3_int == 0) {
              var6.field_gb = cr.field_c - var6.field_mb;
            }
            if (var7 != 0) {
              wg.field_a.field_Eb.layoutAfter(2, (AnimatedPanel) (var5), var6, (byte) 55);
            }
            if (var6.field_Db != null &&
              var6.field_Db.field_L) {
              dn.field_k = var6.field_Bb;
            } else {
              if (var6.field_Cb.field_L &&
                var11 != 0) {
                dn.field_k = var6.field_Ab;
              }
            }
            var5 = var6;
            if (0 != var6.field_rb) {
              SliderPainter.a((int[]) null, 0L, var6.field_Ab, var6.field_Eb, param0 + 8197, wg.field_a.field_Db, var6, -1, -1);
              var16 = DerelictVictoryChecker.field_m;
              var13_ref_String = TutorialVictoryChecker.field_o;
              var16.field_j.a(1, 7, var13_ref_String);
              var17 = DerelictVictoryChecker.field_m;
              var13 = PointsVictoryChecker.field_p;
              var14 = SliderWidget.field_P;
              var17.field_j.b(0, 0, 0, var13, var14);
            }
            var6 = (ve) (var4.nextForward((byte) -71));
          }
          if (wg.field_a.field_Fb.field_rb != 0) {
            lg.field_e = new jp(wg.field_a.field_Fb.field_B, wg.field_a.field_Fb.field_N, wg.field_a.field_Fb.field_K, wg.field_a.field_Fb.field_mb, PacketBuffer.field_l, MusicCrossfadeStream.field_v, SpriteState.field_u, SpriteState.field_u);
            MapViewState.field_b = 2;
          }
          if (wg.field_a.field_yb.field_rb == 0) {
            return;
          }
          lg.field_e = new jp(wg.field_a.field_yb.field_B, wg.field_a.field_yb.field_N, wg.field_a.field_yb.field_K, wg.field_a.field_yb.field_mb, Star.field_E, MusicCrossfadeStream.field_v, SpriteState.field_u, SpriteState.field_u);
          MapViewState.field_b = 3;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw UrlLoader.wrapThrowable((Throwable) ((Object) var3), "di.F(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_j = "Owner";
        field_k = "Public chat is unavailable while setting up a rated game.";
        field_p = new boolean[112];
    }
}
