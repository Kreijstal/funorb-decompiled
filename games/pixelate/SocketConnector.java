/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class SocketConnector {
    static String[] field_g;
    int field_e;
    static Sprite[] field_c;
    static ResourceArchive field_a;
    String field_b;
    static String field_d;
    static SecondaryNodeHashTable field_f;

    final static void layoutChatPanel(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var12 = 0;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7Lifetime1;
        var14 = Pixelate.field_H ? 1 : 0;
        try {
          var6_int = 8 + (param5 + param1 + 8) + 487;
          KiteTailSegment.field_k.setBounds(3, Cp1252DecodeHelpers.field_i.height - 6, param0, 256, -6 + var6_int);
          var7 = KiteTailSegment.field_k.height - 5;
          StripedProgressBar.field_U.setBounds(var7 - param2, param2, 5, 256, 487 + param1 + param5);
          LoginFormGlobals.field_d.setBounds(0, param2, param1, 256, -HighscoreSubmission.field_y.field_K - param1 + StripedProgressBar.field_U.field_K);
          var7 = var7 - (2 + param2);
          HighscoreSubmission.field_y.setBounds(0, param2, param1 + LoginFormGlobals.field_d.field_K, 256, HighscoreSubmission.field_y.field_K);
          MessageScreen.field_p.setBoundsAndLayout(5, 2, (byte) 118, 487 + (param1 + param5), 5, -5 + var7, param5);
          if (null != PuzzleModePictureHelpers.field_b) {
            PuzzleModePictureHelpers.field_b.setBounds(MessageScreen.field_p.field_K, (byte) 100, MessageScreen.field_p.field_S, MessageScreen.field_p.field_D, MessageScreen.field_p.height);
          }
          var8 = -var6_int + (Cp1252DecodeHelpers.field_i.field_K - param1);
          var9 = var8 / 2;
          var10 = var9 - (-param4 - param1);
          var11 = 0;
          for (var12 = 0; var12 < 6; var12++) {
            if (var12 >= 5 ||
              null != ResourceArchive.field_f[var12]) {
              var13 = (Cp1252DecodeHelpers.field_i.height - 4) * var11 / (TextButton.field_F + 1) + 3;
              var11++;
              var7Lifetime1 = -var13 + (-2 + (3 + var11 * (2 + (Cp1252DecodeHelpers.field_i.height - 6)) / (1 + TextButton.field_F)));
              if (5 <= var12) {
                GradientOutlineTextPainter.field_u.setBounds(var13, var7Lifetime1, var6_int, 256, var8);
              } else {
                ResourceArchive.field_f[var12].setBounds(var13, var7Lifetime1, var6_int, 256, var8);
                CheckboxPainter.field_n[var12].setBounds(0, var7Lifetime1, param1, 256, -param1 + var9);
                ResourceArchive.field_h[var12].setBounds(param3, var7Lifetime1 + (-param3 - param3), var9, 256, param4);
                DelegatingCanvas.field_e[var12].setBounds(param3, -param3 + (-param3 + var7Lifetime1), var10, param0 + 253, var8 - (param1 + var10));
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw ChatMessage.addExceptionContext((Throwable) ((Object) var6), "eh.M(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 != 29731) {
          SocketConnector.floorMod(92, -16, -63);
        }
        field_c = null;
        field_d = null;
        field_f = null;
        field_a = null;
        field_g = null;
    }

    final static Sprite[] loadRgbSpritesByName(String param0, String param1, byte param2, ResourceArchive param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        Sprite[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param3.getGroupId(115, param1);
          var5 = param3.getFileId((byte) -113, param0, var4_int);
          if (param2 != 47) {
            field_g = (String[]) null;
          }
          stackIn_3_0 = SpriteLoadHelpers.loadSprites(param3, var4_int, var5, param2 - 50);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("eh.O(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ChatMessage.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    abstract java.net.Socket connect(int param0) throws IOException;

    final static void stopAudioService(int param0) {
        AudioService.finishAccountUiStep(param0 + 94);
        if (param0 != 5) {
          SocketConnector.stopAudioService(-107);
        }
    }

    final java.net.Socket openSocket(int param0) throws IOException {
        if (param0 != -2) {
          SocketConnector.stopAudioService(-110);
        }
        return new java.net.Socket(this.field_b, this.field_e);
    }

    final static int floorMod(int param0, int param1, int param2) {
        int var3 = -1 + param1 & param0 >> 31;
        if (param2 != -510336929) {
          return 68;
        }
        return var3 + (param0 + (param0 >>> 31)) % param1;
    }

    static {
        field_d = "This option is restricted. Your rating is currently <%0>.<br>Can you achieve the qualifying rating of <%1>?";
        field_g = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    }
}
