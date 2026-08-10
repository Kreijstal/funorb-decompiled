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
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
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
        long var6;
        eg var8;
        if (null != this.field_w) {
          if (0 == param1) {
            this.field_w.a((byte) 126, param0, this.field_B, param2, (rc) (this));
            if (this.field_w instanceof eg) {
              var8 = (eg) ((Object) this.field_w);
              if (this.field_O == this.field_K) {
                var6 = je.a(param3 + 1);
                if (500L <= (-this.field_V + var6) % 1000L) {
                  if (param3 != 0) {
                    this.field_U = false;
                    return;
                  } else {
                    return;
                  }
                } else {
                  var8.a(this.field_K, param0, 1, (rc) (this), param2);
                  if (param3 != 0) {
                    this.field_U = false;
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                var8.a(this.field_O, (rc) (this), this.field_K, 114, param0, param2);
                var6 = je.a(param3 + 1);
                if (500L <= (-this.field_V + var6) % 1000L) {
                  if (param3 != 0) {
                    this.field_U = false;
                    return;
                  } else {
                    return;
                  }
                } else {
                  var8.a(this.field_K, param0, 1, (rc) (this), param2);
                  if (param3 == 0) {
                    return;
                  } else {
                    this.field_U = false;
                    return;
                  }
                }
              }
            } else {
              if (param3 != 0) {
                this.field_U = false;
                return;
              } else {
                return;
              }
            }
          } else {
            if (param3 != 0) {
              this.field_U = false;
              return;
            } else {
              return;
            }
          }
        } else {
          if (param3 != 0) {
            this.field_U = false;
            return;
          } else {
            return;
          }
        }
    }

    void j(int param0) {
        int var2;
        var2 = -18 % ((param0 - -67) / 44);
        if (this.field_n instanceof pi) {
          ((pi) ((Object) this.field_n)).a((vg) (this), (byte) -79);
          return;
        } else {
          return;
        }
    }

    final void a(int param0, boolean param1, String param2) {
        int dupTemp$1 = 0;
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              if (param2 == null) {
                param2 = "";
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var4_int = 60 / ((param0 - -30) / 60);
              this.field_i = param2;
              var5 = param2.length();
              if ((this.field_Q ^ -1) == 0) {
                break L2;
              } else {
                if (var5 > this.field_Q) {
                  this.field_i = this.field_i.substring(0, this.field_Q);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              dupTemp$1 = this.field_i.length();
              this.field_O = dupTemp$1;
              this.field_K = dupTemp$1;
              if (param1) {
                break L3;
              } else {
                this.j(30);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var4);

            stackIn_12_1 = new StringBuilder().append("vg.G(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
    }

    private final String q(int param0) {
        int var2;
        int var3;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        L0: {
          if (this.field_K <= this.field_O) {
            stackIn_3_0 = this.field_K;
            break L0;
          } else {
            stackIn_3_0 = this.field_O;
            break L0;
          }
        }
        L1: {
          var2 = stackIn_3_0;
          if (this.field_K > this.field_O) {
            stackIn_6_0 = this.field_K;
            break L1;
          } else {
            stackIn_6_0 = this.field_O;
            break L1;
          }
        }
        var3 = stackIn_6_0;
        if (param0 != -33) {
          return (String) null;
        } else {
          return this.field_i.substring(var2, var3);
        }
    }

    final void l(int param0) {
        this.field_K = 0;
        this.field_O = 0;
        this.field_i = "";
        if (param0 >= -79) {
          this.j(-49);
          this.j(-124);
          return;
        } else {
          this.j(-124);
          return;
        }
    }

    private final int n(int param0) {
        int var2;
        int var3;
        var3 = SolKnight.field_L ? 1 : 0;
        if (param0 >= 110) {
          if (-1 != (this.field_K ^ -1)) {
            var2 = this.field_K - 1;
            L0: while (true) {
              if (var2 > 0) {
                if (this.field_i.charAt(-1 + var2) != 32) {
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
            return this.field_K;
          }
        } else {
          this.j(14);
          if (-1 != (this.field_K ^ -1)) {
            var2 = this.field_K - 1;
            L1: while (true) {
              if (var2 > 0) {
                if (this.field_i.charAt(-1 + var2) != 32) {
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
            return this.field_K;
          }
        }
    }

    private final void c(boolean param0) {
        if (param0) {
          if (this.field_n instanceof pi) {
            ((pi) ((Object) this.field_n)).a((vg) (this), true);
            return;
          } else {
            return;
          }
        } else {
          field_N = -95;
          if (!(this.field_n instanceof pi)) {
            return;
          } else {
            ((pi) ((Object) this.field_n)).a((vg) (this), true);
            return;
          }
        }
    }

    private final void o(int param0) {
        String var2 = this.q(-33);
        if (!(param0 <= (var2.length() ^ -1))) {
            java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.q(-33))), (java.awt.datatransfer.ClipboardOwner) null);
        }
    }

    void a(int param0, int param1, int param2, rc param3) {
        eg var5 = null;
        int var6 = 0;
        super.a(param0, param1 + 0, param2, param3);
        if (param1 != 18874) {
            return;
        }
        try {
            this.d((byte) -119);
            if (1 == this.field_u) {
                if (this.field_w instanceof eg) {
                    var5 = (eg) ((Object) this.field_w);
                    var6 = var5.a((rc) (this), 0, gb.field_j, ad.field_m, param2, param0);
                    if (!(-1 == var6)) {
                        if (this.field_U && var6 < this.field_R && var6 > this.field_O) {
                            var6 = this.field_R;
                        }
                        this.field_K = var6;
                    }
                }
                this.field_V = je.a(param1 ^ 18875);
            }
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "vg.JA(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
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
        jf var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        eg var10;
        var9 = SolKnight.field_L ? 1 : 0;
        if (!this.field_S) {
          this.field_q = 0;
          this.field_k = 0;
          return;
        } else {
          if (this.field_w instanceof eg) {
            var10 = (eg) ((Object) this.field_w);
            var3 = var10.a(-21480, (rc) (this));
            var6 = -33 % ((-72 - param0) / 42);
            var4 = var3.b(62);
            var5 = var10.b(265, (rc) (this));
            var7 = var10.a(3) >> -1457463263;
            if (-var7 + var5 > var4) {
              this.field_q = 0;
              this.field_k = 0;
              return;
            } else {
              var8 = this.field_k - -var3.a(0, this.field_K);
              if (-var7 + var5 >= var8) {
                if (var7 <= var8) {
                  if (-1 <= (this.field_k ^ -1)) {
                    if (this.field_k >= -var5 + var7) {
                      return;
                    } else {
                      this.field_k = var7 + -var5;
                      return;
                    }
                  } else {
                    this.field_k = 0;
                    return;
                  }
                } else {
                  this.field_k = var7 - var8 + this.field_k;
                  if (-1 <= (this.field_k ^ -1)) {
                    if (this.field_k >= -var5 + var7) {
                      return;
                    } else {
                      this.field_k = var7 + -var5;
                      return;
                    }
                  } else {
                    this.field_k = 0;
                    return;
                  }
                }
              } else {
                this.field_k = this.field_k - (var8 + var7 + -var5);
                if (-1 <= (this.field_k ^ -1)) {
                  if (this.field_k >= -var5 + var7) {
                    return;
                  } else {
                    this.field_k = var7 + -var5;
                    return;
                  }
                } else {
                  this.field_k = 0;
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
        int dupTemp$0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_26_0 = 0;
        Object stackIn_32_0 = null;
        Object stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        int stackIn_34_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_56_0 = 0;
        Object stackIn_60_0 = null;
        Object stackIn_61_0 = null;
        int stackIn_61_1 = 0;
        int stackIn_62_0 = 0;
        int stackIn_73_0 = 0;
        int stackIn_75_0 = 0;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_79_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        try {
          L0: {
            this.field_V = je.a(1);
            if (60 == param0) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param0 != 62) {
                L1: {
                  if (param0 < 32) {
                    break L1;
                  } else {
                    if (param0 <= 126) {
                      L2: {
                        if (this.field_O == this.field_K) {
                          break L2;
                        } else {
                          this.p(11002);
                          break L2;
                        }
                      }
                      L3: {
                        L4: {
                          if (-1 == this.field_Q) {
                            break L4;
                          } else {
                            if (this.field_i.length() >= this.field_Q) {
                              break L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                        L5: {
                          if (this.field_K >= this.field_i.length()) {
                            this.field_i = this.field_i + param0;
                            dupTemp$0 = this.field_i.length();
                            this.field_K = dupTemp$0;
                            this.field_O = dupTemp$0;
                            break L5;
                          } else {
                            this.field_i = this.field_i.substring(0, this.field_K) + param0 + this.field_i.substring(this.field_K, this.field_i.length());
                            this.field_K = this.field_K + 1;
                            this.field_O = this.field_K;
                            break L5;
                          }
                        }
                        this.j(111);
                        break L3;
                      }
                      stackIn_73_0 = 1;
                      decompiledRegionSelector0 = 14;
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
                L6: {
                  if (85 != param2) {
                    if (param2 != 101) {
                      if (param2 != 13) {
                        if (param2 == 96) {
                          if (0 >= this.field_K) {
                            break L6;
                          } else {
                            L7: {
                              stackIn_60_0 = this;

                              if (!fh.field_d[82]) {
                                stackIn_61_0 = this;
                                stackIn_61_1 = this.field_K - 1;
                                break L7;
                              } else {
                                stackIn_61_0 = this;
                                stackIn_61_1 = this.n(117);
                                break L7;
                              }
                            }
                            this.b(stackIn_61_1, -6331);
                            stackIn_62_0 = 1;
                            decompiledRegionSelector0 = 13;
                            break L0;
                          }
                        } else {
                          if (-98 != (param2 ^ -1)) {
                            if ((param2 ^ -1) == -103) {
                              this.b(0, -6331);
                              stackIn_56_0 = 1;
                              decompiledRegionSelector0 = 12;
                              break L0;
                            } else {
                              if (103 == param2) {
                                this.b(this.field_i.length(), -6331);
                                stackIn_54_0 = 1;
                                decompiledRegionSelector0 = 11;
                                break L0;
                              } else {
                                if (-85 == (param2 ^ -1)) {
                                  this.c(true);
                                  stackIn_52_0 = 1;
                                  decompiledRegionSelector0 = 10;
                                  break L0;
                                } else {
                                  L8: {
                                    if (!fh.field_d[82]) {
                                      break L8;
                                    } else {
                                      if (-66 == (param2 ^ -1)) {
                                        this.m(108);
                                        stackIn_50_0 = 1;
                                        decompiledRegionSelector0 = 9;
                                        break L0;
                                      } else {
                                        break L8;
                                      }
                                    }
                                  }
                                  L9: {
                                    if (!fh.field_d[82]) {
                                      break L9;
                                    } else {
                                      if (param2 != 66) {
                                        break L9;
                                      } else {
                                        this.o(-1);
                                        stackIn_44_0 = 1;
                                        decompiledRegionSelector0 = 7;
                                        break L0;
                                      }
                                    }
                                  }
                                  if (!fh.field_d[82]) {
                                    break L6;
                                  } else {
                                    if ((param2 ^ -1) != -68) {
                                      break L6;
                                    } else {
                                      this.e((byte) -78);
                                      stackIn_48_0 = 1;
                                      decompiledRegionSelector0 = 8;
                                      break L0;
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            if (this.field_K >= this.field_i.length()) {
                              break L6;
                            } else {
                              L10: {
                                stackIn_32_0 = this;

                                if (!fh.field_d[82]) {
                                  stackIn_33_0 = this;
                                  stackIn_33_1 = 1 + this.field_K;
                                  break L10;
                                } else {
                                  stackIn_33_0 = this;
                                  stackIn_33_1 = this.k(11365);
                                  break L10;
                                }
                              }
                              this.b(stackIn_33_1, -6331);
                              stackIn_34_0 = 1;
                              decompiledRegionSelector0 = 6;
                              break L0;
                            }
                          }
                        }
                      } else {
                        this.l(-115);
                        stackIn_26_0 = 1;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      }
                    } else {
                      if (this.field_K == this.field_O) {
                        if (this.field_K < this.field_i.length()) {
                          this.field_O = this.field_K + 1;
                          this.p(11002);
                          stackIn_23_0 = 1;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        } else {
                          break L6;
                        }
                      } else {
                        this.p(11002);
                        stackIn_19_0 = 1;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      }
                    }
                  } else {
                    if (this.field_O == this.field_K) {
                      if (0 < this.field_K) {
                        this.field_O = this.field_K + -1;
                        this.p(11002);
                        stackIn_15_0 = 1;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        break L6;
                      }
                    } else {
                      this.p(11002);
                      stackIn_11_0 = 1;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                }
                var5_int = -50 % ((31 - param1) / 56);
                stackIn_75_0 = 0;
                decompiledRegionSelector0 = 15;
                break L0;
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var5 = decompiledCaughtException;
            stackIn_78_0 = (RuntimeException) (var5);

            stackIn_78_1 = new StringBuilder().append("vg.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_79_0 = (RuntimeException) ((Object) stackIn_78_0);
              stackIn_79_1 = (StringBuilder) ((Object) stackIn_78_1);
              stackIn_79_2 = "null";
              break L11;
            } else {
              stackIn_79_0 = (RuntimeException) ((Object) stackIn_78_0);
              stackIn_79_1 = (StringBuilder) ((Object) stackIn_78_1);
              stackIn_79_2 = "{...}";
              break L11;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_79_0), stackIn_79_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_15_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_19_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_23_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_26_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_34_0 != 0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_44_0 != 0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_48_0 != 0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_50_0 != 0;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return stackIn_52_0 != 0;
                            } else {
                              if (decompiledRegionSelector0 == 11) {
                                return stackIn_54_0 != 0;
                              } else {
                                if (decompiledRegionSelector0 == 12) {
                                  return stackIn_56_0 != 0;
                                } else {
                                  if (decompiledRegionSelector0 == 13) {
                                    return stackIn_62_0 != 0;
                                  } else {
                                    if (decompiledRegionSelector0 == 14) {
                                      return stackIn_73_0 != 0;
                                    } else {
                                      return stackIn_75_0 != 0;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
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
        int var2;
        int var3;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        L0: {
          if (this.field_O == this.field_K) {
            break L0;
          } else {
            L1: {
              if (this.field_K <= this.field_O) {
                stackIn_4_0 = this.field_K;
                break L1;
              } else {
                stackIn_4_0 = this.field_O;
                break L1;
              }
            }
            L2: {
              var2 = stackIn_4_0;
              if (this.field_O < this.field_K) {
                stackIn_7_0 = this.field_K;
                break L2;
              } else {
                stackIn_7_0 = this.field_O;
                break L2;
              }
            }
            var3 = stackIn_7_0;
            this.field_O = var2;
            this.field_K = var2;
            this.field_i = this.field_i.substring(0, var2) + this.field_i.substring(var3, this.field_i.length());
            this.j(-125);
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
        int var3_int = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if ((this.field_Q ^ -1) != 0) {
                var3_int = this.field_Q + -this.field_i.length();
                if (0 > var3_int) {
                  param1 = param1.substring(0, var3_int);
                  break L1;
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                break L1;
              }
            }
            L2: {
              if (this.field_K != this.field_i.length()) {
                this.field_i = this.field_i.substring(0, this.field_K) + param1 + this.field_i.substring(this.field_K, this.field_i.length());
                break L2;
              } else {
                this.field_i = this.field_i + param1;
                break L2;
              }
            }
            var3_int = 81 / ((param0 - -40) / 63);
            this.field_K = this.field_K + param1.length();
            this.field_O = this.field_K;
            this.j(-114);
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3);

            stackIn_12_1 = new StringBuilder().append("vg.L(").append(param0).append(',');

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
          throw fc.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, ob param1, int param2) {
        jd var5 = id.field_c;
        jd var3 = var5;
        var5.e(param0, -2147483648);
        var5.field_m = var5.field_m + 1;
        int var4 = var5.field_m;
        var5.c(-104, 1);
        if (null != param1.field_k) {
            var5.c(-126, param1.field_k.length);
            var5.a(8, param1.field_k.length, param1.field_k, 0);
        } else {
            var5.c(126, 0);
        }
        var5.b(true, var4);
        var5.field_m = var5.field_m - 4;
        if (param2 < 113) {
            return;
        }
        try {
            param1.field_i = var5.e(true);
            var5.b(1, -var4 + var5.field_m);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "vg.R(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    vg(String param0, dg param1, int param2) {
        super(param0, param1);
        this.field_R = -1;
        this.field_U = false;
        this.field_T = 0L;
        try {
            this.field_Q = param2;
            this.field_w = ph.field_f.field_h;
            this.a(-90, true, param0);
            this.field_S = true;
            this.field_V = je.a(1);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "vg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final boolean a(int param0, int param1, boolean param2, int param3, int param4, int param5, rc param6) {
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        long var8_long = 0L;
        RuntimeException var8 = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3, param4, param5, param6)) {
              if (this.field_w instanceof eg) {
                L1: {
                  var8_int = ((eg) ((Object) this.field_w)).a((rc) (this), 0, gb.field_j, ad.field_m, param5, param1);
                  stackIn_6_0 = this;

                  if (-1 != var8_int) {
                    stackIn_7_0 = this;
                    stackIn_7_1 = var8_int;
                    break L1;
                  } else {
                    stackIn_7_0 = this;
                    stackIn_7_1 = 0;
                    break L1;
                  }
                }
                L2: {
                  this.b(stackIn_7_1, -6331);
                  var8_long = je.a(1);
                  stackIn_9_0 = this;

                  if (-this.field_T + var8_long >= 250L) {
                    stackIn_10_0 = this;
                    stackIn_10_1 = 0;
                    break L2;
                  } else {
                    stackIn_10_0 = this;
                    stackIn_10_1 = 1;
                    break L2;
                  }
                }
                L3: {
                  ((vg) (this)).field_U = stackIn_10_1 != 0;
                  if (this.field_U) {
                    L4: {
                      this.field_O = this.n(126);
                      this.field_K = this.k(11365);
                      if (-1 <= (this.field_K ^ -1)) {
                        break L4;
                      } else {
                        if (this.field_i.charAt(this.field_K - 1) != 32) {
                          break L4;
                        } else {
                          this.field_K = this.field_K - 1;
                          break L4;
                        }
                      }
                    }
                    this.field_R = this.field_K;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                this.field_T = var8_long;
                stackIn_17_0 = 1;
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                stackIn_19_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var8);

            stackIn_22_1 = new StringBuilder().append("vg.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L5;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L5;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_17_0 != 0;
        } else {
          return stackIn_19_0 != 0;
        }
    }

    private final void m(int param0) {
        this.o(-1);
        int var2 = 123 % ((50 - param0) / 42);
        this.p(11002);
    }

    private final void b(int param0, int param1) {
        this.field_K = param0;
        if (fh.field_d[81]) {
          if (param1 != -6331) {
            this.c(false);
            return;
          } else {
            return;
          }
        } else {
          this.field_O = this.field_K;
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
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            String var2 = null;
            Exception var2_ref = null;
            try {
              L0: {
                var2 = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
                if (param0 == -78) {
                  this.p(11002);
                  this.a(-107, var2);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L1: {
                var2_ref = (Exception) (Object) decompiledCaughtException;
                decompiledRegionSelector0 = 1;
                break L1;
              }
            }
            if (decompiledRegionSelector0 == 0) {
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final int k(int param0) {
        int var2;
        int var3;
        int var4;
        var4 = SolKnight.field_L ? 1 : 0;
        if (param0 == 11365) {
          var2 = this.field_i.length();
          if (this.field_K == var2) {
            return this.field_K;
          } else {
            var3 = this.field_K + 1;
            L0: while (true) {
              if (var2 > var3) {
                if (this.field_i.charAt(-1 + var3) != 32) {
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
          field_I = (int[]) null;
          var2 = this.field_i.length();
          if (this.field_K == var2) {
            return this.field_K;
          } else {
            var3 = this.field_K + 1;
            L1: while (true) {
              if (var2 > var3) {
                if (this.field_i.charAt(-1 + var3) != 32) {
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
        field_M = 200;
    }
}
