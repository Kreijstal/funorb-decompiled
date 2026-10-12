/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ea {
    static String field_b;
    TabbedPanel field_a;
    static String field_d;
    static String field_c;

    final static String a(int param0, CharSequence param1) {
        int var4 = 0;
        int var2_int = 0;
        char[] var3 = null;
        int var5 = 0;
        int var6 = 0;
        char[] var7 = null;
        char[] var8 = null;
        String stackIn_23_0 = null;
        String stackIn_25_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var2_int = param1.length();
          if (var2_int > 20) {
            var2_int = 20;
          }
          var8 = new char[var2_int];
          var7 = var8;
          var3 = var7;
          for (var4 = 0; var2_int > var4; var4++) {
            var5 = param1.charAt(var4);
            if (var5 >= 65 &&
              var5 <= 90) {
              var3[var4] = (char)(var5 + 32);
            } else if ((var5 < 97 ||
              var5 > 122) &&
              (var5 < 48 ||
              var5 > 57)) {
              var3[var4] = (char)95;
            } else {
              var3[var4] = (char)var5;
            }
          }
          if (param0 == -1212) {
            stackIn_25_0 = new String(var8);
            return stackIn_25_0;
          }
          stackIn_23_0 = (String) null;
          return stackIn_23_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_28_0 = var2;
          stackIn_28_1 = new StringBuilder().append("ea.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
        }
    }

    final static ChatMessage a(byte param0, boolean param1) {
        boolean stackIn_3_0 = false;
        int stackIn_9_0 = 0;
        int[] stackIn_22_0 = null;
        Throwable decompiledCaughtException = null;
        CipherPacketBuffer var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        CipherPacketBuffer var8 = null;
        QuickChatPhrase var9 = null;
        var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        var8 = ByteStorage.incomingPacket;
        var2 = var8;
        var3 = var8.readUnsignedByte(0);
        stackIn_3_0 = (0 != (var3 & 128));
        DualNodeDeque.field_b = stackIn_3_0;
        MatchConditionEntry.field_k = var3 & 127;
        hc.field_e = var8.readUnsignedByte(0);
        gk.field_I = var8.j((byte) -2);
        if (2 == MatchConditionEntry.field_k) {
          rh.field_e = var8.readUnsignedShort((byte) -104);
          th.field_c = var8.d((byte) -13);
        } else {
          rh.field_e = 0;
          th.field_c = 0;
        }
        stackIn_9_0 = (var8.readUnsignedByte(0) != 1) ? 0 : 1;
        var4 = stackIn_9_0;
        qd.field_L = var8.readNullTerminatedString(1);
        if (var4 == 0) {
          gp.field_b = qd.field_L;
        } else {
          gp.field_b = var8.readNullTerminatedString(1);
        }
        if (MatchConditionEntry.field_k == 1) {
          ut.field_eb = var8.readUnsignedShort((byte) -104);
          BestScoreStrategy.field_k = var8.readNullTerminatedString(1);
        } else {
          if (MatchConditionEntry.field_k == 4) {
            ut.field_eb = var8.readUnsignedShort((byte) -104);
            BestScoreStrategy.field_k = var8.readNullTerminatedString(1);
          } else {
            ut.field_eb = 0;
            BestScoreStrategy.field_k = null;
          }
        }
        if (!param1) {
          dg.field_b = le.readCompressedChatText(80, (byte) -25, var8);
          hv.field_R = null;
        } else {
          var5 = var8.readUnsignedShort((byte) -104);
          try {
            var9 = ce.quickChatPhrases.getPhrase(var5, -124);
            dg.field_b = var9.getPreviewText((byte) 97);
            if (gp.field_b.equals(mv.localAccountName)) {
              stackIn_22_0 = null;
            } else {
              stackIn_22_0 = var9.linkedPhraseIds;
            }
            hv.field_R = stackIn_22_0;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (Exception) (Object) decompiledCaughtException;
            af.a((Throwable) ((Object) var6), -120, "CC1");
            hv.field_R = null;
            dg.field_b = null;
          }
        }
        var5 = -17 / ((param0 - 47) / 42);
        return new ChatMessage(param1);
    }

    final static pf a(int param0, java.applet.Applet param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        pf[] var3 = null;
        int var4 = 0;
        pf var5 = null;
        int var6 = 0;
        pf stackIn_3_0 = null;
        pf stackIn_8_0 = null;
        pf stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var2 = fk.a((byte) 102, param1, "jagex-last-login-method");
          if (var2 == null) {
            stackIn_3_0 = MatchConditionEntry.field_l;
            return stackIn_3_0;
          }
          var3 = TileMetadata.c(0);
          var4 = param0;
          while (true) {
            if (var4 >= var3.length) {
              stackIn_11_0 = MatchConditionEntry.field_l;
              return stackIn_11_0;
            }
            var5 = var3[var4];
            if (!var5.a((byte) -106, var2)) {
              var4++;
              continue;
            }
            break;
          }
          stackIn_8_0 = var5;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_14_0 = var2_ref;
          stackIn_14_1 = new StringBuilder().append("ea.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final void a(int param0, byte param1, int param2, int param3, int param4) {
        int var6 = 24;
        int var7 = 5;
        if (param1 > -117) {
          ea.$cfr$intArgs$a$72f70aa7c69d(-115, true);
        }
        this.field_a.setLayout(param3, param4, param2, var7, 0, var6, param0);
        bn.field_c.setBounds(jn.field_d, -20500, su.field_d.width, 0, 0);
        wn.field_kb.setBounds(18, -20500, -2 + (-2 + su.field_d.width + (-jn.field_c - 80)), 2 + jn.field_d, 0);
        ek.field_a.setBounds(18, -20500, 82 + jn.field_c, jn.field_d + 2, -82 + (su.field_d.width - jn.field_c));
        mw.field_E.setLayout(0, jn.field_c, 2, 20, su.field_d.width, 20 + (2 + jn.field_d), -2 + (su.field_d.height - jn.field_d) - 20, (byte) -92);
        TaggedMapData.field_g.layoutControls((byte) -110, jn.field_c, 20, 2);
    }

    ea(String param0, ClientUiComponent param1) {
        String[] var3 = null;
        ClientUiComponent[] var4 = null;
        try {
          var3 = new String[]{param0, IterableDualNodeDeque.field_a, op.field_e};
          var4 = new ClientUiComponent[]{param1, su.field_d, (ClientUiComponent) ((Object) TaggedMapData.field_g)};
          this.field_a = new TabbedPanel(0L, h.field_d, var3, wm.field_c, var4, 0);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "ea.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        int var1 = 43 % ((19 - param0) / 38);
        field_d = null;
    }

    static {
        field_d = "<%0> has joined your game.";
        field_c = "Passwords can only contain letters and numbers";
        field_b = "Magical incantations to instantly change the tide of battle.";
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static ChatMessage $cfr$intArgs$a$72f70aa7c69d(int param0, boolean param1) {
        boolean stackIn_3_0 = false;
        int stackIn_9_0 = 0;
        int[] stackIn_22_0 = null;
        Throwable decompiledCaughtException = null;
        CipherPacketBuffer var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        CipherPacketBuffer var8 = null;
        QuickChatPhrase var9 = null;
        var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        var8 = ByteStorage.incomingPacket;
        var2 = var8;
        var3 = var8.readUnsignedByte(0);
        stackIn_3_0 = (0 != (var3 & 128));
        DualNodeDeque.field_b = stackIn_3_0;
        MatchConditionEntry.field_k = var3 & 127;
        hc.field_e = var8.readUnsignedByte(0);
        gk.field_I = var8.j((byte) -2);
        if (2 == MatchConditionEntry.field_k) {
          rh.field_e = var8.readUnsignedShort((byte) -104);
          th.field_c = var8.d((byte) -13);
        } else {
          rh.field_e = 0;
          th.field_c = 0;
        }
        stackIn_9_0 = (var8.readUnsignedByte(0) != 1) ? 0 : 1;
        var4 = stackIn_9_0;
        qd.field_L = var8.readNullTerminatedString(1);
        if (var4 == 0) {
          gp.field_b = qd.field_L;
        } else {
          gp.field_b = var8.readNullTerminatedString(1);
        }
        if (MatchConditionEntry.field_k == 1) {
          ut.field_eb = var8.readUnsignedShort((byte) -104);
          BestScoreStrategy.field_k = var8.readNullTerminatedString(1);
        } else {
          if (MatchConditionEntry.field_k == 4) {
            ut.field_eb = var8.readUnsignedShort((byte) -104);
            BestScoreStrategy.field_k = var8.readNullTerminatedString(1);
          } else {
            ut.field_eb = 0;
            BestScoreStrategy.field_k = null;
          }
        }
        if (!param1) {
          dg.field_b = le.readCompressedChatText(80, (byte) -25, var8);
          hv.field_R = null;
        } else {
          var5 = var8.readUnsignedShort((byte) -104);
          try {
            var9 = ce.quickChatPhrases.getPhrase(var5, -124);
            dg.field_b = var9.getPreviewText((byte) 97);
            if (gp.field_b.equals(mv.localAccountName)) {
              stackIn_22_0 = null;
            } else {
              stackIn_22_0 = var9.linkedPhraseIds;
            }
            hv.field_R = stackIn_22_0;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (Exception) (Object) decompiledCaughtException;
            af.a((Throwable) ((Object) var6), -120, "CC1");
            hv.field_R = null;
            dg.field_b = null;
          }
        }
        var5 = -17 / ((param0 - 47) / 42);
        return new ChatMessage(param1);
    }
}
