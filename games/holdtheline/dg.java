/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class dg {
    static ge field_a;
    static long field_d;
    static String[] field_b;
    static int field_c;

    final static int b(byte param0) {
        if (param0 != 65) {
          return -106;
        }
        return SpriteAsset.field_a;
    }

    final static void b(int param0) {
        String[] array$4 = null;
        String[] array$5 = null;
        int var6 = 0;
        int var1_int = 0;
        String var2 = null;
        int var3 = 0;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var12 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var3Lifetime1;
        var8 = HoldTheLine.field_D;
        try {
          if (SocketConnector.field_g != null) {
            return;
          }
          UrlPacketDownloader.field_h = nl.field_e.toLowerCase();
          ProxySocketConnector.field_l = TextHotspotRange.field_q.toLowerCase();
          SocketConnector.field_g = new String[14];
          SocketConnector.field_g[7] = WeightedLruCache.field_h;
          SocketConnector.field_g[10] = SpriteSheetAsset.field_h;
          if (param0 != -9342) {
            field_a = (ge) null;
          }
          SocketConnector.field_g[4] = StereoMusicSample.field_d;
          SocketConnector.field_g[8] = MarkerSliderRenderer.field_i;
          SocketConnector.field_g[6] = MessagePanel.field_K;
          SocketConnector.field_g[13] = CachedArchiveProvider.field_B;
          SocketConnector.field_g[5] = StereoMusicSample.field_d;
          SocketConnector.field_g[11] = SpriteSheetAsset.field_h;
          SocketConnector.field_g[0] = ArchiveRequest.field_o;
          uk.field_c = new String[27];
          SocketConnector.field_g[3] = StraightRoadSegment.field_H;
          SocketConnector.field_g[1] = Bzip2State.field_J;
          SocketConnector.field_g[9] = lj.field_d;
          SocketConnector.field_g[2] = StraightRoadSegment.field_H;
          uk.field_c[15] = StereoMusicSample.field_d;
          uk.field_c[14] = MessagePanel.field_K;
          uk.field_c[16] = StereoMusicSample.field_d;
          uk.field_c[18] = CurvedRoadSegment.field_J;
          uk.field_c[17] = uk.field_d;
          uk.field_c[1] = RotatedSpriteCache.field_i;
          uk.field_c[2] = IsaacPacketBuffer.field_s;
          uk.field_c[26] = eb.field_p;
          uk.field_c[4] = hk.field_b;
          uk.field_c[19] = nm.field_a;
          uk.field_c[9] = SoundCache.field_f;
          uk.field_c[13] = StraightRoadSegment.field_H;
          uk.field_c[11] = sa.field_f;
          uk.field_c[3] = IntrusiveNode.field_c;
          uk.field_c[7] = ka.field_e;
          uk.field_c[0] = ArchiveRequest.field_o;
          uk.field_c[20] = sa.field_a;
          uk.field_c[6] = hk.field_b;
          uk.field_c[12] = CachedArchiveProvider.field_B;
          uk.field_c[21] = gk.field_c;
          PacketBuffer.field_n = new String[]{uk.field_c[4], uk.field_c[0]};
          ki.field_i = new String[]{uk.field_c[9], uk.field_c[0]};
          DropTargetWidget.field_L = new String[]{uk.field_c[0], jc.field_d, b.field_e, o.field_b};
          var1_int = TextHotspotRange.field_i.length;
          var2 = Integer.toString(var1_int);
          for (var3 = 0; var1_int > var3; var3++) {
            TextHotspotRange.field_i[var3] = TextHotspotRange.field_i[var3] + ' ' + (var3 + 1) + "/" + var2;
          }
          DirectByteStorage.field_f = new String[8];
          ij.field_c[3] = new int[]{TextLineLayout.field_g};
          ij.field_c[2] = new int[]{MusicPatchEnvelope.field_a};
          BufferedSocket.field_g = new String[8];
          ij.field_c[1] = new int[]{MarkerSlider.field_G};
          ij.field_c[0] = new int[]{FadingDialog.field_I};
          BufferedSocket.field_g[0] = DelegatingCanvas.field_h;
          DirectByteStorage.field_f[0] = jh.a(MusicPatchPcmStream.field_n, param0 + 9217, DelegatingCanvas.field_h);
          BufferedSocket.field_g[1] = qh.field_a;
          DirectByteStorage.field_f[1] = jh.a(ra.field_cb, -125, qh.field_a);
          BufferedSocket.field_g[2] = ResizableDialog.field_Q;
          DirectByteStorage.field_f[2] = jh.a(q.field_b, -119, ResizableDialog.field_Q);
          BufferedSocket.field_g[3] = TextLineLayout.field_d;
          DirectByteStorage.field_f[3] = jh.a(vk.field_d, Vector2i.xor(param0, 9219), TextLineLayout.field_d);
          BufferedSocket.field_g[5] = fj.field_p;
          DirectByteStorage.field_f[5] = jh.a(PointPath.field_a, -128, fj.field_p);
          BufferedSocket.field_g[4] = ga.field_a;
          DirectByteStorage.field_f[4] = jh.a(jk.field_l, -120, ga.field_a);
          BufferedSocket.field_g[7] = fe.field_a;
          DirectByteStorage.field_f[7] = jh.a(i.field_l, param0 + 9221, fe.field_a);
          BufferedSocket.field_g[6] = DualNodeHashTable.field_d;
          DirectByteStorage.field_f[6] = jh.a(ResourceArchive.field_j, param0 + 9214, DualNodeHashTable.field_d);
          WidgetContainer.field_A = new String[4][];
          RaceWorld.field_gb = new String[4][];
          for (var3Lifetime1 = 0; 4 > var3Lifetime1; var3Lifetime1++) {
            var12 = RotatedSpriteAsset.field_g[var3Lifetime1];
            var5 = var12.length;
            array$4 = new String[var5];
            RaceWorld.field_gb[var3Lifetime1] = array$4;
            array$5 = new String[var5];
            WidgetContainer.field_A[var3Lifetime1] = array$5;
            for (var6 = 0; var5 > var6; var6++) {
              var7 = var12[var6];
              RaceWorld.field_gb[var3Lifetime1][var6] = BufferedSocket.field_g[var7];
              WidgetContainer.field_A[var3Lifetime1][var6] = DirectByteStorage.field_f[var7];
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw EntitySound.wrapException((Throwable) ((Object) var1), "dg.C(" + param0 + ')');
        }
    }

    final static boolean a(byte param0, char param1) {
        boolean stackIn_25_0 = false;
        int var2;
        var2 = -62 / ((param0 + 7) / 54);
        if (param1 < 48) {
          if (param1 < 65) {
            if (param1 >= 97 &&
              122 >= param1) {
              return true;
            }
            return false;
          }
          if (param1 <= 90) {
            return true;
          }
          stackIn_25_0 = (param1 >= 97) && (122 >= param1);
          return stackIn_25_0;
        }
        if (57 >= param1) {
          return true;
        }
        if (param1 >= 65 &&
          param1 <= 90) {
          return true;
        }
        if (param1 < 97) {
          return false;
        }
        if (122 < param1) {
          return false;
        }
        return true;
    }

    final static int a(int param0, int param1, int param2) {
        if (param1 == -1) {
          return param0 + rf.a(param2 - param0 + 1, Vector2f.field_c, param1 + 0);
        }
        return -64;
    }

    public static void clearSharedReferences(int param0) {
        if (param0 != 32137) {
          return;
        }
        field_b = null;
        field_a = null;
    }

    final static void a(boolean param0, java.math.BigInteger param1, PacketBuffer param2, PacketBuffer param3, java.math.BigInteger param4) {
        try {
          te.a(param1, param4, param3, 0, 126, param2.position, param2.payload);
          if (param0) {
            dg.clearSharedReferences(-78);
          }
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "dg.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(byte param0) {
        ih var4 = null;
        int var3 = HoldTheLine.field_D;
        try {
          if (eb.field_o != null &&
            !l.field_b) {
            LinkWidgetRenderer.a(3, (byte) -67, eb.field_o);
          }
          int var2 = 96 / ((-25 - param0) / 60);
          var4 = (ih) (fb.field_n.first((byte) 121));
          while (var4 != null) {
            na.a(4, var4, (byte) -79);
            var4 = (ih) (fb.field_n.next((byte) -75));
          }
          if (of.a(-969)) {
            ec.field_y = ie.a(10, 31043, 2, 0);
          }
          h.b((byte) -92);
          RoadSegment.a(of.a(-969), (byte) 97);
          NameSuggestionsPanel.a((byte) 80);
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "dg.A(" + param0 + ')');
        }
    }

    static {
        field_a = new ge();
    }
}
