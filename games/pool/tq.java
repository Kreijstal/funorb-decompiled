/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tq extends ma {
    static dd field_n;
    static byte[] field_u;
    static boolean field_p;
    boolean field_s;
    static int field_r;
    static String field_w;
    static String field_v;
    static int field_t;
    static vh field_m;
    static String field_x;
    static so field_o;
    int[] field_l;
    static int field_q;

    final static boolean c(byte param0) {
        if (!(rg.field_p)) {
            return false;
        }
        if (hn.field_b == 0) {
            return true;
        }
        return false;
    }

    final static int[] a(int param0, int param1, boolean param2) {
        int var4 = 0;
        dd var5 = new dd(1024, 64);
        dd var3 = var5;
        for (var4 = 0; var3.field_D.length > var4; var4++) {
            var5.field_D[var4] = fb.field_b[var4];
        }
        var3.e();
        qh.c(0, 0, qh.field_l, qh.field_f, param0, param1);
        sh.field_P.b(15100);
        return var3.field_D;
    }

    public static void a(int param0) {
        field_n = null;
        field_w = null;
        field_m = null;
        field_v = null;
        field_x = null;
        if (param0 != 0) {
            int[] discarded$0 = tq.a(-16, 85, false);
        }
        field_o = null;
        field_u = null;
    }

    final static boolean a(boolean param0, long param1, String param2) {
        eo var4 = null;
        RuntimeException var4_ref = null;
        Object var5 = null;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_9_0 = 0;
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
            L1: {
              if (!param0) {
                break L1;
              } else {
                var5 = null;
                boolean discarded$2 = tq.a(true, -73L, (String) null);
                break L1;
              }
            }
            L2: {
              var4 = gf.a(62, param2);
              if (var4 == null) {
                break L2;
              } else {
                if (null == var4.field_Wb) {
                  break L2;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_5_0 = stackOut_4_0;
                  return stackIn_5_0 != 0;
                }
              }
            }
            L3: {
              L4: {
                if (null == em.field_L) {
                  break L4;
                } else {
                  if (fn.b(param1, 0) == null) {
                    break L4;
                  } else {
                    stackOut_8_0 = 1;
                    stackIn_10_0 = stackOut_8_0;
                    break L3;
                  }
                }
              }
              stackOut_9_0 = 0;
              stackIn_10_0 = stackOut_9_0;
              break L3;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4_ref;
            stackOut_11_1 = new StringBuilder().append("tq.A(").append(param0).append(',').append(param1).append(',');
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
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L5;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
        return stackIn_10_0 != 0;
    }

    final static void a(long param0, byte param1, String param2) {
        CharSequence var5 = null;
        try {
            hn.field_b = 2;
            fm.field_I = param2;
            var5 = (CharSequence) (Object) param2;
            di.field_a = hq.a(117, var5);
            c.field_d = param0;
            jq.a((byte) 11);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "tq.G(" + param0 + ',' + -104 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void d(byte param0) {
        if (null == ne.field_u) {
            return;
        }
        he.a((java.awt.Canvas) (Object) ne.field_u, 0);
        if (param0 > -100) {
            return;
        }
        ne.field_u.a(lg.field_s, -1);
        ne.field_u = null;
        if (!(null == fk.field_gb)) {
            fk.field_gb.d(22472);
        }
        pa.field_K.requestFocus();
    }

    final static int[] a(int param0, int param1, double[] param2) {
        int[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int[] var5 = null;
        int[] stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_3_0 = null;
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
            var5 = new int[param2.length];
            var3 = var5;
            var4 = 0;
            L1: while (true) {
              if (var4 >= var5.length) {
                stackOut_3_0 = (int[]) var5;
                stackIn_4_0 = stackOut_3_0;
                break L0;
              } else {
                var5[var4] = ud.a(param2[var4], 3, 1);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3_ref;
            stackOut_5_1 = new StringBuilder().append("tq.D(").append(3).append(',').append(-20607).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
        return stackIn_4_0;
    }

    tq() {
        ((tq) this).field_s = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = "Snookered";
        field_w = "Suggest muting this player";
        field_p = true;
        field_x = "Rated games are available to members only. To become a member, please visit the 'Account' section of the website.";
    }
}
