/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class ug {
    static String field_d;
    static String field_e;
    static volatile int field_a;
    static int field_f;
    String field_c;
    static hd field_g;
    int field_b;

    final java.net.Socket a(int param0) throws IOException {
        int var2 = 75 / ((param0 - 58) / 57);
        return new java.net.Socket(this.field_c, this.field_b);
    }

    final static ud a(byte param0, sh param1, int param2) {
        RuntimeException var3 = null;
        sh var4 = null;
        ud stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -76) {
                break L1;
              } else {
                var4 = (sh) null;
                ug.a((byte) -126, (sh) null, -3);
                break L1;
              }
            }
            stackIn_3_0 = qb.a(true, qi.a(param1, 100, param2));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("ug.K(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    final static o[] a(int param0, int param1, int param2, int param3, int param4) {
        o[] var5;
        o[] var6;
        var6 = new o[9];
        var5 = var6;
        o dupTemp$2 = ib.a(param2, true, param4);
        var6[6] = dupTemp$2;
        var5[3] = dupTemp$2;
        var5[2] = dupTemp$2;
        var5[1] = dupTemp$2;
        var5[0] = dupTemp$2;
        o dupTemp$3 = ib.a(param2, true, param3);
        var6[8] = dupTemp$3;
        var5[7] = dupTemp$3;
        var5[5] = dupTemp$3;
        if (param1 == -8591) {
          if (-1 != (param0 ^ -1)) {
            var6[4] = ib.a(64, true, param0);
            return var5;
          } else {
            return var5;
          }
        } else {
          return (o[]) null;
        }
    }

    public static void b(int param0) {
        hi var2;
        field_d = null;
        field_e = null;
        if (param0 != 100) {
          var2 = (hi) null;
          ug.a((hi) null, 114, 25, 55, (byte) -101, (hi) null);
          field_g = null;
          return;
        } else {
          field_g = null;
          return;
        }
    }

    abstract java.net.Socket a(byte param0) throws IOException;

    final static void a(hi param0, int param1, int param2, int param3, byte param4, hi param5) {
        try {
            ai.field_a = param5;
            kb.field_d = param0;
            vg.field_N = param3;
            int var6_int = 57 % ((param4 - 32) / 62);
            bl.field_i = param2;
            g.field_l = param1;
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "ug.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final static ia a(String param0, int param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        ia var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        ia stackIn_6_0 = null;
        ia stackIn_18_0 = null;
        Object stackIn_21_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            if (null != lc.field_m) {
              var6 = (CharSequence) ((Object) param0);
              var2 = jg.a(var6, -2);
              if (param1 >= 103) {
                L1: {
                  if (var2 == null) {
                    var2 = param0;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var3 = (ia) ((Object) lc.field_m.a((long)var2.hashCode(), true));
                L2: while (true) {
                  if (var3 != null) {
                    L3: {
                      var7 = (CharSequence) ((Object) var3.field_ib);
                      var4 = jg.a(var7, -2);
                      if (var4 == null) {
                        var4 = var3.field_ib;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    if (!var4.equals(var2)) {
                      var3 = (ia) ((Object) lc.field_m.a((byte) -9));
                      if (var5 == 0) {
                        continue L2;
                      } else {
                        stackIn_21_0 = null;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      }
                    } else {
                      stackIn_18_0 = (ia) (var3);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  } else {
                    return null;
                  }
                }
              } else {
                stackIn_6_0 = (ia) null;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2_ref = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var2_ref);

            stackIn_24_1 = new StringBuilder().append("ug.N(");

            if (param0 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L4;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L4;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_18_0;
          } else {
            return (ia) ((Object) stackIn_21_0);
          }
        }
    }

    static {
        field_e = "Unpacking sound effects";
        field_a = 0;
    }
}
