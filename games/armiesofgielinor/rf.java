/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rf {
    private kl field_f;
    static String field_e;
    static je field_d;
    private ri field_b;
    private kl field_c;
    static String field_a;

    final static boolean c() {
        return !se.field_g.a((byte) 125);
    }

    public static void a() {
        field_e = null;
        field_d = null;
        field_a = null;
    }

    final static boolean a(int param0) {
        return nw.g(81) || df.field_M <= 0;
    }

    final static void b() {
        kw.field_M[46] = 72;
        kw.field_M[61] = 27;
        kw.field_M[192] = 28;
        kw.field_M[222] = 58;
        kw.field_M[520] = 59;
        kw.field_M[44] = 71;
        kw.field_M[93] = 43;
        kw.field_M[45] = 26;
        kw.field_M[92] = 74;
        kw.field_M[59] = 57;
        kw.field_M[91] = 42;
        kw.field_M[47] = 73;
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            String stackOut_7_2 = null;
            try {
              try {
                if (param0 == 32767) {
                  var2 = new java.net.URL(param1.getCodeBase(), "subscribe.ws");
                  param1.getAppletContext().showDocument(ck.a(-3780, var2, param1), "_top");
                  return;
                } else {
                  return;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2_ref = (Exception) (Object) decompiledCaughtException;
                var2_ref.printStackTrace();
                return;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L0: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) var2_ref2;
                stackOut_6_1 = new StringBuilder().append("rf.B(").append(param0).append(',');
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param1 == null) {
                  stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                  stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
                  stackOut_8_2 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  break L0;
                } else {
                  stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
                  stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
                  stackOut_7_2 = "{...}";
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  break L0;
                }
              }
              throw ig.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, au param1) {
        au var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        Object var4 = null;
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
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              param1.d(76);
              var2 = (au) (Object) qc.field_g.e((byte) 92);
              if (param0 <= -66) {
                break L1;
              } else {
                var4 = null;
                rf.a(-6, (java.applet.Applet) null);
                break L1;
              }
            }
            L2: while (true) {
              L3: {
                if (var2 == null) {
                  break L3;
                } else {
                  if (!var2.a((byte) -76, param1)) {
                    break L3;
                  } else {
                    var2 = (au) (Object) qc.field_g.a((byte) 123);
                    continue L2;
                  }
                }
              }
              if (var2 != null) {
                fj.a((byte) -123, (tc) (Object) param1, (tc) (Object) var2);
                break L0;
              } else {
                qc.field_g.a((byte) -119, (tc) (Object) param1);
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var2_ref;
            stackOut_10_1 = new StringBuilder().append("rf.F(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
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
          throw ig.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
    }

    final static void b(int param0) {
        fg var1_ref = null;
        Object var1 = null;
        if (param0 != -18862) {
            field_a = null;
            var1_ref = (fg) (Object) md.field_y.c((byte) -125);
            if (!(var1_ref != null)) {
                throw new IllegalStateException();
            }
            qn.a(var1_ref.field_t, var1_ref.field_u, var1_ref.field_q);
            qn.f(var1_ref.field_p, var1_ref.field_r, var1_ref.field_s, var1_ref.field_o);
            var1_ref.field_t = null;
            vb.field_q.a((byte) -119, (tc) (Object) var1_ref);
            return;
        }
        var1_ref = (fg) (Object) md.field_y.c((byte) -125);
        if (!(var1_ref != null)) {
            throw new IllegalStateException();
        }
        qn.a(var1_ref.field_t, var1_ref.field_u, var1_ref.field_q);
        qn.f(var1_ref.field_p, var1_ref.field_r, var1_ref.field_s, var1_ref.field_o);
        var1_ref.field_t = null;
        vb.field_q.a((byte) -119, (tc) (Object) var1_ref);
    }

    final ar a(int param0, int param1) {
        ar var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        ar var6 = null;
        var4 = 112 % ((-78 - param1) / 40);
        var3 = (ar) ((rf) this).field_b.a((long)param0, (byte) 127);
        if (var3 == null) {
          L0: {
            if (32768 > param0) {
              var5 = ((rf) this).field_f.a((byte) 118, param0, 1);
              break L0;
            } else {
              var5 = ((rf) this).field_c.a((byte) 99, 32767 & param0, 1);
              break L0;
            }
          }
          var6 = new ar();
          if (var5 == null) {
            if (32768 <= param0) {
              var6.a(true);
              ((rf) this).field_b.a((Object) (Object) var6, 100, (long)param0);
              return var6;
            } else {
              ((rf) this).field_b.a((Object) (Object) var6, 100, (long)param0);
              return var6;
            }
          } else {
            var6.a(new vh(var5), (byte) 91);
            if (32768 > param0) {
              ((rf) this).field_b.a((Object) (Object) var6, 100, (long)param0);
              return var6;
            } else {
              var6.a(true);
              ((rf) this).field_b.a((Object) (Object) var6, 100, (long)param0);
              return var6;
            }
          }
        } else {
          return var3;
        }
    }

    rf(int param0, kl param1, kl param2, gj param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        ((rf) this).field_b = new ri(64);
        try {
          L0: {
            L1: {
              ((rf) this).field_c = param2;
              ((rf) this).field_f = param1;
              if (null == ((rf) this).field_f) {
                break L1;
              } else {
                int discarded$4 = ((rf) this).field_f.d(1, -2);
                break L1;
              }
            }
            if (((rf) this).field_c == null) {
              break L0;
            } else {
              int discarded$5 = ((rf) this).field_c.d(1, -2);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var5;
            stackOut_6_1 = new StringBuilder().append("rf.<init>(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param3 == null) {
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
          throw ig.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "As a hero of Gielinor, you must choose which path to follow: align with your chosen god, or remain neutral in your devotions.";
        field_a = "Loading fonts";
    }
}
