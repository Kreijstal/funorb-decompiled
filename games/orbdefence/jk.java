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
        String var1;
        int var2;
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
        RuntimeException var2 = null;
        ee var3 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 1) {
                break L1;
              } else {
                var3 = (ee) null;
                jk.a(91, -71, (ee) null, (String) null, (ee) null, true, -102);
                break L1;
              }
            }
            stackIn_3_0 = md.field_d.a(param1, 1, "");
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("jk.K(").append(param0).append(',');

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
          throw dd.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(int param0, ef param1, boolean param2) {
        se var5 = null;
        int var4 = 0;
        try {
            var5 = uk.field_b;
            var5.i(param0, -98);
            var5.field_i = var5.field_i + 1;
            var4 = var5.field_i;
            var5.a(1, -75);
            if (param1.field_l == null) {
                var5.a(0, -128);
            } else {
                var5.a(param1.field_l.length, -32);
                var5.a(0, param1.field_l.length, (byte) -11, param1.field_l);
            }
            var5.e(-18951, var4);
            if (param2) {
                field_j = (int[]) null;
            }
            var5.field_i = var5.field_i - 4;
            param1.field_f = var5.l(0);
            var5.c((byte) 113, var5.field_i - var4);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "jk.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void d(byte param0) {
        int fieldTemp$1 = 0;
        int var2;
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
              if (this.field_n <= bd.field_k) {
                if (-1 <= (this.field_n ^ -1)) {
                  break L1;
                } else {
                  em.field_r = 0;
                  break L1;
                }
              } else {
                em.field_r = (-bd.field_k + this.field_n) / 2;
                break L1;
              }
            }
            L2: {
              L3: {
                if (bd.field_k != this.field_e) {
                  break L3;
                } else {
                  if (this.field_b == th.field_e) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              this.field_q.a((byte) 46, this.field_b, this.field_e);
              break L2;
            }
            return;
          } else {
            fieldTemp$1 = this.field_m - 1;
            this.field_m = this.field_m - 1;
            if ((fieldTemp$1 ^ -1) >= -1) {
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
        int stackIn_8_0 = 0;
        mg stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        mg stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        String stackIn_21_2 = null;
        mg stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        mg stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        String stackIn_24_2 = null;
        int stackIn_36_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_65_0 = 0;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_69_2 = null;
        StringBuilder stackIn_71_1 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_72_2 = null;
        StringBuilder stackIn_74_1 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_75_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
                  stackIn_8_0 = -1;
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
                  uk.field_b.field_i = 0;
                  ci.field_h = null;
                  if (param3 == null) {
                    L5: {
                      pg.field_c.field_i = 0;
                      pg.field_c.b(tl.field_f.nextInt(), -1);
                      pg.field_c.b(tl.field_f.nextInt(), -1);
                      stackIn_20_0 = pg.field_c;

                      stackIn_20_1 = 0;

                      if (!param4.b(-125)) {
                        stackIn_21_0 = (mg) ((Object) stackIn_20_0);
                        stackIn_21_1 = stackIn_20_1;
                        stackIn_21_2 = "";
                        break L5;
                      } else {
                        stackIn_21_0 = (mg) ((Object) stackIn_20_0);
                        stackIn_21_1 = stackIn_20_1;
                        stackIn_21_2 = (String) (var14);
                        break L5;
                      }
                    }
                    L6: {
                      ((mg) (Object) stackIn_21_0).a(stackIn_21_1 != 0, stackIn_21_2);
                      stackIn_23_0 = pg.field_c;

                      stackIn_23_1 = 0;

                      if (!param2.b(-111)) {
                        stackIn_24_0 = (mg) ((Object) stackIn_23_0);
                        stackIn_24_1 = stackIn_23_1;
                        stackIn_24_2 = "";
                        break L6;
                      } else {
                        stackIn_24_0 = (mg) ((Object) stackIn_23_0);
                        stackIn_24_1 = stackIn_23_1;
                        stackIn_24_2 = (String) (var8);
                        break L6;
                      }
                    }
                    ((mg) (Object) stackIn_24_0).a(stackIn_24_1 != 0, stackIn_24_2);
                    uk.field_b.a(16, -15);
                    uk.field_b.field_i = uk.field_b.field_i + 1;
                    var9 = uk.field_b.field_i;
                    cg.a(uk.field_b, pc.field_W, 0, nc.field_ab, pg.field_c);
                    uk.field_b.c((byte) 123, uk.field_b.field_i + -var9);
                    break L4;
                  } else {
                    L7: {
                      var9 = 0;
                      if (param5) {
                        var9 = var9 | 1;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    L8: {
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
                        break L8;
                      } else {
                        var11_ref_String = "";
                        break L8;
                      }
                    }
                    uk.field_b.a(var11_ref_String, -6528);
                    cg.a(uk.field_b, pc.field_W, 0, nc.field_ab, pg.field_c);
                    uk.field_b.d(-var10 + uk.field_b.field_i, -2);
                    break L4;
                  }
                }
                bh.a(-1, -1);
                dh.field_bb = ea.field_f;
                break L3;
              } else {
                break L3;
              }
            }
            L9: {
              if (dh.field_bb != ea.field_f) {
                break L9;
              } else {
                if (!va.a(true, 1)) {
                  break L9;
                } else {
                  L10: {
                    var9 = cd.field_t.b((byte) 90);
                    cd.field_t.field_i = 0;
                    if (-101 < (var9 ^ -1)) {
                      break L10;
                    } else {
                      if (var9 > 105) {
                        break L10;
                      } else {
                        vd.field_e = new String[var9 + -100];
                        dh.field_bb = fd.field_h;
                        break L9;
                      }
                    }
                  }
                  if (var9 == 248) {
                    wl.a(uj.b((byte) -120), (byte) 54);
                    kk.field_Y = ob.field_C;
                    th.a(param6 + 23856);
                    ea.field_a = false;
                    stackIn_36_0 = var9;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    if ((var9 ^ -1) != -100) {
                      tf.field_c = -1;
                      dh.field_bb = nk.field_w;
                      ab.field_l = var9;
                      break L9;
                    } else {
                      va.a(true, ue.b((byte) 123));
                      ci.field_h = new Boolean(af.a(cd.field_t, true));
                      cd.field_t.field_i = 0;
                      break L9;
                    }
                  }
                }
              }
            }
            L11: {
              if (dh.field_bb != fd.field_h) {
                break L11;
              } else {
                var9 = 2;
                if (!va.a(true, var9)) {
                  break L11;
                } else {
                  var10 = cd.field_t.j(98203176);
                  cd.field_t.field_i = 0;
                  if (!va.a(true, var10)) {
                    break L11;
                  } else {
                    var11 = vd.field_e.length;
                    var12 = 0;
                    L12: while (true) {
                      if (var11 <= var12) {
                        th.a(108);
                        ea.field_a = false;
                        stackIn_44_0 = 100 + var11;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        vd.field_e[var12] = cd.field_t.f(gi.a(param6, -23760));
                        var12++;
                        continue L12;
                      }
                    }
                  }
                }
              }
            }
            L13: {
              if (dh.field_bb == nk.field_w) {
                if (!ce.a(-68)) {
                  break L13;
                } else {
                  L14: {
                    if (ab.field_l == 255) {
                      var9_ref_String = cd.field_t.i(-1);
                      if (var9_ref_String != null) {
                        kb.a(uj.b((byte) -120), false, var9_ref_String);
                        break L14;
                      } else {
                        break L14;
                      }
                    } else {
                      kk.field_Y = cd.field_t.g(2);
                      break L14;
                    }
                  }
                  th.a(126);
                  ea.field_a = false;
                  stackIn_54_0 = ab.field_l;
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              } else {
                break L13;
              }
            }
            L15: {
              if (null == p.field_d) {
                if (!ea.field_a) {
                  var9 = eg.field_v;
                  eg.field_v = sj.field_x;
                  sj.field_x = var9;
                  ea.field_a = true;
                  break L15;
                } else {
                  L16: {
                    if (30000L < ed.b(-1)) {
                      kk.field_Y = ee.field_c;
                      break L16;
                    } else {
                      kk.field_Y = dj.field_j;
                      break L16;
                    }
                  }
                  ea.field_a = false;
                  stackIn_62_0 = 249;
                  decompiledRegionSelector0 = 4;
                  break L0;
                }
              } else {
                break L15;
              }
            }
            stackIn_65_0 = -1;
            decompiledRegionSelector0 = 5;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var7 = decompiledCaughtException;
            stackIn_68_0 = (RuntimeException) (var7);

            stackIn_68_1 = new StringBuilder().append("jk.F(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_69_0 = (RuntimeException) ((Object) stackIn_68_0);
              stackIn_69_1 = (StringBuilder) ((Object) stackIn_68_1);
              stackIn_69_2 = "null";
              break L17;
            } else {
              stackIn_69_0 = (RuntimeException) ((Object) stackIn_68_0);
              stackIn_69_1 = (StringBuilder) ((Object) stackIn_68_1);
              stackIn_69_2 = "{...}";
              break L17;
            }
          }
          L18: {


            stackIn_71_1 = ((StringBuilder) (Object) stackIn_69_1).append(stackIn_69_2).append(',');

            if (param3 == null) {
              stackIn_69_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackIn_72_1 = (StringBuilder) ((Object) stackIn_71_1);
              stackIn_72_2 = "null";
              break L18;
            } else {
              stackIn_69_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackIn_72_1 = (StringBuilder) ((Object) stackIn_71_1);
              stackIn_72_2 = "{...}";
              break L18;
            }
          }
          L19: {


            stackIn_74_1 = ((StringBuilder) (Object) stackIn_72_1).append(stackIn_72_2).append(',');

            if (param4 == null) {
              stackIn_69_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackIn_75_1 = (StringBuilder) ((Object) stackIn_74_1);
              stackIn_75_2 = "null";
              break L19;
            } else {
              stackIn_69_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackIn_75_1 = (StringBuilder) ((Object) stackIn_74_1);
              stackIn_75_2 = "{...}";
              break L19;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_69_0), stackIn_75_2 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_36_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_44_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_54_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_62_0;
                } else {
                  return stackIn_65_0;
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
                stackIn_6_0 = 1;
                break L1;
              }
            }
          }
          stackIn_6_0 = 0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    private final void b(byte param0) {
        int var2;
        int var3;
        int var4;
        int var5;
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
            if (var3 > this.field_i) {
              var3 = this.field_i;
              break L1;
            } else {
              if (var3 < this.field_k) {
                var3 = this.field_k;
                break L1;
              } else {
                break L1;
              }
            }
          }
          L2: {
            if (var2 <= this.field_g) {
              if (var2 >= this.field_p) {
                break L2;
              } else {
                var2 = this.field_p;
                break L2;
              }
            } else {
              var2 = this.field_g;
              break L2;
            }
          }
          L3: {
            if (0.0f >= this.field_s) {
              break L3;
            } else {
              var4 = (int)(this.field_s * (float)var3 + 0.5f);
              if (var2 >= var4) {
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
              if (bd.field_k != var2) {
                break L5;
              } else {
                if (var3 == th.field_e) {
                  break L4;
                } else {
                  break L5;
                }
              }
            }
            this.field_q.a((byte) 53, var3, var2);
            break L4;
          }
          L6: {
            if (this.field_n <= 0) {
              break L6;
            } else {
              em.field_r = (this.field_n - bd.field_k) / 2;
              break L6;
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
