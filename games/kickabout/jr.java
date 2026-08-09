/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jr extends im {
    private String field_Ib;
    static String field_Fb;
    static int field_Mb;
    private int[] field_Db;
    static int field_Kb;
    private boolean field_Lb;
    private hd field_Cb;
    private vc field_Hb;
    static double field_Gb;
    private hd field_Jb;
    private pu[] field_Eb;

    final void c(int param0, boolean param1) {
        int stackIn_8_0 = 0;
        hd stackIn_18_0 = null;
        hd stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        hd stackIn_29_0 = null;
        hd stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        int var3;
        int var4;
        int var5;
        sj var6;
        L0: {
          var5 = Kickabout.field_G;
          if (!this.field_Lb) {
            L1: {
              if (cq.e(15137)) {
                if (!np.h((byte) 19)) {
                  stackIn_8_0 = 1;
                  break L1;
                } else {
                  stackIn_8_0 = 0;
                  break L1;
                }
              } else {
                stackIn_8_0 = 0;
                break L1;
              }
            }
            L2: {
              L3: {
                var3 = stackIn_8_0;
                stackIn_18_0 = this.field_Cb;

                if (la.a(100)) {
                  break L3;
                } else {
                  stackIn_18_0 = (hd) ((Object) stackIn_18_0);

                  if (dg.field_e) {
                    break L3;
                  } else {
                    stackIn_18_0 = (hd) ((Object) stackIn_18_0);

                    if (ds.field_g) {
                      break L3;
                    } else {
                      stackIn_18_0 = (hd) ((Object) stackIn_18_0);

                      if (var3 != 0) {
                        break L3;
                      } else {
                        stackIn_18_0 = (hd) ((Object) stackIn_18_0);

                        if (tu.field_E.a(1, this.field_Hb.field_a)) {
                          break L3;
                        } else {
                          stackIn_18_0 = (hd) ((Object) stackIn_18_0);

                          if (!this.field_Hb.field_r) {
                            break L3;
                          } else {
                            stackIn_18_0 = (hd) ((Object) stackIn_18_0);

                            if (this.field_Hb.field_j) {
                              break L3;
                            } else {
                              stackIn_18_0 = (hd) ((Object) stackIn_18_0);

                              if (this.field_Hb.field_h) {
                                break L3;
                              } else {
                                stackIn_18_0 = (hd) ((Object) stackIn_18_0);

                                if (this.field_Hb.field_q) {
                                  break L3;
                                } else {
                                  stackIn_19_0 = (hd) ((Object) stackIn_18_0);
                                  stackIn_19_1 = 1;
                                  break L2;
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
              stackIn_19_0 = (hd) ((Object) stackIn_18_0);
              stackIn_19_1 = 0;
              break L2;
            }
            L4: {
              L5: {
                stackIn_19_0.field_lb = stackIn_19_1 != 0;
                stackIn_29_0 = this.field_Jb;

                if (la.a(100)) {
                  break L5;
                } else {
                  stackIn_29_0 = (hd) ((Object) stackIn_29_0);

                  if (dg.field_e) {
                    break L5;
                  } else {
                    stackIn_29_0 = (hd) ((Object) stackIn_29_0);

                    if (ds.field_g) {
                      break L5;
                    } else {
                      stackIn_29_0 = (hd) ((Object) stackIn_29_0);

                      if (var3 != 0) {
                        break L5;
                      } else {
                        stackIn_29_0 = (hd) ((Object) stackIn_29_0);

                        if (tu.field_E.a(1, this.field_Hb.field_a)) {
                          break L5;
                        } else {
                          stackIn_29_0 = (hd) ((Object) stackIn_29_0);

                          if (-1L == this.field_Hb.field_k) {
                            break L5;
                          } else {
                            stackIn_29_0 = (hd) ((Object) stackIn_29_0);

                            if (this.field_Hb.field_j) {
                              break L5;
                            } else {
                              stackIn_29_0 = (hd) ((Object) stackIn_29_0);

                              if (this.field_Hb.field_h) {
                                break L5;
                              } else {
                                stackIn_29_0 = (hd) ((Object) stackIn_29_0);

                                if (tu.field_E.a(this.field_Hb.field_a, (byte) -79)) {
                                  break L5;
                                } else {
                                  stackIn_30_0 = (hd) ((Object) stackIn_29_0);
                                  stackIn_30_1 = 1;
                                  break L4;
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
              stackIn_30_0 = (hd) ((Object) stackIn_29_0);
              stackIn_30_1 = 0;
              break L4;
            }
            L6: {
              stackIn_30_0.field_lb = stackIn_30_1 != 0;
              if (!param1) {
                break L6;
              } else {
                var4 = 0;
                L7: while (true) {
                  if (var4 >= this.field_Eb.length) {
                    break L6;
                  } else {
                    this.field_Eb[var4].h((byte) 30);
                    var4++;
                    continue L7;
                  }
                }
              }
            }
            L8: {
              if ((this.field_Jb.field_sb ^ -1) == -2) {
                if (tu.field_E.a(param0 ^ 1, this.field_Hb.field_a)) {
                  tb.a((byte) 126, 31);
                  sp.c(53, param0 + -9);
                  break L8;
                } else {
                  if (tu.field_E.a(this.field_Hb.field_a, (byte) -79)) {
                    tb.a((byte) 126, 3);
                    sp.c(53, -3);
                    break L8;
                  } else {
                    if (tu.field_E.c(-3)) {
                      if ((tu.field_E.d(-1) ^ -1) == 0) {
                        tb.a((byte) 126, 2);
                        sp.c(53, 112);
                        break L8;
                      } else {
                        if (this.field_Hb.field_i > tu.field_E.field_x) {
                          tb.a((byte) 126, 4);
                          sp.c(53, 9);
                          break L8;
                        } else {
                          oj.a(-45, this.field_Hb);
                          break L8;
                        }
                      }
                    } else {
                      tb.a((byte) 126, 6);
                      sp.c(53, 34);
                      break L8;
                    }
                  }
                }
              } else {
                break L8;
              }
            }
            if ((this.field_Cb.field_sb ^ -1) != -2) {
              break L0;
            } else {
              if (tu.field_E.a(this.field_Hb.field_a, (byte) -79)) {
                if (this.field_Hb.field_t > tu.field_E.field_x) {
                  tb.a((byte) 126, 4);
                  sp.c(53, -113);
                  break L0;
                } else {
                  ca.a(this.field_Hb, 255);
                  break L0;
                }
              } else {
                if (!tu.field_E.a(param0 + 1, this.field_Hb.field_a)) {
                  if (this.field_Hb.field_t > tu.field_E.field_x) {
                    tb.a((byte) 126, 4);
                    sp.c(53, -12);
                    break L0;
                  } else {
                    if (tu.field_E.c(-3)) {
                      if (tu.field_E.d(-1) == -1) {
                        tb.a((byte) 126, 2);
                        sp.c(53, 40);
                        break L0;
                      } else {
                        is.a((byte) -123, this.field_Hb);
                        break L0;
                      }
                    } else {
                      tb.a((byte) 126, 6);
                      sp.c(53, 111);
                      break L0;
                    }
                  }
                } else {
                  tb.a((byte) 126, 31);
                  sp.c(53, 54);
                  break L0;
                }
              }
            }
          } else {
            break L0;
          }
        }
        L9: {
          if (param0 == 0) {
            break L9;
          } else {
            var6 = (sj) null;
            jr.a((sj) null, 41, 84);
            break L9;
          }
        }
    }

    final boolean b(int param0) {
        int stackIn_6_0 = 0;
        L0: {
          if (param0 == 15377) {
            break L0;
          } else {
            this.field_Ib = (String) null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (!this.field_Lb) {
              break L2;
            } else {
              if (this.field_Ib == null) {
                break L2;
              } else {
                stackIn_6_0 = 1;
                break L1;
              }
            }
          }
          stackIn_6_0 = 0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final void b(int param0, int param1) {
        up stackIn_9_0 = null;
        up stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        up stackIn_14_0;
        int stackIn_14_1;
        up stackIn_14_2;
        int stackIn_14_3;
        up stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        up stackIn_15_2 = null;
        int stackIn_15_3 = 0;
        int stackIn_15_4 = 0;
        up stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_19_2 = 0;
        int stackIn_36_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_44_0;
        int stackIn_44_1;
        int stackIn_44_2;
        int stackIn_44_3;
        int stackIn_46_0;
        int stackIn_46_1;
        int stackIn_46_2;
        int stackIn_46_3;
        int stackIn_46_4;
        String stackIn_58_0 = null;
        int var4;
        ot var5;
        int var6;
        int var7;
        int var8;
        String var9;
        int var9_int;
        int var10;
        int var11;
        up var12;
        L0: {
          var11 = Kickabout.field_G;
          if (on.field_h < this.field_T) {
            break L0;
          } else {
            if (this.field_T - -this.field_mb < on.field_e) {
              break L0;
            } else {
              L1: {
                var12 = new up();
                if (param0 == 0) {
                  break L1;
                } else {
                  field_Fb = (String) null;
                  break L1;
                }
              }
              L2: {
                if (this.field_Lb) {
                  break L2;
                } else {
                  L3: {
                    var12.a((byte) -81, this.field_Hb.field_m);
                    stackIn_9_0 = (up) (var12);

                    if (tu.field_E.a(1, this.field_Hb.field_a)) {
                      stackIn_10_0 = (up) ((Object) stackIn_9_0);
                      stackIn_10_1 = 0;
                      break L3;
                    } else {
                      stackIn_10_0 = (up) ((Object) stackIn_9_0);
                      stackIn_10_1 = 1;
                      break L3;
                    }
                  }
                  stackIn_10_0.field_c = stackIn_10_1 != 0;
                  break L2;
                }
              }
              L4: {
                var4 = this.field_F;
                if (this.field_Lb) {
                  if (this.field_Db == null) {
                    if (this.field_Ib == null) {
                      break L4;
                    } else {
                      on.f(this.field_F + (-320 + this.field_q >> -1978929919), 23 + this.field_T, 320, 27, 8, 65793);
                      on.a((-320 + this.field_q >> 551736129) + this.field_F, this.field_T - -23, 320, 27, 8, 65793, 160);
                      pb.field_C.d(this.field_Ib, this.field_F - -(this.field_q >> -758898303), this.field_T + 42, 16777215, -1);
                      break L4;
                    }
                  } else {
                    jr.a(this.field_Db[1] + (this.field_Db[0] + this.field_F + (this.field_Db[2] - 30)), -96, this.field_T + 23);
                    break L4;
                  }
                } else {
                  L5: {
                    stackIn_14_0 = (up) (var12);

                    stackIn_14_1 = 0;

                    stackIn_14_2 = (up) (var12);

                    stackIn_14_3 = -107;

                    if (jd.f(-1)) {
                      stackIn_15_0 = (up) ((Object) stackIn_14_0);
                      stackIn_15_1 = stackIn_14_1;
                      stackIn_15_2 = (up) ((Object) stackIn_14_2);
                      stackIn_15_3 = stackIn_14_3;
                      stackIn_15_4 = 0;
                      break L5;
                    } else {
                      stackIn_15_0 = (up) ((Object) stackIn_14_0);
                      stackIn_15_1 = stackIn_14_1;
                      stackIn_15_2 = (up) ((Object) stackIn_14_2);
                      stackIn_15_3 = stackIn_14_3;
                      stackIn_15_4 = 1;
                      break L5;
                    }
                  }
                  L6: {
                    L7: {
                      stackIn_15_0 = (up) ((Object) stackIn_15_0);

                      if (!((up) (Object) stackIn_15_2).c((byte) stackIn_15_3, stackIn_15_4 != 0)) {
                        break L7;
                      } else {
                        stackIn_15_0 = (up) ((Object) stackIn_15_0);

                        if (!wn.a((byte) 1)) {
                          break L7;
                        } else {
                          stackIn_19_0 = (up) ((Object) stackIn_15_0);
                          stackIn_19_1 = stackIn_15_1;
                          stackIn_19_2 = 1;
                          break L6;
                        }
                      }
                    }
                    stackIn_19_0 = (up) ((Object) stackIn_15_0);
                    stackIn_19_1 = stackIn_15_1;
                    stackIn_19_2 = 0;
                    break L6;
                  }
                  L8: {
                    var5 = kk.a(stackIn_19_0, stackIn_19_1, stackIn_19_2 != 0);
                    if (var5 != null) {
                      var5.c(1 + var4, this.field_T + 4);
                      break L8;
                    } else {
                      jr.a(1 + var4 - -19, -97, this.field_T - -4 + 23);
                      break L8;
                    }
                  }
                  L9: {
                    this.field_X.a(var12.d(100), 45 + var4, (this.field_mb >> 369978849) + this.field_T - -4, this.field_y, -1);
                    var4 = var4 + this.field_Db[0];
                    if (tu.field_E.a(this.field_Hb.field_a, (byte) -79)) {
                      q.field_d.c(tf.field_b.toUpperCase(), var4 - 10, -7 + (this.field_mb + this.field_T), 6745702, -1);
                      break L9;
                    } else {
                      if (!tu.field_E.a(1, this.field_Hb.field_a)) {
                        if (tu.field_E.b(30524, this.field_Hb.field_a)) {
                          q.field_d.c(fb.field_O.toUpperCase(), -10 + var4, -7 + this.field_mb + this.field_T, 16777028, -1);
                          break L9;
                        } else {
                          break L9;
                        }
                      } else {
                        q.field_d.c(bk.field_g.toUpperCase(), -10 + var4, this.field_T - (-this.field_mb - -7), 16737894, -1);
                        break L9;
                      }
                    }
                  }
                  this.field_X.a(uf.field_e[var12.field_q], 12 + var4, this.field_T + (this.field_mb >> 1438383585) - -4, this.field_y, -1);
                  var4 = var4 + this.field_Db[1];
                  var6 = 7 + var4;
                  var7 = 0;
                  L10: while (true) {
                    if (3 <= var7) {
                      L11: {
                        var4 = var4 + this.field_Db[2];
                        if (this.field_Hb.field_m.field_h.length != 0) {
                          break L11;
                        } else {
                          pb.field_C.d(hi.field_w, var4 + (this.field_Db[3] >> 890221121), 4 + (this.field_T + (this.field_mb >> -810517279)), 16777215, -1);
                          break L11;
                        }
                      }
                      L12: {
                        var4 = var4 + this.field_Db[3];
                        var7 = this.field_y;
                        if (this.field_Hb.field_j) {
                          this.field_X.d(ri.field_s, (this.field_Db[4] >> 1527501217) + var4, 4 + this.field_T + (this.field_mb >> -206018143), 16711680, -1);
                          break L12;
                        } else {
                          this.field_X.d(ql.field_c[this.field_Hb.field_s], (this.field_Db[4] >> 1731208993) + var4, 4 + ((this.field_mb >> -1315421599) + this.field_T), var7, -1);
                          break L12;
                        }
                      }
                      L13: {
                        var4 = var4 + this.field_Db[4];
                        this.field_X.d(ad.a(this.field_Hb.field_i, 26300), (this.field_Db[5] >> -615574623) + var4, -7 + ((this.field_mb >> -1009376895) + this.field_T), this.field_y, -1);
                        var4 = var4 + this.field_Db[5];
                        var8 = -1;
                        if (this.field_Hb.field_r) {
                          var8 = this.field_Hb.field_t;
                          break L13;
                        } else {
                          break L13;
                        }
                      }
                      L14: {
                        if (-1 != var8) {
                          stackIn_58_0 = ad.a(var8, 26300);
                          break L14;
                        } else {
                          stackIn_58_0 = im.field_zb;
                          break L14;
                        }
                      }
                      var9 = stackIn_58_0;
                      this.field_X.d(var9, (this.field_Db[5] >> -1638591) + var4, -7 + (this.field_mb >> 564185633) + this.field_T, this.field_y, -1);
                      var4 = var4 + this.field_Db[6];
                      break L4;
                    } else {
                      L15: {
                        var8 = 5 + this.field_T - -(15 * var7);
                        if ((var7 ^ -1) != -1) {
                          if (-2 != (var7 ^ -1)) {
                            stackIn_36_0 = var12.field_o;
                            break L15;
                          } else {
                            stackIn_36_0 = var12.field_g;
                            break L15;
                          }
                        } else {
                          stackIn_36_0 = var12.field_n;
                          break L15;
                        }
                      }
                      L16: {
                        var9_int = stackIn_36_0;
                        if (var7 != 0) {
                          if (-2 == (var7 ^ -1)) {
                            stackIn_41_0 = var12.a(5205, oi.b(87));
                            break L16;
                          } else {
                            stackIn_41_0 = var12.b((byte) -51, oi.b(-112));
                            break L16;
                          }
                        } else {
                          stackIn_41_0 = var12.c(true, oi.b(-113));
                          break L16;
                        }
                      }
                      L17: {
                        L18: {
                          var10 = stackIn_41_0;
                          stackIn_44_0 = var6;

                          stackIn_44_1 = var8;

                          stackIn_44_2 = var9_int;

                          stackIn_44_3 = var7;

                          if (this.field_gb) {
                            break L18;
                          } else {








                            if (param1 != 2) {
                              stackIn_46_0 = stackIn_44_0;
                              stackIn_46_1 = stackIn_44_1;
                              stackIn_46_2 = stackIn_44_2;
                              stackIn_46_3 = stackIn_44_3;
                              stackIn_46_4 = 0;
                              break L17;
                            } else {




                              break L18;
                            }
                          }
                        }
                        stackIn_46_0 = stackIn_44_0;
                        stackIn_46_1 = stackIn_44_1;
                        stackIn_46_2 = stackIn_44_2;
                        stackIn_46_3 = stackIn_44_3;
                        stackIn_46_4 = 1;
                        break L17;
                      }
                      eo.a(stackIn_46_0, stackIn_46_1, stackIn_46_2, stackIn_46_3, stackIn_46_4 != 0, var10);
                      var7++;
                      continue L10;
                    }
                  }
                }
              }
              return;
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2) {
        if (param1 > -16) {
            field_Mb = -60;
        }
        int var3 = (int)(nj.a(75) % 600L);
        var3 = var3 * 6 / 600;
        w.field_f[var3].c(param0 + -19, param2 + -23);
    }

    final static jk a(sj param0, int param1, int param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        jk stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        jk stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param2 >= 111) {
              var4 = param0.a(0, param1);
              var3 = var4;
              if (var4 != null) {
                stackIn_7_0 = new jk(var4);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = (jk) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3_ref);

            stackIn_10_1 = new StringBuilder().append("jr.K(");

            if (param0 == null) {
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
          throw nb.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (jk) ((Object) stackIn_5_0);
          } else {
            return stackIn_7_0;
          }
        }
    }

    public static void i(int param0) {
        field_Fb = null;
        if (param0 != -25734) {
            field_Gb = 0.9598598751940521;
        }
    }

    private jr() {
        this.field_Lb = true;
    }

    jr(String param0) {
        try {
            this.field_Ib = param0;
            this.field_Lb = true;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "jr.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    jr(int[] param0) {
        try {
            this.field_Lb = true;
            this.field_Db = param0;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "jr.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    jr(vc param0, int[] param1) {
        int stackIn_11_0 = 0;
        Object stackIn_14_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        jr var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        Object var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        fn var9 = null;
        pu var10 = null;
        int var11 = 0;
        int var12 = 0;
        try {
          L0: {
            L1: {
              var3 = (jr) ((Object) bk.field_f.b((byte) 126));
              if (var3 != null) {
                break L1;
              } else {
                var3 = new jr();
                break L1;
              }
            }
            L2: {
              this.field_mb = 50;
              this.field_Hb = param0;
              this.field_Db = param1;
              if ((vv.field_r ^ -1) != -4) {
                if (-3 != (vv.field_r ^ -1)) {
                  if (vv.field_r == 1) {
                    stackIn_11_0 = 1;
                    break L2;
                  } else {
                    stackIn_11_0 = 0;
                    break L2;
                  }
                } else {
                  stackIn_11_0 = 1;
                  break L2;
                }
              } else {
                stackIn_11_0 = 1;
                break L2;
              }
            }
            L3: {
              var4 = stackIn_11_0;
              if (var4 != 0) {
                stackIn_14_0 = q.field_d;
                break L3;
              } else {
                stackIn_14_0 = un.field_d;
                break L3;
              }
            }
            var5 = stackIn_14_0;
            this.field_Jb = eo.a(he.field_Eb, 7126504, (hu) (var5), 50, true);
            this.field_Cb = eo.a(mc.field_f, 7126504, (hu) (var5), 50, true);
            this.a((byte) -117, this.field_Jb);
            this.a((byte) -120, this.field_Cb);
            this.field_Jb.field_J = this.field_T - -20;
            this.field_Jb.field_s = -25 + ((this.field_Db[5] >> 1642844673) + (this.field_Db[3] + this.field_Db[2] + this.field_Db[1])) + (this.field_Db[0] + this.field_Db[4]);
            this.field_Lb = false;
            this.field_Cb.field_s = -25 + (this.field_Db[6] >> 827770497) + (this.field_Db[2] + this.field_Db[0] + (this.field_Db[1] - (-this.field_Db[3] - this.field_Db[4])) + this.field_Db[5]);
            this.field_Cb.field_J = 20;
            var6 = (this.field_Db[3] >> 269920609) + this.field_Db[2] + (this.field_Db[1] + this.field_Db[0]);
            var7 = this.field_mb >> 1641326273;
            this.field_Eb = new pu[this.field_Hb.field_m.field_h.length];
            var8 = 0;
            L4: while (true) {
              if (this.field_Eb.length <= var8) {
                break L0;
              } else {
                L5: {
                  var9 = pa.field_g[this.field_Hb.field_m.field_h[var8]];
                  var10 = new pu(var9, true);
                  var11 = var6;
                  var12 = var7;
                  if ((this.field_Hb.field_m.field_h.length ^ -1) == -3) {
                    var11 = -10 + var11 + 20 * var8;
                    break L5;
                  } else {
                    if ((this.field_Hb.field_m.field_h.length ^ -1) != -4) {
                      break L5;
                    } else {
                      if (var8 == 1) {
                        var12 -= 10;
                        break L5;
                      } else {
                        var11 = 20 * (var8 / 2) + (-10 + var11);
                        var12 += 10;
                        break L5;
                      }
                    }
                  }
                }
                var10.field_s = -(var10.field_q >> -1399378655) + var11;
                var10.field_J = -(var10.field_mb >> 1653906465) + var12;
                this.a((byte) -106, (hd) (var10));
                this.field_Eb[var8] = var10;
                var8++;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3_ref = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var3_ref);

            stackIn_26_1 = new StringBuilder().append("jr.<init>(");

            if (param0 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L6;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_29_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');

            if (param1 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L7;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L7;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_27_0), stackIn_30_2 + ')');
        }
    }

    static {
        field_Fb = "Either of these control schemes can be used in game.";
        field_Kb = -1;
    }
}
