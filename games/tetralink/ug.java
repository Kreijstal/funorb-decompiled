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
        int var3 = 0;
        String var4_ref_String = null;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object var12 = null;
        Object var13 = null;
        Object var14 = null;
        Object var15 = null;
        String var16 = null;
        String var17 = null;
        String var18 = null;
        String var19 = null;
        Object var20 = null;
        CharSequence var21 = null;
        var20 = null;
        var11 = TetraLink.field_J;
        var3 = 1;
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
          if (sf.field_d != 2) {
            break L2;
          } else {
            int discarded$8 = 1;
            if (k.a()) {
              break L2;
            } else {
              var3 = 0;
              break L2;
            }
          }
        }
        if (dg.field_e == 84) {
          L3: {
            if (var3 == 0) {
              if (sf.field_d == 0) {
                break L3;
              } else {
                hi.b(-113);
                break L3;
              }
            } else {
              L4: {
                if (io.field_h.length() > 0) {
                  var4_ref_String = io.field_h.toString();
                  int discarded$9 = 65416;
                  if (oa.a(var4_ref_String)) {
                    var13 = null;
                    var12 = null;
                    fi.a(0, 0, (String) null, 2, kj.field_c, (String) null);
                    var15 = null;
                    var14 = null;
                    fi.a(0, 0, (String) null, 2, sa.field_a, (String) null);
                    break L4;
                  } else {
                    L5: {
                      var5 = sf.field_d;
                      if (var5 != 0) {
                        break L5;
                      } else {
                        if (qb.field_N == null) {
                          break L5;
                        } else {
                          var5 = 1;
                          break L5;
                        }
                      }
                    }
                    L6: {
                      if (fh.a((byte) 79, var5) != 2) {
                        break L6;
                      } else {
                        vj.a(var5, param2, 1, 127);
                        break L6;
                      }
                    }
                    eo.a(-3, -1, param1, ka.field_m, sf.field_d, var4_ref_String);
                    break L4;
                  }
                } else {
                  break L4;
                }
              }
              hi.b(-82);
              break L3;
            }
          }
          return true;
        } else {
          if (dg.field_e != 85) {
            var4 = tb.field_m;
            if (!id.a(false, (char) var4)) {
              return false;
            } else {
              L7: {
                if (var3 == 0) {
                  break L7;
                } else {
                  if (io.field_h.length() < 80) {
                    L8: {
                      StringBuilder discarded$10 = io.field_h.append(var4);
                      var5 = 485;
                      var6 = ph.field_w;
                      var7 = var6;
                      var7 = var6;
                      var16 = rh.a(var6, -93);
                      var7 = var16;
                      var7 = var16;
                      var18 = var16;
                      var7 = var18;
                      var7 = var18;
                      if (sf.field_d != 2) {
                        L9: {
                          var7 = "";
                          if (sf.field_d == 0) {
                            L10: {
                              if (qb.field_N != null) {
                                break L10;
                              } else {
                                if (go.field_c) {
                                  var7 = "[" + nm.field_v + "] ";
                                  break L10;
                                } else {
                                  break L10;
                                }
                              }
                            }
                            if (null == qb.field_N) {
                              break L9;
                            } else {
                              L11: {
                                if (!nh.field_Sb) {
                                  break L11;
                                } else {
                                  if (null == ec.field_h) {
                                    break L11;
                                  } else {
                                    var7 = "[" + ec.field_h + "] ";
                                    break L9;
                                  }
                                }
                              }
                              var7 = "[" + sk.a(new String[1], qe.field_e, 120) + "] ";
                              break L9;
                            }
                          } else {
                            break L9;
                          }
                        }
                        var19 = var7 + var18 + ": ";
                        var5 = var5 - we.field_k.b(var19);
                        break L8;
                      } else {
                        var21 = (CharSequence) (Object) ka.field_m;
                        int discarded$11 = 43;
                        var17 = sk.a(new String[1], vd.field_b, 126);
                        var7 = var17;
                        var7 = var17;
                        var8 = sk.a(new String[1], mc.field_h, 127);
                        var7 = var8;
                        var7 = var8;
                        var9 = we.field_k.b(var17);
                        var10 = we.field_k.b(var8);
                        if (var9 > var10) {
                          var5 = var5 - var9;
                          break L8;
                        } else {
                          var5 = var5 - var10;
                          break L8;
                        }
                      }
                    }
                    if (we.field_k.b(io.field_h.toString()) > var5) {
                      int discarded$12 = 32;
                      StringBuilder discarded$13 = lo.a(-26750, io.field_h, io.field_h.length() - 1);
                      break L7;
                    } else {
                      break L7;
                    }
                  } else {
                    break L7;
                  }
                }
              }
              return true;
            }
          } else {
            L12: {
              if (var3 == 0) {
                break L12;
              } else {
                if (io.field_h.length() > 0) {
                  int discarded$14 = 32;
                  StringBuilder discarded$15 = lo.a(-26750, io.field_h, -1 + io.field_h.length());
                  break L12;
                } else {
                  return true;
                }
              }
            }
            return true;
          }
        }
    }

    ug(pk param0, String param1) {
        super(param0, 300, 120);
        RuntimeException runtimeException = null;
        int var3_int = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              ((ug) this).field_Y = param1;
              if (((ug) this).field_Y != null) {
                var3_int = ab.field_V.b(((ug) this).field_Y, 260, ab.field_V.field_N);
                ((ug) this).a(300, (byte) 122, var3_int + 150);
                break L1;
              } else {
                break L1;
              }
            }
            ((ug) this).field_db = new lg(13, 50, 274, 30, 15, 2113632, 4210752);
            ((ug) this).field_Z = false;
            ((ug) this).field_gb = false;
            ((ug) this).field_db.field_K = true;
            ((ug) this).c((na) (Object) ((ug) this).field_db, 10);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) runtimeException;
            stackOut_6_1 = new StringBuilder().append("ug.<init>(");
            stackIn_9_0 = stackOut_6_0;
            stackIn_9_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_10_0 = stackOut_7_0;
              stackIn_10_1 = stackOut_7_1;
              stackIn_10_2 = stackOut_7_2;
              break L2;
            }
          }
          L3: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44);
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L3;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int stackIn_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
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
        L1: {
          if (param2 >= ai.field_h) {
            break L1;
          } else {
            mh.field_d = param2;
            break L1;
          }
        }
        ac.field_b[nd.field_Mb] = param1;
        ai.field_g[nd.field_Mb] = param5;
        gl.field_n[nd.field_Mb] = param0;
        L2: {
          var6 = param0 + param5 + param1;
          if (var6 != 0) {
            stackOut_11_0 = 1000 * param1 / var6;
            stackIn_12_0 = stackOut_11_0;
            break L2;
          } else {
            stackOut_9_0 = 0;
            stackIn_12_0 = stackOut_9_0;
            break L2;
          }
        }
        L3: {
          var7 = stackIn_12_0;
          fe.field_b[nd.field_Mb] = var7;
          nd.field_Mb = nd.field_Mb + 1;
          if (mh.field_d > var7) {
            mh.field_d = var7;
            break L3;
          } else {
            break L3;
          }
        }
        if (var7 > va.field_z) {
          va.field_z = var7;
          return;
        } else {
          return;
        }
    }

    final static boolean o(int param0) {
        int var1 = 95 / ((param0 - -24) / 43);
        return bh.field_r;
    }

    public static void f(boolean param0) {
        field_ab = null;
        field_bb = null;
        field_X = null;
        if (param0) {
            Object var2 = null;
            hm discarded$0 = ug.a(-50L, (String) null, false, (String) null, 121);
        }
        field_ib = null;
        field_hb = null;
        field_cb = null;
    }

    final static oh a(ah param0, byte param1, String param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        oh stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        oh stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            var4_int = param0.a(-1, param3);
            var5 = param0.a(var4_int, false, param2);
            stackOut_2_0 = sj.a(-2, param0, var4_int, var5);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("ug.R(");
            stackIn_7_0 = stackOut_4_0;
            stackIn_7_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_8_0 = stackOut_5_0;
              stackIn_8_1 = stackOut_5_1;
              stackIn_8_2 = stackOut_5_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44).append(-45).append(44);
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L2;
            }
          }
          L3: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(44);
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param3 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_16_2 = stackOut_13_2;
              break L3;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
        return stackIn_3_0;
    }

    final void a(String param0, byte param1, float param2, boolean param3) {
        RuntimeException var5 = null;
        Object var6 = null;
        boolean stackIn_1_0 = false;
        boolean stackIn_3_0 = false;
        boolean stackIn_4_0 = false;
        int stackIn_4_1 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_0_0 = false;
        boolean stackOut_3_0 = false;
        int stackOut_3_1 = 0;
        boolean stackOut_1_0 = false;
        int stackOut_1_1 = 0;
        Object stackOut_6_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            L1: {
              stackOut_0_0 = ((ug) this).field_Z;
              stackIn_3_0 = stackOut_0_0;
              stackIn_1_0 = stackOut_0_0;
              if (param3) {
                stackOut_3_0 = stackIn_3_0;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_1_0 = stackIn_1_0;
                stackOut_1_1 = 1;
                stackIn_4_0 = stackOut_1_0;
                stackIn_4_1 = stackOut_1_1;
                break L1;
              }
            }
            L2: {
              if ((stackIn_4_0 ? 1 : 0) == stackIn_4_1) {
                L3: {
                  stackOut_6_0 = this;
                  stackIn_8_0 = stackOut_6_0;
                  stackIn_7_0 = stackOut_6_0;
                  if (!param3) {
                    stackOut_8_0 = this;
                    stackOut_8_1 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    stackIn_9_1 = stackOut_8_1;
                    break L3;
                  } else {
                    stackOut_7_0 = this;
                    stackOut_7_1 = 1;
                    stackIn_9_0 = stackOut_7_0;
                    stackIn_9_1 = stackOut_7_1;
                    break L3;
                  }
                }
                ((ug) this).field_Z = stackIn_9_1 != 0;
                if (((ug) this).field_Z) {
                  ((ug) this).field_db.b(119, 8405024, 4210752);
                  ((ug) this).field_db.field_K = true;
                  break L2;
                } else {
                  ((ug) this).field_db.b(-86, 2113632, 4210752);
                  if (!((ug) this).field_gb) {
                    break L2;
                  } else {
                    ((ug) this).field_db.field_K = false;
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
                var6 = null;
                ug.a(104, (ah) null);
                break L4;
              }
            }
            ((ug) this).field_db.field_bb = (int)(param2 / 100.0f * 65536.0f);
            ((ug) this).field_fb = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var5;
            stackOut_18_1 = new StringBuilder().append("ug.O(");
            stackIn_21_0 = stackOut_18_0;
            stackIn_21_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L5;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_22_0 = stackOut_19_0;
              stackIn_22_1 = stackOut_19_1;
              stackIn_22_2 = stackOut_19_2;
              break L5;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final void e(boolean param0) {
        ((ug) this).field_gb = param0 ? true : false;
        ((ug) this).field_db.field_K = false;
    }

    final static void a(int param0, ah param1) {
        RuntimeException runtimeException = null;
        ag var2 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              ag.a(param1.a("headers.packvorbis", "", true));
              if (param0 >= 80) {
                break L1;
              } else {
                ug.f(true);
                break L1;
              }
            }
            var2 = ag.a(param1, "jagex logo2.packvorbis", "");
            wf discarded$3 = var2.b();
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) runtimeException;
            stackOut_4_1 = new StringBuilder().append("ug.U(").append(param0).append(44);
            stackIn_7_0 = stackOut_4_0;
            stackIn_7_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_8_0 = stackOut_5_0;
              stackIn_8_1 = stackOut_5_1;
              stackIn_8_2 = stackOut_5_2;
              break L2;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
    }

    final static hm a(long param0, String param1, boolean param2, String param3, int param4) {
        RuntimeException var6 = null;
        gg stackIn_3_0 = null;
        Object stackIn_9_0 = null;
        ka stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        gg stackOut_2_0 = null;
        ka stackOut_10_0 = null;
        Object stackOut_8_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              if (0L != param0) {
                break L1;
              } else {
                if (null == param1) {
                  break L1;
                } else {
                  stackOut_2_0 = new gg(param1, param3);
                  stackIn_3_0 = stackOut_2_0;
                  return (hm) (Object) stackIn_3_0;
                }
              }
            }
            if (param4 == -6336) {
              stackOut_10_0 = new ka(param0, param3);
              stackIn_11_0 = stackOut_10_0;
              break L0;
            } else {
              stackOut_8_0 = null;
              stackIn_9_0 = stackOut_8_0;
              return (hm) (Object) stackIn_9_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var6;
            stackOut_12_1 = new StringBuilder().append("ug.Q(").append(param0).append(44);
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L2;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_16_2 = stackOut_13_2;
              break L2;
            }
          }
          L3: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44).append(0).append(44);
            stackIn_19_0 = stackOut_16_0;
            stackIn_19_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param3 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L3;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_20_0 = stackOut_17_0;
              stackIn_20_1 = stackOut_17_1;
              stackIn_20_2 = stackOut_17_2;
              break L3;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 44 + param4 + 41);
        }
        return (hm) (Object) stackIn_11_0;
    }

    final void b(int param0, int param1, int param2) {
        super.b(param0, 82, param2);
        ab.field_V.a(((ug) this).field_fb, (((ug) this).field_F >> 1) + param2, 103 + param0, 16777215, -1);
        if (param1 >= 66) {
          L0: {
            if (null != ((ug) this).field_Y) {
              ra.g(20 + param2, param0 + 113, 260, 8421504);
              int discarded$1 = ab.field_V.a(((ug) this).field_Y, param2 + 20, 8 + (param0 - -120), 260, 100, 16777215, -1, 1, 0, ab.field_V.field_N);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_eb = -1;
        field_X = "Members";
        field_bb = new int[1024];
        field_cb = new jk();
    }
}
