/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class FrameSkin {
    private Sprite[] field_g;
    static boolean field_f;
    static String field_b;
    static int field_e;
    static boolean field_c;
    static int[] field_h;
    static volatile boolean field_a;
    static String field_d;

    final static boolean fillIncomingBuffer(int param0, int param1) {
        try {
          if (ProgressMessageDialog.field_qb.position >= param0) {
            return true;
          }
          if (null == QuickChatMenu.field_Ub) {
            return false;
          }
          int var2_int = QuickChatMenu.field_Ub.available(31479);
          if (param1 < var2_int) {
            if (var2_int > -ProgressMessageDialog.field_qb.position + param0) {
              var2_int = param0 - ProgressMessageDialog.field_qb.position;
            }
            QuickChatMenu.field_Ub.readFully(var2_int, ProgressMessageDialog.field_qb.payload, param1 - 1, ProgressMessageDialog.field_qb.position);
            PendingSubmission.field_l = ClockAndTextHelpers.monotonicMillis(-9986);
            ProgressMessageDialog.field_qb.position = ProgressMessageDialog.field_qb.position + var2_int;
            if (!(ProgressMessageDialog.field_qb.position >= param0)) {
              return false;
            }
            ProgressMessageDialog.field_qb.position = 0;
            return true;
          }
          try {
            if (false) throw (IOException) null;
            if (0 <= var2_int &&
              AccountCreationSupport.getMillisSinceLastServerData(-126) <= 30000L) {
              return false;
            }
            MenuInputState.closeGameConnection(false);
          } catch (IOException iOException) {
            MenuInputState.closeGameConnection(false);
          }
          return false;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void releaseStatics(int param0) {
        field_b = null;
        field_d = null;
        field_h = null;
        if (param0 != 0) {
          field_c = true;
        }
    }

    final void drawFrame(int param0, int param1, boolean param2, int param3, int param4) {
        QueuedListRequest.drawNineSliceFrame(param0, param4, param2, param3, param1, this.field_g);
    }

    FrameSkin(Sprite[] param0) {
        try {
          this.field_g = param0;
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "wg.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void initializeConnectionState(int param0, int param1, int param2, long param3, PlatformTaskDispatcher param4, boolean param5, int param6, boolean param7, int param8, int param9, int param10, String param11, int param12, int param13) {
        try {
          RuntimeException stackIn_16_0 = null;
          StringBuilder stackIn_16_1 = null;
          String stackIn_17_2 = null;
          StringBuilder stackIn_19_1 = null;
          String stackIn_20_2 = null;
          Throwable decompiledCaughtException = null;
          IOException var15 = null;
          RuntimeException var15_ref = null;
          try {
            ProgressMessageDialog.field_qb = new CipherPacketBuffer(param1);
            IterableNodeHashTable.field_g = new CipherPacketBuffer(param8);
            QuickChatMenu.field_Yb = param10;
            QuickChatCategoryCache.field_m = param0;
            ConditionalTextValue.field_b = param12;
            CellAnimator.field_m = param9;
            RankingArraySupport.field_c = param11;
            ArchiveLoadSequence.field_f = param4;
            field_c = param5;
            if (param6 != 64) {
              field_c = true;
            }
            PasswordLoginCredentials.field_n = param3;
            ChatMessage.field_c = param2;
            BufferedSocket.field_k = param7;
            MenuInputState.field_i = param13;
            if (ArchiveLoadSequence.field_f.field_o == null) {
              return;
            }
            try {
              SocialListEntry.field_Ib = new BufferedFile(ArchiveLoadSequence.field_f.field_o, 64, 0);
              return;
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var15 = (IOException) (Object) decompiledCaughtException;
              throw new RuntimeException(var15.toString());
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var15_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_16_0 = var15_ref;
            stackIn_16_1 = new StringBuilder().append("wg.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            if (param4 == null) {
              stackIn_17_2 = "null";
            } else {
              stackIn_17_2 = "{...}";
            }
            stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',');
            if (param11 == null) {
              stackIn_20_2 = "null";
            } else {
              stackIn_20_2 = "{...}";
            }
            throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param12).append(',').append(param13).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_f = true;
        field_e = 4;
        field_b = "Join";
        field_d = "Players";
        field_a = false;
    }
}
