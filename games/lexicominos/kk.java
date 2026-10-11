/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kk extends ve {
    private int field_m;
    private int field_j;
    private int field_h;
    static int field_o;
    static String field_n;
    private int field_g;
    static int field_r;
    static String field_q;
    private int field_f;
    private le field_k;
    static String field_i;
    private boolean field_p;
    private String field_l;

    final void a(int param0, int param1, String param2, le param3, int param4) {
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        le var7 = null;
        rj var8 = null;
        rj var9 = null;
        try {
          if (param2 == null) {
            this.field_c = null;
            return;
          }
          if (this.field_k == param3 &&
            this.field_p &&
            this.field_f == 0 &&
            null != this.field_l &&
            this.field_l.equals(param2)) {
            return;
          }
          this.field_l = param2;
          if (param0 < 94) {
            var7 = (le) null;
            this.a(-77, 114, (String) null, (le) null, -62);
          }
          this.field_p = true;
          this.field_k = param3;
          this.field_f = 0;
          var8 = this.a(param3, param2, (byte) 121, param4);
          var9 = var8;
          var8.field_a[0] = param1;
          var9.field_a[param2.length()] = param3.b(param2) + param1;
          fa.a(var9, param3, 0, param2, (byte) 123);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_17_0 = var6;
          stackIn_17_1 = new StringBuilder().append("kk.K(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param3 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param4).append(')').toString());
        }
    }

    final static java.applet.Applet c(int param0) {
        if (pg.field_b != null) {
          return pg.field_b;
        }
        if (param0 != -14047) {
          kk.c(7);
          return (java.applet.Applet) ((Object) c.field_j);
        }
        return (java.applet.Applet) ((Object) c.field_j);
    }

    final void a(le param0, int param1, int param2, int param3, int param4, int param5, int param6, String param7) {
        rj stackIn_36_0;
        rj stackIn_36_1;
        int stackIn_36_2;
        int stackIn_36_3;
        rj stackIn_37_0 = null;
        rj stackIn_37_1 = null;
        int stackIn_37_4 = 0;
        rj stackIn_40_0 = null;
        le stackIn_40_1 = null;
        int stackIn_41_2 = 0;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_47_2 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_50_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        rj var14 = null;
        int var15 = 0;
        String[] var16 = null;
        String[] var17 = null;
        int var12Lifetime1;
        var15 = Lexicominos.field_L ? 1 : 0;
        try {
          if (param2 == 0) {
            param2 = param0.field_C;
          }
          if (param7 == null) {
            this.field_c = null;
            return;
          }
          if (this.field_k == param0 &&
            !this.field_p &&
            param1 == this.field_f &&
            this.field_h == param3 &&
            this.field_g == param2 &&
            param5 == this.field_m &&
            param4 == this.field_j &&
            this.field_l != null &&
            this.field_l.equals(param7)) {
            return;
          }
          this.field_l = param7;
          this.field_h = param3;
          this.field_f = param1;
          this.field_j = param4;
          this.field_g = param2;
          this.field_p = false;
          this.field_k = param0;
          this.field_m = param5;
          var16 = new String[param0.a(param7, param4) + 1];
          var17 = var16;
          if (param6 >= -113) {
            this.field_k = (le) null;
          }
          var10 = Math.max(1, param0.a(param7, new int[]{param4}, var17));
          if (this.field_h == 3 &&
            1 == var10) {
            this.field_h = 1;
          }
          this.field_c = new rj[var10];
          if (this.field_h == 0) {
            var11 = param0.field_E;
          } else {
            if (this.field_h == 1) {
              var11 = (this.field_m - var10 * this.field_g >> 1) + param0.field_E;
            } else {
              if (2 != this.field_h) {
                var12 = (this.field_m - this.field_g * var10) / (var10 + 1);
                if (0 > var12) {
                  var12 = 0;
                }
                var11 = param0.field_E + var12;
                this.field_g = this.field_g + var12;
              } else {
                var11 = -(this.field_g * var10) + this.field_m - param0.field_G;
              }
            }
          }
          for (var12Lifetime1 = 0; var10 > var12Lifetime1; var12Lifetime1++) {
            var13 = var16[var12Lifetime1];
            stackIn_36_0 = null;
            stackIn_36_1 = null;
            stackIn_36_2 = var11 - param0.field_E;
            stackIn_36_3 = param0.field_G + var11;
            if (var13 == null) {
              stackIn_37_0 = null;
              stackIn_37_1 = null;
              stackIn_37_4 = 0;
            } else {
              stackIn_37_0 = null;
              stackIn_37_1 = null;
              stackIn_37_4 = var13.length();
            }
            var14 = new rj(stackIn_36_2, stackIn_36_3, stackIn_37_4);
            var14.field_a[0] = 0;
            if (var13 != null) {
              var14.field_a[var13.length()] = param0.b(var13);
              stackIn_40_0 = var14;
              stackIn_40_1 = (le) (param0);
              if (param1 != 3) {
                stackIn_41_2 = 0;
              } else {
                stackIn_41_2 = this.a(param4, false, param0.b(var13), var13);
              }
              fa.a(stackIn_40_0, stackIn_40_1, stackIn_41_2, var13, (byte) 124);
            }
            var11 = var11 + param2;
            this.field_c[var12Lifetime1] = var14;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_46_0 = var9;
          stackIn_46_1 = new StringBuilder().append("kk.M(");
          if (param0 == null) {
            stackIn_47_2 = "null";
          } else {
            stackIn_47_2 = "{...}";
          }
          stackIn_49_1 = ((StringBuilder) (Object) stackIn_46_1).append(stackIn_47_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_50_2 = "null";
          } else {
            stackIn_50_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_46_0), ((StringBuilder) (Object) stackIn_49_1).append(stackIn_50_2).append(')').toString());
        }
    }

    private final rj a(le param0, String param1, byte param2, int param3) {
        rj var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        rj var7 = null;
        rj stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var7 = new rj(-param0.field_E + param3, param0.field_G + param3, param1.length());
          var5 = var7;
          var6 = -83 % ((param2 - 29) / 32);
          this.field_c = new rj[]{var7};
          stackIn_1_0 = var5;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_4_0 = var5_ref;
          stackIn_4_1 = new StringBuilder().append("kk.P(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void d(int param0) {
        if (param0 < -70) {
          field_n = null;
          field_i = null;
          field_q = null;
          return;
        }
        field_r = 82;
        field_n = null;
        field_i = null;
        field_q = null;
    }

    final void a(int param0, le param1, String param2, int param3, byte param4) {
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7 = 0;
        String var8 = null;
        rj var9 = null;
        try {
          if (param2 == null) {
            this.field_c = null;
            return;
          }
          if (this.field_k == param1 &&
            this.field_p &&
            this.field_f == 1 &&
            null != this.field_l &&
            this.field_l.equals(param2)) {
            return;
          }
          this.field_k = param1;
          this.field_p = true;
          if (param4 != -11) {
            var8 = (String) null;
            this.a(59, (le) null, (String) null, 117, (byte) -57);
          }
          this.field_f = 1;
          var9 = this.a(param1, param2, (byte) 93, param0);
          var7 = param1.b(param2);
          var9.field_a[0] = -(var7 >> 1) + param3;
          var9.field_a[param2.length()] = param3 + (var7 >> 1);
          fa.a(var9, param1, 0, param2, (byte) 107);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_16_0 = var6;
          stackIn_16_1 = new StringBuilder().append("kk.J(").append(param0).append(',');
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
          throw ld.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void a(le param0, String param1, byte param2, int param3, int param4) {
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        String var7 = null;
        rj var9 = null;
        rj var10 = null;
        try {
          if (param1 == null) {
            this.field_c = null;
            return;
          }
          if (param0 == this.field_k &&
            this.field_p &&
            this.field_f == 2 &&
            this.field_l != null &&
            this.field_l.equals(param1)) {
            return;
          }
          this.field_k = param0;
          this.field_l = param1;
          if (param2 > -69) {
            var7 = (String) null;
            this.a((le) null, (String) null, (byte) 76, -31, 44);
          }
          this.field_p = true;
          this.field_f = 2;
          var9 = this.a(param0, param1, (byte) -36, param4);
          var10 = var9;
          var10.field_a[0] = -param0.b(param1) + param3;
          var10.field_a[param1.length()] = param3;
          fa.a(var10, param0, 0, param1, (byte) 120);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_16_0 = var6;
          stackIn_16_1 = new StringBuilder().append("kk.O(");
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
          throw ld.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public kk() {
    }

    static {
        field_n = "This tutorial consists of a series of demonstrations, each teaching one lesson. Move and rotate the falling blocks to make words.";
        field_r = -1;
        field_q = "The game is over when a falling block cannot fully enter the playing area.<br><br>For further details, see the instructions, which are available from the main menu and the pause menu.";
        field_i = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
    }
}
