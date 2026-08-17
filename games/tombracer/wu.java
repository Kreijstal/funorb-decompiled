/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wu implements mfa {
    static jta field_a;

    final static boolean a(int param0, int param1, int param2) {
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            if (param0 == -17) {
              L1: {
                if (0 == (2048 & param2)) {
                  stackIn_7_0 = 0;
                  break L1;
                } else {
                  stackIn_7_0 = 1;
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var3), "wu.E(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_7_0 != 0;
        }
    }

    public final dg a(la param0, kh param1, boolean param2) {
        ria stackIn_41_0 = null;
        ioa stackIn_43_0 = null;
        am stackIn_45_0 = null;
        gaa stackIn_47_0 = null;
        lfa stackIn_49_0 = null;
        boa stackIn_51_0 = null;
        fu stackIn_53_0 = null;
        cv stackIn_55_0 = null;
        kva stackIn_57_0 = null;
        dc stackIn_59_0 = null;
        kga stackIn_61_0 = null;
        oo stackIn_63_0 = null;
        ki stackIn_65_0 = null;
        lma stackIn_67_0 = null;
        nq stackIn_69_0 = null;
        ce stackIn_71_0 = null;
        aka stackIn_73_0 = null;
        vsa stackIn_75_0 = null;
        pqa stackIn_77_0 = null;
        ao stackIn_79_0 = null;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        RuntimeException stackIn_84_0 = null;
        StringBuilder stackIn_84_1 = null;
        String stackIn_84_2 = null;
        RuntimeException stackIn_87_0 = null;
        StringBuilder stackIn_87_1 = null;
        RuntimeException stackIn_88_0 = null;
        StringBuilder stackIn_88_1 = null;
        String stackIn_88_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = param1.b((byte) 44, 6);
              if (!param2) {
                break L1;
              } else {
                field_a = (jta) null;
                break L1;
              }
            }
            var5 = var4_int;
            if (1 == var5) {
              stackIn_41_0 = new ria(var4_int, param0, param1);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (3 == var5) {
                stackIn_43_0 = new ioa(var4_int, param0, param1);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (var5 != 4) {
                  if (5 != var5) {
                    if ((var5 ^ -1) != -7) {
                      if (var5 == 7) {
                        stackIn_51_0 = new boa(var4_int, param0, param1);
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        if ((var5 ^ -1) == -9) {
                          stackIn_53_0 = new fu(var4_int, param0, param1);
                          decompiledRegionSelector0 = 6;
                          break L0;
                        } else {
                          if (9 != var5) {
                            if (10 == var5) {
                              stackIn_57_0 = new kva(var4_int, param0, param1);
                              decompiledRegionSelector0 = 8;
                              break L0;
                            } else {
                              if (-12 != (var5 ^ -1)) {
                                if (var5 == 12) {
                                  stackIn_61_0 = new kga(var4_int, param0, param1);
                                  decompiledRegionSelector0 = 10;
                                  break L0;
                                } else {
                                  if (var5 == 13) {
                                    stackIn_63_0 = new oo(var4_int, param0, param1);
                                    decompiledRegionSelector0 = 11;
                                    break L0;
                                  } else {
                                    if ((var5 ^ -1) != -15) {
                                      if ((var5 ^ -1) == -16) {
                                        stackIn_67_0 = new lma(var4_int, param0, param1);
                                        decompiledRegionSelector0 = 13;
                                        break L0;
                                      } else {
                                        if (16 == var5) {
                                          stackIn_69_0 = new nq(var4_int, param0, param1);
                                          decompiledRegionSelector0 = 14;
                                          break L0;
                                        } else {
                                          if (17 != var5) {
                                            if (-19 != (var5 ^ -1)) {
                                              if (19 == var5) {
                                                stackIn_75_0 = new vsa(var4_int, param0, param1);
                                                decompiledRegionSelector0 = 17;
                                                break L0;
                                              } else {
                                                if (-21 == (var5 ^ -1)) {
                                                  stackIn_77_0 = new pqa(var4_int, param0, param1);
                                                  decompiledRegionSelector0 = 18;
                                                  break L0;
                                                } else {
                                                  stackIn_79_0 = new ao(var4_int, param0, param1);
                                                  decompiledRegionSelector0 = 19;
                                                  break L0;
                                                }
                                              }
                                            } else {
                                              stackIn_73_0 = new aka(var4_int, param0, param1);
                                              decompiledRegionSelector0 = 16;
                                              break L0;
                                            }
                                          } else {
                                            stackIn_71_0 = new ce(var4_int, param0, param1);
                                            decompiledRegionSelector0 = 15;
                                            break L0;
                                          }
                                        }
                                      }
                                    } else {
                                      stackIn_65_0 = new ki(var4_int, param0, param1);
                                      decompiledRegionSelector0 = 12;
                                      break L0;
                                    }
                                  }
                                }
                              } else {
                                stackIn_59_0 = new dc(var4_int, param0, param1);
                                decompiledRegionSelector0 = 9;
                                break L0;
                              }
                            }
                          } else {
                            stackIn_55_0 = new cv(var4_int, param0, param1);
                            decompiledRegionSelector0 = 7;
                            break L0;
                          }
                        }
                      }
                    } else {
                      stackIn_49_0 = new lfa(var4_int, param0, param1);
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  } else {
                    stackIn_47_0 = new gaa(var4_int, param0, param1);
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  stackIn_45_0 = new am(var4_int, param0, param1);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_83_0 = (RuntimeException) (var4);

            stackIn_83_1 = new StringBuilder().append("wu.A(");

            if (param0 == null) {
              stackIn_84_0 = (RuntimeException) ((Object) stackIn_83_0);
              stackIn_84_1 = (StringBuilder) ((Object) stackIn_83_1);
              stackIn_84_2 = "null";
              break L2;
            } else {
              stackIn_84_0 = (RuntimeException) ((Object) stackIn_83_0);
              stackIn_84_1 = (StringBuilder) ((Object) stackIn_83_1);
              stackIn_84_2 = "{...}";
              break L2;
            }
          }
          L3: {
            stackIn_87_0 = (RuntimeException) ((Object) stackIn_84_0);

            stackIn_87_1 = ((StringBuilder) (Object) stackIn_84_1).append(stackIn_84_2).append(',');

            if (param1 == null) {
              stackIn_88_0 = (RuntimeException) ((Object) stackIn_87_0);
              stackIn_88_1 = (StringBuilder) ((Object) stackIn_87_1);
              stackIn_88_2 = "null";
              break L3;
            } else {
              stackIn_88_0 = (RuntimeException) ((Object) stackIn_84_0);
              stackIn_88_1 = (StringBuilder) ((Object) stackIn_87_1);
              stackIn_88_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_88_0), stackIn_88_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (dg) ((Object) stackIn_41_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (dg) ((Object) stackIn_43_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (dg) ((Object) stackIn_45_0);
            } else {
              if (decompiledRegionSelector0 == 3) {
                return (dg) ((Object) stackIn_47_0);
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return (dg) ((Object) stackIn_49_0);
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return (dg) ((Object) stackIn_51_0);
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return (dg) ((Object) stackIn_53_0);
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return (dg) ((Object) stackIn_55_0);
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return (dg) ((Object) stackIn_57_0);
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return (dg) ((Object) stackIn_59_0);
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return (dg) ((Object) stackIn_61_0);
                            } else {
                              if (decompiledRegionSelector0 == 11) {
                                return (dg) ((Object) stackIn_63_0);
                              } else {
                                if (decompiledRegionSelector0 == 12) {
                                  return (dg) ((Object) stackIn_65_0);
                                } else {
                                  if (decompiledRegionSelector0 == 13) {
                                    return (dg) ((Object) stackIn_67_0);
                                  } else {
                                    if (decompiledRegionSelector0 == 14) {
                                      return (dg) ((Object) stackIn_69_0);
                                    } else {
                                      if (decompiledRegionSelector0 == 15) {
                                        return (dg) ((Object) stackIn_71_0);
                                      } else {
                                        if (decompiledRegionSelector0 == 16) {
                                          return (dg) ((Object) stackIn_73_0);
                                        } else {
                                          if (decompiledRegionSelector0 == 17) {
                                            return (dg) ((Object) stackIn_75_0);
                                          } else {
                                            if (decompiledRegionSelector0 == 18) {
                                              return (dg) ((Object) stackIn_77_0);
                                            } else {
                                              return (dg) ((Object) stackIn_79_0);
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
          }
        }
    }

    public final void a(int param0, kh param1, dg param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 15682) {
                break L1;
              } else {
                field_a = (jta) null;
                break L1;
              }
            }
            param1.a((byte) -128, param2.h((byte) 81), 6);
            param2.a((byte) 88, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (runtimeException);

            stackIn_7_1 = new StringBuilder().append("wu.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          L3: {
            stackIn_11_0 = (RuntimeException) ((Object) stackIn_8_0);

            stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param2 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
    }

    public final dg a(int param0, int param1) {
        ria stackIn_41_0 = null;
        ioa stackIn_43_0 = null;
        am stackIn_45_0 = null;
        gaa stackIn_47_0 = null;
        lfa stackIn_49_0 = null;
        boa stackIn_51_0 = null;
        fu stackIn_53_0 = null;
        cv stackIn_55_0 = null;
        kva stackIn_57_0 = null;
        dc stackIn_59_0 = null;
        kga stackIn_61_0 = null;
        oo stackIn_63_0 = null;
        ki stackIn_65_0 = null;
        lma stackIn_67_0 = null;
        nq stackIn_69_0 = null;
        ce stackIn_71_0 = null;
        aka stackIn_73_0 = null;
        vsa stackIn_75_0 = null;
        pqa stackIn_77_0 = null;
        ao stackIn_79_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        kh var5 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 >= 73) {
                break L1;
              } else {
                var5 = (kh) null;
                this.a((la) null, (kh) null, false);
                break L1;
              }
            }
            var3_int = param0;
            if (var3_int != 1) {
              if ((var3_int ^ -1) != -4) {
                if (-5 != (var3_int ^ -1)) {
                  if ((var3_int ^ -1) != -6) {
                    if ((var3_int ^ -1) != -7) {
                      if (var3_int == 7) {
                        stackIn_51_0 = new boa(param0);
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        if (var3_int == 8) {
                          stackIn_53_0 = new fu(param0);
                          decompiledRegionSelector0 = 6;
                          break L0;
                        } else {
                          if ((var3_int ^ -1) != -10) {
                            if (10 == var3_int) {
                              stackIn_57_0 = new kva(param0);
                              decompiledRegionSelector0 = 8;
                              break L0;
                            } else {
                              if (11 == var3_int) {
                                stackIn_59_0 = new dc(param0);
                                decompiledRegionSelector0 = 9;
                                break L0;
                              } else {
                                if (-13 != (var3_int ^ -1)) {
                                  if (-14 == (var3_int ^ -1)) {
                                    stackIn_63_0 = new oo(param0);
                                    decompiledRegionSelector0 = 11;
                                    break L0;
                                  } else {
                                    if (-15 == (var3_int ^ -1)) {
                                      stackIn_65_0 = new ki(param0);
                                      decompiledRegionSelector0 = 12;
                                      break L0;
                                    } else {
                                      if (var3_int == 15) {
                                        stackIn_67_0 = new lma(param0);
                                        decompiledRegionSelector0 = 13;
                                        break L0;
                                      } else {
                                        if ((var3_int ^ -1) == -17) {
                                          stackIn_69_0 = new nq(param0);
                                          decompiledRegionSelector0 = 14;
                                          break L0;
                                        } else {
                                          if ((var3_int ^ -1) != -18) {
                                            if (-19 == (var3_int ^ -1)) {
                                              stackIn_73_0 = new aka(param0);
                                              decompiledRegionSelector0 = 16;
                                              break L0;
                                            } else {
                                              if (var3_int == 19) {
                                                stackIn_75_0 = new vsa(param0);
                                                decompiledRegionSelector0 = 17;
                                                break L0;
                                              } else {
                                                if (var3_int != 20) {
                                                  stackIn_79_0 = new ao(param0);
                                                  decompiledRegionSelector0 = 19;
                                                  break L0;
                                                } else {
                                                  stackIn_77_0 = new pqa(param0);
                                                  decompiledRegionSelector0 = 18;
                                                  break L0;
                                                }
                                              }
                                            }
                                          } else {
                                            stackIn_71_0 = new ce(param0);
                                            decompiledRegionSelector0 = 15;
                                            break L0;
                                          }
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  stackIn_61_0 = new kga(param0);
                                  decompiledRegionSelector0 = 10;
                                  break L0;
                                }
                              }
                            }
                          } else {
                            stackIn_55_0 = new cv(param0);
                            decompiledRegionSelector0 = 7;
                            break L0;
                          }
                        }
                      }
                    } else {
                      stackIn_49_0 = new lfa(param0);
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  } else {
                    stackIn_47_0 = new gaa(param0);
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  stackIn_45_0 = new am(param0);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_43_0 = new ioa(param0);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_41_0 = new ria(param0);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var3), "wu.C(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (dg) ((Object) stackIn_41_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (dg) ((Object) stackIn_43_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (dg) ((Object) stackIn_45_0);
            } else {
              if (decompiledRegionSelector0 == 3) {
                return (dg) ((Object) stackIn_47_0);
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return (dg) ((Object) stackIn_49_0);
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return (dg) ((Object) stackIn_51_0);
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return (dg) ((Object) stackIn_53_0);
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return (dg) ((Object) stackIn_55_0);
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return (dg) ((Object) stackIn_57_0);
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return (dg) ((Object) stackIn_59_0);
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return (dg) ((Object) stackIn_61_0);
                            } else {
                              if (decompiledRegionSelector0 == 11) {
                                return (dg) ((Object) stackIn_63_0);
                              } else {
                                if (decompiledRegionSelector0 == 12) {
                                  return (dg) ((Object) stackIn_65_0);
                                } else {
                                  if (decompiledRegionSelector0 == 13) {
                                    return (dg) ((Object) stackIn_67_0);
                                  } else {
                                    if (decompiledRegionSelector0 == 14) {
                                      return (dg) ((Object) stackIn_69_0);
                                    } else {
                                      if (decompiledRegionSelector0 == 15) {
                                        return (dg) ((Object) stackIn_71_0);
                                      } else {
                                        if (decompiledRegionSelector0 == 16) {
                                          return (dg) ((Object) stackIn_73_0);
                                        } else {
                                          if (decompiledRegionSelector0 == 17) {
                                            return (dg) ((Object) stackIn_75_0);
                                          } else {
                                            if (decompiledRegionSelector0 == 18) {
                                              return (dg) ((Object) stackIn_77_0);
                                            } else {
                                              return (dg) ((Object) stackIn_79_0);
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
          }
        }
    }

    public static void a(byte param0) {
        try {
            if (param0 != 91) {
                field_a = (jta) null;
            }
            field_a = null;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "wu.D(" + param0 + ')');
        }
    }

    public wu() {
        int var1_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          L0: {
            bb.field_g = new String[21];
            var1_int = 0;
            L1: while (true) {
              if (-22 >= (var1_int ^ -1)) {
                bb.field_g[8] = "Hazard";
                bb.field_g[9] = "Switch";
                bb.field_g[19] = "Bridge";
                bb.field_g[13] = "SnakePit";
                bb.field_g[18] = "Monster";
                bb.field_g[0] = "OLD directrender";
                bb.field_g[17] = "Platform";
                bb.field_g[15] = "Wall";
                bb.field_g[3] = "OLD switch";
                bb.field_g[6] = "Doorway";
                bb.field_g[14] = "Plant";
                bb.field_g[12] = "Item";
                bb.field_g[4] = "Furniture";
                bb.field_g[5] = "Light Source";
                bb.field_g[16] = "Trap Base";
                bb.field_g[1] = "TEMP model test";
                bb.field_g[7] = "Block";
                bb.field_g[10] = "Pit";
                bb.field_g[11] = "Crusher";
                bb.field_g[20] = "Gas Vent";
                break L0;
              } else {
                bb.field_g[var1_int] = "(unused, placeholder)";
                var1_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var1), "wu.<init>()");
        }
    }

    public final dg a(gr param0, gma param1, int param2) {
        dg stackIn_31_0 = null;
        dg stackIn_33_0 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        dg var5 = null;
        int var6 = 0;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = 0;
              if (!(param1 instanceof db)) {
                if (!(param1 instanceof fsa)) {
                  break L1;
                } else {
                  if (param0 instanceof sea) {
                    var4_int = 13;
                    break L1;
                  } else {
                    if (param0 instanceof mo) {
                      var4_int = 10;
                      break L1;
                    } else {
                      if (param0 instanceof rea) {
                        var4_int = 11;
                        break L1;
                      } else {
                        if (!(param0 instanceof pd)) {
                          if (!(param0 instanceof mra)) {
                            L2: {
                              if (!(param0 instanceof eq)) {
                                break L2;
                              } else {
                                if (!((fsa) ((Object) param1)).d(true)) {
                                  break L2;
                                } else {
                                  var4_int = 16;
                                  break L1;
                                }
                              }
                            }
                            L3: {
                              if (param0 instanceof rh) {
                                break L3;
                              } else {
                                if (param0 instanceof dja) {
                                  break L3;
                                } else {
                                  L4: {
                                    if (!(param0 instanceof ut)) {
                                      break L4;
                                    } else {
                                      if (param0 instanceof kj) {
                                        break L4;
                                      } else {
                                        if (!(param0 instanceof wh)) {
                                          var4_int = 3;
                                          break L1;
                                        } else {
                                          break L4;
                                        }
                                      }
                                    }
                                  }
                                  L5: {
                                    if (param0 instanceof lpa) {
                                      break L5;
                                    } else {
                                      if (param0 instanceof im) {
                                        break L5;
                                      } else {
                                        var4_int = 0;
                                        break L1;
                                      }
                                    }
                                  }
                                  var4_int = 17;
                                  break L1;
                                }
                              }
                            }
                            var4_int = 9;
                            break L1;
                          } else {
                            var4_int = 7;
                            break L1;
                          }
                        } else {
                          var4_int = 12;
                          break L1;
                        }
                      }
                    }
                  }
                }
              } else {
                var4_int = 15;
                break L1;
              }
            }
            if (param2 < -87) {
              var5 = this.a(var4_int, 118);
              var5.a(param1, -2159, param0);
              stackIn_33_0 = (dg) (var5);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_31_0 = (dg) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackIn_37_0 = (RuntimeException) (var4);

            stackIn_37_1 = new StringBuilder().append("wu.F(");

            if (param0 == null) {
              stackIn_38_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "null";
              break L6;
            } else {
              stackIn_38_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "{...}";
              break L6;
            }
          }
          L7: {
            stackIn_41_0 = (RuntimeException) ((Object) stackIn_38_0);

            stackIn_41_1 = ((StringBuilder) (Object) stackIn_38_1).append(stackIn_38_2).append(',');

            if (param1 == null) {
              stackIn_42_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackIn_42_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackIn_42_2 = "null";
              break L7;
            } else {
              stackIn_42_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackIn_42_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackIn_42_2 = "{...}";
              break L7;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_42_0), stackIn_42_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_31_0;
        } else {
          return stackIn_33_0;
        }
    }

    static {
    }
}
