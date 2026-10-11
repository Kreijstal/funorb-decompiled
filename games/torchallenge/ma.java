/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ma extends ui implements cc {
    private dj field_l;
    static int field_j;
    static int field_k;

    final static void e(int param0) {
        int fieldTemp$0 = 0;
        RuntimeException decompiledCaughtException = null;
        pa var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        var3 = TorChallenge.field_F ? 1 : 0;
        try {
          if (param0 <= 23) {
            field_j = -62;
          }
          var1 = dk.field_s;
          while (de.a(-1)) {
            var1.d(25, 8);
            fieldTemp$0 = var1.field_q + 1;
            var1.field_q = var1.field_q + 1;
            var2 = fieldTemp$0;
            hb.a(var1, -95);
            dk.field_s.a(var1.field_q - var2, -111);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var1_ref), "ma.T(" + param0 + ')');
        }
    }

    final static vi b(String param0, byte param1) {
        int var4 = 0;
        int var2_int = 0;
        int var3 = 0;
        int var5 = 0;
        int var6 = 0;
        vi stackIn_3_0 = null;
        vi stackIn_6_0 = null;
        vi stackIn_16_0 = null;
        vi stackIn_19_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var6 = TorChallenge.field_F ? 1 : 0;
        try {
          var3 = -46 % ((param1 - 62) / 41);
          var2_int = param0.length();
          if (var2_int == 0) {
            stackIn_3_0 = dj.field_W;
            return stackIn_3_0;
          }
          if (var2_int > 63) {
            stackIn_6_0 = uk.field_I;
            return stackIn_6_0;
          }
          for (var4 = 0; var4 < var2_int; var4++) {
            var5 = param0.charAt(var4);
            if (45 == var5) {
              if (var4 == 0 ||
                var4 == -1 + var2_int) {
                stackIn_16_0 = di.field_g;
                return stackIn_16_0;
              }
            } else {
              if (bl.field_Q.indexOf(var5) == -1) {
                stackIn_19_0 = di.field_g;
                return stackIn_19_0;
              }
            }
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_24_0 = var2;
          stackIn_24_1 = new StringBuilder().append("ma.V(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void b(dj param0, int param1) {
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 != 3) {
            field_j = -97;
            this.a(true);
          } else {
            this.a(true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("ma.M(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final static ka[] a(int param0, int param1, int param2, int param3, boolean param4) {
        if (!param4) {
          return (ka[]) null;
        }
        ka[] var6 = new ka[9];
        ka[] var5 = var6;
        ka dupTemp$0 = e.a(param1, param2, (byte) -113);
        var6[6] = dupTemp$0;
        var5[3] = dupTemp$0;
        var5[2] = dupTemp$0;
        var5[1] = dupTemp$0;
        var5[0] = dupTemp$0;
        ka dupTemp$1 = e.a(param0, param2, (byte) -100);
        var6[8] = dupTemp$1;
        var5[7] = dupTemp$1;
        var5[5] = dupTemp$1;
        if (0 != param3) {
          var6[4] = e.a(param3, 64, (byte) -100);
        }
        return var5;
    }

    ma(dj param0) {
        try {
          this.field_l = param0;
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "ma.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final boolean a(int param0) {
        boolean stackIn_7_0 = false;
        if (param0 != 6650) {
          this.field_l = (dj) null;
        }
        stackIn_7_0 = (this.field_l.field_v == null) || (this.field_l.field_v.length() == 0);
        return stackIn_7_0;
    }

    final rj b(byte param0) {
        if (param0 < 79) {
          field_j = 104;
        }
        return this.a((byte) 24, this.field_l.field_v);
    }

    abstract String a(String param0, byte param1);

    public final void a(dj param0, int param1) {
        try {
          if (param1 != 5) {
            this.field_l = (dj) null;
          }
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "ma.O(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    abstract rj a(byte param0, String param1);

    final String d(int param0) {
        if (param0 != 5) {
          return (String) null;
        }
        return this.a(this.field_l.field_v, (byte) -24);
    }

    static {
        field_j = 0;
        field_k = 0;
    }
}
