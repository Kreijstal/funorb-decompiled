/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tf {
    static boolean field_f;
    static double field_a;
    static String[] field_h;
    gn field_c;
    static ut field_e;
    static int[][][] field_g;
    static cc field_d;
    private gn field_i;
    static String field_b;

    final gn h(int param0) {
        gn var2 = this.field_c.field_b;
        if (param0 >= -119) {
          return (gn) null;
        }
        if (this.field_c != var2) {
          var2.c((byte) -109);
          return var2;
        }
        return null;
    }

    final void b(int param0) {
        int var3;
        gn var5;
        gn var4;
        var3 = Kickabout.field_G;
        if (param0 == 22997) {
          while (true) {
            var4 = this.field_c.field_d;
            if (this.field_c != var4) {
              var4.c((byte) -109);
              continue;
            }
            break;
          }
          this.field_i = null;
          return;
        }
        field_e = (ut) null;
        while (true) {
          var5 = this.field_c.field_d;
          if (this.field_c != var5) {
            var5.c((byte) -109);
            continue;
          }
          break;
        }
        this.field_i = null;
        return;
    }

    final gn b(int param0, gn param1) {
        gn var3 = null;
        RuntimeException var3_ref = null;
        gn stackIn_2_0 = null;
        Object stackIn_8_0 = null;
        gn stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -7584) {
            stackIn_2_0 = (gn) null;
            return stackIn_2_0;
          }
          if (param1 == null) {
            var3 = this.field_c.field_d;
          } else {
            var3 = param1;
          }
          if (this.field_c != var3) {
            this.field_i = var3.field_d;
            stackIn_10_0 = var3;
            return stackIn_10_0;
          }
          this.field_i = null;
          stackIn_8_0 = null;
          return (gn) (stackIn_8_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("tf.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final gn d(int param0) {
        if (param0 != -9033) {
          return (gn) null;
        }
        gn var2 = this.field_c.field_b;
        if (this.field_c == var2) {
          this.field_i = null;
          return null;
        }
        this.field_i = var2.field_b;
        return var2;
    }

    final gn g(int param0) {
        gn var2 = null;
        gn var2Lifetime1;
        if (param0 != 24009) {
          field_e = (ut) null;
          var2 = this.field_c.field_d;
          if (this.field_c != var2) {
            this.field_i = var2.field_d;
            return var2;
          }
          this.field_i = null;
          return null;
        }
        var2Lifetime1 = this.field_c.field_d;
        if (this.field_c != var2Lifetime1) {
          this.field_i = var2Lifetime1.field_d;
          return var2Lifetime1;
        }
        this.field_i = null;
        return null;
    }

    final static int a(boolean param0, CharSequence param1) {
        int var4 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var5 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Kickabout.field_G;
        try {
          if (!param0) {
            field_e = (ut) null;
          }
          var2_int = param1.length();
          var3 = 0;
          for (var4 = 0; var2_int > var4; var4++) {
            var3 = -var3 + ((var3 << 5) + mf.a(param1.charAt(var4), (byte) -104));
          }
          stackIn_7_0 = var3;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("tf.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final void a(int param0, tf param1) {
        try {
          this.a(param1, this.field_c.field_d, 123);
          if (param0 != -17481) {
            gn var4 = (gn) null;
            this.a((tf) null, (gn) null, -14);
          }
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "tf.M(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final gn[] f(int param0) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        gn[] var6 = null;
        gn[] var2 = null;
        int var3 = 0;
        gn var4 = null;
        int var5 = Kickabout.field_G;
        gn[] var6Lifetime1;
        gn[] var2Lifetime1;
        gn var4Lifetime1;
        int var3Lifetime1;
        if (param0 != 606511077) {
          tf.a(113);
        } else {
          var6 = new gn[this.a(false)];
          var2 = var6;
          var3 = 0;
          var4 = this.field_c.field_d;
          while (this.field_c != var4) {
            incrementValue$0 = var3;
            var3++;
            var6[incrementValue$0] = var4;
            var4 = var4.field_d;
          }
          return var2;
        }
        var6Lifetime1 = new gn[this.a(false)];
        var2Lifetime1 = var6Lifetime1;
        var3Lifetime1 = 0;
        var4Lifetime1 = this.field_c.field_d;
        while (this.field_c != var4Lifetime1) {
          incrementValue$1 = var3Lifetime1;
          var3Lifetime1++;
          var6Lifetime1[incrementValue$1] = var4Lifetime1;
          var4Lifetime1 = var4Lifetime1.field_d;
        }
        return var2Lifetime1;
    }

    final gn e(int param0) {
        gn var2 = null;
        gn var2Lifetime1;
        if (param0 != 33) {
          this.field_i = (gn) null;
          var2 = this.field_i;
          if (this.field_c == var2) {
            this.field_i = null;
            return null;
          }
          this.field_i = var2.field_b;
          return var2;
        }
        var2Lifetime1 = this.field_i;
        if (this.field_c == var2Lifetime1) {
          this.field_i = null;
          return null;
        }
        this.field_i = var2Lifetime1.field_b;
        return var2Lifetime1;
    }

    final void a(gn param0, int param1) {
        try {
          if (null != param0.field_b) {
            param0.c((byte) -109);
          }
          if (param1 != 3) {
            this.field_i = (gn) null;
          }
          param0.field_b = this.field_c.field_b;
          param0.field_d = this.field_c;
          param0.field_b.field_d = param0;
          param0.field_d.field_b = param0;
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "tf.K(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean a(byte param0) {
        int var2 = -23 / ((param0 + 53) / 36);
        return this.field_c == this.field_c.field_d ? true : false;
    }

    final void a(int param0, gn param1) {
        try {
          if (param1.field_b != null) {
            param1.c((byte) -109);
          }
          param1.field_d = this.field_c.field_d;
          if (param0 != 0) {
            field_h = (String[]) null;
          }
          param1.field_b = this.field_c;
          param1.field_b.field_d = param1;
          param1.field_d.field_b = param1;
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "tf.Q(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final gn c(int param0) {
        gn var2 = null;
        gn var2Lifetime1;
        if (param0 != 33) {
          field_b = (String) null;
          var2 = this.field_i;
          if (this.field_c != var2) {
            this.field_i = var2.field_d;
            return var2;
          }
          this.field_i = null;
          return null;
        }
        var2Lifetime1 = this.field_i;
        if (this.field_c != var2Lifetime1) {
          this.field_i = var2Lifetime1.field_d;
          return var2Lifetime1;
        }
        this.field_i = null;
        return null;
    }

    private final void a(tf param0, gn param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        gn var5 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = -50 % ((param2 - 56) / 45);
          var5 = this.field_c.field_b;
          this.field_c.field_b = param1.field_b;
          param1.field_b.field_d = this.field_c;
          if (this.field_c == param1) {
            return;
          }
          param1.field_b = param0.field_c.field_b;
          param1.field_b.field_d = param1;
          var5.field_d = param0.field_c;
          param0.field_c.field_b = var5;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_5_0 = var4;
          stackIn_5_1 = new StringBuilder().append("tf.B(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_b = null;
        field_g = (int[][][]) null;
        field_e = null;
        int var1 = 77 / ((-76 - param0) / 49);
        field_h = null;
    }

    final int a(boolean param0) {
        int var2 = 0;
        gn var3 = null;
        int var4 = Kickabout.field_G;
        if (!param0) {
          var2 = 0;
          var3 = this.field_c.field_d;
          while (var3 != this.field_c) {
            var3 = var3.field_d;
            var2++;
          }
          return var2;
        }
        return 127;
    }

    final gn b(byte param0) {
        gn var2 = this.field_c.field_d;
        if (var2 != this.field_c) {
          int var3 = -19 / ((param0 - 75) / 50);
          var2.c((byte) -109);
          return var2;
        }
        return null;
    }

    public tf() {
        this.field_c = new gn();
        this.field_c.field_d = this.field_c;
        this.field_c.field_b = this.field_c;
    }

    static {
        field_h = new String[3];
        field_g = new int[33][33][33];
        field_f = false;
        field_d = new cc();
        field_b = "Top Bidder";
    }
}
