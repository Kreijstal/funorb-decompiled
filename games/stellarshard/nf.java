/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nf extends gg {
    int field_t;
    int field_p;
    int field_l;
    long field_k;
    int[] field_m;
    static boolean field_r;
    int field_n;
    int field_s;
    int field_q;
    static String field_o;
    int field_u;

    public static void a(int param0) {
        field_o = null;
        if (param0 != 65535) {
            nf.a((byte) -8);
        }
    }

    final static void a(byte param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        mk var3_ref_mk = null;
        int var3 = 0;
        le var4 = null;
        int var4_int = 0;
        Object var5 = null;
        int var6 = 0;
        ha var9 = null;
        byte[] var13 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = stellarshard.field_B;
        try {
          L0: {
            var9 = ae.field_N;
            var2 = var9.f(4);
            if (param0 > 61) {
              if (0 != var2) {
                if (var2 != 1) {
                  qe.a(-111, "A1: " + bh.b((byte) -127), (Throwable) null);
                  oj.c(-2290);
                  decompiledRegionSelector0 = 4;
                  break L0;
                } else {
                  var3 = var9.b(false);
                  var4 = (le) ((Object) fg.field_G.b(-90));
                  L1: while (true) {
                    L2: {
                      if (var4 == null) {
                        break L2;
                      } else {
                        if (var4.field_o == var3) {
                          break L2;
                        } else {
                          var4 = (le) ((Object) fg.field_G.b((byte) 81));
                          continue L1;
                        }
                      }
                    }
                    if (var4 != null) {
                      var4.c(20);
                      return;
                    } else {
                      oj.c(-2290);
                      decompiledRegionSelector0 = 3;
                      break L0;
                    }
                  }
                }
              } else {
                var3_ref_mk = (mk) ((Object) gg.field_b.b(-96));
                if (var3_ref_mk == null) {
                  oj.c(-2290);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L3: {
                    var4_int = var9.f(4);
                    if (-1 == (var4_int ^ -1)) {
                      var5 = null;
                      break L3;
                    } else {
                      var13 = new byte[var4_int];
                      var9.a(0, (byte) -126, var4_int, var13);
                      break L3;
                    }
                  }
                  var9.field_k = var9.field_k + 4;
                  if (var9.a(true)) {
                    var3_ref_mk.c(20);
                    return;
                  } else {
                    oj.c(-2290);
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var1), "nf.B(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                return;
              }
            }
          }
        }
    }

    nf(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        int fieldTemp$0 = 0;
        try {
            this.field_m = param6;
            this.field_n = param5;
            this.field_l = param2;
            this.field_q = param1;
            this.field_t = param4;
            this.field_s = param0;
            fieldTemp$0 = sa.field_i;
            sa.field_i = sa.field_i + 1;
            this.field_u = 65535 & fieldTemp$0;
            this.field_p = param3;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "nf.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_o = "Please send me news and updates (I can unsubscribe at any time)";
    }
}
