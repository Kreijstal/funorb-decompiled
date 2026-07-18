/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.awt.Frame;

final class ib {
    private int field_d;
    private hg[] field_c;
    private int field_e;
    private hg field_b;
    private hg field_g;
    static hh field_a;
    static eo field_f;

    final hg a(long param0, int param1) {
        hg var5 = null;
        int var6 = EscapeVector.field_A;
        hg var4 = ((ib) this).field_c[(int)((long)(param1 + ((ib) this).field_d) & param0)];
        ((ib) this).field_g = var4.field_b;
        while (var4 != ((ib) this).field_g) {
            if (~param0 == ~((ib) this).field_g.field_e) {
                var5 = ((ib) this).field_g;
                ((ib) this).field_g = ((ib) this).field_g.field_b;
                return var5;
            }
            ((ib) this).field_g = ((ib) this).field_g.field_b;
        }
        ((ib) this).field_g = null;
        return null;
    }

    public static void a(int param0) {
        field_a = null;
        field_f = null;
    }

    final hg a(byte param0) {
        hg var2 = null;
        int var3 = EscapeVector.field_A;
        if (((ib) this).field_e > 0) {
            if (((ib) this).field_b != ((ib) this).field_c[((ib) this).field_e + -1]) {
                var2 = ((ib) this).field_b;
                ((ib) this).field_b = var2.field_b;
                return var2;
            }
        }
        if (param0 != 62) {
            return null;
        }
        do {
            if (((ib) this).field_e >= ((ib) this).field_d) {
                return null;
            }
            int fieldTemp$0 = ((ib) this).field_e;
            ((ib) this).field_e = ((ib) this).field_e + 1;
            var2 = ((ib) this).field_c[fieldTemp$0].field_b;
        } while (((ib) this).field_c[-1 + ((ib) this).field_e] == var2);
        ((ib) this).field_b = var2.field_b;
        return var2;
    }

    final hg a(boolean param0) {
        if (param0) {
            hg discarded$0 = ((ib) this).a(-30L, 70);
        }
        ((ib) this).field_e = 0;
        return ((ib) this).a((byte) 62);
    }

    final void a(hg param0, int param1, long param2) {
        hg var5 = null;
        if (null != param0.field_d) {
            param0.c((byte) -115);
        }
        if (param1 != 10901) {
            return;
        }
        try {
            var5 = ((ib) this).field_c[(int)((long)(((ib) this).field_d + -1) & param2)];
            param0.field_d = var5.field_d;
            param0.field_b = var5;
            param0.field_d.field_b = param0;
            param0.field_b.field_d = param0;
            param0.field_e = param2;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "ib.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static java.awt.Frame a(byte param0, int param1, int param2, lk param3, int param4, int param5) {
        RuntimeException var6 = null;
        ja[] var6_array = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var8 = 0;
        int var9 = 0;
        ja[] var10 = null;
        la var11 = null;
        Object stackIn_27_0 = null;
        java.awt.Frame stackIn_29_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        java.awt.Frame stackOut_28_0 = null;
        Object stackOut_26_0 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var9 = EscapeVector.field_A;
        try {
          L0: {
            if (param3.c(0)) {
              L1: {
                if (param4 == 0) {
                  var10 = dh.a(6629, param3);
                  var6_array = var10;
                  if (var6_array != null) {
                    var7_int = 0;
                    var8 = 0;
                    L2: while (true) {
                      if (var8 >= var10.length) {
                        if (var7_int != 0) {
                          break L1;
                        } else {
                          return null;
                        }
                      } else {
                        L3: {
                          if (var10[var8].field_c != param1) {
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        var8++;
                        continue L2;
                      }
                    }
                  } else {
                    return null;
                  }
                } else {
                  break L1;
                }
              }
              var11 = param3.a(-103, param4, param2, 0, param1);
              L4: while (true) {
                if (var11.field_f != 0) {
                  var7 = (java.awt.Frame) var11.field_b;
                  if (var7 != null) {
                    if (var11.field_f != 2) {
                      stackOut_28_0 = (java.awt.Frame) var7;
                      stackIn_29_0 = stackOut_28_0;
                      break L0;
                    } else {
                      af.a(param3, var7, false);
                      stackOut_26_0 = null;
                      stackIn_27_0 = stackOut_26_0;
                      return (java.awt.Frame) (Object) stackIn_27_0;
                    }
                  } else {
                    return null;
                  }
                } else {
                  en.a((byte) -31, 10L);
                  continue L4;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) var6;
            stackOut_30_1 = new StringBuilder().append("ib.A(").append(93).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param3 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L5;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L5;
            }
          }
          throw t.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + ',' + param4 + ',' + 0 + ')');
        }
        return stackIn_29_0;
    }

    ib(int param0) {
        int var2 = 0;
        hg var3 = null;
        ((ib) this).field_e = 0;
        ((ib) this).field_d = param0;
        ((ib) this).field_c = new hg[param0];
        for (var2 = 0; param0 > var2; var2++) {
            hg dupTemp$0 = new hg();
            var3 = dupTemp$0;
            ((ib) this).field_c[var2] = dupTemp$0;
            var3.field_d = var3;
            var3.field_b = var3;
        }
    }

    static {
    }
}
