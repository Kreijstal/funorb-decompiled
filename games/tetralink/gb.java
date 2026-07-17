/*
 * Decompiled by CFR-JS 0.4.0.
 */
class gb extends mc {
    static String field_q;
    gb field_o;
    long field_n;
    static int[] field_r;
    static String field_p;
    gb field_s;

    final long c(int param0) {
        int var2 = 17 / ((param0 - -27) / 46);
        return ((gb) this).field_n;
    }

    final void a(long param0, int param1) {
        if (null != ((gb) this).field_s) {
            throw new RuntimeException();
        }
        if (param1 != 17260) {
            gb.a((byte) -92, true);
        }
        ((gb) this).field_n = param0;
    }

    final boolean a(int param0) {
        if (!(null != ((gb) this).field_s)) {
            return false;
        }
        if (param0 != 2) {
            field_r = null;
            return true;
        }
        return true;
    }

    final static kh a(boolean param0, int[] param1, kh param2) {
        kh var3 = null;
        RuntimeException var3_ref = null;
        kh stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        kh stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            var3 = new kh(0, 0, 0);
            var3.field_k = param2.field_k;
            var3.field_d = param2.field_d;
            var3.field_f = param2.field_f;
            var3.field_b = param2.field_b;
            var3.field_j = param2.field_j;
            var3.field_h = param2.field_h;
            var3.field_p = param1;
            var3.field_o = param2.field_o;
            stackOut_2_0 = (kh) var3;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3_ref;
            stackOut_4_1 = new StringBuilder().append("gb.TA(").append(0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          L2: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
        return stackIn_3_0;
    }

    final static void a(byte param0, boolean param1) {
        int var2 = 0;
        int var3 = 0;
        Object var4 = null;
        L0: {
          var3 = TetraLink.field_J;
          if (0 >= mb.field_C) {
            if (!ug.o(-115)) {
              var2 = 1;
              break L0;
            } else {
              var2 = 0;
              break L0;
            }
          } else {
            L1: {
              if (hn.field_M != null) {
                hd.field_u = hn.field_M.b(false);
                pf.a(123, 2);
                break L1;
              } else {
                hd.field_u = bm.a(480, 0, 0, 640, 0, nd.field_Pb);
                break L1;
              }
            }
            if (hd.field_u == null) {
              var2 = 3;
              break L0;
            } else {
              da.a((byte) -76, (java.awt.Canvas) (Object) hd.field_u);
              var2 = 2;
              break L0;
            }
          }
        }
        L2: {
          if (null != hn.field_M) {
            break L2;
          } else {
            if (!rm.field_f) {
              break L2;
            } else {
              om.a(param1, 10, var2);
              break L2;
            }
          }
        }
        L3: {
          if (param0 <= -68) {
            break L3;
          } else {
            var4 = null;
            kh discarded$1 = gb.a(false, (int[]) null, (kh) null);
            break L3;
          }
        }
    }

    final void e(int param0) {
        if (!(null != ((gb) this).field_s)) {
            return;
        }
        ((gb) this).field_s.field_o = ((gb) this).field_o;
        ((gb) this).field_o.field_s = ((gb) this).field_s;
        ((gb) this).field_s = null;
        if (param0 != 0) {
            return;
        }
        ((gb) this).field_o = null;
    }

    final static dk a(byte param0, java.applet.Applet param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        dk[] var3_ref_dk__ = null;
        int var3 = 0;
        int var4 = 0;
        dk var5 = null;
        int var6 = 0;
        dk stackIn_4_0 = null;
        dk stackIn_10_0 = null;
        dk stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        dk stackOut_3_0 = null;
        dk stackOut_12_0 = null;
        dk stackOut_9_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var6 = TetraLink.field_J;
        try {
          L0: {
            var2 = TetraLink.a("jagex-last-login-method", -28536, param1);
            if (var2 == null) {
              stackOut_3_0 = vc.field_b;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              int discarded$2 = 7;
              var3_ref_dk__ = lf.a();
              var4 = 0;
              L1: while (true) {
                if (var4 >= var3_ref_dk__.length) {
                  var3 = -31;
                  stackOut_12_0 = vc.field_b;
                  stackIn_13_0 = stackOut_12_0;
                  break L0;
                } else {
                  var5 = var3_ref_dk__[var4];
                  if (var5.a(16412, var2)) {
                    stackOut_9_0 = (dk) var5;
                    stackIn_10_0 = stackOut_9_0;
                    return stackIn_10_0;
                  } else {
                    var4++;
                    continue L1;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var2_ref;
            stackOut_14_1 = new StringBuilder().append("gb.UA(").append(91).append(44);
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
          throw oi.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
        }
        return stackIn_13_0;
    }

    public static void d(int param0) {
        field_q = null;
        field_p = null;
        field_r = null;
    }

    protected gb() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "You do not have a suitable number of players for the current options.";
        field_p = "If you do nothing the game will revert to normal view in <%0> seconds.";
    }
}
