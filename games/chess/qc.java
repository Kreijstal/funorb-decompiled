/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qc {
    static km[][] field_d;
    private v field_f;
    static long field_a;
    private um field_g;
    private um field_b;
    static int field_e;
    static String field_c;

    final dj a(byte param0, int param1) {
        dj var3;
        byte[] var4;
        dj var3Lifetime1;
        var3 = (dj) (this.field_f.a((byte) -77, (long)param1));
        if (var3 != null) {
          return var3;
        }
        if (param1 >= 32768) {
          var4 = this.field_b.a(1, param1 & 32767, 5847);
        } else {
          var4 = this.field_g.a(1, param1, 5847);
        }
        if (param0 != 79) {
          return (dj) null;
        }
        var3Lifetime1 = new dj();
        if (var4 != null) {
          var3Lifetime1.a(new p(var4), true);
        }
        if (param1 >= 32768) {
          var3Lifetime1.f(32768);
        }
        this.field_f.a((long)param1, param0 ^ 78, var3Lifetime1);
        return var3Lifetime1;
    }

    final static String a(CharSequence param0, boolean param1, byte param2) {
        int var6 = 0;
        String stackIn_3_0 = null;
        String stackIn_8_0 = null;
        String stackIn_15_0 = null;
        String stackIn_20_0 = null;
        String stackIn_29_0 = null;
        String stackIn_34_0 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        CharSequence var9 = null;
        var8 = Chess.field_G;
        try {
          if (param0 == null) {
            stackIn_3_0 = sh.field_d;
            return stackIn_3_0;
          }
          var3_int = param0.length();
          if (1 <= var3_int &&
            12 >= var3_int) {
            var4 = ad.a(param0, -2);
            if (param2 < 63) {
              var9 = (CharSequence) null;
              qc.a((CharSequence) null, false, (byte) 34);
            }
            if (var4 != null &&
              var4.length() >= 1) {
              if (!cg.a(2, var4.charAt(0)) &&
                !cg.a(2, var4.charAt(var4.length() - 1))) {
                var5 = 0;
                for (var6 = 0; param0.length() > var6; var6++) {
                  var7 = param0.charAt(var6);
                  if (!cg.a(2, (char) var7)) {
                    var5 = 0;
                  } else {
                    var5++;
                  }
                  if (var5 >= 2 &&
                    !param1) {
                    stackIn_29_0 = ji.field_Q;
                    return stackIn_29_0;
                  }
                }
                if (0 >= var5) {
                  return null;
                }
                stackIn_34_0 = am.field_a;
                return stackIn_34_0;
              }
              stackIn_20_0 = am.field_a;
              return stackIn_20_0;
            }
            stackIn_15_0 = sh.field_d;
            return stackIn_15_0;
          }
          stackIn_8_0 = sh.field_d;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_37_0 = var3;
          stackIn_37_1 = new StringBuilder().append("qc.C(");
          if (param0 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_37_0), ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 != 7) {
          return;
        }
        field_d = (km[][]) null;
    }

    qc(int param0, um param1, um param2, ui param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_f = new v(64);
        try {
          this.field_g = param1;
          this.field_b = param2;
          if (null != this.field_g) {
            this.field_g.a((byte) -57, 1);
          }
          if (null == this.field_b) {
            return;
          }
          this.field_b.a((byte) -98, 1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("qc.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    static {
        field_d = new km[2][7];
        field_c = "Hide players in <%0>'s game";
    }
}
