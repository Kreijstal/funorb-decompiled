/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gd extends qc {
    private int field_j;
    private int field_k;

    final f a(boolean param0, int param1, int param2, int param3, ta param4) {
        RuntimeException var6 = null;
        aj stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_k = this.field_k + param3;
          if (param0) {
            this.field_k = -18;
          }
          this.field_j = this.field_j + 1;
          ph.a(1, (byte) 107, param1, param4);
          stackIn_3_0 = new aj(bm.field_g);
          return (f) ((Object) stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_6_0 = var6;
          stackIn_6_1 = new StringBuilder().append("gd.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final int a(byte param0, boolean param1) {
        if (param0 <= -53) {
          return !param1 ? super.a((byte) -105, param1) : 24;
        }
        this.field_k = -26;
        return !param1 ? super.a((byte) -105, param1) : 24;
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        pd.field_g[param1] = pd.field_g[param1] + param2 * 1;
        if (!param0) {
          ta var6 = (ta) null;
          this.a(false, -91, -128, -80, (ta) null);
        }
    }

    final static String a(byte param0, CharSequence param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        CharSequence var3 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 127) {
            var3 = (CharSequence) null;
            gd.a((byte) 51, (CharSequence) null);
          }
          var2 = ni.a(37, ck.a((byte) 95, param1));
          if (var2 == null) {
            var2 = "";
          }
          stackIn_6_0 = var2;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_9_0 = var2_ref;
          stackIn_9_1 = new StringBuilder().append("gd.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static String a(byte param0, byte[] param1, int param2, int param3) {
        int var6 = 0;
        int incrementValue$1 = 0;
        char[] var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        char[] var10 = null;
        char[] var11 = null;
        String stackIn_3_0 = null;
        String stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        var9 = CrazyCrystals.field_B;
        try {
          var11 = new char[param3];
          var10 = var11;
          var4 = var10;
          var5 = 0;
          if (param0 < 3) {
            stackIn_3_0 = (String) null;
            return stackIn_3_0;
          }
          for (var6 = 0; param3 > var6; var6++) {
            var7 = 255 & param1[param2 + var6];
            if (var7 != 0) {
              if (128 <= var7 &&
                var7 < 160) {
                var8 = tg.field_d[var7 - 128];
                if (0 == var8) {
                  var8 = 63;
                }
                var7 = var8;
              }
              incrementValue$1 = var5;
              var5++;
              var4[incrementValue$1] = (char)var7;
            }
          }
          stackIn_18_0 = new String(var11, 0, var5);
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_21_0 = var4_ref;
          stackIn_21_1 = new StringBuilder().append("gd.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(byte param0) {
        tb.field_d.a(jm.field_k, (int)(Math.random() * 11.0) + 95, 12 * (gi.field_m * this.field_j), this.field_k / this.field_j);
        int var2 = 14 / ((param0 - 29) / 42);
        this.field_j = 0;
        this.field_k = 0;
    }

    final static java.awt.Canvas c(int param0) {
        if (param0 != 128) {
          return (java.awt.Canvas) null;
        }
        return ph.field_E == null ? jd.field_D : (java.awt.Canvas) ((Object) ph.field_E);
    }

    final pb b(byte param0) {
        if (param0 >= -127) {
          return (pb) null;
        }
        return (pb) ((Object) new uk());
    }

    gd() {
        this.field_k = 0;
        this.field_j = 0;
    }

    static {
    }
}
