/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class j implements Runnable {
    volatile fj[] field_g;
    vf field_c;
    static m field_h;
    static long field_f;
    static String field_e;
    volatile boolean field_b;
    static String field_a;
    static ma field_d;
    volatile boolean field_i;

    final static int a(int param0, int param1, boolean param2, int param3, pf param4, String param5, pf param6) {
        String var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        int var10 = 0;
        String var11_ref_String = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        String var14 = null;
        CharSequence var15 = null;
        sb stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        sb stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        sb stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        String stackIn_11_2 = null;
        sb stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        sb stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        sb stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        String stackIn_14_2 = null;
        sb stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        sb stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        String stackOut_10_2 = null;
        sb stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        String stackOut_9_2 = null;
        sb stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        sb stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        String stackOut_13_2 = null;
        sb stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        String stackOut_12_2 = null;
        L0: {
          var13 = MinerDisturbance.field_ab;
          var14 = param6.a((byte) 69);
          if (param1 <= -34) {
            break L0;
          } else {
            field_e = null;
            break L0;
          }
        }
        L1: {
          var8 = param4.a((byte) 80);
          if (null != ci.field_i) {
            break L1;
          } else {
            if (ed.a(false, (byte) 38)) {
              break L1;
            } else {
              return -1;
            }
          }
        }
        L2: {
          if (qd.field_Q == cm.field_p) {
            L3: {
              mf.field_a = null;
              sn.field_c.field_o = 0;
              if (param5 != null) {
                L4: {
                  var9 = 0;
                  rf.field_c.field_o = 0;
                  if (!param2) {
                    break L4;
                  } else {
                    var9 = var9 | 1;
                    break L4;
                  }
                }
                L5: {
                  rf.field_c.a((byte) 106, dk.field_a.nextInt());
                  rf.field_c.a((byte) 96, dk.field_a.nextInt());
                  rf.field_c.a(8, var14);
                  rf.field_c.a(8, var8);
                  var15 = (CharSequence) (Object) param5;
                  rf.field_c.a(8, tk.a(732, var15));
                  rf.field_c.b((byte) 123, param3);
                  rf.field_c.c(param0, 25564);
                  rf.field_c.c(var9, 25564);
                  sn.field_c.c(18, 25564);
                  sn.field_c.field_o = sn.field_c.field_o + 2;
                  var10 = sn.field_c.field_o;
                  var11_ref_String = ag.a(bm.c(-104), true);
                  if (var11_ref_String == null) {
                    var11_ref_String = "";
                    break L5;
                  } else {
                    break L5;
                  }
                }
                sn.field_c.b(23446, var11_ref_String);
                jg.a(kc.field_b, -121, rf.field_c, ph.field_g, (sb) (Object) sn.field_c);
                sn.field_c.b(-var10 + sn.field_c.field_o, -506270856);
                break L3;
              } else {
                L6: {
                  rf.field_c.field_o = 0;
                  rf.field_c.a((byte) 124, dk.field_a.nextInt());
                  rf.field_c.a((byte) 127, dk.field_a.nextInt());
                  stackOut_8_0 = rf.field_c;
                  stackOut_8_1 = 8;
                  stackIn_10_0 = stackOut_8_0;
                  stackIn_10_1 = stackOut_8_1;
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  if (!param6.b((byte) 112)) {
                    stackOut_10_0 = (sb) (Object) stackIn_10_0;
                    stackOut_10_1 = stackIn_10_1;
                    stackOut_10_2 = "";
                    stackIn_11_0 = stackOut_10_0;
                    stackIn_11_1 = stackOut_10_1;
                    stackIn_11_2 = stackOut_10_2;
                    break L6;
                  } else {
                    stackOut_9_0 = (sb) (Object) stackIn_9_0;
                    stackOut_9_1 = stackIn_9_1;
                    stackOut_9_2 = (String) var14;
                    stackIn_11_0 = stackOut_9_0;
                    stackIn_11_1 = stackOut_9_1;
                    stackIn_11_2 = stackOut_9_2;
                    break L6;
                  }
                }
                L7: {
                  ((sb) (Object) stackIn_11_0).a(stackIn_11_1, stackIn_11_2);
                  stackOut_11_0 = rf.field_c;
                  stackOut_11_1 = 8;
                  stackIn_13_0 = stackOut_11_0;
                  stackIn_13_1 = stackOut_11_1;
                  stackIn_12_0 = stackOut_11_0;
                  stackIn_12_1 = stackOut_11_1;
                  if (param4.b((byte) 88)) {
                    stackOut_13_0 = (sb) (Object) stackIn_13_0;
                    stackOut_13_1 = stackIn_13_1;
                    stackOut_13_2 = (String) var8;
                    stackIn_14_0 = stackOut_13_0;
                    stackIn_14_1 = stackOut_13_1;
                    stackIn_14_2 = stackOut_13_2;
                    break L7;
                  } else {
                    stackOut_12_0 = (sb) (Object) stackIn_12_0;
                    stackOut_12_1 = stackIn_12_1;
                    stackOut_12_2 = "";
                    stackIn_14_0 = stackOut_12_0;
                    stackIn_14_1 = stackOut_12_1;
                    stackIn_14_2 = stackOut_12_2;
                    break L7;
                  }
                }
                ((sb) (Object) stackIn_14_0).a(stackIn_14_1, stackIn_14_2);
                sn.field_c.c(16, 25564);
                sn.field_c.field_o = sn.field_c.field_o + 1;
                var9 = sn.field_c.field_o;
                jg.a(kc.field_b, -127, rf.field_c, ph.field_g, (sb) (Object) sn.field_c);
                sn.field_c.g(-1, sn.field_c.field_o - var9);
                break L3;
              }
            }
            bk.a((byte) -114, -1);
            qd.field_Q = jn.field_r;
            break L2;
          } else {
            break L2;
          }
        }
        L8: {
          if (qd.field_Q != jn.field_r) {
            break L8;
          } else {
            if (ta.a(0, 1)) {
              L9: {
                var9 = kj.field_a.d((byte) -54);
                kj.field_a.field_o = 0;
                if ((var9 ^ -1) > -101) {
                  break L9;
                } else {
                  if (105 >= var9) {
                    qd.field_Q = lm.field_M;
                    vh.field_i = new String[var9 - 100];
                    break L8;
                  } else {
                    break L9;
                  }
                }
              }
              if (248 == var9) {
                ri.a((byte) -125, bm.c(-99));
                nf.field_g = d.field_a;
                si.a(-98);
                ek.field_c = false;
                return var9;
              } else {
                if (-100 != (var9 ^ -1)) {
                  rj.field_d = -1;
                  oj.field_K = var9;
                  qd.field_Q = aa.field_l;
                  break L8;
                } else {
                  boolean discarded$1 = ta.a(0, hl.a(-92));
                  mf.field_a = new Boolean(bh.a((sb) (Object) kj.field_a, -29320));
                  kj.field_a.field_o = 0;
                  break L8;
                }
              }
            } else {
              break L8;
            }
          }
        }
        L10: {
          if (lm.field_M != qd.field_Q) {
            break L10;
          } else {
            var9 = 2;
            if (!ta.a(0, var9)) {
              break L10;
            } else {
              var10 = kj.field_a.e(-25);
              kj.field_a.field_o = 0;
              if (!ta.a(0, var10)) {
                break L10;
              } else {
                var11 = vh.field_i.length;
                var12 = 0;
                L11: while (true) {
                  if (var12 >= var11) {
                    si.a(-34);
                    ek.field_c = false;
                    return var11 + 100;
                  } else {
                    vh.field_i[var12] = kj.field_a.g(-1);
                    var12++;
                    continue L11;
                  }
                }
              }
            }
          }
        }
        L12: {
          if (qd.field_Q == aa.field_l) {
            if (!kj.b(-9319)) {
              break L12;
            } else {
              L13: {
                if (-256 != (oj.field_K ^ -1)) {
                  nf.field_g = kj.field_a.a(false);
                  break L13;
                } else {
                  var9_ref_String = kj.field_a.j(81);
                  if (var9_ref_String == null) {
                    break L13;
                  } else {
                    nc.a(bm.c(-76), var9_ref_String, (byte) 115);
                    break L13;
                  }
                }
              }
              si.a(-82);
              ek.field_c = false;
              return oj.field_K;
            }
          } else {
            break L12;
          }
        }
        L14: {
          if (ci.field_i == null) {
            if (!ek.field_c) {
              var9 = jc.field_E;
              jc.field_E = ic.field_h;
              ek.field_c = true;
              ic.field_h = var9;
              break L14;
            } else {
              L15: {
                if (qa.a(-112) > 30000L) {
                  nf.field_g = oi.field_K;
                  break L15;
                } else {
                  nf.field_g = l.field_a;
                  break L15;
                }
              }
              ek.field_c = false;
              return 249;
            }
          } else {
            break L14;
          }
        }
        return -1;
    }

    public static void a(int param0) {
        field_e = null;
        field_a = null;
        field_d = null;
        if (param0 < 55) {
            field_e = null;
        }
    }

    public final void run() {
        int var1_int = 0;
        fj var2 = null;
        int var4 = MinerDisturbance.field_ab;
        ((j) this).field_i = true;
        try {
            while (!((j) this).field_b) {
                for (var1_int = 0; var1_int < 2; var1_int++) {
                    var2 = ((j) this).field_g[var1_int];
                    if (var2 != null) {
                        var2.e();
                    }
                }
                gf.a(10L, -10309);
                Object var5 = null;
                jk.a(-23765, ((j) this).field_c, (Object) null);
            }
        } catch (Exception exception) {
            Object var6 = null;
            di.a((Throwable) (Object) exception, 1, (String) null);
        } finally {
            ((j) this).field_i = false;
        }
    }

    final static int a(int param0, int param1) {
        int var2 = -13 % ((param1 - 7) / 38);
        param0 = param0 & 8191;
        if (param0 < 4096) {
            return 2048 > param0 ? ta.field_g[2048 - param0] : -ta.field_g[-2048 + param0];
        }
        return param0 >= 6144 ? ta.field_g[param0 - 6144] : -ta.field_g[6144 - param0];
    }

    final static boolean a(byte param0) {
        if (param0 != -110) {
            field_a = null;
        }
        return ci.field_e == bd.field_h ? true : false;
    }

    j() {
        ((j) this).field_g = new fj[2];
        ((j) this).field_b = false;
        ((j) this).field_i = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = null;
        field_e = "Mining map: Displays the map of the volcano.";
        field_a = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
    }
}
