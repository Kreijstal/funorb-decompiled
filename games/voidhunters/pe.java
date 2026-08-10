/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class pe implements ntb, utb {
    private lua field_p;
    private boolean field_i;
    private int field_o;
    private ij field_n;
    private it[] field_j;
    private ij field_x;
    private int field_y;
    private int[] field_l;
    private mqb[] field_g;
    private static int[] field_w;
    private rba[] field_a;
    private aib field_e;
    private sg[] field_k;
    static String field_d;
    private cq[] field_t;
    private boolean field_h;
    private oq[] field_s;
    private boolean field_v;
    private una field_f;
    private static int[] field_c;
    private bea field_b;
    fba field_u;
    private boolean field_q;
    private int field_r;
    private nbb[] field_m;

    final void a(rba param0, byte param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 <= -37) {
                break L1;
              } else {
                field_w = (int[]) null;
                break L1;
              }
            }
            this.field_a = (rba[]) ((Object) ija.a(param0, this.field_a, 0, ema.field_p));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (runtimeException);

            stackIn_7_1 = new StringBuilder().append("pe.PA(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
    }

    final boolean a(byte param0, boolean param1, int param2, int param3, int param4) {
        nbb discarded$1 = null;
        int var6;
        qob[] var7;
        int var8;
        qob var9;
        int var10;
        int var11;
        int var12;
        int var13;
        L0: {
          var13 = VoidHunters.field_G;
          if (param0 == -99) {
            break L0;
          } else {
            discarded$1 = this.c(-37, false);
            break L0;
          }
        }
        L1: {
          var6 = 0;
          var7 = this.field_p.a(false);
          if (null == var7) {
            break L1;
          } else {
            var8 = 0;
            L2: while (true) {
              if (var7.length <= var8) {
                break L1;
              } else {
                var9 = var7[var8];
                var10 = param3 - var9.a(true);
                var11 = param2 - var9.a((byte) -118);
                var12 = ar.a(var10, (byte) 121, var11);
                if (var12 < 16384 + param4) {
                  this.a(0, param1, var8);
                  var6 = 1;
                  var8--;
                  var7 = this.field_p.a(false);
                  var8++;
                  continue L2;
                } else {
                  var8++;
                  continue L2;
                }
              }
            }
          }
        }
        return var6 != 0;
    }

    public final void a(faa param0, int param1) {
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        tj[] var3 = null;
        RuntimeException var3_ref = null;
        int var4_int = 0;
        rdb[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        tj[] var7 = null;
        var6 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              this.field_k = (sg[]) ((Object) pt.a(20, 1, this.field_k, qdb.field_a, 8, param0));
              this.field_x = new ij();
              var7 = (tj[]) ((Object) kcb.a(10, aba.field_b, param0, 1, -88, (tv[]) null));
              var3 = var7;
              if (null != var3) {
                var4_int = 0;
                L2: while (true) {
                  if (var4_int >= var7.length) {
                    break L1;
                  } else {
                    this.field_x.b(param1 ^ -10290, var7[var4_int]);
                    var4_int++;
                    continue L2;
                  }
                }
              } else {
                break L1;
              }
            }
            L3: {
              this.field_m = (nbb[]) ((Object) pt.a(param1 ^ -11, 1, this.field_m, vcb.field_z, 10, param0));
              if (kv.a(false, param0)) {
                L4: {
                  if (this.field_e != null) {
                    break L4;
                  } else {
                    this.field_e = new aib();
                    break L4;
                  }
                }
                this.field_e.a(param0, 32);
                break L3;
              } else {
                this.field_e = null;
                break L3;
              }
            }
            L5: {
              this.field_n = new ij();
              var4 = (rdb[]) ((Object) kcb.a(6, ioa.field_q, param0, 1, param1 ^ -113, (tv[]) null));
              if (var4 != null) {
                var5 = 0;
                L6: while (true) {
                  if (var4.length <= var5) {
                    break L5;
                  } else {
                    this.field_n.b(-10258, var4[var5]);
                    var5++;
                    continue L6;
                  }
                }
              } else {
                break L5;
              }
            }
            L7: {
              this.field_g = (mqb[]) ((Object) pt.a(-14, 1, this.field_g, dab.field_c, 8, param0));
              this.field_l = wkb.a((byte) 37, this.field_l, param0, 4);
              this.field_v = kv.a(false, param0);
              this.field_y = param0.i(0, param1);
              this.field_i = kv.a(false, param0);
              if (kv.a(false, param0)) {
                L8: {
                  if (null != this.field_f) {
                    break L8;
                  } else {
                    this.field_f = new una();
                    break L8;
                  }
                }
                this.field_f.a(param0, false);
                break L7;
              } else {
                this.field_f = null;
                break L7;
              }
            }
            L9: {
              this.field_t = (cq[]) ((Object) kcb.a(8, wsb.field_e, param0, 1, -98, this.field_t));
              this.field_a = (rba[]) ((Object) kcb.a(4, ema.field_p, param0, 1, -84, this.field_a));
              if (!kv.a(false, param0)) {
                this.field_p = null;
                break L9;
              } else {
                this.field_p = new lua();
                this.field_p.a(param0, false);
                break L9;
              }
            }
            L10: {
              this.field_o = param0.i(0, 28);
              this.field_r = param0.i(0, 28);
              if (!kv.a(false, param0)) {
                this.field_u = null;
                break L10;
              } else {
                L11: {
                  if (this.field_u != null) {
                    break L11;
                  } else {
                    this.field_u = new fba();
                    break L11;
                  }
                }
                this.field_u.a(param0, false);
                break L10;
              }
            }
            L12: {
              this.field_j = (it[]) ((Object) kcb.a(4, pgb.field_g, param0, 1, -62, this.field_j));
              if (!kv.a(false, param0)) {
                this.field_b = null;
                break L12;
              } else {
                this.field_b = new bea();
                this.field_b.a(param0, false);
                break L12;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var3_ref = decompiledCaughtException;
            stackIn_45_0 = (RuntimeException) (var3_ref);

            stackIn_45_1 = new StringBuilder().append("pe.L(");

            if (param0 == null) {
              stackIn_46_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackIn_46_2 = "null";
              break L13;
            } else {
              stackIn_46_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackIn_46_2 = "{...}";
              break L13;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_46_0), stackIn_46_2 + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var10;
        int var11;
        int var12;
        int var13;
        L0: {
          var13 = VoidHunters.field_G;
          var10 = 0;
          if (param4 == 30273) {
            break L0;
          } else {
            this.a((byte) -34, true, 58, 71, 121);
            break L0;
          }
        }
        L1: while (true) {
          if (param0 <= var10) {
            return;
          } else {
            L2: {
              var11 = param1;
              var12 = param8;
              if (param6 > 0) {
                var11 = var11 + (-param6 + hob.a(vg.field_o, param6 << -2001745247, 126));
                var12 = var12 + (-param6 + hob.a(vg.field_o, param6 << 1691275105, 116));
                break L2;
              } else {
                break L2;
              }
            }
            this.a(param2, param5, var11, -19079, omb.field_q, var12, param7, param3);
            var10++;
            continue L1;
          }
        }
    }

    private final void k(int param0) {
        Object var2_ref;
        tj var2_ref_tj;
        int var2;
        wc var3;
        tj var4;
        int var5;
        int var6;
        int var7;
        int var8;
        var2_ref = null;
        var8 = VoidHunters.field_G;
        var2_ref_tj = (tj) ((Object) this.field_x.d(0));
        L0: while (true) {
          if (var2_ref_tj == null) {
            var2 = 111 % ((param0 - 3) / 42);
            return;
          } else {
            L1: {
              L2: {
                if (-2 == (var2_ref_tj.g((byte) -104) ^ -1)) {
                  break L2;
                } else {
                  if ((var2_ref_tj.g((byte) -104) ^ -1) != -7) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var3 = new wc(this.field_x);
              var4 = (tj) ((Object) var3.c(570));
              L3: while (true) {
                if (null == var4) {
                  break L1;
                } else {
                  L4: {
                    if (var4.g((byte) -104) != var2_ref_tj.g((byte) -104)) {
                      var5 = var2_ref_tj.d(107) + -var4.d(118);
                      var6 = var2_ref_tj.e((byte) -107) - var4.e((byte) -107);
                      var7 = ar.a(var5, (byte) 103, var6);
                      if (2048 <= var7) {
                        break L4;
                      } else {
                        L5: {
                          if ((var4.g((byte) -104) ^ -1) != -4) {
                            var2_ref_tj.field_o = 0;
                            break L5;
                          } else {
                            var2_ref_tj.field_o = var2_ref_tj.field_o - ooa.field_xb;
                            var4.f(-24805);
                            break L5;
                          }
                        }
                        var4.field_o = 0;
                        if ((var2_ref_tj.field_o ^ -1) >= -1) {
                          L6: {
                            var3.b((byte) 94);
                            var2_ref_tj.b(-3846);
                            if (-7 != (var2_ref_tj.g((byte) -104) ^ -1)) {
                              break L6;
                            } else {
                              if ((var4.g((byte) -104) ^ -1) == -6) {
                                this.a(0, gib.field_a, var2_ref_tj.e(512), var2_ref_tj.b(false), false, var2_ref_tj.d(111), var2_ref_tj.e((byte) -107));
                                break L1;
                              } else {
                                break L6;
                              }
                            }
                          }
                          qba.a(20382, var2_ref_tj.d(113), 81, var2_ref_tj.e((byte) -107), 50);
                          this.a(100, var2_ref_tj.e((byte) -107), var2_ref_tj.d(119), 1000, 11184895, 10, 50);
                          break L1;
                        } else {
                          var4 = (tj) ((Object) var3.a(19072));
                          continue L3;
                        }
                      }
                    } else {
                      break L4;
                    }
                  }
                  var4 = (tj) ((Object) var3.a(19072));
                  continue L3;
                }
              }
            }
            var2_ref_tj = (tj) ((Object) this.field_x.a((byte) 68));
            continue L0;
          }
        }
    }

    final void g(int param0, int param1) {
        L0: {
          if ((param1 ^ -1) > param0) {
            break L0;
          } else {
            L1: {
              if (this.field_l.length <= param1) {
                break L1;
              } else {
                L2: {
                  if (13 == this.d(false)) {
                    break L2;
                  } else {
                    if (!pla.a(this.d(false), -4)) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                this.field_l[param1] = oq.field_C;
                break L0;
              }
            }
            break L0;
          }
        }
    }

    private final void a(tj param0, int param1, int param2, byte param3, int param4, int param5) {
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_70_0 = 0;
        RuntimeException stackIn_88_0 = null;
        StringBuilder stackIn_88_1 = null;
        RuntimeException stackIn_89_0 = null;
        StringBuilder stackIn_89_1 = null;
        String stackIn_89_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        uwa var10_ref_uwa = null;
        int var11 = 0;
        anb var12 = null;
        anb var13 = null;
        int var13_int = 0;
        sg var14 = null;
        int var14_int = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        uwa var23 = null;
        var22 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (1 == param0.g((byte) -104)) {
                break L1;
              } else {
                if (param0.g((byte) -104) == 6) {
                  break L1;
                } else {
                  if (gab.field_b.a((byte) -54)) {
                    break L1;
                  } else {
                    var7_int = -1;
                    var8 = wna.field_c.field_a;
                    var9 = 0;
                    L2: while (true) {
                      if (ccb.field_a.field_d <= var9) {
                        if (0 == (var7_int ^ -1)) {
                          break L1;
                        } else {
                          L3: {
                            var9 = (var8 * param0.field_f >> -1631727832) + param1;
                            var10 = (var8 * param0.field_h >> 1799937864) + param2;
                            var11 = pea.field_b;
                            if (3 == param0.g((byte) -104)) {
                              param0.a(var10, var9, 118);
                              break L3;
                            } else {
                              qba.a(20382, var9, 64, var10, 10);
                              param0.b(-3846);
                              break L3;
                            }
                          }
                          L4: {
                            var23 = ccb.field_a.field_b[var7_int];
                            var13 = var23.field_e;
                            if (!(var13 instanceof sg)) {
                              break L4;
                            } else {
                              var14 = (sg) ((Object) var13);
                              var14.a((byte) 11, param0.c((byte) 45) / vgb.field_o);
                              break L4;
                            }
                          }
                          this.a(sva.field_m, var10, var9, ei.field_a, 11184895, var11, dw.field_b);
                          wgb.field_i = null;
                          break L1;
                        }
                      } else {
                        L5: {
                          var10_ref_uwa = ccb.field_a.field_b[var9];
                          var11 = -1;
                          var12 = var10_ref_uwa.field_e;
                          if (var12 instanceof sg) {
                            var11 = ((sg) ((Object) var12)).q((byte) 113);
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        if (0 == var10_ref_uwa.field_c) {
                          L6: {
                            if (param0.e(512) != var11) {
                              L7: {
                                L8: {
                                  var13_int = lv.a(var10_ref_uwa.field_d, param2, param5, var10_ref_uwa.field_g, param1, 8, param4, var10_ref_uwa.field_f, 72);
                                  if (-1 == var13_int) {
                                    break L8;
                                  } else {
                                    if (-258 != (var13_int ^ -1)) {
                                      break L7;
                                    } else {
                                      break L8;
                                    }
                                  }
                                }
                                L9: {
                                  if (var10_ref_uwa.field_a != 0) {
                                    break L9;
                                  } else {
                                    if (var10_ref_uwa.field_h != 0) {
                                      break L9;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                                L10: {
                                  if (!trb.a(param2, var10_ref_uwa.field_f - var10_ref_uwa.field_h, -var10_ref_uwa.field_a + var10_ref_uwa.field_g, var10_ref_uwa.field_d, -104, param1)) {
                                    stackIn_25_0 = 0;
                                    break L10;
                                  } else {
                                    stackIn_25_0 = 1;
                                    break L10;
                                  }
                                }
                                L11: {
                                  var14_int = stackIn_25_0;
                                  if (!trb.a(param2, var10_ref_uwa.field_f, var10_ref_uwa.field_g, var10_ref_uwa.field_d, -98, param1)) {
                                    stackIn_28_0 = 0;
                                    break L11;
                                  } else {
                                    stackIn_28_0 = 1;
                                    break L11;
                                  }
                                }
                                var15 = stackIn_28_0;
                                if ((var15 ^ var14_int) == 0) {
                                  L12: {
                                    if (!trb.a(param5, -var10_ref_uwa.field_h + var10_ref_uwa.field_f, var10_ref_uwa.field_g + -var10_ref_uwa.field_a, var10_ref_uwa.field_d, 56, param4)) {
                                      stackIn_33_0 = 0;
                                      break L12;
                                    } else {
                                      stackIn_33_0 = 1;
                                      break L12;
                                    }
                                  }
                                  L13: {
                                    var14_int = stackIn_33_0;
                                    if (!trb.a(param5, var10_ref_uwa.field_f, var10_ref_uwa.field_g, var10_ref_uwa.field_d, 68, param4)) {
                                      stackIn_36_0 = 0;
                                      break L13;
                                    } else {
                                      stackIn_36_0 = 1;
                                      break L13;
                                    }
                                  }
                                  var15 = stackIn_36_0;
                                  if ((var14_int ^ var15) != 0) {
                                    var13_int = 0;
                                    break L7;
                                  } else {
                                    break L7;
                                  }
                                } else {
                                  var13_int = 0;
                                  break L7;
                                }
                              }
                              L14: {
                                L15: {
                                  if (-1 == var13_int) {
                                    break L15;
                                  } else {
                                    if (var13_int == 257) {
                                      break L15;
                                    } else {
                                      break L14;
                                    }
                                  }
                                }
                                var14_int = -var10_ref_uwa.field_g + param1;
                                var15 = param2 - var10_ref_uwa.field_f;
                                var16 = ar.a(var14_int, (byte) 121, var15);
                                if ((Math.abs(var16 + -var10_ref_uwa.field_d) ^ -1) < -257) {
                                  break L14;
                                } else {
                                  var13_int = 255;
                                  break L14;
                                }
                              }
                              if (0 != (var13_int ^ -1)) {
                                if (-258 != (var13_int ^ -1)) {
                                  if (var8 > var13_int) {
                                    L16: {
                                      var14_int = 0;
                                      if (0 == (var10_ref_uwa.field_i ^ -1)) {
                                        L17: {
                                          if (!trb.a(param2, var10_ref_uwa.field_f, var10_ref_uwa.field_g, var10_ref_uwa.field_d, -98, param1)) {
                                            stackIn_70_0 = 1;
                                            break L17;
                                          } else {
                                            stackIn_70_0 = 0;
                                            break L17;
                                          }
                                        }
                                        var14_int = stackIn_70_0;
                                        break L16;
                                      } else {
                                        var15 = (param0.field_f * var13_int >> -1014436568) + param1;
                                        var16 = (param0.field_h * var13_int >> -1430900248) + param2;
                                        var17 = var15 - var10_ref_uwa.field_g;
                                        var18 = -var10_ref_uwa.field_f + var16;
                                        var19 = ecb.a(var18, (byte) -77, var17);
                                        var20 = rrb.a(22433, var19 + -var10_ref_uwa.field_b);
                                        if (Math.abs(var20) < var10_ref_uwa.field_i) {
                                          var14_int = 1;
                                          break L16;
                                        } else {
                                          var21 = lv.a(var10_ref_uwa.field_d, param5, param2, var10_ref_uwa.field_g, param4, 8, param1, var10_ref_uwa.field_f, 96);
                                          if (0 == (var21 ^ -1)) {
                                            break L16;
                                          } else {
                                            if (var21 != 257) {
                                              var13_int = 256 - var21;
                                              if (var13_int < var8) {
                                                var16 = param2 + (var13_int * param0.field_h >> 815845288);
                                                var15 = (param0.field_f * var13_int >> -594504344) + param1;
                                                var17 = var15 + -var10_ref_uwa.field_g;
                                                var18 = var16 + -var10_ref_uwa.field_f;
                                                var19 = ecb.a(var18, (byte) -77, var17);
                                                var20 = rrb.a(22433, -var10_ref_uwa.field_b + var19);
                                                if (Math.abs(var20) < var10_ref_uwa.field_i) {
                                                  var14_int = 1;
                                                  break L16;
                                                } else {
                                                  break L16;
                                                }
                                              } else {
                                                break L16;
                                              }
                                            } else {
                                              break L16;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    if (var14_int != 0) {
                                      var8 = var13_int;
                                      var7_int = var9;
                                      break L6;
                                    } else {
                                      var9++;
                                      continue L2;
                                    }
                                  } else {
                                    var9++;
                                    continue L2;
                                  }
                                } else {
                                  var9++;
                                  continue L2;
                                }
                              } else {
                                var9++;
                                continue L2;
                              }
                            } else {
                              break L6;
                            }
                          }
                          var9++;
                          continue L2;
                        } else {
                          var9++;
                          continue L2;
                        }
                      }
                    }
                  }
                }
              }
            }
            var7_int = -10 % ((26 - param3) / 39);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var7 = decompiledCaughtException;
            stackIn_88_0 = (RuntimeException) (var7);

            stackIn_88_1 = new StringBuilder().append("pe.WE(");

            if (param0 == null) {
              stackIn_89_0 = (RuntimeException) ((Object) stackIn_88_0);
              stackIn_89_1 = (StringBuilder) ((Object) stackIn_88_1);
              stackIn_89_2 = "null";
              break L18;
            } else {
              stackIn_89_0 = (RuntimeException) ((Object) stackIn_88_0);
              stackIn_89_1 = (StringBuilder) ((Object) stackIn_88_1);
              stackIn_89_2 = "{...}";
              break L18;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_89_0), stackIn_89_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    private final boolean a(nbb param0, int param1, boolean param2, sg param3, int param4, int param5) {
        Object stackIn_7_0 = null;
        sg stackIn_7_1 = null;
        Object stackIn_8_0 = null;
        sg stackIn_8_1 = null;
        int stackIn_8_2 = 0;
        int stackIn_101_0 = 0;
        RuntimeException stackIn_105_0 = null;
        StringBuilder stackIn_105_1 = null;
        RuntimeException stackIn_106_0 = null;
        StringBuilder stackIn_106_1 = null;
        String stackIn_106_2 = null;
        RuntimeException stackIn_109_0 = null;
        StringBuilder stackIn_109_1 = null;
        RuntimeException stackIn_110_0 = null;
        StringBuilder stackIn_110_1 = null;
        String stackIn_110_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        ml var10 = null;
        qua var11 = null;
        lu var12 = null;
        ml var13 = null;
        imb var14 = null;
        int var15 = 0;
        int var16 = 0;
        ml var17_ref_ml = null;
        int var17 = 0;
        ml var18_ref_ml = null;
        int var18 = 0;
        sg[] var19 = null;
        crb[] var19_array = null;
        int var20 = 0;
        crb[] var20_ref_crb__ = null;
        sg var21_ref_sg = null;
        int var21 = 0;
        crb var22 = null;
        int var23 = 0;
        sg[] var24 = null;
        lsb var25 = null;
        var23 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var7_int = 0;
              var8 = -120 / ((79 - param4) / 44);
              if (null != param0) {
                L2: {
                  var9 = -field_c[1] + param0.field_l;
                  param0 = this.c(var9, false);
                  stackIn_7_0 = this;

                  stackIn_7_1 = (sg) (param3);

                  if ((hw.field_b ^ -1) != -2) {
                    stackIn_8_0 = this;
                    stackIn_8_1 = (sg) ((Object) stackIn_7_1);
                    stackIn_8_2 = 0;
                    break L2;
                  } else {
                    stackIn_8_0 = this;
                    stackIn_8_1 = (sg) ((Object) stackIn_7_1);
                    stackIn_8_2 = 1;
                    break L2;
                  }
                }
                L3: {
                  this.a(stackIn_8_1, stackIn_8_2 != 0, -102, param0, param1, param5);
                  if (oga.field_o == 0) {
                    param0.field_h = 0;
                    param0.field_t = 0;
                    param0.field_o = 0;
                    param0.field_f = 0;
                    param0.d((byte) 120);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  var10 = param0.field_k;
                  var11 = param3.p((byte) 49);
                  if (var11 != null) {
                    var12 = var11.field_e;
                    if (var12 == null) {
                      break L4;
                    } else {
                      L5: {
                        var13 = var12.field_b;
                        var14 = var13.field_d[var12.field_e];
                        var15 = 1;
                        if (var11.field_c == null) {
                          break L5;
                        } else {
                          if ((var11.field_c.length ^ -1) < -1) {
                            var16 = 0;
                            L6: while (true) {
                              if (var11.field_c.length <= var16) {
                                break L5;
                              } else {
                                L7: {
                                  var17_ref_ml = var11.field_c[var16];
                                  var18_ref_ml = var17_ref_ml;
                                  var18_ref_ml = var17_ref_ml;
                                  if (var17_ref_ml.a(16, var13)) {
                                    break L7;
                                  } else {
                                    if (var17_ref_ml == var13) {
                                      break L7;
                                    } else {
                                      var16++;
                                      continue L6;
                                    }
                                  }
                                }
                                var15 = 0;
                                if (!param2) {
                                  if (null == param0.field_k.field_f) {
                                    break L5;
                                  } else {
                                    if ((param0.field_k.field_f.length ^ -1) < -1) {
                                      param0.field_k.a((pe) (this), (byte) -111, (anb) (param0));
                                      break L5;
                                    } else {
                                      break L5;
                                    }
                                  }
                                } else {
                                  break L5;
                                }
                              }
                            }
                          } else {
                            break L5;
                          }
                        }
                      }
                      L8: {
                        var16 = 0;
                        if (var15 == 0) {
                          break L8;
                        } else {
                          L9: {
                            L10: {
                              var17 = this.field_o >> 371915681;
                              var18 = this.field_r >> 2127667521;
                              if (param0.field_q[0] < -var17) {
                                break L10;
                              } else {
                                if (var17 < param0.field_q[1]) {
                                  break L10;
                                } else {
                                  if (param0.field_q[2] < -var18) {
                                    break L10;
                                  } else {
                                    if (param0.field_q[3] <= var18) {
                                      break L9;
                                    } else {
                                      break L10;
                                    }
                                  }
                                }
                              }
                            }
                            var15 = 0;
                            break L9;
                          }
                          L11: {
                            if (var15 != 0) {
                              var24 = this.field_k;
                              var19 = var24;
                              var20 = 0;
                              L12: while (true) {
                                if (var24.length <= var20) {
                                  break L11;
                                } else {
                                  L13: {
                                    var21_ref_sg = var24[var20];
                                    if (null == var21_ref_sg) {
                                      break L13;
                                    } else {
                                      if (param3 != var21_ref_sg) {
                                        if (this.a(param0, var21_ref_sg, 66)) {
                                          var15 = 0;
                                          break L11;
                                        } else {
                                          break L13;
                                        }
                                      } else {
                                        break L13;
                                      }
                                    }
                                  }
                                  var20++;
                                  continue L12;
                                }
                              }
                            } else {
                              break L11;
                            }
                          }
                          L14: {
                            if (var15 != 0) {
                              var19_array = this.field_e.c(0);
                              var20_ref_crb__ = var19_array;
                              var21 = 0;
                              L15: while (true) {
                                if (var21 >= var20_ref_crb__.length) {
                                  break L14;
                                } else {
                                  L16: {
                                    var22 = var20_ref_crb__[var21];
                                    if (null != var22) {
                                      if (!this.a(param0, var22, 80)) {
                                        break L16;
                                      } else {
                                        var15 = 0;
                                        break L14;
                                      }
                                    } else {
                                      break L16;
                                    }
                                  }
                                  var21++;
                                  continue L15;
                                }
                              }
                            } else {
                              break L14;
                            }
                          }
                          L17: {
                            if (var15 == 0) {
                              break L17;
                            } else {
                              if (param3.field_k.j(1) + param0.field_k.j(1) > ue.field_a) {
                                var15 = 0;
                                break L17;
                              } else {
                                break L17;
                              }
                            }
                          }
                          if (var15 == 0) {
                            var16 = 1;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                      }
                      if (var15 != 0) {
                        L18: {
                          this.a(-106, 1, param0);
                          if (var11.field_c == null) {
                            break L18;
                          } else {
                            if ((var11.field_c.length ^ -1) < -1) {
                              var17 = 0;
                              L19: while (true) {
                                if (var11.field_c.length <= var17) {
                                  break L18;
                                } else {
                                  var18_ref_ml = var11.field_c[var17];
                                  param3.field_k.a(false, var18_ref_ml, (pe) (this), 27, param3);
                                  qba.a(20382, param0.d(false), 8, param0.g((byte) 120), 5);
                                  var17++;
                                  continue L19;
                                }
                              }
                            } else {
                              break L18;
                            }
                          }
                        }
                        L20: {
                          var17 = var10.b(-24) * fc.a(param0.e(0), (byte) -119) - var10.c((byte) 100) * eu.a(param0.e(0), 96) >> 1488079920;
                          var18 = var10.b(126) * eu.a(param0.e(0), 41) + var10.c((byte) 100) * fc.a(param0.e(0), (byte) 77) >> 755592464;
                          param0.a(var14.field_e - var17, -var18 + var14.field_d, (byte) -104);
                          param0.field_h = 0;
                          param0.field_f = 0;
                          param0.d((byte) 78);
                          var25 = var13.i((byte) -112).field_o[var12.field_e];
                          var20 = var25.field_a + var12.field_b.field_b;
                          if (param0.field_k.field_a != null) {
                            var20 = rrb.a(22433, var20 - -4096);
                            break L20;
                          } else {
                            break L20;
                          }
                        }
                        param0.a(var20, -95);
                        var10.h(98);
                        var13.a(1, var12.field_e, var10);
                        param3.e((byte) 119);
                        this.a(40, var14.field_d, var14.field_e, 1000, 11184895, 10, 20);
                        param3.field_k.a((byte) -127, (anb) (param3));
                        qba.a(20382, param0.d(false), 4, param0.g((byte) -94), 5);
                        if (var10.field_c == null) {
                          break L4;
                        } else {
                          param3.field_w = true;
                          var10.field_c.a(true, true);
                          break L4;
                        }
                      } else {
                        if (var16 != 0) {
                          var7_int = 1;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                    }
                  } else {
                    break L4;
                  }
                }
                if (!param2) {
                  break L1;
                } else {
                  param3.a(-1, (byte) -104);
                  break L1;
                }
              } else {
                break L1;
              }
            }
            stackIn_101_0 = var7_int;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L21: {
            var7 = decompiledCaughtException;
            stackIn_105_0 = (RuntimeException) (var7);

            stackIn_105_1 = new StringBuilder().append("pe.LF(");

            if (param0 == null) {
              stackIn_106_0 = (RuntimeException) ((Object) stackIn_105_0);
              stackIn_106_1 = (StringBuilder) ((Object) stackIn_105_1);
              stackIn_106_2 = "null";
              break L21;
            } else {
              stackIn_106_0 = (RuntimeException) ((Object) stackIn_105_0);
              stackIn_106_1 = (StringBuilder) ((Object) stackIn_105_1);
              stackIn_106_2 = "{...}";
              break L21;
            }
          }
          L22: {
            stackIn_109_0 = (RuntimeException) ((Object) stackIn_106_0);

            stackIn_109_1 = ((StringBuilder) (Object) stackIn_106_1).append(stackIn_106_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_110_0 = (RuntimeException) ((Object) stackIn_109_0);
              stackIn_110_1 = (StringBuilder) ((Object) stackIn_109_1);
              stackIn_110_2 = "null";
              break L22;
            } else {
              stackIn_110_0 = (RuntimeException) ((Object) stackIn_106_0);
              stackIn_110_1 = (StringBuilder) ((Object) stackIn_109_1);
              stackIn_110_2 = "{...}";
              break L22;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_110_0), stackIn_110_2 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_101_0 != 0;
    }

    final qob[] d(byte param0) {
        int var2 = 68 % ((param0 - 59) / 43);
        return this.field_p.a(false);
    }

    final void a(int param0, bea param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_b = param1;
              if (param0 == 0) {
                break L1;
              } else {
                this.field_o = -90;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("pe.GB(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int[] param7, byte param8) {
        int stackIn_37_0 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        var28 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var10_int = 2147483647;
              var11 = -2147483648;
              var12 = 2147483647;
              if (param8 > 73) {
                break L1;
              } else {
                this.a((byte) -47, (rdb) null);
                break L1;
              }
            }
            var13 = -2147483648;
            var14 = 0;
            L2: while (true) {
              if (param7.length <= var14) {
                var14 = -var10_int + var11;
                var15 = -var12 + var13;
                var16 = var11 - -var10_int >> 1605150689;
                var17 = var12 + var13 >> -1187017215;
                var18 = 1;
                var19 = 0;
                L3: while (true) {
                  if (var19 >= param5) {
                    break L0;
                  } else {
                    L4: {
                      var20 = hob.a(vg.field_o, var14, 126) + var10_int;
                      var21 = hob.a(vg.field_o, var15, 125) + var12;
                      if (fra.a(param7, var21, 2, var20)) {
                        L5: {
                          var22 = 0;
                          var23 = 0;
                          if (-1 <= (param4 ^ -1)) {
                            break L5;
                          } else {
                            L6: {
                              var24 = -var16 + var20;
                              var25 = var21 + -var17;
                              var26 = ar.a(var24, (byte) 122, var25);
                              if (1 > var26) {
                                var26 = 1;
                                break L6;
                              } else {
                                break L6;
                              }
                            }
                            var27 = hob.a(vg.field_o, param4 >> 803859745, 117) + (param4 >> -426444095);
                            var23 = var23 + var27 * (-var17 + var21) / var26;
                            var22 = var22 + var27 * (-var16 + var20) / var26;
                            break L5;
                          }
                        }
                        L7: {
                          var24 = hob.a(vg.field_o, param2, 117) + (param2 >> 1724494305);
                          var25 = omb.field_q;
                          if (var18 == 0) {
                            break L7;
                          } else {
                            var22 = var22 >> 2;
                            var24 = var24 << 1;
                            var23 = var23 >> 2;
                            var25 = param0 + (tk.field_o - -1);
                            break L7;
                          }
                        }
                        L8: {
                          if (var18 != 0) {
                            stackIn_37_0 = 0;
                            break L8;
                          } else {
                            stackIn_37_0 = 1;
                            break L8;
                          }
                        }
                        var18 = stackIn_37_0;
                        var26 = var22 + (param6 >> -746105471);
                        var27 = var23 + (param1 >> 580982273);
                        this.a(param3 * var24 / param2, var20, var26, -19079, var25, var27, var21, var24);
                        break L4;
                      } else {
                        var19--;
                        break L4;
                      }
                    }
                    var19++;
                    continue L3;
                  }
                }
              } else {
                L9: {
                  var15 = param7[var14];
                  var16 = param7[1 + var14];
                  if ((var15 ^ -1) >= (var11 ^ -1)) {
                    break L9;
                  } else {
                    var11 = var15;
                    break L9;
                  }
                }
                L10: {
                  if (var15 < var10_int) {
                    var10_int = var15;
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L11: {
                  if (var13 < var16) {
                    var13 = var16;
                    break L11;
                  } else {
                    break L11;
                  }
                }
                L12: {
                  if (var16 < var12) {
                    var12 = var16;
                    break L12;
                  } else {
                    break L12;
                  }
                }
                var14 += 2;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var10 = decompiledCaughtException;
            stackIn_43_0 = (RuntimeException) (var10);

            stackIn_43_1 = new StringBuilder().append("pe.MC(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');

            if (param7 == null) {
              stackIn_44_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackIn_44_2 = "null";
              break L13;
            } else {
              stackIn_44_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackIn_44_2 = "{...}";
              break L13;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_44_0), stackIn_44_2 + ',' + param8 + ')');
        }
    }

    final void a(int param0, ml param1, anb param2) {
        boolean discarded$0 = false;
        mqb[] var4 = null;
        int var5 = 0;
        mqb var6 = null;
        int var8 = 0;
        mqb[] var9 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        ml var7 = null;
        var8 = VoidHunters.field_G;
        try {
          L0: {
            if (null == param2) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var9 = this.field_g;
              var4 = var9;
              var5 = 0;
              L1: while (true) {
                if (var9.length <= var5) {
                  L2: {
                    if (param0 == 15520) {
                      break L2;
                    } else {
                      discarded$0 = this.a((nbb) null, -37, true, (sg) null, 96, -69);
                      break L2;
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var6 = var9[var5];
                  if (null != var6) {
                    if (var6.l((byte) -58) == param2.field_l) {
                      var7 = param2.field_k.c(var6.l(114), -126);
                      if (var7 == param1) {
                        var6.n(620);
                        var5++;
                        continue L1;
                      } else {
                        var5++;
                        continue L1;
                      }
                    } else {
                      var5++;
                      continue L1;
                    }
                  } else {
                    var5++;
                    continue L1;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4_ref = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var4_ref);

            stackIn_20_1 = new StringBuilder().append("pe.FC(").append(param0).append(',');

            if (param1 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L3;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L3;
            }
          }
          L4: {
            stackIn_24_0 = (RuntimeException) ((Object) stackIn_21_0);

            stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');

            if (param2 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L4;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(int param0, byte param1, anb param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.a(param2, true, true, false, param0);
              if (param1 > 60) {
                break L1;
              } else {
                this.field_i = false;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("pe.HA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    public final void a(tv param0, int param1) {
        int stackIn_35_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_39_1 = 0;
        int stackIn_55_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_59_1 = 0;
        int stackIn_71_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_75_0 = 0;
        int stackIn_75_1 = 0;
        int stackIn_90_0 = 0;
        int stackIn_93_0 = 0;
        int stackIn_94_0 = 0;
        int stackIn_94_1 = 0;
        int stackIn_110_0 = 0;
        int stackIn_113_0 = 0;
        int stackIn_114_0 = 0;
        int stackIn_114_1 = 0;
        int stackIn_128_0 = 0;
        int stackIn_131_0 = 0;
        int stackIn_132_0 = 0;
        int stackIn_132_1 = 0;
        RuntimeException stackIn_145_0 = null;
        StringBuilder stackIn_145_1 = null;
        RuntimeException stackIn_146_0 = null;
        StringBuilder stackIn_146_1 = null;
        String stackIn_146_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        pe var5 = null;
        try {
          L0: {
            L1: {
              var5 = (pe) ((Object) param0);
              tja.a(var5.field_k, 1, this.field_k, false, 5547);
              trb.a(1, this.field_x, 13, false, var5.field_x);
              tja.a(var5.field_m, 1, this.field_m, false, 5547);
              if (this.field_e == null) {
                break L1;
              } else {
                if (var5.field_e != null) {
                  this.field_e.a(var5.field_e, -46);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              trb.a(1, this.field_n, 13, false, var5.field_n);
              tja.a(var5.field_g, 1, this.field_g, false, 5547);
              if (null == this.field_f) {
                break L2;
              } else {
                if (var5.field_f != null) {
                  this.field_f.a(var5.field_f, -105);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              tja.a(var5.field_t, 1, this.field_t, false, 5547);
              tja.a(var5.field_a, 1, this.field_a, false, 5547);
              if (null == this.field_p) {
                break L3;
              } else {
                if (null != var5.field_p) {
                  this.field_p.a(var5.field_p, -109);
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              if (null == this.field_u) {
                break L4;
              } else {
                if (var5.field_u == null) {
                  break L4;
                } else {
                  this.field_u.a(var5.field_u, -74);
                  break L4;
                }
              }
            }
            L5: {
              if (param1 < -19) {
                break L5;
              } else {
                this.m(-81);
                break L5;
              }
            }
            L6: {
              tja.a(var5.field_j, 1, this.field_j, false, 5547);
              if (this.field_b == null) {
                break L6;
              } else {
                if (var5.field_b != null) {
                  this.field_b.a(var5.field_b, -25);
                  break L6;
                } else {
                  break L6;
                }
              }
            }
            L7: {
              var4 = 0;
              if (!dn.a(var5.field_k, false, 1, this.field_k, 124)) {
                break L7;
              } else {
                var4 = 1;
                System.out.println("Ship[] ships has changed. ");
                break L7;
              }
            }
            L8: {
              if (!dn.a(hob.a(var5.field_x, 210377952), false, 1, hob.a(this.field_x, 210377952), 123)) {
                break L8;
              } else {
                System.out.println("linklist projectiles has changed. ");
                var4 = 1;
                break L8;
              }
            }
            L9: {
              if (!dn.a(var5.field_m, false, 1, this.field_m, 1)) {
                break L9;
              } else {
                System.out.println("Debris[] debris has changed. ");
                var4 = 1;
                break L9;
              }
            }
            L10: {
              if (null != this.field_e) {
                stackIn_35_0 = 0;
                break L10;
              } else {
                stackIn_35_0 = 1;
                break L10;
              }
            }
            L11: {
              stackIn_38_0 = stackIn_35_0;

              if (var5.field_e != null) {
                stackIn_39_0 = stackIn_38_0;
                stackIn_39_1 = 0;
                break L11;
              } else {
                stackIn_39_0 = stackIn_35_0;
                stackIn_39_1 = 1;
                break L11;
              }
            }
            L12: {
              L13: {
                if ((stackIn_39_0 ^ stackIn_39_1) != 0) {
                  break L13;
                } else {
                  if (null == this.field_e) {
                    break L12;
                  } else {
                    if (this.field_e.a((byte) -90, var5.field_e)) {
                      break L13;
                    } else {
                      break L12;
                    }
                  }
                }
              }
              break L12;
            }
            L14: {
              if (!dn.a(hob.a(var5.field_n, 210377952), false, 1, hob.a(this.field_n, 210377952), 118)) {
                break L14;
              } else {
                var4 = 1;
                System.out.println("linklist spawn_points has changed. ");
                break L14;
              }
            }
            L15: {
              if (!dn.a(var5.field_g, false, 1, this.field_g, -57)) {
                break L15;
              } else {
                var4 = 1;
                System.out.println("GrapplingHook[] grappling_hooks has changed. ");
                break L15;
              }
            }
            L16: {
              if (!ikb.a(this.field_l, var5.field_l, false)) {
                break L16;
              } else {
                System.out.println("int[] respawntimers has changed. ");
                var4 = 1;
                break L16;
              }
            }
            L17: {
              if (var5.field_v) {
                stackIn_55_0 = 0;
                break L17;
              } else {
                stackIn_55_0 = 1;
                break L17;
              }
            }
            L18: {
              stackIn_58_0 = stackIn_55_0;

              if (this.field_v) {
                stackIn_59_0 = stackIn_58_0;
                stackIn_59_1 = 0;
                break L18;
              } else {
                stackIn_59_0 = stackIn_55_0;
                stackIn_59_1 = 1;
                break L18;
              }
            }
            L19: {
              if (stackIn_59_0 == stackIn_59_1) {
                break L19;
              } else {
                System.out.println("boolean debug has changed. before=" + var5.field_v + ", now=" + this.field_v);
                var4 = 1;
                break L19;
              }
            }
            L20: {
              if (var5.field_y != this.field_y) {
                break L20;
              } else {
                break L20;
              }
            }
            L21: {
              if (this.field_i == var5.field_i) {
                break L21;
              } else {
                System.out.println("boolean swapped_teams has changed. before=" + var5.field_i + ", now=" + this.field_i);
                var4 = 1;
                break L21;
              }
            }
            L22: {
              if (null != this.field_f) {
                stackIn_71_0 = 0;
                break L22;
              } else {
                stackIn_71_0 = 1;
                break L22;
              }
            }
            L23: {
              stackIn_74_0 = stackIn_71_0;

              if (var5.field_f != null) {
                stackIn_75_0 = stackIn_74_0;
                stackIn_75_1 = 0;
                break L23;
              } else {
                stackIn_75_0 = stackIn_71_0;
                stackIn_75_1 = 1;
                break L23;
              }
            }
            L24: {
              L25: {
                if ((stackIn_75_0 ^ stackIn_75_1) != 0) {
                  break L25;
                } else {
                  if (this.field_f == null) {
                    break L24;
                  } else {
                    if (!this.field_f.a((byte) -103, var5.field_f)) {
                      break L24;
                    } else {
                      break L25;
                    }
                  }
                }
              }
              var4 = 1;
              System.out.println("MissionControl mission_control has changed. before=" + var5.field_f + ", now=" + this.field_f);
              break L24;
            }
            L26: {
              if (dn.a(var5.field_t, false, 1, this.field_t, 126)) {
                System.out.println("MapZone[] map_zones has changed. ");
                var4 = 1;
                break L26;
              } else {
                break L26;
              }
            }
            L27: {
              if (!dn.a(var5.field_a, false, 1, this.field_a, 123)) {
                break L27;
              } else {
                System.out.println("ResourceNode[] res_nodes has changed. ");
                var4 = 1;
                break L27;
              }
            }
            L28: {
              if (null != var5.field_p) {
                stackIn_90_0 = 0;
                break L28;
              } else {
                stackIn_90_0 = 1;
                break L28;
              }
            }
            L29: {
              stackIn_93_0 = stackIn_90_0;

              if (null != this.field_p) {
                stackIn_94_0 = stackIn_93_0;
                stackIn_94_1 = 0;
                break L29;
              } else {
                stackIn_94_0 = stackIn_90_0;
                stackIn_94_1 = 1;
                break L29;
              }
            }
            L30: {
              L31: {
                if ((stackIn_94_0 ^ stackIn_94_1) != 0) {
                  break L31;
                } else {
                  if (this.field_p == null) {
                    break L30;
                  } else {
                    if (this.field_p.a((byte) -81, var5.field_p)) {
                      break L31;
                    } else {
                      break L30;
                    }
                  }
                }
              }
              break L30;
            }
            L32: {
              if (var5.field_o == this.field_o) {
                break L32;
              } else {
                var4 = 1;
                System.out.println("int width has changed. before=" + var5.field_o + ", now=" + this.field_o);
                break L32;
              }
            }
            L33: {
              if (this.field_r != var5.field_r) {
                break L33;
              } else {
                break L33;
              }
            }
            L34: {
              if (this.field_u != null) {
                stackIn_110_0 = 0;
                break L34;
              } else {
                stackIn_110_0 = 1;
                break L34;
              }
            }
            L35: {
              stackIn_113_0 = stackIn_110_0;

              if (null != var5.field_u) {
                stackIn_114_0 = stackIn_113_0;
                stackIn_114_1 = 0;
                break L35;
              } else {
                stackIn_114_0 = stackIn_110_0;
                stackIn_114_1 = 1;
                break L35;
              }
            }
            L36: {
              L37: {
                if ((stackIn_114_0 ^ stackIn_114_1) != 0) {
                  break L37;
                } else {
                  if (this.field_u == null) {
                    break L36;
                  } else {
                    if (this.field_u.a((byte) 109, var5.field_u)) {
                      break L37;
                    } else {
                      break L36;
                    }
                  }
                }
              }
              break L36;
            }
            L38: {
              if (dn.a(var5.field_j, false, 1, this.field_j, 117)) {
                System.out.println("EscapePod[] escape_pods has changed. ");
                var4 = 1;
                break L38;
              } else {
                break L38;
              }
            }
            L39: {
              if (var5.field_b != null) {
                stackIn_128_0 = 0;
                break L39;
              } else {
                stackIn_128_0 = 1;
                break L39;
              }
            }
            L40: {
              stackIn_131_0 = stackIn_128_0;

              if (this.field_b != null) {
                stackIn_132_0 = stackIn_131_0;
                stackIn_132_1 = 0;
                break L40;
              } else {
                stackIn_132_0 = stackIn_128_0;
                stackIn_132_1 = 1;
                break L40;
              }
            }
            L41: {
              L42: {
                if ((stackIn_132_0 ^ stackIn_132_1) != 0) {
                  break L42;
                } else {
                  if (null == this.field_b) {
                    break L41;
                  } else {
                    if (this.field_b.a((byte) -75, var5.field_b)) {
                      break L42;
                    } else {
                      break L41;
                    }
                  }
                }
              }
              break L41;
            }
            L43: {
              if (var4 == 0) {
                break L43;
              } else {
                System.out.println("This instance of World has changed");
                break L43;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L44: {
            var3 = decompiledCaughtException;
            stackIn_145_0 = (RuntimeException) (var3);

            stackIn_145_1 = new StringBuilder().append("pe.F(");

            if (param0 == null) {
              stackIn_146_0 = (RuntimeException) ((Object) stackIn_145_0);
              stackIn_146_1 = (StringBuilder) ((Object) stackIn_145_1);
              stackIn_146_2 = "null";
              break L44;
            } else {
              stackIn_146_0 = (RuntimeException) ((Object) stackIn_145_0);
              stackIn_146_1 = (StringBuilder) ((Object) stackIn_145_1);
              stackIn_146_2 = "{...}";
              break L44;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_146_0), stackIn_146_2 + ',' + param1 + ')');
        }
    }

    final it[] j(int param0) {
        if (param0 != 0) {
            this.a(57, -43, (anb) null);
        }
        return this.field_j;
    }

    private final void b(int param0, byte param1, anb param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_u.a(param2.field_q, (byte) 94, param2.field_l, param0);
              if (param1 > 123) {
                break L1;
              } else {
                this.field_y = -45;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("pe.R(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    private final boolean a(int param0, ml param1, imb param2, boolean param3, byte param4, sg param5, nbb param6) {
        int var8_int = 0;
        ml var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        lsb var18 = null;
        int var19 = 0;
        int var20 = 0;
        int stackIn_16_0 = 0;
        boolean stackIn_18_0 = false;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        try {
          L0: {
            L1: {
              if (param4 >= 54) {
                break L1;
              } else {
                this.field_h = false;
                break L1;
              }
            }
            L2: {
              if (param6 == null) {
                break L2;
              } else {
                L3: {
                  var8_int = -field_c[1] + param6.field_l;
                  param6 = this.c(var8_int, false);
                  var9 = param6.field_k;
                  var10 = var9.b(125) * fc.a(param6.e(0), (byte) 78) - var9.c((byte) 100) * eu.a(param6.e(0), 58) >> -1136132592;
                  var11 = var9.b(125) * eu.a(param6.e(0), 85) - -(var9.c((byte) 100) * fc.a(param6.e(0), (byte) -120)) >> 1564344720;
                  var12 = var10 + var9.field_r;
                  var13 = var9.field_n - -var11;
                  var14 = -var12 + param2.field_e;
                  var15 = -var13 + param2.field_d;
                  var16 = ar.a(var14, (byte) 118, var15);
                  var17 = var16 >> -321068920;
                  if (var17 > 0) {
                    break L3;
                  } else {
                    var17 = 1;
                    break L3;
                  }
                }
                L4: {
                  var14 = var14 / var17;
                  var15 = var15 / var17;
                  var18 = param1.i((byte) -112).field_o[param0];
                  var19 = var18.field_a + param1.field_b;
                  if (param6.field_k.field_a == null) {
                    break L4;
                  } else {
                    var19 += 4096;
                    break L4;
                  }
                }
                L5: {
                  cqb.a(param2.field_e + fc.a(var19, (byte) -81), param2.field_d - -eu.a(var19, 54), param2.field_d, param2.field_e, (byte) -54);
                  param6.a(param6.e(false) * var15 * 4, param6.d(false), param6.g((byte) 124), (byte) -121, param6.e(false) * (var14 * 4));
                  param6.field_f = 180 * param6.field_f >> -1386611224;
                  param6.field_h = param6.field_h * 180 >> 1689542664;
                  var20 = rrb.a(22433, -param6.e(0) + var19);
                  param6.field_n = (var20 << 364436236) / var17;
                  if (Math.abs(param6.field_n) > Math.abs(var20) << -1919083704) {
                    param6.field_n = var20 << 1102716388;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                param3 = true;
                param5.a(param6.field_l, (byte) -82);
                if ((var16 ^ -1) <= -4097) {
                  break L2;
                } else {
                  if (this.a(param6, param2.field_d, false, param5, 126, param2.field_e)) {
                    param6.field_n = 0;
                    param6.field_p = 0;
                    param6.d((byte) -90);
                    stackIn_16_0 = 0;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            stackIn_18_0 = param3;
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var8 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var8);

            stackIn_22_1 = new StringBuilder().append("pe.HF(").append(param0).append(',');

            if (param1 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L6;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L6;
            }
          }
          L7: {
            stackIn_26_0 = (RuntimeException) ((Object) stackIn_23_0);

            stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');

            if (param2 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L7;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L7;
            }
          }
          L8: {
            stackIn_30_0 = (RuntimeException) ((Object) stackIn_27_0);

            stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L8;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L8;
            }
          }
          L9: {
            stackIn_34_0 = (RuntimeException) ((Object) stackIn_31_0);

            stackIn_34_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',');

            if (param6 == null) {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "null";
              break L9;
            } else {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "{...}";
              break L9;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_35_0), stackIn_35_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_16_0 != 0;
        } else {
          return stackIn_18_0;
        }
    }

    private final boolean a(ml param0, sg param1, ml param2, int param3, int param4, ml param5) {
        boolean discarded$0 = false;
        int stackIn_3_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_38_0 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_51_2 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var13 = 0;
        nbb var14 = null;
        int var15 = 0;
        int var16 = 0;
        imb var17 = null;
        imb var18 = null;
        ml var19 = null;
        ml var20 = null;
        imb var21 = null;
        imb var22 = null;
        ml var23 = null;
        ml var24 = null;
        var15 = VoidHunters.field_G;
        try {
          L0: {
            if (param4 == -17329) {
              L1: {
                if (param0.field_d == null) {
                  break L1;
                } else {
                  if (null == param2.field_d) {
                    break L1;
                  } else {
                    if (param0.field_d.length != param2.field_d.length) {
                      break L1;
                    } else {
                      var7_int = 0;
                      param1.a(-1, (byte) -92);
                      if (param3 == 0) {
                        var16 = 0;
                        var8 = var16;
                        L2: while (true) {
                          if (param0.field_d.length <= var16) {
                            break L1;
                          } else {
                            L3: {
                              var21 = param0.field_d[var16];
                              var24 = param0.d(var21.field_c, 692);
                              var22 = param2.field_d[var16];
                              var23 = param2.d(var22.field_c, param4 + 18021);
                              if (null == var23) {
                                break L3;
                              } else {
                                L4: {
                                  if (var24 == null) {
                                    break L4;
                                  } else {
                                    if (var23.field_j == var24.field_j) {
                                      break L3;
                                    } else {
                                      break L4;
                                    }
                                  }
                                }
                                L5: {
                                  var13 = var23.field_j;
                                  var14 = this.a(var21.field_e, param1.d(false), var21.field_d, (byte) 30, param1.g((byte) -29), var13);
                                  if (var14 != null) {
                                    break L5;
                                  } else {
                                    discarded$0 = this.a(param1.field_k, param5, 0, param1, var13);
                                    var14 = this.a(var21.field_e, param1.d(false), var21.field_d, (byte) 30, param1.g((byte) -23), var13);
                                    break L5;
                                  }
                                }
                                L6: {
                                  if (!this.a(var16, param0, var21, var7_int != 0, (byte) 95, param1, var14)) {
                                    stackIn_30_0 = 0;
                                    break L6;
                                  } else {
                                    stackIn_30_0 = 1;
                                    break L6;
                                  }
                                }
                                var7_int = stackIn_30_0;
                                break L3;
                              }
                            }
                            if (var7_int != 0) {
                              stackIn_35_0 = 1;
                              decompiledRegionSelector0 = 2;
                              break L0;
                            } else {
                              var16++;
                              continue L2;
                            }
                          }
                        }
                      } else {
                        var8 = 0;
                        L7: while (true) {
                          if (param0.field_d.length <= var8) {
                            return false;
                          } else {
                            L8: {
                              var17 = param0.field_d[var8];
                              var21 = var17;
                              var21 = var17;
                              var19 = param0.d(var17.field_c, 692);
                              var18 = param2.field_d[var8];
                              var21 = var18;
                              var21 = var18;
                              var20 = param2.d(var18.field_c, 692);
                              if (var19 == null) {
                                break L8;
                              } else {
                                if (var20 == null) {
                                  break L8;
                                } else {
                                  if (!this.a(var19, param1, var20, param3 + -1, -17329, param5)) {
                                    break L8;
                                  } else {
                                    var7_int = 1;
                                    break L8;
                                  }
                                }
                              }
                            }
                            if (var7_int == 0) {
                              var8++;
                              continue L7;
                            } else {
                              stackIn_16_0 = 1;
                              decompiledRegionSelector0 = 1;
                              break L0;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              stackIn_38_0 = 0;
              decompiledRegionSelector0 = 3;
              break L0;
            } else {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var7 = decompiledCaughtException;
            stackIn_42_0 = (RuntimeException) (var7);

            stackIn_42_1 = new StringBuilder().append("pe.PD(");

            if (param0 == null) {
              stackIn_43_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "null";
              break L9;
            } else {
              stackIn_43_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "{...}";
              break L9;
            }
          }
          L10: {
            stackIn_46_0 = (RuntimeException) ((Object) stackIn_43_0);

            stackIn_46_1 = ((StringBuilder) (Object) stackIn_43_1).append(stackIn_43_2).append(',');

            if (param1 == null) {
              stackIn_47_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackIn_47_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackIn_47_2 = "null";
              break L10;
            } else {
              stackIn_47_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackIn_47_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackIn_47_2 = "{...}";
              break L10;
            }
          }
          L11: {
            stackIn_50_0 = (RuntimeException) ((Object) stackIn_47_0);

            stackIn_50_1 = ((StringBuilder) (Object) stackIn_47_1).append(stackIn_47_2).append(',');

            if (param2 == null) {
              stackIn_51_0 = (RuntimeException) ((Object) stackIn_50_0);
              stackIn_51_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackIn_51_2 = "null";
              break L11;
            } else {
              stackIn_51_0 = (RuntimeException) ((Object) stackIn_47_0);
              stackIn_51_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackIn_51_2 = "{...}";
              break L11;
            }
          }
          L12: {
            stackIn_54_0 = (RuntimeException) ((Object) stackIn_51_0);

            stackIn_54_1 = ((StringBuilder) (Object) stackIn_51_1).append(stackIn_51_2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_55_0 = (RuntimeException) ((Object) stackIn_54_0);
              stackIn_55_1 = (StringBuilder) ((Object) stackIn_54_1);
              stackIn_55_2 = "null";
              break L12;
            } else {
              stackIn_55_0 = (RuntimeException) ((Object) stackIn_51_0);
              stackIn_55_1 = (StringBuilder) ((Object) stackIn_54_1);
              stackIn_55_2 = "{...}";
              break L12;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_55_0), stackIn_55_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_16_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_35_0 != 0;
            } else {
              return stackIn_38_0 != 0;
            }
          }
        }
    }

    final int d(boolean param0) {
        if (param0) {
            this.a(-85, 55);
        }
        return this.field_y;
    }

    final int e(boolean param0) {
        if (!param0) {
            this.e(true);
        }
        if (null == this.field_t) {
            return 0;
        }
        return this.field_t.length;
    }

    final void a(byte param0, rdb param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_n.b(-10258, param1);
              if (param0 <= -51) {
                break L1;
              } else {
                this.e(16, -28);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("pe.TA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    private final void a(int param0, boolean param1, int param2) {
        qob var6;
        var6 = this.field_p.a((byte) 54, param2);
        var6 = var6;
        if (param0 == 0) {
          L0: {
            if (param1) {
              this.field_u.a(new int[]{var6.a(true) - 16384, 16384 + var6.a(true), var6.a((byte) -123) + -16384, var6.a((byte) -81) - -16384}, param2, 0, true, 0);
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

    final void a(int param0, boolean param1, nwa param2, tfa[] param3, lbb param4, int param5, tfa[] param6) {
        boolean discarded$0 = false;
        nbb stackIn_29_0;
        Object stackIn_29_1;
        int stackIn_29_2;
        int stackIn_29_3;
        nbb stackIn_30_0;
        Object stackIn_30_1;
        int stackIn_30_2;
        int stackIn_30_3;
        int stackIn_30_4;
        nbb stackIn_37_0;
        Object stackIn_37_1;
        int stackIn_37_2;
        int stackIn_37_3;
        nbb stackIn_38_0;
        Object stackIn_38_1;
        int stackIn_38_2;
        int stackIn_38_3;
        int stackIn_38_4;
        int stackIn_64_0 = 0;
        RuntimeException stackIn_115_0 = null;
        StringBuilder stackIn_115_1 = null;
        RuntimeException stackIn_116_0 = null;
        StringBuilder stackIn_116_1 = null;
        String stackIn_116_2 = null;
        RuntimeException stackIn_119_0 = null;
        StringBuilder stackIn_119_1 = null;
        RuntimeException stackIn_120_0 = null;
        StringBuilder stackIn_120_1 = null;
        String stackIn_120_2 = null;
        RuntimeException stackIn_123_0 = null;
        StringBuilder stackIn_123_1 = null;
        RuntimeException stackIn_124_0 = null;
        StringBuilder stackIn_124_1 = null;
        String stackIn_124_2 = null;
        RuntimeException stackIn_127_0 = null;
        StringBuilder stackIn_127_1 = null;
        RuntimeException stackIn_128_0 = null;
        StringBuilder stackIn_128_1 = null;
        String stackIn_128_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        sg[] var14_ref_sg__ = null;
        int var14 = 0;
        int var15_int = 0;
        Object var15 = null;
        int var16 = 0;
        Object[] var16_ref = null;
        mqb[] var16_ref_mqb__ = null;
        nbb var16_ref_nbb = null;
        sg var16_ref_sg = null;
        int var17 = 0;
        int var18_int = 0;
        Object var18 = null;
        mqb var18_ref = null;
        int var19 = 0;
        Object var20 = null;
        nbb var20_ref = null;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        Object var24 = null;
        Object[] var25 = null;
        Object var26 = null;
        mqb[] var27 = null;
        mqb var28 = null;
        it[] var29 = null;
        it var30 = null;
        sg[] var31 = null;
        sg var32 = null;
        nbb var33 = null;
        nbb var34 = null;
        tj var35 = null;
        var24 = null;
        var21 = VoidHunters.field_G;
        try {
          L0: {
            oua.field_a = param1;
            th.field_o = param5;
            vg.field_o = new Random((long)(10234 * th.field_o));
            ccb.field_a.c(39);
            this.field_e.a(true);
            this.a(param4, param6, (byte) -40, param2);
            this.a(param3, 1, param6, param5);
            var8_int = this.field_o >> 720963745;
            var9 = this.field_r >> -230032959;
            var10 = -var8_int;
            var11 = var8_int;
            var12 = -var9;
            var13 = var9;
            var14_ref_sg__ = this.field_k;
            var15_int = 0;
            L1: while (true) {
              if (var15_int >= var14_ref_sg__.length) {
                L2: {
                  if (param0 == 1799937864) {
                    break L2;
                  } else {
                    discarded$0 = this.a((ml) null, (sg) null, (ml) null, 27, 102, (ml) null);
                    break L2;
                  }
                }
                var35 = (tj) ((Object) this.field_x.d(0));
                L3: while (true) {
                  if (var35 == null) {
                    var14 = 0;
                    L4: while (true) {
                      if (this.field_s.length <= var14) {
                        var14 = 0;
                        var22 = 0;
                        var15_int = var22;
                        L5: while (true) {
                          if (this.field_m.length <= var22) {
                            L6: {
                              if (var14 > kva.field_g) {
                                var15 = null;
                                var16 = hob.a(vg.field_o, var14, 123);
                                var17 = 0;
                                var18_int = 0;
                                L7: while (true) {
                                  L8: {
                                    if (this.field_m.length <= var18_int) {
                                      break L8;
                                    } else {
                                      L9: {
                                        if (this.field_m[var18_int] != null) {
                                          if (var17 != var16) {
                                            var17++;
                                            break L9;
                                          } else {
                                            var15 = this.field_m[var18_int];
                                            var20 = var15;
                                            var20 = var15;
                                            break L8;
                                          }
                                        } else {
                                          break L9;
                                        }
                                      }
                                      var18_int++;
                                      continue L7;
                                    }
                                  }
                                  if (var15 == null) {
                                    break L6;
                                  } else {
                                    if (((anb) (var15)).field_k.k(0) != 47) {
                                      this.a(param0 ^ -1799937853, 1, (anb) (var15));
                                      break L6;
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                              } else {
                                break L6;
                              }
                            }
                            var15 = this.field_e.c(0);
                            var25 = (Object[]) (Object) (var15);
                            var16_ref = var25;
                            var17 = 0;
                            L10: while (true) {
                              if (var25.length <= var17) {
                                var27 = this.field_g;
                                var16_ref_mqb__ = var27;
                                var17 = 0;
                                L11: while (true) {
                                  if (var17 >= var27.length) {
                                    L12: {
                                      if (this.field_j != null) {
                                        var29 = this.field_j;
                                        var17 = 0;
                                        L13: while (true) {
                                          if (var17 >= var29.length) {
                                            break L12;
                                          } else {
                                            var30 = var29[var17];
                                            var30.c((byte) -7);
                                            var17++;
                                            continue L13;
                                          }
                                        }
                                      } else {
                                        break L12;
                                      }
                                    }
                                    this.a(false, param4, (byte) -117, (lta) null);
                                    this.a(param0 ^ 1799937866, param2, param6);
                                    this.a(param0 + -1799937751, param5, param6, param4);
                                    var31 = this.field_k;
                                    var17 = 0;
                                    L14: while (true) {
                                      if (var17 >= var31.length) {
                                        var16_ref_mqb__ = this.field_g;
                                        var17 = 0;
                                        L15: while (true) {
                                          if (var16_ref_mqb__.length <= var17) {
                                            var16_ref = (Object[]) (Object) (var15);
                                            var17 = 0;
                                            L16: while (true) {
                                              if (var17 >= var16_ref.length) {
                                                var23 = 0;
                                                var16 = var23;
                                                L17: while (true) {
                                                  if (var23 >= this.field_m.length) {
                                                    break L0;
                                                  } else {
                                                    var33 = this.field_m[var23];
                                                    if (var33 != null) {
                                                      L18: {
                                                        if (-1 != (var33.field_t ^ -1)) {
                                                          break L18;
                                                        } else {
                                                          if (-1 != (var33.field_o ^ -1)) {
                                                            break L18;
                                                          } else {
                                                            if (var33.field_p != 0) {
                                                              break L18;
                                                            } else {
                                                              var23++;
                                                              continue L17;
                                                            }
                                                          }
                                                        }
                                                      }
                                                      var34 = this.c(var23, false);
                                                      var34.b(24, var34.field_s);
                                                      var23++;
                                                      continue L17;
                                                    } else {
                                                      var23++;
                                                      continue L17;
                                                    }
                                                  }
                                                }
                                              } else {
                                                L19: {
                                                  var18 = var16_ref[var17];
                                                  if (var18 != null) {
                                                    ((crb) (var18)).b(24, ((crb) (var18)).field_s);
                                                    break L19;
                                                  } else {
                                                    break L19;
                                                  }
                                                }
                                                var17++;
                                                continue L16;
                                              }
                                            }
                                          } else {
                                            L20: {
                                              var18_ref = var16_ref_mqb__[var17];
                                              if (var18_ref != null) {
                                                var18_ref.b(24, var18_ref.field_s);
                                                break L20;
                                              } else {
                                                break L20;
                                              }
                                            }
                                            var17++;
                                            continue L15;
                                          }
                                        }
                                      } else {
                                        var32 = var31[var17];
                                        if (null != var32) {
                                          L21: {
                                            var19 = 0;
                                            if ((var32.x(96) ^ -1) == 0) {
                                              break L21;
                                            } else {
                                              var20_ref = this.i(21363, var32.x(param0 ^ -1799937855));
                                              if (null != var20_ref) {
                                                var19 = var20_ref.e(false);
                                                break L21;
                                              } else {
                                                break L21;
                                              }
                                            }
                                          }
                                          var32.b(24, var19 + var32.field_s);
                                          var17++;
                                          continue L14;
                                        } else {
                                          var17++;
                                          continue L14;
                                        }
                                      }
                                    }
                                  } else {
                                    var28 = var27[var17];
                                    var18_ref = var28;
                                    if (var28 != null) {
                                      var28.b(24, var28.field_s);
                                      var28.a((pe) (this), true, (byte) 67, true);
                                      var17++;
                                      continue L11;
                                    } else {
                                      var17++;
                                      continue L11;
                                    }
                                  }
                                }
                              } else {
                                var26 = var25[var17];
                                var18 = var26;
                                if (var26 != null) {
                                  L22: {
                                    if (!((crb) (var26)).b(var12, 2147483647, var13, var10, var11)) {
                                      stackIn_64_0 = 0;
                                      break L22;
                                    } else {
                                      stackIn_64_0 = 1;
                                      break L22;
                                    }
                                  }
                                  var19 = stackIn_64_0;
                                  ((crb) (var26)).a((pe) (this), var19 != 0, (byte) 67, true);
                                  var17++;
                                  continue L10;
                                } else {
                                  var17++;
                                  continue L10;
                                }
                              }
                            }
                          } else {
                            L23: {
                              var16_ref_nbb = this.field_m[var22];
                              if (var16_ref_nbb != null) {
                                var14++;
                                if (!var16_ref_nbb.c(var13, var11, param0 ^ 1799937849, var12, var10)) {
                                  if (var16_ref_nbb.k(param0 ^ 1344029312)) {
                                    L24: {
                                      var16_ref_nbb = this.c(var22, false);
                                      stackIn_37_0 = (nbb) (var16_ref_nbb);

                                      stackIn_37_1 = this;

                                      stackIn_37_2 = 0;

                                      stackIn_37_3 = 67;

                                      if (-2 != (hw.field_b ^ -1)) {
                                        stackIn_38_0 = (nbb) ((Object) stackIn_37_0);
                                        stackIn_38_1 = this;
                                        stackIn_38_2 = stackIn_37_2;
                                        stackIn_38_3 = stackIn_37_3;
                                        stackIn_38_4 = 0;
                                        break L24;
                                      } else {
                                        stackIn_38_0 = (nbb) ((Object) stackIn_37_0);
                                        stackIn_38_1 = this;
                                        stackIn_38_2 = stackIn_37_2;
                                        stackIn_38_3 = stackIn_37_3;
                                        stackIn_38_4 = 1;
                                        break L24;
                                      }
                                    }
                                    ((nbb) (Object) stackIn_38_0).a((pe) (this), stackIn_38_2 != 0, (byte) stackIn_38_3, stackIn_38_4 != 0);
                                    break L23;
                                  } else {
                                    break L23;
                                  }
                                } else {
                                  L25: {
                                    var16_ref_nbb = this.c(var22, false);
                                    var16_ref_nbb.b(var12, 2147483647, var13, var10, var11);
                                    stackIn_29_0 = (nbb) (var16_ref_nbb);

                                    stackIn_29_1 = this;

                                    stackIn_29_2 = 1;

                                    stackIn_29_3 = 67;

                                    if (hw.field_b != 1) {
                                      stackIn_30_0 = (nbb) ((Object) stackIn_29_0);
                                      stackIn_30_1 = this;
                                      stackIn_30_2 = stackIn_29_2;
                                      stackIn_30_3 = stackIn_29_3;
                                      stackIn_30_4 = 0;
                                      break L25;
                                    } else {
                                      stackIn_30_0 = (nbb) ((Object) stackIn_29_0);
                                      stackIn_30_1 = this;
                                      stackIn_30_2 = stackIn_29_2;
                                      stackIn_30_3 = stackIn_29_3;
                                      stackIn_30_4 = 1;
                                      break L25;
                                    }
                                  }
                                  ((nbb) (Object) stackIn_30_0).a((pe) (this), stackIn_30_2 != 0, (byte) stackIn_30_3, stackIn_30_4 != 0);
                                  break L23;
                                }
                              } else {
                                break L23;
                              }
                            }
                            var22++;
                            continue L5;
                          }
                        }
                      } else {
                        L26: {
                          if (this.field_s[var14].b((byte) -126)) {
                            this.field_s[var14].a(-8460);
                            break L26;
                          } else {
                            break L26;
                          }
                        }
                        var14++;
                        continue L4;
                      }
                    }
                  } else {
                    var35.a((byte) 93, (pe) (this));
                    var35 = (tj) ((Object) this.field_x.a((byte) 101));
                    continue L3;
                  }
                }
              } else {
                L27: {
                  var16_ref_sg = var14_ref_sg__[var15_int];
                  if (var16_ref_sg != null) {
                    var16_ref_sg.b(var12, param0 ^ 347545783, var13, var10, var11);
                    break L27;
                  } else {
                    break L27;
                  }
                }
                var15_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L28: {
            var8 = decompiledCaughtException;
            stackIn_115_0 = (RuntimeException) (var8);

            stackIn_115_1 = new StringBuilder().append("pe.BA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_116_0 = (RuntimeException) ((Object) stackIn_115_0);
              stackIn_116_1 = (StringBuilder) ((Object) stackIn_115_1);
              stackIn_116_2 = "null";
              break L28;
            } else {
              stackIn_116_0 = (RuntimeException) ((Object) stackIn_115_0);
              stackIn_116_1 = (StringBuilder) ((Object) stackIn_115_1);
              stackIn_116_2 = "{...}";
              break L28;
            }
          }
          L29: {
            stackIn_119_0 = (RuntimeException) ((Object) stackIn_116_0);

            stackIn_119_1 = ((StringBuilder) (Object) stackIn_116_1).append(stackIn_116_2).append(',');

            if (param3 == null) {
              stackIn_120_0 = (RuntimeException) ((Object) stackIn_119_0);
              stackIn_120_1 = (StringBuilder) ((Object) stackIn_119_1);
              stackIn_120_2 = "null";
              break L29;
            } else {
              stackIn_120_0 = (RuntimeException) ((Object) stackIn_116_0);
              stackIn_120_1 = (StringBuilder) ((Object) stackIn_119_1);
              stackIn_120_2 = "{...}";
              break L29;
            }
          }
          L30: {
            stackIn_123_0 = (RuntimeException) ((Object) stackIn_120_0);

            stackIn_123_1 = ((StringBuilder) (Object) stackIn_120_1).append(stackIn_120_2).append(',');

            if (param4 == null) {
              stackIn_124_0 = (RuntimeException) ((Object) stackIn_123_0);
              stackIn_124_1 = (StringBuilder) ((Object) stackIn_123_1);
              stackIn_124_2 = "null";
              break L30;
            } else {
              stackIn_124_0 = (RuntimeException) ((Object) stackIn_120_0);
              stackIn_124_1 = (StringBuilder) ((Object) stackIn_123_1);
              stackIn_124_2 = "{...}";
              break L30;
            }
          }
          L31: {
            stackIn_127_0 = (RuntimeException) ((Object) stackIn_124_0);

            stackIn_127_1 = ((StringBuilder) (Object) stackIn_124_1).append(stackIn_124_2).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_128_0 = (RuntimeException) ((Object) stackIn_127_0);
              stackIn_128_1 = (StringBuilder) ((Object) stackIn_127_1);
              stackIn_128_2 = "null";
              break L31;
            } else {
              stackIn_128_0 = (RuntimeException) ((Object) stackIn_124_0);
              stackIn_128_1 = (StringBuilder) ((Object) stackIn_127_1);
              stackIn_128_2 = "{...}";
              break L31;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_128_0), stackIn_128_2 + ')');
        }
    }

    final void b(int param0, byte param1) {
        if (param1 != 23) {
            return;
        }
        this.field_y = param0;
    }

    private final boolean a(anb param0, int param1, tj param2) {
        ml var4 = null;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        try {
          L0: {
            L1: {
              if (!param2.c(112)) {
                param0.a(gab.field_b, param2, -4414);
                if (!gab.field_b.a((byte) -97)) {
                  break L1;
                } else {
                  wgb.field_i = param0;
                  stackIn_6_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                var4 = wna.field_c.field_b;
                param0.a(wna.field_c, param2, (byte) 104);
                if (wna.field_c.field_b == var4) {
                  break L1;
                } else {
                  wgb.field_i = param0;
                  break L1;
                }
              }
            }
            if (param1 >= 29) {
              stackIn_11_0 = 0;
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackIn_9_0 = 1;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var4_ref);

            stackIn_15_1 = new StringBuilder().append("pe.U(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L2;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L2;
            }
          }
          L3: {
            stackIn_19_0 = (RuntimeException) ((Object) stackIn_16_0);

            stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L3;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0 != 0;
          } else {
            return stackIn_11_0 != 0;
          }
        }
    }

    private final void a(tfa[] param0, int param1, tfa[] param2, int param3) {
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_87_0 = null;
        StringBuilder stackIn_87_1 = null;
        RuntimeException stackIn_88_0 = null;
        StringBuilder stackIn_88_1 = null;
        String stackIn_88_2 = null;
        RuntimeException stackIn_91_0 = null;
        StringBuilder stackIn_91_1 = null;
        RuntimeException stackIn_92_0 = null;
        StringBuilder stackIn_92_1 = null;
        String stackIn_92_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        sg[] var9 = null;
        int var10 = 0;
        sg var11 = null;
        tfa var12 = null;
        tfa var13 = null;
        aoa var14_ref_aoa = null;
        int var14 = 0;
        int var15 = 0;
        sg var16 = null;
        int var17 = 0;
        var17 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var5_int = wra.field_p;
              var6 = uja.field_b;
              if (param1 == fra.field_a) {
                var5_int = var5_int * lja.field_d;
                var6 = var6 * lja.field_d;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param3 % var5_int != 0) {
                stackIn_9_0 = 0;
                break L2;
              } else {
                stackIn_9_0 = 1;
                break L2;
              }
            }
            L3: {
              var7 = stackIn_9_0;
              if (-1 != (param3 % var6 ^ -1)) {
                stackIn_13_0 = 0;
                break L3;
              } else {
                stackIn_13_0 = 1;
                break L3;
              }
            }
            var8 = stackIn_13_0;
            var9 = this.field_k;
            var10 = 0;
            L4: while (true) {
              if (var9.length <= var10) {
                break L0;
              } else {
                L5: {
                  var11 = var9[var10];
                  var16 = var11;
                  var16 = var11;
                  if (null != var11) {
                    L6: {
                      L7: {
                        if ((var11.o((byte) -117) ^ -1) > -1) {
                          break L7;
                        } else {
                          if (var11.l((byte) -10)) {
                            break L7;
                          } else {
                            L8: {
                              L9: {
                                var12 = param2[var11.o((byte) -117)];
                                var13 = param0[var11.o((byte) -117)];
                                if (var12.field_a) {
                                  break L9;
                                } else {
                                  if (foa.field_p != 1) {
                                    break L9;
                                  } else {
                                    var14_ref_aoa = new aoa();
                                    var11.a((pe) (this), true, (byte) 67, true);
                                    var14_ref_aoa.a(var11, (byte) -73, (pe) (this));
                                    if (!pqa.a(4096, 11284)) {
                                      break L8;
                                    } else {
                                      var11.a(var14_ref_aoa, param1 + 3);
                                      break L8;
                                    }
                                  }
                                }
                              }
                              if (var11.d(9, 42)) {
                                var11.a((pe) (this), true, (byte) 67, true);
                                break L8;
                              } else {
                                if (!var11.a((pe) (this), var12.field_d, var12.field_e, 0)) {
                                  if (4 != var12.field_b) {
                                    break L8;
                                  } else {
                                    var11.a(param1 ^ -93, var12.field_b, (pe) (this), var12.field_e, var12.field_d);
                                    break L8;
                                  }
                                } else {
                                  L10: {
                                    var15 = this.a(var12, -72, var13, var11) ? 1 : 0;
                                    if ((di.field_p ^ -1) != -2) {
                                      break L10;
                                    } else {
                                      if ((lrb.field_e ^ -1) != -2) {
                                        break L10;
                                      } else {
                                        if (var11.field_w) {
                                          if ((var12.field_f & 128) != 0) {
                                            var11.a(-114, var12.field_e, var12.field_d);
                                            var11.field_w = false;
                                            break L10;
                                          } else {
                                            break L10;
                                          }
                                        } else {
                                          break L10;
                                        }
                                      }
                                    }
                                  }
                                  L11: {
                                    if (var15 != 0) {
                                      L12: {
                                        if (1 == bnb.field_o) {
                                          var16 = gca.a((pe) (this), (byte) 63, var11.o((byte) -117), var11);
                                          if (var16 == null) {
                                            break L12;
                                          } else {
                                            var12.field_d = var16.d(false);
                                            var12.field_e = var16.g((byte) -19);
                                            break L12;
                                          }
                                        } else {
                                          break L12;
                                        }
                                      }
                                      if (di.field_p != 0) {
                                        break L11;
                                      } else {
                                        var11.a(param1 + -126, var12.field_e, var12.field_d);
                                        break L11;
                                      }
                                    } else {
                                      break L11;
                                    }
                                  }
                                  var11.a((pe) (this), true, (byte) 67, true);
                                  var11.a((pe) (this), var12.field_f, false, var12.field_d, var12.field_e);
                                  var11.a(-71, var12.field_b, (pe) (this), var12.field_e, var12.field_d);
                                  break L8;
                                }
                              }
                            }
                            if (var11.d(4, 99)) {
                              break L6;
                            } else {
                              if (var7 == 0) {
                                break L6;
                              } else {
                                var14 = var11.c(gka.field_q, (byte) -2);
                                if (1 != qrb.field_a) {
                                  break L6;
                                } else {
                                  if (0 >= var14) {
                                    break L6;
                                  } else {
                                    L13: {
                                      if (var12.field_g == null) {
                                        var12.field_g = new sg();
                                        break L13;
                                      } else {
                                        break L13;
                                      }
                                    }
                                    var11.b((byte) 113, var12.field_g);
                                    break L6;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      if (var11.l((byte) -10)) {
                        L14: {
                          var11.a((pe) (this), true, (byte) 67, true);
                          if (!this.field_v) {
                            var11.a(true, (pe) (this));
                            break L14;
                          } else {
                            break L14;
                          }
                        }
                        if (var11.field_k.k(0) == 0) {
                          if (param3 % wj.field_p != 0) {
                            break L6;
                          } else {
                            var11.c(bjb.field_o, (byte) -2);
                            break L6;
                          }
                        } else {
                          if (var8 == 0) {
                            break L6;
                          } else {
                            var11.c(ela.field_q, (byte) -2);
                            break L6;
                          }
                        }
                      } else {
                        var11.a((pe) (this), false, (byte) 67, true);
                        break L6;
                      }
                    }
                    L15: {
                      if ((fra.field_a ^ -1) != -2) {
                        break L15;
                      } else {
                        if (1 != ee.field_p) {
                          break L15;
                        } else {
                          if ((var11.o(94) ^ -1) <= -256) {
                            break L15;
                          } else {
                            if (var11.field_T) {
                              var11.a((byte) 11, 65536);
                              var11.field_T = false;
                              break L5;
                            } else {
                              var11.field_T = true;
                              break L5;
                            }
                          }
                        }
                      }
                    }
                    var11.field_T = false;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                var10++;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var5 = decompiledCaughtException;
            stackIn_87_0 = (RuntimeException) (var5);

            stackIn_87_1 = new StringBuilder().append("pe.M(");

            if (param0 == null) {
              stackIn_88_0 = (RuntimeException) ((Object) stackIn_87_0);
              stackIn_88_1 = (StringBuilder) ((Object) stackIn_87_1);
              stackIn_88_2 = "null";
              break L16;
            } else {
              stackIn_88_0 = (RuntimeException) ((Object) stackIn_87_0);
              stackIn_88_1 = (StringBuilder) ((Object) stackIn_87_1);
              stackIn_88_2 = "{...}";
              break L16;
            }
          }
          L17: {
            stackIn_91_0 = (RuntimeException) ((Object) stackIn_88_0);

            stackIn_91_1 = ((StringBuilder) (Object) stackIn_88_1).append(stackIn_88_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_92_0 = (RuntimeException) ((Object) stackIn_91_0);
              stackIn_92_1 = (StringBuilder) ((Object) stackIn_91_1);
              stackIn_92_2 = "null";
              break L17;
            } else {
              stackIn_92_0 = (RuntimeException) ((Object) stackIn_88_0);
              stackIn_92_1 = (StringBuilder) ((Object) stackIn_91_1);
              stackIn_92_2 = "{...}";
              break L17;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_92_0), stackIn_92_2 + ',' + param3 + ')');
        }
    }

    private final boolean a(boolean param0, boolean param1, int param2) {
        int var4;
        sg var5;
        int var6;
        var6 = VoidHunters.field_G;
        if (!param1) {
          var4 = 0;
          L0: while (true) {
            if (this.field_k.length <= var4) {
              return false;
            } else {
              var5 = this.field_k[var4];
              if (null != var5) {
                if (var5.x(-108) == param2) {
                  if (!param0) {
                    return true;
                  } else {
                    if (null == var5.n((byte) 28)) {
                      return true;
                    } else {
                      var4++;
                      continue L0;
                    }
                  }
                } else {
                  var4++;
                  continue L0;
                }
              } else {
                var4++;
                continue L0;
              }
            }
          }
        } else {
          return true;
        }
    }

    final int m(int param0) {
        if (param0 != 1) {
            return 101;
        }
        return this.field_r;
    }

    private final void a(crb[] param0, boolean param1, ij param2) {
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        crb var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        crb var9 = null;
        int var11 = 0;
        var11 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                this.field_t = (cq[]) null;
                break L1;
              }
            }
            var4_int = 0;
            L2: while (true) {
              if (var4_int >= -1 + param0.length) {
                break L0;
              } else {
                var5 = param0[var4_int];
                if (null != var5) {
                  if (var5.field_k != null) {
                    if (!var5.field_k.k((byte) 72)) {
                      if (var5.k(995401160)) {
                        var6 = this.field_u.a(var5.field_l, var5.field_q, 3, -100);
                        var7 = 0;
                        L3: while (true) {
                          if (var7 < var6) {
                            var8 = ada.field_a[var7] - field_c[2];
                            var9 = param0[var8];
                            if (null != var9) {
                              if (var9.field_k != null) {
                                if (!var9.field_k.k((byte) 68)) {
                                  L4: {
                                    if (var4_int > var8) {
                                      break L4;
                                    } else {
                                      if (!var9.k(995401160)) {
                                        break L4;
                                      } else {
                                        var7++;
                                        continue L3;
                                      }
                                    }
                                  }
                                  L5: {
                                    if (!this.a(true, 2, gkb.field_o, (byte) 76, true, var9, 2, var5, param2)) {
                                      break L5;
                                    } else {
                                      this.field_e.b(-101);
                                      break L5;
                                    }
                                  }
                                  if (null != var5.field_k) {
                                    if (!var5.field_k.k((byte) 117)) {
                                      var7++;
                                      continue L3;
                                    } else {
                                      var4_int++;
                                      continue L2;
                                    }
                                  } else {
                                    var4_int++;
                                    continue L2;
                                  }
                                } else {
                                  var7++;
                                  continue L3;
                                }
                              } else {
                                var7++;
                                continue L3;
                              }
                            } else {
                              var7++;
                              continue L3;
                            }
                          } else {
                            var4_int++;
                            continue L2;
                          }
                        }
                      } else {
                        var4_int++;
                        continue L2;
                      }
                    } else {
                      var4_int++;
                      continue L2;
                    }
                  } else {
                    var4_int++;
                    continue L2;
                  }
                } else {
                  var4_int++;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackIn_38_0 = (RuntimeException) (var4);

            stackIn_38_1 = new StringBuilder().append("pe.IF(");

            if (param0 == null) {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "null";
              break L6;
            } else {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "{...}";
              break L6;
            }
          }
          L7: {
            stackIn_42_0 = (RuntimeException) ((Object) stackIn_39_0);

            stackIn_42_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_39_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_43_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "null";
              break L7;
            } else {
              stackIn_43_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "{...}";
              break L7;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_43_0), stackIn_43_2 + ')');
        }
    }

    private final boolean a(boolean param0, int param1, int param2, byte param3, boolean param4, anb param5, int param6, anb param7, ij param8) {
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_46_0 = 0;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_51_2 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_59_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
        int var11 = 0;
        Object var12 = null;
        gda var12_ref = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        var12 = null;
        var18 = VoidHunters.field_G;
        try {
          L0: {
            if (!rna.a(param7.field_q, param5.field_q, -115)) {
              stackIn_5_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param3 >= 40) {
                L1: {
                  param7.field_k.a(param8, param5.field_k, 0, (byte) 125, 0);
                  var10_int = 0;
                  if (param8.b(126)) {
                    L2: {
                      var10_int = 1;
                      if (3 != param6) {
                        break L2;
                      } else {
                        param5.field_k.a(param7.field_k, param7.field_e, 0, param7.field_d, 0, param7.g(-106), param8, 0, 0);
                        break L2;
                      }
                    }
                    if ((param1 ^ -1) == -4) {
                      param7.field_k.a(param5.field_k, param5.field_e, 0, param5.field_d, 0, param5.g(-68), param8, 0, 0);
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    break L1;
                  }
                }
                if (!param8.b(-56)) {
                  var11 = 1;
                  var12_ref = (gda) ((Object) param8.d(0));
                  L3: while (true) {
                    if (null == var12_ref) {
                      param8.e(120);
                      stackIn_46_0 = 1;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      L4: {
                        if (var10_int != 0) {
                          break L4;
                        } else {
                          if (!param4) {
                            break L4;
                          } else {
                            this.a(param7, param5, var12_ref, 46, param0);
                            break L4;
                          }
                        }
                      }
                      L5: {
                        var13 = this.a(param6, var12_ref.field_m, param7, (byte) 109, var12_ref.field_i, var12_ref.field_h, param5, var12_ref.field_g, param1) ? 1 : 0;
                        if (var10_int == 0) {
                          L6: {
                            if (var13 != 0) {
                              this.a(param7, var12_ref, -116, param2, param5);
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                          if (var11 == 0) {
                            break L5;
                          } else {
                            L7: {
                              L8: {
                                if ((param6 ^ -1) != -3) {
                                  break L8;
                                } else {
                                  if (param1 == 2) {
                                    break L7;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                              if (3 == param6) {
                                break L7;
                              } else {
                                if ((param1 ^ -1) == -4) {
                                  break L7;
                                } else {
                                  L9: {
                                    var14 = param7.field_f + -param5.field_f;
                                    var15 = param7.field_h - param5.field_h;
                                    var16 = ar.a(var14, (byte) 112, var15) >> 1261060994;
                                    var17 = 48;
                                    if (!param0) {
                                      var17 = 52;
                                      break L9;
                                    } else {
                                      break L9;
                                    }
                                  }
                                  fnb.a(50, var12_ref.field_l, var12_ref.field_e, false, var17, var16);
                                  break L7;
                                }
                              }
                            }
                            var11 = 0;
                            break L5;
                          }
                        } else {
                          break L5;
                        }
                      }
                      var12_ref = (gda) ((Object) param8.a((byte) 8));
                      continue L3;
                    }
                  }
                } else {
                  return false;
                }
              } else {
                stackIn_8_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var10 = decompiledCaughtException;
            stackIn_50_0 = (RuntimeException) (var10);

            stackIn_50_1 = new StringBuilder().append("pe.UC(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_51_0 = (RuntimeException) ((Object) stackIn_50_0);
              stackIn_51_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackIn_51_2 = "null";
              break L10;
            } else {
              stackIn_51_0 = (RuntimeException) ((Object) stackIn_50_0);
              stackIn_51_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackIn_51_2 = "{...}";
              break L10;
            }
          }
          L11: {
            stackIn_54_0 = (RuntimeException) ((Object) stackIn_51_0);

            stackIn_54_1 = ((StringBuilder) (Object) stackIn_51_1).append(stackIn_51_2).append(',').append(param6).append(',');

            if (param7 == null) {
              stackIn_55_0 = (RuntimeException) ((Object) stackIn_54_0);
              stackIn_55_1 = (StringBuilder) ((Object) stackIn_54_1);
              stackIn_55_2 = "null";
              break L11;
            } else {
              stackIn_55_0 = (RuntimeException) ((Object) stackIn_51_0);
              stackIn_55_1 = (StringBuilder) ((Object) stackIn_54_1);
              stackIn_55_2 = "{...}";
              break L11;
            }
          }
          L12: {
            stackIn_58_0 = (RuntimeException) ((Object) stackIn_55_0);

            stackIn_58_1 = ((StringBuilder) (Object) stackIn_55_1).append(stackIn_55_2).append(',');

            if (param8 == null) {
              stackIn_59_0 = (RuntimeException) ((Object) stackIn_58_0);
              stackIn_59_1 = (StringBuilder) ((Object) stackIn_58_1);
              stackIn_59_2 = "null";
              break L12;
            } else {
              stackIn_59_0 = (RuntimeException) ((Object) stackIn_55_0);
              stackIn_59_1 = (StringBuilder) ((Object) stackIn_58_1);
              stackIn_59_2 = "{...}";
              break L12;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_59_0), stackIn_59_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0 != 0;
          } else {
            return stackIn_46_0 != 0;
          }
        }
    }

    final void a(nbb param0, byte param1) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            param0.b(-(this.field_r >> -441138975), 2147483647, this.field_r >> -1369749375, -(this.field_o >> 1156656161), this.field_o >> -1293601567);
            param0.b(24, param0.field_s);
            if (param1 >= 25) {
              L1: {
                L2: {
                  param0.a((pe) (this), true, (byte) 67, false);
                  if (!this.a(29651, param0, this.field_m, 1)) {
                    break L2;
                  } else {
                    param0.field_v = true;
                    if (hw.field_b == 1) {
                      this.b(2, (byte) 126, param0);
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                break L1;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("pe.VE(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void f(boolean param0) {
        int[] array$0 = null;
        fba stackIn_10_0;
        int[] stackIn_10_1;
        int[] stackIn_10_2;
        int stackIn_10_3;
        int stackIn_10_4;
        qob stackIn_10_5;
        fba stackIn_11_0;
        int[] stackIn_11_1;
        int[] stackIn_11_2;
        int stackIn_11_3;
        int stackIn_11_4;
        qob stackIn_11_5;
        int stackIn_11_6;
        Object stackIn_15_0 = null;
        sg[] stackIn_15_1 = null;
        Object stackIn_16_0 = null;
        sg[] stackIn_16_1 = null;
        int stackIn_16_2 = 0;
        qob[] var2;
        int var3;
        qob var4;
        int var5;
        qob[] var6;
        L0: {
          var5 = VoidHunters.field_G;
          if (null != this.field_u) {
            break L0;
          } else {
            this.field_u = new fba();
            break L0;
          }
        }
        L1: {
          var6 = this.field_p.a(param0);
          var2 = var6;
          if (var2 != null) {
            var3 = 0;
            L2: while (true) {
              if (var6.length <= var3) {
                break L1;
              } else {
                L3: {
                  var4 = var6[var3];
                  array$0 = new int[4];
                  stackIn_10_0 = this.field_u;

                  stackIn_10_1 = (int[]) (array$0);

                  stackIn_10_2 = (int[]) (array$0);

                  stackIn_10_3 = 0;

                  stackIn_10_4 = -16384;

                  stackIn_10_5 = (qob) (var4);

                  if (param0) {
                    stackIn_11_0 = (fba) ((Object) stackIn_10_0);
                    stackIn_11_1 = (int[]) ((Object) stackIn_10_1);
                    stackIn_11_2 = (int[]) ((Object) stackIn_10_2);
                    stackIn_11_3 = stackIn_10_3;
                    stackIn_11_4 = stackIn_10_4;
                    stackIn_11_5 = (qob) ((Object) stackIn_10_5);
                    stackIn_11_6 = 0;
                    break L3;
                  } else {
                    stackIn_11_0 = (fba) ((Object) stackIn_10_0);
                    stackIn_11_1 = (int[]) ((Object) stackIn_10_1);
                    stackIn_11_2 = (int[]) ((Object) stackIn_10_2);
                    stackIn_11_3 = stackIn_10_3;
                    stackIn_11_4 = stackIn_10_4;
                    stackIn_11_5 = (qob) ((Object) stackIn_10_5);
                    stackIn_11_6 = 1;
                    break L3;
                  }
                }
                stackIn_11_2[stackIn_11_3] = stackIn_11_4 + ((qob) (Object) stackIn_11_5).a(stackIn_11_6 != 0);
                stackIn_11_1[1] = var4.a(true) - -16384;
                stackIn_11_1[2] = -16384 + var4.a((byte) -119);
                stackIn_11_1[3] = var4.a((byte) -114) - -16384;
                ((fba) (Object) stackIn_11_0).a(stackIn_11_1, (byte) 51, var3, 0);
                var3++;
                continue L2;
              }
            }
          } else {
            break L1;
          }
        }
        L4: {
          stackIn_15_0 = this;

          stackIn_15_1 = this.field_k;

          if (param0) {
            stackIn_16_0 = this;
            stackIn_16_1 = (sg[]) ((Object) stackIn_15_1);
            stackIn_16_2 = 0;
            break L4;
          } else {
            stackIn_16_0 = this;
            stackIn_16_1 = (sg[]) ((Object) stackIn_15_1);
            stackIn_16_2 = 1;
            break L4;
          }
        }
        L5: {
          this.a(stackIn_16_1, stackIn_16_2 != 0, 1);
          if (hw.field_b != 1) {
            break L5;
          } else {
            this.a(this.field_m, true, 2);
            break L5;
          }
        }
        this.a(this.field_e.c(0), true, 3);
    }

    private final anb b(anb[] param0, boolean param1, int param2) {
        RuntimeException var4 = null;
        anb stackIn_8_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                this.b((faa) null, 103);
                break L1;
              }
            }
            if (-1 >= (param2 ^ -1)) {
              if (param0.length > param2) {
                stackIn_8_0 = param0[param2];
                break L0;
              } else {
                return null;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var4);

            stackIn_13_1 = new StringBuilder().append("pe.QB(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_8_0;
    }

    final static void a(int param0, long param1, int param2) {
        faa var4;
        int var5;
        L0: {
          var4 = dpa.field_p;
          var4.h(24335, param0);
          var4.field_e = var4.field_e + 1;
          var5 = var4.field_e;
          var4.c(0, 7);
          var4.a(param1, 105);
          var4.e(var4.field_e + -var5, -129);
          if (param2 < -120) {
            break L0;
          } else {
            field_d = (String) null;
            break L0;
          }
        }
    }

    final void a(int param0) {
        sg[] var2;
        int var3;
        int var5;
        sg[] var6;
        rdb var7;
        sg var8;
        rba[] var9;
        rba var10;
        cq[] var11;
        cq var12;
        var5 = VoidHunters.field_G;
        var6 = this.field_k;
        var2 = var6;
        var3 = 0;
        L0: while (true) {
          if (var6.length <= var3) {
            var7 = (rdb) ((Object) this.field_n.d(param0 + param0));
            L1: while (true) {
              if (var7 == null) {
                L2: {
                  if (null != this.field_a) {
                    var9 = this.field_a;
                    var3 = 0;
                    L3: while (true) {
                      if (var3 >= var9.length) {
                        break L2;
                      } else {
                        var10 = var9[var3];
                        if (null != var10) {
                          this.a(var10.field_c, (byte) 4, var10.field_i, var10.field_f);
                          var3++;
                          continue L3;
                        } else {
                          var3++;
                          continue L3;
                        }
                      }
                    }
                  } else {
                    break L2;
                  }
                }
                L4: {
                  if (this.field_t == null) {
                    break L4;
                  } else {
                    var11 = this.field_t;
                    var3 = 0;
                    L5: while (true) {
                      if (var3 >= var11.length) {
                        break L4;
                      } else {
                        var12 = var11[var3];
                        if (null != var12) {
                          this.a(var12.field_g, var12.field_f, var12.field_d, var12.field_e, (byte) -92);
                          var3++;
                          continue L5;
                        } else {
                          var3++;
                          continue L5;
                        }
                      }
                    }
                  }
                }
                return;
              } else {
                this.a(var7.a(71), (byte) 4, var7.a(true), 51200);
                var7 = (rdb) ((Object) this.field_n.a((byte) 100));
                continue L1;
              }
            }
          } else {
            var8 = var6[var3];
            if (var8 != null) {
              this.a(var8.g((byte) -106), (byte) 4, var8.d(false), var8.g(param0 ^ -63));
              var3++;
              continue L0;
            } else {
              var3++;
              continue L0;
            }
          }
        }
    }

    private final void l(int param0) {
        int var4;
        nbb[] var2;
        int var3;
        nbb[] var5;
        L0: {
          var4 = VoidHunters.field_G;
          if (param0 <= -82) {
            break L0;
          } else {
            this.a(82, -2, -88, 15, 61, -108, -2, -18);
            break L0;
          }
        }
        if (this.field_h) {
          return;
        } else {
          if (null == this.field_m) {
            return;
          } else {
            var5 = this.field_m;
            var2 = var5;
            this.field_m = new nbb[this.field_m.length];
            var3 = 0;
            L1: while (true) {
              if (this.field_m.length <= var3) {
                this.field_h = true;
                return;
              } else {
                this.field_m[var3] = var5[var3];
                var3++;
                continue L1;
              }
            }
          }
        }
    }

    final nbb i(int param0, int param1) {
        if (param0 != 21363) {
            return (nbb) null;
        }
        param1 = param1 - field_c[1];
        return (nbb) ((Object) this.b(this.field_m, true, param1));
    }

    private final void a(lbb param0, tfa[] param1, byte param2, nwa param3) {
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        RuntimeException stackIn_371_0 = null;
        StringBuilder stackIn_371_1 = null;
        RuntimeException stackIn_372_0 = null;
        StringBuilder stackIn_372_1 = null;
        String stackIn_372_2 = null;
        RuntimeException stackIn_375_0 = null;
        StringBuilder stackIn_375_1 = null;
        RuntimeException stackIn_376_0 = null;
        StringBuilder stackIn_376_1 = null;
        String stackIn_376_2 = null;
        RuntimeException stackIn_379_0 = null;
        StringBuilder stackIn_379_1 = null;
        RuntimeException stackIn_380_0 = null;
        StringBuilder stackIn_380_1 = null;
        String stackIn_380_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        sg var10 = null;
        int var10_int = 0;
        et[] var10_array = null;
        anb var10_ref = null;
        rdb var10_ref2 = null;
        int var11_int = 0;
        Object var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        crb[] var14_ref_crb__ = null;
        int var15 = 0;
        crb[] var16_ref_crb__ = null;
        int var16 = 0;
        int var17 = 0;
        sg var18_ref_sg = null;
        int var18 = 0;
        crb var19_ref_crb = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        Object var24 = null;
        crb var25 = null;
        nbb var26 = null;
        sg var27 = null;
        Random var28 = null;
        sg var29 = null;
        sg[] var30 = null;
        crb[] var31 = null;
        crb[] var32 = null;
        crb var33 = null;
        nbb var34 = null;
        sg var35 = null;
        cq var36 = null;
        rba var37 = null;
        qob[] var38 = null;
        qob var39 = null;
        sg[] var40 = null;
        sg var41 = null;
        sg var42 = null;
        crb[] var43 = null;
        crb var44 = null;
        crb var45 = null;
        ij var46 = null;
        nbb[] var47 = null;
        nbb var48 = null;
        nbb var49 = null;
        sg[] var50 = null;
        sg var51 = null;
        sg var52 = null;
        Random var53 = null;
        ml var54 = null;
        crb var55 = null;
        anb var56 = null;
        anb var57 = null;
        cq var58 = null;
        rba var59 = null;
        Random var60 = null;
        rha var61 = null;
        rdb var62 = null;
        ml var63 = null;
        Random var64 = null;
        nbb var65 = null;
        ml var66 = null;
        sg var67 = null;
        String var68 = null;
        sg var70 = null;
        Random var71 = null;
        Random var72 = null;
        sg var73 = null;
        qob var74 = null;
        et[] var75 = null;
        cq var76 = null;
        cq var77 = null;
        anb var78 = null;
        sg[] var79 = null;
        sg var80 = null;
        int[] var83 = null;
        rdb var84 = null;
        crb var85 = null;
        nbb var86 = null;
        sg var87 = null;
        var24 = null;
        var23 = VoidHunters.field_G;
        try {
          L0: {
            var5_int = 0;
            var6 = 34 % ((param2 - 53) / 41);
            L1: while (true) {
              if (param1.length <= var5_int) {
                break L0;
              } else {
                L2: {
                  var7 = param1[var5_int].field_d;
                  var8 = param1[var5_int].field_e;
                  var9 = param1[var5_int].field_b;
                  if (13 != var9) {
                    break L2;
                  } else {
                    L3: {
                      stackIn_7_0 = this;

                      if (this.field_v) {
                        stackIn_8_0 = this;
                        stackIn_8_1 = 0;
                        break L3;
                      } else {
                        stackIn_8_0 = this;
                        stackIn_8_1 = 1;
                        break L3;
                      }
                    }
                    ((pe) (this)).field_v = stackIn_8_1 != 0;
                    break L2;
                  }
                }
                L4: {
                  if (var9 != 10) {
                    break L4;
                  } else {
                    if (13 != this.field_y) {
                      break L4;
                    } else {
                      var28 = new Random((long)(var8 * var7));
                      var11_int = ib.a(-101, 3, ak.e((byte) 107), var28);
                      var29 = t.a(var11_int, (byte) 47);
                      var29.a(new aoa(), 4);
                      var29.h(17704, sja.field_c);
                      var13 = var7;
                      var14 = var8;
                      var29.a(var13, var14, (byte) 108);
                      var29.a(hob.a(var28, 8192, 122), -103);
                      var29.a(false, true, (pe) (this));
                      var15 = 1;
                      var30 = this.field_k;
                      var17 = 0;
                      L5: while (true) {
                        L6: {
                          if (var17 >= var30.length) {
                            break L6;
                          } else {
                            L7: {
                              var18_ref_sg = var30[var17];
                              var41 = var18_ref_sg;
                              var42 = var41;
                              var10 = var42;
                              var41 = var18_ref_sg;
                              if (var18_ref_sg != null) {
                                if (!this.a(var29, var18_ref_sg, -69)) {
                                  break L7;
                                } else {
                                  var15 = 0;
                                  break L6;
                                }
                              } else {
                                break L7;
                              }
                            }
                            var17++;
                            continue L5;
                          }
                        }
                        var16_ref_crb__ = this.field_e.c(0);
                        var31 = var16_ref_crb__;
                        var18 = 0;
                        L8: while (true) {
                          L9: {
                            if (var31.length <= var18) {
                              break L9;
                            } else {
                              L10: {
                                var19_ref_crb = var31[var18];
                                var44 = var19_ref_crb;
                                var25 = var44;
                                var44 = var19_ref_crb;
                                if (null == var19_ref_crb) {
                                  break L10;
                                } else {
                                  if (this.a(var29, var19_ref_crb, 63)) {
                                    var15 = 0;
                                    break L9;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                              var18++;
                              continue L8;
                            }
                          }
                          L11: {
                            L12: {
                              var17 = this.field_o >> -201602399;
                              var18 = this.field_r >> 440920641;
                              var19 = -var17;
                              var20 = var17;
                              var21 = -var18;
                              var22 = var18;
                              if (var7 < var19) {
                                break L12;
                              } else {
                                if (var7 > var20) {
                                  break L12;
                                } else {
                                  if (var8 < var21) {
                                    break L12;
                                  } else {
                                    if (var8 <= var22) {
                                      break L11;
                                    } else {
                                      break L12;
                                    }
                                  }
                                }
                              }
                            }
                            var15 = 0;
                            break L11;
                          }
                          if (var15 != 0) {
                            this.a(var29, (byte) 96);
                            if (vqa.field_g == null) {
                              break L4;
                            } else {
                              vqa.field_g.d(-31407);
                              break L4;
                            }
                          } else {
                            eib.a(6811, 6, 1);
                            break L4;
                          }
                        }
                      }
                    }
                  }
                }
                L13: {
                  if (!this.field_v) {
                    break L13;
                  } else {
                    if (-15 == (var9 ^ -1)) {
                      var10 = this.d(var5_int, 61);
                      var11 = null;
                      var12 = 2147483647;
                      var79 = this.field_k;
                      var14 = 0;
                      L14: while (true) {
                        if (var79.length <= var14) {
                          if (null != var11) {
                            L15: {
                              if (null == var10) {
                                break L15;
                              } else {
                                var10.g(((sg) (var11)).o((byte) -117), -51);
                                if (-1 != ((sg) (var11)).o((byte) -117)) {
                                  break L15;
                                } else {
                                  var10.a(new aoa(), 4);
                                  break L15;
                                }
                              }
                            }
                            ((sg) (var11)).g(var5_int, -126);
                            ((sg) (var11)).a((aoa) null, 4);
                            break L13;
                          } else {
                            break L13;
                          }
                        } else {
                          var80 = var79[var14];
                          var11 = var80;
                          var11 = var80;
                          if (var80 != null) {
                            L16: {
                              if (var80 != var10) {
                                var16 = var80.field_d - var7;
                                var17 = -var8 + var80.field_e;
                                var18 = ar.a(var16, (byte) 108, var17);
                                if (var12 > var18) {
                                  var12 = var18;
                                  var11 = var80;
                                  break L16;
                                } else {
                                  break L16;
                                }
                              } else {
                                break L16;
                              }
                            }
                            var14++;
                            continue L14;
                          } else {
                            var14++;
                            continue L14;
                          }
                        }
                      }
                    } else {
                      if (-16 != (var9 ^ -1)) {
                        if (-17 != (var9 ^ -1)) {
                          if (var9 != 17) {
                            if (-19 != (var9 ^ -1)) {
                              if (var9 != 25) {
                                if (var9 != 26) {
                                  if ((var9 ^ -1) == -28) {
                                    if (null != this.field_f) {
                                      this.field_f.g((byte) 82);
                                      break L13;
                                    } else {
                                      break L13;
                                    }
                                  } else {
                                    if (var9 == 28) {
                                      if (null == this.field_f) {
                                        break L13;
                                      } else {
                                        this.field_f.f((byte) -29);
                                        break L13;
                                      }
                                    } else {
                                      if (var9 != 29) {
                                        if ((var9 ^ -1) != -31) {
                                          if (var9 == 31) {
                                            if (this.field_f == null) {
                                              break L13;
                                            } else {
                                              this.field_f.a((byte) -120, (wm) (new cqb(0, 0)));
                                              break L13;
                                            }
                                          } else {
                                            if (-33 == (var9 ^ -1)) {
                                              if (this.field_f != null) {
                                                L17: {
                                                  var10_int = -1;
                                                  var78 = this.a((byte) -27, var7, var8);
                                                  if (null != var78) {
                                                    var10_int = var78.field_l;
                                                    break L17;
                                                  } else {
                                                    break L17;
                                                  }
                                                }
                                                this.field_f.a((byte) -120, (wm) (new ih(var10_int, 0)));
                                                break L13;
                                              } else {
                                                break L13;
                                              }
                                            } else {
                                              if ((var9 ^ -1) == -34) {
                                                if (null == this.field_f) {
                                                  break L13;
                                                } else {
                                                  this.field_f.a((byte) -125, (wm) (new jsb(0)));
                                                  break L13;
                                                }
                                              } else {
                                                if (34 != var9) {
                                                  if (var9 == 35) {
                                                    if (null == this.field_f) {
                                                      break L13;
                                                    } else {
                                                      this.field_f.a((rna) (new ika()), 0);
                                                      break L13;
                                                    }
                                                  } else {
                                                    if (36 != var9) {
                                                      if ((var9 ^ -1) != -38) {
                                                        if (var9 != 38) {
                                                          if (39 != var9) {
                                                            if ((var9 ^ -1) != -41) {
                                                              if (var9 != 41) {
                                                                if (-43 == (var9 ^ -1)) {
                                                                  if (null == this.field_f) {
                                                                    break L13;
                                                                  } else {
                                                                    this.field_f.e((byte) -99);
                                                                    break L13;
                                                                  }
                                                                } else {
                                                                  if (var9 == 43) {
                                                                    if (null == this.field_f) {
                                                                      break L13;
                                                                    } else {
                                                                      this.field_f.b((byte) -128);
                                                                      break L13;
                                                                    }
                                                                  } else {
                                                                    if ((var9 ^ -1) != -45) {
                                                                      if (-46 == (var9 ^ -1)) {
                                                                        if (this.field_f != null) {
                                                                          this.field_f.a(false, (pe) (this), 0);
                                                                          break L13;
                                                                        } else {
                                                                          break L13;
                                                                        }
                                                                      } else {
                                                                        if (46 != var9) {
                                                                          if (47 == var9) {
                                                                            if (null == this.field_f) {
                                                                              break L13;
                                                                            } else {
                                                                              this.field_f.a(false, (pe) (this), 1);
                                                                              break L13;
                                                                            }
                                                                          } else {
                                                                            if ((var9 ^ -1) == -49) {
                                                                              if (this.field_f == null) {
                                                                                break L13;
                                                                              } else {
                                                                                this.field_f.a(1, 1, (pe) (this));
                                                                                break L13;
                                                                              }
                                                                            } else {
                                                                              if (-50 == (var9 ^ -1)) {
                                                                                var77 = new cq(var7, var8);
                                                                                this.a(5706, var77);
                                                                                break L13;
                                                                              } else {
                                                                                if ((var9 ^ -1) != -51) {
                                                                                  if (51 == var9) {
                                                                                    if (null != this.field_t) {
                                                                                      var10_int = 0;
                                                                                      L18: while (true) {
                                                                                        if (var10_int >= this.field_t.length) {
                                                                                          break L13;
                                                                                        } else {
                                                                                          var76 = this.field_t[var10_int];
                                                                                          if (var76.a(var8, var7, (byte) -98)) {
                                                                                            var76.field_e = (int)((double)var76.field_e / 1.25);
                                                                                            var76.field_d = (int)((double)var76.field_d / 1.25);
                                                                                            break L13;
                                                                                          } else {
                                                                                            var10_int++;
                                                                                            continue L18;
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                    } else {
                                                                                      break L13;
                                                                                    }
                                                                                  } else {
                                                                                    if (-53 != (var9 ^ -1)) {
                                                                                      if ((var9 ^ -1) == -54) {
                                                                                        var75 = param0.field_g;
                                                                                        var10_array = var75;
                                                                                        if (null == var10_array) {
                                                                                          break L13;
                                                                                        } else {
                                                                                          var11_int = 0;
                                                                                          L19: while (true) {
                                                                                            if (var75.length <= var11_int) {
                                                                                              break L13;
                                                                                            } else {
                                                                                              L20: {
                                                                                                if (null != var75[var11_int]) {
                                                                                                  var75[var11_int].field_a = var75[var11_int].field_a / 2;
                                                                                                  break L20;
                                                                                                } else {
                                                                                                  break L20;
                                                                                                }
                                                                                              }
                                                                                              var11_int++;
                                                                                              continue L19;
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                      } else {
                                                                                        if (-55 != (var9 ^ -1)) {
                                                                                          if (-56 == (var9 ^ -1)) {
                                                                                            param0.a(127);
                                                                                            break L13;
                                                                                          } else {
                                                                                            if (-57 != (var9 ^ -1)) {
                                                                                              if ((var9 ^ -1) == -20) {
                                                                                                var74 = new qob(var7, var8);
                                                                                                this.b((byte) 60);
                                                                                                this.a(var74, 0);
                                                                                                break L13;
                                                                                              } else {
                                                                                                if (20 != var9) {
                                                                                                  if (-22 != (var9 ^ -1)) {
                                                                                                    if ((var9 ^ -1) != -23) {
                                                                                                      if (23 != var9) {
                                                                                                        if (var9 == 24) {
                                                                                                          this.e((int)((double)this.field_r / 1.1), 0);
                                                                                                          break L13;
                                                                                                        } else {
                                                                                                          if (57 == var9) {
                                                                                                            var72 = new Random((long)(var7 * var8));
                                                                                                            var73 = t.a(hob.a(var72, 12, 126) + 0, (byte) 42);
                                                                                                            var73.a(new aoa(), 4);
                                                                                                            var73.h(17704, sja.field_c);
                                                                                                            var12 = var7;
                                                                                                            var13 = var8;
                                                                                                            var73.a(var12, var13, (byte) 52);
                                                                                                            var73.a(hob.a(var72, 8192, 118), -82);
                                                                                                            this.a(var73, (byte) 80);
                                                                                                            break L13;
                                                                                                          } else {
                                                                                                            if (var9 == 58) {
                                                                                                              var71 = new Random((long)(var7 * var8));
                                                                                                              var68 = "AAQPKAASAhIDKAESAygAEgISAygBEgMoABICEgMoARIDKAASAhIDKAESAygAEgISAygBEgMoABICEgMoARIDKAASAhIDKAESAygAEgISAygBEgMoABICEgMoARIDKAASAhIDKAESAygAEgISAygBEgMoABICEgMoARIDKAASAhIDKAESAygAEgISAygBEgMoABICEgMoARIDKAASAhIDKAESBRL-BBIGEgUS-wQSBhIFEv8EEgYSBRL-BBIGEgUS-wQSBhIFEv8EEgYSBRL-BBIGEgUS-wQSBhIFEv8EEgYSBRL-BBIGEgUS-wQSBhIFEv8EEgYSBRL-BBIGEgUS-wQSBhIFEv8EEgYSBRL-BBIGEg";
                                                                                                              var83 = hta.a(var68, true, true);
                                                                                                              var70 = ae.a(var83, (byte) 126);
                                                                                                              var70.a(new aoa(), 4);
                                                                                                              var70.h(17704, sja.field_c);
                                                                                                              var14 = var7;
                                                                                                              var15 = var8;
                                                                                                              var70.a(var14, var15, (byte) 100);
                                                                                                              var70.a(hob.a(var71, 8192, 120), -51);
                                                                                                              this.a(var70, (byte) 81);
                                                                                                              break L13;
                                                                                                            } else {
                                                                                                              if (-73 < (var9 ^ -1)) {
                                                                                                                break L13;
                                                                                                              } else {
                                                                                                                var10_int = -72 + var9;
                                                                                                                if (tnb.a(130, var10_int)) {
                                                                                                                  var66 = new ml(var10_int);
                                                                                                                  var67 = new sg();
                                                                                                                  var67.field_k = var66;
                                                                                                                  var67.e((byte) 119);
                                                                                                                  var67.a(var7, var8, (byte) 42);
                                                                                                                  this.a(var67, (byte) 83);
                                                                                                                  break L13;
                                                                                                                } else {
                                                                                                                  if (!fbb.b(var10_int, 15923)) {
                                                                                                                    break L13;
                                                                                                                  } else {
                                                                                                                    var63 = new ml(var10_int);
                                                                                                                    var65 = new nbb(var63, false);
                                                                                                                    var64 = new Random((long)var7);
                                                                                                                    var65.a(hob.a(var64, 8192, 121), -95);
                                                                                                                    var65.a(var7, var8, (byte) -62);
                                                                                                                    this.a(var65, (byte) 54);
                                                                                                                    break L13;
                                                                                                                  }
                                                                                                                }
                                                                                                              }
                                                                                                            }
                                                                                                          }
                                                                                                        }
                                                                                                      } else {
                                                                                                        this.e((int)(1.1 * (double)this.field_r), 0);
                                                                                                        break L13;
                                                                                                      }
                                                                                                    } else {
                                                                                                      this.a((int)((double)this.field_o / 1.1), (byte) 72);
                                                                                                      break L13;
                                                                                                    }
                                                                                                  } else {
                                                                                                    this.a((int)((double)this.field_o * 1.1), (byte) 53);
                                                                                                    break L13;
                                                                                                  }
                                                                                                } else {
                                                                                                  var62 = new rdb(var7, var8, 0);
                                                                                                  this.a((byte) -59, var62);
                                                                                                  break L13;
                                                                                                }
                                                                                              }
                                                                                            } else {
                                                                                              var60 = new Random((long)(var7 * var8));
                                                                                              var11_int = hob.a(var60, 5, 123);
                                                                                              var61 = new rha(var11_int, 0, 0);
                                                                                              param3.a(var61, true);
                                                                                              break L13;
                                                                                            }
                                                                                          }
                                                                                        } else {
                                                                                          param0.b(false);
                                                                                          break L13;
                                                                                        }
                                                                                      }
                                                                                    } else {
                                                                                      var59 = new rba(var7, var8);
                                                                                      this.a(var59, (byte) -38);
                                                                                      break L13;
                                                                                    }
                                                                                  }
                                                                                } else {
                                                                                  if (null != this.field_t) {
                                                                                    var10_int = 0;
                                                                                    L21: while (true) {
                                                                                      if (this.field_t.length <= var10_int) {
                                                                                        break L13;
                                                                                      } else {
                                                                                        var58 = this.field_t[var10_int];
                                                                                        var76 = var58;
                                                                                        var76 = var58;
                                                                                        if (var58.a(var8, var7, (byte) -98)) {
                                                                                          var58.field_d = (int)(1.25 * (double)var58.field_d);
                                                                                          var58.field_e = (int)((double)var58.field_e * 1.25);
                                                                                          break L13;
                                                                                        } else {
                                                                                          var10_int++;
                                                                                          continue L21;
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                  } else {
                                                                                    break L13;
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                          }
                                                                        } else {
                                                                          if (null == this.field_f) {
                                                                            break L13;
                                                                          } else {
                                                                            this.field_f.a(1, 0, (pe) (this));
                                                                            break L13;
                                                                          }
                                                                        }
                                                                      }
                                                                    } else {
                                                                      if (null != this.field_f) {
                                                                        this.field_f.a(-828);
                                                                        break L13;
                                                                      } else {
                                                                        break L13;
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                              } else {
                                                                if (this.field_f == null) {
                                                                  break L13;
                                                                } else {
                                                                  this.field_f.a((rna) (new jpa(0, 0)), 0);
                                                                  break L13;
                                                                }
                                                              }
                                                            } else {
                                                              if (null == this.field_f) {
                                                                break L13;
                                                              } else {
                                                                this.field_f.a((rna) (new tt(0, 0)), 0);
                                                                break L13;
                                                              }
                                                            }
                                                          } else {
                                                            if (this.field_f == null) {
                                                              break L13;
                                                            } else {
                                                              L22: {
                                                                var57 = this.a((byte) -20, var7, var8);
                                                                var11_int = -1;
                                                                if (var57 != null) {
                                                                  var11_int = var57.field_l;
                                                                  break L22;
                                                                } else {
                                                                  break L22;
                                                                }
                                                              }
                                                              this.field_f.a((rna) (new lrb(var11_int, 0)), 0);
                                                              break L13;
                                                            }
                                                          }
                                                        } else {
                                                          if (null == this.field_f) {
                                                            break L13;
                                                          } else {
                                                            this.field_f.a((rna) (new cf(0, 0)), 0);
                                                            break L13;
                                                          }
                                                        }
                                                      } else {
                                                        if (this.field_f != null) {
                                                          this.field_f.a((rna) (new uoa(0, 0)), 0);
                                                          break L13;
                                                        } else {
                                                          break L13;
                                                        }
                                                      }
                                                    } else {
                                                      if (null != this.field_f) {
                                                        this.field_f.a((rna) (new pob(0, 0)), 0);
                                                        break L13;
                                                      } else {
                                                        break L13;
                                                      }
                                                    }
                                                  }
                                                } else {
                                                  if (null == this.field_f) {
                                                    break L13;
                                                  } else {
                                                    this.field_f.a((byte) -120, (wm) (new om(0)));
                                                    break L13;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        } else {
                                          if (this.field_f == null) {
                                            break L13;
                                          } else {
                                            if (this.field_t != null) {
                                              L23: {
                                                var10_int = -1;
                                                var56 = this.a((byte) -116, var7, var8);
                                                if (null != var56) {
                                                  var10_int = var56.field_l;
                                                  break L23;
                                                } else {
                                                  break L23;
                                                }
                                              }
                                              this.field_f.a((byte) -124, (wm) (new iia(var10_int, 0)));
                                              break L13;
                                            } else {
                                              break L13;
                                            }
                                          }
                                        }
                                      } else {
                                        if (null == this.field_f) {
                                          break L13;
                                        } else {
                                          var10_ref = this.a((byte) -48, var7, var8);
                                          if (null != var10_ref) {
                                            this.field_f.a((byte) -126, (wm) (new cc(var10_ref.field_l)));
                                            break L13;
                                          } else {
                                            break L13;
                                          }
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  if (this.field_f == null) {
                                    break L13;
                                  } else {
                                    this.field_f.c((byte) 55);
                                    break L13;
                                  }
                                }
                              } else {
                                L24: {
                                  if (this.field_f == null) {
                                    this.field_f = new una();
                                    break L24;
                                  } else {
                                    break L24;
                                  }
                                }
                                this.field_f.c(0);
                                break L13;
                              }
                            } else {
                              var53 = new Random((long)(var7 * var8));
                              var54 = new ml(gnb.a(var53, (byte) 55));
                              var55 = new crb(var54);
                              var55.a(var7, var8, (byte) -49);
                              this.a((byte) 126, var55);
                              break L13;
                            }
                          } else {
                            var42 = this.d(var5_int, 73);
                            var10 = var42;
                            if (var42 != null) {
                              var11_int = var42.d(false);
                              var12 = var42.g((byte) -107);
                              var46 = new ij();
                              var14_ref_crb__ = this.field_e.c(0);
                              var43 = var14_ref_crb__;
                              var16 = 0;
                              L25: while (true) {
                                if (var43.length <= var16) {
                                  var85 = (crb) ((Object) var46.d(0));
                                  L26: while (true) {
                                    if (var85 == null) {
                                      var46.e(95);
                                      var47 = this.field_m;
                                      var16 = 0;
                                      L27: while (true) {
                                        if (var16 >= var47.length) {
                                          var86 = (nbb) ((Object) var46.d(0));
                                          L28: while (true) {
                                            if (var86 == null) {
                                              var46.e(107);
                                              var50 = this.field_k;
                                              var16 = 0;
                                              L29: while (true) {
                                                if (var50.length <= var16) {
                                                  var87 = (sg) ((Object) var46.d(0));
                                                  L30: while (true) {
                                                    if (null == var87) {
                                                      break L13;
                                                    } else {
                                                      this.a(var87, (byte) 82);
                                                      var87 = (sg) ((Object) var46.a((byte) 122));
                                                      continue L30;
                                                    }
                                                  }
                                                } else {
                                                  var51 = var50[var16];
                                                  var27 = var51;
                                                  var27 = var51;
                                                  if (var51 != null) {
                                                    L31: {
                                                      if (var51.o((byte) -117) == -1) {
                                                        if (null != var51.field_k.a(var8, var7, true)) {
                                                          var52 = new sg();
                                                          var51.b((byte) 111, var52);
                                                          var52.a(var11_int, var12, (byte) 39);
                                                          var52.a(var42.e(0), -82);
                                                          var52.h(17704, var42.q((byte) 125));
                                                          var46.b(-10258, var52);
                                                          break L31;
                                                        } else {
                                                          break L31;
                                                        }
                                                      } else {
                                                        break L31;
                                                      }
                                                    }
                                                    var16++;
                                                    continue L29;
                                                  } else {
                                                    var16++;
                                                    continue L29;
                                                  }
                                                }
                                              }
                                            } else {
                                              this.a(var86, (byte) 51);
                                              var86 = (nbb) ((Object) var46.a((byte) 8));
                                              continue L28;
                                            }
                                          }
                                        } else {
                                          var48 = var47[var16];
                                          var26 = var48;
                                          var26 = var48;
                                          if (var48 != null) {
                                            if (null != var48.field_k.a(var8, var7, true)) {
                                              var49 = new nbb();
                                              var48.b((byte) 87, var49);
                                              var49.a(var11_int, var12, (byte) -122);
                                              var46.b(-10258, var49);
                                              var16++;
                                              continue L27;
                                            } else {
                                              var16++;
                                              continue L27;
                                            }
                                          } else {
                                            var16++;
                                            continue L27;
                                          }
                                        }
                                      }
                                    } else {
                                      this.a((byte) 126, var85);
                                      var85 = (crb) ((Object) var46.a((byte) 80));
                                      continue L26;
                                    }
                                  }
                                } else {
                                  var44 = var43[var16];
                                  var25 = var44;
                                  var25 = var44;
                                  if (null != var44) {
                                    L32: {
                                      if (var44.field_k.a(var8, var7, true) != null) {
                                        var45 = new crb();
                                        var44.b((byte) 76, var45);
                                        var45.a(var11_int, var12, (byte) -93);
                                        var46.b(-10258, var45);
                                        break L32;
                                      } else {
                                        break L32;
                                      }
                                    }
                                    var16++;
                                    continue L25;
                                  } else {
                                    var16++;
                                    continue L25;
                                  }
                                }
                              }
                            } else {
                              break L13;
                            }
                          }
                        } else {
                          var40 = this.field_k;
                          var11_int = 0;
                          L33: while (true) {
                            if (var11_int >= var40.length) {
                              var10_ref2 = (rdb) ((Object) this.field_n.d(0));
                              L34: while (true) {
                                if (null == var10_ref2) {
                                  break L13;
                                } else {
                                  L35: {
                                    if (!var10_ref2.a(var7, (byte) -124, var8)) {
                                      break L35;
                                    } else {
                                      var10_ref2.a((1 + var10_ref2.d(-29)) % so.field_b, (byte) -93);
                                      break L35;
                                    }
                                  }
                                  var10_ref2 = (rdb) ((Object) this.field_n.a((byte) 117));
                                  continue L34;
                                }
                              }
                            } else {
                              L36: {
                                var41 = var40[var11_int];
                                var42 = var41;
                                var10 = var42;
                                var42 = var41;
                                var10 = var42;
                                if (null != var41) {
                                  if (null != var41.field_k.a(var8, var7, true)) {
                                    var41.h(17704, (1 + var41.q((byte) 68)) % so.field_b);
                                    break L36;
                                  } else {
                                    break L36;
                                  }
                                } else {
                                  break L36;
                                }
                              }
                              var11_int++;
                              continue L33;
                            }
                          }
                        }
                      } else {
                        var32 = this.field_e.c(0);
                        var11_int = 0;
                        L37: while (true) {
                          if (var32.length <= var11_int) {
                            var11_int = 0;
                            L38: while (true) {
                              if (var11_int >= this.field_m.length) {
                                var11_int = 0;
                                L39: while (true) {
                                  if (var11_int >= this.field_k.length) {
                                    var84 = (rdb) ((Object) this.field_n.d(0));
                                    L40: while (true) {
                                      if (var84 == null) {
                                        L41: {
                                          if (this.field_t == null) {
                                            break L41;
                                          } else {
                                            var11_int = 0;
                                            L42: while (true) {
                                              if (this.field_t.length <= var11_int) {
                                                break L41;
                                              } else {
                                                var36 = this.field_t[var11_int];
                                                if (var36.a(var8, var7, (byte) -98)) {
                                                  this.c(var11_int, (byte) -90);
                                                  break L41;
                                                } else {
                                                  var11_int++;
                                                  continue L42;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        L43: {
                                          if (this.field_a == null) {
                                            break L43;
                                          } else {
                                            var11_int = 0;
                                            L44: while (true) {
                                              if (this.field_a.length <= var11_int) {
                                                break L43;
                                              } else {
                                                var37 = this.field_a[var11_int];
                                                if (var37.a(var7, (byte) 87, var8)) {
                                                  this.c((byte) 110, var11_int);
                                                  break L43;
                                                } else {
                                                  var11_int++;
                                                  continue L44;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        var38 = this.field_p.a(false);
                                        var11 = var38;
                                        if (var11 == null) {
                                          break L13;
                                        } else {
                                          var12 = 0;
                                          L45: while (true) {
                                            if (var38.length <= var12) {
                                              break L13;
                                            } else {
                                              var39 = var38[var12];
                                              if (var39.a((byte) 100, var7, var8)) {
                                                this.b((byte) -89);
                                                this.f((byte) -22, var12);
                                                break L13;
                                              } else {
                                                var12++;
                                                continue L45;
                                              }
                                            }
                                          }
                                        }
                                      } else {
                                        L46: {
                                          if (var84.a(var7, (byte) -81, var8)) {
                                            var84.b(-3846);
                                            break L46;
                                          } else {
                                            break L46;
                                          }
                                        }
                                        var84 = (rdb) ((Object) this.field_n.a((byte) 106));
                                        continue L40;
                                      }
                                    }
                                  } else {
                                    L47: {
                                      var35 = this.field_k[var11_int];
                                      var41 = var35;
                                      var42 = var41;
                                      var10 = var42;
                                      var41 = var35;
                                      if (var35 != null) {
                                        if (var35.field_k.a(var8, var7, true) != null) {
                                          this.a(-107, 0, var35);
                                          break L47;
                                        } else {
                                          var11_int++;
                                          continue L39;
                                        }
                                      } else {
                                        break L47;
                                      }
                                    }
                                    var11_int++;
                                    continue L39;
                                  }
                                }
                              } else {
                                L48: {
                                  var34 = this.field_m[var11_int];
                                  if (null != var34) {
                                    if (var34.field_k.a(var8, var7, true) != null) {
                                      this.a(-104, 1, var34);
                                      break L48;
                                    } else {
                                      break L48;
                                    }
                                  } else {
                                    break L48;
                                  }
                                }
                                var11_int++;
                                continue L38;
                              }
                            }
                          } else {
                            L49: {
                              var33 = var32[var11_int];
                              if (var33 != null) {
                                if (null != var33.field_k.a(var8, var7, true)) {
                                  this.a(-105, 2, var33);
                                  break L49;
                                } else {
                                  var11_int++;
                                  continue L37;
                                }
                              } else {
                                break L49;
                              }
                            }
                            var11_int++;
                            continue L37;
                          }
                        }
                      }
                    }
                  }
                }
                var5_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L50: {
            var5 = decompiledCaughtException;
            stackIn_371_0 = (RuntimeException) (var5);

            stackIn_371_1 = new StringBuilder().append("pe.JD(");

            if (param0 == null) {
              stackIn_372_0 = (RuntimeException) ((Object) stackIn_371_0);
              stackIn_372_1 = (StringBuilder) ((Object) stackIn_371_1);
              stackIn_372_2 = "null";
              break L50;
            } else {
              stackIn_372_0 = (RuntimeException) ((Object) stackIn_371_0);
              stackIn_372_1 = (StringBuilder) ((Object) stackIn_371_1);
              stackIn_372_2 = "{...}";
              break L50;
            }
          }
          L51: {
            stackIn_375_0 = (RuntimeException) ((Object) stackIn_372_0);

            stackIn_375_1 = ((StringBuilder) (Object) stackIn_372_1).append(stackIn_372_2).append(',');

            if (param1 == null) {
              stackIn_376_0 = (RuntimeException) ((Object) stackIn_375_0);
              stackIn_376_1 = (StringBuilder) ((Object) stackIn_375_1);
              stackIn_376_2 = "null";
              break L51;
            } else {
              stackIn_376_0 = (RuntimeException) ((Object) stackIn_372_0);
              stackIn_376_1 = (StringBuilder) ((Object) stackIn_375_1);
              stackIn_376_2 = "{...}";
              break L51;
            }
          }
          L52: {
            stackIn_379_0 = (RuntimeException) ((Object) stackIn_376_0);

            stackIn_379_1 = ((StringBuilder) (Object) stackIn_376_1).append(stackIn_376_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_380_0 = (RuntimeException) ((Object) stackIn_379_0);
              stackIn_380_1 = (StringBuilder) ((Object) stackIn_379_1);
              stackIn_380_2 = "null";
              break L52;
            } else {
              stackIn_380_0 = (RuntimeException) ((Object) stackIn_376_0);
              stackIn_380_1 = (StringBuilder) ((Object) stackIn_379_1);
              stackIn_380_2 = "{...}";
              break L52;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_380_0), stackIn_380_2 + ')');
        }
    }

    final anb g(byte param0, int param1) {
        int var3;
        int var4_int;
        nbb var5;
        int var6;
        sg var4;
        int var7;
        var6 = VoidHunters.field_G;
        var3 = 0;
        var4_int = -108 % ((-71 - param0) / 44);
        L0: while (true) {
          if (var3 >= this.field_m.length) {
            var7 = 0;
            var3 = var7;
            L1: while (true) {
              if (var7 < this.field_k.length) {
                var4 = this.field_k[var7];
                if (null != var4) {
                  if ((var4.field_k.a(param1, 0) ^ -1) < -1) {
                    return (anb) ((Object) var4);
                  } else {
                    var7++;
                    continue L1;
                  }
                } else {
                  var7++;
                  continue L1;
                }
              } else {
                return null;
              }
            }
          } else {
            var5 = this.field_m[var3];
            if (var5 != null) {
              if (var5.field_k.a(param1, 0) > 0) {
                return (anb) ((Object) var5);
              } else {
                var3++;
                continue L0;
              }
            } else {
              var3++;
              continue L0;
            }
          }
        }
    }

    final boolean b(int param0, int param1) {
        int var5 = VoidHunters.field_G;
        tj var6 = (tj) ((Object) this.field_x.d(0));
        while (var6 != null) {
            if (var6.g((byte) -104) == 6 && param0 == var6.d((byte) -119)) {
                return true;
            }
            var6 = (tj) ((Object) this.field_x.a((byte) 40));
        }
        int var4 = -114 % ((69 - param1) / 37);
        return false;
    }

    final boolean a(int param0, int param1, boolean param2, int param3) {
        sg[] var5;
        rdb var5_ref;
        int var6;
        int var7;
        sg var7_ref_sg;
        int var8;
        int var9;
        int var10;
        int var11;
        sg[] var12;
        var11 = VoidHunters.field_G;
        var12 = this.field_k;
        var5 = var12;
        var6 = 0;
        L0: while (true) {
          if (var12.length <= var6) {
            L1: {
              var5_ref = (rdb) ((Object) this.field_n.d(0));
              if (!param2) {
                break L1;
              } else {
                this.field_x = (ij) null;
                break L1;
              }
            }
            L2: while (true) {
              if (null == var5_ref) {
                return false;
              } else {
                L3: {
                  if (var5_ref == null) {
                    break L3;
                  } else {
                    var6 = -param3 + var5_ref.a(true);
                    var7 = var5_ref.a(82) - param1;
                    var8 = ar.a(var6, (byte) 104, var7);
                    if (var8 > 51200 + param0) {
                      break L3;
                    } else {
                      return true;
                    }
                  }
                }
                var5_ref = (rdb) ((Object) this.field_n.a((byte) 107));
                continue L2;
              }
            }
          } else {
            var7_ref_sg = var12[var6];
            if (var7_ref_sg != null) {
              if (var7_ref_sg.q((byte) 116) >= 0) {
                if (var7_ref_sg.q((byte) 73) < unb.field_p) {
                  var8 = -param3 + var7_ref_sg.field_d;
                  var9 = -param1 + var7_ref_sg.field_e;
                  var10 = ar.a(var8, (byte) 123, var9);
                  if (var7_ref_sg.g(-80) + param0 >= var10) {
                    return true;
                  } else {
                    var6++;
                    continue L0;
                  }
                } else {
                  var6++;
                  continue L0;
                }
              } else {
                var6++;
                continue L0;
              }
            } else {
              var6++;
              continue L0;
            }
          }
        }
    }

    final void a(int param0, cq param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 5706) {
                break L1;
              } else {
                this.field_m = (nbb[]) null;
                break L1;
              }
            }
            this.field_t = (cq[]) ((Object) ija.a(param1, this.field_t, param0 + -5706, wsb.field_e));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (runtimeException);

            stackIn_7_1 = new StringBuilder().append("pe.HB(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
    }

    final mqb h(int param0, int param1) {
        int var3 = 63 / ((param1 - -59) / 42);
        param0 = param0 - field_c[3];
        if ((param0 ^ -1) > -1) {
            return null;
        }
        return (mqb) ((Object) this.b(this.field_g, true, param0));
    }

    private final void a(anb param0, anb param1, gda param2, int param3, boolean param4) {
        int stackIn_36_0 = 0;
        RuntimeException stackIn_89_0 = null;
        StringBuilder stackIn_89_1 = null;
        RuntimeException stackIn_90_0 = null;
        StringBuilder stackIn_90_1 = null;
        String stackIn_90_2 = null;
        RuntimeException stackIn_93_0 = null;
        StringBuilder stackIn_93_1 = null;
        RuntimeException stackIn_94_0 = null;
        StringBuilder stackIn_94_1 = null;
        String stackIn_94_2 = null;
        RuntimeException stackIn_97_0 = null;
        StringBuilder stackIn_97_1 = null;
        RuntimeException stackIn_98_0 = null;
        StringBuilder stackIn_98_1 = null;
        String stackIn_98_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        wfb var7 = null;
        int var8 = 0;
        ml var9 = null;
        wfb var10 = null;
        int var11 = 0;
        int var12 = 0;
        sg var13_ref_sg = null;
        int var13 = 0;
        sg var14_ref_sg = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        ml var20 = null;
        try {
          L0: {
            L1: {
              var20 = param2.field_h;
              var7 = var20.i((byte) -112);
              var8 = var7.field_q;
              var9 = param2.field_m;
              var10 = var9.i((byte) -112);
              if (param4) {
                break L1;
              } else {
                if (var20.field_j == 22) {
                  break L1;
                } else {
                  if (var9.field_j != 22) {
                    decompiledRegionSelector0 = 0;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            L2: {
              var11 = param0 instanceof sg ? 1 : 0;
              var12 = param1 instanceof sg ? 1 : 0;
              if (var11 == 0) {
                break L2;
              } else {
                if (var12 != 0) {
                  var13_ref_sg = (sg) ((Object) param0);
                  var14_ref_sg = (sg) ((Object) param1);
                  var13_ref_sg.c(var14_ref_sg.o((byte) -117), 19581);
                  var14_ref_sg.c(var13_ref_sg.o((byte) -117), 19581);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              var13 = var10.field_q;
              var14 = 0;
              var15 = 0;
              var16 = 0;
              if (null == var20.field_c) {
                break L3;
              } else {
                if (0 < var20.field_c.a((byte) 24).b((byte) 63)) {
                  L4: {
                    var18 = jsb.field_d * var20.field_c.field_b >> 819756996;
                    var8 = var7.field_q * var18;
                    if (1 >= var18) {
                      break L4;
                    } else {
                      var14 = 1;
                      break L4;
                    }
                  }
                  var15 = 1;
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L5: {
              var17 = 0;
              if (var9.field_c == null) {
                break L5;
              } else {
                if (0 < var9.field_c.a((byte) 24).b((byte) 71)) {
                  L6: {
                    var18 = jsb.field_d * var9.field_c.field_b >> 383448068;
                    if (-2 > (var18 ^ -1)) {
                      var16 = 1;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  var17 = 1;
                  var13 = var18 * var10.field_q;
                  break L5;
                } else {
                  break L5;
                }
              }
            }
            L7: {
              if (var20.i((byte) -112).field_r) {
                var15 = 1;
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              if (!var9.i((byte) -112).field_r) {
                break L8;
              } else {
                var17 = 1;
                break L8;
              }
            }
            L9: {
              if (!var20.k((byte) 69)) {
                stackIn_36_0 = 0;
                break L9;
              } else {
                stackIn_36_0 = 1;
                break L9;
              }
            }
            L10: {
              var18 = stackIn_36_0;
              var19 = var9.k((byte) 48) ? 1 : 0;
              if (var18 != 0) {
                break L10;
              } else {
                if (var19 != 0) {
                  break L10;
                } else {
                  L11: {
                    L12: {
                      if (var15 == 0) {
                        break L12;
                      } else {
                        if (var17 == 0) {
                          break L11;
                        } else {
                          break L12;
                        }
                      }
                    }
                    L13: {
                      if (var12 == 0) {
                        break L13;
                      } else {
                        if (((sg) ((Object) param1)).j((byte) 103)) {
                          break L11;
                        } else {
                          break L13;
                        }
                      }
                    }
                    var20.a(var13, (byte) -119);
                    break L11;
                  }
                  L14: {
                    L15: {
                      if (var17 == 0) {
                        break L15;
                      } else {
                        if (var15 == 0) {
                          break L14;
                        } else {
                          break L15;
                        }
                      }
                    }
                    L16: {
                      if (var11 == 0) {
                        break L16;
                      } else {
                        if (((sg) ((Object) param0)).j((byte) -74)) {
                          break L14;
                        } else {
                          break L16;
                        }
                      }
                    }
                    var9.a(var8, (byte) -125);
                    break L14;
                  }
                  L17: {
                    if (null == var20.field_c) {
                      break L17;
                    } else {
                      if (var20.field_c.a((byte) 24).b((byte) 101) > 0) {
                        var20.field_c.field_b = var20.field_c.field_b * 3 / 4;
                        break L17;
                      } else {
                        break L17;
                      }
                    }
                  }
                  if (var9.field_c == null) {
                    break L10;
                  } else {
                    if (-1 <= (var9.field_c.a((byte) 24).b((byte) 47) ^ -1)) {
                      break L10;
                    } else {
                      var9.field_c.field_b = var9.field_c.field_b * 3 / 4;
                      break L10;
                    }
                  }
                }
              }
            }
            L18: {
              L19: {
                if (var14 != 0) {
                  break L19;
                } else {
                  if (var10.field_y <= 0) {
                    break L18;
                  } else {
                    break L19;
                  }
                }
              }
              if (var19 == 0) {
                break L18;
              } else {
                param0.field_k.a(true, var9, (pe) (this), 101, param0);
                param0.field_k.a((byte) -125, param0);
                if ((var10.field_y ^ -1) >= -1) {
                  break L18;
                } else {
                  this.a((byte) -44, param0, var9, var10);
                  break L18;
                }
              }
            }
            L20: {
              L21: {
                if (var16 != 0) {
                  break L21;
                } else {
                  if (var7.field_y <= 0) {
                    break L20;
                  } else {
                    break L21;
                  }
                }
              }
              if (var18 == 0) {
                break L20;
              } else {
                param1.field_k.a(true, var20, (pe) (this), 62, param1);
                param1.field_k.a((byte) 116, param1);
                if ((var7.field_y ^ -1) < -1) {
                  this.a((byte) -44, param1, var20, var7);
                  break L20;
                } else {
                  break L20;
                }
              }
            }
            L22: {
              if (var14 == 0) {
                break L22;
              } else {
                if (var20.k((byte) 91)) {
                  break L22;
                } else {
                  rmb.a(param2.field_l, param1.field_l, 46, -126, param2.field_e);
                  this.a(var8 >> 1709871464, param2.field_l, var7.field_v, (byte) -82, param2.field_e, var20.field_n, var20.field_r);
                  break L22;
                }
              }
            }
            L23: {
              if (var16 == 0) {
                break L23;
              } else {
                if (!var9.k((byte) 118)) {
                  rmb.a(param2.field_l, param0.field_l, 46, -89, param2.field_e);
                  this.a(var13 >> -1203363480, param2.field_l, var10.field_v, (byte) -13, param2.field_e, var9.field_n, var9.field_r);
                  break L23;
                } else {
                  break L23;
                }
              }
            }
            L24: {
              if (param3 == 46) {
                break L24;
              } else {
                this.a((tv) null, -125);
                break L24;
              }
            }
            param0.d((byte) 71);
            param1.d((byte) 107);
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L25: {
            var6 = decompiledCaughtException;
            stackIn_89_0 = (RuntimeException) (var6);

            stackIn_89_1 = new StringBuilder().append("pe.VA(");

            if (param0 == null) {
              stackIn_90_0 = (RuntimeException) ((Object) stackIn_89_0);
              stackIn_90_1 = (StringBuilder) ((Object) stackIn_89_1);
              stackIn_90_2 = "null";
              break L25;
            } else {
              stackIn_90_0 = (RuntimeException) ((Object) stackIn_89_0);
              stackIn_90_1 = (StringBuilder) ((Object) stackIn_89_1);
              stackIn_90_2 = "{...}";
              break L25;
            }
          }
          L26: {
            stackIn_93_0 = (RuntimeException) ((Object) stackIn_90_0);

            stackIn_93_1 = ((StringBuilder) (Object) stackIn_90_1).append(stackIn_90_2).append(',');

            if (param1 == null) {
              stackIn_94_0 = (RuntimeException) ((Object) stackIn_93_0);
              stackIn_94_1 = (StringBuilder) ((Object) stackIn_93_1);
              stackIn_94_2 = "null";
              break L26;
            } else {
              stackIn_94_0 = (RuntimeException) ((Object) stackIn_90_0);
              stackIn_94_1 = (StringBuilder) ((Object) stackIn_93_1);
              stackIn_94_2 = "{...}";
              break L26;
            }
          }
          L27: {
            stackIn_97_0 = (RuntimeException) ((Object) stackIn_94_0);

            stackIn_97_1 = ((StringBuilder) (Object) stackIn_94_1).append(stackIn_94_2).append(',');

            if (param2 == null) {
              stackIn_98_0 = (RuntimeException) ((Object) stackIn_97_0);
              stackIn_98_1 = (StringBuilder) ((Object) stackIn_97_1);
              stackIn_98_2 = "null";
              break L27;
            } else {
              stackIn_98_0 = (RuntimeException) ((Object) stackIn_94_0);
              stackIn_98_1 = (StringBuilder) ((Object) stackIn_97_1);
              stackIn_98_2 = "{...}";
              break L27;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_98_0), stackIn_98_2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(byte param0, tj param1, boolean param2) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              if (wna.field_c.a((byte) 92)) {
                param1.a(false, gab.field_b, wna.field_c.field_b, wna.field_c.field_a);
                wna.field_c.a(2147483647);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (gab.field_b.a((byte) 123)) {
                gab.field_b.a((pe) (this), -1, wgb.field_i, param2);
                gab.field_b.b((byte) -113);
                break L2;
              } else {
                break L2;
              }
            }
            var4_int = 1 % ((30 - param0) / 36);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var4);

            stackIn_13_1 = new StringBuilder().append("pe.IB(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param2 + ')');
        }
    }

    final anb d(byte param0, int param1) {
        anb var3;
        if (-1 >= (param1 ^ -1)) {
          var3 = this.b(this.field_k, true, param1);
          if (null != var3) {
            return var3;
          } else {
            param1 = param1 - field_w[0];
            var3 = this.b(this.field_m, true, param1);
            if (param0 == -27) {
              if (var3 == null) {
                param1 = param1 - field_w[1];
                var3 = this.b(this.field_e.c(0), true, param1);
                if (var3 != null) {
                  return var3;
                } else {
                  param1 = param1 - field_w[2];
                  var3 = this.b(this.field_g, true, param1);
                  return var3;
                }
              } else {
                return var3;
              }
            } else {
              return (anb) null;
            }
          }
        } else {
          return null;
        }
    }

    final it a(byte param0, int param1) {
        int var3;
        it[] var4;
        int var5;
        it var6;
        int var7;
        var7 = VoidHunters.field_G;
        if (this.field_j != null) {
          var3 = -102 % ((-32 - param0) / 63);
          var4 = this.field_j;
          var5 = 0;
          L0: while (true) {
            if (var4.length > var5) {
              var6 = var4[var5];
              if (var6.field_k == param1) {
                return var6;
              } else {
                var5++;
                continue L0;
              }
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    final void a(int param0, int param1, anb param2) {
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        Object var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = VoidHunters.field_G;
        try {
          L0: {
            var4_int = -field_c[param1] + param2.field_l;
            if (var4_int < 0) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var5 = null;
                var6 = -1;
                var7 = param1;
                if (-1 != (var7 ^ -1)) {
                  if (var7 != 1) {
                    if (-3 == (var7 ^ -1)) {
                      var6 = 3;
                      var5 = this.field_e.c(0);
                      this.field_e.b(-89);
                      break L1;
                    } else {
                      if (3 != var7) {
                        break L1;
                      } else {
                        var5 = this.field_g;
                        break L1;
                      }
                    }
                  } else {
                    L2: {
                      this.l(-96);
                      if (1 != hw.field_b) {
                        break L2;
                      } else {
                        var6 = 2;
                        break L2;
                      }
                    }
                    var5 = this.field_m;
                    break L1;
                  }
                } else {
                  var5 = this.field_k;
                  var6 = 1;
                  break L1;
                }
              }
              L3: {
                if (param0 < -96) {
                  break L3;
                } else {
                  this.field_q = true;
                  break L3;
                }
              }
              L4: {
                if (var5 == null) {
                  break L4;
                } else {
                  if (((Object[]) (var5)).length <= var4_int) {
                    break L4;
                  } else {
                    ((Object[]) (var5))[var4_int] = null;
                    break L4;
                  }
                }
              }
              L5: {
                if (var6 != -1) {
                  this.field_u.a(param2.field_l, param2.field_q, var6, (byte) -94);
                  break L5;
                } else {
                  break L5;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackIn_34_0 = (RuntimeException) (var4);

            stackIn_34_1 = new StringBuilder().append("pe.GE(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "null";
              break L6;
            } else {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "{...}";
              break L6;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_35_0), stackIn_35_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final void b(byte param0, tv param1) {
        RuntimeException stackIn_101_0 = null;
        StringBuilder stackIn_101_1 = null;
        RuntimeException stackIn_102_0 = null;
        StringBuilder stackIn_102_1 = null;
        String stackIn_102_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var5 = 0;
        Object var6 = null;
        pe var6_ref = null;
        Object var7 = null;
        Object var8 = null;
        Object var9 = null;
        Object var10 = null;
        Object var11 = null;
        Object var12 = null;
        Object var13 = null;
        Object var14 = null;
        var6 = null;
        var5 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var6_ref = (pe) ((Object) param1);
              var6_ref.field_k = (sg[]) ((Object) sqb.a(var6_ref.field_k, this.field_k, 1, qdb.field_a, false));
              if (this.field_v) {
                L2: {
                  if (VoidHunters.a(true, this.field_k)) {
                    System.err.println("Ship[] ships the actual object has a duplicate reference");
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var7 = tjb.a(this.field_k, 0);
                if (null == var7) {
                  break L1;
                } else {
                  System.err.println("An element of Ship[] ships has a duplicate reference - " + var7.toString());
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L3: {
              var6_ref.field_s = (oq[]) ((Object) sqb.a(var6_ref.field_s, this.field_s, 1, tt.field_c, false));
              if (!this.field_v) {
                break L3;
              } else {
                L4: {
                  if (!VoidHunters.a(true, this.field_s)) {
                    break L4;
                  } else {
                    System.err.println("Particle[] particles the actual object has a duplicate reference");
                    break L4;
                  }
                }
                var8 = tjb.a(this.field_s, 0);
                if (var8 == null) {
                  break L3;
                } else {
                  System.err.println("An element of Particle[] particles has a duplicate reference - " + var8.toString());
                  break L3;
                }
              }
            }
            L5: {
              var6_ref.field_x = kk.a(var6_ref.field_x, this.field_x, 1, aba.field_b, -90);
              if (!this.field_v) {
                break L5;
              } else {
                L6: {
                  if (!VoidHunters.a(true, this.field_x)) {
                    break L6;
                  } else {
                    System.err.println("linklist<voidhunters.common.worldstate.Projectile> projectiles the actual object has a duplicate reference");
                    break L6;
                  }
                }
                var9 = nqa.a(this.field_x, 12642);
                if (var9 != null) {
                  System.err.println("An element of linklist<voidhunters.common.worldstate.Projectile> projectiles has a duplicate reference - " + var9.toString());
                  break L5;
                } else {
                  break L5;
                }
              }
            }
            L7: {
              this.field_h = false;
              var6_ref.field_m = this.field_m;
              var6_ref.field_h = false;
              if (this.field_e == null) {
                var6_ref.field_e = null;
                break L7;
              } else {
                L8: {
                  if (null != var6_ref.field_e) {
                    break L8;
                  } else {
                    var6_ref.field_e = new aib();
                    break L8;
                  }
                }
                this.field_e.b((byte) 79, var6_ref.field_e);
                if (!this.field_v) {
                  break L7;
                } else {
                  if (VoidHunters.a(true, this.field_e)) {
                    System.err.println("AsteroidContainer asteroid_container has a duplicate reference");
                    break L7;
                  } else {
                    break L7;
                  }
                }
              }
            }
            L9: {
              var6_ref.field_n = kk.a(var6_ref.field_n, this.field_n, 1, ioa.field_q, 88);
              if (this.field_v) {
                L10: {
                  if (VoidHunters.a(true, this.field_n)) {
                    System.err.println("linklist<voidhunters.common.worldstate.SpawnPoint> spawn_points the actual object has a duplicate reference");
                    break L10;
                  } else {
                    break L10;
                  }
                }
                var10 = nqa.a(this.field_n, 12642);
                if (var10 == null) {
                  break L9;
                } else {
                  System.err.println("An element of linklist<voidhunters.common.worldstate.SpawnPoint> spawn_points has a duplicate reference - " + var10.toString());
                  break L9;
                }
              } else {
                break L9;
              }
            }
            L11: {
              var6_ref.field_g = (mqb[]) ((Object) sqb.a(var6_ref.field_g, this.field_g, 1, dab.field_c, false));
              if (!this.field_v) {
                break L11;
              } else {
                L12: {
                  if (VoidHunters.a(true, this.field_g)) {
                    System.err.println("GrapplingHook[] grappling_hooks the actual object has a duplicate reference");
                    break L12;
                  } else {
                    break L12;
                  }
                }
                var11 = tjb.a(this.field_g, 0);
                if (null != var11) {
                  System.err.println("An element of GrapplingHook[] grappling_hooks has a duplicate reference - " + var11.toString());
                  break L11;
                } else {
                  break L11;
                }
              }
            }
            L13: {
              var6_ref.field_l = dob.a(var6_ref.field_l, (byte) -66, this.field_l);
              var6_ref.field_v = this.field_v;
              if (param0 >= 54) {
                break L13;
              } else {
                this.a((byte) -80, (tv) null);
                break L13;
              }
            }
            L14: {
              var6_ref.field_y = this.field_y;
              var6_ref.field_i = this.field_i;
              if (this.field_f != null) {
                L15: {
                  if (null != var6_ref.field_f) {
                    break L15;
                  } else {
                    var6_ref.field_f = new una();
                    break L15;
                  }
                }
                this.field_f.b((byte) 87, var6_ref.field_f);
                if (!this.field_v) {
                  break L14;
                } else {
                  if (VoidHunters.a(true, this.field_f)) {
                    System.err.println("MissionControl mission_control has a duplicate reference");
                    break L14;
                  } else {
                    break L14;
                  }
                }
              } else {
                var6_ref.field_f = null;
                break L14;
              }
            }
            L16: {
              var6_ref.field_t = (cq[]) ((Object) sqb.a(var6_ref.field_t, this.field_t, 1, wsb.field_e, false));
              if (this.field_v) {
                L17: {
                  if (!VoidHunters.a(true, this.field_t)) {
                    break L17;
                  } else {
                    System.err.println("MapZone[] map_zones the actual object has a duplicate reference");
                    break L17;
                  }
                }
                var12 = tjb.a(this.field_t, 0);
                if (null == var12) {
                  break L16;
                } else {
                  System.err.println("An element of MapZone[] map_zones has a duplicate reference - " + var12.toString());
                  break L16;
                }
              } else {
                break L16;
              }
            }
            L18: {
              var6_ref.field_a = (rba[]) ((Object) sqb.a(var6_ref.field_a, this.field_a, 1, ema.field_p, false));
              if (this.field_v) {
                L19: {
                  if (!VoidHunters.a(true, this.field_a)) {
                    break L19;
                  } else {
                    System.err.println("ResourceNode[] res_nodes the actual object has a duplicate reference");
                    break L19;
                  }
                }
                var13 = tjb.a(this.field_a, 0);
                if (var13 != null) {
                  System.err.println("An element of ResourceNode[] res_nodes has a duplicate reference - " + var13.toString());
                  break L18;
                } else {
                  break L18;
                }
              } else {
                break L18;
              }
            }
            L20: {
              var6_ref.field_p = this.field_p;
              this.field_q = false;
              var6_ref.field_o = this.field_o;
              var6_ref.field_r = this.field_r;
              var6_ref.field_q = false;
              if (null != this.field_u) {
                L21: {
                  if (var6_ref.field_u == null) {
                    var6_ref.field_u = new fba();
                    break L21;
                  } else {
                    break L21;
                  }
                }
                this.field_u.b((byte) 122, var6_ref.field_u);
                if (!this.field_v) {
                  break L20;
                } else {
                  if (!VoidHunters.a(true, this.field_u)) {
                    break L20;
                  } else {
                    System.err.println("PartitioningManager grid has a duplicate reference");
                    break L20;
                  }
                }
              } else {
                var6_ref.field_u = null;
                break L20;
              }
            }
            L22: {
              var6_ref.field_j = (it[]) ((Object) sqb.a(var6_ref.field_j, this.field_j, 1, pgb.field_g, false));
              if (this.field_v) {
                L23: {
                  if (!VoidHunters.a(true, this.field_j)) {
                    break L23;
                  } else {
                    System.err.println("EscapePod[] escape_pods the actual object has a duplicate reference");
                    break L23;
                  }
                }
                var14 = tjb.a(this.field_j, 0);
                if (var14 != null) {
                  System.err.println("An element of EscapePod[] escape_pods has a duplicate reference - " + var14.toString());
                  break L22;
                } else {
                  break L22;
                }
              } else {
                break L22;
              }
            }
            var6_ref.field_b = this.field_b;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L24: {
            var3 = decompiledCaughtException;
            stackIn_101_0 = (RuntimeException) (var3);

            stackIn_101_1 = new StringBuilder().append("pe.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_102_0 = (RuntimeException) ((Object) stackIn_101_0);
              stackIn_102_1 = (StringBuilder) ((Object) stackIn_101_1);
              stackIn_102_2 = "null";
              break L24;
            } else {
              stackIn_102_0 = (RuntimeException) ((Object) stackIn_101_0);
              stackIn_102_1 = (StringBuilder) ((Object) stackIn_101_1);
              stackIn_102_2 = "{...}";
              break L24;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_102_0), stackIn_102_2 + ')');
        }
    }

    final void a(bba param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null != this.field_f) {
                break L1;
              } else {
                this.field_f = new una();
                break L1;
              }
            }
            L2: {
              if (param1 == -38) {
                break L2;
              } else {
                this.field_k = (sg[]) null;
                break L2;
              }
            }
            this.field_f.a(0, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (runtimeException);

            stackIn_9_1 = new StringBuilder().append("pe.AF(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
    }

    public final boolean a(byte param0, tv param1) {
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_22_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_33_1 = 0;
        int stackIn_46_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_50_1 = 0;
        int stackIn_57_0 = 0;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_62_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        pe var5 = null;
        try {
          L0: {
            L1: {
              L2: {
                var4 = 33 % ((22 - param0) / 59);
                var5 = (pe) ((Object) param1);
                if (dn.a(var5.field_k, false, 1, this.field_k, 126)) {
                  break L2;
                } else {
                  if (dn.a(hob.a(var5.field_x, 210377952), false, 1, hob.a(this.field_x, 210377952), -79)) {
                    break L2;
                  } else {
                    if (dn.a(var5.field_m, false, 1, this.field_m, 117)) {
                      break L2;
                    } else {
                      L3: {
                        if (this.field_e != null) {
                          stackIn_7_0 = 0;
                          break L3;
                        } else {
                          stackIn_7_0 = 1;
                          break L3;
                        }
                      }
                      L4: {
                        stackIn_10_0 = stackIn_7_0;

                        if (var5.field_e != null) {
                          stackIn_11_0 = stackIn_10_0;
                          stackIn_11_1 = 0;
                          break L4;
                        } else {
                          stackIn_11_0 = stackIn_7_0;
                          stackIn_11_1 = 1;
                          break L4;
                        }
                      }
                      if ((stackIn_11_0 ^ stackIn_11_1) != 0) {
                        break L2;
                      } else {
                        L5: {
                          if (null == this.field_e) {
                            break L5;
                          } else {
                            if (this.field_e.a((byte) -65, var5.field_e)) {
                              break L2;
                            } else {
                              break L5;
                            }
                          }
                        }
                        if (dn.a(hob.a(var5.field_n, 210377952), false, 1, hob.a(this.field_n, 210377952), -93)) {
                          break L2;
                        } else {
                          if (dn.a(var5.field_g, false, 1, this.field_g, 122)) {
                            break L2;
                          } else {
                            if (wpb.a(var5.field_l, this.field_l, (byte) 28)) {
                              break L2;
                            } else {
                              L6: {
                                if (var5.field_v) {
                                  stackIn_22_0 = 0;
                                  break L6;
                                } else {
                                  stackIn_22_0 = 1;
                                  break L6;
                                }
                              }
                              if (stackIn_22_0 == (this.field_v ? 1 : 0)) {
                                break L2;
                              } else {
                                if (var5.field_y != this.field_y) {
                                  break L2;
                                } else {
                                  if (var5.field_i != this.field_i) {
                                    break L2;
                                  } else {
                                    L7: {
                                      if (var5.field_f != null) {
                                        stackIn_29_0 = 0;
                                        break L7;
                                      } else {
                                        stackIn_29_0 = 1;
                                        break L7;
                                      }
                                    }
                                    L8: {
                                      stackIn_32_0 = stackIn_29_0;

                                      if (null != this.field_f) {
                                        stackIn_33_0 = stackIn_32_0;
                                        stackIn_33_1 = 0;
                                        break L8;
                                      } else {
                                        stackIn_33_0 = stackIn_29_0;
                                        stackIn_33_1 = 1;
                                        break L8;
                                      }
                                    }
                                    if ((stackIn_33_0 ^ stackIn_33_1) != 0) {
                                      break L2;
                                    } else {
                                      L9: {
                                        if (null == this.field_f) {
                                          break L9;
                                        } else {
                                          if (this.field_f.a((byte) 123, var5.field_f)) {
                                            break L2;
                                          } else {
                                            break L9;
                                          }
                                        }
                                      }
                                      if (dn.a(var5.field_t, false, 1, this.field_t, -71)) {
                                        break L2;
                                      } else {
                                        if (dn.a(var5.field_a, false, 1, this.field_a, -5)) {
                                          break L2;
                                        } else {
                                          if (var5.field_o != this.field_o) {
                                            break L2;
                                          } else {
                                            if (var5.field_r != this.field_r) {
                                              break L2;
                                            } else {
                                              if (dn.a(var5.field_j, false, 1, this.field_j, -20)) {
                                                break L2;
                                              } else {
                                                L10: {
                                                  if (null != this.field_b) {
                                                    stackIn_46_0 = 0;
                                                    break L10;
                                                  } else {
                                                    stackIn_46_0 = 1;
                                                    break L10;
                                                  }
                                                }
                                                L11: {
                                                  stackIn_49_0 = stackIn_46_0;

                                                  if (null != var5.field_b) {
                                                    stackIn_50_0 = stackIn_49_0;
                                                    stackIn_50_1 = 0;
                                                    break L11;
                                                  } else {
                                                    stackIn_50_0 = stackIn_46_0;
                                                    stackIn_50_1 = 1;
                                                    break L11;
                                                  }
                                                }
                                                if ((stackIn_50_0 ^ stackIn_50_1) != 0) {
                                                  break L2;
                                                } else {
                                                  L12: {
                                                    if (this.field_b == null) {
                                                      break L12;
                                                    } else {
                                                      if (!this.field_b.a((byte) 89, var5.field_b)) {
                                                        break L12;
                                                      } else {
                                                        break L2;
                                                      }
                                                    }
                                                  }
                                                  stackIn_57_0 = 0;
                                                  break L1;
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
                          }
                        }
                      }
                    }
                  }
                }
              }
              stackIn_57_0 = 1;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var3 = decompiledCaughtException;
            stackIn_61_0 = (RuntimeException) (var3);

            stackIn_61_1 = new StringBuilder().append("pe.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_62_0 = (RuntimeException) ((Object) stackIn_61_0);
              stackIn_62_1 = (StringBuilder) ((Object) stackIn_61_1);
              stackIn_62_2 = "null";
              break L13;
            } else {
              stackIn_62_0 = (RuntimeException) ((Object) stackIn_61_0);
              stackIn_62_1 = (StringBuilder) ((Object) stackIn_61_1);
              stackIn_62_2 = "{...}";
              break L13;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_62_0), stackIn_62_2 + ')');
        }
        return stackIn_57_0 != 0;
    }

    private final boolean a(ml param0, ml param1, int param2, sg param3, int param4) {
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_27_0 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        ml var7 = null;
        Object var8 = null;
        int var10 = 0;
        var10 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param0.field_d == null) {
                break L1;
              } else {
                var6_int = 0;
                L2: while (true) {
                  if (var6_int >= param0.field_d.length) {
                    break L1;
                  } else {
                    L3: {
                      var7 = param0.d(param0.field_d[var6_int].field_c, 692);
                      var8 = null;
                      if (null == param1) {
                        break L3;
                      } else {
                        if (null == param1.field_d) {
                          break L3;
                        } else {
                          if (param1.field_d.length == param0.field_d.length) {
                            var8 = param1.d(param1.field_d[var6_int].field_c, 692);
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    L4: {
                      if (null == var7) {
                        break L4;
                      } else {
                        if (param4 != var7.k(param2 + 0)) {
                          break L4;
                        } else {
                          L5: {
                            if (var8 == null) {
                              break L5;
                            } else {
                              if (((ml) (var8)).k(0) != var7.k(param2 ^ 0)) {
                                break L5;
                              } else {
                                break L4;
                              }
                            }
                          }
                          var7.a((pe) (this), (byte) -111, (anb) (param3));
                          param0.a(false, var7, (pe) (this), param2 ^ 94, param3);
                          qba.a(20382, param3.d(false), 8, param3.g((byte) -90), 5);
                          stackIn_21_0 = 1;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      }
                    }
                    L6: {
                      if (null == var7) {
                        break L6;
                      } else {
                        if (!this.a(var7, (ml) (var8), 0, param3, param4)) {
                          break L6;
                        } else {
                          stackIn_18_0 = 1;
                          decompiledRegionSelector0 = 0;
                          break L0;
                        }
                      }
                    }
                    var6_int++;
                    continue L2;
                  }
                }
              }
            }
            if (param2 == 0) {
              stackIn_27_0 = 0;
              decompiledRegionSelector0 = 3;
              break L0;
            } else {
              stackIn_25_0 = 0;
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackIn_31_0 = (RuntimeException) (var6);

            stackIn_31_1 = new StringBuilder().append("pe.T(");

            if (param0 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L7;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L7;
            }
          }
          L8: {
            stackIn_35_0 = (RuntimeException) ((Object) stackIn_32_0);

            stackIn_35_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(',');

            if (param1 == null) {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "null";
              break L8;
            } else {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "{...}";
              break L8;
            }
          }
          L9: {
            stackIn_39_0 = (RuntimeException) ((Object) stackIn_36_0);

            stackIn_39_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_36_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_40_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "null";
              break L9;
            } else {
              stackIn_40_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "{...}";
              break L9;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_40_0), stackIn_40_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_18_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_21_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_25_0 != 0;
            } else {
              return stackIn_27_0 != 0;
            }
          }
        }
    }

    final rca a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var7;
        int var8;
        crb[] var9;
        rca var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        crb[] var19_ref_crb__;
        int var19;
        int var20_int;
        sg[] var20;
        crb var21_ref_crb;
        int var21;
        int var22_int;
        sg var22;
        int var23;
        int var24;
        int var25;
        int var26;
        var26 = VoidHunters.field_G;
        var7 = 32768;
        var8 = 0;
        var9 = this.field_e.c(param2);
        var10 = new rca();
        var11 = -(param5 / 2) + param3;
        var11 = Math.max(var11, var7 + -(this.field_o / 2));
        var12 = param5 / 2 + param3;
        var12 = Math.min(var12, -var7 + this.field_o / 2);
        var13 = param0 - param1 / 2;
        var13 = Math.max(var13, var7 + -(this.field_r / 2));
        var14 = param1 / 2 + param0;
        var14 = Math.min(var14, this.field_r / 2 - var7);
        var15 = 0;
        L0: while (true) {
          if (var15 >= 100) {
            return var10;
          } else {
            var16 = hob.a(vg.field_o, -var11 + var12, 124) + var11;
            var17 = hob.a(vg.field_o, -var13 + var14, 123) + var13;
            var18 = 1;
            var19_ref_crb__ = var9;
            var20_int = 0;
            L1: while (true) {
              L2: {
                if (var19_ref_crb__.length <= var20_int) {
                  break L2;
                } else {
                  var21_ref_crb = var19_ref_crb__[var20_int];
                  if (var21_ref_crb != null) {
                    var22_int = var7 + var21_ref_crb.g(-39);
                    var23 = var21_ref_crb.field_d - var16;
                    var24 = var21_ref_crb.field_e - var17;
                    var25 = ar.a(var23, (byte) 126, var24);
                    if (var22_int > var25) {
                      var18 = 0;
                      break L2;
                    } else {
                      var20_int++;
                      continue L1;
                    }
                  } else {
                    var20_int++;
                    continue L1;
                  }
                }
              }
              if (var18 != 0) {
                var19 = 2147483647;
                var20 = this.field_k;
                var21 = 0;
                L3: while (true) {
                  if (var20.length <= var21) {
                    if (var19 > var8) {
                      var10.field_b = var17;
                      var8 = var19;
                      var10.field_c = var16;
                      var15++;
                      continue L0;
                    } else {
                      var15++;
                      continue L0;
                    }
                  } else {
                    var22 = var20[var21];
                    if (null != var22) {
                      if (param4 != var22.q((byte) 126)) {
                        var23 = var22.field_d + -var16;
                        var24 = var22.field_e - var17;
                        var25 = ar.a(var23, (byte) 121, var24);
                        if (var25 < var19) {
                          var19 = var25;
                          var21++;
                          continue L3;
                        } else {
                          var21++;
                          continue L3;
                        }
                      } else {
                        var21++;
                        continue L3;
                      }
                    } else {
                      var21++;
                      continue L3;
                    }
                  }
                }
              } else {
                var15++;
                continue L0;
              }
            }
          }
        }
    }

    private final void a(int param0, int param1, tfa[] param2, lbb param3) {
        RuntimeException stackIn_100_0 = null;
        StringBuilder stackIn_100_1 = null;
        RuntimeException stackIn_101_0 = null;
        StringBuilder stackIn_101_1 = null;
        String stackIn_101_2 = null;
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        RuntimeException stackIn_105_0 = null;
        StringBuilder stackIn_105_1 = null;
        String stackIn_105_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        sg[] var7_ref_sg__ = null;
        int var7 = 0;
        int var8 = 0;
        sg var9_ref_sg = null;
        int var9 = 0;
        int var10 = 0;
        Object var11 = null;
        int var12 = 0;
        boolean[] var13 = null;
        ml[] var14 = null;
        ml[] var15_ref_ml__ = null;
        int var15 = 0;
        int var16 = 0;
        ml var17_ref_ml = null;
        int var17 = 0;
        int var18_int = 0;
        ml var18 = null;
        int var19_int = 0;
        nbb var19 = null;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var25 = 0;
        sg var26 = null;
        sg var27 = null;
        String var28 = null;
        var23 = VoidHunters.field_G;
        try {
          L0: {
            if (param0 > 18) {
              var5_int = 0;
              L1: while (true) {
                if (var5_int >= this.field_l.length) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var6 = 0;
                  var7_ref_sg__ = this.field_k;
                  var8 = 0;
                  L2: while (true) {
                    L3: {
                      if (var7_ref_sg__.length <= var8) {
                        break L3;
                      } else {
                        L4: {
                          var9_ref_sg = var7_ref_sg__[var8];
                          if (var9_ref_sg == null) {
                            break L4;
                          } else {
                            if (var9_ref_sg.o((byte) -117) == var5_int) {
                              var6 = 1;
                              break L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                        var8++;
                        continue L2;
                      }
                    }
                    if (var6 == 0) {
                      var7 = param2[var5_int].field_h;
                      if (this.a(var7, param3, -14368)) {
                        L5: {
                          this.field_l[var5_int] = this.field_l[var5_int] + 1;
                          var8 = oq.field_C;
                          if (!param3.c((byte) -59)) {
                            break L5;
                          } else {
                            var8 = oq.field_l * 3;
                            break L5;
                          }
                        }
                        L6: {
                          L7: {
                            if (this.field_l[var5_int] == var8) {
                              if ((this.d(false) ^ -1) == -14) {
                                this.field_l[var5_int] = var8 - 1;
                                break L6;
                              } else {
                                break L7;
                              }
                            } else {
                              break L7;
                            }
                          }
                          if (var8 < this.field_l[var5_int]) {
                            L8: {
                              if (param2[var5_int].field_a) {
                                break L8;
                              } else {
                                if (1 == foa.field_p) {
                                  break L8;
                                } else {
                                  this.field_l[var5_int] = oq.field_C;
                                  break L6;
                                }
                              }
                            }
                            L9: {
                              this.field_l[var5_int] = 0;
                              var9 = param2[var5_int].field_m;
                              if (param2[var5_int].field_a) {
                                break L9;
                              } else {
                                if (-2 == (foa.field_p ^ -1)) {
                                  var9 = (var5_int + 1) * param1 % ak.e((byte) 36);
                                  break L9;
                                } else {
                                  break L9;
                                }
                              }
                            }
                            L10: {
                              L11: {
                                var10 = 3 + var9;
                                var11 = null;
                                var12 = 0;
                                if (null == param2[var5_int].field_g) {
                                  break L11;
                                } else {
                                  L12: {
                                    if (param3.c((byte) -51)) {
                                      break L12;
                                    } else {
                                      if (cg.a((byte) -104, this.d(false))) {
                                        break L12;
                                      } else {
                                        if ((qrb.field_a ^ -1) != -2) {
                                          break L11;
                                        } else {
                                          if (param2[var5_int].field_g.field_k.k(0) == var10) {
                                            break L12;
                                          } else {
                                            break L11;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  L13: {
                                    var27 = new sg();
                                    var27 = var27;
                                    var11 = var27;
                                    param2[var5_int].field_g.b((byte) 74, var27);
                                    var12 = 1;
                                    if (param3.c((byte) -42)) {
                                      break L13;
                                    } else {
                                      if (!cg.a((byte) -95, this.d(false))) {
                                        break L10;
                                      } else {
                                        break L13;
                                      }
                                    }
                                  }
                                  if (-1 == (qrb.field_a ^ -1)) {
                                    param2[var5_int].field_g = null;
                                    break L10;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                              var26 = t.a(var10, (byte) 36);
                              var26 = var26;
                              break L10;
                            }
                            L14: {
                              if (null != var11) {
                                L15: {
                                  if (!vpa.a((byte) -100)) {
                                    break L15;
                                  } else {
                                    if (!param3.c((byte) 112)) {
                                      var28 = obb.field_o[((sg) (var11)).field_k.k(0)];
                                      if (var12 != 0) {
                                        qa.a(202, "spawns_as_saved_" + var28, 1);
                                        break L15;
                                      } else {
                                        qa.a(202, "spawns_as_new_" + var28, 1);
                                        break L15;
                                      }
                                    } else {
                                      break L15;
                                    }
                                  }
                                }
                                this.a(-200000, var5_int, param3.c((byte) 116), var7, param2.length, (sg) (var11));
                                break L14;
                              } else {
                                break L14;
                              }
                            }
                            L16: {
                              if ((param3.e(8) ^ -1) != -6) {
                                param2[var5_int].field_k = null;
                                break L16;
                              } else {
                                break L16;
                              }
                            }
                            if (null != param2[var5_int].field_k) {
                              L17: {
                                var13 = new boolean[param2[var5_int].field_k.length];
                                var14 = ((sg) (var11)).field_k.a((ml[]) null, (byte) 124);
                                if (var14 != null) {
                                  var15_ref_ml__ = var14;
                                  var16 = 0;
                                  L18: while (true) {
                                    if (var16 >= var15_ref_ml__.length) {
                                      break L17;
                                    } else {
                                      var17_ref_ml = var15_ref_ml__[var16];
                                      var18_int = var17_ref_ml.field_j;
                                      var19_int = 0;
                                      L19: while (true) {
                                        if (param2[var5_int].field_k.length > var19_int) {
                                          L20: {
                                            if (var13[var19_int]) {
                                              break L20;
                                            } else {
                                              if (param2[var5_int].field_k[var19_int] == var18_int) {
                                                var13[var19_int] = true;
                                                var16++;
                                                continue L18;
                                              } else {
                                                break L20;
                                              }
                                            }
                                          }
                                          var19_int++;
                                          continue L19;
                                        } else {
                                          var16++;
                                          continue L18;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  break L17;
                                }
                              }
                              var15 = ((sg) (var11)).g(-40) * 2;
                              var25 = 0;
                              var16 = var25;
                              L21: while (true) {
                                if (param2[var5_int].field_k.length <= var25) {
                                  param2[var5_int].field_k = null;
                                  break L6;
                                } else {
                                  L22: {
                                    if (!var13[var25]) {
                                      var17 = param2[var5_int].field_k[var25];
                                      var18 = new ml(var17);
                                      var19 = new nbb(var18, false);
                                      var20 = hob.a(vg.field_o, 8192, 122);
                                      var21 = (fc.a(var20, (byte) -115) >> 661939944) * (var15 >> 1513776808);
                                      var22 = (eu.a(var20, 107) >> 308810088) * (var15 >> 1142306024);
                                      var19.a(((sg) (var11)).d(false) - -var21, ((sg) (var11)).g((byte) 118) + var22, (byte) -70);
                                      var19.a(hob.a(vg.field_o, 8192, 124), -66);
                                      this.a(var19, (byte) 90);
                                      break L22;
                                    } else {
                                      break L22;
                                    }
                                  }
                                  var25++;
                                  continue L21;
                                }
                              }
                            } else {
                              var5_int++;
                              continue L1;
                            }
                          } else {
                            break L6;
                          }
                        }
                        var5_int++;
                        continue L1;
                      } else {
                        var5_int++;
                        continue L1;
                      }
                    } else {
                      var5_int++;
                      continue L1;
                    }
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L23: {
            var5 = decompiledCaughtException;
            stackIn_100_0 = (RuntimeException) (var5);

            stackIn_100_1 = new StringBuilder().append("pe.NE(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_101_0 = (RuntimeException) ((Object) stackIn_100_0);
              stackIn_101_1 = (StringBuilder) ((Object) stackIn_100_1);
              stackIn_101_2 = "null";
              break L23;
            } else {
              stackIn_101_0 = (RuntimeException) ((Object) stackIn_100_0);
              stackIn_101_1 = (StringBuilder) ((Object) stackIn_100_1);
              stackIn_101_2 = "{...}";
              break L23;
            }
          }
          L24: {
            stackIn_104_0 = (RuntimeException) ((Object) stackIn_101_0);

            stackIn_104_1 = ((StringBuilder) (Object) stackIn_101_1).append(stackIn_101_2).append(',');

            if (param3 == null) {
              stackIn_105_0 = (RuntimeException) ((Object) stackIn_104_0);
              stackIn_105_1 = (StringBuilder) ((Object) stackIn_104_1);
              stackIn_105_2 = "null";
              break L24;
            } else {
              stackIn_105_0 = (RuntimeException) ((Object) stackIn_101_0);
              stackIn_105_1 = (StringBuilder) ((Object) stackIn_104_1);
              stackIn_105_2 = "{...}";
              break L24;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_105_0), stackIn_105_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final void b(faa param0, int param1) {
        int stackIn_5_0 = 0;
        faa stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        faa stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        int stackIn_25_0 = 0;
        faa stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        faa stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        int stackIn_32_2 = 0;
        int stackIn_41_0 = 0;
        faa stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        faa stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        int stackIn_50_2 = 0;
        faa stackIn_56_0 = null;
        int stackIn_56_1 = 0;
        faa stackIn_57_0 = null;
        int stackIn_57_1 = 0;
        int stackIn_57_2 = 0;
        int stackIn_65_0 = 0;
        faa stackIn_71_0 = null;
        int stackIn_71_1 = 0;
        faa stackIn_72_0 = null;
        int stackIn_72_1 = 0;
        int stackIn_72_2 = 0;
        int stackIn_81_0 = 0;
        faa stackIn_89_0 = null;
        int stackIn_89_1 = 0;
        faa stackIn_90_0 = null;
        int stackIn_90_1 = 0;
        int stackIn_90_2 = 0;
        int stackIn_96_0 = 0;
        int stackIn_97_0 = 0;
        int stackIn_97_1 = 0;
        faa stackIn_100_0 = null;
        int stackIn_100_1 = 0;
        faa stackIn_101_0 = null;
        int stackIn_101_1 = 0;
        int stackIn_101_2 = 0;
        int stackIn_107_0 = 0;
        faa stackIn_115_0 = null;
        int stackIn_115_1 = 0;
        faa stackIn_116_0 = null;
        int stackIn_116_1 = 0;
        int stackIn_116_2 = 0;
        int stackIn_125_0 = 0;
        faa stackIn_133_0 = null;
        int stackIn_133_1 = 0;
        faa stackIn_134_0 = null;
        int stackIn_134_1 = 0;
        int stackIn_134_2 = 0;
        int stackIn_143_0 = 0;
        faa stackIn_151_0 = null;
        int stackIn_151_1 = 0;
        faa stackIn_152_0 = null;
        int stackIn_152_1 = 0;
        int stackIn_152_2 = 0;
        faa stackIn_160_0 = null;
        int stackIn_160_1 = 0;
        faa stackIn_161_0 = null;
        int stackIn_161_1 = 0;
        int stackIn_161_2 = 0;
        RuntimeException stackIn_168_0 = null;
        StringBuilder stackIn_168_1 = null;
        RuntimeException stackIn_169_0 = null;
        StringBuilder stackIn_169_1 = null;
        String stackIn_169_2 = null;
        RuntimeException decompiledCaughtException = null;
        faa var3 = null;
        RuntimeException var3_ref = null;
        sg[] var4 = null;
        tv[] var4_array = null;
        nbb[] var4_array2 = null;
        mqb[] var4_array3 = null;
        cq[] var4_array4 = null;
        rba[] var4_array5 = null;
        it[] var4_array6 = null;
        int var5 = 0;
        sg[] var6 = null;
        tv[] var6_array = null;
        int var7 = 0;
        sg var8 = null;
        tv var8_ref = null;
        nbb var8_ref2 = null;
        mqb var8_ref3 = null;
        cq var8_ref4 = null;
        rba var8_ref5 = null;
        it var8_ref6 = null;
        int var9 = 0;
        sg[] var10 = null;
        faa var11 = null;
        sg[] var12 = null;
        tv[] var13 = null;
        faa var14 = null;
        nbb[] var15 = null;
        faa var16 = null;
        nbb[] var17 = null;
        tv[] var18 = null;
        faa var19 = null;
        tv[] var20 = null;
        tv var21 = null;
        mqb[] var22 = null;
        faa var23 = null;
        mqb[] var24 = null;
        cq[] var25 = null;
        faa var26 = null;
        cq[] var27 = null;
        rba[] var28 = null;
        faa var29 = null;
        rba[] var30 = null;
        it[] var31 = null;
        faa var32 = null;
        it[] var33 = null;
        var9 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var11 = param0;
              var3 = var11;
              var10 = this.field_k;
              var4 = var10;
              if (var4 != null) {
                stackIn_5_0 = var10.length;
                break L1;
              } else {
                stackIn_5_0 = 0;
                break L1;
              }
            }
            L2: {
              var5 = stackIn_5_0;
              var11.a(-632, var5, 8);
              if (var5 != 0) {
                var12 = var4;
                var6 = var12;
                var7 = 0;
                L3: while (true) {
                  if (var12.length <= var7) {
                    break L2;
                  } else {
                    L4: {
                      var8 = var12[var7];
                      stackIn_13_0 = (faa) (var3);

                      stackIn_13_1 = -33;

                      if (null == var8) {
                        stackIn_14_0 = (faa) ((Object) stackIn_13_0);
                        stackIn_14_1 = stackIn_13_1;
                        stackIn_14_2 = 0;
                        break L4;
                      } else {
                        stackIn_14_0 = (faa) ((Object) stackIn_13_0);
                        stackIn_14_1 = stackIn_13_1;
                        stackIn_14_2 = 1;
                        break L4;
                      }
                    }
                    L5: {
                      if (vq.a(stackIn_14_0, stackIn_14_1, stackIn_14_2 != 0)) {
                        stb.a(2, 1, var11, var8);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    var7++;
                    continue L3;
                  }
                }
              } else {
                break L2;
              }
            }
            L6: {
              if (param1 <= -109) {
                break L6;
              } else {
                this.g((byte) 124);
                break L6;
              }
            }
            L7: {
              var14 = param0;
              var3 = var14;
              var13 = hob.a(this.field_x, 210377952);
              var4_array = var13;
              if (null != var4_array) {
                stackIn_25_0 = var13.length;
                break L7;
              } else {
                stackIn_25_0 = 0;
                break L7;
              }
            }
            L8: {
              var5 = stackIn_25_0;
              var14.a(-632, var5, 10);
              if (var5 == 0) {
                break L8;
              } else {
                var6_array = var13;
                var7 = 0;
                L9: while (true) {
                  if (var6_array.length <= var7) {
                    break L8;
                  } else {
                    L10: {
                      var8_ref = var6_array[var7];
                      var21 = var8_ref;
                      var21 = var8_ref;
                      stackIn_31_0 = (faa) (var3);

                      stackIn_31_1 = 39;

                      if (null == var8_ref) {
                        stackIn_32_0 = (faa) ((Object) stackIn_31_0);
                        stackIn_32_1 = stackIn_31_1;
                        stackIn_32_2 = 0;
                        break L10;
                      } else {
                        stackIn_32_0 = (faa) ((Object) stackIn_31_0);
                        stackIn_32_1 = stackIn_31_1;
                        stackIn_32_2 = 1;
                        break L10;
                      }
                    }
                    L11: {
                      if (vq.a(stackIn_32_0, stackIn_32_1, stackIn_32_2 != 0)) {
                        stb.a(2, 1, var3, var8_ref);
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    var7++;
                    continue L9;
                  }
                }
              }
            }
            L12: {
              var16 = param0;
              var3 = var16;
              var15 = this.field_m;
              var4_array2 = var15;
              if (var4_array2 == null) {
                stackIn_41_0 = 0;
                break L12;
              } else {
                stackIn_41_0 = var15.length;
                break L12;
              }
            }
            L13: {
              var5 = stackIn_41_0;
              var16.a(-632, var5, 10);
              if (-1 != (var5 ^ -1)) {
                var17 = var15;
                var7 = 0;
                L14: while (true) {
                  if (var17.length <= var7) {
                    break L13;
                  } else {
                    L15: {
                      var8_ref2 = var17[var7];
                      stackIn_49_0 = (faa) (var3);

                      stackIn_49_1 = 41;

                      if (null == var8_ref2) {
                        stackIn_50_0 = (faa) ((Object) stackIn_49_0);
                        stackIn_50_1 = stackIn_49_1;
                        stackIn_50_2 = 0;
                        break L15;
                      } else {
                        stackIn_50_0 = (faa) ((Object) stackIn_49_0);
                        stackIn_50_1 = stackIn_49_1;
                        stackIn_50_2 = 1;
                        break L15;
                      }
                    }
                    if (vq.a(stackIn_50_0, stackIn_50_1, stackIn_50_2 != 0)) {
                      stb.a(2, 1, var16, var8_ref2);
                      var7++;
                      continue L14;
                    } else {
                      var7++;
                      continue L14;
                    }
                  }
                }
              } else {
                break L13;
              }
            }
            L16: {
              stackIn_56_0 = (faa) (param0);

              stackIn_56_1 = 77;

              if (null == this.field_e) {
                stackIn_57_0 = (faa) ((Object) stackIn_56_0);
                stackIn_57_1 = stackIn_56_1;
                stackIn_57_2 = 0;
                break L16;
              } else {
                stackIn_57_0 = (faa) ((Object) stackIn_56_0);
                stackIn_57_1 = stackIn_56_1;
                stackIn_57_2 = 1;
                break L16;
              }
            }
            L17: {
              if (vq.a(stackIn_57_0, stackIn_57_1, stackIn_57_2 != 0)) {
                this.field_e.b(param0, -126);
                break L17;
              } else {
                break L17;
              }
            }
            L18: {
              var19 = param0;
              var3 = var19;
              var18 = hob.a(this.field_n, 210377952);
              var4_array = var18;
              if (null == var4_array) {
                stackIn_65_0 = 0;
                break L18;
              } else {
                stackIn_65_0 = var18.length;
                break L18;
              }
            }
            L19: {
              var5 = stackIn_65_0;
              var19.a(-632, var5, 6);
              if (var5 == 0) {
                break L19;
              } else {
                var20 = var18;
                var7 = 0;
                L20: while (true) {
                  if (var7 >= var20.length) {
                    break L19;
                  } else {
                    L21: {
                      var21 = var20[var7];
                      stackIn_71_0 = (faa) (var3);

                      stackIn_71_1 = 118;

                      if (var21 == null) {
                        stackIn_72_0 = (faa) ((Object) stackIn_71_0);
                        stackIn_72_1 = stackIn_71_1;
                        stackIn_72_2 = 0;
                        break L21;
                      } else {
                        stackIn_72_0 = (faa) ((Object) stackIn_71_0);
                        stackIn_72_1 = stackIn_71_1;
                        stackIn_72_2 = 1;
                        break L21;
                      }
                    }
                    L22: {
                      if (vq.a(stackIn_72_0, stackIn_72_1, stackIn_72_2 != 0)) {
                        stb.a(2, 1, var19, var21);
                        break L22;
                      } else {
                        break L22;
                      }
                    }
                    var7++;
                    continue L20;
                  }
                }
              }
            }
            L23: {
              var23 = param0;
              var3 = var23;
              var22 = this.field_g;
              var4_array3 = var22;
              if (null == var4_array3) {
                stackIn_81_0 = 0;
                break L23;
              } else {
                stackIn_81_0 = var22.length;
                break L23;
              }
            }
            L24: {
              var5 = stackIn_81_0;
              var23.a(-632, var5, 8);
              if (0 != var5) {
                var24 = var22;
                var7 = 0;
                L25: while (true) {
                  if (var7 >= var24.length) {
                    break L24;
                  } else {
                    L26: {
                      var8_ref3 = var24[var7];
                      stackIn_89_0 = (faa) (var3);

                      stackIn_89_1 = 88;

                      if (var8_ref3 == null) {
                        stackIn_90_0 = (faa) ((Object) stackIn_89_0);
                        stackIn_90_1 = stackIn_89_1;
                        stackIn_90_2 = 0;
                        break L26;
                      } else {
                        stackIn_90_0 = (faa) ((Object) stackIn_89_0);
                        stackIn_90_1 = stackIn_89_1;
                        stackIn_90_2 = 1;
                        break L26;
                      }
                    }
                    if (vq.a(stackIn_90_0, stackIn_90_1, stackIn_90_2 != 0)) {
                      stb.a(2, 1, var23, var8_ref3);
                      var7++;
                      continue L25;
                    } else {
                      var7++;
                      continue L25;
                    }
                  }
                }
              } else {
                break L24;
              }
            }
            L27: {
              stackIn_96_0 = 4;

              if (this.field_l != null) {
                stackIn_97_0 = stackIn_96_0;
                stackIn_97_1 = this.field_l.length;
                break L27;
              } else {
                stackIn_97_0 = stackIn_96_0;
                stackIn_97_1 = 0;
                break L27;
              }
            }
            L28: {
              pgb.a(stackIn_97_0, stackIn_97_1, 68, param0, this.field_l);
              vq.a(param0, -88, this.field_v);
              param0.a(-632, this.field_y, 32);
              vq.a(param0, 88, this.field_i);
              stackIn_100_0 = (faa) (param0);

              stackIn_100_1 = -71;

              if (this.field_f == null) {
                stackIn_101_0 = (faa) ((Object) stackIn_100_0);
                stackIn_101_1 = stackIn_100_1;
                stackIn_101_2 = 0;
                break L28;
              } else {
                stackIn_101_0 = (faa) ((Object) stackIn_100_0);
                stackIn_101_1 = stackIn_100_1;
                stackIn_101_2 = 1;
                break L28;
              }
            }
            L29: {
              if (!vq.a(stackIn_101_0, stackIn_101_1, stackIn_101_2 != 0)) {
                break L29;
              } else {
                this.field_f.b(param0, -117);
                break L29;
              }
            }
            L30: {
              var26 = param0;
              var3 = var26;
              var25 = this.field_t;
              var4_array4 = var25;
              if (null == var4_array4) {
                stackIn_107_0 = 0;
                break L30;
              } else {
                stackIn_107_0 = var25.length;
                break L30;
              }
            }
            L31: {
              var5 = stackIn_107_0;
              var26.a(-632, var5, 8);
              if (-1 != (var5 ^ -1)) {
                var27 = var25;
                var7 = 0;
                L32: while (true) {
                  if (var27.length <= var7) {
                    break L31;
                  } else {
                    L33: {
                      var8_ref4 = var27[var7];
                      stackIn_115_0 = (faa) (var3);

                      stackIn_115_1 = 36;

                      if (null == var8_ref4) {
                        stackIn_116_0 = (faa) ((Object) stackIn_115_0);
                        stackIn_116_1 = stackIn_115_1;
                        stackIn_116_2 = 0;
                        break L33;
                      } else {
                        stackIn_116_0 = (faa) ((Object) stackIn_115_0);
                        stackIn_116_1 = stackIn_115_1;
                        stackIn_116_2 = 1;
                        break L33;
                      }
                    }
                    L34: {
                      if (vq.a(stackIn_116_0, stackIn_116_1, stackIn_116_2 != 0)) {
                        stb.a(2, 1, var26, var8_ref4);
                        break L34;
                      } else {
                        break L34;
                      }
                    }
                    var7++;
                    continue L32;
                  }
                }
              } else {
                break L31;
              }
            }
            L35: {
              var29 = param0;
              var3 = var29;
              var28 = this.field_a;
              var4_array5 = var28;
              if (null != var4_array5) {
                stackIn_125_0 = var28.length;
                break L35;
              } else {
                stackIn_125_0 = 0;
                break L35;
              }
            }
            L36: {
              var5 = stackIn_125_0;
              var29.a(-632, var5, 4);
              if (var5 != 0) {
                var30 = var28;
                var7 = 0;
                L37: while (true) {
                  if (var30.length <= var7) {
                    break L36;
                  } else {
                    L38: {
                      var8_ref5 = var30[var7];
                      stackIn_133_0 = (faa) (var3);

                      stackIn_133_1 = -87;

                      if (var8_ref5 == null) {
                        stackIn_134_0 = (faa) ((Object) stackIn_133_0);
                        stackIn_134_1 = stackIn_133_1;
                        stackIn_134_2 = 0;
                        break L38;
                      } else {
                        stackIn_134_0 = (faa) ((Object) stackIn_133_0);
                        stackIn_134_1 = stackIn_133_1;
                        stackIn_134_2 = 1;
                        break L38;
                      }
                    }
                    L39: {
                      if (vq.a(stackIn_134_0, stackIn_134_1, stackIn_134_2 != 0)) {
                        stb.a(2, 1, var29, var8_ref5);
                        break L39;
                      } else {
                        break L39;
                      }
                    }
                    var7++;
                    continue L37;
                  }
                }
              } else {
                break L36;
              }
            }
            L40: {
              param0.a(-632, this.field_o, 28);
              param0.a(-632, this.field_r, 28);
              var32 = param0;
              var3 = var32;
              var31 = this.field_j;
              var4_array6 = var31;
              if (var4_array6 != null) {
                stackIn_143_0 = var31.length;
                break L40;
              } else {
                stackIn_143_0 = 0;
                break L40;
              }
            }
            L41: {
              var5 = stackIn_143_0;
              var32.a(-632, var5, 4);
              if (0 != var5) {
                var33 = var31;
                var7 = 0;
                L42: while (true) {
                  if (var33.length <= var7) {
                    break L41;
                  } else {
                    L43: {
                      var8_ref6 = var33[var7];
                      stackIn_151_0 = (faa) (var3);

                      stackIn_151_1 = 56;

                      if (var8_ref6 == null) {
                        stackIn_152_0 = (faa) ((Object) stackIn_151_0);
                        stackIn_152_1 = stackIn_151_1;
                        stackIn_152_2 = 0;
                        break L43;
                      } else {
                        stackIn_152_0 = (faa) ((Object) stackIn_151_0);
                        stackIn_152_1 = stackIn_151_1;
                        stackIn_152_2 = 1;
                        break L43;
                      }
                    }
                    L44: {
                      if (vq.a(stackIn_152_0, stackIn_152_1, stackIn_152_2 != 0)) {
                        stb.a(2, 1, var32, var8_ref6);
                        break L44;
                      } else {
                        break L44;
                      }
                    }
                    var7++;
                    continue L42;
                  }
                }
              } else {
                break L41;
              }
            }
            L45: {
              stackIn_160_0 = (faa) (param0);

              stackIn_160_1 = 46;

              if (null == this.field_b) {
                stackIn_161_0 = (faa) ((Object) stackIn_160_0);
                stackIn_161_1 = stackIn_160_1;
                stackIn_161_2 = 0;
                break L45;
              } else {
                stackIn_161_0 = (faa) ((Object) stackIn_160_0);
                stackIn_161_1 = stackIn_160_1;
                stackIn_161_2 = 1;
                break L45;
              }
            }
            L46: {
              if (!vq.a(stackIn_161_0, stackIn_161_1, stackIn_161_2 != 0)) {
                break L46;
              } else {
                this.field_b.b(param0, -113);
                break L46;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L47: {
            var3_ref = decompiledCaughtException;
            stackIn_168_0 = (RuntimeException) (var3_ref);

            stackIn_168_1 = new StringBuilder().append("pe.B(");

            if (param0 == null) {
              stackIn_169_0 = (RuntimeException) ((Object) stackIn_168_0);
              stackIn_169_1 = (StringBuilder) ((Object) stackIn_168_1);
              stackIn_169_2 = "null";
              break L47;
            } else {
              stackIn_169_0 = (RuntimeException) ((Object) stackIn_168_0);
              stackIn_169_1 = (StringBuilder) ((Object) stackIn_168_1);
              stackIn_169_2 = "{...}";
              break L47;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_169_0), stackIn_169_2 + ',' + param1 + ')');
        }
    }

    private final void f(byte param0, int param1) {
        int var3 = -84 % ((param0 - 66) / 54);
        this.a(0, true, param1);
    }

    final void g(int param0) {
        int var2;
        int var3;
        var3 = VoidHunters.field_G;
        var2 = 0;
        L0: while (true) {
          if (var2 >= this.field_k.length) {
            this.l(-125);
            var2 = 0;
            L1: while (true) {
              if (this.field_m.length <= var2) {
                this.field_e.a(121);
                this.field_x.e(127);
                var2 = 0;
                L2: while (true) {
                  if (this.field_s.length <= var2) {
                    this.field_n.e(125);
                    if (param0 == 11184895) {
                      var2 = 0;
                      L3: while (true) {
                        if (this.field_g.length <= var2) {
                          var2 = 0;
                          L4: while (true) {
                            if (this.field_l.length <= var2) {
                              this.field_f = null;
                              this.field_t = null;
                              this.field_a = null;
                              this.field_p = new lua();
                              this.field_v = false;
                              this.field_u = new fba();
                              this.field_j = null;
                              return;
                            } else {
                              this.field_l[var2] = 0;
                              var2++;
                              continue L4;
                            }
                          }
                        } else {
                          this.field_g[var2] = null;
                          var2++;
                          continue L3;
                        }
                      }
                    } else {
                      return;
                    }
                  } else {
                    this.field_s[var2].a((byte) 121);
                    var2++;
                    continue L2;
                  }
                }
              } else {
                this.field_m[var2] = null;
                var2++;
                continue L1;
              }
            }
          } else {
            this.field_k[var2] = null;
            var2++;
            continue L0;
          }
        }
    }

    private final boolean a(ij param0, anb[] param1, anb[] param2, int param3, int param4, int param5, int param6) {
        int stackIn_3_0 = 0;
        int stackIn_30_0 = 0;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        anb[] var9 = null;
        int var10 = 0;
        anb var11 = null;
        anb[] var12 = null;
        int var13 = 0;
        anb var14 = null;
        int var15 = 0;
        int var16 = 0;
        var16 = VoidHunters.field_G;
        try {
          L0: {
            if (param3 == 20521) {
              var8_int = 0;
              var9 = param2;
              var10 = 0;
              L1: while (true) {
                if (var9.length <= var10) {
                  stackIn_30_0 = var8_int;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var11 = var9[var10];
                  if (null != var11) {
                    if (null != var11.field_k) {
                      if (!var11.field_k.k((byte) 56)) {
                        var12 = param1;
                        var13 = 0;
                        L2: while (true) {
                          if (var13 < var12.length) {
                            var14 = var12[var13];
                            if (var14 != null) {
                              if (null != var14.field_k) {
                                if (!var14.field_k.k((byte) 76)) {
                                  var15 = this.a(false, param5, param6, (byte) 92, false, var14, param4, var11, param0) ? 1 : 0;
                                  var8_int = var8_int | var15;
                                  if (null != var11.field_k) {
                                    if (!var11.field_k.k((byte) 82)) {
                                      var13++;
                                      continue L2;
                                    } else {
                                      var10++;
                                      continue L1;
                                    }
                                  } else {
                                    var10++;
                                    continue L1;
                                  }
                                } else {
                                  var13++;
                                  continue L2;
                                }
                              } else {
                                var13++;
                                continue L2;
                              }
                            } else {
                              var13++;
                              continue L2;
                            }
                          } else {
                            var10++;
                            continue L1;
                          }
                        }
                      } else {
                        var10++;
                        continue L1;
                      }
                    } else {
                      var10++;
                      continue L1;
                    }
                  } else {
                    var10++;
                    continue L1;
                  }
                }
              }
            } else {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackIn_34_0 = (RuntimeException) (var8);

            stackIn_34_1 = new StringBuilder().append("pe.WA(");

            if (param0 == null) {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "null";
              break L3;
            } else {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "{...}";
              break L3;
            }
          }
          L4: {
            stackIn_38_0 = (RuntimeException) ((Object) stackIn_35_0);

            stackIn_38_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_35_2).append(',');

            if (param1 == null) {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "null";
              break L4;
            } else {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "{...}";
              break L4;
            }
          }
          L5: {
            stackIn_42_0 = (RuntimeException) ((Object) stackIn_39_0);

            stackIn_42_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_39_2).append(',');

            if (param2 == null) {
              stackIn_43_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "null";
              break L5;
            } else {
              stackIn_43_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "{...}";
              break L5;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_43_0), stackIn_43_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          return stackIn_30_0 != 0;
        }
    }

    final int e(int param0, byte param1) {
        int var3;
        int var4;
        int var5;
        L0: {
          var5 = VoidHunters.field_G;
          var3 = 0;
          if (param1 == -99) {
            break L0;
          } else {
            this.field_l = (int[]) null;
            break L0;
          }
        }
        var4 = 0;
        L1: while (true) {
          if (var4 >= this.field_k.length) {
            return var3;
          } else {
            if (null != this.field_k[var4]) {
              if (this.field_k[var4].k((byte) -108) != null) {
                if (this.field_k[var4].k((byte) -108).a((byte) 92) != param0) {
                  var4++;
                  continue L1;
                } else {
                  var3++;
                  var4++;
                  continue L1;
                }
              } else {
                var4++;
                continue L1;
              }
            } else {
              var4++;
              continue L1;
            }
          }
        }
    }

    final sg[] d(int param0) {
        if (param0 != 1000) {
            this.b((byte) -38);
        }
        return this.field_k;
    }

    final void a(int param0, byte param1) {
        this.field_o = param0;
        int var3 = 37 / ((param1 - -18) / 46);
    }

    final rba[] i(int param0) {
        if (param0 != 1) {
            this.field_a = (rba[]) null;
        }
        return this.field_a;
    }

    final nbb b(int param0, int param1, int param2, int param3, int param4, int param5) {
        Object var7;
        int var8;
        nbb[] var9;
        int var10;
        nbb var11;
        int var19;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        var19 = VoidHunters.field_G;
        var7 = null;
        var8 = param1;
        var9 = this.field_m;
        var10 = 0;
        L0: while (true) {
          if (var9.length <= var10) {
            L1: {
              if (param0 == 1) {
                break L1;
              } else {
                this.field_l = (int[]) null;
                break L1;
              }
            }
            return (nbb) (var7);
          } else {
            var11 = var9[var10];
            if (var11 != null) {
              var12 = var11.f((byte) -41)[0] + var11.f((byte) -120)[1] >> -1853446431;
              var13 = var11.f((byte) -37)[2] - -var11.f((byte) -64)[3] >> -206913407;
              var14 = var12 - param3;
              var15 = -param4 + var13;
              var16 = ar.a(var14, (byte) 127, var15);
              if (var16 < var8) {
                var17 = var12 - param2;
                var18 = -param5 + var13;
                if (ar.a(var17, (byte) 113, var18) < gs.field_c) {
                  if (!this.a(false, false, var11.field_l)) {
                    var7 = var11;
                    var8 = var16;
                    var10++;
                    continue L0;
                  } else {
                    var10++;
                    continue L0;
                  }
                } else {
                  var10++;
                  continue L0;
                }
              } else {
                var10++;
                continue L0;
              }
            } else {
              var10++;
              continue L0;
            }
          }
        }
    }

    final void a(lta param0, byte param1, int param2, sg param3) {
        RuntimeException stackIn_87_0 = null;
        StringBuilder stackIn_87_1 = null;
        RuntimeException stackIn_88_0 = null;
        StringBuilder stackIn_88_1 = null;
        String stackIn_88_2 = null;
        RuntimeException stackIn_91_0 = null;
        StringBuilder stackIn_91_1 = null;
        RuntimeException stackIn_92_0 = null;
        StringBuilder stackIn_92_1 = null;
        String stackIn_92_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        crb[] var5 = null;
        RuntimeException var5_ref = null;
        int var6_int = 0;
        qob[] var6 = null;
        int var7 = 0;
        mqb var7_ref_mqb = null;
        crb var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        rdb var13 = null;
        tj var14 = null;
        sg[] var15 = null;
        sg var16 = null;
        it[] var17 = null;
        it var18 = null;
        mqb[] var19 = null;
        nbb[] var20 = null;
        nbb var21 = null;
        crb[] var22 = null;
        qob[] var23 = null;
        var10 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (this.field_v) {
                var13 = (rdb) ((Object) this.field_n.d(0));
                L2: while (true) {
                  if (null == var13) {
                    if (this.field_t == null) {
                      break L1;
                    } else {
                      var5_int = 0;
                      L3: while (true) {
                        if (var5_int >= this.field_t.length) {
                          break L1;
                        } else {
                          this.field_t[var5_int].a(32, 13421772, param0);
                          var5_int++;
                          continue L3;
                        }
                      }
                    }
                  } else {
                    var13.a(param0, false);
                    var13 = (rdb) ((Object) this.field_n.a((byte) 85));
                    continue L2;
                  }
                }
              } else {
                break L1;
              }
            }
            L4: {
              if (null != this.field_a) {
                var11 = 0;
                var5_int = var11;
                L5: while (true) {
                  if (this.field_a.length <= var11) {
                    break L4;
                  } else {
                    this.field_a[var11].b(param0, 115);
                    var11++;
                    continue L5;
                  }
                }
              } else {
                break L4;
              }
            }
            var15 = this.field_k;
            var6_int = 0;
            L6: while (true) {
              if (var6_int >= var15.length) {
                L7: {
                  if (null != this.field_j) {
                    var17 = this.field_j;
                    var6_int = 0;
                    L8: while (true) {
                      if (var17.length <= var6_int) {
                        break L7;
                      } else {
                        var18 = var17[var6_int];
                        var18.a(param0, (byte) -111);
                        var6_int++;
                        continue L8;
                      }
                    }
                  } else {
                    break L7;
                  }
                }
                var19 = this.field_g;
                var6_int = 0;
                L9: while (true) {
                  if (var6_int >= var19.length) {
                    L10: {
                      if (param1 > 83) {
                        break L10;
                      } else {
                        this.a(33, (cq) null);
                        break L10;
                      }
                    }
                    var20 = this.field_m;
                    var6_int = 0;
                    L11: while (true) {
                      if (var6_int >= var20.length) {
                        var5 = this.field_e.c(0);
                        var22 = var5;
                        var7 = 0;
                        L12: while (true) {
                          if (var22.length <= var7) {
                            var6_int = 0;
                            L13: while (true) {
                              if (this.field_s.length <= var6_int) {
                                this.a(-98, param0, param2);
                                var14 = (tj) ((Object) this.field_x.d(0));
                                L14: while (true) {
                                  if (null == var14) {
                                    L15: {
                                      var23 = this.field_p.a(false);
                                      var6 = var23;
                                      if (null != var6) {
                                        var12 = 0;
                                        var7 = var12;
                                        L16: while (true) {
                                          if (var23.length <= var12) {
                                            break L15;
                                          } else {
                                            var23[var12].a(param3, 93, param2, param0, var12);
                                            var12++;
                                            continue L16;
                                          }
                                        }
                                      } else {
                                        break L15;
                                      }
                                    }
                                    break L0;
                                  } else {
                                    var14.a(0, param0);
                                    var14 = (tj) ((Object) this.field_x.a((byte) 84));
                                    continue L14;
                                  }
                                }
                              } else {
                                L17: {
                                  if (this.field_s[var6_int].b((byte) -125)) {
                                    this.field_s[var6_int].a((byte) 114, param0);
                                    break L17;
                                  } else {
                                    break L17;
                                  }
                                }
                                var6_int++;
                                continue L13;
                              }
                            }
                          } else {
                            L18: {
                              var8 = var22[var7];
                              if (null != var8) {
                                var8.a(param0, 14540253, (pe) (this), 16);
                                this.a((byte) 80, var8, param0);
                                break L18;
                              } else {
                                break L18;
                              }
                            }
                            var7++;
                            continue L12;
                          }
                        }
                      } else {
                        L19: {
                          var21 = var20[var6_int];
                          if (var21 != null) {
                            L20: {
                              L21: {
                                if (ktb.field_q == 0) {
                                  break L21;
                                } else {
                                  if (!this.a(true, false, var21.field_l)) {
                                    break L21;
                                  } else {
                                    break L20;
                                  }
                                }
                              }
                              var21.a(param0, aob.a(29554, var21.field_k.field_j), (pe) (this), 16);
                              break L20;
                            }
                            this.a((byte) -76, var21, param0);
                            break L19;
                          } else {
                            break L19;
                          }
                        }
                        var6_int++;
                        continue L11;
                      }
                    }
                  } else {
                    var7_ref_mqb = var19[var6_int];
                    if (var7_ref_mqb != null) {
                      var7_ref_mqb.a(param0, 11184810, (pe) (this), 16);
                      this.a((byte) 76, var7_ref_mqb, param0);
                      var6_int++;
                      continue L9;
                    } else {
                      var6_int++;
                      continue L9;
                    }
                  }
                }
              } else {
                L22: {
                  var16 = var15[var6_int];
                  if (var16 != null) {
                    L23: {
                      var8_int = var16.o((byte) -117);
                      if (0 == (var8_int ^ -1)) {
                        break L23;
                      } else {
                        if (null != var16.k((byte) -108)) {
                          break L23;
                        } else {
                          var6_int++;
                          continue L6;
                        }
                      }
                    }
                    if (!var16.b(2, (byte) -103)) {
                      var9 = qpb.a(false, var16.q((byte) 92), 13894143);
                      var16.field_k.a(0, var9, (pe) (this), param0);
                      this.a(var16, param0, 97);
                      break L22;
                    } else {
                      break L22;
                    }
                  } else {
                    break L22;
                  }
                }
                var6_int++;
                continue L6;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L24: {
            var5_ref = decompiledCaughtException;
            stackIn_87_0 = (RuntimeException) (var5_ref);

            stackIn_87_1 = new StringBuilder().append("pe.DC(");

            if (param0 == null) {
              stackIn_88_0 = (RuntimeException) ((Object) stackIn_87_0);
              stackIn_88_1 = (StringBuilder) ((Object) stackIn_87_1);
              stackIn_88_2 = "null";
              break L24;
            } else {
              stackIn_88_0 = (RuntimeException) ((Object) stackIn_87_0);
              stackIn_88_1 = (StringBuilder) ((Object) stackIn_87_1);
              stackIn_88_2 = "{...}";
              break L24;
            }
          }
          L25: {
            stackIn_91_0 = (RuntimeException) ((Object) stackIn_88_0);

            stackIn_91_1 = ((StringBuilder) (Object) stackIn_88_1).append(stackIn_88_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_92_0 = (RuntimeException) ((Object) stackIn_91_0);
              stackIn_92_1 = (StringBuilder) ((Object) stackIn_91_1);
              stackIn_92_2 = "null";
              break L25;
            } else {
              stackIn_92_0 = (RuntimeException) ((Object) stackIn_88_0);
              stackIn_92_1 = (StringBuilder) ((Object) stackIn_91_1);
              stackIn_92_2 = "{...}";
              break L25;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_92_0), stackIn_92_2 + ')');
        }
    }

    final boolean e(byte param0) {
        if (param0 >= -44) {
            this.field_o = -69;
        }
        return this.field_i;
    }

    private final void a(ij param0, int param1, crb[] param2) {
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        sg var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        crb var10 = null;
        int var12 = 0;
        sg[] var13 = null;
        var12 = VoidHunters.field_G;
        try {
          L0: {
            var13 = this.field_k;
            var5 = 0;
            L1: while (true) {
              if (var5 >= var13.length) {
                L2: {
                  if (param1 == -1) {
                    break L2;
                  } else {
                    this.a((byte) -56, (tj) null, true);
                    break L2;
                  }
                }
                break L0;
              } else {
                var6 = var13[var5];
                if (var6 != null) {
                  if (null != var6.field_k) {
                    if (!var6.field_k.k((byte) 73)) {
                      L3: {
                        var7 = gkb.field_o;
                        if (var6.field_k.field_j != 0) {
                          break L3;
                        } else {
                          var7 = var7 / 4;
                          break L3;
                        }
                      }
                      var8 = this.field_u.a(-1, var6.field_q, 3, 127);
                      var9 = 0;
                      L4: while (true) {
                        if (var9 < var8) {
                          var10 = param2[-field_c[2] + ada.field_a[var9]];
                          if (var10 != null) {
                            if (var10.field_k != null) {
                              L5: {
                                if (!var10.field_k.k((byte) 42)) {
                                  L6: {
                                    if (this.a(true, 2, var7, (byte) 77, true, var10, 0, var6, param0)) {
                                      this.field_e.b(-64);
                                      break L6;
                                    } else {
                                      break L6;
                                    }
                                  }
                                  if (null != var6.field_k) {
                                    if (!var6.field_k.k((byte) 82)) {
                                      break L5;
                                    } else {
                                      var5++;
                                      continue L1;
                                    }
                                  } else {
                                    var5++;
                                    continue L1;
                                  }
                                } else {
                                  break L5;
                                }
                              }
                              var9++;
                              continue L4;
                            } else {
                              var9++;
                              continue L4;
                            }
                          } else {
                            var9++;
                            continue L4;
                          }
                        } else {
                          var5++;
                          continue L1;
                        }
                      }
                    } else {
                      var5++;
                      continue L1;
                    }
                  } else {
                    var5++;
                    continue L1;
                  }
                } else {
                  var5++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackIn_39_0 = (RuntimeException) (var4);

            stackIn_39_1 = new StringBuilder().append("pe.EA(");

            if (param0 == null) {
              stackIn_40_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "null";
              break L7;
            } else {
              stackIn_40_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "{...}";
              break L7;
            }
          }
          L8: {
            stackIn_43_0 = (RuntimeException) ((Object) stackIn_40_0);

            stackIn_43_1 = ((StringBuilder) (Object) stackIn_40_1).append(stackIn_40_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_44_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackIn_44_2 = "null";
              break L8;
            } else {
              stackIn_44_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackIn_44_2 = "{...}";
              break L8;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_44_0), stackIn_44_2 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        L0: {
          this.a(param5, 0, param6, param0, 30273, param2, param3, param1, 0);
          if (param4 == 11184895) {
            break L0;
          } else {
            field_d = (String) null;
            break L0;
          }
        }
    }

    private final nbb a(nbb param0, byte param1, sg param2, int param3, vra param4, int param5) {
        nbb stackIn_7_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        try {
          L0: {
            L1: {
              if (param1 == 127) {
                break L1;
              } else {
                this.field_r = 62;
                break L1;
              }
            }
            L2: {
              if (null != param0) {
                break L2;
              } else {
                if ((128 & param4.field_e) == 0) {
                  break L2;
                } else {
                  param2.a(123, param4.field_a, param4.field_c);
                  var7_int = param2.d(false) + -param2.j(param1 + 995401033);
                  var8 = param2.g((byte) 118) + -param2.i((byte) 5);
                  param2.field_k.a(true, var7_int, var8, param2.e(param1 ^ 127), 0, param2.f((byte) -106));
                  param0 = param2.field_k.a((pe) (this), param5, param3, param2, (byte) 85);
                  if (param0 == null) {
                    break L2;
                  } else {
                    param2.a(param0.field_l, (byte) -63);
                    param2.field_k.a((byte) -123, (anb) (param2));
                    break L2;
                  }
                }
              }
            }
            stackIn_7_0 = (nbb) (param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var7 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var7);

            stackIn_11_1 = new StringBuilder().append("pe.ED(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          L4: {
            stackIn_15_0 = (RuntimeException) ((Object) stackIn_12_0);

            stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          L5: {
            stackIn_19_0 = (RuntimeException) ((Object) stackIn_16_0);

            stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L5;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L5;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param5 + ')');
        }
        return stackIn_7_0;
    }

    private final boolean a(tj param0, anb param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param2 < -43) {
              var4_int = Math.abs(param0.field_f);
              var5 = Math.abs(param0.field_h);
              stackIn_4_0 = em.a(5220, param1.field_q[1] - -var4_int, param0.e((byte) -107), param1.field_q[3] - -var5, param0.d(101), -var4_int + param1.field_q[0], param1.field_q[2] - var5);
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
            var4 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var4);

            stackIn_8_1 = new StringBuilder().append("pe.QE(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L1;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L1;
            }
          }
          L2: {
            stackIn_12_0 = (RuntimeException) ((Object) stackIn_9_0);

            stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0;
        }
    }

    final void b(byte param0) {
        lua var2 = null;
        if (!this.field_q) {
            if (this.field_p == null) {
                return;
            }
            int var3 = -85 % ((param0 - 6) / 47);
            var2 = this.field_p;
            this.field_p = new lua();
            var2.b((byte) 81, this.field_p);
            this.field_q = true;
            return;
        }
    }

    public final void a(faa param0, boolean param1) {
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        tj[] var3 = null;
        RuntimeException var3_ref = null;
        int var4_int = 0;
        rdb[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        tj[] var7 = null;
        var6 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              this.field_k = (sg[]) ((Object) kcb.a(8, qdb.field_a, param0, 1, -109, this.field_k));
              this.field_x = new ij();
              var7 = (tj[]) ((Object) kcb.a(10, aba.field_b, param0, 1, -127, (tv[]) null));
              var3 = var7;
              if (null == var3) {
                break L1;
              } else {
                var4_int = 0;
                L2: while (true) {
                  if (var4_int >= var7.length) {
                    break L1;
                  } else {
                    this.field_x.b(-10258, var7[var4_int]);
                    var4_int++;
                    continue L2;
                  }
                }
              }
            }
            L3: {
              this.field_m = (nbb[]) ((Object) kcb.a(10, vcb.field_z, param0, 1, -68, this.field_m));
              if (!kv.a(param1, param0)) {
                this.field_e = null;
                break L3;
              } else {
                L4: {
                  if (null != this.field_e) {
                    break L4;
                  } else {
                    this.field_e = new aib();
                    break L4;
                  }
                }
                this.field_e.a(param0, false);
                break L3;
              }
            }
            L5: {
              this.field_n = new ij();
              var4 = (rdb[]) ((Object) kcb.a(6, ioa.field_q, param0, 1, -86, (tv[]) null));
              if (null == var4) {
                break L5;
              } else {
                var5 = 0;
                L6: while (true) {
                  if (var5 >= var4.length) {
                    break L5;
                  } else {
                    this.field_n.b(-10258, var4[var5]);
                    var5++;
                    continue L6;
                  }
                }
              }
            }
            L7: {
              this.field_g = (mqb[]) ((Object) kcb.a(8, dab.field_c, param0, 1, -47, this.field_g));
              this.field_l = wkb.a((byte) 37, this.field_l, param0, 4);
              this.field_v = kv.a(false, param0);
              this.field_y = param0.i(0, 32);
              this.field_i = kv.a(false, param0);
              if (!kv.a(false, param0)) {
                this.field_f = null;
                break L7;
              } else {
                L8: {
                  if (this.field_f != null) {
                    break L8;
                  } else {
                    this.field_f = new una();
                    break L8;
                  }
                }
                this.field_f.a(param0, false);
                break L7;
              }
            }
            L9: {
              this.field_t = (cq[]) ((Object) kcb.a(8, wsb.field_e, param0, 1, -98, this.field_t));
              this.field_a = (rba[]) ((Object) kcb.a(4, ema.field_p, param0, 1, -71, this.field_a));
              this.field_o = param0.i(0, 28);
              this.field_r = param0.i(0, 28);
              this.field_j = (it[]) ((Object) kcb.a(4, pgb.field_g, param0, 1, -83, this.field_j));
              if (!kv.a(false, param0)) {
                this.field_b = null;
                break L9;
              } else {
                this.field_b = new bea();
                this.field_b.a(param0, false);
                break L9;
              }
            }
            this.a((byte) 112);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var3_ref = decompiledCaughtException;
            stackIn_30_0 = (RuntimeException) (var3_ref);

            stackIn_30_1 = new StringBuilder().append("pe.H(");

            if (param0 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L10;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L10;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ',' + param1 + ')');
        }
    }

    private final void a(crb[] param0, int param1) {
        int stackIn_84_0 = 0;
        RuntimeException stackIn_100_0 = null;
        StringBuilder stackIn_100_1 = null;
        RuntimeException stackIn_101_0 = null;
        StringBuilder stackIn_101_1 = null;
        String stackIn_101_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var3 = null;
        tj var3_ref = null;
        RuntimeException var3_ref2 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        mqb[] var13_ref_mqb__ = null;
        sg var14 = null;
        nbb var14_ref = null;
        int var14_int = 0;
        crb var14_ref2 = null;
        mqb var15 = null;
        int var17 = 0;
        Object var19 = null;
        nbb var19_ref = null;
        sg var20 = null;
        nbb var21 = null;
        crb var22 = null;
        Object var23 = null;
        sg var23_ref = null;
        nbb var24 = null;
        var3 = null;
        var19 = null;
        var23 = null;
        var17 = VoidHunters.field_G;
        try {
          L0: {
            var3_ref = (tj) ((Object) this.field_x.d(0));
            L1: while (true) {
              if (null == var3_ref) {
                var4 = -67 % ((-34 - param1) / 52);
                break L0;
              } else {
                L2: {
                  wgb.field_i = null;
                  wna.field_c.a(2147483647);
                  gab.field_b.b((byte) -70);
                  var4 = var3_ref.field_d;
                  var5 = var4 + -var3_ref.field_f;
                  var6 = var5;
                  var7 = var4;
                  if (var6 > var7) {
                    var7 = var6;
                    var6 = var4;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  var8 = var3_ref.field_e;
                  var9 = var8 + -var3_ref.field_h;
                  var10 = var9;
                  var11 = var8;
                  if (var10 > var11) {
                    var11 = var10;
                    var10 = var8;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                fmb.a(45, var10, var6, var11, var7);
                var12 = this.field_u.a(-128, 1);
                var13 = 0;
                L4: while (true) {
                  L5: {
                    if (var13 >= var12) {
                      break L5;
                    } else {
                      var20 = this.field_k[ada.field_a[var13] - field_c[0]];
                      var14 = var20;
                      if (null != var14) {
                        L6: {
                          if (6 != var3_ref.g((byte) -104)) {
                            break L6;
                          } else {
                            if (-1 != (as.field_d ^ -1)) {
                              break L6;
                            } else {
                              if (var20.q((byte) 99) != var3_ref.e(512)) {
                                break L6;
                              } else {
                                if (var20.q((byte) 84) == sja.field_c) {
                                  if (var20.o((byte) -117) != var3_ref.b(false)) {
                                    if (var20.k((byte) -108) == null) {
                                      break L6;
                                    } else {
                                      if (var20.k((byte) -108).a((byte) 28) != var3_ref.b(false)) {
                                        break L6;
                                      } else {
                                        var13++;
                                        continue L4;
                                      }
                                    }
                                  } else {
                                    var13++;
                                    continue L4;
                                  }
                                } else {
                                  var13++;
                                  continue L4;
                                }
                              }
                            }
                          }
                        }
                        if (this.a(var3_ref, var20, -46)) {
                          if (this.a(var20, 46, var3_ref)) {
                            break L5;
                          } else {
                            var13++;
                            continue L4;
                          }
                        } else {
                          var13++;
                          continue L4;
                        }
                      } else {
                        var13++;
                        continue L4;
                      }
                    }
                  }
                  L7: {
                    if (1 != voa.field_d) {
                      break L7;
                    } else {
                      if (gab.field_b.a((byte) 111)) {
                        break L7;
                      } else {
                        var12 = this.field_u.a(-122, 2);
                        var13 = 0;
                        L8: while (true) {
                          if (var13 >= var12) {
                            break L7;
                          } else {
                            var21 = this.field_m[ada.field_a[var13] + -field_c[1]];
                            var14_ref = var21;
                            if (null != var14_ref) {
                              if (this.a(var3_ref, var21, -66)) {
                                if (this.a(var21, 119, var3_ref)) {
                                  break L7;
                                } else {
                                  var13++;
                                  continue L8;
                                }
                              } else {
                                var13++;
                                continue L8;
                              }
                            } else {
                              var13++;
                              continue L8;
                            }
                          }
                        }
                      }
                    }
                  }
                  L9: {
                    if (gab.field_b.a((byte) 127)) {
                      break L9;
                    } else {
                      var13_ref_mqb__ = this.field_g;
                      var14_int = 0;
                      L10: while (true) {
                        if (var14_int >= var13_ref_mqb__.length) {
                          break L9;
                        } else {
                          L11: {
                            var15 = var13_ref_mqb__[var14_int];
                            if (null != var15) {
                              L12: {
                                if (0 != gba.field_r) {
                                  break L12;
                                } else {
                                  if (var15.m(32) != var3_ref.b(false)) {
                                    break L12;
                                  } else {
                                    var14_int++;
                                    continue L10;
                                  }
                                }
                              }
                              if (this.a(var3_ref, var15, -80)) {
                                if (this.a(var15, 48, var3_ref)) {
                                  break L9;
                                } else {
                                  break L11;
                                }
                              } else {
                                break L11;
                              }
                            } else {
                              break L11;
                            }
                          }
                          var14_int++;
                          continue L10;
                        }
                      }
                    }
                  }
                  L13: {
                    if (gab.field_b.a((byte) -18)) {
                      break L13;
                    } else {
                      var12 = this.field_u.a(-110, 3);
                      var13 = 0;
                      L14: while (true) {
                        if (var13 >= var12) {
                          break L13;
                        } else {
                          var22 = param0[-field_c[2] + ada.field_a[var13]];
                          var14_ref2 = var22;
                          if (null != var14_ref2) {
                            if (this.a(var3_ref, var22, -81)) {
                              if (this.a(var22, 72, var3_ref)) {
                                break L13;
                              } else {
                                var13++;
                                continue L14;
                              }
                            } else {
                              var13++;
                              continue L14;
                            }
                          } else {
                            var13++;
                            continue L14;
                          }
                        }
                      }
                    }
                  }
                  L15: {
                    this.a(var3_ref, var5, var9, (byte) -103, var4, var8);
                    this.a(var5, var8, var4, var3_ref, var9, 6);
                    if (wgb.field_i == null) {
                      break L15;
                    } else {
                      L16: {
                        var13 = 1;
                        if (wgb.field_i instanceof sg) {
                          L17: {
                            var23_ref = (sg) ((Object) wgb.field_i);
                            if (var3_ref.e(512) != var23_ref.q((byte) 77)) {
                              if (!var23_ref.j((byte) -127)) {
                                stackIn_84_0 = 1;
                                break L17;
                              } else {
                                stackIn_84_0 = 0;
                                break L17;
                              }
                            } else {
                              stackIn_84_0 = 0;
                              break L17;
                            }
                          }
                          L18: {
                            var13 = stackIn_84_0;
                            if (var13 == 0) {
                              break L18;
                            } else {
                              var23_ref.c(var3_ref.b(false), 19581);
                              if (!var23_ref.g(false)) {
                                break L18;
                              } else {
                                eib.a(6811, 90, 100);
                                break L18;
                              }
                            }
                          }
                          if (var13 != 0) {
                            break L16;
                          } else {
                            if ((var3_ref.g((byte) -104) ^ -1) != -6) {
                              break L16;
                            } else {
                              if (!var23_ref.j((byte) -40)) {
                                var13 = 1;
                                break L16;
                              } else {
                                break L16;
                              }
                            }
                          }
                        } else {
                          if (wgb.field_i instanceof nbb) {
                            var19_ref = (nbb) ((Object) wgb.field_i);
                            var24 = var19_ref;
                            var24.field_u = true;
                            break L16;
                          } else {
                            wgb.field_i.d((byte) -68);
                            this.a((byte) 108, var3_ref, var13 != 0);
                            var3_ref = (tj) ((Object) this.field_x.a((byte) 46));
                            continue L1;
                          }
                        }
                      }
                      wgb.field_i.d((byte) -68);
                      this.a((byte) 108, var3_ref, var13 != 0);
                      break L15;
                    }
                  }
                  var3_ref = (tj) ((Object) this.field_x.a((byte) 46));
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var3_ref2 = decompiledCaughtException;
            stackIn_100_0 = (RuntimeException) (var3_ref2);

            stackIn_100_1 = new StringBuilder().append("pe.RE(");

            if (param0 == null) {
              stackIn_101_0 = (RuntimeException) ((Object) stackIn_100_0);
              stackIn_101_1 = (StringBuilder) ((Object) stackIn_100_1);
              stackIn_101_2 = "null";
              break L19;
            } else {
              stackIn_101_0 = (RuntimeException) ((Object) stackIn_100_0);
              stackIn_101_1 = (StringBuilder) ((Object) stackIn_100_1);
              stackIn_101_2 = "{...}";
              break L19;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_101_0), stackIn_101_2 + ',' + param1 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        L0: {
          var13 = VoidHunters.field_G;
          if (param3 == -19079) {
            break L0;
          } else {
            this.g(-33);
            break L0;
          }
        }
        var9 = -2147483648;
        var10 = -1;
        var11 = 0;
        L1: while (true) {
          L2: {
            if (this.field_s.length <= var11) {
              break L2;
            } else {
              if (this.field_s[var11].b((byte) -123)) {
                var12 = this.field_s[var11].a(true);
                if (var12 > var9) {
                  var10 = var11;
                  var9 = var12;
                  var11++;
                  continue L1;
                } else {
                  var11++;
                  continue L1;
                }
              } else {
                var10 = var11;
                break L2;
              }
            }
          }
          L3: {
            if (-1 >= (var10 ^ -1)) {
              this.field_s[var10].a(param7, param4, param2, param6, param5, param0, param1, true);
              break L3;
            } else {
              break L3;
            }
          }
          return;
        }
    }

    final void a(lta param0, int param1, lbb param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.a(true, param2, (byte) -117, param0);
              if (param1 == -950) {
                break L1;
              } else {
                this.d(true);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("pe.BB(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {
            stackIn_10_0 = (RuntimeException) ((Object) stackIn_7_0);

            stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
    }

    private final void b(byte param0, int param1) {
        L0: {
          this.field_j = (it[]) ((Object) dt.a(pgb.field_g, param1, param0 ^ 15642, this.field_j));
          if (param0 == 41) {
            break L0;
          } else {
            this.c(88);
            break L0;
          }
        }
    }

    final boolean c(byte param0) {
        int var2 = -84 / ((-33 - param0) / 37);
        return this.field_v;
    }

    private final boolean a(tfa param0, int param1, tfa param2, sg param3) {
        boolean discarded$0 = false;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_22_0 = 0;
        Object stackIn_29_0 = null;
        sg stackIn_29_1 = null;
        Object stackIn_30_0 = null;
        sg stackIn_30_1 = null;
        int stackIn_30_2 = 0;
        int stackIn_32_0 = 0;
        int stackIn_36_0 = 0;
        Object stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        Object stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        Object stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        Object stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        Object stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        Object stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_49_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object var5 = null;
        vra var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        nbb var12 = null;
        nbb var13 = null;
        try {
          L0: {
            L1: {
              param3.a((int[]) null, -52);
              param3.a((qua) null, 3);
              var5 = null;
              if (param3.n((byte) 28) == null) {
                var5 = this.i(21363, param3.x(85));
                break L1;
              } else {
                break L1;
              }
            }
            var6 = new vra();
            var6.field_e = param0.field_f;
            if (param1 <= -69) {
              var6.field_d = param2.field_f;
              var6.field_a = param0.field_e;
              var6.field_c = param0.field_d;
              if (param3.n((byte) 28) != null) {
                param3.field_k.i(103);
                this.a(16384, var6, param3.n((byte) 28), param3);
                stackIn_11_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L2: {
                  var7 = var6.field_c;
                  var8 = var6.field_a;
                  if (var5 == null) {
                    stackIn_16_0 = 0;
                    break L2;
                  } else {
                    stackIn_16_0 = 1;
                    break L2;
                  }
                }
                L3: {
                  var9 = stackIn_16_0;
                  var12 = this.a((nbb) (var5), (byte) 127, param3, var8, var6, var7);
                  if (var12 != null) {
                    if (var9 == 0) {
                      stackIn_22_0 = 1;
                      break L3;
                    } else {
                      stackIn_22_0 = 0;
                      break L3;
                    }
                  } else {
                    stackIn_22_0 = 0;
                    break L3;
                  }
                }
                var10 = stackIn_22_0;
                if ((var6.field_e & 128) == 0) {
                  if ((var6.field_d & 128) != 0) {
                    discarded$0 = this.a(var12, var8, true, param3, 126, var7);
                    stackIn_36_0 = 1;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    return true;
                  }
                } else {
                  L4: {
                    param3.field_k.i(101);
                    var13 = this.a(var8, var12, param3, (byte) 124, var7);
                    var5 = var13;
                    if (var13 == null) {
                      break L4;
                    } else {
                      L5: {
                        if (var10 != 0) {
                          break L5;
                        } else {
                          var11 = -field_c[1] + var13.field_l;
                          var5 = this.c(var11, false);
                          break L5;
                        }
                      }
                      L6: {
                        stackIn_29_0 = this;

                        stackIn_29_1 = (sg) (param3);

                        if (1 != hw.field_b) {
                          stackIn_30_0 = this;
                          stackIn_30_1 = (sg) ((Object) stackIn_29_1);
                          stackIn_30_2 = 0;
                          break L6;
                        } else {
                          stackIn_30_0 = this;
                          stackIn_30_1 = (sg) ((Object) stackIn_29_1);
                          stackIn_30_2 = 1;
                          break L6;
                        }
                      }
                      this.a(stackIn_30_1, stackIn_30_2 != 0, -98, (nbb) (var5), var8, var7);
                      rmb.a(param3.g((byte) -91), param3.field_l, 74, 93, param3.d(false));
                      break L4;
                    }
                  }
                  stackIn_32_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              stackIn_6_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackIn_40_0 = var5;

            stackIn_40_1 = new StringBuilder().append("pe.WD(");

            if (param0 == null) {
              stackIn_41_0 = stackIn_40_0;
              stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackIn_41_2 = "null";
              break L7;
            } else {
              stackIn_41_0 = stackIn_40_0;
              stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackIn_41_2 = "{...}";
              break L7;
            }
          }
          L8: {
            stackIn_44_0 = stackIn_41_0;

            stackIn_44_1 = ((StringBuilder) (Object) stackIn_41_1).append(stackIn_41_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_45_0 = stackIn_44_0;
              stackIn_45_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackIn_45_2 = "null";
              break L8;
            } else {
              stackIn_45_0 = stackIn_41_0;
              stackIn_45_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackIn_45_2 = "{...}";
              break L8;
            }
          }
          L9: {
            stackIn_48_0 = stackIn_45_0;

            stackIn_48_1 = ((StringBuilder) (Object) stackIn_45_1).append(stackIn_45_2).append(',');

            if (param3 == null) {
              stackIn_49_0 = stackIn_48_0;
              stackIn_49_1 = (StringBuilder) ((Object) stackIn_48_1);
              stackIn_49_2 = "null";
              break L9;
            } else {
              stackIn_49_0 = stackIn_45_0;
              stackIn_49_1 = (StringBuilder) ((Object) stackIn_48_1);
              stackIn_49_2 = "{...}";
              break L9;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_49_0), stackIn_49_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_32_0 != 0;
            } else {
              return stackIn_36_0 != 0;
            }
          }
        }
    }

    final boolean a(int param0, int param1, int param2, boolean param3, int param4, int param5) {
        int var7;
        qob[] var8;
        int var9;
        int var10;
        qob var11;
        int var12;
        int var13;
        int var14;
        L0: {
          var14 = VoidHunters.field_G;
          var7 = 0;
          var8 = this.field_p.a(false);
          var9 = 1 % ((24 - param4) / 52);
          if (null == var8) {
            break L0;
          } else {
            var10 = 0;
            L1: while (true) {
              if (var10 >= var8.length) {
                break L0;
              } else {
                var11 = var8[var10];
                var12 = param0 - var11.a(true);
                var13 = param1 + -var11.a((byte) -102);
                if (param5 / 2 > Math.abs(var12)) {
                  if (param2 / 2 > Math.abs(var13)) {
                    this.a(0, param3, var10);
                    var8 = this.field_p.a(false);
                    var10--;
                    var10++;
                    continue L1;
                  } else {
                    var10++;
                    continue L1;
                  }
                } else {
                  var10++;
                  continue L1;
                }
              }
            }
          }
        }
        return var7 != 0;
    }

    private final anb a(int param0, byte param1, int param2, anb[] param3) {
        anb[] var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        anb var7 = null;
        int var8 = 0;
        anb[] var9 = null;
        anb stackIn_6_0 = null;
        Object stackIn_11_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = VoidHunters.field_G;
        try {
          L0: {
            var9 = param3;
            var5 = var9;
            var6 = 0;
            L1: while (true) {
              if (var9.length <= var6) {
                if (param1 != -111) {
                  this.f(false);
                  stackIn_11_0 = null;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  return null;
                }
              } else {
                L2: {
                  var7 = var9[var6];
                  if (null == var7) {
                    break L2;
                  } else {
                    if (null == var7.field_k.a(param2, param0, true)) {
                      break L2;
                    } else {
                      stackIn_6_0 = (anb) (var7);
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  }
                }
                var6++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var5_ref);

            stackIn_15_1 = new StringBuilder().append("pe.HC(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          return (anb) ((Object) stackIn_11_0);
        }
    }

    private final void a(sg param0, boolean param1, int param2, nbb param3, int param4, int param5) {
        int var8 = 0;
        lu var9 = null;
        ml var10_ref_ml = null;
        int var10 = 0;
        imb var11_ref_imb = null;
        int var11 = 0;
        lsb var12_ref_lsb = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        ml var20 = null;
        qua var21 = null;
        ml var22 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          L0: {
            L1: {
              var22 = param3.field_k;
              if (param2 <= -59) {
                break L1;
              } else {
                this.field_m = (nbb[]) null;
                break L1;
              }
            }
            L2: {
              var8 = 1;
              var9 = param0.field_k.a(param5, false, 8192, 0, param4, param0.field_k, -29866, (anb) null);
              if (null == var9) {
                break L2;
              } else {
                L3: {
                  var10_ref_ml = var9.field_b;
                  var11_ref_imb = var10_ref_ml.field_d[var9.field_e];
                  var12_ref_lsb = var10_ref_ml.i((byte) -112).field_o[var9.field_e];
                  var13 = var12_ref_lsb.field_a + var9.field_b.field_b;
                  if (null == param3.field_k.field_a) {
                    break L3;
                  } else {
                    var13 = rrb.a(22433, var13 + 4096);
                    break L3;
                  }
                }
                param3.a(var13, -86);
                var14 = var22.b(38) * fc.a(param3.e(0), (byte) -99) + -(var22.c((byte) 100) * eu.a(param3.e(0), 125)) >> 1578797456;
                var15 = var22.b(37) * eu.a(param3.e(0), 63) - -(var22.c((byte) 100) * fc.a(param3.e(0), (byte) -67)) >> 589524432;
                param3.a(var11_ref_imb.field_e - var14 + param3.j(995401160), var11_ref_imb.field_d + (-var15 - -param3.i((byte) 5)), (byte) -107);
                param3.field_h = 0;
                param3.field_f = 0;
                param3.field_k.i(97);
                param3.a(param1, true, (pe) (this));
                var8 = 0;
                param0.a(var9.field_b.field_g, -48);
                var16 = param0.field_d - param0.j(995401160);
                var17 = param0.field_e + -param0.i((byte) 5);
                var18 = fc.a(param0.e(0), (byte) 44);
                var19 = eu.a(param0.e(0), 68);
                var20 = new ml();
                param0.field_k.b((byte) 119, var20);
                param0.field_k.a(var19, param0.e(0), var18, var17, true, true, false, var16, (int[]) null);
                var21 = param0.field_k.a(false, param3, 0, -1, param4, 8192, param0.field_k, param5);
                var20.b((byte) 83, param0.field_k);
                if (var21 == null) {
                  break L2;
                } else {
                  param0.a(var21, 3);
                  break L2;
                }
              }
            }
            L4: {
              if (var8 != 0) {
                L5: {
                  var10 = var22.b(-48) * fc.a(param3.e(0), (byte) -120) + -(var22.c((byte) 100) * eu.a(param3.e(0), 118)) >> 1858962576;
                  var11 = var22.b(124) * eu.a(param3.e(0), 82) + var22.c((byte) 100) * fc.a(param3.e(0), (byte) 87) >> -1350757776;
                  var12 = param3.j(995401160);
                  var13 = param3.d(false) - var12;
                  var14 = param3.i((byte) 5);
                  var15 = param3.g((byte) -63) + -var14;
                  var16 = var10 + var13;
                  var17 = var11 + var15;
                  var18 = -var16 + param5;
                  var19 = param4 + -var17;
                  if (1 != ktb.field_q) {
                    param3.a(var19 * param3.e(false) / 2, param3.d(false), param3.g((byte) -77), (byte) -128, var18 * param3.e(false) / 2);
                    param3.a(-param3.f(0) * param3.e(false) / 2, param3.d(false), param3.g((byte) 127), (byte) -124, -param3.c((byte) -115) * param3.e(false) / 2);
                    break L5;
                  } else {
                    param3.a(param3.d(false) + var18, var19 + param3.g((byte) -32), (byte) -123);
                    param3.a(param1, true, (pe) (this));
                    break L5;
                  }
                }
                param3.d((byte) 107);
                break L4;
              } else {
                param3.d((byte) 107);
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var7 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var7);

            stackIn_18_1 = new StringBuilder().append("pe.LB(");

            if (param0 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L6;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L6;
            }
          }
          L7: {
            stackIn_22_0 = (RuntimeException) ((Object) stackIn_19_0);

            stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L7;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L7;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param4 + ',' + param5 + ')');
        }
    }

    private final boolean a(boolean param0, int[] param1, int[] param2) {
        int stackIn_10_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                this.field_u = (fba) null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (param2[0] < param1[0]) {
                  break L3;
                } else {
                  if (param2[1] > param1[1]) {
                    break L3;
                  } else {
                    if (param1[2] > param2[2]) {
                      break L3;
                    } else {
                      if (param2[3] <= param1[3]) {
                        stackIn_10_0 = 0;
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
              }
              stackIn_10_0 = 1;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var4);

            stackIn_14_1 = new StringBuilder().append("pe.CD(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          L5: {
            stackIn_18_0 = (RuntimeException) ((Object) stackIn_15_0);

            stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

            if (param2 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L5;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L5;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
        return stackIn_10_0 != 0;
    }

    private final void a(int param0, lta param1, int param2) {
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        uwa var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        var18 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param0 < -92) {
                break L1;
              } else {
                this.field_t = (cq[]) null;
                break L1;
              }
            }
            var4_int = 0;
            L2: while (true) {
              if (ccb.field_a.field_d <= var4_int) {
                break L0;
              } else {
                L3: {
                  L4: {
                    var5 = ccb.field_a.field_b[var4_int];
                    if (!(var5.field_e instanceof sg)) {
                      break L4;
                    } else {
                      if (((sg) ((Object) var5.field_e)).b(2, (byte) 62)) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var6 = param1.a(var5.field_g, (byte) 115);
                  var7 = param1.b(true, var5.field_f);
                  if (-1 != var5.field_i) {
                    var8 = rkb.field_o;
                    var9 = 0;
                    var10 = 0;
                    var11 = 128 + (eu.a(100 * param2, 58) >> -137696471) | 11184640;
                    var12 = 0;
                    L5: while (true) {
                      if (-11 >= (var12 ^ -1)) {
                        var12 = -var8;
                        L6: while (true) {
                          if (var8 < var12) {
                            break L3;
                          } else {
                            L7: {
                              var13 = var5.field_b + var5.field_i * var12 / var8;
                              var14 = (fc.a(var13, (byte) -106) >> -237142360) * (var5.field_d >> 87727304);
                              var15 = (eu.a(var13, 98) >> -1335706008) * (var5.field_d >> -204319032);
                              var16 = var5.field_g + var14;
                              var17 = var5.field_f + var15;
                              if ((-var8 ^ -1) <= (var12 ^ -1)) {
                                break L7;
                              } else {
                                c.a(param1.b(true, var17), param1.a(var16, (byte) 112), param1.a(var9, (byte) 125), param1.b(true, var10), -16777216, var11);
                                break L7;
                              }
                            }
                            var10 = var17;
                            var9 = var16;
                            var12++;
                            continue L6;
                          }
                        }
                      } else {
                        var13 = (eu.a(var12 * (10 * param2), 78) >> 1228235496) * (var5.field_i >> -371143672) - -var5.field_b;
                        var14 = (fc.a(var13, (byte) 105) >> -1965028632) * (var5.field_d >> -1253028760);
                        var15 = (eu.a(var13, 45) >> -401163288) * (var5.field_d >> 1417038632);
                        c.a(param1.b(true, var15 + var5.field_f), param1.a(var14 + var5.field_g, (byte) 120), var6, var7, -16777216, 4473924);
                        var12++;
                        continue L5;
                      }
                    }
                  } else {
                    kq.a((float)var5.field_d * param1.field_a, (byte) 111, var7, 11184895, var6);
                    break L3;
                  }
                }
                var4_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var4 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var4);

            stackIn_25_1 = new StringBuilder().append("pe.UE(").append(param0).append(',');

            if (param1 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L8;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L8;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param2 + ')');
        }
    }

    private final void a(lta param0, sg param1, int param2, int param3, int param4) {
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        try {
          L0: {
            L1: {
              if (!param1.d(4, 49)) {
                break L1;
              } else {
                L2: {
                  if (0 == era.field_p) {
                    break L2;
                  } else {
                    if (!param1.q(-49)) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (-1 != param4) {
                    break L3;
                  } else {
                    if ((param2 ^ -1) != 0) {
                      break L3;
                    } else {
                      break L1;
                    }
                  }
                }
                var6_int = param0.a(param4, (byte) 120);
                var7 = param0.b(true, param2);
                kq.a(param0.field_a * (float)nw.field_o, (byte) 77, var7, 65280, var6_int);
                break L1;
              }
            }
            L4: {
              if (param3 == 0) {
                break L4;
              } else {
                this.field_x = (ij) null;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var6);

            stackIn_16_1 = new StringBuilder().append("pe.GA(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          L6: {
            stackIn_20_0 = (RuntimeException) ((Object) stackIn_17_0);

            stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');

            if (param1 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final anb a(byte param0, int param1, int param2) {
        anb var4;
        crb[] var5;
        if (param0 <= -9) {
          var4 = this.a(param1, (byte) -111, param2, this.field_k);
          if (null != var4) {
            return var4;
          } else {
            var4 = this.a(param1, (byte) -111, param2, this.field_m);
            if (var4 == null) {
              var5 = this.field_e.c(0);
              var4 = this.a(param1, (byte) -111, param2, var5);
              if (var4 != null) {
                return var4;
              } else {
                var4 = this.a(param1, (byte) -111, param2, this.field_g);
                return var4;
              }
            } else {
              return var4;
            }
          }
        } else {
          return (anb) null;
        }
    }

    final crb[] a(boolean param0) {
        if (!param0) {
            return (crb[]) null;
        }
        return this.field_e.c(0);
    }

    private final void a(qob param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.a(true, param0, (byte) -94);
              if (param1 == 0) {
                break L1;
              } else {
                this.a(true, 95, -77, 72);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("pe.QA(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
    }

    final void a(int param0, boolean param1) {
        if (param0 != 48) {
            this.field_x = (ij) null;
        }
        this.field_i = param1 ? true : false;
    }

    private final void c(byte param0, int param1) {
        L0: {
          this.field_a = (rba[]) ((Object) dt.a(ema.field_p, param1, 15667, this.field_a));
          if (param0 == 110) {
            break L0;
          } else {
            this.field_n = (ij) null;
            break L0;
          }
        }
    }

    final void a(sg param0, byte param1) {
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            param0.a((pe) (this), true, (byte) 67, false);
            param0.b(-(this.field_r >> 1956167809), 2147483647, this.field_r >> -179751807, -(this.field_o >> -479651135), this.field_o >> 1109078657);
            if (param1 > 70) {
              L1: {
                param0.C(32);
                if (!this.a(29651, param0, this.field_k, 0)) {
                  break L1;
                } else {
                  this.b(1, (byte) 125, param0);
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("pe.UA(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final int f(int param0, int param1) {
        int var3;
        int var4;
        int var5;
        L0: {
          var5 = VoidHunters.field_G;
          var3 = 0;
          if (param1 == -13766) {
            break L0;
          } else {
            this.field_j = (it[]) null;
            break L0;
          }
        }
        var4 = 0;
        L1: while (true) {
          if (this.field_k.length <= var4) {
            return var3;
          } else {
            if (this.field_k[var4] != null) {
              if (this.field_k[var4].q((byte) 109) != param0) {
                var4++;
                continue L1;
              } else {
                var3++;
                var4++;
                continue L1;
              }
            } else {
              var4++;
              continue L1;
            }
          }
        }
    }

    final int b(boolean param0) {
        int var2;
        nbb[] var3;
        int var4;
        nbb var5;
        int var6;
        L0: {
          var6 = VoidHunters.field_G;
          var2 = 0;
          var3 = this.field_m;
          if (param0) {
            break L0;
          } else {
            this.field_v = true;
            break L0;
          }
        }
        var4 = 0;
        L1: while (true) {
          if (var4 >= var3.length) {
            return var2;
          } else {
            var5 = var3[var4];
            if (null == var5) {
              var4++;
              continue L1;
            } else {
              var2++;
              var4++;
              continue L1;
            }
          }
        }
    }

    final void a(tj param0, boolean param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (1023 > this.field_x.c(3)) {
              L1: {
                this.field_x.b(-10258, param0);
                if (!param1) {
                  break L1;
                } else {
                  field_c = (int[]) null;
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (runtimeException);

            stackIn_8_1 = new StringBuilder().append("pe.HD(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(int param0, int param1, int param2, tj param3, int param4, int param5) {
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9_int = 0;
        uwa var9 = null;
        int var10 = 0;
        uwa var10_ref_uwa = null;
        sg var11 = null;
        int var11_int = 0;
        Object var12 = null;
        int var12_int = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param5 != param3.g((byte) -104)) {
                break L1;
              } else {
                var7_int = -1;
                var8 = 2147483647;
                var9_int = 0;
                L2: while (true) {
                  if (var9_int >= ccb.field_a.field_d) {
                    if ((var7_int ^ -1) != 0) {
                      L3: {
                        var9 = ccb.field_a.field_b[var7_int];
                        var10 = param3.b(false);
                        var11 = this.d(var10, 113);
                        var12 = null;
                        if (null == var9.field_e) {
                          break L3;
                        } else {
                          if (!(var9.field_e instanceof sg)) {
                            break L3;
                          } else {
                            var12 = (sg) ((Object) var9.field_e);
                            break L3;
                          }
                        }
                      }
                      L4: {
                        if (null != var12) {
                          param3.b(((sg) (var12)).o((byte) -117), (byte) 47);
                          param3.a(122, ((sg) (var12)).q((byte) 80));
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      if (null == var11) {
                        param3.a(-1, (byte) -98);
                        break L1;
                      } else {
                        if (var9.field_e != var11) {
                          param3.a(var11.field_l, (byte) -113);
                          param3.field_o = ema.field_o[8].a((byte) -99);
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                    } else {
                      break L1;
                    }
                  } else {
                    var10_ref_uwa = ccb.field_a.field_b[var9_int];
                    if (-2 == (var10_ref_uwa.field_c ^ -1)) {
                      var11_int = var10_ref_uwa.field_g + -param3.field_d;
                      var12_int = -param3.field_e + var10_ref_uwa.field_f;
                      var13 = ar.a(var11_int, (byte) 126, var12_int);
                      if (var10_ref_uwa.field_d > var13) {
                        if (var8 > var13) {
                          var8 = var13;
                          var7_int = var9_int;
                          var9_int++;
                          continue L2;
                        } else {
                          var9_int++;
                          continue L2;
                        }
                      } else {
                        var9_int++;
                        continue L2;
                      }
                    } else {
                      var9_int++;
                      continue L2;
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var7 = decompiledCaughtException;
            stackIn_32_0 = (RuntimeException) (var7);

            stackIn_32_1 = new StringBuilder().append("pe.NC(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L5;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L5;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final boolean a(int param0, lbb param1, int param2) {
        int var4_int = 0;
        int stackIn_5_0 = 0;
        int stackIn_13_0 = 0;
        boolean stackIn_15_0 = false;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        try {
          L0: {
            L1: {
              var4_int = param1.e(8);
              if (3 == var4_int) {
                break L1;
              } else {
                if (var4_int != 5) {
                  stackIn_5_0 = 0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (param2 == -14368) {
                break L2;
              } else {
                this.a((lbb) null, (tfa[]) null, (byte) -27, (nwa) null);
                break L2;
              }
            }
            L3: {
              if ((param1.e(param2 ^ -14360) ^ -1) == -6) {
                var5 = param1.f((byte) -97);
                var6 = lga.a((byte) -2, this.field_y);
                if (var6 >= var5) {
                  break L3;
                } else {
                  stackIn_13_0 = 0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                break L3;
              }
            }
            stackIn_15_0 = this.a(true, param0, param1);
            decompiledRegionSelector0 = 2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var4);

            stackIn_19_1 = new StringBuilder().append("pe.CB(").append(param0).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L4;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0 != 0;
          } else {
            return stackIn_15_0;
          }
        }
    }

    final nbb[] h(byte param0) {
        if (param0 != -33) {
            return (nbb[]) null;
        }
        return this.field_m;
    }

    private final boolean a(anb param0, anb param1, int param2) {
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        ij var5 = null;
        try {
          L0: {
            if (!rna.a(param0.field_q, param1.field_q, -128)) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var4_int = -59 / ((param2 - -25) / 41);
              var5 = new ij();
              param0.field_k.a(param1.field_k, 0, 0, (byte) -126, var5);
              if (var5.b(-103)) {
                stackIn_9_0 = 0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_7_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var4);

            stackIn_13_1 = new StringBuilder().append("pe.HE(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L1;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L1;
            }
          }
          L2: {
            stackIn_17_0 = (RuntimeException) ((Object) stackIn_14_0);

            stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L2;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            return stackIn_9_0 != 0;
          }
        }
    }

    final boolean a(anb param0, int param1) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        qob var7 = null;
        int var8 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var8 = VoidHunters.field_G;
        try {
          L0: {
            var3_int = 0;
            var4 = this.field_u.a(-1, param0.f((byte) -91), 0, 88);
            var5 = 0;
            var6 = 118 / ((56 - param1) / 59);
            L1: while (true) {
              L2: {
                if (var5 >= var4) {
                  break L2;
                } else {
                  L3: {
                    var7 = this.d((byte) 116)[ada.field_a[var5]];
                    if (var7 == null) {
                      break L3;
                    } else {
                      if (var7.a((byte) 100, param0.d(false), param0.g((byte) -17))) {
                        var3_int = 1;
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var5++;
                  continue L1;
                }
              }
              stackIn_11_0 = var3_int;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3);

            stackIn_15_1 = new StringBuilder().append("pe.KB(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
        }
        return stackIn_11_0 != 0;
    }

    final boolean a(int param0, anb param1, anb[] param2, int param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        nbb[] var3 = null;
        RuntimeException var5 = null;
        var7 = VoidHunters.field_G;
        try {
          L0: {
            if (param0 == 29651) {
              var5_int = 0;
              L1: while (true) {
                if (var5_int >= param2.length) {
                  stackIn_16_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L2: {
                    if (null != param2[var5_int]) {
                      break L2;
                    } else {
                      var6 = var5_int + field_c[param3];
                      if (this.d(var6, (byte) 21)) {
                        break L2;
                      } else {
                        L3: {
                          if (-2 == (param3 ^ -1)) {
                            this.l(param0 + -29775);
                            var3 = this.field_m;
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        var3[var5_int] = (nbb) ((Object) param1);
                        param1.field_l = var6;
                        stackIn_13_0 = 1;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                  }
                  var5_int++;
                  continue L1;
                }
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var5);

            stackIn_20_1 = new StringBuilder().append("pe.KE(").append(param0).append(',');

            if (param1 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L4;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L4;
            }
          }
          L5: {
            stackIn_24_0 = (RuntimeException) ((Object) stackIn_21_0);

            stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');

            if (var3 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L5;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L5;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0 != 0;
          } else {
            return stackIn_16_0 != 0;
          }
        }
    }

    private final void a(it param0, byte param1) {
        nbb discarded$0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if (null == this.field_j) {
                break L1;
              } else {
                if (this.field_j.length >= 15) {
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              this.field_j = (it[]) ((Object) ija.a(param0, this.field_j, 0, pgb.field_g));
              if (param1 == 107) {
                break L2;
              } else {
                discarded$0 = this.a(78, (nbb) null, (sg) null, (byte) -99, 119);
                break L2;
              }
            }
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("pe.FD(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(boolean param0, qob param1, byte param2) {
        int var4_int = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              if (param2 <= -66) {
                break L1;
              } else {
                this.field_h = true;
                break L1;
              }
            }
            L2: {
              L3: {
                var4_int = this.field_p.a(param1, 121);
                if (!param0) {
                  break L3;
                } else {
                  if (-1 != var4_int) {
                    this.field_u.a(new int[]{-16384 + param1.a(true), param1.a(true) + 16384, param1.a((byte) -99) - 16384, param1.a((byte) -127) + 16384}, (byte) 43, var4_int, 0);
                    break L3;
                  } else {
                    break L2;
                  }
                }
              }
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var4);

            stackIn_11_1 = new StringBuilder().append("pe.PE(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param2 + ')');
        }
    }

    private final nbb a(int param0, int param1, int param2, byte param3, int param4, int param5) {
        Object var7;
        int var8;
        int var9;
        nbb[] var10;
        int var11;
        nbb var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        var20 = VoidHunters.field_G;
        var7 = null;
        var8 = 262144;
        var9 = var8;
        var10 = this.field_m;
        var11 = 0;
        L0: while (true) {
          if (var10.length <= var11) {
            L1: {
              if (param3 == 30) {
                break L1;
              } else {
                this.field_u = (fba) null;
                break L1;
              }
            }
            return (nbb) (var7);
          } else {
            var12 = var10[var11];
            if (null != var12) {
              if (var12.field_k.field_j == param5) {
                var13 = (var12.f((byte) -80)[0] - -var12.f((byte) -97)[1]) / 2;
                var14 = (var12.f((byte) -70)[2] + var12.f((byte) -54)[3]) / 2;
                var15 = var13 + -param0;
                var16 = -param2 + var14;
                var17 = ar.a(var15, (byte) 104, var16);
                if (var17 < var9) {
                  var18 = -param1 + var13;
                  var19 = -param4 + var14;
                  if (ar.a(var18, (byte) 108, var19) < gs.field_c) {
                    if (!this.a(false, false, var12.field_l)) {
                      var7 = var12;
                      var9 = var17;
                      var11++;
                      continue L0;
                    } else {
                      var11++;
                      continue L0;
                    }
                  } else {
                    var11++;
                    continue L0;
                  }
                } else {
                  var11++;
                  continue L0;
                }
              } else {
                var11++;
                continue L0;
              }
            } else {
              var11++;
              continue L0;
            }
          }
        }
    }

    private final nbb c(int param0, boolean param1) {
        if (null == this.field_m) {
            return null;
        }
        if ((param0 ^ -1) > -1) {
            return null;
        }
        if (param0 >= this.field_m.length) {
            return null;
        }
        if (null == this.field_m[param0]) {
            return null;
        }
        this.l(-85);
        nbb var4 = this.field_m[param0];
        nbb var3 = var4;
        if (param1) {
            return (nbb) null;
        }
        this.field_m[param0] = new nbb();
        var4.b((byte) 97, this.field_m[param0]);
        return this.field_m[param0];
    }

    final int c(int param0) {
        int var2;
        int var3;
        int var4;
        var4 = VoidHunters.field_G;
        var2 = param0;
        var3 = 0;
        L0: while (true) {
          if (var3 >= this.field_k.length) {
            return var2;
          } else {
            if (this.field_k[var3] != null) {
              var2++;
              var3++;
              continue L0;
            } else {
              var3++;
              continue L0;
            }
          }
        }
    }

    private final void a(int param0, nwa param1, tfa[] param2) {
        boolean discarded$0 = false;
        boolean discarded$1 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        crb[] var5 = null;
        ij var7 = null;
        try {
          L0: {
            L1: {
              var7 = new ij();
              this.a(var7, false);
              this.a(var7, (byte) 25);
              var5 = this.field_e.c(0);
              this.a(var7, -1, var5);
              this.a(var5, true, var7);
              if ((seb.field_o ^ -1) != -2) {
                break L1;
              } else {
                discarded$0 = this.a(var7, this.field_m, this.field_g, 20521, 3, 1, sja.field_i);
                break L1;
              }
            }
            L2: {
              if (!this.a(var7, var5, this.field_g, param0 + 20519, 3, param0, sja.field_i)) {
                break L2;
              } else {
                this.field_e.b(-67);
                break L2;
              }
            }
            discarded$1 = this.a(var7, this.field_k, this.field_g, 20521, 3, 0, sja.field_i);
            this.a(var5, param0 ^ 44);
            this.k(param0 ^ -84);
            this.a(param1, 7559, param2, var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var4);

            stackIn_9_1 = new StringBuilder().append("pe.FF(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {
            stackIn_13_0 = (RuntimeException) ((Object) stackIn_10_0);

            stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param2 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
    }

    final ij c(boolean param0) {
        if (!param0) {
            this.a(-10);
        }
        return this.field_x;
    }

    final nbb a(boolean param0, int param1, int param2, int param3, int param4) {
        if (!param0) {
            field_w = (int[]) null;
        }
        return this.b(1, 65536, param3, param2, param4, param1);
    }

    public static void h(int param0) {
        if (param0 != 3) {
            field_d = (String) null;
        }
        field_d = null;
        field_w = null;
        field_c = null;
    }

    final anb a(boolean param0, int param1, int param2, int param3) {
        int stackIn_22_0 = 0;
        nbb stackIn_22_1 = null;
        int stackIn_23_0 = 0;
        nbb stackIn_23_1 = null;
        int stackIn_23_2 = 0;
        Object var5;
        int var6;
        int var8;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        sg[] var15;
        sg var16;
        nbb[] var17;
        nbb var18;
        var13 = VoidHunters.field_G;
        var5 = null;
        var6 = 2147483647;
        var15 = this.field_k;
        var8 = 0;
        L0: while (true) {
          if (var8 >= var15.length) {
            L1: {
              if (1 == voa.field_d) {
                var17 = this.field_m;
                var14 = 0;
                var8 = var14;
                L2: while (true) {
                  if (var14 >= var17.length) {
                    break L1;
                  } else {
                    var18 = var17[var14];
                    if (null != var18) {
                      L3: {
                        stackIn_22_0 = -param2;

                        stackIn_22_1 = (nbb) (var18);

                        if (param0) {
                          stackIn_23_0 = stackIn_22_0;
                          stackIn_23_1 = (nbb) ((Object) stackIn_22_1);
                          stackIn_23_2 = 0;
                          break L3;
                        } else {
                          stackIn_23_0 = stackIn_22_0;
                          stackIn_23_1 = (nbb) ((Object) stackIn_22_1);
                          stackIn_23_2 = 1;
                          break L3;
                        }
                      }
                      var10 = stackIn_23_0 + ((nbb) (Object) stackIn_23_1).d(stackIn_23_2 != 0);
                      var11 = var18.g((byte) 123) - param1;
                      var12 = ar.a(var10, (byte) 124, var11);
                      if (var6 > var12) {
                        var5 = var18;
                        var6 = var12;
                        var14++;
                        continue L2;
                      } else {
                        var14++;
                        continue L2;
                      }
                    } else {
                      var14++;
                      continue L2;
                    }
                  }
                }
              } else {
                break L1;
              }
            }
            L4: {
              if (param0) {
                break L4;
              } else {
                this.a(-44, -99, (anb) null);
                break L4;
              }
            }
            return (anb) (var5);
          } else {
            var16 = var15[var8];
            if (null != var16) {
              if (param3 != var16.q((byte) 110)) {
                var10 = -param2 + var16.d(false);
                var11 = -param1 + var16.g((byte) -103);
                var12 = ar.a(var10, (byte) 107, var11);
                if (var12 < var6) {
                  var6 = var12;
                  var5 = var16;
                  var8++;
                  continue L0;
                } else {
                  var8++;
                  continue L0;
                }
              } else {
                var8++;
                continue L0;
              }
            } else {
              var8++;
              continue L0;
            }
          }
        }
    }

    private final void a(anb[] param0, boolean param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = VoidHunters.field_G;
        try {
          L0: {
            var4_int = 0;
            L1: while (true) {
              if (var4_int >= param0.length) {
                L2: {
                  if (param1) {
                    break L2;
                  } else {
                    this.a(-39, 10, -81, -31, 28, -87, -120, (int[]) null, (byte) 68);
                    break L2;
                  }
                }
                break L0;
              } else {
                L3: {
                  if (param0[var4_int] != null) {
                    this.b(param2, (byte) 125, param0[var4_int]);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var4_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var4);

            stackIn_15_1 = new StringBuilder().append("pe.PC(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void c(int param0, byte param1) {
        L0: {
          this.field_t = (cq[]) ((Object) dt.a(wsb.field_e, param0, 15667, this.field_t));
          if (param1 == -90) {
            break L0;
          } else {
            this.a(false, (lbb) null, (byte) 94, (lta) null);
            break L0;
          }
        }
    }

    private final void a(int param0, int param1, int[] param2, byte param3, int param4, int param5, int param6) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        var18 = VoidHunters.field_G;
        try {
          L0: {
            var8_int = 0;
            var9 = 0;
            L1: while (true) {
              if (param2.length <= var9) {
                var9 = param4 - param6;
                var10 = -param5 + param1;
                if (param3 < -2) {
                  var11 = ecb.a(var10, (byte) -77, var9);
                  var12 = var8_int * fc.a(var11, (byte) 101) >> -1919788592;
                  var13 = var8_int * eu.a(var11, 65) >> 62329776;
                  var14 = 4;
                  var15 = -var13 / var14;
                  var16 = var12 / var14;
                  var17 = 320;
                  this.a(param0, var15, 50, 100, 30273, param4, var17, param1, var16);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                var10 = param2[var9];
                if ((var10 ^ -1) < (var8_int ^ -1)) {
                  var8_int = var10;
                  var9 += 2;
                  continue L1;
                } else {
                  var9 += 2;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var8);

            stackIn_13_1 = new StringBuilder().append("pe.JE(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(byte param0) {
        L0: {
          if (param0 >= 47) {
            break L0;
          } else {
            this.m(-1);
            break L0;
          }
        }
        L1: {
          if (-1 == (this.field_o ^ -1)) {
            this.field_o = 1 << fob.field_c;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (this.field_r == 0) {
            this.field_r = 1 << fob.field_c;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (null != this.field_k) {
            break L3;
          } else {
            this.field_k = new sg[field_w[0]];
            break L3;
          }
        }
        L4: {
          if (null != this.field_m) {
            break L4;
          } else {
            this.field_m = new nbb[field_w[1]];
            break L4;
          }
        }
        L5: {
          if (this.field_e == null) {
            this.field_e = new aib(field_w[2]);
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          if (this.field_g == null) {
            this.field_g = new mqb[field_w[3]];
            break L6;
          } else {
            break L6;
          }
        }
        L7: {
          if (null != this.field_p) {
            break L7;
          } else {
            this.field_p = new lua();
            break L7;
          }
        }
        L8: {
          if (this.field_p.a(false) == null) {
            L9: {
              if (null != this.field_b) {
                this.field_b.a((pe) (this), 0);
                break L9;
              } else {
                break L9;
              }
            }
            this.f(false);
            break L8;
          } else {
            this.f(false);
            break L8;
          }
        }
    }

    private final void a(int param0, vra param1, boa param2, sg param3) {
        int var5_int = 0;
        int[] var6 = null;
        ml var7 = null;
        ml var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var11 = VoidHunters.field_G;
        try {
          L0: {
            if (param0 == 16384) {
              L1: {
                var5_int = 0;
                var13 = param2.field_c;
                var12 = var13;
                var6 = var12;
                if (null == var6) {
                  break L1;
                } else {
                  if (-1 <= (var13.length ^ -1)) {
                    break L1;
                  } else {
                    var7 = qia.a(1, var13);
                    var8 = param3.field_k;
                    var9 = var8.j((byte) 57);
                    var10 = 0;
                    L2: while (true) {
                      if (var10 >= var9) {
                        break L1;
                      } else {
                        L3: {
                          if (!this.a(var8, param3, var7, var10, -17329, var7)) {
                            stackIn_10_0 = 0;
                            break L3;
                          } else {
                            stackIn_10_0 = 1;
                            break L3;
                          }
                        }
                        var5_int = stackIn_10_0;
                        if (var5_int != 0) {
                          break L1;
                        } else {
                          var10++;
                          continue L2;
                        }
                      }
                    }
                  }
                }
              }
              L4: {
                if (var5_int == 0) {
                  param3.a(-1, (byte) -119);
                  param3.a((byte) -127, (boa) null);
                  break L4;
                } else {
                  break L4;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var5);

            stackIn_20_1 = new StringBuilder().append("pe.VC(").append(param0).append(',');

            if (param1 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L5;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L5;
            }
          }
          L6: {
            stackIn_24_0 = (RuntimeException) ((Object) stackIn_21_0);

            stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');

            if (param2 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L6;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L6;
            }
          }
          L7: {
            stackIn_28_0 = (RuntimeException) ((Object) stackIn_25_0);

            stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');

            if (param3 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L7;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L7;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(boolean param0, lbb param1, byte param2, lta param3) {
        RuntimeException stackIn_90_0 = null;
        StringBuilder stackIn_90_1 = null;
        RuntimeException stackIn_91_0 = null;
        StringBuilder stackIn_91_1 = null;
        String stackIn_91_2 = null;
        RuntimeException stackIn_94_0 = null;
        StringBuilder stackIn_94_1 = null;
        RuntimeException stackIn_95_0 = null;
        StringBuilder stackIn_95_1 = null;
        String stackIn_95_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var13 = null;
        int var14_int = 0;
        crb[] var14 = null;
        crb[] var15_ref_crb__ = null;
        int var15 = 0;
        nbb var15_ref_nbb = null;
        int var16 = 0;
        int var17 = 0;
        crb var17_ref_crb = null;
        int var18 = 0;
        sg var18_ref_sg = null;
        int var19 = 0;
        sg[] var20 = null;
        int var21 = 0;
        sg var22 = null;
        int var23 = 0;
        crb[] var24 = null;
        sg[] var25 = null;
        int var26 = 0;
        nbb var27 = null;
        sg var28 = null;
        var23 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param1.e(8) != 5) {
                break L1;
              } else {
                var5_int = param1.f((byte) -102);
                var6 = lga.a((byte) -2, this.field_y);
                if (var6 < var5_int) {
                  L2: {
                    var7 = dm.a(this.field_y, (byte) -78);
                    var8 = var5_int + -var6;
                    if (var8 > var7) {
                      var8 = var7;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    var9 = -(this.field_o / var7 * var8) + this.field_o;
                    if (var9 < 0) {
                      var9 = 0;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    var10 = -(this.field_r / var7 * var8) + this.field_r;
                    if (-1 < (var10 ^ -1)) {
                      var10 = 0;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  var11 = var9 >> 2073660865;
                  var12 = var10 >> 119373345;
                  var13 = new int[]{-var11, var11, -var12, var12};
                  if (!param0) {
                    var26 = 0;
                    var14_int = var26;
                    L5: while (true) {
                      if (var26 >= this.field_m.length) {
                        var14 = this.field_e.c(0);
                        var24 = var14;
                        var15_ref_crb__ = var14;
                        var16 = 0;
                        L6: while (true) {
                          if (var16 >= var24.length) {
                            var15 = 0;
                            L7: while (true) {
                              if (this.field_k.length <= var15) {
                                var15 = 0;
                                var25 = this.field_k;
                                var17 = 0;
                                L8: while (true) {
                                  if (var25.length <= var17) {
                                    var16 = -1;
                                    var17 = 0;
                                    var18 = 0;
                                    L9: while (true) {
                                      if (var18 > var15) {
                                        L10: {
                                          if (-1 >= (var16 ^ -1)) {
                                            param1.b(false, var16);
                                            break L10;
                                          } else {
                                            break L10;
                                          }
                                        }
                                        if (var7 <= var8) {
                                          param1.b(false, -1);
                                          break L1;
                                        } else {
                                          break L1;
                                        }
                                      } else {
                                        var19 = 0;
                                        var20 = this.field_k;
                                        var21 = 0;
                                        L11: while (true) {
                                          if (var20.length <= var21) {
                                            L12: {
                                              if (var19 <= 0) {
                                                break L12;
                                              } else {
                                                var19 = 1;
                                                break L12;
                                              }
                                            }
                                            L13: {
                                              if (var19 <= var17) {
                                                if (var19 == var17) {
                                                  var16 = -1;
                                                  break L13;
                                                } else {
                                                  break L13;
                                                }
                                              } else {
                                                var17 = var19;
                                                var16 = var18;
                                                break L13;
                                              }
                                            }
                                            var18++;
                                            continue L9;
                                          } else {
                                            var22 = var20[var21];
                                            if (null != var22) {
                                              if (var18 == var22.q((byte) 105)) {
                                                if (var22.k((byte) -108) == null) {
                                                  var19++;
                                                  var21++;
                                                  continue L11;
                                                } else {
                                                  var21++;
                                                  continue L11;
                                                }
                                              } else {
                                                var21++;
                                                continue L11;
                                              }
                                            } else {
                                              var21++;
                                              continue L11;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    var18_ref_sg = var25[var17];
                                    var22 = var18_ref_sg;
                                    var22 = var18_ref_sg;
                                    if (null != var18_ref_sg) {
                                      L14: {
                                        if (var15 < var18_ref_sg.q((byte) 97)) {
                                          var15 = var18_ref_sg.q((byte) 103);
                                          break L14;
                                        } else {
                                          break L14;
                                        }
                                      }
                                      var17++;
                                      continue L8;
                                    } else {
                                      var17++;
                                      continue L8;
                                    }
                                  }
                                }
                              } else {
                                L15: {
                                  var28 = this.field_k[var15];
                                  var18_ref_sg = var28;
                                  var22 = var18_ref_sg;
                                  var18_ref_sg = var28;
                                  if (var28 != null) {
                                    if (this.a(true, var13, var28.field_q)) {
                                      var28.field_k.a(1000, (byte) 85);
                                      break L15;
                                    } else {
                                      break L15;
                                    }
                                  } else {
                                    break L15;
                                  }
                                }
                                var15++;
                                continue L7;
                              }
                            }
                          } else {
                            L16: {
                              var17_ref_crb = var24[var16];
                              if (null != var17_ref_crb) {
                                if (this.a(true, var13, var17_ref_crb.field_q)) {
                                  this.a(var17_ref_crb, true, false, false, 2);
                                  break L16;
                                } else {
                                  break L16;
                                }
                              } else {
                                break L16;
                              }
                            }
                            var16++;
                            continue L6;
                          }
                        }
                      } else {
                        var27 = this.field_m[var26];
                        if (null != var27) {
                          if (this.a(true, var13, var27.field_q)) {
                            var15_ref_nbb = this.c(var26, false);
                            this.a(var15_ref_nbb, true, false, false, 1);
                            var26++;
                            continue L5;
                          } else {
                            var26++;
                            continue L5;
                          }
                        } else {
                          var26++;
                          continue L5;
                        }
                      }
                    }
                  } else {
                    var14_int = -1 + param3.a(-var11, (byte) 123);
                    var15 = param3.a(var11, (byte) 126) + 1;
                    var16 = param3.b(true, -var12) - 1;
                    var17 = param3.b(true, var12) - -1;
                    kob.a((byte) 17, var15, var17, var16, var14_int);
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
            }
            L17: {
              if (param2 == -117) {
                break L17;
              } else {
                this.field_o = -34;
                break L17;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var5 = decompiledCaughtException;
            stackIn_90_0 = (RuntimeException) (var5);

            stackIn_90_1 = new StringBuilder().append("pe.AE(").append(param0).append(',');

            if (param1 == null) {
              stackIn_91_0 = (RuntimeException) ((Object) stackIn_90_0);
              stackIn_91_1 = (StringBuilder) ((Object) stackIn_90_1);
              stackIn_91_2 = "null";
              break L18;
            } else {
              stackIn_91_0 = (RuntimeException) ((Object) stackIn_90_0);
              stackIn_91_1 = (StringBuilder) ((Object) stackIn_90_1);
              stackIn_91_2 = "{...}";
              break L18;
            }
          }
          L19: {
            stackIn_94_0 = (RuntimeException) ((Object) stackIn_91_0);

            stackIn_94_1 = ((StringBuilder) (Object) stackIn_91_1).append(stackIn_91_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_95_0 = (RuntimeException) ((Object) stackIn_94_0);
              stackIn_95_1 = (StringBuilder) ((Object) stackIn_94_1);
              stackIn_95_2 = "null";
              break L19;
            } else {
              stackIn_95_0 = (RuntimeException) ((Object) stackIn_91_0);
              stackIn_95_1 = (StringBuilder) ((Object) stackIn_94_1);
              stackIn_95_2 = "{...}";
              break L19;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_95_0), stackIn_95_2 + ')');
        }
    }

    private final void a(nwa param0, int param1, tfa[] param2, crb[] param3) {
        tfa dupTemp$0 = null;
        tfa dupTemp$1 = null;
        tfa dupTemp$2 = null;
        RuntimeException stackIn_96_0 = null;
        StringBuilder stackIn_96_1 = null;
        RuntimeException stackIn_97_0 = null;
        StringBuilder stackIn_97_1 = null;
        String stackIn_97_2 = null;
        RuntimeException stackIn_100_0 = null;
        StringBuilder stackIn_100_1 = null;
        RuntimeException stackIn_101_0 = null;
        StringBuilder stackIn_101_1 = null;
        String stackIn_101_2 = null;
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        RuntimeException stackIn_105_0 = null;
        StringBuilder stackIn_105_1 = null;
        String stackIn_105_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        crb var7 = null;
        int var7_int = 0;
        it var8_ref_it = null;
        int var8 = 0;
        ml[] var9_ref_ml__ = null;
        int var9 = 0;
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        sg var16 = null;
        int[] var17 = null;
        nbb var18 = null;
        nbb var19 = null;
        mqb[] var20 = null;
        mqb var21 = null;
        crb[] var22 = null;
        crb var23 = null;
        it var24 = null;
        int[] var25 = null;
        var13 = VoidHunters.field_G;
        try {
          L0: {
            var5_int = 0;
            L1: while (true) {
              if (var5_int >= this.field_k.length) {
                var5_int = 0;
                L2: while (true) {
                  if (var5_int >= this.field_m.length) {
                    var20 = this.field_g;
                    var6 = 0;
                    L3: while (true) {
                      if (var6 >= var20.length) {
                        L4: {
                          if (param1 == 7559) {
                            break L4;
                          } else {
                            this.field_v = true;
                            break L4;
                          }
                        }
                        var22 = param3;
                        var15 = 0;
                        var6 = var15;
                        L5: while (true) {
                          if (var22.length <= var15) {
                            L6: {
                              if (null == this.field_j) {
                                break L6;
                              } else {
                                var5_int = 0;
                                L7: while (true) {
                                  if (this.field_j.length <= var5_int) {
                                    break L6;
                                  } else {
                                    var24 = this.field_j[var5_int];
                                    if ((var24.field_i ^ -1) >= -1) {
                                      this.b((byte) 41, var5_int);
                                      var5_int--;
                                      var5_int++;
                                      continue L7;
                                    } else {
                                      var5_int++;
                                      continue L7;
                                    }
                                  }
                                }
                              }
                            }
                            break L0;
                          } else {
                            var23 = var22[var15];
                            var7 = var23;
                            if (var7 != null) {
                              L8: {
                                if (var23.h(-116)) {
                                  this.a(2, (byte) 72, (anb) (var23));
                                  break L8;
                                } else {
                                  break L8;
                                }
                              }
                              var15++;
                              continue L5;
                            } else {
                              var15++;
                              continue L5;
                            }
                          }
                        }
                      } else {
                        var21 = var20[var6];
                        if (null != var21) {
                          L9: {
                            if (var21.h(-122)) {
                              this.a(3, (byte) 90, (anb) (var21));
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          var6++;
                          continue L3;
                        } else {
                          var6++;
                          continue L3;
                        }
                      }
                    }
                  } else {
                    var18 = this.field_m[var5_int];
                    var19 = var18;
                    var19 = var18;
                    if (var18 != null) {
                      L10: {
                        if (var18.field_u) {
                          L11: {
                            var19 = this.c(var5_int, false);
                            if (var19.h(-128)) {
                              this.a(1, (byte) 66, (anb) (var19));
                              break L11;
                            } else {
                              var19.a(107, (pe) (this));
                              break L11;
                            }
                          }
                          var19.field_u = false;
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                      var5_int++;
                      continue L2;
                    } else {
                      var5_int++;
                      continue L2;
                    }
                  }
                }
              } else {
                var16 = this.field_k[var5_int];
                if (var16 != null) {
                  L12: {
                    if (var16.h(-120)) {
                      L13: {
                        if (var16.s(param1 ^ 7662)) {
                          var8_ref_it = new it();
                          var8_ref_it.field_d = var16.d(false);
                          var8_ref_it.field_e = var16.g((byte) 124);
                          var8_ref_it.field_k = var16.o((byte) -117);
                          var8_ref_it.field_l = var16.q((byte) 93);
                          this.a(var8_ref_it, (byte) 107);
                          break L13;
                        } else {
                          break L13;
                        }
                      }
                      L14: {
                        var7_int = 1;
                        var8 = var16.o((byte) -117);
                        if (0 > var8) {
                          break L14;
                        } else {
                          if (var8 < param2.length) {
                            L15: {
                              if (mra.field_o == 1) {
                                var9_ref_ml__ = var16.field_k.a(0, vg.field_o, (ml[]) null);
                                var7_int = 0;
                                this.a(var16, true, true, true, 0);
                                if (null == var9_ref_ml__) {
                                  break L15;
                                } else {
                                  if (var9_ref_ml__.length > 0) {
                                    var10 = new int[var9_ref_ml__.length];
                                    var11 = 0;
                                    L16: while (true) {
                                      if (var9_ref_ml__.length <= var11) {
                                        param2[var8].field_k = var10;
                                        break L15;
                                      } else {
                                        var10[var11] = var9_ref_ml__[var11].field_j;
                                        var11++;
                                        continue L16;
                                      }
                                    }
                                  } else {
                                    break L15;
                                  }
                                }
                              } else {
                                break L15;
                              }
                            }
                            L17: {
                              dupTemp$0 = param2[var8];
                              dupTemp$0.field_l = dupTemp$0.field_l + 1;
                              var9 = -1;
                              var25 = var16.p(-26448);
                              var17 = var25;
                              var10 = var17;
                              if (null != var10) {
                                var14 = 0;
                                var11 = var14;
                                L18: while (true) {
                                  if (var14 >= var25.length) {
                                    break L17;
                                  } else {
                                    var12 = var25[var14];
                                    if (-1 >= (var12 ^ -1)) {
                                      L19: {
                                        if (param2.length > var12) {
                                          if (var14 != var25.length + -1) {
                                            dupTemp$1 = param2[var12];
                                            dupTemp$1.field_n = dupTemp$1.field_n + 1;
                                            break L19;
                                          } else {
                                            var9 = var12;
                                            dupTemp$2 = param2[var12];
                                            dupTemp$2.field_c = dupTemp$2.field_c + 1;
                                            break L19;
                                          }
                                        } else {
                                          break L19;
                                        }
                                      }
                                      var14++;
                                      continue L18;
                                    } else {
                                      var14++;
                                      continue L18;
                                    }
                                  }
                                }
                              } else {
                                break L17;
                              }
                            }
                            if (var9 == -1) {
                              param0.a(new rha(3, var8, var8), true);
                              break L14;
                            } else {
                              param0.a(new rha(0, var9, var8), true);
                              break L14;
                            }
                          } else {
                            break L14;
                          }
                        }
                      }
                      if (var7_int != 0) {
                        if (var16.g(false)) {
                          this.a(var16, true, false, false, 0);
                          break L12;
                        } else {
                          this.a(0, (byte) 117, (anb) (var16));
                          break L12;
                        }
                      } else {
                        var5_int++;
                        continue L1;
                      }
                    } else {
                      break L12;
                    }
                  }
                  var5_int++;
                  continue L1;
                } else {
                  var5_int++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L20: {
            var5 = decompiledCaughtException;
            stackIn_96_0 = (RuntimeException) (var5);

            stackIn_96_1 = new StringBuilder().append("pe.BF(");

            if (param0 == null) {
              stackIn_97_0 = (RuntimeException) ((Object) stackIn_96_0);
              stackIn_97_1 = (StringBuilder) ((Object) stackIn_96_1);
              stackIn_97_2 = "null";
              break L20;
            } else {
              stackIn_97_0 = (RuntimeException) ((Object) stackIn_96_0);
              stackIn_97_1 = (StringBuilder) ((Object) stackIn_96_1);
              stackIn_97_2 = "{...}";
              break L20;
            }
          }
          L21: {
            stackIn_100_0 = (RuntimeException) ((Object) stackIn_97_0);

            stackIn_100_1 = ((StringBuilder) (Object) stackIn_97_1).append(stackIn_97_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_101_0 = (RuntimeException) ((Object) stackIn_100_0);
              stackIn_101_1 = (StringBuilder) ((Object) stackIn_100_1);
              stackIn_101_2 = "null";
              break L21;
            } else {
              stackIn_101_0 = (RuntimeException) ((Object) stackIn_97_0);
              stackIn_101_1 = (StringBuilder) ((Object) stackIn_100_1);
              stackIn_101_2 = "{...}";
              break L21;
            }
          }
          L22: {
            stackIn_104_0 = (RuntimeException) ((Object) stackIn_101_0);

            stackIn_104_1 = ((StringBuilder) (Object) stackIn_101_1).append(stackIn_101_2).append(',');

            if (param3 == null) {
              stackIn_105_0 = (RuntimeException) ((Object) stackIn_104_0);
              stackIn_105_1 = (StringBuilder) ((Object) stackIn_104_1);
              stackIn_105_2 = "null";
              break L22;
            } else {
              stackIn_105_0 = (RuntimeException) ((Object) stackIn_101_0);
              stackIn_105_1 = (StringBuilder) ((Object) stackIn_104_1);
              stackIn_105_2 = "{...}";
              break L22;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_105_0), stackIn_105_2 + ')');
        }
    }

    private final void a(int param0, int param1, boolean param2, int param3, int param4, sg param5) {
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_60_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        rca var13 = null;
        int var13_int = 0;
        rdb var14_ref_rdb = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        crb[] var16_ref_crb__ = null;
        int var17 = 0;
        crb[] var17_ref_crb__ = null;
        sg var18_ref_sg = null;
        int var18 = 0;
        int var19_int = 0;
        crb var19 = null;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        sg[] var24 = null;
        rca var25 = null;
        var23 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var7_int = 0;
              var8 = 0;
              var9 = 0;
              var10 = this.d(false);
              if (!qab.a(param0 + 200051, var10)) {
                L2: {
                  param3 = param1;
                  var11 = this.field_o;
                  var12 = this.field_r;
                  if (this.field_y != 13) {
                    break L2;
                  } else {
                    var11 = var11 / 2;
                    var12 = var12 / 2;
                    break L2;
                  }
                }
                var13 = this.a(0, var12, 0, 0, param3, var11);
                var8 = var13.field_b;
                var7_int = var13.field_c;
                param5.a(hob.a(vg.field_o, 8192, 117), -29);
                break L1;
              } else {
                var11 = 0;
                var12 = 0;
                var13_int = 0;
                var14_ref_rdb = (rdb) ((Object) this.field_n.d(param0 + 200000));
                L3: while (true) {
                  if (null == var14_ref_rdb) {
                    L4: {
                      if (var9 != 0) {
                        break L4;
                      } else {
                        if (-1 != (var13_int ^ -1)) {
                          var12 = var12 / var13_int;
                          var11 = var11 / var13_int;
                          var25 = this.a(var12, this.field_r, 0, var11, param3, this.field_o / 4);
                          var8 = var25.field_b;
                          var7_int = var25.field_c;
                          break L4;
                        } else {
                          L5: {
                            var14 = this.field_o / param4;
                            var15 = this.field_r / param4;
                            if (0 > param3) {
                              break L5;
                            } else {
                              if (2 <= param3) {
                                break L5;
                              } else {
                                var16 = -200000 + param3 * 400000;
                                var17 = this.field_o * 2 / 3 * param3;
                                var7_int = var17 + -this.field_o / 3;
                                var8 = this.field_r / 3 + -(param3 * (this.field_r * 2 / 3));
                                if ((this.field_y ^ -1) != 0) {
                                  var8 = var8 + (-var16 + 20000 * param1);
                                  break L4;
                                } else {
                                  break L4;
                                }
                              }
                            }
                          }
                          var8 = var15 / 2 + -this.field_r / 2 - -(var15 * param1);
                          var7_int = -this.field_o / 2 + (var14 * param1 + var14 / 2);
                          break L4;
                        }
                      }
                    }
                    if (var7_int <= 0) {
                      break L1;
                    } else {
                      param5.a(4096, -122);
                      break L1;
                    }
                  } else {
                    L6: {
                      if ((param3 ^ -1) != (var14_ref_rdb.d(-92) ^ -1)) {
                        break L6;
                      } else {
                        var13_int++;
                        var11 = var11 + var14_ref_rdb.a(true);
                        var12 = var12 + var14_ref_rdb.a(94);
                        var15 = 1;
                        var24 = this.field_k;
                        var17 = 0;
                        L7: while (true) {
                          L8: {
                            if (var24.length <= var17) {
                              break L8;
                            } else {
                              L9: {
                                var18_ref_sg = var24[var17];
                                if (var18_ref_sg != null) {
                                  L10: {
                                    var19_int = var14_ref_rdb.a(true) - var18_ref_sg.field_d;
                                    var20 = var14_ref_rdb.a(74) + -var18_ref_sg.field_e;
                                    var21 = ar.a(var19_int, (byte) 126, var20);
                                    var22 = var18_ref_sg.b(true) - -51200;
                                    if (param3 == var18_ref_sg.q((byte) 93)) {
                                      break L10;
                                    } else {
                                      if (param2) {
                                        break L10;
                                      } else {
                                        var22 = var22 + (ema.field_o[7].j(121) << -945052637);
                                        break L10;
                                      }
                                    }
                                  }
                                  if (var21 < var22) {
                                    var15 = 0;
                                    break L8;
                                  } else {
                                    break L9;
                                  }
                                } else {
                                  break L9;
                                }
                              }
                              var17++;
                              continue L7;
                            }
                          }
                          if (var15 != 0) {
                            var16_ref_crb__ = this.field_e.c(0);
                            var17_ref_crb__ = var16_ref_crb__;
                            var18 = 0;
                            L11: while (true) {
                              L12: {
                                if (var18 >= var17_ref_crb__.length) {
                                  break L12;
                                } else {
                                  L13: {
                                    var19 = var17_ref_crb__[var18];
                                    if (null == var19) {
                                      break L13;
                                    } else {
                                      var20 = var14_ref_rdb.a(true) + -var19.field_d;
                                      var21 = var14_ref_rdb.a(param0 ^ -200015) + -var19.field_e;
                                      var22 = ar.a(var20, (byte) 125, var21);
                                      if (51200 + var19.field_k.i((byte) -112).field_l > var22) {
                                        var15 = 0;
                                        break L12;
                                      } else {
                                        break L13;
                                      }
                                    }
                                  }
                                  var18++;
                                  continue L11;
                                }
                              }
                              if (var15 == 0) {
                                break L6;
                              } else {
                                var7_int = var14_ref_rdb.a(true);
                                var9 = 1;
                                var8 = var14_ref_rdb.a(102);
                                break L6;
                              }
                            }
                          } else {
                            L14: {
                              if (var15 == 0) {
                                break L14;
                              } else {
                                var7_int = var14_ref_rdb.a(true);
                                var9 = 1;
                                var8 = var14_ref_rdb.a(102);
                                break L14;
                              }
                            }
                            var14_ref_rdb = (rdb) ((Object) this.field_n.a((byte) 11));
                            continue L3;
                          }
                        }
                      }
                    }
                    var14_ref_rdb = (rdb) ((Object) this.field_n.a((byte) 11));
                    continue L3;
                  }
                }
              }
            }
            param5.a(var7_int, var8, (byte) 65);
            param5.field_f = 0;
            param5.field_t = 0;
            param5.field_o = 0;
            param5.field_h = 0;
            param5.field_p = 0;
            param5.g(param1, param0 + 200125);
            if (param0 == -200000) {
              param5.h(17704, param3);
              this.a(param5, (byte) 98);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var7 = decompiledCaughtException;
            stackIn_59_0 = (RuntimeException) (var7);

            stackIn_59_1 = new StringBuilder().append("pe.ID(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_60_0 = (RuntimeException) ((Object) stackIn_59_0);
              stackIn_60_1 = (StringBuilder) ((Object) stackIn_59_1);
              stackIn_60_2 = "null";
              break L15;
            } else {
              stackIn_60_0 = (RuntimeException) ((Object) stackIn_59_0);
              stackIn_60_1 = (StringBuilder) ((Object) stackIn_59_1);
              stackIn_60_2 = "{...}";
              break L15;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_60_0), stackIn_60_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final void a(faa param0, byte param1) {
        int stackIn_5_0 = 0;
        faa stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        faa stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        int stackIn_21_0 = 0;
        faa stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        faa stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        int stackIn_30_2 = 0;
        int stackIn_37_0 = 0;
        faa stackIn_45_0 = null;
        int stackIn_45_1 = 0;
        faa stackIn_46_0 = null;
        int stackIn_46_1 = 0;
        int stackIn_46_2 = 0;
        faa stackIn_54_0 = null;
        int stackIn_54_1 = 0;
        faa stackIn_55_0 = null;
        int stackIn_55_1 = 0;
        int stackIn_55_2 = 0;
        int stackIn_63_0 = 0;
        faa stackIn_69_0 = null;
        int stackIn_69_1 = 0;
        faa stackIn_70_0 = null;
        int stackIn_70_1 = 0;
        int stackIn_70_2 = 0;
        int stackIn_79_0 = 0;
        faa stackIn_85_0 = null;
        int stackIn_85_1 = 0;
        faa stackIn_86_0 = null;
        int stackIn_86_1 = 0;
        int stackIn_86_2 = 0;
        int stackIn_94_0 = 0;
        int stackIn_95_0 = 0;
        int stackIn_95_1 = 0;
        faa stackIn_98_0 = null;
        int stackIn_98_1 = 0;
        faa stackIn_99_0 = null;
        int stackIn_99_1 = 0;
        int stackIn_99_2 = 0;
        int stackIn_105_0 = 0;
        faa stackIn_113_0 = null;
        int stackIn_113_1 = 0;
        faa stackIn_114_0 = null;
        int stackIn_114_1 = 0;
        int stackIn_114_2 = 0;
        int stackIn_123_0 = 0;
        faa stackIn_131_0 = null;
        int stackIn_131_1 = 0;
        faa stackIn_132_0 = null;
        int stackIn_132_1 = 0;
        int stackIn_132_2 = 0;
        faa stackIn_140_0 = null;
        int stackIn_140_1 = 0;
        faa stackIn_141_0 = null;
        int stackIn_141_1 = 0;
        int stackIn_141_2 = 0;
        faa stackIn_146_0 = null;
        int stackIn_146_1 = 0;
        faa stackIn_147_0 = null;
        int stackIn_147_1 = 0;
        int stackIn_147_2 = 0;
        int stackIn_155_0 = 0;
        faa stackIn_163_0 = null;
        int stackIn_163_1 = 0;
        faa stackIn_164_0 = null;
        int stackIn_164_1 = 0;
        int stackIn_164_2 = 0;
        faa stackIn_172_0 = null;
        int stackIn_172_1 = 0;
        faa stackIn_173_0 = null;
        int stackIn_173_1 = 0;
        int stackIn_173_2 = 0;
        RuntimeException stackIn_181_0 = null;
        StringBuilder stackIn_181_1 = null;
        RuntimeException stackIn_182_0 = null;
        StringBuilder stackIn_182_1 = null;
        String stackIn_182_2 = null;
        RuntimeException decompiledCaughtException = null;
        faa var3 = null;
        RuntimeException var3_ref = null;
        sg[] var4 = null;
        tv[] var4_array = null;
        nbb[] var4_array2 = null;
        mqb[] var4_array3 = null;
        cq[] var4_array4 = null;
        rba[] var4_array5 = null;
        it[] var4_array6 = null;
        int var5 = 0;
        tv[] var6 = null;
        nbb[] var6_array = null;
        int var7 = 0;
        sg var8 = null;
        tv var8_ref = null;
        nbb var8_ref2 = null;
        mqb var8_ref3 = null;
        cq var8_ref4 = null;
        rba var8_ref5 = null;
        it var8_ref6 = null;
        int var9 = 0;
        sg[] var10 = null;
        faa var11 = null;
        sg[] var12 = null;
        tv[] var13 = null;
        faa var14 = null;
        tv[] var15 = null;
        tv var16 = null;
        nbb[] var17 = null;
        faa var18 = null;
        nbb[] var19 = null;
        tv[] var20 = null;
        faa var21 = null;
        mqb[] var22 = null;
        faa var23 = null;
        mqb[] var24 = null;
        cq[] var25 = null;
        faa var26 = null;
        cq[] var27 = null;
        rba[] var28 = null;
        faa var29 = null;
        rba[] var30 = null;
        it[] var31 = null;
        faa var32 = null;
        it[] var33 = null;
        var9 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var11 = param0;
              var3 = var11;
              var10 = this.field_k;
              var4 = var10;
              if (null == var4) {
                stackIn_5_0 = 0;
                break L1;
              } else {
                stackIn_5_0 = var10.length;
                break L1;
              }
            }
            L2: {
              var5 = stackIn_5_0;
              var11.a(-632, var5, 8);
              if (0 != var5) {
                var12 = var10;
                var7 = 0;
                L3: while (true) {
                  if (var12.length <= var7) {
                    break L2;
                  } else {
                    L4: {
                      var8 = var12[var7];
                      stackIn_13_0 = (faa) (var3);

                      stackIn_13_1 = 110;

                      if (null == var8) {
                        stackIn_14_0 = (faa) ((Object) stackIn_13_0);
                        stackIn_14_1 = stackIn_13_1;
                        stackIn_14_2 = 0;
                        break L4;
                      } else {
                        stackIn_14_0 = (faa) ((Object) stackIn_13_0);
                        stackIn_14_1 = stackIn_13_1;
                        stackIn_14_2 = 1;
                        break L4;
                      }
                    }
                    if (vq.a(stackIn_14_0, stackIn_14_1, stackIn_14_2 != 0)) {
                      ((utb) ((Object) var8)).a(var11, (byte) -105);
                      var7++;
                      continue L3;
                    } else {
                      var7++;
                      continue L3;
                    }
                  }
                }
              } else {
                break L2;
              }
            }
            L5: {
              var14 = param0;
              var3 = var14;
              var13 = hob.a(this.field_x, 210377952);
              var4_array = var13;
              if (null == var4_array) {
                stackIn_21_0 = 0;
                break L5;
              } else {
                stackIn_21_0 = var13.length;
                break L5;
              }
            }
            L6: {
              var5 = stackIn_21_0;
              var14.a(-632, var5, 10);
              if (var5 != 0) {
                var15 = var4_array;
                var6 = var15;
                var7 = 0;
                L7: while (true) {
                  if (var15.length <= var7) {
                    break L6;
                  } else {
                    L8: {
                      var16 = var15[var7];
                      var8_ref = var16;
                      var8_ref = var16;
                      var8_ref = var16;
                      stackIn_29_0 = (faa) (var3);

                      stackIn_29_1 = -69;

                      if (var16 == null) {
                        stackIn_30_0 = (faa) ((Object) stackIn_29_0);
                        stackIn_30_1 = stackIn_29_1;
                        stackIn_30_2 = 0;
                        break L8;
                      } else {
                        stackIn_30_0 = (faa) ((Object) stackIn_29_0);
                        stackIn_30_1 = stackIn_29_1;
                        stackIn_30_2 = 1;
                        break L8;
                      }
                    }
                    if (vq.a(stackIn_30_0, stackIn_30_1, stackIn_30_2 != 0)) {
                      stb.a(2, 1, var14, var16);
                      var7++;
                      continue L7;
                    } else {
                      var7++;
                      continue L7;
                    }
                  }
                }
              } else {
                break L6;
              }
            }
            L9: {
              var18 = param0;
              var3 = var18;
              var17 = this.field_m;
              var4_array2 = var17;
              if (var4_array2 == null) {
                stackIn_37_0 = 0;
                break L9;
              } else {
                stackIn_37_0 = var17.length;
                break L9;
              }
            }
            L10: {
              var5 = stackIn_37_0;
              var18.a(-632, var5, 10);
              if (var5 != 0) {
                var19 = var4_array2;
                var6_array = var19;
                var7 = 0;
                L11: while (true) {
                  if (var7 >= var19.length) {
                    break L10;
                  } else {
                    L12: {
                      var8_ref2 = var19[var7];
                      stackIn_45_0 = (faa) (var3);

                      stackIn_45_1 = 101;

                      if (var8_ref2 == null) {
                        stackIn_46_0 = (faa) ((Object) stackIn_45_0);
                        stackIn_46_1 = stackIn_45_1;
                        stackIn_46_2 = 0;
                        break L12;
                      } else {
                        stackIn_46_0 = (faa) ((Object) stackIn_45_0);
                        stackIn_46_1 = stackIn_45_1;
                        stackIn_46_2 = 1;
                        break L12;
                      }
                    }
                    L13: {
                      if (vq.a(stackIn_46_0, stackIn_46_1, stackIn_46_2 != 0)) {
                        ((utb) ((Object) var8_ref2)).a(var18, (byte) -127);
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    var7++;
                    continue L11;
                  }
                }
              } else {
                break L10;
              }
            }
            L14: {
              stackIn_54_0 = (faa) (param0);

              stackIn_54_1 = 54;

              if (null == this.field_e) {
                stackIn_55_0 = (faa) ((Object) stackIn_54_0);
                stackIn_55_1 = stackIn_54_1;
                stackIn_55_2 = 0;
                break L14;
              } else {
                stackIn_55_0 = (faa) ((Object) stackIn_54_0);
                stackIn_55_1 = stackIn_54_1;
                stackIn_55_2 = 1;
                break L14;
              }
            }
            L15: {
              if (vq.a(stackIn_55_0, stackIn_55_1, stackIn_55_2 != 0)) {
                this.field_e.a(param0, (byte) -92);
                break L15;
              } else {
                break L15;
              }
            }
            L16: {
              var21 = param0;
              var3 = var21;
              var20 = hob.a(this.field_n, 210377952);
              var4_array = var20;
              if (null == var4_array) {
                stackIn_63_0 = 0;
                break L16;
              } else {
                stackIn_63_0 = var20.length;
                break L16;
              }
            }
            L17: {
              var5 = stackIn_63_0;
              var21.a(-632, var5, 6);
              if (-1 == (var5 ^ -1)) {
                break L17;
              } else {
                var6 = var20;
                var7 = 0;
                L18: while (true) {
                  if (var6.length <= var7) {
                    break L17;
                  } else {
                    L19: {
                      var8_ref = var6[var7];
                      stackIn_69_0 = (faa) (var3);

                      stackIn_69_1 = 66;

                      if (var8_ref == null) {
                        stackIn_70_0 = (faa) ((Object) stackIn_69_0);
                        stackIn_70_1 = stackIn_69_1;
                        stackIn_70_2 = 0;
                        break L19;
                      } else {
                        stackIn_70_0 = (faa) ((Object) stackIn_69_0);
                        stackIn_70_1 = stackIn_69_1;
                        stackIn_70_2 = 1;
                        break L19;
                      }
                    }
                    L20: {
                      if (vq.a(stackIn_70_0, stackIn_70_1, stackIn_70_2 != 0)) {
                        stb.a(2, 1, var3, var8_ref);
                        break L20;
                      } else {
                        break L20;
                      }
                    }
                    var7++;
                    continue L18;
                  }
                }
              }
            }
            L21: {
              var23 = param0;
              var3 = var23;
              var22 = this.field_g;
              var4_array3 = var22;
              if (var4_array3 == null) {
                stackIn_79_0 = 0;
                break L21;
              } else {
                stackIn_79_0 = var22.length;
                break L21;
              }
            }
            L22: {
              var5 = stackIn_79_0;
              var23.a(-632, var5, 8);
              if (0 == var5) {
                break L22;
              } else {
                var24 = var22;
                var7 = 0;
                L23: while (true) {
                  if (var7 >= var24.length) {
                    break L22;
                  } else {
                    L24: {
                      var8_ref3 = var24[var7];
                      stackIn_85_0 = (faa) (var3);

                      stackIn_85_1 = 74;

                      if (var8_ref3 == null) {
                        stackIn_86_0 = (faa) ((Object) stackIn_85_0);
                        stackIn_86_1 = stackIn_85_1;
                        stackIn_86_2 = 0;
                        break L24;
                      } else {
                        stackIn_86_0 = (faa) ((Object) stackIn_85_0);
                        stackIn_86_1 = stackIn_85_1;
                        stackIn_86_2 = 1;
                        break L24;
                      }
                    }
                    L25: {
                      if (vq.a(stackIn_86_0, stackIn_86_1, stackIn_86_2 != 0)) {
                        ((utb) ((Object) var8_ref3)).a(var23, (byte) -98);
                        break L25;
                      } else {
                        break L25;
                      }
                    }
                    var7++;
                    continue L23;
                  }
                }
              }
            }
            L26: {
              stackIn_94_0 = 4;

              if (this.field_l == null) {
                stackIn_95_0 = stackIn_94_0;
                stackIn_95_1 = 0;
                break L26;
              } else {
                stackIn_95_0 = stackIn_94_0;
                stackIn_95_1 = this.field_l.length;
                break L26;
              }
            }
            L27: {
              pgb.a(stackIn_95_0, stackIn_95_1, -114, param0, this.field_l);
              vq.a(param0, 56, this.field_v);
              param0.a(-632, this.field_y, 32);
              vq.a(param0, 39, this.field_i);
              stackIn_98_0 = (faa) (param0);

              stackIn_98_1 = 122;

              if (null == this.field_f) {
                stackIn_99_0 = (faa) ((Object) stackIn_98_0);
                stackIn_99_1 = stackIn_98_1;
                stackIn_99_2 = 0;
                break L27;
              } else {
                stackIn_99_0 = (faa) ((Object) stackIn_98_0);
                stackIn_99_1 = stackIn_98_1;
                stackIn_99_2 = 1;
                break L27;
              }
            }
            L28: {
              if (!vq.a(stackIn_99_0, stackIn_99_1, stackIn_99_2 != 0)) {
                break L28;
              } else {
                this.field_f.b(param0, -123);
                break L28;
              }
            }
            L29: {
              var26 = param0;
              var3 = var26;
              var25 = this.field_t;
              var4_array4 = var25;
              if (var4_array4 != null) {
                stackIn_105_0 = var25.length;
                break L29;
              } else {
                stackIn_105_0 = 0;
                break L29;
              }
            }
            L30: {
              var5 = stackIn_105_0;
              var26.a(-632, var5, 8);
              if (0 != var5) {
                var27 = var25;
                var7 = 0;
                L31: while (true) {
                  if (var7 >= var27.length) {
                    break L30;
                  } else {
                    L32: {
                      var8_ref4 = var27[var7];
                      stackIn_113_0 = (faa) (var3);

                      stackIn_113_1 = 47;

                      if (null == var8_ref4) {
                        stackIn_114_0 = (faa) ((Object) stackIn_113_0);
                        stackIn_114_1 = stackIn_113_1;
                        stackIn_114_2 = 0;
                        break L32;
                      } else {
                        stackIn_114_0 = (faa) ((Object) stackIn_113_0);
                        stackIn_114_1 = stackIn_113_1;
                        stackIn_114_2 = 1;
                        break L32;
                      }
                    }
                    L33: {
                      if (vq.a(stackIn_114_0, stackIn_114_1, stackIn_114_2 != 0)) {
                        stb.a(2, 1, var26, var8_ref4);
                        break L33;
                      } else {
                        break L33;
                      }
                    }
                    var7++;
                    continue L31;
                  }
                }
              } else {
                break L30;
              }
            }
            L34: {
              var29 = param0;
              var3 = var29;
              var28 = this.field_a;
              var4_array5 = var28;
              if (null != var4_array5) {
                stackIn_123_0 = var28.length;
                break L34;
              } else {
                stackIn_123_0 = 0;
                break L34;
              }
            }
            L35: {
              var5 = stackIn_123_0;
              var29.a(-632, var5, 4);
              if (var5 != 0) {
                var30 = var28;
                var7 = 0;
                L36: while (true) {
                  if (var30.length <= var7) {
                    break L35;
                  } else {
                    L37: {
                      var8_ref5 = var30[var7];
                      stackIn_131_0 = (faa) (var3);

                      stackIn_131_1 = 89;

                      if (null == var8_ref5) {
                        stackIn_132_0 = (faa) ((Object) stackIn_131_0);
                        stackIn_132_1 = stackIn_131_1;
                        stackIn_132_2 = 0;
                        break L37;
                      } else {
                        stackIn_132_0 = (faa) ((Object) stackIn_131_0);
                        stackIn_132_1 = stackIn_131_1;
                        stackIn_132_2 = 1;
                        break L37;
                      }
                    }
                    L38: {
                      if (vq.a(stackIn_132_0, stackIn_132_1, stackIn_132_2 != 0)) {
                        stb.a(2, 1, var29, var8_ref5);
                        break L38;
                      } else {
                        break L38;
                      }
                    }
                    var7++;
                    continue L36;
                  }
                }
              } else {
                break L35;
              }
            }
            L39: {
              stackIn_140_0 = (faa) (param0);

              stackIn_140_1 = -94;

              if (null == this.field_p) {
                stackIn_141_0 = (faa) ((Object) stackIn_140_0);
                stackIn_141_1 = stackIn_140_1;
                stackIn_141_2 = 0;
                break L39;
              } else {
                stackIn_141_0 = (faa) ((Object) stackIn_140_0);
                stackIn_141_1 = stackIn_140_1;
                stackIn_141_2 = 1;
                break L39;
              }
            }
            L40: {
              if (!vq.a(stackIn_141_0, stackIn_141_1, stackIn_141_2 != 0)) {
                break L40;
              } else {
                this.field_p.b(param0, -117);
                break L40;
              }
            }
            L41: {
              param0.a(-632, this.field_o, 28);
              param0.a(-632, this.field_r, 28);
              stackIn_146_0 = (faa) (param0);

              stackIn_146_1 = 109;

              if (null == this.field_u) {
                stackIn_147_0 = (faa) ((Object) stackIn_146_0);
                stackIn_147_1 = stackIn_146_1;
                stackIn_147_2 = 0;
                break L41;
              } else {
                stackIn_147_0 = (faa) ((Object) stackIn_146_0);
                stackIn_147_1 = stackIn_146_1;
                stackIn_147_2 = 1;
                break L41;
              }
            }
            L42: {
              if (!vq.a(stackIn_147_0, stackIn_147_1, stackIn_147_2 != 0)) {
                break L42;
              } else {
                this.field_u.b(param0, -125);
                break L42;
              }
            }
            L43: {
              if (param1 <= -91) {
                break L43;
              } else {
                field_d = (String) null;
                break L43;
              }
            }
            L44: {
              var32 = param0;
              var3 = var32;
              var31 = this.field_j;
              var4_array6 = var31;
              if (null == var4_array6) {
                stackIn_155_0 = 0;
                break L44;
              } else {
                stackIn_155_0 = var31.length;
                break L44;
              }
            }
            L45: {
              var5 = stackIn_155_0;
              var32.a(-632, var5, 4);
              if (var5 != 0) {
                var33 = var31;
                var7 = 0;
                L46: while (true) {
                  if (var33.length <= var7) {
                    break L45;
                  } else {
                    L47: {
                      var8_ref6 = var33[var7];
                      stackIn_163_0 = (faa) (var3);

                      stackIn_163_1 = -59;

                      if (var8_ref6 == null) {
                        stackIn_164_0 = (faa) ((Object) stackIn_163_0);
                        stackIn_164_1 = stackIn_163_1;
                        stackIn_164_2 = 0;
                        break L47;
                      } else {
                        stackIn_164_0 = (faa) ((Object) stackIn_163_0);
                        stackIn_164_1 = stackIn_163_1;
                        stackIn_164_2 = 1;
                        break L47;
                      }
                    }
                    L48: {
                      if (vq.a(stackIn_164_0, stackIn_164_1, stackIn_164_2 != 0)) {
                        stb.a(2, 1, var32, var8_ref6);
                        break L48;
                      } else {
                        break L48;
                      }
                    }
                    var7++;
                    continue L46;
                  }
                }
              } else {
                break L45;
              }
            }
            L49: {
              stackIn_172_0 = (faa) (param0);

              stackIn_172_1 = 38;

              if (null == this.field_b) {
                stackIn_173_0 = (faa) ((Object) stackIn_172_0);
                stackIn_173_1 = stackIn_172_1;
                stackIn_173_2 = 0;
                break L49;
              } else {
                stackIn_173_0 = (faa) ((Object) stackIn_172_0);
                stackIn_173_1 = stackIn_172_1;
                stackIn_173_2 = 1;
                break L49;
              }
            }
            L50: {
              if (vq.a(stackIn_173_0, stackIn_173_1, stackIn_173_2 != 0)) {
                this.field_b.b(param0, -113);
                break L50;
              } else {
                break L50;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L51: {
            var3_ref = decompiledCaughtException;
            stackIn_181_0 = (RuntimeException) (var3_ref);

            stackIn_181_1 = new StringBuilder().append("pe.E(");

            if (param0 == null) {
              stackIn_182_0 = (RuntimeException) ((Object) stackIn_181_0);
              stackIn_182_1 = (StringBuilder) ((Object) stackIn_181_1);
              stackIn_182_2 = "null";
              break L51;
            } else {
              stackIn_182_0 = (RuntimeException) ((Object) stackIn_181_0);
              stackIn_182_1 = (StringBuilder) ((Object) stackIn_181_1);
              stackIn_182_2 = "{...}";
              break L51;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_182_0), stackIn_182_2 + ',' + param1 + ')');
        }
    }

    final sg d(int param0, int param1) {
        sg[] var3;
        int var4;
        sg var5;
        int var6;
        sg[] var7;
        var6 = VoidHunters.field_G;
        var7 = this.field_k;
        var3 = var7;
        if (param1 >= 50) {
          var4 = 0;
          L0: while (true) {
            if (var4 < var7.length) {
              var5 = var7[var4];
              if (null != var5) {
                if (param0 == var5.o((byte) -117)) {
                  return var5;
                } else {
                  var4++;
                  continue L0;
                }
              } else {
                var4++;
                continue L0;
              }
            } else {
              return null;
            }
          }
        } else {
          return (sg) null;
        }
    }

    final int c(int param0, int param1) {
        if (param0 != -2003) {
            return 40;
        }
        if ((param1 ^ -1) <= -1) {
            if (this.field_l.length <= param1) {
                return 0;
            }
            return oq.field_C + -this.field_l[param1];
        }
        return 0;
    }

    final int g(byte param0) {
        if (param0 != -122) {
            field_d = (String) null;
        }
        return this.field_o;
    }

    private final boolean a(int param0, ml param1, anb param2, byte param3, int param4, ml param5, anb param6, int param7, int param8) {
        int stackIn_18_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_33_0 = 0;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_50_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ml var10 = null;
        RuntimeException var10_ref = null;
        ml var11 = null;
        anb var12 = null;
        anb var13 = null;
        int var14 = 0;
        int var15 = 0;
        Object var16 = null;
        anb var17 = null;
        long var18 = 0L;
        long var20 = 0L;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        mqb var26 = null;
        var16 = null;
        var25 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param5.field_j == 28) {
                break L1;
              } else {
                if (-29 == (param1.field_j ^ -1)) {
                  break L1;
                } else {
                  return true;
                }
              }
            }
            L2: {
              var10 = param5;
              var11 = param1;
              var12 = param6;
              var13 = param2;
              if (param3 > 42) {
                break L2;
              } else {
                this.field_y = 115;
                break L2;
              }
            }
            var14 = param8;
            var15 = 0;
            L3: while (true) {
              if (2 <= var15) {
                stackIn_33_0 = 1;
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                L4: {
                  if (var10.k(0) != 28) {
                    break L4;
                  } else {
                    if (!(var12 instanceof mqb)) {
                      break L4;
                    } else {
                      if (var11.field_k == null) {
                        break L4;
                      } else {
                        if (var11.field_k.field_e == var12.field_l) {
                          L5: {
                            if (!((mqb) ((Object) var12)).k((byte) -76)) {
                              break L5;
                            } else {
                              this.a(-104, var14, var12);
                              break L5;
                            }
                          }
                          stackIn_18_0 = 0;
                          decompiledRegionSelector0 = 0;
                          break L0;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                }
                L6: {
                  if (28 != var10.k(0)) {
                    break L6;
                  } else {
                    if (!(var12 instanceof mqb)) {
                      break L6;
                    } else {
                      var26 = (mqb) ((Object) var12);
                      if (var13.field_l == var26.p(32)) {
                        stackIn_25_0 = 1;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        L7: {
                          if (var26.l((byte) 13) != -1) {
                            break L7;
                          } else {
                            if (var26.k((byte) -16)) {
                              break L7;
                            } else {
                              var17 = var13;
                              var18 = (long)(var26.d(false) - var11.field_r);
                              var20 = (long)(var26.g((byte) 118) + -var11.field_n);
                              var22 = -var11.field_b;
                              var23 = (int)((long)fc.a(var22, (byte) 29) * var18 + -(var20 * (long)eu.a(var22, 39)) >> -660869168);
                              var24 = (int)((long)eu.a(var22, 58) * var18 + var20 * (long)fc.a(var22, (byte) 75) >> -206147952);
                              qba.a(20382, var26.d(false), 11, var26.g((byte) 124), 50);
                              var26.d(param7, var23, var24, 122, var17.field_l);
                              break L7;
                            }
                          }
                        }
                        stackIn_30_0 = 0;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      }
                    }
                  }
                }
                var10 = param1;
                var14 = param0;
                var13 = param6;
                var11 = param5;
                param7 = param4;
                var12 = param2;
                var15++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var10_ref = decompiledCaughtException;
            stackIn_37_0 = (RuntimeException) (var10_ref);

            stackIn_37_1 = new StringBuilder().append("pe.JF(").append(param0).append(',');

            if (param1 == null) {
              stackIn_38_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "null";
              break L8;
            } else {
              stackIn_38_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "{...}";
              break L8;
            }
          }
          L9: {
            stackIn_41_0 = (RuntimeException) ((Object) stackIn_38_0);

            stackIn_41_1 = ((StringBuilder) (Object) stackIn_38_1).append(stackIn_38_2).append(',');

            if (param2 == null) {
              stackIn_42_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackIn_42_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackIn_42_2 = "null";
              break L9;
            } else {
              stackIn_42_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackIn_42_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackIn_42_2 = "{...}";
              break L9;
            }
          }
          L10: {
            stackIn_45_0 = (RuntimeException) ((Object) stackIn_42_0);

            stackIn_45_1 = ((StringBuilder) (Object) stackIn_42_1).append(stackIn_42_2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_46_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackIn_46_2 = "null";
              break L10;
            } else {
              stackIn_46_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackIn_46_2 = "{...}";
              break L10;
            }
          }
          L11: {
            stackIn_49_0 = (RuntimeException) ((Object) stackIn_46_0);

            stackIn_49_1 = ((StringBuilder) (Object) stackIn_46_1).append(stackIn_46_2).append(',');

            if (param6 == null) {
              stackIn_50_0 = (RuntimeException) ((Object) stackIn_49_0);
              stackIn_50_1 = (StringBuilder) ((Object) stackIn_49_1);
              stackIn_50_2 = "null";
              break L11;
            } else {
              stackIn_50_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackIn_50_1 = (StringBuilder) ((Object) stackIn_49_1);
              stackIn_50_2 = "{...}";
              break L11;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_50_0), stackIn_50_2 + ',' + param7 + ',' + param8 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_18_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_25_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_30_0 != 0;
            } else {
              return stackIn_33_0 != 0;
            }
          }
        }
    }

    private final void a(sg param0, lta param1, int param2) {
        boolean discarded$0 = false;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int[] var4 = null;
        RuntimeException var4_ref = null;
        String var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        float var8 = 0.0f;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int[] var15 = null;
        int[] var16 = null;
        String var17 = null;
        int[] var18 = null;
        try {
          L0: {
            var18 = param0.f((byte) -44);
            var16 = var18;
            var15 = var16;
            var4 = var15;
            if (rna.a(var18, param1.field_f, 5)) {
              L1: {
                param0.a(param1, 122, (pe) (this));
                if (param2 >= 50) {
                  break L1;
                } else {
                  discarded$0 = this.a(-62, (ml) null, (imb) null, true, (byte) 99, (sg) null, (nbb) null);
                  break L1;
                }
              }
              L2: {
                if (pqa.a(32, 11284)) {
                  L3: {
                    var17 = "Team=" + param0.q((byte) 101) + ",owner=" + param0.o((byte) -117) + " ai=" + param0.l((byte) -10);
                    var5 = var17;
                    var5 = var17;
                    var5 = var17;
                    if (!param0.l((byte) -10)) {
                      break L3;
                    } else {
                      var5 = var17 + " parent=" + param0.k((byte) -108).a((byte) -125);
                      break L3;
                    }
                  }
                  var6 = param1.a(param0.d(false), (byte) 123);
                  var7 = param1.b(true, param0.g((byte) -54) + -16384);
                  cka.a(-1, var5, 16711935, var7, var6 + -(kga.a(115, var5) >> 1527068641), 4266);
                  break L2;
                } else {
                  break L2;
                }
              }
              L4: {
                if (!pqa.a(4096, 11284)) {
                  break L4;
                } else {
                  if (param0.l((byte) -10)) {
                    param0.k((byte) -108).a(param0, -11, param1, (pe) (this));
                    break L4;
                  } else {
                    break L4;
                  }
                }
              }
              this.a((byte) 69, param0, param1);
              decompiledRegionSelector0 = 3;
              break L0;
            } else {
              if (!param0.b(1, (byte) -107)) {
                var5_int = -(int)param1.field_c + param0.field_d;
                var6 = -(int)param1.field_b + param0.field_e;
                var7 = ar.a(var5_int, (byte) 110, var6);
                var8 = (float)((param0.g(-66) << -1195094936) / var7);
                if (0.0f < var8) {
                  L5: {
                    var9 = ek.a(0, (int)param1.field_b, (int)param1.field_c, param1.field_f[2], param0.field_e, 16, param1.field_f[1], param1.field_f[0], param1.field_f[3], param0.field_d);
                    if ((var9 ^ -1) <= -1) {
                      var10 = (int)(1.0f * (float)var5_int * (float)var9 / 65536.0f + param1.field_c);
                      var11 = (int)(param1.field_b + (float)var6 * 1.0f * (float)var9 / 65536.0f);
                      var12 = param1.a(var10, (byte) 127);
                      var13 = param1.b(true, var11);
                      var14 = qpb.a(false, param0.q((byte) 88), 13894143);
                      ena.a(var13, var8, -109, var12, var14);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4_ref = decompiledCaughtException;
            stackIn_29_0 = (RuntimeException) (var4_ref);

            stackIn_29_1 = new StringBuilder().append("pe.RC(");

            if (param0 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L6;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L6;
            }
          }
          L7: {
            stackIn_33_0 = (RuntimeException) ((Object) stackIn_30_0);

            stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',');

            if (param1 == null) {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L7;
            } else {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L7;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_34_0), stackIn_34_2 + ',' + param2 + ')');
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
              return;
            }
          }
        }
    }

    final void a(tfa param0, int param1, sg param2, lta param3, byte param4, sg param5, int param6, int param7, int param8) {
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10 = null;
        int var11 = 0;
        sg var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15_int = 0;
        String var15 = null;
        String var16_ref_String = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        sg[] var20 = null;
        var19 = VoidHunters.field_G;
        try {
          L0: {
            var20 = this.field_k;
            var11 = 0;
            L1: while (true) {
              L2: {
                if (var11 >= var20.length) {
                  break L2;
                } else {
                  L3: {
                    var12 = var20[var11];
                    if (null != var12) {
                      if (var12.b(2, (byte) 78)) {
                        break L3;
                      } else {
                        var13 = var12.o((byte) -117);
                        if (param8 != var13) {
                          break L3;
                        } else {
                          L4: {
                            L5: {
                              var14 = qpb.a(false, var12.q((byte) 80), 13894143);
                              var12.field_k.a(0, var14, (pe) (this), param3);
                              if (param5 != var12) {
                                break L5;
                              } else {
                                if (param2 != null) {
                                  this.a(param2, param3, 55);
                                  break L4;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            this.a(var12, param3, 61);
                            break L4;
                          }
                          L6: {
                            this.a(param0, param5, (byte) -128, var12, param1, param7, var13, param3);
                            this.a(param3, var12, param1, 0, param7);
                            if (var12.d(9, 100)) {
                              var15_int = var12.y(8);
                              if (var15_int >= 0) {
                                var16_ref_String = Integer.toString((var15_int + -1) / oq.field_l);
                                var17 = param3.a(var12.d(false), (byte) 119);
                                var18 = param3.b(true, -8192 + var12.f((byte) -70)[2]);
                                pm.a(-(tea.a(1, var16_ref_String, 13879) >> 565485633) + var17, -1, var18, var16_ref_String, 1, 16541441, (byte) -94);
                                break L6;
                              } else {
                                break L6;
                              }
                            } else {
                              break L6;
                            }
                          }
                          if (pqa.a(8, 11284)) {
                            var15 = "Dragging debris=" + Integer.toString(var12.x(param4 + -116));
                            var16 = param3.a(var12.d(false), (byte) 126);
                            var17 = param3.b(true, var12.g((byte) 125) + -16384);
                            cka.a(-1, var15, 16711935, var17, var16 + -(kga.a(-9, var15) >> -793474463), param4 + 4247);
                            break L2;
                          } else {
                            break L2;
                          }
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                  var11++;
                  continue L1;
                }
              }
              L7: {
                if (param4 == 19) {
                  break L7;
                } else {
                  this.field_n = (ij) null;
                  break L7;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var10 = decompiledCaughtException;
            stackIn_34_0 = (RuntimeException) (var10);

            stackIn_34_1 = new StringBuilder().append("pe.JA(");

            if (param0 == null) {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "null";
              break L8;
            } else {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "{...}";
              break L8;
            }
          }
          L9: {
            stackIn_38_0 = (RuntimeException) ((Object) stackIn_35_0);

            stackIn_38_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_35_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "null";
              break L9;
            } else {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "{...}";
              break L9;
            }
          }
          L10: {
            stackIn_42_0 = (RuntimeException) ((Object) stackIn_39_0);

            stackIn_42_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_39_2).append(',');

            if (param3 == null) {
              stackIn_43_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "null";
              break L10;
            } else {
              stackIn_43_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "{...}";
              break L10;
            }
          }
          L11: {
            stackIn_46_0 = (RuntimeException) ((Object) stackIn_43_0);

            stackIn_46_1 = ((StringBuilder) (Object) stackIn_43_1).append(stackIn_43_2).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_47_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackIn_47_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackIn_47_2 = "null";
              break L11;
            } else {
              stackIn_47_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackIn_47_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackIn_47_2 = "{...}";
              break L11;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_47_0), stackIn_47_2 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    private final void a(anb param0, boolean param1, boolean param2, boolean param3, int param4) {
        int stackIn_10_0 = 0;
        anb stackIn_10_1 = null;
        int stackIn_11_0 = 0;
        anb stackIn_11_1 = null;
        int stackIn_11_2 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          L0: {
            L1: {
              if (!param3) {
                break L1;
              } else {
                if (param2) {
                  param0.a(-61, (pe) (this));
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              param0.a(-49, param2, (pe) (this));
              param0.d((byte) 95);
              if (param1) {
                break L2;
              } else {
                this.b(-10);
                break L2;
              }
            }
            L3: {
              this.a(-110, param4, param0);
              stackIn_10_0 = 20382;

              stackIn_10_1 = (anb) (param0);

              if (param1) {
                stackIn_11_0 = stackIn_10_0;
                stackIn_11_1 = (anb) ((Object) stackIn_10_1);
                stackIn_11_2 = 0;
                break L3;
              } else {
                stackIn_11_0 = stackIn_10_0;
                stackIn_11_1 = (anb) ((Object) stackIn_10_1);
                stackIn_11_2 = 1;
                break L3;
              }
            }
            qba.a(stackIn_11_0, ((anb) (Object) stackIn_11_1).d(stackIn_11_2 != 0), 68, param0.g((byte) 127), 10);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var6);

            stackIn_16_1 = new StringBuilder().append("pe.KC(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void b(int param0) {
        int var2;
        rba var3;
        int var4;
        int var5;
        sg var6;
        int var7;
        int var8;
        var8 = VoidHunters.field_G;
        if (null == this.field_a) {
          return;
        } else {
          var2 = 0;
          L0: while (true) {
            if (var2 >= this.field_a.length) {
              var2 = 5 % ((18 - param0) / 39);
              return;
            } else {
              var3 = this.field_a[var2];
              if (var3 != null) {
                var4 = -1;
                var5 = 0;
                L1: while (true) {
                  L2: {
                    if (var5 >= this.field_k.length) {
                      break L2;
                    } else {
                      var6 = this.field_k[var5];
                      if (var6 != null) {
                        var7 = var6.q((byte) 100);
                        if (-1 >= (var7 ^ -1)) {
                          if (unb.field_p > var7) {
                            if (var3.a(var6.field_d, (byte) 84, var6.field_e)) {
                              if (-1 < (var4 ^ -1)) {
                                var4 = var7;
                                var5++;
                                continue L1;
                              } else {
                                if (var7 != var4) {
                                  var4 = -1;
                                  break L2;
                                } else {
                                  var5++;
                                  continue L1;
                                }
                              }
                            } else {
                              var5++;
                              continue L1;
                            }
                          } else {
                            var5++;
                            continue L1;
                          }
                        } else {
                          var5++;
                          continue L1;
                        }
                      } else {
                        var5++;
                        continue L1;
                      }
                    }
                  }
                  L3: {
                    if (0 > var4) {
                      break L3;
                    } else {
                      if (var3.field_d != var4) {
                        var3.field_h = var4;
                        var3.field_e = var3.field_e + 1;
                        if (oq.field_G <= var3.field_e) {
                          var3.field_e = 0;
                          var3.field_d = var4;
                          var2++;
                          continue L0;
                        } else {
                          var2++;
                          continue L0;
                        }
                      } else {
                        break L3;
                      }
                    }
                  }
                  var3.field_e = var3.field_e - 2;
                  if (var3.field_e < 0) {
                    var3.field_e = 0;
                    var2++;
                    continue L0;
                  } else {
                    var2++;
                    continue L0;
                  }
                }
              } else {
                var2++;
                continue L0;
              }
            }
          }
        }
    }

    final void a(byte param0, anb param1, ml param2, wfb param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        sg var7 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -44) {
                break L1;
              } else {
                this.field_i = false;
                break L1;
              }
            }
            L2: {
              var5_int = -1;
              var6 = -1;
              if (!(param1 instanceof sg)) {
                break L2;
              } else {
                var7 = (sg) ((Object) param1);
                var5_int = var7.o((byte) -117);
                var6 = var7.q((byte) 93);
                break L2;
              }
            }
            this.a(1, param3.field_y, var6, var5_int, false, param2.field_r, param2.field_n);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (runtimeException);

            stackIn_9_1 = new StringBuilder().append("pe.Q(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {
            stackIn_13_0 = (RuntimeException) ((Object) stackIn_10_0);

            stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param2 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          L5: {
            stackIn_17_0 = (RuntimeException) ((Object) stackIn_14_0);

            stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param3 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
    }

    final void a(byte param0, rsb param1) {
        int var4 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        rdb var5 = null;
        var4 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param0 >= 126) {
                break L1;
              } else {
                this.field_h = false;
                break L1;
              }
            }
            L2: {
              if (!this.field_v) {
                var5 = (rdb) ((Object) this.field_n.d(0));
                L3: while (true) {
                  if (var5 == null) {
                    this.b(99);
                    if (this.field_f == null) {
                      break L2;
                    } else {
                      this.field_f.a(-2374, param1);
                      break L2;
                    }
                  } else {
                    var5.a(3128, (pe) (this));
                    var5 = (rdb) ((Object) this.field_n.a((byte) 113));
                    continue L3;
                  }
                }
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var3);

            stackIn_17_1 = new StringBuilder().append("pe.GF(").append(param0).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L4;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
    }

    final boolean d(int param0, byte param1) {
        int stackIn_7_0 = 0;
        L0: {
          if (param1 == 21) {
            break L0;
          } else {
            this.field_q = true;
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == this.field_f) {
              break L2;
            } else {
              if (this.field_f.a(param0, (byte) -85)) {
                break L2;
              } else {
                stackIn_7_0 = 1;
                break L1;
              }
            }
          }
          stackIn_7_0 = 0;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    final una e(int param0) {
        if (param0 != 0) {
            return (una) null;
        }
        return this.field_f;
    }

    final int f(int param0) {
        if (param0 != 24797) {
            return -20;
        }
        return this.field_l.length;
    }

    final void e(int param0, int param1) {
        if (param1 != 0) {
            return;
        }
        this.field_r = param0;
    }

    private final boolean a(int param0, int param1, int param2, anb[] param3, int param4) {
        anb[] var6 = null;
        int var7 = 0;
        anb var8 = null;
        int var12 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6_ref = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var12 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var6 = param3;
              var7 = 0;
              if (param2 <= -66) {
                break L1;
              } else {
                this.a((ij) null, true);
                break L1;
              }
            }
            L2: while (true) {
              if (var7 >= var6.length) {
                stackIn_13_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L3: {
                  var8 = var6[var7];
                  if (null != var8) {
                    var9 = param0 + -var8.d(false);
                    var10 = param1 - var8.g((byte) 118);
                    var11 = ar.a(var9, (byte) 121, var10);
                    if (var11 >= param4 + var8.g(-99)) {
                      break L3;
                    } else {
                      stackIn_10_0 = 1;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  } else {
                    break L3;
                  }
                }
                var7++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6_ref = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var6_ref);

            stackIn_17_1 = new StringBuilder().append("pe.AD(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L4;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_10_0 != 0;
        } else {
          return stackIn_13_0 != 0;
        }
    }

    final void a(int param0, int param1, int param2, int param3, boolean param4, int param5, int param6) {
        int var8;
        int var9;
        int var10;
        int var11;
        tj var12;
        int var13;
        var13 = VoidHunters.field_G;
        if (param1 > 0) {
          L0: {
            if (!param4) {
              break L0;
            } else {
              this.d(89, 35);
              break L0;
            }
          }
          L1: {
            var8 = 51;
            if (param0 != 1) {
              break L1;
            } else {
              var8 = 55;
              break L1;
            }
          }
          qba.a(20382, param5, var8, param6, 100);
          var9 = param1;
          var10 = 0;
          L2: while (true) {
            if (var9 <= var10) {
              return;
            } else {
              var11 = 8192 * var10 / var9;
              var12 = new tj(param5, param6, fc.a(var11, (byte) 114) * 1000 >> 155205200, 1000 * eu.a(var11, 93) >> -960120880, var11, 2 * param1, param2, param3, 5, pea.field_a);
              this.a(var12, false);
              var10++;
              continue L2;
            }
          }
        } else {
          return;
        }
    }

    final ij f(byte param0) {
        if (param0 != 24) {
            return (ij) null;
        }
        return this.field_n;
    }

    final cq e(byte param0, int param1) {
        L0: {
          if (param0 <= -27) {
            break L0;
          } else {
            this.field_t = (cq[]) null;
            break L0;
          }
        }
        if (null != this.field_t) {
          if (param1 >= 0) {
            if (this.field_t.length > param1) {
              return this.field_t[param1];
            } else {
              return null;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final int a(cq param0, int param1) {
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        var4 = VoidHunters.field_G;
        try {
          L0: {
            if (param1 > 6) {
              L1: {
                if (null != this.field_t) {
                  var3_int = 0;
                  L2: while (true) {
                    if (var3_int >= this.field_t.length) {
                      break L1;
                    } else {
                      if (this.field_t[var3_int] == param0) {
                        stackIn_13_0 = var3_int;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        var3_int++;
                        continue L2;
                      }
                    }
                  }
                } else {
                  break L1;
                }
              }
              stackIn_16_0 = -1;
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackIn_3_0 = 78;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var3);

            stackIn_20_1 = new StringBuilder().append("pe.OC(");

            if (param0 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L3;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0;
          } else {
            return stackIn_16_0;
          }
        }
    }

    private final void a(byte param0, anb param1, lta param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4_int = 22 % ((-27 - param0) / 42);
              if (!pqa.a(8, 11284)) {
                break L1;
              } else {
                var5 = param2.a(param1.d(false), (byte) 127);
                var6 = param2.b(true, param1.f((byte) -53)[2]) - pib.b((byte) 118) / 2;
                var7 = Integer.toString(param1.field_l);
                cka.a(-1, var7, 16711935, var6, -(kga.a(-118, var7) >> -1964763775) + var5, 4266);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("pe.ME(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {
            stackIn_10_0 = (RuntimeException) ((Object) stackIn_7_0);

            stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
    }

    private final void a(tfa param0, sg param1, byte param2, sg param3, int param4, int param5, int param6, lta param7) {
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_75_2 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_79_2 = null;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        String stackIn_83_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        nbb var9 = null;
        RuntimeException var9_ref = null;
        int var10_int = 0;
        ml var10 = null;
        int var11 = 0;
        int var12_int = 0;
        nbb var12 = null;
        int var13 = 0;
        ml[] var13_ref_ml__ = null;
        int var14 = 0;
        ml[] var14_ref_ml__ = null;
        int var15 = 0;
        imb var15_ref_imb = null;
        int var16 = 0;
        int var17_int = 0;
        String var17 = null;
        int var18_int = 0;
        int[] var18 = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        qua var25 = null;
        int var26 = 0;
        nbb var27 = null;
        nbb var28 = null;
        qua var29 = null;
        int[] var30 = null;
        int[] var31 = null;
        var24 = VoidHunters.field_G;
        try {
          L0: {
            if (param2 < -126) {
              L1: {
                L2: {
                  if (param6 < 0) {
                    break L2;
                  } else {
                    if (!param3.d(4, 56)) {
                      L3: {
                        if (0 != (param0.field_f & 128)) {
                          break L3;
                        } else {
                          if (null != param3.n((byte) 28)) {
                            break L3;
                          } else {
                            break L1;
                          }
                        }
                      }
                      var27 = this.i(21363, param3.x(-96));
                      var9 = var27;
                      if (var27 != null) {
                        L4: {
                          if (ktb.field_q != 1) {
                            break L4;
                          } else {
                            if (null == param3.n((byte) 28)) {
                              L5: {
                                var10_int = param5;
                                var11 = param4;
                                if (param3 != param1) {
                                  var12_int = 131072;
                                  var13 = -param3.d(false) + var10_int;
                                  var14 = -param3.g((byte) -46) + var11;
                                  var15 = ar.a(var13, (byte) 111, var14);
                                  if (var15 > var12_int) {
                                    var16 = ecb.a(var14, (byte) -77, var13);
                                    var10_int = param3.d(false) - -((var12_int >> 1279428840) * (fc.a(var16, (byte) -115) >> -1274050104));
                                    var11 = param3.g((byte) 123) + (var12_int >> 943240328) * (eu.a(var16, 47) >> 901552296);
                                    break L5;
                                  } else {
                                    break L5;
                                  }
                                } else {
                                  break L5;
                                }
                              }
                              var12 = new nbb();
                              var27.b((byte) 60, var12);
                              param3.a((int[]) null, -15);
                              var28 = var12;
                              var9 = var28;
                              param3.a((qua) null, 3);
                              this.a(param3, false, -126, var28, var11, var10_int);
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                        }
                        L6: {
                          var10 = var9.field_k;
                          var11 = 1;
                          var25 = param3.p((byte) 49);
                          var29 = var25;
                          if (var29 != null) {
                            var13_ref_ml__ = var29.field_c;
                            if (null == var13_ref_ml__) {
                              break L6;
                            } else {
                              if (-1 > (var13_ref_ml__.length ^ -1)) {
                                var14 = 0;
                                L7: while (true) {
                                  if (var13_ref_ml__.length <= var14) {
                                    break L6;
                                  } else {
                                    L8: {
                                      L9: {
                                        if (var11 == 0) {
                                          break L9;
                                        } else {
                                          if (var25.field_e.field_b == var13_ref_ml__[var14]) {
                                            break L8;
                                          } else {
                                            break L9;
                                          }
                                        }
                                      }
                                      if (var13_ref_ml__[var14].a(16, var29.field_e.field_b)) {
                                        break L8;
                                      } else {
                                        var14++;
                                        continue L7;
                                      }
                                    }
                                    var11 = 0;
                                    var14++;
                                    continue L7;
                                  }
                                }
                              } else {
                                break L6;
                              }
                            }
                          } else {
                            break L6;
                          }
                        }
                        L10: {
                          if ((ktb.field_q ^ -1) != -2) {
                            break L10;
                          } else {
                            if (param3.n((byte) 28) != null) {
                              break L10;
                            } else {
                              L11: {
                                var13 = aob.a(29554, var9.field_k.field_j);
                                if (null != var29) {
                                  if (var11 == 0) {
                                    var13 = 16711680;
                                    break L11;
                                  } else {
                                    var13 = qpb.a(false, param3.q((byte) 73), 13894143);
                                    break L11;
                                  }
                                } else {
                                  break L11;
                                }
                              }
                              var9.a(param7, var13, (pe) (this), 16);
                              break L10;
                            }
                          }
                        }
                        L12: {
                          if (var29 == null) {
                            break L12;
                          } else {
                            L13: {
                              var13 = ki.field_o;
                              ki.field_o = 0;
                              var14_ref_ml__ = var29.field_c;
                              if (null == var14_ref_ml__) {
                                break L13;
                              } else {
                                if ((var14_ref_ml__.length ^ -1) < -1) {
                                  var15_ref_imb = var29.field_e.field_b.field_d[var25.field_e.field_e];
                                  var16 = 1024;
                                  var17_int = param7.a(-var16 + var15_ref_imb.field_e, (byte) 113);
                                  var18_int = param7.a(var16 + var15_ref_imb.field_e, (byte) 115);
                                  var19 = param7.b(true, -var16 + var15_ref_imb.field_d);
                                  var20 = param7.b(true, var16 + var15_ref_imb.field_d);
                                  c.a(var20, var18_int, var17_int, var19, -16777216, 16711680);
                                  c.a(var19, var18_int, var17_int, var20, -16777216, 16711680);
                                  var21 = 0;
                                  L14: while (true) {
                                    if (var21 >= var14_ref_ml__.length) {
                                      break L13;
                                    } else {
                                      var14_ref_ml__[var21].a((byte) 26, param7, true, (pe) (this), 16711680);
                                      var21++;
                                      continue L14;
                                    }
                                  }
                                } else {
                                  break L13;
                                }
                              }
                            }
                            ki.field_o = var13;
                            break L12;
                          }
                        }
                        var13 = var9.d(false) - var9.j(995401160);
                        var14 = var9.g((byte) -16) - var9.i((byte) 5);
                        var15 = var10.b(127) * fc.a(var9.e(0), (byte) 99) - var10.c((byte) 100) * eu.a(var9.e(0), 124) >> 1974054800;
                        var16 = var10.b(-25) * eu.a(var9.e(0), 62) + var10.c((byte) 100) * fc.a(var9.e(0), (byte) 64) >> 1641997488;
                        nn.a(param3.field_k.field_n, 1, var14 + var16, var13 - -var15, param7, param3.field_k.field_r);
                        var17 = me.a(var10, (byte) -84);
                        cka.a(-1, var17, 16777215, param7.b(true, -10000 + var9.g((byte) -109)), param7.a(var9.d(false), (byte) 118) + -(kga.a(94, var17) >> -222978143), 4266);
                        if (null == param3.A(56)) {
                          break L2;
                        } else {
                          var31 = param3.A(116);
                          var30 = var31;
                          var18 = var30;
                          var26 = 0;
                          var19 = var26;
                          L15: while (true) {
                            if (var26 >= var31.length) {
                              break L2;
                            } else {
                              var20 = var31[var26];
                              var21 = var18[var26 + 1];
                              var22 = var18[(var26 + 2) % var31.length];
                              var23 = var18[(3 + var26) % var31.length];
                              c.a(param7.b(true, var23), param7.a(var22, (byte) 122), param7.a(var20, (byte) 121), param7.b(true, var21), -16777216, 65280);
                              var26 += 2;
                              continue L15;
                            }
                          }
                        }
                      } else {
                        break L1;
                      }
                    } else {
                      break L1;
                    }
                  }
                }
                break L1;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var9_ref = decompiledCaughtException;
            stackIn_70_0 = (RuntimeException) (var9_ref);

            stackIn_70_1 = new StringBuilder().append("pe.RD(");

            if (param0 == null) {
              stackIn_71_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackIn_71_1 = (StringBuilder) ((Object) stackIn_70_1);
              stackIn_71_2 = "null";
              break L16;
            } else {
              stackIn_71_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackIn_71_1 = (StringBuilder) ((Object) stackIn_70_1);
              stackIn_71_2 = "{...}";
              break L16;
            }
          }
          L17: {
            stackIn_74_0 = (RuntimeException) ((Object) stackIn_71_0);

            stackIn_74_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_71_2).append(',');

            if (param1 == null) {
              stackIn_75_0 = (RuntimeException) ((Object) stackIn_74_0);
              stackIn_75_1 = (StringBuilder) ((Object) stackIn_74_1);
              stackIn_75_2 = "null";
              break L17;
            } else {
              stackIn_75_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackIn_75_1 = (StringBuilder) ((Object) stackIn_74_1);
              stackIn_75_2 = "{...}";
              break L17;
            }
          }
          L18: {
            stackIn_78_0 = (RuntimeException) ((Object) stackIn_75_0);

            stackIn_78_1 = ((StringBuilder) (Object) stackIn_75_1).append(stackIn_75_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_79_0 = (RuntimeException) ((Object) stackIn_78_0);
              stackIn_79_1 = (StringBuilder) ((Object) stackIn_78_1);
              stackIn_79_2 = "null";
              break L18;
            } else {
              stackIn_79_0 = (RuntimeException) ((Object) stackIn_75_0);
              stackIn_79_1 = (StringBuilder) ((Object) stackIn_78_1);
              stackIn_79_2 = "{...}";
              break L18;
            }
          }
          L19: {
            stackIn_82_0 = (RuntimeException) ((Object) stackIn_79_0);

            stackIn_82_1 = ((StringBuilder) (Object) stackIn_79_1).append(stackIn_79_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');

            if (param7 == null) {
              stackIn_83_0 = (RuntimeException) ((Object) stackIn_82_0);
              stackIn_83_1 = (StringBuilder) ((Object) stackIn_82_1);
              stackIn_83_2 = "null";
              break L19;
            } else {
              stackIn_83_0 = (RuntimeException) ((Object) stackIn_79_0);
              stackIn_83_1 = (StringBuilder) ((Object) stackIn_82_1);
              stackIn_83_2 = "{...}";
              break L19;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_83_0), stackIn_83_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(int param0, byte param1, int param2, int param3) {
        crb[] var5;
        int var6;
        crb var7;
        int var11;
        crb[] var12;
        int var8;
        int var9;
        int var10;
        L0: {
          var11 = VoidHunters.field_G;
          if (param1 == 4) {
            break L0;
          } else {
            this.a((crb[]) null, false, (ij) null);
            break L0;
          }
        }
        var12 = this.field_e.c(0);
        var5 = var12;
        var6 = 0;
        L1: while (true) {
          if (var6 >= var12.length) {
            L2: {
              if (!this.a((byte) -99, true, param0, param2, param3)) {
                break L2;
              } else {
                this.field_b.a(true, new rgb(param2, param0, param3));
                break L2;
              }
            }
            return;
          } else {
            var7 = var12[var6];
            if (var7 != null) {
              var8 = param2 - var7.d(false);
              var9 = -var7.g((byte) 4) + param0;
              var10 = ar.a(var8, (byte) 115, var9);
              if (var7.field_k.i((byte) -112).field_l + param3 > var10) {
                this.a(-125, 2, var7);
                var6++;
                continue L1;
              } else {
                var6++;
                continue L1;
              }
            } else {
              var6++;
              continue L1;
            }
          }
        }
    }

    final boolean a(int param0, anb param1) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            var3_int = param1.field_d;
            var4 = param1.field_e;
            var5 = param1.g(param0 + 11886);
            if (!this.a(var3_int, var4, -80, this.field_e.c(0), var5)) {
              if (this.a(var3_int, var4, param0 + 11833, this.field_k, var5)) {
                stackIn_7_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  if (param0 == -11924) {
                    break L1;
                  } else {
                    this.field_i = false;
                    break L1;
                  }
                }
                if (this.a(var3_int, var4, -100, this.field_m, var5)) {
                  stackIn_13_0 = 1;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return false;
                }
              }
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var3);

            stackIn_17_1 = new StringBuilder().append("pe.EC(").append(param0).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L2;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            return stackIn_13_0 != 0;
          }
        }
    }

    final void b(int param0, boolean param1) {
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        L0: {
          stackIn_2_0 = this;

          if (!param1) {
            stackIn_3_0 = this;
            stackIn_3_1 = 0;
            break L0;
          } else {
            stackIn_3_0 = this;
            stackIn_3_1 = 1;
            break L0;
          }
        }
        L1: {
          ((pe) (this)).field_v = stackIn_3_1 != 0;
          if (param0 < -109) {
            break L1;
          } else {
            this.field_u = (fba) null;
            break L1;
          }
        }
    }

    private final void a(ij param0, boolean param1) {
        boolean discarded$0 = false;
        Object stackIn_7_0 = null;
        ml stackIn_7_1 = null;
        int stackIn_41_0 = 0;
        int stackIn_45_0 = 0;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        String stackIn_66_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        sg var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        sg var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = VoidHunters.field_G;
        try {
          L0: {
            var3_int = 0;
            L1: while (true) {
              if (var3_int >= this.field_k.length) {
                L2: {
                  if (!param1) {
                    break L2;
                  } else {
                    this.field_u = (fba) null;
                    break L2;
                  }
                }
                break L0;
              } else {
                var4 = this.field_k[var3_int];
                var9 = var4;
                var9 = var4;
                if (var4 != null) {
                  stackIn_7_0 = null;
                  stackIn_7_1 = var4.field_k;
                  if (stackIn_7_0 != stackIn_7_1) {
                    if (!var4.field_k.k((byte) 71)) {
                      L3: {
                        var5 = gkb.field_o;
                        if (var4.field_k.field_j == 0) {
                          var5 = var5 >> 2;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      var6 = this.field_u.a(var4.field_l, var4.field_q, 1, -90);
                      var7 = 0;
                      L4: while (true) {
                        if (var6 > var7) {
                          var8 = -field_c[0] + ada.field_a[var7];
                          var9 = this.field_k[var8];
                          if (null != var9) {
                            if (var3_int > var8) {
                              if (var9.field_k != null) {
                                if (!var9.field_k.k((byte) 94)) {
                                  L5: {
                                    L6: {
                                      if (var4.q((byte) 82) != var9.q((byte) 69)) {
                                        break L6;
                                      } else {
                                        if (!var4.g(false)) {
                                          if (!var9.g(param1)) {
                                            break L6;
                                          } else {
                                            break L5;
                                          }
                                        } else {
                                          var7++;
                                          continue L4;
                                        }
                                      }
                                    }
                                    L7: {
                                      if (-2 != (bra.field_d ^ -1)) {
                                        if (!var4.g(false)) {
                                          if (var9.g(param1)) {
                                            stackIn_41_0 = 1;
                                            break L7;
                                          } else {
                                            stackIn_41_0 = 0;
                                            break L7;
                                          }
                                        } else {
                                          stackIn_41_0 = 1;
                                          break L7;
                                        }
                                      } else {
                                        stackIn_41_0 = 1;
                                        break L7;
                                      }
                                    }
                                    L8: {
                                      var10 = stackIn_41_0;
                                      if (var9.q((byte) 119) == var4.q((byte) 79)) {
                                        stackIn_45_0 = 0;
                                        break L8;
                                      } else {
                                        stackIn_45_0 = 1;
                                        break L8;
                                      }
                                    }
                                    L9: {
                                      var11 = stackIn_45_0;
                                      if (var10 == 0) {
                                        break L9;
                                      } else {
                                        if (var11 == 0) {
                                          var10 = 0;
                                          break L9;
                                        } else {
                                          var4.c(var9.o((byte) -117), 19581);
                                          var9.c(var4.o((byte) -117), 19581);
                                          break L9;
                                        }
                                      }
                                    }
                                    discarded$0 = this.a(var10 != 0, 0, var5, (byte) 57, var11 != 0, var9, 0, var4, param0);
                                    if (var4.field_k != null) {
                                      if (!var4.field_k.k((byte) 42)) {
                                        break L5;
                                      } else {
                                        var3_int++;
                                        continue L1;
                                      }
                                    } else {
                                      var3_int++;
                                      continue L1;
                                    }
                                  }
                                  var7++;
                                  continue L4;
                                } else {
                                  var7++;
                                  continue L4;
                                }
                              } else {
                                var7++;
                                continue L4;
                              }
                            } else {
                              var7++;
                              continue L4;
                            }
                          } else {
                            var7++;
                            continue L4;
                          }
                        } else {
                          var3_int++;
                          continue L1;
                        }
                      }
                    } else {
                      var3_int++;
                      continue L1;
                    }
                  } else {
                    var3_int++;
                    continue L1;
                  }
                } else {
                  var3_int++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var3 = decompiledCaughtException;
            stackIn_65_0 = (RuntimeException) (var3);

            stackIn_65_1 = new StringBuilder().append("pe.TE(");

            if (param0 == null) {
              stackIn_66_0 = (RuntimeException) ((Object) stackIn_65_0);
              stackIn_66_1 = (StringBuilder) ((Object) stackIn_65_1);
              stackIn_66_2 = "null";
              break L10;
            } else {
              stackIn_66_0 = (RuntimeException) ((Object) stackIn_65_0);
              stackIn_66_1 = (StringBuilder) ((Object) stackIn_65_1);
              stackIn_66_2 = "{...}";
              break L10;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_66_0), stackIn_66_2 + ',' + param1 + ')');
        }
    }

    final boolean a(boolean param0, int param1, lbb param2) {
        int var8 = 0;
        int stackIn_3_0 = 0;
        lbb stackIn_7_0 = null;
        lbb stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        et[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        et var7 = null;
        et[] var9 = null;
        var8 = VoidHunters.field_G;
        try {
          L0: {
            if (param0) {
              L1: {
                stackIn_7_0 = (lbb) (param2);

                if (param0) {
                  stackIn_8_0 = (lbb) ((Object) stackIn_7_0);
                  stackIn_8_1 = 0;
                  break L1;
                } else {
                  stackIn_8_0 = (lbb) ((Object) stackIn_7_0);
                  stackIn_8_1 = 1;
                  break L1;
                }
              }
              L2: {
                var9 = ((lbb) (Object) stackIn_8_0).d(stackIn_8_1 != 0);
                var4 = var9;
                var5 = 8;
                if (param1 != 1) {
                  break L2;
                } else {
                  var5 = 9;
                  break L2;
                }
              }
              L3: {
                if (var4 == null) {
                  break L3;
                } else {
                  if (-1 > (var9.length ^ -1)) {
                    var6 = 0;
                    L4: while (true) {
                      if (var9.length <= var6) {
                        break L3;
                      } else {
                        L5: {
                          var7 = var9[var6];
                          if (var7 == null) {
                            break L5;
                          } else {
                            if (var5 != var7.field_b) {
                              break L5;
                            } else {
                              L6: {
                                if (var7.field_a <= 0) {
                                  stackIn_21_0 = 0;
                                  break L6;
                                } else {
                                  stackIn_21_0 = 1;
                                  break L6;
                                }
                              }
                              decompiledRegionSelector0 = 1;
                              break L0;
                            }
                          }
                        }
                        var6++;
                        continue L4;
                      }
                    }
                  } else {
                    return true;
                  }
                }
              }
              stackIn_24_0 = 1;
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4_ref = decompiledCaughtException;
            stackIn_28_0 = (RuntimeException) (var4_ref);

            stackIn_28_1 = new StringBuilder().append("pe.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L7;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L7;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_21_0 != 0;
          } else {
            return stackIn_24_0 != 0;
          }
        }
    }

    private final void a(ij param0, byte param1) {
        int stackIn_15_0 = 0;
        Object stackIn_38_0 = null;
        Object stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        Object stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        int stackIn_42_2 = 0;
        Object stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        int stackIn_43_2 = 0;
        int stackIn_43_3 = 0;
        Object stackIn_47_0;
        int stackIn_47_1;
        int stackIn_47_2;
        int stackIn_47_3;
        int stackIn_47_4;
        Object stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        int stackIn_48_2 = 0;
        int stackIn_48_3 = 0;
        int stackIn_48_4 = 0;
        int stackIn_48_5 = 0;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_72_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        nbb var5_ref_nbb = null;
        nbb var6 = null;
        int var7 = 0;
        int var8 = 0;
        nbb var9 = null;
        int var11 = 0;
        nbb[] var12 = null;
        int var13 = 0;
        nbb[] var14 = null;
        sg[] var15 = null;
        sg var16 = null;
        nbb var17 = null;
        var11 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (1 <= gl.field_d) {
                var14 = this.field_m;
                var4 = 0;
                L2: while (true) {
                  if (var14.length <= var4) {
                    L3: {
                      if (ie.field_p != 1) {
                        stackIn_15_0 = 0;
                        break L3;
                      } else {
                        stackIn_15_0 = 1;
                        break L3;
                      }
                    }
                    var3_int = stackIn_15_0;
                    var15 = this.field_k;
                    var5 = 0;
                    L4: while (true) {
                      if (var15.length <= var5) {
                        var12 = this.field_m;
                        var13 = 0;
                        var5 = var13;
                        L5: while (true) {
                          if (var12.length <= var13) {
                            break L1;
                          } else {
                            var17 = var12[var13];
                            var6 = var17;
                            if (null != var6) {
                              if (var17.field_v) {
                                if (!var17.field_x) {
                                  var6.field_v = false;
                                  var17.d((byte) 51);
                                  var13++;
                                  continue L5;
                                } else {
                                  var13++;
                                  continue L5;
                                }
                              } else {
                                var13++;
                                continue L5;
                              }
                            } else {
                              var13++;
                              continue L5;
                            }
                          }
                        }
                      } else {
                        var16 = var15[var5];
                        if (null != var16) {
                          if (null != var16.field_k) {
                            if (!var16.field_k.k((byte) 82)) {
                              var7 = this.field_u.a(-1, var16.field_q, 2, 77);
                              var8 = 0;
                              L6: while (true) {
                                if (var8 < var7) {
                                  var9 = this.i(21363, ada.field_a[var8]);
                                  if (var9 != null) {
                                    if (null != var9.field_k) {
                                      if (!var9.field_k.k((byte) 75)) {
                                        if (var9.field_l != var16.x(-123)) {
                                          L7: {
                                            L8: {
                                              stackIn_38_0 = this;

                                              if (var9.field_v) {
                                                break L8;
                                              } else {
                                                stackIn_38_0 = this;

                                                if (var3_int == 0) {
                                                  break L8;
                                                } else {
                                                  stackIn_39_0 = this;
                                                  stackIn_39_1 = 1;
                                                  break L7;
                                                }
                                              }
                                            }
                                            stackIn_39_0 = this;
                                            stackIn_39_1 = 0;
                                            break L7;
                                          }
                                          L9: {
                                            stackIn_42_0 = this;

                                            stackIn_42_1 = stackIn_39_1;

                                            stackIn_42_2 = 1;

                                            if (!var9.field_v) {
                                              stackIn_43_0 = this;
                                              stackIn_43_1 = stackIn_42_1;
                                              stackIn_43_2 = stackIn_42_2;
                                              stackIn_43_3 = gkb.field_o;
                                              break L9;
                                            } else {
                                              stackIn_43_0 = this;
                                              stackIn_43_1 = stackIn_39_1;
                                              stackIn_43_2 = stackIn_42_2;
                                              stackIn_43_3 = nu.field_p;
                                              break L9;
                                            }
                                          }
                                          L10: {
                                            L11: {
                                              stackIn_47_0 = this;

                                              stackIn_47_1 = stackIn_43_1;

                                              stackIn_47_2 = stackIn_43_2;

                                              stackIn_47_3 = stackIn_43_3;

                                              stackIn_47_4 = 102;

                                              if (var9.field_v) {
                                                break L11;
                                              } else {
                                                stackIn_47_0 = this;

                                                stackIn_47_1 = stackIn_43_1;

                                                stackIn_47_2 = stackIn_43_2;

                                                stackIn_47_3 = stackIn_43_3;

                                                if (var3_int == 0) {
                                                  break L11;
                                                } else {
                                                  stackIn_48_0 = this;
                                                  stackIn_48_1 = stackIn_43_1;
                                                  stackIn_48_2 = stackIn_43_2;
                                                  stackIn_48_3 = stackIn_43_3;
                                                  stackIn_48_4 = stackIn_47_4;
                                                  stackIn_48_5 = 1;
                                                  break L10;
                                                }
                                              }
                                            }
                                            stackIn_48_0 = this;
                                            stackIn_48_1 = stackIn_47_1;
                                            stackIn_48_2 = stackIn_47_2;
                                            stackIn_48_3 = stackIn_47_3;
                                            stackIn_48_4 = stackIn_47_4;
                                            stackIn_48_5 = 0;
                                            break L10;
                                          }
                                          L12: {
                                            if (!this.a(stackIn_48_1 != 0, stackIn_48_2, stackIn_48_3, (byte) stackIn_48_4, stackIn_48_5 != 0, var9, 0, var16, param0)) {
                                              break L12;
                                            } else {
                                              var9.field_x = true;
                                              var9.d((byte) -80);
                                              break L12;
                                            }
                                          }
                                          if (var16.field_k != null) {
                                            if (!var16.field_k.k((byte) 47)) {
                                              var8++;
                                              continue L6;
                                            } else {
                                              var5++;
                                              continue L4;
                                            }
                                          } else {
                                            var5++;
                                            continue L4;
                                          }
                                        } else {
                                          var8++;
                                          continue L6;
                                        }
                                      } else {
                                        var8++;
                                        continue L6;
                                      }
                                    } else {
                                      var8++;
                                      continue L6;
                                    }
                                  } else {
                                    var8++;
                                    continue L6;
                                  }
                                } else {
                                  var5++;
                                  continue L4;
                                }
                              }
                            } else {
                              var5++;
                              continue L4;
                            }
                          } else {
                            var5++;
                            continue L4;
                          }
                        } else {
                          var5++;
                          continue L4;
                        }
                      }
                    }
                  } else {
                    L13: {
                      var5_ref_nbb = var14[var4];
                      var9 = var5_ref_nbb;
                      var9 = var5_ref_nbb;
                      if (var5_ref_nbb != null) {
                        var5_ref_nbb.field_x = false;
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    var4++;
                    continue L2;
                  }
                }
              } else {
                break L1;
              }
            }
            L14: {
              if (param1 > 7) {
                break L14;
              } else {
                this.d((byte) -101, 66);
                break L14;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var3 = decompiledCaughtException;
            stackIn_71_0 = (RuntimeException) (var3);

            stackIn_71_1 = new StringBuilder().append("pe.OD(");

            if (param0 == null) {
              stackIn_72_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackIn_72_1 = (StringBuilder) ((Object) stackIn_71_1);
              stackIn_72_2 = "null";
              break L15;
            } else {
              stackIn_72_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackIn_72_1 = (StringBuilder) ((Object) stackIn_71_1);
              stackIn_72_2 = "{...}";
              break L15;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_72_0), stackIn_72_2 + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1) {
        int var3;
        int var4;
        var4 = VoidHunters.field_G;
        this.field_l = new int[param1];
        var3 = param0;
        L0: while (true) {
          if (this.field_l.length <= var3) {
            return;
          } else {
            this.field_l[var3] = oq.field_C;
            var3++;
            continue L0;
          }
        }
    }

    final void a(byte param0, mqb param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            param1.a((pe) (this), true, param0, false);
            this.a(param0 + 29584, param1, this.field_g, 3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("pe.RB(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, int param3, byte param4) {
        int var7;
        int var8;
        int var9;
        crb var10;
        int var13;
        crb[] var14;
        int var11;
        int var12;
        var13 = VoidHunters.field_G;
        var14 = this.field_e.c(0);
        var7 = param1 + param3 / 2;
        var8 = param0 + param2 / 2;
        var9 = 0;
        L0: while (true) {
          if (var14.length <= var9) {
            if (param4 <= -61) {
              L1: {
                if (!this.a(var7, var8, param2, true, 121, param3)) {
                  break L1;
                } else {
                  this.field_b.a(true, new ptb(param1, param0, param3, param2));
                  break L1;
                }
              }
              return;
            } else {
              return;
            }
          } else {
            var10 = var14[var9];
            if (null != var10) {
              var11 = var7 - var10.d(false);
              var12 = -var10.g((byte) -22) + var8;
              if (Math.abs(var11) < param3 / 2) {
                if (param2 / 2 > Math.abs(var12)) {
                  this.a(-97, 2, var10);
                  var9++;
                  continue L0;
                } else {
                  var9++;
                  continue L0;
                }
              } else {
                var9++;
                continue L0;
              }
            } else {
              var9++;
              continue L0;
            }
          }
        }
    }

    private final void a(anb param0, gda param1, int param2, int param3, anb param4) {
        RuntimeException runtimeException = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var6_int = param1.field_e;
              var7 = param1.field_l;
              var8 = param1.field_h.field_g[(param1.field_j << 615469537) % param1.field_h.field_g.length];
              if (param2 < -81) {
                break L1;
              } else {
                this.field_r = -1;
                break L1;
              }
            }
            var9 = param1.field_h.field_g[(1 + (param1.field_j << -1662266943)) % param1.field_h.field_g.length];
            var10 = param1.field_h.field_g[(2 + (param1.field_j << 190603137)) % param1.field_h.field_g.length];
            var11 = param1.field_h.field_g[((param1.field_j << 283224353) - -3) % param1.field_h.field_g.length];
            var12 = param1.field_m.field_g[(param1.field_f << 784873249) % param1.field_m.field_g.length];
            var13 = param1.field_m.field_g[((param1.field_f << -1407201247) + 1) % param1.field_m.field_g.length];
            var14 = param1.field_m.field_g[(2 + (param1.field_f << -1888056927)) % param1.field_m.field_g.length];
            var15 = param1.field_m.field_g[(3 + (param1.field_f << -1671932159)) % param1.field_m.field_g.length];
            var16 = -var9 + var11;
            var17 = var8 - var10;
            var18 = var15 - var13;
            var19 = -var14 + var12;
            var18 = -var18;
            var19 = -var19;
            var20 = param3 * (var16 + var18) >> -15722520;
            var21 = param3 * (var19 + var17) >> -1922330136;
            param0.a(var21, var6_int, var7, (byte) -123, var20);
            param4.a(-var21, var6_int, var7, (byte) -121, -var20);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (runtimeException);

            stackIn_7_1 = new StringBuilder().append("pe.BE(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          L3: {
            stackIn_11_0 = (RuntimeException) ((Object) stackIn_8_0);

            stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          L4: {
            stackIn_15_0 = (RuntimeException) ((Object) stackIn_12_0);

            stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
    }

    private final nbb a(int param0, nbb param1, sg param2, byte param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        nbb var8 = null;
        nbb stackIn_6_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param3 == 124) {
                break L1;
              } else {
                this.field_y = 57;
                break L1;
              }
            }
            L2: {
              if (null != param1) {
                break L2;
              } else {
                var6_int = param2.d(false);
                var7 = param2.g((byte) 3);
                var8 = this.a(true, var7, param4, var6_int, param0);
                param1 = var8;
                if (null == param1) {
                  break L2;
                } else {
                  param2.a(param1.field_l, (byte) -114);
                  break L2;
                }
              }
            }
            stackIn_6_0 = (nbb) (param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var6);

            stackIn_10_1 = new StringBuilder().append("pe.K(").append(param0).append(',');

            if (param1 == null) {
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
          L4: {
            stackIn_14_0 = (RuntimeException) ((Object) stackIn_11_0);

            stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param2 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_6_0;
    }

    final void a(byte param0, crb param1) {
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              param1.b(-(this.field_r >> -1502513855), param0 + 2147483521, this.field_r >> 104511425, -(this.field_o >> 1217571457), this.field_o >> 916798017);
              if (param0 == 126) {
                break L1;
              } else {
                this.field_y = 54;
                break L1;
              }
            }
            L2: {
              param1.a((pe) (this), true, (byte) 67, false);
              if (!this.field_e.a((pe) (this), 16520, param1)) {
                break L2;
              } else {
                this.b(3, (byte) 126, param1);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("pe.OB(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
    }

    public pe() {
        int var1;
        this.field_s = new oq[768];
        var1 = 0;
        L0: while (true) {
          if (this.field_s.length <= var1) {
            return;
          } else {
            this.field_s[var1] = new oq();
            var1++;
            continue L0;
          }
        }
    }

    pe(int param0) {
        int var2;
        this.field_u = new fba();
        this.field_s = new oq[768];
        var2 = 0;
        L0: while (true) {
          if (var2 >= this.field_s.length) {
            this.field_x = new ij();
            this.field_n = new ij();
            this.field_k = new sg[field_w[0]];
            this.field_m = new nbb[field_w[1]];
            this.field_e = new aib(field_w[2]);
            this.field_g = new mqb[field_w[3]];
            this.a(0, param0);
            this.field_o = 1 << fob.field_c;
            this.field_r = 1 << fob.field_c;
            this.field_p = new lua();
            return;
          } else {
            this.field_s[var2] = new oq();
            var2++;
            continue L0;
          }
        }
    }

    static {
        field_d = "Add action (Award victory)";
        field_w = new int[]{255, 1023, 1023, 255};
        field_c = new int[]{0, field_w[0], field_w[1] + field_w[0], field_w[1] + field_w[0] - -field_w[2]};
    }
}
