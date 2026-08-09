/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ah extends lm {
    int field_t;
    static String field_u;

    final static aa a(byte param0, int param1, int param2, int param3) {
        Object var4;
        int var5;
        int var6;
        int var7;
        aa var8_ref_aa;
        int var9;
        int var10_int;
        int var13;
        int stackIn_39_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_79_0 = 0;
        int stackIn_83_0 = 0;
        int stackIn_94_0 = 0;
        int stackIn_98_0 = 0;
        int stackIn_104_0 = 0;
        int stackIn_108_0 = 0;
        int var8;
        String var10;
        String var11;
        int var12;
        aa var14;
        aa var16;
        var13 = Pixelate.field_H ? 1 : 0;
        l.field_p.field_Fb.field_L.e(33);
        var4 = null;
        var5 = 0;
        var6 = 0;
        var7 = -1 + sd.field_L;
        L0: while (true) {
          if (-1 < (var7 ^ -1)) {
            var7 = 0;
            if (param0 < -90) {
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
                                stackIn_98_0 = 0;
                                break L4;
                              } else {
                                stackIn_98_0 = 1;
                                break L4;
                              }
                            }
                            qo.field_z = stackIn_98_0 != 0;
                            return (aa) (var4);
                          } else {
                            L5: {
                              l.field_p.a(-100, param1, true, param2 * 2 * param1);
                              if (var9 != l.field_p.field_Fb.field_S - -l.field_p.field_Fb.field_wb) {
                                stackIn_94_0 = 0;
                                break L5;
                              } else {
                                stackIn_94_0 = 1;
                                break L5;
                              }
                            }
                            qo.field_z = stackIn_94_0 != 0;
                            return (aa) (var4);
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
                          stackIn_108_0 = 0;
                          break L6;
                        } else {
                          stackIn_108_0 = 1;
                          break L6;
                        }
                      }
                      qo.field_z = stackIn_108_0 != 0;
                      return (aa) (var4);
                    } else {
                      L7: {
                        l.field_p.a(-100, param1, true, param2 * 2 * param1);
                        if (var9 != l.field_p.field_Fb.field_S - -l.field_p.field_Fb.field_wb) {
                          stackIn_104_0 = 0;
                          break L7;
                        } else {
                          stackIn_104_0 = 1;
                          break L7;
                        }
                      }
                      qo.field_z = stackIn_104_0 != 0;
                      return (aa) (var4);
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
                              stackIn_83_0 = 0;
                              break L9;
                            } else {
                              stackIn_83_0 = 1;
                              break L9;
                            }
                          }
                          qo.field_z = stackIn_83_0 != 0;
                          return (aa) (var4);
                        } else {
                          L10: {
                            l.field_p.a(-100, param1, true, param2 * 2 * param1);
                            if (var9 != l.field_p.field_Fb.field_S - -l.field_p.field_Fb.field_wb) {
                              stackIn_79_0 = 0;
                              break L10;
                            } else {
                              stackIn_79_0 = 1;
                              break L10;
                            }
                          }
                          qo.field_z = stackIn_79_0 != 0;
                          return (aa) (var4);
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
                            stackIn_74_0 = 0;
                            break L12;
                          } else {
                            stackIn_74_0 = 1;
                            break L12;
                          }
                        }
                        qo.field_z = stackIn_74_0 != 0;
                        return (aa) (var4);
                      }
                    } else {
                      var9 = -l.field_p.field_Fb.field_Z + -l.field_p.field_Fb.field_nb + l.field_p.field_Ib.field_nb;
                      if (qo.field_z) {
                        L13: {
                          l.field_p.field_Fb.field_wb = -l.field_p.field_Fb.field_S + var9;
                          l.field_p.a(-100, param1, true, param2 * 2 * param1);
                          if (var9 != l.field_p.field_Fb.field_S - -l.field_p.field_Fb.field_wb) {
                            stackIn_66_0 = 0;
                            break L13;
                          } else {
                            stackIn_66_0 = 1;
                            break L13;
                          }
                        }
                        qo.field_z = stackIn_66_0 != 0;
                        return (aa) (var4);
                      } else {
                        L14: {
                          l.field_p.a(-100, param1, true, param2 * 2 * param1);
                          if (var9 != l.field_p.field_Fb.field_S - -l.field_p.field_Fb.field_wb) {
                            stackIn_62_0 = 0;
                            break L14;
                          } else {
                            stackIn_62_0 = 1;
                            break L14;
                          }
                        }
                        qo.field_z = stackIn_62_0 != 0;
                        return (aa) (var4);
                      }
                    }
                  }
                } else {
                  var16 = de.field_e[var8];
                  if (var16.field_q != null) {
                    L15: {
                      l.field_p.field_Fb.a(var16.field_q, (byte) 26);
                      var16.field_q.a(var7, param1, param3, 256, var16.field_q.g(0));
                      if (-1 == (var16.field_q.field_P ^ -1)) {
                        break L15;
                      } else {
                        var4 = var16;
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
              ah.g(-107);
              var8 = 0;
              L16: while (true) {
                if (sd.field_L <= var8) {
                  L17: {
                    var8 = l.field_p.field_Fb.field_nb - -l.field_p.field_Fb.field_Z + (-var7 + var6);
                    l.field_p.field_Fb.field_nb = l.field_p.field_Fb.field_nb - var8;
                    l.field_p.field_Fb.field_S = l.field_p.field_Fb.field_S + var8;
                    if (!si.field_P) {
                      break L17;
                    } else {
                      l.field_p.field_Fb.field_nb = var7;
                      break L17;
                    }
                  }
                  L18: {
                    l.field_p.field_Fb.field_Z = var7 + -l.field_p.field_Fb.field_nb;
                    if (si.field_P) {
                      l.field_p.field_Fb.field_wb = 0;
                      l.field_p.field_Fb.field_S = -l.field_p.field_Fb.field_nb + l.field_p.field_Ib.field_nb;
                      qo.field_z = true;
                      si.field_P = false;
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                  L19: {
                    if (!oo.field_d) {
                      break L19;
                    } else {
                      if (ko.field_eb == null) {
                        break L19;
                      } else {
                        qo.field_z = true;
                        break L19;
                      }
                    }
                  }
                  var9 = -l.field_p.field_Fb.field_Z + -l.field_p.field_Fb.field_nb + l.field_p.field_Ib.field_nb;
                  if (!qo.field_z) {
                    L20: {
                      l.field_p.a(-100, param1, true, param2 * 2 * param1);
                      if (var9 != l.field_p.field_Fb.field_S - -l.field_p.field_Fb.field_wb) {
                        stackIn_43_0 = 0;
                        break L20;
                      } else {
                        stackIn_43_0 = 1;
                        break L20;
                      }
                    }
                    qo.field_z = stackIn_43_0 != 0;
                    return (aa) (var4);
                  } else {
                    L21: {
                      l.field_p.field_Fb.field_wb = -l.field_p.field_Fb.field_S + var9;
                      l.field_p.a(-100, param1, true, param2 * 2 * param1);
                      if (var9 != l.field_p.field_Fb.field_S - -l.field_p.field_Fb.field_wb) {
                        stackIn_39_0 = 0;
                        break L21;
                      } else {
                        stackIn_39_0 = 1;
                        break L21;
                      }
                    }
                    qo.field_z = stackIn_39_0 != 0;
                    return (aa) (var4);
                  }
                } else {
                  var14 = de.field_e[var8];
                  if (var14.field_q != null) {
                    L22: {
                      l.field_p.field_Fb.a(var14.field_q, (byte) 26);
                      var14.field_q.a(var7, param1, param3, 256, var14.field_q.g(0));
                      if (-1 == (var14.field_q.field_P ^ -1)) {
                        break L22;
                      } else {
                        var4 = var14;
                        break L22;
                      }
                    }
                    var7 = var7 + param1;
                    var8++;
                    continue L16;
                  } else {
                    var8++;
                    continue L16;
                  }
                }
              }
            }
          } else {
            L23: {
              var8_ref_aa = de.field_e[var7];
              var9 = 0;
              if (ln.field_q) {
                break L23;
              } else {
                if (var5 < ee.field_d) {
                  var10_int = kl.a(var8_ref_aa.field_j, 0);
                  if (var8_ref_aa.a((byte) -54) < var10_int) {
                    break L23;
                  } else {
                    L24: {
                      if (var8_ref_aa.field_a) {
                        break L24;
                      } else {
                        if (i.a(-640, var8_ref_aa.field_n)) {
                          break L23;
                        } else {
                          break L24;
                        }
                      }
                    }
                    var9 = 1;
                    break L23;
                  }
                } else {
                  break L23;
                }
              }
            }
            if (var9 == 0) {
              var8_ref_aa.field_q = null;
              var7--;
              continue L0;
            } else {
              L25: {
                var5++;
                if (null == var8_ref_aa.field_q) {
                  break L25;
                } else {
                  if (si.field_P) {
                    break L25;
                  } else {
                    var7--;
                    continue L0;
                  }
                }
              }
              L26: {
                if (var8_ref_aa.field_q != null) {
                  break L26;
                } else {
                  break L26;
                }
              }
              var10 = uc.a(var8_ref_aa, -77);
              var11 = var10 + jl.b(var8_ref_aa.field_g);
              var12 = lc.a(var8_ref_aa, false);
              var8_ref_aa.field_q = new ak(0L, oi.field_e, var11);
              var8_ref_aa.field_q.field_y = ((16711423 & oi.field_e.field_y) >> 1472347681) + (var12 - (var12 >> 1027916897 & 8355711));
              var8_ref_aa.field_q.field_N = var12;
              var6 = var6 + param1;
              var8_ref_aa.field_q.field_pb = ((oi.field_e.field_pb & 16711422) >> -520925311) + -((var12 & 16711422) >> 1066772193) + var12;
              var8_ref_aa.field_q.field_Db = vl.field_Q;
              var7--;
              continue L0;
            }
          }
        }
    }

    final static void a(int param0, byte param1) {
        try {
            Throwable throwable = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                cq.a(ao.a(13867), (byte) -64, new Object[]{new Integer(param0)}, "resizing");
                break L0;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L1: {
                throwable = decompiledCaughtException;
                break L1;
              }
            }
            if (param1 <= 69) {
              field_u = (String) null;
              return;
            } else {
              return;
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
        this.field_t = param0;
    }

    abstract boolean b(boolean param0);

    static {
        field_u = "Highscores";
    }
}
