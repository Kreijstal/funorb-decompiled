/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bd extends g implements qh {
    static kc field_H;
    private hl[] field_G;
    private wi field_D;
    private String[] field_E;
    static int field_F;

    final static void d(byte param0) {
        try {
          Exception var1 = null;
          Throwable decompiledCaughtException = null;
          if (null != e.field_e) {
            try {
              e.field_e.a(0L, 10);
              e.field_e.a(rd.field_j.field_g, rd.field_j.field_i, 24, -1);
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = (Exception) (Object) decompiledCaughtException;
            }
          }
          if (param0 > -59) {
            field_F = -108;
          }
          rd.field_j.field_i = rd.field_j.field_i + 24;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void a(int param0, int param1, int param2, hl param3, int param4) {
        int var7 = 0;
        int var6_int = 0;
        int var8 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var8 = Main.field_T;
        try {
          var6_int = -59 % ((param1 + 62) / 32);
          for (var7 = 0; this.field_E.length > var7; var7++) {
            if (this.field_G[var7] == param3) {
              this.field_D.a(this.field_E[var7], true);
            }
          }
          if (this.field_G[this.field_E.length] != param3) {
            return;
          }
          this.field_D.a(true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_15_0 = var6;
          stackIn_15_1 = new StringBuilder().append("bd.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param4).append(')').toString());
        }
    }

    final static String a(int param0, int param1, byte[] param2, int param3) {
        int var6 = 0;
        int incrementValue$1 = 0;
        char[] var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        char[] var10 = null;
        char[] var11 = null;
        char[] var12 = null;
        String stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        var9 = Main.field_T;
        try {
          var12 = new char[param3];
          var11 = var12;
          var10 = var11;
          var4 = var10;
          var5 = 0;
          if (param0 != 255) {
            field_H = (kc) null;
          }
          for (var6 = 0; param3 > var6; var6++) {
            var7 = 255 & param2[var6 + param1];
            if (var7 != 0) {
              if (var7 >= 128 &&
                var7 < 160) {
                var8 = se.field_K[var7 - 128];
                if (0 == var8) {
                  var8 = 63;
                }
                var7 = var8;
              }
              incrementValue$1 = var5;
              var5++;
              var10[incrementValue$1] = (char)var7;
            }
          }
          stackIn_17_0 = new String(var12, 0, var5);
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_20_0 = var4_ref;
          stackIn_20_1 = new StringBuilder().append("bd.H(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void l(int param0) {
        if (param0 != -10790) {
          field_F = -70;
          field_H = null;
          return;
        }
        field_H = null;
    }

    final boolean a(char param0, byte param1, int param2, lk param3) {
        RuntimeException var5 = null;
        byte[] var6 = null;
        boolean stackIn_5_0 = false;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, (byte) -116, param2, param3)) {
            return true;
          }
          if (param2 == 98) {
            stackIn_5_0 = this.b(121, param3);
            return stackIn_5_0;
          }
          if (param1 >= -99) {
            var6 = (byte[]) null;
            bd.a(101, 70, (byte[]) null, 118);
          }
          if (param2 != 99) {
            return false;
          }
          stackIn_10_0 = this.a(param3, (byte) -28);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_15_0 = var5;
          stackIn_15_1 = new StringBuilder().append("bd.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        lk var6 = null;
        lk var6Lifetime1;
        super.a(param0, param1, param2 ^ 0, param3);
        if (param3 != 0) {
          return;
        }
        ee var5 = j.field_C;
        if (this.field_E != null) {
          var5.a(cb.field_h, param0 + this.field_o, param1 + this.field_i, this.field_h, 20, 16777215, -1, 0, 0, var5.field_s + var5.field_x);
          if (param2 != -1) {
            var6 = (lk) null;
            this.a('\034', (byte) 54, 78, (lk) null);
            return;
          }
          return;
        }
        if (param2 == -1) {
          return;
        }
        var6Lifetime1 = (lk) null;
        this.a('\034', (byte) 54, 78, (lk) null);
    }

    final static int a(boolean param0, CharSequence param1, byte param2, int param3) {
        int var8 = 0;
        int stackIn_42_0 = 0;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Main.field_T;
        try {
          if (param3 >= 2 &&
            param3 <= 36) {
            var4_int = 0;
            if (param2 != 122) {
              bd.d((byte) -54);
            }
            var5 = 0;
            var6 = 0;
            var7 = param1.length();
            for (var8 = 0; var7 > var8; var8++) {
              boolean decompiledFrameRemainder0 = true;
              var9 = param1.charAt(var8);
              if ((0 == var8) &&
                (45 == var9)) {
                var4_int = 1;
                decompiledFrameRemainder0 = false;
              }
              if ((decompiledFrameRemainder0) && (0 != var8 || (var9 != 43 ||
                !param0))) {
                if (var9 >= 48 &&
                  var9 <= 57) {
                  var9 -= 48;
                } else if (65 <= var9 &&
                  var9 <= 90) {
                  var9 -= 55;
                } else if (97 <= var9 &&
                  122 >= var9) {
                  var9 -= 87;
                } else {
                  throw new NumberFormatException();
                }
                if (var9 >= param3) {
                  throw new NumberFormatException();
                }
                if (var4_int != 0) {
                  var9 = -var9;
                }
                var10 = param3 * var6 + var9;
                if (var6 != var10 / param3) {
                  throw new NumberFormatException();
                }
                var5 = 1;
                var6 = var10;
              }
            }
            if (var5 == 0) {
              throw new NumberFormatException();
            }
            stackIn_42_0 = var6;
            return stackIn_42_0;
          }
          throw new IllegalArgumentException("" + param3);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_45_0 = var4;
          stackIn_45_1 = new StringBuilder().append("bd.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    bd(wi param0) {
        super(0, 0, 0, 0, (ci) null);
        try {
          this.field_D = param0;
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "bd.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, String[] param1) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        nb var4 = null;
        int var6 = 0;
        var6 = Main.field_T;
        try {
          this.field_z.c(29026);
          if (param0 >= -101) {
            return;
          }
          if (param1 != null &&
            0 != param1.length) {
            var3_int = param1.length;
            this.field_E = new String[var3_int];
            for (var4_int = 0; var3_int > var4_int; var4_int++) {
              this.field_E[var4_int] = hg.a((CharSequence) ((Object) param1[var4_int]), (byte) 115).replace(' ', ' ');
            }
            var4 = new nb(j.field_C, 0, 1);
            this.field_G = new hl[1 + var3_int];
            for (var5 = 0; var3_int > var5; var5++) {
              this.field_G[var5] = new hl(this.field_E[var5], (pl) (this));
              this.field_G[var5].field_v = (ci) ((Object) var4);
              this.field_G[var5].field_n = lb.field_e;
              this.field_G[var5].a(15, var5 * 16 + 20, 80, 0, true);
              this.b(this.field_G[var5], (byte) 118);
            }
            this.field_G[var3_int] = new hl(sh.field_f, (pl) (this));
            this.field_G[var3_int].field_v = (ci) ((Object) var4);
            this.field_G[var3_int].a(15, 36 + var3_int * 16, 100, 0, true);
            this.b(this.field_G[var3_int], (byte) 118);
            return;
          }
          this.field_E = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("bd.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    static {
    }
}
