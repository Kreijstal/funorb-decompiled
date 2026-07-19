/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ci extends ne {
    int field_k;
    int field_r;
    static int[] field_s;
    static int[] field_n;
    static int field_j;
    static java.applet.Applet field_q;
    ci field_o;
    int field_l;
    static int field_m;
    int field_p;
    int field_i;

    final static va a(String param0, int param1) {
        va discarded$2 = null;
        RuntimeException var2 = null;
        String var3 = null;
        va stackIn_3_0 = null;
        va stackIn_7_0 = null;
        Object stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        va stackOut_2_0 = null;
        va stackOut_6_0 = null;
        Object stackOut_10_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            if (ll.field_r.b(param0, "", (byte) -82)) {
              stackOut_2_0 = ha.field_k.a(param0, (byte) 126, "");
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (ia.field_W.b(param0, "", (byte) -82)) {
                stackOut_6_0 = ha.field_k.a(param0, "", param1 + 47712);
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (param1 != -10396) {
                  var3 = (String) null;
                  discarded$2 = ci.a((String) null, 40);
                  stackOut_10_0 = null;
                  stackIn_11_0 = stackOut_10_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return null;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var2);
            stackOut_12_1 = new StringBuilder().append("ci.A(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L1;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L1;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            return (va) ((Object) stackIn_11_0);
          }
        }
    }

    final static void a(byte param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        long var3_long = 0L;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        qk var9 = null;
        int var10 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        String stackIn_27_0 = null;
        String stackIn_34_0 = null;
        int stackIn_41_0 = 0;
        qk stackIn_46_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        String stackOut_26_0 = null;
        String stackOut_25_0 = null;
        String stackOut_33_0 = null;
        String stackOut_32_0 = null;
        int stackOut_40_0 = 0;
        int stackOut_39_0 = 0;
        qk stackOut_45_0 = null;
        qk stackOut_44_0 = null;
        var10 = DungeonAssault.field_K;
        try {
          L0: {
            if (param0 == -119) {
              L1: {
                var1_int = jm.field_c;
                var2 = 0;
                if (kh.field_t != 2) {
                  break L1;
                } else {
                  var3_long = -kg.field_d + kd.c(-2456);
                  var2 = (int)((-var3_long + 10999L) / 1000L);
                  if (-1 < (var2 ^ -1)) {
                    var2 = 0;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              var3 = 0;
              L2: while (true) {
                if (var3 >= go.field_A.length) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L3: {
                    var4 = to.field_c[var3];
                    if (-1 < (var4 ^ -1)) {
                      var5 = om.field_a;
                      break L3;
                    } else {
                      if (d.field_g.field_b == var4) {
                        var5 = he.field_p;
                        break L3;
                      } else {
                        var5 = sm.field_c;
                        break L3;
                      }
                    }
                  }
                  L4: {
                    var6 = go.field_A[var3];
                    if (2 != kh.field_t) {
                      break L4;
                    } else {
                      if (var2 != 1) {
                        break L4;
                      } else {
                        L5: {
                          if (sn.field_a.length < mo.field_g.length) {
                            stackOut_18_0 = mo.field_g.length;
                            stackIn_19_0 = stackOut_18_0;
                            break L5;
                          } else {
                            stackOut_17_0 = sn.field_a.length;
                            stackIn_19_0 = stackOut_17_0;
                            break L5;
                          }
                        }
                        L6: {
                          var7 = stackIn_19_0;
                          if (fd.field_b.length <= cp.field_Q.length) {
                            stackOut_21_0 = cp.field_Q.length;
                            stackIn_22_0 = stackOut_21_0;
                            break L6;
                          } else {
                            stackOut_20_0 = fd.field_b.length;
                            stackIn_22_0 = stackOut_20_0;
                            break L6;
                          }
                        }
                        L7: {
                          var8 = stackIn_22_0;
                          if (6 > var3) {
                            break L7;
                          } else {
                            if (6 - -var7 <= var3) {
                              break L7;
                            } else {
                              L8: {
                                if ((-var7 + sn.field_a.length + (var3 + -6) ^ -1) > -1) {
                                  stackOut_26_0 = "";
                                  stackIn_27_0 = stackOut_26_0;
                                  break L8;
                                } else {
                                  stackOut_25_0 = sn.field_a[-var7 + (-6 + var3 - -sn.field_a.length)];
                                  stackIn_27_0 = stackOut_25_0;
                                  break L8;
                                }
                              }
                              var6 = stackIn_27_0;
                              break L7;
                            }
                          }
                        }
                        if (var3 < var7 + 7) {
                          break L4;
                        } else {
                          if (var8 + var7 + 7 > var3) {
                            L9: {
                              if (-7 + var3 + -var7 >= cp.field_Q.length) {
                                stackOut_33_0 = "";
                                stackIn_34_0 = stackOut_33_0;
                                break L9;
                              } else {
                                stackOut_32_0 = cp.field_Q[-var7 + (-7 + var3)];
                                stackIn_34_0 = stackOut_32_0;
                                break L9;
                              }
                            }
                            var6 = stackIn_34_0;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                  L10: {
                    if ((var4 ^ -1) == 1) {
                      var6 = Integer.toString(var2);
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  L11: {
                    if (var4 < 0) {
                      stackOut_40_0 = 0;
                      stackIn_41_0 = stackOut_40_0;
                      break L11;
                    } else {
                      stackOut_39_0 = 1;
                      stackIn_41_0 = stackOut_39_0;
                      break L11;
                    }
                  }
                  L12: {
                    var7 = og.a(stackIn_41_0 != 0, var6, -30633);
                    var8 = -(var7 >> 879895905) + vo.field_r;
                    if (-1 >= (var4 ^ -1)) {
                      L13: {
                        if (d.field_g.field_b == var4) {
                          stackOut_45_0 = om.field_d;
                          stackIn_46_0 = stackOut_45_0;
                          break L13;
                        } else {
                          stackOut_44_0 = gd.field_G;
                          stackIn_46_0 = stackOut_44_0;
                          break L13;
                        }
                      }
                      L14: {
                        var9 = stackIn_46_0;
                        var1_int = var1_int + field_j;
                        if (var9 != null) {
                          var9.a(var1_int, (h.field_q << 1906417377) + mj.field_g, (oh.field_t << 2073329665) + var7, 112, var8 + -oh.field_t);
                          break L14;
                        } else {
                          break L14;
                        }
                      }
                      var1_int = var1_int + h.field_q;
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  L15: {
                    if ((var4 ^ -1) > -1) {
                      n.field_c.b(var6, var8, li.field_g + var1_int, var5, -1);
                      var1_int = var1_int + ag.field_a;
                      break L15;
                    } else {
                      i.field_x.b(var6, var8, i.field_n + var1_int, var5, -1);
                      var1_int = var1_int + (field_j + h.field_q + mj.field_g);
                      break L15;
                    }
                  }
                  var3++;
                  continue L2;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var1), "ci.D(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static long a(CharSequence param0, int param1) {
        long var2_long = 0L;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        long stackIn_22_0 = 0L;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        long stackOut_21_0 = 0L;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var7 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              var2_long = 0L;
              var4 = param0.length();
              var5 = 0;
              if (param1 == 2) {
                break L1;
              } else {
                ci.a(-61);
                break L1;
              }
            }
            L2: while (true) {
              L3: {
                if (var4 <= var5) {
                  break L3;
                } else {
                  L4: {
                    L5: {
                      var2_long = var2_long * 37L;
                      var6 = param0.charAt(var5);
                      if (65 > var6) {
                        break L5;
                      } else {
                        if (var6 > 90) {
                          break L5;
                        } else {
                          var2_long = var2_long + (long)(-65 + (var6 + 1));
                          break L4;
                        }
                      }
                    }
                    L6: {
                      if (var6 < 97) {
                        break L6;
                      } else {
                        if (122 >= var6) {
                          var2_long = var2_long + (long)(-97 + (1 - -var6));
                          break L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                    if (var6 < 48) {
                      break L4;
                    } else {
                      if (var6 <= 57) {
                        var2_long = var2_long + (long)(var6 + -21);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (177917621779460413L > var2_long) {
                    var5++;
                    continue L2;
                  } else {
                    break L3;
                  }
                }
              }
              L7: while (true) {
                L8: {
                  if ((var2_long % 37L ^ -1L) != -1L) {
                    break L8;
                  } else {
                    if (-1L == (var2_long ^ -1L)) {
                      break L8;
                    } else {
                      var2_long = var2_long / 37L;
                      continue L7;
                    }
                  }
                }
                stackOut_21_0 = var2_long;
                stackIn_22_0 = stackOut_21_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) (var2);
            stackOut_23_1 = new StringBuilder().append("ci.B(");
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L9;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L9;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param1 + ')');
        }
        return stackIn_22_0;
    }

    public static void a(int param0) {
        field_n = null;
        field_s = null;
        field_q = null;
        if (param0 <= 5) {
            field_j = -10;
        }
    }

    ci(int param0, int param1, int param2, int param3, int param4) {
        this.field_k = param1;
        this.field_r = param0;
        this.field_l = param2;
        this.field_p = param4;
        this.field_i = param3;
    }

    static {
        field_s = new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10};
    }
}
