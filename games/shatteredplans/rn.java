/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rn implements Runnable {
    static String field_a;
    static int field_b;
    static String field_g;
    static String field_e;
    private db field_c;
    private Thread field_h;
    private boolean field_f;
    int field_d;

    final static void b(byte param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = ShatteredPlansClient.field_F ? 1 : 0;
        ra.a(-111);
        vm.field_Jb = id.a(2, hp.field_n, "intro", "intro1_1");
        w.field_D = id.a(param0 + -48, hp.field_n, "intro", "intro1_2");
        db.field_a = id.a(param0 ^ 48, hp.field_n, "intro", "intro1_3");
        sr.field_F = id.a(param0 + -48, hp.field_n, "intro", "intro1_flash");
        oi.field_d = id.a(2, hp.field_n, "intro", "intro1_glow");
        tp.field_e = id.a(2, hp.field_n, "intro", "intro1_glow_fg");
        db.field_a.e();
        ne.a(0, gf.field_b, (byte) 24, 0, 0, 64, gf.field_k);
        w.field_D.e();
        ne.a(0, gf.field_b, (byte) 24, 0, 0, 128, gf.field_k);
        vm.field_Jb.e();
        ib.a(0, 0, gf.field_k, 0, gf.field_b, param0 + 24024);
        bi discarded$0 = id.a(2, hp.field_n, "intro", "intro2_glow");
        ac.field_s = id.a(2, hp.field_n, "intro", "intro2_earth");
        oe.field_c = id.a(2, hp.field_n, "intro", "intro2_clouds");
        ja.a(-174137048, ac.field_s.field_z / 2, ac.field_s, ac.field_s.field_w / 4);
        ja.a(param0 ^ -174137062, oe.field_c.field_z / 2, oe.field_c, oe.field_c.field_w / 4);
        ds.field_b = new bi(640, 430);
        ds.field_b.e();
        for (var1 = 1; -65 < (var1 ^ -1); var1++) {
            var2 = (int)(20.0 * Math.log((double)(63.0f / (float)var1)) / Math.log(2.0));
            gf.g(320, 527, var2 + 400, (var1 << 1448352642) * 65793);
        }
        gf.b(4, 4, 0, 0, gf.field_b, gf.field_k);
        ma.field_r = new bi(640, 624 + -ac.field_s.field_x);
        ma.field_r.e();
        for (var1 = 254; (var1 ^ -1) <= -2; var1--) {
            var2 = (int)(Math.log((double)(254.0f / (float)var1)) * 40.0 / Math.log(2.0));
            ac.field_s.e(var2 + -5, var2 - ac.field_s.field_x, var1 * 65793);
        }
        va.field_e = id.a(2, hp.field_n, "intro", "intro3_stars");
        q.field_Cb = id.a(2, hp.field_n, "intro", "intro3_citybg");
        mm.field_o = id.a(param0 + -48, hp.field_n, "intro", "intro3_cityfg");
        ch.field_c = id.a(2, hp.field_n, "intro", "intro3_crater");
        var1 = q.field_Cb.field_z;
        var2 = q.field_Cb.field_w + 60;
        he.field_h = new bi(var1, var2);
        for (var3 = 0; (var2 + -60) * var1 > var3; var3++) {
            he.field_h.field_B[var3 - -(var1 * 60)] = q.field_Cb.field_B[var3];
        }
        var1 = mm.field_o.field_z;
        he.field_h.field_o = q.field_Cb.field_o;
        he.field_h.field_t = q.field_Cb.field_t;
        he.field_h.field_x = -60 + q.field_Cb.field_x;
        var2 = 60 + mm.field_o.field_w;
        he.field_h.field_p = 60 + q.field_Cb.field_p;
        we.field_f = new bi(var1, var2);
        for (var3 = 0; (var2 + -60) * var1 > var3; var3++) {
            we.field_f.field_B[var1 * 60 + var3] = mm.field_o.field_B[var3];
        }
        we.field_f.field_t = mm.field_o.field_t;
        we.field_f.field_p = mm.field_o.field_p + 60;
        we.field_f.field_x = -60 + mm.field_o.field_x;
        we.field_f.field_o = mm.field_o.field_o;
        he.field_h.e();
        if (param0 != 50) {
            return;
        }
        gf.b(60, 60, 0, 0, he.field_h.field_z, he.field_h.field_w);
        we.field_f.e();
        gf.b(60, 60, 0, 0, we.field_f.field_z, we.field_f.field_w);
        ks.field_j = va.field_e.g();
        ks.field_j.d();
        for (var3 = 0; var3 < ks.field_j.field_B.length; var3++) {
            var4 = ks.field_j.field_B[var3];
            var5 = 8323072 & var4 >> -910109503;
            var6 = (var5 >> 520793129 & 32512) + (var4 & 65280);
            var6 = var6 * 3 >> -599854143;
            if ((var6 ^ -1) >= -65281) {
                var6 = var6 & 65280;
            } else {
                var6 = 65280;
            }
            var7 = 255 & var4;
            ks.field_j.field_B[var3] = ee.a(ee.a(var6, var5), var7);
        }
        qq.field_n = ac.field_s.c();
        uo.a((byte) 110, qq.field_n, 32768);
        var1 = qq.field_n.field_z;
        var2 = qq.field_n.field_z - -120;
        tf.field_b = new bi(var1, var2);
        tf.field_b.e();
        qq.field_n.e(0, 120, 4259648);
        gf.b(120, 120, 0, 0, var1, var2);
        cg.i(0);
        jn.field_a = true;
    }

    final ak a(int param0, ua param1, int param2) {
        ak var4 = null;
        Object var5 = null;
        ak var6 = null;
        Throwable var7 = null;
        int var8 = 0;
        ak stackIn_7_0 = null;
        ak stackOut_6_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = ShatteredPlansClient.field_F ? 1 : 0;
                    var4 = new ak();
                    var4.field_y = param2;
                    var5 = (Object) (Object) ((rn) this).field_c;
                    // monitorenter ((rn) this).field_c
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var6 = (ak) (Object) ((rn) this).field_c.c(-128);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var6 == null) {
                            statePc = 9;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if ((var6.field_l ^ -1L) != ((long)param0 ^ -1L)) {
                            statePc = 8;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (param1 != var6.field_B) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if ((var6.field_y ^ -1) != -3) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var4.field_w = var6.field_w;
                        var4.field_u = false;
                        // monitorexit var5
                        stackOut_6_0 = (ak) var4;
                        stackIn_7_0 = stackOut_6_0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 7: {
                    return stackIn_7_0;
                }
                case 8: {
                    try {
                        var6 = (ak) (Object) ((rn) this).field_c.b(32);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        // monitorexit var5
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var7 = caughtException;
                        // monitorexit var5
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 12: {
                    throw (RuntimeException) (Object) var7;
                }
                case 13: {
                    var4.field_w = param1.a(param0, 86);
                    var4.field_u = false;
                    var4.field_q = true;
                    return var4;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(boolean param0) {
        field_a = null;
        if (!param0) {
            return;
        }
        field_g = null;
        field_e = null;
    }

    public final void run() {
        try {
            InterruptedException interruptedException = null;
            Object var2 = null;
            Exception var2_ref = null;
            Throwable var4 = null;
            int var5 = 0;
            Object var6 = null;
            ak var7 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var5 = ShatteredPlansClient.field_F ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        if (((rn) this).field_f) {
                            statePc = 21;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        var2 = (Object) (Object) ((rn) this).field_c;
                        // monitorenter ((rn) this).field_c
                        statePc = 3;
                        continue stateLoop;
                    }
                    case 3: {
                        try {
                            var7 = (ak) (Object) ((rn) this).field_c.a(-49);
                            if (var7 != null) {
                                statePc = 10;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            ((Object) (Object) ((rn) this).field_c).wait();
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = (stateCaught_5 instanceof InterruptedException ? 7 : 12);
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            interruptedException = (InterruptedException) (Object) caughtException;
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            // monitorexit var2
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            ((rn) this).field_d = ((rn) this).field_d - 1;
                            // monitorexit var2
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            var4 = caughtException;
                            // monitorexit var2
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        throw (RuntimeException) (Object) var4;
                    }
                    case 14: {
                        try {
                            if (var7.field_y == 2) {
                                statePc = 18;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            if (3 == var7.field_y) {
                                statePc = 17;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            var7.field_u = false;
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            var7.field_w = var7.field_B.a((int)var7.field_l, 119);
                            var7.field_u = false;
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            boolean discarded$1 = var7.field_B.a(var7.field_w.length, (int)var7.field_l, var7.field_w, 2);
                            var7.field_u = false;
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        var2_ref = (Exception) (Object) caughtException;
                        var6 = null;
                        jq.a(-29901, (Throwable) (Object) var2_ref, (String) null);
                        var7.field_u = false;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 21: {
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

    private final void a(ak param0, int param1) {
        Object var3 = null;
        Throwable var4 = null;
        Object var5 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = (Object) (Object) ((rn) this).field_c;
                    // monitorenter ((rn) this).field_c
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        ((rn) this).field_c.a((df) (Object) param0, 32);
                        ((rn) this).field_d = ((rn) this).field_d + 1;
                        if (param1 == 1048576) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var5 = null;
                        this.a((ak) null, 31);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        ((Object) (Object) ((rn) this).field_c).notifyAll();
                        // monitorexit var3
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var4 = caughtException;
                        // monitorexit var3
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 6: {
                    throw (RuntimeException) (Object) var4;
                }
                case 7: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0) {
        if (vr.field_c == gr.field_o) {
          return;
        } else {
          L0: {
            if (nh.a((byte) -92, vr.field_c)) {
              mj.field_Hb[vr.field_c].g((byte) 119);
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            cj.field_x = cs.field_i;
            eh.field_Q = 0;
            vr.field_c = gr.field_o;
            if (gr.field_o == -3) {
              qf.a((byte) -126);
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (0 == gr.field_o) {
              if (!u.field_b.a(hk.field_nb, (byte) -23)) {
                jo.a(param0 + -1015809, hk.field_nb, true, 1048576);
                break L2;
              } else {
                break L2;
              }
            } else {
              break L2;
            }
          }
          L3: {
            if (5 != (gr.field_o ^ -1)) {
              break L3;
            } else {
              js.field_f.h(9, 255);
              md.field_Q = true;
              gr.field_o = vr.field_c;
              break L3;
            }
          }
          L4: {
            if (!lg.field_b) {
              break L4;
            } else {
              L5: {
                if (null == ce.field_x) {
                  if (null != in.field_g) {
                    if (in.field_g.field_Y == null) {
                      break L5;
                    } else {
                      in.field_g.field_Y.i((byte) -47);
                      break L5;
                    }
                  } else {
                    if (null == in.field_g) {
                      break L5;
                    } else {
                      if (in.field_g.field_Y == null) {
                        break L5;
                      } else {
                        in.field_g.field_Y.i((byte) -47);
                        break L5;
                      }
                    }
                  }
                } else {
                  if (null == in.field_g) {
                    break L5;
                  } else {
                    if (in.field_g.field_Y == null) {
                      break L5;
                    } else {
                      in.field_g.field_Y.i((byte) -47);
                      break L5;
                    }
                  }
                }
              }
              lg.field_b = false;
              ce.field_x = null;
              in.field_g = null;
              break L4;
            }
          }
          L6: {
            if (uo.field_e) {
              tq.field_b = null;
              jq.field_a = new pf();
              vq.field_a = 0;
              uo.field_e = false;
              break L6;
            } else {
              break L6;
            }
          }
          if (param0 == 1048576) {
            L7: {
              if (!ak.field_A) {
                break L7;
              } else {
                rh.a((byte) -120);
                ec.e((byte) -66);
                an.a(true);
                ak.field_A = false;
                break L7;
              }
            }
            return;
          } else {
            return;
          }
        }
    }

    final ak a(int param0, ua param1, int param2, byte[] param3) {
        ak var5 = new ak();
        if (param2 >= -28) {
            Object var6 = null;
            ak discarded$0 = ((rn) this).a(9, (ua) null, -105, (byte[]) null);
        }
        var5.field_q = false;
        var5.field_y = 2;
        var5.field_B = param1;
        var5.field_l = (long)param0;
        var5.field_w = param3;
        this.a(var5, 1048576);
        return var5;
    }

    final static void a(int param0, bc param1, boolean param2, bc param3, bc param4) {
        wh.field_a = tf.a("", -12179);
        if (param0 != 624) {
            rn.b((byte) -62);
        }
        wh.field_a.a(false, 37);
        vl.a((byte) 87, param1, param4, param3);
        jg.a(0);
        ee.field_l = oj.field_Fb;
        fj.field_s = oj.field_Fb;
    }

    final ak a(ua param0, int param1, int param2) {
        if (param2 != 13514) {
            return null;
        }
        ak var4 = new ak();
        var4.field_q = false;
        var4.field_B = param0;
        var4.field_y = 3;
        var4.field_l = (long)param1;
        this.a(var4, 1048576);
        return var4;
    }

    final void a(byte param0) {
        ((rn) this).field_f = true;
        Object var2_ref_Object = (Object) (Object) ((rn) this).field_c;
        // monitorenter ((rn) this).field_c
        ((Object) (Object) ((rn) this).field_c).notifyAll();
        // monitorexit var2_ref_Object
        int var2 = -52 % ((param0 - -10) / 61);
        try {
            if (false) throw (InterruptedException) null;
            ((rn) this).field_h.join();
        } catch (InterruptedException interruptedException) {
        }
        ((rn) this).field_h = null;
    }

    final static void a(vk param0, int param1, int param2, bc param3) {
        aj.field_c = param1 * tj.a(param2 ^ param2) / 1000;
        jc.a(param2 + -1102, param3);
        oj.a(param2 ^ 902, param3);
        qr.a(param3, (byte) 56);
        eq.d((byte) -47);
        r.b((byte) -112);
        js.field_j = -aj.field_c + 0;
    }

    rn(qb param0) {
        ((rn) this).field_c = new db();
        ((rn) this).field_f = false;
        ((rn) this).field_d = 0;
        pb var2 = param0.a(true, 5, (Runnable) this);
        while (-1 == (var2.field_d ^ -1)) {
            jb.a((byte) -107, 10L);
        }
        if (var2.field_d == 2) {
            throw new RuntimeException();
        }
        ((rn) this).field_h = (Thread) var2.field_e;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Go Back";
        field_g = "Shortcut Reference";
        field_e = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
    }
}
