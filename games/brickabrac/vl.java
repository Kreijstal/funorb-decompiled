/*
 * Decompiled by CFR-JS 0.4.0.
 */
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

    final static String a(int param0, String param1, int param2) {
        if (3 == param0) {
            return n.field_b;
        }
        if (param0 == -7) {
            return qp.field_b;
        }
        if (!(param0 != 7)) {
            return fp.field_w;
        }
        if (param0 == 8) {
            return vg.field_b;
        }
        if (-10 == param0) {
            return cl.field_s;
        }
        if (-11 == (param0 ^ -1)) {
            return km.field_n;
        }
        if (param0 == -12) {
            return i.field_o;
        }
        if (!(param2 != param0)) {
            return rd.a(fm.field_c, new String[1], (byte) 103);
        }
        return null;
    }

    public static void b(byte param0) {
        if (param0 != 100) {
            vl.a(false, 28);
            field_c = null;
            field_a = null;
            return;
        }
        field_c = null;
        field_a = null;
    }

    final void a(boolean param0, nm param1) {
        L0: {
          if (param1.field_b != null) {
            param1.b((byte) 111);
            break L0;
          } else {
            break L0;
          }
        }
        param1.field_b = ((vl) this).field_e;
        param1.field_e = ((vl) this).field_e.field_e;
        param1.field_b.field_e = param1;
        if (!param0) {
          vl.a(107, 77);
          param1.field_e.field_b = param1;
          return;
        } else {
          param1.field_e.field_b = param1;
          return;
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
        L0: {
          if (null != param0.field_b) {
            param0.b((byte) 111);
            break L0;
          } else {
            break L0;
          }
        }
        param0.field_b = ((vl) this).field_e.field_b;
        param0.field_e = ((vl) this).field_e;
        param0.field_b.field_e = param0;
        param0.field_e.field_b = param0;
        if (param1 == 3) {
          return;
        } else {
          nm discarded$2 = ((vl) this).c(-52);
          return;
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

    final static void a(java.applet.Applet param0, byte param1) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        try {
                            var2 = new java.net.URL(param0.getCodeBase(), "tosupport.ws");
                            param0.getAppletContext().showDocument(hg.a(param0, var2, -1), "_top");
                            if (param1 <= -42) {
                                statePc = 4;
                            } else {
                                statePc = 1;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_0) {
                            caughtException = stateCaught_0;
                            statePc = 3;
                            continue stateLoop;
                        }
                    }
                    case 1: {
                        try {
                            vl.a(false, -57);
                            return;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 3;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        var2_ref = (Exception) (Object) caughtException;
                        var2_ref.printStackTrace();
                        statePc = 4;
                        continue stateLoop;
                    }
                    case 4: {
                        return;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final nm a(byte param0, nm param1) {
        nm var3 = null;
        if (param0 >= 94) {
          L0: {
            if (param1 != null) {
              var3 = param1;
              break L0;
            } else {
              var3 = ((vl) this).field_e.field_e;
              break L0;
            }
          }
          if (var3 == ((vl) this).field_e) {
            ((vl) this).field_b = null;
            return null;
          } else {
            ((vl) this).field_b = var3.field_e;
            return var3;
          }
        } else {
          L1: {
            ((vl) this).field_b = null;
            if (param1 != null) {
              var3 = param1;
              break L1;
            } else {
              var3 = ((vl) this).field_e.field_e;
              break L1;
            }
          }
          if (var3 == ((vl) this).field_e) {
            ((vl) this).field_b = null;
            return null;
          } else {
            ((vl) this).field_b = var3.field_e;
            return var3;
          }
        }
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

    final static void a(vm param0, int param1, boolean param2) {
        vj.a(param2, 256, (byte) 121, param0);
        if (param1 == -27300) {
            return;
        }
        field_a = null;
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
