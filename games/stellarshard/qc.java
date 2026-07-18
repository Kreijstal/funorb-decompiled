/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class qc {
    static boolean field_b;
    static boolean field_a;
    private pb[] field_c;

    final static int a(byte param0, boolean param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_9_0 = 0;
        int stackIn_120_0 = 0;
        int stackIn_125_0 = 0;
        int stackIn_134_0 = 0;
        int stackIn_139_0 = 0;
        int stackIn_142_0 = 0;
        int stackIn_143_0 = 0;
        int stackIn_145_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_124_0 = 0;
        int stackOut_119_0 = 0;
        int stackOut_133_0 = 0;
        int stackOut_138_0 = 0;
        int stackOut_141_0 = 0;
        int stackOut_142_0 = 0;
        int stackOut_144_0 = 0;
        var5 = stellarshard.field_B;
        try {
          L0: {
            sl.field_b = sl.field_b + 65536;
            L1: while (true) {
              L2: {
                L3: {
                  if (65536 > wi.a(sl.field_b, (byte) 98, cj.field_d)) {
                    break L3;
                  } else {
                    gj.field_v = gj.field_v + 1;
                    sl.field_b = sl.field_b - cj.field_d;
                    if (var5 != 0) {
                      break L2;
                    } else {
                      if (var5 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (param0 <= -110) {
                  break L2;
                } else {
                  stackOut_8_0 = -72;
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                }
              }
              L4: {
                L5: {
                  var2_int = -1;
                  if (null != ed.field_a) {
                    break L5;
                  } else {
                    if (null != dl.field_C) {
                      var2_int = dl.field_C.length;
                      if (var5 == 0) {
                        break L4;
                      } else {
                        break L5;
                      }
                    } else {
                      break L4;
                    }
                  }
                }
                var2_int = ed.field_a.length;
                break L4;
              }
              L6: {
                if (var2_int == -1) {
                  break L6;
                } else {
                  L7: {
                    if (ha.field_w < cj.field_a) {
                      L8: {
                        ha.field_w = ha.field_w + 1;
                        if (cj.field_c >= ha.field_w) {
                          break L8;
                        } else {
                          L9: {
                            if (ed.field_a == null) {
                              break L9;
                            } else {
                              if (null != ed.field_a[nk.field_c]) {
                                break L8;
                              } else {
                                break L9;
                              }
                            }
                          }
                          ha.field_w = ha.field_w - 1;
                          if (var5 == 0) {
                            break L7;
                          } else {
                            break L8;
                          }
                        }
                      }
                      if (~ha.field_w > ~cj.field_a) {
                        break L7;
                      } else {
                        if (ed.field_a[(1 + nk.field_c) % var2_int] == null) {
                          ha.field_w = ha.field_w - 1;
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                    } else {
                      break L7;
                    }
                  }
                  L10: {
                    if (cj.field_a <= ha.field_w) {
                      L11: {
                        L12: {
                          tc.field_w = nk.field_c;
                          if (nj.field_g) {
                            break L12;
                          } else {
                            nk.field_c = nk.field_c - 1;
                            if (nk.field_c < 0) {
                              nk.field_c = nk.field_c + var2_int;
                              if (var5 == 0) {
                                break L11;
                              } else {
                                break L12;
                              }
                            } else {
                              break L11;
                            }
                          }
                        }
                        nk.field_c = nk.field_c + 1;
                        if (~var2_int < ~nk.field_c) {
                          break L11;
                        } else {
                          nk.field_c = nk.field_c - var2_int;
                          break L11;
                        }
                      }
                      ha.field_w = ha.field_w - cj.field_a;
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  if (ha.field_w <= cj.field_c) {
                    break L6;
                  } else {
                    nj.field_g = true;
                    break L6;
                  }
                }
              }
              L13: {
                if (ea.field_l != null) {
                  L14: {
                    var3 = -(ea.field_l.field_x / 2) + 357;
                    var4 = 0;
                    if (0 == gh.field_c) {
                      break L14;
                    } else {
                      if (var3 >= oc.field_e) {
                        break L14;
                      } else {
                        if (~oc.field_e <= ~(ea.field_l.field_y + var3)) {
                          break L14;
                        } else {
                          L15: {
                            if (~(-ea.field_l.field_v + 269) <= ~di.field_b) {
                              break L15;
                            } else {
                              if (269 <= di.field_b) {
                                break L15;
                              } else {
                                nj.field_g = false;
                                var4 = 1;
                                ha.field_w = cj.field_a;
                                break L15;
                              }
                            }
                          }
                          if (di.field_b <= 586) {
                            break L14;
                          } else {
                            if (~di.field_b > ~(ea.field_l.field_v + 586)) {
                              var4 = 1;
                              ha.field_w = cj.field_a;
                              nj.field_g = true;
                              break L14;
                            } else {
                              break L14;
                            }
                          }
                        }
                      }
                    }
                  }
                  if (var4 != 0) {
                    break L13;
                  } else {
                    if (~ha.field_w >= ~cj.field_c) {
                      break L13;
                    } else {
                      if (eb.field_a <= var3) {
                        break L13;
                      } else {
                        if (~(ea.field_l.field_y + var3) < ~eb.field_a) {
                          L16: {
                            if (~ni.field_e >= ~(269 - ea.field_l.field_v)) {
                              break L16;
                            } else {
                              if (ni.field_e < 269) {
                                ha.field_w = cj.field_c;
                                break L16;
                              } else {
                                break L16;
                              }
                            }
                          }
                          if (ni.field_e <= 586) {
                            break L13;
                          } else {
                            if (586 - -ea.field_l.field_v > ni.field_e) {
                              ha.field_w = cj.field_c;
                              break L13;
                            } else {
                              break L13;
                            }
                          }
                        } else {
                          break L13;
                        }
                      }
                    }
                  }
                } else {
                  break L13;
                }
              }
              L17: {
                L18: {
                  if (param1) {
                    L19: {
                      cd.field_L.a(af.a(1, ni.field_e, eb.field_a), af.a(1, di.field_b, oc.field_e), -1);
                      if (!cd.field_L.c(-18)) {
                        break L19;
                      } else {
                        if (0 != cd.field_L.field_f) {
                          if (cd.field_L.field_f == 1) {
                            stackOut_124_0 = 2;
                            stackIn_125_0 = stackOut_124_0;
                            return stackIn_125_0;
                          } else {
                            break L19;
                          }
                        } else {
                          stackOut_119_0 = 3;
                          stackIn_120_0 = stackOut_119_0;
                          return stackIn_120_0;
                        }
                      }
                    }
                    L20: while (true) {
                      if (!qh.c(107)) {
                        break L18;
                      } else {
                        L21: {
                          cd.field_L.a(0, 84);
                          if (!cd.field_L.c(-10)) {
                            break L21;
                          } else {
                            if (cd.field_L.field_f == 0) {
                              stackOut_133_0 = 3;
                              stackIn_134_0 = stackOut_133_0;
                              return stackIn_134_0;
                            } else {
                              if (cd.field_L.field_f == 1) {
                                stackOut_138_0 = 1;
                                stackIn_139_0 = stackOut_138_0;
                                return stackIn_139_0;
                              } else {
                                break L21;
                              }
                            }
                          }
                        }
                        if (gi.field_f != 13) {
                          continue L20;
                        } else {
                          stackOut_141_0 = 1;
                          stackIn_142_0 = stackOut_141_0;
                          stackOut_142_0 = stackIn_142_0;
                          stackIn_145_0 = stackOut_142_0;
                          stackIn_143_0 = stackOut_142_0;
                          if (var5 != 0) {
                            break L17;
                          } else {
                            return stackIn_143_0;
                          }
                        }
                      }
                    }
                  } else {
                    break L18;
                  }
                }
                stackOut_144_0 = 0;
                stackIn_145_0 = stackOut_144_0;
                break L17;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var2, "qc.C(" + param0 + ',' + param1 + ')');
        }
        return stackIn_145_0;
    }

    final static void a(int param0, boolean param1, int param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        String[] var4_ref_String__ = null;
        int var5 = 0;
        String var6_ref_String = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        boolean stackIn_72_0 = false;
        int stackIn_80_0 = 0;
        boolean stackIn_86_0 = false;
        int stackIn_95_0 = 0;
        int stackIn_102_0 = 0;
        int stackIn_106_0 = 0;
        String[] stackIn_116_0 = null;
        int stackIn_116_1 = 0;
        int stackIn_116_2 = 0;
        String[] stackIn_117_0 = null;
        int stackIn_117_1 = 0;
        String[] stackIn_119_0 = null;
        int stackIn_119_1 = 0;
        String[] stackIn_121_0 = null;
        int stackIn_121_1 = 0;
        String[] stackIn_122_0 = null;
        int stackIn_122_1 = 0;
        String stackIn_122_2 = null;
        String[] stackIn_124_0 = null;
        int stackIn_124_1 = 0;
        int stackIn_124_2 = 0;
        String[] stackIn_127_0 = null;
        String[] stackIn_128_0 = null;
        int stackIn_128_1 = 0;
        String[] stackIn_130_0 = null;
        int stackIn_130_1 = 0;
        String[] stackIn_132_0 = null;
        int stackIn_132_1 = 0;
        String[] stackIn_133_0 = null;
        int stackIn_133_1 = 0;
        String stackIn_133_2 = null;
        int stackIn_168_0 = 0;
        String[] stackIn_168_1 = null;
        int stackIn_169_0 = 0;
        String stackIn_169_1 = null;
        int stackIn_171_0 = 0;
        String stackIn_171_1 = null;
        int stackIn_173_0 = 0;
        String stackIn_173_1 = null;
        int stackIn_174_0 = 0;
        String stackIn_174_1 = null;
        int stackIn_174_2 = 0;
        int stackIn_181_0 = 0;
        int stackIn_181_1 = 0;
        int stackIn_189_0 = 0;
        int stackIn_189_1 = 0;
        int stackIn_191_0 = 0;
        int stackIn_191_1 = 0;
        int stackIn_198_0 = 0;
        int stackIn_198_1 = 0;
        int stackIn_200_0 = 0;
        String[] stackIn_200_1 = null;
        int stackIn_202_0 = 0;
        int stackIn_202_1 = 0;
        int stackIn_204_0 = 0;
        int stackIn_204_1 = 0;
        int stackIn_205_0 = 0;
        int stackIn_207_0 = 0;
        int stackIn_209_0 = 0;
        int stackIn_210_0 = 0;
        int stackIn_210_1 = 0;
        int stackIn_212_0 = 0;
        int stackIn_212_1 = 0;
        String[] stackIn_213_0 = null;
        int stackIn_216_0 = 0;
        int stackIn_216_1 = 0;
        int stackIn_223_0 = 0;
        int stackIn_223_1 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_71_0 = false;
        int stackOut_79_0 = 0;
        boolean stackOut_85_0 = false;
        int stackOut_94_0 = 0;
        int stackOut_101_0 = 0;
        int stackOut_99_0 = 0;
        int stackOut_105_0 = 0;
        int stackOut_103_0 = 0;
        String[] stackOut_115_0 = null;
        int stackOut_115_1 = 0;
        int stackOut_115_2 = 0;
        String[] stackOut_116_0 = null;
        int stackOut_116_1 = 0;
        String[] stackOut_121_0 = null;
        int stackOut_121_1 = 0;
        String stackOut_121_2 = null;
        String[] stackOut_117_0 = null;
        int stackOut_117_1 = 0;
        String[] stackOut_119_0 = null;
        int stackOut_119_1 = 0;
        String stackOut_119_2 = null;
        String[] stackOut_123_0 = null;
        int stackOut_123_1 = 0;
        int stackOut_123_2 = 0;
        String[] stackOut_126_0 = null;
        String[] stackOut_127_0 = null;
        int stackOut_127_1 = 0;
        String[] stackOut_132_0 = null;
        int stackOut_132_1 = 0;
        String stackOut_132_2 = null;
        String[] stackOut_128_0 = null;
        int stackOut_128_1 = 0;
        String[] stackOut_130_0 = null;
        int stackOut_130_1 = 0;
        String stackOut_130_2 = null;
        int stackOut_167_0 = 0;
        String[] stackOut_167_1 = null;
        int stackOut_201_0 = 0;
        int stackOut_201_1 = 0;
        int stackOut_202_0 = 0;
        int stackOut_202_1 = 0;
        int stackOut_204_0 = 0;
        int stackOut_209_0 = 0;
        int stackOut_209_1 = 0;
        int stackOut_205_0 = 0;
        int stackOut_207_0 = 0;
        int stackOut_207_1 = 0;
        int stackOut_199_0 = 0;
        String[] stackOut_199_1 = null;
        int stackOut_168_0 = 0;
        String stackOut_168_1 = null;
        int stackOut_173_0 = 0;
        String stackOut_173_1 = null;
        int stackOut_173_2 = 0;
        int stackOut_169_0 = 0;
        String stackOut_169_1 = null;
        int stackOut_171_0 = 0;
        String stackOut_171_1 = null;
        int stackOut_171_2 = 0;
        int stackOut_180_0 = 0;
        int stackOut_180_1 = 0;
        int stackOut_190_0 = 0;
        int stackOut_190_1 = 0;
        int stackOut_188_0 = 0;
        int stackOut_188_1 = 0;
        int stackOut_197_0 = 0;
        int stackOut_197_1 = 0;
        int stackOut_211_0 = 0;
        int stackOut_211_1 = 0;
        String[] stackOut_212_0 = null;
        int stackOut_215_0 = 0;
        int stackOut_215_1 = 0;
        int stackOut_222_0 = 0;
        int stackOut_222_1 = 0;
        var9 = stellarshard.field_B;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  qh.field_g = true;
                  rb.field_s = param0;
                  if (rb.field_s == 0) {
                    break L3;
                  } else {
                    L4: {
                      if (rb.field_s == 1) {
                        break L4;
                      } else {
                        if (rb.field_s == 2) {
                          var3_int = nj.a(gg.field_d, pe.field_c, hc.field_m, (byte) -128, h.a(le.field_q, 0, new String[1]));
                          var4 = -1;
                          var5 = 0;
                          L5: while (true) {
                            L6: {
                              L7: {
                                if (var5 >= var3_int) {
                                  break L7;
                                } else {
                                  stackOut_71_0 = "<%0>".equals((Object) (Object) hc.field_m[var5]);
                                  stackIn_80_0 = stackOut_71_0 ? 1 : 0;
                                  stackIn_72_0 = stackOut_71_0;
                                  if (var9 != 0) {
                                    break L6;
                                  } else {
                                    L8: {
                                      if (!stackIn_72_0) {
                                        break L8;
                                      } else {
                                        var4 = var5;
                                        if (var9 == 0) {
                                          break L7;
                                        } else {
                                          break L8;
                                        }
                                      }
                                    }
                                    var5++;
                                    if (var9 == 0) {
                                      continue L5;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                              }
                              stackOut_79_0 = ~var4;
                              stackIn_80_0 = stackOut_79_0;
                              break L6;
                            }
                            if (stackIn_80_0 != 0) {
                              pd.field_g = new String[var4];
                              ri.a((Object[]) (Object) hc.field_m, 0, (Object[]) (Object) pd.field_g, 0, var4);
                              fb.field_e = new String[-var4 + (var3_int + -1)];
                              ri.a((Object[]) (Object) hc.field_m, var4 - -1, (Object[]) (Object) fb.field_e, 0, var3_int + (-var4 + -1));
                              var3_int = nj.a(gg.field_d, pe.field_c, hc.field_m, (byte) -128, h.a(dl.field_K, 0, new String[1]));
                              var4 = -1;
                              var5 = 0;
                              L9: while (true) {
                                L10: {
                                  L11: {
                                    if (~var3_int >= ~var5) {
                                      break L11;
                                    } else {
                                      stackOut_85_0 = "<%0>".equals((Object) (Object) hc.field_m[var5]);
                                      stackIn_95_0 = stackOut_85_0 ? 1 : 0;
                                      stackIn_86_0 = stackOut_85_0;
                                      if (var9 != 0) {
                                        break L10;
                                      } else {
                                        L12: {
                                          if (stackIn_86_0) {
                                            var4 = var5;
                                            if (var9 == 0) {
                                              break L11;
                                            } else {
                                              break L12;
                                            }
                                          } else {
                                            break L12;
                                          }
                                        }
                                        var5++;
                                        if (var9 == 0) {
                                          continue L9;
                                        } else {
                                          break L11;
                                        }
                                      }
                                    }
                                  }
                                  stackOut_94_0 = 0;
                                  stackIn_95_0 = stackOut_94_0;
                                  break L10;
                                }
                                if (stackIn_95_0 != ~var4) {
                                  L13: {
                                    bb.field_k = new String[var4];
                                    ri.a((Object[]) (Object) hc.field_m, 0, (Object[]) (Object) bb.field_k, 0, var4);
                                    o.field_g = new String[-var4 + (var3_int + -1)];
                                    ri.a((Object[]) (Object) hc.field_m, 1 + var4, (Object[]) (Object) o.field_g, 0, -var4 + (var3_int + -1));
                                    if (pd.field_g.length < bb.field_k.length) {
                                      stackOut_101_0 = bb.field_k.length;
                                      stackIn_102_0 = stackOut_101_0;
                                      break L13;
                                    } else {
                                      stackOut_99_0 = pd.field_g.length;
                                      stackIn_102_0 = stackOut_99_0;
                                      break L13;
                                    }
                                  }
                                  L14: {
                                    var5 = stackIn_102_0;
                                    if (o.field_g.length <= fb.field_e.length) {
                                      stackOut_105_0 = fb.field_e.length;
                                      stackIn_106_0 = stackOut_105_0;
                                      break L14;
                                    } else {
                                      stackOut_103_0 = o.field_g.length;
                                      stackIn_106_0 = stackOut_103_0;
                                      break L14;
                                    }
                                  }
                                  var6 = stackIn_106_0;
                                  var7 = var5 + 7 + var6;
                                  sj.field_J = new int[var7];
                                  stellarshard.field_L = new String[var7];
                                  var8 = 0;
                                  L15: while (true) {
                                    L16: {
                                      L17: {
                                        if (~var7 >= ~var8) {
                                          break L17;
                                        } else {
                                          sj.field_J[var8] = -1;
                                          var8++;
                                          if (var9 != 0) {
                                            break L16;
                                          } else {
                                            if (var9 == 0) {
                                              continue L15;
                                            } else {
                                              break L17;
                                            }
                                          }
                                        }
                                      }
                                      sj.field_J[1] = 0;
                                      stellarshard.field_L[1] = am.field_b;
                                      pk.field_j = new int[2];
                                      stellarshard.field_L[0] = oa.field_B;
                                      pk.field_j[0] = 5;
                                      pk.field_j[1] = 2;
                                      sj.field_J[3] = 1;
                                      stellarshard.field_L[2] = vl.field_i;
                                      stellarshard.field_L[5] = "";
                                      stellarshard.field_L[4] = tk.field_a;
                                      stellarshard.field_L[3] = wf.field_c;
                                      break L16;
                                    }
                                    var8 = 0;
                                    L18: while (true) {
                                      L19: {
                                        L20: {
                                          if (~var5 >= ~var8) {
                                            break L20;
                                          } else {
                                            stackOut_115_0 = stellarshard.field_L;
                                            stackOut_115_1 = var8 + 6;
                                            stackOut_115_2 = -var5 + (bb.field_k.length + var8);
                                            stackIn_124_0 = stackOut_115_0;
                                            stackIn_124_1 = stackOut_115_1;
                                            stackIn_124_2 = stackOut_115_2;
                                            stackIn_116_0 = stackOut_115_0;
                                            stackIn_116_1 = stackOut_115_1;
                                            stackIn_116_2 = stackOut_115_2;
                                            if (var9 != 0) {
                                              break L19;
                                            } else {
                                              L21: {
                                                stackOut_116_0 = (String[]) (Object) stackIn_116_0;
                                                stackOut_116_1 = stackIn_116_1;
                                                stackIn_121_0 = stackOut_116_0;
                                                stackIn_121_1 = stackOut_116_1;
                                                stackIn_117_0 = stackOut_116_0;
                                                stackIn_117_1 = stackOut_116_1;
                                                if (stackIn_116_2 >= 0) {
                                                  stackOut_121_0 = (String[]) (Object) stackIn_121_0;
                                                  stackOut_121_1 = stackIn_121_1;
                                                  stackOut_121_2 = bb.field_k[-var5 + bb.field_k.length + var8];
                                                  stackIn_122_0 = stackOut_121_0;
                                                  stackIn_122_1 = stackOut_121_1;
                                                  stackIn_122_2 = stackOut_121_2;
                                                  break L21;
                                                } else {
                                                  stackOut_117_0 = (String[]) (Object) stackIn_117_0;
                                                  stackOut_117_1 = stackIn_117_1;
                                                  stackIn_119_0 = stackOut_117_0;
                                                  stackIn_119_1 = stackOut_117_1;
                                                  stackOut_119_0 = (String[]) (Object) stackIn_119_0;
                                                  stackOut_119_1 = stackIn_119_1;
                                                  stackOut_119_2 = "";
                                                  stackIn_122_0 = stackOut_119_0;
                                                  stackIn_122_1 = stackOut_119_1;
                                                  stackIn_122_2 = stackOut_119_2;
                                                  break L21;
                                                }
                                              }
                                              stackIn_122_0[stackIn_122_1] = stackIn_122_2;
                                              var8++;
                                              if (var9 == 0) {
                                                continue L18;
                                              } else {
                                                break L20;
                                              }
                                            }
                                          }
                                        }
                                        stackOut_123_0 = stellarshard.field_L;
                                        stackOut_123_1 = 6;
                                        stackOut_123_2 = -var5;
                                        stackIn_124_0 = stackOut_123_0;
                                        stackIn_124_1 = stackOut_123_1;
                                        stackIn_124_2 = stackOut_123_2;
                                        break L19;
                                      }
                                      stackIn_124_0[stackIn_124_1 - stackIn_124_2] = null;
                                      sj.field_J[6 + var5] = -2;
                                      var8 = 0;
                                      L22: while (true) {
                                        L23: {
                                          if (var6 <= var8) {
                                            break L23;
                                          } else {
                                            stackOut_126_0 = stellarshard.field_L;
                                            stackIn_213_0 = stackOut_126_0;
                                            stackIn_127_0 = stackOut_126_0;
                                            if (var9 != 0) {
                                              break L1;
                                            } else {
                                              L24: {
                                                stackOut_127_0 = (String[]) (Object) stackIn_127_0;
                                                stackOut_127_1 = var8 + (7 - -var5);
                                                stackIn_132_0 = stackOut_127_0;
                                                stackIn_132_1 = stackOut_127_1;
                                                stackIn_128_0 = stackOut_127_0;
                                                stackIn_128_1 = stackOut_127_1;
                                                if (~var8 <= ~o.field_g.length) {
                                                  stackOut_132_0 = (String[]) (Object) stackIn_132_0;
                                                  stackOut_132_1 = stackIn_132_1;
                                                  stackOut_132_2 = "";
                                                  stackIn_133_0 = stackOut_132_0;
                                                  stackIn_133_1 = stackOut_132_1;
                                                  stackIn_133_2 = stackOut_132_2;
                                                  break L24;
                                                } else {
                                                  stackOut_128_0 = (String[]) (Object) stackIn_128_0;
                                                  stackOut_128_1 = stackIn_128_1;
                                                  stackIn_130_0 = stackOut_128_0;
                                                  stackIn_130_1 = stackOut_128_1;
                                                  stackOut_130_0 = (String[]) (Object) stackIn_130_0;
                                                  stackOut_130_1 = stackIn_130_1;
                                                  stackOut_130_2 = o.field_g[var8];
                                                  stackIn_133_0 = stackOut_130_0;
                                                  stackIn_133_1 = stackOut_130_1;
                                                  stackIn_133_2 = stackOut_130_2;
                                                  break L24;
                                                }
                                              }
                                              stackIn_133_0[stackIn_133_1] = stackIn_133_2;
                                              var8++;
                                              if (var9 == 0) {
                                                continue L22;
                                              } else {
                                                break L23;
                                              }
                                            }
                                          }
                                        }
                                        jj.field_p = ih.a((byte) -98);
                                        if (var9 == 0) {
                                          break L2;
                                        } else {
                                          break L4;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  throw new IllegalStateException();
                                }
                              }
                            } else {
                              throw new IllegalStateException();
                            }
                          }
                        } else {
                          L25: {
                            if (rb.field_s != 3) {
                              break L25;
                            } else {
                              L26: {
                                L27: {
                                  if (ic.field_d.field_p) {
                                    break L27;
                                  } else {
                                    var3_int = nj.a(gg.field_d, pe.field_c, hc.field_m, (byte) -128, ld.field_D);
                                    if (var9 == 0) {
                                      break L26;
                                    } else {
                                      break L27;
                                    }
                                  }
                                }
                                var3_int = nj.a(gg.field_d, pe.field_c, hc.field_m, (byte) -128, ei.field_E);
                                break L26;
                              }
                              var4 = var3_int + 2;
                              stellarshard.field_L = new String[var4];
                              sj.field_J = new int[var4];
                              var5 = 0;
                              L28: while (true) {
                                L29: {
                                  L30: {
                                    if (var4 <= var5) {
                                      break L30;
                                    } else {
                                      sj.field_J[var5] = -1;
                                      var5++;
                                      if (var9 != 0) {
                                        break L29;
                                      } else {
                                        if (var9 == 0) {
                                          continue L28;
                                        } else {
                                          break L30;
                                        }
                                      }
                                    }
                                  }
                                  pk.field_j = new int[1];
                                  break L29;
                                }
                                var5 = 0;
                                L31: while (true) {
                                  L32: {
                                    L33: {
                                      if (~var5 <= ~var3_int) {
                                        break L33;
                                      } else {
                                        stellarshard.field_L[var5] = hc.field_m[var5];
                                        var5++;
                                        if (var9 != 0) {
                                          break L32;
                                        } else {
                                          if (var9 == 0) {
                                            continue L31;
                                          } else {
                                            break L33;
                                          }
                                        }
                                      }
                                    }
                                    stellarshard.field_L[var4 + -2] = "";
                                    stellarshard.field_L[-1 + var4] = td.field_a;
                                    sj.field_J[var4 + -1] = 0;
                                    pk.field_j[0] = 5;
                                    break L32;
                                  }
                                  if (var9 == 0) {
                                    break L2;
                                  } else {
                                    break L25;
                                  }
                                }
                              }
                            }
                          }
                          L34: {
                            if (rb.field_s != 4) {
                              break L34;
                            } else {
                              var3_int = nj.a(gg.field_d, pe.field_c, hc.field_m, (byte) -128, wh.field_d);
                              var4 = var3_int + 2;
                              sj.field_J = new int[var4];
                              stellarshard.field_L = new String[var4];
                              var5 = 0;
                              L35: while (true) {
                                L36: {
                                  L37: {
                                    if (var5 >= var4) {
                                      break L37;
                                    } else {
                                      sj.field_J[var5] = -1;
                                      var5++;
                                      if (var9 != 0) {
                                        break L36;
                                      } else {
                                        if (var9 == 0) {
                                          continue L35;
                                        } else {
                                          break L37;
                                        }
                                      }
                                    }
                                  }
                                  pk.field_j = new int[1];
                                  break L36;
                                }
                                var5 = 0;
                                L38: while (true) {
                                  L39: {
                                    L40: {
                                      if (~var3_int >= ~var5) {
                                        break L40;
                                      } else {
                                        stellarshard.field_L[var5] = hc.field_m[var5];
                                        var5++;
                                        if (var9 != 0) {
                                          break L39;
                                        } else {
                                          if (var9 == 0) {
                                            continue L38;
                                          } else {
                                            break L40;
                                          }
                                        }
                                      }
                                    }
                                    stellarshard.field_L[var4 - 2] = "";
                                    stellarshard.field_L[var4 + -1] = td.field_a;
                                    sj.field_J[-1 + var4] = 0;
                                    pk.field_j[0] = 5;
                                    break L39;
                                  }
                                  if (var9 == 0) {
                                    break L2;
                                  } else {
                                    break L34;
                                  }
                                }
                              }
                            }
                          }
                          L41: {
                            if (rb.field_s != 5) {
                              break L41;
                            } else {
                              var3_int = nj.a(gg.field_d, pe.field_c, hc.field_m, (byte) -128, df.field_k);
                              var4 = var3_int + 3;
                              stellarshard.field_L = new String[var4];
                              sj.field_J = new int[var4];
                              var5 = 0;
                              L42: while (true) {
                                L43: {
                                  L44: {
                                    if (~var5 <= ~var4) {
                                      break L44;
                                    } else {
                                      sj.field_J[var5] = -1;
                                      var5++;
                                      if (var9 != 0) {
                                        break L43;
                                      } else {
                                        if (var9 == 0) {
                                          continue L42;
                                        } else {
                                          break L44;
                                        }
                                      }
                                    }
                                  }
                                  pk.field_j = new int[2];
                                  break L43;
                                }
                                var5 = 0;
                                L45: while (true) {
                                  L46: {
                                    L47: {
                                      if (~var5 <= ~var3_int) {
                                        break L47;
                                      } else {
                                        stellarshard.field_L[var5] = hc.field_m[var5];
                                        var5++;
                                        if (var9 != 0) {
                                          break L46;
                                        } else {
                                          if (var9 == 0) {
                                            continue L45;
                                          } else {
                                            break L47;
                                          }
                                        }
                                      }
                                    }
                                    stellarshard.field_L[var4 + -3] = "";
                                    stellarshard.field_L[var4 + -2] = ha.field_v;
                                    sj.field_J[var4 - 2] = 0;
                                    pk.field_j[0] = 3;
                                    stellarshard.field_L[var4 + -1] = td.field_a;
                                    sj.field_J[-1 + var4] = 1;
                                    pk.field_j[1] = 5;
                                    break L46;
                                  }
                                  if (var9 == 0) {
                                    break L2;
                                  } else {
                                    break L41;
                                  }
                                }
                              }
                            }
                          }
                          throw new IllegalArgumentException();
                        }
                      }
                    }
                    var3_int = nj.a(gg.field_d, pe.field_c, hc.field_m, (byte) -128, ii.field_G);
                    var4 = 2 - -var3_int;
                    stellarshard.field_L = new String[var4];
                    sj.field_J = new int[var4];
                    var5 = 0;
                    L48: while (true) {
                      L49: {
                        L50: {
                          if (~var4 >= ~var5) {
                            break L50;
                          } else {
                            sj.field_J[var5] = -1;
                            var5++;
                            if (var9 != 0) {
                              break L49;
                            } else {
                              if (var9 == 0) {
                                continue L48;
                              } else {
                                break L50;
                              }
                            }
                          }
                        }
                        pk.field_j = new int[1];
                        break L49;
                      }
                      var5 = 0;
                      L51: while (true) {
                        L52: {
                          L53: {
                            if (~var5 <= ~var3_int) {
                              break L53;
                            } else {
                              stellarshard.field_L[var5] = hc.field_m[var5];
                              var5++;
                              if (var9 != 0) {
                                break L52;
                              } else {
                                if (var9 == 0) {
                                  continue L51;
                                } else {
                                  break L53;
                                }
                              }
                            }
                          }
                          stellarshard.field_L[-2 + var4] = "";
                          stellarshard.field_L[var4 - 1] = td.field_a;
                          sj.field_J[var4 + -1] = 0;
                          pk.field_j[0] = 5;
                          break L52;
                        }
                        if (var9 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                var3_int = nj.a(gg.field_d, pe.field_c, hc.field_m, (byte) -128, ii.field_G);
                var4 = 3 + var3_int;
                sj.field_J = new int[var4];
                stellarshard.field_L = new String[var4];
                var5 = 0;
                L54: while (true) {
                  L55: {
                    L56: {
                      if (~var5 <= ~var4) {
                        break L56;
                      } else {
                        sj.field_J[var5] = -1;
                        var5++;
                        if (var9 != 0) {
                          break L55;
                        } else {
                          if (var9 == 0) {
                            continue L54;
                          } else {
                            break L56;
                          }
                        }
                      }
                    }
                    pk.field_j = new int[2];
                    break L55;
                  }
                  var5 = 0;
                  L57: while (true) {
                    L58: {
                      L59: {
                        if (var5 >= var3_int) {
                          break L59;
                        } else {
                          stellarshard.field_L[var5] = hc.field_m[var5];
                          var5++;
                          if (var9 != 0) {
                            break L58;
                          } else {
                            if (var9 == 0) {
                              continue L57;
                            } else {
                              break L59;
                            }
                          }
                        }
                      }
                      stellarshard.field_L[-3 + var4] = "";
                      stellarshard.field_L[-2 + var4] = kk.field_l;
                      sj.field_J[-2 + var4] = 0;
                      pk.field_j[0] = 4;
                      stellarshard.field_L[-1 + var4] = td.field_a;
                      sj.field_J[var4 + -1] = 1;
                      break L58;
                    }
                    pk.field_j[1] = 5;
                    break L2;
                  }
                }
              }
              ua.field_i.field_i = pk.field_j.length;
              var3_int = 0;
              var4 = 0;
              L60: while (true) {
                L61: {
                  L62: {
                    L63: {
                      if (var4 >= stellarshard.field_L.length) {
                        break L63;
                      } else {
                        stackOut_167_0 = -39;
                        stackOut_167_1 = stellarshard.field_L;
                        stackIn_200_0 = stackOut_167_0;
                        stackIn_200_1 = stackOut_167_1;
                        stackIn_168_0 = stackOut_167_0;
                        stackIn_168_1 = stackOut_167_1;
                        if (var9 != 0) {
                          L64: while (true) {
                            if (stackIn_200_0 <= ~stackIn_200_1.length) {
                              break L62;
                            } else {
                              stackOut_201_0 = fl.field_a;
                              stackOut_201_1 = sj.field_J[var4];
                              stackIn_212_0 = stackOut_201_0;
                              stackIn_212_1 = stackOut_201_1;
                              stackIn_202_0 = stackOut_201_0;
                              stackIn_202_1 = stackOut_201_1;
                              if (var9 != 0) {
                                break L61;
                              } else {
                                stackOut_202_0 = stackIn_202_0;
                                stackOut_202_1 = stackIn_202_1;
                                stackIn_204_0 = stackOut_202_0;
                                stackIn_204_1 = stackOut_202_1;
                                L65: {
                                  stackOut_204_0 = stackIn_204_0;
                                  stackIn_209_0 = stackOut_204_0;
                                  stackIn_205_0 = stackOut_204_0;
                                  if (stackIn_204_1 >= 0) {
                                    stackOut_209_0 = stackIn_209_0;
                                    stackOut_209_1 = na.field_a;
                                    stackIn_210_0 = stackOut_209_0;
                                    stackIn_210_1 = stackOut_209_1;
                                    break L65;
                                  } else {
                                    stackOut_205_0 = stackIn_205_0;
                                    stackIn_207_0 = stackOut_205_0;
                                    stackOut_207_0 = stackIn_207_0;
                                    stackOut_207_1 = l.field_e;
                                    stackIn_210_0 = stackOut_207_0;
                                    stackIn_210_1 = stackOut_207_1;
                                    break L65;
                                  }
                                }
                                fl.field_a = stackIn_210_0 + stackIn_210_1;
                                var4++;
                                if (var9 == 0) {
                                  stackOut_199_0 = ~var4;
                                  stackOut_199_1 = stellarshard.field_L;
                                  stackIn_200_0 = stackOut_199_0;
                                  stackIn_200_1 = stackOut_199_1;
                                  continue L64;
                                } else {
                                  break L62;
                                }
                              }
                            }
                          }
                        } else {
                          L66: {
                            stackOut_168_0 = stackIn_168_0;
                            stackOut_168_1 = stackIn_168_1[var4];
                            stackIn_173_0 = stackOut_168_0;
                            stackIn_173_1 = stackOut_168_1;
                            stackIn_169_0 = stackOut_168_0;
                            stackIn_169_1 = stackOut_168_1;
                            if (sj.field_J[var4] < 0) {
                              stackOut_173_0 = stackIn_173_0;
                              stackOut_173_1 = (String) (Object) stackIn_173_1;
                              stackOut_173_2 = 0;
                              stackIn_174_0 = stackOut_173_0;
                              stackIn_174_1 = stackOut_173_1;
                              stackIn_174_2 = stackOut_173_2;
                              break L66;
                            } else {
                              stackOut_169_0 = stackIn_169_0;
                              stackOut_169_1 = (String) (Object) stackIn_169_1;
                              stackIn_171_0 = stackOut_169_0;
                              stackIn_171_1 = stackOut_169_1;
                              stackOut_171_0 = stackIn_171_0;
                              stackOut_171_1 = (String) (Object) stackIn_171_1;
                              stackOut_171_2 = 1;
                              stackIn_174_0 = stackOut_171_0;
                              stackIn_174_1 = stackOut_171_1;
                              stackIn_174_2 = stackOut_171_2;
                              break L66;
                            }
                          }
                          L67: {
                            var5 = qe.a((byte) stackIn_174_0, stackIn_174_1, stackIn_174_2 != 0);
                            if (var5 <= var3_int) {
                              break L67;
                            } else {
                              var3_int = var5;
                              break L67;
                            }
                          }
                          var4++;
                          if (var9 == 0) {
                            continue L60;
                          } else {
                            break L63;
                          }
                        }
                      }
                    }
                    L68: {
                      L69: {
                        if (2 != rb.field_s) {
                          break L69;
                        } else {
                          var4_ref_String__ = pd.field_g;
                          var5 = 0;
                          L70: while (true) {
                            L71: {
                              if (~var5 <= ~var4_ref_String__.length) {
                                break L71;
                              } else {
                                var6_ref_String = var4_ref_String__[var5];
                                var7 = qe.a((byte) -33, var6_ref_String, false);
                                stackOut_180_0 = var7;
                                stackOut_180_1 = var3_int;
                                stackIn_189_0 = stackOut_180_0;
                                stackIn_189_1 = stackOut_180_1;
                                stackIn_181_0 = stackOut_180_0;
                                stackIn_181_1 = stackOut_180_1;
                                if (var9 != 0) {
                                  L72: while (true) {
                                    if (stackIn_189_0 >= stackIn_189_1) {
                                      break L69;
                                    } else {
                                      var6_ref_String = var4_ref_String__[var5];
                                      var7 = qe.a((byte) -40, var6_ref_String, false);
                                      stackOut_190_0 = var7;
                                      stackOut_190_1 = var3_int;
                                      stackIn_198_0 = stackOut_190_0;
                                      stackIn_198_1 = stackOut_190_1;
                                      stackIn_191_0 = stackOut_190_0;
                                      stackIn_191_1 = stackOut_190_1;
                                      if (var9 != 0) {
                                        break L68;
                                      } else {
                                        L73: {
                                          if (stackIn_191_0 > stackIn_191_1) {
                                            var3_int = var7;
                                            break L73;
                                          } else {
                                            break L73;
                                          }
                                        }
                                        var5++;
                                        if (var9 == 0) {
                                          stackOut_188_0 = var5;
                                          stackOut_188_1 = var4_ref_String__.length;
                                          stackIn_189_0 = stackOut_188_0;
                                          stackIn_189_1 = stackOut_188_1;
                                          continue L72;
                                        } else {
                                          break L69;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  L74: {
                                    if (stackIn_181_0 > stackIn_181_1) {
                                      var3_int = var7;
                                      break L74;
                                    } else {
                                      break L74;
                                    }
                                  }
                                  var5++;
                                  if (var9 == 0) {
                                    continue L70;
                                  } else {
                                    break L71;
                                  }
                                }
                              }
                            }
                            var4_ref_String__ = fb.field_e;
                            var5 = 0;
                            L75: while (true) {
                              stackOut_188_0 = var5;
                              stackOut_188_1 = var4_ref_String__.length;
                              stackIn_189_0 = stackOut_188_0;
                              stackIn_189_1 = stackOut_188_1;
                              if (stackIn_189_0 >= stackIn_189_1) {
                                break L69;
                              } else {
                                var6_ref_String = var4_ref_String__[var5];
                                var7 = qe.a((byte) -40, var6_ref_String, false);
                                stackOut_190_0 = var7;
                                stackOut_190_1 = var3_int;
                                stackIn_198_0 = stackOut_190_0;
                                stackIn_198_1 = stackOut_190_1;
                                stackIn_191_0 = stackOut_190_0;
                                stackIn_191_1 = stackOut_190_1;
                                if (var9 != 0) {
                                  break L68;
                                } else {
                                  L76: {
                                    if (stackIn_191_0 > stackIn_191_1) {
                                      var3_int = var7;
                                      break L76;
                                    } else {
                                      break L76;
                                    }
                                  }
                                  var5++;
                                  if (var9 == 0) {
                                    continue L75;
                                  } else {
                                    break L69;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      dd.field_e = s.field_b - -var3_int + -(var3_int >> 1376987009);
                      od.field_r = -(var3_int >> 1007842369) + s.field_b;
                      stackOut_197_0 = ua.field_i.field_i;
                      stackOut_197_1 = nh.field_h + nh.field_f << -1047165823;
                      stackIn_198_0 = stackOut_197_0;
                      stackIn_198_1 = stackOut_197_1;
                      break L68;
                    }
                    fl.field_a = stackIn_198_0 * stackIn_198_1;
                    var4 = 0;
                    L77: while (true) {
                      stackOut_199_0 = ~var4;
                      stackOut_199_1 = stellarshard.field_L;
                      stackIn_200_0 = stackOut_199_0;
                      stackIn_200_1 = stackOut_199_1;
                      if (stackIn_200_0 <= ~stackIn_200_1.length) {
                        break L62;
                      } else {
                        stackOut_201_0 = fl.field_a;
                        stackOut_201_1 = sj.field_J[var4];
                        stackIn_212_0 = stackOut_201_0;
                        stackIn_212_1 = stackOut_201_1;
                        stackIn_202_0 = stackOut_201_0;
                        stackIn_202_1 = stackOut_201_1;
                        if (var9 != 0) {
                          break L61;
                        } else {
                          stackOut_202_0 = stackIn_202_0;
                          stackOut_202_1 = stackIn_202_1;
                          stackIn_204_0 = stackOut_202_0;
                          stackIn_204_1 = stackOut_202_1;
                          L78: {
                            stackOut_204_0 = stackIn_204_0;
                            stackIn_209_0 = stackOut_204_0;
                            stackIn_205_0 = stackOut_204_0;
                            if (stackIn_204_1 >= 0) {
                              stackOut_209_0 = stackIn_209_0;
                              stackOut_209_1 = na.field_a;
                              stackIn_210_0 = stackOut_209_0;
                              stackIn_210_1 = stackOut_209_1;
                              break L78;
                            } else {
                              stackOut_205_0 = stackIn_205_0;
                              stackIn_207_0 = stackOut_205_0;
                              stackOut_207_0 = stackIn_207_0;
                              stackOut_207_1 = l.field_e;
                              stackIn_210_0 = stackOut_207_0;
                              stackIn_210_1 = stackOut_207_1;
                              break L78;
                            }
                          }
                          fl.field_a = stackIn_210_0 + stackIn_210_1;
                          var4++;
                          if (var9 == 0) {
                            continue L77;
                          } else {
                            break L62;
                          }
                        }
                      }
                    }
                  }
                  stackOut_211_0 = -(fl.field_a >> -1909383359);
                  stackOut_211_1 = eh.field_g;
                  stackIn_212_0 = stackOut_211_0;
                  stackIn_212_1 = stackOut_211_1;
                  break L61;
                }
                rg.field_F = stackIn_212_0 + stackIn_212_1;
                stackOut_212_0 = stellarshard.field_L;
                stackIn_213_0 = stackOut_212_0;
                break L1;
              }
            }
            vl.field_o = new int[stackIn_213_0.length][];
            var4 = param2;
            var5 = rg.field_F;
            L79: while (true) {
              L80: {
                L81: {
                  if (var4 >= stellarshard.field_L.length) {
                    break L81;
                  } else {
                    var6 = sj.field_J[var4];
                    stackOut_215_0 = -1;
                    stackOut_215_1 = ~var6;
                    stackIn_223_0 = stackOut_215_0;
                    stackIn_223_1 = stackOut_215_1;
                    stackIn_216_0 = stackOut_215_0;
                    stackIn_216_1 = stackOut_215_1;
                    if (var9 != 0) {
                      break L80;
                    } else {
                      L82: {
                        L83: {
                          if (stackIn_216_0 >= stackIn_216_1) {
                            break L83;
                          } else {
                            var5 = var5 + l.field_e;
                            if (var9 == 0) {
                              break L82;
                            } else {
                              break L83;
                            }
                          }
                        }
                        var7 = qe.a((byte) -21, stellarshard.field_L[var4], true);
                        var5 = var5 + nh.field_f;
                        var8 = s.field_b - (var7 >> 649888929);
                        vl.field_o[var4] = new int[4];
                        vl.field_o[var4][0] = var8 - le.field_k;
                        vl.field_o[var4][1] = var5;
                        vl.field_o[var4][2] = var7 - -(le.field_k << -1219928895);
                        vl.field_o[var4][3] = na.field_a - -(nh.field_h << 2147056673);
                        var5 = var5 + (nh.field_f + ((nh.field_h << -2038768511) - -na.field_a));
                        break L82;
                      }
                      var4++;
                      if (var9 == 0) {
                        continue L79;
                      } else {
                        break L81;
                      }
                    }
                  }
                }
                stackOut_222_0 = rb.field_s;
                stackOut_222_1 = 2;
                stackIn_223_0 = stackOut_222_0;
                stackIn_223_1 = stackOut_222_1;
                break L80;
              }
              L84: {
                L85: {
                  if (stackIn_223_0 != stackIn_223_1) {
                    break L85;
                  } else {
                    ua.field_i.a(-1, -1, param1, false);
                    if (var9 == 0) {
                      break L84;
                    } else {
                      break L85;
                    }
                  }
                }
                ua.field_i.a(eb.a(eb.field_a, ni.field_e, -112), 0, param1, false);
                break L84;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var3, "qc.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(boolean param0, int param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                field_b = false;
                break L1;
              }
            }
            ed.a(-6313, param4, param3, ((qc) this).field_c, param1, param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var6, "qc.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static int a(int param0) {
        RuntimeException var1 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == 1) {
                break L1;
              } else {
                field_a = true;
                break L1;
              }
            }
            stackOut_3_0 = gj.field_t;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var1, "qc.A(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final static boolean a(int param0, char param1) {
        RuntimeException var2 = null;
        int stackIn_16_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_13_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == -1750942672) {
                break L1;
              } else {
                field_a = true;
                break L1;
              }
            }
            L2: {
              L3: {
                L4: {
                  if (param1 < 65) {
                    break L4;
                  } else {
                    if (90 >= param1) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  if (param1 < 97) {
                    break L5;
                  } else {
                    if (param1 > 122) {
                      break L5;
                    } else {
                      break L3;
                    }
                  }
                }
                stackOut_15_0 = 0;
                stackIn_16_0 = stackOut_15_0;
                break L2;
              }
              stackOut_13_0 = 1;
              stackIn_16_0 = stackOut_13_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var2, "qc.F(" + param0 + ',' + param1 + ')');
        }
        return stackIn_16_0 != 0;
    }

    qc(pb[] param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            ((qc) this).field_c = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("qc.<init>(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
    }

    final static void a(int param0, int param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, byte param12, int param13, int param14, int param15, int param16) {
        int var17_int = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        int stackIn_40_0 = 0;
        int stackIn_40_1 = 0;
        int stackIn_62_0 = 0;
        int stackIn_62_1 = 0;
        int stackOut_39_0 = 0;
        int stackOut_39_1 = 0;
        int stackOut_61_0 = 0;
        int stackOut_61_1 = 0;
        L0: {
          var42 = stellarshard.field_B;
          if (param7 < 0) {
            break L0;
          } else {
            if (cc.field_c > param9) {
              L1: {
                if (param5 >= 0) {
                  break L1;
                } else {
                  if (param16 >= 0) {
                    break L1;
                  } else {
                    if (param0 < 0) {
                      return;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              L2: {
                if (~param5 > ~cc.field_m) {
                  break L2;
                } else {
                  if (param16 < cc.field_m) {
                    break L2;
                  } else {
                    if (~param0 <= ~cc.field_m) {
                      return;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              L3: {
                if (param12 == 127) {
                  break L3;
                } else {
                  field_a = false;
                  break L3;
                }
              }
              L4: {
                L5: {
                  var34 = param7 - param9;
                  if (param9 != param10) {
                    break L5;
                  } else {
                    L6: {
                      L7: {
                        if (param9 == param7) {
                          break L7;
                        } else {
                          L8: {
                            L9: {
                              var35 = -param10 + param7;
                              if (param16 <= param5) {
                                break L9;
                              } else {
                                var26 = param14 << -2106991408;
                                var29 = param15 << -237426608;
                                var27 = (-param11 + param6 << 406224272) / var34;
                                var23 = (param4 - param13 << -473814064) / var34;
                                var21 = param13 << 848199536;
                                var20 = (-param16 + param0 << 317707536) / var35;
                                var28 = (-param14 + param6 << -572736656) / var35;
                                var19 = (-param5 + param0 << 789735696) / var34;
                                var30 = param3 << 586566864;
                                var18 = param16 << -293581360;
                                var17_int = param5 << -2118830672;
                                var22 = param8 << -1492632784;
                                var31 = (-param15 + param1 << -364333648) / var34;
                                var32 = (param1 + -param3 << 785398960) / var35;
                                var25 = param11 << 1787870576;
                                var24 = (-param8 + param4 << -1649838128) / var35;
                                if (var42 == 0) {
                                  break L8;
                                } else {
                                  break L9;
                                }
                              }
                            }
                            var25 = param14 << 29579632;
                            var27 = (param6 - param14 << -119128560) / var35;
                            var30 = param15 << 2116339216;
                            var20 = (param0 - param5 << -471082992) / var34;
                            var31 = (param1 + -param3 << -285502416) / var35;
                            var18 = param5 << 550808752;
                            var29 = param3 << -1279118768;
                            var23 = (param4 - param8 << 49015088) / var35;
                            var28 = (param6 - param11 << 552673584) / var34;
                            var19 = (-param16 + param0 << 1557465232) / var35;
                            var17_int = param16 << -521508656;
                            var32 = (-param15 + param1 << -375397616) / var34;
                            var22 = param13 << 1577431312;
                            var21 = param8 << 1198180528;
                            var24 = (param4 - param13 << -1690789424) / var34;
                            var26 = param11 << -1487466896;
                            break L8;
                          }
                          if (var42 == 0) {
                            break L6;
                          } else {
                            break L7;
                          }
                        }
                      }
                      var25 = param11;
                      var28 = 0;
                      var24 = 0;
                      var20 = 0;
                      var27 = 0;
                      var18 = param16 << 686300048;
                      var17_int = param5 << 1155782288;
                      var31 = 0;
                      var30 = param3;
                      var19 = 0;
                      var32 = 0;
                      var23 = 0;
                      var22 = param8;
                      var29 = param15;
                      var21 = param13;
                      var26 = param14;
                      break L6;
                    }
                    var33 = 0;
                    if (param9 >= 0) {
                      break L4;
                    } else {
                      param9 = Math.min(-param9, param10 + -param9);
                      var25 = var25 + var27 * param9;
                      var30 = var30 + param9 * var32;
                      var17_int = var17_int + param9 * var19;
                      var22 = var22 + var24 * param9;
                      var21 = var21 + param9 * var23;
                      var29 = var29 + var31 * param9;
                      var18 = var18 + param9 * var20;
                      var26 = var26 + param9 * var28;
                      param9 = 0;
                      if (var42 == 0) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                L10: {
                  L11: {
                    var18 = param5 << -115094736;
                    var17_int = param5 << -115094736;
                    var26 = param11 << -966312176;
                    var25 = param11 << -966312176;
                    var22 = param13 << 1547614320;
                    var21 = param13 << 1547614320;
                    var30 = param15 << -201912944;
                    var29 = param15 << -201912944;
                    var35 = param10 - param9;
                    var20 = (-param5 + param0 << -94475920) / var34;
                    var19 = (param16 + -param5 << 1429641040) / var35;
                    if (~var19 > ~var20) {
                      break L11;
                    } else {
                      var24 = (-param13 + param8 << -1529493808) / var35;
                      var32 = (-param15 + param3 << 2020555312) / var35;
                      var28 = (param14 - param11 << -917602448) / var35;
                      var31 = (-param15 + param1 << 423936784) / var34;
                      var27 = (-param11 + param6 << 1362168464) / var34;
                      var36 = var19;
                      var19 = var20;
                      var20 = var36;
                      var23 = (-param13 + param4 << 490510224) / var34;
                      var33 = 1;
                      if (var42 == 0) {
                        break L10;
                      } else {
                        break L11;
                      }
                    }
                  }
                  var27 = (param14 + -param11 << -755541680) / var35;
                  var33 = 0;
                  var23 = (param8 - param13 << -475864976) / var35;
                  var31 = (param3 - param15 << 465507504) / var35;
                  var32 = (-param15 + param1 << 896768272) / var34;
                  var28 = (param6 + -param11 << -627476624) / var34;
                  var24 = (param4 + -param13 << 923490864) / var34;
                  break L10;
                }
                L12: {
                  L13: {
                    L14: {
                      if (param9 < 0) {
                        L15: {
                          if (param10 < 0) {
                            break L15;
                          } else {
                            param9 = -param9;
                            var25 = var25 + var27 * param9;
                            var17_int = var17_int + param9 * var19;
                            var18 = var18 + param9 * var20;
                            var22 = var22 + var24 * param9;
                            var29 = var29 + param9 * var31;
                            var26 = var26 + param9 * var28;
                            var30 = var30 + var32 * param9;
                            var21 = var21 + param9 * var23;
                            param9 = 0;
                            if (var42 == 0) {
                              break L14;
                            } else {
                              break L15;
                            }
                          }
                        }
                        param9 = -param9 + param10;
                        var29 = var29 + var31 * param9;
                        var22 = var22 + param9 * var24;
                        var25 = var25 + var27 * param9;
                        var21 = var21 + var23 * param9;
                        var18 = var18 + param9 * var20;
                        var30 = var30 + var32 * param9;
                        var26 = var26 + param9 * var28;
                        var17_int = var17_int + param9 * var19;
                        param9 = param10;
                        if (var42 == 0) {
                          break L13;
                        } else {
                          break L14;
                        }
                      } else {
                        break L14;
                      }
                    }
                    var36 = cc.field_i[param9];
                    L16: while (true) {
                      if (~param10 >= ~param9) {
                        break L13;
                      } else {
                        var37 = var17_int >> -2075844688;
                        stackOut_39_0 = ~cc.field_m;
                        stackOut_39_1 = ~var37;
                        stackIn_62_0 = stackOut_39_0;
                        stackIn_62_1 = stackOut_39_1;
                        stackIn_40_0 = stackOut_39_0;
                        stackIn_40_1 = stackOut_39_1;
                        if (var42 != 0) {
                          break L12;
                        } else {
                          L17: {
                            if (stackIn_40_0 < stackIn_40_1) {
                              L18: {
                                var38 = (var18 >> -838533584) + -(var17_int >> -92806160);
                                if (var38 == 0) {
                                  break L18;
                                } else {
                                  L19: {
                                    var39 = (-var21 + var22) / var38;
                                    var40 = (-var25 + var26) / var38;
                                    var41 = (var30 + -var29) / var38;
                                    if (var37 - -var38 >= cc.field_m) {
                                      var38 = -1 + -var37 + cc.field_m;
                                      break L19;
                                    } else {
                                      break L19;
                                    }
                                  }
                                  L20: {
                                    L21: {
                                      if (var37 >= 0) {
                                        break L21;
                                      } else {
                                        vk.a(-(var37 * var40) + var25, var41, var29 - var41 * var37, var40, param2, (byte) 63, var36, var21 - var37 * var39, var37 + var38, var39);
                                        if (var42 == 0) {
                                          break L20;
                                        } else {
                                          break L21;
                                        }
                                      }
                                    }
                                    vk.a(var25, var41, var29, var40, param2, (byte) 71, var36 + var37, var21, var38, var39);
                                    break L20;
                                  }
                                  if (var42 == 0) {
                                    break L17;
                                  } else {
                                    break L18;
                                  }
                                }
                              }
                              if (var37 < 0) {
                                break L17;
                              } else {
                                if (var37 >= cc.field_m) {
                                  break L17;
                                } else {
                                  vk.a(var25, 0, var29, 0, param2, (byte) 96, var36 + var37, var21, var38, 0);
                                  break L17;
                                }
                              }
                            } else {
                              break L17;
                            }
                          }
                          param9++;
                          if (~cc.field_c >= ~param9) {
                            return;
                          } else {
                            var22 = var22 + var24;
                            var17_int = var17_int + var19;
                            var25 = var25 + var27;
                            var26 = var26 + var28;
                            var29 = var29 + var31;
                            var36 = var36 + ti.field_i;
                            var30 = var30 + var32;
                            var18 = var18 + var20;
                            var21 = var21 + var23;
                            if (var42 == 0) {
                              continue L16;
                            } else {
                              break L13;
                            }
                          }
                        }
                      }
                    }
                  }
                  var36 = -param10 + param7;
                  stackOut_61_0 = ~var36;
                  stackOut_61_1 = -1;
                  stackIn_62_0 = stackOut_61_0;
                  stackIn_62_1 = stackOut_61_1;
                  break L12;
                }
                L22: {
                  if (stackIn_62_0 == stackIn_62_1) {
                    break L22;
                  } else {
                    L23: {
                      L24: {
                        var37 = param0 << 1199163536;
                        var38 = param4 << -1998707632;
                        var39 = param6 << -331900112;
                        if (var33 == 0) {
                          break L24;
                        } else {
                          var22 = param8 << 1111685712;
                          var30 = param3 << 2118641008;
                          var18 = param16 << -1825383408;
                          var26 = param14 << 1480885040;
                          if (var42 == 0) {
                            break L23;
                          } else {
                            break L24;
                          }
                        }
                      }
                      var17_int = param16 << -1940582064;
                      var29 = param3 << 1295057008;
                      var21 = param8 << -1345078800;
                      var25 = param14 << -1750942672;
                      break L23;
                    }
                    var40 = param1 << -1358049712;
                    var31 = (var40 + -var29) / var36;
                    var23 = (-var21 + var38) / var36;
                    var24 = (-var22 + var38) / var36;
                    var20 = (var37 - var18) / var36;
                    var27 = (-var25 + var39) / var36;
                    var28 = (-var26 + var39) / var36;
                    var32 = (var40 - var30) / var36;
                    var19 = (-var17_int + var37) / var36;
                    if (var42 == 0) {
                      break L4;
                    } else {
                      break L22;
                    }
                  }
                }
                var23 = 0;
                var28 = 0;
                var31 = 0;
                var24 = 0;
                var32 = 0;
                var20 = 0;
                var27 = 0;
                var19 = 0;
                break L4;
              }
              L25: {
                if (0 > param9) {
                  param9 = -param9;
                  var21 = var21 + param9 * var23;
                  var25 = var25 + param9 * var27;
                  var26 = var26 + param9 * var28;
                  var22 = var22 + var24 * param9;
                  var17_int = var17_int + var19 * param9;
                  var29 = var29 + var31 * param9;
                  var18 = var18 + var20 * param9;
                  var30 = var30 + param9 * var32;
                  param9 = 0;
                  break L25;
                } else {
                  break L25;
                }
              }
              var35 = cc.field_i[param9];
              L26: while (true) {
                L27: {
                  L28: {
                    if (~param7 >= ~param9) {
                      break L28;
                    } else {
                      var36 = var17_int >> 167021616;
                      if (var42 != 0) {
                        break L27;
                      } else {
                        L29: {
                          if (~var36 <= ~cc.field_m) {
                            break L29;
                          } else {
                            L30: {
                              var37 = (var18 >> -191974224) + -(var17_int >> 182121744);
                              if (var37 != 0) {
                                break L30;
                              } else {
                                if (var36 < 0) {
                                  break L29;
                                } else {
                                  if (cc.field_m <= var36) {
                                    break L29;
                                  } else {
                                    vk.a(var25, 0, var29, 0, param2, (byte) 94, var36 - -var35, var21, var37, 0);
                                    if (var42 == 0) {
                                      break L29;
                                    } else {
                                      break L30;
                                    }
                                  }
                                }
                              }
                            }
                            L31: {
                              var38 = (var22 + -var21) / var37;
                              var39 = (-var25 + var26) / var37;
                              var40 = (var30 - var29) / var37;
                              if (~cc.field_m < ~(var37 + var36)) {
                                break L31;
                              } else {
                                var37 = -var36 + (cc.field_m - 1);
                                break L31;
                              }
                            }
                            L32: {
                              if (var36 < 0) {
                                break L32;
                              } else {
                                vk.a(var25, var40, var29, var39, param2, (byte) 77, var35 + var36, var21, var37, var38);
                                if (var42 == 0) {
                                  break L29;
                                } else {
                                  break L32;
                                }
                              }
                            }
                            vk.a(var25 - var39 * var36, var40, -(var40 * var36) + var29, var39, param2, (byte) 92, var35, -(var38 * var36) + var21, var37 - -var36, var38);
                            break L29;
                          }
                        }
                        param9++;
                        if (param9 < cc.field_c) {
                          var26 = var26 + var28;
                          var21 = var21 + var23;
                          var30 = var30 + var32;
                          var18 = var18 + var20;
                          var35 = var35 + ti.field_i;
                          var22 = var22 + var24;
                          var25 = var25 + var27;
                          var17_int = var17_int + var19;
                          var29 = var29 + var31;
                          if (var42 == 0) {
                            continue L26;
                          } else {
                            break L28;
                          }
                        } else {
                          return;
                        }
                      }
                    }
                  }
                  break L27;
                }
                return;
              }
            } else {
              break L0;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = false;
        field_a = false;
    }
}
