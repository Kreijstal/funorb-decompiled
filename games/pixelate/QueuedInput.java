/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class QueuedInput extends IntrusiveNode {
    static byte[] field_l;
    int field_k;
    int field_m;

    public static void releaseStatics(int param0) {
        field_l = null;
        if (param0 != -5778) {
          PacketBuffer var2 = (PacketBuffer) null;
          QueuedInput.readPackedRankingValues(-60, (PacketBuffer) null);
        }
    }

    final static void blendInterpolatedHalfRgbSpan(int param0, int param1, byte param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int[] var10 = null;
        RuntimeException var10_ref = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var16 = Pixelate.field_H ? 1 : 0;
        try {
          while (true) {
            param0--;
            if (param0 < 0) {
              if (param2 <= -92) {
                return;
              }
              QueuedInput.a(true, 41, true);
              return;
            }
            var17 = param3;
            var10 = var17;
            var11 = param1;
            var12 = param8;
            var13 = param4;
            var14 = param7;
            var15 = 8355711 & var17[var11] >> 1;
            var10[var11] = (cm.bitAnd(33423531, var13) >> 9) + cm.bitAnd(var12 >> 1, 16711680) + cm.bitAnd(255, var14 >> 17) + var15;
            param1++;
            param7 = param7 + param6;
            param4 = param4 + param9;
            param8 = param8 + param5;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10_ref = decompiledCaughtException;
          stackIn_8_0 = var10_ref;
          stackIn_8_1 = new StringBuilder().append("rd.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(')').toString());
        }
    }

    final static void writeSettingsCookie(String param0, int param1, java.applet.Applet param2) {
        try {
          RuntimeException stackIn_13_0 = null;
          StringBuilder stackIn_13_1 = null;
          String stackIn_14_2 = null;
          StringBuilder stackIn_16_1 = null;
          String stackIn_17_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var3 = null;
          RuntimeException var3_ref = null;
          String var4 = null;
          String var5 = null;
          java.applet.Applet var6 = null;
          String var7 = null;
          String var8 = null;
          String var5Lifetime1;
          String var5Lifetime2;
          String var5Lifetime3;
          String var5Lifetime4;
          String var5Lifetime5;
          String var5Lifetime6;
          try {
            ArchiveProvider.field_c = param0;
            try {
              if (param1 <= 124) {
                var6 = (java.applet.Applet) null;
                QueuedInput.writeSettingsCookie((String) null, -73, (java.applet.Applet) null);
              }
              var7 = param2.getParameter("cookieprefix");
              var5 = var7;
              var5Lifetime1 = var7;
              var4 = param2.getParameter("cookiehost");
              var5Lifetime2 = var4;
              var5Lifetime3 = var4;
              var8 = var7 + "settings=" + param0 + "; version=1; path=/; domain=" + var4;
              var5Lifetime4 = var8;
              var5Lifetime5 = var8;
              if (param0.length() == 0) {
                var5Lifetime6 = var8 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
              } else {
                var5Lifetime6 = var8 + "; Expires=" + SoundCache.a(10, hm.monotonicMillis(64) + 94608000000L) + "; Max-Age=" + 94608000L;
              }
              JavaScriptBridge.evaluateScript(param2, (byte) -121, "document.cookie=\"" + var5Lifetime6 + "\"");
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3 = decompiledCaughtException;
            }
            ib.updatePageLinks(param2, false);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_13_0 = var3_ref;
            stackIn_13_1 = new StringBuilder().append("rd.A(");
            if (param0 == null) {
              stackIn_14_2 = "null";
            } else {
              stackIn_14_2 = "{...}";
            }
            stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_17_2 = "null";
            } else {
              stackIn_17_2 = "{...}";
            }
            throw aa.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(boolean param0, int param1, boolean param2) {
        if (param1 == -17130) {
          RisingBubble.showLoginDialog(param1 ^ 17146, param0, param2, (String) null);
          return;
        }
        field_l = (byte[]) null;
        RisingBubble.showLoginDialog(param1 ^ 17146, param0, param2, (String) null);
    }

    final static boolean fillIncomingBuffer(int param0, boolean param1) {
        try {
          if (param1) {
            field_l = (byte[]) null;
          }
          if (!(param0 > MusicCrossfadeStream.field_o.position)) {
            return true;
          }
          if (null == NodeHashTableIterator.field_e) {
            return false;
          }
          int var2_int = NodeHashTableIterator.field_e.a(-70);
          if (var2_int > 0) {
            if (!(-MusicCrossfadeStream.field_o.position + param0 >= var2_int)) {
              var2_int = param0 - MusicCrossfadeStream.field_o.position;
            }
            NodeHashTableIterator.field_e.readFully(MusicCrossfadeStream.field_o.payload, MusicCrossfadeStream.field_o.position, (byte) 119, var2_int);
            SpriteCheckboxPainter.field_c = hm.monotonicMillis(64);
            MusicCrossfadeStream.field_o.position = MusicCrossfadeStream.field_o.position + var2_int;
            if (param0 > MusicCrossfadeStream.field_o.position) {
              return false;
            }
            MusicCrossfadeStream.field_o.position = 0;
            return true;
          }
          try {
            if (false) throw (IOException) null;
            if (var2_int >= 0 &&
              CachedTextLayout.millisSinceLastPacket(8) <= 30000L) {
              return false;
            }
            na.a(true);
          } catch (IOException iOException) {
            na.a(true);
          }
          return false;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void readPackedRankingValues(int param0, PacketBuffer param1) {
        int var2_int = 0;
        int var2_intLifetime1;
        int var2_intLifetime2;
        try {
          if (param0 > -111) {
            QueuedInput.releaseStatics(-27);
          }
          ReflectionCheckRequest.field_n = param1.readUnsignedShort((byte) -121) << 5;
          var2_int = param1.readUnsignedByte(255);
          bq.field_c = (7 & var2_int) << 18;
          ReflectionCheckRequest.field_n = ReflectionCheckRequest.field_n + (var2_int >> 3);
          bq.field_c = bq.field_c + (param1.readUnsignedShort((byte) 47) << 2);
          var2_intLifetime1 = param1.readUnsignedByte(255);
          bq.field_c = bq.field_c + (var2_intLifetime1 >> 6);
          of.field_g = var2_intLifetime1 << 15 & 2064384;
          of.field_g = of.field_g + (param1.readUnsignedByte(255) << 7);
          var2_intLifetime2 = param1.readUnsignedByte(255);
          of.field_b = var2_intLifetime2 << 16 & 65536;
          of.field_g = of.field_g + (var2_intLifetime2 >> 1);
          of.field_b = of.field_b + param1.readUnsignedShort((byte) 96);
        } catch (RuntimeException runtimeException) {
          throw aa.addExceptionContext((Throwable) ((Object) runtimeException), "rd.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    QueuedInput() {
    }

    static {
    }
}
