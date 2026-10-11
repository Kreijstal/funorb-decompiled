/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vn {
    static int field_g;
    pg field_e;
    static int field_d;
    static in field_i;
    private pg field_h;
    static int field_c;
    static String field_j;
    static String field_a;
    static qb field_b;
    static String field_f;

    final pg a(boolean param0) {
        if (!param0) {
          return (pg) null;
        }
        pg var2 = this.field_e.field_a;
        if (this.field_e == var2) {
          this.field_h = null;
          return null;
        }
        this.field_h = var2.field_a;
        return var2;
    }

    final pg c(boolean param0) {
        pg var2 = this.field_e.field_b;
        if (var2 == this.field_e) {
          return null;
        }
        var2.a(param0);
        return var2;
    }

    final pg d(boolean param0) {
        pg var2 = this.field_e.field_a;
        if (this.field_e == var2) {
          return null;
        }
        var2.a(param0);
        return var2;
    }

    final static void a(byte param0) {
        if (!qe.field_p) {
          throw new IllegalStateException();
        }
        lh.field_n = true;
        tj.a(true, (byte) -125);
        if (param0 != 4) {
          field_d = 12;
        }
        fj.field_j = 0;
    }

    private final void a(vn param0, int param1, pg param2) {
        pg var4 = null;
        pg var5 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        try {
          if (param1 != 3) {
            var5 = (pg) null;
            this.a((pg) null, -100);
          }
          var4 = this.field_e.field_a;
          this.field_e.field_a = param2.field_a;
          param2.field_a.field_b = this.field_e;
          if (this.field_e != param2) {
            param2.field_a = param0.field_e.field_a;
            param2.field_a.field_b = param2;
            var4.field_b = param0.field_e;
            param0.field_e.field_a = var4;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_7_0 = var4_ref;
          stackIn_7_1 = new StringBuilder().append("vn.Q(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final void a(vn param0, boolean param1) {
        try {
          this.a(param0, 3, this.field_e.field_b);
          if (param1) {
            eg var4 = (eg) null;
            vn.a((eg) null, false, (eg) null, (eg) null);
          }
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "vn.O(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final pg a(int param0) {
        if (param0 != 0) {
          field_a = (String) null;
        }
        pg var2 = this.field_h;
        if (this.field_e == var2) {
          this.field_h = null;
          return null;
        }
        this.field_h = var2.field_b;
        return var2;
    }

    final static void a(byte[] param0, int param1, int param2, int param3, int param4, int param5, int param6, byte[] param7, int param8, boolean param9) {
        int var12 = 0;
        int incrementValue$3 = 0;
        int incrementValue$5 = 0;
        int incrementValue$7 = 0;
        int incrementValue$9 = 0;
        int incrementValue$1 = 0;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_48_2 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_51_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        CharSequence var15 = null;
        int var10_intLifetime1;
        int var13Lifetime1;
        int var10_intLifetime2;
        int var10_intLifetime3;
        int var10_intLifetime4;
        var14 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var11 = -(param1 >> 2);
          param1 = -(param1 & 3);
          for (var12 = -param6; var12 < 0; var12++) {
            for (var13 = var11; var13 < 0; var13++) {
              boolean decompiledFrameRemainder4 = true;
              var10_int = param0[param2++];
              if (0 != var10_int && (param9 ||
                param7[param4] == 0)) {
                incrementValue$3 = param4;
                param4++;
                param7[incrementValue$3] = (byte)var10_int;
                decompiledFrameRemainder4 = false;
              }
              else {
                param4++;
              }
              boolean decompiledFrameRemainder3 = true;
              var10_intLifetime2 = param0[param2++];
              if (var10_intLifetime2 != 0 && (param9 ||
                param7[param4] == 0)) {
                incrementValue$5 = param4;
                param4++;
                param7[incrementValue$5] = (byte)var10_intLifetime2;
                decompiledFrameRemainder3 = false;
              }
              else {
                param4++;
              }
              boolean decompiledFrameRemainder2 = true;
              var10_intLifetime3 = param0[param2++];
              if (var10_intLifetime3 != 0 && (param9 ||
                param7[param4] == 0)) {
                incrementValue$7 = param4;
                param4++;
                param7[incrementValue$7] = (byte)var10_intLifetime3;
                decompiledFrameRemainder2 = false;
              }
              else {
                param4++;
              }
              boolean decompiledFrameRemainder1 = true;
              var10_intLifetime4 = param0[param2++];
              if (var10_intLifetime4 != 0 && (param9 ||
                param7[param4] == 0)) {
                incrementValue$9 = param4;
                param4++;
                param7[incrementValue$9] = (byte)var10_intLifetime4;
                decompiledFrameRemainder1 = false;
              }
              else {
                param4++;
              }
            }
            for (var13Lifetime1 = param1; var13Lifetime1 < 0; var13Lifetime1++) {
              boolean decompiledFrameRemainder0 = true;
              var10_intLifetime1 = param0[param2++];
              if (var10_intLifetime1 != 0 && (param9 ||
                param7[param4] == 0)) {
                incrementValue$1 = param4;
                param4++;
                param7[incrementValue$1] = (byte)var10_intLifetime1;
                decompiledFrameRemainder0 = false;
              }
              else {
                param4++;
              }
            }
            param4 = param4 + param8;
            param2 = param2 + param5;
          }
          if (param3 < 102) {
            var15 = (CharSequence) null;
            vn.a((CharSequence) null, -78);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_47_0 = var10;
          stackIn_47_1 = new StringBuilder().append("vn.F(");
          if (param0 == null) {
            stackIn_48_2 = "null";
          } else {
            stackIn_48_2 = "{...}";
          }
          stackIn_50_1 = ((StringBuilder) (Object) stackIn_47_1).append(stackIn_48_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_51_2 = "null";
          } else {
            stackIn_51_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_47_0), ((StringBuilder) (Object) stackIn_50_1).append(stackIn_51_2).append(',').append(param8).append(',').append(param9).append(')').toString());
        }
    }

    final pg a(pg param0, int param1) {
        pg var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        Object stackIn_5_0 = null;
        pg stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == null) {
            var3 = this.field_e.field_b;
          } else {
            var3 = param0;
          }
          if (this.field_e == var3) {
            this.field_h = null;
            stackIn_5_0 = null;
            return (pg) (stackIn_5_0);
          }
          this.field_h = var3.field_b;
          var4 = -40 / ((param1 - 22) / 52);
          stackIn_7_0 = var3;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("vn.G(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(pg param0, byte param1) {
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0.field_a != null) {
            param0.a(true);
          }
          param0.field_a = this.field_e;
          param0.field_b = this.field_e.field_b;
          param0.field_a.field_b = param0;
          param0.field_b.field_a = param0;
          if (param1 != -58) {
            this.field_e = (pg) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("vn.D(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final pg b(byte param0) {
        if (param0 < 16) {
          field_f = (String) null;
        }
        pg var2 = this.field_h;
        if (var2 == this.field_e) {
          this.field_h = null;
          return null;
        }
        this.field_h = var2.field_a;
        return var2;
    }

    final static boolean a(CharSequence param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (!qc.a(param1 + 640, true, param0)) {
            return false;
          }
          for (var2_int = param1; var2_int < param0.length(); var2_int++) {
            if (!qo.a(param0.charAt(var2_int), 0)) {
              return false;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("vn.I(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    public vn() {
        this.field_e = new pg();
        this.field_e.field_a = this.field_e;
        this.field_e.field_b = this.field_e;
    }

    final void c(int param0) {
        int var2;
        pg var3;
        int var4;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        var2 = 76 / ((-64 - param0) / 59);
        while (true) {
          var3 = this.field_e.field_b;
          if (var3 != this.field_e) {
            var3.a(true);
            continue;
          }
          break;
        }
        this.field_h = null;
        return;
    }

    public static void e(boolean param0) {
        field_b = null;
        field_a = null;
        if (!param0) {
          eg var2 = (eg) null;
          vn.a((eg) null, false, (eg) null, (eg) null);
        }
        field_j = null;
        field_i = null;
        field_f = null;
    }

    final boolean b(boolean param0) {
        if (!param0) {
          this.field_h = (pg) null;
        }
        return this.field_e == this.field_e.field_b ? true : false;
    }

    final void b(pg param0, int param1) {
        if (param1 != -1) {
          return;
        }
        try {
          if (null != param0.field_a) {
            param0.a(true);
          }
          param0.field_a = this.field_e.field_a;
          param0.field_b = this.field_e;
          param0.field_a.field_b = param0;
          param0.field_b.field_a = param0;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "vn.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static boolean a(eg param0, boolean param1, eg param2, eg param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1) {
            vn.e(true);
          }
          if (param3.c(-10923) &&
            param3.a("commonui", -24417)) {
            if (!param2.c(-10923)) {
              return false;
            }
            if (!param2.a("commonui", -24417)) {
              return false;
            }
            if (param0.c(-10923) &&
              param0.a("button.gif", -24417)) {
              return true;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_21_0 = var4;
          stackIn_21_1 = new StringBuilder().append("vn.E(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',');
          if (param3 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    final pg b(int param0) {
        if (param0 != 12623) {
          field_c = -68;
        }
        pg var2 = this.field_e.field_b;
        if (var2 == this.field_e) {
          this.field_h = null;
          return null;
        }
        this.field_h = var2.field_b;
        return var2;
    }

    static {
        field_g = 0;
        field_j = "The Book of Cogs is only available once you have purchased your first prestige hat, after having previously purchased all the other spells. Buy new spells by earning wands in Rated multiplayer games.";
        field_a = "  You summon your familiar by clicking the familiar icon on the game screen.";
    }
}
