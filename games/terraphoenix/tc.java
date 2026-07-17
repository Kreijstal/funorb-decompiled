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

    public static void a(int param0) {
        field_b = null;
        if (param0 > -51) {
            field_c = null;
        }
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

    final static void b(int param0) {
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
          throw qk.a((Throwable) (Object) var1_ref, "tc.B(" + 1 + 41);
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
            throw qk.a((Throwable) (Object) runtimeException, "tc.E(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
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
        char[] var11 = null;
        char[] var12 = null;
        char[] var13 = null;
        char[] var14 = null;
        String stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_13_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var9 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              var14 = new char[param2];
              var13 = var14;
              var12 = var13;
              var11 = var12;
              var10 = var11;
              var4 = var10;
              if (param0 == -114) {
                break L1;
              } else {
                field_b = null;
                break L1;
              }
            }
            var5 = 0;
            var6 = 0;
            L2: while (true) {
              if (var6 >= param2) {
                stackOut_13_0 = new String(var14, 0, var5);
                stackIn_14_0 = stackOut_13_0;
                break L0;
              } else {
                L3: {
                  var7 = 255 & param1[var6 + param3];
                  if (var7 == 0) {
                    break L3;
                  } else {
                    L4: {
                      if (var7 < 128) {
                        break L4;
                      } else {
                        if (var7 >= 160) {
                          break L4;
                        } else {
                          L5: {
                            var8 = oj.field_s[var7 + -128];
                            if (0 != var8) {
                              break L5;
                            } else {
                              var8 = 63;
                              break L5;
                            }
                          }
                          var7 = var8;
                          break L4;
                        }
                      }
                    }
                    int incrementValue$2 = var5;
                    var5++;
                    var10[incrementValue$2] = (char)var7;
                    break L3;
                  }
                }
                var6++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4_ref = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var4_ref;
            stackOut_15_1 = new StringBuilder().append("tc.C(").append(param0).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L6;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L6;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_14_0;
    }

    final static int a(boolean param0, int param1, int param2, int param3, int param4) {
        if (param0) {
            field_d = null;
        }
        return (param1 + -param3) * (-param3 + param1) + (-param2 + param4) * (-param2 + param4);
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
