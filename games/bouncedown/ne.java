/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ne extends ug {
    private String[] field_p;
    private int[] field_t;
    static int field_w;
    static tj field_v;
    static bc field_r;
    private int[][] field_o;
    int[] field_s;
    static int[] field_m;
    static int field_u;
    static String field_q;
    static int field_n;

    final static short[] a(int param0, int param1, short[] param2, ii param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object stackIn_3_0 = null;
        short[] stackIn_16_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        short[] stackOut_15_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var8 = Bounce.field_N;
        try {
          L0: {
            var4_int = param3.f(7, param1);
            if (var4_int != 0) {
              L1: {
                L2: {
                  if (param2 == null) {
                    break L2;
                  } else {
                    if (var4_int == param2.length) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                param2 = new short[var4_int];
                break L1;
              }
              L3: {
                var5 = param3.f(param0 + 7, 4);
                var6 = (short)param3.f(param0 ^ 7, 16);
                if (var5 <= param0) {
                  var7 = 0;
                  L4: while (true) {
                    if (var7 >= var4_int) {
                      break L3;
                    } else {
                      param2[var7] = (short)var6;
                      var7++;
                      continue L4;
                    }
                  }
                } else {
                  var7 = 0;
                  L5: while (true) {
                    if (var7 >= var4_int) {
                      break L3;
                    } else {
                      param2[var7] = (short)(param3.f(7, var5) + var6);
                      var7++;
                      continue L5;
                    }
                  }
                }
              }
              stackOut_15_0 = (short[]) param2;
              stackIn_16_0 = stackOut_15_0;
              break L0;
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (short[]) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var4;
            stackOut_17_1 = new StringBuilder().append("ne.H(").append(param0).append(44).append(param1).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param2 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          L7: {
            stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param3 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L7;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L7;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 41);
        }
        return stackIn_16_0;
    }

    final String e(int param0) {
        int var4 = 0;
        int var5 = Bounce.field_N;
        StringBuilder var6 = new StringBuilder(80);
        StringBuilder var2 = var6;
        int var3 = -44 / ((-51 - param0) / 41);
        if (((ne) this).field_p == null) {
            return "";
        }
        StringBuilder discarded$0 = var6.append(((ne) this).field_p[0]);
        for (var4 = 1; ((ne) this).field_p.length > var4; var4++) {
            StringBuilder discarded$1 = var2.append("...");
            StringBuilder discarded$2 = var6.append(((ne) this).field_p[var4]);
        }
        return var2.toString();
    }

    final static tg a(boolean param0) {
        int var4_int = 0;
        int var5 = Bounce.field_N;
        int var1 = ih.field_V[0] * qh.field_i[0];
        byte[] var2 = ph.field_c[0];
        int[] var3 = new int[var1];
        for (var4_int = 0; var4_int < var1; var4_int++) {
            var3[var4_int] = he.field_k[da.b(255, (int) var2[var4_int])];
        }
        tg var4 = new tg(se.field_C, fk.field_e, cl.field_n[0], ae.field_c[0], ih.field_V[0], qh.field_i[0], var3);
        vb.a((byte) 122);
        return var4;
    }

    final void a(int param0, wi param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var5 = Bounce.field_N;
        try {
          L0: {
            var3_int = -46 % ((-75 - param0) / 37);
            L1: while (true) {
              var4 = param1.d((byte) -104);
              if (var4 != 0) {
                this.a((byte) 18, param1, var4);
                continue L1;
              } else {
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("ne.E(").append(param0).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
    }

    final void d(int param0) {
        int var2 = 0;
        int var3 = Bounce.field_N;
        if (null != ((ne) this).field_s) {
            for (var2 = 0; var2 < ((ne) this).field_s.length; var2++) {
                ((ne) this).field_s[var2] = ge.a(((ne) this).field_s[var2], 32768);
            }
        }
        if (param0 != 31680) {
            field_w = 9;
        }
    }

    final static boolean a(CharSequence param0, boolean param1, byte param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_36_0 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_8_0 = 0;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        var8 = Bounce.field_N;
        try {
          L0: {
            if (param0 == null) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              L1: {
                var3_int = param0.length();
                if (1 > var3_int) {
                  break L1;
                } else {
                  if (12 < var3_int) {
                    break L1;
                  } else {
                    L2: {
                      var4 = ce.a(param0, param2 ^ -33);
                      if (var4 == null) {
                        break L2;
                      } else {
                        if (var4.length() < 1) {
                          break L2;
                        } else {
                          L3: {
                            if (param2 == -33) {
                              break L3;
                            } else {
                              field_v = null;
                              break L3;
                            }
                          }
                          L4: {
                            if (f.a(var4.charAt(0), false)) {
                              break L4;
                            } else {
                              if (f.a(var4.charAt(-1 + var4.length()), false)) {
                                break L4;
                              } else {
                                var5 = 0;
                                var6 = 0;
                                L5: while (true) {
                                  if (param0.length() <= var6) {
                                    if (var5 <= 0) {
                                      stackOut_35_0 = 1;
                                      stackIn_36_0 = stackOut_35_0;
                                      break L0;
                                    } else {
                                      stackOut_33_0 = 0;
                                      stackIn_34_0 = stackOut_33_0;
                                      return stackIn_34_0 != 0;
                                    }
                                  } else {
                                    L6: {
                                      var7 = param0.charAt(var6);
                                      if (f.a((char) var7, false)) {
                                        var5++;
                                        break L6;
                                      } else {
                                        var5 = 0;
                                        break L6;
                                      }
                                    }
                                    L7: {
                                      if (var5 < 2) {
                                        break L7;
                                      } else {
                                        if (param1) {
                                          break L7;
                                        } else {
                                          stackOut_29_0 = 0;
                                          stackIn_30_0 = stackOut_29_0;
                                          return stackIn_30_0 != 0;
                                        }
                                      }
                                    }
                                    var6++;
                                    continue L5;
                                  }
                                }
                              }
                            }
                          }
                          stackOut_20_0 = 0;
                          stackIn_21_0 = stackOut_20_0;
                          return stackIn_21_0 != 0;
                        }
                      }
                    }
                    stackOut_13_0 = 0;
                    stackIn_14_0 = stackOut_13_0;
                    return stackIn_14_0 != 0;
                  }
                }
              }
              stackOut_8_0 = 0;
              stackIn_9_0 = stackOut_8_0;
              return stackIn_9_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackOut_37_0 = (RuntimeException) var3;
            stackOut_37_1 = new StringBuilder().append("ne.G(");
            stackIn_39_0 = stackOut_37_0;
            stackIn_39_1 = stackOut_37_1;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            if (param0 == null) {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L8;
            } else {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "{...}";
              stackIn_40_0 = stackOut_38_0;
              stackIn_40_1 = stackOut_38_1;
              stackIn_40_2 = stackOut_38_2;
              break L8;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_40_0, stackIn_40_2 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_36_0 != 0;
    }

    final static ve f(int param0) {
        if (param0 != 32768) {
            field_r = null;
        }
        return new ve(bb.a(param0 + -32880), ck.g((byte) 112));
    }

    public static void c(byte param0) {
        field_q = null;
        field_v = null;
        field_m = null;
        field_r = null;
    }

    private final void a(byte param0, wi param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        eh var7 = null;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var9 = Bounce.field_N;
        try {
          L0: {
            if (param0 == 18) {
              L1: {
                if (param2 != 1) {
                  L2: {
                    if (param2 == 2) {
                      var4_int = param1.d((byte) -83);
                      ((ne) this).field_s = new int[var4_int];
                      var5 = 0;
                      L3: while (true) {
                        if (~var5 <= ~var4_int) {
                          break L2;
                        } else {
                          ((ne) this).field_s[var5] = param1.a(-1640531527);
                          var5++;
                          continue L3;
                        }
                      }
                    } else {
                      if (3 == param2) {
                        var4_int = param1.d((byte) -69);
                        ((ne) this).field_t = new int[var4_int];
                        ((ne) this).field_o = new int[var4_int][];
                        var5 = 0;
                        L4: while (true) {
                          if (var4_int <= var5) {
                            break L2;
                          } else {
                            L5: {
                              var6 = param1.a(-1640531527);
                              var7 = jd.a(param0 + 21296, var6);
                              if (var7 == null) {
                                break L5;
                              } else {
                                ((ne) this).field_t[var5] = var6;
                                ((ne) this).field_o[var5] = new int[var7.field_c];
                                var8 = 0;
                                L6: while (true) {
                                  if (~var7.field_c >= ~var8) {
                                    break L5;
                                  } else {
                                    ((ne) this).field_o[var5][var8] = param1.a(-1640531527);
                                    var8++;
                                    continue L6;
                                  }
                                }
                              }
                            }
                            var5++;
                            continue L4;
                          }
                        }
                      } else {
                        if (param2 != 4) {
                          break L2;
                        } else {
                          break L1;
                        }
                      }
                    }
                  }
                  break L1;
                } else {
                  ((ne) this).field_p = di.a(-121, '<', param1.b(true));
                  break L1;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var4;
            stackOut_20_1 = new StringBuilder().append("ne.I(").append(param0).append(44);
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
              break L7;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L7;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 44 + param2 + 41);
        }
    }

    ne() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = 0;
        field_m = new int[8192];
        field_r = new bc();
        field_q = "Name is available";
    }
}
