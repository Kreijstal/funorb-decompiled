/*
 * Decompiled by CFR-JS 0.4.0.
 */
class DualLinkNode extends IntrusiveNode {
    long field_m;
    static ResourceArchive field_r;
    static String statusOutOfLives;
    static String targetOpenTable;
    DualLinkNode field_q;
    static boolean field_s;
    DualLinkNode field_n;
    static boolean field_p;
    static String playerX2AreOfferingDraw;
    static boolean field_v;
    static int field_u;

    final long getSecondaryKey(int param0) {
        int var2 = -37 / ((-49 - param0) / 48);
        return this.field_m;
    }

    final void a(long param0, int param1) {
        if (param1 != 45) {
          playerX2AreOfferingDraw = (String) null;
        }
        if (null != this.field_n) {
          throw new RuntimeException();
        }
        this.field_m = param0;
    }

    public static void releaseStatics(int param0) {
        playerX2AreOfferingDraw = null;
        statusOutOfLives = null;
        field_r = null;
        if (param0 != -3604) {
          BitmapFont var2 = (BitmapFont) null;
          DualLinkNode.a(-30, (String[]) null, (String) null, (BitmapFont) null, -45);
        }
        targetOpenTable = null;
    }

    final boolean d(int param0) {
        if (null == this.field_n) {
          return false;
        }
        if (param0 < 31) {
          return false;
        }
        return true;
    }

    protected DualLinkNode() {
    }

    final static Sprite[] a(int param0, int param1, int param2, int param3, int param4) {
        if (param2 > -107) {
          DualLinkNode.a(-20, 53, 78, true, 78, 37, 85);
        }
        return BeveledFrameSpriteFactory.a(1, 1, param4, 3, 4, 1, param0, param3, param1);
    }

    final void unlinkNode(boolean param0) {
        if (param0) {
          return;
        }
        if (null == this.field_n) {
          return;
        }
        this.field_n.field_q = this.field_q;
        this.field_q.field_n = this.field_n;
        this.field_q = null;
        this.field_n = null;
    }

    final static void a(int param0, int param1, int param2, boolean param3, int param4, int param5, int param6) {
        String var7 = null;
        if (param4 != 4010) {
          DualLinkNode.a(33, -109, 29, false, 1, 26, 48);
        }
        if (CookieDateSupport.field_b != 2) {
          var7 = DialRenderer.messageGame;
        } else {
          var7 = RankingsProtocolSupport.sendPm;
        }
        ChatPanelSupport.a(-57, param1, param2, param5, var7, param3, param0, param6);
    }

    final static int a(int param0, String[] param1, String param2, BitmapFont param3, int param4) {
        int var9 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_25_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var6Lifetime1;
        var13 = Pool.field_O;
        try {
          var5_int = param3.stringWidth(param2);
          if (param0 >= var5_int &&
            param2.indexOf("<br>") == -1) {
            param1[0] = param2;
            stackIn_4_0 = 1;
            return stackIn_4_0;
          }
          var6 = (-1 + var5_int + param0) / param0;
          param0 = var5_int / var6;
          var6Lifetime1 = 0;
          var7 = 0;
          var8 = param2.length();
          for (var9 = param4; var9 < var8; var9++) {
            var10 = param2.charAt(var9);
            if (32 == var10 ||
              45 == var10) {
              var11 = param2.substring(var7, var9 + 1).trim();
              var12 = param3.stringWidth(var11);
              if (param0 <= var12) {
                var7 = var9 + 1;
                incrementValue$1 = var6Lifetime1;
                var6Lifetime1++;
                param1[incrementValue$1] = var11;
              }
            }
            if (62 == var10 &&
              param2.regionMatches(-3 + var9, "<br>", 0, 4)) {
              incrementValue$2 = var6Lifetime1;
              var6Lifetime1++;
              param1[incrementValue$2] = param2.substring(var7, -3 + var9).trim();
              var7 = var9 + 1;
            }
          }
          if (var8 > var7) {
            incrementValue$0 = var6Lifetime1;
            var6Lifetime1++;
            param1[incrementValue$0] = param2.substring(var7, var8).trim();
          }
          stackIn_25_0 = var6Lifetime1;
          return stackIn_25_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_28_0 = var5;
          stackIn_28_1 = new StringBuilder().append("rg.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          stackIn_31_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',');
          if (param2 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          stackIn_34_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',');
          if (param3 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',').append(param4).append(')').toString());
        }
    }

    static {
        statusOutOfLives = "Out of lives.";
        targetOpenTable = "Open table";
        field_p = true;
        field_s = true;
        playerX2AreOfferingDraw = "<%0> and <%1> want to draw.";
    }
}
