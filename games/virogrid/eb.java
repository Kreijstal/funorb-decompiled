/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class eb implements Iterable {
    static km field_b;
    static int field_f;
    static String field_a;
    static int field_d;
    static String field_g;
    wb field_e;
    static km field_c;

    final void a(boolean param0, wb param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if (param1.field_k != null) {
                param1.c(52);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              param1.field_k = this.field_e.field_k;
              param1.field_h = this.field_e;
              param1.field_k.field_h = param1;
              param1.field_h.field_k = param1;
              if (param0) {
                break L2;
              } else {
                this.a(27);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("eb.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    public static void a(boolean param0) {
        field_g = null;
        field_a = null;
        field_c = null;
        if (!param0) {
            eb.a(false);
        }
        field_b = null;
    }

    final wb a(int param0) {
        if (param0 != -32314) {
            wb var3 = (wb) null;
            this.a(true, (wb) null);
        }
        wb var2 = this.field_e.field_h;
        if (this.field_e == var2) {
            return null;
        }
        var2.c(63);
        return var2;
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new f((eb) (this)));
    }

    final static void a(boolean param0, boolean param1, int param2, boolean param3) {
        int stackIn_11_0 = 0;
        String stackIn_24_0 = null;
        km stackIn_36_0 = null;
        km stackIn_37_0 = null;
        String stackIn_37_1 = null;
        km stackIn_39_0 = null;
        String[] stackIn_39_1 = null;
        km stackIn_40_0 = null;
        String[] stackIn_40_1 = null;
        String stackIn_40_2 = null;
        km stackIn_70_0 = null;
        km stackIn_71_0 = null;
        int stackIn_71_1 = 0;
        km stackIn_75_0 = null;
        km stackIn_76_0 = null;
        int stackIn_76_1 = 0;
        km stackIn_80_0 = null;
        km stackIn_81_0 = null;
        int stackIn_81_1 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        km var5 = null;
        km var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        Object var9 = null;
        int var10 = 0;
        int var11_int = 0;
        Object var11 = null;
        String var11_ref = null;
        int var12 = 0;
        int var13 = 0;
        km var15 = null;
        String var16 = null;
        km var17 = null;
        var12 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              rf.a(hn.field_h, -4);
              if (la.field_h != null) {
                L2: {
                  L3: {
                    var15 = ed.field_c;
                    var17 = var15;
                    ed.field_c.field_ub = 0;
                    var17.field_K = 0;
                    ii.field_d.field_ub = 0;
                    var5 = ii.field_d;
                    var5.field_K = 0;
                    var6 = jk.field_b;
                    jk.field_b.field_ub = 0;
                    var6.field_K = 0;
                    qi.field_e.field_V = hk.field_Ib.toUpperCase();
                    var7 = (dm.field_r.field_K - -2) / 2;
                    jk.field_b.a(0, 40, -2 + var7, (byte) -96, dm.field_r.field_ub - 40);
                    ii.field_d.a(var7, 40, dm.field_r.field_K + -var7, (byte) -64, -40 + dm.field_r.field_ub);
                    if ((vj.field_b.length ^ -1) != -2) {
                      break L3;
                    } else {
                      if (-3 != (vj.field_b[0] ^ -1)) {
                        break L3;
                      } else {
                        var8 = 0;
                        break L2;
                      }
                    }
                  }
                  var8 = 0;
                  var9_int = 0;
                  var10 = 0;
                  L4: while (true) {
                    L5: {
                      if (var10 >= vj.field_b.length) {
                        break L5;
                      } else {
                        L6: {
                          if (0 == (kn.field_E[var10 / 8] & 1 << (7 & var10))) {
                            stackIn_11_0 = 0;
                            break L6;
                          } else {
                            stackIn_11_0 = 1;
                            break L6;
                          }
                        }
                        L7: {
                          var11_int = stackIn_11_0;
                          if (var11_int != 0) {
                            var9_int++;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        L8: {
                          if (var11_int == 0) {
                            break L8;
                          } else {
                            if ((vj.field_b[var10] ^ -1) == -3) {
                              break L8;
                            } else {
                              var8 = 1;
                              break L5;
                            }
                          }
                        }
                        var10++;
                        continue L4;
                      }
                    }
                    if (0 != var9_int) {
                      break L2;
                    } else {
                      var8 = 1;
                      break L2;
                    }
                  }
                }
                ii.field_d.field_Y = true;
                if (!ld.field_c) {
                  L9: {
                    stackIn_36_0 = ii.field_d;

                    if (var8 != 0) {
                      stackIn_37_0 = (km) ((Object) stackIn_36_0);
                      stackIn_37_1 = p.field_g;
                      break L9;
                    } else {
                      stackIn_37_0 = (km) ((Object) stackIn_36_0);
                      stackIn_37_1 = gf.field_x;
                      break L9;
                    }
                  }
                  L10: {
                    stackIn_37_0.field_V = ((String) (Object) stackIn_37_1).toUpperCase();
                    stackIn_39_0 = l.field_b;

                    stackIn_39_1 = new String[]{ii.field_d.field_V};

                    if (var8 != 0) {
                      stackIn_40_0 = (km) ((Object) stackIn_39_0);
                      stackIn_40_1 = (String[]) ((Object) stackIn_39_1);
                      stackIn_40_2 = ok.field_K;
                      break L10;
                    } else {
                      stackIn_40_0 = (km) ((Object) stackIn_39_0);
                      stackIn_40_1 = (String[]) ((Object) stackIn_39_1);
                      stackIn_40_2 = h.field_b;
                      break L10;
                    }
                  }
                  L11: {
                    stackIn_40_0.field_V = oi.a(stackIn_40_1, stackIn_40_2, 2);
                    jk.field_b.field_V = nl.field_v;
                    ud.field_b = true;
                    fb.field_o.field_Y = true;
                    if (nb.field_q != null) {
                      L12: {
                        vi.field_l = false;
                        ud.field_b = false;
                        if (null == ub.field_D) {
                          hk.field_Lb = new boolean[vb.field_h];
                          ub.field_D = new byte[vb.field_h];
                          break L12;
                        } else {
                          break L12;
                        }
                      }
                      var13 = 0;
                      var9_int = var13;
                      L13: while (true) {
                        if (var13 >= vb.field_h) {
                          kn.a(true, -1, -1, vb.field_h, 0, 8, -1, la.field_h);
                          if (2 > hd.field_d) {
                            break L11;
                          } else {
                            if (!dc.field_Y[12]) {
                              break L11;
                            } else {
                              ud.field_b = true;
                              break L11;
                            }
                          }
                        } else {
                          hk.field_Lb[var13] = false;
                          var13++;
                          continue L13;
                        }
                      }
                    } else {
                      break L11;
                    }
                  }
                  if (!ud.field_b) {
                    ii.field_d.field_Y = false;
                    if (ii.field_d.field_G) {
                      L14: {
                        var9 = null;
                        if (!vi.field_l) {
                          break L14;
                        } else {
                          var9 = "<col=A00000>" + wg.field_d + "</col>";
                          var11 = var9;
                          var9 = var11;
                          var11 = var9;
                          var9 = var11;
                          break L14;
                        }
                      }
                      var10 = 0;
                      L15: while (true) {
                        if (var10 >= vb.field_h) {
                          wc.field_g = "<col=A00000>" + eg.field_F + "<br>" + ij.field_h + (String) (var9);
                          break L1;
                        } else {
                          L16: {
                            if (hk.field_Lb[var10]) {
                              var11_ref = "<col=A00000>" + bd.field_a[var10] + "</col>";
                              var9 = var11_ref;
                              var9 = var11_ref;
                              if (var9 != null) {
                                var9 = (String) (var9) + ", " + var11_ref;
                                break L16;
                              } else {
                                var9 = var11_ref;
                                break L16;
                              }
                            } else {
                              break L16;
                            }
                          }
                          var10++;
                          continue L15;
                        }
                      }
                    } else {
                      break L1;
                    }
                  } else {
                    break L1;
                  }
                } else {
                  L17: {
                    fb.field_o.field_Y = false;
                    l.field_b.field_V = bl.field_A;
                    if (var8 == 0) {
                      stackIn_24_0 = ma.field_f;
                      break L17;
                    } else {
                      stackIn_24_0 = uh.field_d;
                      break L17;
                    }
                  }
                  L18: {
                    var16 = stackIn_24_0;
                    var9 = var16;
                    var10 = jk.field_b.field_C.a(var16) - -(3 * jk.field_b.field_C.a('.'));
                    jk.field_b.field_lb = 0;
                    if ((rl.field_y & 48 ^ -1) == -17) {
                      var9 = var16 + ".";
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                  L19: {
                    jk.field_b.field_z = (-var10 + jk.field_b.field_K) / 2;
                    if ((48 & rl.field_y ^ -1) == -33) {
                      var9 = (String) (var9) + "..";
                      break L19;
                    } else {
                      break L19;
                    }
                  }
                  L20: {
                    if ((48 & rl.field_y) == 48) {
                      var9 = (String) (var9) + "...";
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                  jk.field_b.field_V = (String) (var9);
                  ii.field_d.field_V = vb.field_g.toUpperCase();
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L21: {
              L22: {
                stackIn_70_0 = ao.field_Eb;

                if (!param3) {
                  break L22;
                } else {
                  stackIn_70_0 = (km) ((Object) stackIn_70_0);

                  if (param1) {
                    break L22;
                  } else {
                    stackIn_70_0 = (km) ((Object) stackIn_70_0);

                    if (ad.field_h) {
                      break L22;
                    } else {
                      stackIn_71_0 = (km) ((Object) stackIn_70_0);
                      stackIn_71_1 = 1;
                      break L21;
                    }
                  }
                }
              }
              stackIn_71_0 = (km) ((Object) stackIn_70_0);
              stackIn_71_1 = 0;
              break L21;
            }
            L23: {
              L24: {
                ((km) (Object) stackIn_71_0).a(stackIn_71_1 != 0, (byte) 89);
                stackIn_75_0 = dm.field_r;

                if (!param3) {
                  break L24;
                } else {
                  stackIn_75_0 = (km) ((Object) stackIn_75_0);

                  if (param1) {
                    break L24;
                  } else {
                    stackIn_75_0 = (km) ((Object) stackIn_75_0);

                    if (ad.field_h) {
                      break L24;
                    } else {
                      stackIn_76_0 = (km) ((Object) stackIn_75_0);
                      stackIn_76_1 = 1;
                      break L23;
                    }
                  }
                }
              }
              stackIn_76_0 = (km) ((Object) stackIn_75_0);
              stackIn_76_1 = 0;
              break L23;
            }
            L25: {
              L26: {
                ((km) (Object) stackIn_76_0).a(stackIn_76_1 != 0, (byte) 103);
                stackIn_80_0 = pm.field_n;

                if (!param3) {
                  break L26;
                } else {
                  stackIn_80_0 = (km) ((Object) stackIn_80_0);

                  if (param1) {
                    break L26;
                  } else {
                    stackIn_80_0 = (km) ((Object) stackIn_80_0);

                    if (!ad.field_h) {
                      break L26;
                    } else {
                      stackIn_81_0 = (km) ((Object) stackIn_80_0);
                      stackIn_81_1 = 1;
                      break L25;
                    }
                  }
                }
              }
              stackIn_81_0 = (km) ((Object) stackIn_80_0);
              stackIn_81_1 = 0;
              break L25;
            }
            L27: {
              ((km) (Object) stackIn_81_0).a(stackIn_81_1 != 0, (byte) 100);
              he.field_pc.field_c.g(0);
              if (!param0) {
                break L27;
              } else {
                field_f = 123;
                break L27;
              }
            }
            L28: {
              if (null != la.field_h) {
                L29: {
                  if (-1 != (fb.field_o.field_nb ^ -1)) {
                    ub.b(param2, -12508);
                    break L29;
                  } else {
                    break L29;
                  }
                }
                L30: {
                  if (0 != ii.field_d.field_nb) {
                    if (!ld.field_c) {
                      em.a((byte) -55, param2);
                      break L30;
                    } else {
                      qa.a(3, param2);
                      break L30;
                    }
                  } else {
                    break L30;
                  }
                }
                co.a(param2, true, -2137400888, la.field_h);
                break L28;
              } else {
                break L28;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw kg.a((Throwable) ((Object) var4), "eb.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    eb() {
        this.field_e = new wb();
        this.field_e.field_h = this.field_e;
        this.field_e.field_k = this.field_e;
    }

    static {
        field_g = "Offer rematch";
        field_a = "Cancel";
    }
}
