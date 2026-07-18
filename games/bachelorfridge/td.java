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
        field_l = null;
        field_o = null;
    }

    final void a(int param0, lu param1) {
        try {
            if (this.a(-4)) {
                er.a(((td) this).field_j, 111, param1);
            } else {
                param1.d(((td) this).field_k, 0);
                param1.d(((td) this).field_n, 0);
            }
            param1.d(((td) this).field_i, 0);
            param1.d(!((td) this).field_m ? 0 : 1, 0);
            int var3_int = 71 % ((61 - param0) / 53);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "td.J(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    td(int param0, aga param1) {
        super(4, param0, new nq(param1));
    }

    final static byte[] a(int param0, byte[] param1) {
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
        byte[] var14 = null;
        byte[] var15 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        Object stackIn_2_0 = null;
        byte[] stackIn_10_0 = null;
        byte[] stackIn_24_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        Throwable decompiledCaughtException = null;
        byte[] stackOut_23_0 = null;
        byte[] stackOut_9_0 = null;
        Object stackOut_1_0 = null;
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
                if (var4 < 0) {
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
                      if (var5 < 0) {
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
                          var17 = new byte[var5];
                          var15 = var17;
                          var13 = var15;
                          var11 = var13;
                          var6 = var11;
                          if (1 == var3) {
                            int discarded$2 = 9;
                            int discarded$3 = pca.a(var6, var5, param1, var4);
                            break L5;
                          } else {
                            var7 = (Object) (Object) kca.field_b;
                            synchronized (var7) {
                              L6: {
                                kca.field_b.a(var9, var17, -10);
                                break L6;
                              }
                            }
                            break L5;
                          }
                        }
                        stackOut_23_0 = (byte[]) var6;
                        stackIn_24_0 = stackOut_23_0;
                        break L0;
                      }
                    }
                    throw new RuntimeException();
                  } else {
                    var16 = new byte[var4];
                    var14 = var16;
                    var12 = var14;
                    var10 = var12;
                    var5_ref_byte__ = var10;
                    var9.a(var16, var4, 128, 0);
                    stackOut_9_0 = (byte[]) var5_ref_byte__;
                    stackIn_10_0 = stackOut_9_0;
                    return stackIn_10_0;
                  }
                }
              }
              throw new RuntimeException();
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (byte[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var2;
            stackOut_25_1 = new StringBuilder().append("td.G(").append(param0).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param1 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L7;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L7;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + ')');
        }
        return stackIn_24_0;
    }

    private final boolean a(int param0) {
        hd var2 = (hd) (Object) ur.field_e[((td) this).field_g];
        return var2.c(0) == 3 ? true : false;
    }

    td(int param0, aga param1, boolean param2) {
        super(4, param0, new nq(param1));
        try {
            ((td) this).field_m = param2 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "td.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    ii a(op param0, int param1) {
        Object var3 = null;
        int var4_int = 0;
        ii var4 = null;
        int var5 = 0;
        L0: {
          var5 = BachelorFridge.field_y;
          var3 = null;
          var4_int = ((td) this).field_g;
          if (88 != var4_int) {
            if (89 == var4_int) {
              var3 = (Object) (Object) new tg(((td) this).field_g, ((td) this).field_h.a(param1 ^ 63, param0));
              break L0;
            } else {
              if (90 == var4_int) {
                var3 = (Object) (Object) new sw(((td) this).field_g, ((td) this).field_h.a(8, param0), ((td) this).field_i);
                break L0;
              } else {
                if (91 == var4_int) {
                  var3 = (Object) (Object) new fla(((td) this).field_g, ((td) this).field_h.a(38, param0));
                  break L0;
                } else {
                  if (92 != var4_int) {
                    if (var4_int == 93) {
                      var3 = (Object) (Object) new io(((td) this).field_g, ((td) this).field_h.a(param1 + 36, param0), ((td) this).field_j);
                      break L0;
                    } else {
                      if (var4_int == 94) {
                        var3 = (Object) (Object) new ifa(((td) this).field_g, ((td) this).field_h.a(62, param0));
                        break L0;
                      } else {
                        if (var4_int == 95) {
                          var3 = (Object) (Object) new s(((td) this).field_g, ((td) this).field_h.a(param1 ^ 50, param0));
                          break L0;
                        } else {
                          if (var4_int != 96) {
                            if (var4_int == 97) {
                              var3 = (Object) (Object) new h(((td) this).field_g, ((td) this).field_h.a(103, param0));
                              break L0;
                            } else {
                              if (var4_int == 98) {
                                var3 = (Object) (Object) new tha(((td) this).field_g, ((td) this).field_h.a(20, param0));
                                break L0;
                              } else {
                                if (var4_int == 99) {
                                  var3 = (Object) (Object) new of(((td) this).field_g, ((td) this).field_h.a(40, param0));
                                  break L0;
                                } else {
                                  if (var4_int == 100) {
                                    var3 = (Object) (Object) new eha(((td) this).field_g, ((td) this).field_h.a(85, param0), ((td) this).field_k, ((td) this).field_n);
                                    break L0;
                                  } else {
                                    if (var4_int == 101) {
                                      var3 = (Object) (Object) new nh(((td) this).field_g, ((td) this).field_h.a(27, param0));
                                      break L0;
                                    } else {
                                      if (var4_int != 102) {
                                        if (var4_int != 103) {
                                          if (var4_int != 104) {
                                            if (var4_int == 105) {
                                              var3 = (Object) (Object) new ui(((td) this).field_g, ((td) this).field_h.a(param1 + 65, param0));
                                              break L0;
                                            } else {
                                              if (var4_int != 106) {
                                                if (107 == var4_int) {
                                                  var3 = (Object) (Object) new vfa(((td) this).field_g, ((td) this).field_h.a(21, param0), ((td) this).field_k, ((td) this).field_n);
                                                  break L0;
                                                } else {
                                                  if (var4_int != 108) {
                                                    if (109 == var4_int) {
                                                      var3 = (Object) (Object) new eb(((td) this).field_g, ((td) this).field_h.a(112, param0), ((td) this).field_k, ((td) this).field_n);
                                                      break L0;
                                                    } else {
                                                      if (var4_int == 110) {
                                                        var3 = (Object) (Object) new mp(((td) this).field_g, ((td) this).field_h.a(53, param0));
                                                        break L0;
                                                      } else {
                                                        if (var4_int != 111) {
                                                          if (var4_int != 112) {
                                                            if (var4_int != 113) {
                                                              if (var4_int != 114) {
                                                                if (var4_int == 115) {
                                                                  var3 = (Object) (Object) new ab(((td) this).field_g, ((td) this).field_h.a(112, param0), ((td) this).field_j);
                                                                  break L0;
                                                                } else {
                                                                  if (116 != var4_int) {
                                                                    if (var4_int != 117) {
                                                                      if (var4_int != 118) {
                                                                        if (var4_int != 119) {
                                                                          if (var4_int != 120) {
                                                                            if (var4_int == 121) {
                                                                              var3 = (Object) (Object) new gh(((td) this).field_g, ((td) this).field_h.a(51, param0));
                                                                              break L0;
                                                                            } else {
                                                                              if (122 != var4_int) {
                                                                                if (var4_int == 123) {
                                                                                  var3 = (Object) (Object) new hj(((td) this).field_g, ((td) this).field_h.a(param1 + 25, param0));
                                                                                  break L0;
                                                                                } else {
                                                                                  if (124 != var4_int) {
                                                                                    if (var4_int != 125) {
                                                                                      if (var4_int != 126) {
                                                                                        if (var4_int == 127) {
                                                                                          var3 = (Object) (Object) new ch(((td) this).field_g, ((td) this).field_h.a(param1 ^ 127, param0));
                                                                                          break L0;
                                                                                        } else {
                                                                                          if (var4_int == 128) {
                                                                                            var3 = (Object) (Object) new ja(((td) this).field_g, ((td) this).field_h.a(param1 + 60, param0));
                                                                                            break L0;
                                                                                          } else {
                                                                                            if (var4_int != 129) {
                                                                                              if (var4_int == 130) {
                                                                                                var3 = (Object) (Object) new uba(((td) this).field_g, ((td) this).field_h.a(107, param0), ((td) this).field_k, ((td) this).field_n);
                                                                                                break L0;
                                                                                              } else {
                                                                                                if (var4_int == 131) {
                                                                                                  var3 = (Object) (Object) new kea(((td) this).field_g, ((td) this).field_h.a(param1 ^ 123, param0), ((td) this).field_k, ((td) this).field_n);
                                                                                                  break L0;
                                                                                                } else {
                                                                                                  if (var4_int != 132) {
                                                                                                    if (133 != var4_int) {
                                                                                                      if (var4_int == 134) {
                                                                                                        var3 = (Object) (Object) new wh(((td) this).field_g, ((td) this).field_h.a(58, param0));
                                                                                                        break L0;
                                                                                                      } else {
                                                                                                        if (135 != var4_int) {
                                                                                                          if (var4_int == 136) {
                                                                                                            var3 = (Object) (Object) new vka(((td) this).field_g, ((td) this).field_h.a(109, param0), ((td) this).field_k, ((td) this).field_n);
                                                                                                            break L0;
                                                                                                          } else {
                                                                                                            if (var4_int == 137) {
                                                                                                              var3 = (Object) (Object) new qga(((td) this).field_g, ((td) this).field_h.a(52, param0), ((td) this).field_j);
                                                                                                              break L0;
                                                                                                            } else {
                                                                                                              throw new IllegalArgumentException("Special not found");
                                                                                                            }
                                                                                                          }
                                                                                                        } else {
                                                                                                          var3 = (Object) (Object) new bla(((td) this).field_g, ((td) this).field_h.a(96, param0), ((td) this).field_j);
                                                                                                          break L0;
                                                                                                        }
                                                                                                      }
                                                                                                    } else {
                                                                                                      var3 = (Object) (Object) new fc(((td) this).field_g, ((td) this).field_h.a(17, param0), ((td) this).field_k, ((td) this).field_n);
                                                                                                      break L0;
                                                                                                    }
                                                                                                  } else {
                                                                                                    var3 = (Object) (Object) new ci(((td) this).field_g, ((td) this).field_h.a(param1 ^ 78, param0), ((td) this).field_k, ((td) this).field_n);
                                                                                                    break L0;
                                                                                                  }
                                                                                                }
                                                                                              }
                                                                                            } else {
                                                                                              var3 = (Object) (Object) new no(((td) this).field_g, ((td) this).field_h.a(94, param0));
                                                                                              break L0;
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                      } else {
                                                                                        var3 = (Object) (Object) new wc(((td) this).field_g, ((td) this).field_h.a(24, param0), ((td) this).field_k, ((td) this).field_n);
                                                                                        break L0;
                                                                                      }
                                                                                    } else {
                                                                                      var3 = (Object) (Object) new rl(((td) this).field_g, ((td) this).field_h.a(param1 + 83, param0), ((td) this).field_k, ((td) this).field_n);
                                                                                      break L0;
                                                                                    }
                                                                                  } else {
                                                                                    var3 = (Object) (Object) new ija(((td) this).field_g, ((td) this).field_h.a(116, param0), ((td) this).field_j);
                                                                                    break L0;
                                                                                  }
                                                                                }
                                                                              } else {
                                                                                var3 = (Object) (Object) new ud(((td) this).field_g, ((td) this).field_h.a(37, param0), ((td) this).field_k, ((td) this).field_n);
                                                                                break L0;
                                                                              }
                                                                            }
                                                                          } else {
                                                                            var3 = (Object) (Object) new mt(((td) this).field_g, ((td) this).field_h.a(113, param0));
                                                                            break L0;
                                                                          }
                                                                        } else {
                                                                          break L0;
                                                                        }
                                                                      } else {
                                                                        var3 = (Object) (Object) new mja(((td) this).field_g, ((td) this).field_h.a(32, param0), ((td) this).field_i);
                                                                        break L0;
                                                                      }
                                                                    } else {
                                                                      var3 = (Object) (Object) new hea(((td) this).field_g, ((td) this).field_h.a(107, param0), ((td) this).field_i);
                                                                      break L0;
                                                                    }
                                                                  } else {
                                                                    var3 = (Object) (Object) new fq(((td) this).field_g, ((td) this).field_h.a(param1 + 44, param0), ((td) this).field_k, ((td) this).field_n);
                                                                    break L0;
                                                                  }
                                                                }
                                                              } else {
                                                                var3 = (Object) (Object) new efa(((td) this).field_g, ((td) this).field_h.a(81, param0), ((td) this).field_k, ((td) this).field_n);
                                                                break L0;
                                                              }
                                                            } else {
                                                              var3 = (Object) (Object) new kl(((td) this).field_g, ((td) this).field_h.a(19, param0), ((td) this).field_k, ((td) this).field_n);
                                                              break L0;
                                                            }
                                                          } else {
                                                            var3 = (Object) (Object) new nw(((td) this).field_g, ((td) this).field_h.a(13, param0), ((td) this).field_k, ((td) this).field_n);
                                                            break L0;
                                                          }
                                                        } else {
                                                          var3 = (Object) (Object) new sg(((td) this).field_g, ((td) this).field_h.a(25, param0));
                                                          break L0;
                                                        }
                                                      }
                                                    }
                                                  } else {
                                                    var3 = (Object) (Object) new ts(((td) this).field_g, ((td) this).field_h.a(87, param0), ((td) this).field_j);
                                                    break L0;
                                                  }
                                                }
                                              } else {
                                                var3 = (Object) (Object) new dr(((td) this).field_g, ((td) this).field_h.a(113, param0));
                                                break L0;
                                              }
                                            }
                                          } else {
                                            var3 = (Object) (Object) new eg(((td) this).field_g, ((td) this).field_h.a(param1 ^ 105, param0), ((td) this).field_j);
                                            break L0;
                                          }
                                        } else {
                                          var3 = (Object) (Object) new ww(((td) this).field_g, ((td) this).field_h.a(param1 + 53, param0));
                                          break L0;
                                        }
                                      } else {
                                        var3 = (Object) (Object) new fb(((td) this).field_g, ((td) this).field_h.a(126, param0));
                                        break L0;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            var3 = (Object) (Object) new dk(((td) this).field_g, ((td) this).field_h.a(109, param0), ((td) this).field_k, ((td) this).field_n);
                            break L0;
                          }
                        }
                      }
                    }
                  } else {
                    var3 = (Object) (Object) new ql(((td) this).field_g, ((td) this).field_h.a(30, param0), ((td) this).field_k, ((td) this).field_n);
                    break L0;
                  }
                }
              }
            }
          } else {
            var3 = (Object) (Object) new rd(((td) this).field_g, ((td) this).field_h.a(104, param0), ((td) this).field_k, ((td) this).field_n);
            break L0;
          }
        }
        L1: {
          param0.field_T.field_v[((td) this).field_h.field_g] = param0.field_T.field_v[((td) this).field_h.field_g] + 1;
          param0.field_T.field_r[((td) this).field_h.field_g] = sr.a(param0.field_T.field_r[((td) this).field_h.field_g], 1L << ((td) this).field_g - 88);
          param0.field_T.field_m[((td) this).field_h.field_g][((td) this).field_g + -88] = param0.field_T.field_m[((td) this).field_h.field_g][((td) this).field_g + -88] + 1;
          if (!((td) this).field_m) {
            break L1;
          } else {
            param0.field_T.field_m[((td) this).field_h.field_g][31] = param0.field_T.field_m[((td) this).field_h.field_g][31] + 1;
            break L1;
          }
        }
        var4 = ((td) var3).a(param0, param1);
        if (var3 != null) {
          return var4;
        } else {
          throw new IllegalArgumentException("Special not found");
        }
    }

    static {
    }
}
