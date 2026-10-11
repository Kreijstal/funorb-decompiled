/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class sg {
    int field_b;
    private int field_j;
    static int field_a;
    private int field_d;
    private int field_o;
    private int field_h;
    static dg field_l;
    private int field_e;
    private Lexicominos field_k;
    private fi field_c;
    fc field_m;
    int field_g;
    private int field_n;
    static oc field_i;
    static String field_f;

    private final void a(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = Lexicominos.field_L ? 1 : 0;
        try {
          if (2 == this.field_d &&
            vb.field_i >= 2 &&
            pe.field_b >= 97 &&
            122 >= pe.field_b) {
            if (pe.field_b == 115 &&
              this.field_n != 1) {
              this.field_n = this.field_n + 1;
            } else {
              if (pe.field_b == 115) {
                this.field_n = 1;
              } else {
                if (117 == pe.field_b &&
                  1 == this.field_n) {
                  this.field_n = this.field_n + 1;
                } else {
                  this.field_n = 0;
                }
              }
            }
            if (this.field_n == 4) {
              System.out.println(el.field_c.field_C);
              this.field_n = 0;
            }
          }
          if (param0 != -17253) {
            this.a(true, false);
          }
          if (this.field_d != 3 &&
            this.field_d != 12 &&
            this.field_d != 13) {
            if (this.field_d != 4 &&
              this.field_d != 11) {
              if (this.field_d == 8) {
                if (da.field_b == 98) {
                  if (this.field_c.field_d != -1 &&
                    1 >= this.field_c.field_d) {
                    this.field_c.a(2, 101);
                  } else {
                    this.field_c.a(0, 91);
                  }
                }
                if (da.field_b == 99) {
                  if (this.field_c.field_d == 2) {
                    this.field_c.a(0, 91);
                  } else {
                    this.field_c.a(2, 108);
                  }
                }
                if (da.field_b == 96) {
                  if (1 > this.field_c.field_d) {
                    this.field_c.a(1, 113);
                  } else {
                    if (this.field_c.field_d == 1) {
                      this.field_c.a(0, 87);
                    }
                  }
                }
                if (97 == da.field_b) {
                  if (this.field_c.field_d != 0) {
                    if (this.field_c.field_d < 2) {
                      this.field_c.a(0, 89);
                    }
                  } else {
                    this.field_c.a(1, 120);
                  }
                }
                this.field_c.b((byte) 24);
                return;
              }
              if (this.field_d > 8 &&
                this.field_d < 11) {
                if (98 == da.field_b) {
                  if (this.field_c.field_d != -1 &&
                    this.field_c.field_d <= 2) {
                    this.field_c.a(3, 126);
                  } else {
                    this.field_c.a(1, 114);
                  }
                }
                if (da.field_b == 99) {
                  if (this.field_c.field_d == 3) {
                    this.field_c.a(1, param0 ^ -17167);
                  } else {
                    this.field_c.a(3, 88);
                  }
                }
                if (da.field_b == 96) {
                  if (this.field_c.field_d < 1) {
                    this.field_c.a(2, 97);
                  } else {
                    if (3 > this.field_c.field_d) {
                      this.field_c.a(this.field_c.field_d - 1, 104);
                    }
                  }
                }
                if (da.field_b == 97) {
                  if (0 != this.field_c.field_d) {
                    if (this.field_c.field_d != 1) {
                      if (3 > this.field_c.field_d) {
                        this.field_c.a(0, 90);
                      }
                    } else {
                      this.field_c.a(2, param0 + 17344);
                    }
                  } else {
                    this.field_c.a(1, 121);
                  }
                }
                this.field_c.b((byte) 86);
                return;
              }
              this.field_c.a((byte) -123);
              return;
            }
            if (da.field_b == 98) {
              if (this.field_c.field_d != -1 &&
                this.field_c.field_d <= 1) {
                this.field_c.a(2, 107);
              } else {
                this.field_c.a(1, param0 + 17376);
              }
            }
            if (da.field_b == 99) {
              if (this.field_c.field_d != 2) {
                this.field_c.a(2, param0 ^ -17213);
              } else {
                this.field_c.a(1, 86);
              }
            }
            if (96 == da.field_b) {
              if (this.field_c.field_d < 1) {
                this.field_c.a(1, 116);
              } else {
                if (1 == this.field_c.field_d) {
                  this.field_c.a(0, 103);
                }
              }
            }
            if (da.field_b == 97) {
              if (0 == this.field_c.field_d) {
                this.field_c.a(1, 109);
              } else {
                if (this.field_c.field_d < 2) {
                  this.field_c.a(0, param0 + 17341);
                }
              }
            }
            this.field_c.b((byte) -128);
            return;
          }
          this.field_c.c((byte) 110);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var2), "sg.W(" + param0 + ')');
        }
    }

    final static void a(java.awt.Component param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          param0.setFocusTraversalKeysEnabled(false);
          if (param1 != 2) {
            sg.a(false);
          }
          param0.addKeyListener(ol.field_l);
          param0.addFocusListener(ol.field_l);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_7_0 = runtimeException;
          stackIn_7_1 = new StringBuilder().append("sg.F(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(byte param0, int param1, int param2) {
        try {
          lf.b(param2, param1, 40, 40, 6, 12845056);
          int var4_int = 22 / ((param0 - 2) / 34);
          lf.b(param2 + 1, 1 + param1, 38, 38, 4, 12845056);
          lf.b(param2 + 2, param1 + 2, 36, 36, 2, 12845056);
          lf.b(param2 + 2, param1 + 2, 36, 36, 3, 12845056);
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "sg.R(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(boolean param0, int param1) {
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        String var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        String var10Lifetime1;
        String var10Lifetime2;
        var15 = Lexicominos.field_L ? 1 : 0;
        try {
          if (!param0) {
            stackIn_5_0 = sc.field_g;
          } else {
            stackIn_5_0 = ee.field_a;
          }
          var3_int = stackIn_5_0;
          var4 = -50 / ((param1 + 36) / 58);
          if (this.field_e <= -1) {
            if (!ki.a((byte) -116)) {
              bi.field_a.a(tj.field_k, 48, 50, 242, qc.field_c[this.field_d] - 100, 0, -1, 1, 1, bi.field_a.field_C);
            } else {
              bi.field_a.a(tj.field_k + "<br><br>" + al.field_G, 48, 50, 242, qc.field_c[this.field_d] - 100, 0, -1, 1, 1, bi.field_a.field_C);
            }
            return;
          }
          stackIn_10_0 = ((1 << this.field_e & var3_int) != 0) ? 1 : 0;
          var5 = stackIn_10_0;
          if (this.field_e < 15) {
            stackIn_16_0 = 0;
          } else {
            stackIn_16_0 = (var5 == 0) ? 1 : 0;
          }
          var6 = stackIn_16_0;
          bi.field_a.a(df.field_d[this.field_e], 155, 58, 0, -1);
          var7 = bi.field_a.field_C;
          var8 = 58 + var7;
          if (var5 == 0) {
            bi.field_a.a(uc.field_mb, 155, var8, 16711680, -1);
            this.a(e.field_u, 0, 91, var8);
          } else {
            bi.field_a.a(ni.field_c, 155, var8, 0, -1);
            this.a(ef.field_d[this.field_e], 0, 91, var8);
          }
          var8 = var8 + (128 + bi.field_a.field_E);
          var9 = hc.field_ib[this.field_e];
          if (var6 != 0) {
            var9 = of.field_b;
            var10 = var9;
            var10Lifetime2 = var9;
          }
          bi.field_a.a(var9, 48, -bi.field_a.field_E + var8, 242, 1000, 0, -1, 1, 0, var7);
          var8 = var8 + 2 * var7;
          var10Lifetime1 = Integer.toString(hi.field_c[this.field_e] * 100);
          if (var6 != 0) {
            var10Lifetime1 = "?";
          }
          bi.field_a.a(w.field_s + var10Lifetime1, 169, var8, 0, -1);
          var8 = var8 + var7;
          var11 = bi.field_a.b(he.field_i);
          if (var6 == 0) {
            var12 = hi.field_c[this.field_e];
            var13 = (var12 - 1) * 10 + (var11 + (ob.field_e.field_p >> 2));
            var14 = -var13 + 338 >> 1;
            bi.field_a.b(he.field_i, var14, var8, 0, -1);
            var14 = var14 + var11;
            while (0 < var12) {
              ob.field_e.c(var14, -bi.field_a.field_E + var8);
              var14 += 10;
              var12--;
            }
          } else {
            var12 = var11 - (-(ob.field_e.field_p >> 2) - bi.field_a.b(id.field_t));
            var13 = 338 - var12 >> 1;
            bi.field_a.b(he.field_i, var13, var8, 0, -1);
            var13 = var13 + var11;
            ob.field_e.c(var13, var8 - bi.field_a.field_E);
            bi.field_a.b(id.field_t, var13 + (ob.field_e.field_p >> 2), var8, 0, -1);
          }
          var8 = var8 + ob.field_e.field_u;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var3), "sg.G(" + param0 + ',' + param1 + ')');
        }
    }

    final static ra a(int param0, int param1, int param2, int param3, int param4, ab param5) {
        java.awt.Frame var6 = null;
        RuntimeException var6_ref = null;
        ra var7 = null;
        java.awt.Frame var8 = null;
        Object stackIn_2_0 = null;
        ra stackIn_4_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8 = oh.a(param2, param1, param4, (byte) 64, param3, param5);
          var6 = var8;
          if (var8 == null) {
            stackIn_2_0 = null;
            return (ra) (stackIn_2_0);
          }
          var7 = new ra();
          var7.field_b = var8;
          var7.field_b.add((java.awt.Component) ((Object) var7));
          var7.setBounds(param0, 0, param1, param2);
          var7.addFocusListener(var7);
          var7.requestFocus();
          stackIn_4_0 = var7;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_8_0 = var6_ref;
          stackIn_8_1 = new StringBuilder().append("sg.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    private final void a(int param0, boolean param1, int param2) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int stackIn_187_0 = 0;
        Lexicominos stackIn_191_0 = null;
        int stackIn_191_1 = 0;
        boolean stackIn_191_2 = false;
        int stackIn_192_3;
        int stackIn_257_0 = 0;
        int stackIn_265_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        sg var7 = null;
        sg var8 = null;
        var6 = Lexicominos.field_L ? 1 : 0;
        try {
          boolean decompiledFrameRemainder0 = true;
          var4_int = qc.field_a[this.field_d][param2];
          if (var4_int != 1) {
            if (var4_int == 2) {
              if (this.field_c.d(0)) {
                if (this.field_d >= 8 &&
                  11 >= this.field_d) {
                  this.field_k.a((byte) -51, param1, 0, 0);
                } else {
                  this.field_k.a((byte) -73, param1, this.field_g, vg.field_d[this.field_g].field_g);
                }
              }
            } else {
              if (var4_int != 14) {
                if (5 == var4_int) {
                  if (this.field_c.d(0)) {
                    this.field_k.a((byte) 98, param1, 1, 0);
                  }
                } else {
                  if (16 != var4_int) {
                    if (var4_int == 17) {
                      if (this.field_c.d(0)) {
                        if (this.field_d != 4) {
                          if (this.field_d != 13) {
                            if (this.field_d > 8 &&
                              11 >= this.field_d) {
                              this.field_k.a((byte) -44, param1, -1 + this.field_d, 14);
                              var4_int = -1;
                              for (var5 = 0; var5 < qc.field_a[this.field_d - 1].length; var5++) {
                                if (17 == qc.field_a[-1 + this.field_d][var5]) {
                                  var4_int = var5;
                                }
                              }
                              if (-1 == var4_int) {
                                for (var5 = 0; var5 < qc.field_a[-1 + this.field_d].length; var5++) {
                                  if (qc.field_a[this.field_d - 1][var5] == 16) {
                                    var4_int = var5;
                                  }
                                }
                              }
                              var8 = vg.field_d[-1 + this.field_d];
                              var8.field_c.a(0, param1, var8.a(bk.field_b, sh.field_e, 640), var4_int);
                            }
                          } else {
                            this.field_k.a((byte) 120, param1, 12, this.field_g);
                          }
                        } else {
                          this.field_k.a((byte) 121, param1, 3, this.field_g);
                        }
                      }
                    } else {
                      if (var4_int != 13) {
                        if (var4_int != 6) {
                          if (var4_int == 19) {
                            if (this.field_c.d(0)) {
                              this.field_k.a((byte) 116, param1, this.field_g, 14);
                            }
                          } else {
                            if (var4_int != 20) {
                              if (var4_int != 8) {
                                if (var4_int == 15) {
                                  if (this.field_c.d(0)) {
                                    this.field_k.a((byte) -85, param1, 5, this.field_d);
                                  }
                                } else {
                                  if (12 != var4_int) {
                                    if (var4_int != 11) {
                                      if (var4_int == 9) {
                                        if (this.field_c.b(-98) ||
                                          this.field_c.e(471859200)) {
                                          tg.field_j = 32 / tg.field_j;
                                        }
                                      } else {
                                        if (var4_int != 10) {
                                          if (var4_int == 4) {
                                            if (this.field_c.e((byte) -60)) {
                                              g.a(0, 118);
                                            }
                                            if (this.field_c.a(-104)) {
                                              g.a(256, 92);
                                            }
                                            if (this.field_c.c(-1)) {
                                              var4_int = this.a(bk.field_b, sh.field_e, (byte) 95);
                                              if (0 <= var4_int) {
                                                g.a(var4_int, 107);
                                              }
                                            }
                                            if (this.field_c.f(98)) {
                                              if (oc.field_e <= 32) {
                                                g.a(0, 112);
                                              } else {
                                                g.a(-32 + oc.field_e, 80);
                                              }
                                            }
                                            if (this.field_c.d((byte) 85)) {
                                              if (oc.field_e >= 224) {
                                                g.a(256, 115);
                                              } else {
                                                g.a(32 + oc.field_e, 89);
                                              }
                                            }
                                          } else {
                                            if (7 != var4_int) {
                                              if (var4_int != 3) {
                                                if (var4_int == 18) {
                                                  if (this.field_c.d(0)) {
                                                    this.field_k.a((byte) 83, param1, 8, 14);
                                                  }
                                                } else {
                                                  if (var4_int != 21) {
                                                    throw new IllegalStateException();
                                                  }
                                                  if (this.field_c.d(0) &&
                                                    param1) {
                                                    var4_int = this.a(false, ck.field_a, ef.field_a, -89);
                                                    if (var4_int != -1) {
                                                      jf.field_I = var4_int;
                                                    }
                                                  }
                                                  if (this.field_c.f(-126) &&
                                                    !param1) {
                                                    fieldTemp$0 = jf.field_I - 1;
                                                    jf.field_I = jf.field_I - 1;
                                                    if (fieldTemp$0 < 0) {
                                                      jf.field_I = fl.field_a.length - 1;
                                                    }
                                                  }
                                                  if (this.field_c.d((byte) 88) &&
                                                    !param1) {
                                                    fieldTemp$1 = jf.field_I + 1;
                                                    jf.field_I = jf.field_I + 1;
                                                    if (fieldTemp$1 == fl.field_a.length) {
                                                      jf.field_I = 0;
                                                    }
                                                  }
                                                }
                                              } else {
                                                if (this.field_c.e(471859200)) {
                                                  stackIn_257_0 = rg.field_b;
                                                  while (true) {
                                                    if (stackIn_257_0 == 0) {
                                                      rg.field_b = id.field_w.length;
                                                    }
                                                    rg.field_b = rg.field_b - 1;
                                                    if (!id.field_w[rg.field_b].field_e) {
                                                      break;
                                                    }
                                                    stackIn_257_0 = rg.field_b;
                                                  }
                                                }
                                                if (this.field_c.b(-98)) {
                                                  stackIn_265_0 = rg.field_b;
                                                  while (true) {
                                                    rg.field_b = stackIn_265_0 + 1;
                                                    if (rg.field_b == id.field_w.length) {
                                                      rg.field_b = 0;
                                                    }
                                                    if (!id.field_w[rg.field_b].field_e) {
                                                      break;
                                                    }
                                                    stackIn_265_0 = rg.field_b;
                                                  }
                                                }
                                              }
                                            } else {
                                              if (this.field_c.e((byte) -60)) {
                                                uh.field_n.a(0, 0);
                                              }
                                              if (this.field_c.a(-104)) {
                                                uh.field_n.a(0, 256);
                                              }
                                              if (this.field_c.c(-1)) {
                                                var4_int = this.a(bk.field_b, sh.field_e, (byte) 95);
                                                if (var4_int >= 0) {
                                                  uh.field_n.a(0, var4_int);
                                                }
                                              }
                                              if (this.field_c.f(-50)) {
                                                if (uh.field_n.field_u > 32) {
                                                  uh.field_n.a(0, uh.field_n.field_u - 32);
                                                } else {
                                                  uh.field_n.a(0, 0);
                                                }
                                              }
                                              if (this.field_c.d((byte) 126)) {
                                                if (uh.field_n.field_u < 224) {
                                                  uh.field_n.a(0, uh.field_n.field_u + 32);
                                                } else {
                                                  uh.field_n.a(0, 256);
                                                }
                                              }
                                            }
                                          }
                                        } else {
                                          if (this.field_c.d(0)) {
                                            if (null == ff.field_b) {
                                              var4_int = param1 ? 1 : 0;
                                              kl.a(3 * bi.field_a.field_E >> 1, 4, 320, jh.field_b, 12, bi.field_a, 4, (byte) -33, nh.field_c, var4_int != 0, 1 + bi.field_a.field_E, 240);
                                            } else {
                                              af.a(-85);
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      if (this.field_c.d(0)) {
                                        el.field_c.a((byte) 99, 4);
                                        th.field_o[2].e(0);
                                        if (!ki.a((byte) -118)) {
                                          stackIn_191_0 = this.field_k;
                                          stackIn_191_1 = -52;
                                          stackIn_191_2 = param1;
                                          if (0 >= ee.field_a) {
                                            stackIn_192_3 = 1;
                                          } else {
                                            stackIn_192_3 = 7;
                                          }
                                          ((Lexicominos) (Object) stackIn_191_0).a((byte) stackIn_191_1, stackIn_191_2, stackIn_192_3, 0);
                                        } else {
                                          stackIn_187_0 = ((ee.field_a | el.field_c.field_J) != 0) ? 6 : 0;
                                          var4_int = stackIn_187_0;
                                          this.field_k.a((byte) -47, param1, var4_int, var4_int);
                                        }
                                      }
                                    }
                                  } else {
                                    if (this.field_c.d(0)) {
                                      this.field_k.a((byte) -74, param1, -2, -2);
                                    }
                                  }
                                }
                              } else {
                                if (this.field_c.d(0)) {
                                  if (this.field_d != 2 &&
                                    this.field_d != 14) {
                                    this.field_k.a((byte) -126, param1, 3, this.field_d);
                                  } else {
                                    this.field_k.a((byte) 76, param1, 12, this.field_d);
                                  }
                                }
                              }
                            } else {
                              if (this.field_c.d(0)) {
                                this.field_k.a((byte) -54, param1, 0, 0);
                              }
                            }
                          }
                        } else {
                          if (this.field_c.d(0)) {
                            this.field_k.a((byte) -83, param1, -1, 2);
                          }
                        }
                      } else {
                        if (this.field_c.d(0)) {
                          if (this.field_d != 5 &&
                            this.field_d != 1) {
                            if ((6 == this.field_d)) {
                              qc.a(this.field_d, 7, 64);
                            }
                            decompiledFrameRemainder0 = false;
                          }
                          else {
                            qc.a(this.field_d, this.field_d, 39);
                          }
                        }
                      }
                    }
                  } else {
                    if (this.field_c.d(0)) {
                      if (3 == this.field_d) {
                        this.field_k.a((byte) -47, param1, 4, this.field_g);
                      } else {
                        if (this.field_d != 12) {
                          if (this.field_d >= 8 &&
                            this.field_d < 11) {
                            this.field_k.a((byte) 115, param1, 1 + this.field_d, 14);
                            var4_int = -1;
                            for (var5 = 0; qc.field_a[1 + this.field_d].length > var5; var5++) {
                              if (16 == qc.field_a[1 + this.field_d][var5]) {
                                var4_int = var5;
                              }
                            }
                            if (var4_int == -1) {
                              for (var5 = 0; var5 < qc.field_a[this.field_d + 1].length; var5++) {
                                if (qc.field_a[this.field_d + 1][var5] == 1) {
                                  var4_int = var5;
                                }
                              }
                            }
                            var7 = vg.field_d[this.field_d + 1];
                            var7.field_c.a(0, param1, var7.a(bk.field_b, sh.field_e, 640), var4_int);
                          }
                        } else {
                          this.field_k.a((byte) 119, param1, 13, this.field_g);
                        }
                      }
                    }
                  }
                }
              } else {
                if (this.field_c.d(0)) {
                  this.field_k.a((byte) 118, param1, 0, 0);
                }
              }
            }
          } else {
            if (this.field_c.d(0)) {
              if (ve.field_a &&
                !ki.a((byte) -118)) {
                if (!hh.field_N.field_k) {
                  ve.field_a = false;
                } else {
                  if (hh.field_N.field_n != null) {
                    if (hh.field_N.field_n[1][0] != 0) {
                      ve.field_a = false;
                    }
                  } else {
                    ve.field_a = false;
                  }
                }
              }
              if (!ve.field_a) {
                if (el.field_c != null &&
                  !el.field_c.a((byte) 94)) {
                  this.field_k.a((byte) -105, param1, -1, 2);
                } else {
                  hh.field_N = null;
                  if (vb.field_i >= 2 &&
                    wa.field_j[82]) {
                    oe.field_a = 0;
                  }
                  ki.field_d = null;
                  el.field_c = new fc(this.field_k, id.field_w[rg.field_b], new Random());
                  this.field_k.a((byte) 126, param1, -1, 2);
                  ki.a(960000, el.field_c.field_I, -128);
                }
              } else {
                this.field_k.a((byte) 127, param1, 8, 14);
              }
            }
          }
          if (param0 <= 89) {
            this.field_d = -27;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var4), "sg.O(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void b(int param0) {
        try {
          field_i = null;
          field_f = null;
          field_l = null;
          if (param0 != 0) {
            sg.b(80);
          }
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "sg.I(" + param0 + ')');
        }
    }

    private final int b(byte param0, int param1) {
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_33_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0 != -19) {
            stackIn_2_0 = -42;
            return stackIn_2_0;
          }
          if (this.field_d != 3 &&
            12 != this.field_d &&
            13 != this.field_d) {
            if (this.field_d == 4) {
              if (param1 >= 2) {
                stackIn_14_0 = qc.field_c[this.field_d];
                return stackIn_14_0;
              }
              stackIn_12_0 = gg.field_a[0].field_x + qc.field_c[this.field_d];
              return stackIn_12_0;
            }
            if (this.field_d != 8 &&
              this.field_d != 11) {
              if (this.field_d > 8 &&
                this.field_d < 11) {
                if (param1 < 3) {
                  stackIn_26_0 = qc.field_c[this.field_d] + gg.field_a[0].field_x;
                  return stackIn_26_0;
                }
                stackIn_28_0 = qc.field_c[this.field_d];
                return stackIn_28_0;
              }
              stackIn_21_0 = param1 * uk.field_U[this.field_d] + qc.field_c[this.field_d];
              return stackIn_21_0;
            }
            if (2 <= param1) {
              stackIn_33_0 = qc.field_c[this.field_d];
              return stackIn_33_0;
            }
            stackIn_31_0 = qc.field_c[this.field_d] + gg.field_a[0].field_x;
            return stackIn_31_0;
          }
          stackIn_8_0 = qc.field_c[this.field_d];
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var3), "sg.D(" + param0 + ',' + param1 + ')');
        }
    }

    private final void b(boolean param0, int param1) {
        int var11 = 0;
        int stackIn_5_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_27_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var5Lifetime1;
        var15 = Lexicominos.field_L ? 1 : 0;
        try {
          if (bk.field_b != -1) {
            stackIn_5_0 = qb.field_b[sh.field_e * 640 + bk.field_b];
          } else {
            stackIn_5_0 = 0;
          }
          var5 = stackIn_5_0;
          if (var5 < 0) {
            var3_int = -1;
            var4 = -1;
          } else {
            var4 = 2 + (var5 & 2047) >> 2;
            var3_int = (2047 & var5 >> 11) + 2 >> 2;
          }
          if (-1 == this.field_o) {
            stackIn_12_0 = 0;
          } else {
            stackIn_12_0 = qb.field_b[this.field_o + this.field_j * 640];
          }
          var5Lifetime1 = stackIn_12_0;
          if (var5Lifetime1 >= 0) {
            var6 = 2 + ((4193020 & var5Lifetime1) >> 11) >> 2;
            var7 = (2047 & var5Lifetime1) + 2 >> 2;
          } else {
            var6 = -1;
            var7 = -1;
          }
          if (!param0) {
            stackIn_19_0 = sc.field_g;
          } else {
            stackIn_19_0 = ee.field_a;
          }
          var8 = stackIn_19_0;
          var9 = 0;
          var10 = -1 + jf.a((byte) 108, ee.field_a);
          this.field_e = -1;
          if (param1 != 640) {
            field_a = 35;
          }
          for (var11 = 0; df.field_d.length > var11; var11++) {
            stackIn_27_0 = ((var8 & 1 << var11) != 0) ? 1 : 0;
            var12 = stackIn_27_0;
            if (var12 != 0 ||
              var11 != 14 &&
              !param0) {
              if (param0) {
                var13 = ik.field_s[sb.field_e[var10][var9]];
                var14 = ik.field_b[sb.field_e[var10][var9]];
                var9++;
              } else {
                var13 = ik.field_s[var11];
                var14 = ik.field_b[var11];
              }
              if (var12 != 0) {
                ef.field_d[var11].c(var13, var14);
              } else {
                e.field_u.c(var13, var14);
              }
              if (var3_int >= var13 &&
                var3_int <= 32 + var13 &&
                var4 >= var14 &&
                var4 <= 32 + var14) {
                this.field_e = var11;
                if (var12 != 0) {
                  md.field_A[var11].c(var13, var14);
                } else {
                  fl.field_c.c(var13, var14);
                }
              }
              if (-1 != this.field_o &&
                var13 <= var6 &&
                var6 <= var13 + 32 &&
                var7 >= var14 &&
                var14 + 32 >= var7) {
                this.field_o = -1;
                if (this.field_h == var11) {
                  this.field_h = -1;
                } else {
                  this.field_h = var11;
                }
              }
              if (this.field_h == var11) {
                if (var12 != 0) {
                  fc.field_e[var11].c(var13, var14);
                } else {
                  ri.field_b.c(var13, var14);
                }
              }
            }
          }
          if (this.field_h > -1) {
            this.field_e = this.field_h;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var3), "sg.K(" + param0 + ',' + param1 + ')');
        }
    }

    private final boolean a(int param0, int param1) {
        int discarded$1 = 0;
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 0) {
            return true;
          }
          discarded$1 = this.a((byte) -126, -123);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var3), "sg.J(" + param0 + ',' + param1 + ')');
        }
    }

    private final int b(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 14638) {
            field_l = (dg) null;
          }
          stackIn_3_0 = gg.field_a[0].field_x;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var3), "sg.P(" + param0 + ',' + param1 + ')');
        }
    }

    final static hc a(byte param0, String param1) {
        String var2 = null;
        hc var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_14_0 = null;
        hc stackIn_20_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = Lexicominos.field_L ? 1 : 0;
        try {
          if (param0 < 63) {
            field_l = (dg) null;
          }
          if (pf.field_n == null) {
            return null;
          }
          if (null == param1) {
            return null;
          }
          if (param1.length() == 0) {
            return null;
          }
          var6 = (CharSequence) ((Object) param1);
          var2 = ck.a(var6, (byte) -48);
          if (var2 == null) {
            stackIn_14_0 = null;
            return (hc) (stackIn_14_0);
          }
          var3 = (hc) (pf.field_n.a((long)var2.hashCode(), true));
          while (true) {
            if (var3 == null) {
              return null;
            }
            var7 = (CharSequence) ((Object) var3.field_R);
            var4 = ck.a(var7, (byte) -48);
            if (!var4.equals(var2)) {
              var3 = (hc) (pf.field_n.b(-109));
              continue;
            }
            break;
          }
          stackIn_20_0 = var3;
          return stackIn_20_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_26_0 = var2_ref;
          stackIn_26_1 = new StringBuilder().append("sg.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    private final int a(int param0, int param1, byte param2) {
        int discarded$1 = 0;
        int var4_int = 0;
        int stackIn_14_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param2 != 95) {
            discarded$1 = this.a((byte) 81, 21);
          }
          var4_int = qb.field_b[param1 * 640 + param0];
          if (param0 < 0 ||
            param1 < 0 ||
            640 <= param0 ||
            param1 >= 480) {
            var4_int = -1;
          }
          param1 = -1;
          param0 = -1;
          if (var4_int >= -1) {
            stackIn_20_0 = -1;
            return stackIn_20_0;
          }
          param1 = 2 + (2047 & var4_int) >> 2;
          param0 = ((var4_int & 4192829) >> 11) + 2 >> 2;
          param0 = param0 - (118 + jf.field_N.field_r / 2);
          if (param0 < 0) {
            stackIn_18_0 = 0;
            return stackIn_18_0;
          }
          if (param0 >= 128) {
            stackIn_16_0 = 256;
            return stackIn_16_0;
          }
          stackIn_14_0 = param0 << 1;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var4), "sg.AA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(boolean param0, boolean param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        java.awt.Component var4 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 0;
          if (this.field_d == 0 &&
            this.field_c.field_d != -1) {
            var3_int = this.field_c.field_d;
          }
          if ((this.field_d == 2 ||
            this.field_d == 14) &&
            (this.field_c.field_d != -1 &&
            -1 != aa.field_j)) {
            var3_int = this.field_c.field_d;
          }
          if (!param1) {
            var4 = (java.awt.Component) null;
            sg.a((java.awt.Component) null, -7);
          }
          if (this.field_d == 3) {
            var3_int = 1;
          }
          this.field_c.a(0, param0, this.a(bk.field_b, sh.field_e, 640), var3_int);
          this.field_h = -1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) runtimeException), "sg.A(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, db param3, int param4) {
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var13Lifetime1;
        int var13Lifetime2;
        try {
          param0 = param0 + param3.field_w;
          param4 = param4 + param3.field_s;
          var6_int = param4 + param0 * lf.field_f;
          var7 = 0;
          var8 = param3.field_u;
          var10 = 117 / ((param1 + 50) / 45);
          var9 = param3.field_p;
          var11 = lf.field_f - var9;
          if (lf.field_c > param0) {
            var13 = -param0 + lf.field_c;
            var6_int = var6_int + var13 * lf.field_f;
            var8 = var8 - var13;
            param0 = lf.field_c;
            var7 = var7 + var9 * var13;
          }
          var12 = 0;
          if (lf.field_h < var8 + param0) {
            var8 = var8 - (var8 + param0 - lf.field_h);
          }
          if (lf.field_g > param4) {
            var13Lifetime1 = lf.field_g - param4;
            var12 = var12 + var13Lifetime1;
            var11 = var11 + var13Lifetime1;
            var6_int = var6_int + var13Lifetime1;
            param4 = lf.field_g;
            var7 = var7 + var13Lifetime1;
            var9 = var9 - var13Lifetime1;
          }
          if (var9 + param4 > lf.field_e) {
            var13Lifetime2 = -lf.field_e + param4 + var9;
            var9 = var9 - var13Lifetime2;
            var11 = var11 + var13Lifetime2;
            var12 = var12 + var13Lifetime2;
          }
          if (var9 > 0 &&
            var8 > 0) {
            d.a(param2, param3.field_y, var11, var8, var12, var9, var7, -61498200, lf.field_b, 0, var6_int);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_22_0 = var6;
          stackIn_22_1 = new StringBuilder().append("sg.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param4).append(')').toString());
        }
    }

    private final void a(db param0, int param1, int param2, int param3) {
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var11Lifetime1;
        int var11Lifetime2;
        try {
          param2 = param2 + param0.field_s;
          param3 = param3 + param0.field_w;
          var5_int = param2 + param3 * lf.field_f;
          var6 = 0;
          var7 = param0.field_u;
          var8 = param0.field_p;
          var9 = lf.field_f - var8;
          if (param3 < lf.field_c) {
            var11 = lf.field_c - param3;
            param3 = lf.field_c;
            var6 = var6 + var11 * var8;
            var5_int = var5_int + lf.field_f * var11;
            var7 = var7 - var11;
          }
          var10 = 0;
          if (param2 < lf.field_g) {
            var11Lifetime1 = lf.field_g - param2;
            var10 = var10 + var11Lifetime1;
            var9 = var9 + var11Lifetime1;
            var5_int = var5_int + var11Lifetime1;
            var8 = var8 - var11Lifetime1;
            var6 = var6 + var11Lifetime1;
            param2 = lf.field_g;
          }
          if (var7 + param3 > lf.field_h) {
            var7 = var7 - (param3 + var7 - lf.field_h);
          }
          if (lf.field_e < var8 + param2) {
            var11Lifetime2 = -lf.field_e + var8 + param2;
            var9 = var9 + var11Lifetime2;
            var8 = var8 - var11Lifetime2;
            var10 = var10 + var11Lifetime2;
          }
          if (var8 > 0 &&
            var7 > 0) {
            kc.a(var7, var8, lf.field_b, var6, param1, var10, param1 ^ 8, var5_int, param0.field_y, var9);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_19_0 = var5;
          stackIn_19_1 = new StringBuilder().append("sg.M(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final int a(int param0, int param1, int param2) {
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_54_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        db var11 = null;
        int var12 = 0;
        var12 = Lexicominos.field_L ? 1 : 0;
        try {
          if (param0 >= 0 &&
            param1 >= 0) {
            if (param0 < param2 &&
              param1 < 480) {
              var4_int = qb.field_b[param0 + param1 * 640];
              if (var4_int < 0 &&
                -1 != var4_int) {
                var5 = (2047 & var4_int >> 11) + 2 >> 2;
                var6 = 2 + (2047 & var4_int) >> 2;
                var7 = 0;
                if (this.field_d == 3 ||
                  this.field_d == 12) {
                  var7 = 1;
                }
                if (this.field_d == 4 ||
                  this.field_d == 13) {
                  var7 = 1;
                }
                if (this.field_d >= 8 &&
                  this.field_d <= 11) {
                  var7 = 1;
                }
                if (var7 == 0) {
                  for (var8 = 0; var8 < qc.field_a[this.field_d].length; var8++) {
                    var9 = this.b((byte) -19, var8);
                    if (this.a(var8, 0) &&
                      var9 <= var6 &&
                      var6 < this.b(14638, var8) + var9) {
                      stackIn_51_0 = var8;
                      return stackIn_51_0;
                    }
                  }
                } else {
                  for (var8 = 0; qc.field_a[this.field_d].length > var8; var8++) {
                    var9 = this.a((byte) 46, var8);
                    var10 = this.b((byte) -19, var8);
                    var11 = gg.field_a[qc.field_a[this.field_d][var8] - 1];
                    if (this.a(var8, 0) &&
                      var5 >= var9 + var11.field_s &&
                      var5 < var11.field_p + var9 + var11.field_s &&
                      var6 >= var10 &&
                      var6 < this.b(14638, var8) + var10) {
                      stackIn_41_0 = var8;
                      return stackIn_41_0;
                    }
                  }
                  stackIn_44_0 = -1;
                  return stackIn_44_0;
                }
              }
              stackIn_54_0 = -1;
              return stackIn_54_0;
            }
            stackIn_12_0 = -1;
            return stackIn_12_0;
          }
          stackIn_6_0 = -1;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var4), "sg.L(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void c(int param0) {
        int var8_int = 0;
        int var5 = 0;
        boolean stackIn_14_1 = false;
        int stackIn_50_0 = 0;
        cd stackIn_50_1 = null;
        int stackIn_51_2 = 0;
        int stackIn_54_0;
        cd stackIn_54_1;
        int stackIn_54_2;
        boolean stackIn_54_3;
        int stackIn_54_4;
        int stackIn_55_0 = 0;
        cd stackIn_55_1 = null;
        int stackIn_55_2 = 0;
        boolean stackIn_55_5 = false;
        int stackIn_58_0;
        cd stackIn_58_1;
        int stackIn_58_2;
        int stackIn_58_3;
        int stackIn_59_4 = 0;
        int stackIn_62_0;
        cd stackIn_62_1;
        int stackIn_62_2;
        int stackIn_62_3;
        int stackIn_62_4;
        int stackIn_63_0 = 0;
        cd stackIn_63_1 = null;
        int stackIn_63_2 = 0;
        int stackIn_63_3 = 0;
        int stackIn_63_4 = 0;
        boolean stackIn_63_5 = false;
        int stackIn_66_0 = 0;
        int stackIn_66_1 = 0;
        cd stackIn_66_2 = null;
        int stackIn_67_3 = 0;
        int stackIn_70_0;
        int stackIn_70_1;
        cd stackIn_70_2;
        int stackIn_70_3;
        int stackIn_71_0;
        int stackIn_71_1;
        cd stackIn_71_2;
        int stackIn_71_3;
        boolean stackIn_71_4;
        int stackIn_88_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        String var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var6 = 0;
        String var6_ref_String = null;
        int var7 = 0;
        String var8 = null;
        String var9 = null;
        db var10 = null;
        int var11 = 0;
        int var12 = 0;
        String[] var13 = null;
        String[] var14 = null;
        db var16 = null;
        int[] var19 = null;
        int var2_intLifetime1;
        int var2_intLifetime2;
        var12 = Lexicominos.field_L ? 1 : 0;
        try {
          if (param0 != 1) {
            this.field_o = 75;
          }
          if (na.field_a[this.field_d] != null) {
            this.a(na.field_a[this.field_d], 0, 0, 0);
          }
          for (var2_int = 0; var2_int < this.field_c.field_h; var2_int++) {
            if (this.a(var2_int, 0)) {
              stackIn_14_1 = (this.field_c.field_d == var2_int);
              this.a(stackIn_14_1, var2_int, 1956587489);
            }
          }
          boolean decompiledFrameRemainder1 = true;
          if (this.field_d == 1) {
            boolean decompiledFrameRemainder0 = true;
            var3 = pa.field_d + (pa.field_d >> 1);
            if (!ki.a((byte) -108)) {
              if (hh.field_N == null) {
                hh.field_N = ud.a(1, -68, 10, 3, 9);
              }
              if (hh.field_N.field_k) {
                if (hh.field_N.field_j != null) {
                  var2 = fd.field_a;
                  var14 = hh.field_N.field_j[jf.field_I];
                  var19 = hh.field_N.field_n[jf.field_I];
                  var6 = ul.a(ki.field_d, hh.field_N, param0 ^ 52, jf.field_I);
                  var7 = 38;
                  for (var8_int = 0; 10 > var8_int; var8_int++) {
                    if (var14[var8_int] != null) {
                      var9 = var14[var8_int];
                      var10 = id.field_w[63 & var19[var8_int]].field_h;
                      stackIn_88_0 = (var6 != var8_int) ? 0 : 10161935;
                      var11 = stackIn_88_0;
                      bi.field_a.b(var9, 66, pa.field_d + (var7 + (24 - pa.field_d) / 2), var11, -1);
                      bi.field_a.c(Integer.toString(var19[var8_int] >> 6), 301, pa.field_d + (var7 + (24 - pa.field_d) / 2), var11, -1);
                      this.a(-(var10.field_u / 2) + var7 + 12, param0 ^ -109, 64, var10, -(var10.field_p / 2) + 36);
                      var2 = "";
                      bi.field_a.c(1 + var8_int + ".", 50, var7 - (-pa.field_d - (24 - pa.field_d) / 2), var11, -1);
                    }
                    var7 += 27;
                  }
                  if (((null != el.field_c)) &&
                    ((var6 == -1))) {
                    var8 = og.field_c;
                    var16 = el.field_c.field_m.field_h;
                    bi.field_a.b(var8, 66, var7 + pa.field_d + (-pa.field_d + 24) / 2, 10161935, -1);
                    bi.field_a.c(Integer.toString(el.field_c.field_J), 301, pa.field_d + var7 + (-pa.field_d + 24) / 2, 10161935, -1);
                    this.a(12 + var7 - var16.field_u / 2, param0 ^ -102, 64, var16, 36 - var16.field_p / 2);
                  }
                  decompiledFrameRemainder0 = false;
                }
                else {
                  var2 = pc.field_l;
                }
              } else {
                var2 = ta.field_b;
              }
            } else {
              var2 = fd.field_a;
              jh.field_d.a(al.field_G, 20, -jh.field_d.field_E + 280, 271, 1000, 0, -1, 1, 0, var3);
            }
            bi.field_a.a(var2, 20, -bi.field_a.field_E + 200, 271, 1000, 0, -1, 1, 0, var3);
          } else {
            if (this.field_d != 5) {
              if (7 != this.field_d) {
                if (this.field_d == 6) {
                  var2_intLifetime1 = 50 + bi.field_a.field_E;
                  var3 = bi.field_a.field_G + (bi.field_a.field_t + 4);
                  var2_intLifetime1 = var2_intLifetime1 + var3 * bi.field_a.a(me.field_u, 40, -bi.field_a.field_E + var2_intLifetime1, 254, 1000, 0, -1, 1, 0, var3);
                  stackIn_50_0 = var2_intLifetime1;
                  stackIn_50_1 = bi.field_a;
                  if (ee.field_a == 0) {
                    stackIn_51_2 = 0;
                  } else {
                    stackIn_51_2 = 1;
                  }
                  stackIn_54_0 = stackIn_50_0;
                  stackIn_54_1 = stackIn_50_1;
                  stackIn_54_2 = stackIn_51_2;
                  stackIn_54_3 = false;
                  stackIn_54_4 = -84;
                  if (el.field_c.field_J == 0) {
                    stackIn_55_0 = stackIn_54_0;
                    stackIn_55_1 = stackIn_54_1;
                    stackIn_55_2 = stackIn_54_2;
                    stackIn_55_5 = false;
                  } else {
                    stackIn_55_0 = stackIn_50_0;
                    stackIn_55_1 = stackIn_50_1;
                    stackIn_55_2 = stackIn_51_2;
                    stackIn_55_5 = true;
                  }
                  var2_intLifetime1 = stackIn_55_0 + ((cd) (Object) stackIn_55_1).a(ii.a(stackIn_55_2 != 0, stackIn_54_3, stackIn_54_4, stackIn_55_5), 40, var2_intLifetime1 - bi.field_a.field_E, 254, 1000, 0, -1, 1, 0, var3) * var3;
                  var2_intLifetime1 = var2_intLifetime1 + (gg.field_a[0].field_x * 2 + var3);
                  stackIn_58_0 = var2_intLifetime1;
                  stackIn_58_1 = bi.field_a;
                  stackIn_58_2 = 0;
                  stackIn_58_3 = param0 - 102;
                  if (ee.field_a == 0) {
                    stackIn_59_4 = 0;
                  } else {
                    stackIn_59_4 = 1;
                  }
                  stackIn_62_0 = stackIn_58_0;
                  stackIn_62_1 = stackIn_58_1;
                  stackIn_62_2 = stackIn_58_2;
                  stackIn_62_3 = stackIn_58_3;
                  stackIn_62_4 = stackIn_59_4;
                  if (0 == el.field_c.field_J) {
                    stackIn_63_0 = stackIn_62_0;
                    stackIn_63_1 = stackIn_62_1;
                    stackIn_63_2 = stackIn_62_2;
                    stackIn_63_3 = stackIn_62_3;
                    stackIn_63_4 = stackIn_62_4;
                    stackIn_63_5 = false;
                  } else {
                    stackIn_63_0 = stackIn_58_0;
                    stackIn_63_1 = stackIn_58_1;
                    stackIn_63_2 = stackIn_58_2;
                    stackIn_63_3 = stackIn_58_3;
                    stackIn_63_4 = stackIn_59_4;
                    stackIn_63_5 = true;
                  }
                  var2_intLifetime1 = stackIn_63_0 + ((cd) (Object) stackIn_63_1).a(ac.a(stackIn_63_2 != 0, stackIn_63_3, stackIn_63_4 != 0, stackIn_63_5), 40, -bi.field_a.field_E + var2_intLifetime1, 254, 1000, 0, -1, 1, 0, var3) * var3;
                  var2_intLifetime1 = var2_intLifetime1 + gg.field_a[0].field_x;
                  stackIn_66_0 = var2_intLifetime1;
                  stackIn_66_1 = var3;
                  stackIn_66_2 = bi.field_a;
                  if (el.field_c.field_J == 0) {
                    stackIn_67_3 = 0;
                  } else {
                    stackIn_67_3 = 1;
                  }
                  stackIn_70_0 = stackIn_66_0;
                  stackIn_70_1 = stackIn_66_1;
                  stackIn_70_2 = stackIn_66_2;
                  stackIn_70_3 = stackIn_67_3;
                  if (ee.field_a == 0) {
                    stackIn_71_0 = stackIn_70_0;
                    stackIn_71_1 = stackIn_70_1;
                    stackIn_71_2 = stackIn_70_2;
                    stackIn_71_3 = stackIn_70_3;
                    stackIn_71_4 = false;
                  } else {
                    stackIn_71_0 = stackIn_66_0;
                    stackIn_71_1 = stackIn_66_1;
                    stackIn_71_2 = stackIn_66_2;
                    stackIn_71_3 = stackIn_67_3;
                    stackIn_71_4 = true;
                  }
                  var2_intLifetime1 = stackIn_71_0 + stackIn_71_1 * ((cd) (Object) stackIn_71_2).a(dd.a(stackIn_71_3 != 0, stackIn_71_4, false, -11902), 40, var2_intLifetime1 - bi.field_a.field_E, 254, 1000, 0, -1, 1, 0, var3);
                } else {
                  if (this.field_d != 3 &&
                    this.field_d != 12) {
                    if (this.field_d != 4 &&
                      this.field_d != 13) {
                      if (this.field_d == 8) {
                        var2_intLifetime1 = pa.field_d + (pa.field_d >> 1);
                        var3 = 40;
                        jh.field_d.a(kk.field_n, 40, -jh.field_d.field_E + var3, 254, 1000, 0, -1, 0, 0, var2_intLifetime1);
                        mk.field_h.c(cb.field_D, 294, lf.field_a - 10, 0, -1);
                      } else {
                        if (this.field_d == 9) {
                          var2_intLifetime1 = (pa.field_d >> 1) + pa.field_d;
                          var3 = 40;
                          jh.field_d.a(pk.field_D, 40, -jh.field_d.field_E + var3, 254, 1000, 0, -1, 0, 0, var2_intLifetime1);
                          mk.field_h.c(rk.field_k, 294, -10 + lf.field_a, 0, -1);
                        } else {
                          if (this.field_d == 10) {
                            var2_intLifetime1 = pa.field_d + (pa.field_d >> 1);
                            var3 = 40;
                            jh.field_d.a(tf.field_b, 40, var3 - jh.field_d.field_E, 254, 1000, 0, -1, 0, 0, var2_intLifetime1);
                            mk.field_h.c(bl.field_a, 294, lf.field_a - 10, 0, -1);
                          } else {
                            if ((this.field_d == 11)) {
                              var2_intLifetime1 = (pa.field_d >> 1) + pa.field_d;
                              var3 = 40;
                              jh.field_d.a(kk.field_q, 40, -jh.field_d.field_E + var3, 254, 1000, 0, -1, 0, 0, var2_intLifetime1);
                              mk.field_h.c(eg.field_E, 294, -10 + lf.field_a, 0, -1);
                            }
                          }
                        }
                      }
                    } else {
                      var2_intLifetime1 = 18;
                      var3 = 40;
                      var13 = ve.field_b;
                      for (var5 = 0; var5 < var13.length; var5++) {
                        var6_ref_String = var13[var5];
                        var3 = var3 + var2_intLifetime1 * jh.field_d.a(var6_ref_String, 40, var3 - jh.field_d.field_E, 254, 1000, 0, -1, 0, 0, var2_intLifetime1);
                        var3 = var3 + var2_intLifetime1;
                      }
                      mk.field_h.c(eg.field_E, 294, lf.field_a - 10, 0, -1);
                    }
                    decompiledFrameRemainder1 = false;
                  }
                  else {
                    mk.field_h.c(rk.field_k, 294, -10 + lf.field_a, 0, -1);
                  }
                }
              } else {
                this.a(true, param0 + 73);
              }
            } else {
              this.a(false, param0 + 35);
            }
          }
          if (null != this.field_m) {
            if (this.field_d == 8) {
              if (this.field_m.field_J != 0) {
                if (this.field_m.field_J > this.field_m.field_r) {
                  var2_intLifetime2 = 256 * this.field_m.field_r / this.field_m.field_J;
                  ia.field_G.b(50, 213, -var2_intLifetime2 + 256);
                  kf.field_A[1].b(0, this.field_m.field_M, var2_intLifetime2);
                } else {
                  kf.field_A[1].d(0, this.field_m.field_M);
                }
              } else {
                ia.field_G.d(50, 213);
                if (this.field_m.field_A) {
                  this.a((byte) 66, 215, 53);
                }
                if (this.field_m.field_v) {
                  this.a((byte) 46, 215, 151);
                }
                if (this.field_m.field_E) {
                  this.a((byte) -51, 215, 190);
                }
                if (this.field_m.field_O) {
                  this.a((byte) 90, 215, 229);
                }
              }
            } else {
              if (11 != this.field_d) {
                kf.field_A[1].d(0, this.field_m.field_M);
              }
            }
            this.field_m.c((byte) -109);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var2_ref), "sg.C(" + param0 + ')');
        }
    }

    final void d(int param0) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        String[] var8 = null;
        String[] var9 = null;
        int var10 = 0;
        gd var11 = null;
        String var12 = null;
        int var2_intLifetime1;
        int var3Lifetime1;
        int var5Lifetime1;
        int var2_intLifetime2;
        var7 = Lexicominos.field_L ? 1 : 0;
        try {
          if (ij.field_n[this.field_d] != null) {
            ij.field_n[this.field_d].d(0, 0);
          }
          if (param0 != 48) {
            field_l = (dg) null;
          }
          boolean decompiledFrameRemainder0 = true;
          if (5 == this.field_d) {
            this.b(false, 640);
          } else {
            if (this.field_d != 7) {
              if (this.field_d != 3 &&
                this.field_d != 12) {
                if (this.field_d != 4 &&
                  this.field_d != 13) {
                  if (((this.field_d == 1)) &&
                    (!(ki.a((byte) -114)))) {
                    var2_int = (pa.field_d >> 1) + pa.field_d;
                    jh.field_d.a(fl.field_b, 12, -jh.field_d.field_E + 370, 278, 1000, 0, -1, 0, 0, var2_int);
                  }
                } else {
                  var2_int = 18;
                  var3 = 40;
                  var8 = oj.field_c;
                  for (var5 = 0; var5 < var8.length; var5++) {
                    var12 = var8[var5];
                    var3 = var3 + var2_int * jh.field_d.a(var12, 12, var3 - jh.field_d.field_E, 278, 1000, 0, -1, 0, 0, var2_int);
                    var3 = var3 + var2_int;
                  }
                  mk.field_h.b(bl.field_a, 12, -10 + lf.field_a, 0, -1);
                }
              } else {
                var2_intLifetime2 = 18;
                var3Lifetime1 = 240;
                var9 = tj.field_j;
                var10 = 0;
                var5Lifetime1 = var10;
                while (var9.length > var10) {
                  var6 = var9[var10];
                  var3Lifetime1 = var3Lifetime1 + var2_intLifetime2 * jh.field_d.a(var6, 12, -jh.field_d.field_E + var3Lifetime1, 278, 1000, 0, -1, 0, 0, var2_intLifetime2);
                  var3Lifetime1 = var3Lifetime1 + var2_intLifetime2;
                  var10++;
                }
                mk.field_h.b(cb.field_D, 12, lf.field_a - 10, 0, -1);
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              this.b(true, 640);
            }
          }
          if (null != this.field_m) {
            this.field_m.d(50);
            if (this.field_d == 11) {
              lf.g(0, 8, 311, 450);
              var2_intLifetime1 = -300 + (-88 + this.field_m.field_r);
              if (200 < var2_intLifetime1) {
                var2_intLifetime1 = 200;
              }
              eh.a(0, lg.field_c, 10 + 24 * ((12 - sj.field_l.length()) / 2), 0, sj.field_l, var2_intLifetime1);
              eh.a(0, lg.field_c, 10 + (-eb.field_a.length() + 12) / 2 * 24, 0, eb.field_a, 24 + var2_intLifetime1);
              eh.a(0, lg.field_c, 10 + 24 * ((-td.field_g.length() + 12) / 2), param0 - 48, td.field_g, 48 + var2_intLifetime1);
              var11 = (gd) (this.field_m.field_j.a(true));
              while (var11 != null) {
                var11.a((byte) -34);
                var11 = (gd) (this.field_m.field_j.f(2));
              }
              lf.b();
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var2), "sg.N(" + param0 + ')');
        }
    }

    private final void a(boolean param0, int param1, int param2) {
        int stackIn_10_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6_int = 0;
        db var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var7Lifetime1;
        var10 = Lexicominos.field_L ? 1 : 0;
        try {
          if (param2 != 1956587489) {
            this.field_b = 65;
          }
          var4_int = this.b((byte) -19, param1);
          var5 = qc.field_a[this.field_d][param1];
          if (var5 == 21) {
            var6_int = this.a(true, sh.field_e, bk.field_b, -107);
            for (var7 = 0; 4 > var7; var7++) {
              hi.field_b[var7].d(95 * var7, var4_int);
              stackIn_10_0 = (var7 == 3) ? 2 : var7;
              var8 = stackIn_10_0;
              var9 = 0;
              if (var8 == jf.field_I) {
                if (!this.field_c.field_i &&
                  param0) {
                  stackIn_17_0 = 16777215;
                } else {
                  stackIn_17_0 = 16755370;
                }
                var9 = stackIn_17_0;
              }
              if (this.field_c.field_i &&
                param0 &&
                var6_int == var8) {
                var9 = 16777215;
              }
              if (16777215 == var9) {
                dc.field_z[var7].d(95 * var7, var4_int);
              } else {
                if (var9 != 0) {
                  dc.field_z[var7].b(95 * var7, var4_int, 128);
                }
              }
            }
          } else {
            var6_int = this.a((byte) 46, param1);
            if (param0) {
              ej.field_b[-1 + var5].d(var6_int, var4_int);
            }
            gg.field_a[var5 - 1].d(var6_int, var4_int);
          }
          var7Lifetime1 = var5;
          if (var7Lifetime1 != 4) {
            if (var7Lifetime1 != 7) {
              if (var7Lifetime1 != 3) {
                if (var7Lifetime1 == 9) {
                  wc.field_c[-1 + tg.field_j / 4].d(163, var4_int);
                }
              } else {
                var6 = id.field_w[rg.field_b].field_h;
                var6.d(199 + (-var6.field_p + 36 >> 1), (24 - var6.field_u >> 1) + 9 + var4_int);
              }
            } else {
              var7Lifetime1 = uh.field_n.field_u;
              if (var7Lifetime1 < 0) {
                var7Lifetime1 = 0;
              }
              jf.field_N.d(var7Lifetime1 / 2 + 118, 11 + var4_int);
            }
          } else {
            var7Lifetime1 = oc.field_e;
            if (0 > var7Lifetime1) {
              var7Lifetime1 = 0;
            }
            jf.field_N.d(118 + var7Lifetime1 / 2, var4_int + 11);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var4), "sg.U(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static boolean a(boolean param0) {
        RuntimeException var1 = null;
        boolean stackIn_3_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            sg.b(78);
          }
          stackIn_3_0 = ca.field_k;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var1), "sg.T(" + param0 + ')');
        }
    }

    private final int a(boolean param0, int param1, int param2, int param3) {
        int var6 = 0;
        int stackIn_12_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_37_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var7 = 0;
        int var5_intLifetime1;
        var7 = Lexicominos.field_L ? 1 : 0;
        try {
          if (this.field_d != 1) {
            throw new RuntimeException();
          }
          if (0 <= param2 &&
            param1 >= 0 &&
            param2 < 640 &&
            480 > param1) {
            if (param0) {
              var5_int = this.a(param2, param1, 640);
              if (var5_int == -1 ||
                21 != qc.field_a[this.field_d][var5_int]) {
                stackIn_19_0 = -1;
                return stackIn_19_0;
              }
            }
            var5_intLifetime1 = qb.field_b[bk.field_b + sh.field_e * 640];
            if (var5_intLifetime1 >= -1) {
              stackIn_23_0 = -1;
              return stackIn_23_0;
            }
            param2 = (2047 & var5_intLifetime1 >> 11) + 2 >> 2;
            param1 = 2 + (var5_intLifetime1 & 2047) >> 2;
            if (param3 > -26) {
              field_l = (dg) null;
            }
            for (var6 = 0; dc.field_z.length > var6; var6++) {
              if (dc.field_z[var6].field_s + var6 * 95 <= param2 &&
                param2 < dc.field_z[var6].field_p + dc.field_z[var6].field_s + 95 * var6) {
                if (var6 != 3) {
                  stackIn_34_0 = var6;
                  return stackIn_34_0;
                }
                stackIn_32_0 = 2;
                return stackIn_32_0;
              }
            }
            stackIn_37_0 = -1;
            return stackIn_37_0;
          }
          stackIn_12_0 = -1;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var5), "sg.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final int a(byte param0, int param1) {
        int stackIn_2_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_40_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0 != 46) {
            stackIn_2_0 = 101;
            return stackIn_2_0;
          }
          if (this.field_d != 3 &&
            this.field_d != 12) {
            if (this.field_d != 4 &&
              this.field_d != 13) {
              if (this.field_d == 8) {
                if (param1 < 2) {
                  stackIn_36_0 = 100 * param1;
                  return stackIn_36_0;
                }
                stackIn_38_0 = 0;
                return stackIn_38_0;
              }
              if (this.field_d > 8 &&
                11 > this.field_d) {
                if (param1 >= 3) {
                  stackIn_31_0 = 0;
                  return stackIn_31_0;
                }
                stackIn_29_0 = param1 * 100 - 100;
                return stackIn_29_0;
              }
              if (this.field_d != 11) {
                stackIn_26_0 = 0;
                return stackIn_26_0;
              }
              if (2 <= param1) {
                return 0;
              }
              stackIn_23_0 = 100 * (param1 - 1);
              return stackIn_23_0;
            }
            if (0 != param1) {
              stackIn_12_0 = 0;
              return stackIn_12_0;
            }
            stackIn_10_0 = -100;
            return stackIn_10_0;
          }
          stackIn_40_0 = 100 * param1;
          return stackIn_40_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var3), "sg.V(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        java.awt.Component var4 = null;
        var3 = Lexicominos.field_L ? 1 : 0;
        try {
          while (ji.a((byte) -72)) {
            if (da.field_b != 13) {
              this.a(-17253);
              if (this.field_c.field_d == -1) {
                continue;
              }
              this.a(param0 ^ -34, false, this.field_c.field_d);
              continue;
            }
            if (2 == this.field_d) {
              this.field_k.a((byte) 117, false, -1, 2);
              continue;
            }
            this.field_k.a((byte) 114, false, this.field_g, vg.field_d[this.field_g].field_g);
            if (8 > this.field_d) {
              continue;
            }
            if (11 < this.field_d) {
              continue;
            }
            vg.field_d[14].field_g = this.field_d;
          }
          this.field_c.a(this.a(ef.field_a, ck.field_a, 640), this.a(bk.field_b, sh.field_e, 640), param0 ^ 49);
          if (param0 != -88) {
            var4 = (java.awt.Component) null;
            sg.a((java.awt.Component) null, -97);
          }
          if (this.field_c.field_d != -1) {
            this.a(95, true, this.field_c.field_d);
          }
          if (nk.field_z != 0) {
            this.field_j = ck.field_a;
            this.field_o = ef.field_a;
          }
          if (null != this.field_m) {
            ve.field_a = false;
            this.field_m.e(1);
            if (this.field_m.a((byte) 94)) {
              this.field_b = this.field_b + 1;
            }
            if (this.field_b >= 250 &&
              this.field_d < 11) {
              this.field_k.a((byte) 104, false, 1 + this.field_d, 14);
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var2), "sg.S(" + param0 + ')');
        }
    }

    sg(Lexicominos param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_j = -1;
        this.field_h = -1;
        this.field_o = -1;
        this.field_e = -1;
        this.field_g = 0;
        this.field_n = 0;
        try {
          this.field_k = param0;
          this.field_d = param1;
          uk.field_U[param1] = gg.field_a[0].field_x;
          this.field_c = new fi(qc.field_a[param1].length);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("sg.<init>(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_l = new dg();
        field_f = "Waiting for languages";
        field_i = new oc();
    }
}
