/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lf extends gj {
    static hc field_q;
    wi field_p;
    int field_t;
    byte field_s;
    static int[][] field_r;

    final byte[] d(byte param0) {
        L0: {
          if (((lf) this).field_n) {
            break L0;
          } else {
            if (((lf) this).field_p.field_h < ((lf) this).field_p.field_i.length - ((lf) this).field_s) {
              break L0;
            } else {
              if (param0 < -106) {
                return ((lf) this).field_p.field_i;
              } else {
                return null;
              }
            }
          }
        }
        throw new RuntimeException();
    }

    final static jk a(ii param0, byte param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        jk var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        jk stackIn_25_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        jk stackOut_24_0 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var8 = Bounce.field_N;
        try {
          L0: {
            L1: {
              var2_int = param0.f(7, 8);
              if (param1 <= -32) {
                break L1;
              } else {
                var9 = null;
                jk discarded$2 = lf.a((ii) null, (byte) -64);
                break L1;
              }
            }
            if (var2_int <= 0) {
              L2: {
                var3 = re.a(95, param0) ? 1 : 0;
                var4 = re.a(38, param0) ? 1 : 0;
                var5 = new jk();
                var5.field_k = (short)param0.f(7, 16);
                var5.field_g = ne.a(0, 16, var5.field_g, param0);
                var5.field_C = ne.a(0, 16, var5.field_C, param0);
                var5.field_J = ne.a(0, 16, var5.field_J, param0);
                var5.field_L = (short)param0.f(7, 16);
                var5.field_O = ne.a(0, 16, var5.field_O, param0);
                var5.field_P = ne.a(0, 16, var5.field_P, param0);
                var5.field_l = ne.a(0, 16, var5.field_l, param0);
                if (var3 != 0) {
                  var5.field_d = (short)param0.f(7, 16);
                  var5.field_f = ne.a(0, 16, var5.field_f, param0);
                  var5.field_i = ne.a(0, 16, var5.field_i, param0);
                  var5.field_x = ne.a(0, 16, var5.field_x, param0);
                  var5.field_F = ne.a(0, 16, var5.field_F, param0);
                  var5.field_I = ne.a(0, 16, var5.field_I, param0);
                  var5.field_Q = ne.a(0, 16, var5.field_Q, param0);
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (var4 != 0) {
                  int discarded$3 = param0.f(7, 16);
                  var5.field_u = ne.a(0, 16, var5.field_u, param0);
                  var5.field_s = ne.a(0, 16, var5.field_s, param0);
                  var5.field_y = ne.a(0, 16, var5.field_y, param0);
                  var5.field_B = ne.a(0, 16, var5.field_B, param0);
                  var5.field_b = ne.a(0, 16, var5.field_b, param0);
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (re.a(91, param0)) {
                  var5.field_p = ne.a(0, 16, var5.field_p, param0);
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if (!re.a(106, param0)) {
                  break L5;
                } else {
                  var5.field_v = qg.a(true, var5.field_v, 16, param0);
                  var6 = 0;
                  var7 = 0;
                  L6: while (true) {
                    if (var7 >= var5.field_v.length) {
                      if (0 != var6) {
                        var5.field_w = (byte)(1 + var6);
                        break L5;
                      } else {
                        var5.field_v = null;
                        break L5;
                      }
                    } else {
                      L7: {
                        if ((255 & var5.field_v[var7]) > var6) {
                          var6 = var5.field_v[var7] & 255;
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      var7++;
                      continue L6;
                    }
                  }
                }
              }
              stackOut_24_0 = (jk) var5;
              stackIn_25_0 = stackOut_24_0;
              break L0;
            } else {
              throw new IllegalStateException("" + var2_int);
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var2;
            stackOut_26_1 = new StringBuilder().append("lf.D(");
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param0 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L8;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L8;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + ',' + param1 + ')');
        }
        return stackIn_25_0;
    }

    final static byte a(char param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          L1: {
            L2: {
              var4 = Bounce.field_N;
              var3 = 35 / ((23 - param1) / 57);
              if (param0 <= 0) {
                break L2;
              } else {
                if (128 > param0) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (param0 < 160) {
                break L3;
              } else {
                if (param0 <= 255) {
                  break L1;
                } else {
                  break L3;
                }
              }
            }
            if (param0 != 8364) {
              if (8218 == param0) {
                var2 = -126;
                break L0;
              } else {
                if (param0 == 402) {
                  var2 = -125;
                  break L0;
                } else {
                  if (param0 != 8222) {
                    if (param0 == 8230) {
                      var2 = -123;
                      break L0;
                    } else {
                      if (param0 != 8224) {
                        if (param0 == 8225) {
                          var2 = -121;
                          break L0;
                        } else {
                          if (param0 == 710) {
                            var2 = -120;
                            break L0;
                          } else {
                            if (8240 == param0) {
                              var2 = -119;
                              break L0;
                            } else {
                              if (param0 != 352) {
                                if (param0 == 8249) {
                                  var2 = -117;
                                  break L0;
                                } else {
                                  if (param0 != 338) {
                                    if (param0 == 381) {
                                      var2 = -114;
                                      break L0;
                                    } else {
                                      if (8216 != param0) {
                                        if (8217 == param0) {
                                          var2 = -110;
                                          break L0;
                                        } else {
                                          if (param0 == 8220) {
                                            var2 = -109;
                                            break L0;
                                          } else {
                                            if (param0 == 8221) {
                                              var2 = -108;
                                              break L0;
                                            } else {
                                              if (param0 != 8226) {
                                                if (8211 != param0) {
                                                  if (param0 != 8212) {
                                                    if (param0 == 732) {
                                                      var2 = -104;
                                                      break L0;
                                                    } else {
                                                      if (8482 != param0) {
                                                        if (param0 == 353) {
                                                          var2 = -102;
                                                          break L0;
                                                        } else {
                                                          if (param0 != 8250) {
                                                            if (339 != param0) {
                                                              if (382 != param0) {
                                                                if (param0 != 376) {
                                                                  var2 = 63;
                                                                  break L0;
                                                                } else {
                                                                  var2 = -97;
                                                                  break L0;
                                                                }
                                                              } else {
                                                                var2 = -98;
                                                                break L0;
                                                              }
                                                            } else {
                                                              var2 = -100;
                                                              break L0;
                                                            }
                                                          } else {
                                                            var2 = -101;
                                                            break L0;
                                                          }
                                                        }
                                                      } else {
                                                        var2 = -103;
                                                        break L0;
                                                      }
                                                    }
                                                  } else {
                                                    var2 = -105;
                                                    break L0;
                                                  }
                                                } else {
                                                  var2 = -106;
                                                  break L0;
                                                }
                                              } else {
                                                var2 = -107;
                                                break L0;
                                              }
                                            }
                                          }
                                        }
                                      } else {
                                        var2 = -111;
                                        break L0;
                                      }
                                    }
                                  } else {
                                    var2 = -116;
                                    break L0;
                                  }
                                }
                              } else {
                                var2 = -118;
                                break L0;
                              }
                            }
                          }
                        }
                      } else {
                        var2 = -122;
                        break L0;
                      }
                    }
                  } else {
                    var2 = -124;
                    break L0;
                  }
                }
              }
            } else {
              var2 = -128;
              break L0;
            }
          }
          var2 = (byte)param0;
          break L0;
        }
        return (byte) var2;
    }

    public static void a(boolean param0) {
        field_q = null;
        field_r = null;
        if (param0) {
            byte discarded$0 = lf.a('￙', (byte) -105);
        }
    }

    final int c(byte param0) {
        if (!(null != ((lf) this).field_p)) {
            return 0;
        }
        if (param0 >= -100) {
            return -110;
        }
        return 100 * ((lf) this).field_p.field_h / (((lf) this).field_p.field_i.length - ((lf) this).field_s);
    }

    lf() {
    }

    final static void a(ai param0, ai param1, int param2) {
        try {
            if (null != param1.field_f) {
                param1.c(2);
            }
            if (param2 != -17957) {
                lf.a(true);
            }
            param1.field_f = param0.field_f;
            param1.field_c = param0;
            param1.field_f.field_c = param1;
            param1.field_c.field_f = param1;
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) (Object) runtimeException, "lf.G(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static ld a(int param0, int param1) {
        ld var2 = new ld();
        if (param0 >= -59) {
            Object var3 = null;
            lf.a((ai) null, (ai) null, 33);
        }
        ne.field_r.a(1, (ai) (Object) var2);
        int discarded$0 = 4;
        int discarded$1 = 2;
        ea.a();
        return var2;
    }

    static {
    }
}
