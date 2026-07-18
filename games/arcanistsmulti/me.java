/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class me extends df implements vb {
    static vn field_O;
    private String field_J;
    static String field_Q;
    private ed field_G;
    static String field_R;
    static String field_N;
    static String field_E;
    static boolean field_C;
    private dj field_D;
    private int field_K;
    static String[] field_L;
    static String field_P;
    static int[] field_H;
    private int[] field_S;
    private ag[] field_M;
    static int field_I;

    me(ed param0, dj param1, String param2) {
        super(0, 0, 288, 0, (pf) null);
        int var4_int = 0;
        ((me) this).field_K = 0;
        try {
            ((me) this).field_D = param1;
            ((me) this).field_J = param2;
            ((me) this).field_G = param0;
            var4_int = ((me) this).field_J == null ? 0 : ((me) this).field_D.a(((me) this).field_J, 260, ((me) this).field_D.field_C);
            ((me) this).a(22 - -var4_int, 0, 288, 0, -51);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "me.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(String param0, byte param1, int param2) {
        int var4_int = 0;
        try {
            var4_int = ((me) this).field_K;
            this.a(-84, 1 + var4_int);
            ((me) this).field_M[var4_int] = ((me) this).a(121, param0, (wc) this);
            ((me) this).field_S[var4_int] = param2;
            int var5 = 64 / ((71 - param1) / 35);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "me.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final ag a(int param0, String param1, wc param2) {
        ag var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        Object stackIn_2_0 = null;
        ag stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        ag stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            var4 = new ag(param1, param2);
            var4.field_r = (pf) (Object) new mm();
            if (param0 >= 71) {
              var5 = ((me) this).field_k + -2;
              ((me) this).a(((me) this).field_k + 34, 0, ((me) this).field_v, 0, -57);
              var4.a(30, var5, -14 + ((me) this).field_v, 7, -85);
              ((me) this).c(-104, (qm) (Object) var4);
              stackOut_3_0 = (ag) var4;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (ag) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4_ref;
            stackOut_5_1 = new StringBuilder().append("me.H(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
        return stackIn_4_0;
    }

    final void a(byte param0, int param1, int param2, int param3) {
        super.a((byte) -100, param1, param2, param3);
        if (param0 >= -52) {
            ((me) this).field_S = null;
        }
        int discarded$0 = ((me) this).field_D.a(((me) this).field_J, ((me) this).field_n + param1 + 14, ((me) this).field_j + (param3 + 10), ((me) this).field_v + -28, ((me) this).field_k, 16777215, -1, 0, 0, ((me) this).field_D.field_C);
    }

    private final void a(int param0, int param1) {
        int var6 = 0;
        int var7 = ArcanistsMulti.field_G ? 1 : 0;
        if (!(((me) this).field_K < param1)) {
            return;
        }
        ag[] var8 = new ag[param1];
        ag[] var3 = var8;
        int[] var4 = new int[param1];
        int var5 = 2;
        for (var6 = 0; var6 < ((me) this).field_K; var6++) {
            var8[var6] = ((me) this).field_M[var6];
            var4[var6] = ((me) this).field_S[var6];
        }
        ((me) this).field_M = var3;
        ((me) this).field_K = param1;
        ((me) this).field_S = var4;
    }

    public static void a(byte param0) {
        field_O = null;
        field_L = null;
        field_E = null;
        field_Q = null;
        field_N = null;
        field_H = null;
        field_P = null;
        field_R = null;
    }

    private final static ll a(int param0) {
        ll var1 = new ll(pb.field_g, gn.field_a, hl.field_l[0], be.field_d[0], jg.field_p[0], ho.field_i[0], ln.field_I[0], ph.field_c);
        dk.a(-18229);
        return var1;
    }

    final static eg a(int param0, boolean param1, int param2, boolean param3, int param4, boolean param5) {
        try {
            Object var6 = null;
            Object var7 = null;
            tj var8 = null;
            Object stackIn_2_0 = null;
            eg stackIn_13_0 = null;
            Throwable decompiledCaughtException = null;
            eg stackOut_12_0 = null;
            Object stackOut_1_0 = null;
            try {
              L0: {
                if (param2 == 2097152) {
                  L1: {
                    var6 = null;
                    var7 = null;
                    if (null != ri.field_g.field_q) {
                      bm.field_e = new sd(ri.field_g.field_q, 5200, 0);
                      ri.field_g.field_q = null;
                      var6 = (Object) (Object) new be(255, bm.field_e, new sd(ri.field_g.field_e, 12000, 0), 2097152);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  L2: {
                    if (bm.field_e == null) {
                      break L2;
                    } else {
                      L3: {
                        if (bb.field_b != null) {
                          break L3;
                        } else {
                          bb.field_b = new sd[ri.field_g.field_d.length];
                          break L3;
                        }
                      }
                      L4: {
                        if (bb.field_b[param0] != null) {
                          break L4;
                        } else {
                          bb.field_b[param0] = new sd(ri.field_g.field_d[param0], 12000, 0);
                          ri.field_g.field_d[param0] = null;
                          break L4;
                        }
                      }
                      var7 = (Object) (Object) new be(param0, bm.field_e, bb.field_b[param0], 2097152);
                      break L2;
                    }
                  }
                  var8 = mk.field_O.a((be) var6, false, -113, (be) var7, param0);
                  stackOut_12_0 = new eg((tl) (Object) var8, true, param4);
                  stackIn_13_0 = stackOut_12_0;
                  break L0;
                } else {
                  stackOut_1_0 = null;
                  stackIn_2_0 = stackOut_1_0;
                  return (eg) (Object) stackIn_2_0;
                }
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (Object) (Object) decompiledCaughtException;
              throw new RuntimeException(((IOException) var6).toString());
            }
            return stackIn_13_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static ll a(eg param0, int param1, int param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        ll stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        ll stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (fc.a(-120, param0, param2, param3)) {
              stackOut_3_0 = me.a(0);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (ll) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("me.I(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + 31027 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_4_0;
    }

    public final void a(boolean param0, int param1, int param2, int param3, ag param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var8 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var6_int = 0;
              if (param0) {
                break L1;
              } else {
                field_H = null;
                break L1;
              }
            }
            L2: while (true) {
              L3: {
                if (var6_int >= ((me) this).field_K) {
                  break L3;
                } else {
                  if (((me) this).field_M[var6_int] != param4) {
                    var6_int++;
                    continue L2;
                  } else {
                    var7 = ((me) this).field_S[var6_int];
                    if (var7 != -1) {
                      ee.a(((me) this).field_S[var6_int], (byte) 30);
                      break L3;
                    } else {
                      ((me) this).field_G.h(77);
                      break L3;
                    }
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var6;
            stackOut_10_1 = new StringBuilder().append("me.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param4 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_R = "Hint: to start quickly, choose 'Don't mind' for as many options as you can!";
        field_Q = "Start";
        field_N = "Sorted by rating";
        field_L = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
        field_P = "Towers:";
        field_H = new int[]{25, 8, 26};
        field_O = new vn();
        field_I = 0;
    }
}
