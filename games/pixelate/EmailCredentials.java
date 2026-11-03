/*
 * Decompiled by CFR-JS 0.4.0.
 */
class EmailCredentials extends LoginCredentials {
    private long field_g;
    static boolean field_f;
    private String field_j;
    static Sprite[] field_h;
    static Sprite field_i;
    static int field_k;

    final static int c(int param0) {
        int var1 = -70 % ((param0 - 39) / 33);
        return nf.field_c;
    }

    ea getCredentialKind(int param0) {
        if (param0 != -27096) {
          return (ea) null;
        }
        return QuickChatMenu.field_Nb;
    }

    final static boolean a(int param0, int param1, int param2) {
        StringBuilder discarded$0 = null;
        int var3;
        int var4;
        String var5_ref_String;
        int var5;
        int var6;
        String var8;
        int var10;
        int var11;
        int var12;
        String var13;
        String var14;
        String var15;
        String var16;
        String var17;
        String var32;
        String var33;
        String var34;
        String var35;
        String var36;
        String var37;
        String var38;
        String var39;
        String var40;
        String var41;
        Object var42;
        Object var43;
        CharSequence var44;
        int var6Lifetime1;
        String var8Lifetime1;
        String var8Lifetime2;
        String var8Lifetime1Lifetime1;
        String var8Lifetime1Lifetime2;
        String var8Lifetime1Lifetime3;
        String var8Lifetime1Lifetime4;
        String var8Lifetime1Lifetime5;
        String var8Lifetime1Lifetime6;
        var42 = null;
        var43 = null;
        var12 = Pixelate.field_H ? 1 : 0;
        var3 = 1;
        if (!MatchingTextValidator.field_z &&
          LoadingProgressDialog.field_eb == null) {
          var3 = 0;
        }
        var4 = 30 / ((param1 - 90) / 34);
        if (ce.field_d == 0 &&
          DraggableWidget.field_S != null) {
          var3 = 0;
        }
        if (ce.field_d == 2 &&
          !ra.a((byte) -96)) {
          var3 = 0;
        }
        if (ke.field_a == 84) {
          if (var3 != 0) {
            if (mp.field_a.length() > 0) {
              var5_ref_String = mp.field_a.toString();
              var8 = var5_ref_String;
              var8Lifetime2 = var5_ref_String;
              if (EmailValidator.a(var5_ref_String, 1)) {
                var14 = (String) null;
                var13 = (String) null;
                MidiPcmStream.a(0, (String) null, (String) null, (byte) -76, 2, mp.field_c);
                var16 = (String) null;
                var15 = (String) null;
                MidiPcmStream.a(0, (String) null, (String) null, (byte) -21, 2, fd.field_d);
                nd.a((byte) -23);
                return true;
              }
              var6 = ce.field_d;
              if (var6 == 0 &&
                io.field_c != null) {
                var6 = 1;
              }
              if (IterableNodeHashTable.a(var6, 0) == 2) {
                Js5ArchiveManager.a(1, -26931, var6, param2);
              }
              dg.a(true, ce.field_d, -1, var5_ref_String, CheckboxPainter.field_k, param0);
              nd.a((byte) -23);
            } else {
              nd.a((byte) -23);
            }
          } else {
            if (ce.field_d == 0) {
              return true;
            }
            nd.a((byte) 77);
          }
          return true;
        }
        if (ke.field_a == 85) {
          if (var3 == 0) {
            return true;
          }
          if (mp.field_a.length() <= 0) {
            return true;
          }
          nk.a(mp.field_a, -1 + mp.field_a.length(), ' ', 16736352);
          return true;
        }
        var5 = DualLinkDeque.field_f;
        if (!MatchController.isSupportedChar(1, (char) var5)) {
          return false;
        }
        if (var3 == 0) {
          return true;
        }
        if (mp.field_a.length() >= 80) {
          return true;
        }
        regionExit1: {
          discarded$0 = mp.field_a.append((char) var5);
          var6Lifetime1 = 485;
          var32 = ModalStack.field_J;
          var8Lifetime1 = var32;
          var8Lifetime1Lifetime1 = var32;
          var17 = th.a(2, var32);
          var8Lifetime1Lifetime2 = var17;
          var8Lifetime1Lifetime3 = var17;
          var33 = var17;
          var8Lifetime1Lifetime4 = var33;
          var8Lifetime1Lifetime5 = var33;
          if (2 != ce.field_d) {
            var8Lifetime1Lifetime6 = "";
            if (ce.field_d == 0) {
              if (io.field_c == null &&
                ge.field_f) {
                var8Lifetime1Lifetime6 = "[" + TimerBar.field_m + "] ";
              }
              if (io.field_c == null) {
                var34 = var8Lifetime1Lifetime6 + var33 + ": ";
                var6Lifetime1 = var6Lifetime1 - AccountMessagePanel.field_Q.textWidth(var34);
                break regionExit1;
              }
              if (!TickClock.field_b) {
                var37 = "[" + AlphaContainer.a(HowToPlayScreen.field_q, 49, new String[]{io.field_c.field_pc}) + "] ";
                var38 = var37 + var33 + ": ";
                var6Lifetime1 = var6Lifetime1 - AccountMessagePanel.field_Q.textWidth(var38);
                break regionExit1;
              }
              if (TextLayoutLine.field_f == null) {
                var35 = "[" + AlphaContainer.a(HowToPlayScreen.field_q, 49, new String[]{io.field_c.field_pc}) + "] ";
                var36 = var35 + var33 + ": ";
                var6Lifetime1 = var6Lifetime1 - AccountMessagePanel.field_Q.textWidth(var36);
                break regionExit1;
              }
              var8Lifetime1Lifetime6 = "[" + TextLayoutLine.field_f + "] ";
            }
            var39 = var8Lifetime1Lifetime6 + var33 + ": ";
            var6Lifetime1 = var6Lifetime1 - AccountMessagePanel.field_Q.textWidth(var39);
            break regionExit1;
          }
          var44 = (CharSequence) ((Object) CheckboxPainter.field_k);
          var40 = AlphaContainer.a(dg.field_b, 116, new String[]{UiComponent.a(var44, -1)});
          var41 = AlphaContainer.a(sk.field_c, 43, new String[]{var17});
          var10 = AccountMessagePanel.field_Q.textWidth(var40);
          var11 = AccountMessagePanel.field_Q.textWidth(var41);
          if (var11 >= var10) {
            var6Lifetime1 = var6Lifetime1 - var11;
          } else {
            var6Lifetime1 = var6Lifetime1 - var10;
          }
        }
        if (AccountMessagePanel.field_Q.textWidth(mp.field_a.toString()) <= var6Lifetime1) {
          return true;
        }
        nk.a(mp.field_a, -1 + mp.field_a.length(), ' ', 16736352);
        return true;
    }

    final void a(byte param0, PacketBuffer param1) {
        try {
          if (param0 != -12) {
            this.field_g = -108L;
          }
          param1.writeLong(false, this.field_g);
          param1.writeBase38Name(-129, this.field_j);
        } catch (RuntimeException runtimeException) {
          throw aa.addExceptionContext((Throwable) ((Object) runtimeException), "go.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        field_i = null;
        field_h = null;
        if (param0 < 44) {
          field_k = 89;
        }
    }

    final static wm a(int param0, int param1) {
        int var3 = 0;
        wm[] var2;
        int var4;
        wm[] var5;
        var4 = Pixelate.field_H ? 1 : 0;
        if (param1 > -50) {
          return (wm) null;
        }
        var5 = Puzzle.b((byte) 62);
        var2 = var5;
        for (var3 = 0; var5.length > var3; var3++) {
          if (var5[var3].field_b == param0) {
            return var5[var3];
          }
        }
        return null;
    }

    EmailCredentials(long param0, String param1) {
        try {
          this.field_j = param1;
          this.field_g = param0;
        } catch (RuntimeException runtimeException) {
          throw aa.addExceptionContext((Throwable) ((Object) runtimeException), "go.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
