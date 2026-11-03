/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class QuickChatCategoryDefinition extends DualLinkNode {
    static int field_y;
    char[] subcategoryShortcuts;
    static String tickerHintShoot;
    static MeshBuilder field_E;
    int[] phraseIds;
    char[] phraseShortcuts;
    boolean rootMarker;
    static String gameoptNeedchanging1;
    static wc field_B;
    int[] subcategoryIds;
    String title;

    public static void releaseStatics(int param0) {
        field_E = null;
        tickerHintShoot = null;
        gameoptNeedchanging1 = null;
        if (param0 > -73) {
          field_E = (MeshBuilder) null;
        }
        field_B = null;
    }

    private final void decodeTag(int param0, PacketBuffer param1, int param2) {
        char[] stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_12_2 = 0;
        char[] stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_18_2 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = Pool.field_O;
        try {
          if (param2 != 1) {
            if (param2 == 2) {
              var4_int = param1.readUnsignedByte(-90);
              this.subcategoryShortcuts = new char[var4_int];
              this.subcategoryIds = new int[var4_int];
              for (var5 = 0; var5 < var4_int; var5++) {
                this.subcategoryIds[var5] = param1.readUnsignedShort(-1034);
                var6 = param1.readByte((byte) 105);
                stackIn_17_0 = this.subcategoryShortcuts;
                stackIn_17_1 = var5;
                if (var6 != 0) {
                  stackIn_18_2 = s.decodeCp1252Byte((byte) var6, 8);
                } else {
                  stackIn_18_2 = 0;
                }
                stackIn_17_0[stackIn_17_1] = (char) stackIn_18_2;
              }
            } else {
              if (param2 == 3) {
                var4_int = param1.readUnsignedByte(-106);
                this.phraseShortcuts = new char[var4_int];
                this.phraseIds = new int[var4_int];
                for (var5 = 0; var4_int > var5; var5++) {
                  this.phraseIds[var5] = param1.readUnsignedShort(-1034);
                  var6 = param1.readByte((byte) 105);
                  stackIn_11_0 = this.phraseShortcuts;
                  stackIn_11_1 = var5;
                  if (var6 != 0) {
                    stackIn_12_2 = s.decodeCp1252Byte((byte) var6, 8);
                  } else {
                    stackIn_12_2 = 0;
                  }
                  stackIn_11_0[stackIn_11_1] = (char) stackIn_12_2;
                }
              } else {
                if (param2 == 4) {
                  this.rootMarker = true;
                }
              }
            }
          } else {
            this.title = param1.j(-119);
          }
          if (param0 >= -109) {
            gameoptNeedchanging1 = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_24_0 = var4;
          stackIn_24_1 = new StringBuilder().append("sf.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param2).append(')').toString());
        }
    }

    final void markExtendedLinks(int param0) {
        int var5 = 0;
        int var2 = 0;
        int var3 = Pool.field_O;
        int var2Lifetime1;
        if (this.phraseIds != null) {
          for (var2 = 0; var2 < this.phraseIds.length; var2++) {
            this.phraseIds[var2] = md.bitwiseOr(this.phraseIds[var2], 32768);
          }
        }
        if (null != this.subcategoryIds) {
          var5 = 0;
          var2Lifetime1 = var5;
          while (this.subcategoryIds.length > var5) {
            this.subcategoryIds[var5] = md.bitwiseOr(this.subcategoryIds[var5], 32768);
            var5++;
          }
        }
        if (param0 != 0) {
          PacketBuffer var4 = (PacketBuffer) null;
          this.decode((byte) -86, (PacketBuffer) null);
        }
    }

    final void decode(byte param0, PacketBuffer param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = Pool.field_O;
        try {
          while (true) {
            var3_int = param1.readUnsignedByte(param0 ^ 1);
            if (var3_int != 0) {
              this.decodeTag(-121, param1, var3_int);
              continue;
            }
            break;
          }
          if (param0 != -123) {
            this.subcategoryShortcuts = (char[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("sf.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static void b(byte param0, PacketBuffer param1) {
        int var2_int = 0;
        int var2_intLifetime1;
        int var2_intLifetime2;
        try {
          IntKeyLookup.field_a = param1.readUnsignedShort(-1034) << 5;
          var2_int = param1.readUnsignedByte(-74);
          jj.field_F = (var2_int & 7) << 18;
          IntKeyLookup.field_a = IntKeyLookup.field_a + (var2_int >> 3);
          jj.field_F = jj.field_F + (param1.readUnsignedShort(-1034) << 2);
          var2_intLifetime1 = param1.readUnsignedByte(-115);
          DialRenderer.field_n = (63 & var2_intLifetime1) << 15;
          jj.field_F = jj.field_F + (var2_intLifetime1 >> 6);
          if (param0 <= 112) {
            gameoptNeedchanging1 = (String) null;
          }
          DialRenderer.field_n = DialRenderer.field_n + (param1.readUnsignedByte(-75) << 7);
          var2_intLifetime2 = param1.readUnsignedByte(-61);
          DialRenderer.field_n = DialRenderer.field_n + (var2_intLifetime2 >> 1);
          BufferedSocket.field_f = (var2_intLifetime2 & 1) << 16;
          BufferedSocket.field_f = BufferedSocket.field_f + param1.readUnsignedShort(-1034);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "sf.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    QuickChatCategoryDefinition() {
        this.rootMarker = false;
    }

    static {
        gameoptNeedchanging1 = "The '<%0>' setting needs to be changed.";
        tickerHintShoot = "<img=0> Click on the cue ball to take your shot.";
    }
}
