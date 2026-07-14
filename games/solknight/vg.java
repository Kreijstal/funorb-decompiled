/*
 * Decompiled by CFR-JS 0.4.0.
 */
class vg extends pj {
    static int field_N;
    private int field_O;
    static int[] field_I;
    private boolean field_U;
    static int field_M;
    private int field_R;
    private boolean field_S;
    private int field_Q;
    private long field_T;
    private int field_K;
    static i field_J;
    static int field_P;
    private long field_V;

    final static void b(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = SolKnight.field_L ? 1 : 0;
        if (ad.field_h >= 0) {
          L0: {
            var3 = -135 + param1;
            var4 = param0 + -35;
            if (param2 >= 15) {
              break L0;
            } else {
              vg.a((byte) -22);
              break L0;
            }
          }
          L1: {
            var5 = 256;
            if (75 > ad.field_h) {
              var5 = (ad.field_h << 1689546120) / 75;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (-201 <= (ad.field_h ^ -1)) {
              break L2;
            } else {
              var5 = (250 - ad.field_h << -758238776) / 50;
              break L2;
            }
          }
          L3: {
            cl.a(-118, tg.field_J);
            hk.a();
            mi.a();
            ee.g(95);
            if (256 <= var5) {
              break L3;
            } else {
              mi.a(0, 0, mi.field_a, mi.field_d, 0, -var5 + 256);
              break L3;
            }
          }
          L4: {
            mf.e(4096);
            if (ad.field_h < 150) {
              tg.field_J.f(var3, var4);
              break L4;
            } else {
              gg.field_e.c(15 + var3, var4 - -10, var5);
              break L4;
            }
          }
          var6 = ad.field_h - 125;
          if (0 < var6) {
            if (var6 >= 50) {
              L5: {
                var6 = -140 + ad.field_h;
                if (var6 <= 0) {
                  break L5;
                } else {
                  L6: {
                    var7 = 256;
                    if (var6 < 20) {
                      var7 = 256 * var6 / 20;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  ql.field_p.c(var3 - -15, var4 - -10, var5 * var7 >> -1453019800);
                  break L5;
                }
              }
              return;
            } else {
              L7: {
                if ((var6 ^ -1) > -21) {
                  var7 = var6 * 256 / 20;
                  tg.field_I.a(var3, var4, var7);
                  break L7;
                } else {
                  if (30 <= var6) {
                    var7 = (-(256 * var6) + 12800) / 20;
                    tg.field_I.a(var3, var4, var7);
                    break L7;
                  } else {
                    tg.field_I.a(var3, var4, 256);
                    break L7;
                  }
                }
              }
              L8: {
                var6 = -140 + ad.field_h;
                if (var6 <= 0) {
                  break L8;
                } else {
                  L9: {
                    var7 = 256;
                    if (var6 < 20) {
                      var7 = 256 * var6 / 20;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  ql.field_p.c(var3 - -15, var4 - -10, var5 * var7 >> -1453019800);
                  break L8;
                }
              }
              return;
            }
          } else {
            L10: {
              var6 = -140 + ad.field_h;
              if (var6 <= 0) {
                break L10;
              } else {
                L11: {
                  var7 = 256;
                  if (var6 < 20) {
                    var7 = 256 * var6 / 20;
                    break L11;
                  } else {
                    break L11;
                  }
                }
                ql.field_p.c(var3 - -15, var4 - -10, var5 * var7 >> -1453019800);
                break L10;
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        long var6 = 0L;
        eg var8 = null;
        if (null != ((vg) this).field_w) {
          if (0 == param1) {
            ((vg) this).field_w.a((byte) 126, param0, ((vg) this).field_B, param2, (rc) this);
            if (((vg) this).field_w instanceof eg) {
              var8 = (eg) (Object) ((vg) this).field_w;
              if (((vg) this).field_O == ((vg) this).field_K) {
                var6 = je.a(param3 + 1);
                if (500L <= (-((vg) this).field_V + var6) % 1000L) {
                  if (param3 != 0) {
                    ((vg) this).field_U = false;
                    return;
                  } else {
                    return;
                  }
                } else {
                  var8.a(((vg) this).field_K, param0, 1, (rc) this, param2);
                  if (param3 != 0) {
                    ((vg) this).field_U = false;
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                var8.a(((vg) this).field_O, (rc) this, ((vg) this).field_K, 114, param0, param2);
                var6 = je.a(param3 + 1);
                if (500L <= (-((vg) this).field_V + var6) % 1000L) {
                  if (param3 != 0) {
                    ((vg) this).field_U = false;
                    return;
                  } else {
                    return;
                  }
                } else {
                  var8.a(((vg) this).field_K, param0, 1, (rc) this, param2);
                  if (param3 == 0) {
                    return;
                  } else {
                    ((vg) this).field_U = false;
                    return;
                  }
                }
              }
            } else {
              if (param3 != 0) {
                ((vg) this).field_U = false;
                return;
              } else {
                return;
              }
            }
          } else {
            if (param3 != 0) {
              ((vg) this).field_U = false;
              return;
            } else {
              return;
            }
          }
        } else {
          if (param3 != 0) {
            ((vg) this).field_U = false;
            return;
          } else {
            return;
          }
        }
    }

    void j(int param0) {
        int var2 = 0;
        var2 = -18 % ((param0 - -67) / 44);
        if (((vg) this).field_n instanceof pi) {
          ((pi) (Object) ((vg) this).field_n).a((vg) this, (byte) -79);
          return;
        } else {
          return;
        }
    }

    final void a(int param0, boolean param1, String param2) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          if (param2 == null) {
            param2 = "";
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          var4 = 60 / ((param0 - -30) / 60);
          ((vg) this).field_i = param2;
          var5 = param2.length();
          if ((((vg) this).field_Q ^ -1) == 0) {
            break L1;
          } else {
            if (var5 > ((vg) this).field_Q) {
              ((vg) this).field_i = ((vg) this).field_i.substring(0, ((vg) this).field_Q);
              break L1;
            } else {
              ((vg) this).field_O = ((vg) this).field_i.length();
              ((vg) this).field_K = ((vg) this).field_i.length();
              if (param1) {
                return;
              } else {
                ((vg) this).j(30);
                return;
              }
            }
          }
        }
        ((vg) this).field_O = ((vg) this).field_i.length();
        ((vg) this).field_K = ((vg) this).field_i.length();
        if (!param1) {
          ((vg) this).j(30);
          return;
        } else {
          return;
        }
    }

    private final String q(int param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          if (((vg) this).field_K <= ((vg) this).field_O) {
            stackOut_2_0 = ((vg) this).field_K;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = ((vg) this).field_O;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var2 = stackIn_3_0;
          if (((vg) this).field_K > ((vg) this).field_O) {
            stackOut_5_0 = ((vg) this).field_K;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = ((vg) this).field_O;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        var3 = stackIn_6_0;
        if (param0 != -33) {
          return null;
        } else {
          return ((vg) this).field_i.substring(var2, var3);
        }
    }

    final void l(int param0) {
        ((vg) this).field_K = 0;
        ((vg) this).field_O = 0;
        ((vg) this).field_i = "";
        if (param0 >= -79) {
          ((vg) this).j(-49);
          ((vg) this).j(-124);
          return;
        } else {
          ((vg) this).j(-124);
          return;
        }
    }

    private final int n(int param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = SolKnight.field_L ? 1 : 0;
        if (param0 >= 110) {
          if (-1 != (((vg) this).field_K ^ -1)) {
            var2 = ((vg) this).field_K - 1;
            L0: while (true) {
              if (var2 > 0) {
                if (((vg) this).field_i.charAt(-1 + var2) != 32) {
                  var2--;
                  continue L0;
                } else {
                  return var2;
                }
              } else {
                return var2;
              }
            }
          } else {
            return ((vg) this).field_K;
          }
        } else {
          ((vg) this).j(14);
          if (-1 != (((vg) this).field_K ^ -1)) {
            var2 = ((vg) this).field_K - 1;
            L1: while (true) {
              if (var2 > 0) {
                if (((vg) this).field_i.charAt(-1 + var2) != 32) {
                  var2--;
                  continue L1;
                } else {
                  return var2;
                }
              } else {
                return var2;
              }
            }
          } else {
            return ((vg) this).field_K;
          }
        }
    }

    private final void c(boolean param0) {
        if (param0) {
          if (((vg) this).field_n instanceof pi) {
            ((pi) (Object) ((vg) this).field_n).a((vg) this, true);
            return;
          } else {
            return;
          }
        } else {
          field_N = -95;
          if (!(((vg) this).field_n instanceof pi)) {
            return;
          } else {
            ((pi) (Object) ((vg) this).field_n).a((vg) this, true);
            return;
          }
        }
    }

    private final void o(int param0) {
        String var2 = this.q(-33);
        if (!(param0 <= (var2.length() ^ -1))) {
            java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) (Object) new java.awt.datatransfer.StringSelection(this.q(-33)), (java.awt.datatransfer.ClipboardOwner) null);
        }
    }

    void a(int param0, int param1, int param2, rc param3) {
        eg var5 = null;
        int var6 = 0;
        super.a(param0, param1 + 0, param2, param3);
        if (param1 == 18874) {
          this.d((byte) -119);
          if (1 == ((vg) this).field_u) {
            if (((vg) this).field_w instanceof eg) {
              var5 = (eg) (Object) ((vg) this).field_w;
              var6 = var5.a((rc) this, 0, gb.field_j, ad.field_m, param2, param0);
              if (-1 == var6) {
                ((vg) this).field_V = je.a(param1 ^ 18875);
                return;
              } else {
                L0: {
                  if (!((vg) this).field_U) {
                    break L0;
                  } else {
                    if (var6 >= ((vg) this).field_R) {
                      break L0;
                    } else {
                      if (var6 <= ((vg) this).field_O) {
                        break L0;
                      } else {
                        var6 = ((vg) this).field_R;
                        break L0;
                      }
                    }
                  }
                }
                ((vg) this).field_K = var6;
                ((vg) this).field_V = je.a(param1 ^ 18875);
                return;
              }
            } else {
              ((vg) this).field_V = je.a(param1 ^ 18875);
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static void a(byte param0) {
        if (!sg.b((byte) -107)) {
            return;
        }
        if (param0 <= 1) {
            return;
        }
        hc.a(false, true, 4);
    }

    private final void d(byte param0) {
        jf var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        eg var10 = null;
        var9 = SolKnight.field_L ? 1 : 0;
        if (!((vg) this).field_S) {
          ((vg) this).field_q = 0;
          ((vg) this).field_k = 0;
          return;
        } else {
          if (((vg) this).field_w instanceof eg) {
            var10 = (eg) (Object) ((vg) this).field_w;
            var3 = var10.a(-21480, (rc) this);
            var6 = -33 % ((-72 - param0) / 42);
            var4 = var3.b(62);
            var5 = var10.b(265, (rc) this);
            var7 = var10.a(3) >> -1457463263;
            if (-var7 + var5 > var4) {
              ((vg) this).field_q = 0;
              ((vg) this).field_k = 0;
              return;
            } else {
              var8 = ((vg) this).field_k - -var3.a(0, ((vg) this).field_K);
              if (-var7 + var5 >= var8) {
                if (var7 <= var8) {
                  if (-1 <= (((vg) this).field_k ^ -1)) {
                    if (((vg) this).field_k >= -var5 + var7) {
                      return;
                    } else {
                      ((vg) this).field_k = var7 + -var5;
                      return;
                    }
                  } else {
                    ((vg) this).field_k = 0;
                    return;
                  }
                } else {
                  ((vg) this).field_k = var7 - var8 + ((vg) this).field_k;
                  if (-1 <= (((vg) this).field_k ^ -1)) {
                    if (((vg) this).field_k >= -var5 + var7) {
                      return;
                    } else {
                      ((vg) this).field_k = var7 + -var5;
                      return;
                    }
                  } else {
                    ((vg) this).field_k = 0;
                    return;
                  }
                }
              } else {
                ((vg) this).field_k = ((vg) this).field_k - (var8 + var7 + -var5);
                if (-1 <= (((vg) this).field_k ^ -1)) {
                  if (((vg) this).field_k >= -var5 + var7) {
                    return;
                  } else {
                    ((vg) this).field_k = var7 + -var5;
                    return;
                  }
                } else {
                  ((vg) this).field_k = 0;
                  return;
                }
              }
            }
          } else {
            return;
          }
        }
    }

    final boolean a(char param0, byte param1, int param2, rc param3) {
        int var5 = 0;
        Object stackIn_27_0 = null;
        Object stackIn_28_0 = null;
        Object stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        Object stackIn_52_0 = null;
        Object stackIn_53_0 = null;
        Object stackIn_54_0 = null;
        int stackIn_54_1 = 0;
        Object stackIn_78_0 = null;
        Object stackIn_79_0 = null;
        Object stackIn_80_0 = null;
        int stackIn_80_1 = 0;
        Object stackIn_111_0 = null;
        Object stackIn_112_0 = null;
        Object stackIn_113_0 = null;
        int stackIn_113_1 = 0;
        Object stackOut_110_0 = null;
        Object stackOut_112_0 = null;
        int stackOut_112_1 = 0;
        Object stackOut_111_0 = null;
        int stackOut_111_1 = 0;
        Object stackOut_77_0 = null;
        Object stackOut_79_0 = null;
        int stackOut_79_1 = 0;
        Object stackOut_78_0 = null;
        int stackOut_78_1 = 0;
        Object stackOut_51_0 = null;
        Object stackOut_53_0 = null;
        int stackOut_53_1 = 0;
        Object stackOut_52_0 = null;
        int stackOut_52_1 = 0;
        Object stackOut_26_0 = null;
        Object stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        Object stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        ((vg) this).field_V = je.a(1);
        if (60 != param0) {
          if (param0 != 62) {
            if (param0 < 32) {
              L0: {
                if (85 != param2) {
                  if (param2 != 101) {
                    if (param2 != 13) {
                      if (param2 == 96) {
                        if (0 >= ((vg) this).field_K) {
                          break L0;
                        } else {
                          L1: {
                            stackOut_110_0 = this;
                            stackIn_112_0 = stackOut_110_0;
                            stackIn_111_0 = stackOut_110_0;
                            if (!fh.field_d[82]) {
                              stackOut_112_0 = this;
                              stackOut_112_1 = ((vg) this).field_K - 1;
                              stackIn_113_0 = stackOut_112_0;
                              stackIn_113_1 = stackOut_112_1;
                              break L1;
                            } else {
                              stackOut_111_0 = this;
                              stackOut_111_1 = this.n(117);
                              stackIn_113_0 = stackOut_111_0;
                              stackIn_113_1 = stackOut_111_1;
                              break L1;
                            }
                          }
                          this.b(stackIn_113_1, -6331);
                          return true;
                        }
                      } else {
                        if (-98 != (param2 ^ -1)) {
                          if (param2 != -103) {
                            if (103 != param2) {
                              if (-85 != param2) {
                                if (!fh.field_d[82]) {
                                  L2: {
                                    if (!fh.field_d[82]) {
                                      break L2;
                                    } else {
                                      if (param2 != 66) {
                                        break L2;
                                      } else {
                                        this.o(-1);
                                        return true;
                                      }
                                    }
                                  }
                                  if (!fh.field_d[82]) {
                                    break L0;
                                  } else {
                                    if ((param2 ^ -1) != -68) {
                                      break L0;
                                    } else {
                                      this.e((byte) -78);
                                      return true;
                                    }
                                  }
                                } else {
                                  if (-66 != (param2 ^ -1)) {
                                    if (fh.field_d[82]) {
                                      if (param2 == 66) {
                                        this.o(-1);
                                        return true;
                                      } else {
                                        L3: {
                                          if (!fh.field_d[82]) {
                                            break L3;
                                          } else {
                                            if ((param2 ^ -1) != -68) {
                                              break L3;
                                            } else {
                                              this.e((byte) -78);
                                              return true;
                                            }
                                          }
                                        }
                                        var5 = -50 % ((31 - param1) / 56);
                                        return false;
                                      }
                                    } else {
                                      L4: {
                                        if (!fh.field_d[82]) {
                                          break L4;
                                        } else {
                                          if ((param2 ^ -1) != -68) {
                                            break L4;
                                          } else {
                                            this.e((byte) -78);
                                            return true;
                                          }
                                        }
                                      }
                                      var5 = -50 % ((31 - param1) / 56);
                                      return false;
                                    }
                                  } else {
                                    this.m(108);
                                    return true;
                                  }
                                }
                              } else {
                                this.c(true);
                                return true;
                              }
                            } else {
                              this.b(((vg) this).field_i.length(), -6331);
                              return true;
                            }
                          } else {
                            this.b(0, -6331);
                            return true;
                          }
                        } else {
                          if (((vg) this).field_K < ((vg) this).field_i.length()) {
                            L5: {
                              stackOut_77_0 = this;
                              stackIn_79_0 = stackOut_77_0;
                              stackIn_78_0 = stackOut_77_0;
                              if (!fh.field_d[82]) {
                                stackOut_79_0 = this;
                                stackOut_79_1 = 1 + ((vg) this).field_K;
                                stackIn_80_0 = stackOut_79_0;
                                stackIn_80_1 = stackOut_79_1;
                                break L5;
                              } else {
                                stackOut_78_0 = this;
                                stackOut_78_1 = this.k(11365);
                                stackIn_80_0 = stackOut_78_0;
                                stackIn_80_1 = stackOut_78_1;
                                break L5;
                              }
                            }
                            this.b(stackIn_80_1, -6331);
                            return true;
                          } else {
                            var5 = -50 % ((31 - param1) / 56);
                            return false;
                          }
                        }
                      }
                    } else {
                      ((vg) this).l(-115);
                      return true;
                    }
                  } else {
                    if (((vg) this).field_K == ((vg) this).field_O) {
                      if (((vg) this).field_K < ((vg) this).field_i.length()) {
                        ((vg) this).field_O = ((vg) this).field_K + 1;
                        this.p(11002);
                        return true;
                      } else {
                        var5 = -50 % ((31 - param1) / 56);
                        return false;
                      }
                    } else {
                      this.p(11002);
                      return true;
                    }
                  }
                } else {
                  if (((vg) this).field_O == ((vg) this).field_K) {
                    if (0 < ((vg) this).field_K) {
                      ((vg) this).field_O = ((vg) this).field_K + -1;
                      this.p(11002);
                      return true;
                    } else {
                      break L0;
                    }
                  } else {
                    this.p(11002);
                    return true;
                  }
                }
              }
              var5 = -50 % ((31 - param1) / 56);
              return false;
            } else {
              if (param0 <= 126) {
                L6: {
                  if (((vg) this).field_O == ((vg) this).field_K) {
                    break L6;
                  } else {
                    this.p(11002);
                    break L6;
                  }
                }
                if (-1 == ((vg) this).field_Q) {
                  if (((vg) this).field_K >= ((vg) this).field_i.length()) {
                    ((vg) this).field_i = ((vg) this).field_i + param0;
                    ((vg) this).field_K = ((vg) this).field_i.length();
                    ((vg) this).field_O = ((vg) this).field_i.length();
                    ((vg) this).j(111);
                    return true;
                  } else {
                    ((vg) this).field_i = ((vg) this).field_i.substring(0, ((vg) this).field_K) + param0 + ((vg) this).field_i.substring(((vg) this).field_K, ((vg) this).field_i.length());
                    ((vg) this).field_K = ((vg) this).field_K + 1;
                    ((vg) this).field_O = ((vg) this).field_K;
                    ((vg) this).j(111);
                    return true;
                  }
                } else {
                  if (((vg) this).field_i.length() >= ((vg) this).field_Q) {
                    return true;
                  } else {
                    L7: {
                      if (((vg) this).field_K >= ((vg) this).field_i.length()) {
                        ((vg) this).field_i = ((vg) this).field_i + param0;
                        ((vg) this).field_K = ((vg) this).field_i.length();
                        ((vg) this).field_O = ((vg) this).field_i.length();
                        ((vg) this).j(111);
                        break L7;
                      } else {
                        ((vg) this).field_i = ((vg) this).field_i.substring(0, ((vg) this).field_K) + param0 + ((vg) this).field_i.substring(((vg) this).field_K, ((vg) this).field_i.length());
                        ((vg) this).field_K = ((vg) this).field_K + 1;
                        ((vg) this).field_O = ((vg) this).field_K;
                        ((vg) this).j(111);
                        break L7;
                      }
                    }
                    return true;
                  }
                }
              } else {
                if (85 != param2) {
                  if (param2 != 101) {
                    if (param2 != 13) {
                      if (param2 == 96) {
                        if (0 >= ((vg) this).field_K) {
                          var5 = -50 % ((31 - param1) / 56);
                          return false;
                        } else {
                          L8: {
                            stackOut_51_0 = this;
                            stackIn_53_0 = stackOut_51_0;
                            stackIn_52_0 = stackOut_51_0;
                            if (!fh.field_d[82]) {
                              stackOut_53_0 = this;
                              stackOut_53_1 = ((vg) this).field_K - 1;
                              stackIn_54_0 = stackOut_53_0;
                              stackIn_54_1 = stackOut_53_1;
                              break L8;
                            } else {
                              stackOut_52_0 = this;
                              stackOut_52_1 = this.n(117);
                              stackIn_54_0 = stackOut_52_0;
                              stackIn_54_1 = stackOut_52_1;
                              break L8;
                            }
                          }
                          this.b(stackIn_54_1, -6331);
                          return true;
                        }
                      } else {
                        if (-98 != (param2 ^ -1)) {
                          if (param2 != -103) {
                            if (103 != param2) {
                              if (-85 != param2) {
                                L9: {
                                  if (!fh.field_d[82]) {
                                    break L9;
                                  } else {
                                    if (-66 != (param2 ^ -1)) {
                                      break L9;
                                    } else {
                                      this.m(108);
                                      return true;
                                    }
                                  }
                                }
                                L10: {
                                  if (!fh.field_d[82]) {
                                    break L10;
                                  } else {
                                    if (param2 != 66) {
                                      break L10;
                                    } else {
                                      this.o(-1);
                                      return true;
                                    }
                                  }
                                }
                                if (fh.field_d[82]) {
                                  if ((param2 ^ -1) != -68) {
                                    var5 = -50 % ((31 - param1) / 56);
                                    return false;
                                  } else {
                                    this.e((byte) -78);
                                    return true;
                                  }
                                } else {
                                  var5 = -50 % ((31 - param1) / 56);
                                  return false;
                                }
                              } else {
                                this.c(true);
                                return true;
                              }
                            } else {
                              this.b(((vg) this).field_i.length(), -6331);
                              return true;
                            }
                          } else {
                            this.b(0, -6331);
                            return true;
                          }
                        } else {
                          if (((vg) this).field_K < ((vg) this).field_i.length()) {
                            L11: {
                              stackOut_26_0 = this;
                              stackIn_28_0 = stackOut_26_0;
                              stackIn_27_0 = stackOut_26_0;
                              if (!fh.field_d[82]) {
                                stackOut_28_0 = this;
                                stackOut_28_1 = 1 + ((vg) this).field_K;
                                stackIn_29_0 = stackOut_28_0;
                                stackIn_29_1 = stackOut_28_1;
                                break L11;
                              } else {
                                stackOut_27_0 = this;
                                stackOut_27_1 = this.k(11365);
                                stackIn_29_0 = stackOut_27_0;
                                stackIn_29_1 = stackOut_27_1;
                                break L11;
                              }
                            }
                            this.b(stackIn_29_1, -6331);
                            return true;
                          } else {
                            var5 = -50 % ((31 - param1) / 56);
                            return false;
                          }
                        }
                      }
                    } else {
                      ((vg) this).l(-115);
                      return true;
                    }
                  } else {
                    if (((vg) this).field_K == ((vg) this).field_O) {
                      if (((vg) this).field_K >= ((vg) this).field_i.length()) {
                        var5 = -50 % ((31 - param1) / 56);
                        return false;
                      } else {
                        ((vg) this).field_O = ((vg) this).field_K + 1;
                        this.p(11002);
                        return true;
                      }
                    } else {
                      this.p(11002);
                      return true;
                    }
                  }
                } else {
                  if (((vg) this).field_O == ((vg) this).field_K) {
                    if (0 < ((vg) this).field_K) {
                      ((vg) this).field_O = ((vg) this).field_K + -1;
                      this.p(11002);
                      return true;
                    } else {
                      var5 = -50 % ((31 - param1) / 56);
                      return false;
                    }
                  } else {
                    this.p(11002);
                    return true;
                  }
                }
              }
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    public static void i(int param0) {
        field_I = null;
        if (param0 <= 96) {
            return;
        }
        field_J = null;
    }

    private final void p(int param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (((vg) this).field_O == ((vg) this).field_K) {
            break L0;
          } else {
            L1: {
              if (((vg) this).field_K <= ((vg) this).field_O) {
                stackOut_3_0 = ((vg) this).field_K;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = ((vg) this).field_O;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var2 = stackIn_4_0;
              if (((vg) this).field_O < ((vg) this).field_K) {
                stackOut_6_0 = ((vg) this).field_K;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_5_0 = ((vg) this).field_O;
                stackIn_7_0 = stackOut_5_0;
                break L2;
              }
            }
            var3 = stackIn_7_0;
            ((vg) this).field_O = var2;
            ((vg) this).field_K = var2;
            ((vg) this).field_i = ((vg) this).field_i.substring(0, var2) + ((vg) this).field_i.substring(var3, ((vg) this).field_i.length());
            ((vg) this).j(-125);
            break L0;
          }
        }
        if (param0 != 11002) {
          this.b(-118, 85);
          return;
        } else {
          return;
        }
    }

    private final void a(int param0, String param1) {
        int var3 = 0;
        L0: {
          if ((((vg) this).field_Q ^ -1) != 0) {
            var3 = ((vg) this).field_Q + -((vg) this).field_i.length();
            if (0 > var3) {
              param1 = param1.substring(0, var3);
              break L0;
            } else {
              return;
            }
          } else {
            break L0;
          }
        }
        if (((vg) this).field_K == ((vg) this).field_i.length()) {
          ((vg) this).field_i = ((vg) this).field_i + param1;
          var3 = 81 / ((param0 - -40) / 63);
          ((vg) this).field_K = ((vg) this).field_K + param1.length();
          ((vg) this).field_O = ((vg) this).field_K;
          ((vg) this).j(-114);
          return;
        } else {
          ((vg) this).field_i = ((vg) this).field_i.substring(0, ((vg) this).field_K) + param1 + ((vg) this).field_i.substring(((vg) this).field_K, ((vg) this).field_i.length());
          var3 = 81 / ((param0 - -40) / 63);
          ((vg) this).field_K = ((vg) this).field_K + param1.length();
          ((vg) this).field_O = ((vg) this).field_K;
          ((vg) this).j(-114);
          return;
        }
    }

    final static void a(int param0, ob param1, int param2) {
        jd var3 = null;
        int var4 = 0;
        jd var5 = null;
        var5 = id.field_c;
        var3 = var5;
        var5.e(param0, -2147483648);
        var5.field_m = var5.field_m + 1;
        var4 = var5.field_m;
        var5.c(-104, 1);
        if (null == param1.field_k) {
          var5.c(126, 0);
          int discarded$4 = var5.b(true, var4);
          var5.field_m = var5.field_m - 4;
          if (param2 < 113) {
            return;
          } else {
            param1.field_i = var5.e(true);
            var5.b(1, -var4 + var5.field_m);
            return;
          }
        } else {
          var5.c(-126, param1.field_k.length);
          var5.a(8, param1.field_k.length, param1.field_k, 0);
          int discarded$5 = var5.b(true, var4);
          var5.field_m = var5.field_m - 4;
          if (param2 < 113) {
            return;
          } else {
            param1.field_i = var5.e(true);
            var5.b(1, -var4 + var5.field_m);
            return;
          }
        }
    }

    vg(String param0, dg param1, int param2) {
        super(param0, param1);
        ((vg) this).field_R = -1;
        ((vg) this).field_U = false;
        ((vg) this).field_T = 0L;
        ((vg) this).field_Q = param2;
        ((vg) this).field_w = ph.field_f.field_h;
        ((vg) this).a(-90, true, param0);
        ((vg) this).field_S = true;
        ((vg) this).field_V = je.a(1);
    }

    final boolean a(int param0, int param1, boolean param2, int param3, int param4, int param5, rc param6) {
        int var8_int = 0;
        long var8 = 0L;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_7_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        if (super.a(param0, param1, param2, param3, param4, param5, param6)) {
          if (((vg) this).field_w instanceof eg) {
            L0: {
              var8_int = ((eg) (Object) ((vg) this).field_w).a((rc) this, 0, gb.field_j, ad.field_m, param5, param1);
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (-1 != var8_int) {
                stackOut_6_0 = this;
                stackOut_6_1 = var8_int;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L0;
              } else {
                stackOut_5_0 = this;
                stackOut_5_1 = 0;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L0;
              }
            }
            L1: {
              this.b(stackIn_7_1, -6331);
              var8 = je.a(1);
              stackOut_7_0 = this;
              stackIn_9_0 = stackOut_7_0;
              stackIn_8_0 = stackOut_7_0;
              if (-((vg) this).field_T + var8 >= 250L) {
                stackOut_9_0 = this;
                stackOut_9_1 = 0;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                break L1;
              } else {
                stackOut_8_0 = this;
                stackOut_8_1 = 1;
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                break L1;
              }
            }
            ((vg) this).field_U = stackIn_10_1 != 0;
            if (((vg) this).field_U) {
              ((vg) this).field_O = this.n(126);
              ((vg) this).field_K = this.k(11365);
              if (-1 > (((vg) this).field_K ^ -1)) {
                if (((vg) this).field_i.charAt(((vg) this).field_K - 1) == 32) {
                  ((vg) this).field_K = ((vg) this).field_K - 1;
                  ((vg) this).field_R = ((vg) this).field_K;
                  ((vg) this).field_T = var8;
                  return true;
                } else {
                  ((vg) this).field_R = ((vg) this).field_K;
                  ((vg) this).field_T = var8;
                  return true;
                }
              } else {
                ((vg) this).field_R = ((vg) this).field_K;
                ((vg) this).field_T = var8;
                return true;
              }
            } else {
              ((vg) this).field_T = var8;
              return true;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    private final void m(int param0) {
        this.o(-1);
        int var2 = 123 % ((50 - param0) / 42);
        this.p(11002);
    }

    private final void b(int param0, int param1) {
        ((vg) this).field_K = param0;
        if (fh.field_d[81]) {
          if (param1 != -6331) {
            this.c(false);
            return;
          } else {
            return;
          }
        } else {
          ((vg) this).field_O = ((vg) this).field_K;
          if (param1 == -6331) {
            return;
          } else {
            this.c(false);
            return;
          }
        }
    }

    private final void e(byte param0) {
        try {
            String var2 = null;
            Exception var2_ref = null;
            Throwable decompiledCaughtException = null;
            try {
              var2 = (String) java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor);
              if (param0 == -78) {
                this.p(11002);
                this.a(-107, var2);
              } else {
                return;
              }
            } catch (java.lang.Exception decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
            }
            var2_ref = (Exception) (Object) decompiledCaughtException;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final int k(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = SolKnight.field_L ? 1 : 0;
        if (param0 == 11365) {
          var2 = ((vg) this).field_i.length();
          if (((vg) this).field_K == var2) {
            return ((vg) this).field_K;
          } else {
            var3 = ((vg) this).field_K + 1;
            L0: while (true) {
              if (var2 > var3) {
                if (((vg) this).field_i.charAt(-1 + var3) != 32) {
                  var3++;
                  continue L0;
                } else {
                  return var3;
                }
              } else {
                return var3;
              }
            }
          }
        } else {
          field_I = null;
          var2 = ((vg) this).field_i.length();
          if (((vg) this).field_K == var2) {
            return ((vg) this).field_K;
          } else {
            var3 = ((vg) this).field_K + 1;
            L1: while (true) {
              if (var2 > var3) {
                if (((vg) this).field_i.charAt(-1 + var3) != 32) {
                  var3++;
                  continue L1;
                } else {
                  return var3;
                }
              } else {
                return var3;
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_M = 200;
    }
}
