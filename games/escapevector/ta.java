/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ta {
    static int field_w;
    private ea field_s;
    private LegacyButton field_a;
    private int field_m;
    private int field_v;
    private int field_j;
    private int field_d;
    static String field_k;
    private LegacyButton field_f;
    private int field_y;
    private int field_h;
    private int[][] field_x;
    private int[] field_t;
    private int field_c;
    private gf field_o;
    private int[] field_u;
    private LegacyButton[][] field_p;
    private LegacyButton field_r;
    private int field_e;
    private int field_b;
    private int[] field_l;
    private int field_q;
    private LegacyButton[] field_i;
    static String field_g;
    private int field_z;
    private gf field_n;

    private final void e(boolean param0) {
        Object var2 = null;
        if (null != this.field_f) {
          var2 = IntrusiveNode.field_a;
        }
        if (!param0) {
          this.j(48);
        }
        en var3 = TrackerMusicDefinition.field_f;
        if (var3.field_c) {
          var2 = ProgressRecord.field_l;
        }
        if (var2 == null) {
          return;
        }
        BinaryBitmapFont var4 = ByteStorage.gameFont;
        int var5 = var4.maxDescent + var4.maxAscent;
        int var6 = -var5 + this.field_q - 3 + var4.maxAscent;
        int var7 = 320;
        int var8 = 10551200;
        var4.drawCentered((String) (var2), var7, var6, var8, -1);
    }

    private final void g(byte param0) {
        int var2 = 10;
        int var3 = var2;
        int var4 = 2;
        BinaryBitmapFont var5 = ByteStorage.gameFont;
        int var7 = 8 / ((18 - param0) / 59);
        int var6 = this.e(-108);
        var6 = this.a(var5, 117, var3, var4, this.field_q, var6);
        var6 = this.a(-1, var5, var6, var3, this.field_q, var4);
        var6 = this.a(440, var5, (byte) 57, var6, var4, var3);
        this.a(true);
        int discarded$0 = this.b(var6, 8);
        this.b((byte) 98);
        int var8 = this.d((byte) -71);
        this.g(var8, 0);
    }

    private final void f(boolean param0) {
        if (mj.field_d == 0) {
          sj.a(8192, (byte) 51);
        }
        IntValueNode.field_j = param0;
        this.a(64, this.field_f);
        this.a(64, this.field_r);
        this.a(64, this.field_a);
        if (1000 > mj.field_d) {
          mj.field_d = mj.field_d + 1;
        }
    }

    private final void a(boolean param0) {
        int var2 = 103;
        if (!param0) {
          this.field_d = 102;
        }
        int var3 = 40;
        int var4 = 40;
        int var5 = 40;
        int var6 = 3170352;
        int var7 = 6340704;
        this.a(var2, var7, 640, 0, var4, var6, var5, var3);
        this.a(var7, 1, 2, var6, var5);
    }

    private final boolean c(byte param0) {
        int var2 = -93 % ((56 - param0) / 44);
        wc var3 = di.field_d;
        int var4 = var3.field_h;
        if (var4 < 0 ||
          var4 >= this.field_x[this.field_h].length) {
          this.field_m = -1;
          return false;
        }
        this.field_m = var4;
        if (var3.b((byte) -18)) {
          this.field_z = this.field_m;
          return true;
        }
        return false;
    }

    private final boolean e(int param0, int param1) {
        if (param1 < 0) {
          return false;
        }
        if (param1 == this.field_c) {
          int var3 = -1 + this.field_h;
          if (0 > var3) {
            var3 = this.field_y - 1;
          }
          this.c(var3, (byte) -94);
          return true;
        }
        if (param0 > -98) {
          this.field_b = -25;
        }
        if (this.field_e != param1) {
          return false;
        }
        int var3Lifetime1 = 1 + this.field_h;
        if (this.field_y <= var3Lifetime1) {
          var3Lifetime1 = 0;
        }
        this.c(var3Lifetime1, (byte) 110);
        return true;
    }

    private final void b(int param0, Sprite param1) {
        if (param1 == null) {
          return;
        }
        int var3_int = this.g(true);
        if (var3_int < 0) {
          return;
        }
        try {
          BinaryBitmapFont var4 = ByteStorage.gameFont;
          int var5 = var4.maxAscent + var4.maxDescent;
          String var6 = CachedArchiveProvider.field_r[var3_int];
          int var7 = ((this.field_n.field_m - param1.fullHeight) / param0 - var5) / 3;
          int var8 = var7 + this.field_n.field_k + var4.maxAscent;
          int var9 = 320;
          MatchingTextValidator.a(var8, var6, 16777215, -110, var9);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "ta.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final boolean a(byte param0, boolean param1, boolean param2) {
        boolean var4 = false;
        if (this.c((byte) -16)) {
          return (var4);
        }
        if (param2) {
          int var6 = this.l(-8477);
          if (0 > var6) {
            return (var4);
          }
          if (this.e(-124, var6)) {
            return (var4);
          }
          if (this.field_j == var6) {
            pa.a(true);
          }
          if (this.field_v == var6) {
            kh.a(lh.b((byte) -116), -1230, true);
          }
          if (this.field_d == var6) {
            AlternateUsernameCredentials.field_q.b(-26480, param1);
            di.field_d = null;
          }
          e.field_a = false;
          TrackerMusicDefinition.field_f.a(true);
          mj.field_d = 0;
          gi.a((byte) -71);
          var4 = true;
          return (var4);
        }
        if (param0 != -91) {
          this.field_r = (LegacyButton) null;
        }
        return (var4);
    }

    final static void m(int param0) {
        if (param0 != 2) {
          ta.releaseStatics(-84);
        }
        WhirlpoolHasher.a(4, 43);
    }

    private final int[] a(byte param0, int param1, int param2, int param3) {
        int var8 = EscapeVector.obfuscationControl;
        if (param3 == 1) {
          param1 = param1 + param2 / 2;
        }
        int[] var5 = new int[param3];
        int var6 = 0;
        int var7 = param1;
        if (param0 >= -93) {
          this.field_o = (gf) null;
        }
        while (var6 < param3) {
          var5[var6] = var7;
          var6++;
          var7 = var7 + param2;
        }
        return var5;
    }

    private final int a(int param0, int param1, BinaryBitmapFont param2, int param3) {
        String stackIn_17_2 = null;
        try {
          int var5_int = this.g(true);
          if (0 > var5_int) {
            int stackIn_3_0 = param3 / 2 + param0;
            return stackIn_3_0;
          }
          int var6 = param2.stringWidth(kg.field_a + " ");
          int var7 = param2.stringWidth("" + ProxySocketConnector.field_t[var5_int]);
          int var8 = var6 + var7;
          int var9 = param2.stringWidth(ResizableModalPanel.field_T + " ");
          int var10 = param2.stringWidth("" + ProxySocketConnector.field_s[var5_int]);
          int var11 = var10 + var9;
          int stackIn_7_0 = (var11 > var8) ? var11 : var8;
          int var12 = stackIn_7_0;
          boolean var13 = false;
          int var14 = (-var12 + param3) / 2 + param0;
          int stackIn_10_0 = ((!(var13))) ? var6 : var9;
          int var15 = stackIn_10_0;
          if (param1 != 15930) {
            this.field_x = (int[][]) null;
          }
          int var16 = var15 + var14;
          int stackIn_13_0 = var16;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_16_0 = var5;
          StringBuilder stackIn_16_1 = new StringBuilder().append("ta.Q(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param3).append(')').toString());
        }
    }

    private final void b(byte param0) {
        int[] var6 = new int[]{3170352, 8421504, 8421504};
        int[] var3 = new int[]{6340704, 16777215, 16777215};
        int var5 = -39 % ((-64 - param0) / 32);
        int[] var4 = new int[]{6340704, 16777215, 16777215};
        if (null != this.field_f) {
          this.field_f.setColors(var3, var6, (byte) -123, var4);
        }
        if (this.field_r != null) {
          this.field_r.setColors(var3, var6, (byte) -126, var4);
        }
        if (this.field_a != null) {
          this.field_a.setColors(var3, var6, (byte) -126, var4);
        }
    }

    private final int e(int param0) {
        int var24 = EscapeVector.obfuscationControl;
        if (this.field_p != null) {
          return this.field_u[this.field_h];
        }
        int var2 = 1;
        int var3 = 103;
        int var4 = 40;
        int var5 = 40;
        if (param0 > -66) {
          return -63;
        }
        int[] var6 = new int[]{36, 40};
        this.a((byte) -105);
        int[] var7 = new int[]{36, 40};
        this.field_p = new LegacyButton[this.field_y][];
        for (int var8 = 0; this.field_y > var8; var8++) {
          int var9 = this.field_u[var8];
          int var10 = this.a((byte) 89, var9);
          int[] var37 = this.b(22387, var10, var9);
          int[] var38 = this.a(var37, (byte) 100, var4);
          int[] var39 = this.a(var38, (byte) -115);
          int[] var40 = this.a((byte) -99, var3, var5, var10);
          Sprite[] var15 = this.a(var8, (byte) -116);
          LegacyButton[] array$0 = new LegacyButton[var9];
          this.field_p[var8] = array$0;
          for (int var16 = 0; var10 > var16; var16++) {
            int var17 = var37[var16];
            for (int var18 = 0; var18 < var17; var18++) {
              int var19 = this.a(var18, var37, 6340704, var16);
              Sprite var20 = var15[var19];
              int var21 = var18 * var4 + var39[var16];
              int var22 = var40[var16];
              LegacyButton var23 = new LegacyButton(var2, var19, var20, var6, var7);
              var23.setSize(var5, 0, var4);
              var23.setPosition((byte) 22, var21, var22);
              this.field_p[var8][var19] = var23;
            }
          }
        }
        return this.field_u[this.field_h];
    }

    private final void g(int param0) {
        this.field_o.c(117);
        if (param0 != 16317) {
          this.field_h = -83;
        }
        int var2 = di.field_d.field_h;
        if (!this.field_s.e((byte) -7)) {
          this.field_s.a(256);
        } else {
          nm.a((byte) -77, var2, this.field_p[this.field_h]);
        }
        if (null != this.field_i) {
          nm.a((byte) -115, var2, this.field_i);
        }
    }

    final int a(int param0, int param1, int param2) {
        int var4 = DebouncedValidator.a(param2, 31, this.field_p[this.field_h], param1);
        if (var4 >= 0) {
          return var4;
        }
        if (this.field_f != null &&
          this.field_f.hitTest((byte) 65, param1, param2)) {
          return this.field_f.actionId;
        }
        if (null != this.field_r &&
          this.field_r.hitTest((byte) 65, param1, param2)) {
          return this.field_r.actionId;
        }
        if (param0 != -3) {
          return 57;
        }
        if (this.field_a != null &&
          this.field_a.hitTest((byte) 65, param1, param2)) {
          return this.field_a.actionId;
        }
        if (this.field_i != null) {
          var4 = DebouncedValidator.a(param2, 57, this.field_i, param1);
          if (var4 >= 0) {
            return var4;
          }
        }
        return -1;
    }

    private final int a(byte param0, int param1) {
        if (param0 <= 18) {
          return 38;
        }
        if (param1 <= 4) {
          return 1;
        }
        return 2;
    }

    private final int a(byte param0, int param1, int param2) {
        int var4 = param1 / this.field_y;
        if (param2 == 0) {
          var4 = var4 + param1 % this.field_y;
        }
        if (param0 <= 80) {
          this.field_e = 38;
        }
        return var4;
    }

    private final boolean k(int param0) {
        boolean var2 = false;
        if (AccountRequestDialog.pollKeyEvent(-98)) {
          di.field_d.a(118);
          qk.a(this.field_t, 0);
          if (PasswordValidator.field_n == 13) {
            di.field_d.a(false, this.field_d);
          }
          this.a(20364);
          var2 = (this.a((byte) -91, false, Js5NetworkRequest.a((byte) 15, PasswordValidator.field_n)));
          return (var2);
        }
        if (param0 >= -60) {
          this.e((byte) 96);
        }
        return (var2);
    }

    private final int[] a(int[] param0, byte param1) {
        String stackIn_9_2 = null;
        int var8 = EscapeVector.obfuscationControl;
        try {
          int var3_int = 66 / ((param1 - 34) / 58);
          int[] var4 = new int[param0.length];
          for (int var5 = 0; param0.length > var5; var5++) {
            int var6 = param0[var5];
            int var7 = (-var6 + 640) / 2;
            var4[var5] = var7;
          }
          int[] stackIn_5_0 = var4;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_8_0 = var3;
          StringBuilder stackIn_8_1 = new StringBuilder().append("ta.S(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    private final boolean c(int param0, int param1) {
        if (param0 < 14) {
          field_w = 98;
        }
        if (UiContainer.e((byte) -119)) {
          return false;
        }
        return TrackerMusicDefinition.field_f.f(param1, 1);
    }

    private final void c(boolean param0) {
        BinaryBitmapFont var2 = ByteStorage.gameFont;
        if (!param0) {
          return;
        }
        int var3 = 320;
        int var4 = 10;
        int var5 = this.field_n.field_k + var4 + var2.maxAscent;
        var2.drawCentered(Js5NetworkRequest.field_C, var3, var5, 10551200, -1);
    }

    private final int[] b(int param0) {
        int[] var2;
        int var9 = EscapeVector.obfuscationControl;
        if (this.field_b != param0) {
          int var3 = TrackerMusicDefinition.field_f.a(this.field_b, true);
          int var4 = TrackerMusicDefinition.field_f.c(this.field_b, 1);
          int[] var10 = new int[var4];
          var2 = var10;
          int var5 = 0;
          int var6 = 0;
          while (var5 < var3) {
            boolean var7 = (TrackerMusicDefinition.field_f.b(var5, (byte) 55));
            boolean var8 = (TrackerMusicDefinition.field_f.a(var5, (byte) -126, this.field_b));
            if ((!var7 ||
              var8) && var10.length > var6) {
              var10[var6++] = var5;
            }
            var5++;
          }
        } else {
          var2 = this.field_l;
        }
        return var2;
    }

    private final int b(int param0, int param1) {
        this.field_e = -1;
        this.field_c = -1;
        if (1 >= this.field_y) {
          this.field_i = null;
          return param0;
        }
        int stackIn_6_0 = (this.field_y > 2) ? 2 : 1;
        int var3 = stackIn_6_0;
        this.field_i = new LegacyButton[var3];
        if (param1 != 8) {
          this.c(46);
        }
        int var4 = 0;
        int var5 = 0;
        int var6 = this.field_o.field_k + (-TextFieldValidator.field_j.fullHeight + this.field_o.field_m) / 2;
        if (this.field_h > 0) {
          int incrementValue$0 = param0;
          param0++;
          this.field_c = incrementValue$0;
          int var7 = this.field_o.field_j - TextFieldValidator.field_j.fullWidth / 2;
          this.field_i[var4] = new LegacyButton(var5, this.field_c, of.field_a);
          this.field_i[var4].setPosition((byte) 127, var7, var6);
          this.field_i[var4].setSize(TextFieldValidator.field_j.fullHeight, 0, TextFieldValidator.field_j.fullWidth);
          QuickChatPhraseDefinition.applyGrayButtonPalette(-92, this.field_i[var4]);
          var4++;
        }
        if (this.field_y - 1 > this.field_h) {
          int incrementValue$1 = param0;
          param0++;
          this.field_e = incrementValue$1;
          int var7Lifetime1 = this.field_o.field_j + (this.field_o.field_g - TextFieldValidator.field_j.fullWidth / 2);
          this.field_i[var4] = new LegacyButton(var5, this.field_e, TextFieldValidator.field_j);
          this.field_i[var4].setPosition((byte) 122, var7Lifetime1, var6);
          this.field_i[var4].setSize(TextFieldValidator.field_j.fullHeight, 0, TextFieldValidator.field_j.fullWidth);
          QuickChatPhraseDefinition.applyGrayButtonPalette(-110, this.field_i[var4]);
        }
        return param0;
    }

    final int c(int param0) {
        int var2;
        int var3 = EscapeVector.obfuscationControl;
        if (this.field_f != null) {
          var2 = this.field_j;
        } else if (this.field_r != null) {
          var2 = this.field_v;
        } else {
          var2 = this.field_d;
        }
        if (param0 != 5201) {
          int[] discarded$0 = this.b(75);
        }
        return var2;
    }

    final boolean j(int param0) {
        if (!this.field_s.e((byte) -7)) {
          this.field_s.a((byte) 62);
        }
        this.f(true);
        boolean var2 = (this.k(-70));
        if (param0 >= -111) {
          return true;
        }
        if (var2) {
          return (var2);
        }
        boolean var2Lifetime1 = (this.h((byte) -30));
        if (var2Lifetime1) {
          return (var2Lifetime1);
        }
        return (var2Lifetime1);
    }

    private final void g(int param0, int param1) {
        this.field_t = new int[param0];
        int var3 = 0;
        var3 = qe.a(this.field_t, var3, true, this.field_x[this.field_h]);
        if (param1 <= this.field_j) {
          int incrementValue$0 = var3;
          var3++;
          this.field_t[incrementValue$0] = this.field_j;
        }
        if (this.field_v >= 0) {
          int incrementValue$1 = var3;
          var3++;
          this.field_t[incrementValue$1] = this.field_v;
        }
        int incrementValue$2 = var3;
        var3++;
        this.field_t[incrementValue$2] = this.field_d;
        if (this.field_c >= 0) {
          int incrementValue$3 = var3;
          var3++;
          this.field_t[incrementValue$3] = this.field_c;
        }
        if (0 <= this.field_e) {
          int incrementValue$4 = var3;
          var3++;
          this.field_t[incrementValue$4] = this.field_e;
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        param0 = -(param4 / 2) + param0;
        param4 = 3 * param4;
        param7 = param7 * 9;
        int var9 = (-param7 + param2) / 2;
        this.field_o = new gf(var9, param0, param7, param4, param6);
        this.field_o.a(15135, param1, param3, param5);
    }

    private final int a(int param0, int[] param1, int param2, int param3) {
        String stackIn_12_2 = null;
        int var7 = EscapeVector.obfuscationControl;
        try {
          int var5_int = 0;
          for (int var6 = 0; param3 > var6; var6++) {
            var5_int = var5_int + param1[var6];
          }
          var5_int = var5_int + param0;
          if (param2 == 6340704) {
            int stackIn_8_0 = var5_int;
            return stackIn_8_0;
          }
          int stackIn_6_0 = -83;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_11_0 = var5;
          StringBuilder stackIn_11_1 = new StringBuilder().append("ta.GB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final boolean h(byte param0) {
        di.field_d.a(this.a(-3, sf.field_c, LoginDialog.field_ob), (byte) 119, this.a(-3, dh.field_d, UiContainer.field_y));
        this.a(20364);
        boolean var2 = (this.a((byte) -91, true, Js5NetworkRequest.a((byte) 15, -1)));
        int var3 = -122 / ((param0 - 73) / 47);
        if (var2) {
          return (var2);
        }
        return (var2);
    }

    private final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = this.field_o.field_k + this.field_o.field_m + 5;
        int var7 = 20;
        if (null != this.field_f) {
          var7 = 10;
        } else if (this.field_r != null) {
          var7 = 10;
        }
        int var8 = -this.field_o.field_k + (-this.field_o.field_m - var7) + 440;
        int var9 = this.field_o.field_j - 3 * TextFieldValidator.field_j.fullWidth / param2;
        int var10 = 3 * TextFieldValidator.field_j.fullWidth + this.field_o.field_g;
        this.field_n = new gf(var9, var6, var10, var8, param4);
        this.field_n.a(15135, param0, param1, param3);
    }

    private final LegacyButton d(boolean param0) {
        int var2 = di.field_d.field_h;
        if (!param0) {
          Sprite discarded$0 = this.f(74, -122);
        }
        if (var2 < 0) {
          return null;
        }
        LegacyButton var3 = TetherHumStream.a(this.field_p[this.field_h], var2, 0);
        if (var3 != null) {
          return var3;
        }
        if (this.field_f != null &&
          this.field_j == var2) {
          return this.field_f;
        }
        if (null != this.field_r &&
          this.field_v == var2) {
          return this.field_r;
        }
        if (this.field_d != var2) {
          return null;
        }
        return this.field_a;
    }

    private final void a(int param0, Sprite param1) {
        if (param1 == null) {
          return;
        }
        int var3_int = this.g(true);
        if (0 > var3_int) {
          return;
        }
        try {
          BinaryBitmapFont var4 = ByteStorage.gameFont;
          int var5 = var4.maxAscent + var4.maxDescent;
          int var6 = 6340704;
          int var7 = 10551200;
          String var8 = kg.field_a + " ";
          String var9 = "" + ProxySocketConnector.field_t[var3_int];
          String var10 = ResizableModalPanel.field_T + " ";
          String var11 = "" + ProxySocketConnector.field_s[var3_int];
          int var12 = (640 + param1.fullWidth) / param0;
          int var13 = -var12 + (this.field_n.field_g + this.field_n.field_j);
          int var14 = this.a(var12, 15930, var4, var13);
          int var15 = var5 * 2;
          int var16 = this.field_n.field_k - (-((-var15 + this.field_n.field_m) / 2) - var4.maxAscent);
          var4.drawRight(var8, var14, var16, var6, -1);
          var4.drawLeft(var9, var14, var16, var7, -1);
          var16 = var16 + var5;
          var4.drawRight(var10, var14, var16, var6, -1);
          var4.drawLeft(var11, var14, var16, var7, -1);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "ta.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void f(byte param0) {
        int var6 = EscapeVector.obfuscationControl;
        en var2 = TrackerMusicDefinition.field_f;
        if (param0 > -72) {
          int discarded$0 = this.g(true);
        }
        int var3 = var2.c(this.field_b, 1);
        this.field_y = this.b(var3, (byte) 123);
        this.field_u = new int[this.field_y];
        for (int var4 = 0; var4 < this.field_y; var4++) {
          int var5 = this.a((byte) 125, var3, var4);
          this.field_u[var4] = var5;
        }
    }

    private final void d(int param0, int param1) {
        int var3 = 640;
        int var4 = 480;
        Sprite var5 = new Sprite(var3, var4);
        int[] var20 = new int[4];
        LegacyButton[] var7 = this.field_p[this.field_h];
        SoftwareRasterizer.saveClip(var20);
        if (param0 != 4551) {
          int discarded$1 = this.l(122);
        }
        var5.bindAsFramebuffer();
        nm.a((byte) -103, -1, var7);
        AlphaContainer.field_D.a(124);
        SoftwareRasterizer.restoreClip(var20);
        var5.trimTransparentEdges();
        int var8 = IterableNodeHashTable.minimumButtonX(var7, (byte) 26);
        int var9 = on.a(var7, -49);
        int var10 = ResizableModalPanel.minimumButtonY(var7, (byte) -122);
        int var11 = pb.a((byte) 2, var7);
        var5.fullHeight = var11 - var10;
        var5.offsetX = var5.offsetX - var8;
        var5.fullWidth = var9 - var8;
        var5.offsetY = var5.offsetY - var10;
        int var12 = 40;
        int var13 = 0;
        if (pf.field_i == param1) {
          var13 = 0;
        } else if (WhirlpoolHasher.field_f == param1) {
          var13 = -var5.fullWidth + var3 - 1;
        }
        int var14 = var8;
        gb var15 = new gb(var13, var10);
        gb var16 = new gb(var14, var10);
        this.field_s = new ea(var15, var16, var5, var12);
    }

    private final int a(int param0, BinaryBitmapFont param1, int param2, int param3, int param4, int param5) {
        String stackIn_9_2 = null;
        try {
          if (~this.field_b != param0) {
            this.field_v = -1;
            this.field_r = null;
            int stackIn_3_0 = param2;
            return stackIn_3_0;
          }
          int var7_int = 3;
          String var8 = DynamicTerrainRenderer.field_m;
          int var9 = SeekerMine.a(var8, 16777215, param1);
          int var10 = (-var9 + 640) / 2;
          this.field_r = new LegacyButton(var7_int, param2, var8, param3, param5, param1);
          this.field_r.setPosition((byte) 124, var10, param4);
          this.field_v = param2;
          int stackIn_5_0 = this.field_v + 1;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var7 = decompiledCaughtException;
          RuntimeException stackIn_8_0 = var7;
          StringBuilder stackIn_8_1 = new StringBuilder().append("ta.T(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    private final void h(int param0) {
        int var2 = di.field_d.field_h;
        if (null != this.field_f) {
          boolean var3 = (this.field_f.actionId == var2);
          this.field_f.draw(-16383, (var3));
        }
        if (param0 != -1) {
          int discarded$0 = this.b(72, 122);
        }
        if (null != this.field_r) {
          boolean var3Lifetime1 = (var2 == this.field_r.actionId);
          this.field_r.draw(-16383, (var3Lifetime1));
        }
        if (this.field_a != null) {
          boolean var3Lifetime2 = (var2 == this.field_a.actionId);
          this.field_a.draw(param0 - 16382, (var3Lifetime2));
        }
    }

    private final void a(int param0) {
        if (param0 != 20364) {
          boolean discarded$0 = this.k(2);
        }
        if (di.field_d.field_e) {
          LegacyButton var2 = this.d(true);
          int var3 = PasswordValidator.a(-93, var2);
          ObjectSpriteSet.field_e.playSampleWithPan(ArchiveRequest.field_w, 100, IterableNodeHashTable.field_c * 1536 / 64, var3);
        }
    }

    private final Sprite b(boolean param0) {
        int var2 = this.g(param0);
        if (var2 < 0) {
          return null;
        }
        Sprite var3 = this.f(-4343, var2);
        if (var3 != null) {
          int var4 = (640 - var3.fullWidth) / 2;
          int var5 = this.field_n.field_k + (this.field_n.field_m - var3.fullHeight) / 2;
          var3.drawTransparent(var4, var5);
        }
        return var3;
    }

    private final int a(int param0, BinaryBitmapFont param1, byte param2, int param3, int param4, int param5) {
        String stackIn_8_2 = null;
        try {
          int var7_int = 3;
          String var8 = GameKeyHandler.field_a;
          if (param2 != 57) {
            int stackIn_2_0 = 94;
            return stackIn_2_0;
          }
          int var9 = SeekerMine.a(var8, 16777215, param1);
          int var10 = (640 - var9) / 2;
          this.field_a = new LegacyButton(var7_int, param3, var8, param5, param4, param1);
          this.field_a.setPosition((byte) 121, var10, param0);
          this.field_d = param3;
          int stackIn_4_0 = 1 + this.field_d;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var7 = decompiledCaughtException;
          RuntimeException stackIn_7_0 = var7;
          StringBuilder stackIn_7_1 = new StringBuilder().append("ta.DB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final int d(byte param0) {
        if (param0 >= -48) {
          return 57;
        }
        int var2 = 0;
        var2 = var2 + this.field_x[this.field_h].length;
        if (0 <= this.field_j) {
          var2++;
        }
        if (this.field_v >= 0) {
          var2++;
        }
        if (this.field_d >= 0) {
          var2++;
        }
        if (this.field_c >= 0) {
          var2++;
        }
        if (0 <= this.field_e) {
          var2++;
        }
        return var2;
    }

    private final void d(int param0) {
        int var2 = -64 / ((param0 + 87) / 34);
        this.field_n.c(50);
        int var3 = this.g(true);
        if (var3 >= 0) {
          Sprite var4 = this.b(true);
          this.b(2, var4);
          this.a(var4, (byte) -33);
          this.a(2, var4);
        } else {
          this.c(true);
        }
        this.e(true);
    }

    private final void a(Sprite param0, byte param1) {
        String stackIn_9_0 = null;
        String stackIn_16_2 = null;
        try {
          if (param0 == null) {
            return;
          }
          int var3_int = this.g(true);
          if (0 > var3_int) {
            return;
          }
          BinaryBitmapFont var4 = ByteStorage.gameFont;
          int var5 = 10551200;
          int var6 = 6340704;
          String var7 = ResourceArchive.field_f[var3_int];
          if (!this.a(var3_int, 6144)) {
            stackIn_9_0 = StatefulTextPainter.field_q;
          } else {
            stackIn_9_0 = bg.field_d;
          }
          String var8 = stackIn_9_0;
          String var9 = var7 + "<br>" + "<col=" + Integer.toHexString(var6) + ">" + var8;
          int var10 = 18;
          if (param1 != -33) {
            int[] discarded$0 = this.a((byte) -123, 67, 100, -110);
          }
          int var11 = var10 + this.field_n.field_j;
          int var12 = -var11 - var10 + (-param0.fullWidth + 640) / 2;
          int var13 = var4.paragraphHeight(var9, var12, 0);
          int var14 = this.field_n.field_k + (this.field_n.field_m - var13) / 2;
          var4.drawParagraph(var9, var11, var14, var12, var13, var5, -1, 0, 0, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_15_0 = var3;
          StringBuilder stackIn_15_1 = new StringBuilder().append("ta.FB(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void e(byte param0) {
        if (param0 != 111) {
          this.field_r = (LegacyButton) null;
        }
        en var2 = TrackerMusicDefinition.field_f;
        if (var2.b(-106)) {
          this.field_b = 0;
        } else {
          this.field_b = 1;
        }
    }

    private final int g(boolean param0) {
        if (this.field_z >= 0 &&
          this.field_x[this.field_h].length > this.field_z) {
          return this.field_x[this.field_h][this.field_z];
        }
        if (0 <= this.field_m &&
          this.field_x[this.field_h].length > this.field_m) {
          return this.field_x[this.field_h][this.field_m];
        }
        if (!param0) {
          field_w = -81;
        }
        return -1;
    }

    private final Sprite[] a(int param0, byte param1) {
        int var7 = EscapeVector.obfuscationControl;
        int[] var8 = this.field_x[param0];
        int[] var3 = var8;
        Sprite[] var4 = new Sprite[var8.length];
        int var5 = 0;
        if (param1 >= -28) {
          return (Sprite[]) null;
        }
        while (var5 < var4.length) {
          int var6 = var8[var5];
          var4[var5] = this.f(-4343, var6);
          var5++;
        }
        return var4;
    }

    private final int[] a(int[] param0, byte param1, int param2) {
        String stackIn_9_2 = null;
        int var8 = EscapeVector.obfuscationControl;
        try {
          int[] var9 = new int[param0.length];
          int[] var4 = var9;
          for (int var5 = 0; param0.length > var5; var5++) {
            int var6 = param0[var5];
            int var7 = param2 * var6;
            var9[var5] = var7;
          }
          int var5Lifetime1 = -7 % ((61 - param1) / 36);
          int[] stackIn_5_0 = var4;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4_ref = decompiledCaughtException;
          RuntimeException stackIn_8_0 = var4_ref;
          StringBuilder stackIn_8_1 = new StringBuilder().append("ta.RA(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void releaseStatics(int guard) {
        if (guard != 0) {
          field_k = (String) null;
        }
        field_k = null;
        field_g = null;
    }

    final void i(int param0) {
        SoftwareRasterizer.clearFramebuffer();
        SelfDestructEffects.b(2);
        pb.a(4);
        if (param0 != 3) {
          this.field_i = (LegacyButton[]) null;
        }
        this.g(16317);
        this.d(-3);
        this.h(param0 - 4);
    }

    private final int[] b(int param0, int param1, int param2) {
        int var7 = EscapeVector.obfuscationControl;
        int[] var4 = new int[param1];
        int var5 = 0;
        if (param0 != 22387) {
          this.f((byte) 26);
        }
        while (var5 < param1) {
          int var6 = param2 / param1;
          if (0 == var5) {
            var6 = var6 + param2 % param1;
          }
          var4[var5] = var6;
          var5++;
        }
        return var4;
    }

    private final void a(byte param0) {
        int var8 = EscapeVector.obfuscationControl;
        int[] var2 = this.b(param0 ^ -105);
        this.field_x = new int[this.field_y][];
        int var3 = 0;
        if (param0 != -105) {
          this.g((byte) -10);
        }
        for (int var4 = 0; this.field_y > var4; var4++) {
          int var5 = this.field_u[var4];
          int[] array$0 = new int[var5];
          this.field_x[var4] = array$0;
          for (int var6 = 0; var6 < var5; var6++) {
            int var7 = var2[var3++];
            this.field_x[var4][var6] = var7;
          }
        }
    }

    private final int b(int param0, byte param1) {
        if (param1 <= 98) {
          return -85;
        }
        int var3 = param0 / 8;
        if (param0 % 8 != 0) {
          var3++;
        }
        this.field_y = var3 / 2;
        if (this.field_y <= 0) {
          this.field_y = 1;
        }
        if (0 != var3 % 2) {
          var3++;
        }
        return this.field_y;
    }

    private final void a(int param0, LegacyButton param1) {
        if (param1 == null) {
          return;
        }
        int var3_int = mj.field_d;
        if (var3_int != param1.revealUntilTick) {
          return;
        }
        try {
          int var4 = PasswordValidator.a(-87, param1);
          ObjectSpriteSet.field_e.playSampleWithPan(pc.field_a, 100, IterableNodeHashTable.field_c * 6144 / param0, var4);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "ta.P(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final int l(int param0) {
        int var2 = di.field_d.field_h;
        if (0 > var2 ||
          this.field_t.length <= var2) {
          return -1;
        }
        if (param0 != -8477) {
          return -64;
        }
        int var3 = this.field_t[var2];
        return var3;
    }

    private final Sprite f(int param0, int param1) {
        Sprite var3 = CheckboxPainter.field_c;
        if (this.a(param1, param0 ^ -2295)) {
          var3 = TrackerMusicDefinition.field_f.b(param1, 117);
        }
        if (this.c(73, param1)) {
          var3 = DualLinkDequeIterator.field_e;
        }
        if (param0 != -4343) {
          this.field_a = (LegacyButton) null;
        }
        return var3;
    }

    private final boolean a(int param0, int param1) {
        int var6 = EscapeVector.obfuscationControl;
        int[] var7 = this.field_l;
        int[] var3 = var7;
        for (int var4 = 0; var4 < var7.length; var4++) {
          int var5 = var7[var4];
          if (~param0 == ~var5) {
            return true;
          }
        }
        if (param1 == 6144) {
          return false;
        }
        this.field_d = -116;
        return false;
    }

    private final int a(BinaryBitmapFont param0, int param1, int param2, int param3, int param4, int param5) {
        String stackIn_9_2 = null;
        try {
          if (!aj.b(-122)) {
            this.field_j = -1;
            this.field_f = null;
            int stackIn_3_0 = param5;
            return stackIn_3_0;
          }
          int var7_int = 3;
          String var8 = IntrusiveDeque.field_e;
          int var9 = SeekerMine.a(var8, 16777215, param0);
          this.field_f = new LegacyButton(var7_int, param5, var8, param2, param3, param0);
          int var10 = (640 - var9) / 2;
          int var11 = -57 / ((param1 - 65) / 52);
          this.field_f.setPosition((byte) 13, var10, param4);
          this.field_j = param5;
          int stackIn_5_0 = this.field_j + 1;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var7 = decompiledCaughtException;
          RuntimeException stackIn_8_0 = var7;
          StringBuilder stackIn_8_1 = new StringBuilder().append("ta.G(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    private final void c(int param0, byte param1) {
        int var3 = WhirlpoolHasher.field_f;
        if (param0 < this.field_h) {
          var3 = pf.field_i;
        } else {
          var3 = WhirlpoolHasher.field_f;
        }
        this.field_h = param0;
        if (this.field_h >= this.field_y) {
          this.field_h = this.field_y - 1;
        }
        this.field_z = -1;
        if (0 > this.field_h) {
          this.field_h = 0;
        }
        this.field_m = -1;
        this.g((byte) -60);
        int var4 = this.d((byte) -128);
        this.g(var4, 0);
        di.field_d = new wc(var4);
        int var5 = da.field_b.c(5201);
        int var6 = da.field_b.a(-3, dh.field_d, UiContainer.field_y);
        di.field_d.a(117, true, var6, var5);
        mj.field_d = 0;
        gi.a((byte) -70);
        int var7 = -97 % ((param1 + 21) / 32);
        this.d(4551, var3);
    }

    ta() {
        this.field_q = 400;
        this.field_z = -1;
        this.field_h = 0;
        this.field_m = -1;
        this.e((byte) 111);
        this.field_l = TrackerMusicDefinition.field_f.a(this.field_b, (byte) -32);
        this.f((byte) -128);
        this.g((byte) 102);
        this.d(4551, pf.field_i);
    }

    static {
        field_k = "Type your age in years";
        field_w = 0;
        field_g = "Log in";
    }
}
