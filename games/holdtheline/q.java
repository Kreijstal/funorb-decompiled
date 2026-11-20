/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class q {
    static BitmapFont field_a;
    static SpriteAsset field_d;
    static int field_c;
    static int[] field_b;

    final static String b(byte param0) {
        if (!(PolarSortVector.field_d >= 2)) {
          return aj.field_d;
        }
        if (ml.field_a != null) {
          if (!ml.field_a.ensureIndexLoaded((byte) -115)) {
            return DualNodeHashTable.field_f;
          }
          return pb.field_d;
        }
        if (!IntrusiveDeque.field_d.ensureIndexLoaded((byte) -115)) {
          return Vector2f.field_d;
        }
        if (!IntrusiveDeque.field_d.tryLoadNamedGroup("commonui", param0 ^ 54)) {
          return ge.field_a + " - " + IntrusiveDeque.field_d.getNamedGroupLoadPercent("commonui", 0) + "%";
        }
        if (!LinkWidgetRenderer.field_d.ensureIndexLoaded((byte) -63)) {
          return SpriteAsset.field_d;
        }
        if (!LinkWidgetRenderer.field_d.tryLoadNamedGroup("commonui", 108)) {
          return wl.field_b + " - " + LinkWidgetRenderer.field_d.getNamedGroupLoadPercent("commonui", param0 - 118) + "%";
        }
        if (!ArchiveRequest.field_p.ensureIndexLoaded((byte) -102)) {
          return LinearPointPath.field_l;
        }
        if (param0 != 118) {
          field_b = (int[]) null;
        }
        if (!ArchiveRequest.field_p.tryLoadAllGroups((byte) -63)) {
          return uj.field_b + " - " + ArchiveRequest.field_p.getLoadPercent(param0 - 118) + "%";
        }
        return QuickChatPhraseCache.field_b;
    }

    final static void a(String param0, PaletteBitmapFont param1, int param2, int param3, byte param4, int param5) {
        try {
          param1.drawCenteredAlpha(param0, param3 + 1, 1 + param5, 8, -1, 114);
          if (param4 > -126) {
            PacketBuffer var7 = (PacketBuffer) null;
            q.a(-69, (PacketBuffer) null);
          }
          param1.drawCentered(param0, param3, param5, param2, -1);
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "q.B(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static void c(byte param0) {
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        t var4 = null;
        int var4_int = 0;
        int var5 = 0;
        se var5_ref_se = null;
        int[] var6 = null;
        int var8 = 0;
        IsaacPacketBuffer var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        var8 = HoldTheLine.field_D;
        try {
          boolean decompiledFrameRemainder0 = true;
          var9 = RoadStripRenderer.field_e;
          var2 = var9.readUnsignedByte((byte) -62);
          var3 = var9.readUnsignedByte((byte) -86);
          if (0 == var2) {
            var4 = (t) (ih.field_j.first((byte) 100));
            if (var4 == null) {
              r.a(-28036);
              return;
            }
            var5 = -var9.position + ad.field_c;
            var11 = var4.field_m;
            var10 = var11;
            var6 = var10;
            if (var5 > var11.length << 2) {
              var5 = var11.length << 2;
            }
            for (var7 = 0; var7 < var5; var7++) {
              var6[var7 >> 2] = var6[var7 >> 2] + (var9.readUnsignedByte((byte) -110) << LoginChoicePanel.a(var7 << 8, 768));
            }
            var4.unlink(0);
          } else {
            if (var2 == 1) {
              var4_int = var9.readSignedSmart((byte) -84);
              var5_ref_se = (se) (ShadedRoadStripRenderer.field_n.first((byte) 113));
              while (var5_ref_se != null) {
                if (~var3 != ~var5_ref_se.field_j ||
                  var5_ref_se.field_k != var4_int) {
                  var5_ref_se = (se) (ShadedRoadStripRenderer.field_n.next((byte) -42));
                  continue;
                }
                break;
              }
              if (var5_ref_se == null) {
                r.a(-28036);
                return;
              }
              var5_ref_se.unlink(0);
              decompiledFrameRemainder0 = false;
            }
            else {
              MusicPatchPcmStream.a((Throwable) null, (byte) 59, "LR1: " + AgeValidator.b(false));
              r.a(-28036);
            }
          }
          if (param0 != -24) {
            field_a = (BitmapFont) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw EntitySound.wrapException((Throwable) ((Object) var1), "q.D(" + param0 + ')');
        }
    }

    public static void clearSharedReferences(byte param0) {
        field_b = null;
        field_d = null;
        if (param0 < 45) {
          q.clearSharedReferences((byte) 104);
        }
        field_a = null;
    }

    final static void a(int param0, int param1) {
        IsaacPacketBuffer var2 = IsaacPacketBuffer.field_p;
        var2.writeCipheredOpcode((byte) 33, param0);
        var2.writeByte(111, 1);
        var2.writeByte(111, 0);
        if (param1 < 41) {
          q.clearSharedReferences((byte) 110);
        }
    }

    final static void a(int param0, PacketBuffer param1) {
        try {
          int var4 = 0;
          byte[] var2 = null;
          int var3_int = 0;
          Exception var3 = null;
          int var5 = 0;
          byte[] var6 = null;
          RuntimeException stackIn_19_0 = null;
          StringBuilder stackIn_19_1 = null;
          String stackIn_20_2 = null;
          Throwable decompiledCaughtException = null;
          RuntimeException var2_ref = null;
          var5 = HoldTheLine.field_D;
          try {
            var6 = new byte[24];
            var2 = var6;
            if (ao.field_c != null) {
              try {
                ao.field_c.a(25971, 0L);
                ao.field_c.a(var6, 0);
                for (var3_int = 0; var3_int < 24; var3_int++) {
                  if (var2[var3_int] == 0) {
                    continue;
                  }
                  break;
                }
                if (var3_int >= 24) {
                  throw new IOException();
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var3 = (Exception) (Object) decompiledCaughtException;
                for (var4 = 0; var4 < 24; var4++) {
                  var2[var4] = (byte)-1;
                }
              }
            }
            param1.writeBytes(24, 76, var2, 0);
            if (param0 < 25) {
              field_a = (BitmapFont) null;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_19_0 = var2_ref;
            stackIn_19_1 = new StringBuilder().append("q.F(").append(param0).append(',');
            if (param1 == null) {
              stackIn_20_2 = "null";
            } else {
              stackIn_20_2 = "{...}";
            }
            throw EntitySound.wrapException((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_b = new int[]{4, 4, 1};
    }
}
