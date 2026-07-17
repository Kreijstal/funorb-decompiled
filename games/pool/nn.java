/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nn {
    static boolean field_d;
    static oo[] field_b;
    static int field_c;
    static dd[][] field_a;
    static int[][] field_e;

    final static void a(boolean param0, int param1, int param2) {
        uf var3 = null;
        of.a(param1, (byte) 0, param2);
        jc.field_e.a(tp.field_h, -59);
        if (param0) {
          L0: {
            if (null != tf.field_a.field_a) {
              tf.field_a.field_j[vn.field_e] = (nc) (Object) tf.field_a.field_a[vn.field_e].a(96, 1031, -1024, -1024, -10240, tp.field_h);
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            tf.field_a.a(tp.field_h, bf.field_i, vn.field_e, -3637);
            var3 = ba.field_ub;
            if (var3 == null) {
              var3 = am.field_e;
              break L1;
            } else {
              break L1;
            }
          }
          if (var3 != null) {
            if (vn.field_e >= var3.field_I.field_l.length) {
              return;
            } else {
              var3.field_I.field_l[vn.field_e].field_p = true;
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static void a(eg param0) {
        int[] var3 = null;
        try {
            var3 = param0.field_q;
            int[] var2 = var3;
            param0.field_q = param0.field_g;
            param0.field_g = var3;
            int discarded$0 = 38;
            jf.a(param0);
            param0.a();
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "nn.A(" + (param0 != null ? "{...}" : "null") + 44 + 1 + 41);
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        if (param0 != 16006) {
            return;
        }
        field_e = null;
    }

    final static void a(long param0, byte param1, java.applet.Applet param2, String param3, String param4) {
        try {
            Throwable var6 = null;
            RuntimeException var6_ref = null;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            String stackIn_11_2 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            String stackIn_14_2 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            String stackIn_17_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            RuntimeException stackOut_10_0 = null;
            StringBuilder stackOut_10_1 = null;
            String stackOut_10_2 = null;
            RuntimeException stackOut_9_0 = null;
            StringBuilder stackOut_9_1 = null;
            String stackOut_9_2 = null;
            RuntimeException stackOut_11_0 = null;
            StringBuilder stackOut_11_1 = null;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            String stackOut_13_2 = null;
            RuntimeException stackOut_12_0 = null;
            StringBuilder stackOut_12_1 = null;
            String stackOut_12_2 = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            String stackOut_16_2 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            String stackOut_15_2 = null;
            try {
              try {
                L0: {
                  L1: {
                    var8 = param2.getParameter("cookiehost");
                    var7 = var8;
                    var7 = var8;
                    var9 = param4 + "=" + param3 + "; version=1; path=/; domain=" + var8;
                    var7 = var9;
                    var7 = var9;
                    if (param0 < 0L) {
                      var7 = var9 + "; Discard;";
                      break L1;
                    } else {
                      int discarded$2 = 0;
                      var7 = var9 + "; Expires=" + hn.a(rl.a((byte) -120) - -(param0 * 1000L)) + "; Max-Age=" + param0;
                      break L1;
                    }
                  }
                  int discarded$3 = 35;
                  mo.a("document.cookie=\"" + var7 + "\"", param2);
                  break L0;
                }
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var6 = decompiledCaughtException;
                return;
              }
              return;
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L2: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_8_0 = (RuntimeException) var6_ref;
                stackOut_8_1 = new StringBuilder().append("nn.C(").append(param0).append(44).append(-120).append(44);
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
              L3: {
                stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
                stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(44);
                stackIn_13_0 = stackOut_11_0;
                stackIn_13_1 = stackOut_11_1;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                if (param3 == null) {
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
              L4: {
                stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
                stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(44);
                stackIn_16_0 = stackOut_14_0;
                stackIn_16_1 = stackOut_14_1;
                stackIn_15_0 = stackOut_14_0;
                stackIn_15_1 = stackOut_14_1;
                if (param4 == null) {
                  stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                  stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
                  stackOut_16_2 = "null";
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  stackIn_17_2 = stackOut_16_2;
                  break L4;
                } else {
                  stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
                  stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
                  stackOut_15_2 = "{...}";
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_17_1 = stackOut_15_1;
                  stackIn_17_2 = stackOut_15_2;
                  break L4;
                }
              }
              throw wm.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static id b() {
        try {
            Throwable var1 = null;
            id stackIn_2_0 = null;
            Throwable decompiledCaughtException = null;
            id stackOut_1_0 = null;
            try {
              L0: {
                stackOut_1_0 = (id) Class.forName("po").newInstance();
                stackIn_2_0 = stackOut_1_0;
                break L0;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = decompiledCaughtException;
              return null;
            }
            return stackIn_2_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = false;
        field_e = new int[64][3];
        field_a = new dd[][]{null, null, null, null};
    }
}
