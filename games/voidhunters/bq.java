/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bq extends rqa {
    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_2_0 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 <= -119) {
              si.a(232, 62, param0[0].a(79));
              stackIn_4_0 = new nc("void");
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (nc) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("bq.A(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    bq(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(boolean param0, boolean param1, int param2, int param3) {
        Object stackIn_15_0 = null;
        Object stackIn_28_0 = null;
        Object stackIn_41_0 = null;
        Object stackIn_57_0 = null;
        Object stackIn_70_0 = null;
        Object stackIn_83_0 = null;
        Object stackIn_93_0 = null;
        Object stackIn_98_0 = null;
        Object var4;
        int var5;
        var5 = VoidHunters.field_G;
        uqb.field_h = param2 >> -616830303;
        if (!param0) {
          bq.a(false, true, -60, -60);
          stb.field_p = param3 >> 1807941345;
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
                      if ((uqb.field_h ^ -1) != (kc.field_b ^ -1)) {
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
                        stackIn_83_0 = psb.field_b;
                        break L2;
                      } else {
                        stackIn_83_0 = igb.field_a;
                        break L2;
                      }
                    }
                    var4 = stackIn_83_0;
                    bm.field_o.a((java.awt.Component) (var4), stb.field_p, uqb.field_h, 14);
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
                  if ((uqb.field_h ^ -1) == (kc.field_b ^ -1)) {
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
                          stackIn_98_0 = psb.field_b;
                          break L3;
                        } else {
                          stackIn_98_0 = igb.field_a;
                          break L3;
                        }
                      }
                      var4 = stackIn_98_0;
                      bm.field_o.a((java.awt.Component) (var4), stb.field_p, uqb.field_h, 14);
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
                        stackIn_93_0 = psb.field_b;
                        break L4;
                      } else {
                        stackIn_93_0 = igb.field_a;
                        break L4;
                      }
                    }
                    var4 = stackIn_93_0;
                    bm.field_o.a((java.awt.Component) (var4), stb.field_p, uqb.field_h, 14);
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
                    if ((uqb.field_h ^ -1) != (kc.field_b ^ -1)) {
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
                      stackIn_70_0 = psb.field_b;
                      break L6;
                    } else {
                      stackIn_70_0 = igb.field_a;
                      break L6;
                    }
                  }
                  var4 = stackIn_70_0;
                  bm.field_o.a((java.awt.Component) (var4), stb.field_p, uqb.field_h, 14);
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
                  if ((uqb.field_h ^ -1) != (kc.field_b ^ -1)) {
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
                    stackIn_57_0 = psb.field_b;
                    break L8;
                  } else {
                    stackIn_57_0 = igb.field_a;
                    break L8;
                  }
                }
                var4 = stackIn_57_0;
                bm.field_o.a((java.awt.Component) (var4), stb.field_p, uqb.field_h, 14);
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
                if ((uqb.field_h ^ -1) != (kc.field_b ^ -1)) {
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
                  stackIn_41_0 = psb.field_b;
                  break L10;
                } else {
                  stackIn_41_0 = igb.field_a;
                  break L10;
                }
              }
              var4 = stackIn_41_0;
              bm.field_o.a((java.awt.Component) (var4), stb.field_p, uqb.field_h, 14);
              sab.field_o = hu.field_b;
              ujb.field_c = pba.field_o;
              return;
            }
          }
        } else {
          L11: {
            stb.field_p = param3 >> 1807941345;
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
                          if ((uqb.field_h ^ -1) != (kc.field_b ^ -1)) {
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
                            stackIn_15_0 = psb.field_b;
                            break L15;
                          } else {
                            stackIn_15_0 = igb.field_a;
                            break L15;
                          }
                        }
                        var4 = stackIn_15_0;
                        bm.field_o.a((java.awt.Component) (var4), stb.field_p, uqb.field_h, 14);
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
              if ((uqb.field_h ^ -1) != (kc.field_b ^ -1)) {
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
                stackIn_28_0 = psb.field_b;
                break L17;
              } else {
                stackIn_28_0 = igb.field_a;
                break L17;
              }
            }
            var4 = stackIn_28_0;
            bm.field_o.a((java.awt.Component) (var4), stb.field_p, uqb.field_h, 14);
            sab.field_o = hu.field_b;
            ujb.field_c = pba.field_o;
            return;
          }
        }
    }

    static {
    }
}
