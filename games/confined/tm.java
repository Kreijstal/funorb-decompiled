/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class tm implements Iterator {
    static String field_a;
    private jl field_c;
    private jl field_b;
    private lm field_d;
    static String field_e;

    final static byte[] a(int param0, byte[] param1) {
        int discarded$1 = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        byte[] var6_ref_byte__ = null;
        byte[] var7 = null;
        Object var8 = null;
        Throwable var9 = null;
        kg var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] stackIn_7_0 = null;
        byte[] stackIn_21_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        byte[] stackOut_20_0 = null;
        byte[] stackOut_6_0 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        try {
          L0: {
            L1: {
              var10 = new kg(param1);
              var3 = 94 % ((53 - param0) / 46);
              var4 = var10.c(32);
              var5 = var10.f((byte) 46);
              if (-1 < (var5 ^ -1)) {
                break L1;
              } else {
                L2: {
                  if (qk.field_a == 0) {
                    break L2;
                  } else {
                    if (var5 <= qk.field_a) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                if (var4 != 0) {
                  L3: {
                    var6 = var10.f((byte) 51);
                    if (var6 < 0) {
                      break L3;
                    } else {
                      L4: {
                        if (qk.field_a == 0) {
                          break L4;
                        } else {
                          if (qk.field_a >= var6) {
                            break L4;
                          } else {
                            break L3;
                          }
                        }
                      }
                      L5: {
                        var14 = new byte[var6];
                        var12 = var14;
                        var7 = var12;
                        if (-2 != (var4 ^ -1)) {
                          var8 = mc.field_d;
                          synchronized (var8) {
                            L6: {
                              mc.field_d.a(false, var14, var10);
                              break L6;
                            }
                          }
                          break L5;
                        } else {
                          discarded$1 = oa.a(var14, var6, param1, var5, 9);
                          break L5;
                        }
                      }
                      stackOut_20_0 = (byte[]) (var7);
                      stackIn_21_0 = stackOut_20_0;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                  throw new RuntimeException();
                } else {
                  var13 = new byte[var5];
                  var11 = var13;
                  var6_ref_byte__ = var11;
                  var10.a(0, (byte) 122, var5, var13);
                  stackOut_6_0 = (byte[]) (var6_ref_byte__);
                  stackIn_7_0 = stackOut_6_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) (var2);
            stackOut_22_1 = new StringBuilder().append("tm.C(").append(param0).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L7;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          return stackIn_21_0;
        }
    }

    public final Object next() {
        jl var1 = this.field_c;
        if (var1 != this.field_d.field_b) {
            this.field_c = var1.field_o;
        } else {
            this.field_c = null;
            var1 = null;
        }
        this.field_b = var1;
        return var1;
    }

    final static al a(java.applet.Applet param0, int param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        al[] var3 = null;
        int var4 = 0;
        al var5 = null;
        int var6 = 0;
        al stackIn_3_0 = null;
        al stackIn_9_0 = null;
        al stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        al stackOut_11_0 = null;
        al stackOut_8_0 = null;
        al stackOut_2_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var6 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            var2 = ml.a("jagex-last-login-method", (byte) 79, param0);
            if (var2 != null) {
              L1: {
                var3 = nn.b(68);
                var4 = 0;
                if (param1 <= -3) {
                  break L1;
                } else {
                  field_e = (String) null;
                  break L1;
                }
              }
              L2: while (true) {
                if (var4 >= var3.length) {
                  stackOut_11_0 = tk.field_f;
                  stackIn_12_0 = stackOut_11_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  var5 = var3[var4];
                  if (!var5.a(var2, -5851)) {
                    var4++;
                    continue L2;
                  } else {
                    stackOut_8_0 = (al) (var5);
                    stackIn_9_0 = stackOut_8_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            } else {
              stackOut_2_0 = tk.field_f;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var2_ref);
            stackOut_13_1 = new StringBuilder().append("tm.D(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            return stackIn_12_0;
          }
        }
    }

    public final void remove() {
        if (!(this.field_b != null)) {
            throw new IllegalStateException();
        }
        this.field_b.b(true);
        this.field_b = null;
    }

    final static void a(int param0, int param1) {
        ue.field_t = param1 >> -753071228 & 3;
        g.field_m = (12 & param1) >> -1998435326;
        if (param0 > -121) {
            field_e = (String) null;
        }
        if (!((ue.field_t ^ -1) >= -3)) {
            ue.field_t = 2;
        }
        if (2 < g.field_m) {
            g.field_m = 2;
        }
        wd.field_c = 3 & param1;
        if (!(-3 <= (wd.field_c ^ -1))) {
            wd.field_c = 2;
        }
    }

    public final boolean hasNext() {
        return this.field_d.field_b != this.field_c;
    }

    public static void a(int param0) {
        field_a = null;
        int var1 = -25 / ((param0 - 10) / 55);
        field_e = null;
    }

    tm(lm param0) {
        this.field_b = null;
        try {
            this.field_d = param0;
            this.field_b = null;
            this.field_c = this.field_d.field_b.field_o;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "tm.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = "Press <%0> to fire homing missiles";
        field_a = "Try again";
    }
}
