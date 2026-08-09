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
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_63_2 = null;
        StringBuilder stackIn_65_1 = null;
        StringBuilder stackIn_66_1 = null;
        String stackIn_66_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if ((param2.field_E ^ -1) < -8) {
                var4_int = param0.b((byte) 44, 6);
                break L1;
              } else {
                var4_int = param0.b((byte) 44, 4);
                break L1;
              }
            }
            var5 = 37 / ((-67 - param1) / 45);
            var6 = var4_int;
            if (var6 == 0) {
              stackIn_26_0 = new wi(param2, param0, param3);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (var6 == 1) {
                stackIn_28_0 = new bg(param2, param0, param3);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if ((var6 ^ -1) == -3) {
                  stackIn_30_0 = new nj(param2, param0, param3);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (3 == var6) {
                    stackIn_32_0 = new bha(param2, param0, param3);
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (4 == var6) {
                      stackIn_34_0 = new ws(param2, param0, param3);
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      if (5 == var6) {
                        stackIn_36_0 = new ro(param2, param0, param3);
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        if (var6 == 6) {
                          stackIn_38_0 = new spa(param2, param0, param3);
                          decompiledRegionSelector0 = 6;
                          break L0;
                        } else {
                          if (var6 == 7) {
                            stackIn_40_0 = new pt(param2, param0, param3);
                            decompiledRegionSelector0 = 7;
                            break L0;
                          } else {
                            if ((var6 ^ -1) != -9) {
                              if (-10 == (var6 ^ -1)) {
                                stackIn_44_0 = new uha(param2, param0, param3);
                                decompiledRegionSelector0 = 9;
                                break L0;
                              } else {
                                if (10 == var6) {
                                  stackIn_46_0 = new sa(param2, param0, param3);
                                  decompiledRegionSelector0 = 10;
                                  break L0;
                                } else {
                                  if (11 != var6) {
                                    if (var6 == 12) {
                                      stackIn_50_0 = new rsa(param2, param0, param3);
                                      decompiledRegionSelector0 = 12;
                                      break L0;
                                    } else {
                                      if ((var6 ^ -1) == -14) {
                                        stackIn_52_0 = new oqa(param2, param0, param3);
                                        decompiledRegionSelector0 = 13;
                                        break L0;
                                      } else {
                                        if (-15 != (var6 ^ -1)) {
                                          if (15 == var6) {
                                            stackIn_56_0 = new lo(param2, param0, param3);
                                            decompiledRegionSelector0 = 15;
                                            break L0;
                                          } else {
                                            if (-17 == (var6 ^ -1)) {
                                              stackIn_58_0 = new ri(param2, param0, param3);
                                              decompiledRegionSelector0 = 16;
                                              break L0;
                                            } else {
                                              throw new IllegalStateException("Unrecognised locomotor type: " + var4_int);
                                            }
                                          }
                                        } else {
                                          stackIn_54_0 = new hia(param2, param0, param3);
                                          decompiledRegionSelector0 = 14;
                                          break L0;
                                        }
                                      }
                                    }
                                  } else {
                                    stackIn_48_0 = new ira(param2, param0, param3);
                                    decompiledRegionSelector0 = 11;
                                    break L0;
                                  }
                                }
                              }
                            } else {
                              stackIn_42_0 = new uqa(param2, param0, param3);
                              decompiledRegionSelector0 = 8;
                              break L0;
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
          L2: {
            var4 = decompiledCaughtException;
            stackIn_62_0 = (RuntimeException) (var4);

            stackIn_62_1 = new StringBuilder().append("ki.F(");

            if (param0 == null) {
              stackIn_63_0 = (RuntimeException) ((Object) stackIn_62_0);
              stackIn_63_1 = (StringBuilder) ((Object) stackIn_62_1);
              stackIn_63_2 = "null";
              break L2;
            } else {
              stackIn_63_0 = (RuntimeException) ((Object) stackIn_62_0);
              stackIn_63_1 = (StringBuilder) ((Object) stackIn_62_1);
              stackIn_63_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_65_1 = ((StringBuilder) (Object) stackIn_63_1).append(stackIn_63_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_63_0 = (RuntimeException) ((Object) stackIn_63_0);
              stackIn_66_1 = (StringBuilder) ((Object) stackIn_65_1);
              stackIn_66_2 = "null";
              break L3;
            } else {
              stackIn_63_0 = (RuntimeException) ((Object) stackIn_63_0);
              stackIn_66_1 = (StringBuilder) ((Object) stackIn_65_1);
              stackIn_66_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_63_0), stackIn_66_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (wda) ((Object) stackIn_26_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (wda) ((Object) stackIn_28_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (wda) ((Object) stackIn_30_0);
            } else {
              if (decompiledRegionSelector0 == 3) {
                return (wda) ((Object) stackIn_32_0);
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return (wda) ((Object) stackIn_34_0);
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return (wda) ((Object) stackIn_36_0);
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return (wda) ((Object) stackIn_38_0);
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return (wda) ((Object) stackIn_40_0);
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return (wda) ((Object) stackIn_42_0);
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return (wda) ((Object) stackIn_44_0);
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return (wda) ((Object) stackIn_46_0);
                            } else {
                              if (decompiledRegionSelector0 == 11) {
                                return (wda) ((Object) stackIn_48_0);
                              } else {
                                if (decompiledRegionSelector0 == 12) {
                                  return (wda) ((Object) stackIn_50_0);
                                } else {
                                  if (decompiledRegionSelector0 == 13) {
                                    return (wda) ((Object) stackIn_52_0);
                                  } else {
                                    if (decompiledRegionSelector0 == 14) {
                                      return (wda) ((Object) stackIn_54_0);
                                    } else {
                                      if (decompiledRegionSelector0 == 15) {
                                        return (wda) ((Object) stackIn_56_0);
                                      } else {
                                        return (wda) ((Object) stackIn_58_0);
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
        int var3 = 0;
        kb var4 = null;
        bb var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var4 = (kb) ((Object) nn.field_a.f(-80));
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
                var5 = (bb) ((Object) mg.field_b.f(-80));
                L3: while (true) {
                  if (var5 == null) {
                    break L0;
                  } else {
                    pc.a(param0, param1, var5);
                    var5 = (bb) ((Object) mg.field_b.e(122));
                    continue L3;
                  }
                }
              } else {
                mca.a(var4, 0, param1);
                var4 = (kb) ((Object) nn.field_a.e(111));
                continue L1;
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
        Object stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        Object stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var9 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var7 = 31 / ((param4 - -38) / 47);
              var6 = null;
              var8 = this.field_m;
              if (var8 == 0) {
                var6 = jna.field_j[0];
                break L1;
              } else {
                if (-2 != (var8 ^ -1)) {
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
                        var6 = jna.field_j[4];
                        break L1;
                      }
                    }
                  }
                } else {
                  var6 = jna.field_j[1];
                  break L1;
                }
              }
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
          L2: {
            var6 = decompiledCaughtException;
            stackIn_20_0 = var6;

            stackIn_20_1 = new StringBuilder().append("ki.D(");

            if (param0 == null) {
              stackIn_21_0 = stackIn_20_0;
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L2;
            } else {
              stackIn_21_0 = stackIn_20_0;
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
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
