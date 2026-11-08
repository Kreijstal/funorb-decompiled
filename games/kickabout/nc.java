/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nc {
    static boolean field_a;
    static String field_c;
    static String field_d;
    static String field_b;

    final static void a(CommonGame param0, byte param1, int param2, boolean param3) {
        int var6 = 0;
        CoverageBitmapFont var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        CoverageBitmapFont var9 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        var8 = Kickabout.field_G;
        try {
          ContextMenuItem.field_Cb = param2;
          vt.field_c = param0;
          JaggrabDownloader.field_c = param3;
          var9 = un.field_d;
          var4 = var9;
          TrinketPickerDialog.field_G = new String[vt.field_c.playerCount];
          var5 = 0;
          for (var6 = 0; var6 < vt.field_c.playerCount; var6++) {
            TrinketPickerDialog.field_G[var6] = vt.field_c.field_S[var6].toLowerCase();
            var7 = ((BitmapFont) ((Object) var9)).a(TrinketPickerDialog.field_G[var6]);
            if (var7 > var5) {
              var5 = var7;
            }
          }
          TextPromptDialog.field_yb = -8 + ((BitmapFont) ((Object) var4)).field_G + ((BitmapFont) ((Object) var4)).field_p;
          et.field_c = 18 + var5 + 20;
          if (param1 != -85) {
            return;
          }
          VertexNormal.field_c = TextPromptDialog.field_yb + 6;
          if (100 > et.field_c) {
            et.field_c = 100;
          }
          LookupRecordUpdate.b(22);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_19_0 = var4_ref;
          stackIn_19_1 = new StringBuilder().append("nc.C(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(boolean param0, boolean param1, LoginCredentials param2, int param3, int param4) {
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        String var7 = null;
        try {
          UrlRequest.field_f[0] = TrinketUnlockNotice.field_d.nextInt();
          UrlRequest.field_f[1] = TrinketUnlockNotice.field_d.nextInt();
          InstrumentEnvelope.field_a.field_n = 0;
          UrlRequest.field_f[3] = (int)ld.field_c;
          UrlRequest.field_f[2] = (int)(ld.field_c >> 32);
          InstrumentEnvelope.field_a.writeInt(-116, UrlRequest.field_f[0]);
          InstrumentEnvelope.field_a.writeInt(-55, UrlRequest.field_f[1]);
          InstrumentEnvelope.field_a.writeInt(-92, UrlRequest.field_f[2]);
          InstrumentEnvelope.field_a.writeInt(-102, UrlRequest.field_f[3]);
          qr.a(param3 ^ -16185, InstrumentEnvelope.field_a);
          InstrumentEnvelope.field_a.writeShort(param3 ^ 1207442647, param4);
          param2.writeCredentials(InstrumentEnvelope.field_a, param3 + 33214);
          if (param3 != -16161) {
            field_d = (String) null;
          }
          or.field_d.field_n = 0;
          if (!param1) {
            or.field_d.writeByte(102, 16);
          } else {
            or.field_d.writeByte(126, 18);
          }
          or.field_d.field_n = or.field_d.field_n + 2;
          var5_int = or.field_d.field_n;
          or.field_d.writeInt(-116, ResizableModalPanel.field_J);
          or.field_d.writeLong(il.field_f, param3 ^ 1781875959);
          var6 = 0;
          if (GrowableIntList.field_c) {
            var6 = var6 | 1;
          }
          if (ParticipantAgent.field_n) {
            var6 = var6 | 4;
          }
          if (param0) {
            var6 = var6 | 8;
          }
          if (BroadcastServerCommand.field_A != null) {
            var6 = var6 | 16;
          }
          or.field_d.writeByte(103, var6);
          var7 = DelegatingCanvas.a(so.a(param3 ^ 16246), (byte) 116);
          if (var7 == null) {
            var7 = "";
          }
          or.field_d.writeString(14190, var7);
          if (BroadcastServerCommand.field_A != null) {
            or.field_d.writeCircumfixedString(BroadcastServerCommand.field_A, (byte) -127);
          }
          IconLabel.a(ManagerAction.field_h, or.field_d, (byte) -116, InstrumentEnvelope.field_a, CascadingMenu.field_Nb);
          or.field_d.backpatchShortLength(or.field_d.field_n - var5_int, 62);
          c.a(-1, false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_26_0 = var5;
          stackIn_26_1 = new StringBuilder().append("nc.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void releaseStatics(byte param0) {
        field_c = null;
        field_b = null;
        int var1 = 48 % ((-12 - param0) / 49);
        field_d = null;
    }

    static {
        field_a = false;
        field_b = "My Auctions";
        field_d = "A detailed explanation of each rule can be found through the link on our website.<br>(in the Help Section)";
        field_c = "Invite";
    }
}
