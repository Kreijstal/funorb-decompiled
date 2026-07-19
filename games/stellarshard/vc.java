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

    public static void a(int param0) {
        if (param0 != -1) {
            return;
        }
        field_h = null;
        field_b = null;
        field_g = null;
        field_f = null;
    }

    final static pb a(pf param0, int param1, int param2, int param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            if (param3 == -2) {
              break L0;
            } else {
              field_a = 32L;
              break L0;
            }
          }
          if (tl.a(param0, (byte) -5, param2, param1)) {
            return vg.c((byte) -118);
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var4);
            stackOut_6_1 = new StringBuilder().append("vc.A(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L1;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(byte param0, boolean param1, boolean param2) {
        int discarded$5 = 0;
        if (param0 < -61) {
          if (param2) {
            ti.b(0, 0, ti.field_i, ti.field_b, 0, 192);
            af.a(param2, (byte) -98);
            return;
          } else {
            ti.d();
            af.a(param2, (byte) -98);
            return;
          }
        } else {
          discarded$5 = vc.a((byte) 54);
          if (param2) {
            ti.b(0, 0, ti.field_i, ti.field_b, 0, 192);
            af.a(param2, (byte) -98);
            return;
          } else {
            ti.d();
            af.a(param2, (byte) -98);
            return;
          }
        }
    }

    final static int a(byte param0) {
        try {
            IOException var1 = null;
            int var1_int = 0;
            int var2 = 0;
            ka var3 = null;
            int stackIn_15_0 = 0;
            int stackIn_25_0 = 0;
            int stackIn_28_0 = 0;
            int stackIn_32_0 = 0;
            int stackIn_34_0 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_14_0 = 0;
            int stackOut_27_0 = 0;
            int stackOut_24_0 = 0;
            int stackOut_33_0 = 0;
            int stackOut_31_0 = 0;
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
                      if ((dl.field_A.field_f ^ -1) == -3) {
                        stackOut_14_0 = tc.a(-1, (byte) 127);
                        stackIn_15_0 = stackOut_14_0;
                        decompiledRegionSelector0 = 0;
                        break L0;
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
                    if ((kc.field_b ^ -1) != -3) {
                      break L3;
                    } else {
                      k.field_b = new fh((java.net.Socket) (dl.field_A.field_b), fa.field_p);
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
                    if (-4 != (kc.field_b ^ -1)) {
                      break L4;
                    } else {
                      if (-1 > (k.field_b.b(-95) ^ -1)) {
                        var2 = k.field_b.a(0);
                        if (-1 == (var2 ^ -1)) {
                          kc.field_b = kc.field_b + 1;
                          break L4;
                        } else {
                          stackOut_27_0 = tc.a(var2, (byte) 125);
                          stackIn_28_0 = stackOut_27_0;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        }
                      } else {
                        if ((fj.field_j ^ -1L) <= (ih.a((byte) -98) ^ -1L)) {
                          break L4;
                        } else {
                          stackOut_24_0 = tc.a(-2, (byte) 126);
                          stackIn_25_0 = stackOut_24_0;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      }
                    }
                  }
                  if (4 != kc.field_b) {
                    stackOut_33_0 = -1;
                    stackIn_34_0 = stackOut_33_0;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    od.field_v.a(sd.field_i, k.field_b, 70);
                    dl.field_A = null;
                    k.field_b = null;
                    kc.field_b = 0;
                    stackOut_31_0 = 0;
                    stackIn_32_0 = stackOut_31_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var1 = (IOException) (Object) decompiledCaughtException;
                return tc.a(-3, (byte) 125);
              }
              if (decompiledRegionSelector0 == 0) {
                return stackIn_15_0;
              } else {
                if (decompiledRegionSelector0 == 1) {
                  return stackIn_25_0;
                } else {
                  if (decompiledRegionSelector0 == 2) {
                    return stackIn_28_0;
                  } else {
                    if (decompiledRegionSelector0 == 3) {
                      return stackIn_32_0;
                    } else {
                      return stackIn_34_0;
                    }
                  }
                }
              }
            } else {
              if (od.field_v.field_g == -1) {
                return 3;
              } else {
                if (-2 == od.field_v.field_g) {
                  return 4;
                } else {
                  return 1;
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
