/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hd extends hi {
    static String field_q;
    static int[] field_r;
    private String field_p;
    private li field_o;
    private boolean field_s;

    final static void a(int param0, int param1, int param2, p param3) {
        try {
            int var4_int = 5 % ((89 - param1) / 34);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "hd.F(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(gb param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        pf var5 = null;
        int[] var6 = null;
        int var7 = 0;
        en var8 = null;
        int var9 = 0;
        en var10 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var7 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            var8 = new en(param0.a("", "logo.fo3d", 0));
            var10 = var8;
            var3 = var10.l(32270);
            var10.c(false);
            ce.field_f = gj.a(param1, var10);
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
                    var6 = new int[]{var5.field_J + var5.field_d >> 481836417, var5.field_C + var5.field_a >> -749843295, var5.field_t + var5.field_D >> -294983071};
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
            stackIn_10_0 = (RuntimeException) (var2);

            stackIn_10_1 = new StringBuilder().append("hd.G(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
    }

    public static void f(int param0) {
        if (param0 != -1) {
            oj var2 = (oj) null;
            hd.a(-95, -103, (oj) null, -61, 40);
        }
        field_q = null;
        field_r = null;
    }

    final static void a(byte param0, oc param1) {
        oj dupTemp$0 = null;
        oj dupTemp$1 = null;
        og dupTemp$2 = null;
        int stackIn_116_0 = 0;
        int stackIn_161_0 = 0;
        RuntimeException stackIn_367_0 = null;
        StringBuilder stackIn_367_1 = null;
        RuntimeException stackIn_368_0 = null;
        StringBuilder stackIn_368_1 = null;
        String stackIn_368_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
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
        int var15 = 0;
        oc var15_ref_oc = null;
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
        int[] var47 = null;
        var38 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
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
              var47 = ln.field_a.field_f;
              var44 = ln.field_a.field_c;
              var41 = var44;
              var9 = var41;
              var10 = var6.field_e;
              var11 = var6.field_g;
              if (param0 == 61) {
                break L1;
              } else {
                field_q = (String) null;
                break L1;
              }
            }
            L2: {
              if ((tm.field_q ^ -1) >= -1) {
                break L2;
              } else {
                tm.field_q = tm.field_q - 1;
                break L2;
              }
            }
            var12 = 0;
            var13 = 0;
            L3: while (true) {
              if (var3 <= var13) {
                var13 = 0;
                L4: while (true) {
                  if (var3 <= var13) {
                    L5: {
                      if (var12 != 0) {
                        break L5;
                      } else {
                        if (3 == ha.field_t) {
                          kd.a(0, 1);
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var13 = 0;
                    L6: while (true) {
                      if (dk.field_o <= var13) {
                        var14 = el.field_j - 1;
                        L7: while (true) {
                          if (-1 <= (var14 ^ -1)) {
                            L8: {
                              if ((eh.field_g ^ -1) >= -1) {
                                break L8;
                              } else {
                                if (-2 != (hg.field_e ^ -1)) {
                                  break L8;
                                } else {
                                  L9: {
                                    var14 = 0;
                                    if (50 <= ak.field_f) {
                                      var14++;
                                      break L9;
                                    } else {
                                      break L9;
                                    }
                                  }
                                  L10: {
                                    if (150 > ak.field_f) {
                                      break L10;
                                    } else {
                                      var14++;
                                      break L10;
                                    }
                                  }
                                  L11: {
                                    if (ak.field_f >= 400) {
                                      var14++;
                                      break L11;
                                    } else {
                                      break L11;
                                    }
                                  }
                                  L12: {
                                    if (ak.field_f < 700) {
                                      break L12;
                                    } else {
                                      var14++;
                                      break L12;
                                    }
                                  }
                                  L13: {
                                    if (32 > eh.field_g) {
                                      var14++;
                                      break L13;
                                    } else {
                                      break L13;
                                    }
                                  }
                                  L14: {
                                    if ((le.field_D ^ -1) >= -1) {
                                      break L14;
                                    } else {
                                      if ((le.field_D ^ -1) > -6001) {
                                        var14 = var14 + 6000 / le.field_D;
                                        break L14;
                                      } else {
                                        break L14;
                                      }
                                    }
                                  }
                                  L15: {
                                    if (var14 < mb.field_s.field_g.length) {
                                      break L15;
                                    } else {
                                      var14 = -1 + mb.field_s.field_g.length;
                                      break L15;
                                    }
                                  }
                                  mb.field_s.b(var14, (byte) 112);
                                  break L8;
                                }
                              }
                            }
                            L16: {
                              if (0 >= eh.field_g) {
                                break L16;
                              } else {
                                if ((hg.field_e ^ -1) == -2) {
                                  L17: {
                                    if (256 >= lj.field_q) {
                                      break L17;
                                    } else {
                                      lj.field_q = 256;
                                      break L17;
                                    }
                                  }
                                  if (lj.field_q <= mb.field_s.field_v) {
                                    if (mb.field_s.field_v > lj.field_q) {
                                      mb.field_s.field_v = mb.field_s.field_v - 1;
                                      break L16;
                                    } else {
                                      break L16;
                                    }
                                  } else {
                                    mb.field_s.field_v = Math.min(lj.field_q, mb.field_s.field_v - -8);
                                    break L16;
                                  }
                                } else {
                                  break L16;
                                }
                              }
                            }
                            L18: {
                              if ((eh.field_g ^ -1) >= -1) {
                                break L18;
                              } else {
                                if (1 != hg.field_e) {
                                  break L18;
                                } else {
                                  L19: {
                                    if (nl.field_b >= 100) {
                                      break L19;
                                    } else {
                                      if (-4 != (ha.field_t ^ -1)) {
                                        break L19;
                                      } else {
                                        nl.field_b = 100;
                                        break L19;
                                      }
                                    }
                                  }
                                  if (nl.field_b > mb.field_s.field_u) {
                                    mb.field_s.field_u = Math.min(nl.field_b, mb.field_s.field_u - -8);
                                    break L18;
                                  } else {
                                    if (nl.field_b < mb.field_s.field_u) {
                                      mb.field_s.field_u = Math.max(nl.field_b, -8 + mb.field_s.field_u);
                                      break L18;
                                    } else {
                                      break L18;
                                    }
                                  }
                                }
                              }
                            }
                            L20: {
                              if ((em.field_c & 7) == 0) {
                                L21: {
                                  if ((jh.field_db ^ -1) < -1) {
                                    if (null != ec.field_b) {
                                      ec.field_b.g(uh.field_i * jh.field_db / 400);
                                      break L21;
                                    } else {
                                      ec.field_b = b.a(lm.field_A[5], 100, uh.field_i * jh.field_db / 400);
                                      ec.field_b.d(-1);
                                      eh.field_c.b(ec.field_b);
                                      break L21;
                                    }
                                  } else {
                                    if (null != ec.field_b) {
                                      eh.field_c.a(ec.field_b);
                                      ec.field_b = null;
                                      break L21;
                                    } else {
                                      break L21;
                                    }
                                  }
                                }
                                L22: {
                                  if ((mg.field_c ^ -1) < -1) {
                                    if (null == q.field_i) {
                                      q.field_i = b.a(fg.field_b[25], 100, uh.field_i * mg.field_c / 400);
                                      q.field_i.d(-1);
                                      eh.field_c.b(q.field_i);
                                      break L22;
                                    } else {
                                      q.field_i.g(uh.field_i * mg.field_c / 400);
                                      break L22;
                                    }
                                  } else {
                                    if (null == q.field_i) {
                                      break L22;
                                    } else {
                                      eh.field_c.a(q.field_i);
                                      q.field_i = null;
                                      break L22;
                                    }
                                  }
                                }
                                if ((tb.field_N ^ -1) < -1) {
                                  if (e.field_l == null) {
                                    e.field_l = b.a(fg.field_b[26], 100, 10);
                                    e.field_l.d(-1);
                                    eh.field_c.b(e.field_l);
                                    break L20;
                                  } else {
                                    var14 = e.field_l.k();
                                    if (var14 < 2 * uh.field_i) {
                                      e.field_l.g(var14 + 20);
                                      break L20;
                                    } else {
                                      if (2 * uh.field_i >= var14) {
                                        break L20;
                                      } else {
                                        e.field_l.g(uh.field_i * 2);
                                        break L20;
                                      }
                                    }
                                  }
                                } else {
                                  if (e.field_l != null) {
                                    var14 = e.field_l.k();
                                    if (-11 > (var14 ^ -1)) {
                                      e.field_l.g(var14 - 10);
                                      break L20;
                                    } else {
                                      eh.field_c.a(e.field_l);
                                      e.field_l = null;
                                      break L20;
                                    }
                                  } else {
                                    break L20;
                                  }
                                }
                              } else {
                                break L20;
                              }
                            }
                            break L0;
                          } else {
                            L23: {
                              var13 = 0;
                              if (-1 > (mm.field_m[var14].field_G ^ -1)) {
                                var13 = 16;
                                break L23;
                              } else {
                                break L23;
                              }
                            }
                            L24: {
                              if (var13 <= mm.field_m[var14].field_q) {
                                break L24;
                              } else {
                                dupTemp$0 = mm.field_m[var14];
                                dupTemp$0.field_q = dupTemp$0.field_q + 1;
                                break L24;
                              }
                            }
                            L25: {
                              if (mm.field_m[var14].field_q > var13) {
                                dupTemp$1 = mm.field_m[var14];
                                dupTemp$1.field_q = dupTemp$1.field_q - 1;
                                break L25;
                              } else {
                                break L25;
                              }
                            }
                            L26: {
                              if (-1 == mm.field_m[var14].field_i) {
                                el.field_j = el.field_j - 1;
                                mm.field_m[var14] = mm.field_m[el.field_j];
                                mm.field_m[el.field_j] = null;
                                break L26;
                              } else {
                                break L26;
                              }
                            }
                            var14--;
                            continue L7;
                          }
                        }
                      } else {
                        L27: {
                          var43 = vj.field_w[var13];
                          if (var43 != null) {
                            L28: {
                              var15 = var43.field_j.field_e + -var10;
                              if (var15 >= 0) {
                                break L28;
                              } else {
                                var15 = -var15;
                                break L28;
                              }
                            }
                            L29: {
                              var16 = var43.field_j.field_g - var11;
                              if (var16 >= 0) {
                                break L29;
                              } else {
                                var16 = -var16;
                                break L29;
                              }
                            }
                            var17 = var16 + var15;
                            if (-11 != (ha.field_t ^ -1)) {
                              break L27;
                            } else {
                              if (var43.field_j.a(nh.field_E, -126)) {
                                if (-4 >= (var17 ^ -1)) {
                                  break L27;
                                } else {
                                  r.field_a = 1;
                                  ca.a(19.0, 0, 32.4, true, 0);
                                  kd.a(0, 1);
                                  tg.field_a = true;
                                  break L27;
                                }
                              } else {
                                break L27;
                              }
                            }
                          } else {
                            vj.field_w[var13] = vj.field_w[dk.field_o];
                            dk.field_o = dk.field_o - 1;
                            break L27;
                          }
                        }
                        var13++;
                        continue L6;
                      }
                    }
                  } else {
                    L30: {
                      var39 = mm.field_m[var13];
                      if (var39 == null) {
                        break L30;
                      } else {
                        L31: {
                          if ((var39.field_i ^ -1) != -9) {
                            break L31;
                          } else {
                            var12 = 1;
                            break L31;
                          }
                        }
                        L32: {
                          var39.b((byte) 117);
                          var15_ref_oc = var39.field_j;
                          var16 = var15_ref_oc.b(-4);
                          var17 = -var10 + var15_ref_oc.field_e;
                          var18 = -var11 + var15_ref_oc.field_g;
                          if (0 <= var17) {
                            break L32;
                          } else {
                            var17 = -var17;
                            break L32;
                          }
                        }
                        L33: {
                          if (0 > var18) {
                            var18 = -var18;
                            break L33;
                          } else {
                            break L33;
                          }
                        }
                        var19 = var18 + var17;
                        if (-51 <= (var19 ^ -1)) {
                          L34: {
                            if (-1 != (bm.field_c ^ -1)) {
                              break L34;
                            } else {
                              if ((ha.field_t ^ -1) != -5) {
                                break L34;
                              } else {
                                if ((var39.field_i ^ -1) == -126) {
                                  if (-6 < (var19 ^ -1)) {
                                    var5.field_c = el.a((double)var10, (double)nh.field_E.field_e, 16, (double)var11, (double)nh.field_E.field_g);
                                    ca.a(81.5, 1, 37.0, true, 64);
                                    kd.a(0, 1);
                                    break L34;
                                  } else {
                                    break L34;
                                  }
                                } else {
                                  break L34;
                                }
                              }
                            }
                          }
                          L35: {
                            var39.field_G = 0;
                            var20 = var5.field_l;
                            var21 = var20.field_f;
                            var23 = var20.field_a;
                            var26 = var39.field_i;
                            if (-1 == (var26 ^ -1)) {
                              L36: {
                                var26_double = var21 + (double)var10 - 0.5;
                                var28_double = -0.5 + ((double)var11 + var23);
                                var30_double = gj.a(var26_double, -4);
                                var32 = sf.a(param0 ^ 37, var28_double);
                                var34 = 1.0 + Math.atan2((double)(-j.field_c) + var30_double, (double)(-rb.field_m) + var32) * 128.0 / 3.141592653589793;
                                if (dl.field_l) {
                                  var34 = 0.0;
                                  break L36;
                                } else {
                                  break L36;
                                }
                              }
                              L37: {
                                if (2 != ln.field_a.field_y[var7]) {
                                  break L37;
                                } else {
                                  ue.field_d = 0;
                                  break L37;
                                }
                              }
                              L38: {
                                var36 = var34 - var39.field_c;
                                if (128.0 <= var36) {
                                  var36 = var36 - 256.0;
                                  break L38;
                                } else {
                                  break L38;
                                }
                              }
                              L39: {
                                if (var36 < -128.0) {
                                  var36 = var36 + 256.0;
                                  break L39;
                                } else {
                                  break L39;
                                }
                              }
                              L40: {
                                L41: {
                                  var36 = Math.abs(var36);
                                  if (dn.field_i == of.field_d) {
                                    break L41;
                                  } else {
                                    L42: {
                                      if (hf.field_i >= 0) {
                                        break L42;
                                      } else {
                                        if (j.field_c != vc.field_g) {
                                          break L42;
                                        } else {
                                          if (rh.field_A != rb.field_m) {
                                            break L42;
                                          } else {
                                            if (32.0 >= Math.abs(var36)) {
                                              break L41;
                                            } else {
                                              break L42;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    var39.a(param0 + 164, var34, 8);
                                    if (var36 <= 1.0) {
                                      vc.field_g = j.field_c;
                                      rh.field_A = rb.field_m;
                                      break L40;
                                    } else {
                                      vc.field_g = -2;
                                      break L40;
                                    }
                                  }
                                }
                                rh.field_A = rb.field_m;
                                vc.field_g = j.field_c;
                                break L40;
                              }
                              L43: {
                                L44: {
                                  if ((nh.field_H ^ -1) == -3) {
                                    break L44;
                                  } else {
                                    if (nh.field_H == 3) {
                                      break L44;
                                    } else {
                                      stackIn_116_0 = 2;
                                      break L43;
                                    }
                                  }
                                }
                                stackIn_116_0 = 1;
                                break L43;
                              }
                              L45: {
                                var25 = stackIn_116_0;
                                if (km.field_A == of.field_d) {
                                  var25 = 5;
                                  break L45;
                                } else {
                                  break L45;
                                }
                              }
                              if (var39.field_p >= var25) {
                                L46: {
                                  cg.field_b = cg.field_b + 1;
                                  var39.field_z = var39.field_z + 1;
                                  var39.field_p = 0;
                                  if (cf.field_q.length <= var39.field_z) {
                                    var39.field_z = 0;
                                    break L46;
                                  } else {
                                    break L46;
                                  }
                                }
                                L47: {
                                  if (ng.field_p[nh.field_H] == null) {
                                    break L47;
                                  } else {
                                    if (cg.field_b >= ng.field_p[nh.field_H].length) {
                                      cg.field_b = 0;
                                      break L47;
                                    } else {
                                      break L47;
                                    }
                                  }
                                }
                                L48: {
                                  dn.field_b = dn.field_b + 1;
                                  if (dn.field_i != of.field_d) {
                                    break L48;
                                  } else {
                                    if (of.field_d.length <= dn.field_b) {
                                      dn.field_b = 0;
                                      of.field_d = km.field_A;
                                      break L35;
                                    } else {
                                      break L48;
                                    }
                                  }
                                }
                                if (null == of.field_d) {
                                  break L35;
                                } else {
                                  if (dn.field_b < of.field_d.length) {
                                    break L35;
                                  } else {
                                    dn.field_b = 0;
                                    break L35;
                                  }
                                }
                              } else {
                                break L35;
                              }
                            } else {
                              if (-31 != (var26 ^ -1)) {
                                if (-19 == (var26 ^ -1)) {
                                  L49: {
                                    if (var39.field_n) {
                                      break L49;
                                    } else {
                                      L50: {
                                        if (0 < ln.field_a.field_i[var16]) {
                                          break L50;
                                        } else {
                                          if (0 < ln.field_a.field_i[var16 + -1]) {
                                            break L50;
                                          } else {
                                            if (0 >= ln.field_a.field_i[var16 - ln.field_a.field_d + -1]) {
                                              break L49;
                                            } else {
                                              break L50;
                                            }
                                          }
                                        }
                                      }
                                      var39.field_n = true;
                                      if (0 != te.field_K) {
                                        break L49;
                                      } else {
                                        L51: {
                                          L52: {
                                            var26 = uh.field_i;
                                            te.field_K = (int)(Math.random() * 50.0) + 20;
                                            if (var17 >= 4) {
                                              break L52;
                                            } else {
                                              if (var18 >= 4) {
                                                break L52;
                                              } else {
                                                break L51;
                                              }
                                            }
                                          }
                                          var26 = var26 / 2;
                                          break L51;
                                        }
                                        jh.a(var26, (byte) 29, 18, jc.field_c, 3);
                                        break L49;
                                      }
                                    }
                                  }
                                  if (!var39.field_n) {
                                    cf.a(param1, (byte) 44, var13, var40);
                                    break L35;
                                  } else {
                                    qj.a(-90, var13, param1, var40);
                                    break L35;
                                  }
                                } else {
                                  if (-28 == (var26 ^ -1)) {
                                    if (!var39.field_n) {
                                      L53: {
                                        if (gj.a(var16, var15_ref_oc.field_g, -122, var15_ref_oc.field_e)) {
                                          break L53;
                                        } else {
                                          if (gj.a(var16 - 1, var15_ref_oc.field_g, -112, -1 + var15_ref_oc.field_e)) {
                                            break L53;
                                          } else {
                                            if (gj.a(var16 - 1 + -ln.field_a.field_d, var15_ref_oc.field_g - 1, -94, -1 + var15_ref_oc.field_e)) {
                                              break L53;
                                            } else {
                                              if (!gj.a(-ln.field_a.field_d + var16, var15_ref_oc.field_g + -1, -124, var15_ref_oc.field_e)) {
                                                break L35;
                                              } else {
                                                break L53;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      tk.a(3, jc.field_c, 28, true);
                                      var39.field_n = true;
                                      break L35;
                                    } else {
                                      L54: {
                                        if (6 == rl.field_c) {
                                          stackIn_161_0 = 0;
                                          break L54;
                                        } else {
                                          stackIn_161_0 = 1;
                                          break L54;
                                        }
                                      }
                                      n.field_o = stackIn_161_0 != 0;
                                      qj.a(-126, var13, param1, var40);
                                      break L35;
                                    }
                                  } else {
                                    L55: {
                                      if ((var26 ^ -1) == -2) {
                                        break L55;
                                      } else {
                                        if (-20 == (var26 ^ -1)) {
                                          break L55;
                                        } else {
                                          if (225 != var26) {
                                            L56: {
                                              if (23 != var26) {
                                                if ((var26 ^ -1) != -29) {
                                                  if ((var26 ^ -1) != -25) {
                                                    if (var26 == 2) {
                                                      he.a(var23, var15_ref_oc, var10, var21, var39, param0 ^ -5, var11);
                                                      break L35;
                                                    } else {
                                                      L57: {
                                                        if ((var26 ^ -1) != -26) {
                                                          if (-4 != (var26 ^ -1)) {
                                                            if (-5 != (var26 ^ -1)) {
                                                              L58: {
                                                                if (var26 == 5) {
                                                                  break L58;
                                                                } else {
                                                                  if (-23 == (var26 ^ -1)) {
                                                                    break L58;
                                                                  } else {
                                                                    if (-7 == (var26 ^ -1)) {
                                                                      if ((var39.field_I ^ -1) < -1) {
                                                                        break L35;
                                                                      } else {
                                                                        jj.a(16, var39);
                                                                        break L35;
                                                                      }
                                                                    } else {
                                                                      if (var26 != 7) {
                                                                        if ((var26 ^ -1) != -9) {
                                                                          L59: {
                                                                            if (-11 != (var26 ^ -1)) {
                                                                              if (var26 == 129) {
                                                                                break L59;
                                                                              } else {
                                                                                if (-132 == (var26 ^ -1)) {
                                                                                  break L59;
                                                                                } else {
                                                                                  if (var26 == 133) {
                                                                                    break L59;
                                                                                  } else {
                                                                                    L60: {
                                                                                      if ((var26 ^ -1) == -12) {
                                                                                        break L60;
                                                                                      } else {
                                                                                        if (var26 == 128) {
                                                                                          break L60;
                                                                                        } else {
                                                                                          if ((var26 ^ -1) == -131) {
                                                                                            break L60;
                                                                                          } else {
                                                                                            if ((var26 ^ -1) != -133) {
                                                                                              if (20 == var26) {
                                                                                                sj.a(var44, var39, var4, var16, 0);
                                                                                                break L35;
                                                                                              } else {
                                                                                                if (21 == var26) {
                                                                                                  if (var39.field_I > 0) {
                                                                                                    var44[var16] = 2;
                                                                                                    break L35;
                                                                                                  } else {
                                                                                                    L61: {
                                                                                                      if ((var44[var16] ^ -1) == -3) {
                                                                                                        var44[var16] = 0;
                                                                                                        break L61;
                                                                                                      } else {
                                                                                                        break L61;
                                                                                                      }
                                                                                                    }
                                                                                                    ln.field_a.field_y[var16] = 146;
                                                                                                    var39.field_i = -1;
                                                                                                    break L35;
                                                                                                  }
                                                                                                } else {
                                                                                                  if (var26 == 12) {
                                                                                                    ja.a(var39, (byte) 113, var15_ref_oc);
                                                                                                    break L35;
                                                                                                  } else {
                                                                                                    if ((var26 ^ -1) != -14) {
                                                                                                      if (-15 == (var26 ^ -1)) {
                                                                                                        var44[var16] = 2;
                                                                                                        var9[-1 + var16] = 2;
                                                                                                        var9[var16 - var4] = 2;
                                                                                                        var9[var16 - var4 + -1] = 2;
                                                                                                        break L35;
                                                                                                      } else {
                                                                                                        if (15 == var26) {
                                                                                                          ra.a(1, var44, var16, var39, var47);
                                                                                                          break L35;
                                                                                                        } else {
                                                                                                          L62: {
                                                                                                            if (var26 != 16) {
                                                                                                              if (229 == var26) {
                                                                                                                break L62;
                                                                                                              } else {
                                                                                                                if (17 != var26) {
                                                                                                                  if (-228 != (var26 ^ -1)) {
                                                                                                                    if (var26 != 226) {
                                                                                                                      if (-229 == (var26 ^ -1)) {
                                                                                                                        break L62;
                                                                                                                      } else {
                                                                                                                        if (var26 != 232) {
                                                                                                                          if ((var26 ^ -1) == -126) {
                                                                                                                            if (-1 > (var39.field_I ^ -1)) {
                                                                                                                              break L35;
                                                                                                                            } else {
                                                                                                                              L63: {
                                                                                                                                if (bm.field_c != 0) {
                                                                                                                                  break L63;
                                                                                                                                } else {
                                                                                                                                  if (0 == rl.field_c) {
                                                                                                                                    var39.field_I = 100;
                                                                                                                                    break L35;
                                                                                                                                  } else {
                                                                                                                                    break L63;
                                                                                                                                  }
                                                                                                                                }
                                                                                                                              }
                                                                                                                              lc.a(var39, param0 ^ 46);
                                                                                                                              break L35;
                                                                                                                            }
                                                                                                                          } else {
                                                                                                                            if (231 == var26) {
                                                                                                                              if (var39.field_I > 0) {
                                                                                                                                break L35;
                                                                                                                              } else {
                                                                                                                                var39.c((byte) 64);
                                                                                                                                var26 = 0;
                                                                                                                                L64: while (true) {
                                                                                                                                  if (-11 >= (var26 ^ -1)) {
                                                                                                                                    tk.a(3, jc.field_c, 32, true);
                                                                                                                                    jh.a(uh.field_i * 3 / 2, (byte) 118, 47, jc.field_c, 3);
                                                                                                                                    break L35;
                                                                                                                                  } else {
                                                                                                                                    mm.field_m[el.field_j] = new oj(var39.field_j, 3, rl.field_c);
                                                                                                                                    el.field_j = el.field_j + 1;
                                                                                                                                    var26++;
                                                                                                                                    continue L64;
                                                                                                                                  }
                                                                                                                                }
                                                                                                                              }
                                                                                                                            } else {
                                                                                                                              break L35;
                                                                                                                            }
                                                                                                                          }
                                                                                                                        } else {
                                                                                                                          break L62;
                                                                                                                        }
                                                                                                                      }
                                                                                                                    } else {
                                                                                                                      var39.field_e = var39.field_e - 1;
                                                                                                                      if (2999 > (var39.field_e ^ -1)) {
                                                                                                                        break L35;
                                                                                                                      } else {
                                                                                                                        var39.field_i = -1;
                                                                                                                        break L35;
                                                                                                                      }
                                                                                                                    }
                                                                                                                  } else {
                                                                                                                    break L62;
                                                                                                                  }
                                                                                                                } else {
                                                                                                                  var39.field_e = var39.field_e - 1;
                                                                                                                  if (2999 > (var39.field_e ^ -1)) {
                                                                                                                    break L35;
                                                                                                                  } else {
                                                                                                                    var39.field_i = -1;
                                                                                                                    break L35;
                                                                                                                  }
                                                                                                                }
                                                                                                              }
                                                                                                            } else {
                                                                                                              break L62;
                                                                                                            }
                                                                                                          }
                                                                                                          var39.field_e = var39.field_e - 1;
                                                                                                          if (2999 > (var39.field_e ^ -1)) {
                                                                                                            break L35;
                                                                                                          } else {
                                                                                                            var39.field_i = -1;
                                                                                                            break L35;
                                                                                                          }
                                                                                                        }
                                                                                                      }
                                                                                                    } else {
                                                                                                      var44[var16] = 2;
                                                                                                      var9[-1 + var16] = 2;
                                                                                                      var9[var16 + -var4] = 2;
                                                                                                      var9[var16 - var4 + -1] = 2;
                                                                                                      break L35;
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              }
                                                                                            } else {
                                                                                              ql.a(var20, param0 ^ -120, var6, var39, true);
                                                                                              break L35;
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                    ql.a(var20, param0 ^ -120, var6, var39, true);
                                                                                    break L35;
                                                                                  }
                                                                                }
                                                                              }
                                                                            } else {
                                                                              break L59;
                                                                            }
                                                                          }
                                                                          ql.a(var20, -125, var6, var39, false);
                                                                          break L35;
                                                                        } else {
                                                                          L65: {
                                                                            if (1 != bm.field_c) {
                                                                              break L65;
                                                                            } else {
                                                                              if (0 != (rl.field_c ^ -1)) {
                                                                                break L65;
                                                                              } else {
                                                                                qj.a(-121, var13, param1, var40);
                                                                                break L35;
                                                                              }
                                                                            }
                                                                          }
                                                                          if (null == vi.field_p) {
                                                                            vh.a(var5, 5, var39);
                                                                            break L35;
                                                                          } else {
                                                                            u.a(param1, var40, var13, param0 ^ 61);
                                                                            break L35;
                                                                          }
                                                                        }
                                                                      } else {
                                                                        L66: {
                                                                          if (ha.field_t == 0) {
                                                                            break L66;
                                                                          } else {
                                                                            if (14 == ha.field_t) {
                                                                              break L66;
                                                                            } else {
                                                                              if (ha.field_t != 17) {
                                                                                break L35;
                                                                              } else {
                                                                                break L66;
                                                                              }
                                                                            }
                                                                          }
                                                                        }
                                                                        var39.field_I = 10;
                                                                        var39.field_b = true;
                                                                        var39.field_i = 1;
                                                                        var39.field_C = l.a(-28, var39.field_i);
                                                                        break L35;
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                              ab.a(var4, false, var6, var15_ref_oc, var16, var23, var40, var39, var21, var11, var10);
                                                              break L35;
                                                            } else {
                                                              oj.a(var39, var15_ref_oc, var11, var23, var10, var21, true);
                                                              break L35;
                                                            }
                                                          } else {
                                                            break L57;
                                                          }
                                                        } else {
                                                          break L57;
                                                        }
                                                      }
                                                      L67: {
                                                        if (1 != bm.field_c) {
                                                          break L67;
                                                        } else {
                                                          if ((rl.field_c ^ -1) != 0) {
                                                            break L67;
                                                          } else {
                                                            qj.a(-97, var13, param1, var40);
                                                            break L35;
                                                          }
                                                        }
                                                      }
                                                      df.a(3, var39, var40, var6, var11, var10, var21, var5, var15_ref_oc, var23);
                                                      break L35;
                                                    }
                                                  } else {
                                                    pl.a((byte) 126, var39, var16);
                                                    break L35;
                                                  }
                                                } else {
                                                  break L56;
                                                }
                                              } else {
                                                break L56;
                                              }
                                            }
                                            if ((bm.field_c ^ -1) != -2) {
                                              break L35;
                                            } else {
                                              if ((rl.field_c ^ -1) == 0) {
                                                qj.a(param0 + -185, var13, param1, var40);
                                                break L35;
                                              } else {
                                                break L35;
                                              }
                                            }
                                          } else {
                                            L68: {
                                              if (-1 <= (var39.field_I ^ -1)) {
                                                break L68;
                                              } else {
                                                if ((ln.field_a.field_i[var16] ^ -1) < -1) {
                                                  break L68;
                                                } else {
                                                  if ((ln.field_a.field_i[var16 - 1] ^ -1) < -1) {
                                                    break L68;
                                                  } else {
                                                    if (ln.field_a.field_i[-1 + (-ln.field_a.field_d + var16)] > 0) {
                                                      break L68;
                                                    } else {
                                                      cf.a(param1, (byte) 124, var13, var40);
                                                      var44[var16] = 4;
                                                      break L35;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            var44[var16] = 0;
                                            var39.a(false, 0, 21963, 1, rl.field_c, var15_ref_oc);
                                            break L35;
                                          }
                                        }
                                      }
                                    }
                                    qj.a(-90, var13, param1, var40);
                                    break L35;
                                  }
                                }
                              } else {
                                L69: {
                                  var26 = var39.field_j.field_g * 24;
                                  if (uj.field_p.field_g + -24 > var26) {
                                    break L69;
                                  } else {
                                    if (var26 >= 480 + uj.field_p.field_g) {
                                      break L69;
                                    } else {
                                      jn.field_F[ib.field_c].field_c = 256.0 * Math.random();
                                      jn.field_F[ib.field_c].field_j.a((byte) 46, var39.field_j);
                                      jn.field_F[ib.field_c].field_l.a(var39.field_l, -28860);
                                      dupTemp$2 = jn.field_F[ib.field_c].field_l;
                                      dupTemp$2.field_f = dupTemp$2.field_f + (Math.random() + -0.5);
                                      jn.field_F[ib.field_c].field_e = 0;
                                      jn.field_F[ib.field_c].field_h = 0;
                                      jn.field_F[ib.field_c].field_i = 6;
                                      ib.field_c = ib.field_c + 1;
                                      break L69;
                                    }
                                  }
                                }
                                ln.field_a.field_c[var39.field_j.b(bm.a((int) param0, -63))] = 4;
                                if (0 != (em.field_c & 7)) {
                                  break L35;
                                } else {
                                  var27 = (int)((-var39.field_l.field_f + (var21 + (double)var10 - (double)var15_ref_oc.field_e)) * 24.0);
                                  var28 = (int)(24.0 * (var23 + (double)var11 - (double)var15_ref_oc.field_g - var39.field_l.field_a));
                                  var29 = (int)Math.sqrt((double)(var27 * var27 + var28 * var28));
                                  if (-401 > (var29 ^ -1)) {
                                    break L35;
                                  } else {
                                    var30 = 400 + -var29;
                                    if (mg.field_c >= var30) {
                                      break L35;
                                    } else {
                                      mg.field_c = var30;
                                      break L35;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          L70: {
                            if (27 == var39.field_i) {
                              L71: {
                                var44[var16] = 6;
                                if (-1 != (var9[var16 - 1] ^ -1)) {
                                  break L71;
                                } else {
                                  var9[-1 + var16] = 6;
                                  break L71;
                                }
                              }
                              L72: {
                                if (0 == var9[-ln.field_a.field_d + var16]) {
                                  var9[-ln.field_a.field_d + var16] = 6;
                                  break L72;
                                } else {
                                  break L72;
                                }
                              }
                              if (-1 == (var9[var16 - ln.field_a.field_d + -1] ^ -1)) {
                                var9[-1 + var16 - ln.field_a.field_d] = 6;
                                break L70;
                              } else {
                                break L70;
                              }
                            } else {
                              break L70;
                            }
                          }
                          if ((var39.field_i ^ -1) >= -1) {
                            break L30;
                          } else {
                            if (var39.field_i == 7) {
                              break L30;
                            } else {
                              L73: {
                                if (-11 < (var39.field_i ^ -1)) {
                                  break L73;
                                } else {
                                  if ((var39.field_i ^ -1) == -23) {
                                    break L73;
                                  } else {
                                    if (var39.field_i == 231) {
                                      break L73;
                                    } else {
                                      break L30;
                                    }
                                  }
                                }
                              }
                              if (2 != var39.field_i) {
                                L74: {
                                  if (var39.field_i == 5) {
                                    break L74;
                                  } else {
                                    if ((var39.field_i ^ -1) == -23) {
                                      break L74;
                                    } else {
                                      L75: {
                                        L76: {
                                          if (!var39.field_b) {
                                            break L76;
                                          } else {
                                            if (-226 != (var39.field_i ^ -1)) {
                                              break L75;
                                            } else {
                                              break L76;
                                            }
                                          }
                                        }
                                        if ((var39.field_i ^ -1) == -232) {
                                          break L75;
                                        } else {
                                          if (0 != var39.field_i) {
                                            L77: {
                                              var44[var16] = 3;
                                              if (var9[1 + var16] != 0) {
                                                break L77;
                                              } else {
                                                var9[var16 - -1] = 1;
                                                break L77;
                                              }
                                            }
                                            if (var9[var16 - -ln.field_a.field_d] == 0) {
                                              var9[ln.field_a.field_d + var16] = 1;
                                              break L30;
                                            } else {
                                              break L30;
                                            }
                                          } else {
                                            break L30;
                                          }
                                        }
                                      }
                                      var44[var16] = 5;
                                      break L30;
                                    }
                                  }
                                }
                                var9[var15_ref_oc.b(param0 + -65)] = 4;
                                break L30;
                              } else {
                                if (r.field_a != 0) {
                                  break L30;
                                } else {
                                  if ((var39.field_F ^ -1) < -251) {
                                    var44[var16] = 3;
                                    break L30;
                                  } else {
                                    break L30;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          break L30;
                        }
                      }
                    }
                    var13++;
                    continue L4;
                  }
                }
              } else {
                var9[mm.field_m[var13].field_j.b(-4)] = 0;
                var13++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L78: {
            var2 = decompiledCaughtException;
            stackIn_367_0 = (RuntimeException) (var2);

            stackIn_367_1 = new StringBuilder().append("hd.I(").append(param0).append(',');

            if (param1 == null) {
              stackIn_368_0 = (RuntimeException) ((Object) stackIn_367_0);
              stackIn_368_1 = (StringBuilder) ((Object) stackIn_367_1);
              stackIn_368_2 = "null";
              break L78;
            } else {
              stackIn_368_0 = (RuntimeException) ((Object) stackIn_367_0);
              stackIn_368_1 = (StringBuilder) ((Object) stackIn_367_1);
              stackIn_368_2 = "{...}";
              break L78;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_368_0), stackIn_368_2 + ')');
        }
    }

    final bm a(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        ii var4 = null;
        bm stackIn_3_0 = null;
        bm stackIn_8_0 = null;
        bm stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_int = -120 / ((param1 - 3) / 42);
            if (this.field_o.a(param0, (byte) -117) == bi.field_d) {
              stackIn_3_0 = bi.field_d;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param0.equals(this.field_p)) {
                  break L1;
                } else {
                  var4 = nd.a(3888, param0);
                  if (!var4.d((byte) -22)) {
                    stackIn_8_0 = m.field_n;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    this.field_p = param0;
                    this.field_s = var4.a(17539);
                    break L1;
                  }
                }
              }
              L2: {
                if (this.field_s) {
                  stackIn_13_0 = nd.field_d;
                  break L2;
                } else {
                  stackIn_13_0 = bi.field_d;
                  break L2;
                }
              }
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var3);

            stackIn_16_1 = new StringBuilder().append("hd.L(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return stackIn_13_0;
          }
        }
    }

    hd(ig param0, ig param1) {
        super(param0);
        this.field_p = "";
        this.field_s = false;
        try {
            this.field_o = new li(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "hd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final String a(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.field_o.a(param1, (byte) -107) == bi.field_d) {
              stackIn_3_0 = this.field_o.a((byte) 19, param1);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var3_int = -8 / ((-24 - param0) / 35);
              if (this.a(param1, (byte) -54) == bi.field_d) {
                stackIn_7_0 = ld.field_r;
                decompiledRegionSelector0 = 1;
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
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("hd.K(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_7_0;
        }
    }

    final static void a(int param0, int param1, oj param2, int param3, int param4) {
        int dupTemp$0 = 0;
        int dupTemp$1 = 0;
        int dupTemp$2 = 0;
        int dupTemp$3 = 0;
        int stackIn_131_0 = 0;
        int stackIn_164_0 = 0;
        int stackIn_312_0 = 0;
        RuntimeException stackIn_322_0 = null;
        StringBuilder stackIn_322_1 = null;
        RuntimeException stackIn_323_0 = null;
        StringBuilder stackIn_323_1 = null;
        String stackIn_323_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
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
        var15 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              ln.field_a.field_c[param3] = param4;
              if (param2.field_t <= 0) {
                break L1;
              } else {
                if (!dl.field_l) {
                  param2.field_l.a(param2.field_t, param2.field_K, param2.field_j, false, ln.field_a);
                  param2.b((byte) 117);
                  param2.field_t = param2.field_t - 1;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (of.field_h != null) {
                break L2;
              } else {
                if (-1 == (jf.field_c ^ -1)) {
                  L3: {
                    if (bm.field_c != 0) {
                      break L3;
                    } else {
                      if (rl.field_c != 5) {
                        break L3;
                      } else {
                        if (param0 < 46) {
                          break L3;
                        } else {
                          if ((param0 ^ -1) < -57) {
                            break L3;
                          } else {
                            if (param1 > 9) {
                              break L3;
                            } else {
                              var6 = 0;
                              var5_int = 0;
                              L4: while (true) {
                                if (var5_int >= mm.field_m.length) {
                                  if ((var6 ^ -1) > -3) {
                                    break L3;
                                  } else {
                                    param2.field_I = 0;
                                    ci.a(100, 55);
                                    break L3;
                                  }
                                } else {
                                  var16 = mm.field_m[var5_int];
                                  if (var16 != null) {
                                    if (-16 < (var16.field_j.field_g ^ -1)) {
                                      if (-1 > (var16.field_I ^ -1)) {
                                        L5: {
                                          L6: {
                                            if ((var16.field_i ^ -1) == -6) {
                                              break L6;
                                            } else {
                                              if ((var16.field_i ^ -1) == -23) {
                                                break L6;
                                              } else {
                                                break L5;
                                              }
                                            }
                                          }
                                          var6++;
                                          break L5;
                                        }
                                        var5_int++;
                                        continue L4;
                                      } else {
                                        var5_int++;
                                        continue L4;
                                      }
                                    } else {
                                      var5_int++;
                                      continue L4;
                                    }
                                  } else {
                                    var5_int++;
                                    continue L4;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  L7: {
                    if (-5 != (pj.field_v ^ -1)) {
                      break L7;
                    } else {
                      param2.field_c = param2.field_c - 128.0;
                      param2.b(-27757, je.field_a[1], ln.field_a);
                      param2.field_c = param2.field_c + 128.0;
                      break L7;
                    }
                  }
                  L8: {
                    var6 = 0;
                    if (dl.field_l) {
                      fj.field_Pb = 0.0;
                      var6 = 1;
                      break L8;
                    } else {
                      if (qh.field_m[la.field_g]) {
                        L9: {
                          fj.field_Pb = (double)(int)param2.field_c;
                          if (qh.field_m[aa.field_a]) {
                            fj.field_Pb = fj.field_Pb + 32.0;
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        var6 = 1;
                        if (qh.field_m[fj.field_Ob]) {
                          fj.field_Pb = fj.field_Pb - 32.0;
                          break L8;
                        } else {
                          break L8;
                        }
                      } else {
                        if (qh.field_m[jh.field_fb]) {
                          L10: {
                            fj.field_Pb = (double)(int)(param2.field_c + 128.0);
                            if (!qh.field_m[aa.field_a]) {
                              break L10;
                            } else {
                              fj.field_Pb = fj.field_Pb - 32.0;
                              break L10;
                            }
                          }
                          L11: {
                            if (qh.field_m[fj.field_Ob]) {
                              fj.field_Pb = fj.field_Pb + 32.0;
                              break L11;
                            } else {
                              break L11;
                            }
                          }
                          var6 = 1;
                          break L8;
                        } else {
                          if (!qh.field_m[aa.field_a]) {
                            if (!qh.field_m[fj.field_Ob]) {
                              if (qh.field_m[ln.field_q]) {
                                L12: {
                                  fj.field_Pb = 0.0;
                                  if (!qh.field_m[ha.field_v]) {
                                    break L12;
                                  } else {
                                    fj.field_Pb = fj.field_Pb + 32.0;
                                    break L12;
                                  }
                                }
                                L13: {
                                  if (qh.field_m[bh.field_b]) {
                                    fj.field_Pb = fj.field_Pb - 32.0;
                                    break L13;
                                  } else {
                                    break L13;
                                  }
                                }
                                var6 = 1;
                                break L8;
                              } else {
                                if (!qh.field_m[fj.field_Jb]) {
                                  if (qh.field_m[ha.field_v]) {
                                    var6 = 1;
                                    fj.field_Pb = 64.0;
                                    break L8;
                                  } else {
                                    if (qh.field_m[bh.field_b]) {
                                      fj.field_Pb = 192.0;
                                      var6 = 1;
                                      break L8;
                                    } else {
                                      break L8;
                                    }
                                  }
                                } else {
                                  L14: {
                                    fj.field_Pb = 128.0;
                                    if (qh.field_m[ha.field_v]) {
                                      fj.field_Pb = fj.field_Pb - 32.0;
                                      break L14;
                                    } else {
                                      break L14;
                                    }
                                  }
                                  L15: {
                                    if (!qh.field_m[bh.field_b]) {
                                      break L15;
                                    } else {
                                      fj.field_Pb = fj.field_Pb + 32.0;
                                      break L15;
                                    }
                                  }
                                  var6 = 1;
                                  break L8;
                                }
                              }
                            } else {
                              fj.field_Pb = (double)(int)(192.0 + param2.field_c);
                              var6 = 1;
                              break L8;
                            }
                          } else {
                            fj.field_Pb = (double)(int)(64.0 + param2.field_c);
                            var6 = 1;
                            break L8;
                          }
                        }
                      }
                    }
                  }
                  L16: {
                    if (dn.field_i == of.field_d) {
                      L17: {
                        var6 = 0;
                        var7_double = (double)param2.field_j.field_e + param2.field_l.field_f - vi.field_h;
                        param2.field_c = (double)qi.field_N;
                        var9_double = -bc.field_i + ((double)param2.field_j.field_g + param2.field_l.field_a);
                        if (0.1 < var7_double) {
                          param2.field_l.field_f = param2.field_l.field_f - 0.1;
                          break L17;
                        } else {
                          if (-0.1 > var7_double) {
                            param2.field_l.field_f = param2.field_l.field_f + 0.1;
                            break L17;
                          } else {
                            param2.field_l.field_f = param2.field_l.field_f - var7_double;
                            break L17;
                          }
                        }
                      }
                      L18: {
                        if (var9_double <= 0.1) {
                          if (-0.1 <= var9_double) {
                            param2.field_l.field_a = param2.field_l.field_a - var9_double;
                            break L18;
                          } else {
                            param2.field_l.field_a = param2.field_l.field_a + 0.1;
                            break L18;
                          }
                        } else {
                          param2.field_l.field_a = param2.field_l.field_a - 0.1;
                          break L18;
                        }
                      }
                      param2.b((byte) 117);
                      if (!HostileSpawn.field_F) {
                        break L16;
                      } else {
                        if (0 != param2.field_p) {
                          break L16;
                        } else {
                          if (dn.field_b == 15) {
                            eh.field_c.a(fg.field_b[22], 100, uh.field_i);
                            break L16;
                          } else {
                            break L16;
                          }
                        }
                      }
                    } else {
                      break L16;
                    }
                  }
                  L19: {
                    var7_int = je.field_a[1];
                    if ((bh.field_d ^ -1) >= -1) {
                      break L19;
                    } else {
                      var7_int = (int)((double)var7_int * 1.5);
                      break L19;
                    }
                  }
                  L20: {
                    if (var6 != 0) {
                      var8_double = param2.field_c;
                      param2.field_c = fj.field_Pb;
                      li.field_r = param2.b(-27757, var7_int, ln.field_a);
                      param2.field_c = var8_double;
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                  L21: {
                    if (var6 == 0) {
                      break L21;
                    } else {
                      L22: {
                        if (!li.field_r[0]) {
                          break L22;
                        } else {
                          if (!li.field_r[1]) {
                            break L22;
                          } else {
                            var6 = 0;
                            break L21;
                          }
                        }
                      }
                      if (!li.field_r[1]) {
                        if (li.field_r[0]) {
                          L23: {
                            if (64.0 == fj.field_Pb) {
                              break L23;
                            } else {
                              if (fj.field_Pb != 192.0) {
                                L24: {
                                  if (64.0 > fj.field_Pb) {
                                    break L24;
                                  } else {
                                    if (fj.field_Pb <= 192.0) {
                                      fj.field_Pb = 128.0;
                                      break L21;
                                    } else {
                                      break L24;
                                    }
                                  }
                                }
                                fj.field_Pb = 0.0;
                                break L21;
                              } else {
                                break L23;
                              }
                            }
                          }
                          var6 = 0;
                          break L21;
                        } else {
                          break L21;
                        }
                      } else {
                        L25: {
                          if (0.0 == fj.field_Pb) {
                            break L25;
                          } else {
                            if (fj.field_Pb != 128.0) {
                              if (fj.field_Pb < 128.0) {
                                fj.field_Pb = 64.0;
                                break L21;
                              } else {
                                fj.field_Pb = 192.0;
                                break L21;
                              }
                            } else {
                              break L25;
                            }
                          }
                        }
                        var6 = 0;
                        break L21;
                      }
                    }
                  }
                  L26: {
                    L27: {
                      var8 = 0;
                      if (var6 == 0) {
                        break L27;
                      } else {
                        L28: {
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
                            break L28;
                          } else {
                            if (-3 != (var14 ^ -1)) {
                              if (4 == var14) {
                                var12 -= 4;
                                var13 += 4;
                                break L28;
                              } else {
                                if (3 == var14) {
                                  var13 -= 4;
                                  var11 += 4;
                                  break L28;
                                } else {
                                  L29: {
                                    L30: {
                                      if (var10 >= var9) {
                                        break L30;
                                      } else {
                                        if (var11 <= var9) {
                                          break L30;
                                        } else {
                                          if (var12 > var9) {
                                            var8 = 2;
                                            break L29;
                                          } else {
                                            if (var9 <= var13) {
                                              var8 = 4;
                                              break L29;
                                            } else {
                                              var8 = 3;
                                              break L29;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    var8 = 1;
                                    break L29;
                                  }
                                  L31: {
                                    if (var8 == nh.field_H) {
                                      stackIn_131_0 = 0;
                                      break L31;
                                    } else {
                                      stackIn_131_0 = 1;
                                      break L31;
                                    }
                                  }
                                  L32: {
                                    var9 = stackIn_131_0;
                                    if (var9 == 0) {
                                      break L32;
                                    } else {
                                      if (var8 != 0) {
                                        break L32;
                                      } else {
                                        if ((nh.field_H ^ -1) == -2) {
                                          if (6 == cg.field_b) {
                                            break L32;
                                          } else {
                                            if (7 == cg.field_b) {
                                              break L32;
                                            } else {
                                              if (-19 == (cg.field_b ^ -1)) {
                                                break L32;
                                              } else {
                                                if (-20 == (cg.field_b ^ -1)) {
                                                  break L32;
                                                } else {
                                                  fj.field_Pb = param2.field_c;
                                                  var9 = 0;
                                                  break L32;
                                                }
                                              }
                                            }
                                          }
                                        } else {
                                          break L32;
                                        }
                                      }
                                    }
                                  }
                                  L33: {
                                    if (var9 == 0) {
                                      break L33;
                                    } else {
                                      L34: {
                                        L35: {
                                          if (var8 == 1) {
                                            break L35;
                                          } else {
                                            if (4 == var8) {
                                              break L35;
                                            } else {
                                              cg.field_b = 0;
                                              break L34;
                                            }
                                          }
                                        }
                                        cg.field_b = 6;
                                        break L34;
                                      }
                                      nh.field_H = var8;
                                      break L33;
                                    }
                                  }
                                  fj.field_Pb = fj.field_Pb + (double)(-li.field_u[nh.field_H] + 256);
                                  L36: while (true) {
                                    if (256.0 > fj.field_Pb) {
                                      break L26;
                                    } else {
                                      fj.field_Pb = fj.field_Pb - 256.0;
                                      continue L36;
                                    }
                                  }
                                }
                              }
                            } else {
                              var10 -= 4;
                              var12 += 4;
                              break L28;
                            }
                          }
                        }
                        L37: {
                          if (var10 >= var9) {
                            break L37;
                          } else {
                            if (var11 <= var9) {
                              break L37;
                            } else {
                              if (var12 > var9) {
                                var8 = 2;
                                break L27;
                              } else {
                                if (var9 <= var13) {
                                  var8 = 4;
                                  break L27;
                                } else {
                                  var8 = 3;
                                  break L27;
                                }
                              }
                            }
                          }
                        }
                        var8 = 1;
                        break L27;
                      }
                    }
                    L38: {
                      if (var8 == nh.field_H) {
                        stackIn_164_0 = 0;
                        break L38;
                      } else {
                        stackIn_164_0 = 1;
                        break L38;
                      }
                    }
                    L39: {
                      var9 = stackIn_164_0;
                      if (var9 == 0) {
                        break L39;
                      } else {
                        if (var8 != 0) {
                          break L39;
                        } else {
                          if ((nh.field_H ^ -1) == -2) {
                            if (6 == cg.field_b) {
                              break L39;
                            } else {
                              if (7 == cg.field_b) {
                                break L39;
                              } else {
                                if (-19 == (cg.field_b ^ -1)) {
                                  break L39;
                                } else {
                                  if (-20 == (cg.field_b ^ -1)) {
                                    break L39;
                                  } else {
                                    fj.field_Pb = param2.field_c;
                                    var9 = 0;
                                    break L39;
                                  }
                                }
                              }
                            }
                          } else {
                            break L39;
                          }
                        }
                      }
                    }
                    L40: {
                      if (var9 == 0) {
                        break L40;
                      } else {
                        L41: {
                          L42: {
                            if (var8 == 1) {
                              break L42;
                            } else {
                              if (4 == var8) {
                                break L42;
                              } else {
                                cg.field_b = 0;
                                break L41;
                              }
                            }
                          }
                          cg.field_b = 6;
                          break L41;
                        }
                        nh.field_H = var8;
                        break L40;
                      }
                    }
                    fj.field_Pb = fj.field_Pb + (double)(-li.field_u[nh.field_H] + 256);
                    L43: while (true) {
                      if (256.0 > fj.field_Pb) {
                        break L26;
                      } else {
                        fj.field_Pb = fj.field_Pb - 256.0;
                        continue L43;
                      }
                    }
                  }
                  L44: while (true) {
                    if (0.0 <= fj.field_Pb) {
                      L45: {
                        if (!dl.field_l) {
                          break L45;
                        } else {
                          fj.field_Pb = 0.0;
                          break L45;
                        }
                      }
                      L46: {
                        if (-1 == (nh.field_H ^ -1)) {
                          break L46;
                        } else {
                          L47: {
                            if ((cg.field_b ^ -1) != -4) {
                              break L47;
                            } else {
                              if (param2.field_p != 0) {
                                break L47;
                              } else {
                                eh.field_c.a(em.field_a[11], 100, uh.field_i);
                                break L46;
                              }
                            }
                          }
                          if (-16 != (cg.field_b ^ -1)) {
                            break L46;
                          } else {
                            if ((param2.field_p ^ -1) == -2) {
                              if ((uj.field_l ^ -1) != -2) {
                                break L46;
                              } else {
                                eh.field_c.a(em.field_a[12], 100, uh.field_i);
                                break L46;
                              }
                            } else {
                              break L46;
                            }
                          }
                        }
                      }
                      L48: {
                        param2.field_p = param2.field_p + 1;
                        if (!re.field_l) {
                          break L48;
                        } else {
                          wk.b(192);
                          break L48;
                        }
                      }
                      nd.a(ln.field_a.field_h[param3], param2, param4 + 18459);
                      break L2;
                    } else {
                      fj.field_Pb = fj.field_Pb + 256.0;
                      continue L44;
                    }
                  }
                } else {
                  break L2;
                }
              }
            }
            L49: {
              if (-1 <= (um.field_e ^ -1)) {
                break L49;
              } else {
                if (-5 == (mc.field_I ^ -1)) {
                  break L49;
                } else {
                  L50: {
                    um.field_e = um.field_e - 1;
                    var6 = ba.a((byte) 87);
                    if (var6 > eh.field_g) {
                      eh.field_g = eh.field_g + 1;
                      break L50;
                    } else {
                      break L50;
                    }
                  }
                  if (-eh.field_g + var6 <= um.field_e) {
                    break L49;
                  } else {
                    eh.field_g = eh.field_g + (-eh.field_g + var6) / Math.max(um.field_e, 1);
                    break L49;
                  }
                }
              }
            }
            L51: {
              if (0 > ri.field_h) {
                var6 = ig.field_L;
                if (1 == var6) {
                  fh.field_c[0] = true;
                  fh.field_c[1] = false;
                  break L51;
                } else {
                  if (-3 == (var6 ^ -1)) {
                    fh.field_c[1] = true;
                    fh.field_c[0] = false;
                    break L51;
                  } else {
                    if (-1 == (1 & el.field_m ^ -1)) {
                      if (-1 == (4 & el.field_m ^ -1)) {
                        fh.field_c[1] = false;
                        fh.field_c[0] = false;
                        break L51;
                      } else {
                        fh.field_c[0] = false;
                        fh.field_c[1] = true;
                        break L51;
                      }
                    } else {
                      fh.field_c[0] = true;
                      fh.field_c[1] = false;
                      break L51;
                    }
                  }
                }
              } else {
                L52: {
                  if (1 != pf.field_o) {
                    if ((pf.field_o ^ -1) == -3) {
                      t.a(-128, 1, ri.field_h);
                      break L52;
                    } else {
                      break L52;
                    }
                  } else {
                    t.a(35, 0, ri.field_h);
                    break L52;
                  }
                }
                fh.field_c[1] = false;
                fh.field_c[0] = false;
                break L51;
              }
            }
            L53: {
              if (-1 <= (nh.field_M ^ -1)) {
                break L53;
              } else {
                nh.field_M = nh.field_M - 1;
                if (nh.field_M != 0) {
                  break L53;
                } else {
                  dn.field_j = -1;
                  break L53;
                }
              }
            }
            L54: {
              var6 = -1;
              if (of.field_d == dn.field_i) {
                hf.field_i = -1;
                break L54;
              } else {
                L55: {
                  if (-1 > (ci.field_a[0] ^ -1)) {
                    break L55;
                  } else {
                    if (0 >= ci.field_a[1]) {
                      hf.field_i = -1;
                      break L55;
                    } else {
                      break L55;
                    }
                  }
                }
                L56: {
                  if (0 < d.field_u) {
                    L57: {
                      d.field_u = d.field_u - 1;
                      if ((kh.field_U[0] ^ -1) != -4) {
                        break L57;
                      } else {
                        if (kh.field_ib[an.field_r[kh.field_U[0]]] > 0) {
                          dupTemp$0 = an.field_r[kh.field_U[0]];
                          kh.field_ib[dupTemp$0] = kh.field_ib[dupTemp$0] - 1;
                          ci.field_a[0] = ld.a(-44, kh.field_U[0]);
                          var6 = kh.field_U[0];
                          hf.field_i = var6;
                          break L57;
                        } else {
                          break L57;
                        }
                      }
                    }
                    if (kh.field_U[1] != 3) {
                      break L56;
                    } else {
                      if (-1 <= (kh.field_ib[an.field_r[kh.field_U[1]]] ^ -1)) {
                        break L56;
                      } else {
                        dupTemp$1 = an.field_r[kh.field_U[1]];
                        kh.field_ib[dupTemp$1] = kh.field_ib[dupTemp$1] - 1;
                        ci.field_a[1] = ld.a(-11, kh.field_U[1]);
                        var6 = kh.field_U[1];
                        hf.field_i = var6;
                        break L56;
                      }
                    }
                  } else {
                    break L56;
                  }
                }
                L58: {
                  if (ci.field_a[0] <= 0) {
                    if (null != of.field_h) {
                      break L58;
                    } else {
                      if (jf.field_c != 0) {
                        break L58;
                      } else {
                        if (0 < kh.field_U[0]) {
                          L59: {
                            if (!fh.field_c[0]) {
                              break L59;
                            } else {
                              if (-1 <= (kh.field_ib[an.field_r[kh.field_U[0]]] ^ -1)) {
                                ci.field_a[0] = ld.a(-7, 0);
                                var6 = 0;
                                break L59;
                              } else {
                                break L59;
                              }
                            }
                          }
                          if (!fh.field_c[0]) {
                            break L58;
                          } else {
                            if (kh.field_ib[an.field_r[kh.field_U[0]]] <= 0) {
                              break L58;
                            } else {
                              dupTemp$2 = an.field_r[kh.field_U[0]];
                              kh.field_ib[dupTemp$2] = kh.field_ib[dupTemp$2] - 1;
                              ci.field_a[0] = ld.a(-25, kh.field_U[0]);
                              var6 = kh.field_U[0];
                              break L58;
                            }
                          }
                        } else {
                          if (!fh.field_c[0]) {
                            break L58;
                          } else {
                            if (-3 < (dn.field_j ^ -1)) {
                              L60: {
                                ci.field_a[0] = ld.a(bm.a(param4, -39), 0);
                                if (kh.field_U[1] == 0) {
                                  ci.field_a[1] = ci.field_a[0];
                                  break L60;
                                } else {
                                  break L60;
                                }
                              }
                              var6 = 0;
                              break L58;
                            } else {
                              break L58;
                            }
                          }
                        }
                      }
                    }
                  } else {
                    ci.field_a[0] = ci.field_a[0] - 1;
                    if (!fh.field_c[0]) {
                      break L58;
                    } else {
                      L61: {
                        if (an.field_r[kh.field_U[0]] < 0) {
                          break L61;
                        } else {
                          if (-1 > (kh.field_ib[an.field_r[kh.field_U[0]]] ^ -1)) {
                            break L61;
                          } else {
                            break L58;
                          }
                        }
                      }
                      var6 = kh.field_U[0];
                      break L58;
                    }
                  }
                }
                if (-1 <= (ci.field_a[1] ^ -1)) {
                  if (of.field_h != null) {
                    break L54;
                  } else {
                    if (-1 != (jf.field_c ^ -1)) {
                      break L54;
                    } else {
                      if (kh.field_U[1] > 0) {
                        L62: {
                          if (!fh.field_c[1]) {
                            break L62;
                          } else {
                            if (-1 <= (kh.field_ib[an.field_r[kh.field_U[1]]] ^ -1)) {
                              ci.field_a[1] = ld.a(-104, 0);
                              var6 = 0;
                              break L62;
                            } else {
                              break L62;
                            }
                          }
                        }
                        if (!fh.field_c[1]) {
                          break L54;
                        } else {
                          if (0 < kh.field_ib[an.field_r[kh.field_U[1]]]) {
                            dupTemp$3 = an.field_r[kh.field_U[1]];
                            kh.field_ib[dupTemp$3] = kh.field_ib[dupTemp$3] - 1;
                            ci.field_a[1] = ld.a(param4 + -105, kh.field_U[1]);
                            var6 = kh.field_U[1];
                            break L54;
                          } else {
                            break L54;
                          }
                        }
                      } else {
                        if (!fh.field_c[1]) {
                          break L54;
                        } else {
                          if ((dn.field_j ^ -1) <= -3) {
                            break L54;
                          } else {
                            ci.field_a[1] = ld.a(-104, 0);
                            var6 = 0;
                            if (kh.field_U[0] != 0) {
                              break L54;
                            } else {
                              ci.field_a[0] = ci.field_a[1];
                              break L54;
                            }
                          }
                        }
                      }
                    }
                  }
                } else {
                  ci.field_a[1] = ci.field_a[1] - 1;
                  if (var6 >= 0) {
                    break L54;
                  } else {
                    if (!fh.field_c[1]) {
                      break L54;
                    } else {
                      L63: {
                        if (0 > an.field_r[kh.field_U[1]]) {
                          break L63;
                        } else {
                          if (0 >= kh.field_ib[an.field_r[kh.field_U[1]]]) {
                            break L54;
                          } else {
                            break L63;
                          }
                        }
                      }
                      var6 = kh.field_U[1];
                      break L54;
                    }
                  }
                }
              }
            }
            L64: {
              if (-1 <= (var6 ^ -1)) {
                break L64;
              } else {
                if (-1 <= (kh.field_ib[an.field_r[var6]] ^ -1)) {
                  var6 = -1;
                  break L64;
                } else {
                  break L64;
                }
              }
            }
            L65: {
              if (null == rc.field_c) {
                break L65;
              } else {
                if (-4 == (var6 ^ -1)) {
                  break L65;
                } else {
                  f.a((byte) 119);
                  eh.field_c.a(sf.field_V[36], 100, uh.field_i);
                  break L65;
                }
              }
            }
            L66: {
              if (jm.field_e < 0) {
                break L66;
              } else {
                if ((var6 ^ -1) == -2) {
                  break L66;
                } else {
                  L67: {
                    eh.field_c.a(sf.field_V[5 - -jm.field_e], 100, uh.field_i);
                    if (ag.field_k > 4) {
                      eh.field_c.a(sf.field_V[(int)(2.0 * Math.random()) + 10], 100, uh.field_i);
                      break L67;
                    } else {
                      break L67;
                    }
                  }
                  ag.field_k = 0;
                  jm.field_e = -1;
                  break L66;
                }
              }
            }
            L68: {
              if (-1 < (we.field_b ^ -1)) {
                break L68;
              } else {
                if (var6 == 6) {
                  break L68;
                } else {
                  we.field_b = -1;
                  break L68;
                }
              }
            }
            L69: {
              var7 = km.field_A;
              if (-1 == (nh.field_H ^ -1)) {
                break L69;
              } else {
                var7 = cf.field_q;
                break L69;
              }
            }
            L70: {
              if (0 <= hf.field_i) {
                var7 = od.field_G;
                break L70;
              } else {
                break L70;
              }
            }
            L71: {
              if (of.field_d != var7) {
                if (of.field_d != dn.field_i) {
                  stackIn_312_0 = 1;
                  break L71;
                } else {
                  stackIn_312_0 = 0;
                  break L71;
                }
              } else {
                stackIn_312_0 = 0;
                break L71;
              }
            }
            L72: {
              var8 = stackIn_312_0;
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
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L74: {
            var5 = decompiledCaughtException;
            stackIn_322_0 = (RuntimeException) (var5);

            stackIn_322_1 = new StringBuilder().append("hd.H(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_323_0 = (RuntimeException) ((Object) stackIn_322_0);
              stackIn_323_1 = (StringBuilder) ((Object) stackIn_322_1);
              stackIn_323_2 = "null";
              break L74;
            } else {
              stackIn_323_0 = (RuntimeException) ((Object) stackIn_322_0);
              stackIn_323_1 = (StringBuilder) ((Object) stackIn_322_1);
              stackIn_323_2 = "{...}";
              break L74;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_323_0), stackIn_323_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_q = "This game has been updated! Please reload this page.";
    }
}
