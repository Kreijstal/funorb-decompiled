/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class eh {
    static char[] field_f;
    static String field_a;
    static int[] field_g;
    static String field_d;
    static volatile int field_c;
    static String field_b;
    static qb field_e;

    final static String[] a(boolean param0, char param1, String param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        CharSequence var10 = null;
        String[] stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        String[] stackOut_7_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var9 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            var10 = (CharSequence) (Object) param2;
            var3_int = wa.a(param1, var10, (byte) -16);
            var4 = new String[var3_int - -1];
            var5 = 0;
            var6 = 0;
            var7 = 0;
            L1: while (true) {
              if (var7 >= var3_int) {
                var4[var3_int] = param2.substring(var6);
                stackOut_7_0 = (String[]) var4;
                stackIn_8_0 = stackOut_7_0;
                break L0;
              } else {
                var8 = var6;
                L2: while (true) {
                  if (param1 == param2.charAt(var8)) {
                    int incrementValue$2 = var5;
                    var5++;
                    var4[incrementValue$2] = param2.substring(var6, var8);
                    var6 = var8 + 1;
                    var7++;
                    continue L1;
                  } else {
                    var8++;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("eh.F(").append(false).append(',').append(param1).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
        }
        return stackIn_8_0;
    }

    final static void b(byte param0) {
        ce var1 = (ce) (Object) lh.field_c.b(12623);
        int var2 = 0;
        if (var1 == null) {
            ka.b(false);
            return;
        }
        ab var3 = df.field_z;
        int discarded$0 = var3.d(-10674);
        int discarded$1 = var3.d(-10674);
        int discarded$2 = var3.d(-10674);
        int discarded$3 = var3.d(-10674);
        var1.a(true);
    }

    final static boolean a(boolean param0, int param1, int param2, int param3) {
        if (!(!wh.field_g)) {
            return ln.field_U.a(ed.field_Bb, (byte) 123, vn.field_d);
        }
        if (oj.field_i) {
            return rg.a(param3, -14, param2);
        }
        if (rk.a((byte) -60, param3, param2)) {
            return true;
        }
        if (!(!ld.field_p)) {
            return false;
        }
        return ko.a(-110, param1, param2);
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static String a(byte param0, int param1, String param2) {
        RuntimeException var3 = null;
        int var4 = 0;
        Object var5 = null;
        ab var6 = null;
        CharSequence var7 = null;
        String stackIn_3_0 = null;
        String stackIn_7_0 = null;
        String stackIn_11_0 = null;
        String stackIn_15_0 = null;
        String stackIn_19_0 = null;
        String stackIn_23_0 = null;
        Object stackIn_27_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        String stackOut_6_0 = null;
        String stackOut_10_0 = null;
        String stackOut_14_0 = null;
        String stackOut_18_0 = null;
        String stackOut_22_0 = null;
        Object stackOut_26_0 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        try {
          L0: {
            var7 = (CharSequence) (Object) param2;
            if (!vn.a(var7, 0)) {
              stackOut_2_0 = fn.field_h;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              if (je.a(16, param2)) {
                stackOut_6_0 = sd.field_l;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              } else {
                if (jb.field_t != 2) {
                  stackOut_10_0 = vi.field_K;
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0;
                } else {
                  if (sa.a(param2, 320)) {
                    stackOut_14_0 = tj.a(119, new String[1], sc.field_bb);
                    stackIn_15_0 = stackOut_14_0;
                    return stackIn_15_0;
                  } else {
                    if (pc.field_b >= 100) {
                      stackOut_18_0 = nh.field_u;
                      stackIn_19_0 = stackOut_18_0;
                      return stackIn_19_0;
                    } else {
                      if (kl.a(param2, 1)) {
                        stackOut_22_0 = tj.a(114, new String[1], ga.field_q);
                        stackIn_23_0 = stackOut_22_0;
                        return stackIn_23_0;
                      } else {
                        L1: {
                          var6 = he.field_e;
                          var6.b((byte) -67, param1);
                          var6.field_g = var6.field_g + 1;
                          var4 = var6.field_g;
                          var6.f(2, (byte) -70);
                          if (param0 < -14) {
                            break L1;
                          } else {
                            var5 = null;
                            String[] discarded$1 = eh.a(false, '￞', (String) null);
                            break L1;
                          }
                        }
                        var6.a(param2, 23333);
                        var6.b(-var4 + var6.field_g, (byte) 43);
                        stackOut_26_0 = null;
                        stackIn_27_0 = stackOut_26_0;
                        break L0;
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) var3;
            stackOut_28_1 = new StringBuilder().append("eh.A(").append(param0).append(',').append(param1).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param2 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L2;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L2;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + ')');
        }
        return (String) (Object) stackIn_27_0;
    }

    public static void a(byte param0) {
        field_g = null;
        int var1 = 0;
        field_d = null;
        field_b = null;
        field_e = null;
        field_f = null;
        field_a = null;
    }

    final static boolean a(int param0, eg param1) {
        RuntimeException var2 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_0_0 = false;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            stackOut_0_0 = param1.a(-27);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("eh.G(").append(18306).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    final static void a(boolean param0, boolean param1, int param2, int param3) {
        int var5 = 0;
        kc stackIn_4_0 = null;
        kc stackIn_5_0 = null;
        kc stackIn_6_0 = null;
        kc stackIn_7_0 = null;
        kc stackIn_8_0 = null;
        kc stackIn_9_0 = null;
        kc stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        kc stackIn_11_0 = null;
        kc stackIn_12_0 = null;
        kc stackIn_13_0 = null;
        kc stackIn_14_0 = null;
        kc stackIn_15_0 = null;
        kc stackIn_16_0 = null;
        kc stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        kc stackIn_18_0 = null;
        kc stackIn_19_0 = null;
        kc stackIn_20_0 = null;
        kc stackIn_21_0 = null;
        kc stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        kc stackOut_3_0 = null;
        kc stackOut_4_0 = null;
        kc stackOut_5_0 = null;
        kc stackOut_6_0 = null;
        kc stackOut_7_0 = null;
        kc stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        kc stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        kc stackOut_10_0 = null;
        kc stackOut_11_0 = null;
        kc stackOut_12_0 = null;
        kc stackOut_13_0 = null;
        kc stackOut_14_0 = null;
        kc stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        kc stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        kc stackOut_17_0 = null;
        kc stackOut_18_0 = null;
        kc stackOut_19_0 = null;
        kc stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        kc stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        L0: {
          var5 = ArcanistsMulti.field_G ? 1 : 0;
          vc.a((byte) -126);
          if (sk.field_e >= 0) {
            kg.field_c.field_rb = tj.a(-14, new String[1], gi.field_j);
            break L0;
          } else {
            kg.field_c.field_rb = null;
            break L0;
          }
        }
        L1: {
          L2: {
            stackOut_3_0 = k.field_d;
            stackIn_9_0 = stackOut_3_0;
            stackIn_4_0 = stackOut_3_0;
            if (!param0) {
              break L2;
            } else {
              stackOut_4_0 = (kc) (Object) stackIn_4_0;
              stackIn_9_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (param1) {
                break L2;
              } else {
                stackOut_5_0 = (kc) (Object) stackIn_5_0;
                stackIn_9_0 = stackOut_5_0;
                stackIn_6_0 = stackOut_5_0;
                if (pg.field_d) {
                  break L2;
                } else {
                  stackOut_6_0 = (kc) (Object) stackIn_6_0;
                  stackIn_9_0 = stackOut_6_0;
                  stackIn_7_0 = stackOut_6_0;
                  if (null != wi.field_f) {
                    break L2;
                  } else {
                    stackOut_7_0 = (kc) (Object) stackIn_7_0;
                    stackIn_9_0 = stackOut_7_0;
                    stackIn_8_0 = stackOut_7_0;
                    if (om.field_x != null) {
                      break L2;
                    } else {
                      stackOut_8_0 = (kc) (Object) stackIn_8_0;
                      stackOut_8_1 = 1;
                      stackIn_10_0 = stackOut_8_0;
                      stackIn_10_1 = stackOut_8_1;
                      break L1;
                    }
                  }
                }
              }
            }
          }
          stackOut_9_0 = (kc) (Object) stackIn_9_0;
          stackOut_9_1 = 0;
          stackIn_10_0 = stackOut_9_0;
          stackIn_10_1 = stackOut_9_1;
          break L1;
        }
        L3: {
          L4: {
            ((kc) (Object) stackIn_10_0).b(stackIn_10_1 != 0, (byte) 75);
            stackOut_10_0 = fn.field_e;
            stackIn_16_0 = stackOut_10_0;
            stackIn_11_0 = stackOut_10_0;
            if (!param0) {
              break L4;
            } else {
              stackOut_11_0 = (kc) (Object) stackIn_11_0;
              stackIn_16_0 = stackOut_11_0;
              stackIn_12_0 = stackOut_11_0;
              if (param1) {
                break L4;
              } else {
                stackOut_12_0 = (kc) (Object) stackIn_12_0;
                stackIn_16_0 = stackOut_12_0;
                stackIn_13_0 = stackOut_12_0;
                if (pg.field_d) {
                  break L4;
                } else {
                  stackOut_13_0 = (kc) (Object) stackIn_13_0;
                  stackIn_16_0 = stackOut_13_0;
                  stackIn_14_0 = stackOut_13_0;
                  if (null != wi.field_f) {
                    break L4;
                  } else {
                    stackOut_14_0 = (kc) (Object) stackIn_14_0;
                    stackIn_16_0 = stackOut_14_0;
                    stackIn_15_0 = stackOut_14_0;
                    if (null != om.field_x) {
                      break L4;
                    } else {
                      stackOut_15_0 = (kc) (Object) stackIn_15_0;
                      stackOut_15_1 = 1;
                      stackIn_17_0 = stackOut_15_0;
                      stackIn_17_1 = stackOut_15_1;
                      break L3;
                    }
                  }
                }
              }
            }
          }
          stackOut_16_0 = (kc) (Object) stackIn_16_0;
          stackOut_16_1 = 0;
          stackIn_17_0 = stackOut_16_0;
          stackIn_17_1 = stackOut_16_1;
          break L3;
        }
        L5: {
          L6: {
            ((kc) (Object) stackIn_17_0).b(stackIn_17_1 != 0, (byte) 121);
            stackOut_17_0 = gm.field_h;
            stackIn_21_0 = stackOut_17_0;
            stackIn_18_0 = stackOut_17_0;
            if (!param0) {
              break L6;
            } else {
              stackOut_18_0 = (kc) (Object) stackIn_18_0;
              stackIn_21_0 = stackOut_18_0;
              stackIn_19_0 = stackOut_18_0;
              if (param1) {
                break L6;
              } else {
                stackOut_19_0 = (kc) (Object) stackIn_19_0;
                stackIn_21_0 = stackOut_19_0;
                stackIn_20_0 = stackOut_19_0;
                if (!pg.field_d) {
                  break L6;
                } else {
                  stackOut_20_0 = (kc) (Object) stackIn_20_0;
                  stackOut_20_1 = 1;
                  stackIn_22_0 = stackOut_20_0;
                  stackIn_22_1 = stackOut_20_1;
                  break L5;
                }
              }
            }
          }
          stackOut_21_0 = (kc) (Object) stackIn_21_0;
          stackOut_21_1 = 0;
          stackIn_22_0 = stackOut_21_0;
          stackIn_22_1 = stackOut_21_1;
          break L5;
        }
        L7: {
          ((kc) (Object) stackIn_22_0).b(stackIn_22_1 != 0, (byte) 115);
          aj.field_h.field_c.h((byte) 100);
          if (0 == ii.field_b.field_U) {
            break L7;
          } else {
            dh.field_Mb = true;
            break L7;
          }
        }
        L8: {
          if (of.field_a.field_U == 0) {
            break L8;
          } else {
            L9: {
              if (gm.field_c) {
                break L9;
              } else {
                if (0 < ah.field_c) {
                  break L9;
                } else {
                  if (2 <= qf.field_d) {
                    if (ri.field_b[12]) {
                      break L9;
                    } else {
                      me.field_C = true;
                      break L8;
                    }
                  } else {
                    me.field_C = true;
                    break L8;
                  }
                }
              }
            }
            ib.a(param3, 0);
            break L8;
          }
        }
        L10: {
          if (0 != jl.field_a.field_U) {
            L11: {
              if (ao.field_h.length != 1) {
                break L11;
              } else {
                if (ef.field_t != ao.field_h[0]) {
                  ef.field_t = ao.field_h[0];
                  break L11;
                } else {
                  break L11;
                }
              }
            }
            dn.a(-13214, 0, ml.field_m, param3, ef.field_t, true);
            break L10;
          } else {
            break L10;
          }
        }
        L12: {
          if (0 != dm.field_E.field_U) {
            pg.field_d = false;
            break L12;
          } else {
            break L12;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Cancel rematch";
        field_b = "Enter the name you'd prefer. This is the name displayed to other players.";
        field_f = new char[]{'[', ']', '#'};
        field_g = new int[]{1, 2, 2, 3, 5, 10, 2, 2, 2, 2, 3, 3, 5, 5, 10, 3, 3, 3, 1, 1, 1, 1, 1, 1, 1, 1, 2, 3, 2, 3, 5, 1, 3, 1, 3, 1, 5, 3, 3, 5, 3, 1, 1, 5, 3, 5, 10, 10, 10, 1, 1, 1, 1, 1, 1, 5, 1, 2, 2, 2, 2, 2, 4, 4, 2, 2, 4, 5, 5, 1, 1, 4, 2, 3, 4, 1, 1, 4, 5, 2, 5, 1, 3, 3, 5, 1, 3, 1, 3, 3, 4, 2, 3, 3, 3};
        field_a = "Password: ";
        field_c = 0;
    }
}
