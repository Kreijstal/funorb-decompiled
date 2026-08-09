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
        RuntimeException var2 = null;
        String var3 = null;
        va stackIn_3_0 = null;
        va stackIn_7_0 = null;
        Object stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (ll.field_r.b(param0, "", (byte) -82)) {
              stackIn_3_0 = ha.field_k.a(param0, (byte) 126, "");
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (ia.field_W.b(param0, "", (byte) -82)) {
                stackIn_7_0 = ha.field_k.a(param0, "", param1 + 47712);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (param1 != -10396) {
                  var3 = (String) null;
                  ci.a((String) null, 40);
                  stackIn_11_0 = null;
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
            stackIn_14_0 = (RuntimeException) (var2);

            stackIn_14_1 = new StringBuilder().append("ci.A(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L1;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
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
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        String stackIn_27_0 = null;
        String stackIn_34_0 = null;
        int stackIn_41_0 = 0;
        qk stackIn_46_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        long var3_long = 0L;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        qk var9 = null;
        int var10 = 0;
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
                            stackIn_19_0 = mo.field_g.length;
                            break L5;
                          } else {
                            stackIn_19_0 = sn.field_a.length;
                            break L5;
                          }
                        }
                        L6: {
                          var7 = stackIn_19_0;
                          if (fd.field_b.length <= cp.field_Q.length) {
                            stackIn_22_0 = cp.field_Q.length;
                            break L6;
                          } else {
                            stackIn_22_0 = fd.field_b.length;
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
                                  stackIn_27_0 = "";
                                  break L8;
                                } else {
                                  stackIn_27_0 = sn.field_a[-var7 + (-6 + var3 - -sn.field_a.length)];
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
                                stackIn_34_0 = "";
                                break L9;
                              } else {
                                stackIn_34_0 = cp.field_Q[-var7 + (-7 + var3)];
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
                      stackIn_41_0 = 0;
                      break L11;
                    } else {
                      stackIn_41_0 = 1;
                      break L11;
                    }
                  }
                  L12: {
                    var7 = og.a(stackIn_41_0 != 0, var6, -30633);
                    var8 = -(var7 >> 879895905) + vo.field_r;
                    if (-1 >= (var4 ^ -1)) {
                      L13: {
                        if (d.field_g.field_b == var4) {
                          stackIn_46_0 = om.field_d;
                          break L13;
                        } else {
                          stackIn_46_0 = gd.field_G;
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
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        long stackIn_22_0 = 0L;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
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
                stackIn_22_0 = var2_long;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var2);

            stackIn_25_1 = new StringBuilder().append("ci.B(");

            if (param0 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L9;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
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
