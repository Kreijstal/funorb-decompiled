/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wpa extends ge {
    static String field_K;
    static String field_J;

    final static void a(ha param0, int param1) {
        try {
            kn.field_p = param0.a(kv.field_a, rc.field_b, true);
            eda.field_f = param0.a(ds.field_n, ff.field_j, true);
            qr.field_v = param0.a(wb.field_a, ps.field_O, true);
            qf.field_j = param0.a(qp.field_r, gga.field_O, true);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "wpa.WB(" + (param0 != null ? "{...}" : "null") + 44 + -90 + 41);
        }
    }

    final boolean z(int param0) {
        if (param0 != 0) {
            boolean discarded$0 = ((wpa) this).A(101);
            return false;
        }
        return false;
    }

    final static iu[] a(byte param0, iu param1) {
        iu[] var2 = null;
        RuntimeException var2_ref = null;
        iu[] var3 = null;
        Object stackIn_2_0 = null;
        iu[] stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        iu[] stackOut_3_0 = null;
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
            if (param0 < -57) {
              var3 = new iu[9];
              var2 = var3;
              var3[4] = param1;
              stackOut_3_0 = (iu[]) var2;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (iu[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2_ref;
            stackOut_5_1 = new StringBuilder().append("wpa.BC(").append(param0).append(44);
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
          throw tba.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
        return stackIn_4_0;
    }

    final boolean C(int param0) {
        if (param0 != 128) {
            return false;
        }
        return true;
    }

    final int t(int param0) {
        if (param0 != 8) {
            field_J = null;
            return 7;
        }
        return 7;
    }

    final fsa a(boolean param0, int param1, la param2) {
        RuntimeException var4 = null;
        ska var5 = null;
        roa var6 = null;
        int var7_int = 0;
        mfa var7 = null;
        boa var8 = null;
        fsa var9 = null;
        fsa stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        fsa stackOut_5_0 = null;
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
            L1: {
              var9 = new fsa(param2, param0);
              var9.b((byte) -11, ((wpa) this).field_k, ((wpa) this).field_l);
              var9.h(param1, 0);
              var9.a((byte) 83, (nv) (Object) new eq(param2, param0));
              var5 = new ska(param2, param0);
              var6 = ci.a(0, -1);
              var6.a(91, true);
              if (((wpa) this).s((byte) 73)) {
                var7_int = var6.a(true);
                if (var7_int > 0) {
                  var6.b(param2.q(122).a(var7_int, 0), false);
                  break L1;
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            }
            var5.a(var6, (byte) 66);
            ((wpa) this).a((byte) 43, (mra) (Object) var5, param2);
            var9.a((byte) 83, (nv) (Object) var5);
            var7 = rm.field_a;
            var8 = (boa) (Object) var7.a(7, 86);
            var8.b(127, 12);
            var9.a((gr) (Object) var5, (byte) 124, (dg) (Object) var8);
            stackOut_5_0 = (fsa) var9;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var4;
            stackOut_7_1 = new StringBuilder().append("wpa.AC(").append(param0).append(44).append(param1).append(44);
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
          throw tba.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
        return stackIn_6_0;
    }

    public static void D(int param0) {
        field_K = null;
        field_J = null;
    }

    final boolean n(byte param0) {
        if (param0 != -122) {
            return true;
        }
        return true;
    }

    final boolean A(int param0) {
        if (param0 != -1) {
            return true;
        }
        return true;
    }

    final static char a(byte param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        if (param0 == 11) {
          var2 = 255 & param1;
          if (var2 != 0) {
            if (var2 >= 128) {
              if (160 <= var2) {
                return (char)var2;
              } else {
                L0: {
                  var3 = gha.field_a[var2 - 128];
                  if (var3 == 0) {
                    var3 = 63;
                    break L0;
                  } else {
                    break L0;
                  }
                }
                var2 = var3;
                return (char)var2;
              }
            } else {
              return (char)var2;
            }
          } else {
            throw new IllegalArgumentException("" + Integer.toString(var2, 16));
          }
        } else {
          return '';
        }
    }

    final boolean B(int param0) {
        if (param0 != -23309) {
            field_K = null;
            return true;
        }
        return true;
    }

    final boolean v(int param0) {
        if (param0 != 555277520) {
            return true;
        }
        return false;
    }

    final void a(boolean param0, kh param1) {
        try {
            super.a(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "wpa.V(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    wpa(la param0, int param1) {
        super(param0, param1);
    }

    wpa(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
    }

    final void q(byte param0) {
        super.q(param0);
        ((wpa) this).b(-79, 2097152, 2097152);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_K = "Failed!";
        field_J = "Room complete +<%0>, Speed bonus +<%1>";
    }
}
