/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class og extends rc {
    static c[] field_q;
    static float field_r;
    static int field_n;
    int[] field_m;
    private int[] field_o;
    private String[] field_p;
    private int[][] field_s;

    final static String e(int param0) {
        String var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        L0: {
          L1: {
            var5 = Geoblox.field_C;
            var1 = "(" + ad.field_o + " " + dc.field_b + " " + kg.field_n + ") " + me.field_l;
            if (0 >= p.field_k) {
              break L1;
            } else {
              var1 = var1 + ":";
              var2 = 0;
              L2: while (true) {
                if (var2 >= p.field_k) {
                  break L1;
                } else {
                  var1 = var1 + 32;
                  var3 = 255 & eh.field_d.field_j[var2];
                  var4 = var3 >> 4;
                  var3 = var3 & 15;
                  stackOut_3_0 = -11;
                  stackOut_3_1 = ~var4;
                  stackIn_7_0 = stackOut_3_0;
                  stackIn_7_1 = stackOut_3_1;
                  stackIn_4_0 = stackOut_3_0;
                  stackIn_4_1 = stackOut_3_1;
                  if (var5 == 0) {
                    L3: {
                      L4: {
                        if (stackIn_7_0 >= stackIn_7_1) {
                          break L4;
                        } else {
                          var4 += 48;
                          if (var5 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      var4 += 55;
                      break L3;
                    }
                    L5: {
                      L6: {
                        if (var3 < 10) {
                          break L6;
                        } else {
                          var3 += 55;
                          if (var5 == 0) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                      var3 += 48;
                      break L5;
                    }
                    var1 = var1 + (char)var4;
                    var1 = var1 + (char)var3;
                    var2++;
                    continue L2;
                  } else {
                    if (stackIn_4_0 == stackIn_4_1) {
                      return var1;
                    } else {
                      break L0;
                    }
                  }
                }
              }
            }
          }
          break L0;
        }
        return null;
    }

    private final void a(int param0, qc param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        ck var7 = null;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var9 = Geoblox.field_C;
        try {
          L0: {
            L1: {
              if (1 == param0) {
                ((og) this).field_p = uj.a('<', true, param1.e((byte) 116));
                break L1;
              } else {
                L2: {
                  if (2 != param0) {
                    break L2;
                  } else {
                    var4_int = param1.c((byte) 34);
                    ((og) this).field_m = new int[var4_int];
                    var5 = 0;
                    L3: while (true) {
                      if (var5 >= var4_int) {
                        if (var9 == 0) {
                          break L1;
                        } else {
                          break L2;
                        }
                      } else {
                        ((og) this).field_m[var5] = param1.b(true);
                        var5++;
                        if (var9 != 0) {
                          break L1;
                        } else {
                          continue L3;
                        }
                      }
                    }
                  }
                }
                L4: {
                  if (3 != param0) {
                    break L4;
                  } else {
                    var4_int = param1.c((byte) 34);
                    ((og) this).field_s = new int[var4_int][];
                    ((og) this).field_o = new int[var4_int];
                    var5 = 0;
                    L5: while (true) {
                      if (var4_int <= var5) {
                        if (var9 == 0) {
                          break L1;
                        } else {
                          break L4;
                        }
                      } else {
                        var6 = param1.b(true);
                        var7 = b.a(false, var6);
                        if (var9 != 0) {
                          break L1;
                        } else {
                          L6: {
                            L7: {
                              if (var7 != null) {
                                ((og) this).field_o[var5] = var6;
                                ((og) this).field_s[var5] = new int[var7.field_a];
                                var8 = 0;
                                L8: while (true) {
                                  if (var7.field_a <= var8) {
                                    break L7;
                                  } else {
                                    ((og) this).field_s[var5][var8] = param1.b(true);
                                    var8++;
                                    if (var9 != 0) {
                                      break L6;
                                    } else {
                                      if (var9 == 0) {
                                        continue L8;
                                      } else {
                                        break L7;
                                      }
                                    }
                                  }
                                }
                              } else {
                                break L7;
                              }
                            }
                            var5++;
                            break L6;
                          }
                          continue L5;
                        }
                      }
                    }
                  }
                }
                if (param0 != 4) {
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var4 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var4;
            stackOut_27_1 = new StringBuilder().append("og.H(").append(param0).append(44);
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param1 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L9;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L9;
            }
          }
          throw t.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + 44 + -26093 + 41);
        }
    }

    final void f(byte param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = Geoblox.field_C;
          if (param0 == 119) {
            break L0;
          } else {
            field_r = 0.380857914686203f;
            break L0;
          }
        }
        L1: {
          if (((og) this).field_m != null) {
            var2 = 0;
            L2: while (true) {
              if (((og) this).field_m.length <= var2) {
                break L1;
              } else {
                ((og) this).field_m[var2] = lb.a(((og) this).field_m[var2], 32768);
                var2++;
                if (var3 == 0) {
                  continue L2;
                } else {
                  return;
                }
              }
            }
          } else {
            break L1;
          }
        }
    }

    public static void f(int param0) {
        String discarded$0 = og.e(41);
        field_q = null;
    }

    final String e(byte param0) {
        StringBuilder var2 = null;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        StringBuilder stackIn_7_0 = null;
        StringBuilder stackIn_10_0 = null;
        StringBuilder stackOut_6_0 = null;
        StringBuilder stackOut_9_0 = null;
        L0: {
          var4 = Geoblox.field_C;
          var5 = new StringBuilder(80);
          var2 = var5;
          if (param0 <= -7) {
            break L0;
          } else {
            og.f(41);
            break L0;
          }
        }
        if (null != ((og) this).field_p) {
          StringBuilder discarded$6 = var5.append(((og) this).field_p[0]);
          var3 = 1;
          L1: while (true) {
            L2: {
              L3: {
                if (((og) this).field_p.length <= var3) {
                  break L3;
                } else {
                  StringBuilder discarded$7 = var2.append("...");
                  stackOut_6_0 = var5.append(((og) this).field_p[var3]);
                  stackIn_10_0 = stackOut_6_0;
                  stackIn_7_0 = stackOut_6_0;
                  if (var4 != 0) {
                    break L2;
                  } else {
                    var3++;
                    if (var4 == 0) {
                      continue L1;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              stackOut_9_0 = (StringBuilder) var2;
              stackIn_10_0 = stackOut_9_0;
              break L2;
            }
            return ((StringBuilder) (Object) stackIn_10_0).toString();
          }
        } else {
          return "";
        }
    }

    og() {
    }

    final static void a(int param0, String param1, boolean param2, boolean param3) {
        fh.b(-6011);
        kd.field_e.f(10936);
        if (param0 != 2274) {
            return;
        }
        try {
            ml.field_t = new pf(b.field_a, (String) null, cf.field_i, param2, param3);
            hk.field_C = new ei(kd.field_e, (el) (Object) ml.field_t);
            kd.field_e.a(false, (el) (Object) hk.field_C);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "og.C(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 41);
        }
    }

    final void a(int param0, qc param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var4 = Geoblox.field_C;
        try {
          L0: {
            if (param0 == 0) {
              L1: while (true) {
                L2: {
                  L3: {
                    L4: {
                      var3_int = param1.c((byte) 34);
                      if (0 != var3_int) {
                        break L4;
                      } else {
                        if (var4 != 0) {
                          break L3;
                        } else {
                          if (var4 == 0) {
                            break L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    this.a(var3_int, param1, -26093);
                    break L3;
                  }
                  if (var4 == 0) {
                    continue L1;
                  } else {
                    break L2;
                  }
                }
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) runtimeException;
            stackOut_10_1 = new StringBuilder().append("og.B(").append(param0).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L5;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L5;
            }
          }
          throw t.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
    }

    final static String a(String param0, String param1, boolean param2, String param3) {
        if (!param2) {
            String discarded$0 = og.a((String) null, (String) null, true, (String) null);
        }
        int var4 = param0.indexOf(param3);
        while (var4 != -1) {
            param0 = param0.substring(0, var4) + param1 + param0.substring(param3.length() + var4);
            var4 = param0.indexOf(param3, param1.length() + var4);
        }
        return param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = new c[9];
    }
}
