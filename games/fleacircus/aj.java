/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aj extends pa {
    static dd[] field_t;
    static String field_x;
    private int[] field_u;
    private int[][] field_s;
    private String[] field_y;
    static long field_w;
    static dd field_v;
    static int field_q;
    int[] field_z;
    static String field_r;

    private final void a(ni param0, int param1, int param2) {
        int[] array$1 = null;
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        fh var7 = null;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var9 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            if (param2 == 4) {
              L1: {
                L2: {
                  if ((param1 ^ -1) != -2) {
                    break L2;
                  } else {
                    this.field_y = m.a('<', 123, param0.h(0));
                    if (var9 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (param1 == 2) {
                    break L3;
                  } else {
                    if (param1 == 3) {
                      var4_int = param0.e(false);
                      this.field_s = new int[var4_int][];
                      this.field_u = new int[var4_int];
                      var5 = 0;
                      L4: while (true) {
                        if (var4_int <= var5) {
                          if (var9 == 0) {
                            break L1;
                          } else {
                            break L3;
                          }
                        } else {
                          var6 = param0.d((byte) -75);
                          var7 = ql.a(param2 ^ -22467, var6);
                          if (var9 != 0) {
                            break L1;
                          } else {
                            L5: {
                              L6: {
                                if (var7 != null) {
                                  this.field_u[var5] = var6;
                                  array$1 = new int[var7.field_c];
                                  this.field_s[var5] = array$1;
                                  var8 = 0;
                                  L7: while (true) {
                                    if (var7.field_c <= var8) {
                                      break L6;
                                    } else {
                                      this.field_s[var5][var8] = param0.d((byte) -73);
                                      var8++;
                                      if (var9 != 0) {
                                        break L5;
                                      } else {
                                        if (var9 == 0) {
                                          continue L7;
                                        } else {
                                          break L6;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  break L6;
                                }
                              }
                              var5++;
                              break L5;
                            }
                            continue L4;
                          }
                        }
                      }
                    } else {
                      if (param1 == 4) {
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
                var4_int = param0.e(false);
                this.field_z = new int[var4_int];
                var5 = 0;
                L8: while (true) {
                  if (var5 >= var4_int) {
                    break L1;
                  } else {
                    this.field_z[var5] = param0.d((byte) -122);
                    var5++;
                    if (var9 == 0) {
                      continue L8;
                    } else {
                      return;
                    }
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var4 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) (var4);
            stackOut_30_1 = new StringBuilder().append("aj.E(");
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param0 == null) {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L9;
            } else {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L9;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, java.awt.Canvas param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param0 == 0) {
              L1: {
                ea.a(120, (java.awt.Component) ((Object) param1));
                il.a(false, (java.awt.Component) ((Object) param1));
                if (null == ui.field_pb) {
                  break L1;
                } else {
                  ui.field_pb.a(0, (java.awt.Component) ((Object) param1));
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (runtimeException);
            stackOut_5_1 = new StringBuilder().append("aj.I(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final String c(byte param0) {
        ve discarded$8 = null;
        StringBuilder discarded$9 = null;
        StringBuilder discarded$10 = null;
        StringBuilder var2 = null;
        int var3 = 0;
        int var4 = 0;
        String var5 = null;
        StringBuilder var6 = null;
        StringBuilder stackIn_8_0 = null;
        StringBuilder stackIn_11_0 = null;
        StringBuilder stackOut_7_0 = null;
        StringBuilder stackOut_10_0 = null;
        var4 = fleas.field_A ? 1 : 0;
        var6 = new StringBuilder(80);
        var2 = var6;
        if (this.field_y == null) {
          return "";
        } else {
          L0: {
            if (param0 >= 74) {
              break L0;
            } else {
              var5 = (String) null;
              discarded$8 = aj.a((String) null, 106);
              break L0;
            }
          }
          discarded$9 = var6.append(this.field_y[0]);
          var3 = 1;
          L1: while (true) {
            L2: {
              L3: {
                if (this.field_y.length <= var3) {
                  break L3;
                } else {
                  discarded$10 = var2.append("...");
                  stackOut_7_0 = var6.append(this.field_y[var3]);
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

    final static void a(byte param0, Object param1, ce param2) {
        Exception var3 = null;
        RuntimeException var3_ref = null;
        int var3_int = 0;
        int var4 = 0;
        Object stackIn_9_0 = null;
        java.awt.AWTEvent stackIn_9_1 = null;
        Object stackIn_11_0 = null;
        java.awt.AWTEvent stackIn_11_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_8_0 = null;
        java.awt.AWTEvent stackOut_8_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var4 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            if (param2.field_a == null) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param0 == -60) {
                  break L1;
                } else {
                  field_x = (String) null;
                  break L1;
                }
              }
              var3_int = 0;
              L2: while (true) {
                L3: {
                  L4: {
                    L5: {
                      if (-51 >= (var3_int ^ -1)) {
                        break L5;
                      } else {
                        stackOut_8_0 = null;
                        stackOut_8_1 = param2.field_a.peekEvent();
                        stackIn_11_0 = stackOut_8_0;
                        stackIn_11_1 = stackOut_8_1;
                        stackIn_9_0 = stackOut_8_0;
                        stackIn_9_1 = stackOut_8_1;
                        if (var4 != 0) {
                          if (stackIn_11_0 != stackIn_11_1) {
                            break L4;
                          } else {
                            break L3;
                          }
                        } else {
                          if (stackIn_9_0 == stackIn_9_1) {
                            break L5;
                          } else {
                            vh.a(1L, 49);
                            var3_int++;
                            if (var4 == 0) {
                              continue L2;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                    }
                    if (param1 != null) {
                      break L4;
                    } else {
                      break L3;
                    }
                  }
                  try {
                    L6: {
                      param2.field_a.postEvent((java.awt.AWTEvent) ((Object) new java.awt.event.ActionEvent(param1, 1001, "dummy")));
                      break L6;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L7: {
                      var3 = (Exception) (Object) decompiledCaughtException;
                      break L7;
                    }
                  }
                  break L3;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L8: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) (var3_ref);
            stackOut_21_1 = new StringBuilder().append("aj.A(").append(param0).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L8;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L8;
            }
          }
          L9: {
            stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param2 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L9;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L9;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void g(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        var1 = sg.field_i;
        synchronized (var1) {
          L0: {
            kc.field_f = lk.field_J;
            m.field_a = m.field_a + 1;
            ag.field_f = gd.field_a;
            kc.field_b = vf.field_p;
            pl.field_c = ag.field_a;
            ag.field_a = false;
            jk.field_r = vk.field_O;
            pb.field_d = fb.field_b;
            ob.field_e = th.field_s;
            vk.field_O = 0;
            break L0;
          }
        }
        L1: {
          if (param0 == 28003) {
            break L1;
          } else {
            field_x = (String) null;
            break L1;
          }
        }
    }

    final void a(ni param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var4 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            if (param1 == 4) {
              L1: while (true) {
                var3_int = param0.e(false);
                if (-1 == (var3_int ^ -1)) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  this.a(param0, var3_int, 4);
                  if (var4 == 0) {
                    continue L1;
                  } else {
                    return;
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var3);
            stackOut_9_1 = new StringBuilder().append("aj.C(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static String a(CharSequence[] param0, int param1, byte param2, int param3) {
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        RuntimeException var4 = null;
        CharSequence var4_ref = null;
        int var4_int = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        int var7 = 0;
        CharSequence var7_ref_CharSequence = null;
        CharSequence var8 = null;
        int var9 = 0;
        CharSequence var10 = null;
        String stackIn_3_0 = null;
        String stackIn_8_0 = null;
        String stackIn_10_0 = null;
        String stackIn_29_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_9_0 = null;
        String stackOut_7_0 = null;
        String stackOut_28_0 = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var9 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            if (-1 != (param3 ^ -1)) {
              if (1 == param3) {
                var10 = param0[param1];
                var4_ref = var10;
                if (var4_ref != null) {
                  stackOut_9_0 = var10.toString();
                  stackIn_10_0 = stackOut_9_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  stackOut_7_0 = "null";
                  stackIn_8_0 = stackOut_7_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                L1: {
                  var4_int = param1 + param3;
                  if (param2 < -75) {
                    break L1;
                  } else {
                    field_w = -65L;
                    break L1;
                  }
                }
                var5 = 0;
                var6_int = param1;
                L2: while (true) {
                  if (var6_int >= var4_int) {
                    var6 = new StringBuilder(var5);
                    var7 = param1;
                    L3: while (true) {
                      if (var7 >= var4_int) {
                        stackOut_28_0 = var6.toString();
                        stackIn_29_0 = stackOut_28_0;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        L4: {
                          var8 = param0[var7];
                          if (var8 != null) {
                            discarded$3 = var6.append(var8);
                            break L4;
                          } else {
                            discarded$4 = var6.append("null");
                            if (var9 == 0) {
                              break L4;
                            } else {
                              discarded$5 = var6.append(var8);
                              break L4;
                            }
                          }
                        }
                        var7++;
                        continue L3;
                      }
                    }
                  } else {
                    L5: {
                      L6: {
                        var7_ref_CharSequence = param0[var6_int];
                        if (var7_ref_CharSequence != null) {
                          break L6;
                        } else {
                          var5 += 4;
                          if (var9 == 0) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                      var5 = var5 + var7_ref_CharSequence.length();
                      break L5;
                    }
                    var6_int++;
                    continue L2;
                  }
                }
              }
            } else {
              stackOut_2_0 = "";
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) (var4);
            stackOut_30_1 = new StringBuilder().append("aj.F(");
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param0 == null) {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L7;
            } else {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L7;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              return stackIn_29_0;
            }
          }
        }
    }

    public static void f(int param0) {
        field_t = null;
        field_r = null;
        field_x = null;
        int var1 = 34 % ((-22 - param0) / 33);
        field_v = null;
    }

    final static ve a(String param0, int param1) {
        RuntimeException var2 = null;
        ce var3 = null;
        ve stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        ve stackOut_6_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              if (!uc.field_c.a(-48)) {
                break L1;
              } else {
                if (!param0.equals(uc.field_c.c(param1 + -16954))) {
                  uc.field_c = pk.a((byte) 68, param0);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (param1 == -1) {
                break L2;
              } else {
                var3 = (ce) null;
                aj.a((byte) -26, (Object) null, (ce) null);
                break L2;
              }
            }
            stackOut_6_0 = uc.field_c;
            stackIn_7_0 = stackOut_6_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var2);
            stackOut_8_1 = new StringBuilder().append("aj.G(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    aj() {
    }

    final void h(int param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          L1: {
            var3 = fleas.field_A ? 1 : 0;
            if (null == this.field_z) {
              break L1;
            } else {
              var2 = 0;
              L2: while (true) {
                if (this.field_z.length <= var2) {
                  break L1;
                } else {
                  this.field_z[var2] = ne.a(this.field_z[var2], 32768);
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
          if (param0 == 0) {
            break L0;
          } else {
            aj.g(-113);
            break L0;
          }
        }
    }

    static {
        field_x = "Unfortunately your configuration doesn't support fullscreen mode.";
        field_r = "Email address is unavailable";
    }
}
