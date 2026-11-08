/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tl {
    static String field_b;
    static r field_c;
    static String[] field_a;

    public static void releaseStatics(int param0) {
        field_b = null;
        field_c = null;
        field_a = null;
        if (param0 != 0) {
          field_c = (r) null;
        }
    }

    final static int a(int param0) {
        if (param0 >= -115) {
          return -7;
        }
        return TextHotspotWidget.field_M;
    }

    final static void b(int param0) {
        int var8_int = 0;
        int var19 = 0;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        ni var4 = null;
        sm var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        String[][] var8 = null;
        String[][] var9 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var20 = 0;
        String var21 = null;
        long var22 = 0L;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        CipherPacketBuffer var28 = null;
        long[][] var35 = null;
        int[][] var36 = null;
        int var3Lifetime1;
        int var25Lifetime1;
        int var25Lifetime2;
        var26 = Kickabout.field_G;
        try {
          var28 = un.field_e;
          var2 = var28.readUnsignedByte((byte) -120);
          if (param0 != 2) {
            field_b = (String) null;
          }
          if (var2 == 0) {
            var3 = var28.readUnsignedShort((byte) 81);
            var4 = (ni) (ProxyAuthenticationRequiredException.field_g.g(24009));
            while (var4 != null) {
              if (var3 != var4.field_o) {
                var4 = (ni) (ProxyAuthenticationRequiredException.field_g.c(33));
                continue;
              }
              break;
            }
            if (var4 == null) {
              FormationView.b((byte) -116);
              return;
            }
            var5 = var28.readUnsignedByte((byte) -128);
            if (var5 == 0) {
              var4.c((byte) -109);
              return;
            }
            var6 = var4.field_g;
            FindingOpponentScreen.field_F[0].secondaryName = null;
            var7 = var4.field_j;
            FindingOpponentScreen.field_F[0].name = ArchiveSource.field_e;
            FindingOpponentScreen.field_F[0].includedInUniqueView = false;
            for (var8_int = 1; var8_int < var5; var8_int++) {
              FindingOpponentScreen.field_F[var8_int].name = var28.readString(param0 ^ 34);
              FindingOpponentScreen.field_F[var8_int].includedInUniqueView = false;
              if (1 == var28.readUnsignedByte((byte) -127)) {
                FindingOpponentScreen.field_F[var8_int].secondaryName = var28.readString(-108);
              } else {
                FindingOpponentScreen.field_F[var8_int].secondaryName = null;
              }
            }
            var8 = new String[3][var6];
            var9 = new String[3][var6];
            var35 = new long[3][var6];
            var36 = new int[3][var6 * var7];
            var12 = 0;
            var13 = 0;
            var14 = 0;
            var15 = 0;
            var16 = 0;
            var17 = 0;
            var18 = var28.readUnsignedByte((byte) -106);
            if (0 >= var18) {
              var4.c((byte) -109);
              return;
            }
            for (var19 = 0; var18 > var19; var19++) {
              var20 = var28.readUnsignedByte((byte) -118);
              var21 = FindingOpponentScreen.field_F[var20].name;
              var22 = var28.readLong((byte) -124);
              var24 = var28.field_n;
              if (var19 < var6) {
                var8[0][var12] = var21;
                var9[0][var12] = FindingOpponentScreen.field_F[var20].secondaryName;
                var35[0][var12] = var22;
                var12++;
                for (var25 = 0; var25 < var7; var25++) {
                  incrementValue$0 = var15;
                  var15++;
                  var36[0][incrementValue$0] = var28.readInt(4);
                }
              }
              if (var21 != null &&
                SumIntegersCommand.a((byte) 78, var21)) {
                var8[1][var13] = ArchiveSource.field_e;
                var9[1][var13] = null;
                var35[1][var13] = var22;
                var13++;
                var28.field_n = var24;
                for (var25Lifetime1 = 0; var25Lifetime1 < var7; var25Lifetime1++) {
                  incrementValue$1 = var16;
                  var16++;
                  var36[1][incrementValue$1] = var28.readInt(4);
                }
              }
              if (var14 < var6 &&
                !FindingOpponentScreen.field_F[var20].includedInUniqueView) {
                FindingOpponentScreen.field_F[var20].includedInUniqueView = true;
                var8[2][var14] = var21;
                var9[2][var14] = FindingOpponentScreen.field_F[var20].secondaryName;
                var35[2][var14] = var22;
                var28.field_n = var24;
                var14++;
                for (var25Lifetime2 = 0; var25Lifetime2 < var7; var25Lifetime2++) {
                  incrementValue$2 = var17;
                  var17++;
                  var36[2][incrementValue$2] = var28.readInt(4);
                }
              }
            }
            var4.c((byte) -109);
            return;
          }
          if (var2 == 1) {
            var3Lifetime1 = var28.readUnsignedShort((byte) 81);
            var28.readLong((byte) -124);
            var4_ref = (sm) (FaceNormal.field_d.g(24009));
            while (var4_ref != null) {
              if (var3Lifetime1 != var4_ref.field_k) {
                var4_ref = (sm) (FaceNormal.field_d.c(param0 + 31));
                continue;
              }
              break;
            }
            if (var4_ref == null) {
              FormationView.b((byte) -116);
              return;
            }
            var4_ref.c((byte) -109);
            return;
          }
          UnreadMessagesScreen.a("HS1: " + ClientUiOverlay.describeCurrentPacket(0), (Throwable) null, 1);
          FormationView.b((byte) -116);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var1), "tl.D(" + param0 + ')');
        }
    }

    final static ConsoleExpression a(StringCursor param0, boolean param1) {
        int fieldTemp$2 = 0;
        StringBuilder discarded$3 = null;
        int var2_int = 0;
        StringBuilder var3 = null;
        int var4 = 0;
        String var5 = null;
        int var6 = 0;
        ConsoleExpression stackIn_3_0 = null;
        ConsoleExpression stackIn_21_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var4Lifetime1;
        var6 = Kickabout.field_G;
        try {
          if (param1) {
            stackIn_3_0 = (ConsoleExpression) null;
            return stackIn_3_0;
          }
          fieldTemp$2 = param0.field_c - 1;
          param0.field_c = param0.field_c - 1;
          var2_int = fieldTemp$2;
          var3 = new StringBuilder();
          while (!param0.isAtEnd((byte) 71)) {
            var4 = param0.nextChar(-59);
            if (!Character.isWhitespace((char) var4) &&
              var4 != 44 &&
              var4 != 40 &&
              var4 != 41) {
              discarded$3 = var3.append((char) var4);
              continue;
            }
            param0.field_c = param0.field_c - 1;
            break;
          }
          var5 = var3.toString();
          if (!var5.equals("true") &&
            !var5.equals("false")) {
            if (var5.charAt(0) != 45 &&
              !Character.isDigit(var5.charAt(0))) {
              var4Lifetime1 = ContextMenuItem.field_Ab;
            } else {
              var4Lifetime1 = HelpTipDialog.field_H;
            }
          } else {
            var4Lifetime1 = GameModesHelpScreen.field_N;
          }
          stackIn_21_0 = new ConsoleExpression(var4Lifetime1, var2_int, var5);
          return stackIn_21_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_24_0 = var2;
          stackIn_24_1 = new StringBuilder().append("tl.B(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_b = "FORMATION";
        field_c = new r();
    }
}
