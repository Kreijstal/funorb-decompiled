/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SocialListProtocolSupport {
    static String field_a;
    static String field_d;
    static Sprite field_e;
    static boolean field_c;
    static int field_b;

    public static void releaseStatics(boolean param0) {
        try {
          field_a = null;
          field_d = null;
          field_e = null;
          if (param0) {
            SocialListProtocolSupport.createBinaryFont(60, (byte[]) null);
          }
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "tt.B(" + param0 + ')');
        }
    }

    final static void readSocialListUpdate(byte param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int stackIn_12_0 = 0;
        SocialPlayerRow stackIn_61_0 = null;
        int stackIn_61_1 = 0;
        SocialPlayerRow stackIn_61_2 = null;
        RuntimeException decompiledCaughtException = null;
        CipherPacketBuffer var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3_int = 0;
        Object var3 = null;
        String var4_ref_String = null;
        int var4 = 0;
        String var5 = null;
        SocialPlayerRow var6 = null;
        String var7 = null;
        SocialPlayerRow var7_ref = null;
        String var8 = null;
        int var9 = 0;
        Object var3Lifetime1;
        String var4_ref_StringLifetime1;
        String var5Lifetime1;
        SocialPlayerRow var6Lifetime1;
        var9 = Kickabout.field_G;
        try {
          var1 = ByteArrayPool.field_e;
          var2 = var1.readUnsignedByte((byte) -115);
          if (var2 == 0) {
            if (HighScoreQuery.field_m == null) {
              HighScoreQuery.field_m = new DualLinkHashTable(128);
              StripedProgressBar.field_y = 0;
            }
            stackIn_12_0 = (var1.readUnsignedByte((byte) -110) != 1) ? 0 : 1;
            var3_int = stackIn_12_0;
            var4_ref_String = var1.readString(-118);
            if (var3_int != 0) {
              var5 = var1.readString(-95);
            }
            if (var3_int == 0 ||
              var9 != 0) {
              var5 = var4_ref_String;
            }
            var6 = AchievementsScreen.findSocialPlayerByName(var4_ref_String, 145);
            var7 = var1.readString(-113);
            var8 = MatchAgent.normalizeAccountName(0, (CharSequence) ((Object) var4_ref_String));
            if (null == var8) {
              var8 = var4_ref_String;
            }
            if (var6 == null) {
              var6 = AchievementsScreen.findSocialPlayerByName(var7, 145);
              if (var6 != null) {
                HighScoreQuery.field_m.put(var6, (byte) -4, (long)var8.hashCode());
              }
            }
            if (var6 == null) {
              var6 = new SocialPlayerRow();
              HighScoreQuery.field_m.put(var6, (byte) -4, (long)var8.hashCode());
              fieldTemp$0 = StripedProgressBar.field_y;
              StripedProgressBar.field_y = StripedProgressBar.field_y + 1;
              var6.listIndex = fieldTemp$0;
              SharedChatLayoutSupport.field_b.addLast(var6, 3);
            }
            var6.field_Eb = var7;
            var6.field_yb = var5;
            var6.name = var4_ref_String;
            return;
          }
          if (1 != var2) {
            if (var2 == 2) {
              if (1 == PitchCoordinateSupport.field_d) {
                PitchCoordinateSupport.field_d = 2;
              }
              return;
            }
            if (var2 == 3) {
              if (2 == PitchCoordinateSupport.field_d) {
                PitchCoordinateSupport.field_d = 1;
              }
              return;
            }
            if (var2 == 4) {
              PitchCoordinateSupport.field_d = 1;
              var3 = var1.readString(111);
              BufferedSocket.field_h = ((String) (var3)).intern();
              var4 = var1.readUnsignedByte((byte) -115);
              PlayerSurnameSortCriterion.decodeChatFilters(var4, -1);
              return;
            }
            UnreadMessagesScreen.a("F1: " + ClientUiOverlay.describeCurrentPacket(0), (Throwable) null, 1);
            FormationView.b((byte) -116);
            if (param0 <= 38) {
              field_e = (Sprite) null;
            }
            return;
          }
          if (AvailabilityCheckRequest.field_b == null) {
            AvailabilityCheckRequest.field_b = new DualLinkHashTable(128);
            ListingRow.field_d = 0;
          }
          var3Lifetime1 = var1.readString(-126);
          if (((String) (var3Lifetime1)).equals("")) {
            var3Lifetime1 = null;
          }
          var4_ref_StringLifetime1 = var1.readString(34);
          var5Lifetime1 = var1.readString(-112);
          var6Lifetime1 = ClientUiOverlay.a(var4_ref_StringLifetime1, (byte) 40);
          if (var6Lifetime1 == null) {
            var6Lifetime1 = ClientUiOverlay.a(var5Lifetime1, (byte) 40);
            if (null != var6Lifetime1) {
              AvailabilityCheckRequest.field_b.put(var6Lifetime1, (byte) -4, (long)MatchAgent.normalizeAccountName(0, (CharSequence) ((Object) var4_ref_StringLifetime1)).hashCode());
            }
          }
          if (null == var6Lifetime1) {
            var6Lifetime1 = new SocialPlayerRow();
            AvailabilityCheckRequest.field_b.put(var6Lifetime1, (byte) -4, (long)MatchAgent.normalizeAccountName(0, (CharSequence) ((Object) var4_ref_StringLifetime1)).hashCode());
            fieldTemp$1 = ListingRow.field_d;
            ListingRow.field_d = ListingRow.field_d + 1;
            var6Lifetime1.listIndex = fieldTemp$1;
            GameplayHelpScreen.field_I.addLast(var6Lifetime1, 3);
          }
          if (var3Lifetime1 != null) {
            var3Lifetime1 = ((String) (var3Lifetime1)).intern();
          }
          var6Lifetime1.field_Eb = var5Lifetime1;
          var6Lifetime1.field_zb = (String) (var3Lifetime1);
          var6Lifetime1.name = var4_ref_StringLifetime1;
          var6Lifetime1.unlink((byte) -109);
          var7_ref = (SocialPlayerRow) (GameplayHelpScreen.field_I.first(24009));
          scanLoop1: while (true) {
            boolean decompiledFrameRemainder0 = true;
            if (null != var7_ref) {
              stackIn_61_0 = var7_ref;
              stackIn_61_1 = -21;
              stackIn_61_2 = var6Lifetime1;
              decompiledFrameRemainder0 = (var9 == 0);
              if ((decompiledFrameRemainder0) &&
                (SocialRowOrderSupport.precedesSocialRow(stackIn_61_0, stackIn_61_1, stackIn_61_2))) {
                var7_ref = (SocialPlayerRow) (GameplayHelpScreen.field_I.next(33));
                continue;
              }
            }
            if (decompiledFrameRemainder0) {
              if (null == var7_ref) {
                break scanLoop1;
              }
              stackIn_61_0 = var7_ref;
              stackIn_61_1 = 16737894;
              stackIn_61_2 = var6Lifetime1;
            }
            SocialListLayoutSupport.insertNodeBefore(stackIn_61_0, stackIn_61_1, stackIn_61_2);
            if (var9 == 0) {
              return;
            }
            break;
          }
          GameplayHelpScreen.field_I.addLast(var6Lifetime1, 3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var1_ref), "tt.A(" + param0 + ')');
        }
    }

    final static BinaryBitmapFont createBinaryFont(int param0, byte[] param1) {
        BinaryBitmapFont var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_5_0 = null;
        BinaryBitmapFont stackIn_7_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 12015) {
            SocialListProtocolSupport.createBinaryFont(8, (byte[]) null);
          }
          if (param1 == null) {
            stackIn_5_0 = null;
            return (BinaryBitmapFont) (stackIn_5_0);
          }
          var2 = new BinaryBitmapFont(param1, IsaacRandom.field_f, LoginResponseUiSupport.field_g, MouseInputHandler.field_c, PasswordValidator.field_j, SquadPickerDialog.field_O);
          ScrollContainer.h((byte) -82);
          stackIn_7_0 = var2;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_11_0 = var2_ref;
          stackIn_11_1 = new StringBuilder().append("tt.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    static {
        field_d = "You need <%0> to buy this pitch.";
        field_a = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
        field_b = 70;
    }
}
