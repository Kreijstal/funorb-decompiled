/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class hn extends kna {
    static String field_F;
    static String field_G;
    private int field_I;
    private int field_H;
    private int field_J;

    final boolean v(int param0) {
        if (param0 != 555277520) {
            la var3 = (la) null;
            this.a(false, -3, (la) null);
            return true;
        }
        return true;
    }

    abstract boolean C(int param0);

    final boolean z(int param0) {
        if (param0 != 0) {
            return true;
        }
        return false;
    }

    final void q(byte param0) {
        super.q(param0);
    }

    final boolean n(byte param0) {
        if (param0 != -122) {
            this.field_H = -72;
            return false;
        }
        return false;
    }

    void a(boolean param0, kh param1) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1);
              if (!param0) {
                break L1;
              } else {
                hn.b(88, -88);
                break L1;
              }
            }
            L2: {
              if (this.D(0)) {
                param1.a((byte) 107, this.field_I, 3);
                if (0 < this.field_I) {
                  param1.a((byte) -128, this.field_H, 2);
                  break L2;
                } else {
                  break L2;
                }
              } else {
                break L2;
              }
            }
            L3: {
              if (this.C(1)) {
                param1.a((byte) 100, this.field_J, 2);
                break L3;
              } else {
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3);

            stackIn_13_1 = new StringBuilder().append("hn.V(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
    }

    final fsa a(boolean param0, int param1, la param2) {
        RuntimeException var4 = null;
        vd var5 = null;
        fsa var6 = null;
        fsa stackIn_2_0 = null;
        fsa stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var6 = new fsa(param2, param0);
            if (param1 == 3) {
              var6.b((byte) -11, this.field_k, this.field_l);
              var6.a((byte) -3, 0);
              var6.b((byte) 17, true);
              var5 = new vd(param2, param0);
              var5.b((byte) 105, false);
              var5.a((byte) -128, this.a(param2, false, false));
              var5.a(this.a(5, false, param2), (byte) -94);
              var5.a(this.a(false, param2, (byte) -114), 2);
              var5.b(true, this.A(-1));
              var5.a(false, this.B(123));
              var6.a((byte) 83, (nv) (var5));
              stackIn_4_0 = (fsa) (var6);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (fsa) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4);

            stackIn_7_1 = new StringBuilder().append("hn.AC(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    abstract fsa a(la param0, boolean param1, boolean param2);

    hn(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
        RuntimeException runtimeException = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!this.D(0)) {
                break L1;
              } else {
                this.field_I = param2.b((byte) 44, 3);
                if ((this.field_I ^ -1) >= -1) {
                  break L1;
                } else {
                  this.field_H = param2.b((byte) 44, 2);
                  break L1;
                }
              }
            }
            L2: {
              if (!this.C(1)) {
                break L2;
              } else {
                this.field_J = param2.b((byte) 44, 2);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (runtimeException);

            stackIn_9_1 = new StringBuilder().append("hn.<init>(");

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
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), stackIn_16_2 + ')');
        }
    }

    final boolean s(int param0) {
        if (param0 != -15254) {
            this.field_I = 109;
            return false;
        }
        return false;
    }

    final int t(int param0) {
        if (param0 != 8) {
            la var3 = (la) null;
            this.a(true, 54, (la) null);
        }
        return 7;
    }

    private final fsa a(boolean param0, la param1, byte param2) {
        int var5 = 0;
        ue var6 = null;
        int var7 = 0;
        fsa var9 = null;
        ue var10 = null;
        fsa stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        dg var8 = null;
        ue var11 = null;
        mfa var12 = null;
        try {
          L0: {
            if ((this.field_I ^ -1) < -1) {
              L1: {
                L2: {
                  var9 = new fsa(param1, param0);
                  var5 = -31 % ((param2 - -48) / 57);
                  var9.b((byte) -11, 2097152, 2097152);
                  var9.b((byte) 17, false);
                  var7 = this.field_H;
                  if (var7 == 0) {
                    break L2;
                  } else {
                    if (var7 != 1) {
                      break L2;
                    } else {
                      var11 = new ue(param1, param0);
                      var11.a(0, false);
                      var6 = var11;
                      var9.a((byte) 83, (nv) (var11));
                      break L1;
                    }
                  }
                }
                var10 = new ue(param1, param0);
                var10.a(1, false);
                var6 = var10;
                var9.a((byte) 83, (nv) (var10));
                break L1;
              }
              var12 = rm.field_a;
              var8 = var12.a(var6, var9, -102);
              var9.a(var6, (byte) 124, var8);
              stackIn_9_0 = (fsa) (var9);
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var4);

            stackIn_12_1 = new StringBuilder().append("hn.GC(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param2 + ')');
        }
        return stackIn_9_0;
    }

    abstract boolean D(int param0);

    final static g b(int param0, int param1) {
        if (param0 != 0) {
            return (g) null;
        }
        return sja.field_i[param1];
    }

    abstract fsa a(int param0, boolean param1, la param2);

    private final int B(int param0) {
        if (param0 <= 92) {
            return 85;
        }
        return 0;
    }

    final static void c(boolean param0, int param1) {
        int stackIn_4_0 = 0;
        jea stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        jea stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        Object stackIn_32_0 = null;
        tv stackIn_32_1 = null;
        int stackIn_55_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        jea var7_ref_jea = null;
        int var7 = 0;
        int var8 = 0;
        jea var8_ref_jea = null;
        tv var9_ref_tv = null;
        int var9 = 0;
        int var10 = 0;
        tv var10_ref_tv = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              ob.field_i = bea.field_g;
              jqa.field_g = bea.field_a;
              if (param0) {
                stackIn_4_0 = gt.field_a;
                break L1;
              } else {
                stackIn_4_0 = fp.field_e;
                break L1;
              }
            }
            L2: {
              dga.a(stackIn_4_0, 199);
              rm.field_e.a(0, 0, param1 + 18, nra.field_c.field_G, -2 + nra.field_c.field_t + -40);
              cea.field_a.a(lk.field_l.field_G, di.field_a, param1 ^ -23774, 0, 0);
              stackIn_6_0 = uaa.field_b;

              stackIn_6_1 = lk.field_l.field_G;

              if (!rca.field_p) {
                stackIn_7_0 = (jea) ((Object) stackIn_6_0);
                stackIn_7_1 = stackIn_6_1;
                stackIn_7_2 = 0;
                break L2;
              } else {
                stackIn_7_0 = (jea) ((Object) stackIn_6_0);
                stackIn_7_1 = stackIn_6_1;
                stackIn_7_2 = 2 + (io.field_a + 40) - -2;
                break L2;
              }
            }
            L3: {
              ((jea) (Object) stackIn_7_0).a(stackIn_7_1 + -stackIn_7_2, 18, -23776, param1 + di.field_a, 0);
              lda.field_F.a(42 - -io.field_a, 18, param1 + -23778, 2 + di.field_a, -io.field_a + lk.field_l.field_G - 42);
              tn.field_n.a(lk.field_l.field_G, 2, (byte) 127, 0, io.field_a, lk.field_l.field_t - (di.field_a - -22), 20 + (2 + di.field_a));
              bc.field_b.a(nra.field_c.field_G, 40, -23776, -40 + nra.field_c.field_t, 0);
              wf.field_g.a(dka.field_b.field_G, 30, -23776, 0, 0);
              dba.field_g.a(dka.field_b.field_G, dka.field_b.field_t - 72, -23776, 30, 0);
              var2_int = 3 + fk.field_b;
              if ((sg.field_u.length ^ -1) <= -3) {
                break L3;
              } else {
                var2_int--;
                break L3;
              }
            }
            L4: {
              if (param0) {
                var2_int--;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              var3 = (-5 + (-5 + (dba.field_g.field_t + -10) - -2 - -((var2_int + 1) / 2))) / (1 + var2_int) - 2;
              if (var3 <= 30) {
                break L5;
              } else {
                var3 = 30;
                break L5;
              }
            }
            L6: {
              var4 = -5 + (dba.field_g.field_t - 5 + -(var2_int * (var3 + 2)));
              if (var4 > 40) {
                var4 = 40;
                break L6;
              } else {
                break L6;
              }
            }
            qna.field_b.a(-5 + (dba.field_g.field_G - 5), var4, -23776, 5, 5);
            var5 = 7 - -var4;
            var6 = 0;
            L7: while (true) {
              if (fk.field_b + 4 <= var6) {
                hf.field_a.a(360, -134 + (bea.field_a - 10), -23776, 10, bea.field_g + -360 >> -1367106463);
                vca.field_e.a(hf.field_a.field_G, 24, -23776, 0, 0);
                vs.field_R.a(hf.field_a.field_G, -24 + hf.field_a.field_t, -23776, 24, 0);
                vs.field_R.field_w = hca.c(vs.field_R.field_t, 1, 3, 11579568, param1 ^ -116, 8421504);
                rra.field_e.a(-10 + vs.field_R.field_G, -24 + vs.field_R.field_t - 12, -23776, 5, 5);
                fsa.field_q.a(80, 24, -23776, -5 + (vs.field_R.field_t + -24), (-80 + vs.field_R.field_G) / 2);
                da.a(false);
                break L0;
              } else {
                L8: {
                  if (var6 != 1) {
                    break L8;
                  } else {
                    if (sg.field_u.length >= 2) {
                      break L8;
                    } else {
                      var6++;
                      continue L7;
                    }
                  }
                }
                L9: {
                  L10: {
                    if (-4 != (var6 ^ -1)) {
                      break L10;
                    } else {
                      if (-2 > (ws.field_r ^ -1)) {
                        break L10;
                      } else {
                        break L9;
                      }
                    }
                  }
                  L11: {
                    if (param0) {
                      break L11;
                    } else {
                      if (var6 != 3) {
                        break L11;
                      } else {
                        var7_ref_jea = rb.field_p[var6];
                        rb.field_p[var6].field_t = 0;
                        var7_ref_jea.field_G = 0;
                        var8 = 0;
                        L12: while (true) {
                          if (var8 < bf.field_b[var6].length) {
                            stackIn_32_0 = null;
                            stackIn_32_1 = bf.field_b[var6][var8];
                            L13: {
                              if (stackIn_32_0 != stackIn_32_1) {
                                var9_ref_tv = bf.field_b[var6][var8];
                                bf.field_b[var6][var8].field_t = 0;
                                var9_ref_tv.field_G = 0;
                                break L13;
                              } else {
                                break L13;
                              }
                            }
                            var8++;
                            continue L12;
                          } else {
                            var6++;
                            continue L7;
                          }
                        }
                      }
                    }
                  }
                  L14: {
                    if (!param0) {
                      break L14;
                    } else {
                      if (var6 != 0) {
                        break L14;
                      } else {
                        var7_ref_jea = rb.field_p[var6];
                        rb.field_p[var6].field_t = 0;
                        var7_ref_jea.field_G = 0;
                        var8 = 0;
                        L15: while (true) {
                          if (var8 < bf.field_b[var6].length) {
                            L16: {
                              if (null != bf.field_b[var6][var8]) {
                                var9_ref_tv = bf.field_b[var6][var8];
                                bf.field_b[var6][var8].field_t = 0;
                                var9_ref_tv.field_G = 0;
                                break L16;
                              } else {
                                break L16;
                              }
                            }
                            var8++;
                            continue L15;
                          } else {
                            var6++;
                            continue L7;
                          }
                        }
                      }
                    }
                  }
                  L17: {
                    if (param0) {
                      if (var6 >= 4) {
                        if (null != vba.field_u) {
                          if (vba.field_u[var6 + -4]) {
                            stackIn_55_0 = 1;
                            break L17;
                          } else {
                            stackIn_55_0 = 0;
                            break L17;
                          }
                        } else {
                          stackIn_55_0 = 0;
                          break L17;
                        }
                      } else {
                        stackIn_55_0 = 0;
                        break L17;
                      }
                    } else {
                      stackIn_55_0 = 0;
                      break L17;
                    }
                  }
                  var7 = stackIn_55_0;
                  if (var7 == 0) {
                    L18: {
                      rb.field_p[var6].a(103, var3, -23776, var5, 5);
                      var8 = 110;
                      if (param0) {
                        bf.field_b[var6][0].a(38, var8, pda.field_c, var3, 0, 2, var5);
                        var8 += 40;
                        break L18;
                      } else {
                        if (bf.field_b[var6][0] == null) {
                          break L18;
                        } else {
                          var9_ref_tv = bf.field_b[var6][0];
                          bf.field_b[var6][0].field_t = 0;
                          var9_ref_tv.field_G = 0;
                          break L18;
                        }
                      }
                    }
                    var9 = -5 + dka.field_b.field_G - (var8 + -2);
                    var10 = bf.field_b[var6].length - 1;
                    var11 = 0;
                    L19: while (true) {
                      if (var10 <= var11) {
                        var5 = var5 + (2 + var3);
                        break L9;
                      } else {
                        var12 = var11 * var9 / var10;
                        bf.field_b[var6][var11 + 1].a(var9 * (1 + var11) / var10 + -2 + -var12, var8 - -var12, pda.field_c, var3, param1 ^ 2, 2, var5);
                        var11++;
                        continue L19;
                      }
                    }
                  } else {
                    var8_ref_jea = rb.field_p[var6];
                    rb.field_p[var6].field_t = 0;
                    var8_ref_jea.field_G = 0;
                    var9 = 0;
                    L20: while (true) {
                      if (var9 < bf.field_b[var6].length) {
                        L21: {
                          if (bf.field_b[var6][var9] != null) {
                            var10_ref_tv = bf.field_b[var6][var9];
                            bf.field_b[var6][var9].field_t = 0;
                            var10_ref_tv.field_G = 0;
                            break L21;
                          } else {
                            break L21;
                          }
                        }
                        var9++;
                        continue L20;
                      } else {
                        var6++;
                        continue L7;
                      }
                    }
                  }
                }
                var6++;
                continue L7;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hn.CC(" + param0 + ',' + param1 + ')');
        }
    }

    hn(la param0, int param1) {
        super(param0, param1);
    }

    private final int A(int param0) {
        if (param0 != -1) {
            field_F = (String) null;
        }
        return this.field_I;
    }

    public static void e(boolean param0) {
        field_G = null;
        field_F = null;
        if (param0) {
            hn.c(true, 116);
        }
    }

    static {
        field_G = "These blocks are unstable - they'll crumble into dust if you shoot them.";
        field_F = null;
    }
}
