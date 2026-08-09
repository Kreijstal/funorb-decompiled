/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bda extends ci {
    static int field_m;

    final int[] c(int param0, int param1) {
        int var4 = 0;
        int var5 = 0;
        int var6 = TombRacer.field_G ? 1 : 0;
        int[] var8 = this.field_i.a((byte) 66, param1);
        int[] var3 = var8;
        if (!(!this.field_i.field_d)) {
            var4 = sj.field_b[param1];
            for (var5 = 0; var5 < ns.field_g; var5++) {
                var8[var5] = this.d(param0 + 1876, ht.field_Fb[var5], var4) % 4096;
            }
        }
        if (param0 != 1) {
            kh var7 = (kh) null;
            bda.a(true, (byte) 12, (la) null, (kh) null);
        }
        return var3;
    }

    final static nv a(boolean param0, byte param1, la param2, kh param3) {
        fra stackIn_51_0 = null;
        hi stackIn_53_0 = null;
        rea stackIn_55_0 = null;
        ana stackIn_57_0 = null;
        ov stackIn_59_0 = null;
        eia stackIn_61_0 = null;
        rl stackIn_63_0 = null;
        ef stackIn_65_0 = null;
        ok stackIn_67_0 = null;
        rb stackIn_69_0 = null;
        mo stackIn_71_0 = null;
        lpa stackIn_73_0 = null;
        sg stackIn_76_0 = null;
        eq stackIn_78_0 = null;
        dja stackIn_80_0 = null;
        vd stackIn_82_0 = null;
        eq stackIn_84_0 = null;
        wn stackIn_86_0 = null;
        sea stackIn_88_0 = null;
        wma stackIn_90_0 = null;
        rh stackIn_92_0 = null;
        ska stackIn_94_0 = null;
        tl stackIn_96_0 = null;
        kj stackIn_98_0 = null;
        oh stackIn_100_0 = null;
        cu stackIn_102_0 = null;
        ue stackIn_104_0 = null;
        th stackIn_106_0 = null;
        bn stackIn_108_0 = null;
        im stackIn_110_0 = null;
        mc stackIn_112_0 = null;
        wh stackIn_114_0 = null;
        ula stackIn_116_0 = null;
        sm stackIn_118_0 = null;
        RuntimeException stackIn_122_0 = null;
        StringBuilder stackIn_122_1 = null;
        RuntimeException stackIn_123_0 = null;
        StringBuilder stackIn_123_1 = null;
        String stackIn_123_2 = null;
        StringBuilder stackIn_125_1 = null;
        StringBuilder stackIn_126_1 = null;
        String stackIn_126_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6_int = 0;
        eq var6 = null;
        int var7 = 0;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var4_int = param3.b((byte) 44, 6);
            var5 = 81 / ((-38 - param1) / 57);
            var6_int = var4_int;
            if (var6_int == 0) {
              stackIn_51_0 = new fra(param2, param3, param0);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (-2 == (var6_int ^ -1)) {
                stackIn_53_0 = new hi(param2, param3, param0);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (var6_int == 2) {
                  stackIn_55_0 = new rea(param2, param3, param0);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (var6_int != 3) {
                    if (-5 != (var6_int ^ -1)) {
                      if (-19 != (var6_int ^ -1)) {
                        if (var6_int == 7) {
                          stackIn_63_0 = new rl(param2, param3, param0);
                          decompiledRegionSelector0 = 6;
                          break L0;
                        } else {
                          if ((var6_int ^ -1) == -6) {
                            stackIn_65_0 = new ef(param2, param3, param0);
                            decompiledRegionSelector0 = 7;
                            break L0;
                          } else {
                            if (-7 != (var6_int ^ -1)) {
                              if (var6_int != 13) {
                                if ((var6_int ^ -1) != -9) {
                                  if (-10 == (var6_int ^ -1)) {
                                    stackIn_73_0 = new lpa(param2, param3, param0);
                                    decompiledRegionSelector0 = 11;
                                    break L0;
                                  } else {
                                    if ((var6_int ^ -1) != -11) {
                                      if ((var6_int ^ -1) == -18) {
                                        stackIn_80_0 = new dja(param2, param3, param0);
                                        decompiledRegionSelector0 = 14;
                                        break L0;
                                      } else {
                                        if (11 == var6_int) {
                                          stackIn_82_0 = new vd(param2, param3, param0);
                                          decompiledRegionSelector0 = 15;
                                          break L0;
                                        } else {
                                          if (-13 == (var6_int ^ -1)) {
                                            stackIn_84_0 = new eq(param2, param3, param0);
                                            decompiledRegionSelector0 = 16;
                                            break L0;
                                          } else {
                                            if ((var6_int ^ -1) == -15) {
                                              stackIn_86_0 = new wn(param2, param3, param0);
                                              decompiledRegionSelector0 = 17;
                                              break L0;
                                            } else {
                                              if (var6_int != 15) {
                                                if (var6_int == 16) {
                                                  stackIn_90_0 = new wma(param2, param3, param0);
                                                  decompiledRegionSelector0 = 19;
                                                  break L0;
                                                } else {
                                                  if (-20 != (var6_int ^ -1)) {
                                                    if ((var6_int ^ -1) == -21) {
                                                      stackIn_94_0 = new ska(param2, param3, param0);
                                                      decompiledRegionSelector0 = 21;
                                                      break L0;
                                                    } else {
                                                      if (21 != var6_int) {
                                                        if (var6_int == 22) {
                                                          stackIn_98_0 = new kj(param2, param3, param0);
                                                          decompiledRegionSelector0 = 23;
                                                          break L0;
                                                        } else {
                                                          if (23 == var6_int) {
                                                            stackIn_100_0 = new oh(param2, param3, param0);
                                                            decompiledRegionSelector0 = 24;
                                                            break L0;
                                                          } else {
                                                            if (var6_int != 24) {
                                                              if (-26 != (var6_int ^ -1)) {
                                                                if ((var6_int ^ -1) != -27) {
                                                                  if (27 == var6_int) {
                                                                    stackIn_108_0 = new bn(param2, param3, param0);
                                                                    decompiledRegionSelector0 = 28;
                                                                    break L0;
                                                                  } else {
                                                                    if (-29 == (var6_int ^ -1)) {
                                                                      stackIn_110_0 = new im(param2, param3, param0);
                                                                      decompiledRegionSelector0 = 29;
                                                                      break L0;
                                                                    } else {
                                                                      if (-30 != (var6_int ^ -1)) {
                                                                        if ((var6_int ^ -1) == -31) {
                                                                          stackIn_114_0 = new wh(param2, param3, param0);
                                                                          decompiledRegionSelector0 = 31;
                                                                          break L0;
                                                                        } else {
                                                                          if ((var6_int ^ -1) != -32) {
                                                                            if (32 == var6_int) {
                                                                              stackIn_118_0 = new sm(param2, param3, param0);
                                                                              decompiledRegionSelector0 = 33;
                                                                              break L0;
                                                                            } else {
                                                                              throw new IllegalStateException("Unrecognised behaviour type: " + var4_int);
                                                                            }
                                                                          } else {
                                                                            stackIn_116_0 = new ula(param2, param3, param0);
                                                                            decompiledRegionSelector0 = 32;
                                                                            break L0;
                                                                          }
                                                                        }
                                                                      } else {
                                                                        stackIn_112_0 = new mc(param2, param3, param0);
                                                                        decompiledRegionSelector0 = 30;
                                                                        break L0;
                                                                      }
                                                                    }
                                                                  }
                                                                } else {
                                                                  stackIn_106_0 = new th(param2, param3, param0);
                                                                  decompiledRegionSelector0 = 27;
                                                                  break L0;
                                                                }
                                                              } else {
                                                                stackIn_104_0 = new ue(param2, param3, param0);
                                                                decompiledRegionSelector0 = 26;
                                                                break L0;
                                                              }
                                                            } else {
                                                              stackIn_102_0 = new cu(param2, param3, param0);
                                                              decompiledRegionSelector0 = 25;
                                                              break L0;
                                                            }
                                                          }
                                                        }
                                                      } else {
                                                        stackIn_96_0 = new tl(param2, param3, param0);
                                                        decompiledRegionSelector0 = 22;
                                                        break L0;
                                                      }
                                                    }
                                                  } else {
                                                    stackIn_92_0 = new rh(param2, param3, param0);
                                                    decompiledRegionSelector0 = 20;
                                                    break L0;
                                                  }
                                                }
                                              } else {
                                                stackIn_88_0 = new sea(param2, param3, param0);
                                                decompiledRegionSelector0 = 18;
                                                break L0;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      if (7 > param2.field_E) {
                                        var6 = new eq(param2, param0);
                                        stackIn_78_0 = (eq) (var6);
                                        decompiledRegionSelector0 = 13;
                                        break L0;
                                      } else {
                                        stackIn_76_0 = new sg(param2, param3, param0);
                                        decompiledRegionSelector0 = 12;
                                        break L0;
                                      }
                                    }
                                  }
                                } else {
                                  stackIn_71_0 = new mo(param2, param3, param0);
                                  decompiledRegionSelector0 = 10;
                                  break L0;
                                }
                              } else {
                                stackIn_69_0 = new rb(param2, param3, param0);
                                decompiledRegionSelector0 = 9;
                                break L0;
                              }
                            } else {
                              stackIn_67_0 = new ok(param2, param3, param0);
                              decompiledRegionSelector0 = 8;
                              break L0;
                            }
                          }
                        }
                      } else {
                        stackIn_61_0 = new eia(param2, param3, param0);
                        decompiledRegionSelector0 = 5;
                        break L0;
                      }
                    } else {
                      stackIn_59_0 = new ov(param2, param3, param0);
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  } else {
                    stackIn_57_0 = new ana(param2, param3, param0);
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_122_0 = (RuntimeException) (var4);

            stackIn_122_1 = new StringBuilder().append("bda.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_123_0 = (RuntimeException) ((Object) stackIn_122_0);
              stackIn_123_1 = (StringBuilder) ((Object) stackIn_122_1);
              stackIn_123_2 = "null";
              break L1;
            } else {
              stackIn_123_0 = (RuntimeException) ((Object) stackIn_122_0);
              stackIn_123_1 = (StringBuilder) ((Object) stackIn_122_1);
              stackIn_123_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_125_1 = ((StringBuilder) (Object) stackIn_123_1).append(stackIn_123_2).append(',');

            if (param3 == null) {
              stackIn_123_0 = (RuntimeException) ((Object) stackIn_123_0);
              stackIn_126_1 = (StringBuilder) ((Object) stackIn_125_1);
              stackIn_126_2 = "null";
              break L2;
            } else {
              stackIn_123_0 = (RuntimeException) ((Object) stackIn_123_0);
              stackIn_126_1 = (StringBuilder) ((Object) stackIn_125_1);
              stackIn_126_2 = "{...}";
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_123_0), stackIn_126_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (nv) ((Object) stackIn_51_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (nv) ((Object) stackIn_53_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (nv) ((Object) stackIn_55_0);
            } else {
              if (decompiledRegionSelector0 == 3) {
                return (nv) ((Object) stackIn_57_0);
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return (nv) ((Object) stackIn_59_0);
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return (nv) ((Object) stackIn_61_0);
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return (nv) ((Object) stackIn_63_0);
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return (nv) ((Object) stackIn_65_0);
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return (nv) ((Object) stackIn_67_0);
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return (nv) ((Object) stackIn_69_0);
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return (nv) ((Object) stackIn_71_0);
                            } else {
                              if (decompiledRegionSelector0 == 11) {
                                return (nv) ((Object) stackIn_73_0);
                              } else {
                                if (decompiledRegionSelector0 == 12) {
                                  return (nv) ((Object) stackIn_76_0);
                                } else {
                                  if (decompiledRegionSelector0 == 13) {
                                    return (nv) ((Object) stackIn_78_0);
                                  } else {
                                    if (decompiledRegionSelector0 == 14) {
                                      return (nv) ((Object) stackIn_80_0);
                                    } else {
                                      if (decompiledRegionSelector0 == 15) {
                                        return (nv) ((Object) stackIn_82_0);
                                      } else {
                                        if (decompiledRegionSelector0 == 16) {
                                          return (nv) ((Object) stackIn_84_0);
                                        } else {
                                          if (decompiledRegionSelector0 == 17) {
                                            return (nv) ((Object) stackIn_86_0);
                                          } else {
                                            if (decompiledRegionSelector0 == 18) {
                                              return (nv) ((Object) stackIn_88_0);
                                            } else {
                                              if (decompiledRegionSelector0 == 19) {
                                                return (nv) ((Object) stackIn_90_0);
                                              } else {
                                                if (decompiledRegionSelector0 == 20) {
                                                  return (nv) ((Object) stackIn_92_0);
                                                } else {
                                                  if (decompiledRegionSelector0 == 21) {
                                                    return (nv) ((Object) stackIn_94_0);
                                                  } else {
                                                    if (decompiledRegionSelector0 == 22) {
                                                      return (nv) ((Object) stackIn_96_0);
                                                    } else {
                                                      if (decompiledRegionSelector0 == 23) {
                                                        return (nv) ((Object) stackIn_98_0);
                                                      } else {
                                                        if (decompiledRegionSelector0 == 24) {
                                                          return (nv) ((Object) stackIn_100_0);
                                                        } else {
                                                          if (decompiledRegionSelector0 == 25) {
                                                            return (nv) ((Object) stackIn_102_0);
                                                          } else {
                                                            if (decompiledRegionSelector0 == 26) {
                                                              return (nv) ((Object) stackIn_104_0);
                                                            } else {
                                                              if (decompiledRegionSelector0 == 27) {
                                                                return (nv) ((Object) stackIn_106_0);
                                                              } else {
                                                                if (decompiledRegionSelector0 == 28) {
                                                                  return (nv) ((Object) stackIn_108_0);
                                                                } else {
                                                                  if (decompiledRegionSelector0 == 29) {
                                                                    return (nv) ((Object) stackIn_110_0);
                                                                  } else {
                                                                    if (decompiledRegionSelector0 == 30) {
                                                                      return (nv) ((Object) stackIn_112_0);
                                                                    } else {
                                                                      if (decompiledRegionSelector0 == 31) {
                                                                        return (nv) ((Object) stackIn_114_0);
                                                                      } else {
                                                                        if (decompiledRegionSelector0 == 32) {
                                                                          return (nv) ((Object) stackIn_116_0);
                                                                        } else {
                                                                          return (nv) ((Object) stackIn_118_0);
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

    public bda() {
        super(0, true);
    }

    private final int d(int param0, int param1, int param2) {
        if (param0 != 1877) {
            field_m = -3;
        }
        int var4 = param1 + param2 * 57;
        var4 = var4 << 871012385 ^ var4;
        return 4096 - (2147483647 & 1376312589 + (var4 * (var4 * 15731) + 789221) * var4) / 262144;
    }

    static {
        field_m = 50;
    }
}
