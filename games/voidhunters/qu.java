/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qu extends rqa {
    static boolean field_o;

    final static caa[] a(int param0, String param1, String param2, asb param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        caa[] stackIn_1_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4_int = 3 % ((param0 - -36) / 49);
            var5 = param3.b(param1, -80);
            var6 = param3.a(true, var5, param2);
            stackIn_1_0 = ng.a(var5, (byte) 104, var6, param3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var4);

            stackIn_5_1 = new StringBuilder().append("qu.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');

            if (param2 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param3 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), stackIn_14_2 + ')');
        }
        return stackIn_1_0;
    }

    qu(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 < -119) {
                break L1;
              } else {
                qu.a((ml) null, -69);
                break L1;
              }
            }
            stackIn_4_0 = new nc(frb.a(149, 122));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("qu.A(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    final static void a(ml param0, int param1) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        ml var3 = null;
        int var4 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = VoidHunters.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_int = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (4 <= var2_int) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var3 = new ml(32);
                        var3.a(1, 1, new ml(15));
                        var3.a(1, 2, new ml(15));
                        var3.a(1, 3, new ml(15));
                        var3.a(1, 4, new ml(15));
                        var3.a(1, 5, new ml(15));
                        param0.a(1, var2_int, var3);
                        var2_int++;
                        if (var4 != 0) {
                            statePc = 16;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var4 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (param1 < -12) {
                            statePc = 16;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        qu.a((llb) null, -42, (llb) null, (no) null, (llb) null, (llb) null, (llb) null, true, (llb) null, (llb) null, (llb) null, (pjb) null);
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 11: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    stackIn_14_0 = (RuntimeException) (runtimeException);
                    stackIn_12_0 = stackIn_14_0;
                    stackIn_14_1 = new StringBuilder().append("qu.C(");
                    stackIn_12_1 = stackIn_14_1;
                    if (param0 == null) {
                        statePc = 14;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    stackIn_15_0 = (RuntimeException) ((Object) stackIn_12_0);
                    stackIn_15_1 = (StringBuilder) ((Object) stackIn_12_1);
                    stackIn_15_2 = "{...}";
                    statePc = 15;
                    continue stateLoop;
                }
                case 14: {
                    stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
                    stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
                    stackIn_15_2 = "null";
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    throw rta.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
                }
                case 16: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(llb param0, int param1, llb param2, no param3, llb param4, llb param5, llb param6, boolean param7, llb param8, llb param9, llb param10, pjb param11) {
        String stackIn_24_0 = null;
        int stackIn_28_0 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        StringBuilder stackIn_42_1 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        StringBuilder stackIn_46_1 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        StringBuilder stackIn_50_1 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_51_2 = null;
        StringBuilder stackIn_54_1 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
        StringBuilder stackIn_58_1 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_59_2 = null;
        StringBuilder stackIn_62_1 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_63_2 = null;
        StringBuilder stackIn_66_1 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_67_2 = null;
        StringBuilder stackIn_70_1 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
        StringBuilder stackIn_74_1 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_75_2 = null;
        RuntimeException decompiledCaughtException = null;
        phb var12 = null;
        RuntimeException var12_ref = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        phb[] var16 = null;
        llb var17 = null;
        int var18 = 0;
        String var19 = null;
        int var20 = 0;
        var20 = VoidHunters.field_G;
        try {
          L0: {
            ej.field_c = param3;
            rqa.field_m[4] = 16711935;
            rqa.field_m[3] = 16736511;
            rqa.field_m[0] = 16764000;
            rqa.field_m[2] = 9474303;
            rqa.field_m[1] = 6356832;
            cqb.field_e = param7;
            odb.field_b = param6;
            bja.field_p[1] = 6356832;
            kmb.field_a = 8421504;
            bja.field_p[0] = 16764000;
            bja.field_p[3] = 16736511;
            bja.field_p[2] = 16736352;
            rqa.field_m[4] = 16711935;
            var12 = new phb(4, 4);
            var13 = var12.field_r;
            var14 = var12.field_r;
            var12.field_r[15] = 7368816;
            var15 = var12.field_r;
            var15[8] = 7368816;
            var13[2] = 7368816;
            var14[5] = 7368816;
            var16 = new phb[9];
            var16[4] = var12;
            hca.field_o = new llb(0L, param2);
            kea.field_a = new llb((long)param1, param10);
            hca.field_o.b(param1 ^ -561, kea.field_a);
            var17 = new llb(0L, (llb) null);
            var17.field_lb = new ij();
            vea.field_p = new soa(0L, var17, param9, param11);
            kea.field_a.b(-561, vea.field_p);
            jba.field_b = new llb(0L, param4);
            kea.field_a.b(-561, jba.field_b);
            bpa.field_c = new llb(0L, param0);
            bpa.field_c.field_eb = ej.field_c;
            jba.field_b.b(-561, bpa.field_c);
            jba.field_b.g(119);
            fgb.field_l = new llb(0L, (llb) null);
            fgb.field_l.field_gb = var16;
            jba.field_b.b(-561, fgb.field_l);
            ul.field_b = new llb[5];
            lob.field_c = new llb[5];
            hpa.field_o = new llb[5];
            vh.field_c = new llb[5];
            var18 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if ((var18 ^ -1) <= -6) {
                    break L3;
                  } else {
                    stackIn_28_0 = var18;

                    if (var20 != 0) {
                      break L2;
                    } else {
                      L4: {
                        L5: {
                          L6: {
                            if (stackIn_28_0 == 0) {
                              break L6;
                            } else {
                              L7: {
                                L8: {
                                  if (-2 != (var18 ^ -1)) {
                                    break L8;
                                  } else {
                                    if (cqb.field_e) {
                                      break L7;
                                    } else {
                                      break L8;
                                    }
                                  }
                                }
                                if (var18 != 2) {
                                  break L4;
                                } else {
                                  var19 = kp.field_o;
                                  if (var20 == 0) {
                                    break L5;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                              var19 = bd.field_a;
                              if (var20 == 0) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          L9: {
                            if (cqb.field_e) {
                              stackIn_24_0 = bib.field_e;
                              break L9;
                            } else {
                              stackIn_24_0 = wg.field_o;
                              break L9;
                            }
                          }
                          var19 = stackIn_24_0;
                          break L5;
                        }
                        ul.field_b[var18] = new llb(0L, param8);
                        hpa.field_o[var18] = new llb(0L, odb.field_b, var19);
                        vh.field_c[var18] = new llb(0L, (llb) null);
                        vh.field_c[var18].field_B = 1;
                        lob.field_c[var18] = new llb(0L, odb.field_b);
                        lob.field_c[var18].field_B = 1;
                        ul.field_b[var18].b(-561, hpa.field_o[var18]);
                        ul.field_b[var18].b(-561, vh.field_c[var18]);
                        ul.field_b[var18].b(-561, lob.field_c[var18]);
                        ul.field_b[var18].g(112);
                        hca.field_o.b(param1 ^ -561, ul.field_b[var18]);
                        fb.field_o = fb.field_o + 1;
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
                nlb.field_o = new llb(0L, param5);
                nlb.field_o.field_R = tg.field_r;
                hca.field_o.b(-561, nlb.field_o);
                stackIn_28_0 = wh.g(-126) ? 1 : 0;
                break L2;
              }
              L10: {
                L11: {
                  if (stackIn_28_0 == 0) {
                    break L11;
                  } else {
                    if (!erb.field_p) {
                      break L10;
                    } else {
                      break L11;
                    }
                  }
                }
                ada.field_b = new pia(0, 0, 0, 0);
                break L10;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var12_ref = decompiledCaughtException;
            stackIn_38_0 = (RuntimeException) (var12_ref);

            stackIn_38_1 = new StringBuilder().append("qu.B(");

            if (param0 == null) {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "null";
              break L12;
            } else {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "{...}";
              break L12;
            }
          }
          L13: {


            stackIn_42_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_39_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "null";
              break L13;
            } else {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "{...}";
              break L13;
            }
          }
          L14: {


            stackIn_46_1 = ((StringBuilder) (Object) stackIn_43_1).append(stackIn_43_2).append(',');

            if (param3 == null) {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_47_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackIn_47_2 = "null";
              break L14;
            } else {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_47_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackIn_47_2 = "{...}";
              break L14;
            }
          }
          L15: {


            stackIn_50_1 = ((StringBuilder) (Object) stackIn_47_1).append(stackIn_47_2).append(',');

            if (param4 == null) {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_51_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackIn_51_2 = "null";
              break L15;
            } else {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_51_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackIn_51_2 = "{...}";
              break L15;
            }
          }
          L16: {


            stackIn_54_1 = ((StringBuilder) (Object) stackIn_51_1).append(stackIn_51_2).append(',');

            if (param5 == null) {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_55_1 = (StringBuilder) ((Object) stackIn_54_1);
              stackIn_55_2 = "null";
              break L16;
            } else {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_55_1 = (StringBuilder) ((Object) stackIn_54_1);
              stackIn_55_2 = "{...}";
              break L16;
            }
          }
          L17: {


            stackIn_58_1 = ((StringBuilder) (Object) stackIn_55_1).append(stackIn_55_2).append(',');

            if (param6 == null) {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_59_1 = (StringBuilder) ((Object) stackIn_58_1);
              stackIn_59_2 = "null";
              break L17;
            } else {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_59_1 = (StringBuilder) ((Object) stackIn_58_1);
              stackIn_59_2 = "{...}";
              break L17;
            }
          }
          L18: {


            stackIn_62_1 = ((StringBuilder) (Object) stackIn_59_1).append(stackIn_59_2).append(',').append(param7).append(',');

            if (param8 == null) {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_63_1 = (StringBuilder) ((Object) stackIn_62_1);
              stackIn_63_2 = "null";
              break L18;
            } else {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_63_1 = (StringBuilder) ((Object) stackIn_62_1);
              stackIn_63_2 = "{...}";
              break L18;
            }
          }
          L19: {


            stackIn_66_1 = ((StringBuilder) (Object) stackIn_63_1).append(stackIn_63_2).append(',');

            if (param9 == null) {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_67_1 = (StringBuilder) ((Object) stackIn_66_1);
              stackIn_67_2 = "null";
              break L19;
            } else {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_67_1 = (StringBuilder) ((Object) stackIn_66_1);
              stackIn_67_2 = "{...}";
              break L19;
            }
          }
          L20: {


            stackIn_70_1 = ((StringBuilder) (Object) stackIn_67_1).append(stackIn_67_2).append(',');

            if (param10 == null) {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_71_1 = (StringBuilder) ((Object) stackIn_70_1);
              stackIn_71_2 = "null";
              break L20;
            } else {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_71_1 = (StringBuilder) ((Object) stackIn_70_1);
              stackIn_71_2 = "{...}";
              break L20;
            }
          }
          L21: {


            stackIn_74_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_71_2).append(',');

            if (param11 == null) {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_75_1 = (StringBuilder) ((Object) stackIn_74_1);
              stackIn_75_2 = "null";
              break L21;
            } else {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_75_1 = (StringBuilder) ((Object) stackIn_74_1);
              stackIn_75_2 = "{...}";
              break L21;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_39_0), stackIn_75_2 + ')');
        }
    }

    static {
        wva discarded$0 = new wva();
    }
}
