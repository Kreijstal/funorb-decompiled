/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kn {
    static String field_f;
    static long field_j;
    static oq field_e;
    static String field_g;
    private long field_l;
    private int field_a;
    static String field_k;
    private String field_d;
    vh field_i;
    String field_m;
    int field_b;
    static int[] field_c;
    private int[] field_h;
    vq field_n;

    final void a(pn param0, boolean param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        try {
          L0: {
            if (param0.field_g) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                this.field_a = param0.field_p;
                if (!param1) {
                  break L1;
                } else {
                  this.field_b = 59;
                  break L1;
                }
              }
              L2: {
                if (param0.field_p == 0) {
                  L3: {
                    if (ec.field_i == 0) {
                      this.field_n.a(cl.field_a, 17130, 12);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  this.field_n.a(Pool.field_K, 17130, 13);
                  break L2;
                } else {
                  break L2;
                }
              }
              L4: {
                if (param0.field_p == 1) {
                  L5: {
                    if (ol.field_e != 0) {
                      break L5;
                    } else {
                      this.field_n.a(wi.field_e, 17130, 12);
                      break L5;
                    }
                  }
                  this.field_n.a(op.field_c, 17130, 13);
                  break L4;
                } else {
                  break L4;
                }
              }
              L6: {
                if (param0.field_p != 2) {
                  break L6;
                } else {
                  L7: {
                    if (-1 == (di.field_e ^ -1)) {
                      this.field_n.a(mc.field_i, 17130, 12);
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  this.field_n.a(me.field_v, 17130, 13);
                  break L6;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            runtimeException = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) (runtimeException);
            stackOut_22_1 = new StringBuilder().append("kn.J(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L8;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L8;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(boolean param0, int param1) {
        this.field_n.a((byte) -79, param0);
        if (param1 != 12887) {
            field_c = (int[]) null;
        }
    }

    private final boolean a(byte param0, int param1, int param2) {
        int var5 = 0;
        var5 = Pool.field_O;
        if (param0 == 98) {
          L0: {
            if (-1 != (param2 ^ -1)) {
              if ((param2 ^ -1) != -2) {
                if (2 != param2) {
                  if (-4 == (param2 ^ -1)) {
                    nf.a(this.field_b, true, param1);
                    break L0;
                  } else {
                    if (-11 == (param2 ^ -1)) {
                      ef.a(this.field_b, 3, param1);
                      break L0;
                    } else {
                      if ((param2 ^ -1) == -16) {
                        eo.a(param1, this.field_b, 11);
                        break L0;
                      } else {
                        if (16 == param2) {
                          eo.a(param1, 0, param0 ^ 105);
                          break L0;
                        } else {
                          return false;
                        }
                      }
                    }
                  }
                } else {
                  em.a(this.field_b, (byte) -125, param1);
                  break L0;
                }
              } else {
                jk.a(this.field_l, param1, param0 + -98);
                break L0;
              }
            } else {
              k.a(param1, (byte) 97, this.field_l);
              break L0;
            }
          }
          return true;
        } else {
          return true;
        }
    }

    final void a(int param0, int[] param1, byte param2) {
        boolean discarded$1 = false;
        RuntimeException var4 = null;
        String var4_ref = null;
        eo var5 = null;
        int var6 = 0;
        String var7 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        try {
          L0: {
            L1: {
              if (null == this.field_m) {
                break L1;
              } else {
                L2: {
                  if ((this.field_l ^ -1L) != (ve.field_m ^ -1L)) {
                    break L2;
                  } else {
                    if (2 != param0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                if (th.field_a != 2) {
                  break L1;
                } else {
                  L3: {
                    var7 = this.a(3);
                    var4_ref = var7;
                    var5 = gf.a(-103, this.field_m);
                    var6 = ia.a(this.field_m, 24552) ? 1 : 0;
                    if (var5 != null) {
                      break L3;
                    } else {
                      if (var6 != 0) {
                        break L3;
                      } else {
                        this.field_n.a(nr.a(new String[]{var7}, -1, fn.field_Lb), 17130, 4);
                        this.field_n.a(nr.a(new String[]{var7}, -1, jh.field_f), 17130, 6);
                        if (param1 == null) {
                          break L3;
                        } else {
                          if (-3 == (param0 ^ -1)) {
                            break L3;
                          } else {
                            if (!ea.field_z) {
                              this.field_h = param1;
                              this.field_n.a(nr.a(new String[]{var7}, -1, nk.field_k), 17130, 19);
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                    }
                  }
                  L4: {
                    if (var5 != null) {
                      L5: {
                        if (fj.a(this.field_m, (byte) -101)) {
                          break L5;
                        } else {
                          if (!ea.field_z) {
                            L6: {
                              if (!hr.field_y) {
                                this.field_n.a(nr.a(new String[]{var7}, -1, rp.field_a), 17130, 8);
                                break L6;
                              } else {
                                break L6;
                              }
                            }
                            this.field_n.a(nr.a(new String[]{var7}, -1, hq.field_e), 17130, 18);
                            if (param1 != null) {
                              this.field_h = param1;
                              this.field_n.a(nr.a(new String[]{var7}, -1, nk.field_k), 17130, 19);
                              break L5;
                            } else {
                              break L5;
                            }
                          } else {
                            break L5;
                          }
                        }
                      }
                      this.field_n.a(nr.a(new String[]{var7}, -1, ef.field_e), 17130, 5);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  if (var6 == 0) {
                    break L1;
                  } else {
                    this.field_n.a(nr.a(new String[]{var7}, -1, ph.field_c), 17130, 7);
                    break L1;
                  }
                }
              }
            }
            L7: {
              if (param2 >= 43) {
                break L7;
              } else {
                discarded$1 = this.a(63, 79, -128);
                break L7;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var4 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) (var4);
            stackOut_29_1 = new StringBuilder().append("kn.O(").append(param0).append(',');
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param1 == null) {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L8;
            } else {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L8;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ',' + param2 + ')');
        }
    }

    final void a(byte param0) {
        String var3 = null;
        boolean discarded$0 = false;
        if (null != this.field_m) {
            if (!(this.field_l == ve.field_m)) {
                var3 = this.a(3);
                String var2 = var3;
                this.field_n.a(nr.a(new String[]{var3}, -1, ep.field_p), 17130, 17);
            }
        }
        if (param0 < 8) {
            discarded$0 = this.b((byte) -22, -119, 104);
        }
    }

    private final boolean a(int param0, byte param1, int param2) {
        boolean discarded$26101 = false;
        int var5 = 0;
        L0: {
          var5 = Pool.field_O;
          if (-9 != (param2 ^ -1)) {
            if (param2 == 18) {
              tq.a(this.field_l, (byte) -104, this.field_m);
              break L0;
            } else {
              if (-12 != (param2 ^ -1)) {
                if (12 != param2) {
                  if (13 != param2) {
                    if (param2 == 14) {
                      pf.a(true);
                      break L0;
                    } else {
                      if (param2 == 20) {
                        r.c((byte) 41);
                        break L0;
                      } else {
                        if (-20 != (param2 ^ -1)) {
                          return false;
                        } else {
                          discarded$26101 = hj.a(this.field_a, this.field_h, this.field_l, this.field_m, (byte) 76);
                          break L0;
                        }
                      }
                    }
                  } else {
                    om.a(2, this.field_a, param0, (byte) -45);
                    break L0;
                  }
                } else {
                  om.a(1, this.field_a, param0, (byte) 126);
                  break L0;
                }
              } else {
                om.a(0, this.field_a, param0, (byte) 121);
                break L0;
              }
            }
          } else {
            kr.a((byte) -75, this.field_l, this.field_m);
            break L0;
          }
        }
        if (param1 >= 57) {
          return true;
        } else {
          this.field_d = (String) null;
          return true;
        }
    }

    private final boolean b(byte param0, int param1, int param2) {
        boolean discarded$0 = false;
        if (param0 > -74) {
            discarded$0 = kn.a((byte) 75, 'ﾪ');
        }
        if (17 != param2) {
            return false;
        }
        fc.field_b = new wm(this.field_i.field_sb, this.field_i.field_ib, this.field_i.field_gb, this.field_i.field_Db, param1, tq.field_m, dg.field_J, qg.field_f, uo.field_Lb, e.field_e, ei.field_A, this.field_m, this.field_l);
        return true;
    }

    final boolean b(byte param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == 111) {
            break L0;
          } else {
            this.a(true, 110);
            break L0;
          }
        }
        L1: {
          L2: {
            if (this.field_n == null) {
              break L2;
            } else {
              if (!this.field_n.f((byte) -49)) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final boolean a(int param0, int param1, boolean param2, int param3, int param4) {
        if (param3 != 25427) {
            return false;
        }
        int var6 = this.field_n.a(param3 ^ 25356, param2);
        if (!((var6 ^ -1) != 1)) {
            return false;
        }
        boolean discarded$0 = this.a((byte) 98, param1, var6);
        boolean discarded$1 = this.a(var6, param4, 6);
        boolean discarded$2 = this.a(param4, (byte) 115, var6);
        boolean discarded$3 = this.b((byte) -75, param0, var6);
        return true;
    }

    final static void c(int param0) {
        db.field_Nb.field_hb = dq.a(1, 0, nr.a(new String[]{Integer.toString(wn.field_f[la.field_a] / 50)}, -1, vm.field_b));
        if (param0 != 13) {
            kn.c(-82);
        }
        kb.field_i.field_pb = -1 > (la.field_a ^ -1) ? true : false;
        tk.field_f.field_pb = la.field_a < -1 + te.field_p[0] ? true : false;
    }

    private final boolean a(int param0, int param1, int param2) {
        Object var4 = null;
        String var4_ref = null;
        String var5 = null;
        L0: {
          var4 = null;
          if (-5 == (param0 ^ -1)) {
            var4_ref = va.a(this.field_m, param1, 88);
            break L0;
          } else {
            if (-6 == (param0 ^ -1)) {
              var4_ref = ul.a((byte) 91, this.field_m, param1);
              break L0;
            } else {
              if (param0 == 6) {
                var4_ref = jd.a(param1, this.field_m, param2 ^ 4);
                break L0;
              } else {
                if (-8 != (param0 ^ -1)) {
                  return false;
                } else {
                  var4_ref = ae.a(-3266, this.field_d, this.field_m, param1);
                  break L0;
                }
              }
            }
          }
        }
        L1: {
          if (var4_ref != null) {
            var5 = (String) null;
            jh.a(0, var4_ref, (String) null, 2, this.field_m, true);
            break L1;
          } else {
            break L1;
          }
        }
        if (param2 == 6) {
          return true;
        } else {
          return false;
        }
    }

    final void a(byte param0, boolean param1) {
        im var4 = null;
        String var5 = null;
        im var6 = null;
        L0: {
          if (null == this.field_m) {
            break L0;
          } else {
            if (this.field_l == ve.field_m) {
              break L0;
            } else {
              if (null == em.field_L) {
                break L0;
              } else {
                if (cj.e((byte) 85)) {
                  var6 = mg.a(param0 ^ 124, this.field_l);
                  var4 = fn.b(this.field_l, 0);
                  var5 = this.a(3);
                  if (var4 != null) {
                    L1: {
                      if (!em.field_L.field_ec) {
                        break L1;
                      } else {
                        if ((em.field_L.field_qc ^ -1) > -1) {
                          break L0;
                        } else {
                          break L1;
                        }
                      }
                    }
                    this.field_n.a(nr.a(new String[]{var5}, -1, th.field_i), 17130, 1);
                    break L0;
                  } else {
                    if (var6 == null) {
                      break L0;
                    } else {
                      if (!em.field_L.field_Dc) {
                        break L0;
                      } else {
                        if (em.field_L.field_Nb > em.field_L.field_mc) {
                          if (!var6.field_mc) {
                            L2: {
                              if (!param1) {
                                break L2;
                              } else {
                                if (var6.field_Yb) {
                                  this.field_n.a(nr.a(new String[]{var5}, -1, gf.field_c), param0 + 17006, 0);
                                  this.field_n.a(nr.a(new String[]{var5}, param0 + -125, ro.field_g), 17130, 1);
                                  break L0;
                                } else {
                                  break L2;
                                }
                              }
                            }
                            this.field_n.a(nr.a(new String[]{var5}, -1, qi.field_h), 17130, 0);
                            break L0;
                          } else {
                            this.field_n.a(nr.a(new String[]{var5}, -1, jh.field_b), param0 + 17006, 1);
                            break L0;
                          }
                        } else {
                          break L0;
                        }
                      }
                    }
                  }
                } else {
                  break L0;
                }
              }
            }
          }
        }
        L3: {
          if (param0 == 124) {
            break L3;
          } else {
            kn.c((byte) 66);
            break L3;
          }
        }
    }

    private final String a(int param0) {
        String var2 = null;
        if (null != this.field_d) {
            var2 = this.field_d;
        } else {
            var2 = this.field_m;
        }
        if (param0 != 3) {
            field_k = (String) null;
        }
        return var2;
    }

    final static boolean a(byte param0, char param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        char[] var5 = null;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_9_0 = 0;
        try {
          L0: {
            L1: {
              if (param1 <= 0) {
                break L1;
              } else {
                if (param1 < 128) {
                  stackOut_6_0 = 1;
                  stackIn_7_0 = stackOut_6_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (160 > param1) {
                break L2;
              } else {
                if (param1 > 255) {
                  break L2;
                } else {
                  return true;
                }
              }
            }
            if (param0 > 36) {
              L3: {
                if (0 == param1) {
                  break L3;
                } else {
                  var5 = rf.field_a;
                  var2 = var5;
                  var3 = 0;
                  L4: while (true) {
                    if (var3 >= var5.length) {
                      break L3;
                    } else {
                      var4 = var5[var3];
                      if (var4 == param1) {
                        stackOut_16_0 = 1;
                        stackIn_17_0 = stackOut_16_0;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        var3++;
                        continue L4;
                      }
                    }
                  }
                }
              }
              stackOut_19_0 = 0;
              stackIn_20_0 = stackOut_19_0;
              decompiledRegionSelector0 = 3;
              break L0;
            } else {
              stackOut_9_0 = 1;
              stackIn_10_0 = stackOut_9_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2_ref), "kn.B(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_17_0 != 0;
            } else {
              return stackIn_20_0 != 0;
            }
          }
        }
    }

    kn(vh param0, long param1, String param2, String param3, int param4, int param5, int[] param6) {
        try {
            this.field_n = new vq(ko.field_c);
            this.field_d = param3;
            this.field_l = param1;
            this.field_b = param4;
            this.field_a = param5;
            param0.field_Ib = true;
            this.field_i = param0;
            this.field_h = param6;
            this.field_m = param2;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "kn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0) {
        boolean discarded$1 = false;
        String var3 = null;
        kh var4 = null;
        L0: {
          if (null == em.field_L) {
            var4 = rb.a(this.field_b, 125);
            if (var4 != null) {
              var3 = var4.field_Ob;
              if (var4.field_Xb) {
                this.field_n.a(nr.a(new String[]{var3}, -1, or.field_m), param0 ^ 18642, 2);
                this.field_n.a(nr.a(new String[]{var3}, -1, hj.field_k), 17130, 3);
                break L0;
              } else {
                L1: {
                  if (var4.field_ic) {
                    this.field_n.a(nr.a(new String[]{var3}, param0 ^ -2617, se.field_m), param0 ^ 18642, 2);
                    break L1;
                  } else {
                    if (var4.field_fc) {
                      break L1;
                    } else {
                      if (!var4.field_Dc) {
                        break L1;
                      } else {
                        L2: {
                          if (!var4.field_ec) {
                            break L2;
                          } else {
                            if (!var4.field_ic) {
                              break L1;
                            } else {
                              break L2;
                            }
                          }
                        }
                        this.field_n.a(nr.a(new String[]{var3}, -1, dn.field_p), param0 ^ 18642, 2);
                        break L1;
                      }
                    }
                  }
                }
                if (!var4.field_fc) {
                  break L0;
                } else {
                  this.field_n.a(nr.a(new String[]{var3}, -1, nd.field_b), 17130, 3);
                  break L0;
                }
              }
            } else {
              break L0;
            }
          } else {
            break L0;
          }
        }
        L3: {
          if (param0 == 2616) {
            break L3;
          } else {
            discarded$1 = kn.a((byte) 103, 'ﾥ');
            break L3;
          }
        }
    }

    public static void c(byte param0) {
        field_e = null;
        field_g = null;
        field_k = null;
        if (param0 > -74) {
            return;
        }
        field_c = null;
        field_f = null;
    }

    static {
        field_f = "<%0> is on their last life!";
        field_k = "Invite";
        field_c = new int[8192];
    }
}
