/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class d extends se {
    private boolean field_z;
    private boolean field_r;
    private int field_p;
    static bd field_s;
    static long field_y;
    private int field_v;
    static int field_u;
    String field_o;
    private int field_m;
    private int field_t;
    static long field_n;
    private int field_A;
    private boolean field_w;
    private int field_q;
    private long field_x;

    final static void a(byte param0, byte[] param1, File param2, int param3) throws IOException {
        DataInputStream var4 = new DataInputStream((InputStream) (Object) new BufferedInputStream((InputStream) (Object) new FileInputStream(param2)));
        if (param0 >= -107) {
            return;
        }
        try {
            if (false) throw (EOFException) null;
            var4.readFully(param1, 0, param3);
        } catch (EOFException eOFException) {
        }
        var4.close();
    }

    private final void c(boolean param0) {
        mk.field_O[2] = param0;
    }

    public static void g(byte param0) {
        field_s = null;
        int var1 = -80 % ((-65 - param0) / 37);
    }

    final void a(int param0, boolean param1, int param2, int param3, int param4, boolean param5, int param6, int param7) {
        java.awt.Frame var10 = null;
        var10 = new java.awt.Frame("Jagex");
        var10.pack();
        var10.dispose();
        ((d) this).setBackground(java.awt.Color.black);
        if (param5) {
          return;
        } else {
          nl.field_c = ((d) this).field_t;
          la.a(-29828, nl.field_c);
          m.a(param3, param1, gf.field_b, ((d) this).field_v, 5000, ((d) this).field_q, nl.field_c, 5000, ((d) this).field_m, ((d) this).field_x, ((d) this).field_o, -40, ((d) this).field_p, ((d) this).field_z);
          hh.a(nl.field_c, ((d) this).field_v, gf.field_b, ((d) this).field_p, ((d) this).field_o, ((d) this).field_q, ((d) this).field_m, param3, -1);
          rb.e(-2);
          h.field_b = ti.b((byte) -55);
          ea.a(se.field_h, 0);
          nm.field_i = param6;
          ck.field_e = param4;
          tb.field_P = param7;
          ll.field_d = param2;
          uh.field_k = param0;
          this.i(12);
          ec.b(-21931);
          return;
        }
    }

    private final void k(int param0) {
        String var2 = bb.b((byte) 99);
        if (param0 != -1431) {
            field_y = 69L;
        }
        qj.a(var2, bn.c(-1), (byte) 85);
    }

    final int d(byte param0) {
        int var2 = 0;
        if (!((d) this).field_i) {
          if (ig.c(false)) {
            if (!i.field_d) {
              var2 = ee.a(true, ((d) this).field_A, ((d) this).field_r, -109, qc.d(750938499), q.c(-1));
              if (-1 == var2) {
                return -1;
              } else {
                if (-1 != (var2 ^ -1)) {
                  if ((var2 ^ -1) == -2) {
                    L0: {
                      if (11 != fa.field_c) {
                        break L0;
                      } else {
                        if (rj.field_H == 0) {
                          ba.e((byte) -90);
                          break L0;
                        } else {
                          break L0;
                        }
                      }
                    }
                    return var2;
                  } else {
                    L1: {
                      if (na.field_b) {
                        break L1;
                      } else {
                        ((d) this).a(3904, "reconnect");
                        break L1;
                      }
                    }
                    L2: {
                      if (param0 == -75) {
                        break L2;
                      } else {
                        ((d) this).field_t = 120;
                        break L2;
                      }
                    }
                    cf.b(true);
                    la.a(var2, km.field_x, (byte) 65);
                    i.field_d = true;
                    dh.field_c = 15000L + hn.a((byte) 80);
                    return var2;
                  }
                } else {
                  L3: {
                    if (11 != fa.field_c) {
                      break L3;
                    } else {
                      if (rj.field_H == 0) {
                        ba.e((byte) -90);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                  return var2;
                }
              }
            } else {
              return -1;
            }
          } else {
            return -1;
          }
        } else {
          return -1;
        }
    }

    private final void a(boolean param0, byte param1) {
        if (param1 != 30) {
          return;
        } else {
          mk.field_O[18] = true;
          mk.field_O[0] = true;
          mk.field_O[17] = true;
          mk.field_O[16] = true;
          mk.field_O[8] = param0;
          mk.field_O[7] = true;
          mk.field_O[3] = true;
          return;
        }
    }

    final int b(boolean param0, int param1) {
        if (param1 != -1) {
            return -52;
        }
        return this.a(true, -1, param0);
    }

    private final void g(int param0) {
        if (param0 != 24293) {
            field_s = null;
        }
        mk.field_O[1] = true;
    }

    private final void j(int param0) {
        int var2 = sc.field_g.l(32270);
        int var3 = param0 != (1 & var2) ? 1 : 0;
        int var4 = -1 + jd.field_q;
        byte[] var5 = new byte[var4];
        sc.field_g.a(0, var4, var5, (byte) 82);
        wc.a(bn.c(-1), nm.a(125, var5), (byte) -97, var3 != 0);
    }

    private final void a(int param0, String param1, int param2, int param3, byte param4) {
        Exception var6 = null;
        String var6_ref = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        Object var10 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_5_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_6_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        try {
          if (((d) this).d(-64)) {
            L0: {
              ((d) this).field_o = ((d) this).getCodeBase().getHost();
              var6_ref = ((d) this).field_o.toLowerCase();
              if (param4 <= -21) {
                break L0;
              } else {
                int discarded$1 = ((d) this).b(true, 87);
                break L0;
              }
            }
            L1: {
              L2: {
                stackOut_4_0 = this;
                stackIn_7_0 = stackOut_4_0;
                stackIn_5_0 = stackOut_4_0;
                if (var6_ref.equals((Object) (Object) "jagex.com")) {
                  break L2;
                } else {
                  stackOut_5_0 = this;
                  stackIn_8_0 = stackOut_5_0;
                  stackIn_6_0 = stackOut_5_0;
                  if (!var6_ref.endsWith(".jagex.com")) {
                    stackOut_8_0 = this;
                    stackOut_8_1 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    stackIn_9_1 = stackOut_8_1;
                    break L1;
                  } else {
                    stackOut_6_0 = this;
                    stackIn_7_0 = stackOut_6_0;
                    break L2;
                  }
                }
              }
              stackOut_7_0 = this;
              stackOut_7_1 = 1;
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              break L1;
            }
            L3: {
              ((d) this).field_r = stackIn_9_1 != 0;
              ((d) this).field_v = Integer.parseInt(((d) this).getParameter("gameport1"));
              ((d) this).field_m = Integer.parseInt(((d) this).getParameter("gameport2"));
              var7 = ((d) this).getParameter("servernum");
              if (var7 == null) {
                break L3;
              } else {
                ((d) this).field_q = Integer.parseInt(var7);
                break L3;
              }
            }
            L4: {
              ((d) this).field_p = Integer.parseInt(((d) this).getParameter("gamecrc"));
              ((d) this).field_x = Long.parseLong(((d) this).getParameter("instanceid"));
              ((d) this).field_z = ((d) this).getParameter("member").equals((Object) (Object) "yes");
              var8 = ((d) this).getParameter("lang");
              if (var8 != null) {
                ((d) this).field_t = Integer.parseInt(var8);
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (((d) this).field_t >= 5) {
                ((d) this).field_t = 0;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              var9 = ((d) this).getParameter("affid");
              if (var9 != null) {
                ((d) this).field_A = Integer.parseInt(var9);
                break L6;
              } else {
                break L6;
              }
            }
            kj.field_b = Boolean.valueOf(((d) this).getParameter("simplemode")).booleanValue();
            ((d) this).a(param3, param2, 32, (byte) 121, param0, param1, ((d) this).field_p);
          } else {
            return;
          }
        } catch (java.lang.Exception decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
        }
        var6 = (Exception) (Object) decompiledCaughtException;
        var10 = null;
        ic.a((byte) -120, (String) null, (Throwable) (Object) var6);
        ((d) this).a(3904, "crash");
    }

    final void a(boolean param0, byte param1, boolean param2, boolean param3, boolean param4) {
        this.a(false, (byte) 30);
        if (!(!param3)) {
            this.g(24293);
        }
        int var6 = 82 % ((-26 - param1) / 38);
        if (!(!param2)) {
            this.c(true);
        }
        if (param0) {
            this.e((byte) -56);
        }
        if (param4) {
            this.f((byte) 97);
        }
    }

    private final void f(byte param0) {
        mk.field_O[5] = true;
        if (param0 != 97) {
            d.g((byte) -39);
        }
    }

    private final int a(boolean param0, int param1, boolean param2) {
        try {
            int var4 = 0;
            Exception var5 = null;
            int var5_int = 0;
            String var7 = null;
            int var8 = 0;
            Object var9 = null;
            Boolean var10 = null;
            vi var11 = null;
            Throwable decompiledCaughtException = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var8 = HostileSpawn.field_I ? 1 : 0;
                        var4 = vb.a(ll.field_c, 118, nl.field_c, param2);
                        if (param1 != (var4 ^ -1)) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        throw new IllegalStateException();
                    }
                    case 2: {
                        if (var4 == 1) {
                            statePc = 4;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        var5_int = pj.a(la.b(false), kj.b(-109), 29280);
                        if (-1 != var5_int) {
                            statePc = 6;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        hj.a(ea.field_a, km.field_x, 0, var5_int);
                        ea.field_a = null;
                        km.field_x = null;
                        statePc = 7;
                        continue stateLoop;
                    }
                    case 7: {
                        var10 = fj.k(-11401);
                        if (var10 != null) {
                            statePc = 9;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 9: {
                        cj.a(75, var10.booleanValue());
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        if ((var4 ^ -1) != -3) {
                            statePc = 13;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        var5_int = fj.a(jm.a((byte) 93), ((d) this).field_A, vf.l(-1), q.c(-1), kj.a(param1 + -125), (byte) -8, qc.d(param1 ^ -750938500));
                        if (var5_int == -1) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        gm.a(26991, km.field_x, ea.field_a, var5_int);
                        km.field_x = null;
                        ea.field_a = null;
                        statePc = 13;
                        continue stateLoop;
                    }
                    case 13: {
                        if (-4 == (var4 ^ -1)) {
                            statePc = 15;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        if ((rj.field_H ^ -1) == 0) {
                            statePc = 19;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    }
                    case 16: {
                        if (rj.field_H != 0) {
                            statePc = 18;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    }
                    case 18: {
                        rj.field_H = -1;
                        lg.c(true);
                        statePc = 19;
                        continue stateLoop;
                    }
                    case 19: {
                        if (param0) {
                            statePc = 25;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    }
                    case 20: {
                        var5_int = ee.a(false, ((d) this).field_A, ((d) this).field_r, -124, qc.d(750938499), q.c(-1));
                        if (0 != (var5_int ^ -1)) {
                            statePc = 22;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    }
                    case 22: {
                        if (0 != var5_int) {
                            statePc = 24;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    }
                    case 23: {
                        wg.field_yb = ib.field_d;
                        ba.e((byte) -86);
                        md.field_k = false;
                        fa.field_c = 10;
                        statePc = 26;
                        continue stateLoop;
                    }
                    case 24: {
                        la.a(var5_int, km.field_x, (byte) 51);
                        km.field_x = null;
                        statePc = 26;
                        continue stateLoop;
                    }
                    case 25: {
                        i.field_d = false;
                        statePc = 26;
                        continue stateLoop;
                    }
                    case 26: {
                        if (-5 != (var4 ^ -1)) {
                            statePc = 30;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    }
                    case 27: {
                        if (wc.field_g) {
                            statePc = 29;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    }
                    case 28: {
                        md.field_k = true;
                        fa.field_c = 10;
                        statePc = 30;
                        continue stateLoop;
                    }
                    case 29: {
                        aa.a(bn.c(-1), 2429);
                        statePc = 30;
                        continue stateLoop;
                    }
                    case 30: {
                        if ((var4 ^ -1) != -6) {
                            statePc = 32;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    }
                    case 31: {
                        dc.a(param1 ^ -64, bn.c(-1));
                        statePc = 32;
                        continue stateLoop;
                    }
                    case 32: {
                        if (6 == var4) {
                            statePc = 34;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    }
                    case 34: {
                        if (ka.field_r) {
                            statePc = 36;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    }
                    case 36: {
                        fa.field_c = 10;
                        statePc = 37;
                        continue stateLoop;
                    }
                    case 37: {
                        if (-8 != (var4 ^ -1)) {
                            statePc = 39;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    }
                    case 38: {
                        uj.a(bn.c(param1 + 0), (byte) 41);
                        statePc = 39;
                        continue stateLoop;
                    }
                    case 39: {
                        if ((var4 ^ -1) == -9) {
                            statePc = 41;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    }
                    case 41: {
                        aa.a(bn.c(-1), 2429);
                        statePc = 42;
                        continue stateLoop;
                    }
                    case 42: {
                        if (9 == var4) {
                            statePc = 44;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    }
                    case 44: {
                        td.a(bn.c(-1), 200);
                        statePc = 45;
                        continue stateLoop;
                    }
                    case 45: {
                        if ((var4 ^ -1) == -11) {
                            statePc = 47;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    }
                    case 47: {
                        s.field_b.i(19319, 17);
                        statePc = 48;
                        continue stateLoop;
                    }
                    case 48: {
                        if (var4 == 11) {
                            statePc = 50;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    }
                    case 50: {
                        o.a((byte) -98, bn.c(-1));
                        statePc = 51;
                        continue stateLoop;
                    }
                    case 51: {
                        if (var4 != 12) {
                            statePc = 53;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    }
                    case 52: {
                        ta.a(-320, hj.d(param1 + 71), bn.c(-1));
                        statePc = 53;
                        continue stateLoop;
                    }
                    case 53: {
                        if (-14 != (var4 ^ -1)) {
                            statePc = 64;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    }
                    case 54: {
                        try {
                            if (eb.field_c != null) {
                                statePc = 56;
                            } else {
                                statePc = 55;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            eb.field_c = new sc(gf.field_b, new java.net.URL(((d) this).getCodeBase(), "countrylist.ws"), 5000);
                            statePc = 56;
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            if (eb.field_c.b(24)) {
                                statePc = 58;
                            } else {
                                statePc = 57;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            statePc = 64;
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            var11 = eb.field_c.b((byte) 124);
                            if (var11 == null) {
                                statePc = 60;
                            } else {
                                statePc = 59;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            var7 = db.a(var11.field_n, 0, (byte) -120, var11.field_i);
                            wj.b(var7, -10603);
                            statePc = 61;
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            wj.b((String) null, param1 ^ 10602);
                            statePc = 61;
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            eb.field_c = null;
                            statePc = 64;
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        var5 = (Exception) (Object) caughtException;
                        ic.a((byte) -117, "S1", (Throwable) (Object) var5);
                        var9 = null;
                        wj.b((String) null, -10603);
                        eb.field_c = null;
                        statePc = 64;
                        continue stateLoop;
                    }
                    case 64: {
                        if (15 == var4) {
                            statePc = 66;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    }
                    case 66: {
                        fa.field_c = 10;
                        statePc = 67;
                        continue stateLoop;
                    }
                    case 67: {
                        if (16 != var4) {
                            statePc = 69;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    }
                    case 68: {
                        return 1;
                    }
                    case 69: {
                        if (-18 != (var4 ^ -1)) {
                            statePc = 71;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    }
                    case 70: {
                        return 2;
                    }
                    case 71: {
                        return 0;
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

    final void h(int param0) {
        int var3 = HostileSpawn.field_I ? 1 : 0;
        if (bc.d(-95)) {
            int discarded$1 = this.a(false, param0 ^ 12751, wa.field_q != null ? true : false);
        } else {
            if (-11 < (pb.field_Kb ^ -1)) {
            } else {
                if (!uk.a(27301)) {
                    qa.a(true);
                } else {
                    if (0 != fa.field_c) {
                        ml.a((byte) 112, ll.field_c);
                    } else {
                        int discarded$2 = this.a(false, param0 + 12751, false);
                    }
                }
            }
        }
        if (param0 != -12752) {
            this.j(-31);
        }
    }

    final void h(byte param0) {
        int var2 = 0;
        int var3 = 0;
        ln var4 = null;
        int var5 = 0;
        int stackIn_21_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int stackOut_20_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_22_1 = 0;
        int stackOut_21_0 = 0;
        int stackOut_21_1 = 0;
        L0: {
          var5 = HostileSpawn.field_I ? 1 : 0;
          var2 = 102 % ((45 - param0) / 58);
          var3 = wa.field_k;
          if (-65 >= (var3 ^ -1)) {
            break L0;
          } else {
            if (mk.field_O[var3]) {
              if (0 == var3) {
                return;
              } else {
                L1: {
                  if (var3 == 1) {
                    tg.b(-4309);
                    break L1;
                  } else {
                    if ((var3 ^ -1) != -3) {
                      if (var3 == -4) {
                        lb.b(-20785);
                        break L1;
                      } else {
                        if (-5 == var3) {
                          mb.a((byte) 65);
                          break L1;
                        } else {
                          if (var3 != 5) {
                            if (var3 == 6) {
                              rg.c(1);
                              break L1;
                            } else {
                              if (-8 == var3) {
                                this.k(-1431);
                                break L1;
                              } else {
                                if (var3 != 8) {
                                  if (-17 == var3) {
                                    t.a((byte) 118);
                                    break L1;
                                  } else {
                                    L2: {
                                      if (var3 == 11) {
                                        break L2;
                                      } else {
                                        if (var3 != 12) {
                                          if (-14 != var3) {
                                            if (17 != var3) {
                                              if (18 == var3) {
                                                dh.a((byte) -6);
                                                break L1;
                                              } else {
                                                ic.a((byte) -121, "MGS1: " + gf.a((byte) -123), (Throwable) null);
                                                le.c((byte) 81);
                                                break L1;
                                              }
                                            } else {
                                              this.j(0);
                                              break L1;
                                            }
                                          } else {
                                            oc.a((byte) 102);
                                            break L1;
                                          }
                                        } else {
                                          break L2;
                                        }
                                      }
                                    }
                                    L3: {
                                      stackOut_20_0 = 1;
                                      stackIn_22_0 = stackOut_20_0;
                                      stackIn_21_0 = stackOut_20_0;
                                      if (-13 != var3) {
                                        stackOut_22_0 = stackIn_22_0;
                                        stackOut_22_1 = 0;
                                        stackIn_23_0 = stackOut_22_0;
                                        stackIn_23_1 = stackOut_22_1;
                                        break L3;
                                      } else {
                                        stackOut_21_0 = stackIn_21_0;
                                        stackOut_21_1 = 1;
                                        stackIn_23_0 = stackOut_21_0;
                                        stackIn_23_1 = stackOut_21_1;
                                        break L3;
                                      }
                                    }
                                    var4 = wk.a(stackIn_23_0 != 0, stackIn_23_1 != 0);
                                    ce.a(var4, true);
                                    break L1;
                                  }
                                } else {
                                  i.a(29821, (vi) (Object) sc.field_g, gf.field_b, jd.field_q);
                                  break L1;
                                }
                              }
                            }
                          } else {
                            rc.b(2);
                            break L1;
                          }
                        }
                      }
                    } else {
                      vi.k(64);
                      break L1;
                    }
                  }
                }
                return;
              }
            } else {
              break L0;
            }
          }
        }
        ic.a((byte) -122, "MGS2: " + gf.a((byte) -125), (Throwable) null);
        le.c((byte) 77);
    }

    private final void i(int param0) {
        ng.field_l[11] = -1;
        ng.field_l[3] = -1;
        ng.field_l[param0] = -1;
        ng.field_l[8] = -2;
        ng.field_l[18] = 1;
        ng.field_l[1] = 16;
        ng.field_l[16] = -1;
        ng.field_l[17] = -1;
        ng.field_l[7] = -1;
        ng.field_l[2] = -2;
        ng.field_l[9] = -1;
        ng.field_l[10] = -1;
        ng.field_l[13] = -1;
        ng.field_l[4] = -1;
        ng.field_l[6] = -2;
        ng.field_l[5] = -1;
    }

    final void a(boolean param0, int param1) {
        int var3 = 0;
        java.awt.Dimension var4 = null;
        int var5 = 0;
        java.awt.Container var6 = null;
        int stackIn_23_0 = 0;
        int stackIn_114_0 = 0;
        int stackIn_115_0 = 0;
        int stackIn_116_0 = 0;
        int stackIn_117_0 = 0;
        int stackIn_117_1 = 0;
        int stackIn_148_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_113_0 = 0;
        int stackOut_112_0 = 0;
        int stackOut_114_0 = 0;
        int stackOut_116_0 = 0;
        int stackOut_116_1 = 0;
        int stackOut_115_0 = 0;
        int stackOut_115_1 = 0;
        int stackOut_147_0 = 0;
        int stackOut_146_0 = 0;
        L0: {
          var5 = HostileSpawn.field_I ? 1 : 0;
          if (ie.field_c == null) {
            break L0;
          } else {
            L1: {
              if (null != wa.field_q) {
                break L1;
              } else {
                var6 = fg.b((byte) -31);
                var4 = var6.getSize();
                ie.field_c.a(var4.height, 1, var4.width);
                break L1;
              }
            }
            ie.field_c.a(true);
            break L0;
          }
        }
        L2: {
          sb.a(-113);
          se.b(false);
          if (cm.b((byte) -97)) {
            break L2;
          } else {
            if (11 != fa.field_c) {
              vf.j(param1 + -9769);
              break L2;
            } else {
              break L2;
            }
          }
        }
        L3: {
          if (null == h.field_b) {
            break L3;
          } else {
            ll.field_c = h.field_b.a((byte) 60);
            break L3;
          }
        }
        L4: {
          if (kl.b(50)) {
            L5: {
              var3 = 1200 * eh.a((byte) -63);
              if (((d) this).field_w) {
                break L5;
              } else {
                if (el.c(9) <= var3) {
                  break L4;
                } else {
                  if (mf.a(36) <= var3) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
            }
            ((d) this).field_w = false;
            le.c((byte) 68);
            cf.b(true);
            la.a(2, vf.field_G, (byte) 110);
            qg.b((byte) 111);
            i.field_d = true;
            dh.field_c = hn.a((byte) 80) + 15000L;
            break L4;
          } else {
            break L4;
          }
        }
        L6: {
          L7: {
            if ((rj.field_H ^ -1) == 0) {
              break L7;
            } else {
              if (0 == rj.field_H) {
                break L7;
              } else {
                break L6;
              }
            }
          }
          L8: {
            if ((rj.field_H ^ -1) != 0) {
              stackOut_22_0 = 0;
              stackIn_23_0 = stackOut_22_0;
              break L8;
            } else {
              stackOut_21_0 = 1;
              stackIn_23_0 = stackOut_21_0;
              break L8;
            }
          }
          L9: {
            var3 = stackIn_23_0;
            rj.field_H = ud.a(param1 ^ 9768);
            if (var3 == 0) {
              break L9;
            } else {
              if (rj.field_H != -1) {
                break L9;
              } else {
                if (-12 != fa.field_c) {
                  break L9;
                } else {
                  if (ig.c(false)) {
                    break L9;
                  } else {
                    ba.e((byte) -104);
                    break L9;
                  }
                }
              }
            }
          }
          if (-1 == rj.field_H) {
            break L6;
          } else {
            if (rj.field_H != -1) {
              dh.field_c = 15000L + hn.a((byte) 80);
              break L6;
            } else {
              break L6;
            }
          }
        }
        L10: {
          if (rj.field_H == -1) {
            break L10;
          } else {
            if (0 != rj.field_H) {
              if (-11 <= pb.field_Kb) {
                if (-11 >= (fa.field_c ^ -1)) {
                  L11: {
                    cf.b(true);
                    if (3 != rj.field_H) {
                      if (4 != rj.field_H) {
                        if (2 != rj.field_H) {
                          if ((rj.field_H ^ -1) == -6) {
                            la.a(5, hd.field_q, (byte) 83);
                            break L11;
                          } else {
                            la.a(256, qb.field_m, (byte) 48);
                            break L11;
                          }
                        } else {
                          la.a(256, jg.field_g, (byte) 84);
                          break L11;
                        }
                      } else {
                        la.a(256, kd.field_A, (byte) 48);
                        break L11;
                      }
                    } else {
                      la.a(256, oh.field_b, (byte) 110);
                      break L11;
                    }
                  }
                  i.field_d = true;
                  break L10;
                } else {
                  break L10;
                }
              } else {
                if (rj.field_H != -4) {
                  if (-5 == rj.field_H) {
                    ((d) this).a(3904, "js5io");
                    break L10;
                  } else {
                    if ((rj.field_H ^ -1) != -3) {
                      if (5 == rj.field_H) {
                        ((d) this).a(3904, "outofdate");
                        break L10;
                      } else {
                        ((d) this).a(3904, "js5connect");
                        break L10;
                      }
                    } else {
                      ((d) this).a(3904, "js5connect_full");
                      break L10;
                    }
                  }
                } else {
                  ((d) this).a(3904, "js5crc");
                  break L10;
                }
              }
            } else {
              break L10;
            }
          }
        }
        L12: {
          if (param1 == 9768) {
            break L12;
          } else {
            ((d) this).a(7, true, -106, -37, -90, true, 83, 74);
            break L12;
          }
        }
        L13: {
          L14: {
            L15: {
              if (rj.field_H == -1) {
                break L15;
              } else {
                if (rj.field_H != 0) {
                  break L14;
                } else {
                  break L15;
                }
              }
            }
            if (ig.c(false)) {
              break L14;
            } else {
              if (rj.field_H != 0) {
                break L13;
              } else {
                if (ig.c(false)) {
                  break L13;
                } else {
                  tf.field_d = false;
                  break L13;
                }
              }
            }
          }
          if ((hn.a((byte) 80) ^ -1L) <= (dh.field_c ^ -1L)) {
            i.field_d = false;
            if (rj.field_H != -1) {
              if (rj.field_H != 0) {
                rj.field_H = -1;
                lg.c(true);
                if (rj.field_H != 0) {
                  break L13;
                } else {
                  if (ig.c(false)) {
                    break L13;
                  } else {
                    tf.field_d = false;
                    break L13;
                  }
                }
              } else {
                if (rj.field_H != 0) {
                  break L13;
                } else {
                  if (ig.c(false)) {
                    break L13;
                  } else {
                    tf.field_d = false;
                    break L13;
                  }
                }
              }
            } else {
              if (rj.field_H != 0) {
                break L13;
              } else {
                if (ig.c(false)) {
                  break L13;
                } else {
                  tf.field_d = false;
                  break L13;
                }
              }
            }
          } else {
            if (rj.field_H != 0) {
              break L13;
            } else {
              if (ig.c(false)) {
                break L13;
              } else {
                tf.field_d = false;
                break L13;
              }
            }
          }
        }
        L16: {
          if (pb.field_Kb == 0) {
            if (!fg.a(32)) {
              break L16;
            } else {
              pb.field_Kb = 1;
              break L16;
            }
          } else {
            break L16;
          }
        }
        L17: {
          if ((pb.field_Kb ^ -1) == -2) {
            L18: {
              if (nl.field_c != 0) {
                vc.field_d = qm.b(1, tb.field_P);
                break L18;
              } else {
                break L18;
              }
            }
            im.field_c = nj.a(param1 ^ 9811, ck.field_e, true, false, 1);
            mb.field_m = nj.a(96, uh.field_k, true, false, 1);
            ll.field_b = nj.a(114, nm.field_i, true, false, 1);
            wd.field_a = im.field_c;
            gb.field_a = mb.field_m;
            pb.field_Kb = 2;
            break L17;
          } else {
            break L17;
          }
        }
        L19: {
          if (pb.field_Kb == 2) {
            L20: {
              if (vc.field_d == null) {
                break L20;
              } else {
                if (!vc.field_d.a(-15879)) {
                  break L20;
                } else {
                  if (vc.field_d.a("", (byte) 124)) {
                    if (vc.field_d.a(param1 ^ -14784, "")) {
                      dl.a(param1 + -9839, vc.field_d);
                      vc.field_d = null;
                      ql.f(param1 ^ 14668);
                      break L20;
                    } else {
                      break L20;
                    }
                  } else {
                    vc.field_d = null;
                    break L20;
                  }
                }
              }
            }
            if (vc.field_d != null) {
              break L19;
            } else {
              pb.field_Kb = 3;
              break L19;
            }
          } else {
            break L19;
          }
        }
        L21: {
          if (pb.field_Kb != 3) {
            break L21;
          } else {
            if (!ca.a(ll.field_b, mb.field_m, im.field_c, param1 + -9768)) {
              break L21;
            } else {
              if (jh.a(-95, ll.field_b)) {
                L22: {
                  L23: {
                    fh.a(1);
                    ni.c(-30074);
                    wi.field_c = l.field_e;
                    ka.field_r = false;
                    lc.a(wc.field_g, ll.field_b, im.field_c, 12789, mb.field_m);
                    if (rd.field_d) {
                      break L23;
                    } else {
                      if (ti.field_d == null) {
                        break L22;
                      } else {
                        break L23;
                      }
                    }
                  }
                  L24: {
                    if (rd.field_d) {
                      stackOut_113_0 = 0;
                      stackIn_114_0 = stackOut_113_0;
                      break L24;
                    } else {
                      stackOut_112_0 = 1;
                      stackIn_114_0 = stackOut_112_0;
                      break L24;
                    }
                  }
                  L25: {
                    stackOut_114_0 = stackIn_114_0;
                    stackIn_116_0 = stackOut_114_0;
                    stackIn_115_0 = stackOut_114_0;
                    if (rd.field_d) {
                      stackOut_116_0 = stackIn_116_0;
                      stackOut_116_1 = 0;
                      stackIn_117_0 = stackOut_116_0;
                      stackIn_117_1 = stackOut_116_1;
                      break L25;
                    } else {
                      stackOut_115_0 = stackIn_115_0;
                      stackOut_115_1 = 1;
                      stackIn_117_0 = stackOut_115_0;
                      stackIn_117_1 = stackOut_115_1;
                      break L25;
                    }
                  }
                  ac.a(stackIn_117_0 != 0, stackIn_117_1 != 0, -1, ti.field_d);
                  break L22;
                }
                L26: {
                  if (kj.field_b) {
                    ci.a(-1);
                    break L26;
                  } else {
                    break L26;
                  }
                }
                L27: {
                  if (hf.field_c == null) {
                    hf.field_c = wj.e((byte) -98);
                    vc.field_b = uj.e(1);
                    break L27;
                  } else {
                    break L27;
                  }
                }
                nm.a(vc.field_b, ll.field_b, param1 + -9887, hf.field_c);
                mb.field_m = null;
                im.field_c = null;
                ll.field_b = null;
                bm.a((byte) -113, (java.applet.Applet) this);
                ql.f(8036);
                pb.field_Kb = 10;
                break L21;
              } else {
                break L21;
              }
            }
          }
        }
        L28: {
          if (-11 == (pb.field_Kb ^ -1)) {
            L29: {
              if (0 == nl.field_c) {
                break L29;
              } else {
                uh.field_m = qm.b(param1 ^ 9769, ll.field_d);
                break L29;
              }
            }
            pb.field_Kb = 11;
            break L28;
          } else {
            break L28;
          }
        }
        L30: {
          if (11 != pb.field_Kb) {
            break L30;
          } else {
            L31: {
              if (uh.field_m == null) {
                break L31;
              } else {
                L32: {
                  if (!uh.field_m.a(-15879)) {
                    break L32;
                  } else {
                    if (!uh.field_m.e(param1 + -9768)) {
                      break L32;
                    } else {
                      break L31;
                    }
                  }
                }
                gj.a(param1 ^ 9788, md.a(ad.field_b, uh.field_m, u.field_j, (byte) -69), 0.0f);
                break L30;
              }
            }
            pb.field_Kb = 12;
            ri.field_m = true;
            break L30;
          }
        }
        L33: {
          if ((pb.field_Kb ^ -1) == -13) {
            if (!ri.field_m) {
              pb.field_Kb = 13;
              break L33;
            } else {
              break L33;
            }
          } else {
            break L33;
          }
        }
        L34: {
          if ((pb.field_Kb ^ -1) != -14) {
            break L34;
          } else {
            L35: {
              var3 = 1;
              if (dd.field_i != null) {
                L36: {
                  if (!dd.field_i.a((byte) -52)) {
                    stackOut_147_0 = 0;
                    stackIn_148_0 = stackOut_147_0;
                    break L36;
                  } else {
                    stackOut_146_0 = 1;
                    stackIn_148_0 = stackOut_146_0;
                    break L36;
                  }
                }
                var3 = stackIn_148_0;
                gj.a(20, dd.field_i.field_b, dd.field_i.field_f);
                break L35;
              } else {
                break L35;
              }
            }
            if (var3 != 0) {
              pb.field_Kb = 20;
              break L34;
            } else {
              break L34;
            }
          }
        }
        L37: {
          if (param0) {
            break L37;
          } else {
            if (ih.field_s) {
              v.a(82, se.field_h);
              ((d) this).b(-67);
              ea.a(se.field_h, 0);
              break L37;
            } else {
              break L37;
            }
          }
        }
        L38: {
          if (!mk.field_O[8]) {
            break L38;
          } else {
            vk.c(8);
            break L38;
          }
        }
    }

    private final void e(byte param0) {
        int var2 = -70 % ((param0 - 45) / 41);
        mk.field_O[4] = true;
    }

    final void a(String param0, int param1, int param2) {
        this.a(param2, param0, 640, param1, (byte) -55);
    }

    protected d() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = 0;
    }
}
