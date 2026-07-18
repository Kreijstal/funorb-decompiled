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
        RuntimeException var1 = null;
        String var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        Object stackIn_23_0 = null;
        String stackIn_25_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_20_0 = 0;
        int stackOut_20_1 = 0;
        String stackOut_24_0 = null;
        Object stackOut_22_0 = null;
        var5 = Geoblox.field_C;
        try {
          L0: {
            L1: {
              L2: {
                var1_ref = "(" + ad.field_o + " " + dc.field_b + " " + kg.field_n + ") " + me.field_l;
                if (0 >= p.field_k) {
                  break L2;
                } else {
                  var1_ref = var1_ref + ":";
                  var2 = 0;
                  L3: while (true) {
                    if (var2 >= p.field_k) {
                      break L2;
                    } else {
                      var1_ref = var1_ref + ' ';
                      var3 = 255 & eh.field_d.field_j[var2];
                      var4 = var3 >> -88682940;
                      var3 = var3 & 15;
                      stackOut_4_0 = -11;
                      stackOut_4_1 = ~var4;
                      stackIn_21_0 = stackOut_4_0;
                      stackIn_21_1 = stackOut_4_1;
                      stackIn_5_0 = stackOut_4_0;
                      stackIn_5_1 = stackOut_4_1;
                      if (var5 != 0) {
                        break L1;
                      } else {
                        L4: {
                          L5: {
                            if (stackIn_5_0 >= stackIn_5_1) {
                              break L5;
                            } else {
                              var4 += 48;
                              if (var5 == 0) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                          var4 += 55;
                          break L4;
                        }
                        L6: {
                          L7: {
                            if (var3 < 10) {
                              break L7;
                            } else {
                              var3 += 55;
                              if (var5 == 0) {
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                          var3 += 48;
                          break L6;
                        }
                        var1_ref = var1_ref + (char)var4;
                        var1_ref = var1_ref + (char)var3;
                        var2++;
                        if (var5 == 0) {
                          continue L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
              }
              stackOut_20_0 = param0;
              stackOut_20_1 = 55;
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              break L1;
            }
            if (stackIn_21_0 == stackIn_21_1) {
              stackOut_24_0 = (String) var1_ref;
              stackIn_25_0 = stackOut_24_0;
              break L0;
            } else {
              stackOut_22_0 = null;
              stackIn_23_0 = stackOut_22_0;
              return (String) (Object) stackIn_23_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var1, "og.E(" + param0 + ')');
        }
        return stackIn_25_0;
    }

    private final void a(int param0, qc param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        ck var7 = null;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
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
                      L4: {
                        if (var5 >= var4_int) {
                          break L4;
                        } else {
                          ((og) this).field_m[var5] = param1.b(true);
                          var5++;
                          if (var9 != 0) {
                            break L1;
                          } else {
                            if (var9 == 0) {
                              continue L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                      if (var9 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                L5: {
                  if (3 != param0) {
                    break L5;
                  } else {
                    var4_int = param1.c((byte) 34);
                    ((og) this).field_s = new int[var4_int][];
                    ((og) this).field_o = new int[var4_int];
                    var5 = 0;
                    L6: while (true) {
                      L7: {
                        if (var4_int <= var5) {
                          break L7;
                        } else {
                          var6 = param1.b(true);
                          var7 = b.a(false, var6);
                          if (var9 != 0) {
                            break L1;
                          } else {
                            L8: {
                              L9: {
                                if (null != var7) {
                                  ((og) this).field_o[var5] = var6;
                                  ((og) this).field_s[var5] = new int[var7.field_a];
                                  var8 = 0;
                                  L10: while (true) {
                                    if (var7.field_a <= var8) {
                                      break L9;
                                    } else {
                                      ((og) this).field_s[var5][var8] = param1.b(true);
                                      var8++;
                                      if (var9 != 0) {
                                        break L8;
                                      } else {
                                        if (var9 == 0) {
                                          continue L10;
                                        } else {
                                          break L9;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  break L9;
                                }
                              }
                              var5++;
                              break L8;
                            }
                            if (var9 == 0) {
                              continue L6;
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                      if (var9 == 0) {
                        break L1;
                      } else {
                        break L5;
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
            L11: {
              if (param2 == -26093) {
                break L11;
              } else {
                ((og) this).a(-112, (qc) null);
                break L11;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var4 = decompiledCaughtException;
            stackOut_42_0 = (RuntimeException) var4;
            stackOut_42_1 = new StringBuilder().append("og.H(").append(param0).append(',');
            stackIn_45_0 = stackOut_42_0;
            stackIn_45_1 = stackOut_42_1;
            stackIn_43_0 = stackOut_42_0;
            stackIn_43_1 = stackOut_42_1;
            if (param1 == null) {
              stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
              stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
              stackOut_45_2 = "null";
              stackIn_46_0 = stackOut_45_0;
              stackIn_46_1 = stackOut_45_1;
              stackIn_46_2 = stackOut_45_2;
              break L12;
            } else {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "{...}";
              stackIn_46_0 = stackOut_43_0;
              stackIn_46_1 = stackOut_43_1;
              stackIn_46_2 = stackOut_43_2;
              break L12;
            }
          }
          throw t.a((Throwable) (Object) stackIn_46_0, stackIn_46_2 + ',' + param2 + ')');
        }
    }

    final void f(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Geoblox.field_C;
        try {
          L0: {
            L1: {
              if (param0 == 119) {
                break L1;
              } else {
                field_r = 0.380857914686203f;
                break L1;
              }
            }
            L2: {
              L3: {
                if (((og) this).field_m != null) {
                  var2_int = 0;
                  L4: while (true) {
                    if (~((og) this).field_m.length >= ~var2_int) {
                      break L3;
                    } else {
                      ((og) this).field_m[var2_int] = lb.a(((og) this).field_m[var2_int], 32768);
                      var2_int++;
                      if (var3 != 0) {
                        break L2;
                      } else {
                        if (var3 == 0) {
                          continue L4;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                } else {
                  break L3;
                }
              }
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var2, "og.F(" + param0 + ')');
        }
    }

    public static void f(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 >= 71) {
                break L1;
              } else {
                String discarded$2 = og.e(41);
                break L1;
              }
            }
            field_q = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var1, "og.D(" + param0 + ')');
        }
    }

    final String e(byte param0) {
        StringBuilder var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        String stackIn_6_0 = null;
        StringBuilder stackIn_10_0 = null;
        StringBuilder stackIn_14_0 = null;
        String stackIn_15_0 = null;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_9_0 = null;
        StringBuilder stackOut_13_0 = null;
        String stackOut_14_0 = null;
        String stackOut_5_0 = null;
        var4 = Geoblox.field_C;
        try {
          L0: {
            L1: {
              var2 = new StringBuilder(80);
              if (param0 <= -7) {
                break L1;
              } else {
                og.f(41);
                break L1;
              }
            }
            if (null != ((og) this).field_p) {
              StringBuilder discarded$6 = var2.append(((og) this).field_p[0]);
              var3 = 1;
              L2: while (true) {
                L3: {
                  L4: {
                    if (~((og) this).field_p.length >= ~var3) {
                      break L4;
                    } else {
                      StringBuilder discarded$7 = var2.append("...");
                      stackOut_9_0 = var2.append(((og) this).field_p[var3]);
                      stackIn_14_0 = stackOut_9_0;
                      stackIn_10_0 = stackOut_9_0;
                      if (var4 != 0) {
                        break L3;
                      } else {
                        var3++;
                        if (var4 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  stackOut_13_0 = (StringBuilder) var2;
                  stackIn_14_0 = stackOut_13_0;
                  break L3;
                }
                stackOut_14_0 = ((StringBuilder) (Object) stackIn_14_0).toString();
                stackIn_15_0 = stackOut_14_0;
                break L0;
              }
            } else {
              stackOut_5_0 = "";
              stackIn_6_0 = stackOut_5_0;
              return stackIn_6_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw t.a((Throwable) (Object) var2_ref, "og.G(" + param0 + ')');
        }
        return stackIn_15_0;
    }

    og() {
    }

    final static void a(int param0, String param1, boolean param2, boolean param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            fh.b(-6011);
            kd.field_e.f(10936);
            if (param0 == 2274) {
              ml.field_t = new pf(b.field_a, (String) null, cf.field_i, param2, param3);
              hk.field_C = new ei(kd.field_e, (el) (Object) ml.field_t);
              kd.field_e.a(false, (el) (Object) hk.field_C);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) runtimeException;
            stackOut_4_1 = new StringBuilder().append("og.C(").append(param0).append(',');
            stackIn_7_0 = stackOut_4_0;
            stackIn_7_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_8_0 = stackOut_5_0;
              stackIn_8_1 = stackOut_5_1;
              stackIn_8_2 = stackOut_5_2;
              break L1;
            }
          }
          throw t.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, qc param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
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
            stackOut_12_0 = (RuntimeException) runtimeException;
            stackOut_12_1 = new StringBuilder().append("og.B(").append(param0).append(',');
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_16_2 = stackOut_13_2;
              break L5;
            }
          }
          throw t.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
    }

    final static String a(String param0, String param1, boolean param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        L0: {
          if (param2) {
            break L0;
          } else {
            String discarded$2 = og.a((String) null, (String) null, true, (String) null);
            break L0;
          }
        }
        var4_int = param0.indexOf(param3);
        L1: while (true) {
          if (var4_int == -1) {
            return param0;
          } else {
            param0 = param0.substring(0, var4_int) + param1 + param0.substring(param3.length() + var4_int);
            var4_int = param0.indexOf(param3, param1.length() + var4_int);
            continue L1;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = new c[9];
    }
}
