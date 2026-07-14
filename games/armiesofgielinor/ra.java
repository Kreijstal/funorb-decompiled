/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ra extends ik {
    static int field_j;
    static String field_i;
    static String field_l;
    private mn field_g;
    static String field_k;
    private bd field_h;
    static String field_f;
    static fj field_e;

    public static void a(boolean param0) {
        field_e = null;
        if (param0) {
            return;
        }
        field_i = null;
        field_k = null;
        field_f = null;
        field_l = null;
    }

    final static void a(java.applet.Applet param0, int param1, String param2) {
        try {
            java.net.URL var3 = null;
            if (param1 >= -68) {
                return;
            }
            try {
                var3 = new java.net.URL(param0.getCodeBase(), param2);
                var3 = ck.a(-3780, var3, param0);
                ua.a(param0, -109, var3.toString(), true);
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int param1, om param2, boolean param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        bv stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        bv stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        bv stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        bv stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        bv stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        bv stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_19_2 = 0;
        bv stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        bv stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        bv stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        int stackIn_35_2 = 0;
        bv stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        bv stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        bv stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        int stackIn_42_2 = 0;
        bv stackIn_47_0 = null;
        int stackIn_47_1 = 0;
        bv stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        bv stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        int stackIn_49_2 = 0;
        bv stackIn_53_0 = null;
        int stackIn_53_1 = 0;
        bv stackIn_54_0 = null;
        int stackIn_54_1 = 0;
        bv stackIn_55_0 = null;
        int stackIn_55_1 = 0;
        int stackIn_55_2 = 0;
        bv stackIn_59_0 = null;
        int stackIn_59_1 = 0;
        bv stackIn_60_0 = null;
        int stackIn_60_1 = 0;
        bv stackIn_61_0 = null;
        int stackIn_61_1 = 0;
        int stackIn_61_2 = 0;
        bv stackIn_65_0 = null;
        int stackIn_65_1 = 0;
        bv stackIn_66_0 = null;
        int stackIn_66_1 = 0;
        bv stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        int stackIn_67_2 = 0;
        bv stackIn_71_0 = null;
        int stackIn_71_1 = 0;
        bv stackIn_72_0 = null;
        int stackIn_72_1 = 0;
        bv stackIn_73_0 = null;
        int stackIn_73_1 = 0;
        int stackIn_73_2 = 0;
        bv stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        bv stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        int stackOut_34_2 = 0;
        bv stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        int stackOut_33_2 = 0;
        bv stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        bv stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        int stackOut_41_2 = 0;
        bv stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        int stackOut_40_2 = 0;
        bv stackOut_70_0 = null;
        int stackOut_70_1 = 0;
        bv stackOut_72_0 = null;
        int stackOut_72_1 = 0;
        int stackOut_72_2 = 0;
        bv stackOut_71_0 = null;
        int stackOut_71_1 = 0;
        int stackOut_71_2 = 0;
        bv stackOut_64_0 = null;
        int stackOut_64_1 = 0;
        bv stackOut_66_0 = null;
        int stackOut_66_1 = 0;
        int stackOut_66_2 = 0;
        bv stackOut_65_0 = null;
        int stackOut_65_1 = 0;
        int stackOut_65_2 = 0;
        bv stackOut_58_0 = null;
        int stackOut_58_1 = 0;
        bv stackOut_60_0 = null;
        int stackOut_60_1 = 0;
        int stackOut_60_2 = 0;
        bv stackOut_59_0 = null;
        int stackOut_59_1 = 0;
        int stackOut_59_2 = 0;
        bv stackOut_52_0 = null;
        int stackOut_52_1 = 0;
        bv stackOut_54_0 = null;
        int stackOut_54_1 = 0;
        int stackOut_54_2 = 0;
        bv stackOut_53_0 = null;
        int stackOut_53_1 = 0;
        int stackOut_53_2 = 0;
        bv stackOut_46_0 = null;
        int stackOut_46_1 = 0;
        bv stackOut_48_0 = null;
        int stackOut_48_1 = 0;
        int stackOut_48_2 = 0;
        bv stackOut_47_0 = null;
        int stackOut_47_1 = 0;
        int stackOut_47_2 = 0;
        bv stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        bv stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        bv stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        bv stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        bv stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        bv stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        var10 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (nw.g(117)) {
          return;
        } else {
          L0: {
            var6 = param2.field_G.field_r;
            var7 = param2.field_v;
            kr.field_C.a(var7, (byte) 33, param4);
            if (pg.field_d.field_g.a(var6, -63, var7) < param4) {
              break L0;
            } else {
              if (param4 == 1) {
                break L0;
              } else {
                qh.b((byte) 27);
                if (param0 != 4) {
                  int discarded$10 = ra.b(true);
                  return;
                } else {
                  return;
                }
              }
            }
          }
          if (1 < param4) {
            hc.field_b = hc.field_b + 1;
            hc.field_b = hc.field_b + (ko.field_b ^ sm.field_d);
            hc.field_b = Math.abs(hc.field_b);
            var8 = hc.field_b % 8;
            var9 = var8;
            if (0 == var9) {
              L1: {
                cg.field_j = cg.field_j + 1;
                kw.field_R = kw.field_R - wr.field_L;
                pg.field_d.field_g.a(65535, var7, param5, var6, param1);
                vl.field_n.h(32161, 79);
                vl.field_n.b(param0 + -3, var6);
                vl.field_n.b(1, var7);
                vl.field_n.b(true, param4);
                vl.field_n.b(true, param5);
                vl.field_n.b(true, param1);
                stackOut_32_0 = vl.field_n;
                stackOut_32_1 = 1;
                stackIn_34_0 = stackOut_32_0;
                stackIn_34_1 = stackOut_32_1;
                stackIn_33_0 = stackOut_32_0;
                stackIn_33_1 = stackOut_32_1;
                if (!param3) {
                  stackOut_34_0 = (bv) (Object) stackIn_34_0;
                  stackOut_34_1 = stackIn_34_1;
                  stackOut_34_2 = 0;
                  stackIn_35_0 = stackOut_34_0;
                  stackIn_35_1 = stackOut_34_1;
                  stackIn_35_2 = stackOut_34_2;
                  break L1;
                } else {
                  stackOut_33_0 = (bv) (Object) stackIn_33_0;
                  stackOut_33_1 = stackIn_33_1;
                  stackOut_33_2 = 1;
                  stackIn_35_0 = stackOut_33_0;
                  stackIn_35_1 = stackOut_33_1;
                  stackIn_35_2 = stackOut_33_2;
                  break L1;
                }
              }
              ((bv) (Object) stackIn_35_0).b(stackIn_35_1, stackIn_35_2);
              vl.field_n.a((byte) -108, km.a(-59));
              vl.field_n.a((byte) -124, oq.a(false));
              vl.field_n.a((byte) -59, jr.a(false));
              vl.field_n.a((byte) -50, rt.g(0));
              qh.b((byte) 27);
              if (param0 != 4) {
                int discarded$11 = ra.b(true);
                return;
              } else {
                return;
              }
            } else {
              if (1 == var9) {
                L2: {
                  wr.field_L = wr.field_L + 1;
                  ii.field_b = ii.field_b + cg.field_j;
                  pg.field_d.field_g.a(65535, var7, param5, var6, param1);
                  vl.field_n.h(32161, 79);
                  vl.field_n.b(param0 + -3, var6);
                  vl.field_n.b(1, var7);
                  vl.field_n.b(true, param4);
                  vl.field_n.b(true, param5);
                  vl.field_n.b(true, param1);
                  stackOut_39_0 = vl.field_n;
                  stackOut_39_1 = 1;
                  stackIn_41_0 = stackOut_39_0;
                  stackIn_41_1 = stackOut_39_1;
                  stackIn_40_0 = stackOut_39_0;
                  stackIn_40_1 = stackOut_39_1;
                  if (!param3) {
                    stackOut_41_0 = (bv) (Object) stackIn_41_0;
                    stackOut_41_1 = stackIn_41_1;
                    stackOut_41_2 = 0;
                    stackIn_42_0 = stackOut_41_0;
                    stackIn_42_1 = stackOut_41_1;
                    stackIn_42_2 = stackOut_41_2;
                    break L2;
                  } else {
                    stackOut_40_0 = (bv) (Object) stackIn_40_0;
                    stackOut_40_1 = stackIn_40_1;
                    stackOut_40_2 = 1;
                    stackIn_42_0 = stackOut_40_0;
                    stackIn_42_1 = stackOut_40_1;
                    stackIn_42_2 = stackOut_40_2;
                    break L2;
                  }
                }
                ((bv) (Object) stackIn_42_0).b(stackIn_42_1, stackIn_42_2);
                vl.field_n.a((byte) -108, km.a(-59));
                vl.field_n.a((byte) -124, oq.a(false));
                vl.field_n.a((byte) -59, jr.a(false));
                vl.field_n.a((byte) -50, rt.g(0));
                qh.b((byte) 27);
                if (param0 != 4) {
                  int discarded$12 = ra.b(true);
                  return;
                } else {
                  return;
                }
              } else {
                if (var9 != 2) {
                  if (-4 != (var9 ^ -1)) {
                    if (var9 != 4) {
                      if (5 != var9) {
                        if (var9 != 6) {
                          if (7 == var9) {
                            L3: {
                              ii.field_b = ii.field_b - cg.field_j;
                              wr.field_L = wr.field_L - 1;
                              pg.field_d.field_g.a(65535, var7, param5, var6, param1);
                              vl.field_n.h(32161, 79);
                              vl.field_n.b(param0 + -3, var6);
                              vl.field_n.b(1, var7);
                              vl.field_n.b(true, param4);
                              vl.field_n.b(true, param5);
                              vl.field_n.b(true, param1);
                              stackOut_70_0 = vl.field_n;
                              stackOut_70_1 = 1;
                              stackIn_72_0 = stackOut_70_0;
                              stackIn_72_1 = stackOut_70_1;
                              stackIn_71_0 = stackOut_70_0;
                              stackIn_71_1 = stackOut_70_1;
                              if (!param3) {
                                stackOut_72_0 = (bv) (Object) stackIn_72_0;
                                stackOut_72_1 = stackIn_72_1;
                                stackOut_72_2 = 0;
                                stackIn_73_0 = stackOut_72_0;
                                stackIn_73_1 = stackOut_72_1;
                                stackIn_73_2 = stackOut_72_2;
                                break L3;
                              } else {
                                stackOut_71_0 = (bv) (Object) stackIn_71_0;
                                stackOut_71_1 = stackIn_71_1;
                                stackOut_71_2 = 1;
                                stackIn_73_0 = stackOut_71_0;
                                stackIn_73_1 = stackOut_71_1;
                                stackIn_73_2 = stackOut_71_2;
                                break L3;
                              }
                            }
                            ((bv) (Object) stackIn_73_0).b(stackIn_73_1, stackIn_73_2);
                            vl.field_n.a((byte) -108, km.a(-59));
                            vl.field_n.a((byte) -124, oq.a(false));
                            vl.field_n.a((byte) -59, jr.a(false));
                            vl.field_n.a((byte) -50, rt.g(0));
                            qh.b((byte) 27);
                            if (param0 != 4) {
                              int discarded$13 = ra.b(true);
                              return;
                            } else {
                              return;
                            }
                          } else {
                            throw new IllegalStateException("");
                          }
                        } else {
                          L4: {
                            kw.field_R = kw.field_R + wr.field_L;
                            cg.field_j = cg.field_j - 1;
                            pg.field_d.field_g.a(65535, var7, param5, var6, param1);
                            vl.field_n.h(32161, 79);
                            vl.field_n.b(param0 + -3, var6);
                            vl.field_n.b(1, var7);
                            vl.field_n.b(true, param4);
                            vl.field_n.b(true, param5);
                            vl.field_n.b(true, param1);
                            stackOut_64_0 = vl.field_n;
                            stackOut_64_1 = 1;
                            stackIn_66_0 = stackOut_64_0;
                            stackIn_66_1 = stackOut_64_1;
                            stackIn_65_0 = stackOut_64_0;
                            stackIn_65_1 = stackOut_64_1;
                            if (!param3) {
                              stackOut_66_0 = (bv) (Object) stackIn_66_0;
                              stackOut_66_1 = stackIn_66_1;
                              stackOut_66_2 = 0;
                              stackIn_67_0 = stackOut_66_0;
                              stackIn_67_1 = stackOut_66_1;
                              stackIn_67_2 = stackOut_66_2;
                              break L4;
                            } else {
                              stackOut_65_0 = (bv) (Object) stackIn_65_0;
                              stackOut_65_1 = stackIn_65_1;
                              stackOut_65_2 = 1;
                              stackIn_67_0 = stackOut_65_0;
                              stackIn_67_1 = stackOut_65_1;
                              stackIn_67_2 = stackOut_65_2;
                              break L4;
                            }
                          }
                          L5: {
                            ((bv) (Object) stackIn_67_0).b(stackIn_67_1, stackIn_67_2);
                            vl.field_n.a((byte) -108, km.a(-59));
                            vl.field_n.a((byte) -124, oq.a(false));
                            vl.field_n.a((byte) -59, jr.a(false));
                            vl.field_n.a((byte) -50, rt.g(0));
                            qh.b((byte) 27);
                            if (param0 == 4) {
                              break L5;
                            } else {
                              int discarded$14 = ra.b(true);
                              break L5;
                            }
                          }
                          return;
                        }
                      } else {
                        L6: {
                          cg.field_j = cg.field_j + 1;
                          kw.field_R = kw.field_R - wr.field_L;
                          pg.field_d.field_g.a(65535, var7, param5, var6, param1);
                          vl.field_n.h(32161, 79);
                          vl.field_n.b(param0 + -3, var6);
                          vl.field_n.b(1, var7);
                          vl.field_n.b(true, param4);
                          vl.field_n.b(true, param5);
                          vl.field_n.b(true, param1);
                          stackOut_58_0 = vl.field_n;
                          stackOut_58_1 = 1;
                          stackIn_60_0 = stackOut_58_0;
                          stackIn_60_1 = stackOut_58_1;
                          stackIn_59_0 = stackOut_58_0;
                          stackIn_59_1 = stackOut_58_1;
                          if (!param3) {
                            stackOut_60_0 = (bv) (Object) stackIn_60_0;
                            stackOut_60_1 = stackIn_60_1;
                            stackOut_60_2 = 0;
                            stackIn_61_0 = stackOut_60_0;
                            stackIn_61_1 = stackOut_60_1;
                            stackIn_61_2 = stackOut_60_2;
                            break L6;
                          } else {
                            stackOut_59_0 = (bv) (Object) stackIn_59_0;
                            stackOut_59_1 = stackIn_59_1;
                            stackOut_59_2 = 1;
                            stackIn_61_0 = stackOut_59_0;
                            stackIn_61_1 = stackOut_59_1;
                            stackIn_61_2 = stackOut_59_2;
                            break L6;
                          }
                        }
                        L7: {
                          ((bv) (Object) stackIn_61_0).b(stackIn_61_1, stackIn_61_2);
                          vl.field_n.a((byte) -108, km.a(-59));
                          vl.field_n.a((byte) -124, oq.a(false));
                          vl.field_n.a((byte) -59, jr.a(false));
                          vl.field_n.a((byte) -50, rt.g(0));
                          qh.b((byte) 27);
                          if (param0 == 4) {
                            break L7;
                          } else {
                            int discarded$15 = ra.b(true);
                            break L7;
                          }
                        }
                        return;
                      }
                    } else {
                      L8: {
                        ii.field_b = ii.field_b + cg.field_j;
                        wr.field_L = wr.field_L + 1;
                        pg.field_d.field_g.a(65535, var7, param5, var6, param1);
                        vl.field_n.h(32161, 79);
                        vl.field_n.b(param0 + -3, var6);
                        vl.field_n.b(1, var7);
                        vl.field_n.b(true, param4);
                        vl.field_n.b(true, param5);
                        vl.field_n.b(true, param1);
                        stackOut_52_0 = vl.field_n;
                        stackOut_52_1 = 1;
                        stackIn_54_0 = stackOut_52_0;
                        stackIn_54_1 = stackOut_52_1;
                        stackIn_53_0 = stackOut_52_0;
                        stackIn_53_1 = stackOut_52_1;
                        if (!param3) {
                          stackOut_54_0 = (bv) (Object) stackIn_54_0;
                          stackOut_54_1 = stackIn_54_1;
                          stackOut_54_2 = 0;
                          stackIn_55_0 = stackOut_54_0;
                          stackIn_55_1 = stackOut_54_1;
                          stackIn_55_2 = stackOut_54_2;
                          break L8;
                        } else {
                          stackOut_53_0 = (bv) (Object) stackIn_53_0;
                          stackOut_53_1 = stackIn_53_1;
                          stackOut_53_2 = 1;
                          stackIn_55_0 = stackOut_53_0;
                          stackIn_55_1 = stackOut_53_1;
                          stackIn_55_2 = stackOut_53_2;
                          break L8;
                        }
                      }
                      L9: {
                        ((bv) (Object) stackIn_55_0).b(stackIn_55_1, stackIn_55_2);
                        vl.field_n.a((byte) -108, km.a(-59));
                        vl.field_n.a((byte) -124, oq.a(false));
                        vl.field_n.a((byte) -59, jr.a(false));
                        vl.field_n.a((byte) -50, rt.g(0));
                        qh.b((byte) 27);
                        if (param0 == 4) {
                          break L9;
                        } else {
                          int discarded$16 = ra.b(true);
                          break L9;
                        }
                      }
                      return;
                    }
                  } else {
                    L10: {
                      kw.field_R = kw.field_R + iu.field_t;
                      ii.field_b = ii.field_b + iu.field_t;
                      pg.field_d.field_g.a(65535, var7, param5, var6, param1);
                      vl.field_n.h(32161, 79);
                      vl.field_n.b(param0 + -3, var6);
                      vl.field_n.b(1, var7);
                      vl.field_n.b(true, param4);
                      vl.field_n.b(true, param5);
                      vl.field_n.b(true, param1);
                      stackOut_46_0 = vl.field_n;
                      stackOut_46_1 = 1;
                      stackIn_48_0 = stackOut_46_0;
                      stackIn_48_1 = stackOut_46_1;
                      stackIn_47_0 = stackOut_46_0;
                      stackIn_47_1 = stackOut_46_1;
                      if (!param3) {
                        stackOut_48_0 = (bv) (Object) stackIn_48_0;
                        stackOut_48_1 = stackIn_48_1;
                        stackOut_48_2 = 0;
                        stackIn_49_0 = stackOut_48_0;
                        stackIn_49_1 = stackOut_48_1;
                        stackIn_49_2 = stackOut_48_2;
                        break L10;
                      } else {
                        stackOut_47_0 = (bv) (Object) stackIn_47_0;
                        stackOut_47_1 = stackIn_47_1;
                        stackOut_47_2 = 1;
                        stackIn_49_0 = stackOut_47_0;
                        stackIn_49_1 = stackOut_47_1;
                        stackIn_49_2 = stackOut_47_2;
                        break L10;
                      }
                    }
                    L11: {
                      ((bv) (Object) stackIn_49_0).b(stackIn_49_1, stackIn_49_2);
                      vl.field_n.a((byte) -108, km.a(-59));
                      vl.field_n.a((byte) -124, oq.a(false));
                      vl.field_n.a((byte) -59, jr.a(false));
                      vl.field_n.a((byte) -50, rt.g(0));
                      qh.b((byte) 27);
                      if (param0 == 4) {
                        break L11;
                      } else {
                        int discarded$17 = ra.b(true);
                        break L11;
                      }
                    }
                    return;
                  }
                } else {
                  L12: {
                    ii.field_b = ii.field_b + 1;
                    kw.field_R = kw.field_R + 1;
                    pg.field_d.field_g.a(65535, var7, param5, var6, param1);
                    vl.field_n.h(32161, 79);
                    vl.field_n.b(param0 + -3, var6);
                    vl.field_n.b(1, var7);
                    vl.field_n.b(true, param4);
                    vl.field_n.b(true, param5);
                    vl.field_n.b(true, param1);
                    stackOut_16_0 = vl.field_n;
                    stackOut_16_1 = 1;
                    stackIn_18_0 = stackOut_16_0;
                    stackIn_18_1 = stackOut_16_1;
                    stackIn_17_0 = stackOut_16_0;
                    stackIn_17_1 = stackOut_16_1;
                    if (!param3) {
                      stackOut_18_0 = (bv) (Object) stackIn_18_0;
                      stackOut_18_1 = stackIn_18_1;
                      stackOut_18_2 = 0;
                      stackIn_19_0 = stackOut_18_0;
                      stackIn_19_1 = stackOut_18_1;
                      stackIn_19_2 = stackOut_18_2;
                      break L12;
                    } else {
                      stackOut_17_0 = (bv) (Object) stackIn_17_0;
                      stackOut_17_1 = stackIn_17_1;
                      stackOut_17_2 = 1;
                      stackIn_19_0 = stackOut_17_0;
                      stackIn_19_1 = stackOut_17_1;
                      stackIn_19_2 = stackOut_17_2;
                      break L12;
                    }
                  }
                  L13: {
                    ((bv) (Object) stackIn_19_0).b(stackIn_19_1, stackIn_19_2);
                    vl.field_n.a((byte) -108, km.a(-59));
                    vl.field_n.a((byte) -124, oq.a(false));
                    vl.field_n.a((byte) -59, jr.a(false));
                    vl.field_n.a((byte) -50, rt.g(0));
                    qh.b((byte) 27);
                    if (param0 == 4) {
                      break L13;
                    } else {
                      int discarded$18 = ra.b(true);
                      break L13;
                    }
                  }
                  return;
                }
              }
            }
          } else {
            L14: {
              pg.field_d.field_g.a(65535, var7, param5, var6, param1);
              vl.field_n.h(32161, 79);
              vl.field_n.b(param0 + -3, var6);
              vl.field_n.b(1, var7);
              vl.field_n.b(true, param4);
              vl.field_n.b(true, param5);
              vl.field_n.b(true, param1);
              stackOut_7_0 = vl.field_n;
              stackOut_7_1 = 1;
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              if (!param3) {
                stackOut_9_0 = (bv) (Object) stackIn_9_0;
                stackOut_9_1 = stackIn_9_1;
                stackOut_9_2 = 0;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                stackIn_10_2 = stackOut_9_2;
                break L14;
              } else {
                stackOut_8_0 = (bv) (Object) stackIn_8_0;
                stackOut_8_1 = stackIn_8_1;
                stackOut_8_2 = 1;
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                stackIn_10_2 = stackOut_8_2;
                break L14;
              }
            }
            L15: {
              ((bv) (Object) stackIn_10_0).b(stackIn_10_1, stackIn_10_2);
              vl.field_n.a((byte) -108, km.a(-59));
              vl.field_n.a((byte) -124, oq.a(false));
              vl.field_n.a((byte) -59, jr.a(false));
              vl.field_n.a((byte) -50, rt.g(0));
              qh.b((byte) 27);
              if (param0 == 4) {
                break L15;
              } else {
                int discarded$19 = ra.b(true);
                break L15;
              }
            }
            return;
          }
        }
    }

    final static void a(int param0, int param1, int param2) {
        Object var4 = null;
        bn.field_b = param0;
        ce.field_N = param0;
        dt.field_a = param2;
        dm.field_D = param2;
        tq.field_a = true;
        so.field_b = null;
        var4 = null;
        qn.a((int[]) null, 0, 0);
        so.field_b = rj.a(param0, param2, 1423111778, (java.awt.Component) (Object) si.field_b);
        so.field_b.a(param1 + -17900);
        g.a((byte) -85, param0 / 2, param2 / 2);
        if (param1 != 23505) {
          ra.a(-106, -34, -122);
          ni.a(-8994, param0, param2);
          om.a(param2, -22696, param0);
          pt.c(param0 / 2, param2 / 2, 9);
          return;
        } else {
          ni.a(-8994, param0, param2);
          om.a(param2, -22696, param0);
          pt.c(param0 / 2, param2 / 2, 9);
          return;
        }
    }

    ra(int param0, mn param1) {
        super(param0);
        ((ra) this).field_g = param1;
        if ((((ra) this).field_c ^ -1) == -37) {
            ((ra) this).field_g.field_u = true;
        }
        ((ra) this).field_g.field_o = param0;
    }

    final void a(int param0, ha param1, int param2) {
        if (param2 != 26123) {
            Object var5 = null;
            ((ra) this).a((ha) null, 42);
        }
    }

    final int a(int param0) {
        if (param0 != 25365) {
            Object var3 = null;
            ((ra) this).a(-112, (vh) null);
            return 2;
        }
        return 2;
    }

    final void a(ha param0, int param1) {
        Object var4 = null;
        if (null == ((ra) this).field_h) {
          if (param1 != -1700635440) {
            var4 = null;
            ra.a(112, -111, (om) null, true, 116, 78);
            return;
          } else {
            return;
          }
        } else {
          ((ra) this).field_h.a(64, param0);
          ((ra) this).field_h = null;
          if (param1 == -1700635440) {
            return;
          } else {
            var4 = null;
            ra.a(112, -111, (om) null, true, 116, 78);
            return;
          }
        }
    }

    final void a(byte param0, ha param1) {
        ((ra) this).field_h = ((ra) this).field_g.a(param0 ^ -26, param1);
        if (param0 != -37) {
            Object var4 = null;
            ((ra) this).a((ha) null, -62);
        }
    }

    final void a(int param0, vh param1) {
        param1.b(true, ((ra) this).field_c);
        if (param0 != -11637) {
            field_i = null;
        }
    }

    final static void a(long param0, int param1, int param2) {
        bv var4 = vl.field_n;
        var4.h(32161, param1);
        var4.field_q = var4.field_q + 1;
        int var5 = var4.field_q;
        var4.b(1, param2);
        var4.a(param0, param2 ^ 38359638);
        var4.e(-var5 + var4.field_q, 5930);
    }

    final static int b(boolean param0) {
        if (!param0) {
          int discarded$2 = ra.b(false);
          return 1900 + new Date().getYear();
        } else {
          return 1900 + new Date().getYear();
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = 0;
        field_i = "All players have left <%0>'s game.";
        field_k = "You must capture a village before you can use Fortify on it.";
        field_f = "This is your RuneScape clan if you have one.";
        field_l = "You have been removed from <%0>'s game.";
        field_e = null;
    }
}
