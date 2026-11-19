/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class SpriteButtonPainter extends WidgetPainter {
    static ResourceArchive bossSoundArchive;
    static int field_r;
    static int field_s;
    private Sprite[] field_x;
    static Sprite field_w;
    private int field_p;
    private int field_t;
    private int field_q;
    static String field_v;

    final static void closeCacheResources(int param0) {
        try {
          int var1_int = 0;
          IOException iOException = null;
          int var3 = 0;
          java.applet.Applet var4 = null;
          Throwable decompiledCaughtException = null;
          RuntimeException var1 = null;
          IOException var2 = null;
          var3 = wizardrun.field_H;
          try {
            if (param0 != 1) {
              var4 = (java.applet.Applet) null;
              SpriteButtonPainter.appendChangedSessionParameters(74, (java.net.URL) null, (java.applet.Applet) null);
            }
            if (null != NameAvailabilityFactory.field_f) {
              NameAvailabilityFactory.field_f.close((byte) -96);
            }
            if (null != CacheEntry.field_q) {
              CacheEntry.field_q.shutdown((byte) 79);
            }
            if (null != MusicPatchLoader.field_e) {
              try {
                MusicPatchLoader.field_e.close(-1);
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                iOException = (IOException) (Object) decompiledCaughtException;
              }
            }
            if (SocketJs5Transport.field_o != null) {
              for (var1_int = 0; var1_int < SocketJs5Transport.field_o.length; var1_int++) {
                if (null != SocketJs5Transport.field_o[var1_int]) {
                  try {
                    SocketJs5Transport.field_o[var1_int].close(-1);
                  } catch (java.io.IOException decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    var2 = (IOException) (Object) decompiledCaughtException;
                  }
                }
              }
              return;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var1 = (RuntimeException) (Object) decompiledCaughtException;
            throw ExceptionSupport.wrapException((Throwable) ((Object) var1), "jl.V(" + param0 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static java.net.URL appendChangedSessionParameters(int param0, java.net.URL param1, java.applet.Applet param2) {
        Object var3 = null;
        Object var4 = null;
        java.net.URL stackIn_11_0 = null;
        Object stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = null;
          var4 = null;
          if (null != EncryptedLoginHelpers.field_f &&
            !EncryptedLoginHelpers.field_f.equals(param2.getParameter("settings"))) {
            var3 = EncryptedLoginHelpers.field_f;
            var4 = var3;
            var4 = var3;
          }
          if (null != AccountCreationForm.field_M &&
            !AccountCreationForm.field_M.equals(param2.getParameter("session"))) {
            var4 = AccountCreationForm.field_M;
          }
          if (param0 > -60) {
            SpriteButtonPainter.releaseStatics(-41);
          }
          stackIn_11_0 = GameApplet.rewriteAppletUrl(121, -1, (String) (var4), param1, (String) (var3));
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("jl.BA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) (stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final static void configureMenuOptionFrames(int param0, int param1, int param2, NineSliceFrame param3, NineSliceFrame param4, int param5) {
        try {
          EditableTextWidget.field_N = param4;
          if (param0 > -104) {
            java.applet.Applet var7 = (java.applet.Applet) null;
            SpriteButtonPainter.appendChangedSessionParameters(4, (java.net.URL) null, (java.applet.Applet) null);
          }
          ThreePieceFrameHelpers.field_d = param2;
          Js5Transport.field_e = param1;
          CheckboxPainter.field_h = param5;
          EditableTextWidget.field_S = param3;
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "jl.AA(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    public final void drawWidget(int param0, int param1, UiWidget param2, boolean param3, boolean param4) {
        int stackIn_6_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        java.applet.Applet var9 = null;
        try {
          if (!param2.hovered) {
            stackIn_6_0 = (param2.isFocused((byte) 53)) ? 1 : 0;
          } else {
            stackIn_6_0 = 1;
          }
          var6_int = stackIn_6_0;
          if (!param3) {
            var9 = (java.applet.Applet) null;
            SpriteButtonPainter.appendChangedSessionParameters(83, (java.net.URL) null, (java.applet.Applet) null);
          }
          if (param2 instanceof TextButton) {
            param4 = param4 & ((TextButton) (param2)).field_B;
          }
          if (!param4) {
            stackIn_15_0 = this.field_t;
          } else {
            if (var6_int == 0) {
              stackIn_15_0 = this.field_p;
            } else {
              stackIn_15_0 = this.field_q;
            }
          }
          var7 = stackIn_15_0;
          stackIn_18_0 = (param4) ? 16777215 : 7105644;
          var8 = stackIn_18_0;
          ThreePieceFrameHelpers.drawRecoloredThreePieceFrame(this.field_x, (param2.height - this.field_x[0].fullHeight >> 1) + (param2.y + param1), var7, (byte) 118, param0 + param2.x, param2.width);
          this.field_k.drawParagraph(param2.text, param0 + param2.x, -2 + param2.y + param1, param2.width, param2.height, var8, -1, 1, 1, this.field_k.field_M);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_22_0 = var6;
          stackIn_22_1 = new StringBuilder().append("jl.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static WidgetTheme getDefaultWidgetTheme(int param0) {
        if (CharSequenceJoiner.field_b == null) {
          CharSequenceJoiner.field_b = new WidgetTheme();
          CharSequenceJoiner.field_b.initializeTheme(Crc32Helpers.field_b, -120);
          CharSequenceJoiner.field_b.field_e = 7697781;
          CharSequenceJoiner.field_b.field_g = ThreePieceFrameHelpers.field_b;
          CharSequenceJoiner.field_b.field_h = 4;
          CharSequenceJoiner.field_b.field_t = 14;
          CharSequenceJoiner.field_b.field_p = 2763306;
          CharSequenceJoiner.field_b.field_l = 6;
          CharSequenceJoiner.field_b.field_i = 5;
          CharSequenceJoiner.field_b.field_r = 0;
        }
        if (param0 != 4) {
          field_w = (Sprite) null;
        }
        return CharSequenceJoiner.field_b;
    }

    public static void releaseStatics(int param0) {
        if (param0 != 2763306) {
          field_w = (Sprite) null;
        }
        field_w = null;
        bossSoundArchive = null;
        field_v = null;
    }

    private SpriteButtonPainter(int param0, int param1, int param2) {
        this.field_k = PacketBuffer.field_i;
        this.field_t = param2;
        this.field_p = param0;
        this.field_q = param1;
        this.field_x = RankingStatsRequest.field_j;
    }

    public SpriteButtonPainter() {
        this(2188450, 2591221, 9543);
    }

    static {
        field_r = 20;
        field_v = "Account created successfully!";
    }
}
