/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class jl {
    static String[] field_c;
    static String field_d;
    static int field_e;
    static long field_h;
    static lj field_b;
    static ka[] field_a;
    static java.math.BigInteger field_f;
    static String field_g;

    final int a(byte param0, long param1) {
        long var4 = this.c(121);
        if (param0 != -12) {
          this.a(69L, 62);
        }
        if (var4 > 0L) {
          c.a(-127, var4);
        }
        return this.a(param1, param0 ^ -24);
    }

    abstract void a(int param0);

    abstract int a(long param0, int param1);

    public static void b(int param0) {
        int var1 = 46 % ((param0 - 25) / 53);
        field_a = null;
        field_b = null;
        field_g = null;
        field_f = null;
        field_d = null;
        field_c = null;
    }

    abstract long c(int param0);

    final static void a(byte param0) {
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = TorChallenge.field_F ? 1 : 0;
        try {
          var5 = 0;
          var6 = 28;
          if (hf.field_d != null &&
            var6 <= hf.field_d.length) {
            for (var7 = 0; var7 < 3; var7++) {
              var1_int = 0;
              for (var8 = 0; var8 < 4; var8++) {
                var3 = 0;
                var4 = 0;
                if (0 == var8) {
                  var4 = 255;
                } else {
                  if (1 == var8) {
                    var4 = 65280;
                  } else {
                    if (var8 == 2) {
                      var4 = 16711680;
                    } else {
                      if (var8 == 3) {
                        var4 = -16777216;
                      }
                    }
                  }
                }
                var3 = var3 | hf.field_d[var5 + var8];
                var1_int = var1_int | var4 & (255 & var3) << 8 * var8;
              }
              var2 = 0;
              for (var8 = 0; var8 < 4; var8++) {
                var3 = 0;
                var4 = 0;
                if (var8 == 0) {
                  var4 = 255;
                } else {
                  if (var8 != 1) {
                    if (2 == var8) {
                      var4 = 16711680;
                    } else {
                      if (var8 == 3) {
                        var4 = -16777216;
                      }
                    }
                  } else {
                    var4 = 65280;
                  }
                }
                var3 = var3 | hf.field_d[var5 - (-4 - var8)];
                var2 = var2 | (255 & var3) << var8 * 8 & var4;
              }
              for (var8 = 0; 5 > var8; var8++) {
                pi.field_d[var7][var8] = 0;
              }
              var3 = 0;
              var3 = var3 | 31 & var1_int;
              pi.field_d[var7][0] = p.a(pi.field_d[var7][0], jh.a(31, var3));
              var3 = 0;
              var3 = var3 | 31 & var1_int >> 6;
              pi.field_d[var7][1] = p.a(pi.field_d[var7][1], jh.a(var3, 31));
              var3 = 0;
              var3 = var3 | var1_int >> 12 & 31;
              pi.field_d[var7][2] = p.a(pi.field_d[var7][2], jh.a(31, var3));
              var3 = 0;
              var3 = var3 | 31 & var1_int >> 18;
              pi.field_d[var7][3] = p.a(pi.field_d[var7][3], jh.a(31, var3));
              var3 = 0;
              var3 = var3 | 31 & var1_int >> 24;
              pi.field_d[var7][4] = p.a(pi.field_d[var7][4], jh.a(31, var3));
              var3 = 0;
              var3 = var3 | (var1_int & -1073741824) >> 30;
              pi.field_d[var7][5] = p.a(pi.field_d[var7][5], jh.a(var3, 31));
              var3 = 0;
              var3 = var3 | 28 & var2 << 2;
              pi.field_d[var7][5] = p.a(pi.field_d[var7][5], jh.a(var3, 31));
              hk.field_c[var7] = 0;
              var3 = 0;
              var3 = var3 | var1_int >> 11 & 1;
              hk.field_c[var7] = p.a(hk.field_c[var7], jh.a(var3, 1));
              var3 = 0;
              var3 = var3 | 2 & var1_int >> 22;
              hk.field_c[var7] = p.a(hk.field_c[var7], jh.a(2, var3));
              var3 = 0;
              var3 = var3 | var2 >> 1 & 4;
              hk.field_c[var7] = p.a(hk.field_c[var7], jh.a(var3, 4));
              var3 = 0;
              k.field_b[var7] = 0;
              var3 = var3 | 1 & var1_int >> 5;
              k.field_b[var7] = p.a(k.field_b[var7], jh.a(var3, 1));
              var3 = 0;
              var3 = var3 | (var1_int & 2048) >> 10;
              k.field_b[var7] = p.a(k.field_b[var7], jh.a(2, var3));
              var3 = 0;
              var3 = var3 | (131072 & var1_int) >> 15;
              k.field_b[var7] = p.a(k.field_b[var7], jh.a(4, var3));
              var3 = 0;
              var3 = var3 | (var1_int & 8388608) >> 20;
              k.field_b[var7] = p.a(k.field_b[var7], jh.a(8, var3));
              var3 = 0;
              var3 = var3 | (var1_int & 536870912) >> 25;
              k.field_b[var7] = p.a(k.field_b[var7], jh.a(var3, 16));
              var3 = 0;
              var3 = var3 | (var2 & 8) << 2;
              var5 += 8;
              k.field_b[var7] = p.a(k.field_b[var7], jh.a(var3, 32));
            }
            var1_int = 0;
            for (var7 = 0; 4 > var7; var7++) {
              L5: {
                var4 = 0;
                var3 = 0;
                var3 = var3 | hf.field_d[var5 + var7];
                if (var7 == 0) {
                  var4 = 255;
                } else {
                  switch (var7) {
                    case 1:
                      var4 = 65280;
                      break;
                    default:
                      var1_int = var1_int | var4 & (255 & var3) << var7 * 8;
                      break L5;
                    case 3:
                      var4 = -16777216;
                      break;
                    case 2:
                      var4 = 16711680;
                      break;
                  }
                }
                var1_int = var1_int | var4 & (255 & var3) << var7 * 8;
              }
            }
            var3 = 0;
            for (var7 = 0; var7 < 3; var7++) {
              hd.field_c[var7] = 0;
            }
            var3 = var3 | var1_int & 31;
            hd.field_c[0] = p.a(hd.field_c[0], jh.a(var3, 31));
            if (param0 <= 111) {
              field_h = 53L;
            }
            var3 = 0;
            var3 = var3 | (var1_int & 992) >> 5;
            hd.field_c[1] = p.a(hd.field_c[1], jh.a(var3, 31));
            var3 = 0;
            var3 = var3 | (var1_int & 31744) >> 10;
            hd.field_c[2] = p.a(hd.field_c[2], jh.a(var3, 31));
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var1), "jl.F(" + param0 + ')');
        }
    }

    final static String a(int param0, CharSequence param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -57) {
            jl.a((byte) 92);
          }
          var2 = vf.a(116, lg.a(param1, -1));
          if (var2 == null) {
            var2 = "";
          }
          stackIn_6_0 = var2;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_9_0 = var2_ref;
          stackIn_9_1 = new StringBuilder().append("jl.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    static {
        field_d = "to over <%0> great games";
        field_a = new ka[3];
        field_g = "OK";
        field_f = new java.math.BigInteger("6757747274818513864204534133465045479284128469717186816691454417744823753827902036844748836683348383638677747113757906301249837209713747402067689777172847");
    }
}
