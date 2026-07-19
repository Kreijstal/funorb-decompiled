/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bda extends ci {
    static int field_m;

    final int[] c(int param0, int param1) {
        nv discarded$2 = null;
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        kh var7 = null;
        int[] var8 = null;
        L0: {
          L1: {
            var6 = TombRacer.field_G ? 1 : 0;
            var8 = this.field_i.a((byte) 66, param1);
            var3 = var8;
            if (this.field_i.field_d) {
              var4 = sj.field_b[param1];
              var5 = 0;
              L2: while (true) {
                if (var5 >= ns.field_g) {
                  break L1;
                } else {
                  var8[var5] = this.d(param0 + 1876, ht.field_Fb[var5], var4) % 4096;
                  var5++;
                  if (var6 != 0) {
                    break L0;
                  } else {
                    if (var6 == 0) {
                      continue L2;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            } else {
              break L1;
            }
          }
          if (param0 == 1) {
            break L0;
          } else {
            var7 = (kh) null;
            discarded$2 = bda.a(true, (byte) 12, (la) null, (kh) null);
            break L0;
          }
        }
        return var8;
    }

    final static nv a(boolean param0, byte param1, la param2, kh param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6_int = 0;
        eq var6 = null;
        int var7 = 0;
        fra stackIn_66_0 = null;
        hi stackIn_68_0 = null;
        rea stackIn_70_0 = null;
        ana stackIn_72_0 = null;
        ov stackIn_74_0 = null;
        eia stackIn_76_0 = null;
        rl stackIn_78_0 = null;
        ef stackIn_80_0 = null;
        ok stackIn_82_0 = null;
        rb stackIn_84_0 = null;
        mo stackIn_86_0 = null;
        lpa stackIn_88_0 = null;
        sg stackIn_91_0 = null;
        eq stackIn_93_0 = null;
        dja stackIn_95_0 = null;
        vd stackIn_97_0 = null;
        eq stackIn_99_0 = null;
        wn stackIn_101_0 = null;
        sea stackIn_103_0 = null;
        wma stackIn_105_0 = null;
        rh stackIn_107_0 = null;
        ska stackIn_109_0 = null;
        tl stackIn_111_0 = null;
        kj stackIn_113_0 = null;
        oh stackIn_115_0 = null;
        cu stackIn_117_0 = null;
        ue stackIn_119_0 = null;
        th stackIn_121_0 = null;
        bn stackIn_123_0 = null;
        im stackIn_125_0 = null;
        mc stackIn_127_0 = null;
        wh stackIn_129_0 = null;
        ula stackIn_131_0 = null;
        sm stackIn_133_0 = null;
        RuntimeException stackIn_136_0 = null;
        StringBuilder stackIn_136_1 = null;
        RuntimeException stackIn_137_0 = null;
        StringBuilder stackIn_137_1 = null;
        RuntimeException stackIn_138_0 = null;
        StringBuilder stackIn_138_1 = null;
        String stackIn_138_2 = null;
        RuntimeException stackIn_139_0 = null;
        StringBuilder stackIn_139_1 = null;
        RuntimeException stackIn_140_0 = null;
        StringBuilder stackIn_140_1 = null;
        RuntimeException stackIn_141_0 = null;
        StringBuilder stackIn_141_1 = null;
        String stackIn_141_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        fra stackOut_65_0 = null;
        hi stackOut_67_0 = null;
        rea stackOut_69_0 = null;
        ana stackOut_71_0 = null;
        ov stackOut_73_0 = null;
        eia stackOut_75_0 = null;
        rl stackOut_77_0 = null;
        ef stackOut_79_0 = null;
        ok stackOut_81_0 = null;
        rb stackOut_83_0 = null;
        mo stackOut_85_0 = null;
        lpa stackOut_87_0 = null;
        eq stackOut_92_0 = null;
        sg stackOut_90_0 = null;
        dja stackOut_94_0 = null;
        vd stackOut_96_0 = null;
        eq stackOut_98_0 = null;
        wn stackOut_100_0 = null;
        sea stackOut_102_0 = null;
        wma stackOut_104_0 = null;
        rh stackOut_106_0 = null;
        ska stackOut_108_0 = null;
        tl stackOut_110_0 = null;
        kj stackOut_112_0 = null;
        oh stackOut_114_0 = null;
        cu stackOut_116_0 = null;
        ue stackOut_118_0 = null;
        th stackOut_120_0 = null;
        bn stackOut_122_0 = null;
        im stackOut_124_0 = null;
        mc stackOut_126_0 = null;
        wh stackOut_128_0 = null;
        ula stackOut_130_0 = null;
        sm stackOut_132_0 = null;
        RuntimeException stackOut_135_0 = null;
        StringBuilder stackOut_135_1 = null;
        RuntimeException stackOut_137_0 = null;
        StringBuilder stackOut_137_1 = null;
        String stackOut_137_2 = null;
        RuntimeException stackOut_136_0 = null;
        StringBuilder stackOut_136_1 = null;
        String stackOut_136_2 = null;
        RuntimeException stackOut_138_0 = null;
        StringBuilder stackOut_138_1 = null;
        RuntimeException stackOut_140_0 = null;
        StringBuilder stackOut_140_1 = null;
        String stackOut_140_2 = null;
        RuntimeException stackOut_139_0 = null;
        StringBuilder stackOut_139_1 = null;
        String stackOut_139_2 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var4_int = param3.b((byte) 44, 6);
            var5 = 81 / ((-38 - param1) / 57);
            var6_int = var4_int;
            if (var6_int == 0) {
              stackOut_65_0 = new fra(param2, param3, param0);
              stackIn_66_0 = stackOut_65_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (-2 == (var6_int ^ -1)) {
                stackOut_67_0 = new hi(param2, param3, param0);
                stackIn_68_0 = stackOut_67_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (var6_int == 2) {
                  stackOut_69_0 = new rea(param2, param3, param0);
                  stackIn_70_0 = stackOut_69_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L1: {
                    if (var6_int != 3) {
                      break L1;
                    } else {
                      if (var7 == 0) {
                        stackOut_71_0 = new ana(param2, param3, param0);
                        stackIn_72_0 = stackOut_71_0;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        break L1;
                      }
                    }
                  }
                  L2: {
                    if (-5 != (var6_int ^ -1)) {
                      break L2;
                    } else {
                      if (var7 == 0) {
                        stackOut_73_0 = new ov(param2, param3, param0);
                        stackIn_74_0 = stackOut_73_0;
                        decompiledRegionSelector0 = 4;
                        break L0;
                      } else {
                        break L2;
                      }
                    }
                  }
                  L3: {
                    if (-19 != (var6_int ^ -1)) {
                      break L3;
                    } else {
                      if (var7 == 0) {
                        stackOut_75_0 = new eia(param2, param3, param0);
                        stackIn_76_0 = stackOut_75_0;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        break L3;
                      }
                    }
                  }
                  if (var6_int == 7) {
                    stackOut_77_0 = new rl(param2, param3, param0);
                    stackIn_78_0 = stackOut_77_0;
                    decompiledRegionSelector0 = 6;
                    break L0;
                  } else {
                    if ((var6_int ^ -1) == -6) {
                      stackOut_79_0 = new ef(param2, param3, param0);
                      stackIn_80_0 = stackOut_79_0;
                      decompiledRegionSelector0 = 7;
                      break L0;
                    } else {
                      L4: {
                        if (-7 != (var6_int ^ -1)) {
                          break L4;
                        } else {
                          if (var7 == 0) {
                            stackOut_81_0 = new ok(param2, param3, param0);
                            stackIn_82_0 = stackOut_81_0;
                            decompiledRegionSelector0 = 8;
                            break L0;
                          } else {
                            break L4;
                          }
                        }
                      }
                      L5: {
                        if (var6_int != 13) {
                          break L5;
                        } else {
                          if (var7 == 0) {
                            stackOut_83_0 = new rb(param2, param3, param0);
                            stackIn_84_0 = stackOut_83_0;
                            decompiledRegionSelector0 = 9;
                            break L0;
                          } else {
                            break L5;
                          }
                        }
                      }
                      L6: {
                        if ((var6_int ^ -1) != -9) {
                          break L6;
                        } else {
                          if (var7 == 0) {
                            stackOut_85_0 = new mo(param2, param3, param0);
                            stackIn_86_0 = stackOut_85_0;
                            decompiledRegionSelector0 = 10;
                            break L0;
                          } else {
                            break L6;
                          }
                        }
                      }
                      if (-10 == (var6_int ^ -1)) {
                        stackOut_87_0 = new lpa(param2, param3, param0);
                        stackIn_88_0 = stackOut_87_0;
                        decompiledRegionSelector0 = 11;
                        break L0;
                      } else {
                        L7: {
                          if ((var6_int ^ -1) != -11) {
                            break L7;
                          } else {
                            if (var7 == 0) {
                              if (7 > param2.field_E) {
                                var6 = new eq(param2, param0);
                                stackOut_92_0 = (eq) (var6);
                                stackIn_93_0 = stackOut_92_0;
                                decompiledRegionSelector0 = 13;
                                break L0;
                              } else {
                                stackOut_90_0 = new sg(param2, param3, param0);
                                stackIn_91_0 = stackOut_90_0;
                                decompiledRegionSelector0 = 12;
                                break L0;
                              }
                            } else {
                              break L7;
                            }
                          }
                        }
                        if ((var6_int ^ -1) == -18) {
                          stackOut_94_0 = new dja(param2, param3, param0);
                          stackIn_95_0 = stackOut_94_0;
                          decompiledRegionSelector0 = 14;
                          break L0;
                        } else {
                          if (11 == var6_int) {
                            stackOut_96_0 = new vd(param2, param3, param0);
                            stackIn_97_0 = stackOut_96_0;
                            decompiledRegionSelector0 = 15;
                            break L0;
                          } else {
                            if (-13 == (var6_int ^ -1)) {
                              stackOut_98_0 = new eq(param2, param3, param0);
                              stackIn_99_0 = stackOut_98_0;
                              decompiledRegionSelector0 = 16;
                              break L0;
                            } else {
                              if ((var6_int ^ -1) == -15) {
                                stackOut_100_0 = new wn(param2, param3, param0);
                                stackIn_101_0 = stackOut_100_0;
                                decompiledRegionSelector0 = 17;
                                break L0;
                              } else {
                                L8: {
                                  if (var6_int != 15) {
                                    break L8;
                                  } else {
                                    if (var7 == 0) {
                                      stackOut_102_0 = new sea(param2, param3, param0);
                                      stackIn_103_0 = stackOut_102_0;
                                      decompiledRegionSelector0 = 18;
                                      break L0;
                                    } else {
                                      break L8;
                                    }
                                  }
                                }
                                if (var6_int == 16) {
                                  stackOut_104_0 = new wma(param2, param3, param0);
                                  stackIn_105_0 = stackOut_104_0;
                                  decompiledRegionSelector0 = 19;
                                  break L0;
                                } else {
                                  L9: {
                                    if (-20 != (var6_int ^ -1)) {
                                      break L9;
                                    } else {
                                      if (var7 == 0) {
                                        stackOut_106_0 = new rh(param2, param3, param0);
                                        stackIn_107_0 = stackOut_106_0;
                                        decompiledRegionSelector0 = 20;
                                        break L0;
                                      } else {
                                        break L9;
                                      }
                                    }
                                  }
                                  if ((var6_int ^ -1) == -21) {
                                    stackOut_108_0 = new ska(param2, param3, param0);
                                    stackIn_109_0 = stackOut_108_0;
                                    decompiledRegionSelector0 = 21;
                                    break L0;
                                  } else {
                                    L10: {
                                      if (21 != var6_int) {
                                        break L10;
                                      } else {
                                        if (var7 == 0) {
                                          stackOut_110_0 = new tl(param2, param3, param0);
                                          stackIn_111_0 = stackOut_110_0;
                                          decompiledRegionSelector0 = 22;
                                          break L0;
                                        } else {
                                          break L10;
                                        }
                                      }
                                    }
                                    if (var6_int == 22) {
                                      stackOut_112_0 = new kj(param2, param3, param0);
                                      stackIn_113_0 = stackOut_112_0;
                                      decompiledRegionSelector0 = 23;
                                      break L0;
                                    } else {
                                      if (23 == var6_int) {
                                        stackOut_114_0 = new oh(param2, param3, param0);
                                        stackIn_115_0 = stackOut_114_0;
                                        decompiledRegionSelector0 = 24;
                                        break L0;
                                      } else {
                                        L11: {
                                          if (var6_int != 24) {
                                            break L11;
                                          } else {
                                            if (var7 == 0) {
                                              stackOut_116_0 = new cu(param2, param3, param0);
                                              stackIn_117_0 = stackOut_116_0;
                                              decompiledRegionSelector0 = 25;
                                              break L0;
                                            } else {
                                              break L11;
                                            }
                                          }
                                        }
                                        L12: {
                                          if (-26 != (var6_int ^ -1)) {
                                            break L12;
                                          } else {
                                            if (var7 == 0) {
                                              stackOut_118_0 = new ue(param2, param3, param0);
                                              stackIn_119_0 = stackOut_118_0;
                                              decompiledRegionSelector0 = 26;
                                              break L0;
                                            } else {
                                              break L12;
                                            }
                                          }
                                        }
                                        L13: {
                                          if ((var6_int ^ -1) != -27) {
                                            break L13;
                                          } else {
                                            if (var7 == 0) {
                                              stackOut_120_0 = new th(param2, param3, param0);
                                              stackIn_121_0 = stackOut_120_0;
                                              decompiledRegionSelector0 = 27;
                                              break L0;
                                            } else {
                                              break L13;
                                            }
                                          }
                                        }
                                        if (27 == var6_int) {
                                          stackOut_122_0 = new bn(param2, param3, param0);
                                          stackIn_123_0 = stackOut_122_0;
                                          decompiledRegionSelector0 = 28;
                                          break L0;
                                        } else {
                                          if (-29 == (var6_int ^ -1)) {
                                            stackOut_124_0 = new im(param2, param3, param0);
                                            stackIn_125_0 = stackOut_124_0;
                                            decompiledRegionSelector0 = 29;
                                            break L0;
                                          } else {
                                            L14: {
                                              if (-30 != (var6_int ^ -1)) {
                                                break L14;
                                              } else {
                                                if (var7 == 0) {
                                                  stackOut_126_0 = new mc(param2, param3, param0);
                                                  stackIn_127_0 = stackOut_126_0;
                                                  decompiledRegionSelector0 = 30;
                                                  break L0;
                                                } else {
                                                  break L14;
                                                }
                                              }
                                            }
                                            if ((var6_int ^ -1) == -31) {
                                              stackOut_128_0 = new wh(param2, param3, param0);
                                              stackIn_129_0 = stackOut_128_0;
                                              decompiledRegionSelector0 = 31;
                                              break L0;
                                            } else {
                                              L15: {
                                                if ((var6_int ^ -1) != -32) {
                                                  break L15;
                                                } else {
                                                  if (var7 == 0) {
                                                    stackOut_130_0 = new ula(param2, param3, param0);
                                                    stackIn_131_0 = stackOut_130_0;
                                                    decompiledRegionSelector0 = 32;
                                                    break L0;
                                                  } else {
                                                    break L15;
                                                  }
                                                }
                                              }
                                              if (32 == var6_int) {
                                                stackOut_132_0 = new sm(param2, param3, param0);
                                                stackIn_133_0 = stackOut_132_0;
                                                decompiledRegionSelector0 = 33;
                                                break L0;
                                              } else {
                                                throw new IllegalStateException("Unrecognised behaviour type: " + var4_int);
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
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var4 = decompiledCaughtException;
            stackOut_135_0 = (RuntimeException) (var4);
            stackOut_135_1 = new StringBuilder().append("bda.B(").append(param0).append(',').append(param1).append(',');
            stackIn_137_0 = stackOut_135_0;
            stackIn_137_1 = stackOut_135_1;
            stackIn_136_0 = stackOut_135_0;
            stackIn_136_1 = stackOut_135_1;
            if (param2 == null) {
              stackOut_137_0 = (RuntimeException) ((Object) stackIn_137_0);
              stackOut_137_1 = (StringBuilder) ((Object) stackIn_137_1);
              stackOut_137_2 = "null";
              stackIn_138_0 = stackOut_137_0;
              stackIn_138_1 = stackOut_137_1;
              stackIn_138_2 = stackOut_137_2;
              break L16;
            } else {
              stackOut_136_0 = (RuntimeException) ((Object) stackIn_136_0);
              stackOut_136_1 = (StringBuilder) ((Object) stackIn_136_1);
              stackOut_136_2 = "{...}";
              stackIn_138_0 = stackOut_136_0;
              stackIn_138_1 = stackOut_136_1;
              stackIn_138_2 = stackOut_136_2;
              break L16;
            }
          }
          L17: {
            stackOut_138_0 = (RuntimeException) ((Object) stackIn_138_0);
            stackOut_138_1 = ((StringBuilder) (Object) stackIn_138_1).append(stackIn_138_2).append(',');
            stackIn_140_0 = stackOut_138_0;
            stackIn_140_1 = stackOut_138_1;
            stackIn_139_0 = stackOut_138_0;
            stackIn_139_1 = stackOut_138_1;
            if (param3 == null) {
              stackOut_140_0 = (RuntimeException) ((Object) stackIn_140_0);
              stackOut_140_1 = (StringBuilder) ((Object) stackIn_140_1);
              stackOut_140_2 = "null";
              stackIn_141_0 = stackOut_140_0;
              stackIn_141_1 = stackOut_140_1;
              stackIn_141_2 = stackOut_140_2;
              break L17;
            } else {
              stackOut_139_0 = (RuntimeException) ((Object) stackIn_139_0);
              stackOut_139_1 = (StringBuilder) ((Object) stackIn_139_1);
              stackOut_139_2 = "{...}";
              stackIn_141_0 = stackOut_139_0;
              stackIn_141_1 = stackOut_139_1;
              stackIn_141_2 = stackOut_139_2;
              break L17;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_141_0), stackIn_141_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (nv) ((Object) stackIn_66_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (nv) ((Object) stackIn_68_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (nv) ((Object) stackIn_70_0);
            } else {
              if (decompiledRegionSelector0 == 3) {
                return (nv) ((Object) stackIn_72_0);
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return (nv) ((Object) stackIn_74_0);
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return (nv) ((Object) stackIn_76_0);
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return (nv) ((Object) stackIn_78_0);
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return (nv) ((Object) stackIn_80_0);
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return (nv) ((Object) stackIn_82_0);
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return (nv) ((Object) stackIn_84_0);
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return (nv) ((Object) stackIn_86_0);
                            } else {
                              if (decompiledRegionSelector0 == 11) {
                                return (nv) ((Object) stackIn_88_0);
                              } else {
                                if (decompiledRegionSelector0 == 12) {
                                  return (nv) ((Object) stackIn_91_0);
                                } else {
                                  if (decompiledRegionSelector0 == 13) {
                                    return (nv) ((Object) stackIn_93_0);
                                  } else {
                                    if (decompiledRegionSelector0 == 14) {
                                      return (nv) ((Object) stackIn_95_0);
                                    } else {
                                      if (decompiledRegionSelector0 == 15) {
                                        return (nv) ((Object) stackIn_97_0);
                                      } else {
                                        if (decompiledRegionSelector0 == 16) {
                                          return (nv) ((Object) stackIn_99_0);
                                        } else {
                                          if (decompiledRegionSelector0 == 17) {
                                            return (nv) ((Object) stackIn_101_0);
                                          } else {
                                            if (decompiledRegionSelector0 == 18) {
                                              return (nv) ((Object) stackIn_103_0);
                                            } else {
                                              if (decompiledRegionSelector0 == 19) {
                                                return (nv) ((Object) stackIn_105_0);
                                              } else {
                                                if (decompiledRegionSelector0 == 20) {
                                                  return (nv) ((Object) stackIn_107_0);
                                                } else {
                                                  if (decompiledRegionSelector0 == 21) {
                                                    return (nv) ((Object) stackIn_109_0);
                                                  } else {
                                                    if (decompiledRegionSelector0 == 22) {
                                                      return (nv) ((Object) stackIn_111_0);
                                                    } else {
                                                      if (decompiledRegionSelector0 == 23) {
                                                        return (nv) ((Object) stackIn_113_0);
                                                      } else {
                                                        if (decompiledRegionSelector0 == 24) {
                                                          return (nv) ((Object) stackIn_115_0);
                                                        } else {
                                                          if (decompiledRegionSelector0 == 25) {
                                                            return (nv) ((Object) stackIn_117_0);
                                                          } else {
                                                            if (decompiledRegionSelector0 == 26) {
                                                              return (nv) ((Object) stackIn_119_0);
                                                            } else {
                                                              if (decompiledRegionSelector0 == 27) {
                                                                return (nv) ((Object) stackIn_121_0);
                                                              } else {
                                                                if (decompiledRegionSelector0 == 28) {
                                                                  return (nv) ((Object) stackIn_123_0);
                                                                } else {
                                                                  if (decompiledRegionSelector0 == 29) {
                                                                    return (nv) ((Object) stackIn_125_0);
                                                                  } else {
                                                                    if (decompiledRegionSelector0 == 30) {
                                                                      return (nv) ((Object) stackIn_127_0);
                                                                    } else {
                                                                      if (decompiledRegionSelector0 == 31) {
                                                                        return (nv) ((Object) stackIn_129_0);
                                                                      } else {
                                                                        if (decompiledRegionSelector0 == 32) {
                                                                          return (nv) ((Object) stackIn_131_0);
                                                                        } else {
                                                                          return (nv) ((Object) stackIn_133_0);
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
