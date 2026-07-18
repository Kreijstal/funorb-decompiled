/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class vc {
    static int[] field_b;
    String field_j;
    static long field_a;
    String field_c;
    static stellarshard field_h;
    static String field_g;
    String field_d;
    int field_i;
    static int[] field_f;
    pf field_e;

    public static void a() {
        field_h = null;
        field_b = null;
        field_g = null;
        field_f = null;
    }

    final static pb a(pf param0, int param1, int param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          if (tl.a(param0, (byte) -5, param2, param1)) {
            int discarded$2 = -118;
            return vg.c();
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("vc.A(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L0;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L0;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ',' + param2 + ',' + -2 + ')');
        }
    }

    final static void a(byte param0, boolean param1, boolean param2) {
        if (param0 >= -61) {
          L0: {
            int discarded$9 = vc.a((byte) 54);
            if (!param2) {
              ti.d();
              ti.d();
              ti.d();
              break L0;
            } else {
              ti.b(0, 0, ti.field_i, ti.field_b, 0, 192);
              break L0;
            }
          }
          af.a(param2, (byte) -98);
          return;
        } else {
          L1: {
            if (!param2) {
              ti.d();
              ti.d();
              ti.d();
              break L1;
            } else {
              ti.b(0, 0, ti.field_i, ti.field_b, 0, 192);
              break L1;
            }
          }
          af.a(param2, (byte) -98);
          return;
        }
    }

    final static int a(byte param0) {
        try {
            IOException var1 = null;
            int var1_int = 0;
            int var2 = 0;
            ka var3 = null;
            int stackIn_14_0 = 0;
            int stackIn_24_0 = 0;
            int stackIn_27_0 = 0;
            int stackIn_31_0 = 0;
            int stackIn_33_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_13_0 = 0;
            int stackOut_26_0 = 0;
            int stackOut_23_0 = 0;
            int stackOut_32_0 = 0;
            int stackOut_30_0 = 0;
            if (4 > od.field_v.field_i) {
              try {
                L0: {
                  L1: {
                    if (kc.field_b == 0) {
                      dl.field_A = fa.field_p.a(field_g, (byte) 34, ll.field_b);
                      kc.field_b = kc.field_b + 1;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  L2: {
                    if (kc.field_b != 1) {
                      break L2;
                    } else {
                      if (dl.field_A.field_f == 2) {
                        stackOut_13_0 = tc.a(-1, (byte) 127);
                        stackIn_14_0 = stackOut_13_0;
                        return stackIn_14_0;
                      } else {
                        if (1 == dl.field_A.field_f) {
                          kc.field_b = kc.field_b + 1;
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  L3: {
                    if (kc.field_b != 2) {
                      break L3;
                    } else {
                      k.field_b = new fh((java.net.Socket) dl.field_A.field_b, fa.field_p);
                      var3 = new ka(13);
                      bk.a(fd.field_nb, false, sk.field_b, var3, ld.field_C);
                      var3.a(false, 15);
                      var3.b(0, n.field_d);
                      k.field_b.a(var3.field_r, 0, 120, 13);
                      kc.field_b = kc.field_b + 1;
                      fj.field_j = ih.a((byte) -98) + 30000L;
                      break L3;
                    }
                  }
                  L4: {
                    var1_int = 23 / ((param0 - -55) / 60);
                    if (kc.field_b != 3) {
                      break L4;
                    } else {
                      if (k.field_b.b(-95) > 0) {
                        var2 = k.field_b.a(0);
                        if (var2 == 0) {
                          kc.field_b = kc.field_b + 1;
                          break L4;
                        } else {
                          stackOut_26_0 = tc.a(var2, (byte) 125);
                          stackIn_27_0 = stackOut_26_0;
                          return stackIn_27_0;
                        }
                      } else {
                        if (~fj.field_j <= ~ih.a((byte) -98)) {
                          break L4;
                        } else {
                          stackOut_23_0 = tc.a(-2, (byte) 126);
                          stackIn_24_0 = stackOut_23_0;
                          return stackIn_24_0;
                        }
                      }
                    }
                  }
                  if (4 != kc.field_b) {
                    stackOut_32_0 = -1;
                    stackIn_33_0 = stackOut_32_0;
                    break L0;
                  } else {
                    od.field_v.a(sd.field_i, (Object) (Object) k.field_b, 70);
                    dl.field_A = null;
                    k.field_b = null;
                    kc.field_b = 0;
                    stackOut_30_0 = 0;
                    stackIn_31_0 = stackOut_30_0;
                    return stackIn_31_0;
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var1 = (IOException) (Object) decompiledCaughtException;
                return tc.a(-3, (byte) 125);
              }
              return stackIn_33_0;
            } else {
              if (od.field_v.field_g == -1) {
                return 3;
              } else {
                if (-2 != od.field_v.field_g) {
                  return 1;
                } else {
                  return 4;
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private vc() throws Throwable {
        throw new Error();
    }

    static {
    }
}
