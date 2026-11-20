/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

class WidgetContainer extends UiWidget implements WidgetContainerMarker {
    IntrusiveDeque children;
    static int field_C;
    static String[][] field_A;
    static int field_E;
    static int field_B;

    final void addChild(boolean param0, UiWidget param1) {
        if (!param0) {
          return;
        }
        try {
          this.children.addLast((byte) -94, param1);
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "v.FB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void appendChildDebugTrees(Hashtable param0, int param1, int param2, StringBuilder param3) {
        StringBuilder discarded$3 = null;
        int var7 = 0;
        StringBuilder discarded$4 = null;
        IntrusiveDequeCursor var5 = null;
        UiWidget var6 = null;
        int var8 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = HoldTheLine.field_D;
        try {
          if (param1 != 0) {
            return;
          }
          var5 = new IntrusiveDequeCursor(this.children);
          var6 = (UiWidget) (var5.c((byte) -114));
          while (var6 != null) {
            discarded$3 = param3.append('\n');
            for (var7 = 0; param2 >= var7; var7++) {
              discarded$4 = param3.append(' ');
            }
            var6.appendDebugTree(1 + param2, (byte) 67, param0, param3);
            var6 = (UiWidget) (var5.next((byte) -104));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_12_0 = var5_ref;
          stackIn_12_1 = new StringBuilder().append("v.QB(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static void drawHeader(byte param0, String param1, int param2, int param3, int param4) {
        try {
          LayeredWidgetStyle.field_i.draw(param3, param4);
          nm.field_c.draw(param1, 15 + param3, -2 + (param4 + (nm.field_c.ascent + 30) / 2), param2, -1);
          int var5_int = 72 / ((param0 + 43) / 61);
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "v.PB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static int processLogin(boolean param0, int param1, String param2, String param3, boolean param4, int param5) {
        try {
          int stackIn_5_0 = 0;
          int stackIn_29_0 = 0;
          boolean stackIn_40_0 = false;
          boolean stackIn_43_0 = false;
          int stackIn_71_0 = 0;
          int stackIn_78_0 = 0;
          int stackIn_82_0 = 0;
          int stackIn_91_0 = 0;
          int stackIn_95_0 = 0;
          RuntimeException stackIn_98_0 = null;
          StringBuilder stackIn_98_1 = null;
          String stackIn_99_2 = null;
          StringBuilder stackIn_101_1 = null;
          String stackIn_102_2 = null;
          Throwable decompiledCaughtException = null;
          int var6_int = 0;
          String var6 = null;
          RuntimeException var6_ref = null;
          int var7 = 0;
          int var8 = 0;
          Throwable var8_ref_Throwable = null;
          int var9 = 0;
          String var10 = null;
          CharSequence var11 = null;
          int var6_intLifetime1;
          int var6_intLifetime2;
          int var8Lifetime1;
          var9 = HoldTheLine.field_D;
          try {
            if (null == IterableSecondaryNodeDeque.field_h &&
              !ShadedRoadStripRenderer.a(param4, (byte) 105)) {
              stackIn_5_0 = -1;
              return stackIn_5_0;
            }
            if (AccountCreationForm.field_S == d.field_f) {
              if (param4) {
                var10 = (String) null;
                TriangleMesh.field_j = PathWaypoint.createLoginCredentials((String) null, RoadFillRenderer.field_a, false, param3, true);
              } else {
                TriangleMesh.field_j = wi.createLoginCredentials((byte) 126, false, param2, param3);
              }
              IsaacPacketBuffer.field_p.position = 0;
              IsaacPacketBuffer.field_p.writeByte(param1 ^ 110, 14);
              IsaacPacketBuffer.field_p.writeByte(param1 + 110, TriangleMesh.field_j.getType(true).protocolId);
              qn.a(-1, param1 ^ 1);
              d.field_f = um.field_d;
            }
            if (um.field_d == d.field_f &&
              hi.readServerBytes(1, (byte) 40)) {
              var6_int = RoadStripRenderer.field_e.readUnsignedByte((byte) -102);
              RoadStripRenderer.field_e.position = 0;
              if (var6_int == 0) {
                d.field_f = pb.field_c;
              } else {
                NineSlicePanel.field_c = var6_int;
                d.field_f = uj.field_d;
                ad.field_c = -1;
              }
            }
            if (pb.field_c == d.field_f &&
              hi.readServerBytes(8, (byte) 40)) {
              DialogLayer.field_H = RoadStripRenderer.field_e.readLong(true);
              RoadStripRenderer.field_e.position = 0;
              StraightRoadSegment.writeLoginPacket(param1 ^ 1, param5, param0, TriangleMesh.field_j, param4);
              d.field_f = SoundPlayback.field_l;
            }
            boolean decompiledFrameRemainder0 = true;
            if (d.field_f == SoundPlayback.field_l &&
              hi.readServerBytes(1, (byte) 40)) {
              var6_intLifetime1 = RoadStripRenderer.field_e.readUnsignedByte((byte) -128);
              NineSlicePanel.field_c = var6_intLifetime1;
              RoadStripRenderer.field_e.position = 0;
              TutorialTransition.field_f = null;
              if (var6_intLifetime1 != 0 &&
                var6_intLifetime1 != 1) {
                if (var6_intLifetime1 != 8) {
                  d.field_f = uj.field_d;
                  ad.field_c = -1;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  r.a(param1 ^ -28035);
                  uk.field_e = false;
                  stackIn_29_0 = var6_intLifetime1;
                  return stackIn_29_0;
                }
              }
              if (decompiledFrameRemainder0) {
                ad.field_c = -1;
                d.field_f = fb.field_s;
              }
            }
            if (fb.field_s == d.field_f &&
              TutorialTransition.a((byte) 55)) {
              RoadFillRenderer.field_a = RoadStripRenderer.field_e.readLong(true);
              CachedArchiveProvider.field_x = RoadStripRenderer.field_e.readUnsignedByte((byte) -33);
              RoadStripRenderer.field_e.readUnsignedByte((byte) -43);
              fc.field_a = RoadStripRenderer.field_e.readUnsignedShort(-119);
              var6 = RoadStripRenderer.field_e.readNullableCp1252String(-1);
              var7 = RoadStripRenderer.field_e.readUnsignedByte((byte) -57);
              if (0 != (var7 & 1)) {
                HuffmanDecoder.persistRandomSeed((byte) 66);
              }
              if (!param4) {
                stackIn_40_0 = ((4 & var7) != 0);
                uj.field_c = stackIn_40_0;
                stackIn_43_0 = ((8 & var7) != 0);
                ArchiveCatalog.field_h = stackIn_43_0;
                if (!ArchiveCatalog.field_h) {
                }
              }
              if (DelegatingCanvas.field_f) {
                RoadStripRenderer.field_e.readUnsignedByte((byte) -53);
                RoadStripRenderer.field_e.readUnsignedByte((byte) -82);
                RoadStripRenderer.field_e.readInt(-116);
                EmailAddressValidator.field_l = RoadStripRenderer.field_e.readUnsignedShort(-59);
                IterableNodeHashTable.field_i = new byte[EmailAddressValidator.field_l];
                for (var8 = 0; EmailAddressValidator.field_l > var8; var8++) {
                  IterableNodeHashTable.field_i[var8] = RoadStripRenderer.field_e.readByte(Vector2i.xor(param1, 1));
                }
              }
              QuickChatPhraseCache.field_e = RoadStripRenderer.field_e.readCp1252String(-1231);
              var11 = (CharSequence) ((Object) QuickChatPhraseCache.field_e);
              co.field_e = MidiPcmStream.normalizeAccountName(var11, (byte) -12);
              q.field_c = RoadStripRenderer.field_e.readUnsignedByte((byte) -95);
              d.field_f = ad.field_b;
              if (TriangleMesh.field_j.getType(true) == sb.field_d) {
                RaceVehicle.field_Wb.writeLastLoginMethodCookie(GameKeyHandler.a(87), 127);
              } else {
                if (TriangleMesh.field_j.getType(true) == jh.field_d) {
                  ArcTrackBoundary.field_s.writeLastLoginMethodCookie(GameKeyHandler.a(97), 125);
                }
              }
              uk.field_e = false;
              if (var6 != null) {
                IntrusiveDequeCursor.a(-32312, var6, GameKeyHandler.a(73));
              }
              if (fc.field_a <= 0 &&
                !uj.field_c) {
                try {
                  eo.a(21896, "unzap", GameKeyHandler.a(92));
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var8_ref_Throwable = decompiledCaughtException;
                }
              } else {
                try {
                  eo.a(GameKeyHandler.a(param1 ^ 79), new Object[]{EntitySound.a(true, RoadFillRenderer.field_a)}, false, "zap");
                } catch (java.lang.Throwable decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var8_ref_Throwable = decompiledCaughtException;
                }
              }
              if (fc.field_a > 0) {
                hc.field_b = true;
              }
              IsaacPacketBuffer.field_p.seedCipher(Bzip2State.field_x, false);
              for (var8Lifetime1 = 0; 4 > var8Lifetime1; var8Lifetime1++) {
                Bzip2State.field_x[var8Lifetime1] = Bzip2State.field_x[var8Lifetime1] + 50;
              }
              RoadStripRenderer.field_e.seedCipher(Bzip2State.field_x, false);
              stackIn_71_0 = NineSlicePanel.field_c;
              return stackIn_71_0;
            }
            if (d.field_f == uj.field_d &&
              TutorialTransition.a((byte) 55)) {
              r.a(-28036);
              if (NineSlicePanel.field_c == 7 &&
                !uk.field_e) {
                uk.field_e = true;
                stackIn_78_0 = -1;
                return stackIn_78_0;
              }
              if (NineSlicePanel.field_c == 7) {
                NineSlicePanel.field_c = 3;
              }
              um.field_b = RoadStripRenderer.field_e.readCp1252String(param1 - 1232);
              uk.field_e = false;
              stackIn_82_0 = NineSlicePanel.field_c;
              return stackIn_82_0;
            }
            if (null == IterableSecondaryNodeDeque.field_h) {
              if (uk.field_e) {
                if (30000L < ImageProducerRasterBuffer.d(126)) {
                  um.field_b = SpriteButtonRenderer.field_y;
                } else {
                  um.field_b = ContentTransitionDialog.field_hb;
                }
                uk.field_e = false;
                stackIn_91_0 = 3;
                return stackIn_91_0;
              }
              var6_intLifetime2 = bo.field_e;
              bo.field_e = ArchiveCatalog.field_b;
              ArchiveCatalog.field_b = var6_intLifetime2;
              uk.field_e = true;
            }
            if (param1 != 1) {
              field_B = -82;
            }
            stackIn_95_0 = -1;
            return stackIn_95_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_98_0 = var6_ref;
            stackIn_98_1 = new StringBuilder().append("v.HB(").append(param0).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_99_2 = "null";
            } else {
              stackIn_99_2 = "{...}";
            }
            stackIn_101_1 = ((StringBuilder) (Object) stackIn_98_1).append(stackIn_99_2).append(',');
            if (param3 == null) {
              stackIn_102_2 = "null";
            } else {
              stackIn_102_2 = "{...}";
            }
            throw EntitySound.wrapException((Throwable) ((Object) stackIn_98_0), ((StringBuilder) (Object) stackIn_101_1).append(stackIn_102_2).append(',').append(param4).append(',').append(param5).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void handleMouseRelease(int param0, UiWidget param1, int param2, int param3, byte param4, int param5) {
        RuntimeException runtimeException = null;
        IntrusiveDequeCursor var7 = null;
        UiWidget var8 = null;
        int var9 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = HoldTheLine.field_D;
        try {
          var7 = new IntrusiveDequeCursor(this.children);
          if (param4 != -9) {
            return;
          }
          var8 = (UiWidget) (var7.c((byte) -128));
          while (var8 != null) {
            if (var8.isLinked(111)) {
              var8.handleMouseRelease(param0, param1, param2 + this.y, this.x + param3, (byte) -9, param5);
              var8 = (UiWidget) (var7.next((byte) -104));
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_10_0 = runtimeException;
          stackIn_10_1 = new StringBuilder().append("v.SA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final boolean isFocused(byte param0) {
        if (param0 != -20) {
          UiWidget var3 = (UiWidget) null;
          this.handleScrollInput(25, (UiWidget) null, 78, 2, 104, 42, -126);
        }
        return this.getFocusedChild((byte) 118) != null ? true : false;
    }

    public static void clearSharedReferences(byte param0) {
        field_A = (String[][]) null;
        if (param0 != 70) {
          field_C = -41;
        }
    }

    boolean handleKeyPress(UiWidget param0, int param1, byte param2, char param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        UiWidget var8 = null;
        IntrusiveDequeCursor var9 = null;
        boolean stackIn_15_0 = false;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = HoldTheLine.field_D;
        try {
          var9 = new IntrusiveDequeCursor(this.children);
          var8 = (UiWidget) (var9.c((byte) -120));
          while (var8 != null) {
            if (var8.isLinked(68)) {
              if (var8.isFocused((byte) -20) &&
                var8.handleKeyPress(param0, param1, (byte) -78, param3)) {
                return true;
              }
              var8 = (UiWidget) (var9.next((byte) -104));
              continue;
            }
            break;
          }
          var6 = param1;
          if (80 == var6) {
            if (IterableSecondaryNodeDeque.field_g[81]) {
              stackIn_15_0 = this.focusPreviousChild(param0, param2 + 77);
            } else {
              stackIn_15_0 = this.focusNextChild(param0, 116);
            }
            return stackIn_15_0;
          }
          if (param2 == -78) {
            return false;
          }
          field_E = 5;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_22_0 = var5;
          stackIn_22_1 = new StringBuilder().append("v.T(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean handleMousePress(int param0, int param1, int param2, UiWidget param3, byte param4, int param5, int param6) {
        IntrusiveDequeCursor var8 = null;
        RuntimeException var8_ref = null;
        UiWidget var9 = null;
        int var10 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = HoldTheLine.field_D;
        try {
          var8 = new IntrusiveDequeCursor(this.children);
          var9 = (UiWidget) (var8.c((byte) -114));
          if (param4 != -108) {
            return false;
          }
          while (var9 != null) {
            if (var9.isLinked(param4 ^ -92)) {
              if (!var9.handleMousePress(this.x + param0, param1, this.y + param2, param3, (byte) -108, param5, param6)) {
                var9 = (UiWidget) (var8.next((byte) -104));
                continue;
              }
              return true;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_14_0 = var8_ref;
          stackIn_14_1 = new StringBuilder().append("v.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final int getMaxLayer(byte param0) {
        int var5 = 0;
        int var6 = HoldTheLine.field_D;
        int var2 = 0;
        IntrusiveDequeCursor var3 = new IntrusiveDequeCursor(this.children);
        if (param0 >= -66) {
          field_A = (String[][]) null;
        }
        UiWidget var4 = (UiWidget) (var3.c((byte) 119));
        while (var4 != null) {
          var5 = var4.getMaxLayer((byte) -123);
          if (var5 > var2) {
            var2 = var5;
          }
          var4 = (UiWidget) (var3.next((byte) -104));
        }
        return var2;
    }

    void updateHover(int param0, UiWidget param1, int param2, byte param3) {
        RuntimeException runtimeException = null;
        IntrusiveDequeCursor var5 = null;
        UiWidget var6 = null;
        int var7 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = HoldTheLine.field_D;
        try {
          super.updateHover(param0, param1, param2, param3);
          var5 = new IntrusiveDequeCursor(this.children);
          var6 = (UiWidget) (var5.c((byte) -115));
          while (var6 != null) {
            if (var6.isLinked(55)) {
              var6.updateHover(this.x + param0, param1, param2 + this.y, (byte) -3);
              var6 = (UiWidget) (var5.next((byte) -104));
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_8_0 = runtimeException;
          stackIn_8_1 = new StringBuilder().append("v.JA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    void drawLayer(int param0, int param1, int param2, int param3) {
        int var7 = HoldTheLine.field_D;
        if (param3 == 0 &&
          null != this.renderer) {
          this.renderer.drawWidget(true, param2, -76, (UiWidget) (this), param1);
        }
        IntrusiveDequeCursor var5 = new IntrusiveDequeCursor(this.children);
        if (param0 != -9532) {
          return;
        }
        UiWidget var6 = (UiWidget) (var5.last(8115));
        while (var6 != null) {
          var6.drawLayer(-9532, param1 + this.y, param2 + this.x, param3);
          var6 = (UiWidget) (var5.a(false));
        }
    }

    final static boolean readBoolean(PacketBuffer param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = param0.readUnsignedByte((byte) -26);
          stackIn_3_0 = (1 != var2_int) ? 0 : 1;
          var3 = stackIn_3_0;
          if (param1 > 56) {
            stackIn_7_0 = var3;
            return stackIn_7_0 != 0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("v.DB(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void initializeNetworkState(int param0, boolean param1, int param2, int param3, int param4, int param5, PlatformTaskDispatcher param6, boolean param7, long param8, String param9, int param10, int param11, boolean param12, int param13) {
        try {
          RuntimeException stackIn_15_0 = null;
          StringBuilder stackIn_15_1 = null;
          String stackIn_16_2 = null;
          StringBuilder stackIn_18_1 = null;
          String stackIn_19_2 = null;
          Throwable decompiledCaughtException = null;
          IOException var15 = null;
          RuntimeException var15_ref = null;
          try {
            RoadStripRenderer.field_e = new IsaacPacketBuffer(param2);
            IsaacPacketBuffer.field_p = new IsaacPacketBuffer(param3);
            DisplayNameForm.field_L = param11;
            ArchiveCatalog.field_n = param13;
            PointLight.field_s = param6;
            hc.field_b = param1;
            OutlinedRoadStripRenderer.field_m = param10;
            ArchiveCatalog.field_b = param4;
            if (!param12) {
              field_E = 98;
            }
            uj.field_f = param9;
            AchievementUnlockRequest.field_i = param8;
            bo.field_e = param5;
            oi.field_b = param0;
            DelegatingCanvas.field_f = param7;
            if (null != PointLight.field_s.field_a) {
              try {
                ao.field_c = new BufferedRandomAccessFile(PointLight.field_s.field_a, 64, 0);
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var15 = (IOException) (Object) decompiledCaughtException;
                throw new RuntimeException(var15.toString());
              }
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var15_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_15_0 = var15_ref;
            stackIn_15_1 = new StringBuilder().append("v.IB(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            if (param6 == null) {
              stackIn_16_2 = "null";
            } else {
              stackIn_16_2 = "{...}";
            }
            stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param7).append(',').append(param8).append(',');
            if (param9 == null) {
              stackIn_19_2 = "null";
            } else {
              stackIn_19_2 = "{...}";
            }
            throw EntitySound.wrapException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    WidgetContainer(int param0, int param1, int param2, int param3, WidgetRenderer param4) {
        super(param0, param1, param2, param3, param4, (WidgetListener) null);
        this.children = new IntrusiveDeque();
    }

    final boolean requestFocus(UiWidget param0, int param1) {
        IntrusiveDequeCursor var3 = null;
        RuntimeException var3_ref = null;
        UiWidget var4 = null;
        int var5 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = HoldTheLine.field_D;
        try {
          var3 = new IntrusiveDequeCursor(this.children);
          if (param1 != -25823) {
            return true;
          }
          var4 = (UiWidget) (var3.c((byte) -2));
          while (true) {
            if (var4 == null) {
              return false;
            }
            if (!var4.requestFocus(param0, -25823)) {
              var4 = (UiWidget) (var3.next((byte) -104));
              continue;
            }
            break;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_14_0 = var3_ref;
          stackIn_14_1 = new StringBuilder().append("v.NB(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void openSupportPage(java.applet.Applet param0, int param1) {
        try {
          java.net.URL var2 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          try {
            if (param1 <= 97) {
              return;
            }
            try {
              var2 = new java.net.URL(param0.getCodeBase(), "tosupport.ws");
              param0.getAppletContext().showDocument(IntrusiveDeque.a(var2, param0, (byte) 54), "_top");
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var2_ref2;
            stackIn_8_1 = new StringBuilder().append("v.GB(");
            if (param0 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw EntitySound.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final String getTooltip(int param0) {
        String var4 = null;
        int var5 = HoldTheLine.field_D;
        IntrusiveDequeCursor var2 = new IntrusiveDequeCursor(this.children);
        UiWidget var3 = (UiWidget) (var2.c((byte) -118));
        while (var3 != null) {
          var4 = var3.getTooltip(param0 + 0);
          if (var4 != null) {
            return var4;
          }
          var3 = (UiWidget) (var2.next((byte) -104));
        }
        if (param0 == 0) {
          return null;
        }
        StringBuilder var6 = (StringBuilder) null;
        this.appendChildDebugTrees((Hashtable) null, 49, 4, (StringBuilder) null);
        return null;
    }

    final boolean focusNextChild(UiWidget param0, int param1) {
        RuntimeException var3 = null;
        UiWidget var4 = null;
        IntrusiveDequeCursor var5 = null;
        UiWidget var6 = null;
        int var7 = 0;
        IntrusiveDequeCursor var8 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = HoldTheLine.field_D;
        try {
          if (param1 < 111) {
            return true;
          }
          if (this.children.isEmpty(0)) {
            return false;
          }
          var8 = new IntrusiveDequeCursor(this.children);
          var4 = (UiWidget) (var8.c((byte) -119));
          while (var4 != null) {
            if (var4.isFocused((byte) -20)) {
              var5 = new IntrusiveDequeCursor(this.children);
              var5.firstOrFrom(var4, (byte) -125);
              var6 = (UiWidget) (var5.next((byte) -104));
              while (var6 != null) {
                if (!var6.requestFocus(param0, -25823)) {
                  var6 = (UiWidget) (var5.next((byte) -104));
                  continue;
                }
                return true;
              }
            }
            var4 = (UiWidget) (var8.next((byte) -104));
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_23_0 = var3;
          stackIn_23_1 = new StringBuilder().append("v.MB(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void refreshChildLayouts(int param0) {
        int var4 = HoldTheLine.field_D;
        IntrusiveDequeCursor var2 = new IntrusiveDequeCursor(this.children);
        if (param0 != 15) {
          UiWidget var5 = (UiWidget) null;
          this.requestFocus((UiWidget) null, 83);
        }
        UiWidget var3 = (UiWidget) (var2.c((byte) -114));
        while (var3 != null) {
          var3.refreshLayout(92);
          var3 = (UiWidget) (var2.next((byte) -104));
        }
    }

    final StringBuilder appendDebugTree(int param0, byte param1, Hashtable param2, StringBuilder param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        StringBuilder stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.beginDebugVisit(20720, param2, param3, param0)) {
            this.appendDebugProperties(param2, param0, true, param3);
            this.appendChildDebugTrees(param2, 0, param0, param3);
          }
          var5_int = -111 % ((0 - param1) / 49);
          stackIn_4_0 = (StringBuilder) (param3);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("v.PA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final boolean handleScrollInput(int param0, UiWidget param1, int param2, int param3, int param4, int param5, int param6) {
        IntrusiveDequeCursor var8 = null;
        RuntimeException var8_ref = null;
        UiWidget var9 = null;
        int var10 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = HoldTheLine.field_D;
        try {
          var8 = new IntrusiveDequeCursor(this.children);
          if (param6 != -24898) {
            return true;
          }
          var9 = (UiWidget) (var8.c((byte) 61));
          while (var9 != null) {
            if (var9.isLinked(72)) {
              if (var9.isFocused((byte) -20) &&
                var9.handleScrollInput(param0, param1, param2, param3, param4, param5, param6 + 0)) {
                return true;
              }
              var9 = (UiWidget) (var8.next((byte) -104));
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_17_0 = var8_ref;
          stackIn_17_1 = new StringBuilder().append("v.KB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final void clearFocus(int param0) {
        int var4 = HoldTheLine.field_D;
        IntrusiveDequeCursor var2 = new IntrusiveDequeCursor(this.children);
        UiWidget var3 = (UiWidget) (var2.c((byte) -122));
        if (param0 < 15) {
          return;
        }
        while (var3 != null) {
          var3.clearFocus(55);
          var3 = (UiWidget) (var2.next((byte) -104));
        }
    }

    final boolean focusPreviousChild(UiWidget param0, int param1) {
        RuntimeException var3 = null;
        UiWidget var4 = null;
        IntrusiveDequeCursor var5 = null;
        UiWidget var6 = null;
        int var7 = 0;
        IntrusiveDequeCursor var8 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = HoldTheLine.field_D;
        try {
          if (this.children.isEmpty(0)) {
            return false;
          }
          if (param1 != -1) {
            return true;
          }
          var8 = new IntrusiveDequeCursor(this.children);
          var4 = (UiWidget) (var8.last(8115));
          while (var4 != null) {
            if (var4.isFocused((byte) -20)) {
              var5 = new IntrusiveDequeCursor(this.children);
              var5.lastOrFrom(-10279, var4);
              var6 = (UiWidget) (var5.a(false));
              while (var6 != null) {
                if (var6.requestFocus(param0, param1 - 25822)) {
                  return true;
                }
                var6 = (UiWidget) (var5.a(false));
              }
            }
            var4 = (UiWidget) (var8.a(false));
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_22_0 = var3;
          stackIn_22_1 = new StringBuilder().append("v.JB(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(')').toString());
        }
    }

    UiWidget getFocusedChild(byte param0) {
        IntrusiveDequeCursor var2;
        UiWidget var3;
        int var4;
        var4 = HoldTheLine.field_D;
        var2 = new IntrusiveDequeCursor(this.children);
        var3 = (UiWidget) (var2.c((byte) -122));
        if (param0 <= 73) {
          field_E = 118;
        }
        while (var3 != null) {
          if (var3.isFocused((byte) -20)) {
            return var3;
          }
          var3 = (UiWidget) (var2.next((byte) -104));
        }
        return null;
    }

    final void setBounds(int param0, byte param1, int param2, int param3, int param4) {
        super.setBounds(param0, param1, param2, param3, param4);
        this.refreshChildLayouts(param1 ^ 117);
    }

    final static void sendArchiveKeyRequest(int param0, int param1, ArchiveKeyRequest param2) {
        IsaacPacketBuffer var3 = null;
        try {
          if (param0 != 3) {
            field_E = -111;
          }
          var3 = IsaacPacketBuffer.field_p;
          var3.writeCipheredOpcode((byte) 33, param1);
          var3.writeByte(param0 + 108, param2.category);
          var3.writeShort(-652561784, param2.id);
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "v.CB(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_B = -1;
    }
}
