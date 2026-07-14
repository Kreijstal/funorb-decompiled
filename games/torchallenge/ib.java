/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ib extends kj implements tb, sg {
    li field_L;
    private ng field_J;
    static int[] field_O;
    static ka[] field_M;
    static String field_N;
    private ng field_K;
    private rf field_P;

    final static void a(java.awt.Canvas param0, int param1, boolean param2) {
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        L0: {
          var4 = TorChallenge.field_F ? 1 : 0;
          if (param1 == 25) {
            break L0;
          } else {
            var5 = null;
            ib.a(true, (bf) null);
            break L0;
          }
        }
        L1: {
          if (10 <= li.field_K) {
            if (!eh.a(param1 ^ 43)) {
              qg.b();
              v.e(240, 320, 101);
              nj.a(0, 0, param0, 0);
              break L1;
            } else {
              if (gj.field_c != 0) {
                il.a(-20895, param0);
                break L1;
              } else {
                ll.a(0, false, param2);
                nj.a(0, 0, param0, 0);
                break L1;
              }
            }
          } else {
            L2: {
              var3 = 0;
              if (je.field_f) {
                je.field_f = false;
                var3 = 1;
                break L2;
              } else {
                break L2;
              }
            }
            o.a(ra.a(param1 ^ 24), param1 + 278, var3 != 0, dl.field_l, sa.a(true));
            break L1;
          }
        }
    }

    private final int a(String param0, int param1, int param2, int param3, String param4, ee param5) {
        if (param3 > -89) {
            Object var8 = null;
            boolean discarded$0 = ib.a(-106, (java.applet.Applet) null);
        }
        return this.a(param1, param4, param5, param2, param0, 83, 35);
    }

    final static void a(boolean param0, bf param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = TorChallenge.field_F ? 1 : 0;
        var2 = 0;
        L0: while (true) {
          if (-4 >= (var2 ^ -1)) {
            L1: {
              var2 = 0;
              if (param0) {
                break L1;
              } else {
                field_O = null;
                break L1;
              }
            }
            L2: while (true) {
              if (var2 >= vd.field_f) {
                o.field_j[param1.a((byte) -116)] = o.field_j[param1.a((byte) -116)] + 1;
                var2 = 0;
                var3 = 0;
                L3: while (true) {
                  if (vd.field_f <= var3) {
                    vd.field_f = var2;
                    vd.field_f = vd.field_f + 1;
                    we.field_i[vd.field_f] = param1;
                    return;
                  } else {
                    L4: {
                      if (param1.field_b != we.field_i[var3].field_b) {
                        break L4;
                      } else {
                        var4 = we.field_i[var3].a((byte) -116);
                        if (o.field_j[var4] <= tc.field_l) {
                          break L4;
                        } else {
                          o.field_j[var4] = o.field_j[var4] - 1;
                          var3++;
                          continue L3;
                        }
                      }
                    }
                    var2++;
                    we.field_i[var2] = we.field_i[var3];
                    var3++;
                    continue L3;
                  }
                }
              } else {
                if (param1.field_b == we.field_i[var2].field_b) {
                  o.field_j[we.field_i[var2].a((byte) -116)] = o.field_j[we.field_i[var2].a((byte) -116)] + 1;
                  var2++;
                  continue L2;
                } else {
                  var2++;
                  continue L2;
                }
              }
            }
          } else {
            o.field_j[var2] = 0;
            var2++;
            continue L0;
          }
        }
    }

    public final void a(ng param0, int param1, int param2, int param3, boolean param4) {
        if (param4) {
            this.h(-69);
        }
        if (param0 == ((ib) this).field_K) {
            nd.b((byte) 116);
        } else {
            if (!(param0 != ((ib) this).field_J)) {
                this.h(17945);
            }
        }
    }

    private final boolean a(int param0, uh param1) {
        wd var3 = param1.a(-117);
        if (var3 == null) {
            return true;
        }
        if (param0 >= -79) {
            return false;
        }
        rj var4 = var3.b(122);
        return tf.field_w == var4 ? true : false;
    }

    final static boolean a(int param0, java.applet.Applet param1) {
        try {
            Throwable var2 = null;
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            Object var8 = null;
            String var9 = null;
            int stackIn_10_0 = 0;
            int stackIn_17_0 = 0;
            int stackOut_9_0 = 0;
            int stackOut_15_0 = 0;
            int stackOut_16_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var7 = TorChallenge.field_F ? 1 : 0;
                        if (!ed.field_d) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        return true;
                    }
                    case 2: {
                        try {
                            if (param0 >= 76) {
                                statePc = 4;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            var8 = null;
                            ib.a((java.awt.Canvas) null, -77, false);
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            var9 = "tuhstatbut";
                            var3 = (String) ff.a("getcookies", param1, 20511);
                            var4 = dl.a(var3, ';', -26);
                            var5 = 0;
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            if (var5 >= var4.length) {
                                statePc = 14;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            var6 = var4[var5].indexOf('=');
                            if (-1 < (var6 ^ -1)) {
                                statePc = 11;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            if (var4[var5].substring(0, var6).trim().equals((Object) (Object) var9)) {
                                statePc = 9;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            stackOut_9_0 = 1;
                            stackIn_10_0 = stackOut_9_0;
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        return stackIn_10_0 != 0;
                    }
                    case 11: {
                        try {
                            var5++;
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        var2 = caughtException;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 14: {
                        if (null == param1.getParameter("tuhstatbut")) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        stackOut_15_0 = 1;
                        stackIn_17_0 = stackOut_15_0;
                        statePc = 17;
                        continue stateLoop;
                    }
                    case 16: {
                        stackOut_16_0 = 0;
                        stackIn_17_0 = stackOut_16_0;
                        statePc = 17;
                        continue stateLoop;
                    }
                    case 17: {
                        return stackIn_17_0 != 0;
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

    final void a(ee param0, int param1, byte param2, int param3) {
        super.a(param0, param1, (byte) -101, param3);
        ((ib) this).field_J.field_F = this.f((byte) 118);
        if (param2 > -97) {
            field_N = null;
        }
    }

    public final void a(String param0, int param1) {
        rf var3 = ((ib) this).field_P;
        String var4 = param0;
        ((dj) (Object) var3).a(var4, false, (byte) -21);
        if (param1 > -84) {
            this.h(66);
        }
    }

    public static void c(boolean param0) {
        if (param0) {
            return;
        }
        field_M = null;
        field_N = null;
        field_O = null;
    }

    public ib() {
        super(0, 0, 496, 0, (j) null);
        ((ib) this).field_P = new rf("", (gg) null, 12);
        bc var1 = new bc(ug.field_f, 0, 0, 0, 0, 16777215, -1, 3, 0, oe.field_g.field_x, -1, 2147483647, true);
        ee var2 = new ee(kg.field_eb, (j) (Object) var1, (gg) null);
        ((ib) this).field_J = new ng(jl.field_g, (gg) null);
        ((ib) this).field_K = new ng(nh.field_fb, (gg) null);
        ((ib) this).field_P.field_r = ci.field_o;
        ((ib) this).field_P.a(-27997, (wd) (Object) new i((dj) (Object) ((ib) this).field_P));
        ((ib) this).field_J.field_F = false;
        ((ib) this).field_J.field_q = (j) (Object) new cl();
        ((ib) this).field_K.field_q = (j) (Object) new me();
        ((ib) this).field_P.field_q = (j) (Object) new fk(10000536);
        int var3 = 20;
        int var4 = 4;
        int var5 = 200;
        var2.a((byte) 119, 20, 50, 270, var3);
        ((ib) this).a(0, var2);
        var3 += 50;
        var3 = var3 + (5 + this.a(pa.field_t, 170, var3, -114, te.field_a, (ee) (Object) ((ib) this).field_P));
        ((ib) this).field_J.a((byte) 120, 496 - var5 >> -341723487, 40, var5, var3);
        ((ib) this).field_K.a((byte) 118, 3 + var4, 40, 60, var3 + 15);
        ((ib) this).field_K.field_k = (gg) this;
        ((ib) this).field_J.field_k = (gg) this;
        ((ib) this).a(0, (ee) (Object) ((ib) this).field_J);
        ((ib) this).a(0, (ee) (Object) ((ib) this).field_K);
        ((ib) this).field_L = new li((tb) this);
        ((ib) this).field_L.a((byte) 115, ((ib) this).field_P.field_m + (((ib) this).field_P.field_p + 60), 150, -60 + (-((ib) this).field_P.field_p + ((ib) this).field_p) - ((ib) this).field_P.field_m, 20);
        ((ib) this).a(0, (ee) (Object) ((ib) this).field_L);
        ((ib) this).a((byte) 114, 0, 55 + var3 - -var4, 496, 0);
    }

    public final void a(int param0) {
        ((i) (Object) ((ib) this).field_P.a(param0 + 23025)).f(param0 ^ param0);
    }

    private final boolean f(byte param0) {
        if (param0 <= 52) {
            ((ib) this).field_L = null;
        }
        if (this.a(-95, (uh) (Object) ((ib) this).field_P)) {
            return true;
        }
        return false;
    }

    private final void h(int param0) {
        if (!this.f((byte) 62)) {
            return;
        }
        nd.a(true, ((ib) this).field_P.field_v);
        if (param0 != 17945) {
            field_M = null;
        }
    }

    private final int a(int param0, String param1, ee param2, int param3, String param4, int param5, int param6) {
        bg var10 = new bg(20, param3, 120 - -param0, 25, param2, false, 120, 3, oe.field_g, 16777215, param4);
        ((ib) this).a(0, (ee) (Object) var10);
        dh var9 = new dh(((uh) (Object) param2).a(-126), param1, 126, var10.field_l + param3, param0 + 25, param6);
        var9.field_k = (gg) this;
        ((ib) this).a(0, (ee) (Object) var9);
        if (param5 < 0) {
            field_M = null;
        }
        return var10.field_l - -var9.field_l;
    }

    final boolean a(int param0, char param1, byte param2, ee param3) {
        if (param2 <= 9) {
            return false;
        }
        if (!(!super.a(param0, param1, (byte) 117, param3))) {
            return true;
        }
        if (!(98 != param0)) {
            return ((ib) this).a(param3, (byte) -16);
        }
        if (99 == param0) {
            return ((ib) this).b(106, param3);
        }
        return false;
    }

    final static void a(int param0, boolean param1, boolean param2, t param3, boolean param4) {
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        L0: {
          wa.field_rb[0] = id.field_a.nextInt();
          wa.field_rb[1] = id.field_a.nextInt();
          wa.field_rb[2] = (int)(lh.field_u >> -1884439520);
          wa.field_rb[3] = (int)lh.field_u;
          pk.field_e.field_q = 0;
          pk.field_e.a(wa.field_rb[0], param1);
          pk.field_e.a(wa.field_rb[1], false);
          pk.field_e.a(wa.field_rb[2], false);
          pk.field_e.a(wa.field_rb[3], param1);
          hc.a(pk.field_e, (byte) -13);
          pk.field_e.a(param0, (byte) 106);
          param3.a(pk.field_e, -76);
          dk.field_s.field_q = 0;
          if (param2) {
            dk.field_s.d(18, (byte) 122);
            break L0;
          } else {
            dk.field_s.d(16, (byte) 122);
            break L0;
          }
        }
        L1: {
          dk.field_s.field_q = dk.field_s.field_q + 2;
          var5 = dk.field_s.field_q;
          dk.field_s.a(na.field_c, false);
          dk.field_s.a(true, wh.field_c);
          var6 = 0;
          if (fg.field_S) {
            var6 = var6 | 1;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (ed.field_e) {
            var6 = var6 | 4;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (param4) {
            var6 = var6 | 8;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (le.field_c == null) {
            break L4;
          } else {
            var6 = var6 | 16;
            break L4;
          }
        }
        L5: {
          dk.field_s.d(var6, (byte) 122);
          var7 = mj.a(gi.b(12476), 121);
          if (var7 == null) {
            var7 = "";
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          dk.field_s.a(var7, (byte) 94);
          if (le.field_c != null) {
            dk.field_s.a((byte) 27, le.field_c);
            break L6;
          } else {
            break L6;
          }
        }
        ac.a(mb.field_a, (byte) -105, pk.field_e, jl.field_f, (uf) (Object) dk.field_s);
        dk.field_s.b(-var5 + dk.field_s.field_q, (byte) -40);
        nb.a(-1, -1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_N = "Username: ";
        field_O = new int[8192];
    }
}
