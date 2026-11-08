/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class Pocket {
    GrowableIntList pottedBalls;
    int centerY;
    static boolean[][] field_j;
    static Sprite field_h;
    static String playerListHaveResigned;
    static String gameoptYouhaventunlocked;
    static String statusFull;
    static int field_b;
    static String[][] field_e;
    int centerX;

    final boolean containsBall(int param0, int param1) {
        int var3 = 0;
        if (null == this.pottedBalls) {
          return false;
        }
        for (var3 = 0; var3 < this.pottedBalls.size((byte) 88); var3++) {
          if (this.pottedBalls.get(var3, 2229) == param0) {
            return true;
          }
        }
        if (param1 != 304) {
          return false;
        }
        return false;
    }

    final static boolean areSelectedSettingsAllowed(int firstConstraint) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = Pool.field_O;
        try {
          for (var1_int = firstConstraint; var1_int < LoginMethod.field_h.length; var1_int++) {
            if (LoginMethod.field_h[var1_int][0] != 2 &&
              LoginMethod.field_h[var1_int][2] != 2 &&
              QuaternionRotationSupport.matchesSelectedGameOption(LoginMethod.field_h[var1_int][1], LoginMethod.field_h[var1_int][0], 115) &&
              QuaternionRotationSupport.matchesSelectedGameOption(LoginMethod.field_h[var1_int][3], LoginMethod.field_h[var1_int][2], 110)) {
              return false;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var1), "dl.C(" + firstConstraint + ')');
        }
    }

    public static void releaseStatics(boolean param0) {
        field_h = null;
        if (param0) {
          field_b = 37;
        }
        field_j = (boolean[][]) null;
        field_e = (String[][]) null;
        playerListHaveResigned = null;
        gameoptYouhaventunlocked = null;
        statusFull = null;
    }

    final int serializedByteLength(byte obfuscationGuard) {
        int var2 = 67 / ((-51 - obfuscationGuard) / 62);
        return (this.pottedBalls == null ? 0 : this.pottedBalls.size((byte) 99)) + 1;
    }

    final void print(boolean param0) {
        int var2 = 0;
        String var3;
        if (!param0) {
          var3 = (String) null;
          Pocket.validateEmailDomainLabel(29, (String) null);
        }
        if (this.pottedBalls != null &&
          this.pottedBalls.size((byte) 123) != 0) {
          System.out.print("{");
          for (var2 = 0; var2 < this.pottedBalls.size((byte) 113); var2++) {
            if (0 != var2) {
              System.out.print(",");
            }
            System.out.print(Integer.toString(this.pottedBalls.get(var2, 2229)));
          }
          System.out.print("}");
        } else {
          System.out.print("empty");
        }
    }

    final void read(byte param0, PacketBuffer param1) {
        int var4 = 0;
        int var3_int = 0;
        int var5 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var5 = Pool.field_O;
        try {
          if (param0 != 113) {
            this.centerY = -35;
          }
          var3_int = param1.readUnsignedByte(-101);
          if (var3_int > 0) {
            this.pottedBalls = TikiTableScene.createSizedIntList(var3_int, 1, 0);
            for (var4 = 0; var4 < var3_int; var4++) {
              this.pottedBalls.set(10499, param1.readUnsignedByte(param0 - 222), var4);
            }
            return;
          }
          this.pottedBalls = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("dl.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final void addBall(int param0, int param1) {
        if (this.pottedBalls == null) {
          this.pottedBalls = ShotRecord.b(true);
        }
        int var3 = 126 / ((param1 - 0) / 51);
        this.pottedBalls.add((byte) -2, param0);
    }

    final void write(PacketBuffer param0, int param1) {
        int var3_int = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 != 0) {
            this.containsBall(-87, 43);
          }
          if (null != this.pottedBalls) {
            param0.writeByte(this.pottedBalls.size((byte) 120), false);
            for (var3_int = 0; this.pottedBalls.size((byte) 108) > var3_int; var3_int++) {
              param0.writeByte(this.pottedBalls.get(var3_int, 2229), false);
            }
            return;
          }
          param0.writeByte(0, false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("dl.F(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final static BrowserCookieSupport validateEmailDomainLabel(int obfuscationGuard, String label) {
        int var3 = 0;
        int var2_int = 0;
        int var4 = 0;
        BrowserCookieSupport stackIn_2_0 = null;
        BrowserCookieSupport stackIn_6_0 = null;
        BrowserCookieSupport stackIn_9_0 = null;
        BrowserCookieSupport stackIn_19_0 = null;
        BrowserCookieSupport stackIn_23_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          var2_int = label.length();
          if (0 == var2_int) {
            stackIn_2_0 = WorldPointProjectionSupport.field_e;
            return stackIn_2_0;
          }
          if (63 < var2_int) {
            stackIn_6_0 = ChatPanelSupport.field_h;
            return stackIn_6_0;
          }
          if (obfuscationGuard <= 36) {
            stackIn_9_0 = (BrowserCookieSupport) null;
            return stackIn_9_0;
          }
          for (var3 = 0; var3 < var2_int; var3++) {
            var4 = label.charAt(var3);
            if (var4 == 45) {
              if (0 == var3 ||
                var2_int - 1 == var3) {
                stackIn_19_0 = MessageScreen.field_K;
                return stackIn_19_0;
              }
            } else {
              if (BrowserCookieSupport.field_c.indexOf(var4) == -1) {
                stackIn_23_0 = MessageScreen.field_K;
                return stackIn_23_0;
              }
            }
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_28_0 = var2;
          stackIn_28_1 = new StringBuilder().append("dl.B(").append(obfuscationGuard).append(',');
          if (label == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
        }
    }

    final void keepOnlyPottedBalls(Ball[] param0, int param1) {
        GrowableIntList var3 = null;
        int var4 = 0;
        int var5 = 0;
        int incrementValue$0 = 0;
        if (null == this.pottedBalls) {
          return;
        }
        try {
          var3 = ShotRecord.b(true);
          var4 = 0;
          for (var5 = 0; var5 < this.pottedBalls.size((byte) 110); var5++) {
            if (!param0[this.pottedBalls.get(var5, 2229)].inPlay) {
              incrementValue$0 = var4;
              var4++;
              var3.set(10499, this.pottedBalls.get(var5, 2229), incrementValue$0);
            }
          }
          if (param1 >= -36) {
            this.serializedByteLength((byte) -111);
          }
          this.pottedBalls = var3.size((byte) 98) == 0 ? null : var3;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "dl.J(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    Pocket(CushionSegment param0) {
        this.pottedBalls = null;
        try {
          this.centerX = (param0.endX + param0.startX) / 2;
          this.centerY = (param0.startY + param0.endY) / 2;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "dl.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        statusFull = "Full";
        gameoptYouhaventunlocked = "You have not yet unlocked this option for use.";
        field_e = new String[][]{new String[]{"Visit"}, new String[]{"Perfect break"}, new String[]{"Cover", "Covering"}, new String[]{"Snooker", "Snookered", "Snookering"}, new String[]{"Plant", "Planting"}, new String[]{"Head string", "head-string"}, new String[]{"Pot", "Potting", "Potted"}, new String[]{"Break", "Breaking"}, new String[]{"Shot", "Shots"}, new String[]{"Pocket", "Pockets"}, new String[]{"Re-racked", "re-rack"}, new String[]{"Rack"}, new String[]{"Cue ball", "cue-ball"}, new String[]{"Foul", "Fouls", "Fouling", "Fouled"}, new String[]{"Cushion", "Cushions"}, new String[]{"Group", "Groups"}, new String[]{"Ball-in-hand", "ball in hand"}};
        playerListHaveResigned = "<%0> have all resigned!";
    }
}
