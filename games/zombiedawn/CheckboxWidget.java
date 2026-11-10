/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CheckboxWidget extends TextButton {
    static String field_E;
    static String field_I;
    static String field_H;
    static boolean field_F;
    static int[] field_G;

    CheckboxWidget(String param0, WidgetListener param1, boolean param2) {
        this(param0, param1);
        try {
          this.field_x = param2 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "fm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private CheckboxWidget(String param0, WidgetListener param1) {
        this(param0, ProxySocketConnector.field_j.field_a, param1);
        try {
          this.field_h = ProxySocketConnector.field_j.field_g;
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "fm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private CheckboxWidget(String param0, WidgetPainter param1, WidgetListener param2) {
        super(param0, param1, param2);
        try {
          this.field_h = ProxySocketConnector.field_j.field_g;
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "fm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void handlePendingRequestReply(boolean param0) {
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        BitPacketBuffer var5 = null;
        int var6 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        AchievementSubmission var11 = null;
        PendingIntArrayRequest var12 = null;
        BitPacketBuffer var13 = null;
        PendingIntArrayRequest var14 = null;
        var8 = ZombieDawn.field_J;
        try {
          var13 = MatchingTextValidator.field_g;
          var2 = var13.readUnsignedByte((byte) -116);
          if (!param0) {
            field_G = (int[]) null;
          }
          if (var2 == 0) {
            var10 = ErrorReportHelpers.newEightInts(14821);
            var3 = var10;
            var9 = var10;
            var4 = var9;
            var5 = var13;
            var6 = ((PacketBuffer) ((Object) var5)).readUnsignedByte((byte) -124);
            for (var7 = 0; var6 > var7; var7++) {
              var9[var7] = ((PacketBuffer) ((Object) var5)).readInt(-90);
            }
            var12 = (PendingIntArrayRequest) (ScrollContainer.field_J.last((byte) 26));
            if (var12 == null) {
              SessionSocketHelpers.closeSessionSocket(1);
              return;
            }
            var12.field_o = true;
            var12.field_k = var3;
            var12.unlink(-27598);
            return;
          }
          if (var2 != 1) {
            if (2 != var2) {
              ErrorReportHelpers.reportClientError((Throwable) null, 10331, "A1: " + VisualPropertyOverrides.describePacketHistory(3));
              SessionSocketHelpers.closeSessionSocket(1);
            } else {
              var14 = (PendingIntArrayRequest) (ScrollContainer.field_J.last((byte) 26));
              if (var14 == null) {
                SessionSocketHelpers.closeSessionSocket(1);
                return;
              }
              var14.field_k = ErrorReportHelpers.newEightInts(14821);
              var14.field_o = true;
              var14.unlink(-27598);
            }
          } else {
            var11 = (AchievementSubmission) (RankingRowHelpers.field_g.last((byte) 26));
            if (var11 == null) {
              SessionSocketHelpers.closeSessionSocket(1);
              return;
            }
            var11.unlink(-27598);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ExceptionWrapper.wrapException((Throwable) ((Object) var1), "fm.F(" + param0 + ')');
        }
    }

    final void activate(int param0, int param1, int param2, int param3) {
        this.field_x = !this.field_x ? true : false;
        int var5 = -35 / ((-12 - param1) / 56);
        super.activate(param0, -73, param2, param3);
    }

    public static void releaseStatics(int param0) {
        field_H = null;
        field_G = null;
        field_I = null;
        field_E = null;
        if (param0 != 12959) {
          field_G = (int[]) null;
        }
    }

    final static String normalizeDisplayName(CharSequence param0, int param1) {
        int var6 = 0;
        StringBuilder discarded$0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = ZombieDawn.field_J;
        try {
          if (param0 == null) {
            return null;
          }
          var2_int = 0;
          var3 = param0.length();
          while (var2_int < var3) {
            if (NameCharacterHelpers.isNameSeparator(31153, param0.charAt(var2_int))) {
              var2_int++;
              continue;
            }
            break;
          }
          while (var2_int < var3) {
            if (NameCharacterHelpers.isNameSeparator(31153, param0.charAt(-1 + var3))) {
              var3--;
              continue;
            }
            break;
          }
          var4 = -var2_int + var3;
          if (var4 < 1) {
            return null;
          }
          if (var4 > 12) {
            return null;
          }
          var5 = new StringBuilder(var4);
          if (param1 >= -34) {
            CheckboxWidget.handlePendingRequestReply(true);
          }
          for (var6 = var2_int; var3 > var6; var6++) {
            var7 = param0.charAt(var6);
            if (MidiNoteMask.isAllowedNameChar((char) var7, false)) {
              var8 = MoveTargetMarker.normalizeNameCharacter(-122, (char) var7);
              if (var8 != 0) {
                discarded$0 = var5.append((char) var8);
              }
            }
          }
          if (var5.length() != 0) {
            return var5.toString();
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_32_0 = var2;
          stackIn_32_1 = new StringBuilder().append("fm.G(");
          if (param0 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_E = "Unfortunately you are not eligible to create an account.";
        field_I = "The living have defeated your shambling advance.";
        field_F = true;
        field_H = "Level Selection";
        field_G = new int[8192];
    }
}
