/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class tc implements Iterable {
    static String field_b;
    vh field_a;
    static o field_f;
    static int field_e;
    static String field_d;
    static int[] field_c;

    private tc() throws Throwable {
        throw new Error();
    }

    public final Iterator iterator() {
        return (Iterator) (Object) new ne((tc) this);
    }

    public static void a() {
        field_b = null;
        field_f = null;
        field_c = null;
        field_d = null;
    }

    final vh c(int param0) {
        if (param0 != 0) {
            vh discarded$0 = ((tc) this).c(117);
        }
        vh var2 = ((tc) this).field_a.field_o;
        if (((tc) this).field_a == var2) {
            return null;
        }
        var2.c((byte) 13);
        return var2;
    }

    final static void b() {
        Object var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        Throwable var3 = null;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        var4 = Terraphoenix.field_V;
        try {
          L0: {
            var1 = (Object) (Object) th.field_g;
            synchronized (var1) {
              L1: {
                L2: {
                  eb.field_F = eb.field_F + 1;
                  r.field_V = d.field_M;
                  if (0 <= dj.field_e) {
                    L3: while (true) {
                      if (vl.field_h == dj.field_e) {
                        break L2;
                      } else {
                        var2 = sj.field_g[vl.field_h];
                        vl.field_h = vl.field_h + 1 & 127;
                        if (var2 >= 0) {
                          bh.field_e[var2] = true;
                          continue L3;
                        } else {
                          bh.field_e[~var2] = false;
                          continue L3;
                        }
                      }
                    }
                  } else {
                    var2 = 0;
                    L4: while (true) {
                      if (var2 >= 112) {
                        dj.field_e = vl.field_h;
                        break L2;
                      } else {
                        bh.field_e[var2] = false;
                        var2++;
                        continue L4;
                      }
                    }
                  }
                }
                d.field_M = u.field_g;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw qk.a((Throwable) (Object) var1_ref, "tc.B(" + 1 + ')');
        }
    }

    final void a(vh param0, byte param1) {
        try {
            if (!(param0.field_i == null)) {
                param0.c((byte) 13);
            }
            param0.field_i = ((tc) this).field_a.field_i;
            param0.field_o = ((tc) this).field_a;
            param0.field_i.field_o = param0;
            int var3_int = -73 / ((param1 - -57) / 49);
            param0.field_o.field_i = param0;
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "tc.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static String a(byte param0, byte[] param1, int param2, int param3) {
        char[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        char[] var10 = null;
        String stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_11_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var9 = Terraphoenix.field_V;
        try {
          L0: {
            var10 = new char[param2];
            var4 = var10;
            var5 = 0;
            var6 = 0;
            L1: while (true) {
              if (var6 >= param2) {
                stackOut_11_0 = new String(var10, 0, var5);
                stackIn_12_0 = stackOut_11_0;
                break L0;
              } else {
                L2: {
                  var7 = 255 & param1[var6 + param3];
                  if (var7 == 0) {
                    break L2;
                  } else {
                    L3: {
                      if (var7 < 128) {
                        break L3;
                      } else {
                        if (var7 >= 160) {
                          break L3;
                        } else {
                          L4: {
                            var8 = oj.field_s[var7 + -128];
                            if (0 != var8) {
                              break L4;
                            } else {
                              var8 = 63;
                              break L4;
                            }
                          }
                          var7 = var8;
                          break L3;
                        }
                      }
                    }
                    int incrementValue$2 = var5;
                    var5++;
                    var10[incrementValue$2] = (char)var7;
                    break L2;
                  }
                }
                var6++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4_ref;
            stackOut_13_1 = new StringBuilder().append("tc.C(").append(-114).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_12_0;
    }

    final static int a(boolean param0, int param1, int param2, int param3, int param4) {
        return (param1 + -240) * (-240 + param1) + (-320 + param4) * (-320 + param4);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "This password is part of your Player Name, and would be easy to guess";
        field_f = new o();
        field_d = "Unfortunately your configuration doesn't support fullscreen mode.";
    }
}
