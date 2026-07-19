/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ug extends nb {
    private lg field_db;
    private String field_Y;
    private boolean field_gb;
    static bh field_hb;
    static wf field_ib;
    static String field_X;
    static int[] field_bb;
    private boolean field_Z;
    static int field_eb;
    static jk field_cb;
    private String field_fb;
    static ie field_ab;

    final static boolean c(int param0, int param1, int param2) {
        StringBuilder discarded$11 = null;
        StringBuilder discarded$12 = null;
        StringBuilder discarded$13 = null;
        StringBuilder discarded$14 = null;
        StringBuilder discarded$15 = null;
        StringBuilder discarded$16 = null;
        StringBuilder discarded$17 = null;
        StringBuilder discarded$18 = null;
        StringBuilder discarded$19 = null;
        StringBuilder discarded$20 = null;
        StringBuilder discarded$21 = null;
        int var3 = 0;
        String var4_ref_String = null;
        int var4 = 0;
        int var5 = 0;
        String var7 = null;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var12 = null;
        String var13 = null;
        String var14 = null;
        String var15 = null;
        String var16 = null;
        String var17 = null;
        String var18 = null;
        String var19 = null;
        String var23 = null;
        String var24 = null;
        String var25 = null;
        String var26 = null;
        String var27 = null;
        String var28 = null;
        String var29 = null;
        String var30 = null;
        String var31 = null;
        String var32 = null;
        String var33 = null;
        String var34 = null;
        String var35 = null;
        String var36 = null;
        String var37 = null;
        Object var38 = null;
        CharSequence var39 = null;
        var38 = null;
        var11 = TetraLink.field_J;
        var3 = 1;
        if (param0 == 32) {
          L0: {
            if (fi.field_Cb) {
              break L0;
            } else {
              if (gn.field_I == null) {
                var3 = 0;
                break L0;
              } else {
                break L0;
              }
            }
          }
          L1: {
            if (sf.field_d != 0) {
              break L1;
            } else {
              if (qe.field_a != null) {
                var3 = 0;
                break L1;
              } else {
                break L1;
              }
            }
          }
          L2: {
            if ((sf.field_d ^ -1) != -3) {
              break L2;
            } else {
              if (k.a(true)) {
                break L2;
              } else {
                var3 = 0;
                break L2;
              }
            }
          }
          if (-85 == (dg.field_e ^ -1)) {
            if (var3 == 0) {
              if (sf.field_d == 0) {
                return true;
              } else {
                hi.b(-113);
                return true;
              }
            } else {
              L3: {
                if (-1 > (io.field_h.length() ^ -1)) {
                  var4_ref_String = io.field_h.toString();
                  if (oa.a(var4_ref_String, 65416)) {
                    var13 = (String) null;
                    var12 = (String) null;
                    fi.a(0, 0, (String) null, 2, kj.field_c, (String) null);
                    var15 = (String) null;
                    var14 = (String) null;
                    fi.a(0, 0, (String) null, 2, sa.field_a, (String) null);
                    hi.b(-82);
                    break L3;
                  } else {
                    L4: {
                      var5 = sf.field_d;
                      if (var5 != 0) {
                        break L4;
                      } else {
                        if (qb.field_N == null) {
                          break L4;
                        } else {
                          var5 = 1;
                          break L4;
                        }
                      }
                    }
                    if (-3 != (fh.a((byte) 79, var5) ^ -1)) {
                      eo.a(-3, -1, param1, ka.field_m, sf.field_d, var4_ref_String);
                      hi.b(-82);
                      break L3;
                    } else {
                      vj.a(var5, param2, 1, 127);
                      eo.a(-3, -1, param1, ka.field_m, sf.field_d, var4_ref_String);
                      hi.b(-82);
                      break L3;
                    }
                  }
                } else {
                  hi.b(-82);
                  break L3;
                }
              }
              return true;
            }
          } else {
            if (dg.field_e != 85) {
              var4 = tb.field_m;
              if (id.a(false, (char) var4)) {
                if (var3 != 0) {
                  if ((io.field_h.length() ^ -1) > -81) {
                    L5: {
                      discarded$11 = io.field_h.append((char) var4);
                      var5 = 485;
                      var17 = ph.field_w;
                      var16 = rh.a(var17, param0 ^ -125);
                      var19 = var16;
                      if (-3 != (sf.field_d ^ -1)) {
                        var7 = "";
                        if (sf.field_d == 0) {
                          L6: {
                            if (qb.field_N != null) {
                              break L6;
                            } else {
                              if (go.field_c) {
                                var7 = "[" + nm.field_v + "] ";
                                break L6;
                              } else {
                                if (null != qb.field_N) {
                                  if (nh.field_Sb) {
                                    if (null != ec.field_h) {
                                      L7: {
                                        var24 = "[" + ec.field_h + "] ";
                                        var25 = var24 + var19 + ": ";
                                        var5 = var5 - we.field_k.b(var25);
                                        if (we.field_k.b(io.field_h.toString()) > var5) {
                                          discarded$12 = lo.a(-26750, io.field_h, io.field_h.length() - 1, ' ');
                                          break L7;
                                        } else {
                                          break L7;
                                        }
                                      }
                                      return true;
                                    } else {
                                      L8: {
                                        var28 = "[" + sk.a(new String[]{qb.field_N.field_ec}, qe.field_e, 120) + "] ";
                                        var7 = var28;
                                        var29 = var28 + var19 + ": ";
                                        var5 = var5 - we.field_k.b(var29);
                                        if (we.field_k.b(io.field_h.toString()) > var5) {
                                          discarded$13 = lo.a(-26750, io.field_h, io.field_h.length() - 1, ' ');
                                          break L8;
                                        } else {
                                          break L8;
                                        }
                                      }
                                      return true;
                                    }
                                  } else {
                                    L9: {
                                      var26 = "[" + sk.a(new String[]{qb.field_N.field_ec}, qe.field_e, 120) + "] ";
                                      var27 = var26 + var19 + ": ";
                                      var5 = var5 - we.field_k.b(var27);
                                      if (we.field_k.b(io.field_h.toString()) > var5) {
                                        discarded$14 = lo.a(-26750, io.field_h, io.field_h.length() - 1, ' ');
                                        break L9;
                                      } else {
                                        break L9;
                                      }
                                    }
                                    return true;
                                  }
                                } else {
                                  L10: {
                                    var30 = var7 + var19 + ": ";
                                    var5 = var5 - we.field_k.b(var30);
                                    if (we.field_k.b(io.field_h.toString()) > var5) {
                                      discarded$15 = lo.a(-26750, io.field_h, io.field_h.length() - 1, ' ');
                                      break L10;
                                    } else {
                                      break L10;
                                    }
                                  }
                                  return true;
                                }
                              }
                            }
                          }
                          if (null == qb.field_N) {
                            var37 = var7 + var19 + ": ";
                            var5 = var5 - we.field_k.b(var37);
                            break L5;
                          } else {
                            if (nh.field_Sb) {
                              if (null == ec.field_h) {
                                L11: {
                                  var35 = "[" + sk.a(new String[]{qb.field_N.field_ec}, qe.field_e, 120) + "] ";
                                  var7 = var35;
                                  var36 = var35 + var19 + ": ";
                                  var5 = var5 - we.field_k.b(var36);
                                  if (we.field_k.b(io.field_h.toString()) > var5) {
                                    discarded$16 = lo.a(-26750, io.field_h, io.field_h.length() - 1, ' ');
                                    break L11;
                                  } else {
                                    break L11;
                                  }
                                }
                                return true;
                              } else {
                                L12: {
                                  var31 = "[" + ec.field_h + "] ";
                                  var32 = var31 + var19 + ": ";
                                  var5 = var5 - we.field_k.b(var32);
                                  if (we.field_k.b(io.field_h.toString()) > var5) {
                                    discarded$17 = lo.a(-26750, io.field_h, io.field_h.length() - 1, ' ');
                                    break L12;
                                  } else {
                                    break L12;
                                  }
                                }
                                return true;
                              }
                            } else {
                              L13: {
                                var33 = "[" + sk.a(new String[]{qb.field_N.field_ec}, qe.field_e, 120) + "] ";
                                var34 = var33 + var19 + ": ";
                                var5 = var5 - we.field_k.b(var34);
                                if (we.field_k.b(io.field_h.toString()) > var5) {
                                  discarded$18 = lo.a(-26750, io.field_h, io.field_h.length() - 1, ' ');
                                  break L13;
                                } else {
                                  break L13;
                                }
                              }
                              return true;
                            }
                          }
                        } else {
                          L14: {
                            var23 = var7 + var19 + ": ";
                            var5 = var5 - we.field_k.b(var23);
                            if (we.field_k.b(io.field_h.toString()) > var5) {
                              discarded$19 = lo.a(-26750, io.field_h, io.field_h.length() - 1, ' ');
                              break L14;
                            } else {
                              break L14;
                            }
                          }
                          return true;
                        }
                      } else {
                        var39 = (CharSequence) ((Object) ka.field_m);
                        var18 = sk.a(new String[]{p.a(var39, (byte) 43)}, vd.field_b, param0 ^ 94);
                        var8 = sk.a(new String[]{var16}, mc.field_h, 127);
                        var9 = we.field_k.b(var18);
                        var10 = we.field_k.b(var8);
                        if (var9 > var10) {
                          var5 = var5 - var9;
                          break L5;
                        } else {
                          var5 = var5 - var10;
                          break L5;
                        }
                      }
                    }
                    if (we.field_k.b(io.field_h.toString()) > var5) {
                      discarded$20 = lo.a(-26750, io.field_h, io.field_h.length() - 1, ' ');
                      return true;
                    } else {
                      return true;
                    }
                  } else {
                    return true;
                  }
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              if (var3 == 0) {
                return true;
              } else {
                L15: {
                  if ((io.field_h.length() ^ -1) < -1) {
                    discarded$21 = lo.a(-26750, io.field_h, -1 + io.field_h.length(), ' ');
                    break L15;
                  } else {
                    break L15;
                  }
                }
                return true;
              }
            }
          }
        } else {
          return false;
        }
    }

    ug(pk param0, String param1) {
        super(param0, 300, 120);
        int var3_int = 0;
        try {
            this.field_Y = param1;
            if (this.field_Y != null) {
                var3_int = ab.field_V.b(this.field_Y, 260, ab.field_V.field_N);
                this.a(300, (byte) 122, var3_int + 150);
            }
            this.field_db = new lg(13, 50, 274, 30, 15, 2113632, 4210752);
            this.field_Z = false;
            this.field_gb = false;
            this.field_db.field_K = true;
            this.c(this.field_db, 10);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "ug.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int stackIn_9_0 = 0;
        int stackIn_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          go.field_b[nd.field_Mb] = param4;
          qd.field_W[nd.field_Mb] = nd.field_Mb;
          lb.field_P[nd.field_Mb] = param2;
          if (param2 > eh.field_s) {
            va.field_z = param2;
            break L0;
          } else {
            break L0;
          }
        }
        if (param2 >= ai.field_h) {
          ac.field_b[nd.field_Mb] = param1;
          ai.field_g[nd.field_Mb] = param5;
          gl.field_n[nd.field_Mb] = param0;
          if (param3 == 20) {
            L1: {
              var6 = param0 + param5 + param1;
              if (var6 != 0) {
                stackOut_20_0 = 1000 * param1 / var6;
                stackIn_21_0 = stackOut_20_0;
                break L1;
              } else {
                stackOut_19_0 = 0;
                stackIn_21_0 = stackOut_19_0;
                break L1;
              }
            }
            L2: {
              var7 = stackIn_21_0;
              fe.field_b[nd.field_Mb] = var7;
              nd.field_Mb = nd.field_Mb + 1;
              if (mh.field_d > var7) {
                mh.field_d = var7;
                break L2;
              } else {
                break L2;
              }
            }
            if (var7 > va.field_z) {
              va.field_z = var7;
              return;
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          mh.field_d = param2;
          ac.field_b[nd.field_Mb] = param1;
          ai.field_g[nd.field_Mb] = param5;
          gl.field_n[nd.field_Mb] = param0;
          if (param3 == 20) {
            L3: {
              var6 = param0 + param5 + param1;
              if (var6 != 0) {
                stackOut_8_0 = 1000 * param1 / var6;
                stackIn_9_0 = stackOut_8_0;
                break L3;
              } else {
                stackOut_7_0 = 0;
                stackIn_9_0 = stackOut_7_0;
                break L3;
              }
            }
            L4: {
              var7 = stackIn_9_0;
              fe.field_b[nd.field_Mb] = var7;
              nd.field_Mb = nd.field_Mb + 1;
              if (mh.field_d > var7) {
                mh.field_d = var7;
                break L4;
              } else {
                break L4;
              }
            }
            if (var7 > va.field_z) {
              va.field_z = var7;
              return;
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    final static boolean o(int param0) {
        int var1 = 95 / ((param0 - -24) / 43);
        return bh.field_r;
    }

    public static void f(boolean param0) {
        hm discarded$2 = null;
        String var2 = null;
        field_ab = null;
        field_bb = null;
        field_X = null;
        if (param0) {
          var2 = (String) null;
          discarded$2 = ug.a(-50L, (String) null, false, (String) null, 121);
          field_ib = null;
          field_hb = null;
          field_cb = null;
          return;
        } else {
          field_ib = null;
          field_hb = null;
          field_cb = null;
          return;
        }
    }

    final static oh a(ah param0, byte param1, String param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        oh stackIn_3_0 = null;
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
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        oh stackOut_2_0 = null;
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
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              var4_int = param0.a(-1, param3);
              if (param1 == -45) {
                break L1;
              } else {
                field_cb = (jk) null;
                break L1;
              }
            }
            var5 = param0.a(var4_int, false, param2);
            stackOut_2_0 = sj.a(-2, param0, var4_int, var5);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var4);
            stackOut_4_1 = new StringBuilder().append("ug.R(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        return stackIn_3_0;
    }

    final void a(String param0, byte param1, float param2, boolean param3) {
        RuntimeException runtimeException = null;
        ah var6 = null;
        boolean stackIn_1_0 = false;
        boolean stackIn_2_0 = false;
        boolean stackIn_3_0 = false;
        int stackIn_3_1 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_0_0 = false;
        boolean stackOut_2_0 = false;
        int stackOut_2_1 = 0;
        boolean stackOut_1_0 = false;
        int stackOut_1_1 = 0;
        Object stackOut_5_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              stackOut_0_0 = this.field_Z;
              stackIn_2_0 = stackOut_0_0;
              stackIn_1_0 = stackOut_0_0;
              if (param3) {
                stackOut_2_0 = stackIn_2_0;
                stackOut_2_1 = 0;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                break L1;
              } else {
                stackOut_1_0 = stackIn_1_0;
                stackOut_1_1 = 1;
                stackIn_3_0 = stackOut_1_0;
                stackIn_3_1 = stackOut_1_1;
                break L1;
              }
            }
            L2: {
              if ((stackIn_3_0 ? 1 : 0) == stackIn_3_1) {
                L3: {
                  stackOut_5_0 = this;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_6_0 = stackOut_5_0;
                  if (!param3) {
                    stackOut_7_0 = this;
                    stackOut_7_1 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    break L3;
                  } else {
                    stackOut_6_0 = this;
                    stackOut_6_1 = 1;
                    stackIn_8_0 = stackOut_6_0;
                    stackIn_8_1 = stackOut_6_1;
                    break L3;
                  }
                }
                ((ug) (this)).field_Z = stackIn_8_1 != 0;
                if (this.field_Z) {
                  this.field_db.b(119, 8405024, 4210752);
                  this.field_db.field_K = true;
                  break L2;
                } else {
                  this.field_db.b(-86, 2113632, 4210752);
                  if (!this.field_gb) {
                    break L2;
                  } else {
                    this.field_db.field_K = false;
                    break L2;
                  }
                }
              } else {
                break L2;
              }
            }
            L4: {
              if (param1 < -102) {
                break L4;
              } else {
                var6 = (ah) null;
                ug.a(104, (ah) null);
                break L4;
              }
            }
            this.field_db.field_bb = (int)(param2 / 100.0f * 65536.0f);
            this.field_fb = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (runtimeException);
            stackOut_16_1 = new StringBuilder().append("ug.O(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void e(boolean param0) {
        this.field_gb = param0 ? true : false;
        this.field_db.field_K = false;
    }

    final static void a(int param0, ah param1) {
        ag var2 = null;
        wf discarded$0 = null;
        try {
            ag.a(param1.a("headers.packvorbis", "", true));
            if (param0 < 80) {
                ug.f(true);
            }
            var2 = ag.a(param1, "jagex logo2.packvorbis", "");
            discarded$0 = var2.b();
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "ug.U(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static hm a(long param0, String param1, boolean param2, String param3, int param4) {
        RuntimeException var6 = null;
        gg stackIn_3_0 = null;
        gl stackIn_7_0 = null;
        hm stackIn_10_0 = null;
        ka stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        gg stackOut_2_0 = null;
        gl stackOut_6_0 = null;
        ka stackOut_11_0 = null;
        hm stackOut_9_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              if (0L != param0) {
                break L1;
              } else {
                if (param1 == null) {
                  break L1;
                } else {
                  stackOut_2_0 = new gg(param1, param3);
                  stackIn_3_0 = stackOut_2_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            if (param2) {
              stackOut_6_0 = new gl(param0, param3);
              stackIn_7_0 = stackOut_6_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              if (param4 == -6336) {
                stackOut_11_0 = new ka(param0, param3);
                stackIn_12_0 = stackOut_11_0;
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                stackOut_9_0 = (hm) null;
                stackIn_10_0 = stackOut_9_0;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var6);
            stackOut_13_1 = new StringBuilder().append("ug.Q(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L2;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L2;
            }
          }
          L3: {
            stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param2).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param3 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L3;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L3;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (hm) ((Object) stackIn_3_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (hm) ((Object) stackIn_7_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              return (hm) ((Object) stackIn_12_0);
            }
          }
        }
    }

    final void b(int param0, int param1, int param2) {
        int discarded$1 = 0;
        super.b(param0, 82, param2);
        ab.field_V.a(this.field_fb, (this.field_F >> -993460511) + param2, 103 + param0, 16777215, -1);
        if (param1 < 66) {
          return;
        } else {
          L0: {
            if (null != this.field_Y) {
              ra.g(20 + param2, param0 + 113, 260, 8421504);
              discarded$1 = ab.field_V.a(this.field_Y, param2 + 20, 8 + (param0 - -120), 260, 100, 16777215, -1, 1, 0, ab.field_V.field_N);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        }
    }

    static {
        field_eb = -1;
        field_X = "Members";
        field_bb = new int[1024];
        field_cb = new jk();
    }
}
