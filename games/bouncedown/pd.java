/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pd {
    static BufferedRandomAccessFile[] field_a;
    static String field_b;

    final static void a(int param0) {
        String var1 = null;
        if (!fe.field_g) {
          throw new IllegalStateException();
        }
        if (null != BouncedownMenuEntry.field_a) {
          BouncedownMenuEntry.field_a.closeDialog(true);
        }
        if (param0 == 11173) {
          var1 = fd.c((byte) 61);
          vk.field_c = new LoginPanel(var1, (String) null, true, false, false);
          DisplayNameSelectionPanel.field_N.showDialog(TextLayout.field_c, false);
          TextLayout.field_c.replaceContent(param0 ^ 437, vk.field_c);
          TextLayout.field_c.finishResize((byte) -85);
          return;
        }
    }

    final static void a(boolean param0, int param1) {
        qh.field_e = GrowableIntArray.field_e[param1];
        if (param0) {
          BufferedSocket.field_p = hc.field_d[param1];
          CipherPacketBuffer.field_l = nl.field_b[param1];
          return;
        }
        field_a = (BufferedRandomAccessFile[]) null;
        BufferedSocket.field_p = hc.field_d[param1];
        CipherPacketBuffer.field_l = nl.field_b[param1];
    }

    final static AccountServiceResult pollAccountNameCheck(int param0, String param1) {
        RuntimeException var2 = null;
        Object stackIn_9_0 = null;
        AccountServiceResult stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (RichTextWidget.field_F == qg.field_g) {
            return null;
          }
          if (param0 != 1059) {
            field_b = (String) null;
          }
          if (LeaderboardSubmission.field_p == RichTextWidget.field_F &&
            param1.equals(t.field_t)) {
            RichTextWidget.field_F = wj.field_a;
            stackIn_11_0 = SocketConnector.field_c;
            return stackIn_11_0;
          }
          RichTextWidget.field_F = qg.field_g;
          SocketConnector.field_c = null;
          t.field_t = param1;
          stackIn_9_0 = null;
          return (AccountServiceResult) (stackIn_9_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("pd.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw CipherPacketBuffer.wrapClientException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    public static void clearStaticReferences(byte param0) {
        int var1 = -102 / ((param0 + 62) / 48);
        field_b = null;
        field_a = null;
    }

    static {
        field_b = "Mouse over an icon for details";
    }
}
