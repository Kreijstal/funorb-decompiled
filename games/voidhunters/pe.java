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
              if (param1 <= -37) {
                break L1;
              } else {
                field_w = null;
                break L1;
              }
            }
            ((pe) this).field_a = (rba[]) (Object) ija.a((Object) (Object) param0, (Object[]) (Object) ((pe) this).field_a, 0, ema.field_p);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) runtimeException;
            stackOut_4_1 = new StringBuilder().append("pe.PA(");
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
          throw rta.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 41);
        }
    }

    final boolean a(byte param0, boolean param1, int param2, int param3, int param4) {
        int var6 = 0;
        qob[] var7 = null;
        int var8 = 0;
        qob var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        L0: {
          var13 = VoidHunters.field_G;
          if (param0 == -99) {
            break L0;
          } else {
            nbb discarded$2 = this.c(-37, false);
            break L0;
          }
        }
        L1: {
          var6 = 0;
          var7 = ((pe) this).field_p.a(false);
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
                  var7 = ((pe) this).field_p.a(false);
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
        RuntimeException var3 = null;
        tj[] var3_array = null;
        int var4_int = 0;
        rdb[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        tj[] var7 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        var6 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              ((pe) this).field_k = (sg[]) (Object) pt.a(20, 1, (tv[]) (Object) ((pe) this).field_k, qdb.field_a, 8, param0);
              ((pe) this).field_x = new ij();
              var7 = (tj[]) (Object) kcb.a(10, aba.field_b, param0, 1, -88, (tv[]) null);
              var3_array = var7;
              if (null != var3_array) {
                var4_int = 0;
                L2: while (true) {
                  if (var4_int >= var7.length) {
                    break L1;
                  } else {
                    ((pe) this).field_x.b(param1 ^ -10290, (ksa) (Object) var7[var4_int]);
                    var4_int++;
                    continue L2;
                  }
                }
              } else {
                break L1;
              }
            }
            L3: {
              ((pe) this).field_m = (nbb[]) (Object) pt.a(param1 ^ -11, 1, (tv[]) (Object) ((pe) this).field_m, vcb.field_z, 10, param0);
              if (kv.a(false, param0)) {
                L4: {
                  if (((pe) this).field_e != null) {
                    break L4;
                  } else {
                    ((pe) this).field_e = new aib();
                    break L4;
                  }
                }
                ((pe) this).field_e.a(param0, 32);
                break L3;
              } else {
                ((pe) this).field_e = null;
                break L3;
              }
            }
            L5: {
              ((pe) this).field_n = new ij();
              var4 = (rdb[]) (Object) kcb.a(6, ioa.field_q, param0, 1, param1 ^ -113, (tv[]) null);
              if (var4 != null) {
                var5 = 0;
                L6: while (true) {
                  if (var4.length <= var5) {
                    break L5;
                  } else {
                    ((pe) this).field_n.b(-10258, (ksa) (Object) var4[var5]);
                    var5++;
                    continue L6;
                  }
                }
              } else {
                break L5;
              }
            }
            L7: {
              ((pe) this).field_g = (mqb[]) (Object) pt.a(-14, 1, (tv[]) (Object) ((pe) this).field_g, dab.field_c, 8, param0);
              ((pe) this).field_l = wkb.a((byte) 37, ((pe) this).field_l, param0, 4);
              ((pe) this).field_v = kv.a(false, param0);
              ((pe) this).field_y = param0.i(0, param1);
              ((pe) this).field_i = kv.a(false, param0);
              if (kv.a(false, param0)) {
                L8: {
                  if (null != ((pe) this).field_f) {
                    break L8;
                  } else {
                    ((pe) this).field_f = new una();
                    break L8;
                  }
                }
                ((pe) this).field_f.a(param0, false);
                break L7;
              } else {
                ((pe) this).field_f = null;
                break L7;
              }
            }
            L9: {
              ((pe) this).field_t = (cq[]) (Object) kcb.a(8, wsb.field_e, param0, 1, -98, (tv[]) (Object) ((pe) this).field_t);
              ((pe) this).field_a = (rba[]) (Object) kcb.a(4, ema.field_p, param0, 1, -84, (tv[]) (Object) ((pe) this).field_a);
              if (!kv.a(false, param0)) {
                ((pe) this).field_p = null;
                break L9;
              } else {
                ((pe) this).field_p = new lua();
                ((pe) this).field_p.a(param0, false);
                break L9;
              }
            }
            L10: {
              ((pe) this).field_o = param0.i(0, 28);
              ((pe) this).field_r = param0.i(0, 28);
              if (!kv.a(false, param0)) {
                ((pe) this).field_u = null;
                break L10;
              } else {
                L11: {
                  if (((pe) this).field_u != null) {
                    break L11;
                  } else {
                    ((pe) this).field_u = new fba();
                    break L11;
                  }
                }
                ((pe) this).field_u.a(param0, false);
                break L10;
              }
            }
            L12: {
              ((pe) this).field_j = (it[]) (Object) kcb.a(4, pgb.field_g, param0, 1, -62, (tv[]) (Object) ((pe) this).field_j);
              if (!kv.a(false, param0)) {
                ((pe) this).field_b = null;
                break L12;
              } else {
                ((pe) this).field_b = new bea();
                ((pe) this).field_b.a(param0, false);
                break L12;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var3 = decompiledCaughtException;
            stackOut_42_0 = (RuntimeException) var3;
            stackOut_42_1 = new StringBuilder().append("pe.L(");
            stackIn_45_0 = stackOut_42_0;
            stackIn_45_1 = stackOut_42_1;
            stackIn_43_0 = stackOut_42_0;
            stackIn_43_1 = stackOut_42_1;
            if (param0 == null) {
              stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
              stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
              stackOut_45_2 = "null";
              stackIn_46_0 = stackOut_45_0;
              stackIn_46_1 = stackOut_45_1;
              stackIn_46_2 = stackOut_45_2;
              break L13;
            } else {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "{...}";
              stackIn_46_0 = stackOut_43_0;
              stackIn_46_1 = stackOut_43_1;
              stackIn_46_2 = stackOut_43_2;
              break L13;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_46_0, stackIn_46_2 + 44 + param1 + 41);
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var10_int = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        L0: {
          var13 = VoidHunters.field_G;
          var10_int = 0;
          if (param4 == 30273) {
            break L0;
          } else {
            boolean discarded$5 = ((pe) this).a((byte) -34, true, 58, 71, 121);
            break L0;
          }
        }
        L1: while (true) {
          if (param0 <= var10_int) {
            return;
          } else {
            L2: {
              var11 = param1;
              var12 = param8;
              if (param6 > 0) {
                var11 = var11 + (-param6 + hob.a(vg.field_o, param6 << 1, 126));
                var12 = var12 + (-param6 + hob.a(vg.field_o, param6 << 1, 116));
                break L2;
              } else {
                break L2;
              }
            }
            this.a(param2, param5, var11, -19079, omb.field_q, var12, param7, param3);
            var10_int++;
            continue L1;
          }
        }
    }

    private final void k(int param0) {
        Object var2 = null;
        tj var2_ref = null;
        int var2_int = 0;
        wc var3 = null;
        tj var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var2 = null;
        var8 = VoidHunters.field_G;
        var2_ref = (tj) (Object) ((pe) this).field_x.d(0);
        L0: while (true) {
          if (var2_ref == null) {
            var2_int = 111 % ((param0 - 3) / 42);
            return;
          } else {
            L1: {
              L2: {
                if (var2_ref.g((byte) -104) == 1) {
                  break L2;
                } else {
                  if (var2_ref.g((byte) -104) != 6) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var3 = new wc(((pe) this).field_x);
              var4 = (tj) (Object) var3.c(570);
              L3: while (true) {
                if (null == var4) {
                  break L1;
                } else {
                  L4: {
                    if (var4.g((byte) -104) != var2_ref.g((byte) -104)) {
                      var5 = var2_ref.d(107) + -var4.d(118);
                      var6 = var2_ref.e((byte) -107) - var4.e((byte) -107);
                      var7 = ar.a(var5, (byte) 103, var6);
                      if (2048 <= var7) {
                        break L4;
                      } else {
                        L5: {
                          if (var4.g((byte) -104) != 3) {
                            var2_ref.field_o = 0;
                            break L5;
                          } else {
                            var2_ref.field_o = var2_ref.field_o - ooa.field_xb;
                            var4.f(-24805);
                            break L5;
                          }
                        }
                        var4.field_o = 0;
                        if (var2_ref.field_o <= 0) {
                          L6: {
                            ksa discarded$1 = var3.b((byte) 94);
                            var2_ref.b(-3846);
                            if (var2_ref.g((byte) -104) != 6) {
                              break L6;
                            } else {
                              if (var4.g((byte) -104) == 5) {
                                ((pe) this).a(0, gib.field_a, var2_ref.e(512), var2_ref.b(false), false, var2_ref.d(111), var2_ref.e((byte) -107));
                                break L1;
                              } else {
                                break L6;
                              }
                            }
                          }
                          qba.a(20382, var2_ref.d(113), 81, var2_ref.e((byte) -107), 50);
                          ((pe) this).a(100, var2_ref.e((byte) -107), var2_ref.d(119), 1000, 11184895, 10, 50);
                          break L1;
                        } else {
                          var4 = (tj) (Object) var3.a(19072);
                          continue L3;
                        }
                      }
                    } else {
                      break L4;
                    }
                  }
                  var4 = (tj) (Object) var3.a(19072);
                  continue L3;
                }
              }
            }
            var2_ref = (tj) (Object) ((pe) this).field_x.a((byte) 68);
            continue L0;
          }
        }
    }

    final void g(int param0, int param1) {
        L0: {
          if (~param1 > param0) {
            break L0;
          } else {
            if (((pe) this).field_l.length <= param1) {
              break L0;
            } else {
              L1: {
                if (13 == ((pe) this).d(false)) {
                  break L1;
                } else {
                  if (!pla.a(((pe) this).d(false), -4)) {
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              ((pe) this).field_l[param1] = oq.field_C;
              break L0;
            }
          }
        }
    }

    private final void a(tj param0, int param1, int param2, byte param3, int param4, int param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        uwa var10_ref_uwa = null;
        int var10 = 0;
        int var11 = 0;
        anb var12 = null;
        uwa var12_ref = null;
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
        int stackIn_31_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_80_0 = 0;
        RuntimeException stackIn_97_0 = null;
        StringBuilder stackIn_97_1 = null;
        RuntimeException stackIn_99_0 = null;
        StringBuilder stackIn_99_1 = null;
        RuntimeException stackIn_100_0 = null;
        StringBuilder stackIn_100_1 = null;
        String stackIn_100_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_30_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_79_0 = 0;
        int stackOut_77_0 = 0;
        RuntimeException stackOut_96_0 = null;
        StringBuilder stackOut_96_1 = null;
        RuntimeException stackOut_99_0 = null;
        StringBuilder stackOut_99_1 = null;
        String stackOut_99_2 = null;
        RuntimeException stackOut_97_0 = null;
        StringBuilder stackOut_97_1 = null;
        String stackOut_97_2 = null;
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
                        if (var7_int == -1) {
                          break L1;
                        } else {
                          L3: {
                            var9 = (var8 * param0.field_f >> 8) + param1;
                            var10 = (var8 * param0.field_h >> 8) + param2;
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
                            var12_ref = ccb.field_a.field_b[var7_int];
                            var13 = var12_ref.field_e;
                            if (!(var13 instanceof sg)) {
                              break L4;
                            } else {
                              var14 = (sg) (Object) var13;
                              boolean discarded$1 = var14.a((byte) 11, param0.c((byte) 45) / vgb.field_o);
                              break L4;
                            }
                          }
                          ((pe) this).a(sva.field_m, var10, var9, ei.field_a, 11184895, var11, dw.field_b);
                          wgb.field_i = null;
                          break L1;
                        }
                      } else {
                        L5: {
                          var10_ref_uwa = ccb.field_a.field_b[var9];
                          var11 = -1;
                          var12 = var10_ref_uwa.field_e;
                          if (var12 instanceof sg) {
                            var11 = ((sg) (Object) var12).q((byte) 113);
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        L6: {
                          if (0 != var10_ref_uwa.field_c) {
                            break L6;
                          } else {
                            if (param0.e(512) != var11) {
                              L7: {
                                L8: {
                                  var13_int = lv.a(var10_ref_uwa.field_d, param2, param5, var10_ref_uwa.field_g, param1, 8, param4, var10_ref_uwa.field_f, 72);
                                  if (-1 == var13_int) {
                                    break L8;
                                  } else {
                                    if (var13_int != 257) {
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
                                    stackOut_30_0 = 0;
                                    stackIn_31_0 = stackOut_30_0;
                                    break L10;
                                  } else {
                                    stackOut_29_0 = 1;
                                    stackIn_31_0 = stackOut_29_0;
                                    break L10;
                                  }
                                }
                                L11: {
                                  var14_int = stackIn_31_0;
                                  if (!trb.a(param2, var10_ref_uwa.field_f, var10_ref_uwa.field_g, var10_ref_uwa.field_d, -98, param1)) {
                                    stackOut_33_0 = 0;
                                    stackIn_34_0 = stackOut_33_0;
                                    break L11;
                                  } else {
                                    stackOut_32_0 = 1;
                                    stackIn_34_0 = stackOut_32_0;
                                    break L11;
                                  }
                                }
                                var15 = stackIn_34_0;
                                if ((var15 ^ var14_int) == 0) {
                                  L12: {
                                    if (!trb.a(param5, -var10_ref_uwa.field_h + var10_ref_uwa.field_f, var10_ref_uwa.field_g + -var10_ref_uwa.field_a, var10_ref_uwa.field_d, 56, param4)) {
                                      stackOut_38_0 = 0;
                                      stackIn_39_0 = stackOut_38_0;
                                      break L12;
                                    } else {
                                      stackOut_37_0 = 1;
                                      stackIn_39_0 = stackOut_37_0;
                                      break L12;
                                    }
                                  }
                                  L13: {
                                    var14_int = stackIn_39_0;
                                    if (!trb.a(param5, var10_ref_uwa.field_f, var10_ref_uwa.field_g, var10_ref_uwa.field_d, 68, param4)) {
                                      stackOut_41_0 = 0;
                                      stackIn_42_0 = stackOut_41_0;
                                      break L13;
                                    } else {
                                      stackOut_40_0 = 1;
                                      stackIn_42_0 = stackOut_40_0;
                                      break L13;
                                    }
                                  }
                                  var15 = stackIn_42_0;
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
                                if (Math.abs(var16 + -var10_ref_uwa.field_d) > 256) {
                                  break L14;
                                } else {
                                  var13_int = 255;
                                  break L14;
                                }
                              }
                              if (var13_int == -1) {
                                break L6;
                              } else {
                                if (var13_int == 257) {
                                  break L6;
                                } else {
                                  if (~var8 >= ~var13_int) {
                                    break L6;
                                  } else {
                                    L16: {
                                      var14_int = 0;
                                      if (var10_ref_uwa.field_i == -1) {
                                        L17: {
                                          if (trb.a(param2, var10_ref_uwa.field_f, var10_ref_uwa.field_g, var10_ref_uwa.field_d, -98, param1)) {
                                            stackOut_79_0 = 0;
                                            stackIn_80_0 = stackOut_79_0;
                                            break L17;
                                          } else {
                                            stackOut_77_0 = 1;
                                            stackIn_80_0 = stackOut_77_0;
                                            break L17;
                                          }
                                        }
                                        var14_int = stackIn_80_0;
                                        break L16;
                                      } else {
                                        var15 = (param0.field_f * var13_int >> 8) + param1;
                                        var16 = (param0.field_h * var13_int >> 8) + param2;
                                        var17 = var15 - var10_ref_uwa.field_g;
                                        var18 = -var10_ref_uwa.field_f + var16;
                                        var19 = ecb.a(var18, (byte) -77, var17);
                                        var20 = rrb.a(22433, var19 + -var10_ref_uwa.field_b);
                                        if (Math.abs(var20) < var10_ref_uwa.field_i) {
                                          var14_int = 1;
                                          break L16;
                                        } else {
                                          L18: {
                                            var21 = lv.a(var10_ref_uwa.field_d, param5, param2, var10_ref_uwa.field_g, param4, 8, param1, var10_ref_uwa.field_f, 96);
                                            if (var21 == -1) {
                                              break L18;
                                            } else {
                                              if (var21 != 257) {
                                                var13_int = 256 - var21;
                                                if (~var13_int > ~var8) {
                                                  var16 = param2 + (var13_int * param0.field_h >> 8);
                                                  var15 = (param0.field_f * var13_int >> 8) + param1;
                                                  var17 = var15 + -var10_ref_uwa.field_g;
                                                  var18 = var16 + -var10_ref_uwa.field_f;
                                                  var19 = ecb.a(var18, (byte) -77, var17);
                                                  var20 = rrb.a(22433, -var10_ref_uwa.field_b + var19);
                                                  if (~Math.abs(var20) > ~var10_ref_uwa.field_i) {
                                                    var14_int = 1;
                                                    break L18;
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
                                          break L16;
                                        }
                                      }
                                    }
                                    if (var14_int == 0) {
                                      break L6;
                                    } else {
                                      var8 = var13_int;
                                      var7_int = var9;
                                      break L6;
                                    }
                                  }
                                }
                              }
                            } else {
                              break L6;
                            }
                          }
                        }
                        var9++;
                        continue L2;
                      }
                    }
                  }
                }
              }
            }
            var7_int = -1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var7 = decompiledCaughtException;
            stackOut_96_0 = (RuntimeException) var7;
            stackOut_96_1 = new StringBuilder().append("pe.WE(");
            stackIn_99_0 = stackOut_96_0;
            stackIn_99_1 = stackOut_96_1;
            stackIn_97_0 = stackOut_96_0;
            stackIn_97_1 = stackOut_96_1;
            if (param0 == null) {
              stackOut_99_0 = (RuntimeException) (Object) stackIn_99_0;
              stackOut_99_1 = (StringBuilder) (Object) stackIn_99_1;
              stackOut_99_2 = "null";
              stackIn_100_0 = stackOut_99_0;
              stackIn_100_1 = stackOut_99_1;
              stackIn_100_2 = stackOut_99_2;
              break L19;
            } else {
              stackOut_97_0 = (RuntimeException) (Object) stackIn_97_0;
              stackOut_97_1 = (StringBuilder) (Object) stackIn_97_1;
              stackOut_97_2 = "{...}";
              stackIn_100_0 = stackOut_97_0;
              stackIn_100_1 = stackOut_97_1;
              stackIn_100_2 = stackOut_97_2;
              break L19;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_100_0, stackIn_100_2 + 44 + param1 + 44 + param2 + 44 + -103 + 44 + param4 + 44 + param5 + 41);
        }
    }

    private final boolean a(nbb param0, int param1, boolean param2, sg param3, int param4, int param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        ml var10 = null;
        qua var11 = null;
        lu var12 = null;
        ml var13 = null;
        imb var14 = null;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        ml var17_ref_ml = null;
        int var18 = 0;
        ml var18_ref_ml = null;
        lsb var19 = null;
        sg[] var19_array = null;
        crb[] var19_array2 = null;
        int var20 = 0;
        crb[] var20_ref_crb__ = null;
        sg var21_ref_sg = null;
        int var21 = 0;
        crb var22 = null;
        int var23 = 0;
        sg[] var24 = null;
        Object stackIn_5_0 = null;
        sg stackIn_5_1 = null;
        Object stackIn_7_0 = null;
        sg stackIn_7_1 = null;
        Object stackIn_8_0 = null;
        sg stackIn_8_1 = null;
        int stackIn_8_2 = 0;
        int stackIn_101_0 = 0;
        RuntimeException stackIn_103_0 = null;
        StringBuilder stackIn_103_1 = null;
        RuntimeException stackIn_105_0 = null;
        StringBuilder stackIn_105_1 = null;
        RuntimeException stackIn_106_0 = null;
        StringBuilder stackIn_106_1 = null;
        String stackIn_106_2 = null;
        RuntimeException stackIn_107_0 = null;
        StringBuilder stackIn_107_1 = null;
        RuntimeException stackIn_109_0 = null;
        StringBuilder stackIn_109_1 = null;
        RuntimeException stackIn_110_0 = null;
        StringBuilder stackIn_110_1 = null;
        String stackIn_110_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        sg stackOut_4_1 = null;
        Object stackOut_7_0 = null;
        sg stackOut_7_1 = null;
        int stackOut_7_2 = 0;
        Object stackOut_5_0 = null;
        sg stackOut_5_1 = null;
        int stackOut_5_2 = 0;
        int stackOut_100_0 = 0;
        RuntimeException stackOut_102_0 = null;
        StringBuilder stackOut_102_1 = null;
        RuntimeException stackOut_105_0 = null;
        StringBuilder stackOut_105_1 = null;
        String stackOut_105_2 = null;
        RuntimeException stackOut_103_0 = null;
        StringBuilder stackOut_103_1 = null;
        String stackOut_103_2 = null;
        RuntimeException stackOut_106_0 = null;
        StringBuilder stackOut_106_1 = null;
        RuntimeException stackOut_109_0 = null;
        StringBuilder stackOut_109_1 = null;
        String stackOut_109_2 = null;
        RuntimeException stackOut_107_0 = null;
        StringBuilder stackOut_107_1 = null;
        String stackOut_107_2 = null;
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
                  stackOut_4_0 = this;
                  stackOut_4_1 = (sg) param3;
                  stackIn_7_0 = stackOut_4_0;
                  stackIn_7_1 = stackOut_4_1;
                  stackIn_5_0 = stackOut_4_0;
                  stackIn_5_1 = stackOut_4_1;
                  if (hw.field_b != 1) {
                    stackOut_7_0 = this;
                    stackOut_7_1 = (sg) (Object) stackIn_7_1;
                    stackOut_7_2 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    stackIn_8_2 = stackOut_7_2;
                    break L2;
                  } else {
                    stackOut_5_0 = this;
                    stackOut_5_1 = (sg) (Object) stackIn_5_1;
                    stackOut_5_2 = 1;
                    stackIn_8_0 = stackOut_5_0;
                    stackIn_8_1 = stackOut_5_1;
                    stackIn_8_2 = stackOut_5_2;
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
                          if (var11.field_c.length > 0) {
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
                                    if (param0.field_k.field_f.length > 0) {
                                      param0.field_k.a((pe) this, (byte) -111, (anb) (Object) param0);
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
                              var17 = ((pe) this).field_o >> 1;
                              var18 = ((pe) this).field_r >> 1;
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
                              var24 = ((pe) this).field_k;
                              var19_array = var24;
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
                                        if (this.a((anb) (Object) param0, (anb) (Object) var21_ref_sg, 66)) {
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
                              var19_array2 = ((pe) this).field_e.c(0);
                              var20_ref_crb__ = var19_array2;
                              var21 = 0;
                              L15: while (true) {
                                if (var21 >= var20_ref_crb__.length) {
                                  break L14;
                                } else {
                                  L16: {
                                    var22 = var20_ref_crb__[var21];
                                    if (null != var22) {
                                      if (!this.a((anb) (Object) param0, (anb) (Object) var22, 80)) {
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
                          ((pe) this).a(-106, 1, (anb) (Object) param0);
                          if (var11.field_c == null) {
                            break L18;
                          } else {
                            if (var11.field_c.length > 0) {
                              var17 = 0;
                              L19: while (true) {
                                if (var11.field_c.length <= var17) {
                                  break L18;
                                } else {
                                  var18_ref_ml = var11.field_c[var17];
                                  param3.field_k.a(false, var18_ref_ml, (pe) this, 27, (anb) (Object) param3);
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
                          var17 = var10.b(-24) * fc.a(param0.e(0), (byte) -119) - var10.c((byte) 100) * eu.a(param0.e(0), 96) >> 16;
                          var18 = var10.b(126) * eu.a(param0.e(0), 41) + var10.c((byte) 100) * fc.a(param0.e(0), (byte) 77) >> 16;
                          param0.a(var14.field_e - var17, -var18 + var14.field_d, (byte) -104);
                          param0.field_h = 0;
                          param0.field_f = 0;
                          param0.d((byte) 78);
                          var19 = var13.i((byte) -112).field_o[var12.field_e];
                          var20 = var19.field_a + var12.field_b.field_b;
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
                        ((pe) this).a(40, var14.field_d, var14.field_e, 1000, 11184895, 10, 20);
                        param3.field_k.a((byte) -127, (anb) (Object) param3);
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
            stackOut_100_0 = var7_int;
            stackIn_101_0 = stackOut_100_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L21: {
            var7 = decompiledCaughtException;
            stackOut_102_0 = (RuntimeException) var7;
            stackOut_102_1 = new StringBuilder().append("pe.LF(");
            stackIn_105_0 = stackOut_102_0;
            stackIn_105_1 = stackOut_102_1;
            stackIn_103_0 = stackOut_102_0;
            stackIn_103_1 = stackOut_102_1;
            if (param0 == null) {
              stackOut_105_0 = (RuntimeException) (Object) stackIn_105_0;
              stackOut_105_1 = (StringBuilder) (Object) stackIn_105_1;
              stackOut_105_2 = "null";
              stackIn_106_0 = stackOut_105_0;
              stackIn_106_1 = stackOut_105_1;
              stackIn_106_2 = stackOut_105_2;
              break L21;
            } else {
              stackOut_103_0 = (RuntimeException) (Object) stackIn_103_0;
              stackOut_103_1 = (StringBuilder) (Object) stackIn_103_1;
              stackOut_103_2 = "{...}";
              stackIn_106_0 = stackOut_103_0;
              stackIn_106_1 = stackOut_103_1;
              stackIn_106_2 = stackOut_103_2;
              break L21;
            }
          }
          L22: {
            stackOut_106_0 = (RuntimeException) (Object) stackIn_106_0;
            stackOut_106_1 = ((StringBuilder) (Object) stackIn_106_1).append(stackIn_106_2).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_109_0 = stackOut_106_0;
            stackIn_109_1 = stackOut_106_1;
            stackIn_107_0 = stackOut_106_0;
            stackIn_107_1 = stackOut_106_1;
            if (param3 == null) {
              stackOut_109_0 = (RuntimeException) (Object) stackIn_109_0;
              stackOut_109_1 = (StringBuilder) (Object) stackIn_109_1;
              stackOut_109_2 = "null";
              stackIn_110_0 = stackOut_109_0;
              stackIn_110_1 = stackOut_109_1;
              stackIn_110_2 = stackOut_109_2;
              break L22;
            } else {
              stackOut_107_0 = (RuntimeException) (Object) stackIn_107_0;
              stackOut_107_1 = (StringBuilder) (Object) stackIn_107_1;
              stackOut_107_2 = "{...}";
              stackIn_110_0 = stackOut_107_0;
              stackIn_110_1 = stackOut_107_1;
              stackIn_110_2 = stackOut_107_2;
              break L22;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_110_0, stackIn_110_2 + 44 + param4 + 44 + param5 + 41);
        }
        return stackIn_101_0 != 0;
    }

    final qob[] d(byte param0) {
        int var2 = 68 % ((param0 - 59) / 43);
        return ((pe) this).field_p.a(false);
    }

    final void a(int param0, bea param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ((pe) this).field_b = param1;
              if (param0 == 0) {
                break L1;
              } else {
                ((pe) this).field_o = -90;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("pe.GB(").append(param0).append(44);
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int[] param7, byte param8) {
        RuntimeException var10 = null;
        int var10_int = 0;
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
        int var28 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
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
                ((pe) this).a((byte) -47, (rdb) null);
                break L1;
              }
            }
            var13 = -2147483648;
            var14 = 0;
            L2: while (true) {
              if (param7.length <= var14) {
                var14 = -var10_int + var11;
                var15 = -var12 + var13;
                var16 = var11 - -var10_int >> 1;
                var17 = var12 + var13 >> 1;
                var18 = 1;
                var19 = 0;
                L3: while (true) {
                  if (var19 >= param5) {
                    break L0;
                  } else {
                    L4: {
                      var20 = hob.a(vg.field_o, var14, 126) + var10_int;
                      var21 = hob.a(vg.field_o, var15, 125) + var12;
                      if (!fra.a(param7, var21, 2, var20)) {
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    var19--;
                    var19++;
                    continue L3;
                  }
                }
              } else {
                L5: {
                  var15 = param7[var14];
                  var16 = param7[1 + var14];
                  if (var15 <= var11) {
                    break L5;
                  } else {
                    var11 = var15;
                    break L5;
                  }
                }
                L6: {
                  if (var15 < var10_int) {
                    var10_int = var15;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if (var13 < var16) {
                    var13 = var16;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (var16 < var12) {
                    var12 = var16;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                var14 += 2;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var10 = decompiledCaughtException;
            stackOut_43_0 = (RuntimeException) var10;
            stackOut_43_1 = new StringBuilder().append("pe.MC(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44).append(param6).append(44);
            stackIn_46_0 = stackOut_43_0;
            stackIn_46_1 = stackOut_43_1;
            stackIn_44_0 = stackOut_43_0;
            stackIn_44_1 = stackOut_43_1;
            if (param7 == null) {
              stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
              stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
              stackOut_46_2 = "null";
              stackIn_47_0 = stackOut_46_0;
              stackIn_47_1 = stackOut_46_1;
              stackIn_47_2 = stackOut_46_2;
              break L9;
            } else {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "{...}";
              stackIn_47_0 = stackOut_44_0;
              stackIn_47_1 = stackOut_44_1;
              stackIn_47_2 = stackOut_44_2;
              break L9;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_47_0, stackIn_47_2 + 44 + param8 + 41);
        }
    }

    final void a(int param0, ml param1, anb param2) {
        mqb[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        mqb var6 = null;
        int var8 = 0;
        mqb[] var9 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var8 = VoidHunters.field_G;
        try {
          L0: {
            if (null == param2) {
              return;
            } else {
              var9 = ((pe) this).field_g;
              var4 = var9;
              var5 = 0;
              L1: while (true) {
                if (var9.length <= var5) {
                  L2: {
                    if (param0 == 15520) {
                      break L2;
                    } else {
                      boolean discarded$1 = this.a((nbb) null, -37, true, (sg) null, 96, -69);
                      break L2;
                    }
                  }
                  break L0;
                } else {
                  L3: {
                    var6 = var9[var5];
                    if (null == var6) {
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  var5++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4_ref = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var4_ref;
            stackOut_23_1 = new StringBuilder().append("pe.FC(").append(param0).append(44);
            stackIn_26_0 = stackOut_23_0;
            stackIn_26_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L4;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_27_0 = stackOut_24_0;
              stackIn_27_1 = stackOut_24_1;
              stackIn_27_2 = stackOut_24_2;
              break L4;
            }
          }
          L5: {
            stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(44);
            stackIn_30_0 = stackOut_27_0;
            stackIn_30_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param2 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L5;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_31_0 = stackOut_28_0;
              stackIn_31_1 = stackOut_28_1;
              stackIn_31_2 = stackOut_28_2;
              break L5;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + 41);
        }
    }

    private final void a(int param0, byte param1, anb param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              this.a(param2, true, true, false, param0);
              if (param1 > 60) {
                break L1;
              } else {
                ((pe) this).field_i = false;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("pe.HA(").append(param0).append(44).append(param1).append(44);
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param2 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
    }

    public final void a(tv param0, int param1) {
        pe var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int stackIn_48_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_52_1 = 0;
        RuntimeException stackIn_107_0 = null;
        StringBuilder stackIn_107_1 = null;
        RuntimeException stackIn_109_0 = null;
        StringBuilder stackIn_109_1 = null;
        RuntimeException stackIn_110_0 = null;
        StringBuilder stackIn_110_1 = null;
        String stackIn_110_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_47_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_51_1 = 0;
        int stackOut_49_0 = 0;
        int stackOut_49_1 = 0;
        RuntimeException stackOut_106_0 = null;
        StringBuilder stackOut_106_1 = null;
        RuntimeException stackOut_109_0 = null;
        StringBuilder stackOut_109_1 = null;
        String stackOut_109_2 = null;
        RuntimeException stackOut_107_0 = null;
        StringBuilder stackOut_107_1 = null;
        String stackOut_107_2 = null;
        try {
          L0: {
            L1: {
              var3 = (pe) (Object) param0;
              boolean discarded$19 = tja.a((ntb[]) (Object) var3.field_k, 1, (ntb[]) (Object) var3.field_k, false, 5547);
              boolean discarded$20 = trb.a(1, var3.field_x, 13, false, var3.field_x);
              boolean discarded$21 = tja.a((ntb[]) (Object) var3.field_m, 1, (ntb[]) (Object) var3.field_m, false, 5547);
              if (var3.field_e == null) {
                break L1;
              } else {
                if (var3.field_e != null) {
                  var3.field_e.a((tv) (Object) var3.field_e, -46);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              boolean discarded$22 = trb.a(1, var3.field_n, 13, false, var3.field_n);
              boolean discarded$23 = tja.a((ntb[]) (Object) var3.field_g, 1, (ntb[]) (Object) var3.field_g, false, 5547);
              if (null == var3.field_f) {
                break L2;
              } else {
                if (var3.field_f != null) {
                  var3.field_f.a((tv) (Object) var3.field_f, -105);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              boolean discarded$24 = tja.a((ntb[]) (Object) var3.field_t, 1, (ntb[]) (Object) var3.field_t, false, 5547);
              boolean discarded$25 = tja.a((ntb[]) (Object) var3.field_a, 1, (ntb[]) (Object) var3.field_a, false, 5547);
              if (null == var3.field_p) {
                break L3;
              } else {
                if (null != var3.field_p) {
                  var3.field_p.a((tv) (Object) var3.field_p, -109);
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              if (null == var3.field_u) {
                break L4;
              } else {
                if (var3.field_u == null) {
                  break L4;
                } else {
                  var3.field_u.a((tv) (Object) var3.field_u, -74);
                  break L4;
                }
              }
            }
            L5: {
              if (param1 < -19) {
                break L5;
              } else {
                int discarded$26 = ((pe) this).m(-81);
                break L5;
              }
            }
            L6: {
              boolean discarded$27 = tja.a((ntb[]) (Object) var3.field_j, 1, (ntb[]) (Object) var3.field_j, false, 5547);
              if (var3.field_b == null) {
                break L6;
              } else {
                if (var3.field_b != null) {
                  var3.field_b.a((tv) (Object) var3.field_b, -25);
                  break L6;
                } else {
                  break L6;
                }
              }
            }
            L7: {
              var4 = 0;
              if (!dn.a((tv[]) (Object) var3.field_k, false, 1, (tv[]) (Object) var3.field_k, 124)) {
                break L7;
              } else {
                var4 = 1;
                System.out.println("Ship[] ships has changed. ");
                break L7;
              }
            }
            L8: {
              int discarded$28 = 210377952;
              int discarded$29 = 210377952;
              if (!dn.a(hob.a(var3.field_x), false, 1, hob.a(var3.field_x), 123)) {
                break L8;
              } else {
                System.out.println("linklist projectiles has changed. ");
                var4 = 1;
                break L8;
              }
            }
            L9: {
              if (!dn.a((tv[]) (Object) var3.field_m, false, 1, (tv[]) (Object) var3.field_m, 1)) {
                break L9;
              } else {
                System.out.println("Debris[] debris has changed. ");
                var4 = 1;
                break L9;
              }
            }
            aib discarded$30 = var3.field_e;
            L10: {
              if (null == var3.field_e) {
                break L10;
              } else {
                if (var3.field_e.a((byte) -90, (tv) (Object) var3.field_e)) {
                  break L10;
                } else {
                  break L10;
                }
              }
            }
            L11: {
              int discarded$31 = 210377952;
              int discarded$32 = 210377952;
              if (!dn.a(hob.a(var3.field_n), false, 1, hob.a(var3.field_n), 118)) {
                break L11;
              } else {
                var4 = 1;
                System.out.println("linklist spawn_points has changed. ");
                break L11;
              }
            }
            L12: {
              if (!dn.a((tv[]) (Object) var3.field_g, false, 1, (tv[]) (Object) var3.field_g, -57)) {
                break L12;
              } else {
                var4 = 1;
                System.out.println("GrapplingHook[] grappling_hooks has changed. ");
                break L12;
              }
            }
            L13: {
              int discarded$33 = 0;
              if (!ikb.a(var3.field_l, var3.field_l)) {
                break L13;
              } else {
                System.out.println("int[] respawntimers has changed. ");
                var4 = 1;
                break L13;
              }
            }
            L14: {
              if (var3.field_v) {
                stackOut_47_0 = 0;
                stackIn_48_0 = stackOut_47_0;
                break L14;
              } else {
                stackOut_45_0 = 1;
                stackIn_48_0 = stackOut_45_0;
                break L14;
              }
            }
            L15: {
              stackOut_48_0 = stackIn_48_0;
              stackIn_51_0 = stackOut_48_0;
              stackIn_49_0 = stackOut_48_0;
              if (var3.field_v) {
                stackOut_51_0 = stackIn_51_0;
                stackOut_51_1 = 0;
                stackIn_52_0 = stackOut_51_0;
                stackIn_52_1 = stackOut_51_1;
                break L15;
              } else {
                stackOut_49_0 = stackIn_49_0;
                stackOut_49_1 = 1;
                stackIn_52_0 = stackOut_49_0;
                stackIn_52_1 = stackOut_49_1;
                break L15;
              }
            }
            L16: {
              if (stackIn_52_0 == stackIn_52_1) {
                break L16;
              } else {
                System.out.println("boolean debug has changed. before=" + var3.field_v + ", now=" + var3.field_v);
                var4 = 1;
                break L16;
              }
            }
            L17: {
              if (var3.field_y != var3.field_y) {
                break L17;
              } else {
                break L17;
              }
            }
            L18: {
              if (var3.field_i == var3.field_i) {
                break L18;
              } else {
                System.out.println("boolean swapped_teams has changed. before=" + var3.field_i + ", now=" + var3.field_i);
                var4 = 1;
                break L18;
              }
            }
            una discarded$34 = var3.field_f;
            L19: {
              if (var3.field_f == null) {
                break L19;
              } else {
                if (!var3.field_f.a((byte) -103, (tv) (Object) var3.field_f)) {
                  break L19;
                } else {
                  var4 = 1;
                  System.out.println("MissionControl mission_control has changed. before=" + var3.field_f + ", now=" + var3.field_f);
                  break L19;
                }
              }
            }
            L20: {
              if (dn.a((tv[]) (Object) var3.field_t, false, 1, (tv[]) (Object) var3.field_t, 126)) {
                System.out.println("MapZone[] map_zones has changed. ");
                var4 = 1;
                break L20;
              } else {
                break L20;
              }
            }
            L21: {
              if (!dn.a((tv[]) (Object) var3.field_a, false, 1, (tv[]) (Object) var3.field_a, 123)) {
                break L21;
              } else {
                System.out.println("ResourceNode[] res_nodes has changed. ");
                var4 = 1;
                break L21;
              }
            }
            lua discarded$35 = var3.field_p;
            L22: {
              if (var3.field_p == null) {
                break L22;
              } else {
                if (var3.field_p.a((byte) -81, (tv) (Object) var3.field_p)) {
                  break L22;
                } else {
                  break L22;
                }
              }
            }
            L23: {
              if (var3.field_o == var3.field_o) {
                break L23;
              } else {
                var4 = 1;
                System.out.println("int width has changed. before=" + var3.field_o + ", now=" + var3.field_o);
                break L23;
              }
            }
            L24: {
              if (var3.field_r != var3.field_r) {
                break L24;
              } else {
                break L24;
              }
            }
            fba discarded$36 = var3.field_u;
            L25: {
              if (var3.field_u == null) {
                break L25;
              } else {
                if (var3.field_u.a((byte) 109, (tv) (Object) var3.field_u)) {
                  break L25;
                } else {
                  break L25;
                }
              }
            }
            L26: {
              if (dn.a((tv[]) (Object) var3.field_j, false, 1, (tv[]) (Object) var3.field_j, 117)) {
                System.out.println("EscapePod[] escape_pods has changed. ");
                var4 = 1;
                break L26;
              } else {
                break L26;
              }
            }
            bea discarded$37 = var3.field_b;
            L27: {
              if (null == var3.field_b) {
                break L27;
              } else {
                if (var3.field_b.a((byte) -75, (tv) (Object) var3.field_b)) {
                  break L27;
                } else {
                  break L27;
                }
              }
            }
            L28: {
              if (var4 == 0) {
                break L28;
              } else {
                System.out.println("This instance of World has changed");
                break L28;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L29: {
            var3_ref = decompiledCaughtException;
            stackOut_106_0 = (RuntimeException) var3_ref;
            stackOut_106_1 = new StringBuilder().append("pe.F(");
            stackIn_109_0 = stackOut_106_0;
            stackIn_109_1 = stackOut_106_1;
            stackIn_107_0 = stackOut_106_0;
            stackIn_107_1 = stackOut_106_1;
            if (param0 == null) {
              stackOut_109_0 = (RuntimeException) (Object) stackIn_109_0;
              stackOut_109_1 = (StringBuilder) (Object) stackIn_109_1;
              stackOut_109_2 = "null";
              stackIn_110_0 = stackOut_109_0;
              stackIn_110_1 = stackOut_109_1;
              stackIn_110_2 = stackOut_109_2;
              break L29;
            } else {
              stackOut_107_0 = (RuntimeException) (Object) stackIn_107_0;
              stackOut_107_1 = (StringBuilder) (Object) stackIn_107_1;
              stackOut_107_2 = "{...}";
              stackIn_110_0 = stackOut_107_0;
              stackIn_110_1 = stackOut_107_1;
              stackIn_110_2 = stackOut_107_2;
              break L29;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_110_0, stackIn_110_2 + 44 + param1 + 41);
        }
    }

    final it[] j(int param0) {
        L0: {
          if (param0 == 0) {
            break L0;
          } else {
            ((pe) this).a(57, -43, (anb) null);
            break L0;
          }
        }
        return ((pe) this).field_j;
    }

    private final void b(int param0, byte param1, anb param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ((pe) this).field_u.a(param2.field_q, (byte) 94, param2.field_l, param0);
              if (param1 > 123) {
                break L1;
              } else {
                ((pe) this).field_y = -45;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("pe.R(").append(param0).append(44).append(param1).append(44);
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param2 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
    }

    private final boolean a(int param0, ml param1, imb param2, boolean param3, byte param4, sg param5, nbb param6) {
        RuntimeException var8 = null;
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
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        boolean stackOut_17_0 = false;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        try {
          L0: {
            L1: {
              if (param4 >= 54) {
                break L1;
              } else {
                ((pe) this).field_h = false;
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
                  var10 = var9.b(125) * fc.a(param6.e(0), (byte) 78) - var9.c((byte) 100) * eu.a(param6.e(0), 58) >> 16;
                  var11 = var9.b(125) * eu.a(param6.e(0), 85) - -(var9.c((byte) 100) * fc.a(param6.e(0), (byte) -120)) >> 16;
                  var12 = var10 + var9.field_r;
                  var13 = var9.field_n - -var11;
                  var14 = -var12 + param2.field_e;
                  var15 = -var13 + param2.field_d;
                  var16 = ar.a(var14, (byte) 118, var15);
                  var17 = var16 >> 8;
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
                  param6.field_f = 180 * param6.field_f >> 8;
                  param6.field_h = param6.field_h * 180 >> 8;
                  var20 = rrb.a(22433, -param6.e(0) + var19);
                  param6.field_n = (var20 << 12) / var17;
                  if (Math.abs(param6.field_n) > Math.abs(var20) << 8) {
                    param6.field_n = var20 << 4;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                param3 = true;
                param5.a(param6.field_l, (byte) -82);
                if (var16 >= 4096) {
                  break L2;
                } else {
                  if (this.a(param6, param2.field_d, false, param5, 126, param2.field_e)) {
                    param6.field_n = 0;
                    param6.field_p = 0;
                    param6.d((byte) -90);
                    stackOut_15_0 = 0;
                    stackIn_16_0 = stackOut_15_0;
                    return stackIn_16_0 != 0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            stackOut_17_0 = param3;
            stackIn_18_0 = stackOut_17_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var8 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var8;
            stackOut_19_1 = new StringBuilder().append("pe.HF(").append(param0).append(44);
            stackIn_22_0 = stackOut_19_0;
            stackIn_22_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_23_0 = stackOut_20_0;
              stackIn_23_1 = stackOut_20_1;
              stackIn_23_2 = stackOut_20_2;
              break L6;
            }
          }
          L7: {
            stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(44);
            stackIn_26_0 = stackOut_23_0;
            stackIn_26_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param2 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L7;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_27_0 = stackOut_24_0;
              stackIn_27_1 = stackOut_24_1;
              stackIn_27_2 = stackOut_24_2;
              break L7;
            }
          }
          L8: {
            stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(44).append(param3).append(44).append(param4).append(44);
            stackIn_30_0 = stackOut_27_0;
            stackIn_30_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param5 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L8;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_31_0 = stackOut_28_0;
              stackIn_31_1 = stackOut_28_1;
              stackIn_31_2 = stackOut_28_2;
              break L8;
            }
          }
          L9: {
            stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
            stackOut_31_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(44);
            stackIn_34_0 = stackOut_31_0;
            stackIn_34_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param6 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L9;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_35_0 = stackOut_32_0;
              stackIn_35_1 = stackOut_32_1;
              stackIn_35_2 = stackOut_32_2;
              break L9;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_35_0, stackIn_35_2 + 41);
        }
        return stackIn_18_0;
    }

    private final boolean a(ml param0, sg param1, ml param2, int param3, int param4, ml param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        imb var9 = null;
        ml var10 = null;
        imb var11 = null;
        ml var12 = null;
        int var13 = 0;
        nbb var14 = null;
        int var15 = 0;
        int var16 = 0;
        int stackIn_3_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_38_0 = 0;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_51_2 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
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
                              var9 = param0.field_d[var16];
                              var10 = param0.d(var9.field_c, 692);
                              var11 = param2.field_d[var16];
                              var12 = param2.d(var11.field_c, param4 + 18021);
                              if (null == var12) {
                                break L3;
                              } else {
                                L4: {
                                  if (var10 == null) {
                                    break L4;
                                  } else {
                                    if (var12.field_j == var10.field_j) {
                                      break L3;
                                    } else {
                                      break L4;
                                    }
                                  }
                                }
                                L5: {
                                  var13 = var12.field_j;
                                  var14 = this.a(var9.field_e, param1.d(false), var9.field_d, (byte) 30, param1.g((byte) -29), var13);
                                  if (var14 != null) {
                                    break L5;
                                  } else {
                                    boolean discarded$1 = this.a(param1.field_k, param5, 0, param1, var13);
                                    var14 = this.a(var9.field_e, param1.d(false), var9.field_d, (byte) 30, param1.g((byte) -23), var13);
                                    break L5;
                                  }
                                }
                                L6: {
                                  if (this.a(var16, param0, var9, var7_int == 0, (byte) 95, param1, var14)) {
                                    stackOut_29_0 = 0;
                                    stackIn_30_0 = stackOut_29_0;
                                    break L6;
                                  } else {
                                    stackOut_28_0 = 1;
                                    stackIn_30_0 = stackOut_28_0;
                                    break L6;
                                  }
                                }
                                var7_int = stackIn_30_0;
                                break L3;
                              }
                            }
                            if (var7_int != 0) {
                              stackOut_34_0 = 1;
                              stackIn_35_0 = stackOut_34_0;
                              return stackIn_35_0 != 0;
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
                              var9 = param0.field_d[var8];
                              var10 = param0.d(var9.field_c, 692);
                              var11 = param2.field_d[var8];
                              var9 = var11;
                              var9 = var11;
                              var12 = param2.d(var11.field_c, 692);
                              if (var10 == null) {
                                break L8;
                              } else {
                                if (var12 == null) {
                                  break L8;
                                } else {
                                  if (!this.a(var10, param1, var12, param3 + -1, -17329, param5)) {
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
                              stackOut_15_0 = 1;
                              stackIn_16_0 = stackOut_15_0;
                              return stackIn_16_0 != 0;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              stackOut_37_0 = 0;
              stackIn_38_0 = stackOut_37_0;
              break L0;
            } else {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var7 = decompiledCaughtException;
            stackOut_39_0 = (RuntimeException) var7;
            stackOut_39_1 = new StringBuilder().append("pe.PD(");
            stackIn_42_0 = stackOut_39_0;
            stackIn_42_1 = stackOut_39_1;
            stackIn_40_0 = stackOut_39_0;
            stackIn_40_1 = stackOut_39_1;
            if (param0 == null) {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "null";
              stackIn_43_0 = stackOut_42_0;
              stackIn_43_1 = stackOut_42_1;
              stackIn_43_2 = stackOut_42_2;
              break L9;
            } else {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "{...}";
              stackIn_43_0 = stackOut_40_0;
              stackIn_43_1 = stackOut_40_1;
              stackIn_43_2 = stackOut_40_2;
              break L9;
            }
          }
          L10: {
            stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
            stackOut_43_1 = ((StringBuilder) (Object) stackIn_43_1).append(stackIn_43_2).append(44);
            stackIn_46_0 = stackOut_43_0;
            stackIn_46_1 = stackOut_43_1;
            stackIn_44_0 = stackOut_43_0;
            stackIn_44_1 = stackOut_43_1;
            if (param1 == null) {
              stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
              stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
              stackOut_46_2 = "null";
              stackIn_47_0 = stackOut_46_0;
              stackIn_47_1 = stackOut_46_1;
              stackIn_47_2 = stackOut_46_2;
              break L10;
            } else {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "{...}";
              stackIn_47_0 = stackOut_44_0;
              stackIn_47_1 = stackOut_44_1;
              stackIn_47_2 = stackOut_44_2;
              break L10;
            }
          }
          L11: {
            stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
            stackOut_47_1 = ((StringBuilder) (Object) stackIn_47_1).append(stackIn_47_2).append(44);
            stackIn_50_0 = stackOut_47_0;
            stackIn_50_1 = stackOut_47_1;
            stackIn_48_0 = stackOut_47_0;
            stackIn_48_1 = stackOut_47_1;
            if (param2 == null) {
              stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
              stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
              stackOut_50_2 = "null";
              stackIn_51_0 = stackOut_50_0;
              stackIn_51_1 = stackOut_50_1;
              stackIn_51_2 = stackOut_50_2;
              break L11;
            } else {
              stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
              stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
              stackOut_48_2 = "{...}";
              stackIn_51_0 = stackOut_48_0;
              stackIn_51_1 = stackOut_48_1;
              stackIn_51_2 = stackOut_48_2;
              break L11;
            }
          }
          L12: {
            stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
            stackOut_51_1 = ((StringBuilder) (Object) stackIn_51_1).append(stackIn_51_2).append(44).append(param3).append(44).append(param4).append(44);
            stackIn_54_0 = stackOut_51_0;
            stackIn_54_1 = stackOut_51_1;
            stackIn_52_0 = stackOut_51_0;
            stackIn_52_1 = stackOut_51_1;
            if (param5 == null) {
              stackOut_54_0 = (RuntimeException) (Object) stackIn_54_0;
              stackOut_54_1 = (StringBuilder) (Object) stackIn_54_1;
              stackOut_54_2 = "null";
              stackIn_55_0 = stackOut_54_0;
              stackIn_55_1 = stackOut_54_1;
              stackIn_55_2 = stackOut_54_2;
              break L12;
            } else {
              stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
              stackOut_52_1 = (StringBuilder) (Object) stackIn_52_1;
              stackOut_52_2 = "{...}";
              stackIn_55_0 = stackOut_52_0;
              stackIn_55_1 = stackOut_52_1;
              stackIn_55_2 = stackOut_52_2;
              break L12;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_55_0, stackIn_55_2 + 41);
        }
        return stackIn_38_0 != 0;
    }

    final int d(boolean param0) {
        L0: {
          if (!param0) {
            break L0;
          } else {
            ((pe) this).a(-85, 55);
            break L0;
          }
        }
        return ((pe) this).field_y;
    }

    final int e(boolean param0) {
        if (!param0) {
            int discarded$0 = ((pe) this).e(true);
        }
        if (null == ((pe) this).field_t) {
            return 0;
        }
        return ((pe) this).field_t.length;
    }

    final void a(byte param0, rdb param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ((pe) this).field_n.b(-10258, (ksa) (Object) param1);
              if (param0 <= -51) {
                break L1;
              } else {
                ((pe) this).e(16, -28);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("pe.TA(").append(param0).append(44);
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
    }

    private final void a(int param0, boolean param1, int param2) {
        qob var6 = null;
        var6 = ((pe) this).field_p.a((byte) 54, param2);
        var6 = var6;
        L0: {
          if (param1) {
            ((pe) this).field_u.a(new int[4], param2, 0, true, 0);
            break L0;
          } else {
            break L0;
          }
        }
    }

    final void a(int param0, boolean param1, nwa param2, tfa[] param3, lbb param4, int param5, tfa[] param6) {
        Object[] var16_ref = null;
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        sg[] var14_ref_sg__ = null;
        int var14 = 0;
        int var15_int = 0;
        Object var15 = null;
        sg var16_ref_sg = null;
        nbb var16_ref_nbb = null;
        int var16 = 0;
        mqb[] var16_ref_mqb__ = null;
        it[] var16_ref_it__ = null;
        sg[] var16_ref_sg__ = null;
        int var17_int = 0;
        nbb var17 = null;
        sg var18 = null;
        int var18_int = 0;
        mqb var18_ref = null;
        it var18_ref2 = null;
        Object var20 = null;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        Object var24 = null;
        tj var25 = null;
        nbb stackIn_27_0 = null;
        Object stackIn_27_1 = null;
        int stackIn_27_2 = 0;
        int stackIn_27_3 = 0;
        nbb stackIn_29_0 = null;
        Object stackIn_29_1 = null;
        int stackIn_29_2 = 0;
        int stackIn_29_3 = 0;
        nbb stackIn_30_0 = null;
        Object stackIn_30_1 = null;
        int stackIn_30_2 = 0;
        int stackIn_30_3 = 0;
        int stackIn_30_4 = 0;
        nbb stackIn_35_0 = null;
        Object stackIn_35_1 = null;
        int stackIn_35_2 = 0;
        int stackIn_35_3 = 0;
        nbb stackIn_37_0 = null;
        Object stackIn_37_1 = null;
        int stackIn_37_2 = 0;
        int stackIn_37_3 = 0;
        nbb stackIn_38_0 = null;
        Object stackIn_38_1 = null;
        int stackIn_38_2 = 0;
        int stackIn_38_3 = 0;
        int stackIn_38_4 = 0;
        RuntimeException stackIn_123_0 = null;
        StringBuilder stackIn_123_1 = null;
        RuntimeException stackIn_125_0 = null;
        StringBuilder stackIn_125_1 = null;
        RuntimeException stackIn_126_0 = null;
        StringBuilder stackIn_126_1 = null;
        String stackIn_126_2 = null;
        RuntimeException stackIn_127_0 = null;
        StringBuilder stackIn_127_1 = null;
        RuntimeException stackIn_129_0 = null;
        StringBuilder stackIn_129_1 = null;
        RuntimeException stackIn_130_0 = null;
        StringBuilder stackIn_130_1 = null;
        String stackIn_130_2 = null;
        RuntimeException stackIn_131_0 = null;
        StringBuilder stackIn_131_1 = null;
        RuntimeException stackIn_133_0 = null;
        StringBuilder stackIn_133_1 = null;
        RuntimeException stackIn_134_0 = null;
        StringBuilder stackIn_134_1 = null;
        String stackIn_134_2 = null;
        RuntimeException stackIn_135_0 = null;
        StringBuilder stackIn_135_1 = null;
        RuntimeException stackIn_137_0 = null;
        StringBuilder stackIn_137_1 = null;
        RuntimeException stackIn_138_0 = null;
        StringBuilder stackIn_138_1 = null;
        String stackIn_138_2 = null;
        RuntimeException decompiledCaughtException = null;
        nbb stackOut_34_0 = null;
        Object stackOut_34_1 = null;
        int stackOut_34_2 = 0;
        int stackOut_34_3 = 0;
        nbb stackOut_37_0 = null;
        Object stackOut_37_1 = null;
        int stackOut_37_2 = 0;
        int stackOut_37_3 = 0;
        int stackOut_37_4 = 0;
        nbb stackOut_35_0 = null;
        Object stackOut_35_1 = null;
        int stackOut_35_2 = 0;
        int stackOut_35_3 = 0;
        int stackOut_35_4 = 0;
        nbb stackOut_26_0 = null;
        Object stackOut_26_1 = null;
        int stackOut_26_2 = 0;
        int stackOut_26_3 = 0;
        nbb stackOut_29_0 = null;
        Object stackOut_29_1 = null;
        int stackOut_29_2 = 0;
        int stackOut_29_3 = 0;
        int stackOut_29_4 = 0;
        nbb stackOut_27_0 = null;
        Object stackOut_27_1 = null;
        int stackOut_27_2 = 0;
        int stackOut_27_3 = 0;
        int stackOut_27_4 = 0;
        RuntimeException stackOut_122_0 = null;
        StringBuilder stackOut_122_1 = null;
        RuntimeException stackOut_125_0 = null;
        StringBuilder stackOut_125_1 = null;
        String stackOut_125_2 = null;
        RuntimeException stackOut_123_0 = null;
        StringBuilder stackOut_123_1 = null;
        String stackOut_123_2 = null;
        RuntimeException stackOut_126_0 = null;
        StringBuilder stackOut_126_1 = null;
        RuntimeException stackOut_129_0 = null;
        StringBuilder stackOut_129_1 = null;
        String stackOut_129_2 = null;
        RuntimeException stackOut_127_0 = null;
        StringBuilder stackOut_127_1 = null;
        String stackOut_127_2 = null;
        RuntimeException stackOut_130_0 = null;
        StringBuilder stackOut_130_1 = null;
        RuntimeException stackOut_133_0 = null;
        StringBuilder stackOut_133_1 = null;
        String stackOut_133_2 = null;
        RuntimeException stackOut_131_0 = null;
        StringBuilder stackOut_131_1 = null;
        String stackOut_131_2 = null;
        RuntimeException stackOut_134_0 = null;
        StringBuilder stackOut_134_1 = null;
        RuntimeException stackOut_137_0 = null;
        StringBuilder stackOut_137_1 = null;
        String stackOut_137_2 = null;
        RuntimeException stackOut_135_0 = null;
        StringBuilder stackOut_135_1 = null;
        String stackOut_135_2 = null;
        var16_ref = null;
        var24 = null;
        var21 = VoidHunters.field_G;
        try {
          L0: {
            oua.field_a = param1;
            th.field_o = param5;
            vg.field_o = new Random((long)(10234 * th.field_o));
            ccb.field_a.c(39);
            ((pe) this).field_e.a(true);
            this.a(param4, param6, (byte) -40, param2);
            this.a(param3, 1, param6, param5);
            var8_int = ((pe) this).field_o >> 1;
            var9 = ((pe) this).field_r >> 1;
            var10 = -var8_int;
            var11 = var8_int;
            var12 = -var9;
            var13 = var9;
            var14_ref_sg__ = ((pe) this).field_k;
            var15_int = 0;
            L1: while (true) {
              if (var15_int >= var14_ref_sg__.length) {
                L2: {
                  if (param0 == 1799937864) {
                    break L2;
                  } else {
                    boolean discarded$3 = this.a((ml) null, (sg) null, (ml) null, 27, 102, (ml) null);
                    break L2;
                  }
                }
                var25 = (tj) (Object) ((pe) this).field_x.d(0);
                L3: while (true) {
                  if (var25 == null) {
                    var14 = 0;
                    L4: while (true) {
                      if (((pe) this).field_s.length <= var14) {
                        var14 = 0;
                        var22 = 0;
                        var15_int = var22;
                        L5: while (true) {
                          if (((pe) this).field_m.length <= var22) {
                            L6: {
                              if (var14 > kva.field_g) {
                                var15 = null;
                                var16 = hob.a(vg.field_o, var14, 123);
                                var17_int = 0;
                                var18_int = 0;
                                L7: while (true) {
                                  L8: {
                                    if (((pe) this).field_m.length <= var18_int) {
                                      break L8;
                                    } else {
                                      L9: {
                                        if (((pe) this).field_m[var18_int] != null) {
                                          if (var17_int != var16) {
                                            var17_int++;
                                            break L9;
                                          } else {
                                            var15 = (Object) (Object) ((pe) this).field_m[var18_int];
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
                                    if (((anb) var15).field_k.k(0) != 47) {
                                      ((pe) this).a(param0 ^ -1799937853, 1, (anb) var15);
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
                            var15 = (Object) (Object) ((pe) this).field_e.c(0);
                            var16_ref = (Object[]) (Object) var15;
                            var17_int = 0;
                            L10: while (true) {
                              if (var16_ref.length <= var17_int) {
                                var16_ref_mqb__ = ((pe) this).field_g;
                                var17_int = 0;
                                L11: while (true) {
                                  if (var17_int >= var16_ref_mqb__.length) {
                                    L12: {
                                      if (((pe) this).field_j != null) {
                                        var16_ref_it__ = ((pe) this).field_j;
                                        var17_int = 0;
                                        L13: while (true) {
                                          if (var17_int >= var16_ref_it__.length) {
                                            break L12;
                                          } else {
                                            var18_ref2 = var16_ref_it__[var17_int];
                                            var18_ref2.c((byte) -7);
                                            var17_int++;
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
                                    var16_ref_sg__ = ((pe) this).field_k;
                                    var17_int = 0;
                                    L14: while (true) {
                                      if (var17_int >= var16_ref_sg__.length) {
                                        var16_ref_mqb__ = ((pe) this).field_g;
                                        var17_int = 0;
                                        L15: while (true) {
                                          if (var16_ref_mqb__.length <= var17_int) {
                                            var16_ref_mqb__ = (mqb[]) var15;
                                            var17_int = 0;
                                            L16: while (true) {
                                              if (var17_int >= var16_ref_mqb__.length) {
                                                var23 = 0;
                                                var16 = var23;
                                                L17: while (true) {
                                                  if (var23 >= ((pe) this).field_m.length) {
                                                    break L0;
                                                  } else {
                                                    L18: {
                                                      var17 = ((pe) this).field_m[var23];
                                                      if (var17 == null) {
                                                        break L18;
                                                      } else {
                                                        break L18;
                                                      }
                                                    }
                                                    var23++;
                                                    continue L17;
                                                  }
                                                }
                                              } else {
                                                L19: {
                                                  var18_ref = var16_ref_mqb__[var17_int];
                                                  if (var18_ref != null) {
                                                    ((crb) (Object) var18_ref).b(24, ((crb) (Object) var18_ref).field_s);
                                                    break L19;
                                                  } else {
                                                    break L19;
                                                  }
                                                }
                                                var17_int++;
                                                continue L16;
                                              }
                                            }
                                          } else {
                                            L20: {
                                              var18_ref = var16_ref_mqb__[var17_int];
                                              if (var18_ref != null) {
                                                var18_ref.b(24, var18_ref.field_s);
                                                break L20;
                                              } else {
                                                break L20;
                                              }
                                            }
                                            var17_int++;
                                            continue L15;
                                          }
                                        }
                                      } else {
                                        L21: {
                                          var18 = var16_ref_sg__[var17_int];
                                          if (null == var18) {
                                            break L21;
                                          } else {
                                            break L21;
                                          }
                                        }
                                        var17_int++;
                                        continue L14;
                                      }
                                    }
                                  } else {
                                    L22: {
                                      var18_ref = var16_ref_mqb__[var17_int];
                                      if (var18_ref == null) {
                                        break L22;
                                      } else {
                                        break L22;
                                      }
                                    }
                                    var17_int++;
                                    continue L11;
                                  }
                                }
                              } else {
                                L23: {
                                  var18_ref = (mqb) var16_ref[var17_int];
                                  if (var18_ref == null) {
                                    break L23;
                                  } else {
                                    break L23;
                                  }
                                }
                                var17_int++;
                                continue L10;
                              }
                            }
                          } else {
                            L24: {
                              var16_ref_nbb = ((pe) this).field_m[var22];
                              if (var16_ref_nbb != null) {
                                var14++;
                                if (!var16_ref_nbb.c(var13, var11, param0 ^ 1799937849, var12, var10)) {
                                  if (var16_ref_nbb.k(param0 ^ 1344029312)) {
                                    L25: {
                                      var16_ref_nbb = this.c(var22, false);
                                      stackOut_34_0 = (nbb) var16_ref_nbb;
                                      stackOut_34_1 = this;
                                      stackOut_34_2 = 0;
                                      stackOut_34_3 = 67;
                                      stackIn_37_0 = stackOut_34_0;
                                      stackIn_37_1 = stackOut_34_1;
                                      stackIn_37_2 = stackOut_34_2;
                                      stackIn_37_3 = stackOut_34_3;
                                      stackIn_35_0 = stackOut_34_0;
                                      stackIn_35_1 = stackOut_34_1;
                                      stackIn_35_2 = stackOut_34_2;
                                      stackIn_35_3 = stackOut_34_3;
                                      if (hw.field_b != 1) {
                                        stackOut_37_0 = (nbb) (Object) stackIn_37_0;
                                        stackOut_37_1 = this;
                                        stackOut_37_2 = stackIn_37_2;
                                        stackOut_37_3 = stackIn_37_3;
                                        stackOut_37_4 = 0;
                                        stackIn_38_0 = stackOut_37_0;
                                        stackIn_38_1 = stackOut_37_1;
                                        stackIn_38_2 = stackOut_37_2;
                                        stackIn_38_3 = stackOut_37_3;
                                        stackIn_38_4 = stackOut_37_4;
                                        break L25;
                                      } else {
                                        stackOut_35_0 = (nbb) (Object) stackIn_35_0;
                                        stackOut_35_1 = this;
                                        stackOut_35_2 = stackIn_35_2;
                                        stackOut_35_3 = stackIn_35_3;
                                        stackOut_35_4 = 1;
                                        stackIn_38_0 = stackOut_35_0;
                                        stackIn_38_1 = stackOut_35_1;
                                        stackIn_38_2 = stackOut_35_2;
                                        stackIn_38_3 = stackOut_35_3;
                                        stackIn_38_4 = stackOut_35_4;
                                        break L25;
                                      }
                                    }
                                    ((nbb) (Object) stackIn_38_0).a((pe) this, stackIn_38_2 != 0, (byte) stackIn_38_3, stackIn_38_4 != 0);
                                    break L24;
                                  } else {
                                    break L24;
                                  }
                                } else {
                                  L26: {
                                    var16_ref_nbb = this.c(var22, false);
                                    boolean discarded$4 = var16_ref_nbb.b(var12, 2147483647, var13, var10, var11);
                                    stackOut_26_0 = (nbb) var16_ref_nbb;
                                    stackOut_26_1 = this;
                                    stackOut_26_2 = 1;
                                    stackOut_26_3 = 67;
                                    stackIn_29_0 = stackOut_26_0;
                                    stackIn_29_1 = stackOut_26_1;
                                    stackIn_29_2 = stackOut_26_2;
                                    stackIn_29_3 = stackOut_26_3;
                                    stackIn_27_0 = stackOut_26_0;
                                    stackIn_27_1 = stackOut_26_1;
                                    stackIn_27_2 = stackOut_26_2;
                                    stackIn_27_3 = stackOut_26_3;
                                    if (hw.field_b != 1) {
                                      stackOut_29_0 = (nbb) (Object) stackIn_29_0;
                                      stackOut_29_1 = this;
                                      stackOut_29_2 = stackIn_29_2;
                                      stackOut_29_3 = stackIn_29_3;
                                      stackOut_29_4 = 0;
                                      stackIn_30_0 = stackOut_29_0;
                                      stackIn_30_1 = stackOut_29_1;
                                      stackIn_30_2 = stackOut_29_2;
                                      stackIn_30_3 = stackOut_29_3;
                                      stackIn_30_4 = stackOut_29_4;
                                      break L26;
                                    } else {
                                      stackOut_27_0 = (nbb) (Object) stackIn_27_0;
                                      stackOut_27_1 = this;
                                      stackOut_27_2 = stackIn_27_2;
                                      stackOut_27_3 = stackIn_27_3;
                                      stackOut_27_4 = 1;
                                      stackIn_30_0 = stackOut_27_0;
                                      stackIn_30_1 = stackOut_27_1;
                                      stackIn_30_2 = stackOut_27_2;
                                      stackIn_30_3 = stackOut_27_3;
                                      stackIn_30_4 = stackOut_27_4;
                                      break L26;
                                    }
                                  }
                                  ((nbb) (Object) stackIn_30_0).a((pe) this, stackIn_30_2 != 0, (byte) stackIn_30_3, stackIn_30_4 != 0);
                                  break L24;
                                }
                              } else {
                                break L24;
                              }
                            }
                            var22++;
                            continue L5;
                          }
                        }
                      } else {
                        L27: {
                          if (((pe) this).field_s[var14].b((byte) -126)) {
                            ((pe) this).field_s[var14].a(-8460);
                            break L27;
                          } else {
                            break L27;
                          }
                        }
                        var14++;
                        continue L4;
                      }
                    }
                  } else {
                    var25.a((byte) 93, (pe) this);
                    var25 = (tj) (Object) ((pe) this).field_x.a((byte) 101);
                    continue L3;
                  }
                }
              } else {
                L28: {
                  var16_ref_sg = var14_ref_sg__[var15_int];
                  var18 = var16_ref_sg;
                  var18 = var16_ref_sg;
                  if (var16_ref_sg != null) {
                    boolean discarded$5 = var16_ref_sg.b(var12, param0 ^ 347545783, var13, var10, var11);
                    break L28;
                  } else {
                    break L28;
                  }
                }
                var15_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L29: {
            var8 = decompiledCaughtException;
            stackOut_122_0 = (RuntimeException) var8;
            stackOut_122_1 = new StringBuilder().append("pe.BA(").append(param0).append(44).append(param1).append(44);
            stackIn_125_0 = stackOut_122_0;
            stackIn_125_1 = stackOut_122_1;
            stackIn_123_0 = stackOut_122_0;
            stackIn_123_1 = stackOut_122_1;
            if (param2 == null) {
              stackOut_125_0 = (RuntimeException) (Object) stackIn_125_0;
              stackOut_125_1 = (StringBuilder) (Object) stackIn_125_1;
              stackOut_125_2 = "null";
              stackIn_126_0 = stackOut_125_0;
              stackIn_126_1 = stackOut_125_1;
              stackIn_126_2 = stackOut_125_2;
              break L29;
            } else {
              stackOut_123_0 = (RuntimeException) (Object) stackIn_123_0;
              stackOut_123_1 = (StringBuilder) (Object) stackIn_123_1;
              stackOut_123_2 = "{...}";
              stackIn_126_0 = stackOut_123_0;
              stackIn_126_1 = stackOut_123_1;
              stackIn_126_2 = stackOut_123_2;
              break L29;
            }
          }
          L30: {
            stackOut_126_0 = (RuntimeException) (Object) stackIn_126_0;
            stackOut_126_1 = ((StringBuilder) (Object) stackIn_126_1).append(stackIn_126_2).append(44);
            stackIn_129_0 = stackOut_126_0;
            stackIn_129_1 = stackOut_126_1;
            stackIn_127_0 = stackOut_126_0;
            stackIn_127_1 = stackOut_126_1;
            if (param3 == null) {
              stackOut_129_0 = (RuntimeException) (Object) stackIn_129_0;
              stackOut_129_1 = (StringBuilder) (Object) stackIn_129_1;
              stackOut_129_2 = "null";
              stackIn_130_0 = stackOut_129_0;
              stackIn_130_1 = stackOut_129_1;
              stackIn_130_2 = stackOut_129_2;
              break L30;
            } else {
              stackOut_127_0 = (RuntimeException) (Object) stackIn_127_0;
              stackOut_127_1 = (StringBuilder) (Object) stackIn_127_1;
              stackOut_127_2 = "{...}";
              stackIn_130_0 = stackOut_127_0;
              stackIn_130_1 = stackOut_127_1;
              stackIn_130_2 = stackOut_127_2;
              break L30;
            }
          }
          L31: {
            stackOut_130_0 = (RuntimeException) (Object) stackIn_130_0;
            stackOut_130_1 = ((StringBuilder) (Object) stackIn_130_1).append(stackIn_130_2).append(44);
            stackIn_133_0 = stackOut_130_0;
            stackIn_133_1 = stackOut_130_1;
            stackIn_131_0 = stackOut_130_0;
            stackIn_131_1 = stackOut_130_1;
            if (param4 == null) {
              stackOut_133_0 = (RuntimeException) (Object) stackIn_133_0;
              stackOut_133_1 = (StringBuilder) (Object) stackIn_133_1;
              stackOut_133_2 = "null";
              stackIn_134_0 = stackOut_133_0;
              stackIn_134_1 = stackOut_133_1;
              stackIn_134_2 = stackOut_133_2;
              break L31;
            } else {
              stackOut_131_0 = (RuntimeException) (Object) stackIn_131_0;
              stackOut_131_1 = (StringBuilder) (Object) stackIn_131_1;
              stackOut_131_2 = "{...}";
              stackIn_134_0 = stackOut_131_0;
              stackIn_134_1 = stackOut_131_1;
              stackIn_134_2 = stackOut_131_2;
              break L31;
            }
          }
          L32: {
            stackOut_134_0 = (RuntimeException) (Object) stackIn_134_0;
            stackOut_134_1 = ((StringBuilder) (Object) stackIn_134_1).append(stackIn_134_2).append(44).append(param5).append(44);
            stackIn_137_0 = stackOut_134_0;
            stackIn_137_1 = stackOut_134_1;
            stackIn_135_0 = stackOut_134_0;
            stackIn_135_1 = stackOut_134_1;
            if (param6 == null) {
              stackOut_137_0 = (RuntimeException) (Object) stackIn_137_0;
              stackOut_137_1 = (StringBuilder) (Object) stackIn_137_1;
              stackOut_137_2 = "null";
              stackIn_138_0 = stackOut_137_0;
              stackIn_138_1 = stackOut_137_1;
              stackIn_138_2 = stackOut_137_2;
              break L32;
            } else {
              stackOut_135_0 = (RuntimeException) (Object) stackIn_135_0;
              stackOut_135_1 = (StringBuilder) (Object) stackIn_135_1;
              stackOut_135_2 = "{...}";
              stackIn_138_0 = stackOut_135_0;
              stackIn_138_1 = stackOut_135_1;
              stackIn_138_2 = stackOut_135_2;
              break L32;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_138_0, stackIn_138_2 + 41);
        }
    }

    final void b(int param0, byte param1) {
        if (param1 == 23) {
          ((pe) this).field_y = param0;
          return;
        } else {
          return;
        }
    }

    private final boolean a(anb param0, int param1, tj param2) {
        ml var4 = null;
        RuntimeException var4_ref = null;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_11_0 = 0;
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
        int stackOut_5_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
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
              if (!param2.c(112)) {
                param0.a(gab.field_b, param2, -4414);
                if (!gab.field_b.a((byte) -97)) {
                  break L1;
                } else {
                  wgb.field_i = param0;
                  stackOut_5_0 = 1;
                  stackIn_6_0 = stackOut_5_0;
                  return stackIn_6_0 != 0;
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
              stackOut_10_0 = 0;
              stackIn_11_0 = stackOut_10_0;
              break L0;
            } else {
              stackOut_8_0 = 1;
              stackIn_9_0 = stackOut_8_0;
              return stackIn_9_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4_ref;
            stackOut_12_1 = new StringBuilder().append("pe.U(");
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
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
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44).append(param1).append(44);
            stackIn_19_0 = stackOut_16_0;
            stackIn_19_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
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
          throw rta.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 41);
        }
        return stackIn_11_0 != 0;
    }

    private final void a(tfa[] param0, int param1, tfa[] param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
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
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_85_0 = null;
        StringBuilder stackIn_85_1 = null;
        RuntimeException stackIn_87_0 = null;
        StringBuilder stackIn_87_1 = null;
        RuntimeException stackIn_88_0 = null;
        StringBuilder stackIn_88_1 = null;
        String stackIn_88_2 = null;
        RuntimeException stackIn_89_0 = null;
        StringBuilder stackIn_89_1 = null;
        RuntimeException stackIn_91_0 = null;
        StringBuilder stackIn_91_1 = null;
        RuntimeException stackIn_92_0 = null;
        StringBuilder stackIn_92_1 = null;
        String stackIn_92_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_84_0 = null;
        StringBuilder stackOut_84_1 = null;
        RuntimeException stackOut_87_0 = null;
        StringBuilder stackOut_87_1 = null;
        String stackOut_87_2 = null;
        RuntimeException stackOut_85_0 = null;
        StringBuilder stackOut_85_1 = null;
        String stackOut_85_2 = null;
        RuntimeException stackOut_88_0 = null;
        StringBuilder stackOut_88_1 = null;
        RuntimeException stackOut_91_0 = null;
        StringBuilder stackOut_91_1 = null;
        String stackOut_91_2 = null;
        RuntimeException stackOut_89_0 = null;
        StringBuilder stackOut_89_1 = null;
        String stackOut_89_2 = null;
        var17 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var5_int = wra.field_p;
              var6 = uja.field_b;
              if (1 == fra.field_a) {
                var5_int = var5_int * lja.field_d;
                var6 = var6 * lja.field_d;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param3 % var5_int != 0) {
                stackOut_8_0 = 0;
                stackIn_9_0 = stackOut_8_0;
                break L2;
              } else {
                stackOut_6_0 = 1;
                stackIn_9_0 = stackOut_6_0;
                break L2;
              }
            }
            L3: {
              var7 = stackIn_9_0;
              if (param3 % var6 != 0) {
                stackOut_12_0 = 0;
                stackIn_13_0 = stackOut_12_0;
                break L3;
              } else {
                stackOut_10_0 = 1;
                stackIn_13_0 = stackOut_10_0;
                break L3;
              }
            }
            var8 = stackIn_13_0;
            var9 = ((pe) this).field_k;
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
                        if (var11.o((byte) -117) < 0) {
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
                                    var11.a((pe) this, true, (byte) 67, true);
                                    boolean discarded$6 = var14_ref_aoa.a(var11, (byte) -73, (pe) this);
                                    if (!pqa.a(4096, 11284)) {
                                      break L8;
                                    } else {
                                      var11.a(var14_ref_aoa, 4);
                                      break L8;
                                    }
                                  }
                                }
                              }
                              if (var11.d(9, 42)) {
                                var11.a((pe) this, true, (byte) 67, true);
                                break L8;
                              } else {
                                if (!var11.a((pe) this, var12.field_d, var12.field_e, 0)) {
                                  if (4 != var12.field_b) {
                                    break L8;
                                  } else {
                                    var11.a(-94, var12.field_b, (pe) this, var12.field_e, var12.field_d);
                                    break L8;
                                  }
                                } else {
                                  L10: {
                                    var15 = this.a(var12, -72, var13, var11) ? 1 : 0;
                                    if (di.field_p != 1) {
                                      break L10;
                                    } else {
                                      if (lrb.field_e != 1) {
                                        break L10;
                                      } else {
                                        if (var11.field_w) {
                                          if ((var12.field_f & 128) != 0) {
                                            int discarded$7 = var11.a(-114, var12.field_e, var12.field_d);
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
                                          var16 = gca.a((pe) this, (byte) 63, var11.o((byte) -117), var11);
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
                                        int discarded$8 = var11.a(-125, var12.field_e, var12.field_d);
                                        break L11;
                                      }
                                    } else {
                                      break L11;
                                    }
                                  }
                                  var11.a((pe) this, true, (byte) 67, true);
                                  var11.a((pe) this, var12.field_f, false, var12.field_d, var12.field_e);
                                  var11.a(-71, var12.field_b, (pe) this, var12.field_e, var12.field_d);
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
                                    var11.b((byte) 113, (tv) (Object) var12.field_g);
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
                          var11.a((pe) this, true, (byte) 67, true);
                          if (!((pe) this).field_v) {
                            var11.a(true, (pe) this);
                            break L14;
                          } else {
                            break L14;
                          }
                        }
                        if (var11.field_k.k(0) == 0) {
                          if (param3 % wj.field_p != 0) {
                            break L6;
                          } else {
                            int discarded$9 = var11.c(bjb.field_o, (byte) -2);
                            break L6;
                          }
                        } else {
                          if (var8 == 0) {
                            break L6;
                          } else {
                            int discarded$10 = var11.c(ela.field_q, (byte) -2);
                            break L6;
                          }
                        }
                      } else {
                        var11.a((pe) this, false, (byte) 67, true);
                        break L6;
                      }
                    }
                    L15: {
                      if (fra.field_a != 1) {
                        break L15;
                      } else {
                        if (1 != ee.field_p) {
                          break L15;
                        } else {
                          if (var11.o(94) >= 255) {
                            break L15;
                          } else {
                            if (var11.field_T) {
                              boolean discarded$11 = var11.a((byte) 11, 65536);
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
            stackOut_84_0 = (RuntimeException) var5;
            stackOut_84_1 = new StringBuilder().append("pe.M(");
            stackIn_87_0 = stackOut_84_0;
            stackIn_87_1 = stackOut_84_1;
            stackIn_85_0 = stackOut_84_0;
            stackIn_85_1 = stackOut_84_1;
            if (param0 == null) {
              stackOut_87_0 = (RuntimeException) (Object) stackIn_87_0;
              stackOut_87_1 = (StringBuilder) (Object) stackIn_87_1;
              stackOut_87_2 = "null";
              stackIn_88_0 = stackOut_87_0;
              stackIn_88_1 = stackOut_87_1;
              stackIn_88_2 = stackOut_87_2;
              break L16;
            } else {
              stackOut_85_0 = (RuntimeException) (Object) stackIn_85_0;
              stackOut_85_1 = (StringBuilder) (Object) stackIn_85_1;
              stackOut_85_2 = "{...}";
              stackIn_88_0 = stackOut_85_0;
              stackIn_88_1 = stackOut_85_1;
              stackIn_88_2 = stackOut_85_2;
              break L16;
            }
          }
          L17: {
            stackOut_88_0 = (RuntimeException) (Object) stackIn_88_0;
            stackOut_88_1 = ((StringBuilder) (Object) stackIn_88_1).append(stackIn_88_2).append(44).append(1).append(44);
            stackIn_91_0 = stackOut_88_0;
            stackIn_91_1 = stackOut_88_1;
            stackIn_89_0 = stackOut_88_0;
            stackIn_89_1 = stackOut_88_1;
            if (param2 == null) {
              stackOut_91_0 = (RuntimeException) (Object) stackIn_91_0;
              stackOut_91_1 = (StringBuilder) (Object) stackIn_91_1;
              stackOut_91_2 = "null";
              stackIn_92_0 = stackOut_91_0;
              stackIn_92_1 = stackOut_91_1;
              stackIn_92_2 = stackOut_91_2;
              break L17;
            } else {
              stackOut_89_0 = (RuntimeException) (Object) stackIn_89_0;
              stackOut_89_1 = (StringBuilder) (Object) stackIn_89_1;
              stackOut_89_2 = "{...}";
              stackIn_92_0 = stackOut_89_0;
              stackIn_92_1 = stackOut_89_1;
              stackIn_92_2 = stackOut_89_2;
              break L17;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_92_0, stackIn_92_2 + 44 + param3 + 41);
        }
    }

    private final boolean a(boolean param0, boolean param1, int param2) {
        int var4 = 0;
        sg var5 = null;
        int var6 = 0;
        var6 = VoidHunters.field_G;
        var4 = 0;
        L0: while (true) {
          if (((pe) this).field_k.length <= var4) {
            return false;
          } else {
            var5 = ((pe) this).field_k[var4];
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
    }

    final int m(int param0) {
        if (param0 != 1) {
            return 101;
        }
        return ((pe) this).field_r;
    }

    private final void a(crb[] param0, boolean param1, ij param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        crb var5 = null;
        int var11 = 0;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_63_2 = null;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_67_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        String stackOut_62_2 = null;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        String stackOut_60_2 = null;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        String stackOut_66_2 = null;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        String stackOut_64_2 = null;
        var11 = VoidHunters.field_G;
        try {
          L0: {
            var4_int = 0;
            L1: while (true) {
              if (var4_int >= -1 + param0.length) {
                break L0;
              } else {
                L2: {
                  var5 = param0[var4_int];
                  if (null == var5) {
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var4_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_59_0 = (RuntimeException) var4;
            stackOut_59_1 = new StringBuilder().append("pe.IF(");
            stackIn_62_0 = stackOut_59_0;
            stackIn_62_1 = stackOut_59_1;
            stackIn_60_0 = stackOut_59_0;
            stackIn_60_1 = stackOut_59_1;
            if (param0 == null) {
              stackOut_62_0 = (RuntimeException) (Object) stackIn_62_0;
              stackOut_62_1 = (StringBuilder) (Object) stackIn_62_1;
              stackOut_62_2 = "null";
              stackIn_63_0 = stackOut_62_0;
              stackIn_63_1 = stackOut_62_1;
              stackIn_63_2 = stackOut_62_2;
              break L3;
            } else {
              stackOut_60_0 = (RuntimeException) (Object) stackIn_60_0;
              stackOut_60_1 = (StringBuilder) (Object) stackIn_60_1;
              stackOut_60_2 = "{...}";
              stackIn_63_0 = stackOut_60_0;
              stackIn_63_1 = stackOut_60_1;
              stackIn_63_2 = stackOut_60_2;
              break L3;
            }
          }
          L4: {
            stackOut_63_0 = (RuntimeException) (Object) stackIn_63_0;
            stackOut_63_1 = ((StringBuilder) (Object) stackIn_63_1).append(stackIn_63_2).append(44).append(1).append(44);
            stackIn_66_0 = stackOut_63_0;
            stackIn_66_1 = stackOut_63_1;
            stackIn_64_0 = stackOut_63_0;
            stackIn_64_1 = stackOut_63_1;
            if (param2 == null) {
              stackOut_66_0 = (RuntimeException) (Object) stackIn_66_0;
              stackOut_66_1 = (StringBuilder) (Object) stackIn_66_1;
              stackOut_66_2 = "null";
              stackIn_67_0 = stackOut_66_0;
              stackIn_67_1 = stackOut_66_1;
              stackIn_67_2 = stackOut_66_2;
              break L4;
            } else {
              stackOut_64_0 = (RuntimeException) (Object) stackIn_64_0;
              stackOut_64_1 = (StringBuilder) (Object) stackIn_64_1;
              stackOut_64_2 = "{...}";
              stackIn_67_0 = stackOut_64_0;
              stackIn_67_1 = stackOut_64_1;
              stackIn_67_2 = stackOut_64_2;
              break L4;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_67_0, stackIn_67_2 + 41);
        }
    }

    private final boolean a(boolean param0, int param1, int param2, byte param3, boolean param4, anb param5, int param6, anb param7, ij param8) {
        RuntimeException var10 = null;
        int var10_int = 0;
        int var11 = 0;
        Object var12 = null;
        gda var12_ref = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_46_0 = 0;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_51_2 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_59_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        String stackOut_58_2 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        String stackOut_56_2 = null;
        var12 = null;
        var18 = VoidHunters.field_G;
        try {
          L0: {
            if (!rna.a(param7.field_q, param5.field_q, -115)) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
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
                    if (param1 == 3) {
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
                  var12_ref = (gda) (Object) param8.d(0);
                  L3: while (true) {
                    if (null == var12_ref) {
                      param8.e(120);
                      stackOut_45_0 = 1;
                      stackIn_46_0 = stackOut_45_0;
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
                                if (param6 != 2) {
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
                                if (param1 == 3) {
                                  break L7;
                                } else {
                                  L9: {
                                    var14 = param7.field_f + -param5.field_f;
                                    var15 = param7.field_h - param5.field_h;
                                    var16 = ar.a(var14, (byte) 112, var15) >> 2;
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
                      var12_ref = (gda) (Object) param8.a((byte) 8);
                      continue L3;
                    }
                  }
                } else {
                  return false;
                }
              } else {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var10 = decompiledCaughtException;
            stackOut_47_0 = (RuntimeException) var10;
            stackOut_47_1 = new StringBuilder().append("pe.UC(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44);
            stackIn_50_0 = stackOut_47_0;
            stackIn_50_1 = stackOut_47_1;
            stackIn_48_0 = stackOut_47_0;
            stackIn_48_1 = stackOut_47_1;
            if (param5 == null) {
              stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
              stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
              stackOut_50_2 = "null";
              stackIn_51_0 = stackOut_50_0;
              stackIn_51_1 = stackOut_50_1;
              stackIn_51_2 = stackOut_50_2;
              break L10;
            } else {
              stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
              stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
              stackOut_48_2 = "{...}";
              stackIn_51_0 = stackOut_48_0;
              stackIn_51_1 = stackOut_48_1;
              stackIn_51_2 = stackOut_48_2;
              break L10;
            }
          }
          L11: {
            stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
            stackOut_51_1 = ((StringBuilder) (Object) stackIn_51_1).append(stackIn_51_2).append(44).append(param6).append(44);
            stackIn_54_0 = stackOut_51_0;
            stackIn_54_1 = stackOut_51_1;
            stackIn_52_0 = stackOut_51_0;
            stackIn_52_1 = stackOut_51_1;
            if (param7 == null) {
              stackOut_54_0 = (RuntimeException) (Object) stackIn_54_0;
              stackOut_54_1 = (StringBuilder) (Object) stackIn_54_1;
              stackOut_54_2 = "null";
              stackIn_55_0 = stackOut_54_0;
              stackIn_55_1 = stackOut_54_1;
              stackIn_55_2 = stackOut_54_2;
              break L11;
            } else {
              stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
              stackOut_52_1 = (StringBuilder) (Object) stackIn_52_1;
              stackOut_52_2 = "{...}";
              stackIn_55_0 = stackOut_52_0;
              stackIn_55_1 = stackOut_52_1;
              stackIn_55_2 = stackOut_52_2;
              break L11;
            }
          }
          L12: {
            stackOut_55_0 = (RuntimeException) (Object) stackIn_55_0;
            stackOut_55_1 = ((StringBuilder) (Object) stackIn_55_1).append(stackIn_55_2).append(44);
            stackIn_58_0 = stackOut_55_0;
            stackIn_58_1 = stackOut_55_1;
            stackIn_56_0 = stackOut_55_0;
            stackIn_56_1 = stackOut_55_1;
            if (param8 == null) {
              stackOut_58_0 = (RuntimeException) (Object) stackIn_58_0;
              stackOut_58_1 = (StringBuilder) (Object) stackIn_58_1;
              stackOut_58_2 = "null";
              stackIn_59_0 = stackOut_58_0;
              stackIn_59_1 = stackOut_58_1;
              stackIn_59_2 = stackOut_58_2;
              break L12;
            } else {
              stackOut_56_0 = (RuntimeException) (Object) stackIn_56_0;
              stackOut_56_1 = (StringBuilder) (Object) stackIn_56_1;
              stackOut_56_2 = "{...}";
              stackIn_59_0 = stackOut_56_0;
              stackIn_59_1 = stackOut_56_1;
              stackIn_59_2 = stackOut_56_2;
              break L12;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_59_0, stackIn_59_2 + 41);
        }
        return stackIn_46_0 != 0;
    }

    final void a(nbb param0, byte param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            boolean discarded$24 = param0.b(-(((pe) this).field_r >> 1), 2147483647, ((pe) this).field_r >> 1, -(((pe) this).field_o >> 1), ((pe) this).field_o >> 1);
            param0.b(24, param0.field_s);
            if (param1 >= 25) {
              L1: {
                param0.a((pe) this, true, (byte) 67, false);
                if (!((pe) this).a(29651, (anb) (Object) param0, (anb[]) (Object) ((pe) this).field_m, 1)) {
                  break L1;
                } else {
                  param0.field_v = true;
                  if (hw.field_b == 1) {
                    this.b(2, (byte) 126, (anb) (Object) param0);
                    break L1;
                  } else {
                    break L1;
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
          L2: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("pe.VE(");
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
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
          throw rta.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param1 + 41);
        }
    }

    private final void f() {
        qob[] var2 = null;
        int var3 = 0;
        qob var4 = null;
        int var5 = 0;
        L0: {
          var5 = VoidHunters.field_G;
          if (null != ((pe) this).field_u) {
            break L0;
          } else {
            ((pe) this).field_u = new fba();
            break L0;
          }
        }
        L1: {
          var2 = ((pe) this).field_p.a(false);
          if (var2 != null) {
            var3 = 0;
            L2: while (true) {
              if (var2.length <= var3) {
                break L1;
              } else {
                var4 = var2[var3];
                ((pe) this).field_u.a(new int[4], (byte) 51, var3, 0);
                var3++;
                continue L2;
              }
            }
          } else {
            break L1;
          }
        }
        L3: {
          this.a((anb[]) (Object) ((pe) this).field_k, true, 1);
          if (hw.field_b != 1) {
            break L3;
          } else {
            this.a((anb[]) (Object) ((pe) this).field_m, true, 2);
            break L3;
          }
        }
        this.a((anb[]) (Object) ((pe) this).field_e.c(0), true, 3);
    }

    private final anb b(anb[] param0, boolean param1, int param2) {
        RuntimeException var4 = null;
        anb stackIn_8_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        anb stackOut_7_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          if (param2 >= 0) {
            if (param0.length > param2) {
              stackOut_7_0 = param0[param2];
              stackIn_8_0 = stackOut_7_0;
              return stackIn_8_0;
            } else {
              return null;
            }
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("pe.QB(");
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L0;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L0;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + 1 + 44 + param2 + 41);
        }
    }

    final static void a(int param0, long param1, int param2) {
        faa var4 = null;
        int var5 = 0;
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
            field_d = null;
            break L0;
          }
        }
    }

    final void a(int param0) {
        sg[] var2 = null;
        rba[] var2_array = null;
        cq[] var2_array2 = null;
        int var3 = 0;
        sg var4 = null;
        rba var4_ref = null;
        cq var4_ref2 = null;
        int var5 = 0;
        sg[] var6 = null;
        rdb var7 = null;
        var5 = VoidHunters.field_G;
        var6 = ((pe) this).field_k;
        var2 = var6;
        var3 = 0;
        L0: while (true) {
          if (var6.length <= var3) {
            var7 = (rdb) (Object) ((pe) this).field_n.d(param0 + param0);
            L1: while (true) {
              if (var7 == null) {
                L2: {
                  if (null != ((pe) this).field_a) {
                    var2_array = ((pe) this).field_a;
                    var3 = 0;
                    L3: while (true) {
                      if (var3 >= var2_array.length) {
                        break L2;
                      } else {
                        var4_ref = var2_array[var3];
                        if (null != var4_ref) {
                          this.a(var4_ref.field_c, (byte) 4, var4_ref.field_i, var4_ref.field_f);
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
                  if (((pe) this).field_t == null) {
                    break L4;
                  } else {
                    var2_array2 = ((pe) this).field_t;
                    var3 = 0;
                    L5: while (true) {
                      if (var3 >= var2_array2.length) {
                        break L4;
                      } else {
                        var4_ref2 = var2_array2[var3];
                        if (null != var4_ref2) {
                          int discarded$1 = -92;
                          this.a(var4_ref2.field_g, var4_ref2.field_f, var4_ref2.field_d, var4_ref2.field_e);
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
                var7 = (rdb) (Object) ((pe) this).field_n.a((byte) 100);
                continue L1;
              }
            }
          } else {
            var4 = var6[var3];
            if (var4 != null) {
              this.a(var4.g((byte) -106), (byte) 4, var4.d(false), var4.g(param0 ^ -63));
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
        nbb[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        nbb[] var5 = null;
        L0: {
          var4 = VoidHunters.field_G;
          if (param0 <= -82) {
            break L0;
          } else {
            this.a(82, -2, -88, 15, 61, -108, -2, -18);
            break L0;
          }
        }
        if (((pe) this).field_h) {
          return;
        } else {
          if (null == ((pe) this).field_m) {
            return;
          } else {
            var5 = ((pe) this).field_m;
            var2 = var5;
            ((pe) this).field_m = new nbb[((pe) this).field_m.length];
            var3 = 0;
            L1: while (true) {
              if (((pe) this).field_m.length <= var3) {
                ((pe) this).field_h = true;
                return;
              } else {
                ((pe) this).field_m[var3] = var5[var3];
                var3++;
                continue L1;
              }
            }
          }
        }
    }

    final nbb i(int param0, int param1) {
        if (param0 != 21363) {
            return null;
        }
        param1 = param1 - field_c[1];
        return (nbb) (Object) this.b((anb[]) (Object) ((pe) this).field_m, true, param1);
    }

    private final void a(lbb param0, tfa[] param1, byte param2, nwa param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        sg var10 = null;
        Random var10_ref = null;
        crb[] var10_array = null;
        sg[] var10_array2 = null;
        rdb var10_ref2 = null;
        tfa var10_ref3 = null;
        anb var10_ref4 = null;
        int var10_int = 0;
        cq var10_ref5 = null;
        et[] var10_array3 = null;
        rba var10_ref6 = null;
        qob var10_ref7 = null;
        Object var11 = null;
        int var11_int = 0;
        int var12 = 0;
        sg var12_ref_sg = null;
        crb var12_ref_crb = null;
        tfa var12_ref_tfa = null;
        nbb var12_ref_nbb = null;
        cq var12_ref_cq = null;
        rba var12_ref_rba = null;
        rha var12_ref_rha = null;
        int[] var12_ref_int__ = null;
        sg[] var13 = null;
        int var13_int = 0;
        ij var13_ref = null;
        tfa var13_ref2 = null;
        sg var13_ref3 = null;
        Random var13_ref4 = null;
        int var14 = 0;
        crb[] var14_ref_crb__ = null;
        int var15_int = 0;
        sg var15 = null;
        crb[] var15_array = null;
        nbb[] var15_array2 = null;
        sg[] var15_array3 = null;
        sg[] var16_ref_sg__ = null;
        crb[] var16_ref_crb__ = null;
        int var16 = 0;
        int var17 = 0;
        crb[] var17_ref_crb__ = null;
        tfa var17_ref_tfa = null;
        crb var17_ref_crb = null;
        nbb var17_ref_nbb = null;
        sg var17_ref_sg = null;
        int var18 = 0;
        sg var18_ref_sg = null;
        crb var18_ref_crb = null;
        nbb var18_ref_nbb = null;
        int var19 = 0;
        tfa var19_ref_tfa = null;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        Object var24 = null;
        tfa var25 = null;
        crb var25_ref = null;
        nbb var26 = null;
        sg var27 = null;
        rdb var28 = null;
        crb var29 = null;
        nbb var30 = null;
        sg var31 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackIn_365_0 = null;
        Object stackOut_4_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_5_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_364_0 = null;
        var24 = null;
        var23 = VoidHunters.field_G;
        var5_int = 0;
        var6 = 34 % ((param2 - 53) / 41);
        L0: while (true) {
          if (~param1.length >= ~var5_int) {
            return;
          } else {
            L1: {
              var7 = param1[var5_int].field_d;
              var8 = param1[var5_int].field_e;
              var9 = param1[var5_int].field_b;
              if (13 != var9) {
                break L1;
              } else {
                L2: {
                  stackOut_4_0 = this;
                  stackIn_7_0 = stackOut_4_0;
                  stackIn_5_0 = stackOut_4_0;
                  if (((pe) this).field_v) {
                    stackOut_7_0 = this;
                    stackOut_7_1 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    break L2;
                  } else {
                    stackOut_5_0 = this;
                    stackIn_6_0 = stackOut_5_0;
                    stackOut_6_0 = this;
                    stackOut_6_1 = 1;
                    stackIn_8_0 = stackOut_6_0;
                    stackIn_8_1 = stackOut_6_1;
                    break L2;
                  }
                }
                ((pe) this).field_v = stackIn_8_1 != 0;
                break L1;
              }
            }
            L3: {
              if (var9 != 10) {
                break L3;
              } else {
                if (13 != ((pe) this).field_y) {
                  break L3;
                } else {
                  var10_ref = new Random((long)(var8 * var7));
                  var11_int = ib.a(-101, 3, ak.e((byte) 107), var10_ref);
                  var12_ref_sg = t.a(var11_int, (byte) 47);
                  var12_ref_sg.a(new aoa(), 4);
                  var12_ref_sg.h(17704, sja.field_c);
                  var13_int = var7;
                  var14 = var8;
                  var12_ref_sg.a(var13_int, var14, (byte) 108);
                  var12_ref_sg.a(hob.a(var10_ref, 8192, 122), -103);
                  var12_ref_sg.a(false, true, (pe) this);
                  var15_int = 1;
                  var16_ref_sg__ = ((pe) this).field_k;
                  var17 = 0;
                  L4: while (true) {
                    L5: {
                      if (~var17 <= ~var16_ref_sg__.length) {
                        break L5;
                      } else {
                        L6: {
                          var18_ref_sg = var16_ref_sg__[var17];
                          var12_ref_sg = var18_ref_sg;
                          var10 = var12_ref_sg;
                          var12_ref_sg = var18_ref_sg;
                          if (var18_ref_sg != null) {
                            if (!this.a((anb) (Object) var12_ref_sg, (anb) (Object) var18_ref_sg, -69)) {
                              break L6;
                            } else {
                              var15_int = 0;
                              break L5;
                            }
                          } else {
                            break L6;
                          }
                        }
                        var17++;
                        continue L4;
                      }
                    }
                    var16_ref_crb__ = ((pe) this).field_e.c(0);
                    var17_ref_crb__ = var16_ref_crb__;
                    var18 = 0;
                    L7: while (true) {
                      L8: {
                        if (param1.length <= var18) {
                          break L8;
                        } else {
                          L9: {
                            var19_ref_tfa = param1[var18];
                            var17_ref_tfa = var19_ref_tfa;
                            var25 = var17_ref_tfa;
                            var17_ref_tfa = var19_ref_tfa;
                            if (null == var19_ref_tfa) {
                              break L9;
                            } else {
                              if (this.a((anb) (Object) var12_ref_sg, (anb) (Object) var19_ref_tfa, 63)) {
                                var15_int = 0;
                                break L8;
                              } else {
                                break L9;
                              }
                            }
                          }
                          var18++;
                          continue L7;
                        }
                      }
                      L10: {
                        L11: {
                          var17 = ((pe) this).field_o >> 1;
                          var18 = ((pe) this).field_r >> 1;
                          var19 = -var17;
                          var20 = var17;
                          var21 = -var18;
                          var22 = var18;
                          if (~var7 > ~var19) {
                            break L11;
                          } else {
                            if (var7 > var20) {
                              break L11;
                            } else {
                              if (var8 < var21) {
                                break L11;
                              } else {
                                if (var8 <= var22) {
                                  break L10;
                                } else {
                                  break L11;
                                }
                              }
                            }
                          }
                        }
                        var15_int = 0;
                        break L10;
                      }
                      if (var15_int != 0) {
                        ((pe) this).a(var12_ref_sg, (byte) 96);
                        if (vqa.field_g == null) {
                          break L3;
                        } else {
                          vqa.field_g.d(-31407);
                          break L3;
                        }
                      } else {
                        eib.a(6811, 6, 1);
                        break L3;
                      }
                    }
                  }
                }
              }
            }
            L12: {
              if (!((pe) this).field_v) {
                break L12;
              } else {
                if (var9 == 14) {
                  var10 = ((pe) this).d(var5_int, 61);
                  var11 = null;
                  var12 = 2147483647;
                  var13 = ((pe) this).field_k;
                  var14 = 0;
                  L13: while (true) {
                    if (~var13.length >= ~var14) {
                      if (null != var11) {
                        L14: {
                          if (null == var10) {
                            break L14;
                          } else {
                            var10.g(((sg) var11).o((byte) -117), -51);
                            if (-1 != ((sg) var11).o((byte) -117)) {
                              break L14;
                            } else {
                              var10.a(new aoa(), 4);
                              break L14;
                            }
                          }
                        }
                        ((sg) var11).g(var5_int, -126);
                        ((sg) var11).a((aoa) null, 4);
                        break L12;
                      } else {
                        break L12;
                      }
                    } else {
                      L15: {
                        var15 = var13[var14];
                        var11 = (Object) (Object) var15;
                        var11 = (Object) (Object) var15;
                        if (var15 == null) {
                          break L15;
                        } else {
                          if (var15 != var10) {
                            var16 = var15.field_d - var7;
                            var17 = -var8 + var15.field_e;
                            var18 = ar.a(var16, (byte) 108, var17);
                            if (var12 > var18) {
                              var12 = var18;
                              var11 = (Object) (Object) var15;
                              break L15;
                            } else {
                              break L15;
                            }
                          } else {
                            break L15;
                          }
                        }
                      }
                      var14++;
                      continue L13;
                    }
                  }
                } else {
                  if (var9 != 15) {
                    if (var9 != 16) {
                      if (var9 != 17) {
                        if (var9 != 18) {
                          if (var9 != 25) {
                            if (var9 != 26) {
                              if (var9 == 27) {
                                stackOut_364_0 = null;
                                stackIn_365_0 = stackOut_364_0;
                                if (stackIn_365_0 != (Object) (Object) ((pe) this).field_f) {
                                  ((pe) this).field_f.g((byte) 82);
                                  break L12;
                                } else {
                                  break L12;
                                }
                              } else {
                                if (var9 == 28) {
                                  if (null == ((pe) this).field_f) {
                                    break L12;
                                  } else {
                                    ((pe) this).field_f.f((byte) -29);
                                    break L12;
                                  }
                                } else {
                                  if (var9 != 29) {
                                    if (var9 != 30) {
                                      if (var9 == 31) {
                                        if (((pe) this).field_f == null) {
                                          break L12;
                                        } else {
                                          ((pe) this).field_f.a((byte) -120, (wm) (Object) new cqb(0, 0));
                                          break L12;
                                        }
                                      } else {
                                        if (var9 == 32) {
                                          if (((pe) this).field_f != null) {
                                            L16: {
                                              var10_int = -1;
                                              var11 = (Object) (Object) this.a((byte) -27, var7, var8);
                                              if (null != var11) {
                                                var10_int = ((anb) var11).field_l;
                                                break L16;
                                              } else {
                                                break L16;
                                              }
                                            }
                                            ((pe) this).field_f.a((byte) -120, (wm) (Object) new ih(var10_int, 0));
                                            break L12;
                                          } else {
                                            break L12;
                                          }
                                        } else {
                                          if (var9 == 33) {
                                            if (null == ((pe) this).field_f) {
                                              break L12;
                                            } else {
                                              ((pe) this).field_f.a((byte) -125, (wm) (Object) new jsb(0));
                                              break L12;
                                            }
                                          } else {
                                            if (34 != var9) {
                                              if (var9 == 35) {
                                                if (null == ((pe) this).field_f) {
                                                  break L12;
                                                } else {
                                                  ((pe) this).field_f.a((rna) (Object) new ika(), 0);
                                                  break L12;
                                                }
                                              } else {
                                                if (36 != var9) {
                                                  if (var9 != 37) {
                                                    if (var9 != 38) {
                                                      if (39 != var9) {
                                                        if (var9 != 40) {
                                                          if (var9 != 41) {
                                                            if (var9 == 42) {
                                                              if (null == ((pe) this).field_f) {
                                                                break L12;
                                                              } else {
                                                                ((pe) this).field_f.e((byte) -99);
                                                                break L12;
                                                              }
                                                            } else {
                                                              if (var9 == 43) {
                                                                if (null == ((pe) this).field_f) {
                                                                  break L12;
                                                                } else {
                                                                  ((pe) this).field_f.b((byte) -128);
                                                                  break L12;
                                                                }
                                                              } else {
                                                                if (var9 != 44) {
                                                                  if (var9 == 45) {
                                                                    if (((pe) this).field_f != null) {
                                                                      ((pe) this).field_f.a(false, (pe) this, 0);
                                                                      break L12;
                                                                    } else {
                                                                      break L12;
                                                                    }
                                                                  } else {
                                                                    if (46 != var9) {
                                                                      if (47 == var9) {
                                                                        if (null == ((pe) this).field_f) {
                                                                          break L12;
                                                                        } else {
                                                                          ((pe) this).field_f.a(false, (pe) this, 1);
                                                                          break L12;
                                                                        }
                                                                      } else {
                                                                        if (var9 == 48) {
                                                                          if (((pe) this).field_f == null) {
                                                                            break L12;
                                                                          } else {
                                                                            ((pe) this).field_f.a(1, 1, (pe) this);
                                                                            break L12;
                                                                          }
                                                                        } else {
                                                                          if (var9 == 49) {
                                                                            var10_ref5 = new cq(var7, var8);
                                                                            ((pe) this).a(5706, var10_ref5);
                                                                            break L12;
                                                                          } else {
                                                                            if (var9 != 50) {
                                                                              if (51 == var9) {
                                                                                if (null != ((pe) this).field_t) {
                                                                                  var10_int = 0;
                                                                                  L17: while (true) {
                                                                                    if (var10_int >= ((pe) this).field_t.length) {
                                                                                      break L12;
                                                                                    } else {
                                                                                      var11 = (Object) (Object) ((pe) this).field_t[var10_int];
                                                                                      if (((cq) var11).a(var8, var7, (byte) -98)) {
                                                                                        ((cq) var11).field_e = (int)((double)((cq) var11).field_e / 1.25);
                                                                                        ((cq) var11).field_d = (int)((double)((cq) var11).field_d / 1.25);
                                                                                        break L12;
                                                                                      } else {
                                                                                        var10_int++;
                                                                                        continue L17;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                } else {
                                                                                  break L12;
                                                                                }
                                                                              } else {
                                                                                if (var9 != 52) {
                                                                                  if (var9 == 53) {
                                                                                    L18: {
                                                                                      var10_array3 = param0.field_g;
                                                                                      if (null == var10_array3) {
                                                                                        break L18;
                                                                                      } else {
                                                                                        var11_int = 0;
                                                                                        L19: while (true) {
                                                                                          if (var10_array3.length <= var11_int) {
                                                                                            break L18;
                                                                                          } else {
                                                                                            L20: {
                                                                                              if (null != var10_array3[var11_int]) {
                                                                                                var10_array3[var11_int].field_a = var10_array3[var11_int].field_a / 2;
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
                                                                                    }
                                                                                    break L12;
                                                                                  } else {
                                                                                    if (var9 == 54) {
                                                                                      param0.b(false);
                                                                                      break L12;
                                                                                    } else {
                                                                                      if (var9 == 55) {
                                                                                        param0.a(127);
                                                                                        break L12;
                                                                                      } else {
                                                                                        if (var9 != 56) {
                                                                                          if (var9 == 19) {
                                                                                            var10_ref7 = new qob(var7, var8);
                                                                                            ((pe) this).b((byte) 60);
                                                                                            int discarded$1 = 0;
                                                                                            this.a(var10_ref7);
                                                                                            break L12;
                                                                                          } else {
                                                                                            if (20 != var9) {
                                                                                              if (var9 != 21) {
                                                                                                if (var9 != 22) {
                                                                                                  if (23 != var9) {
                                                                                                    if (var9 == 24) {
                                                                                                      ((pe) this).e((int)((double)((pe) this).field_r / 1.1), 0);
                                                                                                      break L12;
                                                                                                    } else {
                                                                                                      if (57 == var9) {
                                                                                                        var10_ref = new Random((long)(var7 * var8));
                                                                                                        var11 = (Object) (Object) t.a(hob.a(var10_ref, 12, 126), (byte) 42);
                                                                                                        ((sg) var11).a(new aoa(), 4);
                                                                                                        ((sg) var11).h(17704, sja.field_c);
                                                                                                        var12 = var7;
                                                                                                        var13_int = var8;
                                                                                                        ((sg) var11).a(var12, var13_int, (byte) 52);
                                                                                                        ((sg) var11).a(hob.a(var10_ref, 8192, 118), -82);
                                                                                                        ((pe) this).a((sg) var11, (byte) 80);
                                                                                                        break L12;
                                                                                                      } else {
                                                                                                        if (var9 == 58) {
                                                                                                          var10_ref = new Random((long)(var7 * var8));
                                                                                                          var11 = (Object) (Object) "AAQPKAASAhIDKAESAygAEgISAygBEgMoABICEgMoARIDKAASAhIDKAESAygAEgISAygBEgMoABICEgMoARIDKAASAhIDKAESAygAEgISAygBEgMoABICEgMoARIDKAASAhIDKAESAygAEgISAygBEgMoABICEgMoARIDKAASAhIDKAESAygAEgISAygBEgMoABICEgMoARIDKAASAhIDKAESBRL-BBIGEgUS-wQSBhIFEv8EEgYSBRL-BBIGEgUS-wQSBhIFEv8EEgYSBRL-BBIGEgUS-wQSBhIFEv8EEgYSBRL-BBIGEgUS-wQSBhIFEv8EEgYSBRL-BBIGEgUS-wQSBhIFEv8EEgYSBRL-BBIGEg";
                                                                                                          var12_ref_int__ = hta.a((String) var11, true, true);
                                                                                                          var13_ref3 = ae.a(var12_ref_int__, (byte) 126);
                                                                                                          var13_ref3.a(new aoa(), 4);
                                                                                                          var13_ref3.h(17704, sja.field_c);
                                                                                                          var14 = var7;
                                                                                                          var15_int = var8;
                                                                                                          var13_ref3.a(var14, var15_int, (byte) 100);
                                                                                                          var13_ref3.a(hob.a(var10_ref, 8192, 120), -51);
                                                                                                          ((pe) this).a(var13_ref3, (byte) 81);
                                                                                                          break L12;
                                                                                                        } else {
                                                                                                          if (var9 < 72) {
                                                                                                            break L12;
                                                                                                          } else {
                                                                                                            L21: {
                                                                                                              var10_int = -72 + var9;
                                                                                                              if (tnb.a(130, var10_int)) {
                                                                                                                var11 = (Object) (Object) new ml(var10_int);
                                                                                                                var12_ref_sg = new sg();
                                                                                                                var12_ref_sg.field_k = (ml) var11;
                                                                                                                var12_ref_sg.e((byte) 119);
                                                                                                                var12_ref_sg.a(var7, var8, (byte) 42);
                                                                                                                ((pe) this).a(var12_ref_sg, (byte) 83);
                                                                                                                break L21;
                                                                                                              } else {
                                                                                                                if (!fbb.b(var10_int, 15923)) {
                                                                                                                  break L21;
                                                                                                                } else {
                                                                                                                  var11 = (Object) (Object) new ml(var10_int);
                                                                                                                  var12_ref_nbb = new nbb((ml) var11, false);
                                                                                                                  var13_ref4 = new Random((long)var7);
                                                                                                                  var12_ref_nbb.a(hob.a(var13_ref4, 8192, 121), -95);
                                                                                                                  var12_ref_nbb.a(var7, var8, (byte) -62);
                                                                                                                  ((pe) this).a(var12_ref_nbb, (byte) 54);
                                                                                                                  break L12;
                                                                                                                }
                                                                                                              }
                                                                                                            }
                                                                                                            break L12;
                                                                                                          }
                                                                                                        }
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    ((pe) this).e((int)(1.1 * (double)((pe) this).field_r), 0);
                                                                                                    break L12;
                                                                                                  }
                                                                                                } else {
                                                                                                  ((pe) this).a((int)((double)((pe) this).field_o / 1.1), (byte) 72);
                                                                                                  break L12;
                                                                                                }
                                                                                              } else {
                                                                                                ((pe) this).a((int)((double)((pe) this).field_o * 1.1), (byte) 53);
                                                                                                break L12;
                                                                                              }
                                                                                            } else {
                                                                                              var10_ref2 = new rdb(var7, var8, 0);
                                                                                              ((pe) this).a((byte) -59, var10_ref2);
                                                                                              break L12;
                                                                                            }
                                                                                          }
                                                                                        } else {
                                                                                          var10_ref = new Random((long)(var7 * var8));
                                                                                          var11_int = hob.a(var10_ref, 5, 123);
                                                                                          var12_ref_rha = new rha(var11_int, 0, 0);
                                                                                          param3.a(var12_ref_rha, true);
                                                                                          break L12;
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                } else {
                                                                                  var10_ref6 = new rba(var7, var8);
                                                                                  ((pe) this).a(var10_ref6, (byte) -38);
                                                                                  break L12;
                                                                                }
                                                                              }
                                                                            } else {
                                                                              if (null != ((pe) this).field_t) {
                                                                                var10_int = 0;
                                                                                L22: while (true) {
                                                                                  if (~((pe) this).field_t.length >= ~var10_int) {
                                                                                    break L12;
                                                                                  } else {
                                                                                    var11 = (Object) (Object) ((pe) this).field_t[var10_int];
                                                                                    if (((cq) var11).a(var8, var7, (byte) -98)) {
                                                                                      ((cq) var11).field_d = (int)(1.25 * (double)((cq) var11).field_d);
                                                                                      ((cq) var11).field_e = (int)((double)((cq) var11).field_e * 1.25);
                                                                                      break L12;
                                                                                    } else {
                                                                                      var10_int++;
                                                                                      continue L22;
                                                                                    }
                                                                                  }
                                                                                }
                                                                              } else {
                                                                                break L12;
                                                                              }
                                                                            }
                                                                          }
                                                                        }
                                                                      }
                                                                    } else {
                                                                      if (null == ((pe) this).field_f) {
                                                                        break L12;
                                                                      } else {
                                                                        ((pe) this).field_f.a(1, 0, (pe) this);
                                                                        break L12;
                                                                      }
                                                                    }
                                                                  }
                                                                } else {
                                                                  if (null != ((pe) this).field_f) {
                                                                    ((pe) this).field_f.a(-828);
                                                                    break L12;
                                                                  } else {
                                                                    break L12;
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          } else {
                                                            if (((pe) this).field_f == null) {
                                                              break L12;
                                                            } else {
                                                              ((pe) this).field_f.a((rna) (Object) new jpa(0, 0), 0);
                                                              break L12;
                                                            }
                                                          }
                                                        } else {
                                                          if (null == ((pe) this).field_f) {
                                                            break L12;
                                                          } else {
                                                            ((pe) this).field_f.a((rna) (Object) new tt(0, 0), 0);
                                                            break L12;
                                                          }
                                                        }
                                                      } else {
                                                        if (((pe) this).field_f == null) {
                                                          break L12;
                                                        } else {
                                                          L23: {
                                                            var10_ref4 = this.a((byte) -20, var7, var8);
                                                            var11_int = -1;
                                                            if (var10_ref4 != null) {
                                                              var11_int = var10_ref4.field_l;
                                                              break L23;
                                                            } else {
                                                              break L23;
                                                            }
                                                          }
                                                          ((pe) this).field_f.a((rna) (Object) new lrb(var11_int, 0), 0);
                                                          break L12;
                                                        }
                                                      }
                                                    } else {
                                                      if (null == ((pe) this).field_f) {
                                                        break L12;
                                                      } else {
                                                        ((pe) this).field_f.a((rna) (Object) new cf(0, 0), 0);
                                                        break L12;
                                                      }
                                                    }
                                                  } else {
                                                    if (((pe) this).field_f != null) {
                                                      ((pe) this).field_f.a((rna) (Object) new uoa(0, 0), 0);
                                                      break L12;
                                                    } else {
                                                      break L12;
                                                    }
                                                  }
                                                } else {
                                                  if (null != ((pe) this).field_f) {
                                                    ((pe) this).field_f.a((rna) (Object) new pob(0, 0), 0);
                                                    break L12;
                                                  } else {
                                                    break L12;
                                                  }
                                                }
                                              }
                                            } else {
                                              if (null == ((pe) this).field_f) {
                                                break L12;
                                              } else {
                                                ((pe) this).field_f.a((byte) -120, (wm) (Object) new om(0));
                                                break L12;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      if (((pe) this).field_f == null) {
                                        break L12;
                                      } else {
                                        if (((pe) this).field_t != null) {
                                          L24: {
                                            var10_int = -1;
                                            var11 = (Object) (Object) this.a((byte) -116, var7, var8);
                                            if (null != var11) {
                                              var10_int = ((anb) var11).field_l;
                                              break L24;
                                            } else {
                                              break L24;
                                            }
                                          }
                                          ((pe) this).field_f.a((byte) -124, (wm) (Object) new iia(var10_int, 0));
                                          break L12;
                                        } else {
                                          break L12;
                                        }
                                      }
                                    }
                                  } else {
                                    if (null == ((pe) this).field_f) {
                                      break L12;
                                    } else {
                                      var10_ref4 = this.a((byte) -48, var7, var8);
                                      if (null != var10_ref4) {
                                        ((pe) this).field_f.a((byte) -126, (wm) (Object) new cc(var10_ref4.field_l));
                                        break L12;
                                      } else {
                                        break L12;
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              if (((pe) this).field_f == null) {
                                break L12;
                              } else {
                                ((pe) this).field_f.c((byte) 55);
                                break L12;
                              }
                            }
                          } else {
                            L25: {
                              if (((pe) this).field_f == null) {
                                ((pe) this).field_f = new una();
                                break L25;
                              } else {
                                break L25;
                              }
                            }
                            ((pe) this).field_f.c(0);
                            break L12;
                          }
                        } else {
                          var10_ref = new Random((long)(var7 * var8));
                          var11 = (Object) (Object) new ml(gnb.a(var10_ref, (byte) 55));
                          var12_ref_crb = new crb((ml) var11);
                          var12_ref_crb.a(var7, var8, (byte) -49);
                          ((pe) this).a((byte) 126, var12_ref_crb);
                          break L12;
                        }
                      } else {
                        var10 = ((pe) this).d(var5_int, 73);
                        if (var10 != null) {
                          var11_int = var10.d(false);
                          var12 = var10.g((byte) -107);
                          var13_ref = new ij();
                          var14_ref_crb__ = ((pe) this).field_e.c(0);
                          var15_array = var14_ref_crb__;
                          var16 = 0;
                          L26: while (true) {
                            if (var15_array.length <= var16) {
                              var29 = (crb) (Object) var13_ref.d(0);
                              L27: while (true) {
                                if (var29 == null) {
                                  var13_ref.e(95);
                                  var15_array2 = ((pe) this).field_m;
                                  var16 = 0;
                                  L28: while (true) {
                                    if (var16 >= var15_array2.length) {
                                      var30 = (nbb) (Object) var13_ref.d(0);
                                      L29: while (true) {
                                        if (var30 == null) {
                                          var13_ref.e(107);
                                          var15_array3 = ((pe) this).field_k;
                                          var16 = 0;
                                          L30: while (true) {
                                            if (var15_array3.length <= var16) {
                                              var31 = (sg) (Object) var13_ref.d(0);
                                              L31: while (true) {
                                                if (null == var31) {
                                                  break L12;
                                                } else {
                                                  ((pe) this).a(var31, (byte) 82);
                                                  var31 = (sg) (Object) var13_ref.a((byte) 122);
                                                  continue L31;
                                                }
                                              }
                                            } else {
                                              L32: {
                                                var17_ref_sg = var15_array3[var16];
                                                var27 = var17_ref_sg;
                                                var27 = var17_ref_sg;
                                                if (var17_ref_sg == null) {
                                                  break L32;
                                                } else {
                                                  if (var17_ref_sg.o((byte) -117) == -1) {
                                                    if (null != var17_ref_sg.field_k.a(var8, var7, true)) {
                                                      var18_ref_sg = new sg();
                                                      var17_ref_sg.b((byte) 111, (tv) (Object) var18_ref_sg);
                                                      var18_ref_sg.a(var11_int, var12, (byte) 39);
                                                      var18_ref_sg.a(var10.e(0), -82);
                                                      var18_ref_sg.h(17704, var10.q((byte) 125));
                                                      var13_ref.b(-10258, (ksa) (Object) var18_ref_sg);
                                                      break L32;
                                                    } else {
                                                      break L32;
                                                    }
                                                  } else {
                                                    break L32;
                                                  }
                                                }
                                              }
                                              var16++;
                                              continue L30;
                                            }
                                          }
                                        } else {
                                          ((pe) this).a(var30, (byte) 51);
                                          var30 = (nbb) (Object) var13_ref.a((byte) 8);
                                          continue L29;
                                        }
                                      }
                                    } else {
                                      L33: {
                                        var17_ref_nbb = var15_array2[var16];
                                        var26 = var17_ref_nbb;
                                        var26 = var17_ref_nbb;
                                        if (var17_ref_nbb == null) {
                                          break L33;
                                        } else {
                                          if (null == var17_ref_nbb.field_k.a(var8, var7, true)) {
                                            break L33;
                                          } else {
                                            var18_ref_nbb = new nbb();
                                            var17_ref_nbb.b((byte) 87, (tv) (Object) var18_ref_nbb);
                                            var18_ref_nbb.a(var11_int, var12, (byte) -122);
                                            var13_ref.b(-10258, (ksa) (Object) var18_ref_nbb);
                                            break L33;
                                          }
                                        }
                                      }
                                      var16++;
                                      continue L28;
                                    }
                                  }
                                } else {
                                  ((pe) this).a((byte) 126, var29);
                                  var29 = (crb) (Object) var13_ref.a((byte) 80);
                                  continue L27;
                                }
                              }
                            } else {
                              L34: {
                                var17_ref_crb = var15_array[var16];
                                var25_ref = var17_ref_crb;
                                var25_ref = var17_ref_crb;
                                if (null == var17_ref_crb) {
                                  break L34;
                                } else {
                                  if (var17_ref_crb.field_k.a(var8, var7, true) != null) {
                                    var18_ref_crb = new crb();
                                    var17_ref_crb.b((byte) 76, (tv) (Object) var18_ref_crb);
                                    var18_ref_crb.a(var11_int, var12, (byte) -93);
                                    var13_ref.b(-10258, (ksa) (Object) var18_ref_crb);
                                    break L34;
                                  } else {
                                    break L34;
                                  }
                                }
                              }
                              var16++;
                              continue L26;
                            }
                          }
                        } else {
                          break L12;
                        }
                      }
                    } else {
                      var10_array2 = ((pe) this).field_k;
                      var11_int = 0;
                      L35: while (true) {
                        if (var11_int >= param1.length) {
                          var10_ref2 = (rdb) (Object) ((pe) this).field_n.d(0);
                          L36: while (true) {
                            if (null == var10_ref2) {
                              break L12;
                            } else {
                              L37: {
                                if (!var10_ref2.a(var7, (byte) -124, var8)) {
                                  break L37;
                                } else {
                                  var10_ref2.a((1 + var10_ref2.d(-29)) % so.field_b, (byte) -93);
                                  break L37;
                                }
                              }
                              var10_ref2 = (rdb) (Object) ((pe) this).field_n.a((byte) 117);
                              continue L36;
                            }
                          }
                        } else {
                          L38: {
                            var12_ref_tfa = param1[var11_int];
                            var10_ref3 = var12_ref_tfa;
                            var10_ref3 = var12_ref_tfa;
                            if (null != var12_ref_tfa) {
                              if (null != ((sg) (Object) var12_ref_tfa).field_k.a(var8, var7, true)) {
                                ((sg) (Object) var12_ref_tfa).h(17704, (1 + ((sg) (Object) var12_ref_tfa).q((byte) 68)) % so.field_b);
                                break L38;
                              } else {
                                break L38;
                              }
                            } else {
                              break L38;
                            }
                          }
                          var11_int++;
                          continue L35;
                        }
                      }
                    }
                  } else {
                    var10_array = ((pe) this).field_e.c(0);
                    var11_int = 0;
                    L39: while (true) {
                      if (~var10_array.length >= ~var11_int) {
                        var11_int = 0;
                        L40: while (true) {
                          if (~var11_int <= ~((pe) this).field_m.length) {
                            var11_int = 0;
                            L41: while (true) {
                              if (var11_int >= ((pe) this).field_k.length) {
                                var28 = (rdb) (Object) ((pe) this).field_n.d(0);
                                L42: while (true) {
                                  if (var28 == null) {
                                    L43: {
                                      if (((pe) this).field_t == null) {
                                        break L43;
                                      } else {
                                        var11_int = 0;
                                        L44: while (true) {
                                          if (((pe) this).field_t.length <= var11_int) {
                                            break L43;
                                          } else {
                                            var12_ref_cq = ((pe) this).field_t[var11_int];
                                            if (!var12_ref_cq.a(var8, var7, (byte) -98)) {
                                              var11_int++;
                                              continue L44;
                                            } else {
                                              this.c(var11_int, (byte) -90);
                                              break L43;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    L45: {
                                      if (((pe) this).field_a == null) {
                                        break L45;
                                      } else {
                                        var11_int = 0;
                                        L46: while (true) {
                                          if (((pe) this).field_a.length <= var11_int) {
                                            break L45;
                                          } else {
                                            var12_ref_rba = ((pe) this).field_a[var11_int];
                                            if (var12_ref_rba.a(var7, (byte) 87, var8)) {
                                              this.c((byte) 110, var11_int);
                                              break L45;
                                            } else {
                                              var11_int++;
                                              continue L46;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    L47: {
                                      var11 = (Object) (Object) ((pe) this).field_p.a(false);
                                      if (var11 == null) {
                                        break L47;
                                      } else {
                                        var12 = 0;
                                        L48: while (true) {
                                          if (~param1.length >= ~var12) {
                                            break L47;
                                          } else {
                                            var13_ref2 = param1[var12];
                                            if (!((qob) (Object) var13_ref2).a((byte) 100, var7, var8)) {
                                              var12++;
                                              continue L48;
                                            } else {
                                              ((pe) this).b((byte) -89);
                                              this.f((byte) -22, var12);
                                              break L12;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    break L12;
                                  } else {
                                    L49: {
                                      if (var28.a(var7, (byte) -81, var8)) {
                                        var28.b(-3846);
                                        break L49;
                                      } else {
                                        break L49;
                                      }
                                    }
                                    var28 = (rdb) (Object) ((pe) this).field_n.a((byte) 106);
                                    continue L42;
                                  }
                                }
                              } else {
                                L50: {
                                  var12_ref_sg = ((pe) this).field_k[var11_int];
                                  if (var12_ref_sg != null) {
                                    if (var12_ref_sg.field_k.a(var8, var7, true) == null) {
                                      break L50;
                                    } else {
                                      ((pe) this).a(-107, 0, (anb) (Object) var12_ref_sg);
                                      break L50;
                                    }
                                  } else {
                                    break L50;
                                  }
                                }
                                var11_int++;
                                continue L41;
                              }
                            }
                          } else {
                            L51: {
                              var12_ref_nbb = ((pe) this).field_m[var11_int];
                              if (null != var12_ref_nbb) {
                                if (var12_ref_nbb.field_k.a(var8, var7, true) != null) {
                                  ((pe) this).a(-104, 1, (anb) (Object) var12_ref_nbb);
                                  break L51;
                                } else {
                                  break L51;
                                }
                              } else {
                                break L51;
                              }
                            }
                            var11_int++;
                            continue L40;
                          }
                        }
                      } else {
                        L52: {
                          var12_ref_crb = var10_array[var11_int];
                          if (var12_ref_crb != null) {
                            if (null == var12_ref_crb.field_k.a(var8, var7, true)) {
                              break L52;
                            } else {
                              ((pe) this).a(-105, 2, (anb) (Object) var12_ref_crb);
                              break L52;
                            }
                          } else {
                            break L52;
                          }
                        }
                        var11_int++;
                        continue L39;
                      }
                    }
                  }
                }
              }
            }
            var5_int++;
            continue L0;
          }
        }
    }

    final anb g(byte param0, int param1) {
        int var3 = 0;
        int var4_int = 0;
        sg var4 = null;
        nbb var5 = null;
        int var6 = 0;
        int var7 = 0;
        var6 = VoidHunters.field_G;
        var3 = 0;
        var4_int = -108 % ((-71 - param0) / 44);
        L0: while (true) {
          if (var3 >= ((pe) this).field_m.length) {
            var7 = 0;
            var3 = var7;
            L1: while (true) {
              if (var7 < ((pe) this).field_k.length) {
                var4 = ((pe) this).field_k[var7];
                if (null != var4) {
                  if (var4.field_k.a(param1, 0) > 0) {
                    return (anb) (Object) var4;
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
            var5 = ((pe) this).field_m[var3];
            if (var5 != null) {
              if (var5.field_k.a(param1, 0) > 0) {
                return (anb) (Object) var5;
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
        tj var6 = (tj) (Object) ((pe) this).field_x.d(0);
        while (var6 != null) {
            if (var6.g((byte) -104) == 6) {
                if (param0 == var6.d((byte) -119)) {
                    return true;
                }
            }
            var6 = (tj) (Object) ((pe) this).field_x.a((byte) 40);
        }
        int var4 = -114 % ((69 - param1) / 37);
        return false;
    }

    final boolean a(int param0, int param1, boolean param2, int param3) {
        sg[] var5 = null;
        rdb var5_ref = null;
        int var6 = 0;
        sg var7_ref_sg = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        sg[] var12 = null;
        var11 = VoidHunters.field_G;
        var12 = ((pe) this).field_k;
        var5 = var12;
        var6 = 0;
        L0: while (true) {
          if (var12.length <= var6) {
            L1: {
              var5_ref = (rdb) (Object) ((pe) this).field_n.d(0);
              if (!param2) {
                break L1;
              } else {
                ((pe) this).field_x = null;
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
                var5_ref = (rdb) (Object) ((pe) this).field_n.a((byte) 107);
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
              if (param0 == 5706) {
                break L1;
              } else {
                ((pe) this).field_m = null;
                break L1;
              }
            }
            ((pe) this).field_t = (cq[]) (Object) ija.a((Object) (Object) param1, (Object[]) (Object) ((pe) this).field_t, param0 + -5706, wsb.field_e);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) runtimeException;
            stackOut_4_1 = new StringBuilder().append("pe.HB(").append(param0).append(44);
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
          throw rta.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
    }

    final mqb h(int param0, int param1) {
        int var3 = 63 / ((param1 - -59) / 42);
        param0 = param0 - field_c[3];
        if (param0 < 0) {
            return null;
        }
        return (mqb) (Object) this.b((anb[]) (Object) ((pe) this).field_g, true, param0);
    }

    private final void a(anb param0, anb param1, gda param2, int param3, boolean param4) {
        ml var6 = null;
        RuntimeException var6_ref = null;
        wfb var7 = null;
        int var8 = 0;
        ml var9 = null;
        wfb var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        sg var13_ref_sg = null;
        int var14 = 0;
        sg var14_ref_sg = null;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int stackIn_36_0 = 0;
        RuntimeException stackIn_87_0 = null;
        StringBuilder stackIn_87_1 = null;
        RuntimeException stackIn_89_0 = null;
        StringBuilder stackIn_89_1 = null;
        RuntimeException stackIn_90_0 = null;
        StringBuilder stackIn_90_1 = null;
        String stackIn_90_2 = null;
        RuntimeException stackIn_91_0 = null;
        StringBuilder stackIn_91_1 = null;
        RuntimeException stackIn_93_0 = null;
        StringBuilder stackIn_93_1 = null;
        RuntimeException stackIn_94_0 = null;
        StringBuilder stackIn_94_1 = null;
        String stackIn_94_2 = null;
        RuntimeException stackIn_95_0 = null;
        StringBuilder stackIn_95_1 = null;
        RuntimeException stackIn_97_0 = null;
        StringBuilder stackIn_97_1 = null;
        RuntimeException stackIn_98_0 = null;
        StringBuilder stackIn_98_1 = null;
        String stackIn_98_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_35_0 = 0;
        int stackOut_34_0 = 0;
        RuntimeException stackOut_86_0 = null;
        StringBuilder stackOut_86_1 = null;
        RuntimeException stackOut_89_0 = null;
        StringBuilder stackOut_89_1 = null;
        String stackOut_89_2 = null;
        RuntimeException stackOut_87_0 = null;
        StringBuilder stackOut_87_1 = null;
        String stackOut_87_2 = null;
        RuntimeException stackOut_90_0 = null;
        StringBuilder stackOut_90_1 = null;
        RuntimeException stackOut_93_0 = null;
        StringBuilder stackOut_93_1 = null;
        String stackOut_93_2 = null;
        RuntimeException stackOut_91_0 = null;
        StringBuilder stackOut_91_1 = null;
        String stackOut_91_2 = null;
        RuntimeException stackOut_94_0 = null;
        StringBuilder stackOut_94_1 = null;
        RuntimeException stackOut_97_0 = null;
        StringBuilder stackOut_97_1 = null;
        String stackOut_97_2 = null;
        RuntimeException stackOut_95_0 = null;
        StringBuilder stackOut_95_1 = null;
        String stackOut_95_2 = null;
        try {
          L0: {
            L1: {
              var6 = param2.field_h;
              var7 = var6.i((byte) -112);
              var8 = var7.field_q;
              var9 = param2.field_m;
              var10 = var9.i((byte) -112);
              if (param4) {
                break L1;
              } else {
                if (var6.field_j == 22) {
                  break L1;
                } else {
                  if (var9.field_j != 22) {
                    return;
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
                  var13_ref_sg = (sg) (Object) param0;
                  var14_ref_sg = (sg) (Object) param1;
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
              if (null == var6.field_c) {
                break L3;
              } else {
                if (0 < var6.field_c.a((byte) 24).b((byte) 63)) {
                  L4: {
                    var18 = jsb.field_d * var6.field_c.field_b >> 4;
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
                    var18 = jsb.field_d * var9.field_c.field_b >> 4;
                    if (var18 > 1) {
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
              if (var6.i((byte) -112).field_r) {
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
              if (!var6.k((byte) 69)) {
                stackOut_35_0 = 0;
                stackIn_36_0 = stackOut_35_0;
                break L9;
              } else {
                stackOut_34_0 = 1;
                stackIn_36_0 = stackOut_34_0;
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
                        if (((sg) (Object) param1).j((byte) 103)) {
                          break L11;
                        } else {
                          break L13;
                        }
                      }
                    }
                    int discarded$2 = var6.a(var13, (byte) -119);
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
                        if (((sg) (Object) param0).j((byte) -74)) {
                          break L14;
                        } else {
                          break L16;
                        }
                      }
                    }
                    int discarded$3 = var9.a(var8, (byte) -125);
                    break L14;
                  }
                  L17: {
                    if (null == var6.field_c) {
                      break L17;
                    } else {
                      if (var6.field_c.a((byte) 24).b((byte) 101) > 0) {
                        var6.field_c.field_b = var6.field_c.field_b * 3 / 4;
                        break L17;
                      } else {
                        break L17;
                      }
                    }
                  }
                  if (var9.field_c == null) {
                    break L10;
                  } else {
                    if (var9.field_c.a((byte) 24).b((byte) 47) <= 0) {
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
                param0.field_k.a(true, var9, (pe) this, 101, param0);
                param0.field_k.a((byte) -125, param0);
                if (var10.field_y <= 0) {
                  break L18;
                } else {
                  ((pe) this).a((byte) -44, param0, var9, var10);
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
                param1.field_k.a(true, var6, (pe) this, 62, param1);
                param1.field_k.a((byte) 116, param1);
                if (var7.field_y > 0) {
                  ((pe) this).a((byte) -44, param1, var6, var7);
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
                if (var6.k((byte) 91)) {
                  break L22;
                } else {
                  rmb.a(param2.field_l, param1.field_l, 46, -126, param2.field_e);
                  this.a(var8 >> 8, param2.field_l, var7.field_v, (byte) -82, param2.field_e, var6.field_n, var6.field_r);
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
                  this.a(var13 >> 8, param2.field_l, var10.field_v, (byte) -13, param2.field_e, var9.field_n, var9.field_r);
                  break L23;
                } else {
                  break L23;
                }
              }
            }
            param0.d((byte) 71);
            param1.d((byte) 107);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L24: {
            var6_ref = decompiledCaughtException;
            stackOut_86_0 = (RuntimeException) var6_ref;
            stackOut_86_1 = new StringBuilder().append("pe.VA(");
            stackIn_89_0 = stackOut_86_0;
            stackIn_89_1 = stackOut_86_1;
            stackIn_87_0 = stackOut_86_0;
            stackIn_87_1 = stackOut_86_1;
            if (param0 == null) {
              stackOut_89_0 = (RuntimeException) (Object) stackIn_89_0;
              stackOut_89_1 = (StringBuilder) (Object) stackIn_89_1;
              stackOut_89_2 = "null";
              stackIn_90_0 = stackOut_89_0;
              stackIn_90_1 = stackOut_89_1;
              stackIn_90_2 = stackOut_89_2;
              break L24;
            } else {
              stackOut_87_0 = (RuntimeException) (Object) stackIn_87_0;
              stackOut_87_1 = (StringBuilder) (Object) stackIn_87_1;
              stackOut_87_2 = "{...}";
              stackIn_90_0 = stackOut_87_0;
              stackIn_90_1 = stackOut_87_1;
              stackIn_90_2 = stackOut_87_2;
              break L24;
            }
          }
          L25: {
            stackOut_90_0 = (RuntimeException) (Object) stackIn_90_0;
            stackOut_90_1 = ((StringBuilder) (Object) stackIn_90_1).append(stackIn_90_2).append(44);
            stackIn_93_0 = stackOut_90_0;
            stackIn_93_1 = stackOut_90_1;
            stackIn_91_0 = stackOut_90_0;
            stackIn_91_1 = stackOut_90_1;
            if (param1 == null) {
              stackOut_93_0 = (RuntimeException) (Object) stackIn_93_0;
              stackOut_93_1 = (StringBuilder) (Object) stackIn_93_1;
              stackOut_93_2 = "null";
              stackIn_94_0 = stackOut_93_0;
              stackIn_94_1 = stackOut_93_1;
              stackIn_94_2 = stackOut_93_2;
              break L25;
            } else {
              stackOut_91_0 = (RuntimeException) (Object) stackIn_91_0;
              stackOut_91_1 = (StringBuilder) (Object) stackIn_91_1;
              stackOut_91_2 = "{...}";
              stackIn_94_0 = stackOut_91_0;
              stackIn_94_1 = stackOut_91_1;
              stackIn_94_2 = stackOut_91_2;
              break L25;
            }
          }
          L26: {
            stackOut_94_0 = (RuntimeException) (Object) stackIn_94_0;
            stackOut_94_1 = ((StringBuilder) (Object) stackIn_94_1).append(stackIn_94_2).append(44);
            stackIn_97_0 = stackOut_94_0;
            stackIn_97_1 = stackOut_94_1;
            stackIn_95_0 = stackOut_94_0;
            stackIn_95_1 = stackOut_94_1;
            if (param2 == null) {
              stackOut_97_0 = (RuntimeException) (Object) stackIn_97_0;
              stackOut_97_1 = (StringBuilder) (Object) stackIn_97_1;
              stackOut_97_2 = "null";
              stackIn_98_0 = stackOut_97_0;
              stackIn_98_1 = stackOut_97_1;
              stackIn_98_2 = stackOut_97_2;
              break L26;
            } else {
              stackOut_95_0 = (RuntimeException) (Object) stackIn_95_0;
              stackOut_95_1 = (StringBuilder) (Object) stackIn_95_1;
              stackOut_95_2 = "{...}";
              stackIn_98_0 = stackOut_95_0;
              stackIn_98_1 = stackOut_95_1;
              stackIn_98_2 = stackOut_95_2;
              break L26;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_98_0, stackIn_98_2 + 44 + 46 + 44 + param4 + 41);
        }
    }

    private final void a(byte param0, tj param1, boolean param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
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
                gab.field_b.a((pe) this, -1, wgb.field_i, param2);
                gab.field_b.b((byte) -113);
                break L2;
              } else {
                break L2;
              }
            }
            var4_int = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4;
            stackOut_10_1 = new StringBuilder().append("pe.IB(").append(108).append(44);
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
          throw rta.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param2 + 41);
        }
    }

    final anb d(byte param0, int param1) {
        anb var3 = null;
        if (param1 >= 0) {
          var3 = this.b((anb[]) (Object) ((pe) this).field_k, true, param1);
          if (null != var3) {
            return var3;
          } else {
            param1 = param1 - field_w[0];
            var3 = this.b((anb[]) (Object) ((pe) this).field_m, true, param1);
            if (param0 == -27) {
              if (var3 == null) {
                param1 = param1 - field_w[1];
                var3 = this.b((anb[]) (Object) ((pe) this).field_e.c(0), true, param1);
                if (var3 != null) {
                  return var3;
                } else {
                  param1 = param1 - field_w[2];
                  var3 = this.b((anb[]) (Object) ((pe) this).field_g, true, param1);
                  return var3;
                }
              } else {
                return var3;
              }
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    final it a(byte param0, int param1) {
        int var3 = 0;
        it[] var4 = null;
        int var5 = 0;
        it var6 = null;
        int var7 = 0;
        var7 = VoidHunters.field_G;
        if (((pe) this).field_j != null) {
          var3 = -102 % ((-32 - param0) / 63);
          var4 = ((pe) this).field_j;
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
        RuntimeException var4 = null;
        int var4_int = 0;
        Object var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        var8 = VoidHunters.field_G;
        try {
          L0: {
            var4_int = -field_c[param1] + param2.field_l;
            if (var4_int < 0) {
              return;
            } else {
              L1: {
                var5 = null;
                var6 = -1;
                var7 = param1;
                if (var7 != 0) {
                  if (var7 != 1) {
                    if (var7 == 2) {
                      var6 = 3;
                      var5 = (Object) (Object) ((pe) this).field_e.c(0);
                      ((pe) this).field_e.b(-89);
                      break L1;
                    } else {
                      if (3 != var7) {
                        break L1;
                      } else {
                        var5 = (Object) (Object) ((pe) this).field_g;
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
                    var5 = (Object) (Object) ((pe) this).field_m;
                    break L1;
                  }
                } else {
                  var5 = (Object) (Object) ((pe) this).field_k;
                  var6 = 1;
                  break L1;
                }
              }
              L3: {
                if (param0 < -96) {
                  break L3;
                } else {
                  ((pe) this).field_q = true;
                  break L3;
                }
              }
              L4: {
                if (var5 == null) {
                  break L4;
                } else {
                  if (~((Object[]) var5).length >= ~var4_int) {
                    break L4;
                  } else {
                    ((Object[]) var5)[var4_int] = null;
                    break L4;
                  }
                }
              }
              L5: {
                if (var6 != -1) {
                  ((pe) this).field_u.a(param2.field_l, param2.field_q, var6, (byte) -94);
                  break L5;
                } else {
                  break L5;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_38_0 = (RuntimeException) var4;
            stackOut_38_1 = new StringBuilder().append("pe.GE(").append(param0).append(44).append(param1).append(44);
            stackIn_41_0 = stackOut_38_0;
            stackIn_41_1 = stackOut_38_1;
            stackIn_39_0 = stackOut_38_0;
            stackIn_39_1 = stackOut_38_1;
            if (param2 == null) {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "null";
              stackIn_42_0 = stackOut_41_0;
              stackIn_42_1 = stackOut_41_1;
              stackIn_42_2 = stackOut_41_2;
              break L6;
            } else {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "{...}";
              stackIn_42_0 = stackOut_39_0;
              stackIn_42_1 = stackOut_39_1;
              stackIn_42_2 = stackOut_39_2;
              break L6;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_42_0, stackIn_42_2 + 41);
        }
    }

    public final void b(byte param0, tv param1) {
        Object var3 = null;
        RuntimeException var3_ref = null;
        pe var3_ref2 = null;
        Object var4 = null;
        int var5 = 0;
        RuntimeException stackIn_99_0 = null;
        StringBuilder stackIn_99_1 = null;
        RuntimeException stackIn_101_0 = null;
        StringBuilder stackIn_101_1 = null;
        RuntimeException stackIn_102_0 = null;
        StringBuilder stackIn_102_1 = null;
        String stackIn_102_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_98_0 = null;
        StringBuilder stackOut_98_1 = null;
        RuntimeException stackOut_101_0 = null;
        StringBuilder stackOut_101_1 = null;
        String stackOut_101_2 = null;
        RuntimeException stackOut_99_0 = null;
        StringBuilder stackOut_99_1 = null;
        String stackOut_99_2 = null;
        var3 = null;
        var5 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var3_ref2 = (pe) (Object) param1;
              int discarded$15 = 0;
              var3_ref2.field_k = (sg[]) (Object) sqb.a((tv[]) (Object) var3_ref2.field_k, (tv[]) (Object) var3_ref2.field_k, 1, qdb.field_a);
              if (var3_ref2.field_v) {
                L2: {
                  if (VoidHunters.a(true, (Object) (Object) var3_ref2.field_k)) {
                    System.err.println("Ship[] ships the actual object has a duplicate reference");
                    break L2;
                  } else {
                    break L2;
                  }
                }
                int discarded$16 = 0;
                var4 = tjb.a((Object[]) (Object) var3_ref2.field_k);
                if (null == var4) {
                  break L1;
                } else {
                  System.err.println("An element of Ship[] ships has a duplicate reference - " + var4.toString());
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L3: {
              int discarded$17 = 0;
              var3_ref2.field_s = (oq[]) (Object) sqb.a((tv[]) (Object) var3_ref2.field_s, (tv[]) (Object) var3_ref2.field_s, 1, tt.field_c);
              if (!var3_ref2.field_v) {
                break L3;
              } else {
                L4: {
                  if (!VoidHunters.a(true, (Object) (Object) var3_ref2.field_s)) {
                    break L4;
                  } else {
                    System.err.println("Particle[] particles the actual object has a duplicate reference");
                    break L4;
                  }
                }
                int discarded$18 = 0;
                var4 = tjb.a((Object[]) (Object) var3_ref2.field_s);
                if (var4 == null) {
                  break L3;
                } else {
                  System.err.println("An element of Particle[] particles has a duplicate reference - " + var4.toString());
                  break L3;
                }
              }
            }
            L5: {
              var3_ref2.field_x = kk.a(var3_ref2.field_x, var3_ref2.field_x, 1, aba.field_b, -90);
              if (!var3_ref2.field_v) {
                break L5;
              } else {
                L6: {
                  if (!VoidHunters.a(true, (Object) (Object) var3_ref2.field_x)) {
                    break L6;
                  } else {
                    System.err.println("linklist<voidhunters.common.worldstate.Projectile> projectiles the actual object has a duplicate reference");
                    break L6;
                  }
                }
                int discarded$19 = 12642;
                var4 = nqa.a(var3_ref2.field_x);
                if (var4 != null) {
                  System.err.println("An element of linklist<voidhunters.common.worldstate.Projectile> projectiles has a duplicate reference - " + var4.toString());
                  break L5;
                } else {
                  break L5;
                }
              }
            }
            L7: {
              ((pe) this).field_h = false;
              var3_ref2.field_m = var3_ref2.field_m;
              var3_ref2.field_h = false;
              if (var3_ref2.field_e == null) {
                var3_ref2.field_e = null;
                break L7;
              } else {
                L8: {
                  if (null != var3_ref2.field_e) {
                    break L8;
                  } else {
                    var3_ref2.field_e = new aib();
                    break L8;
                  }
                }
                var3_ref2.field_e.b((byte) 79, (tv) (Object) var3_ref2.field_e);
                if (!var3_ref2.field_v) {
                  break L7;
                } else {
                  if (VoidHunters.a(true, (Object) (Object) var3_ref2.field_e)) {
                    System.err.println("AsteroidContainer asteroid_container has a duplicate reference");
                    break L7;
                  } else {
                    break L7;
                  }
                }
              }
            }
            L9: {
              var3_ref2.field_n = kk.a(var3_ref2.field_n, var3_ref2.field_n, 1, ioa.field_q, 88);
              if (var3_ref2.field_v) {
                L10: {
                  if (VoidHunters.a(true, (Object) (Object) var3_ref2.field_n)) {
                    System.err.println("linklist<voidhunters.common.worldstate.SpawnPoint> spawn_points the actual object has a duplicate reference");
                    break L10;
                  } else {
                    break L10;
                  }
                }
                int discarded$20 = 12642;
                var4 = nqa.a(var3_ref2.field_n);
                if (var4 == null) {
                  break L9;
                } else {
                  System.err.println("An element of linklist<voidhunters.common.worldstate.SpawnPoint> spawn_points has a duplicate reference - " + var4.toString());
                  break L9;
                }
              } else {
                break L9;
              }
            }
            L11: {
              int discarded$21 = 0;
              var3_ref2.field_g = (mqb[]) (Object) sqb.a((tv[]) (Object) var3_ref2.field_g, (tv[]) (Object) var3_ref2.field_g, 1, dab.field_c);
              if (!var3_ref2.field_v) {
                break L11;
              } else {
                L12: {
                  if (VoidHunters.a(true, (Object) (Object) var3_ref2.field_g)) {
                    System.err.println("GrapplingHook[] grappling_hooks the actual object has a duplicate reference");
                    break L12;
                  } else {
                    break L12;
                  }
                }
                int discarded$22 = 0;
                var4 = tjb.a((Object[]) (Object) var3_ref2.field_g);
                if (null != var4) {
                  System.err.println("An element of GrapplingHook[] grappling_hooks has a duplicate reference - " + var4.toString());
                  break L11;
                } else {
                  break L11;
                }
              }
            }
            L13: {
              var3_ref2.field_l = dob.a(var3_ref2.field_l, (byte) -66, var3_ref2.field_l);
              var3_ref2.field_v = var3_ref2.field_v;
              if (param0 >= 54) {
                break L13;
              } else {
                boolean discarded$23 = ((pe) this).a((byte) -80, (tv) null);
                break L13;
              }
            }
            L14: {
              var3_ref2.field_y = var3_ref2.field_y;
              var3_ref2.field_i = var3_ref2.field_i;
              if (var3_ref2.field_f != null) {
                L15: {
                  if (null != var3_ref2.field_f) {
                    break L15;
                  } else {
                    var3_ref2.field_f = new una();
                    break L15;
                  }
                }
                var3_ref2.field_f.b((byte) 87, (tv) (Object) var3_ref2.field_f);
                if (!var3_ref2.field_v) {
                  break L14;
                } else {
                  if (VoidHunters.a(true, (Object) (Object) var3_ref2.field_f)) {
                    System.err.println("MissionControl mission_control has a duplicate reference");
                    break L14;
                  } else {
                    break L14;
                  }
                }
              } else {
                var3_ref2.field_f = null;
                break L14;
              }
            }
            L16: {
              int discarded$24 = 0;
              var3_ref2.field_t = (cq[]) (Object) sqb.a((tv[]) (Object) var3_ref2.field_t, (tv[]) (Object) var3_ref2.field_t, 1, wsb.field_e);
              if (var3_ref2.field_v) {
                L17: {
                  if (!VoidHunters.a(true, (Object) (Object) var3_ref2.field_t)) {
                    break L17;
                  } else {
                    System.err.println("MapZone[] map_zones the actual object has a duplicate reference");
                    break L17;
                  }
                }
                int discarded$25 = 0;
                var4 = tjb.a((Object[]) (Object) var3_ref2.field_t);
                if (null == var4) {
                  break L16;
                } else {
                  System.err.println("An element of MapZone[] map_zones has a duplicate reference - " + var4.toString());
                  break L16;
                }
              } else {
                break L16;
              }
            }
            L18: {
              int discarded$26 = 0;
              var3_ref2.field_a = (rba[]) (Object) sqb.a((tv[]) (Object) var3_ref2.field_a, (tv[]) (Object) var3_ref2.field_a, 1, ema.field_p);
              if (var3_ref2.field_v) {
                L19: {
                  if (!VoidHunters.a(true, (Object) (Object) var3_ref2.field_a)) {
                    break L19;
                  } else {
                    System.err.println("ResourceNode[] res_nodes the actual object has a duplicate reference");
                    break L19;
                  }
                }
                int discarded$27 = 0;
                var4 = tjb.a((Object[]) (Object) var3_ref2.field_a);
                if (var4 != null) {
                  System.err.println("An element of ResourceNode[] res_nodes has a duplicate reference - " + var4.toString());
                  break L18;
                } else {
                  break L18;
                }
              } else {
                break L18;
              }
            }
            L20: {
              var3_ref2.field_p = var3_ref2.field_p;
              ((pe) this).field_q = false;
              var3_ref2.field_o = var3_ref2.field_o;
              var3_ref2.field_r = var3_ref2.field_r;
              var3_ref2.field_q = false;
              if (null != var3_ref2.field_u) {
                L21: {
                  if (var3_ref2.field_u == null) {
                    var3_ref2.field_u = new fba();
                    break L21;
                  } else {
                    break L21;
                  }
                }
                var3_ref2.field_u.b((byte) 122, (tv) (Object) var3_ref2.field_u);
                if (!var3_ref2.field_v) {
                  break L20;
                } else {
                  if (!VoidHunters.a(true, (Object) (Object) var3_ref2.field_u)) {
                    break L20;
                  } else {
                    System.err.println("PartitioningManager grid has a duplicate reference");
                    break L20;
                  }
                }
              } else {
                var3_ref2.field_u = null;
                break L20;
              }
            }
            L22: {
              int discarded$28 = 0;
              var3_ref2.field_j = (it[]) (Object) sqb.a((tv[]) (Object) var3_ref2.field_j, (tv[]) (Object) var3_ref2.field_j, 1, pgb.field_g);
              if (var3_ref2.field_v) {
                L23: {
                  if (!VoidHunters.a(true, (Object) (Object) var3_ref2.field_j)) {
                    break L23;
                  } else {
                    System.err.println("EscapePod[] escape_pods the actual object has a duplicate reference");
                    break L23;
                  }
                }
                int discarded$29 = 0;
                var4 = tjb.a((Object[]) (Object) var3_ref2.field_j);
                if (var4 != null) {
                  System.err.println("An element of EscapePod[] escape_pods has a duplicate reference - " + var4.toString());
                  break L22;
                } else {
                  break L22;
                }
              } else {
                break L22;
              }
            }
            var3_ref2.field_b = var3_ref2.field_b;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L24: {
            var3_ref = decompiledCaughtException;
            stackOut_98_0 = (RuntimeException) var3_ref;
            stackOut_98_1 = new StringBuilder().append("pe.D(").append(param0).append(44);
            stackIn_101_0 = stackOut_98_0;
            stackIn_101_1 = stackOut_98_1;
            stackIn_99_0 = stackOut_98_0;
            stackIn_99_1 = stackOut_98_1;
            if (param1 == null) {
              stackOut_101_0 = (RuntimeException) (Object) stackIn_101_0;
              stackOut_101_1 = (StringBuilder) (Object) stackIn_101_1;
              stackOut_101_2 = "null";
              stackIn_102_0 = stackOut_101_0;
              stackIn_102_1 = stackOut_101_1;
              stackIn_102_2 = stackOut_101_2;
              break L24;
            } else {
              stackOut_99_0 = (RuntimeException) (Object) stackIn_99_0;
              stackOut_99_1 = (StringBuilder) (Object) stackIn_99_1;
              stackOut_99_2 = "{...}";
              stackIn_102_0 = stackOut_99_0;
              stackIn_102_1 = stackOut_99_1;
              stackIn_102_2 = stackOut_99_2;
              break L24;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_102_0, stackIn_102_2 + 41);
        }
    }

    final void a(bba param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (null != ((pe) this).field_f) {
                break L1;
              } else {
                ((pe) this).field_f = new una();
                break L1;
              }
            }
            L2: {
              if (param1 == -38) {
                break L2;
              } else {
                ((pe) this).field_k = null;
                break L2;
              }
            }
            ((pe) this).field_f.a(0, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) runtimeException;
            stackOut_6_1 = new StringBuilder().append("pe.AF(");
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
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_10_0 = stackOut_7_0;
              stackIn_10_1 = stackOut_7_1;
              stackIn_10_2 = stackOut_7_2;
              break L3;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param1 + 41);
        }
    }

    public final boolean a(byte param0, tv param1) {
        pe var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int stackIn_7_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_22_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_33_1 = 0;
        int stackIn_46_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_50_1 = 0;
        int stackIn_57_0 = 0;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_62_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_21_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_32_1 = 0;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        int stackOut_45_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_49_1 = 0;
        int stackOut_47_0 = 0;
        int stackOut_47_1 = 0;
        int stackOut_56_0 = 0;
        int stackOut_54_0 = 0;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        String stackOut_61_2 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        String stackOut_59_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                var4 = 33 % ((22 - param0) / 59);
                var3 = (pe) (Object) param1;
                if (dn.a((tv[]) (Object) var3.field_k, false, 1, (tv[]) (Object) var3.field_k, 126)) {
                  break L2;
                } else {
                  int discarded$5 = 210377952;
                  int discarded$6 = 210377952;
                  if (dn.a(hob.a(var3.field_x), false, 1, hob.a(var3.field_x), -79)) {
                    break L2;
                  } else {
                    if (dn.a((tv[]) (Object) var3.field_m, false, 1, (tv[]) (Object) var3.field_m, 117)) {
                      break L2;
                    } else {
                      L3: {
                        if (var3.field_e != null) {
                          stackOut_6_0 = 0;
                          stackIn_7_0 = stackOut_6_0;
                          break L3;
                        } else {
                          stackOut_4_0 = 1;
                          stackIn_7_0 = stackOut_4_0;
                          break L3;
                        }
                      }
                      L4: {
                        stackOut_7_0 = stackIn_7_0;
                        stackIn_10_0 = stackOut_7_0;
                        stackIn_8_0 = stackOut_7_0;
                        if (var3.field_e != null) {
                          stackOut_10_0 = stackIn_10_0;
                          stackOut_10_1 = 0;
                          stackIn_11_0 = stackOut_10_0;
                          stackIn_11_1 = stackOut_10_1;
                          break L4;
                        } else {
                          stackOut_8_0 = stackIn_8_0;
                          stackOut_8_1 = 1;
                          stackIn_11_0 = stackOut_8_0;
                          stackIn_11_1 = stackOut_8_1;
                          break L4;
                        }
                      }
                      if ((stackIn_11_0 ^ stackIn_11_1) != 0) {
                        break L2;
                      } else {
                        L5: {
                          if (null == var3.field_e) {
                            break L5;
                          } else {
                            if (var3.field_e.a((byte) -65, (tv) (Object) var3.field_e)) {
                              break L2;
                            } else {
                              break L5;
                            }
                          }
                        }
                        int discarded$7 = 210377952;
                        int discarded$8 = 210377952;
                        if (dn.a(hob.a(var3.field_n), false, 1, hob.a(var3.field_n), -93)) {
                          break L2;
                        } else {
                          if (dn.a((tv[]) (Object) var3.field_g, false, 1, (tv[]) (Object) var3.field_g, 122)) {
                            break L2;
                          } else {
                            int discarded$9 = 28;
                            if (wpb.a(var3.field_l, var3.field_l)) {
                              break L2;
                            } else {
                              L6: {
                                if (var3.field_v) {
                                  stackOut_21_0 = 0;
                                  stackIn_22_0 = stackOut_21_0;
                                  break L6;
                                } else {
                                  stackOut_19_0 = 1;
                                  stackIn_22_0 = stackOut_19_0;
                                  break L6;
                                }
                              }
                              if (stackIn_22_0 == (var3.field_v ? 1 : 0)) {
                                break L2;
                              } else {
                                if (var3.field_y != var3.field_y) {
                                  break L2;
                                } else {
                                  if (var3.field_i != var3.field_i) {
                                    break L2;
                                  } else {
                                    L7: {
                                      if (var3.field_f != null) {
                                        stackOut_28_0 = 0;
                                        stackIn_29_0 = stackOut_28_0;
                                        break L7;
                                      } else {
                                        stackOut_26_0 = 1;
                                        stackIn_29_0 = stackOut_26_0;
                                        break L7;
                                      }
                                    }
                                    L8: {
                                      stackOut_29_0 = stackIn_29_0;
                                      stackIn_32_0 = stackOut_29_0;
                                      stackIn_30_0 = stackOut_29_0;
                                      if (null != var3.field_f) {
                                        stackOut_32_0 = stackIn_32_0;
                                        stackOut_32_1 = 0;
                                        stackIn_33_0 = stackOut_32_0;
                                        stackIn_33_1 = stackOut_32_1;
                                        break L8;
                                      } else {
                                        stackOut_30_0 = stackIn_30_0;
                                        stackOut_30_1 = 1;
                                        stackIn_33_0 = stackOut_30_0;
                                        stackIn_33_1 = stackOut_30_1;
                                        break L8;
                                      }
                                    }
                                    if ((stackIn_33_0 ^ stackIn_33_1) != 0) {
                                      break L2;
                                    } else {
                                      L9: {
                                        if (null == var3.field_f) {
                                          break L9;
                                        } else {
                                          if (var3.field_f.a((byte) 123, (tv) (Object) var3.field_f)) {
                                            break L2;
                                          } else {
                                            break L9;
                                          }
                                        }
                                      }
                                      if (dn.a((tv[]) (Object) var3.field_t, false, 1, (tv[]) (Object) var3.field_t, -71)) {
                                        break L2;
                                      } else {
                                        if (dn.a((tv[]) (Object) var3.field_a, false, 1, (tv[]) (Object) var3.field_a, -5)) {
                                          break L2;
                                        } else {
                                          if (var3.field_o != var3.field_o) {
                                            break L2;
                                          } else {
                                            if (var3.field_r != var3.field_r) {
                                              break L2;
                                            } else {
                                              if (dn.a((tv[]) (Object) var3.field_j, false, 1, (tv[]) (Object) var3.field_j, -20)) {
                                                break L2;
                                              } else {
                                                L10: {
                                                  if (null != var3.field_b) {
                                                    stackOut_45_0 = 0;
                                                    stackIn_46_0 = stackOut_45_0;
                                                    break L10;
                                                  } else {
                                                    stackOut_43_0 = 1;
                                                    stackIn_46_0 = stackOut_43_0;
                                                    break L10;
                                                  }
                                                }
                                                L11: {
                                                  stackOut_46_0 = stackIn_46_0;
                                                  stackIn_49_0 = stackOut_46_0;
                                                  stackIn_47_0 = stackOut_46_0;
                                                  if (null != var3.field_b) {
                                                    stackOut_49_0 = stackIn_49_0;
                                                    stackOut_49_1 = 0;
                                                    stackIn_50_0 = stackOut_49_0;
                                                    stackIn_50_1 = stackOut_49_1;
                                                    break L11;
                                                  } else {
                                                    stackOut_47_0 = stackIn_47_0;
                                                    stackOut_47_1 = 1;
                                                    stackIn_50_0 = stackOut_47_0;
                                                    stackIn_50_1 = stackOut_47_1;
                                                    break L11;
                                                  }
                                                }
                                                if ((stackIn_50_0 ^ stackIn_50_1) != 0) {
                                                  break L2;
                                                } else {
                                                  L12: {
                                                    if (var3.field_b == null) {
                                                      break L12;
                                                    } else {
                                                      if (!var3.field_b.a((byte) 89, (tv) (Object) var3.field_b)) {
                                                        break L12;
                                                      } else {
                                                        break L2;
                                                      }
                                                    }
                                                  }
                                                  stackOut_56_0 = 0;
                                                  stackIn_57_0 = stackOut_56_0;
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
              stackOut_54_0 = 1;
              stackIn_57_0 = stackOut_54_0;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var3_ref = decompiledCaughtException;
            stackOut_58_0 = (RuntimeException) var3_ref;
            stackOut_58_1 = new StringBuilder().append("pe.C(").append(param0).append(44);
            stackIn_61_0 = stackOut_58_0;
            stackIn_61_1 = stackOut_58_1;
            stackIn_59_0 = stackOut_58_0;
            stackIn_59_1 = stackOut_58_1;
            if (param1 == null) {
              stackOut_61_0 = (RuntimeException) (Object) stackIn_61_0;
              stackOut_61_1 = (StringBuilder) (Object) stackIn_61_1;
              stackOut_61_2 = "null";
              stackIn_62_0 = stackOut_61_0;
              stackIn_62_1 = stackOut_61_1;
              stackIn_62_2 = stackOut_61_2;
              break L13;
            } else {
              stackOut_59_0 = (RuntimeException) (Object) stackIn_59_0;
              stackOut_59_1 = (StringBuilder) (Object) stackIn_59_1;
              stackOut_59_2 = "{...}";
              stackIn_62_0 = stackOut_59_0;
              stackIn_62_1 = stackOut_59_1;
              stackIn_62_2 = stackOut_59_2;
              break L13;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_62_0, stackIn_62_2 + 41);
        }
        return stackIn_57_0 != 0;
    }

    private final boolean a(ml param0, ml param1, int param2, sg param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        ml var7 = null;
        Object var8 = null;
        int var10 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_20_0 = 0;
        int stackOut_17_0 = 0;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        var10 = VoidHunters.field_G;
        try {
          L0: {
            if (param0.field_d == null) {
              break L0;
            } else {
              var6_int = 0;
              L1: while (true) {
                if (var6_int >= param0.field_d.length) {
                  break L0;
                } else {
                  L2: {
                    var7 = param0.d(param0.field_d[var6_int].field_c, 692);
                    var8 = null;
                    if (null == param1) {
                      break L2;
                    } else {
                      if (null == param1.field_d) {
                        break L2;
                      } else {
                        if (param1.field_d.length == param0.field_d.length) {
                          var8 = (Object) (Object) param1.d(param1.field_d[var6_int].field_c, 692);
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  L3: {
                    if (null == var7) {
                      break L3;
                    } else {
                      if (param4 != var7.k(0)) {
                        break L3;
                      } else {
                        L4: {
                          if (var8 == null) {
                            break L4;
                          } else {
                            if (((ml) var8).k(0) != var7.k(0)) {
                              break L4;
                            } else {
                              break L3;
                            }
                          }
                        }
                        var7.a((pe) this, (byte) -111, (anb) (Object) param3);
                        param0.a(false, var7, (pe) this, 94, (anb) (Object) param3);
                        qba.a(20382, param3.d(false), 8, param3.g((byte) -90), 5);
                        stackOut_20_0 = 1;
                        stackIn_21_0 = stackOut_20_0;
                        return stackIn_21_0 != 0;
                      }
                    }
                  }
                  L5: {
                    if (null == var7) {
                      break L5;
                    } else {
                      if (!this.a(var7, (ml) var8, 0, param3, param4)) {
                        break L5;
                      } else {
                        stackOut_17_0 = 1;
                        stackIn_18_0 = stackOut_17_0;
                        return stackIn_18_0 != 0;
                      }
                    }
                  }
                  var6_int++;
                  continue L1;
                }
              }
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var6;
            stackOut_25_1 = new StringBuilder().append("pe.T(");
            stackIn_28_0 = stackOut_25_0;
            stackIn_28_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param0 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L6;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_29_0 = stackOut_26_0;
              stackIn_29_1 = stackOut_26_1;
              stackIn_29_2 = stackOut_26_2;
              break L6;
            }
          }
          L7: {
            stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
            stackOut_29_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(44);
            stackIn_32_0 = stackOut_29_0;
            stackIn_32_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param1 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L7;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_33_0 = stackOut_30_0;
              stackIn_33_1 = stackOut_30_1;
              stackIn_33_2 = stackOut_30_2;
              break L7;
            }
          }
          L8: {
            stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
            stackOut_33_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_33_2).append(44).append(0).append(44);
            stackIn_36_0 = stackOut_33_0;
            stackIn_36_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param3 == null) {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L8;
            } else {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "{...}";
              stackIn_37_0 = stackOut_34_0;
              stackIn_37_1 = stackOut_34_1;
              stackIn_37_2 = stackOut_34_2;
              break L8;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_37_0, stackIn_37_2 + 44 + param4 + 41);
        }
    }

    final rca a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        crb[] var9 = null;
        rca var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        crb[] var19_ref_crb__ = null;
        int var19 = 0;
        int var20_int = 0;
        sg[] var20 = null;
        crb var21_ref_crb = null;
        int var21 = 0;
        int var22_int = 0;
        sg var22 = null;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        var26 = VoidHunters.field_G;
        var7 = 32768;
        var8 = 0;
        var9 = ((pe) this).field_e.c(param2);
        var10 = new rca();
        var11 = -(param5 / 2) + param3;
        var11 = Math.max(var11, var7 + -(((pe) this).field_o / 2));
        var12 = param5 / 2 + param3;
        var12 = Math.min(var12, -var7 + ((pe) this).field_o / 2);
        var13 = param0 - param1 / 2;
        var13 = Math.max(var13, var7 + -(((pe) this).field_r / 2));
        var14 = param1 / 2 + param0;
        var14 = Math.min(var14, ((pe) this).field_r / 2 - var7);
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
                var20 = ((pe) this).field_k;
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
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        sg[] var7_ref_sg__ = null;
        int var8 = 0;
        sg var9_ref_sg = null;
        int var23 = 0;
        RuntimeException stackIn_106_0 = null;
        StringBuilder stackIn_106_1 = null;
        RuntimeException stackIn_108_0 = null;
        StringBuilder stackIn_108_1 = null;
        RuntimeException stackIn_109_0 = null;
        StringBuilder stackIn_109_1 = null;
        String stackIn_109_2 = null;
        RuntimeException stackIn_110_0 = null;
        StringBuilder stackIn_110_1 = null;
        RuntimeException stackIn_112_0 = null;
        StringBuilder stackIn_112_1 = null;
        RuntimeException stackIn_113_0 = null;
        StringBuilder stackIn_113_1 = null;
        String stackIn_113_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_105_0 = null;
        StringBuilder stackOut_105_1 = null;
        RuntimeException stackOut_108_0 = null;
        StringBuilder stackOut_108_1 = null;
        String stackOut_108_2 = null;
        RuntimeException stackOut_106_0 = null;
        StringBuilder stackOut_106_1 = null;
        String stackOut_106_2 = null;
        RuntimeException stackOut_109_0 = null;
        StringBuilder stackOut_109_1 = null;
        RuntimeException stackOut_112_0 = null;
        StringBuilder stackOut_112_1 = null;
        String stackOut_112_2 = null;
        RuntimeException stackOut_110_0 = null;
        StringBuilder stackOut_110_1 = null;
        String stackOut_110_2 = null;
        var23 = VoidHunters.field_G;
        try {
          L0: {
            if (param0 > 18) {
              var5_int = 0;
              L1: while (true) {
                if (var5_int >= ((pe) this).field_l.length) {
                  break L0;
                } else {
                  var6 = 0;
                  var7_ref_sg__ = ((pe) this).field_k;
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
                    L5: {
                      if (var6 != 0) {
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    var5_int++;
                    continue L1;
                  }
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackOut_105_0 = (RuntimeException) var5;
            stackOut_105_1 = new StringBuilder().append("pe.NE(").append(param0).append(44).append(param1).append(44);
            stackIn_108_0 = stackOut_105_0;
            stackIn_108_1 = stackOut_105_1;
            stackIn_106_0 = stackOut_105_0;
            stackIn_106_1 = stackOut_105_1;
            if (param2 == null) {
              stackOut_108_0 = (RuntimeException) (Object) stackIn_108_0;
              stackOut_108_1 = (StringBuilder) (Object) stackIn_108_1;
              stackOut_108_2 = "null";
              stackIn_109_0 = stackOut_108_0;
              stackIn_109_1 = stackOut_108_1;
              stackIn_109_2 = stackOut_108_2;
              break L6;
            } else {
              stackOut_106_0 = (RuntimeException) (Object) stackIn_106_0;
              stackOut_106_1 = (StringBuilder) (Object) stackIn_106_1;
              stackOut_106_2 = "{...}";
              stackIn_109_0 = stackOut_106_0;
              stackIn_109_1 = stackOut_106_1;
              stackIn_109_2 = stackOut_106_2;
              break L6;
            }
          }
          L7: {
            stackOut_109_0 = (RuntimeException) (Object) stackIn_109_0;
            stackOut_109_1 = ((StringBuilder) (Object) stackIn_109_1).append(stackIn_109_2).append(44);
            stackIn_112_0 = stackOut_109_0;
            stackIn_112_1 = stackOut_109_1;
            stackIn_110_0 = stackOut_109_0;
            stackIn_110_1 = stackOut_109_1;
            if (param3 == null) {
              stackOut_112_0 = (RuntimeException) (Object) stackIn_112_0;
              stackOut_112_1 = (StringBuilder) (Object) stackIn_112_1;
              stackOut_112_2 = "null";
              stackIn_113_0 = stackOut_112_0;
              stackIn_113_1 = stackOut_112_1;
              stackIn_113_2 = stackOut_112_2;
              break L7;
            } else {
              stackOut_110_0 = (RuntimeException) (Object) stackIn_110_0;
              stackOut_110_1 = (StringBuilder) (Object) stackIn_110_1;
              stackOut_110_2 = "{...}";
              stackIn_113_0 = stackOut_110_0;
              stackIn_113_1 = stackOut_110_1;
              stackIn_113_2 = stackOut_110_2;
              break L7;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_113_0, stackIn_113_2 + 41);
        }
    }

    public final void b(faa param0, int param1) {
        RuntimeException var3 = null;
        faa var3_ref = null;
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
        nbb[] var6_array2 = null;
        mqb[] var6_array3 = null;
        cq[] var6_array4 = null;
        rba[] var6_array5 = null;
        it[] var6_array6 = null;
        int var7 = 0;
        sg var8 = null;
        tv var8_ref = null;
        nbb var8_ref2 = null;
        mqb var8_ref3 = null;
        cq var8_ref4 = null;
        rba var8_ref5 = null;
        it var8_ref6 = null;
        int var9 = 0;
        int stackIn_5_0 = 0;
        faa stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        faa stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        faa stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        int stackIn_25_0 = 0;
        faa stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        faa stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        faa stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        int stackIn_32_2 = 0;
        int stackIn_41_0 = 0;
        faa stackIn_47_0 = null;
        int stackIn_47_1 = 0;
        faa stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        faa stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        int stackIn_50_2 = 0;
        faa stackIn_56_0 = null;
        int stackIn_56_1 = 0;
        faa stackIn_58_0 = null;
        int stackIn_58_1 = 0;
        faa stackIn_59_0 = null;
        int stackIn_59_1 = 0;
        int stackIn_59_2 = 0;
        int stackIn_67_0 = 0;
        faa stackIn_71_0 = null;
        int stackIn_71_1 = 0;
        faa stackIn_73_0 = null;
        int stackIn_73_1 = 0;
        faa stackIn_74_0 = null;
        int stackIn_74_1 = 0;
        int stackIn_74_2 = 0;
        int stackIn_83_0 = 0;
        faa stackIn_89_0 = null;
        int stackIn_89_1 = 0;
        faa stackIn_91_0 = null;
        int stackIn_91_1 = 0;
        faa stackIn_92_0 = null;
        int stackIn_92_1 = 0;
        int stackIn_92_2 = 0;
        int stackIn_98_0 = 0;
        int stackIn_100_0 = 0;
        int stackIn_101_0 = 0;
        int stackIn_101_1 = 0;
        faa stackIn_102_0 = null;
        int stackIn_102_1 = 0;
        faa stackIn_104_0 = null;
        int stackIn_104_1 = 0;
        faa stackIn_105_0 = null;
        int stackIn_105_1 = 0;
        int stackIn_105_2 = 0;
        int stackIn_111_0 = 0;
        faa stackIn_117_0 = null;
        int stackIn_117_1 = 0;
        faa stackIn_119_0 = null;
        int stackIn_119_1 = 0;
        faa stackIn_120_0 = null;
        int stackIn_120_1 = 0;
        int stackIn_120_2 = 0;
        int stackIn_129_0 = 0;
        faa stackIn_135_0 = null;
        int stackIn_135_1 = 0;
        faa stackIn_137_0 = null;
        int stackIn_137_1 = 0;
        faa stackIn_138_0 = null;
        int stackIn_138_1 = 0;
        int stackIn_138_2 = 0;
        int stackIn_147_0 = 0;
        faa stackIn_153_0 = null;
        int stackIn_153_1 = 0;
        faa stackIn_155_0 = null;
        int stackIn_155_1 = 0;
        faa stackIn_156_0 = null;
        int stackIn_156_1 = 0;
        int stackIn_156_2 = 0;
        faa stackIn_162_0 = null;
        int stackIn_162_1 = 0;
        faa stackIn_164_0 = null;
        int stackIn_164_1 = 0;
        faa stackIn_165_0 = null;
        int stackIn_165_1 = 0;
        int stackIn_165_2 = 0;
        RuntimeException stackIn_170_0 = null;
        StringBuilder stackIn_170_1 = null;
        RuntimeException stackIn_172_0 = null;
        StringBuilder stackIn_172_1 = null;
        RuntimeException stackIn_173_0 = null;
        StringBuilder stackIn_173_1 = null;
        String stackIn_173_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_2_0 = 0;
        faa stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        faa stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        faa stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        int stackOut_24_0 = 0;
        int stackOut_22_0 = 0;
        faa stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        faa stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        int stackOut_31_2 = 0;
        faa stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        int stackOut_29_2 = 0;
        int stackOut_40_0 = 0;
        int stackOut_38_0 = 0;
        faa stackOut_46_0 = null;
        int stackOut_46_1 = 0;
        faa stackOut_49_0 = null;
        int stackOut_49_1 = 0;
        int stackOut_49_2 = 0;
        faa stackOut_47_0 = null;
        int stackOut_47_1 = 0;
        int stackOut_47_2 = 0;
        faa stackOut_55_0 = null;
        int stackOut_55_1 = 0;
        faa stackOut_58_0 = null;
        int stackOut_58_1 = 0;
        int stackOut_58_2 = 0;
        faa stackOut_56_0 = null;
        int stackOut_56_1 = 0;
        int stackOut_56_2 = 0;
        int stackOut_66_0 = 0;
        int stackOut_64_0 = 0;
        faa stackOut_70_0 = null;
        int stackOut_70_1 = 0;
        faa stackOut_73_0 = null;
        int stackOut_73_1 = 0;
        int stackOut_73_2 = 0;
        faa stackOut_71_0 = null;
        int stackOut_71_1 = 0;
        int stackOut_71_2 = 0;
        int stackOut_82_0 = 0;
        int stackOut_80_0 = 0;
        faa stackOut_88_0 = null;
        int stackOut_88_1 = 0;
        faa stackOut_91_0 = null;
        int stackOut_91_1 = 0;
        int stackOut_91_2 = 0;
        faa stackOut_89_0 = null;
        int stackOut_89_1 = 0;
        int stackOut_89_2 = 0;
        int stackOut_97_0 = 0;
        int stackOut_100_0 = 0;
        int stackOut_100_1 = 0;
        int stackOut_98_0 = 0;
        int stackOut_98_1 = 0;
        faa stackOut_101_0 = null;
        int stackOut_101_1 = 0;
        faa stackOut_104_0 = null;
        int stackOut_104_1 = 0;
        int stackOut_104_2 = 0;
        faa stackOut_102_0 = null;
        int stackOut_102_1 = 0;
        int stackOut_102_2 = 0;
        int stackOut_110_0 = 0;
        int stackOut_108_0 = 0;
        faa stackOut_116_0 = null;
        int stackOut_116_1 = 0;
        faa stackOut_119_0 = null;
        int stackOut_119_1 = 0;
        int stackOut_119_2 = 0;
        faa stackOut_117_0 = null;
        int stackOut_117_1 = 0;
        int stackOut_117_2 = 0;
        int stackOut_128_0 = 0;
        int stackOut_126_0 = 0;
        faa stackOut_134_0 = null;
        int stackOut_134_1 = 0;
        faa stackOut_137_0 = null;
        int stackOut_137_1 = 0;
        int stackOut_137_2 = 0;
        faa stackOut_135_0 = null;
        int stackOut_135_1 = 0;
        int stackOut_135_2 = 0;
        int stackOut_146_0 = 0;
        int stackOut_144_0 = 0;
        faa stackOut_152_0 = null;
        int stackOut_152_1 = 0;
        faa stackOut_155_0 = null;
        int stackOut_155_1 = 0;
        int stackOut_155_2 = 0;
        faa stackOut_153_0 = null;
        int stackOut_153_1 = 0;
        int stackOut_153_2 = 0;
        faa stackOut_161_0 = null;
        int stackOut_161_1 = 0;
        faa stackOut_164_0 = null;
        int stackOut_164_1 = 0;
        int stackOut_164_2 = 0;
        faa stackOut_162_0 = null;
        int stackOut_162_1 = 0;
        int stackOut_162_2 = 0;
        RuntimeException stackOut_169_0 = null;
        StringBuilder stackOut_169_1 = null;
        RuntimeException stackOut_172_0 = null;
        StringBuilder stackOut_172_1 = null;
        String stackOut_172_2 = null;
        RuntimeException stackOut_170_0 = null;
        StringBuilder stackOut_170_1 = null;
        String stackOut_170_2 = null;
        var9 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var3_ref = param0;
              var4 = ((pe) this).field_k;
              if (var4 != null) {
                stackOut_4_0 = var4.length;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_2_0 = 0;
                stackIn_5_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var5 = stackIn_5_0;
              var3_ref.a(-632, var5, 8);
              if (var5 != 0) {
                var6 = var4;
                var7 = 0;
                L3: while (true) {
                  if (var6.length <= var7) {
                    break L2;
                  } else {
                    L4: {
                      var8 = var6[var7];
                      stackOut_10_0 = (faa) var3_ref;
                      stackOut_10_1 = -33;
                      stackIn_13_0 = stackOut_10_0;
                      stackIn_13_1 = stackOut_10_1;
                      stackIn_11_0 = stackOut_10_0;
                      stackIn_11_1 = stackOut_10_1;
                      if (null == var8) {
                        stackOut_13_0 = (faa) (Object) stackIn_13_0;
                        stackOut_13_1 = stackIn_13_1;
                        stackOut_13_2 = 0;
                        stackIn_14_0 = stackOut_13_0;
                        stackIn_14_1 = stackOut_13_1;
                        stackIn_14_2 = stackOut_13_2;
                        break L4;
                      } else {
                        stackOut_11_0 = (faa) (Object) stackIn_11_0;
                        stackOut_11_1 = stackIn_11_1;
                        stackOut_11_2 = 1;
                        stackIn_14_0 = stackOut_11_0;
                        stackIn_14_1 = stackOut_11_1;
                        stackIn_14_2 = stackOut_11_2;
                        break L4;
                      }
                    }
                    L5: {
                      if (vq.a(stackIn_14_0, stackIn_14_1, stackIn_14_2 != 0)) {
                        stb.a(2, 1, var3_ref, (tv) (Object) var8);
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
                int discarded$5 = ((pe) this).g((byte) 124);
                break L6;
              }
            }
            L7: {
              var3_ref = param0;
              int discarded$6 = 210377952;
              var4_array = hob.a(((pe) this).field_x);
              if (null != var4_array) {
                stackOut_24_0 = var4_array.length;
                stackIn_25_0 = stackOut_24_0;
                break L7;
              } else {
                stackOut_22_0 = 0;
                stackIn_25_0 = stackOut_22_0;
                break L7;
              }
            }
            L8: {
              var5 = stackIn_25_0;
              var3_ref.a(-632, var5, 10);
              if (var5 == 0) {
                break L8;
              } else {
                var6_array = var4_array;
                var7 = 0;
                L9: while (true) {
                  if (var6_array.length <= var7) {
                    break L8;
                  } else {
                    L10: {
                      var8_ref = var6_array[var7];
                      stackOut_28_0 = (faa) var3_ref;
                      stackOut_28_1 = 39;
                      stackIn_31_0 = stackOut_28_0;
                      stackIn_31_1 = stackOut_28_1;
                      stackIn_29_0 = stackOut_28_0;
                      stackIn_29_1 = stackOut_28_1;
                      if (null == var8_ref) {
                        stackOut_31_0 = (faa) (Object) stackIn_31_0;
                        stackOut_31_1 = stackIn_31_1;
                        stackOut_31_2 = 0;
                        stackIn_32_0 = stackOut_31_0;
                        stackIn_32_1 = stackOut_31_1;
                        stackIn_32_2 = stackOut_31_2;
                        break L10;
                      } else {
                        stackOut_29_0 = (faa) (Object) stackIn_29_0;
                        stackOut_29_1 = stackIn_29_1;
                        stackOut_29_2 = 1;
                        stackIn_32_0 = stackOut_29_0;
                        stackIn_32_1 = stackOut_29_1;
                        stackIn_32_2 = stackOut_29_2;
                        break L10;
                      }
                    }
                    L11: {
                      if (vq.a(stackIn_32_0, stackIn_32_1, stackIn_32_2 != 0)) {
                        stb.a(2, 1, var3_ref, var8_ref);
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
              var3_ref = param0;
              var4_array2 = ((pe) this).field_m;
              if (var4_array2 == null) {
                stackOut_40_0 = 0;
                stackIn_41_0 = stackOut_40_0;
                break L12;
              } else {
                stackOut_38_0 = var4_array2.length;
                stackIn_41_0 = stackOut_38_0;
                break L12;
              }
            }
            L13: {
              var5 = stackIn_41_0;
              var3_ref.a(-632, var5, 10);
              if (var5 != 0) {
                var6_array2 = var4_array2;
                var7 = 0;
                L14: while (true) {
                  if (var6_array2.length <= var7) {
                    break L13;
                  } else {
                    L15: {
                      var8_ref2 = var6_array2[var7];
                      stackOut_46_0 = (faa) var3_ref;
                      stackOut_46_1 = 41;
                      stackIn_49_0 = stackOut_46_0;
                      stackIn_49_1 = stackOut_46_1;
                      stackIn_47_0 = stackOut_46_0;
                      stackIn_47_1 = stackOut_46_1;
                      if (null == var8_ref2) {
                        stackOut_49_0 = (faa) (Object) stackIn_49_0;
                        stackOut_49_1 = stackIn_49_1;
                        stackOut_49_2 = 0;
                        stackIn_50_0 = stackOut_49_0;
                        stackIn_50_1 = stackOut_49_1;
                        stackIn_50_2 = stackOut_49_2;
                        break L15;
                      } else {
                        stackOut_47_0 = (faa) (Object) stackIn_47_0;
                        stackOut_47_1 = stackIn_47_1;
                        stackOut_47_2 = 1;
                        stackIn_50_0 = stackOut_47_0;
                        stackIn_50_1 = stackOut_47_1;
                        stackIn_50_2 = stackOut_47_2;
                        break L15;
                      }
                    }
                    L16: {
                      if (vq.a(stackIn_50_0, stackIn_50_1, stackIn_50_2 == 0)) {
                        break L16;
                      } else {
                        break L16;
                      }
                    }
                    var7++;
                    continue L14;
                  }
                }
              } else {
                break L13;
              }
            }
            L17: {
              stackOut_55_0 = (faa) param0;
              stackOut_55_1 = 77;
              stackIn_58_0 = stackOut_55_0;
              stackIn_58_1 = stackOut_55_1;
              stackIn_56_0 = stackOut_55_0;
              stackIn_56_1 = stackOut_55_1;
              if (null == ((pe) this).field_e) {
                stackOut_58_0 = (faa) (Object) stackIn_58_0;
                stackOut_58_1 = stackIn_58_1;
                stackOut_58_2 = 0;
                stackIn_59_0 = stackOut_58_0;
                stackIn_59_1 = stackOut_58_1;
                stackIn_59_2 = stackOut_58_2;
                break L17;
              } else {
                stackOut_56_0 = (faa) (Object) stackIn_56_0;
                stackOut_56_1 = stackIn_56_1;
                stackOut_56_2 = 1;
                stackIn_59_0 = stackOut_56_0;
                stackIn_59_1 = stackOut_56_1;
                stackIn_59_2 = stackOut_56_2;
                break L17;
              }
            }
            L18: {
              if (vq.a(stackIn_59_0, stackIn_59_1, stackIn_59_2 != 0)) {
                ((pe) this).field_e.b(param0, -126);
                break L18;
              } else {
                break L18;
              }
            }
            L19: {
              var3_ref = param0;
              int discarded$7 = 210377952;
              var4_array = hob.a(((pe) this).field_n);
              if (null == var4_array) {
                stackOut_66_0 = 0;
                stackIn_67_0 = stackOut_66_0;
                break L19;
              } else {
                stackOut_64_0 = var4_array.length;
                stackIn_67_0 = stackOut_64_0;
                break L19;
              }
            }
            L20: {
              var5 = stackIn_67_0;
              var3_ref.a(-632, var5, 6);
              if (var5 == 0) {
                break L20;
              } else {
                var6_array = var4_array;
                var7 = 0;
                L21: while (true) {
                  if (var7 >= var6_array.length) {
                    break L20;
                  } else {
                    L22: {
                      var8_ref = var6_array[var7];
                      stackOut_70_0 = (faa) var3_ref;
                      stackOut_70_1 = 118;
                      stackIn_73_0 = stackOut_70_0;
                      stackIn_73_1 = stackOut_70_1;
                      stackIn_71_0 = stackOut_70_0;
                      stackIn_71_1 = stackOut_70_1;
                      if (var8_ref == null) {
                        stackOut_73_0 = (faa) (Object) stackIn_73_0;
                        stackOut_73_1 = stackIn_73_1;
                        stackOut_73_2 = 0;
                        stackIn_74_0 = stackOut_73_0;
                        stackIn_74_1 = stackOut_73_1;
                        stackIn_74_2 = stackOut_73_2;
                        break L22;
                      } else {
                        stackOut_71_0 = (faa) (Object) stackIn_71_0;
                        stackOut_71_1 = stackIn_71_1;
                        stackOut_71_2 = 1;
                        stackIn_74_0 = stackOut_71_0;
                        stackIn_74_1 = stackOut_71_1;
                        stackIn_74_2 = stackOut_71_2;
                        break L22;
                      }
                    }
                    L23: {
                      if (vq.a(stackIn_74_0, stackIn_74_1, stackIn_74_2 != 0)) {
                        stb.a(2, 1, var3_ref, var8_ref);
                        break L23;
                      } else {
                        break L23;
                      }
                    }
                    var7++;
                    continue L21;
                  }
                }
              }
            }
            L24: {
              var3_ref = param0;
              var4_array3 = ((pe) this).field_g;
              if (null == var4_array3) {
                stackOut_82_0 = 0;
                stackIn_83_0 = stackOut_82_0;
                break L24;
              } else {
                stackOut_80_0 = var4_array3.length;
                stackIn_83_0 = stackOut_80_0;
                break L24;
              }
            }
            L25: {
              var5 = stackIn_83_0;
              var3_ref.a(-632, var5, 8);
              if (0 != var5) {
                var6_array3 = var4_array3;
                var7 = 0;
                L26: while (true) {
                  if (var7 >= var6_array3.length) {
                    break L25;
                  } else {
                    L27: {
                      var8_ref3 = var6_array3[var7];
                      stackOut_88_0 = (faa) var3_ref;
                      stackOut_88_1 = 88;
                      stackIn_91_0 = stackOut_88_0;
                      stackIn_91_1 = stackOut_88_1;
                      stackIn_89_0 = stackOut_88_0;
                      stackIn_89_1 = stackOut_88_1;
                      if (var8_ref3 == null) {
                        stackOut_91_0 = (faa) (Object) stackIn_91_0;
                        stackOut_91_1 = stackIn_91_1;
                        stackOut_91_2 = 0;
                        stackIn_92_0 = stackOut_91_0;
                        stackIn_92_1 = stackOut_91_1;
                        stackIn_92_2 = stackOut_91_2;
                        break L27;
                      } else {
                        stackOut_89_0 = (faa) (Object) stackIn_89_0;
                        stackOut_89_1 = stackIn_89_1;
                        stackOut_89_2 = 1;
                        stackIn_92_0 = stackOut_89_0;
                        stackIn_92_1 = stackOut_89_1;
                        stackIn_92_2 = stackOut_89_2;
                        break L27;
                      }
                    }
                    L28: {
                      if (vq.a(stackIn_92_0, stackIn_92_1, stackIn_92_2 == 0)) {
                        break L28;
                      } else {
                        break L28;
                      }
                    }
                    var7++;
                    continue L26;
                  }
                }
              } else {
                break L25;
              }
            }
            L29: {
              stackOut_97_0 = 4;
              stackIn_100_0 = stackOut_97_0;
              stackIn_98_0 = stackOut_97_0;
              if (((pe) this).field_l != null) {
                stackOut_100_0 = stackIn_100_0;
                stackOut_100_1 = ((pe) this).field_l.length;
                stackIn_101_0 = stackOut_100_0;
                stackIn_101_1 = stackOut_100_1;
                break L29;
              } else {
                stackOut_98_0 = stackIn_98_0;
                stackOut_98_1 = 0;
                stackIn_101_0 = stackOut_98_0;
                stackIn_101_1 = stackOut_98_1;
                break L29;
              }
            }
            L30: {
              pgb.a(stackIn_101_0, stackIn_101_1, 68, param0, ((pe) this).field_l);
              boolean discarded$8 = vq.a(param0, -88, ((pe) this).field_v);
              param0.a(-632, ((pe) this).field_y, 32);
              boolean discarded$9 = vq.a(param0, 88, ((pe) this).field_i);
              stackOut_101_0 = (faa) param0;
              stackOut_101_1 = -71;
              stackIn_104_0 = stackOut_101_0;
              stackIn_104_1 = stackOut_101_1;
              stackIn_102_0 = stackOut_101_0;
              stackIn_102_1 = stackOut_101_1;
              if (((pe) this).field_f == null) {
                stackOut_104_0 = (faa) (Object) stackIn_104_0;
                stackOut_104_1 = stackIn_104_1;
                stackOut_104_2 = 0;
                stackIn_105_0 = stackOut_104_0;
                stackIn_105_1 = stackOut_104_1;
                stackIn_105_2 = stackOut_104_2;
                break L30;
              } else {
                stackOut_102_0 = (faa) (Object) stackIn_102_0;
                stackOut_102_1 = stackIn_102_1;
                stackOut_102_2 = 1;
                stackIn_105_0 = stackOut_102_0;
                stackIn_105_1 = stackOut_102_1;
                stackIn_105_2 = stackOut_102_2;
                break L30;
              }
            }
            L31: {
              if (vq.a(stackIn_105_0, stackIn_105_1, stackIn_105_2 == 0)) {
                break L31;
              } else {
                ((pe) this).field_f.b(param0, -117);
                break L31;
              }
            }
            L32: {
              var3_ref = param0;
              var4_array4 = ((pe) this).field_t;
              if (null == var4_array4) {
                stackOut_110_0 = 0;
                stackIn_111_0 = stackOut_110_0;
                break L32;
              } else {
                stackOut_108_0 = var4_array4.length;
                stackIn_111_0 = stackOut_108_0;
                break L32;
              }
            }
            L33: {
              var5 = stackIn_111_0;
              var3_ref.a(-632, var5, 8);
              if (var5 != 0) {
                var6_array4 = var4_array4;
                var7 = 0;
                L34: while (true) {
                  if (var6_array4.length <= var7) {
                    break L33;
                  } else {
                    L35: {
                      var8_ref4 = var6_array4[var7];
                      stackOut_116_0 = (faa) var3_ref;
                      stackOut_116_1 = 36;
                      stackIn_119_0 = stackOut_116_0;
                      stackIn_119_1 = stackOut_116_1;
                      stackIn_117_0 = stackOut_116_0;
                      stackIn_117_1 = stackOut_116_1;
                      if (null == var8_ref4) {
                        stackOut_119_0 = (faa) (Object) stackIn_119_0;
                        stackOut_119_1 = stackIn_119_1;
                        stackOut_119_2 = 0;
                        stackIn_120_0 = stackOut_119_0;
                        stackIn_120_1 = stackOut_119_1;
                        stackIn_120_2 = stackOut_119_2;
                        break L35;
                      } else {
                        stackOut_117_0 = (faa) (Object) stackIn_117_0;
                        stackOut_117_1 = stackIn_117_1;
                        stackOut_117_2 = 1;
                        stackIn_120_0 = stackOut_117_0;
                        stackIn_120_1 = stackOut_117_1;
                        stackIn_120_2 = stackOut_117_2;
                        break L35;
                      }
                    }
                    L36: {
                      if (vq.a(stackIn_120_0, stackIn_120_1, stackIn_120_2 != 0)) {
                        stb.a(2, 1, var3_ref, (tv) (Object) var8_ref4);
                        break L36;
                      } else {
                        break L36;
                      }
                    }
                    var7++;
                    continue L34;
                  }
                }
              } else {
                break L33;
              }
            }
            L37: {
              var3_ref = param0;
              var4_array5 = ((pe) this).field_a;
              if (null != var4_array5) {
                stackOut_128_0 = var4_array5.length;
                stackIn_129_0 = stackOut_128_0;
                break L37;
              } else {
                stackOut_126_0 = 0;
                stackIn_129_0 = stackOut_126_0;
                break L37;
              }
            }
            L38: {
              var5 = stackIn_129_0;
              var3_ref.a(-632, var5, 4);
              if (var5 != 0) {
                var6_array5 = var4_array5;
                var7 = 0;
                L39: while (true) {
                  if (var6_array5.length <= var7) {
                    break L38;
                  } else {
                    L40: {
                      var8_ref5 = var6_array5[var7];
                      stackOut_134_0 = (faa) var3_ref;
                      stackOut_134_1 = -87;
                      stackIn_137_0 = stackOut_134_0;
                      stackIn_137_1 = stackOut_134_1;
                      stackIn_135_0 = stackOut_134_0;
                      stackIn_135_1 = stackOut_134_1;
                      if (var8_ref5 == null) {
                        stackOut_137_0 = (faa) (Object) stackIn_137_0;
                        stackOut_137_1 = stackIn_137_1;
                        stackOut_137_2 = 0;
                        stackIn_138_0 = stackOut_137_0;
                        stackIn_138_1 = stackOut_137_1;
                        stackIn_138_2 = stackOut_137_2;
                        break L40;
                      } else {
                        stackOut_135_0 = (faa) (Object) stackIn_135_0;
                        stackOut_135_1 = stackIn_135_1;
                        stackOut_135_2 = 1;
                        stackIn_138_0 = stackOut_135_0;
                        stackIn_138_1 = stackOut_135_1;
                        stackIn_138_2 = stackOut_135_2;
                        break L40;
                      }
                    }
                    L41: {
                      if (vq.a(stackIn_138_0, stackIn_138_1, stackIn_138_2 != 0)) {
                        stb.a(2, 1, var3_ref, (tv) (Object) var8_ref5);
                        break L41;
                      } else {
                        break L41;
                      }
                    }
                    var7++;
                    continue L39;
                  }
                }
              } else {
                break L38;
              }
            }
            L42: {
              param0.a(-632, ((pe) this).field_o, 28);
              param0.a(-632, ((pe) this).field_r, 28);
              var3_ref = param0;
              var4_array6 = ((pe) this).field_j;
              if (var4_array6 != null) {
                stackOut_146_0 = var4_array6.length;
                stackIn_147_0 = stackOut_146_0;
                break L42;
              } else {
                stackOut_144_0 = 0;
                stackIn_147_0 = stackOut_144_0;
                break L42;
              }
            }
            L43: {
              var5 = stackIn_147_0;
              var3_ref.a(-632, var5, 4);
              if (0 != var5) {
                var6_array6 = var4_array6;
                var7 = 0;
                L44: while (true) {
                  if (var6_array6.length <= var7) {
                    break L43;
                  } else {
                    L45: {
                      var8_ref6 = var6_array6[var7];
                      stackOut_152_0 = (faa) var3_ref;
                      stackOut_152_1 = 56;
                      stackIn_155_0 = stackOut_152_0;
                      stackIn_155_1 = stackOut_152_1;
                      stackIn_153_0 = stackOut_152_0;
                      stackIn_153_1 = stackOut_152_1;
                      if (var8_ref6 == null) {
                        stackOut_155_0 = (faa) (Object) stackIn_155_0;
                        stackOut_155_1 = stackIn_155_1;
                        stackOut_155_2 = 0;
                        stackIn_156_0 = stackOut_155_0;
                        stackIn_156_1 = stackOut_155_1;
                        stackIn_156_2 = stackOut_155_2;
                        break L45;
                      } else {
                        stackOut_153_0 = (faa) (Object) stackIn_153_0;
                        stackOut_153_1 = stackIn_153_1;
                        stackOut_153_2 = 1;
                        stackIn_156_0 = stackOut_153_0;
                        stackIn_156_1 = stackOut_153_1;
                        stackIn_156_2 = stackOut_153_2;
                        break L45;
                      }
                    }
                    L46: {
                      if (vq.a(stackIn_156_0, stackIn_156_1, stackIn_156_2 != 0)) {
                        stb.a(2, 1, var3_ref, (tv) (Object) var8_ref6);
                        break L46;
                      } else {
                        break L46;
                      }
                    }
                    var7++;
                    continue L44;
                  }
                }
              } else {
                break L43;
              }
            }
            L47: {
              stackOut_161_0 = (faa) param0;
              stackOut_161_1 = 46;
              stackIn_164_0 = stackOut_161_0;
              stackIn_164_1 = stackOut_161_1;
              stackIn_162_0 = stackOut_161_0;
              stackIn_162_1 = stackOut_161_1;
              if (null == ((pe) this).field_b) {
                stackOut_164_0 = (faa) (Object) stackIn_164_0;
                stackOut_164_1 = stackIn_164_1;
                stackOut_164_2 = 0;
                stackIn_165_0 = stackOut_164_0;
                stackIn_165_1 = stackOut_164_1;
                stackIn_165_2 = stackOut_164_2;
                break L47;
              } else {
                stackOut_162_0 = (faa) (Object) stackIn_162_0;
                stackOut_162_1 = stackIn_162_1;
                stackOut_162_2 = 1;
                stackIn_165_0 = stackOut_162_0;
                stackIn_165_1 = stackOut_162_1;
                stackIn_165_2 = stackOut_162_2;
                break L47;
              }
            }
            L48: {
              if (vq.a(stackIn_165_0, stackIn_165_1, stackIn_165_2 == 0)) {
                break L48;
              } else {
                ((pe) this).field_b.b(param0, -113);
                break L48;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L49: {
            var3 = decompiledCaughtException;
            stackOut_169_0 = (RuntimeException) var3;
            stackOut_169_1 = new StringBuilder().append("pe.B(");
            stackIn_172_0 = stackOut_169_0;
            stackIn_172_1 = stackOut_169_1;
            stackIn_170_0 = stackOut_169_0;
            stackIn_170_1 = stackOut_169_1;
            if (param0 == null) {
              stackOut_172_0 = (RuntimeException) (Object) stackIn_172_0;
              stackOut_172_1 = (StringBuilder) (Object) stackIn_172_1;
              stackOut_172_2 = "null";
              stackIn_173_0 = stackOut_172_0;
              stackIn_173_1 = stackOut_172_1;
              stackIn_173_2 = stackOut_172_2;
              break L49;
            } else {
              stackOut_170_0 = (RuntimeException) (Object) stackIn_170_0;
              stackOut_170_1 = (StringBuilder) (Object) stackIn_170_1;
              stackOut_170_2 = "{...}";
              stackIn_173_0 = stackOut_170_0;
              stackIn_173_1 = stackOut_170_1;
              stackIn_173_2 = stackOut_170_2;
              break L49;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_173_0, stackIn_173_2 + 44 + param1 + 41);
        }
    }

    private final void f(byte param0, int param1) {
        int var3_int = 0;
        var3_int = 0;
        this.a(0, true, param1);
    }

    final void g(int param0) {
        int var2_int = 0;
        int var3 = 0;
        var3 = VoidHunters.field_G;
        var2_int = 0;
        L0: while (true) {
          if (var2_int >= ((pe) this).field_k.length) {
            this.l(-125);
            var2_int = 0;
            L1: while (true) {
              if (((pe) this).field_m.length <= var2_int) {
                ((pe) this).field_e.a(121);
                ((pe) this).field_x.e(127);
                var2_int = 0;
                L2: while (true) {
                  if (((pe) this).field_s.length <= var2_int) {
                    ((pe) this).field_n.e(125);
                    if (param0 == 11184895) {
                      var2_int = 0;
                      L3: while (true) {
                        if (((pe) this).field_g.length <= var2_int) {
                          var2_int = 0;
                          L4: while (true) {
                            if (((pe) this).field_l.length <= var2_int) {
                              ((pe) this).field_f = null;
                              ((pe) this).field_t = null;
                              ((pe) this).field_a = null;
                              ((pe) this).field_p = new lua();
                              ((pe) this).field_v = false;
                              ((pe) this).field_u = new fba();
                              ((pe) this).field_j = null;
                              return;
                            } else {
                              ((pe) this).field_l[var2_int] = 0;
                              var2_int++;
                              continue L4;
                            }
                          }
                        } else {
                          ((pe) this).field_g[var2_int] = null;
                          var2_int++;
                          continue L3;
                        }
                      }
                    } else {
                      return;
                    }
                  } else {
                    ((pe) this).field_s[var2_int].a((byte) 121);
                    var2_int++;
                    continue L2;
                  }
                }
              } else {
                ((pe) this).field_m[var2_int] = null;
                var2_int++;
                continue L1;
              }
            }
          } else {
            ((pe) this).field_k[var2_int] = null;
            var2_int++;
            continue L0;
          }
        }
    }

    private final boolean a(ij param0, anb[] param1, anb[] param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        anb[] var9 = null;
        int var10 = 0;
        anb var11 = null;
        int var16 = 0;
        int stackIn_3_0 = 0;
        int stackIn_46_0 = 0;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_51_2 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_59_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_45_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        String stackOut_58_2 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        String stackOut_56_2 = null;
        var16 = VoidHunters.field_G;
        try {
          L0: {
            if (param3 == 20521) {
              var8_int = 0;
              var9 = param2;
              var10 = 0;
              L1: while (true) {
                if (var9.length <= var10) {
                  stackOut_45_0 = var8_int;
                  stackIn_46_0 = stackOut_45_0;
                  break L0;
                } else {
                  L2: {
                    var11 = var9[var10];
                    if (null == var11) {
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  var10++;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackOut_47_0 = (RuntimeException) var8;
            stackOut_47_1 = new StringBuilder().append("pe.WA(");
            stackIn_50_0 = stackOut_47_0;
            stackIn_50_1 = stackOut_47_1;
            stackIn_48_0 = stackOut_47_0;
            stackIn_48_1 = stackOut_47_1;
            if (param0 == null) {
              stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
              stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
              stackOut_50_2 = "null";
              stackIn_51_0 = stackOut_50_0;
              stackIn_51_1 = stackOut_50_1;
              stackIn_51_2 = stackOut_50_2;
              break L3;
            } else {
              stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
              stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
              stackOut_48_2 = "{...}";
              stackIn_51_0 = stackOut_48_0;
              stackIn_51_1 = stackOut_48_1;
              stackIn_51_2 = stackOut_48_2;
              break L3;
            }
          }
          L4: {
            stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
            stackOut_51_1 = ((StringBuilder) (Object) stackIn_51_1).append(stackIn_51_2).append(44);
            stackIn_54_0 = stackOut_51_0;
            stackIn_54_1 = stackOut_51_1;
            stackIn_52_0 = stackOut_51_0;
            stackIn_52_1 = stackOut_51_1;
            if (param1 == null) {
              stackOut_54_0 = (RuntimeException) (Object) stackIn_54_0;
              stackOut_54_1 = (StringBuilder) (Object) stackIn_54_1;
              stackOut_54_2 = "null";
              stackIn_55_0 = stackOut_54_0;
              stackIn_55_1 = stackOut_54_1;
              stackIn_55_2 = stackOut_54_2;
              break L4;
            } else {
              stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
              stackOut_52_1 = (StringBuilder) (Object) stackIn_52_1;
              stackOut_52_2 = "{...}";
              stackIn_55_0 = stackOut_52_0;
              stackIn_55_1 = stackOut_52_1;
              stackIn_55_2 = stackOut_52_2;
              break L4;
            }
          }
          L5: {
            stackOut_55_0 = (RuntimeException) (Object) stackIn_55_0;
            stackOut_55_1 = ((StringBuilder) (Object) stackIn_55_1).append(stackIn_55_2).append(44);
            stackIn_58_0 = stackOut_55_0;
            stackIn_58_1 = stackOut_55_1;
            stackIn_56_0 = stackOut_55_0;
            stackIn_56_1 = stackOut_55_1;
            if (param2 == null) {
              stackOut_58_0 = (RuntimeException) (Object) stackIn_58_0;
              stackOut_58_1 = (StringBuilder) (Object) stackIn_58_1;
              stackOut_58_2 = "null";
              stackIn_59_0 = stackOut_58_0;
              stackIn_59_1 = stackOut_58_1;
              stackIn_59_2 = stackOut_58_2;
              break L5;
            } else {
              stackOut_56_0 = (RuntimeException) (Object) stackIn_56_0;
              stackOut_56_1 = (StringBuilder) (Object) stackIn_56_1;
              stackOut_56_2 = "{...}";
              stackIn_59_0 = stackOut_56_0;
              stackIn_59_1 = stackOut_56_1;
              stackIn_59_2 = stackOut_56_2;
              break L5;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_59_0, stackIn_59_2 + 44 + param3 + 44 + 3 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_46_0 != 0;
    }

    final int e(int param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = VoidHunters.field_G;
          var3 = 0;
          if (param1 == -99) {
            break L0;
          } else {
            ((pe) this).field_l = null;
            break L0;
          }
        }
        var4 = 0;
        L1: while (true) {
          if (var4 >= ((pe) this).field_k.length) {
            return var3;
          } else {
            if (null != ((pe) this).field_k[var4]) {
              if (((pe) this).field_k[var4].k((byte) -108) != null) {
                L2: {
                  if (((pe) this).field_k[var4].k((byte) -108).a((byte) 92) == param0) {
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var3++;
                var4++;
                continue L1;
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
        L0: {
          if (param0 == 1000) {
            break L0;
          } else {
            ((pe) this).b((byte) -38);
            break L0;
          }
        }
        return ((pe) this).field_k;
    }

    final void a(int param0, byte param1) {
        int var3_int = 0;
        ((pe) this).field_o = param0;
        var3_int = 37 / ((param1 - -18) / 46);
    }

    final rba[] i(int param0) {
        L0: {
          if (param0 == 1) {
            break L0;
          } else {
            ((pe) this).field_a = null;
            break L0;
          }
        }
        return ((pe) this).field_a;
    }

    final nbb b(int param0, int param1, int param2, int param3, int param4, int param5) {
        Object var7 = null;
        int var8 = 0;
        nbb[] var9 = null;
        int var10 = 0;
        nbb var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        var19 = VoidHunters.field_G;
        var7 = null;
        var8 = param1;
        var9 = ((pe) this).field_m;
        var10 = 0;
        L0: while (true) {
          if (var9.length <= var10) {
            L1: {
              if (param0 == 1) {
                break L1;
              } else {
                ((pe) this).field_l = null;
                break L1;
              }
            }
            return (nbb) var7;
          } else {
            var11 = var9[var10];
            if (var11 != null) {
              var12 = var11.f((byte) -41)[0] + var11.f((byte) -120)[1] >> 1;
              var13 = var11.f((byte) -37)[2] - -var11.f((byte) -64)[3] >> 1;
              var14 = var12 - param3;
              var15 = -param4 + var13;
              var16 = ar.a(var14, (byte) 127, var15);
              if (var16 < var8) {
                var17 = var12 - param2;
                var18 = -param5 + var13;
                if (ar.a(var17, (byte) 113, var18) < gs.field_c) {
                  if (!this.a(false, false, var11.field_l)) {
                    var7 = (Object) (Object) var11;
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
        RuntimeException var5 = null;
        int var5_int = 0;
        sg[] var5_array = null;
        it[] var5_array2 = null;
        mqb[] var5_array3 = null;
        nbb[] var5_array4 = null;
        crb[] var5_array5 = null;
        int var6_int = 0;
        crb[] var6 = null;
        qob[] var6_array = null;
        sg var7_ref_sg = null;
        it var7_ref_it = null;
        mqb var7_ref_mqb = null;
        int var7 = 0;
        nbb var7_ref_nbb = null;
        int var8_int = 0;
        crb var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        rdb var13 = null;
        tj var14 = null;
        RuntimeException stackIn_90_0 = null;
        StringBuilder stackIn_90_1 = null;
        RuntimeException stackIn_92_0 = null;
        StringBuilder stackIn_92_1 = null;
        RuntimeException stackIn_93_0 = null;
        StringBuilder stackIn_93_1 = null;
        String stackIn_93_2 = null;
        RuntimeException stackIn_94_0 = null;
        StringBuilder stackIn_94_1 = null;
        RuntimeException stackIn_96_0 = null;
        StringBuilder stackIn_96_1 = null;
        RuntimeException stackIn_97_0 = null;
        StringBuilder stackIn_97_1 = null;
        String stackIn_97_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_89_0 = null;
        StringBuilder stackOut_89_1 = null;
        RuntimeException stackOut_92_0 = null;
        StringBuilder stackOut_92_1 = null;
        String stackOut_92_2 = null;
        RuntimeException stackOut_90_0 = null;
        StringBuilder stackOut_90_1 = null;
        String stackOut_90_2 = null;
        RuntimeException stackOut_93_0 = null;
        StringBuilder stackOut_93_1 = null;
        RuntimeException stackOut_96_0 = null;
        StringBuilder stackOut_96_1 = null;
        String stackOut_96_2 = null;
        RuntimeException stackOut_94_0 = null;
        StringBuilder stackOut_94_1 = null;
        String stackOut_94_2 = null;
        var10 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (((pe) this).field_v) {
                var13 = (rdb) (Object) ((pe) this).field_n.d(0);
                L2: while (true) {
                  if (null == var13) {
                    if (((pe) this).field_t == null) {
                      break L1;
                    } else {
                      var5_int = 0;
                      L3: while (true) {
                        if (var5_int >= ((pe) this).field_t.length) {
                          break L1;
                        } else {
                          ((pe) this).field_t[var5_int].a(32, 13421772, param0);
                          var5_int++;
                          continue L3;
                        }
                      }
                    }
                  } else {
                    var13.a(param0, false);
                    var13 = (rdb) (Object) ((pe) this).field_n.a((byte) 85);
                    continue L2;
                  }
                }
              } else {
                break L1;
              }
            }
            L4: {
              if (null != ((pe) this).field_a) {
                var11 = 0;
                var5_int = var11;
                L5: while (true) {
                  if (((pe) this).field_a.length <= var11) {
                    break L4;
                  } else {
                    ((pe) this).field_a[var11].b(param0, 115);
                    var11++;
                    continue L5;
                  }
                }
              } else {
                break L4;
              }
            }
            var5_array = ((pe) this).field_k;
            var6_int = 0;
            L6: while (true) {
              if (var6_int >= var5_array.length) {
                L7: {
                  if (null != ((pe) this).field_j) {
                    var5_array2 = ((pe) this).field_j;
                    var6_int = 0;
                    L8: while (true) {
                      if (var5_array2.length <= var6_int) {
                        break L7;
                      } else {
                        var7_ref_it = var5_array2[var6_int];
                        var7_ref_it.a(param0, (byte) -111);
                        var6_int++;
                        continue L8;
                      }
                    }
                  } else {
                    break L7;
                  }
                }
                var5_array3 = ((pe) this).field_g;
                var6_int = 0;
                L9: while (true) {
                  if (var6_int >= var5_array3.length) {
                    L10: {
                      if (param1 > 83) {
                        break L10;
                      } else {
                        ((pe) this).a(33, (cq) null);
                        break L10;
                      }
                    }
                    var5_array4 = ((pe) this).field_m;
                    var6_int = 0;
                    L11: while (true) {
                      if (var6_int >= var5_array4.length) {
                        var5_array5 = ((pe) this).field_e.c(0);
                        var6 = var5_array5;
                        var7 = 0;
                        L12: while (true) {
                          if (var6.length <= var7) {
                            var6_int = 0;
                            L13: while (true) {
                              if (((pe) this).field_s.length <= var6_int) {
                                this.a(-98, param0, param2);
                                var14 = (tj) (Object) ((pe) this).field_x.d(0);
                                L14: while (true) {
                                  if (null == var14) {
                                    L15: {
                                      var6_array = ((pe) this).field_p.a(false);
                                      if (null != var6_array) {
                                        var12 = 0;
                                        var7 = var12;
                                        L16: while (true) {
                                          if (var6_array.length <= var12) {
                                            break L15;
                                          } else {
                                            var6_array[var12].a(param3, 93, param2, param0, var12);
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
                                    var14 = (tj) (Object) ((pe) this).field_x.a((byte) 84);
                                    continue L14;
                                  }
                                }
                              } else {
                                L17: {
                                  if (((pe) this).field_s[var6_int].b((byte) -125)) {
                                    ((pe) this).field_s[var6_int].a((byte) 114, param0);
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
                              var8 = var6[var7];
                              if (null != var8) {
                                var8.a(param0, 14540253, (pe) this, 16);
                                this.a((byte) 80, (anb) (Object) var8, param0);
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
                          var7_ref_nbb = var5_array4[var6_int];
                          if (var7_ref_nbb != null) {
                            L20: {
                              L21: {
                                if (ktb.field_q == 0) {
                                  break L21;
                                } else {
                                  if (!this.a(true, false, var7_ref_nbb.field_l)) {
                                    break L21;
                                  } else {
                                    break L20;
                                  }
                                }
                              }
                              var7_ref_nbb.a(param0, aob.a(29554, var7_ref_nbb.field_k.field_j), (pe) this, 16);
                              break L20;
                            }
                            this.a((byte) -76, (anb) (Object) var7_ref_nbb, param0);
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
                    L22: {
                      var7_ref_mqb = var5_array3[var6_int];
                      if (var7_ref_mqb == null) {
                        break L22;
                      } else {
                        break L22;
                      }
                    }
                    var6_int++;
                    continue L9;
                  }
                }
              } else {
                L23: {
                  var7_ref_sg = var5_array[var6_int];
                  if (var7_ref_sg != null) {
                    var8_int = var7_ref_sg.o((byte) -117);
                    if (var8_int == -1) {
                      if (!var7_ref_sg.b(2, (byte) -103)) {
                        var9 = qpb.a(false, var7_ref_sg.q((byte) 92), 13894143);
                        var7_ref_sg.field_k.a(0, var9, (pe) this, param0);
                        this.a(var7_ref_sg, param0, 97);
                        break L23;
                      } else {
                        break L23;
                      }
                    } else {
                      L24: {
                        if (null == var7_ref_sg.k((byte) -108)) {
                          break L24;
                        } else {
                          break L24;
                        }
                      }
                      var6_int++;
                      continue L6;
                    }
                  } else {
                    break L23;
                  }
                }
                var6_int++;
                continue L6;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L25: {
            var5 = decompiledCaughtException;
            stackOut_89_0 = (RuntimeException) var5;
            stackOut_89_1 = new StringBuilder().append("pe.DC(");
            stackIn_92_0 = stackOut_89_0;
            stackIn_92_1 = stackOut_89_1;
            stackIn_90_0 = stackOut_89_0;
            stackIn_90_1 = stackOut_89_1;
            if (param0 == null) {
              stackOut_92_0 = (RuntimeException) (Object) stackIn_92_0;
              stackOut_92_1 = (StringBuilder) (Object) stackIn_92_1;
              stackOut_92_2 = "null";
              stackIn_93_0 = stackOut_92_0;
              stackIn_93_1 = stackOut_92_1;
              stackIn_93_2 = stackOut_92_2;
              break L25;
            } else {
              stackOut_90_0 = (RuntimeException) (Object) stackIn_90_0;
              stackOut_90_1 = (StringBuilder) (Object) stackIn_90_1;
              stackOut_90_2 = "{...}";
              stackIn_93_0 = stackOut_90_0;
              stackIn_93_1 = stackOut_90_1;
              stackIn_93_2 = stackOut_90_2;
              break L25;
            }
          }
          L26: {
            stackOut_93_0 = (RuntimeException) (Object) stackIn_93_0;
            stackOut_93_1 = ((StringBuilder) (Object) stackIn_93_1).append(stackIn_93_2).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_96_0 = stackOut_93_0;
            stackIn_96_1 = stackOut_93_1;
            stackIn_94_0 = stackOut_93_0;
            stackIn_94_1 = stackOut_93_1;
            if (param3 == null) {
              stackOut_96_0 = (RuntimeException) (Object) stackIn_96_0;
              stackOut_96_1 = (StringBuilder) (Object) stackIn_96_1;
              stackOut_96_2 = "null";
              stackIn_97_0 = stackOut_96_0;
              stackIn_97_1 = stackOut_96_1;
              stackIn_97_2 = stackOut_96_2;
              break L26;
            } else {
              stackOut_94_0 = (RuntimeException) (Object) stackIn_94_0;
              stackOut_94_1 = (StringBuilder) (Object) stackIn_94_1;
              stackOut_94_2 = "{...}";
              stackIn_97_0 = stackOut_94_0;
              stackIn_97_1 = stackOut_94_1;
              stackIn_97_2 = stackOut_94_2;
              break L26;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_97_0, stackIn_97_2 + 41);
        }
    }

    final boolean e(byte param0) {
        L0: {
          if (param0 < -44) {
            break L0;
          } else {
            ((pe) this).field_o = -69;
            break L0;
          }
        }
        return ((pe) this).field_i;
    }

    private final void a(ij param0, int param1, crb[] param2) {
        RuntimeException var4 = null;
        sg[] var4_array = null;
        int var5 = 0;
        crb var6 = null;
        int var12 = 0;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_56_2 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_60_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        String stackOut_55_2 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        String stackOut_59_2 = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        String stackOut_57_2 = null;
        var12 = VoidHunters.field_G;
        try {
          L0: {
            var4_array = ((pe) this).field_k;
            var5 = 0;
            L1: while (true) {
              if (var5 >= param2.length) {
                break L0;
              } else {
                L2: {
                  var6 = param2[var5];
                  if (var6 == null) {
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_52_0 = (RuntimeException) var4;
            stackOut_52_1 = new StringBuilder().append("pe.EA(");
            stackIn_55_0 = stackOut_52_0;
            stackIn_55_1 = stackOut_52_1;
            stackIn_53_0 = stackOut_52_0;
            stackIn_53_1 = stackOut_52_1;
            if (param0 == null) {
              stackOut_55_0 = (RuntimeException) (Object) stackIn_55_0;
              stackOut_55_1 = (StringBuilder) (Object) stackIn_55_1;
              stackOut_55_2 = "null";
              stackIn_56_0 = stackOut_55_0;
              stackIn_56_1 = stackOut_55_1;
              stackIn_56_2 = stackOut_55_2;
              break L3;
            } else {
              stackOut_53_0 = (RuntimeException) (Object) stackIn_53_0;
              stackOut_53_1 = (StringBuilder) (Object) stackIn_53_1;
              stackOut_53_2 = "{...}";
              stackIn_56_0 = stackOut_53_0;
              stackIn_56_1 = stackOut_53_1;
              stackIn_56_2 = stackOut_53_2;
              break L3;
            }
          }
          L4: {
            stackOut_56_0 = (RuntimeException) (Object) stackIn_56_0;
            stackOut_56_1 = ((StringBuilder) (Object) stackIn_56_1).append(stackIn_56_2).append(44).append(-1).append(44);
            stackIn_59_0 = stackOut_56_0;
            stackIn_59_1 = stackOut_56_1;
            stackIn_57_0 = stackOut_56_0;
            stackIn_57_1 = stackOut_56_1;
            if (param2 == null) {
              stackOut_59_0 = (RuntimeException) (Object) stackIn_59_0;
              stackOut_59_1 = (StringBuilder) (Object) stackIn_59_1;
              stackOut_59_2 = "null";
              stackIn_60_0 = stackOut_59_0;
              stackIn_60_1 = stackOut_59_1;
              stackIn_60_2 = stackOut_59_2;
              break L4;
            } else {
              stackOut_57_0 = (RuntimeException) (Object) stackIn_57_0;
              stackOut_57_1 = (StringBuilder) (Object) stackIn_57_1;
              stackOut_57_2 = "{...}";
              stackIn_60_0 = stackOut_57_0;
              stackIn_60_1 = stackOut_57_1;
              stackIn_60_2 = stackOut_57_2;
              break L4;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_60_0, stackIn_60_2 + 41);
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        L0: {
          ((pe) this).a(param5, 0, param6, param0, 30273, param2, param3, param1, 0);
          if (param4 == 11184895) {
            break L0;
          } else {
            field_d = null;
            break L0;
          }
        }
    }

    private final nbb a(nbb param0, byte param1, sg param2, int param3, vra param4, int param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        nbb stackIn_7_0 = null;
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
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        nbb stackOut_6_0 = null;
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
              if (null != param0) {
                break L1;
              } else {
                if ((128 & param4.field_e) == 0) {
                  break L1;
                } else {
                  int discarded$1 = param2.a(123, param4.field_a, param4.field_c);
                  var7_int = param2.d(false) + -param2.j(995401160);
                  var8 = param2.g((byte) 118) + -param2.i((byte) 5);
                  param2.field_k.a(true, var7_int, var8, param2.e(0), 0, param2.f((byte) -106));
                  param0 = param2.field_k.a((pe) this, param5, param3, (anb) (Object) param2, (byte) 85);
                  if (param0 == null) {
                    break L1;
                  } else {
                    param2.a(param0.field_l, (byte) -63);
                    param2.field_k.a((byte) -123, (anb) (Object) param2);
                    break L1;
                  }
                }
              }
            }
            stackOut_6_0 = (nbb) param0;
            stackIn_7_0 = stackOut_6_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var7;
            stackOut_8_1 = new StringBuilder().append("pe.ED(");
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
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
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(44).append(127).append(44);
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
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
          L4: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44).append(param3).append(44);
            stackIn_19_0 = stackOut_16_0;
            stackIn_19_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param4 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_20_0 = stackOut_17_0;
              stackIn_20_1 = stackOut_17_1;
              stackIn_20_2 = stackOut_17_2;
              break L4;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 44 + param5 + 41);
        }
        return stackIn_7_0;
    }

    private final boolean a(tj param0, anb param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            if (param2 < -43) {
              var4_int = Math.abs(param0.field_f);
              var5 = Math.abs(param0.field_h);
              stackOut_3_0 = em.a(5220, param1.field_q[1] - -var4_int, param0.e((byte) -107), param1.field_q[3] - -var5, param0.d(101), -var4_int + param1.field_q[0], param1.field_q[2] - var5);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("pe.QE(");
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(44);
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param2 + 41);
        }
        return stackIn_4_0;
    }

    final void b(byte param0) {
        lua var2 = null;
        int var3 = 0;
        if (((pe) this).field_q) {
          return;
        } else {
          if (((pe) this).field_p != null) {
            var3 = -85 % ((param0 - 6) / 47);
            var2 = ((pe) this).field_p;
            ((pe) this).field_p = new lua();
            var2.b((byte) 81, (tv) (Object) ((pe) this).field_p);
            ((pe) this).field_q = true;
            return;
          } else {
            return;
          }
        }
    }

    public final void a(faa param0, boolean param1) {
        RuntimeException var3 = null;
        tj[] var3_array = null;
        int var4_int = 0;
        rdb[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        tj[] var7 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var6 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              ((pe) this).field_k = (sg[]) (Object) kcb.a(8, qdb.field_a, param0, 1, -109, (tv[]) (Object) ((pe) this).field_k);
              ((pe) this).field_x = new ij();
              var7 = (tj[]) (Object) kcb.a(10, aba.field_b, param0, 1, -127, (tv[]) null);
              var3_array = var7;
              if (null == var3_array) {
                break L1;
              } else {
                var4_int = 0;
                L2: while (true) {
                  if (var4_int >= var7.length) {
                    break L1;
                  } else {
                    ((pe) this).field_x.b(-10258, (ksa) (Object) var7[var4_int]);
                    var4_int++;
                    continue L2;
                  }
                }
              }
            }
            L3: {
              ((pe) this).field_m = (nbb[]) (Object) kcb.a(10, vcb.field_z, param0, 1, -68, (tv[]) (Object) ((pe) this).field_m);
              if (!kv.a(param1, param0)) {
                ((pe) this).field_e = null;
                break L3;
              } else {
                L4: {
                  if (null != ((pe) this).field_e) {
                    break L4;
                  } else {
                    ((pe) this).field_e = new aib();
                    break L4;
                  }
                }
                ((pe) this).field_e.a(param0, false);
                break L3;
              }
            }
            L5: {
              ((pe) this).field_n = new ij();
              var4 = (rdb[]) (Object) kcb.a(6, ioa.field_q, param0, 1, -86, (tv[]) null);
              if (null == var4) {
                break L5;
              } else {
                var5 = 0;
                L6: while (true) {
                  if (var5 >= var4.length) {
                    break L5;
                  } else {
                    ((pe) this).field_n.b(-10258, (ksa) (Object) var4[var5]);
                    var5++;
                    continue L6;
                  }
                }
              }
            }
            L7: {
              ((pe) this).field_g = (mqb[]) (Object) kcb.a(8, dab.field_c, param0, 1, -47, (tv[]) (Object) ((pe) this).field_g);
              ((pe) this).field_l = wkb.a((byte) 37, ((pe) this).field_l, param0, 4);
              ((pe) this).field_v = kv.a(false, param0);
              ((pe) this).field_y = param0.i(0, 32);
              ((pe) this).field_i = kv.a(false, param0);
              if (!kv.a(false, param0)) {
                ((pe) this).field_f = null;
                break L7;
              } else {
                L8: {
                  if (((pe) this).field_f != null) {
                    break L8;
                  } else {
                    ((pe) this).field_f = new una();
                    break L8;
                  }
                }
                ((pe) this).field_f.a(param0, false);
                break L7;
              }
            }
            L9: {
              ((pe) this).field_t = (cq[]) (Object) kcb.a(8, wsb.field_e, param0, 1, -98, (tv[]) (Object) ((pe) this).field_t);
              ((pe) this).field_a = (rba[]) (Object) kcb.a(4, ema.field_p, param0, 1, -71, (tv[]) (Object) ((pe) this).field_a);
              ((pe) this).field_o = param0.i(0, 28);
              ((pe) this).field_r = param0.i(0, 28);
              ((pe) this).field_j = (it[]) (Object) kcb.a(4, pgb.field_g, param0, 1, -83, (tv[]) (Object) ((pe) this).field_j);
              if (!kv.a(false, param0)) {
                ((pe) this).field_b = null;
                break L9;
              } else {
                ((pe) this).field_b = new bea();
                ((pe) this).field_b.a(param0, false);
                break L9;
              }
            }
            int discarded$1 = 112;
            this.a();
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var3 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var3;
            stackOut_27_1 = new StringBuilder().append("pe.H(");
            stackIn_30_0 = stackOut_27_0;
            stackIn_30_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param0 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L10;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_31_0 = stackOut_28_0;
              stackIn_31_1 = stackOut_28_1;
              stackIn_31_2 = stackOut_28_2;
              break L10;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + 44 + param1 + 41);
        }
    }

    private final void a(crb[] param0, int param1) {
        Object var3 = null;
        RuntimeException var3_ref = null;
        tj var3_ref2 = null;
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
        int var14_int = 0;
        nbb var14_ref = null;
        crb var14_ref2 = null;
        crb var15 = null;
        int var17 = 0;
        Object var19 = null;
        nbb var19_ref = null;
        nbb var20 = null;
        int stackIn_106_0 = 0;
        RuntimeException stackIn_120_0 = null;
        StringBuilder stackIn_120_1 = null;
        RuntimeException stackIn_122_0 = null;
        StringBuilder stackIn_122_1 = null;
        RuntimeException stackIn_123_0 = null;
        StringBuilder stackIn_123_1 = null;
        String stackIn_123_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_103_0 = 0;
        int stackOut_102_0 = 0;
        int stackOut_100_0 = 0;
        RuntimeException stackOut_119_0 = null;
        StringBuilder stackOut_119_1 = null;
        RuntimeException stackOut_122_0 = null;
        StringBuilder stackOut_122_1 = null;
        String stackOut_122_2 = null;
        RuntimeException stackOut_120_0 = null;
        StringBuilder stackOut_120_1 = null;
        String stackOut_120_2 = null;
        var3 = null;
        var19 = null;
        var17 = VoidHunters.field_G;
        try {
          L0: {
            var3_ref2 = (tj) (Object) ((pe) this).field_x.d(0);
            L1: while (true) {
              if (null == var3_ref2) {
                var4 = -67 % ((-34 - param1) / 52);
                break L0;
              } else {
                L2: {
                  wgb.field_i = null;
                  wna.field_c.a(2147483647);
                  gab.field_b.b((byte) -70);
                  var4 = var3_ref2.field_d;
                  var5 = var4 + -var3_ref2.field_f;
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
                  var8 = var3_ref2.field_e;
                  var9 = var8 + -var3_ref2.field_h;
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
                var12 = ((pe) this).field_u.a(-128, 1);
                var13 = 0;
                L4: while (true) {
                  if (var13 >= var12) {
                    L5: {
                      if (1 != voa.field_d) {
                        break L5;
                      } else {
                        if (gab.field_b.a((byte) 111)) {
                          break L5;
                        } else {
                          var12 = ((pe) this).field_u.a(-122, 2);
                          var13 = 0;
                          L6: while (true) {
                            if (var13 >= var12) {
                              break L5;
                            } else {
                              L7: {
                                var14_ref = ((pe) this).field_m[ada.field_a[var13] + -field_c[1]];
                                if (null == var14_ref) {
                                  break L7;
                                } else {
                                  break L7;
                                }
                              }
                              var13++;
                              continue L6;
                            }
                          }
                        }
                      }
                    }
                    L8: {
                      if (gab.field_b.a((byte) 127)) {
                        break L8;
                      } else {
                        var13_ref_mqb__ = ((pe) this).field_g;
                        var14_int = 0;
                        L9: while (true) {
                          if (var14_int >= param0.length) {
                            break L8;
                          } else {
                            L10: {
                              var15 = param0[var14_int];
                              if (null != var15) {
                                if (0 != gba.field_r) {
                                  if (this.a(var3_ref2, (anb) (Object) var15, -80)) {
                                    if (this.a((anb) (Object) var15, 48, var3_ref2)) {
                                      break L8;
                                    } else {
                                      break L10;
                                    }
                                  } else {
                                    break L10;
                                  }
                                } else {
                                  L11: {
                                    if (((mqb) (Object) var15).m(32) == var3_ref2.b(false)) {
                                      break L11;
                                    } else {
                                      break L11;
                                    }
                                  }
                                  var14_int++;
                                  continue L9;
                                }
                              } else {
                                break L10;
                              }
                            }
                            var14_int++;
                            continue L9;
                          }
                        }
                      }
                    }
                    L12: {
                      if (gab.field_b.a((byte) -18)) {
                        break L12;
                      } else {
                        var12 = ((pe) this).field_u.a(-110, 3);
                        var13 = 0;
                        L13: while (true) {
                          if (var13 >= var12) {
                            break L12;
                          } else {
                            L14: {
                              var14_ref2 = param0[-field_c[2] + ada.field_a[var13]];
                              if (null == var14_ref2) {
                                break L14;
                              } else {
                                break L14;
                              }
                            }
                            var13++;
                            continue L13;
                          }
                        }
                      }
                    }
                    L15: {
                      this.a(var3_ref2, var5, var9, (byte) -103, var4, var8);
                      int discarded$1 = 6;
                      this.a(var5, var8, var4, var3_ref2, var9);
                      if (wgb.field_i == null) {
                        break L15;
                      } else {
                        L16: {
                          var13 = 1;
                          if (wgb.field_i instanceof sg) {
                            L17: {
                              var14 = (sg) (Object) wgb.field_i;
                              if (var3_ref2.e(512) != var14.q((byte) 77)) {
                                if (!var14.j((byte) -127)) {
                                  stackOut_103_0 = 1;
                                  stackIn_106_0 = stackOut_103_0;
                                  break L17;
                                } else {
                                  stackOut_102_0 = 0;
                                  stackIn_106_0 = stackOut_102_0;
                                  break L17;
                                }
                              } else {
                                stackOut_100_0 = 0;
                                stackIn_106_0 = stackOut_100_0;
                                break L17;
                              }
                            }
                            L18: {
                              var13 = stackIn_106_0;
                              if (var13 == 0) {
                                break L18;
                              } else {
                                var14.c(var3_ref2.b(false), 19581);
                                if (!var14.g(false)) {
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
                              if (var3_ref2.g((byte) -104) != 5) {
                                break L16;
                              } else {
                                if (!var14.j((byte) -40)) {
                                  var13 = 1;
                                  break L16;
                                } else {
                                  break L16;
                                }
                              }
                            }
                          } else {
                            if (wgb.field_i instanceof nbb) {
                              var19_ref = (nbb) (Object) wgb.field_i;
                              var20 = var19_ref;
                              var20.field_u = true;
                              break L16;
                            } else {
                              wgb.field_i.d((byte) -68);
                              this.a((byte) 108, var3_ref2, var13 != 0);
                              var3_ref2 = (tj) (Object) ((pe) this).field_x.a((byte) 46);
                              continue L1;
                            }
                          }
                        }
                        wgb.field_i.d((byte) -68);
                        this.a((byte) 108, var3_ref2, var13 != 0);
                        break L15;
                      }
                    }
                    var3_ref2 = (tj) (Object) ((pe) this).field_x.a((byte) 46);
                    continue L1;
                  } else {
                    var14 = ((pe) this).field_k[ada.field_a[var13] - field_c[0]];
                    if (null != var14) {
                      L19: {
                        if (6 != var3_ref2.g((byte) -104)) {
                          break L19;
                        } else {
                          if (as.field_d != 0) {
                            break L19;
                          } else {
                            if (var14.q((byte) 99) != var3_ref2.e(512)) {
                              break L19;
                            } else {
                              L20: {
                                if (var14.q((byte) 84) != sja.field_c) {
                                  break L20;
                                } else {
                                  break L20;
                                }
                              }
                              var13++;
                              continue L4;
                            }
                          }
                        }
                      }
                      L21: {
                        if (!this.a(var3_ref2, (anb) (Object) var14, -46)) {
                          break L21;
                        } else {
                          break L21;
                        }
                      }
                      var13++;
                      continue L4;
                    } else {
                      var13++;
                      continue L4;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L22: {
            var3_ref = decompiledCaughtException;
            stackOut_119_0 = (RuntimeException) var3_ref;
            stackOut_119_1 = new StringBuilder().append("pe.RE(");
            stackIn_122_0 = stackOut_119_0;
            stackIn_122_1 = stackOut_119_1;
            stackIn_120_0 = stackOut_119_0;
            stackIn_120_1 = stackOut_119_1;
            if (param0 == null) {
              stackOut_122_0 = (RuntimeException) (Object) stackIn_122_0;
              stackOut_122_1 = (StringBuilder) (Object) stackIn_122_1;
              stackOut_122_2 = "null";
              stackIn_123_0 = stackOut_122_0;
              stackIn_123_1 = stackOut_122_1;
              stackIn_123_2 = stackOut_122_2;
              break L22;
            } else {
              stackOut_120_0 = (RuntimeException) (Object) stackIn_120_0;
              stackOut_120_1 = (StringBuilder) (Object) stackIn_120_1;
              stackOut_120_2 = "{...}";
              stackIn_123_0 = stackOut_120_0;
              stackIn_123_1 = stackOut_120_1;
              stackIn_123_2 = stackOut_120_2;
              break L22;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_123_0, stackIn_123_2 + 44 + param1 + 41);
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        L0: {
          var13 = VoidHunters.field_G;
          if (param3 == -19079) {
            break L0;
          } else {
            ((pe) this).g(-33);
            break L0;
          }
        }
        var9_int = -2147483648;
        var10 = -1;
        var11 = 0;
        L1: while (true) {
          L2: {
            if (((pe) this).field_s.length <= var11) {
              break L2;
            } else {
              if (((pe) this).field_s[var11].b((byte) -123)) {
                var12 = ((pe) this).field_s[var11].a(true);
                if (var12 > var9_int) {
                  var10 = var11;
                  var9_int = var12;
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
            if (var10 >= 0) {
              ((pe) this).field_s[var10].a(param7, param4, param2, param6, param5, param0, param1, true);
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
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              this.a(true, param2, (byte) -117, param0);
              if (param1 == -950) {
                break L1;
              } else {
                int discarded$3 = ((pe) this).d(true);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("pe.BB(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44).append(param1).append(44);
            stackIn_10_0 = stackOut_7_0;
            stackIn_10_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L3;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
    }

    private final void b(byte param0, int param1) {
        ((pe) this).field_j = (it[]) (Object) dt.a(pgb.field_g, param1, 15667, (Object[]) (Object) ((pe) this).field_j);
    }

    final boolean c(byte param0) {
        int var2 = -84 / ((-33 - param0) / 37);
        return ((pe) this).field_v;
    }

    private final boolean a(tfa param0, int param1, tfa param2, sg param3) {
        Object var5 = null;
        vra var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_11_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_23_0 = 0;
        Object stackIn_28_0 = null;
        sg stackIn_28_1 = null;
        Object stackIn_30_0 = null;
        sg stackIn_30_1 = null;
        Object stackIn_31_0 = null;
        sg stackIn_31_1 = null;
        int stackIn_31_2 = 0;
        int stackIn_33_0 = 0;
        int stackIn_37_0 = 0;
        Object stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        Object stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        Object stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        Object stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        Object stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        Object stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        Object stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        Object stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        Object stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_50_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_36_0 = 0;
        Object stackOut_27_0 = null;
        sg stackOut_27_1 = null;
        Object stackOut_30_0 = null;
        sg stackOut_30_1 = null;
        int stackOut_30_2 = 0;
        Object stackOut_28_0 = null;
        sg stackOut_28_1 = null;
        int stackOut_28_2 = 0;
        int stackOut_32_0 = 0;
        Object stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        Object stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        Object stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        Object stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        Object stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        Object stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        Object stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        Object stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        Object stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        try {
          L0: {
            L1: {
              param3.a((int[]) null, -52);
              param3.a((qua) null, 3);
              var5 = null;
              if (param3.n((byte) 28) == null) {
                var5 = (Object) (Object) ((pe) this).i(21363, param3.x(85));
                break L1;
              } else {
                break L1;
              }
            }
            var6 = new vra();
            var6.field_e = param0.field_f;
            var6.field_d = param2.field_f;
            var6.field_a = param0.field_e;
            var6.field_c = param0.field_d;
            if (param3.n((byte) 28) != null) {
              param3.field_k.i(103);
              this.a(16384, var6, param3.n((byte) 28), param3);
              stackOut_10_0 = 0;
              stackIn_11_0 = stackOut_10_0;
              return stackIn_11_0 != 0;
            } else {
              L2: {
                var7 = var6.field_c;
                var8 = var6.field_a;
                if (var5 == null) {
                  stackOut_15_0 = 0;
                  stackIn_16_0 = stackOut_15_0;
                  break L2;
                } else {
                  stackOut_13_0 = 1;
                  stackIn_16_0 = stackOut_13_0;
                  break L2;
                }
              }
              L3: {
                var9 = stackIn_16_0;
                var5 = (Object) (Object) this.a((nbb) var5, (byte) 127, param3, var8, var6, var7);
                if (var5 != null) {
                  if (var9 == 0) {
                    stackOut_20_0 = 1;
                    stackIn_23_0 = stackOut_20_0;
                    break L3;
                  } else {
                    stackOut_19_0 = 0;
                    stackIn_23_0 = stackOut_19_0;
                    break L3;
                  }
                } else {
                  stackOut_17_0 = 0;
                  stackIn_23_0 = stackOut_17_0;
                  break L3;
                }
              }
              var10 = stackIn_23_0;
              if ((var6.field_e & 128) == 0) {
                if ((var6.field_d & 128) != 0) {
                  boolean discarded$1 = this.a((nbb) var5, var8, true, param3, 126, var7);
                  stackOut_36_0 = 1;
                  stackIn_37_0 = stackOut_36_0;
                  break L0;
                } else {
                  return true;
                }
              } else {
                L4: {
                  param3.field_k.i(101);
                  var5 = (Object) (Object) this.a(var8, (nbb) var5, param3, (byte) 124, var7);
                  if (var5 == null) {
                    break L4;
                  } else {
                    L5: {
                      if (var10 != 0) {
                        break L5;
                      } else {
                        var11 = -field_c[1] + ((nbb) var5).field_l;
                        var5 = (Object) (Object) this.c(var11, false);
                        break L5;
                      }
                    }
                    L6: {
                      stackOut_27_0 = this;
                      stackOut_27_1 = (sg) param3;
                      stackIn_30_0 = stackOut_27_0;
                      stackIn_30_1 = stackOut_27_1;
                      stackIn_28_0 = stackOut_27_0;
                      stackIn_28_1 = stackOut_27_1;
                      if (1 != hw.field_b) {
                        stackOut_30_0 = this;
                        stackOut_30_1 = (sg) (Object) stackIn_30_1;
                        stackOut_30_2 = 0;
                        stackIn_31_0 = stackOut_30_0;
                        stackIn_31_1 = stackOut_30_1;
                        stackIn_31_2 = stackOut_30_2;
                        break L6;
                      } else {
                        stackOut_28_0 = this;
                        stackOut_28_1 = (sg) (Object) stackIn_28_1;
                        stackOut_28_2 = 1;
                        stackIn_31_0 = stackOut_28_0;
                        stackIn_31_1 = stackOut_28_1;
                        stackIn_31_2 = stackOut_28_2;
                        break L6;
                      }
                    }
                    this.a(stackIn_31_1, stackIn_31_2 != 0, -98, (nbb) var5, var8, var7);
                    rmb.a(param3.g((byte) -91), param3.field_l, 74, 93, param3.d(false));
                    break L4;
                  }
                }
                stackOut_32_0 = 0;
                stackIn_33_0 = stackOut_32_0;
                return stackIn_33_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = (Object) (Object) decompiledCaughtException;
            stackOut_38_0 = var5;
            stackOut_38_1 = new StringBuilder().append("pe.WD(");
            stackIn_41_0 = stackOut_38_0;
            stackIn_41_1 = stackOut_38_1;
            stackIn_39_0 = stackOut_38_0;
            stackIn_39_1 = stackOut_38_1;
            if (param0 == null) {
              stackOut_41_0 = stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "null";
              stackIn_42_0 = stackOut_41_0;
              stackIn_42_1 = stackOut_41_1;
              stackIn_42_2 = stackOut_41_2;
              break L7;
            } else {
              stackOut_39_0 = stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "{...}";
              stackIn_42_0 = stackOut_39_0;
              stackIn_42_1 = stackOut_39_1;
              stackIn_42_2 = stackOut_39_2;
              break L7;
            }
          }
          L8: {
            stackOut_42_0 = stackIn_42_0;
            stackOut_42_1 = ((StringBuilder) (Object) stackIn_42_1).append(stackIn_42_2).append(44).append(-72).append(44);
            stackIn_45_0 = stackOut_42_0;
            stackIn_45_1 = stackOut_42_1;
            stackIn_43_0 = stackOut_42_0;
            stackIn_43_1 = stackOut_42_1;
            if (param2 == null) {
              stackOut_45_0 = stackIn_45_0;
              stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
              stackOut_45_2 = "null";
              stackIn_46_0 = stackOut_45_0;
              stackIn_46_1 = stackOut_45_1;
              stackIn_46_2 = stackOut_45_2;
              break L8;
            } else {
              stackOut_43_0 = stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "{...}";
              stackIn_46_0 = stackOut_43_0;
              stackIn_46_1 = stackOut_43_1;
              stackIn_46_2 = stackOut_43_2;
              break L8;
            }
          }
          L9: {
            stackOut_46_0 = stackIn_46_0;
            stackOut_46_1 = ((StringBuilder) (Object) stackIn_46_1).append(stackIn_46_2).append(44);
            stackIn_49_0 = stackOut_46_0;
            stackIn_49_1 = stackOut_46_1;
            stackIn_47_0 = stackOut_46_0;
            stackIn_47_1 = stackOut_46_1;
            if (param3 == null) {
              stackOut_49_0 = stackIn_49_0;
              stackOut_49_1 = (StringBuilder) (Object) stackIn_49_1;
              stackOut_49_2 = "null";
              stackIn_50_0 = stackOut_49_0;
              stackIn_50_1 = stackOut_49_1;
              stackIn_50_2 = stackOut_49_2;
              break L9;
            } else {
              stackOut_47_0 = stackIn_47_0;
              stackOut_47_1 = (StringBuilder) (Object) stackIn_47_1;
              stackOut_47_2 = "{...}";
              stackIn_50_0 = stackOut_47_0;
              stackIn_50_1 = stackOut_47_1;
              stackIn_50_2 = stackOut_47_2;
              break L9;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_50_0, stackIn_50_2 + 41);
        }
        return stackIn_37_0 != 0;
    }

    final boolean a(int param0, int param1, int param2, boolean param3, int param4, int param5) {
        int var7 = 0;
        qob[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        qob var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        L0: {
          var14 = VoidHunters.field_G;
          var7 = 0;
          var8 = ((pe) this).field_p.a(false);
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
                    var8 = ((pe) this).field_p.a(false);
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
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_10_0 = null;
        anb stackOut_5_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var8 = VoidHunters.field_G;
        try {
          L0: {
            var9 = param3;
            var5 = var9;
            var6 = 0;
            L1: while (true) {
              if (var9.length <= var6) {
                stackOut_10_0 = null;
                stackIn_11_0 = stackOut_10_0;
                break L0;
              } else {
                L2: {
                  var7 = var9[var6];
                  if (null == var7) {
                    break L2;
                  } else {
                    if (null == var7.field_k.a(param2, param0, true)) {
                      break L2;
                    } else {
                      stackOut_5_0 = (anb) var7;
                      stackIn_6_0 = stackOut_5_0;
                      return stackIn_6_0;
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
            stackOut_12_0 = (RuntimeException) var5_ref;
            stackOut_12_1 = new StringBuilder().append("pe.HC(").append(param0).append(44).append(-111).append(44).append(param2).append(44);
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
          throw rta.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
        return (anb) (Object) stackIn_11_0;
    }

    private final void a(sg param0, boolean param1, int param2, nbb param3, int param4, int param5) {
        ml var7 = null;
        RuntimeException var7_ref = null;
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
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        try {
          L0: {
            L1: {
              var7 = param3.field_k;
              if (param2 <= -59) {
                break L1;
              } else {
                ((pe) this).field_m = null;
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
                var14 = var7.b(38) * fc.a(param3.e(0), (byte) -99) + -(var7.c((byte) 100) * eu.a(param3.e(0), 125)) >> 16;
                var15 = var7.b(37) * eu.a(param3.e(0), 63) - -(var7.c((byte) 100) * fc.a(param3.e(0), (byte) -67)) >> 16;
                param3.a(var11_ref_imb.field_e - var14 + param3.j(995401160), var11_ref_imb.field_d + (-var15 - -param3.i((byte) 5)), (byte) -107);
                param3.field_h = 0;
                param3.field_f = 0;
                param3.field_k.i(97);
                param3.a(param1, true, (pe) this);
                var8 = 0;
                param0.a(var9.field_b.field_g, -48);
                var16 = param0.field_d - param0.j(995401160);
                var17 = param0.field_e + -param0.i((byte) 5);
                var18 = fc.a(param0.e(0), (byte) 44);
                var19 = eu.a(param0.e(0), 68);
                var20 = new ml();
                param0.field_k.b((byte) 119, (tv) (Object) var20);
                param0.field_k.a(var19, param0.e(0), var18, var17, true, true, false, var16, (int[]) null);
                var21 = param0.field_k.a(false, (anb) (Object) param3, 0, -1, param4, 8192, param0.field_k, param5);
                var20.b((byte) 83, (tv) (Object) param0.field_k);
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
                  var10 = var7.b(-48) * fc.a(param3.e(0), (byte) -120) + -(var7.c((byte) 100) * eu.a(param3.e(0), 118)) >> 16;
                  var11 = var7.b(124) * eu.a(param3.e(0), 82) + var7.c((byte) 100) * fc.a(param3.e(0), (byte) 87) >> 16;
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
                    param3.a(param1, true, (pe) this);
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
            var7_ref = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var7_ref;
            stackOut_15_1 = new StringBuilder().append("pe.LB(");
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L6;
            }
          }
          L7: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_22_0 = stackOut_19_0;
            stackIn_22_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param3 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L7;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_23_0 = stackOut_20_0;
              stackIn_23_1 = stackOut_20_1;
              stackIn_23_2 = stackOut_20_2;
              break L7;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 44 + param4 + 44 + param5 + 41);
        }
    }

    private final boolean a(boolean param0, int[] param1, int[] param2) {
        RuntimeException var4 = null;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                if (param2[0] < param1[0]) {
                  break L2;
                } else {
                  if (param2[1] > param1[1]) {
                    break L2;
                  } else {
                    if (param1[2] > param2[2]) {
                      break L2;
                    } else {
                      if (param2[3] <= param1[3]) {
                        stackOut_9_0 = 0;
                        stackIn_10_0 = stackOut_9_0;
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
              }
              stackOut_7_0 = 1;
              stackIn_10_0 = stackOut_7_0;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("pe.CD(").append(1).append(44);
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L3;
            }
          }
          L4: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(44);
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L4;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 41);
        }
        return stackIn_10_0 != 0;
    }

    private final void a(int param0, lta param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
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
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var18 = VoidHunters.field_G;
        try {
          L0: {
            var4_int = 0;
            L1: while (true) {
              if (ccb.field_a.field_d <= var4_int) {
                break L0;
              } else {
                L2: {
                  L3: {
                    var5 = ccb.field_a.field_b[var4_int];
                    if (!(var5.field_e instanceof sg)) {
                      break L3;
                    } else {
                      if (((sg) (Object) var5.field_e).b(2, (byte) 62)) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var6 = param1.a(var5.field_g, (byte) 115);
                  var7 = param1.b(true, var5.field_f);
                  if (-1 != var5.field_i) {
                    var8 = rkb.field_o;
                    var9 = 0;
                    var10 = 0;
                    var11 = 128 + (eu.a(100 * param2, 58) >> 9) | 11184640;
                    var12 = 0;
                    L4: while (true) {
                      if (var12 >= 10) {
                        var12 = -var8;
                        L5: while (true) {
                          if (var8 < var12) {
                            break L2;
                          } else {
                            L6: {
                              var13 = var5.field_b + var5.field_i * var12 / var8;
                              var14 = (fc.a(var13, (byte) -106) >> 8) * (var5.field_d >> 8);
                              var15 = (eu.a(var13, 98) >> 8) * (var5.field_d >> 8);
                              var16 = var5.field_g + var14;
                              var17 = var5.field_f + var15;
                              if (-var8 >= var12) {
                                break L6;
                              } else {
                                c.a(param1.b(true, var17), param1.a(var16, (byte) 112), param1.a(var9, (byte) 125), param1.b(true, var10), -16777216, var11);
                                break L6;
                              }
                            }
                            var10 = var17;
                            var9 = var16;
                            var12++;
                            continue L5;
                          }
                        }
                      } else {
                        var13 = (eu.a(var12 * (10 * param2), 78) >> 8) * (var5.field_i >> 8) - -var5.field_b;
                        var14 = (fc.a(var13, (byte) 105) >> 8) * (var5.field_d >> 8);
                        var15 = (eu.a(var13, 45) >> 8) * (var5.field_d >> 8);
                        c.a(param1.b(true, var15 + var5.field_f), param1.a(var14 + var5.field_g, (byte) 120), var6, var7, -16777216, 4473924);
                        var12++;
                        continue L4;
                      }
                    }
                  } else {
                    kq.a((float)var5.field_d * param1.field_a, (byte) 111, var7, 11184895, var6);
                    break L2;
                  }
                }
                var4_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var4;
            stackOut_22_1 = new StringBuilder().append("pe.UE(").append(-98).append(44);
            stackIn_25_0 = stackOut_22_0;
            stackIn_25_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_26_0 = stackOut_23_0;
              stackIn_26_1 = stackOut_23_1;
              stackIn_26_2 = stackOut_23_2;
              break L7;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 44 + param2 + 41);
        }
    }

    private final void a(lta param0, sg param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
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
                    if (param2 != -1) {
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
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var6;
            stackOut_13_1 = new StringBuilder().append("pe.GA(");
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L4;
            }
          }
          L5: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(44);
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_21_0 = stackOut_18_0;
              stackIn_21_1 = stackOut_18_1;
              stackIn_21_2 = stackOut_18_2;
              break L5;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + param2 + 44 + 0 + 44 + param4 + 41);
        }
    }

    private final anb a(byte param0, int param1, int param2) {
        anb var4 = null;
        crb[] var5 = null;
        if (param0 <= -9) {
          var4 = this.a(param1, (byte) -111, param2, (anb[]) (Object) ((pe) this).field_k);
          if (null != var4) {
            return var4;
          } else {
            var4 = this.a(param1, (byte) -111, param2, (anb[]) (Object) ((pe) this).field_m);
            if (var4 == null) {
              var5 = ((pe) this).field_e.c(0);
              var4 = this.a(param1, (byte) -111, param2, (anb[]) (Object) var5);
              if (var4 != null) {
                return var4;
              } else {
                var4 = this.a(param1, (byte) -111, param2, (anb[]) (Object) ((pe) this).field_g);
                return var4;
              }
            } else {
              return var4;
            }
          }
        } else {
          return null;
        }
    }

    final crb[] a(boolean param0) {
        if (!param0) {
            return null;
        }
        return ((pe) this).field_e.c(0);
    }

    private final void a(qob param0) {
        RuntimeException var3 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            ((pe) this).a(true, param0, (byte) -94);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var3;
            stackOut_3_1 = new StringBuilder().append("pe.QA(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + 0 + 41);
        }
    }

    final void a(int param0, boolean param1) {
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        Object stackOut_2_0 = null;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        L0: {
          if (param0 == 48) {
            break L0;
          } else {
            ((pe) this).field_x = null;
            break L0;
          }
        }
        L1: {
          stackOut_2_0 = this;
          stackIn_4_0 = stackOut_2_0;
          stackIn_3_0 = stackOut_2_0;
          if (!param1) {
            stackOut_4_0 = this;
            stackOut_4_1 = 0;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            break L1;
          } else {
            stackOut_3_0 = this;
            stackOut_3_1 = 1;
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            break L1;
          }
        }
        ((pe) this).field_i = stackIn_5_1 != 0;
    }

    private final void c(byte param0, int param1) {
        ((pe) this).field_a = (rba[]) (Object) dt.a(ema.field_p, param1, 15667, (Object[]) (Object) ((pe) this).field_a);
    }

    final void a(sg param0, byte param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            param0.a((pe) this, true, (byte) 67, false);
            boolean discarded$30 = param0.b(-(((pe) this).field_r >> 1), 2147483647, ((pe) this).field_r >> 1, -(((pe) this).field_o >> 1), ((pe) this).field_o >> 1);
            if (param1 > 70) {
              L1: {
                param0.C(32);
                if (!((pe) this).a(29651, (anb) (Object) param0, (anb[]) (Object) ((pe) this).field_k, 0)) {
                  break L1;
                } else {
                  this.b(1, (byte) 125, (anb) (Object) param0);
                  break L1;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("pe.UA(");
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
          throw rta.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param1 + 41);
        }
    }

    final int f(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = VoidHunters.field_G;
          var3 = 0;
          if (param1 == -13766) {
            break L0;
          } else {
            ((pe) this).field_j = null;
            break L0;
          }
        }
        var4 = 0;
        L1: while (true) {
          if (((pe) this).field_k.length <= var4) {
            return var3;
          } else {
            if (((pe) this).field_k[var4] != null) {
              L2: {
                if (((pe) this).field_k[var4].q((byte) 109) == param0) {
                  break L2;
                } else {
                  break L2;
                }
              }
              var3++;
              var4++;
              continue L1;
            } else {
              var4++;
              continue L1;
            }
          }
        }
    }

    final int b(boolean param0) {
        int var2 = 0;
        nbb[] var3 = null;
        int var4 = 0;
        nbb var5 = null;
        int var6 = 0;
        L0: {
          var6 = VoidHunters.field_G;
          var2 = 0;
          var3 = ((pe) this).field_m;
          if (param0) {
            break L0;
          } else {
            ((pe) this).field_v = true;
            break L0;
          }
        }
        var4 = 0;
        L1: while (true) {
          if (var4 >= var3.length) {
            return var2;
          } else {
            L2: {
              var5 = var3[var4];
              if (null != var5) {
                break L2;
              } else {
                break L2;
              }
            }
            var2++;
            var4++;
            continue L1;
          }
        }
    }

    final void a(tj param0, boolean param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (1023 > ((pe) this).field_x.c(3)) {
              L1: {
                ((pe) this).field_x.b(-10258, (ksa) (Object) param0);
                if (!param1) {
                  break L1;
                } else {
                  field_c = null;
                  break L1;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) runtimeException;
            stackOut_5_1 = new StringBuilder().append("pe.HD(");
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param1 + 41);
        }
    }

    private final void a(int param0, int param1, int param2, tj param3, int param4) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9_int = 0;
        uwa var9 = null;
        uwa var10_ref_uwa = null;
        int var10 = 0;
        sg var11 = null;
        Object var12 = null;
        int var14 = 0;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        var14 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (6 != param3.g((byte) -104)) {
                break L1;
              } else {
                var7_int = -1;
                var8 = 2147483647;
                var9_int = 0;
                L2: while (true) {
                  if (var9_int >= ccb.field_a.field_d) {
                    if (var7_int != -1) {
                      L3: {
                        var9 = ccb.field_a.field_b[var7_int];
                        var10 = param3.b(false);
                        var11 = ((pe) this).d(var10, 113);
                        var12 = null;
                        if (null == var9.field_e) {
                          break L3;
                        } else {
                          if (!(var9.field_e instanceof sg)) {
                            break L3;
                          } else {
                            var12 = (Object) (Object) (sg) (Object) var9.field_e;
                            break L3;
                          }
                        }
                      }
                      L4: {
                        if (null != var12) {
                          param3.b(((sg) var12).o((byte) -117), (byte) 47);
                          param3.a(122, ((sg) var12).q((byte) 80));
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      if (null == var11) {
                        param3.a(-1, (byte) -98);
                        break L1;
                      } else {
                        if ((Object) (Object) var9.field_e != (Object) (Object) var11) {
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
                    L5: {
                      var10_ref_uwa = ccb.field_a.field_b[var9_int];
                      if (var10_ref_uwa.field_c != 1) {
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    var9_int++;
                    continue L2;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var7 = decompiledCaughtException;
            stackOut_35_0 = (RuntimeException) var7;
            stackOut_35_1 = new StringBuilder().append("pe.NC(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_38_0 = stackOut_35_0;
            stackIn_38_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param3 == null) {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L6;
            } else {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "{...}";
              stackIn_39_0 = stackOut_36_0;
              stackIn_39_1 = stackOut_36_1;
              stackIn_39_2 = stackOut_36_2;
              break L6;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_39_0, stackIn_39_2 + 44 + param4 + 44 + 6 + 41);
        }
    }

    final boolean a(int param0, lbb param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_5_0 = 0;
        int stackIn_13_0 = 0;
        boolean stackIn_15_0 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_12_0 = 0;
        boolean stackOut_14_0 = false;
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
              var4_int = param1.e(8);
              if (3 == var4_int) {
                break L1;
              } else {
                if (var4_int != 5) {
                  stackOut_4_0 = 0;
                  stackIn_5_0 = stackOut_4_0;
                  return stackIn_5_0 != 0;
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
              if (param1.e(param2 ^ -14360) == 5) {
                var5 = param1.f((byte) -97);
                var6 = lga.a((byte) -2, ((pe) this).field_y);
                if (var6 >= var5) {
                  break L3;
                } else {
                  stackOut_12_0 = 0;
                  stackIn_13_0 = stackOut_12_0;
                  return stackIn_13_0 != 0;
                }
              } else {
                break L3;
              }
            }
            stackOut_14_0 = ((pe) this).a(true, param0, param1);
            stackIn_15_0 = stackOut_14_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var4;
            stackOut_16_1 = new StringBuilder().append("pe.CB(").append(param0).append(44);
            stackIn_19_0 = stackOut_16_0;
            stackIn_19_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_20_0 = stackOut_17_0;
              stackIn_20_1 = stackOut_17_1;
              stackIn_20_2 = stackOut_17_2;
              break L4;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 44 + param2 + 41);
        }
        return stackIn_15_0;
    }

    final nbb[] h(byte param0) {
        if (param0 != -33) {
            return null;
        }
        return ((pe) this).field_m;
    }

    private final boolean a(anb param0, anb param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        ij var5 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            if (!rna.a(param0.field_q, param1.field_q, -128)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              var4_int = -59 / ((param2 - -25) / 41);
              var5 = new ij();
              param0.field_k.a(param1.field_k, 0, 0, (byte) -126, var5);
              if (var5.b(-103)) {
                stackOut_8_0 = 0;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                stackOut_6_0 = 1;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4;
            stackOut_10_1 = new StringBuilder().append("pe.HE(");
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L1;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L1;
            }
          }
          L2: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(44);
            stackIn_17_0 = stackOut_14_0;
            stackIn_17_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L2;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_18_0 = stackOut_15_0;
              stackIn_18_1 = stackOut_15_1;
              stackIn_18_2 = stackOut_15_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + param2 + 41);
        }
        return stackIn_9_0 != 0;
    }

    final boolean a(anb param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        qob var7 = null;
        int var8 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var8 = VoidHunters.field_G;
        try {
          L0: {
            var3_int = 0;
            var4 = ((pe) this).field_u.a(-1, param0.f((byte) -91), 0, 88);
            var5 = 0;
            var6 = 118 / ((56 - param1) / 59);
            L1: while (true) {
              L2: {
                if (var5 >= var4) {
                  break L2;
                } else {
                  L3: {
                    var7 = ((pe) this).d((byte) 116)[ada.field_a[var5]];
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
              stackOut_10_0 = var3_int;
              stackIn_11_0 = stackOut_10_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3;
            stackOut_12_1 = new StringBuilder().append("pe.KB(");
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_16_2 = stackOut_13_2;
              break L4;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param1 + 41);
        }
        return stackIn_11_0 != 0;
    }

    final boolean a(int param0, anb param1, anb[] param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var7 = VoidHunters.field_G;
        try {
          L0: {
            if (param0 == 29651) {
              var5_int = 0;
              L1: while (true) {
                if (var5_int >= param2.length) {
                  stackOut_15_0 = 0;
                  stackIn_16_0 = stackOut_15_0;
                  break L0;
                } else {
                  L2: {
                    if (null != param2[var5_int]) {
                      break L2;
                    } else {
                      var6 = var5_int + field_c[param3];
                      if (((pe) this).d(var6, (byte) 21)) {
                        break L2;
                      } else {
                        L3: {
                          if (param3 == 1) {
                            this.l(param0 + -29775);
                            param2 = (anb[]) (Object) ((pe) this).field_m;
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        param2[var5_int] = (anb) (Object) param2;
                        param1.field_l = var6;
                        stackOut_12_0 = 1;
                        stackIn_13_0 = stackOut_12_0;
                        return stackIn_13_0 != 0;
                      }
                    }
                  }
                  var5_int++;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var5;
            stackOut_17_1 = new StringBuilder().append("pe.KE(").append(param0).append(44);
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_21_0 = stackOut_18_0;
              stackIn_21_1 = stackOut_18_1;
              stackIn_21_2 = stackOut_18_2;
              break L4;
            }
          }
          L5: {
            stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(44);
            stackIn_24_0 = stackOut_21_0;
            stackIn_24_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param2 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L5;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_25_0 = stackOut_22_0;
              stackIn_25_1 = stackOut_22_1;
              stackIn_25_2 = stackOut_22_2;
              break L5;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + param3 + 41);
        }
        return stackIn_16_0 != 0;
    }

    private final void a(it param0) {
        RuntimeException var3 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              if (null == ((pe) this).field_j) {
                break L1;
              } else {
                if (((pe) this).field_j.length >= 15) {
                  return;
                } else {
                  break L1;
                }
              }
            }
            ((pe) this).field_j = (it[]) (Object) ija.a((Object) (Object) param0, (Object[]) (Object) ((pe) this).field_j, 0, pgb.field_g);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("pe.FD(");
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
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
          throw rta.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + 107 + 41);
        }
    }

    final void a(boolean param0, qob param1, byte param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              if (param2 <= -66) {
                break L1;
              } else {
                ((pe) this).field_h = true;
                break L1;
              }
            }
            L2: {
              var4_int = ((pe) this).field_p.a(param1, 121);
              if (!param0) {
                break L2;
              } else {
                if (-1 != var4_int) {
                  ((pe) this).field_u.a(new int[4], (byte) 43, var4_int, 0);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var4;
            stackOut_8_1 = new StringBuilder().append("pe.PE(").append(param0).append(44);
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L3;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param2 + 41);
        }
    }

    private final nbb a(int param0, int param1, int param2, byte param3, int param4, int param5) {
        Object var7 = null;
        int var8 = 0;
        int var9 = 0;
        nbb[] var10 = null;
        int var11 = 0;
        nbb var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        var20 = VoidHunters.field_G;
        var7 = null;
        var8 = 262144;
        var9 = var8;
        var10 = ((pe) this).field_m;
        var11 = 0;
        L0: while (true) {
          if (var10.length <= var11) {
            return (nbb) var7;
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
                      var7 = (Object) (Object) var12;
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
        if (null == ((pe) this).field_m) {
            return null;
        }
        if (param0 < 0) {
            return null;
        }
        if (param0 >= ((pe) this).field_m.length) {
            return null;
        }
        if (null == ((pe) this).field_m[param0]) {
            return null;
        }
        this.l(-85);
        nbb var4 = ((pe) this).field_m[param0];
        nbb var3 = var4;
        if (param1) {
            return null;
        }
        ((pe) this).field_m[param0] = new nbb();
        var4.b((byte) 97, (tv) (Object) ((pe) this).field_m[param0]);
        return ((pe) this).field_m[param0];
    }

    final int c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = VoidHunters.field_G;
        var2 = param0;
        var3 = 0;
        L0: while (true) {
          if (var3 >= ((pe) this).field_k.length) {
            return var2;
          } else {
            if (((pe) this).field_k[var3] != null) {
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
        ij var4 = null;
        RuntimeException var4_ref = null;
        crb[] var5 = null;
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
              var4 = new ij();
              this.a(var4, false);
              int discarded$3 = 25;
              this.a(var4);
              var5 = ((pe) this).field_e.c(0);
              this.a(var4, -1, var5);
              this.a(var5, true, var4);
              if (seb.field_o != 1) {
                break L1;
              } else {
                boolean discarded$4 = this.a(var4, (anb[]) (Object) ((pe) this).field_m, (anb[]) (Object) ((pe) this).field_g, 20521, 3, 1, sja.field_i);
                break L1;
              }
            }
            L2: {
              if (!this.a(var4, (anb[]) (Object) var5, (anb[]) (Object) ((pe) this).field_g, param0 + 20519, 3, param0, sja.field_i)) {
                break L2;
              } else {
                ((pe) this).field_e.b(-67);
                break L2;
              }
            }
            boolean discarded$5 = this.a(var4, (anb[]) (Object) ((pe) this).field_k, (anb[]) (Object) ((pe) this).field_g, 20521, 3, 0, sja.field_i);
            this.a(var5, param0 ^ 44);
            this.k(param0 ^ -84);
            this.a(param1, 7559, param2, var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4_ref = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var4_ref;
            stackOut_6_1 = new StringBuilder().append("pe.FF(").append(param0).append(44);
            stackIn_9_0 = stackOut_6_0;
            stackIn_9_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_10_0 = stackOut_7_0;
              stackIn_10_1 = stackOut_7_1;
              stackIn_10_2 = stackOut_7_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44);
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L4;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
    }

    final ij c(boolean param0) {
        L0: {
          if (param0) {
            break L0;
          } else {
            ((pe) this).a(-10);
            break L0;
          }
        }
        return ((pe) this).field_x;
    }

    final nbb a(boolean param0, int param1, int param2, int param3, int param4) {
        L0: {
          if (param0) {
            break L0;
          } else {
            field_w = null;
            break L0;
          }
        }
        return ((pe) this).b(1, 65536, param3, param2, param4, param1);
    }

    public static void h() {
        field_d = null;
        field_w = null;
        field_c = null;
    }

    final anb a(boolean param0, int param1, int param2, int param3) {
        Object var5 = null;
        int var6 = 0;
        sg[] var7 = null;
        nbb[] var7_array = null;
        int var8 = 0;
        sg var9 = null;
        nbb var9_ref = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_20_0 = 0;
        nbb stackIn_20_1 = null;
        int stackIn_22_0 = 0;
        nbb stackIn_22_1 = null;
        int stackIn_23_0 = 0;
        nbb stackIn_23_1 = null;
        int stackIn_23_2 = 0;
        int stackOut_19_0 = 0;
        nbb stackOut_19_1 = null;
        int stackOut_22_0 = 0;
        nbb stackOut_22_1 = null;
        int stackOut_22_2 = 0;
        int stackOut_20_0 = 0;
        nbb stackOut_20_1 = null;
        int stackOut_20_2 = 0;
        var13 = VoidHunters.field_G;
        var5 = null;
        var6 = 2147483647;
        var7 = ((pe) this).field_k;
        var8 = 0;
        L0: while (true) {
          if (var8 >= var7.length) {
            L1: {
              if (1 == voa.field_d) {
                var7_array = ((pe) this).field_m;
                var14 = 0;
                var8 = var14;
                L2: while (true) {
                  if (var14 >= var7_array.length) {
                    break L1;
                  } else {
                    var9_ref = var7_array[var14];
                    if (null != var9_ref) {
                      L3: {
                        stackOut_19_0 = -param2;
                        stackOut_19_1 = (nbb) var9_ref;
                        stackIn_22_0 = stackOut_19_0;
                        stackIn_22_1 = stackOut_19_1;
                        stackIn_20_0 = stackOut_19_0;
                        stackIn_20_1 = stackOut_19_1;
                        if (param0) {
                          stackOut_22_0 = stackIn_22_0;
                          stackOut_22_1 = (nbb) (Object) stackIn_22_1;
                          stackOut_22_2 = 0;
                          stackIn_23_0 = stackOut_22_0;
                          stackIn_23_1 = stackOut_22_1;
                          stackIn_23_2 = stackOut_22_2;
                          break L3;
                        } else {
                          stackOut_20_0 = stackIn_20_0;
                          stackOut_20_1 = (nbb) (Object) stackIn_20_1;
                          stackOut_20_2 = 1;
                          stackIn_23_0 = stackOut_20_0;
                          stackIn_23_1 = stackOut_20_1;
                          stackIn_23_2 = stackOut_20_2;
                          break L3;
                        }
                      }
                      var10 = stackIn_23_0 + ((nbb) (Object) stackIn_23_1).d(stackIn_23_2 != 0);
                      var11 = var9_ref.g((byte) 123) - param1;
                      var12 = ar.a(var10, (byte) 124, var11);
                      if (var6 > var12) {
                        var5 = (Object) (Object) var9_ref;
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
                ((pe) this).a(-44, -99, (anb) null);
                break L4;
              }
            }
            return (anb) var5;
          } else {
            var9 = var7[var8];
            if (null != var9) {
              if (param3 != var9.q((byte) 110)) {
                var10 = -param2 + var9.d(false);
                var11 = -param1 + var9.g((byte) -103);
                var12 = ar.a(var10, (byte) 107, var11);
                if (var12 < var6) {
                  var6 = var12;
                  var5 = (Object) (Object) var9;
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
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var5 = VoidHunters.field_G;
        try {
          L0: {
            var4_int = 0;
            L1: while (true) {
              if (var4_int >= param0.length) {
                break L0;
              } else {
                L2: {
                  if (param0[var4_int] != null) {
                    this.b(param2, (byte) 125, param0[var4_int]);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var4_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4;
            stackOut_12_1 = new StringBuilder().append("pe.PC(");
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
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
          throw rta.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + 1 + 44 + param2 + 41);
        }
    }

    private final void c(int param0, byte param1) {
        ((pe) this).field_t = (cq[]) (Object) dt.a(wsb.field_e, param0, 15667, (Object[]) (Object) ((pe) this).field_t);
    }

    private final void a(int param0, int param1, int[] param2, byte param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
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
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
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
                  var12 = var8_int * fc.a(var11, (byte) 101) >> 16;
                  var13 = var8_int * eu.a(var11, 65) >> 16;
                  var14 = 4;
                  var15 = -var13 / var14;
                  var16 = var12 / var14;
                  var17 = 320;
                  ((pe) this).a(param0, var15, 50, 100, 30273, param4, var17, param1, var16);
                  break L0;
                } else {
                  return;
                }
              } else {
                L2: {
                  var10 = param2[var9];
                  if (var10 <= var8_int) {
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var9 += 2;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var8;
            stackOut_12_1 = new StringBuilder().append("pe.JE(").append(param0).append(44).append(param1).append(44);
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
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
          throw rta.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
    }

    private final void a() {
        L0: {
          if (((pe) this).field_o == 0) {
            ((pe) this).field_o = 1 << fob.field_c;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (((pe) this).field_r == 0) {
            ((pe) this).field_r = 1 << fob.field_c;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (null != ((pe) this).field_k) {
            break L2;
          } else {
            ((pe) this).field_k = new sg[field_w[0]];
            break L2;
          }
        }
        L3: {
          if (null != ((pe) this).field_m) {
            break L3;
          } else {
            ((pe) this).field_m = new nbb[field_w[1]];
            break L3;
          }
        }
        L4: {
          if (((pe) this).field_e == null) {
            ((pe) this).field_e = new aib(field_w[2]);
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          if (((pe) this).field_g == null) {
            ((pe) this).field_g = new mqb[field_w[3]];
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          if (null != ((pe) this).field_p) {
            break L6;
          } else {
            ((pe) this).field_p = new lua();
            break L6;
          }
        }
        L7: {
          if (((pe) this).field_p.a(false) != null) {
            break L7;
          } else {
            if (null != ((pe) this).field_b) {
              ((pe) this).field_b.a((pe) this, 0);
              break L7;
            } else {
              break L7;
            }
          }
        }
        int discarded$1 = 0;
        this.f();
    }

    private final void a(int param0, vra param1, boa param2, sg param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int[] var6 = null;
        ml var7 = null;
        ml var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var11 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var5_int = 0;
              var6 = param2.field_c;
              if (null == var6) {
                break L1;
              } else {
                if (var6.length <= 0) {
                  break L1;
                } else {
                  var7 = qia.a(1, var6);
                  var8 = param3.field_k;
                  var9 = var8.j((byte) 57);
                  var10 = 0;
                  L2: while (true) {
                    if (var10 >= var9) {
                      break L1;
                    } else {
                      L3: {
                        if (!this.a(var8, param3, var7, var10, -17329, var7)) {
                          stackOut_9_0 = 0;
                          stackIn_10_0 = stackOut_9_0;
                          break L3;
                        } else {
                          stackOut_8_0 = 1;
                          stackIn_10_0 = stackOut_8_0;
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
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var5;
            stackOut_17_1 = new StringBuilder().append("pe.VC(").append(16384).append(44);
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_21_0 = stackOut_18_0;
              stackIn_21_1 = stackOut_18_1;
              stackIn_21_2 = stackOut_18_2;
              break L5;
            }
          }
          L6: {
            stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(44);
            stackIn_24_0 = stackOut_21_0;
            stackIn_24_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param2 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L6;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_25_0 = stackOut_22_0;
              stackIn_25_1 = stackOut_22_1;
              stackIn_25_2 = stackOut_22_2;
              break L6;
            }
          }
          L7: {
            stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(44);
            stackIn_28_0 = stackOut_25_0;
            stackIn_28_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param3 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L7;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_29_0 = stackOut_26_0;
              stackIn_29_1 = stackOut_26_1;
              stackIn_29_2 = stackOut_26_2;
              break L7;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + 41);
        }
    }

    private final void a(boolean param0, lbb param1, byte param2, lta param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
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
        int var15 = 0;
        crb[] var15_ref_crb__ = null;
        nbb var15_ref_nbb = null;
        int var16 = 0;
        sg[] var16_ref_sg__ = null;
        sg var16_ref_sg = null;
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
        RuntimeException stackIn_100_0 = null;
        StringBuilder stackIn_100_1 = null;
        RuntimeException stackIn_102_0 = null;
        StringBuilder stackIn_102_1 = null;
        RuntimeException stackIn_103_0 = null;
        StringBuilder stackIn_103_1 = null;
        String stackIn_103_2 = null;
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        RuntimeException stackIn_106_0 = null;
        StringBuilder stackIn_106_1 = null;
        RuntimeException stackIn_107_0 = null;
        StringBuilder stackIn_107_1 = null;
        String stackIn_107_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_99_0 = null;
        StringBuilder stackOut_99_1 = null;
        RuntimeException stackOut_102_0 = null;
        StringBuilder stackOut_102_1 = null;
        String stackOut_102_2 = null;
        RuntimeException stackOut_100_0 = null;
        StringBuilder stackOut_100_1 = null;
        String stackOut_100_2 = null;
        RuntimeException stackOut_103_0 = null;
        StringBuilder stackOut_103_1 = null;
        RuntimeException stackOut_106_0 = null;
        StringBuilder stackOut_106_1 = null;
        String stackOut_106_2 = null;
        RuntimeException stackOut_104_0 = null;
        StringBuilder stackOut_104_1 = null;
        String stackOut_104_2 = null;
        var23 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param1.e(8) != 5) {
                break L1;
              } else {
                var5_int = param1.f((byte) -102);
                var6 = lga.a((byte) -2, ((pe) this).field_y);
                if (var6 < var5_int) {
                  L2: {
                    var7 = dm.a(((pe) this).field_y, (byte) -78);
                    var8 = var5_int + -var6;
                    if (var8 > var7) {
                      var8 = var7;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    var9 = -(((pe) this).field_o / var7 * var8) + ((pe) this).field_o;
                    if (var9 < 0) {
                      var9 = 0;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    var10 = -(((pe) this).field_r / var7 * var8) + ((pe) this).field_r;
                    if (var10 < 0) {
                      var10 = 0;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  var11 = var9 >> 1;
                  var12 = var10 >> 1;
                  var13 = new int[]{-var11, var11, -var12, var12};
                  if (!param0) {
                    var26 = 0;
                    var14_int = var26;
                    L5: while (true) {
                      if (var26 >= ((pe) this).field_m.length) {
                        var14 = ((pe) this).field_e.c(0);
                        var24 = var14;
                        var15_ref_crb__ = var14;
                        var16 = 0;
                        L6: while (true) {
                          if (var16 >= var24.length) {
                            var15 = 0;
                            L7: while (true) {
                              if (((pe) this).field_k.length <= var15) {
                                var15 = 0;
                                var25 = ((pe) this).field_k;
                                var16_ref_sg__ = ((pe) this).field_k;
                                var17 = 0;
                                L8: while (true) {
                                  if (var25.length <= var17) {
                                    var16 = -1;
                                    var17 = 0;
                                    var18 = 0;
                                    L9: while (true) {
                                      if (var18 > var15) {
                                        L10: {
                                          if (var16 >= 0) {
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
                                        var20 = ((pe) this).field_k;
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
                                            L14: {
                                              var22 = var20[var21];
                                              if (null == var22) {
                                                break L14;
                                              } else {
                                                break L14;
                                              }
                                            }
                                            var21++;
                                            continue L11;
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    L15: {
                                      var18_ref_sg = var25[var17];
                                      if (null == var18_ref_sg) {
                                        break L15;
                                      } else {
                                        break L15;
                                      }
                                    }
                                    var17++;
                                    continue L8;
                                  }
                                }
                              } else {
                                L16: {
                                  var16_ref_sg = ((pe) this).field_k[var15];
                                  var22 = var16_ref_sg;
                                  var22 = var16_ref_sg;
                                  if (var16_ref_sg != null) {
                                    if (this.a(true, var13, var16_ref_sg.field_q)) {
                                      int discarded$1 = var16_ref_sg.field_k.a(1000, (byte) 85);
                                      break L16;
                                    } else {
                                      break L16;
                                    }
                                  } else {
                                    break L16;
                                  }
                                }
                                var15++;
                                continue L7;
                              }
                            }
                          } else {
                            L17: {
                              var17_ref_crb = var24[var16];
                              if (null != var17_ref_crb) {
                                if (this.a(true, var13, var17_ref_crb.field_q)) {
                                  this.a((anb) (Object) var17_ref_crb, true, false, false, 2);
                                  break L17;
                                } else {
                                  break L17;
                                }
                              } else {
                                break L17;
                              }
                            }
                            var16++;
                            continue L6;
                          }
                        }
                      } else {
                        L18: {
                          var15_ref_nbb = ((pe) this).field_m[var26];
                          if (null == var15_ref_nbb) {
                            break L18;
                          } else {
                            break L18;
                          }
                        }
                        var26++;
                        continue L5;
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
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var5 = decompiledCaughtException;
            stackOut_99_0 = (RuntimeException) var5;
            stackOut_99_1 = new StringBuilder().append("pe.AE(").append(param0).append(44);
            stackIn_102_0 = stackOut_99_0;
            stackIn_102_1 = stackOut_99_1;
            stackIn_100_0 = stackOut_99_0;
            stackIn_100_1 = stackOut_99_1;
            if (param1 == null) {
              stackOut_102_0 = (RuntimeException) (Object) stackIn_102_0;
              stackOut_102_1 = (StringBuilder) (Object) stackIn_102_1;
              stackOut_102_2 = "null";
              stackIn_103_0 = stackOut_102_0;
              stackIn_103_1 = stackOut_102_1;
              stackIn_103_2 = stackOut_102_2;
              break L19;
            } else {
              stackOut_100_0 = (RuntimeException) (Object) stackIn_100_0;
              stackOut_100_1 = (StringBuilder) (Object) stackIn_100_1;
              stackOut_100_2 = "{...}";
              stackIn_103_0 = stackOut_100_0;
              stackIn_103_1 = stackOut_100_1;
              stackIn_103_2 = stackOut_100_2;
              break L19;
            }
          }
          L20: {
            stackOut_103_0 = (RuntimeException) (Object) stackIn_103_0;
            stackOut_103_1 = ((StringBuilder) (Object) stackIn_103_1).append(stackIn_103_2).append(44).append(-117).append(44);
            stackIn_106_0 = stackOut_103_0;
            stackIn_106_1 = stackOut_103_1;
            stackIn_104_0 = stackOut_103_0;
            stackIn_104_1 = stackOut_103_1;
            if (param3 == null) {
              stackOut_106_0 = (RuntimeException) (Object) stackIn_106_0;
              stackOut_106_1 = (StringBuilder) (Object) stackIn_106_1;
              stackOut_106_2 = "null";
              stackIn_107_0 = stackOut_106_0;
              stackIn_107_1 = stackOut_106_1;
              stackIn_107_2 = stackOut_106_2;
              break L20;
            } else {
              stackOut_104_0 = (RuntimeException) (Object) stackIn_104_0;
              stackOut_104_1 = (StringBuilder) (Object) stackIn_104_1;
              stackOut_104_2 = "{...}";
              stackIn_107_0 = stackOut_104_0;
              stackIn_107_1 = stackOut_104_1;
              stackIn_107_2 = stackOut_104_2;
              break L20;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_107_0, stackIn_107_2 + 41);
        }
    }

    private final void a(nwa param0, int param1, tfa[] param2, crb[] param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        mqb[] var5_array = null;
        crb[] var5_array2 = null;
        sg var6 = null;
        int var6_int = 0;
        nbb var6_ref = null;
        it var6_ref2 = null;
        mqb var7 = null;
        crb var7_ref = null;
        int var13 = 0;
        int var15 = 0;
        RuntimeException stackIn_108_0 = null;
        StringBuilder stackIn_108_1 = null;
        RuntimeException stackIn_110_0 = null;
        StringBuilder stackIn_110_1 = null;
        RuntimeException stackIn_111_0 = null;
        StringBuilder stackIn_111_1 = null;
        String stackIn_111_2 = null;
        RuntimeException stackIn_112_0 = null;
        StringBuilder stackIn_112_1 = null;
        RuntimeException stackIn_114_0 = null;
        StringBuilder stackIn_114_1 = null;
        RuntimeException stackIn_115_0 = null;
        StringBuilder stackIn_115_1 = null;
        String stackIn_115_2 = null;
        RuntimeException stackIn_116_0 = null;
        StringBuilder stackIn_116_1 = null;
        RuntimeException stackIn_118_0 = null;
        StringBuilder stackIn_118_1 = null;
        RuntimeException stackIn_119_0 = null;
        StringBuilder stackIn_119_1 = null;
        String stackIn_119_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_107_0 = null;
        StringBuilder stackOut_107_1 = null;
        RuntimeException stackOut_110_0 = null;
        StringBuilder stackOut_110_1 = null;
        String stackOut_110_2 = null;
        RuntimeException stackOut_108_0 = null;
        StringBuilder stackOut_108_1 = null;
        String stackOut_108_2 = null;
        RuntimeException stackOut_111_0 = null;
        StringBuilder stackOut_111_1 = null;
        RuntimeException stackOut_114_0 = null;
        StringBuilder stackOut_114_1 = null;
        String stackOut_114_2 = null;
        RuntimeException stackOut_112_0 = null;
        StringBuilder stackOut_112_1 = null;
        String stackOut_112_2 = null;
        RuntimeException stackOut_115_0 = null;
        StringBuilder stackOut_115_1 = null;
        RuntimeException stackOut_118_0 = null;
        StringBuilder stackOut_118_1 = null;
        String stackOut_118_2 = null;
        RuntimeException stackOut_116_0 = null;
        StringBuilder stackOut_116_1 = null;
        String stackOut_116_2 = null;
        var13 = VoidHunters.field_G;
        try {
          L0: {
            var5_int = 0;
            L1: while (true) {
              if (var5_int >= ((pe) this).field_k.length) {
                var5_int = 0;
                L2: while (true) {
                  if (var5_int >= ((pe) this).field_m.length) {
                    var5_array = ((pe) this).field_g;
                    var6_int = 0;
                    L3: while (true) {
                      if (var6_int >= var5_array.length) {
                        var5_array2 = param3;
                        var15 = 0;
                        var6_int = var15;
                        L4: while (true) {
                          if (var5_array2.length <= var15) {
                            L5: {
                              if (null == ((pe) this).field_j) {
                                break L5;
                              } else {
                                var5_int = 0;
                                L6: while (true) {
                                  if (((pe) this).field_j.length <= var5_int) {
                                    break L5;
                                  } else {
                                    L7: {
                                      var6_ref2 = ((pe) this).field_j[var5_int];
                                      if (var6_ref2.field_i > 0) {
                                        break L7;
                                      } else {
                                        break L7;
                                      }
                                    }
                                    var5_int++;
                                    continue L6;
                                  }
                                }
                              }
                            }
                            break L0;
                          } else {
                            L8: {
                              var7_ref = var5_array2[var15];
                              if (var7_ref == null) {
                                break L8;
                              } else {
                                break L8;
                              }
                            }
                            var15++;
                            continue L4;
                          }
                        }
                      } else {
                        L9: {
                          var7 = var5_array[var6_int];
                          if (null == var7) {
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        var6_int++;
                        continue L3;
                      }
                    }
                  } else {
                    L10: {
                      var6_ref = ((pe) this).field_m[var5_int];
                      if (var6_ref == null) {
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    var5_int++;
                    continue L2;
                  }
                }
              } else {
                L11: {
                  var6 = ((pe) this).field_k[var5_int];
                  if (var6 == null) {
                    break L11;
                  } else {
                    break L11;
                  }
                }
                var5_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var5 = decompiledCaughtException;
            stackOut_107_0 = (RuntimeException) var5;
            stackOut_107_1 = new StringBuilder().append("pe.BF(");
            stackIn_110_0 = stackOut_107_0;
            stackIn_110_1 = stackOut_107_1;
            stackIn_108_0 = stackOut_107_0;
            stackIn_108_1 = stackOut_107_1;
            if (param0 == null) {
              stackOut_110_0 = (RuntimeException) (Object) stackIn_110_0;
              stackOut_110_1 = (StringBuilder) (Object) stackIn_110_1;
              stackOut_110_2 = "null";
              stackIn_111_0 = stackOut_110_0;
              stackIn_111_1 = stackOut_110_1;
              stackIn_111_2 = stackOut_110_2;
              break L12;
            } else {
              stackOut_108_0 = (RuntimeException) (Object) stackIn_108_0;
              stackOut_108_1 = (StringBuilder) (Object) stackIn_108_1;
              stackOut_108_2 = "{...}";
              stackIn_111_0 = stackOut_108_0;
              stackIn_111_1 = stackOut_108_1;
              stackIn_111_2 = stackOut_108_2;
              break L12;
            }
          }
          L13: {
            stackOut_111_0 = (RuntimeException) (Object) stackIn_111_0;
            stackOut_111_1 = ((StringBuilder) (Object) stackIn_111_1).append(stackIn_111_2).append(44).append(7559).append(44);
            stackIn_114_0 = stackOut_111_0;
            stackIn_114_1 = stackOut_111_1;
            stackIn_112_0 = stackOut_111_0;
            stackIn_112_1 = stackOut_111_1;
            if (param2 == null) {
              stackOut_114_0 = (RuntimeException) (Object) stackIn_114_0;
              stackOut_114_1 = (StringBuilder) (Object) stackIn_114_1;
              stackOut_114_2 = "null";
              stackIn_115_0 = stackOut_114_0;
              stackIn_115_1 = stackOut_114_1;
              stackIn_115_2 = stackOut_114_2;
              break L13;
            } else {
              stackOut_112_0 = (RuntimeException) (Object) stackIn_112_0;
              stackOut_112_1 = (StringBuilder) (Object) stackIn_112_1;
              stackOut_112_2 = "{...}";
              stackIn_115_0 = stackOut_112_0;
              stackIn_115_1 = stackOut_112_1;
              stackIn_115_2 = stackOut_112_2;
              break L13;
            }
          }
          L14: {
            stackOut_115_0 = (RuntimeException) (Object) stackIn_115_0;
            stackOut_115_1 = ((StringBuilder) (Object) stackIn_115_1).append(stackIn_115_2).append(44);
            stackIn_118_0 = stackOut_115_0;
            stackIn_118_1 = stackOut_115_1;
            stackIn_116_0 = stackOut_115_0;
            stackIn_116_1 = stackOut_115_1;
            if (param3 == null) {
              stackOut_118_0 = (RuntimeException) (Object) stackIn_118_0;
              stackOut_118_1 = (StringBuilder) (Object) stackIn_118_1;
              stackOut_118_2 = "null";
              stackIn_119_0 = stackOut_118_0;
              stackIn_119_1 = stackOut_118_1;
              stackIn_119_2 = stackOut_118_2;
              break L14;
            } else {
              stackOut_116_0 = (RuntimeException) (Object) stackIn_116_0;
              stackOut_116_1 = (StringBuilder) (Object) stackIn_116_1;
              stackOut_116_2 = "{...}";
              stackIn_119_0 = stackOut_116_0;
              stackIn_119_1 = stackOut_116_1;
              stackIn_119_2 = stackOut_116_2;
              break L14;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_119_0, stackIn_119_2 + 41);
        }
    }

    private final void a(int param0, int param1, boolean param2, int param3, int param4, sg param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13_int = 0;
        rca var13 = null;
        rdb var14 = null;
        rca var14_ref = null;
        int var14_int = 0;
        int var15 = 0;
        sg[] var16_ref_sg__ = null;
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
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_60_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        String stackOut_59_2 = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        String stackOut_57_2 = null;
        var23 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var7_int = 0;
              var8 = 0;
              var9 = 0;
              var10 = ((pe) this).d(false);
              if (!qab.a(51, var10)) {
                L2: {
                  param3 = param1;
                  var11 = ((pe) this).field_o;
                  var12 = ((pe) this).field_r;
                  if (((pe) this).field_y != 13) {
                    break L2;
                  } else {
                    var11 = var11 / 2;
                    var12 = var12 / 2;
                    break L2;
                  }
                }
                var13 = ((pe) this).a(0, var12, 0, 0, param3, var11);
                var8 = var13.field_b;
                var7_int = var13.field_c;
                param5.a(hob.a(vg.field_o, 8192, 117), -29);
                break L1;
              } else {
                var11 = 0;
                var12 = 0;
                var13_int = 0;
                var14 = (rdb) (Object) ((pe) this).field_n.d(0);
                L3: while (true) {
                  if (null == var14) {
                    L4: {
                      if (var9 != 0) {
                        break L4;
                      } else {
                        if (var13_int != 0) {
                          var12 = var12 / var13_int;
                          var11 = var11 / var13_int;
                          var14_ref = ((pe) this).a(var12, ((pe) this).field_r, 0, var11, param3, ((pe) this).field_o / 4);
                          var8 = var14_ref.field_b;
                          var7_int = var14_ref.field_c;
                          break L4;
                        } else {
                          L5: {
                            var14_int = ((pe) this).field_o / param4;
                            var15 = ((pe) this).field_r / param4;
                            if (0 > param3) {
                              break L5;
                            } else {
                              if (2 <= param3) {
                                break L5;
                              } else {
                                var16 = -200000 + param3 * 400000;
                                var17 = ((pe) this).field_o * 2 / 3 * param3;
                                var7_int = var17 + -((pe) this).field_o / 3;
                                var8 = ((pe) this).field_r / 3 + -(param3 * (((pe) this).field_r * 2 / 3));
                                if (((pe) this).field_y != -1) {
                                  var8 = var8 + (-var16 + 20000 * param1);
                                  break L4;
                                } else {
                                  break L4;
                                }
                              }
                            }
                          }
                          var8 = var15 / 2 + -((pe) this).field_r / 2 - -(var15 * param1);
                          var7_int = -((pe) this).field_o / 2 + (var14_int * param1 + var14_int / 2);
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
                      if (param3 != var14.d(-92)) {
                        break L6;
                      } else {
                        var13_int++;
                        var11 = var11 + var14.a(true);
                        var12 = var12 + var14.a(94);
                        var15 = 1;
                        var16_ref_sg__ = ((pe) this).field_k;
                        var17 = 0;
                        L7: while (true) {
                          L8: {
                            if (var16_ref_sg__.length <= var17) {
                              break L8;
                            } else {
                              L9: {
                                var18_ref_sg = var16_ref_sg__[var17];
                                if (var18_ref_sg != null) {
                                  L10: {
                                    var19_int = var14.a(true) - var18_ref_sg.field_d;
                                    var20 = var14.a(74) + -var18_ref_sg.field_e;
                                    var21 = ar.a(var19_int, (byte) 126, var20);
                                    var22 = var18_ref_sg.b(true) - -51200;
                                    if (param3 == var18_ref_sg.q((byte) 93)) {
                                      break L10;
                                    } else {
                                      if (param2) {
                                        break L10;
                                      } else {
                                        var22 = var22 + (ema.field_o[7].j(121) << 3);
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
                            var16_ref_crb__ = ((pe) this).field_e.c(0);
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
                                      var20 = var14.a(true) + -var19.field_d;
                                      var21 = var14.a(113) + -var19.field_e;
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
                                var7_int = var14.a(true);
                                var9 = 1;
                                var8 = var14.a(102);
                                break L6;
                              }
                            }
                          } else {
                            L14: {
                              if (var15 == 0) {
                                break L14;
                              } else {
                                var7_int = var14.a(true);
                                var9 = 1;
                                var8 = var14.a(102);
                                break L14;
                              }
                            }
                            var14 = (rdb) (Object) ((pe) this).field_n.a((byte) 11);
                            continue L3;
                          }
                        }
                      }
                    }
                    var14 = (rdb) (Object) ((pe) this).field_n.a((byte) 11);
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
            param5.g(param1, 125);
            param5.h(17704, param3);
            ((pe) this).a(param5, (byte) 98);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var7 = decompiledCaughtException;
            stackOut_56_0 = (RuntimeException) var7;
            stackOut_56_1 = new StringBuilder().append("pe.ID(").append(-200000).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44);
            stackIn_59_0 = stackOut_56_0;
            stackIn_59_1 = stackOut_56_1;
            stackIn_57_0 = stackOut_56_0;
            stackIn_57_1 = stackOut_56_1;
            if (param5 == null) {
              stackOut_59_0 = (RuntimeException) (Object) stackIn_59_0;
              stackOut_59_1 = (StringBuilder) (Object) stackIn_59_1;
              stackOut_59_2 = "null";
              stackIn_60_0 = stackOut_59_0;
              stackIn_60_1 = stackOut_59_1;
              stackIn_60_2 = stackOut_59_2;
              break L15;
            } else {
              stackOut_57_0 = (RuntimeException) (Object) stackIn_57_0;
              stackOut_57_1 = (StringBuilder) (Object) stackIn_57_1;
              stackOut_57_2 = "{...}";
              stackIn_60_0 = stackOut_57_0;
              stackIn_60_1 = stackOut_57_1;
              stackIn_60_2 = stackOut_57_2;
              break L15;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_60_0, stackIn_60_2 + 41);
        }
    }

    public final void a(faa param0, byte param1) {
        RuntimeException var3 = null;
        faa var3_ref = null;
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
        nbb[] var6_array2 = null;
        mqb[] var6_array3 = null;
        cq[] var6_array4 = null;
        rba[] var6_array5 = null;
        it[] var6_array6 = null;
        int var7 = 0;
        sg var8 = null;
        tv var8_ref = null;
        nbb var8_ref2 = null;
        mqb var8_ref3 = null;
        cq var8_ref4 = null;
        rba var8_ref5 = null;
        it var8_ref6 = null;
        int var9 = 0;
        int stackIn_5_0 = 0;
        faa stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        faa stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        faa stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        int stackIn_23_0 = 0;
        faa stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        faa stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        faa stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        int stackIn_32_2 = 0;
        int stackIn_41_0 = 0;
        faa stackIn_47_0 = null;
        int stackIn_47_1 = 0;
        faa stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        faa stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        int stackIn_50_2 = 0;
        faa stackIn_56_0 = null;
        int stackIn_56_1 = 0;
        faa stackIn_58_0 = null;
        int stackIn_58_1 = 0;
        faa stackIn_59_0 = null;
        int stackIn_59_1 = 0;
        int stackIn_59_2 = 0;
        int stackIn_67_0 = 0;
        faa stackIn_71_0 = null;
        int stackIn_71_1 = 0;
        faa stackIn_73_0 = null;
        int stackIn_73_1 = 0;
        faa stackIn_74_0 = null;
        int stackIn_74_1 = 0;
        int stackIn_74_2 = 0;
        int stackIn_83_0 = 0;
        faa stackIn_87_0 = null;
        int stackIn_87_1 = 0;
        faa stackIn_89_0 = null;
        int stackIn_89_1 = 0;
        faa stackIn_90_0 = null;
        int stackIn_90_1 = 0;
        int stackIn_90_2 = 0;
        int stackIn_96_0 = 0;
        int stackIn_98_0 = 0;
        int stackIn_99_0 = 0;
        int stackIn_99_1 = 0;
        faa stackIn_100_0 = null;
        int stackIn_100_1 = 0;
        faa stackIn_102_0 = null;
        int stackIn_102_1 = 0;
        faa stackIn_103_0 = null;
        int stackIn_103_1 = 0;
        int stackIn_103_2 = 0;
        int stackIn_109_0 = 0;
        faa stackIn_115_0 = null;
        int stackIn_115_1 = 0;
        faa stackIn_117_0 = null;
        int stackIn_117_1 = 0;
        faa stackIn_118_0 = null;
        int stackIn_118_1 = 0;
        int stackIn_118_2 = 0;
        int stackIn_127_0 = 0;
        faa stackIn_133_0 = null;
        int stackIn_133_1 = 0;
        faa stackIn_135_0 = null;
        int stackIn_135_1 = 0;
        faa stackIn_136_0 = null;
        int stackIn_136_1 = 0;
        int stackIn_136_2 = 0;
        faa stackIn_142_0 = null;
        int stackIn_142_1 = 0;
        faa stackIn_144_0 = null;
        int stackIn_144_1 = 0;
        faa stackIn_145_0 = null;
        int stackIn_145_1 = 0;
        int stackIn_145_2 = 0;
        faa stackIn_148_0 = null;
        int stackIn_148_1 = 0;
        faa stackIn_150_0 = null;
        int stackIn_150_1 = 0;
        faa stackIn_151_0 = null;
        int stackIn_151_1 = 0;
        int stackIn_151_2 = 0;
        int stackIn_159_0 = 0;
        faa stackIn_165_0 = null;
        int stackIn_165_1 = 0;
        faa stackIn_167_0 = null;
        int stackIn_167_1 = 0;
        faa stackIn_168_0 = null;
        int stackIn_168_1 = 0;
        int stackIn_168_2 = 0;
        faa stackIn_174_0 = null;
        int stackIn_174_1 = 0;
        faa stackIn_176_0 = null;
        int stackIn_176_1 = 0;
        faa stackIn_177_0 = null;
        int stackIn_177_1 = 0;
        int stackIn_177_2 = 0;
        RuntimeException stackIn_183_0 = null;
        StringBuilder stackIn_183_1 = null;
        RuntimeException stackIn_185_0 = null;
        StringBuilder stackIn_185_1 = null;
        RuntimeException stackIn_186_0 = null;
        StringBuilder stackIn_186_1 = null;
        String stackIn_186_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_2_0 = 0;
        faa stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        faa stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        faa stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        int stackOut_22_0 = 0;
        int stackOut_20_0 = 0;
        faa stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        faa stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        int stackOut_31_2 = 0;
        faa stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        int stackOut_29_2 = 0;
        int stackOut_40_0 = 0;
        int stackOut_38_0 = 0;
        faa stackOut_46_0 = null;
        int stackOut_46_1 = 0;
        faa stackOut_49_0 = null;
        int stackOut_49_1 = 0;
        int stackOut_49_2 = 0;
        faa stackOut_47_0 = null;
        int stackOut_47_1 = 0;
        int stackOut_47_2 = 0;
        faa stackOut_55_0 = null;
        int stackOut_55_1 = 0;
        faa stackOut_58_0 = null;
        int stackOut_58_1 = 0;
        int stackOut_58_2 = 0;
        faa stackOut_56_0 = null;
        int stackOut_56_1 = 0;
        int stackOut_56_2 = 0;
        int stackOut_66_0 = 0;
        int stackOut_64_0 = 0;
        faa stackOut_70_0 = null;
        int stackOut_70_1 = 0;
        faa stackOut_73_0 = null;
        int stackOut_73_1 = 0;
        int stackOut_73_2 = 0;
        faa stackOut_71_0 = null;
        int stackOut_71_1 = 0;
        int stackOut_71_2 = 0;
        int stackOut_82_0 = 0;
        int stackOut_80_0 = 0;
        faa stackOut_86_0 = null;
        int stackOut_86_1 = 0;
        faa stackOut_89_0 = null;
        int stackOut_89_1 = 0;
        int stackOut_89_2 = 0;
        faa stackOut_87_0 = null;
        int stackOut_87_1 = 0;
        int stackOut_87_2 = 0;
        int stackOut_95_0 = 0;
        int stackOut_98_0 = 0;
        int stackOut_98_1 = 0;
        int stackOut_96_0 = 0;
        int stackOut_96_1 = 0;
        faa stackOut_99_0 = null;
        int stackOut_99_1 = 0;
        faa stackOut_102_0 = null;
        int stackOut_102_1 = 0;
        int stackOut_102_2 = 0;
        faa stackOut_100_0 = null;
        int stackOut_100_1 = 0;
        int stackOut_100_2 = 0;
        int stackOut_108_0 = 0;
        int stackOut_106_0 = 0;
        faa stackOut_114_0 = null;
        int stackOut_114_1 = 0;
        faa stackOut_117_0 = null;
        int stackOut_117_1 = 0;
        int stackOut_117_2 = 0;
        faa stackOut_115_0 = null;
        int stackOut_115_1 = 0;
        int stackOut_115_2 = 0;
        int stackOut_126_0 = 0;
        int stackOut_124_0 = 0;
        faa stackOut_132_0 = null;
        int stackOut_132_1 = 0;
        faa stackOut_135_0 = null;
        int stackOut_135_1 = 0;
        int stackOut_135_2 = 0;
        faa stackOut_133_0 = null;
        int stackOut_133_1 = 0;
        int stackOut_133_2 = 0;
        faa stackOut_141_0 = null;
        int stackOut_141_1 = 0;
        faa stackOut_144_0 = null;
        int stackOut_144_1 = 0;
        int stackOut_144_2 = 0;
        faa stackOut_142_0 = null;
        int stackOut_142_1 = 0;
        int stackOut_142_2 = 0;
        faa stackOut_147_0 = null;
        int stackOut_147_1 = 0;
        faa stackOut_150_0 = null;
        int stackOut_150_1 = 0;
        int stackOut_150_2 = 0;
        faa stackOut_148_0 = null;
        int stackOut_148_1 = 0;
        int stackOut_148_2 = 0;
        int stackOut_158_0 = 0;
        int stackOut_156_0 = 0;
        faa stackOut_164_0 = null;
        int stackOut_164_1 = 0;
        faa stackOut_167_0 = null;
        int stackOut_167_1 = 0;
        int stackOut_167_2 = 0;
        faa stackOut_165_0 = null;
        int stackOut_165_1 = 0;
        int stackOut_165_2 = 0;
        faa stackOut_173_0 = null;
        int stackOut_173_1 = 0;
        faa stackOut_176_0 = null;
        int stackOut_176_1 = 0;
        int stackOut_176_2 = 0;
        faa stackOut_174_0 = null;
        int stackOut_174_1 = 0;
        int stackOut_174_2 = 0;
        RuntimeException stackOut_182_0 = null;
        StringBuilder stackOut_182_1 = null;
        RuntimeException stackOut_185_0 = null;
        StringBuilder stackOut_185_1 = null;
        String stackOut_185_2 = null;
        RuntimeException stackOut_183_0 = null;
        StringBuilder stackOut_183_1 = null;
        String stackOut_183_2 = null;
        var9 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var3_ref = param0;
              var4 = ((pe) this).field_k;
              if (null == var4) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_2_0 = var4.length;
                stackIn_5_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var5 = stackIn_5_0;
              var3_ref.a(-632, var5, 8);
              if (0 != var5) {
                var6 = var4;
                var7 = 0;
                L3: while (true) {
                  if (var6.length <= var7) {
                    break L2;
                  } else {
                    L4: {
                      var8 = var6[var7];
                      stackOut_10_0 = (faa) var3_ref;
                      stackOut_10_1 = 110;
                      stackIn_13_0 = stackOut_10_0;
                      stackIn_13_1 = stackOut_10_1;
                      stackIn_11_0 = stackOut_10_0;
                      stackIn_11_1 = stackOut_10_1;
                      if (null == var8) {
                        stackOut_13_0 = (faa) (Object) stackIn_13_0;
                        stackOut_13_1 = stackIn_13_1;
                        stackOut_13_2 = 0;
                        stackIn_14_0 = stackOut_13_0;
                        stackIn_14_1 = stackOut_13_1;
                        stackIn_14_2 = stackOut_13_2;
                        break L4;
                      } else {
                        stackOut_11_0 = (faa) (Object) stackIn_11_0;
                        stackOut_11_1 = stackIn_11_1;
                        stackOut_11_2 = 1;
                        stackIn_14_0 = stackOut_11_0;
                        stackIn_14_1 = stackOut_11_1;
                        stackIn_14_2 = stackOut_11_2;
                        break L4;
                      }
                    }
                    L5: {
                      if (vq.a(stackIn_14_0, stackIn_14_1, stackIn_14_2 == 0)) {
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
              var3_ref = param0;
              int discarded$4 = 210377952;
              var4_array = hob.a(((pe) this).field_x);
              if (null == var4_array) {
                stackOut_22_0 = 0;
                stackIn_23_0 = stackOut_22_0;
                break L6;
              } else {
                stackOut_20_0 = var4_array.length;
                stackIn_23_0 = stackOut_20_0;
                break L6;
              }
            }
            L7: {
              var5 = stackIn_23_0;
              var3_ref.a(-632, var5, 10);
              if (var5 != 0) {
                var6_array = var4_array;
                var7 = 0;
                L8: while (true) {
                  if (var6_array.length <= var7) {
                    break L7;
                  } else {
                    L9: {
                      var8_ref = var6_array[var7];
                      stackOut_28_0 = (faa) var3_ref;
                      stackOut_28_1 = -69;
                      stackIn_31_0 = stackOut_28_0;
                      stackIn_31_1 = stackOut_28_1;
                      stackIn_29_0 = stackOut_28_0;
                      stackIn_29_1 = stackOut_28_1;
                      if (var8_ref == null) {
                        stackOut_31_0 = (faa) (Object) stackIn_31_0;
                        stackOut_31_1 = stackIn_31_1;
                        stackOut_31_2 = 0;
                        stackIn_32_0 = stackOut_31_0;
                        stackIn_32_1 = stackOut_31_1;
                        stackIn_32_2 = stackOut_31_2;
                        break L9;
                      } else {
                        stackOut_29_0 = (faa) (Object) stackIn_29_0;
                        stackOut_29_1 = stackIn_29_1;
                        stackOut_29_2 = 1;
                        stackIn_32_0 = stackOut_29_0;
                        stackIn_32_1 = stackOut_29_1;
                        stackIn_32_2 = stackOut_29_2;
                        break L9;
                      }
                    }
                    L10: {
                      if (vq.a(stackIn_32_0, stackIn_32_1, stackIn_32_2 == 0)) {
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    var7++;
                    continue L8;
                  }
                }
              } else {
                break L7;
              }
            }
            L11: {
              var3_ref = param0;
              var4_array2 = ((pe) this).field_m;
              if (var4_array2 == null) {
                stackOut_40_0 = 0;
                stackIn_41_0 = stackOut_40_0;
                break L11;
              } else {
                stackOut_38_0 = var4_array2.length;
                stackIn_41_0 = stackOut_38_0;
                break L11;
              }
            }
            L12: {
              var5 = stackIn_41_0;
              var3_ref.a(-632, var5, 10);
              if (var5 != 0) {
                var6_array2 = var4_array2;
                var7 = 0;
                L13: while (true) {
                  if (var7 >= var6_array2.length) {
                    break L12;
                  } else {
                    L14: {
                      var8_ref2 = var6_array2[var7];
                      stackOut_46_0 = (faa) var3_ref;
                      stackOut_46_1 = 101;
                      stackIn_49_0 = stackOut_46_0;
                      stackIn_49_1 = stackOut_46_1;
                      stackIn_47_0 = stackOut_46_0;
                      stackIn_47_1 = stackOut_46_1;
                      if (var8_ref2 == null) {
                        stackOut_49_0 = (faa) (Object) stackIn_49_0;
                        stackOut_49_1 = stackIn_49_1;
                        stackOut_49_2 = 0;
                        stackIn_50_0 = stackOut_49_0;
                        stackIn_50_1 = stackOut_49_1;
                        stackIn_50_2 = stackOut_49_2;
                        break L14;
                      } else {
                        stackOut_47_0 = (faa) (Object) stackIn_47_0;
                        stackOut_47_1 = stackIn_47_1;
                        stackOut_47_2 = 1;
                        stackIn_50_0 = stackOut_47_0;
                        stackIn_50_1 = stackOut_47_1;
                        stackIn_50_2 = stackOut_47_2;
                        break L14;
                      }
                    }
                    L15: {
                      if (vq.a(stackIn_50_0, stackIn_50_1, stackIn_50_2 != 0)) {
                        ((utb) (Object) var8_ref2).a(var3_ref, (byte) -127);
                        break L15;
                      } else {
                        break L15;
                      }
                    }
                    var7++;
                    continue L13;
                  }
                }
              } else {
                break L12;
              }
            }
            L16: {
              stackOut_55_0 = (faa) param0;
              stackOut_55_1 = 54;
              stackIn_58_0 = stackOut_55_0;
              stackIn_58_1 = stackOut_55_1;
              stackIn_56_0 = stackOut_55_0;
              stackIn_56_1 = stackOut_55_1;
              if (null == ((pe) this).field_e) {
                stackOut_58_0 = (faa) (Object) stackIn_58_0;
                stackOut_58_1 = stackIn_58_1;
                stackOut_58_2 = 0;
                stackIn_59_0 = stackOut_58_0;
                stackIn_59_1 = stackOut_58_1;
                stackIn_59_2 = stackOut_58_2;
                break L16;
              } else {
                stackOut_56_0 = (faa) (Object) stackIn_56_0;
                stackOut_56_1 = stackIn_56_1;
                stackOut_56_2 = 1;
                stackIn_59_0 = stackOut_56_0;
                stackIn_59_1 = stackOut_56_1;
                stackIn_59_2 = stackOut_56_2;
                break L16;
              }
            }
            L17: {
              if (vq.a(stackIn_59_0, stackIn_59_1, stackIn_59_2 != 0)) {
                ((pe) this).field_e.a(param0, (byte) -92);
                break L17;
              } else {
                break L17;
              }
            }
            L18: {
              var3_ref = param0;
              int discarded$5 = 210377952;
              var4_array = hob.a(((pe) this).field_n);
              if (null == var4_array) {
                stackOut_66_0 = 0;
                stackIn_67_0 = stackOut_66_0;
                break L18;
              } else {
                stackOut_64_0 = var4_array.length;
                stackIn_67_0 = stackOut_64_0;
                break L18;
              }
            }
            L19: {
              var5 = stackIn_67_0;
              var3_ref.a(-632, var5, 6);
              if (var5 == 0) {
                break L19;
              } else {
                var6_array = var4_array;
                var7 = 0;
                L20: while (true) {
                  if (var6_array.length <= var7) {
                    break L19;
                  } else {
                    L21: {
                      var8_ref = var6_array[var7];
                      stackOut_70_0 = (faa) var3_ref;
                      stackOut_70_1 = 66;
                      stackIn_73_0 = stackOut_70_0;
                      stackIn_73_1 = stackOut_70_1;
                      stackIn_71_0 = stackOut_70_0;
                      stackIn_71_1 = stackOut_70_1;
                      if (var8_ref == null) {
                        stackOut_73_0 = (faa) (Object) stackIn_73_0;
                        stackOut_73_1 = stackIn_73_1;
                        stackOut_73_2 = 0;
                        stackIn_74_0 = stackOut_73_0;
                        stackIn_74_1 = stackOut_73_1;
                        stackIn_74_2 = stackOut_73_2;
                        break L21;
                      } else {
                        stackOut_71_0 = (faa) (Object) stackIn_71_0;
                        stackOut_71_1 = stackIn_71_1;
                        stackOut_71_2 = 1;
                        stackIn_74_0 = stackOut_71_0;
                        stackIn_74_1 = stackOut_71_1;
                        stackIn_74_2 = stackOut_71_2;
                        break L21;
                      }
                    }
                    L22: {
                      if (vq.a(stackIn_74_0, stackIn_74_1, stackIn_74_2 != 0)) {
                        stb.a(2, 1, var3_ref, var8_ref);
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
              var3_ref = param0;
              var4_array3 = ((pe) this).field_g;
              if (var4_array3 == null) {
                stackOut_82_0 = 0;
                stackIn_83_0 = stackOut_82_0;
                break L23;
              } else {
                stackOut_80_0 = var4_array3.length;
                stackIn_83_0 = stackOut_80_0;
                break L23;
              }
            }
            L24: {
              var5 = stackIn_83_0;
              var3_ref.a(-632, var5, 8);
              if (0 == var5) {
                break L24;
              } else {
                var6_array3 = var4_array3;
                var7 = 0;
                L25: while (true) {
                  if (var7 >= var6_array3.length) {
                    break L24;
                  } else {
                    L26: {
                      var8_ref3 = var6_array3[var7];
                      stackOut_86_0 = (faa) var3_ref;
                      stackOut_86_1 = 74;
                      stackIn_89_0 = stackOut_86_0;
                      stackIn_89_1 = stackOut_86_1;
                      stackIn_87_0 = stackOut_86_0;
                      stackIn_87_1 = stackOut_86_1;
                      if (var8_ref3 == null) {
                        stackOut_89_0 = (faa) (Object) stackIn_89_0;
                        stackOut_89_1 = stackIn_89_1;
                        stackOut_89_2 = 0;
                        stackIn_90_0 = stackOut_89_0;
                        stackIn_90_1 = stackOut_89_1;
                        stackIn_90_2 = stackOut_89_2;
                        break L26;
                      } else {
                        stackOut_87_0 = (faa) (Object) stackIn_87_0;
                        stackOut_87_1 = stackIn_87_1;
                        stackOut_87_2 = 1;
                        stackIn_90_0 = stackOut_87_0;
                        stackIn_90_1 = stackOut_87_1;
                        stackIn_90_2 = stackOut_87_2;
                        break L26;
                      }
                    }
                    L27: {
                      if (vq.a(stackIn_90_0, stackIn_90_1, stackIn_90_2 != 0)) {
                        ((utb) (Object) var8_ref3).a(var3_ref, (byte) -98);
                        break L27;
                      } else {
                        break L27;
                      }
                    }
                    var7++;
                    continue L25;
                  }
                }
              }
            }
            L28: {
              stackOut_95_0 = 4;
              stackIn_98_0 = stackOut_95_0;
              stackIn_96_0 = stackOut_95_0;
              if (((pe) this).field_l == null) {
                stackOut_98_0 = stackIn_98_0;
                stackOut_98_1 = 0;
                stackIn_99_0 = stackOut_98_0;
                stackIn_99_1 = stackOut_98_1;
                break L28;
              } else {
                stackOut_96_0 = stackIn_96_0;
                stackOut_96_1 = ((pe) this).field_l.length;
                stackIn_99_0 = stackOut_96_0;
                stackIn_99_1 = stackOut_96_1;
                break L28;
              }
            }
            L29: {
              pgb.a(stackIn_99_0, stackIn_99_1, -114, param0, ((pe) this).field_l);
              boolean discarded$6 = vq.a(param0, 56, ((pe) this).field_v);
              param0.a(-632, ((pe) this).field_y, 32);
              boolean discarded$7 = vq.a(param0, 39, ((pe) this).field_i);
              stackOut_99_0 = (faa) param0;
              stackOut_99_1 = 122;
              stackIn_102_0 = stackOut_99_0;
              stackIn_102_1 = stackOut_99_1;
              stackIn_100_0 = stackOut_99_0;
              stackIn_100_1 = stackOut_99_1;
              if (null == ((pe) this).field_f) {
                stackOut_102_0 = (faa) (Object) stackIn_102_0;
                stackOut_102_1 = stackIn_102_1;
                stackOut_102_2 = 0;
                stackIn_103_0 = stackOut_102_0;
                stackIn_103_1 = stackOut_102_1;
                stackIn_103_2 = stackOut_102_2;
                break L29;
              } else {
                stackOut_100_0 = (faa) (Object) stackIn_100_0;
                stackOut_100_1 = stackIn_100_1;
                stackOut_100_2 = 1;
                stackIn_103_0 = stackOut_100_0;
                stackIn_103_1 = stackOut_100_1;
                stackIn_103_2 = stackOut_100_2;
                break L29;
              }
            }
            L30: {
              if (vq.a(stackIn_103_0, stackIn_103_1, stackIn_103_2 == 0)) {
                break L30;
              } else {
                ((pe) this).field_f.b(param0, -123);
                break L30;
              }
            }
            L31: {
              var3_ref = param0;
              var4_array4 = ((pe) this).field_t;
              if (var4_array4 != null) {
                stackOut_108_0 = var4_array4.length;
                stackIn_109_0 = stackOut_108_0;
                break L31;
              } else {
                stackOut_106_0 = 0;
                stackIn_109_0 = stackOut_106_0;
                break L31;
              }
            }
            L32: {
              var5 = stackIn_109_0;
              var3_ref.a(-632, var5, 8);
              if (0 != var5) {
                var6_array4 = var4_array4;
                var7 = 0;
                L33: while (true) {
                  if (var7 >= var6_array4.length) {
                    break L32;
                  } else {
                    L34: {
                      var8_ref4 = var6_array4[var7];
                      stackOut_114_0 = (faa) var3_ref;
                      stackOut_114_1 = 47;
                      stackIn_117_0 = stackOut_114_0;
                      stackIn_117_1 = stackOut_114_1;
                      stackIn_115_0 = stackOut_114_0;
                      stackIn_115_1 = stackOut_114_1;
                      if (null == var8_ref4) {
                        stackOut_117_0 = (faa) (Object) stackIn_117_0;
                        stackOut_117_1 = stackIn_117_1;
                        stackOut_117_2 = 0;
                        stackIn_118_0 = stackOut_117_0;
                        stackIn_118_1 = stackOut_117_1;
                        stackIn_118_2 = stackOut_117_2;
                        break L34;
                      } else {
                        stackOut_115_0 = (faa) (Object) stackIn_115_0;
                        stackOut_115_1 = stackIn_115_1;
                        stackOut_115_2 = 1;
                        stackIn_118_0 = stackOut_115_0;
                        stackIn_118_1 = stackOut_115_1;
                        stackIn_118_2 = stackOut_115_2;
                        break L34;
                      }
                    }
                    L35: {
                      if (vq.a(stackIn_118_0, stackIn_118_1, stackIn_118_2 != 0)) {
                        stb.a(2, 1, var3_ref, (tv) (Object) var8_ref4);
                        break L35;
                      } else {
                        break L35;
                      }
                    }
                    var7++;
                    continue L33;
                  }
                }
              } else {
                break L32;
              }
            }
            L36: {
              var3_ref = param0;
              var4_array5 = ((pe) this).field_a;
              if (null != var4_array5) {
                stackOut_126_0 = var4_array5.length;
                stackIn_127_0 = stackOut_126_0;
                break L36;
              } else {
                stackOut_124_0 = 0;
                stackIn_127_0 = stackOut_124_0;
                break L36;
              }
            }
            L37: {
              var5 = stackIn_127_0;
              var3_ref.a(-632, var5, 4);
              if (var5 != 0) {
                var6_array5 = var4_array5;
                var7 = 0;
                L38: while (true) {
                  if (var6_array5.length <= var7) {
                    break L37;
                  } else {
                    L39: {
                      var8_ref5 = var6_array5[var7];
                      stackOut_132_0 = (faa) var3_ref;
                      stackOut_132_1 = 89;
                      stackIn_135_0 = stackOut_132_0;
                      stackIn_135_1 = stackOut_132_1;
                      stackIn_133_0 = stackOut_132_0;
                      stackIn_133_1 = stackOut_132_1;
                      if (null == var8_ref5) {
                        stackOut_135_0 = (faa) (Object) stackIn_135_0;
                        stackOut_135_1 = stackIn_135_1;
                        stackOut_135_2 = 0;
                        stackIn_136_0 = stackOut_135_0;
                        stackIn_136_1 = stackOut_135_1;
                        stackIn_136_2 = stackOut_135_2;
                        break L39;
                      } else {
                        stackOut_133_0 = (faa) (Object) stackIn_133_0;
                        stackOut_133_1 = stackIn_133_1;
                        stackOut_133_2 = 1;
                        stackIn_136_0 = stackOut_133_0;
                        stackIn_136_1 = stackOut_133_1;
                        stackIn_136_2 = stackOut_133_2;
                        break L39;
                      }
                    }
                    L40: {
                      if (vq.a(stackIn_136_0, stackIn_136_1, stackIn_136_2 != 0)) {
                        stb.a(2, 1, var3_ref, (tv) (Object) var8_ref5);
                        break L40;
                      } else {
                        break L40;
                      }
                    }
                    var7++;
                    continue L38;
                  }
                }
              } else {
                break L37;
              }
            }
            L41: {
              stackOut_141_0 = (faa) param0;
              stackOut_141_1 = -94;
              stackIn_144_0 = stackOut_141_0;
              stackIn_144_1 = stackOut_141_1;
              stackIn_142_0 = stackOut_141_0;
              stackIn_142_1 = stackOut_141_1;
              if (null == ((pe) this).field_p) {
                stackOut_144_0 = (faa) (Object) stackIn_144_0;
                stackOut_144_1 = stackIn_144_1;
                stackOut_144_2 = 0;
                stackIn_145_0 = stackOut_144_0;
                stackIn_145_1 = stackOut_144_1;
                stackIn_145_2 = stackOut_144_2;
                break L41;
              } else {
                stackOut_142_0 = (faa) (Object) stackIn_142_0;
                stackOut_142_1 = stackIn_142_1;
                stackOut_142_2 = 1;
                stackIn_145_0 = stackOut_142_0;
                stackIn_145_1 = stackOut_142_1;
                stackIn_145_2 = stackOut_142_2;
                break L41;
              }
            }
            L42: {
              if (vq.a(stackIn_145_0, stackIn_145_1, stackIn_145_2 == 0)) {
                break L42;
              } else {
                ((pe) this).field_p.b(param0, -117);
                break L42;
              }
            }
            L43: {
              param0.a(-632, ((pe) this).field_o, 28);
              param0.a(-632, ((pe) this).field_r, 28);
              stackOut_147_0 = (faa) param0;
              stackOut_147_1 = 109;
              stackIn_150_0 = stackOut_147_0;
              stackIn_150_1 = stackOut_147_1;
              stackIn_148_0 = stackOut_147_0;
              stackIn_148_1 = stackOut_147_1;
              if (null == ((pe) this).field_u) {
                stackOut_150_0 = (faa) (Object) stackIn_150_0;
                stackOut_150_1 = stackIn_150_1;
                stackOut_150_2 = 0;
                stackIn_151_0 = stackOut_150_0;
                stackIn_151_1 = stackOut_150_1;
                stackIn_151_2 = stackOut_150_2;
                break L43;
              } else {
                stackOut_148_0 = (faa) (Object) stackIn_148_0;
                stackOut_148_1 = stackIn_148_1;
                stackOut_148_2 = 1;
                stackIn_151_0 = stackOut_148_0;
                stackIn_151_1 = stackOut_148_1;
                stackIn_151_2 = stackOut_148_2;
                break L43;
              }
            }
            L44: {
              if (vq.a(stackIn_151_0, stackIn_151_1, stackIn_151_2 == 0)) {
                break L44;
              } else {
                ((pe) this).field_u.b(param0, -125);
                break L44;
              }
            }
            L45: {
              if (param1 <= -91) {
                break L45;
              } else {
                field_d = null;
                break L45;
              }
            }
            L46: {
              var3_ref = param0;
              var4_array6 = ((pe) this).field_j;
              if (null == var4_array6) {
                stackOut_158_0 = 0;
                stackIn_159_0 = stackOut_158_0;
                break L46;
              } else {
                stackOut_156_0 = var4_array6.length;
                stackIn_159_0 = stackOut_156_0;
                break L46;
              }
            }
            L47: {
              var5 = stackIn_159_0;
              var3_ref.a(-632, var5, 4);
              if (var5 != 0) {
                var6_array6 = var4_array6;
                var7 = 0;
                L48: while (true) {
                  if (var6_array6.length <= var7) {
                    break L47;
                  } else {
                    L49: {
                      var8_ref6 = var6_array6[var7];
                      stackOut_164_0 = (faa) var3_ref;
                      stackOut_164_1 = -59;
                      stackIn_167_0 = stackOut_164_0;
                      stackIn_167_1 = stackOut_164_1;
                      stackIn_165_0 = stackOut_164_0;
                      stackIn_165_1 = stackOut_164_1;
                      if (var8_ref6 == null) {
                        stackOut_167_0 = (faa) (Object) stackIn_167_0;
                        stackOut_167_1 = stackIn_167_1;
                        stackOut_167_2 = 0;
                        stackIn_168_0 = stackOut_167_0;
                        stackIn_168_1 = stackOut_167_1;
                        stackIn_168_2 = stackOut_167_2;
                        break L49;
                      } else {
                        stackOut_165_0 = (faa) (Object) stackIn_165_0;
                        stackOut_165_1 = stackIn_165_1;
                        stackOut_165_2 = 1;
                        stackIn_168_0 = stackOut_165_0;
                        stackIn_168_1 = stackOut_165_1;
                        stackIn_168_2 = stackOut_165_2;
                        break L49;
                      }
                    }
                    L50: {
                      if (vq.a(stackIn_168_0, stackIn_168_1, stackIn_168_2 != 0)) {
                        stb.a(2, 1, var3_ref, (tv) (Object) var8_ref6);
                        break L50;
                      } else {
                        break L50;
                      }
                    }
                    var7++;
                    continue L48;
                  }
                }
              } else {
                break L47;
              }
            }
            L51: {
              stackOut_173_0 = (faa) param0;
              stackOut_173_1 = 38;
              stackIn_176_0 = stackOut_173_0;
              stackIn_176_1 = stackOut_173_1;
              stackIn_174_0 = stackOut_173_0;
              stackIn_174_1 = stackOut_173_1;
              if (null == ((pe) this).field_b) {
                stackOut_176_0 = (faa) (Object) stackIn_176_0;
                stackOut_176_1 = stackIn_176_1;
                stackOut_176_2 = 0;
                stackIn_177_0 = stackOut_176_0;
                stackIn_177_1 = stackOut_176_1;
                stackIn_177_2 = stackOut_176_2;
                break L51;
              } else {
                stackOut_174_0 = (faa) (Object) stackIn_174_0;
                stackOut_174_1 = stackIn_174_1;
                stackOut_174_2 = 1;
                stackIn_177_0 = stackOut_174_0;
                stackIn_177_1 = stackOut_174_1;
                stackIn_177_2 = stackOut_174_2;
                break L51;
              }
            }
            L52: {
              if (vq.a(stackIn_177_0, stackIn_177_1, stackIn_177_2 != 0)) {
                ((pe) this).field_b.b(param0, -113);
                break L52;
              } else {
                break L52;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L53: {
            var3 = decompiledCaughtException;
            stackOut_182_0 = (RuntimeException) var3;
            stackOut_182_1 = new StringBuilder().append("pe.E(");
            stackIn_185_0 = stackOut_182_0;
            stackIn_185_1 = stackOut_182_1;
            stackIn_183_0 = stackOut_182_0;
            stackIn_183_1 = stackOut_182_1;
            if (param0 == null) {
              stackOut_185_0 = (RuntimeException) (Object) stackIn_185_0;
              stackOut_185_1 = (StringBuilder) (Object) stackIn_185_1;
              stackOut_185_2 = "null";
              stackIn_186_0 = stackOut_185_0;
              stackIn_186_1 = stackOut_185_1;
              stackIn_186_2 = stackOut_185_2;
              break L53;
            } else {
              stackOut_183_0 = (RuntimeException) (Object) stackIn_183_0;
              stackOut_183_1 = (StringBuilder) (Object) stackIn_183_1;
              stackOut_183_2 = "{...}";
              stackIn_186_0 = stackOut_183_0;
              stackIn_186_1 = stackOut_183_1;
              stackIn_186_2 = stackOut_183_2;
              break L53;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_186_0, stackIn_186_2 + 44 + param1 + 41);
        }
    }

    final sg d(int param0, int param1) {
        sg[] var3 = null;
        int var4 = 0;
        sg var5 = null;
        int var6 = 0;
        sg[] var7 = null;
        var6 = VoidHunters.field_G;
        var7 = ((pe) this).field_k;
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
          return null;
        }
    }

    final int c(int param0, int param1) {
        if (param0 != -2003) {
            return 40;
        }
        if (param1 >= 0) {
            if (((pe) this).field_l.length <= param1) {
                return 0;
            }
            return oq.field_C + -((pe) this).field_l[param1];
        }
        return 0;
    }

    final int g(byte param0) {
        L0: {
          if (param0 == -122) {
            break L0;
          } else {
            field_d = null;
            break L0;
          }
        }
        return ((pe) this).field_o;
    }

    private final boolean a(int param0, ml param1, anb param2, byte param3, int param4, ml param5, anb param6, int param7, int param8) {
        RuntimeException var10 = null;
        ml var10_ref = null;
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
        int stackIn_18_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_33_0 = 0;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_50_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_32_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_29_0 = 0;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        var16 = null;
        var25 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param5.field_j == 28) {
                break L1;
              } else {
                if (param1.field_j == 28) {
                  break L1;
                } else {
                  return true;
                }
              }
            }
            var10_ref = param5;
            var11 = param1;
            var12 = param6;
            var13 = param2;
            var14 = param8;
            var15 = 0;
            L2: while (true) {
              if (2 <= var15) {
                stackOut_32_0 = 1;
                stackIn_33_0 = stackOut_32_0;
                break L0;
              } else {
                L3: {
                  if (var10_ref.k(0) != 28) {
                    break L3;
                  } else {
                    if (!(var12 instanceof mqb)) {
                      break L3;
                    } else {
                      if (var11.field_k == null) {
                        break L3;
                      } else {
                        if (var11.field_k.field_e == var12.field_l) {
                          L4: {
                            if (!((mqb) (Object) var12).k((byte) -76)) {
                              break L4;
                            } else {
                              ((pe) this).a(-104, var14, var12);
                              break L4;
                            }
                          }
                          stackOut_17_0 = 0;
                          stackIn_18_0 = stackOut_17_0;
                          return stackIn_18_0 != 0;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                L5: {
                  if (28 != var10_ref.k(0)) {
                    break L5;
                  } else {
                    if (!(var12 instanceof mqb)) {
                      break L5;
                    } else {
                      var26 = (mqb) (Object) var12;
                      if (var13.field_l == var26.p(32)) {
                        stackOut_24_0 = 1;
                        stackIn_25_0 = stackOut_24_0;
                        return stackIn_25_0 != 0;
                      } else {
                        L6: {
                          if (var26.l((byte) 13) != -1) {
                            break L6;
                          } else {
                            if (var26.k((byte) -16)) {
                              break L6;
                            } else {
                              var17 = var13;
                              var18 = (long)(var26.d(false) - var11.field_r);
                              var20 = (long)(var26.g((byte) 118) + -var11.field_n);
                              var22 = -var11.field_b;
                              var23 = (int)((long)fc.a(var22, (byte) 29) * var18 + -(var20 * (long)eu.a(var22, 39)) >> 16);
                              var24 = (int)((long)eu.a(var22, 58) * var18 + var20 * (long)fc.a(var22, (byte) 75) >> 16);
                              qba.a(20382, var26.d(false), 11, var26.g((byte) 124), 50);
                              var26.d(param7, var23, var24, 122, var17.field_l);
                              break L6;
                            }
                          }
                        }
                        stackOut_29_0 = 0;
                        stackIn_30_0 = stackOut_29_0;
                        return stackIn_30_0 != 0;
                      }
                    }
                  }
                }
                var10_ref = param1;
                var14 = param0;
                var13 = param6;
                var11 = param5;
                param7 = param4;
                var12 = param2;
                var15++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var10 = decompiledCaughtException;
            stackOut_34_0 = (RuntimeException) var10;
            stackOut_34_1 = new StringBuilder().append("pe.JF(").append(param0).append(44);
            stackIn_37_0 = stackOut_34_0;
            stackIn_37_1 = stackOut_34_1;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            if (param1 == null) {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L7;
            } else {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "{...}";
              stackIn_38_0 = stackOut_35_0;
              stackIn_38_1 = stackOut_35_1;
              stackIn_38_2 = stackOut_35_2;
              break L7;
            }
          }
          L8: {
            stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
            stackOut_38_1 = ((StringBuilder) (Object) stackIn_38_1).append(stackIn_38_2).append(44);
            stackIn_41_0 = stackOut_38_0;
            stackIn_41_1 = stackOut_38_1;
            stackIn_39_0 = stackOut_38_0;
            stackIn_39_1 = stackOut_38_1;
            if (param2 == null) {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "null";
              stackIn_42_0 = stackOut_41_0;
              stackIn_42_1 = stackOut_41_1;
              stackIn_42_2 = stackOut_41_2;
              break L8;
            } else {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "{...}";
              stackIn_42_0 = stackOut_39_0;
              stackIn_42_1 = stackOut_39_1;
              stackIn_42_2 = stackOut_39_2;
              break L8;
            }
          }
          L9: {
            stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
            stackOut_42_1 = ((StringBuilder) (Object) stackIn_42_1).append(stackIn_42_2).append(44).append(109).append(44).append(param4).append(44);
            stackIn_45_0 = stackOut_42_0;
            stackIn_45_1 = stackOut_42_1;
            stackIn_43_0 = stackOut_42_0;
            stackIn_43_1 = stackOut_42_1;
            if (param5 == null) {
              stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
              stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
              stackOut_45_2 = "null";
              stackIn_46_0 = stackOut_45_0;
              stackIn_46_1 = stackOut_45_1;
              stackIn_46_2 = stackOut_45_2;
              break L9;
            } else {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "{...}";
              stackIn_46_0 = stackOut_43_0;
              stackIn_46_1 = stackOut_43_1;
              stackIn_46_2 = stackOut_43_2;
              break L9;
            }
          }
          L10: {
            stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
            stackOut_46_1 = ((StringBuilder) (Object) stackIn_46_1).append(stackIn_46_2).append(44);
            stackIn_49_0 = stackOut_46_0;
            stackIn_49_1 = stackOut_46_1;
            stackIn_47_0 = stackOut_46_0;
            stackIn_47_1 = stackOut_46_1;
            if (param6 == null) {
              stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
              stackOut_49_1 = (StringBuilder) (Object) stackIn_49_1;
              stackOut_49_2 = "null";
              stackIn_50_0 = stackOut_49_0;
              stackIn_50_1 = stackOut_49_1;
              stackIn_50_2 = stackOut_49_2;
              break L10;
            } else {
              stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
              stackOut_47_1 = (StringBuilder) (Object) stackIn_47_1;
              stackOut_47_2 = "{...}";
              stackIn_50_0 = stackOut_47_0;
              stackIn_50_1 = stackOut_47_1;
              stackIn_50_2 = stackOut_47_2;
              break L10;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_50_0, stackIn_50_2 + 44 + param7 + 44 + param8 + 41);
        }
        return stackIn_33_0 != 0;
    }

    private final void a(sg param0, lta param1, int param2) {
        int[] var4 = null;
        RuntimeException var4_ref = null;
        int var5_int = 0;
        String var5 = null;
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
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        try {
          L0: {
            var15 = param0.f((byte) -44);
            var4 = var15;
            if (rna.a(var15, param1.field_f, 5)) {
              L1: {
                param0.a(param1, 122, (pe) this);
                if (param2 >= 50) {
                  break L1;
                } else {
                  boolean discarded$1 = this.a(-62, (ml) null, (imb) null, true, (byte) 99, (sg) null, (nbb) null);
                  break L1;
                }
              }
              L2: {
                if (pqa.a(32, 11284)) {
                  L3: {
                    var5 = "Team=" + param0.q((byte) 101) + ",owner=" + param0.o((byte) -117) + " ai=" + param0.l((byte) -10);
                    if (!param0.l((byte) -10)) {
                      break L3;
                    } else {
                      var5 = var5 + " parent=" + param0.k((byte) -108).a((byte) -125);
                      break L3;
                    }
                  }
                  var6 = param1.a(param0.d(false), (byte) 123);
                  var7 = param1.b(true, param0.g((byte) -54) + -16384);
                  cka.a(-1, var5, 16711935, var7, var6 + -(kga.a(115, var5) >> 1), 4266);
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
                    param0.k((byte) -108).a(param0, -11, param1, (pe) this);
                    break L4;
                  } else {
                    break L4;
                  }
                }
              }
              this.a((byte) 69, (anb) (Object) param0, param1);
              break L0;
            } else {
              if (!param0.b(1, (byte) -107)) {
                var5_int = -(int)param1.field_c + param0.field_d;
                var6 = -(int)param1.field_b + param0.field_e;
                var7 = ar.a(var5_int, (byte) 110, var6);
                var8 = (float)((param0.g(-66) << 8) / var7);
                if (0.0f < var8) {
                  L5: {
                    var9 = ek.a(0, (int)param1.field_b, (int)param1.field_c, param1.field_f[2], param0.field_e, 16, param1.field_f[1], param1.field_f[0], param1.field_f[3], param0.field_d);
                    if (var9 >= 0) {
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
                  return;
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4_ref = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var4_ref;
            stackOut_26_1 = new StringBuilder().append("pe.RC(");
            stackIn_29_0 = stackOut_26_0;
            stackIn_29_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param0 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L6;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_30_0 = stackOut_27_0;
              stackIn_30_1 = stackOut_27_1;
              stackIn_30_2 = stackOut_27_2;
              break L6;
            }
          }
          L7: {
            stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
            stackOut_30_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(44);
            stackIn_33_0 = stackOut_30_0;
            stackIn_33_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param1 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L7;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_34_0 = stackOut_31_0;
              stackIn_34_1 = stackOut_31_1;
              stackIn_34_2 = stackOut_31_2;
              break L7;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + 44 + param2 + 41);
        }
    }

    final void a(tfa param0, int param1, sg param2, lta param3, byte param4, sg param5, int param6, int param7, int param8) {
        RuntimeException var10 = null;
        sg[] var10_array = null;
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
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        var19 = VoidHunters.field_G;
        try {
          L0: {
            var10_array = ((pe) this).field_k;
            var11 = 0;
            L1: while (true) {
              L2: {
                if (var11 >= var10_array.length) {
                  break L2;
                } else {
                  L3: {
                    var12 = var10_array[var11];
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
                              var12.field_k.a(0, var14, (pe) this, param3);
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
                                int discarded$1 = 13879;
                                pm.a(-(tea.a(1, var16_ref_String) >> 1) + var17, -1, var18, var16_ref_String, 1, 16541441, (byte) -94);
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
                            cka.a(-1, var15, 16711935, var17, var16 + -(kga.a(-9, var15) >> 1), param4 + 4247);
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
                  ((pe) this).field_n = null;
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
            stackOut_31_0 = (RuntimeException) var10;
            stackOut_31_1 = new StringBuilder().append("pe.JA(");
            stackIn_34_0 = stackOut_31_0;
            stackIn_34_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param0 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L8;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_35_0 = stackOut_32_0;
              stackIn_35_1 = stackOut_32_1;
              stackIn_35_2 = stackOut_32_2;
              break L8;
            }
          }
          L9: {
            stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
            stackOut_35_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_35_2).append(44).append(param1).append(44);
            stackIn_38_0 = stackOut_35_0;
            stackIn_38_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param2 == null) {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L9;
            } else {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "{...}";
              stackIn_39_0 = stackOut_36_0;
              stackIn_39_1 = stackOut_36_1;
              stackIn_39_2 = stackOut_36_2;
              break L9;
            }
          }
          L10: {
            stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
            stackOut_39_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_39_2).append(44);
            stackIn_42_0 = stackOut_39_0;
            stackIn_42_1 = stackOut_39_1;
            stackIn_40_0 = stackOut_39_0;
            stackIn_40_1 = stackOut_39_1;
            if (param3 == null) {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "null";
              stackIn_43_0 = stackOut_42_0;
              stackIn_43_1 = stackOut_42_1;
              stackIn_43_2 = stackOut_42_2;
              break L10;
            } else {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "{...}";
              stackIn_43_0 = stackOut_40_0;
              stackIn_43_1 = stackOut_40_1;
              stackIn_43_2 = stackOut_40_2;
              break L10;
            }
          }
          L11: {
            stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
            stackOut_43_1 = ((StringBuilder) (Object) stackIn_43_1).append(stackIn_43_2).append(44).append(param4).append(44);
            stackIn_46_0 = stackOut_43_0;
            stackIn_46_1 = stackOut_43_1;
            stackIn_44_0 = stackOut_43_0;
            stackIn_44_1 = stackOut_43_1;
            if (param5 == null) {
              stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
              stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
              stackOut_46_2 = "null";
              stackIn_47_0 = stackOut_46_0;
              stackIn_47_1 = stackOut_46_1;
              stackIn_47_2 = stackOut_46_2;
              break L11;
            } else {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "{...}";
              stackIn_47_0 = stackOut_44_0;
              stackIn_47_1 = stackOut_44_1;
              stackIn_47_2 = stackOut_44_2;
              break L11;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_47_0, stackIn_47_2 + 44 + param6 + 44 + param7 + 44 + param8 + 41);
        }
    }

    private final void a(anb param0, boolean param1, boolean param2, boolean param3, int param4) {
        RuntimeException var6 = null;
        int stackIn_10_0 = 0;
        anb stackIn_10_1 = null;
        int stackIn_11_0 = 0;
        anb stackIn_11_1 = null;
        int stackIn_11_2 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        anb stackOut_7_1 = null;
        int stackOut_10_0 = 0;
        anb stackOut_10_1 = null;
        int stackOut_10_2 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              if (!param3) {
                break L1;
              } else {
                if (param2) {
                  param0.a(-61, (pe) this);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            param0.a(-49, param2, (pe) this);
            param0.d((byte) 95);
            ((pe) this).a(-110, param4, param0);
            stackOut_7_0 = 20382;
            stackOut_7_1 = (anb) param0;
            stackIn_10_0 = stackOut_7_0;
            stackIn_10_1 = stackOut_7_1;
            stackOut_10_0 = stackIn_10_0;
            stackOut_10_1 = (anb) (Object) stackIn_10_1;
            stackOut_10_2 = 0;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            stackIn_11_2 = stackOut_10_2;
            qba.a(stackIn_11_0, ((anb) (Object) stackIn_11_1).d(stackIn_11_2 != 0), 68, param0.g((byte) 127), 10);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var6;
            stackOut_13_1 = new StringBuilder().append("pe.KC(");
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L2;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + 1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    private final void b() {
        int var2_int = 0;
        rba var3 = null;
        int var4 = 0;
        int var5 = 0;
        sg var6 = null;
        int var7 = 0;
        int var8 = 0;
        var8 = VoidHunters.field_G;
        if (null == ((pe) this).field_a) {
          return;
        } else {
          var2_int = 0;
          L0: while (true) {
            if (var2_int >= ((pe) this).field_a.length) {
              var2_int = 1;
              return;
            } else {
              var3 = ((pe) this).field_a[var2_int];
              if (var3 != null) {
                var4 = -1;
                var5 = 0;
                L1: while (true) {
                  L2: {
                    if (var5 >= ((pe) this).field_k.length) {
                      break L2;
                    } else {
                      var6 = ((pe) this).field_k[var5];
                      if (var6 != null) {
                        var7 = var6.q((byte) 100);
                        if (var7 >= 0) {
                          if (unb.field_p > var7) {
                            if (var3.a(var6.field_d, (byte) 84, var6.field_e)) {
                              if (var4 < 0) {
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
                          var2_int++;
                          continue L0;
                        } else {
                          var2_int++;
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
                    var2_int++;
                    continue L0;
                  } else {
                    var2_int++;
                    continue L0;
                  }
                }
              } else {
                var2_int++;
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
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
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
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == -44) {
                break L1;
              } else {
                ((pe) this).field_i = false;
                break L1;
              }
            }
            L2: {
              var5_int = -1;
              var6 = -1;
              if (!(param1 instanceof sg)) {
                break L2;
              } else {
                var7 = (sg) (Object) param1;
                var5_int = var7.o((byte) -117);
                var6 = var7.q((byte) 93);
                break L2;
              }
            }
            ((pe) this).a(1, param3.field_y, var6, var5_int, false, param2.field_r, param2.field_n);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) runtimeException;
            stackOut_6_1 = new StringBuilder().append("pe.Q(").append(param0).append(44);
            stackIn_9_0 = stackOut_6_0;
            stackIn_9_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_10_0 = stackOut_7_0;
              stackIn_10_1 = stackOut_7_1;
              stackIn_10_2 = stackOut_7_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44);
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L4;
            }
          }
          L5: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(44);
            stackIn_17_0 = stackOut_14_0;
            stackIn_17_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param3 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_18_0 = stackOut_15_0;
              stackIn_18_1 = stackOut_15_1;
              stackIn_18_2 = stackOut_15_2;
              break L5;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 41);
        }
    }

    final void a(byte param0, rsb param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        rdb var5 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var4 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param0 >= 126) {
                break L1;
              } else {
                ((pe) this).field_h = false;
                break L1;
              }
            }
            L2: {
              if (!((pe) this).field_v) {
                var5 = (rdb) (Object) ((pe) this).field_n.d(0);
                L3: while (true) {
                  if (var5 == null) {
                    int discarded$1 = 99;
                    this.b();
                    if (((pe) this).field_f == null) {
                      break L2;
                    } else {
                      ((pe) this).field_f.a(-2374, param1);
                      break L2;
                    }
                  } else {
                    var5.a(3128, (pe) this);
                    var5 = (rdb) (Object) ((pe) this).field_n.a((byte) 113);
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
            stackOut_14_0 = (RuntimeException) var3;
            stackOut_14_1 = new StringBuilder().append("pe.GF(").append(param0).append(44);
            stackIn_17_0 = stackOut_14_0;
            stackIn_17_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_18_0 = stackOut_15_0;
              stackIn_18_1 = stackOut_15_1;
              stackIn_18_2 = stackOut_15_2;
              break L4;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 41);
        }
    }

    final boolean d(int param0, byte param1) {
        int stackIn_7_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (param1 == 21) {
            break L0;
          } else {
            ((pe) this).field_q = true;
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == ((pe) this).field_f) {
              break L2;
            } else {
              if (((pe) this).field_f.a(param0, (byte) -85)) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_7_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_6_0 = 0;
          stackIn_7_0 = stackOut_6_0;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    final una e(int param0) {
        if (param0 != 0) {
            return null;
        }
        return ((pe) this).field_f;
    }

    final int f(int param0) {
        if (param0 != 24797) {
            return -20;
        }
        return ((pe) this).field_l.length;
    }

    final void e(int param0, int param1) {
        if (param1 == 0) {
          ((pe) this).field_r = param0;
          return;
        } else {
          return;
        }
    }

    private final boolean a(int param0, int param1, int param2, anb[] param3, int param4) {
        anb[] var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        anb var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
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
              if (var7 >= param3.length) {
                stackOut_13_0 = 0;
                stackIn_14_0 = stackOut_13_0;
                break L0;
              } else {
                L3: {
                  var8 = param3[var7];
                  if (null != var8) {
                    var9 = param0 + -var8.d(false);
                    var10 = param1 - var8.g((byte) 118);
                    var11 = ar.a(var9, (byte) 121, var10);
                    if (var11 >= param4 + var8.g(-99)) {
                      break L3;
                    } else {
                      stackOut_10_0 = 1;
                      stackIn_11_0 = stackOut_10_0;
                      return stackIn_11_0 != 0;
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
            stackOut_15_0 = (RuntimeException) var6_ref;
            stackOut_15_1 = new StringBuilder().append("pe.AD(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param3 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L4;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + param4 + 41);
        }
        return stackIn_14_0 != 0;
    }

    final void a(int param0, int param1, int param2, int param3, boolean param4, int param5, int param6) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        tj var12 = null;
        int var13 = 0;
        var13 = VoidHunters.field_G;
        if (param1 > 0) {
          L0: {
            if (!param4) {
              break L0;
            } else {
              sg discarded$2 = ((pe) this).d(89, 35);
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
              var12 = new tj(param5, param6, fc.a(var11, (byte) 114) * 1000 >> 16, 1000 * eu.a(var11, 93) >> 16, var11, 2 * param1, param2, param3, 5, pea.field_a);
              ((pe) this).a(var12, false);
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
            return null;
        }
        return ((pe) this).field_n;
    }

    final cq e(byte param0, int param1) {
        L0: {
          if (param0 <= -27) {
            break L0;
          } else {
            ((pe) this).field_t = null;
            break L0;
          }
        }
        if (null != ((pe) this).field_t) {
          if (param1 >= 0) {
            if (((pe) this).field_t.length > param1) {
              return ((pe) this).field_t[param1];
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
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var4 = VoidHunters.field_G;
        try {
          L0: {
            if (param1 > 6) {
              L1: {
                if (null != ((pe) this).field_t) {
                  var3_int = 0;
                  L2: while (true) {
                    if (var3_int >= ((pe) this).field_t.length) {
                      break L1;
                    } else {
                      if (((pe) this).field_t[var3_int] == param0) {
                        stackOut_12_0 = var3_int;
                        stackIn_13_0 = stackOut_12_0;
                        return stackIn_13_0;
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
              stackOut_15_0 = -1;
              stackIn_16_0 = stackOut_15_0;
              break L0;
            } else {
              stackOut_2_0 = 78;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var3;
            stackOut_17_1 = new StringBuilder().append("pe.OC(");
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L3;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_21_0 = stackOut_18_0;
              stackIn_21_1 = stackOut_18_1;
              stackIn_21_2 = stackOut_18_2;
              break L3;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + param1 + 41);
        }
        return stackIn_16_0;
    }

    private final void a(byte param0, anb param1, lta param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              var4_int = 22 % ((-27 - param0) / 42);
              if (!pqa.a(8, 11284)) {
                break L1;
              } else {
                var5 = param2.a(param1.d(false), (byte) 127);
                int discarded$3 = 118;
                var6 = param2.b(true, param1.f((byte) -53)[2]) - pib.b() / 2;
                var7 = Integer.toString(param1.field_l);
                cka.a(-1, var7, 16711935, var6, -(kga.a(-118, var7) >> 1) + var5, 4266);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("pe.ME(").append(param0).append(44);
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44);
            stackIn_10_0 = stackOut_7_0;
            stackIn_10_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L3;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
    }

    private final void a(tfa param0, sg param1, byte param2, sg param3, int param4, int param5, int param6, lta param7) {
        RuntimeException var9 = null;
        nbb var9_ref = null;
        ml var10 = null;
        int var10_int = 0;
        int var11 = 0;
        qua var12 = null;
        int var12_int = 0;
        nbb var12_ref = null;
        ml[] var13_ref_ml__ = null;
        int var13 = 0;
        int var14 = 0;
        ml[] var14_ref_ml__ = null;
        int var15 = 0;
        imb var15_ref_imb = null;
        int var16 = 0;
        String var17 = null;
        int var17_int = 0;
        int[] var18 = null;
        int var18_int = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        qua var25 = null;
        int var26 = 0;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_78_2 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        String stackIn_82_2 = null;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        RuntimeException stackIn_85_0 = null;
        StringBuilder stackIn_85_1 = null;
        RuntimeException stackIn_86_0 = null;
        StringBuilder stackIn_86_1 = null;
        String stackIn_86_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        String stackOut_77_2 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        String stackOut_75_2 = null;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        RuntimeException stackOut_81_0 = null;
        StringBuilder stackOut_81_1 = null;
        String stackOut_81_2 = null;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        String stackOut_79_2 = null;
        RuntimeException stackOut_82_0 = null;
        StringBuilder stackOut_82_1 = null;
        RuntimeException stackOut_85_0 = null;
        StringBuilder stackOut_85_1 = null;
        String stackOut_85_2 = null;
        RuntimeException stackOut_83_0 = null;
        StringBuilder stackOut_83_1 = null;
        String stackOut_83_2 = null;
        var24 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param6 < 0) {
                break L1;
              } else {
                if (!param3.d(4, 56)) {
                  L2: {
                    if (0 != (param0.field_f & 128)) {
                      break L2;
                    } else {
                      if (null != param3.n((byte) 28)) {
                        break L2;
                      } else {
                        break L1;
                      }
                    }
                  }
                  var9_ref = ((pe) this).i(21363, param3.x(-96));
                  if (var9_ref != null) {
                    L3: {
                      if (ktb.field_q != 1) {
                        break L3;
                      } else {
                        if (null == param3.n((byte) 28)) {
                          L4: {
                            var10_int = param5;
                            var11 = param4;
                            if (param3 != param1) {
                              var12_int = 131072;
                              var13 = -param3.d(false) + var10_int;
                              var14 = -param3.g((byte) -46) + var11;
                              var15 = ar.a(var13, (byte) 111, var14);
                              if (var15 > var12_int) {
                                var16 = ecb.a(var14, (byte) -77, var13);
                                var10_int = param3.d(false) - -((var12_int >> 8) * (fc.a(var16, (byte) -115) >> 8));
                                var11 = param3.g((byte) 123) + (var12_int >> 8) * (eu.a(var16, 47) >> 8);
                                break L4;
                              } else {
                                break L4;
                              }
                            } else {
                              break L4;
                            }
                          }
                          var12_ref = new nbb();
                          var9_ref.b((byte) 60, (tv) (Object) var12_ref);
                          param3.a((int[]) null, -15);
                          var9_ref = var12_ref;
                          param3.a((qua) null, 3);
                          this.a(param3, false, -126, var9_ref, var11, var10_int);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                    }
                    L5: {
                      var10 = var9_ref.field_k;
                      var11 = 1;
                      var25 = param3.p((byte) 49);
                      var12 = var25;
                      if (var12 != null) {
                        var13_ref_ml__ = var12.field_c;
                        if (null == var13_ref_ml__) {
                          break L5;
                        } else {
                          if (var13_ref_ml__.length > 0) {
                            var14 = 0;
                            L6: while (true) {
                              if (var13_ref_ml__.length <= var14) {
                                break L5;
                              } else {
                                L7: {
                                  if (var11 == 0) {
                                    break L7;
                                  } else {
                                    if (var25.field_e.field_b == var13_ref_ml__[var14]) {
                                      var11 = 0;
                                      var14++;
                                      continue L6;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                                L8: {
                                  if (!var13_ref_ml__[var14].a(16, var12.field_e.field_b)) {
                                    break L8;
                                  } else {
                                    break L8;
                                  }
                                }
                                var14++;
                                continue L6;
                              }
                            }
                          } else {
                            break L5;
                          }
                        }
                      } else {
                        break L5;
                      }
                    }
                    L9: {
                      if (ktb.field_q != 1) {
                        break L9;
                      } else {
                        if (param3.n((byte) 28) != null) {
                          break L9;
                        } else {
                          L10: {
                            var13 = aob.a(29554, var9_ref.field_k.field_j);
                            if (null != var12) {
                              if (var11 == 0) {
                                var13 = 16711680;
                                break L10;
                              } else {
                                var13 = qpb.a(false, param3.q((byte) 73), 13894143);
                                break L10;
                              }
                            } else {
                              break L10;
                            }
                          }
                          var9_ref.a(param7, var13, (pe) this, 16);
                          break L9;
                        }
                      }
                    }
                    L11: {
                      if (var12 == null) {
                        break L11;
                      } else {
                        L12: {
                          var13 = ki.field_o;
                          ki.field_o = 0;
                          var14_ref_ml__ = var12.field_c;
                          if (null == var14_ref_ml__) {
                            break L12;
                          } else {
                            if (var14_ref_ml__.length > 0) {
                              var15_ref_imb = var12.field_e.field_b.field_d[var25.field_e.field_e];
                              var16 = 1024;
                              var17_int = param7.a(-var16 + var15_ref_imb.field_e, (byte) 113);
                              var18_int = param7.a(var16 + var15_ref_imb.field_e, (byte) 115);
                              var19 = param7.b(true, -var16 + var15_ref_imb.field_d);
                              var20 = param7.b(true, var16 + var15_ref_imb.field_d);
                              c.a(var20, var18_int, var17_int, var19, -16777216, 16711680);
                              c.a(var19, var18_int, var17_int, var20, -16777216, 16711680);
                              var21 = 0;
                              L13: while (true) {
                                if (var21 >= var14_ref_ml__.length) {
                                  break L12;
                                } else {
                                  var14_ref_ml__[var21].a((byte) 26, param7, true, (pe) this, 16711680);
                                  var21++;
                                  continue L13;
                                }
                              }
                            } else {
                              break L12;
                            }
                          }
                        }
                        ki.field_o = var13;
                        break L11;
                      }
                    }
                    var13 = var9_ref.d(false) - var9_ref.j(995401160);
                    var14 = var9_ref.g((byte) -16) - var9_ref.i((byte) 5);
                    var15 = var10.b(127) * fc.a(var9_ref.e(0), (byte) 99) - var10.c((byte) 100) * eu.a(var9_ref.e(0), 124) >> 16;
                    var16 = var10.b(-25) * eu.a(var9_ref.e(0), 62) + var10.c((byte) 100) * fc.a(var9_ref.e(0), (byte) 64) >> 16;
                    nn.a(param3.field_k.field_n, 1, var14 + var16, var13 - -var15, param7, param3.field_k.field_r);
                    var17 = me.a(var10, (byte) -84);
                    cka.a(-1, var17, 16777215, param7.b(true, -10000 + var9_ref.g((byte) -109)), param7.a(var9_ref.d(false), (byte) 118) + -(kga.a(94, var17) >> 1), 4266);
                    if (null == param3.A(56)) {
                      break L1;
                    } else {
                      var18 = param3.A(116);
                      var26 = 0;
                      var19 = var26;
                      L14: while (true) {
                        if (var26 >= var18.length) {
                          break L1;
                        } else {
                          var20 = var18[var26];
                          var21 = var18[var26 + 1];
                          var22 = var18[(var26 + 2) % var18.length];
                          var23 = var18[(3 + var26) % var18.length];
                          c.a(param7.b(true, var23), param7.a(var22, (byte) 122), param7.a(var20, (byte) 121), param7.b(true, var21), -16777216, 65280);
                          var26 += 2;
                          continue L14;
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
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var9 = decompiledCaughtException;
            stackOut_70_0 = (RuntimeException) var9;
            stackOut_70_1 = new StringBuilder().append("pe.RD(");
            stackIn_73_0 = stackOut_70_0;
            stackIn_73_1 = stackOut_70_1;
            stackIn_71_0 = stackOut_70_0;
            stackIn_71_1 = stackOut_70_1;
            if (param0 == null) {
              stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
              stackOut_73_1 = (StringBuilder) (Object) stackIn_73_1;
              stackOut_73_2 = "null";
              stackIn_74_0 = stackOut_73_0;
              stackIn_74_1 = stackOut_73_1;
              stackIn_74_2 = stackOut_73_2;
              break L15;
            } else {
              stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
              stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
              stackOut_71_2 = "{...}";
              stackIn_74_0 = stackOut_71_0;
              stackIn_74_1 = stackOut_71_1;
              stackIn_74_2 = stackOut_71_2;
              break L15;
            }
          }
          L16: {
            stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
            stackOut_74_1 = ((StringBuilder) (Object) stackIn_74_1).append(stackIn_74_2).append(44);
            stackIn_77_0 = stackOut_74_0;
            stackIn_77_1 = stackOut_74_1;
            stackIn_75_0 = stackOut_74_0;
            stackIn_75_1 = stackOut_74_1;
            if (param1 == null) {
              stackOut_77_0 = (RuntimeException) (Object) stackIn_77_0;
              stackOut_77_1 = (StringBuilder) (Object) stackIn_77_1;
              stackOut_77_2 = "null";
              stackIn_78_0 = stackOut_77_0;
              stackIn_78_1 = stackOut_77_1;
              stackIn_78_2 = stackOut_77_2;
              break L16;
            } else {
              stackOut_75_0 = (RuntimeException) (Object) stackIn_75_0;
              stackOut_75_1 = (StringBuilder) (Object) stackIn_75_1;
              stackOut_75_2 = "{...}";
              stackIn_78_0 = stackOut_75_0;
              stackIn_78_1 = stackOut_75_1;
              stackIn_78_2 = stackOut_75_2;
              break L16;
            }
          }
          L17: {
            stackOut_78_0 = (RuntimeException) (Object) stackIn_78_0;
            stackOut_78_1 = ((StringBuilder) (Object) stackIn_78_1).append(stackIn_78_2).append(44).append(-128).append(44);
            stackIn_81_0 = stackOut_78_0;
            stackIn_81_1 = stackOut_78_1;
            stackIn_79_0 = stackOut_78_0;
            stackIn_79_1 = stackOut_78_1;
            if (param3 == null) {
              stackOut_81_0 = (RuntimeException) (Object) stackIn_81_0;
              stackOut_81_1 = (StringBuilder) (Object) stackIn_81_1;
              stackOut_81_2 = "null";
              stackIn_82_0 = stackOut_81_0;
              stackIn_82_1 = stackOut_81_1;
              stackIn_82_2 = stackOut_81_2;
              break L17;
            } else {
              stackOut_79_0 = (RuntimeException) (Object) stackIn_79_0;
              stackOut_79_1 = (StringBuilder) (Object) stackIn_79_1;
              stackOut_79_2 = "{...}";
              stackIn_82_0 = stackOut_79_0;
              stackIn_82_1 = stackOut_79_1;
              stackIn_82_2 = stackOut_79_2;
              break L17;
            }
          }
          L18: {
            stackOut_82_0 = (RuntimeException) (Object) stackIn_82_0;
            stackOut_82_1 = ((StringBuilder) (Object) stackIn_82_1).append(stackIn_82_2).append(44).append(param4).append(44).append(param5).append(44).append(param6).append(44);
            stackIn_85_0 = stackOut_82_0;
            stackIn_85_1 = stackOut_82_1;
            stackIn_83_0 = stackOut_82_0;
            stackIn_83_1 = stackOut_82_1;
            if (param7 == null) {
              stackOut_85_0 = (RuntimeException) (Object) stackIn_85_0;
              stackOut_85_1 = (StringBuilder) (Object) stackIn_85_1;
              stackOut_85_2 = "null";
              stackIn_86_0 = stackOut_85_0;
              stackIn_86_1 = stackOut_85_1;
              stackIn_86_2 = stackOut_85_2;
              break L18;
            } else {
              stackOut_83_0 = (RuntimeException) (Object) stackIn_83_0;
              stackOut_83_1 = (StringBuilder) (Object) stackIn_83_1;
              stackOut_83_2 = "{...}";
              stackIn_86_0 = stackOut_83_0;
              stackIn_86_1 = stackOut_83_1;
              stackIn_86_2 = stackOut_83_2;
              break L18;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_86_0, stackIn_86_2 + 41);
        }
    }

    private final void a(int param0, byte param1, int param2, int param3) {
        crb[] var5 = null;
        int var6 = 0;
        crb var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        crb[] var12 = null;
        var11 = VoidHunters.field_G;
        var12 = ((pe) this).field_e.c(0);
        var5 = var12;
        var6 = 0;
        L0: while (true) {
          if (var6 >= var12.length) {
            L1: {
              if (!((pe) this).a((byte) -99, true, param0, param2, param3)) {
                break L1;
              } else {
                ((pe) this).field_b.a(true, (dmb) (Object) new rgb(param2, param0, param3));
                break L1;
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
                ((pe) this).a(-125, 2, (anb) (Object) var7);
                var6++;
                continue L0;
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

    final boolean a(int param0, anb param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            var3_int = param1.field_d;
            var4 = param1.field_e;
            var5 = param1.g(param0 + 11886);
            if (!this.a(var3_int, var4, -80, (anb[]) (Object) ((pe) this).field_e.c(0), var5)) {
              if (this.a(var3_int, var4, param0 + 11833, (anb[]) (Object) ((pe) this).field_k, var5)) {
                stackOut_6_0 = 1;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              } else {
                L1: {
                  if (param0 == -11924) {
                    break L1;
                  } else {
                    ((pe) this).field_i = false;
                    break L1;
                  }
                }
                if (this.a(var3_int, var4, -100, (anb[]) (Object) ((pe) this).field_m, var5)) {
                  stackOut_12_0 = 1;
                  stackIn_13_0 = stackOut_12_0;
                  break L0;
                } else {
                  return false;
                }
              }
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3;
            stackOut_14_1 = new StringBuilder().append("pe.EC(").append(param0).append(44);
            stackIn_17_0 = stackOut_14_0;
            stackIn_17_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L2;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_18_0 = stackOut_15_0;
              stackIn_18_1 = stackOut_15_1;
              stackIn_18_2 = stackOut_15_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 41);
        }
        return stackIn_13_0 != 0;
    }

    final void b(int param0, boolean param1) {
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param1) {
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
          ((pe) this).field_v = stackIn_3_1 != 0;
          if (param0 < -109) {
            break L1;
          } else {
            ((pe) this).field_u = null;
            break L1;
          }
        }
    }

    private final void a(ij param0, boolean param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        sg var4 = null;
        sg var9 = null;
        int var12 = 0;
        RuntimeException stackIn_84_0 = null;
        StringBuilder stackIn_84_1 = null;
        RuntimeException stackIn_86_0 = null;
        StringBuilder stackIn_86_1 = null;
        RuntimeException stackIn_87_0 = null;
        StringBuilder stackIn_87_1 = null;
        String stackIn_87_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_83_0 = null;
        StringBuilder stackOut_83_1 = null;
        RuntimeException stackOut_86_0 = null;
        StringBuilder stackOut_86_1 = null;
        String stackOut_86_2 = null;
        RuntimeException stackOut_84_0 = null;
        StringBuilder stackOut_84_1 = null;
        String stackOut_84_2 = null;
        var12 = VoidHunters.field_G;
        try {
          L0: {
            var3_int = 0;
            L1: while (true) {
              if (var3_int >= ((pe) this).field_k.length) {
                L2: {
                  if (!param1) {
                    break L2;
                  } else {
                    ((pe) this).field_u = null;
                    break L2;
                  }
                }
                break L0;
              } else {
                L3: {
                  var4 = ((pe) this).field_k[var3_int];
                  var9 = var4;
                  var9 = var4;
                  if (var4 == null) {
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var3_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_83_0 = (RuntimeException) var3;
            stackOut_83_1 = new StringBuilder().append("pe.TE(");
            stackIn_86_0 = stackOut_83_0;
            stackIn_86_1 = stackOut_83_1;
            stackIn_84_0 = stackOut_83_0;
            stackIn_84_1 = stackOut_83_1;
            if (param0 == null) {
              stackOut_86_0 = (RuntimeException) (Object) stackIn_86_0;
              stackOut_86_1 = (StringBuilder) (Object) stackIn_86_1;
              stackOut_86_2 = "null";
              stackIn_87_0 = stackOut_86_0;
              stackIn_87_1 = stackOut_86_1;
              stackIn_87_2 = stackOut_86_2;
              break L4;
            } else {
              stackOut_84_0 = (RuntimeException) (Object) stackIn_84_0;
              stackOut_84_1 = (StringBuilder) (Object) stackIn_84_1;
              stackOut_84_2 = "{...}";
              stackIn_87_0 = stackOut_84_0;
              stackIn_87_1 = stackOut_84_1;
              stackIn_87_2 = stackOut_84_2;
              break L4;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_87_0, stackIn_87_2 + 44 + param1 + 41);
        }
    }

    final boolean a(boolean param0, int param1, lbb param2) {
        RuntimeException var4 = null;
        et[] var4_array = null;
        int var5 = 0;
        int var6 = 0;
        et var7 = null;
        int var8 = 0;
        et[] var9 = null;
        int stackIn_3_0 = 0;
        lbb stackIn_5_0 = null;
        lbb stackIn_7_0 = null;
        lbb stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        lbb stackOut_4_0 = null;
        lbb stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        lbb stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_20_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var8 = VoidHunters.field_G;
        try {
          L0: {
            if (param0) {
              L1: {
                stackOut_4_0 = (lbb) param2;
                stackIn_7_0 = stackOut_4_0;
                stackIn_5_0 = stackOut_4_0;
                if (param0) {
                  stackOut_7_0 = (lbb) (Object) stackIn_7_0;
                  stackOut_7_1 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  stackIn_8_1 = stackOut_7_1;
                  break L1;
                } else {
                  stackOut_5_0 = (lbb) (Object) stackIn_5_0;
                  stackOut_5_1 = 1;
                  stackIn_8_0 = stackOut_5_0;
                  stackIn_8_1 = stackOut_5_1;
                  break L1;
                }
              }
              L2: {
                var9 = ((lbb) (Object) stackIn_8_0).d(stackIn_8_1 != 0);
                var4_array = var9;
                var5 = 8;
                if (param1 != 1) {
                  break L2;
                } else {
                  var5 = 9;
                  break L2;
                }
              }
              L3: {
                if (var4_array == null) {
                  break L3;
                } else {
                  if (var9.length > 0) {
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
                                  stackOut_20_0 = 0;
                                  stackIn_21_0 = stackOut_20_0;
                                  break L6;
                                } else {
                                  stackOut_18_0 = 1;
                                  stackIn_21_0 = stackOut_18_0;
                                  break L6;
                                }
                              }
                              return stackIn_21_0 != 0;
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
              stackOut_23_0 = 1;
              stackIn_24_0 = stackOut_23_0;
              break L0;
            } else {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var4;
            stackOut_25_1 = new StringBuilder().append("pe.A(").append(param0).append(44).append(param1).append(44);
            stackIn_28_0 = stackOut_25_0;
            stackIn_28_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param2 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L7;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_29_0 = stackOut_26_0;
              stackIn_29_1 = stackOut_26_1;
              stackIn_29_2 = stackOut_26_2;
              break L7;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + 41);
        }
        return stackIn_24_0 != 0;
    }

    private final void a(ij param0) {
        RuntimeException var3 = null;
        nbb[] var3_array = null;
        int var3_int = 0;
        int var4_int = 0;
        sg[] var4 = null;
        nbb[] var4_array = null;
        nbb var5_ref_nbb = null;
        int var5 = 0;
        sg var6 = null;
        nbb var6_ref = null;
        nbb var9 = null;
        int var11 = 0;
        nbb[] var12 = null;
        int var13 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_95_0 = null;
        StringBuilder stackIn_95_1 = null;
        RuntimeException stackIn_97_0 = null;
        StringBuilder stackIn_97_1 = null;
        RuntimeException stackIn_98_0 = null;
        StringBuilder stackIn_98_1 = null;
        String stackIn_98_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_94_0 = null;
        StringBuilder stackOut_94_1 = null;
        RuntimeException stackOut_97_0 = null;
        StringBuilder stackOut_97_1 = null;
        String stackOut_97_2 = null;
        RuntimeException stackOut_95_0 = null;
        StringBuilder stackOut_95_1 = null;
        String stackOut_95_2 = null;
        var11 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (1 <= gl.field_d) {
                var3_array = ((pe) this).field_m;
                var4_int = 0;
                L2: while (true) {
                  if (var3_array.length <= var4_int) {
                    L3: {
                      if (ie.field_p != 1) {
                        stackOut_14_0 = 0;
                        stackIn_15_0 = stackOut_14_0;
                        break L3;
                      } else {
                        stackOut_12_0 = 1;
                        stackIn_15_0 = stackOut_12_0;
                        break L3;
                      }
                    }
                    var3_int = stackIn_15_0;
                    var4 = ((pe) this).field_k;
                    var5 = 0;
                    L4: while (true) {
                      if (var4.length <= var5) {
                        var12 = ((pe) this).field_m;
                        var4_array = ((pe) this).field_m;
                        var13 = 0;
                        var5 = var13;
                        L5: while (true) {
                          if (var12.length <= var13) {
                            break L1;
                          } else {
                            L6: {
                              var6_ref = var12[var13];
                              if (null == var6_ref) {
                                break L6;
                              } else {
                                break L6;
                              }
                            }
                            var13++;
                            continue L5;
                          }
                        }
                      } else {
                        L7: {
                          var6 = var4[var5];
                          if (null == var6) {
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        var5++;
                        continue L4;
                      }
                    }
                  } else {
                    L8: {
                      var5_ref_nbb = var3_array[var4_int];
                      var9 = var5_ref_nbb;
                      var9 = var5_ref_nbb;
                      if (var5_ref_nbb != null) {
                        var5_ref_nbb.field_x = false;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    var4_int++;
                    continue L2;
                  }
                }
              } else {
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3 = decompiledCaughtException;
            stackOut_94_0 = (RuntimeException) var3;
            stackOut_94_1 = new StringBuilder().append("pe.OD(");
            stackIn_97_0 = stackOut_94_0;
            stackIn_97_1 = stackOut_94_1;
            stackIn_95_0 = stackOut_94_0;
            stackIn_95_1 = stackOut_94_1;
            if (param0 == null) {
              stackOut_97_0 = (RuntimeException) (Object) stackIn_97_0;
              stackOut_97_1 = (StringBuilder) (Object) stackIn_97_1;
              stackOut_97_2 = "null";
              stackIn_98_0 = stackOut_97_0;
              stackIn_98_1 = stackOut_97_1;
              stackIn_98_2 = stackOut_97_2;
              break L9;
            } else {
              stackOut_95_0 = (RuntimeException) (Object) stackIn_95_0;
              stackOut_95_1 = (StringBuilder) (Object) stackIn_95_1;
              stackOut_95_2 = "{...}";
              stackIn_98_0 = stackOut_95_0;
              stackIn_98_1 = stackOut_95_1;
              stackIn_98_2 = stackOut_95_2;
              break L9;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_98_0, stackIn_98_2 + 44 + 25 + 41);
        }
    }

    final void a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = VoidHunters.field_G;
        ((pe) this).field_l = new int[param1];
        var3 = param0;
        L0: while (true) {
          if (((pe) this).field_l.length <= var3) {
            return;
          } else {
            ((pe) this).field_l[var3] = oq.field_C;
            var3++;
            continue L0;
          }
        }
    }

    final void a(byte param0, mqb param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            param1.a((pe) this, true, param0, false);
            boolean discarded$3 = ((pe) this).a(param0 + 29584, (anb) (Object) param1, (anb[]) (Object) ((pe) this).field_g, 3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("pe.RB(").append(param0).append(44);
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L1;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        crb[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        crb var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = VoidHunters.field_G;
        var6 = ((pe) this).field_e.c(0);
        var7 = param1 + param3 / 2;
        var8 = param0 + param2 / 2;
        var9 = 0;
        L0: while (true) {
          if (var6.length <= var9) {
            L1: {
              if (!((pe) this).a(var7, var8, param2, true, 121, param3)) {
                break L1;
              } else {
                ((pe) this).field_b.a(true, (dmb) (Object) new ptb(param1, param0, param3, param2));
                break L1;
              }
            }
            return;
          } else {
            var10 = var6[var9];
            if (null != var10) {
              var11 = var7 - var10.d(false);
              var12 = -var10.g((byte) -22) + var8;
              if (Math.abs(var11) < param3 / 2) {
                if (param2 / 2 > Math.abs(var12)) {
                  ((pe) this).a(-97, 2, (anb) (Object) var10);
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
        int var6_int = 0;
        RuntimeException var6 = null;
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
            var6_int = param1.field_e;
            var7 = param1.field_l;
            var8 = param1.field_h.field_g[(param1.field_j << 1) % param1.field_h.field_g.length];
            var9 = param1.field_h.field_g[(1 + (param1.field_j << 1)) % param1.field_h.field_g.length];
            var10 = param1.field_h.field_g[(2 + (param1.field_j << 1)) % param1.field_h.field_g.length];
            var11 = param1.field_h.field_g[((param1.field_j << 1) - -3) % param1.field_h.field_g.length];
            var12 = param1.field_m.field_g[(param1.field_f << 1) % param1.field_m.field_g.length];
            var13 = param1.field_m.field_g[((param1.field_f << 1) + 1) % param1.field_m.field_g.length];
            var14 = param1.field_m.field_g[(2 + (param1.field_f << 1)) % param1.field_m.field_g.length];
            var15 = param1.field_m.field_g[(3 + (param1.field_f << 1)) % param1.field_m.field_g.length];
            var16 = -var9 + var11;
            var17 = var8 - var10;
            var18 = var15 - var13;
            var19 = -var14 + var12;
            var18 = -var18;
            var19 = -var19;
            var20 = param3 * (var16 + var18) >> 8;
            var21 = param3 * (var19 + var17) >> 8;
            param0.a(var21, var6_int, var7, (byte) -123, var20);
            param4.a(-var21, var6_int, var7, (byte) -121, -var20);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var6;
            stackOut_4_1 = new StringBuilder().append("pe.BE(");
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
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44);
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
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
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(44).append(-116).append(44).append(param3).append(44);
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param4 == null) {
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
          throw rta.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
    }

    private final nbb a(int param0, nbb param1, sg param2, byte param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        nbb var8 = null;
        nbb stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        nbb stackOut_5_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              if (null != param1) {
                break L1;
              } else {
                var6_int = param2.d(false);
                var7 = param2.g((byte) 3);
                var8 = ((pe) this).a(true, var7, param4, var6_int, param0);
                param1 = var8;
                if (null == param1) {
                  break L1;
                } else {
                  param2.a(param1.field_l, (byte) -114);
                  break L1;
                }
              }
            }
            stackOut_5_0 = (nbb) param1;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var6;
            stackOut_7_1 = new StringBuilder().append("pe.K(").append(param0).append(44);
            stackIn_10_0 = stackOut_7_0;
            stackIn_10_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L2;
            }
          }
          L3: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(44);
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L3;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + 124 + 44 + param4 + 41);
        }
        return stackIn_6_0;
    }

    final void a(byte param0, crb param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              boolean discarded$53 = param1.b(-(((pe) this).field_r >> 1), param0 + 2147483521, ((pe) this).field_r >> 1, -(((pe) this).field_o >> 1), ((pe) this).field_o >> 1);
              if (param0 == 126) {
                break L1;
              } else {
                ((pe) this).field_y = 54;
                break L1;
              }
            }
            L2: {
              param1.a((pe) this, true, (byte) 67, false);
              if (!((pe) this).field_e.a((pe) this, 16520, param1)) {
                break L2;
              } else {
                this.b(3, (byte) 126, (anb) (Object) param1);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("pe.OB(").append(param0).append(44);
            stackIn_9_0 = stackOut_6_0;
            stackIn_9_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_10_0 = stackOut_7_0;
              stackIn_10_1 = stackOut_7_1;
              stackIn_10_2 = stackOut_7_2;
              break L3;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
    }

    public pe() {
        int var1 = 0;
        ((pe) this).field_s = new oq[768];
        var1 = 0;
        L0: while (true) {
          if (((pe) this).field_s.length <= var1) {
            return;
          } else {
            ((pe) this).field_s[var1] = new oq();
            var1++;
            continue L0;
          }
        }
    }

    pe(int param0) {
        int var2_int = 0;
        ((pe) this).field_u = new fba();
        ((pe) this).field_s = new oq[768];
        var2_int = 0;
        L0: while (true) {
          if (var2_int >= ((pe) this).field_s.length) {
            ((pe) this).field_x = new ij();
            ((pe) this).field_n = new ij();
            ((pe) this).field_k = new sg[field_w[0]];
            ((pe) this).field_m = new nbb[field_w[1]];
            ((pe) this).field_e = new aib(field_w[2]);
            ((pe) this).field_g = new mqb[field_w[3]];
            ((pe) this).a(0, param0);
            ((pe) this).field_o = 1 << fob.field_c;
            ((pe) this).field_r = 1 << fob.field_c;
            ((pe) this).field_p = new lua();
            return;
          } else {
            ((pe) this).field_s[var2_int] = new oq();
            var2_int++;
            continue L0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Add action (Award victory)";
        field_w = new int[]{255, 1023, 1023, 255};
        field_c = new int[]{0, field_w[0], field_w[1] + field_w[0], field_w[1] + field_w[0] - -field_w[2]};
    }
}
