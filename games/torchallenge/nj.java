/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nj {
    static boolean[] field_c;
    static ka[][] field_e;
    private sl field_d;
    static int field_g;
    private static k field_h;
    private da field_f;
    static int[][] field_b;
    static boolean field_a;

    final static void a(ka param0, int param1) {
        try {
            if (param1 != 2) {
                field_e = null;
            }
            fc.field_m = param0;
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) (Object) runtimeException, "nj.L(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final da a(int param0) {
        da var2 = null;
        if (param0 > -31) {
            da discarded$0 = ((nj) this).a(-93);
            var2 = ((nj) this).field_d.field_e.field_h;
            if (!(((nj) this).field_d.field_e != var2)) {
                ((nj) this).field_f = null;
                return null;
            }
            ((nj) this).field_f = var2.field_h;
            return var2;
        }
        var2 = ((nj) this).field_d.field_e.field_h;
        if (!(((nj) this).field_d.field_e != var2)) {
            ((nj) this).field_f = null;
            return null;
        }
        ((nj) this).field_f = var2.field_h;
        return var2;
    }

    final static void b(int param0) {
        int var1 = 0;
        L0: {
          var1 = -127 % ((42 - param0) / 60);
          if (null != t.field_b) {
            t.field_b.g((byte) -37);
            break L0;
          } else {
            break L0;
          }
        }
        if (oa.field_k != null) {
          oa.field_k.l(100);
          rf.n(19630);
          return;
        } else {
          rf.n(19630);
          return;
        }
    }

    final da a(da param0, int param1) {
        da var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        Object stackIn_5_0 = null;
        da stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        da stackOut_6_0 = null;
        Object stackOut_4_0 = null;
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
            L1: {
              L2: {
                if (param0 == null) {
                  break L2;
                } else {
                  var3 = param0;
                  if (!TorChallenge.field_F) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var3 = ((nj) this).field_d.field_e.field_h;
              break L1;
            }
            if (((nj) this).field_d.field_e != var3) {
              var4 = 28 / ((49 - param1) / 58);
              ((nj) this).field_f = var3.field_h;
              stackOut_6_0 = (da) var3;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              ((nj) this).field_f = null;
              stackOut_4_0 = null;
              stackIn_5_0 = stackOut_4_0;
              return (da) (Object) stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3_ref;
            stackOut_8_1 = new StringBuilder().append("nj.F(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param1 + 41);
        }
        return stackIn_7_0;
    }

    final da b(da param0, int param1) {
        da var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        Object stackIn_6_0 = null;
        da stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_5_0 = null;
        da stackOut_7_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                if (param0 != null) {
                  break L2;
                } else {
                  var3 = ((nj) this).field_d.field_e.field_f;
                  if (!TorChallenge.field_F) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var3 = param0;
              break L1;
            }
            var4 = -98 % ((-42 - param1) / 45);
            if (((nj) this).field_d.field_e == var3) {
              ((nj) this).field_f = null;
              stackOut_5_0 = null;
              stackIn_6_0 = stackOut_5_0;
              return (da) (Object) stackIn_6_0;
            } else {
              ((nj) this).field_f = var3.field_f;
              stackOut_7_0 = (da) var3;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3_ref;
            stackOut_9_1 = new StringBuilder().append("nj.D(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
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
          throw oj.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param1 + 41);
        }
        return stackIn_8_0;
    }

    final da a(boolean param0) {
        if (param0) {
            return null;
        }
        da var2 = ((nj) this).field_f;
        if (!(var2 != ((nj) this).field_d.field_e)) {
            ((nj) this).field_f = null;
            return null;
        }
        ((nj) this).field_f = var2.field_f;
        return var2;
    }

    public static void b(byte param0) {
        Object var2 = null;
        field_e = null;
        field_b = null;
        field_h = null;
        if (param0 != -40) {
          var2 = null;
          nj.a((ka) null, 74);
          field_c = null;
          return;
        } else {
          field_c = null;
          return;
        }
    }

    final da c(byte param0) {
        da var2 = null;
        if (param0 != -13) {
            field_e = null;
            var2 = ((nj) this).field_f;
            if (!(((nj) this).field_d.field_e != var2)) {
                ((nj) this).field_f = null;
                return null;
            }
            ((nj) this).field_f = var2.field_h;
            return var2;
        }
        var2 = ((nj) this).field_f;
        if (!(((nj) this).field_d.field_e != var2)) {
            ((nj) this).field_f = null;
            return null;
        }
        ((nj) this).field_f = var2.field_h;
        return var2;
    }

    final static k[] a(byte param0) {
        return new k[]{ij.field_w, dg.field_O, il.field_n, lh.field_w, oh.field_d, hc.field_P, ek.field_C, bf.field_g, le.field_f, lk.field_d, lk.field_a, kf.field_e, di.field_F, field_h};
    }

    nj(sl param0) {
        try {
            ((nj) this).field_d = param0;
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) (Object) runtimeException, "nj.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    final static void a(int param0, int param1, java.awt.Canvas param2, int param3) {
        java.awt.Graphics var4 = null;
        Exception var4_ref = null;
        RuntimeException var4_ref2 = null;
        Object var5 = null;
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
          L0: {
            if (param3 == 0) {
              break L0;
            } else {
              var5 = null;
              nj.a((ka) null, 63);
              break L0;
            }
          }
          try {
            L1: {
              var4 = param2.getGraphics();
              la.field_f.a(-19275, param1, param0, var4);
              var4.dispose();
              break L1;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var4_ref = (Exception) (Object) decompiledCaughtException;
            param2.repaint();
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L2: {
            var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var4_ref2;
            stackOut_6_1 = new StringBuilder().append("nj.J(").append(param0).append(44).append(param1).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
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
          throw oj.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param3 + 41);
        }
    }

    final da c(int param0) {
        da var2 = null;
        if (param0 != 0) {
            Object var3 = null;
            da discarded$0 = ((nj) this).a((da) null, 103);
            var2 = ((nj) this).field_d.field_e.field_f;
            if (!(((nj) this).field_d.field_e != var2)) {
                ((nj) this).field_f = null;
                return null;
            }
            ((nj) this).field_f = var2.field_f;
            return var2;
        }
        var2 = ((nj) this).field_d.field_e.field_f;
        if (!(((nj) this).field_d.field_e != var2)) {
            ((nj) this).field_f = null;
            return null;
        }
        ((nj) this).field_f = var2.field_f;
        return var2;
    }

    final static t a(String param0, boolean param1, String param2, boolean param3) {
        long var4_long = 0L;
        RuntimeException var4 = null;
        Object var6 = null;
        CharSequence var7 = null;
        Object stackIn_2_0 = null;
        t stackIn_7_0 = null;
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
        RuntimeException decompiledCaughtException = null;
        t stackOut_6_0 = null;
        Object stackOut_1_0 = null;
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
        try {
          L0: {
            if (param1) {
              L1: {
                L2: {
                  var4_long = 0L;
                  var6 = null;
                  if (param2.indexOf('@') != -1) {
                    break L2;
                  } else {
                    var7 = (CharSequence) (Object) param2;
                    var4_long = lg.a(var7, -1);
                    if (!TorChallenge.field_F) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                var6 = (Object) (Object) param2;
                break L1;
              }
              stackOut_6_0 = ac.a(var4_long, (String) var6, -12, param0, param3);
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (t) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var4;
            stackOut_8_1 = new StringBuilder().append("nj.G(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          L4: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(44).append(param1).append(44);
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
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param3 + 41);
        }
        return stackIn_7_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new ka[2][64];
        field_c = new boolean[112];
        field_b = new int[64][2];
        field_h = new k(15, 0, 1, 0);
        field_a = false;
    }
}
