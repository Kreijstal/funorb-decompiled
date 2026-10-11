/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class bb extends bj {
    static String field_O;
    static java.applet.Applet field_P;
    static cn field_L;
    static int field_H;
    private int field_N;
    static String field_J;
    static String field_K;
    static int[] field_R;
    private tb field_Q;
    boolean field_G;
    static String field_I;

    boolean j(int param0) {
        int var2;
        int var3;
        boolean stackIn_12_0 = false;
        if (param0 != -13907) {
          return false;
        }
        var2 = this.k(-1);
        var3 = var2 - this.field_N;
        if (0 < var3) {
          this.field_N = this.field_N + (8 + var3 - 1) / 8;
        }
        if (var3 < 0) {
          this.field_N = this.field_N + (1 + (var3 - 16)) / 16;
        }
        stackIn_12_0 = (0 == this.field_N) && (0 == var2) && (!this.field_G);
        return stackIn_12_0;
    }

    final hm a(boolean param0) {
        hm var2 = super.a(param0);
        if (var2 != null) {
          return var2;
        }
        return (hm) (this);
    }

    final void a(int param0, byte param1, int param2, int param3) {
        if (0 == this.field_N) {
          return;
        }
        if (this.field_N >= 256) {
          if (param2 != 0) {
            return;
          }
          this.b(this.field_j + param0, param3 + this.field_k, (byte) 89);
          super.a(param0, (byte) 87, param2, param3);
          return;
        }
        if (li.field_r == null ||
          !(li.field_r.field_s >= this.field_g) ||
          !(this.field_x <= li.field_r.field_x)) {
          li.field_r = new ed(this.field_g, this.field_x);
        }
        eo.a(li.field_r, (byte) -76);
        em.d();
        this.b(0, 0, (byte) 87);
        super.a(-this.field_j - param0, (byte) 118, param2, -this.field_k - param3);
        if (param1 <= 85) {
          field_L = (cn) null;
        }
        dl.a((byte) 125);
        li.field_r.d(this.field_k + param3, this.field_j + param0, this.field_N);
    }

    final static void a(int param0, int param1, int param2, te param3, int param4, int param5) {
        int incrementValue$0 = 0;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        String var21 = null;
        int var14Lifetime1;
        int var14Lifetime2;
        int var14Lifetime3;
        var20 = EscapeVector.field_A;
        try {
          if (param2 != 4163) {
            var21 = (String) null;
            bb.a(-7, (String) null, 'ﾱ');
          }
          var6_int = (param5 - param1 << 8) / param3.field_a;
          param0 = param0 + param3.field_f;
          param4 = param4 + param3.field_i;
          var7 = var6_int * param3.field_f + (param1 << 8);
          var8 = param4 * em.field_l + param0;
          var9 = 0;
          var10 = param3.field_d;
          var11 = param3.field_g;
          var12 = -var11 + em.field_l;
          var13 = 0;
          if (em.field_k > param4) {
            var14 = em.field_k - param4;
            var10 = var10 - var14;
            var8 = var8 + em.field_l * var14;
            param4 = em.field_k;
            var9 = var9 + var14 * var11;
          }
          if (param4 + var10 > em.field_j) {
            var10 = var10 - (var10 + param4 - em.field_j);
          }
          if (param0 < em.field_a) {
            var14Lifetime1 = -param0 + em.field_a;
            var8 = var8 + var14Lifetime1;
            var7 = var7 + var6_int * var14Lifetime1;
            param0 = em.field_a;
            var11 = var11 - var14Lifetime1;
            var9 = var9 + var14Lifetime1;
            var12 = var12 + var14Lifetime1;
            var13 = var13 + var14Lifetime1;
          }
          if (var11 + param0 > em.field_b) {
            var14Lifetime2 = -em.field_b + var11 + param0;
            var13 = var13 + var14Lifetime2;
            var11 = var11 - var14Lifetime2;
            var12 = var12 + var14Lifetime2;
          }
          if (var11 > 0 &&
            var10 > 0) {
            for (param4 = -var10; 0 > param4; param4++) {
              var14Lifetime3 = var7;
              for (param0 = -var11; 0 > param0; param0++) {
                var15 = var14Lifetime3 >> 8;
                var16 = 256 - var15;
                var14Lifetime3 = var14Lifetime3 + var6_int;
                if (var15 < 0) {
                  var8++;
                  var9++;
                } else {
                  incrementValue$0 = var9;
                  var9++;
                  var17 = param3.field_l[param3.field_k[incrementValue$0] & 255];
                  if (var17 != 0) {
                    if (255 >= var15) {
                      var18 = em.field_i[var8];
                      var19 = 16711935 & var15 * (16711935 & var17) + var16 * (var18 & 16711935) >> 8;
                      em.field_i[var8] = (ae.a(ae.a(var17, 65280) * var15 + var16 * ae.a(var18, 65280), 16711906) >> 8) + var19;
                    } else {
                      em.field_i[var8] = var17;
                    }
                  }
                  var8++;
                }
              }
              var9 = var9 + var13;
              var8 = var8 + var12;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_35_0 = var6;
          stackIn_35_1 = new StringBuilder().append("bb.DA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int[] param4) {
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = EscapeVector.field_A;
        try {
          if (param0 != -23466) {
            return;
          }
          while (true) {
            param3--;
            if (0 > param3) {
              return;
            }
            var9 = param4;
            var5 = var9;
            var6 = param1;
            var7 = param2;
            var9[var6] = ae.a(var9[var6] >> 1, 8355711) + var7;
            param1++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_8_0 = var5_ref;
          stackIn_8_1 = new StringBuilder().append("bb.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    public static void h(byte param0) {
        if (param0 != 127) {
          field_H = -93;
        }
        field_P = null;
        field_L = null;
        field_R = null;
        field_I = null;
        field_J = null;
        field_O = null;
        field_K = null;
    }

    bb(tb param0, int param1, int param2) {
        super(dm.field_h - param1 >> 1, r.field_B - param2 >> 1, param1, param2, (db) null);
        try {
          this.field_G = false;
          this.field_N = 0;
          this.field_Q = param0;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "bb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    abstract void b(int param0, int param1, byte param2);

    private final int k(int param0) {
        if (param0 != -1) {
          field_J = (String) null;
        }
        return this.field_G ? this.field_Q.n(0) != this ? 0 : 256 : 0;
    }

    final static String[] a(int param0, String param1, char param2) {
        int var7 = 0;
        int incrementValue$1 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        String var10 = null;
        CharSequence var11 = null;
        String[] stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = EscapeVector.field_A;
        try {
          var11 = (CharSequence) ((Object) param1);
          var3_int = un.a(var11, 4277, param2);
          var4 = new String[var3_int + 1];
          if (param0 > -127) {
            var10 = (String) null;
            bb.a(119, (String) null, 'e');
          }
          var5 = 0;
          var6 = 0;
          for (var7 = 0; var7 < var3_int; var7++) {
            for (var8 = var6; param1.charAt(var8) != param2; var8++) {
            }
            incrementValue$1 = var5;
            var5++;
            var4[incrementValue$1] = param1.substring(var6, var8);
            var6 = var8 + 1;
          }
          var4[var3_int] = param1.substring(var6);
          stackIn_10_0 = var4;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("bb.U(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(')').toString());
        }
    }

    boolean a(byte param0) {
        int var2;
        boolean stackIn_4_0 = false;
        var2 = -106 / ((param0 - 7) / 55);
        this.field_N = this.k(-1);
        stackIn_4_0 = (this.field_N == 0) && (!this.field_G);
        return stackIn_4_0;
    }

    final void b(int param0, int param1, int param2) {
        if (param0 != 255) {
          field_K = (String) null;
        }
        this.a(param2, -param1 + r.field_B >> 1, -param2 + dm.field_h >> 1, true, param1);
    }

    static {
        field_O = "Back";
        field_H = 0;
        field_J = "Cancel";
        field_R = new int[]{1, 160};
        field_K = "Enter the name you'd prefer. This is the name displayed to other players.";
        field_I = "to keep fullscreen or";
    }
}
