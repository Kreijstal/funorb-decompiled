/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wj extends ph {
    static String field_K;
    private bg field_I;
    private int field_M;
    static int field_O;
    static String field_G;
    static ub field_N;
    static pf[] field_J;
    static bd field_L;
    static jj field_H;

    final String e(int param0) {
        if (!(!this.field_u)) {
            return this.field_I.a(-41);
        }
        if (param0 == 34) {
            return null;
        }
        wj.a((byte) 60);
        return null;
    }

    final static void b(String param0, int param1) {
        try {
            if (param1 != -10603) {
                wj.e((byte) -71);
            }
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "wj.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int var5;
        int var6;
        bm var8;
        int var9;
        int var10;
        int var11;
        bd var12;
        bd var13;
        bd var14;
        var11 = HostileSpawn.field_I ? 1 : 0;
        super.a(param0, param1, (byte) 69, param3);
        if (param3 != 0) {
          return;
        } else {
          L0: {
            var5 = this.field_v + (param1 - -(this.field_s >> -1403867775));
            if (param2 > 42) {
              break L0;
            } else {
              field_K = (String) null;
              break L0;
            }
          }
          L1: {
            L2: {
              var6 = (this.field_x >> 704851361) + (this.field_m + param0);
              var8 = this.field_I.b(-95);
              if (var8 == wl.field_c) {
                break L2;
              } else {
                if (m.field_n == var8) {
                  break L2;
                } else {
                  if (var8 != bi.field_d) {
                    if (var8 == nd.field_d) {
                      var13 = cf.field_u[1];
                      var13.c(-(var13.field_z >> 2109017217) + var5, -(var13.field_A >> -1357660479) + var6, 256);
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    var12 = cf.field_u[2];
                    var12.c(var5 + -(var12.field_z >> 280607137), -(var12.field_A >> 1614608417) + var6, 256);
                    break L1;
                  }
                }
              }
            }
            L3: {
              L4: {
                var14 = cf.field_u[0];
                var9 = var14.field_u << -1254334303;
                var10 = var14.field_r << 584624929;
                if (null == ng.field_s) {
                  break L4;
                } else {
                  if (var9 > ng.field_s.field_z) {
                    break L4;
                  } else {
                    if (var10 > ng.field_s.field_A) {
                      break L4;
                    } else {
                      sb.a(ng.field_s, -127);
                      si.d();
                      break L3;
                    }
                  }
                }
              }
              ng.field_s = new bd(var9, var10);
              sb.a(ng.field_s, -121);
              break L3;
            }
            var14.b(112, 144, var14.field_u << 1779165476, var14.field_r << 1957777252, -this.field_M << -13302262, 4096);
            eh.b(false);
            ng.field_s.c(-var14.field_u + var5, var6 - var14.field_r, 256);
            break L1;
          }
          return;
        }
    }

    final static wm e(byte param0) {
        if (param0 >= -59) {
            wj.e((byte) 105);
        }
        return oa.field_b;
    }

    final boolean a(byte param0, ag param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 < 0) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("wj.LA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0 != 0;
        }
    }

    final static String a(int param0, int param1, char param2) {
        int var4 = 0;
        int var5 = HostileSpawn.field_I ? 1 : 0;
        char[] var6 = new char[param0];
        char[] var3 = var6;
        if (param1 != 512) {
            wj.a((byte) -69);
        }
        for (var4 = 0; var4 < param0; var4++) {
            var6[var4] = param2;
        }
        return new String(var6);
    }

    public static void j(int param0) {
        field_L = null;
        field_G = null;
        field_N = null;
        field_K = null;
        if (param0 != 11460) {
            String var2 = (String) null;
            wj.b((String) null, -4);
        }
        field_J = null;
        field_H = null;
    }

    final void a(ag param0, int param1, int param2, int param3) {
        try {
            this.field_M = this.field_M + 1;
            super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "wj.W(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(byte param0) {
        oc dupTemp$0 = null;
        oc dupTemp$1 = null;
        ql stackIn_63_0 = null;
        int stackIn_67_0 = 0;
        kd stackIn_69_0 = null;
        kd stackIn_70_0 = null;
        int stackIn_70_1 = 0;
        int stackIn_100_0 = 0;
        boolean stackIn_104_0 = false;
        wm stackIn_133_0 = null;
        jb[] stackIn_133_1 = null;
        wm stackIn_134_0 = null;
        jb[] stackIn_134_1 = null;
        int stackIn_134_2 = 0;
        int stackIn_162_0 = 0;
        int stackIn_185_0 = 0;
        int stackIn_186_0 = 0;
        int stackIn_186_1 = 0;
        int stackIn_201_0 = 0;
        int stackIn_202_0 = 0;
        int stackIn_202_1 = 0;
        int stackIn_205_0 = 0;
        int stackIn_205_1 = 0;
        int[][] stackIn_246_0 = null;
        int stackIn_246_1 = 0;
        int[][] stackIn_247_0 = null;
        int stackIn_247_1 = 0;
        int[] stackIn_247_2 = null;
        int stackIn_251_2 = 0;
        int stackIn_254_3 = 0;
        re stackIn_255_0 = null;
        re stackIn_255_1 = null;
        re stackIn_257_0 = null;
        re stackIn_257_1 = null;
        int stackIn_257_2 = 0;
        int[][] stackIn_285_0 = null;
        int stackIn_285_1 = 0;
        int[][] stackIn_286_0 = null;
        int stackIn_286_1 = 0;
        int[] stackIn_286_2 = null;
        int stackIn_290_2 = 0;
        int stackIn_293_3 = 0;
        re stackIn_295_0 = null;
        re stackIn_295_1 = null;
        re stackIn_296_0 = null;
        re stackIn_296_1 = null;
        int stackIn_296_2 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_103_0;
        float var1_float = 0.0f;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        oj var5 = null;
        oc var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        og var10 = null;
        int var11_int = 0;
        boolean[] var11 = null;
        int var12_int = 0;
        int[] var12 = null;
        int var13_int = 0;
        oc var13_ref_oc = null;
        double var13 = 0.0;
        int var14 = 0;
        int var15_int = 0;
        double var15 = 0.0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int[] var21 = null;
        boolean[] var22 = null;
        int[] var23 = null;
        boolean[] var24 = null;
        var20 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              if (-1 > (e.field_z ^ -1)) {
                e.field_z = e.field_z - 1;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (0 >= of.field_a) {
                break L2;
              } else {
                of.field_a = of.field_a - 1;
                break L2;
              }
            }
            L3: {
              if (0 >= al.field_Q) {
                break L3;
              } else {
                al.field_Q = al.field_Q - 1;
                break L3;
              }
            }
            L4: {
              if (0 >= qh.field_u) {
                break L4;
              } else {
                qh.field_u = qh.field_u - 1;
                break L4;
              }
            }
            L5: {
              if ((lg.field_f ^ -1) < -1) {
                lg.field_f = lg.field_f - 1;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if ((le.field_gb ^ -1) < -1) {
                le.field_gb = le.field_gb - 1;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (0 < te.field_K) {
                te.field_K = te.field_K - 1;
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              var1_float = kd.field_v.j();
              if (var1_float != vc.field_a) {
                kd.field_v.d(ua.a((byte) -10, vc.field_a, var1_float, 0.07000000029802322f));
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              var1_float = kd.field_v.h();
              if (var1_float != qm.field_O) {
                kd.field_v.f(ua.a((byte) -96, qm.field_O, var1_float, 0.07000000029802322f));
                break L9;
              } else {
                break L9;
              }
            }
            L10: {
              var1_float = kd.field_v.f();
              if (var1_float == ea.field_d) {
                break L10;
              } else {
                kd.field_v.b(ua.a((byte) -73, ea.field_d, var1_float, 0.009999999776482582f));
                break L10;
              }
            }
            L11: {
              var1_float = kd.field_v.g();
              if (var1_float != ag.field_w) {
                kd.field_v.e(ua.a((byte) -46, ag.field_w, var1_float, 1.0f));
                break L11;
              } else {
                break L11;
              }
            }
            L12: {
              var1_float = kd.field_v.k();
              if (an.field_n == var1_float) {
                break L12;
              } else {
                kd.field_v.c(ua.a((byte) -112, an.field_n, var1_float, 0.009999999776482582f));
                break L12;
              }
            }
            L13: {
              var1_float = kd.field_v.e();
              if (var1_float != vb.field_Jb) {
                kd.field_v.a(ua.a((byte) -56, vb.field_Jb, var1_float, 0.009999999776482582f));
                break L13;
              } else {
                break L13;
              }
            }
            L14: {
              L15: {
                eb.field_e.a(kd.field_v);
                ik.field_b = false;
                var2 = ln.field_a.field_d;
                var3 = ln.field_a.field_a;
                var4 = ln.field_a.field_n;
                if (cm.field_c == null) {
                  break L15;
                } else {
                  if (cm.field_c.length == var4) {
                    break L14;
                  } else {
                    break L15;
                  }
                }
              }
              cm.field_c = new int[var4];
              break L14;
            }
            L16: {
              if (wa.a(false)) {
                wb.field_R = wb.field_R - 1;
                break L16;
              } else {
                break L16;
              }
            }
            L17: {
              if (0 >= nl.field_d) {
                break L17;
              } else {
                nl.field_d = nl.field_d - 1;
                break L17;
              }
            }
            L18: {
              if (0 <= pj.field_v) {
                ik.field_c = ik.field_c + 1;
                if (ik.field_c <= 2) {
                  break L18;
                } else {
                  L19: {
                    ik.field_c = 0;
                    pj.field_v = pj.field_v + 1;
                    if ((pj.field_v ^ -1) != -5) {
                      break L19;
                    } else {
                      pj.field_v = -1;
                      break L19;
                    }
                  }
                  if (-9 == (pj.field_v ^ -1)) {
                    pj.field_v = -1;
                    break L18;
                  } else {
                    break L18;
                  }
                }
              } else {
                break L18;
              }
            }
            L20: {
              if (0 < bh.field_d) {
                bh.field_d = bh.field_d - 1;
                break L20;
              } else {
                break L20;
              }
            }
            L21: {
              if (-1 <= (rf.field_f ^ -1)) {
                break L21;
              } else {
                rf.field_f = rf.field_f - 1;
                break L21;
              }
            }
            if (param0 < -22) {
              L22: {
                var5 = mm.field_m[0];
                var6 = var5.field_j;
                var7 = var6.field_e;
                var8 = var6.field_g;
                var9 = var6.b(-4);
                if ((15 & ng.field_u) != 0) {
                  break L22;
                } else {
                  L23: {
                    if (null != q.field_g) {
                      stackIn_63_0 = q.field_g;
                      break L23;
                    } else {
                      stackIn_63_0 = ue.field_a;
                      break L23;
                    }
                  }
                  L24: {
                    var10_int = ((ql) (Object) stackIn_63_0).a(var6, ni.field_e, (byte) 109) ? 1 : 0;
                    if ((ni.field_e ? 1 : 0) == var10_int) {
                      break L24;
                    } else {
                      L25: {
                        if (var10_int == 0) {
                          stackIn_67_0 = 0;
                          break L25;
                        } else {
                          stackIn_67_0 = 1;
                          break L25;
                        }
                      }
                      L26: {
                        ni.field_e = stackIn_67_0 != 0;
                        stackIn_69_0 = ha.field_w;

                        if (ni.field_e) {
                          stackIn_70_0 = (kd) ((Object) stackIn_69_0);
                          stackIn_70_1 = -4;
                          break L26;
                        } else {
                          stackIn_70_0 = (kd) ((Object) stackIn_69_0);
                          stackIn_70_1 = 4;
                          break L26;
                        }
                      }
                      stackIn_70_0.field_w = stackIn_70_1;
                      break L24;
                    }
                  }
                  L27: {
                    if (ni.field_e) {
                      break L27;
                    } else {
                      if (ii.b((byte) 30)) {
                        qm.field_O = 0.5f;
                        vc.field_a = 1.0f;
                        ea.field_d = 0.6000000238418579f;
                        vb.field_Jb = 0.800000011920929f;
                        ag.field_w = 10.0f;
                        an.field_n = 0.30000001192092896f;
                        break L22;
                      } else {
                        break L27;
                      }
                    }
                  }
                  ea.field_d = 0.5f;
                  ag.field_w = 30.0f;
                  vb.field_Jb = 0.8999999761581421f;
                  an.field_n = 0.20000000298023224f;
                  vc.field_a = 0.30000001192092896f;
                  qm.field_O = 0.5f;
                  break L22;
                }
              }
              L28: {
                var10 = var5.field_l;
                if (5 != ha.field_t) {
                  break L28;
                } else {
                  L29: {
                    var11_int = -var7 + nh.field_E.field_e;
                    if ((var11_int ^ -1) > -1) {
                      var11_int = -var11_int;
                      break L29;
                    } else {
                      break L29;
                    }
                  }
                  L30: {
                    var12_int = nh.field_E.field_g - var8;
                    if (var12_int >= 0) {
                      break L30;
                    } else {
                      var12_int = -var12_int;
                      break L30;
                    }
                  }
                  var13_int = var11_int - -var12_int;
                  if (var13_int < 10) {
                    kd.a(6, 1);
                    break L28;
                  } else {
                    break L28;
                  }
                }
              }
              L31: {
                var24 = ln.field_a.field_e;
                var22 = var24;
                var11 = var22;
                var23 = ln.field_a.field_i;
                var21 = var23;
                var12 = var21;
                if (0 != jf.field_c) {
                  break L31;
                } else {
                  if ((hg.field_e ^ -1) == -1) {
                    break L31;
                  } else {
                    if (jf.field_d >= 50) {
                      L32: {
                        L33: {
                          if (-1 <= (le.field_D ^ -1)) {
                            break L33;
                          } else {
                            if (j.field_c != -1) {
                              L34: {
                                le.field_D = le.field_D - 1;
                                if (512.0 * Math.random() <= (double)le.field_D) {
                                  break L34;
                                } else {
                                  var13_ref_oc = new oc(var6);
                                  var13_ref_oc.field_e = var13_ref_oc.field_e + (int)(-25.0 + 50.0 * Math.random());
                                  var13_ref_oc.field_g = var13_ref_oc.field_g + (int)(-25.0 + Math.random() * 50.0);
                                  var14 = 0;
                                  L35: while (true) {
                                    if (10 <= var14) {
                                      L36: {
                                        var14 = -1;
                                        var15_int = (int)(3.0 * Math.random());
                                        if (-1 == (var15_int ^ -1)) {
                                          var14 = 0;
                                          break L36;
                                        } else {
                                          if (var15_int == 1) {
                                            var14 = 1;
                                            break L36;
                                          } else {
                                            if (2 == var15_int) {
                                              var14 = 10;
                                              break L36;
                                            } else {
                                              break L36;
                                            }
                                          }
                                        }
                                      }
                                      if (uj.field_l != 1) {
                                        break L34;
                                      } else {
                                        if (ej.d((byte) 116)) {
                                          eh.field_c.a(em.field_a[var14], 100, uh.field_i * (128 - le.field_D / 4) / 128);
                                          break L34;
                                        } else {
                                          break L34;
                                        }
                                      }
                                    } else {
                                      jn.field_F[ib.field_c].field_c = Math.random() * 255.0;
                                      jn.field_F[ib.field_c].field_j.a((byte) 46, var13_ref_oc);
                                      jn.field_F[ib.field_c].field_l.a(var10, -28860);
                                      jn.field_F[ib.field_c].field_e = 0;
                                      jn.field_F[ib.field_c].field_h = 0;
                                      jn.field_F[ib.field_c].field_i = 8;
                                      ib.field_c = ib.field_c + 1;
                                      var14++;
                                      continue L35;
                                    }
                                  }
                                }
                              }
                              var13_int = 0;
                              L37: while (true) {
                                if (var13_int >= 5) {
                                  break L33;
                                } else {
                                  stackIn_162_0 = (Math.random() * 512.0 < (double)le.field_D ? -1 : (Math.random() * 512.0 == (double)le.field_D ? 0 : 1));

                                  L38: {
                                    if (stackIn_162_0 > 0) {
                                      jn.field_F[ib.field_c].field_c = Math.random() * 255.0;
                                      jn.field_F[ib.field_c].field_j.a((byte) 46, var6);
                                      dupTemp$0 = jn.field_F[ib.field_c].field_j;
                                      dupTemp$0.field_e = dupTemp$0.field_e + (int)(50.0 * Math.random() - 25.0);
                                      dupTemp$1 = jn.field_F[ib.field_c].field_j;
                                      dupTemp$1.field_g = dupTemp$1.field_g + (int)(-25.0 + Math.random() * 50.0);
                                      jn.field_F[ib.field_c].field_l.a(var10, -28860);
                                      jn.field_F[ib.field_c].field_e = 0;
                                      jn.field_F[ib.field_c].field_h = 0;
                                      jn.field_F[ib.field_c].field_i = 8;
                                      ib.field_c = ib.field_c + 1;
                                      break L38;
                                    } else {
                                      break L38;
                                    }
                                  }
                                  var13_int++;
                                  continue L37;
                                }
                              }
                            } else {
                              break L33;
                            }
                          }
                        }
                        stackIn_162_0 = le.field_D ^ -1;
                        break L32;
                      }
                      if (stackIn_162_0 == -2) {
                        L39: {
                          if (uj.field_l != 1) {
                            break L39;
                          } else {
                            if (!ej.d((byte) 57)) {
                              break L39;
                            } else {
                              eh.field_c.a(lm.field_A[8], 100, uh.field_i);
                              break L39;
                            }
                          }
                        }
                        mf.a(false, 5);
                        break L31;
                      } else {
                        break L31;
                      }
                    } else {
                      L40: {
                        pc.a(2);
                        var13_int = -25 + var8;
                        var14 = var8 + 25;
                        var15_int = -30 + var7;
                        if (-1 >= (var15_int ^ -1)) {
                          break L40;
                        } else {
                          var15_int = 0;
                          break L40;
                        }
                      }
                      L41: {
                        if (var3 <= var14) {
                          var14 = -1 + var3;
                          break L41;
                        } else {
                          break L41;
                        }
                      }
                      L42: {
                        if ((var13_int ^ -1) > -1) {
                          var13_int = 0;
                          break L42;
                        } else {
                          break L42;
                        }
                      }
                      L43: {
                        var16 = var7 + 30;
                        if ((var16 ^ -1) > (var2 ^ -1)) {
                          break L43;
                        } else {
                          var16 = var2 - 1;
                          break L43;
                        }
                      }
                      var18 = var13_int;
                      L44: while (true) {
                        stackIn_100_0 = var14;
                        L45: while (true) {
                          if (stackIn_100_0 <= var18) {
                            L46: {
                              jf.field_d = jf.field_d + 1;
                              if ((jf.field_d ^ -1) != -2) {
                                break L46;
                              } else {
                                L47: {
                                  var18 = 0;
                                  var19 = 1;
                                  if (bm.field_c != 0) {
                                    L48: {
                                      if (4 >= rl.field_c) {
                                        var18 = 1;
                                        break L48;
                                      } else {
                                        break L48;
                                      }
                                    }
                                    L49: {
                                      if (-1 != (rl.field_c ^ -1)) {
                                        break L49;
                                      } else {
                                        var19 = 0;
                                        break L49;
                                      }
                                    }
                                    L50: {
                                      if (-9 == (rl.field_c ^ -1)) {
                                        var19 = 0;
                                        break L50;
                                      } else {
                                        break L50;
                                      }
                                    }
                                    if ((rl.field_c ^ -1) == -10) {
                                      var19 = 0;
                                      break L47;
                                    } else {
                                      break L47;
                                    }
                                  } else {
                                    L51: {
                                      if (1 != rl.field_c) {
                                        break L51;
                                      } else {
                                        var18 = 1;
                                        break L51;
                                      }
                                    }
                                    if (-1 != (rl.field_c ^ -1)) {
                                      break L47;
                                    } else {
                                      var19 = 0;
                                      break L47;
                                    }
                                  }
                                }
                                if (var19 == 0) {
                                  break L46;
                                } else {
                                  if ((uj.field_l ^ -1) != -2) {
                                    break L46;
                                  } else {
                                    L52: {
                                      stackIn_133_0 = eh.field_c;

                                      stackIn_133_1 = lm.field_A;

                                      if (var18 != 0) {
                                        stackIn_134_0 = (wm) ((Object) stackIn_133_0);
                                        stackIn_134_1 = (jb[]) ((Object) stackIn_133_1);
                                        stackIn_134_2 = 21;
                                        break L52;
                                      } else {
                                        stackIn_134_0 = (wm) ((Object) stackIn_133_0);
                                        stackIn_134_1 = (jb[]) ((Object) stackIn_133_1);
                                        stackIn_134_2 = 22;
                                        break L52;
                                      }
                                    }
                                    ((wm) (Object) stackIn_134_0).a(stackIn_134_1[stackIn_134_2], 90, uh.field_i);
                                    break L46;
                                  }
                                }
                              }
                            }
                            decompiledRegionSelector0 = 1;
                            break L0;
                          } else {
                            var17 = var15_int + var18 * var2;
                            var19 = var15_int;
                            L53: while (true) {
                              if ((var19 ^ -1) <= (var16 ^ -1)) {
                                var18++;
                                continue L44;
                              } else {
                                stackOut_103_0 = var11[var17];
                                stackIn_100_0 = stackOut_103_0 ? 1 : 0;
                                stackIn_104_0 = stackOut_103_0;
                                L54: {
                                  if (stackIn_104_0) {
                                    if (var23[var17] >= 26) {
                                      break L54;
                                    } else {
                                      var12[var17] = var12[var17] + 1;
                                      break L54;
                                    }
                                  } else {
                                    if (10 < var23[var17]) {
                                      var12[var17] = var12[var17] - 1;
                                      break L54;
                                    } else {
                                      break L54;
                                    }
                                  }
                                }
                                var17++;
                                var19++;
                                continue L53;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              L55: {
                if (-2 != (le.field_D ^ -1)) {
                  break L55;
                } else {
                  if (1 == uj.field_l) {
                    if (!ej.d((byte) 102)) {
                      break L55;
                    } else {
                      eh.field_c.a(em.field_a[0], 100, uh.field_i * 3 / 2);
                      break L55;
                    }
                  } else {
                    break L55;
                  }
                }
              }
              var13 = var10.field_f;
              var15 = var10.field_a;
              L56: while (true) {
                L57: {
                  if (!jn.e((byte) -105)) {
                    stackIn_205_0 = jf.field_c ^ -1;
                    stackIn_205_1 = -1;
                    break L57;
                  } else {
                    var17 = pj.field_e - 16;
                    stackIn_205_0 = -1;

                    stackIn_205_1 = var17 ^ -1;

                    L58: {
                      L59: {
                        if (stackIn_205_0 < stackIn_205_1) {
                          break L59;
                        } else {
                          if (8 > var17) {
                            L60: {
                              stackIn_185_0 = -127;

                              if (qh.field_m[82]) {
                                stackIn_186_0 = stackIn_185_0;
                                stackIn_186_1 = 1;
                                break L60;
                              } else {
                                stackIn_186_0 = stackIn_185_0;
                                stackIn_186_1 = 0;
                                break L60;
                              }
                            }
                            t.a(stackIn_186_0, stackIn_186_1, var17);
                            break L58;
                          } else {
                            break L59;
                          }
                        }
                      }
                      var17 = -1 + pj.field_e;
                      if (var17 < 0) {
                        break L58;
                      } else {
                        if (-9 < (var17 ^ -1)) {
                          t.a(38, 1, var17);
                          break L58;
                        } else {
                          break L58;
                        }
                      }
                    }
                    L61: {
                      if (-14 != (pj.field_e ^ -1)) {
                        break L61;
                      } else {
                        if (-2 != (hg.field_e ^ -1)) {
                          break L61;
                        } else {
                          if (0 != jf.field_c) {
                            break L61;
                          } else {
                            of.field_h = new re(true);
                            decompiledRegionSelector0 = 2;
                            break L0;
                          }
                        }
                      }
                    }
                    L62: {
                      if (-85 != (pj.field_e ^ -1)) {
                        break L62;
                      } else {
                        if (!qh.field_m[86]) {
                          break L62;
                        } else {
                          if (ta.p(3)) {
                            break L62;
                          } else {
                            if (-1 > (wb.field_S ^ -1)) {
                              nh.a(false, (byte) -107);
                              break L62;
                            } else {
                              break L62;
                            }
                          }
                        }
                      }
                    }
                    L63: {
                      if (pj.field_e != 80) {
                        break L63;
                      } else {
                        L64: {
                          stackIn_201_0 = -123;

                          if (hk.field_q) {
                            stackIn_202_0 = stackIn_201_0;
                            stackIn_202_1 = 0;
                            break L64;
                          } else {
                            stackIn_202_0 = stackIn_201_0;
                            stackIn_202_1 = 1;
                            break L64;
                          }
                        }
                        ec.a((byte) stackIn_202_0, stackIn_202_1 != 0);
                        break L63;
                      }
                    }
                    continue L56;
                  }
                }
                L65: {
                  L66: {
                    if (stackIn_205_0 == stackIn_205_1) {
                      break L66;
                    } else {
                      if (-5 < (mc.field_I ^ -1)) {
                        break L65;
                      } else {
                        break L66;
                      }
                    }
                  }
                  L67: {
                    if ((w.field_r ^ -1) < (cf.field_s ^ -1)) {
                      cf.field_s = cf.field_s + 1;
                      break L67;
                    } else {
                      break L67;
                    }
                  }
                  L68: {
                    if (-10 + w.field_r <= cf.field_s) {
                      break L68;
                    } else {
                      cf.field_s = cf.field_s + 1;
                      break L68;
                    }
                  }
                  L69: {
                    if ((cf.field_s ^ -1) > (-50 + w.field_r ^ -1)) {
                      cf.field_s = cf.field_s + 1;
                      break L69;
                    } else {
                      break L69;
                    }
                  }
                  if (hg.field_e == 1) {
                    L70: {
                      var17 = 0;
                      if ((j.field_c ^ -1) != 0) {
                        break L70;
                      } else {
                        if ((rb.field_m ^ -1) != 0) {
                          break L70;
                        } else {
                          if ((rc.field_e ^ -1) != -1) {
                            break L65;
                          } else {
                            break L70;
                          }
                        }
                      }
                    }
                    if (var17 != 0) {
                      break L65;
                    } else {
                      bc.a(var5, var2, var4, var7, (byte) 15, var9, var8, var24, var15, var13, var23, var3);
                      break L65;
                    }
                  } else {
                    L71: {
                      if (0 == hg.field_e) {
                        rl.field_c = -1;
                        break L71;
                      } else {
                        break L71;
                      }
                    }
                    if (-2 != (pf.field_o ^ -1)) {
                      break L65;
                    } else {
                      if (-1 != rl.field_c) {
                        mc.field_I = 1;
                        jf.field_c = 1;
                        break L65;
                      } else {
                        break L65;
                      }
                    }
                  }
                }
                L72: {
                  if (-1 != (jf.field_c ^ -1)) {
                    L73: {
                      jf.field_c = jf.field_c + 1;
                      if (4 > mc.field_I) {
                        jf.field_c = jf.field_c + 6;
                        break L73;
                      } else {
                        break L73;
                      }
                    }
                    L74: {
                      if (le.field_D == 1) {
                        jf.field_c = jf.field_c + 6;
                        break L74;
                      } else {
                        break L74;
                      }
                    }
                    L75: {
                      if (-129 == (jf.field_c ^ -1)) {
                        L76: {
                          if (-2 != (mc.field_I ^ -1)) {
                            break L76;
                          } else {
                            L77: {
                              if (-1 >= (hg.field_e ^ -1)) {
                                break L77;
                              } else {
                                hg.field_e = -1;
                                break L77;
                              }
                            }
                            hg.field_e = hg.field_e + 1;
                            if (hg.field_e != 0) {
                              if (hg.field_e == 1) {
                                le.field_D = 0;
                                ta.a((byte) -95, rl.field_c);
                                of.field_h = new re(8);
                                decompiledRegionSelector0 = 5;
                                break L0;
                              } else {
                                break L76;
                              }
                            } else {
                              L78: {
                                stackIn_246_0 = dd.field_o;

                                stackIn_246_1 = 10;

                                if (om.field_b) {
                                  stackIn_247_0 = (int[][]) ((Object) stackIn_246_0);
                                  stackIn_247_1 = stackIn_246_1;
                                  stackIn_247_2 = nm.field_c;
                                  break L78;
                                } else {
                                  stackIn_247_0 = (int[][]) ((Object) stackIn_246_0);
                                  stackIn_247_1 = stackIn_246_1;
                                  stackIn_247_2 = ja.field_h;
                                  break L78;
                                }
                              }
                              L79: {
                                L80: {
                                  stackIn_247_0[stackIn_247_1] = stackIn_247_2;
                                  stackIn_255_0 = null;

                                  stackIn_255_1 = null;

                                  if (!ta.p(3)) {
                                    break L80;
                                  } else {
                                    L81: {




                                      if (w.field_r == 0) {
                                        stackIn_255_0 = null;
                                        stackIn_255_1 = null;
                                        stackIn_251_2 = 0;
                                        break L81;
                                      } else {
                                        stackIn_255_0 = null;
                                        stackIn_255_1 = null;
                                        stackIn_251_2 = 1;
                                        break L81;
                                      }
                                    }
                                    L82: {






                                      if (ei.field_q.e(-20049)) {
                                        stackIn_255_0 = null;
                                        stackIn_255_1 = null;

                                        stackIn_254_3 = 0;
                                        break L82;
                                      } else {
                                        stackIn_255_0 = null;
                                        stackIn_255_1 = null;

                                        stackIn_254_3 = 1;
                                        break L82;
                                      }
                                    }

                                    if (wb.a(stackIn_251_2 != 0, stackIn_254_3 != 0, false, rg.a((byte) -54)) != null) {
                                      stackIn_257_0 = null;
                                      stackIn_257_1 = null;
                                      stackIn_257_2 = 9;
                                      break L79;
                                    } else {
                                      break L80;
                                    }
                                  }
                                }
                                stackIn_257_0 = null;
                                stackIn_257_1 = null;
                                stackIn_257_2 = 10;
                                break L79;
                              }
                              of.field_h = new re(stackIn_257_2);
                              u.field_f[26] = jh.field_bb;
                              decompiledRegionSelector0 = 4;
                              break L0;
                            }
                          }
                        }
                        if ((mc.field_I ^ -1) == -3) {
                          cm.a(bm.field_c, 0, rl.field_c);
                          le.field_D = 0;
                          ta.a((byte) 127, rl.field_c + 1);
                          n.b(false, (byte) -97);
                          of.field_h = new re(11);
                          decompiledRegionSelector0 = 6;
                          break L0;
                        } else {
                          if (-4 != (mc.field_I ^ -1)) {
                            if (-5 >= (mc.field_I ^ -1)) {
                              L83: {
                                le.field_D = 0;
                                hg.field_e = 0;
                                if ((jh.field_ab ^ -1) != -2) {
                                  break L83;
                                } else {
                                  ja.a((byte) -127, pe.field_ab, true);
                                  break L83;
                                }
                              }
                              L84: {
                                stackIn_285_0 = dd.field_o;

                                stackIn_285_1 = 10;

                                if (om.field_b) {
                                  stackIn_286_0 = (int[][]) ((Object) stackIn_285_0);
                                  stackIn_286_1 = stackIn_285_1;
                                  stackIn_286_2 = nm.field_c;
                                  break L84;
                                } else {
                                  stackIn_286_0 = (int[][]) ((Object) stackIn_285_0);
                                  stackIn_286_1 = stackIn_285_1;
                                  stackIn_286_2 = ja.field_h;
                                  break L84;
                                }
                              }
                              L85: {
                                L86: {
                                  stackIn_286_0[stackIn_286_1] = stackIn_286_2;
                                  stackIn_295_0 = null;

                                  stackIn_295_1 = null;

                                  if (!ta.p(3)) {
                                    break L86;
                                  } else {
                                    L87: {




                                      if ((w.field_r ^ -1) == -1) {
                                        stackIn_295_0 = null;
                                        stackIn_295_1 = null;
                                        stackIn_290_2 = 0;
                                        break L87;
                                      } else {
                                        stackIn_295_0 = null;
                                        stackIn_295_1 = null;
                                        stackIn_290_2 = 1;
                                        break L87;
                                      }
                                    }
                                    L88: {






                                      if (ei.field_q.e(-20049)) {
                                        stackIn_295_0 = null;
                                        stackIn_295_1 = null;

                                        stackIn_293_3 = 0;
                                        break L88;
                                      } else {
                                        stackIn_295_0 = null;
                                        stackIn_295_1 = null;

                                        stackIn_293_3 = 1;
                                        break L88;
                                      }
                                    }
                                    stackIn_295_0 = null;

                                    stackIn_295_1 = null;

                                    if (wb.a(stackIn_290_2 != 0, stackIn_293_3 != 0, false, rg.a((byte) 124)) == null) {
                                      break L86;
                                    } else {
                                      stackIn_296_0 = null;
                                      stackIn_296_1 = null;
                                      stackIn_296_2 = 9;
                                      break L85;
                                    }
                                  }
                                }
                                stackIn_296_0 = null;
                                stackIn_296_1 = null;
                                stackIn_296_2 = 10;
                                break L85;
                              }
                              of.field_h = new re(stackIn_296_2);
                              decompiledRegionSelector0 = 10;
                              break L0;
                            } else {
                              break L75;
                            }
                          } else {
                            L89: {
                              cm.a(bm.field_c, 0, 9);
                              u.field_f[26] = jf.field_e;
                              if (1 != bm.field_c) {
                                break L89;
                              } else {
                                if ((rl.field_c ^ -1) < -10) {
                                  rl.field_c = 0;
                                  jf.field_d = 50;
                                  le.field_D = 0;
                                  n.b(true, (byte) -89);
                                  of.field_h = new re(13);
                                  uk.field_e = 0;
                                  decompiledRegionSelector0 = 9;
                                  break L0;
                                } else {
                                  break L89;
                                }
                              }
                            }
                            L90: {
                              if ((bm.field_c ^ -1) != -1) {
                                break L90;
                              } else {
                                if (rl.field_c > 2) {
                                  break L90;
                                } else {
                                  jf.field_d = 50;
                                  le.field_D = 0;
                                  ta.a((byte) -100, 3);
                                  of.field_h = new re(12);
                                  uk.field_e = 0;
                                  n.b(false, (byte) -114);
                                  decompiledRegionSelector0 = 7;
                                  break L0;
                                }
                              }
                            }
                            jf.field_d = 50;
                            le.field_D = 0;
                            rl.field_c = 0;
                            n.b(true, (byte) -93);
                            uk.field_e = 0;
                            of.field_h = new re(13);
                            decompiledRegionSelector0 = 8;
                            break L0;
                          }
                        }
                      } else {
                        break L75;
                      }
                    }
                    L91: {
                      jf.field_c = jf.field_c + 1;
                      if (256 >= jf.field_c) {
                        break L91;
                      } else {
                        jf.field_c = 0;
                        break L91;
                      }
                    }
                    break L72;
                  } else {
                    break L72;
                  }
                }
                decompiledRegionSelector0 = 3;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var1), "wj.G(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return;
                          } else {
                            return;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    wj(bg param0) {
        try {
            this.field_I = param0;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "wj.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_K = "Confirm Email:";
        field_O = 256;
        field_G = "These doors cannot be opened. Find a different route.";
        field_N = new ub();
    }
}
