/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class tb {
    static mj field_a;
    static volatile int field_b;

    abstract long b(int param0);

    final static String a(String param0, String param1, boolean param2, String param3) {
        String stackIn_7_0 = null;
        String stackIn_13_0 = null;
        int var4 = 0;
        int var5 = 0;
        int var4Lifetime1;
        var5 = Lexicominos.field_L ? 1 : 0;
        if (param2) {
          var4 = param1.indexOf(param0);
          boolean decompiledNaturalLoopExit1 = false;
          while (!(decompiledNaturalLoopExit1 = (var4 == -1))) {
            param1 = param1.substring(0, var4) + param3 + param1.substring(param0.length() + var4);
            stackIn_7_0 = (String) (param1);
            if (var5 == 0) {
              var4 = ((String) (Object) stackIn_7_0).indexOf(param0, param3.length() + var4);
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit1) {
            stackIn_7_0 = (String) (param1);
          }
          return stackIn_7_0;
        }
        field_a = (mj) null;
        var4Lifetime1 = param1.indexOf(param0);
        boolean decompiledNaturalLoopExit0 = false;
        while (!(decompiledNaturalLoopExit0 = (var4Lifetime1 == -1))) {
          param1 = param1.substring(0, var4Lifetime1) + param3 + param1.substring(param0.length() + var4Lifetime1);
          stackIn_13_0 = (String) (param1);
          if (var5 == 0) {
            var4Lifetime1 = ((String) (Object) stackIn_13_0).indexOf(param0, param3.length() + var4Lifetime1);
            continue;
          }
          break;
        }
        if (decompiledNaturalLoopExit0) {
          stackIn_13_0 = (String) (param1);
        }
        return stackIn_13_0;
    }

    public static void a(int param0) {
        if (param0 != 255) {
          tb.a((String) null, (String) null, true, (String) null);
          field_a = null;
          return;
        }
        field_a = null;
    }

    abstract int a(long param0, byte param1);

    abstract void a(byte param0);

    final static pk a(th param0, int param1) {
        pk stackIn_5_0 = null;
        pk stackIn_29_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        pk var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var8 = Lexicominos.field_L ? 1 : 0;
        try {
          var2_int = param0.g(8, 26527);
          if (var2_int > 0) {
            throw new IllegalStateException("" + var2_int);
          }
          var3 = hl.a(true, param0) ? 1 : 0;
          if (param1 > -18) {
            stackIn_5_0 = (pk) null;
            return stackIn_5_0;
          }
          var4 = hl.a(true, param0) ? 1 : 0;
          var5 = new pk();
          var5.field_w = (short)param0.g(16, 26527);
          var5.field_h = hi.a(param0, (byte) -94, 16, var5.field_h);
          var5.field_I = hi.a(param0, (byte) -70, 16, var5.field_I);
          var5.field_g = hi.a(param0, (byte) -83, 16, var5.field_g);
          var5.field_H = (short)param0.g(16, 26527);
          var5.field_a = hi.a(param0, (byte) -46, 16, var5.field_a);
          var5.field_k = hi.a(param0, (byte) -41, 16, var5.field_k);
          var5.field_B = hi.a(param0, (byte) -114, 16, var5.field_B);
          if (var3 != 0) {
            var5.field_A = (short)param0.g(16, 26527);
            var5.field_z = hi.a(param0, (byte) -87, 16, var5.field_z);
            var5.field_b = hi.a(param0, (byte) -97, 16, var5.field_b);
            var5.field_c = hi.a(param0, (byte) -42, 16, var5.field_c);
            var5.field_j = hi.a(param0, (byte) -52, 16, var5.field_j);
            var5.field_K = hi.a(param0, (byte) -35, 16, var5.field_K);
            var5.field_E = hi.a(param0, (byte) -98, 16, var5.field_E);
          }
          if (var4 != 0) {
            param0.g(16, 26527);
            var5.field_d = hi.a(param0, (byte) -70, 16, var5.field_d);
            var5.field_s = hi.a(param0, (byte) -96, 16, var5.field_s);
            var5.field_e = hi.a(param0, (byte) -128, 16, var5.field_e);
            var5.field_x = hi.a(param0, (byte) -127, 16, var5.field_x);
            var5.field_P = hi.a(param0, (byte) -124, 16, var5.field_P);
          }
          if (hl.a(true, param0)) {
            var5.field_q = hi.a(param0, (byte) -77, 16, var5.field_q);
          }
          if (hl.a(true, param0)) {
            var5.field_J = vk.a(0, param0, 16, var5.field_J);
            var6 = 0;
            var7 = 0;
            while (true) {
              boolean decompiledFrameRemainder0 = true;
              boolean decompiledFrameRemainder1 = true;
              if (var5.field_J.length > var7) {
                var10 = ~var6;
                var9 = ~(var5.field_J[var7] & 255);
                if (var8 != 0) {
                  decompiledFrameRemainder0 = (var9 == var10);
                  decompiledFrameRemainder1 = !(decompiledFrameRemainder0);
                }
                if ((decompiledFrameRemainder1) &&
                  (decompiledFrameRemainder0)) {
                  if (var9 < var10) {
                    var6 = 255 & var5.field_J[var7];
                  }
                  var7++;
                  continue;
                }
              }
              if ((decompiledFrameRemainder1) &&
                (decompiledFrameRemainder0)) {
                decompiledFrameRemainder0 = (0 == var6);
              }
              if (decompiledFrameRemainder0) {
                var5.field_J = null;
                if (var8 == 0) {
                  break;
                }
              }
              var5.field_N = (byte)(1 + var6);
              break;
            }
          }
          stackIn_29_0 = var5;
          return stackIn_29_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_32_0 = var2;
          stackIn_32_1 = new StringBuilder().append("tb.I(");
          if (param0 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param1).append(')').toString());
        }
    }

    final int a(byte param0, long param1) {
        long var4 = 0L;
        long var4Lifetime1;
        if (param0 < 5) {
          field_a = (mj) null;
          var4 = this.b(255);
          if (0L < var4) {
            ge.a(0, var4);
            return this.a(param1, (byte) 121);
          }
          return this.a(param1, (byte) 121);
        }
        var4Lifetime1 = this.b(255);
        if (0L >= var4Lifetime1) {
          return this.a(param1, (byte) 121);
        }
        ge.a(0, var4Lifetime1);
        return this.a(param1, (byte) 121);
    }

    static int a(int param0, int param1) {
        return param0 | param1;
    }

    static {
        field_b = 0;
    }
}
