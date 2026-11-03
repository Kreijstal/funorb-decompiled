/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class at extends hd {
    pu field_Cb;
    static String field_Jb;
    static String field_Kb;
    static String field_Ib;
    static String field_Ab;
    static String field_Bb;
    static int field_Hb;
    int field_yb;
    static String field_Fb;
    static String field_Gb;
    String field_Eb;
    private String field_zb;
    int field_Db;

    final int c(boolean param0) {
        if (!param0) {
          ResourceArchive var3 = (ResourceArchive) null;
          at.a((BitmapFont) null, (ResourceArchive) null, (byte) 38);
        }
        return ic.field_h.field_x >= this.field_Db ? 16777215 : 16711680;
    }

    final static void a(BitmapFont param0, ResourceArchive param1, byte param2) {
        int var8 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        tc var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var9 = 0;
        Throwable var10 = null;
        Throwable var11 = null;
        BitmapFont var12 = null;
        int[] var16 = null;
        var9 = Kickabout.field_G;
        try {
          var3_int = vv.field_r;
          LeaguesHelpScreen.field_E = new hd(0L, (hd) null);
          if (param1 == null) {
            var10 = (Throwable) null;
            UnreadMessagesScreen.a("QC1", (Throwable) null, 1);
            return;
          }
          param1.field_c = 0;
          param1.field_b = false;
          ReceivedAuctionItem.field_x = new bt(var3_int, param1, param1);
          TournamentLobbyScreen.field_j = new QuickChatPhraseCache(var3_int, param1, param1, new ka());
          if (param2 != -32) {
            at.h((byte) -19);
          }
          var4 = al.h((byte) 124);
          if (var4 == null) {
            var11 = (Throwable) null;
            UnreadMessagesScreen.a("QC2", (Throwable) null, 1);
            return;
          }
          TeamSelectionAgent.a((byte) -45, var4);
          var12 = (BitmapFont) null;
          ve.field_S = su.a(5138823, 2245737, 1513239, true, 65793, (BitmapFont) null, 65793, 65793, 4020342, 8947848, 0, 1513239, 1127256);
          ic.field_a = su.a(0, 0, 0, true, 0, param0, 0, 0, 0, 0, 16764006, 0, 0);
          NameSuggestionsPanel.field_E = su.a(0, 0, 0, true, 0, param0, 0, 0, 0, 0, 16777215, 0, 0);
          var5 = SoftwareRasterizer.field_g;
          var6 = SoftwareRasterizer.field_f;
          var16 = SoftwareRasterizer.field_a;
          ci.field_g = new Sprite(10, 14);
          ci.field_g.e();
          for (var8 = 2; var8 < 7; var8++) {
            SoftwareRasterizer.drawVerticalLine(var8, 1 + var8, -(var8 << 1) + 14, 16777215);
          }
          SoftwareRasterizer.a(var16, var5, var6);
          gk.field_h = h.a(param2 ^ -32, var4, ve.field_S, NameSuggestionsPanel.field_E, ic.field_a);
          LeaguesHelpScreen.field_E.field_jb = new IntrusiveDeque();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("at.B(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void h(byte param0) {
        field_Fb = null;
        field_Kb = null;
        field_Bb = null;
        if (param0 >= -106) {
          return;
        }
        field_Ib = null;
        field_Jb = null;
        field_Gb = null;
        field_Ab = null;
    }

    at(int param0) {
        this.field_yb = param0;
        fn var3 = pa.field_g[this.field_yb];
        this.field_Cb = new pu(new fn(var3.field_k, var3.field_h, var3.field_e), false);
        this.field_q = 5 + (this.field_Cb.field_q + 143);
        this.field_mb = 5 + this.field_Cb.field_mb + 5;
        this.field_Db = var3.field_e;
        this.field_B = 5;
        this.field_D = 5;
        this.field_Eb = ad.formatCurrencyAmount(this.field_Db, 26300);
        this.field_zb = var3.f((byte) -1).toLowerCase();
        this.a((byte) -115, (hd) (this.field_Cb));
        this.field_Cb.field_s = 8;
        this.field_Cb.field_J = this.field_mb - this.field_Cb.field_mb >> 1;
    }

    final void i(byte param0) {
        if (this.field_mb + this.field_T < SoftwareRasterizer.field_e ||
          SoftwareRasterizer.field_h < this.field_T) {
          return;
        }
        un.field_d.a(this.field_zb, this.field_F + 50, (this.field_mb >> 1) + this.field_T, 16777215, -1);
        if (param0 != -76) {
          this.field_Db = 84;
        }
        IsSixCommand.field_C.c(this.field_Eb, this.field_F + 160, -6 + this.field_T + this.field_mb, this.c(true), -1);
    }

    static {
        field_Ab = "Year";
        field_Jb = "Ignore";
        field_Fb = "Back";
        field_Gb = "Please remove <%0> from your ignore list first.";
        field_Bb = "in the Final";
        field_Ib = "Password: ";
    }
}
