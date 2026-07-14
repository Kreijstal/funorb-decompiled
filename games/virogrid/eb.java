/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;
import java.lang.String;

final class eb implements Iterable {
    static km field_b;
    static int field_f;
    static String field_a;
    static int field_d;
    static String field_g;
    wb field_e;
    static km field_c;

    final void a(boolean param0, wb param1) {
        if (!(param1.field_k == null)) {
            param1.c(52);
        }
        param1.field_k = ((eb) this).field_e.field_k;
        param1.field_h = ((eb) this).field_e;
        param1.field_k.field_h = param1;
        param1.field_h.field_k = param1;
        if (!param0) {
            wb discarded$0 = ((eb) this).a(27);
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
            Object var3 = null;
            ((eb) this).a(true, (wb) null);
        }
        wb var2 = ((eb) this).field_e.field_h;
        if (((eb) this).field_e == var2) {
            return null;
        }
        var2.c(63);
        return var2;
    }

    public final Iterator iterator() {
        return (Iterator) (Object) new f((eb) this);
    }

    final static void a(boolean param0, boolean param1, int param2, boolean param3) {
        km var5 = null;
        km var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        String var9 = null;
        int var10 = 0;
        int var11_int = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        km var15 = null;
        String var16 = null;
        km var17 = null;
        int stackIn_10_0 = 0;
        String stackIn_25_0 = null;
        km stackIn_36_0 = null;
        km stackIn_37_0 = null;
        km stackIn_38_0 = null;
        String stackIn_38_1 = null;
        km stackIn_39_0 = null;
        String[] stackIn_39_1 = null;
        km stackIn_40_0 = null;
        String[] stackIn_40_1 = null;
        km stackIn_41_0 = null;
        String[] stackIn_41_1 = null;
        String stackIn_41_2 = null;
        km stackIn_67_0 = null;
        km stackIn_68_0 = null;
        km stackIn_69_0 = null;
        km stackIn_70_0 = null;
        km stackIn_71_0 = null;
        int stackIn_71_1 = 0;
        km stackIn_72_0 = null;
        km stackIn_73_0 = null;
        km stackIn_74_0 = null;
        km stackIn_75_0 = null;
        km stackIn_76_0 = null;
        int stackIn_76_1 = 0;
        km stackIn_77_0 = null;
        km stackIn_78_0 = null;
        km stackIn_79_0 = null;
        km stackIn_80_0 = null;
        km stackIn_81_0 = null;
        int stackIn_81_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        km stackOut_35_0 = null;
        km stackOut_37_0 = null;
        String stackOut_37_1 = null;
        km stackOut_36_0 = null;
        String stackOut_36_1 = null;
        km stackOut_38_0 = null;
        String[] stackOut_38_1 = null;
        km stackOut_40_0 = null;
        String[] stackOut_40_1 = null;
        String stackOut_40_2 = null;
        km stackOut_39_0 = null;
        String[] stackOut_39_1 = null;
        String stackOut_39_2 = null;
        String stackOut_24_0 = null;
        String stackOut_23_0 = null;
        km stackOut_66_0 = null;
        km stackOut_67_0 = null;
        km stackOut_68_0 = null;
        km stackOut_69_0 = null;
        int stackOut_69_1 = 0;
        km stackOut_70_0 = null;
        int stackOut_70_1 = 0;
        km stackOut_71_0 = null;
        km stackOut_72_0 = null;
        km stackOut_73_0 = null;
        km stackOut_74_0 = null;
        int stackOut_74_1 = 0;
        km stackOut_75_0 = null;
        int stackOut_75_1 = 0;
        km stackOut_76_0 = null;
        km stackOut_77_0 = null;
        km stackOut_78_0 = null;
        km stackOut_79_0 = null;
        int stackOut_79_1 = 0;
        km stackOut_80_0 = null;
        int stackOut_80_1 = 0;
        L0: {
          var12 = Virogrid.field_F ? 1 : 0;
          rf.a(hn.field_h, -4);
          if (la.field_h != null) {
            L1: {
              L2: {
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
                if (vj.field_b.length != -2) {
                  break L2;
                } else {
                  if (-3 != vj.field_b[0]) {
                    break L2;
                  } else {
                    var8 = 0;
                    break L1;
                  }
                }
              }
              var8 = 0;
              var9_int = 0;
              var10 = 0;
              L3: while (true) {
                L4: {
                  if (var10 >= vj.field_b.length) {
                    break L4;
                  } else {
                    L5: {
                      if (0 == (kn.field_E[var10 / 8] & 1 << (7 & var10))) {
                        stackOut_9_0 = 0;
                        stackIn_10_0 = stackOut_9_0;
                        break L5;
                      } else {
                        stackOut_8_0 = 1;
                        stackIn_10_0 = stackOut_8_0;
                        break L5;
                      }
                    }
                    L6: {
                      var11_int = stackIn_10_0;
                      if (var11_int != 0) {
                        var9_int++;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    if (var11_int != 0) {
                      if ((vj.field_b[var10] ^ -1) != -3) {
                        var8 = 1;
                        break L4;
                      } else {
                        var10++;
                        continue L3;
                      }
                    } else {
                      var10++;
                      continue L3;
                    }
                  }
                }
                if (0 != var9_int) {
                  break L1;
                } else {
                  var8 = 1;
                  break L1;
                }
              }
            }
            ii.field_d.field_Y = true;
            if (!ld.field_c) {
              L7: {
                stackOut_35_0 = ii.field_d;
                stackIn_37_0 = stackOut_35_0;
                stackIn_36_0 = stackOut_35_0;
                if (var8 != 0) {
                  stackOut_37_0 = (km) (Object) stackIn_37_0;
                  stackOut_37_1 = p.field_g;
                  stackIn_38_0 = stackOut_37_0;
                  stackIn_38_1 = stackOut_37_1;
                  break L7;
                } else {
                  stackOut_36_0 = (km) (Object) stackIn_36_0;
                  stackOut_36_1 = gf.field_x;
                  stackIn_38_0 = stackOut_36_0;
                  stackIn_38_1 = stackOut_36_1;
                  break L7;
                }
              }
              L8: {
                stackIn_38_0.field_V = ((String) (Object) stackIn_38_1).toUpperCase();
                stackOut_38_0 = l.field_b;
                stackOut_38_1 = new String[]{ii.field_d.field_V};
                stackIn_40_0 = stackOut_38_0;
                stackIn_40_1 = stackOut_38_1;
                stackIn_39_0 = stackOut_38_0;
                stackIn_39_1 = stackOut_38_1;
                if (var8 != 0) {
                  stackOut_40_0 = (km) (Object) stackIn_40_0;
                  stackOut_40_1 = (String[]) (Object) stackIn_40_1;
                  stackOut_40_2 = ok.field_K;
                  stackIn_41_0 = stackOut_40_0;
                  stackIn_41_1 = stackOut_40_1;
                  stackIn_41_2 = stackOut_40_2;
                  break L8;
                } else {
                  stackOut_39_0 = (km) (Object) stackIn_39_0;
                  stackOut_39_1 = (String[]) (Object) stackIn_39_1;
                  stackOut_39_2 = h.field_b;
                  stackIn_41_0 = stackOut_39_0;
                  stackIn_41_1 = stackOut_39_1;
                  stackIn_41_2 = stackOut_39_2;
                  break L8;
                }
              }
              L9: {
                stackIn_41_0.field_V = oi.a(stackIn_41_1, stackIn_41_2, 2);
                jk.field_b.field_V = nl.field_v;
                ud.field_b = true;
                fb.field_o.field_Y = true;
                if (nb.field_q != null) {
                  L10: {
                    vi.field_l = false;
                    ud.field_b = false;
                    if (null == ub.field_D) {
                      hk.field_Lb = new boolean[vb.field_h];
                      ub.field_D = new byte[vb.field_h];
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  var13 = 0;
                  var9_int = var13;
                  L11: while (true) {
                    if (var13 >= vb.field_h) {
                      kn.a(true, -1, -1, vb.field_h, 0, 8, -1, la.field_h);
                      if (2 > hd.field_d) {
                        break L9;
                      } else {
                        if (!dc.field_Y[12]) {
                          break L9;
                        } else {
                          ud.field_b = true;
                          break L9;
                        }
                      }
                    } else {
                      hk.field_Lb[var13] = false;
                      var13++;
                      continue L11;
                    }
                  }
                } else {
                  break L9;
                }
              }
              if (!ud.field_b) {
                ii.field_d.field_Y = false;
                if (ii.field_d.field_G) {
                  L12: {
                    var9 = null;
                    if (!vi.field_l) {
                      break L12;
                    } else {
                      var9 = "<col=A00000>" + wg.field_d + "</col>";
                      var11 = var9;
                      var9 = var11;
                      var11 = var9;
                      var9 = var11;
                      break L12;
                    }
                  }
                  var10 = 0;
                  L13: while (true) {
                    if (var10 >= vb.field_h) {
                      wc.field_g = "<col=A00000>" + eg.field_F + "<br>" + ij.field_h + var9;
                      break L0;
                    } else {
                      if (hk.field_Lb[var10]) {
                        var11 = "<col=A00000>" + bd.field_a[var10] + "</col>";
                        var9 = var11;
                        var9 = var11;
                        if (var9 != null) {
                          var9 = var9 + ", " + var11;
                          var10++;
                          continue L13;
                        } else {
                          var9 = var11;
                          var10++;
                          continue L13;
                        }
                      } else {
                        var10++;
                        continue L13;
                      }
                    }
                  }
                } else {
                  break L0;
                }
              } else {
                break L0;
              }
            } else {
              L14: {
                fb.field_o.field_Y = false;
                l.field_b.field_V = bl.field_A;
                if (var8 == 0) {
                  stackOut_24_0 = ma.field_f;
                  stackIn_25_0 = stackOut_24_0;
                  break L14;
                } else {
                  stackOut_23_0 = uh.field_d;
                  stackIn_25_0 = stackOut_23_0;
                  break L14;
                }
              }
              L15: {
                var16 = stackIn_25_0;
                var9 = var16;
                var10 = jk.field_b.field_C.a(var16) - -(3 * jk.field_b.field_C.a('.'));
                jk.field_b.field_lb = 0;
                if ((rl.field_y & 48 ^ -1) == -17) {
                  var9 = var16 + ".";
                  break L15;
                } else {
                  break L15;
                }
              }
              L16: {
                jk.field_b.field_z = (-var10 + jk.field_b.field_K) / 2;
                if ((48 & rl.field_y ^ -1) == -33) {
                  var9 = var9 + "..";
                  break L16;
                } else {
                  break L16;
                }
              }
              L17: {
                if ((48 & rl.field_y) == 48) {
                  var9 = var9 + "...";
                  break L17;
                } else {
                  break L17;
                }
              }
              jk.field_b.field_V = var9;
              ii.field_d.field_V = vb.field_g.toUpperCase();
              break L0;
            }
          } else {
            break L0;
          }
        }
        L18: {
          L19: {
            stackOut_66_0 = ao.field_Eb;
            stackIn_70_0 = stackOut_66_0;
            stackIn_67_0 = stackOut_66_0;
            if (!param3) {
              break L19;
            } else {
              stackOut_67_0 = (km) (Object) stackIn_67_0;
              stackIn_70_0 = stackOut_67_0;
              stackIn_68_0 = stackOut_67_0;
              if (param1) {
                break L19;
              } else {
                stackOut_68_0 = (km) (Object) stackIn_68_0;
                stackIn_70_0 = stackOut_68_0;
                stackIn_69_0 = stackOut_68_0;
                if (ad.field_h) {
                  break L19;
                } else {
                  stackOut_69_0 = (km) (Object) stackIn_69_0;
                  stackOut_69_1 = 1;
                  stackIn_71_0 = stackOut_69_0;
                  stackIn_71_1 = stackOut_69_1;
                  break L18;
                }
              }
            }
          }
          stackOut_70_0 = (km) (Object) stackIn_70_0;
          stackOut_70_1 = 0;
          stackIn_71_0 = stackOut_70_0;
          stackIn_71_1 = stackOut_70_1;
          break L18;
        }
        L20: {
          L21: {
            ((km) (Object) stackIn_71_0).a(stackIn_71_1 != 0, (byte) 89);
            stackOut_71_0 = dm.field_r;
            stackIn_75_0 = stackOut_71_0;
            stackIn_72_0 = stackOut_71_0;
            if (!param3) {
              break L21;
            } else {
              stackOut_72_0 = (km) (Object) stackIn_72_0;
              stackIn_75_0 = stackOut_72_0;
              stackIn_73_0 = stackOut_72_0;
              if (param1) {
                break L21;
              } else {
                stackOut_73_0 = (km) (Object) stackIn_73_0;
                stackIn_75_0 = stackOut_73_0;
                stackIn_74_0 = stackOut_73_0;
                if (ad.field_h) {
                  break L21;
                } else {
                  stackOut_74_0 = (km) (Object) stackIn_74_0;
                  stackOut_74_1 = 1;
                  stackIn_76_0 = stackOut_74_0;
                  stackIn_76_1 = stackOut_74_1;
                  break L20;
                }
              }
            }
          }
          stackOut_75_0 = (km) (Object) stackIn_75_0;
          stackOut_75_1 = 0;
          stackIn_76_0 = stackOut_75_0;
          stackIn_76_1 = stackOut_75_1;
          break L20;
        }
        L22: {
          L23: {
            ((km) (Object) stackIn_76_0).a(stackIn_76_1 != 0, (byte) 103);
            stackOut_76_0 = pm.field_n;
            stackIn_80_0 = stackOut_76_0;
            stackIn_77_0 = stackOut_76_0;
            if (!param3) {
              break L23;
            } else {
              stackOut_77_0 = (km) (Object) stackIn_77_0;
              stackIn_80_0 = stackOut_77_0;
              stackIn_78_0 = stackOut_77_0;
              if (param1) {
                break L23;
              } else {
                stackOut_78_0 = (km) (Object) stackIn_78_0;
                stackIn_80_0 = stackOut_78_0;
                stackIn_79_0 = stackOut_78_0;
                if (!ad.field_h) {
                  break L23;
                } else {
                  stackOut_79_0 = (km) (Object) stackIn_79_0;
                  stackOut_79_1 = 1;
                  stackIn_81_0 = stackOut_79_0;
                  stackIn_81_1 = stackOut_79_1;
                  break L22;
                }
              }
            }
          }
          stackOut_80_0 = (km) (Object) stackIn_80_0;
          stackOut_80_1 = 0;
          stackIn_81_0 = stackOut_80_0;
          stackIn_81_1 = stackOut_80_1;
          break L22;
        }
        L24: {
          ((km) (Object) stackIn_81_0).a(stackIn_81_1 != 0, (byte) 100);
          he.field_pc.field_c.g(0);
          if (!param0) {
            break L24;
          } else {
            field_f = 123;
            break L24;
          }
        }
        L25: {
          if (null != la.field_h) {
            L26: {
              if (-1 != (fb.field_o.field_nb ^ -1)) {
                ub.b(param2, -12508);
                break L26;
              } else {
                break L26;
              }
            }
            L27: {
              if (0 != ii.field_d.field_nb) {
                if (!ld.field_c) {
                  em.a((byte) -55, param2);
                  break L27;
                } else {
                  qa.a(3, param2);
                  break L27;
                }
              } else {
                break L27;
              }
            }
            co.a(param2, true, -2137400888, la.field_h);
            break L25;
          } else {
            break L25;
          }
        }
    }

    eb() {
        ((eb) this).field_e = new wb();
        ((eb) this).field_e.field_h = ((eb) this).field_e;
        ((eb) this).field_e.field_k = ((eb) this).field_e;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Offer rematch";
        field_a = "Cancel";
    }
}
