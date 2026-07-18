/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ji implements Iterable {
    static boolean field_f;
    private nm field_h;
    static Random field_e;
    static String field_g;
    nm[] field_d;
    int field_c;
    static mf field_a;
    static mh field_b;

    public static void a() {
        field_a = null;
        field_g = null;
        field_b = null;
        field_e = null;
    }

    final nm a(long param0, int param1) {
        nm var4 = null;
        nm var5 = null;
        int var6 = 0;
        var6 = BrickABrac.field_J ? 1 : 0;
        var4 = ((ji) this).field_d[(int)((long)(((ji) this).field_c - 1) & param0)];
        ((ji) this).field_h = var4.field_e;
        if (param1 <= 85) {
          ((ji) this).field_c = -72;
          L0: while (true) {
            if (var4 == ((ji) this).field_h) {
              ((ji) this).field_h = null;
              return null;
            } else {
              if (param0 != ((ji) this).field_h.field_g) {
                ((ji) this).field_h = ((ji) this).field_h.field_e;
                continue L0;
              } else {
                var5 = ((ji) this).field_h;
                ((ji) this).field_h = ((ji) this).field_h.field_e;
                return var5;
              }
            }
          }
        } else {
          L1: while (true) {
            if (var4 == ((ji) this).field_h) {
              ((ji) this).field_h = null;
              return null;
            } else {
              if (param0 != ((ji) this).field_h.field_g) {
                ((ji) this).field_h = ((ji) this).field_h.field_e;
                continue L1;
              } else {
                var5 = ((ji) this).field_h;
                ((ji) this).field_h = ((ji) this).field_h.field_e;
                return var5;
              }
            }
          }
        }
    }

    final void a(byte param0, long param1, nm param2) {
        nm var5 = null;
        try {
            if (null != param2.field_b) {
                param2.b((byte) 111);
            }
            var5 = ((ji) this).field_d[(int)(param1 & (long)(-1 + ((ji) this).field_c))];
            param2.field_b = var5.field_b;
            param2.field_e = var5;
            param2.field_b.field_e = param2;
            param2.field_e.field_b = param2;
            int var6 = -64 % ((param0 - -60) / 52);
            param2.field_g = param1;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "ji.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public final Iterator iterator() {
        return (Iterator) (Object) new ik((ji) this);
    }

    final static void a(int param0, boolean param1, vm param2) {
        Object var6 = null;
        Object var6_ref = null;
        RuntimeException var6_ref2 = null;
        Throwable var7 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            var6_ref = (Object) (Object) eo.field_f;
            synchronized (var6_ref) {
              L1: {
                if (fo.field_a != param2) {
                  L2: {
                    fo.field_a = param2;
                    if (fo.field_a == null) {
                      break L2;
                    } else {
                      m.field_f.a(1, fo.field_a, 1, true, -1, true);
                      break L2;
                    }
                  }
                  break L1;
                } else {
                  return;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var6_ref2;
            stackOut_11_1 = new StringBuilder().append("ji.B(").append(25459).append(',').append(true).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + 1 + ',' + 1 + ',' + true + ')');
        }
    }

    ji(int param0) {
        int var2 = 0;
        nm var3 = null;
        ((ji) this).field_d = new nm[param0];
        ((ji) this).field_c = param0;
        var2 = 0;
        L0: while (true) {
          if (var2 < param0) {
            nm dupTemp$2 = new nm();
            var3 = dupTemp$2;
            ((ji) this).field_d[var2] = dupTemp$2;
            var3.field_b = var3;
            var3.field_e = var3;
            var2++;
            continue L0;
          } else {
            return;
          }
        }
    }

    final static lo a(String param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String[] var3 = null;
        String[] var4 = null;
        int var5 = 0;
        String var6 = null;
        lo var7 = null;
        int var8 = 0;
        lo stackIn_3_0 = null;
        lo stackIn_7_0 = null;
        lo stackIn_10_0 = null;
        lo stackIn_15_0 = null;
        lo stackIn_18_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        lo stackOut_6_0 = null;
        lo stackOut_17_0 = null;
        lo stackOut_14_0 = null;
        lo stackOut_9_0 = null;
        lo stackOut_2_0 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var8 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length();
            if (var2_int != 0) {
              if (255 < var2_int) {
                stackOut_6_0 = pi.field_r;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              } else {
                var3 = qb.a((byte) -11, param0, '.');
                if (2 <= var3.length) {
                  var4 = var3;
                  var5 = 0;
                  L1: while (true) {
                    if (var4.length <= var5) {
                      stackOut_17_0 = mf.a((byte) -95, var3[var3.length - 1]);
                      stackIn_18_0 = stackOut_17_0;
                      break L0;
                    } else {
                      var6 = var4[var5];
                      var7 = kb.a(95, var6);
                      if (var7 == null) {
                        var5++;
                        continue L1;
                      } else {
                        stackOut_14_0 = (lo) var7;
                        stackIn_15_0 = stackOut_14_0;
                        return stackIn_15_0;
                      }
                    }
                  }
                } else {
                  stackOut_9_0 = la.field_a;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                }
              }
            } else {
              stackOut_2_0 = la.field_a;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var2;
            stackOut_19_1 = new StringBuilder().append("ji.A(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L2;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L2;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ',' + 0 + ')');
        }
        return stackIn_18_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Friends";
        field_e = new Random();
    }
}
