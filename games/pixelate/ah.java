/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ah extends lm {
    int field_t;
    static String field_u;

    final static aa a(byte param0, int param1, int param2, int param3) {
        Object var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        aa var8_ref_aa = null;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        String var10 = null;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        aa var16 = null;
        int stackIn_37_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_73_0 = 0;
        int stackIn_79_0 = 0;
        int stackIn_83_0 = 0;
        int stackOut_72_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_82_0 = 0;
        int stackOut_81_0 = 0;
        int stackOut_78_0 = 0;
        int stackOut_77_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_35_0 = 0;
        var13 = Pixelate.field_H ? 1 : 0;
        l.field_p.field_Fb.field_L.e(33);
        var4 = null;
        var5 = 0;
        var6 = 0;
        var7 = -1 + sd.field_L;
        L0: while (true) {
          if (var7 < 0) {
            var7 = 0;
            var8 = 0;
            L1: while (true) {
              if (sd.field_L <= var8) {
                var8 = l.field_p.field_Fb.field_nb - -l.field_p.field_Fb.field_Z + (-var7 + var6);
                l.field_p.field_Fb.field_nb = l.field_p.field_Fb.field_nb - var8;
                l.field_p.field_Fb.field_S = l.field_p.field_Fb.field_S + var8;
                if (!si.field_P) {
                  L2: {
                    l.field_p.field_Fb.field_Z = var7 + -l.field_p.field_Fb.field_nb;
                    if (si.field_P) {
                      l.field_p.field_Fb.field_wb = 0;
                      l.field_p.field_Fb.field_S = -l.field_p.field_Fb.field_nb + l.field_p.field_Ib.field_nb;
                      qo.field_z = true;
                      si.field_P = false;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if (!oo.field_d) {
                      break L3;
                    } else {
                      if (ko.field_eb == null) {
                        break L3;
                      } else {
                        qo.field_z = true;
                        var9 = -l.field_p.field_Fb.field_Z + -l.field_p.field_Fb.field_nb + l.field_p.field_Ib.field_nb;
                        if (qo.field_z) {
                          L4: {
                            l.field_p.field_Fb.field_wb = -l.field_p.field_Fb.field_S + var9;
                            l.field_p.a(-100, param1, true, param2 * 2 * param1);
                            if (var9 != l.field_p.field_Fb.field_S - -l.field_p.field_Fb.field_wb) {
                              stackOut_72_0 = 0;
                              stackIn_73_0 = stackOut_72_0;
                              break L4;
                            } else {
                              stackOut_71_0 = 1;
                              stackIn_73_0 = stackOut_71_0;
                              break L4;
                            }
                          }
                          qo.field_z = stackIn_73_0 != 0;
                          return (aa) var4;
                        } else {
                          L5: {
                            l.field_p.a(-100, param1, true, param2 * 2 * param1);
                            if (var9 != l.field_p.field_Fb.field_S - -l.field_p.field_Fb.field_wb) {
                              stackOut_68_0 = 0;
                              stackIn_69_0 = stackOut_68_0;
                              break L5;
                            } else {
                              stackOut_67_0 = 1;
                              stackIn_69_0 = stackOut_67_0;
                              break L5;
                            }
                          }
                          qo.field_z = stackIn_69_0 != 0;
                          return (aa) var4;
                        }
                      }
                    }
                  }
                  var9 = -l.field_p.field_Fb.field_Z + -l.field_p.field_Fb.field_nb + l.field_p.field_Ib.field_nb;
                  if (qo.field_z) {
                    L6: {
                      l.field_p.field_Fb.field_wb = -l.field_p.field_Fb.field_S + var9;
                      l.field_p.a(-100, param1, true, param2 * 2 * param1);
                      if (var9 != l.field_p.field_Fb.field_S - -l.field_p.field_Fb.field_wb) {
                        stackOut_82_0 = 0;
                        stackIn_83_0 = stackOut_82_0;
                        break L6;
                      } else {
                        stackOut_81_0 = 1;
                        stackIn_83_0 = stackOut_81_0;
                        break L6;
                      }
                    }
                    qo.field_z = stackIn_83_0 != 0;
                    return (aa) var4;
                  } else {
                    L7: {
                      l.field_p.a(-100, param1, true, param2 * 2 * param1);
                      if (var9 != l.field_p.field_Fb.field_S - -l.field_p.field_Fb.field_wb) {
                        stackOut_78_0 = 0;
                        stackIn_79_0 = stackOut_78_0;
                        break L7;
                      } else {
                        stackOut_77_0 = 1;
                        stackIn_79_0 = stackOut_77_0;
                        break L7;
                      }
                    }
                    qo.field_z = stackIn_79_0 != 0;
                    return (aa) var4;
                  }
                } else {
                  L8: {
                    l.field_p.field_Fb.field_nb = var7;
                    l.field_p.field_Fb.field_Z = var7 + -l.field_p.field_Fb.field_nb;
                    if (si.field_P) {
                      l.field_p.field_Fb.field_wb = 0;
                      l.field_p.field_Fb.field_S = -l.field_p.field_Fb.field_nb + l.field_p.field_Ib.field_nb;
                      qo.field_z = true;
                      si.field_P = false;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  if (oo.field_d) {
                    if (ko.field_eb == null) {
                      var9 = -l.field_p.field_Fb.field_Z + -l.field_p.field_Fb.field_nb + l.field_p.field_Ib.field_nb;
                      if (qo.field_z) {
                        L9: {
                          l.field_p.field_Fb.field_wb = -l.field_p.field_Fb.field_S + var9;
                          l.field_p.a(-100, param1, true, param2 * 2 * param1);
                          if (var9 != l.field_p.field_Fb.field_S - -l.field_p.field_Fb.field_wb) {
                            stackOut_57_0 = 0;
                            stackIn_58_0 = stackOut_57_0;
                            break L9;
                          } else {
                            stackOut_56_0 = 1;
                            stackIn_58_0 = stackOut_56_0;
                            break L9;
                          }
                        }
                        qo.field_z = stackIn_58_0 != 0;
                        return (aa) var4;
                      } else {
                        L10: {
                          l.field_p.a(-100, param1, true, param2 * 2 * param1);
                          if (var9 != l.field_p.field_Fb.field_S - -l.field_p.field_Fb.field_wb) {
                            stackOut_53_0 = 0;
                            stackIn_54_0 = stackOut_53_0;
                            break L10;
                          } else {
                            stackOut_52_0 = 1;
                            stackIn_54_0 = stackOut_52_0;
                            break L10;
                          }
                        }
                        qo.field_z = stackIn_54_0 != 0;
                        return (aa) var4;
                      }
                    } else {
                      L11: {
                        qo.field_z = true;
                        var9 = -l.field_p.field_Fb.field_Z + -l.field_p.field_Fb.field_nb + l.field_p.field_Ib.field_nb;
                        if (!qo.field_z) {
                          break L11;
                        } else {
                          l.field_p.field_Fb.field_wb = -l.field_p.field_Fb.field_S + var9;
                          break L11;
                        }
                      }
                      L12: {
                        l.field_p.a(-100, param1, true, param2 * 2 * param1);
                        if (var9 != l.field_p.field_Fb.field_S - -l.field_p.field_Fb.field_wb) {
                          stackOut_48_0 = 0;
                          stackIn_49_0 = stackOut_48_0;
                          break L12;
                        } else {
                          stackOut_47_0 = 1;
                          stackIn_49_0 = stackOut_47_0;
                          break L12;
                        }
                      }
                      qo.field_z = stackIn_49_0 != 0;
                      return (aa) var4;
                    }
                  } else {
                    var9 = -l.field_p.field_Fb.field_Z + -l.field_p.field_Fb.field_nb + l.field_p.field_Ib.field_nb;
                    if (qo.field_z) {
                      L13: {
                        l.field_p.field_Fb.field_wb = -l.field_p.field_Fb.field_S + var9;
                        l.field_p.a(-100, param1, true, param2 * 2 * param1);
                        if (var9 != l.field_p.field_Fb.field_S - -l.field_p.field_Fb.field_wb) {
                          stackOut_40_0 = 0;
                          stackIn_41_0 = stackOut_40_0;
                          break L13;
                        } else {
                          stackOut_39_0 = 1;
                          stackIn_41_0 = stackOut_39_0;
                          break L13;
                        }
                      }
                      qo.field_z = stackIn_41_0 != 0;
                      return (aa) var4;
                    } else {
                      L14: {
                        l.field_p.a(-100, param1, true, param2 * 2 * param1);
                        if (var9 != l.field_p.field_Fb.field_S - -l.field_p.field_Fb.field_wb) {
                          stackOut_36_0 = 0;
                          stackIn_37_0 = stackOut_36_0;
                          break L14;
                        } else {
                          stackOut_35_0 = 1;
                          stackIn_37_0 = stackOut_35_0;
                          break L14;
                        }
                      }
                      qo.field_z = stackIn_37_0 != 0;
                      return (aa) var4;
                    }
                  }
                }
              } else {
                var16 = de.field_e[var8];
                if (var16.field_q != null) {
                  L15: {
                    l.field_p.field_Fb.a(var16.field_q, (byte) 26);
                    var16.field_q.a(var7, param1, param3, 256, var16.field_q.g(0));
                    if (var16.field_q.field_P == 0) {
                      break L15;
                    } else {
                      var4 = (Object) (Object) var16;
                      break L15;
                    }
                  }
                  var7 = var7 + param1;
                  var8++;
                  continue L1;
                } else {
                  var8++;
                  continue L1;
                }
              }
            }
          } else {
            L16: {
              var8_ref_aa = de.field_e[var7];
              var9 = 0;
              if (ln.field_q) {
                break L16;
              } else {
                if (var5 < ee.field_d) {
                  var10_int = kl.a(var8_ref_aa.field_j, 0);
                  if (var8_ref_aa.a((byte) -54) < var10_int) {
                    break L16;
                  } else {
                    L17: {
                      if (var8_ref_aa.field_a) {
                        break L17;
                      } else {
                        if (i.a(-640, var8_ref_aa.field_n)) {
                          break L16;
                        } else {
                          break L17;
                        }
                      }
                    }
                    var9 = 1;
                    break L16;
                  }
                } else {
                  break L16;
                }
              }
            }
            if (var9 == 0) {
              var8_ref_aa.field_q = null;
              var7--;
              continue L0;
            } else {
              L18: {
                var5++;
                if (null == var8_ref_aa.field_q) {
                  break L18;
                } else {
                  if (si.field_P) {
                    break L18;
                  } else {
                    var7--;
                    var7--;
                    continue L0;
                  }
                }
              }
              L19: {
                if (var8_ref_aa.field_q != null) {
                  break L19;
                } else {
                  break L19;
                }
              }
              var10 = uc.a(var8_ref_aa, -77);
              var11 = var10 + jl.b(var8_ref_aa.field_g);
              var12 = lc.a(var8_ref_aa, false);
              var8_ref_aa.field_q = new ak(0L, oi.field_e, var11);
              var8_ref_aa.field_q.field_y = ((16711423 & oi.field_e.field_y) >> 1) + (var12 - (var12 >> 1 & 8355711));
              var8_ref_aa.field_q.field_N = var12;
              var6 = var6 + param1;
              var8_ref_aa.field_q.field_pb = ((oi.field_e.field_pb & 16711422) >> 1) + -((var12 & 16711422) >> 1) + var12;
              var8_ref_aa.field_q.field_Db = vl.field_Q;
              var7--;
              continue L0;
            }
          }
        }
    }

    final static void a(int param0, byte param1) {
        try {
            Throwable var2 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                Object discarded$1 = cq.a(ao.a(13867), (byte) -64, new Object[1], "resizing");
                break L0;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L1: {
                var2 = decompiledCaughtException;
                break L1;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    abstract Object a(byte param0);

    public static void g(int param0) {
        if (param0 != -520925311) {
            ah.g(-22);
            field_u = null;
            return;
        }
        field_u = null;
    }

    ah(int param0) {
        ((ah) this).field_t = param0;
    }

    abstract boolean b(boolean param0);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = "Highscores";
    }
}
