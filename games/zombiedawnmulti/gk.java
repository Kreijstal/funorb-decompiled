/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gk {
    static int field_c;
    static String field_a;
    static int field_b;

    final static nc a(int param0, int param1) {
        if (param0 != 2) {
            field_c = 127;
            return mj.field_Hb[param1];
        }
        return mj.field_Hb[param1];
    }

    public static void a(int param0) {
        if (param0 <= 38) {
            return;
        }
        field_a = null;
    }

    final static void a(byte param0) {
        sc.d((byte) 87);
        if (param0 != 16) {
            gk.a(-7);
        }
    }

    final static void a(boolean param0, int param1, String param2, int param3, boolean param4) {
        RuntimeException var5 = null;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        String stackIn_4_0 = null;
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        int stackIn_39_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_45_1 = 0;
        int stackIn_48_0 = 0;
        int stackIn_48_1 = 0;
        int stackIn_50_0 = 0;
        int stackIn_50_1 = 0;
        int stackIn_51_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_53_1 = 0;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        String stackIn_61_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        String stackOut_2_0 = null;
        int stackOut_44_0 = 0;
        int stackOut_44_1 = 0;
        int stackOut_35_0 = 0;
        int stackOut_35_1 = 0;
        int stackOut_38_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_47_1 = 0;
        int stackOut_50_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_52_1 = 0;
        int stackOut_51_0 = 0;
        int stackOut_51_1 = 0;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        String stackOut_60_2 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        String stackOut_59_2 = null;
        var10 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              jg.field_a = true;
              ic.field_d = param3;
              var11 = param2;
              if (param4) {
                stackOut_3_0 = wf.field_n;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = p.field_b;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var6 = stackIn_4_0;
              if (ic.field_d == 0) {
                var7 = mb.a(e.field_c, false, var11, lj.field_t, 480);
                var8 = 3 + var7;
                dn.field_a = new int[var8];
                eo.field_e = new String[var8];
                var9 = 0;
                L3: while (true) {
                  L4: {
                    if (var9 >= var8) {
                      oq.field_x = new int[2];
                      break L4;
                    } else {
                      dn.field_a[var9] = -1;
                      var9++;
                      if (var10 != 0) {
                        break L4;
                      } else {
                        continue L3;
                      }
                    }
                  }
                  var9 = 0;
                  L5: while (true) {
                    L6: {
                      if (var7 <= var9) {
                        eo.field_e[-3 + var8] = "";
                        eo.field_e[-2 + var8] = var6;
                        dn.field_a[-2 + var8] = 0;
                        oq.field_x[0] = 1;
                        eo.field_e[var8 + -1] = ic.field_f;
                        dn.field_a[-1 + var8] = 1;
                        break L6;
                      } else {
                        eo.field_e[var9] = lj.field_t[var9];
                        var9++;
                        if (var10 != 0) {
                          break L6;
                        } else {
                          continue L5;
                        }
                      }
                    }
                    oq.field_x[1] = 2;
                    break L2;
                  }
                }
              } else {
                L7: {
                  if (1 != ic.field_d) {
                    break L7;
                  } else {
                    var7 = mb.a(e.field_c, false, var11, lj.field_t, 480);
                    var8 = var7 + 2;
                    dn.field_a = new int[var8];
                    eo.field_e = new String[var8];
                    var9 = 0;
                    L8: while (true) {
                      L9: {
                        if (var9 >= var8) {
                          oq.field_x = new int[1];
                          break L9;
                        } else {
                          dn.field_a[var9] = -1;
                          var9++;
                          if (var10 != 0) {
                            break L9;
                          } else {
                            continue L8;
                          }
                        }
                      }
                      var9 = 0;
                      L10: while (true) {
                        L11: {
                          if (var9 >= var7) {
                            eo.field_e[var8 - 2] = "";
                            eo.field_e[-1 + var8] = ic.field_f;
                            dn.field_a[var8 - 1] = 0;
                            oq.field_x[0] = 2;
                            break L11;
                          } else {
                            eo.field_e[var9] = lj.field_t[var9];
                            var9++;
                            if (var10 != 0) {
                              break L11;
                            } else {
                              continue L10;
                            }
                          }
                        }
                        if (var10 == 0) {
                          break L2;
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                }
                throw new IllegalArgumentException();
              }
            }
            mo.field_Jb.field_c = oq.field_x.length;
            var7 = 0;
            var8 = 0;
            L12: while (true) {
              L13: {
                if (var8 >= eo.field_e.length) {
                  pl.field_F = mo.field_Jb.field_c * (ne.field_tb + pb.field_b << 2059566049);
                  mc.field_e = aq.field_x - (-var7 + (var7 >> 577309889));
                  stackOut_44_0 = -(var7 >> 2026215201);
                  stackOut_44_1 = aq.field_x;
                  stackIn_45_0 = stackOut_44_0;
                  stackIn_45_1 = stackOut_44_1;
                  break L13;
                } else {
                  stackOut_35_0 = -1;
                  stackOut_35_1 = dn.field_a[var8] ^ -1;
                  stackIn_45_0 = stackOut_35_0;
                  stackIn_45_1 = stackOut_35_1;
                  stackIn_36_0 = stackOut_35_0;
                  stackIn_36_1 = stackOut_35_1;
                  if (var10 != 0) {
                    break L13;
                  } else {
                    L14: {
                      if (stackIn_36_0 < stackIn_36_1) {
                        stackOut_38_0 = 0;
                        stackIn_39_0 = stackOut_38_0;
                        break L14;
                      } else {
                        stackOut_37_0 = 1;
                        stackIn_39_0 = stackOut_37_0;
                        break L14;
                      }
                    }
                    L15: {
                      var9 = vh.a(stackIn_39_0 != 0, -36, eo.field_e[var8]);
                      if (-1 == dn.field_a[var8]) {
                        break L15;
                      } else {
                        var9 = var9 + wb.field_db * 2;
                        break L15;
                      }
                    }
                    L16: {
                      if (var9 <= var7) {
                        break L16;
                      } else {
                        var7 = var9;
                        break L16;
                      }
                    }
                    var8++;
                    continue L12;
                  }
                }
              }
              ch.field_i = stackIn_45_0 + stackIn_45_1;
              var8 = 0;
              L17: while (true) {
                L18: {
                  L19: {
                    if (var8 >= eo.field_e.length) {
                      if (param1 == 2) {
                        break L18;
                      } else {
                        break L19;
                      }
                    } else {
                      stackOut_47_0 = pl.field_F;
                      stackOut_47_1 = dn.field_a[var8];
                      stackIn_50_0 = stackOut_47_0;
                      stackIn_50_1 = stackOut_47_1;
                      stackIn_48_0 = stackOut_47_0;
                      stackIn_48_1 = stackOut_47_1;
                      if (var10 == 0) {
                        L20: {
                          stackOut_50_0 = stackIn_50_0;
                          stackIn_52_0 = stackOut_50_0;
                          stackIn_51_0 = stackOut_50_0;
                          if (stackIn_50_1 < 0) {
                            stackOut_52_0 = stackIn_52_0;
                            stackOut_52_1 = dq.field_l;
                            stackIn_53_0 = stackOut_52_0;
                            stackIn_53_1 = stackOut_52_1;
                            break L20;
                          } else {
                            stackOut_51_0 = stackIn_51_0;
                            stackOut_51_1 = po.field_n;
                            stackIn_53_0 = stackOut_51_0;
                            stackIn_53_1 = stackOut_51_1;
                            break L20;
                          }
                        }
                        pl.field_F = stackIn_53_0 + stackIn_53_1;
                        var8++;
                        continue L17;
                      } else {
                        if (stackIn_48_0 == stackIn_48_1) {
                          break L18;
                        } else {
                          break L19;
                        }
                      }
                    }
                  }
                  gk.a((byte) -33);
                  break L18;
                }
                eb.field_M = -(pl.field_F >> -2077899647) + pm.field_Q;
                mo.field_Jb.a(0, param0, -31458, aj.a(bo.field_d, false, bd.field_g));
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L21: {
            var5 = decompiledCaughtException;
            stackOut_58_0 = (RuntimeException) (var5);
            stackOut_58_1 = new StringBuilder().append("gk.A(").append(param0).append(',').append(param1).append(',');
            stackIn_60_0 = stackOut_58_0;
            stackIn_60_1 = stackOut_58_1;
            stackIn_59_0 = stackOut_58_0;
            stackIn_59_1 = stackOut_58_1;
            if (param2 == null) {
              stackOut_60_0 = (RuntimeException) ((Object) stackIn_60_0);
              stackOut_60_1 = (StringBuilder) ((Object) stackIn_60_1);
              stackOut_60_2 = "null";
              stackIn_61_0 = stackOut_60_0;
              stackIn_61_1 = stackOut_60_1;
              stackIn_61_2 = stackOut_60_2;
              break L21;
            } else {
              stackOut_59_0 = (RuntimeException) ((Object) stackIn_59_0);
              stackOut_59_1 = (StringBuilder) ((Object) stackIn_59_1);
              stackOut_59_2 = "{...}";
              stackIn_61_0 = stackOut_59_0;
              stackIn_61_1 = stackOut_59_1;
              stackIn_61_2 = stackOut_59_2;
              break L21;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_61_0), stackIn_61_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_a = "Cancel";
    }
}
