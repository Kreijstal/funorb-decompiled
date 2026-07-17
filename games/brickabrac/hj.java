/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class hj extends mh {
    mh field_Wb;
    static th field_Sb;
    mm field_Qb;
    mh field_Xb;
    mh field_Tb;
    static int field_Pb;
    static String field_Rb;
    static String field_Ub;
    static int field_Yb;
    static String field_Vb;

    final static jp[] a(int param0, byte param1, int param2, int param3, int param4) {
        jp[] var6 = new jp[9];
        jp[] var5 = var6;
        jp dupTemp$0 = hd.a(param2, 1, (byte) -6);
        var6[6] = dupTemp$0;
        var5[3] = dupTemp$0;
        var5[2] = dupTemp$0;
        var5[1] = dupTemp$0;
        var5[0] = dupTemp$0;
        jp dupTemp$1 = hd.a(param4, 1, (byte) -6);
        var6[8] = dupTemp$1;
        var5[7] = dupTemp$1;
        var5[5] = dupTemp$1;
        if (!(param3 == 0)) {
            var6[4] = hd.a(param3, 64, (byte) -6);
        }
        return var5;
    }

    final static void a(int param0, gb param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        nn var5 = null;
        String var6 = null;
        nn var7 = null;
        String var8 = null;
        nn var9 = null;
        String var10 = null;
        nn var11 = null;
        String var12 = null;
        nn var13 = null;
        int stackIn_1_0 = 0;
        mh stackIn_1_1 = null;
        Object stackIn_1_2 = null;
        Object stackIn_1_3 = null;
        String stackIn_1_4 = null;
        int stackIn_2_0 = 0;
        mh stackIn_2_1 = null;
        Object stackIn_2_2 = null;
        Object stackIn_2_3 = null;
        String stackIn_2_4 = null;
        int stackIn_3_0 = 0;
        mh stackIn_3_1 = null;
        Object stackIn_3_2 = null;
        Object stackIn_3_3 = null;
        String stackIn_3_4 = null;
        int stackIn_3_5 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        mh stackOut_0_1 = null;
        Object stackOut_0_2 = null;
        Object stackOut_0_3 = null;
        String stackOut_0_4 = null;
        int stackOut_2_0 = 0;
        mh stackOut_2_1 = null;
        Object stackOut_2_2 = null;
        Object stackOut_2_3 = null;
        String stackOut_2_4 = null;
        int stackOut_2_5 = 0;
        int stackOut_1_0 = 0;
        mh stackOut_1_1 = null;
        Object stackOut_1_2 = null;
        Object stackOut_1_3 = null;
        String stackOut_1_4 = null;
        int stackOut_1_5 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        try {
          L0: {
            L1: {
              stackOut_0_0 = param1.field_c;
              stackOut_0_1 = param1.field_b;
              stackOut_0_2 = null;
              stackOut_0_3 = null;
              stackOut_0_4 = param1.field_m;
              stackIn_2_0 = stackOut_0_0;
              stackIn_2_1 = stackOut_0_1;
              stackIn_2_2 = stackOut_0_2;
              stackIn_2_3 = stackOut_0_3;
              stackIn_2_4 = stackOut_0_4;
              stackIn_1_0 = stackOut_0_0;
              stackIn_1_1 = stackOut_0_1;
              stackIn_1_2 = stackOut_0_2;
              stackIn_1_3 = stackOut_0_3;
              stackIn_1_4 = stackOut_0_4;
              if (param1.field_c == 1) {
                stackOut_2_0 = stackIn_2_0;
                stackOut_2_1 = (mh) (Object) stackIn_2_1;
                stackOut_2_2 = stackIn_2_2;
                stackOut_2_3 = stackIn_2_3;
                stackOut_2_4 = (String) (Object) stackIn_2_4;
                stackOut_2_5 = param1.field_o;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                stackIn_3_2 = stackOut_2_2;
                stackIn_3_3 = stackOut_2_3;
                stackIn_3_4 = stackOut_2_4;
                stackIn_3_5 = stackOut_2_5;
                break L1;
              } else {
                stackOut_1_0 = stackIn_1_0;
                stackOut_1_1 = (mh) (Object) stackIn_1_1;
                stackOut_1_2 = stackIn_1_2;
                stackOut_1_3 = stackIn_1_3;
                stackOut_1_4 = (String) (Object) stackIn_1_4;
                stackOut_1_5 = 0;
                stackIn_3_0 = stackOut_1_0;
                stackIn_3_1 = stackOut_1_1;
                stackIn_3_2 = stackOut_1_2;
                stackIn_3_3 = stackOut_1_3;
                stackIn_3_4 = stackOut_1_4;
                stackIn_3_5 = stackOut_1_5;
                break L1;
              }
            }
            L2: {
              mn.a(stackIn_3_0, stackIn_3_1, (mm) (Object) stackIn_3_2, (int[]) (Object) stackIn_3_3, stackIn_3_4, stackIn_3_5, (byte) -58, param1.field_k, param1.field_q);
              if (param1.field_c != 0) {
                break L2;
              } else {
                if (cb.e(-91)) {
                  break L2;
                } else {
                  if (null != o.field_e) {
                    break L2;
                  } else {
                    if (nl.field_f != null) {
                      break L2;
                    } else {
                      L3: {
                        if (qo.field_I) {
                          break L3;
                        } else {
                          var5 = bm.field_d;
                          var6 = ol.field_x;
                          var5.field_d.a(var6, 14, (byte) 84);
                          break L3;
                        }
                      }
                      var7 = bm.field_d;
                      var8 = tq.field_b;
                      var7.field_d.a(var8, 20, (byte) 118);
                      break L2;
                    }
                  }
                }
              }
            }
            L4: {
              if (param1.field_c != 1) {
                break L4;
              } else {
                if (cb.e(-128)) {
                  break L4;
                } else {
                  if (null == o.field_e) {
                    break L4;
                  } else {
                    if (param1.field_o != o.field_e.e((byte) 118)) {
                      break L4;
                    } else {
                      L5: {
                        if (!qo.field_I) {
                          var9 = bm.field_d;
                          var10 = hc.field_b;
                          var9.field_d.a(var10, 14, (byte) 120);
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      var11 = bm.field_d;
                      var12 = gn.field_y;
                      var11.field_d.a(var12, 20, (byte) 103);
                      break L4;
                    }
                  }
                }
              }
            }
            bm.field_d.a(true);
            bm.field_d.a(true, false);
            bm.field_d.a(param1.field_g, (byte) -79, param1.field_c);
            bm.field_d.a((byte) -126);
            bm.field_d.a(param1, -96);
            var13 = bm.field_d;
            var3 = tb.field_fb;
            var4 = qo.field_O;
            var13.field_d.a(var4, -101, 0, 0, var3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var2;
            stackOut_20_1 = new StringBuilder().append("hj.E(").append(0).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L6;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L6;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 41);
        }
    }

    hj(long param0, mh param1, mh param2, fj param3, mh param4, String param5, String param6) {
        super(param0, param1);
        try {
            ((hj) this).field_Xb = new mh(0L, (mh) null);
            ((hj) this).field_Qb = new mm(0L, ((hj) this).field_Xb, param2, param3);
            ((hj) this).field_Tb = new mh(0L, param4);
            ((hj) this).field_Wb = new mh(0L, param4);
            ((hj) this).field_Tb.field_Mb = param5;
            ((hj) this).field_Wb.field_Mb = param6;
            ((hj) this).a((mh) (Object) ((hj) this).field_Qb, 0);
            ((hj) this).a(((hj) this).field_Tb, 0);
            ((hj) this).a(((hj) this).field_Wb, 0);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "hj.<init>(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 44 + (param3 != null ? "{...}" : "null") + 44 + (param4 != null ? "{...}" : "null") + 44 + (param5 != null ? "{...}" : "null") + 44 + (param6 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(boolean param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        if (!param0) {
            return;
        }
        ((hj) this).field_Ib = param2;
        ((hj) this).field_cb = param7;
        ((hj) this).field_P = param3;
        ((hj) this).field_zb = param4;
        ((hj) this).a(param6, -779, param5, param1);
    }

    public static void h() {
        field_Ub = null;
        field_Sb = null;
        field_Vb = null;
        field_Rb = null;
    }

    final static void b() {
        nm var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        ln var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            var4 = (ln) (Object) ie.field_v.d(-28);
            L1: while (true) {
              if (var4 == null) {
                var2 = uc.field_q.d(-54);
                L2: while (true) {
                  if (var2 == null) {
                    break L0;
                  } else {
                    int discarded$8 = 92;
                    int discarded$9 = 6;
                    bd.a();
                    var2 = uc.field_q.a((byte) 116);
                    continue L2;
                  }
                }
              } else {
                gn.a(6, 125, var4);
                var4 = (ln) (Object) ie.field_v.a((byte) 116);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var2_ref, "hj.D(" + 6 + 44 + 0 + 41);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, String param4) {
        try {
            lb.a(param0, -param2 + param1, param3, param2, 3, 0, 196);
            lb.c(param0, -param2 + param1, param3, param2, 3, 16777215);
            ob.field_D.c(param4, pq.field_k, -1 + (-ob.field_D.field_P + po.field_a + -ob.field_D.field_P), 2, -1);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "hj.F(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 44 + 16777215 + 41);
        }
    }

    final static int a(int param0, byte[] param1, byte param2, int param3, CharSequence param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_68_0 = 0;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_72_2 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_75_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_67_0 = 0;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        var9 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            var6_int = param0;
            var7 = 0;
            L1: while (true) {
              if (var7 >= var6_int) {
                stackOut_67_0 = var6_int;
                stackIn_68_0 = stackOut_67_0;
                break L0;
              } else {
                L2: {
                  L3: {
                    L4: {
                      var8 = param4.charAt(var7);
                      if (var8 <= 0) {
                        break L4;
                      } else {
                        if (var8 < 128) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if (160 > var8) {
                        break L5;
                      } else {
                        if (var8 <= 255) {
                          break L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                    if (var8 != 8364) {
                      if (var8 != 8218) {
                        if (var8 != 402) {
                          if (var8 != 8222) {
                            if (var8 == 8230) {
                              param1[param3 - -var7] = (byte) -123;
                              break L2;
                            } else {
                              if (8224 == var8) {
                                param1[var7 + param3] = (byte) -122;
                                break L2;
                              } else {
                                if (var8 == 8225) {
                                  param1[param3 + var7] = (byte) -121;
                                  break L2;
                                } else {
                                  if (var8 != 710) {
                                    if (var8 != 8240) {
                                      if (var8 == 352) {
                                        param1[param3 - -var7] = (byte) -118;
                                        break L2;
                                      } else {
                                        if (var8 != 8249) {
                                          if (var8 == 338) {
                                            param1[param3 - -var7] = (byte) -116;
                                            break L2;
                                          } else {
                                            if (var8 == 381) {
                                              param1[var7 + param3] = (byte) -114;
                                              break L2;
                                            } else {
                                              if (var8 == 8216) {
                                                param1[param3 - -var7] = (byte) -111;
                                                break L2;
                                              } else {
                                                if (var8 == 8217) {
                                                  param1[var7 + param3] = (byte) -110;
                                                  break L2;
                                                } else {
                                                  if (var8 != 8220) {
                                                    if (8221 != var8) {
                                                      if (var8 == 8226) {
                                                        param1[var7 + param3] = (byte) -107;
                                                        break L2;
                                                      } else {
                                                        if (var8 != 8211) {
                                                          if (var8 != 8212) {
                                                            if (var8 != 732) {
                                                              if (var8 == 8482) {
                                                                param1[var7 + param3] = (byte) -103;
                                                                break L2;
                                                              } else {
                                                                if (353 != var8) {
                                                                  if (8250 != var8) {
                                                                    if (var8 == 339) {
                                                                      param1[var7 + param3] = (byte) -100;
                                                                      break L2;
                                                                    } else {
                                                                      if (var8 == 382) {
                                                                        param1[param3 + var7] = (byte) -98;
                                                                        break L2;
                                                                      } else {
                                                                        if (376 != var8) {
                                                                          param1[var7 + param3] = (byte) 63;
                                                                          break L2;
                                                                        } else {
                                                                          param1[param3 + var7] = (byte) -97;
                                                                          break L2;
                                                                        }
                                                                      }
                                                                    }
                                                                  } else {
                                                                    param1[param3 - -var7] = (byte) -101;
                                                                    break L2;
                                                                  }
                                                                } else {
                                                                  param1[var7 + param3] = (byte) -102;
                                                                  break L2;
                                                                }
                                                              }
                                                            } else {
                                                              param1[param3 + var7] = (byte) -104;
                                                              break L2;
                                                            }
                                                          } else {
                                                            param1[param3 - -var7] = (byte) -105;
                                                            break L2;
                                                          }
                                                        } else {
                                                          param1[param3 + var7] = (byte) -106;
                                                          break L2;
                                                        }
                                                      }
                                                    } else {
                                                      param1[var7 + param3] = (byte) -108;
                                                      break L2;
                                                    }
                                                  } else {
                                                    param1[var7 + param3] = (byte) -109;
                                                    break L2;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        } else {
                                          param1[param3 + var7] = (byte) -117;
                                          break L2;
                                        }
                                      }
                                    } else {
                                      param1[param3 - -var7] = (byte) -119;
                                      break L2;
                                    }
                                  } else {
                                    param1[var7 + param3] = (byte) -120;
                                    break L2;
                                  }
                                }
                              }
                            }
                          } else {
                            param1[var7 + param3] = (byte) -124;
                            break L2;
                          }
                        } else {
                          param1[param3 + var7] = (byte) -125;
                          break L2;
                        }
                      } else {
                        param1[param3 + var7] = (byte) -126;
                        break L2;
                      }
                    } else {
                      param1[var7 + param3] = (byte) -128;
                      break L2;
                    }
                  }
                  param1[var7 + param3] = (byte)var8;
                  break L2;
                }
                var7++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_69_0 = (RuntimeException) var6;
            stackOut_69_1 = new StringBuilder().append("hj.C(").append(param0).append(44);
            stackIn_71_0 = stackOut_69_0;
            stackIn_71_1 = stackOut_69_1;
            stackIn_70_0 = stackOut_69_0;
            stackIn_70_1 = stackOut_69_1;
            if (param1 == null) {
              stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
              stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
              stackOut_71_2 = "null";
              stackIn_72_0 = stackOut_71_0;
              stackIn_72_1 = stackOut_71_1;
              stackIn_72_2 = stackOut_71_2;
              break L6;
            } else {
              stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
              stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
              stackOut_70_2 = "{...}";
              stackIn_72_0 = stackOut_70_0;
              stackIn_72_1 = stackOut_70_1;
              stackIn_72_2 = stackOut_70_2;
              break L6;
            }
          }
          L7: {
            stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
            stackOut_72_1 = ((StringBuilder) (Object) stackIn_72_1).append(stackIn_72_2).append(44).append(86).append(44).append(param3).append(44);
            stackIn_74_0 = stackOut_72_0;
            stackIn_74_1 = stackOut_72_1;
            stackIn_73_0 = stackOut_72_0;
            stackIn_73_1 = stackOut_72_1;
            if (param4 == null) {
              stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
              stackOut_74_1 = (StringBuilder) (Object) stackIn_74_1;
              stackOut_74_2 = "null";
              stackIn_75_0 = stackOut_74_0;
              stackIn_75_1 = stackOut_74_1;
              stackIn_75_2 = stackOut_74_2;
              break L7;
            } else {
              stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
              stackOut_73_1 = (StringBuilder) (Object) stackIn_73_1;
              stackOut_73_2 = "{...}";
              stackIn_75_0 = stackOut_73_0;
              stackIn_75_1 = stackOut_73_1;
              stackIn_75_2 = stackOut_73_2;
              break L7;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_75_0, stackIn_75_2 + 44 + 0 + 41);
        }
        return stackIn_68_0;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        var13 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = param4 + param1;
              if (param2 >= 114) {
                break L1;
              } else {
                field_Ub = null;
                break L1;
              }
            }
            L2: {
              var6 = param0 + param3;
              if (lb.field_i >= param1) {
                stackOut_5_0 = lb.field_i;
                stackIn_6_0 = stackOut_5_0;
                break L2;
              } else {
                stackOut_4_0 = param1;
                stackIn_6_0 = stackOut_4_0;
                break L2;
              }
            }
            L3: {
              var7 = stackIn_6_0;
              if (lb.field_b < param0) {
                stackOut_8_0 = param0;
                stackIn_9_0 = stackOut_8_0;
                break L3;
              } else {
                stackOut_7_0 = lb.field_b;
                stackIn_9_0 = stackOut_7_0;
                break L3;
              }
            }
            L4: {
              var8 = stackIn_9_0;
              if (lb.field_f > var5_int) {
                stackOut_11_0 = var5_int;
                stackIn_12_0 = stackOut_11_0;
                break L4;
              } else {
                stackOut_10_0 = lb.field_f;
                stackIn_12_0 = stackOut_10_0;
                break L4;
              }
            }
            L5: {
              var9 = stackIn_12_0;
              if (lb.field_j <= var6) {
                stackOut_14_0 = lb.field_j;
                stackIn_15_0 = stackOut_14_0;
                break L5;
              } else {
                stackOut_13_0 = var6;
                stackIn_15_0 = stackOut_13_0;
                break L5;
              }
            }
            L6: {
              var10 = stackIn_15_0;
              if (lb.field_i > param1) {
                break L6;
              } else {
                if (param1 < lb.field_f) {
                  var11 = var8 * lb.field_c + param1;
                  var12 = -var8 + 1 + var10 >> 1;
                  L7: while (true) {
                    var12--;
                    if (var12 < 0) {
                      break L6;
                    } else {
                      lb.field_l[var11] = 16777215;
                      var11 = var11 + 2 * lb.field_c;
                      continue L7;
                    }
                  }
                } else {
                  break L6;
                }
              }
            }
            L8: {
              if (param0 < lb.field_b) {
                break L8;
              } else {
                if (lb.field_j > var6) {
                  var11 = var7 + param0 * lb.field_c;
                  var12 = -var7 + 1 + var9 >> 1;
                  L9: while (true) {
                    var12--;
                    if (0 > var12) {
                      break L8;
                    } else {
                      lb.field_l[var11] = 16777215;
                      var11 += 2;
                      continue L9;
                    }
                  }
                } else {
                  break L8;
                }
              }
            }
            L10: {
              if (lb.field_i > var5_int) {
                break L10;
              } else {
                if (lb.field_f > var5_int) {
                  var11 = var5_int + ((1 & -param1 + var5_int) + var8) * lb.field_c;
                  var12 = -var8 + (1 - -var10) >> 1;
                  L11: while (true) {
                    var12--;
                    if (0 > var12) {
                      break L10;
                    } else {
                      lb.field_l[var11] = 16777215;
                      var11 = var11 + lb.field_c * 2;
                      continue L11;
                    }
                  }
                } else {
                  break L10;
                }
              }
            }
            L12: {
              if (lb.field_b > param0) {
                break L12;
              } else {
                if (lb.field_j > var6) {
                  var11 = (var6 - param0 & 1) + (var7 + var6 * lb.field_c);
                  var12 = 1 + var9 - var7 >> 1;
                  L13: while (true) {
                    var12--;
                    if (var12 < 0) {
                      break L12;
                    } else {
                      lb.field_l[var11] = 16777215;
                      var11 += 2;
                      continue L13;
                    }
                  }
                } else {
                  break L12;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var5, "hj.H(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = (param3 + ((hj) this).field_Ib) / 2;
        int var6 = -param0 + ((hj) this).field_cb;
        ((hj) this).field_Qb.a(param3, (byte) -111, ((hj) this).field_Ib, 0, 0, param2, var6 + -param3);
        ((hj) this).field_Tb.field_cb = param0;
        ((hj) this).field_Tb.field_P = 0;
        ((hj) this).field_Tb.field_Ib = -param3 + var5;
        ((hj) this).field_Tb.field_zb = var6;
        ((hj) this).field_Wb.field_zb = var6;
        ((hj) this).field_Wb.field_Ib = -var5 + ((hj) this).field_Ib;
        ((hj) this).field_Wb.field_P = var5;
        ((hj) this).field_Wb.field_cb = param0;
        if (param1 != -779) {
            ((hj) this).field_Tb = null;
        }
    }

    hj(long param0, hj param1, String param2, String param3) {
        this(param0, (mh) (Object) param1, param1.field_Qb.field_Qb, param1.field_Qb.field_Ub, param1.field_Tb, param2, param3);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Pb = 0;
        field_Sb = new th(11, 0, 1, 2);
        field_Rb = "Invalid date";
        field_Yb = 20;
        field_Ub = "Unable to delete friend - system busy";
        field_Vb = "Lost";
    }
}
