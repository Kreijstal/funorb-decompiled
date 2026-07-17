/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class vl {
    static boolean[][] field_a;
    static String field_c;
    static int field_d;
    nm field_e;
    private nm field_b;

    final static void a(int param0, int param1) {
        if (param0 <= 11) {
            return;
        }
        hb.field_x = 1000000000L / (long)param1;
    }

    final nm f(int param0) {
        nm var2 = null;
        var2 = ((vl) this).field_e.field_b;
        if (((vl) this).field_e == var2) {
          ((vl) this).field_b = null;
          return null;
        } else {
          if (param0 != 0) {
            return null;
          } else {
            ((vl) this).field_b = var2.field_b;
            return var2;
          }
        }
    }

    final static String a(int param0, String param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_9_0 = null;
        String stackIn_12_0 = null;
        String stackIn_15_0 = null;
        String stackIn_18_0 = null;
        String stackIn_21_0 = null;
        String stackIn_25_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_8_0 = null;
        String stackOut_24_0 = null;
        String stackOut_20_0 = null;
        String stackOut_17_0 = null;
        String stackOut_14_0 = null;
        String stackOut_11_0 = null;
        String stackOut_4_0 = null;
        String stackOut_1_0 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        try {
          L0: {
            if (3 != param0) {
              if (param0 != 6) {
                if (param0 == 7) {
                  stackOut_8_0 = fp.field_w;
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                } else {
                  if (param0 != 8) {
                    if (param0 != 9) {
                      if (param0 != 10) {
                        if (param0 != 11) {
                          if (param0 == 14) {
                            stackOut_24_0 = rd.a(fm.field_c, new String[1], (byte) 103);
                            stackIn_25_0 = stackOut_24_0;
                            break L0;
                          } else {
                            return null;
                          }
                        } else {
                          stackOut_20_0 = i.field_o;
                          stackIn_21_0 = stackOut_20_0;
                          return stackIn_21_0;
                        }
                      } else {
                        stackOut_17_0 = km.field_n;
                        stackIn_18_0 = stackOut_17_0;
                        return stackIn_18_0;
                      }
                    } else {
                      stackOut_14_0 = cl.field_s;
                      stackIn_15_0 = stackOut_14_0;
                      return stackIn_15_0;
                    }
                  } else {
                    stackOut_11_0 = vg.field_b;
                    stackIn_12_0 = stackOut_11_0;
                    return stackIn_12_0;
                  }
                }
              } else {
                stackOut_4_0 = qp.field_b;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = n.field_b;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var3;
            stackOut_26_1 = new StringBuilder().append("vl.I(").append(param0).append(44);
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param1 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L1;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L1;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + 44 + -15 + 41);
        }
        return stackIn_25_0;
    }

    public static void b() {
        field_c = null;
        field_a = null;
    }

    final void a(boolean param0, nm param1) {
        try {
            if (!(param1.field_b == null)) {
                param1.b((byte) 111);
            }
            param1.field_b = ((vl) this).field_e;
            param1.field_e = ((vl) this).field_e.field_e;
            param1.field_b.field_e = param1;
            if (!param0) {
                vl.a(107, 77);
            }
            param1.field_e.field_b = param1;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "vl.F(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final nm d(int param0) {
        nm var2 = null;
        Object var3 = null;
        var2 = ((vl) this).field_e.field_e;
        if (var2 != ((vl) this).field_e) {
          ((vl) this).field_b = var2.field_e;
          if (param0 >= -6) {
            var3 = null;
            ((vl) this).a((nm) null, (byte) 60);
            return var2;
          } else {
            return var2;
          }
        } else {
          ((vl) this).field_b = null;
          return null;
        }
    }

    final int e(int param0) {
        int var2 = 0;
        nm var3 = null;
        int var4 = 0;
        var4 = BrickABrac.field_J ? 1 : 0;
        if (param0 < 117) {
          field_a = null;
          var2 = 0;
          var3 = ((vl) this).field_e.field_e;
          L0: while (true) {
            if (((vl) this).field_e == var3) {
              return var2;
            } else {
              var2++;
              var3 = var3.field_e;
              continue L0;
            }
          }
        } else {
          var2 = 0;
          var3 = ((vl) this).field_e.field_e;
          L1: while (true) {
            if (((vl) this).field_e == var3) {
              return var2;
            } else {
              var2++;
              var3 = var3.field_e;
              continue L1;
            }
          }
        }
    }

    final void a(nm param0, byte param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            L1: {
              if (null != param0.field_b) {
                param0.b((byte) 111);
                break L1;
              } else {
                break L1;
              }
            }
            param0.field_b = ((vl) this).field_e.field_b;
            param0.field_e = ((vl) this).field_e;
            param0.field_b.field_e = param0;
            param0.field_e.field_b = param0;
            if (param1 == 3) {
              break L0;
            } else {
              nm discarded$2 = ((vl) this).c(-52);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("vl.H(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
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
          throw qb.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param1 + 41);
        }
    }

    final static void a(boolean param0, int param1) {
        sb.field_c = !param0 ? new vj(mh.field_Z, ji.field_b) : new vj(ie.field_u, t.field_f);
        qa.field_w = new mh(0L, (mh) null);
        qa.field_w.a((mh) (Object) sb.field_c.field_d, 0);
        qa.field_w.a(ij.field_e, 0);
        wi.field_j = new mh(0L, re.field_m);
        de.field_t = new mh(0L, (mh) null);
        wi.field_j.a(pk.field_h, 0);
        wi.field_j.a(de.field_t, 0);
        int var2 = -67 / ((1 - param1) / 63);
        de.field_t.a(vn.field_A, 0);
        de.field_t.a(nd.field_a, 0);
        kj.a(true, param0);
    }

    final boolean a(boolean param0) {
        if (param0) {
            return false;
        }
        return ((vl) this).field_e == ((vl) this).field_e.field_e ? true : false;
    }

    final nm a(byte param0) {
        nm var2 = null;
        var2 = ((vl) this).field_b;
        if (var2 != ((vl) this).field_e) {
          if (param0 != 116) {
            return null;
          } else {
            ((vl) this).field_b = var2.field_e;
            return var2;
          }
        } else {
          ((vl) this).field_b = null;
          return null;
        }
    }

    final nm a(int param0) {
        nm var2 = null;
        int var3 = 0;
        var2 = ((vl) this).field_e.field_b;
        if (var2 == ((vl) this).field_e) {
          return null;
        } else {
          var3 = 107 / ((51 - param0) / 59);
          var2.b((byte) 111);
          return var2;
        }
    }

    final void c(byte param0) {
        int var3 = 0;
        nm var4 = null;
        nm var5 = null;
        var3 = BrickABrac.field_J ? 1 : 0;
        if (param0 <= -43) {
          L0: while (true) {
            var4 = ((vl) this).field_e.field_e;
            if (((vl) this).field_e != var4) {
              var4.b((byte) 111);
              continue L0;
            } else {
              ((vl) this).field_b = null;
              return;
            }
          }
        } else {
          int discarded$1 = ((vl) this).e(115);
          L1: while (true) {
            var5 = ((vl) this).field_e.field_e;
            if (((vl) this).field_e != var5) {
              var5.b((byte) 111);
              continue L1;
            } else {
              ((vl) this).field_b = null;
              return;
            }
          }
        }
    }

    final static void a(java.applet.Applet param0) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            RuntimeException stackIn_5_0 = null;
            StringBuilder stackIn_5_1 = null;
            RuntimeException stackIn_6_0 = null;
            StringBuilder stackIn_6_1 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            String stackIn_7_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_4_0 = null;
            StringBuilder stackOut_4_1 = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            String stackOut_6_2 = null;
            RuntimeException stackOut_5_0 = null;
            StringBuilder stackOut_5_1 = null;
            String stackOut_5_2 = null;
            try {
              try {
                var2 = new java.net.URL(param0.getCodeBase(), "tosupport.ws");
                int discarded$2 = -1;
                param0.getAppletContext().showDocument(hg.a(param0, var2), "_top");
                return;
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
                stackOut_4_0 = (RuntimeException) var2_ref2;
                stackOut_4_1 = new StringBuilder().append("vl.N(");
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                if (param0 == null) {
                  stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
                  stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
                  stackOut_6_2 = "null";
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  stackIn_7_2 = stackOut_6_2;
                  break L0;
                } else {
                  stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
                  stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
                  stackOut_5_2 = "{...}";
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  stackIn_7_2 = stackOut_5_2;
                  break L0;
                }
              }
              throw qb.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + -106 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final nm a(byte param0, nm param1) {
        nm var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_7_0 = null;
        nm stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        nm stackOut_8_0 = null;
        Object stackOut_6_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (param0 >= 94) {
                break L1;
              } else {
                ((vl) this).field_b = null;
                break L1;
              }
            }
            L2: {
              if (param1 != null) {
                var3 = param1;
                break L2;
              } else {
                var3 = ((vl) this).field_e.field_e;
                break L2;
              }
            }
            if (var3 != ((vl) this).field_e) {
              ((vl) this).field_b = var3.field_e;
              stackOut_8_0 = (nm) var3;
              stackIn_9_0 = stackOut_8_0;
              break L0;
            } else {
              ((vl) this).field_b = null;
              stackOut_6_0 = null;
              stackIn_7_0 = stackOut_6_0;
              return (nm) (Object) stackIn_7_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3_ref;
            stackOut_10_1 = new StringBuilder().append("vl.J(").append(param0).append(44);
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
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
        return stackIn_9_0;
    }

    final nm c(int param0) {
        nm var2 = null;
        if (param0 == 3) {
          var2 = ((vl) this).field_e.field_e;
          if (((vl) this).field_e == var2) {
            return null;
          } else {
            var2.b((byte) 111);
            return var2;
          }
        } else {
          return null;
        }
    }

    final static void a(vm param0) {
        RuntimeException var3 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          vj.a(true, 256, (byte) 121, param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("vl.C(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L0;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L0;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + -27300 + 44 + 1 + 41);
        }
    }

    final nm b(int param0) {
        int var2 = 23 % ((param0 - -65) / 45);
        nm var3 = ((vl) this).field_b;
        if (!(((vl) this).field_e != var3)) {
            ((vl) this).field_b = null;
            return null;
        }
        ((vl) this).field_b = var3.field_b;
        return var3;
    }

    public vl() {
        ((vl) this).field_e = new nm();
        ((vl) this).field_e.field_b = ((vl) this).field_e;
        ((vl) this).field_e.field_e = ((vl) this).field_e;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Played";
        field_d = 3;
    }
}
