/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.awt.Canvas;

final class bq extends rqa {
    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        Object stackIn_2_0 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        nc stackOut_3_0 = null;
        Object stackOut_1_0 = null;
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
            if (param1 <= -119) {
              si.a(232, 62, param0[0].a(79));
              stackOut_3_0 = new nc((Object) (Object) "void");
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (nc) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("bq.A(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    bq(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(boolean param0, boolean param1, int param2, int param3) {
        Object var4 = null;
        int var5 = 0;
        Object stackIn_15_0 = null;
        Object stackIn_28_0 = null;
        Object stackIn_41_0 = null;
        Object stackIn_57_0 = null;
        Object stackIn_70_0 = null;
        Object stackIn_83_0 = null;
        Object stackIn_93_0 = null;
        Object stackIn_98_0 = null;
        ufb stackOut_82_0 = null;
        java.awt.Canvas stackOut_81_0 = null;
        ufb stackOut_97_0 = null;
        java.awt.Canvas stackOut_96_0 = null;
        ufb stackOut_92_0 = null;
        java.awt.Canvas stackOut_91_0 = null;
        ufb stackOut_69_0 = null;
        java.awt.Canvas stackOut_68_0 = null;
        ufb stackOut_56_0 = null;
        java.awt.Canvas stackOut_55_0 = null;
        ufb stackOut_40_0 = null;
        java.awt.Canvas stackOut_39_0 = null;
        ufb stackOut_14_0 = null;
        java.awt.Canvas stackOut_13_0 = null;
        ufb stackOut_27_0 = null;
        java.awt.Canvas stackOut_26_0 = null;
        var5 = VoidHunters.field_G;
        uqb.field_h = param2 >> 1;
        if (!param0) {
          bq.a(false, true, -60, -60);
          stb.field_p = param3 >> 1;
          if (iha.e(0)) {
            L0: {
              if (!param1) {
                break L0;
              } else {
                if (!upa.field_a) {
                  jea.a(6045);
                  if (!upa.field_a) {
                    noa.field_q = uia.field_b;
                    pk.field_o = kc.field_b;
                    sab.field_o = hu.field_b;
                    ujb.field_c = pba.field_o;
                    return;
                  } else {
                    L1: {
                      if (~uqb.field_h != ~kc.field_b) {
                        break L1;
                      } else {
                        if (stb.field_p != uia.field_b) {
                          break L1;
                        } else {
                          sab.field_o = hu.field_b;
                          ujb.field_c = pba.field_o;
                          return;
                        }
                      }
                    }
                    L2: {
                      noa.field_q = noa.field_q + (-stb.field_p + uia.field_b);
                      pk.field_o = pk.field_o + (kc.field_b + -uqb.field_h);
                      pk.field_o = Math.max(0, Math.min(param2 + -1, pk.field_o));
                      noa.field_q = Math.max(0, Math.min(param3 - 1, noa.field_q));
                      if (null != psb.field_b) {
                        stackOut_82_0 = psb.field_b;
                        stackIn_83_0 = (Object) (Object) stackOut_82_0;
                        break L2;
                      } else {
                        stackOut_81_0 = igb.field_a;
                        stackIn_83_0 = (Object) (Object) stackOut_81_0;
                        break L2;
                      }
                    }
                    var4 = stackIn_83_0;
                    mob discarded$16 = bm.field_o.a((java.awt.Component) var4, stb.field_p, uqb.field_h, 14);
                    sab.field_o = hu.field_b;
                    ujb.field_c = pba.field_o;
                    return;
                  }
                } else {
                  break L0;
                }
              }
            }
            if (!param1) {
              if (upa.field_a) {
                brb.e((byte) -128);
                if (!upa.field_a) {
                  noa.field_q = uia.field_b;
                  pk.field_o = kc.field_b;
                  sab.field_o = hu.field_b;
                  ujb.field_c = pba.field_o;
                  return;
                } else {
                  if (~uqb.field_h == ~kc.field_b) {
                    if (stb.field_p == uia.field_b) {
                      sab.field_o = hu.field_b;
                      ujb.field_c = pba.field_o;
                      return;
                    } else {
                      L3: {
                        noa.field_q = noa.field_q + (-stb.field_p + uia.field_b);
                        pk.field_o = pk.field_o + (kc.field_b + -uqb.field_h);
                        pk.field_o = Math.max(0, Math.min(param2 + -1, pk.field_o));
                        noa.field_q = Math.max(0, Math.min(param3 - 1, noa.field_q));
                        if (null != psb.field_b) {
                          stackOut_97_0 = psb.field_b;
                          stackIn_98_0 = (Object) (Object) stackOut_97_0;
                          break L3;
                        } else {
                          stackOut_96_0 = igb.field_a;
                          stackIn_98_0 = (Object) (Object) stackOut_96_0;
                          break L3;
                        }
                      }
                      var4 = stackIn_98_0;
                      mob discarded$17 = bm.field_o.a((java.awt.Component) var4, stb.field_p, uqb.field_h, 14);
                      sab.field_o = hu.field_b;
                      ujb.field_c = pba.field_o;
                      return;
                    }
                  } else {
                    L4: {
                      noa.field_q = noa.field_q + (-stb.field_p + uia.field_b);
                      pk.field_o = pk.field_o + (kc.field_b + -uqb.field_h);
                      pk.field_o = Math.max(0, Math.min(param2 + -1, pk.field_o));
                      noa.field_q = Math.max(0, Math.min(param3 - 1, noa.field_q));
                      if (null != psb.field_b) {
                        stackOut_92_0 = psb.field_b;
                        stackIn_93_0 = (Object) (Object) stackOut_92_0;
                        break L4;
                      } else {
                        stackOut_91_0 = igb.field_a;
                        stackIn_93_0 = (Object) (Object) stackOut_91_0;
                        break L4;
                      }
                    }
                    var4 = stackIn_93_0;
                    mob discarded$18 = bm.field_o.a((java.awt.Component) var4, stb.field_p, uqb.field_h, 14);
                    sab.field_o = hu.field_b;
                    ujb.field_c = pba.field_o;
                    return;
                  }
                }
              } else {
                if (!upa.field_a) {
                  noa.field_q = uia.field_b;
                  pk.field_o = kc.field_b;
                  sab.field_o = hu.field_b;
                  ujb.field_c = pba.field_o;
                  return;
                } else {
                  L5: {
                    if (~uqb.field_h != ~kc.field_b) {
                      break L5;
                    } else {
                      if (stb.field_p != uia.field_b) {
                        break L5;
                      } else {
                        sab.field_o = hu.field_b;
                        ujb.field_c = pba.field_o;
                        return;
                      }
                    }
                  }
                  L6: {
                    noa.field_q = noa.field_q + (-stb.field_p + uia.field_b);
                    pk.field_o = pk.field_o + (kc.field_b + -uqb.field_h);
                    pk.field_o = Math.max(0, Math.min(param2 + -1, pk.field_o));
                    noa.field_q = Math.max(0, Math.min(param3 - 1, noa.field_q));
                    if (null != psb.field_b) {
                      stackOut_69_0 = psb.field_b;
                      stackIn_70_0 = (Object) (Object) stackOut_69_0;
                      break L6;
                    } else {
                      stackOut_68_0 = igb.field_a;
                      stackIn_70_0 = (Object) (Object) stackOut_68_0;
                      break L6;
                    }
                  }
                  var4 = stackIn_70_0;
                  mob discarded$19 = bm.field_o.a((java.awt.Component) var4, stb.field_p, uqb.field_h, 14);
                  sab.field_o = hu.field_b;
                  ujb.field_c = pba.field_o;
                  return;
                }
              }
            } else {
              if (!upa.field_a) {
                noa.field_q = uia.field_b;
                pk.field_o = kc.field_b;
                sab.field_o = hu.field_b;
                ujb.field_c = pba.field_o;
                return;
              } else {
                L7: {
                  if (~uqb.field_h != ~kc.field_b) {
                    break L7;
                  } else {
                    if (stb.field_p != uia.field_b) {
                      break L7;
                    } else {
                      sab.field_o = hu.field_b;
                      ujb.field_c = pba.field_o;
                      return;
                    }
                  }
                }
                L8: {
                  noa.field_q = noa.field_q + (-stb.field_p + uia.field_b);
                  pk.field_o = pk.field_o + (kc.field_b + -uqb.field_h);
                  pk.field_o = Math.max(0, Math.min(param2 + -1, pk.field_o));
                  noa.field_q = Math.max(0, Math.min(param3 - 1, noa.field_q));
                  if (null != psb.field_b) {
                    stackOut_56_0 = psb.field_b;
                    stackIn_57_0 = (Object) (Object) stackOut_56_0;
                    break L8;
                  } else {
                    stackOut_55_0 = igb.field_a;
                    stackIn_57_0 = (Object) (Object) stackOut_55_0;
                    break L8;
                  }
                }
                var4 = stackIn_57_0;
                mob discarded$20 = bm.field_o.a((java.awt.Component) var4, stb.field_p, uqb.field_h, 14);
                sab.field_o = hu.field_b;
                ujb.field_c = pba.field_o;
                return;
              }
            }
          } else {
            if (!upa.field_a) {
              noa.field_q = uia.field_b;
              pk.field_o = kc.field_b;
              sab.field_o = hu.field_b;
              ujb.field_c = pba.field_o;
              return;
            } else {
              L9: {
                if (~uqb.field_h != ~kc.field_b) {
                  break L9;
                } else {
                  if (stb.field_p != uia.field_b) {
                    break L9;
                  } else {
                    sab.field_o = hu.field_b;
                    ujb.field_c = pba.field_o;
                    return;
                  }
                }
              }
              L10: {
                noa.field_q = noa.field_q + (-stb.field_p + uia.field_b);
                pk.field_o = pk.field_o + (kc.field_b + -uqb.field_h);
                pk.field_o = Math.max(0, Math.min(param2 + -1, pk.field_o));
                noa.field_q = Math.max(0, Math.min(param3 - 1, noa.field_q));
                if (null != psb.field_b) {
                  stackOut_40_0 = psb.field_b;
                  stackIn_41_0 = (Object) (Object) stackOut_40_0;
                  break L10;
                } else {
                  stackOut_39_0 = igb.field_a;
                  stackIn_41_0 = (Object) (Object) stackOut_39_0;
                  break L10;
                }
              }
              var4 = stackIn_41_0;
              mob discarded$21 = bm.field_o.a((java.awt.Component) var4, stb.field_p, uqb.field_h, 14);
              sab.field_o = hu.field_b;
              ujb.field_c = pba.field_o;
              return;
            }
          }
        } else {
          L11: {
            stb.field_p = param3 >> 1;
            if (!iha.e(0)) {
              break L11;
            } else {
              L12: {
                if (!param1) {
                  break L12;
                } else {
                  if (!upa.field_a) {
                    L13: {
                      jea.a(6045);
                      if (!upa.field_a) {
                        noa.field_q = uia.field_b;
                        pk.field_o = kc.field_b;
                        sab.field_o = hu.field_b;
                        ujb.field_c = pba.field_o;
                        break L13;
                      } else {
                        L14: {
                          if (~uqb.field_h != ~kc.field_b) {
                            break L14;
                          } else {
                            if (stb.field_p != uia.field_b) {
                              break L14;
                            } else {
                              sab.field_o = hu.field_b;
                              ujb.field_c = pba.field_o;
                              break L13;
                            }
                          }
                        }
                        L15: {
                          noa.field_q = noa.field_q + (-stb.field_p + uia.field_b);
                          pk.field_o = pk.field_o + (kc.field_b + -uqb.field_h);
                          pk.field_o = Math.max(0, Math.min(param2 + -1, pk.field_o));
                          noa.field_q = Math.max(0, Math.min(param3 - 1, noa.field_q));
                          if (null != psb.field_b) {
                            stackOut_14_0 = psb.field_b;
                            stackIn_15_0 = (Object) (Object) stackOut_14_0;
                            break L15;
                          } else {
                            stackOut_13_0 = igb.field_a;
                            stackIn_15_0 = (Object) (Object) stackOut_13_0;
                            break L15;
                          }
                        }
                        var4 = stackIn_15_0;
                        mob discarded$22 = bm.field_o.a((java.awt.Component) var4, stb.field_p, uqb.field_h, 14);
                        sab.field_o = hu.field_b;
                        ujb.field_c = pba.field_o;
                        break L13;
                      }
                    }
                    return;
                  } else {
                    break L12;
                  }
                }
              }
              if (param1) {
                break L11;
              } else {
                if (!upa.field_a) {
                  break L11;
                } else {
                  brb.e((byte) -128);
                  break L11;
                }
              }
            }
          }
          if (!upa.field_a) {
            noa.field_q = uia.field_b;
            pk.field_o = kc.field_b;
            sab.field_o = hu.field_b;
            ujb.field_c = pba.field_o;
            return;
          } else {
            L16: {
              if (~uqb.field_h != ~kc.field_b) {
                break L16;
              } else {
                if (stb.field_p != uia.field_b) {
                  break L16;
                } else {
                  sab.field_o = hu.field_b;
                  ujb.field_c = pba.field_o;
                  return;
                }
              }
            }
            L17: {
              noa.field_q = noa.field_q + (-stb.field_p + uia.field_b);
              pk.field_o = pk.field_o + (kc.field_b + -uqb.field_h);
              pk.field_o = Math.max(0, Math.min(param2 + -1, pk.field_o));
              noa.field_q = Math.max(0, Math.min(param3 - 1, noa.field_q));
              if (null != psb.field_b) {
                stackOut_27_0 = psb.field_b;
                stackIn_28_0 = (Object) (Object) stackOut_27_0;
                break L17;
              } else {
                stackOut_26_0 = igb.field_a;
                stackIn_28_0 = (Object) (Object) stackOut_26_0;
                break L17;
              }
            }
            var4 = stackIn_28_0;
            mob discarded$23 = bm.field_o.a((java.awt.Component) var4, stb.field_p, uqb.field_h, 14);
            sab.field_o = hu.field_b;
            ujb.field_c = pba.field_o;
            return;
          }
        }
    }

    static {
    }
}
