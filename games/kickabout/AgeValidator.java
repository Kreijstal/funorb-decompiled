/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AgeValidator extends TextFieldValidator {
    static int[] field_j;

    final static void g(int param0) {
        Object var1 = null;
        int var2 = 0;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        int var5 = 0;
        var4 = Kickabout.field_G;
        try {
          var1 = PlayerModelPreview.field_q;
          synchronized (var1) {
            LineupAgent.field_n = vb.field_b;
            fj.field_c = fj.field_c + 1;
            if (param0 > GzipDecoder.field_d) {
              var5 = 0;
              var2 = var5;
              while (var5 < 112) {
                GameplayHelpScreen.field_G[var5] = false;
                var5++;
              }
              GzipDecoder.field_d = ChatMessage.field_i;
            } else {
              while (GzipDecoder.field_d != ChatMessage.field_i) {
                var2 = mp.field_j[ChatMessage.field_i];
                ChatMessage.field_i = 1 + ChatMessage.field_i & 127;
                if (var2 >= 0) {
                  GameplayHelpScreen.field_G[var2] = true;
                  continue;
                }
                GameplayHelpScreen.field_G[~var2] = false;
              }
            }
            vb.field_b = du.field_j;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var1_ref), "fo.C(" + param0 + ')');
        }
    }

    public static void c(byte param0) {
        field_j = null;
        if (param0 < 16) {
          AgeValidator.c((byte) -116);
        }
    }

    final static void a(boolean param0, int param1, String param2, java.awt.Color param3, int param4) {
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var5 = null;
        RuntimeException var5_ref = null;
        Exception var6 = null;
        int var7 = 0;
        int var8 = 0;
        java.awt.Graphics var9 = null;
        java.awt.Graphics var10 = null;
        try {
          try {
            if (param1 >= -62) {
              field_j = (int[]) null;
            }
            var9 = ic.field_d.getGraphics();
            if (null == ar.field_b) {
              ar.field_b = new java.awt.Font("Helvetica", 1, 13);
            }
            if (param0) {
              var9.setColor(java.awt.Color.black);
              var9.fillRect(0, 0, f.field_d, ReceivedAuctionItem.field_B);
            }
            if (param3 == null) {
              param3 = new java.awt.Color(140, 17, 17);
            }
            try {
              if (bt.field_i == null) {
                bt.field_i = ic.field_d.createImage(304, 34);
              }
              var10 = bt.field_i.getGraphics();
              var10.setColor(param3);
              var10.drawRect(0, 0, 303, 33);
              var10.fillRect(2, 2, param4 * 3, 30);
              var10.setColor(java.awt.Color.black);
              var10.drawRect(1, 1, 301, 31);
              var10.fillRect(2 + 3 * param4, 2, -(3 * param4) + 300, 30);
              var10.setFont(ar.field_b);
              var10.setColor(java.awt.Color.white);
              var10.drawString(param2, (-(param2.length() * 6) + 304) / 2, 22);
              var9.drawImage(bt.field_i, f.field_d / 2 - 152, ReceivedAuctionItem.field_B / 2 - 18, (java.awt.image.ImageObserver) null);
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (Exception) (Object) decompiledCaughtException;
              var7 = f.field_d / 2 - 152;
              var8 = ReceivedAuctionItem.field_B / 2 - 18;
              var9.setColor(param3);
              var9.drawRect(var7, var8, 303, 33);
              var9.fillRect(var7 + 2, 2 + var8, param4 * 3, 30);
              var9.setColor(java.awt.Color.black);
              var9.drawRect(var7 + 1, 1 + var8, 301, 31);
              var9.fillRect(3 * param4 + (2 + var7), 2 + var8, 300 - param4 * 3, 30);
              var9.setFont(ar.field_b);
              var9.setColor(java.awt.Color.white);
              var9.drawString(param2, var7 + (304 - 6 * param2.length()) / 2, var8 + 22);
            }
            if (AuctionsScreen.field_I == null) {
              return;
            }
            var9.setFont(ar.field_b);
            var9.setColor(java.awt.Color.white);
            var9.drawString(AuctionsScreen.field_I, f.field_d / 2 - AuctionsScreen.field_I.length() * 6 / 2, -26 + ReceivedAuctionItem.field_B / 2);
            return;
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var5 = (Exception) (Object) decompiledCaughtException;
            ic.field_d.repaint();
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_21_0 = var5_ref;
          stackIn_21_1 = new StringBuilder().append("fo.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param3 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param4).append(')').toString());
        }
    }

    final ValidationState validateText(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        CharSequence var5 = null;
        ValidationState stackIn_2_0 = null;
        ValidationState stackIn_5_0 = null;
        ValidationState stackIn_10_0 = null;
        ValidationState stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -5) {
            stackIn_2_0 = (ValidationState) null;
            return stackIn_2_0;
          }
          var4 = (CharSequence) ((Object) param0);
          if (!ClubState.a((byte) 15, var4)) {
            stackIn_5_0 = PitchOptionTile.field_Bb;
            return stackIn_5_0;
          }
          var5 = (CharSequence) ((Object) param0);
          var3_int = rr.a(10, var5);
          if (var3_int > 0 &&
            130 >= var3_int) {
            stackIn_12_0 = LobbyPlayerRow.field_yb;
            return stackIn_12_0;
          }
          stackIn_10_0 = PitchOptionTile.field_Bb;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("fo.E(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    AgeValidator(TextInputWidget param0) {
        super(param0);
    }

    final String describeText(byte param0, String param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 25) {
            stackIn_2_0 = (String) null;
            return stackIn_2_0;
          }
          if (this.validateText(param1, -5) != PitchOptionTile.field_Bb) {
            return null;
          }
          stackIn_6_0 = AccountMessagePanel.field_F;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("fo.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    static {
    }
}
