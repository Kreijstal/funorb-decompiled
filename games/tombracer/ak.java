/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ak extends ela {
    static int[] field_p;
    static Object field_o;

    final bfa a(bfa[] param0, int param1) {
        RuntimeException var3 = null;
        bfa stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        bfa stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                field_o = (Object) null;
                break L1;
              }
            }
            stackOut_2_0 = new bfa(qla.a(true, (String) (param0[0].field_d)));
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("ak.A(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final static nh[] a(ha param0, jpa[] param1, int param2) {
        nh[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        nh[] var6 = null;
        Object stackIn_3_0 = null;
        nh[] stackIn_9_0 = null;
        nh[] stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        nh[] stackOut_8_0 = null;
        nh[] stackOut_11_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (param1 != null) {
              L1: {
                var6 = new nh[param1.length];
                var3 = var6;
                if (param2 <= -54) {
                  break L1;
                } else {
                  field_p = (int[]) null;
                  break L1;
                }
              }
              var4 = 0;
              L2: while (true) {
                L3: {
                  L4: {
                    if (var6.length <= var4) {
                      break L4;
                    } else {
                      stackOut_8_0 = (nh[]) (var3);
                      stackIn_12_0 = stackOut_8_0;
                      stackIn_9_0 = stackOut_8_0;
                      if (var5 != 0) {
                        break L3;
                      } else {
                        stackIn_9_0[var4] = su.a(param1[var4], param0, (byte) 2);
                        var4++;
                        if (var5 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  stackOut_11_0 = (nh[]) (var3);
                  stackIn_12_0 = stackOut_11_0;
                  break L3;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var3_ref);
            stackOut_13_1 = new StringBuilder().append("ak.G(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          L6: {
            stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (nh[]) ((Object) stackIn_3_0);
        } else {
          return stackIn_12_0;
        }
    }

    public static void f(int param0) {
        field_o = null;
        if (param0 > -19) {
            return;
        }
        field_p = null;
    }

    ak(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void g(int param0) {
        int var1 = 0;
        int var2 = 0;
        var2 = TombRacer.field_G ? 1 : 0;
        nfa.field_p = false;
        if (param0 == 0) {
          sea.field_o = null;
          if (!jf.field_r) {
            var1 = lsa.field_a;
            if (0 < var1) {
              if ((var1 ^ -1) != -2) {
                sea.field_o = gl.a((byte) 100, nw.field_s, new String[]{Integer.toString(var1)});
                sea.field_o = uj.a((byte) 121, new CharSequence[]{(CharSequence) ((Object) sea.field_o), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) rpa.field_j)});
                ci.field_l.i((byte) 101);
                wt.a((byte) -117);
                return;
              } else {
                sea.field_o = aga.field_a;
                if (var2 != 0) {
                  sea.field_o = gl.a((byte) 100, nw.field_s, new String[]{Integer.toString(var1)});
                  sea.field_o = uj.a((byte) 121, new CharSequence[]{(CharSequence) ((Object) sea.field_o), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) rpa.field_j)});
                  ci.field_l.i((byte) 101);
                  wt.a((byte) -117);
                  return;
                } else {
                  sea.field_o = uj.a((byte) 121, new CharSequence[]{(CharSequence) ((Object) sea.field_o), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) rpa.field_j)});
                  ci.field_l.i((byte) 101);
                  wt.a((byte) -117);
                  return;
                }
              }
            } else {
              ci.field_l.i((byte) 101);
              wt.a((byte) -117);
              return;
            }
          } else {
            ci.field_l.f(true);
            if (var2 != 0) {
              var1 = lsa.field_a;
              if (0 < var1) {
                if ((var1 ^ -1) != -2) {
                  sea.field_o = gl.a((byte) 100, nw.field_s, new String[]{Integer.toString(var1)});
                  sea.field_o = uj.a((byte) 121, new CharSequence[]{(CharSequence) ((Object) sea.field_o), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) rpa.field_j)});
                  ci.field_l.i((byte) 101);
                  wt.a((byte) -117);
                  return;
                } else {
                  sea.field_o = aga.field_a;
                  sea.field_o = gl.a((byte) 100, nw.field_s, new String[]{Integer.toString(var1)});
                  sea.field_o = uj.a((byte) 121, new CharSequence[]{(CharSequence) ((Object) sea.field_o), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) rpa.field_j)});
                  ci.field_l.i((byte) 101);
                  wt.a((byte) -117);
                  return;
                }
              } else {
                ci.field_l.i((byte) 101);
                wt.a((byte) -117);
                return;
              }
            } else {
              return;
            }
          }
        } else {
          field_o = (Object) null;
          sea.field_o = null;
          if (jf.field_r) {
            ci.field_l.f(true);
            if (var2 != 0) {
              var1 = lsa.field_a;
              if (0 < var1) {
                if ((var1 ^ -1) != -2) {
                  sea.field_o = gl.a((byte) 100, nw.field_s, new String[]{Integer.toString(var1)});
                  sea.field_o = uj.a((byte) 121, new CharSequence[]{(CharSequence) ((Object) sea.field_o), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) rpa.field_j)});
                  ci.field_l.i((byte) 101);
                  wt.a((byte) -117);
                  return;
                } else {
                  sea.field_o = aga.field_a;
                  if (var2 == 0) {
                    sea.field_o = uj.a((byte) 121, new CharSequence[]{(CharSequence) ((Object) sea.field_o), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) rpa.field_j)});
                    ci.field_l.i((byte) 101);
                    wt.a((byte) -117);
                    return;
                  } else {
                    sea.field_o = gl.a((byte) 100, nw.field_s, new String[]{Integer.toString(var1)});
                    sea.field_o = uj.a((byte) 121, new CharSequence[]{(CharSequence) ((Object) sea.field_o), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) rpa.field_j)});
                    ci.field_l.i((byte) 101);
                    wt.a((byte) -117);
                    return;
                  }
                }
              } else {
                ci.field_l.i((byte) 101);
                wt.a((byte) -117);
                return;
              }
            } else {
              return;
            }
          } else {
            L0: {
              var1 = lsa.field_a;
              if (0 >= var1) {
                break L0;
              } else {
                L1: {
                  if ((var1 ^ -1) != -2) {
                    break L1;
                  } else {
                    sea.field_o = aga.field_a;
                    if (var2 == 0) {
                      sea.field_o = uj.a((byte) 121, new CharSequence[]{(CharSequence) ((Object) sea.field_o), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) rpa.field_j)});
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
                sea.field_o = gl.a((byte) 100, nw.field_s, new String[]{Integer.toString(var1)});
                sea.field_o = uj.a((byte) 121, new CharSequence[]{(CharSequence) ((Object) sea.field_o), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) rpa.field_j)});
                break L0;
              }
            }
            ci.field_l.i((byte) 101);
            wt.a((byte) -117);
            return;
          }
        }
    }

    final static int a(int param0, byte param1) {
        int var2 = 0;
        var2 = 113 / ((-14 - param1) / 40);
        if (qg.field_a.length > param0) {
          if (param0 < 0) {
            return -1;
          } else {
            return qg.field_a[param0].field_a;
          }
        } else {
          return -1;
        }
    }

    static {
    }
}
