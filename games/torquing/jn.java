/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jn {
    static String field_a;
    static String field_b;
    static sm[] field_c;
    static String field_d;

    final static void a(int param0, int param1, int param2) {
        if (null != uk.field_a) {
            // if_icmple L29
        }
        uk.field_a = new int[2 * param2];
        if (il.field_o != null) {
            // if_icmple L57
        }
        il.field_o = new int[2 * param2];
        if (null != wh.field_y) {
            // if_icmpgt L75
        } else {
            wh.field_y = new int[param2 * 2];
        }
        if (param1 != 3328) {
            field_b = null;
        }
        if (vo.field_d != null) {
            // if_icmplt L117
        } else {
            vo.field_d = new int[param2 * 2];
        }
        if (null != vp.field_F) {
            // if_icmplt L143
        } else {
            vp.field_F = new int[param2 * 2];
        }
        if (ji.field_a != null) {
            // if_icmpgt L168
        } else {
            ji.field_a = new int[param2 * 2];
        }
        if (lp.field_g != null) {
            // if_icmple L210
        }
        lp.field_g = new int[2 * (param2 - -param0)];
        if (null != go.field_s) {
            // if_icmpgt L228
        } else {
            go.field_s = new boolean[2 * param2];
        }
        lj.field_d = 2147483647;
        qd.field_g = -2147483648;
        ga.field_c = 2147483647;
        mc.field_l = -2147483648;
        vg.field_o = 0;
    }

    public static void a(byte param0) {
        field_c = null;
        int var1 = 96 % ((param0 - -53) / 34);
        field_b = null;
        field_d = null;
        field_a = null;
    }

    final static boolean a(CharSequence param0, byte param1, boolean param2) {
        int var4 = Torquing.field_u;
        if (!mn.a(param0, param2, (byte) 67)) {
            return false;
        }
        int var3 = 0;
        if (param1 < 97) {
            Object var5 = null;
            boolean discarded$0 = jn.a((CharSequence) null, (byte) 7, true);
        }
        while (var3 < param0.length()) {
            if (!co.a(47, param0.charAt(var3))) {
                return false;
            }
            var3++;
        }
        return true;
    }

    final static void b(byte param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        long var3_long = 0L;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        String var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        fn var9 = null;
        int var10 = 0;
        int stackIn_17_0 = 0;
        String stackIn_23_0 = null;
        int stackIn_27_0 = 0;
        String stackIn_32_0 = null;
        int stackIn_38_0 = 0;
        fn stackIn_42_0 = null;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        String stackOut_22_0 = null;
        String stackOut_21_0 = null;
        int stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        String stackOut_31_0 = null;
        String stackOut_30_0 = null;
        int stackOut_37_0 = 0;
        int stackOut_36_0 = 0;
        fn stackOut_41_0 = null;
        fn stackOut_40_0 = null;
        var10 = Torquing.field_u;
        var1 = a.field_d;
        var2 = 0;
        if (param0 > 51) {
          L0: {
            if (go.field_x != 2) {
              break L0;
            } else {
              var3_long = km.b(-1) - dc.field_c;
              var2 = (int)((10999L - var3_long) / 1000L);
              if (var2 >= 0) {
                break L0;
              } else {
                var2 = 0;
                break L0;
              }
            }
          }
          var3 = 0;
          L1: while (true) {
            if (var3 >= wh.field_z.length) {
              return;
            } else {
              L2: {
                var4 = mn.field_Z[var3];
                if (-1 < (var4 ^ -1)) {
                  var5 = uf.field_c;
                  break L2;
                } else {
                  if (var4 != kb.field_g.field_g) {
                    var5 = cc.field_c;
                    break L2;
                  } else {
                    var5 = qa.field_l;
                    break L2;
                  }
                }
              }
              L3: {
                var6 = wh.field_z[var3];
                if (go.field_x != -3) {
                  break L3;
                } else {
                  if (-2 != var2) {
                    break L3;
                  } else {
                    L4: {
                      if (qh.field_b.length > fd.field_k.length) {
                        stackOut_16_0 = qh.field_b.length;
                        stackIn_17_0 = stackOut_16_0;
                        break L4;
                      } else {
                        stackOut_15_0 = fd.field_k.length;
                        stackIn_17_0 = stackOut_15_0;
                        break L4;
                      }
                    }
                    L5: {
                      var7 = stackIn_17_0;
                      if (var3 < 6) {
                        break L5;
                      } else {
                        if (var3 < var7 + 6) {
                          L6: {
                            if (-var7 + (fd.field_k.length + (var3 - 6)) < 0) {
                              stackOut_22_0 = "";
                              stackIn_23_0 = stackOut_22_0;
                              break L6;
                            } else {
                              stackOut_21_0 = fd.field_k[-var7 + (-6 + var3 + fd.field_k.length)];
                              stackIn_23_0 = stackOut_21_0;
                              break L6;
                            }
                          }
                          var6_ref = stackIn_23_0;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L7: {
                      if (me.field_a.length <= ib.field_c.length) {
                        stackOut_26_0 = ib.field_c.length;
                        stackIn_27_0 = stackOut_26_0;
                        break L7;
                      } else {
                        stackOut_25_0 = me.field_a.length;
                        stackIn_27_0 = stackOut_25_0;
                        break L7;
                      }
                    }
                    var8 = stackIn_27_0;
                    if (var3 < 7 + var7) {
                      break L3;
                    } else {
                      if (var7 + (7 - -var8) <= var3) {
                        break L3;
                      } else {
                        L8: {
                          if (-7 + (var3 + -var7) >= ib.field_c.length) {
                            stackOut_31_0 = "";
                            stackIn_32_0 = stackOut_31_0;
                            break L8;
                          } else {
                            stackOut_30_0 = ib.field_c[var3 + (-7 + -var7)];
                            stackIn_32_0 = stackOut_30_0;
                            break L8;
                          }
                        }
                        var6_ref = stackIn_32_0;
                        break L3;
                      }
                    }
                  }
                }
              }
              L9: {
                if (1 != (var4 ^ -1)) {
                  break L9;
                } else {
                  var6_ref = Integer.toString(var2);
                  break L9;
                }
              }
              L10: {
                if (0 > var4) {
                  stackOut_37_0 = 0;
                  stackIn_38_0 = stackOut_37_0;
                  break L10;
                } else {
                  stackOut_36_0 = 1;
                  stackIn_38_0 = stackOut_36_0;
                  break L10;
                }
              }
              L11: {
                var7 = mh.a(stackIn_38_0 != 0, -112, var6_ref);
                var8 = vk.field_A - (var7 >> -587630751);
                if ((var4 ^ -1) > -1) {
                  break L11;
                } else {
                  L12: {
                    if (kb.field_g.field_g != var4) {
                      stackOut_41_0 = id.field_b;
                      stackIn_42_0 = stackOut_41_0;
                      break L12;
                    } else {
                      stackOut_40_0 = kc.field_x;
                      stackIn_42_0 = stackOut_40_0;
                      break L12;
                    }
                  }
                  L13: {
                    var9 = stackIn_42_0;
                    var1 = var1 + hn.field_z;
                    if (var9 != null) {
                      var9.a(-aq.field_b + var8, (ln.field_D << 467515201) + kp.field_d, (aq.field_b << -257135199) + var7, (byte) 119, var1);
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                  var1 = var1 + ln.field_D;
                  break L11;
                }
              }
              if (0 <= var4) {
                sp.field_Q.b(var6_ref, var8, var1 - -bi.field_p, var5, -1);
                var1 = var1 + (hn.field_z + (ln.field_D + kp.field_d));
                var3++;
                continue L1;
              } else {
                bo.field_e.b(var6_ref, var8, var1 + bp.field_f, var5, -1);
                var1 = var1 + bp.field_e;
                var3++;
                continue L1;
              }
            }
          }
        } else {
          return;
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
