/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kl extends cr {
    static String field_Nb;
    int field_Kb;
    static cr field_Ib;
    private cr[] field_Mb;
    private cr[] field_Lb;
    static String field_Jb;
    private cr field_Hb;

    private final void a(int param0, int param1, int param2) {
        cr dupTemp$0 = null;
        int var4;
        int var5;
        int var6;
        int var7;
        java.applet.Applet var8;
        int var9;
        int var4Lifetime1;
        var7 = Vertigo2.field_L ? 1 : 0;
        for (var4 = 0; this.field_Mb.length > var4; var4++) {
          var5 = var4 * this.field_Fb / this.field_Mb.length;
          var6 = this.field_Fb * (1 + var4) / this.field_Mb.length;
          this.field_Mb[var4].field_wb = var5;
          this.field_Mb[var4].field_N = 0;
          this.field_Mb[var4].field_Fb = -var5 + var6;
          this.field_Mb[var4].field_db = param1;
        }
        if (param0 != -12320) {
          var8 = (java.applet.Applet) null;
          kl.a((byte) -49, (String) null, (java.applet.Applet) null);
        }
        this.field_Hb.a(param0 ^ -12414, this.field_Fb, this.field_db - param1, param1, 0);
        var9 = 0;
        var4Lifetime1 = var9;
        while (this.field_Lb.length > var9) {
          this.field_Lb[var9].a(121, -(2 * param2) + this.field_Hb.field_Fb, -(param2 * 2) + this.field_Hb.field_db, param2, param2);
          if (var9 != this.field_Kb) {
            dupTemp$0 = this.field_Lb[var9];
            dupTemp$0.field_wb = dupTemp$0.field_wb + 10000;
          }
          var9++;
        }
    }

    final static String a(byte param0, String param1, java.applet.Applet param2) {
        try {
          int var5 = 0;
          String var3 = null;
          String[] var4 = null;
          int var6 = 0;
          int var7 = 0;
          java.applet.Applet var8 = null;
          String stackIn_8_0 = null;
          Object stackIn_13_0 = null;
          RuntimeException stackIn_16_0 = null;
          StringBuilder stackIn_16_1 = null;
          String stackIn_17_2 = null;
          StringBuilder stackIn_19_1 = null;
          String stackIn_20_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var3_ref = null;
          RuntimeException var3_ref2 = null;
          var7 = Vertigo2.field_L ? 1 : 0;
          try {
            if (param0 != 70) {
              var8 = (java.applet.Applet) null;
              kl.a((byte) 75, (String) null, (java.applet.Applet) null);
            }
            try {
              var3 = (String) (je.a(param2, false, "getcookies"));
              var4 = jr.a((byte) -9, ';', var3);
              for (var5 = 0; var4.length > var5; var5++) {
                var6 = var4[var5].indexOf('=');
                if (var6 >= 0 &&
                  var4[var5].substring(0, var6).trim().equals(param1)) {
                  stackIn_8_0 = var4[var5].substring(var6 + 1).trim();
                  return stackIn_8_0;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3_ref = decompiledCaughtException;
            }
            stackIn_13_0 = null;
            return (String) (stackIn_13_0);
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_16_0 = var3_ref2;
            stackIn_16_1 = new StringBuilder().append("kl.F(").append(param0).append(',');
            if (param1 == null) {
              stackIn_17_2 = "null";
            } else {
              stackIn_17_2 = "{...}";
            }
            stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
            if (param2 == null) {
              stackIn_20_2 = "null";
            } else {
              stackIn_20_2 = "{...}";
            }
            throw wn.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void b(boolean param0) {
        field_Jb = null;
        field_Nb = null;
        field_Ib = null;
        if (!param0) {
          kl.b(false);
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this.field_Fb = param3;
        this.field_db = param5;
        this.field_N = param6;
        if (param1 != 12318) {
          this.field_Hb = (cr) null;
        }
        this.field_wb = param2;
        this.a(param1 ^ -2, param4, param0);
    }

    kl(long param0, cr param1, String[] param2, cr param3, cr[] param4, int param5) {
        super(param0, (cr) null);
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        cr var9 = null;
        int var11 = 0;
        int var8_intLifetime1;
        try {
          this.field_Mb = new cr[param2.length];
          this.field_Hb = new cr(0L, param3);
          this.field_Lb = param4;
          for (var8_int = 0; param2.length > var8_int; var8_int++) {
            var9 = new cr(0L, param1);
            var9.field_S = param2[var8_int];
            this.field_Mb[var8_int] = var9;
            this.b(var9, 119);
          }
          this.b(this.field_Hb, 122);
          var11 = 0;
          var8_intLifetime1 = var11;
          while (var11 < param4.length) {
            this.field_Hb.b(param4[var11], 122);
            var11++;
          }
          this.field_Kb = param5;
          this.field_Mb[param5].field_V = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_11_0 = var8;
          stackIn_11_1 = new StringBuilder().append("kl.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param4 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param5).append(')').toString());
        }
    }

    final void k(int param0) {
        int var2 = 0;
        cr dupTemp$0 = null;
        cr dupTemp$1 = null;
        int var3;
        var3 = Vertigo2.field_L ? 1 : 0;
        for (var2 = param0; this.field_Mb.length > var2; var2++) {
          if (this.field_Kb != var2 &&
            0 != this.field_Mb[var2].field_tb) {
            this.field_Mb[this.field_Kb].field_V = false;
            dupTemp$0 = this.field_Lb[this.field_Kb];
            dupTemp$0.field_wb = dupTemp$0.field_wb + 10000;
            this.field_Kb = var2;
            this.field_Mb[var2].field_V = true;
            dupTemp$1 = this.field_Lb[var2];
            dupTemp$1.field_wb = dupTemp$1.field_wb - 10000;
          }
        }
    }

    static {
        field_Nb = "Press TAB to chat or F10 to open Quick Chat.";
        field_Jb = "Creating a Jagex account is simple and free. Your account will remember your progress, highscores and achievements in every game. You can also use it to play some of our multiplayer games - and Jagex's other games!<br><br><col=2164A2>Please note - if you have a RuneScape account, you can click 'Go Back' and use your existing account to log in!</col>";
    }
}
