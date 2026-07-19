/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jk {
    private int field_v;
    private float field_s;
    private int field_b;
    private boolean field_l;
    private rd field_q;
    private int field_c;
    private int field_e;
    private int field_u;
    private int field_a;
    private int field_h;
    static og[] field_d;
    static int[] field_j;
    private int field_g;
    private int field_n;
    private int field_f;
    private int field_i;
    private int field_p;
    private int field_k;
    static String[] field_r;
    static int[] field_t;
    private int field_m;
    private int field_o;

    final ea c(int param0) {
        this.field_a = th.field_e;
        this.field_h = bd.field_k;
        this.field_q.a((byte) 14, this.field_c, this.field_f);
        int var2 = -96 / ((-34 - param0) / 57);
        vc.field_a = false;
        ea var3 = wd.a(this.field_c, (byte) 77, 0, 0, wc.field_c, this.field_f);
        if (var3 == null) {
            this.c((byte) -91);
        }
        return var3;
    }

    final static void a(int param0) {
        String var1 = null;
        int var2 = 0;
        if (!vh.field_j) {
          throw new IllegalStateException();
        } else {
          L0: {
            if (oj.field_q != null) {
              oj.field_q.q(4210752);
              break L0;
            } else {
              break L0;
            }
          }
          var2 = -45 / ((26 - param0) / 52);
          var1 = fe.b((byte) -127);
          ig.field_ib = new pk(var1, (String) null, true, false, false);
          bm.field_d.b((byte) 74, (pj) (kg.field_j));
          kg.field_j.a(false, ig.field_ib);
          kg.field_j.m(0);
          return;
        }
    }

    final static byte[] a(int param0, String param1) {
        int discarded$2 = 0;
        RuntimeException var2 = null;
        ee var3 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_2_0 = null;
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
            L1: {
              if (param0 == 1) {
                break L1;
              } else {
                var3 = (ee) null;
                discarded$2 = jk.a(91, -71, (ee) null, (String) null, (ee) null, true, -102);
                break L1;
              }
            }
            stackOut_2_0 = md.field_d.a(param1, 1, "");
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2);
            stackOut_4_1 = new StringBuilder().append("jk.K(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(int param0, ef param1, boolean param2) {
        int discarded$8 = 0;
        RuntimeException runtimeException = null;
        int var4 = 0;
        se var5 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                var5 = uk.field_b;
                var5.i(param0, -98);
                var5.field_i = var5.field_i + 1;
                var4 = var5.field_i;
                var5.a(1, -75);
                if (param1.field_l != null) {
                  break L2;
                } else {
                  var5.a(0, -128);
                  if (!OrbDefence.field_D) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var5.a(param1.field_l.length, -32);
              var5.a(0, param1.field_l.length, (byte) -11, param1.field_l);
              break L1;
            }
            L3: {
              discarded$8 = var5.e(-18951, var4);
              if (!param2) {
                break L3;
              } else {
                field_j = (int[]) null;
                break L3;
              }
            }
            var5.field_i = var5.field_i - 4;
            param1.field_f = var5.l(0);
            var5.c((byte) 113, var5.field_i - var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (runtimeException);
            stackOut_8_1 = new StringBuilder().append("jk.H(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param2 + ')');
        }
    }

    final void d(byte param0) {
        int fieldTemp$2 = 0;
        int var2 = 0;
        if (null == mg.field_k) {
          L0: {
            if (0 >= tc.field_b) {
              this.field_l = false;
              break L0;
            } else {
              break L0;
            }
          }
          if (!this.field_l) {
            L1: {
              L2: {
                if (this.field_n <= bd.field_k) {
                  break L2;
                } else {
                  em.field_r = (-bd.field_k + this.field_n) / 2;
                  if (!OrbDefence.field_D) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              if (-1 <= (this.field_n ^ -1)) {
                break L1;
              } else {
                em.field_r = 0;
                break L1;
              }
            }
            L3: {
              L4: {
                if (bd.field_k != this.field_e) {
                  break L4;
                } else {
                  if (this.field_b == th.field_e) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              this.field_q.a((byte) 46, this.field_b, this.field_e);
              break L3;
            }
            return;
          } else {
            fieldTemp$2 = this.field_m - 1;
            this.field_m = this.field_m - 1;
            if ((fieldTemp$2 ^ -1) >= -1) {
              this.field_m = this.field_v;
              if (this.field_o > mg.field_f) {
                this.field_l = false;
                return;
              } else {
                this.b((byte) 98);
                var2 = -52 / ((22 - param0) / 52);
                return;
              }
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    final static void b(int param0, int param1, int param2) {
        fd.field_c = param1;
        if (param2 != 249) {
            ef var4 = (ef) null;
            jk.a(-96, (ef) null, false);
        }
        sf.field_T = param0;
    }

    public static void a(byte param0) {
        field_d = null;
        if (param0 != 65) {
            return;
        }
        field_t = null;
        field_r = null;
        field_j = null;
    }

    final static int a(int param0, int param1, ee param2, String param3, ee param4, boolean param5, int param6) {
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
        int stackIn_8_0 = 0;
        mg stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        mg stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        mg stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        String stackIn_21_2 = null;
        mg stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        mg stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        mg stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        String stackIn_24_2 = null;
        int stackIn_39_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_70_0 = 0;
        int stackIn_73_0 = 0;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_77_2 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_80_2 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        String stackIn_83_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        mg stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        mg stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        String stackOut_20_2 = null;
        mg stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        String stackOut_19_2 = null;
        mg stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        mg stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        String stackOut_23_2 = null;
        mg stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        String stackOut_22_2 = null;
        int stackOut_38_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_72_0 = 0;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        String stackOut_76_2 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        String stackOut_75_2 = null;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        String stackOut_79_2 = null;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        String stackOut_78_2 = null;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        RuntimeException stackOut_82_0 = null;
        StringBuilder stackOut_82_1 = null;
        String stackOut_82_2 = null;
        RuntimeException stackOut_81_0 = null;
        StringBuilder stackOut_81_1 = null;
        String stackOut_81_2 = null;
        var13 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              var14 = param4.a(true);
              var11_ref_String = var14;
              var11_ref_String = var14;
              if (param6 == -23739) {
                break L1;
              } else {
                field_d = (og[]) null;
                break L1;
              }
            }
            L2: {
              var8 = param2.a(true);
              var11_ref_String = var8;
              var11_ref_String = var8;
              if (null == p.field_d) {
                if (!fg.a(false, param6 ^ 23694)) {
                  stackOut_7_0 = -1;
                  stackIn_8_0 = stackOut_7_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L2;
                }
              } else {
                break L2;
              }
            }
            L3: {
              if (sk.field_E == dh.field_bb) {
                L4: {
                  L5: {
                    uk.field_b.field_i = 0;
                    ci.field_h = null;
                    if (param3 == null) {
                      break L5;
                    } else {
                      L6: {
                        var9 = 0;
                        if (param5) {
                          var9 = var9 | 1;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      L7: {
                        pg.field_c.field_i = 0;
                        pg.field_c.b(tl.field_f.nextInt(), param6 ^ 23738);
                        pg.field_c.b(tl.field_f.nextInt(), -1);
                        pg.field_c.a(false, var14);
                        pg.field_c.a(false, var8);
                        var15 = (CharSequence) ((Object) param3);
                        pg.field_c.a(false, wb.a(var15, 122));
                        pg.field_c.b((byte) -60, param1);
                        pg.field_c.a(param0, -60);
                        pg.field_c.a(var9, param6 ^ 23799);
                        uk.field_b.a(18, -126);
                        uk.field_b.field_i = uk.field_b.field_i + 2;
                        var10 = uk.field_b.field_i;
                        var11_ref_String = tc.a((byte) -41, uj.b((byte) -120));
                        if (var11_ref_String != null) {
                          break L7;
                        } else {
                          var11_ref_String = "";
                          break L7;
                        }
                      }
                      uk.field_b.a(var11_ref_String, -6528);
                      cg.a(uk.field_b, pc.field_W, 0, nc.field_ab, pg.field_c);
                      uk.field_b.d(-var10 + uk.field_b.field_i, -2);
                      if (var13 == 0) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  L8: {
                    pg.field_c.field_i = 0;
                    pg.field_c.b(tl.field_f.nextInt(), -1);
                    pg.field_c.b(tl.field_f.nextInt(), -1);
                    stackOut_18_0 = pg.field_c;
                    stackOut_18_1 = 0;
                    stackIn_20_0 = stackOut_18_0;
                    stackIn_20_1 = stackOut_18_1;
                    stackIn_19_0 = stackOut_18_0;
                    stackIn_19_1 = stackOut_18_1;
                    if (!param4.b(-125)) {
                      stackOut_20_0 = (mg) ((Object) stackIn_20_0);
                      stackOut_20_1 = stackIn_20_1;
                      stackOut_20_2 = "";
                      stackIn_21_0 = stackOut_20_0;
                      stackIn_21_1 = stackOut_20_1;
                      stackIn_21_2 = stackOut_20_2;
                      break L8;
                    } else {
                      stackOut_19_0 = (mg) ((Object) stackIn_19_0);
                      stackOut_19_1 = stackIn_19_1;
                      stackOut_19_2 = (String) (var14);
                      stackIn_21_0 = stackOut_19_0;
                      stackIn_21_1 = stackOut_19_1;
                      stackIn_21_2 = stackOut_19_2;
                      break L8;
                    }
                  }
                  L9: {
                    ((mg) (Object) stackIn_21_0).a(stackIn_21_1 != 0, stackIn_21_2);
                    stackOut_21_0 = pg.field_c;
                    stackOut_21_1 = 0;
                    stackIn_23_0 = stackOut_21_0;
                    stackIn_23_1 = stackOut_21_1;
                    stackIn_22_0 = stackOut_21_0;
                    stackIn_22_1 = stackOut_21_1;
                    if (!param2.b(-111)) {
                      stackOut_23_0 = (mg) ((Object) stackIn_23_0);
                      stackOut_23_1 = stackIn_23_1;
                      stackOut_23_2 = "";
                      stackIn_24_0 = stackOut_23_0;
                      stackIn_24_1 = stackOut_23_1;
                      stackIn_24_2 = stackOut_23_2;
                      break L9;
                    } else {
                      stackOut_22_0 = (mg) ((Object) stackIn_22_0);
                      stackOut_22_1 = stackIn_22_1;
                      stackOut_22_2 = (String) (var8);
                      stackIn_24_0 = stackOut_22_0;
                      stackIn_24_1 = stackOut_22_1;
                      stackIn_24_2 = stackOut_22_2;
                      break L9;
                    }
                  }
                  ((mg) (Object) stackIn_24_0).a(stackIn_24_1 != 0, stackIn_24_2);
                  uk.field_b.a(16, -15);
                  uk.field_b.field_i = uk.field_b.field_i + 1;
                  var9 = uk.field_b.field_i;
                  cg.a(uk.field_b, pc.field_W, 0, nc.field_ab, pg.field_c);
                  uk.field_b.c((byte) 123, uk.field_b.field_i + -var9);
                  break L4;
                }
                bh.a(-1, -1);
                dh.field_bb = ea.field_f;
                break L3;
              } else {
                break L3;
              }
            }
            L10: {
              if (dh.field_bb != ea.field_f) {
                break L10;
              } else {
                if (!va.a(true, 1)) {
                  break L10;
                } else {
                  L11: {
                    var9 = cd.field_t.b((byte) 90);
                    cd.field_t.field_i = 0;
                    if (-101 < (var9 ^ -1)) {
                      break L11;
                    } else {
                      if (var9 > 105) {
                        break L11;
                      } else {
                        vd.field_e = new String[var9 + -100];
                        dh.field_bb = fd.field_h;
                        if (var13 == 0) {
                          break L10;
                        } else {
                          break L11;
                        }
                      }
                    }
                  }
                  L12: {
                    if (var9 == 248) {
                      break L12;
                    } else {
                      L13: {
                        if ((var9 ^ -1) != -100) {
                          break L13;
                        } else {
                          discarded$1 = va.a(true, ue.b((byte) 123));
                          ci.field_h = new Boolean(af.a(cd.field_t, true));
                          cd.field_t.field_i = 0;
                          if (var13 == 0) {
                            break L10;
                          } else {
                            break L13;
                          }
                        }
                      }
                      tf.field_c = -1;
                      dh.field_bb = nk.field_w;
                      ab.field_l = var9;
                      if (var13 == 0) {
                        break L10;
                      } else {
                        break L12;
                      }
                    }
                  }
                  wl.a(uj.b((byte) -120), (byte) 54);
                  kk.field_Y = ob.field_C;
                  th.a(param6 + 23856);
                  ea.field_a = false;
                  stackOut_38_0 = var9;
                  stackIn_39_0 = stackOut_38_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            L14: {
              if (dh.field_bb != fd.field_h) {
                break L14;
              } else {
                var9 = 2;
                if (!va.a(true, var9)) {
                  break L14;
                } else {
                  var10 = cd.field_t.j(98203176);
                  cd.field_t.field_i = 0;
                  if (!va.a(true, var10)) {
                    break L14;
                  } else {
                    var11 = vd.field_e.length;
                    var12 = 0;
                    L15: while (true) {
                      L16: {
                        if (var11 <= var12) {
                          th.a(108);
                          ea.field_a = false;
                          break L16;
                        } else {
                          vd.field_e[var12] = cd.field_t.f(gi.a(param6, -23760));
                          var12++;
                          if (var13 != 0) {
                            break L16;
                          } else {
                            continue L15;
                          }
                        }
                      }
                      stackOut_49_0 = 100 + var11;
                      stackIn_50_0 = stackOut_49_0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                }
              }
            }
            L17: {
              if (dh.field_bb == nk.field_w) {
                if (!ce.a(-68)) {
                  break L17;
                } else {
                  L18: {
                    L19: {
                      if (ab.field_l == 255) {
                        break L19;
                      } else {
                        kk.field_Y = cd.field_t.g(2);
                        if (var13 == 0) {
                          break L18;
                        } else {
                          break L19;
                        }
                      }
                    }
                    var9_ref_String = cd.field_t.i(-1);
                    if (var9_ref_String != null) {
                      kb.a(uj.b((byte) -120), false, var9_ref_String);
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                  th.a(126);
                  ea.field_a = false;
                  stackOut_60_0 = ab.field_l;
                  stackIn_61_0 = stackOut_60_0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              } else {
                break L17;
              }
            }
            L20: {
              if (null == p.field_d) {
                if (!ea.field_a) {
                  var9 = eg.field_v;
                  eg.field_v = sj.field_x;
                  sj.field_x = var9;
                  ea.field_a = true;
                  break L20;
                } else {
                  L21: {
                    L22: {
                      if (30000L < ed.b(-1)) {
                        break L22;
                      } else {
                        kk.field_Y = dj.field_j;
                        if (var13 == 0) {
                          break L21;
                        } else {
                          break L22;
                        }
                      }
                    }
                    kk.field_Y = ee.field_c;
                    break L21;
                  }
                  ea.field_a = false;
                  stackOut_69_0 = 249;
                  stackIn_70_0 = stackOut_69_0;
                  decompiledRegionSelector0 = 4;
                  break L0;
                }
              } else {
                break L20;
              }
            }
            stackOut_72_0 = -1;
            stackIn_73_0 = stackOut_72_0;
            decompiledRegionSelector0 = 5;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L23: {
            var7 = decompiledCaughtException;
            stackOut_74_0 = (RuntimeException) (var7);
            stackOut_74_1 = new StringBuilder().append("jk.F(").append(param0).append(',').append(param1).append(',');
            stackIn_76_0 = stackOut_74_0;
            stackIn_76_1 = stackOut_74_1;
            stackIn_75_0 = stackOut_74_0;
            stackIn_75_1 = stackOut_74_1;
            if (param2 == null) {
              stackOut_76_0 = (RuntimeException) ((Object) stackIn_76_0);
              stackOut_76_1 = (StringBuilder) ((Object) stackIn_76_1);
              stackOut_76_2 = "null";
              stackIn_77_0 = stackOut_76_0;
              stackIn_77_1 = stackOut_76_1;
              stackIn_77_2 = stackOut_76_2;
              break L23;
            } else {
              stackOut_75_0 = (RuntimeException) ((Object) stackIn_75_0);
              stackOut_75_1 = (StringBuilder) ((Object) stackIn_75_1);
              stackOut_75_2 = "{...}";
              stackIn_77_0 = stackOut_75_0;
              stackIn_77_1 = stackOut_75_1;
              stackIn_77_2 = stackOut_75_2;
              break L23;
            }
          }
          L24: {
            stackOut_77_0 = (RuntimeException) ((Object) stackIn_77_0);
            stackOut_77_1 = ((StringBuilder) (Object) stackIn_77_1).append(stackIn_77_2).append(',');
            stackIn_79_0 = stackOut_77_0;
            stackIn_79_1 = stackOut_77_1;
            stackIn_78_0 = stackOut_77_0;
            stackIn_78_1 = stackOut_77_1;
            if (param3 == null) {
              stackOut_79_0 = (RuntimeException) ((Object) stackIn_79_0);
              stackOut_79_1 = (StringBuilder) ((Object) stackIn_79_1);
              stackOut_79_2 = "null";
              stackIn_80_0 = stackOut_79_0;
              stackIn_80_1 = stackOut_79_1;
              stackIn_80_2 = stackOut_79_2;
              break L24;
            } else {
              stackOut_78_0 = (RuntimeException) ((Object) stackIn_78_0);
              stackOut_78_1 = (StringBuilder) ((Object) stackIn_78_1);
              stackOut_78_2 = "{...}";
              stackIn_80_0 = stackOut_78_0;
              stackIn_80_1 = stackOut_78_1;
              stackIn_80_2 = stackOut_78_2;
              break L24;
            }
          }
          L25: {
            stackOut_80_0 = (RuntimeException) ((Object) stackIn_80_0);
            stackOut_80_1 = ((StringBuilder) (Object) stackIn_80_1).append(stackIn_80_2).append(',');
            stackIn_82_0 = stackOut_80_0;
            stackIn_82_1 = stackOut_80_1;
            stackIn_81_0 = stackOut_80_0;
            stackIn_81_1 = stackOut_80_1;
            if (param4 == null) {
              stackOut_82_0 = (RuntimeException) ((Object) stackIn_82_0);
              stackOut_82_1 = (StringBuilder) ((Object) stackIn_82_1);
              stackOut_82_2 = "null";
              stackIn_83_0 = stackOut_82_0;
              stackIn_83_1 = stackOut_82_1;
              stackIn_83_2 = stackOut_82_2;
              break L25;
            } else {
              stackOut_81_0 = (RuntimeException) ((Object) stackIn_81_0);
              stackOut_81_1 = (StringBuilder) ((Object) stackIn_81_1);
              stackOut_81_2 = "{...}";
              stackIn_83_0 = stackOut_81_0;
              stackIn_83_1 = stackOut_81_1;
              stackIn_83_2 = stackOut_81_2;
              break L25;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_83_0), stackIn_83_2 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_39_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_50_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_61_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_70_0;
                } else {
                  return stackIn_73_0;
                }
              }
            }
          }
        }
    }

    final void a(int param0, int param1, int param2) {
        this.field_u = param1;
        if (param0 != 14592) {
            field_r = (String[]) null;
        }
        this.field_n = param2;
    }

    final boolean b(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 > 28) {
            break L0;
          } else {
            field_r = (String[]) null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (mg.field_f < this.field_o) {
              break L2;
            } else {
              if (0 >= tc.field_b) {
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

    private final void b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = OrbDefence.field_D ? 1 : 0;
          var2 = this.field_n;
          if (param0 >= 50) {
            break L0;
          } else {
            this.field_n = 104;
            break L0;
          }
        }
        var3 = this.field_u;
        if (!this.b(120)) {
          this.field_l = false;
          return;
        } else {
          L1: {
            L2: {
              if (var3 > this.field_i) {
                break L2;
              } else {
                if (var3 < this.field_k) {
                  var3 = this.field_k;
                  if (var5 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                } else {
                  break L1;
                }
              }
            }
            var3 = this.field_i;
            break L1;
          }
          L3: {
            L4: {
              if (var2 <= this.field_g) {
                break L4;
              } else {
                var2 = this.field_g;
                if (var5 == 0) {
                  break L3;
                } else {
                  break L4;
                }
              }
            }
            if (var2 >= this.field_p) {
              break L3;
            } else {
              var2 = this.field_p;
              break L3;
            }
          }
          L5: {
            if (0.0f >= this.field_s) {
              break L5;
            } else {
              L6: {
                var4 = (int)(this.field_s * (float)var3 + 0.5f);
                if (var2 >= var4) {
                  break L6;
                } else {
                  var3 = (int)((float)var2 / this.field_s);
                  if (var5 == 0) {
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
              if (var4 >= var2) {
                break L5;
              } else {
                var2 = var4;
                break L5;
              }
            }
          }
          L7: {
            L8: {
              if (bd.field_k != var2) {
                break L8;
              } else {
                if (var3 == th.field_e) {
                  break L7;
                } else {
                  break L8;
                }
              }
            }
            this.field_q.a((byte) 53, var3, var2);
            break L7;
          }
          L9: {
            if (this.field_n <= 0) {
              break L9;
            } else {
              em.field_r = (this.field_n - bd.field_k) / 2;
              break L9;
            }
          }
          return;
        }
    }

    final void c(byte param0) {
        this.field_q.a((byte) 105, this.field_a, this.field_h);
        if (param0 >= -54) {
            this.field_c = 116;
        }
    }

    private jk() throws Throwable {
        throw new Error();
    }

    static {
        field_t = new int[8192];
        field_r = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
    }
}
