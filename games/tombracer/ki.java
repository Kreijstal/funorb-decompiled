/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ki extends dg {
    static jua field_n;
    static int field_o;
    static String field_p;
    private int field_m;

    final void a(int param0, la param1, kh param2) {
        try {
            super.a(127, param1, param2);
            if (param0 <= 119) {
                ((ki) this).field_m = 120;
            }
            ((ki) this).field_m = param2.b((byte) 44, 4);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "ki.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0, kh param1) {
        try {
            super.a((byte) 115, param1);
            int var3_int = 44 / ((param0 - -8) / 40);
            param1.a((byte) -125, ((ki) this).field_m, 4);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "ki.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    ki(int param0) {
        super(param0);
    }

    final static void a(int param0, java.awt.Component param1) {
        try {
            param1.removeKeyListener((java.awt.event.KeyListener) (Object) nfa.field_n);
            if (param0 != -18520) {
                Object var3 = null;
                ki.a(-126, (java.awt.Component) null);
            }
            param1.removeFocusListener((java.awt.event.FocusListener) (Object) nfa.field_n);
            ita.field_f = -1;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "ki.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static wda a(kh param0, byte param1, la param2, boolean param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        wi stackIn_26_0 = null;
        bg stackIn_28_0 = null;
        nj stackIn_30_0 = null;
        bha stackIn_32_0 = null;
        ws stackIn_34_0 = null;
        ro stackIn_36_0 = null;
        spa stackIn_38_0 = null;
        pt stackIn_40_0 = null;
        uqa stackIn_42_0 = null;
        uha stackIn_44_0 = null;
        sa stackIn_46_0 = null;
        ira stackIn_48_0 = null;
        rsa stackIn_50_0 = null;
        oqa stackIn_52_0 = null;
        hia stackIn_54_0 = null;
        lo stackIn_56_0 = null;
        ri stackIn_58_0 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_63_2 = null;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        String stackIn_66_2 = null;
        RuntimeException decompiledCaughtException = null;
        wi stackOut_25_0 = null;
        bg stackOut_27_0 = null;
        nj stackOut_29_0 = null;
        bha stackOut_31_0 = null;
        ws stackOut_33_0 = null;
        ro stackOut_35_0 = null;
        spa stackOut_37_0 = null;
        pt stackOut_39_0 = null;
        uha stackOut_43_0 = null;
        sa stackOut_45_0 = null;
        rsa stackOut_49_0 = null;
        oqa stackOut_51_0 = null;
        lo stackOut_55_0 = null;
        ri stackOut_57_0 = null;
        hia stackOut_53_0 = null;
        ira stackOut_47_0 = null;
        uqa stackOut_41_0 = null;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        String stackOut_62_2 = null;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        String stackOut_61_2 = null;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        String stackOut_65_2 = null;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        String stackOut_64_2 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (param2.field_E > 7) {
              var4_int = param0.b((byte) 44, 6);
              break L0;
            } else {
              var4_int = param0.b((byte) 44, 4);
              break L0;
            }
          }
          var5 = 37 / ((-67 - param1) / 45);
          var6 = var4_int;
          if (var6 == 0) {
            stackOut_25_0 = new wi(param2, param0, param3);
            stackIn_26_0 = stackOut_25_0;
            return (wda) (Object) stackIn_26_0;
          } else {
            if (var6 == 1) {
              stackOut_27_0 = new bg(param2, param0, param3);
              stackIn_28_0 = stackOut_27_0;
              return (wda) (Object) stackIn_28_0;
            } else {
              if (var6 == 2) {
                stackOut_29_0 = new nj(param2, param0, param3);
                stackIn_30_0 = stackOut_29_0;
                return (wda) (Object) stackIn_30_0;
              } else {
                if (3 == var6) {
                  stackOut_31_0 = new bha(param2, param0, param3);
                  stackIn_32_0 = stackOut_31_0;
                  return (wda) (Object) stackIn_32_0;
                } else {
                  if (4 == var6) {
                    stackOut_33_0 = new ws(param2, param0, param3);
                    stackIn_34_0 = stackOut_33_0;
                    return (wda) (Object) stackIn_34_0;
                  } else {
                    if (5 == var6) {
                      stackOut_35_0 = new ro(param2, param0, param3);
                      stackIn_36_0 = stackOut_35_0;
                      return (wda) (Object) stackIn_36_0;
                    } else {
                      if (var6 == 6) {
                        stackOut_37_0 = new spa(param2, param0, param3);
                        stackIn_38_0 = stackOut_37_0;
                        return (wda) (Object) stackIn_38_0;
                      } else {
                        if (var6 == 7) {
                          stackOut_39_0 = new pt(param2, param0, param3);
                          stackIn_40_0 = stackOut_39_0;
                          return (wda) (Object) stackIn_40_0;
                        } else {
                          if (var6 != 8) {
                            if (var6 == 9) {
                              stackOut_43_0 = new uha(param2, param0, param3);
                              stackIn_44_0 = stackOut_43_0;
                              return (wda) (Object) stackIn_44_0;
                            } else {
                              if (10 == var6) {
                                stackOut_45_0 = new sa(param2, param0, param3);
                                stackIn_46_0 = stackOut_45_0;
                                return (wda) (Object) stackIn_46_0;
                              } else {
                                if (11 != var6) {
                                  if (var6 == 12) {
                                    stackOut_49_0 = new rsa(param2, param0, param3);
                                    stackIn_50_0 = stackOut_49_0;
                                    return (wda) (Object) stackIn_50_0;
                                  } else {
                                    if (var6 == 13) {
                                      stackOut_51_0 = new oqa(param2, param0, param3);
                                      stackIn_52_0 = stackOut_51_0;
                                      return (wda) (Object) stackIn_52_0;
                                    } else {
                                      if (var6 != 14) {
                                        if (15 == var6) {
                                          stackOut_55_0 = new lo(param2, param0, param3);
                                          stackIn_56_0 = stackOut_55_0;
                                          return (wda) (Object) stackIn_56_0;
                                        } else {
                                          if (var6 == 16) {
                                            stackOut_57_0 = new ri(param2, param0, param3);
                                            stackIn_58_0 = stackOut_57_0;
                                            return (wda) (Object) stackIn_58_0;
                                          } else {
                                            throw new IllegalStateException("Unrecognised locomotor type: " + var4_int);
                                          }
                                        }
                                      } else {
                                        stackOut_53_0 = new hia(param2, param0, param3);
                                        stackIn_54_0 = stackOut_53_0;
                                        return (wda) (Object) stackIn_54_0;
                                      }
                                    }
                                  }
                                } else {
                                  stackOut_47_0 = new ira(param2, param0, param3);
                                  stackIn_48_0 = stackOut_47_0;
                                  return (wda) (Object) stackIn_48_0;
                                }
                              }
                            }
                          } else {
                            stackOut_41_0 = new uqa(param2, param0, param3);
                            stackIn_42_0 = stackOut_41_0;
                            return (wda) (Object) stackIn_42_0;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_60_0 = (RuntimeException) var4;
            stackOut_60_1 = new StringBuilder().append("ki.F(");
            stackIn_62_0 = stackOut_60_0;
            stackIn_62_1 = stackOut_60_1;
            stackIn_61_0 = stackOut_60_0;
            stackIn_61_1 = stackOut_60_1;
            if (param0 == null) {
              stackOut_62_0 = (RuntimeException) (Object) stackIn_62_0;
              stackOut_62_1 = (StringBuilder) (Object) stackIn_62_1;
              stackOut_62_2 = "null";
              stackIn_63_0 = stackOut_62_0;
              stackIn_63_1 = stackOut_62_1;
              stackIn_63_2 = stackOut_62_2;
              break L1;
            } else {
              stackOut_61_0 = (RuntimeException) (Object) stackIn_61_0;
              stackOut_61_1 = (StringBuilder) (Object) stackIn_61_1;
              stackOut_61_2 = "{...}";
              stackIn_63_0 = stackOut_61_0;
              stackIn_63_1 = stackOut_61_1;
              stackIn_63_2 = stackOut_61_2;
              break L1;
            }
          }
          L2: {
            stackOut_63_0 = (RuntimeException) (Object) stackIn_63_0;
            stackOut_63_1 = ((StringBuilder) (Object) stackIn_63_1).append(stackIn_63_2).append(',').append(param1).append(',');
            stackIn_65_0 = stackOut_63_0;
            stackIn_65_1 = stackOut_63_1;
            stackIn_64_0 = stackOut_63_0;
            stackIn_64_1 = stackOut_63_1;
            if (param2 == null) {
              stackOut_65_0 = (RuntimeException) (Object) stackIn_65_0;
              stackOut_65_1 = (StringBuilder) (Object) stackIn_65_1;
              stackOut_65_2 = "null";
              stackIn_66_0 = stackOut_65_0;
              stackIn_66_1 = stackOut_65_1;
              stackIn_66_2 = stackOut_65_2;
              break L2;
            } else {
              stackOut_64_0 = (RuntimeException) (Object) stackIn_64_0;
              stackOut_64_1 = (StringBuilder) (Object) stackIn_64_1;
              stackOut_64_2 = "{...}";
              stackIn_66_0 = stackOut_64_0;
              stackIn_66_1 = stackOut_64_1;
              stackIn_66_2 = stackOut_64_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_66_0, stackIn_66_2 + ',' + param3 + ')');
        }
    }

    final void a(gr param0, gma param1, byte param2) {
        try {
            super.a(param0, param1, param2);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "ki.E(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    ki(int param0, la param1, kh param2) {
        super(param0, param1, param2);
    }

    final void a(boolean param0, int param1) {
        ((ki) this).field_m = param1;
        if (!param0) {
            field_p = null;
        }
    }

    public static void a(boolean param0) {
        field_n = null;
        field_p = null;
    }

    final static void b(boolean param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        kb var4 = null;
        bb var5 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var4 = (kb) (Object) nn.field_a.f(-80);
            L1: while (true) {
              if (var4 == null) {
                L2: {
                  if (!param0) {
                    break L2;
                  } else {
                    ki.b(true, -117);
                    break L2;
                  }
                }
                var5 = (bb) (Object) mg.field_b.f(-80);
                L3: while (true) {
                  if (var5 == null) {
                    break L0;
                  } else {
                    pc.a(param0, param1, var5);
                    var5 = (bb) (Object) mg.field_b.e(122);
                    continue L3;
                  }
                }
              } else {
                mca.a(var4, 0, param1);
                var4 = (kb) (Object) nn.field_a.e(111);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "ki.H(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(iq param0, int param1, int param2, int param3, byte param4) {
        Object var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        Object stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        Object stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        Object stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        Object stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var9 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var7 = 31 / ((param4 - -38) / 47);
              var6 = null;
              var8 = ((ki) this).field_m;
              if (var8 == 0) {
                var6 = (Object) (Object) jna.field_j[0];
                break L1;
              } else {
                if (var8 != 1) {
                  if (var8 == 2) {
                    var6 = (Object) (Object) jna.field_j[2];
                    break L1;
                  } else {
                    if (3 == var8) {
                      var6 = (Object) (Object) jna.field_j[3];
                      break L1;
                    } else {
                      if (var8 != 4) {
                        break L1;
                      } else {
                        var6 = (Object) (Object) jna.field_j[4];
                        break L1;
                      }
                    }
                  }
                } else {
                  var6 = (Object) (Object) jna.field_j[1];
                  break L1;
                }
              }
            }
            if (var6 == null) {
              return;
            } else {
              var8 = dfa.a(-((ki) this).field_h.g(-25787) + 4096 >> 2, 2048, -111);
              gqa.a(var8, -83584144, param1, param2, (ka) var6, param3);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = (Object) (Object) decompiledCaughtException;
            stackOut_18_0 = var6;
            stackOut_18_1 = new StringBuilder().append("ki.D(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L2;
            } else {
              stackOut_19_0 = stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = 82;
        field_p = "Start Game";
    }
}
