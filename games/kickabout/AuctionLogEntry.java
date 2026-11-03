/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AuctionLogEntry extends IntrusiveNode {
    int slotIndex;
    static int field_g;
    static AppScreen field_h;
    static double field_f;
    static BitmapFont field_e;
    long auctionId;
    static Sprite field_j;
    static int field_n;
    int logType;
    static StringBuilder field_m;

    public static void b(int param0) {
        field_h = null;
        field_j = null;
        if (param0 <= 46) {
          field_j = (Sprite) null;
        }
        field_m = null;
        field_e = null;
    }

    public final String toString() {
        String var1;
        int var2;
        String var3;
        String var4;
        String var1Lifetime1;
        String var1Lifetime2;
        String var1Lifetime3;
        var2 = Kickabout.field_G;
        var3 = "Auction Log [";
        var1 = var3;
        var1Lifetime1 = var3;
        if (this.logType != 0) {
          if (this.logType != 1) {
            if (this.logType == 2) {
              var1Lifetime2 = var3 + "Own]";
            } else {
              if (this.logType == 3) {
                var1Lifetime2 = var3 + "Outbid]";
              } else {
                var1Lifetime2 = var3 + "NO TYPE]";
              }
            }
          } else {
            var1Lifetime2 = var3 + "Buy]";
          }
        } else {
          var1Lifetime2 = var3 + "Bid]";
        }
        var4 = var1Lifetime2 + ", [INDEX==" + this.slotIndex + "]";
        var1Lifetime3 = var4 + ", [ID==" + this.auctionId + "]\n";
        return var1Lifetime3;
    }

    final static int a(int param0) {
        if (param0 != 1315216324) {
          AuctionLogEntry.a(0);
        }
        return fc.field_a + (q.field_b << 2) + (ng.field_a << 4);
    }

    final static BinaryBitmapFont a(int param0, ResourceArchive param1, int param2, int param3, ResourceArchive param4) {
        RuntimeException var5 = null;
        java.applet.Applet var6 = null;
        BinaryBitmapFont stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!cu.a(param2, param4, param3, 123)) {
            return null;
          }
          if (param0 != 10) {
            var6 = (java.applet.Applet) null;
            AuctionLogEntry.openSubscribePage((java.applet.Applet) null, (byte) -14);
          }
          stackIn_6_0 = tt.a(12015, param1.b(param3, -32669, param2));
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("cq.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static void openSubscribePage(java.applet.Applet param0, byte param1) {
        try {
          java.net.URL var2 = null;
          if (param1 != 126) {
            field_h = (AppScreen) null;
          }
          try {
            var2 = new java.net.URL(param0.getCodeBase(), "subscribe.ws");
            param0.getAppletContext().showDocument(qr.a(param0, var2, 3), "_top");
          } catch (Exception exception) {
            exception.printStackTrace();
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static String a(int param0, String param1, byte param2) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_9_0 = null;
        String stackIn_12_0 = null;
        String stackIn_16_0 = null;
        String stackIn_20_0 = null;
        String stackIn_24_0 = null;
        String stackIn_30_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 3) {
            stackIn_2_0 = GameOverView.field_E;
            return stackIn_2_0;
          }
          if (6 == param0) {
            stackIn_5_0 = QuickChatPhraseDefinition.field_s;
            return stackIn_5_0;
          }
          if (param0 == 7) {
            stackIn_9_0 = fv.field_a;
            return stackIn_9_0;
          }
          if (param0 == 8) {
            stackIn_12_0 = rc.field_e;
            return stackIn_12_0;
          }
          if (param0 == 9) {
            stackIn_16_0 = cv.field_g;
            return stackIn_16_0;
          }
          if (param0 == 10) {
            stackIn_20_0 = vs.field_c;
            return stackIn_20_0;
          }
          if (param0 == 11) {
            stackIn_24_0 = go.field_a;
            return stackIn_24_0;
          }
          if (param2 < 101) {
            AuctionLogEntry.b(68);
          }
          if (param0 != 14) {
            return null;
          }
          stackIn_30_0 = vo.$cfr$intArgs$a$53ce4ab4c593(-18, nm.field_a, new String[]{param1});
          return stackIn_30_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_34_0 = var3;
          stackIn_34_1 = new StringBuilder().append("cq.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(boolean param0, int param1) {
        ThreeCommand.a(param0, param1 + 16355);
        if (param1 != 0) {
          field_m = (StringBuilder) null;
        }
        MouseWheelInput.a((byte) -125, param0);
    }

    final static Sprite[] a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var7 = Kickabout.field_G;
        Sprite[] var8 = new Sprite[9];
        Sprite[] var4 = var8;
        var8[0] = BroadcastServerCommand.a(param2, (byte) -96, param0);
        for (var5 = 1; var5 < 9; var5++) {
          var8[var5] = var8[0];
        }
        int var6 = -119 % ((param3 - 38) / 60);
        var8[4] = BroadcastServerCommand.a(param1, (byte) -96, 64);
        return var4;
    }

    AuctionLogEntry(int param0, int param1, long param2) {
        this.auctionId = param2;
        this.slotIndex = param1;
        this.logType = param0;
    }

    AuctionLogEntry(PacketBuffer param0) {
        int var2_int = 0;
        try {
          param0.readUnsignedByte((byte) -126);
          var2_int = param0.readUnsignedByte((byte) -124);
          this.logType = var2_int & 15;
          this.slotIndex = (15 & var2_int >> 4) - 1;
          this.auctionId = param0.readLong((byte) -124);
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "cq.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean e(int param0) {
        boolean stackIn_6_0 = false;
        if (param0 != 15137) {
          return false;
        }
        stackIn_6_0 = (!PlayArea.a(100)) && (2 <= tk.field_Ib);
        return stackIn_6_0;
    }

    final static Object a(byte[] param0, boolean param1, int param2) {
        ll var3 = null;
        RuntimeException var3_ref = null;
        ll stackIn_6_0 = null;
        byte[] stackIn_9_0 = null;
        byte[] stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == null) {
            return null;
          }
          if (param2 < param0.length) {
            var3 = new ll();
            ((pf) ((Object) var3)).a(param0, 21820);
            stackIn_6_0 = var3;
            return stackIn_6_0;
          }
          if (!param1) {
            stackIn_11_0 = (byte[]) (param0);
            return stackIn_11_0;
          }
          stackIn_9_0 = FullscreenFocusCanvas.a(82, param0);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_14_0 = var3_ref;
          stackIn_14_1 = new StringBuilder().append("cq.D(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_h = (AppScreen) ((Object) new BlankScreen());
        field_m = new StringBuilder(80);
    }
}
