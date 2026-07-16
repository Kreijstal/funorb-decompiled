/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qi {
    private boolean field_d;
    private int field_q;
    private int field_o;
    private int field_f;
    private int field_e;
    private int field_c;
    static String field_b;
    private int field_n;
    private int field_a;
    private int field_i;
    private int field_r;
    private int field_l;
    private int field_p;
    private int field_g;
    private jb field_m;
    private int field_h;
    private float field_s;
    private int field_j;
    private int field_k;

    final ui c(int param0) {
        ((qi) this).field_n = rg.field_R;
        ((qi) this).field_p = rg.field_P;
        ((qi) this).field_m.a(((qi) this).field_l, ((qi) this).field_j, -93);
        tj.field_F = false;
        ui var2 = hb.a(0, ((qi) this).field_j, param0, ((qi) this).field_l, 0, ld.field_g);
        if (var2 == null) {
            ((qi) this).a(122);
        }
        return var2;
    }

    final static boolean d(int param0) {
        if (param0 != -1) {
            field_b = null;
        }
        return wi.field_J;
    }

    final void a(boolean param0) {
        if (null == ki.field_E) {
          L0: {
            if (-1 <= (hl.field_a ^ -1)) {
              ((qi) this).field_d = false;
              break L0;
            } else {
              break L0;
            }
          }
          if (((qi) this).field_d) {
            int fieldTemp$2 = ((qi) this).field_e - 1;
            ((qi) this).field_e = ((qi) this).field_e - 1;
            if ((fieldTemp$2 ^ -1) < -1) {
              return;
            } else {
              L1: {
                if (param0) {
                  break L1;
                } else {
                  ((qi) this).a(true);
                  break L1;
                }
              }
              ((qi) this).field_e = ((qi) this).field_c;
              if (((qi) this).field_q > jd.field_b) {
                ((qi) this).field_d = false;
                return;
              } else {
                this.a((byte) 99);
                return;
              }
            }
          } else {
            L2: {
              if (rg.field_R >= ((qi) this).field_o) {
                if ((((qi) this).field_o ^ -1) < -1) {
                  ph.field_o = 0;
                  break L2;
                } else {
                  break L2;
                }
              } else {
                ph.field_o = (-rg.field_R + ((qi) this).field_o) / 2;
                break L2;
              }
            }
            L3: {
              L4: {
                if (((qi) this).field_f != rg.field_R) {
                  break L4;
                } else {
                  if (rg.field_P != ((qi) this).field_g) {
                    break L4;
                  } else {
                    break L3;
                  }
                }
              }
              ((qi) this).field_m.a(((qi) this).field_g, ((qi) this).field_f, -113);
              break L3;
            }
            return;
          }
        } else {
          return;
        }
    }

    public static void b(boolean param0) {
        field_b = null;
        if (param0) {
            field_b = null;
        }
    }

    final void a(int param0) {
        ((qi) this).field_m.a(((qi) this).field_p, ((qi) this).field_n, -112);
        if (param0 <= 17) {
            ((qi) this).a(25);
        }
    }

    final void a(byte param0, int param1, int param2) {
        if (param0 >= -56) {
            ((qi) this).field_i = -13;
        }
        ((qi) this).field_o = param2;
        ((qi) this).field_k = param1;
    }

    final static int a(ne param0, ne param1, String param2, int param3, int param4, boolean param5, int param6) {
        String var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        int var10 = 0;
        String var11_ref_String = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        String var14 = null;
        CharSequence var15 = null;
        va stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        va stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        va stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        String stackIn_10_2 = null;
        va stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        va stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        va stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        String stackIn_13_2 = null;
        va stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        va stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        String stackOut_9_2 = null;
        va stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        String stackOut_8_2 = null;
        va stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        va stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        String stackOut_12_2 = null;
        va stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        String stackOut_11_2 = null;
        L0: {
          var13 = wizardrun.field_H;
          var14 = param0.a(160);
          var8 = param1.a(160);
          var11_ref_String = var8;
          if (null == jc.field_H) {
            if (!ol.a(127, false)) {
              return -1;
            } else {
              break L0;
            }
          } else {
            break L0;
          }
        }
        L1: {
          if (tj.field_G != wh.field_j) {
            break L1;
          } else {
            L2: {
              gh.field_c = null;
              n.field_b.field_m = 0;
              if (param2 != null) {
                L3: {
                  var9 = 0;
                  re.field_G.field_m = 0;
                  if (!param5) {
                    break L3;
                  } else {
                    var9 = var9 | 1;
                    break L3;
                  }
                }
                L4: {
                  re.field_G.f(oi.field_c.nextInt(), param6 + 612976077);
                  re.field_G.f(oi.field_c.nextInt(), 613003928);
                  re.field_G.b(param6 + -27851, var14);
                  re.field_G.b(param6 ^ 27851, var8);
                  var15 = (CharSequence) (Object) param2;
                  re.field_G.b(0, fi.a(var15, param6 + -27768));
                  re.field_G.b(param6 + -1947107139, param4);
                  re.field_G.b((byte) 11, param3);
                  re.field_G.b((byte) 11, var9);
                  n.field_b.b((byte) 11, 18);
                  n.field_b.field_m = n.field_b.field_m + 2;
                  var10 = n.field_b.field_m;
                  var11_ref_String = fb.a(jg.f(1), (byte) 102);
                  if (var11_ref_String != null) {
                    break L4;
                  } else {
                    var11_ref_String = "";
                    break L4;
                  }
                }
                n.field_b.a(var11_ref_String, false);
                pa.a(ag.field_s, 0, ad.field_d, re.field_G, (va) (Object) n.field_b);
                n.field_b.a(n.field_b.field_m + -var10, (byte) -67);
                break L2;
              } else {
                L5: {
                  re.field_G.field_m = 0;
                  re.field_G.f(oi.field_c.nextInt(), 613003928);
                  re.field_G.f(oi.field_c.nextInt(), 613003928);
                  stackOut_7_0 = re.field_G;
                  stackOut_7_1 = 0;
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_8_0 = stackOut_7_0;
                  stackIn_8_1 = stackOut_7_1;
                  if (!param0.c((byte) 127)) {
                    stackOut_9_0 = (va) (Object) stackIn_9_0;
                    stackOut_9_1 = stackIn_9_1;
                    stackOut_9_2 = "";
                    stackIn_10_0 = stackOut_9_0;
                    stackIn_10_1 = stackOut_9_1;
                    stackIn_10_2 = stackOut_9_2;
                    break L5;
                  } else {
                    stackOut_8_0 = (va) (Object) stackIn_8_0;
                    stackOut_8_1 = stackIn_8_1;
                    stackOut_8_2 = (String) var14;
                    stackIn_10_0 = stackOut_8_0;
                    stackIn_10_1 = stackOut_8_1;
                    stackIn_10_2 = stackOut_8_2;
                    break L5;
                  }
                }
                L6: {
                  ((va) (Object) stackIn_10_0).b(stackIn_10_1, stackIn_10_2);
                  stackOut_10_0 = re.field_G;
                  stackOut_10_1 = 0;
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_12_1 = stackOut_10_1;
                  stackIn_11_0 = stackOut_10_0;
                  stackIn_11_1 = stackOut_10_1;
                  if (!param1.c((byte) 125)) {
                    stackOut_12_0 = (va) (Object) stackIn_12_0;
                    stackOut_12_1 = stackIn_12_1;
                    stackOut_12_2 = "";
                    stackIn_13_0 = stackOut_12_0;
                    stackIn_13_1 = stackOut_12_1;
                    stackIn_13_2 = stackOut_12_2;
                    break L6;
                  } else {
                    stackOut_11_0 = (va) (Object) stackIn_11_0;
                    stackOut_11_1 = stackIn_11_1;
                    stackOut_11_2 = (String) var8;
                    stackIn_13_0 = stackOut_11_0;
                    stackIn_13_1 = stackOut_11_1;
                    stackIn_13_2 = stackOut_11_2;
                    break L6;
                  }
                }
                ((va) (Object) stackIn_13_0).b(stackIn_13_1, stackIn_13_2);
                n.field_b.b((byte) 11, 16);
                n.field_b.field_m = n.field_b.field_m + 1;
                var9 = n.field_b.field_m;
                pa.a(ag.field_s, 0, ad.field_d, re.field_G, (va) (Object) n.field_b);
                n.field_b.a(n.field_b.field_m + -var9, -115);
                break L2;
              }
            }
            id.a((byte) -67, -1);
            wh.field_j = va.field_l;
            break L1;
          }
        }
        L7: {
          if (param6 == 27851) {
            break L7;
          } else {
            field_b = null;
            break L7;
          }
        }
        L8: {
          if (wh.field_j != va.field_l) {
            break L8;
          } else {
            if (hc.a(1, -28266)) {
              L9: {
                var9 = nk.field_N.f(255);
                nk.field_N.field_m = 0;
                if ((var9 ^ -1) > -101) {
                  break L9;
                } else {
                  if (-106 <= (var9 ^ -1)) {
                    pd.field_I = new String[-100 + var9];
                    wh.field_j = vj.field_a;
                    break L8;
                  } else {
                    break L9;
                  }
                }
              }
              if (-249 != (var9 ^ -1)) {
                if ((var9 ^ -1) == -100) {
                  boolean discarded$1 = hc.a(uf.a(true), param6 ^ -675);
                  gh.field_c = new Boolean(qj.a((byte) -100, (va) (Object) nk.field_N));
                  nk.field_N.field_m = 0;
                  break L8;
                } else {
                  wh.field_j = gf.field_ib;
                  ra.field_k = var9;
                  gd.field_c = -1;
                  break L8;
                }
              } else {
                tj.a(3088, jg.f(param6 ^ 27850));
                bh.field_g = ii.field_b;
                ql.a(-71);
                n.field_a = false;
                return var9;
              }
            } else {
              break L8;
            }
          }
        }
        L10: {
          if (wh.field_j != vj.field_a) {
            break L10;
          } else {
            var9 = 2;
            if (!hc.a(var9, -28266)) {
              break L10;
            } else {
              var10 = nk.field_N.j(param6 + -42328);
              nk.field_N.field_m = 0;
              if (!hc.a(var10, -28266)) {
                break L10;
              } else {
                var11 = pd.field_I.length;
                var12 = 0;
                L11: while (true) {
                  if (var11 <= var12) {
                    ql.a(-107);
                    n.field_a = false;
                    return 100 + var11;
                  } else {
                    pd.field_I[var12] = nk.field_N.h(727059944);
                    var12++;
                    continue L11;
                  }
                }
              }
            }
          }
        }
        L12: {
          if (gf.field_ib == wh.field_j) {
            if (bd.b(92)) {
              L13: {
                if ((ra.field_k ^ -1) != -256) {
                  bh.field_g = nk.field_N.d(0);
                  break L13;
                } else {
                  var9_ref_String = nk.field_N.c(-1);
                  if (var9_ref_String == null) {
                    break L13;
                  } else {
                    q.a(26017, jg.f(1), var9_ref_String);
                    break L13;
                  }
                }
              }
              ql.a(-36);
              n.field_a = false;
              return ra.field_k;
            } else {
              break L12;
            }
          } else {
            break L12;
          }
        }
        L14: {
          if (jc.field_H != null) {
            break L14;
          } else {
            if (!n.field_a) {
              var9 = vl.field_d;
              vl.field_d = tj.field_J;
              tj.field_J = var9;
              n.field_a = true;
              break L14;
            } else {
              L15: {
                if (eh.a(2) > 30000L) {
                  bh.field_g = sa.field_b;
                  break L15;
                } else {
                  bh.field_g = fg.field_d;
                  break L15;
                }
              }
              n.field_a = false;
              return 249;
            }
          }
        }
        return -1;
    }

    final static void e(int param0) {
        d.field_a = nk.field_N.d(param0 ^ param0);
        CharSequence var2 = (CharSequence) (Object) d.field_a;
        wl.field_a = ta.a(-49, var2);
    }

    final boolean b(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == 0) {
            break L0;
          } else {
            qi.e(61);
            break L0;
          }
        }
        L1: {
          L2: {
            if (jd.field_b < ((qi) this).field_q) {
              break L2;
            } else {
              if (0 >= hl.field_a) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    private final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = wizardrun.field_H;
          if (param0 == 99) {
            break L0;
          } else {
            ((qi) this).field_c = -121;
            break L0;
          }
        }
        var2 = ((qi) this).field_o;
        var3 = ((qi) this).field_k;
        if (!((qi) this).b(0)) {
          ((qi) this).field_d = false;
          return;
        } else {
          L1: {
            if (((qi) this).field_r < var2) {
              var2 = ((qi) this).field_r;
              break L1;
            } else {
              if (var2 < ((qi) this).field_a) {
                var2 = ((qi) this).field_a;
                break L1;
              } else {
                break L1;
              }
            }
          }
          L2: {
            if (var3 > ((qi) this).field_i) {
              var3 = ((qi) this).field_i;
              break L2;
            } else {
              if (((qi) this).field_h > var3) {
                var3 = ((qi) this).field_h;
                break L2;
              } else {
                break L2;
              }
            }
          }
          L3: {
            if (0.0f >= ((qi) this).field_s) {
              break L3;
            } else {
              var4 = (int)(((qi) this).field_s * (float)var3 + 0.5f);
              if (var4 <= var2) {
                if (var4 >= var2) {
                  break L3;
                } else {
                  var2 = var4;
                  break L3;
                }
              } else {
                var3 = (int)((float)var2 / ((qi) this).field_s);
                break L3;
              }
            }
          }
          L4: {
            L5: {
              if (rg.field_R != var2) {
                break L5;
              } else {
                if (rg.field_P != var3) {
                  break L5;
                } else {
                  break L4;
                }
              }
            }
            ((qi) this).field_m.a(var3, var2, -109);
            break L4;
          }
          L6: {
            if (((qi) this).field_o <= 0) {
              break L6;
            } else {
              ph.field_o = (-rg.field_R + ((qi) this).field_o) / 2;
              break L6;
            }
          }
          return;
        }
    }

    private qi() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
    }
}
