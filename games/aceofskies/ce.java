/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ce extends ab implements dr, dn {
    static pt field_t;
    private bm field_x;
    private boolean field_B;
    private mi field_D;
    static int field_u;
    private mi field_z;
    private boolean field_C;
    private bm field_v;
    private mi field_w;
    private String field_y;
    private boolean field_E;
    static int field_A;

    final void a(byte param0, int param1, int param2, int param3) {
        if (!(((ce) this).field_y == null)) {
            int discarded$0 = qo.field_b.a(((ce) this).field_y, 20 + param3 - -((ce) this).field_p, 15 + param2 - -((ce) this).field_h, ((ce) this).field_q - 40, ((ce) this).field_n, 16777215, -1, 1, 0, qo.field_b.field_I);
        }
        if (!(null == ((ce) this).field_w)) {
            vp.b(param3 + 10, param2 - -134, -20 + ((ce) this).field_q, 4210752);
        }
        if (param0 <= 64) {
            return;
        }
        this.a((byte) 77, param1, param2, param3);
    }

    final static float a(float param0, int param1) {
        if (param1 > -55) {
            field_u = -54;
        }
        return param0 * (param0 * param0) * (param0 * (-15.0f + param0 * 6.0f) + 10.0f);
    }

    final boolean a(int param0, int param1, char param2, ea param3) {
        if (!(!this.a(-20, param1, param2, param3))) {
            return true;
        }
        if (-99 == (param1 ^ -1)) {
            return ((ce) this).b(param3, -101);
        }
        if (!(param1 != 99)) {
            return ((ce) this).a(80, param3);
        }
        int var5 = -87 % ((param0 - -53) / 33);
        return false;
    }

    final void a(String param0, int param1) {
        bm var3 = ((ce) this).field_v;
        String var4 = param0;
        var3.a(-20975, var4, false);
        if (param1 < 43) {
            bm var5 = (bm) null;
            ((ce) this).b((bm) null, 39);
        }
        ((ce) this).field_x.f((byte) -2);
    }

    final void h(int param0) {
        ((ce) this).field_v.f((byte) -2);
        ((ce) this).field_x.f((byte) -2);
        if (param0 != 310) {
            ((ce) this).field_x = (bm) null;
        }
    }

    final String d(boolean param0) {
        if (param0) {
            return (String) null;
        }
        if (!(null != ((ce) this).field_v.field_f)) {
            return "";
        }
        return ((ce) this).field_v.field_f;
    }

    final static void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        uc var4 = null;
        long var4_long = 0L;
        int var5 = 0;
        ga var6_ref_ga = null;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        String[][] var8 = null;
        String[][] var9 = null;
        long[][] var10 = null;
        int[][] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        String var21 = null;
        long var22 = 0L;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        dl var28 = null;
        L0: {
          var26 = AceOfSkies.field_G ? 1 : 0;
          if (param0 == 116) {
            break L0;
          } else {
            field_A = -61;
            break L0;
          }
        }
        L1: {
          var28 = nm.field_c;
          var2 = var28.g(-85);
          if (var2 == 0) {
            var3 = var28.i((byte) 0);
            var4 = (uc) nh.field_g.d(268435455);
            L2: while (true) {
              L3: {
                if (var4 == null) {
                  break L3;
                } else {
                  if (var3 != ((uc) var4).field_n) {
                    var4 = (uc) nh.field_g.b((byte) 103);
                    continue L2;
                  } else {
                    break L3;
                  }
                }
              }
              if (var4 != null) {
                L4: {
                  var5 = var28.g(param0 + -167);
                  if (var5 == 0) {
                    break L4;
                  } else {
                    var6 = ((uc) var4).field_j;
                    pe.field_b[0].field_f = null;
                    var7 = ((uc) var4).field_m;
                    pe.field_b[0].field_e = fj.field_a;
                    pe.field_b[0].field_g = false;
                    var8_int = 1;
                    L5: while (true) {
                      if (var8_int >= var5) {
                        var4.field_e = new String[3][var6];
                        var8 = new String[3][var6];
                        var9 = new String[3][var6];
                        var4.field_f = new long[3][var6];
                        var10 = new long[3][var6];
                        var4.field_h = new int[3][var6 * var7];
                        var11 = new int[3][var6 * var7];
                        var12 = 0;
                        var13 = 0;
                        var14 = 0;
                        var15 = 0;
                        var16 = 0;
                        var17 = 0;
                        var18 = var28.g(-119);
                        if ((var18 ^ -1) >= -1) {
                          break L4;
                        } else {
                          var19 = 0;
                          L6: while (true) {
                            if (var19 >= var18) {
                              break L4;
                            } else {
                              L7: {
                                var20 = var28.g(param0 ^ 69);
                                var21 = pe.field_b[var20].field_e;
                                var22 = var28.h((byte) -32);
                                var24 = ((dl) var28).field_g;
                                if (var6 <= var19) {
                                  break L7;
                                } else {
                                  var8[0][var12] = var21;
                                  var9[0][var12] = pe.field_b[var20].field_f;
                                  var10[0][var12] = var22;
                                  var12++;
                                  var25 = 0;
                                  L8: while (true) {
                                    if (var7 <= var25) {
                                      break L7;
                                    } else {
                                      var15++;
                                      var11[0][var15] = var28.a((byte) 124);
                                      var25++;
                                      continue L8;
                                    }
                                  }
                                }
                              }
                              L9: {
                                if (var21 == null) {
                                  break L9;
                                } else {
                                  if (!fd.a(var21, (byte) -6)) {
                                    break L9;
                                  } else {
                                    var8[1][var13] = fj.field_a;
                                    var9[1][var13] = null;
                                    var10[1][var13] = var22;
                                    var13++;
                                    var28.field_g = var24;
                                    var25 = 0;
                                    L10: while (true) {
                                      if (var7 <= var25) {
                                        break L9;
                                      } else {
                                        var16++;
                                        var11[1][var16] = var28.a((byte) 114);
                                        var25++;
                                        continue L10;
                                      }
                                    }
                                  }
                                }
                              }
                              if (var6 > var14) {
                                if (!pe.field_b[var20].field_g) {
                                  pe.field_b[var20].field_g = true;
                                  var8[2][var14] = var21;
                                  var9[2][var14] = pe.field_b[var20].field_f;
                                  var10[2][var14] = var22;
                                  var14++;
                                  var28.field_g = var24;
                                  var25 = 0;
                                  L11: while (true) {
                                    if (var7 > var25) {
                                      var17++;
                                      var11[2][var17] = var28.a((byte) 113);
                                      var25++;
                                      continue L11;
                                    } else {
                                      var19++;
                                      continue L6;
                                    }
                                  }
                                } else {
                                  var19++;
                                  continue L6;
                                }
                              } else {
                                var19++;
                                continue L6;
                              }
                            }
                          }
                        }
                      } else {
                        pe.field_b[var8_int].field_e = var28.h(-17883);
                        pe.field_b[var8_int].field_g = false;
                        if ((var28.g(-47) ^ -1) != -2) {
                          pe.field_b[var8_int].field_f = null;
                          var8_int++;
                          continue L5;
                        } else {
                          pe.field_b[var8_int].field_f = var28.h(param0 ^ -17839);
                          var8_int++;
                          continue L5;
                        }
                      }
                    }
                  }
                }
                var4.field_i = true;
                var4.c(param0 ^ -16);
                break L1;
              } else {
                te.b(true);
                return;
              }
            }
          } else {
            if ((var2 ^ -1) == -2) {
              var3 = var28.i((byte) 0);
              var4_long = var28.h((byte) 64);
              var6_ref_ga = (ga) tq.field_d.d(268435455);
              L12: while (true) {
                L13: {
                  if (var6_ref_ga == null) {
                    break L13;
                  } else {
                    if (((ga) var6_ref_ga).field_m != var3) {
                      var6_ref_ga = (ga) tq.field_d.b((byte) 103);
                      continue L12;
                    } else {
                      break L13;
                    }
                  }
                }
                if (var6_ref_ga != null) {
                  var6_ref_ga.field_j = var4_long;
                  var6_ref_ga.c(-127);
                  break L1;
                } else {
                  te.b(true);
                  return;
                }
              }
            } else {
              v.a("HS1: " + dl.k((byte) 65), (byte) -52, (Throwable) null);
              te.b(true);
              break L1;
            }
          }
        }
    }

    public final void b(bm param0, int param1) {
        if (!(param0 != ((ce) this).field_v)) {
            boolean discarded$0 = ((ce) this).field_x.a((ea) this, (byte) -42);
        }
        if (((ce) this).field_x == param0) {
            this.d((byte) -85);
        }
        if (param1 != -40) {
            ((ce) this).field_D = (mi) null;
        }
    }

    final static boolean g(int param0) {
        if (param0 != -3) {
            return false;
        }
        return nl.field_s;
    }

    private final void d(byte param0) {
        if (!fh.e(31574)) {
            // if_icmple L63
            // if_icmpge L63
        }
        s.a(((ce) this).field_x.field_f, false, ((ce) this).field_v.field_f);
        if (param0 > -59) {
            this.d((byte) -4);
        }
    }

    public final void a(int param0, mi param1, int param2, int param3, byte param4) {
        int var6 = 0;
        int var7 = 0;
        L0: {
          L1: {
            var7 = AceOfSkies.field_G ? 1 : 0;
            if (param1 != ((ce) this).field_D) {
              if (param1 != ((ce) this).field_w) {
                if (((ce) this).field_z == param1) {
                  if (!((ce) this).field_C) {
                    if (((ce) this).field_E) {
                      pj.b((byte) -75);
                      break L1;
                    } else {
                      rb.i(-112);
                      break L1;
                    }
                  } else {
                    ps.b(17);
                    break L1;
                  }
                } else {
                  var6 = 122 % ((param4 - -27) / 61);
                  break L0;
                }
              } else {
                cu.c((byte) 104);
                break L1;
              }
            } else {
              this.d((byte) -84);
              break L1;
            }
          }
          var6 = 122 % ((param4 - -27) / 61);
          break L0;
        }
    }

    public final void a(bm param0, int param1) {
        if (param1 != -6525) {
            String var4 = (String) null;
            ((ce) this).a((String) null, 56);
        }
    }

    ce(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (ir) null);
        qb var6 = null;
        hc var7 = null;
        String var8 = null;
        gu var9 = null;
        bc var12 = null;
        bc var13 = null;
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        Object stackIn_16_0 = null;
        mi stackIn_16_1 = null;
        mi stackIn_16_2 = null;
        Object stackIn_17_0 = null;
        mi stackIn_17_1 = null;
        mi stackIn_17_2 = null;
        Object stackIn_18_0 = null;
        mi stackIn_18_1 = null;
        mi stackIn_18_2 = null;
        String stackIn_18_3 = null;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_6_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_15_0 = null;
        mi stackOut_15_1 = null;
        mi stackOut_15_2 = null;
        Object stackOut_17_0 = null;
        mi stackOut_17_1 = null;
        mi stackOut_17_2 = null;
        String stackOut_17_3 = null;
        Object stackOut_16_0 = null;
        mi stackOut_16_1 = null;
        mi stackOut_16_2 = null;
        String stackOut_16_3 = null;
        L0: {
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param4) {
            stackOut_2_0 = this;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        L1: {
          ((ce) this).field_E = stackIn_3_1 != 0;
          ((ce) this).field_y = param1;
          stackOut_3_0 = this;
          stackIn_5_0 = stackOut_3_0;
          stackIn_4_0 = stackOut_3_0;
          if (!param3) {
            stackOut_5_0 = this;
            stackOut_5_1 = 0;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            break L1;
          } else {
            stackOut_4_0 = this;
            stackOut_4_1 = 1;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            break L1;
          }
        }
        L2: {
          ((ce) this).field_B = stackIn_6_1 != 0;
          stackOut_6_0 = this;
          stackIn_8_0 = stackOut_6_0;
          stackIn_7_0 = stackOut_6_0;
          if (!param2) {
            stackOut_8_0 = this;
            stackOut_8_1 = 0;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            break L2;
          } else {
            stackOut_7_0 = this;
            stackOut_7_1 = 1;
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            break L2;
          }
        }
        L3: {
          ((ce) this).field_C = stackIn_9_1 != 0;
          if (!((ce) this).field_C) {
            break L3;
          } else {
            L4: {
              if (((ce) this).field_B) {
                break L4;
              } else {
                if (!((ce) this).field_E) {
                  break L3;
                } else {
                  break L4;
                }
              }
            }
            throw new IllegalStateException();
          }
        }
        L5: {
          ((ce) this).field_v = (bm) (Object) new kk(param0, (no) this, 100);
          ((ce) this).field_x = (bm) (Object) new kk("", (no) this, 20);
          if (!((ce) this).field_C) {
            L6: {
              ((ce) this).field_D = new mi(ms.field_a, (no) null);
              stackOut_15_0 = this;
              stackOut_15_1 = null;
              stackOut_15_2 = null;
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              if (!((ce) this).field_E) {
                stackOut_17_0 = this;
                stackOut_17_1 = null;
                stackOut_17_2 = null;
                stackOut_17_3 = eu.field_j;
                stackIn_18_0 = stackOut_17_0;
                stackIn_18_1 = stackOut_17_1;
                stackIn_18_2 = stackOut_17_2;
                stackIn_18_3 = stackOut_17_3;
                break L6;
              } else {
                stackOut_16_0 = this;
                stackOut_16_1 = null;
                stackOut_16_2 = null;
                stackOut_16_3 = nu.field_a;
                stackIn_18_0 = stackOut_16_0;
                stackIn_18_1 = stackOut_16_1;
                stackIn_18_2 = stackOut_16_2;
                stackIn_18_3 = stackOut_16_3;
                break L6;
              }
            }
            new mi((String) (Object) stackIn_18_3, (no) null);
            ((ce) this).field_z = (mi) (Object) stackIn_18_1;
            if (!((ce) this).field_B) {
              break L5;
            } else {
              ((ce) this).field_w = new mi(jd.field_b, (no) this);
              break L5;
            }
          } else {
            ((ce) this).field_D = new mi(hg.field_z, (no) null);
            ((ce) this).field_z = new mi(mb.field_s, (no) null);
            ((ce) this).field_v.field_u = false;
            break L5;
          }
        }
        L7: {
          ((ce) this).field_v.field_e = (ir) (Object) new sl(10000536);
          ((ce) this).field_x.field_e = (ir) (Object) new ul(10000536);
          var6 = new qb();
          ((ce) this).field_D.field_e = (ir) (Object) var6;
          if (null == ((ce) this).field_z) {
            break L7;
          } else {
            ((ce) this).field_z.field_e = (ir) (Object) var6;
            break L7;
          }
        }
        L8: {
          ((ce) this).field_v.field_k = ae.field_g;
          if (null == ((ce) this).field_w) {
            break L8;
          } else {
            ((ce) this).field_w.field_e = (ir) (Object) var6;
            break L8;
          }
        }
        L9: {
          if (((ce) this).field_w == null) {
            break L9;
          } else {
            ((ce) this).field_w.field_k = cl.field_db;
            break L9;
          }
        }
        L10: {
          if (((ce) this).field_C) {
            ((ce) this).field_z.field_k = gq.field_d;
            break L10;
          } else {
            if (((ce) this).field_E) {
              ((ce) this).field_z.field_k = td.field_c;
              ((ce) this).field_z.field_e = (ir) (Object) new wg();
              break L10;
            } else {
              ((ce) this).field_z.field_e = (ir) (Object) new wg();
              break L10;
            }
          }
        }
        L11: {
          ((ce) this).field_h = 15;
          var7 = qo.field_b;
          if (null == ((ce) this).field_y) {
            break L11;
          } else {
            ((ce) this).field_h = ((ce) this).field_h + (5 + var7.a(((ce) this).field_y, ((ce) this).field_q + -40, ((hc) var7).field_I));
            break L11;
          }
        }
        L12: {
          var8 = kk.field_J;
          var9 = lc.a(17123, bm.m(125));
          if (ef.field_k != var9) {
            if (lp.field_f != var9) {
              break L12;
            } else {
              var8 = io.field_e;
              break L12;
            }
          } else {
            var8 = hu.field_b;
            break L12;
          }
        }
        L13: {
          var12 = new bc(10, ((ce) this).field_h, -20 + ((ce) this).field_q, 25, (ea) (Object) ((ce) this).field_v, false, 80, 3, var7, 16777215, var8);
          ((ce) this).a((ea) (Object) new bc(10, ((ce) this).field_h, -20 + ((ce) this).field_q, 25, (ea) (Object) ((ce) this).field_v, false, 80, 3, var7, 16777215, var8), 1);
          ((ce) this).field_h = ((ce) this).field_h + (((ea) var12).field_n - -5);
          var13 = new bc(10, ((ce) this).field_h, -20 + ((ce) this).field_q, 25, (ea) (Object) ((ce) this).field_x, false, 80, 3, var7, 16777215, vj.field_b);
          ((ce) this).a((ea) (Object) new bc(10, ((ce) this).field_h, -20 + ((ce) this).field_q, 25, (ea) (Object) ((ce) this).field_x, false, 80, 3, var7, 16777215, vj.field_b), 1);
          ((ce) this).field_D.field_o = (no) this;
          ((ce) this).field_h = ((ce) this).field_h + (5 + ((ea) var13).field_n);
          if (null == ((ce) this).field_w) {
            break L13;
          } else {
            ((ce) this).field_w.field_o = (no) this;
            break L13;
          }
        }
        L14: {
          if (null == ((ce) this).field_z) {
            break L14;
          } else {
            ((ce) this).field_z.field_o = (no) this;
            break L14;
          }
        }
        L15: {
          if (((ce) this).field_w != null) {
            ((ce) this).field_D.a(30, 85, ((ce) this).field_h, -95 + ((ce) this).field_q, (byte) 126);
            ((ce) this).field_h = ((ce) this).field_h + 60;
            break L15;
          } else {
            ((ce) this).field_D.a(30, 8, ((ce) this).field_h, -6 + (((ce) this).field_q - 10), (byte) 126);
            ((ce) this).field_h = ((ce) this).field_h + 35;
            break L15;
          }
        }
        L16: {
          if (null == ((ce) this).field_w) {
            break L16;
          } else {
            ((ce) this).field_w.a(30, 8, ((ce) this).field_h, ((ce) this).field_q + -6 + -10, (byte) 126);
            ((ce) this).field_h = ((ce) this).field_h + 35;
            break L16;
          }
        }
        L17: {
          if (((ce) this).field_z == null) {
            break L17;
          } else {
            L18: {
              if (((ce) this).field_C) {
                break L18;
              } else {
                if (!((ce) this).field_E) {
                  ((ce) this).field_z.a(20, 8, ((ce) this).field_h, 40, (byte) 126);
                  ((ce) this).field_h = ((ce) this).field_h + 25;
                  break L17;
                } else {
                  break L18;
                }
              }
            }
            ((ce) this).field_z.a(30, 8, ((ce) this).field_h, ((ce) this).field_q + -6 - 10, (byte) 127);
            ((ce) this).field_h = ((ce) this).field_h + 35;
            break L17;
          }
        }
        L19: {
          ((ce) this).a(((ce) this).field_h - -3, 0, 0, ((ce) this).field_q, (byte) 126);
          ((ce) this).a((ea) (Object) ((ce) this).field_D, 1);
          if (((ce) this).field_w == null) {
            break L19;
          } else {
            ((ce) this).a((ea) (Object) ((ce) this).field_w, 1);
            break L19;
          }
        }
        L20: {
          if (null == ((ce) this).field_z) {
            break L20;
          } else {
            ((ce) this).a((ea) (Object) ((ce) this).field_z, 1);
            break L20;
          }
        }
    }

    final static ll[] b(int param0, int param1, int param2, int param3, int param4) {
        if (param2 != -29003) {
            field_t = (pt) null;
        }
        return qk.a(3, 1, param3, param4, 1, 1, param1, -128, param0);
    }

    public static void i(int param0) {
        field_t = null;
        int var1 = -76 / ((param0 - 35) / 61);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = new pt();
    }
}
