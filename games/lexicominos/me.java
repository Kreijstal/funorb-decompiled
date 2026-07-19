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
        int[] array$1 = null;
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        aj var7 = null;
        int var8 = 0;
        int var9 = 0;
        Object stackIn_11_0 = null;
        Object stackIn_27_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_10_0 = null;
        Object stackOut_26_0 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
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
                      this.field_p = dc.a(param1.c(false), '<', (byte) -125);
                      if (var9 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (-3 == (param0 ^ -1)) {
                      break L5;
                    } else {
                      if (param0 == 3) {
                        var4_int = param1.d(true);
                        this.field_s = new int[var4_int];
                        this.field_q = new int[var4_int][];
                        var5 = 0;
                        L6: while (true) {
                          if (var4_int <= var5) {
                            if (var9 == 0) {
                              break L3;
                            } else {
                              break L5;
                            }
                          } else {
                            var6 = param1.b(param2 + -1698584257);
                            var7 = gb.a(var6, 2121865922);
                            stackOut_10_0 = null;
                            stackIn_27_0 = stackOut_10_0;
                            stackIn_11_0 = stackOut_10_0;
                            if (var9 != 0) {
                              break L2;
                            } else {
                              L7: {
                                L8: {
                                  if (stackIn_11_0 == var7) {
                                    break L8;
                                  } else {
                                    this.field_s[var5] = var6;
                                    array$1 = new int[var7.field_b];
                                    this.field_q[var5] = array$1;
                                    var8 = 0;
                                    L9: while (true) {
                                      if (var7.field_b <= var8) {
                                        break L8;
                                      } else {
                                        this.field_q[var5][var8] = param1.b(-1698573656);
                                        var8++;
                                        if (var9 != 0) {
                                          break L7;
                                        } else {
                                          if (var9 == 0) {
                                            continue L9;
                                          } else {
                                            break L8;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                var5++;
                                break L7;
                              }
                              continue L6;
                            }
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
                  this.field_r = new int[var4_int];
                  var5 = 0;
                  L10: while (true) {
                    if (var4_int <= var5) {
                      break L3;
                    } else {
                      this.field_r[var5] = param1.b(-1698573656);
                      var5++;
                      if (var9 != 0) {
                        break L1;
                      } else {
                        continue L10;
                      }
                    }
                  }
                }
                if (param2 == 10601) {
                  break L1;
                } else {
                  stackOut_26_0 = null;
                  stackIn_27_0 = stackOut_26_0;
                  break L2;
                }
              }
              field_w = (boolean[]) ((Object) stackIn_27_0);
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var4 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) (var4);
            stackOut_29_1 = new StringBuilder().append("me.E(").append(param0).append(',');
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param1 == null) {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L11;
            } else {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L11;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ',' + param2 + ')');
        }
    }

    final static void e(boolean param0) {
        RuntimeException var1 = null;
        th var1_ref = null;
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        th var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var10 = null;
        vb var11 = null;
        vi var12 = null;
        int[] var13 = null;
        vi var14 = null;
        int[] var15 = null;
        th stackIn_2_0 = null;
        th stackIn_3_0 = null;
        th stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        th stackOut_1_0 = null;
        th stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        th stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        var8 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var1_ref = ig.field_a;
              stackOut_1_0 = (th) (var1_ref);
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (param0) {
                stackOut_3_0 = (th) ((Object) stackIn_3_0);
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = (th) ((Object) stackIn_2_0);
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            L2: {
              L3: {
                var2 = ((th) (Object) stackIn_4_0).d(stackIn_4_1 != 0);
                if (var2 == 0) {
                  break L3;
                } else {
                  L4: {
                    if ((var2 ^ -1) != -2) {
                      break L4;
                    } else {
                      var11 = (vb) ((Object) jl.field_a.a(true));
                      if (var11 != null) {
                        var11.b((byte) -125);
                        if (var8 == 0) {
                          break L2;
                        } else {
                          break L4;
                        }
                      } else {
                        ck.b((byte) -125);
                        decompiledRegionSelector0 = 0;
                        break L0;
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
                  var12 = (vi) ((Object) ci.field_f.a(true));
                  if (var12 != null) {
                    var12.field_k = wj.b(26770);
                    var12.field_i = var12.field_k[0];
                    var12.field_h = true;
                    var12.b((byte) -116);
                    if (var8 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  } else {
                    ck.b((byte) -68);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              var15 = wj.b(26770);
              var13 = var15;
              var3 = var13;
              var10 = var3;
              var4 = var10;
              var5 = var1_ref;
              var6 = ((wf) ((Object) var5)).d(true);
              var7 = 0;
              L6: while (true) {
                if (var7 >= var6) {
                  var14 = (vi) ((Object) ci.field_f.a(true));
                  if (var14 == null) {
                    ck.b((byte) -49);
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    var14.field_i = var15[0];
                    var14.field_h = true;
                    var14.field_k = var3;
                    var14.b((byte) -128);
                    break L2;
                  }
                } else {
                  var10[var7] = ((wf) ((Object) var5)).d((byte) 19);
                  var7++;
                  if (var8 != 0) {
                    break L2;
                  } else {
                    continue L6;
                  }
                }
              }
            }
            L7: {
              if (!param0) {
                break L7;
              } else {
                field_w = (boolean[]) null;
                break L7;
              }
            }
            decompiledRegionSelector0 = 3;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var1), "me.F(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    me() {
    }

    public static void d(int param0) {
        if (param0 != 80) {
            field_u = (String) null;
        }
        field_t = null;
        field_u = null;
        field_w = null;
    }

    final String c(int param0) {
        StringBuilder discarded$13 = null;
        StringBuilder discarded$14 = null;
        StringBuilder var2 = null;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        StringBuilder stackIn_8_0 = null;
        StringBuilder stackIn_11_0 = null;
        StringBuilder stackOut_7_0 = null;
        StringBuilder stackOut_10_0 = null;
        var4 = Lexicominos.field_L ? 1 : 0;
        var5 = new StringBuilder(80);
        var2 = var5;
        if (this.field_p == null) {
          return "";
        } else {
          L0: {
            discarded$13 = var5.append(this.field_p[0]);
            if (param0 < -74) {
              break L0;
            } else {
              field_t = (String) null;
              break L0;
            }
          }
          var3 = 1;
          L1: while (true) {
            L2: {
              L3: {
                if (this.field_p.length <= var3) {
                  break L3;
                } else {
                  discarded$14 = var2.append("...");
                  stackOut_7_0 = var5.append(this.field_p[var3]);
                  stackIn_11_0 = stackOut_7_0;
                  stackIn_8_0 = stackOut_7_0;
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
              stackOut_10_0 = (StringBuilder) (var2);
              stackIn_11_0 = stackOut_10_0;
              break L2;
            }
            return ((StringBuilder) (Object) stackIn_11_0).toString();
          }
        }
    }

    final void a(wf param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
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
                  field_u = (String) null;
                  break L5;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var3);
            stackOut_10_1 = new StringBuilder().append("me.D(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L6;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L6;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
    }

    final static void c(byte param0) {
        sa.a((byte) 88, kk.c(-14047));
        if (param0 >= -4) {
            field_w = (boolean[]) null;
        }
    }

    final void d(byte param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          L1: {
            var3 = Lexicominos.field_L ? 1 : 0;
            if (null == this.field_r) {
              break L1;
            } else {
              var2 = 0;
              L2: while (true) {
                if (this.field_r.length <= var2) {
                  break L1;
                } else {
                  this.field_r[var2] = tb.a(this.field_r[var2], 32768);
                  var2++;
                  if (var3 != 0) {
                    break L0;
                  } else {
                    if (var3 == 0) {
                      continue L2;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
          }
          if (param0 <= -66) {
            break L0;
          } else {
            me.c((byte) -21);
            break L0;
          }
        }
    }

    static {
        field_t = "Email address is unavailable";
        field_u = "You are not currently logged in to the<nbsp>game.";
    }
}
