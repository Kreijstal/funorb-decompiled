/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class AccountIntroductionPanel extends WidgetGroup implements WidgetActionListener {
    static AccountResponse field_H;
    private FocusableWidget backButton;
    private FocusableWidget createAccountButton;
    static String[] field_L;
    private FocusableWidget guestPlayButton;

    final static ff a(long param0, int param1, boolean param2, String param3, String param4) {
        RuntimeException var6 = null;
        String var7 = null;
        cm stackIn_7_0 = null;
        eb stackIn_9_0 = null;
        bo stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 20) {
            var7 = (String) null;
            AccountIntroductionPanel.a(-13L, 34, false, (String) null, (String) null);
          }
          if (0L == param0 &&
            param4 != null) {
            stackIn_9_0 = new eb(param4, param3);
            return (ff) ((Object) stackIn_9_0);
          }
          if (!param2) {
            stackIn_11_0 = new bo(param0, param3);
            return (ff) ((Object) stackIn_11_0);
          }
          stackIn_7_0 = new cm(param0, param3);
          return (ff) ((Object) stackIn_7_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_14_0 = var6;
          stackIn_14_1 = new StringBuilder().append("he.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param4 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    public AccountIntroductionPanel() {
        super(0, 0, 476, 225, (WidgetRenderer) null);
        this.createAccountButton = new FocusableWidget(CheckboxWidgetRenderer.field_a, (WidgetListener) null);
        this.backButton = new FocusableWidget(ByteArrayNode.field_l, (WidgetListener) null);
        this.guestPlayButton = new FocusableWidget(nd.field_d, (WidgetListener) null);
        ButtonWidgetRenderer var1 = new ButtonWidgetRenderer();
        this.createAccountButton.renderer = (WidgetRenderer) ((Object) var1);
        this.backButton.renderer = (WidgetRenderer) ((Object) var1);
        this.guestPlayButton.renderer = (WidgetRenderer) ((Object) var1);
        int var2 = 4;
        int var3 = 326;
        int var4 = -var2 + var3 >> 1;
        this.backButton.setBounds(30, this.width - var3 >> 1, this.height + (-48 - var2), (byte) -119, var4);
        this.guestPlayButton.setBounds(30, (-var3 + this.width >> 1) + (var4 + var2), -var2 + (-48 + this.height), (byte) -119, var4);
        this.createAccountButton.setBounds(30, this.width - var3 >> 1, this.height - (78 + var2 * 2), (byte) -119, var3);
        this.backButton.listener = (WidgetListener) (this);
        this.createAccountButton.listener = (WidgetListener) (this);
        this.createAccountButton.tooltip = MidiSynthesizer.field_q;
        this.guestPlayButton.listener = (WidgetListener) (this);
        this.guestPlayButton.tooltip = SoundCache.field_i;
        this.addChild(this.backButton, true);
        this.addChild(this.createAccountButton, true);
        this.addChild(this.guestPlayButton, true);
    }

    final static void a(PacketBuffer param0, byte param1) {
        try {
          int var4 = 0;
          RuntimeException runtimeException = null;
          byte[] var2 = null;
          int var3_int = 0;
          Exception var3 = null;
          int var5 = 0;
          byte[] var6 = null;
          byte[] var7 = null;
          byte[] var8 = null;
          byte[] var9 = null;
          byte[] var10 = null;
          RuntimeException stackIn_21_0 = null;
          StringBuilder stackIn_21_1 = null;
          String stackIn_22_2 = null;
          Throwable decompiledCaughtException = null;
          var5 = BrickABrac.field_J ? 1 : 0;
          try {
            var9 = new byte[24];
            var7 = var9;
            var6 = var7;
            var10 = var6;
            var8 = var10;
            var2 = var8;
            if (go.field_a != null) {
              try {
                go.field_a.seek(0, 0L);
                go.field_a.readFully(var9, (byte) -29);
                for (var3_int = 0; var3_int < 24; var3_int++) {
                  if (var10[var3_int] == 0) {
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
            if (param1 > -41) {
              field_H = (AccountResponse) null;
            }
            param0.writeBytes(var10, -1, 0, 24);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            runtimeException = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_21_0 = runtimeException;
            stackIn_21_1 = new StringBuilder().append("he.B(");
            if (param0 == null) {
              stackIn_22_2 = "null";
            } else {
              stackIn_22_2 = "{...}";
            }
            throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean handleWidgetKey(int keyCode, byte obfuscationGuard, Widget focusRoot, char character) {
        RuntimeException var5 = null;
        boolean stackIn_5_0 = false;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.handleWidgetKey(keyCode, obfuscationGuard, focusRoot, character)) {
            return true;
          }
          if (98 == keyCode) {
            stackIn_5_0 = this.b(focusRoot, (byte) 117);
            return stackIn_5_0;
          }
          if (99 != keyCode) {
            return false;
          }
          stackIn_8_0 = this.a(focusRoot, (byte) -116);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("he.T(").append(keyCode).append(',').append(obfuscationGuard).append(',');
          if (focusRoot == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(character).append(')').toString());
        }
    }

    final static String a(CharSequence param0, int param1) {
        int var4 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var5 = 0;
        int var6 = 0;
        char[] var7 = null;
        char[] var8 = null;
        String stackIn_21_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = BrickABrac.field_J ? 1 : 0;
        try {
          var2_int = param0.length();
          if (20 < var2_int) {
            var2_int = 20;
          }
          var8 = new char[var2_int];
          var7 = var8;
          var3 = var7;
          if (param1 != -58) {
            field_H = (AccountResponse) null;
          }
          for (var4 = 0; var4 < var2_int; var4++) {
            var5 = param0.charAt(var4);
            if (var5 >= 65 &&
              90 >= var5) {
              var3[var4] = (char)(-65 + (var5 + 97));
            } else if ((var5 < 97 ||
              var5 > 122) &&
              (var5 < 48 ||
              var5 > 57)) {
              var3[var4] = (char)95;
            } else {
              var3[var4] = (char)var5;
            }
          }
          stackIn_21_0 = new String(var8);
          return stackIn_21_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_24_0 = var2;
          stackIn_24_1 = new StringBuilder().append("he.E(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void onAction(int pointerY, int button, byte obfuscationGuard, int pointerX, FocusableWidget widget) {
        int var7 = 0;
        PacketBuffer var8 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = BrickABrac.field_J ? 1 : 0;
        try {
          if (obfuscationGuard > -22) {
            var8 = (PacketBuffer) null;
            AccountIntroductionPanel.a((PacketBuffer) null, (byte) -62);
          }
          if (this.backButton == widget) {
            MotionWaypoint.d(-117);
          } else {
            if (this.createAccountButton == widget) {
              Mesh3D.d(-1);
            } else {
              if (widget == this.guestPlayButton) {
                NewAchievementsScreen.f(967);
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_12_0 = var6;
          stackIn_12_1 = new StringBuilder().append("he.Q(").append(pointerY).append(',').append(button).append(',').append(obfuscationGuard).append(',').append(pointerX).append(',');
          if (widget == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_H = null;
        if (param0 != 36) {
          field_H = (AccountResponse) null;
        }
        field_L = null;
    }

    final static void a(String param0, boolean param1, byte param2) {
        try {
          if (param2 <= 18) {
            field_H = (AccountResponse) null;
          }
          sm.field_b = AccountResponse.field_b;
          ln.field_k = param1 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "he.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void drawLayer(int parentY, int parentX, int layer, byte obfuscationGuard) {
        int var5 = this.x + parentX;
        int var6 = parentY + this.y;
        ArchiveNetworkClient.field_u.a(PlayerNameChooserPanel.field_H, var5 + 20, 20 + var6, this.width - 40, -50 + this.height, 16777215, -1, 1, 0, ArchiveNetworkClient.field_u.ascent);
        super.drawLayer(parentY, parentX, layer, obfuscationGuard);
    }

    static {
        field_L = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
    }
}
