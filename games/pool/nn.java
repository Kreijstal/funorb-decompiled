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

    final static void a(eg param0, boolean param1) {
        int[] var2 = null;
        Object var3 = null;
        int[] var4 = null;
        if (!param1) {
          var3 = null;
          nn.a(-76L, (byte) -91, (java.applet.Applet) null, (String) null, (String) null);
          var4 = param0.field_q;
          var2 = var4;
          param0.field_q = param0.field_g;
          param0.field_g = var4;
          jf.a(param0, (byte) 38);
          param0.a();
          return;
        } else {
          var4 = param0.field_q;
          var2 = var4;
          param0.field_q = param0.field_g;
          param0.field_g = var4;
          jf.a(param0, (byte) 38);
          param0.a();
          return;
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
            String var7 = null;
            String var8 = null;
            String var9 = null;
            Throwable decompiledCaughtException = null;
            L0: {
              if (param1 == -120) {
                break L0;
              } else {
                field_e = null;
                break L0;
              }
            }
            try {
              L1: {
                L2: {
                  var8 = param2.getParameter("cookiehost");
                  var7 = var8;
                  var7 = var8;
                  var9 = param4 + "=" + param3 + "; version=1; path=/; domain=" + var8;
                  var7 = var9;
                  var7 = var9;
                  if ((param0 ^ -1L) > -1L) {
                    var7 = var9 + "; Discard;";
                    break L2;
                  } else {
                    var7 = var9 + "; Expires=" + hn.a(rl.a((byte) -120) - -(param0 * 1000L), false) + "; Max-Age=" + param0;
                    break L2;
                  }
                }
                mo.a("document.cookie=\"" + var7 + "\"", param2, (byte) 35);
                break L1;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L3: {
                var6 = decompiledCaughtException;
                break L3;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static id b(int param0) {
        try {
            Throwable var1 = null;
            id stackIn_3_0 = null;
            Throwable decompiledCaughtException = null;
            id stackOut_2_0 = null;
            if (param0 == 96) {
              try {
                L0: {
                  stackOut_2_0 = (id) Class.forName("po").newInstance();
                  stackIn_3_0 = stackOut_2_0;
                  break L0;
                }
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var1 = decompiledCaughtException;
                return null;
              }
              return stackIn_3_0;
            } else {
              return null;
            }
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
