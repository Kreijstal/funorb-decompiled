/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cf extends mc {
    boolean field_s;
    int[] field_u;
    static boolean field_r;
    int field_t;
    static byte[] field_q;
    static int field_n;
    static vl field_p;
    static jb field_o;

    public static void b(byte param0) {
        if (param0 != 6) {
          return;
        }
        field_p = null;
        field_o = null;
        field_q = null;
    }

    final static hb a(int param0) {
        if (param0 <= 22) {
          return (hb) null;
        }
        return new hb(i.e(-11), ld.j(-97));
    }

    final static boolean a(int param0, byte param1) {
        if (param0 == -1) {
          return true;
        }
        if (param1 <= 104) {
          cf.a(-75);
        }
        return (1 << param0 & me.field_a) != 0 ? true : false;
    }

    cf() {
        this.field_s = false;
    }

    final static mh a(String param0, byte param1) {
        mh stackIn_6_0 = null;
        mh stackIn_10_0 = null;
        mh stackIn_15_0 = null;
        int stackIn_24_0 = 0;
        mh stackIn_28_0 = null;
        mh stackIn_42_0 = null;
        mh stackIn_46_0 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_53_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        var6 = TetraLink.field_J;
        try {
          if (param1 > -112) {
            cf.a(-113, (byte) -111);
          }
          var2_int = param0.length();
          if (var2_int == 0) {
            stackIn_6_0 = c.field_o;
            return stackIn_6_0;
          }
          if (var2_int > 64) {
            stackIn_10_0 = nb.field_V;
            return stackIn_10_0;
          }
          if (param0.charAt(0) == 34) {
            if (param0.charAt(var2_int - 1) != 34) {
              stackIn_15_0 = jg.field_h;
              return stackIn_15_0;
            }
            var3 = 0;
            for (var4 = 1; -1 + var2_int > var4; var4++) {
              var5 = param0.charAt(var4);
              if (var5 == 92) {
                stackIn_24_0 = (var3 != 0) ? 0 : 1;
                var3 = stackIn_24_0;
              } else {
                if (var5 == 34 &&
                  var3 == 0) {
                  stackIn_28_0 = jg.field_h;
                  return stackIn_28_0;
                }
                var3 = 0;
              }
            }
            return null;
          }
          var3Lifetime1 = 0;
          for (var4Lifetime1 = 0; var4Lifetime1 < var2_int; var4Lifetime1++) {
            boolean decompiledFrameRemainder0 = true;
            var5Lifetime1 = param0.charAt(var4Lifetime1);
            if (var5Lifetime1 == 46) {
              if (0 != var4Lifetime1 &&
                var4Lifetime1 != -1 + var2_int &&
                var3Lifetime1 == 0) {
                var3Lifetime1 = 1;
                decompiledFrameRemainder0 = false;
              }
              else {
                stackIn_42_0 = jg.field_h;
                return stackIn_42_0;
              }
            }
            if (decompiledFrameRemainder0) {
              if (lc.field_c.indexOf(var5Lifetime1) == -1) {
                stackIn_46_0 = jg.field_h;
                return stackIn_46_0;
              }
              var3Lifetime1 = 0;
            }
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_52_0 = var2;
          stackIn_52_1 = new StringBuilder().append("cf.B(");
          if (param0 == null) {
            stackIn_53_2 = "null";
          } else {
            stackIn_53_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_52_0), ((StringBuilder) (Object) stackIn_52_1).append(stackIn_53_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_q = new byte[520];
        field_r = false;
    }
}
