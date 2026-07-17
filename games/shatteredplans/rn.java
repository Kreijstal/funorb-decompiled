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

    final static void b() {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var8 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            ra.a(-111);
            vm.field_Jb = id.a(2, hp.field_n, "intro", "intro1_1");
            w.field_D = id.a(-110, hp.field_n, "intro", "intro1_2");
            db.field_a = id.a(-14, hp.field_n, "intro", "intro1_3");
            sr.field_F = id.a(-110, hp.field_n, "intro", "intro1_flash");
            oi.field_d = id.a(2, hp.field_n, "intro", "intro1_glow");
            tp.field_e = id.a(2, hp.field_n, "intro", "intro1_glow_fg");
            db.field_a.e();
            ne.a(0, gf.field_b, (byte) 24, 0, 0, 64, gf.field_k);
            w.field_D.e();
            ne.a(0, gf.field_b, (byte) 24, 0, 0, 128, gf.field_k);
            vm.field_Jb.e();
            int discarded$2 = 23962;
            ib.a(0, 0, gf.field_k, 0, gf.field_b);
            bi discarded$3 = id.a(2, hp.field_n, "intro", "intro2_glow");
            ac.field_s = id.a(2, hp.field_n, "intro", "intro2_earth");
            oe.field_c = id.a(2, hp.field_n, "intro", "intro2_clouds");
            ja.a(-174137048, ac.field_s.field_z / 2, ac.field_s, ac.field_s.field_w / 4);
            ja.a(174137048, oe.field_c.field_z / 2, oe.field_c, oe.field_c.field_w / 4);
            ds.field_b = new bi(640, 430);
            ds.field_b.e();
            var1_int = 1;
            L1: while (true) {
              if (var1_int >= 64) {
                gf.b(4, 4, 0, 0, gf.field_b, gf.field_k);
                ma.field_r = new bi(640, 624 + -ac.field_s.field_x);
                ma.field_r.e();
                var1_int = 254;
                L2: while (true) {
                  if (var1_int < 1) {
                    va.field_e = id.a(2, hp.field_n, "intro", "intro3_stars");
                    q.field_Cb = id.a(2, hp.field_n, "intro", "intro3_citybg");
                    mm.field_o = id.a(-110, hp.field_n, "intro", "intro3_cityfg");
                    ch.field_c = id.a(2, hp.field_n, "intro", "intro3_crater");
                    var1_int = q.field_Cb.field_z;
                    var2 = q.field_Cb.field_w + 60;
                    he.field_h = new bi(var1_int, var2);
                    var3 = 0;
                    L3: while (true) {
                      if ((var2 + -60) * var1_int <= var3) {
                        var1_int = mm.field_o.field_z;
                        he.field_h.field_o = q.field_Cb.field_o;
                        he.field_h.field_t = q.field_Cb.field_t;
                        he.field_h.field_x = -60 + q.field_Cb.field_x;
                        var2 = 60 + mm.field_o.field_w;
                        he.field_h.field_p = 60 + q.field_Cb.field_p;
                        we.field_f = new bi(var1_int, var2);
                        var3 = 0;
                        L4: while (true) {
                          if ((var2 + -60) * var1_int <= var3) {
                            we.field_f.field_t = mm.field_o.field_t;
                            we.field_f.field_p = mm.field_o.field_p + 60;
                            we.field_f.field_x = -60 + mm.field_o.field_x;
                            we.field_f.field_o = mm.field_o.field_o;
                            he.field_h.e();
                            break L0;
                          } else {
                            we.field_f.field_B[var1_int * 60 + var3] = mm.field_o.field_B[var3];
                            var3++;
                            continue L4;
                          }
                        }
                      } else {
                        he.field_h.field_B[var3 - -(var1_int * 60)] = q.field_Cb.field_B[var3];
                        var3++;
                        continue L3;
                      }
                    }
                  } else {
                    var2 = (int)(Math.log((double)(254.0f / (float)var1_int)) * 40.0 / Math.log(2.0));
                    ac.field_s.e(var2 + -5, var2 - ac.field_s.field_x, var1_int * 65793);
                    var1_int--;
                    continue L2;
                  }
                }
              } else {
                var2 = (int)(20.0 * Math.log((double)(63.0f / (float)var1_int)) / Math.log(2.0));
                gf.g(320, 527, var2 + 400, (var1_int << 2) * 65793);
                var1_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var1, "rn.C(" + -62 + 41);
        }
    }

    final ak a(int param0, ua param1, int param2) {
        ak var4 = null;
        RuntimeException var4_ref = null;
        Object var5 = null;
        ak var6 = null;
        Throwable var7 = null;
        int var8 = 0;
        ak stackIn_8_0 = null;
        ak stackIn_15_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        Throwable decompiledCaughtException = null;
        ak stackOut_7_0 = null;
        ak stackOut_14_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var4 = new ak();
            var4.field_y = param2;
            var5 = (Object) (Object) ((rn) this).field_c;
            synchronized (var5) {
              L1: {
                var6 = (ak) (Object) ((rn) this).field_c.c(-128);
                L2: while (true) {
                  if (var6 == null) {
                    break L1;
                  } else {
                    L3: {
                      if (~var6.field_l != ~(long)param0) {
                        break L3;
                      } else {
                        if (param1 != var6.field_B) {
                          break L3;
                        } else {
                          if (var6.field_y != 2) {
                            break L3;
                          } else {
                            var4.field_w = var6.field_w;
                            var4.field_u = false;
                            stackOut_7_0 = (ak) var4;
                            stackIn_8_0 = stackOut_7_0;
                            return stackIn_8_0;
                          }
                        }
                      }
                    }
                    var6 = (ak) (Object) ((rn) this).field_c.b(32);
                    continue L2;
                  }
                }
              }
            }
            var4.field_w = param1.a(param0, 86);
            var4.field_u = false;
            var4.field_q = true;
            stackOut_14_0 = (ak) var4;
            stackIn_15_0 = stackOut_14_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var4_ref;
            stackOut_16_1 = new StringBuilder().append("rn.D(").append(param0).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L4;
            }
          }
          throw r.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + param2 + 41);
        }
        return stackIn_15_0;
    }

    public static void a() {
        field_a = null;
        field_g = null;
        field_e = null;
    }

    public final void run() {
        try {
            Object var2 = null;
            Exception var2_ref = null;
            Throwable var4 = null;
            int var5 = 0;
            Object var6 = null;
            ak var7 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            var5 = ShatteredPlansClient.field_F ? 1 : 0;
            L0: while (true) {
              if (((rn) this).field_f) {
                return;
              } else {
                var2 = (Object) (Object) ((rn) this).field_c;
                synchronized (var2) {
                  L1: {
                    var7 = (ak) (Object) ((rn) this).field_c.a(-49);
                    if (var7 != null) {
                      ((rn) this).field_d = ((rn) this).field_d - 1;
                      decompiledRegionSelector0 = 1;
                      break L1;
                    } else {
                      {
                        L2: {
                          ((Object) (Object) ((rn) this).field_c).wait();
                          break L2;
                        }
                      }
                      decompiledRegionSelector0 = 0;
                      break L1;
                    }
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  continue L0;
                } else {
                  try {
                    L4: {
                      L5: {
                        if (var7.field_y == 2) {
                          boolean discarded$1 = var7.field_B.a(var7.field_w.length, (int)var7.field_l, var7.field_w, 2);
                          var7.field_u = false;
                          break L5;
                        } else {
                          if (3 == var7.field_y) {
                            var7.field_w = var7.field_B.a((int)var7.field_l, 119);
                            var7.field_u = false;
                            break L5;
                          } else {
                            var7.field_u = false;
                            break L5;
                          }
                        }
                      }
                      break L4;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L6: {
                      var2_ref = (Exception) (Object) decompiledCaughtException;
                      var6 = null;
                      jq.a(-29901, (Throwable) (Object) var2_ref, (String) null);
                      var7.field_u = false;
                      break L6;
                    }
                  }
                  continue L0;
                }
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
        RuntimeException var3_ref = null;
        Throwable var4 = null;
        Object var5 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        Throwable decompiledCaughtException = null;
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
            var3 = (Object) (Object) ((rn) this).field_c;
            synchronized (var3) {
              L1: {
                L2: {
                  ((rn) this).field_c.a((df) (Object) param0, 32);
                  ((rn) this).field_d = ((rn) this).field_d + 1;
                  if (param1 == 1048576) {
                    break L2;
                  } else {
                    var5 = null;
                    this.a((ak) null, 31);
                    break L2;
                  }
                }
                ((Object) (Object) ((rn) this).field_c).notifyAll();
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3_ref;
            stackOut_8_1 = new StringBuilder().append("rn.H(");
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
          throw r.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param1 + 41);
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
            if (gr.field_o != -6) {
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
                int discarded$2 = -66;
                ec.e();
                int discarded$3 = 1;
                an.a();
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
        ak var5 = null;
        RuntimeException var5_ref = null;
        Object var6 = null;
        ak stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        ak stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
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
              var5 = new ak();
              if (param2 < -28) {
                break L1;
              } else {
                var6 = null;
                ak discarded$2 = ((rn) this).a(9, (ua) null, -105, (byte[]) null);
                break L1;
              }
            }
            var5.field_q = false;
            var5.field_y = 2;
            var5.field_B = param1;
            var5.field_l = (long)param0;
            var5.field_w = param3;
            this.a(var5, 1048576);
            stackOut_2_0 = (ak) var5;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var5_ref;
            stackOut_4_1 = new StringBuilder().append("rn.E(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44).append(param2).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param3 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw r.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
        return stackIn_3_0;
    }

    final static void a(int param0, bc param1, boolean param2, bc param3, bc param4) {
        try {
            int discarded$0 = -12179;
            wh.field_a = tf.a("");
            wh.field_a.a(false, 37);
            vl.a((byte) 87, param1, param4, param3);
            int discarded$1 = 0;
            jg.a();
            ee.field_l = oj.field_Fb;
            fj.field_s = oj.field_Fb;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "rn.I(" + 624 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 44 + (param4 != null ? "{...}" : "null") + 41);
        }
    }

    final ak a(ua param0, int param1, int param2) {
        ak var4 = null;
        RuntimeException var4_ref = null;
        Object stackIn_2_0 = null;
        ak stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        ak stackOut_3_0 = null;
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
            if (param2 == 13514) {
              var4 = new ak();
              var4.field_q = false;
              var4.field_B = param0;
              var4.field_y = 3;
              var4.field_l = (long)param1;
              this.a(var4, 1048576);
              stackOut_3_0 = (ak) var4;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (ak) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4_ref;
            stackOut_5_1 = new StringBuilder().append("rn.J(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
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
          throw r.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_4_0;
    }

    final void a(byte param0) {
        InterruptedException interruptedException = null;
        Object var2_ref_Object = null;
        int var2 = 0;
        Throwable var3 = null;
        Throwable decompiledCaughtException = null;
        ((rn) this).field_f = true;
        var2_ref_Object = (Object) (Object) ((rn) this).field_c;
        synchronized (var2_ref_Object) {
          L0: {
            ((Object) (Object) ((rn) this).field_c).notifyAll();
            break L0;
          }
        }
        var2 = -52 % ((param0 - -10) / 61);
        try {
          L1: {
            ((rn) this).field_h.join();
            break L1;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            interruptedException = (InterruptedException) (Object) decompiledCaughtException;
            break L2;
          }
        }
        ((rn) this).field_h = null;
    }

    final static void a(vk param0, int param1, int param2, bc param3) {
        try {
            aj.field_c = param1 * tj.a(0) / 1000;
            jc.a(-102, param3);
            oj.a(110, param3);
            int discarded$0 = 56;
            qr.a(param3);
            int discarded$1 = -47;
            eq.d();
            int discarded$2 = -112;
            r.b();
            js.field_j = -aj.field_c;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "rn.F(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + 1000 + 44 + (param3 != null ? "{...}" : "null") + 41);
        }
    }

    rn(qb param0) {
        pb var2 = null;
        ((rn) this).field_c = new db();
        ((rn) this).field_f = false;
        ((rn) this).field_d = 0;
        try {
            var2 = param0.a(true, 5, (Runnable) this);
            while (var2.field_d == 0) {
                jb.a((byte) -107, 10L);
            }
            if (var2.field_d == 2) {
                throw new RuntimeException();
            }
            ((rn) this).field_h = (Thread) var2.field_e;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "rn.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
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
