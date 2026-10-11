/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class we extends ta implements ai {
    static String field_F;
    static String field_A;
    static boolean field_B;
    private String[] field_D;
    private bf field_E;
    private s[] field_C;

    public final void a(byte param0, int param1, int param2, s param3, int param4) {
        int var6_int = 0;
        int var7 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var6_intLifetime1;
        var7 = OrbDefence.field_D ? 1 : 0;
        try {
          for (var6_int = 0; var6_int < this.field_D.length; var6_int++) {
            if (param3 == this.field_C[var6_int]) {
              this.field_E.a(120, this.field_D[var6_int]);
            }
          }
          var6_intLifetime1 = 2 % ((-3 - param0) / 62);
          if (this.field_C[this.field_D.length] == param3) {
            this.field_E.a((byte) -8);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_14_0 = var6;
          stackIn_14_1 = new StringBuilder().append("we.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param4).append(')').toString());
        }
    }

    final boolean a(char param0, int param1, pj param2, int param3) {
        RuntimeException var5 = null;
        boolean stackIn_6_0 = false;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, param2, param3)) {
            return true;
          }
          if (param1 == 98) {
            stackIn_6_0 = this.a(param2, false);
            return stackIn_6_0;
          }
          if (param1 != 99) {
            return false;
          }
          stackIn_10_0 = this.b(param2, false);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("we.I(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
        }
    }

    we(bf param0) {
        super(0, 0, 0, 0, (td) null);
        try {
          this.field_E = param0;
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "we.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        if (param1 != 0) {
          return;
        }
        kc var5 = lm.field_f;
        if (null != this.field_D) {
          var5.a(pe.field_c, this.field_s + param3, this.field_n + param0, this.field_m, 20, 16777215, -1, 0, 0, var5.field_B + var5.field_H);
        }
    }

    final void a(String[] param0, byte param1) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        qc var4 = null;
        int var6 = 0;
        var6 = OrbDefence.field_D ? 1 : 0;
        try {
          this.field_x.a(false);
          if (param0 != null &&
            param0.length != 0) {
            var3_int = param0.length;
            this.field_D = new String[var3_int];
            for (var4_int = 0; var3_int > var4_int; var4_int++) {
              this.field_D[var4_int] = g.a((CharSequence) ((Object) param0[var4_int]), (byte) -119).replace(' ', ' ');
            }
            var4 = new qc(lm.field_f, 0, 1);
            this.field_C = new s[1 + var3_int];
            for (var5 = 0; var3_int > var5; var5++) {
              this.field_C[var5] = new s(this.field_D[var5], (ag) (this));
              this.field_C[var5].field_j = (td) ((Object) var4);
              this.field_C[var5].field_i = oa.field_f;
              this.field_C[var5].a(0, var5 * 16 + 20, 15, (byte) -90, 80);
              this.a(this.field_C[var5], (byte) 74);
            }
            if (param1 != -34) {
              this.a(95, -43, 80, 127);
            }
            this.field_C[var3_int] = new s(mm.field_B, (ag) (this));
            this.field_C[var3_int].field_j = (td) ((Object) var4);
            this.field_C[var3_int].a(0, 20 + (var3_int + 1) * 16, 15, (byte) -90, 100);
            this.a(this.field_C[var3_int], (byte) 74);
            return;
          }
          this.field_D = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("we.N(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
        }
    }

    final static boolean a(int param0, int param1, CharSequence param2, boolean param3) {
        int var8 = 0;
        int stackIn_41_0 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        CharSequence var12 = null;
        var11 = OrbDefence.field_D ? 1 : 0;
        try {
          if (param1 != 87) {
            var12 = (CharSequence) null;
            we.a(24, 92, (CharSequence) null, true);
          }
          if (2 <= param0 &&
            param0 <= 36) {
            var4_int = 0;
            var5 = 0;
            var6 = 0;
            var7 = param2.length();
            for (var8 = 0; var8 < var7; var8++) {
              boolean decompiledFrameRemainder0 = true;
              var9 = param2.charAt(var8);
              if ((var8 == 0) &&
                (var9 == 45)) {
                var4_int = 1;
                decompiledFrameRemainder0 = false;
              }
              if ((decompiledFrameRemainder0) && (var8 != 0 || (var9 != 43 ||
                !param3))) {
                if (var9 >= 48 &&
                  57 >= var9) {
                  var9 -= 48;
                } else if (var9 >= 65 &&
                  90 >= var9) {
                  var9 -= 55;
                } else {
                  if (97 > var9) {
                    return false;
                  }
                  if (var9 > 122) {
                    return false;
                  }
                  var9 -= 87;
                }
                if (param0 <= var9) {
                  return false;
                }
                if (var4_int != 0) {
                  var9 = -var9;
                }
                var10 = var6 * param0 + var9;
                if (var10 / param0 != var6) {
                  return false;
                }
                var6 = var10;
                var5 = 1;
              }
            }
            stackIn_41_0 = var5;
            return stackIn_41_0 != 0;
          }
          throw new IllegalArgumentException("" + param0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_44_0 = var4;
          stackIn_44_1 = new StringBuilder().append("we.K(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_45_2 = "null";
          } else {
            stackIn_45_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_44_0), ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void k(int param0) {
        field_A = null;
        if (param0 != 29858) {
          return;
        }
        field_F = null;
    }

    static {
        field_F = "Score";
        field_A = "TOUGHO";
        field_B = false;
    }
}
