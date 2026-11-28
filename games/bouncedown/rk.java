/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rk {
    static int field_a;

    final static void resendPendingPlayerData(int param0, byte param1) {
        int var3 = 0;
        sa var4 = null;
        LeaderboardSubmission var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = Bounce.field_N;
        try {
          var5 = (LeaderboardSubmission) (of.field_b.beginForward((byte) -105));
          if (param1 != -29) {
            return;
          }
          while (var5 != null) {
            mi.writeLeaderboardSubmissionPacket(param0, -115, var5);
            var5 = (LeaderboardSubmission) (of.field_b.nextForward((byte) -18));
          }
          var4 = (sa) (jl.field_f.beginForward((byte) -58));
          while (var4 != null) {
            ha.a(-17765, var4, param0);
            var4 = (sa) (jl.field_f.nextForward((byte) -29));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw CipherPacketBuffer.wrapClientException((Throwable) ((Object) var2), "rk.F(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(int param0, String param1, boolean param2, boolean param3) {
        try {
          ig.a(-92);
          DisplayNameSelectionPanel.field_N.closeAllDialogs(-20281);
          if (param0 != 4) {
            field_a = 22;
          }
          vk.field_c = new LoginPanel(gi.field_b, (String) null, fe.field_g, param3, param2);
          TextLayout.field_c = new StandardContentDialog(DisplayNameSelectionPanel.field_N, vk.field_c);
          DisplayNameSelectionPanel.field_N.showDialog(TextLayout.field_c, false);
        } catch (RuntimeException runtimeException) {
          throw CipherPacketBuffer.wrapClientException((Throwable) ((Object) runtimeException), "rk.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static String a(boolean param0, CharSequence[] param1) {
        RuntimeException var2 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            stackIn_4_0 = lh.a(-121, param1.length, param1, 0);
            return stackIn_4_0;
          }
          stackIn_2_0 = (String) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("rk.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw CipherPacketBuffer.wrapClientException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static CoverageBitmapFont a(ResourceArchive param0, ResourceArchive param1, byte param2, int param3, int param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        CoverageBitmapFont stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = -80 % ((51 - param2) / 48);
          if (!c.a(param0, false, param4, param3)) {
            return null;
          }
          stackIn_4_0 = gi.a(param1.getFile(-127, param3, param4), 41);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("rk.D(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw CipherPacketBuffer.wrapClientException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static String a(boolean param0, boolean param1, int param2, boolean param3) {
        int var4;
        var4 = 0;
        if (param1) {
          var4 += 4;
        }
        if (param2 != 4) {
          field_a = 22;
        }
        if (param0) {
          var4 += 2;
        }
        if (param3) {
          var4++;
        }
        return vg.field_a[var4];
    }

    final static void a(int param0, int param1, String param2, int param3, int param4, int param5, PlatformTaskDispatcher param6, int param7, int param8) {
        MatchingFieldValidator.field_l = param2;
        a.field_a = param4;
        if (param3 != 0) {
          return;
        }
        try {
          RichTextWidget.field_G = param6;
          AccountRequestState.field_e = param0;
          fi.field_c = param5;
          pe.field_c = param1;
          Bzip2State.field_s = param7;
          fk.field_d = param8;
          SocketArchiveNetworkClient.field_p = (ArchiveNetworkClient) ((Object) new SocketArchiveNetworkClient());
          LabeledWidgetContainer.field_F = new DiskCacheWorker(param6);
          ih.field_Q = new ArchiveSourceManager(SocketArchiveNetworkClient.field_p, LabeledWidgetContainer.field_F);
        } catch (RuntimeException runtimeException) {
          throw CipherPacketBuffer.wrapClientException((Throwable) ((Object) runtimeException), "rk.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        field_a = 0;
    }
}
