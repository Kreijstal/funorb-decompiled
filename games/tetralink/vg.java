/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vg extends hl {
    static String field_Pb;
    private hl field_Rb;
    private hl field_Sb;
    static int field_Lb;
    static tb field_Vb;
    static long[][] field_Ub;
    static long[] field_Ob;
    private StringBuilder field_Tb;
    static String field_Kb;
    private int field_Qb;
    static String field_Mb;
    static String field_Nb;

    final int a(boolean param0, byte param1) {
        int var4 = 0;
        L0: {
          var4 = TetraLink.field_J;
          ((vg) this).a(0, param0);
          if (!param0) {
            break L0;
          } else {
            L1: while (true) {
              if (!nj.b((byte) 28)) {
                break L0;
              } else {
                L2: {
                  if (dg.field_e != 85) {
                    break L2;
                  } else {
                    if (((vg) this).field_Tb.length() > 0) {
                      StringBuilder discarded$26 = lo.a(-26750, ((vg) this).field_Tb, ((vg) this).field_Tb.length() - 1, ' ');
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  L4: {
                    if (lk.a(tb.field_m, -1, (CharSequence) (Object) ((vg) this).field_Tb)) {
                      break L4;
                    } else {
                      L5: {
                        if (((vg) this).field_Tb.length() != 0) {
                          break L5;
                        } else {
                          if (tb.field_m == 91) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      L6: {
                        if (((vg) this).field_Tb.length() != 1) {
                          break L6;
                        } else {
                          if (tb.field_m == 35) {
                            break L4;
                          } else {
                            break L6;
                          }
                        }
                      }
                      if (93 == tb.field_m) {
                        break L4;
                      } else {
                        break L3;
                      }
                    }
                  }
                  StringBuilder discarded$27 = ((vg) this).field_Tb.append(tb.field_m);
                  break L3;
                }
                if (dg.field_e != 84) {
                  if (13 == dg.field_e) {
                    return 1;
                  } else {
                    continue L1;
                  }
                } else {
                  if (((vg) this).field_Tb.length() <= 0) {
                    return 1;
                  } else {
                    ((vg) this).field_jb = ((vg) this).field_Tb.toString();
                    return 2;
                  }
                }
              }
            }
          }
        }
        if (param1 == 58) {
          L7: {
            ((vg) this).field_Rb.field_jb = ((vg) this).field_Tb.toString();
            if (!param0) {
              break L7;
            } else {
              if (tm.field_t == 0) {
                break L7;
              } else {
                if (((vg) this).field_F != 0) {
                  break L7;
                } else {
                  ((vg) this).field_Qb = 1;
                  break L7;
                }
              }
            }
          }
          return ((vg) this).field_Qb;
        } else {
          return -78;
        }
    }

    final static void i(int param0) {
        of.b(true);
        t.a(4, 0);
    }

    public static void e(byte param0) {
        field_Nb = null;
        field_Vb = null;
        field_Kb = null;
        field_Ob = null;
        field_Ub = null;
        field_Pb = null;
        field_Mb = null;
    }

    final boolean h(int param0) {
        int var2 = 0;
        if (((vg) this).field_Qb != 0) {
          return false;
        } else {
          L0: {
            if (param0 == 0) {
              break L0;
            } else {
              field_Mb = null;
              break L0;
            }
          }
          L1: {
            if (dg.field_e != 85) {
              break L1;
            } else {
              if (0 < ((vg) this).field_Tb.length()) {
                StringBuilder discarded$6 = lo.a(-26750, ((vg) this).field_Tb, ((vg) this).field_Tb.length() + -1, ' ');
                break L1;
              } else {
                break L1;
              }
            }
          }
          L2: {
            if (((vg) this).field_Tb.length() >= 12) {
              break L2;
            } else {
              L3: {
                var2 = Character.toLowerCase(tb.field_m);
                if (var2 != 32) {
                  break L3;
                } else {
                  var2 = 95;
                  break L3;
                }
              }
              L4: {
                if (95 != var2) {
                  break L4;
                } else {
                  if (((vg) this).field_Tb.length() > 0) {
                    StringBuilder discarded$7 = ((vg) this).field_Tb.append((char) var2);
                    break L4;
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                if (ac.a((byte) -105, (char) var2)) {
                  break L5;
                } else {
                  if (!fd.a((char) var2, (byte) 88)) {
                    break L2;
                  } else {
                    break L5;
                  }
                }
              }
              StringBuilder discarded$8 = ((vg) this).field_Tb.append((char) var2);
              break L2;
            }
          }
          L6: {
            if (dg.field_e == 84) {
              if (((vg) this).field_Tb.length() <= 0) {
                ((vg) this).field_Qb = 1;
                break L6;
              } else {
                ((vg) this).field_jb = ((vg) this).field_Tb.toString();
                ((vg) this).field_Qb = 2;
                break L6;
              }
            } else {
              break L6;
            }
          }
          if (dg.field_e == 13) {
            ((vg) this).field_Qb = 1;
            return true;
          } else {
            return true;
          }
        }
    }

    vg(int param0, int param1, int param2, int param3, String param4, hl param5, hl param6, hl param7) {
        super(0L, param5);
        RuntimeException var9 = null;
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        ((vg) this).field_Qb = 0;
        try {
          L0: {
            ((vg) this).field_Sb = new hl(0L, param6, param4);
            ((vg) this).a((byte) -93, ((vg) this).field_Sb);
            ((vg) this).field_Rb = new hl(0L, param7);
            ((vg) this).field_Rb.field_N = 16764006;
            ((vg) this).a((byte) -92, ((vg) this).field_Rb);
            ((vg) this).field_Rb.field_O = "|";
            ((vg) this).field_Tb = new StringBuilder(12);
            var9_int = ((vg) this).field_Sb.f(-88);
            ((vg) this).field_Sb.a((byte) -119, var9_int, 3, qe.field_d, 5);
            ((vg) this).field_Rb.a((byte) -100, var9_int, qe.field_d + 3, qe.field_d, 5);
            var10 = var9_int + 10;
            var11 = 3 + (qe.field_d * 2 + 3);
            var12 = eo.a(var10, (byte) 124, param0, param2);
            var13 = mh.a(param3, param1, var11, -8748);
            ((vg) this).a((byte) -115, var10, var13, var11, var12);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var9 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var9;
            stackOut_3_1 = new StringBuilder().append("vg.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param4 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L1;
            }
          }
          L2: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param5 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param6 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param7 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
    }

    final static void d(byte param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        vj var4 = null;
        int var4_int = 0;
        bm var5_ref_bm = null;
        int var5 = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        bc var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = TetraLink.field_J;
        try {
          L0: {
            var9 = kb.field_q;
            var2 = var9.d((byte) -99);
            L1: {
              var3 = var9.d((byte) -99);
              if (var2 == 0) {
                var4 = (vj) (Object) bd.field_c.c(false);
                if (var4 == null) {
                  mk.a(false);
                  return;
                } else {
                  L2: {
                    var5 = rl.field_d + -var9.field_t;
                    var13 = var4.field_r;
                    var12 = var13;
                    var11 = var12;
                    var10 = var11;
                    var6 = var10;
                    if (var13.length << 2 >= var5) {
                      break L2;
                    } else {
                      var5 = var13.length << 2;
                      break L2;
                    }
                  }
                  var7 = 0;
                  L3: while (true) {
                    if (var7 >= var5) {
                      var4.b(false);
                      break L1;
                    } else {
                      var6[var7 >> 2] = var6[var7 >> 2] + (var9.d((byte) -99) << (pl.a(var7, 3) << 8));
                      var7++;
                      continue L3;
                    }
                  }
                }
              } else {
                if (var2 != 1) {
                  fk.a(-105, (Throwable) null, "LR1: " + hc.a(false));
                  mk.a(false);
                  break L1;
                } else {
                  var4_int = var9.e((byte) 82);
                  var5_ref_bm = (bm) (Object) gm.field_a.c(false);
                  L4: while (true) {
                    L5: {
                      if (var5_ref_bm == null) {
                        break L5;
                      } else {
                        L6: {
                          if (var3 != var5_ref_bm.field_t) {
                            break L6;
                          } else {
                            if (var5_ref_bm.field_r != var4_int) {
                              break L6;
                            } else {
                              break L5;
                            }
                          }
                        }
                        var5_ref_bm = (bm) (Object) gm.field_a.a((byte) -70);
                        continue L4;
                      }
                    }
                    if (var5_ref_bm != null) {
                      var5_ref_bm.b(false);
                      break L1;
                    } else {
                      mk.a(false);
                      return;
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oi.a((Throwable) (Object) var1, "vg.D(" + 78 + ')');
        }
    }

    final static void a(byte param0, ah param1) {
        RuntimeException var2 = null;
        hl var3 = null;
        hl var5 = null;
        hl var6 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            db.field_b = ug.a(param1, (byte) -45, "display_name_changed", "basic");
            pj.field_f = new ji(0L, nj.field_b, wd.field_d, re.field_S);
            fl.field_n = new ji(0L, nj.field_b, re.field_Q, kk.field_P);
            go.field_d = new hl(0L, (hl) null);
            mi.field_Kb = new hl(0L, bk.field_i);
            mi.field_Kb.field_xb = 1;
            th.field_i = new hl(0L, mb.field_x, bm.field_o);
            eo.field_b = new hl(0L, um.field_l, kl.field_g);
            kd.field_i = new hl(0L, ek.field_n);
            go.field_d.a((byte) -85, mi.field_Kb);
            go.field_d.a((byte) 59, th.field_i);
            go.field_d.a((byte) -107, eo.field_b);
            go.field_d.a((byte) -117, (hl) (Object) pj.field_f);
            go.field_d.a((byte) 64, kd.field_i);
            pj.field_f.field_Rb.field_Ob.a(bk.field_i, -2147483648);
            pj.field_f.field_Rb.field_Ob.field_J = 1;
            var5 = pj.field_f.field_Rb.field_Ob;
            var6 = var5;
            var6.field_xb = 1;
            fl.field_n.field_Rb.field_Ob.a(bk.field_i, -2147483648);
            var3 = fl.field_n.field_Rb.field_Ob;
            fl.field_n.field_Rb.field_Ob.field_J = 1;
            var3.field_xb = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("vg.E(").append(53).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
    }

    final static void j(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object var5_ref = null;
        int var6 = 0;
        Object var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        boolean stackOut_2_0 = false;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        var9 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              if (aa.field_bc == null) {
                if (null != ud.field_Qb) {
                  stackOut_5_0 = 1;
                  stackIn_6_0 = stackOut_5_0;
                  break L1;
                } else {
                  stackOut_4_0 = 0;
                  stackIn_6_0 = stackOut_4_0;
                  break L1;
                }
              } else {
                stackOut_2_0 = aa.field_bc.field_b;
                stackIn_6_0 = stackOut_2_0 ? 1 : 0;
                break L1;
              }
            }
            L2: {
              var1_int = stackIn_6_0;
              if (var1_int != 0) {
                stackOut_8_0 = oj.field_a.field_z;
                stackIn_9_0 = stackOut_8_0;
                break L2;
              } else {
                stackOut_7_0 = 480;
                stackIn_9_0 = stackOut_7_0;
                break L2;
              }
            }
            var2 = stackIn_9_0;
            if (param0 >= 83) {
              L3: {
                L4: {
                  if (0 != ml.field_ab) {
                    break L4;
                  } else {
                    if (wk.field_u != 0) {
                      break L4;
                    } else {
                      break L3;
                    }
                  }
                }
                L5: {
                  var3 = 128;
                  var4 = 4210752;
                  if (dd.field_a == 0) {
                    var4 = 128;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (0 != ml.field_ab) {
                    break L6;
                  } else {
                    var3 = wd.field_i / 2;
                    break L6;
                  }
                }
                L7: {
                  if (0 == wk.field_u) {
                    var3 = (-wd.field_i + 256) / 2;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                var5 = 0;
                L8: while (true) {
                  if (var5 >= 18) {
                    var5 = 18;
                    L9: while (true) {
                      if (var5 >= 20) {
                        L10: {
                          var5_ref = null;
                          if (ml.field_ab == 1) {
                            var5_ref = (Object) (Object) qf.field_d;
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                        L11: {
                          if (ml.field_ab == 2) {
                            var5_ref = (Object) (Object) ai.field_c;
                            break L11;
                          } else {
                            break L11;
                          }
                        }
                        if (wd.field_i == 0) {
                          go.field_g.b((String) var5_ref, -(int)a.field_d + 652, var2 - 2, 16777215, -1);
                          break L3;
                        } else {
                          L12: {
                            var6_ref = null;
                            if (1 == wk.field_u) {
                              var6_ref = (Object) (Object) qf.field_d;
                              break L12;
                            } else {
                              break L12;
                            }
                          }
                          L13: {
                            if (wk.field_u == 2) {
                              var6_ref = (Object) (Object) ai.field_c;
                              break L13;
                            } else {
                              break L13;
                            }
                          }
                          go.field_g.c((String) var5_ref, -(int)a.field_d + 652, -2 + var2, 16777215, -1, -wd.field_i + 256);
                          go.field_g.c((String) var6_ref, -(int)a.field_d + 652, var2 + -2, 16777215, -1, wd.field_i);
                          break L3;
                        }
                      } else {
                        ra.e(-(int)a.field_d + (638 + var5 / 2), -var5 + var2, 2 + ((int)a.field_d - var5 / 2), 16777215, var3);
                        var5++;
                        continue L9;
                      }
                    }
                  } else {
                    ra.e(-(int)a.field_d + (640 - -(var5 / 2)), -var5 + var2, -(var5 / 2) + (int)a.field_d, var4, var3);
                    ra.e(var5 / 2 + (638 - (int)a.field_d), var2 - var5, 2, 16777215, var3);
                    var5++;
                    continue L8;
                  }
                }
              }
              L14: {
                L15: {
                  if (ml.field_ab == 2) {
                    break L15;
                  } else {
                    if (wk.field_u != 2) {
                      break L14;
                    } else {
                      break L15;
                    }
                  }
                }
                L16: {
                  var2 -= 20;
                  var3 = 128;
                  var4 = 256;
                  if (ml.field_ab == 2) {
                    break L16;
                  } else {
                    var3 = wd.field_i / 2;
                    var4 = wd.field_i;
                    break L16;
                  }
                }
                L17: {
                  if (wk.field_u != 2) {
                    var4 = 256 + -wd.field_i;
                    var3 = (256 + -wd.field_i) / 2;
                    break L17;
                  } else {
                    break L17;
                  }
                }
                var5 = 0;
                L18: while (true) {
                  if (var5 >= 4) {
                    L19: {
                      var5 = 4210752;
                      if (dd.field_a != 5) {
                        break L19;
                      } else {
                        var5 = 128;
                        break L19;
                      }
                    }
                    var6 = 104 + (638 - ((int)a.field_d - 10));
                    var7 = 0;
                    L20: while (true) {
                      if (var7 >= 18) {
                        L21: {
                          if (256 == var4) {
                            l.field_c[4].c(10 + var6, -13 + var2);
                            break L21;
                          } else {
                            l.field_c[4].a(10 + var6, -13 + var2, var4);
                            break L21;
                          }
                        }
                        var7 = -2;
                        L22: while (true) {
                          if (var7 >= 0) {
                            break L14;
                          } else {
                            ra.e((-1 + var7) / 2 + (638 - (int)a.field_d + 20), var2 + -20 - var7, 130, 16777215, var3);
                            var7++;
                            continue L22;
                          }
                        }
                      } else {
                        ra.e(var6 + (2 - -(var7 / 2)), -var7 + var2, 30, var5, var3);
                        ra.e(var6 + var7 / 2, -var7 + var2, 2, 16777215, var3);
                        var7++;
                        continue L20;
                      }
                    }
                  } else {
                    L23: {
                      var6 = 4210752;
                      if (dd.field_a == 1 + var5) {
                        var6 = 128;
                        break L23;
                      } else {
                        break L23;
                      }
                    }
                    var7 = 638 + (-(int)a.field_d - (-(26 * var5) + -10));
                    var8 = 0;
                    L24: while (true) {
                      if (var8 >= 18) {
                        L25: {
                          if (var4 != 256) {
                            l.field_c[var5].a(12 + var7, -13 + var2, var4);
                            break L25;
                          } else {
                            l.field_c[var5].c(12 + var7, var2 - 13);
                            break L25;
                          }
                        }
                        var5++;
                        continue L18;
                      } else {
                        ra.e(var8 / 2 + (var7 + 2), var2 - var8, 24, var6, var3);
                        ra.e(var8 / 2 + var7, -var8 + var2, 2, 16777215, var3);
                        var8++;
                        continue L24;
                      }
                    }
                  }
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oi.a((Throwable) (Object) var1, "vg.B(" + param0 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        int var1 = 0;
        long var2 = 0L;
        long var4 = 0L;
        long var6 = 0L;
        long var8 = 0L;
        long var10 = 0L;
        long var12 = 0L;
        int var14 = 0;
        long stackIn_5_0 = 0L;
        long stackOut_4_0 = 0L;
        long stackOut_3_0 = 0L;
        field_Ob = new long[11];
        field_Ub = new long[8][256];
        var0 = 0;
        L0: while (true) {
          if (var0 >= 256) {
            field_Ob[0] = 0L;
            var0 = 1;
            L1: while (true) {
              if (10 < var0) {
                field_Mb = "Please log in to access this feature.";
                field_Nb = "There are no valid types of game that match your preferences.";
                return;
              } else {
                var1 = 8 * var0 - 8;
                field_Ob[var0] = mb.a(mb.a(pd.a(65280L, field_Ub[6][6 + var1]), mb.a(pd.a(16711680L, field_Ub[5][var1 - -5]), mb.a(mb.a(pd.a(field_Ub[3][3 + var1], 1095216660480L), mb.a(mb.a(pd.a(field_Ub[1][1 + var1], 71776119061217280L), pd.a(-72057594037927936L, field_Ub[0][var1])), pd.a(280375465082880L, field_Ub[2][2 + var1]))), pd.a(field_Ub[4][var1 - -4], 4278190080L)))), pd.a(field_Ub[7][var1 - -7], 255L));
                var0++;
                continue L1;
              }
            }
          } else {
            L2: {
              var1 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙守騦㊰햀뻍㑈ｺ遟⁨᪮둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥댡鰞䏇ﰄ写洍﫟縤㮫츑轎럫㲁铷뤓ⳓ쐃噄義⪻셓\udc0b鵬ㅴ겉ᓡᘺ椉炶탭챂颤⡜".charAt(var0 / 2);
              if (0 == (1 & var0)) {
                stackOut_4_0 = (long)(var1 >>> 8);
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = (long)(255 & var1);
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            L3: {
              var2 = stackIn_5_0;
              var4 = var2 << 1;
              if (var4 >= 256L) {
                var4 = var4 ^ 285L;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              var6 = var4 << 1;
              if (var6 < 256L) {
                break L4;
              } else {
                var6 = var6 ^ 285L;
                break L4;
              }
            }
            L5: {
              var8 = var6 ^ var2;
              var10 = var6 << 1;
              if (var10 < 256L) {
                break L5;
              } else {
                var10 = var10 ^ 285L;
                break L5;
              }
            }
            var12 = var10 ^ var2;
            field_Ub[0][var0] = tm.a(tm.a(var4 << 8, tm.a(tm.a(var10 << 24, tm.a(var2 << 32, tm.a(var6 << 40, tm.a(var2 << 56, var2 << 48)))), var8 << 16)), var12);
            var14 = 1;
            L6: while (true) {
              if (var14 >= 8) {
                var0++;
                continue L0;
              } else {
                field_Ub[var14][var0] = tm.a(field_Ub[-1 + var14][var0] << 56, field_Ub[var14 + -1][var0] >>> 8);
                var14++;
                continue L6;
              }
            }
          }
        }
    }
}
