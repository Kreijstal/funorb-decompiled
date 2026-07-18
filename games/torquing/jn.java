/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jn {
    static String field_a;
    static String field_b;
    static sm[] field_c;
    static String field_d;

    final static void a(int param0, int param1, int param2) {
        L0: {
          L1: {
            if (null == uk.field_a) {
              break L1;
            } else {
              if (param2 <= uk.field_a.length) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          uk.field_a = new int[2 * param2];
          break L0;
        }
        L2: {
          L3: {
            if (il.field_o == null) {
              break L3;
            } else {
              if (param2 <= il.field_o.length) {
                break L2;
              } else {
                break L3;
              }
            }
          }
          il.field_o = new int[2 * param2];
          break L2;
        }
        L4: {
          L5: {
            if (null == wh.field_y) {
              break L5;
            } else {
              if (param2 > wh.field_y.length) {
                break L5;
              } else {
                break L4;
              }
            }
          }
          wh.field_y = new int[param2 * 2];
          break L4;
        }
        L6: {
          L7: {
            if (vo.field_d == null) {
              break L7;
            } else {
              if (vo.field_d.length < param2) {
                break L7;
              } else {
                break L6;
              }
            }
          }
          vo.field_d = new int[param2 * 2];
          break L6;
        }
        L8: {
          L9: {
            if (null == vp.field_F) {
              break L9;
            } else {
              if (vp.field_F.length < param2) {
                break L9;
              } else {
                break L8;
              }
            }
          }
          vp.field_F = new int[param2 * 2];
          break L8;
        }
        L10: {
          L11: {
            if (ji.field_a == null) {
              break L11;
            } else {
              if (param2 > ji.field_a.length) {
                break L11;
              } else {
                break L10;
              }
            }
          }
          ji.field_a = new int[param2 * 2];
          break L10;
        }
        L12: {
          L13: {
            if (lp.field_g == null) {
              break L13;
            } else {
              if (param2 - -param0 <= lp.field_g.length) {
                break L12;
              } else {
                break L13;
              }
            }
          }
          lp.field_g = new int[2 * (param2 - -param0)];
          break L12;
        }
        L14: {
          L15: {
            if (null == go.field_s) {
              break L15;
            } else {
              if (param2 > go.field_s.length) {
                break L15;
              } else {
                break L14;
              }
            }
          }
          go.field_s = new boolean[2 * param2];
          break L14;
        }
        lj.field_d = 2147483647;
        qd.field_g = -2147483648;
        ga.field_c = 2147483647;
        mc.field_l = -2147483648;
        vg.field_o = 0;
    }

    public static void a() {
        field_c = null;
        int var1 = 0;
        field_b = null;
        field_d = null;
        field_a = null;
    }

    final static boolean a(CharSequence param0, byte param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        Object var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var4 = Torquing.field_u;
        try {
          L0: {
            int discarded$8 = 67;
            if (mn.a(param0, param2)) {
              L1: {
                var3_int = 0;
                if (param1 >= 97) {
                  break L1;
                } else {
                  var5 = null;
                  boolean discarded$9 = jn.a((CharSequence) null, (byte) 7, true);
                  break L1;
                }
              }
              L2: while (true) {
                if (var3_int >= param0.length()) {
                  stackOut_11_0 = 1;
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                } else {
                  if (co.a(47, param0.charAt(var3_int))) {
                    var3_int++;
                    continue L2;
                  } else {
                    stackOut_8_0 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    return stackIn_9_0 != 0;
                  }
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3;
            stackOut_13_1 = new StringBuilder().append("jn.A(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_12_0 != 0;
    }

    final static void b() {
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
        fn var9 = null;
        int var10 = 0;
        int stackIn_18_0 = 0;
        String stackIn_24_0 = null;
        int stackIn_28_0 = 0;
        String stackIn_33_0 = null;
        int stackIn_39_0 = 0;
        fn stackIn_43_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        String stackOut_23_0 = null;
        String stackOut_22_0 = null;
        int stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        String stackOut_32_0 = null;
        String stackOut_31_0 = null;
        int stackOut_38_0 = 0;
        int stackOut_37_0 = 0;
        fn stackOut_42_0 = null;
        fn stackOut_41_0 = null;
        var10 = Torquing.field_u;
        try {
          L0: {
            var1_int = a.field_d;
            var2 = 0;
            L1: {
              if (go.field_x != 2) {
                break L1;
              } else {
                var3_long = km.b(-1) - dc.field_c;
                var2 = (int)((10999L - var3_long) / 1000L);
                if (var2 >= 0) {
                  break L1;
                } else {
                  var2 = 0;
                  break L1;
                }
              }
            }
            var3 = 0;
            L2: while (true) {
              if (var3 >= wh.field_z.length) {
                break L0;
              } else {
                L3: {
                  var4 = mn.field_Z[var3];
                  if (var4 < 0) {
                    var5 = uf.field_c;
                    break L3;
                  } else {
                    if (~var4 != ~kb.field_g.field_g) {
                      var5 = cc.field_c;
                      break L3;
                    } else {
                      var5 = qa.field_l;
                      break L3;
                    }
                  }
                }
                L4: {
                  var6 = wh.field_z[var3];
                  if (go.field_x != 2) {
                    break L4;
                  } else {
                    if (var2 != 1) {
                      break L4;
                    } else {
                      L5: {
                        if (~qh.field_b.length < ~fd.field_k.length) {
                          stackOut_17_0 = qh.field_b.length;
                          stackIn_18_0 = stackOut_17_0;
                          break L5;
                        } else {
                          stackOut_16_0 = fd.field_k.length;
                          stackIn_18_0 = stackOut_16_0;
                          break L5;
                        }
                      }
                      L6: {
                        var7 = stackIn_18_0;
                        if (var3 < 6) {
                          break L6;
                        } else {
                          if (var3 < var7 + 6) {
                            L7: {
                              if (-var7 + (fd.field_k.length + (var3 - 6)) < 0) {
                                stackOut_23_0 = "";
                                stackIn_24_0 = stackOut_23_0;
                                break L7;
                              } else {
                                stackOut_22_0 = fd.field_k[-var7 + (-6 + var3 + fd.field_k.length)];
                                stackIn_24_0 = stackOut_22_0;
                                break L7;
                              }
                            }
                            var6 = stackIn_24_0;
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                      }
                      L8: {
                        if (me.field_a.length <= ib.field_c.length) {
                          stackOut_27_0 = ib.field_c.length;
                          stackIn_28_0 = stackOut_27_0;
                          break L8;
                        } else {
                          stackOut_26_0 = me.field_a.length;
                          stackIn_28_0 = stackOut_26_0;
                          break L8;
                        }
                      }
                      var8 = stackIn_28_0;
                      if (~var3 > ~(7 + var7)) {
                        break L4;
                      } else {
                        if (~(var7 + (7 - -var8)) >= ~var3) {
                          break L4;
                        } else {
                          L9: {
                            if (-7 + (var3 + -var7) >= ib.field_c.length) {
                              stackOut_32_0 = "";
                              stackIn_33_0 = stackOut_32_0;
                              break L9;
                            } else {
                              stackOut_31_0 = ib.field_c[var3 + (-7 + -var7)];
                              stackIn_33_0 = stackOut_31_0;
                              break L9;
                            }
                          }
                          var6 = stackIn_33_0;
                          break L4;
                        }
                      }
                    }
                  }
                }
                L10: {
                  if (var4 != -2) {
                    break L10;
                  } else {
                    var6 = Integer.toString(var2);
                    break L10;
                  }
                }
                L11: {
                  if (0 > var4) {
                    stackOut_38_0 = 0;
                    stackIn_39_0 = stackOut_38_0;
                    break L11;
                  } else {
                    stackOut_37_0 = 1;
                    stackIn_39_0 = stackOut_37_0;
                    break L11;
                  }
                }
                L12: {
                  var7 = mh.a(stackIn_39_0 != 0, -112, var6);
                  var8 = vk.field_A - (var7 >> 1);
                  if (var4 < 0) {
                    break L12;
                  } else {
                    L13: {
                      if (~kb.field_g.field_g != ~var4) {
                        stackOut_42_0 = id.field_b;
                        stackIn_43_0 = stackOut_42_0;
                        break L13;
                      } else {
                        stackOut_41_0 = kc.field_x;
                        stackIn_43_0 = stackOut_41_0;
                        break L13;
                      }
                    }
                    L14: {
                      var9 = stackIn_43_0;
                      var1_int = var1_int + hn.field_z;
                      if (var9 != null) {
                        var9.a(-aq.field_b + var8, (ln.field_D << 1) + kp.field_d, (aq.field_b << 1) + var7, (byte) 119, var1_int);
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                    var1_int = var1_int + ln.field_D;
                    break L12;
                  }
                }
                L15: {
                  if (0 <= var4) {
                    sp.field_Q.b(var6, var8, var1_int - -bi.field_p, var5, -1);
                    var1_int = var1_int + (hn.field_z + (ln.field_D + kp.field_d));
                    break L15;
                  } else {
                    bo.field_e.b(var6, var8, var1_int + bp.field_f, var5, -1);
                    var1_int = var1_int + bp.field_e;
                    break L15;
                  }
                }
                var3++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rb.a((Throwable) (Object) var1, "jn.C(" + 122 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "This password contains your Player Name, and would be easy to guess";
        field_b = "Return to game";
        field_d = "Unpacking models";
    }
}
