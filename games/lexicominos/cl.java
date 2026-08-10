/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cl extends rl implements nd {
    static String field_Q;
    private int field_R;
    static le field_T;
    static int[] field_U;
    static db field_S;
    private ma field_V;
    static he field_P;

    cl(String param0, vd param1, int param2) {
        super(param0, param1, param2);
    }

    final static boolean a(sh param0, sh param1, sh param2, byte param3) {
        RuntimeException var4 = null;
        sh var5 = null;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param3 >= 117) {
                break L1;
              } else {
                var5 = (sh) null;
                cl.a((sh) null, (sh) null, (sh) null, (byte) -3);
                break L1;
              }
            }
            L2: {
              if (!param1.c(89)) {
                break L2;
              } else {
                if (!param1.a("commonui", 10762)) {
                  break L2;
                } else {
                  L3: {
                    if (!param2.c(-53)) {
                      break L3;
                    } else {
                      if (!param2.a("commonui", 10762)) {
                        break L3;
                      } else {
                        L4: {
                          if (!param0.c(74)) {
                            break L4;
                          } else {
                            if (!param0.a("button.gif", 10762)) {
                              break L4;
                            } else {
                              return true;
                            }
                          }
                        }
                        stackIn_16_0 = 0;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      }
                    }
                  }
                  stackIn_11_0 = 0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            stackIn_6_0 = 0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var4);

            stackIn_19_1 = new StringBuilder().append("cl.W(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L5;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L6;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');

            if (param2 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L7;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L7;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_20_0), stackIn_26_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0 != 0;
          } else {
            return stackIn_16_0 != 0;
          }
        }
    }

    final static void a(byte param0, String param1, String param2) {
        try {
            if (param0 != 41) {
                th var4 = (th) null;
                cl.a((th) null, -73);
            }
            if (jj.field_a != null) {
                jj.field_a.g(true);
            }
            eb.field_b = new ti(param2, param1, false, true, true);
            di.field_x.b(120, eb.field_b);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "cl.U(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static nj[] a(th param0, int param1) {
        nj[] stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        nj[] var4 = null;
        int var5 = 0;
        nj var6 = null;
        int var6_int = 0;
        int var7 = 0;
        String var8 = null;
        var7 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var2_int = param0.g(8, 26527);
            if ((var2_int ^ -1) >= -1) {
              L1: {
                var3 = param0.g(12, 26527);
                if (param1 < -81) {
                  break L1;
                } else {
                  var8 = (String) null;
                  cl.a((byte) 101, (String) null, (String) null);
                  break L1;
                }
              }
              var4 = new nj[var3];
              var5 = 0;
              L2: while (true) {
                if (var5 >= var3) {
                  stackIn_13_0 = (nj[]) (var4);
                  break L0;
                } else {
                  L3: {
                    if (hl.a(true, param0)) {
                      var6 = new nj();
                      param0.g(24, 26527);
                      param0.g(24, 26527);
                      var6.field_c = param0.g(24, 26527);
                      param0.g(9, 26527);
                      param0.g(12, 26527);
                      param0.g(12, 26527);
                      param0.g(12, 26527);
                      var4[var5] = var6;
                      break L3;
                    } else {
                      var6_int = param0.g(dd.a((byte) 34, var5 - 1), 26527);
                      var4[var5] = var4[var6_int];
                      break L3;
                    }
                  }
                  var5++;
                  continue L2;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var2);

            stackIn_16_1 = new StringBuilder().append("cl.V(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ')');
        }
        return stackIn_13_0;
    }

    public static void o(int param0) {
        field_S = null;
        field_U = null;
        field_Q = null;
        if (param0 >= -45) {
            return;
        }
        field_P = null;
        field_T = null;
    }

    final void f(boolean param0) {
        super.f(param0);
        if (this.field_V != null) {
            this.field_V.a(true);
        }
    }

    final String b(int param0) {
        if (param0 <= 121) {
            w var3 = (w) null;
            this.a((byte) 68, (w) null, 113, 107);
        }
        if (!this.field_m) {
            return null;
        }
        if (this.field_q == null) {
            return null;
        }
        ta.a(sh.field_e, 112, bk.field_b + this.field_j - this.field_R);
        return this.field_q;
    }

    final static sh a(boolean param0, byte param1, boolean param2, int param3, int param4) {
        int var5 = -35 % ((46 - param1) / 55);
        return il.a(param0, 12317, false, param3, param2, param4);
    }

    final static byte[] a(byte param0, CharSequence param1) {
        byte[] stackIn_69_0 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        th var7 = null;
        var6 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = param1.length();
              if (param0 == -98) {
                break L1;
              } else {
                var7 = (th) null;
                cl.a((th) null, -87);
                break L1;
              }
            }
            var3 = new byte[var2_int];
            var4 = 0;
            L2: while (true) {
              if (var2_int <= var4) {
                stackIn_69_0 = (byte[]) (var3);
                break L0;
              } else {
                L3: {
                  L4: {
                    L5: {
                      var5 = param1.charAt(var4);
                      if (0 >= var5) {
                        break L5;
                      } else {
                        if (var5 < 128) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      if (160 > var5) {
                        break L6;
                      } else {
                        if (var5 <= 255) {
                          break L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                    if (var5 == 8364) {
                      var3[var4] = (byte)-128;
                      break L3;
                    } else {
                      if (var5 != 8218) {
                        if (var5 == 402) {
                          var3[var4] = (byte)-125;
                          break L3;
                        } else {
                          if (var5 == 8222) {
                            var3[var4] = (byte)-124;
                            break L3;
                          } else {
                            if (var5 == 8230) {
                              var3[var4] = (byte)-123;
                              break L3;
                            } else {
                              if (var5 == 8224) {
                                var3[var4] = (byte)-122;
                                break L3;
                              } else {
                                if (var5 == 8225) {
                                  var3[var4] = (byte)-121;
                                  break L3;
                                } else {
                                  if (var5 == 710) {
                                    var3[var4] = (byte)-120;
                                    break L3;
                                  } else {
                                    if (8240 == var5) {
                                      var3[var4] = (byte)-119;
                                      break L3;
                                    } else {
                                      if (var5 == 352) {
                                        var3[var4] = (byte)-118;
                                        break L3;
                                      } else {
                                        if (var5 == 8249) {
                                          var3[var4] = (byte)-117;
                                          break L3;
                                        } else {
                                          if (var5 != 338) {
                                            if (var5 != 381) {
                                              if (var5 != 8216) {
                                                if (var5 == 8217) {
                                                  var3[var4] = (byte)-110;
                                                  break L3;
                                                } else {
                                                  if (var5 == 8220) {
                                                    var3[var4] = (byte)-109;
                                                    break L3;
                                                  } else {
                                                    if (8221 != var5) {
                                                      if (8226 != var5) {
                                                        if (8211 == var5) {
                                                          var3[var4] = (byte)-106;
                                                          break L3;
                                                        } else {
                                                          if (var5 != 8212) {
                                                            if (var5 != 732) {
                                                              if (8482 == var5) {
                                                                var3[var4] = (byte)-103;
                                                                break L3;
                                                              } else {
                                                                if (353 == var5) {
                                                                  var3[var4] = (byte)-102;
                                                                  break L3;
                                                                } else {
                                                                  if (var5 == 8250) {
                                                                    var3[var4] = (byte)-101;
                                                                    break L3;
                                                                  } else {
                                                                    if (var5 == 339) {
                                                                      var3[var4] = (byte)-100;
                                                                      break L3;
                                                                    } else {
                                                                      if (var5 == 382) {
                                                                        var3[var4] = (byte)-98;
                                                                        break L3;
                                                                      } else {
                                                                        if (var5 == 376) {
                                                                          var3[var4] = (byte)-97;
                                                                          break L3;
                                                                        } else {
                                                                          var3[var4] = (byte)63;
                                                                          break L3;
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            } else {
                                                              var3[var4] = (byte)-104;
                                                              break L3;
                                                            }
                                                          } else {
                                                            var3[var4] = (byte)-105;
                                                            break L3;
                                                          }
                                                        }
                                                      } else {
                                                        var3[var4] = (byte)-107;
                                                        break L3;
                                                      }
                                                    } else {
                                                      var3[var4] = (byte)-108;
                                                      break L3;
                                                    }
                                                  }
                                                }
                                              } else {
                                                var3[var4] = (byte)-111;
                                                break L3;
                                              }
                                            } else {
                                              var3[var4] = (byte)-114;
                                              break L3;
                                            }
                                          } else {
                                            var3[var4] = (byte)-116;
                                            break L3;
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
                      } else {
                        var3[var4] = (byte)-126;
                        break L3;
                      }
                    }
                  }
                  var3[var4] = (byte)var5;
                  break L3;
                }
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackIn_72_0 = (RuntimeException) (var2);

            stackIn_72_1 = new StringBuilder().append("cl.S(").append(param0).append(',');

            if (param1 == null) {
              stackIn_73_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackIn_73_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackIn_73_2 = "null";
              break L7;
            } else {
              stackIn_73_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackIn_73_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackIn_73_2 = "{...}";
              break L7;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_73_0), stackIn_73_2 + ')');
        }
        return stackIn_69_0;
    }

    final static int p(int param0) {
        if (param0 >= -122) {
            return 47;
        }
        return (int)(1000000000L / ca.field_h);
    }

    public final ma a(byte param0) {
        int var2 = -48 / ((param0 - 56) / 36);
        return this.field_V;
    }

    final void a(ma param0, byte param1) {
        try {
            if (param1 != 23) {
                cl.o(-17);
            }
            this.field_V = param0;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "cl.MA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(byte param0, w param1, int param2, int param3) {
        try {
            super.a(param0, param1, param2, param3);
            this.field_R = -this.field_t + (bk.field_b + -param3);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "cl.FA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_U = new int[8192];
        field_Q = "Enter the name you'd prefer. This is the name displayed to other players.";
        field_S = new db(311, 450);
    }
}
