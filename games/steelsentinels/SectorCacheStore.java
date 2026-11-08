/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class SectorCacheStore {
    static int field_g;
    private int field_a;
    static ResourceArchive field_i;
    static int[][] field_o;
    static int field_j;
    static String field_f;
    static BitmapFont field_m;
    private BufferedRandomAccessFile field_c;
    static boolean field_n;
    private int field_e;
    private BufferedRandomAccessFile field_h;
    static RgbSprite field_d;
    static String field_k;
    static String field_b;
    static int field_l;

    final boolean write(int param0, int param1, int param2, byte[] param3) {
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        Throwable var7 = null;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          var5 = this.field_h;
          synchronized (var5) {
            if (param0 < 77) {
              return true;
            }
            if (param1 >= 0 &&
              this.field_a >= param1) {
              var6 = this.writeSectors(true, param1, true, param3, param2) ? 1 : 0;
              if (var6 == 0) {
                var6 = this.writeSectors(true, param1, false, param3, param2) ? 1 : 0;
              }
              stackIn_13_0 = var6;
            } else {
              throw new IllegalArgumentException();
            }
          }
          return stackIn_13_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_19_0 = var5_ref;
          stackIn_19_1 = new StringBuilder().append("rc.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final static void advanceTutorialStep(boolean param0) {
        boolean stackIn_14_0 = false;
        int stackIn_27_0 = 0;
        boolean stackIn_38_0 = false;
        int stackIn_51_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_13_0;
        boolean stackOut_37_0;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2_int = 0;
        int[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var1_intLifetime1;
        var5 = SteelSentinels.obfuscationControl;
        try {
          if (0 <= TableColumns.field_g) {
            TutorialStepTable.field_d[TableColumns.field_g].restoreHighlightedWidget((byte) 106);
          }
          if (16 == TableColumns.field_g) {
            TableColumns.field_g = -1;
            return;
          }
          if (TableColumns.field_g == 1) {
            Js5NetworkRequest.field_M = 0;
          }
          TableColumns.field_g = TableColumns.field_g + 1;
          if (TableColumns.field_g == 12) {
            var1_int = 0;
            var2_int = 0;
            while (true) {
              boolean decompiledFrameRemainder0 = true;
              if (35 > var2_int) {
                stackOut_13_0 = NameTable.isBitSet(ArchiveRequest.field_D, var2_int, -20370);
                stackIn_27_0 = stackOut_13_0 ? 1 : 0;
                stackIn_14_0 = stackOut_13_0;
                decompiledFrameRemainder0 = (var5 == 0);
                if (decompiledFrameRemainder0) {
                  if (!stackIn_14_0 &&
                    LoadoutHelpers.isComponentCompatible(var2_int, ArticulatedPart.isMemberSession((byte) -60), ArchiveRequest.field_D, (byte) 84, DirectByteStorage.field_m, PendingAckRequest.field_D)) {
                    var1_int = 1;
                  } else {
                    var2_int++;
                    continue;
                  }
                }
              }
              if (decompiledFrameRemainder0) {
                stackIn_27_0 = var1_int;
              }
              if (stackIn_27_0 != 0) {
                break;
              }
              TableColumns.field_g = TableColumns.field_g + 1;
              break;
            }
          }
          if (param0) {
            return;
          }
          if (TableColumns.field_g == 15) {
            var1_intLifetime1 = 0;
            var2 = FunOrbClient.field_z;
            var3 = 0;
            while (true) {
              boolean decompiledFrameRemainder1 = true;
              if (var2.length > var3) {
                var4 = var2[var3];
                stackOut_37_0 = NameTable.isBitSet(PendingAckRequest.field_D, var4, -20370);
                stackIn_51_0 = stackOut_37_0 ? 1 : 0;
                stackIn_38_0 = stackOut_37_0;
                decompiledFrameRemainder1 = (var5 == 0);
                if (decompiledFrameRemainder1) {
                  if (!stackIn_38_0 &&
                    RasterSnapshot.isPartAvailable(DirectByteStorage.field_m, (byte) 126, PendingAckRequest.field_D, var4, ArticulatedPart.isMemberSession((byte) -37))) {
                    var1_intLifetime1 = 1;
                  } else {
                    var3++;
                    continue;
                  }
                }
              }
              if (decompiledFrameRemainder1) {
                stackIn_51_0 = var1_intLifetime1;
              }
              if (stackIn_51_0 != 0) {
                break;
              }
              TableColumns.field_g = TableColumns.field_g + 1;
              break;
            }
          }
          if (TableColumns.field_g == 12 &&
            null != TextAndBitHelpers.field_f &&
            IterableDualNodeDeque.field_d >= 0) {
            TextAndBitHelpers.field_f.field_Ub.field_gb = -TextAndBitHelpers.field_f.field_Ub.field_eb - IterableDualNodeDeque.field_d;
            if (-TextAndBitHelpers.field_f.field_Ub.field_eb < TextAndBitHelpers.field_f.field_Ub.field_gb) {
              TextAndBitHelpers.field_f.field_Ub.field_gb = -TextAndBitHelpers.field_f.field_Ub.field_eb;
            }
            if (TextAndBitHelpers.field_f.field_Ub.field_gb < (-TextAndBitHelpers.field_f.field_Ub.field_Lb - TextAndBitHelpers.field_f.field_Ub.field_lb + TextAndBitHelpers.field_f.field_Tb.field_Lb - TextAndBitHelpers.field_f.field_Ub.field_eb)) {
              TextAndBitHelpers.field_f.field_Ub.field_gb = -TextAndBitHelpers.field_f.field_Ub.field_eb + (TextAndBitHelpers.field_f.field_Tb.field_Lb - TextAndBitHelpers.field_f.field_Ub.field_Lb) - TextAndBitHelpers.field_f.field_Ub.field_lb;
            }
          }
          if (TableColumns.field_g == 16 &&
            0 == (8 & NameCheckResult.field_a)) {
            NameCheckResult.field_a = NameCheckResult.field_a | 8;
            if (!ByteArrayPoolHelpers.isAccountCreationMode(111)) {
              MarkerSlider.encodeSavedDesigns((byte) 3);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) var1), "rc.F(" + param0 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        field_o = (int[][]) null;
        field_f = null;
        field_b = null;
        field_i = null;
        field_m = null;
        field_k = null;
        if (param0 != 15598) {
          return;
        }
        try {
          field_d = null;
        } catch (RuntimeException runtimeException) {
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) runtimeException), "rc.D(" + param0 + ')');
        }
    }

    final static void loadLocalizedText(int param0, ResourceArchive param1) {
        class $CfrPartitionedBody {
            RuntimeException stackIn_4687_0;
            StringBuilder stackIn_4687_1;
            String stackIn_4688_2;
            boolean stackIn_4696_0;
            RuntimeException decompiledCaughtException;
            byte[] var2;
            RuntimeException var2_ref;
            int var3;
            int param0;
            ResourceArchive param1;
            boolean finished;
            $CfrPartitionedBody(int initialParam0, ResourceArchive initialParam1) {
                this.param0 = initialParam0;
                this.param1 = initialParam1;
                this.stackIn_4687_0 = null;
                this.stackIn_4687_1 = null;
                this.stackIn_4688_2 = null;
                this.stackIn_4696_0 = false;
                this.decompiledCaughtException = null;
                this.var2 = null;
                this.var2_ref = null;
                this.var3 = 0;
            }
            void runChunk0() throws java.lang.RuntimeException {
                MusicCrossfadeStream.field_y = param1;
                var2 = SentinelDesigner.readTextResourceBytes(125, "text_game_name");
                if (var2 != null) {
                  ReflectionCheckHelpers.field_h = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(61, "text_benefits,0");
                if (null != var2) {
                  PendingAckRequest.field_r[0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 107, "text_benefits,1");
                if (var2 != null) {
                  PendingAckRequest.field_r[1] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(123, "text_benefits,2");
                if (null != var2) {
                  PendingAckRequest.field_r[2] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(106, "expansion_1_title");
                if (null != var2) {
                  NameCheckResult.field_e = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(88, "expansion_1_installed");
                if (null != var2) {
                  QuickChatPhraseCache.field_l = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(102, "expansion_1_caps,0");
                if (null != var2) {
                  SentinelDesigner.field_f[0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(117, "expansion_1_caps,1");
                if (null != var2) {
                  SentinelDesigner.field_f[1] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(99, "expansion_1_caps,2");
                if (null != var2) {
                  SentinelDesigner.field_f[2] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(78, "solarite_invader_caps_space");
                if (var2 != null) {
                  NumericDateInputWidget.field_W = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(84, "baal_space");
                if (var2 != null) {
                  TableColumns.field_a = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(81, "baal_invocation,0");
                if (var2 != null) {
                  PendingDataRequest.field_t[0] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 80, "baal_invocation,1");
                if (null != var2) {
                  PendingDataRequest.field_t[1] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(83, "baal_invocation,2");
                if (var2 != null) {
                  PendingDataRequest.field_t[2] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(57, "baal_gloating,0");
                if (var2 != null) {
                  CachedTextLayout.field_H[0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(87, "baal_gloating,1");
                if (var2 != null) {
                  CachedTextLayout.field_H[1] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 73, "baal_gloating,2");
                if (null != var2) {
                  CachedTextLayout.field_H[2] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(66, "baal_gloating,3");
                if (null != var2) {
                  CachedTextLayout.field_H[3] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(77, "baal_vanquished,0");
                if (var2 != null) {
                  AccountNoticeDialog.field_mb[0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(80, "baal_vanquished,1");
                if (null != var2) {
                  AccountNoticeDialog.field_mb[1] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 82, "baal_vanquished,2");
                if (var2 != null) {
                  AccountNoticeDialog.field_mb[2] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(116, "baal_vanquished,3");
                if (var2 != null) {
                  AccountNoticeDialog.field_mb[3] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 53, "baal_vanquished,4");
                if (null != var2) {
                  AccountNoticeDialog.field_mb[4] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(72, "baal_vanquished,5");
                if (null != var2) {
                  AccountNoticeDialog.field_mb[5] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(56, "baal_vanquished,6");
                if (var2 != null) {
                  AccountNoticeDialog.field_mb[6] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 112, "trainingdrone");
                if (var2 != null) {
                  SocketConnector.field_f = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(105, "newhighscoremsg");
                if (var2 != null) {
                  PasswordValidator.field_q = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(102, "loadingpercent");
                if (null != var2) {
                  ValidationHelpWidget.field_sb = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(57, "waitforloading");
                if (null != var2) {
                  dg.field_e = IntKeyLookup.decodeWindowsCodePageString(param0 ^ 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(90, "needtrainingmsg");
                if (null != var2) {
                  DialWidgetPainter.field_l = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(85, "nosentinelmsg");
                if (var2 != null) {
                  MusicCrossfadeStream.field_C = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(111, "spectatinggametxt");
                if (null != var2) {
                  FunOrbClient.field_o = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 72, "spectatingtxt");
                if (null != var2) {
                  LoginStateQueries.field_d = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(109, "gameopt_restriction_text,0,0");
                if (null != var2) {
                  DesignerPageTables.field_h[0][0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(51, "gameopt_restriction_text,0,1");
                if (var2 != null) {
                  DesignerPageTables.field_h[0][1] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 76, "gameopt_restriction_text,0,2");
                if (null != var2) {
                  DesignerPageTables.field_h[0][2] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(51, "gameopt_restriction_text,1,0");
                if (var2 != null) {
                  DesignerPageTables.field_h[1][0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(120, "gameopt_restriction_text,1,1");
                if (var2 != null) {
                  DesignerPageTables.field_h[1][1] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(125, "gameopt_restriction_text,1,2");
                if (null != var2) {
                  DesignerPageTables.field_h[1][2] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(124, "okoption,0");
                if (null != var2) {
                  TickClock.field_f[0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(118, "ignore_cap_txt");
                if (var2 != null) {
                  IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(53, "yesnooption,0");
                if (null != var2) {
                  AccountNamePrompt.field_Vb[0] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(55, "yesnooption,1");
                if (null != var2) {
                  AccountNamePrompt.field_Vb[1] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(124, "achievement_names,0");
                if (var2 != null) {
                  ViewportController.field_t[0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(78, "achievement_names,1");
                if (var2 != null) {
                  ViewportController.field_t[1] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 97, "achievement_names,2");
                if (null != var2) {
                  ViewportController.field_t[2] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(92, "achievement_names,3");
                if (var2 != null) {
                  ViewportController.field_t[3] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(97, "achievement_names,4");
                if (null != var2) {
                  ViewportController.field_t[4] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(55, "achievement_names,5");
                if (var2 != null) {
                  ViewportController.field_t[5] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(74, "achievement_names,6");
                if (null != var2) {
                  ViewportController.field_t[6] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 78, "achievement_names,7");
                if (null != var2) {
                  ViewportController.field_t[7] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(105, "achievement_names,8");
                if (null != var2) {
                  ViewportController.field_t[8] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(95, "achievement_names,9");
                if (var2 != null) {
                  ViewportController.field_t[9] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(108, "achievement_names,10");
                if (var2 != null) {
                  ViewportController.field_t[10] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(80, "achievement_names,11");
                if (null != var2) {
                  ViewportController.field_t[11] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 86, "achievement_names,12");
                if (null != var2) {
                  ViewportController.field_t[12] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(63, "achievement_names,13");
                if (null != var2) {
                  ViewportController.field_t[13] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(75, "achievement_names,14");
                if (var2 != null) {
                  ViewportController.field_t[14] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(60, "achievement_names,15");
                if (var2 != null) {
                  ViewportController.field_t[15] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(112, "achievement_names,16");
                if (var2 != null) {
                  ViewportController.field_t[16] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(86, "achievement_names,17");
                if (null != var2) {
                  ViewportController.field_t[17] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 94, "achievement_names,18");
                if (var2 != null) {
                  ViewportController.field_t[18] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(67, "achievement_names,19");
                if (null != var2) {
                  ViewportController.field_t[19] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(68, "achievement_names,20");
                if (null != var2) {
                  ViewportController.field_t[20] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(86, "achievement_names,21");
                if (null != var2) {
                  ViewportController.field_t[21] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(56, "achievement_names,22");
                if (var2 != null) {
                  ViewportController.field_t[22] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(78, "achievement_names,23");
                if (null != var2) {
                  ViewportController.field_t[23] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(117, "achievement_names,24");
                if (null != var2) {
                  ViewportController.field_t[24] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(125, "achievement_names,25");
                if (var2 != null) {
                  ViewportController.field_t[25] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 56, "achievement_names,26");
                if (var2 != null) {
                  ViewportController.field_t[26] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 117, "achievement_names,27");
                if (var2 != null) {
                  ViewportController.field_t[27] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(70, "achievement_names,28");
                if (null != var2) {
                  ViewportController.field_t[28] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(56, "achievement_names,29");
                if (null != var2) {
                  ViewportController.field_t[29] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 122, "achievement_names,30");
                if (var2 != null) {
                  ViewportController.field_t[30] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(96, "achievement_names,31");
                if (var2 != null) {
                  ViewportController.field_t[31] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 104, "achievement_names,32");
                if (null != var2) {
                  ViewportController.field_t[32] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 104, "achievement_names,33");
                if (var2 != null) {
                  ViewportController.field_t[33] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(67, "achievement_names,34");
                if (var2 != null) {
                  ViewportController.field_t[34] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(95, "achievement_names,35");
                if (var2 != null) {
                  ViewportController.field_t[35] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 72, "achievement_names,36");
                if (null != var2) {
                  ViewportController.field_t[36] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 91, "achievement_names,37");
                if (null != var2) {
                  ViewportController.field_t[37] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(103, "achievement_names,38");
                if (null != var2) {
                  ViewportController.field_t[38] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(125, "MissionBriefings,0");
                if (null != var2) {
                  PendingByteArrayRequest.field_s[0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 94, "MissionBriefings,1");
                if (null != var2) {
                  PendingByteArrayRequest.field_s[1] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(58, "MissionBriefings,2");
                if (var2 != null) {
                  PendingByteArrayRequest.field_s[2] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(103, "MissionBriefings,3");
                if (var2 != null) {
                  PendingByteArrayRequest.field_s[3] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(87, "MissionBriefings,4");
                if (var2 != null) {
                  PendingByteArrayRequest.field_s[4] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(67, "MissionBriefings,5");
                if (var2 != null) {
                  PendingByteArrayRequest.field_s[5] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(124, "MissionBriefings,6");
                if (null != var2) {
                  PendingByteArrayRequest.field_s[6] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(65, "MissionBriefings,7");
                if (var2 != null) {
                  PendingByteArrayRequest.field_s[7] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 59, "MissionBriefings,8");
                if (null != var2) {
                  PendingByteArrayRequest.field_s[8] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(51, "MissionBriefings,9");
                if (null != var2) {
                  PendingByteArrayRequest.field_s[9] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(118, "MissionBriefings,10");
                if (var2 != null) {
                  PendingByteArrayRequest.field_s[10] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(91, "MissionBriefings,11");
                if (null != var2) {
                  PendingByteArrayRequest.field_s[11] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 51, "MissionBriefings,12");
                if (null != var2) {
                  PendingByteArrayRequest.field_s[12] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(113, "MissionBriefings,13");
                if (var2 != null) {
                  PendingByteArrayRequest.field_s[13] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 63, "MissionBriefings,14");
                if (null != var2) {
                  PendingByteArrayRequest.field_s[14] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 105, "MissionBriefings,15");
                if (var2 != null) {
                  PendingByteArrayRequest.field_s[15] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(102, "MissionBriefings,16");
                if (var2 != null) {
                  PendingByteArrayRequest.field_s[16] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 110, "MissionBriefings,17");
                if (var2 != null) {
                  PendingByteArrayRequest.field_s[17] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(86, "MissionBriefings,18");
                if (null != var2) {
                  PendingByteArrayRequest.field_s[18] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(53, "MissionBriefings,19");
                if (null != var2) {
                  PendingByteArrayRequest.field_s[19] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 123, "MissionBriefings,20");
                if (null != var2) {
                  PendingByteArrayRequest.field_s[20] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(64, "MissionBriefings,21");
                if (var2 != null) {
                  PendingByteArrayRequest.field_s[21] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(80, "MissionBriefings,22");
                if (null != var2) {
                  PendingByteArrayRequest.field_s[22] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(101, "MissionBriefings,23");
                if (null != var2) {
                  PendingByteArrayRequest.field_s[23] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(91, "MissionBriefings,24");
                if (null != var2) {
                  PendingByteArrayRequest.field_s[24] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(118, "MissionBriefings,25");
                if (null != var2) {
                  PendingByteArrayRequest.field_s[25] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(109, "MissionBriefings,26");
                if (var2 != null) {
                  PendingByteArrayRequest.field_s[26] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(62, "MissionBriefings,27");
                if (null != var2) {
                  PendingByteArrayRequest.field_s[27] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(116, "MissionBriefings,28");
                if (null != var2) {
                  PendingByteArrayRequest.field_s[28] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 97, "MissionBriefings,29");
                if (null != var2) {
                  PendingByteArrayRequest.field_s[29] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(107, "achievement_criteria,0");
                if (null != var2) {
                  QuickChatPhraseCache.field_a[0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(80, "achievement_criteria,1");
                if (var2 != null) {
                  QuickChatPhraseCache.field_a[1] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(120, "achievement_criteria,2");
                if (var2 != null) {
                  QuickChatPhraseCache.field_a[2] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(109, "achievement_criteria,3");
                if (null != var2) {
                  QuickChatPhraseCache.field_a[3] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 103, "achievement_criteria,4");
                if (var2 != null) {
                  QuickChatPhraseCache.field_a[4] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(71, "achievement_criteria,5");
                if (var2 != null) {
                  QuickChatPhraseCache.field_a[5] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(105, "achievement_criteria,6");
                if (null != var2) {
                  QuickChatPhraseCache.field_a[6] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(63, "achievement_criteria,7");
                if (null != var2) {
                  QuickChatPhraseCache.field_a[7] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(93, "achievement_criteria,8");
                if (null != var2) {
                  QuickChatPhraseCache.field_a[8] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(75, "achievement_criteria,9");
                if (var2 != null) {
                  QuickChatPhraseCache.field_a[9] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 117, "achievement_criteria,10");
                if (var2 != null) {
                  QuickChatPhraseCache.field_a[10] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 79, "achievement_criteria,11");
                if (null != var2) {
                  QuickChatPhraseCache.field_a[11] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(108, "achievement_criteria,12");
                if (var2 != null) {
                  QuickChatPhraseCache.field_a[12] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(55, "achievement_criteria,13");
                if (null != var2) {
                  QuickChatPhraseCache.field_a[13] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(124, "achievement_criteria,14");
                if (var2 != null) {
                  QuickChatPhraseCache.field_a[14] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(124, "achievement_criteria,15");
                if (var2 != null) {
                  QuickChatPhraseCache.field_a[15] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(125, "achievement_criteria,16");
                if (var2 != null) {
                  QuickChatPhraseCache.field_a[16] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(113, "achievement_criteria,17");
                if (var2 != null) {
                  QuickChatPhraseCache.field_a[17] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(95, "achievement_criteria,18");
                if (null != var2) {
                  QuickChatPhraseCache.field_a[18] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 56, "achievement_criteria,19");
                if (var2 != null) {
                  QuickChatPhraseCache.field_a[19] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(114, "achievement_criteria,20");
                if (null != var2) {
                  QuickChatPhraseCache.field_a[20] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(110, "achievement_criteria,21");
                if (null != var2) {
                  QuickChatPhraseCache.field_a[21] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 104, "achievement_criteria,22");
                if (var2 != null) {
                  QuickChatPhraseCache.field_a[22] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(90, "achievement_criteria,23");
                if (null != var2) {
                  QuickChatPhraseCache.field_a[23] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(61, "achievement_criteria,24");
                if (null != var2) {
                  QuickChatPhraseCache.field_a[24] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(102, "achievement_criteria,25");
                if (var2 != null) {
                  QuickChatPhraseCache.field_a[25] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(75, "achievement_criteria,26");
                if (null != var2) {
                  QuickChatPhraseCache.field_a[26] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(117, "achievement_criteria,27");
                if (null != var2) {
                  QuickChatPhraseCache.field_a[27] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(62, "achievement_criteria,28");
                if (null != var2) {
                  QuickChatPhraseCache.field_a[28] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(115, "achievement_criteria,29");
                if (var2 != null) {
                  QuickChatPhraseCache.field_a[29] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 65, "achievement_criteria,30");
                if (null != var2) {
                  QuickChatPhraseCache.field_a[30] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(80, "achievement_criteria,31");
                if (null != var2) {
                  QuickChatPhraseCache.field_a[31] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(112, "achievement_criteria,32");
                if (var2 != null) {
                  QuickChatPhraseCache.field_a[32] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(112, "achievement_criteria,33");
                if (var2 != null) {
                  QuickChatPhraseCache.field_a[33] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(100, "achievement_criteria,34");
                if (var2 != null) {
                  QuickChatPhraseCache.field_a[34] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 62, "achievement_criteria,35");
                if (var2 != null) {
                  QuickChatPhraseCache.field_a[35] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(102, "achievement_criteria,36");
                if (var2 != null) {
                  QuickChatPhraseCache.field_a[36] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 127, "achievement_criteria,37");
                if (null != var2) {
                  QuickChatPhraseCache.field_a[37] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 119, "achievement_criteria,38");
                if (var2 != null) {
                  QuickChatPhraseCache.field_a[38] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 95, "tabnames,0");
                if (var2 != null) {
                  DesignerPageSetup.field_d[0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(96, "tabnames,1");
                if (null != var2) {
                  DesignerPageSetup.field_d[1] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(113, "tabnames,2");
                if (var2 != null) {
                  DesignerPageSetup.field_d[2] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(70, "tabnames,3");
                if (null != var2) {
                  DesignerPageSetup.field_d[3] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(54, "modulenames,0");
                if (null != var2) {
                  BufferedRandomAccessFile.field_m[0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 79, "modulenames,1");
                if (var2 != null) {
                  BufferedRandomAccessFile.field_m[1] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(118, "modulenames,2");
                if (null != var2) {
                  BufferedRandomAccessFile.field_m[2] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 53, "modulenames,3");
                if (null != var2) {
                  BufferedRandomAccessFile.field_m[3] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(118, "modulenames,4");
                if (null != var2) {
                  BufferedRandomAccessFile.field_m[4] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(114, "modulenames,5");
                if (null != var2) {
                  BufferedRandomAccessFile.field_m[5] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(93, "modulenames,6");
                if (null != var2) {
                  BufferedRandomAccessFile.field_m[6] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(112, "modulenames,7");
                if (var2 != null) {
                  BufferedRandomAccessFile.field_m[7] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 121, "modulenames,8");
                if (var2 != null) {
                  BufferedRandomAccessFile.field_m[8] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 91, "modulenames,9");
                if (null != var2) {
                  BufferedRandomAccessFile.field_m[9] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(96, "modulenames,10");
                if (null != var2) {
                  BufferedRandomAccessFile.field_m[10] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(122, "modulenames,11");
                if (null != var2) {
                  BufferedRandomAccessFile.field_m[11] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(117, "modulenames,12");
                if (null != var2) {
                  BufferedRandomAccessFile.field_m[12] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(114, "modulenames,13");
                if (null != var2) {
                  BufferedRandomAccessFile.field_m[13] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(102, "modulenames,14");
                if (var2 != null) {
                  BufferedRandomAccessFile.field_m[14] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(113, "modulenames,15");
                if (null != var2) {
                  BufferedRandomAccessFile.field_m[15] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(123, "modulenames,16");
                if (var2 != null) {
                  BufferedRandomAccessFile.field_m[16] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 102, "modulenames,17");
                if (null != var2) {
                  BufferedRandomAccessFile.field_m[17] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(91, "modulenames,18");
                if (var2 != null) {
                  BufferedRandomAccessFile.field_m[18] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 57, "modulenames,19");
                if (var2 != null) {
                  BufferedRandomAccessFile.field_m[19] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 74, "modulenames,20");
                if (var2 != null) {
                  BufferedRandomAccessFile.field_m[20] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(57, "modulenames,21");
                if (var2 != null) {
                  BufferedRandomAccessFile.field_m[21] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(75, "modulenames,22");
                if (null != var2) {
                  BufferedRandomAccessFile.field_m[22] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(103, "modulenames,23");
                if (null != var2) {
                  BufferedRandomAccessFile.field_m[23] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(80, "modulenames,24");
                if (var2 != null) {
                  BufferedRandomAccessFile.field_m[24] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(68, "modulenames,25");
                if (var2 != null) {
                  BufferedRandomAccessFile.field_m[25] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(98, "modulenames,26");
                if (var2 != null) {
                  BufferedRandomAccessFile.field_m[26] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(68, "modulenames,27");
                if (var2 != null) {
                  BufferedRandomAccessFile.field_m[27] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(121, "modulenames,28");
                if (var2 != null) {
                  BufferedRandomAccessFile.field_m[28] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 114, "modulenames,29");
                if (null != var2) {
                  BufferedRandomAccessFile.field_m[29] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(58, "modulenames,30");
                if (null != var2) {
                  BufferedRandomAccessFile.field_m[30] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(74, "modulenames,31");
                if (var2 != null) {
                  BufferedRandomAccessFile.field_m[31] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(111, "modulenames,32");
                if (var2 != null) {
                  BufferedRandomAccessFile.field_m[32] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(64, "modulenames,33");
                if (null != var2) {
                  BufferedRandomAccessFile.field_m[33] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 57, "targetlocktxt");
                if (null != var2) {
                  ResizableModalPanel.field_gb = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 119, "edd_shortname");
                if (null != var2) {
                  StripedProgressBar.field_O = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 63, "powerupnames,0");
                if (null != var2) {
                  SentinelAnimationEditor.field_v[0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(97, "powerupnames,1");
                if (var2 != null) {
                  SentinelAnimationEditor.field_v[1] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(99, "powerupnames,2");
                if (null != var2) {
                  SentinelAnimationEditor.field_v[2] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(91, "powerupnames,3");
                if (var2 != null) {
                  SentinelAnimationEditor.field_v[3] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(54, "powerupnames,4");
                if (null != var2) {
                  SentinelAnimationEditor.field_v[4] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(82, "powerupnames,5");
                if (var2 != null) {
                  SentinelAnimationEditor.field_v[5] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(111, "powerupnames,6");
                if (null != var2) {
                  SentinelAnimationEditor.field_v[6] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 98, "powerupnames,7");
                if (null != var2) {
                  SentinelAnimationEditor.field_v[7] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(86, "powerupnames,8");
                if (null != var2) {
                  SentinelAnimationEditor.field_v[8] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(70, "powerupnames,9");
                if (var2 != null) {
                  SentinelAnimationEditor.field_v[9] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(71, "powerupnames,10");
                if (null != var2) {
                  SentinelAnimationEditor.field_v[10] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 99, "meleeattackdesc,0");
                if (null != var2) {
                  AccountNoticeDialog.field_nb[0] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(82, "meleeattackdesc,1");
                if (null != var2) {
                  AccountNoticeDialog.field_nb[1] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(127, "meleeattackdesc,2");
                if (null != var2) {
                  AccountNoticeDialog.field_nb[2] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(75, "poweruptips,0");
                if (null != var2) {
                  UiTheme.field_p[0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 119, "poweruptips,1");
                if (null != var2) {
                  UiTheme.field_p[1] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(53, "poweruptips,2");
                if (var2 != null) {
                  UiTheme.field_p[2] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 101, "poweruptips,3");
                if (null != var2) {
                  UiTheme.field_p[3] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 88, "poweruptips,4");
                if (null != var2) {
                  UiTheme.field_p[4] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(127, "poweruptips,5");
                if (var2 != null) {
                  UiTheme.field_p[5] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(51, "poweruptips,6");
                if (var2 != null) {
                  UiTheme.field_p[6] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 119, "poweruptips,7");
                if (null != var2) {
                  UiTheme.field_p[7] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(67, "poweruptips,8");
                if (null != var2) {
                  UiTheme.field_p[8] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(98, "poweruptips,9");
                if (null != var2) {
                  UiTheme.field_p[9] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 56, "poweruptips,10");
                if (var2 != null) {
                  UiTheme.field_p[10] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(65, "poweruptips,11");
                if (var2 != null) {
                  UiTheme.field_p[11] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 79, "poweruptips,12");
                if (null != var2) {
                  UiTheme.field_p[12] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 73, "poweruptips,13");
                if (var2 != null) {
                  UiTheme.field_p[13] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 92, "poweruptips,14");
                if (null != var2) {
                  UiTheme.field_p[14] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(57, "poweruptips,15");
            }
            void runChunk1() throws java.lang.RuntimeException {
                if (null != var2) {
                  UiTheme.field_p[15] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(118, "poweruptips,16");
                if (var2 != null) {
                  UiTheme.field_p[16] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 64, "poweruptips,17");
                if (null != var2) {
                  UiTheme.field_p[17] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(104, "poweruptips,18");
                if (var2 != null) {
                  UiTheme.field_p[18] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(62, "poweruptips,19");
                if (var2 != null) {
                  UiTheme.field_p[19] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(81, "poweruptips,20");
                if (null != var2) {
                  UiTheme.field_p[20] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(63, "poweruptips,21");
                if (null != var2) {
                  UiTheme.field_p[21] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(93, "poweruptips,22");
                if (var2 != null) {
                  UiTheme.field_p[22] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(94, "poweruptips,23");
                if (var2 != null) {
                  UiTheme.field_p[23] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 64, "poweruptips,24");
                if (var2 != null) {
                  UiTheme.field_p[24] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(114, "poweruptips,25");
                if (null != var2) {
                  UiTheme.field_p[25] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(111, "poweruptips,26");
                if (null != var2) {
                  UiTheme.field_p[26] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(126, "poweruptips,27");
                if (var2 != null) {
                  UiTheme.field_p[27] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(98, "poweruptips,28");
                if (var2 != null) {
                  UiTheme.field_p[28] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(90, "poweruptips,29");
                if (null != var2) {
                  UiTheme.field_p[29] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(98, "poweruptips,30");
                if (null != var2) {
                  UiTheme.field_p[30] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(96, "poweruptips,31");
                if (var2 != null) {
                  UiTheme.field_p[31] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(85, "poweruptips,32");
                if (var2 != null) {
                  UiTheme.field_p[32] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 69, "poweruptips,33");
                if (var2 != null) {
                  UiTheme.field_p[33] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(96, "poweruptips,34");
                if (var2 != null) {
                  UiTheme.field_p[34] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(67, "poweruptips,35");
                if (var2 != null) {
                  UiTheme.field_p[35] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 72, "poweruptips,36");
                if (var2 != null) {
                  UiTheme.field_p[36] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(126, "poweruptips,37");
                if (null != var2) {
                  UiTheme.field_p[37] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 94, "poweruptips,38");
                if (var2 != null) {
                  UiTheme.field_p[38] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(85, "poweruptips,39");
                if (null != var2) {
                  UiTheme.field_p[39] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 125, "poweruptips,40");
                if (null != var2) {
                  UiTheme.field_p[40] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(51, "poweruptips,41");
                if (null != var2) {
                  UiTheme.field_p[41] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(51, "poweruptips,42");
                if (null != var2) {
                  UiTheme.field_p[42] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(85, "poweruptips,43");
                if (null != var2) {
                  UiTheme.field_p[43] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(78, "poweruptips,44");
                if (null != var2) {
                  UiTheme.field_p[44] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(127, "poweruptips,45");
                if (var2 != null) {
                  UiTheme.field_p[45] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(101, "sloadertip_short");
                if (var2 != null) {
                  LoadoutCostHelpers.field_b = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(63, "moduledescriptions,0");
                if (null != var2) {
                  PopupMenuSupport.field_a[0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(60, "moduledescriptions,1");
                if (var2 != null) {
                  PopupMenuSupport.field_a[1] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(122, "moduledescriptions,2");
                if (null != var2) {
                  PopupMenuSupport.field_a[2] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 77, "moduledescriptions,3");
                if (null != var2) {
                  PopupMenuSupport.field_a[3] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(125, "moduledescriptions,4");
                if (var2 != null) {
                  PopupMenuSupport.field_a[4] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(80, "moduledescriptions,5");
                if (var2 != null) {
                  PopupMenuSupport.field_a[5] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(72, "moduledescriptions,6");
                if (null != var2) {
                  PopupMenuSupport.field_a[6] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(124, "moduledescriptions,7");
                if (var2 != null) {
                  PopupMenuSupport.field_a[7] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(76, "moduledescriptions,8");
                if (var2 != null) {
                  PopupMenuSupport.field_a[8] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(120, "moduledescriptions,9");
                if (null != var2) {
                  PopupMenuSupport.field_a[9] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(64, "moduledescriptions,10");
                if (var2 != null) {
                  PopupMenuSupport.field_a[10] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 69, "moduledescriptions,11");
                if (var2 != null) {
                  PopupMenuSupport.field_a[11] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(107, "moduledescriptions,12");
                if (var2 != null) {
                  PopupMenuSupport.field_a[12] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(75, "moduledescriptions,13");
                if (null != var2) {
                  PopupMenuSupport.field_a[13] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(83, "moduledescriptions,14");
                if (var2 != null) {
                  PopupMenuSupport.field_a[14] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(110, "moduledescriptions,15");
                if (null != var2) {
                  PopupMenuSupport.field_a[15] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(73, "moduledescriptions,16");
                if (var2 != null) {
                  PopupMenuSupport.field_a[16] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(115, "moduledescriptions,17");
                if (null != var2) {
                  PopupMenuSupport.field_a[17] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 55, "moduledescriptions,18");
                if (null != var2) {
                  PopupMenuSupport.field_a[18] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(82, "moduledescriptions,19");
                if (var2 != null) {
                  PopupMenuSupport.field_a[19] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(80, "moduledescriptions,20");
                if (null != var2) {
                  PopupMenuSupport.field_a[20] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(81, "moduledescriptions,21");
                if (var2 != null) {
                  PopupMenuSupport.field_a[21] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(111, "moduledescriptions,22");
                if (var2 != null) {
                  PopupMenuSupport.field_a[22] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(111, "moduledescriptions,23");
                if (var2 != null) {
                  PopupMenuSupport.field_a[23] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(95, "moduledescriptions,24");
                if (var2 != null) {
                  PopupMenuSupport.field_a[24] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(78, "moduledescriptions,25");
                if (var2 != null) {
                  PopupMenuSupport.field_a[25] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(52, "moduledescriptions,26");
                if (null != var2) {
                  PopupMenuSupport.field_a[26] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 79, "moduledescriptions,27");
                if (var2 != null) {
                  PopupMenuSupport.field_a[27] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(74, "moduledescriptions,28");
                if (var2 != null) {
                  PopupMenuSupport.field_a[28] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 80, "moduledescriptions,29");
                if (var2 != null) {
                  PopupMenuSupport.field_a[29] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(57, "moduledescriptions,30");
                if (var2 != null) {
                  PopupMenuSupport.field_a[30] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 122, "moduledescriptions,31");
                if (var2 != null) {
                  PopupMenuSupport.field_a[31] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(67, "moduledescriptions,32");
                if (var2 != null) {
                  PopupMenuSupport.field_a[32] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 63, "moduledescriptions,33");
                if (null != var2) {
                  PopupMenuSupport.field_a[33] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(81, "comtypenames,0");
                if (null != var2) {
                  BoundedRandomAccessFile.field_i[0] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(101, "comtypenames,1");
                if (null != var2) {
                  BoundedRandomAccessFile.field_i[1] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(125, "comtypenames,2");
                if (var2 != null) {
                  BoundedRandomAccessFile.field_i[2] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(97, "comtypenames,3");
                if (null != var2) {
                  BoundedRandomAccessFile.field_i[3] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(112, "comtypenames,4");
                if (null != var2) {
                  BoundedRandomAccessFile.field_i[4] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 122, "comtypenames,5");
                if (null != var2) {
                  BoundedRandomAccessFile.field_i[5] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(79, "comtypenames,6");
                if (null != var2) {
                  BoundedRandomAccessFile.field_i[6] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(127, "comtypenames,7");
                if (var2 != null) {
                  BoundedRandomAccessFile.field_i[7] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(89, "comtypenames,8");
                if (null != var2) {
                  BoundedRandomAccessFile.field_i[8] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(117, "comtypenames,9");
                if (var2 != null) {
                  BoundedRandomAccessFile.field_i[9] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 110, "comtypenames,10");
                if (null != var2) {
                  BoundedRandomAccessFile.field_i[10] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(54, "comtypenames,11");
                if (null != var2) {
                  BoundedRandomAccessFile.field_i[11] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(60, "mod_category_names,0");
                if (var2 != null) {
                  CachedTextLayout.field_D[0] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(104, "mod_category_names,1");
                if (var2 != null) {
                  CachedTextLayout.field_D[1] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(78, "mod_category_names,2");
                if (var2 != null) {
                  CachedTextLayout.field_D[2] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(79, "mod_category_names,3");
                if (null != var2) {
                  CachedTextLayout.field_D[3] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(93, "mod_category_names,4");
                if (var2 != null) {
                  CachedTextLayout.field_D[4] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 107, "mod_category_names,5");
                if (null != var2) {
                  CachedTextLayout.field_D[5] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(80, "mod_category_names,6");
                if (var2 != null) {
                  CachedTextLayout.field_D[6] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(116, "mod_category_names,7");
                if (null != var2) {
                  CachedTextLayout.field_D[7] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(91, "weaponnames,0");
                if (var2 != null) {
                  NodeHashTable.field_i[0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 79, "weaponnames,1");
                if (null != var2) {
                  NodeHashTable.field_i[1] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 72, "weaponnames,2");
                if (null != var2) {
                  NodeHashTable.field_i[2] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 88, "weaponnames,3");
                if (var2 != null) {
                  NodeHashTable.field_i[3] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 126, "weaponnames,4");
                if (null != var2) {
                  NodeHashTable.field_i[4] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(89, "weaponnames,5");
                if (var2 != null) {
                  NodeHashTable.field_i[5] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(101, "weaponnames,6");
                if (var2 != null) {
                  NodeHashTable.field_i[6] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 103, "weaponnames,7");
                if (var2 != null) {
                  NodeHashTable.field_i[7] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 117, "weaponnames,8");
                if (var2 != null) {
                  NodeHashTable.field_i[8] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(110, "weaponnames,9");
                if (null != var2) {
                  NodeHashTable.field_i[9] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(124, "weaponnames,10");
                if (var2 != null) {
                  NodeHashTable.field_i[10] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(82, "weaponnames,11");
                if (null != var2) {
                  NodeHashTable.field_i[11] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 77, "weaponnames,12");
                if (var2 != null) {
                  NodeHashTable.field_i[12] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(110, "weaponnames,13");
                if (null != var2) {
                  NodeHashTable.field_i[13] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(104, "weaponnames,14");
                if (var2 != null) {
                  NodeHashTable.field_i[14] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 93, "weaponnames,15");
                if (null != var2) {
                  NodeHashTable.field_i[15] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(54, "weaponnames,16");
                if (null != var2) {
                  NodeHashTable.field_i[16] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(118, "weaponnames,17");
                if (var2 != null) {
                  NodeHashTable.field_i[17] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(113, "weaponnames,18");
                if (null != var2) {
                  NodeHashTable.field_i[18] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(98, "weaponnames,19");
                if (var2 != null) {
                  NodeHashTable.field_i[19] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(119, "weaponnames,20");
                if (null != var2) {
                  NodeHashTable.field_i[20] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(76, "weaponnames,21");
                if (null != var2) {
                  NodeHashTable.field_i[21] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(67, "weaponnames,22");
                if (null != var2) {
                  NodeHashTable.field_i[22] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(58, "weaponnames,23");
                if (var2 != null) {
                  NodeHashTable.field_i[23] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(125, "weaponnames,24");
                if (null != var2) {
                  NodeHashTable.field_i[24] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(118, "weaponnames,25");
                if (null != var2) {
                  NodeHashTable.field_i[25] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(120, "weaponnames,26");
                if (var2 != null) {
                  NodeHashTable.field_i[26] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(107, "weaponnames,27");
                if (null != var2) {
                  NodeHashTable.field_i[27] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(64, "weaponnames,28");
                if (var2 != null) {
                  NodeHashTable.field_i[28] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 120, "weaponnames,29");
                if (var2 != null) {
                  NodeHashTable.field_i[29] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(99, "weaponnames,30");
                if (null != var2) {
                  NodeHashTable.field_i[30] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(113, "weaponnames,31");
                if (null != var2) {
                  NodeHashTable.field_i[31] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(59, "weaponnames,32");
                if (var2 != null) {
                  NodeHashTable.field_i[32] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(74, "weaponnames,33");
                if (var2 != null) {
                  NodeHashTable.field_i[33] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(114, "weaponnames,34");
                if (null != var2) {
                  NodeHashTable.field_i[34] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(95, "weaponnames,35");
                if (null != var2) {
                  NodeHashTable.field_i[35] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(58, "weaponkillstrings,0");
                if (var2 != null) {
                  TriangleMesh.field_D[0] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(87, "weaponkillstrings,1");
                if (var2 != null) {
                  TriangleMesh.field_D[1] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(112, "weaponkillstrings,2");
                if (var2 != null) {
                  TriangleMesh.field_D[2] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(73, "weaponkillstrings,3");
                if (var2 != null) {
                  TriangleMesh.field_D[3] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 118, "weaponkillstrings,4");
                if (null != var2) {
                  TriangleMesh.field_D[4] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(77, "weaponkillstrings,5");
                if (null != var2) {
                  TriangleMesh.field_D[5] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(123, "weaponkillstrings,6");
                if (var2 != null) {
                  TriangleMesh.field_D[6] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 65, "weaponkillstrings,7");
                if (var2 != null) {
                  TriangleMesh.field_D[7] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(93, "weaponkillstrings,8");
                if (null != var2) {
                  TriangleMesh.field_D[8] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(101, "weaponkillstrings,9");
                if (null != var2) {
                  TriangleMesh.field_D[9] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 71, "weaponkillstrings,10");
                if (null != var2) {
                  TriangleMesh.field_D[10] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 91, "weaponkillstrings,11");
                if (var2 != null) {
                  TriangleMesh.field_D[11] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(87, "weaponkillstrings,12");
                if (null != var2) {
                  TriangleMesh.field_D[12] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(65, "weaponkillstrings,13");
                if (var2 != null) {
                  TriangleMesh.field_D[13] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(94, "weaponkillstrings,14");
                if (null != var2) {
                  TriangleMesh.field_D[14] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(79, "weaponkillstrings,15");
                if (var2 != null) {
                  TriangleMesh.field_D[15] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(92, "weaponkillstrings,16");
                if (null != var2) {
                  TriangleMesh.field_D[16] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(97, "weaponkillstrings,17");
                if (var2 != null) {
                  TriangleMesh.field_D[17] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(78, "weaponkillstrings,18");
                if (null != var2) {
                  TriangleMesh.field_D[18] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(95, "weaponkillstrings,19");
                if (var2 != null) {
                  TriangleMesh.field_D[19] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(71, "weaponkillstrings,20");
                if (null != var2) {
                  TriangleMesh.field_D[20] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(122, "weaponkillstrings,21");
                if (null != var2) {
                  TriangleMesh.field_D[21] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(126, "weaponkillstrings,22");
                if (null != var2) {
                  TriangleMesh.field_D[22] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(106, "weaponkillstrings,23");
                if (null != var2) {
                  TriangleMesh.field_D[23] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(51, "weaponkillstrings,24");
                if (null != var2) {
                  TriangleMesh.field_D[24] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(77, "weaponkillstrings,25");
                if (null != var2) {
                  TriangleMesh.field_D[25] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(109, "weaponkillstrings,26");
                if (null != var2) {
                  TriangleMesh.field_D[26] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(119, "weaponkillstrings,27");
                if (var2 != null) {
                  TriangleMesh.field_D[27] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(121, "weaponkillstrings,28");
                if (var2 != null) {
                  TriangleMesh.field_D[28] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(73, "weaponkillstrings,29");
                if (null != var2) {
                  TriangleMesh.field_D[29] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 96, "weaponkillstrings,30");
                if (var2 != null) {
                  TriangleMesh.field_D[30] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 92, "weaponkillstrings,31");
                if (null != var2) {
                  TriangleMesh.field_D[31] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(125, "weaponkillstrings,32");
                if (var2 != null) {
                  TriangleMesh.field_D[32] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 69, "weaponkillstrings,33");
                if (var2 != null) {
                  TriangleMesh.field_D[33] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 125, "weaponkillstrings,34");
                if (var2 != null) {
                  TriangleMesh.field_D[34] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 76, "weaponkillstrings,35");
                if (null != var2) {
                  TriangleMesh.field_D[35] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(96, "hitbyshipmsg");
                if (null != var2) {
                  ResizableModalPanel.field_Z = IntKeyLookup.decodeWindowsCodePageString(param0 ^ 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(68, "space_shotbyshipmsg");
                if (null != var2) {
                  EmailValidationHelpers.field_d = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(57, "lost_shotbyshipmsg");
                if (var2 != null) {
                  GzipDecoder.field_h = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 65, "selfkillmsg");
                if (var2 != null) {
                  NodeHashTableIterator.field_a = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 99, "caughtinexplosionmsg");
                if (null != var2) {
                  IntKeyLookup.field_k = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(59, "destroyedinexplosionmsg");
                if (var2 != null) {
                  CheckboxPainter.field_r = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(100, "caughtinnukeexplosionmsg");
                if (var2 != null) {
                  NumericDateInputWidget.field_ab = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(77, "destroyedinnukeexplosionmsg");
                if (null != var2) {
                  VerticalScrollbar.field_Vb = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(124, "expertlysniped");
                if (var2 != null) {
                  ArrayWidgetContainer.field_I = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(104, "closecombatmsg,0");
                if (var2 != null) {
                  ChatHistoryAllocator.field_k[0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(73, "closecombatmsg,1");
                if (var2 != null) {
                  ChatHistoryAllocator.field_k[1] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(53, "closecombatmsg,2");
                if (null != var2) {
                  ChatHistoryAllocator.field_k[2] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(53, "closecombatmsg,3");
                if (var2 != null) {
                  ChatHistoryAllocator.field_k[3] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(108, "destroyedmsg");
                if (var2 != null) {
                  NodeDeque.field_f = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 110, "destroyedsomehowmsg");
                if (null != var2) {
                  PendingPackedReply.field_s = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 76, "damagedmsg");
                if (null != var2) {
                  LobbyPlayer.field_Tb = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(89, "andfinishedbydronemsg");
                if (null != var2) {
                  DisplayMode.field_k = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 69, "andfinishedbyrockmsg");
                if (var2 != null) {
                  TextLayout.field_i = IntKeyLookup.decodeWindowsCodePageString(param0 ^ 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(59, "plummetmsg");
                if (var2 != null) {
                  HighscoreTable.field_v = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 96, "andplummetmsg");
                if (null != var2) {
                  PartInstruction.field_c = IntKeyLookup.decodeWindowsCodePageString(param0 ^ 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(126, "unknownfoe");
                if (null != var2) {
                  TextLayoutLine.field_d = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 81, "killedwhenrocketintercepted");
                if (null != var2) {
                  LoadingProgressDialog.field_pb = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 90, "killedwhenmissileintercepted");
                if (var2 != null) {
                  PasswordValidator.field_o = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 112, "killedwhenbombintercepted");
                if (null != var2) {
                  NanoTickClock.field_r = IntKeyLookup.decodeWindowsCodePageString(param0 ^ 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 78, "weaponstatlabels,0");
                if (var2 != null) {
                  TextAndBitHelpers.field_b[0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 113, "weaponstatlabels,1");
                if (var2 != null) {
                  TextAndBitHelpers.field_b[1] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(70, "weaponstatlabels,2");
                if (var2 != null) {
                  TextAndBitHelpers.field_b[2] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(110, "weaponstatlabels,3");
                if (var2 != null) {
                  TextAndBitHelpers.field_b[3] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(127, "weaponstatlabels,4");
                if (null != var2) {
                  TextAndBitHelpers.field_b[4] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(105, "weaponstatlabels,5");
                if (null != var2) {
                  TextAndBitHelpers.field_b[5] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(70, "weaponstatlabels,6");
                if (var2 != null) {
                  TextAndBitHelpers.field_b[6] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(78, "weaponstatlabels,7");
                if (var2 != null) {
                  TextAndBitHelpers.field_b[7] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(68, "weaponstatlabels,8");
                if (var2 != null) {
                  TextAndBitHelpers.field_b[8] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 120, "weaponclasstxt");
                if (var2 != null) {
                  LobbyStateHelpers.field_c = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(101, "Weapon_class_names,0");
                if (null != var2) {
                  PasswordFieldPainter.field_B[0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(97, "Weapon_class_names,1");
                if (null != var2) {
                  PasswordFieldPainter.field_B[1] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(60, "Weapon_class_names,2");
                if (var2 != null) {
                  PasswordFieldPainter.field_B[2] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(120, "Weapon_class_names,3");
                if (null != var2) {
                  PasswordFieldPainter.field_B[3] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 60, "Weapon_class_names,4");
                if (null != var2) {
                  PasswordFieldPainter.field_B[4] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(121, "Weapon_class_names,5");
                if (var2 != null) {
                  PasswordFieldPainter.field_B[5] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(51, "Weapon_class_names,6");
                if (null != var2) {
                  PasswordFieldPainter.field_B[6] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(102, "Weapon_class_names,7");
                if (null != var2) {
                  PasswordFieldPainter.field_B[7] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(84, "Weapon_class_names,8");
                if (var2 != null) {
                  PasswordFieldPainter.field_B[8] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 85, "Weapon_class_names,9");
                if (var2 != null) {
                  PasswordFieldPainter.field_B[9] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(90, "Weapon_class_names,10");
                if (null != var2) {
                  PasswordFieldPainter.field_B[10] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(116, "Weapon_class_names,11");
                if (null != var2) {
                  PasswordFieldPainter.field_B[11] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 92, "Weapon_class_names,12");
                if (var2 != null) {
                  PasswordFieldPainter.field_B[12] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(51, "Weapon_class_names,13");
                if (null != var2) {
                  PasswordFieldPainter.field_B[13] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(124, "Weapon_class_names,14");
                if (var2 != null) {
                  PasswordFieldPainter.field_B[14] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(82, "Weapon_class_names,15");
                if (null != var2) {
                  PasswordFieldPainter.field_B[15] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(62, "Weapon_class_names,16");
                if (null != var2) {
                  PasswordFieldPainter.field_B[16] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(69, "Weapon_class_names,17");
                if (var2 != null) {
                  PasswordFieldPainter.field_B[17] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(122, "Weapon_class_names,18");
                if (var2 != null) {
                  PasswordFieldPainter.field_B[18] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(109, "Weapon_class_names,19");
                if (var2 != null) {
                  PasswordFieldPainter.field_B[19] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(95, "sentinel_descriptions,0");
                if (var2 != null) {
                  WhirlpoolHasher.field_g[0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(97, "sentinel_descriptions,1");
                if (var2 != null) {
                  WhirlpoolHasher.field_g[1] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(94, "sentinel_descriptions,2");
                if (var2 != null) {
                  WhirlpoolHasher.field_g[2] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(55, "sentinel_descriptions,3");
                if (var2 != null) {
                  WhirlpoolHasher.field_g[3] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(69, "sentinel_descriptions,4");
                if (var2 != null) {
                  WhirlpoolHasher.field_g[4] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(99, "sentinel_descriptions,5");
                if (var2 != null) {
                  WhirlpoolHasher.field_g[5] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(76, "sentinel_descriptions,6");
                if (var2 != null) {
                  WhirlpoolHasher.field_g[6] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 69, "sentinel_descriptions,7");
                if (var2 != null) {
                  WhirlpoolHasher.field_g[7] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(116, "sentinel_descriptions,8");
                if (null != var2) {
                  WhirlpoolHasher.field_g[8] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(67, "sentinel_descriptions,9");
                if (var2 != null) {
                  WhirlpoolHasher.field_g[9] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
            }
            void runChunk2() throws java.lang.RuntimeException {
                var2 = SentinelDesigner.readTextResourceBytes(68, "sentinel_descriptions,10");
                if (var2 != null) {
                  WhirlpoolHasher.field_g[10] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(58, "sentinel_descriptions,11");
                if (var2 != null) {
                  WhirlpoolHasher.field_g[11] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 57, "weapondescriptions,0");
                if (var2 != null) {
                  SocketConnector.field_g[0] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 61, "weapondescriptions,1");
                if (null != var2) {
                  SocketConnector.field_g[1] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(57, "weapondescriptions,2");
                if (var2 != null) {
                  SocketConnector.field_g[2] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 97, "weapondescriptions,3");
                if (null != var2) {
                  SocketConnector.field_g[3] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(121, "weapondescriptions,4");
                if (null != var2) {
                  SocketConnector.field_g[4] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(57, "weapondescriptions,5");
                if (null != var2) {
                  SocketConnector.field_g[5] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(118, "weapondescriptions,6");
                if (var2 != null) {
                  SocketConnector.field_g[6] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(69, "weapondescriptions,7");
                if (var2 != null) {
                  SocketConnector.field_g[7] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(99, "weapondescriptions,8");
                if (var2 != null) {
                  SocketConnector.field_g[8] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(102, "weapondescriptions,9");
                if (null != var2) {
                  SocketConnector.field_g[9] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(67, "weapondescriptions,10");
                if (var2 != null) {
                  SocketConnector.field_g[10] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(79, "weapondescriptions,11");
                if (null != var2) {
                  SocketConnector.field_g[11] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 116, "weapondescriptions,12");
                if (null != var2) {
                  SocketConnector.field_g[12] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(95, "weapondescriptions,13");
                if (null != var2) {
                  SocketConnector.field_g[13] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(69, "weapondescriptions,14");
                if (var2 != null) {
                  SocketConnector.field_g[14] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(76, "weapondescriptions,15");
                if (null != var2) {
                  SocketConnector.field_g[15] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(96, "weapondescriptions,16");
                if (null != var2) {
                  SocketConnector.field_g[16] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(70, "weapondescriptions,17");
                if (var2 != null) {
                  SocketConnector.field_g[17] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(53, "weapondescriptions,18");
                if (var2 != null) {
                  SocketConnector.field_g[18] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 65, "weapondescriptions,19");
                if (null != var2) {
                  SocketConnector.field_g[19] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(112, "weapondescriptions,20");
                if (null != var2) {
                  SocketConnector.field_g[20] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(95, "weapondescriptions,21");
                if (null != var2) {
                  SocketConnector.field_g[21] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(90, "weapondescriptions,22");
                if (null != var2) {
                  SocketConnector.field_g[22] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(77, "weapondescriptions,23");
                if (null != var2) {
                  SocketConnector.field_g[23] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(81, "weapondescriptions,24");
                if (var2 != null) {
                  SocketConnector.field_g[24] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(103, "weapondescriptions,25");
                if (var2 != null) {
                  SocketConnector.field_g[25] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(81, "weapondescriptions,26");
                if (null != var2) {
                  SocketConnector.field_g[26] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(87, "weapondescriptions,27");
                if (var2 != null) {
                  SocketConnector.field_g[27] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(79, "weapondescriptions,28");
                if (null != var2) {
                  SocketConnector.field_g[28] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 123, "weapondescriptions,29");
                if (null != var2) {
                  SocketConnector.field_g[29] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(72, "weapondescriptions,30");
                if (var2 != null) {
                  SocketConnector.field_g[30] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 111, "weapondescriptions,31");
                if (var2 != null) {
                  SocketConnector.field_g[31] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(67, "weapondescriptions,32");
                if (null != var2) {
                  SocketConnector.field_g[32] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(118, "weapondescriptions,33");
                if (var2 != null) {
                  SocketConnector.field_g[33] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 94, "weapondescriptions,34");
                if (null != var2) {
                  SocketConnector.field_g[34] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 105, "weapondescriptions,35");
                if (null != var2) {
                  SocketConnector.field_g[35] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(106, "cannotbefiredinair");
                if (null != var2) {
                  TickClock.field_h = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(114, "closecombattxt");
                if (var2 != null) {
                  TextButton.field_H = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 88, "gameoptlabels,0");
                if (null != var2) {
                  ModalPanel.field_R[0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(104, "gameoptlabels,1");
                if (var2 != null) {
                  ModalPanel.field_R[1] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(95, "gameoptlabels,2");
                if (null != var2) {
                  ModalPanel.field_R[2] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 87, "gameoptnames,0,0");
                if (null != var2) {
                  FriendListHelpers.field_c[0][0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(61, "gameoptnames,0,1");
                if (null != var2) {
                  FriendListHelpers.field_c[0][1] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(122, "gameoptnames,1,0");
                if (null != var2) {
                  FriendListHelpers.field_c[1][0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(78, "gameoptnames,1,1");
                if (null != var2) {
                  FriendListHelpers.field_c[1][1] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(115, "gameoptnames,1,2");
                if (var2 != null) {
                  FriendListHelpers.field_c[1][2] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(121, "gameoptnames,1,3");
                if (null != var2) {
                  FriendListHelpers.field_c[1][3] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(56, "gameoptnames,1,4");
                if (null != var2) {
                  FriendListHelpers.field_c[1][4] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 54, "gameoptnames,2,0");
                if (null != var2) {
                  FriendListHelpers.field_c[2][0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 118, "gameoptnames,2,1");
                if (var2 != null) {
                  FriendListHelpers.field_c[2][1] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 85, "gameoptnames,2,2");
                if (var2 != null) {
                  FriendListHelpers.field_c[2][2] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(85, "gameoptnames,2,3");
                if (var2 != null) {
                  FriendListHelpers.field_c[2][3] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(84, "gameoptnames,2,4");
                if (var2 != null) {
                  FriendListHelpers.field_c[2][4] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 75, "gameoptnames,2,5");
                if (var2 != null) {
                  FriendListHelpers.field_c[2][5] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(58, "gameopttooltips,0,0");
                if (var2 != null) {
                  ParticleEffect.field_y[0][0] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(116, "gameopttooltips,0,1");
                if (var2 != null) {
                  ParticleEffect.field_y[0][1] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(99, "gameopttooltips,1,0");
                if (var2 != null) {
                  ParticleEffect.field_y[1][0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 92, "gameopttooltips,1,1");
                if (var2 != null) {
                  ParticleEffect.field_y[1][1] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(110, "gameopttooltips,1,2");
                if (var2 != null) {
                  ParticleEffect.field_y[1][2] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 61, "gameopttooltips,1,3");
                if (var2 != null) {
                  ParticleEffect.field_y[1][3] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 90, "gameopttooltips,1,4");
                if (var2 != null) {
                  ParticleEffect.field_y[1][4] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 53, "gameopttooltips,2,0");
                if (var2 != null) {
                  ParticleEffect.field_y[2][0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(118, "gameopttooltips,2,1");
                if (var2 != null) {
                  ParticleEffect.field_y[2][1] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(112, "gameopttooltips,2,2");
                if (var2 != null) {
                  ParticleEffect.field_y[2][2] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(51, "gameopttooltips,2,3");
                if (null != var2) {
                  ParticleEffect.field_y[2][3] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(95, "gameopttooltips,2,4");
                if (null != var2) {
                  ParticleEffect.field_y[2][4] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(106, "gameopttooltips,2,5");
                if (null != var2) {
                  ParticleEffect.field_y[2][5] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(119, "instruction_set,0,0");
                if (null != var2) {
                  MouseInputHandler.field_g[0][0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(78, "instruction_set,1,0");
                if (null != var2) {
                  MouseInputHandler.field_g[1][0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(90, "instruction_set,1,1");
                if (null != var2) {
                  MouseInputHandler.field_g[1][1] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(91, "instruction_set,2,0");
                if (null != var2) {
                  MouseInputHandler.field_g[2][0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(87, "instruction_set,3,0");
                if (var2 != null) {
                  MouseInputHandler.field_g[3][0] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(104, "instruction_set,3,1");
                if (null != var2) {
                  MouseInputHandler.field_g[3][1] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(58, "instruction_set,4,0");
                if (var2 != null) {
                  MouseInputHandler.field_g[4][0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(58, "instruction_set,5,0");
                if (var2 != null) {
                  MouseInputHandler.field_g[5][0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(76, "instruction_set,6,0");
                if (null != var2) {
                  MouseInputHandler.field_g[6][0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(88, "instruction_set,7,0");
                if (var2 != null) {
                  MouseInputHandler.field_g[7][0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(120, "instruction_set,8,0");
                if (var2 != null) {
                  MouseInputHandler.field_g[8][0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 51, "instruction_set,9,0");
                if (null != var2) {
                  MouseInputHandler.field_g[9][0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(67, "instruction_set,10,0");
                if (var2 != null) {
                  MouseInputHandler.field_g[10][0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 117, "instruction_set,11,0");
                if (null != var2) {
                  MouseInputHandler.field_g[11][0] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 115, "instruction_set,12,0");
                if (var2 != null) {
                  MouseInputHandler.field_g[12][0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(120, "instruction_set,12,1");
                if (null != var2) {
                  MouseInputHandler.field_g[12][1] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(61, "instruction_set,13,0");
                if (var2 != null) {
                  MouseInputHandler.field_g[13][0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(77, "instruction_set,13,1");
                if (var2 != null) {
                  MouseInputHandler.field_g[13][1] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(52, "instruction_set,14,0");
                if (null != var2) {
                  MouseInputHandler.field_g[14][0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(111, "instruction_set,15,0");
                if (var2 != null) {
                  MouseInputHandler.field_g[15][0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(124, "instruction_set,16,0");
                if (var2 != null) {
                  MouseInputHandler.field_g[16][0] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 88, "instruction_set,17,0");
                if (var2 != null) {
                  MouseInputHandler.field_g[17][0] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(94, "instruction_set,18,0");
                if (null != var2) {
                  MouseInputHandler.field_g[18][0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(85, "instruction_set,19,0");
                if (var2 != null) {
                  MouseInputHandler.field_g[19][0] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 72, "instruction_set,20,0");
                if (null != var2) {
                  MouseInputHandler.field_g[20][0] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(84, "instruction_set,21,0");
                if (var2 != null) {
                  MouseInputHandler.field_g[21][0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(51, "instruction_set,22,0");
                if (null != var2) {
                  MouseInputHandler.field_g[22][0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(102, "instruction_set,23,0");
                if (var2 != null) {
                  MouseInputHandler.field_g[23][0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(51, "instruction_set,23,1");
                if (null != var2) {
                  MouseInputHandler.field_g[23][1] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(66, "instruction_set,24,0");
                if (var2 != null) {
                  MouseInputHandler.field_g[24][0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(114, "instruction_set,24,1");
                if (var2 != null) {
                  MouseInputHandler.field_g[24][1] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(103, "instruction_set,25,0");
                if (var2 != null) {
                  MouseInputHandler.field_g[25][0] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 74, "instruction_set,26,0");
                if (var2 != null) {
                  MouseInputHandler.field_g[26][0] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(108, "instruction_set,27,0");
                if (var2 != null) {
                  MouseInputHandler.field_g[27][0] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 106, "instruction_set,28,0");
                if (var2 != null) {
                  MouseInputHandler.field_g[28][0] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(70, "instruction_set,29,0");
                if (var2 != null) {
                  MouseInputHandler.field_g[29][0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(65, "instruction_set,30,0");
                if (null != var2) {
                  MouseInputHandler.field_g[30][0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(124, "instruction_set,31,0");
                if (var2 != null) {
                  MouseInputHandler.field_g[31][0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 118, "instruction_set,32,0");
                if (var2 != null) {
                  MouseInputHandler.field_g[32][0] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(52, "instruction_set,32,1");
                if (var2 != null) {
                  MouseInputHandler.field_g[32][1] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 84, "instruction_set,33,0");
                if (var2 != null) {
                  MouseInputHandler.field_g[33][0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(82, "instruction_set,34,0");
                if (var2 != null) {
                  MouseInputHandler.field_g[34][0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(94, "instruction_set,35,0");
                if (var2 != null) {
                  MouseInputHandler.field_g[35][0] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(119, "instruction_set,35,1");
                if (null != var2) {
                  MouseInputHandler.field_g[35][1] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 114, "instruction_set,36,0");
                if (null != var2) {
                  MouseInputHandler.field_g[36][0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(126, "instruction_set,36,1");
                if (null != var2) {
                  MouseInputHandler.field_g[36][1] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(105, "instruction_set,37,0");
                if (null != var2) {
                  MouseInputHandler.field_g[37][0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 88, "instruction_set,37,1");
                if (var2 != null) {
                  MouseInputHandler.field_g[37][1] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 63, "instruction_set,38,0");
                if (var2 != null) {
                  MouseInputHandler.field_g[38][0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(113, "instruction_set,38,1");
                if (var2 != null) {
                  MouseInputHandler.field_g[38][1] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 51, "instruction_set,39,0");
                if (var2 != null) {
                  MouseInputHandler.field_g[39][0] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(109, "instruction_set,40,0");
                if (var2 != null) {
                  MouseInputHandler.field_g[40][0] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(73, "instruction_set,41,0");
                if (var2 != null) {
                  MouseInputHandler.field_g[41][0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(99, "instruction_set,42,0");
                if (null != var2) {
                  MouseInputHandler.field_g[42][0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(112, "instruction_set,43,0");
                if (var2 != null) {
                  MouseInputHandler.field_g[43][0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(97, "instruction_set,44,0");
                if (var2 != null) {
                  MouseInputHandler.field_g[44][0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(105, "instruction_set,45,0");
                if (var2 != null) {
                  MouseInputHandler.field_g[45][0] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 98, "instruction_set,46,0");
                if (var2 != null) {
                  MouseInputHandler.field_g[46][0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 110, "instruction_set,47,0");
                if (var2 != null) {
                  MouseInputHandler.field_g[47][0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(71, "instruction_set,48,0");
                if (var2 != null) {
                  MouseInputHandler.field_g[48][0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 69, "instruction_set,49,0");
                if (null != var2) {
                  MouseInputHandler.field_g[49][0] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(75, "instruction_set,50,0");
                if (null != var2) {
                  MouseInputHandler.field_g[50][0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(56, "instruction_set,51,0");
                if (null != var2) {
                  MouseInputHandler.field_g[51][0] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(60, "instruction_set,52,0");
                if (var2 != null) {
                  MouseInputHandler.field_g[52][0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 59, "instruction_set,53,0");
                if (var2 != null) {
                  MouseInputHandler.field_g[53][0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 77, "instruction_set,54,0");
                if (null != var2) {
                  MouseInputHandler.field_g[54][0] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(99, "instruction_set,54,1");
                if (null != var2) {
                  MouseInputHandler.field_g[54][1] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(62, "instruction_set,55,0");
                if (var2 != null) {
                  MouseInputHandler.field_g[55][0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(65, "instruction_set,56,0");
                if (null != var2) {
                  MouseInputHandler.field_g[56][0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(60, "instruction_set,57,0");
                if (null != var2) {
                  MouseInputHandler.field_g[57][0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 57, "instruction_set,58,0");
                if (null != var2) {
                  MouseInputHandler.field_g[58][0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(91, "instruction_set,59,0");
                if (var2 != null) {
                  MouseInputHandler.field_g[59][0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 71, "instruction_set,60,0");
                if (null != var2) {
                  MouseInputHandler.field_g[60][0] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(51, "instruction_set,61,0");
                if (var2 != null) {
                  MouseInputHandler.field_g[61][0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(65, "instruction_set,62,0");
                if (var2 != null) {
                  MouseInputHandler.field_g[62][0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 109, "instruction_set,63,0");
                if (var2 != null) {
                  MouseInputHandler.field_g[63][0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(89, "instruction_set,64,0");
                if (null != var2) {
                  MouseInputHandler.field_g[64][0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(112, "instruction_set,65,0");
                if (null != var2) {
                  MouseInputHandler.field_g[65][0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(124, "instruction_set,66,0");
                if (null != var2) {
                  MouseInputHandler.field_g[66][0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 107, "instruction_set,67,0");
                if (null != var2) {
                  MouseInputHandler.field_g[67][0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(76, "instruction_set,68,0");
                if (null != var2) {
                  MouseInputHandler.field_g[68][0] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(81, "instruction_set,69,0");
                if (var2 != null) {
                  MouseInputHandler.field_g[69][0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 92, "instruction_set,70,0");
                if (null != var2) {
                  MouseInputHandler.field_g[70][0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(64, "instruction_set,71,0");
                if (null != var2) {
                  MouseInputHandler.field_g[71][0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(74, "instruction_set,72,0");
                if (null != var2) {
                  MouseInputHandler.field_g[72][0] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 67, "instruction_set,73,0");
                if (var2 != null) {
                  MouseInputHandler.field_g[73][0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(97, "instruction_set,73,1");
                if (null != var2) {
                  MouseInputHandler.field_g[73][1] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(60, "instruction_set,73,2");
                if (null != var2) {
                  MouseInputHandler.field_g[73][2] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(73, "instruction_set,73,3");
                if (null != var2) {
                  MouseInputHandler.field_g[73][3] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 115, "instruction_set,74,0");
                if (var2 != null) {
                  MouseInputHandler.field_g[74][0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 51, "instruction_set,74,1");
                if (null != var2) {
                  MouseInputHandler.field_g[74][1] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(107, "instruction_set,74,2");
                if (var2 != null) {
                  MouseInputHandler.field_g[74][2] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(57, "instruction_set,74,3");
                if (null != var2) {
                  MouseInputHandler.field_g[74][3] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(120, "instruction_set,75,0");
                if (null != var2) {
                  MouseInputHandler.field_g[75][0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(91, "instruction_set,75,1");
                if (var2 != null) {
                  MouseInputHandler.field_g[75][1] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 101, "instruction_set,75,2");
                if (null != var2) {
                  MouseInputHandler.field_g[75][2] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(115, "instruction_set,75,3");
                if (var2 != null) {
                  MouseInputHandler.field_g[75][3] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(77, "instruction_set,76,0");
                if (var2 != null) {
                  MouseInputHandler.field_g[76][0] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(55, "instruction_set,76,1");
                if (var2 != null) {
                  MouseInputHandler.field_g[76][1] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(62, "instruction_set,76,2");
                if (null != var2) {
                  MouseInputHandler.field_g[76][2] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(104, "instruction_set,76,3");
                if (null != var2) {
                  MouseInputHandler.field_g[76][3] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(57, "instruction_set,77,0");
                if (null != var2) {
                  MouseInputHandler.field_g[77][0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(59, "instruction_set,77,1");
                if (null != var2) {
                  MouseInputHandler.field_g[77][1] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 93, "instruction_set,77,2");
                if (var2 != null) {
                  MouseInputHandler.field_g[77][2] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(80, "instruction_set,77,3");
                if (null != var2) {
                  MouseInputHandler.field_g[77][3] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(122, "instruction_set,78,0");
                if (null != var2) {
                  MouseInputHandler.field_g[78][0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(92, "instruction_set,78,1");
                if (var2 != null) {
                  MouseInputHandler.field_g[78][1] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(71, "instruction_set,78,2");
                if (var2 != null) {
                  MouseInputHandler.field_g[78][2] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(74, "instruction_set,78,3");
                if (var2 != null) {
                  MouseInputHandler.field_g[78][3] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(106, "instruction_set,79,0");
                if (var2 != null) {
                  MouseInputHandler.field_g[79][0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(95, "instruction_set,79,1");
                if (var2 != null) {
                  MouseInputHandler.field_g[79][1] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(74, "instruction_set,79,2");
                if (var2 != null) {
                  MouseInputHandler.field_g[79][2] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(52, "instruction_set,79,3");
                if (var2 != null) {
                  MouseInputHandler.field_g[79][3] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(127, "instruction_set,80,0");
                if (var2 != null) {
                  MouseInputHandler.field_g[80][0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(108, "instruction_set,80,1");
                if (null != var2) {
                  MouseInputHandler.field_g[80][1] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(59, "instruction_set,80,2");
                if (var2 != null) {
                  MouseInputHandler.field_g[80][2] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(74, "instruction_set,80,3");
                if (var2 != null) {
                  MouseInputHandler.field_g[80][3] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 101, "instruction_set,81,0");
                if (null != var2) {
                  MouseInputHandler.field_g[81][0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(73, "instruction_set,81,1");
                if (var2 != null) {
                  MouseInputHandler.field_g[81][1] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 84, "instruction_set,81,2");
                if (var2 != null) {
                  MouseInputHandler.field_g[81][2] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(97, "instruction_set,81,3");
                if (null != var2) {
                  MouseInputHandler.field_g[81][3] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(96, "instruction_set,82,0");
                if (null != var2) {
                  MouseInputHandler.field_g[82][0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(70, "instruction_set,82,1");
                if (var2 != null) {
                  MouseInputHandler.field_g[82][1] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(54, "instruction_set,83,0");
                if (null != var2) {
                  MouseInputHandler.field_g[83][0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(87, "instruction_set,84,0");
                if (var2 != null) {
                  MouseInputHandler.field_g[84][0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(84, "instruction_set,85,0");
                if (null != var2) {
                  MouseInputHandler.field_g[85][0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(116, "instruction_set,86,0");
                if (null != var2) {
                  MouseInputHandler.field_g[86][0] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 86, "instruction_set,87,0");
                if (null != var2) {
                  MouseInputHandler.field_g[87][0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(53, "instruction_set,88,0");
                if (var2 != null) {
                  MouseInputHandler.field_g[88][0] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(83, "instruction_set,88,1");
                if (var2 != null) {
                  MouseInputHandler.field_g[88][1] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(64, "instruction_set,88,2");
                if (var2 != null) {
                  MouseInputHandler.field_g[88][2] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(113, "instruction_set,88,3");
                if (var2 != null) {
                  MouseInputHandler.field_g[88][3] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(82, "instruction_set,89,0");
                if (var2 != null) {
                  MouseInputHandler.field_g[89][0] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(96, "instruction_set,89,1");
                if (null != var2) {
                  MouseInputHandler.field_g[89][1] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 120, "instruction_set,89,2");
                if (var2 != null) {
                  MouseInputHandler.field_g[89][2] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(94, "instruction_set,89,3");
                if (var2 != null) {
                  MouseInputHandler.field_g[89][3] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(99, "instruction_set,90,0");
                if (null != var2) {
                  MouseInputHandler.field_g[90][0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(90, "instruction_set,90,1");
                if (var2 != null) {
                  MouseInputHandler.field_g[90][1] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(66, "instruction_set,90,2");
                if (var2 != null) {
                  MouseInputHandler.field_g[90][2] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(110, "instruction_set,90,3");
                if (null != var2) {
                  MouseInputHandler.field_g[90][3] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 69, "instruction_set,91,0");
                if (null != var2) {
                  MouseInputHandler.field_g[91][0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(94, "instruction_set,91,1");
                if (var2 != null) {
                  MouseInputHandler.field_g[91][1] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(113, "instruction_set,91,2");
                if (null != var2) {
                  MouseInputHandler.field_g[91][2] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
            }
            void runChunk3() throws java.lang.RuntimeException {
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 110, "instruction_set,91,3");
                if (var2 != null) {
                  MouseInputHandler.field_g[91][3] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(52, "instruction_set,92,0");
                if (null != var2) {
                  MouseInputHandler.field_g[92][0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(80, "instruction_set,92,1");
                if (null != var2) {
                  MouseInputHandler.field_g[92][1] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(108, "instruction_set,92,2");
                if (var2 != null) {
                  MouseInputHandler.field_g[92][2] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(100, "instruction_set,92,3");
                if (var2 != null) {
                  MouseInputHandler.field_g[92][3] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(117, "instruction_set,93,0");
                if (var2 != null) {
                  MouseInputHandler.field_g[93][0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(121, "instruction_set,93,1");
                if (null != var2) {
                  MouseInputHandler.field_g[93][1] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(108, "instr_rmbcancelon");
                if (var2 != null) {
                  ValidatedTextWidget.field_yb = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(122, "instr_rmbcanceloff");
                if (var2 != null) {
                  GameKeyHandler.field_a = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(56, "rightclicktxt");
                if (var2 != null) {
                  IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 117, "CONFIRM_ENGINEER_MSG");
                if (var2 != null) {
                  AlternateUsernameCredentials.field_y = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(76, "CONFIG_UNLOCKED_MSG");
                if (null != var2) {
                  CombatWorld.field_k = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(61, "CONFIG_UNLOCKED_LOGIN_MSG");
                if (var2 != null) {
                  ReportAbuseDialog.field_ac = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(78, "ADVISED_TO_COMPLETE_TRAINING_MSG");
                if (var2 != null) {
                  NumberParsingHelpers.field_i = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(76, "ADVISED_TO_TRAIN_MSG");
                if (null != var2) {
                  GameApplet.field_b = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(111, "ADVISED_TO_FINISH_TRAINING_MSG");
                if (null != var2) {
                  ReflectionCheckHelpers.field_l = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(124, "RECOMMEND_LOGIN_MSG");
                if (null != var2) {
                  IconLabelControl.field_Tb = IntKeyLookup.decodeWindowsCodePageString(param0 ^ 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 66, "DISCARD_PROGRESS_MSG");
                if (null != var2) {
                  CombatWorld.field_I = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 53, "TRAINING_COMPLETE_LOGIN_MSG");
                if (var2 != null) {
                  DualNodeDeque.field_b = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 98, "ITEMS_UNLOCKED_1_MSG");
                if (null != var2) {
                  ChatMessage.field_c = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(122, "ITEMS_UNLOCKED_2_MSG");
                if (null != var2) {
                  MusicPatchPcmStream.field_s = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(98, "CAMPAIGN_NAMES,0");
                if (null != var2) {
                  LobbyPlayer.field_ic[0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(88, "CAMPAIGN_NAMES,1");
                if (var2 != null) {
                  LobbyPlayer.field_ic[1] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(57, "CAMPAIGN_NAMES,2");
                if (var2 != null) {
                  LobbyPlayer.field_ic[2] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(67, "tutorialpaused");
                if (var2 != null) {
                  LoginHandshakeHelpers.field_d = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(85, "mission_titles,0");
                if (var2 != null) {
                  MarkerSlider.field_cb[0] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(93, "mission_titles,1");
                if (null != var2) {
                  MarkerSlider.field_cb[1] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(100, "mission_titles,2");
                if (var2 != null) {
                  MarkerSlider.field_cb[2] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(102, "mission_titles,3");
                if (null != var2) {
                  MarkerSlider.field_cb[3] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 127, "mission_titles,4");
                if (null != var2) {
                  MarkerSlider.field_cb[4] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(72, "mission_titles,5");
                if (null != var2) {
                  MarkerSlider.field_cb[5] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(70, "mission_titles,6");
                if (var2 != null) {
                  MarkerSlider.field_cb[6] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(117, "mission_titles,7");
                if (null != var2) {
                  MarkerSlider.field_cb[7] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 72, "mission_titles,8");
                if (null != var2) {
                  MarkerSlider.field_cb[8] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(119, "mission_titles,9");
                if (var2 != null) {
                  MarkerSlider.field_cb[9] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 76, "mission_titles,10");
                if (null != var2) {
                  MarkerSlider.field_cb[10] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 78, "mission_titles,11");
                if (var2 != null) {
                  MarkerSlider.field_cb[11] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(106, "mission_titles,12");
                if (null != var2) {
                  MarkerSlider.field_cb[12] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(78, "mission_titles,13");
                if (null != var2) {
                  MarkerSlider.field_cb[13] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(85, "mission_titles,14");
                if (var2 != null) {
                  MarkerSlider.field_cb[14] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(118, "mission_titles,15");
                if (var2 != null) {
                  MarkerSlider.field_cb[15] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(54, "mission_titles,16");
                if (null != var2) {
                  MarkerSlider.field_cb[16] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(58, "mission_titles,17");
                if (var2 != null) {
                  MarkerSlider.field_cb[17] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 108, "mission_titles,18");
                if (var2 != null) {
                  MarkerSlider.field_cb[18] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 76, "mission_titles,19");
                if (var2 != null) {
                  MarkerSlider.field_cb[19] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(98, "mission_titles,20");
                if (var2 != null) {
                  MarkerSlider.field_cb[20] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(99, "mission_titles,21");
                if (null != var2) {
                  MarkerSlider.field_cb[21] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 127, "mission_titles,22");
                if (null != var2) {
                  MarkerSlider.field_cb[22] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(126, "mission_titles,23");
                if (var2 != null) {
                  MarkerSlider.field_cb[23] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 106, "mission_titles,24");
                if (var2 != null) {
                  MarkerSlider.field_cb[24] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(120, "mission_titles,25");
                if (var2 != null) {
                  MarkerSlider.field_cb[25] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(104, "mission_titles,26");
                if (var2 != null) {
                  MarkerSlider.field_cb[26] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(62, "mission_titles,27");
                if (var2 != null) {
                  MarkerSlider.field_cb[27] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(104, "mission_titles,28");
                if (null != var2) {
                  MarkerSlider.field_cb[28] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(81, "mission_titles,29");
                if (var2 != null) {
                  MarkerSlider.field_cb[29] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 95, "tutorialpagenames,0,0");
                if (null != var2) {
                  UiContainer.field_N[0][0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(106, "tutorialpagenames,0,1");
                if (null != var2) {
                  UiContainer.field_N[0][1] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(51, "tutorialpagenames,0,2");
                if (null != var2) {
                  UiContainer.field_N[0][2] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(102, "tutorialpagenames,0,3");
                if (null != var2) {
                  UiContainer.field_N[0][3] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 96, "tutorialpagenames,0,4");
                if (var2 != null) {
                  UiContainer.field_N[0][4] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(102, "tutorialpagenames,0,5");
                if (var2 != null) {
                  UiContainer.field_N[0][5] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(59, "tutorialpagenames,0,6");
                if (null != var2) {
                  UiContainer.field_N[0][6] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 86, "tutorialpagenames,0,7");
                if (var2 != null) {
                  UiContainer.field_N[0][7] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 122, "tutorialpagenames,0,8");
                if (var2 != null) {
                  UiContainer.field_N[0][8] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(90, "tutorialpagenames,0,9");
                if (null != var2) {
                  UiContainer.field_N[0][9] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(52, "tutorialpagenames,0,10");
                if (var2 != null) {
                  UiContainer.field_N[0][10] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(127, "tutorialpagenames,0,11");
                if (null != var2) {
                  UiContainer.field_N[0][11] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(98, "tutorialpagenames,1,0");
                if (null != var2) {
                  UiContainer.field_N[1][0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(68, "tutorialpagenames,1,1");
                if (var2 != null) {
                  UiContainer.field_N[1][1] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(90, "tutorialpagenames,1,2");
                if (var2 != null) {
                  UiContainer.field_N[1][2] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(117, "tutorialpagenames,1,3");
                if (null != var2) {
                  UiContainer.field_N[1][3] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 102, "tutorialpagenames,1,4");
                if (var2 != null) {
                  UiContainer.field_N[1][4] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(103, "tutorialpagenames,1,5");
                if (null != var2) {
                  UiContainer.field_N[1][5] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 71, "tutorialpagenames,1,6");
                if (var2 != null) {
                  UiContainer.field_N[1][6] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(60, "tutorialpagenames,1,7");
                if (null != var2) {
                  UiContainer.field_N[1][7] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(120, "tutorialpagenames,1,8");
                if (null != var2) {
                  UiContainer.field_N[1][8] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(115, "tutorialpagenames,1,9");
                if (null != var2) {
                  UiContainer.field_N[1][9] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(64, "tutorialpagenames,1,10");
                if (var2 != null) {
                  UiContainer.field_N[1][10] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(79, "tutorialpagenames,1,11");
                if (null != var2) {
                  UiContainer.field_N[1][11] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(71, "tutorialpagenames,1,12");
                if (null != var2) {
                  UiContainer.field_N[1][12] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(61, "tutorialpagenames,1,13");
                if (null != var2) {
                  UiContainer.field_N[1][13] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 90, "tutorialpagenames,1,14");
                if (null != var2) {
                  UiContainer.field_N[1][14] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 126, "tutorialpagenames,3,0");
                if (null != var2) {
                  UiContainer.field_N[3][0] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(113, "tutorialpagenames,3,1");
                if (var2 != null) {
                  UiContainer.field_N[3][1] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 88, "tutorialpagenames,3,2");
                if (var2 != null) {
                  UiContainer.field_N[3][2] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(55, "tutorialpagenames,3,3");
                if (null != var2) {
                  UiContainer.field_N[3][3] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(126, "tutorialpagenames,3,4");
                if (null != var2) {
                  UiContainer.field_N[3][4] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 91, "tutorialpagenames,3,5");
                if (var2 != null) {
                  UiContainer.field_N[3][5] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 111, "tutorialpagenames,3,6");
                if (null != var2) {
                  UiContainer.field_N[3][6] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 52, "tutorialpagenames,5,0");
                if (var2 != null) {
                  UiContainer.field_N[5][0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(107, "tutorialpagenames,5,1");
                if (null != var2) {
                  UiContainer.field_N[5][1] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 110, "tutorialpagenames,5,2");
                if (null != var2) {
                  UiContainer.field_N[5][2] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 55, "tutorialpagenames,5,3");
                if (null != var2) {
                  UiContainer.field_N[5][3] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(92, "tutorialpagenames,5,4");
                if (var2 != null) {
                  UiContainer.field_N[5][4] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(100, "tutorialpagenames,7,0");
                if (var2 != null) {
                  UiContainer.field_N[7][0] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(78, "tutorialpagenames,7,1");
                if (null != var2) {
                  UiContainer.field_N[7][1] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(120, "tutorialpagenames,7,2");
                if (null != var2) {
                  UiContainer.field_N[7][2] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 126, "tutorialpagenames,7,3");
                if (var2 != null) {
                  UiContainer.field_N[7][3] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(118, "tutorialpagenames,7,4");
                if (null != var2) {
                  UiContainer.field_N[7][4] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 53, "tutorialpagenames,7,5");
                if (var2 != null) {
                  UiContainer.field_N[7][5] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(66, "tutorialpagenames,7,6");
                if (var2 != null) {
                  UiContainer.field_N[7][6] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 80, "tutorialpagenames,9,0");
                if (var2 != null) {
                  UiContainer.field_N[9][0] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(90, "tutorialpagenames,9,1");
                if (var2 != null) {
                  UiContainer.field_N[9][1] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(91, "tutorialpagenames,9,2");
                if (null != var2) {
                  UiContainer.field_N[9][2] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 78, "tutorialpagenames,9,3");
                if (var2 != null) {
                  UiContainer.field_N[9][3] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 118, "tutorialpagenames,9,4");
                if (var2 != null) {
                  UiContainer.field_N[9][4] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(103, "tutorialpagenames,9,5");
                if (null != var2) {
                  UiContainer.field_N[9][5] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(83, "tutorial_alt_controls,0,2");
                if (var2 != null) {
                  NumberParsingHelpers.field_g[0][2] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(110, "tutorial_alt_controls,0,3");
                if (null != var2) {
                  NumberParsingHelpers.field_g[0][3] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 76, "tutorial_alt_controls,0,4");
                if (null != var2) {
                  NumberParsingHelpers.field_g[0][4] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(68, "tutorial_alt_controls,0,5");
                if (null != var2) {
                  NumberParsingHelpers.field_g[0][5] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 127, "tutorial_alt_controls,0,6");
                if (var2 != null) {
                  NumberParsingHelpers.field_g[0][6] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 71, "tutorial_alt_controls,0,7");
                if (var2 != null) {
                  NumberParsingHelpers.field_g[0][7] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 117, "tutorial_alt_controls,0,8");
                if (var2 != null) {
                  NumberParsingHelpers.field_g[0][8] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(97, "tutorial_alt_controls,0,9");
                if (null != var2) {
                  NumberParsingHelpers.field_g[0][9] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(71, "tutorial_alt_controls,0,10");
                if (null != var2) {
                  NumberParsingHelpers.field_g[0][10] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 89, "tutorial_alt_controls,0,12");
                if (var2 != null) {
                  NumberParsingHelpers.field_g[0][12] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(124, "tutorial_alt_controls,0,13");
                if (var2 != null) {
                  NumberParsingHelpers.field_g[0][13] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 70, "tutorial_alt_controls,0,14");
                if (var2 != null) {
                  NumberParsingHelpers.field_g[0][14] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(80, "tutorial_alt_controls,0,15");
                if (null != var2) {
                  NumberParsingHelpers.field_g[0][15] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(78, "tutorial_alt_controls,0,20");
                if (var2 != null) {
                  NumberParsingHelpers.field_g[0][20] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(107, "tutorial_alt_controls,1,10");
                if (var2 != null) {
                  NumberParsingHelpers.field_g[1][10] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(77, "tutorial_alt_controls,1,11");
                if (null != var2) {
                  NumberParsingHelpers.field_g[1][11] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(110, "tutorial_alt_controls,1,12");
                if (null != var2) {
                  NumberParsingHelpers.field_g[1][12] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(86, "tutorial_alt_controls,1,13");
                if (null != var2) {
                  NumberParsingHelpers.field_g[1][13] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 100, "tutorial_alt_controls,3,2");
                if (null != var2) {
                  NumberParsingHelpers.field_g[3][2] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(123, "tutorial_alt_controls,3,3");
                if (null != var2) {
                  NumberParsingHelpers.field_g[3][3] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(54, "tutorial_alt_controls,3,4");
                if (var2 != null) {
                  NumberParsingHelpers.field_g[3][4] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 75, "tutorial_alt_controls,3,5");
                if (null != var2) {
                  NumberParsingHelpers.field_g[3][5] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(79, "tutorial_b,0,0");
                if (var2 != null) {
                  UiContainer.field_H[0][0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(54, "tutorial_b,0,1");
                if (null != var2) {
                  UiContainer.field_H[0][1] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(113, "tutorial_b,0,2");
                if (var2 != null) {
                  UiContainer.field_H[0][2] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 121, "tutorial_b,0,3");
                if (var2 != null) {
                  UiContainer.field_H[0][3] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(87, "tutorial_b,0,4");
                if (var2 != null) {
                  UiContainer.field_H[0][4] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(73, "tutorial_b,0,5");
                if (var2 != null) {
                  UiContainer.field_H[0][5] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(107, "tutorial_b,0,6");
                if (null != var2) {
                  UiContainer.field_H[0][6] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(87, "tutorial_b,0,7");
                if (null != var2) {
                  UiContainer.field_H[0][7] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 86, "tutorial_b,0,8");
                if (var2 != null) {
                  UiContainer.field_H[0][8] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 106, "tutorial_b,0,9");
                if (var2 != null) {
                  UiContainer.field_H[0][9] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(89, "tutorial_b,0,10");
                if (var2 != null) {
                  UiContainer.field_H[0][10] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 118, "tutorial_b,0,11");
                if (null != var2) {
                  UiContainer.field_H[0][11] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(85, "tutorial_b,0,12");
                if (null != var2) {
                  UiContainer.field_H[0][12] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(87, "tutorial_b,0,13");
                if (null != var2) {
                  UiContainer.field_H[0][13] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(74, "tutorial_b,0,14");
                if (var2 != null) {
                  UiContainer.field_H[0][14] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 120, "tutorial_b,0,15");
                if (null != var2) {
                  UiContainer.field_H[0][15] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(65, "tutorial_b,0,16");
                if (var2 != null) {
                  UiContainer.field_H[0][16] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(64, "tutorial_b,0,17");
                if (null != var2) {
                  UiContainer.field_H[0][17] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 107, "tutorial_b,0,18");
                if (null != var2) {
                  UiContainer.field_H[0][18] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(126, "tutorial_b,0,19");
                if (var2 != null) {
                  UiContainer.field_H[0][19] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 98, "tutorial_b,0,20");
                if (var2 != null) {
                  UiContainer.field_H[0][20] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(60, "tutorial_b,0,21");
                if (var2 != null) {
                  UiContainer.field_H[0][21] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(123, "tutorial_b,0,22");
                if (var2 != null) {
                  UiContainer.field_H[0][22] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(95, "tutorial_b,0,23");
                if (null != var2) {
                  UiContainer.field_H[0][23] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(69, "tutorial_b,1,0");
                if (null != var2) {
                  UiContainer.field_H[1][0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(86, "tutorial_b,1,1");
                if (null != var2) {
                  UiContainer.field_H[1][1] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(82, "tutorial_b,1,2");
                if (null != var2) {
                  UiContainer.field_H[1][2] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 75, "tutorial_b,1,3");
                if (var2 != null) {
                  UiContainer.field_H[1][3] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 106, "tutorial_b,1,4");
                if (null != var2) {
                  UiContainer.field_H[1][4] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(121, "tutorial_b,1,5");
                if (null != var2) {
                  UiContainer.field_H[1][5] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(108, "tutorial_b,1,6");
                if (null != var2) {
                  UiContainer.field_H[1][6] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(51, "tutorial_b,1,7");
                if (var2 != null) {
                  UiContainer.field_H[1][7] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(78, "tutorial_b,1,8");
                if (null != var2) {
                  UiContainer.field_H[1][8] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(62, "tutorial_b,1,9");
                if (null != var2) {
                  UiContainer.field_H[1][9] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(113, "tutorial_b,1,10");
                if (var2 != null) {
                  UiContainer.field_H[1][10] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(64, "tutorial_b,1,11");
                if (null != var2) {
                  UiContainer.field_H[1][11] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 55, "tutorial_b,1,12");
                if (null != var2) {
                  UiContainer.field_H[1][12] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(67, "tutorial_b,1,13");
                if (var2 != null) {
                  UiContainer.field_H[1][13] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(93, "tutorial_b,1,14");
                if (var2 != null) {
                  UiContainer.field_H[1][14] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(101, "tutorial_b,1,15");
                if (var2 != null) {
                  UiContainer.field_H[1][15] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 89, "tutorial_b,1,16");
                if (var2 != null) {
                  UiContainer.field_H[1][16] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(112, "tutorial_b,1,17");
                if (var2 != null) {
                  UiContainer.field_H[1][17] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(69, "tutorial_b,1,18");
                if (null != var2) {
                  UiContainer.field_H[1][18] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(94, "tutorial_b,1,19");
                if (null != var2) {
                  UiContainer.field_H[1][19] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(67, "tutorial_b,1,20");
                if (null != var2) {
                  UiContainer.field_H[1][20] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(67, "tutorial_b,1,21");
                if (var2 != null) {
                  UiContainer.field_H[1][21] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(87, "tutorial_b,1,22");
                if (null != var2) {
                  UiContainer.field_H[1][22] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(69, "tutorial_b,1,23");
                if (null != var2) {
                  UiContainer.field_H[1][23] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(118, "tutorial_b,1,24");
                if (null != var2) {
                  UiContainer.field_H[1][24] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(109, "tutorial_b,1,25");
                if (var2 != null) {
                  UiContainer.field_H[1][25] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 80, "tutorial_b,1,26");
                if (null != var2) {
                  UiContainer.field_H[1][26] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(113, "tutorial_b,1,27");
                if (var2 != null) {
                  UiContainer.field_H[1][27] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 99, "tutorial_b,1,28");
                if (var2 != null) {
                  UiContainer.field_H[1][28] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 119, "tutorial_b,1,29");
                if (null != var2) {
                  UiContainer.field_H[1][29] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(89, "tutorial_b,3,0");
                if (null != var2) {
                  UiContainer.field_H[3][0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(59, "tutorial_b,3,1");
                if (null != var2) {
                  UiContainer.field_H[3][1] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(52, "tutorial_b,3,2");
                if (null != var2) {
                  UiContainer.field_H[3][2] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(101, "tutorial_b,3,3");
                if (var2 != null) {
                  UiContainer.field_H[3][3] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(115, "tutorial_b,3,4");
                if (var2 != null) {
                  UiContainer.field_H[3][4] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(122, "tutorial_b,3,5");
                if (var2 != null) {
                  UiContainer.field_H[3][5] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(77, "tutorial_b,3,6");
                if (null != var2) {
                  UiContainer.field_H[3][6] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(127, "tutorial_b,3,7");
                if (null != var2) {
                  UiContainer.field_H[3][7] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 96, "tutorial_b,3,8");
                if (var2 != null) {
                  UiContainer.field_H[3][8] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(118, "tutorial_b,3,9");
                if (var2 != null) {
                  UiContainer.field_H[3][9] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(71, "tutorial_b,3,10");
                if (var2 != null) {
                  UiContainer.field_H[3][10] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(108, "tutorial_b,3,11");
                if (var2 != null) {
                  UiContainer.field_H[3][11] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(70, "tutorial_b,3,12");
                if (null != var2) {
                  UiContainer.field_H[3][12] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(109, "tutorial_b,3,13");
                if (null != var2) {
                  UiContainer.field_H[3][13] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(117, "tutorial_b,5,0");
                if (var2 != null) {
                  UiContainer.field_H[5][0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(124, "tutorial_b,5,1");
                if (null != var2) {
                  UiContainer.field_H[5][1] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(59, "tutorial_b,5,2");
                if (var2 != null) {
                  UiContainer.field_H[5][2] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(101, "tutorial_b,5,3");
                if (null != var2) {
                  UiContainer.field_H[5][3] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(90, "tutorial_b,5,4");
                if (null != var2) {
                  UiContainer.field_H[5][4] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(79, "tutorial_b,5,5");
                if (null != var2) {
                  UiContainer.field_H[5][5] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 63, "tutorial_b,5,6");
                if (null != var2) {
                  UiContainer.field_H[5][6] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(116, "tutorial_b,5,7");
                if (null != var2) {
                  UiContainer.field_H[5][7] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(122, "tutorial_b,7,0");
                if (var2 != null) {
                  UiContainer.field_H[7][0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(52, "tutorial_b,7,1");
                if (null != var2) {
                  UiContainer.field_H[7][1] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(95, "tutorial_b,7,2");
                if (null != var2) {
                  UiContainer.field_H[7][2] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 61, "tutorial_b,7,3");
                if (null != var2) {
                  UiContainer.field_H[7][3] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 85, "tutorial_b,7,4");
                if (var2 != null) {
                  UiContainer.field_H[7][4] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(82, "tutorial_b,7,5");
                if (var2 != null) {
                  UiContainer.field_H[7][5] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(125, "tutorial_b,7,6");
                if (null != var2) {
                  UiContainer.field_H[7][6] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 101, "tutorial_b,7,7");
                if (null != var2) {
                  UiContainer.field_H[7][7] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 103, "tutorial_b,7,8");
                if (var2 != null) {
                  UiContainer.field_H[7][8] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(94, "tutorial_b,7,9");
                if (var2 != null) {
                  UiContainer.field_H[7][9] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(73, "tutorial_b,7,10");
                if (var2 != null) {
                  UiContainer.field_H[7][10] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(58, "tutorial_b,7,11");
            }
            void runChunk4() throws java.lang.RuntimeException {
                if (var2 != null) {
                  UiContainer.field_H[7][11] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 100, "tutorial_b,7,12");
                if (null != var2) {
                  UiContainer.field_H[7][12] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(85, "tutorial_b,7,13");
                if (null != var2) {
                  UiContainer.field_H[7][13] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(56, "tutorial_b,9,0");
                if (var2 != null) {
                  UiContainer.field_H[9][0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(59, "tutorial_b,9,1");
                if (var2 != null) {
                  UiContainer.field_H[9][1] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(93, "tutorial_b,9,2");
                if (var2 != null) {
                  UiContainer.field_H[9][2] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(74, "tutorial_b,9,3");
                if (var2 != null) {
                  UiContainer.field_H[9][3] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(106, "tutorial_b,9,4");
                if (null != var2) {
                  UiContainer.field_H[9][4] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(78, "tutorial_b,9,5");
                if (null != var2) {
                  UiContainer.field_H[9][5] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(62, "tutorial_b,9,6");
                if (var2 != null) {
                  UiContainer.field_H[9][6] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(90, "tutorial_b,9,7");
                if (null != var2) {
                  UiContainer.field_H[9][7] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(99, "tutorial_b,9,8");
                if (null != var2) {
                  UiContainer.field_H[9][8] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 99, "tutorial_b,9,9");
                if (null != var2) {
                  UiContainer.field_H[9][9] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(122, "tutorial_b,9,10");
                if (var2 != null) {
                  UiContainer.field_H[9][10] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(56, "tutorial_b,9,11");
                if (null != var2) {
                  UiContainer.field_H[9][11] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(107, "tutorial_b,9,12");
                if (null != var2) {
                  UiContainer.field_H[9][12] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(55, "tutorial_b,9,13");
                if (null != var2) {
                  UiContainer.field_H[9][13] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(63, "tutorial_control_tips,0");
                if (null != var2) {
                  IterableDualNodeDeque.field_g[0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(81, "tutorial_control_tips,1");
                if (null != var2) {
                  IterableDualNodeDeque.field_g[1] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(64, "CONFIG_TUTORIAL,0");
                if (var2 != null) {
                  PendingIntReplyRequest.field_u[0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(92, "CONFIG_TUTORIAL,1");
                if (var2 != null) {
                  PendingIntReplyRequest.field_u[1] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(92, "CONFIG_TUTORIAL,2");
                if (null != var2) {
                  PendingIntReplyRequest.field_u[2] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 51, "CONFIG_TUTORIAL,3");
                if (null != var2) {
                  PendingIntReplyRequest.field_u[3] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 54, "CONFIG_TUTORIAL,4");
                if (var2 != null) {
                  PendingIntReplyRequest.field_u[4] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(108, "CONFIG_TUTORIAL,5");
                if (var2 != null) {
                  PendingIntReplyRequest.field_u[5] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(102, "CONFIG_TUTORIAL,6");
                if (var2 != null) {
                  PendingIntReplyRequest.field_u[6] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(87, "CONFIG_TUTORIAL,7");
                if (var2 != null) {
                  PendingIntReplyRequest.field_u[7] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(83, "CONFIG_TUTORIAL,8");
                if (var2 != null) {
                  PendingIntReplyRequest.field_u[8] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 58, "CONFIG_TUTORIAL,9");
                if (null != var2) {
                  PendingIntReplyRequest.field_u[9] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(95, "CONFIG_TUTORIAL,10");
                if (var2 != null) {
                  PendingIntReplyRequest.field_u[10] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(51, "CONFIG_TUTORIAL,11");
                if (var2 != null) {
                  PendingIntReplyRequest.field_u[11] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 105, "CONFIG_TUTORIAL,12");
                if (null != var2) {
                  PendingIntReplyRequest.field_u[12] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 53, "CONFIG_TUTORIAL,13");
                if (var2 != null) {
                  PendingIntReplyRequest.field_u[13] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(88, "CONFIG_TUTORIAL,14");
                if (var2 != null) {
                  PendingIntReplyRequest.field_u[14] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 108, "CONFIG_TUTORIAL,15");
                if (null != var2) {
                  PendingIntReplyRequest.field_u[15] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(126, "CONFIG_TUTORIAL,16");
                if (null != var2) {
                  PendingIntReplyRequest.field_u[16] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(68, "engitxt");
                if (var2 != null) {
                  IterableNodeHashTable.field_g = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 76, "contxt");
                if (var2 != null) {
                  LabeledField.field_cb = IntKeyLookup.decodeWindowsCodePageString(param0 ^ 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(121, "trainingtxt");
                if (null != var2) {
                  MarkerSliderPainter.field_p = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(109, "campaigntxt");
                if (var2 != null) {
                  BoundedUrlRequest.field_f = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 84, "detailtxt");
                if (var2 != null) {
                  DirectByteStorage.field_i = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(83, "lowdetailtxt");
                if (null != var2) {
                  RegistrationRequestDialog.field_Vb = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(107, "cameracontrolstxt");
                if (var2 != null) {
                  ChatHistoryAllocator.field_e = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 81, "camerafollowontxt");
                if (null != var2) {
                  FrameStyleHelpers.field_b = IntKeyLookup.decodeWindowsCodePageString(param0 ^ 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(114, "camerafollowofftxt");
                if (var2 != null) {
                  QuickChatParameterType.field_h = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 60, "rmbcancelslockontxt");
                if (var2 != null) {
                  SentinelAnimationEditor.field_u = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(105, "rmbcancelslockofftxt");
                if (null != var2) {
                  RasterBuffer.field_d = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(109, "controlrmbscrolls");
                if (null != var2) {
                  DisplayNameAndAudioHelpers.field_c = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 121, "controlwasdscrolls");
                if (var2 != null) {
                  ClientException.field_j = IntKeyLookup.decodeWindowsCodePageString(param0 ^ 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(108, "cameraxinverton");
                if (null != var2) {
                  SessionUiHelpers.field_f = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(114, "cameraxinvertoff");
                if (var2 != null) {
                  PasswordRuleHelpers.field_i = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(57, "camerayinverton");
                if (var2 != null) {
                  SocialStateHelpers.field_a = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(104, "camerayinvertoff");
                if (var2 != null) {
                  LoadingStatusHelpers.field_b = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(57, "tut1txt");
                if (null != var2) {
                  NodeIterator.field_j = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(52, "tut2txt");
                if (var2 != null) {
                  SessionSeedHelpers.field_e = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(93, "tut3txt");
                if (var2 != null) {
                  QuickChatMenu.field_Tb = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(93, "tut4txt");
                if (null != var2) {
                  LoginForm.field_P = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(123, "testfieldtxt");
                if (var2 != null) {
                  ChatMessage.field_u = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 76, "freeforalltxt");
                if (var2 != null) {
                  DateOfBirthValidator.field_k = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 65, "teambattletxt");
                if (var2 != null) {
                  GradientOutlineTextPainter.field_t = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 126, "warmodetxt");
                if (var2 != null) {
                  MouseWheelInput.field_b = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(120, "coopgametxt");
                if (null != var2) {
                  LoginMethod.field_b = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(96, "expansiontxt");
                if (null != var2) {
                  Sprite.field_e = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(87, "settingstxt");
                if (var2 != null) {
                  AccountNoticeDialog.field_pb = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 105, "gamemodebriefings,0");
                if (var2 != null) {
                  TransitionTimerHelpers.field_e[0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(98, "gamemodebriefings,1");
                if (var2 != null) {
                  TransitionTimerHelpers.field_e[1] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 96, "gamemodebriefings,2");
                if (var2 != null) {
                  TransitionTimerHelpers.field_e[2] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(94, "gamemodebriefings,3");
                if (var2 != null) {
                  TransitionTimerHelpers.field_e[3] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(52, "mapbriefings,0");
                if (var2 != null) {
                  Bzip2State.field_o[0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 118, "mapbriefings,1");
                if (var2 != null) {
                  Bzip2State.field_o[1] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 79, "mapbriefings,2");
                if (null != var2) {
                  Bzip2State.field_o[2] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 54, "mapbriefings,3");
                if (var2 != null) {
                  Bzip2State.field_o[3] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(55, "mapbriefings,4");
                if (null != var2) {
                  Bzip2State.field_o[4] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(86, "gameovertxt");
                if (null != var2) {
                  CipherPacketBuffer.field_x = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(78, "trainingcompletetxt");
                if (var2 != null) {
                  NameSuggestionsPanel.field_T = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(120, "missioncompletetxt");
                if (null != var2) {
                  RegistrationRequestDialog.field_Wb = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 76, "missionendedwithoutwinningtxt");
                if (null != var2) {
                  LoginDialog.field_Eb = IntKeyLookup.decodeWindowsCodePageString(param0 ^ 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(89, "restartmissiontxt");
                if (null != var2) {
                  ProxySocketConnector.field_o = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(84, "skipmissiontxt");
                if (var2 != null) {
                  SocketJs5Transport.field_z = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(110, "returntocampaigntxt");
                if (var2 != null) {
                  LoginDialog.field_Db = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(106, "furtherprogressrequireslogintxt");
                if (var2 != null) {
                  QuickChatMenu.field_Zb = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(64, "or_txt");
                if (null != var2) {
                  RegistrationRequestDialog.field_Pb = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(115, "resignedtxt");
                if (var2 != null) {
                  NodeIterator.field_e = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 90, "missiontimetxt");
                if (null != var2) {
                  SpriteFrame.field_a = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(121, "wavetxt");
                if (var2 != null) {
                  EditableTextWidget.field_W = IntKeyLookup.decodeWindowsCodePageString(param0 ^ 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(113, "discardprogresstxt");
                if (null != var2) {
                  PendingAckRequest.field_B = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(92, "tagsnotrecordedtxt");
                if (null != var2) {
                  TextButton.field_O = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 110, "unlockedcomptxt");
                if (null != var2) {
                  MarkerSliderPainter.field_l = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(86, "unlockedmodtxt");
                if (null != var2) {
                  StatefulTextPainter.field_o = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 91, "solariteearnedtxt");
                if (null != var2) {
                  LoginMethod.field_g = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 78, "solaritetotaltxt");
                if (null != var2) {
                  ChatLineMenuHelpers.field_d = IntKeyLookup.decodeWindowsCodePageString(param0 ^ 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(72, "maxsolaritetxt");
                if (var2 != null) {
                  SessionUiHelpers.field_g = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 94, "jumpcolon");
                if (null != var2) {
                  NodeHashTableIterator.field_f = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(101, "firecolon");
                if (var2 != null) {
                  Sentinel.field_I = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(62, "_or_");
                if (null != var2) {
                  IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(121, "startmissiontext");
                if (var2 != null) {
                  QuickChatMenu.field_nc = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(84, "helptext");
                if (var2 != null) {
                  TriangleMesh.field_R = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 59, "weaponleftkey");
                if (null != var2) {
                  GeneratedSpriteHelpers.field_e = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(125, "weaponrightkey");
                if (var2 != null) {
                  PendingPackedReply.field_w = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(82, "fireeddkey");
                if (var2 != null) {
                  IntrusiveNode.field_n = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(124, "fireempbombkey");
                if (null != var2) {
                  TableColumns.field_d = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(58, "fireedddesc");
                if (null != var2) {
                  LinkButtonPainter.field_o = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 54, "fireempbombdesc");
                if (var2 != null) {
                  TutorialStep.field_v = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(82, "targetlockdesc");
                if (var2 != null) {
                  PopupMenuSupport.field_d = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(53, "droptargetlock");
                if (var2 != null) {
                  IconLabelControl.field_Zb = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 105, "targetlockkey");
                if (null != var2) {
                  BoundedRandomAccessFile.field_a = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 52, "closecombatdesc");
                if (var2 != null) {
                  BoundedUrlRequest.field_l = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(86, "closecombatkey");
                if (null != var2) {
                  EditableTextWidget.field_eb = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(73, "wkey");
                if (var2 != null) {
                  TextSpriteHelpers.field_f = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(122, "asdkeys");
                if (null != var2) {
                  NotificationMessage.field_r = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 101, "haltkey");
                if (var2 != null) {
                  BoundedRandomAccessFile.field_o = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 84, "moveleftkey");
                if (null != var2) {
                  QuickChatParameterType.field_i = IntKeyLookup.decodeWindowsCodePageString(param0 ^ 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 60, "moverightkey");
                if (var2 != null) {
                  EmailValidationHelpers.field_a = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(105, "alternativeleftkey");
                if (var2 != null) {
                  LoginResultHelpers.field_g = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 113, "alternativerightkey");
                if (var2 != null) {
                  ValidationIndicator.field_X = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(66, "alternativejumpkey");
                if (null != var2) {
                  PendingIntReplyRequest.field_t = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 96, "alternativehaltkey");
                if (var2 != null) {
                  DialWidgetPainter.field_p = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 104, "spacekey");
                if (var2 != null) {
                  SoundAndUrlHelpers.field_c = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 60, "shiftkey");
                if (var2 != null) {
                  LoadoutCostHelpers.field_e = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(126, "centrecamerakey");
                if (var2 != null) {
                  BirthDateEntryPanel.field_V = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 62, "keycode_scrollup");
                if (null != var2) {
                  QuickChatParameterType.field_d = var2[0] & 255;
                }
                var2 = SentinelDesigner.readTextResourceBytes(65, "keycode_scrollleft");
                if (var2 != null) {
                  LoadingStatusHelpers.field_c = var2[0] & 255;
                }
                var2 = SentinelDesigner.readTextResourceBytes(56, "keycode_scrolldown");
                if (var2 != null) {
                  AccountChoicePanel.field_V = 255 & var2[0];
                }
                var2 = SentinelDesigner.readTextResourceBytes(80, "keycode_scrollright");
                if (null != var2) {
                  EmailCredentials.field_h = 255 & var2[0];
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 119, "keycode_moveleft");
                if (var2 != null) {
                  EditableTextWidget.field_hb = var2[0] & 255;
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 61, "keycode_moveright");
                if (null != var2) {
                  BufferedRandomAccessFile.field_b = 255 & var2[0];
                }
                var2 = SentinelDesigner.readTextResourceBytes(88, "keycode_halt");
                if (null != var2) {
                  ArchiveRequest.field_y = var2[0] & 255;
                }
                var2 = SentinelDesigner.readTextResourceBytes(96, "keycode_prevweapon");
                if (var2 != null) {
                  NameValidationHelpers.field_d = var2[0] & 255;
                }
                var2 = SentinelDesigner.readTextResourceBytes(70, "keycode_nextweapon");
                if (var2 != null) {
                  KeyRoutingHelpers.field_c = 255 & var2[0];
                }
                var2 = SentinelDesigner.readTextResourceBytes(124, "keycode_firemelee");
                if (var2 != null) {
                  ChatMessage.field_b = 255 & var2[0];
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 112, "keycode_empbomb");
                if (null != var2) {
                  ValidationHelpWidget.field_nb = 255 & var2[0];
                }
                var2 = SentinelDesigner.readTextResourceBytes(116, "keycode_edd");
                if (null != var2) {
                  dg.field_d = var2[0] & 255;
                }
                var2 = SentinelDesigner.readTextResourceBytes(100, "keycode_centrecamera");
                if (null != var2) {
                  DialWidgetPainter.field_b = 255 & var2[0];
                }
                var2 = SentinelDesigner.readTextResourceBytes(83, "spawndronestxt");
                if (null != var2) {
                  SteelSentinels.field_I = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(80, "cleardronestxt");
                if (null != var2) {
                  ArchiveLoadStep.field_f = IntKeyLookup.decodeWindowsCodePageString(param0 ^ 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(81, "backtoconfigtxt");
                if (var2 != null) {
                  DateInputWidget.field_S = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(127, "closepreambletxt");
                if (var2 != null) {
                  IconLookupHelpers.field_c = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(100, "teamscoretxt");
                if (null != var2) {
                  TextAndMenuHelpers.field_f = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 69, "empstatus");
                if (null != var2) {
                  ProxySocketConnector.field_i = IntKeyLookup.decodeWindowsCodePageString(param0 ^ 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(73, "noenergystatus");
                if (var2 != null) {
                  LobbyGame.field_pc = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(122, "n_sec");
                if (var2 != null) {
                  SocketJs5Transport.field_E = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(70, "componentnames,0");
                if (null != var2) {
                  NameTable.field_e[0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 126, "componentnames,1");
                if (var2 != null) {
                  NameTable.field_e[1] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 82, "componentnames,2");
                if (null != var2) {
                  NameTable.field_e[2] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(91, "componentnames,3");
                if (var2 != null) {
                  NameTable.field_e[3] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 90, "componentnames,17");
                if (null != var2) {
                  NameTable.field_e[17] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(85, "componentnames,18");
                if (var2 != null) {
                  NameTable.field_e[18] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(54, "componentnames,19");
                if (var2 != null) {
                  NameTable.field_e[19] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(69, "componentnames,20");
                if (null != var2) {
                  NameTable.field_e[20] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(126, "componentnames,21");
                if (null != var2) {
                  NameTable.field_e[21] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 106, "componentnames,22");
                if (var2 != null) {
                  NameTable.field_e[22] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(90, "componentnames,23");
                if (null != var2) {
                  NameTable.field_e[23] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 88, "componentnames,24");
                if (var2 != null) {
                  NameTable.field_e[24] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(55, "componentnames,25");
                if (var2 != null) {
                  NameTable.field_e[25] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(125, "componentnames,26");
                if (null != var2) {
                  NameTable.field_e[26] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(81, "componentnames,27");
                if (var2 != null) {
                  NameTable.field_e[27] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(53, "componentnames,28");
                if (var2 != null) {
                  NameTable.field_e[28] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(70, "componentnames,29");
                if (var2 != null) {
                  NameTable.field_e[29] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(108, "componentnames,30");
                if (null != var2) {
                  NameTable.field_e[30] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 105, "componentnames,31");
                if (var2 != null) {
                  NameTable.field_e[31] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 72, "componentnames,32");
                if (var2 != null) {
                  NameTable.field_e[32] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(90, "componentnames,33");
                if (var2 != null) {
                  NameTable.field_e[33] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(52, "componentnames,34");
                if (var2 != null) {
                  NameTable.field_e[34] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 93, "componentnames,35");
                if (null != var2) {
                  NameTable.field_e[35] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 58, "componentnames,36");
                if (var2 != null) {
                  NameTable.field_e[36] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(103, "componentnames,37");
                if (var2 != null) {
                  NameTable.field_e[37] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(52, "componentnames,38");
                if (null != var2) {
                  NameTable.field_e[38] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 120, "componentnames,42");
                if (null != var2) {
                  NameTable.field_e[42] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(71, "componentnames,43");
                if (var2 != null) {
                  NameTable.field_e[43] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 122, "componentnames,44");
                if (var2 != null) {
                  NameTable.field_e[44] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(102, "componentnames,45");
                if (null != var2) {
                  NameTable.field_e[45] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 61, "componentnames,46");
                if (null != var2) {
                  NameTable.field_e[46] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(52, "componentnames,47");
                if (var2 != null) {
                  NameTable.field_e[47] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(90, "componentnames,48");
                if (null != var2) {
                  NameTable.field_e[48] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(127, "componentnames,49");
                if (var2 != null) {
                  NameTable.field_e[49] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(120, "componentnames,50");
                if (null != var2) {
                  NameTable.field_e[50] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(64, "componentnames,51");
                if (var2 != null) {
                  NameTable.field_e[51] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(120, "componentnames,52");
                if (null != var2) {
                  NameTable.field_e[52] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 100, "componentnames,53");
                if (null != var2) {
                  NameTable.field_e[53] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(89, "componentnames,54");
                if (null != var2) {
                  NameTable.field_e[54] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(119, "componentnames,55");
                if (null != var2) {
                  NameTable.field_e[55] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(118, "componentnames,56");
                if (var2 != null) {
                  NameTable.field_e[56] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(107, "componentnames,57");
                if (null != var2) {
                  NameTable.field_e[57] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(110, "componentnames,58");
                if (null != var2) {
                  NameTable.field_e[58] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(120, "componentnames,59");
                if (var2 != null) {
                  NameTable.field_e[59] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(87, "componentnames,60");
                if (null != var2) {
                  NameTable.field_e[60] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(72, "componentnames,61");
                if (null != var2) {
                  NameTable.field_e[61] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(91, "componentnames,62");
                if (var2 != null) {
                  NameTable.field_e[62] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(90, "componentnames,64");
                if (null != var2) {
                  NameTable.field_e[64] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 86, "componentnames,65");
                if (null != var2) {
                  NameTable.field_e[65] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 55, "componentnames,66");
                if (null != var2) {
                  NameTable.field_e[66] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(57, "componentnames,67");
                if (null != var2) {
                  NameTable.field_e[67] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 52, "componentnames,68");
                if (null != var2) {
                  NameTable.field_e[68] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 118, "componentnames,69");
                if (var2 != null) {
                  NameTable.field_e[69] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 115, "componentnames,70");
                if (var2 != null) {
                  NameTable.field_e[70] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 112, "componentnames,71");
                if (var2 != null) {
                  NameTable.field_e[71] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(63, "componentnames,72");
                if (null != var2) {
                  NameTable.field_e[72] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(118, "componentnames,73");
                if (null != var2) {
                  NameTable.field_e[73] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(121, "componentnames,74");
                if (null != var2) {
                  NameTable.field_e[74] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(62, "componentnames,75");
                if (null != var2) {
                  NameTable.field_e[75] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(89, "componentnames,76");
                if (null != var2) {
                  NameTable.field_e[76] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 57, "componentnames,77");
                if (var2 != null) {
                  NameTable.field_e[77] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(81, "componentnames,78");
                if (null != var2) {
                  NameTable.field_e[78] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(117, "componentnames,79");
                if (var2 != null) {
                  NameTable.field_e[79] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 96, "componentnames,80");
                if (var2 != null) {
                  NameTable.field_e[80] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(102, "componentnames,81");
                if (null != var2) {
                  NameTable.field_e[81] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 84, "componentnames,82");
                if (null != var2) {
                  NameTable.field_e[82] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 106, "componentnames,83");
                if (var2 != null) {
                  NameTable.field_e[83] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(67, "componentnames,84");
                if (null != var2) {
                  NameTable.field_e[84] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(91, "componentnames,85");
                if (null != var2) {
                  NameTable.field_e[85] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(102, "componentnames,86");
                if (null != var2) {
                  NameTable.field_e[86] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(85, "componentnames,87");
                if (var2 != null) {
                  NameTable.field_e[87] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(120, "componentnames,88");
                if (null != var2) {
                  NameTable.field_e[88] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 79, "componentnames,89");
                if (var2 != null) {
                  NameTable.field_e[89] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(58, "componentnames,90");
                if (var2 != null) {
                  NameTable.field_e[90] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(118, "componentnames,91");
                if (null != var2) {
                  NameTable.field_e[91] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(85, "componentnames,92");
                if (null != var2) {
                  NameTable.field_e[92] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 105, "componentnames,93");
                if (var2 != null) {
                  NameTable.field_e[93] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(72, "componentnames,95");
                if (var2 != null) {
                  NameTable.field_e[95] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(98, "slotnames,0");
                if (var2 != null) {
                  TextAndMenuHelpers.field_h[0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 83, "slotnames,1");
                if (var2 != null) {
                  TextAndMenuHelpers.field_h[1] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 61, "slotnames,2");
                if (var2 != null) {
                  TextAndMenuHelpers.field_h[2] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 97, "slotnames,3");
                if (null != var2) {
                  TextAndMenuHelpers.field_h[3] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(79, "slotnames,4");
                if (var2 != null) {
                  TextAndMenuHelpers.field_h[4] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 62, "slotnames,5");
                if (null != var2) {
                  TextAndMenuHelpers.field_h[5] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(99, "healthtxt");
                if (var2 != null) {
                  HighscoreSubmissionFactory.field_d = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(101, "energytxt");
                if (var2 != null) {
                  ProxyAuthenticationException.field_e = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(64, "suddendeathtxt");
                if (null != var2) {
                  Bzip2State.field_A = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(73, "suddendeathcountdowntxt");
                if (null != var2) {
                  RewardValueHelpers.field_f = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(72, "calamitycountdowntxt");
            }
            void runChunk5() throws java.lang.RuntimeException {
                if (var2 != null) {
                  LobbyGame.field_jc = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(59, "previousmessagetip");
                if (null != var2) {
                  IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(94, "replaymessagetip");
                if (null != var2) {
                  IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(54, "stopmessagetip");
                if (var2 != null) {
                  IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(120, "nextmessagetip");
                if (null != var2) {
                  IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(53, "tutorialnext_tip");
                if (var2 != null) {
                  IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(121, "missiontxt");
                if (null != var2) {
                  TableColumns.field_f = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 64, "missionprogresstxt");
                if (null != var2) {
                  FallingPickup.field_J = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 103, "missioncurtime");
                if (null != var2) {
                  TextLayoutLine.field_g = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(103, "missionrespawns");
                if (null != var2) {
                  BoundedRandomAccessFile.field_k = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 57, "missioncampaigntime");
                if (null != var2) {
                  SoundCache.field_k = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(92, "coop_wave");
                if (var2 != null) {
                  ClientErrorSupport.field_f = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(98, "coop_respawns");
                if (var2 != null) {
                  LoadingCaptionHelpers.field_e = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 65, "campaigntimetxt");
                if (var2 != null) {
                  MidiPcmStream.field_E = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(54, "unlimitedtxt");
                if (null != var2) {
                  NodeDeque.field_b = IntKeyLookup.decodeWindowsCodePageString(param0 ^ 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(88, "TEAM_NAMES,0");
                if (var2 != null) {
                  ClockAndCookieHelpers.field_d[0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(108, "TEAM_NAMES,1");
                if (null != var2) {
                  ClockAndCookieHelpers.field_d[1] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(57, "TEAM_NAMES,2");
                if (null != var2) {
                  ClockAndCookieHelpers.field_d[2] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(71, "SENTINEL_NAMES,0");
                if (var2 != null) {
                  QuickChatPacketHelpers.field_c[0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(87, "SENTINEL_NAMES,1");
                if (null != var2) {
                  QuickChatPacketHelpers.field_c[1] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 109, "SENTINEL_NAMES,2");
                if (null != var2) {
                  QuickChatPacketHelpers.field_c[2] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(58, "SENTINEL_NAMES,3");
                if (var2 != null) {
                  QuickChatPacketHelpers.field_c[3] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(92, "SENTINEL_NAMES,4");
                if (var2 != null) {
                  QuickChatPacketHelpers.field_c[4] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(65, "SENTINEL_NAMES,5");
                if (null != var2) {
                  QuickChatPacketHelpers.field_c[5] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 69, "SENTINEL_NAMES,6");
                if (var2 != null) {
                  QuickChatPacketHelpers.field_c[6] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(65, "SENTINEL_NAMES,7");
                if (var2 != null) {
                  QuickChatPacketHelpers.field_c[7] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 67, "SENTINEL_NAMES,8");
                if (null != var2) {
                  QuickChatPacketHelpers.field_c[8] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 83, "SENTINEL_NAMES,9");
                if (var2 != null) {
                  QuickChatPacketHelpers.field_c[9] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 86, "SENTINEL_NAMES,10");
                if (null != var2) {
                  QuickChatPacketHelpers.field_c[10] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(74, "SENTINEL_NAMES,11");
                if (var2 != null) {
                  QuickChatPacketHelpers.field_c[11] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 117, "GAMEBEST_TIP,0");
                if (var2 != null) {
                  MusicPatchEnvelope.field_l[0] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(84, "GAMEBEST_TIP,1");
                if (var2 != null) {
                  MusicPatchEnvelope.field_l[1] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(121, "GAMEBEST_TIP,2");
                if (var2 != null) {
                  MusicPatchEnvelope.field_l[2] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(111, "GAMEBEST_TIP,3");
                if (null != var2) {
                  MusicPatchEnvelope.field_l[3] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 103, "GAMEBEST_TIP,4");
                if (null != var2) {
                  MusicPatchEnvelope.field_l[4] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(101, "GAMEBEST_TIP,5");
                if (var2 != null) {
                  MusicPatchEnvelope.field_l[5] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(113, "GAMEBEST_TIP,6");
                if (null != var2) {
                  MusicPatchEnvelope.field_l[6] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 73, "GAMEBEST_TIP,8");
                if (null != var2) {
                  MusicPatchEnvelope.field_l[8] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 99, "GAMEBEST_TIP,9");
                if (var2 != null) {
                  MusicPatchEnvelope.field_l[9] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(102, "GAMEBEST_TIP,10");
                if (var2 != null) {
                  MusicPatchEnvelope.field_l[10] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(63, "GAMEBEST_TIP,11");
                if (var2 != null) {
                  MusicPatchEnvelope.field_l[11] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(63, "GAMEBEST_TIP,12");
                if (null != var2) {
                  MusicPatchEnvelope.field_l[12] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(71, "GAMEBEST_TIP,14");
                if (var2 != null) {
                  MusicPatchEnvelope.field_l[14] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 92, "GAMEBEST_TIP,15");
                if (param0 != 0) {
                  field_d = (RgbSprite) null;
                }
                if (null != var2) {
                  MusicPatchEnvelope.field_l[15] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(98, "GAMEBEST_TIP,16");
                if (var2 != null) {
                  MusicPatchEnvelope.field_l[16] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(82, "GAMEBEST_TIP,18");
                if (null != var2) {
                  MusicPatchEnvelope.field_l[18] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(75, "GAMEBEST_TIP,19");
                if (var2 != null) {
                  MusicPatchEnvelope.field_l[19] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(67, "GAMEBEST_TIP,20");
                if (null != var2) {
                  MusicPatchEnvelope.field_l[20] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(119, "GAMEBEST_TIP,21");
                if (null != var2) {
                  MusicPatchEnvelope.field_l[21] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(89, "GAMEBEST_TIP,22");
                if (var2 != null) {
                  MusicPatchEnvelope.field_l[22] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(81, "GAMEBEST_TIP,23");
                if (var2 != null) {
                  MusicPatchEnvelope.field_l[23] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 116, "GAMEBEST_TIP,24");
                if (null != var2) {
                  MusicPatchEnvelope.field_l[24] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 87, "GAMEBEST_TIP,25");
                if (var2 != null) {
                  MusicPatchEnvelope.field_l[25] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(59, "GAMEBEST_TIP,26");
                if (null != var2) {
                  MusicPatchEnvelope.field_l[26] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(90, "GAMEBEST_TIP,27");
                if (var2 != null) {
                  MusicPatchEnvelope.field_l[27] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(70, "GAMEBEST_TIP,28");
                if (null != var2) {
                  MusicPatchEnvelope.field_l[28] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(104, "GAMEBEST_TIP,29");
                if (null != var2) {
                  MusicPatchEnvelope.field_l[29] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(84, "GAMEBEST_TIP,30");
                if (var2 != null) {
                  MusicPatchEnvelope.field_l[30] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(109, "GAMEBEST_TIP,31");
                if (var2 != null) {
                  MusicPatchEnvelope.field_l[31] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(54, "GAMEBEST_TIP,32");
                if (null != var2) {
                  MusicPatchEnvelope.field_l[32] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(105, "GAMEBEST_TIP,33");
                if (null != var2) {
                  MusicPatchEnvelope.field_l[33] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(64, "GAMEBEST_TIP,34");
                if (null != var2) {
                  MusicPatchEnvelope.field_l[34] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 107, "GAMEBEST_TIP,35");
                if (null != var2) {
                  MusicPatchEnvelope.field_l[35] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(61, "GAMEBEST_TIP,36");
                if (null != var2) {
                  MusicPatchEnvelope.field_l[36] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(64, "GAMEBEST_TIP,37");
                if (var2 != null) {
                  MusicPatchEnvelope.field_l[37] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(95, "GAMEBEST_TIP,38");
                if (null != var2) {
                  MusicPatchEnvelope.field_l[38] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(114, "GAMEBEST_TIP,39");
                if (null != var2) {
                  MusicPatchEnvelope.field_l[39] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(113, "GAMEBEST_TIP,40");
                if (var2 != null) {
                  MusicPatchEnvelope.field_l[40] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 104, "GAMEBEST_TIP,42");
                if (null != var2) {
                  MusicPatchEnvelope.field_l[42] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 120, "GAMEBEST_TIP,43");
                if (var2 != null) {
                  MusicPatchEnvelope.field_l[43] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(79, "GAMEBEST_TIP,44");
                if (var2 != null) {
                  MusicPatchEnvelope.field_l[44] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 112, "GAMEBEST_TIP,46");
                if (var2 != null) {
                  MusicPatchEnvelope.field_l[46] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(107, "GAMEBEST_TIP,47");
                if (null != var2) {
                  MusicPatchEnvelope.field_l[47] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(120, "GAMEBEST_TIP,48");
                if (null != var2) {
                  MusicPatchEnvelope.field_l[48] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(97, "GAMEBEST_TIP,49");
                if (null != var2) {
                  MusicPatchEnvelope.field_l[49] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(76, "GAMEBEST_TIP,50");
                if (var2 != null) {
                  MusicPatchEnvelope.field_l[50] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(74, "GAMEBEST_TIP,51");
                if (var2 != null) {
                  MusicPatchEnvelope.field_l[51] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(123, "GAMEBEST_TIP,52");
                if (var2 != null) {
                  MusicPatchEnvelope.field_l[52] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(70, "GAMEBEST_TIP,54");
                if (null != var2) {
                  MusicPatchEnvelope.field_l[54] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(88, "GAMEBEST_TIP,55");
                if (null != var2) {
                  MusicPatchEnvelope.field_l[55] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(91, "GAMEBEST_TIP,56");
                if (null != var2) {
                  MusicPatchEnvelope.field_l[56] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(71, "GAMEBEST_TIP,57");
                if (null != var2) {
                  MusicPatchEnvelope.field_l[57] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(60, "GAMEBEST_TIP,58");
                if (null != var2) {
                  MusicPatchEnvelope.field_l[58] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(72, "GAMEBEST_TIP,59");
                if (var2 != null) {
                  MusicPatchEnvelope.field_l[59] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(62, "GAMEBEST_TIP,60");
                if (null != var2) {
                  MusicPatchEnvelope.field_l[60] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 113, "GAMEBEST_TIP,61");
                if (var2 != null) {
                  MusicPatchEnvelope.field_l[61] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 67, "GAMEBEST_TIP,62");
                if (null != var2) {
                  MusicPatchEnvelope.field_l[62] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 91, "GAMEBEST_TIP,63");
                if (var2 != null) {
                  MusicPatchEnvelope.field_l[63] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 55, "second_tx");
                if (null != var2) {
                  IntrusiveNode.field_d = IntKeyLookup.decodeWindowsCodePageString(param0 ^ 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(58, "seconds_tx");
                if (var2 != null) {
                  HighscoreSubmission.field_s = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 87, "numberoftimes_tx,0");
                if (null != var2) {
                  UiContainer.field_I[0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(127, "numberoftimes_tx,1");
                if (var2 != null) {
                  UiContainer.field_I[1] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(123, "numberoftimes_tx,2");
                if (var2 != null) {
                  UiContainer.field_I[2] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 114, "numberoftimes_tx,3");
                if (var2 != null) {
                  UiContainer.field_I[3] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(93, "ALREADY_ENG_MOD_TXT");
                if (null != var2) {
                  LoginDialogHelpers.field_i = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 104, "CANNOT_ENG_MOD_TXT");
                if (null != var2) {
                  DateInputWidget.field_R = IntKeyLookup.decodeWindowsCodePageString(param0 ^ 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(112, "FIRST_ENG_THIS_TXT");
                if (var2 != null) {
                  MessageMenuHelpers.field_e = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(52, "FIRST_ENG_SHIELDS_TXT");
                if (null != var2) {
                  DialWidgetPainter.field_i = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(99, "FIRST_ENG_PLASMA_TXT");
                if (var2 != null) {
                  AccountRequestDialog.field_Eb = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(85, "FIRST_ENG_LASERS_TXT");
                if (null != var2) {
                  SpriteLoadingHelpers.field_c = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(114, "FIRST_ENG_EMP_TXT");
                if (var2 != null) {
                  DualNode.field_t = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(119, "CANT_AFFORD_MOD_TXT");
                if (var2 != null) {
                  BattleTerrain.field_g = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 114, "ALREADY_ENG_COMP_TXT");
                if (null != var2) {
                  LoginCredentialHelpers.field_e = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 114, "CANT_AFFORD_COMP_TXT");
                if (var2 != null) {
                  MusicPatchEnvelope.field_a = IntKeyLookup.decodeWindowsCodePageString(param0 ^ 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(118, "CHASSISLIST_BLURB");
                if (var2 != null) {
                  DelayedServerPacket.field_u = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(67, "COMPLIST_BLURB");
                if (var2 != null) {
                  PasswordFieldPainter.field_E = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(90, "WEAPONLIST_BLURB");
                if (null != var2) {
                  NumericDateInputWidget.field_hb = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(115, "MODLIST_BLURB");
                if (null != var2) {
                  WeightedCacheEntry.field_D = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 108, "CUSTOM_ADVANCED_ONLY_TXT");
                if (null != var2) {
                  NotificationMessage.field_v = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(84, "UNLOCKED_DESTROYED_CHASSIS_MSG");
                if (var2 != null) {
                  MarkerSliderPainter.field_o = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 70, "PROGRESS_UNLOCKED_CHASSIS_MSG");
                if (null != var2) {
                  PendingByteArrayRequest.field_r = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(53, "GETDEFAULTSET_TXT");
                if (null != var2) {
                  ReportAbuseDialog.field_Vb = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(114, "DEFAULTSET_TXT");
                if (var2 != null) {
                  DiskCacheWorker.field_a = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(64, "HEADSLOT_TXT");
                if (var2 != null) {
                  LobbyStateHelpers.field_e = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(66, "ARMSLOT_TXT");
                if (var2 != null) {
                  HighscoreSubmission.field_r = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(92, "WINGSLOT_TXT");
                if (null != var2) {
                  ImageProducerRasterBuffer.field_o = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(96, "NOSLOT_TXT");
                if (var2 != null) {
                  LoadingCaptionHelpers.field_d = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 86, "EMPTYSLOT_TXT");
                if (null != var2) {
                  ValidatedTextWidget.field_nb = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(66, "deleteafavouritetxt");
                if (var2 != null) {
                  DualNodeDequeIterator.field_i = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(99, "savefavouritetxt");
                if (null != var2) {
                  AccountNoticeDialog.field_jb = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(122, "defaultmarker");
                if (var2 != null) {
                  NodeHashTable.field_h = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 127, "favouriteslottxt");
                if (null != var2) {
                  IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(113, "favouritestxt");
                if (null != var2) {
                  ResourceArchive.field_p = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(59, "engineeredtxt");
                if (var2 != null) {
                  SentinelAnimationEditor.field_c = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(95, "notengineeredtxt");
                if (null != var2) {
                  RasterBuffer.field_h = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 120, "complist_txt");
                if (null != var2) {
                  LoadingCaptionHelpers.field_b = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 126, "gunlist_txt");
                if (var2 != null) {
                  HighscoreTable.field_B = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(67, "modlist_txt");
                if (null != var2) {
                  RequestResendHelpers.field_c = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(124, "techstandardtxt");
                if (null != var2) {
                  MusicPatchPcmStream.field_C = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(61, "techadvancedtxt");
                if (null != var2) {
                  CachedArchiveProvider.field_z = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 95, "techvaluecolon");
                if (var2 != null) {
                  LoginDialog.field_zb = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 96, "heightstring");
                if (null != var2) {
                  LoginMethod.field_e = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 95, "solaritecubescolon");
                if (var2 != null) {
                  Explosion.field_E = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 51, "percentengineered");
                if (var2 != null) {
                  ClockAndCookieHelpers.field_c = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(111, "sentineluses");
                if (null != var2) {
                  DisplayNameAndAudioHelpers.field_e = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(54, "anduses");
                if (null != var2) {
                  NumericDateInputWidget.field_X = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(82, "usescomponents");
                if (var2 != null) {
                  DebouncedValidator.field_c = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(94, "usesmodules");
                if (var2 != null) {
                  DualNodeHashTable.field_i = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(60, "usesmodule");
                if (var2 != null) {
                  SessionSeedHelpers.field_g = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(127, "cubesneeded");
                if (var2 != null) {
                  ClockAndCookieHelpers.field_f = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(73, "holdsonetimes");
                if (var2 != null) {
                  DualNodeDequeIterator.field_h = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(78, "slotsntimesx");
                if (null != var2) {
                  FrameStyleHelpers.field_a = IntKeyLookup.decodeWindowsCodePageString(param0 ^ 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(115, "alsontimesx");
                if (var2 != null) {
                  IterableNodeHashTable.field_a = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(86, "shiftclickmsg");
                if (null != var2) {
                  dg.field_c = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 121, "engineeringstatedesc,0");
                if (null != var2) {
                  MouseWheelInput.field_d[0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 73, "engineeringstatedesc,1");
                if (null != var2) {
                  MouseWheelInput.field_d[1] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 121, "engineeringstatedesc,2");
                if (null != var2) {
                  MouseWheelInput.field_d[2] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(51, "engineeringstatedesc,3");
                if (null != var2) {
                  MouseWheelInput.field_d[3] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(79, "firingarctxt");
                if (null != var2) {
                  MatchingTextValidator.field_s = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(102, "warningcolon");
                if (null != var2) {
                  MusicTrackHelpers.field_e = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(57, "oddmechwarnings,0");
                if (null != var2) {
                  SentinelDesigner.field_b[0] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 125, "oddmechwarnings,1");
                if (null != var2) {
                  SentinelDesigner.field_b[1] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 116, "oddmechwarnings,2");
                if (var2 != null) {
                  SentinelDesigner.field_b[2] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 58, "oddmechwarnings,3");
                if (null != var2) {
                  SentinelDesigner.field_b[3] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 59, "oddmechwarnings,4");
                if (null != var2) {
                  SentinelDesigner.field_b[4] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(81, "oddmechwarnings,5");
                if (null != var2) {
                  SentinelDesigner.field_b[5] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(109, "oddmechwarnings,6");
                if (null != var2) {
                  SentinelDesigner.field_b[6] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(109, "oddmechwarnings,7");
                if (null != var2) {
                  SentinelDesigner.field_b[7] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(109, "oddmechwarnings,8");
                if (var2 != null) {
                  SentinelDesigner.field_b[8] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(63, "oddmechwarnings,9");
                if (var2 != null) {
                  SentinelDesigner.field_b[9] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(89, "oddmechwarnings,10");
                if (var2 != null) {
                  SentinelDesigner.field_b[10] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 75, "oddmechwarnings,11");
                if (var2 != null) {
                  SentinelDesigner.field_b[11] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(93, "coopcomplete");
                if (null != var2) {
                  SessionExitHelpers.field_a = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 82, "coopboss");
                if (null != var2) {
                  PendingPackedReply.field_x = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(78, "score_headings,0");
                if (var2 != null) {
                  AccountRequestDialog.field_Ib[0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(52, "score_headings,1");
                if (var2 != null) {
                  AccountRequestDialog.field_Ib[1] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(69, "score_headings,2");
                if (null != var2) {
                  AccountRequestDialog.field_Ib[2] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(59, "score_headings,3");
                if (var2 != null) {
                  AccountRequestDialog.field_Ib[3] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(99, "ratings_headings,0");
                if (null != var2) {
                  TriangleMesh.field_h[0] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(71, "ratings_headings,1");
                if (null != var2) {
                  TriangleMesh.field_h[1] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(99, "ratings_headings,2");
                if (var2 != null) {
                  TriangleMesh.field_h[2] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(64, "ratings_headings,3");
                if (var2 != null) {
                  TriangleMesh.field_h[3] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 80, "ratings_headings,4");
                if (null != var2) {
                  TriangleMesh.field_h[4] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(123, "ratings_headings,5");
                if (var2 != null) {
                  TriangleMesh.field_h[5] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(61, "achievements_hidden_text");
                if (var2 != null) {
                  SpriteDrawHelpers.field_c = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(56, "maxtxt");
                if (var2 != null) {
                  UiTheme.field_m = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 94, "timeformat");
                if (var2 != null) {
                  AlphaContainer.field_S = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(71, "expansiononlyitem");
                if (null != var2) {
                  SessionExitHelpers.field_b = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(110, "stathints,0");
                if (var2 != null) {
                  MeshMaterial.field_h[0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(123, "stathints,1");
                if (null != var2) {
                  MeshMaterial.field_h[1] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 71, "stathints,2");
                if (var2 != null) {
                  MeshMaterial.field_h[2] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(119, "stathints,3");
                if (null != var2) {
                  MeshMaterial.field_h[3] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(57, "stathints,4");
                if (var2 != null) {
                  MeshMaterial.field_h[4] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(72, "stathints,5");
                if (var2 != null) {
                  MeshMaterial.field_h[5] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 93, "stathints,6");
                if (null != var2) {
                  MeshMaterial.field_h[6] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(90, "stathints,7");
                if (var2 != null) {
                  MeshMaterial.field_h[7] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 113, "stathints,8");
                if (var2 != null) {
                  MeshMaterial.field_h[8] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(76, "stathints,9");
                if (var2 != null) {
                  MeshMaterial.field_h[9] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(108, "stathints,10");
                if (var2 != null) {
                  MeshMaterial.field_h[10] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(51, "stathints,11");
                if (var2 != null) {
                  MeshMaterial.field_h[11] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 74, "itemstathints,0");
                if (var2 != null) {
                  ArchiveLoadStep.field_j[0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(105, "itemstathints,1");
                if (null != var2) {
                  ArchiveLoadStep.field_j[1] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 107, "itemstathints,2");
                if (null != var2) {
                  ArchiveLoadStep.field_j[2] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 70, "itemstathints,3");
                if (var2 != null) {
                  ArchiveLoadStep.field_j[3] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(71, "itemstathints,4");
                if (null != var2) {
                  ArchiveLoadStep.field_j[4] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 80, "itemstathints,5");
                if (null != var2) {
                  ArchiveLoadStep.field_j[5] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(105, "itemstathints,6");
                if (null != var2) {
                  ArchiveLoadStep.field_j[6] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(65, "itemstathints,7");
                if (null != var2) {
                  ArchiveLoadStep.field_j[7] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 80, "itemstathints,8");
                if (var2 != null) {
                  ArchiveLoadStep.field_j[8] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(102, "itemstathints,9");
                if (null != var2) {
                  ArchiveLoadStep.field_j[9] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(59, "itemstathints,10");
                if (var2 != null) {
                  ArchiveLoadStep.field_j[10] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(113, "itemstathints,11");
                if (var2 != null) {
                  ArchiveLoadStep.field_j[11] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(72, "statnone");
                if (var2 != null) {
                  MusicPatchPcmStream.field_E = IntKeyLookup.decodeWindowsCodePageString(param0 ^ 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(53, "moduleslotnum");
                if (var2 != null) {
                  TickClock.field_e = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 90, "defaultheadfor");
                if (var2 != null) {
                  CachedTextLayout.field_F = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 117, "defaultarmfor");
                if (null != var2) {
                  AccountTermsPanel.field_T = IntKeyLookup.decodeWindowsCodePageString(param0 ^ 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(94, "defaultwingformany,0");
                if (var2 != null) {
                  SocialRequestHelpers.field_g[0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 65, "defaultwingformany,1");
                if (var2 != null) {
                  SocialRequestHelpers.field_g[1] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(94, "defaultwingformany,2");
                if (var2 != null) {
                  SocialRequestHelpers.field_g[2] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(66, "defaultwingformany,3");
                if (var2 != null) {
                  SocialRequestHelpers.field_g[3] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(116, "defaultwingformany,4");
                if (var2 != null) {
                  SocialRequestHelpers.field_g[4] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(122, "ignoretxt");
                if (var2 != null) {
                  TextHotspotWidget.field_Z = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(118, "mission_num_status");
                if (null != var2) {
                  DebouncedValidator.field_f = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 98, "training_mission_num_status");
                if (null != var2) {
                  NodeDeque.field_h = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 111, "missionstatustxt,0");
                if (null != var2) {
                  SceneWidget.field_jb[0] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(110, "missionstatustxt,1");
                if (var2 != null) {
                  SceneWidget.field_jb[1] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 118, "missionstatustxt,2");
                if (null != var2) {
                  SceneWidget.field_jb[2] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(60, "missionstatustxt,3");
                if (null != var2) {
                  SceneWidget.field_jb[3] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(124, "missionstatustxt,4");
                if (var2 != null) {
                  SceneWidget.field_jb[4] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(120, "missionstatustxt,5");
                if (var2 != null) {
                  SceneWidget.field_jb[5] = IntKeyLookup.decodeWindowsCodePageString(TextAndBitHelpers.bitXor(param0, 13), var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(113, "missionstatustxt,6");
                if (null != var2) {
                  SceneWidget.field_jb[6] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(119, "missiondesc");
                if (var2 != null) {
                  QuickChatPhraseCache.field_j = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 101, "pageMofN");
                if (var2 != null) {
                  DesignerPageSetup.field_e = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 + 112, "RANK_TXT,0");
                if (null != var2) {
                  RankingAndRasterHelpers.field_a[0] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(71, "RANK_TXT,1");
                if (null != var2) {
                  RankingAndRasterHelpers.field_a[1] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(88, "RANK_TXT,2");
                if (var2 != null) {
                  RankingAndRasterHelpers.field_a[2] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(71, "RANK_TXT,3");
                if (null != var2) {
                  RankingAndRasterHelpers.field_a[3] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(123, "RANK_TXT,4");
                if (var2 != null) {
                  RankingAndRasterHelpers.field_a[4] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(116, "RANK_TXT,5");
                if (null != var2) {
                  RankingAndRasterHelpers.field_a[5] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(124, "RANK_TXT,6");
            }
            void runChunk6() throws java.lang.RuntimeException {
                if (null != var2) {
                  RankingAndRasterHelpers.field_a[6] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(115, "RANK_TXT,7");
                if (var2 != null) {
                  RankingAndRasterHelpers.field_a[7] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(124, "RANK_TXT,8");
                if (null != var2) {
                  RankingAndRasterHelpers.field_a[8] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(58, "RANK_TXT,9");
                if (var2 != null) {
                  RankingAndRasterHelpers.field_a[9] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(param0 ^ 104, "RANK_TXT,10");
                if (var2 != null) {
                  RankingAndRasterHelpers.field_a[10] = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(66, "RANK_TXT,11");
                if (var2 != null) {
                  RankingAndRasterHelpers.field_a[11] = IntKeyLookup.decodeWindowsCodePageString(param0 + 13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(115, "endmissiontxt");
                if (var2 != null) {
                  ClientUiHelpers.field_f = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(102, "endtestfieldtxt");
                if (null != var2) {
                  VerticalScrollbar.field_fc = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(99, "referencemanual");
                if (var2 != null) {
                  DualNode.field_s = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                var2 = SentinelDesigner.readTextResourceBytes(87, "coophighscorestxt");
                if (null != var2) {
                  TutorialStepTable.field_j = IntKeyLookup.decodeWindowsCodePageString(13, var2);
                }
                MusicCrossfadeStream.field_y = null;
            }
            void run() {
                var3 = SteelSentinels.obfuscationControl;
                try {
                  runChunk0();
                  if (finished) return;
                  runChunk1();
                  if (finished) return;
                  runChunk2();
                  if (finished) return;
                  runChunk3();
                  if (finished) return;
                  runChunk4();
                  if (finished) return;
                  runChunk5();
                  if (finished) return;
                  runChunk6();
                  if (finished) return;
                } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2_ref = decompiledCaughtException;
                  stackIn_4687_0 = (RuntimeException) (var2_ref);
                  stackIn_4687_1 = new StringBuilder().append("rc.A(").append(param0).append(',');
                  if (param1 == null) {
                    stackIn_4688_2 = "null";
                  } else {
                    stackIn_4688_2 = "{...}";
                  }
                  throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) stackIn_4687_0), ((StringBuilder) (Object) stackIn_4687_1).append(stackIn_4688_2).append(')').toString());
                }
                if (var3 != 0) {
                  stackIn_4696_0 = (!GameApplet.field_i);
                  GameApplet.field_i = stackIn_4696_0;
                }
            }
        }
        $CfrPartitionedBody decompiledBody = new $CfrPartitionedBody(param0, param1);
        decompiledBody.run();
    }

    final static boolean pollGameSocketConnection(int param0, boolean param1) {
        try {
          long dupTemp$1 = 0L;
          IOException iOException = null;
          CipherPacketBuffer var2 = null;
          RuntimeException var2_ref = null;
          int stackIn_17_0 = 0;
          int decompiledRegionSelector0 = 0;
          Throwable decompiledCaughtException = null;
          try {
            if (DelayedServerPacket.field_o == null) {
              DelayedServerPacket.field_o = ArticulatedPart.field_A.requestSocket(AccountRequestResult.field_b, UiTheme.field_l, 376255344);
            }
            if (DelayedServerPacket.field_o.field_a == 0) {
              return false;
            }
            dupTemp$1 = ClockAndCookieHelpers.monotonicMillis(40);
            RequestResendHelpers.field_d = dupTemp$1;
            QuickChatPhraseCache.field_b = dupTemp$1;
            if (param0 < 115) {
              return false;
            }
            if (DelayedServerPacket.field_o.field_a == 1) {
              try {
                rb.field_h = new BufferedSocket((java.net.Socket) (DelayedServerPacket.field_o.field_c), ArticulatedPart.field_A);
                ClockAndCookieHelpers.field_g.position = 0;
                var2 = LoginConnectionStage.field_d;
                var2.position = 0;
                stackIn_17_0 = (!param1) ? -1 : -2;
                OptionMaskHelpers.field_d = stackIn_17_0;
                TextHotspotWidget.field_W = stackIn_17_0;
                RasterSnapshot.field_u = stackIn_17_0;
                PendingAckRequest.field_v = SocialRequestHelpers.field_d;
                SpriteCheckboxPainter.writeServiceHeader(ClockAndCookieHelpers.field_g, 12, ScrollContainer.field_Wb, StripedProgressBar.field_Z, AccountRegistrationPanel.field_T);
                SpriteDrawHelpers.flushOutgoingPackets(0, -1);
                decompiledRegionSelector0 = 0;
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                iOException = (IOException) (Object) decompiledCaughtException;
                PendingAckRequest.field_v = NanoTickClock.field_j;
                if (SteelSentinels.obfuscationControl == 0) {
                  decompiledRegionSelector0 = 0;
                } else {
                  decompiledRegionSelector0 = 1;
                }
              }
              if (decompiledRegionSelector0 != 0) {
                PendingAckRequest.field_v = NanoTickClock.field_j;
              }
            } else {
              PendingAckRequest.field_v = NanoTickClock.field_j;
            }
            DelayedServerPacket.field_o = null;
            return true;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) var2_ref), "rc.E(" + param0 + ',' + param1 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final boolean writeSectors(boolean param0, int param1, boolean param2, byte[] param3, int param4) {
        try {
          boolean stackIn_26_0 = false;
          int stackIn_79_0 = 0;
          int stackIn_80_0 = 0;
          RuntimeException stackIn_88_0 = null;
          StringBuilder stackIn_88_1 = null;
          String stackIn_89_2 = null;
          int decompiledRegionSelector0 = 0;
          int decompiledRegionSelector1 = 0;
          Throwable decompiledCaughtException = null;
          boolean stackOut_25_0;
          Object var6 = null;
          RuntimeException var6_ref = null;
          int var7_int = 0;
          IOException var7 = null;
          int var8 = 0;
          int var9 = 0;
          int var10 = 0;
          int var11 = 0;
          int var12 = 0;
          int var13 = 0;
          EOFException var14 = null;
          int var16 = 0;
          var16 = SteelSentinels.obfuscationControl;
          try {
            var6 = this.field_h;
            synchronized (var6) {
              try {
                boolean decompiledFrameRemainder1 = true;
                if (!param2) {
                  var7_int = (int)((519L + this.field_h.length((byte) 123)) / 520L);
                  decompiledFrameRemainder1 = (var7_int == 0);
                  if (decompiledFrameRemainder1) {
                    var7_int = 1;
                  }
                }
                if ((decompiledFrameRemainder1) &&
                  (param2 ||
                  var16 != 0)) {
                  if ((long)(param4 * 6 + 6) > this.field_c.length((byte) 92)) {
                    return false;
                  }
                  this.field_c.seek(-99, (long)(param4 * 6));
                  this.field_c.readFully((byte) 115, Projectile.field_db, 6, 0);
                  var7_int = (255 & Projectile.field_db[5]) + ((Projectile.field_db[4] << 8 & 65280) + ((255 & Projectile.field_db[3]) << 16));
                  if (var7_int <= 0 ||
                    !((this.field_h.length((byte) -32) / 520L) >= (long)var7_int)) {
                    return false;
                  }
                }
                Projectile.field_db[1] = (byte)(param1 >> 8);
                Projectile.field_db[5] = (byte)var7_int;
                Projectile.field_db[4] = (byte)(var7_int >> 8);
                if (!param0) {
                  this.read(-30, true);
                }
                Projectile.field_db[0] = (byte)(param1 >> 16);
                Projectile.field_db[3] = (byte)(var7_int >> 16);
                Projectile.field_db[2] = (byte)param1;
                this.field_c.seek(-128, (long)(6 * param4));
                this.field_c.write(0, 6, 38, Projectile.field_db);
                var8 = 0;
                var9 = 0;
                scanLoop1: while (true) {
                  boolean decompiledFrameRemainder2 = true;
                  if (param1 > var8) {
                    var10 = 0;
                    stackOut_25_0 = param2;
                    stackIn_80_0 = stackOut_25_0 ? 1 : 0;
                    stackIn_26_0 = stackOut_25_0;
                    if (var16 != 0) {
                      break scanLoop1;
                    }
                    boolean decompiledFrameRemainder0 = true;
                    if (stackIn_26_0) {
                      this.field_h.seek(-111, (long)(520 * var7_int));
                      if (param4 <= 65535) {
                        try {
                          this.field_h.readFully((byte) 115, Projectile.field_db, 8, 0);
                          decompiledRegionSelector1 = 0;
                        } catch (java.io.EOFException decompiledCaughtParameter0) {
                          decompiledCaughtException = decompiledCaughtParameter0;
                          var14 = (EOFException) (Object) decompiledCaughtException;
                          if (var16 == 0) {
                            decompiledRegionSelector1 = 1;
                          } else {
                            decompiledRegionSelector1 = 0;
                          }
                        }
                        decompiledFrameRemainder2 = (decompiledRegionSelector1 == 0);
                        if (decompiledFrameRemainder2) {
                          var11 = ((255 & Projectile.field_db[0]) << 8) + (255 & Projectile.field_db[1]);
                          var13 = 255 & Projectile.field_db[7];
                          var12 = ((255 & Projectile.field_db[2]) << 8) + (Projectile.field_db[3] & 255);
                          var10 = ((255 & Projectile.field_db[5]) << 8) + ((16711680 & Projectile.field_db[4] << 16) + (255 & Projectile.field_db[6]));
                        }
                      }
                      if (decompiledFrameRemainder2) {
                        if (param4 > 65535 ||
                          var16 != 0) {
                          try {
                            this.field_h.readFully((byte) 115, Projectile.field_db, 10, 0);
                            decompiledRegionSelector0 = 0;
                          } catch (java.io.EOFException decompiledCaughtParameter1) {
                            decompiledCaughtException = decompiledCaughtParameter1;
                            var14 = (EOFException) (Object) decompiledCaughtException;
                            if (var16 == 0) {
                              decompiledRegionSelector0 = 1;
                            } else {
                              decompiledRegionSelector0 = 0;
                            }
                          }
                          decompiledFrameRemainder2 = (decompiledRegionSelector0 == 0);
                          if (decompiledFrameRemainder2) {
                            var11 = (65280 & Projectile.field_db[2] << 8) + ((-16777216 & Projectile.field_db[0] << 24) + ((255 & Projectile.field_db[1]) << 16)) + (255 & Projectile.field_db[3]);
                            var12 = (65280 & Projectile.field_db[4] << 8) + (Projectile.field_db[5] & 255);
                            var13 = 255 & Projectile.field_db[9];
                            var10 = (Projectile.field_db[8] & 255) + ((Projectile.field_db[7] & 255) << 8) + ((Projectile.field_db[6] & 255) << 16);
                          }
                        }
                        if (decompiledFrameRemainder2) {
                          if ((~param4 == ~var11 &&
                            ~var9 == ~var12 &&
                            ~this.field_e == ~var13) &&
                            (decompiledFrameRemainder0 = (!(var10 >= 0) ||
                            !((this.field_h.length((byte) 113) / 520L) >= (long)var10)))) {
                            return false;
                          }
                          if (decompiledFrameRemainder0) {
                            return false;
                          }
                        }
                      }
                    }
                    if (decompiledFrameRemainder2) {
                      if (0 == var10) {
                        var10 = (int)((519L + this.field_h.length((byte) 97)) / 520L);
                        param2 = false;
                        if (var10 == 0) {
                          var10++;
                        }
                        if (var10 == var7_int) {
                          var10++;
                        }
                      }
                      if (param1 - var8 <= 512) {
                        var10 = 0;
                      }
                      if (65535 >= param4) {
                        Projectile.field_db[0] = (byte)(param4 >> 8);
                        Projectile.field_db[2] = (byte)(var9 >> 8);
                        Projectile.field_db[6] = (byte)var10;
                        Projectile.field_db[7] = (byte)this.field_e;
                        Projectile.field_db[4] = (byte)(var10 >> 16);
                        Projectile.field_db[1] = (byte)param4;
                        Projectile.field_db[5] = (byte)(var10 >> 8);
                        Projectile.field_db[3] = (byte)var9;
                        this.field_h.seek(-120, (long)(520 * var7_int));
                        this.field_h.write(0, 8, 48, Projectile.field_db);
                        var11 = -var8 + param1;
                        if (512 < var11) {
                          var11 = 512;
                        }
                        this.field_h.write(var8, var11, 112, param3);
                        var8 = var8 + var11;
                      }
                      if (65535 < param4 ||
                        var16 != 0) {
                        Projectile.field_db[0] = (byte)(param4 >> 24);
                        Projectile.field_db[4] = (byte)(var9 >> 8);
                        Projectile.field_db[2] = (byte)(param4 >> 8);
                        Projectile.field_db[9] = (byte)this.field_e;
                        Projectile.field_db[7] = (byte)(var10 >> 8);
                        Projectile.field_db[3] = (byte)param4;
                        Projectile.field_db[8] = (byte)var10;
                        Projectile.field_db[6] = (byte)(var10 >> 16);
                        Projectile.field_db[5] = (byte)var9;
                        Projectile.field_db[1] = (byte)(param4 >> 16);
                        this.field_h.seek(-118, (long)(var7_int * 520));
                        this.field_h.write(0, 10, 119, Projectile.field_db);
                        var11 = param1 - var8;
                        if (510 < var11) {
                          var11 = 510;
                        }
                        this.field_h.write(var8, var11, 110, param3);
                        var8 = var8 + var11;
                      }
                      var7_int = var10;
                      var9++;
                      if (var16 == 0) {
                        continue;
                      }
                    }
                  }
                  stackIn_79_0 = 1;
                  stackIn_80_0 = stackIn_79_0;
                  break;
                }
                return stackIn_80_0 != 0;
              } catch (java.io.IOException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var7 = (IOException) (Object) decompiledCaughtException;
                return false;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
            decompiledCaughtException = decompiledCaughtParameter3;
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_88_0 = var6_ref;
            stackIn_88_1 = new StringBuilder().append("rc.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            if (param3 == null) {
              stackIn_89_2 = "null";
            } else {
              stackIn_89_2 = "{...}";
            }
            throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) stackIn_88_0), ((StringBuilder) (Object) stackIn_88_1).append(stackIn_89_2).append(',').append(param4).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final String toString() {
        String stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          stackIn_1_0 = "" + this.field_e;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) var1), "rc.toString()");
        }
    }

    SectorCacheStore(int param0, BufferedRandomAccessFile param1, BufferedRandomAccessFile param2, int param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_a = 65000;
        this.field_c = null;
        this.field_h = null;
        try {
          this.field_c = param2;
          this.field_a = param3;
          this.field_h = param1;
          this.field_e = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("rc.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(')').toString());
        }
    }

    final static int encodeWindowsCodePageText(int param0, CharSequence param1, int param2, int param3, byte[] param4, int param5) {
        int stackIn_188_0 = 0;
        RuntimeException stackIn_192_0 = null;
        StringBuilder stackIn_192_1 = null;
        String stackIn_193_2 = null;
        StringBuilder stackIn_196_1 = null;
        String stackIn_197_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = SteelSentinels.obfuscationControl;
        try {
          if (param3 >= -82) {
            SectorCacheStore.advanceTutorialStep(true);
          }
          var6_int = -param2 + param0;
          var7 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var6_int <= var7))) {
            var8 = param1.charAt(param2 + var7);
            stackIn_188_0 = 0;
            if (var9 == 0) {
              regionExit1: {
                if ((stackIn_188_0 >= var8 ||
                  var8 >= 128) &&
                  (var8 < 160 ||
                  var8 > 255)) {
                  switch (var8) {
                    case 8218:
                      param4[param5 + var7] = (byte) -126;
                      break regionExit1;
                    case 402:
                      param4[var7 + param5] = (byte) -125;
                      break regionExit1;
                    case 8230:
                      param4[var7 + param5] = (byte) -123;
                      break regionExit1;
                    case 8224:
                      param4[param5 + var7] = (byte) -122;
                      break regionExit1;
                    case 8225:
                      param4[param5 + var7] = (byte) -121;
                      break regionExit1;
                    case 710:
                      param4[var7 + param5] = (byte) -120;
                      break regionExit1;
                    case 8240:
                      param4[var7 + param5] = (byte) -119;
                      break regionExit1;
                    case 352:
                      param4[param5 + var7] = (byte) -118;
                      break regionExit1;
                    default:
                      switch (var8) {
                        case 8220:
                          param4[var7 + param5] = (byte) -109;
                          break regionExit1;
                        case 8221:
                          param4[var7 + param5] = (byte) -108;
                          break regionExit1;
                        case 8226:
                          param4[var7 + param5] = (byte) -107;
                          break regionExit1;
                        case 8212:
                          param4[param5 + var7] = (byte) -105;
                          break regionExit1;
                        case 732:
                          param4[param5 + var7] = (byte) -104;
                          break regionExit1;
                        case 8482:
                          param4[param5 + var7] = (byte) -103;
                          break regionExit1;
                        case 353:
                          param4[var7 + param5] = (byte) -102;
                          break regionExit1;
                        case 8250:
                          param4[var7 + param5] = (byte) -101;
                          break regionExit1;
                        default:
                          param4[var7 + param5] = (byte) 63;
                          break regionExit1;
                        case 376:
                          param4[param5 + var7] = (byte) -97;
                          break regionExit1;
                        case 382:
                          param4[param5 + var7] = (byte) -98;
                          break regionExit1;
                        case 339:
                          param4[param5 + var7] = (byte) -100;
                          break regionExit1;
                        case 8211:
                          param4[param5 + var7] = (byte) -106;
                          break regionExit1;
                        case 8217:
                          param4[param5 + var7] = (byte) -110;
                          break regionExit1;
                        case 8216:
                          param4[var7 + param5] = (byte) -111;
                          break regionExit1;
                        case 381:
                          param4[var7 + param5] = (byte) -114;
                          break regionExit1;
                        case 338:
                          param4[var7 + param5] = (byte) -116;
                          break regionExit1;
                      }
                    case 8249:
                      param4[param5 + var7] = (byte) -117;
                      break regionExit1;
                    case 8222:
                      param4[param5 + var7] = (byte) -124;
                      break regionExit1;
                    case 8364:
                      param4[param5 + var7] = (byte) -128;
                      break regionExit1;
                  }
                }
                param4[param5 + var7] = (byte)var8;
              }
              var7++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_188_0 = var6_int;
          }
          return stackIn_188_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_192_0 = var6;
          stackIn_192_1 = new StringBuilder().append("rc.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_193_2 = "null";
          } else {
            stackIn_193_2 = "{...}";
          }
          stackIn_196_1 = ((StringBuilder) (Object) stackIn_192_1).append(stackIn_193_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_197_2 = "null";
          } else {
            stackIn_197_2 = "{...}";
          }
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) stackIn_192_0), ((StringBuilder) (Object) stackIn_196_1).append(stackIn_197_2).append(',').append(param5).append(')').toString());
        }
    }

    final byte[] read(int param0, boolean param1) {
        try {
          int incrementValue$0 = 0;
          byte[] stackIn_4_0 = null;
          Object stackIn_9_0 = null;
          Object stackIn_18_0 = null;
          Object stackIn_25_0 = null;
          Object stackIn_33_0 = null;
          Object stackIn_52_0 = null;
          Object stackIn_59_0 = null;
          byte[] stackIn_67_0 = null;
          Object stackIn_70_0 = null;
          Throwable decompiledCaughtException = null;
          Object var3 = null;
          RuntimeException var3_ref = null;
          int var4_int = 0;
          IOException var4 = null;
          int var5 = 0;
          byte[] var6 = null;
          int var7 = 0;
          int var8 = 0;
          int var9 = 0;
          int var10 = 0;
          int var11 = 0;
          int var12 = 0;
          int var13 = 0;
          int var14 = 0;
          int var15 = 0;
          int var16 = 0;
          int var18 = 0;
          var18 = SteelSentinels.obfuscationControl;
          try {
            var3 = this.field_h;
            synchronized (var3) {
              if (param1) {
                stackIn_4_0 = (byte[]) null;
                return stackIn_4_0;
              }
              try {
                if (this.field_c.length((byte) -113) < (long)(6 * param0 + 6)) {
                  stackIn_9_0 = null;
                  return (byte[]) (stackIn_9_0);
                }
                this.field_c.seek(-96, (long)(param0 * 6));
                this.field_c.readFully((byte) 115, Projectile.field_db, 6, 0);
                var4_int = (Projectile.field_db[0] << 16 & 16711680) + ((Projectile.field_db[1] << 8 & 65280) + (Projectile.field_db[2] & 255));
                var5 = (Projectile.field_db[5] & 255) + ((Projectile.field_db[4] << 8 & 65280) + (Projectile.field_db[3] << 16 & 16711680));
                if (var4_int >= 0 &&
                  this.field_a >= var4_int) {
                  if (0 < var5 &&
                    (long)var5 <= this.field_h.length((byte) -99) / 520L) {
                    var6 = new byte[var4_int];
                    var7 = 0;
                    var8 = 0;
                    scanLoop1: while (true) {
                      if (var7 < var4_int) {
                        if (var5 == 0) {
                          stackIn_33_0 = null;
                          return (byte[]) (stackIn_33_0);
                        }
                        this.field_h.seek(-118, (long)(520 * var5));
                        var9 = var4_int - var7;
                        if (65535 >= param0) {
                          var14 = 8;
                          if (var9 > 512) {
                            var9 = 512;
                          }
                          this.field_h.readFully((byte) 115, Projectile.field_db, var14 + var9, 0);
                          var12 = (65280 & Projectile.field_db[5] << 8) + ((Projectile.field_db[4] & 255) << 16) + (Projectile.field_db[6] & 255);
                          var13 = 255 & Projectile.field_db[7];
                          var11 = (Projectile.field_db[2] << 8 & 65280) + (Projectile.field_db[3] & 255);
                          var10 = (Projectile.field_db[1] & 255) + (65280 & Projectile.field_db[0] << 8);
                        }
                        if (65535 < param0 ||
                          var18 != 0) {
                          var14 = 10;
                          if (var9 > 510) {
                            var9 = 510;
                          }
                          this.field_h.readFully((byte) 115, Projectile.field_db, var9 + var14, 0);
                          var13 = Projectile.field_db[9] & 255;
                          var10 = (Projectile.field_db[2] << 8 & 65280) + ((Projectile.field_db[0] & 255) << 24) - (-(Projectile.field_db[1] << 16 & 16711680) - (Projectile.field_db[3] & 255));
                          var11 = (255 & Projectile.field_db[5]) + ((255 & Projectile.field_db[4]) << 8);
                          var12 = (65280 & Projectile.field_db[7] << 8) + (Projectile.field_db[6] << 16 & 16711680) + (Projectile.field_db[8] & 255);
                        }
                        if (~param0 == ~var10 &&
                          ~var8 == ~var11 &&
                          ~var13 == ~this.field_e) {
                          if (var12 >= 0 &&
                            (long)var12 <= this.field_h.length((byte) 98) / 520L) {
                            var15 = var9 + var14;
                            var5 = var12;
                            var8++;
                            var16 = var14;
                            while (var15 > var16) {
                              incrementValue$0 = var7;
                              var7++;
                              var6[incrementValue$0] = Projectile.field_db[var16];
                              var16++;
                              if (var18 != 0) {
                                continue scanLoop1;
                              }
                              if (var18 == 0) {
                                continue;
                              }
                              break;
                            }
                            if (var18 == 0) {
                              continue;
                            }
                            break scanLoop1;
                          }
                          stackIn_59_0 = null;
                          return (byte[]) (stackIn_59_0);
                        }
                        stackIn_52_0 = null;
                        return (byte[]) (stackIn_52_0);
                      }
                      break;
                    }
                    stackIn_67_0 = var6;
                    return stackIn_67_0;
                  }
                  stackIn_25_0 = null;
                  return (byte[]) (stackIn_25_0);
                }
                stackIn_18_0 = null;
                return (byte[]) (stackIn_18_0);
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4 = (IOException) (Object) decompiledCaughtException;
                stackIn_70_0 = null;
                return (byte[]) (stackIn_70_0);
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) var3_ref), "rc.B(" + param0 + ',' + param1 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_f = "More suggestions";
        field_g = -1;
        field_k = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
        field_o = new int[][]{null, new int[]{1, 2, 4}, null};
        field_l = 0;
        field_b = null;
    }
}
