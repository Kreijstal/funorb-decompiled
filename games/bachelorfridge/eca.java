/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eca extends bi {
    private po field_k;

    final int b(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = BachelorFridge.field_y;
        if (param1 == 40) {
          var3 = param0;
          if (0 == var3) {
            return 140;
          } else {
            if (1 != var3) {
              if ((var3 ^ -1) == -3) {
                return 450;
              } else {
                if (-4 != (var3 ^ -1)) {
                  throw new IllegalArgumentException();
                } else {
                  return 600;
                }
              }
            } else {
              return 225;
            }
          }
        } else {
          ((eca) this).field_k = null;
          var3 = param0;
          if (0 == var3) {
            return 140;
          } else {
            if (1 != var3) {
              if ((var3 ^ -1) == -3) {
                return 450;
              } else {
                if (-4 != (var3 ^ -1)) {
                  throw new IllegalArgumentException();
                } else {
                  return 600;
                }
              }
            } else {
              return 225;
            }
          }
        }
    }

    final int a(int param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = BachelorFridge.field_y;
        if (param1) {
          var3 = param0;
          if ((var3 ^ -1) != -1) {
            if (var3 != 1) {
              if (2 == var3) {
                return 260;
              } else {
                if (3 == var3) {
                  return 475;
                } else {
                  throw new IllegalArgumentException();
                }
              }
            } else {
              return 145;
            }
          } else {
            return 60;
          }
        } else {
          this.p(97);
          var3 = param0;
          if ((var3 ^ -1) != -1) {
            if (var3 != 1) {
              if (2 == var3) {
                return 260;
              } else {
                if (3 == var3) {
                  return 475;
                } else {
                  throw new IllegalArgumentException();
                }
              }
            } else {
              return 145;
            }
          } else {
            return 60;
          }
        }
    }

    public eca() {
        super(5);
        ((eca) this).field_k = (po) (Object) jha.field_g;
    }

    final void b(boolean param0, int param1, int param2) {
        int var5 = 0;
        String var6 = null;
        pia var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        kv var11 = null;
        kv var12 = null;
        String var13 = null;
        kv var14 = null;
        String var15 = null;
        int stackIn_6_0 = 0;
        int stackIn_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param2 == 0) {
          L0: {
            var14 = ((eca) this).b(param1, (byte) 81);
            var5 = ((eca) this).d(param1, 26891) ? 1 : 0;
            var15 = ((eca) this).d(false, pj.field_b[((eca) this).field_b][param1]);
            var7 = fn.field_n;
            if (var5 == 0) {
              stackOut_13_0 = 8;
              stackIn_14_0 = stackOut_13_0;
              break L0;
            } else {
              if (!param0) {
                stackOut_12_0 = 9;
                stackIn_14_0 = stackOut_12_0;
                break L0;
              } else {
                stackOut_11_0 = 10;
                stackIn_14_0 = stackOut_11_0;
                break L0;
              }
            }
          }
          var8 = stackIn_14_0;
          var9 = ((eca) this).a(param1, true) - -((eca) this).b(param1, 40) >> -606668991;
          var10 = ((eca) this).a(param1, (byte) -74) + (((eca) this).a(param2 + -119, param1) >> -1171338815);
          if (var5 != 0) {
            var14.e(-(var14.field_n >> -690511071) + var9, var10 + -22);
            ((po) (Object) var7).a(var15, var9, var10 + 6, var8, -1);
            return;
          } else {
            var14.b(var9 - (var14.field_n >> -482973823), var10 + -22, 128);
            ((po) (Object) var7).a(var15, var9, var10 + 6, var8, -1);
            return;
          }
        } else {
          L1: {
            ((eca) this).field_k = null;
            var12 = ((eca) this).b(param1, (byte) 81);
            var11 = var12;
            var5 = ((eca) this).d(param1, 26891) ? 1 : 0;
            var13 = ((eca) this).d(false, pj.field_b[((eca) this).field_b][param1]);
            var6 = var13;
            var7 = fn.field_n;
            if (var5 == 0) {
              stackOut_5_0 = 8;
              stackIn_6_0 = stackOut_5_0;
              break L1;
            } else {
              if (!param0) {
                stackOut_4_0 = 9;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = 10;
                stackIn_6_0 = stackOut_3_0;
                break L1;
              }
            }
          }
          var8 = stackIn_6_0;
          var9 = ((eca) this).a(param1, true) - -((eca) this).b(param1, 40) >> -606668991;
          var10 = ((eca) this).a(param1, (byte) -74) + (((eca) this).a(param2 + -119, param1) >> -1171338815);
          if (var5 != 0) {
            var12.e(-(var12.field_n >> -690511071) + var9, var10 + -22);
            ((po) (Object) var7).a(var13, var9, var10 + 6, var8, -1);
            return;
          } else {
            var12.b(var9 - (var12.field_n >> -482973823), var10 + -22, 128);
            ((po) (Object) var7).a(var13, var9, var10 + 6, var8, -1);
            return;
          }
        }
    }

    private final void a(int param0, int param1, int param2, String param3, byte param4) {
        int var6 = 0;
        if (param4 <= 71) {
            this.q(-87);
            var6 = oja.field_a[param2] + oja.field_a[1 + param2] >> 124272641;
            ((eca) this).field_k.a(param3, var6, param0, param1, -1);
            return;
        }
        var6 = oja.field_a[param2] + oja.field_a[1 + param2] >> 124272641;
        ((eca) this).field_k.a(param3, var6, param0, param1, -1);
    }

    private final String e(byte param0) {
        int var2 = 0;
        String[] var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        String var11 = null;
        String var28 = null;
        String stackIn_15_0 = null;
        String stackIn_21_0 = null;
        String stackIn_30_0 = null;
        String stackIn_48_0 = null;
        String stackIn_53_0 = null;
        String stackOut_47_0 = null;
        String stackOut_46_0 = null;
        String stackOut_52_0 = null;
        String stackOut_51_0 = null;
        String stackOut_29_0 = null;
        String stackOut_28_0 = null;
        String stackOut_20_0 = null;
        String stackOut_19_0 = null;
        String stackOut_14_0 = null;
        String stackOut_13_0 = null;
        var10 = BachelorFridge.field_y;
        var2 = 0;
        var3 = ri.field_b.field_k[ks.field_i];
        var4 = ri.field_b.field_g[ks.field_i];
        var5 = ((eca) this).field_k.field_u + 108;
        this.a(0, od.field_z, param0 ^ 9);
        var6 = 0;
        this.a(1, hea.field_q, 0);
        if (param0 == 9) {
          this.a(2, aj.field_b, 0);
          this.a(3, ej.field_n, param0 + -9);
          this.a(4, es.field_h, 0);
          this.a(5, eg.field_q, 0);
          var7 = 0;
          L0: while (true) {
            if (-11 >= (var7 ^ -1)) {
              L1: {
                if (var6 != 0) {
                  break L1;
                } else {
                  L2: {
                    if ((ri.field_b.field_f ^ -1) != -1) {
                      break L2;
                    } else {
                      if (ri.field_b.field_h != 0) {
                        break L2;
                      } else {
                        if ((ri.field_b.field_l ^ -1) != -1) {
                          break L2;
                        } else {
                          L3: {
                            if (var2 == 0) {
                              stackOut_47_0 = gea.field_g;
                              stackIn_48_0 = stackOut_47_0;
                              break L3;
                            } else {
                              stackOut_46_0 = "";
                              stackIn_48_0 = stackOut_46_0;
                              break L3;
                            }
                          }
                          return (String) (Object) stackIn_48_0;
                        }
                      }
                    }
                  }
                  var7 = 3518976;
                  this.a(cha.field_l, var5, ri.field_b.field_l, 22442, ri.field_b.field_j, ri.field_b.field_f, ri.field_b.field_h, var7, -1);
                  var2 = 1;
                  break L1;
                }
              }
              L4: {
                if (var2 == 0) {
                  stackOut_52_0 = gea.field_g;
                  stackIn_53_0 = stackOut_52_0;
                  break L4;
                } else {
                  stackOut_51_0 = "";
                  stackIn_53_0 = stackOut_51_0;
                  break L4;
                }
              }
              return (String) (Object) stackIn_53_0;
            } else {
              if (null == var3[var7]) {
                var5 += 23;
                var7++;
                continue L0;
              } else {
                if (var3[var7].equals((Object) (Object) "")) {
                  var5 += 23;
                  var7++;
                  continue L0;
                } else {
                  L5: {
                    var8 = 16777215;
                    var28 = var3[var7];
                    if (!wb.a((byte) 52, var28)) {
                      break L5;
                    } else {
                      var8 = 16760864;
                      var6 = 1;
                      break L5;
                    }
                  }
                  var2 = 1;
                  this.a(var28, var5, var4[3 + 4 * var7], 22442, var4[var7 * 4], var4[var7 * 4 + 1], var4[2 + var7 * 4], var8, var7);
                  var5 += 23;
                  var7++;
                  continue L0;
                }
              }
            }
          }
        } else {
          ((eca) this).field_k = null;
          this.a(2, aj.field_b, 0);
          this.a(3, ej.field_n, param0 + -9);
          this.a(4, es.field_h, 0);
          this.a(5, eg.field_q, 0);
          var7 = 0;
          L6: while (true) {
            if (-11 >= (var7 ^ -1)) {
              if (var6 == 0) {
                if ((ri.field_b.field_f ^ -1) == -1) {
                  L7: {
                    L8: {
                      if (ri.field_b.field_h != 0) {
                        break L8;
                      } else {
                        if ((ri.field_b.field_l ^ -1) != -1) {
                          break L8;
                        } else {
                          break L7;
                        }
                      }
                    }
                    var7 = 3518976;
                    this.a(cha.field_l, var5, ri.field_b.field_l, 22442, ri.field_b.field_j, ri.field_b.field_f, ri.field_b.field_h, var7, -1);
                    var2 = 1;
                    break L7;
                  }
                  L9: {
                    if (var2 == 0) {
                      stackOut_29_0 = gea.field_g;
                      stackIn_30_0 = stackOut_29_0;
                      break L9;
                    } else {
                      stackOut_28_0 = "";
                      stackIn_30_0 = stackOut_28_0;
                      break L9;
                    }
                  }
                  return (String) (Object) stackIn_30_0;
                } else {
                  L10: {
                    var7 = 3518976;
                    this.a(cha.field_l, var5, ri.field_b.field_l, 22442, ri.field_b.field_j, ri.field_b.field_f, ri.field_b.field_h, var7, -1);
                    var2 = 1;
                    if (var2 == 0) {
                      stackOut_20_0 = gea.field_g;
                      stackIn_21_0 = stackOut_20_0;
                      break L10;
                    } else {
                      stackOut_19_0 = "";
                      stackIn_21_0 = stackOut_19_0;
                      break L10;
                    }
                  }
                  return (String) (Object) stackIn_21_0;
                }
              } else {
                L11: {
                  if (var2 == 0) {
                    stackOut_14_0 = gea.field_g;
                    stackIn_15_0 = stackOut_14_0;
                    break L11;
                  } else {
                    stackOut_13_0 = "";
                    stackIn_15_0 = stackOut_13_0;
                    break L11;
                  }
                }
                return (String) (Object) stackIn_15_0;
              }
            } else {
              if (null == var3[var7]) {
                var5 += 23;
                var7++;
                continue L6;
              } else {
                if (var3[var7].equals((Object) (Object) "")) {
                  var5 += 23;
                  var7++;
                  continue L6;
                } else {
                  L12: {
                    var8 = 16777215;
                    var11 = var3[var7];
                    if (!wb.a((byte) 52, var11)) {
                      break L12;
                    } else {
                      var8 = 16760864;
                      var6 = 1;
                      break L12;
                    }
                  }
                  var2 = 1;
                  this.a(var11, var5, var4[3 + 4 * var7], 22442, var4[var7 * 4], var4[var7 * 4 + 1], var4[2 + var7 * 4], var8, var7);
                  var5 += 23;
                  var7++;
                  continue L6;
                }
              }
            }
          }
        }
    }

    private final void q(int param0) {
        int var3 = 0;
        int var4 = 0;
        String var5 = null;
        String var6 = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        String var10 = null;
        L0: {
          var4 = BachelorFridge.field_y;
          if (ri.field_b == null) {
            ri.field_b = au.a(7, 16757, 0, 10);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 == 1) {
          if (ri.field_b.field_p) {
            if (null == ri.field_b.field_k) {
              var10 = qe.field_d;
              var3 = 95 - -((eca) this).field_k.field_u - -253;
              ((eca) this).field_k.a(var10, 320, var3, 3518976, -1);
              return;
            } else {
              var9 = this.e((byte) 9);
              var3 = 95 - -((eca) this).field_k.field_u - -253;
              ((eca) this).field_k.a(var9, 320, var3, 3518976, -1);
              return;
            }
          } else {
            var8 = fo.field_b;
            var3 = 95 - -((eca) this).field_k.field_u - -253;
            ((eca) this).field_k.a(var8, 320, var3, 3518976, -1);
            return;
          }
        } else {
          ((eca) this).field_k = null;
          if (ri.field_b.field_p) {
            if (null == ri.field_b.field_k) {
              var7 = qe.field_d;
              var3 = 95 - -((eca) this).field_k.field_u - -253;
              ((eca) this).field_k.a(var7, 320, var3, 3518976, -1);
              return;
            } else {
              var6 = this.e((byte) 9);
              var3 = 95 - -((eca) this).field_k.field_u - -253;
              ((eca) this).field_k.a(var6, 320, var3, 3518976, -1);
              return;
            }
          } else {
            var5 = fo.field_b;
            var3 = 95 - -((eca) this).field_k.field_u - -253;
            ((eca) this).field_k.a(var5, 320, var3, 3518976, -1);
            return;
          }
        }
    }

    final void l(int param0) {
        ((eca) this).i(-12988);
        j.a(wa.field_l, 40, 16760896, true, 320, false);
        dg.a(40, 60, 560, 335, 20, 0, 80);
        if (param0 != 9) {
            ((eca) this).field_k = null;
            if (bp.e(param0 + -29928)) {
                this.p(-118);
                ((eca) this).c(true);
                return;
            }
            this.q(1);
            ((eca) this).c(true);
            return;
        }
        if (bp.e(param0 + -29928)) {
            this.p(-118);
            ((eca) this).c(true);
            return;
        }
        this.q(1);
        ((eca) this).c(true);
    }

    final kv b(int param0, byte param1) {
        int var3 = 0;
        if (param1 >= 62) {
          var3 = param0;
          if (-4 == (var3 ^ -1)) {
            return gj.field_F;
          } else {
            if ((var3 ^ -1) != -3) {
              return ana.field_r;
            } else {
              return jt.field_g;
            }
          }
        } else {
          return null;
        }
    }

    private final void a(String param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var10 = 0;
        String var11 = null;
        String var12 = null;
        String var13 = null;
        String stackIn_10_0 = null;
        String stackIn_20_0 = null;
        String stackOut_19_0 = null;
        String stackOut_18_0 = null;
        String stackOut_9_0 = null;
        String stackOut_8_0 = null;
        var10 = param2 + param5 + param6;
        if (param3 == 22442) {
          L0: {
            if ((param8 ^ -1) != 0) {
              ((eca) this).field_k.b(param8 + 1 + ". ", 70, param1, param7, -1);
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (0 != var10) {
              param6 = (param6 * 200 - -var10) / (2 * var10);
              param2 = (var10 + 200 * param2) / (var10 * 2);
              param5 = (param5 * 200 + var10) / (2 * var10);
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            ((eca) this).field_k.c(param0, 80, param1, param7, -1);
            if (-51 >= (var10 ^ -1)) {
              stackOut_19_0 = "50+";
              stackIn_20_0 = stackOut_19_0;
              break L2;
            } else {
              stackOut_18_0 = Integer.toString(var10);
              stackIn_20_0 = stackOut_18_0;
              break L2;
            }
          }
          var13 = (String) (Object) stackIn_20_0;
          var11 = var13;
          this.a(param1, param7, 1, Integer.toString(param4), (byte) 119);
          this.a(param1, param7, 2, var13, (byte) 109);
          this.a(param1, param7, 3, param5 + "%", (byte) 81);
          this.a(param1, param7, 4, param2 + "%", (byte) 73);
          this.a(param1, param7, 5, param6 + "%", (byte) 121);
          return;
        } else {
          L3: {
            ((eca) this).field_k = null;
            if ((param8 ^ -1) != 0) {
              ((eca) this).field_k.b(param8 + 1 + ". ", 70, param1, param7, -1);
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if (0 != var10) {
              param6 = (param6 * 200 - -var10) / (2 * var10);
              param2 = (var10 + 200 * param2) / (var10 * 2);
              param5 = (param5 * 200 + var10) / (2 * var10);
              break L4;
            } else {
              break L4;
            }
          }
          L5: {
            ((eca) this).field_k.c(param0, 80, param1, param7, -1);
            if (-51 >= (var10 ^ -1)) {
              stackOut_9_0 = "50+";
              stackIn_10_0 = stackOut_9_0;
              break L5;
            } else {
              stackOut_8_0 = Integer.toString(var10);
              stackIn_10_0 = stackOut_8_0;
              break L5;
            }
          }
          var12 = (String) (Object) stackIn_10_0;
          var11 = var12;
          this.a(param1, param7, 1, Integer.toString(param4), (byte) 119);
          this.a(param1, param7, 2, var12, (byte) 109);
          this.a(param1, param7, 3, param5 + "%", (byte) 81);
          this.a(param1, param7, 4, param2 + "%", (byte) 73);
          this.a(param1, param7, 5, param6 + "%", (byte) 121);
          return;
        }
    }

    private final void a(int param0, String param1, int param2) {
        int var4 = 0;
        pia var5 = null;
        if (param2 != param0) {
            dg.b(oja.field_a[param0], 80, 276, 0, 64);
            var4 = oja.field_a[1 + param0] + oja.field_a[param0] >> -713789663;
            var5 = fn.field_n;
            ((po) (Object) var5).a(param1, var4, 100, 10, -1);
            return;
        }
        var4 = oja.field_a[1 + param0] + oja.field_a[param0] >> -713789663;
        var5 = fn.field_n;
        ((po) (Object) var5).a(param1, var4, 100, 10, -1);
    }

    final int a(int param0, int param1) {
        int var3 = 114 % ((param0 - -64) / 38);
        return 40;
    }

    final int a(int param0, byte param1) {
        if (param1 >= -38) {
            return -97;
        }
        return 418;
    }

    final boolean c(int param0, int param1) {
        if (param1 != 19950) {
            return false;
        }
        if (bp.e(param1 ^ -14641)) {
            return -3 >= (param0 ^ -1) ? true : false;
        }
        return (param0 ^ -1) != -3 ? true : false;
    }

    private final void p(int param0) {
        ((eca) this).field_k.a(d.field_E, 320, ((eca) this).field_k.field_u + 353 - -11, 3518976, -1);
        if (param0 >= -113) {
            this.a((String) null, -62, 37, -6, 83, 78, 31, -18, -51);
        }
    }

    static {
    }
}
