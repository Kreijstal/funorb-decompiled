/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class me extends ca {
    private int[][] field_q;
    static int field_v;
    private int[] field_s;
    int[] field_r;
    private String[] field_p;
    static String field_t;
    static String field_u;
    static boolean[] field_w;

    private final void a(int param0, wf param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        aj var7 = null;
        int var8 = 0;
        int var9 = 0;
        Object stackIn_19_0 = null;
        Object stackIn_40_0 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_18_0 = null;
        Object stackOut_38_0 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        var9 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  L4: {
                    if (1 != param0) {
                      break L4;
                    } else {
                      ((me) this).field_p = dc.a(param1.c(false), '<', (byte) -125);
                      if (var9 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (param0 == 2) {
                      break L5;
                    } else {
                      if (param0 == 3) {
                        var4_int = param1.d(true);
                        ((me) this).field_s = new int[var4_int];
                        ((me) this).field_q = new int[var4_int][];
                        var5 = 0;
                        L6: while (true) {
                          L7: {
                            if (var4_int <= var5) {
                              break L7;
                            } else {
                              var6 = param1.b(param2 + -1698584257);
                              var7 = gb.a(var6, 2121865922);
                              stackOut_18_0 = null;
                              stackIn_40_0 = stackOut_18_0;
                              stackIn_19_0 = stackOut_18_0;
                              if (var9 != 0) {
                                break L2;
                              } else {
                                L8: {
                                  L9: {
                                    if (stackIn_19_0 == (Object) (Object) var7) {
                                      break L9;
                                    } else {
                                      ((me) this).field_s[var5] = var6;
                                      ((me) this).field_q[var5] = new int[var7.field_b];
                                      var8 = 0;
                                      L10: while (true) {
                                        if (~var7.field_b >= ~var8) {
                                          break L9;
                                        } else {
                                          ((me) this).field_q[var5][var8] = param1.b(-1698573656);
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
                            break L3;
                          } else {
                            break L5;
                          }
                        }
                      } else {
                        if (4 == param0) {
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  var4_int = param1.d(true);
                  ((me) this).field_r = new int[var4_int];
                  var5 = 0;
                  L11: while (true) {
                    if (var4_int <= var5) {
                      break L3;
                    } else {
                      ((me) this).field_r[var5] = param1.b(-1698573656);
                      var5++;
                      if (var9 != 0) {
                        break L1;
                      } else {
                        if (var9 == 0) {
                          continue L11;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                if (param2 == 10601) {
                  break L1;
                } else {
                  stackOut_38_0 = null;
                  stackIn_40_0 = stackOut_38_0;
                  break L2;
                }
              }
              field_w = (boolean[]) (Object) stackIn_40_0;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var4 = decompiledCaughtException;
            stackOut_42_0 = (RuntimeException) var4;
            stackOut_42_1 = new StringBuilder().append("me.E(").append(param0).append(',');
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
          throw ld.a((Throwable) (Object) stackIn_46_0, stackIn_46_2 + ',' + param2 + ')');
        }
    }

    final static void e(boolean param0) {
        RuntimeException var1 = null;
        th var1_ref = null;
        int var2 = 0;
        int[] var3 = null;
        vi var3_ref = null;
        vb var3_ref2 = null;
        int[] var4 = null;
        vi var4_ref = null;
        th var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        th stackIn_2_0 = null;
        th stackIn_4_0 = null;
        th stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        RuntimeException decompiledCaughtException = null;
        th stackOut_1_0 = null;
        th stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        th stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        var8 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var1_ref = ig.field_a;
              stackOut_1_0 = (th) var1_ref;
              stackIn_4_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (param0) {
                stackOut_4_0 = (th) (Object) stackIn_4_0;
                stackOut_4_1 = 0;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                break L1;
              } else {
                stackOut_2_0 = (th) (Object) stackIn_2_0;
                stackOut_2_1 = 1;
                stackIn_5_0 = stackOut_2_0;
                stackIn_5_1 = stackOut_2_1;
                break L1;
              }
            }
            L2: {
              L3: {
                var2 = ((th) (Object) stackIn_5_0).d(stackIn_5_1 != 0);
                if (var2 == 0) {
                  break L3;
                } else {
                  L4: {
                    if (var2 != 1) {
                      break L4;
                    } else {
                      var3_ref2 = (vb) (Object) jl.field_a.a(true);
                      if (var3_ref2 != null) {
                        var3_ref2.b((byte) -125);
                        if (var8 == 0) {
                          break L2;
                        } else {
                          break L4;
                        }
                      } else {
                        ck.b((byte) -125);
                        return;
                      }
                    }
                  }
                  L5: {
                    if (var2 == 2) {
                      break L5;
                    } else {
                      uj.a("A1: " + qj.h(-94), (Throwable) null, 1);
                      ck.b((byte) -32);
                      if (var8 == 0) {
                        break L2;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var3_ref = (vi) (Object) ci.field_f.a(true);
                  if (var3_ref != null) {
                    var3_ref.field_k = wj.b(26770);
                    var3_ref.field_i = var3_ref.field_k[0];
                    var3_ref.field_h = true;
                    var3_ref.b((byte) -116);
                    if (var8 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  } else {
                    ck.b((byte) -68);
                    return;
                  }
                }
              }
              var3 = wj.b(26770);
              var4 = var3;
              var5 = var1_ref;
              var6 = ((wf) (Object) var5).d(true);
              var7 = 0;
              L6: while (true) {
                L7: {
                  if (var7 >= var6) {
                    break L7;
                  } else {
                    var4[var7] = ((wf) (Object) var5).d((byte) 19);
                    var7++;
                    if (var8 != 0) {
                      break L2;
                    } else {
                      if (var8 == 0) {
                        continue L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                }
                var4_ref = (vi) (Object) ci.field_f.a(true);
                if (null == var4_ref) {
                  ck.b((byte) -49);
                  return;
                } else {
                  var4_ref.field_i = var3[0];
                  var4_ref.field_h = true;
                  var4_ref.field_k = var3;
                  var4_ref.b((byte) -128);
                  break L2;
                }
              }
            }
            L8: {
              if (!param0) {
                break L8;
              } else {
                field_w = null;
                break L8;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ld.a((Throwable) (Object) var1, "me.F(" + param0 + ')');
        }
    }

    me() {
    }

    public static void d(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 80) {
                break L1;
              } else {
                field_u = null;
                break L1;
              }
            }
            field_t = null;
            field_u = null;
            field_w = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ld.a((Throwable) (Object) var1, "me.C(" + param0 + ')');
        }
    }

    final String c(int param0) {
        StringBuilder var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        String stackIn_5_0 = null;
        StringBuilder stackIn_12_0 = null;
        StringBuilder stackIn_16_0 = null;
        String stackIn_17_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_4_0 = null;
        StringBuilder stackOut_11_0 = null;
        StringBuilder stackOut_15_0 = null;
        String stackOut_16_0 = null;
        var4 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var2 = new StringBuilder(80);
            if (((me) this).field_p == null) {
              stackOut_4_0 = "";
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            } else {
              L1: {
                StringBuilder discarded$13 = var2.append(((me) this).field_p[0]);
                if (param0 < -74) {
                  break L1;
                } else {
                  field_t = null;
                  break L1;
                }
              }
              var3 = 1;
              L2: while (true) {
                L3: {
                  L4: {
                    if (((me) this).field_p.length <= var3) {
                      break L4;
                    } else {
                      StringBuilder discarded$14 = var2.append("...");
                      stackOut_11_0 = var2.append(((me) this).field_p[var3]);
                      stackIn_16_0 = stackOut_11_0;
                      stackIn_12_0 = stackOut_11_0;
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
                  stackOut_15_0 = (StringBuilder) var2;
                  stackIn_16_0 = stackOut_15_0;
                  break L3;
                }
                stackOut_16_0 = ((StringBuilder) (Object) stackIn_16_0).toString();
                stackIn_17_0 = stackOut_16_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ld.a((Throwable) (Object) var2_ref, "me.B(" + param0 + ')');
        }
        return stackIn_17_0;
    }

    final void a(wf param0, int param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var4 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    var3_int = param0.d(true);
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
                  this.a(var3_int, param0, 10601);
                  break L3;
                }
                if (var4 == 0) {
                  continue L1;
                } else {
                  break L2;
                }
              }
              L5: {
                if (param1 == 0) {
                  break L5;
                } else {
                  field_u = null;
                  break L5;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            runtimeException = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) runtimeException;
            stackOut_13_1 = new StringBuilder().append("me.D(");
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L6;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L6;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param1 + ')');
        }
    }

    final static void c(byte param0) {
        try {
            sa.a((byte) 88, kk.c(-14047));
            if (param0 >= -4) {
                field_w = null;
            }
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "me.A(" + param0 + ')');
        }
    }

    final void d(byte param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (null == ((me) this).field_r) {
                  break L2;
                } else {
                  var2_int = 0;
                  L3: while (true) {
                    if (((me) this).field_r.length <= var2_int) {
                      break L2;
                    } else {
                      ((me) this).field_r[var2_int] = tb.a(((me) this).field_r[var2_int], 32768);
                      var2_int++;
                      if (var3 != 0) {
                        break L1;
                      } else {
                        if (var3 == 0) {
                          continue L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
              }
              if (param0 <= -66) {
                break L1;
              } else {
                me.c((byte) -21);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ld.a((Throwable) (Object) runtimeException, "me.P(" + param0 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = "Email address is unavailable";
        field_u = "You are not currently logged in to the<nbsp>game.";
    }
}
