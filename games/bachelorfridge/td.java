/*
 * Decompiled by CFR-JS 0.4.0.
 */
class td extends sfa {
    private boolean field_m;
    static String field_l;
    static pna field_o;
    nq field_j;
    int field_k;
    int field_i;
    int field_n;

    public static void b(boolean param0) {
        byte[] discarded$0 = null;
        field_l = null;
        field_o = null;
        if (param0) {
            byte[] var2 = (byte[]) null;
            discarded$0 = td.a(-123, (byte[]) null);
        }
    }

    final void a(int param0, lu param1) {
        try {
            if (this.a(-4)) {
                er.a(this.field_j, 111, param1);
            } else {
                param1.d(this.field_k, 0);
                param1.d(this.field_n, 0);
            }
            param1.d(this.field_i, 0);
            param1.d(!this.field_m ? 0 : 1, 0);
            int var3_int = 71 % ((61 - param0) / 53);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "td.J(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    td(int param0, aga param1) {
        super(4, param0, new nq(param1));
    }

    final static byte[] a(int param0, byte[] param1) {
        int discarded$1 = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        byte[] var5_ref_byte__ = null;
        byte[] var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        lu var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] stackIn_2_0 = null;
        byte[] stackIn_10_0 = null;
        byte[] stackIn_24_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        byte[] stackOut_23_0 = null;
        byte[] stackOut_9_0 = null;
        byte[] stackOut_1_0 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        try {
          L0: {
            if (param0 < -46) {
              L1: {
                var9 = new lu(param1);
                var3 = var9.b(16711935);
                var4 = var9.f(-52);
                if ((var4 ^ -1) > -1) {
                  break L1;
                } else {
                  L2: {
                    if (0 == kq.field_k) {
                      break L2;
                    } else {
                      if (var4 > kq.field_k) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  if (var3 != 0) {
                    L3: {
                      var5 = var9.f(-128);
                      if (-1 < (var5 ^ -1)) {
                        break L3;
                      } else {
                        L4: {
                          if (0 == kq.field_k) {
                            break L4;
                          } else {
                            if (kq.field_k < var5) {
                              break L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                        L5: {
                          var13 = new byte[var5];
                          var11 = var13;
                          var6 = var11;
                          if (1 == var3) {
                            discarded$1 = pca.a(var13, var5, param1, var4, 9);
                            break L5;
                          } else {
                            var7 = kca.field_b;
                            synchronized (var7) {
                              L6: {
                                kca.field_b.a(var9, var13, -10);
                                break L6;
                              }
                            }
                            break L5;
                          }
                        }
                        stackOut_23_0 = (byte[]) (var6);
                        stackIn_24_0 = stackOut_23_0;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      }
                    }
                    throw new RuntimeException();
                  } else {
                    var12 = new byte[var4];
                    var10 = var12;
                    var5_ref_byte__ = var10;
                    var9.a(var12, var4, 128, 0);
                    stackOut_9_0 = (byte[]) (var5_ref_byte__);
                    stackIn_10_0 = stackOut_9_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              throw new RuntimeException();
            } else {
              stackOut_1_0 = (byte[]) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) (var2);
            stackOut_25_1 = new StringBuilder().append("td.G(").append(param0).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param1 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L7;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L7;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            return stackIn_24_0;
          }
        }
    }

    private final boolean a(int param0) {
        ii discarded$0 = null;
        if (param0 != -4) {
            op var3 = (op) null;
            discarded$0 = this.a((op) null, 56);
        }
        hd var2 = (hd) ((Object) ur.field_e[this.field_g]);
        return -4 == (var2.c(0) ^ -1) ? true : false;
    }

    td(int param0, aga param1, boolean param2) {
        super(4, param0, new nq(param1));
        try {
            this.field_m = param2 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "td.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    ii a(op param0, int param1) {
        Object var3 = null;
        int var4_int = 0;
        ii var4 = null;
        int var5 = 0;
        ii stackIn_132_0 = null;
        Object stackIn_135_0 = null;
        StringBuilder stackIn_135_1 = null;
        Object stackIn_136_0 = null;
        StringBuilder stackIn_136_1 = null;
        Object stackIn_137_0 = null;
        StringBuilder stackIn_137_1 = null;
        String stackIn_137_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        ii stackOut_131_0 = null;
        Object stackOut_134_0 = null;
        StringBuilder stackOut_134_1 = null;
        Object stackOut_136_0 = null;
        StringBuilder stackOut_136_1 = null;
        String stackOut_136_2 = null;
        Object stackOut_135_0 = null;
        StringBuilder stackOut_135_1 = null;
        String stackOut_135_2 = null;
        var5 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var3 = null;
              var4_int = this.field_g;
              if (88 != var4_int) {
                if (89 == var4_int) {
                  var3 = new tg(this.field_g, this.field_h.a(param1 ^ 63, param0));
                  break L1;
                } else {
                  if (90 == var4_int) {
                    var3 = new sw(this.field_g, this.field_h.a(8, param0), this.field_i);
                    break L1;
                  } else {
                    if (91 == var4_int) {
                      var3 = new fla(this.field_g, this.field_h.a(38, param0));
                      break L1;
                    } else {
                      if (92 != var4_int) {
                        if (-94 == (var4_int ^ -1)) {
                          var3 = new io(this.field_g, this.field_h.a(param1 + 36, param0), this.field_j);
                          break L1;
                        } else {
                          if (-95 == (var4_int ^ -1)) {
                            var3 = new ifa(this.field_g, this.field_h.a(62, param0));
                            break L1;
                          } else {
                            if ((var4_int ^ -1) == -96) {
                              var3 = new s(this.field_g, this.field_h.a(param1 ^ 50, param0));
                              break L1;
                            } else {
                              if (var4_int != 96) {
                                if (var4_int == 97) {
                                  var3 = new h(this.field_g, this.field_h.a(103, param0));
                                  break L1;
                                } else {
                                  if (var4_int == 98) {
                                    var3 = new tha(this.field_g, this.field_h.a(20, param0));
                                    break L1;
                                  } else {
                                    if (var4_int == 99) {
                                      var3 = new of(this.field_g, this.field_h.a(40, param0));
                                      break L1;
                                    } else {
                                      if (var4_int == 100) {
                                        var3 = new eha(this.field_g, this.field_h.a(85, param0), this.field_k, this.field_n);
                                        break L1;
                                      } else {
                                        if (var4_int == 101) {
                                          var3 = new nh(this.field_g, this.field_h.a(27, param0));
                                          break L1;
                                        } else {
                                          if (var4_int != 102) {
                                            if (var4_int != 103) {
                                              if ((var4_int ^ -1) != -105) {
                                                if (-106 == (var4_int ^ -1)) {
                                                  var3 = new ui(this.field_g, this.field_h.a(param1 + 65, param0));
                                                  break L1;
                                                } else {
                                                  if (-107 != (var4_int ^ -1)) {
                                                    if (107 == var4_int) {
                                                      var3 = new vfa(this.field_g, this.field_h.a(21, param0), this.field_k, this.field_n);
                                                      break L1;
                                                    } else {
                                                      if (-109 != (var4_int ^ -1)) {
                                                        if (109 == var4_int) {
                                                          var3 = new eb(this.field_g, this.field_h.a(112, param0), this.field_k, this.field_n);
                                                          break L1;
                                                        } else {
                                                          if (-111 == (var4_int ^ -1)) {
                                                            var3 = new mp(this.field_g, this.field_h.a(53, param0));
                                                            break L1;
                                                          } else {
                                                            if (-112 != (var4_int ^ -1)) {
                                                              if ((var4_int ^ -1) != -113) {
                                                                if (var4_int != 113) {
                                                                  if ((var4_int ^ -1) != -115) {
                                                                    if (-116 == (var4_int ^ -1)) {
                                                                      var3 = new ab(this.field_g, this.field_h.a(112, param0), this.field_j);
                                                                      break L1;
                                                                    } else {
                                                                      if (116 != var4_int) {
                                                                        if ((var4_int ^ -1) != -118) {
                                                                          if ((var4_int ^ -1) != -119) {
                                                                            if (-120 != (var4_int ^ -1)) {
                                                                              if (var4_int != 120) {
                                                                                if ((var4_int ^ -1) == -122) {
                                                                                  var3 = new gh(this.field_g, this.field_h.a(51, param0));
                                                                                  break L1;
                                                                                } else {
                                                                                  if (122 != var4_int) {
                                                                                    if (-124 == (var4_int ^ -1)) {
                                                                                      var3 = new hj(this.field_g, this.field_h.a(param1 + 25, param0));
                                                                                      break L1;
                                                                                    } else {
                                                                                      if (124 != var4_int) {
                                                                                        if (var4_int != 125) {
                                                                                          if ((var4_int ^ -1) != -127) {
                                                                                            if ((var4_int ^ -1) == -128) {
                                                                                              var3 = new ch(this.field_g, this.field_h.a(param1 ^ 127, param0));
                                                                                              break L1;
                                                                                            } else {
                                                                                              if (-129 == (var4_int ^ -1)) {
                                                                                                var3 = new ja(this.field_g, this.field_h.a(param1 + 60, param0));
                                                                                                break L1;
                                                                                              } else {
                                                                                                if ((var4_int ^ -1) != -130) {
                                                                                                  if (-131 == (var4_int ^ -1)) {
                                                                                                    var3 = new uba(this.field_g, this.field_h.a(107, param0), this.field_k, this.field_n);
                                                                                                    break L1;
                                                                                                  } else {
                                                                                                    if (var4_int == 131) {
                                                                                                      var3 = new kea(this.field_g, this.field_h.a(param1 ^ 123, param0), this.field_k, this.field_n);
                                                                                                      break L1;
                                                                                                    } else {
                                                                                                      if (-133 != (var4_int ^ -1)) {
                                                                                                        if (133 != var4_int) {
                                                                                                          if (-135 == (var4_int ^ -1)) {
                                                                                                            var3 = new wh(this.field_g, this.field_h.a(58, param0));
                                                                                                            break L1;
                                                                                                          } else {
                                                                                                            if (135 != var4_int) {
                                                                                                              if ((var4_int ^ -1) == -137) {
                                                                                                                var3 = new vka(this.field_g, this.field_h.a(109, param0), this.field_k, this.field_n);
                                                                                                                break L1;
                                                                                                              } else {
                                                                                                                if (var4_int == 137) {
                                                                                                                  var3 = new qga(this.field_g, this.field_h.a(52, param0), this.field_j);
                                                                                                                  break L1;
                                                                                                                } else {
                                                                                                                  throw new IllegalArgumentException("Special not found");
                                                                                                                }
                                                                                                              }
                                                                                                            } else {
                                                                                                              var3 = new bla(this.field_g, this.field_h.a(96, param0), this.field_j);
                                                                                                              break L1;
                                                                                                            }
                                                                                                          }
                                                                                                        } else {
                                                                                                          var3 = new fc(this.field_g, this.field_h.a(17, param0), this.field_k, this.field_n);
                                                                                                          break L1;
                                                                                                        }
                                                                                                      } else {
                                                                                                        var3 = new ci(this.field_g, this.field_h.a(param1 ^ 78, param0), this.field_k, this.field_n);
                                                                                                        break L1;
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                } else {
                                                                                                  var3 = new no(this.field_g, this.field_h.a(94, param0));
                                                                                                  break L1;
                                                                                                }
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            var3 = new wc(this.field_g, this.field_h.a(24, param0), this.field_k, this.field_n);
                                                                                            break L1;
                                                                                          }
                                                                                        } else {
                                                                                          var3 = new rl(this.field_g, this.field_h.a(param1 + 83, param0), this.field_k, this.field_n);
                                                                                          break L1;
                                                                                        }
                                                                                      } else {
                                                                                        var3 = new ija(this.field_g, this.field_h.a(116, param0), this.field_j);
                                                                                        break L1;
                                                                                      }
                                                                                    }
                                                                                  } else {
                                                                                    var3 = new ud(this.field_g, this.field_h.a(37, param0), this.field_k, this.field_n);
                                                                                    break L1;
                                                                                  }
                                                                                }
                                                                              } else {
                                                                                var3 = new mt(this.field_g, this.field_h.a(113, param0));
                                                                                break L1;
                                                                              }
                                                                            } else {
                                                                              break L1;
                                                                            }
                                                                          } else {
                                                                            var3 = new mja(this.field_g, this.field_h.a(32, param0), this.field_i);
                                                                            break L1;
                                                                          }
                                                                        } else {
                                                                          var3 = new hea(this.field_g, this.field_h.a(107, param0), this.field_i);
                                                                          break L1;
                                                                        }
                                                                      } else {
                                                                        var3 = new fq(this.field_g, this.field_h.a(param1 + 44, param0), this.field_k, this.field_n);
                                                                        break L1;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    var3 = new efa(this.field_g, this.field_h.a(81, param0), this.field_k, this.field_n);
                                                                    break L1;
                                                                  }
                                                                } else {
                                                                  var3 = new kl(this.field_g, this.field_h.a(19, param0), this.field_k, this.field_n);
                                                                  break L1;
                                                                }
                                                              } else {
                                                                var3 = new nw(this.field_g, this.field_h.a(13, param0), this.field_k, this.field_n);
                                                                break L1;
                                                              }
                                                            } else {
                                                              var3 = new sg(this.field_g, this.field_h.a(25, param0));
                                                              break L1;
                                                            }
                                                          }
                                                        }
                                                      } else {
                                                        var3 = new ts(this.field_g, this.field_h.a(87, param0), this.field_j);
                                                        break L1;
                                                      }
                                                    }
                                                  } else {
                                                    var3 = new dr(this.field_g, this.field_h.a(113, param0));
                                                    break L1;
                                                  }
                                                }
                                              } else {
                                                var3 = new eg(this.field_g, this.field_h.a(param1 ^ 105, param0), this.field_j);
                                                break L1;
                                              }
                                            } else {
                                              var3 = new ww(this.field_g, this.field_h.a(param1 + 53, param0));
                                              break L1;
                                            }
                                          } else {
                                            var3 = new fb(this.field_g, this.field_h.a(126, param0));
                                            break L1;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                var3 = new dk(this.field_g, this.field_h.a(109, param0), this.field_k, this.field_n);
                                break L1;
                              }
                            }
                          }
                        }
                      } else {
                        var3 = new ql(this.field_g, this.field_h.a(30, param0), this.field_k, this.field_n);
                        break L1;
                      }
                    }
                  }
                }
              } else {
                var3 = new rd(this.field_g, this.field_h.a(104, param0), this.field_k, this.field_n);
                break L1;
              }
            }
            L2: {
              param0.field_T.field_v[this.field_h.field_g] = param0.field_T.field_v[this.field_h.field_g] + 1;
              param0.field_T.field_r[this.field_h.field_g] = sr.a(param0.field_T.field_r[this.field_h.field_g], 1L << this.field_g - 88);
              param0.field_T.field_m[this.field_h.field_g][this.field_g + -88] = param0.field_T.field_m[this.field_h.field_g][this.field_g + -88] + 1;
              if (!this.field_m) {
                break L2;
              } else {
                param0.field_T.field_m[this.field_h.field_g][31] = param0.field_T.field_m[this.field_h.field_g][31] + 1;
                break L2;
              }
            }
            var4 = ((td) (var3)).a(param0, param1);
            if (var3 != null) {
              stackOut_131_0 = (ii) (var4);
              stackIn_132_0 = stackOut_131_0;
              break L0;
            } else {
              throw new IllegalArgumentException("Special not found");
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_134_0 = var3;
            stackOut_134_1 = new StringBuilder().append("td.A(");
            stackIn_136_0 = stackOut_134_0;
            stackIn_136_1 = stackOut_134_1;
            stackIn_135_0 = stackOut_134_0;
            stackIn_135_1 = stackOut_134_1;
            if (param0 == null) {
              stackOut_136_0 = stackIn_136_0;
              stackOut_136_1 = (StringBuilder) ((Object) stackIn_136_1);
              stackOut_136_2 = "null";
              stackIn_137_0 = stackOut_136_0;
              stackIn_137_1 = stackOut_136_1;
              stackIn_137_2 = stackOut_136_2;
              break L3;
            } else {
              stackOut_135_0 = stackIn_135_0;
              stackOut_135_1 = (StringBuilder) ((Object) stackIn_135_1);
              stackOut_135_2 = "{...}";
              stackIn_137_0 = stackOut_135_0;
              stackIn_137_1 = stackOut_135_1;
              stackIn_137_2 = stackOut_135_2;
              break L3;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_137_0), stackIn_137_2 + ',' + param1 + ')');
        }
        return stackIn_132_0;
    }

    static {
    }
}
