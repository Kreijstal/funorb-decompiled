/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class hd extends hi {
    static String field_q;
    static int[] field_r;
    private String field_p;
    private li field_o;
    private boolean field_s;

    final static void a(int param0, int param1, int param2, p param3) {
        try {
            int var4_int = 0;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "hd.F(" + param0 + ',' + -110 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(gb param0) {
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        pf var5 = null;
        int[] var6 = null;
        int var7 = 0;
        en var8 = null;
        int var9 = 0;
        en var10 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var7 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            var8 = new en(param0.a("", "logo.fo3d", 0));
            var10 = var8;
            var3 = var10.l(32270);
            var10.c(false);
            ce.field_f = gj.a(false, var10);
            wj.field_J = new pf[var3];
            of.field_f = new int[var3][];
            var4 = 0;
            L1: while (true) {
              if (var4 >= var3) {
                var10.q(-28);
                var9 = 0;
                var4 = var9;
                L2: while (true) {
                  if (var3 <= var9) {
                    break L0;
                  } else {
                    var5 = wj.field_J[var9];
                    var5.a(6, 6, (byte) 40, 1, 6);
                    var5.c(-128);
                    var6 = new int[]{var5.field_J + var5.field_d >> 1, var5.field_C + var5.field_a >> 1, var5.field_t + var5.field_D >> 1};
                    of.field_f[var9] = var6;
                    var5.a(-var6[0], (byte) -85, -var6[1], -var6[2]);
                    var9++;
                    continue L2;
                  }
                }
              } else {
                wj.field_J[var4] = tf.a(4, var8);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var2;
            stackOut_8_1 = new StringBuilder().append("hd.G(");
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
          throw wg.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + false + ')');
        }
    }

    public static void f() {
        field_q = null;
        field_r = null;
    }

    final static void a(byte param0, oc param1) {
        int var3 = 0;
        int var4 = 0;
        oj var5 = null;
        oc var6 = null;
        int var7 = 0;
        int[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        oc var15_ref_oc = null;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        og var20 = null;
        double var21 = 0.0;
        double var23 = 0.0;
        int var25 = 0;
        int var26 = 0;
        double var26_double = 0.0;
        int var27 = 0;
        double var28_double = 0.0;
        int var28 = 0;
        int var29 = 0;
        double var30_double = 0.0;
        int var30 = 0;
        double var32 = 0.0;
        double var34 = 0.0;
        double var36 = 0.0;
        int var38 = 0;
        oj var39 = null;
        oc var40 = null;
        int[] var41 = null;
        qm var43 = null;
        int[] var44 = null;
        int[] var46 = null;
        int[] var48 = null;
        int[] var49 = null;
        int stackIn_112_0 = 0;
        int stackIn_157_0 = 0;
        int stackOut_110_0 = 0;
        int stackOut_111_0 = 0;
        int stackOut_156_0 = 0;
        int stackOut_155_0 = 0;
        L0: {
          var38 = HostileSpawn.field_I ? 1 : 0;
          var40 = new oc();
          mg.field_c = 0;
          ak.field_f = 0;
          jh.field_db = 0;
          lj.field_q = 0;
          nl.field_b = 0;
          var3 = el.field_j;
          var4 = ln.field_a.field_d;
          var5 = mm.field_m[0];
          var39 = var5;
          var39 = var5;
          var6 = var5.field_j;
          var7 = var6.b(-4);
          var49 = ln.field_a.field_f;
          var48 = ln.field_a.field_c;
          var46 = var48;
          var44 = var46;
          var41 = var44;
          var9 = var41;
          var10 = var6.field_e;
          var11 = var6.field_g;
          if (tm.field_q <= 0) {
            break L0;
          } else {
            tm.field_q = tm.field_q - 1;
            break L0;
          }
        }
        var12 = 0;
        var13 = 0;
        L1: while (true) {
          if (var3 <= var13) {
            var13 = 0;
            L2: while (true) {
              if (~var3 >= ~var13) {
                L3: {
                  if (var12 != 0) {
                    break L3;
                  } else {
                    if (3 == ha.field_t) {
                      kd.a(0, 1);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                }
                var13 = 0;
                L4: while (true) {
                  if (~dk.field_o >= ~var13) {
                    var14 = el.field_j - 1;
                    L5: while (true) {
                      if (var14 <= 0) {
                        L6: {
                          if (eh.field_g <= 0) {
                            break L6;
                          } else {
                            if (hg.field_e != 1) {
                              break L6;
                            } else {
                              L7: {
                                var14 = 0;
                                if (50 <= ak.field_f) {
                                  var14++;
                                  break L7;
                                } else {
                                  break L7;
                                }
                              }
                              L8: {
                                if (150 > ak.field_f) {
                                  break L8;
                                } else {
                                  var14++;
                                  break L8;
                                }
                              }
                              L9: {
                                if (ak.field_f >= 400) {
                                  var14++;
                                  break L9;
                                } else {
                                  break L9;
                                }
                              }
                              L10: {
                                if (ak.field_f < 700) {
                                  break L10;
                                } else {
                                  var14++;
                                  break L10;
                                }
                              }
                              L11: {
                                if (32 > eh.field_g) {
                                  var14++;
                                  break L11;
                                } else {
                                  break L11;
                                }
                              }
                              L12: {
                                if (le.field_D <= 0) {
                                  break L12;
                                } else {
                                  if (le.field_D < 6000) {
                                    var14 = var14 + 6000 / le.field_D;
                                    break L12;
                                  } else {
                                    break L12;
                                  }
                                }
                              }
                              L13: {
                                if (~var14 > ~mb.field_s.field_g.length) {
                                  break L13;
                                } else {
                                  var14 = -1 + mb.field_s.field_g.length;
                                  break L13;
                                }
                              }
                              boolean discarded$6 = mb.field_s.b(var14, (byte) 112);
                              break L6;
                            }
                          }
                        }
                        L14: {
                          if (0 >= eh.field_g) {
                            break L14;
                          } else {
                            if (hg.field_e == 1) {
                              L15: {
                                if (256 >= lj.field_q) {
                                  break L15;
                                } else {
                                  lj.field_q = 256;
                                  break L15;
                                }
                              }
                              if (lj.field_q <= mb.field_s.field_v) {
                                if (~mb.field_s.field_v < ~lj.field_q) {
                                  mb.field_s.field_v = mb.field_s.field_v - 1;
                                  break L14;
                                } else {
                                  break L14;
                                }
                              } else {
                                mb.field_s.field_v = Math.min(lj.field_q, mb.field_s.field_v - -8);
                                break L14;
                              }
                            } else {
                              break L14;
                            }
                          }
                        }
                        L16: {
                          if (eh.field_g <= 0) {
                            break L16;
                          } else {
                            if (1 != hg.field_e) {
                              break L16;
                            } else {
                              L17: {
                                if (nl.field_b >= 100) {
                                  break L17;
                                } else {
                                  if (ha.field_t != 3) {
                                    break L17;
                                  } else {
                                    nl.field_b = 100;
                                    break L17;
                                  }
                                }
                              }
                              if (~nl.field_b < ~mb.field_s.field_u) {
                                mb.field_s.field_u = Math.min(nl.field_b, mb.field_s.field_u - -8);
                                break L16;
                              } else {
                                if (nl.field_b < mb.field_s.field_u) {
                                  mb.field_s.field_u = Math.max(nl.field_b, -8 + mb.field_s.field_u);
                                  break L16;
                                } else {
                                  break L16;
                                }
                              }
                            }
                          }
                        }
                        L18: {
                          if ((em.field_c & 7) == 0) {
                            L19: {
                              if (jh.field_db > 0) {
                                if (null != ec.field_b) {
                                  ec.field_b.g(uh.field_i * jh.field_db / 400);
                                  break L19;
                                } else {
                                  ec.field_b = b.a(lm.field_A[5], 100, uh.field_i * jh.field_db / 400);
                                  ec.field_b.d(-1);
                                  eh.field_c.b((tj) (Object) ec.field_b);
                                  break L19;
                                }
                              } else {
                                if (null != ec.field_b) {
                                  eh.field_c.a((tj) (Object) ec.field_b);
                                  ec.field_b = null;
                                  break L19;
                                } else {
                                  break L19;
                                }
                              }
                            }
                            L20: {
                              if (mg.field_c > 0) {
                                if (null == q.field_i) {
                                  q.field_i = b.a(fg.field_b[25], 100, uh.field_i * mg.field_c / 400);
                                  q.field_i.d(-1);
                                  eh.field_c.b((tj) (Object) q.field_i);
                                  break L20;
                                } else {
                                  q.field_i.g(uh.field_i * mg.field_c / 400);
                                  break L20;
                                }
                              } else {
                                if (null == q.field_i) {
                                  break L20;
                                } else {
                                  eh.field_c.a((tj) (Object) q.field_i);
                                  q.field_i = null;
                                  break L20;
                                }
                              }
                            }
                            if (tb.field_N > 0) {
                              if (e.field_l == null) {
                                e.field_l = b.a(fg.field_b[26], 100, 10);
                                e.field_l.d(-1);
                                eh.field_c.b((tj) (Object) e.field_l);
                                break L18;
                              } else {
                                var14 = e.field_l.k();
                                if (~var14 > ~(2 * uh.field_i)) {
                                  e.field_l.g(var14 + 20);
                                  break L18;
                                } else {
                                  if (~(2 * uh.field_i) <= ~var14) {
                                    break L18;
                                  } else {
                                    e.field_l.g(uh.field_i * 2);
                                    break L18;
                                  }
                                }
                              }
                            } else {
                              if (e.field_l != null) {
                                var14 = e.field_l.k();
                                if (var14 > 10) {
                                  e.field_l.g(var14 - 10);
                                  break L18;
                                } else {
                                  eh.field_c.a((tj) (Object) e.field_l);
                                  e.field_l = null;
                                  break L18;
                                }
                              } else {
                                break L18;
                              }
                            }
                          } else {
                            break L18;
                          }
                        }
                        return;
                      } else {
                        L21: {
                          var13 = 0;
                          if (mm.field_m[var14].field_G > 0) {
                            var13 = 16;
                            break L21;
                          } else {
                            break L21;
                          }
                        }
                        L22: {
                          if (var13 <= mm.field_m[var14].field_q) {
                            break L22;
                          } else {
                            mm.field_m[var14].field_q = mm.field_m[var14].field_q + 1;
                            break L22;
                          }
                        }
                        L23: {
                          if (mm.field_m[var14].field_q > var13) {
                            mm.field_m[var14].field_q = mm.field_m[var14].field_q - 1;
                            break L23;
                          } else {
                            break L23;
                          }
                        }
                        L24: {
                          if (-1 == mm.field_m[var14].field_i) {
                            el.field_j = el.field_j - 1;
                            mm.field_m[var14] = mm.field_m[el.field_j];
                            mm.field_m[el.field_j] = null;
                            break L24;
                          } else {
                            break L24;
                          }
                        }
                        var14--;
                        continue L5;
                      }
                    }
                  } else {
                    L25: {
                      var43 = vj.field_w[var13];
                      if (var43 != null) {
                        L26: {
                          var15 = var43.field_j.field_e + -var10;
                          if (var15 >= 0) {
                            break L26;
                          } else {
                            var15 = -var15;
                            break L26;
                          }
                        }
                        L27: {
                          var16 = var43.field_j.field_g - var11;
                          if (var16 >= 0) {
                            break L27;
                          } else {
                            var16 = -var16;
                            break L27;
                          }
                        }
                        var17 = var16 + var15;
                        if (ha.field_t != 10) {
                          break L25;
                        } else {
                          if (var43.field_j.a(nh.field_E, -126)) {
                            if (var17 >= 3) {
                              break L25;
                            } else {
                              r.field_a = 1;
                              ca.a(19.0, 0, 32.4, true, 0);
                              kd.a(0, 1);
                              tg.field_a = true;
                              break L25;
                            }
                          } else {
                            break L25;
                          }
                        }
                      } else {
                        vj.field_w[var13] = vj.field_w[dk.field_o];
                        dk.field_o = dk.field_o - 1;
                        break L25;
                      }
                    }
                    var13++;
                    continue L4;
                  }
                }
              } else {
                L28: {
                  var39 = mm.field_m[var13];
                  if (var39 == null) {
                    break L28;
                  } else {
                    L29: {
                      if (var39.field_i != 8) {
                        break L29;
                      } else {
                        var12 = 1;
                        break L29;
                      }
                    }
                    L30: {
                      var39.b((byte) 117);
                      var15_ref_oc = var39.field_j;
                      var16 = var15_ref_oc.b(-4);
                      var17 = -var10 + var15_ref_oc.field_e;
                      var18 = -var11 + var15_ref_oc.field_g;
                      if (0 <= var17) {
                        break L30;
                      } else {
                        var17 = -var17;
                        break L30;
                      }
                    }
                    L31: {
                      if (0 > var18) {
                        var18 = -var18;
                        break L31;
                      } else {
                        break L31;
                      }
                    }
                    var19 = var18 + var17;
                    if (var19 <= 50) {
                      L32: {
                        if (bm.field_c != 0) {
                          break L32;
                        } else {
                          if (ha.field_t != 4) {
                            break L32;
                          } else {
                            if (var39.field_i == 125) {
                              if (var19 < 5) {
                                var5.field_c = el.a((double)var10, (double)nh.field_E.field_e, 16, (double)var11, (double)nh.field_E.field_g);
                                ca.a(81.5, 1, 37.0, true, 64);
                                kd.a(0, 1);
                                break L32;
                              } else {
                                break L32;
                              }
                            } else {
                              break L32;
                            }
                          }
                        }
                      }
                      L33: {
                        var39.field_G = 0;
                        var20 = var5.field_l;
                        var21 = var20.field_f;
                        var23 = var20.field_a;
                        var26 = var39.field_i;
                        if (var26 == 0) {
                          L34: {
                            var26_double = var21 + (double)var10 - 0.5;
                            var28_double = -0.5 + ((double)var11 + var23);
                            var30_double = gj.a(var26_double, -4);
                            var32 = sf.a(24, var28_double);
                            var34 = 1.0 + Math.atan2((double)(-j.field_c) + var30_double, (double)(-rb.field_m) + var32) * 128.0 / 3.141592653589793;
                            if (dl.field_l) {
                              var34 = 0.0;
                              break L34;
                            } else {
                              break L34;
                            }
                          }
                          L35: {
                            if (2 != ln.field_a.field_y[var7]) {
                              break L35;
                            } else {
                              ue.field_d = 0;
                              break L35;
                            }
                          }
                          L36: {
                            var36 = var34 - var39.field_c;
                            if (128.0 <= var36) {
                              var36 = var36 - 256.0;
                              break L36;
                            } else {
                              break L36;
                            }
                          }
                          L37: {
                            if (var36 < -128.0) {
                              var36 = var36 + 256.0;
                              break L37;
                            } else {
                              break L37;
                            }
                          }
                          L38: {
                            L39: {
                              var36 = Math.abs(var36);
                              if (dn.field_i == of.field_d) {
                                break L39;
                              } else {
                                L40: {
                                  if (hf.field_i >= 0) {
                                    break L40;
                                  } else {
                                    if (~j.field_c != ~vc.field_g) {
                                      break L40;
                                    } else {
                                      if (~rh.field_A != ~rb.field_m) {
                                        break L40;
                                      } else {
                                        if (32.0 >= Math.abs(var36)) {
                                          break L39;
                                        } else {
                                          break L40;
                                        }
                                      }
                                    }
                                  }
                                }
                                var39.a(225, var34, 8);
                                if (var36 <= 1.0) {
                                  vc.field_g = j.field_c;
                                  rh.field_A = rb.field_m;
                                  break L38;
                                } else {
                                  vc.field_g = -2;
                                  break L38;
                                }
                              }
                            }
                            rh.field_A = rb.field_m;
                            vc.field_g = j.field_c;
                            break L38;
                          }
                          L41: {
                            L42: {
                              if (nh.field_H == 2) {
                                break L42;
                              } else {
                                if (nh.field_H == 3) {
                                  break L42;
                                } else {
                                  stackOut_110_0 = 2;
                                  stackIn_112_0 = stackOut_110_0;
                                  break L41;
                                }
                              }
                            }
                            stackOut_111_0 = 1;
                            stackIn_112_0 = stackOut_111_0;
                            break L41;
                          }
                          L43: {
                            var25 = stackIn_112_0;
                            if (km.field_A == of.field_d) {
                              var25 = 5;
                              break L43;
                            } else {
                              break L43;
                            }
                          }
                          if (var39.field_p >= var25) {
                            L44: {
                              cg.field_b = cg.field_b + 1;
                              var39.field_z = var39.field_z + 1;
                              var39.field_p = 0;
                              if (cf.field_q.length <= var39.field_z) {
                                var39.field_z = 0;
                                break L44;
                              } else {
                                break L44;
                              }
                            }
                            L45: {
                              if (ng.field_p[nh.field_H] == null) {
                                break L45;
                              } else {
                                if (cg.field_b >= ng.field_p[nh.field_H].length) {
                                  cg.field_b = 0;
                                  break L45;
                                } else {
                                  break L45;
                                }
                              }
                            }
                            L46: {
                              dn.field_b = dn.field_b + 1;
                              if (dn.field_i != of.field_d) {
                                break L46;
                              } else {
                                if (~of.field_d.length >= ~dn.field_b) {
                                  dn.field_b = 0;
                                  of.field_d = km.field_A;
                                  break L33;
                                } else {
                                  break L46;
                                }
                              }
                            }
                            if (null == of.field_d) {
                              break L33;
                            } else {
                              if (~dn.field_b > ~of.field_d.length) {
                                break L33;
                              } else {
                                dn.field_b = 0;
                                break L33;
                              }
                            }
                          } else {
                            break L33;
                          }
                        } else {
                          if (var26 != 30) {
                            if (var26 == 18) {
                              L47: {
                                if (var39.field_n) {
                                  break L47;
                                } else {
                                  L48: {
                                    if (0 < ln.field_a.field_i[var16]) {
                                      break L48;
                                    } else {
                                      if (0 < ln.field_a.field_i[var16 + -1]) {
                                        break L48;
                                      } else {
                                        if (0 >= ln.field_a.field_i[var16 - ln.field_a.field_d + -1]) {
                                          break L47;
                                        } else {
                                          break L48;
                                        }
                                      }
                                    }
                                  }
                                  var39.field_n = true;
                                  if (0 != te.field_K) {
                                    break L47;
                                  } else {
                                    L49: {
                                      L50: {
                                        var26 = uh.field_i;
                                        te.field_K = (int)(Math.random() * 50.0) + 20;
                                        if (var17 >= 4) {
                                          break L50;
                                        } else {
                                          if (var18 >= 4) {
                                            break L50;
                                          } else {
                                            break L49;
                                          }
                                        }
                                      }
                                      var26 = var26 / 2;
                                      break L49;
                                    }
                                    jh.a(var26, (byte) 29, 18, jc.field_c, 3);
                                    break L47;
                                  }
                                }
                              }
                              if (!var39.field_n) {
                                cf.a(param1, (byte) 44, var13, var40);
                                break L33;
                              } else {
                                qj.a(-90, var13, param1, var40);
                                break L33;
                              }
                            } else {
                              if (var26 == 27) {
                                if (!var39.field_n) {
                                  L51: {
                                    if (gj.a(var16, var15_ref_oc.field_g, -122, var15_ref_oc.field_e)) {
                                      break L51;
                                    } else {
                                      if (gj.a(var16 - 1, var15_ref_oc.field_g, -112, -1 + var15_ref_oc.field_e)) {
                                        break L51;
                                      } else {
                                        if (gj.a(var16 - 1 + -ln.field_a.field_d, var15_ref_oc.field_g - 1, -94, -1 + var15_ref_oc.field_e)) {
                                          break L51;
                                        } else {
                                          if (!gj.a(-ln.field_a.field_d + var16, var15_ref_oc.field_g + -1, -124, var15_ref_oc.field_e)) {
                                            break L33;
                                          } else {
                                            break L51;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  int discarded$7 = 1;
                                  tk.a(3, jc.field_c, 28);
                                  var39.field_n = true;
                                  break L33;
                                } else {
                                  L52: {
                                    if (6 == rl.field_c) {
                                      stackOut_156_0 = 0;
                                      stackIn_157_0 = stackOut_156_0;
                                      break L52;
                                    } else {
                                      stackOut_155_0 = 1;
                                      stackIn_157_0 = stackOut_155_0;
                                      break L52;
                                    }
                                  }
                                  n.field_o = stackIn_157_0 != 0;
                                  qj.a(-126, var13, param1, var40);
                                  break L33;
                                }
                              } else {
                                L53: {
                                  if (var26 == 1) {
                                    break L53;
                                  } else {
                                    if (var26 == 19) {
                                      break L53;
                                    } else {
                                      if (225 != var26) {
                                        L54: {
                                          if (23 != var26) {
                                            if (var26 != 28) {
                                              if (var26 != 24) {
                                                if (var26 == 2) {
                                                  he.a(var23, var15_ref_oc, var10, var21, var39, -58, var11);
                                                  break L33;
                                                } else {
                                                  L55: {
                                                    if (var26 != 25) {
                                                      if (var26 != 3) {
                                                        if (var26 != 4) {
                                                          L56: {
                                                            if (var26 == 5) {
                                                              break L56;
                                                            } else {
                                                              if (var26 == 22) {
                                                                break L56;
                                                              } else {
                                                                if (var26 == 6) {
                                                                  if (var39.field_I > 0) {
                                                                    break L33;
                                                                  } else {
                                                                    jj.a(16, var39);
                                                                    break L33;
                                                                  }
                                                                } else {
                                                                  if (var26 != 7) {
                                                                    if (var26 != 8) {
                                                                      L57: {
                                                                        if (var26 != 10) {
                                                                          if (var26 == 129) {
                                                                            break L57;
                                                                          } else {
                                                                            if (var26 == 131) {
                                                                              break L57;
                                                                            } else {
                                                                              if (var26 == 133) {
                                                                                break L57;
                                                                              } else {
                                                                                L58: {
                                                                                  if (var26 == 11) {
                                                                                    break L58;
                                                                                  } else {
                                                                                    if (var26 == 128) {
                                                                                      break L58;
                                                                                    } else {
                                                                                      if (var26 == 130) {
                                                                                        break L58;
                                                                                      } else {
                                                                                        if (var26 != 132) {
                                                                                          if (20 == var26) {
                                                                                            int discarded$8 = 0;
                                                                                            sj.a(var9, var39, var4, var16);
                                                                                            break L33;
                                                                                          } else {
                                                                                            if (21 == var26) {
                                                                                              if (var39.field_I > 0) {
                                                                                                var48[var16] = 2;
                                                                                                break L33;
                                                                                              } else {
                                                                                                L59: {
                                                                                                  if (var48[var16] == 2) {
                                                                                                    var48[var16] = 0;
                                                                                                    break L59;
                                                                                                  } else {
                                                                                                    break L59;
                                                                                                  }
                                                                                                }
                                                                                                ln.field_a.field_y[var16] = 146;
                                                                                                var39.field_i = -1;
                                                                                                break L33;
                                                                                              }
                                                                                            } else {
                                                                                              if (var26 == 12) {
                                                                                                ja.a(var39, (byte) 113, var15_ref_oc);
                                                                                                break L33;
                                                                                              } else {
                                                                                                if (var26 != 13) {
                                                                                                  if (var26 == 14) {
                                                                                                    var48[var16] = 2;
                                                                                                    var9[-1 + var16] = 2;
                                                                                                    var9[var16 - var4] = 2;
                                                                                                    var9[var16 - var4 + -1] = 2;
                                                                                                    break L33;
                                                                                                  } else {
                                                                                                    if (15 == var26) {
                                                                                                      ra.a(1, var48, var16, var39, var49);
                                                                                                      break L33;
                                                                                                    } else {
                                                                                                      L60: {
                                                                                                        if (var26 != 16) {
                                                                                                          if (229 == var26) {
                                                                                                            break L60;
                                                                                                          } else {
                                                                                                            if (17 != var26) {
                                                                                                              if (var26 != 227) {
                                                                                                                if (var26 != 226) {
                                                                                                                  if (var26 == 228) {
                                                                                                                    break L60;
                                                                                                                  } else {
                                                                                                                    if (var26 != 232) {
                                                                                                                      if (var26 == 125) {
                                                                                                                        if (var39.field_I > 0) {
                                                                                                                          break L33;
                                                                                                                        } else {
                                                                                                                          L61: {
                                                                                                                            if (bm.field_c != 0) {
                                                                                                                              break L61;
                                                                                                                            } else {
                                                                                                                              if (0 == rl.field_c) {
                                                                                                                                var39.field_I = 100;
                                                                                                                                break L33;
                                                                                                                              } else {
                                                                                                                                break L61;
                                                                                                                              }
                                                                                                                            }
                                                                                                                          }
                                                                                                                          int discarded$9 = 19;
                                                                                                                          lc.a(var39);
                                                                                                                          break L33;
                                                                                                                        }
                                                                                                                      } else {
                                                                                                                        if (231 == var26) {
                                                                                                                          if (var39.field_I > 0) {
                                                                                                                            break L33;
                                                                                                                          } else {
                                                                                                                            var39.c((byte) 64);
                                                                                                                            var26 = 0;
                                                                                                                            L62: while (true) {
                                                                                                                              if (var26 >= 10) {
                                                                                                                                int discarded$10 = 1;
                                                                                                                                tk.a(3, jc.field_c, 32);
                                                                                                                                jh.a(uh.field_i * 3 / 2, (byte) 118, 47, jc.field_c, 3);
                                                                                                                                break L33;
                                                                                                                              } else {
                                                                                                                                mm.field_m[el.field_j] = new oj(var39.field_j, 3, rl.field_c);
                                                                                                                                el.field_j = el.field_j + 1;
                                                                                                                                var26++;
                                                                                                                                continue L62;
                                                                                                                              }
                                                                                                                            }
                                                                                                                          }
                                                                                                                        } else {
                                                                                                                          break L33;
                                                                                                                        }
                                                                                                                      }
                                                                                                                    } else {
                                                                                                                      break L60;
                                                                                                                    }
                                                                                                                  }
                                                                                                                } else {
                                                                                                                  var39.field_e = var39.field_e - 1;
                                                                                                                  if (var39.field_e > -3000) {
                                                                                                                    break L33;
                                                                                                                  } else {
                                                                                                                    var39.field_i = -1;
                                                                                                                    break L33;
                                                                                                                  }
                                                                                                                }
                                                                                                              } else {
                                                                                                                break L60;
                                                                                                              }
                                                                                                            } else {
                                                                                                              var39.field_e = var39.field_e - 1;
                                                                                                              if (var39.field_e > -3000) {
                                                                                                                break L33;
                                                                                                              } else {
                                                                                                                var39.field_i = -1;
                                                                                                                break L33;
                                                                                                              }
                                                                                                            }
                                                                                                          }
                                                                                                        } else {
                                                                                                          break L60;
                                                                                                        }
                                                                                                      }
                                                                                                      var39.field_e = var39.field_e - 1;
                                                                                                      if (var39.field_e > -3000) {
                                                                                                        break L33;
                                                                                                      } else {
                                                                                                        var39.field_i = -1;
                                                                                                        break L33;
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                } else {
                                                                                                  var48[var16] = 2;
                                                                                                  var9[-1 + var16] = 2;
                                                                                                  var9[var16 + -var4] = 2;
                                                                                                  var9[var16 - var4 + -1] = 2;
                                                                                                  break L33;
                                                                                                }
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                        } else {
                                                                                          ql.a(var20, -75, var6, var39, true);
                                                                                          break L33;
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                                ql.a(var20, -75, var6, var39, true);
                                                                                break L33;
                                                                              }
                                                                            }
                                                                          }
                                                                        } else {
                                                                          break L57;
                                                                        }
                                                                      }
                                                                      ql.a(var20, -125, var6, var39, false);
                                                                      break L33;
                                                                    } else {
                                                                      L63: {
                                                                        if (1 != bm.field_c) {
                                                                          break L63;
                                                                        } else {
                                                                          if (rl.field_c != -1) {
                                                                            break L63;
                                                                          } else {
                                                                            qj.a(-121, var13, param1, var40);
                                                                            break L33;
                                                                          }
                                                                        }
                                                                      }
                                                                      if (null == vi.field_p) {
                                                                        vh.a(var5, 5, var39);
                                                                        break L33;
                                                                      } else {
                                                                        int discarded$11 = 0;
                                                                        u.a(param1, var40, var13);
                                                                        break L33;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    L64: {
                                                                      if (ha.field_t == 0) {
                                                                        break L64;
                                                                      } else {
                                                                        if (14 == ha.field_t) {
                                                                          break L64;
                                                                        } else {
                                                                          if (ha.field_t != 17) {
                                                                            break L33;
                                                                          } else {
                                                                            break L64;
                                                                          }
                                                                        }
                                                                      }
                                                                    }
                                                                    var39.field_I = 10;
                                                                    var39.field_b = true;
                                                                    var39.field_i = 1;
                                                                    var39.field_C = l.a(-28, var39.field_i);
                                                                    break L33;
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                          ab.a(var4, false, var6, var15_ref_oc, var16, var23, var40, var39, var21, var11, var10);
                                                          break L33;
                                                        } else {
                                                          oj.a(var39, var15_ref_oc, var11, var23, var10, var21, true);
                                                          break L33;
                                                        }
                                                      } else {
                                                        break L55;
                                                      }
                                                    } else {
                                                      break L55;
                                                    }
                                                  }
                                                  L65: {
                                                    if (1 != bm.field_c) {
                                                      break L65;
                                                    } else {
                                                      if (rl.field_c != -1) {
                                                        break L65;
                                                      } else {
                                                        qj.a(-97, var13, param1, var40);
                                                        break L33;
                                                      }
                                                    }
                                                  }
                                                  df.a(3, var39, var40, var6, var11, var10, var21, var5, var15_ref_oc, var23);
                                                  break L33;
                                                }
                                              } else {
                                                pl.a((byte) 126, var39, var16);
                                                break L33;
                                              }
                                            } else {
                                              break L54;
                                            }
                                          } else {
                                            break L54;
                                          }
                                        }
                                        if (bm.field_c != 1) {
                                          break L33;
                                        } else {
                                          if (rl.field_c == -1) {
                                            qj.a(-124, var13, param1, var40);
                                            break L33;
                                          } else {
                                            break L33;
                                          }
                                        }
                                      } else {
                                        L66: {
                                          if (var39.field_I <= 0) {
                                            break L66;
                                          } else {
                                            if (ln.field_a.field_i[var16] > 0) {
                                              break L66;
                                            } else {
                                              if (ln.field_a.field_i[var16 - 1] > 0) {
                                                break L66;
                                              } else {
                                                if (ln.field_a.field_i[-1 + (-ln.field_a.field_d + var16)] > 0) {
                                                  break L66;
                                                } else {
                                                  cf.a(param1, (byte) 124, var13, var40);
                                                  var48[var16] = 4;
                                                  break L33;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        var48[var16] = 0;
                                        var39.a(false, 0, 21963, 1, rl.field_c, var15_ref_oc);
                                        break L33;
                                      }
                                    }
                                  }
                                }
                                qj.a(-90, var13, param1, var40);
                                break L33;
                              }
                            }
                          } else {
                            L67: {
                              var26 = var39.field_j.field_g * 24;
                              if (~(uj.field_p.field_g + -24) < ~var26) {
                                break L67;
                              } else {
                                if (var26 >= 480 + uj.field_p.field_g) {
                                  break L67;
                                } else {
                                  jn.field_F[ib.field_c].field_c = 256.0 * Math.random();
                                  jn.field_F[ib.field_c].field_j.a((byte) 46, var39.field_j);
                                  jn.field_F[ib.field_c].field_l.a(var39.field_l, -28860);
                                  jn.field_F[ib.field_c].field_l.field_f = jn.field_F[ib.field_c].field_l.field_f + (Math.random() + -0.5);
                                  jn.field_F[ib.field_c].field_e = 0;
                                  jn.field_F[ib.field_c].field_h = 0;
                                  jn.field_F[ib.field_c].field_i = 6;
                                  ib.field_c = ib.field_c + 1;
                                  break L67;
                                }
                              }
                            }
                            L68: {
                              ln.field_a.field_c[var39.field_j.b(bm.a(61, -63))] = 4;
                              if (0 != (em.field_c & 7)) {
                                break L68;
                              } else {
                                var27 = (int)((-var39.field_l.field_f + (var21 + (double)var10 - (double)var15_ref_oc.field_e)) * 24.0);
                                var28 = (int)(24.0 * (var23 + (double)var11 - (double)var15_ref_oc.field_g - var39.field_l.field_a));
                                var29 = (int)Math.sqrt((double)(var27 * var27 + var28 * var28));
                                if (var29 > 400) {
                                  break L68;
                                } else {
                                  var30 = 400 + -var29;
                                  if (mg.field_c >= var30) {
                                    break L68;
                                  } else {
                                    mg.field_c = var30;
                                    break L33;
                                  }
                                }
                              }
                            }
                            break L33;
                          }
                        }
                      }
                      L69: {
                        if (27 == var39.field_i) {
                          L70: {
                            var48[var16] = 6;
                            if (var9[var16 - 1] != 0) {
                              break L70;
                            } else {
                              var9[-1 + var16] = 6;
                              break L70;
                            }
                          }
                          L71: {
                            if (0 == var9[-ln.field_a.field_d + var16]) {
                              var9[-ln.field_a.field_d + var16] = 6;
                              break L71;
                            } else {
                              break L71;
                            }
                          }
                          if (var9[var16 - ln.field_a.field_d + -1] == 0) {
                            var9[-1 + var16 - ln.field_a.field_d] = 6;
                            break L69;
                          } else {
                            break L69;
                          }
                        } else {
                          break L69;
                        }
                      }
                      if (var39.field_i <= 0) {
                        break L28;
                      } else {
                        if (var39.field_i == 7) {
                          break L28;
                        } else {
                          L72: {
                            if (var39.field_i < 10) {
                              break L72;
                            } else {
                              if (var39.field_i == 22) {
                                break L72;
                              } else {
                                if (var39.field_i == 231) {
                                  break L72;
                                } else {
                                  break L28;
                                }
                              }
                            }
                          }
                          if (2 != var39.field_i) {
                            L73: {
                              if (var39.field_i == 5) {
                                break L73;
                              } else {
                                if (var39.field_i == 22) {
                                  break L73;
                                } else {
                                  L74: {
                                    L75: {
                                      if (!var39.field_b) {
                                        break L75;
                                      } else {
                                        if (var39.field_i != 225) {
                                          break L74;
                                        } else {
                                          break L75;
                                        }
                                      }
                                    }
                                    if (var39.field_i == 231) {
                                      break L74;
                                    } else {
                                      if (0 != var39.field_i) {
                                        L76: {
                                          var48[var16] = 3;
                                          if (var9[1 + var16] != 0) {
                                            break L76;
                                          } else {
                                            var9[var16 - -1] = 1;
                                            break L76;
                                          }
                                        }
                                        if (var9[var16 - -ln.field_a.field_d] == 0) {
                                          var9[ln.field_a.field_d + var16] = 1;
                                          break L28;
                                        } else {
                                          break L28;
                                        }
                                      } else {
                                        break L28;
                                      }
                                    }
                                  }
                                  var48[var16] = 5;
                                  break L28;
                                }
                              }
                            }
                            var9[var15_ref_oc.b(-4)] = 4;
                            break L28;
                          } else {
                            if (r.field_a != 0) {
                              break L28;
                            } else {
                              if (var39.field_F > 250) {
                                var48[var16] = 3;
                                break L28;
                              } else {
                                break L28;
                              }
                            }
                          }
                        }
                      }
                    } else {
                      break L28;
                    }
                  }
                }
                var13++;
                continue L2;
              }
            }
          } else {
            var9[mm.field_m[var13].field_j.b(-4)] = 0;
            var13++;
            continue L1;
          }
        }
    }

    final bm a(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        ii var4 = null;
        bm stackIn_3_0 = null;
        bm stackIn_8_0 = null;
        bm stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        bm stackOut_2_0 = null;
        bm stackOut_7_0 = null;
        bm stackOut_12_0 = null;
        bm stackOut_11_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            var3_int = -120 / ((param1 - 3) / 42);
            if (((hd) this).field_o.a(param0, (byte) -117) == bi.field_d) {
              stackOut_2_0 = bi.field_d;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              L1: {
                if (param0.equals((Object) (Object) ((hd) this).field_p)) {
                  break L1;
                } else {
                  var4 = nd.a(3888, param0);
                  if (!var4.d((byte) -22)) {
                    stackOut_7_0 = m.field_n;
                    stackIn_8_0 = stackOut_7_0;
                    return stackIn_8_0;
                  } else {
                    ((hd) this).field_p = param0;
                    ((hd) this).field_s = var4.a(17539);
                    break L1;
                  }
                }
              }
              L2: {
                if (((hd) this).field_s) {
                  stackOut_12_0 = nd.field_d;
                  stackIn_13_0 = stackOut_12_0;
                  break L2;
                } else {
                  stackOut_11_0 = bi.field_d;
                  stackIn_13_0 = stackOut_11_0;
                  break L2;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3;
            stackOut_14_1 = new StringBuilder().append("hd.L(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param1 + ')');
        }
        return stackIn_13_0;
    }

    hd(ig param0, ig param1) {
        super(param0);
        ((hd) this).field_p = "";
        ((hd) this).field_s = false;
        try {
            ((hd) this).field_o = new li(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "hd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final String a(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        String stackOut_6_0 = null;
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
            if (((hd) this).field_o.a(param1, (byte) -107) == bi.field_d) {
              stackOut_2_0 = ((hd) this).field_o.a((byte) 19, param1);
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              var3_int = -8 / ((-24 - param0) / 35);
              if (((hd) this).a(param1, (byte) -54) == bi.field_d) {
                stackOut_6_0 = ld.field_r;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                return ak.field_g;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("hd.K(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
        return stackIn_7_0;
    }

    final static void a(int param0, int param1, oj param2, int param3) {
        int var5_int = 0;
        int var6 = 0;
        double var7_double = 0.0;
        int var7_int = 0;
        bd[] var7 = null;
        double var8_double = 0.0;
        int var8 = 0;
        double var9_double = 0.0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        oj var16 = null;
        int stackIn_127_0 = 0;
        int stackIn_160_0 = 0;
        int stackIn_306_0 = 0;
        int stackOut_126_0 = 0;
        int stackOut_125_0 = 0;
        int stackOut_159_0 = 0;
        int stackOut_158_0 = 0;
        int stackOut_304_0 = 0;
        int stackOut_305_0 = 0;
        L0: {
          var15 = HostileSpawn.field_I ? 1 : 0;
          ln.field_a.field_c[param3] = 0;
          if (param2.field_t <= 0) {
            break L0;
          } else {
            if (!dl.field_l) {
              boolean[] discarded$7 = param2.field_l.a(param2.field_t, param2.field_K, param2.field_j, false, ln.field_a);
              param2.b((byte) 117);
              param2.field_t = param2.field_t - 1;
              break L0;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (of.field_h != null) {
            break L1;
          } else {
            if (jf.field_c == 0) {
              L2: {
                if (bm.field_c != 0) {
                  break L2;
                } else {
                  if (rl.field_c != 5) {
                    break L2;
                  } else {
                    if (param0 < 46) {
                      break L2;
                    } else {
                      if (param0 > 56) {
                        break L2;
                      } else {
                        if (param1 > 9) {
                          break L2;
                        } else {
                          var6 = 0;
                          var5_int = 0;
                          L3: while (true) {
                            if (var5_int >= mm.field_m.length) {
                              if (var6 < 2) {
                                break L2;
                              } else {
                                param2.field_I = 0;
                                ci.a(100, 55);
                                break L2;
                              }
                            } else {
                              L4: {
                                var16 = mm.field_m[var5_int];
                                if (var16 == null) {
                                  break L4;
                                } else {
                                  if (var16.field_j.field_g >= 15) {
                                    break L4;
                                  } else {
                                    if (var16.field_I <= 0) {
                                      break L4;
                                    } else {
                                      L5: {
                                        if (var16.field_i == 5) {
                                          break L5;
                                        } else {
                                          if (var16.field_i == 22) {
                                            break L5;
                                          } else {
                                            break L4;
                                          }
                                        }
                                      }
                                      var6++;
                                      break L4;
                                    }
                                  }
                                }
                              }
                              var5_int++;
                              continue L3;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              L6: {
                if (pj.field_v != 4) {
                  break L6;
                } else {
                  param2.field_c = param2.field_c - 128.0;
                  boolean[] discarded$8 = param2.b(-27757, je.field_a[1], ln.field_a);
                  param2.field_c = param2.field_c + 128.0;
                  break L6;
                }
              }
              L7: {
                var6 = 0;
                if (dl.field_l) {
                  fj.field_Pb = 0.0;
                  var6 = 1;
                  break L7;
                } else {
                  if (qh.field_m[la.field_g]) {
                    L8: {
                      fj.field_Pb = (double)(int)param2.field_c;
                      if (qh.field_m[aa.field_a]) {
                        fj.field_Pb = fj.field_Pb + 32.0;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    var6 = 1;
                    if (qh.field_m[fj.field_Ob]) {
                      fj.field_Pb = fj.field_Pb - 32.0;
                      break L7;
                    } else {
                      break L7;
                    }
                  } else {
                    if (qh.field_m[jh.field_fb]) {
                      L9: {
                        fj.field_Pb = (double)(int)(param2.field_c + 128.0);
                        if (!qh.field_m[aa.field_a]) {
                          break L9;
                        } else {
                          fj.field_Pb = fj.field_Pb - 32.0;
                          break L9;
                        }
                      }
                      L10: {
                        if (qh.field_m[fj.field_Ob]) {
                          fj.field_Pb = fj.field_Pb + 32.0;
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                      var6 = 1;
                      break L7;
                    } else {
                      if (!qh.field_m[aa.field_a]) {
                        if (!qh.field_m[fj.field_Ob]) {
                          if (qh.field_m[ln.field_q]) {
                            L11: {
                              fj.field_Pb = 0.0;
                              if (!qh.field_m[ha.field_v]) {
                                break L11;
                              } else {
                                fj.field_Pb = fj.field_Pb + 32.0;
                                break L11;
                              }
                            }
                            L12: {
                              if (qh.field_m[bh.field_b]) {
                                fj.field_Pb = fj.field_Pb - 32.0;
                                break L12;
                              } else {
                                break L12;
                              }
                            }
                            var6 = 1;
                            break L7;
                          } else {
                            if (!qh.field_m[fj.field_Jb]) {
                              if (qh.field_m[ha.field_v]) {
                                var6 = 1;
                                fj.field_Pb = 64.0;
                                break L7;
                              } else {
                                if (qh.field_m[bh.field_b]) {
                                  fj.field_Pb = 192.0;
                                  var6 = 1;
                                  break L7;
                                } else {
                                  break L7;
                                }
                              }
                            } else {
                              L13: {
                                fj.field_Pb = 128.0;
                                if (qh.field_m[ha.field_v]) {
                                  fj.field_Pb = fj.field_Pb - 32.0;
                                  break L13;
                                } else {
                                  break L13;
                                }
                              }
                              L14: {
                                if (!qh.field_m[bh.field_b]) {
                                  break L14;
                                } else {
                                  fj.field_Pb = fj.field_Pb + 32.0;
                                  break L14;
                                }
                              }
                              var6 = 1;
                              break L7;
                            }
                          }
                        } else {
                          fj.field_Pb = (double)(int)(192.0 + param2.field_c);
                          var6 = 1;
                          break L7;
                        }
                      } else {
                        fj.field_Pb = (double)(int)(64.0 + param2.field_c);
                        var6 = 1;
                        break L7;
                      }
                    }
                  }
                }
              }
              L15: {
                if (dn.field_i == of.field_d) {
                  L16: {
                    var6 = 0;
                    var7_double = (double)param2.field_j.field_e + param2.field_l.field_f - vi.field_h;
                    param2.field_c = (double)qi.field_N;
                    var9_double = -bc.field_i + ((double)param2.field_j.field_g + param2.field_l.field_a);
                    if (0.1 < var7_double) {
                      param2.field_l.field_f = param2.field_l.field_f - 0.1;
                      break L16;
                    } else {
                      if (-0.1 > var7_double) {
                        param2.field_l.field_f = param2.field_l.field_f + 0.1;
                        break L16;
                      } else {
                        param2.field_l.field_f = param2.field_l.field_f - var7_double;
                        break L16;
                      }
                    }
                  }
                  L17: {
                    if (var9_double <= 0.1) {
                      if (-0.1 <= var9_double) {
                        param2.field_l.field_a = param2.field_l.field_a - var9_double;
                        break L17;
                      } else {
                        param2.field_l.field_a = param2.field_l.field_a + 0.1;
                        break L17;
                      }
                    } else {
                      param2.field_l.field_a = param2.field_l.field_a - 0.1;
                      break L17;
                    }
                  }
                  param2.b((byte) 117);
                  if (!HostileSpawn.field_F) {
                    break L15;
                  } else {
                    if (0 != param2.field_p) {
                      break L15;
                    } else {
                      if (dn.field_b == 15) {
                        eh.field_c.a(fg.field_b[22], 100, uh.field_i);
                        break L15;
                      } else {
                        break L15;
                      }
                    }
                  }
                } else {
                  break L15;
                }
              }
              L18: {
                var7_int = je.field_a[1];
                if (bh.field_d <= 0) {
                  break L18;
                } else {
                  var7_int = (int)((double)var7_int * 1.5);
                  break L18;
                }
              }
              L19: {
                if (var6 != 0) {
                  var8_double = param2.field_c;
                  param2.field_c = fj.field_Pb;
                  li.field_r = param2.b(-27757, var7_int, ln.field_a);
                  param2.field_c = var8_double;
                  break L19;
                } else {
                  break L19;
                }
              }
              L20: {
                if (var6 == 0) {
                  break L20;
                } else {
                  L21: {
                    if (!li.field_r[0]) {
                      break L21;
                    } else {
                      if (!li.field_r[1]) {
                        break L21;
                      } else {
                        var6 = 0;
                        break L20;
                      }
                    }
                  }
                  if (!li.field_r[1]) {
                    if (li.field_r[0]) {
                      L22: {
                        if (64.0 == fj.field_Pb) {
                          break L22;
                        } else {
                          if (fj.field_Pb != 192.0) {
                            L23: {
                              if (64.0 > fj.field_Pb) {
                                break L23;
                              } else {
                                if (fj.field_Pb <= 192.0) {
                                  fj.field_Pb = 128.0;
                                  break L20;
                                } else {
                                  break L23;
                                }
                              }
                            }
                            fj.field_Pb = 0.0;
                            break L20;
                          } else {
                            break L22;
                          }
                        }
                      }
                      var6 = 0;
                      break L20;
                    } else {
                      break L20;
                    }
                  } else {
                    L24: {
                      if (0.0 == fj.field_Pb) {
                        break L24;
                      } else {
                        if (fj.field_Pb != 128.0) {
                          if (fj.field_Pb < 128.0) {
                            fj.field_Pb = 64.0;
                            break L20;
                          } else {
                            fj.field_Pb = 192.0;
                            break L20;
                          }
                        } else {
                          break L24;
                        }
                      }
                    }
                    var6 = 0;
                    break L20;
                  }
                }
              }
              L25: {
                L26: {
                  var8 = 0;
                  if (var6 == 0) {
                    break L26;
                  } else {
                    L27: {
                      var9 = (int)(fj.field_Pb - param2.field_c);
                      var9 = var9 & 255;
                      var10 = 32;
                      var11 = 224;
                      var12 = 96;
                      var13 = 160;
                      var14 = nh.field_H;
                      if (1 == var14) {
                        var11 -= 4;
                        var10 += 4;
                        break L27;
                      } else {
                        if (var14 != 2) {
                          if (4 == var14) {
                            var12 -= 4;
                            var13 += 4;
                            break L27;
                          } else {
                            if (3 == var14) {
                              var13 -= 4;
                              var11 += 4;
                              break L27;
                            } else {
                              L28: {
                                L29: {
                                  if (~var10 <= ~var9) {
                                    break L29;
                                  } else {
                                    if (var11 <= var9) {
                                      break L29;
                                    } else {
                                      if (var12 > var9) {
                                        var8 = 2;
                                        break L28;
                                      } else {
                                        if (~var9 >= ~var13) {
                                          var8 = 4;
                                          break L28;
                                        } else {
                                          var8 = 3;
                                          break L28;
                                        }
                                      }
                                    }
                                  }
                                }
                                var8 = 1;
                                break L28;
                              }
                              L30: {
                                if (~var8 == ~nh.field_H) {
                                  stackOut_126_0 = 0;
                                  stackIn_127_0 = stackOut_126_0;
                                  break L30;
                                } else {
                                  stackOut_125_0 = 1;
                                  stackIn_127_0 = stackOut_125_0;
                                  break L30;
                                }
                              }
                              L31: {
                                var9 = stackIn_127_0;
                                if (var9 == 0) {
                                  break L31;
                                } else {
                                  if (var8 != 0) {
                                    break L31;
                                  } else {
                                    if (nh.field_H == 1) {
                                      if (6 == cg.field_b) {
                                        break L31;
                                      } else {
                                        if (7 == cg.field_b) {
                                          break L31;
                                        } else {
                                          if (cg.field_b == 18) {
                                            break L31;
                                          } else {
                                            if (cg.field_b == 19) {
                                              break L31;
                                            } else {
                                              fj.field_Pb = param2.field_c;
                                              var9 = 0;
                                              break L31;
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      break L31;
                                    }
                                  }
                                }
                              }
                              L32: {
                                if (var9 == 0) {
                                  break L32;
                                } else {
                                  L33: {
                                    L34: {
                                      if (var8 == 1) {
                                        break L34;
                                      } else {
                                        if (4 == var8) {
                                          break L34;
                                        } else {
                                          cg.field_b = 0;
                                          break L33;
                                        }
                                      }
                                    }
                                    cg.field_b = 6;
                                    break L33;
                                  }
                                  nh.field_H = var8;
                                  break L32;
                                }
                              }
                              fj.field_Pb = fj.field_Pb + (double)(-li.field_u[nh.field_H] + 256);
                              L35: while (true) {
                                if (256.0 > fj.field_Pb) {
                                  break L25;
                                } else {
                                  fj.field_Pb = fj.field_Pb - 256.0;
                                  continue L35;
                                }
                              }
                            }
                          }
                        } else {
                          var10 -= 4;
                          var12 += 4;
                          break L27;
                        }
                      }
                    }
                    L36: {
                      if (~var10 <= ~var9) {
                        break L36;
                      } else {
                        if (var11 <= var9) {
                          break L36;
                        } else {
                          if (var12 > var9) {
                            var8 = 2;
                            break L26;
                          } else {
                            if (~var9 >= ~var13) {
                              var8 = 4;
                              break L26;
                            } else {
                              var8 = 3;
                              break L26;
                            }
                          }
                        }
                      }
                    }
                    var8 = 1;
                    break L26;
                  }
                }
                L37: {
                  if (~var8 == ~nh.field_H) {
                    stackOut_159_0 = 0;
                    stackIn_160_0 = stackOut_159_0;
                    break L37;
                  } else {
                    stackOut_158_0 = 1;
                    stackIn_160_0 = stackOut_158_0;
                    break L37;
                  }
                }
                L38: {
                  var9 = stackIn_160_0;
                  if (var9 == 0) {
                    break L38;
                  } else {
                    if (var8 != 0) {
                      break L38;
                    } else {
                      if (nh.field_H == 1) {
                        if (6 == cg.field_b) {
                          break L38;
                        } else {
                          if (7 == cg.field_b) {
                            break L38;
                          } else {
                            if (cg.field_b == 18) {
                              break L38;
                            } else {
                              if (cg.field_b == 19) {
                                break L38;
                              } else {
                                fj.field_Pb = param2.field_c;
                                var9 = 0;
                                break L38;
                              }
                            }
                          }
                        }
                      } else {
                        break L38;
                      }
                    }
                  }
                }
                L39: {
                  if (var9 == 0) {
                    break L39;
                  } else {
                    L40: {
                      L41: {
                        if (var8 == 1) {
                          break L41;
                        } else {
                          if (4 == var8) {
                            break L41;
                          } else {
                            cg.field_b = 0;
                            break L40;
                          }
                        }
                      }
                      cg.field_b = 6;
                      break L40;
                    }
                    nh.field_H = var8;
                    break L39;
                  }
                }
                fj.field_Pb = fj.field_Pb + (double)(-li.field_u[nh.field_H] + 256);
                L42: while (true) {
                  if (256.0 > fj.field_Pb) {
                    break L25;
                  } else {
                    fj.field_Pb = fj.field_Pb - 256.0;
                    continue L42;
                  }
                }
              }
              L43: while (true) {
                if (0.0 <= fj.field_Pb) {
                  L44: {
                    if (!dl.field_l) {
                      break L44;
                    } else {
                      fj.field_Pb = 0.0;
                      break L44;
                    }
                  }
                  L45: {
                    if (nh.field_H == 0) {
                      break L45;
                    } else {
                      L46: {
                        if (cg.field_b != 3) {
                          break L46;
                        } else {
                          if (param2.field_p != 0) {
                            break L46;
                          } else {
                            eh.field_c.a(em.field_a[11], 100, uh.field_i);
                            break L45;
                          }
                        }
                      }
                      if (cg.field_b != 15) {
                        break L45;
                      } else {
                        if (param2.field_p == 1) {
                          if (uj.field_l != 1) {
                            break L45;
                          } else {
                            eh.field_c.a(em.field_a[12], 100, uh.field_i);
                            break L45;
                          }
                        } else {
                          break L45;
                        }
                      }
                    }
                  }
                  L47: {
                    param2.field_p = param2.field_p + 1;
                    if (!re.field_l) {
                      break L47;
                    } else {
                      int discarded$9 = 192;
                      wk.b();
                      break L47;
                    }
                  }
                  nd.a(ln.field_a.field_h[param3], param2, 18459);
                  break L1;
                } else {
                  fj.field_Pb = fj.field_Pb + 256.0;
                  continue L43;
                }
              }
            } else {
              break L1;
            }
          }
        }
        L48: {
          if (um.field_e <= 0) {
            break L48;
          } else {
            if (mc.field_I == 4) {
              break L48;
            } else {
              L49: {
                um.field_e = um.field_e - 1;
                var6 = ba.a((byte) 87);
                if (~var6 < ~eh.field_g) {
                  eh.field_g = eh.field_g + 1;
                  break L49;
                } else {
                  break L49;
                }
              }
              if (-eh.field_g + var6 <= um.field_e) {
                break L48;
              } else {
                eh.field_g = eh.field_g + (-eh.field_g + var6) / Math.max(um.field_e, 1);
                break L48;
              }
            }
          }
        }
        L50: {
          if (0 > ri.field_h) {
            var6 = ig.field_L;
            if (1 == var6) {
              fh.field_c[0] = true;
              fh.field_c[1] = false;
              break L50;
            } else {
              if (var6 == 2) {
                fh.field_c[1] = true;
                fh.field_c[0] = false;
                break L50;
              } else {
                if ((1 & el.field_m) == 0) {
                  if ((4 & el.field_m) == 0) {
                    fh.field_c[1] = false;
                    fh.field_c[0] = false;
                    break L50;
                  } else {
                    fh.field_c[0] = false;
                    fh.field_c[1] = true;
                    break L50;
                  }
                } else {
                  fh.field_c[0] = true;
                  fh.field_c[1] = false;
                  break L50;
                }
              }
            }
          } else {
            L51: {
              if (1 != pf.field_o) {
                if (pf.field_o == 2) {
                  boolean discarded$10 = t.a(-128, 1, ri.field_h);
                  break L51;
                } else {
                  break L51;
                }
              } else {
                boolean discarded$11 = t.a(35, 0, ri.field_h);
                break L51;
              }
            }
            fh.field_c[1] = false;
            fh.field_c[0] = false;
            break L50;
          }
        }
        L52: {
          if (nh.field_M <= 0) {
            break L52;
          } else {
            nh.field_M = nh.field_M - 1;
            if (nh.field_M != 0) {
              break L52;
            } else {
              dn.field_j = -1;
              break L52;
            }
          }
        }
        L53: {
          var6 = -1;
          if (of.field_d == dn.field_i) {
            hf.field_i = -1;
            break L53;
          } else {
            L54: {
              if (ci.field_a[0] > 0) {
                break L54;
              } else {
                if (0 >= ci.field_a[1]) {
                  hf.field_i = -1;
                  break L54;
                } else {
                  break L54;
                }
              }
            }
            L55: {
              if (0 < d.field_u) {
                L56: {
                  d.field_u = d.field_u - 1;
                  if (kh.field_U[0] != 3) {
                    break L56;
                  } else {
                    if (kh.field_ib[an.field_r[kh.field_U[0]]] > 0) {
                      kh.field_ib[an.field_r[kh.field_U[0]]] = kh.field_ib[an.field_r[kh.field_U[0]]] - 1;
                      ci.field_a[0] = ld.a(-44, kh.field_U[0]);
                      var6 = kh.field_U[0];
                      hf.field_i = var6;
                      break L56;
                    } else {
                      break L56;
                    }
                  }
                }
                if (kh.field_U[1] != 3) {
                  break L55;
                } else {
                  if (kh.field_ib[an.field_r[kh.field_U[1]]] <= 0) {
                    break L55;
                  } else {
                    kh.field_ib[an.field_r[kh.field_U[1]]] = kh.field_ib[an.field_r[kh.field_U[1]]] - 1;
                    ci.field_a[1] = ld.a(-11, kh.field_U[1]);
                    var6 = kh.field_U[1];
                    hf.field_i = var6;
                    break L55;
                  }
                }
              } else {
                break L55;
              }
            }
            L57: {
              if (ci.field_a[0] <= 0) {
                if (null != of.field_h) {
                  break L57;
                } else {
                  if (jf.field_c != 0) {
                    break L57;
                  } else {
                    if (0 < kh.field_U[0]) {
                      L58: {
                        if (!fh.field_c[0]) {
                          break L58;
                        } else {
                          if (kh.field_ib[an.field_r[kh.field_U[0]]] <= 0) {
                            ci.field_a[0] = ld.a(-7, 0);
                            var6 = 0;
                            break L58;
                          } else {
                            break L58;
                          }
                        }
                      }
                      if (!fh.field_c[0]) {
                        break L57;
                      } else {
                        if (kh.field_ib[an.field_r[kh.field_U[0]]] <= 0) {
                          break L57;
                        } else {
                          kh.field_ib[an.field_r[kh.field_U[0]]] = kh.field_ib[an.field_r[kh.field_U[0]]] - 1;
                          ci.field_a[0] = ld.a(-25, kh.field_U[0]);
                          var6 = kh.field_U[0];
                          break L57;
                        }
                      }
                    } else {
                      if (!fh.field_c[0]) {
                        break L57;
                      } else {
                        if (dn.field_j < 2) {
                          L59: {
                            ci.field_a[0] = ld.a(bm.a(0, -39), 0);
                            if (kh.field_U[1] == 0) {
                              ci.field_a[1] = ci.field_a[0];
                              break L59;
                            } else {
                              break L59;
                            }
                          }
                          var6 = 0;
                          break L57;
                        } else {
                          break L57;
                        }
                      }
                    }
                  }
                }
              } else {
                ci.field_a[0] = ci.field_a[0] - 1;
                if (!fh.field_c[0]) {
                  break L57;
                } else {
                  L60: {
                    if (an.field_r[kh.field_U[0]] < 0) {
                      break L60;
                    } else {
                      if (kh.field_ib[an.field_r[kh.field_U[0]]] > 0) {
                        break L60;
                      } else {
                        break L57;
                      }
                    }
                  }
                  var6 = kh.field_U[0];
                  break L57;
                }
              }
            }
            if (ci.field_a[1] <= 0) {
              if (of.field_h != null) {
                break L53;
              } else {
                if (jf.field_c != 0) {
                  break L53;
                } else {
                  if (kh.field_U[1] > 0) {
                    L61: {
                      if (!fh.field_c[1]) {
                        break L61;
                      } else {
                        if (kh.field_ib[an.field_r[kh.field_U[1]]] <= 0) {
                          ci.field_a[1] = ld.a(-104, 0);
                          var6 = 0;
                          break L61;
                        } else {
                          break L61;
                        }
                      }
                    }
                    if (!fh.field_c[1]) {
                      break L53;
                    } else {
                      if (0 < kh.field_ib[an.field_r[kh.field_U[1]]]) {
                        kh.field_ib[an.field_r[kh.field_U[1]]] = kh.field_ib[an.field_r[kh.field_U[1]]] - 1;
                        ci.field_a[1] = ld.a(-105, kh.field_U[1]);
                        var6 = kh.field_U[1];
                        break L53;
                      } else {
                        break L53;
                      }
                    }
                  } else {
                    if (!fh.field_c[1]) {
                      break L53;
                    } else {
                      if (dn.field_j >= 2) {
                        break L53;
                      } else {
                        ci.field_a[1] = ld.a(-104, 0);
                        var6 = 0;
                        if (kh.field_U[0] != 0) {
                          break L53;
                        } else {
                          ci.field_a[0] = ci.field_a[1];
                          break L53;
                        }
                      }
                    }
                  }
                }
              }
            } else {
              ci.field_a[1] = ci.field_a[1] - 1;
              if (var6 >= 0) {
                break L53;
              } else {
                if (!fh.field_c[1]) {
                  break L53;
                } else {
                  L62: {
                    if (0 > an.field_r[kh.field_U[1]]) {
                      break L62;
                    } else {
                      if (0 >= kh.field_ib[an.field_r[kh.field_U[1]]]) {
                        break L53;
                      } else {
                        break L62;
                      }
                    }
                  }
                  var6 = kh.field_U[1];
                  break L53;
                }
              }
            }
          }
        }
        L63: {
          if (var6 <= 0) {
            break L63;
          } else {
            if (kh.field_ib[an.field_r[var6]] <= 0) {
              var6 = -1;
              break L63;
            } else {
              break L63;
            }
          }
        }
        L64: {
          if (null == rc.field_c) {
            break L64;
          } else {
            if (var6 == 3) {
              break L64;
            } else {
              int discarded$12 = 119;
              boolean discarded$13 = f.a();
              eh.field_c.a(sf.field_V[36], 100, uh.field_i);
              break L64;
            }
          }
        }
        L65: {
          if (jm.field_e < 0) {
            break L65;
          } else {
            if (var6 == 1) {
              break L65;
            } else {
              L66: {
                eh.field_c.a(sf.field_V[5 - -jm.field_e], 100, uh.field_i);
                if (ag.field_k > 4) {
                  eh.field_c.a(sf.field_V[(int)(2.0 * Math.random()) + 10], 100, uh.field_i);
                  break L66;
                } else {
                  break L66;
                }
              }
              ag.field_k = 0;
              jm.field_e = -1;
              break L65;
            }
          }
        }
        L67: {
          if (we.field_b < 0) {
            break L67;
          } else {
            if (var6 == 6) {
              break L67;
            } else {
              we.field_b = -1;
              break L67;
            }
          }
        }
        L68: {
          var7 = km.field_A;
          if (nh.field_H == 0) {
            break L68;
          } else {
            var7 = cf.field_q;
            break L68;
          }
        }
        L69: {
          if (0 <= hf.field_i) {
            var7 = od.field_G;
            break L69;
          } else {
            break L69;
          }
        }
        L70: {
          L71: {
            if (of.field_d == var7) {
              break L71;
            } else {
              if (of.field_d == dn.field_i) {
                break L71;
              } else {
                stackOut_304_0 = 1;
                stackIn_306_0 = stackOut_304_0;
                break L70;
              }
            }
          }
          stackOut_305_0 = 0;
          stackIn_306_0 = stackOut_305_0;
          break L70;
        }
        L72: {
          var8 = stackIn_306_0;
          if (var8 != 0) {
            of.field_d = var7;
            dn.field_b = 0;
            break L72;
          } else {
            break L72;
          }
        }
        L73: {
          if (of.field_d != od.field_G) {
            pj.field_v = -1;
            break L73;
          } else {
            break L73;
          }
        }
        ln.field_a.field_c[param3] = 3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "This game has been updated! Please reload this page.";
    }
}
