/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class vn extends oh {
    int field_z;
    fs field_k;
    int field_x;
    int field_n;
    fs field_j;
    fs[] field_q;
    int field_u;
    int[] field_m;
    static int[] field_r;
    static String field_p;
    int[] field_v;
    ln field_o;
    sd field_h;
    fs field_l;
    static String field_A;
    static String field_i;
    static rn field_w;
    static a field_s;
    static qr field_t;
    static qr field_y;

    final static void d(int param0) {
        RuntimeException runtimeException = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            ke.a(-6187, 640, 480, 372, 0);
            var1_int = -qd.field_a + 480;
            var2 = 0;
            L1: while (true) {
              L2: {
                if (hj.field_l.length <= var2) {
                  break L2;
                } else {
                  if (null == hj.field_l[var2]) {
                    break L2;
                  } else {
                    hj.field_l[var2].a(-208410008, var1_int);
                    var1_int -= 18;
                    var2++;
                    continue L1;
                  }
                }
              }
              ln.f((byte) -101);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw r.a((Throwable) (Object) runtimeException, "vn.A(" + -14145 + ')');
        }
    }

    final static int e(int param0) {
        if (param0 != -13299) {
            vn.a((byte) 41);
        }
        return new Date().getYear() + 1900;
    }

    final static boolean a(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int stackIn_4_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_9_0 = 0;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (eh.field_L == null) {
                stackOut_3_0 = 0;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = eh.field_L.length;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            var1_int = stackIn_4_0;
            if (null != oi.field_i) {
              var2 = 0;
              L2: while (true) {
                if (oi.field_i.length <= var2) {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  break L0;
                } else {
                  var1_int = var1_int + oi.field_i[var2].length;
                  var2++;
                  continue L2;
                }
              }
            } else {
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var1, "vn.F(" + 0 + ')');
        }
        return stackIn_10_0 != 0;
    }

    final void c(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        L0: {
          var5 = ShatteredPlansClient.field_F ? 1 : 0;
          ((vn) this).field_v = (int[]) ((vn) this).field_m.clone();
          if (param0) {
            break L0;
          } else {
            ((vn) this).c(false);
            break L0;
          }
        }
        ((vn) this).field_u = 0;
        var2 = 0;
        L1: while (true) {
          if (((vn) this).field_m.length <= var2) {
            if (((vn) this).field_q.length != 1) {
              L2: {
                ((vn) this).field_l = ((vn) this).field_q[vc.a((byte) -39, -1 + ((vn) this).field_q.length)];
                if (((vn) this).field_k != ((vn) this).field_l) {
                  break L2;
                } else {
                  ((vn) this).field_l = ((vn) this).field_q[-1 + ((vn) this).field_q.length];
                  break L2;
                }
              }
              L3: {
                var2 = -1 + ((vn) this).field_m.length;
                if (null != ((vn) this).field_k) {
                  stackOut_14_0 = ((vn) this).field_k.field_x;
                  stackIn_15_0 = stackOut_14_0;
                  break L3;
                } else {
                  stackOut_13_0 = var2;
                  stackIn_15_0 = stackOut_13_0;
                  break L3;
                }
              }
              L4: {
                var3 = stackIn_15_0;
                if (((vn) this).field_l == null) {
                  stackOut_17_0 = var2;
                  stackIn_18_0 = stackOut_17_0;
                  break L4;
                } else {
                  stackOut_16_0 = ((vn) this).field_l.field_x;
                  stackIn_18_0 = stackOut_16_0;
                  break L4;
                }
              }
              var4 = stackIn_18_0;
              ((vn) this).field_v[var3] = ((vn) this).field_v[var3] - ((vn) this).field_n;
              ((vn) this).field_u = ((vn) this).field_u - ((vn) this).field_n;
              ((vn) this).field_v[var4] = ((vn) this).field_v[var4] - 1;
              ((vn) this).field_u = ((vn) this).field_u - 1;
              return;
            } else {
              ((vn) this).field_u = 0;
              var2 = 0;
              L5: while (true) {
                if (((vn) this).field_v.length <= var2) {
                  return;
                } else {
                  ((vn) this).field_v[var2] = 0;
                  var2++;
                  continue L5;
                }
              }
            }
          } else {
            ((vn) this).field_u = ((vn) this).field_u + ((vn) this).field_m[var2];
            var2++;
            continue L1;
          }
        }
    }

    public static void a(byte param0) {
        field_p = null;
        field_s = null;
        field_y = null;
        field_r = null;
        field_t = null;
        field_w = null;
        field_A = null;
        field_i = null;
        if (param0 != 68) {
            int discarded$0 = vn.e(52);
        }
    }

    vn(eg param0) {
        int var2_int = 0;
        try {
            ((vn) this).field_z = 0;
            ((vn) this).field_m = param0.field_j;
            ((vn) this).field_j = param0.field_w;
            ((vn) this).field_n = param0.field_l;
            ((vn) this).field_q = param0.field_h;
            ((vn) this).field_k = param0.field_i;
            ((vn) this).field_o = param0.field_p;
            ((vn) this).field_h = param0.field_m;
            ((vn) this).field_x = param0.field_n;
            for (var2_int = 0; var2_int < ((vn) this).field_m.length; var2_int++) {
                if (((vn) this).field_z < ((vn) this).field_m[var2_int]) {
                    ((vn) this).field_z = ((vn) this).field_m[var2_int];
                }
            }
            ((vn) this).c(true);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "vn.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static ro a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String var4 = null;
        ro var5 = null;
        ro stackIn_4_0 = null;
        ro stackIn_8_0 = null;
        ro stackIn_11_0 = null;
        ro stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        ro stackOut_7_0 = null;
        ro stackOut_12_0 = null;
        ro stackOut_10_0 = null;
        ro stackOut_3_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == null) {
                break L1;
              } else {
                if (0 != param1.length()) {
                  var2_int = param1.indexOf('@');
                  if (-1 == var2_int) {
                    stackOut_7_0 = fg.field_a;
                    stackIn_8_0 = stackOut_7_0;
                    return stackIn_8_0;
                  } else {
                    var3 = param1.substring(0, var2_int);
                    var4 = param1.substring(var2_int - -1);
                    var5 = uc.a(-77, var3);
                    if (var5 == null) {
                      stackOut_12_0 = fg.a(var4, (byte) 111);
                      stackIn_13_0 = stackOut_12_0;
                      break L0;
                    } else {
                      stackOut_10_0 = (ro) var5;
                      stackIn_11_0 = stackOut_10_0;
                      return stackIn_11_0;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            stackOut_3_0 = hd.field_r;
            stackIn_4_0 = stackOut_3_0;
            return stackIn_4_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var2;
            stackOut_14_1 = new StringBuilder().append("vn.E(").append(64).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L2;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L2;
            }
          }
          throw r.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
        return stackIn_13_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        field_r = new int[6];
        field_p = "<%0> has left the lobby.";
        int[] var0 = new int[]{150, 60, 60, 60, 60, 60};
        int var1 = 560;
        for (var2 = 0; 6 > var2; var2++) {
            var1 = var1 - var0[var2];
        }
        var2 = 560;
        for (var3 = 5; var3 > 0; var3--) {
            var4 = var1 / (2 + var3);
            var1 = var1 - var4;
            var2 = var2 - var4;
            field_r[var3] = var2 - (var0[var3] >> 1);
            var2 = var2 - var0[var3];
        }
        field_r[0] = var1 >> 1;
        field_i = "(hiding this text)";
        field_A = "Your rating is <%0>";
    }
}
