/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class qg extends ke {
    private int field_o;
    static jp[][] field_r;
    String field_x;
    static jp[] field_D;
    private int field_u;
    private int field_C;
    static int field_A;
    private long field_w;
    static String field_z;
    private boolean field_y;
    private boolean field_s;
    private boolean field_q;
    private int field_v;
    static boolean field_t;
    private int field_B;
    private int field_p;

    private final void f(boolean param0) {
        int discarded$0 = 120;
        String var2 = go.a();
        da.a(var2, 70, uc.e((byte) -116));
        if (!param0) {
            ((qg) this).g(false);
        }
    }

    private final void m(int param0) {
        ch.field_g[6] = -2;
        if (param0 <= 116) {
            return;
        }
        ch.field_g[1] = 16;
        ch.field_g[18] = 1;
        ch.field_g[11] = -1;
        ch.field_g[9] = -1;
        ch.field_g[2] = -2;
        ch.field_g[5] = -1;
        ch.field_g[10] = -1;
        ch.field_g[7] = -1;
        ch.field_g[12] = -1;
        ch.field_g[13] = -1;
        ch.field_g[17] = -1;
        ch.field_g[8] = -2;
        ch.field_g[4] = -1;
        ch.field_g[3] = -1;
        ch.field_g[16] = -1;
    }

    final void a(String param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              int discarded$4 = 480;
              int discarded$5 = 640;
              this.a(103, param0, param1);
              if (param2 == 1686) {
                break L1;
              } else {
                field_D = null;
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
            stackOut_3_1 = new StringBuilder().append("qg.EA(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(byte param0, int param1, int param2, boolean param3, int param4, int param5, int param6, int param7) {
        java.awt.Frame var10 = new java.awt.Frame("Jagex");
        var10.pack();
        var10.dispose();
        ((qg) this).setBackground(java.awt.Color.black);
        cd.field_e = ((qg) this).field_u;
        hk.a(cd.field_e, (byte) 125);
        im.a(param7, ((qg) this).field_x, ((qg) this).field_q, ((qg) this).field_B, 5000, 5000, cd.field_e, ((qg) this).field_o, lp.field_ub, (byte) 123, param3, ((qg) this).field_w, ((qg) this).field_p, ((qg) this).field_v);
        cr.a(param7, cd.field_e, param0 + 3, ((qg) this).field_v, lp.field_ub, ((qg) this).field_x, ((qg) this).field_p, ((qg) this).field_o, ((qg) this).field_B);
        int discarded$0 = 59;
        rn.a();
        qa.field_x = ea.a(60);
        ap.a((byte) 117, kj.field_D);
        nd.field_c = param4;
        lc.field_i = param5;
        wq.field_j = param1;
        o.field_f = param6;
        ea.field_c = param2;
        if (param0 != 39) {
            ((qg) this).g(false);
        }
        this.m(123);
        oc.c((byte) -35);
    }

    final static jp a(jp param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int[] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        jp stackIn_39_0 = null;
        jp stackIn_47_0 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_51_2 = null;
        RuntimeException decompiledCaughtException = null;
        jp stackOut_38_0 = null;
        jp stackOut_46_0 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        var14 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            var2_int = param0.field_C;
            var3 = param0.field_D;
            var4 = param0.field_G;
            var5 = var2_int - 1;
            L1: while (true) {
              L2: {
                if (var5 < 0) {
                  break L2;
                } else {
                  var6 = var5 * var3;
                  var7 = 0;
                  L3: while (true) {
                    if (var7 >= var3) {
                      var5--;
                      continue L1;
                    } else {
                      if (var4[var7 + var6] == 16777215) {
                        var7++;
                        continue L3;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
              }
              var6 = 0;
              L4: while (true) {
                L5: {
                  if (var6 >= var5) {
                    break L5;
                  } else {
                    var7 = var3 * var6;
                    var8 = 0;
                    L6: while (true) {
                      if (var8 >= var3) {
                        var6++;
                        continue L4;
                      } else {
                        if (var4[var8 + var7] == 16777215) {
                          var8++;
                          continue L6;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                }
                var7 = -1 + var3;
                L7: while (true) {
                  L8: {
                    if (var7 < 0) {
                      break L8;
                    } else {
                      var8 = var6;
                      L9: while (true) {
                        if (var5 < var8) {
                          var7--;
                          continue L7;
                        } else {
                          if (16711422 == var4[var7 + var8 * var3]) {
                            var8++;
                            continue L9;
                          } else {
                            break L8;
                          }
                        }
                      }
                    }
                  }
                  var8 = 0;
                  L10: while (true) {
                    L11: {
                      if (var7 <= var8) {
                        break L11;
                      } else {
                        var9 = var6;
                        L12: while (true) {
                          if (var5 < var9) {
                            var8++;
                            continue L10;
                          } else {
                            if (var4[var9 * var3 - -var8] == 16711422) {
                              var9++;
                              continue L12;
                            } else {
                              break L11;
                            }
                          }
                        }
                      }
                    }
                    L13: {
                      if (var8 != 0) {
                        break L13;
                      } else {
                        if (var7 != var3 - 1) {
                          break L13;
                        } else {
                          if (var6 != 0) {
                            break L13;
                          } else {
                            if (var2_int + -1 != var5) {
                              break L13;
                            } else {
                              stackOut_38_0 = (jp) param0;
                              stackIn_39_0 = stackOut_38_0;
                              return stackIn_39_0;
                            }
                          }
                        }
                      }
                    }
                    var9 = -var8 + (1 + var7);
                    var10 = -var6 + 1 + var5;
                    var11 = new int[var10 * var9];
                    var12 = 0;
                    L14: while (true) {
                      if (var12 >= var10) {
                        param0.field_D = var9;
                        param0.field_E = param0.field_E + var8;
                        param0.field_C = var10;
                        param0.field_G = var11;
                        param0.field_F = param0.field_F + var6;
                        stackOut_46_0 = (jp) param0;
                        stackIn_47_0 = stackOut_46_0;
                        break L0;
                      } else {
                        var13 = 0;
                        L15: while (true) {
                          if (var13 >= var9) {
                            var12++;
                            continue L14;
                          } else {
                            var11[var9 * var12 + var13] = var4[var3 * (var12 - -var6) + var8 + var13];
                            var13++;
                            continue L15;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var2 = decompiledCaughtException;
            stackOut_48_0 = (RuntimeException) var2;
            stackOut_48_1 = new StringBuilder().append("qg.KA(");
            stackIn_50_0 = stackOut_48_0;
            stackIn_50_1 = stackOut_48_1;
            stackIn_49_0 = stackOut_48_0;
            stackIn_49_1 = stackOut_48_1;
            if (param0 == null) {
              stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
              stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
              stackOut_50_2 = "null";
              stackIn_51_0 = stackOut_50_0;
              stackIn_51_1 = stackOut_50_1;
              stackIn_51_2 = stackOut_50_2;
              break L16;
            } else {
              stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
              stackOut_49_1 = (StringBuilder) (Object) stackIn_49_1;
              stackOut_49_2 = "{...}";
              stackIn_51_0 = stackOut_49_0;
              stackIn_51_1 = stackOut_49_1;
              stackIn_51_2 = stackOut_49_2;
              break L16;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_51_0, stackIn_51_2 + ',' + 1 + ')');
        }
        return stackIn_47_0;
    }

    private final int n() {
        int var2 = 0;
        if (((qg) this).field_d) {
          return -1;
        } else {
          if (ui.a(false)) {
            if (n.field_e) {
              return -1;
            } else {
              int discarded$6 = 1;
              int discarded$7 = 0;
              var2 = wp.a(ud.d(), true, true, ((qg) this).field_s, ((qg) this).field_C, ee.b());
              if (var2 == -1) {
                return -1;
              } else {
                L0: {
                  if (var2 == 0) {
                    break L0;
                  } else {
                    if (var2 != 1) {
                      L1: {
                        if (!hk.field_R) {
                          ((qg) this).a("reconnect", 4000);
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                      qb.g(108);
                      tf.a(eo.field_e, (byte) -61, var2);
                      n.field_e = true;
                      cg.field_i = ue.a(false) + 15000L;
                      return var2;
                    } else {
                      break L0;
                    }
                  }
                }
                L2: {
                  if (i.field_j != 11) {
                    break L2;
                  } else {
                    if (tm.field_a == 0) {
                      int discarded$8 = 0;
                      ei.b();
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                return var2;
              }
            }
          } else {
            return -1;
          }
        }
    }

    final void l(int param0) {
        uf.field_d[1] = true;
        if (param0 != 12) {
            ((qg) this).field_C = 30;
        }
    }

    final int o(int param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          L1: {
            int discarded$10 = -1;
            var2 = this.n();
            if (var2 == 0) {
              break L1;
            } else {
              if (var2 != 1) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          L2: {
            if (!uf.field_d[1]) {
              break L2;
            } else {
              ie.a(2, (byte) -46);
              break L2;
            }
          }
          L3: {
            if (!uf.field_d[2]) {
              break L3;
            } else {
              ff.a((byte) -61, 3);
              break L3;
            }
          }
          L4: {
            if (!uf.field_d[3]) {
              break L4;
            } else {
              nq.a(4, 13330);
              break L4;
            }
          }
          L5: {
            if (!uf.field_d[4]) {
              break L5;
            } else {
              ui.a(5, (byte) 115);
              break L5;
            }
          }
          L6: {
            if (!uf.field_d[5]) {
              break L6;
            } else {
              int discarded$11 = 0;
              int discarded$12 = 6;
              hj.b();
              break L6;
            }
          }
          L7: {
            if (uf.field_d[6]) {
              int discarded$13 = 7;
              int discarded$14 = 119;
              qn.a();
              break L7;
            } else {
              break L7;
            }
          }
          if (!uf.field_d[8]) {
            break L0;
          } else {
            we.a((byte) -46);
            break L0;
          }
        }
        var3 = -122 % ((-43 - param0) / 60);
        return var2;
    }

    final int b(boolean param0, byte param1) {
        if (param1 != -118) {
            int discarded$0 = ((qg) this).o(30);
        }
        return this.a(param0, (byte) 46, true);
    }

    final void j(int param0) {
        if (param0 <= 28) {
            this.m(-5);
        }
        uf.field_d[6] = true;
    }

    final void c(byte param0) {
        uf.field_d[12] = true;
        uf.field_d[11] = true;
        if (param0 != -19) {
            return;
        }
        uf.field_d[13] = true;
    }

    final static void a(int param0, int param1, byte param2) {
        cc.field_J = param0;
        ea.field_e = param1;
    }

    final void e(boolean param0) {
        uf.field_d[5] = param0;
    }

    private final int a(boolean param0, byte param1, boolean param2) {
        try {
            int var4 = 0;
            Exception var5 = null;
            int var5_int = 0;
            String var7 = null;
            int var8 = 0;
            Object var9 = null;
            Object var10 = null;
            Boolean var11 = null;
            wq var12 = null;
            Throwable decompiledCaughtException = null;
            var8 = BrickABrac.field_J ? 1 : 0;
            var4 = df.a(-27790, qc.field_o, cd.field_e, param0);
            if (var4 == 0) {
              throw new IllegalStateException();
            } else {
              L0: {
                if (var4 != 1) {
                  break L0;
                } else {
                  L1: {
                    int discarded$13 = 109;
                    var5_int = ek.a(oo.f(), sq.a(64), (byte) -16);
                    if (var5_int == -1) {
                      break L1;
                    } else {
                      ef.a(eo.field_e, -106, var5_int, co.field_f);
                      eo.field_e = null;
                      co.field_f = null;
                      break L1;
                    }
                  }
                  var11 = df.a(0);
                  if (var11 != null) {
                    int discarded$14 = -128;
                    to.a(var11.booleanValue());
                    break L0;
                  } else {
                    break L0;
                  }
                }
              }
              L2: {
                if (var4 != 2) {
                  break L2;
                } else {
                  int discarded$15 = 0;
                  int discarded$16 = -44;
                  int discarded$17 = 1;
                  var5_int = wg.a(ee.b(), (byte) -74, be.a(), fc.a(93), aa.a(480), ud.d(), ((qg) this).field_C);
                  if (-1 != var5_int) {
                    vh.a(var5_int, (byte) -123, eo.field_e, co.field_f);
                    eo.field_e = null;
                    co.field_f = null;
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (var4 == 3) {
                  L4: {
                    if (tm.field_a == -1) {
                      break L4;
                    } else {
                      if (0 != tm.field_a) {
                        tm.field_a = -1;
                        pp.a((byte) 79);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (!param2) {
                    int discarded$18 = 1;
                    int discarded$19 = 0;
                    var5_int = wp.a(ud.d(), false, true, ((qg) this).field_s, ((qg) this).field_C, ee.b());
                    if (var5_int == -1) {
                      break L3;
                    } else {
                      if (var5_int != 0) {
                        tf.a(eo.field_e, (byte) -77, var5_int);
                        eo.field_e = null;
                        break L3;
                      } else {
                        sb.field_e = sl.field_v;
                        int discarded$20 = 0;
                        ei.b();
                        i.field_j = 10;
                        ol.field_s = false;
                        break L3;
                      }
                    }
                  } else {
                    n.field_e = false;
                    break L3;
                  }
                } else {
                  break L3;
                }
              }
              L5: {
                if (4 != var4) {
                  break L5;
                } else {
                  if (!qb.field_u) {
                    i.field_j = 10;
                    ol.field_s = true;
                    break L5;
                  } else {
                    int discarded$21 = 97;
                    jc.a(uc.e((byte) -97));
                    break L5;
                  }
                }
              }
              L6: {
                if (var4 == 5) {
                  nk.a(2048, uc.e((byte) -110));
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                if (var4 == 6) {
                  if (ci.field_t) {
                    i.field_j = 10;
                    break L7;
                  } else {
                    break L7;
                  }
                } else {
                  break L7;
                }
              }
              L8: {
                if (7 == var4) {
                  int discarded$22 = 0;
                  pf.a(uc.e((byte) -76));
                  break L8;
                } else {
                  break L8;
                }
              }
              L9: {
                if (var4 != 8) {
                  break L9;
                } else {
                  int discarded$23 = 97;
                  jc.a(uc.e((byte) -70));
                  break L9;
                }
              }
              L10: {
                if (var4 != 9) {
                  break L10;
                } else {
                  int discarded$24 = -106;
                  vl.a(uc.e((byte) -108));
                  break L10;
                }
              }
              L11: {
                if (var4 != 10) {
                  break L11;
                } else {
                  k.field_h.e(-13413, 17);
                  break L11;
                }
              }
              L12: {
                if (var4 != 11) {
                  break L12;
                } else {
                  mi.a((byte) -123, uc.e((byte) -93));
                  break L12;
                }
              }
              L13: {
                if (12 != var4) {
                  break L13;
                } else {
                  int discarded$25 = -49;
                  kf.a(oh.b(), (byte) -125, uc.e((byte) -97));
                  break L13;
                }
              }
              L14: {
                if (var4 == 13) {
                  try {
                    L15: {
                      L16: {
                        if (null == po.field_e) {
                          po.field_e = new ad(lp.field_ub, new java.net.URL(((qg) this).getCodeBase(), "countrylist.ws"), 5000);
                          break L16;
                        } else {
                          break L16;
                        }
                      }
                      L17: {
                        if (po.field_e.a(1)) {
                          L18: {
                            var12 = po.field_e.a((byte) 100);
                            if (var12 != null) {
                              var7 = df.a(var12.field_l, 97, var12.field_k, 0);
                              hi.a(85, var7);
                              break L18;
                            } else {
                              var9 = null;
                              hi.a(85, (String) null);
                              break L18;
                            }
                          }
                          po.field_e = null;
                          break L17;
                        } else {
                          break L17;
                        }
                      }
                      break L15;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L19: {
                      var5 = (Exception) (Object) decompiledCaughtException;
                      rk.a("S1", (Throwable) (Object) var5, 28);
                      var10 = null;
                      hi.a(85, (String) null);
                      po.field_e = null;
                      break L19;
                    }
                  }
                  break L14;
                } else {
                  break L14;
                }
              }
              L20: {
                if (var4 == 15) {
                  i.field_j = 10;
                  break L20;
                } else {
                  break L20;
                }
              }
              if (var4 == 16) {
                return 1;
              } else {
                if (17 != var4) {
                  return 0;
                } else {
                  return 2;
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void g(boolean param0) {
        int var3 = 0;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        Object stackOut_10_0 = null;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        L0: {
          var3 = BrickABrac.field_J ? 1 : 0;
          if (!param0) {
            break L0;
          } else {
            ((qg) this).field_B = -15;
            break L0;
          }
        }
        L1: {
          int discarded$74 = 7457;
          if (kb.i()) {
            L2: {
              stackOut_10_0 = this;
              stackIn_12_0 = stackOut_10_0;
              stackIn_11_0 = stackOut_10_0;
              if (ua.field_d == null) {
                stackOut_12_0 = this;
                stackOut_12_1 = 0;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                break L2;
              } else {
                stackOut_11_0 = this;
                stackOut_11_1 = 1;
                stackIn_13_0 = stackOut_11_0;
                stackIn_13_1 = stackOut_11_1;
                break L2;
              }
            }
            int discarded$75 = this.a(stackIn_13_1 != 0, (byte) 46, false);
            break L1;
          } else {
            if (field_A >= 10) {
              if (il.e((byte) -126)) {
                if (i.field_j == 0) {
                  int discarded$76 = this.a(false, (byte) 46, false);
                  break L1;
                } else {
                  gk.a(qc.field_o, (byte) 124);
                  break L1;
                }
              } else {
                int discarded$77 = -122;
                hk.a();
                break L1;
              }
            } else {
              break L1;
            }
          }
        }
    }

    public static void k() {
        field_r = null;
        field_D = null;
        field_z = null;
    }

    final void h(boolean param0) {
        int var2 = 0;
        gb var3 = null;
        int var4 = 0;
        Object stackIn_20_0 = null;
        Object stackIn_21_0 = null;
        Object stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        int stackIn_30_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        int stackOut_29_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_31_1 = 0;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        Object stackOut_19_0 = null;
        Object stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        Object stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        L0: {
          var4 = BrickABrac.field_J ? 1 : 0;
          var2 = si.field_a;
          if (var2 >= 64) {
            break L0;
          } else {
            if (uf.field_d[var2]) {
              if (!param0) {
                if (0 != var2) {
                  L1: {
                    if (var2 == 1) {
                      ba.f(-1);
                      break L1;
                    } else {
                      if (var2 != 2) {
                        if (var2 != 3) {
                          if (var2 == 4) {
                            int discarded$6 = 22;
                            jm.a();
                            break L1;
                          } else {
                            if (var2 != 5) {
                              if (var2 != 6) {
                                if (var2 != 7) {
                                  if (var2 != 8) {
                                    if (var2 == 16) {
                                      bc.a(27423);
                                      break L1;
                                    } else {
                                      L2: {
                                        if (var2 == 11) {
                                          break L2;
                                        } else {
                                          if (var2 != 12) {
                                            if (var2 != 13) {
                                              if (var2 != 17) {
                                                if (var2 != 18) {
                                                  rk.a("MGS1: " + eq.c((byte) -71), (Throwable) null, 119);
                                                  hn.a((byte) 101);
                                                  break L1;
                                                } else {
                                                  int discarded$7 = -114;
                                                  g.e();
                                                  break L1;
                                                }
                                              } else {
                                                int discarded$8 = 120;
                                                this.a();
                                                break L1;
                                              }
                                            } else {
                                              ch.a((byte) 63);
                                              break L1;
                                            }
                                          } else {
                                            break L2;
                                          }
                                        }
                                      }
                                      L3: {
                                        stackOut_29_0 = 67;
                                        stackIn_31_0 = stackOut_29_0;
                                        stackIn_30_0 = stackOut_29_0;
                                        if (var2 != 12) {
                                          stackOut_31_0 = stackIn_31_0;
                                          stackOut_31_1 = 0;
                                          stackIn_32_0 = stackOut_31_0;
                                          stackIn_32_1 = stackOut_31_1;
                                          break L3;
                                        } else {
                                          stackOut_30_0 = stackIn_30_0;
                                          stackOut_30_1 = 1;
                                          stackIn_32_0 = stackOut_30_0;
                                          stackIn_32_1 = stackOut_30_1;
                                          break L3;
                                        }
                                      }
                                      var3 = kc.a((byte) stackIn_32_0, stackIn_32_1 != 0);
                                      int discarded$9 = 79;
                                      lj.a(var3);
                                      break L1;
                                    }
                                  } else {
                                    um.a(ga.field_j, (wq) (Object) jl.field_e, (byte) 107, lp.field_ub);
                                    break L1;
                                  }
                                } else {
                                  L4: {
                                    stackOut_19_0 = this;
                                    stackIn_21_0 = stackOut_19_0;
                                    stackIn_20_0 = stackOut_19_0;
                                    if (param0) {
                                      stackOut_21_0 = this;
                                      stackOut_21_1 = 0;
                                      stackIn_22_0 = stackOut_21_0;
                                      stackIn_22_1 = stackOut_21_1;
                                      break L4;
                                    } else {
                                      stackOut_20_0 = this;
                                      stackOut_20_1 = 1;
                                      stackIn_22_0 = stackOut_20_0;
                                      stackIn_22_1 = stackOut_20_1;
                                      break L4;
                                    }
                                  }
                                  this.f(stackIn_22_1 != 0);
                                  break L1;
                                }
                              } else {
                                int discarded$10 = 0;
                                wl.c();
                                break L1;
                              }
                            } else {
                              int discarded$11 = -71;
                              re.f();
                              break L1;
                            }
                          }
                        } else {
                          qi.a(-1);
                          break L1;
                        }
                      } else {
                        f.a((byte) 7);
                        break L1;
                      }
                    }
                  }
                  return;
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              break L0;
            }
          }
        }
        rk.a("MGS2: " + eq.c((byte) -66), (Throwable) null, 89);
        hn.a((byte) 71);
    }

    private final void a(int param0, String param1, int param2) {
        Exception var6 = null;
        RuntimeException var6_ref = null;
        String var6_ref2 = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        Object var10 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        Throwable decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        Object stackOut_3_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        try {
          try {
            L0: {
              if (((qg) this).e(-128)) {
                L1: {
                  L2: {
                    ((qg) this).field_x = ((qg) this).getCodeBase().getHost();
                    var6_ref2 = ((qg) this).field_x.toLowerCase();
                    stackOut_2_0 = this;
                    stackIn_5_0 = stackOut_2_0;
                    stackIn_3_0 = stackOut_2_0;
                    if (var6_ref2.equals((Object) (Object) "jagex.com")) {
                      break L2;
                    } else {
                      stackOut_3_0 = this;
                      stackIn_6_0 = stackOut_3_0;
                      stackIn_4_0 = stackOut_3_0;
                      if (!var6_ref2.endsWith(".jagex.com")) {
                        stackOut_6_0 = this;
                        stackOut_6_1 = 0;
                        stackIn_7_0 = stackOut_6_0;
                        stackIn_7_1 = stackOut_6_1;
                        break L1;
                      } else {
                        stackOut_4_0 = this;
                        stackIn_5_0 = stackOut_4_0;
                        break L2;
                      }
                    }
                  }
                  stackOut_5_0 = this;
                  stackOut_5_1 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  break L1;
                }
                L3: {
                  ((qg) this).field_s = stackIn_7_1 != 0;
                  ((qg) this).field_v = Integer.parseInt(((qg) this).getParameter("gameport1"));
                  ((qg) this).field_p = Integer.parseInt(((qg) this).getParameter("gameport2"));
                  var7 = ((qg) this).getParameter("servernum");
                  if (var7 != null) {
                    ((qg) this).field_B = Integer.parseInt(var7);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  ((qg) this).field_o = Integer.parseInt(((qg) this).getParameter("gamecrc"));
                  ((qg) this).field_w = Long.parseLong(((qg) this).getParameter("instanceid"));
                  ((qg) this).field_q = ((qg) this).getParameter("member").equals((Object) (Object) "yes");
                  var8 = ((qg) this).getParameter("lang");
                  if (var8 == null) {
                    break L4;
                  } else {
                    ((qg) this).field_u = Integer.parseInt(var8);
                    break L4;
                  }
                }
                L5: {
                  if (((qg) this).field_u < 5) {
                    break L5;
                  } else {
                    ((qg) this).field_u = 0;
                    break L5;
                  }
                }
                L6: {
                  var9 = ((qg) this).getParameter("affid");
                  if (var9 == null) {
                    break L6;
                  } else {
                    ((qg) this).field_C = Integer.parseInt(var9);
                    break L6;
                  }
                }
                ld.field_u = Boolean.valueOf(((qg) this).getParameter("simplemode")).booleanValue();
                ((qg) this).a(32, 123, 480, 640, ((qg) this).field_o, param1, param2);
                break L0;
              } else {
                return;
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            L7: {
              var6 = (Exception) (Object) decompiledCaughtException;
              var10 = null;
              rk.a((String) null, (Throwable) (Object) var6, 58);
              ((qg) this).a("crash", 4000);
              break L7;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L8: {
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var6_ref;
            stackOut_20_1 = new StringBuilder().append("qg.LA(").append(103).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L8;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L8;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ',' + param2 + ',' + 640 + ',' + 480 + ')');
        }
    }

    final void a(int param0, boolean param1) {
        uf.field_d[16] = true;
        uf.field_d[param0] = param1;
        uf.field_d[7] = true;
        uf.field_d[0] = true;
        uf.field_d[3] = true;
        uf.field_d[18] = true;
        uf.field_d[17] = true;
    }

    final static jp[] a(jp[] param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        jp var3 = null;
        int var4 = 0;
        jp[] stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        jp[] stackOut_6_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var4 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 <= -101) {
                break L1;
              } else {
                field_D = null;
                break L1;
              }
            }
            var2_int = 0;
            L2: while (true) {
              if (param0.length <= var2_int) {
                stackOut_6_0 = (jp[]) param0;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                var3 = param0[var2_int];
                param0[var2_int].field_F = 0;
                var3.field_E = 0;
                param0[var2_int].field_x = param0[var2_int].field_D;
                param0[var2_int].field_z = param0[var2_int].field_C;
                var2_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var2;
            stackOut_8_1 = new StringBuilder().append("qg.EB(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    qg() {
    }

    final void b(boolean param0, int param1) {
        int var3 = 0;
        java.awt.Dimension var4 = null;
        int var5 = 0;
        java.awt.Container var6 = null;
        int stackIn_23_0 = 0;
        int stackIn_99_0 = 0;
        int stackIn_100_0 = 0;
        int stackIn_101_0 = 0;
        int stackIn_102_0 = 0;
        int stackIn_102_1 = 0;
        int stackIn_132_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_98_0 = 0;
        int stackOut_97_0 = 0;
        int stackOut_99_0 = 0;
        int stackOut_101_0 = 0;
        int stackOut_101_1 = 0;
        int stackOut_100_0 = 0;
        int stackOut_100_1 = 0;
        int stackOut_131_0 = 0;
        int stackOut_130_0 = 0;
        L0: {
          var5 = BrickABrac.field_J ? 1 : 0;
          if (jj.field_a == null) {
            break L0;
          } else {
            L1: {
              if (null == ua.field_d) {
                int discarded$13 = 0;
                var6 = ea.b();
                var4 = var6.getSize();
                jj.field_a.a(44, var4.width, var4.height);
                break L1;
              } else {
                break L1;
              }
            }
            jj.field_a.c(param1 + 118);
            break L0;
          }
        }
        L2: {
          int discarded$14 = -97;
          wn.b();
          sg.e(70);
          if (r.c((byte) -114)) {
            break L2;
          } else {
            if (i.field_j != 11) {
              int discarded$15 = 27144;
              qc.c();
              break L2;
            } else {
              break L2;
            }
          }
        }
        L3: {
          if (qa.field_x == null) {
            break L3;
          } else {
            qc.field_o = qa.field_x.b(500);
            break L3;
          }
        }
        L4: {
          if (!ik.a(false)) {
            break L4;
          } else {
            L5: {
              int discarded$16 = -98;
              var3 = wn.a() * 1200;
              if (((qg) this).field_y) {
                break L5;
              } else {
                int discarded$17 = 1;
                if (wi.c() <= var3) {
                  break L4;
                } else {
                  if (var3 >= so.a((byte) -35)) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
            }
            ((qg) this).field_y = false;
            hn.a((byte) 91);
            qb.g(120);
            tf.a(qa.field_s, (byte) -113, 2);
            rj.b(param1 ^ -111);
            n.field_e = true;
            cg.field_i = 15000L + ue.a(false);
            break L4;
          }
        }
        L6: {
          L7: {
            if (tm.field_a == -1) {
              break L7;
            } else {
              if (tm.field_a != 0) {
                break L6;
              } else {
                break L7;
              }
            }
          }
          L8: {
            if (tm.field_a != -1) {
              stackOut_22_0 = 0;
              stackIn_23_0 = stackOut_22_0;
              break L8;
            } else {
              stackOut_21_0 = 1;
              stackIn_23_0 = stackOut_21_0;
              break L8;
            }
          }
          L9: {
            var3 = stackIn_23_0;
            tm.field_a = wg.a(false);
            if (var3 == 0) {
              break L9;
            } else {
              if (tm.field_a == 0) {
                if (i.field_j != 11) {
                  break L9;
                } else {
                  if (!ui.a(false)) {
                    int discarded$18 = 0;
                    ei.b();
                    break L9;
                  } else {
                    break L9;
                  }
                }
              } else {
                break L9;
              }
            }
          }
          if (-1 == tm.field_a) {
            break L6;
          } else {
            if (tm.field_a == 0) {
              break L6;
            } else {
              cg.field_i = 15000L + ue.a(false);
              break L6;
            }
          }
        }
        L10: {
          if (tm.field_a == -1) {
            break L10;
          } else {
            if (tm.field_a == 0) {
              break L10;
            } else {
              if (10 <= field_A) {
                if (10 <= i.field_j) {
                  L11: {
                    qb.g(114);
                    if (tm.field_a == 3) {
                      tf.a(nk.field_d, (byte) -49, 256);
                      break L11;
                    } else {
                      if (tm.field_a != 4) {
                        if (tm.field_a != 2) {
                          if (5 == tm.field_a) {
                            tf.a(u.field_b, (byte) -48, 5);
                            break L11;
                          } else {
                            tf.a(np.field_e, (byte) -55, 256);
                            break L11;
                          }
                        } else {
                          tf.a(ke.field_k, (byte) -54, 256);
                          break L11;
                        }
                      } else {
                        tf.a(vh.field_M, (byte) -103, 256);
                        break L11;
                      }
                    }
                  }
                  n.field_e = true;
                  break L10;
                } else {
                  break L10;
                }
              } else {
                if (tm.field_a != 3) {
                  if (4 != tm.field_a) {
                    if (tm.field_a != 2) {
                      if (5 != tm.field_a) {
                        ((qg) this).a("js5connect", 4000);
                        break L10;
                      } else {
                        ((qg) this).a("outofdate", 4000);
                        break L10;
                      }
                    } else {
                      ((qg) this).a("js5connect_full", 4000);
                      break L10;
                    }
                  } else {
                    ((qg) this).a("js5io", 4000);
                    break L10;
                  }
                } else {
                  ((qg) this).a("js5crc", 4000);
                  break L10;
                }
              }
            }
          }
        }
        L12: {
          L13: {
            L14: {
              if (tm.field_a == -1) {
                break L14;
              } else {
                if (0 != tm.field_a) {
                  break L13;
                } else {
                  break L14;
                }
              }
            }
            if (!ui.a(false)) {
              break L12;
            } else {
              break L13;
            }
          }
          if (cg.field_i > ue.a(false)) {
            break L12;
          } else {
            n.field_e = false;
            if (tm.field_a == -1) {
              break L12;
            } else {
              if (0 == tm.field_a) {
                break L12;
              } else {
                tm.field_a = -1;
                pp.a((byte) -101);
                break L12;
              }
            }
          }
        }
        L15: {
          if (tm.field_a != 0) {
            break L15;
          } else {
            if (!ui.a(false)) {
              vq.field_C = false;
              break L15;
            } else {
              break L15;
            }
          }
        }
        L16: {
          if (0 != field_A) {
            break L16;
          } else {
            if (!o.d(param1 ^ -572695520)) {
              break L16;
            } else {
              field_A = 1;
              break L16;
            }
          }
        }
        L17: {
          if (field_A != param1) {
            break L17;
          } else {
            L18: {
              if (cd.field_e == 0) {
                break L18;
              } else {
                wl.field_K = aj.a(wq.field_j, true);
                break L18;
              }
            }
            ma.field_P = bq.a(-6, 1, true, nd.field_c, false);
            vh.field_S = bq.a(-6, 1, true, ea.field_c, false);
            ja.field_c = bq.a(-6, 1, true, o.field_f, false);
            wn.field_c = vh.field_S;
            field_A = 2;
            gq.field_Rb = ma.field_P;
            break L17;
          }
        }
        L19: {
          if (2 == field_A) {
            L20: {
              if (null == wl.field_K) {
                break L20;
              } else {
                if (!wl.field_K.a((byte) -127)) {
                  break L20;
                } else {
                  if (!wl.field_K.a(113, "")) {
                    wl.field_K = null;
                    break L20;
                  } else {
                    if (wl.field_K.a("", -28138)) {
                      nn.a(wl.field_K, 122);
                      wl.field_K = null;
                      hc.b(param1 ^ 3);
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                }
              }
            }
            if (wl.field_K == null) {
              field_A = 3;
              break L19;
            } else {
              break L19;
            }
          } else {
            break L19;
          }
        }
        L21: {
          if (3 != field_A) {
            break L21;
          } else {
            int discarded$19 = -111;
            if (!fk.a(vh.field_S, ma.field_P, ja.field_c)) {
              break L21;
            } else {
              int discarded$20 = 101;
              if (rg.a(ja.field_c)) {
                L22: {
                  L23: {
                    int discarded$21 = 384920353;
                    ui.a();
                    kg.a(param1 + 21677);
                    ci.field_t = false;
                    ri.field_N = cm.field_t;
                    gn.a(qb.field_u, ja.field_c, ma.field_P, vh.field_S, param1 ^ 23);
                    if (cb.field_k) {
                      break L23;
                    } else {
                      if (null == dq.field_a) {
                        break L22;
                      } else {
                        break L23;
                      }
                    }
                  }
                  L24: {
                    if (cb.field_k) {
                      stackOut_98_0 = 0;
                      stackIn_99_0 = stackOut_98_0;
                      break L24;
                    } else {
                      stackOut_97_0 = 1;
                      stackIn_99_0 = stackOut_97_0;
                      break L24;
                    }
                  }
                  L25: {
                    stackOut_99_0 = stackIn_99_0;
                    stackIn_101_0 = stackOut_99_0;
                    stackIn_100_0 = stackOut_99_0;
                    if (cb.field_k) {
                      stackOut_101_0 = stackIn_101_0;
                      stackOut_101_1 = 0;
                      stackIn_102_0 = stackOut_101_0;
                      stackIn_102_1 = stackOut_101_1;
                      break L25;
                    } else {
                      stackOut_100_0 = stackIn_100_0;
                      stackOut_100_1 = 1;
                      stackIn_102_0 = stackOut_100_0;
                      stackIn_102_1 = stackOut_100_1;
                      break L25;
                    }
                  }
                  bf.a(stackIn_102_0 != 0, stackIn_102_1 != 0, param1 ^ -15948, dq.field_a);
                  break L22;
                }
                L26: {
                  if (!ld.field_u) {
                    break L26;
                  } else {
                    cc.f(967);
                    break L26;
                  }
                }
                L27: {
                  if (null == sg.field_l) {
                    int discarded$22 = 114;
                    sg.field_l = ni.h();
                    int discarded$23 = 120;
                    ri.field_M = ar.a();
                    break L27;
                  } else {
                    break L27;
                  }
                }
                kc.a(ja.field_c, sg.field_l, ri.field_M, 107);
                vh.field_S = null;
                ma.field_P = null;
                ja.field_c = null;
                int discarded$24 = -90;
                km.a((java.applet.Applet) this);
                hc.b(2);
                field_A = 10;
                break L21;
              } else {
                break L21;
              }
            }
          }
        }
        L28: {
          if (10 != field_A) {
            break L28;
          } else {
            L29: {
              if (0 != cd.field_e) {
                qc.field_k = aj.a(lc.field_i, true);
                break L29;
              } else {
                break L29;
              }
            }
            field_A = 11;
            break L28;
          }
        }
        L30: {
          if (field_A == 11) {
            L31: {
              if (null == qc.field_k) {
                break L31;
              } else {
                L32: {
                  if (!qc.field_k.a((byte) -127)) {
                    break L32;
                  } else {
                    if (!qc.field_k.a(98)) {
                      break L32;
                    } else {
                      break L31;
                    }
                  }
                }
                ai.a((byte) 24, 0.0f, be.a(qc.field_k, wn.field_a, 125, d.field_C));
                break L30;
              }
            }
            field_A = 12;
            lo.field_d = true;
            break L30;
          } else {
            break L30;
          }
        }
        L33: {
          if (field_A == 12) {
            if (lo.field_d) {
              break L33;
            } else {
              field_A = 13;
              break L33;
            }
          } else {
            break L33;
          }
        }
        L34: {
          if (field_A == 13) {
            L35: {
              var3 = 1;
              if (bh.field_tb == null) {
                break L35;
              } else {
                L36: {
                  if (!bh.field_tb.d(-115)) {
                    stackOut_131_0 = 0;
                    stackIn_132_0 = stackOut_131_0;
                    break L36;
                  } else {
                    stackOut_130_0 = 1;
                    stackIn_132_0 = stackOut_130_0;
                    break L36;
                  }
                }
                var3 = stackIn_132_0;
                ai.a((byte) 24, bh.field_tb.field_e, bh.field_tb.field_g);
                break L35;
              }
            }
            if (var3 != 0) {
              field_A = 20;
              break L34;
            } else {
              break L34;
            }
          } else {
            break L34;
          }
        }
        L37: {
          if (param0) {
            break L37;
          } else {
            if (!tn.field_A) {
              break L37;
            } else {
              t.a(false, kj.field_D);
              ((qg) this).c(false);
              ap.a((byte) 117, kj.field_D);
              break L37;
            }
          }
        }
        L38: {
          if (!uf.field_d[8]) {
            break L38;
          } else {
            int discarded$25 = 14114;
            fk.a();
            break L38;
          }
        }
    }

    final void b(byte param0) {
        if (param0 != -67) {
            return;
        }
        uf.field_d[4] = true;
    }

    final void i(int param0) {
        uf.field_d[param0] = true;
    }

    private final void a() {
        int var2 = jl.field_e.l(255);
        int var3 = (1 & var2) != 0 ? 1 : 0;
        int var4 = -1 + ga.field_j;
        byte[] var5 = new byte[var4];
        jl.field_e.a(false, 0, var4, var5);
        fk.a((byte) 114, uc.e((byte) -73), q.a(var5, (byte) 70), var3 != 0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "Open in popup window";
        field_t = false;
    }
}
