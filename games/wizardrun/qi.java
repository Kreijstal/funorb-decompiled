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
        this.field_n = rg.field_R;
        this.field_p = rg.field_P;
        this.field_m.a(this.field_l, this.field_j, -93);
        tj.field_F = false;
        ui var2 = hb.a(0, this.field_j, param0, this.field_l, 0, ld.field_g);
        if (var2 == null) {
            this.a(122);
        }
        return var2;
    }

    final static boolean d(int param0) {
        if (param0 != -1) {
            field_b = (String) null;
        }
        return wi.field_J;
    }

    final void a(boolean param0) {
        int fieldTemp$2 = 0;
        if (null == ki.field_E) {
          L0: {
            if (-1 <= (hl.field_a ^ -1)) {
              this.field_d = false;
              break L0;
            } else {
              break L0;
            }
          }
          if (this.field_d) {
            fieldTemp$2 = this.field_e - 1;
            this.field_e = this.field_e - 1;
            if ((fieldTemp$2 ^ -1) < -1) {
              return;
            } else {
              L1: {
                if (param0) {
                  break L1;
                } else {
                  this.a(true);
                  break L1;
                }
              }
              this.field_e = this.field_c;
              if (this.field_q > jd.field_b) {
                this.field_d = false;
                return;
              } else {
                this.a((byte) 99);
                return;
              }
            }
          } else {
            L2: {
              if (rg.field_R >= this.field_o) {
                if ((this.field_o ^ -1) < -1) {
                  ph.field_o = 0;
                  break L2;
                } else {
                  break L2;
                }
              } else {
                ph.field_o = (-rg.field_R + this.field_o) / 2;
                break L2;
              }
            }
            L3: {
              L4: {
                if (this.field_f != rg.field_R) {
                  break L4;
                } else {
                  if (rg.field_P != this.field_g) {
                    break L4;
                  } else {
                    break L3;
                  }
                }
              }
              this.field_m.a(this.field_g, this.field_f, -113);
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
            field_b = (String) null;
        }
    }

    final void a(int param0) {
        this.field_m.a(this.field_p, this.field_n, -112);
        if (param0 <= 17) {
            this.a(25);
        }
    }

    final void a(byte param0, int param1, int param2) {
        if (param0 >= -56) {
            this.field_i = -13;
        }
        this.field_o = param2;
        this.field_k = param1;
    }

    final static int a(ne param0, ne param1, String param2, int param3, int param4, boolean param5, int param6) {
        boolean discarded$1 = false;
        RuntimeException var7 = null;
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
        int stackIn_6_0 = 0;
        va stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        va stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        va stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        String stackIn_12_2 = null;
        va stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        va stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        va stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        String stackIn_15_2 = null;
        int stackIn_32_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_64_0 = 0;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_68_2 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        va stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        va stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        String stackOut_11_2 = null;
        va stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        String stackOut_10_2 = null;
        va stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        va stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        String stackOut_14_2 = null;
        va stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        String stackOut_13_2 = null;
        int stackOut_31_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_63_0 = 0;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        String stackOut_67_2 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        String stackOut_66_2 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        var13 = wizardrun.field_H;
        try {
          L0: {
            L1: {
              var14 = param0.a(160);
              var8 = param1.a(160);
              var11_ref_String = var8;
              if (null == jc.field_H) {
                if (!ol.a(127, false)) {
                  stackOut_5_0 = -1;
                  stackIn_6_0 = stackOut_5_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L2: {
              if (tj.field_G != wh.field_j) {
                break L2;
              } else {
                L3: {
                  gh.field_c = null;
                  n.field_b.field_m = 0;
                  if (param2 != null) {
                    L4: {
                      var9 = 0;
                      re.field_G.field_m = 0;
                      if (!param5) {
                        break L4;
                      } else {
                        var9 = var9 | 1;
                        break L4;
                      }
                    }
                    L5: {
                      re.field_G.f(oi.field_c.nextInt(), param6 + 612976077);
                      re.field_G.f(oi.field_c.nextInt(), 613003928);
                      re.field_G.b(param6 + -27851, var14);
                      re.field_G.b(param6 ^ 27851, var8);
                      var15 = (CharSequence) ((Object) param2);
                      re.field_G.b(0, fi.a(var15, param6 + -27768));
                      re.field_G.b(param6 + -1947107139, param4);
                      re.field_G.b((byte) 11, param3);
                      re.field_G.b((byte) 11, var9);
                      n.field_b.b((byte) 11, 18);
                      n.field_b.field_m = n.field_b.field_m + 2;
                      var10 = n.field_b.field_m;
                      var11_ref_String = fb.a(jg.f(1), (byte) 102);
                      if (var11_ref_String != null) {
                        break L5;
                      } else {
                        var11_ref_String = "";
                        break L5;
                      }
                    }
                    n.field_b.a(var11_ref_String, false);
                    pa.a(ag.field_s, 0, ad.field_d, re.field_G, n.field_b);
                    n.field_b.a(n.field_b.field_m + -var10, (byte) -67);
                    break L3;
                  } else {
                    L6: {
                      re.field_G.field_m = 0;
                      re.field_G.f(oi.field_c.nextInt(), 613003928);
                      re.field_G.f(oi.field_c.nextInt(), 613003928);
                      stackOut_9_0 = re.field_G;
                      stackOut_9_1 = 0;
                      stackIn_11_0 = stackOut_9_0;
                      stackIn_11_1 = stackOut_9_1;
                      stackIn_10_0 = stackOut_9_0;
                      stackIn_10_1 = stackOut_9_1;
                      if (!param0.c((byte) 127)) {
                        stackOut_11_0 = (va) ((Object) stackIn_11_0);
                        stackOut_11_1 = stackIn_11_1;
                        stackOut_11_2 = "";
                        stackIn_12_0 = stackOut_11_0;
                        stackIn_12_1 = stackOut_11_1;
                        stackIn_12_2 = stackOut_11_2;
                        break L6;
                      } else {
                        stackOut_10_0 = (va) ((Object) stackIn_10_0);
                        stackOut_10_1 = stackIn_10_1;
                        stackOut_10_2 = (String) (var14);
                        stackIn_12_0 = stackOut_10_0;
                        stackIn_12_1 = stackOut_10_1;
                        stackIn_12_2 = stackOut_10_2;
                        break L6;
                      }
                    }
                    L7: {
                      ((va) (Object) stackIn_12_0).b(stackIn_12_1, stackIn_12_2);
                      stackOut_12_0 = re.field_G;
                      stackOut_12_1 = 0;
                      stackIn_14_0 = stackOut_12_0;
                      stackIn_14_1 = stackOut_12_1;
                      stackIn_13_0 = stackOut_12_0;
                      stackIn_13_1 = stackOut_12_1;
                      if (!param1.c((byte) 125)) {
                        stackOut_14_0 = (va) ((Object) stackIn_14_0);
                        stackOut_14_1 = stackIn_14_1;
                        stackOut_14_2 = "";
                        stackIn_15_0 = stackOut_14_0;
                        stackIn_15_1 = stackOut_14_1;
                        stackIn_15_2 = stackOut_14_2;
                        break L7;
                      } else {
                        stackOut_13_0 = (va) ((Object) stackIn_13_0);
                        stackOut_13_1 = stackIn_13_1;
                        stackOut_13_2 = (String) (var8);
                        stackIn_15_0 = stackOut_13_0;
                        stackIn_15_1 = stackOut_13_1;
                        stackIn_15_2 = stackOut_13_2;
                        break L7;
                      }
                    }
                    ((va) (Object) stackIn_15_0).b(stackIn_15_1, stackIn_15_2);
                    n.field_b.b((byte) 11, 16);
                    n.field_b.field_m = n.field_b.field_m + 1;
                    var9 = n.field_b.field_m;
                    pa.a(ag.field_s, 0, ad.field_d, re.field_G, n.field_b);
                    n.field_b.a(n.field_b.field_m + -var9, -115);
                    break L3;
                  }
                }
                id.a((byte) -67, -1);
                wh.field_j = va.field_l;
                break L2;
              }
            }
            L8: {
              if (param6 == 27851) {
                break L8;
              } else {
                field_b = (String) null;
                break L8;
              }
            }
            L9: {
              if (wh.field_j != va.field_l) {
                break L9;
              } else {
                if (hc.a(1, -28266)) {
                  L10: {
                    var9 = nk.field_N.f(255);
                    nk.field_N.field_m = 0;
                    if ((var9 ^ -1) > -101) {
                      break L10;
                    } else {
                      if (-106 <= (var9 ^ -1)) {
                        pd.field_I = new String[-100 + var9];
                        wh.field_j = vj.field_a;
                        break L9;
                      } else {
                        break L10;
                      }
                    }
                  }
                  if (-249 != (var9 ^ -1)) {
                    if ((var9 ^ -1) == -100) {
                      discarded$1 = hc.a(uf.a(true), param6 ^ -675);
                      gh.field_c = new Boolean(qj.a((byte) -100, nk.field_N));
                      nk.field_N.field_m = 0;
                      break L9;
                    } else {
                      wh.field_j = gf.field_ib;
                      ra.field_k = var9;
                      gd.field_c = -1;
                      break L9;
                    }
                  } else {
                    tj.a(3088, jg.f(param6 ^ 27850));
                    bh.field_g = ii.field_b;
                    ql.a(-71);
                    n.field_a = false;
                    stackOut_31_0 = var9;
                    stackIn_32_0 = stackOut_31_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  break L9;
                }
              }
            }
            L11: {
              if (wh.field_j != vj.field_a) {
                break L11;
              } else {
                var9 = 2;
                if (!hc.a(var9, -28266)) {
                  break L11;
                } else {
                  var10 = nk.field_N.j(param6 + -42328);
                  nk.field_N.field_m = 0;
                  if (!hc.a(var10, -28266)) {
                    break L11;
                  } else {
                    var11 = pd.field_I.length;
                    var12 = 0;
                    L12: while (true) {
                      if (var11 <= var12) {
                        ql.a(-107);
                        n.field_a = false;
                        stackOut_43_0 = 100 + var11;
                        stackIn_44_0 = stackOut_43_0;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        pd.field_I[var12] = nk.field_N.h(727059944);
                        var12++;
                        continue L12;
                      }
                    }
                  }
                }
              }
            }
            L13: {
              if (gf.field_ib == wh.field_j) {
                if (bd.b(92)) {
                  L14: {
                    if ((ra.field_k ^ -1) != -256) {
                      bh.field_g = nk.field_N.d(0);
                      break L14;
                    } else {
                      var9_ref_String = nk.field_N.c(-1);
                      if (var9_ref_String == null) {
                        break L14;
                      } else {
                        q.a(26017, jg.f(1), var9_ref_String);
                        break L14;
                      }
                    }
                  }
                  ql.a(-36);
                  n.field_a = false;
                  stackOut_53_0 = ra.field_k;
                  stackIn_54_0 = stackOut_53_0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  break L13;
                }
              } else {
                break L13;
              }
            }
            L15: {
              if (jc.field_H != null) {
                break L15;
              } else {
                if (!n.field_a) {
                  var9 = vl.field_d;
                  vl.field_d = tj.field_J;
                  tj.field_J = var9;
                  n.field_a = true;
                  break L15;
                } else {
                  L16: {
                    if (eh.a(2) > 30000L) {
                      bh.field_g = sa.field_b;
                      break L16;
                    } else {
                      bh.field_g = fg.field_d;
                      break L16;
                    }
                  }
                  n.field_a = false;
                  stackOut_60_0 = 249;
                  stackIn_61_0 = stackOut_60_0;
                  decompiledRegionSelector0 = 4;
                  break L0;
                }
              }
            }
            stackOut_63_0 = -1;
            stackIn_64_0 = stackOut_63_0;
            decompiledRegionSelector0 = 5;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var7 = decompiledCaughtException;
            stackOut_65_0 = (RuntimeException) (var7);
            stackOut_65_1 = new StringBuilder().append("qi.J(");
            stackIn_67_0 = stackOut_65_0;
            stackIn_67_1 = stackOut_65_1;
            stackIn_66_0 = stackOut_65_0;
            stackIn_66_1 = stackOut_65_1;
            if (param0 == null) {
              stackOut_67_0 = (RuntimeException) ((Object) stackIn_67_0);
              stackOut_67_1 = (StringBuilder) ((Object) stackIn_67_1);
              stackOut_67_2 = "null";
              stackIn_68_0 = stackOut_67_0;
              stackIn_68_1 = stackOut_67_1;
              stackIn_68_2 = stackOut_67_2;
              break L17;
            } else {
              stackOut_66_0 = (RuntimeException) ((Object) stackIn_66_0);
              stackOut_66_1 = (StringBuilder) ((Object) stackIn_66_1);
              stackOut_66_2 = "{...}";
              stackIn_68_0 = stackOut_66_0;
              stackIn_68_1 = stackOut_66_1;
              stackIn_68_2 = stackOut_66_2;
              break L17;
            }
          }
          L18: {
            stackOut_68_0 = (RuntimeException) ((Object) stackIn_68_0);
            stackOut_68_1 = ((StringBuilder) (Object) stackIn_68_1).append(stackIn_68_2).append(',');
            stackIn_70_0 = stackOut_68_0;
            stackIn_70_1 = stackOut_68_1;
            stackIn_69_0 = stackOut_68_0;
            stackIn_69_1 = stackOut_68_1;
            if (param1 == null) {
              stackOut_70_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackOut_70_1 = (StringBuilder) ((Object) stackIn_70_1);
              stackOut_70_2 = "null";
              stackIn_71_0 = stackOut_70_0;
              stackIn_71_1 = stackOut_70_1;
              stackIn_71_2 = stackOut_70_2;
              break L18;
            } else {
              stackOut_69_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackOut_69_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackOut_69_2 = "{...}";
              stackIn_71_0 = stackOut_69_0;
              stackIn_71_1 = stackOut_69_1;
              stackIn_71_2 = stackOut_69_2;
              break L18;
            }
          }
          L19: {
            stackOut_71_0 = (RuntimeException) ((Object) stackIn_71_0);
            stackOut_71_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_71_2).append(',');
            stackIn_73_0 = stackOut_71_0;
            stackIn_73_1 = stackOut_71_1;
            stackIn_72_0 = stackOut_71_0;
            stackIn_72_1 = stackOut_71_1;
            if (param2 == null) {
              stackOut_73_0 = (RuntimeException) ((Object) stackIn_73_0);
              stackOut_73_1 = (StringBuilder) ((Object) stackIn_73_1);
              stackOut_73_2 = "null";
              stackIn_74_0 = stackOut_73_0;
              stackIn_74_1 = stackOut_73_1;
              stackIn_74_2 = stackOut_73_2;
              break L19;
            } else {
              stackOut_72_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackOut_72_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackOut_72_2 = "{...}";
              stackIn_74_0 = stackOut_72_0;
              stackIn_74_1 = stackOut_72_1;
              stackIn_74_2 = stackOut_72_2;
              break L19;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_74_0), stackIn_74_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_32_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_44_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_54_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_61_0;
                } else {
                  return stackIn_64_0;
                }
              }
            }
          }
        }
    }

    final static void e(int param0) {
        d.field_a = nk.field_N.d(param0 ^ param0);
        CharSequence var2 = (CharSequence) ((Object) d.field_a);
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
            if (jd.field_b < this.field_q) {
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
            this.field_c = -121;
            break L0;
          }
        }
        var2 = this.field_o;
        var3 = this.field_k;
        if (!this.b(0)) {
          this.field_d = false;
          return;
        } else {
          L1: {
            if (this.field_r < var2) {
              var2 = this.field_r;
              break L1;
            } else {
              if (var2 < this.field_a) {
                var2 = this.field_a;
                break L1;
              } else {
                break L1;
              }
            }
          }
          L2: {
            if (var3 > this.field_i) {
              var3 = this.field_i;
              break L2;
            } else {
              if (this.field_h > var3) {
                var3 = this.field_h;
                break L2;
              } else {
                break L2;
              }
            }
          }
          L3: {
            if (0.0f >= this.field_s) {
              break L3;
            } else {
              var4 = (int)(this.field_s * (float)var3 + 0.5f);
              if (var4 <= var2) {
                if (var4 >= var2) {
                  break L3;
                } else {
                  var2 = var4;
                  break L3;
                }
              } else {
                var3 = (int)((float)var2 / this.field_s);
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
            this.field_m.a(var3, var2, -109);
            break L4;
          }
          L6: {
            if (this.field_o <= 0) {
              break L6;
            } else {
              ph.field_o = (-rg.field_R + this.field_o) / 2;
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
        field_b = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
    }
}
