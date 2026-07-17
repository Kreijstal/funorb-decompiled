/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

abstract class qda {
    vj field_e;
    static String field_l;
    vj field_m;
    static String field_f;
    static int field_i;
    static String field_b;
    vj field_c;
    vj field_k;
    long field_j;
    uia field_o;
    int field_p;
    uia field_h;
    volatile int field_n;
    volatile int field_a;
    byte field_d;
    qqa field_g;

    public static void c(byte param0) {
        field_b = null;
        field_l = null;
        field_f = null;
    }

    final boolean d(int param0) {
        if (param0 != -21) {
            boolean discarded$0 = ((qda) this).b(-15);
        }
        return ((qda) this).f(-3) >= 20 ? true : false;
    }

    final int f(int param0) {
        if (param0 != -3) {
            int discarded$0 = qda.b((byte) 52);
        }
        return ((qda) this).field_e.a((byte) -56) - -((qda) this).field_m.a((byte) -92);
    }

    final static void a(int param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        toa var4 = null;
        ik var5 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var4 = (toa) (Object) vsa.field_m.f(-80);
            L1: while (true) {
              if (var4 == null) {
                var5 = (ik) (Object) hca.field_I.f(-80);
                L2: while (true) {
                  if (var5 == null) {
                    break L0;
                  } else {
                    fna.a(param0, -23814, var5);
                    var5 = (ik) (Object) hca.field_I.e(121);
                    continue L2;
                  }
                }
              } else {
                uca.a(param0, var4, (byte) 93);
                var4 = (toa) (Object) vsa.field_m.e(113);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "qda.B(" + param0 + 44 + -21 + 41);
        }
    }

    final static int b(byte param0) {
        try {
            IOException var1 = null;
            int var1_int = 0;
            uia var2 = null;
            int stackIn_16_0 = 0;
            int stackIn_26_0 = 0;
            int stackIn_31_0 = 0;
            int stackIn_34_0 = 0;
            int stackIn_36_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_15_0 = 0;
            int stackOut_30_0 = 0;
            int stackOut_25_0 = 0;
            int stackOut_35_0 = 0;
            int stackOut_33_0 = 0;
            if (4 > wg.field_l.field_a) {
              if (param0 == -66) {
                try {
                  L0: {
                    L1: {
                      if (cma.field_m == 0) {
                        bga.field_c = oi.field_a.a(-24818, pca.field_a, du.field_d);
                        cma.field_m = cma.field_m + 1;
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                    L2: {
                      if (cma.field_m == 1) {
                        if (2 != bga.field_c.field_b) {
                          if (bga.field_c.field_b != 1) {
                            break L2;
                          } else {
                            cma.field_m = cma.field_m + 1;
                            break L2;
                          }
                        } else {
                          stackOut_15_0 = du.a(-1, (byte) 122);
                          stackIn_16_0 = stackOut_15_0;
                          return stackIn_16_0;
                        }
                      } else {
                        break L2;
                      }
                    }
                    L3: {
                      if (cma.field_m != 2) {
                        break L3;
                      } else {
                        jia.field_a = new jqa((java.net.Socket) bga.field_c.field_f, oi.field_a);
                        var2 = new uia(13);
                        ea.a((byte) 107, pu.field_b, var2, wk.field_n, joa.field_a);
                        var2.i(15, 0);
                        var2.a(wea.field_a, (byte) 117);
                        jia.field_a.a(var2.field_g, 0, 13, 106);
                        cma.field_m = cma.field_m + 1;
                        pm.field_n = 30000L + bva.b((byte) -107);
                        break L3;
                      }
                    }
                    L4: {
                      if (cma.field_m == 3) {
                        if (jia.field_a.c(0) <= 0) {
                          if (bva.b((byte) -107) > pm.field_n) {
                            stackOut_30_0 = du.a(-2, (byte) 17);
                            stackIn_31_0 = stackOut_30_0;
                            return stackIn_31_0;
                          } else {
                            break L4;
                          }
                        } else {
                          var1_int = jia.field_a.d(-2147483648);
                          if (var1_int == 0) {
                            cma.field_m = cma.field_m + 1;
                            break L4;
                          } else {
                            stackOut_25_0 = du.a(var1_int, (byte) -26);
                            stackIn_26_0 = stackOut_25_0;
                            return stackIn_26_0;
                          }
                        }
                      } else {
                        break L4;
                      }
                    }
                    if (4 != cma.field_m) {
                      stackOut_35_0 = -1;
                      stackIn_36_0 = stackOut_35_0;
                      break L0;
                    } else {
                      wg.field_l.a((Object) (Object) jia.field_a, (byte) 54, vga.field_q);
                      cma.field_m = 0;
                      jia.field_a = null;
                      bga.field_c = null;
                      stackOut_33_0 = 0;
                      stackIn_34_0 = stackOut_33_0;
                      return stackIn_34_0;
                    }
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var1 = (IOException) (Object) decompiledCaughtException;
                  return du.a(-3, (byte) -93);
                }
                return stackIn_36_0;
              } else {
                return -114;
              }
            } else {
              if (wg.field_l.field_n == -1) {
                return 3;
              } else {
                if (wg.field_l.field_n != -2) {
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

    abstract void a(int param0);

    abstract void e(int param0);

    abstract boolean c(int param0);

    abstract void a(Object param0, byte param1, boolean param2);

    final boolean b(int param0) {
        if (param0 != -21) {
            ((qda) this).field_o = null;
        }
        return ((qda) this).a((byte) 78) >= 20 ? true : false;
    }

    final static int a(BitSet param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            var3 = 0;
            L1: while (true) {
              if (var3 >= param0.size()) {
                stackOut_6_0 = var2_int;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                L2: {
                  if (!param0.get(var3)) {
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var2;
            stackOut_8_1 = new StringBuilder().append("qda.F(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + 83 + 41);
        }
        return stackIn_7_0;
    }

    final int a(byte param0) {
        if (param0 != 78) {
            ((qda) this).field_k = null;
        }
        return ((qda) this).field_c.a((byte) -77) + ((qda) this).field_k.a((byte) -43);
    }

    final qqa a(int param0, boolean param1, int param2, int param3, byte param4) {
        long var6 = ((long)param2 << 32) - -(long)param0;
        qqa var8 = new qqa();
        var8.field_j = var6;
        if (param3 != -21) {
            return null;
        }
        var8.field_l = param1 ? true : false;
        var8.field_q = param4;
        if (param1) {
            if (!(((qda) this).f(param3 ^ 22) > -21)) {
                throw new RuntimeException();
            }
            ((qda) this).field_e.a((od) (Object) var8, (byte) -78);
        } else {
            if (!(-21 > ((qda) this).a((byte) 78))) {
                throw new RuntimeException();
            }
            ((qda) this).field_c.a((od) (Object) var8, (byte) -96);
        }
        return var8;
    }

    final static boolean a(byte param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == -72) {
                break L1;
              } else {
                field_l = null;
                break L1;
              }
            }
            var2_int = 0;
            L2: while (true) {
              if (param1.length() <= var2_int) {
                stackOut_10_0 = 0;
                stackIn_11_0 = stackOut_10_0;
                break L0;
              } else {
                L3: {
                  var3 = param1.charAt(var2_int);
                  if (dja.a((byte) -20, (char) var3)) {
                    break L3;
                  } else {
                    if (dp.a(param0 + 190, (char) var3)) {
                      break L3;
                    } else {
                      stackOut_7_0 = 1;
                      stackIn_8_0 = stackOut_7_0;
                      return stackIn_8_0 != 0;
                    }
                  }
                }
                var2_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var2;
            stackOut_12_1 = new StringBuilder().append("qda.K(").append(param0).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
        }
        return stackIn_11_0 != 0;
    }

    qda() {
        ((qda) this).field_e = new vj();
        ((qda) this).field_m = new vj();
        ((qda) this).field_c = new vj();
        ((qda) this).field_k = new vj();
        ((qda) this).field_o = new uia(6);
        ((qda) this).field_a = 0;
        ((qda) this).field_n = 0;
        ((qda) this).field_d = (byte) 0;
        ((qda) this).field_h = new uia(10);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Unfortunately we are unable to create an account for you at this time.";
        field_l = "Try changing the following settings:  ";
    }
}
