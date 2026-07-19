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
                this.field_m = 120;
            }
            this.field_m = param2.b((byte) 44, 4);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ki.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0, kh param1) {
        try {
            super.a((byte) 115, param1);
            int var3_int = 44 / ((param0 - -8) / 40);
            param1.a((byte) -125, this.field_m, 4);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ki.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    ki(int param0) {
        super(param0);
    }

    final static void a(int param0, java.awt.Component param1) {
        try {
            param1.removeKeyListener(nfa.field_n);
            if (param0 != -18520) {
                java.awt.Component var3 = (java.awt.Component) null;
                ki.a(-126, (java.awt.Component) null);
            }
            param1.removeFocusListener(nfa.field_n);
            ita.field_f = -1;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ki.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static wda a(kh param0, byte param1, la param2, boolean param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        wi stackIn_29_0 = null;
        bg stackIn_31_0 = null;
        nj stackIn_33_0 = null;
        bha stackIn_35_0 = null;
        ws stackIn_37_0 = null;
        ro stackIn_39_0 = null;
        spa stackIn_41_0 = null;
        pt stackIn_43_0 = null;
        uqa stackIn_45_0 = null;
        uha stackIn_47_0 = null;
        sa stackIn_49_0 = null;
        ira stackIn_51_0 = null;
        rsa stackIn_53_0 = null;
        oqa stackIn_55_0 = null;
        hia stackIn_57_0 = null;
        lo stackIn_59_0 = null;
        ri stackIn_61_0 = null;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        String stackIn_66_2 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_69_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        wi stackOut_28_0 = null;
        bg stackOut_30_0 = null;
        nj stackOut_32_0 = null;
        bha stackOut_34_0 = null;
        ws stackOut_36_0 = null;
        ro stackOut_38_0 = null;
        spa stackOut_40_0 = null;
        pt stackOut_42_0 = null;
        uqa stackOut_44_0 = null;
        uha stackOut_46_0 = null;
        sa stackOut_48_0 = null;
        ira stackOut_50_0 = null;
        rsa stackOut_52_0 = null;
        oqa stackOut_54_0 = null;
        hia stackOut_56_0 = null;
        lo stackOut_58_0 = null;
        ri stackOut_60_0 = null;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        String stackOut_65_2 = null;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        String stackOut_64_2 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        String stackOut_67_2 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if ((param2.field_E ^ -1) < -8) {
                  break L2;
                } else {
                  var4_int = param0.b((byte) 44, 4);
                  if (var7 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var4_int = param0.b((byte) 44, 6);
              break L1;
            }
            var5 = 37 / ((-67 - param1) / 45);
            var6 = var4_int;
            if (var6 == 0) {
              stackOut_28_0 = new wi(param2, param0, param3);
              stackIn_29_0 = stackOut_28_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (var6 == 1) {
                stackOut_30_0 = new bg(param2, param0, param3);
                stackIn_31_0 = stackOut_30_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if ((var6 ^ -1) == -3) {
                  stackOut_32_0 = new nj(param2, param0, param3);
                  stackIn_33_0 = stackOut_32_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (3 == var6) {
                    stackOut_34_0 = new bha(param2, param0, param3);
                    stackIn_35_0 = stackOut_34_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (4 == var6) {
                      stackOut_36_0 = new ws(param2, param0, param3);
                      stackIn_37_0 = stackOut_36_0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      if (5 == var6) {
                        stackOut_38_0 = new ro(param2, param0, param3);
                        stackIn_39_0 = stackOut_38_0;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        if (var6 == 6) {
                          stackOut_40_0 = new spa(param2, param0, param3);
                          stackIn_41_0 = stackOut_40_0;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        } else {
                          if (var6 == 7) {
                            stackOut_42_0 = new pt(param2, param0, param3);
                            stackIn_43_0 = stackOut_42_0;
                            decompiledRegionSelector0 = 7;
                            break L0;
                          } else {
                            L3: {
                              if ((var6 ^ -1) != -9) {
                                break L3;
                              } else {
                                if (var7 == 0) {
                                  stackOut_44_0 = new uqa(param2, param0, param3);
                                  stackIn_45_0 = stackOut_44_0;
                                  decompiledRegionSelector0 = 8;
                                  break L0;
                                } else {
                                  break L3;
                                }
                              }
                            }
                            if (-10 == (var6 ^ -1)) {
                              stackOut_46_0 = new uha(param2, param0, param3);
                              stackIn_47_0 = stackOut_46_0;
                              decompiledRegionSelector0 = 9;
                              break L0;
                            } else {
                              if (10 == var6) {
                                stackOut_48_0 = new sa(param2, param0, param3);
                                stackIn_49_0 = stackOut_48_0;
                                decompiledRegionSelector0 = 10;
                                break L0;
                              } else {
                                L4: {
                                  if (11 != var6) {
                                    break L4;
                                  } else {
                                    if (var7 == 0) {
                                      stackOut_50_0 = new ira(param2, param0, param3);
                                      stackIn_51_0 = stackOut_50_0;
                                      decompiledRegionSelector0 = 11;
                                      break L0;
                                    } else {
                                      break L4;
                                    }
                                  }
                                }
                                if (var6 == 12) {
                                  stackOut_52_0 = new rsa(param2, param0, param3);
                                  stackIn_53_0 = stackOut_52_0;
                                  decompiledRegionSelector0 = 12;
                                  break L0;
                                } else {
                                  if ((var6 ^ -1) == -14) {
                                    stackOut_54_0 = new oqa(param2, param0, param3);
                                    stackIn_55_0 = stackOut_54_0;
                                    decompiledRegionSelector0 = 13;
                                    break L0;
                                  } else {
                                    L5: {
                                      if (-15 != (var6 ^ -1)) {
                                        break L5;
                                      } else {
                                        if (var7 == 0) {
                                          stackOut_56_0 = new hia(param2, param0, param3);
                                          stackIn_57_0 = stackOut_56_0;
                                          decompiledRegionSelector0 = 14;
                                          break L0;
                                        } else {
                                          break L5;
                                        }
                                      }
                                    }
                                    if (15 == var6) {
                                      stackOut_58_0 = new lo(param2, param0, param3);
                                      stackIn_59_0 = stackOut_58_0;
                                      decompiledRegionSelector0 = 15;
                                      break L0;
                                    } else {
                                      if (-17 == (var6 ^ -1)) {
                                        stackOut_60_0 = new ri(param2, param0, param3);
                                        stackIn_61_0 = stackOut_60_0;
                                        decompiledRegionSelector0 = 16;
                                        break L0;
                                      } else {
                                        throw new IllegalStateException("Unrecognised locomotor type: " + var4_int);
                                      }
                                    }
                                  }
                                }
                              }
                            }
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
          L6: {
            var4 = decompiledCaughtException;
            stackOut_63_0 = (RuntimeException) (var4);
            stackOut_63_1 = new StringBuilder().append("ki.F(");
            stackIn_65_0 = stackOut_63_0;
            stackIn_65_1 = stackOut_63_1;
            stackIn_64_0 = stackOut_63_0;
            stackIn_64_1 = stackOut_63_1;
            if (param0 == null) {
              stackOut_65_0 = (RuntimeException) ((Object) stackIn_65_0);
              stackOut_65_1 = (StringBuilder) ((Object) stackIn_65_1);
              stackOut_65_2 = "null";
              stackIn_66_0 = stackOut_65_0;
              stackIn_66_1 = stackOut_65_1;
              stackIn_66_2 = stackOut_65_2;
              break L6;
            } else {
              stackOut_64_0 = (RuntimeException) ((Object) stackIn_64_0);
              stackOut_64_1 = (StringBuilder) ((Object) stackIn_64_1);
              stackOut_64_2 = "{...}";
              stackIn_66_0 = stackOut_64_0;
              stackIn_66_1 = stackOut_64_1;
              stackIn_66_2 = stackOut_64_2;
              break L6;
            }
          }
          L7: {
            stackOut_66_0 = (RuntimeException) ((Object) stackIn_66_0);
            stackOut_66_1 = ((StringBuilder) (Object) stackIn_66_1).append(stackIn_66_2).append(',').append(param1).append(',');
            stackIn_68_0 = stackOut_66_0;
            stackIn_68_1 = stackOut_66_1;
            stackIn_67_0 = stackOut_66_0;
            stackIn_67_1 = stackOut_66_1;
            if (param2 == null) {
              stackOut_68_0 = (RuntimeException) ((Object) stackIn_68_0);
              stackOut_68_1 = (StringBuilder) ((Object) stackIn_68_1);
              stackOut_68_2 = "null";
              stackIn_69_0 = stackOut_68_0;
              stackIn_69_1 = stackOut_68_1;
              stackIn_69_2 = stackOut_68_2;
              break L7;
            } else {
              stackOut_67_0 = (RuntimeException) ((Object) stackIn_67_0);
              stackOut_67_1 = (StringBuilder) ((Object) stackIn_67_1);
              stackOut_67_2 = "{...}";
              stackIn_69_0 = stackOut_67_0;
              stackIn_69_1 = stackOut_67_1;
              stackIn_69_2 = stackOut_67_2;
              break L7;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_69_0), stackIn_69_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (wda) ((Object) stackIn_29_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (wda) ((Object) stackIn_31_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (wda) ((Object) stackIn_33_0);
            } else {
              if (decompiledRegionSelector0 == 3) {
                return (wda) ((Object) stackIn_35_0);
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return (wda) ((Object) stackIn_37_0);
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return (wda) ((Object) stackIn_39_0);
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return (wda) ((Object) stackIn_41_0);
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return (wda) ((Object) stackIn_43_0);
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return (wda) ((Object) stackIn_45_0);
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return (wda) ((Object) stackIn_47_0);
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return (wda) ((Object) stackIn_49_0);
                            } else {
                              if (decompiledRegionSelector0 == 11) {
                                return (wda) ((Object) stackIn_51_0);
                              } else {
                                if (decompiledRegionSelector0 == 12) {
                                  return (wda) ((Object) stackIn_53_0);
                                } else {
                                  if (decompiledRegionSelector0 == 13) {
                                    return (wda) ((Object) stackIn_55_0);
                                  } else {
                                    if (decompiledRegionSelector0 == 14) {
                                      return (wda) ((Object) stackIn_57_0);
                                    } else {
                                      if (decompiledRegionSelector0 == 15) {
                                        return (wda) ((Object) stackIn_59_0);
                                      } else {
                                        return (wda) ((Object) stackIn_61_0);
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    final void a(gr param0, gma param1, byte param2) {
        try {
            super.a(param0, param1, param2);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ki.E(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    ki(int param0, la param1, kh param2) {
        super(param0, param1, param2);
    }

    final void a(boolean param0, int param1) {
        this.field_m = param1;
        if (!param0) {
            field_p = (String) null;
        }
    }

    public static void a(boolean param0) {
        field_n = null;
        if (param0) {
            field_n = (jua) null;
            field_p = null;
            return;
        }
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
            var4 = (kb) ((Object) nn.field_a.f(-80));
            L1: while (true) {
              L2: {
                L3: {
                  if (var4 == null) {
                    break L3;
                  } else {
                    mca.a(var4, 0, param1);
                    var4 = (kb) ((Object) nn.field_a.e(111));
                    if (var3 != 0) {
                      break L2;
                    } else {
                      if (var3 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (!param0) {
                  break L2;
                } else {
                  ki.b(true, -117);
                  break L2;
                }
              }
              var5 = (bb) ((Object) mg.field_b.f(-80));
              L4: while (true) {
                if (var5 == null) {
                  break L0;
                } else {
                  pc.a(param0, param1, var5);
                  var5 = (bb) ((Object) mg.field_b.e(122));
                  if (var3 == 0) {
                    continue L4;
                  } else {
                    return;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "ki.H(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(iq param0, int param1, int param2, int param3, byte param4) {
        Object var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        Object stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        Object stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        Object stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        Object stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var9 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var7 = 31 / ((param4 - -38) / 47);
                var6 = null;
                var8 = this.field_m;
                if (var8 == 0) {
                  break L2;
                } else {
                  L3: {
                    if (-2 != (var8 ^ -1)) {
                      break L3;
                    } else {
                      if (var9 == 0) {
                        var6 = jna.field_j[1];
                        break L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                  if (var8 == 2) {
                    var6 = jna.field_j[2];
                    break L1;
                  } else {
                    if (3 == var8) {
                      var6 = jna.field_j[3];
                      break L1;
                    } else {
                      if ((var8 ^ -1) != -5) {
                        break L1;
                      } else {
                        if (var9 == 0) {
                          var6 = jna.field_j[4];
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
              }
              var6 = jna.field_j[0];
              break L1;
            }
            if (var6 == null) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var8 = dfa.a(-this.field_h.g(-25787) + 4096 >> -1939587294, 2048, -111);
              gqa.a(var8, -83584144, param1, param2, (ka) (var6), param3);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackOut_20_0 = var6;
            stackOut_20_1 = new StringBuilder().append("ki.D(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = stackIn_22_0;
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L4;
            } else {
              stackOut_21_0 = stackIn_21_0;
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_o = 82;
        field_p = "Start Game";
    }
}
