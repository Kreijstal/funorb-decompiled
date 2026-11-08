/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IntKeyLookup {
    static String muGamelistStatus;
    static int field_a;
    static String muLobbyRating;
    private int[] table;
    static String muChatGameFriendsOnly;

    final static char stripAccent(boolean param0, char param1) {
        int var2;
        if (!param0) {
          field_a = -102;
        }
        var2 = param1;
        if (var2 != 32 &&
          160 != var2 &&
          var2 != 95 &&
          var2 != 45) {
          if (var2 != 91 &&
            var2 != 93 &&
            var2 != 35) {
            if (var2 != 224 &&
              var2 != 225 &&
              226 != var2 &&
              228 != var2 &&
              var2 != 227 &&
              var2 != 192 &&
              193 != var2 &&
              var2 != 194 &&
              var2 != 196 &&
              var2 != 195) {
              if (var2 != 232 &&
                var2 != 233 &&
                var2 != 234 &&
                235 != var2 &&
                var2 != 200 &&
                var2 != 201 &&
                var2 != 202 &&
                203 != var2) {
                if (var2 != 237 &&
                  238 != var2 &&
                  var2 != 239 &&
                  205 != var2 &&
                  206 != var2 &&
                  207 != var2) {
                  if (242 != var2 &&
                    var2 != 243 &&
                    var2 != 244 &&
                    246 != var2 &&
                    var2 != 245 &&
                    var2 != 210 &&
                    211 != var2 &&
                    var2 != 212 &&
                    214 != var2 &&
                    213 != var2) {
                    if (var2 != 249 &&
                      var2 != 250 &&
                      251 != var2 &&
                      252 != var2 &&
                      217 != var2 &&
                      var2 != 218 &&
                      var2 != 219 &&
                      var2 != 220) {
                      if (var2 != 231 &&
                        var2 != 199) {
                        if (var2 != 255 &&
                          376 != var2) {
                          if (241 != var2 &&
                            209 != var2) {
                            if (223 == var2) {
                              return 'b';
                            }
                            return Character.toLowerCase(param1);
                          }
                          return 'n';
                        }
                        return 'y';
                      }
                      return 'c';
                    }
                    return 'u';
                  }
                  return 'o';
                }
                return 'i';
              }
              return 'e';
            }
            return 'a';
          }
          return param1;
        }
        return '_';
    }

    final static boolean a(int param0, int param1, int param2, int param3, boolean param4, byte param5, int param6) {
        if (param5 != 33) {
          IntKeyLookup.releaseStatics(-79);
        }
        if (oj.c(-86)) {
          ShotRecord.a(param6, param3, -40960, param4);
          if (PlasmaBallSkin.field_m != null &&
            PlasmaBallSkin.field_m.handleMenuSelection(param2, param1, param4, 25427, param3)) {
            param4 = false;
            ProgressDialog.m(8421504);
          }
          ii.a(-31668, param3, param4);
          PlasmaBallSkin.a(true, param0, param4);
          param4 = false;
        }
        return param4;
    }

    final static void a(boolean param0) {
        TriangleMesh.d(-97);
        GameRules.createBallSkins((byte) 118);
        if (!param0) {
          muChatGameFriendsOnly = (String) null;
        }
    }

    public static void releaseStatics(int param0) {
        muGamelistStatus = null;
        if (param0 != -30521) {
          field_a = 23;
        }
        muChatGameFriendsOnly = null;
        muLobbyRating = null;
    }

    final int indexOf(int param0, byte param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        var3 = -1 + (this.table.length >> 1);
        var4 = param0 & var3;
        var5 = -20 / ((58 - param1) / 55);
        while (true) {
          var6 = this.table[var4 + (var4 + 1)];
          if (var6 == -1) {
            return -1;
          }
          if (this.table[var4 + var4] == param0) {
            return var6;
          }
          var4 = var3 & var4 + 1;
        }
    }

    IntKeyLookup(int[] param0) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3Lifetime1;
        try {
          var2_int = 1;
          while (var2_int <= param0.length + (param0.length >> 1)) {
            var2_int = var2_int << 1;
          }
          this.table = new int[var2_int + var2_int];
          for (var3 = 0; var3 < var2_int + var2_int; var3++) {
            this.table[var3] = -1;
          }
          for (var3Lifetime1 = 0; param0.length > var3Lifetime1; var3Lifetime1++) {
            var4 = param0[var3Lifetime1] & var2_int - 1;
            while (this.table[1 + (var4 + var4)] != -1) {
              var4 = -1 + var2_int & var4 + 1;
            }
            this.table[var4 + var4] = param0[var3Lifetime1];
            this.table[var4 + (var4 + 1)] = var3Lifetime1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("wi.<init>(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final static void a(int param0) {
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        IntLookupQuery var4_ref_fl = null;
        oi var5 = null;
        int var5_int = 0;
        int[] var6 = null;
        int var8 = 0;
        CipherPacketBuffer var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        var8 = Pool.field_O;
        try {
          if (param0 != 199) {
            muGamelistStatus = (String) null;
          }
          var9 = PlayerContextMenu.field_e;
          var2 = var9.readUnsignedByte(-125);
          var3 = var9.readUnsignedByte(param0 ^ -151);
          if (var2 == 0) {
            var4_ref_fl = (IntLookupQuery) (TutorialFactory.field_g.last((byte) -124));
            if (var4_ref_fl == null) {
              ShotEvent.c(param0 - 79);
              return;
            }
            var5_int = ScrollPane.field_Pb - var9.position;
            var11 = var4_ref_fl.field_r;
            var10 = var11;
            var6 = var10;
            if (var5_int > var11.length << 2) {
              var5_int = var11.length << 2;
            }
            for (var7 = 0; var5_int > var7; var7++) {
              var6[var7 >> 2] = var6[var7 >> 2] + (var9.readUnsignedByte(-100) << (ArchiveLoadSequence.b(var7, 3) << 8));
            }
            var4_ref_fl.unlink((byte) -117);
            return;
          }
          if (var2 == 1) {
            var4 = var9.readSignedSmart(param0 - 272);
            var5 = (oi) (qr.field_a.last((byte) 68));
            while (var5 != null) {
              if (var3 != var5.field_t ||
                var4 != var5.field_l) {
                var5 = (oi) (qr.field_a.previous((byte) -5));
                continue;
              }
              break;
            }
            if (var5 == null) {
              ShotEvent.c(118);
              return;
            }
            var5.unlink((byte) -117);
            return;
          }
          GrowableIntList.reportClientError((Throwable) null, "LR1: " + t.formatPacketDump(param0 ^ 159), param0 - 8754);
          ShotEvent.c(125);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var1), "wi.A(" + param0 + ')');
        }
    }

    static {
        muLobbyRating = "Rating";
        muChatGameFriendsOnly = "Only show game chat from my friends";
        muGamelistStatus = "Status";
    }
}
