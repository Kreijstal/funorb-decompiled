/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class jh extends java.awt.Canvas {
    private java.awt.Component field_g;
    static double field_h;
    static String field_a;
    static int field_e;
    static byte[][] field_b;
    static String[][] field_d;
    static int field_f;
    static ha[] field_c;

    final static void a(String param0, java.applet.Applet param1, boolean param2, byte param3) {
        try {
          int var4_int = 0;
          if (dl.field_s.startsWith("win") &&
            ie.b((byte) 118, param0)) {
            return;
          }
          var4_int = 89 / ((param3 + 46) / 63);
          try {
            param1.getAppletContext().showDocument(new java.net.URL(param0), "_blank");
          } catch (java.net.MalformedURLException malformedURLException) {
            jh.a((Throwable) null, "MGR1: " + param0, (byte) 20);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, boolean param1) {
        ml dupTemp$0 = null;
        int var3;
        ml var4;
        ml var5;
        var3 = ArcanistsMulti.field_G ? 1 : 0;
        if (mj.field_p == 0) {
          qn.field_ob.field_X = false;
          qn.field_ob.field_H = false;
          qn.field_ob.field_g = false;
          if (0 != rm.field_k) {
            if (rm.field_k != 1) {
              if (rm.field_k == 2) {
                qn.field_ob.field_B = true;
                mo.field_f = ic.field_c;
                i.b(-127);
                kl.field_A = 400;
              } else {
                if (rm.field_k != 3) {
                  if (4 == rm.field_k) {
                    mo.field_f = ej.field_Q;
                    if (ti.field_N != 12 &&
                      !rk.field_O.c((byte) 89)) {
                      mo.field_f = sk.field_i;
                    }
                    if (co.a(-20675) <= 2) {
                      rm.field_k = 5;
                    }
                    kl.field_A = 400;
                  } else {
                    if (rm.field_k == 5) {
                      mo.field_f = oi.field_b;
                      if (co.a(param0 - 20672) <= 1) {
                        rm.field_k = 6;
                      }
                    } else {
                      if (rm.field_k == 6) {
                        mo.field_f = kj.field_f;
                      }
                    }
                  }
                } else {
                  if (ti.field_N == 12) {
                    rm.field_k = 4;
                  }
                  kl.field_A = 500;
                  mo.field_f = we.field_a;
                }
              }
            } else {
              mo.field_f = ab.field_s;
              qn.field_ob.field_B = true;
              i.b(1);
            }
          } else {
            mo.field_f = vc.field_f;
            qn.field_ob.field_B = true;
            i.b(97);
            kl.field_A = 400;
          }
        }
        if (mj.field_p == 1) {
          qn.field_ob.field_H = false;
          qn.field_ob.field_g = false;
          qn.field_ob.field_X = false;
          if (rm.field_k == 0) {
            mo.field_f = re.field_m;
            qn.field_ob.field_B = true;
            i.b(-115);
            kl.field_A = 400;
          } else {
            if (rm.field_k == 1) {
              if (ti.field_N == 14) {
                rm.field_k = 2;
              }
              kl.field_A = 500;
              mo.field_f = ie.field_Mb;
            } else {
              if (2 != rm.field_k) {
                if (3 != rm.field_k) {
                  if (rm.field_k == 4) {
                    mo.field_f = wi.field_i;
                  }
                } else {
                  mo.field_f = vi.field_D;
                  if (1 >= co.a(param0 ^ 20672)) {
                    rm.field_k = 4;
                  }
                }
              } else {
                mo.field_f = mk.field_R;
                if (ti.field_N != 14 &&
                  !rk.field_O.c((byte) 89)) {
                  mo.field_f = ke.field_E;
                }
                if (co.a(param0 - 20672) <= 2) {
                  rm.field_k = 3;
                }
                kl.field_A = 400;
              }
            }
          }
        }
        if (2 == mj.field_p) {
          qn.field_ob.field_H = false;
          qn.field_ob.field_X = false;
          qn.field_ob.field_g = false;
          if (rm.field_k == 0) {
            mo.field_f = td.field_D;
            qn.field_ob.field_B = true;
            i.b(-128);
            kl.field_A = 400;
          } else {
            if (rm.field_k != 1) {
              if (rm.field_k != 2) {
                if (rm.field_k != 3) {
                  if (rm.field_k == 4) {
                    if (!rk.field_O.c((byte) 89)) {
                      mo.field_f = tf.field_h;
                    }
                    if (co.a(-20675) <= 2) {
                      rm.field_k = 5;
                    }
                  } else {
                    if (rm.field_k == 5) {
                      mo.field_f = ra.field_g;
                      if (co.a(-20675) <= 1) {
                        rm.field_k = 6;
                      }
                    } else {
                      if (rm.field_k == 6) {
                        mo.field_f = lh.field_d;
                      }
                    }
                  }
                } else {
                  mo.field_f = ub.field_d;
                  if (rk.field_O.c((byte) 89)) {
                    rm.field_k = 4;
                  }
                  if (-1000 == qn.field_ob.field_s) {
                    rm.field_k = 2;
                  }
                  if (co.a(-20675) <= 2) {
                    rm.field_k = 5;
                  }
                  kl.field_A = 320;
                }
              } else {
                mo.field_f = nj.field_h;
                if (0 != ti.field_N) {
                  rm.field_k = 1;
                }
                kl.field_A = 400;
                if (qn.field_ob.field_s != -1000) {
                  rm.field_k = 3;
                }
              }
            } else {
              mo.field_f = mk.field_N;
              kl.field_A = 500;
              if (ti.field_N == 0) {
                rm.field_k = 2;
              }
            }
          }
        }
        if (3 == mj.field_p) {
          qn.field_ob.field_X = false;
          qn.field_ob.field_H = false;
          qn.field_ob.field_g = false;
          if (rm.field_k == 0) {
            if (20 == ti.field_N) {
              rm.field_k = 1;
            }
            mo.field_f = nb.field_f;
            if (co.a(-20675) <= 2) {
              rm.field_k = 2;
            }
          } else {
            if (1 == rm.field_k) {
              mo.field_f = qn.field_jb;
              if (20 != ti.field_N &&
                !rk.field_O.c((byte) 89)) {
                rm.field_k = 0;
              }
              if (co.a(param0 ^ 20672) <= 2) {
                rm.field_k = 2;
              }
              kl.field_A = 400;
            } else {
              if (2 == rm.field_k) {
                mo.field_f = be.field_h;
                if (co.a(-20675) <= 1) {
                  rm.field_k = 3;
                }
              } else {
                if (rm.field_k == 3) {
                  mo.field_f = wi.field_i;
                }
              }
            }
          }
        }
        if (mj.field_p == 4) {
          qn.field_ob.field_X = false;
          qn.field_ob.field_H = false;
          qn.field_ob.field_g = false;
          if (rm.field_k <= 2 &&
            520 > rk.field_O.a(0, true).field_lb) {
            rm.field_k = 8;
          }
          if (0 != rm.field_k) {
            if (rm.field_k == 1) {
              mo.field_f = ag.field_x;
              qn.field_ob.field_B = true;
              i.b(param0 - 113);
              kl.field_A = 500;
            } else {
              if (2 == rm.field_k) {
                mo.field_f = gn.field_f;
                if (rk.field_O.a(0, true).field_lb > 1300) {
                  rm.field_k = 3;
                }
                kl.field_A = 300;
                i.b(-128);
              } else {
                if (rm.field_k != 3) {
                  if (rm.field_k != 4) {
                    if (rm.field_k != 5) {
                      if (rm.field_k != 6) {
                        if (7 != rm.field_k) {
                          if (rm.field_k == 8) {
                            if (ti.field_N == 10) {
                              rm.field_k = 4;
                            }
                            mo.field_f = uj.field_b;
                          }
                        } else {
                          mo.field_f = jd.field_c;
                          if (rk.field_O.a(0, true).field_lb < 516) {
                            rm.field_k = 6;
                          }
                        }
                      } else {
                        mo.field_f = eb.field_c;
                      }
                    } else {
                      if (rk.field_O.a(3, true) == null) {
                        mo.field_f = ub.field_f;
                      } else {
                        mo.field_f = ui.field_u;
                      }
                      if (co.a(-20675) <= 1) {
                        rm.field_k = 6;
                      }
                      if (null == rk.field_O.a(2, true) &&
                        null == rk.field_O.a(3, true)) {
                        rm.field_k = 7;
                      }
                    }
                  } else {
                    mo.field_f = gh.field_o;
                    if (co.a(-20675) <= 2) {
                      rm.field_k = 5;
                    }
                  }
                } else {
                  if (ti.field_N == 10) {
                    rm.field_k = 4;
                  }
                  kl.field_A = 320;
                  mo.field_f = e.field_D;
                }
              }
            }
          } else {
            qn.field_ob.field_B = true;
            mo.field_f = qe.field_n;
            i.b(19);
            kl.field_A = 400;
          }
          if (rk.field_O.a(0, true).field_db > 800) {
            rm.field_k = -Math.abs(rm.field_k);
          }
          if (rm.field_k < 0) {
            mo.field_f = io.field_u;
            if (800 > rk.field_O.a(0, true).field_db) {
              if (rk.field_O.a(0, true).field_lb < 800) {
                rm.field_k = -rm.field_k;
              }
              if (rk.field_O.a(0, true).field_lb > 1200) {
                rm.field_k = -rm.field_k;
              }
            }
            i.b(param0 + 36);
            kl.field_A = 400;
          }
        }
        if (mj.field_p == 5) {
          qn.field_ob.field_X = false;
          qn.field_ob.field_H = false;
          qn.field_ob.field_g = false;
          if (rk.field_O.a(0, true) == null) {
            gj.a(true, true, 14, mn.field_r);
            co.c(114);
            return;
          }
          var4 = rk.field_O.a(qn.field_ob.field_bb, true);
          if (0 == rm.field_k) {
            kl.field_A = 400;
            if (ti.field_N == 6) {
              rm.field_k = 1;
            }
            mo.field_f = bm.field_a;
          } else {
            if (rm.field_k != 1) {
              if (rm.field_k == 2) {
                if (var4 == null) {
                }
                mo.field_f = af.field_Cb;
              } else {
                if (rm.field_k != 3) {
                  if (rm.field_k != 4) {
                    if (rm.field_k != 5) {
                      if (rm.field_k == 6) {
                        mo.field_f = ol.field_e;
                        if (co.a(param0 - 20672) <= 1) {
                          rm.field_k = 7;
                        }
                      } else {
                        if (rm.field_k == 7) {
                          mo.field_f = pa.field_f;
                        }
                      }
                    } else {
                      mo.field_f = to.field_o;
                      if (null == rk.field_O.a(1, true) ||
                        null == rk.field_O.a(2, true) ||
                        null == rk.field_O.a(3, true) ||
                        rk.field_O.a(1, true).field_jb != 40 ||
                        rk.field_O.a(2, true).field_jb != 40 ||
                        rk.field_O.a(3, true).field_jb != 40) {
                        rm.field_k = 6;
                      }
                    }
                  } else {
                    mo.field_f = tc.field_E;
                    if (var4 == null ||
                      var4.field_jb != 11) {
                      rm.field_k = 5;
                    }
                    if (ti.field_N != 120) {
                      rm.field_k = 5;
                    }
                    if (rk.field_O.a(1, true) == null ||
                      rk.field_O.a(2, true) == null ||
                      rk.field_O.a(3, true) == null ||
                      rk.field_O.a(1, true).field_jb != 40 ||
                      rk.field_O.a(2, true).field_jb != 40 ||
                      rk.field_O.a(3, true).field_jb != 40) {
                      rm.field_k = 6;
                    }
                  }
                } else {
                  mo.field_f = va.field_b;
                  if (rk.field_O.a(1, true) == null ||
                    rk.field_O.a(2, true) == null ||
                    rk.field_O.a(3, true) == null ||
                    40 != rk.field_O.a(1, true).field_jb ||
                    rk.field_O.a(2, true).field_jb != 40 ||
                    rk.field_O.a(3, true).field_jb != 40) {
                    rm.field_k = 6;
                  }
                  if (var4 == null ||
                    var4.field_jb != 11) {
                    rm.field_k = 2;
                  }
                  if (120 == ti.field_N) {
                    rm.field_k = 4;
                  }
                  kl.field_A = 460;
                }
              }
            } else {
              mo.field_f = mk.field_M;
              if (rk.field_O.b(12) >= 3) {
                rm.field_k = 2;
              }
              kl.field_A = 400;
            }
          }
          if (rk.field_O.a(0, true).field_db > 800) {
            rm.field_k = -Math.abs(rm.field_k);
          }
          if (0 > rm.field_k) {
            {
              mo.field_f = r.field_c;
              if ((var4 == null ||
                var4.field_jb == 0) && ti.field_N != 6) {
                if (var4 == null) {
                } else if (250 <= var4.field_ib) {
                } else {
                  mo.field_f = tc.field_y;
                }
              } else {
                rm.field_k = -rm.field_k;
                rk.field_O.a(0, true).field_ib = 250;
              }
            }
            kl.field_A = 400;
          }
          if (rk.field_O.a(0, true).field_ib < 250) {
            rm.field_k = -Math.abs(rm.field_k);
            qn.field_ob.field_bb = rk.field_O.a(0, true).field_T;
            if (240 > rk.field_O.a(0, true).field_ib) {
              dupTemp$0 = rk.field_O.a(0, true);
              dupTemp$0.field_ib = dupTemp$0.field_ib + 1;
            }
          }
        }
        if (mj.field_p == 6) {
          if (null == rk.field_O.a(0, true)) {
            gj.a(true, true, 14, mn.field_r);
            co.c(108);
            return;
          }
          if (rm.field_k == 0) {
            mo.field_f = dc.field_g;
            qn.field_ob.field_B = true;
            qn.field_ob.field_z = 1500;
            i.b(45);
            qn.field_ob.field_H = false;
            qn.field_ob.field_X = false;
            kl.field_A = 400;
            qn.field_ob.field_g = false;
          } else {
            if (rm.field_k == 1) {
              mo.field_f = bh.field_a;
              qn.field_ob.field_B = true;
              qn.field_ob.field_z = 1500;
              i.b(param0 - 115);
              qn.field_ob.field_X = false;
              qn.field_ob.field_H = false;
            } else {
              if (2 != rm.field_k) {
                if (3 == rm.field_k) {
                  kl.field_A = 280;
                  qn.field_ob.field_z = 6000;
                  mo.field_f = jl.field_e;
                  qn.field_ob.field_B = true;
                  i.b(86);
                } else {
                  if (rm.field_k == 4) {
                    qn.field_ob.field_z = 6000;
                    qn.field_ob.field_B = true;
                    mo.field_f = bb.field_d;
                    kl.field_A = 280;
                    i.b(-18);
                  } else {
                    if (rm.field_k != 5 &&
                      rm.field_k == 6) {
                      qn.field_ob.field_z = 6000;
                      mo.field_f = mo.field_l;
                      qn.field_ob.field_X = false;
                      qn.field_ob.field_B = true;
                      i.b(-115);
                    }
                  }
                }
              } else {
                qn.field_ob.field_B = true;
                mo.field_f = fk.field_i;
                qn.field_ob.field_z = 1500;
                i.b(120);
                qn.field_ob.field_X = false;
              }
            }
          }
        }
        if (param0 != -3) {
          field_c = (ha[]) null;
        }
        if (7 != mj.field_p) {
          return;
        }
        if (null == rk.field_O.a(0, true)) {
          gj.a(true, true, 14, mn.field_r);
          co.c(113);
          return;
        }
        if (0 == rm.field_k) {
          mo.field_f = vd.field_j;
          qn.field_ob.field_B = true;
        } else {
          if (!param1) {
            mo.field_f = oc.field_h;
          }
        }
        var5 = rk.field_O.a(qn.field_ob.field_bb, true);
        if (rm.field_k < 0) {
          kl.field_A = 400;
          if (var5 != null &&
            var5.field_jb != 0 ||
            ti.field_N != -1) {
            rm.field_k = -rm.field_k;
          }
          if (var5 != null &&
            var5.field_ib < 250) {
            mo.field_f = q.field_F;
          }
        }
        if (rk.field_O.a(0, true).field_x > 0) {
          rm.field_k = -Math.abs(rm.field_k);
          qn.field_ob.field_bb = rk.field_O.a(0, true).field_T;
        }
        return;
    }

    public final void paint(java.awt.Graphics param0) {
        try {
          this.field_g.paint(param0);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "jh.paint(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    jh(java.awt.Component param0) {
        try {
          this.field_g = param0;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "jh.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(wk param0, byte param1, String param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        byte[] var4 = null;
        CharSequence var5 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = param0.field_g;
          if (param1 != 127) {
            field_h = 0.05152737468678133;
          }
          var5 = (CharSequence) ((Object) param2);
          var4 = go.a(var5, (byte) -82);
          param0.d(var4.length, (byte) -124);
          param0.field_g = param0.field_g + kh.field_g.a(param0.field_j, var4.length, var4, param0.field_g, 1, 0);
          stackIn_3_0 = -var3_int + param0.field_g;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("jh.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static void a(Throwable param0, String param1, byte param2) {
        try {
          dl stackIn_14_0;
          boolean stackIn_14_1;
          java.net.URL stackIn_14_2;
          java.net.URL stackIn_14_3;
          java.net.URL stackIn_14_4;
          StringBuilder stackIn_14_5;
          java.net.URL stackIn_15_2;
          java.net.URL stackIn_15_3;
          String stackIn_15_6;
          Throwable decompiledCaughtException = null;
          String var3 = null;
          Exception var3_ref = null;
          og var4 = null;
          DataInputStream var5 = null;
          int var6 = 0;
          java.applet.Applet var7 = null;
          String var8 = null;
          var6 = ArcanistsMulti.field_G ? 1 : 0;
          try {
            var3 = "";
            if (param0 != null) {
              var3 = b.a((byte) 122, param0);
            }
            if (param1 != null) {
              if (param0 != null) {
                var3 = var3 + " | ";
              }
              var3 = var3 + param1;
            }
            se.a((byte) -125, var3);
            if (param2 != 20) {
              var7 = (java.applet.Applet) null;
              jh.a((String) null, (java.applet.Applet) null, true, (byte) 83);
            }
            var3 = si.a(var3, ":", "%3a", (byte) 107);
            var3 = si.a(var3, "@", "%40", (byte) 125);
            var3 = si.a(var3, "&", "%26", (byte) 100);
            var8 = si.a(var3, "#", "%23", (byte) 100);
            if (hh.field_e == null) {
              return;
            }
            stackIn_14_0 = rb.field_k;
            stackIn_14_1 = true;
            stackIn_14_2 = null;
            stackIn_14_3 = null;
            stackIn_14_4 = hh.field_e.getCodeBase();
            stackIn_14_5 = new StringBuilder().append("clienterror.ws?c=").append(ji.field_g).append("&u=");
            if (null == fj.field_i) {
              stackIn_15_2 = null;
              stackIn_15_3 = null;
              stackIn_15_6 = "" + vg.field_K;
            } else {
              stackIn_15_2 = null;
              stackIn_15_3 = null;
              stackIn_15_6 = fj.field_i;
            }
            var4 = ((dl) (Object) stackIn_14_0).a(stackIn_14_1, new java.net.URL(stackIn_14_4, ((StringBuilder) (Object) stackIn_14_5).append(stackIn_15_6).append("&v1=").append(dl.field_l).append("&v2=").append(dl.field_c).append("&e=").append(var8).toString()));
            while (var4.field_e == 0) {
              ao.a(1L, 1);
            }
            if (var4.field_e == 1) {
              var5 = (DataInputStream) (var4.field_g);
              var5.read();
              var5.close();
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3_ref = (Exception) (Object) decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(byte param0) {
        field_c = null;
        if (param0 <= 24) {
          field_f = 116;
        }
        field_a = null;
        field_b = (byte[][]) null;
        field_d = (String[][]) null;
    }

    public final void update(java.awt.Graphics param0) {
        try {
          this.field_g.update(param0);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "jh.update(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = null;
        field_b = new byte[50][];
        field_d = new String[][]{new String[]{"120", "90", "60", "45", "30", "20", "10"}, new String[]{"Grassy Hills", "Giants' Mountains", "Elven Isles", "Goblin Caves", "Murky Swamp", "Graveyard", "Sky Castles", "Mos Le'Harmless", "Arcane Crystals", "Random"}, new String[]{"Players are free to fight as they please", "4-player and 6-player games get divided into 2v2 or 3v3 team games, with shared victory"}};
        field_h = Math.atan2(1.0, 0.0);
        field_f = 0;
    }
}
