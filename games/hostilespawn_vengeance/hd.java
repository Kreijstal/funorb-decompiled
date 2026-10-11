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
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var4Lifetime1;
        var7 = HostileSpawn.field_I ? 1 : 0;
        try {
          var8 = new en(param0.a("", "logo.fo3d", 0));
          var10 = var8;
          var3 = var10.l(32270);
          var10.c(false);
          ce.field_f = gj.a(param1, var10);
          wj.field_J = new pf[var3];
          of.field_f = new int[var3][];
          for (var4 = 0; var4 < var3; var4++) {
            wj.field_J[var4] = tf.a(4, var8);
          }
          var10.q(-28);
          var9 = 0;
          var4Lifetime1 = var9;
          while (var3 > var9) {
            var5 = wj.field_J[var9];
            var5.a(6, 6, (byte) 40, 1, 6);
            var5.c(-128);
            var6 = new int[]{var5.field_J + var5.field_d >> 1, var5.field_C + var5.field_a >> 1, var5.field_t + var5.field_D >> 1};
            of.field_f[var9] = var6;
            var5.a(-var6[0], (byte) -85, -var6[1], -var6[2]);
            var9++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("hd.G(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
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
        og dupTemp$2 = null;
        oj dupTemp$0 = null;
        oj dupTemp$1 = null;
        int stackIn_116_0 = 0;
        boolean stackIn_161_0 = false;
        RuntimeException stackIn_367_0 = null;
        StringBuilder stackIn_367_1 = null;
        String stackIn_368_2 = null;
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
        oj var39Lifetime1;
        oj var39Lifetime2;
        int var13Lifetime1;
        int var13Lifetime2;
        int var13Lifetime3;
        int var14Lifetime1;
        int var14Lifetime2;
        int var16Lifetime1;
        int var17Lifetime1;
        var38 = HostileSpawn.field_I ? 1 : 0;
        try {
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
          var39Lifetime1 = var5;
          var6 = var5.field_j;
          var7 = var6.b(-4);
          var47 = ln.field_a.field_f;
          var44 = ln.field_a.field_c;
          var41 = var44;
          var9 = var41;
          var10 = var6.field_e;
          var11 = var6.field_g;
          if (param0 != 61) {
            field_q = (String) null;
          }
          if (tm.field_q > 0) {
            tm.field_q = tm.field_q - 1;
          }
          var12 = 0;
          for (var13 = 0; var3 > var13; var13++) {
            var9[mm.field_m[var13].field_j.b(-4)] = 0;
          }
          for (var13Lifetime1 = 0; var3 > var13Lifetime1; var13Lifetime1++) {
            boolean decompiledFrameRemainder0 = true;
            var39Lifetime2 = mm.field_m[var13Lifetime1];
            if (var39Lifetime2 != null) {
              if (var39Lifetime2.field_i == 8) {
                var12 = 1;
              }
              var39Lifetime2.b((byte) 117);
              var15_ref_oc = var39Lifetime2.field_j;
              var16 = var15_ref_oc.b(-4);
              var17 = -var10 + var15_ref_oc.field_e;
              var18 = -var11 + var15_ref_oc.field_g;
              if (0 > var17) {
                var17 = -var17;
              }
              if (0 > var18) {
                var18 = -var18;
              }
              var19 = var18 + var17;
              if (var19 <= 50) {
                if (bm.field_c == 0 &&
                  ha.field_t == 4 &&
                  var39Lifetime2.field_i == 125 &&
                  var19 < 5) {
                  var5.field_c = el.a((double)var10, (double)nh.field_E.field_e, 16, (double)var11, (double)nh.field_E.field_g);
                  ca.a(81.5, 1, 37.0, true, 64);
                  kd.a(0, 1);
                }
                L34: {
                  var39Lifetime2.field_G = 0;
                  var20 = var5.field_l;
                  var21 = var20.field_f;
                  var23 = var20.field_a;
                  var26 = var39Lifetime2.field_i;
                  if (var26 == 0) {
                    var26_double = var21 + (double)var10 - 0.5;
                    var28_double = -0.5 + ((double)var11 + var23);
                    var30_double = gj.a(var26_double, -4);
                    var32 = sf.a(param0 ^ 37, var28_double);
                    var34 = 1.0 + Math.atan2((double)(-j.field_c) + var30_double, (double)(-rb.field_m) + var32) * 128.0 / 3.141592653589793;
                    if (dl.field_l) {
                      var34 = 0.0;
                    }
                    if (2 == ln.field_a.field_y[var7]) {
                      ue.field_d = 0;
                    }
                    var36 = var34 - var39Lifetime2.field_c;
                    if (128.0 <= var36) {
                      var36 = var36 - 256.0;
                    }
                    if (var36 < -128.0) {
                      var36 = var36 + 256.0;
                    }
                    boolean decompiledFrameRemainder1 = true;
                    var36 = Math.abs(var36);
                    if (dn.field_i != of.field_d && (!(hf.field_i < 0) ||
                      j.field_c != vc.field_g ||
                      rh.field_A != rb.field_m ||
                      32.0 < Math.abs(var36))) {
                      var39Lifetime2.a(param0 + 164, var34, 8);
                      if (var36 > 1.0) {
                        vc.field_g = -2;
                      } else {
                        vc.field_g = j.field_c;
                        rh.field_A = rb.field_m;
                      }
                      decompiledFrameRemainder1 = false;
                    }
                    else {
                      rh.field_A = rb.field_m;
                      vc.field_g = j.field_c;
                    }
                    if (nh.field_H != 2 &&
                      nh.field_H != 3) {
                      stackIn_116_0 = 2;
                    } else {
                      stackIn_116_0 = 1;
                    }
                    var25 = stackIn_116_0;
                    if (km.field_A == of.field_d) {
                      var25 = 5;
                    }
                    if (var39Lifetime2.field_p >= var25) {
                      cg.field_b = cg.field_b + 1;
                      var39Lifetime2.field_z = var39Lifetime2.field_z + 1;
                      var39Lifetime2.field_p = 0;
                      if (cf.field_q.length <= var39Lifetime2.field_z) {
                        var39Lifetime2.field_z = 0;
                      }
                      if (ng.field_p[nh.field_H] != null &&
                        cg.field_b >= ng.field_p[nh.field_H].length) {
                        cg.field_b = 0;
                      }
                      dn.field_b = dn.field_b + 1;
                      if (dn.field_i == of.field_d &&
                        of.field_d.length <= dn.field_b) {
                        dn.field_b = 0;
                        of.field_d = km.field_A;
                      } else {
                        if (null != of.field_d &&
                          dn.field_b >= of.field_d.length) {
                          dn.field_b = 0;
                        }
                      }
                    }
                  } else {
                    if (var26 != 30) {
                      if (var26 == 18) {
                        if (!var39Lifetime2.field_n && (!(0 >= ln.field_a.field_i[var16]) ||
                          !(0 >= ln.field_a.field_i[var16 - 1]) ||
                          !(0 >= ln.field_a.field_i[var16 - ln.field_a.field_d - 1]))) {
                          var39Lifetime2.field_n = true;
                          if (0 == te.field_K) {
                            var26 = uh.field_i;
                            te.field_K = (int)(Math.random() * 50.0) + 20;
                            if (var17 >= 4 ||
                              var18 >= 4) {
                              var26 = var26 / 2;
                            }
                            jh.a(var26, (byte) 29, 18, jc.field_c, 3);
                          }
                        }
                        if (!var39Lifetime2.field_n) {
                          cf.a(param1, (byte) 44, var13Lifetime1, var40);
                        } else {
                          qj.a(-90, var13Lifetime1, param1, var40);
                        }
                      } else {
                        if (var26 == 27) {
                          if (!var39Lifetime2.field_n) {
                            if (gj.a(var16, var15_ref_oc.field_g, -122, var15_ref_oc.field_e) ||
                              gj.a(var16 - 1, var15_ref_oc.field_g, -112, -1 + var15_ref_oc.field_e) ||
                              gj.a(var16 - 1 - ln.field_a.field_d, var15_ref_oc.field_g - 1, -94, -1 + var15_ref_oc.field_e) ||
                              gj.a(-ln.field_a.field_d + var16, var15_ref_oc.field_g - 1, -124, var15_ref_oc.field_e)) {
                              tk.a(3, jc.field_c, 28, true);
                              var39Lifetime2.field_n = true;
                            }
                          } else {
                            stackIn_161_0 = (6 != rl.field_c);
                            n.field_o = stackIn_161_0;
                            qj.a(-126, var13Lifetime1, param1, var40);
                          }
                        } else {
                          if (var26 != 1 &&
                            var26 != 19) {
                            if (225 == var26) {
                              if (var39Lifetime2.field_I > 0 &&
                                ln.field_a.field_i[var16] <= 0 &&
                                ln.field_a.field_i[var16 - 1] <= 0 &&
                                ln.field_a.field_i[-1 + (-ln.field_a.field_d + var16)] <= 0) {
                                cf.a(param1, (byte) 124, var13Lifetime1, var40);
                                var44[var16] = 4;
                              } else {
                                var44[var16] = 0;
                                var39Lifetime2.a(false, 0, 21963, 1, rl.field_c, var15_ref_oc);
                              }
                            } else {
                              if (23 != var26 &&
                                var26 != 28) {
                                if (var26 == 24) {
                                  pl.a((byte) 126, var39Lifetime2, var16);
                                } else {
                                  if (var26 == 2) {
                                    he.a(var23, var15_ref_oc, var10, var21, var39Lifetime2, param0 ^ -5, var11);
                                  } else {
                                    if (var26 != 25 &&
                                      var26 != 3) {
                                      if (var26 == 4) {
                                        oj.a(var39Lifetime2, var15_ref_oc, var11, var23, var10, var21, true);
                                      } else {
                                        if (var26 != 5 &&
                                          var26 != 22) {
                                          if (var26 == 6) {
                                            if (!(var39Lifetime2.field_I > 0)) {
                                              jj.a(16, var39Lifetime2);
                                            }
                                          } else {
                                            if (var26 == 7) {
                                              if ((ha.field_t == 0 ||
                                                14 == ha.field_t ||
                                                ha.field_t == 17)) {
                                                var39Lifetime2.field_I = 10;
                                                var39Lifetime2.field_b = true;
                                                var39Lifetime2.field_i = 1;
                                                var39Lifetime2.field_C = l.a(-28, var39Lifetime2.field_i);
                                              }
                                            } else {
                                              if (var26 == 8) {
                                                if (1 == bm.field_c &&
                                                  rl.field_c == -1) {
                                                  qj.a(-121, var13Lifetime1, param1, var40);
                                                } else {
                                                  if (null == vi.field_p) {
                                                    vh.a(var5, 5, var39Lifetime2);
                                                  } else {
                                                    u.a(param1, var40, var13Lifetime1, param0 ^ 61);
                                                  }
                                                }
                                              } else {
                                                if (var26 != 10 &&
                                                  var26 != 129 &&
                                                  var26 != 131 &&
                                                  var26 != 133) {
                                                  if (var26 != 11 &&
                                                    var26 != 128 &&
                                                    var26 != 130) {
                                                    if (var26 == 132) {
                                                      ql.a(var20, param0 ^ -120, var6, var39Lifetime2, true);
                                                    } else {
                                                      if (20 == var26) {
                                                        sj.a(var44, var39Lifetime2, var4, var16, 0);
                                                      } else {
                                                        if (21 == var26) {
                                                          if (var39Lifetime2.field_I > 0) {
                                                            var44[var16] = 2;
                                                          } else {
                                                            if (var44[var16] == 2) {
                                                              var44[var16] = 0;
                                                            }
                                                            ln.field_a.field_y[var16] = 146;
                                                            var39Lifetime2.field_i = -1;
                                                          }
                                                        } else {
                                                          if (var26 == 12) {
                                                            ja.a(var39Lifetime2, (byte) 113, var15_ref_oc);
                                                          } else {
                                                            if (var26 == 13) {
                                                              var44[var16] = 2;
                                                              var9[-1 + var16] = 2;
                                                              var9[var16 - var4] = 2;
                                                              var9[var16 - var4 - 1] = 2;
                                                            } else {
                                                              if (var26 == 14) {
                                                                var44[var16] = 2;
                                                                var9[-1 + var16] = 2;
                                                                var9[var16 - var4] = 2;
                                                                var9[var16 - var4 - 1] = 2;
                                                              } else {
                                                                if (15 == var26) {
                                                                  ra.a(1, var44, var16, var39Lifetime2, var47);
                                                                } else {
                                                                  if (var26 != 16 &&
                                                                    229 != var26) {
                                                                    if (17 == var26) {
                                                                      var39Lifetime2.field_e = var39Lifetime2.field_e - 1;
                                                                      if (!(var39Lifetime2.field_e > -3000)) {
                                                                        var39Lifetime2.field_i = -1;
                                                                      }
                                                                      break L34;
                                                                    }
                                                                    if (var26 != 227) {
                                                                      if (var26 == 226) {
                                                                        var39Lifetime2.field_e = var39Lifetime2.field_e - 1;
                                                                        if (!(var39Lifetime2.field_e > -3000)) {
                                                                          var39Lifetime2.field_i = -1;
                                                                        }
                                                                        break L34;
                                                                      }
                                                                      if (var26 != 228 &&
                                                                        var26 != 232) {
                                                                        if (var26 == 125) {
                                                                          if (!(var39Lifetime2.field_I > 0)) {
                                                                            if (bm.field_c == 0 &&
                                                                              0 == rl.field_c) {
                                                                              var39Lifetime2.field_I = 100;
                                                                            } else {
                                                                              lc.a(var39Lifetime2, param0 ^ 46);
                                                                            }
                                                                          }
                                                                        } else {
                                                                          if (((231 == var26)) &&
                                                                            (!(var39Lifetime2.field_I > 0))) {
                                                                            var39Lifetime2.c((byte) 64);
                                                                            for (var26 = 0; var26 < 10; var26++) {
                                                                              mm.field_m[el.field_j] = new oj(var39Lifetime2.field_j, 3, rl.field_c);
                                                                              el.field_j = el.field_j + 1;
                                                                            }
                                                                            tk.a(3, jc.field_c, 32, true);
                                                                            jh.a(uh.field_i * 3 / 2, (byte) 118, 47, jc.field_c, 3);
                                                                          }
                                                                        }
                                                                        break L34;
                                                                      }
                                                                    }
                                                                  }
                                                                  var39Lifetime2.field_e = var39Lifetime2.field_e - 1;
                                                                  if (!(var39Lifetime2.field_e > -3000)) {
                                                                    var39Lifetime2.field_i = -1;
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  } else {
                                                    ql.a(var20, param0 ^ -120, var6, var39Lifetime2, true);
                                                  }
                                                } else {
                                                  ql.a(var20, -125, var6, var39Lifetime2, false);
                                                }
                                              }
                                            }
                                          }
                                        } else {
                                          ab.a(var4, false, var6, var15_ref_oc, var16, var23, var40, var39Lifetime2, var21, var11, var10);
                                        }
                                      }
                                    } else {
                                      if (1 == bm.field_c &&
                                        rl.field_c == -1) {
                                        qj.a(-97, var13Lifetime1, param1, var40);
                                      } else {
                                        df.a(3, var39Lifetime2, var40, var6, var11, var10, var21, var5, var15_ref_oc, var23);
                                      }
                                    }
                                  }
                                }
                              } else {
                                if (((bm.field_c == 1)) &&
                                  ((rl.field_c == -1))) {
                                  qj.a(param0 - 185, var13Lifetime1, param1, var40);
                                }
                              }
                            }
                            break L34;
                          }
                          qj.a(-90, var13Lifetime1, param1, var40);
                        }
                      }
                    } else {
                      var26 = var39Lifetime2.field_j.field_g * 24;
                      if (uj.field_p.field_g - 24 <= var26 &&
                        var26 < 480 + uj.field_p.field_g) {
                        jn.field_F[ib.field_c].field_c = 256.0 * Math.random();
                        jn.field_F[ib.field_c].field_j.a((byte) 46, var39Lifetime2.field_j);
                        jn.field_F[ib.field_c].field_l.a(var39Lifetime2.field_l, -28860);
                        dupTemp$2 = jn.field_F[ib.field_c].field_l;
                        dupTemp$2.field_f = dupTemp$2.field_f + (Math.random() + -0.5);
                        jn.field_F[ib.field_c].field_e = 0;
                        jn.field_F[ib.field_c].field_h = 0;
                        jn.field_F[ib.field_c].field_i = 6;
                        ib.field_c = ib.field_c + 1;
                      }
                      ln.field_a.field_c[var39Lifetime2.field_j.b(bm.a((int) param0, -63))] = 4;
                      if (0 == (em.field_c & 7)) {
                        var27 = (int)((-var39Lifetime2.field_l.field_f + (var21 + (double)var10 - (double)var15_ref_oc.field_e)) * 24.0);
                        var28 = (int)(24.0 * (var23 + (double)var11 - (double)var15_ref_oc.field_g - var39Lifetime2.field_l.field_a));
                        var29 = (int)Math.sqrt((double)(var27 * var27 + var28 * var28));
                        if (var29 <= 400) {
                          var30 = 400 - var29;
                          if (mg.field_c < var30) {
                            mg.field_c = var30;
                          }
                        }
                      }
                    }
                  }
                }
                if (27 == var39Lifetime2.field_i) {
                  var44[var16] = 6;
                  if (var9[var16 - 1] == 0) {
                    var9[-1 + var16] = 6;
                  }
                  if (0 == var9[-ln.field_a.field_d + var16]) {
                    var9[-ln.field_a.field_d + var16] = 6;
                  }
                  if (var9[var16 - ln.field_a.field_d - 1] == 0) {
                    var9[-1 + var16 - ln.field_a.field_d] = 6;
                  }
                }
                if (var39Lifetime2.field_i > 0 &&
                  var39Lifetime2.field_i != 7 && (!(var39Lifetime2.field_i >= 10) ||
                  var39Lifetime2.field_i == 22 ||
                  var39Lifetime2.field_i == 231)) {
                  if (2 != var39Lifetime2.field_i) {
                    if (var39Lifetime2.field_i != 5 &&
                      var39Lifetime2.field_i != 22) {
                      if ((!var39Lifetime2.field_b ||
                        var39Lifetime2.field_i == 225) &&
                        var39Lifetime2.field_i != 231) {
                        if ((0 != var39Lifetime2.field_i)) {
                          var44[var16] = 3;
                          if (var9[1 + var16] == 0) {
                            var9[var16 + 1] = 1;
                          }
                          if ((var9[var16 + ln.field_a.field_d] == 0)) {
                            var9[ln.field_a.field_d + var16] = 1;
                          }
                        }
                      } else {
                        var44[var16] = 5;
                      }
                      decompiledFrameRemainder0 = false;
                    }
                    else {
                      var9[var15_ref_oc.b(param0 - 65)] = 4;
                    }
                  } else {
                    if (r.field_a == 0 &&
                      var39Lifetime2.field_F > 250) {
                      var44[var16] = 3;
                    }
                  }
                }
              }
            }
          }
          if (var12 == 0 &&
            3 == ha.field_t) {
            kd.a(0, 1);
          }
          for (var13Lifetime2 = 0; dk.field_o > var13Lifetime2; var13Lifetime2++) {
            var43 = vj.field_w[var13Lifetime2];
            if (var43 != null) {
              var15 = var43.field_j.field_e - var10;
              if (var15 < 0) {
                var15 = -var15;
              }
              var16Lifetime1 = var43.field_j.field_g - var11;
              if (var16Lifetime1 < 0) {
                var16Lifetime1 = -var16Lifetime1;
              }
              var17Lifetime1 = var16Lifetime1 + var15;
              if (ha.field_t == 10 &&
                var43.field_j.a(nh.field_E, -126) &&
                var17Lifetime1 < 3) {
                r.field_a = 1;
                ca.a(19.0, 0, 32.4, true, 0);
                kd.a(0, 1);
                tg.field_a = true;
              }
            } else {
              vj.field_w[var13Lifetime2] = vj.field_w[dk.field_o];
              dk.field_o = dk.field_o - 1;
            }
          }
          for (var14 = el.field_j - 1; var14 > 0; var14--) {
            var13Lifetime3 = 0;
            if (mm.field_m[var14].field_G > 0) {
              var13Lifetime3 = 16;
            }
            if (var13Lifetime3 > mm.field_m[var14].field_q) {
              dupTemp$0 = mm.field_m[var14];
              dupTemp$0.field_q = dupTemp$0.field_q + 1;
            }
            if (mm.field_m[var14].field_q > var13Lifetime3) {
              dupTemp$1 = mm.field_m[var14];
              dupTemp$1.field_q = dupTemp$1.field_q - 1;
            }
            if (-1 == mm.field_m[var14].field_i) {
              el.field_j = el.field_j - 1;
              mm.field_m[var14] = mm.field_m[el.field_j];
              mm.field_m[el.field_j] = null;
            }
          }
          if (eh.field_g > 0 &&
            hg.field_e == 1) {
            var14Lifetime1 = 0;
            if (50 <= ak.field_f) {
              var14Lifetime1++;
            }
            if (150 <= ak.field_f) {
              var14Lifetime1++;
            }
            if (ak.field_f >= 400) {
              var14Lifetime1++;
            }
            if (ak.field_f >= 700) {
              var14Lifetime1++;
            }
            if (32 > eh.field_g) {
              var14Lifetime1++;
            }
            if (le.field_D > 0 &&
              le.field_D < 6000) {
              var14Lifetime1 = var14Lifetime1 + 6000 / le.field_D;
            }
            if (var14Lifetime1 >= mb.field_s.field_g.length) {
              var14Lifetime1 = -1 + mb.field_s.field_g.length;
            }
            mb.field_s.b(var14Lifetime1, (byte) 112);
          }
          if (0 < eh.field_g &&
            hg.field_e == 1) {
            if (256 < lj.field_q) {
              lj.field_q = 256;
            }
            if (lj.field_q <= mb.field_s.field_v) {
              if (mb.field_s.field_v > lj.field_q) {
                mb.field_s.field_v = mb.field_s.field_v - 1;
              }
            } else {
              mb.field_s.field_v = Math.min(lj.field_q, mb.field_s.field_v + 8);
            }
          }
          if (eh.field_g > 0 &&
            1 == hg.field_e) {
            if (nl.field_b < 100 &&
              ha.field_t == 3) {
              nl.field_b = 100;
            }
            if (nl.field_b > mb.field_s.field_u) {
              mb.field_s.field_u = Math.min(nl.field_b, mb.field_s.field_u + 8);
            } else {
              if (nl.field_b < mb.field_s.field_u) {
                mb.field_s.field_u = Math.max(nl.field_b, -8 + mb.field_s.field_u);
              }
            }
          }
          if ((em.field_c & 7) == 0) {
            if (jh.field_db > 0) {
              if (null != ec.field_b) {
                ec.field_b.g(uh.field_i * jh.field_db / 400);
              } else {
                ec.field_b = b.a(lm.field_A[5], 100, uh.field_i * jh.field_db / 400);
                ec.field_b.d(-1);
                eh.field_c.b(ec.field_b);
              }
            } else {
              if (null != ec.field_b) {
                eh.field_c.a(ec.field_b);
                ec.field_b = null;
              }
            }
            if (mg.field_c > 0) {
              if (null == q.field_i) {
                q.field_i = b.a(fg.field_b[25], 100, uh.field_i * mg.field_c / 400);
                q.field_i.d(-1);
                eh.field_c.b(q.field_i);
              } else {
                q.field_i.g(uh.field_i * mg.field_c / 400);
              }
            } else {
              if (null != q.field_i) {
                eh.field_c.a(q.field_i);
                q.field_i = null;
              }
            }
            if (tb.field_N > 0) {
              if (e.field_l == null) {
                e.field_l = b.a(fg.field_b[26], 100, 10);
                e.field_l.d(-1);
                eh.field_c.b(e.field_l);
              } else {
                var14Lifetime2 = e.field_l.k();
                if (var14Lifetime2 < 2 * uh.field_i) {
                  e.field_l.g(var14Lifetime2 + 20);
                } else {
                  if (2 * uh.field_i < var14Lifetime2) {
                    e.field_l.g(uh.field_i * 2);
                  }
                }
              }
            } else {
              if (e.field_l != null) {
                var14Lifetime2 = e.field_l.k();
                if (var14Lifetime2 > 10) {
                  e.field_l.g(var14Lifetime2 - 10);
                } else {
                  eh.field_c.a(e.field_l);
                  e.field_l = null;
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_367_0 = var2;
          stackIn_367_1 = new StringBuilder().append("hd.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_368_2 = "null";
          } else {
            stackIn_368_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_367_0), ((StringBuilder) (Object) stackIn_367_1).append(stackIn_368_2).append(')').toString());
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
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -120 / ((param1 - 3) / 42);
          if (this.field_o.a(param0, (byte) -117) == bi.field_d) {
            stackIn_3_0 = bi.field_d;
            return stackIn_3_0;
          }
          if (!param0.equals(this.field_p)) {
            var4 = nd.a(3888, param0);
            if (!var4.d((byte) -22)) {
              stackIn_8_0 = m.field_n;
              return stackIn_8_0;
            }
            this.field_p = param0;
            this.field_s = var4.a(17539);
          }
          if (this.field_s) {
            stackIn_13_0 = nd.field_d;
          } else {
            stackIn_13_0 = bi.field_d;
          }
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("hd.L(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
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
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_o.a(param1, (byte) -107) == bi.field_d) {
            stackIn_3_0 = this.field_o.a((byte) 19, param1);
            return stackIn_3_0;
          }
          var3_int = -8 / ((-24 - param0) / 35);
          if (this.a(param1, (byte) -54) != bi.field_d) {
            return ak.field_g;
          }
          stackIn_7_0 = ld.field_r;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("hd.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, oj param2, int param3, int param4) {
        int var5_int = 0;
        int dupTemp$0 = 0;
        int dupTemp$1 = 0;
        int dupTemp$2 = 0;
        int dupTemp$3 = 0;
        int stackIn_134_0 = 0;
        int stackIn_167_0 = 0;
        int stackIn_315_0 = 0;
        RuntimeException stackIn_325_0 = null;
        StringBuilder stackIn_325_1 = null;
        String stackIn_326_2 = null;
        RuntimeException decompiledCaughtException = null;
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
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        int var8Lifetime1;
        int var9Lifetime1;
        int var6Lifetime4;
        var15 = HostileSpawn.field_I ? 1 : 0;
        try {
          ln.field_a.field_c[param3] = param4;
          if (param2.field_t > 0 &&
            !dl.field_l) {
            param2.field_l.a(param2.field_t, param2.field_K, param2.field_j, false, ln.field_a);
            param2.b((byte) 117);
            param2.field_t = param2.field_t - 1;
          }
          if (of.field_h == null &&
            jf.field_c == 0) {
            if (bm.field_c == 0 &&
              rl.field_c == 5 &&
              param0 >= 46 &&
              param0 <= 56 &&
              param1 <= 9) {
              var6 = 0;
              for (var5_int = 0; var5_int < mm.field_m.length; var5_int++) {
                var16 = mm.field_m[var5_int];
                if (var16 != null &&
                  var16.field_j.field_g < 15 &&
                  var16.field_I > 0 && (var16.field_i == 5 ||
                  var16.field_i == 22)) {
                  var6++;
                }
              }
              if (var6 >= 2) {
                param2.field_I = 0;
                ci.a(100, 55);
              }
            }
            if (pj.field_v == 4) {
              param2.field_c = param2.field_c - 128.0;
              param2.b(-27757, je.field_a[1], ln.field_a);
              param2.field_c = param2.field_c + 128.0;
            }
            var6Lifetime4 = 0;
            if (dl.field_l) {
              fj.field_Pb = 0.0;
              var6Lifetime4 = 1;
            } else {
              if (qh.field_m[la.field_g]) {
                fj.field_Pb = (double)(int)param2.field_c;
                if (qh.field_m[aa.field_a]) {
                  fj.field_Pb = fj.field_Pb + 32.0;
                }
                var6Lifetime4 = 1;
                if (qh.field_m[fj.field_Ob]) {
                  fj.field_Pb = fj.field_Pb - 32.0;
                }
              } else {
                if (qh.field_m[jh.field_fb]) {
                  fj.field_Pb = (double)(int)(param2.field_c + 128.0);
                  if (qh.field_m[aa.field_a]) {
                    fj.field_Pb = fj.field_Pb - 32.0;
                  }
                  if (qh.field_m[fj.field_Ob]) {
                    fj.field_Pb = fj.field_Pb + 32.0;
                  }
                  var6Lifetime4 = 1;
                } else {
                  if (!qh.field_m[aa.field_a]) {
                    if (!qh.field_m[fj.field_Ob]) {
                      if (qh.field_m[ln.field_q]) {
                        fj.field_Pb = 0.0;
                        if (qh.field_m[ha.field_v]) {
                          fj.field_Pb = fj.field_Pb + 32.0;
                        }
                        if (qh.field_m[bh.field_b]) {
                          fj.field_Pb = fj.field_Pb - 32.0;
                        }
                        var6Lifetime4 = 1;
                      } else {
                        if (!qh.field_m[fj.field_Jb]) {
                          if (qh.field_m[ha.field_v]) {
                            var6Lifetime4 = 1;
                            fj.field_Pb = 64.0;
                          } else {
                            if (qh.field_m[bh.field_b]) {
                              fj.field_Pb = 192.0;
                              var6Lifetime4 = 1;
                            }
                          }
                        } else {
                          fj.field_Pb = 128.0;
                          if (qh.field_m[ha.field_v]) {
                            fj.field_Pb = fj.field_Pb - 32.0;
                          }
                          if (qh.field_m[bh.field_b]) {
                            fj.field_Pb = fj.field_Pb + 32.0;
                          }
                          var6Lifetime4 = 1;
                        }
                      }
                    } else {
                      fj.field_Pb = (double)(int)(192.0 + param2.field_c);
                      var6Lifetime4 = 1;
                    }
                  } else {
                    fj.field_Pb = (double)(int)(64.0 + param2.field_c);
                    var6Lifetime4 = 1;
                  }
                }
              }
            }
            if (dn.field_i == of.field_d) {
              var6Lifetime4 = 0;
              var7_double = (double)param2.field_j.field_e + param2.field_l.field_f - vi.field_h;
              param2.field_c = (double)qi.field_N;
              var9_double = -bc.field_i + ((double)param2.field_j.field_g + param2.field_l.field_a);
              if (0.1 < var7_double) {
                param2.field_l.field_f = param2.field_l.field_f - 0.1;
              } else {
                if (-0.1 > var7_double) {
                  param2.field_l.field_f = param2.field_l.field_f + 0.1;
                } else {
                  param2.field_l.field_f = param2.field_l.field_f - var7_double;
                }
              }
              if (!(var9_double > 0.1)) {
                if (!(-0.1 > var9_double)) {
                  param2.field_l.field_a = param2.field_l.field_a - var9_double;
                } else {
                  param2.field_l.field_a = param2.field_l.field_a + 0.1;
                }
              } else {
                param2.field_l.field_a = param2.field_l.field_a - 0.1;
              }
              param2.b((byte) 117);
              if (HostileSpawn.field_F &&
                0 == param2.field_p &&
                dn.field_b == 15) {
                eh.field_c.a(fg.field_b[22], 100, uh.field_i);
              }
            }
            var7_int = je.field_a[1];
            if (bh.field_d > 0) {
              var7_int = (int)((double)var7_int * 1.5);
            }
            if (var6Lifetime4 != 0) {
              var8_double = param2.field_c;
              param2.field_c = fj.field_Pb;
              li.field_r = param2.b(-27757, var7_int, ln.field_a);
              param2.field_c = var8_double;
            }
            boolean decompiledFrameRemainder2 = true;
            if (var6Lifetime4 != 0) {
              if (li.field_r[0] &&
                li.field_r[1]) {
                var6Lifetime4 = 0;
              } else {
                if (!li.field_r[1]) {
                  if (li.field_r[0]) {
                    if (64.0 != fj.field_Pb &&
                      fj.field_Pb != 192.0) {
                      if (!(64.0 > fj.field_Pb) &&
                        !(fj.field_Pb > 192.0)) {
                        fj.field_Pb = 128.0;
                      } else {
                        fj.field_Pb = 0.0;
                      }
                      decompiledFrameRemainder2 = false;
                    }
                    else {
                      var6Lifetime4 = 0;
                    }
                  }
                } else {
                  if (0.0 != fj.field_Pb &&
                    fj.field_Pb != 128.0) {
                    if (fj.field_Pb < 128.0) {
                      fj.field_Pb = 64.0;
                    } else {
                      fj.field_Pb = 192.0;
                    }
                    decompiledFrameRemainder2 = false;
                  }
                  else {
                    var6Lifetime4 = 0;
                  }
                }
              }
            }
            boolean decompiledFrameRemainder0 = true;
            boolean decompiledFrameRemainder1 = true;
            var8 = 0;
            if (var6Lifetime4 != 0) {
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
              } else {
                if (var14 != 2) {
                  if (4 == var14) {
                    var12 -= 4;
                    var13 += 4;
                  } else {
                    if (3 != var14) {
                      if (var10 < var9 &&
                        var11 > var9) {
                        if (var12 > var9) {
                          var8 = 2;
                        } else if (var9 <= var13) {
                          var8 = 4;
                        } else {
                          var8 = 3;
                        }
                      } else {
                        var8 = 1;
                      }
                      stackIn_134_0 = (var8 == nh.field_H) ? 0 : 1;
                      var9 = stackIn_134_0;
                      if (var9 != 0 &&
                        var8 == 0 &&
                        nh.field_H == 1 &&
                        6 != cg.field_b &&
                        7 != cg.field_b &&
                        cg.field_b != 18 &&
                        cg.field_b != 19) {
                        fj.field_Pb = param2.field_c;
                        var9 = 0;
                      }
                      if (var9 != 0) {
                        if (var8 != 1 &&
                          4 != var8) {
                          cg.field_b = 0;
                        } else {
                          cg.field_b = 6;
                        }
                        nh.field_H = var8;
                      }
                      fj.field_Pb = fj.field_Pb + (double)(-li.field_u[nh.field_H] + 256);
                      while (256.0 <= fj.field_Pb) {
                        fj.field_Pb = fj.field_Pb - 256.0;
                      }
                      decompiledFrameRemainder0 = false;
                    }
                    else {
                      var13 -= 4;
                      var11 += 4;
                    }
                  }
                } else {
                  var10 -= 4;
                  var12 += 4;
                }
              }
              if (decompiledFrameRemainder0) {
                if (var10 < var9 &&
                  var11 > var9) {
                  if (var12 > var9) {
                    var8 = 2;
                  } else {
                    if (var9 <= var13) {
                      var8 = 4;
                    } else {
                      var8 = 3;
                    }
                  }
                  decompiledFrameRemainder1 = false;
                }
                else {
                  var8 = 1;
                }
              }
            }
            if (decompiledFrameRemainder0) {
              stackIn_167_0 = (var8 == nh.field_H) ? 0 : 1;
              var9Lifetime1 = stackIn_167_0;
              if (var9Lifetime1 != 0 &&
                var8 == 0 &&
                nh.field_H == 1 &&
                6 != cg.field_b &&
                7 != cg.field_b &&
                cg.field_b != 18 &&
                cg.field_b != 19) {
                fj.field_Pb = param2.field_c;
                var9Lifetime1 = 0;
              }
              if (var9Lifetime1 != 0) {
                if (var8 != 1 &&
                  4 != var8) {
                  cg.field_b = 0;
                } else {
                  cg.field_b = 6;
                }
                nh.field_H = var8;
              }
              fj.field_Pb = fj.field_Pb + (double)(-li.field_u[nh.field_H] + 256);
              while (256.0 <= fj.field_Pb) {
                fj.field_Pb = fj.field_Pb - 256.0;
              }
            }
            while (0.0 > fj.field_Pb) {
              fj.field_Pb = fj.field_Pb + 256.0;
            }
            if (dl.field_l) {
              fj.field_Pb = 0.0;
            }
            if (nh.field_H != 0) {
              if (cg.field_b == 3 &&
                param2.field_p == 0) {
                eh.field_c.a(em.field_a[11], 100, uh.field_i);
              } else {
                if (cg.field_b == 15 &&
                  param2.field_p == 1 &&
                  uj.field_l == 1) {
                  eh.field_c.a(em.field_a[12], 100, uh.field_i);
                }
              }
            }
            param2.field_p = param2.field_p + 1;
            if (re.field_l) {
              wk.b(192);
            }
            nd.a(ln.field_a.field_h[param3], param2, param4 + 18459);
          }
          if (um.field_e > 0 &&
            mc.field_I != 4) {
            um.field_e = um.field_e - 1;
            var6Lifetime1 = ba.a((byte) 87);
            if (var6Lifetime1 > eh.field_g) {
              eh.field_g = eh.field_g + 1;
            }
            if (-eh.field_g + var6Lifetime1 > um.field_e) {
              eh.field_g = eh.field_g + (-eh.field_g + var6Lifetime1) / Math.max(um.field_e, 1);
            }
          }
          if (0 > ri.field_h) {
            var6Lifetime2 = ig.field_L;
            if (1 == var6Lifetime2) {
              fh.field_c[0] = true;
              fh.field_c[1] = false;
            } else {
              if (var6Lifetime2 == 2) {
                fh.field_c[1] = true;
                fh.field_c[0] = false;
              } else {
                if ((1 & el.field_m) == 0) {
                  if ((4 & el.field_m) == 0) {
                    fh.field_c[1] = false;
                    fh.field_c[0] = false;
                  } else {
                    fh.field_c[0] = false;
                    fh.field_c[1] = true;
                  }
                } else {
                  fh.field_c[0] = true;
                  fh.field_c[1] = false;
                }
              }
            }
          } else {
            if (1 != pf.field_o) {
              if (pf.field_o == 2) {
                t.a(-128, 1, ri.field_h);
              }
            } else {
              t.a(35, 0, ri.field_h);
            }
            fh.field_c[1] = false;
            fh.field_c[0] = false;
          }
          if (nh.field_M > 0) {
            nh.field_M = nh.field_M - 1;
            if (nh.field_M == 0) {
              dn.field_j = -1;
            }
          }
          var6Lifetime3 = -1;
          if (of.field_d == dn.field_i) {
            hf.field_i = -1;
          } else {
            if (ci.field_a[0] <= 0 &&
              0 >= ci.field_a[1]) {
              hf.field_i = -1;
            }
            if (0 < d.field_u) {
              d.field_u = d.field_u - 1;
              if (kh.field_U[0] == 3 &&
                kh.field_ib[an.field_r[kh.field_U[0]]] > 0) {
                dupTemp$0 = an.field_r[kh.field_U[0]];
                kh.field_ib[dupTemp$0] = kh.field_ib[dupTemp$0] - 1;
                ci.field_a[0] = ld.a(-44, kh.field_U[0]);
                var6Lifetime3 = kh.field_U[0];
                hf.field_i = var6Lifetime3;
              }
              if (kh.field_U[1] == 3 &&
                kh.field_ib[an.field_r[kh.field_U[1]]] > 0) {
                dupTemp$1 = an.field_r[kh.field_U[1]];
                kh.field_ib[dupTemp$1] = kh.field_ib[dupTemp$1] - 1;
                ci.field_a[1] = ld.a(-11, kh.field_U[1]);
                var6Lifetime3 = kh.field_U[1];
                hf.field_i = var6Lifetime3;
              }
            }
            if (ci.field_a[0] <= 0) {
              if (null == of.field_h &&
                jf.field_c == 0) {
                if (0 < kh.field_U[0]) {
                  if (fh.field_c[0] &&
                    kh.field_ib[an.field_r[kh.field_U[0]]] <= 0) {
                    ci.field_a[0] = ld.a(-7, 0);
                    var6Lifetime3 = 0;
                  }
                  if (fh.field_c[0] &&
                    kh.field_ib[an.field_r[kh.field_U[0]]] > 0) {
                    dupTemp$2 = an.field_r[kh.field_U[0]];
                    kh.field_ib[dupTemp$2] = kh.field_ib[dupTemp$2] - 1;
                    ci.field_a[0] = ld.a(-25, kh.field_U[0]);
                    var6Lifetime3 = kh.field_U[0];
                  }
                } else {
                  if (fh.field_c[0] &&
                    dn.field_j < 2) {
                    ci.field_a[0] = ld.a(bm.a(param4, -39), 0);
                    if (kh.field_U[1] == 0) {
                      ci.field_a[1] = ci.field_a[0];
                    }
                    var6Lifetime3 = 0;
                  }
                }
              }
            } else {
              ci.field_a[0] = ci.field_a[0] - 1;
              if (fh.field_c[0] && (!(an.field_r[kh.field_U[0]] >= 0) ||
                !(kh.field_ib[an.field_r[kh.field_U[0]]] <= 0))) {
                var6Lifetime3 = kh.field_U[0];
              }
            }
            if (ci.field_a[1] <= 0) {
              if (of.field_h == null &&
                jf.field_c == 0) {
                if (kh.field_U[1] > 0) {
                  if (fh.field_c[1] &&
                    kh.field_ib[an.field_r[kh.field_U[1]]] <= 0) {
                    ci.field_a[1] = ld.a(-104, 0);
                    var6Lifetime3 = 0;
                  }
                  if (fh.field_c[1] &&
                    0 < kh.field_ib[an.field_r[kh.field_U[1]]]) {
                    dupTemp$3 = an.field_r[kh.field_U[1]];
                    kh.field_ib[dupTemp$3] = kh.field_ib[dupTemp$3] - 1;
                    ci.field_a[1] = ld.a(param4 - 105, kh.field_U[1]);
                    var6Lifetime3 = kh.field_U[1];
                  }
                } else {
                  if (fh.field_c[1] &&
                    dn.field_j < 2) {
                    ci.field_a[1] = ld.a(-104, 0);
                    var6Lifetime3 = 0;
                    if (kh.field_U[0] == 0) {
                      ci.field_a[0] = ci.field_a[1];
                    }
                  }
                }
              }
            } else {
              ci.field_a[1] = ci.field_a[1] - 1;
              if (var6Lifetime3 < 0 &&
                fh.field_c[1] && (!(0 <= an.field_r[kh.field_U[1]]) ||
                !(0 >= kh.field_ib[an.field_r[kh.field_U[1]]]))) {
                var6Lifetime3 = kh.field_U[1];
              }
            }
          }
          if (var6Lifetime3 > 0 &&
            kh.field_ib[an.field_r[var6Lifetime3]] <= 0) {
            var6Lifetime3 = -1;
          }
          if (null != rc.field_c &&
            var6Lifetime3 != 3) {
            f.a((byte) 119);
            eh.field_c.a(sf.field_V[36], 100, uh.field_i);
          }
          if (jm.field_e >= 0 &&
            var6Lifetime3 != 1) {
            eh.field_c.a(sf.field_V[5 + jm.field_e], 100, uh.field_i);
            if (ag.field_k > 4) {
              eh.field_c.a(sf.field_V[(int)(2.0 * Math.random()) + 10], 100, uh.field_i);
            }
            ag.field_k = 0;
            jm.field_e = -1;
          }
          if (we.field_b >= 0 &&
            var6Lifetime3 != 6) {
            we.field_b = -1;
          }
          var7 = km.field_A;
          if (nh.field_H != 0) {
            var7 = cf.field_q;
          }
          if (0 <= hf.field_i) {
            var7 = od.field_G;
          }
          if (of.field_d != var7) {
            stackIn_315_0 = (of.field_d != dn.field_i) ? 1 : 0;
          } else {
            stackIn_315_0 = 0;
          }
          var8Lifetime1 = stackIn_315_0;
          if (var8Lifetime1 != 0) {
            of.field_d = var7;
            dn.field_b = 0;
          }
          if (of.field_d != od.field_G) {
            pj.field_v = -1;
          }
          ln.field_a.field_c[param3] = 3;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_325_0 = var5;
          stackIn_325_1 = new StringBuilder().append("hd.H(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_326_2 = "null";
          } else {
            stackIn_326_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_325_0), ((StringBuilder) (Object) stackIn_325_1).append(stackIn_326_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_q = "This game has been updated! Please reload this page.";
    }
}
