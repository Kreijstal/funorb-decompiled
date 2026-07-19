/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mp {
    static gb field_a;
    int[] field_c;
    static jpa field_d;
    static String field_b;

    final static void a(String param0, java.applet.Applet param1, int param2) {
        try {
            Throwable throwable = null;
            RuntimeException runtimeException = null;
            String var3 = null;
            String var4 = null;
            String var5 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            String stackIn_15_2 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            String stackIn_19_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_11_0 = null;
            StringBuilder stackOut_11_1 = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            String stackOut_14_2 = null;
            RuntimeException stackOut_12_0 = null;
            StringBuilder stackOut_12_1 = null;
            String stackOut_12_2 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            RuntimeException stackOut_18_0 = null;
            StringBuilder stackOut_18_1 = null;
            String stackOut_18_2 = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            String stackOut_16_2 = null;
            try {
              L0: {
                ts.field_g = param0;
                try {
                  L1: {
                    L2: {
                      L3: {
                        var3 = param1.getParameter("cookieprefix");
                        var4 = param1.getParameter("cookiehost");
                        var5 = var3 + "settings=" + param0 + "; version=1; path=/; domain=" + var4;
                        if (-1 != (param0.length() ^ -1)) {
                          break L3;
                        } else {
                          var5 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                          if (!TombRacer.field_G) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                      var5 = var5 + "; Expires=" + ida.a(bva.b((byte) -107) - -94608000000L, param2 + 21406) + "; Max-Age=" + 94608000L;
                      break L2;
                    }
                    L4: {
                      lb.a(param1, 19467, "document.cookie=\"" + var5 + "\"");
                      if (param2 == -21407) {
                        break L4;
                      } else {
                        mp.a(-2);
                        break L4;
                      }
                    }
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L5: {
                    throwable = decompiledCaughtException;
                    break L5;
                  }
                }
                v.a((byte) 64, param1);
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L6: {
                runtimeException = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_11_0 = (RuntimeException) (runtimeException);
                stackOut_11_1 = new StringBuilder().append("mp.C(");
                stackIn_14_0 = stackOut_11_0;
                stackIn_14_1 = stackOut_11_1;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                if (param0 == null) {
                  stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
                  stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
                  stackOut_14_2 = "null";
                  stackIn_15_0 = stackOut_14_0;
                  stackIn_15_1 = stackOut_14_1;
                  stackIn_15_2 = stackOut_14_2;
                  break L6;
                } else {
                  stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
                  stackOut_12_2 = "{...}";
                  stackIn_15_0 = stackOut_12_0;
                  stackIn_15_1 = stackOut_12_1;
                  stackIn_15_2 = stackOut_12_2;
                  break L6;
                }
              }
              L7: {
                stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
                stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');
                stackIn_18_0 = stackOut_15_0;
                stackIn_18_1 = stackOut_15_1;
                stackIn_16_0 = stackOut_15_0;
                stackIn_16_1 = stackOut_15_1;
                if (param1 == null) {
                  stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
                  stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
                  stackOut_18_2 = "null";
                  stackIn_19_0 = stackOut_18_0;
                  stackIn_19_1 = stackOut_18_1;
                  stackIn_19_2 = stackOut_18_2;
                  break L7;
                } else {
                  stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
                  stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
                  stackOut_16_2 = "{...}";
                  stackIn_19_0 = stackOut_16_0;
                  stackIn_19_1 = stackOut_16_1;
                  stackIn_19_2 = stackOut_16_2;
                  break L7;
                }
              }
              throw tba.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int param1) {
        RuntimeException runtimeException = null;
        vb var2 = null;
        int var3 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_23_0 = false;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_5_0 = false;
        boolean stackOut_21_0 = false;
        var3 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            ot.field_v = param1;
            if (param0 == 2) {
              var2 = (vb) ((Object) tna.field_e.f(param0 ^ -78));
              L1: while (true) {
                L2: {
                  L3: {
                    L4: {
                      if (null == var2) {
                        break L4;
                      } else {
                        stackOut_5_0 = var2.field_h.l((byte) 122);
                        stackIn_23_0 = stackOut_5_0;
                        stackIn_6_0 = stackOut_5_0;
                        if (var3 != 0) {
                          L5: while (true) {
                            L6: {
                              L7: {
                                if (!stackIn_23_0) {
                                  break L7;
                                } else {
                                  var2.field_f.e(var2.field_g * ot.field_v - -128 >> 622387560);
                                  if (var3 == 0) {
                                    break L6;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                              var2.p(param0 + 2);
                              break L6;
                            }
                            var2 = (vb) ((Object) db.field_f.e(113));
                            if (var3 == 0) {
                              if (null == var2) {
                                break L3;
                              } else {
                                if (var3 != 0) {
                                  break L2;
                                } else {
                                  stackOut_21_0 = var2.field_h.l((byte) 44);
                                  stackIn_23_0 = stackOut_21_0;
                                  continue L5;
                                }
                              }
                            } else {
                              break L3;
                            }
                          }
                        } else {
                          L8: {
                            L9: {
                              if (stackIn_6_0) {
                                break L9;
                              } else {
                                var2.p(78);
                                if (var3 == 0) {
                                  break L8;
                                } else {
                                  break L9;
                                }
                              }
                            }
                            var2.field_f.e(var2.field_g * ot.field_v + 128 >> 720592520);
                            break L8;
                          }
                          var2 = (vb) ((Object) tna.field_e.e(112));
                          if (var3 == 0) {
                            continue L1;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    if (null != db.field_f) {
                      var2 = (vb) ((Object) db.field_f.f(param0 ^ -78));
                      L10: while (true) {
                        if (null == var2) {
                          break L3;
                        } else {
                          if (var3 != 0) {
                            break L2;
                          } else {
                            stackOut_21_0 = var2.field_h.l((byte) 44);
                            stackIn_23_0 = stackOut_21_0;
                            L11: {
                              L12: {
                                if (!stackIn_23_0) {
                                  break L12;
                                } else {
                                  var2.field_f.e(var2.field_g * ot.field_v - -128 >> 622387560);
                                  if (var3 == 0) {
                                    break L11;
                                  } else {
                                    break L12;
                                  }
                                }
                              }
                              var2.p(param0 + 2);
                              break L11;
                            }
                            var2 = (vb) ((Object) db.field_f.e(113));
                            if (var3 == 0) {
                              continue L10;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                  break L2;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) runtimeException), "mp.E(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static int a(byte param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        try {
          L0: {
            var1_int = 11 % ((-52 - param0) / 57);
            stackOut_0_0 = ej.field_a.g(-110);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var1), "mp.A(" + param0 + ')');
        }
        return stackIn_1_0;
    }

    final static void a(jea param0, jea param1, boolean param2, jea param3, oj param4, jea param5, int param6, jea param7, jea param8, jea param9, jea param10, il param11) {
        RuntimeException var12 = null;
        iu var12_ref = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        iu[] var16 = null;
        jea var17 = null;
        int var18 = 0;
        String var19 = null;
        int var20 = 0;
        int stackIn_4_0 = 0;
        String stackIn_27_0 = null;
        int stackIn_31_0 = 0;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_51_2 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_59_2 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_63_2 = null;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_67_2 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_75_2 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_79_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        String stackOut_26_0 = null;
        String stackOut_24_0 = null;
        boolean stackOut_30_0 = false;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        String stackOut_58_2 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        String stackOut_56_2 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        String stackOut_62_2 = null;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        String stackOut_60_2 = null;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        String stackOut_66_2 = null;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        String stackOut_64_2 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        String stackOut_78_2 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        String stackOut_76_2 = null;
        var20 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            pm.field_a[3] = 16736511;
            pm.field_a[2] = 9474303;
            lpa.field_s = param11;
            pm.field_a[4] = 16711935;
            kq.field_c = param2;
            pm.field_a[0] = 16764000;
            pm.field_a[1] = 6356832;
            bn.field_t = param7;
            bma.field_t[3] = 16736511;
            bma.field_t[2] = 16736352;
            sva.field_d = 8421504;
            bma.field_t[param6] = 16764000;
            pm.field_a[4] = 16711935;
            bma.field_t[1] = 6356832;
            var12_ref = new iu(4, 4);
            var13 = var12_ref.field_r;
            var14 = var12_ref.field_r;
            var15 = var12_ref.field_r;
            var12_ref.field_r[15] = 7368816;
            var13[2] = 7368816;
            var15[8] = 7368816;
            var14[5] = 7368816;
            var16 = new iu[9];
            var16[4] = var12_ref;
            era.field_e = new jea(0L, param0);
            v.field_i = new jea(0L, param9);
            era.field_e.b(-128, v.field_i);
            var17 = new jea(0L, (jea) null);
            var17.field_J = new vna();
            ne.field_d = new iv(0L, var17, param3, param4);
            v.field_i.b(-126, ne.field_d);
            sua.field_K = new jea(0L, param1);
            v.field_i.b(-124, sua.field_K);
            pq.field_g = new jea(0L, param5);
            pq.field_g.field_H = lpa.field_s;
            sua.field_K.b(param6 + -124, pq.field_g);
            sua.field_K.a(param6 ^ -10966);
            mka.field_b = new jea(0L, (jea) null);
            mka.field_b.field_w = var16;
            sua.field_K.b(-125, mka.field_b);
            bt.field_c = new jea[5];
            kva.field_p = new jea[5];
            oka.field_y = new jea[5];
            wba.field_p = new jea[5];
            var18 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if ((var18 ^ -1) <= -6) {
                    break L3;
                  } else {
                    stackOut_3_0 = var18 ^ -1;
                    stackIn_31_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var20 != 0) {
                      break L2;
                    } else {
                      L4: {
                        L5: {
                          L6: {
                            if (stackIn_4_0 == -1) {
                              break L6;
                            } else {
                              L7: {
                                L8: {
                                  if ((var18 ^ -1) != -2) {
                                    break L8;
                                  } else {
                                    if (kq.field_c) {
                                      break L7;
                                    } else {
                                      break L8;
                                    }
                                  }
                                }
                                L9: {
                                  if ((var18 ^ -1) == -3) {
                                    break L9;
                                  } else {
                                    if (var20 == 0) {
                                      break L4;
                                    } else {
                                      break L9;
                                    }
                                  }
                                }
                                var19 = dna.field_H;
                                if (var20 == 0) {
                                  break L5;
                                } else {
                                  break L7;
                                }
                              }
                              var19 = kh.field_p;
                              if (var20 == 0) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          L10: {
                            if (!kq.field_c) {
                              stackOut_26_0 = wra.field_a;
                              stackIn_27_0 = stackOut_26_0;
                              break L10;
                            } else {
                              stackOut_24_0 = cla.field_o;
                              stackIn_27_0 = stackOut_24_0;
                              break L10;
                            }
                          }
                          var19 = stackIn_27_0;
                          break L5;
                        }
                        wba.field_p[var18] = new jea(0L, param10);
                        bt.field_c[var18] = new jea(0L, bn.field_t, var19);
                        oka.field_y[var18] = new jea(0L, (jea) null);
                        oka.field_y[var18].field_bb = 1;
                        kva.field_p[var18] = new jea(0L, bn.field_t);
                        kva.field_p[var18].field_bb = 1;
                        wba.field_p[var18].b(-122, bt.field_c[var18]);
                        wba.field_p[var18].b(param6 + -125, oka.field_y[var18]);
                        wba.field_p[var18].b(-125, kva.field_p[var18]);
                        wba.field_p[var18].a(-10966);
                        era.field_e.b(-127, wba.field_p[var18]);
                        gka.field_g = gka.field_g + 1;
                        break L4;
                      }
                      var18++;
                      if (var20 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                ara.field_ub = new jea(0L, param8);
                ara.field_ub.field_r = ge.field_G;
                era.field_e.b(-128, ara.field_ub);
                stackOut_30_0 = o.e(540800);
                stackIn_31_0 = stackOut_30_0 ? 1 : 0;
                break L2;
              }
              L11: {
                L12: {
                  if (stackIn_31_0 == 0) {
                    break L12;
                  } else {
                    if (fua.field_g) {
                      break L12;
                    } else {
                      break L11;
                    }
                  }
                }
                apa.field_c = new ada(0, 0, 0, 0);
                break L11;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var12 = decompiledCaughtException;
            stackOut_39_0 = (RuntimeException) (var12);
            stackOut_39_1 = new StringBuilder().append("mp.D(");
            stackIn_42_0 = stackOut_39_0;
            stackIn_42_1 = stackOut_39_1;
            stackIn_40_0 = stackOut_39_0;
            stackIn_40_1 = stackOut_39_1;
            if (param0 == null) {
              stackOut_42_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackOut_42_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackOut_42_2 = "null";
              stackIn_43_0 = stackOut_42_0;
              stackIn_43_1 = stackOut_42_1;
              stackIn_43_2 = stackOut_42_2;
              break L13;
            } else {
              stackOut_40_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackOut_40_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackOut_40_2 = "{...}";
              stackIn_43_0 = stackOut_40_0;
              stackIn_43_1 = stackOut_40_1;
              stackIn_43_2 = stackOut_40_2;
              break L13;
            }
          }
          L14: {
            stackOut_43_0 = (RuntimeException) ((Object) stackIn_43_0);
            stackOut_43_1 = ((StringBuilder) (Object) stackIn_43_1).append(stackIn_43_2).append(',');
            stackIn_46_0 = stackOut_43_0;
            stackIn_46_1 = stackOut_43_1;
            stackIn_44_0 = stackOut_43_0;
            stackIn_44_1 = stackOut_43_1;
            if (param1 == null) {
              stackOut_46_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackOut_46_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackOut_46_2 = "null";
              stackIn_47_0 = stackOut_46_0;
              stackIn_47_1 = stackOut_46_1;
              stackIn_47_2 = stackOut_46_2;
              break L14;
            } else {
              stackOut_44_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackOut_44_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackOut_44_2 = "{...}";
              stackIn_47_0 = stackOut_44_0;
              stackIn_47_1 = stackOut_44_1;
              stackIn_47_2 = stackOut_44_2;
              break L14;
            }
          }
          L15: {
            stackOut_47_0 = (RuntimeException) ((Object) stackIn_47_0);
            stackOut_47_1 = ((StringBuilder) (Object) stackIn_47_1).append(stackIn_47_2).append(',').append(param2).append(',');
            stackIn_50_0 = stackOut_47_0;
            stackIn_50_1 = stackOut_47_1;
            stackIn_48_0 = stackOut_47_0;
            stackIn_48_1 = stackOut_47_1;
            if (param3 == null) {
              stackOut_50_0 = (RuntimeException) ((Object) stackIn_50_0);
              stackOut_50_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackOut_50_2 = "null";
              stackIn_51_0 = stackOut_50_0;
              stackIn_51_1 = stackOut_50_1;
              stackIn_51_2 = stackOut_50_2;
              break L15;
            } else {
              stackOut_48_0 = (RuntimeException) ((Object) stackIn_48_0);
              stackOut_48_1 = (StringBuilder) ((Object) stackIn_48_1);
              stackOut_48_2 = "{...}";
              stackIn_51_0 = stackOut_48_0;
              stackIn_51_1 = stackOut_48_1;
              stackIn_51_2 = stackOut_48_2;
              break L15;
            }
          }
          L16: {
            stackOut_51_0 = (RuntimeException) ((Object) stackIn_51_0);
            stackOut_51_1 = ((StringBuilder) (Object) stackIn_51_1).append(stackIn_51_2).append(',');
            stackIn_54_0 = stackOut_51_0;
            stackIn_54_1 = stackOut_51_1;
            stackIn_52_0 = stackOut_51_0;
            stackIn_52_1 = stackOut_51_1;
            if (param4 == null) {
              stackOut_54_0 = (RuntimeException) ((Object) stackIn_54_0);
              stackOut_54_1 = (StringBuilder) ((Object) stackIn_54_1);
              stackOut_54_2 = "null";
              stackIn_55_0 = stackOut_54_0;
              stackIn_55_1 = stackOut_54_1;
              stackIn_55_2 = stackOut_54_2;
              break L16;
            } else {
              stackOut_52_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackOut_52_1 = (StringBuilder) ((Object) stackIn_52_1);
              stackOut_52_2 = "{...}";
              stackIn_55_0 = stackOut_52_0;
              stackIn_55_1 = stackOut_52_1;
              stackIn_55_2 = stackOut_52_2;
              break L16;
            }
          }
          L17: {
            stackOut_55_0 = (RuntimeException) ((Object) stackIn_55_0);
            stackOut_55_1 = ((StringBuilder) (Object) stackIn_55_1).append(stackIn_55_2).append(',');
            stackIn_58_0 = stackOut_55_0;
            stackIn_58_1 = stackOut_55_1;
            stackIn_56_0 = stackOut_55_0;
            stackIn_56_1 = stackOut_55_1;
            if (param5 == null) {
              stackOut_58_0 = (RuntimeException) ((Object) stackIn_58_0);
              stackOut_58_1 = (StringBuilder) ((Object) stackIn_58_1);
              stackOut_58_2 = "null";
              stackIn_59_0 = stackOut_58_0;
              stackIn_59_1 = stackOut_58_1;
              stackIn_59_2 = stackOut_58_2;
              break L17;
            } else {
              stackOut_56_0 = (RuntimeException) ((Object) stackIn_56_0);
              stackOut_56_1 = (StringBuilder) ((Object) stackIn_56_1);
              stackOut_56_2 = "{...}";
              stackIn_59_0 = stackOut_56_0;
              stackIn_59_1 = stackOut_56_1;
              stackIn_59_2 = stackOut_56_2;
              break L17;
            }
          }
          L18: {
            stackOut_59_0 = (RuntimeException) ((Object) stackIn_59_0);
            stackOut_59_1 = ((StringBuilder) (Object) stackIn_59_1).append(stackIn_59_2).append(',').append(param6).append(',');
            stackIn_62_0 = stackOut_59_0;
            stackIn_62_1 = stackOut_59_1;
            stackIn_60_0 = stackOut_59_0;
            stackIn_60_1 = stackOut_59_1;
            if (param7 == null) {
              stackOut_62_0 = (RuntimeException) ((Object) stackIn_62_0);
              stackOut_62_1 = (StringBuilder) ((Object) stackIn_62_1);
              stackOut_62_2 = "null";
              stackIn_63_0 = stackOut_62_0;
              stackIn_63_1 = stackOut_62_1;
              stackIn_63_2 = stackOut_62_2;
              break L18;
            } else {
              stackOut_60_0 = (RuntimeException) ((Object) stackIn_60_0);
              stackOut_60_1 = (StringBuilder) ((Object) stackIn_60_1);
              stackOut_60_2 = "{...}";
              stackIn_63_0 = stackOut_60_0;
              stackIn_63_1 = stackOut_60_1;
              stackIn_63_2 = stackOut_60_2;
              break L18;
            }
          }
          L19: {
            stackOut_63_0 = (RuntimeException) ((Object) stackIn_63_0);
            stackOut_63_1 = ((StringBuilder) (Object) stackIn_63_1).append(stackIn_63_2).append(',');
            stackIn_66_0 = stackOut_63_0;
            stackIn_66_1 = stackOut_63_1;
            stackIn_64_0 = stackOut_63_0;
            stackIn_64_1 = stackOut_63_1;
            if (param8 == null) {
              stackOut_66_0 = (RuntimeException) ((Object) stackIn_66_0);
              stackOut_66_1 = (StringBuilder) ((Object) stackIn_66_1);
              stackOut_66_2 = "null";
              stackIn_67_0 = stackOut_66_0;
              stackIn_67_1 = stackOut_66_1;
              stackIn_67_2 = stackOut_66_2;
              break L19;
            } else {
              stackOut_64_0 = (RuntimeException) ((Object) stackIn_64_0);
              stackOut_64_1 = (StringBuilder) ((Object) stackIn_64_1);
              stackOut_64_2 = "{...}";
              stackIn_67_0 = stackOut_64_0;
              stackIn_67_1 = stackOut_64_1;
              stackIn_67_2 = stackOut_64_2;
              break L19;
            }
          }
          L20: {
            stackOut_67_0 = (RuntimeException) ((Object) stackIn_67_0);
            stackOut_67_1 = ((StringBuilder) (Object) stackIn_67_1).append(stackIn_67_2).append(',');
            stackIn_70_0 = stackOut_67_0;
            stackIn_70_1 = stackOut_67_1;
            stackIn_68_0 = stackOut_67_0;
            stackIn_68_1 = stackOut_67_1;
            if (param9 == null) {
              stackOut_70_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackOut_70_1 = (StringBuilder) ((Object) stackIn_70_1);
              stackOut_70_2 = "null";
              stackIn_71_0 = stackOut_70_0;
              stackIn_71_1 = stackOut_70_1;
              stackIn_71_2 = stackOut_70_2;
              break L20;
            } else {
              stackOut_68_0 = (RuntimeException) ((Object) stackIn_68_0);
              stackOut_68_1 = (StringBuilder) ((Object) stackIn_68_1);
              stackOut_68_2 = "{...}";
              stackIn_71_0 = stackOut_68_0;
              stackIn_71_1 = stackOut_68_1;
              stackIn_71_2 = stackOut_68_2;
              break L20;
            }
          }
          L21: {
            stackOut_71_0 = (RuntimeException) ((Object) stackIn_71_0);
            stackOut_71_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_71_2).append(',');
            stackIn_74_0 = stackOut_71_0;
            stackIn_74_1 = stackOut_71_1;
            stackIn_72_0 = stackOut_71_0;
            stackIn_72_1 = stackOut_71_1;
            if (param10 == null) {
              stackOut_74_0 = (RuntimeException) ((Object) stackIn_74_0);
              stackOut_74_1 = (StringBuilder) ((Object) stackIn_74_1);
              stackOut_74_2 = "null";
              stackIn_75_0 = stackOut_74_0;
              stackIn_75_1 = stackOut_74_1;
              stackIn_75_2 = stackOut_74_2;
              break L21;
            } else {
              stackOut_72_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackOut_72_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackOut_72_2 = "{...}";
              stackIn_75_0 = stackOut_72_0;
              stackIn_75_1 = stackOut_72_1;
              stackIn_75_2 = stackOut_72_2;
              break L21;
            }
          }
          L22: {
            stackOut_75_0 = (RuntimeException) ((Object) stackIn_75_0);
            stackOut_75_1 = ((StringBuilder) (Object) stackIn_75_1).append(stackIn_75_2).append(',');
            stackIn_78_0 = stackOut_75_0;
            stackIn_78_1 = stackOut_75_1;
            stackIn_76_0 = stackOut_75_0;
            stackIn_76_1 = stackOut_75_1;
            if (param11 == null) {
              stackOut_78_0 = (RuntimeException) ((Object) stackIn_78_0);
              stackOut_78_1 = (StringBuilder) ((Object) stackIn_78_1);
              stackOut_78_2 = "null";
              stackIn_79_0 = stackOut_78_0;
              stackIn_79_1 = stackOut_78_1;
              stackIn_79_2 = stackOut_78_2;
              break L22;
            } else {
              stackOut_76_0 = (RuntimeException) ((Object) stackIn_76_0);
              stackOut_76_1 = (StringBuilder) ((Object) stackIn_76_1);
              stackOut_76_2 = "{...}";
              stackIn_79_0 = stackOut_76_0;
              stackIn_79_1 = stackOut_76_1;
              stackIn_79_2 = stackOut_76_2;
              break L22;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_79_0), stackIn_79_2 + ')');
        }
    }

    public static void a(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_b = null;
              if (param0 == 9) {
                break L1;
              } else {
                mp.a(13);
                break L1;
              }
            }
            field_a = null;
            field_d = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var1), "mp.B(" + param0 + ')');
        }
    }

    public mp() {
        this.field_c = new int[16];
    }

    static {
        field_a = new gb();
        field_b = "Add <%0> to ignore list";
    }
}
