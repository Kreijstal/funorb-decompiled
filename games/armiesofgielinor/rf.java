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

    final static boolean c(int param0) {
        if (param0 > -97) {
            field_a = null;
            return !se.field_g.a((byte) 125) ? true : false;
        }
        return !se.field_g.a((byte) 125) ? true : false;
    }

    public static void a(byte param0) {
        field_e = null;
        field_d = null;
        if (param0 >= -107) {
            return;
        }
        field_a = null;
    }

    final static boolean a(int param0) {
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        if (param0 == 27875) {
          L0: {
            if (nw.g(81)) {
              stackOut_10_0 = 1;
              stackIn_12_0 = stackOut_10_0;
              break L0;
            } else {
              if (-1 > (df.field_M ^ -1)) {
                stackOut_11_0 = 0;
                stackIn_12_0 = stackOut_11_0;
                break L0;
              } else {
                return true;
              }
            }
          }
          return stackIn_12_0 != 0;
        } else {
          field_d = null;
          if (!nw.g(81)) {
            L1: {
              if (-1 > (df.field_M ^ -1)) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                break L1;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
            return stackIn_6_0 != 0;
          } else {
            return true;
          }
        }
    }

    final static void b(byte param0) {
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
        if (param0 < 109) {
            field_d = null;
            kw.field_M[47] = 73;
            return;
        }
        kw.field_M[47] = 73;
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            if (param0 != 32767) {
                return;
            }
            try {
                var2 = new java.net.URL(param1.getCodeBase(), "subscribe.ws");
                param1.getAppletContext().showDocument(ck.a(-3780, var2, param1), "_top");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, au param1) {
        au var2 = null;
        int var3 = 0;
        Object var4 = null;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        param1.d(76);
        var2 = (au) (Object) qc.field_g.e((byte) 92);
        if (param0 > -66) {
          var4 = null;
          rf.a(-6, (java.applet.Applet) null);
          L0: while (true) {
            if (var2 != null) {
              if (var2.a((byte) -76, param1)) {
                var2 = (au) (Object) qc.field_g.a((byte) 123);
                continue L0;
              } else {
                if (var2 != null) {
                  fj.a((byte) -123, (tc) (Object) param1, (tc) (Object) var2);
                  return;
                } else {
                  qc.field_g.a((byte) -119, (tc) (Object) param1);
                  return;
                }
              }
            } else {
              if (var2 != null) {
                fj.a((byte) -123, (tc) (Object) param1, (tc) (Object) var2);
                return;
              } else {
                qc.field_g.a((byte) -119, (tc) (Object) param1);
                return;
              }
            }
          }
        } else {
          L1: while (true) {
            L2: {
              if (var2 == null) {
                break L2;
              } else {
                if (!var2.a((byte) -76, param1)) {
                  break L2;
                } else {
                  var2 = (au) (Object) qc.field_g.a((byte) 123);
                  continue L1;
                }
              }
            }
            if (var2 != null) {
              fj.a((byte) -123, (tc) (Object) param1, (tc) (Object) var2);
              return;
            } else {
              qc.field_g.a((byte) -119, (tc) (Object) param1);
              return;
            }
          }
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
        byte[] var5 = null;
        int var4 = 112 % ((-78 - param1) / 40);
        ar var3 = (ar) ((rf) this).field_b.a((long)param0, (byte) 127);
        if (var3 != null) {
            return var3;
        }
        if (32768 <= param0) {
            var5 = ((rf) this).field_c.a((byte) 99, 32767 & param0, 1);
        } else {
            var5 = ((rf) this).field_f.a((byte) 118, param0, 1);
        }
        ar var6 = new ar();
        if (var5 != null) {
            var6.a(new vh(var5), (byte) 91);
            if (32768 > param0) {
                ((rf) this).field_b.a((Object) (Object) var6, 100, (long)param0);
                return var6;
            }
            var6.a(true);
            ((rf) this).field_b.a((Object) (Object) var6, 100, (long)param0);
            return var6;
        }
        if (32768 <= param0) {
            var6.a(true);
            ((rf) this).field_b.a((Object) (Object) var6, 100, (long)param0);
            return var6;
        }
        ((rf) this).field_b.a((Object) (Object) var6, 100, (long)param0);
        return var6;
    }

    rf(int param0, kl param1, kl param2, gj param3) {
        ((rf) this).field_b = new ri(64);
        ((rf) this).field_c = param2;
        ((rf) this).field_f = param1;
        if (null != ((rf) this).field_f) {
            int discarded$0 = ((rf) this).field_f.d(1, -2);
        }
        if (((rf) this).field_c == null) {
        }
        int discarded$1 = ((rf) this).field_c.d(1, -2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "As a hero of Gielinor, you must choose which path to follow: align with your chosen god, or remain neutral in your devotions.";
        field_a = "Loading fonts";
    }
}
