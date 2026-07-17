/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ik implements Iterator {
    static boolean field_j;
    static mh field_a;
    private ji field_e;
    private int field_d;
    static tq field_g;
    private nm field_h;
    private nm field_k;
    static mh[] field_i;
    static jp[] field_f;
    static String[] field_b;
    static jp field_c;

    static int a(int param0, int param1) {
        return param0 & param1;
    }

    private final void b() {
        ((ik) this).field_d = 1;
        ((ik) this).field_h = ((ik) this).field_e.field_d[0].field_e;
        ((ik) this).field_k = null;
    }

    public final boolean hasNext() {
        int var2 = 0;
        var2 = BrickABrac.field_J ? 1 : 0;
        if (((ik) this).field_h == ((ik) this).field_e.field_d[((ik) this).field_d - 1]) {
          L0: while (true) {
            if (((ik) this).field_e.field_c <= ((ik) this).field_d) {
              return false;
            } else {
              nm[] fieldTemp$16 = ((ik) this).field_e.field_d;
              int fieldTemp$17 = ((ik) this).field_d;
              ((ik) this).field_d = ((ik) this).field_d + 1;
              if (fieldTemp$16[fieldTemp$17].field_e != ((ik) this).field_e.field_d[((ik) this).field_d + -1]) {
                ((ik) this).field_h = ((ik) this).field_e.field_d[((ik) this).field_d + -1].field_e;
                return true;
              } else {
                ((ik) this).field_h = ((ik) this).field_e.field_d[((ik) this).field_d - 1];
                continue L0;
              }
            }
          }
        } else {
          return true;
        }
    }

    public final Object next() {
        nm var1 = null;
        int var2 = BrickABrac.field_J ? 1 : 0;
        if (((ik) this).field_h != ((ik) this).field_e.field_d[-1 + ((ik) this).field_d]) {
            var1 = ((ik) this).field_h;
            ((ik) this).field_h = var1.field_e;
            ((ik) this).field_k = var1;
            return (Object) (Object) var1;
        }
        do {
            if (((ik) this).field_d >= ((ik) this).field_e.field_c) {
                return null;
            }
            nm[] fieldTemp$0 = ((ik) this).field_e.field_d;
            int fieldTemp$1 = ((ik) this).field_d;
            ((ik) this).field_d = ((ik) this).field_d + 1;
            var1 = fieldTemp$0[fieldTemp$1].field_e;
        } while (((ik) this).field_e.field_d[((ik) this).field_d + -1] == var1);
        ((ik) this).field_h = var1.field_e;
        ((ik) this).field_k = var1;
        return (Object) (Object) var1;
    }

    final static boolean a(boolean param0) {
        return null != eq.field_g && q.field_i == rf.field_b;
    }

    final static int a(int param0, gb param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var3 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = cn.field_d;
              if (param1.field_c != 2) {
                if (param1.field_c != 4) {
                  if (~param1.field_k != ~oc.field_p) {
                    var2_int = r.field_C[param1.field_c];
                    break L1;
                  } else {
                    var2_int = ki.field_i[param1.field_c];
                    break L1;
                  }
                } else {
                  var2_int = r.field_C[param1.field_c];
                  break L1;
                }
              } else {
                if (!param1.field_e) {
                  L2: {
                    if (param1.field_f != 0) {
                      break L2;
                    } else {
                      if (param1.field_d == 0) {
                        var2_int = ki.field_i[param1.field_c];
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  var2_int = r.field_C[param1.field_c];
                  break L1;
                } else {
                  var2_int = cn.field_d;
                  break L1;
                }
              }
            }
            stackOut_15_0 = var2_int;
            stackIn_16_0 = stackOut_15_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var2;
            stackOut_17_1 = new StringBuilder().append("ik.F(").append(-31126).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L3;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L3;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 41);
        }
        return stackIn_16_0;
    }

    public final void remove() {
        if (((ik) this).field_k == null) {
            throw new IllegalStateException();
        }
        ((ik) this).field_k.b((byte) 111);
        ((ik) this).field_k = null;
    }

    final static boolean a() {
        bg var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        bg var5 = null;
        int stackIn_4_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_13_0 = 0;
        var4 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            var5 = (bg) (Object) mf.field_i.d(-78);
            var1 = var5;
            if (var1 == null) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              var2 = 0;
              var3 = -45;
              L1: while (true) {
                if (var2 >= var1.field_s) {
                  stackOut_16_0 = 1;
                  stackIn_17_0 = stackOut_16_0;
                  break L0;
                } else {
                  L2: {
                    if (var5.field_j[var2] == null) {
                      break L2;
                    } else {
                      if (0 != var5.field_j[var2].field_f) {
                        break L2;
                      } else {
                        stackOut_9_0 = 0;
                        stackIn_10_0 = stackOut_9_0;
                        return stackIn_10_0 != 0;
                      }
                    }
                  }
                  L3: {
                    if (var5.field_l[var2] == null) {
                      break L3;
                    } else {
                      if (var5.field_l[var2].field_f != 0) {
                        break L3;
                      } else {
                        stackOut_13_0 = 0;
                        stackIn_14_0 = stackOut_13_0;
                        return stackIn_14_0 != 0;
                      }
                    }
                  }
                  var2++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var1_ref, "ik.C(" + 104 + 41);
        }
        return stackIn_17_0 != 0;
    }

    public static void c() {
        field_g = null;
        field_f = null;
        field_i = null;
        field_b = null;
        field_c = null;
        field_a = null;
    }

    final static boolean a(byte param0, char param1) {
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          if (param0 == -9) {
            break L0;
          } else {
            boolean discarded$2 = ik.a((byte) -124, 'V');
            break L0;
          }
        }
        L1: {
          L2: {
            if (param1 == 160) {
              break L2;
            } else {
              if (param1 == 32) {
                break L2;
              } else {
                if (param1 == 95) {
                  break L2;
                } else {
                  if (param1 != 45) {
                    stackOut_8_0 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
            }
          }
          stackOut_7_0 = 1;
          stackIn_9_0 = stackOut_7_0;
          break L1;
        }
        return stackIn_9_0 != 0;
    }

    ik(ji param0) {
        ((ik) this).field_k = null;
        try {
            ((ik) this).field_e = param0;
            int discarded$0 = -101;
            this.b();
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "ik.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = false;
    }
}
