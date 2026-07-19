/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class p extends uc {
    static nd field_i;
    static dl field_f;
    private int field_g;
    private jh field_e;
    static dl field_k;
    static String field_h;
    static int field_j;

    public static void b(int param0) {
        field_k = null;
        field_i = null;
        field_f = null;
        field_h = null;
        if (param0 != -1) {
            p.b(105);
        }
    }

    final void a(boolean param0) {
        if (!param0) {
            return;
        }
        this.field_e.a(157, gj.field_n, 26, (byte) 76, 325);
        boolean discarded$0 = this.c((byte) 69);
    }

    private final void a(int param0, int param1, int param2, boolean param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        uj stackIn_24_0 = null;
        uj stackIn_25_0 = null;
        uj stackIn_26_0 = null;
        String stackIn_26_1 = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        uj stackOut_23_0 = null;
        uj stackOut_25_0 = null;
        String stackOut_25_1 = null;
        uj stackOut_24_0 = null;
        String stackOut_24_1 = null;
        L0: {
          var14 = CrazyCrystals.field_B;
          if (!param3) {
            stackOut_2_0 = 12640511;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 16777215;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var5 = stackIn_3_0;
        var6 = 157;
        var7 = 168;
        if (param0 == -17) {
          L1: {
            var8 = 26;
            il.a(var8, param3, param1, var6, var7, false);
            if (param3) {
              stackOut_7_0 = 1;
              stackIn_8_0 = stackOut_7_0;
              break L1;
            } else {
              stackOut_6_0 = 0;
              stackIn_8_0 = stackOut_6_0;
              break L1;
            }
          }
          L2: {
            var9 = stackIn_8_0;
            if (param2 != 0) {
              if (1 != param2) {
                if (-3 != (param2 ^ -1)) {
                  if ((param2 ^ -1) == -4) {
                    gj.field_m.b(cc.field_b, this.field_g, param1 - -17, var9, -1);
                    ak.a((byte) 61, this.field_g, param1, qd.field_r, var5);
                    break L2;
                  } else {
                    if (qh.field_k != param2) {
                      if (param2 == rk.field_g) {
                        L3: {
                          var10 = gj.field_m.a(q.field_d);
                          var11 = gj.field_m.a(fk.field_t);
                          var12 = gj.field_m.a(vk.field_D);
                          if (var12 <= var11) {
                            break L3;
                          } else {
                            var11 = var12;
                            break L3;
                          }
                        }
                        L4: {
                          var13 = 240 + (var10 + -var11) / 2;
                          gj.field_m.b(q.field_d, var13, 17 + param1, var9, -1);
                          stackOut_23_0 = gj.field_m;
                          stackIn_25_0 = stackOut_23_0;
                          stackIn_24_0 = stackOut_23_0;
                          if (jm.field_j) {
                            stackOut_25_0 = (uj) ((Object) stackIn_25_0);
                            stackOut_25_1 = fk.field_t;
                            stackIn_26_0 = stackOut_25_0;
                            stackIn_26_1 = stackOut_25_1;
                            break L4;
                          } else {
                            stackOut_24_0 = (uj) ((Object) stackIn_24_0);
                            stackOut_24_1 = vk.field_D;
                            stackIn_26_0 = stackOut_24_0;
                            stackIn_26_1 = stackOut_24_1;
                            break L4;
                          }
                        }
                        ((uj) (Object) stackIn_26_0).a(stackIn_26_1, var13, param1 + 17, var9, -1);
                        break L2;
                      } else {
                        if (sj.field_c == param2) {
                          gj.field_m.c(nd.field_k, 240, 17 + param1, var9, -1);
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                    } else {
                      gj.field_m.c(vl.field_e, 240, param1 - -17, var9, -1);
                      break L2;
                    }
                  }
                } else {
                  gj.field_m.b(fa.field_m, this.field_g, param1 - -17, var9, -1);
                  ak.a((byte) 61, this.field_g, param1, gi.field_m, var5);
                  break L2;
                }
              } else {
                gj.field_m.c(jd.field_J, 240, 17 + param1, var9, -1);
                break L2;
              }
            } else {
              gj.field_m.c(nc.field_k, 240, 17 + param1, var9, -1);
              break L2;
            }
          }
          return;
        } else {
          return;
        }
    }

    private final boolean c(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_74_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_72_0 = 0;
        var3 = CrazyCrystals.field_B;
        if (param0 == 69) {
          L0: {
            if (this.field_e.field_c != 0) {
              break L0;
            } else {
              if (!this.field_e.a(true)) {
                break L0;
              } else {
                uh.field_p = null;
                return true;
              }
            }
          }
          L1: {
            if (this.field_e.field_c != 1) {
              break L1;
            } else {
              if (!this.field_e.a(true)) {
                break L1;
              } else {
                hc.a(true, false);
                uh.field_p = null;
                return true;
              }
            }
          }
          L2: {
            if (this.field_e.field_c != 2) {
              break L2;
            } else {
              L3: {
                if (!this.field_e.d(96)) {
                  break L3;
                } else {
                  if (-1 <= (gi.field_m ^ -1)) {
                    break L3;
                  } else {
                    L4: {
                      gi.field_m = gi.field_m - 8;
                      if (gi.field_m < 0) {
                        gi.field_m = 0;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    tb.field_d.a(fk.field_x[0], 100, 96 * gi.field_m, 8192);
                    break L3;
                  }
                }
              }
              L5: {
                if (!this.field_e.b(125)) {
                  break L5;
                } else {
                  if ((gi.field_m ^ -1) > -65) {
                    L6: {
                      gi.field_m = gi.field_m + 8;
                      if (64 >= gi.field_m) {
                        break L6;
                      } else {
                        gi.field_m = 64;
                        break L6;
                      }
                    }
                    tb.field_d.a(fk.field_x[0], 100, gi.field_m * 96, 8192);
                    break L5;
                  } else {
                    break L5;
                  }
                }
              }
              L7: {
                if (!this.field_e.b(true)) {
                  if (!this.field_e.e(-19741)) {
                    break L7;
                  } else {
                    if (-65 >= (gi.field_m ^ -1)) {
                      break L7;
                    } else {
                      gi.field_m = 64;
                      tb.field_d.a(fk.field_x[0], 100, 96 * gi.field_m, 8192);
                      break L7;
                    }
                  }
                } else {
                  if (!this.field_e.e(-19741)) {
                    break L7;
                  } else {
                    if (-65 >= (gi.field_m ^ -1)) {
                      break L7;
                    } else {
                      gi.field_m = 64;
                      tb.field_d.a(fk.field_x[0], 100, 96 * gi.field_m, 8192);
                      break L7;
                    }
                  }
                }
              }
              if (this.field_e.g(param0 ^ -70)) {
                L8: {
                  var2 = -6 + -this.field_g + qh.field_i;
                  if (-1 >= (var2 ^ -1)) {
                    if (-65 > (var2 ^ -1)) {
                      var2 = 64;
                      break L8;
                    } else {
                      break L8;
                    }
                  } else {
                    var2 = 0;
                    break L8;
                  }
                }
                L9: {
                  if (this.field_e.a(true)) {
                    break L9;
                  } else {
                    if (var2 == gi.field_m) {
                      break L2;
                    } else {
                      break L9;
                    }
                  }
                }
                gi.field_m = var2;
                tb.field_d.a(fk.field_x[0], 100, 96 * gi.field_m, 8192);
                break L2;
              } else {
                if (!this.field_e.a(true)) {
                  break L2;
                } else {
                  tb.field_d.a(fk.field_x[0], 100, 96 * gi.field_m, 8192);
                  break L2;
                }
              }
            }
          }
          L10: {
            if (3 == this.field_e.field_c) {
              L11: {
                if (!this.field_e.d(96)) {
                  break L11;
                } else {
                  if (-1 > (qd.field_r ^ -1)) {
                    ia.a(-658435066, -8 + qd.field_r);
                    break L11;
                  } else {
                    break L11;
                  }
                }
              }
              L12: {
                if (!this.field_e.b(107)) {
                  break L12;
                } else {
                  if (-65 < (qd.field_r ^ -1)) {
                    ia.a(-658435066, 8 + qd.field_r);
                    break L12;
                  } else {
                    break L12;
                  }
                }
              }
              L13: {
                if (!this.field_e.b(true)) {
                  if (!this.field_e.e(-19741)) {
                    break L13;
                  } else {
                    if (-65 >= (qd.field_r ^ -1)) {
                      break L13;
                    } else {
                      ia.a(-658435066, 64);
                      break L13;
                    }
                  }
                } else {
                  if (!this.field_e.e(-19741)) {
                    break L13;
                  } else {
                    if (-65 >= (qd.field_r ^ -1)) {
                      break L13;
                    } else {
                      ia.a(-658435066, 64);
                      break L13;
                    }
                  }
                }
              }
              if (!this.field_e.g(-1)) {
                break L10;
              } else {
                L14: {
                  var2 = qh.field_i + (-6 + -this.field_g);
                  if ((var2 ^ -1) <= -1) {
                    if (-65 <= (var2 ^ -1)) {
                      break L14;
                    } else {
                      var2 = 64;
                      break L14;
                    }
                  } else {
                    var2 = 0;
                    break L14;
                  }
                }
                if (qd.field_r == var2) {
                  break L10;
                } else {
                  ia.a(-658435066, var2);
                  break L10;
                }
              }
            } else {
              break L10;
            }
          }
          L15: {
            if (qh.field_k != this.field_e.field_c) {
              break L15;
            } else {
              if (!this.field_e.a(true)) {
                break L15;
              } else {
                qc.a(this.field_e.field_i, 0);
                this.field_e.a(param0 ^ -70, true, -1);
                return true;
              }
            }
          }
          L16: {
            if (rk.field_g != this.field_e.field_c) {
              break L16;
            } else {
              if (!this.field_e.a(true)) {
                break L16;
              } else {
                L17: {
                  if (jm.field_j) {
                    stackOut_73_0 = 0;
                    stackIn_74_0 = stackOut_73_0;
                    break L17;
                  } else {
                    stackOut_72_0 = 1;
                    stackIn_74_0 = stackOut_72_0;
                    break L17;
                  }
                }
                jm.field_j = stackIn_74_0 != 0;
                break L16;
              }
            }
          }
          if (sj.field_c != this.field_e.field_c) {
            return false;
          } else {
            if (this.field_e.a(true)) {
              uh.field_n = true;
              uh.field_p = null;
              return true;
            } else {
              return false;
            }
          }
        } else {
          return true;
        }
    }

    final boolean b(byte param0) {
        if (param0 <= 29) {
            return true;
        }
        if (pj.field_q != 13) {
            this.field_e.f(0);
            return this.c((byte) 69);
        }
        uh.field_p = null;
        return true;
    }

    p(boolean param0) {
        int fieldTemp$0 = 0;
        jn.field_p = 4;
        if (0 >= mo.field_l) {
            qh.field_k = -2;
        } else {
            fieldTemp$0 = jn.field_p;
            jn.field_p = jn.field_p + 1;
            qh.field_k = fieldTemp$0;
        }
        int fieldTemp$1 = jn.field_p;
        jn.field_p = jn.field_p + 1;
        rk.field_g = fieldTemp$1;
        int fieldTemp$2 = jn.field_p;
        jn.field_p = jn.field_p + 1;
        sj.field_c = fieldTemp$2;
        gj.field_n = -(jn.field_p * 26 / 2) + 241;
        this.field_e = new jh(jn.field_p);
        this.field_e.a(-1, param0, this.field_e.a((byte) -24, 26, qh.field_i, 325, gj.field_n, 157, bm.field_h));
        int var2 = go.field_l.a(fa.field_m);
        int var3 = go.field_l.a(cc.field_b);
        if (var3 > var2) {
            var2 = var3;
        }
        this.field_g = (-79 + var2 + 480) / 2;
    }

    final void a(byte param0) {
        int var2 = 0;
        int var3 = CrazyCrystals.field_B;
        go.a(jn.field_p + 2, 8, false);
        for (var2 = 0; var2 < jn.field_p; var2++) {
            this.a(-17, gj.field_n + 26 * var2, var2, var2 == this.field_e.field_c ? true : false);
        }
        if (param0 < 71) {
            p.b(53);
        }
    }

    static {
        field_h = "This is you.";
        field_j = 0;
    }
}
